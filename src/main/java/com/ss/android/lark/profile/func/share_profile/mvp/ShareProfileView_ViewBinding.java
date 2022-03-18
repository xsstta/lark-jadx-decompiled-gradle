package com.ss.android.lark.profile.func.share_profile.mvp;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import net.lucode.hackware.magicindicator.MagicIndicator;

public class ShareProfileView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ShareProfileView f129957a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ShareProfileView shareProfileView = this.f129957a;
        if (shareProfileView != null) {
            this.f129957a = null;
            shareProfileView.mTitleBar = null;
            shareProfileView.mIndicator = null;
            shareProfileView.mShareContactProfileVP = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ShareProfileView_ViewBinding(ShareProfileView shareProfileView, View view) {
        this.f129957a = shareProfileView;
        shareProfileView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.share_contact_profile_title_bar, "field 'mTitleBar'", CommonTitleBar.class);
        shareProfileView.mIndicator = (MagicIndicator) Utils.findRequiredViewAsType(view, R.id.share_contact_profile_indicator, "field 'mIndicator'", MagicIndicator.class);
        shareProfileView.mShareContactProfileVP = (ViewPager) Utils.findRequiredViewAsType(view, R.id.share_contact_profile_vp, "field 'mShareContactProfileVP'", ViewPager.class);
    }
}
