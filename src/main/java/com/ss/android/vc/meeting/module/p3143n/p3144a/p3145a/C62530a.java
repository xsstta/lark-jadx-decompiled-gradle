package com.ss.android.vc.meeting.module.p3143n.p3144a.p3145a;

import com.bytedance.lark.pb.basic.v1.Chatter;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.pb.videoconference.v1.VCSearchUserInMeetingResponse;
import com.ss.android.vc.dto.BaseSearchInfo;
import com.ss.android.vc.dto.SearchParticipantInfo;
import com.ss.android.vc.dto.SearchResponse;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.UserWorkStatusType;
import com.ss.android.vc.entity.p3092a.C60930c;
import com.ss.android.vc.entity.p3092a.C60932d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.n.a.a.a */
public class C62530a {
    /* renamed from: a */
    public static SearchResponse m244584a(List<VCSearchUserInMeetingResponse.SearchResult> list) {
        return m244586c(list);
    }

    /* renamed from: c */
    private static SearchResponse m244586c(List<VCSearchUserInMeetingResponse.SearchResult> list) {
        SearchResponse searchResponse = new SearchResponse();
        searchResponse.setHasMore(false);
        searchResponse.setTotal(list.size());
        searchResponse.setMetaList(m244585b(list));
        return searchResponse;
    }

    /* renamed from: b */
    private static List<BaseSearchInfo> m244585b(List<VCSearchUserInMeetingResponse.SearchResult> list) {
        if (CollectionUtils.isEmpty(list)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (VCSearchUserInMeetingResponse.SearchResult searchResult : list) {
            if (searchResult != null) {
                arrayList.add(m244583a(searchResult));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static SearchParticipantInfo m244583a(VCSearchUserInMeetingResponse.SearchResult searchResult) {
        List<Chatter.ChatterCustomStatus> list;
        SearchParticipantInfo searchParticipantInfo = new SearchParticipantInfo();
        searchParticipantInfo.setByteviewUser(C60930c.m236832a(searchResult.user));
        searchParticipantInfo.setUserStatus(SearchParticipantInfo.UserStatus.fromValue(searchResult.status.getValue()));
        searchParticipantInfo.setParticipantType(ParticipantType.forNumber(searchResult.user.user_type.getValue()));
        searchParticipantInfo.setTitle(searchResult.name);
        searchParticipantInfo.setAvatarKey(searchResult.avatar_key);
        searchParticipantInfo.setId(searchParticipantInfo.getByteviewUser().getUserId());
        if (searchResult.lark_user_info != null) {
            list = searchResult.lark_user_info.custom_statuses;
        } else {
            list = null;
        }
        searchParticipantInfo.setCustomStatuses(C60930c.m237004a(list));
        if (searchResult.status == VCSearchUserInMeetingResponse.UserStatus.IN_LOBBY) {
            searchParticipantInfo.setLobbyParticipant(C60930c.m236995a(searchResult.lobby));
        } else if (searchResult.status == VCSearchUserInMeetingResponse.UserStatus.IN_MEETING) {
            searchParticipantInfo.setParticipant(C60932d.m237035a(searchResult.participant));
        } else if (searchResult.status == VCSearchUserInMeetingResponse.UserStatus.NOT_IN_MEETING) {
            if (searchResult.user.user_type == com.ss.android.lark.pb.videoconference.v1.ParticipantType.ROOM) {
                VCSearchUserInMeetingResponse.RoomInfo roomInfo = searchResult.room_info;
                if (roomInfo != null) {
                    searchParticipantInfo.setTitle(roomInfo.primary_name_participant);
                    searchParticipantInfo.setChatterDescription(new ChatterDescription(roomInfo.secondary_name, ChatterDescription.Type.DEFAULT));
                }
            } else if (searchResult.user.user_type == com.ss.android.lark.pb.videoconference.v1.ParticipantType.SIP_USER) {
                VCSearchUserInMeetingResponse.SipInfo sipInfo = searchResult.sip_info;
                if (sipInfo != null) {
                    searchParticipantInfo.setSipMainAddress(sipInfo.address);
                    searchParticipantInfo.setTitle(sipInfo.display_name_for_mobile.primary_name);
                    searchParticipantInfo.setChatterDescription(new ChatterDescription(sipInfo.display_name_for_mobile.secondary_name, ChatterDescription.Type.DEFAULT));
                }
            } else {
                VCSearchUserInMeetingResponse.LarkUserInfo larkUserInfo = searchResult.lark_user_info;
                if (larkUserInfo == null) {
                    return searchParticipantInfo;
                }
                searchParticipantInfo.setWorkStatusType(UserWorkStatusType.fromValue(larkUserInfo.work_status.getValue()));
                searchParticipantInfo.setExecutive(larkUserInfo.executive_mode.booleanValue());
                searchParticipantInfo.setCrossTenant(larkUserInfo.cross_tenant.booleanValue());
                searchParticipantInfo.setChatterDescription(new ChatterDescription(larkUserInfo.department, ChatterDescription.Type.DEFAULT));
                searchParticipantInfo.setZenModeEndTime(larkUserInfo.donot_disturb_before_ms.longValue());
                if (searchResult.participant != null) {
                    searchParticipantInfo.setParticipant(C60932d.m237035a(searchResult.participant));
                }
            }
        }
        if (!(searchResult.lark_user_info == null || searchResult.lark_user_info.collaboration_type == null)) {
            searchParticipantInfo.setCollaborationType(SearchParticipantInfo.CollaborationType.valueOf(searchResult.lark_user_info.collaboration_type.getValue()));
        }
        return searchParticipantInfo;
    }
}
