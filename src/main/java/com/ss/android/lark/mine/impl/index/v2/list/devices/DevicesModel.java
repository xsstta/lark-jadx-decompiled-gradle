package com.ss.android.lark.mine.impl.index.v2.list.devices;

import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.framework.larkwidget.Widget;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mine.C45421b;
import com.ss.android.lark.mine.impl.C45428a;
import com.ss.android.lark.mine.impl.p2273b.p2275b.AbstractC45435b;
import com.ss.android.lark.mine.p2270a.AbstractC45399a;
import com.ss.android.lark.passport.signinsdk_api.entity.Devices;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\u0006\u0010\u0019\u001a\u00020\u0015J\b\u0010\u001a\u001a\u00020\u0015H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/devices/DevicesModel;", "Lcom/ss/android/lark/framework/larkwidget/Widget;", "mDevicesViewModel", "Lcom/ss/android/lark/mine/impl/index/v2/list/devices/DevicesViewModel;", "(Lcom/ss/android/lark/mine/impl/index/v2/list/devices/DevicesViewModel;)V", "mDeviceDependency", "Lcom/ss/android/lark/mine/dependency/IMineDependency$IDeviceDependency;", "getMDeviceDependency", "()Lcom/ss/android/lark/mine/dependency/IMineDependency$IDeviceDependency;", "mDeviceDependency$delegate", "Lkotlin/Lazy;", "mPushDependency", "Lcom/ss/android/lark/mine/dependency/IMineDependency$IPushDependency;", "getMPushDependency", "()Lcom/ss/android/lark/mine/dependency/IMineDependency$IPushDependency;", "mPushDependency$delegate", "mPushDeviceOnlineStatusListener", "Lcom/ss/android/lark/mine/impl/listener/push/IPushDeviceOnlineStatusListener;", "mUpdateDeviceEventListener", "Lcom/ss/android/lark/mine/impl/UpdateDeviceEventListenerContainer$IUpdateDeviceEventListener;", "initDevice", "", "onCreate", "onDestroy", "onPushDeviceOnlineStatus", "refreshDevices", "updateDeviceTips", "Companion", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class DevicesModel extends Widget {

    /* renamed from: a */
    public static final Companion f115379a = new Companion(null);

    /* renamed from: b */
    private final Lazy f115380b = LazyKt.lazy(C45691b.INSTANCE);

    /* renamed from: c */
    private final Lazy f115381c = LazyKt.lazy(C45692c.INSTANCE);

    /* renamed from: d */
    private final C45428a.AbstractC45429a f115382d = new C45694e(this);

    /* renamed from: e */
    private final AbstractC45435b f115383e = new C45693d(this);

    /* renamed from: f */
    private final DevicesViewModel f115384f;

    /* renamed from: g */
    private final AbstractC45399a.AbstractC45403d m181153g() {
        return (AbstractC45399a.AbstractC45403d) this.f115380b.getValue();
    }

    /* renamed from: h */
    private final AbstractC45399a.AbstractC45416q m181154h() {
        return (AbstractC45399a.AbstractC45416q) this.f115381c.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/devices/DevicesModel$Companion;", "", "()V", "TAG", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.devices.DevicesModel$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo160839a() {
        mo160840b();
    }

    /* renamed from: c */
    public final void mo121985c() {
        mo160841f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onPushDeviceOnlineStatus"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.devices.DevicesModel$d */
    static final class C45693d implements AbstractC45435b {

        /* renamed from: a */
        final /* synthetic */ DevicesModel f115385a;

        C45693d(DevicesModel devicesModel) {
            this.f115385a = devicesModel;
        }

        @Override // com.ss.android.lark.mine.impl.p2273b.p2275b.AbstractC45435b
        /* renamed from: a */
        public final void mo160321a() {
            this.f115385a.mo160839a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onUpdateDeviceEvent"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.devices.DevicesModel$e */
    static final class C45694e implements C45428a.AbstractC45429a {

        /* renamed from: a */
        final /* synthetic */ DevicesModel f115386a;

        C45694e(DevicesModel devicesModel) {
            this.f115386a = devicesModel;
        }

        @Override // com.ss.android.lark.mine.impl.C45428a.AbstractC45429a
        /* renamed from: a */
        public final void mo160315a() {
            this.f115386a.mo160841f();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/dependency/IMineDependency$IDeviceDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.devices.DevicesModel$b */
    static final class C45691b extends Lambda implements Function0<AbstractC45399a.AbstractC45403d> {
        public static final C45691b INSTANCE = new C45691b();

        C45691b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC45399a.AbstractC45403d invoke() {
            AbstractC45399a a = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
            return a.mo133450i();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/dependency/IMineDependency$IPushDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.devices.DevicesModel$c */
    static final class C45692c extends Lambda implements Function0<AbstractC45399a.AbstractC45416q> {
        public static final C45692c INSTANCE = new C45692c();

        C45692c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC45399a.AbstractC45416q invoke() {
            AbstractC45399a a = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
            return a.mo133460s();
        }
    }

    /* renamed from: b */
    public final void mo160840b() {
        C45421b.m180420a().mo133438a(new CallbackManager(), new C45695f(this));
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: e */
    public void mo121987e() {
        super.mo121987e();
        C45428a.m180461a(this.f115382d);
        m181154h().mo133516a(this.f115383e);
        mo160841f();
    }

    /* renamed from: f */
    public final void mo160841f() {
        this.f115384f.getDeviceCount().mo5926a(Integer.valueOf(m181153g().mo133473a()));
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: r */
    public void mo122001r() {
        super.mo122001r();
        m181154h().mo133519b(this.f115383e);
        C45428a.m180462b(this.f115382d);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mine/impl/index/v2/list/devices/DevicesModel$refreshDevices$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/passport/signinsdk_api/entity/Devices;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "devices", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.devices.DevicesModel$f */
    public static final class C45695f implements IGetDataCallback<Devices> {

        /* renamed from: a */
        final /* synthetic */ DevicesModel f115387a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45695f(DevicesModel devicesModel) {
            this.f115387a = devicesModel;
        }

        /* renamed from: a */
        public void onSuccess(Devices devices) {
            Intrinsics.checkParameterIsNotNull(devices, "devices");
            this.f115387a.mo160841f();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165397w("Mine_DevicesModel", "get device info failed : " + errorResult);
        }
    }

    public DevicesModel(DevicesViewModel aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "mDevicesViewModel");
        this.f115384f = aVar;
    }
}
