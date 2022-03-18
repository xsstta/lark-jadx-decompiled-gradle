package com.ss.android.vc.meeting.module.meetingdialog.participantmanage;

import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60762k;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.widget.AdaptiveWidthTextView;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.common.widget.LineHeightTextView;
import com.ss.android.vc.entity.InviteDialogBean;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.C61386f;
import com.ss.android.vc.meeting.model.data.MeetingTimeData;
import com.ss.android.vc.meeting.module.VCBreakoutRoomInfo;
import com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.View$OnClickListenerC62379p;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.C62370d;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.popupwindow.View$OnClickListenerC62387c;
import com.ss.android.vc.meeting.module.p3123g.C61878d;
import com.ss.android.vc.meeting.module.searchInvite.AbstractC62913a;
import com.ss.android.vc.meeting.module.searchInvite.AbstractC62923c;
import com.ss.android.vc.meeting.module.searchInvite.C62927f;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.service.VideoChatUIConfigService;
import com.ss.android.vc.statistics.event.C63752c;
import com.ss.android.vc.statistics.event2.MeetingOnTheCallEvent2;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.participantmanage.p */
public class View$OnClickListenerC62379p implements View.OnClickListener, C61386f.AbstractC61387a {

    /* renamed from: a */
    public ViewGroup f156857a;

    /* renamed from: b */
    public IconFontView f156858b;

    /* renamed from: c */
    public TextView f156859c;

    /* renamed from: d */
    public TextView f156860d;

    /* renamed from: e */
    public AdaptiveWidthTextView f156861e;

    /* renamed from: f */
    public LineHeightTextView f156862f;

    /* renamed from: g */
    public RelativeLayout f156863g;

    /* renamed from: h */
    RelativeLayout f156864h;

    /* renamed from: i */
    FrameLayout f156865i;

    /* renamed from: j */
    LinearLayout f156866j;

    /* renamed from: k */
    public FrameLayout f156867k;

    /* renamed from: l */
    View f156868l;

    /* renamed from: m */
    View f156869m;

    /* renamed from: n */
    TextView f156870n;

    /* renamed from: o */
    TextView f156871o;

    /* renamed from: p */
    FrameLayout f156872p;

    /* renamed from: q */
    public AbstractC62913a f156873q;

    /* renamed from: r */
    public boolean f156874r;

    /* renamed from: s */
    public final C61303k f156875s;

    /* renamed from: t */
    private final FragmentActivity f156876t;

    /* renamed from: u */
    private final AbstractC61222a f156877u;

    /* renamed from: v */
    private C60762k f156878v;

    /* renamed from: w */
    private C62370d f156879w;

    /* renamed from: x */
    private float f156880x;

    public void onClick(View view) {
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m243776m() {
        this.f156863g.callOnClick();
    }

    @Override // com.ss.android.vc.meeting.model.C61386f.AbstractC61387a
    /* renamed from: a */
    public void mo212586a() {
        AbstractC62913a aVar = this.f156873q;
        if (aVar != null) {
            aVar.mo217408c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m243777n() {
        C61878d.m241707a(this.f156876t, this.f156875s, false, true).mo211606a();
    }

    /* renamed from: g */
    private void m243770g() {
        this.f156869m.setVisibility(0);
        this.f156869m.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.$$Lambda$p$LO9yIIx7xBpPmImb4ITToUuMtRc */

            public final void onClick(View view) {
                View$OnClickListenerC62379p.this.m243769f(view);
            }
        });
    }

    /* renamed from: k */
    private void m243774k() {
        C60762k kVar = new C60762k(this.f156876t);
        this.f156878v = kVar;
        kVar.mo208369a(new C60762k.AbstractC60764a() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.$$Lambda$p$3DSppOtWbwbZrp4UvZzZUvhEhQc */

            @Override // com.ss.android.vc.common.p3083e.C60762k.AbstractC60764a
            public final void onKeyboardStateChanged(boolean z, int i) {
                View$OnClickListenerC62379p.this.m243763a((View$OnClickListenerC62379p) z, (boolean) i);
            }
        });
    }

