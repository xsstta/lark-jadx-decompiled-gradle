package com.ss.android.vc.lark.message.meeting.cardview;

import android.app.Activity;
import android.content.Context;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.p1787a.C36519d;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.C57858o;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.dto.VideoChatContent;
import com.ss.android.vc.entity.request.JoinMeetingPreCheckEntityRequest;
import com.ss.android.vc.lark.message.meeting.cardview.attendee.MeetingAttendeeActivity;
import com.ss.android.vc.meeting.utils.C63497j;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.meeting.utils.TimeConsumeUtils;
import com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckUtils;
import com.ss.android.vc.statistics.event.aj;
import com.ss.android.vc.statistics.event2.MeetingEntryEvent3;
import com.ss.android.vc.statistics.p3180a.C63697g;
import io.reactivex.p3457e.C68296b;
import java.util.UUID;

/* renamed from: com.ss.android.vc.lark.message.meeting.cardview.c */
public class C61144c {
    /* renamed from: a */
    public void mo211435a(VideoChatContent videoChatContent, boolean z) {
        JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType joinMeetingCheckIDType;
        String str;
        Activity activity;
        String str2;
        if (videoChatContent != null && videoChatContent.meetingCard != null && videoChatContent.type == 1) {
            String uuid = UUID.randomUUID().toString();
            String str3 = videoChatContent.meetingCard.meetingId;
            String str4 = videoChatContent.meetingCard.topic;
            Context a = ar.m236694a();
            boolean z2 = false;
            aj.m250015a("card", false, str3, uuid);
            if (videoChatContent.meetingCard.meetingStatus == 2 && !z) {
                C60738ac.m236023a((int) R.string.View_M_CapacityReachedAndroid);
                C60700b.m235851b("MeetingCardController", "[joinMeeting]", "full, meetingId = " + str3);
            } else if (videoChatContent.meetingCard.meetingStatus == 3) {
                C60700b.m235851b("MeetingCardController", "[joinMeeting2]", "end, meetingId = " + str3);
            } else {
                C60700b.m235851b("MeetingCardController", "[joinMeeting3]", " start, meetingId = " + str3);
                if (videoChatContent.meetingCard.meetingSource == 2) {
                    str = videoChatContent.meetingCard.calendarId;
                    joinMeetingCheckIDType = JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType.UNIQUEID;
                } else {
                    str = videoChatContent.meetingCard.meetingId;
                    joinMeetingCheckIDType = JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType.MEETINGID;
                }
                if (!DesktopUtil.m144307b()) {
                    activity = VCAppLifeCycle.m236256c();
                } else {
                    activity = C36519d.m144080a().mo134826h();
                }
                if (activity == null) {
                    C60700b.m235864f("MeetingCardController", "[joinMeeting4]", "activity is null.");
                    return;
                }
                C63697g.m249703a();
                if (videoChatContent.meetingCard.meetingSource == 3) {
                    z2 = true;
                }
                C68296b<Boolean> a2 = TimeConsumeUtils.m248927a("MeetingCardController:joinMeeting:[fromInterview = " + z2 + "]");
                if (z2) {
                    MeetingCheckUtils.meetingCheck(activity, str, joinMeetingCheckIDType, false, "card", uuid, 1, true).subscribe(new MeetingCardController$2(this, a2, videoChatContent, a, activity, str3, uuid));
                    str2 = "card";
                } else {
                    str2 = "card";
                    MeetingCheckUtils.meetingCheck(activity, str, joinMeetingCheckIDType, false, "card", uuid, 1, true).subscribe(new MeetingCardController$3(this, a2, videoChatContent, activity, str4, uuid, str3));
                }
                MeetingEntryEvent3.m249802a().mo220286a(str2, "vc_meeting_pre_view", null, uuid);
            }
        }
    }

    /* renamed from: a */
    public void mo211436a(String str, VideoChatContent videoChatContent) {
        if (!(videoChatContent == null || videoChatContent.meetingCard == null || videoChatContent.type != 1)) {
            int size = videoChatContent.meetingCard.participants.size();
            Context a = ar.m236694a();
            if (size != 1 || !C63497j.m248855a(videoChatContent.meetingCard.participants.get(0))) {
                String[] strArr = new String[size];
                int[] iArr = new int[size];
                boolean[] zArr = new boolean[size];
                int[] iArr2 = new int[size];
                boolean[] zArr2 = new boolean[size];
                boolean isEmpty = CollectionUtils.isEmpty(videoChatContent.meetingCard.tenantIds);
                long j = videoChatContent.meetingCard.totalParticipantNum;
                if (!isEmpty) {
                    size = Math.min(size, 15);
                }
                for (int i = 0; i < size; i++) {
                    strArr[i] = videoChatContent.meetingCard.participants.get(i).getId();
                    iArr[i] = videoChatContent.meetingCard.participants.get(i).getParticipantType().getNumber();
                    zArr[i] = ParticipantUtil.m248735d(videoChatContent.meetingCard.participants.get(i));
                    iArr2[i] = videoChatContent.meetingCard.participants.get(i).getDeviceType().getNumber();
                    zArr2[i] = videoChatContent.meetingCard.participants.get(i).isGuest();
                }
                C57858o.m224559a(MeetingAttendeeActivity.class).mo196058a("extra.meeting_id", videoChatContent.meetingCard.meetingId).mo196062a("extra.participant_ids", strArr).mo196061a("extra.participant_types", iArr).mo196063a("extra.participant_external_types", zArr).mo196063a("extra.participant_is_guests", zArr2).mo196061a("extra.participant_device_types", iArr2).mo196058a("extra.meeting.topic", videoChatContent.meetingCard.topic).mo196058a("extra.creator.id", videoChatContent.meetingCard.sponsorId).mo196058a("extra.from.source", "VC_CARD_ATTENDEE").mo196060a("extra.old.card.data", isEmpty).mo196054a("extra.participant.number", j).mo196058a("extra.chat.id", str).mo196064a(a);
                return;
            }
            VideoChatModuleDependency.getChatDependency().getChatterById(videoChatContent.meetingCard.participants.get(0).getId(), new MeetingCardController$1(this, videoChatContent, a));
        }
    }
}
