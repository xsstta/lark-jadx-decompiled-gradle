package com.ss.android.vc.meeting.module.preview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.component.ui.imageview.LKUILottieAnimationView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60762k;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.common.p3083e.C60785x;
import com.ss.android.vc.common.p3083e.C60788y;
import com.ss.android.vc.common.permission.AbstractC60798c;
import com.ss.android.vc.common.permission.C60795b;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.common.widget.PreviewVideoView;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.AdminSettings;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.request.JoinMeetingPreCheckEntityRequest;
import com.ss.android.vc.entity.response.JoinMeetingEntity;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.bytertc.C61237h;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.module.admin.VideoChatAdminSettings;
import com.ss.android.vc.meeting.module.audio.AudioRouteHelper;
import com.ss.android.vc.meeting.module.audio.C61405a;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.meeting.module.livestream.C62063d;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62264m;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62271p;
import com.ss.android.vc.meeting.module.meetingdialog.labs.LabsScene;
import com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils;
import com.ss.android.vc.meeting.module.meetingdialog.labs.preview.C62289a;
import com.ss.android.vc.meeting.module.meetingdialog.labs.preview.C62290b;
import com.ss.android.vc.meeting.module.preview.AbstractC62650a;
import com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b.AbstractC62654a;
import com.ss.android.vc.meeting.module.preview.AbstractC62715f;
import com.ss.android.vc.meeting.module.preview.guest.C62733a;
import com.ss.android.vc.meeting.utils.TimeConsumeUtils;
import com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckUtils;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.p3091e.C60917a;
import com.ss.android.vc.service.VideoChatManager;
import com.ss.android.vc.service.impl.VideoChatService;
import com.ss.android.vc.statistics.event.C63732ac;
import com.ss.android.vc.statistics.event.bp;
import com.ss.android.vc.statistics.event2.MeetingPreEvent;
import com.ss.android.vc.statistics.event2.SpeakerOptionEvent;
import com.ss.android.vc.statistics.p3180a.C63693e;
import io.reactivex.p3457e.C68296b;

/* renamed from: com.ss.android.vc.meeting.module.preview.f */
public abstract class AbstractC62715f<VD extends AbstractC62650a.AbstractC62653b.AbstractC62654a> implements AudioRouteHelper.IRouteAction, AbstractC62650a.AbstractC62653b<VD> {

    /* renamed from: A */
    protected View f157797A;

    /* renamed from: B */
    protected View f157798B;

    /* renamed from: C */
    protected View f157799C;

    /* renamed from: D */
    protected InputMethodManager f157800D;

    /* renamed from: E */
    protected C60762k f157801E;

    /* renamed from: F */
    protected String f157802F = "";

    /* renamed from: G */
    protected boolean f157803G;

    /* renamed from: H */
    protected boolean f157804H = true;

    /* renamed from: I */
    protected boolean f157805I = true;

    /* renamed from: J */
    protected boolean f157806J = true;

    /* renamed from: K */
    public C62063d f157807K;

    /* renamed from: L */
    public AbstractC61222a f157808L;

    /* renamed from: M */
    public AudioRouteHelper f157809M;

    /* renamed from: N */
    public Runnable f157810N = new Runnable() {
        /* class com.ss.android.vc.meeting.module.preview.AbstractC62715f.RunnableC627161 */

        public void run() {
            if (AbstractC62715f.this.f157821d instanceof C62733a.AbstractC62736b.AbstractC62737a) {
                ((C62733a.AbstractC62736b.AbstractC62737a) AbstractC62715f.this.f157821d).mo216727a(AbstractC62715f.this.f157819b);
            } else {
                AbstractC62715f.this.f157821d.mo216546b();
            }
        }
    };

    /* renamed from: O */
    public Runnable f157811O = new Runnable() {
        /* class com.ss.android.vc.meeting.module.preview.AbstractC62715f.RunnableC627205 */

        public void run() {
            KeyboardUtils.hideKeyboard(AbstractC62715f.this.f157819b);
            AbstractC62715f.this.f157820c.mo216600b();
            VideoChatManager.m249444a().mo220127e(false);
        }
    };

    /* renamed from: P */
    public final Handler f157812P = new Handler(Looper.getMainLooper());

    /* renamed from: Q */
    private boolean f157813Q;

    /* renamed from: R */
    private boolean f157814R;

    /* renamed from: S */
    private boolean f157815S;

    /* renamed from: T */
    private boolean f157816T = true;

    /* renamed from: U */
    private boolean f157817U;

    /* renamed from: a */
    protected BaseFragment f157818a;

    /* renamed from: b */
    protected Activity f157819b;

    /* renamed from: c */
    public AbstractC62746h f157820c;

    /* renamed from: d */
    public VD f157821d;

    /* renamed from: e */
    protected View f157822e;

    /* renamed from: f */
    protected View f157823f;

    /* renamed from: g */
    protected EditText f157824g;

    /* renamed from: h */
    protected View f157825h;

    /* renamed from: i */
    protected View f157826i;

    /* renamed from: j */
    protected View f157827j;

    /* renamed from: k */
    protected View f157828k;

    /* renamed from: l */
    protected TextView f157829l;

    /* renamed from: m */
    protected View f157830m;

    /* renamed from: n */
    protected ImageView f157831n;

    /* renamed from: o */
    protected ImageView f157832o;

    /* renamed from: p */
    ImageView f157833p;

    /* renamed from: q */
    View f157834q;

    /* renamed from: r */
    TextView f157835r;

    /* renamed from: s */
    protected ImageView f157836s;

    /* renamed from: t */
    protected TextView f157837t;

    /* renamed from: u */
    protected ConstraintLayout f157838u;

    /* renamed from: v */
    protected TextView f157839v;

    /* renamed from: w */
    protected LKUILottieAnimationView f157840w;

