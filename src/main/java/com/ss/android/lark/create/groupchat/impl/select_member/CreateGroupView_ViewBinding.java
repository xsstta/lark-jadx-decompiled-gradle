package com.ss.android.lark.create.groupchat.impl.select_member;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import net.lucode.hackware.magicindicator.MagicIndicator;

public class CreateGroupView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CreateGroupView f93851a;

    @Override // butterknife.Unbinder
    public void unbind() {
        CreateGroupView createGroupView = this.f93851a;
        if (createGroupView != null) {
            this.f93851a = null;
            createGroupView.mTitleBar = null;
            createGroupView.mMagicIndicator = null;
            createGroupView.mViewPager = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CreateGroupView_ViewBinding(CreateGroupView createGroupView, View view) {
        this.f93851a = createGroupView;
        createGroupView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        createGroupView.mMagicIndicator = (MagicIndicator) Utils.findRequiredViewAsType(view, R.id.indicator, "field 'mMagicIndicator'", MagicIndicator.class);
        createGroupView.mViewPager = (ViewPager) Utils.findRequiredViewAsType(view, R.id.group_vp, "field 'mViewPager'", ViewPager.class);
    }
}
