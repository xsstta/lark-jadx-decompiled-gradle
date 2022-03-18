package com.ss.android.lark.chatsetting.impl.group.avatar.group_setting;

import android.content.Context;
import android.graphics.Bitmap;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.entity.chat.AvatarMeta;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.impl.group.avatar.group_setting.IGroupSettingAvatarEditContract;
import com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AvatarEditDelegate;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.statistics.PerfImageUploadMonitor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/avatar/group_setting/GroupSettingAvatarEditDelegate;", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/AvatarEditDelegate;", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/group_setting/IGroupSettingAvatarEditContract$IView$Delegate;", "model", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/group_setting/IGroupSettingAvatarEditContract$IModel;", "view", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/group_setting/IGroupSettingAvatarEditContract$IView;", "(Lcom/ss/android/lark/chatsetting/impl/group/avatar/group_setting/IGroupSettingAvatarEditContract$IModel;Lcom/ss/android/lark/chatsetting/impl/group/avatar/group_setting/IGroupSettingAvatarEditContract$IView;)V", "getModel", "()Lcom/ss/android/lark/chatsetting/impl/group/avatar/group_setting/IGroupSettingAvatarEditContract$IModel;", "getView", "()Lcom/ss/android/lark/chatsetting/impl/group/avatar/group_setting/IGroupSettingAvatarEditContract$IView;", "getChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "saveAvatar", "", "context", "Landroid/content/Context;", "bitmap", "Landroid/graphics/Bitmap;", "meta", "Lcom/ss/android/lark/chat/entity/chat/AvatarMeta;", "avatarPath", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.c.a */
public final class GroupSettingAvatarEditDelegate extends AvatarEditDelegate implements IGroupSettingAvatarEditContract.IView.Delegate {

    /* renamed from: a */
    private final IGroupSettingAvatarEditContract.IModel f89278a;

    /* renamed from: b */
    private final IGroupSettingAvatarEditContract.IView f89279b;

    /* renamed from: c */
    public IGroupSettingAvatarEditContract.IModel mo127754b() {
        return this.f89278a;
    }

    /* renamed from: e */
    public IGroupSettingAvatarEditContract.IView mo127756d() {
        return this.f89279b;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.group_setting.IGroupSettingAvatarEditContract.IView.Delegate
    /* renamed from: a */
    public Chat mo127768a() {
        return mo127754b().mo127775b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/avatar/group_setting/GroupSettingAvatarEditDelegate$saveAvatar$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "chat", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.c.a$a */
    public static final class C34574a implements IGetDataCallback<Chat> {

        /* renamed from: a */
        final /* synthetic */ GroupSettingAvatarEditDelegate f89280a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34574a(GroupSettingAvatarEditDelegate aVar) {
            this.f89280a = aVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f89280a.mo127756d().mo127799d();
            this.f89280a.mo127756d().mo127798b(UIHelper.getString(R.string.Lark_Legacy_SaveFail));
        }

        /* renamed from: a */
        public void onSuccess(Chat chat) {
            this.f89280a.mo127756d().mo127799d();
            this.f89280a.mo127756d().mo127798b(UIHelper.getString(R.string.Lark_Legacy_SaveSuccess));
            this.f89280a.mo127756d().mo127800e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/avatar/group_setting/GroupSettingAvatarEditDelegate$saveAvatar$2", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "chat", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.c.a$b */
    public static final class C34575b implements IGetDataCallback<Chat> {

        /* renamed from: a */
        final /* synthetic */ GroupSettingAvatarEditDelegate f89281a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34575b(GroupSettingAvatarEditDelegate aVar) {
            this.f89281a = aVar;
        }

        /* renamed from: a */
        public void onSuccess(Chat chat) {
            this.f89281a.mo127756d().mo127799d();
            this.f89281a.mo127756d().mo127798b(UIHelper.getString(R.string.Lark_Legacy_SaveSuccess));
            this.f89281a.mo127756d().mo127800e();
            PerfImageUploadMonitor.f145430a.mo199309a();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f89281a.mo127756d().mo127799d();
            this.f89281a.mo127756d().mo127798b(UIHelper.getString(R.string.Lark_Legacy_SaveFail));
            PerfImageUploadMonitor.f145430a.mo199315b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupSettingAvatarEditDelegate(IGroupSettingAvatarEditContract.IModel aVar, IGroupSettingAvatarEditContract.IView bVar) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        this.f89278a = aVar;
        this.f89279b = bVar;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34597d.AbstractC34600b.AbstractC34601a
    /* renamed from: a */
    public void mo127753a(String str, AvatarMeta avatarMeta) {
        Intrinsics.checkParameterIsNotNull(avatarMeta, "meta");
        if (str == null) {
            str = "";
        }
        PerfImageUploadMonitor.f145430a.mo199312a(Biz.Messenger, Scene.GroupAvatar, 5);
        mo127754b().mo127774a(str, avatarMeta, new UIGetDataCallback(new C34575b(this)));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34597d.AbstractC34600b.AbstractC34601a
    /* renamed from: a */
    public void mo127752a(Context context, Bitmap bitmap, AvatarMeta avatarMeta) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bitmap, "bitmap");
        Intrinsics.checkParameterIsNotNull(avatarMeta, "meta");
        mo127754b().mo127773a(context, bitmap, avatarMeta, new UIGetDataCallback(new C34574a(this)));
    }
}
