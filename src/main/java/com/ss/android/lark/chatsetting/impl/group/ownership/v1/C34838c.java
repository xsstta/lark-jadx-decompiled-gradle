package com.ss.android.lark.chatsetting.impl.group.ownership.v1;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.dto.PushChatRelationListener;
import com.ss.android.lark.chatsetting.impl.C34501a;
import com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e;
import com.ss.android.lark.chatsetting.impl.group.ownership.v1.C34832a;
import com.ss.android.lark.chatsetting.impl.statistics.ownership.OwnershipHitPoint;
import com.ss.android.lark.chatsetting.impl.statistics.setting.SettingHitPoint;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.chatsetting.service.ChatSettingService;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.team.entity.Team;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v1.c */
public class C34838c extends BaseModel implements AbstractC34860e.AbstractC34861a {

    /* renamed from: a */
    AbstractC34461c.AbstractC34466e f89990a = ChatSettingModule.m133639a().mo127274d();

    /* renamed from: b */
    AbstractC34461c.AbstractC34476o f89991b = ChatSettingModule.m133639a().mo127277g();

    /* renamed from: c */
    AbstractC34461c.AbstractC34465d f89992c = ChatSettingModule.m133639a().mo127282l();

    /* renamed from: d */
    public Chat f89993d;

    /* renamed from: e */
    public Team f89994e;

    /* renamed from: f */
    private AbstractC34860e.AbstractC34861a.AbstractC34862a f89995f;

    /* renamed from: g */
    private final C34832a.AbstractC34833a f89996g;

