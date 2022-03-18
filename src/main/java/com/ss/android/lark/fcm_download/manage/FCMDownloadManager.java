package com.ss.android.lark.fcm_download.manage;

import android.app.Activity;
import android.os.Looper;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.biz.core.api.CheckDownloadDialogCallback;
import com.ss.android.lark.fcm_download.FCMDownloadModule;
import com.ss.android.lark.fcm_download.IFCMDownModuleDependency;
import com.ss.android.lark.fcm_download.service.FCMDownloadService;
import com.ss.android.lark.fcm_download.utils.DialogDismissCallback;
import com.ss.android.lark.fcm_download.utils.FCMDownloadUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/fcm_download/manage/FCMDownloadManager;", "", "()V", "mActivityWeakReference", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "mIsChecking", "Ljava/util/concurrent/atomic/AtomicBoolean;", "checkDownloadWithDialog", "", "activity", "callback", "Lcom/ss/android/lark/biz/core/api/CheckDownloadDialogCallback;", "continueCheckDownloadWithDialog", "onDialogComplete", "Companion", "SingletonHolder", "core_fcm_fcm-download_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.fcm_download.manage.b */
public final class FCMDownloadManager {

    /* renamed from: b */
    public static final Companion f95622b = new Companion(null);

    /* renamed from: a */
    public WeakReference<Activity> f95623a;

