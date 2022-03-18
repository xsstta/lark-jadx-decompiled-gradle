package com.ss.android.lark.member_manage.impl.base.mvp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import butterknife.ButterKnife;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.impl.add_member.AddGroupMemberLauncher;
import com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView;
import com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.lark.member_manage.impl.base.mvp.c */
public class C45081c implements BaseGroupMemberManageView.AbstractC45064a {

    /* renamed from: a */
    protected Activity f114134a;

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AbstractC45064a
    /* renamed from: b */
    public /* synthetic */ void mo159432b() {
        BaseGroupMemberManageView.AbstractC45064a.CC.$default$b(this);
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AbstractC45064a
    /* renamed from: a */
    public void mo159423a() {
        this.f114134a.finish();
    }

    public C45081c(Activity activity) {
        this.f114134a = activity;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AbstractC45064a
    /* renamed from: a */
    public void mo159427a(Chatter chatter) {
        if (chatter != null) {
            if (chatter.isAnonymous()) {
                Log.i("BaseViewDependency", "chatter is anonymous block avatar click");
            } else {
                GroupMemberManageModule.m177902a().startContactsProfileActivity(this.f114134a, chatter);
            }
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AbstractC45064a
    /* renamed from: a */
    public void mo159429a(IGroupMemberBaseContract.AbstractC45066b bVar) {
        ButterKnife.bind(bVar, this.f114134a);
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AbstractC45064a
    /* renamed from: a */
    public void mo159430a(String str) {
        GroupMemberManageModule.m177902a().startAppProfileByBotId(this.f114134a, str);
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AbstractC45064a
    /* renamed from: a */
    public void mo159431a(List<ChatChatter> list) {
        Intent intent = new Intent();
        intent.putExtra("result_key_checked_chatters", (Serializable) list);
        this.f114134a.setResult(-1, intent);
        this.f114134a.finish();
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AbstractC45064a
    /* renamed from: a */
    public void mo159425a(Chat chat, String str) {
        GroupMemberManageModule.m177902a().getChatSettingDependency().mo143810a(this.f114134a, chat, str, 10007);
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AbstractC45064a
    /* renamed from: a */
    public void mo159424a(Context context, String str, int i) {
        GroupMemberManageModule.m177902a().startInviteInactiveParentListActivity(context, str, i);
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AbstractC45064a
    /* renamed from: a */
    public void mo159428a(Chatter chatter, String str, String str2) {
        if (chatter != null) {
            if (chatter.isAnonymous()) {
                Log.i("BaseViewDependency", "chatter is anonymous block avatar click");
            } else {
                GroupMemberManageModule.m177902a().startContactsProfileActivityFromChatContact(this.f114134a, chatter, str, str2);
            }
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AbstractC45064a
    /* renamed from: a */
    public void mo159426a(Chat chat, boolean z, int i, String str) {
        AddGroupMemberLauncher.f113807a.mo159062a(this.f114134a, chat, z, 10006, str);
    }
}
