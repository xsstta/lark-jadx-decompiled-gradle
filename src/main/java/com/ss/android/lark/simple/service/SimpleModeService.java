package com.ss.android.lark.simple.service;

import android.content.Context;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26308n;
import com.ss.android.lark.pb.device.PullDeviceBasicModeSettingRequest;
import com.ss.android.lark.pb.device.PullDeviceBasicModeSettingResponse;
import com.ss.android.lark.pb.device.PutDeviceBasicModeSettingRequest;
import com.ss.android.lark.pb.device.PutDeviceBasicModeSettingResponse;
import com.ss.android.lark.pb.improto.Command;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.simple.SimpleModule;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0016\u001a\u00020\u000bH\u0016J\b\u0010\u0017\u001a\u00020\u000bH\u0016J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0013H\u0002J&\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00132\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0016J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/simple/service/SimpleModeService;", "Lcom/ss/android/lark/simple/service/ISimpleModeService;", "()V", "isInit", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mExecutor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "mSimpleMode", "Ljava/util/concurrent/atomic/AtomicInteger;", "canShowSimpleTip", "", "completeSimpleTip", "", "fetchSimpleMode", "context", "Landroid/content/Context;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "getSimpleMode", "getSimpleModeFromCache", "isSimpleModeEntranceEnable", "isSimpleModeFeatureEnable", "markSimpleMode", "saveSimpleMode", "mode", "setSimpleMode", "unMarkSimpleMode", "Companion", "SimpleMode", "core_simple_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class SimpleModeService implements ISimpleModeService {

    /* renamed from: b */
    public static final Lazy f135450b = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C54877b.INSTANCE);

    /* renamed from: c */
    public static final Companion f135451c = new Companion(null);

    /* renamed from: a */
    public AtomicInteger f135452a = new AtomicInteger(0);

    /* renamed from: d */
    private ExecutorService f135453d = CoreThreadPool.getDefault().newSerialCpuDensityThreadPool("simple");

    /* renamed from: e */
    private final AtomicBoolean f135454e = new AtomicBoolean(false);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/simple/service/SimpleModeService$SimpleMode;", "", "Companion", "core_simple_release"}, mo238835k = 1, mv = {1, 1, 15})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface SimpleMode {
        public static final Companion Companion = Companion.f135455a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/simple/service/SimpleModeService$SimpleMode$Companion;", "", "()V", "NORMAL", "", "SIMPLE", "core_simple_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.simple.service.SimpleModeService$SimpleMode$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f135455a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nXT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/simple/service/SimpleModeService$Companion;", "", "()V", "INSTANCE", "Lcom/ss/android/lark/simple/service/ISimpleModeService;", "getINSTANCE", "()Lcom/ss/android/lark/simple/service/ISimpleModeService;", "INSTANCE$delegate", "Lkotlin/Lazy;", "KEY_FLAG", "", "KEY_SIMPLE_MODE", "TAG", "core_simple_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.service.SimpleModeService$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ KProperty[] f135456a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "INSTANCE", "getINSTANCE()Lcom/ss/android/lark/simple/service/ISimpleModeService;"))};

        /* renamed from: a */
        public final ISimpleModeService mo187138a() {
            Lazy lazy = SimpleModeService.f135450b;
            Companion aVar = SimpleModeService.f135451c;
            KProperty kProperty = f135456a[0];
            return (ISimpleModeService) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/simple/service/SimpleModeService;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.service.SimpleModeService$b */
    static final class C54877b extends Lambda implements Function0<SimpleModeService> {
        public static final C54877b INSTANCE = new C54877b();

        C54877b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SimpleModeService invoke() {
            return new SimpleModeService();
        }
    }

    @Override // com.ss.android.lark.simple.service.ISimpleModeService
    /* renamed from: c */
    public void mo187136c() {
        SimpleModule.IGuideDependency f;
        SimpleModule.ISimpleModuleDependency a = SimpleModule.f135402b.mo187078a();
        if (a != null && (f = a.mo187095f()) != null) {
            f.mo187084b("mobile_basic_mode");
        }
    }

    /* renamed from: d */
    public boolean mo187137d() {
        SimpleModule.IFeatureGatingDependency d;
        SimpleModule.ISimpleModuleDependency a = SimpleModule.f135402b.mo187078a();
        if (a == null || (d = a.mo187093d()) == null) {
            return false;
        }
        return d.mo187082a("mobile.core.basic_mode", false);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.service.SimpleModeService$e */
    public static final class RunnableC54880e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SimpleModeService f135461a;

        /* renamed from: b */
        final /* synthetic */ int f135462b;

        /* renamed from: c */
        final /* synthetic */ IGetDataCallback f135463c;

        /* renamed from: d */
        final /* synthetic */ Context f135464d;

        RunnableC54880e(SimpleModeService simpleModeService, int i, IGetDataCallback iGetDataCallback, Context context) {
            this.f135461a = simpleModeService;
            this.f135462b = i;
            this.f135463c = iGetDataCallback;
            this.f135464d = context;
        }

        public final void run() {
            PutDeviceBasicModeSettingRequest.C49612a aVar = new PutDeviceBasicModeSettingRequest.C49612a();
            boolean z = true;
            if (this.f135462b != 1) {
                z = false;
            }
            SdkSender.sendPassThroughRequest(Command.PUT_DEVICE_BASIC_MODE_SETTING, aVar.mo172955a(Boolean.valueOf(z)), this.f135463c, new SdkSender.IParser<T>(this) {
                /* class com.ss.android.lark.simple.service.SimpleModeService.RunnableC54880e.C548811 */

                /* renamed from: a */
                final /* synthetic */ RunnableC54880e f135465a;

                {
                    this.f135465a = r1;
                }

                @Override // com.ss.android.lark.sdk.SdkSender.IParser
                public /* synthetic */ Object parse(byte[] bArr) {
                    return Boolean.valueOf(mo187142a(bArr));
                }

                /* renamed from: a */
                public final boolean mo187142a(byte[] bArr) {
                    try {
                        C53241h.m205898b("SimpleModeService", "set simple mode callback");
                        PutDeviceBasicModeSettingResponse.ADAPTER.decode(bArr);
                        this.f135465a.f135461a.f135452a.set(this.f135465a.f135462b);
                        this.f135465a.f135461a.mo187131a(this.f135465a.f135464d, this.f135465a.f135462b);
                        return true;
                    } catch (Exception e) {
                        C53241h.m205894a("SimpleModeService", "set simple mode fail " + e.getMessage());
                        return false;
                    }
                }
            });
        }
    }

    @Override // com.ss.android.lark.simple.service.ISimpleModeService
    /* renamed from: b */
    public boolean mo187135b() {
        boolean z;
        SimpleModule.IGuideDependency f;
        SimpleModule.ISimpleModuleDependency a = SimpleModule.f135402b.mo187078a();
        if (a == null || (f = a.mo187095f()) == null) {
            z = false;
        } else {
            z = f.mo187083a("mobile_basic_mode");
        }
        if (!mo187134a() || !z) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.simple.service.ISimpleModeService
    /* renamed from: a */
    public boolean mo187134a() {
        boolean z;
        SimpleModule.ILoginDependency a;
        SimpleModule.ISimpleModuleDependency a2 = SimpleModule.f135402b.mo187078a();
        if (a2 == null || (a = a2.mo187090a()) == null) {
            z = false;
        } else {
            z = a.mo187087b();
        }
        if (!z || !mo187137d()) {
            return false;
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/simple/service/SimpleModeService$fetchSimpleMode$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_simple_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.service.SimpleModeService$c */
    public static final class C54878c implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ SimpleModeService f135457a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f135458b;

        /* renamed from: c */
        final /* synthetic */ Context f135459c;

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Boolean bool) {
            mo187139a(bool.booleanValue());
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: boolean */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public void mo187139a(boolean z) {
            this.f135458b.onSuccess(Integer.valueOf(z ? 1 : 0));
            C53241h.m205898b("SimpleModeService", "pull basic mode setting success " + z);
            this.f135457a.f135452a.set(z);
            this.f135457a.mo187131a(this.f135459c, (int) z);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            C53241h.m205894a("SimpleModeService", "pull basic mode setting fail " + errorResult.getDisplayMsg());
            this.f135458b.onError(errorResult);
        }

        C54878c(SimpleModeService simpleModeService, IGetDataCallback iGetDataCallback, Context context) {
            this.f135457a = simpleModeService;
            this.f135458b = iGetDataCallback;
            this.f135459c = context;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "parse", "([B)Ljava/lang/Boolean;"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.service.SimpleModeService$d */
    static final class C54879d<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C54879d f135460a = new C54879d();

        C54879d() {
        }

        /* renamed from: a */
        public final Boolean parse(byte[] bArr) {
            PullDeviceBasicModeSettingResponse decode = PullDeviceBasicModeSettingResponse.ADAPTER.decode(bArr);
            Intrinsics.checkExpressionValueIsNotNull(decode, "PullDeviceBasicModeSetti…sponse.ADAPTER.decode(it)");
            return decode.mbasic_mode_status;
        }
    }

    /* renamed from: b */
    private final void m212789b(Context context) {
        File file = new File(C26308n.m95258d(context) + "/" + "simple_mode");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                C53241h.m205894a("SimpleModeService", e.getMessage());
            } catch (SecurityException e2) {
                C53241h.m205894a("SimpleModeService", e2.getMessage());
            }
        }
    }

    /* renamed from: c */
    private final void m212790c(Context context) {
        File file = new File(C26308n.m95258d(context) + "/" + "simple_mode");
        try {
            if (file.exists()) {
                file.delete();
            }
        } catch (IOException e) {
            C53241h.m205894a("SimpleModeService", e.getMessage());
        } catch (SecurityException e2) {
            C53241h.m205894a("SimpleModeService", e2.getMessage());
        }
    }

    /* renamed from: d */
    private final int m212791d(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(C26308n.m95258d(context));
        sb.append("/");
        sb.append("simple_mode");
        return new File(sb.toString()).exists() ? 1 : 0;
    }

    @Override // com.ss.android.lark.simple.service.ISimpleModeService
    /* renamed from: a */
    public int mo187130a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (this.f135454e.get()) {
            return this.f135452a.get();
        }
        this.f135452a.set(m212791d(context));
        this.f135454e.set(true);
        return this.f135452a.get();
    }

    /* renamed from: a */
    public final void mo187131a(Context context, int i) {
        if (i == 1) {
            m212789b(context);
        } else {
            m212790c(context);
        }
    }

    @Override // com.ss.android.lark.simple.service.ISimpleModeService
    /* renamed from: a */
    public void mo187133a(Context context, IGetDataCallback<Integer> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        SdkSender.sendPassThroughRequest(Command.PULL_DEVICE_BASIC_MODE_SETTING, new PullDeviceBasicModeSettingRequest.C49608a(), new C54878c(this, iGetDataCallback, context), C54879d.f135460a);
    }

    @Override // com.ss.android.lark.simple.service.ISimpleModeService
    /* renamed from: a */
    public void mo187132a(Context context, int i, IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        this.f135453d.execute(new RunnableC54880e(this, i, iGetDataCallback, context));
    }
}
