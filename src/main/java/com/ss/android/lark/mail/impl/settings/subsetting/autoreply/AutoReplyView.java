package com.ss.android.lark.mail.impl.settings.subsetting.autoreply;

import android.app.Activity;
import android.content.Context;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.app.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.EmailAutoReply;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.settings.subsetting.autoreply.AbstractC43500e;
import com.ss.android.lark.mail.impl.utils.ActivityDependency;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.widget.time.AbstractC44132n;
import com.ss.android.lark.mail.impl.widget.time.CalendarDate;
import com.ss.android.lark.mail.impl.widget.time.EditMultiTimeFragment;
import com.ss.android.lark.mail.impl.widget.time.MultiTimeContainer;
import com.ss.android.lark.mail.impl.widget.time.TimeData;
import com.ss.android.lark.utils.UIHelper;
import java.util.TimeZone;

public class AutoReplyView implements View.OnClickListener, AbstractC43500e.AbstractC43502b {

    /* renamed from: a */
    public AbstractC43500e.AbstractC43502b.AbstractC43503a f110418a;

    /* renamed from: b */
    public ActivityDependency f110419b;

    /* renamed from: c */
    public EmailAutoReply f110420c = new EmailAutoReply.C42059a(false, 0, 0, "").mo151154a();

    /* renamed from: d */
    public EditMultiTimeFragment f110421d;

    /* renamed from: e */
    public boolean f110422e = true;

    /* renamed from: f */
    private TimeData f110423f = new TimeData(System.currentTimeMillis() / 1000, (System.currentTimeMillis() + 3600000) / 1000, true, TimeZone.getDefault().getID());

    /* renamed from: g */
    private Context f110424g;

    /* renamed from: h */
    private AbstractC43479a f110425h;

    /* renamed from: i */
    private EditMultiTimeFragment.EventTimeFragmentAction f110426i = new EditMultiTimeFragment.EventTimeFragmentAction() {
        /* class com.ss.android.lark.mail.impl.settings.subsetting.autoreply.AutoReplyView.C434771 */

        @Override // com.ss.android.lark.mail.impl.widget.time.EditMultiTimeFragment.EventTimeFragmentAction
        /* renamed from: a */
        public void mo150641a() {
            AutoReplyView.this.f110419b.mo150553b(AutoReplyView.this.f110421d);
        }

        @Override // com.ss.android.lark.mail.impl.widget.time.EditMultiTimeFragment.EventTimeFragmentAction
        /* renamed from: a */
        public void mo150642a(long j, long j2, boolean z, String str) {
            Log.m165389i("AutoReplyView", "onSaveBtnPressed EditMultiTime startTime:" + j + ", endTime:" + j2);
            AutoReplyView.this.f110419b.mo150553b(AutoReplyView.this.f110421d);
            AutoReplyView.this.mo155311a(j, j2);
            AutoReplyView autoReplyView = AutoReplyView.this;
            autoReplyView.f110420c = new EmailAutoReply.C42059a(autoReplyView.f110420c).mo151150a(j * 1000).mo151155b((j2 * 1000) - 1).mo151154a();
            AutoReplyView.this.f110418a.mo155354a(AutoReplyView.this.f110420c);
        }
    };
    UDSwitch mAutoReplySwitch;
    ImageView mContentEditIcon;
    View mContentLayout;
    TextView mContentView;
    Group mDetailGroup;
    FrameLayout mFragmentContainer;
    MultiTimeContainer mMultiTimeContainer;
    UDCheckBox mSendToTenant;
    TextView mTenantView;

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.autoreply.AutoReplyView$a */
    public interface AbstractC43479a {
        /* renamed from: a */
        void mo155309a(AutoReplyView autoReplyView);
    }

    /* renamed from: a */
    public void mo155313a(EmailAutoReply emailAutoReply) {
        this.f110420c = emailAutoReply;
        this.mAutoReplySwitch.setCheckedIgnoreEvent(emailAutoReply.mo151132a());
        if (emailAutoReply.mo151132a()) {
            this.mDetailGroup.setVisibility(0);
        } else {
            this.mDetailGroup.setVisibility(8);
        }
        m172585a(emailAutoReply.mo151143i(), true);
        mo155312a(this.mSendToTenant, emailAutoReply.mo151139f());
        String g = emailAutoReply.mo151140g();
        if (TextUtils.isEmpty(g) && (g = C41816b.m166115a().mo150136c()) == null) {
            g = "";
        }
        this.mTenantView.setText(C43819s.m173684a((int) R.string.Mail_OOO_InternalOnly).replace("{{tenantname}}", g));
        mo155311a(emailAutoReply.mo151133b() / 1000, emailAutoReply.mo151134c() / 1000);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f110418a = null;
        this.f110425h = null;
    }

    /* renamed from: b */
    public LifecycleOwner mo155315b() {
        return (ComponentActivity) this.f110424g;
    }

    /* renamed from: c */
    public void mo155316c() {
        EditMultiTimeFragment hVar = this.f110421d;
        if (hVar != null) {
            hVar.mo156878a();
            this.f110421d = null;
            return;
        }
        ((Activity) this.f110424g).finish();
    }

