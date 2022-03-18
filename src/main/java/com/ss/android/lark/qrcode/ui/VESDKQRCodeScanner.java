package com.ss.android.lark.qrcode.ui;

import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.bef.effectsdk.FileResourceFinder;
import com.bef.effectsdk.message.MessageCenter;
import com.google.zxing.BarcodeFormat;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26308n;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.qrcode.statistics.SimpleStopwatch;
import com.ss.android.lark.qrcode.statistics.VEScannerStatistics;
import com.ss.android.lark.qrcode.ui.IQRCodeScanner;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.medialib.model.Enigma;
import com.ss.android.medialib.model.EnigmaResult;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.vesdk.C63937ah;
import com.ss.android.vesdk.C64034n;
import com.ss.android.vesdk.VEAudioEncodeSettings;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VEPreviewSettings;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 J2\u00020\u0001:\u0002JKB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0002J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u001aH\u0002J5\u0010>\u001a\u00020<2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u001a2\u000e\u0010?\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010@2\u0006\u0010B\u001a\u00020 H\u0016¢\u0006\u0002\u0010CJ\b\u0010D\u001a\u00020<H\u0016J\b\u0010E\u001a\u00020<H\u0016J\b\u0010F\u001a\u00020<H\u0016J\b\u0010G\u001a\u00020<H\u0016J\n\u0010H\u001a\u00020I*\u00020*R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001b\u0010-\u001a\u00020.8FX\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b/\u00100¨\u0006L"}, d2 = {"Lcom/ss/android/lark/qrcode/ui/VESDKQRCodeScanner;", "Lcom/ss/android/lark/qrcode/ui/IQRCodeScanner;", "()V", "activity", "Landroidx/fragment/app/FragmentActivity;", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "setActivity", "(Landroidx/fragment/app/FragmentActivity;)V", "capture", "Lcom/ss/android/vesdk/VECameraCapture;", "getCapture", "()Lcom/ss/android/vesdk/VECameraCapture;", "setCapture", "(Lcom/ss/android/vesdk/VECameraCapture;)V", "messageCenterListener", "Lcom/bef/effectsdk/message/MessageCenter$Listener;", "getMessageCenterListener", "()Lcom/bef/effectsdk/message/MessageCenter$Listener;", "recorder", "Lcom/ss/android/vesdk/VERecorder;", "getRecorder", "()Lcom/ss/android/vesdk/VERecorder;", "setRecorder", "(Lcom/ss/android/vesdk/VERecorder;)V", "renderedFrames", "", "getRenderedFrames", "()I", "setRenderedFrames", "(I)V", "scanListener", "Lcom/ss/android/lark/qrcode/ui/IQRCodeScanner$IQRCodeScanListener;", "getScanListener", "()Lcom/ss/android/lark/qrcode/ui/IQRCodeScanner$IQRCodeScanListener;", "setScanListener", "(Lcom/ss/android/lark/qrcode/ui/IQRCodeScanner$IQRCodeScanListener;)V", "statistics", "Lcom/ss/android/lark/qrcode/statistics/VEScannerStatistics;", "getStatistics", "()Lcom/ss/android/lark/qrcode/statistics/VEScannerStatistics;", "stopwatch", "Lcom/ss/android/lark/qrcode/statistics/SimpleStopwatch;", "getStopwatch", "()Lcom/ss/android/lark/qrcode/statistics/SimpleStopwatch;", "windowRotationConfig", "Lcom/ss/android/lark/qrcode/ui/WindowRotationConfig;", "getWindowRotationConfig", "()Lcom/ss/android/lark/qrcode/ui/WindowRotationConfig;", "windowRotationConfig$delegate", "Lkotlin/Lazy;", "createQRCodeScanView", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "getVESDKPath", "", "context", "Landroid/content/Context;", "initRecord", "", "id", "onCreate", "formats", "", "Lcom/google/zxing/BarcodeFormat;", "listener", "(Landroidx/fragment/app/FragmentActivity;I[Lcom/google/zxing/BarcodeFormat;Lcom/ss/android/lark/qrcode/ui/IQRCodeScanner$IQRCodeScanListener;)V", "onDestroy", "onRestart", "onStart", "onStop", "elapsedMillis", "", "Companion", "DistinctUntilChangedQRCodeScanListener", "core_qrcode_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.qrcode.ui.h */
public final class VESDKQRCodeScanner implements IQRCodeScanner {

    /* renamed from: b */
    public static final Companion f130857b = new Companion(null);

    /* renamed from: a */
    public FragmentActivity f130858a;

    /* renamed from: c */
    private VERecorder f130859c;

    /* renamed from: d */
    private C64034n f130860d;

    /* renamed from: e */
    private IQRCodeScanner.IQRCodeScanListener f130861e;

    /* renamed from: f */
    private final VEScannerStatistics f130862f = new VEScannerStatistics();

    /* renamed from: g */
    private final SimpleStopwatch f130863g = SimpleStopwatch.f130792a.mo180852a();

    /* renamed from: h */
    private int f130864h;

    /* renamed from: i */
    private final MessageCenter.AbstractC2081a f130865i = new C52968f(this);

    /* renamed from: j */
    private final Lazy f130866j = LazyKt.lazy(new C52971h(this));

    /* renamed from: k */
    public final WindowRotationConfig mo180957k() {
        return (WindowRotationConfig) this.f130866j.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/qrcode/ui/VESDKQRCodeScanner$Companion;", "", "()V", "TAG", "", "core_qrcode_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.qrcode.ui.h$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u001a\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\"\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/qrcode/ui/VESDKQRCodeScanner$initRecord$1", "Lcom/ss/android/vesdk/VEListener$VECameraStateExtListener;", "cameraOpenFailed", "", "cameraType", "", "cameraOpenSuccess", "onError", "ret", "msg", "", "onInfo", "infoType", "ext", "core_qrcode_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.qrcode.ui.h$c */
    public static final class C52965c implements VEListener.AbstractC63867j {
        @Override // com.ss.android.vesdk.VEListener.AbstractC63868k
        /* renamed from: a */
        public void mo180958a() {
        }

        @Override // com.ss.android.vesdk.VEListener.AbstractC63867j
        /* renamed from: a */
        public void mo180960a(int i, int i2, String str) {
        }

        C52965c() {
        }

        @Override // com.ss.android.vesdk.VEListener.AbstractC63868k
        /* renamed from: a */
        public void mo180959a(int i) {
            Log.m165383e("QRCode-VESDKQRCodeScanner", "cameraOpenFailed " + i);
        }

        @Override // com.ss.android.vesdk.VEListener.AbstractC63867j
        /* renamed from: a */
        public void mo180961a(int i, String str) {
            Log.m165383e("QRCode-VESDKQRCodeScanner", "cameraStateListener onError ret = " + i + ", msg = " + str);
        }
    }

    /* renamed from: e */
    public final VERecorder mo180951e() {
        return this.f130859c;
    }

    /* renamed from: g */
    public final IQRCodeScanner.IQRCodeScanListener mo180953g() {
        return this.f130861e;
    }

    /* renamed from: h */
    public final VEScannerStatistics mo180954h() {
        return this.f130862f;
    }

    /* renamed from: i */
    public final SimpleStopwatch mo180955i() {
        return this.f130863g;
    }

    /* renamed from: j */
    public final int mo180956j() {
        return this.f130864h;
    }

    @Override // com.ss.android.lark.qrcode.ui.IQRCodeScanner
    /* renamed from: a */
    public void mo180900a() {
        C64034n nVar = this.f130860d;
        if (nVar != null) {
            nVar.mo221141b();
        }
    }

    @Override // com.ss.android.lark.qrcode.ui.IQRCodeScanner
    /* renamed from: b */
    public void mo180902b() {
        C64034n nVar = this.f130860d;
        if (nVar != null) {
            nVar.mo221141b();
        }
    }

    @Override // com.ss.android.lark.qrcode.ui.IQRCodeScanner
    /* renamed from: c */
    public void mo180903c() {
        C64034n nVar = this.f130860d;
        if (nVar != null) {
            nVar.mo221758e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"com/ss/android/lark/qrcode/ui/VESDKQRCodeScanner$initRecord$3", "Lcom/ss/android/vesdk/VERecorder$OnFrameAvailableListenerExt;", "firstFrameRendered", "", "getFirstFrameRendered", "()Z", "setFirstFrameRendered", "(Z)V", "OnFrameAvailable", "", "frame", "Lcom/ss/android/ttve/model/VEFrame;", "config", "Lcom/ss/android/vesdk/VERecorder$OnFrameAvailableListenerExt$Config;", "core_qrcode_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.qrcode.ui.h$e */
    public static final class C52967e implements VERecorder.AbstractC63894c {

        /* renamed from: a */
        final /* synthetic */ VESDKQRCodeScanner f130871a;

        /* renamed from: b */
        private boolean f130872b;

        @Override // com.ss.android.vesdk.VERecorder.AbstractC63894c
        /* renamed from: a */
        public VERecorder.AbstractC63894c.C63895a mo180962a() {
            VERecorder.AbstractC63894c.C63895a aVar = new VERecorder.AbstractC63894c.C63895a();
            aVar.f161375b = VEFrame.ETEPixelFormat.TEPixFmt_OpenGL_RGBA8;
            aVar.f161374a = false;
            return aVar;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52967e(VESDKQRCodeScanner hVar) {
            this.f130871a = hVar;
        }

        @Override // com.ss.android.vesdk.VERecorder.AbstractC63894c
        /* renamed from: a */
        public void mo180963a(VEFrame vEFrame) {
            if (!this.f130872b) {
                this.f130872b = true;
                VEScannerStatistics h = this.f130871a.mo180954h();
                VESDKQRCodeScanner hVar = this.f130871a;
                h.mo180856b(hVar.mo180949a(hVar.mo180955i()));
            }
            VESDKQRCodeScanner hVar2 = this.f130871a;
            hVar2.mo180950a(hVar2.mo180956j() + 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/qrcode/ui/WindowRotationConfig;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.qrcode.ui.h$h */
    static final class C52971h extends Lambda implements Function0<WindowRotationConfig> {
        final /* synthetic */ VESDKQRCodeScanner this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52971h(VESDKQRCodeScanner hVar) {
            super(0);
            this.this$0 = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final WindowRotationConfig invoke() {
            return new WindowRotationConfig(this.this$0.mo180952f());
        }
    }

    /* renamed from: f */
    public final FragmentActivity mo180952f() {
        FragmentActivity fragmentActivity = this.f130858a;
        if (fragmentActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activity");
        }
        return fragmentActivity;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/qrcode/ui/VESDKQRCodeScanner$messageCenterListener$1", "Lcom/bef/effectsdk/message/MessageCenter$Listener;", "onMessageReceived", "", "messageType", "", "arg1", "arg2", "arg3", "", "core_qrcode_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.qrcode.ui.h$f */
    public static final class C52968f implements MessageCenter.AbstractC2081a {

        /* renamed from: a */
        final /* synthetic */ VESDKQRCodeScanner f130873a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0004"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/qrcode/ui/VESDKQRCodeScanner$messageCenterListener$1$onMessageReceived$1$1$1", "com/ss/android/lark/qrcode/ui/VESDKQRCodeScanner$messageCenterListener$1$$special$$inlined$let$lambda$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.qrcode.ui.h$f$a */
        static final class RunnableC52969a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Enigma[] f130874a;

            /* renamed from: b */
            final /* synthetic */ C52968f f130875b;

            RunnableC52969a(Enigma[] enigmaArr, C52968f fVar) {
                this.f130874a = enigmaArr;
                this.f130875b = fVar;
            }

            public final void run() {
                IQRCodeScanner.IQRCodeScanListener g = this.f130875b.f130873a.mo180953g();
                if (g != null) {
                    Enigma enigma = this.f130874a[0];
                    Intrinsics.checkExpressionValueIsNotNull(enigma, "array[0]");
                    g.mo180888a(CollectionsKt.listOf(enigma.getText()));
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52968f(VESDKQRCodeScanner hVar) {
            this.f130873a = hVar;
        }

        @Override // com.bef.effectsdk.message.MessageCenter.AbstractC2081a
        public void onMessageReceived(int i, int i2, int i3, String str) {
            EnigmaResult enigmaResult;
            Enigma[] result;
            boolean z;
            if (i == 24) {
                VERecorder e = this.f130873a.mo180951e();
                if (e != null) {
                    enigmaResult = e.mo220939e();
                } else {
                    enigmaResult = null;
                }
                if (enigmaResult != null && (result = enigmaResult.getResult()) != null) {
                    if (result.length == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
                        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
                        coreThreadPool.getUIExecutor().execute(new RunnableC52969a(result, this));
                    }
                }
            }
        }
    }

    @Override // com.ss.android.lark.qrcode.ui.IQRCodeScanner
    /* renamed from: d */
    public void mo180904d() {
        MessageCenter.m9051b(this.f130865i);
        C64034n nVar = this.f130860d;
        if (nVar != null) {
            nVar.mo221143f();
        }
        VERecorder vERecorder = this.f130859c;
        if (vERecorder != null) {
            vERecorder.mo220938d();
        }
    }

    /* renamed from: a */
    public final void mo180950a(int i) {
        this.f130864h = i;
    }

    /* renamed from: a */
    public final long mo180949a(SimpleStopwatch aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "$this$elapsedMillis");
        return aVar.mo180851a(TimeUnit.MILLISECONDS);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/qrcode/ui/VESDKQRCodeScanner$DistinctUntilChangedQRCodeScanListener;", "Lcom/ss/android/lark/qrcode/ui/IQRCodeScanner$IQRCodeScanListener;", "listener", "(Lcom/ss/android/lark/qrcode/ui/IQRCodeScanner$IQRCodeScanListener;)V", "result", "", "", "onScanResult", "", "core_qrcode_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.qrcode.ui.h$b */
    public static final class DistinctUntilChangedQRCodeScanListener implements IQRCodeScanner.IQRCodeScanListener {

        /* renamed from: a */
        private List<String> f130867a = CollectionsKt.emptyList();

        /* renamed from: b */
        private final IQRCodeScanner.IQRCodeScanListener f130868b;

        public DistinctUntilChangedQRCodeScanListener(IQRCodeScanner.IQRCodeScanListener aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "listener");
            this.f130868b = aVar;
        }

        @Override // com.ss.android.lark.qrcode.ui.IQRCodeScanner.IQRCodeScanListener
        /* renamed from: a */
        public void mo180888a(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "result");
            if (!Intrinsics.areEqual(this.f130867a, list)) {
                this.f130868b.mo180888a(list);
                this.f130867a = list;
            }
        }
    }

    /* renamed from: a */
    private final String m205118a(Context context) {
        String str = C26308n.m95256b(context) + "/video_editor/";
        C26311p.m95289i(str);
        return str;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/qrcode/ui/VESDKQRCodeScanner$onCreate$1", "Lcom/ss/android/lark/qrcode/ui/IQRCodeScanner$IQRCodeScanListener;", "onScanResult", "", "result", "", "", "core_qrcode_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.qrcode.ui.h$g */
    public static final class C52970g implements IQRCodeScanner.IQRCodeScanListener {

        /* renamed from: a */
        final /* synthetic */ VESDKQRCodeScanner f130876a;

        /* renamed from: b */
        final /* synthetic */ IQRCodeScanner.IQRCodeScanListener f130877b;

        @Override // com.ss.android.lark.qrcode.ui.IQRCodeScanner.IQRCodeScanListener
        /* renamed from: a */
        public void mo180888a(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "result");
            VEScannerStatistics h = this.f130876a.mo180954h();
            VESDKQRCodeScanner hVar = this.f130876a;
            h.mo180855a(hVar.mo180949a(hVar.mo180955i()));
            this.f130876a.mo180954h().mo180854a(this.f130876a.mo180956j());
            this.f130877b.mo180888a(list);
        }

        C52970g(VESDKQRCodeScanner hVar, IQRCodeScanner.IQRCodeScanListener aVar) {
            this.f130876a = hVar;
            this.f130877b = aVar;
        }
    }

    @Override // com.ss.android.lark.qrcode.ui.IQRCodeScanner
    /* renamed from: a */
    public View mo180899a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vesdk_qrcode_view, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…code_view, parent, false)");
        return inflate;
    }

    /* renamed from: b */
    private final void m205119b(int i) {
        C63937ah.m251006d(true);
        int[] iArr = {720, 1280};
        VECameraSettings a = new VECameraSettings.C63824a().mo220612a(VECameraSettings.CAMERA_TYPE.TYPE2).mo220611a(VECameraSettings.CAMERA_FACING_ID.FACING_BACK).mo220610a(iArr[0], iArr[1]).mo220616b(true).mo220609a(720).mo220617c(true).mo220613a(mo180957k().mo180967a()).mo220615a();
        VEVideoEncodeSettings a2 = new VEVideoEncodeSettings.C63917a(1).mo221099a(iArr[0], iArr[1]).mo221105b(true).mo221103a();
        VEAudioEncodeSettings a3 = new VEAudioEncodeSettings.C63814a().mo220504a();
        VEPreviewSettings a4 = new VEPreviewSettings.C63887a().mo220904a(mo180957k().mo180966a(iArr)).mo220905a(true).mo220907b(true).mo220908c(true).mo220909d(true).mo220906a();
        FragmentActivity fragmentActivity = this.f130858a;
        if (fragmentActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activity");
        }
        View findViewById = fragmentActivity.findViewById(i);
        if (findViewById != null) {
            SurfaceView surfaceView = (SurfaceView) findViewById;
            ViewGroup.LayoutParams layoutParams = surfaceView.getLayoutParams();
            layoutParams.width = mo180957k().mo180968b();
            layoutParams.height = mo180957k().mo180969c();
            surfaceView.setLayoutParams(layoutParams);
            C64034n nVar = new C64034n();
            FragmentActivity fragmentActivity2 = this.f130858a;
            if (fragmentActivity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activity");
            }
            nVar.mo221746a(fragmentActivity2.getApplicationContext(), a);
            nVar.mo221751a(new C52965c());
            FragmentActivity fragmentActivity3 = this.f130858a;
            if (fragmentActivity3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activity");
            }
            File file = new File(fragmentActivity3.getExternalCacheDir(), "vesdk_scan_code");
            if ((!file.exists() || !file.isDirectory()) && !file.mkdirs()) {
                Log.m165383e("QRCode-VESDKQRCodeScanner", "Unable to create vesdk_scan_code directory");
                return;
            }
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkExpressionValueIsNotNull(absolutePath, "scanCodeDir.absolutePath");
            FragmentActivity fragmentActivity4 = this.f130858a;
            if (fragmentActivity4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activity");
            }
            VERecorder vERecorder = new VERecorder(absolutePath, fragmentActivity4.getApplicationContext(), surfaceView);
            this.f130859c = vERecorder;
            nVar.mo221141b();
            this.f130860d = nVar;
            vERecorder.mo220930a(new C52966d(vERecorder, nVar));
            vERecorder.mo220932a(new C52967e(this));
            int a5 = vERecorder.mo220925a(null, a2, a3, a4);
            if (a5 != 0) {
                Log.m165383e("QRCode-VESDKQRCodeScanner", "Unable to init VERecorder ret = " + a5);
                return;
            }
            MessageCenter.m9049a(this.f130865i);
            vERecorder.mo220935a(true, 65536L);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.SurfaceView");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\"\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/lark/qrcode/ui/VESDKQRCodeScanner$initRecord$2", "Lcom/ss/android/vesdk/VEListener$VERecorderStateExtListener;", "onError", "", "ret", "", "msg", "", "onHardEncoderInit", "success", "", "onInfo", "infoType", "ext", "onNativeInit", "core_qrcode_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.qrcode.ui.h$d */
    public static final class C52966d implements VEListener.AbstractC63855ab {

        /* renamed from: a */
        final /* synthetic */ VERecorder f130869a;

        /* renamed from: b */
        final /* synthetic */ C64034n f130870b;

        @Override // com.ss.android.vesdk.VEListener.AbstractC63856ac
        /* renamed from: a */
        public void mo120729a(boolean z) {
        }

        @Override // com.ss.android.vesdk.VEListener.AbstractC63856ac
        /* renamed from: b */
        public void mo120730b(int i, String str) {
        }

        C52966d(VERecorder vERecorder, C64034n nVar) {
            this.f130869a = vERecorder;
            this.f130870b = nVar;
        }

        @Override // com.ss.android.vesdk.VEListener.AbstractC63855ab
        /* renamed from: a */
        public void mo120728a(int i, String str) {
            Log.m165383e("QRCode-VESDKQRCodeScanner", "recorderStateListener onError ret = " + i + ", msg = " + str);
        }

        @Override // com.ss.android.vesdk.VEListener.AbstractC63855ab
        /* renamed from: a */
        public void mo120727a(int i, int i2, String str) {
            if (i == 1000) {
                this.f130869a.mo220933a(this.f130870b);
            } else if (i == 1001) {
                this.f130870b.mo221757d();
            }
        }
    }

    @Override // com.ss.android.lark.qrcode.ui.IQRCodeScanner
    /* renamed from: a */
    public void mo180901a(FragmentActivity fragmentActivity, int i, BarcodeFormat[] barcodeFormatArr, IQRCodeScanner.IQRCodeScanListener aVar) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f130858a = fragmentActivity;
        this.f130861e = new DistinctUntilChangedQRCodeScanListener(new C52970g(this, aVar));
        C63937ah.m250998a(false);
        Application application = LarkContext.getApplication();
        Intrinsics.checkExpressionValueIsNotNull(application, "LarkContext.getApplication()");
        Application application2 = application;
        String a = m205118a(application2);
        C63937ah.m250993a(application2, a);
        C63937ah.m250994a(new FileResourceFinder(a));
        m205119b(i);
        this.f130862f.mo180853a();
    }
}
