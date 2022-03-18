package com.ss.android.lark.qrcode.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.google.zxing.BarcodeFormat;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.fastqrcode.p1832b.C37054a;
import com.ss.android.lark.fastqrcode.p1834d.C37059b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.qrcode.QRCodeModule;
import com.ss.android.lark.qrcode.p2553a.AbstractC52938a;
import com.ss.android.lark.qrcode.ui.C52945b;
import com.ss.android.lark.qrcode.ui.QRCodeScanFragment;
import com.ss.android.lark.qrcode.ui.QRCodeScanView;
import com.ss.android.lark.qrcode.utils.QRScanUtils;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.qrcode.ui.f */
public class C52962f extends BasePresenter<C52945b.AbstractC52946a, C52945b.AbstractC52947b, C52945b.AbstractC52947b.AbstractC52948a> {

    /* renamed from: a */
    QRCodeScanView f130848a;

    /* renamed from: b */
    Activity f130849b;

    /* renamed from: c */
    QRCodeScanFragment.IQRCodeScanListener f130850c;

    /* renamed from: d */
    private AtomicLong f130851d = new AtomicLong(0);

    /* renamed from: e */
    private String f130852e;

    /* renamed from: b */
    public void mo180945b() {
        ((C52945b.AbstractC52947b) getView()).mo180885d();
    }

    /* renamed from: c */
    public void mo180946c() {
        ((C52945b.AbstractC52947b) getView()).mo180880a();
    }

