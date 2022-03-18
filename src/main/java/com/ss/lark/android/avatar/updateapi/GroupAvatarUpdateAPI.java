package com.ss.lark.android.avatar.updateapi;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.log.Log;
import com.ss.lark.android.avatar.AvatarModule;
import com.ss.lark.android.avatar.dependency.IAvatarModuleDependency;
import com.ss.lark.android.avatar.service.AvatarService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/lark/android/avatar/updateapi/GroupAvatarUpdateAPI;", "Lcom/ss/lark/android/avatar/updateapi/IUpdateAvatarAPI;", "chatId", "", "(Ljava/lang/String;)V", "doRequest", "", "avatarPath", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Companion", "core_avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class GroupAvatarUpdateAPI implements IUpdateAvatarAPI {
    public static final Companion Companion = new Companion(null);
    public final String chatId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/lark/android/avatar/updateapi/GroupAvatarUpdateAPI$Companion;", "", "()V", "TAG", "", "core_avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.avatar.updateapi.GroupAvatarUpdateAPI$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public GroupAvatarUpdateAPI(String str) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        this.chatId = str;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/lark/android/avatar/updateapi/GroupAvatarUpdateAPI$doRequest$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "avatarKey", "core_avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.avatar.updateapi.GroupAvatarUpdateAPI$b */
    public static final class C64259b implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ GroupAvatarUpdateAPI f162442a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f162443b;

        /* renamed from: a */
        public void onSuccess(String str) {
            Intrinsics.checkParameterIsNotNull(str, "avatarKey");
            IAvatarModuleDependency a = AvatarModule.f162301b.mo222601a();
            if (a != null) {
                a.mo132675a(this.f162442a.chatId, str, this.f162443b);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165389i("GroupAvatarUpdateAPI", "GroupAvatarUpdateAPI#uploadAvatar onError: " + errorResult);
            this.f162443b.onError(errorResult);
        }

        C64259b(GroupAvatarUpdateAPI groupAvatarUpdateAPI, IGetDataCallback iGetDataCallback) {
            this.f162442a = groupAvatarUpdateAPI;
            this.f162443b = iGetDataCallback;
        }
    }

    @Override // com.ss.lark.android.avatar.updateapi.IUpdateAvatarAPI
    public void doRequest(String str, IGetDataCallback<String> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "avatarPath");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        AvatarService.f162321a.mo222616a(str, new C64259b(this, iGetDataCallback));
    }
}