    /* renamed from: x */
    PreviewVideoView f157841x;

    /* renamed from: y */
    protected LKUIRoundedImageView f157842y;

    /* renamed from: z */
    protected IconFontView f157843z;

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m245390b(DialogInterface dialogInterface, int i) {
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b
    /* renamed from: f */
    public boolean mo216533f() {
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b
    /* renamed from: h */
    public void mo216535h() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo216579s() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo216580x() {
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b
    /* renamed from: c */
    public boolean mo216530c() {
        return this.f157804H;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        mo216577C();
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b
    /* renamed from: e */
    public boolean mo216532e() {
        return this.f157805I;
    }

    /* renamed from: t */
    public boolean mo216688t() {
        return this.f157815S;
    }

    /* renamed from: u */
    public boolean mo216689u() {
        return this.f157814R;
    }

    /* renamed from: y */
    public boolean mo216692y() {
        return this.f157813Q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo216680a(boolean z) {
        C60700b.m235851b("MeetingPreviewBaseView", "[updateAudioBtnState]", "audioBtn = " + this.f157804H);
        boolean b = C60788y.m236250b(this.f157819b);
        this.f157831n.setEnabled(b);
        this.f157830m.setVisibility(b ? 8 : 0);
        this.f157829l.setTextColor(C60773o.m236126d(b ? R.color.text_caption : R.color.text_disable));
        C60700b.m235851b("MeetingPreviewBaseView", "[updateAudioBtnState]", "mAudioBtn = " + mo216530c());
        boolean z2 = this.f157804H;
        int i = R.color.icon_disable;
        if (z2) {
            this.f157831n.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_mic_filled));
            Drawable drawable = this.f157831n.getDrawable();
            if (b) {
                i = R.color.ud_N700;
            }
            drawable.setTint(C60773o.m236126d(i));
        } else {
            this.f157831n.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_mic_off_filled));
            Drawable drawable2 = this.f157831n.getDrawable();
            if (b) {
                i = R.color.function_danger_500;
            }
            drawable2.setTint(C60773o.m236126d(i));
        }
        if (z) {
            mo216674a(mo216530c() ? R.string.View_VM_MicOn : R.string.View_VM_MicOff);
        }
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b
    /* renamed from: a */
    public void mo216525a(OpenChatter openChatter) {
        if (!mo216532e() && C60788y.m236247a(this.f157819b)) {
            this.f157842y.setVisibility(0);
            if (this.f157842y != null && openChatter != null) {
                C60783v.m236230a(openChatter.getAvatarKey(), openChatter.getId(), ParticipantType.LARK_USER, this.f157842y, 140, 140);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b
    /* renamed from: a */
    public void mo216529a(String str) {
        this.f157802F = str;
        this.f157824g.setText(str);
        this.f157824g.setVisibility(0);
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b
    /* renamed from: a */
    public void mo216526a(VideoChat videoChat) {
        if (videoChat != null && this.f157821d.mo216548d() && this.f157804H) {
            this.f157826i.performClick();
        }
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b
    /* renamed from: a */
    public void mo216527a(MeetingAudioManager.AudioType audioType, boolean z, MeetingAudioManager.AudioType audioType2, boolean z2, boolean z3, String str) {
        C26171w.m94675a(new Runnable(z2, audioType2, str) {
            /* class com.ss.android.vc.meeting.module.preview.$$Lambda$f$enk_fq1Mh9v_FaKDBnzoOzvhws */
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ MeetingAudioManager.AudioType f$2;
            public final /* synthetic */ String f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                AbstractC62715f.this.m245385a((AbstractC62715f) this.f$1, (boolean) this.f$2, (MeetingAudioManager.AudioType) this.f$3);
            }
        });
    }

    /* renamed from: a */
    public void mo216679a(Boolean bool) {
        C60788y.m236248b(this.f157819b, (AbstractC60798c) new AbstractC60798c(bool) {
            /* class com.ss.android.vc.meeting.module.preview.$$Lambda$f$jqn_Cle_P0aKqh5DkW4S3UyJfvk */
            public final /* synthetic */ Boolean f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.vc.common.permission.AbstractC60798c
            public final void permissionGranted(boolean z) {
                AbstractC62715f.this.m245382a((AbstractC62715f) this.f$1, (Boolean) z);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo216675a(EditText editText) {
        if (this.f157819b != null) {
            editText.requestFocus();
            if (this.f157800D == null) {
                this.f157800D = (InputMethodManager) this.f157819b.getSystemService("input_method");
            }
            this.f157800D.showSoftInput(editText, 0);
        }
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b
    /* renamed from: a */
    public void mo216528a(AbstractC62650a.AbstractC62655c cVar) {
        KeyboardUtils.hideKeyboard(this.f157819b);
        mo216691w();
        this.f157820c.mo216600b();
        if (cVar != null) {
            cVar.onPageDismiss();
        }
    }

    /* renamed from: a */
    public void mo216681a(boolean z, boolean z2) {
        if (!z2) {
            mo216673B();
        } else {
            VideoChatAdminSettings.m239405a(new AbstractC63598b<AdminSettings>() {
                /* class com.ss.android.vc.meeting.module.preview.AbstractC62715f.C627183 */

                /* access modifiers changed from: private */
                /* access modifiers changed from: public */
                /* renamed from: a */
                private /* synthetic */ void m245443a() {
                    AbstractC62715f.this.mo216673B();
                }

                /* access modifiers changed from: private */
                /* access modifiers changed from: public */
                /* renamed from: b */
                private /* synthetic */ void m245444b() {
                    AbstractC62715f.this.mo216673B();
                }

                /* renamed from: a */
                public void onSuccess(AdminSettings adminSettings) {
                    AbstractC62715f.this.f157812P.post(new Runnable() {
                        /* class com.ss.android.vc.meeting.module.preview.$$Lambda$f$3$xb1i5nw7Vj_ugxRHQT2Btvt_UPM */

                        public final void run() {
                            AbstractC62715f.C627183.this.m245444b();
                        }
                    });
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    AbstractC62715f.this.f157812P.post(new Runnable() {
                        /* class com.ss.android.vc.meeting.module.preview.$$Lambda$f$3$a_1GFeYo11FJeBJuliY0iWiXzpw */

                        public final void run() {
                            AbstractC62715f.C627183.this.m245443a();
                        }
                    });
                }
            });
        }
    }

    /* renamed from: a */
    public void mo216676a(JoinMeetingEntity joinMeetingEntity) {
        if (joinMeetingEntity.f152600a == JoinMeetingEntity.Type.PARTICIPANT_LIMIT_EXCEED) {
            C60738ac.m236023a((int) R.string.View_M_CapacityReached);
        } else if (joinMeetingEntity.f152600a == JoinMeetingEntity.Type.MEETING_ENDED) {
            C60738ac.m236023a((int) R.string.View_M_MeetingHasEnded);
        } else if (joinMeetingEntity.f152600a == JoinMeetingEntity.Type.VOIP_BUSY) {
            C60738ac.m236023a((int) R.string.View_G_CurrentlyInCall);
        } else if (joinMeetingEntity.f152600a == JoinMeetingEntity.Type.VERSION_LOW) {
            if (VideoChatModuleDependency.getAppUpgradeDependency().isHasNewVersion()) {
                mo216672A();
            } else {
                C60738ac.m236023a((int) R.string.View_G_FeatureNotSupported);
            }
        } else if (joinMeetingEntity.f152600a == JoinMeetingEntity.Type.MEETING_NUMBER_INVALID) {
            mo216537j();
        } else {
            C60738ac.m236023a((int) R.string.View_M_FailedToJoinMeeting);
        }
        if (joinMeetingEntity.f152600a != JoinMeetingEntity.Type.MEETING_NUMBER_INVALID) {
            mo216528a((AbstractC62650a.AbstractC62655c) null);
        }
    }

    /* renamed from: a */
    public void mo216678a(C63602e eVar) {
        if (eVar.f160600c) {
            return;
        }
        if (C60785x.m236238b()) {
            C60738ac.m236023a((int) R.string.View_M_FailedToJoinMeeting);
        } else {
            C60738ac.m236023a((int) R.string.View_G_NoConnection);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: Q */
    private /* synthetic */ void m245378Q() {
        this.f157813Q = true;
        m245373L();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: R */
    private /* synthetic */ void m245379R() {
        this.f157813Q = false;
        m245373L();
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b
    /* renamed from: m */
    public void mo216540m() {
        m245365D();
        m245374M();
    }

    /* renamed from: C */
    private void mo216577C() {
        AudioRouteHelper bVar = this.f157809M;
        if (bVar != null) {
            bVar.mo212739b();
            this.f157809M = null;
        }
    }

    /* renamed from: N */
    private void m245375N() {
        if (this.f157805I) {
            mo216683d(false);
        } else {
            mo216684e(false);
        }
        m245376O();
    }

    /* renamed from: A */
    public void mo216672A() {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.preview.$$Lambda$f$t5B0VO56Bl1dkt_rCIvQaS9_c0 */

            public final void run() {
                AbstractC62715f.this.m245377P();
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.audio.AudioRouteHelper.IRouteAction
    public void bV_() {
        this.f157821d.mo216547c().mo212708m();
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b
    /* renamed from: d */
    public boolean mo216531d() {
        AudioRouteHelper bVar = this.f157809M;
        if (bVar == null || !bVar.mo212737a()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b
    /* renamed from: i */
    public void mo216536i() {
        m245393c(UIHelper.getString(R.string.View_MV_MutedNoTalk_Toast));
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b
    /* renamed from: j */
    public void mo216537j() {
        C26171w.m94675a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.preview.$$Lambda$f$6q0jbE8DlGivo1JCMDoy5s5TKc */

            public final void run() {
                AbstractC62715f.this.m245379R();
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b
    /* renamed from: k */
    public void mo216538k() {
        C26171w.m94675a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.preview.$$Lambda$f$YBhuuqTLOElTQyJ0MlB29fdDF6M */

            public final void run() {
                AbstractC62715f.this.m245378Q();
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b
    /* renamed from: q */
    public void mo216544q() {
        AbstractC61222a aVar = this.f157808L;
        if (aVar != null && (aVar instanceof C62290b)) {
            ((C62290b) aVar).mo215358l();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo216687r() {
        if (this.f157820c.mo216599a() == 6) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    private void m245372K() {
        EditText editText = this.f157824g;
        if (editText != null) {
            editText.setHint(R.string.View_M_MeetingTopicQuestion);
            if (this.f157820c.mo216599a() != 1) {
                this.f157824g.setEnabled(false);
            }
        }
    }

    /* renamed from: M */
    private void m245374M() {
        if (this.f157805I && C60788y.m236247a(this.f157819b)) {
            mo216683d(false);
        }
        m245376O();
    }

    /* renamed from: O */
    private void m245376O() {
        AbstractC61222a aVar = this.f157808L;
        if (aVar instanceof C62290b) {
            ((C62290b) aVar).mo215418n();
        } else if (aVar instanceof C62289a) {
            ((C62289a) aVar).mo215416i();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: P */
    private /* synthetic */ void m245377P() {
        VCDialogUtils.m236177a((Context) this.f157819b, (int) R.string.View_M_UpdateSoftwareTitle, 2, (int) R.string.View_M_UpdateSoftwareInfo, (int) R.string.View_G_NoThanksButton, (DialogInterface.OnClickListener) $$Lambda$f$duENOsH2q1Ng8Oh0XPABPqRGA8.INSTANCE, (int) R.string.View_M_GetUpdate, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.preview.$$Lambda$f$JbQhRTE_tRibaCnKrHrbm_hwIE */

            public final void onClick(DialogInterface dialogInterface, int i) {
                AbstractC62715f.this.m245380a((AbstractC62715f) dialogInterface, (DialogInterface) i);
            }
        }, false);
    }

    /* renamed from: B */
    public void mo216673B() {
        int i;
        boolean f = LabsUtils.m242914f();
        View view = this.f157797A;
        if (f) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        if (!f) {
            this.f157808L = null;
        }
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b
    /* renamed from: o */
    public void mo216542o() {
        this.f157812P.removeCallbacksAndMessages(null);
        C60762k kVar = this.f157801E;
        if (kVar != null) {
            kVar.mo208368a();
        }
        PreviewVideoView previewVideoView = this.f157841x;
        if (previewVideoView != null) {
            previewVideoView.mo208477c();
        }
        this.f157841x = null;
        this.f157819b = null;
        this.f157808L = null;
        mo216577C();
    }

    /* renamed from: v */
    public void mo216690v() {
        C60762k kVar = new C60762k(this.f157819b);
        this.f157801E = kVar;
        kVar.mo208369a(new C60762k.AbstractC60764a() {
            /* class com.ss.android.vc.meeting.module.preview.$$Lambda$f$sGprnjn1gwv1gYbc01Ca3jbhfzk */

            @Override // com.ss.android.vc.common.p3083e.C60762k.AbstractC60764a
            public final void onKeyboardStateChanged(boolean z, int i) {
                AbstractC62715f.this.m245384a((AbstractC62715f) z, (boolean) i);
            }
        });
    }

    /* renamed from: w */
    public void mo216691w() {
        this.f157799C.setVisibility(8);
        this.f157798B.setBackgroundColor(C60773o.m236126d(R.color.ud_N00));
    }

    /* renamed from: z */
    public boolean mo216693z() {
        if (!this.f157807K.mo214802b() && !mo216692y()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.preview.f$4 */
    public static /* synthetic */ class C627194 {

        /* renamed from: a */
        static final /* synthetic */ int[] f157851a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.vc.meeting.module.audio.MeetingAudioManager$AudioType[] r0 = com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AudioType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.preview.AbstractC62715f.C627194.f157851a = r0
                com.ss.android.vc.meeting.module.audio.MeetingAudioManager$AudioType r1 = com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AudioType.Default     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.preview.AbstractC62715f.C627194.f157851a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.meeting.module.audio.MeetingAudioManager$AudioType r1 = com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AudioType.Bluetooth     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.meeting.module.preview.AbstractC62715f.C627194.f157851a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.meeting.module.audio.MeetingAudioManager$AudioType r1 = com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AudioType.HeadPhone     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.preview.AbstractC62715f.C627194.<clinit>():void");
        }
    }

    /* renamed from: D */
    private void m245365D() {
        if (this.f157809M == null) {
            AudioRouteHelper bVar = new AudioRouteHelper(null, this.f157821d.mo216547c(), this);
            this.f157809M = bVar;
            bVar.mo212736a(mo216687r());
            this.f157809M.mo212735a(new AudioRouteHelper.IStatisAction() {
                /* class com.ss.android.vc.meeting.module.preview.AbstractC62715f.C627216 */

                @Override // com.ss.android.vc.meeting.module.audio.AudioRouteHelper.IStatisAction
                /* renamed from: a */
                public void mo212748a() {
                    SpeakerOptionEvent.m249735a().mo220239a(AbstractC62715f.this.f157820c.mo216603e(), "pre_view", null);
                }

                @Override // com.ss.android.vc.meeting.module.audio.AudioRouteHelper.IStatisAction
                /* renamed from: a */
                public void mo212749a(String str) {
                    SpeakerOptionEvent.m249735a().mo220240a("pre_view", str, null, AbstractC62715f.this.f157820c.mo216603e());
                }
            });
        }
    }

    /* renamed from: G */
    private void m245368G() {
        View findViewById = this.f157822e.findViewById(R.id.top_container);
        if (findViewById != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
            marginLayoutParams.topMargin = C60776r.m236148f() + UIHelper.dp2px(10.0f);
            findViewById.setLayoutParams(marginLayoutParams);
        }
        if (DesktopUtil.m144307b()) {
            m245370I();
        }
        mo216685f(false);
    }

    /* renamed from: H */
    private void m245369H() {
        this.f157797A.setVisibility(8);
        if (LabsUtils.m242914f()) {
            this.f157797A.setVisibility(0);
            C62271p.m243197a(this.f157797A);
            this.f157797A.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.vc.meeting.module.preview.AbstractC62715f.AnonymousClass12 */

                /* access modifiers changed from: private */
                /* access modifiers changed from: public */
                /* renamed from: a */
                private /* synthetic */ void m245440a() {
                    AbstractC62715f fVar = AbstractC62715f.this;
                    fVar.f157808L = C62264m.m243165a(fVar.f157819b, null, LabsScene.PAGE_PREVIEW, AbstractC62715f.this.f157820c.mo216603e());
                    AbstractC62715f.this.f157808L.mo211606a();
                    C63732ac.m249986f(LabsScene.PAGE_PREVIEW, null);
                    KeyboardUtils.hideKeyboard(AbstractC62715f.this.f157819b);
                    AbstractC62715f.this.mo216691w();
                }

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    MeetingPreEvent.m249851a().mo220328a(AbstractC62715f.this.f157820c.mo216603e(), false);
                    C60735ab.m236002a(new Runnable() {
                        /* class com.ss.android.vc.meeting.module.preview.$$Lambda$f$12$QTIFNIUKGNbxx4FhxQW1VxMBTY */

                        public final void run() {
                            AbstractC62715f.AnonymousClass12.this.m245440a();
                        }
                    }, 200);
                }
            });
        }
    }

    @Override // com.ss.android.vc.meeting.module.audio.AudioRouteHelper.IRouteAction
    public void bW_() {
        this.f157836s.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_speaker_mute_filled));
        this.f157836s.getDrawable().setTint(C60773o.m236126d(R.color.ud_N700));
        this.f157837t.setText(R.string.View_MV_AlreadyMutedButton);
        if (this.f157804H) {
            this.f157804H = false;
            mo216680a(true);
        }
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b
    /* renamed from: l */
    public String mo216539l() {
        boolean z = this.f157805I;
        if (z && this.f157804H) {
            return "all_open";
        }
        if (z && !this.f157804H) {
            return "only_video";
        }
        if (!z && this.f157804H) {
            return "only_voice";
        }
        if (z || this.f157804H) {
            return "";
        }
        return "all_close";
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b
    /* renamed from: n */
    public void mo216541n() {
        if (!MeetingManager.m238341a().mo211892a(true)) {
            mo216684e(false);
        } else if (this.f157841x != null && !MeetingManager.m238341a().mo211898e()) {
            this.f157841x.mo208477c();
        }
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b
    /* renamed from: p */
    public void mo216543p() {
        String e = this.f157820c.mo216603e();
        if (!VideoChatService.m249602d().mo220080a()) {
            VideoChatService.m249602d().asyncCheckAndInit(new VideoChatService.OnInitFinishListener(e, "preview_page_confirm_click") {
                /* class com.ss.android.vc.meeting.module.preview.$$Lambda$f$vYZjq8lc5W3lK1WJhMLLV9r6N0 */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ String f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // com.ss.android.vc.service.impl.VideoChatService.OnInitFinishListener
                public final void onInited() {
                    AbstractC62715f.this.m245391b((AbstractC62715f) this.f$1, this.f$2);
                }
            });
        } else {
            m245391b(e, "preview_page_confirm_click");
        }
        MeetingPreEvent.m249851a().mo220340c(this.f157820c.mo216603e(), this.f157805I);
    }

    /* renamed from: F */
    private void m245367F() {
        this.f157818a.getView().setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.vc.meeting.module.preview.$$Lambda$f$QAl0VnX_G1fmgGkdLXVgvDIidWs */

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return AbstractC62715f.this.m245388a((AbstractC62715f) view, (View) motionEvent);
            }
        });
        this.f157823f.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.preview.AbstractC62715f.C627227 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (AbstractC62715f.this.mo216693z()) {
                    C60700b.m235851b("MeetingPreviewBaseView", "[onClick]", "Close button clicked");
                    AbstractC62715f.this.f157811O.run();
                    MeetingPreEvent.m249851a().mo220335b(AbstractC62715f.this.f157820c.mo216603e(), false);
                }
            }
        });
        this.f157826i.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.preview.AbstractC62715f.C627238 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (AbstractC62715f.this.mo216693z()) {
                    MeetingPreEvent.m249851a().mo220339b(AbstractC62715f.this.f157820c.mo216603e(), false, !AbstractC62715f.this.f157804H);
                    if (AbstractC62715f.this.f157804H) {
                        AbstractC62715f.this.f157804H = false;
                        AbstractC62715f.this.mo216680a(true);
                    } else if (AbstractC62715f.this.f157820c.mo216601c()) {
                        AbstractC62715f.this.mo216674a(R.string.View_M_MutedOnEntryPreview);
                    } else {
                        AbstractC62715f.this.mo216679a((Boolean) true);
                    }
                }
            }
        });
        this.f157827j.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.preview.AbstractC62715f.C627249 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (AbstractC62715f.this.mo216693z()) {
                    if (AbstractC62715f.this.f157805I) {
                        AbstractC62715f.this.f157805I = false;
                        AbstractC62715f.this.mo216684e(true);
                    } else {
                        AbstractC62715f.this.mo216683d(true);
                    }
                    MeetingPreEvent.m249851a().mo220332a(AbstractC62715f.this.f157820c.mo216603e(), false, true ^ AbstractC62715f.this.f157805I);
                }
            }
        });
        this.f157828k.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.preview.AbstractC62715f.AnonymousClass10 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (AbstractC62715f.this.mo216693z()) {
                    MeetingAudioManager c = AbstractC62715f.this.f157821d.mo216547c();
                    String str = null;
                    bp.m250202a(c.mo212720y(), c.mo212721z(), (VideoChat) null);
                    if (AbstractC62715f.this.f157809M != null && AbstractC62715f.this.f157809M.mo212738a(AbstractC62715f.this.f157819b)) {
                        str = "vc_meeting_loudspeaker_view";
                    }
                    MeetingPreEvent.m249851a().mo220331a(AbstractC62715f.this.f157820c.mo216603e(), false, C61405a.m239521a(c.mo212720y(), c.mo212721z()), str);
                }
            }
        });
        this.f157838u.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.preview.AbstractC62715f.AnonymousClass11 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                boolean z;
                if (AbstractC62715f.this.f157820c.mo216601c()) {
                    MeetingDeviceSwitchStateUtil.m245163a(Boolean.valueOf(AbstractC62715f.this.mo216532e()), null);
                } else {
                    MeetingDeviceSwitchStateUtil.m245163a(Boolean.valueOf(AbstractC62715f.this.mo216532e()), Boolean.valueOf(AbstractC62715f.this.mo216530c()));
                }
                if (AbstractC62715f.this.f157820c.mo216599a() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                bp.m250205a(z, AbstractC62715f.this.mo216689u(), AbstractC62715f.this.mo216688t(), AbstractC62715f.this.mo216532e(), AbstractC62715f.this.mo216530c(), AbstractC62715f.this.f157820c.mo216603e());
                if (AbstractC62715f.this.mo216693z()) {
                    C63693e.m249680a();
                    C60700b.m235851b("MeetingPreviewBaseView", "[onClick2]", "click join meeting button");
                    AbstractC62715f.this.mo216543p();
                }
            }
        });
    }

    /* renamed from: I */
    private void m245370I() {
        if (DesktopUtil.m144301a((Context) this.f157819b)) {
            this.f157822e.setBackground(C60773o.m236128f(R.drawable.vc_preview_lkp_bg));
        }
        if (this.f157805I && !C60917a.m236770b() && DesktopUtil.m144301a(this.f157818a.getContext())) {
            this.f157843z.setVisibility(0);
        }
        if (DesktopUtil.m144301a(this.f157818a.getContext()) && !C60917a.m236770b()) {
            this.f157843z.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.preview.$$Lambda$f$t7HNkfoMqRZdJk9Fbcsmb7EUzqk */

                public final void onClick(View view) {
                    AbstractC62715f.this.m245381a((AbstractC62715f) view);
                }
            });
        }
    }

    /* renamed from: J */
    private void m245371J() {
        boolean z = true;
        if (this.f157820c.mo216599a() == 6) {
            this.f157814R = true;
            this.f157815S = true;
        } else {
            this.f157814R = MeetingDeviceSwitchStateUtil.m245165a();
            this.f157815S = MeetingDeviceSwitchStateUtil.m245167b();
        }
        this.f157815S = mo216628c(C60788y.m236250b(this.f157819b));
        if (!this.f157814R || !C60788y.m236247a(this.f157819b)) {
            z = false;
        }
        this.f157814R = z;
        this.f157804H = this.f157815S;
        this.f157805I = z;
        this.f157829l.setText(R.string.View_G_MicAbbreviated);
        this.f157835r.setText(R.string.View_VM_Camera);
    }

    /* renamed from: L */
    private void m245373L() {
        int i;
        if (!this.f157813Q) {
            if (this.f157840w.isAnimating()) {
                this.f157840w.cancelAnimation();
            }
            this.f157838u.setPadding(UIHelper.dp2px(28.0f), 0, UIHelper.dp2px(28.0f), 0);
            this.f157840w.setVisibility(8);
            this.f157838u.setBackgroundResource(R.drawable.bg_preview_meeting_btn_selector);
            this.f157839v.setTextColor(C60773o.m236126d(R.color.static_white));
            TextView textView = this.f157839v;
            if (this.f157820c.mo216599a() == 1) {
                i = R.string.View_M_MeetNow;
            } else {
                i = R.string.View_M_JoinButton;
            }
            textView.setText(i);
            return;
        }
        this.f157838u.setBackgroundResource(R.drawable.bg_preview_meeting_btn_loading);
        this.f157838u.setPadding(UIHelper.dp2px(18.0f), 0, UIHelper.dp2px(18.0f), 0);
        this.f157839v.setTextColor(C60773o.m236126d(R.color.udtoken_btn_pri_text_disabled));
        this.f157840w.setVisibility(0);
        this.f157840w.playAnimation();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        C68296b<Boolean> a = TimeConsumeUtils.m248927a("MeetingPreviewBaseView:create");
        m245366E();
        if (this.f157820c.mo216599a() == 3) {
            this.f157807K.mo214803c(this.f157820c.mo216602d());
        } else if (this.f157820c.mo216599a() == 5) {
            this.f157807K.mo214800b(this.f157820c.mo216602d());
        } else if (this.f157820c.mo216599a() == 6) {
            this.f157807K.mo214800b(this.f157820c.mo216602d());
        } else {
            this.f157807K.mo214797a(this.f157820c.mo216602d());
        }
        TimeConsumeUtils.m248928a(a);
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b
    /* renamed from: g */
    public void mo216534g() {
        if (!this.f157817U) {
            boolean a = C60795b.m236297a((Object) this.f157819b, "android.permission.RECORD_AUDIO");
            boolean a2 = C60795b.m236297a((Object) this.f157819b, "android.permission.CAMERA");
            C60788y.m236248b(this.f157819b, (AbstractC60798c) new AbstractC60798c(C60788y.m236250b(this.f157819b), a, C60788y.m236247a(this.f157819b), a2) {
                /* class com.ss.android.vc.meeting.module.preview.$$Lambda$f$qaOzU99X1Kihol9Ktq1arFzE */
                public final /* synthetic */ boolean f$1;
                public final /* synthetic */ boolean f$2;
                public final /* synthetic */ boolean f$3;
                public final /* synthetic */ boolean f$4;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                }

                @Override // com.ss.android.vc.common.permission.AbstractC60798c
                public final void permissionGranted(boolean z) {
                    AbstractC62715f.this.m245387a(this.f$1, this.f$2, this.f$3, this.f$4, z);
                }
            });
            this.f157817U = true;
            return;
        }
        this.f157804H = mo216628c(C60788y.m236250b(this.f157819b));
        mo216680a(false);
        m245375N();
    }

    /* renamed from: E */
    private void m245366E() {
        Activity activity = this.f157819b;
        if (activity != null) {
            View findViewById = activity.findViewById(R.id.preview_container);
            this.f157822e = findViewById;
            this.f157823f = findViewById.findViewById(R.id.icon_close);
            this.f157824g = (EditText) this.f157822e.findViewById(R.id.meeting_title_ev);
            this.f157825h = this.f157822e.findViewById(R.id.meeting_title_underline);
            this.f157826i = this.f157822e.findViewById(R.id.container_audio);
            this.f157827j = this.f157822e.findViewById(R.id.container_camera);
            this.f157828k = this.f157822e.findViewById(R.id.container_speaker);
            this.f157829l = (TextView) this.f157822e.findViewById(R.id.txt_audio);
            this.f157830m = this.f157822e.findViewById(R.id.btn_audio_warning);
            this.f157831n = (ImageView) this.f157822e.findViewById(R.id.btn_audio);
            this.f157832o = (ImageView) this.f157822e.findViewById(R.id.btn_camera);
            this.f157833p = (ImageView) this.f157822e.findViewById(R.id.camera_permission_denied);
            this.f157834q = this.f157822e.findViewById(R.id.btn_camera_warning);
            this.f157835r = (TextView) this.f157822e.findViewById(R.id.txt_camera);
            this.f157836s = (ImageView) this.f157822e.findViewById(R.id.btn_speaker);
            this.f157837t = (TextView) this.f157822e.findViewById(R.id.txt_speaker);
            this.f157838u = (ConstraintLayout) this.f157822e.findViewById(R.id.btn_meeting);
            this.f157839v = (TextView) this.f157822e.findViewById(R.id.btn_meeting_text);
            this.f157840w = (LKUILottieAnimationView) this.f157822e.findViewById(R.id.view_loading);
            this.f157841x = (PreviewVideoView) this.f157822e.findViewById(R.id.video_container);
            this.f157842y = (LKUIRoundedImageView) this.f157822e.findViewById(R.id.img_avatar);
            this.f157843z = (IconFontView) this.f157822e.findViewById(R.id.lkp_switch_camera);
            this.f157797A = this.f157822e.findViewById(R.id.icon_labs_entry);
            this.f157798B = this.f157822e.findViewById(R.id.bottom_operation_container);
            this.f157799C = this.f157822e.findViewById(R.id.soft_keyboard_padding);
            mo216579s();
            m245368G();
            m245367F();
            PreviewVideoView previewVideoView = this.f157841x;
            if (previewVideoView != null) {
                previewVideoView.setCornerRadius(UIHelper.dp2px(6.0f));
            }
            m245371J();
            mo216680a(false);
            mo216685f(false);
            C60700b.m235851b("MeetingPreviewBaseView", "[init]", "camera = " + this.f157805I);
            m245373L();
            m245372K();
            mo216580x();
            m245369H();
        }
    }

    /* renamed from: a */
    public void setViewDelegate(VD vd) {
        this.f157821d = vd;
    }

    /* renamed from: a */
    public void mo216674a(int i) {
        m245393c(UIHelper.getString(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo216628c(boolean z) {
        if (!this.f157815S || !z) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m245381a(View view) {
        if (mo216693z()) {
            C61237h.m238223a().mo210554l();
        }
    }

    /* renamed from: b */
    private void m245389b(int i) {
        ViewGroup.LayoutParams layoutParams = this.f157799C.getLayoutParams();
        layoutParams.height = i;
        this.f157799C.setLayoutParams(layoutParams);
        this.f157799C.setVisibility(0);
        this.f157798B.setBackgroundColor(C60773o.m236126d(R.color.ud_N00));
    }

    /* renamed from: c */
    private void m245393c(String str) {
        C60738ac.m236030a(str, (C60776r.m236144b() - this.f157798B.getTop()) + UIHelper.dp2px(20.0f) + C60776r.m236148f());
    }

    /* renamed from: g */
    public void mo216686g(boolean z) {
        int i;
        LKUIRoundedImageView lKUIRoundedImageView = this.f157842y;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        lKUIRoundedImageView.setVisibility(i);
        if (!z && this.f157820c.mo216599a() != 6) {
            this.f157821d.mo216545a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo216578b(boolean z) {
        this.f157803G = z;
    }

    /* renamed from: d */
    public void mo216683d(final boolean z) {
        if (this.f157841x == null) {
            C60700b.m235851b("MeetingPreviewBaseView", "[startPreview]", "videoView is null");
        } else if (C61237h.m238223a().mo210552j()) {
            C60700b.m235851b("MeetingPreviewBaseView", "[startPreview4]", "Camera Previewed");
        } else {
            this.f157841x.mo208475a(new PreviewVideoView.AbstractC60811a() {
                /* class com.ss.android.vc.meeting.module.preview.AbstractC62715f.C627172 */

                @Override // com.ss.android.vc.common.widget.PreviewVideoView.AbstractC60811a
                /* renamed from: a */
                public void mo208482a() {
                    C60700b.m235851b("MeetingPreviewBaseView", "[startPreview2]", "success isOn: " + AbstractC62715f.this.f157805I);
                    AbstractC62715f.this.f157805I = true;
                    AbstractC62715f.this.mo216685f(z);
                    AbstractC62715f fVar = AbstractC62715f.this;
                    fVar.mo216681a(fVar.mo216532e(), true ^ z);
                    AbstractC62715f fVar2 = AbstractC62715f.this;
                    fVar2.mo216686g(fVar2.mo216532e());
                }

                @Override // com.ss.android.vc.common.widget.PreviewVideoView.AbstractC60811a
                /* renamed from: b */
                public void mo208483b() {
                    C60700b.m235861e("MeetingPreviewBaseView", "[startPreview3]", "fail");
                    AbstractC62715f.this.f157805I = false;
                    AbstractC62715f.this.mo216685f(false);
                    AbstractC62715f fVar = AbstractC62715f.this;
                    fVar.mo216681a(fVar.mo216532e(), !z);
                    AbstractC62715f fVar2 = AbstractC62715f.this;
                    fVar2.mo216686g(fVar2.mo216532e());
                }
            });
        }
    }

    /* renamed from: e */
    public void mo216684e(boolean z) {
        C60700b.m235851b("MeetingPreviewBaseView", "[stopPreview]", "triggerByClick is " + z);
        PreviewVideoView previewVideoView = this.f157841x;
        if (previewVideoView != null) {
            previewVideoView.mo208476b();
        }
        if (z) {
            this.f157805I = false;
        }
        mo216685f(z);
        mo216681a(mo216532e(), !z);
        mo216686g(mo216532e());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo216682b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        TextPaint paint = this.f157824g.getPaint();
        float a = (float) (C60776r.m236139a() - C60773o.m236115a(104.0d));
        if (paint.measureText(str) < a) {
            return str;
        }
        int length = str.length();
        float measureText = paint.measureText("...") + ((float) C60773o.m236115a(4.0d));
        while (length > 0 && paint.measureText(str, 0, length) + measureText > a) {
            length--;
        }
        return str.substring(0, length) + "...";
    }

    /* renamed from: f */
    public void mo216685f(boolean z) {
        int i;
        int i2;
        Drawable drawable;
        int i3;
        boolean a = C60788y.m236247a(this.f157819b);
        this.f157832o.setEnabled(a);
        View view = this.f157834q;
        int i4 = 8;
        if (a) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        ImageView imageView = this.f157833p;
        if (!a) {
            i4 = 0;
        }
        imageView.setVisibility(i4);
        TextView textView = this.f157835r;
        if (a) {
            i2 = R.color.text_caption;
        } else {
            i2 = R.color.text_disable;
        }
        textView.setTextColor(C60773o.m236126d(i2));
        ((Guideline) this.f157822e.findViewById(R.id.gl_bottom)).setGuidelineEnd(this.f157798B.getHeight());
        C60700b.m235851b("MeetingPreviewBaseView", "[updateCameraBtnState]", "cameraBtn = " + mo216532e());
        ImageView imageView2 = this.f157832o;
        if (this.f157805I) {
            drawable = C60773o.m236128f(R.drawable.ud_icon_video_filled);
        } else {
            drawable = C60773o.m236128f(R.drawable.ud_icon_video_off_filled);
        }
        imageView2.setImageDrawable(drawable);
        boolean z2 = this.f157805I;
        int i5 = R.color.icon_disable;
        if (z2) {
            Drawable drawable2 = this.f157832o.getDrawable();
            if (a) {
                i5 = R.color.ud_N700;
            }
            drawable2.setTint(C60773o.m236126d(i5));
        } else {
            Drawable drawable3 = this.f157832o.getDrawable();
            if (a) {
                i5 = R.color.function_danger_500;
            }
            drawable3.setTint(C60773o.m236126d(i5));
        }
        if (z) {
            if (mo216532e()) {
                i3 = R.string.View_VM_CameraOn;
            } else {
                i3 = R.string.View_VM_CameraOff;
            }
            mo216674a(i3);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m245380a(DialogInterface dialogInterface, int i) {
        VideoChatModuleDependency.getAppUpgradeDependency().launchAppUpgrade(this.f157819b);
        this.f157818a.finish();
    }

    public AbstractC62715f(BaseFragment baseFragment, AbstractC62746h hVar) {
        this.f157818a = baseFragment;
        this.f157820c = hVar;
        FragmentActivity activity = baseFragment.getActivity();
        this.f157819b = activity;
        this.f157807K = new C62063d(activity);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m245382a(Boolean bool, boolean z) {
        boolean z2;
        C60700b.m235851b("MeetingPreviewBaseView", "[updateRecordPermission]", "granted = " + z);
        this.f157804H = z;
        if (!bool.booleanValue() || !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        mo216680a(z2);
        AudioRouteHelper bVar = this.f157809M;
        if (bVar != null) {
            bVar.mo212740b(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m245391b(String str, String str2) {
        MeetingCheckUtils.meetingCheck(ar.m236694a(), "0", JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType.GROUPID, false, str2, str, 1, false).subscribe(new MeetingPreviewBaseView$10(this));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m245384a(boolean z, int i) {
        if (z) {
            m245389b(i);
            mo216578b(true);
            return;
        }
        mo216691w();
        mo216578b(false);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ boolean m245388a(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0 && this.f157803G) {
            KeyboardUtils.hideKeyboard(this.f157819b);
        }
        this.f157824g.clearFocus();
        return false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m245392b(boolean z, boolean z2, boolean z3) {
        boolean z4;
        if (!z) {
            if (!z2 || z3) {
                z4 = false;
            } else {
                z4 = true;
            }
            this.f157805I = z4;
        }
        m245375N();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00bd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private /* synthetic */ void m245385a(boolean r4, com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AudioType r5, java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 193
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.preview.AbstractC62715f.m245385a(boolean, com.ss.android.vc.meeting.module.audio.MeetingAudioManager$AudioType, java.lang.String):void");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m245386a(boolean z, boolean z2, boolean z3) {
        this.f157812P.post(new Runnable(z, z3, z2) {
            /* class com.ss.android.vc.meeting.module.preview.$$Lambda$f$FkMwqpTHUail64q5hBJKBgVLyjI */
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ boolean f$2;
            public final /* synthetic */ boolean f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                AbstractC62715f.this.m245392b(this.f$1, this.f$2, this.f$3);
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m245387a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        if (!z) {
            if (!z5 || z2) {
                z6 = false;
            } else {
                z6 = true;
            }
            this.f157804H = z6;
        } else {
            this.f157804H = mo216628c(z5);
        }
        mo216680a(false);
        C60788y.m236245a(this.f157819b, (AbstractC60798c) new AbstractC60798c(z3, z4) {
            /* class com.ss.android.vc.meeting.module.preview.$$Lambda$f$9K84n8BHm6ikRvKTq3QOxpQDM0 */
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ boolean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.vc.common.permission.AbstractC60798c
            public final void permissionGranted(boolean z) {
                AbstractC62715f.this.m245386a((AbstractC62715f) this.f$1, this.f$2, z);
            }
        });
    }
}
