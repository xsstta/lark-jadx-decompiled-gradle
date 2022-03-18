package com.ss.android.vc.meeting.module.interpretation;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60762k;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.entity.InviteDialogBean;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.C61381c;
import com.ss.android.vc.meeting.model.C61386f;
import com.ss.android.vc.meeting.module.VCBreakoutRoomInfo;
import com.ss.android.vc.meeting.module.interpretation.p3127b.C61951g;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.C62347k;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.ParticipantItem;
import com.ss.android.vc.meeting.module.searchInvite.AbstractC62913a;
import com.ss.android.vc.meeting.module.searchInvite.AbstractC62923c;
import com.ss.android.vc.meeting.module.searchInvite.C62927f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.interpretation.g */
public class View$OnClickListenerC61976g extends RecyclerView.OnScrollListener implements View.OnClickListener, AbstractC61222a.AbstractC61223a, C61381c.AbstractC61382a, C61386f.AbstractC61387a {

    /* renamed from: a */
    public RelativeLayout f155674a;

    /* renamed from: b */
    public RelativeLayout f155675b;

    /* renamed from: c */
    public TextView f155676c;

    /* renamed from: d */
    public FrameLayout f155677d;

    /* renamed from: e */
    public AbstractC62913a f155678e;

    /* renamed from: f */
    public boolean f155679f;

    /* renamed from: g */
    private Activity f155680g;

    /* renamed from: h */
    private C61303k f155681h;

    /* renamed from: i */
    private AbstractC61222a f155682i;

    /* renamed from: j */
    private C62347k f155683j;

    /* renamed from: k */
    private RecyclerView f155684k;

    /* renamed from: l */
    private FrameLayout f155685l;

    /* renamed from: m */
    private View f155686m;

    /* renamed from: n */
    private View f155687n;

    /* renamed from: o */
    private FrameLayout f155688o;

    /* renamed from: p */
    private LinearLayoutManager f155689p;

    /* renamed from: q */
    private C60762k f155690q;

    /* renamed from: r */
    private Boolean f155691r;

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

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m242143i() {
        this.f155674a.callOnClick();
    }

    @Override // com.ss.android.vc.meeting.model.C61386f.AbstractC61387a
    /* renamed from: a */
    public void mo212586a() {
        AbstractC62913a aVar = this.f155678e;
        if (aVar != null) {
            aVar.mo217408c();
        }
    }

