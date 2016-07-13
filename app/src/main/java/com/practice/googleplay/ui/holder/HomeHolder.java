package com.practice.googleplay.ui.holder;

import android.view.View;
import android.widget.TextView;

import com.practice.googleplay.R;
import com.practice.googleplay.domain.AppInfo;
import com.practice.googleplay.utils.UIUtils;

/**
 * Created by 赖上罗小贱 on 2016/7/13.
 */
public class HomeHolder extends BaseHolder<AppInfo> {
    private TextView tvContent;
    @Override
    public View initView() {
        // 1. 加载布局
        View view = UIUtils.inflate(R.layout.list_item_home);
        // 2. 初始化控件
        tvContent = (TextView) view.findViewById(R.id.tv_content);
        return view;
    }

    @Override
    public void refreshView(AppInfo data) {
        tvContent.setText(data.name);
    }
}
