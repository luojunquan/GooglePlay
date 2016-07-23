package com.practice.googleplay.ui.holder;

import android.view.View;
import android.widget.ImageView;

import com.lidroid.xutils.BitmapUtils;
import com.practice.googleplay.R;
import com.practice.googleplay.domain.AppInfo;
import com.practice.googleplay.http.HttpHelper;
import com.practice.googleplay.utils.BitmapHelper;
import com.practice.googleplay.utils.UIUtils;

import java.util.ArrayList;

/**
 * Created by 赖上罗小贱 on 2016/7/21.
 */
public class DetailPicsHolder extends BaseHolder<AppInfo>{
    private ImageView[] ivPics;
    private BitmapUtils mBitmapUtils;
    @Override
    public View initView() {
        View view = UIUtils.inflate(R.layout.layout_detail_picinfo);
        ivPics = new ImageView[5];
        ivPics[0] = (ImageView) view.findViewById(R.id.iv_pic1);
        ivPics[1] = (ImageView) view.findViewById(R.id.iv_pic2);
        ivPics[2] = (ImageView) view.findViewById(R.id.iv_pic3);
        ivPics[3] = (ImageView) view.findViewById(R.id.iv_pic4);
        ivPics[4] = (ImageView) view.findViewById(R.id.iv_pic5);
        mBitmapUtils = BitmapHelper.getBitmapUtils();
        return view;
    }

    @Override
    public void refreshView(AppInfo data) {
        final ArrayList<String> screen = data.screen;
        for (int i = 0;i < 5;i++){
            if (i < screen.size()){
                mBitmapUtils.display(ivPics[i], HttpHelper.URL + "image?name=" + screen.get(i));
            }else {
                ivPics[i].setVisibility(View.GONE);
            }
        }
    }
}
