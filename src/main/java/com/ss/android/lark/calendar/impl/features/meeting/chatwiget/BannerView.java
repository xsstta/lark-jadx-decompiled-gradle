package com.ss.android.lark.calendar.impl.features.meeting.chatwiget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.component.ui.p1151c.C25633a;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.ao;

public class BannerView extends AbstractC31960b {

    /* renamed from: a */
    float f81671a = 1.0f;

    /* renamed from: b */
    int f81672b;

    /* renamed from: c */
    int f81673c;
    @BindView(9018)
    ImageView chatBannerIcon;
    @BindView(9019)
    LinearLayout chatBannerTextZone;
    @BindView(9432)
    ImageView closeBanner;

    /* renamed from: d */
    int f81674d;

    /* renamed from: e */
    int f81675e;

    /* renamed from: f */
    int f81676f;

    /* renamed from: g */
    int f81677g;

    /* renamed from: h */
    int f81678h;

    /* renamed from: i */
    int f81679i;

    /* renamed from: j */
    int f81680j;

    /* renamed from: k */
    boolean f81681k = true;

    /* renamed from: l */
    Context f81682l;
    @BindView(9445)
    TextView locationOrTime;

    /* renamed from: m */
    View f81683m;

    /* renamed from: n */
    String f81684n;

    /* renamed from: o */
    String f81685o;

    /* renamed from: p */
    String f81686p;

    /* renamed from: q */
    ValueAnimator f81687q = new ValueAnimator();

    /* renamed from: r */
    ValueAnimator f81688r = new ValueAnimator();
    @BindView(9458)
    TextView summary;
    @BindView(9464)
    TextView time;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo116608a() {
        this.f81683m.setBackgroundColor(this.f81676f);
    }

    /* renamed from: d */
    private void m121592d() {
        this.f81683m = LayoutInflater.from(this.f81682l).inflate(R.layout.calendar_meeting_chat_banner, this);
        ButterKnife.bind(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo116609b() {
        this.f81706u += (int) this.time.getPaint().measureText(UIUtils.getString(this.f81682l, R.string.Calendar_Detail_EventDetail));
    }

    @Override // com.ss.android.lark.calendar.impl.features.meeting.chatwiget.AbstractC31960b
    /* renamed from: c */
    public void mo116605c() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            this.f81705t = ((FrameLayout.LayoutParams) layoutParams).topMargin - this.f81704s;
            ao.m125223a((View) this.closeBanner, 6, 6);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.meeting.chatwiget.AbstractC31960b
    public void setConfirmListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    @Override // com.ss.android.lark.calendar.impl.features.meeting.chatwiget.AbstractC31960b
    public void setCloseListener(View.OnClickListener onClickListener) {
        this.closeBanner.setOnClickListener(onClickListener);
    }

    public BannerView(Context context) {
        super(context);
        m121590a(context);
        m121592d();
        mo116608a();
        mo116609b();
    }

    /* renamed from: a */
    private void m121590a(Context context) {
        this.f81682l = context;
        this.f81672b = UIUtils.dp2px(context, 24.0f);
        this.f81673c = UIUtils.dp2px(context, 12.0f);
        this.f81674d = UIUtils.dp2px(context, 6.0f);
        this.f81675e = UIUtils.dp2px(context, 10.0f);
        this.f81677g = UIUtils.dp2px(context, 8.0f);
        this.f81678h = UIUtils.dp2px(context, 20.0f);
        this.f81679i = UIUtils.dp2px(context, 6.0f);
        this.f81680j = UIUtils.dp2px(context, 10.0f);
        this.f81676f = UIUtils.getColor(context, R.color.ud_O100);
    }

    public BannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m121590a(context);
        m121592d();
        mo116608a();
        mo116609b();
    }

    @Override // com.ss.android.lark.calendar.impl.features.meeting.chatwiget.AbstractC31960b
    /* renamed from: a */
    public void mo116603a(String str, String str2, String str3) {
        this.f81684n = str;
        this.f81685o = str2;
        this.f81686p = str3;
        m121591b(str, str2, str3);
    }

    /* renamed from: b */
    private void m121591b(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            this.summary.setVisibility(8);
            this.time.getPaint().setFakeBoldText(true);
            this.time.setTextColor(UIUtils.getColor(this.f81682l, R.color.text_title));
        } else {
            this.summary.setVisibility(0);
            this.summary.setText(str);
            this.time.getPaint().setFakeBoldText(false);
            this.time.setTextColor(C25633a.m91708b(C32634ae.m125178a(R.color.text_title), 0.6f));
        }
        this.time.setText(str2);
        if (TextUtils.isEmpty(str3)) {
            this.locationOrTime.setVisibility(8);
            return;
        }
        this.locationOrTime.setVisibility(0);
        this.locationOrTime.setText(str3);
    }
}
