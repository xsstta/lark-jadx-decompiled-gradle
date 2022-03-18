package com.ss.android.lark.mail.impl.settings.subsetting.accountdetail;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.ComponentActivity;
import androidx.lifecycle.LifecycleOwner;
import butterknife.BindView;
import com.larksuite.component.universe_design.notice.UDNotice;
import com.ss.android.lark.mail.impl.entity.C42087a;
import com.ss.android.lark.mail.impl.settings.subsetting.accountdetail.AbstractC43470c;
import com.ss.android.lark.mail.impl.view.p2225a.C43909a;
import com.ss.android.lark.mail.impl.widget.MailDefaultAvatarView;
import com.ss.android.lark.ui.CommonTitleBar;

public class AccountDetailSettingView implements AbstractC43470c.AbstractC43473b {

    /* renamed from: a */
    private final Context f110387a;

    /* renamed from: b */
    private AbstractC43458a f110388b;

    /* renamed from: c */
    private AbstractC43470c.AbstractC43473b.AbstractC43474a f110389c;

    /* renamed from: d */
    private C43909a f110390d;
    @BindView(8294)
    TextView mAccountAddressTv;
    @BindView(8296)
    TextView mAccountNameTv;
    @BindView(9237)
    View mAccountPanel;
    @BindView(8297)
    UDNotice mAccountTipBanner;
    @BindView(9232)
    MailDefaultAvatarView mDefaultAvatarIv;
    @BindView(8295)
    TextView mDelinkTipsTv;
    @BindView(9529)
    LinearLayout mSettingListView;
    @BindView(10320)
    CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.accountdetail.AccountDetailSettingView$a */
    public interface AbstractC43458a {
        /* renamed from: a */
        void mo155272a(AccountDetailSettingView accountDetailSettingView);
    }

    /* renamed from: b */
    public void mo155278b() {
    }

    /* renamed from: d */
    public Context mo155280d() {
        return this.f110387a;
    }

    /* renamed from: a */
    public void mo155273a() {
        C43909a aVar = this.f110390d;
        if (aVar != null) {
            aVar.mo156326a();
        }
    }

    /* renamed from: c */
    public LifecycleOwner mo155279c() {
        return (ComponentActivity) this.f110387a;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f110388b.mo155272a(this);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        mo155273a();
        this.f110389c = null;
        this.f110388b = null;
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC43470c.AbstractC43473b.AbstractC43474a aVar) {
        this.f110389c = aVar;
    }

    /* renamed from: a */
    public void mo155274a(View view) {
        this.mSettingListView.addView(view);
    }

    /* renamed from: a */
    public void mo155277a(boolean z) {
        if (z) {
            this.mDelinkTipsTv.setVisibility(0);
        } else {
            this.mDelinkTipsTv.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo155275a(C42087a aVar) {
        if (aVar != null) {
            this.mDefaultAvatarIv.mo156548a(aVar.mo151808a(), aVar.mo151810b(), aVar.mo151812d());
            if (!aVar.mo151813e()) {
                this.mAccountTipBanner.getIcon().setTintList(null);
                this.mAccountTipBanner.setVisibility(0);
            } else {
                this.mAccountTipBanner.setVisibility(8);
            }
            if (aVar.f107030g == 1) {
                this.mDefaultAvatarIv.setWarningFlag(true);
            } else {
                this.mDefaultAvatarIv.setWarningFlag(false);
            }
            this.mAccountNameTv.setText(aVar.mo151811c());
            this.mAccountAddressTv.setText(aVar.mo151812d());
        }
    }

    public AccountDetailSettingView(Context context, AbstractC43458a aVar) {
        this.f110387a = context;
        this.f110388b = aVar;
    }
}
