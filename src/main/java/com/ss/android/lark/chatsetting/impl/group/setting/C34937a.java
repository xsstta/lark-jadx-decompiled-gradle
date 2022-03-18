package com.ss.android.lark.chatsetting.impl.group.setting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chatsetting.C34456a;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.group.info.C34624d;
import com.ss.android.lark.chatsetting.impl.group.info.LarkGroupInfoActivity;
import com.ss.android.lark.chatsetting.impl.group.ownership.OwnershipLauncher;
import com.ss.android.lark.chatsetting.impl.group.ownership.quit.QuitGroupActivity;
import com.ss.android.lark.chatsetting.impl.group.ownership.quit.QuitGroupFragment;
import com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew;
import com.ss.android.lark.chatsetting.impl.statistics.group.GroupHitPoint;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.team.entity.Team;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.setting.a */
public class C34937a extends BaseFragment {

    /* renamed from: a */
    public Context f90193a;

    /* renamed from: b */
    public View f90194b;

    /* renamed from: c */
    private C34950g f90195c;

    /* renamed from: d */
    private AbstractC34461c.AbstractC34472k f90196d = ChatSettingModule.m133639a().mo127276f();

    /* renamed from: e */
    private GroupSettingView.AbstractC34936a f90197e = new GroupSettingView.AbstractC34936a() {
        /* class com.ss.android.lark.chatsetting.impl.group.setting.C34937a.C349381 */

        @Override // com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.AbstractC34936a
        /* renamed from: a */
        public void mo128842a() {
            C34937a.this.finish();
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.AbstractC34936a
        /* renamed from: b */
        public void mo128851b() {
            ChatSettingModule.m133639a().mo127265a(C34937a.this.getActivity());
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.AbstractC34936a
        /* renamed from: c */
        public void mo128856c(String str) {
            LKUIToast.show(C34937a.this.f90193a, str);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.AbstractC34936a
        /* renamed from: b */
        public void mo128852b(Chat chat) {
            C34456a.m133680a(C34937a.this.f90193a, chat, 1, (String) null);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.AbstractC34936a
        /* renamed from: c */
        public void mo128855c(Chat chat) {
            ChatSettingModule.m133639a().mo127281k().mo127404a((Activity) C34937a.this.getActivity(), chat.getId(), chat.isThread(), false);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.AbstractC34936a
        /* renamed from: d */
        public void mo128857d(Chat chat) {
            ChatSettingModule.m133639a().mo127281k().mo127406a(C34937a.this, chat.getId(), 1002, chat.isThread());
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.AbstractC34936a
        /* renamed from: a */
        public void mo128845a(Chat chat) {
            OwnershipLauncher.m134810a(C34937a.this.getActivity(), chat, 10003);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.AbstractC34936a
        /* renamed from: b */
        public void mo128854b(String str) {
            ChatSettingModule.m133639a().mo127271b(C34937a.this.f90193a, str);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.AbstractC34936a
        /* renamed from: a */
        public void mo128847a(GroupSettingView groupSettingView) {
            ButterKnife.bind(groupSettingView, C34937a.this.f90194b);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.AbstractC34936a
        /* renamed from: a */
        public void mo128849a(String str) {
            C34456a.m133677a(C34937a.this.getActivity(), C34937a.this, str, 2, (String) null);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.AbstractC34936a
        /* renamed from: a */
        public void mo128846a(Chat chat, boolean z) {
            if (!DesktopUtil.m144301a(C34937a.this.f90193a)) {
                Intent intent = new Intent(C34937a.this.f90193a, QuitGroupActivity.class);
                intent.putExtra("key_group_management_chat", chat).putExtra("isOrganizer", z);
                C34937a.this.f90193a.startActivity(intent);
                return;
            }
            FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134945a("LarkGroupInfoActivity").mo134930b();
            QuitGroupFragment quitGroupFragment = new QuitGroupFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("key_group_management_chat", chat);
            bundle.putBoolean("isOrganizer", z);
            quitGroupFragment.setArguments(bundle);
            C36512a.m144041a().mo134762a(quitGroupFragment, a);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.AbstractC34936a
        /* renamed from: b */
        public void mo128853b(Chat chat, boolean z) {
            if (!DesktopUtil.m144301a(C34937a.this.f90193a)) {
                Intent intent = new Intent(C34937a.this.f90193a, LarkGroupInfoActivity.class);
                intent.putExtra("curr_chat", chat);
                intent.putExtra("group_is_default_chat", z);
                C34937a.this.f90193a.startActivity(intent);
                return;
            }
            FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134945a("LarkGroupInfoActivity").mo134930b();
            C34624d dVar = new C34624d();
            Bundle bundle = new Bundle();
            bundle.putSerializable("curr_chat", chat);
            bundle.putBoolean("group_is_default_chat", z);
            dVar.setArguments(bundle);
            C36512a.m144041a().mo134762a(dVar, a);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.AbstractC34936a
        /* renamed from: a */
        public void mo128848a(Team team, Chat chat) {
            ChatSettingModule.m133639a().mo127294x().mo127449c(C34937a.this.getActivity(), team, chat);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.AbstractC34936a
        /* renamed from: a */
        public void mo128850a(String str, String str2) {
            C34456a.m133677a(C34937a.this.getActivity(), C34937a.this, str, 3, str2);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.AbstractC34936a
        /* renamed from: a */
        public void mo128843a(Context context, String str, boolean z) {
            ChatSettingModule.m133639a().mo127288r().mo127434a(context, str, z);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView.AbstractC34936a
        /* renamed from: a */
        public void mo128844a(Context context, String str, boolean z, int i) {
            ChatSettingModule.m133639a().mo127288r().mo127435a(context, str, z, i);
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C34950g gVar = this.f90195c;
        if (gVar != null) {
            gVar.destroy();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ChatSettingModule.m133639a().mo127274d().mo127317a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f90193a = getContext();
        Bundle arguments = getArguments();
        String string = arguments.getString("chatID");
        int i = arguments.getInt("calendar_meeting_setting_role", 0);
        boolean z = arguments.getBoolean("key_params_is_oncall", false);
        boolean z2 = arguments.getBoolean("key_params_is_group_observer", false);
        boolean z3 = arguments.getBoolean("key_params_is_default_group", false);
        boolean z4 = arguments.getBoolean("key_params_is_from_topic_tab", false);
        String string2 = arguments.getString("key_params_source_to_setting");
        m135996a(z, z2, z3, z4);
        this.f90195c.mo128881a(string, i);
        ChatSettingHitPointNew.m136627a(string2);
        GroupHitPoint.m136686a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.activity_group_setting_redesign, viewGroup, false);
        this.f90194b = inflate;
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Chatter chatter;
        C34950g gVar;
        if (i != 1002) {
            switch (i) {
                case UpdateDialogStatusCode.SHOW:
                    if (i2 == -1) {
                        this.f90195c.mo128877a();
                        return;
                    }
                    return;
                case 10003:
                    if (i2 == -1) {
                        String stringExtra = intent.getStringExtra("owner_id");
                        this.f90195c.mo128877a();
                        if (stringExtra != null) {
                            LKUIToast.show(this.f90193a, (int) R.string.Lark_Legacy_ChangeOwnerSuccess);
                            return;
                        }
                        return;
                    }
                    return;
                case 10004:
                    if (i2 == 1) {
                        String stringExtra2 = intent.getStringExtra("group_nickname");
                        C34950g gVar2 = this.f90195c;
                        if (gVar2 != null) {
                            gVar2.mo128880a(stringExtra2);
                            return;
                        }
                        return;
                    }
                    return;
                case 10005:
                    if (i2 == -1) {
                        setResult(-1, intent);
                        finish();
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else if (i2 == -1 && (chatter = (Chatter) intent.getSerializableExtra("key_group_new_owner")) != null && (gVar = this.f90195c) != null) {
            gVar.mo128879a(chatter);
        }
    }

    /* renamed from: a */
    private void m135996a(boolean z, boolean z2, boolean z3, boolean z4) {
        C34950g gVar = new C34950g(this.f90197e, getActivity(), this, z, z2, z3, z4);
        this.f90195c = gVar;
        gVar.create();
    }
}
