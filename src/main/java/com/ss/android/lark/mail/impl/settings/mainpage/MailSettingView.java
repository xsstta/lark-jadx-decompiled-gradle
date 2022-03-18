package com.ss.android.lark.mail.impl.settings.mainpage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.app.ComponentActivity;
import androidx.lifecycle.LifecycleOwner;
import butterknife.BindView;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.settings.mainpage.C43437a;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.ui.CommonTitleBar;

public class MailSettingView implements C43437a.AbstractC43440b {

    /* renamed from: a */
    LKUIStatus f110345a;

    /* renamed from: b */
    public C43437a.AbstractC43440b.AbstractC43441a f110346b;

    /* renamed from: c */
    private Context f110347c;

    /* renamed from: d */
    private AbstractC43436a f110348d;
    @BindView(9530)
    ViewGroup mLoadingView;
    @BindView(9529)
    LinearLayout mSettingListView;
    @BindView(10320)
    CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.mail.impl.settings.mainpage.MailSettingView$a */
    public interface AbstractC43436a {
        /* renamed from: a */
        void mo155239a(MailSettingView mailSettingView);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: c */
    public Context mo155245c() {
        return this.f110347c;
    }

    /* renamed from: a */
    public void mo155240a() {
        this.mSettingListView.removeAllViews();
    }

    /* renamed from: b */
    public LifecycleOwner mo155244b() {
        return (ComponentActivity) this.f110347c;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f110348d.mo155239a(this);
        this.mLoadingView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.settings.mainpage.MailSettingView.View$OnClickListenerC434351 */

            public void onClick(View view) {
                if (MailSettingView.this.f110345a.mo89852i()) {
                    MailSettingView.this.f110346b.mo155252a();
                }
            }
        });
        this.f110345a = new LKUIStatus.C25680a(this.mLoadingView).mo89855a(0.44d).mo89861b(C43819s.m173684a((int) R.string.Mail_Common_NetworkError)).mo89860b(R.drawable.illustration_placeholder_common_load_failed).mo89859a();
    }

    /* renamed from: a */
    public void setViewDelegate(C43437a.AbstractC43440b.AbstractC43441a aVar) {
        this.f110346b = aVar;
    }

    /* renamed from: a */
    public void mo155242a(View view) {
        this.mSettingListView.addView(view);
    }

    /* renamed from: a */
    public void mo155241a(int i) {
        Log.m165389i("MailSettingView", "Page Status Change : " + i);
        if (i == 2) {
            this.mSettingListView.setVisibility(0);
            this.mLoadingView.setVisibility(8);
            this.f110345a.mo89847d();
            return;
        }
        this.mSettingListView.setVisibility(8);
        this.mLoadingView.setVisibility(0);
        if (i == 1) {
            this.f110345a.mo89837a();
            return;
        }
        this.f110345a.mo89843b();
        C42209j.m168612a("messagelist_error_page", "error_page");
    }

    public MailSettingView(Context context, AbstractC43436a aVar) {
        this.f110347c = context;
        this.f110348d = aVar;
    }
}
