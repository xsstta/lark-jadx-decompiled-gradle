package com.ss.android.lark.platform.diskmanage;

import android.app.Application;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.dependency.AbstractC36119d;
import com.ss.android.lark.core.dependency.AbstractC36122g;
import com.ss.android.lark.diskmanage.GlobalConfig;
import com.ss.android.lark.diskmanage.RemoteConfig;
import com.ss.android.lark.diskmanage.clean.DiskCleanTaskManager;
import com.ss.android.lark.diskmanage.clean.IDiskCleanTask;
import com.ss.android.lark.diskmanage.smalldisk.settings.DiskStrategyConfig;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.C57765ac;
import com.ss.android.lark.utils.C57849k;
import com.ss.android.lark.utils.LarkContext;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0014\u0010\u0007\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\b\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0006H\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u0014\u0010\u000f\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\tJ\u0006\u0010\u0011\u001a\u00020\u0004¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/platform/diskmanage/DiskManageProvider;", "", "()V", "checkInit", "", "getBackgroundCleanConfig", "Lcom/ss/android/lark/diskmanage/RemoteConfig;", "getCanManualSize", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "initTasks", "parseRemoteClean", "performRemoteClean", "remoteConfig", "startManualClean", "", "startRemoteClean", "Companion", "SingletonHolder", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.platform.h.b */
public final class DiskManageProvider {

    /* renamed from: a */
    public static final Companion f128752a = new Companion(null);

    /* renamed from: b */
    private static AtomicBoolean f128753b = new AtomicBoolean(false);

    @JvmStatic
    /* renamed from: c */
    public static final DiskManageProvider m200842c() {
        return f128752a.mo177936a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/platform/diskmanage/DiskManageProvider$Companion;", "", "()V", "KEY_DISK_MAIN_REMOTE_CLEAN_DATE", "", "KEY_DISK_MANAGE_SETTING", "KEY_DISK_P0_REMOTE_CLEAN_DATE", "TAG", "sHasInit", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInstance", "Lcom/ss/android/lark/platform/diskmanage/DiskManageProvider;", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.platform.h.b$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final DiskManageProvider mo177936a() {
            return SingletonHolder.f128754a.mo177937a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/platform/diskmanage/DiskManageProvider$SingletonHolder;", "", "()V", "INSTANCE", "Lcom/ss/android/lark/platform/diskmanage/DiskManageProvider;", "getINSTANCE", "()Lcom/ss/android/lark/platform/diskmanage/DiskManageProvider;", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.platform.h.b$b */
    public static final class SingletonHolder {

        /* renamed from: a */
        public static final SingletonHolder f128754a = new SingletonHolder();

        /* renamed from: b */
        private static final DiskManageProvider f128755b = new DiskManageProvider();

        private SingletonHolder() {
        }

        /* renamed from: a */
        public final DiskManageProvider mo177937a() {
            return f128755b;
        }
    }

    /* renamed from: b */
    public final RemoteConfig mo177934b() {
        return m200845f();
    }

    /* renamed from: e */
    private final void m200844e() {
        if (!f128753b.get()) {
            m200843d();
        }
    }

    /* renamed from: a */
    public final void mo177932a() {
        m200844e();
        m200841a(m200845f());
    }

    /* renamed from: d */
    private final void m200843d() {
        if (!f128753b.get()) {
            Application application = LarkContext.getApplication();
            if (C57765ac.m224188b(application)) {
                DiskCleanTaskManager.f94590b.mo135593a().mo135590a(new DefaultCleanTask());
                DiskCleanTaskManager.f94590b.mo135593a().mo135590a(new RustCleanTask());
                AbstractC36119d a = C36083a.m141486a();
                Intrinsics.checkExpressionValueIsNotNull(a, "CoreModule.getDependency()");
                AbstractC36122g iMDependency = a.getIMDependency();
                Intrinsics.checkExpressionValueIsNotNull(iMDependency, "CoreModule.getDependency().imDependency");
                IDiskCleanTask y = iMDependency.mo132964y();
                if (y != null) {
                    DiskCleanTaskManager.f94590b.mo135593a().mo135590a(y);
                }
                AbstractC36119d a2 = C36083a.m141486a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "CoreModule.getDependency()");
                a2.getOpenFeatureDependency().mo132994a(DiskCleanTaskManager.f94590b.mo135593a());
            } else if (C57765ac.m224187a(application)) {
                AbstractC36119d a3 = C36083a.m141486a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "CoreModule.getDependency()");
                a3.getOpenFeatureDependency().mo132999b(DiskCleanTaskManager.f94590b.mo135593a());
            }
            f128753b.set(true);
        }
    }

