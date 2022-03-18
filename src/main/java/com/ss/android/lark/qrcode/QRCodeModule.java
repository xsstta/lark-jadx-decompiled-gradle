package com.ss.android.lark.qrcode;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.ss.android.lark.biz.core.api.AbstractC29569m;
import com.ss.android.lark.biz.core.api.IQRCodeScanResultHandler;
import com.ss.android.lark.fastqrcode.C37051b;
import com.ss.android.lark.fastqrcode.C37055c;
import com.ss.android.lark.fastqrcode.p1833c.C37056a;
import com.ss.android.lark.fastqrcode.p1834d.C37059b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.qrcode.p2553a.AbstractC52938a;
import com.ss.android.lark.qrcode.ui.C52953d;
import com.ss.android.lark.qrcode.ui.QRCodeScanActivity;
import com.ss.android.lark.qrcode.ui.QRScanResultDefaultActivity;
import com.ss.android.lark.statistics.Statistics;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 %2\u00020\u0001:\u0001%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0006J&\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0016\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017J\u001e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u001bJ\u001a\u0010\u001c\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u000e\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010 \u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017J\u001e\u0010 \u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0018\u001a\u00020\u0019J&\u0010 \u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$¨\u0006&"}, d2 = {"Lcom/ss/android/lark/qrcode/QRCodeModule;", "", "dependency", "Lcom/ss/android/lark/qrcode/dependency/IQRCodeModuleDependency;", "(Lcom/ss/android/lark/qrcode/dependency/IQRCodeModuleDependency;)V", "decodeQRCode", "", "bitmap", "Landroid/graphics/Bitmap;", "imagePath", "encodeQRCode", "content", "qrcodeWidth", "", "qrcodeHeight", "storkeWidth", "isQuickStartScan", "", "onStartScan", "", "parseQRCode", "qrContent", "context", "Landroid/content/Context;", "handler", "Lcom/ss/android/lark/biz/core/api/IQRCodeScanResultHandler;", "provideQRScanner", "Lcom/ss/android/lark/qrcode/IQRCodeScannerExport;", "startLKPExtraQrcode", "bundle", "Landroid/os/Bundle;", "startQrCodeScreenShot", "startScanQRCodeActivity", "formats", "", "customVewProvider", "Lcom/ss/android/lark/biz/core/api/ICustomViewProvider;", "Companion", "core_qrcode_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.qrcode.a */
public final class QRCodeModule {

    /* renamed from: a */
    public static final String f130789a = f130789a;

    /* renamed from: b */
    public static AbstractC52938a f130790b;

    /* renamed from: c */
    public static final Companion f130791c = new Companion(null);

    /* renamed from: a */
    public static final String m204932a() {
        return f130789a;
    }

