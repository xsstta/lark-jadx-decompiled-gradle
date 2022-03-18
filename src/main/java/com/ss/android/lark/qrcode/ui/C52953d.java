package com.ss.android.lark.qrcode.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Vibrator;
import android.text.TextUtils;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.AbstractC29569m;
import com.ss.android.lark.biz.core.api.IQRCodeScanResultHandler;
import com.ss.android.lark.biz.core.api.aj;
import com.ss.android.lark.biz.core.api.ak;
import com.ss.android.lark.biz.core.api.al;
import com.ss.android.lark.fastqrcode.C37055c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.qrcode.QRCodeModule;
import com.ss.android.lark.qrcode.p2553a.AbstractC52938a;
import com.ss.android.lark.qrcode.ui.C52953d;
import com.ss.android.lark.qrcode.ui.IQRCodeScanner;
import com.ss.android.lark.utils.C57788ai;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.medialib.qr.PicScanner;
import com.ss.android.medialib.qr.ScanSettings;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.qrcode.ui.d */
public class C52953d {

    /* renamed from: a */
    private List<IQRCodeScanResultHandler> f130826a;

    /* renamed from: b */
    private List<IQRCodeScanResultHandler> f130827b;

    /* renamed from: c */
    private aj f130828c;

    /* renamed from: d */
    private IQRCodeScanResultHandler f130829d;

    /* renamed from: e */
    private AbstractC52938a f130830e;

    /* renamed from: f */
    private AbstractC29569m f130831f;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.qrcode.ui.d$b */
    public static final class C52959b {

        /* renamed from: a */
        public static final C52953d f130844a = new C52953d();
    }

    /* renamed from: b */
    public void mo180929b() {
        this.f130829d = null;
    }

    /* renamed from: c */
    public void mo180932c() {
        this.f130831f = null;
    }

    /* renamed from: e */
    public void mo180936e() {
        this.f130828c = null;
    }

    /* renamed from: a */
    public static C52953d m205064a() {
        return C52959b.f130844a;
    }

    /* renamed from: d */
    public aj mo180934d() {
        return this.f130828c;
    }

    /* renamed from: f */
    public AbstractC29569m mo180937f() {
        return this.f130831f;
    }

    /* renamed from: a */
    public boolean mo180928a(Context context, String str, boolean z) {
        boolean z2;
        String str2;
        m205064a().mo180935d(context);
        String a = mo180920a(str);
        if (!TextUtils.isEmpty(a)) {
            z2 = mo180931b(a);
            Log.m165389i("QRCodeScanManager", "decode qrcode success: " + z2);
        } else {
            z2 = false;
        }
        if (!z2) {
            if (z) {
                str2 = UIHelper.getString(R.string.Lark_Legacy_QrCodeNotFound);
            } else {
                str2 = UIHelper.getString(R.string.Lark_Legacy_LarkScanUsingScreenshotUnknown);
            }
            LKUIToast.show(context, str2);
        }
        m205064a().mo180936e();
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r7 = (android.net.Uri) r7.getParcelable("image_uri");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo180927a(final android.content.Context r6, android.os.Bundle r7) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L_0x004b
            if (r7 != 0) goto L_0x0006
            goto L_0x004b
        L_0x0006:
            java.lang.String r1 = "image_uri"
            android.os.Parcelable r7 = r7.getParcelable(r1)
            android.net.Uri r7 = (android.net.Uri) r7
            if (r7 == 0) goto L_0x004b
            java.lang.String r1 = r7.toString()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x001b
            goto L_0x004b
        L_0x001b:
            boolean r1 = r6 instanceof android.app.Activity
            r2 = 1
            if (r1 == 0) goto L_0x004a
            r1 = r6
            android.app.Activity r1 = (android.app.Activity) r1
            com.ss.android.lark.permission.rxPermission.a r3 = new com.ss.android.lark.permission.rxPermission.a
            r3.<init>(r1)
            java.lang.String[] r1 = com.ss.android.lark.permission.C51326e.f127822c
            r1 = r1[r0]
            boolean r1 = r3.mo176921a(r1)
            if (r1 != 0) goto L_0x0047
            java.lang.String[] r1 = new java.lang.String[r2]
            java.lang.String[] r4 = com.ss.android.lark.permission.C51326e.f127822c
            r4 = r4[r0]
            r1[r0] = r4
            io.reactivex.Observable r0 = r3.mo176924c(r1)
            com.ss.android.lark.qrcode.ui.d$3 r1 = new com.ss.android.lark.qrcode.ui.d$3
            r1.<init>(r6, r7)
            r0.subscribe(r1)
            goto L_0x004a
        L_0x0047:
            r5.mo180922a(r6, r7)
        L_0x004a:
            return r2
        L_0x004b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.qrcode.ui.C52953d.mo180927a(android.content.Context, android.os.Bundle):boolean");
    }

