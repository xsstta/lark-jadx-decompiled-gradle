package com.ss.android.vc.lark.message.meeting.cardview;

import android.app.Activity;
import com.ss.android.vc.dto.VideoChatContent;
import com.ss.android.vc.entity.request.JoinCalendarGroupMeetingEntityRequest;
import com.ss.android.vc.meeting.module.preview.facade.MeetingPreviewLauncher;
import com.ss.android.vc.meeting.utils.TimeConsumeUtils;
import com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckData;
import com.ss.android.vc.meeting.utils.meetingcheck.rx.XConsumer;
import com.ss.android.vcxp.annotation.XMethod;
import io.reactivex.p3457e.C68296b;

/* access modifiers changed from: package-private */
public class MeetingCardController$3 implements XConsumer<MeetingCheckData> {

    /* renamed from: a */
    final /* synthetic */ C68296b f153075a;

    /* renamed from: b */
    final /* synthetic */ VideoChatContent f153076b;

    /* renamed from: c */
    final /* synthetic */ Activity f153077c;

    /* renamed from: d */
    final /* synthetic */ String f153078d;

    /* renamed from: e */
    final /* synthetic */ String f153079e;

    /* renamed from: f */
    final /* synthetic */ String f153080f;

    /* renamed from: g */
    final /* synthetic */ C61144c f153081g;

    @XMethod
    public void accept(MeetingCheckData bVar) throws Exception {
        if (bVar.mo219661a().booleanValue()) {
            TimeConsumeUtils.m248928a(this.f153075a);
            if (this.f153076b.meetingCard.meetingSource == 2) {
                MeetingPreviewLauncher.showCalendarJoinPreviewPage(this.f153077c, this.f153078d, this.f153076b.meetingCard.calendarId, null, JoinCalendarGroupMeetingEntityRequest.EntrySource.FROM_CARD.getNumber(), this.f153079e, bVar.mo219666c());
            } else {
                MeetingPreviewLauncher.showJoinPreviewPage(this.f153077c, this.f153078d, this.f153080f, false, this.f153079e, bVar.mo219666c());
            }
        }
    }

    MeetingCardController$3(C61144c cVar, C68296b bVar, VideoChatContent videoChatContent, Activity activity, String str, String str2, String str3) {
        this.f153081g = cVar;
        this.f153075a = bVar;
        this.f153076b = videoChatContent;
        this.f153077c = activity;
        this.f153078d = str;
        this.f153079e = str2;
        this.f153080f = str3;
    }
}
