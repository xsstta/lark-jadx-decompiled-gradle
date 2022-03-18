package com.ss.android.lark.mail.impl.settings.subsetting.signature;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ComponentActivity;
import androidx.lifecycle.LifecycleOwner;
import butterknife.BindView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.compose.C41988g;
import com.ss.android.lark.mail.impl.message.view.p2212c.AbstractC43201b;
import com.ss.android.lark.mail.impl.message.view.p2212c.C43194a;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43585h;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.EmailSignature;
import com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c;
import com.ss.android.lark.mail.impl.uiframework.view.webview.C43713a;
import com.ss.android.lark.mail.impl.uiframework.view.webview.C43728g;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;

public class SignatureView implements View.OnClickListener, AbstractC43585h.AbstractC43587b, AbstractC43719c {

    /* renamed from: a */
    C43194a f110584a;

    /* renamed from: b */
    public final Context f110585b;

    /* renamed from: c */
    private String f110586c = "";

    /* renamed from: d */
    private AbstractC43564a f110587d;

    /* renamed from: e */
    private AbstractC43585h.AbstractC43587b.AbstractC43588a f110588e;

    /* renamed from: f */
    private EmailSignature f110589f = new EmailSignature.C43549a().mo155488a();

    /* renamed from: g */
    private final C43713a f110590g;
    @BindView(10115)
    UDCheckBox mDisableRadio;
    @BindView(10379)
    View mDisableTv;
    @BindView(10119)
    TextView mMobileContent;
    @BindView(10118)
    View mMobileContentLayout;
    @BindView(10120)
    UDCheckBox mMobileRadio;
    @BindView(10396)
    View mMobileTv;
    @BindView(10121)
    ScrollView mPCContentBg;
    @BindView(10123)
    View mPCEmptyTextView;
    @BindView(10125)
    UDCheckBox mPCRadio;
    @BindView(10398)
    View mPCTv;
    @BindView(10320)
    CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.SignatureView$a */
    public interface AbstractC43564a {
        /* renamed from: a */
        void mo155537a(SignatureView signatureView);
    }

    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c
    public Context getContext() {
        return this.f110585b;
    }

    /* renamed from: b */
    private void m172970b() {
        m172972c();
        C41988g.m166973d();
    }

    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c
    /* renamed from: o */
    public void mo150630o() {
        this.f110590g.mo155831b();
    }

    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c
    /* renamed from: p */
    public int mo150631p() {
        return this.f110590g.mo155832c();
    }

    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c
    /* renamed from: q */
    public void mo150632q() {
        this.f110590g.mo155830a();
    }