    /* renamed from: h */
    private void m243771h() {
        AbsBreakoutRoomControl al = this.f156875s.al();
        if (al != null && al.mo213181h()) {
            List<Participant> n = al.mo213187n();
            VCBreakoutRoomInfo k = al.mo213184k();
            if (al.mo213182i() && !CollectionUtils.isEmpty(n) && k != null) {
                mo215668a(k, n.size());
            }
        }
    }

    /* renamed from: j */
    private void m243773j() {
        if (this.f156875s.al().mo213182i()) {
            this.f156865i.setVisibility(8);
            return;
        }
        this.f156865i.setVisibility(0);
        this.f156865i.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.$$Lambda$p$oHhV65DaoU2gbl0WbiExj019jlc */

            public final void onClick(View view) {
                View$OnClickListenerC62379p.this.m243766d(view);
            }
        });
    }

    /* renamed from: b */
    public void mo215669b() {
        C60762k kVar = this.f156878v;
        if (kVar != null) {
            kVar.mo208368a();
        }
        this.f156875s.mo212091I().mo212497d().mo212421c();
        this.f156875s.mo212091I().mo212490a().mo212465a().mo212585b(this);
        this.f156875s.al().mo213164a((AbsBreakoutRoomControl.AbstractC61509c) null);
        this.f156879w.mo215666a();
    }

    /* renamed from: e */
    public void mo215672e() {
        if (ParticipantUtil.m248733c(this.f156875s) || ParticipantUtil.m248736d(this.f156875s)) {
            this.f156871o.setVisibility(0);
            this.f156871o.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.$$Lambda$p$dDuf4_QNx_7F3zKplnO3WvI1IY */

                public final void onClick(View view) {
                    View$OnClickListenerC62379p.this.m243767e(view);
                }
            });
            return;
        }
        this.f156871o.setVisibility(8);
    }

    /* renamed from: l */
    private void m243775l() {
        if (VideoChatUIConfigService.m249505h(this.f156875s)) {
            this.f156866j.setVisibility(0);
        } else {
            this.f156866j.setVisibility(8);
        }
        this.f156863g.setClickable(true);
        this.f156863g.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.$$Lambda$p$kzZAlNc7BNyUDdds_huiwmn4hM */

            public final void onClick(View view) {
                View$OnClickListenerC62379p.this.m243765c(view);
            }
        });
        this.f156864h.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.$$Lambda$p$k6xkrJFF0ll1tXfTjPOmKVq6ZZ4 */

            public final void onClick(View view) {
                View$OnClickListenerC62379p.this.m243764b(view);
            }
        });
        this.f156864h.setVisibility(8);
        if (this.f156875s.al().mo213182i() && this.f156875s.al().mo213184k() != null) {
            this.f156862f.setText(UIHelper.mustacheFormat((int) R.string.View_G_SearchInRoom, "roomName", this.f156875s.al().mo213184k().getRoomTopic()));
        }
    }

    /* renamed from: c */
    public View mo215670c() {
        View inflate = LayoutInflater.from(this.f156876t).inflate(R.layout.dialog_participant_manage, (ViewGroup) null);
        m243760a(inflate);
        m243761a(this.f156876t, this.f156875s);
        m243772i();
        m243770g();
        m243768f();
        m243771h();
        mo215672e();
        return inflate;
    }

    /* renamed from: d */
    public void mo215671d() {
        this.f156857a.setVisibility(0);
        this.f156860d.setVisibility(8);
        this.f156861e.setVisibility(8);
        this.f156875s.al().mo213177e().mo5923a(this.f156876t, new AbstractC1178x() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.$$Lambda$p$RVfV4XqRQFCEM7d39mQhNjqwttU */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                View$OnClickListenerC62379p.this.m243762a((View$OnClickListenerC62379p) obj);
            }
        });
        this.f156857a.setBackgroundColor(C60773o.m236126d(R.color.function_warning_100));
        this.f156858b.setTextColor(C60773o.m236126d(R.color.function_warning_500));
    }

    /* renamed from: f */
    private void m243768f() {
        this.f156875s.al().mo213164a(new AbsBreakoutRoomControl.AbstractC61509c() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.View$OnClickListenerC62379p.C623801 */

            @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61509c
            /* renamed from: a */
            public void mo213199a() {
                View$OnClickListenerC62379p.this.mo215671d();
            }

            @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61509c
            /* renamed from: b */
            public void mo213201b() {
                AbsBreakoutRoomControl al = View$OnClickListenerC62379p.this.f156875s.al();
                if (al != null && al.mo213181h()) {
                    List<Participant> n = al.mo213187n();
                    VCBreakoutRoomInfo k = al.mo213184k();
                    if (al.mo213182i() && !CollectionUtils.isEmpty(n) && k != null) {
                        View$OnClickListenerC62379p.this.mo215668a(k, n.size());
                    }
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m243784a(MeetingTimeData aVar) {
                View$OnClickListenerC62379p.this.f156861e.setAdaptiveWidthText(aVar.mo212432a());
            }

            @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61509c
            /* renamed from: a */
            public void mo213200a(VCBreakoutRoomInfo.Status status, MeetingTimeData aVar) {
                if (status == VCBreakoutRoomInfo.Status.ON_THE_CALL) {
                    C60735ab.m236001a(new Runnable(aVar) {
                        /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.$$Lambda$p$1$e7OqUTkyoMi1RzFm8cCmDbkcTtM */
                        public final /* synthetic */ MeetingTimeData f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            View$OnClickListenerC62379p.C623801.this.m243784a(this.f$1);
                        }
                    });
                }
            }
        });
        VCBreakoutRoomInfo k = this.f156875s.al().mo213184k();
        if (k == null || !this.f156875s.al().mo213182i()) {
            this.f156857a.setVisibility(8);
            return;
        }
        VCBreakoutRoomInfo.Status status = k.getStatus();
        this.f156860d.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.View$OnClickListenerC62379p.C623812 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                View$OnClickListenerC62379p.this.f156875s.al().mo213173c("listtop-askforhelp");
                C63752c.m250235a("click", "listtop-askforhelp", View$OnClickListenerC62379p.this.f156875s.mo212056e());
            }
        });
        if (status == VCBreakoutRoomInfo.Status.COUNT_DOWN) {
            mo215671d();
        } else if (status == VCBreakoutRoomInfo.Status.ON_THE_CALL) {
            this.f156857a.setVisibility(0);
            this.f156861e.setVisibility(0);
            if (!this.f156875s.al().mo213182i() || ParticipantUtil.m248733c(this.f156875s)) {
                this.f156860d.setVisibility(8);
            } else {
                this.f156860d.setVisibility(0);
            }
            this.f156859c.setText(String.format("%s:", UIHelper.getString(R.string.View_G_Duration)));
            this.f156857a.setBackgroundColor(C60773o.m236126d(R.color.function_success_100));
            this.f156858b.setTextColor(C60773o.m236126d(R.color.function_success_500));
            this.f156861e.setAdaptiveWidthText(this.f156875s.al().mo213179f().mo212432a());
        } else if (status == VCBreakoutRoomInfo.Status.UNKNOWN || status == VCBreakoutRoomInfo.Status.IDLE) {
            this.f156857a.setVisibility(8);
        }
    }

    /* renamed from: i */
    private void m243772i() {
        InviteDialogBean.fromType fromtype;
        VCBreakoutRoomInfo k;
        m243775l();
        m243773j();
        m243774k();
        VideoChat e = this.f156875s.mo212056e();
        if (e.getType() == VideoChat.Type.CALL) {
            fromtype = InviteDialogBean.fromType.singleUpgrade;
        } else if (e.getMeetingSource() == VideoChat.MeetingSource.VC_FROM_CALENDAR) {
            fromtype = InviteDialogBean.fromType.calendar;
        } else {
            fromtype = InviteDialogBean.fromType.normal;
        }
        int maxParticipantNum = e.getVideoChatSettings().getMaxParticipantNum();
        int size = this.f156875s.mo212091I().mo212494b().mo212600e().size();
        C60700b.m235851b("ParticipantManageViewHolder", "[initInviteSearchView]", "maxCount = " + maxParticipantNum + ", userCount = " + size);
        InviteDialogBean inviteDialogBean = new InviteDialogBean(e.getId(), e.getGroudId(), maxParticipantNum, size, fromtype, VideoChat.VendorType.RTC.getNumber(), false);
        if (this.f156875s.al().mo213182i() && (k = this.f156875s.al().mo213184k()) != null) {
            inviteDialogBean.setBreakoutRoomId(k.getBreakoutRoomId());
        }
        this.f156873q = new C62927f(this.f156876t, this.f156875s, this.f156867k, this.f156864h, inviteDialogBean, new AbstractC62923c() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.View$OnClickListenerC62379p.C623823 */

            @Override // com.ss.android.vc.meeting.module.searchInvite.AbstractC62923c
            /* renamed from: b */
            public void mo214547b() {
                View$OnClickListenerC62379p.this.f156872p.setVisibility(4);
            }

            @Override // com.ss.android.vc.meeting.module.searchInvite.AbstractC62923c
            /* renamed from: c */
            public void mo214548c() {
                View$OnClickListenerC62379p.this.f156872p.setVisibility(4);
            }

            @Override // com.ss.android.vc.meeting.module.searchInvite.AbstractC62923c
            /* renamed from: d */
            public void mo214549d() {
                View$OnClickListenerC62379p.this.f156872p.setVisibility(0);
            }

            @Override // com.ss.android.vc.meeting.module.searchInvite.AbstractC62923c
            /* renamed from: a */
            public void mo214546a() {
                int i;
                View$OnClickListenerC62379p.this.f156863g.setVisibility(0);
                View$OnClickListenerC62379p.this.f156863g.setClickable(true);
                FrameLayout frameLayout = View$OnClickListenerC62379p.this.f156865i;
                if (View$OnClickListenerC62379p.this.f156875s.al().mo213182i()) {
                    i = 8;
                } else {
                    i = 0;
                }
                frameLayout.setVisibility(i);
                View$OnClickListenerC62379p.this.f156867k.setVisibility(4);
                View$OnClickListenerC62379p.this.f156872p.setVisibility(0);
            }
        });
        if (e.getType() == VideoChat.Type.CALL) {
            this.f156863g.postDelayed(new Runnable() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.$$Lambda$p$V0assROdYZTnpGTdoA5JOqxTQ */

                public final void run() {
                    View$OnClickListenerC62379p.this.m243776m();
                }
            }, 300);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m243764b(View view) {
        AbstractC62913a aVar = this.f156873q;
        if (aVar != null) {
            aVar.mo217407b();
            this.f156873q.mo217409d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m243762a(Object obj) {
        if (obj instanceof Long) {
            this.f156859c.setText(UIHelper.mustacheFormat((int) R.string.View_G_YouWillLeaveRoomAutomatically, "number", String.valueOf(((Long) obj).longValue())));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m243767e(View view) {
        C60700b.m235851b("ParticipantManageViewHolder", "onParticipantSecuritySettingsClicked", "goToSecuritySettingPage");
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.$$Lambda$p$iXbmvVridZqJGYCq68QoW23WMjw */

            public final void run() {
                View$OnClickListenerC62379p.this.m243777n();
            }
        });
        MeetingOnTheCallEvent2.m249823a().mo220302a(this.f156875s, "user_setting", "vc_meeting_hostpanel_view");
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m243769f(View view) {
        MeetingOnTheCallEvent2.m249823a().mo220309b(this.f156875s, "close_userlist");
        this.f156877u.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m243765c(View view) {
        this.f156863g.setClickable(false);
        this.f156863g.setVisibility(4);
        this.f156865i.setVisibility(8);
        this.f156864h.setVisibility(0);
        this.f156867k.setVisibility(0);
        this.f156873q.mo217406a();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m243766d(View view) {
        View$OnClickListenerC62387c cVar = (View$OnClickListenerC62387c) View$OnClickListenerC62387c.m243823a(this.f156876t, this.f156865i, this.f156875s).mo219699g();
        if (cVar != null) {
            cVar.mo211397b();
        }
        MeetingOnTheCallEvent2.m249823a().mo220302a(this.f156875s, "participants_share", "public_share_view");
    }

    /* renamed from: a */
    private void m243760a(View view) {
        this.f156857a = (ViewGroup) view.findViewById(R.id.breakout_room_banner);
        this.f156858b = (IconFontView) view.findViewById(R.id.banner_time_icon);
        this.f156859c = (TextView) view.findViewById(R.id.banner_info_text);
        this.f156860d = (TextView) view.findViewById(R.id.banner_ask_for_help);
        this.f156861e = (AdaptiveWidthTextView) view.findViewById(R.id.banner_time);
        this.f156862f = (LineHeightTextView) view.findViewById(R.id.search_et_normal);
        this.f156863g = (RelativeLayout) view.findViewById(R.id.search_bar_fake);
        this.f156864h = (RelativeLayout) view.findViewById(R.id.search_mask);
        this.f156865i = (FrameLayout) view.findViewById(R.id.search_bar_share_btn);
        this.f156866j = (LinearLayout) view.findViewById(R.id.search_area);
        this.f156867k = (FrameLayout) view.findViewById(R.id.search_result_container);
        this.f156868l = view.findViewById(R.id.search_mask_keyboard_padding);
        this.f156869m = view.findViewById(R.id.participant_manage_close);
        this.f156870n = (TextView) view.findViewById(R.id.participant_title);
        this.f156872p = (FrameLayout) view.findViewById(R.id.participant_list_container);
        this.f156871o = (TextView) view.findViewById(R.id.participant_setting_button);
    }

    /* renamed from: a */
    private void m243761a(FragmentActivity fragmentActivity, C61303k kVar) {
        this.f156879w = new C62370d(fragmentActivity, kVar, this.f156872p);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m243763a(boolean z, int i) {
        this.f156874r = z;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f156868l.getLayoutParams();
        if (!z) {
            i = 0;
        }
        layoutParams.height = i;
        this.f156868l.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public void mo215668a(VCBreakoutRoomInfo vCBreakoutRoomInfo, int i) {
        String roomTopic = vCBreakoutRoomInfo.getRoomTopic();
        if (this.f156880x == BitmapDescriptorFactory.HUE_RED) {
            this.f156880x = (float) C60773o.m236115a(264.0d);
        }
        Paint paint = new Paint();
        paint.setTextSize(this.f156870n.getTextSize());
        float measureText = paint.measureText("(" + i + ")");
        float measureText2 = paint.measureText("...(" + i + ")");
        if (paint.breakText(roomTopic, 0, roomTopic.length(), true, this.f156880x - measureText, new float[1]) < roomTopic.length()) {
            int breakText = paint.breakText(roomTopic, 0, roomTopic.length(), true, this.f156880x - measureText2, new float[1]);
            TextView textView = this.f156870n;
            textView.setText(roomTopic.substring(0, breakText) + "...(" + i + ")");
            return;
        }
        TextView textView2 = this.f156870n;
        textView2.setText(roomTopic + "(" + i + ")");
    }

    public View$OnClickListenerC62379p(FragmentActivity fragmentActivity, C61303k kVar, AbstractC61222a aVar) {
        this.f156876t = fragmentActivity;
        this.f156875s = kVar;
        this.f156877u = aVar;
        kVar.mo212091I().mo212490a().mo212465a().mo212584a(this);
    }
}
