package com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class TitlebarComponent_ViewBinding implements Unbinder {

    /* renamed from: a */
    private TitlebarComponent f86891a;

    @Override // butterknife.Unbinder
    public void unbind() {
        TitlebarComponent titlebarComponent = this.f86891a;
        if (titlebarComponent != null) {
            this.f86891a = null;
            titlebarComponent.mTitleRoot = null;
            titlebarComponent.mTitleBar = null;
            titlebarComponent.mFloatCancel = null;
            titlebarComponent.mBannerContainer = null;
            titlebarComponent.mTitlebarDivider = null;
            titlebarComponent.mTitleBarTabContent = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public TitlebarComponent_ViewBinding(TitlebarComponent titlebarComponent, View view) {
        this.f86891a = titlebarComponent;
        titlebarComponent.mTitleRoot = (ConstraintLayout) Utils.findRequiredViewAsType(view, R.id.title_root, "field 'mTitleRoot'", ConstraintLayout.class);
        titlebarComponent.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        titlebarComponent.mFloatCancel = Utils.findRequiredView(view, R.id.hide_back, "field 'mFloatCancel'");
        titlebarComponent.mBannerContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.chat_banner_container, "field 'mBannerContainer'", LinearLayout.class);
        titlebarComponent.mTitlebarDivider = Utils.findRequiredView(view, R.id.titlebar_divider, "field 'mTitlebarDivider'");
        titlebarComponent.mTitleBarTabContent = Utils.findRequiredView(view, R.id.tab_content, "field 'mTitleBarTabContent'");
    }
}
