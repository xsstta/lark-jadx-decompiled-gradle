package com.ss.android.lark.mail.impl.settings.subsetting.autoreply;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.widget.time.MultiTimeContainer;

public class AutoReplyView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AutoReplyView f110429a;

    @Override // butterknife.Unbinder
    public void unbind() {
        AutoReplyView autoReplyView = this.f110429a;
        if (autoReplyView != null) {
            this.f110429a = null;
            autoReplyView.mAutoReplySwitch = null;
            autoReplyView.mDetailGroup = null;
            autoReplyView.mSendToTenant = null;
            autoReplyView.mTenantView = null;
            autoReplyView.mContentLayout = null;
            autoReplyView.mContentView = null;
            autoReplyView.mContentEditIcon = null;
            autoReplyView.mMultiTimeContainer = null;
            autoReplyView.mFragmentContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AutoReplyView_ViewBinding(AutoReplyView autoReplyView, View view) {
        this.f110429a = autoReplyView;
        autoReplyView.mAutoReplySwitch = (UDSwitch) Utils.findRequiredViewAsType(view, R.id.mail_ooo_switch, "field 'mAutoReplySwitch'", UDSwitch.class);
        autoReplyView.mDetailGroup = (Group) Utils.findRequiredViewAsType(view, R.id.mail_ooo_detail_container, "field 'mDetailGroup'", Group.class);
        autoReplyView.mSendToTenant = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.mail_ooo_tenant_radio, "field 'mSendToTenant'", UDCheckBox.class);
        autoReplyView.mTenantView = (TextView) Utils.findRequiredViewAsType(view, R.id.mail_ooo_tv_tenant_name, "field 'mTenantView'", TextView.class);
        autoReplyView.mContentLayout = Utils.findRequiredView(view, R.id.mail_ooo_message_ll, "field 'mContentLayout'");
        autoReplyView.mContentView = (TextView) Utils.findRequiredViewAsType(view, R.id.mail_ooo_message_text, "field 'mContentView'", TextView.class);
        autoReplyView.mContentEditIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.mail_ooo_mobile_edit_iv, "field 'mContentEditIcon'", ImageView.class);
        autoReplyView.mMultiTimeContainer = (MultiTimeContainer) Utils.findRequiredViewAsType(view, R.id.mail_time_zone_container, "field 'mMultiTimeContainer'", MultiTimeContainer.class);
        autoReplyView.mFragmentContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.mail_feature_fragment_container, "field 'mFragmentContainer'", FrameLayout.class);
    }
}
