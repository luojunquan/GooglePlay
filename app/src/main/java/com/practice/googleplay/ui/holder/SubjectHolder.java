package com.practice.googleplay.ui.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.practice.googleplay.utils.BitmapHelper;
import com.lidroid.xutils.BitmapUtils;
import com.practice.googleplay.R;
import com.practice.googleplay.domain.SubjectInfo;
import com.practice.googleplay.http.HttpHelper;
import com.practice.googleplay.utils.UIUtils;

/**
 * 专题holder
 *
 */
public class SubjectHolder extends BaseHolder<SubjectInfo> {

	private ImageView ivPic;
	private TextView tvTitle;

	private BitmapUtils mBitmapUtils;

	@Override
	public View initView() {
		View view = UIUtils.inflate(R.layout.list_item_subject);
		ivPic = (ImageView) view.findViewById(R.id.iv_pic);
		tvTitle = (TextView) view.findViewById(R.id.tv_title);

		mBitmapUtils = BitmapHelper.getBitmapUtils();

		return view;
	}

	@Override
	public void refreshView(SubjectInfo data) {
		tvTitle.setText(data.des);
		mBitmapUtils.display(ivPic, HttpHelper.URL + "image?name=" + data.url);
	}

}
