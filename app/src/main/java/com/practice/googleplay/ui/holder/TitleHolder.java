package com.practice.googleplay.ui.holder;

import android.view.View;
import android.widget.TextView;

import com.practice.googleplay.R;
import com.practice.googleplay.domain.CategoryInfo;
import com.practice.googleplay.utils.UIUtils;

/**
 * 分类模块标题
 * Created by 赖上罗小贱 on 2016/7/18.
 */
public class TitleHolder extends BaseHolder<CategoryInfo>{
    private TextView tvTitle;
    @Override
    public View initView() {
        View view = UIUtils.inflate(R.layout.list_item_title);
        tvTitle = (TextView) view.findViewById(R.id.tv_title);
        return view;
    }

    @Override
    public void refreshView(CategoryInfo data) {
        tvTitle.setText(data.title);
    }
}