    /* renamed from: c */
    private AtomicBoolean f95624c = new AtomicBoolean(false);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/fcm_download/manage/FCMDownloadManager$Companion;", "", "()V", "TAG", "", "init", "Lcom/ss/android/lark/fcm_download/manage/FCMDownloadManager;", "core_fcm_fcm-download_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.fcm_download.manage.b$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final FCMDownloadManager mo136931a() {
            return SingletonHolder.f95625a.mo136932a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/fcm_download/manage/FCMDownloadManager$SingletonHolder;", "", "()V", "INSTANCE", "Lcom/ss/android/lark/fcm_download/manage/FCMDownloadManager;", "getINSTANCE", "()Lcom/ss/android/lark/fcm_download/manage/FCMDownloadManager;", "core_fcm_fcm-download_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.fcm_download.manage.b$b */
    public static final class SingletonHolder {

        /* renamed from: a */
        public static final SingletonHolder f95625a = new SingletonHolder();

        /* renamed from: b */
        private static final FCMDownloadManager f95626b = new FCMDownloadManager();

        private SingletonHolder() {
        }

        /* renamed from: a */
        public final FCMDownloadManager mo136932a() {
            return f95626b;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.fcm_download.manage.b$e */
    public static final class RunnableC37238e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CheckDownloadDialogCallback f95635a;

        RunnableC37238e(CheckDownloadDialogCallback cVar) {
            this.f95635a = cVar;
        }

        public final void run() {
            this.f95635a.onDialogComplete();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/fcm_download/manage/FCMDownloadManager$continueCheckDownloadWithDialog$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "hasCertification", "core_fcm_fcm-download_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.fcm_download.manage.b$d */
    public static final class C37235d implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ FCMDownloadManager f95630a;

        /* renamed from: b */
        final /* synthetic */ CheckDownloadDialogCallback f95631b;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.fcm_download.manage.b$d$a */
        public static final class RunnableC37236a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C37235d f95632a;

            /* renamed from: b */
            final /* synthetic */ Activity f95633b;

            RunnableC37236a(C37235d dVar, Activity activity) {
                this.f95632a = dVar;
                this.f95633b = activity;
            }

            public final void run() {
                FCMDownloadUtils.f95615a.mo136920a(this.f95633b, (DialogDismissCallback) new DialogDismissCallback(this) {
                    /* class com.ss.android.lark.fcm_download.manage.FCMDownloadManager.C37235d.RunnableC37236a.C372371 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC37236a f95634a;

                    @Override // com.ss.android.lark.fcm_download.utils.DialogDismissCallback
                    /* renamed from: a */
                    public void mo136919a() {
                        this.f95634a.f95632a.f95630a.mo136929a(this.f95634a.f95632a.f95631b);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f95634a = r1;
                    }
                });
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Boolean bool) {
            mo136934a(bool.booleanValue());
        }

        /* renamed from: a */
        public void mo136934a(boolean z) {
            Activity activity;
            Log.m165389i("FCMDownloadManager", "hasCertification: " + z);
            WeakReference<Activity> weakReference = this.f95630a.f95623a;
            if (weakReference != null) {
                activity = weakReference.get();
            } else {
                activity = null;
            }
            if (!z || activity == null) {
                this.f95630a.mo136929a(this.f95631b);
                return;
            }
            FCMDialogStateManager.m146631a(FCMDialogState.SHOW_DIALOG);
            UICallbackExecutor.execute(new RunnableC37236a(this, activity));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("FCMDownloadManager", "fetchTenantCertificationInfo error: " + errorResult.getDisplayMsg());
            this.f95630a.mo136929a(this.f95631b);
        }

        C37235d(FCMDownloadManager bVar, CheckDownloadDialogCallback cVar) {
            this.f95630a = bVar;
            this.f95631b = cVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/lark/fcm_download/manage/FCMDownloadManager$checkDownloadWithDialog$1$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/passport/signinsdk_api/interfaces/IDeviceService$Country;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_fcm_fcm-download_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.fcm_download.manage.b$c */
    public static final class C37234c implements IGetDataCallback<IDeviceService.Country> {

        /* renamed from: a */
        final /* synthetic */ FCMDownloadManager f95627a;

        /* renamed from: b */
        final /* synthetic */ CheckDownloadDialogCallback f95628b;

        /* renamed from: c */
        final /* synthetic */ Activity f95629c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165389i("FCMDownloadManager", "getInfo error, for no dialog disturb, no dialog");
        }

        /* renamed from: a */
        public void onSuccess(IDeviceService.Country country) {
            if (country == null) {
                return;
            }
            if (Intrinsics.areEqual(country.getIsoCode(), "CN")) {
                Log.m165389i("FCMDownloadManager", "isoCode is: " + country.getIsoCode() + ", no dialog");
                this.f95627a.mo136929a(this.f95628b);
                return;
            }
            Log.m165389i("FCMDownloadManager", "isoCode is: " + country.getIsoCode() + ", continue dialog check");
            this.f95627a.mo136930b(this.f95629c, this.f95628b);
        }

        C37234c(FCMDownloadManager bVar, CheckDownloadDialogCallback cVar, Activity activity) {
            this.f95627a = bVar;
            this.f95628b = cVar;
            this.f95629c = activity;
        }
    }

    /* renamed from: a */
    public final void mo136929a(CheckDownloadDialogCallback cVar) {
        this.f95624c.set(false);
        if (Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
            cVar.onDialogComplete();
        } else {
            UICallbackExecutor.execute(new RunnableC37238e(cVar));
        }
    }

    /* renamed from: a */
    public final void mo136928a(Activity activity, CheckDownloadDialogCallback cVar) {
        IFCMDownModuleDependency.IPassportDependency c;
        IDeviceService iDeviceService;
        IFCMDownModuleDependency.IPassportDependency c2;
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        if (this.f95624c.get()) {
            cVar.onDialogComplete();
            return;
        }
        this.f95624c.set(true);
        this.f95623a = new WeakReference<>(activity);
        IFCMDownModuleDependency a = FCMDownloadModule.f95612b.mo136916a();
        if (a == null || (c = a.mo133163c()) == null || !c.mo133164a()) {
            Log.m165389i("FCMDownloadManager", "not login, for no dialog disturb, no dialog");
            return;
        }
        IFCMDownModuleDependency a2 = FCMDownloadModule.f95612b.mo136916a();
        if (a2 == null || (c2 = a2.mo133163c()) == null) {
            iDeviceService = null;
        } else {
            iDeviceService = c2.mo133165b();
        }
        if (iDeviceService != null) {
            iDeviceService.getGeoInfo(null, new C37234c(this, cVar, activity));
            return;
        }
        Log.m165389i("FCMDownloadManager", "deviceService information is null, To ensure offline push, continue dialog check");
        mo136930b(activity, cVar);
    }

    /* renamed from: b */
    public final void mo136930b(Activity activity, CheckDownloadDialogCallback cVar) {
        boolean a = FCMDownloadUtils.m146623a();
        IFCMDownModuleDependency a2 = FCMDownloadModule.f95612b.mo136916a();
        boolean z = true;
        if (a2 == null || !a2.mo133161a()) {
            z = false;
        }
        boolean b = FCMDownloadUtils.m146625b();
        boolean a3 = FCMDialogStateManager.m146632a();
        Log.m165389i("FCMDownloadManager", "isUseFCMPlugin: " + a + ", isFCMPluginEnabled: " + z + ", isFCMPluginInstalled: " + b + ", isRejectUse: " + a3);
        if (!a || !z || b || a3) {
            mo136929a(cVar);
        } else if (FCMDialogStateManager.m146633b()) {
            Log.m165389i("FCMDownloadManager", "has agree, auto install fcm plugin");
            FCMDownloadUtils.m146626c();
            mo136929a(cVar);
        } else {
            boolean a4 = FCMDownloadUtils.f95615a.mo136922a(activity);
            Log.m165389i("FCMDownloadManager", "hasGoogleSupport: " + a4);
            if (!a4) {
                mo136929a(cVar);
            } else {
                FCMDownloadService.f95613a.mo136917a(new C37235d(this, cVar));
            }
        }
    }
}
