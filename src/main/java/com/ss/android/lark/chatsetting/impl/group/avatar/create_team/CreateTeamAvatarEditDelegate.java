package com.ss.android.lark.chatsetting.impl.group.avatar.create_team;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.AvatarMeta;
import com.ss.android.lark.chatsetting.impl.group.avatar.create_team.ICreateTeamAvatarEditContract;
import com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AvatarEditDelegate;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\f\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/avatar/create_team/CreateTeamAvatarEditDelegate;", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/AvatarEditDelegate;", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/create_team/ICreateTeamAvatarEditContract$IView$Delegate;", "model", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/create_team/ICreateTeamAvatarEditContract$IModel;", "view", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/create_team/ICreateTeamAvatarEditContract$IView;", "(Lcom/ss/android/lark/chatsetting/impl/group/avatar/create_team/ICreateTeamAvatarEditContract$IModel;Lcom/ss/android/lark/chatsetting/impl/group/avatar/create_team/ICreateTeamAvatarEditContract$IView;)V", "getModel", "()Lcom/ss/android/lark/chatsetting/impl/group/avatar/create_team/ICreateTeamAvatarEditContract$IModel;", "getView", "()Lcom/ss/android/lark/chatsetting/impl/group/avatar/create_team/ICreateTeamAvatarEditContract$IView;", "saveAvatar", "", "context", "Landroid/content/Context;", "bitmap", "Landroid/graphics/Bitmap;", "meta", "Lcom/ss/android/lark/chat/entity/chat/AvatarMeta;", "avatarPath", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.b.a */
public final class CreateTeamAvatarEditDelegate extends AvatarEditDelegate implements ICreateTeamAvatarEditContract.IView.Delegate {

    /* renamed from: a */
    private final ICreateTeamAvatarEditContract.IModel f89261a;

    /* renamed from: b */
    private final ICreateTeamAvatarEditContract.IView f89262b;

    /* renamed from: a */
    public ICreateTeamAvatarEditContract.IModel mo127754b() {
        return this.f89261a;
    }

    /* renamed from: c */
    public ICreateTeamAvatarEditContract.IView mo127756d() {
        return this.f89262b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/avatar/create_team/CreateTeamAvatarEditDelegate$saveAvatar$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "avatarKey", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.b.a$a */
    public static final class C34571a implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ CreateTeamAvatarEditDelegate f89263a;

        /* renamed from: b */
        final /* synthetic */ AvatarMeta f89264b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f89263a.mo127756d().mo127799d();
            this.f89263a.mo127756d().mo127798b(UIHelper.getString(R.string.Lark_Legacy_SaveFail));
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            Intrinsics.checkParameterIsNotNull(str, "avatarKey");
            this.f89263a.mo127756d().mo127799d();
            this.f89263a.mo127756d().mo127798b(UIHelper.getString(R.string.Lark_Legacy_SaveSuccess));
            this.f89263a.mo127756d().mo127766a(str, this.f89264b);
        }

        C34571a(CreateTeamAvatarEditDelegate aVar, AvatarMeta avatarMeta) {
            this.f89263a = aVar;
            this.f89264b = avatarMeta;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/avatar/create_team/CreateTeamAvatarEditDelegate$saveAvatar$2", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.b.a$b */
    public static final class C34572b implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ CreateTeamAvatarEditDelegate f89265a;

        /* renamed from: b */
        final /* synthetic */ AvatarMeta f89266b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f89265a.mo127756d().mo127799d();
            this.f89265a.mo127756d().mo127798b(UIHelper.getString(R.string.Lark_Legacy_SaveFail));
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            Intrinsics.checkParameterIsNotNull(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f89265a.mo127756d().mo127799d();
            this.f89265a.mo127756d().mo127798b(UIHelper.getString(R.string.Lark_Legacy_SaveSuccess));
            this.f89265a.mo127756d().mo127766a(str, this.f89266b);
        }

        C34572b(CreateTeamAvatarEditDelegate aVar, AvatarMeta avatarMeta) {
            this.f89265a = aVar;
            this.f89266b = avatarMeta;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateTeamAvatarEditDelegate(ICreateTeamAvatarEditContract.IModel aVar, ICreateTeamAvatarEditContract.IView bVar) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        this.f89261a = aVar;
        this.f89262b = bVar;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34597d.AbstractC34600b.AbstractC34601a
    /* renamed from: a */
    public void mo127753a(String str, AvatarMeta avatarMeta) {
        Intrinsics.checkParameterIsNotNull(avatarMeta, "meta");
        if (str == null) {
            str = "";
        }
        mo127754b().mo127761a(str, avatarMeta, new UIGetDataCallback(new C34572b(this, avatarMeta)));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34597d.AbstractC34600b.AbstractC34601a
    /* renamed from: a */
    public void mo127752a(Context context, Bitmap bitmap, AvatarMeta avatarMeta) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bitmap, "bitmap");
        Intrinsics.checkParameterIsNotNull(avatarMeta, "meta");
        mo127754b().mo127759a(context, bitmap, avatarMeta, new UIGetDataCallback(new C34571a(this, avatarMeta)));
    }
}
