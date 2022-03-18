package com.ss.android.vc.meeting.module.livestream;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.livestream.C60943c;
import com.ss.android.vc.entity.livestream.C60944d;
import com.ss.android.vc.entity.livestream.LiveInfo;
import com.ss.android.vc.entity.livestream.LiveVote;
import com.ss.android.vc.entity.livestream.MsgWithUrlInfo;
import com.ss.android.vc.entity.request.VideoChatLiveActionEntityRequest;
import com.ss.android.vc.entity.response.C60957ad;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.DisplayMode;
import com.ss.android.vc.meeting.module.livestream.p3133a.C62014c;
import com.ss.android.vc.meeting.module.livestream.p3133a.C62015d;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vc.statistics.event.C63735ad;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.vc.meeting.module.livestream.j */
public class C62075j {

    /* renamed from: a */
    public static C60943c f155945a;

    /* renamed from: b */
    private boolean f155946b;

    /* renamed from: c */
    private boolean f155947c;

    /* renamed from: d */
    private C61303k f155948d;

    /* renamed from: e */
    private AbstractC62011a f155949e;

    /* renamed from: f */
    private HashMap<String, VoteFlags> f155950f = new HashMap<>();

    /* renamed from: g */
    private boolean f155951g = false;

    /* renamed from: h */
    private C62015d f155952h;

    /* renamed from: i */
    private C62014c f155953i;

    /* renamed from: j */
    private boolean f155954j = false;

    /* renamed from: h */
    public static C60943c m242558h() {
        return f155945a;
    }

    /* renamed from: e */
    public static boolean m242555e() {
        return C63634c.m249496b("byteview.meeting.android.live_anonymous_setting");
    }

    /* renamed from: f */
    public static boolean m242556f() {
        return C63634c.m249496b("byteview.meeting.android.live_layout_setting");
    }

    /* renamed from: g */
    public static boolean m242557g() {
        return C63634c.m249496b("byteview.meeting.android.live_livechat_setting");
    }

    /* renamed from: c */
    public static boolean m242553c() {
        return VideoChatModuleDependency.getAppEnvDependency().mo196333c();
    }

