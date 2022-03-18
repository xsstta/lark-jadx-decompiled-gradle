package com.ss.android.lark.chatsetting.impl.group.setting;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.TeamChatType;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chatsetting.C34456a;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.C34501a;
import com.ss.android.lark.chatsetting.impl.group.setting.C34942d;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingExtraParams;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew;
import com.ss.android.lark.chatsetting.impl.statistics.group.GroupHitPoint;
import com.ss.android.lark.chatsetting.impl.statistics.ownership.OwnershipHitPoint;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.team.entity.TeamSetting;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.setting.b */
public class C34939b implements C34942d.AbstractC34944a {

    /* renamed from: a */
    AbstractC34461c.AbstractC34476o f90199a;

    /* renamed from: b */
    String f90200b;

    /* renamed from: c */
    private Chat f90201c;

    /* renamed from: d */
    private Context f90202d;

    /* renamed from: e */
    private boolean f90203e = C34501a.m133933a();

    /* renamed from: f */
    private AbstractC34940a f90204f;

    /* renamed from: com.ss.android.lark.chatsetting.impl.group.setting.b$a */
    public interface AbstractC34940a {
        Team getTeam();
    }

    /* renamed from: a */
    private void m136013a() {
        OwnershipHitPoint.f90525a.mo129282a();
        GroupHitPoint.f90519a.mo129212a(this.f90201c.getId());
        GroupHitPoint.f90519a.mo129261m("group_im_add_to_group_chat");
        ChatSettingHitPointNew.m136630b(ChatSettingExtraParams.Click.GROUP_MEMBER_ADD.plus(ChatSettingExtraParams.Target.IM_GROUP_MEMBER_ADD_VIEW));
        Chat.AddMemberPermission addMemberPermission = this.f90201c.getAddMemberPermission();
        if (!C34501a.m133936b(this.f90201c) && addMemberPermission != Chat.AddMemberPermission.ALL_MEMBERS) {
            UDToast.show(this.f90202d, (int) R.string.Lark_Group_OnlyGroupOwnerAdminInviteMembers);
        } else if (!m136016b(this.f90200b)) {
            C34456a.m133674a((Activity) this.f90202d, this.f90201c, 10005);
        }
    }

    /* renamed from: b */
    private void m136015b() {
        if (C34501a.m133936b(this.f90201c) && !mo128859a(this.f90200b)) {
            GroupHitPoint.f90519a.mo129237e(this.f90201c.getId(), "section_del_mobile");
            ChatSettingHitPointNew.m136630b(ChatSettingExtraParams.Click.GROUP_MEMBER_DEL.plus(ChatSettingExtraParams.Target.IM_GROUP_MEMBER_DEL_VIEW));
            ChatSettingModule.m133639a().mo127281k().mo127404a((Activity) this.f90202d, this.f90201c.getId(), this.f90201c.isThread(), true);
        }
    }

    /* renamed from: a */
    public void mo128858a(Chat chat) {
        if (chat != null) {
            if (this.f90201c == null || chat.getId().equals(this.f90201c.getId())) {
                this.f90201c = chat;
            }
        }
    }

    /* renamed from: c */
    private boolean m136017c(String str) {
        boolean z;
        boolean z2;
        Team team = this.f90204f.getTeam();
        if (team == null || !String.valueOf(team.getOwnerId()).equals(str)) {
            z = false;
        } else {
            z = true;
        }
        if (team == null || team.getTeamSetting() == null || team.getTeamSetting().getAddMemberPermission() != TeamSetting.AddMemberPermission.ALL_MEMBERS) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m136014a(C34945e eVar) {
        Chatter b = eVar.mo128875b();
        if (b != null) {
            if (!b.isProfileEnable() || b.isAnonymous()) {
                Log.m165389i("GmItemListener", "unsupported click, do nothing here:" + b);
                return;
            }
            ChatSettingHitPointNew.m136630b(ChatSettingExtraParams.Click.MEMBER_AVATAR.plus(ChatSettingExtraParams.Target.PROFILE_MAIN_VIEW));
            if (b.isUser()) {
                ChatSettingModule.m133639a().mo127280j().mo127422a(this.f90202d, b, null, this.f90201c.getId(), this.f90201c.getName());
            } else if (b.isBot()) {
                ChatSettingModule.m133639a().mo127280j().mo127423a(this.f90202d, b.getId());
            } else {
                Log.m165383e("GmItemListener", "unsupported chatter type, do nothing here:" + b);
            }
        }
    }

    /* renamed from: b */
    private boolean m136016b(String str) {
        if (!this.f90201c.isTeam() || !this.f90203e) {
            return false;
        }
        Team team = this.f90204f.getTeam();
        if (team != null && this.f90201c.getTeamChatType() == TeamChatType.TEAM_CHAT_TYPE_PRIVATE) {
            ChatSettingModule.m133639a().mo127294x().mo127445a((Activity) this.f90202d, team, this.f90201c);
            return true;
        } else if (m136017c(str)) {
            UDToast.makeToast(this.f90202d, (int) R.string.Project_T_CannotAddOrLeave).show();
            return true;
        } else {
            UDToast.makeToast(this.f90202d, (int) R.string.Project_MV_TeamMembersUnableToAdd).show();
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo128859a(String str) {
        if (!this.f90201c.isTeam() || !this.f90203e) {
            return false;
        }
        Team team = this.f90204f.getTeam();
        if (team != null && this.f90201c.getTeamChatType() == TeamChatType.TEAM_CHAT_TYPE_PRIVATE) {
            ChatSettingModule.m133639a().mo127294x().mo127448b((Activity) this.f90202d, team, this.f90201c);
            return true;
        } else if (this.f90204f.getTeam() == null || !String.valueOf(this.f90204f.getTeam().getOwnerId()).equals(str)) {
            UDToast.makeToast(this.f90202d, (int) R.string.Project_MV_DueToAdminSet).show();
            return true;
        } else {
            UDToast.makeToast(this.f90202d, (int) R.string.Project_T_CannotAddOrLeave).show();
            return true;
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34942d.AbstractC34944a
    /* renamed from: a */
    public void mo128070a(C34945e eVar, View view) {
        if (eVar != null) {
            int a = eVar.mo128870a();
            if (a == 1) {
                m136014a(eVar);
            } else if (a == 2) {
                m136013a();
            } else if (a == 3) {
                m136015b();
            }
        }
    }

    public C34939b(Context context, Chat chat, AbstractC34940a aVar) {
        AbstractC34461c.AbstractC34476o g = ChatSettingModule.m133639a().mo127277g();
        this.f90199a = g;
        this.f90200b = g.mo127412a();
        this.f90202d = context;
        this.f90201c = chat;
        this.f90204f = aVar;
    }
}
