package com.ss.android.vc.common.p3083e;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.widget.TextView;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.AdminSettings;
import com.ss.android.vc.entity.H323Access;
import com.ss.android.vc.entity.PSTNPhone;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.VideoChatH323Setting;
import com.ss.android.vc.entity.response.C60991z;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.manager.MeetingUtil;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.pstn.PstnInviteInfo;
import com.ss.android.vc.meeting.module.meetingdialog.pstn.country.CountryInfo;
import com.ss.android.vc.meeting.module.meetingdialog.pstn.country.CountryListManifest;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.service.C63634c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.ss.android.vc.common.e.aa */
public final class C60733aa {
    /* renamed from: a */
    public static String m235980a(boolean z) {
        return z ? "lvc.larksuite.com" : "lvc.bytedance.com";
    }

    /* renamed from: a */
    public static boolean m235990a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return str.equals(str2);
        }
        return false;
    }

    /* renamed from: a */
    public static void m235987a(final String str, String str2, final String str3, final String str4, final AdminSettings adminSettings, final CountryListManifest countryListManifest, final String str5, final VideoChatH323Setting videoChatH323Setting, final boolean z) {
        final String a = TextUtils.isEmpty(str2) ? C60773o.m236119a((int) R.string.View_G_ServerNoTitle) : str2;
        final ArrayList arrayList = new ArrayList();
        arrayList.add("View_MV_InvitesToFeishuMeeting");
        arrayList.add("View_N_MeetingTopicColon");
        arrayList.add("View_M_MeetingIdColon");
        arrayList.add("View_N_MeetingLinkColon");
        VcBizSender.m249263d(arrayList).mo219889a(new AbstractC63598b<C60991z>() {
            /* class com.ss.android.vc.common.p3083e.C60733aa.C607341 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235851b("VCTextUtils", "[getShareLink2]", "onError: " + eVar.toString());
            }

            /* renamed from: a */
            public void onSuccess(C60991z zVar) {
                CountryListManifest countryListManifest;
                StringBuilder sb = new StringBuilder();
                if (!(zVar == null || zVar.f152731a == null)) {
                    for (String str : arrayList) {
                        if (str.equals("View_MV_InvitesToFeishuMeeting")) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("name", str3);
                            hashMap.put("appName", UIHelper.getAppName());
                            sb.append(UIHelper.mustacheFormat((int) R.string.View_MV_InvitesToFeishuMeeting, hashMap));
                            sb.append("\n");
                        } else if (str.equals("View_M_InvitedToMeetingNameBraces")) {
                            sb.append(UIHelper.mustacheFormat((int) R.string.View_M_InvitedToMeetingNameBraces, "name", str3));
                            sb.append("\n");
                        } else if (str.equals("View_M_MeetingIdColon")) {
                            String str2 = zVar.f152731a.get(str);
                            if (TextUtils.isEmpty(str2)) {
                                str2 = C60773o.m236119a((int) R.string.View_M_MeetingIdColon);
                            }
                            sb.append(str2);
                            sb.append(C60754h.m236085a(str) + "\n");
                        } else if (str.equals("View_N_MeetingTopicColon")) {
                            String str3 = zVar.f152731a.get(str);
                            if (TextUtils.isEmpty(str3)) {
                                str3 = C60773o.m236119a((int) R.string.View_N_MeetingTopicColon);
                            }
                            sb.append(str3);
                            sb.append(a + "\n");
                        } else if (str.equals("View_N_MeetingLinkColon")) {
                            String str4 = zVar.f152731a.get(str);
                            if (TextUtils.isEmpty(str4)) {
                                str4 = C60773o.m236119a((int) R.string.View_N_MeetingLinkColon);
                            }
                            sb.append(str4);
                            sb.append(str4 + "\n");
                        }
                    }
                    AdminSettings adminSettings = adminSettings;
                    if (!(adminSettings == null || (countryListManifest = countryListManifest) == null)) {
                        C60733aa.m235983a(str, adminSettings, countryListManifest, sb);
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        C60733aa.m235988a(str, str5, sb);
                    }
                    if (videoChatH323Setting != null && C60733aa.m235989a()) {
                        C60733aa.m235984a(str, videoChatH323Setting, sb);
                    }
                }
                if (TextUtils.isEmpty(sb.toString())) {
                    C60700b.m235864f("VCTextUtils", "[getShareLink]", "GetViewI18nTemplateResponse: response or template is empty");
                    return;
                }
                ((ClipboardManager) ar.m236694a().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("meetingUrl", sb.toString()));
                if (adminSettings == null || countryListManifest == null) {
                    if (z) {
                        C60738ac.m236024a(R.drawable.ud_icon_yes_outlined, R.string.View_M_LinkCopied, 3000);
                    } else {
                        C60738ac.m236037c((int) R.string.View_M_LinkCopied);
                    }
                } else if (z) {
                    C60738ac.m236024a(R.drawable.ud_icon_yes_outlined, R.string.View_M_JoiningInfoCopied, 3000);
                } else {
                    C60738ac.m236037c((int) R.string.View_M_JoiningInfoCopied);
                }
            }
        });
    }

    /* renamed from: a */
    public static void m235988a(String str, String str2, StringBuilder sb) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String str3 = str + "@" + str2;
            String a = C60773o.m236119a((int) R.string.View_G_JoinByRoomSystem);
            sb.append("\n");
            sb.append(a);
            sb.append("\n");
            sb.append(str3);
            sb.append("\n");
        }
    }

    /* renamed from: a */
    public static boolean m235989a() {
        return C63634c.m249496b("byteview.meeting.copyh323invitation");
    }

    /* renamed from: a */
    public static String m235978a(String str) {
        return str.replaceAll("(.{3})(.{3})(.{3})", "$1 $2 $3");
    }

    /* renamed from: a */
    public static String m235977a(VideoChatUser videoChatUser) {
        String str;
        if (videoChatUser.isRoom()) {
            str = videoChatUser.getRoom().fullNameParticipant;
        } else if (videoChatUser.getType() == ParticipantType.LARK_USER) {
            str = m235991b(videoChatUser.getId(), videoChatUser.getName());
        } else if (videoChatUser.getType() != ParticipantType.NEO_USER && !videoChatUser.getType().isNewType() && !videoChatUser.getType().isUnknownType()) {
            str = null;
        } else if (!TextUtils.isEmpty(videoChatUser.getNickname())) {
            str = videoChatUser.getNickname();
        } else {
            str = videoChatUser.getName();
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: c */
    private static String m235992c(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("phone", str);
        hashMap.put("countryName", str2);
        return UIHelper.mustacheFormat((int) R.string.View_M_DialInByLocationEntry, hashMap);
    }

    /* renamed from: a */
    private static List<PSTNPhone> m235982a(List<PSTNPhone> list, String str) {
        ArrayList arrayList = new ArrayList();
        for (PSTNPhone pSTNPhone : list) {
            if (pSTNPhone != null && TextUtils.equals(pSTNPhone.country, str)) {
                arrayList.add(pSTNPhone);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<PstnInviteInfo> m235981a(AdminSettings adminSettings, CountryListManifest countryListManifest) {
        LinkedHashMap<String, CountryInfo> data;
        CountryInfo countryInfo;
        CountryInfo countryInfo2;
        ArrayList arrayList = new ArrayList();
        if (adminSettings == null || countryListManifest == null || (data = countryListManifest.getData()) == null) {
            return arrayList;
        }
        List<PSTNPhone> list = adminSettings.pstnIncomingCallPhoneList;
        if (CollectionUtils.isEmpty(list)) {
            return arrayList;
        }
        List<String> list2 = adminSettings.pstnIncomingCallCountryDefault;
        if (list2 != null) {
            for (String str : list2) {
                if (data.containsKey(str) && (countryInfo2 = data.get(str)) != null) {
                    List<PSTNPhone> a = m235982a(list, str);
                    if (!CollectionUtils.isEmpty(a)) {
                        for (PSTNPhone pSTNPhone : a) {
                            if (pSTNPhone != null) {
                                arrayList.add(new PstnInviteInfo(countryInfo2.getName(), pSTNPhone.displayNumber));
                            }
                        }
                    }
                }
            }
        }
        for (PSTNPhone pSTNPhone2 : list) {
            if (pSTNPhone2 != null) {
                String str2 = pSTNPhone2.country;
                if (data.containsKey(str2) && (countryInfo = data.get(str2)) != null) {
                    arrayList.add(new PstnInviteInfo(countryInfo.getName(), pSTNPhone2.displayNumber));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static String m235991b(String str, String str2) {
        C61303k kVar = (C61303k) MeetingManager.m238341a().mo211906j();
        if (kVar != null) {
            Participant participant = null;
            List<Participant> participants = kVar.mo212056e().getParticipants();
            if (!CollectionUtils.isEmpty(participants)) {
                int i = 0;
                while (true) {
                    if (i >= participants.size()) {
                        break;
                    } else if (participants.get(i) != null && !TextUtils.isEmpty(str) && str.equals(participants.get(i).getId())) {
                        participant = participants.get(i);
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (participant != null && MeetingUtil.m238366a(kVar, participant)) {
                return UIHelper.getString(R.string.View_M_Interviewer);
            }
            if (participant != null && ((participant.getParticipantType().isUnknownType() || participant.getParticipantType().isNewType() || participant.getParticipantType() == ParticipantType.NEO_USER) && participant.getParticipantSettings() != null && !TextUtils.isEmpty(participant.getParticipantSettings().getNickname()))) {
                return participant.getParticipantSettings().getNickname();
            }
        }
        return str2;
    }

    /* renamed from: a */
    private static String m235979a(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("phone", str);
        hashMap.put("meetingNumber", str2);
        hashMap.put("countryName", str3);
        return UIHelper.mustacheFormat((int) R.string.View_M_JoinMeetingByPhoneEntry, hashMap);
    }

    /* renamed from: a */
    public static void m235984a(String str, VideoChatH323Setting videoChatH323Setting, StringBuilder sb) {
        if (!TextUtils.isEmpty(str) && videoChatH323Setting != null && !CollectionUtils.isEmpty(videoChatH323Setting.getH323AccessList())) {
            String a = C60773o.m236119a((int) R.string.View_G_Use323ToJoin);
            sb.append("\n");
            sb.append(a);
            sb.append("\n");
            String str2 = C60773o.m236119a((int) R.string.View_M_MeetingIdColon) + m235978a(str);
            ArrayList arrayList = new ArrayList();
            Iterator<H323Access> it = videoChatH323Setting.getH323AccessList().iterator();
            while (it.hasNext()) {
                H323Access next = it.next();
                if (next != null) {
                    arrayList.add(next.getCountry());
                }
            }
            C60991z e = VcBizSender.m249266e(arrayList);
            Iterator<H323Access> it2 = videoChatH323Setting.getH323AccessList().iterator();
            while (it2.hasNext()) {
                H323Access next2 = it2.next();
                if (next2 != null) {
                    sb.append(next2.getIp());
                    sb.append(e.f152731a.get(next2.getCountry()));
                    sb.append("\n");
                }
            }
            sb.append(str2);
        }
    }

    /* renamed from: a */
    public static void m235985a(String str, String str2, TextView textView) {
        C61303k kVar = (C61303k) MeetingManager.m238341a().mo211906j();
        if (kVar != null) {
            Participant participant = null;
            List<Participant> participants = kVar.mo212056e().getParticipants();
            if (!CollectionUtils.isEmpty(participants)) {
                int i = 0;
                while (true) {
                    if (i >= participants.size()) {
                        break;
                    } else if (participants.get(i) != null && !TextUtils.isEmpty(str) && str.equals(participants.get(i).getId())) {
                        participant = participants.get(i);
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (participant == null || !MeetingUtil.m238366a(kVar, participant)) {
                textView.setText(str2);
            } else {
                textView.setText(UIHelper.getString(R.string.View_M_Interviewer));
            }
        } else {
            textView.setText(str2);
        }
    }

    /* renamed from: a */
    public static void m235983a(String str, AdminSettings adminSettings, CountryListManifest countryListManifest, StringBuilder sb) {
        LinkedHashMap<String, CountryInfo> data;
        CountryInfo countryInfo;
        CountryInfo countryInfo2;
        if (!(adminSettings == null || countryListManifest == null || (data = countryListManifest.getData()) == null)) {
            List<PSTNPhone> list = adminSettings.pstnIncomingCallPhoneList;
            if (!CollectionUtils.isEmpty(list)) {
                List<String> list2 = adminSettings.pstnIncomingCallCountryDefault;
                if (list2 != null) {
                    sb.append("\n");
                    sb.append(UIHelper.getString(R.string.View_M_JoinMeetingByPhone));
                    sb.append("\n");
                    for (String str2 : list2) {
                        if (data.containsKey(str2) && (countryInfo2 = data.get(str2)) != null) {
                            List<PSTNPhone> a = m235982a(list, str2);
                            if (!CollectionUtils.isEmpty(a)) {
                                for (PSTNPhone pSTNPhone : a) {
                                    if (pSTNPhone != null) {
                                        sb.append(m235979a(pSTNPhone.number, str, countryInfo2.getName()));
                                        sb.append("\n");
                                    }
                                }
                            }
                        }
                    }
                }
                sb.append("\n");
                sb.append(UIHelper.getString(R.string.View_M_DialInByLocation));
                sb.append("\n");
                for (PSTNPhone pSTNPhone2 : list) {
                    if (pSTNPhone2 != null) {
                        String str3 = pSTNPhone2.country;
                        if (data.containsKey(str3) && (countryInfo = data.get(str3)) != null) {
                            sb.append(m235992c(pSTNPhone2.displayNumber, countryInfo.getName()));
                            sb.append("\n");
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m235986a(String str, String str2, String str3, String str4) {
        m235987a(str, str2, str3, str4, null, null, null, null, false);
    }
}
