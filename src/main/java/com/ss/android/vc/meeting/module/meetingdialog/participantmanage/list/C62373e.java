package com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.request.HostManageRequest;
import com.ss.android.vc.entity.request.ManageApprovalRequest;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.C62347k;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.ParticipantItem;
import com.ss.android.vc.meeting.utils.C63496i;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.statistics.event.C63742at;
import com.ss.android.vc.statistics.event.bi;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.e */
public class C62373e extends C62352a {

    /* renamed from: c */
    OnSingleClickListener f156840c = new OnSingleClickListener() {
        /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.C62373e.C623741 */

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            C60700b.m235851b("TitleViewHolder", "[onClick]", "click mute all button");
            bi.m250166a(C62373e.this.f156764a.mo212056e());
            VcBizService.sendManageRequest(C62373e.this.f156764a.mo212055d(), HostManageRequest.Action.MUTE_ALL_MICROPHONE, null, null, null, true, false, false, true, null);
            C60738ac.m236037c((int) R.string.View_M_YouMutedAll);
        }
    };

    /* renamed from: d */
    OnSingleClickListener f156841d = new OnSingleClickListener() {
        /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.C62373e.C623752 */

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            C60700b.m235851b("TitleViewHolder", "[onClick2]", "user click admit all button");
            C63742at.m250068a(C62373e.this.f156764a, "admit_all", "", "");
            VcBizService.manageApproval(C62373e.this.f156764a.mo212055d(), ManageApprovalRequest.ApprovalType.MEETING_LOBBY, ManageApprovalRequest.ApprovalAction.ALL_PASS, null, null);
        }
    };

    /* renamed from: e */
    private TextView f156842e;

    /* renamed from: f */
    private TextView f156843f;

    /* renamed from: g */
    private IconFontView f156844g;

    /* renamed from: h */
    private View f156845h;

    /* renamed from: i */
    private ConstraintLayout f156846i;

    /* renamed from: j */
    private TextView f156847j;

    /* renamed from: e */
    private void m243742e(ParticipantItem participantItem) {
        if (participantItem.f156731c) {
            this.f156844g.setText(R.string.iconfont_icon_expand_down_solid);
        } else {
            this.f156844g.setText(R.string.iconfont_icon_expand_right_solid);
        }
    }

    /* renamed from: f */
    private void m243743f(ParticipantItem participantItem) {
        ViewGroup.LayoutParams layoutParams = this.f156846i.getLayoutParams();
        if (participantItem.mo215631b() == ParticipantItem.ParticipantType.WAITING) {
            layoutParams.height = C60773o.m236115a(50.0d);
            this.f156846i.setLayoutParams(layoutParams);
            this.f156847j.setVisibility(0);
            return;
        }
        layoutParams.height = C60773o.m236115a(40.0d);
        this.f156846i.setLayoutParams(layoutParams);
        this.f156847j.setVisibility(8);
    }

    /* renamed from: g */
    private void m243744g(ParticipantItem participantItem) {
        ParticipantItem.ParticipantType b = participantItem.mo215631b();
        if (b != ParticipantItem.ParticipantType.WAITING || C63496i.m248844a(this.f156764a)) {
            this.f156842e.setVisibility(0);
            this.f156842e.setText(m243740a(b, participantItem.mo215632c()));
            return;
        }
        this.f156842e.setVisibility(8);
    }

    /* renamed from: a */
    private void m243741a(int i) {
        if (i == 0) {
            this.f156845h.setVisibility(8);
        } else {
            this.f156845h.setVisibility(0);
        }
    }

    /* renamed from: h */
    private void m243745h(ParticipantItem participantItem) {
        ParticipantItem.ParticipantType b = participantItem.mo215631b();
        if (this.f156764a.mo212058g() != VideoChat.Type.MEET) {
            this.f156843f.setVisibility(8);
        } else if (b == ParticipantItem.ParticipantType.IN_MEETING && C63496i.m248844a(this.f156764a)) {
            this.f156843f.setVisibility(8);
        } else if (b != ParticipantItem.ParticipantType.WAITING || !C63496i.m248844a(this.f156764a) || participantItem.mo215632c() <= 1) {
            this.f156843f.setVisibility(8);
        } else {
            this.f156843f.setText(R.string.View_M_AdmitAllButton);
            this.f156843f.setVisibility(0);
            this.f156843f.setOnClickListener(this.f156841d);
        }
    }

    /* renamed from: a */
    private String m243740a(ParticipantItem.ParticipantType participantType, int i) {
        int i2;
        if (participantType == ParticipantItem.ParticipantType.IN_MEETING) {
            i2 = R.string.View_M_AlreadyInMeetingNumberBraces;
        } else if (participantType == ParticipantItem.ParticipantType.SUGGESTION) {
            i2 = R.string.View_M_SuggestionsNumberBraces;
        } else if (participantType == ParticipantItem.ParticipantType.CALLING) {
            i2 = R.string.View_M_CallingNumber;
        } else if (participantType == ParticipantItem.ParticipantType.WAITING) {
            i2 = R.string.View_M_WaitingToJoin;
        } else {
            i2 = -1;
        }
        return UIHelper.mustacheFormat(i2, "number", String.valueOf(i));
    }

    /* renamed from: a */
    public static C62373e m243739a(ViewGroup viewGroup, C61303k kVar, Activity activity) {
        return new C62373e(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.dialog_participant_list_item_title, viewGroup, false), kVar, activity);
    }

    public C62373e(View view, C61303k kVar, Activity activity) {
        super(view, kVar, activity);
        this.f156842e = (TextView) view.findViewById(R.id.participant_list_item_title);
        this.f156843f = (TextView) view.findViewById(R.id.participant_list_item_title_option);
        this.f156844g = (IconFontView) view.findViewById(R.id.arrow);
        this.f156845h = view.findViewById(R.id.top_space);
        this.f156846i = (ConstraintLayout) view.findViewById(R.id.participant_list_item_title_container);
        this.f156847j = (TextView) view.findViewById(R.id.participant_list_item_lobby_tips);
    }

    /* renamed from: a */
    public void mo215667a(final C62347k kVar, final ParticipantItem participantItem, int i) {
        super.mo215644c(participantItem);
        m243741a(i);
        m243744g(participantItem);
        m243745h(participantItem);
        m243742e(participantItem);
        m243743f(participantItem);
        this.itemView.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.C62373e.C623763 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (participantItem.f156731c) {
                    kVar.mo215601a(participantItem);
                } else {
                    kVar.mo215609b(participantItem);
                }
            }
        });
    }
}
