package com.ss.android.vc.meeting.module.tab.detail.p3169a;

import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.imageview.LKUILottieAnimationView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.export.entity.chat.OpenChat;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60742af;
import com.ss.android.vc.common.p3083e.C60745ag;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.common.widget.LineHeightTextView;
import com.ss.android.vc.common.widget.avatarlist.VcTabAvatarListView;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dto.VCLaunchError;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.MeetingStatus;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.VCParticipantAbbrInfo;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.response.av;
import com.ss.android.vc.entity.tab.FollowAbbrInfo;
import com.ss.android.vc.entity.tab.HistoryInfo;
import com.ss.android.vc.entity.tab.VCMeetingJoinInfoEntity;
import com.ss.android.vc.entity.tab.VCParamFromCalendar;
import com.ss.android.vc.entity.tab.VCParamFromGroup;
import com.ss.android.vc.entity.tab.VCTabHistoryCommonInfo;
import com.ss.android.vc.entity.tab.VCTabMeetingJoinInfo;
import com.ss.android.vc.entity.tab.VCTabMeetingSourceAppLinkInfo;
import com.ss.android.vc.entity.tab.VCTabRecordInfo;
import com.ss.android.vc.entity.tab.VCTabStatisticsInfo;
import com.ss.android.vc.entity.tab.VcTabDetailInfo;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.tab.detail.VcTabDetailActivity;
import com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a;
import com.ss.android.vc.meeting.module.tab.detail.p3170b.C63263a;
import com.ss.android.vc.meeting.module.tab.detail.p3170b.C63267b;
import com.ss.android.vc.meeting.module.tab.detail.p3170b.C63268c;
import com.ss.android.vc.meeting.module.tab.detail.p3170b.C63271d;
import com.ss.android.vc.meeting.module.tab.widgets.C63315a;
import com.ss.android.vc.meeting.module.tab.widgets.C63327d;
import com.ss.android.vc.meeting.module.tab.widgets.PageLoadErrorView;
import com.ss.android.vc.meeting.module.tab.widgets.PageLoadingView;
import com.ss.android.vc.meeting.utils.SpanUtil;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vc.service.IVideoChatService;
import com.ss.android.vc.service.impl.VideoChatService;
import com.ss.android.vc.statistics.event.ce;
import com.ss.android.vc.statistics.event2.VcTabListEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.ss.android.vc.meeting.module.tab.detail.a.d */
public class C63242d implements C63230a.AbstractC63234b {

    /* renamed from: A */
    View f159449A;

    /* renamed from: B */
    TextView f159450B;

    /* renamed from: C */
    RecyclerView f159451C;

    /* renamed from: D */
    View f159452D;

    /* renamed from: E */
    RecyclerView f159453E;

    /* renamed from: F */
    View f159454F;

    /* renamed from: G */
    View f159455G;

    /* renamed from: H */
    LKUILottieAnimationView f159456H;

    /* renamed from: I */
    LineHeightTextView f159457I;

    /* renamed from: J */
    View f159458J;

    /* renamed from: K */
    LineHeightTextView f159459K;

    /* renamed from: L */
    PageLoadingView f159460L;

    /* renamed from: M */
    PageLoadErrorView f159461M;

    /* renamed from: N */
    View f159462N;

    /* renamed from: O */
    public C63263a f159463O;

    /* renamed from: P */
    public String f159464P;

    /* renamed from: Q */
    public String f159465Q;

    /* renamed from: R */
    public String f159466R;

    /* renamed from: S */
    public ByteviewUser f159467S;

    /* renamed from: T */
    public MeetingStatus f159468T;

    /* renamed from: U */
    int f159469U;

    /* renamed from: V */
    int f159470V = 20;

    /* renamed from: W */
    int f159471W;

    /* renamed from: X */
    int f159472X;

    /* renamed from: Y */
    int f159473Y = 32;

    /* renamed from: Z */
    int f159474Z = 12;

    /* renamed from: a */
    public final VcTabDetailActivity f159475a;
    int aa = 8;
    int ab = LocationRequest.PRIORITY_HD_ACCURACY;
    private View ac;
    private final int ad = 66;
    private final int ae = 32;
    private final int af = 1000;
    private C63271d ag;
    private C63268c ah;

    /* renamed from: ai */
    private boolean f175461ai;
    private boolean aj;
    private long ak;
    private long al;
    private C60745ag.C60746a am;

    /* renamed from: b */
    public C63230a.AbstractC63234b.AbstractC63235a f159476b;

    /* renamed from: c */
    IconFontView f159477c;

    /* renamed from: d */
    RelativeLayout f159478d;

    /* renamed from: e */
    View f159479e;

    /* renamed from: f */
    View f159480f;

    /* renamed from: g */
    ImageView f159481g;

    /* renamed from: h */
    TextView f159482h;

    /* renamed from: i */
    TextView f159483i;

    /* renamed from: j */
    View f159484j;

    /* renamed from: k */
    IconFontView f159485k;

    /* renamed from: l */
    IconFontView f159486l;

    /* renamed from: m */
    IconFontView f159487m;

    /* renamed from: n */
    View f159488n;

    /* renamed from: o */
    View f159489o;

    /* renamed from: p */
    TextView f159490p;

    /* renamed from: q */
    TextView f159491q;

    /* renamed from: r */
    TextView f159492r;

    /* renamed from: s */
    TextView f159493s;

    /* renamed from: t */
    VcTabAvatarListView f159494t;

    /* renamed from: u */
    View f159495u;

    /* renamed from: v */
    IconFontView f159496v;

    /* renamed from: w */
    TextView f159497w;

    /* renamed from: x */
    View f159498x;

    /* renamed from: y */
    RecyclerView f159499y;

