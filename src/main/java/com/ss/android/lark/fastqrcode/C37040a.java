package com.ss.android.lark.fastqrcode;

import android.app.Activity;
import android.content.Context;
import android.hardware.Camera;
import com.google.zxing.BarcodeFormat;
import com.ss.android.lark.fastqrcode.p1831a.C37049c;
import com.ss.android.lark.fastqrcode.p1831a.CallableC37047b;
import com.ss.android.lark.fastqrcode.p1832b.C37054a;
import com.ss.android.lark.fastqrcode.p1833c.C37056a;
import com.ss.android.lark.fastqrcode.widget.QRCodeView;

/* renamed from: com.ss.android.lark.fastqrcode.a */
public class C37040a {

    /* renamed from: a */
    public static QRCodeView f95164a;

    /* renamed from: b */
    public static C37049c f95165b;

    /* renamed from: c */
    public static AbstractC37045a f95166c;

    /* renamed from: d */
    private static Activity f95167d;

    /* renamed from: e */
    private static boolean f95168e;

    /* renamed from: com.ss.android.lark.fastqrcode.a$a */
    public interface AbstractC37045a {
        /* renamed from: a */
        void mo103263a(C37054a aVar);
    }

    /* renamed from: a */
    public static Context m146119a() {
        return f95167d;
    }

    /* renamed from: c */
    public static void m146123c() {
        QRCodeView qRCodeView = f95164a;
        if (qRCodeView != null) {
            qRCodeView.mo136665g();
        }
    }

    /* renamed from: b */
    public static void m146122b() {
        f95168e = true;
        C37049c cVar = f95165b;
        if (cVar != null) {
            cVar.mo136572c();
        }
        QRCodeView qRCodeView = f95164a;
        if (qRCodeView != null) {
            qRCodeView.mo136665g();
            f95164a.getCameraPreview().setVisibility(0);
        }
    }

    /* renamed from: d */
    public static void m146124d() {
        C37049c cVar = f95165b;
        if (cVar != null) {
            cVar.mo136573d();
        }
        QRCodeView qRCodeView = f95164a;
        if (qRCodeView != null) {
            qRCodeView.mo136661c();
        }
        CallableC37047b.m146138b();
    }

    /* renamed from: e */
    public static void m146125e() {
        QRCodeView qRCodeView = f95164a;
        if (qRCodeView != null) {
            qRCodeView.mo136668h();
            f95164a = null;
        }
        f95167d = null;
        f95165b = null;
        f95166c = null;
    }

    /* renamed from: f */
    private static void m146126f() {
        C37049c cVar = new C37049c();
        f95165b = cVar;
        if (cVar != null) {
            cVar.mo136570a(new C37049c.AbstractC37050a() {
                /* class com.ss.android.lark.fastqrcode.C37040a.C370422 */

                @Override // com.ss.android.lark.fastqrcode.p1831a.C37049c.AbstractC37050a
                /* renamed from: a */
                public void mo136564a() {
                    if (C37040a.f95164a != null) {
                        C37040a.f95164a.mo136659a(new Camera.AutoFocusCallback() {
                            /* class com.ss.android.lark.fastqrcode.C37040a.C370422.C370431 */

                            public void onAutoFocus(boolean z, Camera camera) {
                                C37051b.m146150a("FastQRCode", "autoFocus success");
                                if (C37040a.f95165b != null) {
                                    C37040a.f95165b.mo136569a();
                                }
                                C37040a.f95164a.postDelayed(new Runnable() {
                                    /* class com.ss.android.lark.fastqrcode.C37040a.C370422.C370431.RunnableC370441 */

                                    public void run() {
                                        if (C37040a.f95165b != null) {
                                            C37040a.f95165b.mo136571b();
                                        }
                                    }
                                }, 2000);
                            }
                        });
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static boolean m146121a(Context context) {
        if (context.getResources().getConfiguration().orientation == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m146120a(Activity activity, int i, BarcodeFormat[] barcodeFormatArr, AbstractC37045a aVar) {
        final long currentTimeMillis = System.currentTimeMillis();
        f95167d = activity;
        QRCodeView qRCodeView = (QRCodeView) activity.findViewById(i);
        f95164a = qRCodeView;
        f95166c = aVar;
        qRCodeView.setFormats(barcodeFormatArr);
        f95164a.setDelegate(new QRCodeView.AbstractC37065a() {
            /* class com.ss.android.lark.fastqrcode.C37040a.C370411 */

            @Override // com.ss.android.lark.fastqrcode.widget.QRCodeView.AbstractC37065a
            /* renamed from: a */
            public void mo136562a() {
                C37051b.m146152c("FastQRCode", "open camera error");
            }

            @Override // com.ss.android.lark.fastqrcode.widget.QRCodeView.AbstractC37065a
            /* renamed from: a */
            public void mo136563a(C37054a aVar) {
                C37056a.m146162a(System.currentTimeMillis() - currentTimeMillis);
                if (C37040a.f95166c != null) {
                    C37040a.f95166c.mo103263a(aVar);
                }
            }
        });
        m146126f();
        C37056a.m146160a();
    }
}
