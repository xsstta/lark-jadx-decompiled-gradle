package com.ss.android.vc.meeting.module.tab3.detail.p3172a;

import android.content.DialogInterface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.imageview.LKUILottieAnimationView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.component.universe_design.dialog.UDBaseListDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.export.entity.chat.OpenChat;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60733aa;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60742af;
import com.ss.android.vc.common.p3083e.C60745ag;
import com.ss.android.vc.common.p3083e.C60754h;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.common.widget.LineHeightTextView;
import com.ss.android.vc.common.widget.avatarlist.VcTabAvatarListView;
import com.ss.android.vc.common.widget.tag.ExternalTag;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.dto.VCLaunchError;
import com.ss.android.vc.entity.AdminSettings;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.MeetingStatus;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.VCParticipantAbbrInfo;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.response.av;
import com.ss.android.vc.entity.tab.AccessInfos;
import com.ss.android.vc.entity.tab.FollowAbbrInfo;
import com.ss.android.vc.entity.tab.HistoryInfo;
import com.ss.android.vc.entity.tab.VCMeetingJoinInfoEntity;
import com.ss.android.vc.entity.tab.VCParamFromCalendar;
import com.ss.android.vc.entity.tab.VCParamFromGroup;
import com.ss.android.vc.entity.tab.VCTabHistoryCommonInfo;
import com.ss.android.vc.entity.tab.VCTabListItem;
import com.ss.android.vc.entity.tab.VCTabMeetingJoinInfo;
import com.ss.android.vc.entity.tab.VCTabMeetingSourceAppLinkInfo;
import com.ss.android.vc.entity.tab.VCTabRecordInfo;
import com.ss.android.vc.entity.tab.VCTabStatisticsInfo;
import com.ss.android.vc.entity.tab.VcTabDetailBasicInfo;
import com.ss.android.vc.entity.tab.VcTabDetailInfo;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.meetingdialog.pstn.country.C62413e;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.share.C62955c;
import com.ss.android.vc.meeting.module.share.p3163d.C62965c;
import com.ss.android.vc.meeting.module.tab.detail.p3170b.C63267b;
import com.ss.android.vc.meeting.module.tab3.detail.VcTab3DetailActivity;
import com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a;
import com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b;
import com.ss.android.vc.meeting.module.tab3.detail.p3173b.C63359a;
import com.ss.android.vc.meeting.module.tab3.detail.p3173b.C63363b;
import com.ss.android.vc.meeting.module.tab3.detail.p3173b.C63366c;
import com.ss.android.vc.meeting.module.tab3.widgets.PageErrorView;
import com.ss.android.vc.meeting.module.tab3.widgets.PageLoadingView;
import com.ss.android.vc.meeting.module.tab3.widgets.p3178a.C63438a;
import com.ss.android.vc.meeting.module.tab3.widgets.utils.DateTimeUtils;
import com.ss.android.vc.meeting.utils.C63497j;
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
import com.ss.android.vc.statistics.event.C63767p;
import com.ss.android.vc.statistics.event.ce;
import com.ss.android.vc.statistics.event2.VCTabEvent3;
import com.ss.android.vc.statistics.event2.VcTabListEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.vc.meeting.module.tab3.detail.a.b */
public class C63334b implements C63328a.AbstractC63332b {

    /* renamed from: A */
    TextView f159790A;

    /* renamed from: B */
    View f159791B;

    /* renamed from: C */
    View f159792C;

    /* renamed from: D */
    RecyclerView f159793D;

    /* renamed from: E */
    View f159794E;

    /* renamed from: F */
    TextView f159795F;

    /* renamed from: G */
    RecyclerView f159796G;

    /* renamed from: H */
    View f159797H;

    /* renamed from: I */
    RecyclerView f159798I;

    /* renamed from: J */
    View f159799J;

    /* renamed from: K */
    View f159800K;

    /* renamed from: L */
    LKUILottieAnimationView f159801L;

    /* renamed from: M */
    LineHeightTextView f159802M;

    /* renamed from: N */
    View f159803N;

    /* renamed from: O */
    LineHeightTextView f159804O;

    /* renamed from: P */
    View f159805P;

    /* renamed from: Q */
    PageLoadingView f159806Q;

    /* renamed from: R */
    PageErrorView f159807R;

    /* renamed from: S */
    public C63359a f159808S;

    /* renamed from: T */
    public boolean f159809T;

    /* renamed from: U */
    public boolean f159810U;

    /* renamed from: V */
    public String f159811V;

    /* renamed from: W */
    public String f159812W;

    /* renamed from: X */
    public String f159813X;

    /* renamed from: Y */
    public String f159814Y;

    /* renamed from: Z */
    public ByteviewUser f159815Z;

    /* renamed from: a */
    public final VcTab3DetailActivity f159816a;
    public MeetingStatus aa;
    public VideoChat.MeetingSource ab;
    int ac = 32;
    int ad = 20;
    int ae = 8;
    int af = LocationRequest.PRIORITY_HD_ACCURACY;
    private View ag;
    private final int ah = 4;

    /* renamed from: ai */
    private final int f175462ai = 76;
    private final int aj = 32;
    private final int ak = 1000;
    private C63366c al;
    private C63363b am;
    private C60745ag.C60746a an;

    /* renamed from: b */
    public C63328a.AbstractC63332b.AbstractC63333a f159817b;

    /* renamed from: c */
    IconFontView f159818c;

    /* renamed from: d */
    IconFontView f159819d;

    /* renamed from: e */
    View f159820e;

    /* renamed from: f */
    View f159821f;

    /* renamed from: g */
    TextView f159822g;

    /* renamed from: h */
    ExternalTag f159823h;

    /* renamed from: i */
    View f159824i;

    /* renamed from: j */
    TextView f159825j;

    /* renamed from: k */
    View f159826k;

    /* renamed from: l */
    View f159827l;

    /* renamed from: m */
    VcTabAvatarListView f159828m;

    /* renamed from: n */
    View f159829n;

    /* renamed from: o */
    View f159830o;

    /* renamed from: p */
    ImageView f159831p;

    /* renamed from: q */
    TextView f159832q;

    /* renamed from: r */
    View f159833r;

    /* renamed from: s */
    View f159834s;

    /* renamed from: t */
    View f159835t;

    /* renamed from: u */
    View f159836u;

    /* renamed from: v */
    View f159837v;

    /* renamed from: w */
    View f159838w;

    /* renamed from: x */
    View f159839x;

    /* renamed from: y */
    View f159840y;

    /* renamed from: z */
    TextView f159841z;

    /* renamed from: a */
    public static /* synthetic */ void m248121a(VCLaunchError vCLaunchError) {
    }

    /* renamed from: a */
    private static boolean m248127a(char c) {
        return (c == 0 || c == '\t' || c == '\n' || c == '\r' || (c >= ' ' && c <= 55295) || ((c >= 57344 && c <= 65533) || (c >= 0 && c <= 65535))) ? false : true;
    }

    @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63332b
    /* renamed from: a */
    public void mo219186a(C63328a.AbstractC63329a aVar) {
    }

    @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63332b
    /* renamed from: c */
    public MeetingStatus mo219193c() {
        return this.aa;
    }

    /* renamed from: k */
    public String mo219226k() {
        return this.f159813X;
    }

    /* renamed from: l */
    public ByteviewUser mo219227l() {
        return this.f159815Z;
    }

    /* renamed from: b */
    public void mo219214b(VCTabHistoryCommonInfo cVar) {
        String str;
        this.f159830o.setVisibility(8);
        this.f159821f.setVisibility(0);
        String a = cVar.mo210415a();
        if (TextUtils.isEmpty(a) && cVar.mo210417c() == VideoChat.MeetingSource.VC_FROM_INTERVIEW) {
            HashMap hashMap = new HashMap();
            hashMap.put("name", a);
            a = UIHelper.mustacheFormat(UIHelper.getString(R.string.View_M_VideoInterviewNameBraces), hashMap);
        }
        boolean a2 = m248128a(cVar.mo210421f(), cVar.mo210423h());
        TextView textView = this.f159822g;
        if (TextUtils.isEmpty(a)) {
            str = UIHelper.getString(R.string.View_G_ServerNoTitle);
        } else {
            str = mo219206a(a, false, a2);
        }
        textView.setText(str);
        if (a2) {
            this.f159822g.append(SpanUtil.f160471a.mo219675d());
            this.f159822g.append(SpanUtil.f160471a.mo219673b());
        }
        m248122a(cVar.mo210418d(), cVar.mo210425i(), cVar.mo210426j());
    }

