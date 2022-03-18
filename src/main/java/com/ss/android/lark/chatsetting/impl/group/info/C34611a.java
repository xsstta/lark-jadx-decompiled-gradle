package com.ss.android.lark.chatsetting.impl.group.info;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.dto.PushChatRelationListener;
import com.ss.android.lark.chatsetting.impl.C34501a;
import com.ss.android.lark.chatsetting.impl.group.avatar.AvatarEditActivity;
import com.ss.android.lark.chatsetting.impl.group.avatar.C34569b;
import com.ss.android.lark.chatsetting.impl.group.info.C34619c;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.utils.C57881t;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.info.a */
public class C34611a extends BaseModel implements C34619c.AbstractC34620a {

    /* renamed from: a */
    AbstractC34461c.AbstractC34476o f89370a;

    /* renamed from: b */
    private Chat f89371b;

    /* renamed from: c */
    private Team f89372c;

    /* renamed from: d */
    private C34619c.AbstractC34620a.AbstractC34621a f89373d;

    /* renamed from: e */
    private PushChatRelationListener f89374e = new PushChatRelationListener() {
        /* class com.ss.android.lark.chatsetting.impl.group.info.C34611a.C346121 */

        @Override // com.ss.android.lark.chatsetting.dto.PushChatRelationListener
        /* renamed from: a */
        public void mo127537a(Chat chat) {
            C34611a.this.mo127895b(chat);
        }
    };

    /* renamed from: f */
    private boolean f89375f;

    @Override // com.ss.android.lark.chatsetting.impl.group.info.C34619c.AbstractC34620a
    /* renamed from: a */
    public Chat mo127886a() {
        return this.f89371b;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.C34619c.AbstractC34620a
    /* renamed from: b */
    public String mo127894b() {
        return this.f89370a.mo127412a();
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.C34619c.AbstractC34620a
    /* renamed from: c */
    public boolean mo127897c() {
        if ((!this.f89371b.isOnlyOwnerEditGroupInfo() || C34501a.m133936b(this.f89371b)) && !this.f89371b.isAnonymousSecret()) {
            return true;
        }
        return false;
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ChatSettingModule.m133639a().mo127275e().mo127431a(String.valueOf(hashCode()), this.f89371b.getId(), this.f89374e);
        EventBus.getDefault().register(this);
        this.f89370a = ChatSettingModule.m133639a().mo127277g();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        if (this.f89371b != null) {
            ChatSettingModule.m133639a().mo127275e().mo127433b(String.valueOf(hashCode()), this.f89371b.getId(), this.f89374e);
        }
        EventBus.getDefault().unregister(this);
        super.destroy();
    }

    /* renamed from: a */
    public void mo127892a(C34619c.AbstractC34620a.AbstractC34621a aVar) {
        this.f89373d = aVar;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.C34619c.AbstractC34620a
    /* renamed from: a */
    public void mo127890a(Chat chat) {
        this.f89371b = chat;
        ChatSettingModule.m133639a().mo127275e().mo127431a(String.valueOf(hashCode()), this.f89371b.getId(), this.f89374e);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.C34619c.AbstractC34620a
    /* renamed from: a */
    public String mo127887a(Context context) {
        String c = C57881t.m224629c(context, this.f89371b.getId() + ".jpg");
        if (!TextUtils.isEmpty(c)) {
            return c;
        }
        return "";
    }

    /* renamed from: b */
    public void mo127895b(Chat chat) {
        if (chat != null && this.f89371b != null && chat.getId().equals(this.f89371b.getId())) {
            this.f89371b = chat;
            this.f89373d.mo127905a(chat, mo127897c(), mo127894b());
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.C34619c.AbstractC34620a
    /* renamed from: c */
    public void mo127896c(final Chat chat) {
        if (chat == null || !C34501a.m133933a() || !chat.isTeam()) {
            mo127891a(chat, (Team) null);
            return;
        }
        ChatSettingModule.m133639a().mo127294x().mo127442a(chat.getTeamId(), (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Team>() {
            /* class com.ss.android.lark.chatsetting.impl.group.info.C34611a.C346132 */

            /* renamed from: a */
            public void onSuccess(Team team) {
                C34611a.this.mo127891a(chat, team);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C34611a.this.mo127891a(chat, (Team) null);
                Log.m165389i("GroupInfoModel", errorResult.getDisplayMsg());
            }
        }));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.C34619c.AbstractC34620a
    /* renamed from: a */
    public void mo127889a(IGetDataCallback<Chat> iGetDataCallback) {
        if (this.f89371b != null) {
            ChatSettingModule.m133639a().mo127294x().mo127443a(this.f89371b.getTeamId(), this.f89371b.getId(), (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.C34619c.AbstractC34620a
    /* renamed from: a */
    public void mo127893a(Team team) {
        this.f89372c = team;
    }

    /* renamed from: a */
    public void mo127891a(Chat chat, Team team) {
        this.f89372c = team;
        this.f89373d.mo127904a(chat, team);
    }

    public C34611a(Chat chat, boolean z) {
        this.f89371b = chat;
        this.f89375f = z;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.C34619c.AbstractC34620a
    /* renamed from: a */
    public void mo127888a(Context context, C36516a<?> aVar) {
        if (DesktopUtil.m144307b()) {
            C34569b bVar = new C34569b();
            Bundle bundle = new Bundle();
            bundle.putSerializable("current_chat", this.f89371b);
            bundle.putBoolean("intent_is_default_chat", this.f89375f);
            bVar.setArguments(bundle);
            C36512a.m144041a().mo134760a(aVar, bVar, new FloatWindowParams.C36567a().mo134930b(), 801);
            return;
        }
        Intent intent = new Intent(context, AvatarEditActivity.class);
        intent.putExtra("current_chat", this.f89371b);
        intent.putExtra("intent_is_default_chat", this.f89375f);
        context.startActivity(intent);
    }
}
