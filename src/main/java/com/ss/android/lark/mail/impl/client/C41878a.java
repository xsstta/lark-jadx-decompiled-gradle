package com.ss.android.lark.mail.impl.client;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.lark.pb.email.client.v1.MailUpdateAccountResponse;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.client.C41878a;
import com.ss.android.lark.mail.impl.entity.C42087a;
import com.ss.android.lark.mail.impl.entity.C42093e;
import com.ss.android.lark.mail.impl.entity.UserType;
import com.ss.android.lark.mail.impl.home.C42496e;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41870b;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.utils.C43771m;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.mail.impl.client.a */
public class C41878a {

    /* renamed from: a */
    public final Context f106220a;

    /* renamed from: b */
    public final C42496e f106221b;

    /* renamed from: c */
    private final View f106222c;

    /* renamed from: d */
    private final AbstractC41890a f106223d;

    /* renamed from: e */
    private FrameLayout f106224e;

    /* renamed from: f */
    private View f106225f;

    /* renamed from: g */
    private View f106226g;

    /* renamed from: h */
    private DialogC25637f f106227h;

    /* renamed from: i */
    private AbstractC1178x<Integer> f106228i;

    /* renamed from: com.ss.android.lark.mail.impl.client.a$a */
    public interface AbstractC41890a {
        void onDrawerEnable(boolean z);
    }

    /* renamed from: a */
    public void mo150458a() {
        m166351q();
        mo150461b();
        m166348n();
    }

    /* renamed from: a */
    public void mo150459a(View view, int[] iArr, int[] iArr2) {
        if ((iArr2[1] - iArr[1]) - view.getHeight() < UIHelper.getDimens(R.dimen.mail_client_slogon_margin)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
    }

    /* renamed from: a */
    public void mo150460a(String str) {
        View view = this.f106226g;
        if (view != null && view.getVisibility() == 0 && TextUtils.equals(str, (String) this.f106226g.getTag())) {
            this.f106226g.setVisibility(8);
        }
    }

    /* renamed from: e */
    public void mo150464e() {
        m166349o();
        m166342h();
    }

    /* renamed from: k */
    private void m166345k() {
        DialogC25637f fVar = this.f106227h;
        if (fVar != null) {
            fVar.dismiss();
            this.f106227h = null;
        }
    }

    /* renamed from: m */
    private void m166347m() {
        if (!C43350d.m172098a().mo155009A()) {
            mo150460a("deleted_dialog");
        }
    }

    /* renamed from: d */
    public void m166354t() {
        MailToast.m173697a((int) R.string.Mail_Client_Delinkerror);
        C42209j.m168612a("mailclient_oauth_access_denied_deleting", "toast");
    }

    /* renamed from: h */
    private void m166342h() {
        FrameLayout frameLayout = this.f106224e;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            this.f106224e.setVisibility(8);
        }
        m166347m();
        m166353s();
    }

    /* renamed from: o */
    private void m166349o() {
        m166340c(true);
        View view = this.f106225f;
        if (view != null && view.getVisibility() == 0) {
            this.f106225f.setVisibility(8);
        }
    }

    /* renamed from: q */
    private void m166351q() {
        View view = this.f106226g;
        if (view != null && view.getVisibility() == 0) {
            this.f106226g.setVisibility(8);
        }
    }

    /* renamed from: s */
    private void m166353s() {
        if (this.f106228i != null) {
            if (this.f106221b.mo152856G() != null) {
                this.f106221b.mo152856G().mo152772i().mo5928b(this.f106228i);
            }
            this.f106228i = null;
        }
    }

