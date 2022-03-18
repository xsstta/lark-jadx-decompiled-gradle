package com.ss.android.vc.meeting.module.follow;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.doc.follow.event.PresenterLocationChangedEvent;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.site.C23766q;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60733aa;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.UrlBrief;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.entity.follow.FollowState;
import com.ss.android.vc.entity.request.CreateDocEntityRequest;
import com.ss.android.vc.entity.request.ShareFollowEntityRequest;
import com.ss.android.vc.entity.response.C60954aa;
import com.ss.android.vc.entity.response.C60973g;
import com.ss.android.vc.entity.response.GetUrlBriefsEntity;
import com.ss.android.vc.entity.response.ar;
import com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61288e;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.DisplayMode;
import com.ss.android.vc.meeting.framework.statemachine.StatusNode;
import com.ss.android.vc.meeting.module.VCBreakoutRoomInfo;
import com.ss.android.vc.meeting.module.base.MeetingActivity;
import com.ss.android.vc.meeting.module.follow.AbstractC61751a;
import com.ss.android.vc.meeting.module.follow.base.AbstractC61784b;
import com.ss.android.vc.meeting.module.follow.base.AbstractC61785c;
import com.ss.android.vc.meeting.module.follow.base.BaseFollowRuntime;
import com.ss.android.vc.meeting.module.follow.base.C61779a;
import com.ss.android.vc.meeting.module.follow.common.C61806b;
import com.ss.android.vc.meeting.module.follow.common.FollowConfig;
import com.ss.android.vc.meeting.module.follow.common.FollowLinkStack;
import com.ss.android.vc.meeting.module.follow.p3121b.C61773a;
import com.ss.android.vc.meeting.module.follow.p3122c.AbstractC61801f;
import com.ss.android.vc.meeting.module.follow.universal.C61859b;
import com.ss.android.vc.meeting.module.sharesecurity.ShareSecurity;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vc.service.VideoChatUIConfigService;
import com.ss.android.vc.statistics.event.C63742at;
import com.ss.android.vc.statistics.event.C63769r;
import com.ss.android.vc.statistics.event.C63770s;
import com.ss.android.vc.statistics.event.C63771t;
import com.ss.android.vc.statistics.event.C63772u;
import com.ss.android.vc.statistics.event.C63774v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;

public class FollowControl extends AbstractC61751a implements AbstractC61785c {

    /* renamed from: a */
    public final List<AbstractC61751a.AbstractC61754c> f154920a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public final List<AbstractC61807d> f154921b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public AbstractC61784b f154922c;

    /* renamed from: d */
    public FollowInfo f154923d;

    /* renamed from: e */
    public FollowInfo f154924e;

    /* renamed from: f */
    public final FollowLinkStack f154925f = new FollowLinkStack();

    /* renamed from: g */
    public PageStatus f154926g = PageStatus.UNKNOWN;

    /* renamed from: h */
    public FollowDirection f154927h = FollowDirection.NONE;

    /* renamed from: i */
    public boolean f154928i = false;

    /* renamed from: j */
    public FollowInfo f154929j;

    /* renamed from: k */
    private Type f154930k = Type.UNKNOWN;

    /* renamed from: l */
    private final List<String> f154931l = new ArrayList();

    /* renamed from: m */
    private final Stack<Map<String, List<FollowState>>> f154932m = new Stack<>();

    /* renamed from: n */
    private Map<String, List<FollowState>> f154933n;

    /* renamed from: o */
    private final Map<String, String> f154934o = new HashMap();

    /* renamed from: p */
    private AbstractC61801f f154935p;

    /* renamed from: q */
    private C61779a f154936q;

    /* renamed from: r */
    private boolean f154937r = false;

    /* renamed from: s */
    private String f154938s;

    /* renamed from: t */
    private boolean f154939t = false;

    /* renamed from: u */
    private boolean f154940u = false;

    /* renamed from: v */
    private boolean f154941v;

    /* renamed from: w */
    private boolean f154942w = true;

    public enum FollowDirection {
        UNKNOWN,
        NONE,
        UP,
        RIGHT,
        LEFT,
        DOWN
    }

    public enum PageStatus {
        UNKNOWN,
        OPENED,
        AUTO_CLOSE,
        USER_CLOSE
    }

