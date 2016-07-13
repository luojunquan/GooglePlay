package com.practice.googleplay.ui.fragment;

import android.view.View;

import com.practice.googleplay.ui.view.LoadingPage.ResultState;

/**
 * 排行
 * Created by 赖上罗小贱 on 2016/7/12.
 */
public class HotFragment extends BaseFragment {

	@Override
	public View onCreateSuccessView() {
		return null;
	}

	@Override
	public ResultState onLoad() {
		return ResultState.STATE_SUCCESS;
	}

}
