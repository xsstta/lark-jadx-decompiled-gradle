package com.bytedance.ee.bear.middleground.drive;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.middleground.drive.rustsdk.C9403j;
import com.bytedance.ee.bear.middleground.drive.rustsdk.init.DriveRustSdkWrapper;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\b\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J$\u0010\u0011\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0006\u0010\u0014\u001a\u00020\u0015J\u001c\u0010\u0016\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0003J\u001a\u0010\u0017\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ee/bear/middleground/drive/Drive;", "", "context", "Landroid/content/Context;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "(Landroid/content/Context;Lcom/bytedance/ee/bear/service/ServiceContext;)V", "accountCallback", "Lcom/bytedance/ee/bear/contract/AccountService$AccountChangeUICallback;", "mInitStatus", "Ljava/util/concurrent/atomic/AtomicInteger;", "asyncInit", "", "callback", "Ljava/lang/Runnable;", "path", "", "asyncInitInternal", "account", "Lcom/bytedance/ee/bear/contract/AccountService$Account;", "hasInit", "", "registerAccountChangeCallBack", "syncInit", "Companion", "middleground-drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.drive.a */
public final class Drive {

    /* renamed from: b */
    public static volatile Drive f25097b;

    /* renamed from: c */
    public static final Companion f25098c = new Companion(null);

    /* renamed from: a */
    public final AtomicInteger f25099a;

    /* renamed from: d */
    private AccountService.AccountChangeUICallback f25100d;

    /* renamed from: e */
    private final Context f25101e;

