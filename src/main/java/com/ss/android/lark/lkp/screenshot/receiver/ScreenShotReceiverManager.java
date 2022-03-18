package com.ss.android.lark.lkp.screenshot.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.larksuite.framework.utils.RomUtils;
import com.ss.android.lark.biz.im.api.IScreenshotCallBack;
import com.ss.android.lark.lkp.screenshot.C41542a;
import com.ss.android.lark.lkp.screenshot.p2142a.AbstractC41543a;
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
import me.ele.lancet.base.annotations.Skip;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/lkp/screenshot/receiver/ScreenShotReceiverManager;", "", "()V", "mContext", "Landroid/content/Context;", "mReceiver", "Landroid/content/BroadcastReceiver;", "createReceiver", "initReceiver", "", "registerReceiverObserver", "observer", "Lcom/ss/android/lark/biz/im/api/IScreenshotCallBack;", "unInitReceiver", "unRegisterReceiverObserver", "Companion", "im_screenshot-lkp_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.lkp.screenshot.receiver.b */
public final class ScreenShotReceiverManager {

    /* renamed from: a */
    public static final Lazy f105623a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C41548b.INSTANCE);

    /* renamed from: b */
    public static final Companion f105624b = new Companion(null);

    /* renamed from: c */
    private BroadcastReceiver f105625c;

    /* renamed from: d */
    private Context f105626d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/lkp/screenshot/receiver/ScreenShotReceiverManager$Companion;", "", "()V", "INSTANCE", "Lcom/ss/android/lark/lkp/screenshot/receiver/ScreenShotReceiverManager;", "getINSTANCE", "()Lcom/ss/android/lark/lkp/screenshot/receiver/ScreenShotReceiverManager;", "INSTANCE$delegate", "Lkotlin/Lazy;", "im_screenshot-lkp_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.lkp.screenshot.receiver.b$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ KProperty[] f105627a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "INSTANCE", "getINSTANCE()Lcom/ss/android/lark/lkp/screenshot/receiver/ScreenShotReceiverManager;"))};

        /* renamed from: a */
        public final ScreenShotReceiverManager mo149485a() {
            Lazy lazy = ScreenShotReceiverManager.f105623a;
            Companion aVar = ScreenShotReceiverManager.f105624b;
            KProperty kProperty = f105627a[0];
            return (ScreenShotReceiverManager) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/lkp/screenshot/receiver/ScreenShotReceiverManager;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.lkp.screenshot.receiver.b$b */
    static final class C41548b extends Lambda implements Function0<ScreenShotReceiverManager> {
        public static final C41548b INSTANCE = new C41548b();

        C41548b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ScreenShotReceiverManager invoke() {
            return new ScreenShotReceiverManager(null);
        }
    }

    /* renamed from: c */
    private final BroadcastReceiver m164865c() {
        if (RomUtils.m94953h()) {
            return new ScreenShotResponseReceiver();
        }
        return null;
    }

    /* renamed from: b */
    public final void mo149483b() {
        BroadcastReceiver broadcastReceiver = this.f105625c;
        if (broadcastReceiver != null) {
            this.f105626d.unregisterReceiver(broadcastReceiver);
            this.f105625c = null;
        }
    }

    private ScreenShotReceiverManager() {
        AbstractC41543a a = C41542a.m164843a();
        Intrinsics.checkExpressionValueIsNotNull(a, "LKPScreenShotModule.getDependency()");
        Context a2 = a.mo143886a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "LKPScreenShotModule.getDependency().context");
        this.f105626d = a2;
    }

    /* renamed from: a */
    public final void mo149481a() {
        if (this.f105625c == null) {
            this.f105625c = m164865c();
            m164864a(this.f105626d, this.f105625c, new IntentFilter("screen_shot_action"));
        }
    }

    public /* synthetic */ ScreenShotReceiverManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: b */
    public final void mo149484b(IScreenshotCallBack uVar) {
        Intrinsics.checkParameterIsNotNull(uVar, "observer");
        BroadcastReceiver broadcastReceiver = this.f105625c;
        if (!(broadcastReceiver instanceof IScreenShotReceiver)) {
            broadcastReceiver = null;
        }
        IScreenShotReceiver aVar = (IScreenShotReceiver) broadcastReceiver;
        if (aVar != null) {
            aVar.mo149478b(uVar);
        }
    }

    /* renamed from: a */
    public final void mo149482a(IScreenshotCallBack uVar) {
        Intrinsics.checkParameterIsNotNull(uVar, "observer");
        BroadcastReceiver broadcastReceiver = this.f105625c;
        if (!(broadcastReceiver instanceof IScreenShotReceiver)) {
            broadcastReceiver = null;
        }
        IScreenShotReceiver aVar = (IScreenShotReceiver) broadcastReceiver;
        if (aVar != null) {
            aVar.mo149475a(uVar);
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m164864a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }
}
