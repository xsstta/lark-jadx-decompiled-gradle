package com.ss.android.vc.meeting.module.lobby;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.floatbubble.C28459a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.meeting.module.lobby.LobbyTipView;
import com.ss.android.vc.meeting.module.lobby.pb.VCLobbyParticipant;
import com.ss.android.vc.meeting.utils.C63497j;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import java.util.List;

public class LobbyTipView extends FrameLayout {

    /* renamed from: a */
    public TextView f156032a;

    /* renamed from: b */
    private final int f156033b;

    /* renamed from: c */
    private TextView f156034c;

    /* renamed from: d */
    private TextView f156035d;

    /* renamed from: e */
    private TextView f156036e;

    /* renamed from: f */
    private AbstractC62117b f156037f;

    /* renamed from: g */
    private AbstractC62116a f156038g;

    /* renamed from: h */
    private C63497j.AbstractC63498a f156039h;

    /* renamed from: com.ss.android.vc.meeting.module.lobby.LobbyTipView$a */
    public interface AbstractC62116a {
        /* renamed from: a */
        void mo214927a();

        /* renamed from: b */
        void mo214928b();

        /* renamed from: c */
        void mo214929c();
    }

    /* renamed from: com.ss.android.vc.meeting.module.lobby.LobbyTipView$b */
    public interface AbstractC62117b {
        /* renamed from: a */
        void mo214930a();
    }

    private int getToY() {
        return this.f156033b;
    }

    private int getFromY() {
        return this.f156033b + UIHelper.dp2px(40.0f);
    }

    /* renamed from: e */
    private void m242617e() {
        int toY = getToY();
        int fromY = getFromY();
        setAlpha(BitmapDescriptorFactory.HUE_RED);
        setTranslationY((float) fromY);
        animate().alpha(1.0f).setDuration(C60773o.m236125c(R.integer.vc_bar_ani_duration)).translationY((float) toY).start();
    }

    /* renamed from: c */
    public void mo214914c() {
        setAlpha(1.0f);
        animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(C60773o.m236125c(R.integer.vc_bar_ani_duration)).setListener(new Animator.AnimatorListener() {
            /* class com.ss.android.vc.meeting.module.lobby.LobbyTipView.C621153 */

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m242626a() {
                LobbyTipView.this.mo214909a();
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m242627b() {
                LobbyTipView.this.mo214909a();
            }

            public void onAnimationCancel(Animator animator) {
                LobbyTipView.this.post(new Runnable() {
                    /* class com.ss.android.vc.meeting.module.lobby.$$Lambda$LobbyTipView$3$111Kz2SdV5kT8dAXNFR2ABhjYQ */

                    public final void run() {
                        LobbyTipView.C621153.m271291lambda$111Kz2SdV5kT8dAXNFR2ABhjYQ(LobbyTipView.C621153.this);
                    }
                });
            }

            public void onAnimationEnd(Animator animator) {
                LobbyTipView.this.post(new Runnable() {
                    /* class com.ss.android.vc.meeting.module.lobby.$$Lambda$LobbyTipView$3$HX5PgqrmMeTp_yrO6Nr968oq_TE */

                    public final void run() {
                        LobbyTipView.C621153.lambda$HX5PgqrmMeTp_yrO6Nr968oq_TE(LobbyTipView.C621153.this);
                    }
                });
            }
        });
    }

    /* renamed from: d */
    private void m242616d() {
        LayoutInflater.from(getContext()).inflate(R.layout.layout_lobby_tip, (ViewGroup) this, true);
        this.f156032a = (TextView) findViewById(R.id.tv_someone_in_lobby);
        this.f156034c = (TextView) findViewById(R.id.tv_close_lobby_tip);
        this.f156035d = (TextView) findViewById(R.id.btn_view_lobby);
        this.f156036e = (TextView) findViewById(R.id.btn_lobby_admit);
        this.f156034c.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.lobby.$$Lambda$LobbyTipView$wuMVyZTJnGihopQVOyginTqI */

            public final void onClick(View view) {
                LobbyTipView.m271289lambda$wuMVyZTJnGihopQVOyginTqI(LobbyTipView.this, view);
            }
        });
        this.f156035d.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.lobby.$$Lambda$LobbyTipView$H5lTEEWYAkumJZiBTefTfUJku7o */