    /* renamed from: d */
    public static boolean m242554d() {
        boolean c = VideoChatModuleDependency.getAppEnvDependency().mo196333c();
        boolean b = C63634c.m249496b("byteview.meeting.android.live_legal");
        if (!c || !b) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private boolean m242559i() {
        boolean z;
        if (this.f155949e.isMeetType()) {
            C60700b.m235851b("OverseaLegalModelLives", "[isLivingHost]", "isMeetType");
            z = this.f155949e.isHost();
        } else {
            C60700b.m235851b("OverseaLegalModelLives", "[isLivingHost2]", "isCallType");
            z = TextUtils.equals(this.f155949e.mo214677c().mo209944c().mo209924d(), VideoChatModuleDependency.m236629b());
        }
        C60700b.m235851b("OverseaLegalModelLives", "[isLivingHost3]", "isLivingHost=" + z);
        return z;
    }

    /* renamed from: a */
    public void mo214815a() {
        C60700b.m235851b("OverseaLegalModelLives", "[dismissDialog]", "dismissDialog");
        C62015d dVar = this.f155952h;
        if (dVar != null) {
            dVar.mo214698a();
        }
        C62014c cVar = this.f155953i;
        if (cVar != null) {
            cVar.mo214695a();
        }
    }

    /* renamed from: b */
    public boolean mo214819b() {
        C60700b.m235851b("OverseaLegalModelLives", "[isOverseaVoting]", "isOverseaEnvAndLegalFg=" + this.f155946b);
        if (!this.f155946b) {
            return false;
        }
        LiveInfo c = this.f155949e.mo214677c();
        if (c == null || c.mo209943b()) {
            C60700b.m235851b("OverseaLegalModelLives", "[isOverseaVoting2]", "liveInfo == null || liveInfo.isLiving");
            return false;
        }
        LiveVote c2 = c.mo209944c();
        if (c2 == null) {
            C60700b.m235851b("OverseaLegalModelLives", "[isOverseaVoting3]", "liveVote == null");
            return false;
        }
        C60700b.m235851b("OverseaLegalModelLives", "[isOverseaVoting4]", "isVoting=" + c2.mo209922b());
        return c2.mo209922b();
    }

    /* renamed from: a */
    public void mo214817a(boolean z) {
        this.f155954j = z;
    }

    /* renamed from: a */
    public static void m242548a(final AbstractC63598b<C60943c> bVar) {
        VcBizSender.m249279g().mo219889a(new AbstractC63598b<C60943c>() {
            /* class com.ss.android.vc.meeting.module.livestream.C62075j.C620794 */

            /* renamed from: a */
            public void onSuccess(C60943c cVar) {
                if (cVar != null) {
                    C60700b.m235851b("OverseaLegalModelLives", "[requestLivePolicyI18nTemplate]", "success");
                    C62075j.f155945a = cVar;
                } else {
                    C60700b.m235851b("OverseaLegalModelLives", "[requestLivePolicyI18nTemplate2]", "response is null");
                }
                AbstractC63598b bVar = bVar;
                if (bVar != null) {
                    bVar.onSuccess(cVar);
                }
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("OverseaLegalModelLives", "[requestLivePolicyI18nTemplate3]", "error");
                AbstractC63598b bVar = bVar;
                if (bVar != null) {
                    bVar.onError(eVar);
                }
            }
        });
    }

    /* renamed from: b */
    private static C60957ad m242551b(boolean z) {
        if (f155945a == null) {
            return null;
        }
        if (!m242553c()) {
            return f155945a.f152536e;
        }
        if (m242555e()) {
            if (z) {
                return f155945a.f152532a;
            }
            return f155945a.f152533b;
        } else if (z) {
            return f155945a.f152534c;
        } else {
            return f155945a.f152535d;
        }
    }

    /* renamed from: a */
    public static void m242550a(boolean z, final AbstractC63598b bVar) {
        final C60957ad b = m242551b(z);
        if (b == null) {
            C60700b.m235851b("OverseaLegalModelLives", "[fetchLivePolicyAndShowDialog]", "[start live fail], getLivePolicyI18Msg is null");
            C60738ac.m236023a((int) R.string.View_M_LivestreamingErrorTryAgainLaterNew);
            return;
        }
        VcBizSender.m249194a(b.f152637a, (Map<String, String>) null).mo219889a(new AbstractC63598b<String>() {
            /* class com.ss.android.vc.meeting.module.livestream.C62075j.C620805 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235851b("OverseaLegalModelLives", "[fetchLivePolicyAndShowDialog4]", "[start live fail], getLivePolicyI18nTemplate error");
                bVar.onError(eVar);
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                if (TextUtils.isEmpty(str)) {
                    C60700b.m235851b("OverseaLegalModelLives", "[fetchLivePolicyAndShowDialog2]", "[start live fail], getLivePolicyI18nTemplate is empty");
                    C60738ac.m236023a((int) R.string.View_M_LivestreamingErrorTryAgainLaterNew);
                    return;
                }
                C60700b.m235851b("OverseaLegalModelLives", "[fetchLivePolicyAndShowDialog3]", "[start live success]");
                bVar.onSuccess(C62075j.m242547a(str, b));
            }
        });
    }

    public C62075j(C61303k kVar, AbstractC62011a aVar) {
        this.f155948d = kVar;
        this.f155949e = aVar;
        this.f155946b = m242554d();
        this.f155947c = m242553c();
        C60700b.m235851b("OverseaLegalModelLives", "[OverseaLegalModel]", "init isOverseaEnvAndLegalFg=" + this.f155946b + " , isOverseaEnv=" + this.f155947c);
    }

    /* renamed from: a */
    public static MsgWithUrlInfo m242547a(String str, C60957ad adVar) {
        String str2;
        String str3;
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            C60700b.m235851b("OverseaLegalModelLives", "[parseText]", "template is empty");
            str = "";
        }
        Matcher matcher = Pattern.compile("\\[\\[.*?\\]\\]").matcher(str);
        String str4 = str;
        while (matcher.find()) {
            String group = matcher.group();
            String[] split = str.substring(matcher.start() + 2, matcher.end() - 2).split(":");
            String str5 = split[0];
            if (split.length >= 2) {
                str2 = "@@" + split[1] + "@@";
            } else {
                str2 = "";
            }
            str4 = str4.replace(group, str2);
            if (adVar.f152638b.get(str5) == null) {
                str3 = "";
            } else {
                str3 = adVar.f152638b.get(str5).f152639a;
            }
            arrayList.add(str3);
        }
        return MsgWithUrlInfo.m237105a(str4, arrayList);
    }

    /* renamed from: a */
    public void mo214816a(DisplayMode displayMode, Activity activity) {
        if (!this.f155951g) {
            mo214818a(false, activity);
            this.f155951g = true;
        }
    }

    /* renamed from: a */
    public void mo214818a(boolean z, Activity activity) {
        VoteFlags lVar;
        C60700b.m235851b("OverseaLegalModelLives", "[voteStatusChanged]", "isOverseaEnvAndLegalFg=" + this.f155946b + ", byAction=" + z);
        if (this.f155946b) {
            LiveInfo c = this.f155949e.mo214677c();
            if (c == null) {
                C60700b.m235851b("OverseaLegalModelLives", "[voteStatusChanged3]", "liveInfo == null then return");
                return;
            }
            C60700b.m235851b("OverseaLegalModelLives", "[voteStatusChanged2]", "liveInfo= " + c);
            if (c.mo209943b()) {
                C62014c cVar = this.f155953i;
                if (cVar != null && cVar.mo214697b()) {
                    this.f155953i.mo214695a();
                }
                C62015d dVar = this.f155952h;
                if (dVar != null && dVar.mo214700b()) {
                    this.f155952h.mo214698a();
                }
                C60700b.m235851b("OverseaLegalModelLives", "[voteStatusChanged4]", "isLiving then return");
                return;
            }
            LiveVote c2 = c.mo209944c();
            if (c2 == null) {
                C60700b.m235851b("OverseaLegalModelLives", "[voteStatusChanged5]", "liveVote == null then return");
            } else if (m242559i()) {
                C60700b.m235851b("OverseaLegalModelLives", "[voteStatusChanged6]", "isLivingHost");
                if (!c2.mo209922b() && c2.mo209923c() == LiveVote.Reason.REFUSED && z) {
                    C62014c cVar2 = this.f155953i;
                    if (cVar2 == null || !cVar2.mo214697b()) {
                        C60700b.m235851b("OverseaLegalModelLives", "[voteStatusChanged7]", "show mVoteHostRefusedDialog");
                        this.f155953i = C62014c.m242316a(activity, R.string.View_M_CantLivestreamNoConsent, R.string.View_G_ConfirmButton, new View.OnClickListener() {
                            /* class com.ss.android.vc.meeting.module.livestream.C62075j.View$OnClickListenerC620761 */

                            public void onClick(View view) {
                            }
                        });
                    }
                }
            } else {
                C60700b.m235851b("OverseaLegalModelLives", "[voteStatusChanged8]", "isLivingParticipant");
                if (c2.mo209922b()) {
                    String a = c2.mo209917a();
                    C60700b.m235851b("OverseaLegalModelLives", "[voteStatusChanged9]", "voteId=" + a);
                    boolean z2 = true;
                    if (TextUtils.isEmpty(a)) {
                        lVar = null;
                    } else if (this.f155950f.containsKey(a)) {
                        lVar = this.f155950f.get(a);
                        z2 = true ^ lVar.mo214829a();
                    } else {
                        lVar = new VoteFlags();
                        this.f155950f.put(a, lVar);
                    }
                    C60700b.m235851b("OverseaLegalModelLives", "[voteStatusChanged10]", "mVoteParticipantPrivacyDialog， shouldShow=" + z2 + " , voteId=" + a);
                    if (z2) {
                        C62015d dVar2 = this.f155952h;
                        if (dVar2 == null || !dVar2.mo214700b()) {
                            C60700b.m235851b("OverseaLegalModelLives", "[voteStatusChanged11]", "show mVoteParticipantPrivacyDialog");
                            this.f155952h = C62015d.m242322a(activity, new View.OnClickListener(a, lVar) {
                                /* class com.ss.android.vc.meeting.module.livestream.$$Lambda$j$u330Zh6fmMhUqzXYIP_TGJhAOhY */
                                public final /* synthetic */ String f$1;
                                public final /* synthetic */ VoteFlags f$2;

                                {
                                    this.f$1 = r2;
                                    this.f$2 = r3;
                                }

                                public final void onClick(View view) {
                                    C62075j.this.m242552b(this.f$1, this.f$2, view);
                                }
                            }, new View.OnClickListener(a, lVar) {
                                /* class com.ss.android.vc.meeting.module.livestream.$$Lambda$j$tinfJGrssbNW4KOSpLgLYztP_8 */
                                public final /* synthetic */ String f$1;
                                public final /* synthetic */ VoteFlags f$2;

                                {
                                    this.f$1 = r2;
                                    this.f$2 = r3;
                                }

                                public final void onClick(View view) {
                                    C62075j.this.m242549a(this.f$1, this.f$2, view);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    C62015d dVar3 = this.f155952h;
                    if (dVar3 != null && dVar3.mo214700b()) {
                        this.f155952h.mo214698a();
                        return;
                    }
                    return;
                }
                if (z && c2.mo209923c() == LiveVote.Reason.REFUSED) {
                    C60738ac.m236023a((int) R.string.View_M_CantLivestreamNoConsent);
                }
                C62015d dVar4 = this.f155952h;
                if (dVar4 != null && dVar4.mo214700b()) {
                    C60700b.m235851b("OverseaLegalModelLives", "[voteStatusChanged12]", "dismiss mVoteParticipantPrivacyDialog");
                    this.f155952h.mo214698a();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m242549a(String str, final VoteFlags lVar, View view) {
        VcBizSender.m249167a(this.f155948d.mo212055d(), VideoChatLiveActionEntityRequest.Action.VOTE_ACCEPT, (ByteviewUser) null, str).mo219893b(new AbstractC63598b<C60944d>() {
            /* class com.ss.android.vc.meeting.module.livestream.C62075j.C620783 */

            /* renamed from: a */
            public void onSuccess(C60944d dVar) {
                VoteFlags lVar = lVar;
                if (lVar != null) {
                    lVar.mo214828a(true);
                }
                C60700b.m235851b("OverseaLegalModelLives", "[VOTE_ACCEPT]", "onSuccess");
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("OverseaLegalModelLives", "[VOTE_ACCEPT2]", "error=" + eVar);
            }
        });
        C63735ad.m249991a(false, this.f155948d.mo212056e());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m242552b(String str, final VoteFlags lVar, View view) {
        VcBizSender.m249167a(this.f155948d.mo212055d(), VideoChatLiveActionEntityRequest.Action.VOTE_REFUSE, (ByteviewUser) null, str).mo219893b(new AbstractC63598b<C60944d>() {
            /* class com.ss.android.vc.meeting.module.livestream.C62075j.C620772 */

            /* renamed from: a */
            public void onSuccess(C60944d dVar) {
                VoteFlags lVar = lVar;
                if (lVar != null) {
                    lVar.mo214828a(true);
                }
                C60700b.m235851b("OverseaLegalModelLives", "[VOTE_REFUSE]", "onSuccess");
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("OverseaLegalModelLives", "[VOTE_REFUSE2]", "error=" + eVar);
            }
        });
        C63735ad.m249991a(true, this.f155948d.mo212056e());
    }
}
