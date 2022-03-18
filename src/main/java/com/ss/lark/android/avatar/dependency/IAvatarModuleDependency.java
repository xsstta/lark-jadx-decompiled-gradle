package com.ss.lark.android.avatar.dependency;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001:\u0002\u0019\u001aJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u001e\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0010H&J&\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0010H&J\u001e\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0010H&J\u001e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0010H&J\u001e\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0010H&¨\u0006\u001b"}, d2 = {"Lcom/ss/lark/android/avatar/dependency/IAvatarModuleDependency;", "", "getFeatureGatingService", "Lcom/ss/lark/android/avatar/dependency/IAvatarModuleDependency$IFeatureGatingService;", "getPushAvatarRegistry", "Lcom/ss/lark/android/avatar/dependency/IAvatarModuleDependency$IPushAvatarRegistry;", "isGooglePlay", "", "openMiniApp", "", "context", "Landroid/content/Context;", "scheme", "", "requestAvatarAppList", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "updateGroupAvatar", "chatId", "avatarKey", "updateMineAvatar", "updateMomentsProfileBackground", "backgroundToken", "uploadProfileCoverKey", "imageKey", "IFeatureGatingService", "IPushAvatarRegistry", "core_avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.avatar.a.a */
public interface IAvatarModuleDependency {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/ss/lark/android/avatar/dependency/IAvatarModuleDependency$IFeatureGatingService;", "", "isFeatureGatingEnabled", "", "featureGatingName", "", "defaultValue", "core_avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.avatar.a.a$a */
    public interface IFeatureGatingService {
        /* renamed from: a */
        boolean mo132684a(String str, boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\b"}, d2 = {"Lcom/ss/lark/android/avatar/dependency/IAvatarModuleDependency$IPushAvatarRegistry;", "", "addPushAvatarListener", "", "listener", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;", "removePushAvatarListener", "core_avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.avatar.a.a$b */
    public interface IPushAvatarRegistry {
        /* renamed from: a */
        void mo132682a(IGetDataCallback<PhotoItem> iGetDataCallback);

        /* renamed from: b */
        void mo132683b(IGetDataCallback<PhotoItem> iGetDataCallback);
    }

    /* renamed from: a */
    IPushAvatarRegistry mo132670a();

    /* renamed from: a */
    void mo132671a(Context context, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo132672a(Context context, String str);

    /* renamed from: a */
    void mo132673a(String str, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo132675a(String str, String str2, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: b */
    IFeatureGatingService mo132676b();

    /* renamed from: b */
    void mo132677b(String str, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: c */
    void mo132678c(String str, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: c */
    boolean mo132679c();
}
