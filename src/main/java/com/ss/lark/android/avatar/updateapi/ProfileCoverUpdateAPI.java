package com.ss.lark.android.avatar.updateapi;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.photo_picker.statistics.PerfImageUploadMonitor;
import com.ss.lark.android.avatar.AvatarModule;
import com.ss.lark.android.avatar.dependency.IAvatarModuleDependency;
import com.ss.lark.android.avatar.service.AvatarService;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016¨\u0006\n"}, d2 = {"Lcom/ss/lark/android/avatar/updateapi/ProfileCoverUpdateAPI;", "Lcom/ss/lark/android/avatar/updateapi/IUpdateAvatarAPI;", "()V", "doRequest", "", "profileCoverPath", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Companion", "core_avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ProfileCoverUpdateAPI implements IUpdateAvatarAPI {
    public static final Companion Companion = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/lark/android/avatar/updateapi/ProfileCoverUpdateAPI$Companion;", "", "()V", "TAG", "", "core_avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.avatar.updateapi.ProfileCoverUpdateAPI$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/lark/android/avatar/updateapi/ProfileCoverUpdateAPI$doRequest$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "coverKey", "core_avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.avatar.updateapi.ProfileCoverUpdateAPI$b */
    public static final class C64261b implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f162445a;

        C64261b(IGetDataCallback iGetDataCallback) {
            this.f162445a = iGetDataCallback;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165397w("ProfileCoverUpdateAPI", "upload profile cover file faild!");
            PerfImageUploadMonitor.f145430a.mo199315b();
            this.f162445a.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            PerfImageUploadMonitor.f145430a.mo199309a();
            if (TextUtils.isEmpty(str)) {
                Log.m165397w("ProfileCoverUpdateAPI", "cover key is empty: " + str);
                return;
            }
            IAvatarModuleDependency a = AvatarModule.f162301b.mo222601a();
            if (a != null) {
                if (str == null) {
                    Intrinsics.throwNpe();
                }
                a.mo132673a(str, this.f162445a);
            }
        }
    }

    @Override // com.ss.lark.android.avatar.updateapi.IUpdateAvatarAPI
    public void doRequest(String str, IGetDataCallback<String> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "profileCoverPath");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        PerfImageUploadMonitor.f145430a.mo199312a(Biz.Core, Scene.Profile, 9);
        if (!TextUtils.isEmpty(str)) {
            PerfImageUploadMonitor.f145430a.mo199317b(0, 0, (int) C26311p.m95281c(new File(str)));
        }
        AvatarService.f162321a.mo222618c(str, new C64261b(iGetDataCallback));
    }
}
