package com.ss.lark.android.avatar.ui;

import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.framework.ui.ViewPagerWithoutScroll;
import com.larksuite.suite.R;

public class AvatarPickView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AvatarPickView f162338a;

    @Override // butterknife.Unbinder
    public void unbind() {
        AvatarPickView avatarPickView = this.f162338a;
        if (avatarPickView != null) {
            this.f162338a = null;
            avatarPickView.mPhotoPagerFooterFL = null;
            avatarPickView.mMainVP = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AvatarPickView_ViewBinding(AvatarPickView avatarPickView, View view) {
        this.f162338a = avatarPickView;
        avatarPickView.mPhotoPagerFooterFL = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.photo_pager_footer, "field 'mPhotoPagerFooterFL'", ViewGroup.class);
        avatarPickView.mMainVP = (ViewPagerWithoutScroll) Utils.findRequiredViewAsType(view, R.id.photo_pager_content, "field 'mMainVP'", ViewPagerWithoutScroll.class);
    }
}
