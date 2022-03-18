package com.ss.android.vc.meeting.module.speakrequest;

import android.animation.Animator;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.floatbubble.C28459a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.meeting.module.speakrequest.SpeakRequestTipView;
import com.ss.android.vc.meeting.utils.C63497j;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import java.util.List;

public class SpeakRequestTipView extends FrameLayout {

    /* renamed from: a */
    private final int f159008a;

    /* renamed from: b */
    private TextView f159009b;

    /* renamed from: c */
    private TextView f159010c;

    /* renamed from: d */
    private TextView f159011d;

    /* renamed from: e */
    private IconFontView f159012e;

    /* renamed from: f */
    private AbstractC63111b f159013f;

    /* renamed from: g */
    private AbstractC63110a f159014g;

    /* renamed from: h */
    private C63497j.AbstractC63498a f159015h;

    /* renamed from: com.ss.android.vc.meeting.module.speakrequest.SpeakRequestTipView$a */
    public interface AbstractC63110a {
        /* renamed from: a */
        void mo218451a();

        /* renamed from: b */
        void mo218452b();

        /* renamed from: c */
        void mo218453c();
    }

    /* renamed from: com.ss.android.vc.meeting.module.speakrequest.SpeakRequestTipView$b */
    public interface AbstractC63111b {
        /* renamed from: a */
        void mo218454a();
    }

    private int getToY() {
        return this.f159008a;
    }

    private int getFromY() {
        return this.f159008a + UIHelper.dp2px(40.0f);
    }

    /* renamed from: e */
    private void m247080e() {
        int toY = getToY();
        int fromY = getFromY();
        setAlpha(BitmapDescriptorFactory.HUE_RED);
        setTranslationY((float) fromY);
        animate().alpha(1.0f).setDuration(C60773o.m236125c(R.integer.vc_bar_ani_duration)).translationY((float) toY).start();
    }

    /* renamed from: c */
    public void mo218439c() {
        setAlpha(1.0f);
        animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(C60773o.m236125c(R.integer.vc_bar_ani_duration)).setListener(new Animator.AnimatorListener() {
            /* class com.ss.android.vc.meeting.module.speakrequest.SpeakRequestTipView.C631092 */

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m247089a() {
                SpeakRequestTipView.this.mo218434a();
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m247090b() {
                SpeakRequestTipView.this.mo218434a();
            }

            public void onAnimationCancel(Animator animator) {
                SpeakRequestTipView.this.post(new Runnable() {
                    /* class com.ss.android.vc.meeting.module.speakrequest.$$Lambda$SpeakRequestTipView$2$ZRoBAZp0Jxj8M7TnhpsxoiwYsV4 */

                    public final void run() {
                        SpeakRequestTipView.C631092.lambda$ZRoBAZp0Jxj8M7TnhpsxoiwYsV4(SpeakRequestTipView.C631092.this);
                    }
                });
            }

            public void onAnimationEnd(Animator animator) {
                SpeakRequestTipView.this.post(new Runnable() {
                    /* class com.ss.android.vc.meeting.module.speakrequest.$$Lambda$SpeakRequestTipView$2$qL38_jLop9KlUGfdQyeSiR0tZkE */

                    public final void run() {
                        SpeakRequestTipView.C631092.lambda$qL38_jLop9KlUGfdQyeSiR0tZkE(SpeakRequestTipView.C631092.this);
                    }
                });
            }
        });
    }

    /* renamed from: d */
    private void m247079d() {
        LayoutInflater.from(getContext()).inflate(R.layout.layout_hand_up_tip, (ViewGroup) this, true);
        this.f159009b = (TextView) findViewById(R.id.tv_title);
        this.f159012e = (IconFontView) findViewById(R.id.tv_close_tip);
        this.f159011d = (TextView) findViewById(R.id.btn_detail);
        this.f159010c = (TextView) findViewById(R.id.btn_unmute);
        this.f159012e.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.speakrequest.$$Lambda$SpeakRequestTipView$UJ29QUB5G4bludqta7MirBtv5Q */

            public final void onClick(View view) {
                SpeakRequestTipView.m271410lambda$UJ29QUB5G4bludqta7MirBtv5Q(SpeakRequestTipView.this, view);
            }
        });
        this.f159011d.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.speakrequest.$$Lambda$SpeakRequestTipView$5hEAgfkWyjY_78nr60SKhcv6xo0 */