    /* renamed from: a */
    public void mo180926a(AbstractC29569m mVar) {
        this.f130831f = mVar;
    }

    /* renamed from: h */
    private Context m205069h() {
        aj ajVar = this.f130828c;
        if (ajVar == null) {
            return null;
        }
        return ajVar.mo105591a();
    }

    /* renamed from: g */
    private void m205068g() {
        Vibrator vibrator;
        Context h = m205069h();
        if (h != null && (vibrator = (Vibrator) h.getSystemService("vibrator")) != null) {
            vibrator.vibrate(200);
        }
    }

    private C52953d() {
        this.f130826a = new ArrayList();
        this.f130827b = new ArrayList();
        AbstractC52938a b = QRCodeModule.m204933b();
        this.f130830e = b;
        if (b == null) {
            Log.m165383e("QRCodeScanManager", "QRCodeModule.getDependency() is null");
            return;
        }
        this.f130826a.addAll(QRCodeModule.m204933b().mo178105b());
        this.f130827b.addAll(QRCodeModule.m204933b().mo178108c());
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.qrcode.ui.d$a */
    public static class C52958a implements IQRCodeScanner.IScanHandler {

        /* renamed from: a */
        private Bitmap f130843a;

        public C52958a(Bitmap bitmap) {
            this.f130843a = bitmap;
        }

        @Override // com.ss.android.lark.qrcode.ui.IQRCodeScanner.IScanHandler
        /* renamed from: a */
        public int mo180905a(PicScanner picScanner) {
            return picScanner.start(this.f130843a, new ScanSettings());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.qrcode.ui.d$c */
    public static class C52960c implements IQRCodeScanner.IScanHandler {

        /* renamed from: a */
        private String f130845a;

        public C52960c(String str) {
            this.f130845a = str;
        }

        @Override // com.ss.android.lark.qrcode.ui.IQRCodeScanner.IScanHandler
        /* renamed from: a */
        public int mo180905a(PicScanner picScanner) {
            return picScanner.start(this.f130845a, new ScanSettings());
        }
    }

    /* renamed from: a */
    public void mo180921a(Context context) {
        C37055c.f95200c = true;
        QRCodeScanActivity.m204989c(context);
    }

    /* renamed from: b */
    public void mo180930b(Context context) {
        QRCodeScanActivity.m204989c(context);
    }

    /* renamed from: d */
    public void mo180935d(final Context context) {
        this.f130828c = new aj() {
            /* class com.ss.android.lark.qrcode.ui.C52953d.C529574 */

            @Override // com.ss.android.lark.biz.core.api.aj
            /* renamed from: a */
            public void mo105592a(aj.AbstractC29546a aVar) {
            }

            @Override // com.ss.android.lark.biz.core.api.aj
            /* renamed from: a */
            public void mo105593a(aj.AbstractC29547b bVar) {
            }

            @Override // com.ss.android.lark.biz.core.api.aj
            /* renamed from: b */
            public void mo105594b() {
            }

            @Override // com.ss.android.lark.biz.core.api.aj
            /* renamed from: a */
            public Context mo105591a() {
                return context;
            }
        };
    }

    /* renamed from: b */
    private boolean m205066b(IQRCodeScanResultHandler iQRCodeScanResultHandler) {
        if (iQRCodeScanResultHandler instanceof ak) {
            return ((ak) iQRCodeScanResultHandler).mo105597a();
        }
        return true;
    }

    /* renamed from: c */
    private boolean m205067c(IQRCodeScanResultHandler iQRCodeScanResultHandler) {
        if (iQRCodeScanResultHandler instanceof al) {
            return ((al) iQRCodeScanResultHandler).mo105598b();
        }
        return true;
    }

    /* renamed from: a */
    public String mo180919a(Bitmap bitmap) {
        return m205065a(new C52958a(bitmap));
    }

    /* renamed from: a */
    public String mo180920a(String str) {
        return m205065a(new C52960c(str));
    }

    /* renamed from: b */
    public boolean mo180931b(String str) {
        return mo180918a(str, 2).f130854a;
    }

    /* renamed from: c */
    public void mo180933c(final Context context) {
        this.f130830e.mo178102a(context, new AbstractC52938a.AbstractC52939a() {
            /* class com.ss.android.lark.qrcode.ui.C52953d.C529552 */

            @Override // com.ss.android.lark.qrcode.p2553a.AbstractC52938a.AbstractC52939a
            /* renamed from: a */
            public void mo180848a(int i) {
                if (i == 1) {
                    LKUIToast.show(context, (int) R.string.Lark_Legacy_CurrentVersionNotSupport);
                }
            }

            @Override // com.ss.android.lark.qrcode.p2553a.AbstractC52938a.AbstractC52939a
            /* renamed from: a */
            public void mo180849a(String str) {
                CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(context, str) {
                    /* class com.ss.android.lark.qrcode.ui.$$Lambda$d$2$Y_k3Z206lBRNJ0qqv6w6_PJJZ04 */
                    public final /* synthetic */ Context f$1;
                    public final /* synthetic */ String f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        C52953d.C529552.this.m205091a(this.f$1, this.f$2);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m205091a(Context context, String str) {
                C52953d.this.mo180928a(context, str, false);
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (r6 != null) goto L_0x0037;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m205065a(com.ss.android.lark.qrcode.ui.IQRCodeScanner.IScanHandler r6) {
        /*
        // Method dump skipped, instructions count: 117
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.qrcode.ui.C52953d.m205065a(com.ss.android.lark.qrcode.ui.a$b):java.lang.String");
    }

    /* renamed from: a */
    public void mo180924a(IQRCodeScanResultHandler iQRCodeScanResultHandler) {
        this.f130829d = iQRCodeScanResultHandler;
    }

    /* renamed from: a */
    public void mo180925a(aj ajVar) {
        this.f130828c = ajVar;
    }

    /* renamed from: a */
    public void mo180923a(Context context, int[] iArr) {
        QRCodeScanActivity.m204984a(context, iArr);
    }

    /* renamed from: a */
    public void mo180922a(Context context, Uri uri) {
        String str;
        if (context != null && uri != null && !TextUtils.isEmpty(uri.toString())) {
            if (!uri.toString().startsWith("image") || uri.toString().indexOf(47) <= 0) {
                str = C57788ai.m224257a(context, uri);
            } else {
                str = uri.toString().substring(uri.toString().indexOf(47));
            }
            if (!TextUtils.isEmpty(str)) {
                mo180928a(context, str, true);
            }
        }
    }

    /* renamed from: a */
    public C52964g mo180918a(String str, int i) {
        aj ajVar;
        aj ajVar2;
        aj ajVar3;
        Log.m165389i("QRCodeScanManager", "prepare to handle parse result: " + str + ", source: " + i);
        IQRCodeScanResultHandler iQRCodeScanResultHandler = this.f130829d;
        if (iQRCodeScanResultHandler == null || (ajVar3 = this.f130828c) == null || !iQRCodeScanResultHandler.mo105369a(str, ajVar3, i)) {
            for (int i2 = 0; i2 < this.f130827b.size(); i2++) {
                IQRCodeScanResultHandler iQRCodeScanResultHandler2 = this.f130827b.get(i2);
                if (iQRCodeScanResultHandler2 != null && (ajVar2 = this.f130828c) != null && iQRCodeScanResultHandler2.mo105369a(str, ajVar2, i)) {
                    Log.m165389i("QRCodeScanManager", iQRCodeScanResultHandler2.getClass().getSimpleName() + " handle result success");
                    m205068g();
                    return new C52964g(true, m205066b(iQRCodeScanResultHandler2), m205067c(iQRCodeScanResultHandler2));
                }
            }
            for (int i3 = 0; i3 < this.f130826a.size(); i3++) {
                IQRCodeScanResultHandler iQRCodeScanResultHandler3 = this.f130826a.get(i3);
                if (iQRCodeScanResultHandler3 != null && (ajVar = this.f130828c) != null && iQRCodeScanResultHandler3.mo105369a(str, ajVar, i)) {
                    Log.m165389i("QRCodeScanManager", iQRCodeScanResultHandler3.getClass().getSimpleName() + " handle result success");
                    m205068g();
                    return new C52964g(true, m205066b(iQRCodeScanResultHandler3), m205067c(iQRCodeScanResultHandler3));
                }
            }
            Log.m165389i("QRCodeScanManager", "no handler to handle result");
            m205068g();
            return new C52964g(false, false, false);
        }
        Log.m165389i("QRCodeScanManager", this.f130829d.getClass().getSimpleName() + " handle result success");
        m205068g();
        return new C52964g(true, m205066b(this.f130829d), m205067c(this.f130829d));
    }
}
