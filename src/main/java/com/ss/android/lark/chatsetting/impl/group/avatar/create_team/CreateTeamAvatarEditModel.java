package com.ss.android.lark.chatsetting.impl.group.avatar.create_team;

import android.content.Context;
import android.graphics.Bitmap;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chat.AvatarMeta;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.group.avatar.create_team.ICreateTeamAvatarEditContract;
import com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34590b;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.chatsetting.service.ChatSettingService;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57881t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J0\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000eH\u0016J*\u0010\u0010\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000eH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/avatar/create_team/CreateTeamAvatarEditModel;", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/create_team/ICreateTeamAvatarEditContract$IModel;", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/AvatarEditModel;", "avatarKey", "", "teamName", "avatarMeta", "Lcom/ss/android/lark/chat/entity/chat/AvatarMeta;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/chat/entity/chat/AvatarMeta;)V", "getAvatarKey", "()Ljava/lang/String;", "getAvatarMeta", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "getTitle", "updateAvatarWithAvatarMeta", "context", "Landroid/content/Context;", "bitmap", "Landroid/graphics/Bitmap;", "avatarPath", "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.b.b */
public final class CreateTeamAvatarEditModel extends AbstractC34590b implements ICreateTeamAvatarEditContract.IModel {

    /* renamed from: a */
    public static final Companion f89267a = new Companion(null);

    /* renamed from: b */
    private final String f89268b;

    /* renamed from: c */
    private final String f89269c;

    /* renamed from: d */
    private final AvatarMeta f89270d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/avatar/create_team/CreateTeamAvatarEditModel$Companion;", "", "()V", "LOG_TAG", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34590b
    public String ax_() {
        String str = this.f89269c;
        if (str != null) {
            return str;
        }
        return "";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/avatar/create_team/CreateTeamAvatarEditModel$updateAvatarWithAvatarMeta$1", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/AvatarEditModel$OnFileSaveListener;", "onFailSaveFailed", "", "error", "", "onFileSaveSuccess", "path", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.b.b$b */
    public static final class C34573b implements AbstractC34590b.AbstractC34593a {

        /* renamed from: a */
        final /* synthetic */ CreateTeamAvatarEditModel f89271a;

        /* renamed from: b */
        final /* synthetic */ AvatarMeta f89272b;

        /* renamed from: c */
        final /* synthetic */ IGetDataCallback f89273c;

        @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34590b.AbstractC34593a
        /* renamed from: b */
        public void mo127764b(String str) {
            Log.m165383e("CreateTeamAvatarEditModel", str);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34590b.AbstractC34593a
        /* renamed from: a */
        public void mo127763a(String str) {
            this.f89271a.mo127761a(str, this.f89272b, this.f89273c);
        }

        C34573b(CreateTeamAvatarEditModel bVar, AvatarMeta avatarMeta, IGetDataCallback iGetDataCallback) {
            this.f89271a = bVar;
            this.f89272b = avatarMeta;
            this.f89273c = iGetDataCallback;
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34597d.AbstractC34598a
    /* renamed from: a */
    public void mo127760a(IGetDataCallback<AvatarMeta> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        ChatSettingService.f88988a.mo127459a(this.f89268b, iGetDataCallback);
    }

    public CreateTeamAvatarEditModel(String str, String str2, AvatarMeta avatarMeta) {
        Intrinsics.checkParameterIsNotNull(str, "avatarKey");
        this.f89268b = str;
        this.f89269c = str2;
        this.f89270d = avatarMeta;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.create_team.ICreateTeamAvatarEditContract.IModel
    /* renamed from: a */
    public void mo127761a(String str, AvatarMeta avatarMeta, IGetDataCallback<String> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(avatarMeta, "avatarMeta");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        AbstractC34461c a = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
        a.mo127286p().mo127301a(str, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.create_team.ICreateTeamAvatarEditContract.IModel
    /* renamed from: a */
    public void mo127759a(Context context, Bitmap bitmap, AvatarMeta avatarMeta, IGetDataCallback<String> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bitmap, "bitmap");
        Intrinsics.checkParameterIsNotNull(avatarMeta, "avatarMeta");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        mo127812a(bitmap, C57881t.m224651w(context) + System.currentTimeMillis() + ".png", new C34573b(this, avatarMeta, iGetDataCallback));
    }
}