    /* renamed from: f */
    private final RemoteConfig m200845f() {
        C57744a a = C57744a.m224104a();
        String string = a.getString("key_disk_manage_setting", "");
        Log.m165389i("DiskManageProvider", "startRemoteClean, settingJson: " + string);
        RemoteConfig dVar = new RemoteConfig(null, null, 3, null);
        if (TextUtils.isEmpty(string)) {
            return dVar;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            JSONObject optJSONObject = jSONObject.optJSONObject("global");
            if (optJSONObject == null) {
                Intrinsics.throwNpe();
            }
            GlobalConfig a2 = dVar.mo135639a();
            a2.mo135565a(optJSONObject.optLong("clean_interval"));
            a2.mo135567b(optJSONObject.optLong("idle_delay"));
            a2.mo135569c(optJSONObject.optLong("sdk_task_cost_limit"));
            a2.mo135570d(optJSONObject.optLong("task_cost_limit"));
            a2.mo135571e(optJSONObject.optLong("cache_time_limit"));
            a2.mo135573f(optJSONObject.optLong("auto_clean_max_times"));
            String optString = jSONObject.optString("cache_config");
            Intrinsics.checkExpressionValueIsNotNull(optString, "remoteObject.optString(\"cache_config\")");
            dVar.mo135640a(optString);
            DiskStrategyConfig.parse(dVar.mo135641b());
            if (!a.getBoolean("small_disk_on", false)) {
                return dVar;
            }
            float f = a.getFloat("disk_timeout_factor", 1.0f);
            a2.mo135565a((long) (((float) a2.mo135564a()) * f));
            a2.mo135571e((long) (((float) a2.mo135568c()) * f));
            return dVar;
        } catch (Exception e) {
            RemoteConfig dVar2 = new RemoteConfig(null, null, 3, null);
            Log.m165383e("DiskManageProvider", "parse remote config failed: " + e);
            return dVar2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/platform/diskmanage/DiskManageProvider$getCanManualSize$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "canManualSize", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.platform.h.b$c */
    public static final class C51809c implements IGetDataCallback<Double> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f128756a;

        C51809c(IGetDataCallback iGetDataCallback) {
            this.f128756a = iGetDataCallback;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f128756a.onSuccess("0.00MB");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Double d) {
            mo177938a(d.doubleValue());
        }

        /* renamed from: a */
        public void mo177938a(double d) {
            double d2;
            if (d <= ((double) 3145728)) {
                d2 = 0.0d;
            } else {
                d2 = d;
            }
            String a = C57849k.m224519a(d2);
            Log.m165389i("DiskManageProvider", "canManualSize: " + d + ", totalSize: " + d2 + ", formatSize: " + a);
            this.f128756a.onSuccess(a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/platform/diskmanage/DiskManageProvider$performRemoteClean$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.platform.h.b$d */
    public static final class C51810d implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ String f128757a;

        /* renamed from: b */
        final /* synthetic */ long f128758b;

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            C57744a.m224104a().putLong(this.f128757a, this.f128758b);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            C57744a.m224104a().putLong(this.f128757a, this.f128758b);
        }

        C51810d(String str, long j) {
            this.f128757a = str;
            this.f128758b = j;
        }
    }

    /* renamed from: a */
    public final void mo177933a(IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        Log.m165389i("DiskManageProvider", "startManualClean");
        m200844e();
        DiskCleanTaskManager.f94590b.mo135593a().mo135589a(iGetDataCallback);
    }

    /* renamed from: b */
    public final void mo177935b(IGetDataCallback<String> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        Log.m165389i("DiskManageProvider", "getCanManualSize");
        m200844e();
        DiskCleanTaskManager.f94590b.mo135593a().mo135592b(new C51809c(iGetDataCallback));
    }

    /* renamed from: a */
    private final void m200841a(RemoteConfig dVar) {
        String str;
        Application application = LarkContext.getApplication();
        if (C57765ac.m224188b(application)) {
            str = "key_disk_main_remote_clean_date";
        } else if (C57765ac.m224187a(application)) {
            str = "key_disk_P0_remote_clean_date";
        } else {
            str = "";
        }
        Log.m165389i("DiskManageProvider", "startRemoteClean, key: " + str);
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - C57744a.m224104a().getLong(str, 0)) - (dVar.mo135639a().mo135564a() * ((long) 1000)) > 0) {
            DiskCleanTaskManager.f94590b.mo135593a().mo135591a(dVar, new C51810d(str, currentTimeMillis));
        }
    }
}
