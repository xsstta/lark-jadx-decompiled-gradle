package com.ss.android.lark.chatsetting.impl.group.ownership.group_search;

import android.content.Context;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.group.ownership.group_search.IGroupSearchEnableContract;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.utils.C57881t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u001e\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00142\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0016R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/group_search/GroupSearchEnableModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/group_search/IGroupSearchEnableContract$IModel;", "chatId", "", "(Ljava/lang/String;)V", "chatDependency", "Lcom/ss/android/lark/chatsetting/dependency/IChatSettingModuleDependency$IChatDependency;", "kotlin.jvm.PlatformType", "curChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getChatById", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "getCurChat", "getDefaultAvatarLocalPath", "context", "Landroid/content/Context;", "isInfoComplete", "", "updateGroupSearchEnable", "enable", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.group_search.a */
public final class GroupSearchEnableModel extends BaseModel implements IGroupSearchEnableContract.IModel {

    /* renamed from: a */
    public Chat f89642a;

    /* renamed from: b */
    private final AbstractC34461c.AbstractC34466e f89643b;

    /* renamed from: c */
    private final String f89644c;

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.group_search.IGroupSearchEnableContract.IModel
    /* renamed from: a */
    public Chat mo128180a() {
        return this.f89642a;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.group_search.IGroupSearchEnableContract.IModel
    /* renamed from: b */
    public boolean mo128184b() {
        String str;
        boolean z;
        boolean z2;
        Chat chat = this.f89642a;
        String str2 = null;
        if (chat != null) {
            str = chat.getName();
        } else {
            str = null;
        }
        String str3 = str;
        if (str3 == null || str3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        Chat chat2 = this.f89642a;
        if (chat2 != null) {
            str2 = chat2.getDescription();
        }
        String str4 = str2;
        if (str4 == null || str4.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return false;
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/group_search/GroupSearchEnableModel$getChatById$secondCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.group_search.a$a */
    public static final class C34716a implements IGetDataCallback<Chat> {

        /* renamed from: a */
        final /* synthetic */ GroupSearchEnableModel f89645a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f89646b;

        /* renamed from: a */
        public void onSuccess(Chat chat) {
            this.f89645a.f89642a = chat;
            this.f89646b.onSuccess(chat);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f89646b.onError(errorResult);
        }

        C34716a(GroupSearchEnableModel aVar, IGetDataCallback iGetDataCallback) {
            this.f89645a = aVar;
            this.f89646b = iGetDataCallback;
        }
    }

    public GroupSearchEnableModel(String str) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        this.f89644c = str;
        AbstractC34461c a = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
        this.f89643b = a.mo127274d();
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.group_search.IGroupSearchEnableContract.IModel
    /* renamed from: a */
    public void mo128182a(IGetDataCallback<Chat> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        this.f89643b.mo127365c(this.f89644c, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new C34716a(this, iGetDataCallback)));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.group_search.IGroupSearchEnableContract.IModel
    /* renamed from: a */
    public String mo128181a(Context context) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(context, "context");
        String c = C57881t.m224629c(context, this.f89644c + ".jpg");
        String str = c;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return "";
        }
        Intrinsics.checkExpressionValueIsNotNull(c, "filePath");
        return c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.group_search.IGroupSearchEnableContract.IModel
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo128183a(boolean r9, com.larksuite.framework.callback.IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat> r10) {
        /*
            r8 = this;
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
            r0 = 0
            if (r9 == 0) goto L_0x000c
            com.ss.android.lark.chat.entity.chat.Chat$AddMemberPermission r1 = com.ss.android.lark.chat.entity.chat.Chat.AddMemberPermission.ALL_MEMBERS
        L_0x000a:
            r5 = r1
            goto L_0x0016
        L_0x000c:
            com.ss.android.lark.chat.entity.chat.Chat r1 = r8.f89642a
            if (r1 == 0) goto L_0x0015
            com.ss.android.lark.chat.entity.chat.Chat$AddMemberPermission r1 = r1.getAddMemberPermission()
            goto L_0x000a
        L_0x0015:
            r5 = r0
        L_0x0016:
            if (r9 == 0) goto L_0x001c
            com.ss.android.lark.chat.entity.chat.Chat$ShareCardPermission r0 = com.ss.android.lark.chat.entity.chat.Chat.ShareCardPermission.ALLOWED
        L_0x001a:
            r6 = r0
            goto L_0x0025
        L_0x001c:
            com.ss.android.lark.chat.entity.chat.Chat r1 = r8.f89642a
            if (r1 == 0) goto L_0x001a
            com.ss.android.lark.chat.entity.chat.Chat$ShareCardPermission r0 = r1.getShareCardPermission()
            goto L_0x001a
        L_0x0025:
            com.ss.android.lark.chatsetting.a.c$e r2 = r8.f89643b
            java.lang.String r3 = r8.f89644c
            com.larksuite.framework.callback.CallbackManager r0 = r8.getCallbackManager()
            com.larksuite.framework.callback.ICallback r10 = (com.larksuite.framework.callback.ICallback) r10
            com.larksuite.framework.callback.ICallback r10 = r0.wrapAndAddCallback(r10)
            r7 = r10
            com.larksuite.framework.callback.IGetDataCallback r7 = (com.larksuite.framework.callback.IGetDataCallback) r7
            r4 = r9
            r2.mo127344a(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chatsetting.impl.group.ownership.group_search.GroupSearchEnableModel.mo128183a(boolean, com.larksuite.framework.callback.IGetDataCallback):void");
    }
}
