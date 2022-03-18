package com.ss.android.lark.qrcode.ui;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.AbstractC29569m;
import com.ss.android.lark.fastqrcode.p1834d.C37059b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.monitor.p2372a.C48211b;
import com.ss.android.lark.qrcode.QRCodeModule;
import com.ss.android.lark.qrcode.ui.C52945b;
import com.ss.android.lark.qrcode.ui.IQRCodeScanner;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;

public class QRCodeScanView implements C52945b.AbstractC52947b {

    /* renamed from: a */
    AbstractC52944a f130801a;

    /* renamed from: b */
    FragmentActivity f130802b;

    /* renamed from: c */
    C52945b.AbstractC52947b.AbstractC52948a f130803c;

    /* renamed from: d */
    IQRCodeScanner f130804d = m204997g();

    /* renamed from: e */
    private LKUIStatus f130805e;
    FrameLayout mCustomViewContainer;
    CommonTitleBar mMyTitleBar;

    /* renamed from: com.ss.android.lark.qrcode.ui.QRCodeScanView$a */
    public interface AbstractC52944a {
        /* renamed from: a */
        void mo180890a(View view);

        /* renamed from: a */
        void mo180891a(QRCodeScanView qRCodeScanView);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: g */
    private IQRCodeScanner m204997g() {
        return new VESDKQRCodeScanner();
    }

    /* access modifiers changed from: public */
    /* renamed from: n */
    private /* synthetic */ void m205004n() {
        LKUIStatus lKUIStatus = this.f130805e;
        if (lKUIStatus != null) {
            lKUIStatus.mo89847d();
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: o */
    private /* synthetic */ void m205005o() {
        LKUIStatus lKUIStatus = this.f130805e;
        if (lKUIStatus != null) {
            lKUIStatus.mo89837a();
        }
    }

    @Override // com.ss.android.lark.qrcode.ui.C52945b.AbstractC52947b
    /* renamed from: c */
    public void mo180884c() {
        this.f130804d.mo180903c();
    }

    @Override // com.ss.android.lark.qrcode.ui.C52945b.AbstractC52947b
    /* renamed from: d */
    public void mo180885d() {
        this.f130804d.mo180902b();
    }

    /* renamed from: h */
    private void m204998h() {
        m205000j();
        m205001k();
        m204999i();
        m205002l();
        m205003m();
    }

    /* renamed from: j */
    private void m205000j() {
        StatusBarUtil.setTranslucentForImageView(this.f130802b, 0, this.mMyTitleBar);
    }

    /* renamed from: k */
    private void m205001k() {
        this.mMyTitleBar.getLeftDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
    }

    @Override // com.ss.android.lark.qrcode.ui.C52945b.AbstractC52947b
    /* renamed from: a */
    public void mo180880a() {
        C57805b.m224331b(this.f130802b, new C57805b.AbstractC57809a() {
            /* class com.ss.android.lark.qrcode.ui.QRCodeScanView.C529422 */

            @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
            public void permissionGranted(boolean z) {
                if (z) {
                    C48211b.m190251a().mo168689b("FastQRCodeOnStart");
                    QRCodeScanView.this.f130804d.mo180900a();
                    C48211b.m190251a().mo168691c("FastQRCodeOnStart");
                    C48211b.m190251a().mo168692d();
                    return;
                }
                C48211b.m190251a().mo168693e();
            }
        });
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f130801a.mo180891a(this);
        m204998h();
    }

    @Override // com.ss.android.lark.qrcode.ui.C52945b.AbstractC52947b
    /* renamed from: e */
    public void mo180886e() {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.lark.qrcode.ui.$$Lambda$QRCodeScanView$e3GCh3ksYQOogjrq4BTJpPkRtk */

            public final void run() {
                QRCodeScanView.m270917lambda$e3GCh3ksYQOogjrq4BTJpPkRtk(QRCodeScanView.this);
            }
        });
    }

    @Override // com.ss.android.lark.qrcode.ui.C52945b.AbstractC52947b
    /* renamed from: f */
    public void mo180887f() {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.lark.qrcode.ui.$$Lambda$QRCodeScanView$fz3mECTFR5sPko30OGs38Mte70 */

            public final void run() {
                QRCodeScanView.m270918lambda$fz3mECTFR5sPko30OGs38Mte70(QRCodeScanView.this);
            }
        });
    }

    @Override // com.ss.android.lark.qrcode.ui.C52945b.AbstractC52947b
    /* renamed from: b */
    public void mo180883b() {
        this.f130804d.mo180904d();
        this.mMyTitleBar.getLeftDrawable().setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
    }

    /* renamed from: l */
    private void m205002l() {
        C48211b.m190251a().mo168689b("FastQRCodeOnCreate");
        final long currentTimeMillis = System.currentTimeMillis();
        this.f130804d.mo180901a(this.f130802b, R.id.qrcodeview, this.f130803c.mo180908a(), new IQRCodeScanner.IQRCodeScanListener() {
            /* class com.ss.android.lark.qrcode.ui.QRCodeScanView.C529411 */

            @Override // com.ss.android.lark.qrcode.ui.IQRCodeScanner.IQRCodeScanListener
            /* renamed from: a */
            public void mo180888a(List<String> list) {
                if (!list.isEmpty()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Log.m165389i(QRCodeModule.f130789a, "Scan time from entering the page to scanning to the result = " + (currentTimeMillis - currentTimeMillis));
                    QRCodeScanView.this.f130803c.mo180907a(list.get(0));
                }
            }
        });
        C48211b.m190251a().mo168691c("FastQRCodeOnCreate");
    }

    /* renamed from: m */
    private void m205003m() {
        FrameLayout frameLayout = this.mCustomViewContainer;
        if (frameLayout != null && (frameLayout.getContext() instanceof Activity)) {
            this.f130805e = new LKUIStatus.C25680a((ViewGroup) ((Activity) this.mCustomViewContainer.getContext()).getWindow().getDecorView()).mo89858a(UIHelper.getString(R.string.Lark_Legacy_LoadingWait)).mo89859a();
        }
    }

    /* renamed from: i */
    private void m204999i() {
        View a;
        AbstractC29569m f = C52953d.m205064a().mo180937f();
        if (f != null && (a = f.mo105778a(C52953d.m205064a().mo180934d(), this.mCustomViewContainer)) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mCustomViewContainer.getLayoutParams();
            marginLayoutParams.topMargin = (C37059b.m146187a(this.f130802b).y + UIUtils.dp2px(this.f130802b, 255.0f)) / 2;
            this.mCustomViewContainer.setLayoutParams(marginLayoutParams);
            this.mCustomViewContainer.addView(a);
        }
    }

    /* renamed from: a */
    public void setViewDelegate(C52945b.AbstractC52947b.AbstractC52948a aVar) {
        this.f130803c = aVar;
    }

    @Override // com.ss.android.lark.qrcode.ui.C52945b.AbstractC52947b
    /* renamed from: a */
    public void mo180882a(String str) {
        LKUIToast.show(this.f130802b, str);
    }

    /* renamed from: a */
    public View mo180879a(ViewGroup viewGroup) {
        View a = this.f130804d.mo180899a(viewGroup);
        a.findViewById(R.id.qrcode_open_album).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.qrcode.ui.QRCodeScanView.View$OnClickListenerC529433 */

            public void onClick(View view) {
                QRCodeScanView.this.f130801a.mo180890a(view);
            }
        });
        return a;
    }

    public QRCodeScanView(AbstractC52944a aVar, FragmentActivity fragmentActivity) {
        this.f130801a = aVar;
        this.f130802b = fragmentActivity;
    }
}
