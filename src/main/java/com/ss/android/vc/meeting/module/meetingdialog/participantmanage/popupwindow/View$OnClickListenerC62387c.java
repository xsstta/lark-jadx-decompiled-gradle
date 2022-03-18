package com.ss.android.vc.meeting.module.meetingdialog.participantmanage.popupwindow;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.InMeetingControlPopItemLayout;
import com.ss.android.vc.meeting.module.share.C62955c;
import com.ss.android.vc.meeting.module.share.p3163d.C62965c;
import com.ss.android.vc.meeting.utils.popup.AbstractC63524a;
import com.ss.android.vc.statistics.event.bi;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.participantmanage.popupwindow.c */
public class View$OnClickListenerC62387c extends AbstractC63524a<View$OnClickListenerC62387c> implements View.OnClickListener {

    /* renamed from: a */
    private final Context f156906a;

    /* renamed from: b */
    private final C61303k f156907b;

    /* renamed from: c */
    private final Activity f156908c;

    /* renamed from: d */
    private final View f156909d;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.utils.popup.AbstractC63524a
    /* renamed from: a */
    public void mo211394a() {
        mo219686a(R.layout.participant_list_share_pop_window);
        mo219688a(true);
        mo219695b(false);
    }

    /* renamed from: b */
    public void mo211397b() {
        mo219691a(this.f156909d, 0, C60773o.m236115a(4.0d), 8388611);
    }

    @Override // com.ss.android.vc.meeting.utils.popup.AbstractC63524a
    /* renamed from: c */
    public void mo211398c() {
        if ((this.f156906a instanceof Activity) && mo219704l() && UIUtils.isActivityRunning((Activity) this.f156906a)) {
            super.mo211398c();
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.ll_copy_meeting_info) {
            mo211398c();
            this.f156907b.aa().mo216273b(this.f156907b);
            bi.m250174b(this.f156907b.mo212056e());
        } else if (view.getId() == R.id.ll_share_to_chat) {
            mo211398c();
            C61303k kVar = this.f156907b;
            if (kVar != null && kVar.mo212056e() != null && this.f156907b.mo212056e().getVideoChatSettings() != null) {
                if (this.f156907b.mo212056e().getVideoChatSettings().isLocked()) {
                    C60700b.m235851b("ShareActionPopup", "[onClick]", "meeting is locked, can not share");
                    C60738ac.m236037c((int) R.string.View_M_MeetingLocked);
                    return;
                }
                Activity activity = this.f156908c;
                C61303k kVar2 = this.f156907b;
                C62965c.m246556a(activity, kVar2, new C62955c(kVar2.mo212055d(), VideoChat.VendorType.RTC.getNumber()), true).mo211606a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo211396a(View view, View$OnClickListenerC62387c cVar) {
        InMeetingControlPopItemLayout inMeetingControlPopItemLayout = (InMeetingControlPopItemLayout) mo219693b(R.id.ll_copy_meeting_info);
        InMeetingControlPopItemLayout inMeetingControlPopItemLayout2 = (InMeetingControlPopItemLayout) mo219693b(R.id.ll_share_to_chat);
        inMeetingControlPopItemLayout.setBackgroundResId(R.drawable.vc_popup_list_item_selector_radius_4dp);
        inMeetingControlPopItemLayout2.setBackgroundResId(R.drawable.vc_popup_list_item_selector_radius_4dp);
        inMeetingControlPopItemLayout.setIconColor(R.color.icon_n2);
        inMeetingControlPopItemLayout2.setIconColor(R.color.icon_n2);
        inMeetingControlPopItemLayout.setOnClickListener(this);
        inMeetingControlPopItemLayout2.setOnClickListener(this);
    }

    /* renamed from: a */
    public static View$OnClickListenerC62387c m243823a(Activity activity, View view, C61303k kVar) {
        return new View$OnClickListenerC62387c(activity, view, kVar);
    }

    public View$OnClickListenerC62387c(Activity activity, View view, C61303k kVar) {
        this.f156906a = activity;
        this.f156908c = activity;
        this.f156907b = kVar;
        this.f156909d = view;
        mo219694b((Context) activity);
    }
}