    /* renamed from: d */
    private long m172589d() {
        CalendarDate calendarDate = CalendarDate.getCalendarDate(System.currentTimeMillis());
        calendarDate.setHour(23);
        calendarDate.setMinute(59);
        calendarDate.setSecond(59);
        return (calendarDate.getTimeInSeconds() * 1000) - 1;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f110425h.mo155309a(this);
        this.mMultiTimeContainer.setOnTimeChosenListener(new AbstractC44132n() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.autoreply.AutoReplyView.C434782 */

            @Override // com.ss.android.lark.mail.impl.widget.time.AbstractC44132n
            /* renamed from: a */
            public void mo155318a() {
                AutoReplyView.this.f110422e = false;
                AutoReplyView.this.mo155310a();
            }

            @Override // com.ss.android.lark.mail.impl.widget.time.AbstractC44132n
            /* renamed from: b */
            public void mo155319b() {
                AutoReplyView.this.f110422e = true;
                AutoReplyView.this.mo155310a();
            }
        });
        this.mContentLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.autoreply.$$Lambda$AutoReplyView$hhkxucq1DP8Wyhu8320oEwe6eVk */

            public final void onClick(View view) {
                AutoReplyView.lambda$hhkxucq1DP8Wyhu8320oEwe6eVk(AutoReplyView.this, view);
            }
        });
        this.mContentEditIcon.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.autoreply.$$Lambda$AutoReplyView$QcABraieacxwW6QZf0QUCi3ol1U */

            public final void onClick(View view) {
                AutoReplyView.lambda$QcABraieacxwW6QZf0QUCi3ol1U(AutoReplyView.this, view);
            }
        });
        this.mAutoReplySwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.autoreply.$$Lambda$AutoReplyView$JkdBv0xtg3Zdytc30NDu4NiB_w */

            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                AutoReplyView.m270780lambda$JkdBv0xtg3Zdytc30NDu4NiB_w(AutoReplyView.this, compoundButton, z);
            }
        });
        this.mTenantView.setOnClickListener(this);
    }

    /* renamed from: a */
    public void mo155310a() {
        boolean z;
        EditMultiTimeFragment hVar = this.f110421d;
        if (hVar == null) {
            z = true;
        } else {
            z = false;
        }
        if (hVar != null) {
            hVar.mo156894a(this.f110423f, 1 ^ (this.f110422e ? 1 : 0));
        } else {
            this.f110421d = new EditMultiTimeFragment(this.f110426i, this.f110423f, !this.f110422e ? 1 : 0, true);
        }
        m172584a(this.f110419b, this.f110421d, z);
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC43500e.AbstractC43502b.AbstractC43503a aVar) {
        this.f110418a = aVar;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m172582a(View view) {
        this.f110418a.mo155353a();
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m172588b(View view) {
        this.f110418a.mo155353a();
    }

    public void onClick(View view) {
        m172581a(view.getId(), true);
        this.f110418a.mo155354a(this.f110420c);
    }

    /* renamed from: a */
    private boolean m172587a(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str.replaceAll("(?s)<[^>]*>(\\s*<[^>]*>)*", ""))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo155312a(UDCheckBox uDCheckBox, boolean z) {
        uDCheckBox.setChecked(z);
        uDCheckBox.invalidate();
    }

    /* renamed from: a */
    private void m172581a(int i, boolean z) {
        if (i == R.id.mail_ooo_tv_tenant_name) {
            boolean isChecked = this.mSendToTenant.isChecked();
            mo155312a(this.mSendToTenant, !isChecked);
            m172586a(!isChecked, z);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m172583a(CompoundButton compoundButton, boolean z) {
        if (z) {
            this.mDetailGroup.setVisibility(0);
        } else {
            this.mDetailGroup.setVisibility(8);
        }
        EmailAutoReply.C42059a a = new EmailAutoReply.C42059a(this.f110420c).mo151153a(z);
        if (z && this.f110420c.mo151134c() < System.currentTimeMillis() + 60000) {
            a.mo151155b(m172589d());
        }
        C42187a.m168517c(z);
        this.f110418a.mo155354a(a.mo151154a());
    }

    /* renamed from: a */
    private void m172585a(String str, boolean z) {
        if (m172587a(str)) {
            this.mContentView.setText("");
        } else if (z) {
            SpannableString spannableString = new SpannableString(Html.fromHtml(str.replaceAll("<img[^>]*>", "")));
            spannableString.setSpan(new ForegroundColorSpan(UIHelper.getColor(R.color.text_title)), 0, spannableString.length(), 33);
            this.mContentView.setText(spannableString);
        } else {
            this.mContentView.setText(str);
        }
    }

    /* renamed from: a */
    private void m172586a(boolean z, boolean z2) {
        EmailAutoReply emailAutoReply;
        if (z2 && (emailAutoReply = this.f110420c) != null) {
            this.f110420c = new EmailAutoReply.C42059a(emailAutoReply).mo151157b(z).mo151154a();
        }
    }

    /* renamed from: a */
    public void mo155311a(long j, long j2) {
        TimeData timeData = new TimeData(j, j2, true, TimeZone.getDefault().getID());
        this.f110423f = timeData;
        this.mMultiTimeContainer.setData(timeData);
        this.mMultiTimeContainer.mo156794c();
    }

    /* renamed from: a */
    private void m172584a(ActivityDependency aVar, Fragment fragment, boolean z) {
        this.mFragmentContainer.setVisibility(0);
        if (z) {
            aVar.mo150552a(fragment, this.mFragmentContainer.getId());
        } else {
            aVar.mo150551a(fragment);
        }
    }

    public AutoReplyView(Context context, AbstractC43479a aVar, ActivityDependency aVar2) {
        this.f110424g = context;
        this.f110425h = aVar;
        this.f110419b = aVar2;
    }
}