            public final void onClick(View view) {
                LobbyTipView.lambda$H5lTEEWYAkumJZiBTefTfUJku7o(LobbyTipView.this, view);
            }
        });
        this.f156036e.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.lobby.$$Lambda$LobbyTipView$tWnr7AkIBOtbVwEV4v959fVCkc */

            public final void onClick(View view) {
                LobbyTipView.m271288lambda$tWnr7AkIBOtbVwEV4v959fVCkc(LobbyTipView.this, view);
            }
        });
    }

    /* renamed from: a */
    public void mo214909a() {
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
    }

    /* renamed from: b */
    public void mo214913b() {
        setAlpha(1.0f);
        animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(C60773o.m236125c(R.integer.vc_bar_ani_duration)).translationY((float) C60773o.m236115a(10.0d)).setListener(new Animator.AnimatorListener() {
            /* class com.ss.android.vc.meeting.module.lobby.LobbyTipView.C621142 */

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m242624a() {
                LobbyTipView.this.mo214909a();
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m242625b() {
                LobbyTipView.this.mo214909a();
            }

            public void onAnimationCancel(Animator animator) {
                LobbyTipView.this.post(new Runnable() {
                    /* class com.ss.android.vc.meeting.module.lobby.$$Lambda$LobbyTipView$2$psbhz9facW2YcYBpXNcE8Kgf8Cc */

                    public final void run() {
                        LobbyTipView.C621142.lambda$psbhz9facW2YcYBpXNcE8Kgf8Cc(LobbyTipView.C621142.this);
                    }
                });
            }

            public void onAnimationEnd(Animator animator) {
                LobbyTipView.this.post(new Runnable() {
                    /* class com.ss.android.vc.meeting.module.lobby.$$Lambda$LobbyTipView$2$ORP4C3wlnJes6_YNYVlNluHoqw */

                    public final void run() {
                        LobbyTipView.C621142.m271290lambda$ORP4C3wlnJes6_YNYVlNluHoqw(LobbyTipView.C621142.this);
                    }
                });
            }
        });
    }

    public void setByteviewUserClickListener(C63497j.AbstractC63498a aVar) {
        this.f156039h = aVar;
    }

    public void setLobbyTipListener(AbstractC62116a aVar) {
        this.f156038g = aVar;
    }

    public void setOnDismissListener(AbstractC62117b bVar) {
        this.f156037f = bVar;
    }

    public LobbyTipView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m242608a(View view) {
        AbstractC62116a aVar = this.f156038g;
        if (aVar != null) {
            aVar.mo214928b();
        }
        mo214914c();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m242613b(View view) {
        AbstractC62116a aVar = this.f156038g;
        if (aVar != null) {
            aVar.mo214927a();
        }
        mo214914c();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m242615c(View view) {
        AbstractC62117b bVar = this.f156037f;
        if (bVar != null) {
            bVar.mo214930a();
        }
        AbstractC62116a aVar = this.f156038g;
        if (aVar != null) {
            aVar.mo214929c();
        }
        mo214914c();
    }

    /* renamed from: b */
    private FrameLayout.LayoutParams m242612b(boolean z) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if (z || DesktopUtil.m144307b()) {
            layoutParams.topMargin = C28459a.m104293b(getContext(), 0);
            layoutParams.width = Math.min(C60776r.m236144b(), C60776r.m236139a()) - UIHelper.dp2px(24.0f);
        } else {
            layoutParams.topMargin = C60776r.m236148f() + C28459a.m104293b(getContext(), 36);
        }
        layoutParams.gravity = 49;
        return layoutParams;
    }

    /* renamed from: a */
    public void mo214912a(boolean z) {
        if (getVisibility() == 0) {
            setLayoutParams(m242612b(z));
        }
    }

    public LobbyTipView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m242609a(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        if (viewGroup != null) {
            viewGroup.removeView(this);
            viewGroup.addView(this, layoutParams);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m242614b(final String str, ByteviewUser byteviewUser) {
        final String mustacheFormat = UIHelper.mustacheFormat((int) R.string.View_M_NameEnteredLobby, "name", str);
        final C63497j.C63499b bVar = new C63497j.C63499b(byteviewUser, this.f156039h);
        final Paint paint = new Paint();
        paint.setTextSize((float) C60773o.m236115a(16.0d));
        paint.setTypeface(Typeface.defaultFromStyle(1));
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        this.f156032a.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            /* class com.ss.android.vc.meeting.module.lobby.LobbyTipView.ViewTreeObserver$OnPreDrawListenerC621131 */

            public boolean onPreDraw() {
                float f;
                int width = LobbyTipView.this.f156032a.getWidth();
                if (width <= 0) {
                    spannableStringBuilder.append((CharSequence) mustacheFormat);
                    spannableStringBuilder.setSpan(bVar, 0, str.length(), 33);
                    LobbyTipView.this.f156032a.setText(spannableStringBuilder);
                    LobbyTipView.this.f156032a.setMovementMethod(LinkMovementMethod.getInstance());
                    LobbyTipView.this.f156032a.setHighlightColor(0);
                    LobbyTipView.this.f156032a.getViewTreeObserver().removeOnPreDrawListener(this);
                    return true;
                }
                int i = 0;
                int i2 = 0;
                while (true) {
                    Paint paint = paint;
                    String str = str;
                    f = (float) width;
                    if (paint.measureText(str, i, str.length()) < f) {
                        break;
                    }
                    Paint paint2 = paint;
                    String str2 = str;
                    int breakText = paint2.breakText(str2, i, str2.length(), true, f, new float[1]) + i;
                    spannableStringBuilder.append((CharSequence) str.substring(i, breakText));
                    spannableStringBuilder.append((CharSequence) System.getProperty("line.separator"));
                    i2++;
                    i = breakText;
                }
                Paint paint3 = paint;
                String str3 = str;
                float measureText = paint3.measureText(str3, i, str3.length());
                spannableStringBuilder.append((CharSequence) str.substring(i));
                float f2 = f - measureText;
                if (LobbyTipView.this.f156032a.getPaint().measureText(mustacheFormat.substring(str.length())) > f2) {
                    int breakText2 = LobbyTipView.this.f156032a.getPaint().breakText(mustacheFormat, str.length(), mustacheFormat.length(), true, f2, new float[1]);
                    spannableStringBuilder.append((CharSequence) mustacheFormat.substring(str.length(), str.length() + breakText2));
                    spannableStringBuilder.append((CharSequence) System.getProperty("line.separator"));
                    spannableStringBuilder.append((CharSequence) mustacheFormat.substring(str.length() + breakText2));
                } else {
                    spannableStringBuilder.append((CharSequence) mustacheFormat.substring(str.length()));
                }
                spannableStringBuilder.setSpan(bVar, 0, str.length() + i2, 33);
                LobbyTipView.this.f156032a.setText(spannableStringBuilder);
                LobbyTipView.this.f156032a.setMovementMethod(LinkMovementMethod.getInstance());
                LobbyTipView.this.f156032a.setHighlightColor(0);
                LobbyTipView.this.f156032a.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
        });
    }

    /* renamed from: a */
    private void m242611a(String str, ByteviewUser byteviewUser) {
        C60735ab.m236001a(new Runnable(str, byteviewUser) {
            /* class com.ss.android.vc.meeting.module.lobby.$$Lambda$LobbyTipView$QFCyVQK_08wmSWdHVZrnWaEsQL4 */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ ByteviewUser f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                LobbyTipView.lambda$QFCyVQK_08wmSWdHVZrnWaEsQL4(LobbyTipView.this, this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: a */
    public void mo214910a(ViewGroup viewGroup, boolean z) {
        m242609a(viewGroup, m242612b(z));
        m242617e();
    }

    /* renamed from: a */
    public void mo214911a(String str, List<VCLobbyParticipant> list) {
        if (list != null && list.size() > 0) {
            if (list.size() == 1) {
                this.f156036e.setVisibility(0);
                VCLobbyParticipant vCLobbyParticipant = list.get(0);
                if (!TextUtils.isEmpty(vCLobbyParticipant.getNickName())) {
                    String nickName = vCLobbyParticipant.getNickName();
                    if (vCLobbyParticipant.isGuest()) {
                        nickName = nickName + UIHelper.getString(R.string.View_M_GuestParentheses);
                    }
                    m242611a(nickName, vCLobbyParticipant.getUser());
                    return;
                }
                ByteviewUser user = vCLobbyParticipant.getUser();
                UserInfoService.getUserInfoById(str, user.getUserId(), user.getParticipantType(), new GetUserInfoListener(user, vCLobbyParticipant) {
                    /* class com.ss.android.vc.meeting.module.lobby.$$Lambda$LobbyTipView$iXG9yeMBH8I5xNFsGR9BuqjTsts */
                    public final /* synthetic */ ByteviewUser f$1;
                    public final /* synthetic */ VCLobbyParticipant f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    @Override // com.ss.android.vc.net.service.GetUserInfoListener
                    public final void onGetUserInfo(VideoChatUser videoChatUser) {
                        LobbyTipView.lambda$iXG9yeMBH8I5xNFsGR9BuqjTsts(LobbyTipView.this, this.f$1, this.f$2, videoChatUser);
                    }
                });
                return;
            }
            this.f156036e.setVisibility(8);
            this.f156032a.setText(UIHelper.mustacheFormat((int) R.string.View_M_NumberPeopleEnteredLobby, "number", list.size() + ""));
        }
    }

    public LobbyTipView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f156033b = UIHelper.dp2px(12.0f);
        m242616d();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m242610a(ByteviewUser byteviewUser, VCLobbyParticipant vCLobbyParticipant, VideoChatUser videoChatUser) {
        if (videoChatUser != null && TextUtils.equals(videoChatUser.getId(), byteviewUser.getUserId())) {
            String name = videoChatUser.getName();
            if (vCLobbyParticipant.isGuest()) {
                name = name + UIHelper.getString(R.string.View_M_GuestParentheses);
            }
            m242611a(name, byteviewUser);
        }
    }
}