    /* renamed from: f */
    private void m242140f() {
        this.f155674a.setClickable(true);
        this.f155674a.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.interpretation.$$Lambda$g$euaLlwGMCsUlptudBI0UpOAMpT0 */

            public final void onClick(View view) {
                View$OnClickListenerC61976g.this.m242137b(view);
            }
        });
        this.f155675b.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.interpretation.$$Lambda$g$boW0R0Yc9KcIaDOq4auSAKABA */

            public final void onClick(View view) {
                View$OnClickListenerC61976g.this.m242135a((View$OnClickListenerC61976g) view);
            }
        });
    }

    /* renamed from: g */
    private void m242141g() {
        C60762k kVar = new C60762k(this.f155680g);
        this.f155690q = kVar;
        kVar.mo208369a(new C60762k.AbstractC60764a() {
            /* class com.ss.android.vc.meeting.module.interpretation.$$Lambda$g$uKlLQm8s3qokXXHyeWgNeyyGZ8 */

            @Override // com.ss.android.vc.common.p3083e.C60762k.AbstractC60764a
            public final void onKeyboardStateChanged(boolean z, int i) {
                View$OnClickListenerC61976g.this.m242136a(z, i);
            }
        });
    }

    /* renamed from: h */
    private void m242142h() {
        C62347k kVar = new C62347k(this.f155680g, this.f155681h, this.f155682i, true, this.f155691r.booleanValue());
        this.f155683j = kVar;
        this.f155684k.setAdapter(kVar);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f155680g, 1, false);
        this.f155689p = linearLayoutManager;
        this.f155684k.setLayoutManager(linearLayoutManager);
        this.f155684k.setItemAnimator(null);
        this.f155684k.setOnScrollListener(this);
        AbstractC61222a aVar = this.f155682i;
        if (aVar instanceof C61951g) {
            aVar.mo211609a(this);
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a.AbstractC61223a
    public void bY_() {
        this.f155682i.dismiss();
        this.f155681h.mo212091I().mo212490a().mo212470b(this);
        this.f155681h.mo212091I().mo212490a().mo212465a().mo212585b(this);
        C60762k kVar = this.f155690q;
        if (kVar != null) {
            kVar.mo208368a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m242138d() {
        List<Participant> f = this.f155681h.mo212091I().mo212494b().mo212601f();
        ArrayList<Participant> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (f != null && !f.isEmpty()) {
            for (Participant participant : f) {
                if (participant.getStatus() != Participant.Status.RINGING) {
                    arrayList.add(participant);
                }
            }
        }
        if (arrayList.size() > 0) {
            for (Participant participant2 : arrayList) {
                arrayList2.add(new ParticipantItem(participant2, arrayList.size(), ParticipantItem.ParticipantType.IN_MEETING, ParticipantItem.GroupType.USER));
            }
        }
        this.f155683j.mo215605a(arrayList2);
    }

    /* renamed from: c */
    public View mo214544c() {
        View inflate = LayoutInflater.from(this.f155680g).inflate(R.layout.dialog_interpreter_select, (ViewGroup) null);
        this.f155684k = (RecyclerView) inflate.findViewById(R.id.participant_list);
        this.f155685l = (FrameLayout) inflate.findViewById(R.id.language_outer_container);
        this.f155674a = (RelativeLayout) inflate.findViewById(R.id.search_bar_normal);
        this.f155675b = (RelativeLayout) inflate.findViewById(R.id.search_mask);
        this.f155676c = (TextView) inflate.findViewById(R.id.no_result_textview);
        this.f155677d = (FrameLayout) inflate.findViewById(R.id.search_list_layout);
        this.f155686m = inflate.findViewById(R.id.search_mask_keyboard_padding);
        this.f155687n = inflate.findViewById(R.id.divider_view);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.desktop_interpreter_manage_close);
        this.f155688o = frameLayout;
        frameLayout.setOnClickListener(this);
        m242142h();
        m242138d();
        m242139e();
        return inflate;
    }

    /* renamed from: e */
    private void m242139e() {
        InviteDialogBean.fromType fromtype;
        VCBreakoutRoomInfo k;
        m242140f();
        m242141g();
        VideoChat e = this.f155681h.mo212056e();
        if (e.getType() == VideoChat.Type.CALL) {
            fromtype = InviteDialogBean.fromType.singleUpgrade;
        } else if (e.getMeetingSource() == VideoChat.MeetingSource.VC_FROM_CALENDAR) {
            fromtype = InviteDialogBean.fromType.calendar;
        } else {
            fromtype = InviteDialogBean.fromType.normal;
        }
        int maxParticipantNum = e.getVideoChatSettings().getMaxParticipantNum();
        int size = this.f155681h.mo212091I().mo212494b().mo212600e().size();
        C60700b.m235851b("InterpreterSelectViewHolder", "[initSearchView]", "maxCount = " + maxParticipantNum + ", userCount = " + size);
        InviteDialogBean inviteDialogBean = new InviteDialogBean(e.getId(), e.getGroudId(), maxParticipantNum, size, fromtype, VideoChat.VendorType.RTC.getNumber(), false);
        if (this.f155681h.al().mo213181h() && (k = this.f155681h.al().mo213184k()) != null) {
            inviteDialogBean.setBreakoutRoomId(k.getBreakoutRoomId());
        }
        this.f155678e = new C62927f(this.f155680g, this.f155681h, this.f155677d, inviteDialogBean, true, this.f155682i, new AbstractC62923c() {
            /* class com.ss.android.vc.meeting.module.interpretation.View$OnClickListenerC61976g.C619771 */

            @Override // com.ss.android.vc.meeting.module.searchInvite.AbstractC62923c
            /* renamed from: a */
            public void mo214546a() {
                View$OnClickListenerC61976g.this.f155674a.setVisibility(0);
                View$OnClickListenerC61976g.this.f155674a.setClickable(true);
                View$OnClickListenerC61976g.this.f155675b.setVisibility(4);
                View$OnClickListenerC61976g.this.f155677d.setVisibility(4);
            }

            @Override // com.ss.android.vc.meeting.module.searchInvite.AbstractC62923c
            /* renamed from: b */
            public void mo214547b() {
                View$OnClickListenerC61976g.this.f155675b.setBackgroundColor(C60773o.m236126d(R.color.ud_N00));
                View$OnClickListenerC61976g.this.f155676c.setVisibility(4);
            }

            @Override // com.ss.android.vc.meeting.module.searchInvite.AbstractC62923c
            /* renamed from: c */
            public void mo214548c() {
                View$OnClickListenerC61976g.this.f155675b.setBackgroundColor(C60773o.m236126d(R.color.ud_N00));
                View$OnClickListenerC61976g.this.f155676c.bringToFront();
                View$OnClickListenerC61976g.this.f155676c.setVisibility(0);
            }

            @Override // com.ss.android.vc.meeting.module.searchInvite.AbstractC62923c
            /* renamed from: d */
            public void mo214549d() {
                View$OnClickListenerC61976g.this.f155675b.setBackgroundColor(C60773o.m236126d(R.color.ud_N00));
                View$OnClickListenerC61976g.this.f155676c.setVisibility(4);
            }
        }, this.f155691r);
        if (e.getType() == VideoChat.Type.CALL) {
            this.f155674a.postDelayed(new Runnable() {
                /* class com.ss.android.vc.meeting.module.interpretation.$$Lambda$g$LNt6dXFFie8B2atWleghsQZLoOM */

                public final void run() {
                    View$OnClickListenerC61976g.this.m242143i();
                }
            }, 300);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m242135a(View view) {
        this.f155678e.mo217407b();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.desktop_interpreter_manage_close) {
            this.f155682i.dismiss();
        }
    }

    @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    public void onInMeetingInfoUpdate(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.interpretation.$$Lambda$g$pwWz2elOApHWK6E63nft5tQELIw */

            public final void run() {
                View$OnClickListenerC61976g.this.m242138d();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m242137b(View view) {
        this.f155674a.setClickable(false);
        this.f155674a.setVisibility(4);
        this.f155675b.setVisibility(0);
        this.f155675b.setBackgroundColor(C60773o.m236126d(R.color.ud_N00_50));
        this.f155676c.setVisibility(4);
        this.f155677d.setVisibility(0);
        this.f155678e.mo217406a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        C62347k kVar = this.f155683j;
        if (kVar != null) {
            kVar.mo215600a(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m242136a(boolean z, int i) {
        this.f155679f = z;
        if (z) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f155686m.getLayoutParams();
            layoutParams.height = i;
            this.f155686m.setLayoutParams(layoutParams);
            return;
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f155686m.getLayoutParams();
        layoutParams2.height = 0;
        this.f155686m.setLayoutParams(layoutParams2);
    }

    public View$OnClickListenerC61976g(Activity activity, C61303k kVar, AbstractC61222a aVar, Boolean bool) {
        this.f155680g = activity;
        this.f155681h = kVar;
        this.f155682i = aVar;
        this.f155691r = bool;
        kVar.mo212091I().mo212490a().mo212468a(this);
        this.f155681h.mo212091I().mo212490a().mo212465a().mo212584a(this);
    }
}
