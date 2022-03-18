package com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.component.universe_design.dialog.UDCheckBoxDialogBuilder;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60742af;
import com.ss.android.vc.common.p3083e.C60762k;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantRole;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.entity.breakoutroom.BreakoutRoomManage;
import com.ss.android.vc.entity.request.HostManageRequest;
import com.ss.android.vc.entity.request.ManageApprovalRequest;
import com.ss.android.vc.entity.response.C60976j;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.C61381c;
import com.ss.android.vc.meeting.model.LobbyData;
import com.ss.android.vc.meeting.module.VCBreakoutRoomInfo;
import com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl;
import com.ss.android.vc.meeting.module.lobby.pb.VCLobbyParticipant;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.C62347k;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.ParticipantItem;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.popupwindow.View$OnClickListenerC62384b;
import com.ss.android.vc.meeting.module.multi.viewpager.CanScrollViewPager;
import com.ss.android.vc.meeting.module.p3129j.AbstractC61994a;
import com.ss.android.vc.meeting.module.preview.guest.GuestJoinMeetingUtil;
import com.ss.android.vc.meeting.utils.C63496i;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.service.VideoChatUIConfigService;
import com.ss.android.vc.statistics.event.C63742at;
import com.ss.android.vc.statistics.event.bf;
import com.ss.android.vc.statistics.event.bi;
import com.ss.android.vc.statistics.event2.MeetingOnTheCallEvent2;
import com.ss.android.vc.statistics.event2.MeetingPopupEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class ParticipantViewPagerViewHolder extends RecyclerView.OnScrollListener implements View.OnClickListener, LobbyData.AbstractC61370a, C61381c.AbstractC61382a, AbstractC61994a.AbstractC61995a {

    /* renamed from: a */
    public RecyclerView f156736a;

    /* renamed from: b */
    public FrameLayout f156737b;

    /* renamed from: c */
    public FrameLayout f156738c;

    /* renamed from: d */
    public ViewGroup f156739d;

    /* renamed from: e */
    public TextView f156740e;

    /* renamed from: f */
    public TextView f156741f;

    /* renamed from: g */
    public TextView f156742g;

    /* renamed from: h */
    public TextView f156743h;

    /* renamed from: i */
    public RelativeLayout f156744i;

    /* renamed from: j */
    public LinearLayout f156745j;

    /* renamed from: k */
    public LinearLayout f156746k;

    /* renamed from: l */
    public LinearLayout f156747l;

    /* renamed from: m */
    public LinearLayout f156748m;

    /* renamed from: n */
    C62347k f156749n;

    /* renamed from: o */
    public final C61303k f156750o;

    /* renamed from: p */
    LinearLayoutManager f156751p;

    /* renamed from: q */
    private final AtomicBoolean f156752q = new AtomicBoolean(false);

    /* renamed from: r */
    private final FragmentActivity f156753r;

    /* renamed from: s */
    private C60762k f156754s;

    /* renamed from: t */
    private String f156755t;

    /* renamed from: u */
    private final CanScrollViewPager f156756u;

    /* renamed from: v */
    private final TabLayout f156757v;

    /* renamed from: w */
    private boolean f156758w = false;

    /* renamed from: x */
    private StickerHeaderType f156759x;

    public enum StickerHeaderType {
        UNKNOWN,
        IN_MEETING,
        SUGGESTING,
        CALLING,
        WAITING
    }

    @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    /* renamed from: a */
    public /* synthetic */ void mo212486a(List list) {
        C61381c.AbstractC61382a.CC.$default$a(this, list);
    }

    @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    /* renamed from: a */
    public /* synthetic */ void mo212487a(boolean z) {
        C61381c.AbstractC61382a.CC.$default$a(this, z);
    }

    @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    public /* synthetic */ void h_(boolean z) {
        C61381c.AbstractC61382a.CC.$default$h_(this, z);
    }

    /* renamed from: b */
    public C62347k mo215636b() {
        return this.f156749n;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m243642i() {
        m243643j();
        m243644l();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m243647o() {
        this.f156752q.set(false);
    }

    @Override // com.ss.android.vc.meeting.module.p3129j.AbstractC61994a.AbstractC61995a
    /* renamed from: k */
    public void mo213817k() {
        this.f156749n.notifyDataSetChanged();
    }

    @Override // com.ss.android.vc.meeting.model.LobbyData.AbstractC61370a
    /* renamed from: a */
    public void mo212424a() {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.$$Lambda$ParticipantViewPagerViewHolder$6o8eCV1loSn9q8eH6CdmXCriTug */

            public final void run() {
                ParticipantViewPagerViewHolder.lambda$6o8eCV1loSn9q8eH6CdmXCriTug(ParticipantViewPagerViewHolder.this);
            }
        });
    }

    /* renamed from: e */
    private boolean m243638e() {
        return VideoChatModuleDependency.m236629b().equals(this.f156750o.mo212091I().mo212490a().mo212478j());
    }

    /* renamed from: f */
    private boolean m243639f() {
        return this.f156750o.mo212091I().mo212494b().mo212605j().isCoHost();
    }

    /* renamed from: g */
    private boolean m243640g() {
        if (m243639f() || m243638e()) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private void m243641h() {
        int i;
        if (this.f156755t.equals("page2")) {
            i = 350;
        } else {
            i = 0;
        }
        C60735ab.m236002a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.$$Lambda$ParticipantViewPagerViewHolder$6o8eCV1loSn9q8eH6CdmXCriTug */

            public final void run() {
                ParticipantViewPagerViewHolder.lambda$6o8eCV1loSn9q8eH6CdmXCriTug(ParticipantViewPagerViewHolder.this);
            }
        }, (long) i);
    }

    /* renamed from: m */
    private boolean m243645m() {
        if (this.f156750o.mo212090H() == VideoChat.MeetingSource.VC_FROM_INTERVIEW && this.f156750o.mo212089G() == ParticipantRole.INTERVIEWEE) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.ParticipantViewPagerViewHolder$2 */
    public static /* synthetic */ class C623512 {

        /* renamed from: a */
        static final /* synthetic */ int[] f156763a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.ParticipantItem$ParticipantType[] r0 = com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.ParticipantItem.ParticipantType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.ParticipantViewPagerViewHolder.C623512.f156763a = r0
                com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.ParticipantItem$ParticipantType r1 = com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.ParticipantItem.ParticipantType.SUGGESTION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.ParticipantViewPagerViewHolder.C623512.f156763a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.ParticipantItem$ParticipantType r1 = com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.ParticipantItem.ParticipantType.CALLING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.ParticipantViewPagerViewHolder.C623512.f156763a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.ParticipantItem$ParticipantType r1 = com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.ParticipantItem.ParticipantType.WAITING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.ParticipantViewPagerViewHolder.C623512.f156763a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.ParticipantItem$ParticipantType r1 = com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.ParticipantItem.ParticipantType.IN_MEETING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.ParticipantViewPagerViewHolder.C623512.<clinit>():void");
        }
    }

    /* renamed from: d */
    private void m243637d() {
        this.f156742g.setOnClickListener(this);
        C62347k kVar = new C62347k(this.f156753r, this.f156750o);
        this.f156749n = kVar;
        this.f156736a.setAdapter(kVar);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f156753r, 1, false);
        this.f156751p = linearLayoutManager;
        this.f156736a.setLayoutManager(linearLayoutManager);
        this.f156736a.setItemAnimator(null);
        this.f156736a.setAdapter(this.f156749n);
        this.f156736a.setOnScrollListener(this);
    }

    /* renamed from: c */
    public void mo215637c() {
        C60762k kVar = this.f156754s;
        if (kVar != null) {
            kVar.mo208368a();
        }
        this.f156750o.mo212091I().mo212490a().mo212470b(this);
        this.f156750o.mo212091I().mo212497d().mo212420b(this);
        this.f156750o.an().mo214605b(this);
        this.f156750o.mo212091I().mo212497d().mo212421c();
    }

    /* renamed from: j */
    private void m243643j() {
        List<VCLobbyParticipant> d = this.f156750o.mo212091I().mo212497d().mo212422d();
        List<Participant> g = this.f156750o.mo212091I().mo212494b().mo212602g();
        List<Participant> h = this.f156750o.mo212091I().mo212494b().mo212603h();
        ArrayList arrayList = new ArrayList();
        String str = this.f156755t;
        str.hashCode();
        if (str.equals("page1")) {
            m243631a(h, d, g, arrayList);
        } else if (str.equals("page2")) {
            m243629a(d, arrayList);
        }
        this.f156749n.mo215605a(arrayList);
        m243646n();
    }

    /* renamed from: l */
    private void m243644l() {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        this.f156757v.mo78232a((ViewPager) this.f156756u, true);
        if (this.f156755t.equals("page2")) {
            this.f156744i.setVisibility(8);
            return;
        }
        boolean f = C63496i.m248852f(this.f156750o);
        if (this.f156750o.mo212057f() != VideoChat.Type.MEET || (!m243640g() && !f)) {
            z = false;
        } else {
            z = true;
        }
        if (!z || !f || m243638e() || m243639f()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z || !f || m243638e() || !m243639f()) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (this.f156750o.mo212091I().mo212490a().mo212473e() == VideoChat.Type.CALL) {
            this.f156744i.setVisibility(8);
        } else if (m243645m() || GuestJoinMeetingUtil.m245480b() || this.f156750o.al().mo213182i()) {
            RelativeLayout relativeLayout = this.f156744i;
            if (m243640g()) {
                i = 0;
            } else {
                i = 8;
            }
            relativeLayout.setVisibility(i);
            this.f156757v.setVisibility(8);
            this.f156756u.setScanScroll(false);
            if (!this.f156750o.al().mo213182i()) {
                return;
            }
            if (z3) {
                this.f156747l.setVisibility(0);
                this.f156745j.setVisibility(0);
                this.f156746k.setVisibility(8);
                this.f156748m.setVisibility(8);
            } else if (z2) {
                this.f156747l.setVisibility(8);
                this.f156746k.setVisibility(8);
                this.f156745j.setVisibility(8);
                this.f156748m.setVisibility(0);
            } else {
                this.f156747l.setVisibility(8);
                this.f156745j.setVisibility(0);
                this.f156746k.setVisibility(0);
                this.f156748m.setVisibility(8);
            }
        } else if (z) {
            this.f156744i.setVisibility(0);
            this.f156757v.setVisibility(0);
            this.f156756u.setScanScroll(true);
            if (z3) {
                this.f156747l.setVisibility(0);
                this.f156745j.setVisibility(0);
                this.f156746k.setVisibility(8);
                this.f156748m.setVisibility(8);
            } else if (z2) {
                this.f156747l.setVisibility(8);
                this.f156746k.setVisibility(8);
                this.f156745j.setVisibility(8);
                this.f156748m.setVisibility(0);
            } else {
                this.f156747l.setVisibility(8);
                this.f156745j.setVisibility(0);
                this.f156746k.setVisibility(0);
                this.f156748m.setVisibility(8);
            }
        } else {
            this.f156744i.setVisibility(8);
            this.f156757v.setVisibility(0);
            this.f156756u.setScanScroll(true);
        }
    }

    /* renamed from: n */
    private void m243646n() {
        int findFirstVisibleItemPosition = this.f156751p.findFirstVisibleItemPosition();
        if (findFirstVisibleItemPosition >= 0 && this.f156749n.getItemCount() != 0 && findFirstVisibleItemPosition < this.f156749n.getItemCount()) {
            ParticipantItem b = this.f156749n.mo215646b(findFirstVisibleItemPosition);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f156739d.getLayoutParams();
            if (b == null) {
                return;
            }
            if (findFirstVisibleItemPosition >= 0) {
                int i = C623512.f156763a[b.mo215631b().ordinal()];
                if (i == 1) {
                    this.f156739d.setVisibility(8);
                    this.f156759x = StickerHeaderType.SUGGESTING;
                    this.f156740e.setText(UIHelper.mustacheFormat((int) R.string.View_M_SuggestionsNumberBraces, "number", String.valueOf(b.mo215632c())));
                    layoutParams.height = C60773o.m236115a(48.0d);
                    this.f156739d.setLayoutParams(layoutParams);
                } else if (i == 2) {
                    this.f156739d.bringToFront();
                    this.f156739d.setVisibility(0);
                    this.f156743h.setVisibility(0);
                    this.f156741f.setVisibility(8);
                    this.f156759x = StickerHeaderType.CALLING;
                    this.f156740e.setText(UIHelper.mustacheFormat((int) R.string.View_M_CallingNumber, "number", String.valueOf(b.mo215632c())));
                    layoutParams.height = C60773o.m236115a(48.0d);
                    this.f156739d.setLayoutParams(layoutParams);
                    this.f156742g.setVisibility(8);
                } else if (i == 3) {
                    this.f156739d.bringToFront();
                    this.f156739d.setVisibility(0);
                    this.f156743h.setVisibility(0);
                    if (this.f156750o.al().mo213181h()) {
                        this.f156741f.setVisibility(0);
                    } else {
                        this.f156741f.setVisibility(8);
                    }
                    this.f156759x = StickerHeaderType.WAITING;
                    this.f156740e.setText(UIHelper.mustacheFormat((int) R.string.View_M_WaitingToJoin, "number", String.valueOf(b.mo215632c())));
                    layoutParams.height = C60773o.m236115a(58.0d);
                    this.f156739d.setLayoutParams(layoutParams);
                    if (b.mo215632c() <= 1 || this.f156750o.mo212058g() != VideoChat.Type.MEET || !m243640g() || this.f156750o.mo212098P()) {
                        this.f156742g.setVisibility(8);
                        return;
                    }
                    this.f156742g.setVisibility(0);
                    this.f156743h.setVisibility(0);
                    this.f156742g.setText(R.string.View_M_AdmitAllButton);
                } else if (i == 4) {
                    this.f156759x = StickerHeaderType.IN_MEETING;
                    if (!this.f156758w) {
                        this.f156739d.setVisibility(8);
                    } else {
                        this.f156739d.bringToFront();
                        this.f156739d.setVisibility(0);
                    }
                    layoutParams.height = C60773o.m236115a(48.0d);
                    this.f156739d.setLayoutParams(layoutParams);
                    this.f156742g.setVisibility(8);
                    this.f156741f.setVisibility(8);
                    this.f156740e.setText(UIHelper.mustacheFormat((int) R.string.View_M_AlreadyInMeetingNumberBraces, "number", String.valueOf(b.mo215632c())));
                }
            } else {
                this.f156739d.invalidate();
                this.f156739d.setVisibility(8);
                layoutParams.height = C60773o.m236115a(48.0d);
                this.f156739d.setLayoutParams(layoutParams);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3129j.AbstractC61994a.AbstractC61995a
    /* renamed from: c */
    public void mo213812c(int i) {
        this.f156749n.notifyDataSetChanged();
    }

    @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    public void onInMeetingInfoUpdate(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.$$Lambda$ParticipantViewPagerViewHolder$6o8eCV1loSn9q8eH6CdmXCriTug */

            public final void run() {
                ParticipantViewPagerViewHolder.lambda$6o8eCV1loSn9q8eH6CdmXCriTug(ParticipantViewPagerViewHolder.this);
            }
        });
    }

    /* renamed from: a */
    public View mo215635a(String str) {
        this.f156755t = str;
        View inflate = LayoutInflater.from(this.f156753r).inflate(R.layout.fragment_participant_list_child, (ViewGroup) null);
        m243628a(inflate);
        m243637d();
        m243641h();
        this.f156745j.setOnClickListener(this);
        this.f156746k.setOnClickListener(this);
        this.f156747l.setOnClickListener(this);
        this.f156748m.setOnClickListener(this);
        this.f156739d.setOnClickListener(this);
        return inflate;
    }

    /* renamed from: b */
    private void m243635b(List<ParticipantItem> list) {
        String str;
        if (this.f156750o.al().mo213181h()) {
            VCBreakoutRoomInfo k = this.f156750o.al().mo213184k();
            if (k != null) {
                str = k.getBreakoutRoomId();
            } else {
                str = "";
            }
            for (int i = 0; i < list.size(); i++) {
                ParticipantItem participantItem = list.get(i);
                Participant participant = participantItem.f156729a;
                if (participant != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(participant.getBreakoutRoomId()) && !str.equals(participant.getBreakoutRoomId())) {
                    list.remove(participantItem);
                }
            }
        }
    }

    /* renamed from: a */
    private void m243628a(View view) {
        this.f156736a = (RecyclerView) view.findViewById(R.id.participant_list);
        this.f156737b = (FrameLayout) view.findViewById(R.id.fl_participant_list_container);
        this.f156738c = (FrameLayout) view.findViewById(R.id.fl_suggestion_empty);
        this.f156739d = (ViewGroup) view.findViewById(R.id.participant_list_sticky);
        this.f156740e = (TextView) view.findViewById(R.id.participant_sticky_text);
        this.f156742g = (TextView) view.findViewById(R.id.participant_sticky_text_extra);
        this.f156743h = (TextView) view.findViewById(R.id.participant_sticky_arrow);
        this.f156741f = (TextView) view.findViewById(R.id.participant_sticky_lobby_tips);
        this.f156744i = (RelativeLayout) view.findViewById(R.id.bottom_action_container);
        this.f156745j = (LinearLayout) view.findViewById(R.id.btn_mute_all);
        this.f156746k = (LinearLayout) view.findViewById(R.id.btn_unmute_all);
        this.f156747l = (LinearLayout) view.findViewById(R.id.btn_more);
        this.f156748m = (LinearLayout) view.findViewById(R.id.btn_reclaim_host);
    }

    public void onClick(View view) {
        BreakoutRoomManage breakoutRoomManage;
        String str;
        VCBreakoutRoomInfo k;
        float f;
        if (view.getId() == R.id.btn_mute_all) {
            C60700b.m235851b("ParticipantViewPagerViewHolder", "[onClick]", "click mute all button");
            MeetingOnTheCallEvent2.m249823a().mo220301a(this.f156750o, "mute_all");
            if (this.f156750o.ao().mo218468d()) {
                boolean[] zArr = {this.f156750o.mo212056e().getVideoChatSettings().getAllowPartiUnMute()};
                UDCheckBoxDialogBuilder cVar = (UDCheckBoxDialogBuilder) new UDCheckBoxDialogBuilder(view.getContext()).mo90892a(UIHelper.getString(R.string.View_M_AllowParticipantsToUnmute)).mo90893a(zArr[0]).mo90891a(new UDCheckBox.OnCheckedChangeListener(zArr) {
                    /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.$$Lambda$ParticipantViewPagerViewHolder$x4U7E0I3c6PqMygylE877V_12bk */
                    public final /* synthetic */ boolean[] f$0;

                    {
                        this.f$0 = r1;
                    }

                    @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.OnCheckedChangeListener
                    public final void onCheckedChanged(UDCheckBox uDCheckBox, boolean z) {
                        ParticipantViewPagerViewHolder.lambda$x4U7E0I3c6PqMygylE877V_12bk(this.f$0, uDCheckBox, z);
                    }
                }).title(UIHelper.getString(R.string.View_M_MuteAllCurrentAndNewParticipants));
                if (UDUiModeUtils.m93320a(view.getContext().getResources().getConfiguration())) {
                    f = 0.7f;
                } else {
                    f = 0.4f;
                }
                ((UDCheckBoxDialogBuilder) ((UDCheckBoxDialogBuilder) ((UDCheckBoxDialogBuilder) cVar.maskAlpha(f)).addActionButton(R.id.ud_dialog_btn_primary, UIHelper.getString(R.string.View_M_MuteAll), new DialogInterface.OnClickListener(zArr) {
                    /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.$$Lambda$ParticipantViewPagerViewHolder$c5tWG4XItnXmoq_OMsHLnQdmhVU */
                    public final /* synthetic */ boolean[] f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ParticipantViewPagerViewHolder.lambda$c5tWG4XItnXmoq_OMsHLnQdmhVU(ParticipantViewPagerViewHolder.this, this.f$1, dialogInterface, i);
                    }
                })).addActionButton(R.id.ud_dialog_btn_secondary, UIHelper.getString(R.string.View_G_CancelButton), new DialogInterface.OnClickListener() {
                    /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.$$Lambda$ParticipantViewPagerViewHolder$KixdjEurPpERTUHrljdTbN1mjw */

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ParticipantViewPagerViewHolder.m271320lambda$KixdjEurPpERTUHrljdTbN1mjw(ParticipantViewPagerViewHolder.this, dialogInterface, i);
                    }
                })).show();
                return;
            }
            VCDialogUtils.m236178a(view.getContext(), (int) R.string.View_M_MuteAllCurrentAndNewParticipants, 2, (int) R.string.View_G_CancelButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.$$Lambda$ParticipantViewPagerViewHolder$d1E_UtmuRZC9_cGyktRJ6lBxN0 */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    ParticipantViewPagerViewHolder.m271322lambda$d1E_UtmuRZC9_cGyktRJ6lBxN0(ParticipantViewPagerViewHolder.this, dialogInterface, i);
                }
            }, (int) R.string.View_M_MuteAll, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.$$Lambda$ParticipantViewPagerViewHolder$VekJ9cSvxsI5yIXbmbU9Kn1sv8 */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    ParticipantViewPagerViewHolder.m271321lambda$VekJ9cSvxsI5yIXbmbU9Kn1sv8(ParticipantViewPagerViewHolder.this, dialogInterface, i);
                }
            }, false);
            bi.m250172a(true, this.f156750o.mo212056e());
            return;
        }
        ParticipantItem participantItem = null;
        if (view.getId() == R.id.participant_sticky_text_extra) {
            C60700b.m235851b("ParticipantViewPagerViewHolder", "[onClick4]", "user click admit all button");
            C63742at.m250068a(this.f156750o, "admit_all", "", "");
            MeetingOnTheCallEvent2.m249823a().mo220306a("admit_all", "none", this.f156750o);
            VcBizService.manageApproval(this.f156750o.mo212055d(), ManageApprovalRequest.ApprovalType.MEETING_LOBBY, ManageApprovalRequest.ApprovalAction.ALL_PASS, null, null);
        } else if (view.getId() == R.id.btn_unmute_all) {
            if (!this.f156752q.get()) {
                this.f156752q.set(true);
                C60735ab.m236002a(new Runnable() {
                    /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.$$Lambda$ParticipantViewPagerViewHolder$obm6TkPpkzuBEi8NVmZ3cHrp8V4 */

                    public final void run() {
                        ParticipantViewPagerViewHolder.lambda$obm6TkPpkzuBEi8NVmZ3cHrp8V4(ParticipantViewPagerViewHolder.this);
                    }
                }, 1000);
                if (!this.f156750o.al().mo213182i() || (k = this.f156750o.al().mo213184k()) == null) {
                    str = null;
                    breakoutRoomManage = null;
                } else {
                    String breakoutRoomId = k.getBreakoutRoomId();
                    BreakoutRoomManage breakoutRoomManage2 = new BreakoutRoomManage();
                    breakoutRoomManage2.setManageType(BreakoutRoomManage.ManageType.UPDATE_SETTINGS);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(k);
                    breakoutRoomManage2.setRoomInfos(arrayList);
                    breakoutRoomManage = breakoutRoomManage2;
                    str = breakoutRoomId;
                }
                VcBizService.sendManageRequest(this.f156750o.mo212055d(), str, breakoutRoomManage, HostManageRequest.Action.MUTE_ALL_MICROPHONE, (String) null, (String) null, (ParticipantType) null, false, false, false, (Boolean) false, (String) null);
                C60738ac.m236037c((int) R.string.View_G_RequestSent);
                bi.m250172a(false, this.f156750o.mo212056e());
                C60700b.m235851b("ParticipantViewPagerViewHolder", "[onClick5]", "click unmute all button");
                MeetingOnTheCallEvent2.m249823a().mo220301a(this.f156750o, "unmute_all");
            }
        } else if (view.getId() == R.id.btn_more) {
            View$OnClickListenerC62384b bVar = (View$OnClickListenerC62384b) View$OnClickListenerC62384b.m243809a(this.f156753r, this.f156747l, this.f156750o).mo219699g();
            if (bVar != null) {
                bVar.mo215682e();
            }
        } else if (view.getId() == R.id.participant_list_sticky) {
            if (this.f156759x == StickerHeaderType.IN_MEETING) {
                participantItem = mo215636b().mo215647b(ParticipantItem.ParticipantType.IN_MEETING);
            } else if (this.f156759x == StickerHeaderType.SUGGESTING) {
                participantItem = mo215636b().mo215647b(ParticipantItem.ParticipantType.SUGGESTION);
            } else if (this.f156759x == StickerHeaderType.CALLING) {
                participantItem = mo215636b().mo215647b(ParticipantItem.ParticipantType.CALLING);
            } else if (this.f156759x == StickerHeaderType.WAITING) {
                participantItem = mo215636b().mo215647b(ParticipantItem.ParticipantType.WAITING);
            }
            if (participantItem == null) {
                C60700b.m235851b("ParticipantViewPagerViewHolder", "[onClickSticky]", "participantItem is null");
            } else if (participantItem.f156731c) {
                this.f156743h.setText(R.string.iconfont_icon_expand_right_solid);
                mo215636b().mo215601a(participantItem);
            } else {
                this.f156743h.setText(R.string.iconfont_icon_expand_down_solid);
                mo215636b().mo215609b(participantItem);
            }
        } else if (view.getId() == R.id.btn_reclaim_host) {
            final String j = this.f156750o.mo212091I().mo212490a().mo212478j();
            final String i = this.f156750o.mo212091I().mo212490a().mo212477i();
            bi.m250178c(i, j, this.f156750o.mo212056e());
            VcBizSender.m249293j(this.f156750o.mo212055d()).mo219893b(new AbstractC63598b<C60976j>() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.ParticipantViewPagerViewHolder.C623501 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                }

                /* renamed from: a */
                public void onSuccess(C60976j jVar) {
                    bi.m250170a(i, j, true, ParticipantViewPagerViewHolder.this.f156750o.mo212056e());
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C62347k kVar = this.f156749n;
        if (kVar != null) {
            kVar.mo215600a(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m243636c(DialogInterface dialogInterface, int i) {
        bf.m250160a(this.f156750o.mo212056e(), false, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m243634b(DialogInterface dialogInterface, int i) {
        bf.m250160a(this.f156750o.mo212056e(), false, false);
        MeetingPopupEvent.m249838a().mo220322a("cancel", "mute_all", true, this.f156750o.mo212056e());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m243627a(DialogInterface dialogInterface, int i) {
        BreakoutRoomManage breakoutRoomManage;
        String str;
        String str2;
        VCBreakoutRoomInfo k;
        if (!this.f156750o.al().mo213182i() || (k = this.f156750o.al().mo213184k()) == null) {
            str = null;
            breakoutRoomManage = null;
        } else {
            String breakoutRoomId = k.getBreakoutRoomId();
            BreakoutRoomManage breakoutRoomManage2 = new BreakoutRoomManage();
            breakoutRoomManage2.setManageType(BreakoutRoomManage.ManageType.UPDATE_SETTINGS);
            ArrayList arrayList = new ArrayList();
            arrayList.add(k);
            breakoutRoomManage2.setRoomInfos(arrayList);
            str = breakoutRoomId;
            breakoutRoomManage = breakoutRoomManage2;
        }
        VcBizService.sendManageRequest(this.f156750o.mo212055d(), str, breakoutRoomManage, HostManageRequest.Action.MUTE_ALL_MICROPHONE, (String) null, (String) null, (ParticipantType) null, true, false, true, (Boolean) true, (String) null);
        C60738ac.m236037c((int) R.string.View_M_AllCurrentAndNewParticipantsMuted);
        AbsBreakoutRoomControl al = this.f156750o.al();
        VideoChat e = this.f156750o.mo212056e();
        boolean h = al.mo213181h();
        if (al.mo213183j()) {
            str2 = "mainroom";
        } else {
            str2 = "inrooms";
        }
        bf.m250161a(e, true, true, h ? 1 : 0, str2);
        C60700b.m235851b("ParticipantViewPagerViewHolder", "[onClick3]", "click mute all button");
        MeetingPopupEvent.m249838a().mo220322a("confirm", "mute_all", true, this.f156750o.mo212056e());
    }

    /* renamed from: a */
    private void m243629a(List<VCLobbyParticipant> list, List<ParticipantItem> list2) {
        List<Participant> arrayList = new ArrayList<>();
        if (!m243640g() || list == null || list.size() <= 0) {
            arrayList = this.f156750o.mo212091I().mo212494b().mo212604i();
        } else {
            for (Participant participant : this.f156750o.mo212091I().mo212494b().mo212604i()) {
                if (!this.f156750o.mo212091I().mo212497d().mo212418a(participant.getId())) {
                    arrayList.add(participant);
                }
            }
        }
        if (!VideoChatUIConfigService.m249505h(this.f156750o) || arrayList == null || arrayList.size() <= 0) {
            this.f156738c.setVisibility(0);
            return;
        }
        this.f156738c.setVisibility(8);
        for (Participant participant2 : arrayList) {
            list2.add(new ParticipantItem(participant2, arrayList.size(), ParticipantItem.ParticipantType.SUGGESTION, ParticipantItem.GroupType.USER));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        m243646n();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m243633a(boolean[] zArr, UDCheckBox uDCheckBox, boolean z) {
        uDCheckBox.setChecked(z);
        zArr[0] = z;
    }

    /* renamed from: a */
    private void m243630a(List<ParticipantItem> list, List<Participant> list2, ParticipantItem.ParticipantType participantType) {
        ParticipantItem participantItem = new ParticipantItem(null, list2.size(), participantType, ParticipantItem.GroupType.TITLE);
        participantItem.f156731c = mo215636b().mo215607a(participantType);
        list.add(participantItem);
        List<ParticipantItem> arrayList = new ArrayList<>();
        for (Participant participant : list2) {
            arrayList.add(new ParticipantItem(participant, list2.size(), participantType, ParticipantItem.GroupType.USER));
        }
        participantItem.mo215630a(arrayList);
        if (mo215636b().mo215607a(participantType)) {
            list.addAll(arrayList);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m243632a(boolean[] zArr, DialogInterface dialogInterface, int i) {
        BreakoutRoomManage breakoutRoomManage;
        String str;
        String str2;
        VCBreakoutRoomInfo k;
        if (!this.f156750o.al().mo213182i() || (k = this.f156750o.al().mo213184k()) == null) {
            str = null;
            breakoutRoomManage = null;
        } else {
            String breakoutRoomId = k.getBreakoutRoomId();
            BreakoutRoomManage breakoutRoomManage2 = new BreakoutRoomManage();
            breakoutRoomManage2.setManageType(BreakoutRoomManage.ManageType.UPDATE_SETTINGS);
            ArrayList arrayList = new ArrayList();
            arrayList.add(k);
            breakoutRoomManage2.setRoomInfos(arrayList);
            str = breakoutRoomId;
            breakoutRoomManage = breakoutRoomManage2;
        }
        VcBizService.sendManageRequest(this.f156750o.mo212055d(), str, breakoutRoomManage, HostManageRequest.Action.MUTE_ALL_MICROPHONE, (String) null, (String) null, (ParticipantType) null, true, false, true, Boolean.valueOf(zArr[0]), (String) null);
        C60738ac.m236037c((int) R.string.View_M_AllCurrentAndNewParticipantsMuted);
        AbsBreakoutRoomControl al = this.f156750o.al();
        VideoChat e = this.f156750o.mo212056e();
        boolean h = al.mo213181h();
        if (al.mo213183j()) {
            str2 = "mainroom";
        } else {
            str2 = "inrooms";
        }
        bf.m250161a(e, true, true, h ? 1 : 0, str2);
        C60700b.m235851b("ParticipantViewPagerViewHolder", "[onClick2]", "click mute all button");
    }

    public ParticipantViewPagerViewHolder(FragmentActivity fragmentActivity, C61303k kVar, CanScrollViewPager canScrollViewPager, TabLayout tabLayout) {
        this.f156753r = fragmentActivity;
        this.f156750o = kVar;
        this.f156756u = canScrollViewPager;
        this.f156757v = tabLayout;
        kVar.mo212091I().mo212497d().mo212415a(this);
        kVar.mo212091I().mo212490a().mo212468a(this);
        kVar.an().mo214602a(this);
    }

    /* renamed from: a */
    private void m243631a(List<Participant> list, List<VCLobbyParticipant> list2, List<Participant> list3, List<ParticipantItem> list4) {
        boolean z;
        if (list.size() > 0) {
            m243630a(list4, list, ParticipantItem.ParticipantType.CALLING);
        }
        if (m243640g() && !C60742af.m236059a(list2)) {
            ParticipantItem.ParticipantType participantType = ParticipantItem.ParticipantType.WAITING;
            ParticipantItem participantItem = new ParticipantItem(null, list2.size(), participantType, ParticipantItem.GroupType.TITLE);
            participantItem.f156731c = mo215636b().mo215607a(participantType);
            list4.add(participantItem);
            List<ParticipantItem> arrayList = new ArrayList<>();
            for (VCLobbyParticipant vCLobbyParticipant : list2) {
                arrayList.add(new ParticipantItem(null, vCLobbyParticipant, list2.size(), participantType, ParticipantItem.GroupType.USER));
            }
            participantItem.mo215630a(arrayList);
            if (mo215636b().mo215607a(participantType)) {
                list4.addAll(arrayList);
            }
        }
        if (list3.size() <= 0 || (C60742af.m236059a(list) && C60742af.m236059a(list2))) {
            z = false;
        } else {
            z = true;
        }
        this.f156758w = z;
        if (z) {
            m243630a(list4, list3, ParticipantItem.ParticipantType.IN_MEETING);
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Participant participant : list3) {
                arrayList2.add(new ParticipantItem(participant, list3.size(), ParticipantItem.ParticipantType.IN_MEETING, ParticipantItem.GroupType.USER));
            }
            list4.addAll(arrayList2);
        }
        m243635b(list4);
    }
}
