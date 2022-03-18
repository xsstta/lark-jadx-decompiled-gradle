package com.ss.android.lark.anonymous.plugin;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.suite.R;

public class ThreadAnonymityIdentityPlugin_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ThreadAnonymityIdentityPlugin f72220a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ThreadAnonymityIdentityPlugin threadAnonymityIdentityPlugin = this.f72220a;
        if (threadAnonymityIdentityPlugin != null) {
            this.f72220a = null;
            threadAnonymityIdentityPlugin.mLKUIVIdentityAvatar = null;
            threadAnonymityIdentityPlugin.mTVIdentityName = null;
            threadAnonymityIdentityPlugin.mArrowView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ThreadAnonymityIdentityPlugin_ViewBinding(ThreadAnonymityIdentityPlugin threadAnonymityIdentityPlugin, View view) {
        this.f72220a = threadAnonymityIdentityPlugin;
        threadAnonymityIdentityPlugin.mLKUIVIdentityAvatar = (LKUIRoundedImageView2) Utils.findRequiredViewAsType(view, R.id.avatar, "field 'mLKUIVIdentityAvatar'", LKUIRoundedImageView2.class);
        threadAnonymityIdentityPlugin.mTVIdentityName = (TextView) Utils.findRequiredViewAsType(view, R.id.name, "field 'mTVIdentityName'", TextView.class);
        threadAnonymityIdentityPlugin.mArrowView = (ImageView) Utils.findRequiredViewAsType(view, R.id.indicator, "field 'mArrowView'", ImageView.class);
    }
}