    /* renamed from: a */
    public void mo219209a(final VcTabDetailBasicInfo fVar, boolean z) {
        if (fVar != null) {
            if (z) {
                this.f159827l.setVisibility(8);
                if (!TextUtils.isEmpty(fVar.mo210441a())) {
                    this.f159826k.setVisibility(0);
                    TextView textView = (TextView) this.f159826k.findViewById(R.id.meeting_id_tv);
                    textView.setText(C60773o.m236119a((int) R.string.Lark_View_MeetingIdColon));
                    textView.setVisibility(0);
                    textView.append(C60754h.m236085a(fVar.mo210441a()));
                } else {
                    this.f159826k.setVisibility(8);
                }
            } else {
                this.f159826k.setVisibility(8);
                if (!TextUtils.isEmpty(fVar.mo210441a())) {
                    this.f159827l.setVisibility(0);
                    TextView textView2 = (TextView) this.f159827l.findViewById(R.id.meeting_id_tv);
                    textView2.setText(C60773o.m236119a((int) R.string.Lark_View_MeetingIdColon));
                    textView2.setVisibility(0);
                    textView2.append(C60754h.m236085a(fVar.mo210441a()));
                } else {
                    this.f159827l.setVisibility(8);
                }
            }
            if (!TextUtils.isEmpty(fVar.mo210444d())) {
                this.f159824i.setVisibility(0);
                this.f159825j.setVisibility(0);
                this.f159825j.setText(VideoChatModuleDependency.getDependency().getCalendarDependency().rRuleToRecurrence(fVar.mo210444d()));
            } else {
                this.f159824i.setVisibility(8);
            }
            if (fVar.mo210443c() == null) {
                this.f159790A.setVisibility(8);
                return;
            }
            final AdminSettings adminSettings = new AdminSettings();
            AccessInfos c = fVar.mo210443c();
            if (c.mo210403a() != null && c.mo210403a().mo210409a().booleanValue()) {
                adminSettings.pstnIncomingCallCountryDefault = c.mo210403a().mo210410b();
                adminSettings.pstnIncomingCallPhoneList = c.mo210403a().mo210411c();
            }
            this.f159790A.setVisibility(0);
            this.f159790A.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.AnonymousClass34 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    VCTabEvent3.f160816b.mo220248a("copy_invite_link", "vc_tab_popup_view", C63334b.this.f159813X, C63334b.this.aa, C63334b.this.f159809T);
                    UserInfoService.getChatterById(VideoChatModuleDependency.m236630c(), new GetUserInfoListener() {
                        /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.AnonymousClass34.C633391 */

                        @Override // com.ss.android.vc.net.service.GetUserInfoListener
                        public void onGetUserInfo(VideoChatUser videoChatUser) {
                            if (videoChatUser != null) {
                                C60733aa.m235987a(fVar.mo210441a(), C63334b.this.f159814Y, videoChatUser.getName(), fVar.mo210442b(), adminSettings, C62413e.m243942a().mo215805b(ar.m236694a()), fVar.mo210443c().mo210404b().getDomain(), fVar.mo210443c().mo210405c(), true);
                            }
                        }
                    });
                }
            });
            this.f159819d.setVisibility(0);
            this.f159819d.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.AnonymousClass35 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    if (C63334b.this.f159810U) {
                        C60700b.m235851b("VideoChatTab_VcTabDetailView", "[onClick2]", "meeting is locked, can not share");
                        C60738ac.m236037c((int) R.string.View_M_MeetingLocked);
                        return;
                    }
                    VCTabEvent3.f160816b.mo220248a("share", "public_share_view", C63334b.this.f159813X, C63334b.this.aa, C63334b.this.f159809T);
                    C62965c.m246557a(C63334b.this.f159816a, C63334b.this.f159813X, C63334b.this.ab, new C62955c(C63334b.this.f159813X, VideoChat.VendorType.RTC.getNumber())).mo211606a();
                }
            });
        }
    }

    /* renamed from: a */
    public void mo219207a(final long j) {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.AnonymousClass38 */

            public void run() {
                long a = DateTimeUtils.m248532a() / 1000;
                if (C63334b.this.f159809T) {
                    ((TextView) C63334b.this.f159821f.findViewById(R.id.meeting_countdown_tv)).setText(DateTimeUtils.m248539c(a - j));
                } else {
                    ((TextView) C63334b.this.f159830o.findViewById(R.id.meeting_countdown_tv)).setText(DateTimeUtils.m248539c(a - j));
                }
            }
        });
    }

    /* renamed from: a */
    public String mo219206a(final String str, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        TextPaint paint = this.f159822g.getPaint();
        int a = m248119a(z);
        float f = BitmapDescriptorFactory.HUE_RED;
        if (z2) {
            f = ((float) UIHelper.dp2px((float) this.ad)) + this.f159823h.getPaint().measureText(UIHelper.getString(R.string.View_G_ExternalLabel));
        }
        float f2 = (float) a;
        if (paint.measureText(str) < f2) {
            return str;
        }
        int length = str.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < 4) {
            int measureText = i == 3 ? (int) (f2 - (paint.measureText("...") + f)) : a;
            boolean z3 = i2 < length && m248127a(str.charAt(i2));
            while (true) {
                if (i3 >= str.length()) {
                    break;
                } else if (paint.measureText(str, i2, i3) > ((float) measureText)) {
                    i3--;
                    int i4 = i3 - 1;
                    if (i4 >= 0 && i3 < length && (m248127a(str.charAt(i4)) ^ m248127a(str.charAt(i3)))) {
                        z3 = !z3;
                    }
                    if (z3) {
                        i3--;
                    }
                    if (i < 3 && i2 >= 0 && i2 < i3 && i3 <= length - 1) {
                        sb.append(str.substring(i2, i3) + "\n");
                        i2 = i3;
                    }
                } else {
                    i3++;
                    if (i3 < length && m248127a(str.charAt(i3))) {
                        z3 = !z3;
                    }
                }
            }
            i++;
        }
        sb.append(str.substring(i2, i3));
        if (i3 == str.length()) {
            return sb.toString();
        }
        this.f159822g.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.C633362 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ((C63267b) C63267b.m247795a(C63334b.this.f159816a, str).mo219699g()).mo211397b();
            }
        });
        return ((Object) sb) + "...";
    }

    /* renamed from: a */
    public void mo219211a(String str, VCTabHistoryCommonInfo cVar) {
        this.f159821f.setVisibility(8);
        this.f159830o.setVisibility(0);
        if (cVar.mo210418d() == MeetingStatus.MEETING_END) {
            this.f159808S.mo219264a(cVar.mo210426j() - cVar.mo210425i());
            this.f159834s.setVisibility(8);
        } else {
            this.f159834s.setVisibility(0);
            m248130b(cVar.mo210418d(), cVar.mo210425i(), cVar.mo210426j());
        }
        m248133b(str, cVar);
        if (cVar.mo210418d() == MeetingStatus.MEETING_END) {
            this.f159835t.setVisibility(0);
            this.f159836u.setVisibility(8);
            m248132b(str);
            m248137c(str);
            m248138d(str);
            return;
        }
        this.f159835t.setVisibility(8);
        this.f159836u.setVisibility(0);
    }

    /* renamed from: a */
    public void mo219208a(VCTabMeetingSourceAppLinkInfo vCTabMeetingSourceAppLinkInfo) {
        if (vCTabMeetingSourceAppLinkInfo == null || vCTabMeetingSourceAppLinkInfo.getType() == VCTabMeetingSourceAppLinkInfo.Type.UNKNOWN) {
            this.f159791B.setVisibility(8);
            this.f159829n.setVisibility(8);
            return;
        }
        VCTabMeetingSourceAppLinkInfo.Type type = vCTabMeetingSourceAppLinkInfo.getType();
        if (type == VCTabMeetingSourceAppLinkInfo.Type.GROUP) {
            this.f159791B.setVisibility(0);
            this.f159829n.setVisibility(8);
            m248123a(vCTabMeetingSourceAppLinkInfo.getParamFromGroup());
        } else if (type == VCTabMeetingSourceAppLinkInfo.Type.CALENDAR) {
            this.f159791B.setVisibility(8);
            this.f159829n.setVisibility(0);
            VCParamFromCalendar paramFromCalendar = vCTabMeetingSourceAppLinkInfo.getParamFromCalendar();
            final String str = "/client/calendar/event/detail?calendarId=" + paramFromCalendar.getCalendar_id() + "&key=" + paramFromCalendar.getKey() + "&originalTime=" + paramFromCalendar.getOriginal_time() + "&startTime=" + paramFromCalendar.getStart_time();
            this.f159829n.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.AnonymousClass10 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    C60700b.m235851b("VideoChatTab_VcTabDetailView", "[onClick3]", "click to open calendar: " + str);
                    ce.m250277j();
                    VCTabEvent3.f160816b.mo220248a("detail_in_cal", "cal_event_detail_view", C63334b.this.f159813X, C63334b.this.aa, C63334b.this.f159809T);
                    C63334b.this.f159817b.mo219198a(C63334b.this.f159816a, str);
                }
            });
        }
    }

    /* renamed from: b */
    public void mo219215b(VCTabStatisticsInfo eVar) {
        if (eVar != null) {
            if (!C63634c.m249496b("lark.client.vctab.statistics")) {
                this.f159799J.setVisibility(8);
                return;
            }
            int a = eVar.mo210433a();
            if (a == 1) {
                mo219220f();
            } else if (a == 2) {
                mo219222g();
            } else if (a == 3) {
                m248136c(eVar);
            } else if (a != 4) {
                this.f159799J.setVisibility(8);
            } else {
                if (this.f159801L.getVisibility() == 0) {
                    C60738ac.m236024a(R.drawable.icon_no_support_link_error, R.string.View_G_CouldNotExportStatistics, 2000);
                }
                mo219220f();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63332b
    /* renamed from: a */
    public void mo219179a() {
        C60700b.m235851b("VideoChatTab_VcTabDetailView", "[showLoadingView]", "start");
        this.f159806Q.mo219453a(R.color.ud_N50);
        this.f159807R.mo219446a();
    }

    @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63332b
    /* renamed from: a */
    public void mo219187a(C63602e eVar) {
        C60700b.m235851b("VideoChatTab_VcTabDetailView", "[showErrorResultView]", "errorResult: " + eVar);
        this.f159806Q.mo219452a();
        this.f159807R.mo219447a(R.color.ud_N50);
    }

    @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63332b
    /* renamed from: b */
    public void mo219191b(C63602e eVar) {
        this.f159806Q.mo219452a();
        this.f159807R.mo219447a(R.color.ud_N50);
    }

    @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63332b
    /* renamed from: a */
    public void mo219183a(final VcTabDetailInfo vcTabDetailInfo, final VcTabDetailBasicInfo fVar) {
        C60700b.m235851b("VideoChatTab_VcTabDetailView", "[showSuccessResultView]", "start");
        this.f159807R.mo219446a();
        this.f159806Q.mo219452a();
        if (vcTabDetailInfo != null) {
            C60735ab.m236001a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.AnonymousClass22 */

                public void run() {
                    if (!(vcTabDetailInfo.getMeetingBaseInfo() == null || vcTabDetailInfo.getMeetingBaseInfo().getHistoryCommonInfo() == null)) {
                        C63334b.this.mo219216c(vcTabDetailInfo.getMeetingBaseInfo().getHistoryCommonInfo());
                    }
                    if (!TextUtils.isEmpty(vcTabDetailInfo.getMeetingId())) {
                        C63334b.this.f159813X = vcTabDetailInfo.getMeetingId();
                    }
                    C63334b.this.mo219225j();
                    if (vcTabDetailInfo.getMeetingBaseInfo().getSponsorUser() != null) {
                        C63334b.this.f159815Z = vcTabDetailInfo.getMeetingBaseInfo().getSponsorUser();
                    }
                    if (C63334b.this.f159817b.mo219203e() == VCTabListItem.PhoneType.VC) {
                        if (vcTabDetailInfo.getMeetingBaseInfo().getHistoryCommonInfo().mo210416b() == VideoChat.Type.MEET) {
                            C63334b.this.mo219214b(vcTabDetailInfo.getMeetingBaseInfo().getHistoryCommonInfo());
                            C63334b.this.mo219209a(fVar, true);
                            if (!(vcTabDetailInfo.getMeetingBaseInfo() == null || vcTabDetailInfo.getMeetingBaseInfo().getParticipants() == null)) {
                                C63334b.this.mo219217d(vcTabDetailInfo.getMeetingBaseInfo().getParticipants());
                            }
                        } else if (vcTabDetailInfo.getMeetingBaseInfo().getHistoryCommonInfo().mo210416b() == VideoChat.Type.CALL) {
                            C63334b bVar = C63334b.this;
                            bVar.f159811V = bVar.f159817b.mo219201c();
                            C63334b bVar2 = C63334b.this;
                            bVar2.f159812W = bVar2.f159817b.mo219202d();
                            C63334b bVar3 = C63334b.this;
                            bVar3.mo219211a(bVar3.f159811V, vcTabDetailInfo.getMeetingBaseInfo().getHistoryCommonInfo());
                            C63334b.this.mo219209a(fVar, false);
                        }
                    } else if (C63334b.this.f159817b.mo219203e() == VCTabListItem.PhoneType.OUTSIDE_ENTERPRISE_PHONE) {
                        C63334b bVar4 = C63334b.this;
                        bVar4.f159811V = bVar4.f159817b.mo219201c();
                        C63334b bVar5 = C63334b.this;
                        bVar5.f159812W = bVar5.f159817b.mo219202d();
                        C63334b bVar6 = C63334b.this;
                        bVar6.mo219211a(bVar6.f159811V, vcTabDetailInfo.getMeetingBaseInfo().getHistoryCommonInfo());
                        C63334b.this.mo219209a(fVar, false);
                    }
                    if (vcTabDetailInfo.getMeetingBaseInfo() != null && vcTabDetailInfo.getMeetingBaseInfo().getHistoryCommonInfo() != null && vcTabDetailInfo.getMeetingBaseInfo().getHistoryCommonInfo().mo210418d() == MeetingStatus.MEETING_END && vcTabDetailInfo.getMeetingBaseInfo().getHistoryCommonInfo().mo210422g()) {
                        C63334b.this.mo219213b(vcTabDetailInfo.getMeetingUserSpecInfo().getRecordInfo());
                    }
                    C63334b.this.mo219223h();
                    C63334b.this.mo219208a(vcTabDetailInfo.getMeetingUserSpecInfo().getAppLinkInfo());
                    C63334b.this.mo219219e(vcTabDetailInfo.getMeetingUserSpecInfo().getHistoryInfos());
                    C63334b.this.mo219221f(vcTabDetailInfo.getMeetingUserSpecInfo().getFollowInfo());
                    C63334b.this.mo219215b(vcTabDetailInfo.getMeetingUserSpecInfo().getStatisticsInfo());
                    C63334b.this.mo219224i();
                }
            });
        }
    }

    @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63332b
    /* renamed from: a */
    public void mo219189a(final List<VCParticipantAbbrInfo> list) {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.AnonymousClass24 */

            public void run() {
                C63334b.this.mo219217d(list);
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63332b
    /* renamed from: a */
    public void mo219182a(final VCTabRecordInfo vCTabRecordInfo) {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.AnonymousClass25 */

            public void run() {
                if (C63334b.this.aa == MeetingStatus.MEETING_END) {
                    C63334b.this.mo219213b(vCTabRecordInfo);
                    C63334b.this.mo219224i();
                }
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63332b
    /* renamed from: a */
    public void mo219184a(final VCTabHistoryCommonInfo cVar) {
        if (cVar != null) {
            C60735ab.m236001a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.AnonymousClass26 */

                public void run() {
                    C63334b.this.mo219216c(cVar);
                    if (cVar.mo210416b() == VideoChat.Type.MEET) {
                        C63334b.this.mo219214b(cVar);
                    } else if (cVar.mo210416b() == VideoChat.Type.CALL) {
                        C63334b bVar = C63334b.this;
                        bVar.mo219211a(bVar.f159811V, cVar);
                    }
                    C63334b.this.mo219223h();
                    C63334b.this.mo219224i();
                }
            });
        }
    }

    @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63332b
    /* renamed from: a */
    public void mo219180a(final HistoryInfo historyInfo) {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.AnonymousClass27 */

            public void run() {
                C63334b.this.f159808S.mo219265a(historyInfo);
                C63334b.this.mo219224i();
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63332b
    /* renamed from: b */
    public void mo219192b(final List<HistoryInfo> list) {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.AnonymousClass28 */

            public void run() {
                C63334b.this.mo219219e(list);
                C63334b.this.mo219224i();
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63332b
    /* renamed from: a */
    public void mo219181a(final VCMeetingJoinInfoEntity vCMeetingJoinInfoEntity) {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.AnonymousClass30 */

            public void run() {
                C63334b.this.mo219212b(vCMeetingJoinInfoEntity);
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63332b
    /* renamed from: a */
    public void mo219185a(final VCTabStatisticsInfo eVar) {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.AnonymousClass31 */

            public void run() {
                C63334b.this.mo219215b(eVar);
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63332b
    /* renamed from: a */
    public void mo219188a(String str) {
        ce.m250276i();
        C63497j.m248854a(this.f159816a, str, this.f159814Y, this.f159813X, this.f159815Z);
    }

    /* renamed from: a */
    public void setViewDelegate(C63328a.AbstractC63332b.AbstractC63333a aVar) {
        this.f159817b = aVar;
    }

    /* access modifiers changed from: public */
    /* renamed from: r */
    private /* synthetic */ void m248150r() {
        m248140f(this.f159811V);
    }

    /* access modifiers changed from: public */
    /* renamed from: s */
    private /* synthetic */ void m248151s() {
        m248139e(this.f159811V);
    }

    @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63332b
    /* renamed from: d */
    public void mo219196d() {
        C60700b.m235851b("VideoChatTab_VcTabDetailView", "[onCreateSuccess]", "create vc tab meeting statistics info success");
    }

    /* renamed from: h */
    public void mo219223h() {
        VcBizService.getVCMeetingJoinStatus(new AbstractC63598b<VCMeetingJoinInfoEntity>() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.AnonymousClass16 */

            /* renamed from: a */
            public void onSuccess(VCMeetingJoinInfoEntity vCMeetingJoinInfoEntity) {
                C63334b.this.mo219212b(vCMeetingJoinInfoEntity);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("VideoChatTab_VcTabDetailView", "[getVCMeetingJoinStatus]", "fail" + eVar.toString());
            }
        });
    }

    /* renamed from: o */
    private void m248147o() {
        C60700b.m235851b("VideoChatTab_VcTabDetailView", "[resetTimer]", "vcTab endTimerTask");
        C60745ag.C60746a aVar = this.an;
        if (aVar != null) {
            aVar.mo208366a(true);
            this.an = null;
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: t */
    private /* synthetic */ void m248152t() {
        m248131b(this.f159817b.mo219203e(), this.f159811V, this.f159817b.mo219204f());
    }

    /* access modifiers changed from: public */
    /* renamed from: u */
    private /* synthetic */ void m248153u() {
        m248124a(this.f159817b.mo219203e(), this.f159811V, this.f159817b.mo219204f());
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C60700b.m235851b("VideoChatTab_VcTabDetailView", "[destroy]", "destroy");
        this.f159806Q.mo219452a();
        m248147o();
    }

    /* renamed from: g */
    public void mo219222g() {
        this.f159799J.setVisibility(0);
        this.f159800K.setVisibility(0);
        this.f159802M.setEnabled(false);
        this.f159803N.setVisibility(8);
        m248134b(true);
    }

    /* renamed from: i */
    public void mo219224i() {
        C60735ab.m236002a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.AnonymousClass21 */

            public void run() {
                int measuredHeight = C63334b.this.f159820e.getMeasuredHeight();
                if (C63334b.this.f159797H.getVisibility() == 0 && measuredHeight < C63334b.this.f159797H.getTop() + C63334b.this.f159797H.getMeasuredHeight()) {
                    C63334b.this.f159805P.setVisibility(0);
                } else if (C63334b.this.f159794E.getVisibility() == 0 && measuredHeight < C63334b.this.f159794E.getTop() + C63334b.this.f159794E.getMeasuredHeight()) {
                    C63334b.this.f159805P.setVisibility(0);
                } else if (C63334b.this.f159792C.getVisibility() == 0 && measuredHeight < C63334b.this.f159792C.getTop() + C63334b.this.f159792C.getMeasuredHeight()) {
                    C63334b.this.f159805P.setVisibility(0);
                } else if (C63334b.this.f159799J.getVisibility() != 0 || measuredHeight >= C63334b.this.f159799J.getTop() + C63334b.this.f159799J.getMeasuredHeight()) {
                    C63334b.this.f159805P.setVisibility(8);
                } else {
                    C63334b.this.f159805P.setVisibility(0);
                }
            }
        }, (long) this.af);
    }

    /* renamed from: p */
    private void m248148p() {
        this.f159841z.setText(R.string.View_G_JoinRightNow);
        this.f159841z.setBackground(C60773o.m236128f(R.drawable.vc_bg_green_btn_selector));
        this.f159841z.setTextColor(C60773o.m236126d(R.color.ud_G600));
        this.f159841z.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.AnonymousClass17 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C60700b.m235851b("VideoChatTab_VcTabDetailView", "[onClick5]", "click join meeting");
                ce.m250262a(C63334b.this.mo219226k());
                VcTabListEvent.m249757a(C63334b.this.f159816a.mo219118a(), "join_meeting", "vc_meeting_pre_view");
                VideoChatService.m249602d().openNormalJoinMeetingPage(C63334b.this.f159816a, "tab_meeting_detail_join", C63334b.this.f159814Y, C63334b.this.f159813X);
            }
        });
    }

    /* renamed from: q */
    private void m248149q() {
        if (!this.f159809T) {
            this.f159841z.setVisibility(8);
            return;
        }
        this.f159841z.setBackground(C60773o.m236128f(R.drawable.tab_status_locked));
        this.f159841z.setTextColor(C60773o.m236126d(R.color.text_disable));
        this.f159841z.setText(R.string.Lark_View_Locked);
        this.f159841z.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.AnonymousClass20 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
            }
        });
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        C60700b.m235851b("VideoChatTab_VcTabDetailView", "create", "start");
        this.f159816a.setContentView(R.layout.activity_vc_tab3_detail);
        this.ag = this.f159816a.findViewById(R.id.vc_tab_detail_container);
        m248145m();
        this.f159817b.mo219197a();
    }

    /* renamed from: f */
    public void mo219220f() {
        this.f159799J.setVisibility(0);
        this.f159800K.setVisibility(0);
        this.f159802M.setEnabled(true);
        this.f159803N.setVisibility(8);
        this.f159800K.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.AnonymousClass14 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ce.m250272e();
                C63334b.this.mo219222g();
                C63334b.this.f159817b.mo219205g();
            }
        });
        m248134b(false);
    }

    /* renamed from: n */
    private void m248146n() {
        this.f159793D.setLayoutManager(new LinearLayoutManager(this.f159816a, 1, false) {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.AnonymousClass12 */

            @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        ((SimpleItemAnimator) this.f159793D.getItemAnimator()).setSupportsChangeAnimations(false);
        this.f159796G.setLayoutManager(new LinearLayoutManager(this.f159816a, 1, false) {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.AnonymousClass23 */

            @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        ((SimpleItemAnimator) this.f159796G.getItemAnimator()).setSupportsChangeAnimations(false);
        this.f159798I.setLayoutManager(new LinearLayoutManager(this.f159816a, 1, false) {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.AnonymousClass33 */

            @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        ((SimpleItemAnimator) this.f159798I.getItemAnimator()).setSupportsChangeAnimations(false);
    }

    /* renamed from: j */
    public void mo219225j() {
        if (this.f159808S == null) {
            C63359a aVar = new C63359a(this.f159813X, this.f159809T, this.f159817b);
            this.f159808S = aVar;
            this.f159793D.setAdapter(aVar);
        }
        if (this.al == null) {
            C63366c cVar = new C63366c(this.f159813X, this.f159814Y, this.f159817b);
            this.al = cVar;
            cVar.mo219282a(this.f159816a.mo219118a());
            this.f159796G.setAdapter(this.al);
        }
        if (this.am == null) {
            C63363b bVar = new C63363b(this.f159816a, this.f159813X, this.f159817b);
            this.am = bVar;
            bVar.mo219276a(this.f159816a.mo219118a());
            this.f159798I.setAdapter(this.am);
        }
    }

    /* renamed from: e */
    public void mo219218e() {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        boolean z4 = true;
        if (!TextUtils.equals(this.f159812W, VideoChatModuleDependency.m236631d()) || VideoChatModule.getDependency().getLoginDependency().isCustomer()) {
            z = false;
        } else {
            z = true;
        }
        if (!z || !VideoChatModuleDependency.m236634g().mo196512b() || !C63634c.m249496b("byteview.meeting.businessphone") || !VideoChatModule.getVideoChatService().mo220083c()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.f159817b.mo219203e() == VCTabListItem.PhoneType.VC) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f159817b.mo219203e() != VCTabListItem.PhoneType.VC || !z || !VideoChatModuleDependency.getFeatureGatingDependency().mo196393a("lark.call.sos")) {
            z4 = false;
        }
        final ArrayList arrayList = new ArrayList();
        final ArrayMap arrayMap = new ArrayMap();
        if (z2) {
            UDBaseListDialogBuilder.ListItem c = new UDBaseListDialogBuilder.ListItemBuilder(C60773o.m236119a((int) R.string.Lark_View_OfficePhonePaid)).mo90889c();
            arrayList.add(c);
            arrayMap.put(c, new Runnable() {
                /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.$$Lambda$b$6WeTSCBAXsyu7m0NJHSZkyAo3o */

                public final void run() {
                    C63334b.m271449lambda$6WeTSCBAXsyu7m0NJHSZkyAo3o(C63334b.this);
                }
            });
        }
        if (z) {
            if (z2) {
                str = C60773o.m236119a((int) R.string.Lark_View_SelfPhoneHere);
            } else {
                str = C60773o.m236119a((int) R.string.Lark_Legacy_StartPhoneCall);
            }
            UDBaseListDialogBuilder.ListItem c2 = new UDBaseListDialogBuilder.ListItemBuilder(str).mo90889c();
            arrayList.add(c2);
            arrayMap.put(c2, new Runnable() {
                /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.$$Lambda$b$97QQs71pk65PzUSyLfq_EaLRCoQ */

                public final void run() {
                    C63334b.lambda$97QQs71pk65PzUSyLfq_EaLRCoQ(C63334b.this);
                }
            });
        }
        if (z3) {
            UDBaseListDialogBuilder.ListItem c3 = new UDBaseListDialogBuilder.ListItemBuilder(C60773o.m236119a((int) R.string.Lark_View_VoiceCallName)).mo90889c();
            arrayList.add(c3);
            arrayMap.put(c3, new Runnable() {
                /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.$$Lambda$b$qDgLTgLvyv550B8qd3aRjDrr9lQ */

                public final void run() {
                    C63334b.lambda$qDgLTgLvyv550B8qd3aRjDrr9lQ(C63334b.this);
                }
            });
        }
        if (z4) {
            UDBaseListDialogBuilder.ListItem c4 = new UDBaseListDialogBuilder.ListItemBuilder(C60773o.m236119a((int) R.string.Lark_Legacy_UrgentCallEntrance)).mo90888b(R.color.function_danger_500).mo90889c();
            arrayList.add(c4);
            arrayMap.put(c4, new Runnable() {
                /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.$$Lambda$b$hhlNv_h1NH6VczOVBCmc4dRS4eI */

                public final void run() {
                    C63334b.lambda$hhlNv_h1NH6VczOVBCmc4dRS4eI(C63334b.this);
                }
            });
        }
        ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) new UDActionPanelBuilder(this.f159816a).mo90873b(arrayList)).addActionButton(R.id.ud_dialog_btn_cancel, R.string.Lark_Legacy_Cancel, (DialogInterface.OnClickListener) null)).mo90869a(new UDListDialogController.OnItemClickListener() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.C633467 */

            @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
            public void onItemClick(int i) {
                if (i >= 0 && i < arrayList.size()) {
                    UDBaseListDialogBuilder.ListItem aVar = (UDBaseListDialogBuilder.ListItem) arrayList.get(i);
                    if (arrayMap.get(aVar) != null) {
                        ((Runnable) arrayMap.get(aVar)).run();
                    }
                }
            }
        })).show();
    }

    /* renamed from: m */
    private void m248145m() {
        this.f159818c = (IconFontView) this.f159816a.findViewById(R.id.go_back);
        this.f159819d = (IconFontView) this.f159816a.findViewById(R.id.share_meeting);
        this.f159820e = this.f159816a.findViewById(R.id.scroll_container);
        this.f159821f = this.f159816a.findViewById(R.id.multi_info_layout);
        this.f159822g = (TextView) this.f159816a.findViewById(R.id.meeting_title_tv);
        this.f159823h = (ExternalTag) this.f159816a.findViewById(R.id.meeting_external_tag);
        this.f159824i = this.f159816a.findViewById(R.id.meeting_recurring_info_layout);
        this.f159825j = (TextView) this.f159816a.findViewById(R.id.recurring_event_tv);
        this.f159826k = this.f159816a.findViewById(R.id.meeting_basic_info_layout);
        this.f159827l = this.f159816a.findViewById(R.id.call_basic_info_layout);
        this.f159828m = (VcTabAvatarListView) this.f159816a.findViewById(R.id.meeting_avatar_list);
        this.f159829n = this.f159816a.findViewById(R.id.meeting_calendar_link_layout);
        this.f159830o = this.f159816a.findViewById(R.id.call_info_layout);
        this.f159831p = (ImageView) this.f159816a.findViewById(R.id.caller_avatar);
        this.f159832q = (TextView) this.f159816a.findViewById(R.id.caller_username);
        this.f159833r = this.f159816a.findViewById(R.id.call_external_tag);
        this.f159834s = this.f159816a.findViewById(R.id.call_time_info_layout);
        this.f159835t = this.f159816a.findViewById(R.id.call_action_layout);
        this.f159837v = this.f159816a.findViewById(R.id.icon_chat);
        this.f159838w = this.f159816a.findViewById(R.id.icon_audio_call);
        this.f159839x = this.f159816a.findViewById(R.id.icon_video_call);
        this.f159836u = this.f159816a.findViewById(R.id.call_info_layout_bottom_space);
        this.f159840y = this.f159816a.findViewById(R.id.meeting_action_layout);
        this.f159841z = (TextView) this.f159816a.findViewById(R.id.meeting_status_tv);
        this.f159790A = (TextView) this.f159816a.findViewById(R.id.copy_invitation_tv);
        this.f159791B = this.f159816a.findViewById(R.id.tab_meeting_group_source_layout);
        this.f159792C = this.f159816a.findViewById(R.id.tab_history_info_layout);
        this.f159793D = (RecyclerView) this.f159816a.findViewById(R.id.history_list);
        this.f159794E = this.f159816a.findViewById(R.id.tab_minutes_layout);
        this.f159795F = (TextView) this.f159816a.findViewById(R.id.meeting_record_title);
        this.f159796G = (RecyclerView) this.f159816a.findViewById(R.id.meeting_record_list);
        this.f159797H = this.f159816a.findViewById(R.id.tab_magic_share_layout);
        this.f159798I = (RecyclerView) this.f159816a.findViewById(R.id.magic_share_list);
        this.f159799J = this.f159816a.findViewById(R.id.tab_meeting_statistics_layout);
        this.f159800K = this.f159816a.findViewById(R.id.meeting_statistics_export_layout);
        this.f159801L = (LKUILottieAnimationView) this.f159816a.findViewById(R.id.meeting_statistics_export_loading_view);
        this.f159802M = (LineHeightTextView) this.f159816a.findViewById(R.id.meeting_statistics_export_btn);
        this.f159803N = this.f159816a.findViewById(R.id.meeting_statistics_docs_layout);
        this.f159804O = (LineHeightTextView) this.f159816a.findViewById(R.id.meeting_statistics_docs_title);
        this.f159805P = this.f159816a.findViewById(R.id.bottom_bar);
        this.f159806Q = (PageLoadingView) this.f159816a.findViewById(R.id.page_loading);
        this.f159807R = (PageErrorView) this.f159816a.findViewById(R.id.page_load_error);
        m248146n();
        this.f159818c.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.$$Lambda$b$uvMcndKbpzVr8LQFeK3_y_4AaA */

            public final void onClick(View view) {
                C63334b.m271452lambda$uvMcndKbpzVr8LQFeK3_y_4AaA(C63334b.this, view);
            }
        });
        this.f159807R.setTryReloadingClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.C633351 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C60700b.m235851b("VideoChatTab_VcTabDetailView", "[onClick]", "refresh");
                C63334b.this.f159817b.mo219197a();
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63332b
    /* renamed from: b */
    public void mo219190b() {
        C60700b.m235851b("VideoChatTab_VcTabDetailView", "[showEmptyResultView]", "start");
        this.f159807R.mo219446a();
        this.f159806Q.mo219452a();
    }

    /* renamed from: e */
    private void m248139e(String str) {
        C60735ab.m236001a(new Runnable(str) {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.$$Lambda$b$tzzz_sVk3wvnBxDOqvmSDFfjTBM */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                C63334b.lambda$tzzz_sVk3wvnBxDOqvmSDFfjTBM(this.f$0);
            }
        });
    }

    /* renamed from: f */
    private void m248140f(String str) {
        C60735ab.m236001a(new Runnable(str) {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.$$Lambda$b$1kpuYAm6iQu_grYITXQbw3x6hg */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C63334b.m271448lambda$1kpuYAm6iQu_grYITXQbw3x6hg(C63334b.this, this.f$1);
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: i */
    private /* synthetic */ void m248143i(String str) {
        VideoChatModuleDependency.getDependency().getChatDependency().emergencyCall(this.f159816a, str);
    }

    @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63332b
    /* renamed from: c */
    public void mo219194c(final C63602e eVar) {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.AnonymousClass32 */

            public void run() {
                C60700b.m235864f("VideoChatTab_VcTabDetailView", "[onCreateSuccess2]", "create vc tab meeting statistics info failed" + eVar.toString());
                C63334b.this.mo219220f();
                C60738ac.m236024a(R.drawable.icon_no_support_link_error, R.string.View_G_CouldNotExportStatistics, 2000);
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m248120a(View view) {
        this.f159816a.finish();
        VcTabListEvent.m249756a(this.f159816a.mo219118a(), "close");
    }

    /* renamed from: b */
    private void m248129b(final long j) {
        C60700b.m235851b("VideoChatTab_VcTabDetailView", "[startOnthecallTimer]", "startTimerTask");
        if (this.an == null) {
            this.an = C60745ag.m236064a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.AnonymousClass37 */

                public void run() {
                    C63334b.this.mo219207a(j);
                }
            }, 1000, 1000);
        }
    }

    /* renamed from: c */
    private void m248137c(String str) {
        this.f159838w.setVisibility(0);
        this.f159838w.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.C633435 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ce.m250268c();
                VcTabListEvent.m249757a(C63334b.this.f159816a.mo219118a(), "voice_call", "vc_meeting_calling_view");
                C63334b.this.mo219218e();
            }
        });
    }

    /* renamed from: j */
    public static /* synthetic */ void m248144j(String str) {
        VideoChatModule.getVideoChatService().mo220075a(VideoChatModule.getDependency().getChatDependency().getChatterById(str), null, "user_profile", false, true, $$Lambda$b$zrfZC6bmicwMZv6wi8V9PJ4mGNM.INSTANCE);
    }

    /* renamed from: d */
    public void mo219217d(final List<VCParticipantAbbrInfo> list) {
        if (list.size() > 0) {
            C60735ab.m236001a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.AnonymousClass36 */

                public void run() {
                    C63334b.this.f159828m.setVisibility(0);
                    C63334b.this.f159828m.mo208621a(C63334b.this.f159813X, list);
                    C63334b.this.f159828m.setOnClickListener(new OnSingleClickListener() {
                        /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.AnonymousClass36.C633401 */

                        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                        public void onSingleClick(View view) {
                            if (!C60742af.m236059a(list) && list.size() > 1) {
                                ce.m250271d(C63334b.this.f159813X);
                                VCTabEvent3.f160816b.mo220248a("user_group", "none", C63334b.this.f159813X, C63334b.this.aa, C63334b.this.f159809T);
                            }
                            C63438a.m248528a(C63334b.this.f159813X, C63334b.this.aa, C63334b.this.mo219227l(), C63334b.this.f159814Y, list);
                            C63334b.this.f159828m.setVisibility(0);
                        }
                    });
                }
            });
        }
    }

    /* renamed from: e */
    public void mo219219e(List<HistoryInfo> list) {
        if (list != null && list.size() != 0) {
            this.f159792C.setVisibility(0);
            this.f159808S.mo219267a(list);
        }
    }

    C63334b(VcTab3DetailActivity vcTab3DetailActivity) {
        this.f159816a = vcTab3DetailActivity;
    }

    /* renamed from: a */
    private int m248119a(boolean z) {
        int a = C60776r.m236139a();
        if (!this.f159809T && this.f159831p.getVisibility() == 0) {
            a -= UIHelper.dp2px((float) (this.ac + this.ae));
        }
        return a - UIHelper.dp2px((float) this.ac);
    }

    /* renamed from: b */
    private void m248132b(final String str) {
        if (this.f159817b.mo219203e() == VCTabListItem.PhoneType.OUTSIDE_ENTERPRISE_PHONE) {
            this.f159837v.setVisibility(8);
            return;
        }
        this.f159837v.setVisibility(0);
        this.f159837v.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.C633414 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                VideoChatModule.getDependency().getChatDependency().createP2PChats(arrayList, new IGetDataCallback<Map<String, ? extends OpenChat>>() {
                    /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.C633414.C633421 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                    }

                    /* renamed from: a */
                    public void onSuccess(Map<String, ? extends OpenChat> map) {
                        if (map.values().size() == 1) {
                            ce.m250265b();
                            OpenChat[] openChatArr = new OpenChat[map.values().size()];
                            map.values().toArray(openChatArr);
                            VideoChatModule.getDependency().getChatDependency().openChatById(C63334b.this.f159816a, openChatArr[0].getId());
                        }
                    }
                });
                VcTabListEvent.m249757a(C63334b.this.f159816a.mo219118a(), "chat", "im_chat_main_view");
            }
        });
    }

    /* renamed from: c */
    private void m248136c(final VCTabStatisticsInfo eVar) {
        this.f159799J.setVisibility(0);
        this.f159800K.setVisibility(8);
        this.f159803N.setVisibility(0);
        this.f159804O.setText(eVar.mo210435c());
        this.f159803N.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.AnonymousClass15 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ce.m250273f();
                VideoChatModule.getDependency().getDocsDependency().mo196378a(eVar.mo210434b(), C63334b.this.f159816a.getApplicationContext());
            }
        });
    }

    /* renamed from: d */
    private void m248138d(final String str) {
        if (this.f159817b.mo219203e() == VCTabListItem.PhoneType.OUTSIDE_ENTERPRISE_PHONE) {
            this.f159839x.setVisibility(8);
            return;
        }
        this.f159839x.setVisibility(0);
        this.f159839x.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.C633446 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ce.m250270d();
                VcTabListEvent.m249757a(C63334b.this.f159816a.mo219118a(), "video_call", "vc_meeting_calling_view");
                VideoChatModule.getVideoChatService().mo220075a(VideoChatModule.getDependency().getChatDependency().getChatterById(str), null, "user_profile", false, false, new IVideoChatService.AbstractC63626a() {
                    /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.C633446.C633451 */

                    @Override // com.ss.android.vc.service.IVideoChatService.AbstractC63626a
                    public void onError(VCLaunchError vCLaunchError) {
                    }
                });
            }
        });
    }

    /* renamed from: g */
    private void m248141g(final String str) {
        this.f159841z.setText(R.string.View_MV_JoinedAlready);
        this.f159841z.setBackground(C60773o.m236128f(R.drawable.vc_bg_green_btn_selector));
        this.f159841z.setTextColor(C60773o.m236126d(R.color.ud_G600));
        this.f159841z.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.AnonymousClass18 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C60700b.m235851b("VideoChatTab_VcTabDetailView", "[onClick6]", "click go to onthecall");
                ce.m250266b(C63334b.this.mo219226k());
                VCTabEvent3.f160816b.mo220248a("joined", "vc_meeting_onthecall_view", str, C63334b.this.aa, C63334b.this.f159809T);
                C61303k kVar = (C61303k) MeetingManager.m238341a().getMeeting(str);
                if (kVar != null) {
                    ByteRTCMeetingActivity.m244042c(kVar);
                }
            }
        });
    }

    /* renamed from: h */
    private void m248142h(final String str) {
        if (!this.f159809T) {
            this.f159841z.setVisibility(8);
            return;
        }
        this.f159841z.setText(R.string.View_M_WaitingEllipsis);
        this.f159841z.setBackground(C60773o.m236128f(R.drawable.vc_bg_green_btn_selector));
        this.f159841z.setTextColor(C60773o.m236126d(R.color.ud_G600));
        this.f159841z.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.AnonymousClass19 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C60700b.m235851b("VideoChatTab_VcTabDetailView", "[onClick7]", "click go to waiting room");
                ce.m250269c(C63334b.this.mo219226k());
                VCTabEvent3.f160816b.mo220248a("waiting", "vc_meeting_waiting_view", str, C63334b.this.aa, C63334b.this.f159809T);
                C61303k kVar = (C61303k) MeetingManager.m238341a().getMeeting(str);
                if (kVar != null) {
                    ByteRTCMeetingActivity.m244042c(kVar);
                }
            }
        });
    }

    /* renamed from: f */
    public void mo219221f(List<FollowAbbrInfo> list) {
        if (list != null && list.size() != 0) {
            this.f159797H.setVisibility(0);
            this.f159798I.setMinimumHeight(UIHelper.dp2px((float) (list.size() * 76)));
            this.am.mo219277a(list);
        }
    }

    /* renamed from: a */
    private void m248123a(final VCParamFromGroup vCParamFromGroup) {
        C60700b.m235851b("VideoChatTab_VcTabDetailView", "[processGroup]", "info:" + vCParamFromGroup.toString());
        final String chat_id = vCParamFromGroup.getChat_id();
        if (TextUtils.isEmpty(chat_id)) {
            C60700b.m235851b("VideoChatTab_VcTabDetailView", "[processGroup2]", "group id is empty.");
            return;
        }
        final String str = "/client/chat/open?chatId=" + chat_id;
        final LKUIRoundedImageView lKUIRoundedImageView = (LKUIRoundedImageView) this.f159791B.findViewById(R.id.group_cir_avatar);
        final LineHeightTextView lineHeightTextView = (LineHeightTextView) this.f159791B.findViewById(R.id.group_title);
        VideoChatModuleDependency.getChatDependency().getChatById(chat_id, new IGetDataCallback<OpenChat>() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.AnonymousClass11 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C60700b.m235864f("VideoChatTab_VcTabDetailView", "[getChatById2]", "error= " + errorResult.getErrorMsg());
            }

            /* renamed from: a */
            public void onSuccess(OpenChat openChat) {
                C60700b.m235851b("VideoChatTab_VcTabDetailView", "[getChatById]", "success. object= " + openChat);
                lineHeightTextView.setText(openChat.getName());
                C60783v.m236230a(openChat.getAvatarKey(), chat_id, ParticipantType.LARK_USER, lKUIRoundedImageView, 20, 20);
            }
        });
        this.f159791B.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.AnonymousClass13 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C60700b.m235851b("VideoChatTab_VcTabDetailView", "[onClick4]", "click to open group:" + vCParamFromGroup.getChat_id());
                ce.m250278k();
                C63334b.this.f159817b.mo219198a(C63334b.this.f159791B.getContext(), str);
            }
        });
    }

    /* renamed from: c */
    public void mo219216c(VCTabHistoryCommonInfo cVar) {
        if (!TextUtils.isEmpty(cVar.mo210415a())) {
            this.f159814Y = cVar.mo210415a();
        }
        boolean z = true;
        if (this.f159809T || cVar.mo210416b() != VideoChat.Type.MEET) {
            if (cVar.mo210416b() != VideoChat.Type.MEET) {
                z = false;
            }
            this.f159809T = z;
        } else {
            this.f159809T = true;
            C63359a aVar = this.f159808S;
            if (aVar != null) {
                aVar.mo219263a();
            }
        }
        this.aa = cVar.mo210418d();
        this.ab = cVar.mo210417c();
        this.f159810U = cVar.mo210419e();
    }

    /* renamed from: b */
    private void m248134b(boolean z) {
        if (z) {
            this.f159801L.setVisibility(0);
            this.f159801L.playAnimation();
            return;
        }
        if (this.f159801L.isAnimating()) {
            this.f159801L.cancelAnimation();
        }
        this.f159801L.setVisibility(8);
    }

    @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63332b
    /* renamed from: c */
    public void mo219195c(final List<FollowAbbrInfo> list) {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.AnonymousClass29 */

            public void run() {
                C63334b.this.mo219221f(list);
                C63334b.this.mo219224i();
            }
        });
    }

    /* renamed from: b */
    public void mo219212b(VCMeetingJoinInfoEntity vCMeetingJoinInfoEntity) {
        if (this.aa == MeetingStatus.MEETING_END) {
            this.f159840y.setVisibility(8);
            this.f159819d.setVisibility(8);
            m248147o();
        } else if (vCMeetingJoinInfoEntity == null || vCMeetingJoinInfoEntity.joinInfo == null || vCMeetingJoinInfoEntity.joinInfo.getJoinStatus() == VCTabMeetingJoinInfo.JoinStatus.UNKNOWN || !TextUtils.equals(this.f159813X, vCMeetingJoinInfoEntity.joinInfo.getMeetingId())) {
            C60700b.m235851b("VideoChatTab_VcTabDetailView", "[initMeetingStatus2]", "empty info, got to join meeting");
            this.f159840y.setVisibility(0);
            if (this.f159810U) {
                m248149q();
            } else {
                m248148p();
            }
        } else {
            this.f159840y.setVisibility(0);
            VCTabMeetingJoinInfo vCTabMeetingJoinInfo = vCMeetingJoinInfoEntity.joinInfo;
            if (vCTabMeetingJoinInfo.getJoinStatus() == VCTabMeetingJoinInfo.JoinStatus.JOINED) {
                m248141g(vCTabMeetingJoinInfo.getMeetingId());
            } else if (vCTabMeetingJoinInfo.getJoinStatus() == VCTabMeetingJoinInfo.JoinStatus.WAITING) {
                m248142h(vCTabMeetingJoinInfo.getMeetingId());
            } else if (this.f159810U) {
                m248149q();
            } else if (vCTabMeetingJoinInfo.getJoinStatus() == VCTabMeetingJoinInfo.JoinStatus.JOINABLE) {
                m248148p();
            } else if (vCTabMeetingJoinInfo.getJoinStatus() == VCTabMeetingJoinInfo.JoinStatus.END) {
                this.f159840y.setVisibility(8);
                m248147o();
            }
        }
    }

    /* renamed from: b */
    public void mo219213b(VCTabRecordInfo vCTabRecordInfo) {
        if (vCTabRecordInfo != null) {
            if (vCTabRecordInfo.getRecordType() == VCTabRecordInfo.RecordType.LARK_MINUTES) {
                this.f159795F.setText(UIHelper.getString(R.string.View_SA_RecordingFileFeishuMinutes_Text));
            } else {
                this.f159795F.setText(UIHelper.getString(R.string.View_G_RecordingFile));
            }
            this.f159794E.setVisibility(0);
            this.f159796G.setMinimumHeight(UIHelper.dp2px((float) (Math.max(vCTabRecordInfo.getUrlList().size(), 1) * 76)));
            this.al.mo219280a(vCTabRecordInfo);
        }
    }

    /* renamed from: b */
    private void m248133b(String str, VCTabHistoryCommonInfo cVar) {
        if (this.f159817b.mo219203e() == VCTabListItem.PhoneType.OUTSIDE_ENTERPRISE_PHONE) {
            this.f159832q.setText(this.f159817b.mo219204f());
            C60783v.m236230a("", "", ParticipantType.valueOf(ParticipantType.UNKNOWN.getNumber()), this.f159831p, 32, 32);
        } else if (this.f159817b.mo219203e() == VCTabListItem.PhoneType.VC) {
            UserInfoService.getUserInfoById(mo219226k(), str, ParticipantType.LARK_USER, new GetUserInfoListener(cVar) {
                /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.$$Lambda$b$GlxfU2q5f5C9UYzgqWj6cFSqFA */
                public final /* synthetic */ VCTabHistoryCommonInfo f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.vc.net.service.GetUserInfoListener
                public final void onGetUserInfo(VideoChatUser videoChatUser) {
                    C63334b.m271451lambda$GlxfU2q5f5C9UYzgqWj6cFSqFA(C63334b.this, this.f$1, videoChatUser);
                }
            });
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m248125a(VCTabHistoryCommonInfo cVar, final VideoChatUser videoChatUser) {
        m248126a(cVar, this.f159811V, videoChatUser.getName());
        C60783v.m236230a(videoChatUser.getAvatarKey(), videoChatUser.getId(), ParticipantType.valueOf(videoChatUser.getType().getNumber()), this.f159831p, 32, 32);
        this.f159831p.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.C633373 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ce.m250276i();
                ArrayList arrayList = new ArrayList();
                arrayList.add(C63334b.this.f159811V);
                VideoChatModule.getDependency().getChatDependency().createP2PChats(arrayList, new IGetDataCallback<Map<String, ? extends OpenChat>>() {
                    /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.C633373.C633381 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                    }

                    /* renamed from: a */
                    public void onSuccess(Map<String, ? extends OpenChat> map) {
                        if (map.values().size() == 1) {
                            OpenChat[] openChatArr = new OpenChat[map.values().size()];
                            map.values().toArray(openChatArr);
                            VideoChatModuleDependency.getDependency().startContactsProfileActivityByChatterId(C63334b.this.f159816a, videoChatUser.getId(), openChatArr[0].getId());
                        }
                    }
                });
            }
        });
    }

    /* renamed from: a */
    private boolean m248128a(boolean z, String str) {
        String d = VideoChatModuleDependency.m236631d();
        if (TextUtils.isEmpty(d) || TextUtils.equals(d, "-1") || !VideoChatModuleDependency.m236632e() || VideoChatModuleDependency.getLoginDependency().mo196421c()) {
            return false;
        }
        if (z) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return !TextUtils.equals(d, str);
    }

    /* renamed from: a */
    private void m248124a(final VCTabListItem.PhoneType phoneType, final String str, final String str2) {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.RunnableC633478 */

            /* renamed from: a */
            public static /* synthetic */ void m248200a(Boolean bool) {
            }

            public void run() {
                C63767p.m250333d();
                if (phoneType == VCTabListItem.PhoneType.VC) {
                    C57865c.m224574a(new C57865c.AbstractC57873d(str) {
                        /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.$$Lambda$b$8$m5_wntSA95cbKO6VqIeu4j9e4mA */
                        public final /* synthetic */ String f$0;

                        {
                            this.f$0 = r1;
                        }

                        @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
                        public final Object produce() {
                            return C63334b.RunnableC633478.lambda$m5_wntSA95cbKO6VqIeu4j9e4mA(this.f$0);
                        }
                    }, $$Lambda$b$8$av486zvPqApfztMfQmR2F4k0cs.INSTANCE);
                } else if (phoneType == VCTabListItem.PhoneType.OUTSIDE_ENTERPRISE_PHONE) {
                    VideoChatModule.getVideoChatService().mo220078a(str2, "tabDetail");
                }
            }

            /* renamed from: a */
            public static /* synthetic */ OpenChatter m248198a(String str) {
                return VideoChatModuleDependency.getChatDependency().getChatterById(str);
            }

            /* renamed from: a */
            public static /* synthetic */ void m248199a(OpenChatter openChatter) {
                C57865c.m224574a(new C57865c.AbstractC57873d() {
                    /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.$$Lambda$b$8$7nK2MK26MsSsIIBFaXHguNtqTbc */

                    @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
                    public final Object produce() {
                        return C63334b.RunnableC633478.lambda$7nK2MK26MsSsIIBFaXHguNtqTbc(OpenChatter.this);
                    }
                }, $$Lambda$b$8$0hZp6QTqGs0oW5HugVSORa4zIo.INSTANCE);
            }

            /* renamed from: b */
            public static /* synthetic */ Boolean m248201b(OpenChatter openChatter) {
                VideoChatModule.getVideoChatService().mo220074a(openChatter, "", "tabDetail");
                return true;
            }
        });
    }

    /* renamed from: b */
    private void m248131b(VCTabListItem.PhoneType phoneType, String str, String str2) {
        C60735ab.m236001a(new Runnable(phoneType, str, str2) {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.$$Lambda$b$8Gs87z6trt12lIHZMU_mgzYCpo */
            public final /* synthetic */ VCTabListItem.PhoneType f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C63334b.m271450lambda$8Gs87z6trt12lIHZMU_mgzYCpo(C63334b.this, this.f$1, this.f$2, this.f$3);
            }
        });
    }

    /* renamed from: a */
    private void m248122a(MeetingStatus meetingStatus, long j, long j2) {
        TextView textView = (TextView) this.f159821f.findViewById(R.id.meeting_time_tv);
        TextView textView2 = (TextView) this.f159821f.findViewById(R.id.meeting_countdown_tv);
        if (meetingStatus == MeetingStatus.MEETING_END) {
            long j3 = j2 - j;
            if (j3 >= 0) {
                textView.setText(DateTimeUtils.m248538b(j * 1000, j2 * 1000));
                textView2.setText(DateTimeUtils.m248540d(j3));
                return;
            }
        }
        if (meetingStatus == MeetingStatus.MEETING_ON_THE_CALL && (DateTimeUtils.m248532a() / 1000) - j >= 0) {
            textView.setText(DateTimeUtils.m248537b(j * 1000));
            textView2.setText(DateTimeUtils.m248539c((DateTimeUtils.m248532a() / 1000) - j));
            m248129b(j);
        }
    }

    /* renamed from: b */
    private void m248130b(MeetingStatus meetingStatus, long j, long j2) {
        TextView textView = (TextView) this.f159830o.findViewById(R.id.meeting_time_tv);
        TextView textView2 = (TextView) this.f159830o.findViewById(R.id.meeting_countdown_tv);
        if (meetingStatus == MeetingStatus.MEETING_END) {
            long j3 = j2 - j;
            if (j3 >= 0) {
                textView.setText(DateTimeUtils.m248538b(j * 1000, j2 * 1000));
                textView2.setText(DateTimeUtils.m248540d(j3));
                return;
            }
        }
        if (meetingStatus == MeetingStatus.MEETING_ON_THE_CALL && (DateTimeUtils.m248532a() / 1000) - j >= 0) {
            textView.setText(DateTimeUtils.m248537b(j * 1000));
            textView2.setText(DateTimeUtils.m248539c((DateTimeUtils.m248532a() / 1000) - j));
            m248129b(j);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m248135c(VCTabListItem.PhoneType phoneType, String str, String str2) {
        if (phoneType == VCTabListItem.PhoneType.VC) {
            VideoChatModuleDependency.getDependency().getChatDependency().queryPhoneNumber(this.f159816a, str);
        } else if (phoneType == VCTabListItem.PhoneType.OUTSIDE_ENTERPRISE_PHONE) {
            if (TextUtils.isEmpty(str2)) {
                C60700b.m235851b("VideoChatTab_VcTabDetailView", "[startPhoneCall1]", "phoneNumber is empty");
            } else if (TextUtils.equals(str2, "0")) {
                C60700b.m235851b("VideoChatTab_VcTabDetailView", "[startPhoneCall2]", "phoneNumber is 0");
            }
            VideoChatModuleDependency.getDependency().getChatDependency().mo196346a(this.f159816a, str2);
        }
    }

    /* renamed from: a */
    private void m248126a(final VCTabHistoryCommonInfo cVar, String str, final String str2) {
        UserInfoService.getTabTenant(str, new AbstractC63598b<av>() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63334b.C633489 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C63334b.this.f159832q.setText(C63334b.this.mo219206a(str2, false, false));
            }

            /* renamed from: a */
            public void onSuccess(av avVar) {
                boolean z;
                String d = VideoChatModuleDependency.m236631d();
                if (TextUtils.isEmpty(d) || TextUtils.equals(d, "-1") || !VideoChatModuleDependency.m236632e() || VideoChatModuleDependency.getLoginDependency().mo196421c() || TextUtils.equals(d, avVar.mo210118b()) || !cVar.mo210421f() || TextUtils.isEmpty(cVar.mo210423h()) || TextUtils.equals(d, avVar.mo210118b())) {
                    z = false;
                } else {
                    z = true;
                }
                C63334b.this.f159832q.setText(C63334b.this.mo219206a(str2, false, z));
                if (z) {
                    C63334b.this.f159832q.append(SpanUtil.f160471a.mo219675d());
                    C63334b.this.f159832q.append(SpanUtil.f160471a.mo219673b());
                }
            }
        });
    }
}
