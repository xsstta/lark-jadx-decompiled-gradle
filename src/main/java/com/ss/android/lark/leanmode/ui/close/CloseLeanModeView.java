package com.ss.android.lark.leanmode.ui.close;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.component.ui.button.LKUIButton;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.http.netstate.NetworkUtils;
import com.ss.android.lark.leanmode.C41267h;
import com.ss.android.lark.leanmode.ui.close.C41292d;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.CommonTitleBar;

public class CloseLeanModeView implements C41292d.AbstractC41294b {

    /* renamed from: a */
    private Activity f105070a;

    /* renamed from: b */
    private AbstractC41285a f105071b;

    /* renamed from: c */
    private C41292d.AbstractC41294b.AbstractC41295a f105072c;

    /* renamed from: d */
    private boolean f105073d;
    @BindView(5109)
    LKUIButton mBtnSecurityVerify;
    @BindView(5113)
    SelectableRoundedImageView mIvUserAvatar;
    @BindView(5111)
    CommonTitleBar mTitleBar;
    @BindView(5114)
    TextView mTvUserName;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.leanmode.ui.close.CloseLeanModeView$a */
    public interface AbstractC41285a {
        /* renamed from: a */
        void mo148716a();

        /* renamed from: a */
        void mo148717a(CloseLeanModeView closeLeanModeView);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f105072c.mo148721a(this.f105073d);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f105071b.mo148717a(this);
        m163695b();
    }

    /* renamed from: b */
    private void m163695b() {
        this.f105072c.mo148719a();
        this.f105072c.mo148722b();
        this.mBtnSecurityVerify.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.leanmode.ui.close.$$Lambda$CloseLeanModeView$Dtu9ufUvAQ1yx2AnyqPO3X01eRg */

            public final void onClick(View view) {
                CloseLeanModeView.lambda$Dtu9ufUvAQ1yx2AnyqPO3X01eRg(CloseLeanModeView.this, view);
            }
        });
        if (m163696c()) {
            this.mBtnSecurityVerify.performClick();
        }
    }

    /* renamed from: c */
    private boolean m163696c() {
        Activity activity = this.f105070a;
        if (activity == null) {
            Log.m165389i("CloseLeanModeView", "isNetworkAvailable called. activity is null.");
            return false;
        } else if (NetworkUtils.m153070c(activity)) {
            return true;
        } else {
            LKUIToast.show(this.f105070a, (int) R.string.Lark_Legacy_NetworkError);
            return false;
        }
    }

    @Override // com.ss.android.lark.leanmode.ui.close.C41292d.AbstractC41294b
    /* renamed from: a */
    public void mo148711a() {
        AbstractC41285a aVar = this.f105071b;
        if (aVar != null) {
            aVar.mo148716a();
        }
    }

    /* renamed from: a */
    public void setViewDelegate(C41292d.AbstractC41294b.AbstractC41295a aVar) {
        this.f105072c = aVar;
    }

    @Override // com.ss.android.lark.leanmode.ui.close.C41292d.AbstractC41294b
    /* renamed from: a */
    public void mo148713a(String str) {
        this.mTvUserName.setText(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m163694a(View view) {
        if (m163696c()) {
            this.f105072c.mo148720a(this.f105070a);
        }
    }

    @Override // com.ss.android.lark.leanmode.ui.close.C41292d.AbstractC41294b
    /* renamed from: a */
    public void mo148715a(boolean z) {
        this.f105073d = z;
    }

    public CloseLeanModeView(Activity activity, AbstractC41285a aVar) {
        this.f105070a = activity;
        this.f105071b = aVar;
    }

    @Override // com.ss.android.lark.leanmode.ui.close.C41292d.AbstractC41294b
    /* renamed from: a */
    public void mo148714a(String str, String str2) {
        C41267h.m163598a().mo143868a(this.f105070a, str, str2, this.mIvUserAvatar);
    }
}
