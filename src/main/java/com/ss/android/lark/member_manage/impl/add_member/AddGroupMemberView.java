package com.ss.android.lark.member_manage.impl.add_member;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentManager;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract;
import com.ss.android.lark.member_manage.impl.statistics.GroupMemberManageExtraParams;
import com.ss.android.lark.member_manage.impl.statistics.GroupMemberManageHitPointNew;
import com.ss.android.lark.search.widget.BasePicker;
import com.ss.android.lark.search.widget.ChatterPicker;
import com.ss.android.lark.search.widget.constants.PickerUseCategory;
import com.ss.android.lark.search.widget.constants.PickerUsePage;
import com.ss.android.lark.search.widget.params.ChatterPickerParams;
import com.ss.android.lark.search.widget.reporter.PickerReporterDelegate;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.searchcommon.view.SearchResultView;
import com.ss.android.lark.statistics.extensions.TARGET_NONE;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AddGroupMemberView implements IAddGroupMemberContract.IView {

    /* renamed from: a */
    protected IAddGroupMemberContract.IView.AbstractC44928a f113749a;

    /* renamed from: b */
    protected AbstractC44927a f113750b;

    /* renamed from: c */
    protected Activity f113751c;

    /* renamed from: d */
    boolean f113752d;

    /* renamed from: e */
    volatile boolean f113753e;

    /* renamed from: f */
    protected IGroupMemberManageModuleDependency.AbstractC44883f f113754f = GroupMemberManageModule.m177902a().getContactDependency();

    /* renamed from: g */
    public String f113755g;

    /* renamed from: h */
    private final boolean f113756h;

    /* renamed from: i */
    private boolean f113757i;
    protected RelativeLayout mBottomDetailRL;
    protected ChatterPicker mChatterPicker;
    TextView mConfirmBT;
    TextView mSelectCountTV;
    protected CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.member_manage.impl.add_member.AddGroupMemberView$a */
    public interface AbstractC44927a {
        /* renamed from: a */
        void mo158988a();

        /* renamed from: a */
        void mo158989a(int i, Intent intent);

        /* renamed from: a */
        void mo158990a(Intent intent, int i);

        /* renamed from: a */
        void mo158991a(IAddGroupMemberContract.IView iView);

        /* renamed from: a */
        void mo158992a(List<SearchBaseInfo> list);

        /* renamed from: b */
        FragmentManager mo158993b();

        /* renamed from: c */
        void mo158994c();
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.IView
    /* renamed from: a */
    public void mo158969a(String str) {
        this.f113755g = str;
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.IView
    /* renamed from: a */
    public void mo158970a(Map<String, SearchBaseInfo> map) {
        this.mSelectCountTV.setText(m178078a(new ArrayList(map.values())));
        m178090d(map);
        m178095i(map);
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.IView
    /* renamed from: a */
    public void mo158971a(boolean z, String str) {
        m178080a(this.f113751c, z, str);
        GroupMemberManageHitPointNew.m179745a(false);
        this.mConfirmBT.setEnabled(true);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.mChatterPicker.mo183601l();
    }

    /* renamed from: g */
    public void mo158980g() {
        this.mConfirmBT.setEnabled(false);
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.IView
    /* renamed from: j */
    public void mo158983j() {
        this.mConfirmBT.setEnabled(true);
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.IView
    /* renamed from: k */
    public int mo158984k() {
        return this.mChatterPicker.getFragmentType();
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.IView
    /* renamed from: l */
    public String mo158985l() {
        return this.mChatterPicker.getQuery();
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.IView
    /* renamed from: m */
    public Department mo158986m() {
        return this.mChatterPicker.getCurDepartment();
    }

    /* renamed from: p */
    private int m178097p() {
        if (mo158976c()) {
            return R.string.Lark_Group_SearchContactsDepartmentsMyGroups;
        }
        return R.string.Lark_Legacy_Search;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f113750b.mo158991a(this);
        mo158967a();
        GroupMemberManageHitPointNew.m179743a();
    }

    /* renamed from: f */
    public void mo158979f() {
        this.mSelectCountTV.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.member_manage.impl.add_member.$$Lambda$AddGroupMemberView$Ii_XRBTsHTpN3MX5ChqsmCvySzo */

            public final void onClick(View view) {
                AddGroupMemberView.lambda$Ii_XRBTsHTpN3MX5ChqsmCvySzo(AddGroupMemberView.this, view);
            }
        });
    }

    /* renamed from: i */
    public boolean mo158982i() {
        return GroupMemberManageModule.m177902a().isCheckSecretPermission();
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.IView
    /* renamed from: n */
    public void mo158987n() {
        if (this.mChatterPicker.mo183501f()) {
            this.f113751c.finish();
        }
    }

    /* renamed from: q */
    private void m178098q() {
        this.mConfirmBT.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.member_manage.impl.add_member.AddGroupMemberView.C449265 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                AddGroupMemberView.this.mConfirmBT.setEnabled(false);
                AddGroupMemberView.this.f113750b.mo158994c();
                AddGroupMemberView.this.mo158981h();
            }
        });
        this.mConfirmBT.setBackgroundResource(R.drawable.group_chat_photo_send_bg_selector);
        mo158980g();
    }

    /* renamed from: c */
    public boolean mo158976c() {
        return !this.f113749a.mo159009h();
    }

    /* renamed from: d */
    public ChatterPickerParams mo158977d() {
        return mo158966a(new ChatterPickerParams.Builder().mo183676h(true).mo183663b(this.f113755g)).mo183675g();
    }

    /* renamed from: o */
    private void m178096o() {
        if (!this.f113756h) {
            this.mTitleBar.setVisibility(8);
            return;
        }
        this.mTitleBar.setLeftTextOnly(CommonTitleBarConstants.Lark_Legacy_Cancel);
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.member_manage.impl.add_member.$$Lambda$AddGroupMemberView$ng_MGRdGDfd98c34V3VCY6DDVg */

            public final void onClick(View view) {
                AddGroupMemberView.this.m178088b((AddGroupMemberView) view);
            }
        });
        this.mTitleBar.setTitle(R.string.Lark_Legacy_ChooseContact);
    }

    /* renamed from: b */
    public void mo158972b() {
        ((ChatterPicker) mo158978e().mo183562a(PickerUseCategory.GROUP)).mo183483a();
        this.mChatterPicker.mo183573b(new ArrayList(this.f113749a.mo159015n().values()));
    }

    /* renamed from: h */
    public void mo158981h() {
        if (this.f113753e && !this.f113749a.mo159016o()) {
            m178079a(R.string.Lark_Group_CreateConnectGroup, R.string.Lark_Group_CreateConnectGroupBasedOnExistingGroupDialogContent, R.string.Lark_Group_NewConnectGroup);
        } else if (!this.f113752d || this.f113749a.mo159006e()) {
            this.f113749a.mo159001b();
        } else {
            m178079a(R.string.Lark_Chat_CreateExternalGroup, R.string.Lark_Chat_CreateExternalGroupTips, R.string.Lark_Chat_AddExternalMembersAlert);
        }
        GroupMemberManageHitPointNew.m179744a(GroupMemberManageExtraParams.Click.CONFIRM.plus(GroupMemberManageExtraParams.Target.IM_CHAT_SETTING_VIEW));
    }

    /* renamed from: e */
    public ChatterPicker mo158978e() {
        boolean z = false;
        ChatterPicker chatterPicker = (ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) this.mChatterPicker.mo183563a(PickerUsePage.GROUP_ADD_MEMBER_AND_SEND_PROFILE)).mo183604p(true)).mo183561a(new BasePicker.OnPickerParamsLoader() {
            /* class com.ss.android.lark.member_manage.impl.add_member.$$Lambda$lmT8clB8XCffODvcceCQhGL0xA */

            @Override // com.ss.android.lark.search.widget.BasePicker.OnPickerParamsLoader
            public final Object onLoadPickerParams() {
                return AddGroupMemberView.this.mo158977d();
            }
        })).mo183494c(mo158976c())).mo183565a(new SearchResultView.IOnBusinessConsumeItem() {
            /* class com.ss.android.lark.member_manage.impl.add_member.AddGroupMemberView.C449254 */

            /* renamed from: c */
            private boolean m178128c(SearchBaseInfo searchBaseInfo) {
                boolean z = false;
                if (!(searchBaseInfo instanceof SearchChatterInfo)) {
                    return false;
                }
                SearchChatterInfo searchChatterInfo = (SearchChatterInfo) searchBaseInfo;
                List<String> inChatIds = searchChatterInfo.getInChatIds();
                if (inChatIds != null) {
                    z = inChatIds.contains(AddGroupMemberView.this.f113755g);
                }
                return z | searchChatterInfo.isInChat();
            }

            /* renamed from: a */
            private boolean m178127a(SearchChatterInfo searchChatterInfo) {
                if (AddGroupMemberView.this.f113749a.mo159000a(searchChatterInfo.getDeniedReason()) || AddGroupMemberView.this.f113749a.mo159003b(searchChatterInfo.getDeniedReason())) {
                    return true;
                }
                return false;
            }

            @Override // com.ss.android.lark.searchcommon.view.SearchResultView.IOnBusinessConsumeItem
            /* renamed from: a */
            public SearchResultView.CheckBoxBindStatus mo110048a(SearchBaseInfo searchBaseInfo) {
                if (m178128c(searchBaseInfo)) {
                    return new SearchResultView.CheckBoxBindStatus(true, true, false);
                }
                if (searchBaseInfo instanceof SearchChatterInfo) {
                    return new SearchResultView.CheckBoxBindStatus(m178127a((SearchChatterInfo) searchBaseInfo), false, false);
                }
                return new SearchResultView.CheckBoxBindStatus(false, true, true);
            }

            @Override // com.ss.android.lark.searchcommon.view.SearchResultView.IOnBusinessConsumeItem
            /* renamed from: b */
            public boolean mo110049b(SearchBaseInfo searchBaseInfo) {
                if (m178128c(searchBaseInfo)) {
                    return true;
                }
                if (!(searchBaseInfo instanceof SearchChatterInfo)) {
                    return false;
                }
                SearchChatterInfo searchChatterInfo = (SearchChatterInfo) searchBaseInfo;
                boolean a = AddGroupMemberView.this.f113749a.mo159000a(searchChatterInfo.getDeniedReason());
                boolean b = AddGroupMemberView.this.f113749a.mo159003b(searchChatterInfo.getDeniedReason());
                if (a) {
                    UDToast.show(AddGroupMemberView.this.f113751c, (int) R.string.Lark_Contacts_CantAddExternalContactNoExternalCommunicationPermission);
                } else if (b) {
                    UDToast.show(AddGroupMemberView.this.f113751c, (int) R.string.Lark_Contacts_CantAddUserExternalGroupMemberNoExternalCommunicationPermission);
                }
                if (a || b) {
                    return true;
                }
                return false;
            }
        })).mo183559a(new BasePicker.IOnPickNotify() {
            /* class com.ss.android.lark.member_manage.impl.add_member.AddGroupMemberView.C449243 */

            @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
            /* renamed from: a */
            public void mo110050a(String str, SearchBaseInfo searchBaseInfo) {
                AddGroupMemberView.this.f113749a.mo158997a(str, searchBaseInfo);
            }

            @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
            /* renamed from: b */
            public void mo110052b(String str, SearchBaseInfo searchBaseInfo) {
                AddGroupMemberView.this.f113749a.mo159002b(str, searchBaseInfo);
            }

            @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
            /* renamed from: a */
            public void mo110051a(List<String> list, List<SearchBaseInfo> list2) {
                AddGroupMemberView.this.f113749a.mo158998a(list, list2);
            }
        })).mo183480a(this.f113749a.mo159013l())).mo183492b(false);
        if (mo158976c() && !this.f113749a.mo159010i()) {
            z = true;
        }
        return (ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) chatterPicker.mo183513i(z).mo183570b(m178097p())).mo183496d(true)).mo183491b(this.f113749a.mo159014m())).mo183560a(new BasePicker.IViewDependency() {
            /* class com.ss.android.lark.member_manage.impl.add_member.AddGroupMemberView.C449232 */

            @Override // com.ss.android.lark.search.widget.BasePicker.IViewDependency
            /* renamed from: b */
            public Activity mo110056b() {
                return AddGroupMemberView.this.f113751c;
            }

            @Override // com.ss.android.lark.search.widget.BasePicker.IViewDependency
            /* renamed from: c */
            public FragmentManager mo110057c() {
                return AddGroupMemberView.this.f113750b.mo158993b();
            }
        })).mo183564a(new PickerReporterDelegate() {
            /* class com.ss.android.lark.member_manage.impl.add_member.AddGroupMemberView.C449221 */

            @Override // com.ss.android.lark.search.widget.reporter.PickerReporterDelegate
            /* renamed from: a */
            public void mo132343a() {
                AddGroupMemberView.this.f113749a.mo159005d();
            }
        })).mo183518n(this.f113757i);
    }

    /* renamed from: a */
    public void mo158967a() {
        m178096o();
        mo158972b();
        m178098q();
        mo158979f();
    }

    /* renamed from: a */
    public void setViewDelegate(IAddGroupMemberContract.IView.AbstractC44928a aVar) {
        this.f113749a = aVar;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m178083a(View view) {
        this.f113749a.mo159004c();
    }

    /* renamed from: b */
    private /* synthetic */ void m178088b(View view) {
        this.f113749a.mo158995a();
    }

    /* renamed from: d */
    private void m178090d(Map<String, SearchBaseInfo> map) {
        m178092f(map);
        m178091e(map);
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.IView
    /* renamed from: c */
    public void mo158975c(String str) {
        UDToast.show(this.f113751c, str);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m178081a(DialogInterface dialogInterface) {
        TextView textView = this.mConfirmBT;
        if (textView != null) {
            textView.setEnabled(true);
        }
    }

    /* renamed from: b */
    private /* synthetic */ void m178086b(DialogInterface dialogInterface) {
        TextView textView = this.mConfirmBT;
        if (textView != null) {
            textView.setEnabled(true);
        }
    }

    /* access modifiers changed from: public */
    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m178095i(Map<String, SearchBaseInfo> map) {
        this.mConfirmBT.setEnabled(!map.isEmpty());
    }

    /* renamed from: e */
    private void m178091e(Map<String, SearchBaseInfo> map) {
        for (Map.Entry<String, SearchBaseInfo> entry : map.entrySet()) {
            SearchBaseInfo value = entry.getValue();
            if ((value instanceof SearchChatterInfo) && ((SearchChatterInfo) value).isCrossTenant()) {
                this.f113752d = true;
                return;
            }
        }
        this.f113752d = false;
    }

    /* renamed from: f */
    private synchronized void m178092f(Map<String, SearchBaseInfo> map) {
        if (map != null) {
            if (!map.isEmpty()) {
                this.mConfirmBT.setEnabled(false);
                CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(map) {
                    /* class com.ss.android.lark.member_manage.impl.add_member.$$Lambda$AddGroupMemberView$wtTI6R8DdL1cif4_J0KA2Wpew */
                    public final /* synthetic */ Map f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        AddGroupMemberView.this.m178094h(this.f$1);
                    }
                });
                return;
            }
        }
        this.f113753e = false;
    }

    /* renamed from: g */
    private Set<String> m178093g(Map<String, SearchBaseInfo> map) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<String, SearchBaseInfo> entry : map.entrySet()) {
            if (entry.getValue() instanceof SearchChatterInfo) {
                linkedHashSet.add(((SearchChatterInfo) entry.getValue()).getTenantId());
            }
        }
        return linkedHashSet;
    }

    /* renamed from: h */
    private /* synthetic */ void m178094h(Map map) {
        this.f113753e = GroupMemberManageModule.m177902a().getAccountDependency().mo143794a(new ArrayList(m178093g(map)));
        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable(map) {
            /* class com.ss.android.lark.member_manage.impl.add_member.$$Lambda$AddGroupMemberView$9jvfvMx56W5eo1EkR5nQhhHNc */
            public final /* synthetic */ Map f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                AddGroupMemberView.m270803lambda$9jvfvMx56W5eo1EkR5nQhhHNc(AddGroupMemberView.this, this.f$1);
            }
        });
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.IView
    /* renamed from: b */
    public void mo158973b(String str) {
        UDToast.show(this.f113751c, str);
        this.mConfirmBT.setEnabled(true);
    }

    /* renamed from: a */
    private String m178078a(List<SearchBaseInfo> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(UIHelper.getString(R.string.Lark_Groups_MobileYouveSelected));
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (SearchBaseInfo searchBaseInfo : list) {
            if (searchBaseInfo.getType() == 1) {
                i++;
            }
            if (searchBaseInfo.getType() == 2) {
                i2++;
            }
            if (searchBaseInfo.getType() == 17) {
                i3++;
            }
        }
        if (i > 0) {
            String quantityString = UIHelper.getQuantityString(R.plurals.Lark_Groups_MobileSelectedCountMembers, i);
            sb.append(" ");
            sb.append(quantityString);
        }
        if (i2 > 0) {
            String quantityString2 = UIHelper.getQuantityString(R.plurals.Lark_Legacy_NumberChats, i2);
            sb.append(" ");
            sb.append(quantityString2);
        }
        if (i3 > 0) {
            String quantityString3 = UIHelper.getQuantityString(R.plurals.Lark_Legacy_NumberOrganizations, i3);
            sb.append(" ");
            sb.append(quantityString3);
        }
        if (i2 == 0 && i == 0 && i3 == 0) {
            String quantityString4 = UIHelper.getQuantityString(R.plurals.Lark_Groups_MobileSelectedCountMembers, 0);
            sb.append(" ");
            sb.append(quantityString4);
        }
        return sb.toString();
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.IView
    /* renamed from: b */
    public void mo158974b(Map<String, SearchBaseInfo> map) {
        this.mChatterPicker.mo183573b(new ArrayList(map.values()));
    }

    /* renamed from: a */
    public ChatterPickerParams.Builder mo158966a(ChatterPickerParams.Builder aVar) {
        return aVar.mo183668d(!this.f113749a.mo159006e()).mo183712k(this.f113749a.mo159006e()).mo183673f(mo158982i());
    }

    /* renamed from: a */
    public static /* synthetic */ void m178082a(DialogInterface dialogInterface, int i) {
        GroupMemberManageHitPointNew.m179746a(false, GroupMemberManageExtraParams.Click.CONFIRM.plus(TARGET_NONE.f135700a));
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m178087b(DialogInterface dialogInterface, int i) {
        this.f113749a.mo158996a(this.f113751c);
        GroupMemberManageHitPointNew.m179746a(false, GroupMemberManageExtraParams.Click.APPLY_PERMISSION.plus(GroupMemberManageExtraParams.Target.IM_CHAT_MEMBER_TOPLIMIT_APPLY_VIEW));
    }

    /* renamed from: a */
    public static /* synthetic */ void m178085a(UDCheckBox uDCheckBox, View view) {
        uDCheckBox.setChecked(!uDCheckBox.isChecked());
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m178084a(UDCheckBox uDCheckBox, DialogInterface dialogInterface, int i) {
        this.f113749a.mo158999a(uDCheckBox.isChecked());
    }

    /* renamed from: a */
    private void m178080a(Context context, boolean z, String str) {
        UDDialogBuilder eVar = (UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).title(R.string.Lark_GroupLimit_GroupSizeExceedLimit_PopupTitle)).titleBold(true)).message(str);
        if (z) {
            eVar.addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_GroupLimit_GroupAdminViewMaxSizeReached_CancelPopupButton, (DialogInterface.OnClickListener) null);
            eVar.addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_GroupLimit_GroupAdminViewMaxSizeReached_AppealPopupButton, new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.member_manage.impl.add_member.$$Lambda$AddGroupMemberView$19y8EZROgV3h85bRfpOtdnmki8 */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    AddGroupMemberView.m270802lambda$19y8EZROgV3h85bRfpOtdnmki8(AddGroupMemberView.this, dialogInterface, i);
                }
            });
        } else {
            eVar.addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_GroupLimit_GroupSizeExceedLimit_OKButton, $$Lambda$AddGroupMemberView$oNEat4rZdHCim348o2pG9DhKs.INSTANCE);
        }
        eVar.show();
    }

    /* renamed from: a */
    private void m178079a(int i, int i2, int i3) {
        boolean z;
        if (this.f113749a.mo159011j() > GroupMemberManageModule.m177902a().getAppConfigDependency().mo143803b()) {
            z = true;
        } else {
            z = false;
        }
        if (this.f113749a.mo159012k() || !z) {
            View inflate = View.inflate(this.f113751c, R.layout.dialog_add_external_user_content, null);
            UDCheckBox uDCheckBox = (UDCheckBox) inflate.findViewById(R.id.sync_msg_record);
            Group group = (Group) inflate.findViewById(R.id.sync_message_record_region);
            TextView textView = (TextView) inflate.findViewById(R.id.choose_external_user_tip);
            ((TextView) inflate.findViewById(R.id.sync_message_record_tip)).setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.member_manage.impl.add_member.$$Lambda$AddGroupMemberView$ImQ6YwFRL2O8cxCwk6PFiU7Cxbo */

                public final void onClick(View view) {
                    AddGroupMemberView.lambda$ImQ6YwFRL2O8cxCwk6PFiU7Cxbo(UDCheckBox.this, view);
                }
            });
            if (this.f113749a.mo159007f() || this.f113749a.mo159008g() || this.f113749a.mo159009h()) {
                group.setVisibility(8);
            }
            textView.setText(C57782ag.m224234a(UIHelper.getString(i2), UIHelper.getString(i3), C57582a.m223616d(this.f113751c, R.color.function_danger_500)));
            new C25639g(this.f113751c).mo89249h(17).mo89238b(true).mo89250i(R.color.text_title).mo89237b(this.f113751c.getString(i)).mo89236b(inflate).mo89245d(0.3f).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_CancelTip, (DialogInterface.OnClickListener) null).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Group_CreateGroup_CreateGroup_TypePublic_CreateButton, new DialogInterface.OnClickListener(uDCheckBox) {
                /* class com.ss.android.lark.member_manage.impl.add_member.$$Lambda$AddGroupMemberView$PbBQIHaOIQ5j8FziQ310qmkCgI */
                public final /* synthetic */ UDCheckBox f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    AddGroupMemberView.m270804lambda$PbBQIHaOIQ5j8FziQ310qmkCgI(AddGroupMemberView.this, this.f$1, dialogInterface, i);
                }
            }).mo89227a(new DialogInterface.OnDismissListener() {
                /* class com.ss.android.lark.member_manage.impl.add_member.$$Lambda$AddGroupMemberView$VfQkRmvNEZOgtpAzHT7bDeI68DI */

                public final void onDismiss(DialogInterface dialogInterface) {
                    AddGroupMemberView.lambda$VfQkRmvNEZOgtpAzHT7bDeI68DI(AddGroupMemberView.this, dialogInterface);
                }
            }).mo89239c();
            GroupMemberManageHitPointNew.m179751d();
            return;
        }
        new C25639g(this.f113751c).mo89248g(R.string.Lark_Chat_AddExternalMembersAlertTitle).mo89254m(R.string.Lark_Chat_AddExternalMembers).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_HintIHadKnow, (DialogInterface.OnClickListener) null).mo89227a(new DialogInterface.OnDismissListener() {
            /* class com.ss.android.lark.member_manage.impl.add_member.$$Lambda$AddGroupMemberView$b2arfLXwPNSIRH863wvM7NIlT00 */

            public final void onDismiss(DialogInterface dialogInterface) {
                AddGroupMemberView.this.m178086b((AddGroupMemberView) dialogInterface);
            }
        }).mo89239c();
    }

    public AddGroupMemberView(Activity activity, AbstractC44927a aVar, boolean z, boolean z2) {
        this.f113751c = activity;
        this.f113750b = aVar;
        this.f113756h = z;
        this.f113757i = z2;
    }
}
