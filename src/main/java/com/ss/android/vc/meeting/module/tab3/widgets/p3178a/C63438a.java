package com.ss.android.vc.meeting.module.tab3.widgets.p3178a;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.utils.C57858o;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60742af;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.MeetingStatus;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.VCParticipantAbbrInfo;
import com.ss.android.vc.entity.response.av;
import com.ss.android.vc.lark.message.meeting.cardview.attendee.MeetingAttendeeActivity;
import com.ss.android.vc.meeting.utils.C63497j;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.statistics.event.ce;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.tab3.widgets.a.a */
public final class C63438a {
    /* renamed from: a */
    public static boolean m248529a(int i) {
        if (i == ParticipantType.LARK_USER.getNumber() || i == ParticipantType.ROOM.getNumber() || i == ParticipantType.NEO_GUEST_USER.getNumber() || i == ParticipantType.NEO_USER.getNumber() || i == ParticipantType.STANDALONE_VC_USER.getNumber()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static av m248527a(List<av> list, String str) {
        for (av avVar : list) {
            if (TextUtils.equals(avVar.mo210116a(), str)) {
                return avVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m248528a(final String str, final MeetingStatus meetingStatus, ByteviewUser byteviewUser, final String str2, List<VCParticipantAbbrInfo> list) {
        if (!TextUtils.isEmpty(str) && byteviewUser != null && !C60742af.m236059a(list)) {
            final int size = list.size();
            final Context a = ar.m236694a();
            if (size != 1) {
                final String userId = byteviewUser.getUserId();
                C60700b.m235851b("AttendeeUtils", "[openTabAttendee2]", "go to participant list page");
                final String[] strArr = new String[size];
                final int[] iArr = new int[size];
                final boolean[] zArr = new boolean[size];
                final int[] iArr2 = new int[size];
                final boolean[] zArr2 = new boolean[size];
                for (int i = 0; i < size; i++) {
                    strArr[i] = list.get(i).mo210170b().getUserId();
                    iArr[i] = list.get(i).mo210170b().getParticipantType().getNumber();
                    zArr[i] = false;
                    iArr2[i] = list.get(i).mo210171c().getNumber();
                    zArr2[i] = list.get(i).mo210172d();
                }
                UserInfoService.getTabTenants(strArr, iArr, new AbstractC63598b<List<av>>() {
                    /* class com.ss.android.vc.meeting.module.tab3.widgets.p3178a.C63438a.C634391 */

                    @Override // com.ss.android.vc.net.request.AbstractC63598b
                    public void onError(C63602e eVar) {
                        String str;
                        C60700b.m235864f("AttendeeUtils", "[getTabTenants2]", "get tab chatters fail!");
                        if (meetingStatus == MeetingStatus.MEETING_END) {
                            str = "history";
                        } else {
                            str = "ongoing";
                        }
                        C57858o.m224559a(MeetingAttendeeActivity.class).mo196058a("extra.meeting_id", str).mo196062a("extra.participant_ids", strArr).mo196061a("extra.participant_types", iArr).mo196063a("extra.participant_external_types", zArr).mo196063a("extra.participant_is_guests", zArr2).mo196061a("extra.participant_device_types", iArr2).mo196058a("extra.meeting.topic", str2).mo196058a("extra.creator.id", userId).mo196058a("extra.from.source", "VC_TAB_ATTENDEE").mo196058a("extra.meeting.status", str).mo196064a(a);
                    }

                    /* renamed from: a */
                    public void onSuccess(List<av> list) {
                        String str;
                        if (!C60742af.m236059a(list)) {
                            C60700b.m235851b("AttendeeUtils", "[getTabTenants]", "success! need size: " + strArr.length + ", return size: " + list.size());
                            for (int i = 0; i < size; i++) {
                                av a = C63438a.m248527a(list, strArr[i]);
                                if (a == null) {
                                    zArr[i] = false;
                                } else {
                                    String d = VideoChatModuleDependency.m236631d();
                                    if (TextUtils.isEmpty(d) || TextUtils.equals(d, "-1") || VideoChatModuleDependency.getLoginDependency().mo196421c() || TextUtils.isEmpty(a.mo210118b()) || TextUtils.equals(a.mo210118b(), "-1") || zArr2[i] || !C63438a.m248529a(iArr[i]) || !VideoChatModuleDependency.m236632e() || TextUtils.equals(d, a.mo210118b())) {
                                        zArr[i] = false;
                                    } else if (!TextUtils.equals(d, a.mo210118b())) {
                                        zArr[i] = true;
                                    } else {
                                        zArr[i] = false;
                                    }
                                }
                            }
                        }
                        if (meetingStatus == MeetingStatus.MEETING_END) {
                            str = "history";
                        } else {
                            str = "ongoing";
                        }
                        C57858o.m224559a(MeetingAttendeeActivity.class).mo196058a("extra.meeting_id", str).mo196062a("extra.participant_ids", strArr).mo196061a("extra.participant_types", iArr).mo196063a("extra.participant_external_types", zArr).mo196063a("extra.participant_is_guests", zArr2).mo196061a("extra.participant_device_types", iArr2).mo196058a("extra.meeting.topic", str2).mo196058a("extra.creator.id", userId).mo196058a("extra.from.source", "VC_TAB_ATTENDEE").mo196058a("extra.meeting.status", str).mo196064a(a);
                    }
                });
            } else if (C63497j.m248856a(list.get(0))) {
                C60700b.m235851b("AttendeeUtils", "[openTabAttendee]", "go to profile");
                String userId2 = list.get(0).mo210170b().getUserId();
                ce.m250276i();
                C63497j.m248854a(a, userId2, str2, str, byteviewUser);
            }
        }
    }
}
