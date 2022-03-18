package com.ss.android.lark.app.taskv2.preload;

import android.content.Context;
import android.net.Uri;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49380b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49381c;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.platform.applink.C51707a;
import com.ss.android.lark.ug.facade.UgReachSdk;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0003\t\n\u000bB\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/app/taskv2/preload/InitUgSdkTask;", "Lcom/larksuite/framework/launch/task/AsyncLaunchTask;", "", "()V", "execute", "", "context", "Landroid/content/Context;", "initUgSdk", "Companion", "SwitchTenantListener", "UgReachSdkHelper", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class InitUgSdkTask extends AsyncLaunchTask<Object> {

    /* renamed from: a */
    public static final Companion f72795a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/app/taskv2/preload/InitUgSdkTask$Companion;", "", "()V", "TAG", "", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u001c\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010\n\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/app/taskv2/preload/InitUgSdkTask$UgReachSdkHelper;", "", "()V", "destroy", "", "openUrl", "context", "Landroid/content/Context;", "url", "", "setup", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class UgReachSdkHelper {

        /* renamed from: a */
        public static final UgReachSdkHelper f72797a = new UgReachSdkHelper();

        private UgReachSdkHelper() {
        }

        /* renamed from: a */
        public final void mo103088a() {
            UgReachSdk.INSTANCE.destroy();
        }

        /* renamed from: a */
        public final void mo103089a(Context context) {
            UgReachSdk.INSTANCE.setup(new InitUgSdkTask$UgReachSdkHelper$setup$1(context));
        }

        /* renamed from: a */
        public final void mo103090a(Context context, String str) {
            boolean z;
            String str2;
            if (context != null) {
                if (str != null) {
                    if (str.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        str2 = str;
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        if (C51707a.m200495a().mo103470a(Uri.parse(str))) {
                            C51707a.m200495a().mo103471b(context, str2, 0);
                            return;
                        } else {
                            ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openUrl(context, str);
                            return;
                        }
                    }
                }
                Log.m165383e("InitUgSdkTask", "url is null or empty, url=" + str);
                return;
            }
            Log.m165383e("InitUgSdkTask", "context is null, url=" + str);
        }
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        m106818b(context);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/app/taskv2/preload/InitUgSdkTask$SwitchTenantListener;", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/user_switch/OnUserSwitchListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "onUserSwitchBegin", "", "userSwitchEndContext", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/user_switch/UserSwitchBeginContext;", "onUserSwitchFailed", "userSwitchFailedContext", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/user_switch/UserSwitchFailedContext;", "onUserSwitchSuccess", "userSwitchSuccessContext", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/user_switch/UserSwitchSuccessContext;", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class SwitchTenantListener implements AbstractC49379a {

        /* renamed from: a */
        public final Context f72796a;

        public SwitchTenantListener(Context context) {
            this.f72796a = context;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
        /* renamed from: a */
        public void mo102549a(C49380b bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "userSwitchEndContext");
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getCachedThreadPool().execute(InitUgSdkTask$SwitchTenantListener$onUserSwitchBegin$1.f72798a);
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
        public void onUserSwitchSuccess(C49382d dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "userSwitchSuccessContext");
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getCachedThreadPool().execute(new InitUgSdkTask$SwitchTenantListener$onUserSwitchSuccess$1(this));
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
        /* renamed from: a */
        public void mo102550a(C49381c cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "userSwitchFailedContext");
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getCachedThreadPool().execute(new InitUgSdkTask$SwitchTenantListener$onUserSwitchFailed$1(this));
        }
    }

    /* renamed from: b */
    private final void m106818b(Context context) {
        UgReachSdkHelper.f72797a.mo103089a(context);
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).registerUserSwitchListener(new SwitchTenantListener(context));
    }
}
