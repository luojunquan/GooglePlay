package com.practice.googleplay.ui.fragment;

import android.view.View;

import com.practice.googleplay.ui.view.LoadingPage.ResultState;
import com.practice.googleplay.domain.AppInfo;
import com.practice.googleplay.http.protocol.AppProtocol;
import com.practice.googleplay.ui.adapter.MyBaseAdapter;
import com.practice.googleplay.ui.holder.AppHolder;
import com.practice.googleplay.ui.holder.BaseHolder;
import com.practice.googleplay.ui.view.MyListView;
import com.practice.googleplay.utils.UIUtils;

import java.util.ArrayList;

/**
 * 应用
 *
 */
public class AppFragment extends BaseFragment {

	private ArrayList<AppInfo> data;

	// 只有成功才走此方法
	@Override
	public View onCreateSuccessView() {
		MyListView view = new MyListView(UIUtils.getContext());
		view.setAdapter(new AppAdapter(data));
		return view;
	}

	@Override
	public ResultState onLoad() {
		AppProtocol protocol = new AppProtocol();
		//data = protocol.getData(0);
		data = protocol.getData(0);
		return check(data);
	}

	class AppAdapter extends MyBaseAdapter<AppInfo> {

		public AppAdapter(ArrayList<AppInfo> data) {
			super(data);
		}

		@Override
		public BaseHolder<AppInfo> getHolder() {
			return new AppHolder();
		}

		@Override
		public ArrayList<AppInfo> onLoadMore() {
			AppProtocol protocol = new AppProtocol();
			ArrayList<AppInfo> moreData = protocol.getData(getListSize());
			return moreData;
		}

	}

}
