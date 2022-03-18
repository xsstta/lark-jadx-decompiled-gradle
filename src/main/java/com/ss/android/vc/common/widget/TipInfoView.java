package com.ss.android.vc.common.widget;

import android.animation.Animator;
import android.content.Context;
import android.os.CountDownTimer;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60774p;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.widget.TipInfoView;
import com.ss.android.vc.entity.VcI18nKeyInfo;
import com.ss.android.vc.entity.VcMsgInfo;
import com.ss.android.vc.meeting.module.admin.VideoChatAdminSettings;
import com.ss.android.vc.meeting.module.p3130k.C61999a;
import com.ss.android.vc.statistics.event.MeetingChargingEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TipInfoView extends FrameLayout {

    /* renamed from: a */
    public IconFontView f152092a;

    /* renamed from: b */
    public IconFontView f152093b;

    /* renamed from: c */
    public AbstractC60817c f152094c;

    /* renamed from: d */
    public VcMsgInfo f152095d;

    /* renamed from: e */
    public CountDownTimer f152096e;

    /* renamed from: f */
    public String f152097f;

    /* renamed from: g */
    public String f152098g;

    /* renamed from: h */
    public AbstractC60816b f152099h;

    /* renamed from: i */
    private int f152100i;

    /* renamed from: j */
    private int f152101j;

    /* renamed from: k */
    private boolean f152102k;

    /* renamed from: l */
    private long f152103l;

    /* renamed from: m */
    private TextView f152104m;

    /* renamed from: com.ss.android.vc.common.widget.TipInfoView$b */
    public interface AbstractC60816b {
        void onDismiss();
    }

    /* renamed from: com.ss.android.vc.common.widget.TipInfoView$c */
    public interface AbstractC60817c {
        void onJump(VcI18nKeyInfo vcI18nKeyInfo);
    }

    private int getToY() {
        return this.f152100i;
    }

    private int getFromY() {
        return this.f152100i + UIHelper.dp2px(40.0f);
    }

    /* renamed from: f */
    private void m236370f() {
        int toY = getToY();
        int fromY = getFromY();
        setAlpha(BitmapDescriptorFactory.HUE_RED);
        setTranslationY((float) fromY);
        animate().alpha(1.0f).setDuration(C60773o.m236125c(R.integer.vc_bar_ani_duration)).translationY((float) toY).start();
    }

    /* renamed from: a */
    public void mo208489a() {
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
            setVisibility(8);
        }
    }

    /* renamed from: b */
    public void mo208494b() {
        setAlpha(1.0f);
        animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(C60773o.m236125c(R.integer.vc_bar_ani_duration)).translationY((float) C60773o.m236115a(10.0d)).setListener(new Animator.AnimatorListener() {
            /* class com.ss.android.vc.common.widget.TipInfoView.C608132 */

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m236380a() {
                TipInfoView.this.mo208489a();
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m236381b() {
                TipInfoView.this.mo208489a();
            }

            public void onAnimationCancel(Animator animator) {
                TipInfoView.this.post(new Runnable() {
                    /* class com.ss.android.vc.common.widget.$$Lambda$TipInfoView$2$2Pb5A4jzcjsRzilUdejtVzrMnA */

                    public final void run() {
                        TipInfoView.C608132.m271127lambda$2Pb5A4jzcjsRzilUdejtVzrMnA(TipInfoView.C608132.this);
                    }
                });
            }

            public void onAnimationEnd(Animator animator) {
                TipInfoView.this.post(new Runnable() {
                    /* class com.ss.android.vc.common.widget.$$Lambda$TipInfoView$2$n_OmTO672bSRToAuYAgNl6BR01o */

                    public final void run() {
                        TipInfoView.C608132.lambda$n_OmTO672bSRToAuYAgNl6BR01o(TipInfoView.C608132.this);
                    }
                });
            }
        });
    }

    /* renamed from: c */
    public void mo208496c() {
        C60700b.m235851b("TipInfoView", "[dismiss]", "dismiss");
        CountDownTimer countDownTimer = this.f152096e;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f152096e = null;
        }
        setAlpha(1.0f);
        animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(C60773o.m236125c(R.integer.vc_bar_ani_duration)).setListener(new Animator.AnimatorListener() {
            /* class com.ss.android.vc.common.widget.TipInfoView.C608143 */

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m236382a() {
                TipInfoView.this.mo208489a();
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m236383b() {
                TipInfoView.this.mo208489a();
            }

            public void onAnimationCancel(Animator animator) {
                TipInfoView.this.post(new Runnable() {
                    /* class com.ss.android.vc.common.widget.$$Lambda$TipInfoView$3$txE8WdghGwEhbfvRYR9XxVKFB1s */

                    public final void run() {
                        TipInfoView.C608143.lambda$txE8WdghGwEhbfvRYR9XxVKFB1s(TipInfoView.C608143.this);
                    }
                });
            }

            public void onAnimationEnd(Animator animator) {
                TipInfoView.this.post(new Runnable() {
                    /* class com.ss.android.vc.common.widget.$$Lambda$TipInfoView$3$Bdzk4MDECgv6Ytndne3sZ25_mAI */

                    public final void run() {
                        TipInfoView.C608143.lambda$Bdzk4MDECgv6Ytndne3sZ25_mAI(TipInfoView.C608143.this);
                    }
                });
            }
        });
    }

    /* renamed from: d */
    public void mo208497d() {
        long currentTimeMillis = ((long) this.f152101j) - (System.currentTimeMillis() - this.f152103l);
        if (currentTimeMillis < 0) {
            currentTimeMillis = 0;
        }
        C60700b.m235851b("TipInfoView", "[dismissOnPush]", "delayTime = " + currentTimeMillis);
        C60735ab.m236002a(new Runnable() {
            /* class com.ss.android.vc.common.widget.$$Lambda$IapFCQwO7rhIhmn0ieH9a_YulE */

            public final void run() {
                TipInfoView.this.mo208496c();
            }
        }, currentTimeMillis);
    }

    /* renamed from: e */
    private void m236369e() {
        if (!C61999a.m242220f()) {
            this.f152100i = C60776r.m236148f() + UIHelper.dp2px(52.0f);
        } else {
            this.f152100i = UIHelper.dp2px(32.0f);
        }
        LayoutInflater.from(getContext()).inflate(R.layout.tip_info_layout, (ViewGroup) this, true);
        this.f152104m = (TextView) findViewById(R.id.tip_msg);
        this.f152093b = (IconFontView) findViewById(R.id.icon_info);
        IconFontView iconFontView = (IconFontView) findViewById(R.id.tip_close);
        this.f152092a = iconFontView;
        iconFontView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.common.widget.$$Lambda$TipInfoView$QQ4wzZCwsPd4AC5jXKsnqy4_50 */

            public final void onClick(View view) {
                TipInfoView.m271126lambda$QQ4wzZCwsPd4AC5jXKsnqy4_50(TipInfoView.this, view);
            }
        });
    }

    public void setNeedCountDown(boolean z) {
        this.f152102k = z;
    }

    public void setOnDismissListener(AbstractC60816b bVar) {
        this.f152099h = bVar;
    }

    public void setTimeout(int i) {
        this.f152101j = i;
    }

    public TipInfoView(Context context) {
        this(context, null);
    }

    /* renamed from: com.ss.android.vc.common.widget.TipInfoView$a */
    public class C60815a extends ClickableSpan {

        /* renamed from: b */
        private VcI18nKeyInfo f152109b;

        /* renamed from: c */
        private AbstractC60817c f152110c;

        public void onClick(View view) {
            AbstractC60817c cVar = this.f152110c;
            if (cVar != null) {
                cVar.onJump(this.f152109b);
            }
        }

        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(C60773o.m236126d(R.color.primary_pri_400));
            textPaint.setUnderlineText(false);
        }

        private C60815a(VcI18nKeyInfo vcI18nKeyInfo, AbstractC60817c cVar) {
            this.f152109b = vcI18nKeyInfo;
            this.f152110c = cVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m236367a(View view) {
        AbstractC60816b bVar = this.f152099h;
        if (bVar != null) {
            bVar.onDismiss();
        }
        mo208496c();
    }

    public void setTipIcon(String str) {
        int i;
        boolean equals = TextUtils.equals("info", str);
        int i2 = R.string.iconfont_icon_info_solid;
        if (equals) {
            i = R.color.function_info_500;
        } else if (TextUtils.equals("warning", str)) {
            i2 = R.string.iconfont_icon_warning_solid;
            i = R.color.function_warning_500;
        } else if (TextUtils.equals("error", str)) {
            i2 = R.string.iconfont_icon_error;
            i = R.color.function_danger_500;
        } else {
            i = R.color.primary_pri_500;
        }
        this.f152093b.setText(i2);
        this.f152093b.setTextColor(C60773o.m236126d(i));
    }

    /* renamed from: a */
    public void mo208490a(int i) {
        if (i > 0) {
            this.f152096e = new CountDownTimer((long) (i * 1000), 1000) {
                /* class com.ss.android.vc.common.widget.TipInfoView.CountDownTimerC608121 */

                public void onFinish() {
                    C60700b.m235851b("TipInfoView", "[onFinish]", "countdown finish");
                    TipInfoView.this.f152096e = null;
                    TipInfoView.this.mo208496c();
                }

                public void onTick(long j) {
                    String a = C60774p.m236130a(j / 1000);
                    TipInfoView tipInfoView = TipInfoView.this;
                    tipInfoView.mo208495b(a, tipInfoView.f152095d, TipInfoView.this.f152094c);
                }
            }.start();
            MeetingChargingEvent.m249931a(MeetingChargingEvent.DurationPopType.TenMinutes);
        }
    }

    /* renamed from: a */
    public void mo208491a(ViewGroup viewGroup) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 49;
        m236368a(viewGroup, layoutParams);
        this.f152103l = System.currentTimeMillis();
        m236370f();
        if (this.f152095d.cmd == 1) {
            MeetingChargingEvent.m249930a();
        }
        if (this.f152102k) {
            mo208490a(Integer.parseInt(this.f152095d.message));
        }
    }

    /* renamed from: a */
    public void mo208493a(boolean z) {
        if (!z) {
            this.f152100i = C60776r.m236148f() + UIHelper.dp2px(52.0f);
        } else {
            this.f152100i = UIHelper.dp2px(32.0f);
        }
    }

    public TipInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m236368a(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        if (viewGroup != null) {
            viewGroup.removeView(this);
            viewGroup.addView(this, layoutParams);
        }
    }

    public TipInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f152100i = UIHelper.dp2px(12.0f);
        this.f152101j = 0;
        this.f152102k = false;
        m236369e();
    }

    /* renamed from: b */
    public void mo208495b(String str, VcMsgInfo vcMsgInfo, AbstractC60817c cVar) {
        if (VideoChatAdminSettings.m239429i()) {
            String mustacheFormat = UIHelper.mustacheFormat((int) R.string.View_G_UpgradePlanToExtendLimit, "time", str);
            Matcher matcher = Pattern.compile("@@.*?@@").matcher(mustacheFormat);
            String str2 = mustacheFormat;
            int i = 0;
            int i2 = 0;
            while (matcher.find()) {
                String group = matcher.group();
                String substring = mustacheFormat.substring(matcher.start() + 2, matcher.end() - 2);
                String replace = mustacheFormat.replace(group, substring);
                i2 = matcher.start();
                int length = substring.length() + i2;
                str2 = replace;
                i = length;
            }
            if (i > 0) {
                SpannableString spannableString = new SpannableString(str2);
                spannableString.setSpan(new C60815a(vcMsgInfo.msg_i18n_key, cVar), i2, i, 33);
                this.f152104m.setText(spannableString);
                this.f152104m.setMovementMethod(LinkMovementMethod.getInstance());
                this.f152104m.setHighlightColor(0);
                return;
            }
            this.f152104m.setText(str2);
            return;
        }
        this.f152104m.setText(UIHelper.mustacheFormat((int) R.string.View_M_EndInTimeBraces, "time", str));
    }

    /* renamed from: a */
    public void mo208492a(String str, VcMsgInfo vcMsgInfo, AbstractC60817c cVar) {
        if (vcMsgInfo != null && vcMsgInfo.msg_i18n_key != null && !TextUtils.isEmpty(vcMsgInfo.message)) {
            this.f152094c = cVar;
            this.f152095d = vcMsgInfo;
            String str2 = vcMsgInfo.message;
            VcI18nKeyInfo vcI18nKeyInfo = vcMsgInfo.msg_i18n_key;
            this.f152097f = str;
            this.f152098g = vcI18nKeyInfo.newKey;
            if (vcI18nKeyInfo.type == VcI18nKeyInfo.Type.UNKNOWN || vcI18nKeyInfo.type == VcI18nKeyInfo.Type.NORMAL) {
                this.f152104m.setText(str2);
                return;
            }
            Matcher matcher = Pattern.compile("@@.*?@@").matcher(str2);
            String str3 = str2;
            int i = 0;
            int i2 = 0;
            while (matcher.find()) {
                String group = matcher.group();
                String substring = str2.substring(matcher.start() + 2, matcher.end() - 2);
                String replace = str2.replace(group, substring);
                i2 = matcher.start();
                int length = substring.length() + i2;
                str3 = replace;
                i = length;
            }
            if (i > 0) {
                SpannableString spannableString = new SpannableString(str3);
                spannableString.setSpan(new C60815a(vcI18nKeyInfo, cVar), i2, i, 33);
                this.f152104m.setText(spannableString);
                this.f152104m.setMovementMethod(LinkMovementMethod.getInstance());
                this.f152104m.setHighlightColor(0);
                return;
            }
            this.f152104m.setText(str3);
        }
    }
}