    /* renamed from: M */
    private void m241013M() {
        this.f154942w = true;
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61785c
    /* renamed from: G */
    public void mo213850G() {
        this.f154928i = true;
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: j */
    public boolean mo213884j() {
        return false;
    }

    /* renamed from: w */
    public void mo213897w() {
        this.f154935p = null;
    }

    public enum Type {
        UNKNOWN(0),
        START(1),
        END(2),
        CHANGED(3),
        DOING(4),
        TRANS(5);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static Type valueOf(int i) {
            return forNumber(i);
        }

        public static Type forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return START;
            }
            if (i == 2) {
                return END;
            }
            if (i == 3) {
                return CHANGED;
            }
            if (i == 4) {
                return DOING;
            }
            if (i != 5) {
                return null;
            }
            return TRANS;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61785c
    /* renamed from: F */
    public void mo213849F() {
        mo213879e();
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: a */
    public void mo213851a() {
        m241009I();
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: d */
    public AbstractC61784b mo213877d() {
        return this.f154922c;
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: g */
    public FollowInfo mo213881g() {
        return this.f154924e;
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: h */
    public FollowInfo mo213882h() {
        return this.f154923d;
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: p */
    public Map<String, String> mo213890p() {
        return this.f154934o;
    }

    /* renamed from: a */
    public void mo213859a(AbstractC61801f fVar) {
        this.f154935p = fVar;
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: a */
    public void mo213860a(AbstractC61807d dVar) {
        this.f154921b.add(dVar);
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: a */
    public void mo213863a(String str, String str2, FollowInfo.InitSource initSource, final boolean z, int i, final AbstractC61751a.AbstractC61755d dVar) {
        C60700b.m235851b("FollowLog_FollowControl", "[shareFollow]", "initSource = " + initSource + ", needMask = " + z + ", authority_mask = " + i);
        C63774v.m250383a(getMeeting().mo212056e());
        VcBizSender.m249189a(this.mMeeting.mo212055d(), str2, str, mo213884j(), initSource, z, i).mo219889a(new AbstractC63598b<ar>() {
            /* class com.ss.android.vc.meeting.module.follow.FollowControl.C617454 */

            /* renamed from: a */
            public void onSuccess(ar arVar) {
                String str;
                C60700b.m235851b("FollowLog_FollowControl", "[shareFollow2]", "success");
                FollowInfo followInfo = arVar.f152656a;
                if (followInfo != null && !TextUtils.isEmpty(followInfo.getDocTitle())) {
                    FollowControl.this.mo213854a(followInfo);
                }
                AbstractC61751a.AbstractC61755d dVar = dVar;
                if (dVar != null) {
                    dVar.mo213909a();
                }
                VideoChat e = FollowControl.this.mMeeting.mo212056e();
                if (z) {
                    str = "create_file";
                } else {
                    str = "open_file";
                }
                C63772u.m250376a(e, str, followInfo);
                C63774v.m250394d(FollowControl.this.getMeeting().mo212056e(), FollowControl.this.mo213882h());
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                int i;
                C60700b.m235864f("FollowLog_FollowControl", "[shareFollow3]", "error " + eVar.toString());
                boolean isCheckFail = ShareSecurity.isCheckFail(eVar);
                AbstractC61751a.AbstractC61755d dVar = dVar;
                if (dVar != null) {
                    dVar.mo213910a(isCheckFail);
                }
                if (!eVar.f160600c) {
                    C60738ac.m236037c((int) R.string.View_VM_CouldNotLoadTryAgain);
                }
                VideoChat e = FollowControl.this.getMeeting().mo212056e();
                if (eVar == null) {
                    i = 0;
                } else {
                    i = eVar.mo219899a();
                }
                C63774v.m250384a(e, i);
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: a */
    public void mo213864a(boolean z) {
        if (this.f154923d == null || this.mMeeting == null) {
            C60700b.m235851b("FollowLog_FollowControl", "[takeControl]", "fail. FollowInfo=" + this.f154923d + " Meeting=" + this.mMeeting);
            return;
        }
        this.f154942w = z;
        VcBizSender.m249188a(this.mMeeting.mo212055d(), mo213898x(), this.f154923d.getUrl(), this.f154923d.getShareId()).mo219889a(new AbstractC63598b<ar>() {
            /* class com.ss.android.vc.meeting.module.follow.FollowControl.C617465 */

            /* renamed from: a */
            public void onSuccess(ar arVar) {
                C60700b.m235851b("FollowLog_FollowControl", "[takeControl2]", "success");
                for (AbstractC61751a.AbstractC61754c cVar : FollowControl.this.f154920a) {
                    if (cVar != null) {
                        cVar.mo213931j();
                    }
                }
                BaseFollowRuntime.m241318b().put(FollowControl.this.f154923d.getShareId(), true);
                C63774v.m250382a(3);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("FollowLog_FollowControl", "[takeControl3]", "error " + eVar.toString());
                if (eVar.f160600c) {
                    return;
                }
                if (eVar.mo219899a() == 10008 || eVar.mo219899a() == 10009) {
                    C60738ac.m236037c((int) R.string.View_G_ConnectionError);
                } else {
                    C60738ac.m236039c(UIHelper.mustacheFormat((int) R.string.View_VM_OperationFailedCodeErrorCode, "error_code", Integer.toString(eVar.mo219899a())));
                }
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: a */
    public void mo213862a(String str, String str2) {
        C60700b.m235851b("FollowLog_FollowControl", "[showFollowExternalPermTips]", "shareId=" + str + " display=" + str2);
        Map<String, String> map = this.f154934o;
        if (map != null) {
            map.clear();
            this.f154934o.put(str, str2);
        }
        C57744a.m224104a().putString("SP_FOLLOW_EXTERNAL_SHOW", str2);
        C57744a.m224104a().putString("SP_FOLLOW_EXTERNAL_SHARE_ID", str);
        for (AbstractC61751a.AbstractC61754c cVar : this.f154920a) {
            if (cVar != null) {
                cVar.mo213922b(str);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61785c
    /* renamed from: a */
    public void mo213865a(boolean z, long j) {
        if (z) {
            for (AbstractC61751a.AbstractC61754c cVar : this.f154920a) {
                if (cVar != null) {
                    cVar.mo213933l();
                }
            }
            C63742at.m250058a(getMeeting().mo212056e(), (int) j, this.f154923d);
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: a */
    public void mo213861a(String str) {
        this.f154938s = str;
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: n */
    public void mo213888n() {
        AbstractC61784b bVar = this.f154922c;
        if (bVar != null) {
            bVar.mo214023d();
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: o */
    public boolean mo213889o() {
        return C61806b.m241471a(this.f154923d);
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: u */
    public LiveData<Integer> mo213895u() {
        return this.f154925f.getFollowLinkNumLiveData();
    }

    /* renamed from: z */
    public boolean mo213900z() {
        return C63634c.m249496b("byteview.callmeeting.android.back_to_last_location");
    }

    /* renamed from: K */
    private boolean m241011K() {
        AbstractC61784b bVar = this.f154922c;
        if (bVar == null || bVar.mo214025e() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: O */
    private boolean m241015O() {
        if (this.mMeeting.mo212067p() == DisplayMode.ACTIVITY) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public String mo213846C() {
        FollowInfo followInfo = this.f154923d;
        if (followInfo != null) {
            return followInfo.getShareId();
        }
        return null;
    }

    /* renamed from: E */
    public String mo213848E() {
        FollowInfo followInfo = this.f154923d;
        if (followInfo != null) {
            return followInfo.getDeviceId();
        }
        return null;
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: f */
    public boolean mo213880f() {
        if (this.f154930k != Type.UNKNOWN) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: i */
    public String mo213883i() {
        FollowInfo followInfo = this.f154923d;
        if (followInfo != null) {
            return followInfo.getUrl();
        }
        return null;
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: v */
    public boolean mo213896v() {
        AbstractC61784b bVar = this.f154922c;
        if (bVar == null || bVar.mo214028h() != BaseFollowRuntime.RuntimeStatus.BROWSING) {
            return false;
        }
        return true;
    }

    /* renamed from: H */
    private void m241008H() {
        C60735ab.m236015d().post(new Runnable() {
            /* class com.ss.android.vc.meeting.module.follow.$$Lambda$FollowControl$1Zy187idLOnp2xYEW57isQJzDfQ */

            public final void run() {
                FollowControl.this.m241017Q();
            }
        });
        this.f154936q = new C61779a(this.mMeeting);
        this.mMeeting.mo212046a(new AbstractC61288e() {
            /* class com.ss.android.vc.meeting.module.follow.$$Lambda$FollowControl$spgbfRnlwHiXI3ATTiKtiMYoKXA */

            @Override // com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61288e
            public final void meetingStateChanged(VideoChat videoChat, StatusNode statusNode) {
                FollowControl.this.m241018a((FollowControl) videoChat, (VideoChat) statusNode);
            }
        });
    }

    /* renamed from: P */
    private boolean m241016P() {
        if (!FollowConfig.m241446b() || !C63634c.m249496b("byteview.callmeeting.android.magic_share_presenter_position_guide")) {
            return false;
        }
        return true;
    }

    /* renamed from: A */
    public void mo213844A() {
        if (mo213900z() && m241011K()) {
            C60700b.m235851b("FollowLog_FollowControl", "[backToLastPosition]", "backToLastPosition is called");
            this.f154922c.mo214025e().mo21692b();
        }
    }

    /* renamed from: B */
    public void mo213845B() {
        if (mo213900z() && m241011K()) {
            C60700b.m235851b("FollowLog_FollowControl", "[clearLastPosition]", "clearLastPosition is called");
            this.f154922c.mo214025e().mo21693c();
        }
    }

    /* renamed from: D */
    public boolean mo213847D() {
        for (AbstractC61751a.AbstractC61754c cVar : this.f154920a) {
            if (cVar != null && cVar.isFollowPage()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: c */
    public void mo213873c() {
        if (mo213900z() && m241011K()) {
            C60700b.m235851b("FollowLog_FollowControl", "[keepCurrentPosition]", "keepCurrentPosition is called");
            this.f154922c.mo214025e().mo21691a();
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: e */
    public void mo213879e() {
        C60700b.m235851b("FollowLog_FollowControl", "[refresh]", "refresh");
        C63774v.m250382a(1);
        FollowInfo followInfo = this.f154924e;
        if (followInfo == null) {
            followInfo = this.f154923d;
        }
        mo213855a(followInfo, true);
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: q */
    public String mo213891q() {
        FollowInfo followInfo = this.f154924e;
        if (followInfo == null) {
            followInfo = this.f154923d;
        }
        if (TextUtils.isEmpty(followInfo.getDocTitle())) {
            return followInfo.getUrl();
        }
        return followInfo.getDocTitle();
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: r */
    public boolean mo213892r() {
        if (!FollowConfig.m241446b() || !VideoChatUIConfigService.m249509l(this.mMeeting)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: s */
    public boolean mo213893s() {
        if (!mo213892r() || !C63634c.m249496b("byteview.callmeeting.android.magic_share_new_ccm") || !VideoChatUIConfigService.m249508k(this.mMeeting)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: t */
    public void mo213894t() {
        if (!this.f154937r) {
            for (AbstractC61807d dVar : this.f154921b) {
                if (dVar != null) {
                    dVar.mo214054a();
                    this.f154937r = true;
                    return;
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61785c
    /* renamed from: y */
    public void mo213899y() {
        if (mo213900z()) {
            if (!this.f154939t || !m241011K()) {
                mo213844A();
            } else {
                mo213845B();
                this.f154939t = false;
            }
        }
        m241010J();
    }

    /* renamed from: I */
    private void m241009I() {
        C60700b.m235841a(getMeeting().mo212056e(), "FollowControl", "Rust", "grantFollowToken", "FollowLog_FollowControl", "grantFollowToken");
        VcBizSender.m249269e(VideoChatModuleDependency.getLoginDependency().getPassportHost(), VideoChatModuleDependency.getLoginDependency().getSession()).mo219893b(new AbstractC63598b<String>() {
            /* class com.ss.android.vc.meeting.module.follow.FollowControl.C617411 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235851b("FollowLog_FollowControl", "[grantFollowToken5]", "[getDocsToken] error: " + eVar.toString());
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                C60700b.m235851b("FollowLog_FollowControl", "[grantFollowToken1]", "[getDocsToken] success!!!");
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(FollowControl.this.mo213883i())) {
                    C60700b.m235851b("FollowLog_FollowControl", "[grantFollowToken2]", "[getDocsToken] loginToken = " + str + "getFollowUrl=" + FollowControl.this.mo213883i());
                    return;
                }
                VcBizSender.m249185a(FollowControl.this.mMeeting.mo212055d(), FollowControl.this.mo213883i(), str, System.currentTimeMillis()).mo219893b(new AbstractC63598b<C60954aa>() {
                    /* class com.ss.android.vc.meeting.module.follow.FollowControl.C617411.C617421 */

                    /* renamed from: a */
                    public void onSuccess(C60954aa aaVar) {
                        C60700b.m235851b("FollowLog_FollowControl", "[grantFollowToken3]", "[grantFollowToken] success");
                    }

                    @Override // com.ss.android.vc.net.request.AbstractC63598b
                    public void onError(C63602e eVar) {
                        C60700b.m235851b("FollowLog_FollowControl", "[grantFollowToken4]", "[grantFollowToken] error " + eVar.toString());
                    }
                });
            }
        });
    }

    /* renamed from: J */
    private void m241010J() {
        if (this.f154940u) {
            if (!mo213889o()) {
                UserInfoService.getUserInfoById(this.mMeeting.mo212055d(), this.f154923d.getUserId(), this.f154923d.getUserType(), $$Lambda$FollowControl$0IlECcNy8zCp7yKqFOK6rfhPNM.INSTANCE);
                AbstractC61784b bVar = this.f154922c;
                if (bVar != null) {
                    bVar.l_(true);
                }
            } else {
                C60738ac.m236039c(UIHelper.getString(R.string.View_G_ParticipantsCanViewYourSharedDoc_Toast));
            }
            this.f154940u = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ void m241017Q() {
        C60700b.m235851b("FollowLog_FollowControl", "[initFollowControl]", "getTotalMemory = " + C61806b.m241469a(getAppContext()));
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: b */
    public void mo213866b() {
        C60700b.m235851b("FollowLog_FollowControl", "[destroyFollowRuntime]", "destroyFollowRuntime");
        if (this.f154922c != null) {
            if (mo213889o()) {
                this.f154933n = this.f154922c.mo214029i();
            }
            this.f154922c.mo214001a();
            this.f154922c = null;
        }
        AbstractC61801f fVar = this.f154935p;
        if (fVar != null) {
            fVar.mo214076a();
            this.f154935p = null;
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: k */
    public void mo213885k() {
        if (!TextUtils.isEmpty(this.mMeeting.mo212055d())) {
            C60700b.m235841a(getMeeting().mo212056e(), "FollowControl", "Rust", "stopFollow", "FollowLog_FollowControl", "stopFollow");
            VcBizSender.m249232b(this.mMeeting.mo212055d(), mo213898x(), mo213883i()).mo219889a(new AbstractC63598b<ar>() {
                /* class com.ss.android.vc.meeting.module.follow.FollowControl.C617476 */

                /* renamed from: a */
                public void onSuccess(ar arVar) {
                    C60700b.m235851b("FollowLog_FollowControl", "[stopFollow]", "success");
                    FollowInfo followInfo = arVar.f152656a;
                    if (followInfo == null) {
                        followInfo = new FollowInfo();
                        followInfo.setShareId(FollowControl.this.mo213846C());
                    }
                    FollowControl.this.mo213854a(followInfo);
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("FollowLog_FollowControl", "[stopFollow2]", "error " + eVar.toString());
                    if (eVar.f160600c) {
                        return;
                    }
                    if (eVar.mo219899a() == 10008 || eVar.mo219899a() == 10009) {
                        C60738ac.m236037c((int) R.string.View_G_ConnectionError);
                    } else {
                        C60738ac.m236039c(UIHelper.mustacheFormat((int) R.string.View_VM_OperationFailedCodeErrorCode, "error_code", Integer.toString(eVar.mo219899a())));
                    }
                }
            });
        }
    }

    /* renamed from: x */
    public String mo213898x() {
        VCBreakoutRoomInfo k;
        if (!this.mMeeting.mo212105W().mo212836o().mo213182i() || (k = this.mMeeting.al().mo213184k()) == null) {
            return "";
        }
        return k.getBreakoutRoomId();
    }

    /* renamed from: L */
    private void m241012L() {
        if (this.f154930k == Type.CHANGED || this.f154930k == Type.END || this.f154930k == Type.TRANS) {
            C60700b.m235851b("FollowLog_FollowControl", "[sendQualityEvent]", "mType = " + this.f154930k);
            C63770s.m250361a();
            if (this.f154930k == Type.CHANGED || this.f154930k == Type.TRANS) {
                C63770s.m250364b();
            }
            C63769r.m250338a(getMeeting(), mo213882h());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m241014N() {
        C60700b.m235841a(getMeeting().mo212056e(), "FollowControl", "FollowControl", "resetFollowManagerStatus", "FollowLog_FollowControl", "resetFollowManagerStatus");
        BaseFollowRuntime.m241318b().clear();
        this.f154936q.mo214049c(this.f154923d);
        AbstractC61784b bVar = this.f154922c;
        if (bVar != null) {
            bVar.mo214001a();
            this.f154922c = null;
        }
        this.f154930k = Type.UNKNOWN;
        this.f154923d = null;
        this.f154924e = null;
        this.f154925f.clear();
        this.f154932m.clear();
        this.f154926g = PageStatus.UNKNOWN;
        this.f154933n = null;
        this.f154934o.clear();
    }

    /* renamed from: com.ss.android.vc.meeting.module.follow.FollowControl$8 */
    static /* synthetic */ class C617508 {

        /* renamed from: a */
        static final /* synthetic */ int[] f154959a;

        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|(3:37|38|40)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(40:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 229
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.follow.FollowControl.C617508.<clinit>():void");
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: l */
    public boolean mo213886l() {
        FollowInfo followInfo;
        int size = this.f154925f.size();
        C60700b.m235851b("FollowLog_FollowControl", "[popBack]", "stackSize = " + size);
        if (size <= 0) {
            return false;
        }
        mo213873c();
        if (mo213889o()) {
            C63774v.m250383a(getMeeting().mo212056e());
            final FollowInfo followInfo2 = (FollowInfo) this.f154925f.peek();
            VcBizSender.m249233b(this.mMeeting.mo212055d(), mo213898x(), followInfo2.getUrl(), followInfo2.getShareId()).mo219889a(new AbstractC63598b<ar>() {
                /* class com.ss.android.vc.meeting.module.follow.FollowControl.C617432 */

                /* renamed from: a */
                public void onSuccess(ar arVar) {
                    FollowInfo followInfo;
                    C60700b.m235851b("FollowLog_FollowControl", "[popBack2]", "[reactivateFollow] success");
                    if (!FollowControl.this.f154925f.isEmpty() && (followInfo = (FollowInfo) FollowControl.this.f154925f.peek()) != null && followInfo.getShareId() != null && followInfo.getShareId().equals(followInfo2.getShareId())) {
                        C60700b.m235851b("FollowLog_FollowControl", "[popBack3]", "[reactivateFollow] success followChanged");
                        FollowControl.this.mo213854a(arVar.f152656a);
                        FollowControl.this.f154925f.pop();
                        C63774v.m250382a(5);
                    }
                    C63774v.m250394d(FollowControl.this.getMeeting().mo212056e(), FollowControl.this.mo213882h());
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    int i;
                    FollowInfo followInfo;
                    C60700b.m235864f("FollowLog_FollowControl", "[popBack4]", "[reactivateFollow] error " + eVar.toString());
                    if (!eVar.f160600c && !FollowControl.this.f154925f.isEmpty() && (followInfo = (FollowInfo) FollowControl.this.f154925f.peek()) != null && followInfo.getShareId() != null && followInfo.getShareId().equals(followInfo2.getShareId())) {
                        C60738ac.m236037c((int) R.string.View_VM_CouldNotLoadTryAgain);
                    }
                    VideoChat e = FollowControl.this.getMeeting().mo212056e();
                    if (eVar == null) {
                        i = 0;
                    } else {
                        i = eVar.mo219899a();
                    }
                    C63774v.m250384a(e, i);
                }
            });
            return true;
        }
        FollowInfo pop = this.f154925f.pop();
        if (this.f154925f.size() != 0 || (followInfo = this.f154923d) == null || !followInfo.getShareId().equals(pop.getShareId())) {
            if (pop != null) {
                pop.setShareId(null);
                pop.setOptions(null);
            }
            this.f154924e = pop;
        } else {
            this.f154924e = null;
        }
        mo213878d(pop);
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: m */
    public void mo213887m() {
        if (this.f154923d == null) {
            C60700b.m235851b("FollowLog_FollowControl", "[toPresenter]", "fail. FollowInfo = null");
            return;
        }
        int size = this.f154925f.size();
        C60700b.m235851b("FollowLog_FollowControl", "[toPresenter2]", "stackSize = " + size);
        if (size > 0) {
            this.f154924e = null;
            this.f154925f.clear();
            this.f154932m.clear();
            BaseFollowRuntime.m241318b().put(this.f154923d.getShareId(), true);
            mo213878d(this.f154923d);
            AbstractC61784b bVar = this.f154922c;
            if (bVar != null) {
                bVar.l_(true);
            }
        } else if (this.f154922c == null || !this.f154923d.getShareId().equals(this.f154922c.mo214027g())) {
            this.f154924e = null;
            mo213878d(this.f154923d);
            AbstractC61784b bVar2 = this.f154922c;
            if (bVar2 != null) {
                bVar2.l_(true);
            }
        } else {
            this.f154922c.mo214022c();
            this.f154924e = null;
        }
        for (AbstractC61751a.AbstractC61754c cVar : this.f154920a) {
            if (cVar != null) {
                cVar.mo213923b(mo213889o());
                cVar.mo213925c(mo213889o());
            }
        }
        C63774v.m250382a(4);
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: a */
    public void mo213857a(PageStatus pageStatus) {
        this.f154926g = pageStatus;
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: b */
    public void mo213868b(AbstractC61751a.AbstractC61754c cVar) {
        this.f154920a.remove(cVar);
    }

    /* renamed from: d */
    public void mo213878d(FollowInfo followInfo) {
        mo213855a(followInfo, false);
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: a */
    public void mo213858a(AbstractC61751a.AbstractC61754c cVar) {
        this.f154920a.add(cVar);
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: b */
    public void mo213869b(AbstractC61807d dVar) {
        this.f154921b.remove(dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m241019a(VideoChatUser videoChatUser) {
        C60738ac.m236039c(UIHelper.mustacheFormat((int) R.string.View_VM_NameIsSharingContent, "name", C60733aa.m235991b(videoChatUser.getId(), videoChatUser.getName())));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m241022b(VideoChatUser videoChatUser) {
        C60738ac.m236039c(UIHelper.mustacheFormat((int) R.string.View_VM_NameIsSharingContent, "name", C60733aa.m235991b(videoChatUser.getId(), videoChatUser.getName())));
    }

    /* renamed from: d */
    private String m241023d(String str) {
        String queryParameter;
        if (!str.startsWith("https://www.google.com/url?q=") || (queryParameter = Uri.parse(str).getQueryParameter(C23766q.f58841a)) == null || !queryParameter.startsWith("http")) {
            return str;
        }
        return m241023d(queryParameter);
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: c */
    public void mo213874c(FollowInfo followInfo) {
        if (this.mMeeting != null && this.mMeeting.aE().mo208293c()) {
            if (this.f154941v) {
                this.f154941v = false;
                mo213854a(followInfo);
                return;
            }
            C61779a aVar = this.f154936q;
            if (aVar != null) {
                aVar.mo214045a();
            }
        }
    }

    public FollowControl(C61303k kVar) {
        super(kVar);
        m241008H();
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: b */
    public void mo213867b(FollowInfo followInfo) {
        for (AbstractC61807d dVar : this.f154921b) {
            if (dVar != null) {
                dVar.mo214058b(followInfo);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61785c
    /* renamed from: c */
    public void mo213875c(String str) {
        FollowInfo followInfo = this.f154924e;
        if (followInfo != null) {
            followInfo.setDocTitle(str);
        }
        for (AbstractC61751a.AbstractC61754c cVar : this.f154920a) {
            if (cVar != null) {
                cVar.mo213918a(str);
            }
        }
        for (AbstractC61807d dVar : this.f154921b) {
            if (dVar != null) {
                dVar.mo214056a(str);
            }
        }
    }

    /* renamed from: a */
    public void mo213853a(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        if (FollowConfig.m241446b()) {
            C60700b.m235851b("FollowLog_FollowControl", "onInMeetingInfoUpdate", "isFollowEnable");
            mo213854a(videoChatInMeetingInfo.getFollowInfo());
            return;
        }
        FollowInfo followInfo = videoChatInMeetingInfo.getFollowInfo();
        this.f154923d = followInfo;
        mo213867b(followInfo);
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61785c
    /* renamed from: c */
    public void mo213876c(boolean z) {
        for (AbstractC61751a.AbstractC61754c cVar : this.f154920a) {
            if (!(cVar == null || this.f154922c == null)) {
                cVar.mo213928e(z);
                if (z || !C61806b.m241473a(this.f154923d, this.f154922c.mo214026f())) {
                    cVar.mo213917a(FollowDirection.NONE);
                }
            }
        }
    }

    /* renamed from: e */
    private void m241024e(FollowInfo followInfo) {
        AbstractC61784b bVar;
        AbstractC61801f fVar;
        if (this.f154930k == Type.UNKNOWN) {
            C60700b.m235864f("FollowLog_FollowControl", "[execFollow]", "type is UNKNOWN, " + followInfo.toString());
            return;
        }
        if (this.f154930k != Type.TRANS || this.f154923d == null) {
            if (!(this.f154930k != Type.CHANGED || followInfo.getInitSource() != FollowInfo.InitSource.INIT_DIRECTLY || C61806b.m241471a(followInfo) || getMeeting().mo212056e() == null || getMeeting().mo212056e().getVideoChatSettings() == null || getMeeting().mo212056e().getVideoChatSettings().getSubType() == VideoChatSettings.SubType.SCREEN_SHARE || (fVar = this.f154935p) == null)) {
                fVar.mo214076a();
                this.f154935p = null;
            }
        } else if (C61806b.m241471a(followInfo)) {
            if (this.f154942w) {
                C60738ac.m236037c((int) R.string.View_VM_YouAreNowSharing);
            }
            m241013M();
        } else {
            UserInfoService.getUserInfoById(this.mMeeting.mo212055d(), followInfo.getUserId(), followInfo.getUserType(), $$Lambda$FollowControl$SyS2ammaFssAy6Ch7qeeG2nbE3s.INSTANCE);
            AbstractC61801f fVar2 = this.f154935p;
            if (fVar2 != null) {
                fVar2.mo214076a();
                this.f154935p = null;
            }
        }
        this.f154923d = followInfo;
        if (this.f154930k == Type.START) {
            VideoChat e = getMeeting().mo212056e();
            C60700b.m235841a(e, "FollowControl", "FollowControl", "execFollow Type.START", "FollowLog_FollowControl", "execFollow: FollowInfo = " + followInfo.toString() + ", type = " + this.f154930k);
            if (getMeeting().aj().mo216408a()) {
                getMeeting().aj().mo216414d();
            }
            if (this.f154926g == PageStatus.UNKNOWN && getMeeting().mo212067p() == DisplayMode.WINDOW) {
                this.f154926g = PageStatus.AUTO_CLOSE;
            }
            mo213878d(followInfo);
            this.f154936q.mo214046a(followInfo);
            for (AbstractC61751a.AbstractC61754c cVar : this.f154920a) {
                if (cVar != null) {
                    cVar.mo213923b(mo213889o());
                    cVar.mo213925c(mo213889o());
                }
            }
        } else if (this.f154930k == Type.END) {
            m241020a(mo213846C(), true);
            VideoChat e2 = getMeeting().mo212056e();
            C60700b.m235841a(e2, "FollowControl", "FollowControl", "execFollow Type.END", "FollowLog_FollowControl", "execFollow: FollowInfo = " + followInfo + ", type = " + this.f154930k);
            m241014N();
            for (AbstractC61751a.AbstractC61754c cVar2 : this.f154920a) {
                if (cVar2 != null) {
                    cVar2.mo213926d();
                }
            }
        } else if (this.f154930k == Type.CHANGED) {
            m241020a(mo213846C(), false);
            VideoChat e3 = getMeeting().mo212056e();
            C60700b.m235841a(e3, "FollowControl", "FollowControl", "execFollow Type.CHANGED", "FollowLog_FollowControl", "execFollow: FollowInfo = " + followInfo.toString() + ", type = " + this.f154930k);
            if (followInfo.getInitSource() == FollowInfo.InitSource.INIT_DIRECTLY || (!((bVar = this.f154922c) == null || bVar.mo214028h() == BaseFollowRuntime.RuntimeStatus.BROWSING) || this.f154926g == PageStatus.AUTO_CLOSE)) {
                mo213878d(followInfo);
                for (AbstractC61751a.AbstractC61754c cVar3 : this.f154920a) {
                    if (cVar3 != null) {
                        cVar3.mo213923b(mo213889o());
                        cVar3.mo213925c(mo213889o());
                        cVar3.mo213917a(this.f154927h);
                    }
                }
            } else if (this.f154922c != null && !C61806b.m241474a(followInfo.getRawUrl(), this.f154922c.mo214032l())) {
                this.f154927h = FollowDirection.NONE;
                this.f154930k = Type.DOING;
                for (AbstractC61751a.AbstractC61754c cVar4 : this.f154920a) {
                    if (cVar4 != null && this.f154926g == PageStatus.OPENED) {
                        cVar4.mo213917a(this.f154927h);
                        cVar4.mo213934m();
                    }
                }
            } else if (this.f154922c != null && C61806b.m241474a(followInfo.getRawUrl(), this.f154922c.mo214032l())) {
                this.f154930k = Type.DOING;
                if (this.f154922c instanceof C61859b) {
                    this.f154927h = FollowDirection.UNKNOWN;
                }
                for (AbstractC61751a.AbstractC61754c cVar5 : this.f154920a) {
                    if (cVar5 != null && this.f154926g == PageStatus.OPENED) {
                        cVar5.mo213917a(this.f154927h);
                        cVar5.mo213932k();
                    }
                }
            }
            this.f154936q.mo214048b(followInfo);
        } else if (this.f154930k == Type.TRANS) {
            VideoChat e4 = getMeeting().mo212056e();
            C60700b.m235841a(e4, "FollowControl", "FollowControl", "execFollow Type.TRANS", "FollowLog_FollowControl", "execFollow: FollowInfo = " + followInfo.toString() + ", type = " + this.f154930k);
            if (this.f154922c != null && followInfo.getShareId().equals(this.f154922c.mo214027g())) {
                this.f154930k = Type.DOING;
                this.f154922c.mo214017a(followInfo);
                this.f154922c.mo214010x();
            } else if (!mo213889o()) {
                this.f154930k = Type.DOING;
            } else if (this.f154922c != null || this.f154926g == PageStatus.AUTO_CLOSE) {
                mo213878d(followInfo);
            }
            this.f154936q.mo214048b(followInfo);
            for (AbstractC61751a.AbstractC61754c cVar6 : this.f154920a) {
                if (cVar6 != null && this.f154926g == PageStatus.OPENED) {
                    cVar6.mo213923b(mo213889o());
                    cVar6.mo213925c(mo213889o());
                    cVar6.mo213917a(this.f154927h);
                }
            }
        } else if (this.f154930k == Type.DOING && this.f154926g == PageStatus.AUTO_CLOSE && this.f154922c == null) {
            mo213878d(followInfo);
            this.f154936q.mo214048b(followInfo);
            for (AbstractC61751a.AbstractC61754c cVar7 : this.f154920a) {
                if (cVar7 != null) {
                    cVar7.mo213923b(mo213889o());
                    cVar7.mo213925c(mo213889o());
                    cVar7.mo213917a(this.f154927h);
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: a */
    public void mo213854a(FollowInfo followInfo) {
        if (followInfo != null && !TextUtils.isEmpty(followInfo.getShareId())) {
            String url = followInfo.getUrl();
            String deviceId = followInfo.getDeviceId();
            String shareId = followInfo.getShareId();
            if (CollectionUtils.isEmpty(this.f154931l) || !this.f154931l.contains(followInfo.getShareId())) {
                if (shareId.equals(mo213846C()) && TextUtils.isEmpty(url) && !TextUtils.isEmpty(mo213883i())) {
                    this.f154930k = Type.END;
                    this.f154931l.add(followInfo.getShareId());
                    C63771t.m250370a();
                    if (C61806b.m241471a(mo213882h())) {
                        C63774v.m250387a(getMeeting(), mo213882h(), "send");
                    } else {
                        C63774v.m250387a(getMeeting(), mo213882h(), "receive");
                    }
                } else if (!shareId.equals(mo213846C()) && !TextUtils.isEmpty(url) && TextUtils.isEmpty(mo213883i())) {
                    this.f154930k = Type.START;
                    this.f154939t = true;
                    this.f154940u = true;
                    C63774v.m250382a(0);
                    C63772u.m250375a(getMeeting().mo212056e(), shareId, followInfo.getShareSubType().getNumber(), followInfo.getShareType().getNumber(), C61806b.m241471a(followInfo));
                } else if (!shareId.equals(mo213846C()) && !TextUtils.isEmpty(url) && !TextUtils.isEmpty(mo213883i())) {
                    this.f154930k = Type.CHANGED;
                    C63774v.m250382a(2);
                    if (followInfo.getInitSource() == FollowInfo.InitSource.INIT_DIRECTLY) {
                        this.f154924e = null;
                        this.f154925f.clear();
                        this.f154932m.clear();
                        this.f154939t = true;
                        this.f154940u = true;
                        AbstractC61784b bVar = this.f154922c;
                        if (bVar != null) {
                            bVar.l_(true);
                        }
                    } else if (C61806b.m241471a(followInfo)) {
                        mo213873c();
                        if (followInfo.getInitSource() == FollowInfo.InitSource.INIT_FROM_LINK) {
                            C60700b.m235851b("FollowLog_FollowControl", "[followChanged]", "presenter exec forward");
                            if (this.f154928i) {
                                this.f154928i = false;
                            } else {
                                this.f154925f.push(this.f154923d);
                                if (this.f154922c != null) {
                                    C60700b.m235851b("FollowLog_FollowControl", "[followChanged2]", "onRequestOpenLink onClick: getPresenterStates=  " + this.f154922c.mo214029i());
                                    this.f154932m.push(this.f154922c.mo214029i());
                                }
                            }
                            C63742at.m250098g(this.mMeeting.mo212056e(), followInfo);
                        } else if (followInfo.getInitSource() == FollowInfo.InitSource.INIT_REACTIVATED) {
                            this.f154933n = this.f154932m.pop();
                            C60700b.m235851b("FollowLog_FollowControl", "[followChanged3]", "popBack: presenterStates = " + this.f154933n);
                        }
                    } else if (mo213896v() && this.f154924e == null) {
                        this.f154924e = this.f154923d;
                    }
                } else if (shareId.equals(mo213846C()) && !ParticipantUtil.m248719a(mo213882h(), followInfo)) {
                    C60700b.m235851b("FollowLog_FollowControl", "[followChanged4]", "TRANS: deviceId = " + deviceId + ", getDeviceId() = " + mo213848E());
                    this.f154930k = Type.TRANS;
                    mo213873c();
                    if (C61806b.m241471a(mo213882h())) {
                        C63774v.m250387a(getMeeting(), mo213882h(), "send");
                    } else {
                        C63774v.m250387a(getMeeting(), mo213882h(), "receive");
                    }
                    if (mo213889o() || C61806b.m241471a(followInfo)) {
                        this.f154924e = null;
                        this.f154925f.clear();
                        this.f154932m.clear();
                    }
                    for (AbstractC61751a.AbstractC61754c cVar : this.f154920a) {
                        if (cVar != null) {
                            cVar.mo213929i();
                        }
                    }
                }
                if (this.f154930k == Type.START || this.f154930k == Type.END || this.f154930k == Type.CHANGED) {
                    C60700b.m235851b("FollowLog_FollowControl", "[followChanged5]", "mark follow docs cache need update" + this.f154930k);
                    this.mMeeting.aa().mo216271a(true);
                }
                m241012L();
                m241024e(followInfo);
                getMeeting().ax().mo214360n();
            }
        } else if (this.mMeeting.al().mo213181h()) {
            this.f154930k = Type.END;
            m241024e(followInfo);
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61785c
    /* renamed from: b */
    public void mo213871b(boolean z) {
        for (AbstractC61751a.AbstractC61754c cVar : this.f154920a) {
            if (cVar != null) {
                cVar.mo213927d(z);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: b */
    public boolean mo213872b(String str) {
        if (TextUtils.isEmpty(str) || !TextUtils.equals(str, this.f154938s)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m241020a(String str, boolean z) {
        Activity c = VCAppLifeCycle.m236256c();
        if (c != null && (c instanceof MeetingActivity)) {
            ((MeetingActivity) c).mo212774a(str, z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m241018a(VideoChat videoChat, StatusNode statusNode) {
        C60700b.m235851b("FollowLog_FollowControl", "[initFollowControl2]", "execFollow: meetingStateChanged = " + statusNode);
        if (statusNode == StatusNode.Idle) {
            C63771t.m250370a();
            if (mo213847D() && mo213882h() != null) {
                if (C61806b.m241471a(mo213882h())) {
                    C63774v.m250387a(getMeeting(), mo213882h(), "send");
                } else {
                    C63774v.m250387a(getMeeting(), mo213882h(), "receive");
                }
            }
            C26171w.m94675a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.follow.$$Lambda$FollowControl$7tWxJuEPyLa1aCMeDcs7C5ka_AA */

                public final void run() {
                    FollowControl.this.m241014N();
                }
            });
        }
    }

    /* renamed from: b */
    private void m241021b(FollowInfo followInfo, boolean z) {
        if (this.mMeeting == null || !this.mMeeting.aE().mo208293c() || this.mMeeting.aE().mo208292b()) {
            C63774v.m250390b(getMeeting().mo212056e(), mo213882h());
            if (followInfo != null && this.f154920a.size() > 0) {
                if (this.f154922c != null) {
                    C60700b.m235851b("FollowLog_FollowControl", "[createFollowRuntime]", "remove exist followRuntime first");
                    this.f154929j = this.f154922c.mo214026f();
                    this.f154922c.mo214001a();
                    if (followInfo.getShareSubType() == FollowInfo.ShareSubType.CCM_DOCX && !C63634c.m249496b("byteview.meeting.android.magic_share_docx")) {
                        for (AbstractC61751a.AbstractC61754c cVar : this.f154920a) {
                            if (cVar != null) {
                                cVar.mo213926d();
                                cVar.bH_();
                            }
                        }
                    }
                    this.f154922c = null;
                }
                if (followInfo.getShareType() == FollowInfo.ShareType.CCM) {
                    this.f154922c = new C61773a(getAppContext(), followInfo, this.mMeeting.mo212055d(), this, z);
                } else if (followInfo.getShareType() == FollowInfo.ShareType.UNIVERSAL) {
                    this.f154922c = new C61859b(getAppContext(), followInfo, this.mMeeting.mo212055d(), this);
                }
                AbstractC61784b bVar = this.f154922c;
                if (bVar == null || bVar.mo214009w() == null) {
                    C60700b.m235864f("FollowLog_FollowControl", "[createFollowRuntime2]", "fail, runtime or fragment is null");
                    return;
                }
                if (this.f154933n != null && mo213889o()) {
                    this.f154922c.mo214020a(this.f154933n);
                    this.f154933n = null;
                }
                for (AbstractC61751a.AbstractC61754c cVar2 : this.f154920a) {
                    if (cVar2 != null) {
                        cVar2.mo213916a(this.f154922c.mo214009w());
                    }
                }
                return;
            }
            return;
        }
        this.f154941v = true;
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61785c
    /* renamed from: a */
    public void mo213852a(PresenterLocationChangedEvent.Location location, PresenterLocationChangedEvent.Location location2) {
        FollowDirection followDirection;
        FollowDirection followDirection2;
        FollowDirection followDirection3;
        if (m241016P() && !mo213889o()) {
            if (TextUtils.equals(location.space, location2.space)) {
                double abs = Math.abs(location2.f15478x - location.f15478x);
                double abs2 = Math.abs(location2.f15479y - location.f15479y);
                if (this.f154923d.getShareType() == FollowInfo.ShareType.CCM || this.f154923d.getShareType() == FollowInfo.ShareType.GOOGLE) {
                    switch (C617508.f154959a[this.f154923d.getShareSubType().ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            if (location2.f15479y == location.f15479y) {
                                this.f154927h = FollowDirection.NONE;
                                break;
                            } else {
                                if (location2.f15479y > location.f15479y) {
                                    followDirection = FollowDirection.DOWN;
                                } else {
                                    followDirection = FollowDirection.UP;
                                }
                                this.f154927h = followDirection;
                                break;
                            }
                        case 9:
                        case 10:
                        case 11:
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                            if (abs >= abs2) {
                                if (location2.f15478x == location.f15478x) {
                                    this.f154927h = FollowDirection.NONE;
                                    break;
                                } else {
                                    if (location2.f15478x > location.f15478x) {
                                        followDirection3 = FollowDirection.RIGHT;
                                    } else {
                                        followDirection3 = FollowDirection.LEFT;
                                    }
                                    this.f154927h = followDirection3;
                                    break;
                                }
                            } else if (location2.f15479y == location.f15479y) {
                                this.f154927h = FollowDirection.NONE;
                                break;
                            } else {
                                if (location2.f15479y > location.f15479y) {
                                    followDirection2 = FollowDirection.DOWN;
                                } else {
                                    followDirection2 = FollowDirection.UP;
                                }
                                this.f154927h = followDirection2;
                                break;
                            }
                        default:
                            this.f154927h = FollowDirection.NONE;
                            break;
                    }
                }
            } else {
                this.f154927h = FollowDirection.NONE;
            }
            if (this.f154922c != null && !C61806b.m241474a(this.f154923d.getRawUrl(), this.f154922c.mo214032l())) {
                this.f154927h = FollowDirection.NONE;
            }
            for (AbstractC61751a.AbstractC61754c cVar : this.f154920a) {
                if (cVar != null) {
                    cVar.mo213917a(this.f154927h);
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61785c
    /* renamed from: b */
    public void mo213870b(final String str, final String str2) {
        final String d = m241023d(str);
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(d)) {
            arrayList.add(d);
        }
        for (AbstractC61751a.AbstractC61754c cVar : this.f154920a) {
            if (cVar != null) {
                cVar.mo213920a(true);
            }
        }
        mo213873c();
        C60700b.m235851b("FollowLog_FollowControl", "[onRequestOpenLink]", "isSharingDevice = " + mo213889o());
        VcBizSender.m249239b(arrayList).mo219889a(new AbstractC63598b<GetUrlBriefsEntity>() {
            /* class com.ss.android.vc.meeting.module.follow.FollowControl.C617487 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("FollowLog_FollowControl", "[onRequestOpenLink3]", "[getUrlBrief] error = " + eVar.toString());
                for (AbstractC61751a.AbstractC61754c cVar : FollowControl.this.f154920a) {
                    if (cVar != null) {
                        cVar.mo213920a(false);
                    }
                }
                if (eVar.f160600c) {
                    return;
                }
                if (eVar.mo219899a() == 10008 || eVar.mo219899a() == 10009) {
                    C60738ac.m236037c((int) R.string.View_G_ConnectionError);
                } else {
                    C60738ac.m236039c(UIHelper.mustacheFormat((int) R.string.View_VM_OperationFailedCodeErrorCode, "error_code", Integer.toString(eVar.mo219899a())));
                }
            }

            /* renamed from: a */
            public void onSuccess(GetUrlBriefsEntity getUrlBriefsEntity) {
                UrlBrief urlBrief;
                if (!CollectionUtils.isEmpty(getUrlBriefsEntity.urlBriefs)) {
                    urlBrief = getUrlBriefsEntity.urlBriefs.get(d);
                } else {
                    urlBrief = null;
                }
                C60700b.m235851b("FollowLog_FollowControl", "[onRequestOpenLink2]", "[getUrlBrief] success");
                if (urlBrief == null) {
                    for (AbstractC61751a.AbstractC61754c cVar : FollowControl.this.f154920a) {
                        if (cVar != null) {
                            cVar.mo213920a(false);
                        }
                    }
                } else if (urlBrief.isDirty.booleanValue()) {
                    for (AbstractC61751a.AbstractC61754c cVar2 : FollowControl.this.f154920a) {
                        if (cVar2 != null) {
                            cVar2.mo213920a(false);
                        }
                    }
                    C60738ac.m236024a(R.drawable.icon_no_support_link_error, R.string.View_VM_UnableToOpenLink, 2000);
                } else if (urlBrief.openInBrowser) {
                    for (AbstractC61751a.AbstractC61754c cVar3 : FollowControl.this.f154920a) {
                        if (cVar3 != null) {
                            cVar3.mo213920a(false);
                        }
                    }
                    for (AbstractC61751a.AbstractC61754c cVar4 : FollowControl.this.f154920a) {
                        if (cVar4 != null) {
                            cVar4.mo213921a(FollowControl.this.mo213889o(), urlBrief.url);
                        }
                    }
                } else if (FollowControl.this.mo213889o()) {
                    FollowControl followControl = FollowControl.this;
                    followControl.mo213863a(d, followControl.mo213898x(), FollowInfo.InitSource.INIT_FROM_LINK, false, -1, new AbstractC61751a.AbstractC61755d() {
                        /* class com.ss.android.vc.meeting.module.follow.FollowControl.C617487.C617491 */

                        @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a.AbstractC61755d
                        /* renamed from: a */
                        public void mo213909a() {
                            for (AbstractC61751a.AbstractC61754c cVar : FollowControl.this.f154920a) {
                                if (cVar != null) {
                                    cVar.mo213920a(false);
                                }
                            }
                        }

                        @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a.AbstractC61755d
                        /* renamed from: a */
                        public void mo213910a(boolean z) {
                            for (AbstractC61751a.AbstractC61754c cVar : FollowControl.this.f154920a) {
                                if (cVar != null) {
                                    cVar.mo213920a(false);
                                }
                            }
                        }
                    });
                } else if (!FollowControl.this.mo213896v() || urlBrief == null || urlBrief.type != FollowInfo.ShareType.CCM || urlBrief.subtype != FollowInfo.ShareSubType.CCM_BITABLE || C63634c.m249496b("byteview.meeting.android.magic_share_bitable")) {
                    if (FollowControl.this.f154924e != null) {
                        if (!FollowControl.this.f154928i) {
                            FollowControl.this.f154925f.push(FollowControl.this.f154924e);
                        }
                    } else if (FollowControl.this.f154928i) {
                        if (FollowControl.this.mo213896v() && FollowControl.this.f154929j != null) {
                            FollowControl.this.f154925f.push(FollowControl.this.f154929j);
                        }
                    } else if (FollowControl.this.f154922c != null) {
                        FollowControl.this.f154925f.push(FollowControl.this.f154922c.mo214026f());
                    } else {
                        FollowControl.this.f154925f.push(FollowControl.this.f154923d);
                    }
                    String str = str2;
                    if (TextUtils.isEmpty(str)) {
                        str = urlBrief.title;
                    }
                    if (FollowControl.this.mo213896v() || !FollowControl.this.f154928i) {
                        FollowControl.this.f154924e = new FollowInfo();
                        FollowControl.this.f154924e.setUrl(urlBrief.url);
                        FollowControl.this.f154924e.setRawUrl(str);
                        FollowControl.this.f154924e.setDocTitle(str);
                        FollowControl.this.f154924e.setShareType(urlBrief.type);
                        FollowControl.this.f154924e.setShareSubType(urlBrief.subtype);
                        FollowControl followControl2 = FollowControl.this;
                        followControl2.mo213878d(followControl2.f154924e);
                    }
                    for (AbstractC61751a.AbstractC61754c cVar5 : FollowControl.this.f154920a) {
                        if (cVar5 != null) {
                            cVar5.mo213920a(false);
                            cVar5.mo213919a(urlBrief.url, str);
                        }
                    }
                    if (!C61806b.m241473a(FollowControl.this.f154924e, FollowControl.this.f154923d) && (FollowControl.this.mo213896v() || !FollowControl.this.f154928i)) {
                        FollowControl.this.f154927h = FollowDirection.NONE;
                        for (AbstractC61751a.AbstractC61754c cVar6 : FollowControl.this.f154920a) {
                            if (cVar6 != null && FollowControl.this.f154926g == PageStatus.OPENED) {
                                cVar6.mo213917a(FollowControl.this.f154927h);
                            }
                        }
                    }
                    for (AbstractC61807d dVar : FollowControl.this.f154921b) {
                        if (dVar != null) {
                            dVar.mo214057a(urlBrief.url, str);
                        }
                    }
                    if (FollowControl.this.f154928i) {
                        FollowControl.this.f154928i = false;
                    }
                    C63742at.m250086c(FollowControl.this.mMeeting.mo212056e(), FollowControl.this.f154924e, 0);
                } else {
                    C60700b.m235851b("FollowLog_FollowControl", "[onRequestOpenLink3]", "cannot access bitable url in VC, turn to CCM");
                    VideoChatModule.getDependency().getDocsDependency().mo196378a(urlBrief.url, com.ss.android.vc.dependency.ar.m236694a());
                }
            }
        });
    }

    /* renamed from: a */
    public void mo213855a(FollowInfo followInfo, boolean z) {
        C60700b.m235851b("FollowLog_FollowControl", "[showFollowContentViewControl]", String.format("showFollowContentViewControl isRefresh= %s, pageStatus= %s, mType= %s", Boolean.valueOf(z), this.f154926g, this.f154930k));
        if (this.f154926g != PageStatus.OPENED || this.f154930k == Type.START) {
            for (AbstractC61751a.AbstractC61754c cVar : this.f154920a) {
                if (cVar != null) {
                    cVar.bH_();
                }
            }
        }
        if (followInfo != null && m241015O()) {
            this.f154930k = Type.DOING;
            this.f154926g = PageStatus.OPENED;
            FollowInfo followInfo2 = this.f154924e;
            if (followInfo2 != null && !TextUtils.isEmpty(followInfo2.getShareId())) {
                if (!this.f154924e.getShareId().equals(this.f154923d.getShareId())) {
                    this.f154924e.setShareId(null);
                    this.f154924e.setOptions(null);
                } else {
                    this.f154924e = null;
                }
            }
            if (!CollectionUtils.isEmpty(this.f154934o) && !this.f154934o.containsKey(followInfo.getShareId())) {
                this.f154934o.clear();
                this.f154934o.put(followInfo.getShareId(), "false");
            }
            FollowInfo followInfo3 = this.f154924e;
            if (followInfo3 != null) {
                followInfo = followInfo3;
            }
            m241021b(followInfo, z);
        } else if (this.mMeeting == null || !this.mMeeting.aE().mo208293c() || followInfo == null || m241015O()) {
            C60700b.m235851b("FollowLog_FollowControl", "[showFollowContentViewControl2]", "isOnTheCallActivityMode = " + m241015O());
        } else {
            this.f154941v = true;
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a
    /* renamed from: a */
    public void mo213856a(CreateDocEntityRequest.CreateDocType createDocType, final AbstractC61751a.AbstractC61752a aVar) {
        C60700b.m235851b("FollowLog_FollowControl", "[createDoc]", "type = " + createDocType);
        VcBizSender.m249149a(createDocType).mo219893b(new AbstractC63598b<C60973g>() {
            /* class com.ss.android.vc.meeting.module.follow.FollowControl.C617443 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235851b("FollowLog_FollowControl", "[createDoc3]", "error= " + eVar.mo219902b());
                if (!eVar.f160600c) {
                    if (eVar.mo219899a() == 10008 || eVar.mo219899a() == 10009) {
                        C60738ac.m236037c((int) R.string.View_G_ConnectionError);
                    } else {
                        C60738ac.m236039c(UIHelper.mustacheFormat((int) R.string.View_VM_OperationFailedCodeErrorCode, "error_code", Integer.toString(eVar.mo219899a())));
                    }
                }
                AbstractC61751a.AbstractC61752a aVar = aVar;
                if (aVar != null) {
                    aVar.mo213914a(eVar);
                }
            }

            /* renamed from: a */
            public void onSuccess(C60973g gVar) {
                List<Participant> list;
                int value = ShareFollowEntityRequest.AuthorityMask.GRANT_EXTERNAL_EDIT.getValue();
                if (FollowControl.this.mMeeting == null || FollowControl.this.mMeeting.mo212091I() == null || FollowControl.this.mMeeting.mo212091I().mo212494b() == null) {
                    list = null;
                } else {
                    list = FollowControl.this.mMeeting.mo212091I().mo212494b().mo212601f();
                }
                if (!CollectionUtils.isEmpty(list)) {
                    if (C61806b.m241476b(list)) {
                        value = ShareFollowEntityRequest.AuthorityMask.GRANT_EXTERNAL_EDIT.getValue() | ShareFollowEntityRequest.AuthorityMask.GRANT_INTERNAL_EDIT.getValue();
                    } else {
                        value = ShareFollowEntityRequest.AuthorityMask.GRANT_INTERNAL_EDIT.getValue();
                    }
                }
                C60700b.m235851b("FollowLog_FollowControl", "[createDoc2]", "success with autoMask= " + value);
                FollowControl.this.mo213863a(gVar.f152687a, FollowControl.this.mo213898x(), FollowInfo.InitSource.INIT_DIRECTLY, true, value, null);
                AbstractC61751a.AbstractC61752a aVar = aVar;
                if (aVar != null) {
                    aVar.mo213913a();
                }
            }
        });
    }
}
