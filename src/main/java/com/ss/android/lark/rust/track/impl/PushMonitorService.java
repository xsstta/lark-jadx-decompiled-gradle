package com.ss.android.lark.rust.track.impl;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.NotifyAppLagRequest;
import com.bytedance.lark.pb.basic.v1.NotifyAppLagResponse;
import com.bytedance.lark.pb.basic.v1.PushMonitorAppLagStatusResponse;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.rust.track.service.IPushMonitorService;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.C53248k;
import com.ss.android.lark.sdk.SdkSender;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/rust/track/impl/PushMonitorService;", "Lcom/ss/android/lark/rust/track/service/IPushMonitorService;", "()V", "getPbLagLevel", "Lcom/bytedance/lark/pb/basic/v1/NotifyAppLagRequest$LagLevel;", "lagLevel", "", "init", "", "notifyAppLagRequest", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "onPushMonitorStatus", "request", "", "Companion", "features_rust-track_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.rust.track.impl.c */
public final class PushMonitorService implements IPushMonitorService {

    /* renamed from: a */
    public static final Lazy f131479a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C53174b.INSTANCE);

    /* renamed from: b */
    public static final Companion f131480b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/rust/track/impl/PushMonitorService$Companion;", "", "()V", "TAG", "", "instance", "Lcom/ss/android/lark/rust/track/impl/PushMonitorService;", "getInstance", "()Lcom/ss/android/lark/rust/track/impl/PushMonitorService;", "instance$delegate", "Lkotlin/Lazy;", "features_rust-track_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.rust.track.impl.c$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ KProperty[] f131481a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "instance", "getInstance()Lcom/ss/android/lark/rust/track/impl/PushMonitorService;"))};

        /* renamed from: a */
        public final PushMonitorService mo181597a() {
            Lazy lazy = PushMonitorService.f131479a;
            Companion aVar = PushMonitorService.f131480b;
            KProperty kProperty = f131481a[0];
            return (PushMonitorService) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private PushMonitorService() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/rust/track/impl/PushMonitorService;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.rust.track.impl.c$b */
    static final class C53174b extends Lambda implements Function0<PushMonitorService> {
        public static final C53174b INSTANCE = new C53174b();

        C53174b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final PushMonitorService invoke() {
            return new PushMonitorService(null);
        }
    }

    @Override // com.ss.android.lark.rust.track.service.IPushMonitorService
    /* renamed from: a */
    public void mo181594a() {
        C53248k.m205912a().mo181697a(Command.PUSH_MONITOR_APP_LAG_STATUS, new C53175c(this));
    }

    public /* synthetic */ PushMonitorService(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.rust.track.impl.c$d */
    public static final class C53176d<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C53176d f131483a = new C53176d();

        C53176d() {
        }

        @Override // com.ss.android.lark.sdk.SdkSender.IParser
        public /* synthetic */ Object parse(byte[] bArr) {
            return Integer.valueOf(mo181598a(bArr));
        }

        /* renamed from: a */
        public final int mo181598a(byte[] bArr) {
            NotifyAppLagResponse.PushStatus pushStatus = NotifyAppLagResponse.ADAPTER.decode(bArr).push_status;
            Intrinsics.checkExpressionValueIsNotNull(pushStatus, "response.push_status");
            return pushStatus.getValue();
        }
    }

    /* renamed from: a */
    private final NotifyAppLagRequest.LagLevel m205792a(int i) {
        if (i == 0) {
            return NotifyAppLagRequest.LagLevel.NONE;
        }
        if (i == 1) {
            return NotifyAppLagRequest.LagLevel.SLIGHTLY;
        }
        if (i == 2) {
            return NotifyAppLagRequest.LagLevel.MODERATELY;
        }
        if (i == 3) {
            return NotifyAppLagRequest.LagLevel.SEVERELY;
        }
        if (i != 4) {
            return NotifyAppLagRequest.LagLevel.NONE;
        }
        return NotifyAppLagRequest.LagLevel.FATALLY;
    }

    /* renamed from: a */
    public final void mo181596a(byte[] bArr) {
        boolean z;
        try {
            PushMonitorAppLagStatusResponse.Status status = PushMonitorAppLagStatusResponse.ADAPTER.decode(bArr).status;
            PushMonitor a = PushMonitor.f131464h.mo181589a();
            if (status == PushMonitorAppLagStatusResponse.Status.START) {
                z = true;
            } else {
                z = false;
            }
            a.mo181584b(z);
        } catch (Exception e) {
            C53241h.m205894a("PushMonitorService", e.getMessage());
        }
    }

    /* renamed from: a */
    public void mo181595a(int i, IGetDataCallback<Integer> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        SdkSender.asynSendRequestNonWrap(Command.NOTIFY_APP_LAG, new NotifyAppLagRequest.C15101a().mo55091a(m205792a(i)), iGetDataCallback, C53176d.f131483a);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "request", "", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "", "<anonymous parameter 3>", "onPush"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.rust.track.impl.c$c */
    static final class C53175c implements C53248k.AbstractC53250a {

        /* renamed from: a */
        final /* synthetic */ PushMonitorService f131482a;

        C53175c(PushMonitorService cVar) {
            this.f131482a = cVar;
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            PushMonitorService cVar = this.f131482a;
            Intrinsics.checkExpressionValueIsNotNull(bArr, "request");
            cVar.mo181596a(bArr);
        }
    }
}
