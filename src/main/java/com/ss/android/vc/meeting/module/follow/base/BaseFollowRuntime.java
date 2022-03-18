package com.ss.android.vc.meeting.module.follow.base;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.bear.doc.follow.event.PositionKeeperApiCreatedEvent;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.C57859q;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60733aa;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.follow.FollowGrootCellPayload;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.entity.follow.FollowState;
import com.ss.android.vc.entity.follow.FollowStrategy;
import com.ss.android.vc.entity.response.ao;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.follow.common.C61806b;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.net.service.VideoChatUserService;
import com.ss.android.vc.statistics.event.C63774v;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class BaseFollowRuntime implements AbstractC61784b {

    /* renamed from: d */
    private static Map<String, Boolean> f155035d = new HashMap();

    /* renamed from: a */
    protected long f155036a;

    /* renamed from: b */
    protected PositionKeeperApiCreatedEvent.AbstractC5429a f155037b;

    /* renamed from: c */
    protected volatile boolean f155038c;

    /* renamed from: e */
    private boolean f155039e;

    /* renamed from: f */
    private FollowInfo f155040f;

    /* renamed from: g */
    private Context f155041g;

    /* renamed from: h */
    private String f155042h;

    /* renamed from: i */
    private AbstractC61785c f155043i;

    /* renamed from: j */
    private C61778a f155044j = new C61778a();

    /* renamed from: k */
    private Map<String, List<FollowState>> f155045k = new HashMap();

    /* renamed from: l */
    private Map<String, List<FollowState>> f155046l;

    /* renamed from: m */
    private String f155047m;

    public enum RuntimeStatus {
        UNKNOWN,
        PRESENTING,
        FOLLOWING,
        BROWSING
    }

    public enum RuntimeToastScene {
        SCENE_UNKNOWN(-1),
        SCENE_CAN_VIEW_ON_OWN_ORNOT(0),
        SCENE_UPDATE_T0_FOLLOW(1),
        SCENE_SYNC_POSITION_WITH_NAME(2),
        SCENE_CAN_VIEW_BY_SELF(3),
        SCENE_SHARING_DOC(4),
        SCENE_ASSIGN_SHARING_DOC(5);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static RuntimeToastScene valueOf(int i) {
            return forNumber(i);
        }

        public static RuntimeToastScene forNumber(int i) {
            if (i == 0) {
                return SCENE_CAN_VIEW_ON_OWN_ORNOT;
            }
            if (i == 1) {
                return SCENE_UPDATE_T0_FOLLOW;
            }
            if (i == 2) {
                return SCENE_SYNC_POSITION_WITH_NAME;
            }
            if (i == 3) {
                return SCENE_CAN_VIEW_BY_SELF;
            }
            if (i == 4) {
                return SCENE_SHARING_DOC;
            }
            if (i != 5) {
                return SCENE_UNKNOWN;
            }
            return SCENE_ASSIGN_SHARING_DOC;
        }

        private RuntimeToastScene(int i) {
            this.value = i;
        }
    }

    /* renamed from: b */
    public static Map<String, Boolean> m241318b() {
        return f155035d;
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61784b
    /* renamed from: e */
    public PositionKeeperApiCreatedEvent.AbstractC5429a mo214025e() {
        return this.f155037b;
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61784b
    /* renamed from: f */
    public FollowInfo mo214026f() {
        return this.f155040f;
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61784b
    /* renamed from: i */
    public Map<String, List<FollowState>> mo214029i() {
        return this.f155045k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public Map<String, List<FollowState>> mo214030j() {
        return this.f155046l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public String mo214031k() {
        return this.f155042h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public AbstractC61785c mo214039r() {
        return this.f155043i;
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61784b
    /* renamed from: s */
    public C61778a mo214040s() {
        return this.f155044j;
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61784b
    /* renamed from: h */
    public RuntimeStatus mo214028h() {
        return mo214040s().f155052a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public boolean mo214034m() {
        return C61806b.m241471a(this.f155040f);
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61784b
    /* renamed from: g */
    public String mo214027g() {
        FollowInfo followInfo = this.f155040f;
        if (followInfo != null) {
            return followInfo.getShareId();
        }
        return null;
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61784b
    /* renamed from: l */
    public String mo214032l() {
        FollowInfo followInfo = this.f155040f;
        if (followInfo != null) {
            return followInfo.getRawUrl();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo214038q() {
        if (mo214037p()) {
            return true;
        }
        return mo214036o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public boolean mo214035n() {
        FollowInfo.Options options;
        FollowInfo followInfo = this.f155040f;
        if (followInfo == null || (options = followInfo.getOptions()) == null) {
            return false;
        }
        return options.isDefaultFollow();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo214036o() {
        Boolean bool = f155035d.get(mo214027g());
        if (bool == null) {
            return mo214035n();
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo214037p() {
        FollowInfo.Options options;
        FollowInfo followInfo = this.f155040f;
        if (followInfo == null || (options = followInfo.getOptions()) == null) {
            return false;
        }
        return options.isForceFollow();
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61784b
    /* renamed from: c */
    public void mo214022c() {
        if (mo214040s().f155052a != RuntimeStatus.FOLLOWING) {
            C60700b.m235851b("FollowLog_BaseFollowRuntime", "[toPresenter]", "toPresenter");
            mo214021a(true, true);
            f155035d.put(mo214027g(), true);
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61784b
    /* renamed from: d */
    public void mo214023d() {
        if (mo214040s().f155052a != RuntimeStatus.BROWSING) {
            C60700b.m235851b("FollowLog_BaseFollowRuntime", "[freeBrowsing]", "freeBrowsing");
            mo214021a(false, true);
            f155035d.put(mo214027g(), false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public String mo214041t() {
        if (TextUtils.isEmpty(this.f155047m)) {
            this.f155047m = C57859q.m224565a("" + ParticipantType.LARK_USER.getNumber() + VideoChatUserService.getCurrentUser().getId() + VideoChatModuleDependency.m236629b());
        }
        return this.f155047m;
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61784b
    /* renamed from: a */
    public void mo214001a() {
        this.f155044j.f155054c.set(true);
        this.f155043i = null;
        this.f155040f = null;
        this.f155041g = null;
        this.f155042h = null;
        this.f155045k = null;
        this.f155047m = null;
        this.f155037b = null;
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61784b
    /* renamed from: a */
    public void mo214017a(FollowInfo followInfo) {
        this.f155040f = followInfo;
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61784b
    public void l_(boolean z) {
        this.f155038c = z;
    }

    @Override // com.ss.android.vc.meeting.module.follow.base.AbstractC61784b
    /* renamed from: a */
    public void mo214020a(Map<String, List<FollowState>> map) {
        this.f155046l = map;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m241317a(VideoChatUser videoChatUser) {
        C60738ac.m236039c(UIHelper.mustacheFormat((int) R.string.View_VM_AssignedYouToShareNameBraces, "name", C60733aa.m235991b(videoChatUser.getId(), videoChatUser.getName())));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m241319b(VideoChatUser videoChatUser) {
        C60738ac.m236039c(UIHelper.mustacheFormat((int) R.string.View_VM_PositionSyncedNameBraces, "name", C60733aa.m235991b(videoChatUser.getId(), videoChatUser.getName())));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m241320c(VideoChatUser videoChatUser) {
        C60738ac.m236039c(UIHelper.mustacheFormat((int) R.string.View_VM_NameIsSharingContent, "name", C60733aa.m235991b(videoChatUser.getId(), videoChatUser.getName())));
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.ss.android.vc.meeting.module.follow.base.BaseFollowRuntime$a */
    public class C61778a {

        /* renamed from: a */
        public RuntimeStatus f155052a = RuntimeStatus.UNKNOWN;

        /* renamed from: b */
        public boolean f155053b;

        /* renamed from: c */
        public AtomicBoolean f155054c = new AtomicBoolean(false);

        /* renamed from: d */
        public AtomicBoolean f155055d = new AtomicBoolean(false);

        /* renamed from: e */
        public AtomicBoolean f155056e = new AtomicBoolean(false);

        C61778a() {
            if (BaseFollowRuntime.this.mo214034m()) {
                this.f155052a = RuntimeStatus.PRESENTING;
            } else if (BaseFollowRuntime.this.mo214038q()) {
                this.f155052a = RuntimeStatus.FOLLOWING;
            } else {
                this.f155052a = RuntimeStatus.BROWSING;
            }
            this.f155053b = BaseFollowRuntime.this.mo214037p();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo214018a(RuntimeToastScene runtimeToastScene) {
        int i;
        C60700b.m235851b("FollowLog_BaseFollowRuntime", "[showToast]", "followToastScene = " + runtimeToastScene);
        if (this.f155040f == null) {
            C60700b.m235851b("FollowLog_BaseFollowRuntime", "[showToast]", "mFollowInfo == null");
        } else if (runtimeToastScene == RuntimeToastScene.SCENE_SHARING_DOC) {
            UserInfoService.getUserInfoById(mo214031k(), this.f155040f.getUserId(), this.f155040f.getUserType(), $$Lambda$BaseFollowRuntime$xGGKmkLACikE4baR2dM31N1JPMA.INSTANCE);
        } else if (runtimeToastScene == RuntimeToastScene.SCENE_CAN_VIEW_ON_OWN_ORNOT) {
            Context a = ar.m236694a();
            if (mo214037p()) {
                i = R.string.View_VM_YouCannotViewOnOwn;
            } else {
                i = R.string.View_VM_YouCanViewOnOwn;
            }
            C60738ac.m236039c(a.getString(i));
        } else if (runtimeToastScene == RuntimeToastScene.SCENE_UPDATE_T0_FOLLOW) {
            C60738ac.m236037c((int) R.string.View_VM_UpdateToFollow);
        } else if (runtimeToastScene == RuntimeToastScene.SCENE_SYNC_POSITION_WITH_NAME) {
            UserInfoService.getUserInfoById(mo214031k(), this.f155040f.getUserId(), this.f155040f.getUserType(), $$Lambda$BaseFollowRuntime$G7U60onCyczY9M4Umc5xHzgZxc8.INSTANCE);
        } else if (runtimeToastScene == RuntimeToastScene.SCENE_CAN_VIEW_BY_SELF) {
            C60738ac.m236037c((int) R.string.View_VM_CanViewBySelf);
        } else if (runtimeToastScene == RuntimeToastScene.SCENE_ASSIGN_SHARING_DOC) {
            UserInfoService.getUserInfoById(mo214031k(), this.f155040f.getUserId(), this.f155040f.getUserType(), $$Lambda$BaseFollowRuntime$i8VI5JFNWnp6Bx_x4XYBDtIruu8.INSTANCE);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo214019a(List<FollowState> list) {
        boolean z;
        if (list != null && list.size() != 0) {
            C63774v.m250389b();
            FollowStrategy a = mo214016a(this.f155040f, list.get(0).getStrategyId());
            if (a == null || a.isKeepOrder()) {
                z = false;
            } else {
                z = true;
            }
            if (a != null && a.isCanBeReactivated()) {
                this.f155045k.put(a.getId(), list);
            }
            C63774v.m250386a((C61303k) MeetingManager.m238341a().mo211906j(), mo214026f(), 0);
            C60700b.m235844a("FollowLog_BaseFollowRuntime", "[sendStates]", "sendFollowStates", 16000);
            FollowGrootCellPayload followGrootCellPayload = new FollowGrootCellPayload();
            followGrootCellPayload.setType(FollowGrootCellPayload.Type.STATES);
            followGrootCellPayload.setFollowStates(list);
            m241316a(followGrootCellPayload, z);
        }
    }

    /* renamed from: a */
    private void m241316a(FollowGrootCellPayload followGrootCellPayload, boolean z) {
        FollowInfo followInfo = this.f155040f;
        if (followInfo != null && !TextUtils.isEmpty(followInfo.getShareId())) {
            VcBizSender.m249164a(this.f155040f.getShareId(), followGrootCellPayload, z).mo219893b(new AbstractC63598b<ao>() {
                /* class com.ss.android.vc.meeting.module.follow.base.BaseFollowRuntime.C617761 */

                /* renamed from: a */
                public void onSuccess(ao aoVar) {
                    C63774v.m250395e();
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235851b("FollowLog_BaseFollowRuntime", "[sendGrootChannel]", "error: " + eVar.toString());
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public FollowStrategy mo214016a(FollowInfo followInfo, String str) {
        if (!(followInfo == null || followInfo.getStrategies() == null || followInfo.getStrategies().size() == 0 || TextUtils.isEmpty(str))) {
            for (FollowStrategy followStrategy : followInfo.getStrategies()) {
                if (str.equals(followStrategy.getId())) {
                    return followStrategy;
                }
            }
        }
        return null;
    }

    public void d_(String str, String str2) {
        if (!mo214034m() && this.f155038c) {
            if (("DocPosition".equals(str) && "applied".equals(str2)) || (("DocxPosition".equals(str) && "dispatched".equals(str2)) || (("SheetScroll".equals(str) && "dispatched".equals(str2)) || (("MindnoteMinderScroll".equals(str) && "dispatched".equals(str2)) || ("MindnoteOutlineScroll".equals(str) && "dispatched".equals(str2)))))) {
                mo214018a(RuntimeToastScene.SCENE_SYNC_POSITION_WITH_NAME);
                this.f155038c = false;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo214021a(final boolean z, final boolean z2) {
        VcBizSender.m249262d(mo214031k(), z).mo219893b(new AbstractC63598b<String>() {
            /* class com.ss.android.vc.meeting.module.follow.base.BaseFollowRuntime.C617772 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235851b("FollowLog_BaseFollowRuntime", "[changeFollowState2]", "onError = " + eVar.toString());
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                if (!BaseFollowRuntime.this.mo214040s().f155054c.get()) {
                    C60700b.m235851b("FollowLog_BaseFollowRuntime", "[changeFollowState]", "onSuccess. isFollow = " + z);
                    if (z) {
                        BaseFollowRuntime.this.mo214007u();
                        BaseFollowRuntime.this.mo214040s().f155052a = RuntimeStatus.FOLLOWING;
                        if (BaseFollowRuntime.this.mo214036o() && !BaseFollowRuntime.this.mo214037p() && z2) {
                            BaseFollowRuntime.this.f155038c = true;
                        }
                    } else {
                        BaseFollowRuntime.this.mo214008v();
                        BaseFollowRuntime.this.mo214040s().f155052a = RuntimeStatus.BROWSING;
                        if (!BaseFollowRuntime.this.mo214036o() && z2) {
                            BaseFollowRuntime.this.mo214018a(RuntimeToastScene.SCENE_CAN_VIEW_BY_SELF);
                        }
                    }
                    if (BaseFollowRuntime.this.mo214039r() != null) {
                        BaseFollowRuntime.this.mo214039r().mo213876c(z);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo214002a(Context context, FollowInfo followInfo, String str, boolean z) {
        if (!this.f155039e && f155035d.get(followInfo.getShareId()) == null) {
            f155035d.put(followInfo.getShareId(), Boolean.valueOf(mo214035n()));
        }
        this.f155036a = System.currentTimeMillis();
    }

    public BaseFollowRuntime(Context context, FollowInfo followInfo, String str, AbstractC61785c cVar, boolean z) {
        this.f155041g = context;
        this.f155042h = str;
        this.f155040f = followInfo;
        this.f155043i = cVar;
        this.f155039e = TextUtils.isEmpty(followInfo.getShareId());
        mo214002a(context, followInfo, str, z);
    }
}