    /* renamed from: z */
    View f159500z;

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63234b
    /* renamed from: a */
    public void mo218869a(C63230a.AbstractC63231a aVar) {
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63234b
    /* renamed from: j */
    public void mo218884j() {
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63234b
    /* renamed from: c */
    public MeetingStatus mo218875c() {
        return this.f159468T;
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63234b
    /* renamed from: d */
    public String mo218878d() {
        return this.f159465Q;
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63234b
    /* renamed from: e */
    public String mo218879e() {
        return this.f159466R;
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63234b
    /* renamed from: f */
    public RecyclerView mo218880f() {
        return this.f159453E;
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63234b
    /* renamed from: g */
    public RecyclerView mo218881g() {
        return this.f159451C;
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63234b
    /* renamed from: h */
    public ByteviewUser mo218882h() {
        return this.f159467S;
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63234b
    /* renamed from: i */
    public boolean mo218883i() {
        return this.f175461ai;
    }

    /* renamed from: a */
    public void mo218908a(VCTabMeetingSourceAppLinkInfo vCTabMeetingSourceAppLinkInfo) {
        final RelativeLayout relativeLayout = (RelativeLayout) this.f159488n.findViewById(R.id.detail_view_calendar);
        if (vCTabMeetingSourceAppLinkInfo == null || vCTabMeetingSourceAppLinkInfo.getType() == VCTabMeetingSourceAppLinkInfo.Type.UNKNOWN) {
            this.f159500z.setVisibility(8);
            relativeLayout.setVisibility(8);
            return;
        }
        VCTabMeetingSourceAppLinkInfo.Type type = vCTabMeetingSourceAppLinkInfo.getType();
        if (type == VCTabMeetingSourceAppLinkInfo.Type.GROUP) {
            this.f159500z.setVisibility(0);
            relativeLayout.setVisibility(8);
            m247707a(vCTabMeetingSourceAppLinkInfo.getParamFromGroup());
        } else if (type == VCTabMeetingSourceAppLinkInfo.Type.CALENDAR) {
            this.f159500z.setVisibility(8);
            relativeLayout.setVisibility(0);
            VCParamFromCalendar paramFromCalendar = vCTabMeetingSourceAppLinkInfo.getParamFromCalendar();
            final String str = "/client/calendar/event/detail?calendarId=" + paramFromCalendar.getCalendar_id() + "&key=" + paramFromCalendar.getKey() + "&originalTime=" + paramFromCalendar.getOriginal_time() + "&startTime=" + paramFromCalendar.getStart_time();
            relativeLayout.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.C632544 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    C60700b.m235851b("VideoChatTab_VcTabDetailView", "[initMeetingGroup]", "click to open calendar: " + str);
                    ce.m250277j();
                    C63242d.this.f159476b.mo218886a(relativeLayout.getContext(), str);
                }
            });
        }
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63234b
    /* renamed from: a */
    public void mo218870a(C63602e eVar) {
        C60700b.m235851b("VideoChatTab_VcTabDetailView", "[showErrorResultView]", "errorResult: " + eVar);
        this.f159460L.mo219096b();
        this.f159461M.mo219090a();
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63234b
    /* renamed from: a */
    public void mo218866a(final VcTabDetailInfo vcTabDetailInfo) {
        this.f159461M.mo219091b();
        this.f159460L.mo219096b();
        if (vcTabDetailInfo != null) {
            C60735ab.m236001a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.AnonymousClass15 */

                public void run() {
                    if (!(vcTabDetailInfo.getMeetingBaseInfo() == null || vcTabDetailInfo.getMeetingBaseInfo().getHistoryCommonInfo() == null)) {
                        C63242d.this.mo218915d(vcTabDetailInfo.getMeetingBaseInfo().getHistoryCommonInfo());
                    }
                    if (!TextUtils.isEmpty(vcTabDetailInfo.getMeetingId())) {
                        C63242d.this.f159465Q = vcTabDetailInfo.getMeetingId();
                    }
                    if (vcTabDetailInfo.getMeetingBaseInfo().getSponsorUser() != null) {
                        C63242d.this.f159467S = vcTabDetailInfo.getMeetingBaseInfo().getSponsorUser();
                    }
                    if (vcTabDetailInfo.getMeetingBaseInfo().getHistoryCommonInfo().mo210416b() == VideoChat.Type.MEET) {
                        C63242d.this.mo218912b(vcTabDetailInfo.getMeetingBaseInfo().getHistoryCommonInfo());
                        if (!(vcTabDetailInfo.getMeetingBaseInfo() == null || vcTabDetailInfo.getMeetingBaseInfo().getParticipants() == null)) {
                            C63242d.this.mo218916d(vcTabDetailInfo.getMeetingBaseInfo().getParticipants());
                        }
                    } else if (vcTabDetailInfo.getMeetingBaseInfo().getHistoryCommonInfo().mo210416b() == VideoChat.Type.CALL) {
                        C63242d dVar = C63242d.this;
                        dVar.f159464P = dVar.f159476b.mo218894i();
                        C63242d.this.mo218914c(vcTabDetailInfo.getMeetingBaseInfo().getHistoryCommonInfo());
                    }
                    if (vcTabDetailInfo.getMeetingBaseInfo() != null && vcTabDetailInfo.getMeetingBaseInfo().getHistoryCommonInfo() != null && vcTabDetailInfo.getMeetingBaseInfo().getHistoryCommonInfo().mo210418d() == MeetingStatus.MEETING_END && vcTabDetailInfo.getMeetingBaseInfo().getHistoryCommonInfo().mo210422g()) {
                        C63242d.this.mo218911b(vcTabDetailInfo.getMeetingUserSpecInfo().getRecordInfo());
                    }
                    C63242d.this.mo218918f(vcTabDetailInfo.getMeetingUserSpecInfo().getFollowInfo());
                    C63242d.this.mo218917e(vcTabDetailInfo.getMeetingUserSpecInfo().getHistoryInfos());
                    C63242d.this.mo218908a(vcTabDetailInfo.getMeetingUserSpecInfo().getAppLinkInfo());
                    C63242d.this.mo218913b(vcTabDetailInfo.getMeetingUserSpecInfo().getStatisticsInfo());
                    C63242d.this.mo218921m();
                    C63242d.this.mo218922n();
                }
            });
        }
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63234b
    /* renamed from: a */
    public void mo218871a(final List<VCParticipantAbbrInfo> list) {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.AnonymousClass16 */

            public void run() {
                C63242d.this.mo218916d(list);
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63234b
    /* renamed from: a */
    public void mo218865a(final VCTabRecordInfo vCTabRecordInfo) {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.AnonymousClass17 */

            public void run() {
                if (C63242d.this.f159468T == MeetingStatus.MEETING_END) {
                    C63242d.this.mo218911b(vCTabRecordInfo);
                    C63242d.this.mo218922n();
                }
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63234b
    /* renamed from: a */
    public void mo218867a(final VCTabHistoryCommonInfo cVar) {
        if (cVar != null) {
            C60735ab.m236001a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.AnonymousClass18 */

                public void run() {
                    C63242d.this.mo218915d(cVar);
                    if (cVar.mo210416b() == VideoChat.Type.MEET) {
                        C63242d.this.mo218912b(cVar);
                        C63242d.this.mo218921m();
                        C63242d.this.mo218922n();
                    } else if (cVar.mo210416b() == VideoChat.Type.CALL) {
                        C63242d.this.mo218914c(cVar);
                        C63242d.this.mo218921m();
                        C63242d.this.mo218922n();
                    }
                }
            });
        }
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63234b
    /* renamed from: a */
    public void mo218863a(final HistoryInfo historyInfo) {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.AnonymousClass19 */

            public void run() {
                C63242d.this.f159463O.mo218949a(historyInfo);
                C63242d.this.mo218922n();
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63234b
    /* renamed from: a */
    public void mo218864a(final VCMeetingJoinInfoEntity vCMeetingJoinInfoEntity) {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.AnonymousClass22 */

            public void run() {
                C63242d.this.mo218910b(vCMeetingJoinInfoEntity);
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63234b
    /* renamed from: a */
    public void mo218868a(final VCTabStatisticsInfo eVar) {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.AnonymousClass24 */

            public void run() {
                C63242d.this.mo218913b(eVar);
            }
        });
    }

    /* renamed from: t */
    private void m247720t() {
        C60745ag.C60746a aVar = this.am;
        if (aVar != null) {
            aVar.mo208366a(true);
            this.am = null;
        }
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63234b
    /* renamed from: b */
    public void mo218872b() {
        this.f159461M.mo219091b();
        this.f159460L.mo219096b();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m247715o();
        VcTabListEvent.m249755a(this.f159475a.mo218822a());
    }

    /* renamed from: m */
    public void mo218921m() {
        VcBizService.getVCMeetingJoinStatus(new AbstractC63598b<VCMeetingJoinInfoEntity>() {
            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.C632599 */

            /* renamed from: a */
            public void onSuccess(VCMeetingJoinInfoEntity vCMeetingJoinInfoEntity) {
                C63242d.this.mo218910b(vCMeetingJoinInfoEntity);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("VideoChatTab_VcTabDetailView", "[initMeetingStatus]", "get join status fail" + eVar.toString());
            }
        });
    }

    /* renamed from: n */
    public void mo218922n() {
        C60735ab.m236002a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.AnonymousClass14 */

            public void run() {
                int measuredHeight = C63242d.this.f159479e.getMeasuredHeight();
                if (C63242d.this.f159452D.getVisibility() == 0 && measuredHeight < C63242d.this.f159452D.getTop() + C63242d.this.f159452D.getMeasuredHeight()) {
                    C63242d.this.f159462N.setVisibility(0);
                } else if (C63242d.this.f159449A.getVisibility() == 0 && measuredHeight < C63242d.this.f159449A.getTop() + C63242d.this.f159449A.getMeasuredHeight()) {
                    C63242d.this.f159462N.setVisibility(0);
                } else if (C63242d.this.f159498x.getVisibility() == 0 && measuredHeight < C63242d.this.f159498x.getTop() + C63242d.this.f159498x.getMeasuredHeight()) {
                    C63242d.this.f159462N.setVisibility(0);
                } else if (C63242d.this.f159454F.getVisibility() != 0 || measuredHeight >= C63242d.this.f159454F.getTop() + C63242d.this.f159454F.getMeasuredHeight()) {
                    C63242d.this.f159462N.setVisibility(8);
                } else {
                    C63242d.this.f159462N.setVisibility(0);
                }
            }
        }, (long) this.ab);
    }

    /* renamed from: o */
    private void m247715o() {
        this.f159475a.setContentView(R.layout.activity_vc_tab_detail);
        this.ac = this.f159475a.findViewById(R.id.vc_tab_detail_container);
        m247716p();
        this.f159476b.mo218885a();
    }

    /* renamed from: p */
    private void m247716p() {
        m247717q();
        this.f159461M.setTryReloadingClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.C632431 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C60700b.m235851b("VideoChatTab_VcTabDetailView", "[bindView]", "click refresh");
                C63242d.this.f159476b.mo218885a();
            }
        });
        m247718r();
        m247719s();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C60700b.m235851b("VideoChatTab_VcTabDetailView", "[destroy]", "destroy");
        this.f159460L.mo219096b();
        m247720t();
    }

    /* renamed from: l */
    public void mo218920l() {
        this.f159454F.setVisibility(0);
        this.f159455G.setVisibility(0);
        this.f159457I.setEnabled(false);
        this.f159458J.setVisibility(8);
        m247711a(true);
    }

    /* renamed from: u */
    private int m247721u() {
        int a = C60776r.m236139a();
        if (this.f175461ai && this.f159489o.getVisibility() == 0) {
            a -= UIHelper.dp2px((float) this.f159473Y);
        }
        if (!this.f175461ai && this.f159481g.getVisibility() == 0) {
            a -= UIHelper.dp2px((float) (this.f159473Y + this.aa));
        }
        return a - UIHelper.dp2px((float) this.f159473Y);
    }

    /* renamed from: w */
    private void m247723w() {
        this.f159495u.setBackground(C60773o.m236128f(R.drawable.tab_status_join_selector));
        this.f159496v.setTextColor(C60773o.m236126d(R.color.static_white));
        this.f159496v.setText(R.string.iconfont_icon_videocam_solid);
        this.f159497w.setTextColor(C60773o.m236126d(R.color.static_white));
        this.f159497w.setText(R.string.Lark_View_JoinButton);
        this.f159495u.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.AnonymousClass10 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ce.m250262a(C63242d.this.mo218878d());
                VcTabListEvent.m249757a(C63242d.this.f159475a.mo218822a(), "join_meeting", "vc_meeting_pre_view");
                VideoChatService.m249602d().openNormalJoinMeetingPage(C63242d.this.f159475a, "tab_meeting_detail_join", C63242d.this.f159466R, C63242d.this.f159465Q);
            }
        });
    }

    /* renamed from: k */
    public void mo218919k() {
        this.f159454F.setVisibility(0);
        this.f159455G.setVisibility(0);
        this.f159457I.setEnabled(true);
        this.f159458J.setVisibility(8);
        this.f159455G.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.C632577 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ce.m250272e();
                C63242d.this.mo218920l();
                C63242d.this.f159476b.mo218895j();
            }
        });
        m247711a(false);
    }

    /* renamed from: r */
    private void m247718r() {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f159478d.getLayoutParams();
        layoutParams.setMargins(UIHelper.dp2px((float) this.f159469U), UIHelper.dp2px((float) this.f159470V) + C60776r.m236148f(), this.f159471W, UIHelper.dp2px((float) this.f159472X));
        this.f159478d.setLayoutParams(layoutParams);
        if (DesktopUtil.m144307b()) {
            this.f159477c.setText(R.string.iconfont_icon_close);
        }
        this.f159477c.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.$$Lambda$d$qubeuhlnMmNNsEyarHPF3AmEZyg */

            public final void onClick(View view) {
                C63242d.lambda$qubeuhlnMmNNsEyarHPF3AmEZyg(C63242d.this, view);
            }
        });
    }

    /* renamed from: v */
    private void m247722v() {
        if (!this.f175461ai) {
            this.f159495u.setVisibility(8);
            return;
        }
        this.f159495u.setBackground(C60773o.m236128f(R.drawable.tab_status_locked));
        this.f159496v.setTextColor(C60773o.m236126d(R.color.text_disable));
        this.f159496v.setText(R.string.iconfont_icon_lock_outlined);
        this.f159497w.setTextColor(C60773o.m236126d(R.color.text_disable));
        this.f159497w.setText(R.string.Lark_View_Locked);
        this.f159495u.setOnClickListener(null);
    }

    /* renamed from: s */
    private void m247719s() {
        this.f159463O = new C63263a(this.f159475a, this.f159476b);
        this.f159499y.setLayoutManager(new LinearLayoutManager(this.f159475a, 1, false) {
            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.AnonymousClass12 */

            @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        this.f159499y.setAdapter(this.f159463O);
        ((SimpleItemAnimator) this.f159499y.getItemAnimator()).setSupportsChangeAnimations(false);
        C63271d dVar = new C63271d(this.f159475a, this.f159476b);
        this.ag = dVar;
        dVar.mo218964a(this.f159475a.mo218822a());
        this.f159451C.setLayoutManager(new LinearLayoutManager(this.f159475a, 1, false) {
            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.AnonymousClass23 */

            @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        this.f159451C.setAdapter(this.ag);
        ((SimpleItemAnimator) this.f159451C.getItemAnimator()).setSupportsChangeAnimations(false);
        C63268c cVar = new C63268c(this.f159475a, this.f159476b);
        this.ah = cVar;
        cVar.mo218958a(this.f159475a.mo218822a());
        this.f159453E.setLayoutManager(new LinearLayoutManager(this.f159475a, 1, false) {
            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.AnonymousClass26 */

            @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        this.f159453E.setAdapter(this.ah);
        ((SimpleItemAnimator) this.f159453E.getItemAnimator()).setSupportsChangeAnimations(false);
    }

    /* renamed from: q */
    private void m247717q() {
        this.f159477c = (IconFontView) this.ac.findViewById(R.id.go_back);
        this.f159478d = (RelativeLayout) this.ac.findViewById(R.id.go_back_container);
        this.f159479e = this.ac.findViewById(R.id.scroll_container);
        this.f159480f = this.ac.findViewById(R.id.single_info_container);
        this.f159481g = (ImageView) this.ac.findViewById(R.id.single_avatar);
        this.f159482h = (TextView) this.ac.findViewById(R.id.single_username);
        this.f159483i = (TextView) this.ac.findViewById(R.id.single_tag);
        this.f159484j = this.ac.findViewById(R.id.single_action_container);
        this.f159485k = (IconFontView) this.ac.findViewById(R.id.icon_chat);
        this.f159486l = (IconFontView) this.ac.findViewById(R.id.icon_audio_call);
        this.f159487m = (IconFontView) this.ac.findViewById(R.id.icon_video_call);
        this.f159488n = this.ac.findViewById(R.id.multi_info_container);
        this.f159489o = this.ac.findViewById(R.id.icon_calendar);
        this.f159490p = (TextView) this.ac.findViewById(R.id.meeting_title);
        this.f159491q = (TextView) this.ac.findViewById(R.id.meeting_tag);
        this.f159492r = (TextView) this.ac.findViewById(R.id.meeting_start_date);
        this.f159493s = (TextView) this.ac.findViewById(R.id.meeting_last_time);
        this.f159494t = (VcTabAvatarListView) this.ac.findViewById(R.id.meeting_avatar_list);
        this.f159495u = this.ac.findViewById(R.id.meeting_status_container);
        this.f159496v = (IconFontView) this.ac.findViewById(R.id.meeting_status_icon);
        this.f159497w = (TextView) this.ac.findViewById(R.id.meeting_status);
        this.f159498x = this.ac.findViewById(R.id.history_info_list_container);
        this.f159499y = (RecyclerView) this.ac.findViewById(R.id.history_list);
        this.f159500z = this.ac.findViewById(R.id.meeting_group_source_container);
        this.f159449A = this.ac.findViewById(R.id.meeting_record_list_container);
        this.f159450B = (TextView) this.ac.findViewById(R.id.meeting_record_title);
        this.f159451C = (RecyclerView) this.ac.findViewById(R.id.meeting_record_list);
        this.f159452D = this.ac.findViewById(R.id.magic_share_list_container);
        this.f159453E = (RecyclerView) this.ac.findViewById(R.id.magic_share_list);
        this.f159454F = this.ac.findViewById(R.id.meeting_statistics_info_container);
        this.f159455G = this.ac.findViewById(R.id.meeting_statistics_export_layout);
        this.f159456H = (LKUILottieAnimationView) this.ac.findViewById(R.id.meeting_statistics_export_loading_view);
        this.f159457I = (LineHeightTextView) this.ac.findViewById(R.id.meeting_statistics_export_btn);
        this.f159458J = this.ac.findViewById(R.id.meeting_statistics_docs_layout);
        this.f159459K = (LineHeightTextView) this.ac.findViewById(R.id.meeting_statistics_docs_title);
        this.f159460L = (PageLoadingView) this.ac.findViewById(R.id.page_loading);
        this.f159461M = (PageLoadErrorView) this.ac.findViewById(R.id.page_load_error);
        this.f159462N = this.ac.findViewById(R.id.bottom_bar);
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63234b
    /* renamed from: a */
    public void mo218862a() {
        this.f159460L.mo219095a();
        this.f159461M.mo219091b();
    }

    /* renamed from: a */
    public void setViewDelegate(C63230a.AbstractC63234b.AbstractC63235a aVar) {
        this.f159476b = aVar;
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63234b
    /* renamed from: c */
    public void mo218876c(final C63602e eVar) {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.AnonymousClass25 */

            public void run() {
                C60700b.m235851b("VideoChatTab_VcTabDetailView", "[onCreateVCTabMeetingStatisticsInfoError]", "create vc tab meeting statistics info failed" + eVar.toString());
                C63242d.this.mo218919k();
                C60738ac.m236024a(R.drawable.icon_no_support_link_error, R.string.View_G_CouldNotExportStatistics, 2000);
            }
        });
    }

    /* renamed from: d */
    public void mo218916d(final List<VCParticipantAbbrInfo> list) {
        if (list.size() > 0) {
            C60735ab.m236001a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.AnonymousClass29 */

                public void run() {
                    C63242d.this.f159494t.setVisibility(0);
                    C63242d.this.f159494t.mo208621a(C63242d.this.f159465Q, list);
                    C63242d.this.f159494t.setOnClickListener(new OnSingleClickListener() {
                        /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.AnonymousClass29.C632511 */

                        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                        public void onSingleClick(View view) {
                            if (!C60742af.m236059a(list) && list.size() > 1) {
                                ce.m250271d(C63242d.this.f159465Q);
                            }
                            C63315a.m248015a(C63242d.this.f159465Q, C63242d.this.mo218882h(), C63242d.this.f159466R, list);
                            C63242d.this.f159494t.setVisibility(0);
                        }
                    });
                }
            });
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m247706a(View view) {
        this.f159475a.finish();
        VcTabListEvent.m249756a(this.f159475a.mo218822a(), "close");
    }

    /* renamed from: b */
    private void m247712b(final long j) {
        if (this.am == null) {
            this.am = C60745ag.m236064a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.AnonymousClass27 */

                public void run() {
                    C63242d.this.mo218907a(j);
                }
            }, 1000, 1000);
        }
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63234b
    /* renamed from: c */
    public void mo218877c(final List<FollowAbbrInfo> list) {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.AnonymousClass21 */

            public void run() {
                C63242d.this.mo218918f(list);
                C63242d.this.mo218922n();
            }
        });
    }

    C63242d(VcTabDetailActivity vcTabDetailActivity) {
        this.f159475a = vcTabDetailActivity;
    }

    /* renamed from: c */
    private void m247714c(final VCTabStatisticsInfo eVar) {
        this.f159454F.setVisibility(0);
        this.f159455G.setVisibility(8);
        this.f159458J.setVisibility(0);
        this.f159459K.setText(eVar.mo210435c());
        this.f159458J.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.C632588 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ce.m250273f();
                VideoChatModule.getDependency().getDocsDependency().mo196378a(eVar.mo210434b(), C63242d.this.f159475a.getApplicationContext());
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63234b
    /* renamed from: b */
    public void mo218873b(C63602e eVar) {
        this.f159460L.mo219096b();
        this.f159461M.mo219090a();
    }

    /* renamed from: d */
    public void mo218915d(VCTabHistoryCommonInfo cVar) {
        if (!TextUtils.isEmpty(cVar.mo210415a())) {
            this.f159466R = cVar.mo210415a();
        }
        boolean z = true;
        if (this.f175461ai || cVar.mo210416b() != VideoChat.Type.MEET) {
            if (cVar.mo210416b() != VideoChat.Type.MEET) {
                z = false;
            }
            this.f175461ai = z;
        } else {
            this.f175461ai = true;
            this.f159463O.mo218948a();
        }
        this.f159468T = cVar.mo210418d();
        this.aj = cVar.mo210419e();
    }

    /* renamed from: f */
    public void mo218918f(List<FollowAbbrInfo> list) {
        if (list != null && list.size() != 0) {
            this.f159452D.setVisibility(0);
            this.f159453E.setMinimumHeight(UIHelper.dp2px((float) (list.size() * 66)));
            this.ah.mo218959a(list);
        }
    }

    /* renamed from: a */
    private void m247707a(final VCParamFromGroup vCParamFromGroup) {
        final String chat_id = vCParamFromGroup.getChat_id();
        if (TextUtils.isEmpty(chat_id)) {
            C60700b.m235851b("VideoChatTab_VcTabDetailView", "[processGroup]", "group id is empty.");
            return;
        }
        final String str = "/client/chat/open?chatId=" + chat_id;
        final LKUIRoundedImageView lKUIRoundedImageView = (LKUIRoundedImageView) this.f159500z.findViewById(R.id.group_cir_avatar);
        final LineHeightTextView lineHeightTextView = (LineHeightTextView) this.f159500z.findViewById(R.id.group_title);
        VideoChatModuleDependency.getChatDependency().getChatById(chat_id, new IGetDataCallback<OpenChat>() {
            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.C632555 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C60700b.m235851b("VideoChatTab_VcTabDetailView", "[getChatById2]", "error= " + errorResult.getErrorMsg());
            }

            /* renamed from: a */
            public void onSuccess(OpenChat openChat) {
                C60700b.m235851b("VideoChatTab_VcTabDetailView", "[getChatById]", "success");
                lineHeightTextView.setText(openChat.getName());
                C60783v.m236230a(openChat.getAvatarKey(), chat_id, ParticipantType.LARK_USER, lKUIRoundedImageView, 20, 20);
            }
        });
        this.f159500z.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.C632566 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C60700b.m235851b("VideoChatTab_VcTabDetailView", "[processGroup2]", "click to open group:" + vCParamFromGroup.getChat_id());
                ce.m250278k();
                C63242d.this.f159476b.mo218886a(C63242d.this.f159500z.getContext(), str);
            }
        });
    }

    /* renamed from: b */
    private void m247713b(final String str) {
        if (!this.f175461ai) {
            this.f159495u.setVisibility(8);
            return;
        }
        this.f159495u.setBackground(C60773o.m236128f(R.drawable.tab_status_waiting_selector));
        this.f159496v.setTextColor(C60773o.m236126d(R.color.primary_pri_500));
        this.f159496v.setText(R.string.iconfont_icon_videocam);
        this.f159497w.setTextColor(C60773o.m236126d(R.color.primary_pri_500));
        this.f159497w.setText(R.string.View_M_WaitingEllipsis);
        this.f159495u.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.AnonymousClass13 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C60700b.m235851b("VideoChatTab_VcTabDetailView", "[initWaiting]", "click go to waiting room");
                ce.m250269c(C63242d.this.mo218878d());
                C61303k kVar = (C61303k) MeetingManager.m238341a().getMeeting(str);
                if (kVar != null) {
                    ByteRTCMeetingActivity.m244042c(kVar);
                }
            }
        });
    }

    /* renamed from: c */
    public void mo218914c(VCTabHistoryCommonInfo cVar) {
        this.f159488n.setVisibility(8);
        this.f159480f.setVisibility(0);
        if (cVar.mo210418d() == MeetingStatus.MEETING_END) {
            this.ak = cVar.mo210425i();
            this.al = cVar.mo210426j();
        }
        UserInfoService.getUserInfoById(mo218878d(), this.f159464P, ParticipantType.LARK_USER, new GetUserInfoListener(cVar) {
            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.$$Lambda$d$d00FjoQXAOOJfkLg7GLPCZehqFk */
            public final /* synthetic */ VCTabHistoryCommonInfo f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.vc.net.service.GetUserInfoListener
            public final void onGetUserInfo(VideoChatUser videoChatUser) {
                C63242d.lambda$d00FjoQXAOOJfkLg7GLPCZehqFk(C63242d.this, this.f$1, videoChatUser);
            }
        });
        if (cVar.mo210418d() != MeetingStatus.MEETING_END) {
            this.f159484j.setVisibility(8);
            return;
        }
        this.f159484j.setVisibility(0);
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.RunnableC632442 */

            public void run() {
                C63242d.this.f159485k.setOnClickListener(new OnSingleClickListener() {
                    /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.RunnableC632442.C632451 */

                    @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                    public void onSingleClick(View view) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(C63242d.this.f159464P);
                        VideoChatModule.getDependency().getChatDependency().createP2PChats(arrayList, new IGetDataCallback<Map<String, ? extends OpenChat>>() {
                            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.RunnableC632442.C632451.C632461 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                            }

                            /* renamed from: a */
                            public void onSuccess(Map<String, ? extends OpenChat> map) {
                                if (map.values().size() == 1) {
                                    ce.m250265b();
                                    OpenChat[] openChatArr = new OpenChat[map.values().size()];
                                    map.values().toArray(openChatArr);
                                    VideoChatModule.getDependency().getChatDependency().openChatById(C63242d.this.f159475a, openChatArr[0].getId());
                                }
                            }
                        });
                        VcTabListEvent.m249757a(C63242d.this.f159475a.mo218822a(), "chat", "im_chat_main_view");
                    }
                });
                C63242d.this.f159486l.setOnClickListener(new OnSingleClickListener() {
                    /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.RunnableC632442.C632472 */

                    @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                    public void onSingleClick(View view) {
                        ce.m250268c();
                        VcTabListEvent.m249757a(C63242d.this.f159475a.mo218822a(), "voice_call", "vc_meeting_calling_view");
                        VideoChatModule.getVideoChatService().mo220075a(VideoChatModule.getDependency().getChatDependency().getChatterById(C63242d.this.f159464P), null, "user_profile", false, true, new IVideoChatService.AbstractC63626a() {
                            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.RunnableC632442.C632472.C632481 */

                            @Override // com.ss.android.vc.service.IVideoChatService.AbstractC63626a
                            public void onError(VCLaunchError vCLaunchError) {
                            }
                        });
                    }
                });
                C63242d.this.f159487m.setOnClickListener(new OnSingleClickListener() {
                    /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.RunnableC632442.C632493 */

                    @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                    public void onSingleClick(View view) {
                        ce.m250270d();
                        VideoChatModule.getVideoChatService().mo220075a(VideoChatModule.getDependency().getChatDependency().getChatterById(C63242d.this.f159464P), null, "user_profile", false, false, new IVideoChatService.AbstractC63626a() {
                            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.RunnableC632442.C632493.C632501 */

                            @Override // com.ss.android.vc.service.IVideoChatService.AbstractC63626a
                            public void onError(VCLaunchError vCLaunchError) {
                            }
                        });
                        VcTabListEvent.m249757a(C63242d.this.f159475a.mo218822a(), "video_call", "vc_meeting_calling_view");
                    }
                });
            }
        });
    }

    /* renamed from: e */
    public void mo218917e(List<HistoryInfo> list) {
        if (!(list == null || list.size() == 0)) {
            if (!this.f175461ai && this.f159468T == MeetingStatus.MEETING_END) {
                for (HistoryInfo historyInfo : list) {
                    if (historyInfo.getCallStatus() == HistoryInfo.CallStatus.ACCEPTED) {
                        historyInfo.setLeaveTime(this.al);
                        historyInfo.setCallStarTime(this.ak);
                    }
                }
            }
            this.f159498x.setVisibility(0);
            this.f159463O.mo218951a(list);
        }
    }

    /* renamed from: a */
    private void m247710a(final String str) {
        this.f159495u.setBackground(C60773o.m236128f(R.drawable.tab_status_onthecall_selector));
        this.f159496v.setTextColor(C60773o.m236126d(R.color.primary_pri_500));
        this.f159496v.setText(R.string.iconfont_icon_videocam);
        this.f159497w.setTextColor(C60773o.m236126d(R.color.primary_pri_500));
        this.f159497w.setText(R.string.Lark_View_JoinedButton);
        this.f159495u.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.AnonymousClass11 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C60700b.m235851b("VideoChatTab_VcTabDetailView", "[initJoined]", "click go to onthecall");
                ce.m250266b(C63242d.this.mo218878d());
                C61303k kVar = (C61303k) MeetingManager.m238341a().getMeeting(str);
                if (kVar != null) {
                    ByteRTCMeetingActivity.m244042c(kVar);
                }
            }
        });
    }

    /* renamed from: b */
    public void mo218910b(VCMeetingJoinInfoEntity vCMeetingJoinInfoEntity) {
        if (this.f159468T == MeetingStatus.MEETING_END) {
            this.f159495u.setVisibility(8);
            m247720t();
        } else if (vCMeetingJoinInfoEntity == null || vCMeetingJoinInfoEntity.joinInfo == null || vCMeetingJoinInfoEntity.joinInfo.getJoinStatus() == VCTabMeetingJoinInfo.JoinStatus.UNKNOWN || !TextUtils.equals(this.f159465Q, vCMeetingJoinInfoEntity.joinInfo.getMeetingId())) {
            C60700b.m235851b("VideoChatTab_VcTabDetailView", "[initMeetingStatus2]", "empty info, got to join meeting");
            this.f159495u.setVisibility(0);
            if (this.aj) {
                m247722v();
            } else {
                m247723w();
            }
        } else {
            this.f159495u.setVisibility(0);
            VCTabMeetingJoinInfo vCTabMeetingJoinInfo = vCMeetingJoinInfoEntity.joinInfo;
            if (vCTabMeetingJoinInfo.getJoinStatus() == VCTabMeetingJoinInfo.JoinStatus.JOINED) {
                m247710a(vCTabMeetingJoinInfo.getMeetingId());
            } else if (vCTabMeetingJoinInfo.getJoinStatus() == VCTabMeetingJoinInfo.JoinStatus.WAITING) {
                m247713b(vCTabMeetingJoinInfo.getMeetingId());
            } else if (this.aj) {
                m247722v();
            } else if (vCTabMeetingJoinInfo.getJoinStatus() == VCTabMeetingJoinInfo.JoinStatus.JOINABLE) {
                m247723w();
            } else if (vCTabMeetingJoinInfo.getJoinStatus() == VCTabMeetingJoinInfo.JoinStatus.END) {
                this.f159495u.setVisibility(8);
                m247720t();
            }
        }
    }

    /* renamed from: a */
    private void m247711a(boolean z) {
        if (z) {
            this.f159456H.setVisibility(0);
            this.f159456H.playAnimation();
            return;
        }
        if (this.f159456H.isAnimating()) {
            this.f159456H.cancelAnimation();
        }
        this.f159456H.setVisibility(8);
    }

    /* renamed from: b */
    public void mo218911b(VCTabRecordInfo vCTabRecordInfo) {
        if (vCTabRecordInfo != null) {
            if (vCTabRecordInfo.getRecordType() == VCTabRecordInfo.RecordType.LARK_MINUTES) {
                this.f159450B.setText(UIHelper.getString(R.string.View_SA_RecordingFileFeishuMinutes_Text));
            } else {
                this.f159450B.setText(UIHelper.getString(R.string.View_G_RecordingFile));
            }
            this.f159449A.setVisibility(0);
            this.f159451C.setMinimumHeight(UIHelper.dp2px((float) (Math.max(vCTabRecordInfo.getUrlList().size(), 1) * 66)));
            this.ag.mo218962a(vCTabRecordInfo);
        }
    }

    /* renamed from: b */
    public void mo218912b(VCTabHistoryCommonInfo cVar) {
        String str;
        this.f159480f.setVisibility(8);
        boolean z = false;
        this.f159488n.setVisibility(0);
        String a = cVar.mo210415a();
        if (!TextUtils.isEmpty(a) && cVar.mo210417c() == VideoChat.MeetingSource.VC_FROM_INTERVIEW) {
            HashMap hashMap = new HashMap();
            hashMap.put("name", a);
            a = UIHelper.mustacheFormat(UIHelper.getString(R.string.View_M_VideoInterviewNameBraces), hashMap);
        }
        if (cVar.mo210417c() == VideoChat.MeetingSource.VC_FROM_CALENDAR || cVar.mo210417c() == VideoChat.MeetingSource.VC_FROM_INTERVIEW) {
            this.f159489o.setVisibility(0);
        }
        String d = VideoChatModuleDependency.m236631d();
        if (!TextUtils.isEmpty(d) && !TextUtils.equals(d, "-1") && VideoChatModuleDependency.m236632e() && !VideoChatModuleDependency.getLoginDependency().mo196421c() && (cVar.mo210421f() || (!TextUtils.isEmpty(cVar.mo210423h()) && !TextUtils.equals(d, cVar.mo210423h())))) {
            z = true;
        }
        TextView textView = this.f159490p;
        if (TextUtils.isEmpty(a)) {
            str = UIHelper.getString(R.string.View_G_ServerNoTitle);
        } else {
            str = mo218906a(a, z);
        }
        textView.setText(str);
        if (z) {
            this.f159490p.append(SpanUtil.f160471a.mo219676e());
            this.f159490p.append(SpanUtil.f160471a.mo219673b());
        }
        boolean is24Hour = VideoChatModuleDependency.getSettingDependency().is24Hour();
        TextView textView2 = this.f159492r;
        textView2.setText(C63327d.m248054b(cVar.mo210425i(), TimeZone.getDefault()) + " " + C63327d.m248052a(cVar.mo210425i(), is24Hour, TimeZone.getDefault()));
        if (cVar.mo210418d() == MeetingStatus.MEETING_END && cVar.mo210426j() - cVar.mo210425i() >= 0) {
            this.f159493s.setText(C63327d.m248053b(cVar.mo210426j() - cVar.mo210425i()));
        } else if (cVar.mo210418d() == MeetingStatus.MEETING_ON_THE_CALL && System.currentTimeMillis() - cVar.mo210425i() >= 0) {
            long currentTimeMillis = (System.currentTimeMillis() / 1000) - cVar.mo210425i();
            m247712b(cVar.mo210425i());
            this.f159493s.setText(C63327d.m248050a(currentTimeMillis));
        }
    }

    /* renamed from: b */
    public void mo218913b(VCTabStatisticsInfo eVar) {
        if (eVar != null) {
            if (!C63634c.m249496b("lark.client.vctab.statistics")) {
                this.f159454F.setVisibility(8);
                return;
            }
            int a = eVar.mo210433a();
            if (a == 1) {
                mo218919k();
            } else if (a == 2) {
                mo218920l();
            } else if (a == 3) {
                m247714c(eVar);
            } else if (a != 4) {
                this.f159454F.setVisibility(8);
            } else {
                if (this.f159456H.getVisibility() == 0) {
                    C60738ac.m236024a(R.drawable.icon_no_support_link_error, R.string.View_G_CouldNotExportStatistics, 2000);
                }
                mo218919k();
            }
        }
    }

    /* renamed from: a */
    public void mo218907a(final long j) {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.AnonymousClass28 */

            public void run() {
                C63242d.this.f159493s.setText(C63327d.m248050a((System.currentTimeMillis() / 1000) - j));
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63234b
    /* renamed from: b */
    public void mo218874b(final List<HistoryInfo> list) {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.AnonymousClass20 */

            public void run() {
                C63242d.this.mo218917e(list);
                C63242d.this.mo218922n();
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m247708a(VCTabHistoryCommonInfo cVar, final VideoChatUser videoChatUser) {
        C60783v.m236230a(videoChatUser.getAvatarKey(), videoChatUser.getId(), ParticipantType.valueOf(videoChatUser.getType().getNumber()), this.f159481g, 32, 32);
        this.f159481g.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.AnonymousClass31 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ce.m250276i();
                ArrayList arrayList = new ArrayList();
                arrayList.add(C63242d.this.f159464P);
                VideoChatModule.getDependency().getChatDependency().createP2PChats(arrayList, new IGetDataCallback<Map<String, ? extends OpenChat>>() {
                    /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.AnonymousClass31.C632531 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                    }

                    /* renamed from: a */
                    public void onSuccess(Map<String, ? extends OpenChat> map) {
                        if (map.values().size() == 1) {
                            OpenChat[] openChatArr = new OpenChat[map.values().size()];
                            map.values().toArray(openChatArr);
                            VideoChatModuleDependency.getDependency().startContactsProfileActivityByChatterId(C63242d.this.f159475a, videoChatUser.getId(), openChatArr[0].getId());
                        }
                    }
                });
            }
        });
        m247709a(cVar, this.f159464P, videoChatUser.getName());
    }

    /* renamed from: a */
    public String mo218906a(final String str, boolean z) {
        int i;
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        TextPaint paint = this.f159490p.getPaint();
        int u = m247721u();
        float f = BitmapDescriptorFactory.HUE_RED;
        if (z) {
            f = this.f159491q.getPaint().measureText(UIHelper.getString(R.string.View_G_ExternalLabel)) + ((float) UIHelper.dp2px((float) this.f159474Z));
        }
        float f2 = (float) u;
        if (paint.measureText(str) < f2) {
            return str;
        }
        int i2 = 0;
        int i3 = 1;
        for (int i4 = 0; i4 < 4; i4++) {
            if (i4 == 3) {
                i = (int) (f2 - (paint.measureText("...") + f));
            } else {
                i = u;
            }
            while (true) {
                if (i3 >= str.length()) {
                    break;
                } else if (paint.measureText(str, i2, i3) > ((float) i)) {
                    i3--;
                    if (i4 < 3) {
                        sb.append(str.substring(i2, i3) + "\n");
                        i2 = i3;
                    }
                } else {
                    i3++;
                }
            }
        }
        sb.append(str.substring(i2, i3));
        if (i3 == str.length()) {
            return sb.toString();
        }
        this.f159490p.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.AnonymousClass30 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ((C63267b) C63267b.m247795a(C63242d.this.f159475a, str).mo219699g()).mo211397b();
            }
        });
        return ((Object) sb) + "...";
    }

    /* renamed from: a */
    private void m247709a(final VCTabHistoryCommonInfo cVar, String str, final String str2) {
        UserInfoService.getTabTenant(str, new AbstractC63598b<av>() {
            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63242d.C632523 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C63242d.this.f159482h.setText(C63242d.this.mo218906a(str2, false));
            }

            /* renamed from: a */
            public void onSuccess(av avVar) {
                String d = VideoChatModuleDependency.m236631d();
                boolean z = false;
                if (!TextUtils.isEmpty(d) && !TextUtils.equals(d, "-1") && VideoChatModuleDependency.m236632e() && !VideoChatModuleDependency.getLoginDependency().mo196421c() && !TextUtils.equals(d, avVar.mo210118b()) && cVar.mo210421f() && !TextUtils.isEmpty(cVar.mo210423h()) && !TextUtils.equals(d, avVar.mo210118b())) {
                    z = true;
                }
                C63242d.this.f159482h.setText(C63242d.this.mo218906a(str2, z));
                if (z) {
                    C63242d.this.f159482h.append(SpanUtil.f160471a.mo219676e());
                    C63242d.this.f159482h.append(SpanUtil.f160471a.mo219673b());
                }
            }
        });
    }
}
