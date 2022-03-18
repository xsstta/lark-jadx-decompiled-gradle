package com.ss.lark.android.avatar.ui;

import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.framework.ui.ViewPagerWithoutScroll;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class AvatarPreviewView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AvatarPreviewView f162371a;

    @Override // butterknife.Unbinder
    public void unbind() {
        AvatarPreviewView avatarPreviewView = this.f162371a;
        if (avatarPreviewView != null) {
            this.f162371a = null;
            avatarPreviewView.mPhotoPagerFooterFL = null;
            avatarPreviewView.mMainVP = null;
            avatarPreviewView.mTitleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AvatarPreviewView_ViewBinding(AvatarPreviewView avatarPreviewView, View view) {
        this.f162371a = avatarPreviewView;
        avatarPreviewView.mPhotoPagerFooterFL = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.photo_pager_footer, "field 'mPhotoPagerFooterFL'", ViewGroup.class);
        avatarPreviewView.mMainVP = (ViewPagerWithoutScroll) Utils.findRequiredViewAsType(view, R.id.photo_pager_content, "field 'mMainVP'", ViewPagerWithoutScroll.class);
        avatarPreviewView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
    }
}