    /* renamed from: g */
    private void m166341g() {
        C41900f.m166381a();
        FrameLayout frameLayout = this.f106224e;
        if (frameLayout == null || frameLayout.getVisibility() != 0) {
            ViewStub viewStub = (ViewStub) this.f106222c.findViewById(R.id.mail_oauth_status);
            if (viewStub != null) {
                this.f106224e = (FrameLayout) viewStub.inflate();
            }
            FrameLayout frameLayout2 = this.f106224e;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(0);
            }
        }
        mo150465f();
        m166352r();
    }

    /* renamed from: l */
    private void m166346l() {
        if (C43350d.m172098a().mo155009A()) {
            m166335a("deleted_dialog", C43819s.m173684a((int) R.string.Mail_Client_AccountRevokedTitle), C43819s.m173690b((int) R.string.Mail_Client_AdminChangeAccountRelinkGmailDesc), C43819s.m173684a((int) R.string.Mail_Client_GotItButton), new OnSingleClickListener() {
                /* class com.ss.android.lark.mail.impl.client.C41878a.AnonymousClass12 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    C43350d.m172098a().mo155010B();
                }
            }, false);
        }
    }

    /* renamed from: p */
    private void m166350p() {
        View view = this.f106226g;
        if (view == null || view.getVisibility() != 0) {
            ViewStub viewStub = (ViewStub) this.f106222c.findViewById(R.id.mail_internal_dialog);
            if (viewStub != null) {
                viewStub.setLayoutResource(R.layout.mail_tab_internal_dialog);
                this.f106226g = viewStub.inflate();
            }
            View view2 = this.f106226g;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
    }

    /* renamed from: r */
    private void m166352r() {
        if (this.f106228i == null) {
            this.f106228i = new AbstractC1178x<Integer>() {
                /* class com.ss.android.lark.mail.impl.client.C41878a.C418824 */

                /* renamed from: a */
                public void onChanged(Integer num) {
                    final View h = C41878a.this.f106221b.mo152856G().mo152769f().mo152809h();
                    if (h == null) {
                        C41878a.this.mo150465f();
                    } else {
                        h.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                            /* class com.ss.android.lark.mail.impl.client.C41878a.C418824.ViewTreeObserver$OnPreDrawListenerC418831 */

                            public boolean onPreDraw() {
                                h.getViewTreeObserver().removeOnPreDrawListener(this);
                                C41878a.this.mo150465f();
                                return true;
                            }
                        });
                    }
                }
            };
            if (this.f106221b.mo152856G() != null) {
                this.f106221b.mo152856G().mo152772i().mo5923a(this.f106221b, this.f106228i);
            }
        }
    }

    /* renamed from: f */
    public void mo150465f() {
        FrameLayout.LayoutParams layoutParams;
        if (this.f106221b.mo152856G() != null) {
            int h = this.f106221b.mo152856G().mo152771h();
            FrameLayout frameLayout = this.f106224e;
            if (frameLayout != null && (layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams()) != null) {
                layoutParams.topMargin = h;
                this.f106224e.requestLayout();
            }
        }
    }

    /* renamed from: i */
    private void m166343i() {
        m166341g();
        FrameLayout frameLayout = this.f106224e;
        if (frameLayout != null) {
            View findViewById = frameLayout.findViewById(R.id.home_oauth_removed);
            if (findViewById == null) {
                this.f106224e.removeAllViews();
                findViewById = LayoutInflater.from(this.f106220a).inflate(R.layout.mail_client_removed_layout, (ViewGroup) null);
                this.f106224e.addView(findViewById);
            }
            if (findViewById != null) {
                Log.m165389i("ClientView", "showRemovedLayout");
                findViewById.setVisibility(0);
                ((TextView) findViewById.findViewById(R.id.home_removed_tip)).setText(C43819s.m173690b((int) R.string.Mail_Client_AccessRevokeEmailTabDisappearNotice));
            }
            m166345k();
            m166351q();
        }
    }

    /* renamed from: b */
    public void mo150461b() {
        C42087a m = C43277a.m171921a().mo154949m();
        if (m != null) {
            int i = m.f107030g;
            boolean z = true;
            if (i == 1) {
                Log.m165389i("ClientView", "showOAuthLayout");
                m166344j();
                m166338b(false);
            } else if (i == 2) {
                if (m.mo151815f() == UserType.GMAIL_API_CLIENT || m.mo151815f() == UserType.EXCHANGE_API_CLIENT) {
                    if (m.mo151815f() != UserType.EXCHANGE_API_CLIENT) {
                        z = false;
                    }
                    m166334a(m, z);
                } else {
                    if (m.mo151815f() != UserType.EXCHANGE_NEW_USER) {
                        z = false;
                    }
                    m166336a(z);
                }
                m166338b(false);
            } else if (i != 3) {
                m166342h();
                m166338b(true);
            } else {
                m166343i();
                m166338b(false);
            }
        }
    }

    /* renamed from: c */
    public void mo150462c() {
        this.f106227h = C43771m.m173506a(this.f106220a, C43819s.m173684a((int) R.string.Mail_Client_Delinksettingquestion), C43819s.m173690b((int) R.string.Mail_Client_Delinksettingtext), C43819s.m173684a((int) R.string.Mail_Client_Delinksettingcancel), (int) R.color.text_title, C43819s.m173684a((int) R.string.Mail_Client_Delink), (int) R.color.function_danger_500, (DialogInterface.OnClickListener) null, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.client.$$Lambda$a$BvwEVaKEWgyI2sf6DITdMqML3ck */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C41878a.lambda$BvwEVaKEWgyI2sf6DITdMqML3ck(C41878a.this, dialogInterface, i);
            }
        }).mo89239c();
    }

    /* renamed from: j */
    private void m166344j() {
        String b;
        m166341g();
        FrameLayout frameLayout = this.f106224e;
        if (frameLayout != null) {
            View findViewById = frameLayout.findViewById(R.id.home_oauth_expired);
            if (findViewById == null) {
                this.f106224e.removeAllViews();
                findViewById = LayoutInflater.from(this.f106220a).inflate(R.layout.mail_client_expired_layout, (ViewGroup) null);
                this.f106224e.addView(findViewById);
            }
            if (findViewById != null) {
                Log.m165389i("ClientView", "showExpiredLayout");
                findViewById.setVisibility(0);
                findViewById.findViewById(R.id.home_oauth_btn).setOnClickListener(new OnSingleClickListener() {
                    /* class com.ss.android.lark.mail.impl.client.C41878a.C418791 */

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public /* synthetic */ void m166363a() {
                        C41878a.this.m166354t();
                    }

                    @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                    public void onSingleClick(View view) {
                        C42699a.m170248a(C41878a.this.f106220a, false, (AbstractC41895c) new AbstractC41895c() {
                            /* class com.ss.android.lark.mail.impl.client.$$Lambda$a$1$kuwxAjeoXSFuEVUsO_EpWAbHxFs */

                            @Override // com.ss.android.lark.mail.impl.client.AbstractC41895c
                            public final void onAccessDenied() {
                                C41878a.C418791.lambda$kuwxAjeoXSFuEVUsO_EpWAbHxFs(C41878a.C418791.this);
                            }
                        });
                    }
                });
                View findViewById2 = findViewById.findViewById(R.id.home_oauth_unlink_btn);
                if (findViewById2 != null) {
                    findViewById2.setOnClickListener(new OnSingleClickListener() {
                        /* class com.ss.android.lark.mail.impl.client.C41878a.C418845 */

                        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                        public void onSingleClick(View view) {
                            C41878a.this.mo150462c();
                        }
                    });
                }
                TextView textView = (TextView) findViewById.findViewById(R.id.home_oauth_tip);
                String str = "";
                if (!(C43350d.m172098a().mo155041f() == null || C43350d.m172098a().mo155041f().mo151894i() == null || (b = C43350d.m172098a().mo155041f().mo151894i().mo151296b()) == null)) {
                    str = b;
                }
                textView.setText(C43819s.m173686a(R.string.Mail_Client_OAuthExpiredContent, "Account", str));
            }
            m166347m();
        }
    }

    /* renamed from: n */
    private void m166348n() {
        boolean t = C43277a.m171921a().mo154956t();
        boolean u = C43277a.m171921a().mo154957u();
        if (!C43350d.m172098a().mo155012D() || !C43277a.m171921a().mo154955s() || (!t && !u)) {
            m166349o();
            Log.m165389i("ClientView", "showMigrationTip false, isLarkServer：" + C43350d.m172098a().mo155012D() + "， isDualDeliveryFG：" + C43277a.m171921a().mo154955s() + "，canIgnoreTip：" + t + "，isOnboardingForce：" + u);
            return;
        }
        Log.m165389i("ClientView", "showMigrationTip true");
        m166340c(false);
        View view = this.f106225f;
        if (view != null && view.getVisibility() == 0) {
            return;
        }
        if (u || C43277a.m171921a().mo154958v()) {
            ViewStub viewStub = (ViewStub) this.f106222c.findViewById(R.id.mail_migration_dialog);
            if (viewStub != null) {
                viewStub.setLayoutResource(R.layout.mail_migration_tip_dialog);
                this.f106225f = viewStub.inflate();
            }
            View view2 = this.f106225f;
            if (view2 != null && view2 != null) {
                view2.setOnClickListener(new View.OnClickListener(u) {
                    /* class com.ss.android.lark.mail.impl.client.$$Lambda$a$EqkvYCpRPMgL8pbnoUZqXVvzdtM */
                    public final /* synthetic */ boolean f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void onClick(View view) {
                        C41878a.lambda$EqkvYCpRPMgL8pbnoUZqXVvzdtM(C41878a.this, this.f$1, view);
                    }
                });
                TextView textView = (TextView) view2.findViewById(R.id.mail_on_boarding_title);
                if (textView != null) {
                    if (u) {
                        textView.setText(C43819s.m173690b((int) R.string.Mail_Onboard_LinkGmailAccount));
                    } else {
                        textView.setText(C43819s.m173690b((int) R.string.Mail_Onboard_MailClientOnboardingTitle));
                    }
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (u) {
                    spannableStringBuilder.append((CharSequence) C43819s.m173690b((int) R.string.Mail_Onboard_MailClientOnboardingTitleDescPhase2));
                } else {
                    spannableStringBuilder.append((CharSequence) C43819s.m173690b((int) R.string.Mail_Onboard_MailClientOnboardingTitleDesc1A_Mobile));
                }
                if (u) {
                    view2.findViewById(R.id.mail_on_boarding_ignore).setVisibility(8);
                } else {
                    view2.findViewById(R.id.mail_on_boarding_ignore).setVisibility(0);
                }
                view2.findViewById(R.id.mail_on_boarding_ignore).setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.mail.impl.client.$$Lambda$a$aaQJZgEpz1SBF1ibJhs032FNy6E */

                    public final void onClick(View view) {
                        C41878a.lambda$aaQJZgEpz1SBF1ibJhs032FNy6E(C41878a.this, view);
                    }
                });
                view2.findViewById(R.id.mail_on_boarding_now).setOnClickListener(new View.OnClickListener(u) {
                    /* class com.ss.android.lark.mail.impl.client.$$Lambda$a$yUyLNKHdGC1aZkvB9FqsDfoGI3E */
                    public final /* synthetic */ boolean f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void onClick(View view) {
                        C41878a.lambda$yUyLNKHdGC1aZkvB9FqsDfoGI3E(C41878a.this, this.f$1, view);
                    }
                });
                ((TextView) view2.findViewById(R.id.mail_on_boarding_desc2)).setText(C43819s.m173690b((int) R.string.Mail_Onboard_MailClientOnboardingTitleDesc2));
                ((TextView) view2.findViewById(R.id.mail_on_boarding_desc)).setText(spannableStringBuilder);
            }
        }
    }

    /* renamed from: b */
    private void m166338b(boolean z) {
        AbstractC41890a aVar = this.f106223d;
        if (aVar != null) {
            aVar.onDrawerEnable(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m166331a(View view) {
        C43277a.m171921a().mo154959w();
        m166349o();
    }

    /* renamed from: c */
    private void m166340c(boolean z) {
        C42496e eVar = this.f106221b;
        if (eVar != null && eVar.mo152856G() != null) {
            if (z) {
                this.f106221b.mo152856G().mo152761a(false);
            } else {
                this.f106221b.mo152856G().mo152763b(false);
            }
        }
    }

    /* renamed from: a */
    private void m166336a(final boolean z) {
        int i;
        int i2;
        m166341g();
        FrameLayout frameLayout = this.f106224e;
        if (frameLayout != null) {
            View findViewById = frameLayout.findViewById(R.id.home_oauth_new_user);
            if (findViewById == null) {
                this.f106224e.removeAllViews();
                findViewById = LayoutInflater.from(this.f106220a).inflate(R.layout.mail_client_new_user_layout, (ViewGroup) null);
                this.f106224e.addView(findViewById);
            }
            if (findViewById != null) {
                Log.m165389i("ClientView", "showNewUserLayout");
                findViewById.setVisibility(0);
                ((TextView) findViewById.findViewById(R.id.mail_new_user_title)).setText(C43819s.m173690b((int) R.string.Mail_Onboard_Welcome));
                ((TextView) findViewById.findViewById(R.id.mail_new_user_desc)).setText(C43819s.m173690b((int) R.string.Mail_Onboard_OAuth_Mobile_Desc));
                ((TextView) findViewById.findViewById(R.id.mail_new_user_desc2)).setText(C43819s.m173690b((int) R.string.Mail_Onboard_OAuth_Mobile_Desc2));
                TextView textView = (TextView) findViewById.findViewById(R.id.mail_new_user_now);
                if (z) {
                    i = R.string.Mail_Outlook_AssociateOutlookMailbox;
                } else {
                    i = R.string.Mail_Onboard_OAuthButton;
                }
                textView.setText(i);
                if (z) {
                    i2 = R.drawable.mail_btn_exchange_left;
                } else {
                    i2 = R.drawable.mail_btn_google_left;
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(i2, 0, 0, 0);
                textView.setOnClickListener(new OnSingleClickListener() {
                    /* class com.ss.android.lark.mail.impl.client.C41878a.C418867 */

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public /* synthetic */ void m166368a() {
                        C41878a.this.m166354t();
                    }

                    @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                    public void onSingleClick(View view) {
                        C42699a.m170248a(C41878a.this.f106220a, z, new AbstractC41895c() {
                            /* class com.ss.android.lark.mail.impl.client.$$Lambda$a$7$xAb0Kggg0AhpFF_fHo56lFlggNI */

                            @Override // com.ss.android.lark.mail.impl.client.AbstractC41895c
                            public final void onAccessDenied() {
                                C41878a.C418867.lambda$xAb0Kggg0AhpFF_fHo56lFlggNI(C41878a.C418867.this);
                            }
                        });
                    }
                });
                m166333a((TextView) findViewById.findViewById(R.id.mail_new_user_terms), findViewById.findViewById(R.id.mail_new_user_space), z);
                m166332a(findViewById.findViewById(R.id.mail_new_user_slogon), findViewById.findViewById(R.id.mail_new_user_now));
            }
            m166346l();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m166330a(DialogInterface dialogInterface, int i) {
        C43350d.m172098a().mo155034a(false, (IGetDataCallback<C42093e>) new AbstractC41870b<C42093e>() {
            /* class com.ss.android.lark.mail.impl.client.C41878a.C418856 */

            /* renamed from: a */
            public void mo150435a(C42093e eVar) {
                MailToast.m173697a((int) R.string.Mail_Setting_UnbindSuccess);
            }

            @Override // com.ss.android.lark.mail.impl.p2164c.AbstractC41870b
            /* renamed from: a */
            public void mo150434a(ErrorResult errorResult) {
                MailToast.m173697a((int) R.string.Mail_Setting_UnbindFailed);
                C42209j.m168612a("mailclient_unbind_fail", "toast");
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m166339b(boolean z, View view) {
        if (!z) {
            C43277a.m171921a().mo154959w();
            m166349o();
        }
    }

    /* renamed from: a */
    private void m166332a(final View view, final View view2) {
        if (view != null && view2 != null) {
            final int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            final int[] iArr2 = new int[2];
            view2.getLocationOnScreen(iArr2);
            if (iArr[0] <= 0 || iArr[1] <= 0) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                    /* class com.ss.android.lark.mail.impl.client.C41878a.ViewTreeObserver$OnGlobalLayoutListenerC418899 */

                    public void onGlobalLayout() {
                        view.getLocationOnScreen(iArr);
                        view2.getLocationOnScreen(iArr2);
                        C41878a.this.mo150459a(view, iArr, iArr2);
                    }
                });
            } else {
                mo150459a(view, iArr, iArr2);
            }
        }
    }

    /* renamed from: a */
    private void m166334a(C42087a aVar, boolean z) {
        int i;
        m166341g();
        FrameLayout frameLayout = this.f106224e;
        if (frameLayout != null) {
            View findViewById = frameLayout.findViewById(R.id.home_api_on_boarding);
            if (findViewById == null) {
                this.f106224e.removeAllViews();
                findViewById = LayoutInflater.from(this.f106220a).inflate(R.layout.mail_api_on_boarding_layout, (ViewGroup) null);
                this.f106224e.addView(findViewById);
            }
            if (findViewById != null) {
                Log.m165389i("ClientView", "showApiOnBoardingLayout");
                findViewById.setVisibility(0);
                HashMap hashMap = new HashMap();
                hashMap.put("emailAddress", aVar.mo151812d());
                TextView textView = (TextView) findViewById.findViewById(R.id.mail_api_on_boarding_title);
                if (aVar.mo151813e()) {
                    i = R.string.Mail_Migration_OpenTheMailToMoveMobile;
                } else {
                    i = R.string.Mail_Migration_EnablePublicMailboxMigrationMobile;
                }
                textView.setText(C43819s.m173690b(i));
                String a = C43819s.m173687a((int) R.string.Mail_Migration_OpenTheMailToMoveDescMobile, hashMap);
                ((TextView) findViewById.findViewById(R.id.mail_api_on_boarding_desc)).setText(m166329a(new SpannableStringBuilder(a), a, aVar.mo151812d(), null));
                ((TextView) findViewById.findViewById(R.id.mail_api_on_boarding_desc2)).setText(C43819s.m173690b((int) R.string.Mail_Migration_OpenTheMailToMoveDescPointOneMobile));
                TextView textView2 = (TextView) findViewById.findViewById(R.id.mail_api_on_boarding_now);
                textView2.setText(C43819s.m173690b((int) R.string.Mail_Migration_EnterFeishuMailboxMobile));
                textView2.setOnClickListener(new OnSingleClickListener() {
                    /* class com.ss.android.lark.mail.impl.client.C41878a.C418878 */

                    @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                    public void onSingleClick(View view) {
                        C43350d.m172098a().mo155027a(new AbstractC41870b<MailUpdateAccountResponse>() {
                            /* class com.ss.android.lark.mail.impl.client.C41878a.C418878.C418881 */

                            /* renamed from: a */
                            public void mo150435a(MailUpdateAccountResponse mailUpdateAccountResponse) {
                                Log.m165389i("ClientView", "showApiOnBoardingLayout success");
                            }

                            @Override // com.ss.android.lark.mail.impl.p2164c.AbstractC41870b
                            /* renamed from: a */
                            public void mo150434a(ErrorResult errorResult) {
                                Log.m165384e("ClientView", "showApiOnBoardingLayout error", errorResult);
                            }
                        });
                    }
                });
                m166333a((TextView) findViewById.findViewById(R.id.mail_api_on_boarding_terms), findViewById.findViewById(R.id.mail_api_on_boarding_space), z);
                m166332a(findViewById.findViewById(R.id.mail_api_on_boarding_slogon), findViewById.findViewById(R.id.mail_api_on_boarding_now));
            }
            m166346l();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m166337a(boolean z, View view) {
        C43277a.m171921a().mo154959w();
        C42699a.m170248a(this.f106220a, false, (AbstractC41895c) new AbstractC41895c() {
            /* class com.ss.android.lark.mail.impl.client.$$Lambda$a$TaiavqIkPuKAvKdem2eURMSUzqQ */

            @Override // com.ss.android.lark.mail.impl.client.AbstractC41895c
            public final void onAccessDenied() {
                C41878a.lambda$TaiavqIkPuKAvKdem2eURMSUzqQ(C41878a.this);
            }
        });
        if (!z) {
            m166349o();
        }
    }

    /* renamed from: a */
    private void m166333a(TextView textView, View view, boolean z) {
        int i;
        int i2;
        if (textView != null) {
            int i3 = 0;
            if (C41816b.m166115a().mo150149p()) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
            if (C41816b.m166115a().mo150149p()) {
                i3 = 8;
            }
            view.setVisibility(i3);
            HashMap hashMap = new HashMap();
            hashMap.put("APP_DISPLAY_NAME", UIHelper.getAppName());
            hashMap.put("PrivacyPolicy", C43819s.m173684a((int) R.string.Mail_Onboard_PrivacyPolicy));
            hashMap.put("UserTerm", C43819s.m173684a((int) R.string.Mail_Onboard_UserTerm));
            if (z) {
                i2 = R.string.Mail_Outlook_AssociateOutlookMailboxDesc;
            } else {
                i2 = R.string.Mail_Onboard_Term;
            }
            String mustacheFormat = UIHelper.mustacheFormat(i2, hashMap);
            if (textView != null && mustacheFormat != null) {
                SpannableStringBuilder a = m166329a(m166329a(new SpannableStringBuilder(mustacheFormat), mustacheFormat, C43819s.m173684a((int) R.string.Mail_Onboard_PrivacyPolicy), new ClickableSpan() {
                    /* class com.ss.android.lark.mail.impl.client.C41878a.AnonymousClass10 */

                    public void updateDrawState(TextPaint textPaint) {
                    }

                    public void onClick(View view) {
                        C41816b.m166115a().mo150133b(C41878a.this.f106220a);
                    }
                }), mustacheFormat, C43819s.m173684a((int) R.string.Mail_Onboard_UserTerm), new ClickableSpan() {
                    /* class com.ss.android.lark.mail.impl.client.C41878a.AnonymousClass11 */

                    public void updateDrawState(TextPaint textPaint) {
                    }

                    public void onClick(View view) {
                        C41816b.m166115a().mo150128a(C41878a.this.f106220a);
                    }
                });
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setText(a);
            }
        }
    }

    public C41878a(Context context, C42496e eVar, View view, AbstractC41890a aVar) {
        this.f106220a = context;
        this.f106221b = eVar;
        this.f106222c = view;
        this.f106223d = aVar;
        mo150458a();
    }

    /* renamed from: a */
    private SpannableStringBuilder m166329a(SpannableStringBuilder spannableStringBuilder, String str, String str2, ClickableSpan clickableSpan) {
        int indexOf = str.indexOf(str2);
        if (clickableSpan != null) {
            spannableStringBuilder.setSpan(clickableSpan, indexOf, str2.length() + indexOf, 33);
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f106220a.getResources().getColor(R.color.text_link_hover)), indexOf, str2.length() + indexOf, 33);
        return spannableStringBuilder;
    }

    /* renamed from: a */
    private void m166335a(final String str, String str2, String str3, String str4, final View.OnClickListener onClickListener, boolean z) {
        m166350p();
        View view = this.f106226g;
        if (view != null) {
            view.setTag(str);
            TextView textView = (TextView) this.f106226g.findViewById(R.id.mail_internal_title);
            if (TextUtils.isEmpty(str2)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(str2);
            }
            TextView textView2 = (TextView) this.f106226g.findViewById(R.id.mail_internal_content);
            if (TextUtils.isEmpty(str3)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(str3);
            }
            this.f106226g.findViewById(R.id.mail_internal_right_btn).setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.mail.impl.client.C41878a.C418802 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    View.OnClickListener onClickListener = onClickListener;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                    C41878a.this.mo150460a(str);
                }
            });
            TextView textView3 = (TextView) this.f106226g.findViewById(R.id.mail_internal_right_btn);
            if (!TextUtils.isEmpty(str4)) {
                textView3.setText(str4);
            }
            if (z) {
                this.f106226g.findViewById(R.id.mail_internal_dialog_cl).setOnClickListener(new OnSingleClickListener() {
                    /* class com.ss.android.lark.mail.impl.client.C41878a.C418813 */

                    @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                    public void onSingleClick(View view) {
                        C41878a.this.mo150460a(str);
                    }
                });
            }
        }
    }
}
