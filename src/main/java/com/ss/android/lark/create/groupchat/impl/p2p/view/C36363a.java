package com.ss.android.lark.create.groupchat.impl.p2p.view;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.create.groupchat.CreateGroupChatModule;
import com.ss.android.lark.create.groupchat.impl.p2p.view.GroupChatStructureBaseView;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.create.groupchat.impl.p2p.view.a */
public class C36363a extends GroupChatStructureBaseView {

    /* renamed from: e */
    TextView f93827e;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.mChatterPicker.mo183601l();
    }

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.view.GroupChatStructureBaseView
    /* renamed from: i */
    public void mo134149i() {
        this.mConfirmBT.setBackgroundResource(R.drawable.common_corner3dp_color_c12);
        this.mConfirmBT.setClickable(false);
    }

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.view.GroupChatStructureBaseView
    /* renamed from: h */
    public void mo134148h() {
        int i;
        CommonTitleBar commonTitleBar = this.mTitleBar;
        if (this.f93818a) {
            i = R.string.Lark_Legacy_CreategroupTitle;
        } else {
            i = R.string.Lark_Legacy_ChooseContact;
        }
        commonTitleBar.setTitle(i);
    }

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.view.GroupChatStructureBaseView
    /* renamed from: j */
    public void mo134150j() {
        int i = 0;
        TextView textView = (TextView) this.mTitleBar.addAction(new IActionTitlebar.TextAction(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_GroupSettingSelectedNumber, "number", Integer.toString(0))) {
            /* class com.ss.android.lark.create.groupchat.impl.p2p.view.C36363a.C363641 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                C36363a.this.f93819b.mo134125d();
            }
        });
        this.f93827e = textView;
        textView.setTextColor(UIHelper.getColor(R.color.function_info_300));
        this.f93827e.setTextSize(16.0f);
        if (DesktopUtil.m144307b()) {
            this.f93827e.setVisibility(8);
        } else {
            this.f93827e.setVisibility(0);
        }
        this.mSelectCountTV.setVisibility(8);
        View view = this.mSyncMsgLL;
        if (this.f93818a) {
            i = 8;
        }
        view.setVisibility(i);
        this.mSyncMsgCB.setChecked(!this.f93818a);
        this.mSyncMsgLL.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.create.groupchat.impl.p2p.view.$$Lambda$a$bcMYSjliCLSc3tqbxLbksRx_w */

            public final void onClick(View view) {
                C36363a.m270516lambda$bcMYSjliCLSc3tqbxLbksRx_w(C36363a.this, view);
            }
        });
        this.mSyncMsgCB.setOnCheckedChangeListener(new UDCheckBox.OnCheckedChangeListener() {
            /* class com.ss.android.lark.create.groupchat.impl.p2p.view.$$Lambda$a$mxLoGAyZ2FSBLUpnf9D206YPpY */

            @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.OnCheckedChangeListener
            public final void onCheckedChanged(UDCheckBox uDCheckBox, boolean z) {
                C36363a.m270517lambda$mxLoGAyZ2FSBLUpnf9D206YPpY(C36363a.this, uDCheckBox, z);
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m143330a(View view) {
        this.mSyncMsgCB.setChecked(!this.mSyncMsgCB.isChecked());
    }

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36351b
    /* renamed from: a */
    public void mo134110a(List<SearchBaseInfo> list) {
        this.mChatterPicker.mo183573b(list);
    }

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36351b
    /* renamed from: a */
    public void mo134108a(int i) {
        if (this.mP2pBuildGroupTipTV.getVisibility() == 0 && i != 0) {
            CreateGroupChatModule.getDependency().getGuideDependency().mo133740a("mobile_sync_message", true);
        }
        if (this.mP2pBuildGroupTipTV.getVisibility() != i) {
            this.mP2pBuildGroupTipTV.setVisibility(i);
        }
    }

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36351b
    /* renamed from: a */
    public void mo134111a(Map<String, SearchBaseInfo> map) {
        String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_GroupSettingSelectedNumber, "number", Integer.toString(map.size()));
        if (map.size() == 0) {
            this.mConfirmBT.setBackgroundResource(R.drawable.common_corner3dp_color_c12);
            this.mConfirmBT.setClickable(false);
            this.f93827e.setTextColor(UIHelper.getColor(R.color.function_info_300));
        } else {
            this.mConfirmBT.setBackgroundResource(R.drawable.group_chat_select_bg_selector);
            this.mConfirmBT.setClickable(true);
            this.f93827e.setTextColor(UIHelper.getColor(R.color.function_info_500));
        }
        this.f93827e.setText(mustacheFormat);
    }

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36351b
    /* renamed from: a */
    public void mo134112a(boolean z) {
        int i;
        if (this.mSyncMsgLL != null) {
            View view = this.mSyncMsgLL;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            this.mSyncMsgCB.setChecked(z);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m143331a(UDCheckBox uDCheckBox, boolean z) {
        mo134108a(8);
    }

    public C36363a(Activity activity, GroupChatStructureBaseView.AbstractC36362a aVar, boolean z) {
        super(activity, aVar, z);
    }
}
