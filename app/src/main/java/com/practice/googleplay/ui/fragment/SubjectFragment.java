package com.practice.googleplay.ui.fragment;

import android.view.View;

import com.practice.googleplay.ui.view.LoadingPage.ResultState;
import com.practice.googleplay.domain.SubjectInfo;
import com.practice.googleplay.http.protocol.SubjectProtocol;
import com.practice.googleplay.ui.adapter.MyBaseAdapter;
import com.practice.googleplay.ui.holder.BaseHolder;
import com.practice.googleplay.ui.holder.SubjectHolder;
import com.practice.googleplay.ui.view.MyListView;
import com.practice.googleplay.utils.UIUtils;

import java.util.ArrayList;

/**
 * 专题
 *
 */
public class SubjectFragment extends BaseFragment {

	private ArrayList<SubjectInfo> data;

	@Override
	public View onCreateSuccessView() {
		MyListView view = new MyListView(UIUtils.getContext());
		view.setAdapter(new SubjectAdapter(data));
		return view;
	}

	@Override
	public ResultState onLoad() {
		SubjectProtocol protocol = new SubjectProtocol();
		data = protocol.getData(0);
		return check(data);
	}

	class SubjectAdapter extends MyBaseAdapter<SubjectInfo> {

		public SubjectAdapter(ArrayList<SubjectInfo> data) {
			super(data);
		}

		@Override
		public BaseHolder<SubjectInfo> getHolder() {
			return new SubjectHolder();
		}

		@Override
		public ArrayList<SubjectInfo> onLoadMore() {
			SubjectProtocol protocol = new SubjectProtocol();
			ArrayList<SubjectInfo> moreData = protocol.getData(getListSize());
			return moreData;
		}

	}
}
