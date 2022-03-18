package com.ss.android.vc.meeting.module.livestream;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.livestream.C60945e;
import com.ss.android.vc.entity.livestream.MsgWithUrlInfo;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.statistics.event.C63750bm;
import com.ss.android.vc.statistics.p3180a.C63693e;

/* renamed from: com.ss.android.vc.meeting.module.livestream.d */
public class C62063d {

    /* renamed from: a */
    public C61303k f155899a;

    /* renamed from: b */
    public boolean f155900b;

    /* renamed from: c */
    private Context f155901c;

    /* renamed from: d */
    private boolean f155902d = C62075j.m242554d();

    /* renamed from: e */
    private String f155903e;

    /* renamed from: f */
    private String f155904f;

    /* renamed from: g */
    private String f155905g;

    /* renamed from: h */
    private DialogC25637f f155906h;

    /* renamed from: b */
    public boolean mo214802b() {
        DialogC25637f fVar = this.f155906h;
        if (fVar == null || !fVar.isShowing()) {
            C60700b.m235851b("LegalPrivacyInterceptLives", "[isPreChecking2]", "isPreChecking=" + this.f155900b);
            return this.f155900b;
        }
        C60700b.m235851b("LegalPrivacyInterceptLives", "[isPreChecking]", "false");
        return false;
    }

    /* renamed from: a */
    public void mo214798a() {
        DialogC25637f fVar;
        C60700b.m235851b("LegalPrivacyInterceptLives", "[dismissPrivacyDialog]", "dismiss");
        if (this.f155902d && (fVar = this.f155906h) != null && fVar.isShowing()) {
            this.f155906h.dismiss();
            C61303k kVar = this.f155899a;
            if (kVar != null) {
                kVar.am().mo214680e().mo214817a(false);
            }
        }
    }

    /* renamed from: a */
    public C62063d mo214797a(String str) {
        this.f155903e = str;
        return this;
    }

    /* renamed from: b */
    public C62063d mo214800b(String str) {
        this.f155904f = str;
        return this;
    }

    /* renamed from: c */
    public C62063d mo214803c(String str) {
        this.f155905g = str;
        return this;
    }

    /* renamed from: a */
    public C62063d mo214796a(C61303k kVar) {
        this.f155899a = kVar;
        if (kVar != null) {
            mo214797a(kVar.mo212055d());
        }
        return this;
    }

    public C62063d(Context context) {
        this.f155901c = context;
        C60700b.m235851b("LegalPrivacyInterceptLives", "[init]", "isOverseaEnvAndLegalFg=" + this.f155902d);
    }

    /* renamed from: b */
    public void mo214801b(final Runnable runnable, Runnable runnable2, final String str) {
        C60700b.m235851b("LegalPrivacyInterceptLives", "[showLegalPrivacyDialog]", "showLegalPrivacyDialog");
        C63693e.m249689e();
        DialogC25637f fVar = this.f155906h;
        if (fVar == null || !fVar.isShowing()) {
            C63750bm.m250191a(str);
            this.f155906h = (DialogC25637f) VCDialogUtils.m236212a(this.f155901c, false, (int) R.string.View_M_JoinLivestreamedMeetingTitle, 1, MsgWithUrlInfo.m237104a(R.string.View_M_JoinLivestreamedMeetingInfo), C60773o.m236119a((int) R.string.View_G_ReadPrivacyPolicy), (int) R.string.View_G_CancelButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.livestream.C62063d.DialogInterface$OnClickListenerC620652 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    if (C62063d.this.f155899a != null) {
                        C62063d.this.f155899a.am().mo214680e().mo214817a(false);
                    }
                    Runnable runnable = runnable;
                    if (runnable != null) {
                        runnable.run();
                        C63750bm.m250195c(str);
                    }
                }
            }, (int) R.string.View_M_JoinButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(runnable2, str) {
                /* class com.ss.android.vc.meeting.module.livestream.$$Lambda$d$DkUXwFM44niNr0ff0upUeyDDXs */
                public final /* synthetic */ Runnable f$1;
                public final /* synthetic */ String f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C62063d.this.m242478a((C62063d) this.f$1, (Runnable) this.f$2, (String) dialogInterface, (DialogInterface) i);
                }
            }, false, str);
            C61303k kVar = this.f155899a;
            if (kVar != null) {
                kVar.am().mo214680e().mo214817a(true);
            }
        }
    }

    /* renamed from: a */
    public void mo214799a(final Runnable runnable, final Runnable runnable2, final String str) {
        C60700b.m235851b("LegalPrivacyInterceptLives", "[intercept]", "start");
        if (!this.f155902d) {
            if (runnable != null) {
                runnable.run();
            }
        } else if (!VideoChatModuleDependency.getLoginDependency().isLogin()) {
            if (runnable != null) {
                runnable.run();
            }
        } else if (!TextUtils.isEmpty(this.f155903e) || !TextUtils.isEmpty(this.f155904f) || !TextUtils.isEmpty(this.f155905g)) {
            this.f155900b = true;
            C63693e.m249686c();
            m242479a(this.f155903e, this.f155904f, this.f155905g, new AbstractC63598b<C60945e>() {
                /* class com.ss.android.vc.meeting.module.livestream.C62063d.C620641 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235851b("LegalPrivacyInterceptLives", "[onError]", "error=" + eVar);
                    C62063d.this.mo214801b(runnable2, runnable, str);
                    C62063d.this.f155900b = false;
                }

                /* renamed from: a */
                public void onSuccess(C60945e eVar) {
                    C60700b.m235851b("LegalPrivacyInterceptLives", "[onSuccess]", "response=" + eVar);
                    C63693e.m249688d();
                    if (eVar == null) {
                        C62063d.this.mo214801b(runnable2, runnable, str);
                    } else if (eVar.f152541a) {
                        C62063d.this.mo214801b(runnable2, runnable, str);
                    } else {
                        Runnable runnable = runnable;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                    C62063d.this.f155900b = false;
                }
            });
        } else {
            if (runnable != null) {
                runnable.run();
            }
            C60700b.m235851b("LegalPrivacyInterceptLives", "[intercept2]", "all is params is empty");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m242478a(Runnable runnable, String str, DialogInterface dialogInterface, int i) {
        C61303k kVar = this.f155899a;
        if (kVar != null) {
            kVar.am().mo214680e().mo214817a(false);
        }
        if (runnable != null) {
            runnable.run();
            C63750bm.m250194b(str);
        }
    }

    /* renamed from: a */
    public static void m242479a(String str, String str2, String str3, AbstractC63598b<C60945e> bVar) {
        C60700b.m235851b("LegalPrivacyInterceptLives", "[liveOverseaLegalPreCheck]", "check");
        VcBizSender.m249184a(str, str2, str3).mo219889a(bVar);
    }
}