            public final void onClick(View view) {
                SpeakRequestTipView.lambda$5hEAgfkWyjY_78nr60SKhcv6xo0(SpeakRequestTipView.this, view);
            }
        });
        this.f159010c.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.speakrequest.$$Lambda$SpeakRequestTipView$24QXb20dqOJZR09Z5YnO390pvg */

            public final void onClick(View view) {
                SpeakRequestTipView.m271409lambda$24QXb20dqOJZR09Z5YnO390pvg(SpeakRequestTipView.this, view);
            }
        });
    }

    /* renamed from: b */
    public void mo218438b() {
        setAlpha(1.0f);
        animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(C60773o.m236125c(R.integer.vc_bar_ani_duration)).translationY((float) C60773o.m236115a(10.0d)).setListener(new Animator.AnimatorListener() {
            /* class com.ss.android.vc.meeting.module.speakrequest.SpeakRequestTipView.C631081 */

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m247087a() {
                SpeakRequestTipView.this.mo218434a();
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m247088b() {
                SpeakRequestTipView.this.mo218434a();
            }

            public void onAnimationCancel(Animator animator) {
                SpeakRequestTipView.this.post(new Runnable() {
                    /* class com.ss.android.vc.meeting.module.speakrequest.$$Lambda$SpeakRequestTipView$1$WcAly3Hfbqsf10fmQSmyOZRTMUw */

                    public final void run() {
                        SpeakRequestTipView.C631081.lambda$WcAly3Hfbqsf10fmQSmyOZRTMUw(SpeakRequestTipView.C631081.this);
                    }
                });
            }

            public void onAnimationEnd(Animator animator) {
                SpeakRequestTipView.this.post(new Runnable() {
                    /* class com.ss.android.vc.meeting.module.speakrequest.$$Lambda$SpeakRequestTipView$1$EZIjg1TuJXtstk8PbhDKbIjiVS4 */

                    public final void run() {
                        SpeakRequestTipView.C631081.lambda$EZIjg1TuJXtstk8PbhDKbIjiVS4(SpeakRequestTipView.C631081.this);
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public void mo218434a() {
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
    }

    public void setByteviewUserClickListener(C63497j.AbstractC63498a aVar) {
        this.f159015h = aVar;
    }

    public void setOnDismissListener(AbstractC63111b bVar) {
        this.f159013f = bVar;
    }

    public void setSpeakRequestTipListener(AbstractC63110a aVar) {
        this.f159014g = aVar;
    }

    public SpeakRequestTipView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m247072a(View view) {
        AbstractC63110a aVar = this.f159014g;
        if (aVar != null) {
            aVar.mo218452b();
        }
        mo218439c();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m247077b(View view) {
        AbstractC63110a aVar = this.f159014g;
        if (aVar != null) {
            aVar.mo218451a();
        }
        mo218439c();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m247078c(View view) {
        AbstractC63111b bVar = this.f159013f;
        if (bVar != null) {
            bVar.mo218454a();
        }
        AbstractC63110a aVar = this.f159014g;
        if (aVar != null) {
            aVar.mo218453c();
        }
        mo218439c();
    }

    /* renamed from: b */
    private FrameLayout.LayoutParams m247076b(boolean z) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if (z) {
            layoutParams.topMargin = C28459a.m104293b(getContext(), 0);
            layoutParams.width = Math.min(C60776r.m236144b(), C60776r.m236139a()) - UIHelper.dp2px(24.0f);
        } else {
            layoutParams.topMargin = C60776r.m236148f() + C28459a.m104293b(getContext(), 36);
        }
        layoutParams.gravity = 49;
        return layoutParams;
    }

    /* renamed from: a */
    public void mo218437a(boolean z) {
        if (getVisibility() == 0) {
            setLayoutParams(m247076b(z));
        }
    }

    public SpeakRequestTipView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m247073a(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        if (viewGroup != null) {
            viewGroup.removeView(this);
            viewGroup.addView(this, layoutParams);
        }
    }

    /* renamed from: a */
    private void m247075a(String str, ByteviewUser byteviewUser) {
        SpannableString spannableString = new SpannableString(UIHelper.mustacheFormat((int) R.string.View_M_NameRaisedHand, "name", str));
        spannableString.setSpan(new C63497j.C63499b(byteviewUser, this.f159015h), 0, str.length(), 33);
        this.f159009b.setText(spannableString);
        this.f159009b.setMovementMethod(LinkMovementMethod.getInstance());
        this.f159009b.setHighlightColor(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m247074a(Participant participant, VideoChatUser videoChatUser) {
        if (videoChatUser != null && TextUtils.equals(videoChatUser.getId(), participant.getId())) {
            String name = videoChatUser.getName();
            if (participant.isGuest()) {
                name = name + UIHelper.getString(R.string.View_M_GuestParentheses);
            }
            ByteviewUser byteviewUser = new ByteviewUser();
            byteviewUser.setDeviceId(participant.getDeviceId());
            byteviewUser.setUserId(participant.getId());
            byteviewUser.setParticipantType(participant.getParticipantType());
            m247075a(name, byteviewUser);
        }
    }

    /* renamed from: a */
    public void mo218435a(ViewGroup viewGroup, boolean z) {
        m247073a(viewGroup, m247076b(z));
        m247080e();
    }

    /* renamed from: a */
    public void mo218436a(String str, List<Participant> list) {
        if (list != null && list.size() > 0) {
            if (list.size() == 1) {
                this.f159010c.setVisibility(0);
                Participant participant = list.get(0);
                UserInfoService.getUserInfoById(str, participant.getId(), participant.getParticipantType(), new GetUserInfoListener(participant) {
                    /* class com.ss.android.vc.meeting.module.speakrequest.$$Lambda$SpeakRequestTipView$wk6pfSEU2D9fg4hCemrLNZ8ln3A */
                    public final /* synthetic */ Participant f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // com.ss.android.vc.net.service.GetUserInfoListener
                    public final void onGetUserInfo(VideoChatUser videoChatUser) {
                        SpeakRequestTipView.lambda$wk6pfSEU2D9fg4hCemrLNZ8ln3A(SpeakRequestTipView.this, this.f$1, videoChatUser);
                    }
                });
                return;
            }
            this.f159010c.setVisibility(8);
            TextView textView = this.f159009b;
            textView.setText(UIHelper.mustacheFormat((int) R.string.View_M_NumberParticipantsRaisedHands, "number", list.size() + ""));
        }
    }

    public SpeakRequestTipView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f159008a = UIHelper.dp2px(12.0f);
        m247079d();
    }
}
