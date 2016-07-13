package com.practice.googleplay.ui.fragment;

import android.view.View;

import com.practice.googleplay.ui.view.LoadingPage.ResultState;

/**
 * 应用
 * Created by 赖上罗小贱 on 2016/7/12.
 */
public class AppFragment extends BaseFragment {

	//只有成功才走此方法
	@Override
	public View onCreateSuccessView() {
		return null;
	}

	@Override
	public ResultState onLoad() {
		return ResultState.STATE_ERROR;
	}

}