    /* renamed from: c */
    private void m172972c() {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.SignatureView.RunnableC435632 */

            public void run() {
                if (SignatureView.this.f110585b instanceof Activity) {
                    Log.m165388i("onRenderProcessGone finish Activity");
                    ((Activity) SignatureView.this.f110585b).finish();
                }
            }
        });
    }

    /* renamed from: a */
    public LifecycleOwner mo155544a() {
        return (ComponentActivity) this.f110585b;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C43194a aVar = this.f110584a;
        if (aVar != null) {
            aVar.destroy();
        }
        this.f110588e = null;
        this.f110587d = null;
    }

    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c
    public String getContainerName() {
        return ((BaseMailFragmentActivity) this.f110585b).mo150444a();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f110587d.mo155537a(this);
        this.mDisableTv.setOnClickListener(this);
        this.mMobileTv.setOnClickListener(this);
        this.mPCTv.setOnClickListener(this);
        this.mMobileContent.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.$$Lambda$SignatureView$zwT0U9nzr5REN_QIN6DuBsgAfm0 */

            public final void onClick(View view) {
                SignatureView.this.m172967a((SignatureView) view);
            }
        });
        this.f110584a = new C43194a(this.f110585b);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        this.f110584a.mo154599a(this, (AbstractC43201b) null);
        C43194a aVar = this.f110584a;
        aVar.getSettings().setUseWideViewPort(false);
        aVar.setMinimumHeight(UIHelper.dp2px(20.0f));
        this.mPCContentBg.addView(aVar, layoutParams);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.f110584a, true);
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC43585h.AbstractC43587b.AbstractC43588a aVar) {
        this.f110588e = aVar;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m172967a(View view) {
        this.f110588e.mo155583a();
    }

    /* renamed from: c */
    private void m172973c(EmailSignature emailSignature) {
        String d = emailSignature.mo155472d();
        if (TextUtils.isEmpty(d)) {
            this.mMobileContent.setText("");
            return;
        }
        this.mMobileContent.setText(d);
        this.mMobileContent.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.SignatureView.ViewTreeObserver$OnGlobalLayoutListenerC435621 */

            public void onGlobalLayout() {
                ViewTreeObserver viewTreeObserver = SignatureView.this.mMobileContent.getViewTreeObserver();
                int maxLines = SignatureView.this.mMobileContent.getMaxLines();
                if (SignatureView.this.mMobileContent.getLineCount() >= maxLines && maxLines > 1) {
                    int lineEnd = SignatureView.this.mMobileContent.getLayout().getLineEnd(maxLines - 2);
                    SignatureView.this.mMobileContent.setText(((Object) SignatureView.this.mMobileContent.getText().subSequence(0, lineEnd)) + "...");
                }
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
        });
    }

    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c
    /* renamed from: a */
    public void mo150561a(WebView webView) {
        Log.m165388i("SignatureView onRenderProcessGone 22");
        m172970b();
    }

    public void onClick(View view) {
        if (m172969a(view.getId(), true)) {
            this.f110588e.mo155584a(this.f110589f);
            C42187a.m168494a(this.f110589f.mo155470b(), this.f110589f.mo155469a());
        }
    }

    /* renamed from: b */
    private void m172971b(EmailSignature emailSignature) {
        String f = emailSignature.mo155476f();
        if (!TextUtils.isEmpty(f)) {
            if (!TextUtils.equals(this.f110586c, f)) {
                this.f110586c = f;
                this.f110584a.mo154600a(emailSignature.mo155474e(), new C43728g.C43743a.C43744a().mo155881a("").mo155882a(false).mo155883a());
                this.f110584a.loadDataWithBaseURL("file:///android_asset/template/", f, "text/html; charset=UTF-8", null, null);
            }
            this.f110584a.setVisibility(0);
            this.mPCContentBg.setVisibility(0);
            this.mPCEmptyTextView.setVisibility(8);
            return;
        }
        this.f110584a.setVisibility(8);
        this.mPCContentBg.setVisibility(8);
        this.mPCEmptyTextView.setVisibility(0);
    }

    /* renamed from: a */
    public void mo155546a(EmailSignature emailSignature) {
        this.f110589f = emailSignature;
        mo155547a(emailSignature, false);
        m172973c(emailSignature);
        m172971b(emailSignature);
    }

    public SignatureView(Context context, AbstractC43564a aVar) {
        this.f110585b = context;
        this.f110587d = aVar;
        this.f110590g = new C43713a(context);
    }

    /* renamed from: a */
    public void mo155545a(UDCheckBox uDCheckBox, boolean z) {
        uDCheckBox.setChecked(z);
        uDCheckBox.invalidate();
    }

    /* renamed from: a */
    private boolean m172969a(int i, boolean z) {
        if (i == R.id.tv_disable_name || i == R.id.sign_disable_radio) {
            if (!this.mDisableRadio.isChecked()) {
                mo155545a(this.mDisableRadio, true);
                mo155545a(this.mMobileRadio, false);
                mo155545a(this.mPCRadio, false);
                this.mMobileContent.setSelected(false);
                m172968a(false, false, z);
                return true;
            }
        } else if (i == R.id.tv_mobile_name || i == R.id.sign_mobile_radio) {
            if (!this.mMobileRadio.isChecked()) {
                mo155545a(this.mDisableRadio, false);
                mo155545a(this.mMobileRadio, true);
                mo155545a(this.mPCRadio, false);
                this.mMobileContent.setSelected(true);
                m172968a(true, false, z);
                return true;
            }
        } else if ((i == R.id.tv_pc_name || i == R.id.sign_pc_radio) && !this.mPCRadio.isChecked()) {
            mo155545a(this.mDisableRadio, false);
            mo155545a(this.mMobileRadio, false);
            mo155545a(this.mPCRadio, true);
            this.mMobileContent.setSelected(false);
            m172968a(true, true, z);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo155547a(EmailSignature emailSignature, boolean z) {
        if (emailSignature.mo155469a()) {
            m172969a(R.id.tv_pc_name, false);
        } else if (emailSignature.mo155470b()) {
            m172969a(R.id.tv_mobile_name, false);
        } else {
            m172969a(R.id.tv_disable_name, false);
        }
    }

    /* renamed from: a */
    private void m172968a(boolean z, boolean z2, boolean z3) {
        if (z3 && this.f110589f != null) {
            this.f110589f = new EmailSignature.C43549a().mo155484a(this.f110589f).mo155490b(z).mo155487a(z2).mo155488a();
        }
    }
}