    /* renamed from: h */
    private final PushChatRelationListener f89997h = new PushChatRelationListener() {
        /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.C34838c.C348391 */

        @Override // com.ss.android.lark.chatsetting.dto.PushChatRelationListener
        /* renamed from: a */
        public void mo127537a(Chat chat) {
            if (C34838c.this.f89993d == null || chat == null || !C34838c.this.f89993d.isMeeting() || chat.isMeeting()) {
                C34838c.this.mo128599c(chat);
            } else {
                C34838c.this.mo128601d(chat);
            }
        }

        @Override // com.ss.android.lark.chatsetting.dto.PushChatRelationListener
        /* renamed from: a */
        public void mo127538a(Chat chat, Map<String, ? extends Chatter> map) {
            C34838c.this.mo128588a(chat, map);
        }
    };

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34861a
    /* renamed from: a */
    public Chat mo128579a() {
        return this.f89993d;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34861a
    /* renamed from: b */
    public Team mo128594b() {
        return this.f89994e;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34861a
    /* renamed from: a */
    public void mo128589a(Chatter chatter, IGetDataCallback iGetDataCallback) {
        this.f89990a.mo127373e(this.f89993d.getId(), chatter.getId(), getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34861a
    /* renamed from: a */
    public void mo128592a(boolean z, IGetDataCallback<Chat> iGetDataCallback) {
        this.f89990a.mo127361b(this.f89993d.getId(), z, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34861a
    /* renamed from: a */
    public void mo128591a(String str, IGetDataCallback<List<Chatter>> iGetDataCallback) {
        this.f89990a.mo127381j(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34861a
    /* renamed from: a */
    public void mo128593a(boolean z, Chat.GroupMailSendPermissionType groupMailSendPermissionType, IGetDataCallback<Chat> iGetDataCallback) {
        Chat chat = this.f89993d;
        if (chat == null) {
            iGetDataCallback.onError(new ErrorResult("current chat is null"));
            return;
        }
        boolean isGroupMailEnable = chat.isGroupMailEnable();
        Chat.GroupMailSendPermissionType groupMailSendType = this.f89993d.getGroupMailSendType();
        if (!(z == isGroupMailEnable && groupMailSendType == groupMailSendPermissionType)) {
            OwnershipHitPoint.f90525a.mo129288a(z, groupMailSendPermissionType, this.f89993d.getMemberCount(), this.f89993d.getId());
        }
        if (z != isGroupMailEnable && groupMailSendPermissionType != groupMailSendType) {
            this.f89990a.mo127345a(this.f89993d.getId(), z, groupMailSendPermissionType, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
        } else if (z == isGroupMailEnable && groupMailSendPermissionType != groupMailSendType) {
            SettingHitPoint.f90520a.mo129265a(groupMailSendPermissionType);
            this.f89990a.mo127331a(this.f89993d.getId(), groupMailSendPermissionType, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
        } else if (z == isGroupMailEnable || groupMailSendPermissionType != groupMailSendType) {
            iGetDataCallback.onSuccess(this.f89993d);
        } else {
            this.f89990a.mo127371d(this.f89993d.getId(), z, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
        }
    }

    /* renamed from: a */
    public void mo128588a(Chat chat, Map<String, ? extends Chatter> map) {
        if (chat != null && this.f89993d != null && map.containsKey(this.f89991b.mo127412a()) && chat.getId().equals(this.f89993d.getId())) {
            Log.m165388i("PUSH_CHAT_REMOVE_USERS self is not in this chat:" + chat.getId());
            if (chat.isDissolved()) {
                this.f89995f.mo128618a(chat.getOwnerId());
            }
        }
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        if (this.f89993d != null) {
            ChatSettingModule.m133639a().mo127275e().mo127431a(String.valueOf(hashCode()), this.f89993d.getId(), this.f89997h);
        }
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        if (this.f89993d != null) {
            ChatSettingModule.m133639a().mo127275e().mo127433b(String.valueOf(hashCode()), this.f89993d.getId(), this.f89997h);
        }
        this.f89995f = null;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34861a
    /* renamed from: a */
    public void mo128590a(AbstractC34860e.AbstractC34861a.AbstractC34862a aVar) {
        this.f89995f = aVar;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34861a
    /* renamed from: a */
    public void mo128580a(IGetDataCallback<Long> iGetDataCallback) {
        this.f89990a.mo127319a(getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34861a
    /* renamed from: b */
    public void mo128595b(final IGetDataCallback<String> iGetDataCallback) {
        this.f89992c.mo127308a(this.f89993d.getId(), (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.C34838c.C348424 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(C34838c.this.f89993d.getId());
                }
            }
        }));
    }

    public C34838c(C34832a.AbstractC34833a aVar) {
        this.f89996g = aVar;
    }

    /* renamed from: c */
    public void mo128599c(Chat chat) {
        if (this.f89993d != null && chat != null && chat.getId().equals(this.f89993d.getId())) {
            if (this.f89993d.getTeamId() != chat.getTeamId()) {
                mo128597b(chat);
            }
            mo128586a(chat);
            this.f89995f.mo128617a(chat);
        }
    }

    /* renamed from: d */
    public void mo128601d(Chat chat) {
        if (this.f89993d != null && chat != null && chat.getId().equals(this.f89993d.getId())) {
            mo128586a(chat);
            this.f89995f.mo128620b(chat.getId());
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34861a
    /* renamed from: b */
    public void mo128597b(Chat chat) {
        if (chat == null || !C34501a.m133933a() || !chat.isTeam()) {
            this.f89994e = null;
            return;
        }
        ChatSettingModule.m133639a().mo127294x().mo127442a(chat.getTeamId(), (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Team>() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.C34838c.C348435 */

            /* renamed from: a */
            public void onSuccess(Team team) {
                C34838c.this.f89994e = team;
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C34838c.this.f89994e = null;
            }
        }));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34861a
    /* renamed from: a */
    public void mo128586a(Chat chat) {
        this.f89993d = chat;
        ChatSettingModule.m133639a().mo127275e().mo127431a(String.valueOf(hashCode()), this.f89993d.getId(), this.f89997h);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34861a
    /* renamed from: a */
    public void mo128581a(Chat.BuzzPermissionSetting buzzPermissionSetting, IGetDataCallback<Chat> iGetDataCallback) {
        this.f89990a.mo127329a(this.f89993d.getId(), buzzPermissionSetting, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34861a
    /* renamed from: c */
    public void mo128600c(boolean z, IGetDataCallback<Chat> iGetDataCallback) {
        this.f89990a.mo127378g(this.f89993d.getId(), z, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34861a
    /* renamed from: a */
    public void mo128582a(Chat.CreateVideoConferenceSetting createVideoConferenceSetting, IGetDataCallback<Chat> iGetDataCallback) {
        this.f89990a.mo127330a(this.f89993d.getId(), createVideoConferenceSetting, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34861a
    /* renamed from: b */
    public void mo128596b(Chat.SystemMessageVisible systemMessageVisible, IGetDataCallback<Chat> iGetDataCallback) {
        this.f89990a.mo127335a(this.f89993d.getId(), systemMessageVisible, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34861a
    /* renamed from: e */
    public void mo128603e(boolean z, final IGetDataCallback<Chat> iGetDataCallback) {
        Chat.AtAllPermission atAllPermission;
        if (z) {
            atAllPermission = Chat.AtAllPermission.ONLY_OWNER;
        } else {
            atAllPermission = Chat.AtAllPermission.ALL_MEMBERS;
        }
        this.f89990a.mo127328a(this.f89993d.getId(), atAllPermission, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Chat>() {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.C34838c.C348413 */

            /* renamed from: a */
            public void onSuccess(Chat chat) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(chat);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        }));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34861a
    /* renamed from: a */
    public void mo128583a(Chat.PinPermissionSetting pinPermissionSetting, IGetDataCallback<Chat> iGetDataCallback) {
        this.f89990a.mo127333a(this.f89993d.getId(), pinPermissionSetting, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34861a
    /* renamed from: d */
    public void mo128602d(boolean z, final IGetDataCallback<Chat> iGetDataCallback) {
        Chat.AddMemberPermission addMemberPermission;
        Chat.ShareCardPermission shareCardPermission;
        if (z) {
            addMemberPermission = Chat.AddMemberPermission.ONLY_OWNER;
        } else {
            addMemberPermission = Chat.AddMemberPermission.ALL_MEMBERS;
        }
        if (z) {
            shareCardPermission = Chat.ShareCardPermission.NOT_ALLOWED;
        } else {
            shareCardPermission = Chat.ShareCardPermission.ALLOWED;
        }
        if (!this.f89995f.mo128619a() || !z || !this.f89993d.isPublic()) {
            this.f89990a.mo127327a(this.f89993d.getId(), addMemberPermission, shareCardPermission, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Chat>() {
                /* class com.ss.android.lark.chatsetting.impl.group.ownership.v1.C34838c.C348402 */

                /* renamed from: a */
                public void onSuccess(Chat chat) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(chat);
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }
            }));
        } else {
            this.f89990a.mo127344a(this.f89993d.getId(), false, addMemberPermission, shareCardPermission, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34861a
    /* renamed from: a */
    public void mo128584a(Chat.SystemMessageVisible systemMessageVisible, IGetDataCallback<Chat> iGetDataCallback) {
        this.f89990a.mo127358b(this.f89993d.getId(), systemMessageVisible, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34861a
    /* renamed from: b */
    public void mo128598b(boolean z, IGetDataCallback<Chat> iGetDataCallback) {
        this.f89990a.mo127367c(this.f89993d.getId(), z, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34861a
    /* renamed from: a */
    public void mo128585a(Chat.TopNoticePermissionSetting topNoticePermissionSetting, IGetDataCallback<Chat> iGetDataCallback) {
        this.f89990a.mo127336a(this.f89993d.getId(), topNoticePermissionSetting, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.v1.AbstractC34860e.AbstractC34861a
    /* renamed from: a */
    public void mo128587a(Chat chat, IGetDataCallback<Boolean> iGetDataCallback) {
        if (chat != null) {
            ChatSettingService.f88988a.mo127458a(chat, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
        }
    }
}