    /* renamed from: f */
    private final C10917c f25102f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/middleground/drive/Drive$Companion;", "", "()V", "INITED", "", "INITING", "NOT_INIT", "TAG", "", "instance", "Lcom/bytedance/ee/bear/middleground/drive/Drive;", "getInstance", "context", "Landroid/content/Context;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "middleground-drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.drive.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Drive mo35611a(Context context, C10917c cVar) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
            Drive aVar = Drive.f25097b;
            if (aVar == null) {
                synchronized (this) {
                    aVar = Drive.f25097b;
                    if (aVar == null) {
                        aVar = new Drive(context, cVar, null);
                        Drive.f25097b = aVar;
                    }
                }
            }
            return aVar;
        }
    }

    /* renamed from: a */
    public final boolean mo35609a() {
        if (this.f25099a.get() == 2 || this.f25099a.get() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.drive.a$d */
    public static final class C9348d<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ Drive f25107a;

        C9348d(Drive aVar) {
            this.f25107a = aVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Drive aVar = this.f25107a;
            C13479a.m54775e("Middleground_Drive_DriveSDK", "async init drive throwable = " + th);
            aVar.f25099a.set(0);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "kotlin.jvm.PlatformType", "deviceId", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.drive.a$b */
    public static final class C9346b<T, R> implements Function<T, AbstractC70020b<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ String f25103a;

        /* renamed from: b */
        final /* synthetic */ AccountService.Account f25104b;

        C9346b(String str, AccountService.Account account) {
            this.f25103a = str;
            this.f25104b = account;
        }

        /* renamed from: a */
        public final AbstractC68307f<Boolean> apply(String str) {
            Intrinsics.checkParameterIsNotNull(str, "deviceId");
            if (!TextUtils.isEmpty(str)) {
                return DriveRustSdkWrapper.m38805a(new DriveRustSdkWrapper.C9396a.C9397a().mo35843a(this.f25103a).mo35845b(this.f25104b.f14591h).mo35846c(this.f25104b.f14584a).mo35847d(this.f25104b.f14592i).mo35848e(str).mo35844a());
            }
            return AbstractC68307f.m265084a(new Throwable("init drive device id is empty"));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.drive.a$c */
    public static final class C9347c<T> implements Consumer<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Drive f25105a;

        /* renamed from: b */
        final /* synthetic */ Runnable f25106b;

        C9347c(Drive aVar, Runnable runnable) {
            this.f25105a = aVar;
            this.f25106b = runnable;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            C13479a.m54764b("Middleground_Drive_DriveSDK", "async init drive end initResult = " + bool);
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            if (bool.booleanValue()) {
                this.f25105a.f25099a.set(2);
                C9403j.m38871a().mo35862b();
            } else {
                this.f25105a.f25099a.set(0);
            }
            Runnable runnable = this.f25106b;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: a */
    public final void mo35607a(Runnable runnable, String str) {
        m38584c(runnable, str);
    }

    private Drive(Context context, C10917c cVar) {
        this.f25101e = context;
        this.f25102f = cVar;
        this.f25099a = new AtomicInteger(0);
    }

    /* renamed from: c */
    private final void m38584c(Runnable runnable, String str) {
        an anVar = (an) KoinJavaComponent.m268613a(an.class, null, null, 6, null);
        AccountService.Account f = anVar.mo16408f();
        C13479a.m54764b("Middleground_Drive_DriveSDK", "drive start init from cache account");
        if (f != null && f.mo19677a()) {
            mo35608a(runnable, str, f);
        }
        AccountService.AccountChangeUICallback accountChangeUICallback = this.f25100d;
        if (accountChangeUICallback != null) {
            anVar.mo16404b(accountChangeUICallback);
        }
        Drive$registerAccountChangeCallBack$1 drive$registerAccountChangeCallBack$1 = new Drive$registerAccountChangeCallBack$1(this, runnable, str);
        this.f25100d = drive$registerAccountChangeCallBack$1;
        anVar.mo16399a(drive$registerAccountChangeCallBack$1);
    }

    /* renamed from: b */
    public final void mo35610b(Runnable runnable, String str) {
        C13479a.m54764b("Middleground_Drive_DriveSDK", "sync init drive start");
        this.f25099a.set(1);
        try {
            AccountService.Account f = ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f();
            if (f == null || !f.mo19677a()) {
                C13479a.m54764b("Middleground_Drive_DriveSDK", "sync init drive error account");
                this.f25099a.set(0);
                return;
            }
            al d = C4511g.m18594d();
            Intrinsics.checkExpressionValueIsNotNull(d, "InfoProvideServiceImp.getInstance()");
            String s = d.mo17369s();
            if (TextUtils.isEmpty(s)) {
                C13479a.m54764b("Middleground_Drive_DriveSDK", "sync init drive error deviceId");
                this.f25099a.set(0);
                return;
            }
            if (DriveRustSdkWrapper.m38809b(new DriveRustSdkWrapper.C9396a.C9397a().mo35843a(str).mo35845b(f.f14591h).mo35846c(f.f14584a).mo35847d(f.f14592i).mo35848e(s).mo35844a())) {
                C13479a.m54764b("Middleground_Drive_DriveSDK", "sync init drive end initResult true");
                this.f25099a.set(2);
                C9403j.m38871a().mo35862b();
            } else {
                C13479a.m54764b("Middleground_Drive_DriveSDK", "sync init drive end initResult false");
                this.f25099a.set(0);
            }
            if (runnable != null) {
                runnable.run();
            }
        } catch (Exception unused) {
            C13479a.m54764b("Middleground_Drive_DriveSDK", "sync init drive error account service");
            this.f25099a.set(0);
        }
    }

    public /* synthetic */ Drive(Context context, C10917c cVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, cVar);
    }

    /* renamed from: a */
    public final void mo35608a(Runnable runnable, String str, AccountService.Account account) {
        AbstractC68307f<R> a;
        C13479a.m54764b("Middleground_Drive_DriveSDK", "async init drive start");
        this.f25099a.set(1);
        AbstractC68307f<R> c = C4511g.m18594d().mo17368r().toFlowable().mo238014c(new C9346b(str, account));
        if (c != null && (a = c.mo237985a(C11678b.m48481e())) != null) {
            a.mo238001b(new C9347c(this, runnable), new C9348d(this));
        }
    }
}
