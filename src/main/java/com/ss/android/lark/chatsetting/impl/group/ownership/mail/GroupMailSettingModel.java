package com.ss.android.lark.chatsetting.impl.group.ownership.mail;

import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.group.ownership.mail.IGroupMailSettingContract;
import com.ss.android.lark.chatsetting.impl.statistics.ownership.OwnershipHitPoint;
import com.ss.android.lark.chatsetting.impl.statistics.setting.SettingHitPoint;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u0018\u0010\u0013\u001a\u00020\u00142\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u0004H\u0016J\b\u0010\u001c\u001a\u00020\tH\u0016J\u0018\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u0007H\u0016R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/mail/GroupMailSettingModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/mail/IGroupMailSettingContract$IModel;", "mChatId", "", "mOwnerId", "mInGroupMail", "Lcom/ss/android/lark/chat/entity/chat/Chat$GroupMailSendPermissionType;", "isThread", "", "mInMailEnable", "(Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/chat/entity/chat/Chat$GroupMailSendPermissionType;ZZ)V", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "mChatterService", "Lcom/ss/android/lark/chatsetting/dependency/IChatSettingModuleDependency$IChatDependency;", "mGroupMail", "mIChatService", "mMailEnable", "confirm", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "currentGroupMailSendType", "getChatId", "getChatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", BottomDialog.f17198f, "getIsThread", "setGroupMailSendType", "enable", ShareHitPoint.f121869d, "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.mail.b */
public final class GroupMailSettingModel extends BaseModel implements IGroupMailSettingContract.IModel {

    /* renamed from: e */
    public static final Companion f89735e = new Companion(null);

    /* renamed from: a */
    public AbstractC34461c.AbstractC34466e f89736a;

    /* renamed from: b */
    public Chat f89737b;

    /* renamed from: c */
    public final String f89738c;

    /* renamed from: d */
    public final String f89739d;

    /* renamed from: f */
    private Chat.GroupMailSendPermissionType f89740f = this.f89743i;

    /* renamed from: g */
    private AbstractC34461c.AbstractC34466e f89741g;

    /* renamed from: h */
    private boolean f89742h = this.f89745k;

    /* renamed from: i */
    private Chat.GroupMailSendPermissionType f89743i;

    /* renamed from: j */
    private boolean f89744j;

    /* renamed from: k */
    private boolean f89745k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/mail/GroupMailSettingModel$Companion;", "", "()V", "TAG", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.mail.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.mail.IGroupMailSettingContract.IModel
    /* renamed from: b */
    public boolean mo128279b() {
        return this.f89744j;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.mail.IGroupMailSettingContract.IModel
    /* renamed from: a */
    public Chat.GroupMailSendPermissionType mo128276a() {
        if (!this.f89742h) {
            return Chat.GroupMailSendPermissionType.UNKNOWN;
        }
        return this.f89740f;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.mail.IGroupMailSettingContract.IModel
    /* renamed from: a */
    public void mo128277a(IGetDataCallback<Chat> iGetDataCallback) {
        Chat.GroupMailSendPermissionType groupMailSendPermissionType;
        Chat chat;
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        if (!((this.f89742h == this.f89745k && this.f89740f == this.f89743i) || (chat = this.f89737b) == null)) {
            OwnershipHitPoint.Companion aVar = OwnershipHitPoint.f90525a;
            boolean z = this.f89742h;
            Chat.GroupMailSendPermissionType groupMailSendPermissionType2 = this.f89740f;
            int memberCount = chat.getMemberCount();
            String id = chat.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "it.getId()");
            aVar.mo129288a(z, groupMailSendPermissionType2, memberCount, id);
        }
        boolean z2 = this.f89742h;
        boolean z3 = this.f89745k;
        if (z2 != z3 && (groupMailSendPermissionType = this.f89740f) != this.f89743i) {
            AbstractC34461c.AbstractC34466e eVar = this.f89741g;
            if (eVar != null) {
                eVar.mo127345a(this.f89738c, z2, groupMailSendPermissionType, iGetDataCallback);
            }
        } else if (z2 == z3 && this.f89740f != this.f89743i) {
            SettingHitPoint.f90520a.mo129265a(this.f89740f);
            AbstractC34461c.AbstractC34466e eVar2 = this.f89741g;
            if (eVar2 != null) {
                eVar2.mo127331a(this.f89738c, this.f89740f, iGetDataCallback);
            }
        } else if (z2 == z3 || this.f89740f != this.f89743i) {
            iGetDataCallback.onSuccess(null);
            Log.m165389i("PostSetting", "post type is not changed");
        } else {
            AbstractC34461c.AbstractC34466e eVar3 = this.f89741g;
            if (eVar3 != null) {
                eVar3.mo127371d(this.f89738c, z2, iGetDataCallback);
            }
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.mail.IGroupMailSettingContract.IModel
    /* renamed from: a */
    public void mo128278a(boolean z, Chat.GroupMailSendPermissionType groupMailSendPermissionType) {
        Intrinsics.checkParameterIsNotNull(groupMailSendPermissionType, ShareHitPoint.f121869d);
        if (!z) {
            this.f89742h = z;
            return;
        }
        this.f89742h = z;
        this.f89740f = groupMailSendPermissionType;
    }

    public GroupMailSettingModel(String str, String str2, Chat.GroupMailSendPermissionType groupMailSendPermissionType, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "mChatId");
        Intrinsics.checkParameterIsNotNull(str2, "mOwnerId");
        Intrinsics.checkParameterIsNotNull(groupMailSendPermissionType, "mInGroupMail");
        this.f89738c = str;
        this.f89739d = str2;
        this.f89743i = groupMailSendPermissionType;
        this.f89744j = z;
        this.f89745k = z2;
        AbstractC34461c a = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
        this.f89741g = a.mo127274d();
        AbstractC34461c a2 = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "ChatSettingModule.getDependency()");
        this.f89736a = a2.mo127274d();
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getFixedThreadPool().execute(new Runnable(this) {
            /* class com.ss.android.lark.chatsetting.impl.group.ownership.mail.GroupMailSettingModel.RunnableC347381 */

            /* renamed from: a */
            final /* synthetic */ GroupMailSettingModel f89746a;

            {
                this.f89746a = r1;
            }

            public final void run() {
                Chat chat;
                AbstractC34461c.AbstractC34466e eVar = this.f89746a.f89736a;
                if (eVar != null) {
                    eVar.mo127313a(this.f89746a.f89738c, this.f89746a.f89739d);
                }
                GroupMailSettingModel bVar = this.f89746a;
                AbstractC34461c.AbstractC34466e eVar2 = bVar.f89736a;
                if (eVar2 != null) {
                    chat = eVar2.mo127349b(this.f89746a.f89738c);
                } else {
                    chat = null;
                }
                bVar.f89737b = chat;
            }
        });
    }
}
