
package com.kaku.colorfulnews.mvp.ui.activities;

import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.widget.TextView;

import com.kaku.colorfulnews.R;
import com.kaku.colorfulnews.mvp.ui.activities.base.BaseActivity;

import butterknife.BindView;


public class AboutActivity extends BaseActivity {


    @Override
    public int getLayoutId() {
        return R.layout.activity_about;
    }

    @Override
    public void initInjector() {

    }

    @Override
    public void initViews() {
//        mMsgTv.setAutoLinkMask(Linkify.ALL);
//        mMsgTv.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