    /* renamed from: d */
    public void mo180947d() {
        ((C52945b.AbstractC52947b) getView()).mo180884c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C52945b.AbstractC52947b.AbstractC52948a createViewDelegate() {
        return new C52945b.AbstractC52947b.AbstractC52948a() {
            /* class com.ss.android.lark.qrcode.ui.C52962f.C529631 */

            @Override // com.ss.android.lark.qrcode.ui.C52945b.AbstractC52947b.AbstractC52948a
            /* renamed from: a */
            public BarcodeFormat[] mo180908a() {
                return ((C52945b.AbstractC52946a) C52962f.this.getModel()).mo180906a();
            }

            @Override // com.ss.android.lark.qrcode.ui.C52945b.AbstractC52947b.AbstractC52948a
            /* renamed from: a */
            public void mo180907a(String str) {
                boolean z;
                Log.m165389i("QRCodeScanPresenter", "scan qr code success, result: " + str);
                if (C52962f.this.f130850c != null) {
                    QRCodeScanFragment.ScanResult dVar = new QRCodeScanFragment.ScanResult();
                    dVar.mo180915a(str);
                    z = C52962f.this.f130850c.mo180914a(dVar);
                } else {
                    z = false;
                }
                if (!z) {
                    C52962f.this.mo180944a(str, 1);
                }
            }
        };
    }

    /* renamed from: e */
    public void mo180948e() {
        if (this.f130851d.get() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            int i = (int) (currentTimeMillis - this.f130851d.get());
            try {
                Statistics.sendEvent("qrcode_start_process_time", new JSONObject().put("processname", this.f130852e).put("cost_time_int", i));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            String a = QRCodeModule.m204932a();
            Log.m165389i(a, "preload process success" + this.f130852e + ", at " + currentTimeMillis + ", cost " + i);
        }
        ((C52945b.AbstractC52947b) getView()).mo180883b();
    }

    /* renamed from: a */
    public void mo180942a(QRCodeScanFragment.IQRCodeScanListener cVar) {
        this.f130850c = cVar;
    }

    /* renamed from: a */
    private boolean m205104a(AbstractC52938a aVar) {
        return aVar.mo178103a("lark.android.scan.preload.process");
    }

    /* renamed from: a */
    public View mo180940a(ViewGroup viewGroup) {
        return this.f130848a.mo180879a(viewGroup);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo180943a(String str) {
        C37054a a;
        if (TextUtils.isEmpty(str) || (a = C37059b.m146191a(str, -1, -1)) == null || a.f95197b != BarcodeFormat.QR_CODE || TextUtils.isEmpty(a.f95196a)) {
            ((C52945b.AbstractC52947b) getView()).mo180882a(C57582a.m223604a((Context) this.f130849b, (int) R.string.Lark_Legacy_QrCodeNotFound));
            Log.m165389i("QRCodeScanPresenter", "handle selected photo failed, path: " + str);
            return;
        }
        Log.m165389i("QRCodeScanPresenter", "handle selected photo success, result: " + a + ", path: " + str);
        mo180944a(a.f95196a, 3);
    }

    /* renamed from: a */
    private void m205102a(AbstractC52938a aVar, QRScanUtils.ProcessSuffix processSuffix) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable(processSuffix, aVar) {
            /* class com.ss.android.lark.qrcode.ui.$$Lambda$f$6JMQWO7eSoWJLGdEXQiqBLQxL4 */
            public final /* synthetic */ QRScanUtils.ProcessSuffix f$1;
            public final /* synthetic */ AbstractC52938a f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C52962f.m270920lambda$6JMQWO7eSoWJLGdEXQiqBLQxL4(C52962f.this, this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m205103a(QRScanUtils.ProcessSuffix processSuffix, AbstractC52938a aVar) {
        this.f130851d.set(System.currentTimeMillis());
        this.f130852e = processSuffix.getValue();
        String a = QRCodeModule.m204932a();
        Log.m165389i(a, "start preload process: " + processSuffix.getValue() + ", time: " + System.currentTimeMillis());
        if (processSuffix == QRScanUtils.ProcessSuffix.SUFFIX_P0 && !QRCodeModule.m204933b().mo178103a("lark.browser.qr.process.main")) {
            aVar.mo178101a(this.f130849b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m205106c(String str, int i) {
        C52964g a = C52953d.m205064a().mo180918a(str, i);
        String a2 = QRCodeModule.m204932a();
        Log.m165389i(a2, "scanResult: isHandle: " + a.f130854a + ", isNeedClosePage: " + a.f130855b + ", isHideLoading: " + a.f130856c);
        if (!a.f130854a) {
            ((C52945b.AbstractC52947b) getView()).mo180887f();
            QRScanResultDefaultActivity.m205020a(this.f130849b, str, true);
        } else if (a.f130855b) {
            this.f130849b.finish();
        } else if (a.f130856c) {
            ((C52945b.AbstractC52947b) getView()).mo180887f();
        }
    }

    /* renamed from: a */
    public void mo180944a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            Log.m165383e("QRCodeScanPresenter", "preHandleParseResult input result is null");
            ((C52945b.AbstractC52947b) getView()).mo180882a(C57582a.m223604a((Context) this.f130849b, (int) R.string.Lark_Legacy_QrCodeNotFound));
            this.f130849b.finish();
            return;
        }
        ((C52945b.AbstractC52947b) getView()).mo180886e();
        AbstractC52938a b = QRCodeModule.m204933b();
        if (b != null && m205104a(b)) {
            if (b.mo178104a(str, this.f130849b, i)) {
                if (!QRScanUtils.m205152a()) {
                    m205102a(b, QRScanUtils.ProcessSuffix.SUFFIX_P0);
                }
            } else if (b.mo178107b(str)) {
                if (!QRScanUtils.m205154b()) {
                    m205102a(b, QRScanUtils.ProcessSuffix.SUFFIX_MINI_APP);
                }
            } else if (b.mo178109c(str) && !QRScanUtils.m205152a()) {
                m205102a(b, QRScanUtils.ProcessSuffix.SUFFIX_P0);
            }
        }
        new Handler().post(new Runnable(str, i) {
            /* class com.ss.android.lark.qrcode.ui.$$Lambda$f$mxVKzLddqvnnaZlO7JLqu75RzK0 */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C52962f.lambda$mxVKzLddqvnnaZlO7JLqu75RzK0(C52962f.this, this.f$1, this.f$2);
            }
        });
    }

    public C52962f(FragmentActivity fragmentActivity, QRCodeScanView.AbstractC52944a aVar, Intent intent) {
        QRCodeScanView qRCodeScanView = new QRCodeScanView(aVar, fragmentActivity);
        this.f130848a = qRCodeScanView;
        qRCodeScanView.setViewDelegate(createViewDelegate());
        setView(this.f130848a);
        setModel(new C52961e(intent));
        this.f130849b = fragmentActivity;
    }
}
