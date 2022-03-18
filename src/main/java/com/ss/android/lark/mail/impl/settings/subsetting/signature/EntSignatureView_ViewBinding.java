package com.ss.android.lark.mail.impl.settings.subsetting.signature;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.emptystate.UDEmptyState;
import com.larksuite.component.universe_design.notice.UDNotice;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;

public class EntSignatureView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private EntSignatureView f110565a;

    @Override // butterknife.Unbinder
    public void unbind() {
        EntSignatureView entSignatureView = this.f110565a;
        if (entSignatureView != null) {
            this.f110565a = null;
            entSignatureView.mTitleBar = null;
            entSignatureView.mEmptyState = null;
            entSignatureView.mNotice = null;
            entSignatureView.mLoadingLayout = null;
            entSignatureView.mTabLayout = null;
            entSignatureView.mSignatureSettingRv = null;
            entSignatureView.mPCContentBg = null;
            entSignatureView.mWebContainer = null;
            entSignatureView.mContentLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public EntSignatureView_ViewBinding(EntSignatureView entSignatureView, View view) {
        this.f110565a = entSignatureView;
        entSignatureView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.ent_signature_title_bar, "field 'mTitleBar'", CommonTitleBar.class);
        entSignatureView.mEmptyState = (UDEmptyState) Utils.findRequiredViewAsType(view, R.id.ent_signature_empty_state, "field 'mEmptyState'", UDEmptyState.class);
        entSignatureView.mNotice = (UDNotice) Utils.findRequiredViewAsType(view, R.id.force_signature_notice, "field 'mNotice'", UDNotice.class);
        entSignatureView.mLoadingLayout = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.ent_signature_loading_layout, "field 'mLoadingLayout'", FrameLayout.class);
        entSignatureView.mTabLayout = (UDTabLayout) Utils.findRequiredViewAsType(view, R.id.ent_signature_tab_layout, "field 'mTabLayout'", UDTabLayout.class);
        entSignatureView.mSignatureSettingRv = (CommonRecyclerView) Utils.findRequiredViewAsType(view, R.id.ent_signature_setting_rv, "field 'mSignatureSettingRv'", CommonRecyclerView.class);
        entSignatureView.mPCContentBg = (ScrollView) Utils.findRequiredViewAsType(view, R.id.ent_sign_sv, "field 'mPCContentBg'", ScrollView.class);
        entSignatureView.mWebContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.mail_web_container, "field 'mWebContainer'", LinearLayout.class);
        entSignatureView.mContentLayout = (ConstraintLayout) Utils.findRequiredViewAsType(view, R.id.ent_signature_content_layout, "field 'mContentLayout'", ConstraintLayout.class);
    }
}
