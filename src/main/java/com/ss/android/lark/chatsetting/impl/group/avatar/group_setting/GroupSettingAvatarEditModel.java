package com.ss.android.lark.chatsetting.impl.group.avatar.group_setting;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chat.AvatarMeta;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.group.avatar.group_setting.IGroupSettingAvatarEditContract;
import com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34590b;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57881t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\f\u001a\u00020\rH\u0016J0\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\tH\u0016J*\u0010\u000e\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\n2\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\tH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/avatar/group_setting/GroupSettingAvatarEditModel;", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/AvatarEditModel;", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/group_setting/IGroupSettingAvatarEditContract$IModel;", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "(Lcom/ss/android/lark/chat/entity/chat/Chat;)V", "getAvatarMeta", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/AvatarMeta;", "getChat", "getTitle", "", "updateAvatarWithAvatarMeta", "context", "Landroid/content/Context;", "bitmap", "Landroid/graphics/Bitmap;", "avatarMeta", "avatarPath", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.c.b */
public final class GroupSettingAvatarEditModel extends AbstractC34590b implements IGroupSettingAvatarEditContract.IModel {

    /* renamed from: a */
    public final Chat f89282a;

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.group_setting.IGroupSettingAvatarEditContract.IModel
    /* renamed from: b */
    public Chat mo127775b() {
        return this.f89282a;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34590b
    public String ax_() {
        String name;
        Chat chat = this.f89282a;
        if (chat == null || (name = chat.getName()) == null) {
            return "";
        }
        return name;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/avatar/group_setting/GroupSettingAvatarEditModel$updateAvatarWithAvatarMeta$2", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/AvatarEditModel$OnFileSaveListener;", "onFailSaveFailed", "", "error", "", "onFileSaveSuccess", "path", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.c.b$b */
    public static final class C34577b implements AbstractC34590b.AbstractC34593a {

        /* renamed from: a */
        final /* synthetic */ GroupSettingAvatarEditModel f89286a;

        /* renamed from: b */
        final /* synthetic */ AvatarMeta f89287b;

        /* renamed from: c */
        final /* synthetic */ IGetDataCallback f89288c;

        @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34590b.AbstractC34593a
        /* renamed from: b */
        public void mo127764b(String str) {
            Log.m165383e("CreateTeamAvatarEditModel", str);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34590b.AbstractC34593a
        /* renamed from: a */
        public void mo127763a(String str) {
            this.f89286a.mo127774a(str, this.f89287b, this.f89288c);
        }

        C34577b(GroupSettingAvatarEditModel bVar, AvatarMeta avatarMeta, IGetDataCallback iGetDataCallback) {
            this.f89286a = bVar;
            this.f89287b = avatarMeta;
            this.f89288c = iGetDataCallback;
        }
    }

    public GroupSettingAvatarEditModel(Chat chat) {
        this.f89282a = chat;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/avatar/group_setting/GroupSettingAvatarEditModel$updateAvatarWithAvatarMeta$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.c.b$a */
    public static final class C34576a implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ GroupSettingAvatarEditModel f89283a;

        /* renamed from: b */
        final /* synthetic */ AvatarMeta f89284b;

        /* renamed from: c */
        final /* synthetic */ IGetDataCallback f89285c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f89285c.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            String str2;
            AbstractC34461c a = ChatSettingModule.m133639a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
            AbstractC34461c.AbstractC34466e d = a.mo127274d();
            Chat chat = this.f89283a.f89282a;
            if (chat == null || (str2 = chat.getId()) == null) {
                str2 = "";
            }
            if (str == null) {
                str = "";
            }
            d.mo127340a(str2, str, this.f89284b, (IGetDataCallback) this.f89283a.getCallbackManager().wrapAndAddCallback(this.f89285c));
        }

        C34576a(GroupSettingAvatarEditModel bVar, AvatarMeta avatarMeta, IGetDataCallback iGetDataCallback) {
            this.f89283a = bVar;
            this.f89284b = avatarMeta;
            this.f89285c = iGetDataCallback;
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34597d.AbstractC34598a
    /* renamed from: a */
    public void mo127760a(IGetDataCallback<AvatarMeta> iGetDataCallback) {
        String str;
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        AbstractC34461c a = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
        AbstractC34461c.AbstractC34466e d = a.mo127274d();
        Chat chat = this.f89282a;
        if (chat != null) {
            str = chat.getId();
        } else {
            str = null;
        }
        d.mo127372e(str, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.group_setting.IGroupSettingAvatarEditContract.IModel
    /* renamed from: a */
    public void mo127774a(String str, AvatarMeta avatarMeta, IGetDataCallback<Chat> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(avatarMeta, "avatarMeta");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        AbstractC34461c a = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
        a.mo127286p().mo127301a(str, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new C34576a(this, avatarMeta, iGetDataCallback)));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.group_setting.IGroupSettingAvatarEditContract.IModel
    /* renamed from: a */
    public void mo127773a(Context context, Bitmap bitmap, AvatarMeta avatarMeta, IGetDataCallback<Chat> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bitmap, "bitmap");
        Intrinsics.checkParameterIsNotNull(avatarMeta, "avatarMeta");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        mo127812a(bitmap, C57881t.m224651w(context) + System.currentTimeMillis() + ".png", new C34577b(this, avatarMeta, iGetDataCallback));
    }
}