    @JvmStatic
    /* renamed from: b */
    public static final AbstractC52938a m204933b() {
        return f130791c.mo180847b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\n\u001a\u0004\u0018\u00010\tH\u0007J\u0014\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\fH\u0007R\u001c\u0010\u0003\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/qrcode/QRCodeModule$Companion;", "", "()V", "LOG_TAG", "", "LOG_TAG$annotations", "getLOG_TAG", "()Ljava/lang/String;", "sDependency", "Lcom/ss/android/lark/qrcode/dependency/IQRCodeModuleDependency;", "getDependency", "getFeatureGatingMap", "", "", "core_qrcode_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.qrcode.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo180846a() {
            return QRCodeModule.f130789a;
        }

        @JvmStatic
        /* renamed from: b */
        public final AbstractC52938a mo180847b() {
            return QRCodeModule.f130790b;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: d */
    private final boolean m204935d() {
        AbstractC52938a aVar = f130790b;
        if (aVar == null || !aVar.mo178103a("lark.android.quick.start.scan")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private final void m204934c() {
        Statistics.sendEvent("qrcode_click_scan");
        String str = f130789a;
        Log.m165389i(str, "start scan at time: " + System.currentTimeMillis());
        AbstractC52938a b = f130791c.mo180847b();
        if (b != null) {
            Log.m165389i(str, "app has start " + (System.currentTimeMillis() - b.mo178111e()));
        }
    }

    /* renamed from: b */
    public final void mo180845b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        C52953d.m205064a().mo180933c(context);
    }

    /* renamed from: a */
    public final String mo180838a(Bitmap bitmap) {
        Intrinsics.checkParameterIsNotNull(bitmap, "bitmap");
        return C52953d.m205064a().mo180919a(bitmap);
    }

    public QRCodeModule(AbstractC52938a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        f130790b = aVar;
        boolean a = aVar.mo178103a("lark.android.qrcode.block.optimization");
        Log.m165389i(f130789a, "blockOptimization = " + a);
        C37055c.f95199b = a;
        C37055c.m146159a(new C37051b.AbstractC37053a() {
            /* class com.ss.android.lark.qrcode.QRCodeModule.C529361 */

            @Override // com.ss.android.lark.fastqrcode.C37051b.AbstractC37053a
            /* renamed from: a */
            public void mo136576a(String str, String str2) {
                Log.m165389i(str, str2);
            }

            @Override // com.ss.android.lark.fastqrcode.C37051b.AbstractC37053a
            /* renamed from: b */
            public void mo136577b(String str, String str2) {
                Log.m165379d(str, str2);
            }

            @Override // com.ss.android.lark.fastqrcode.C37051b.AbstractC37053a
            /* renamed from: c */
            public void mo136578c(String str, String str2) {
                Log.m165383e(str, str2);
            }
        });
        C37056a.m146163a(new C37056a.AbstractC37057a() {
            /* class com.ss.android.lark.qrcode.QRCodeModule.C529372 */

            @Override // com.ss.android.lark.fastqrcode.p1833c.C37056a.AbstractC37057a
            /* renamed from: a */
            public void mo136579a() {
                Statistics.sendEvent("qrcode_open_scan_dev");
            }

            @Override // com.ss.android.lark.fastqrcode.p1833c.C37056a.AbstractC37057a
            /* renamed from: d */
            public void mo136584d(long j) {
                Statistics.sendEvent("qrcode_core_algor_success_parse", new JSONObject().put("time_consuming", j));
            }

            @Override // com.ss.android.lark.fastqrcode.p1833c.C37056a.AbstractC37057a
            /* renamed from: a */
            public void mo136580a(int i) {
                String a = QRCodeModule.f130791c.mo180846a();
                Log.m165389i(a, "scan success need frame count: " + i);
                Statistics.sendEvent("scan_qrcode_frame", new JSONObject().put("frames", i));
            }

            @Override // com.ss.android.lark.fastqrcode.p1833c.C37056a.AbstractC37057a
            /* renamed from: b */
            public void mo136582b(long j) {
                String a = QRCodeModule.f130791c.mo180846a();
                Log.m165389i(a, "sdk parse success frame cost: " + j);
                Statistics.sendEvent("qrcode_success_detect", new JSONObject().put("time_consuming", j));
            }

            @Override // com.ss.android.lark.fastqrcode.p1833c.C37056a.AbstractC37057a
            /* renamed from: c */
            public void mo136583c(long j) {
                String a = QRCodeModule.f130791c.mo180846a();
                Log.m165389i(a, "sdk parse one picture cost: " + j);
                Statistics.sendEvent("qrcode_success_parse_from_pic", new JSONObject().put("time_consuming", j));
            }

            @Override // com.ss.android.lark.fastqrcode.p1833c.C37056a.AbstractC37057a
            /* renamed from: e */
            public void mo136585e(long j) {
                String a = QRCodeModule.f130791c.mo180846a();
                Log.m165389i(a, "get first frame at time: " + System.currentTimeMillis());
                Statistics.sendEvent("scan_qrcode_first_frame_time", new JSONObject().put("cost_time_int", j));
                QRCodeScanActivity.m204982a(j);
            }

            @Override // com.ss.android.lark.fastqrcode.p1833c.C37056a.AbstractC37057a
            /* renamed from: a */
            public void mo136581a(long j) {
                String a = QRCodeModule.f130791c.mo180846a();
                Log.m165389i(a, "scan success at time: " + System.currentTimeMillis());
                Statistics.sendEvent("qrcode_success_scan", new JSONObject().put("time_consuming", j));
            }
        });
    }

    /* renamed from: a */
    public final String mo180839a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "imagePath");
        return C52953d.m205064a().mo180920a(str);
    }

    /* renamed from: a */
    public final void mo180840a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        m204934c();
        if (m204935d()) {
            C52953d.m205064a().mo180921a(context);
            return;
        }
        C52953d.m205064a().mo180930b(context);
        AbstractC52938a b = f130791c.mo180847b();
        if (b != null) {
            b.mo178106b(context);
        }
    }

    /* renamed from: a */
    public final boolean mo180843a(Context context, Bundle bundle) {
        return C52953d.m205064a().mo180927a(context, bundle);
    }

    /* renamed from: a */
    public final boolean mo180844a(String str, Context context) {
        Intrinsics.checkParameterIsNotNull(str, "qrContent");
        Intrinsics.checkParameterIsNotNull(context, "context");
        C52953d.m205064a().mo180935d(context);
        boolean b = C52953d.m205064a().mo180931b(str);
        if (!b) {
            QRScanResultDefaultActivity.m205020a(context, str, false);
        }
        C52953d.m205064a().mo180936e();
        return b;
    }

    /* renamed from: a */
    public final void mo180841a(Context context, int[] iArr, IQRCodeScanResultHandler iQRCodeScanResultHandler) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(iArr, "formats");
        Intrinsics.checkParameterIsNotNull(iQRCodeScanResultHandler, "handler");
        m204934c();
        C52953d.m205064a().mo180924a(iQRCodeScanResultHandler);
        if (m204935d()) {
            C52953d.m205064a().mo180921a(context);
            return;
        }
        C52953d.m205064a().mo180923a(context, iArr);
        AbstractC52938a b = f130791c.mo180847b();
        if (b != null) {
            b.mo178106b(context);
        }
    }

    /* renamed from: a */
    public final Bitmap mo180837a(String str, int i, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(str, "content");
        Bitmap a = C37059b.m146186a(str, i, i2, i3);
        Intrinsics.checkExpressionValueIsNotNull(a, "QRCodeUtil.encode(conten…rcodeHeight, storkeWidth)");
        return a;
    }

    /* renamed from: a */
    public final void mo180842a(Context context, int[] iArr, IQRCodeScanResultHandler iQRCodeScanResultHandler, AbstractC29569m mVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(iArr, "formats");
        Intrinsics.checkParameterIsNotNull(iQRCodeScanResultHandler, "handler");
        Intrinsics.checkParameterIsNotNull(mVar, "customVewProvider");
        m204934c();
        C52953d.m205064a().mo180924a(iQRCodeScanResultHandler);
        C52953d a = C52953d.m205064a();
        Intrinsics.checkExpressionValueIsNotNull(a, "QRCodeScanManager.inst()");
        a.mo180926a(mVar);
        if (m204935d()) {
            C52953d.m205064a().mo180921a(context);
            return;
        }
        C52953d.m205064a().mo180923a(context, iArr);
        AbstractC52938a b = f130791c.mo180847b();
        if (b != null) {
            b.mo178106b(context);
        }
    }
}
