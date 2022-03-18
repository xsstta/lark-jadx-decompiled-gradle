package com.ss.android.vc.meeting.module.tab.widgets;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.utils.C57858o;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60742af;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.ByteviewUser;
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

/* renamed from: com.ss.android.vc.meeting.module.tab.widgets.a */
public class C63315a {
    /* renamed from: a */
    public static boolean m248016a(int i) {
        if (i == ParticipantType.LARK_USER.getNumber() || i == ParticipantType.ROOM.getNumber() || i == ParticipantType.NEO_GUEST_USER.getNumber() || i == ParticipantType.NEO_USER.getNumber() || i == ParticipantType.STANDALONE_VC_USER.getNumber()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static av m248014a(List<av> list, String str) {
        for (av avVar : list) {
            if (TextUtils.equals(avVar.mo210116a(), str)) {
                return avVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m248015a(final String str, ByteviewUser byteviewUser, final String str2, List<VCParticipantAbbrInfo> list) {
        if (!TextUtils.isEmpty(str) && byteviewUser != null && !C60742af.m236059a(list)) {
            final int size = list.size();
            final Context a = ar.m236694a();
            if (size != 1) {
                final String userId = byteviewUser.getUserId();
                C60700b.m235851b("TabAttendeeUtils", "[openTabAttendee2]", "go to participant list page");
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
                    /* class com.ss.android.vc.meeting.module.tab.widgets.C63315a.C633161 */

                    @Override // com.ss.android.vc.net.request.AbstractC63598b
                    public void onError(C63602e eVar) {
                        C60700b.m235864f("TabAttendeeUtils", "[getTabTenant2]", "get tab chatters fail!");
                        C57858o.m224559a(MeetingAttendeeActivity.class).mo196058a("extra.meeting_id", str).mo196062a("extra.participant_ids", strArr).mo196061a("extra.participant_types", iArr).mo196063a("extra.participant_external_types", zArr).mo196063a("extra.participant_is_guests", zArr2).mo196061a("extra.participant_device_types", iArr2).mo196058a("extra.meeting.topic", str2).mo196058a("extra.creator.id", userId).mo196058a("extra.from.source", "VC_TAB_ATTENDEE").mo196064a(a);
                    }

                    /* renamed from: a */
                    public void onSuccess(List<av> list) {
                        if (!C60742af.m236059a(list)) {
                            C60700b.m235851b("TabAttendeeUtils", "[getTabTenant]", "get tab tenants success! need size: " + strArr.length + ", return size: " + list.size());
                            for (int i = 0; i < size; i++) {
                                av a = C63315a.m248014a(list, strArr[i]);
                                if (a == null) {
                                    zArr[i] = false;
                                } else {
                                    String d = VideoChatModuleDependency.m236631d();
                                    if (TextUtils.isEmpty(d) || TextUtils.equals(d, "-1") || VideoChatModuleDependency.getLoginDependency().mo196421c() || TextUtils.isEmpty(a.mo210118b()) || TextUtils.equals(a.mo210118b(), "-1") || zArr2[i] || !C63315a.m248016a(iArr[i]) || !VideoChatModuleDependency.m236632e() || TextUtils.equals(d, a.mo210118b())) {
                                        zArr[i] = false;
                                    } else if (!TextUtils.equals(d, a.mo210118b())) {
                                        zArr[i] = true;
                                    } else {
                                        zArr[i] = false;
                                    }
                                }
                            }
                        }
                        C57858o.m224559a(MeetingAttendeeActivity.class).mo196058a("extra.meeting_id", str).mo196062a("extra.participant_ids", strArr).mo196061a("extra.participant_types", iArr).mo196063a("extra.participant_external_types", zArr).mo196063a("extra.participant_is_guests", zArr2).mo196061a("extra.participant_device_types", iArr2).mo196058a("extra.meeting.topic", str2).mo196058a("extra.creator.id", userId).mo196058a("extra.from.source", "VC_TAB_ATTENDEE").mo196064a(a);
                    }
                });
            } else if (C63497j.m248856a(list.get(0))) {
                C60700b.m235851b("TabAttendeeUtils", "[openTabAttendee]", "go to profile");
                String userId2 = list.get(0).mo210170b().getUserId();
                ce.m250276i();
                C63497j.m248854a(a, userId2, str2, str, byteviewUser);
            }
        }
    }
}
