package com.ss.android.vc.entity.p3092a;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.DeniedReason;
import com.bytedance.lark.pb.basic.v1.StatusEffectiveInterval;
import com.bytedance.lark.pb.calendar.v1.CalendarEventReminder;
import com.bytedance.lark.pb.contact.v1.GetUserProfileResponse;
import com.bytedance.lark.pb.contact.v1.MGetChattersResponse;
import com.bytedance.lark.pb.space.doc.v1.CreateDocResponse;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chatter.ChatterCustomStatus;
import com.ss.android.lark.pb.entities.VideoChatContent;
import com.ss.android.lark.pb.role.GetAdminPermissionInfoResponse;
import com.ss.android.lark.pb.videochat.GetReservationResponse;
import com.ss.android.lark.pb.videochat.GetShareCodeInfoResponse;
import com.ss.android.lark.pb.videochat.LiveSettingElement;
import com.ss.android.lark.pb.videochat.PullVCCardInfoResponse;
import com.ss.android.lark.pb.videochat.PullVideochatByShareCodeResponse;
import com.ss.android.lark.pb.videochat.VideoChatH323Setting;
import com.ss.android.lark.pb.videochat.VideoChatPullLiveSettingResponse;
import com.ss.android.lark.pb.videochat.VideoChatSecuritySetting;
import com.ss.android.lark.pb.videochat_tab_v2.GetVCTabTotalMissedCallResponse;
import com.ss.android.lark.pb.videoconference.v1.AdjustMeetingDurationResponse;
import com.ss.android.lark.pb.videoconference.v1.BreakoutRoomInfo;
import com.ss.android.lark.pb.videoconference.v1.BreakoutRoomJoinResponse;
import com.ss.android.lark.pb.videoconference.v1.BreakoutRoomManage;
import com.ss.android.lark.pb.videoconference.v1.ByteSdkRateConfig;
import com.ss.android.lark.pb.videoconference.v1.CalendarVCSettings;
import com.ss.android.lark.pb.videoconference.v1.CheckGuestJoinVcResponse;
import com.ss.android.lark.pb.videoconference.v1.CheckVCManageCapabilitiesResponse;
import com.ss.android.lark.pb.videoconference.v1.ClientExtraAction;
import com.ss.android.lark.pb.videoconference.v1.CloseGrootChannelResponse;
import com.ss.android.lark.pb.videoconference.v1.CollaborationType;
import com.ss.android.lark.pb.videoconference.v1.FeatureConfig;
import com.ss.android.lark.pb.videoconference.v1.FetchAllSketchDataResponse;
import com.ss.android.lark.pb.videoconference.v1.FollowGrootCellPayload;
import com.ss.android.lark.pb.videoconference.v1.FollowInfo;
import com.ss.android.lark.pb.videoconference.v1.FollowPatch;
import com.ss.android.lark.pb.videoconference.v1.FollowState;
import com.ss.android.lark.pb.videoconference.v1.FollowStrategy;
import com.ss.android.lark.pb.videoconference.v1.FollowWebData;
import com.ss.android.lark.pb.videoconference.v1.ForceTransferHostResponse;
import com.ss.android.lark.pb.videoconference.v1.FullVCLobbyParticipants;
import com.ss.android.lark.pb.videoconference.v1.GetAdminSettingsResponse;
import com.ss.android.lark.pb.videoconference.v1.GetAssociatedVideoChatResponse;
import com.ss.android.lark.pb.videoconference.v1.GetAssociatedVideoChatStatusResponse;
import com.ss.android.lark.pb.videoconference.v1.GetCalendarGuestListByMeetingIDResponse;
import com.ss.android.lark.pb.videoconference.v1.GetLivePermissionResponse;
import com.ss.android.lark.pb.videoconference.v1.GetMeetingURLInfoResponse;
import com.ss.android.lark.pb.videoconference.v1.GetParticipantListResponse;
import com.ss.android.lark.pb.videoconference.v1.GetRTCDNSResponse;
import com.ss.android.lark.pb.videoconference.v1.GetSuggestedParticipantsResponse;
import com.ss.android.lark.pb.videoconference.v1.GetSuiteQuotaResponse;
import com.ss.android.lark.pb.videoconference.v1.GetUrlBriefsResponse;
import com.ss.android.lark.pb.videoconference.v1.GetVCTabHistoryListResponse;
import com.ss.android.lark.pb.videoconference.v1.GetVCTabMeetingDetailResponse;
import com.ss.android.lark.pb.videoconference.v1.GetVCUpcomingCalendarInstancesResponse;
import com.ss.android.lark.pb.videoconference.v1.GetVcMeetingJoinStatusResponse;
import com.ss.android.lark.pb.videoconference.v1.GetVcVirtualBackgroundRequest;
import com.ss.android.lark.pb.videoconference.v1.GetVcVirtualBackgroundResponse;
import com.ss.android.lark.pb.videoconference.v1.GetVerificationInfoResponse;
import com.ss.android.lark.pb.videoconference.v1.GetVerificationTicketResponse;
import com.ss.android.lark.pb.videoconference.v1.GetViewI18nTemplateResponse;
import com.ss.android.lark.pb.videoconference.v1.HistoryInfo;
import com.ss.android.lark.pb.videoconference.v1.HostManageRequest;
import com.ss.android.lark.pb.videoconference.v1.I18nKeyInfo;
import com.ss.android.lark.pb.videoconference.v1.InMeetingData;
import com.ss.android.lark.pb.videoconference.v1.InterpreterSetting;
import com.ss.android.lark.pb.videoconference.v1.InviteVideoChatResponse;
import com.ss.android.lark.pb.videoconference.v1.JoinCalendarGroupMeetingResponse;
import com.ss.android.lark.pb.videoconference.v1.JoinInterviewGroupMeetingResponse;
import com.ss.android.lark.pb.videoconference.v1.JoinMeetingLobby;
import com.ss.android.lark.pb.videoconference.v1.JoinMeetingPreCheckResponse;
import com.ss.android.lark.pb.videoconference.v1.JoinMeetingResponse;
import com.ss.android.lark.pb.videoconference.v1.LiveBindingData;
import com.ss.android.lark.pb.videoconference.v1.MGetRoomsResponse;
import com.ss.android.lark.pb.videoconference.v1.MeetingParticipantChange;
import com.ss.android.lark.pb.videoconference.v1.MeetingSourceAppLinkInfo;
import com.ss.android.lark.pb.videoconference.v1.MeetingSubtitleData;
import com.ss.android.lark.pb.videoconference.v1.MegaI18n;
import com.ss.android.lark.pb.videoconference.v1.MsgInfo;
import com.ss.android.lark.pb.videoconference.v1.PSTNPhone;
import com.ss.android.lark.pb.videoconference.v1.PullAllFollowStatesResponse;
import com.ss.android.lark.pb.videoconference.v1.PullPreVideoChatSettingResponse;
import com.ss.android.lark.pb.videoconference.v1.PullSubtitlesResponse;
import com.ss.android.lark.pb.videoconference.v1.PullVideoChatConfigResponse;
import com.ss.android.lark.pb.videoconference.v1.PullVideoChatInteractionMessagesResponse;
import com.ss.android.lark.pb.videoconference.v1.PushGrootChannelStatus;
import com.ss.android.lark.pb.videoconference.v1.RejoinVideoChatResponse;
import com.ss.android.lark.pb.videoconference.v1.Room;
import com.ss.android.lark.pb.videoconference.v1.SearchSubtitlesResponse;
import com.ss.android.lark.pb.videoconference.v1.SearchUsersAndChatsResponse;
import com.ss.android.lark.pb.videoconference.v1.SendVideoChatInteractionMessageResponse;
import com.ss.android.lark.pb.videoconference.v1.SetVcVirtualBackgroundResponse;
import com.ss.android.lark.pb.videoconference.v1.ShareFollowResponse;
import com.ss.android.lark.pb.videoconference.v1.ShareScreenResponse;
import com.ss.android.lark.pb.videoconference.v1.ShareScreenToRoomResponse;
import com.ss.android.lark.pb.videoconference.v1.SketchDataUnit;
import com.ss.android.lark.pb.videoconference.v1.SketchGrootCellPayload;
import com.ss.android.lark.pb.videoconference.v1.SketchOperationUnit;
import com.ss.android.lark.pb.videoconference.v1.SketchStartResponse;
import com.ss.android.lark.pb.videoconference.v1.SyncSubtitlesResponse;
import com.ss.android.lark.pb.videoconference.v1.UpdateVideoChatResponse;
import com.ss.android.lark.pb.videoconference.v1.UrlBrief;
import com.ss.android.lark.pb.videoconference.v1.VCLobbyParticipant;
import com.ss.android.lark.pb.videoconference.v1.VCManageCapabilities;
import com.ss.android.lark.pb.videoconference.v1.VCManageResult;
import com.ss.android.lark.pb.videoconference.v1.VCMeetingAbbrInfo;
import com.ss.android.lark.pb.videoconference.v1.VCSecuritySetting;
import com.ss.android.lark.pb.videoconference.v1.VCTabDetailRecordInfo;
import com.ss.android.lark.pb.videoconference.v1.VCTabListItem;
import com.ss.android.lark.pb.videoconference.v1.VCTabMeetingAbbrInfo;
import com.ss.android.lark.pb.videoconference.v1.VCTabMeetingChangeInfo;
import com.ss.android.lark.pb.videoconference.v1.VCTabStatisticsInfo;
import com.ss.android.lark.pb.videoconference.v1.VCUpcomingVcInstance;
import com.ss.android.lark.pb.videoconference.v1.VcQueryDocsResponse;
import com.ss.android.lark.pb.videoconference.v1.VideoChatExtraInfo;
import com.ss.android.lark.pb.videoconference.v1.VideoChatFetchLivePolicyResponse;
import com.ss.android.lark.pb.videoconference.v1.VideoChatH323Setting;
import com.ss.android.lark.pb.videoconference.v1.VideoChatInfo;
import com.ss.android.lark.pb.videoconference.v1.VideoChatInteractionMessage;
import com.ss.android.lark.pb.videoconference.v1.VideoChatLiveActionResponse;
import com.ss.android.lark.pb.videoconference.v1.VideoChatLivePreCheckResponse;
import com.ss.android.lark.pb.videoconference.v1.VideoChatNotice;
import com.ss.android.lark.pb.videoconference.v1.VideoChatPrompt;
import com.ss.android.lark.pb.videoconference.v1.VideoChatPstnIncomingSetting;
import com.ss.android.lark.pb.videoconference.v1.VideoChatSecuritySetting;
import com.ss.android.lark.pb.videoconference.v1.ViewDeviceSetting;
import com.ss.android.lark.pb.videoconference.v1.ViewUserSetting;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.vc.C60657a;
import com.ss.android.vc.dto.PullVCCardInfoEntity;
import com.ss.android.vc.dto.VideoChatContent;
import com.ss.android.vc.entity.ActionTime;
import com.ss.android.vc.entity.AdminSettings;
import com.ss.android.vc.entity.ByteViewUserInfo;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.C60937f;
import com.ss.android.vc.entity.C60940j;
import com.ss.android.vc.entity.C60941k;
import com.ss.android.vc.entity.C60942l;
import com.ss.android.vc.entity.ChannelMeta;
import com.ss.android.vc.entity.CheckVcManageCapabilitiesEntity;
import com.ss.android.vc.entity.FollowStatus;
import com.ss.android.vc.entity.GetAuthChattersResponse;
import com.ss.android.vc.entity.GetsuggetedParticipants;
import com.ss.android.vc.entity.H323Access;
import com.ss.android.vc.entity.HistoryMeeting;
import com.ss.android.vc.entity.InMeetingChangedInfo;
import com.ss.android.vc.entity.InMeetingData;
import com.ss.android.vc.entity.InMeetingUpdateMessage;
import com.ss.android.vc.entity.InterpreterSetting;
import com.ss.android.vc.entity.LangDetectInfo;
import com.ss.android.vc.entity.LanguageType;
import com.ss.android.vc.entity.LiveBindingData;
import com.ss.android.vc.entity.MeetingSecuritySetting;
import com.ss.android.vc.entity.MeetingStatus;
import com.ss.android.vc.entity.MeetingSubtitleData;
import com.ss.android.vc.entity.PSTNInfo;
import com.ss.android.vc.entity.PSTNPhone;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantChange;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.RTCProxy;
import com.ss.android.vc.entity.Source;
import com.ss.android.vc.entity.Status;
import com.ss.android.vc.entity.UpcomingEvent;
import com.ss.android.vc.entity.UpdateHistoryCalls;
import com.ss.android.vc.entity.UpdateHistoryMeetings;
import com.ss.android.vc.entity.UpdateUpcomingEvents;
import com.ss.android.vc.entity.UserAction;
import com.ss.android.vc.entity.VCEventAbbrInfo;
import com.ss.android.vc.entity.VCFeatureConfig;
import com.ss.android.vc.entity.VCHistoryType;
import com.ss.android.vc.entity.VCManageCapability;
import com.ss.android.vc.entity.VCNotice;
import com.ss.android.vc.entity.VCParticipantAbbrInfo;
import com.ss.android.vc.entity.VcDocType;
import com.ss.android.vc.entity.VcI18nKeyInfo;
import com.ss.android.vc.entity.VcMsgInfo;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatConfig;
import com.ss.android.vc.entity.VideoChatH323Setting;
import com.ss.android.vc.entity.VideoChatNoticeUpdate;
import com.ss.android.vc.entity.VideoChatPrompt;
import com.ss.android.vc.entity.VideoChatSIPSetting;
import com.ss.android.vc.entity.background.C60936b;
import com.ss.android.vc.entity.background.FileStatus;
import com.ss.android.vc.entity.background.MaterialSource;
import com.ss.android.vc.entity.background.MeetingBackground;
import com.ss.android.vc.entity.background.PushVirtualBackgroundType;
import com.ss.android.vc.entity.background.ViewDeviceSetting;
import com.ss.android.vc.entity.background.VirtualBackground;
import com.ss.android.vc.entity.background.VirtualBackgroundInfo;
import com.ss.android.vc.entity.breakoutroom.VCBreakoutRoomJoinEntity;
import com.ss.android.vc.entity.follow.FollowAction;
import com.ss.android.vc.entity.follow.FollowDataType;
import com.ss.android.vc.entity.follow.FollowGrootCellPayload;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.entity.follow.FollowPatch;
import com.ss.android.vc.entity.follow.FollowState;
import com.ss.android.vc.entity.follow.FollowStrategy;
import com.ss.android.vc.entity.follow.FollowWebData;
import com.ss.android.vc.entity.follow.ThumbnailDetail;
import com.ss.android.vc.entity.livestream.C60943c;
import com.ss.android.vc.entity.livestream.C60944d;
import com.ss.android.vc.entity.livestream.C60945e;
import com.ss.android.vc.entity.livestream.LiveExtraInfo;
import com.ss.android.vc.entity.livestream.LiveInfo;
import com.ss.android.vc.entity.livestream.LiveVote;
import com.ss.android.vc.entity.response.C60953a;
import com.ss.android.vc.entity.response.C60955ab;
import com.ss.android.vc.entity.response.C60956ac;
import com.ss.android.vc.entity.response.C60957ad;
import com.ss.android.vc.entity.response.C60961ag;
import com.ss.android.vc.entity.response.C60962ah;
import com.ss.android.vc.entity.response.C60963ai;
import com.ss.android.vc.entity.response.C60965at;
import com.ss.android.vc.entity.response.C60971e;
import com.ss.android.vc.entity.response.C60972f;
import com.ss.android.vc.entity.response.C60973g;
import com.ss.android.vc.entity.response.C60975i;
import com.ss.android.vc.entity.response.C60976j;
import com.ss.android.vc.entity.response.C60977k;
import com.ss.android.vc.entity.response.C60978l;
import com.ss.android.vc.entity.response.C60979m;
import com.ss.android.vc.entity.response.C60981o;
import com.ss.android.vc.entity.response.C60982p;
import com.ss.android.vc.entity.response.C60983q;
import com.ss.android.vc.entity.response.C60984s;
import com.ss.android.vc.entity.response.C60987v;
import com.ss.android.vc.entity.response.C60988w;
import com.ss.android.vc.entity.response.C60989x;
import com.ss.android.vc.entity.response.C60990y;
import com.ss.android.vc.entity.response.C60991z;
import com.ss.android.vc.entity.response.CalendarVCSettingsEntity;
import com.ss.android.vc.entity.response.ClientExtraActionEntity;
import com.ss.android.vc.entity.response.GetCalendarGuestEntity;
import com.ss.android.vc.entity.response.GetShareCodeInfoEntity;
import com.ss.android.vc.entity.response.GetUrlBriefsEntity;
import com.ss.android.vc.entity.response.IDTypeEntity;
import com.ss.android.vc.entity.response.JoinCalendarGroupMeetingEntity;
import com.ss.android.vc.entity.response.JoinMeetingEntity;
import com.ss.android.vc.entity.response.JoinMeetingPreCheckEntity;
import com.ss.android.vc.entity.response.PullVideoChatByShareCodeEntity;
import com.ss.android.vc.entity.response.PushGrootChannelStatusEntity;
import com.ss.android.vc.entity.response.RejoinVideoChatEntity;
import com.ss.android.vc.entity.response.ReservationInfoEntity;
import com.ss.android.vc.entity.response.SearchUsersAndChatsEntity;
import com.ss.android.vc.entity.response.SetVcVirtualBackgroundEntity;
import com.ss.android.vc.entity.response.SketchStartEntity;
import com.ss.android.vc.entity.response.ak;
import com.ss.android.vc.entity.response.an;
import com.ss.android.vc.entity.response.ap;
import com.ss.android.vc.entity.response.ar;
import com.ss.android.vc.entity.response.as;
import com.ss.android.vc.entity.response.au;
import com.ss.android.vc.entity.response.av;
import com.ss.android.vc.entity.response.ax;
import com.ss.android.vc.entity.response.ay;
import com.ss.android.vc.entity.response.az;
import com.ss.android.vc.entity.response.bb;
import com.ss.android.vc.entity.sketch.SketchDataUnit;
import com.ss.android.vc.entity.sketch.SketchOperationUnit;
import com.ss.android.vc.entity.tab.AccessInfos;
import com.ss.android.vc.entity.tab.CalendarEventReminder;
import com.ss.android.vc.entity.tab.FollowAbbrInfo;
import com.ss.android.vc.entity.tab.HistoryInfo;
import com.ss.android.vc.entity.tab.PSTNIncomingSetting;
import com.ss.android.vc.entity.tab.VCHistoryAbbrInfo;
import com.ss.android.vc.entity.tab.VCMeetingJoinInfoEntity;
import com.ss.android.vc.entity.tab.VCParamFromCalendar;
import com.ss.android.vc.entity.tab.VCParamFromGroup;
import com.ss.android.vc.entity.tab.VCTabDetailItemChangeEvent;
import com.ss.android.vc.entity.tab.VCTabHistoryCommonInfo;
import com.ss.android.vc.entity.tab.VCTabListGrootCellPayload;
import com.ss.android.vc.entity.tab.VCTabListHistoryListEntity;
import com.ss.android.vc.entity.tab.VCTabListItem;
import com.ss.android.vc.entity.tab.VCTabMeetingBaseInfo;
import com.ss.android.vc.entity.tab.VCTabMeetingChangeInfo;
import com.ss.android.vc.entity.tab.VCTabMeetingGrootCellPayload;
import com.ss.android.vc.entity.tab.VCTabMeetingJoinInfo;
import com.ss.android.vc.entity.tab.VCTabMeetingSourceAppLinkInfo;
import com.ss.android.vc.entity.tab.VCTabMeetingUserSpecInfo;
import com.ss.android.vc.entity.tab.VCTabRecordInfo;
import com.ss.android.vc.entity.tab.VCTabStatisticsInfo;
import com.ss.android.vc.entity.tab.VCTabTotalMissedCallInfoEntity;
import com.ss.android.vc.entity.tab.VCTabUserChangeType;
import com.ss.android.vc.entity.tab.VCTabUserGrootCellPayload;
import com.ss.android.vc.entity.tab.VcTabDetailInfo;
import com.ss.android.vc.entity.tab.VcTabDetailResponse;
import com.ss.android.vc.lark.setting.C61188b;
import com.ss.android.vc.meeting.module.VCBreakoutRoomCountdownInfo;
import com.ss.android.vc.meeting.module.VCBreakoutRoomInfo;
import com.ss.android.vc.meeting.module.VCBreakoutRoomInfoSettings;
import com.ss.android.vc.meeting.module.lobby.pb.C62148a;
import com.ss.android.vc.meeting.module.lobby.pb.C62149b;
import com.ss.android.vc.meeting.module.lobby.pb.VCLobbyParticipant;
import com.ss.android.vc.meeting.module.lobby.pb.VCManageNotify;
import com.ss.android.vc.meeting.module.lobby.pb.VCManageResult;
import com.ss.android.vc.meeting.module.lobby.pb.VCPreLobbyParticipant;
import com.ss.android.vc.meeting.module.reaction.util.InteractionMessageUtil;
import com.ss.android.vc.meeting.module.share.ShareItemType;
import com.ss.android.vc.meeting.module.share.VideoChatShareItem;
import com.ss.android.vc.meeting.module.sketch.dto.Coord;
import com.ss.android.vc.meeting.module.sketch.dto.RemoveData;
import com.ss.android.vc.meeting.module.sketch.dto.SketchByteviewUser;
import com.ss.android.vc.meeting.module.sketch.dto.pencil.PencilType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.vc.entity.a.c */
public class C60930c {
    /* renamed from: a */
    public static C60945e m236902a(VideoChatLivePreCheckResponse videoChatLivePreCheckResponse) {
        if (videoChatLivePreCheckResponse == null) {
            return null;
        }
        C60945e eVar = new C60945e();
        eVar.f152541a = videoChatLivePreCheckResponse.show_privacy_policy.booleanValue();
        return eVar;
    }

    /* renamed from: a */
    public static C60943c m236900a(VideoChatFetchLivePolicyResponse videoChatFetchLivePolicyResponse) {
        if (videoChatFetchLivePolicyResponse == null) {
            return null;
        }
        C60943c cVar = new C60943c();
        cVar.f152533b = m236928a(videoChatFetchLivePolicyResponse.PolicyOverseaForCallPC);
        cVar.f152532a = m236928a(videoChatFetchLivePolicyResponse.PolicyOverseaForMeetingPC);
        cVar.f152535d = m236928a(videoChatFetchLivePolicyResponse.PolicyOverseaWithoutSettingForCall);
        cVar.f152534c = m236928a(videoChatFetchLivePolicyResponse.PolicyOverseaWithoutSettingForMeeting);
        cVar.f152536e = m236928a(videoChatFetchLivePolicyResponse.PolicyWithoutSetting);
        cVar.f152538g = m236928a(videoChatFetchLivePolicyResponse.CertificationCheckbox);
        cVar.f152537f = m236928a(videoChatFetchLivePolicyResponse.CertificationPopup);
        return cVar;
    }

    /* renamed from: a */
    public static C60957ad m236928a(MegaI18n megaI18n) {
        if (megaI18n == null) {
            return null;
        }
        C60957ad adVar = new C60957ad();
        adVar.f152637a = megaI18n.key;
        if (megaI18n.data != null) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, MegaI18n.i18nData> entry : megaI18n.data.entrySet()) {
                C60957ad.C60958a aVar = new C60957ad.C60958a();
                aVar.f152639a = entry.getValue().payload;
                hashMap.put(entry.getKey(), aVar);
            }
            adVar.f152638b = hashMap;
        }
        return adVar;
    }

    /* renamed from: a */
    public static C60944d m236901a(VideoChatLiveActionResponse videoChatLiveActionResponse) {
        if (videoChatLiveActionResponse == null) {
            return null;
        }
        C60944d dVar = new C60944d();
        dVar.f152539a = videoChatLiveActionResponse.error_set;
        dVar.f152540b = videoChatLiveActionResponse.need_verification.booleanValue();
        return dVar;
    }

    /* renamed from: a */
    public static JoinCalendarGroupMeetingEntity m236911a(JoinCalendarGroupMeetingResponse joinCalendarGroupMeetingResponse) {
        if (joinCalendarGroupMeetingResponse == null) {
            return null;
        }
        JoinCalendarGroupMeetingEntity joinCalendarGroupMeetingEntity = new JoinCalendarGroupMeetingEntity();
        joinCalendarGroupMeetingEntity.f152597b = joinCalendarGroupMeetingResponse.is_created;
        if (joinCalendarGroupMeetingResponse.type != null) {
            joinCalendarGroupMeetingEntity.f152596a = JoinCalendarGroupMeetingEntity.Type.fromValue(joinCalendarGroupMeetingResponse.type.getValue());
        }
        joinCalendarGroupMeetingEntity.f152598c = C60932d.m237040a(joinCalendarGroupMeetingResponse.video_chat_info);
        joinCalendarGroupMeetingEntity.f152599d = m237000a(joinCalendarGroupMeetingResponse.join_meeting_lobby);
        return joinCalendarGroupMeetingEntity;
    }

    /* renamed from: a */
    public static JoinMeetingEntity m236912a(JoinMeetingResponse joinMeetingResponse) {
        if (joinMeetingResponse == null) {
            return null;
        }
        JoinMeetingEntity joinMeetingEntity = new JoinMeetingEntity();
        joinMeetingEntity.f152600a = JoinMeetingEntity.Type.fromValue(joinMeetingResponse.type.getValue());
        if (joinMeetingResponse.extra_actions != null) {
            ArrayList arrayList = new ArrayList();
            for (ClientExtraAction clientExtraAction : joinMeetingResponse.extra_actions) {
                arrayList.add(ClientExtraActionEntity.fromValue(clientExtraAction.getValue()));
            }
            joinMeetingEntity.f152602c = arrayList;
        }
        joinMeetingEntity.f152601b = C60932d.m237040a(joinMeetingResponse.video_chat_info);
        joinMeetingEntity.f152603d = m237000a(joinMeetingResponse.join_meeting_lobby);
        return joinMeetingEntity;
    }

    /* renamed from: a */
    public static ax m236942a(UpdateVideoChatResponse updateVideoChatResponse) {
        if (updateVideoChatResponse == null) {
            return null;
        }
        ax axVar = new ax();
        axVar.f152663a = C60932d.m237040a(updateVideoChatResponse.video_chat_info);
        axVar.f152664b = m237000a(updateVideoChatResponse.join_meeting_lobby);
        return axVar;
    }

    /* renamed from: a */
    public static C62149b m237000a(JoinMeetingLobby joinMeetingLobby) {
        if (joinMeetingLobby == null) {
            return null;
        }
        C62149b bVar = new C62149b();
        bVar.f156115a = joinMeetingLobby.is_join_meeting_lobby.booleanValue();
        bVar.f156116b = m236995a(joinMeetingLobby.lobby_participant);
        bVar.f156118d = m236998a(joinMeetingLobby.pre_lobby_participant);
        bVar.f156117c = joinMeetingLobby.is_join_pre_lobby.booleanValue();
        return bVar;
    }

    /* renamed from: a */
    public static RejoinVideoChatEntity m236915a(RejoinVideoChatResponse rejoinVideoChatResponse) {
        if (rejoinVideoChatResponse == null) {
            return null;
        }
        RejoinVideoChatEntity rejoinVideoChatEntity = new RejoinVideoChatEntity();
        rejoinVideoChatEntity.f152611a = C60932d.m237040a(rejoinVideoChatResponse.video_chat_info);
        rejoinVideoChatEntity.f152612b = RejoinVideoChatEntity.StatusCode.fromValue(rejoinVideoChatResponse.status.getValue());
        rejoinVideoChatEntity.f152613c = m237000a(rejoinVideoChatResponse.join_meeting_lobby);
        return rejoinVideoChatEntity;
    }

    /* renamed from: a */
    public static C60955ab m236926a(InviteVideoChatResponse inviteVideoChatResponse) {
        if (inviteVideoChatResponse == null) {
            return null;
        }
        C60955ab abVar = new C60955ab();
        abVar.f152633a = inviteVideoChatResponse.busy_user_ids;
        abVar.f152634b = inviteVideoChatResponse.pstn_ids;
        return abVar;
    }

    /* renamed from: a */
    public static C60978l m236953a(GetAssociatedVideoChatResponse getAssociatedVideoChatResponse) {
        if (getAssociatedVideoChatResponse == null) {
            return null;
        }
        C60978l lVar = new C60978l();
        lVar.f152698c = getAssociatedVideoChatResponse.interview_topic;
        lVar.f152699d = getAssociatedVideoChatResponse.topic;
        lVar.f152697b = getAssociatedVideoChatResponse.unique_id;
        lVar.f152696a = m237015j(getAssociatedVideoChatResponse.video_chat_info);
        return lVar;
    }

    /* renamed from: a */
    public static C60962ah m236930a(PullPreVideoChatSettingResponse pullPreVideoChatSettingResponse) {
        if (pullPreVideoChatSettingResponse == null) {
            return null;
        }
        C60962ah ahVar = new C60962ah();
        ahVar.f152644a = pullPreVideoChatSettingResponse.max_participant_num.intValue();
        return ahVar;
    }

    /* renamed from: a */
    public static C60982p m236956a(GetMeetingURLInfoResponse getMeetingURLInfoResponse) {
        if (getMeetingURLInfoResponse == null) {
            return null;
        }
        C60982p pVar = new C60982p();
        pVar.f152712b = getMeetingURLInfoResponse.meeting_no;
        pVar.f152714d = VideoChat.MeetingSource.forNumber(getMeetingURLInfoResponse.meeting_source.getValue());
        pVar.f152713c = getMeetingURLInfoResponse.meeting_url;
        pVar.f152711a = getMeetingURLInfoResponse.topic;
        return pVar;
    }

    /* renamed from: a */
    public static au m236939a(SyncSubtitlesResponse syncSubtitlesResponse) {
        if (syncSubtitlesResponse == null) {
            return null;
        }
        au auVar = new au();
        auVar.f152660a = syncSubtitlesResponse.meeting_id;
        return auVar;
    }

    /* renamed from: a */
    public static C60979m m236954a(GetAssociatedVideoChatStatusResponse getAssociatedVideoChatStatusResponse) {
        if (getAssociatedVideoChatStatusResponse == null) {
            return null;
        }
        C60979m mVar = new C60979m();
        mVar.f152702c = getAssociatedVideoChatStatusResponse.active_meeting_ids;
        mVar.f152706g = m236966a(getAssociatedVideoChatStatusResponse.chat_room_info);
        mVar.f152705f = getAssociatedVideoChatStatusResponse.has_active_chat_room;
        mVar.f152703d = getAssociatedVideoChatStatusResponse.has_active_meeting;
        mVar.f152700a = getAssociatedVideoChatStatusResponse.id;
        mVar.f152707h = getAssociatedVideoChatStatusResponse.seq_id;
        mVar.f152704e = m236966a(getAssociatedVideoChatStatusResponse.meeting_info);
        if (getAssociatedVideoChatStatusResponse.id_type != null) {
            mVar.f152701b = IDTypeEntity.fromValue(getAssociatedVideoChatStatusResponse.id_type.getValue());
        }
        mVar.f152708i = getAssociatedVideoChatStatusResponse.push_sid;
        return mVar;
    }

    /* renamed from: a */
    public static C60963ai m236931a(PullSubtitlesResponse pullSubtitlesResponse) {
        if (pullSubtitlesResponse == null) {
            return null;
        }
        C60963ai aiVar = new C60963ai();
        aiVar.f152647c = pullSubtitlesResponse.has_more.booleanValue();
        aiVar.f152646b = pullSubtitlesResponse.next_target_seg_id;
        if (pullSubtitlesResponse.subtitles != null) {
            ArrayList arrayList = new ArrayList();
            for (MeetingSubtitleData meetingSubtitleData : pullSubtitlesResponse.subtitles) {
                arrayList.add(m236855a(meetingSubtitleData));
            }
            aiVar.f152645a = arrayList;
        }
        return aiVar;
    }

    /* renamed from: a */
    public static C60983q m236957a(GetParticipantListResponse getParticipantListResponse) {
        if (getParticipantListResponse == null) {
            return null;
        }
        C60983q qVar = new C60983q();
        qVar.f152715a = m237012g(getParticipantListResponse.Participant_list);
        return qVar;
    }

    /* renamed from: a */
    public static an m236934a(SearchSubtitlesResponse searchSubtitlesResponse) {
        if (searchSubtitlesResponse == null) {
            return null;
        }
        an anVar = new an();
        anVar.f152652c = searchSubtitlesResponse.has_more.booleanValue();
        anVar.f152651b = searchSubtitlesResponse.pattern;
        anVar.f152650a = m237010e(searchSubtitlesResponse.matches);
        return anVar;
    }

    /* renamed from: a */
    public static GetsuggetedParticipants m236885a(GetSuggestedParticipantsResponse getSuggestedParticipantsResponse) {
        if (getSuggestedParticipantsResponse == null) {
            return null;
        }
        return m237006b(getSuggestedParticipantsResponse);
    }

    /* renamed from: a */
    public static C60975i m236950a(FetchAllSketchDataResponse fetchAllSketchDataResponse) {
        if (fetchAllSketchDataResponse == null) {
            return null;
        }
        C60975i iVar = new C60975i();
        iVar.f152693c = fetchAllSketchDataResponse.current_step;
        iVar.f152692b = fetchAllSketchDataResponse.version;
        iVar.f152691a = m237022q(fetchAllSketchDataResponse.sketch_units);
        return iVar;
    }

    /* renamed from: a */
    public static SketchStartEntity m236924a(SketchStartResponse sketchStartResponse) {
        if (sketchStartResponse == null) {
            return null;
        }
        SketchStartEntity sketchStartEntity = new SketchStartEntity();
        sketchStartEntity.can_other_sketch = sketchStartResponse.can_other_sketch.booleanValue();
        return sketchStartEntity;
    }

    /* renamed from: a */
    public static ar m236936a(ShareFollowResponse shareFollowResponse) {
        if (shareFollowResponse == null) {
            return null;
        }
        ar arVar = new ar();
        arVar.f152656a = m236890a(shareFollowResponse.follow_info);
        arVar.f152657b = shareFollowResponse.open_in_browser.booleanValue();
        return arVar;
    }

    /* renamed from: a */
    public static C60973g m236949a(CreateDocResponse createDocResponse) {
        if (createDocResponse == null) {
            return null;
        }
        C60973g gVar = new C60973g();
        gVar.f152688b = createDocResponse.code.intValue();
        gVar.f152689c = createDocResponse.msg;
        gVar.f152687a = createDocResponse.url;
        return gVar;
    }

    /* renamed from: a */
    public static C60961ag m236929a(PullAllFollowStatesResponse pullAllFollowStatesResponse) {
        if (pullAllFollowStatesResponse == null) {
            return null;
        }
        C60961ag agVar = new C60961ag();
        agVar.f152642b = pullAllFollowStatesResponse.down_version.intValue();
        agVar.f152643c = pullAllFollowStatesResponse.next_key;
        agVar.f152641a = m237011f(pullAllFollowStatesResponse.states);
        return agVar;
    }

    /* renamed from: a */
    public static ak m236933a(PullVideoChatInteractionMessagesResponse pullVideoChatInteractionMessagesResponse) {
        if (pullVideoChatInteractionMessagesResponse == null) {
            return null;
        }
        ak akVar = new ak();
        if (pullVideoChatInteractionMessagesResponse.messages != null) {
            ArrayList arrayList = new ArrayList();
            for (VideoChatInteractionMessage videoChatInteractionMessage : pullVideoChatInteractionMessagesResponse.messages) {
                arrayList.add(InteractionMessageUtil.m245784a(videoChatInteractionMessage));
            }
            akVar.f152649a = arrayList;
        }
        return akVar;
    }

    /* renamed from: a */
    public static ap m236935a(SendVideoChatInteractionMessageResponse sendVideoChatInteractionMessageResponse) {
        if (sendVideoChatInteractionMessageResponse == null) {
            return null;
        }
        ap apVar = new ap();
        if (sendVideoChatInteractionMessageResponse.message != null) {
            apVar.f152655a = InteractionMessageUtil.m245784a(sendVideoChatInteractionMessageResponse.message);
        }
        return apVar;
    }

    /* renamed from: a */
    public static SearchUsersAndChatsEntity m236922a(SearchUsersAndChatsResponse searchUsersAndChatsResponse) {
        VideoChatShareItem videoChatShareItem;
        boolean z;
        long j;
        boolean z2;
        boolean z3;
        if (searchUsersAndChatsResponse == null) {
            return null;
        }
        SearchUsersAndChatsEntity searchUsersAndChatsEntity = new SearchUsersAndChatsEntity();
        searchUsersAndChatsEntity.has_more = searchUsersAndChatsResponse.has_more.booleanValue();
        searchUsersAndChatsEntity.search_key = searchUsersAndChatsResponse.search_key;
        searchUsersAndChatsEntity.total_count = searchUsersAndChatsResponse.total_count.longValue();
        if (searchUsersAndChatsResponse.items != null && searchUsersAndChatsResponse.items.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (SearchUsersAndChatsResponse.UserAndCardItem userAndCardItem : searchUsersAndChatsResponse.items) {
                if (userAndCardItem.id_type == SearchUsersAndChatsResponse.IDType.CHAT) {
                    videoChatShareItem = new VideoChatShareItem(userAndCardItem.id, userAndCardItem.name, userAndCardItem.imageKey, userAndCardItem.desc, ShareItemType.GROUP, false, userAndCardItem.hit_terms, userAndCardItem.subtitle_hit_terms, userAndCardItem.is_external.booleanValue(), false, true, 0, null, null, null, false, null);
                } else if (userAndCardItem.id_type == SearchUsersAndChatsResponse.IDType.USER) {
                    if (userAndCardItem.user_info != null) {
                        z2 = userAndCardItem.user_info.has_permission.booleanValue();
                        j = userAndCardItem.user_info.zen_mode_end_time.longValue();
                        z = userAndCardItem.user_info.collaboration_type != null && userAndCardItem.user_info.collaboration_type == CollaborationType.BLOCKED;
                        z3 = userAndCardItem.user_info.description_flag == SearchUsersAndChatsResponse.UserWorkStatusType.ON_LEAVE;
                    } else {
                        j = 0;
                        z3 = false;
                        z2 = true;
                        z = false;
                    }
                    videoChatShareItem = new VideoChatShareItem(userAndCardItem.id, userAndCardItem.name, userAndCardItem.imageKey, userAndCardItem.desc, ShareItemType.USER, false, userAndCardItem.hit_terms, userAndCardItem.subtitle_hit_terms, userAndCardItem.is_external.booleanValue(), z3, z2, j, null, null, null, z, m237004a(userAndCardItem.user_info.custom_statuses));
                } else {
                    videoChatShareItem = userAndCardItem.id_type == SearchUsersAndChatsResponse.IDType.ROOM ? new VideoChatShareItem(userAndCardItem.id, userAndCardItem.name, userAndCardItem.imageKey, userAndCardItem.desc, ShareItemType.ROOM, false, userAndCardItem.hit_terms, userAndCardItem.subtitle_hit_terms, userAndCardItem.is_external.booleanValue(), false, true, 0, null, null, null, false, null) : null;
                }
                arrayList.add(videoChatShareItem);
            }
            searchUsersAndChatsEntity.items = arrayList;
        }
        return searchUsersAndChatsEntity;
    }

    /* renamed from: a */
    public static List<ChatterCustomStatus> m237004a(List<Chatter.ChatterCustomStatus> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                Chatter.ChatterCustomStatus chatterCustomStatus = list.get(i);
                arrayList.add(new ChatterCustomStatus(chatterCustomStatus.title, chatterCustomStatus.icon_key, chatterCustomStatus.is_not_disturb_mode.booleanValue(), m236802a(chatterCustomStatus.effective_interval), ""));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static JoinMeetingPreCheckEntity m236913a(JoinMeetingPreCheckResponse joinMeetingPreCheckResponse) {
        if (joinMeetingPreCheckResponse == null) {
            return null;
        }
        JoinMeetingPreCheckEntity joinMeetingPreCheckEntity = new JoinMeetingPreCheckEntity();
        joinMeetingPreCheckEntity.f152606c = VideoChat.VendorType.forNumber(joinMeetingPreCheckResponse.vendor_type.getValue());
        joinMeetingPreCheckEntity.f152604a = JoinMeetingPreCheckEntity.JoinMeetingCheckType.fromValue(joinMeetingPreCheckResponse.check_type.getValue());
        if (joinMeetingPreCheckResponse.associated_vc_info != null) {
            JoinMeetingPreCheckEntity.C60952a aVar = new JoinMeetingPreCheckEntity.C60952a();
            aVar.f152608b = joinMeetingPreCheckResponse.associated_vc_info.unique_id;
            if (joinMeetingPreCheckResponse.associated_vc_info.vc_infos != null) {
                aVar.f152607a = m237015j(joinMeetingPreCheckResponse.associated_vc_info.vc_infos);
            }
            joinMeetingPreCheckEntity.f152605b = aVar;
        }
        return joinMeetingPreCheckEntity;
    }

    /* renamed from: a */
    public static C60972f m236948a(CloseGrootChannelResponse closeGrootChannelResponse) {
        if (closeGrootChannelResponse == null) {
            return null;
        }
        C60972f fVar = new C60972f();
        fVar.f152686a = m236914a(closeGrootChannelResponse.status);
        return fVar;
    }

    /* renamed from: a */
    public static VCTabTotalMissedCallInfoEntity m236985a(GetVCTabTotalMissedCallResponse getVCTabTotalMissedCallResponse) {
        if (getVCTabTotalMissedCallResponse == null) {
            return null;
        }
        VCTabTotalMissedCallInfoEntity vCTabTotalMissedCallInfoEntity = new VCTabTotalMissedCallInfoEntity();
        vCTabTotalMissedCallInfoEntity.mconfirmed_missed_calls = getVCTabTotalMissedCallResponse.minfo.mconfirmed_missed_calls.longValue();
        vCTabTotalMissedCallInfoEntity.mtotal_missed_calls = getVCTabTotalMissedCallResponse.minfo.mtotal_missed_calls.longValue();
        return vCTabTotalMissedCallInfoEntity;
    }

    /* renamed from: a */
    public static az m236944a(VcQueryDocsResponse vcQueryDocsResponse) {
        if (vcQueryDocsResponse == null) {
            return null;
        }
        az azVar = new az();
        azVar.f152667b = vcQueryDocsResponse.has_more.booleanValue();
        azVar.f152668c = vcQueryDocsResponse.total.intValue();
        azVar.f152669d = vcQueryDocsResponse.offset.intValue();
        if (vcQueryDocsResponse.docs != null) {
            azVar.f152666a = C60932d.m237052c(vcQueryDocsResponse.docs);
        }
        return azVar;
    }

    /* renamed from: a */
    public static List<VCTabListItem> m237003a(GetVCUpcomingCalendarInstancesResponse getVCUpcomingCalendarInstancesResponse) {
        if (getVCUpcomingCalendarInstancesResponse == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (VCUpcomingVcInstance vCUpcomingVcInstance : getVCUpcomingCalendarInstancesResponse.instances) {
            arrayList.add(m236980a(vCUpcomingVcInstance));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static VCTabListItem m236980a(VCUpcomingVcInstance vCUpcomingVcInstance) {
        VCTabListItem vCTabListItem = new VCTabListItem();
        vCTabListItem.setUniqueId(vCUpcomingVcInstance.unique_id);
        vCTabListItem.setMeetingTopic(vCUpcomingVcInstance.summary);
        vCTabListItem.setMeetingTime(vCUpcomingVcInstance.start_time.longValue());
        vCTabListItem.setEndTime(vCUpcomingVcInstance.end_time.longValue());
        vCTabListItem.setMeetingNumber(vCUpcomingVcInstance.meeting_number);
        vCTabListItem.setContainsMultipleTenant(vCUpcomingVcInstance.is_cross_tenant.booleanValue());
        vCTabListItem.setKey(vCUpcomingVcInstance.key);
        vCTabListItem.setOriginalTime(vCUpcomingVcInstance.original_time.longValue());
        vCTabListItem.setMeetingStatus(VCTabListItem.MeetingStatus.MEETING_UPCOMING);
        if (vCUpcomingVcInstance.reminders != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < vCUpcomingVcInstance.reminders.size(); i++) {
                CalendarEventReminder calendarEventReminder = vCUpcomingVcInstance.reminders.get(i);
                com.ss.android.vc.entity.tab.CalendarEventReminder calendarEventReminder2 = new com.ss.android.vc.entity.tab.CalendarEventReminder();
                calendarEventReminder2.setCalendarEventId(calendarEventReminder.calendar_event_id);
                calendarEventReminder2.setMinutes(calendarEventReminder.minutes.intValue());
                calendarEventReminder2.setMethod(CalendarEventReminder.Method.valueOf(calendarEventReminder.method.getValue()));
                arrayList.add(calendarEventReminder2);
            }
            vCTabListItem.setReminders(arrayList);
        }
        return vCTabListItem;
    }

    /* renamed from: a */
    public static VCTabListHistoryListEntity m236978a(GetVCTabHistoryListResponse getVCTabHistoryListResponse) {
        if (getVCTabHistoryListResponse == null) {
            return null;
        }
        VCTabListHistoryListEntity vCTabListHistoryListEntity = new VCTabListHistoryListEntity();
        vCTabListHistoryListEntity.hasMore = getVCTabHistoryListResponse.has_more.booleanValue();
        vCTabListHistoryListEntity.downVersion = getVCTabHistoryListResponse.down_version.intValue();
        ArrayList arrayList = new ArrayList();
        for (com.ss.android.lark.pb.videoconference.v1.VCTabListItem vCTabListItem : getVCTabHistoryListResponse.items) {
            arrayList.add(m236979a(vCTabListItem));
        }
        vCTabListHistoryListEntity.setTabListItems(arrayList);
        return vCTabListHistoryListEntity;
    }

    /* renamed from: a */
    public static VCBreakoutRoomJoinEntity m236883a(BreakoutRoomJoinResponse breakoutRoomJoinResponse) {
        if (breakoutRoomJoinResponse == null) {
            return null;
        }
        VCBreakoutRoomJoinEntity vCBreakoutRoomJoinEntity = new VCBreakoutRoomJoinEntity();
        VideoChat a = C60932d.m237040a(breakoutRoomJoinResponse.video_chat_info);
        if (a != null) {
            vCBreakoutRoomJoinEntity.setVideoChatInfo(a);
        }
        return vCBreakoutRoomJoinEntity;
    }

    /* renamed from: a */
    public static VCMeetingJoinInfoEntity m236976a(GetVcMeetingJoinStatusResponse getVcMeetingJoinStatusResponse) {
        if (getVcMeetingJoinStatusResponse == null || getVcMeetingJoinStatusResponse.meeting_join_infos == null) {
            return null;
        }
        VCMeetingJoinInfoEntity vCMeetingJoinInfoEntity = new VCMeetingJoinInfoEntity();
        VCTabMeetingJoinInfo vCTabMeetingJoinInfo = new VCTabMeetingJoinInfo();
        vCTabMeetingJoinInfo.setMeetingId(getVcMeetingJoinStatusResponse.meeting_join_infos.meeting_id);
        vCTabMeetingJoinInfo.setJoinStatus(VCTabMeetingJoinInfo.JoinStatus.forNumber(getVcMeetingJoinStatusResponse.meeting_join_infos.join_status.getValue()));
        vCMeetingJoinInfoEntity.joinInfo = vCTabMeetingJoinInfo;
        return vCMeetingJoinInfoEntity;
    }

    /* renamed from: a */
    public static VCTabListItem m236979a(com.ss.android.lark.pb.videoconference.v1.VCTabListItem vCTabListItem) {
        if (vCTabListItem == null) {
            return null;
        }
        VCTabListItem vCTabListItem2 = new VCTabListItem();
        vCTabListItem2.setMeetingTopic(vCTabListItem.meeting_topic);
        vCTabListItem2.setContainsMultipleTenant(vCTabListItem.contains_multiple_tenant.booleanValue());
        vCTabListItem2.setSameTenantId(vCTabListItem.same_tenant_id);
        vCTabListItem2.setMeetingStatus(VCTabListItem.MeetingStatus.valueOf(vCTabListItem.meeting_status.getValue()));
        vCTabListItem2.setMeetingSource(VideoChat.MeetingSource.valueOf(vCTabListItem.meeting_source.getValue()));
        vCTabListItem2.setHistoryId(vCTabListItem.history_id);
        vCTabListItem2.setLocked(vCTabListItem.is_locked.booleanValue());
        vCTabListItem2.setMeetingId(vCTabListItem.meeting_id);
        vCTabListItem2.setMeetingType(VideoChat.Type.forNumber(vCTabListItem.meeting_type.getValue()));
        vCTabListItem2.setMeetingTime(vCTabListItem.sort_time.longValue());
        if (vCTabListItem.meeting_start_time != null && vCTabListItem2.getMeetingStatus() == VCTabListItem.MeetingStatus.MEETING_ON_THE_CALL) {
            if (TextUtils.isEmpty(vCTabListItem.meeting_start_time)) {
                vCTabListItem2.setCreateTime(vCTabListItem.sort_time.longValue());
            } else {
                vCTabListItem2.setCreateTime(Long.parseLong(vCTabListItem.meeting_start_time));
            }
        }
        vCTabListItem2.setMeetingNumber(vCTabListItem.meeting_number);
        vCTabListItem2.setUniqueId(vCTabListItem.unique_id);
        vCTabListItem2.setSubscribeDetailChange(vCTabListItem.subscribe_detail_change.booleanValue());
        ArrayList arrayList = new ArrayList();
        for (VCTabListItem.LogoType logoType : vCTabListItem.content_logos) {
            arrayList.add(VideoChat.LogoType.forNumber(logoType.getValue()));
        }
        vCTabListItem2.setContentLogos(arrayList);
        vCTabListItem2.setPhoneNumber(vCTabListItem.phone_number);
        vCTabListItem2.setPhoneType(VCTabListItem.PhoneType.forNumber(vCTabListItem.phone_type.getValue()));
        if (vCTabListItem.history_abbr_info != null) {
            VCHistoryAbbrInfo vCHistoryAbbrInfo = new VCHistoryAbbrInfo();
            vCHistoryAbbrInfo.setHistoryType(VCHistoryAbbrInfo.HistoryType.forNumber(vCTabListItem.history_abbr_info.history_type.getValue()));
            vCHistoryAbbrInfo.setCallStatus(VCHistoryAbbrInfo.CallStatus.forNumber(vCTabListItem.history_abbr_info.call_status.getValue()));
            vCHistoryAbbrInfo.setCallCount(vCTabListItem.history_abbr_info.call_count.longValue());
            vCHistoryAbbrInfo.setInteracterUserId(vCTabListItem.history_abbr_info.interacter_user_id);
            vCHistoryAbbrInfo.setParticipantType(ParticipantType.forNumber(vCTabListItem.history_abbr_info.interacter_user_type.getValue()));
            vCTabListItem2.setHistoryAbbrInfo(vCHistoryAbbrInfo);
        }
        return vCTabListItem2;
    }

    /* renamed from: a */
    public static VcTabDetailResponse m236992a(GetVCTabMeetingDetailResponse getVCTabMeetingDetailResponse) {
        return new VcTabDetailResponse(getVCTabMeetingDetailResponse.history_id, m237007b(getVCTabMeetingDetailResponse.infos), getVCTabMeetingDetailResponse.meeting_number, getVCTabMeetingDetailResponse.meeting_url, m236987a(getVCTabMeetingDetailResponse.access_infos), getVCTabMeetingDetailResponse.calendar_event_rrule);
    }

    /* renamed from: a */
    private static VCTabMeetingBaseInfo m236981a(com.ss.android.lark.pb.videoconference.v1.VCTabMeetingBaseInfo vCTabMeetingBaseInfo) {
        if (vCTabMeetingBaseInfo == null) {
            return null;
        }
        VCTabMeetingBaseInfo vCTabMeetingBaseInfo2 = new VCTabMeetingBaseInfo();
        vCTabMeetingBaseInfo2.setDownVersion(vCTabMeetingBaseInfo.down_version.intValue());
        vCTabMeetingBaseInfo2.setHistoryCommonInfo(m236989a(vCTabMeetingBaseInfo.meeting_info));
        vCTabMeetingBaseInfo2.setSponsorUser(m236832a(vCTabMeetingBaseInfo.sponsor_user));
        vCTabMeetingBaseInfo2.setParticipants(m237020o(vCTabMeetingBaseInfo.participants));
        return vCTabMeetingBaseInfo2;
    }

    /* renamed from: a */
    private static VCTabMeetingUserSpecInfo m236983a(com.ss.android.lark.pb.videoconference.v1.VCTabMeetingUserSpecInfo vCTabMeetingUserSpecInfo) {
        if (vCTabMeetingUserSpecInfo == null) {
            return null;
        }
        VCTabMeetingUserSpecInfo vCTabMeetingUserSpecInfo2 = new VCTabMeetingUserSpecInfo();
        vCTabMeetingUserSpecInfo2.setRecordInfo(m236984a(vCTabMeetingUserSpecInfo.record_info));
        vCTabMeetingUserSpecInfo2.setAppLinkInfo(m236982a(vCTabMeetingUserSpecInfo.source_applink));
        vCTabMeetingUserSpecInfo2.setVersion(vCTabMeetingUserSpecInfo.version.intValue());
        ArrayList arrayList = new ArrayList();
        for (HistoryInfo historyInfo : vCTabMeetingUserSpecInfo.history_info) {
            com.ss.android.vc.entity.tab.HistoryInfo a = m236975a(historyInfo);
            if (a != null) {
                arrayList.add(a);
            }
        }
        if (arrayList.size() > 0) {
            vCTabMeetingUserSpecInfo2.setHistoryInfos(arrayList);
        }
        vCTabMeetingUserSpecInfo2.setFollowInfo(m237009d(vCTabMeetingUserSpecInfo.follow_info));
        vCTabMeetingUserSpecInfo2.setStatisticsInfo(m236991a(vCTabMeetingUserSpecInfo.statistics_info));
        return vCTabMeetingUserSpecInfo2;
    }

    /* renamed from: a */
    private static AccessInfos m236987a(com.ss.android.lark.pb.videoconference.v1.AccessInfos accessInfos) {
        if (accessInfos == null) {
            return null;
        }
        return new AccessInfos(m236988a(accessInfos.pstn_incoming_setting), m236877a(accessInfos.sip_setting), m236872a(accessInfos.h323_setting));
    }

    /* renamed from: a */
    private static PSTNIncomingSetting m236988a(VideoChatPstnIncomingSetting videoChatPstnIncomingSetting) {
        ArrayList arrayList = new ArrayList();
        if (videoChatPstnIncomingSetting.pstn_incoming_call_country_default != null) {
            arrayList.addAll(videoChatPstnIncomingSetting.pstn_incoming_call_country_default);
        }
        ArrayList arrayList2 = new ArrayList();
        if (videoChatPstnIncomingSetting.pstn_incoming_call_phone_list != null) {
            for (PSTNPhone pSTNPhone : videoChatPstnIncomingSetting.pstn_incoming_call_phone_list) {
                arrayList2.add(m236858a(pSTNPhone));
            }
        }
        return new PSTNIncomingSetting(videoChatPstnIncomingSetting.pstn_enable_incoming_call, arrayList, arrayList2);
    }

    /* renamed from: a */
    private static VCTabMeetingSourceAppLinkInfo m236982a(MeetingSourceAppLinkInfo meetingSourceAppLinkInfo) {
        if (meetingSourceAppLinkInfo == null) {
            return null;
        }
        VCTabMeetingSourceAppLinkInfo vCTabMeetingSourceAppLinkInfo = new VCTabMeetingSourceAppLinkInfo();
        vCTabMeetingSourceAppLinkInfo.setType(VCTabMeetingSourceAppLinkInfo.Type.valueOf(meetingSourceAppLinkInfo.type.getValue()));
        if (meetingSourceAppLinkInfo.param_calendar != null) {
            VCParamFromCalendar vCParamFromCalendar = new VCParamFromCalendar();
            vCParamFromCalendar.setCalendar_id(meetingSourceAppLinkInfo.param_calendar.calendar_id);
            vCParamFromCalendar.setKey(meetingSourceAppLinkInfo.param_calendar.key);
            vCParamFromCalendar.setOriginal_time(meetingSourceAppLinkInfo.param_calendar.original_time.intValue());
            vCParamFromCalendar.setStart_time(meetingSourceAppLinkInfo.param_calendar.start_time.intValue());
            vCTabMeetingSourceAppLinkInfo.setParamFromCalendar(vCParamFromCalendar);
        }
        if (meetingSourceAppLinkInfo.param_group != null) {
            VCParamFromGroup vCParamFromGroup = new VCParamFromGroup();
            vCParamFromGroup.setChat_id(meetingSourceAppLinkInfo.param_group.chat_id);
            vCTabMeetingSourceAppLinkInfo.setParamFromGroup(vCParamFromGroup);
        }
        return vCTabMeetingSourceAppLinkInfo;
    }

    /* renamed from: a */
    public static VCTabStatisticsInfo m236991a(com.ss.android.lark.pb.videoconference.v1.VCTabStatisticsInfo vCTabStatisticsInfo) {
        if (vCTabStatisticsInfo != null) {
            return new VCTabStatisticsInfo(m236801a(vCTabStatisticsInfo.status), vCTabStatisticsInfo.statistics_url, vCTabStatisticsInfo.statistics_file_title, vCTabStatisticsInfo.meeting_id, vCTabStatisticsInfo.version);
        }
        return null;
    }

    /* renamed from: a */
    public static com.ss.android.vc.entity.tab.HistoryInfo m236975a(HistoryInfo historyInfo) {
        com.ss.android.vc.entity.tab.HistoryInfo historyInfo2 = new com.ss.android.vc.entity.tab.HistoryInfo();
        if (historyInfo == null) {
            return null;
        }
        historyInfo2.setHistoryType(HistoryInfo.HistoryType.valueOf(historyInfo.history_type.getValue()));
        historyInfo2.setHistoryInfoType(HistoryInfo.HistoryInfoType.valueOf(historyInfo.history_info_type.getValue()));
        historyInfo2.setCallStatus(HistoryInfo.CallStatus.valueOf(historyInfo.call_status.getValue()));
        historyInfo2.setInteracterUserId(historyInfo.interacter_user_id);
        historyInfo2.setInteracterUserType(ParticipantType.valueOf(historyInfo.interacter_user_type.getValue()));
        historyInfo2.setCallStarTime(historyInfo.call_start_time.longValue());
        historyInfo2.setJoinTime(historyInfo.join_time.longValue());
        historyInfo2.setLeaveTime(historyInfo.leave_time.longValue());
        return historyInfo2;
    }

    /* renamed from: a */
    public static VCTabHistoryCommonInfo m236989a(com.ss.android.lark.pb.videoconference.v1.VCTabHistoryCommonInfo vCTabHistoryCommonInfo) {
        if (vCTabHistoryCommonInfo != null) {
            return new VCTabHistoryCommonInfo(vCTabHistoryCommonInfo.meeting_topic, VideoChat.Type.forNumber(vCTabHistoryCommonInfo.meeting_type.getValue()), VideoChat.MeetingSource.forNumber(vCTabHistoryCommonInfo.meeting_source.getValue()), MeetingStatus.valueOf(vCTabHistoryCommonInfo.meeting_status.getValue()), vCTabHistoryCommonInfo.is_locked.booleanValue(), vCTabHistoryCommonInfo.contains_multiple_tenant.booleanValue(), vCTabHistoryCommonInfo.is_recorded.booleanValue(), vCTabHistoryCommonInfo.same_tenant_id, vCTabHistoryCommonInfo.start_time.longValue(), vCTabHistoryCommonInfo.end_time.longValue(), m236832a(vCTabHistoryCommonInfo.host_user));
        }
        return null;
    }

    /* renamed from: a */
    public static VCTabRecordInfo m236984a(VCTabDetailRecordInfo vCTabDetailRecordInfo) {
        VCTabRecordInfo.RecordType recordType;
        VCTabRecordInfo vCTabRecordInfo = new VCTabRecordInfo();
        if (vCTabDetailRecordInfo == null) {
            return null;
        }
        if (vCTabDetailRecordInfo.type == VCTabDetailRecordInfo.RecordType.LARK_MINUTES) {
            recordType = VCTabRecordInfo.RecordType.LARK_MINUTES;
        } else if (vCTabDetailRecordInfo.type == VCTabDetailRecordInfo.RecordType.RECORD) {
            recordType = VCTabRecordInfo.RecordType.RECORD;
        } else {
            recordType = VCTabRecordInfo.RecordType.UNKNOWN;
        }
        vCTabRecordInfo.setRecordType(recordType);
        vCTabRecordInfo.setUrlList(vCTabDetailRecordInfo.url);
        return vCTabRecordInfo;
    }

    /* renamed from: a */
    public static PushGrootChannelStatusEntity m236914a(PushGrootChannelStatus pushGrootChannelStatus) {
        if (pushGrootChannelStatus == null) {
            return null;
        }
        PushGrootChannelStatusEntity pushGrootChannelStatusEntity = new PushGrootChannelStatusEntity();
        pushGrootChannelStatusEntity.f152610b = PushGrootChannelStatusEntity.Status.fromValue(pushGrootChannelStatus.status.getValue());
        pushGrootChannelStatusEntity.f152609a = m236833a(pushGrootChannelStatus.channel_meta);
        return pushGrootChannelStatusEntity;
    }

    /* renamed from: a */
    public static C60956ac m236927a(JoinInterviewGroupMeetingResponse joinInterviewGroupMeetingResponse) {
        if (joinInterviewGroupMeetingResponse == null) {
            return null;
        }
        C60956ac acVar = new C60956ac();
        if (joinInterviewGroupMeetingResponse.video_chat_info != null) {
            acVar.f152635a = C60932d.m237040a(joinInterviewGroupMeetingResponse.video_chat_info);
            acVar.f152636b = m237000a(joinInterviewGroupMeetingResponse.join_meeting_lobby);
        }
        return acVar;
    }

    /* renamed from: a */
    public static VideoChatConfig m236870a(PullVideoChatConfigResponse pullVideoChatConfigResponse) {
        if (pullVideoChatConfigResponse == null) {
            return null;
        }
        VideoChatConfig videoChatConfig = new VideoChatConfig();
        videoChatConfig.setMaxParticipantCount(pullVideoChatConfigResponse.max_participant_count.intValue());
        videoChatConfig.setMaxRtcParticipantCount(pullVideoChatConfigResponse.rtc_max_participant_count.intValue());
        videoChatConfig.setMeetingHeartbeatCycle(pullVideoChatConfigResponse.meeting_heartbeat_cycle.intValue());
        videoChatConfig.setMeetingHeartbeatExpireTime(pullVideoChatConfigResponse.meeting_heartbeat_expired_time.intValue());
        videoChatConfig.setCallHeartbeatCycle(pullVideoChatConfigResponse.call_heartbeat_cycle.intValue());
        videoChatConfig.setCallHeartbeatExpireTime(pullVideoChatConfigResponse.call_heartbeat_expired_time.intValue());
        videoChatConfig.setLobbyHeartbeatCycle(pullVideoChatConfigResponse.lobby_heartbeat_cycle.intValue());
        videoChatConfig.setLobbyHeartbeatExpiredTime(pullVideoChatConfigResponse.lobby_heartbeat_expired_time.intValue());
        videoChatConfig.setByteSdkRateConfig(m236869a(pullVideoChatConfigResponse.byte_sdk_rate_config));
        videoChatConfig.setVideoChatCountDownDuration(pullVideoChatConfigResponse.videochat_countdown_duration.intValue());
        videoChatConfig.setMeetingUrlKeys(pullVideoChatConfigResponse.meeting_url_keys);
        videoChatConfig.setMeetingUrlPathKeys(pullVideoChatConfigResponse.meeting_url_path_keys);
        videoChatConfig.setSubtitleLanguages(m237019n(pullVideoChatConfigResponse.subtitle_languages));
        videoChatConfig.setSpokenLanguages(m237019n(pullVideoChatConfigResponse.spoken_languages));
        videoChatConfig.setEnableUpgradePlanMap(pullVideoChatConfigResponse.enable_upgrade_plan_notice);
        videoChatConfig.setMeetingSupportInterpretationLanguage(m237024s(pullVideoChatConfigResponse.meeting_support_interpretation_language));
        return videoChatConfig;
    }

    /* renamed from: a */
    public static GetUrlBriefsEntity m236910a(GetUrlBriefsResponse getUrlBriefsResponse) {
        if (getUrlBriefsResponse == null) {
            return null;
        }
        GetUrlBriefsEntity getUrlBriefsEntity = new GetUrlBriefsEntity();
        HashMap hashMap = new HashMap();
        if (getUrlBriefsResponse.url_briefs != null) {
            for (Map.Entry<String, UrlBrief> entry : getUrlBriefsResponse.url_briefs.entrySet()) {
                UrlBrief value = entry.getValue();
                com.ss.android.vc.entity.UrlBrief urlBrief = new com.ss.android.vc.entity.UrlBrief();
                urlBrief.isDirty = value.is_dirty;
                urlBrief.title = value.title;
                urlBrief.url = value.url;
                urlBrief.openInBrowser = value.open_in_browser.booleanValue();
                urlBrief.type = FollowInfo.ShareType.forNumber(value.type.getValue());
                urlBrief.subtype = FollowInfo.ShareSubType.forNumber(value.subtype.getValue());
                urlBrief.thumbnail = m236895a(value.thumbnail);
                hashMap.put(entry.getKey(), urlBrief);
            }
        }
        getUrlBriefsEntity.urlBriefs = hashMap;
        return getUrlBriefsEntity;
    }

    /* renamed from: a */
    public static C60991z m236965a(GetViewI18nTemplateResponse getViewI18nTemplateResponse) {
        if (getViewI18nTemplateResponse == null) {
            return null;
        }
        C60991z zVar = new C60991z();
        zVar.f152731a = getViewI18nTemplateResponse.templates;
        return zVar;
    }

    /* renamed from: a */
    public static ChannelMeta m236833a(com.ss.android.lark.pb.videoconference.v1.ChannelMeta channelMeta) {
        if (channelMeta == null) {
            return null;
        }
        ChannelMeta channelMeta2 = new ChannelMeta();
        if (channelMeta.channel != null) {
            channelMeta2.grootChannel = ChannelMeta.GrootChannel.fromValue(channelMeta.channel.getValue());
        }
        channelMeta2.channelId = channelMeta.channel_id;
        return channelMeta2;
    }

    /* renamed from: a */
    public static FollowState m236892a(com.ss.android.lark.pb.videoconference.v1.FollowState followState) {
        if (followState == null) {
            return null;
        }
        FollowState followState2 = new FollowState();
        followState2.setDataType(FollowDataType.valueOf(followState.data_type.getValue()));
        followState2.setWebData(m236894a(followState.web_data));
        followState2.setSenderId(followState.sender);
        return followState2;
    }

    /* renamed from: a */
    public static com.ss.android.lark.pb.videoconference.v1.FollowState m236809a(FollowState followState) {
        if (followState == null) {
            return null;
        }
        FollowState.C50577a aVar = new FollowState.C50577a();
        aVar.mo175112a(com.ss.android.lark.pb.videoconference.v1.FollowDataType.fromValue(followState.getDataType().getNumber()));
        aVar.mo175113a(m236810a(followState.getWebData()));
        aVar.mo175114a(followState.getSenderId());
        return aVar.build();
    }

    /* renamed from: a */
    public static ByteviewUser m236832a(com.ss.android.lark.pb.videoconference.v1.ByteviewUser byteviewUser) {
        if (byteviewUser == null) {
            return null;
        }
        ByteviewUser byteviewUser2 = new ByteviewUser();
        byteviewUser2.setUserId(byteviewUser.user_id);
        byteviewUser2.setDeviceId(byteviewUser.device_id);
        byteviewUser2.setParticipantType(ParticipantType.forNumber(byteviewUser.user_type.getValue()));
        return byteviewUser2;
    }

    /* renamed from: a */
    public static ByteviewUser m236831a(com.ss.android.lark.pb.videochat.ByteviewUser byteviewUser) {
        if (byteviewUser == null) {
            return null;
        }
        ByteviewUser byteviewUser2 = new ByteviewUser();
        byteviewUser2.setUserId(byteviewUser.muser_id);
        byteviewUser2.setDeviceId(byteviewUser.mdevice_id);
        byteviewUser2.setParticipantType(ParticipantType.forNumber(byteviewUser.muser_type.getValue()));
        return byteviewUser2;
    }

    /* renamed from: a */
    public static List<com.ss.android.lark.pb.videoconference.v1.ByteviewUser> m237005a(Map<String, ParticipantType> map) {
        if (map == null || CollectionUtils.isEmpty(map)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (String str : map.keySet()) {
            arrayList.add(new com.ss.android.lark.pb.videoconference.v1.ByteviewUser(str, "0", com.ss.android.lark.pb.videoconference.v1.ParticipantType.fromValue(map.get(str).getNumber())));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static FollowInfo m236890a(com.ss.android.lark.pb.videoconference.v1.FollowInfo followInfo) {
        if (followInfo == null) {
            return null;
        }
        FollowInfo followInfo2 = new FollowInfo();
        followInfo2.setDeviceId(followInfo.device_id);
        followInfo2.setUserId(followInfo.user_id);
        followInfo2.setUserType(ParticipantType.valueOf(followInfo.user_type.getValue()));
        followInfo2.setUrl(followInfo.url);
        followInfo2.setRawUrl(followInfo.raw_url);
        followInfo2.setToken(followInfo.doc_token);
        followInfo2.setType(VcDocType.forNumber(followInfo.doc_type.getValue()));
        followInfo2.setDocTitle(followInfo.doc_title);
        followInfo2.setShareId(followInfo.share_id);
        followInfo2.setVersion(followInfo.version.intValue());
        followInfo2.setOptions(m236889a(followInfo.options));
        if (followInfo.strategies != null && followInfo.strategies.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (FollowStrategy followStrategy : followInfo.strategies) {
                arrayList.add(m236893a(followStrategy));
            }
            followInfo2.setStrategies(arrayList);
        }
        followInfo2.setThumbnailDetail(m236895a(followInfo.thumbnail));
        followInfo2.setShareType(FollowInfo.ShareType.valueOf(followInfo.share_type.getValue()));
        followInfo2.setShareSubType(FollowInfo.ShareSubType.valueOf(followInfo.share_subtype.getValue()));
        followInfo2.setInitSource(FollowInfo.InitSource.valueOf(followInfo.init_source.getValue()));
        return followInfo2;
    }

    /* renamed from: a */
    public static C61188b m236993a(ViewUserSetting viewUserSetting) {
        C61188b bVar = new C61188b();
        if (viewUserSetting != null) {
            if (viewUserSetting.meeting_general != null) {
                bVar.mo211575a(viewUserSetting.meeting_general.calendar_meeting_start_notify.booleanValue());
                bVar.mo211577b(viewUserSetting.meeting_general.play_enter_exit_chimes.booleanValue());
            }
            if (viewUserSetting.meeting_advanced != null) {
                if (viewUserSetting.meeting_advanced.subtitle != null) {
                    bVar.mo211579c(viewUserSetting.meeting_advanced.subtitle.turn_on_subtitle_when_join.booleanValue());
                }
                if (viewUserSetting.meeting_advanced.interpretation != null) {
                    bVar.mo211581d(viewUserSetting.meeting_advanced.interpretation.can_open_interpretation.booleanValue());
                }
            }
        }
        return bVar;
    }

    /* renamed from: a */
    public static C60941k m236896a(SketchGrootCellPayload sketchGrootCellPayload) {
        if (sketchGrootCellPayload == null) {
            return null;
        }
        C60941k kVar = new C60941k();
        kVar.f152505b = sketchGrootCellPayload.meeting_id;
        if (sketchGrootCellPayload.units != null) {
            kVar.f152504a = m237023r(sketchGrootCellPayload.units);
        }
        return kVar;
    }

    /* renamed from: a */
    public static LiveExtraInfo m236897a(VideoChatExtraInfo.LiveExtraInfo liveExtraInfo) {
        if (liveExtraInfo == null) {
            return null;
        }
        LiveExtraInfo liveExtraInfo2 = new LiveExtraInfo();
        liveExtraInfo2.setOnlineUsersCount(liveExtraInfo.online_users_count.intValue());
        return liveExtraInfo2;
    }

    /* renamed from: a */
    public static LiveInfo m236899a(InMeetingData.LiveMeetingData.LiveInfo liveInfo) {
        if (liveInfo == null) {
            return null;
        }
        LiveInfo aVar = new LiveInfo();
        aVar.mo209936a(liveInfo.live_name);
        aVar.mo209942b(liveInfo.live_url);
        aVar.mo209937a(liveInfo.is_living.booleanValue());
        aVar.mo209934a(m236898a(liveInfo.live_vote));
        aVar.mo209930a(liveInfo.sid.longValue());
        aVar.mo209932a(InMeetingData.LiveMeetingData.Privilege.fromValue(liveInfo.privilege.getValue()));
        aVar.mo209940b(InMeetingData.LiveMeetingData.Privilege.fromValue(liveInfo.default_privilege.getValue()));
        aVar.mo209931a(InMeetingData.LiveMeetingData.LayoutStyle.fromValue(liveInfo.layout_style.getValue()));
        aVar.mo209939b(InMeetingData.LiveMeetingData.LayoutStyle.fromValue(liveInfo.default_layout_style.getValue()));
        aVar.mo209935a(liveInfo.enable_live_comment);
        aVar.mo209941b(liveInfo.default_enable_live_comment);
        aVar.mo209933a(m236839a(liveInfo.binding_living));
        aVar.mo209938b(liveInfo.live_id.longValue());
        aVar.mo209945c(liveInfo.live_session_id);
        return aVar;
    }

    /* renamed from: a */
    public static InMeetingData.LiveMeetingData.C60921a m236839a(InMeetingData.LiveMeetingData.BindingLiveInfo bindingLiveInfo) {
        if (bindingLiveInfo == null) {
            return null;
        }
        InMeetingData.LiveMeetingData.C60921a aVar = new InMeetingData.LiveMeetingData.C60921a();
        HashMap hashMap = new HashMap();
        if (bindingLiveInfo.account_bindings != null) {
            for (Map.Entry<String, LiveBindingData.LiveAccountData> entry : bindingLiveInfo.account_bindings.entrySet()) {
                hashMap.put(entry.getKey(), m236849a(entry.getValue()));
            }
            aVar.f152430a = hashMap;
        }
        HashMap hashMap2 = new HashMap();
        if (bindingLiveInfo.stream_bindings != null) {
            for (Map.Entry<String, LiveBindingData.LiveStreamData> entry2 : bindingLiveInfo.stream_bindings.entrySet()) {
                hashMap2.put(entry2.getKey(), m236850a(entry2.getValue()));
            }
            aVar.f152431b = hashMap2;
        }
        return aVar;
    }

    /* renamed from: a */
    public static LiveBindingData.C60922a m236849a(LiveBindingData.LiveAccountData liveAccountData) {
        if (liveAccountData != null) {
            return null;
        }
        LiveBindingData.C60922a aVar = new LiveBindingData.C60922a();
        aVar.f152450c = liveAccountData.account_id;
        aVar.f152449b = liveAccountData.binding_id;
        aVar.f152452e = liveAccountData.is_living;
        aVar.f152454g = liveAccountData.living_device_id;
        aVar.f152453f = liveAccountData.living_meeting_id;
        aVar.f152451d = liveAccountData.nick_name;
        aVar.f152455h = liveAccountData.open_id;
        aVar.f152448a = LiveBindingData.BindingType.fromValue(liveAccountData.binding_type.getValue());
        return aVar;
    }

    /* renamed from: a */
    public static LiveBindingData.C60923b m236850a(LiveBindingData.LiveStreamData liveStreamData) {
        if (liveStreamData == null) {
            return null;
        }
        LiveBindingData.C60923b bVar = new LiveBindingData.C60923b();
        bVar.f152457b = liveStreamData.binding_id;
        bVar.f152461f = liveStreamData.is_living;
        bVar.f152463h = liveStreamData.living_device_id;
        bVar.f152462g = liveStreamData.living_meeting_id;
        bVar.f152456a = LiveBindingData.BindingType.fromValue(liveStreamData.binding_type.getValue());
        bVar.f152458c = liveStreamData.binding_name;
        bVar.f152460e = liveStreamData.token;
        bVar.f152459d = liveStreamData.url;
        return bVar;
    }

    /* renamed from: a */
    public static LiveVote m236898a(InMeetingData.LiveMeetingData.LiveVote liveVote) {
        if (liveVote == null) {
            return null;
        }
        LiveVote liveVote2 = new LiveVote();
        liveVote2.mo209918a(LiveVote.Reason.Companion.mo209928a(liveVote.reason.getValue()));
        liveVote2.mo209921b(liveVote.sponsor_id);
        liveVote2.mo209919a(liveVote.vote_id);
        liveVote2.mo209920a(liveVote.isVoting.booleanValue());
        return liveVote2;
    }

    /* renamed from: a */
    public static AdminSettings m236829a(GetAdminSettingsResponse getAdminSettingsResponse) {
        if (getAdminSettingsResponse == null) {
            return null;
        }
        AdminSettings adminSettings = new AdminSettings();
        adminSettings.enableRecord = getAdminSettingsResponse.enable_record.booleanValue();
        adminSettings.enableSubtitile = getAdminSettingsResponse.enable_subtitle.booleanValue();
        adminSettings.pstnEnableOutgoingCall = getAdminSettingsResponse.pstn_enable_outgoing_call.booleanValue();
        adminSettings.pstnHidePhoneNumber = getAdminSettingsResponse.pstn_hide_phone_number.booleanValue();
        adminSettings.pstnEnableIncomingCall = getAdminSettingsResponse.pstn_enable_incoming_call.booleanValue();
        adminSettings.pstnIncomingCallCountryDefault = getAdminSettingsResponse.pstn_incoming_call_country_default;
        adminSettings.pstnIncomingCallPhoneList = new ArrayList();
        if (getAdminSettingsResponse.pstn_incoming_call_phone_list != null) {
            for (PSTNPhone pSTNPhone : getAdminSettingsResponse.pstn_incoming_call_phone_list) {
                adminSettings.pstnIncomingCallPhoneList.add(m236858a(pSTNPhone));
            }
        }
        adminSettings.pstnOutgoingCallCountryDefault = getAdminSettingsResponse.pstn_outgoing_call_country_default;
        adminSettings.pstnOutgoingCallCountryList = getAdminSettingsResponse.pstn_outgoing_call_country_list;
        adminSettings.pstnJoinMeetingPrompt = getAdminSettingsResponse.pstn_join_meeting_prompt.booleanValue();
        adminSettings.enableMeetingBackground = getAdminSettingsResponse.enable_meeting_background.booleanValue();
        adminSettings.enableCustomMeetingBackground = getAdminSettingsResponse.enable_custom_meeting_background.booleanValue();
        adminSettings.enableVirtualAvatar = getAdminSettingsResponse.enable_virtual_avatar.booleanValue();
        adminSettings.canPersonalInstall = getAdminSettingsResponse.can_personal_install.booleanValue();
        adminSettings.meetingBackgroundList = m237027v(getAdminSettingsResponse.meeting_background_list);
        adminSettings.enableCheckScreenShare = getAdminSettingsResponse.enable_check_screen_share.booleanValue();
        adminSettings.proxy = m236861a(getAdminSettingsResponse.rtc_proxy);
        return adminSettings;
    }

    /* renamed from: a */
    public static ByteViewUserInfo m236830a(com.ss.android.lark.pb.videoconference.v1.ByteViewUserInfo byteViewUserInfo) {
        if (byteViewUserInfo == null) {
            return null;
        }
        ByteViewUserInfo byteViewUserInfo2 = new ByteViewUserInfo();
        byteViewUserInfo2.user = m236832a(byteViewUserInfo.user);
        byteViewUserInfo2.fullName = byteViewUserInfo.fullName;
        byteViewUserInfo2.displayName = byteViewUserInfo.displayName;
        byteViewUserInfo2.avatar_key = byteViewUserInfo.avatar_key;
        return byteViewUserInfo2;
    }

    /* renamed from: a */
    public static InMeetingData.RecordMeetingData m236841a(InMeetingData.RecordMeetingData recordMeetingData) {
        if (recordMeetingData == null) {
            return null;
        }
        InMeetingData.RecordMeetingData recordMeetingData2 = new InMeetingData.RecordMeetingData();
        recordMeetingData2.mo209052a(recordMeetingData.is_recording.booleanValue());
        recordMeetingData2.mo209047a(m236832a(recordMeetingData.requester));
        recordMeetingData2.mo209048a(InMeetingData.RecordMeetingData.Type.forNumber(recordMeetingData.type.getValue()));
        recordMeetingData2.mo209051a(recordMeetingData.policy_url);
        recordMeetingData2.mo209049a(m236867a(recordMeetingData.recording_stop));
        recordMeetingData2.mo209050a(m236868a(recordMeetingData.recording_stop_v2));
        return recordMeetingData2;
    }

    /* renamed from: a */
    public static VcI18nKeyInfo m236867a(I18nKeyInfo i18nKeyInfo) {
        if (i18nKeyInfo == null) {
            return null;
        }
        VcI18nKeyInfo vcI18nKeyInfo = new VcI18nKeyInfo();
        vcI18nKeyInfo.key = i18nKeyInfo.key;
        vcI18nKeyInfo.newKey = i18nKeyInfo.new_key;
        vcI18nKeyInfo.jumpScheme = i18nKeyInfo.jump_scheme;
        vcI18nKeyInfo.type = VcI18nKeyInfo.Type.valueOf(i18nKeyInfo.type.getValue());
        vcI18nKeyInfo.params = i18nKeyInfo.params;
        if (i18nKeyInfo.i18n_params != null) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, I18nKeyInfo.I18nParam> entry : i18nKeyInfo.i18n_params.entrySet()) {
                VcI18nKeyInfo.I18nParam i18nParam = new VcI18nKeyInfo.I18nParam();
                i18nParam.value = entry.getValue().val;
                i18nParam.type = VcI18nKeyInfo.I18nParam.Type.valueOf(entry.getValue().type.getValue());
                hashMap.put(entry.getKey(), i18nParam);
            }
            vcI18nKeyInfo.i18nParams = hashMap;
        }
        return vcI18nKeyInfo;
    }

    /* renamed from: a */
    public static InMeetingData.SubtitleStatusData m236842a(InMeetingData.SubtitleStatusData subtitleStatusData) {
        if (subtitleStatusData == null) {
            return null;
        }
        InMeetingData.SubtitleStatusData subtitleStatusData2 = new InMeetingData.SubtitleStatusData();
        subtitleStatusData2.f152438a = InMeetingData.SubtitleStatusData.Status.valueOf(subtitleStatusData.status.getValue());
        subtitleStatusData2.f152439b = m236846a(subtitleStatusData.lang_detect_info);
        subtitleStatusData2.f152442e = m236832a(subtitleStatusData.first_one_open_subtitle);
        subtitleStatusData2.f152440c = subtitleStatusData.is_subtitle_on.booleanValue();
        subtitleStatusData2.f152441d = subtitleStatusData.global_spoken_language;
        return subtitleStatusData2;
    }

    /* renamed from: a */
    public static InMeetingData.LiveMeetingData m236840a(InMeetingData.LiveMeetingData liveMeetingData) {
        if (liveMeetingData == null) {
            return null;
        }
        InMeetingData.LiveMeetingData liveMeetingData2 = new InMeetingData.LiveMeetingData();
        if (liveMeetingData.live_info != null) {
            liveMeetingData2.mo209032a(m236899a(liveMeetingData.live_info));
        }
        liveMeetingData2.mo209030a(m236832a(liveMeetingData.requester));
        liveMeetingData2.mo209031a(InMeetingData.LiveMeetingData.Type.forNumber(liveMeetingData.type.getValue()));
        return liveMeetingData2;
    }

    /* renamed from: a */
    public static LangDetectInfo m236846a(InMeetingData.SubtitleStatusData.LangDetectInfo langDetectInfo) {
        LangDetectInfo langDetectInfo2 = new LangDetectInfo();
        if (langDetectInfo != null) {
            langDetectInfo2.f152443a = LangDetectInfo.Type.valueOf(langDetectInfo.type.getValue());
            langDetectInfo2.f152444b = langDetectInfo.detected_language;
            langDetectInfo2.f152445c = langDetectInfo.detected_language_key;
            langDetectInfo2.f152446d = langDetectInfo.detected_language;
            langDetectInfo2.f152447e = langDetectInfo.language_key;
        }
        return langDetectInfo2;
    }

    /* renamed from: a */
    public static MeetingSecuritySetting m236852a(VideoChatSecuritySetting videoChatSecuritySetting) {
        MeetingSecuritySetting meetingSecuritySetting = new MeetingSecuritySetting();
        if (videoChatSecuritySetting != null) {
            meetingSecuritySetting.setGroupIds(videoChatSecuritySetting.group_ids);
            meetingSecuritySetting.setUserIds(videoChatSecuritySetting.user_ids);
            meetingSecuritySetting.setSecurityLevel(MeetingSecuritySetting.SecurityLevel.forNumber(videoChatSecuritySetting.security_level.getValue()));
            meetingSecuritySetting.setEnableLobby(videoChatSecuritySetting.is_open_lobby.booleanValue());
            if (videoChatSecuritySetting.special_group_type != null && videoChatSecuritySetting.special_group_type.size() > 0) {
                ArrayList arrayList = new ArrayList();
                for (VideoChatSecuritySetting.SpecialGroupType specialGroupType : videoChatSecuritySetting.special_group_type) {
                    arrayList.add(MeetingSecuritySetting.SpecialGroupType.forNumber(specialGroupType.getValue()));
                }
                meetingSecuritySetting.setSpecialGroupTypes(arrayList);
            }
            meetingSecuritySetting.setRoomIds(videoChatSecuritySetting.room_ids);
        } else {
            meetingSecuritySetting.setSecurityLevel(MeetingSecuritySetting.SecurityLevel.PUBLIC);
        }
        return meetingSecuritySetting;
    }

    /* renamed from: a */
    public static MeetingSecuritySetting m236851a(com.ss.android.lark.pb.videochat.VideoChatSecuritySetting videoChatSecuritySetting) {
        MeetingSecuritySetting meetingSecuritySetting = new MeetingSecuritySetting();
        if (videoChatSecuritySetting != null) {
            meetingSecuritySetting.setGroupIds(videoChatSecuritySetting.mgroup_ids);
            meetingSecuritySetting.setUserIds(videoChatSecuritySetting.muser_ids);
            meetingSecuritySetting.setSecurityLevel(MeetingSecuritySetting.SecurityLevel.forNumber(videoChatSecuritySetting.msecurity_level.getValue()));
            meetingSecuritySetting.setEnableLobby(videoChatSecuritySetting.mis_open_lobby.booleanValue());
            if (videoChatSecuritySetting.mspecial_group_type != null && videoChatSecuritySetting.mspecial_group_type.size() > 0) {
                ArrayList arrayList = new ArrayList();
                for (VideoChatSecuritySetting.SpecialGroupType specialGroupType : videoChatSecuritySetting.mspecial_group_type) {
                    arrayList.add(MeetingSecuritySetting.SpecialGroupType.forNumber(specialGroupType.getValue()));
                }
                meetingSecuritySetting.setSpecialGroupTypes(arrayList);
            }
            meetingSecuritySetting.setRoomIds(videoChatSecuritySetting.mroom_ids);
        } else {
            meetingSecuritySetting.setSecurityLevel(MeetingSecuritySetting.SecurityLevel.PUBLIC);
        }
        return meetingSecuritySetting;
    }

    /* renamed from: a */
    public static com.ss.android.lark.pb.videoconference.v1.VideoChatSecuritySetting m236824a(MeetingSecuritySetting meetingSecuritySetting) {
        VideoChatSecuritySetting.C51284a a = new VideoChatSecuritySetting.C51284a().mo176796a(VideoChatSecuritySetting.SecurityLevel.fromValue(meetingSecuritySetting.getSecurityLevel().getNumber()));
        a.mo176797a(Boolean.valueOf(meetingSecuritySetting.isEnableLobby()));
        if (meetingSecuritySetting.getUserIds() != null) {
            a.mo176800b(meetingSecuritySetting.getUserIds());
        }
        if (meetingSecuritySetting.getGroupIds() != null) {
            a.mo176798a(meetingSecuritySetting.getGroupIds());
        }
        if (meetingSecuritySetting.getRoomIds() != null) {
            a.mo176802d(meetingSecuritySetting.getRoomIds());
        }
        if (meetingSecuritySetting.getSpecialGroupTypes() != null) {
            ArrayList arrayList = new ArrayList();
            for (MeetingSecuritySetting.SpecialGroupType specialGroupType : meetingSecuritySetting.getSpecialGroupTypes()) {
                arrayList.add(VideoChatSecuritySetting.SpecialGroupType.fromValue(specialGroupType.getNumber()));
            }
            a.mo176801c(arrayList);
        }
        return a.build();
    }

    /* renamed from: a */
    public static com.ss.android.vc.entity.MeetingSubtitleData m236855a(MeetingSubtitleData meetingSubtitleData) {
        if (meetingSubtitleData == null) {
            return null;
        }
        com.ss.android.vc.entity.MeetingSubtitleData meetingSubtitleData2 = new com.ss.android.vc.entity.MeetingSubtitleData();
        meetingSubtitleData2.mMeetingId = meetingSubtitleData.meeting_id;
        meetingSubtitleData2.mSeqId = meetingSubtitleData.seg_id.longValue();
        meetingSubtitleData2.mSubtitleType = MeetingSubtitleData.SubtitleType.forNumber(meetingSubtitleData.subtitle_type.getValue());
        meetingSubtitleData2.mSoundType = MeetingSubtitleData.SoundType.forNumber(meetingSubtitleData.sound_type.getValue());
        meetingSubtitleData2.mTarget = m236854a(meetingSubtitleData.target);
        meetingSubtitleData2.mTimeStamp = meetingSubtitleData.timestamp.longValue();
        meetingSubtitleData2.mSliceId = meetingSubtitleData.slice_id.longValue();
        meetingSubtitleData2.mIsSeqFinal = meetingSubtitleData.is_seg_final.booleanValue();
        meetingSubtitleData2.mTrackReceived = meetingSubtitleData.track_received.booleanValue();
        if (meetingSubtitleData.event != null) {
            meetingSubtitleData2.mEvent = m236853a(meetingSubtitleData.event);
        }
        return meetingSubtitleData2;
    }

    /* renamed from: a */
    public static MeetingSubtitleData.SubtitleEvent m236853a(MeetingSubtitleData.SubtitleEvent subtitleEvent) {
        if (subtitleEvent == null) {
            return null;
        }
        MeetingSubtitleData.SubtitleEvent subtitleEvent2 = new MeetingSubtitleData.SubtitleEvent();
        subtitleEvent2.f152464a = MeetingSubtitleData.SubtitleEvent.Type.valueOf(subtitleEvent.type.name());
        subtitleEvent2.f152465b = m236832a(subtitleEvent.user);
        if (subtitleEvent.follow_info != null) {
            subtitleEvent2.f152466c = new MeetingSubtitleData.SubtitleEvent.C60924a(subtitleEvent.follow_info.doc_url, subtitleEvent.follow_info.doc_title);
        }
        return subtitleEvent2;
    }

    /* renamed from: a */
    public static MeetingSubtitleData.C60925a m236854a(MeetingSubtitleData.Subtitle subtitle) {
        if (subtitle == null) {
            return null;
        }
        MeetingSubtitleData.C60925a aVar = new MeetingSubtitleData.C60925a();
        aVar.f152469a = subtitle.content;
        aVar.f152470b = subtitle.language;
        aVar.f152471c = subtitle.speaker_user_id;
        aVar.f152472d = subtitle.speaker_device_id;
        aVar.f152473e = m236832a(subtitle.speaker);
        return aVar;
    }

    /* renamed from: a */
    public static PSTNInfo m236857a(com.ss.android.lark.pb.videoconference.v1.PSTNInfo pSTNInfo) {
        if (pSTNInfo == null) {
            return null;
        }
        PSTNInfo pSTNInfo2 = new PSTNInfo();
        pSTNInfo2.mainAddress = pSTNInfo.main_address;
        pSTNInfo2.subAddress = pSTNInfo.sub_address;
        pSTNInfo2.participantType = ParticipantType.valueOf(pSTNInfo.participant_type.getValue());
        pSTNInfo2.displayName = pSTNInfo.display_name;
        return pSTNInfo2;
    }

    /* renamed from: a */
    public static PSTNInfo m236856a(com.ss.android.lark.pb.videochat.PSTNInfo pSTNInfo) {
        if (pSTNInfo == null) {
            return null;
        }
        PSTNInfo pSTNInfo2 = new PSTNInfo();
        pSTNInfo2.mainAddress = pSTNInfo.mmain_address;
        pSTNInfo2.subAddress = pSTNInfo.msub_address;
        pSTNInfo2.participantType = ParticipantType.valueOf(pSTNInfo.mparticipant_type.getValue());
        pSTNInfo2.displayName = pSTNInfo.mdisplay_name;
        return pSTNInfo2;
    }

    /* renamed from: a */
    public static com.ss.android.vc.entity.PSTNPhone m236858a(PSTNPhone pSTNPhone) {
        if (pSTNPhone == null) {
            return null;
        }
        com.ss.android.vc.entity.PSTNPhone pSTNPhone2 = new com.ss.android.vc.entity.PSTNPhone();
        pSTNPhone2.country = pSTNPhone.country;
        pSTNPhone2.type = PSTNPhone.Type.valueOf(pSTNPhone.type.getValue());
        pSTNPhone2.number = pSTNPhone.number;
        pSTNPhone2.displayNumber = pSTNPhone.number_display;
        return pSTNPhone2;
    }

    /* renamed from: a */
    public static VCNotice m236866a(VideoChatNotice videoChatNotice) {
        if (videoChatNotice == null) {
            return null;
        }
        VCNotice vCNotice = new VCNotice();
        vCNotice.statusCode = videoChatNotice.status.getValue();
        vCNotice.type = videoChatNotice.type.getValue();
        vCNotice.message = videoChatNotice.message;
        vCNotice.cmd = videoChatNotice.cmd.intValue();
        vCNotice.noticeId = videoChatNotice.notice_id;
        vCNotice.title = videoChatNotice.title;
        vCNotice.timeOut = videoChatNotice.timeout.intValue();
        vCNotice.meetingId = videoChatNotice.meeting_id;
        vCNotice.messageId = videoChatNotice.message_id;
        vCNotice.pushSid = videoChatNotice.push_sid;
        vCNotice.toastDuration = videoChatNotice.toast_duration_ms.intValue();
        vCNotice.meetingEndTime = videoChatNotice.meeting_end_time.longValue();
        vCNotice.msg_i18n_key = new VcI18nKeyInfo();
        vCNotice.title_i18n_key = new VcI18nKeyInfo();
        vCNotice.btn_i18n_key = new VcI18nKeyInfo();
        if (videoChatNotice.msg_i18n_key != null) {
            vCNotice.msg_i18n_key.key = videoChatNotice.msg_i18n_key.key;
            vCNotice.msg_i18n_key.params = videoChatNotice.msg_i18n_key.params;
            vCNotice.msg_i18n_key.type = VcI18nKeyInfo.Type.valueOf(videoChatNotice.msg_i18n_key.type.getValue());
            vCNotice.msg_i18n_key.jumpScheme = videoChatNotice.msg_i18n_key.jump_scheme;
            vCNotice.msg_i18n_key.newKey = videoChatNotice.msg_i18n_key.new_key;
        }
        if (videoChatNotice.title_i18n_key != null) {
            vCNotice.title_i18n_key.key = videoChatNotice.title_i18n_key.key;
            vCNotice.title_i18n_key.params = videoChatNotice.title_i18n_key.params;
            vCNotice.title_i18n_key.type = VcI18nKeyInfo.Type.valueOf(videoChatNotice.title_i18n_key.type.getValue());
            vCNotice.title_i18n_key.jumpScheme = videoChatNotice.title_i18n_key.jump_scheme;
            vCNotice.title_i18n_key.newKey = videoChatNotice.title_i18n_key.new_key;
        }
        if (videoChatNotice.btn_i18n_key != null) {
            vCNotice.btn_i18n_key.key = videoChatNotice.btn_i18n_key.key;
            vCNotice.btn_i18n_key.params = videoChatNotice.btn_i18n_key.params;
            vCNotice.btn_i18n_key.type = VcI18nKeyInfo.Type.valueOf(videoChatNotice.btn_i18n_key.type.getValue());
            vCNotice.btn_i18n_key.jumpScheme = videoChatNotice.btn_i18n_key.jump_scheme;
            vCNotice.btn_i18n_key.newKey = videoChatNotice.btn_i18n_key.new_key;
        }
        if (videoChatNotice.action_time != null) {
            vCNotice.actionTime = new ActionTime();
            vCNotice.actionTime.setInviteTime(videoChatNotice.action_time.invite.longValue());
            vCNotice.actionTime.setAcceptTime(videoChatNotice.action_time.accept.longValue());
            vCNotice.actionTime.setPushTime(videoChatNotice.action_time.push.longValue());
        }
        if (videoChatNotice.popup_type != null) {
            vCNotice.popupType = videoChatNotice.popup_type.getValue();
        }
        if (videoChatNotice.extra != null) {
            vCNotice.extra = videoChatNotice.extra;
        }
        return vCNotice;
    }

    /* renamed from: a */
    public static VideoChatNoticeUpdate m236873a(com.ss.android.lark.pb.videoconference.v1.VideoChatNoticeUpdate videoChatNoticeUpdate) {
        if (videoChatNoticeUpdate == null) {
            return null;
        }
        VideoChatNoticeUpdate videoChatNoticeUpdate2 = new VideoChatNoticeUpdate();
        videoChatNoticeUpdate2.action = VideoChatNoticeUpdate.Action.valueOf(videoChatNoticeUpdate.action.getValue());
        videoChatNoticeUpdate2.key = videoChatNoticeUpdate.key;
        videoChatNoticeUpdate2.meetingId = videoChatNoticeUpdate.meeting_id;
        videoChatNoticeUpdate2.pushSid = videoChatNoticeUpdate.push_sid;
        videoChatNoticeUpdate2.type = videoChatNoticeUpdate.type.getValue();
        return videoChatNoticeUpdate2;
    }

    /* renamed from: a */
    public static VideoChatPrompt.CalendarStartPrompt m236874a(VideoChatPrompt.CalendarStartPrompt calendarStartPrompt) {
        if (calendarStartPrompt == null) {
            return null;
        }
        VideoChatPrompt.CalendarStartPrompt calendarStartPrompt2 = new VideoChatPrompt.CalendarStartPrompt();
        calendarStartPrompt2.uniqueId = calendarStartPrompt.unique_id;
        calendarStartPrompt2.eventStartTime = calendarStartPrompt.event_start_time.longValue();
        calendarStartPrompt2.eventTitle = calendarStartPrompt.event_title;
        if (TextUtils.isEmpty(calendarStartPrompt2.eventTitle)) {
            calendarStartPrompt2.eventTitle = C60657a.m235732a().mo208743c();
        }
        calendarStartPrompt2.startUser = m236832a(calendarStartPrompt.start_user);
        calendarStartPrompt2.meetingId = calendarStartPrompt.meeting_id;
        calendarStartPrompt2.promptCreateTime = calendarStartPrompt.prompt_create_time.longValue();
        return calendarStartPrompt2;
    }

    /* renamed from: a */
    public static com.ss.android.vc.entity.VideoChatPrompt m236875a(com.ss.android.lark.pb.videoconference.v1.VideoChatPrompt videoChatPrompt) {
        com.ss.android.vc.entity.VideoChatPrompt videoChatPrompt2 = new com.ss.android.vc.entity.VideoChatPrompt();
        videoChatPrompt2.type = VideoChatPrompt.Type.valueOf(videoChatPrompt.type.getValue());
        videoChatPrompt2.action = VideoChatPrompt.Action.valueOf(videoChatPrompt.action.getValue());
        videoChatPrompt2.promptId = videoChatPrompt.prompt_id;
        if (videoChatPrompt.calendar_start_prompt != null) {
            videoChatPrompt2.calendarStartPrompt = m236874a(videoChatPrompt.calendar_start_prompt);
        }
        videoChatPrompt2.pushSid = videoChatPrompt.push_sid;
        return videoChatPrompt2;
    }

    /* renamed from: a */
    public static FollowAction m236887a(com.ss.android.lark.pb.videoconference.v1.FollowAction followAction) {
        if (followAction == null) {
            return null;
        }
        FollowAction followAction2 = new FollowAction();
        followAction2.setShareId(followAction.share_id);
        followAction2.setActionJSON(followAction.customized_data);
        followAction2.setUrl(followAction.url);
        return followAction2;
    }

    /* renamed from: a */
    public static FollowInfo.Options m236889a(FollowInfo.Options options) {
        if (options == null) {
            return null;
        }
        FollowInfo.Options options2 = new FollowInfo.Options();
        options2.setDefaultFollow(options.default_follow.booleanValue());
        options2.setForceFollow(options.force_follow.booleanValue());
        return options2;
    }

    /* renamed from: a */
    public static FollowPatch m236891a(com.ss.android.lark.pb.videoconference.v1.FollowPatch followPatch) {
        if (followPatch == null) {
            return null;
        }
        FollowPatch followPatch2 = new FollowPatch();
        followPatch2.setOpType(FollowPatch.Type.valueOf(followPatch.op_type.getValue()));
        followPatch2.setDataType(FollowDataType.valueOf(followPatch.data_type.getValue()));
        followPatch2.setWebData(m236894a(followPatch.web_data));
        followPatch2.setSenderId(followPatch.sender);
        return followPatch2;
    }

    /* renamed from: a */
    public static FollowWebData m236894a(com.ss.android.lark.pb.videoconference.v1.FollowWebData followWebData) {
        if (followWebData == null) {
            return null;
        }
        FollowWebData followWebData2 = new FollowWebData();
        followWebData2.setId(followWebData.id.longValue());
        followWebData2.setStrategyId(followWebData.strategy_id);
        followWebData2.setPayload(followWebData.payload);
        return followWebData2;
    }

    /* renamed from: a */
    public static com.ss.android.lark.pb.videoconference.v1.FollowWebData m236810a(FollowWebData followWebData) {
        if (followWebData == null) {
            return null;
        }
        FollowWebData.C50585a aVar = new FollowWebData.C50585a();
        aVar.mo175132a(followWebData.getStrategyId());
        aVar.mo175134b(followWebData.getPayload());
        aVar.mo175131a(Long.valueOf(followWebData.getId()));
        return aVar.build();
    }

    /* renamed from: a */
    public static com.ss.android.vc.entity.follow.FollowStrategy m236893a(FollowStrategy followStrategy) {
        if (followStrategy == null) {
            return null;
        }
        com.ss.android.vc.entity.follow.FollowStrategy followStrategy2 = new com.ss.android.vc.entity.follow.FollowStrategy();
        followStrategy2.setId(followStrategy.id);
        followStrategy2.setAndroidResourceIds(followStrategy.android_resource_ids);
        followStrategy2.setResourceVersions(followStrategy.resource_versions);
        followStrategy2.setUseDeviceIdScope(FollowStrategy.UseDeviceIdScope.valueOf(followStrategy.use_device_id_scope.getValue()));
        followStrategy2.setUseUserCard(followStrategy.use_user_card.booleanValue());
        followStrategy2.setSettings(followStrategy.settings);
        followStrategy2.setResourceInjectTiming(FollowStrategy.ResourceInjectTiming.valueOf(followStrategy.resource_inject_timing.getValue()));
        followStrategy2.setReceivingDataWhenNotFollowing(followStrategy.receiving_data_when_not_following.booleanValue());
        followStrategy2.setKeepOrder(followStrategy.keep_order.booleanValue());
        followStrategy2.setCanBeReactivated(followStrategy.can_be_reactivated.booleanValue());
        return followStrategy2;
    }

    /* renamed from: a */
    public static ThumbnailDetail m236895a(com.ss.android.lark.pb.videoconference.v1.ThumbnailDetail thumbnailDetail) {
        if (thumbnailDetail == null) {
            return null;
        }
        ThumbnailDetail thumbnailDetail2 = new ThumbnailDetail();
        thumbnailDetail2.setCipherType(ThumbnailDetail.CipherType.valueOf(thumbnailDetail.cipher_type.getValue()));
        thumbnailDetail2.setDecryptKey(thumbnailDetail.decrypt_key);
        thumbnailDetail2.setNonce(thumbnailDetail.nonce);
        thumbnailDetail2.setThumbnailUrl(thumbnailDetail.thumbnail_url);
        return thumbnailDetail2;
    }

    /* renamed from: a */
    public static FollowStatus m236884a(VCMeetingAbbrInfo.FollowStatus followStatus) {
        if (followStatus == null) {
            return null;
        }
        return new FollowStatus(followStatus.doc_token, VcDocType.valueOf(followStatus.doc_type != null ? followStatus.doc_type.getValue() : 0));
    }

    /* renamed from: a */
    public static VCParticipantAbbrInfo m236974a(com.ss.android.lark.pb.videoconference.v1.VCParticipantAbbrInfo vCParticipantAbbrInfo) {
        if (vCParticipantAbbrInfo == null) {
            return null;
        }
        return new VCParticipantAbbrInfo(Status.valueOf(vCParticipantAbbrInfo.status.getValue()), m236832a(vCParticipantAbbrInfo.user), Participant.DeviceType.valueOf(vCParticipantAbbrInfo.device_type.getValue()), vCParticipantAbbrInfo.tenant_id.toString(), vCParticipantAbbrInfo.is_lark_guest.booleanValue());
    }

    /* renamed from: a */
    public static HistoryMeeting m236886a(com.ss.android.lark.pb.videoconference.v1.HistoryMeeting historyMeeting) {
        if (historyMeeting == null) {
            return null;
        }
        return new HistoryMeeting(historyMeeting.id, VCHistoryType.valueOf(historyMeeting.item_type.getValue()), m236907a(historyMeeting.event_info), m236966a(historyMeeting.vc_info));
    }

    /* renamed from: a */
    public static UpcomingEvent m236903a(com.ss.android.lark.pb.videoconference.v1.UpcomingEvent upcomingEvent) {
        if (upcomingEvent == null) {
            return null;
        }
        return new UpcomingEvent(upcomingEvent.id, m236907a(upcomingEvent.event_info), m236966a(upcomingEvent.vc_info));
    }

    /* renamed from: a */
    public static UpdateHistoryCalls m236904a(com.ss.android.lark.pb.videoconference.v1.UpdateHistoryCalls updateHistoryCalls) {
        if (updateHistoryCalls == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (updateHistoryCalls.updated_meetings != null) {
            for (VCMeetingAbbrInfo vCMeetingAbbrInfo : updateHistoryCalls.updated_meetings) {
                com.ss.android.vc.entity.VCMeetingAbbrInfo a = m236966a(vCMeetingAbbrInfo);
                if (a != null) {
                    hashMap.put(vCMeetingAbbrInfo.meeting_id, a);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        if (updateHistoryCalls.added_meetings != null) {
            for (VCMeetingAbbrInfo vCMeetingAbbrInfo2 : updateHistoryCalls.added_meetings) {
                com.ss.android.vc.entity.VCMeetingAbbrInfo a2 = m236966a(vCMeetingAbbrInfo2);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        }
        HashSet hashSet = new HashSet();
        if (!CollectionUtils.isEmpty(updateHistoryCalls.delete_call_ids)) {
            hashSet.addAll(updateHistoryCalls.delete_call_ids);
        }
        return new UpdateHistoryCalls(hashMap, arrayList, hashSet);
    }

    /* renamed from: a */
    public static UpdateHistoryMeetings m236905a(com.ss.android.lark.pb.videoconference.v1.UpdateHistoryMeetings updateHistoryMeetings) {
        if (updateHistoryMeetings == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (com.ss.android.lark.pb.videoconference.v1.HistoryMeeting historyMeeting : updateHistoryMeetings.updated_meetings) {
            HistoryMeeting a = m236886a(historyMeeting);
            if (a != null) {
                hashMap.put(historyMeeting.id, a);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (com.ss.android.lark.pb.videoconference.v1.HistoryMeeting historyMeeting2 : updateHistoryMeetings.added_meetings) {
            HistoryMeeting a2 = m236886a(historyMeeting2);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        HashSet hashSet = new HashSet();
        if (!CollectionUtils.isEmpty(updateHistoryMeetings.delete_history_ids)) {
            hashSet.addAll(updateHistoryMeetings.delete_history_ids);
        }
        return new UpdateHistoryMeetings(hashMap, arrayList, hashSet);
    }

    /* renamed from: a */
    public static UpdateUpcomingEvents m236906a(com.ss.android.lark.pb.videoconference.v1.UpdateUpcomingEvents updateUpcomingEvents) {
        if (updateUpcomingEvents == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (updateUpcomingEvents.updated_events != null) {
            for (com.ss.android.lark.pb.videoconference.v1.UpcomingEvent upcomingEvent : updateUpcomingEvents.updated_events) {
                hashMap.put(upcomingEvent.id, m236903a(upcomingEvent));
            }
        }
        ArrayList arrayList = new ArrayList();
        if (updateUpcomingEvents.added_events != null) {
            for (com.ss.android.lark.pb.videoconference.v1.UpcomingEvent upcomingEvent2 : updateUpcomingEvents.added_events) {
                arrayList.add(m236903a(upcomingEvent2));
            }
        }
        HashSet hashSet = new HashSet();
        if (!CollectionUtils.isEmpty(updateUpcomingEvents.delete_event_ids)) {
            hashSet.addAll(updateUpcomingEvents.delete_event_ids);
        }
        return new UpdateUpcomingEvents(hashMap, hashSet, arrayList);
    }

    /* renamed from: a */
    public static com.ss.android.vc.entity.VCMeetingAbbrInfo m236966a(VCMeetingAbbrInfo vCMeetingAbbrInfo) {
        if (vCMeetingAbbrInfo == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (com.ss.android.lark.pb.videoconference.v1.VCParticipantAbbrInfo vCParticipantAbbrInfo : vCMeetingAbbrInfo.participants) {
            arrayList.add(m236974a(vCParticipantAbbrInfo));
        }
        String str = vCMeetingAbbrInfo.meeting_id;
        String str2 = vCMeetingAbbrInfo.topic;
        Long l = vCMeetingAbbrInfo.start_time;
        Long l2 = vCMeetingAbbrInfo.end_time;
        ByteviewUser a = m236832a(vCMeetingAbbrInfo.host_user);
        ByteviewUser a2 = m236832a(vCMeetingAbbrInfo.sponsor_user);
        int i = 0;
        VideoChat.MeetingSource valueOf = VideoChat.MeetingSource.valueOf(vCMeetingAbbrInfo.meeting_source != null ? vCMeetingAbbrInfo.meeting_source.getValue() : 0);
        VideoChat.Type valueOf2 = VideoChat.Type.valueOf(vCMeetingAbbrInfo.vc_type != null ? vCMeetingAbbrInfo.vc_type.getValue() : 0);
        MeetingStatus valueOf3 = MeetingStatus.valueOf(vCMeetingAbbrInfo.meeting_status != null ? vCMeetingAbbrInfo.meeting_status.getValue() : 0);
        String str3 = vCMeetingAbbrInfo.meeting_no;
        if (vCMeetingAbbrInfo.user_action != null) {
            i = vCMeetingAbbrInfo.user_action.getValue();
        }
        return new com.ss.android.vc.entity.VCMeetingAbbrInfo(str, str2, l, l2, a, a2, valueOf, valueOf2, valueOf3, str3, arrayList, UserAction.valueOf(i), m236884a(vCMeetingAbbrInfo.follow_status), vCMeetingAbbrInfo.is_need_refresh, vCMeetingAbbrInfo.group_id, vCMeetingAbbrInfo.sort_time, vCMeetingAbbrInfo.is_full, vCMeetingAbbrInfo.is_locked, vCMeetingAbbrInfo.is_open_lobby, vCMeetingAbbrInfo.is_live, vCMeetingAbbrInfo.is_recording, vCMeetingAbbrInfo.is_topic_modified);
    }

    /* renamed from: a */
    public static VCEventAbbrInfo m236907a(com.bytedance.lark.pb.calendar.v1.VCEventAbbrInfo vCEventAbbrInfo) {
        if (vCEventAbbrInfo == null) {
            return null;
        }
        return new VCEventAbbrInfo(vCEventAbbrInfo.event_id, vCEventAbbrInfo.unique_id, vCEventAbbrInfo.calendar_id, vCEventAbbrInfo.key, vCEventAbbrInfo.original_time, vCEventAbbrInfo.start_time, vCEventAbbrInfo.end_time, vCEventAbbrInfo.topic, vCEventAbbrInfo.is_cross_tenant, vCEventAbbrInfo.is_all_day, Source.valueOf(vCEventAbbrInfo.source != null ? vCEventAbbrInfo.source.getValue() : 0));
    }

    /* renamed from: a */
    public static FollowGrootCellPayload m236888a(com.ss.android.lark.pb.videoconference.v1.FollowGrootCellPayload followGrootCellPayload) {
        if (followGrootCellPayload == null) {
            return null;
        }
        FollowGrootCellPayload followGrootCellPayload2 = new FollowGrootCellPayload();
        followGrootCellPayload2.setType(FollowGrootCellPayload.Type.valueOf(followGrootCellPayload.type.getValue()));
        if (followGrootCellPayload.patches != null && followGrootCellPayload.patches.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (com.ss.android.lark.pb.videoconference.v1.FollowPatch followPatch : followGrootCellPayload.patches) {
                arrayList.add(m236891a(followPatch));
            }
            followGrootCellPayload2.setFollowPatches(arrayList);
        }
        if (followGrootCellPayload.states != null && followGrootCellPayload.states.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            for (com.ss.android.lark.pb.videoconference.v1.FollowState followState : followGrootCellPayload.states) {
                arrayList2.add(m236892a(followState));
            }
            followGrootCellPayload2.setFollowStates(arrayList2);
        }
        return followGrootCellPayload2;
    }

    /* renamed from: a */
    public static VCTabUserGrootCellPayload m236986a(com.ss.android.lark.pb.videoconference.v1.VCTabUserGrootCellPayload vCTabUserGrootCellPayload) {
        if (vCTabUserGrootCellPayload == null) {
            return null;
        }
        VCTabUserGrootCellPayload vCTabUserGrootCellPayload2 = new VCTabUserGrootCellPayload();
        vCTabUserGrootCellPayload2.setChangeEvents(m237021p(vCTabUserGrootCellPayload.detail_page_events));
        VCTabTotalMissedCallInfoEntity vCTabTotalMissedCallInfoEntity = new VCTabTotalMissedCallInfoEntity();
        if (vCTabUserGrootCellPayload.missed_call_info != null) {
            vCTabTotalMissedCallInfoEntity.mconfirmed_missed_calls = vCTabUserGrootCellPayload.missed_call_info.confirmed_missed_calls.longValue();
            vCTabTotalMissedCallInfoEntity.mtotal_missed_calls = vCTabUserGrootCellPayload.missed_call_info.total_missed_calls.longValue();
        }
        vCTabUserGrootCellPayload2.setMissedCallInfo(vCTabTotalMissedCallInfoEntity);
        vCTabUserGrootCellPayload2.setChangeType(VCTabUserChangeType.valueOf(vCTabUserGrootCellPayload.change_type.getValue()));
        vCTabUserGrootCellPayload2.setStatisticsInfo(m236991a(vCTabUserGrootCellPayload.statistics_info));
        return vCTabUserGrootCellPayload2;
    }

    /* renamed from: a */
    public static VCTabMeetingGrootCellPayload m236990a(com.ss.android.lark.pb.videoconference.v1.VCTabMeetingGrootCellPayload vCTabMeetingGrootCellPayload) {
        if (vCTabMeetingGrootCellPayload == null || vCTabMeetingGrootCellPayload.changes == null) {
            return null;
        }
        VCTabMeetingGrootCellPayload dVar = new VCTabMeetingGrootCellPayload();
        ArrayList arrayList = new ArrayList();
        for (VCTabMeetingChangeInfo vCTabMeetingChangeInfo : vCTabMeetingGrootCellPayload.changes) {
            com.ss.android.vc.entity.tab.VCTabMeetingChangeInfo vCTabMeetingChangeInfo2 = new com.ss.android.vc.entity.tab.VCTabMeetingChangeInfo();
            vCTabMeetingChangeInfo2.setChangeType(VCTabMeetingChangeInfo.ChangeType.valueOf(vCTabMeetingChangeInfo.change_type.getValue()));
            if (vCTabMeetingChangeInfo2.getChangeType() == VCTabMeetingChangeInfo.ChangeType.MEETING) {
                vCTabMeetingChangeInfo2.setHistoryCommonInfo(m236989a(vCTabMeetingChangeInfo.meeting_info));
            } else if (vCTabMeetingChangeInfo2.getChangeType() == VCTabMeetingChangeInfo.ChangeType.PARTICIPANT) {
                vCTabMeetingChangeInfo2.setParticipants(m237020o(vCTabMeetingChangeInfo.participant_changes));
            }
            arrayList.add(vCTabMeetingChangeInfo2);
        }
        dVar.mo210429a(arrayList);
        return dVar;
    }

    /* renamed from: a */
    public static VCTabListGrootCellPayload m236977a(com.ss.android.lark.pb.videoconference.v1.VCTabListGrootCellPayload vCTabListGrootCellPayload) {
        if (vCTabListGrootCellPayload == null) {
            return null;
        }
        VCTabListGrootCellPayload vCTabListGrootCellPayload2 = new VCTabListGrootCellPayload();
        ArrayList arrayList = new ArrayList();
        for (com.ss.android.lark.pb.videoconference.v1.VCTabListItem vCTabListItem : vCTabListGrootCellPayload.insert_top_items) {
            arrayList.add(m236979a(vCTabListItem));
        }
        vCTabListGrootCellPayload2.setInsertTopItems(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (com.ss.android.lark.pb.videoconference.v1.VCTabListItem vCTabListItem2 : vCTabListGrootCellPayload.update_items) {
            arrayList2.add(m236979a(vCTabListItem2));
        }
        vCTabListGrootCellPayload2.setUpdateItems(arrayList2);
        vCTabListGrootCellPayload2.setDeleteHistoryIds(vCTabListGrootCellPayload.deleted_history_ids);
        ArrayList arrayList3 = new ArrayList();
        for (com.ss.android.lark.pb.videoconference.v1.VCTabListItem vCTabListItem3 : vCTabListGrootCellPayload.cal_insert_top_items) {
            arrayList.add(m236979a(vCTabListItem3));
        }
        vCTabListGrootCellPayload2.setCalInsertTopItems(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (com.ss.android.lark.pb.videoconference.v1.VCTabListItem vCTabListItem4 : vCTabListGrootCellPayload.cal_update_items) {
            arrayList.add(m236979a(vCTabListItem4));
        }
        vCTabListGrootCellPayload2.setCalInsertTopItems(arrayList4);
        vCTabListGrootCellPayload2.setCalDeleteHistoryIds(vCTabListGrootCellPayload.cal_deleted_history_ids);
        return vCTabListGrootCellPayload2;
    }

    /* renamed from: a */
    public static SketchDataUnit.C60995d m236970a(SketchDataUnit.Pencil pencil) {
        if (pencil == null) {
            return null;
        }
        SketchDataUnit.C60995d dVar = new SketchDataUnit.C60995d();
        if (pencil.coords != null) {
            dVar.f152777a = new ArrayList(pencil.coords.size());
            for (SketchDataUnit.Coord coord : pencil.coords) {
                dVar.f152777a.add(m237001a(coord));
            }
        }
        dVar.f152778b = pencil.duration.intValue();
        dVar.f152779c = pencil.finish.booleanValue();
        dVar.f152780d = pencil.dimension.intValue();
        dVar.f152781e = pencil.size.floatValue();
        dVar.f152782f = pencil.color.longValue();
        dVar.f152783g = PencilType.valueOf(pencil.pencil_type.getValue());
        return dVar;
    }

    /* renamed from: a */
    public static SketchDataUnit.Pencil m236819a(SketchDataUnit.C60995d dVar) {
        SketchDataUnit.Pencil.PencilType pencilType = null;
        if (dVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (dVar.f152777a != null) {
            for (Coord coord : dVar.f152777a) {
                arrayList.add(m236817a(coord));
            }
        }
        Integer valueOf = Integer.valueOf(dVar.f152778b);
        Boolean valueOf2 = Boolean.valueOf(dVar.f152779c);
        Integer valueOf3 = Integer.valueOf(dVar.f152780d);
        Float valueOf4 = Float.valueOf(dVar.f152781e);
        Long valueOf5 = Long.valueOf(dVar.f152782f);
        if (dVar.f152783g != null) {
            pencilType = SketchDataUnit.Pencil.PencilType.fromValue(dVar.f152783g.getNumber());
        }
        return new SketchDataUnit.Pencil(arrayList, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, pencilType);
    }

    /* renamed from: a */
    public static SketchDataUnit.C60996e m236971a(SketchDataUnit.Rect rect) {
        if (rect == null) {
            return null;
        }
        SketchDataUnit.C60996e eVar = new SketchDataUnit.C60996e();
        eVar.f152784a = m237001a(rect.left_top);
        eVar.f152785b = m237001a(rect.right_bottom);
        eVar.f152786c = rect.color.longValue();
        eVar.f152787d = rect.size.floatValue();
        return eVar;
    }

    /* renamed from: a */
    public static SketchDataUnit.Rect m236820a(SketchDataUnit.C60996e eVar) {
        SketchDataUnit.Coord coord;
        SketchDataUnit.Coord coord2 = null;
        if (eVar == null) {
            return null;
        }
        if (eVar.f152784a == null) {
            coord = null;
        } else {
            coord = m236817a(eVar.f152784a);
        }
        if (eVar.f152785b != null) {
            coord2 = m236817a(eVar.f152785b);
        }
        return new SketchDataUnit.Rect(coord, coord2, Long.valueOf(eVar.f152786c), Float.valueOf(eVar.f152787d));
    }

    /* renamed from: a */
    public static SketchDataUnit.C60994c m236969a(SketchDataUnit.Oval oval) {
        if (oval == null) {
            return null;
        }
        SketchDataUnit.C60994c cVar = new SketchDataUnit.C60994c();
        cVar.f152772a = m237001a(oval.origin);
        cVar.f152773b = oval.long_axis.floatValue();
        cVar.f152774c = oval.short_axis.floatValue();
        cVar.f152775d = oval.color.longValue();
        cVar.f152776e = oval.size.floatValue();
        return cVar;
    }

    /* renamed from: a */
    public static SketchDataUnit.Oval m236818a(SketchDataUnit.C60994c cVar) {
        SketchDataUnit.Coord coord = null;
        if (cVar == null) {
            return null;
        }
        if (cVar.f152772a != null) {
            coord = m236817a(cVar.f152772a);
        }
        return new SketchDataUnit.Oval(coord, Float.valueOf(cVar.f152773b), Float.valueOf(cVar.f152774c), Long.valueOf(cVar.f152775d), Float.valueOf(cVar.f152776e));
    }

    /* renamed from: a */
    public static SketchDataUnit.C60993b m236968a(SketchDataUnit.Comet comet) {
        if (comet == null) {
            return null;
        }
        SketchDataUnit.C60993b bVar = new SketchDataUnit.C60993b();
        if (comet.coords != null) {
            bVar.f152767a = new ArrayList(comet.coords.size());
            for (SketchDataUnit.Coord coord : comet.coords) {
                bVar.f152767a.add(m237001a(coord));
            }
        }
        bVar.f152768b = comet.duration.intValue();
        bVar.f152769c = comet.exit.booleanValue();
        bVar.f152770d = comet.size.floatValue();
        bVar.f152771e = comet.color.longValue();
        return bVar;
    }

    /* renamed from: a */
    public static SketchDataUnit.Comet m236816a(SketchDataUnit.C60993b bVar) {
        if (bVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (bVar.f152767a != null) {
            for (Coord coord : bVar.f152767a) {
                arrayList.add(m236817a(coord));
            }
        }
        return new SketchDataUnit.Comet(arrayList, Integer.valueOf(bVar.f152768b), Float.valueOf(bVar.f152770d), Long.valueOf(bVar.f152771e), Boolean.valueOf(bVar.f152769c));
    }

    /* renamed from: a */
    public static SketchDataUnit.C60992a m236967a(SketchDataUnit.Arrow arrow) {
        if (arrow == null) {
            return null;
        }
        SketchDataUnit.C60992a aVar = new SketchDataUnit.C60992a();
        aVar.f152763a = m237001a(arrow.origin);
        aVar.f152764b = m237001a(arrow.end);
        aVar.f152765c = arrow.color.longValue();
        aVar.f152766d = arrow.size.floatValue();
        return aVar;
    }

    /* renamed from: a */
    public static SketchDataUnit.Arrow m236815a(SketchDataUnit.C60992a aVar) {
        SketchDataUnit.Coord coord;
        SketchDataUnit.Coord coord2 = null;
        if (aVar == null) {
            return null;
        }
        if (aVar.f152763a == null) {
            coord = null;
        } else {
            coord = m236817a(aVar.f152763a);
        }
        if (aVar.f152764b != null) {
            coord2 = m236817a(aVar.f152764b);
        }
        return new SketchDataUnit.Arrow(coord, coord2, Long.valueOf(aVar.f152765c), Float.valueOf(aVar.f152766d));
    }

    /* renamed from: a */
    public static com.ss.android.vc.entity.sketch.SketchDataUnit m236972a(com.ss.android.lark.pb.videoconference.v1.SketchDataUnit sketchDataUnit) {
        if (sketchDataUnit == null) {
            return null;
        }
        com.ss.android.vc.entity.sketch.SketchDataUnit sketchDataUnit2 = new com.ss.android.vc.entity.sketch.SketchDataUnit();
        if (sketchDataUnit.shape_type != null) {
            sketchDataUnit2.f152754a = SketchDataUnit.ShapeType.forNumber(sketchDataUnit.shape_type.getValue());
        }
        sketchDataUnit2.f152755b = sketchDataUnit.shape_id;
        sketchDataUnit2.f152756c = m236970a(sketchDataUnit.pencil);
        sketchDataUnit2.f152757d = m236971a(sketchDataUnit.rect);
        sketchDataUnit2.f152758e = m236968a(sketchDataUnit.comet);
        sketchDataUnit2.f152759f = m236969a(sketchDataUnit.oval);
        sketchDataUnit2.f152760g = m236967a(sketchDataUnit.arrow);
        sketchDataUnit2.f152761h = sketchDataUnit.current_step.intValue();
        sketchDataUnit2.f152762i = m236832a(sketchDataUnit.user);
        return sketchDataUnit2;
    }

    /* renamed from: a */
    public static com.ss.android.lark.pb.videoconference.v1.SketchDataUnit m236821a(com.ss.android.vc.entity.sketch.SketchDataUnit sketchDataUnit) {
        SketchDataUnit.ShapeType shapeType;
        com.ss.android.lark.pb.videoconference.v1.ByteviewUser byteviewUser;
        SketchDataUnit.Pencil pencil;
        SketchDataUnit.Rect rect;
        SketchDataUnit.Comet comet;
        SketchDataUnit.Oval oval;
        SketchDataUnit.Arrow arrow = null;
        if (sketchDataUnit == null) {
            return null;
        }
        if (sketchDataUnit.f152754a == null) {
            shapeType = null;
        } else {
            shapeType = SketchDataUnit.ShapeType.fromValue(sketchDataUnit.f152754a.getNumber());
        }
        String str = sketchDataUnit.f152755b;
        Integer valueOf = Integer.valueOf(sketchDataUnit.f152761h);
        if (sketchDataUnit.f152762i == null) {
            byteviewUser = null;
        } else {
            byteviewUser = m236805a(sketchDataUnit.f152762i);
        }
        if (sketchDataUnit.f152756c == null) {
            pencil = null;
        } else {
            pencil = m236819a(sketchDataUnit.f152756c);
        }
        if (sketchDataUnit.f152757d == null) {
            rect = null;
        } else {
            rect = m236820a(sketchDataUnit.f152757d);
        }
        if (sketchDataUnit.f152758e == null) {
            comet = null;
        } else {
            comet = m236816a(sketchDataUnit.f152758e);
        }
        if (sketchDataUnit.f152759f == null) {
            oval = null;
        } else {
            oval = m236818a(sketchDataUnit.f152759f);
        }
        if (sketchDataUnit.f152760g != null) {
            arrow = m236815a(sketchDataUnit.f152760g);
        }
        return new com.ss.android.lark.pb.videoconference.v1.SketchDataUnit(shapeType, str, valueOf, byteviewUser, pencil, rect, comet, oval, arrow, null, null);
    }

    /* renamed from: a */
    public static SketchOperationUnit m236973a(com.ss.android.lark.pb.videoconference.v1.SketchOperationUnit sketchOperationUnit) {
        if (sketchOperationUnit == null) {
            return null;
        }
        SketchOperationUnit sketchOperationUnit2 = new SketchOperationUnit();
        sketchOperationUnit2.f152788a = SketchOperationUnit.Action.forNumber(sketchOperationUnit.action.getValue());
        sketchOperationUnit2.f152789b = SketchOperationUnit.Command.forNumber(sketchOperationUnit.cmd.getValue());
        if (sketchOperationUnit.sketch_units != null) {
            sketchOperationUnit2.f152790c = new ArrayList(sketchOperationUnit.sketch_units.size());
            for (com.ss.android.lark.pb.videoconference.v1.SketchDataUnit sketchDataUnit : sketchOperationUnit.sketch_units) {
                sketchOperationUnit2.f152790c.add(m236972a(sketchDataUnit));
            }
        }
        sketchOperationUnit2.f152791d = SketchOperationUnit.ClearType.forNumber(sketchOperationUnit.clear_type.getValue());
        sketchOperationUnit2.f152792e = m237002a(sketchOperationUnit.remove_data);
        sketchOperationUnit2.f152793f = sketchOperationUnit.timestamp_ms.longValue();
        return sketchOperationUnit2;
    }

    /* renamed from: a */
    public static com.ss.android.lark.pb.videoconference.v1.SketchOperationUnit m236823a(SketchOperationUnit sketchOperationUnit) {
        SketchOperationUnit.SketchRemoveData sketchRemoveData = null;
        if (sketchOperationUnit == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (sketchOperationUnit.f152790c != null) {
            for (com.ss.android.vc.entity.sketch.SketchDataUnit sketchDataUnit : sketchOperationUnit.f152790c) {
                arrayList.add(m236821a(sketchDataUnit));
            }
        }
        SketchOperationUnit.SketchCommand fromValue = sketchOperationUnit.f152789b == null ? null : SketchOperationUnit.SketchCommand.fromValue(sketchOperationUnit.f152789b.getNumber());
        SketchOperationUnit.Action fromValue2 = sketchOperationUnit.f152788a == null ? null : SketchOperationUnit.Action.fromValue(sketchOperationUnit.f152788a.getNumber());
        SketchOperationUnit.ClearType fromValue3 = sketchOperationUnit.f152791d == null ? null : SketchOperationUnit.ClearType.fromValue(sketchOperationUnit.f152791d.getNumber());
        if (sketchOperationUnit.f152792e != null) {
            sketchRemoveData = m236822a(sketchOperationUnit.f152792e);
        }
        return new com.ss.android.lark.pb.videoconference.v1.SketchOperationUnit(fromValue, fromValue2, arrayList, fromValue3, sketchRemoveData, Long.valueOf(sketchOperationUnit.f152793f));
    }

    /* renamed from: a */
    public static SketchDataUnit.Coord m236817a(Coord coord) {
        if (coord == null) {
            return null;
        }
        return new SketchDataUnit.Coord(Float.valueOf(coord.f159003x), Float.valueOf(coord.f159004y));
    }

    /* renamed from: a */
    public static Coord m237001a(SketchDataUnit.Coord coord) {
        if (coord == null) {
            return null;
        }
        return new Coord(coord.f127152x.floatValue(), coord.f127153y.floatValue());
    }

    /* renamed from: a */
    public static RemoveData m237002a(SketchOperationUnit.SketchRemoveData sketchRemoveData) {
        if (sketchRemoveData == null) {
            return null;
        }
        List<String> list = sketchRemoveData.ids;
        List<SketchByteviewUser> i = m237014i(sketchRemoveData.users);
        SketchByteviewUser[] sketchByteviewUserArr = new SketchByteviewUser[i.size()];
        i.toArray(sketchByteviewUserArr);
        return new RemoveData(sketchRemoveData.remove_type.getValue(), (String[]) list.toArray(new String[sketchRemoveData.ids.size()]), sketchByteviewUserArr, sketchRemoveData.current_step.intValue());
    }

    /* renamed from: a */
    public static SketchOperationUnit.SketchRemoveData m236822a(RemoveData removeData) {
        List list = null;
        if (removeData == null) {
            return null;
        }
        if (removeData.users != null) {
            list = Arrays.asList(removeData.users);
        }
        return new SketchOperationUnit.SketchRemoveData(SketchOperationUnit.SketchRemoveData.RemoveType.fromValue(removeData.removeType), Arrays.asList(removeData.ids), Integer.valueOf(removeData.currentStep), m237017l(list));
    }

    /* renamed from: a */
    public static VideoChatConfig.ByteSdkRateConfig m236869a(ByteSdkRateConfig byteSdkRateConfig) {
        if (byteSdkRateConfig == null) {
            return null;
        }
        VideoChatConfig.ByteSdkRateConfig byteSdkRateConfig2 = new VideoChatConfig.ByteSdkRateConfig();
        byteSdkRateConfig2.setBitrateDowngrateParticipantThreshold(byteSdkRateConfig.bitrate_downgrate_participant_threshold.intValue());
        byteSdkRateConfig2.setHighBitrate(byteSdkRateConfig.high_bitrate.intValue());
        byteSdkRateConfig2.setLowBitrate(byteSdkRateConfig.low_bitrate.intValue());
        byteSdkRateConfig2.setMiddleBitrate(byteSdkRateConfig.middle_bitrate.intValue());
        return byteSdkRateConfig2;
    }

    /* renamed from: a */
    public static C60971e m236947a(CheckGuestJoinVcResponse checkGuestJoinVcResponse) {
        if (checkGuestJoinVcResponse == null) {
            return null;
        }
        C60971e eVar = new C60971e();
        eVar.f152685a = checkGuestJoinVcResponse.response;
        return eVar;
    }

    /* renamed from: a */
    public static C60984s m236958a(GetRTCDNSResponse getRTCDNSResponse) {
        if (getRTCDNSResponse == null) {
            return null;
        }
        C60984s sVar = new C60984s();
        if (getRTCDNSResponse.result != null) {
            sVar.f152718a = new HashMap();
            for (Map.Entry<String, GetRTCDNSResponse.IPList> entry : getRTCDNSResponse.result.entrySet()) {
                if (entry.getValue() != null) {
                    C60984s.C60985a aVar = new C60984s.C60985a();
                    aVar.f152719a = entry.getValue().ips;
                    aVar.f152720b = entry.getValue().is_http_dns;
                    sVar.f152718a.put(entry.getKey(), aVar);
                }
            }
        }
        return sVar;
    }

    /* renamed from: a */
    public static C60976j m236951a(ForceTransferHostResponse forceTransferHostResponse) {
        if (forceTransferHostResponse == null) {
            return null;
        }
        C60976j jVar = new C60976j();
        jVar.f152694a = C60932d.m237040a(forceTransferHostResponse.video_chat_info);
        return jVar;
    }

    /* renamed from: a */
    public static CheckVcManageCapabilitiesEntity m236834a(CheckVCManageCapabilitiesResponse checkVCManageCapabilitiesResponse) {
        if (checkVCManageCapabilitiesResponse == null) {
            return null;
        }
        CheckVcManageCapabilitiesEntity checkVcManageCapabilitiesEntity = new CheckVcManageCapabilitiesEntity();
        checkVcManageCapabilitiesEntity.mI18nKeys = checkVCManageCapabilitiesResponse.keys;
        checkVcManageCapabilitiesEntity.mCheckResult = CheckVcManageCapabilitiesEntity.CheckResult.fromValue(checkVCManageCapabilitiesResponse.check_result.getValue());
        return checkVcManageCapabilitiesEntity;
    }

    /* renamed from: a */
    public static VCFeatureConfig m236863a(FeatureConfig featureConfig) {
        if (featureConfig == null) {
            return null;
        }
        VCFeatureConfig vCFeatureConfig = new VCFeatureConfig();
        vCFeatureConfig.setLiveEnabled(featureConfig.live_enable.booleanValue());
        vCFeatureConfig.setRecordEnabled(featureConfig.record_enable.booleanValue());
        vCFeatureConfig.setHostControlEnabled(featureConfig.host_control_enable.booleanValue());
        vCFeatureConfig.setInterpretationEnable(featureConfig.interpretation_enable.booleanValue());
        if (featureConfig.share_meeting != null) {
            VCFeatureConfig.ShareMeeting shareMeeting = new VCFeatureConfig.ShareMeeting();
            shareMeeting.setInviteEnabled(featureConfig.share_meeting.invite_enable.booleanValue());
            shareMeeting.setCopyMeetingLinkEnabled(featureConfig.share_meeting.copy_meeting_link_enable.booleanValue());
            shareMeeting.setShareCardEnabled(featureConfig.share_meeting.share_card_enable.booleanValue());
            vCFeatureConfig.setShareMeeting(shareMeeting);
        }
        if (featureConfig.pstn != null) {
            VCFeatureConfig.Pstn pstn = new VCFeatureConfig.Pstn();
            pstn.setPstnCallInEnabled(featureConfig.pstn.incoming_call_enable.booleanValue());
            pstn.setPstnCallOutEnabled(featureConfig.pstn.out_going_call_enable.booleanValue());
            vCFeatureConfig.setPstn(pstn);
        }
        if (featureConfig.sip != null) {
            VCFeatureConfig.Sip sip = new VCFeatureConfig.Sip();
            sip.setSipCallInEnable(featureConfig.sip.incoming_call_enable.booleanValue());
            sip.setSipCallOutEnable(featureConfig.sip.out_going_call_enable.booleanValue());
            vCFeatureConfig.setSip(sip);
        }
        if (featureConfig.magic_share != null) {
            VCFeatureConfig.MagicShare magicShare = new VCFeatureConfig.MagicShare();
            magicShare.setStartCCMEnabled(featureConfig.magic_share.start_ccm_enable.booleanValue());
            magicShare.setStartUniversalEnabled(featureConfig.magic_share.start_universal_enable.booleanValue());
            magicShare.setStartGoogleDriveEnabled(featureConfig.magic_share.start_google_drive_enable.booleanValue());
            magicShare.setUploadFileEnabled(featureConfig.magic_share.upload_file_enable.booleanValue());
            magicShare.setNewCCMEnabled(featureConfig.magic_share.new_ccm_enable.booleanValue());
            vCFeatureConfig.setMagicShare(magicShare);
        }
        if (featureConfig.relation_chain != null) {
            VCFeatureConfig.RelationChain relationChain = new VCFeatureConfig.RelationChain();
            relationChain.setBrowseUserProfileEnabled(featureConfig.relation_chain.browse_user_profile_enable.booleanValue());
            relationChain.setEnterGroupEnabled(featureConfig.relation_chain.enter_group_enable.booleanValue());
            vCFeatureConfig.setRelationChain(relationChain);
        }
        return vCFeatureConfig;
    }

    /* renamed from: a */
    public static VCFeatureConfig m236862a(com.ss.android.lark.pb.videochat.FeatureConfig featureConfig) {
        if (featureConfig == null) {
            return null;
        }
        VCFeatureConfig vCFeatureConfig = new VCFeatureConfig();
        vCFeatureConfig.setLiveEnabled(featureConfig.mlive_enable.booleanValue());
        vCFeatureConfig.setRecordEnabled(featureConfig.mrecord_enable.booleanValue());
        vCFeatureConfig.setHostControlEnabled(featureConfig.mhost_control_enable.booleanValue());
        vCFeatureConfig.setInterpretationEnable(featureConfig.minterpretation_enable.booleanValue());
        if (featureConfig.mshare_meeting != null) {
            VCFeatureConfig.ShareMeeting shareMeeting = new VCFeatureConfig.ShareMeeting();
            shareMeeting.setInviteEnabled(featureConfig.mshare_meeting.minvite_enable.booleanValue());
            shareMeeting.setCopyMeetingLinkEnabled(featureConfig.mshare_meeting.mcopy_meeting_link_enable.booleanValue());
            shareMeeting.setShareCardEnabled(featureConfig.mshare_meeting.mshare_card_enable.booleanValue());
            vCFeatureConfig.setShareMeeting(shareMeeting);
        }
        if (featureConfig.mpstn != null) {
            VCFeatureConfig.Pstn pstn = new VCFeatureConfig.Pstn();
            pstn.setPstnCallInEnabled(featureConfig.mpstn.mincoming_call_enable.booleanValue());
            pstn.setPstnCallOutEnabled(featureConfig.mpstn.mout_going_call_enable.booleanValue());
            vCFeatureConfig.setPstn(pstn);
        }
        if (featureConfig.msip != null) {
            VCFeatureConfig.Sip sip = new VCFeatureConfig.Sip();
            sip.setSipCallInEnable(featureConfig.msip.mincoming_call_enable.booleanValue());
            sip.setSipCallOutEnable(featureConfig.msip.mout_going_call_enable.booleanValue());
            vCFeatureConfig.setSip(sip);
        }
        if (featureConfig.mmagic_share != null) {
            VCFeatureConfig.MagicShare magicShare = new VCFeatureConfig.MagicShare();
            magicShare.setStartCCMEnabled(featureConfig.mmagic_share.mstart_ccm_enable.booleanValue());
            magicShare.setStartUniversalEnabled(featureConfig.mmagic_share.mstart_universal_enable.booleanValue());
            magicShare.setStartGoogleDriveEnabled(featureConfig.mmagic_share.mstart_google_drive_enable.booleanValue());
            magicShare.setUploadFileEnabled(featureConfig.mmagic_share.mupload_file_enable.booleanValue());
            magicShare.setNewCCMEnabled(featureConfig.mmagic_share.mnew_ccm_enable.booleanValue());
            vCFeatureConfig.setMagicShare(magicShare);
        }
        if (featureConfig.mrelation_chain != null) {
            VCFeatureConfig.RelationChain relationChain = new VCFeatureConfig.RelationChain();
            relationChain.setBrowseUserProfileEnabled(featureConfig.mrelation_chain.mbrowse_user_profile_enable.booleanValue());
            relationChain.setEnterGroupEnabled(featureConfig.mrelation_chain.menter_group_enable.booleanValue());
            vCFeatureConfig.setRelationChain(relationChain);
        }
        return vCFeatureConfig;
    }

    /* renamed from: a */
    public static VCManageCapability m236865a(VCManageCapabilities vCManageCapabilities) {
        if (vCManageCapabilities == null) {
            return null;
        }
        VCManageCapability vCManageCapability = new VCManageCapability();
        vCManageCapability.mVCLobby = vCManageCapabilities.vc_lobby.booleanValue();
        vCManageCapability.mForceGetSharePermission = vCManageCapabilities.force_get_share_permission.booleanValue();
        vCManageCapability.mSharePermission = vCManageCapabilities.share_permission.booleanValue();
        vCManageCapability.mForceMuteMicrophone = vCManageCapabilities.force_mute_microphone.booleanValue();
        vCManageCapability.mOnlyPresenterCanAnnotate = vCManageCapabilities.only_presenter_can_annotate.booleanValue();
        return vCManageCapability;
    }

    /* renamed from: a */
    public static VCManageCapability m236864a(com.ss.android.lark.pb.videochat.VCManageCapabilities vCManageCapabilities) {
        if (vCManageCapabilities == null) {
            return null;
        }
        VCManageCapability vCManageCapability = new VCManageCapability();
        vCManageCapability.mVCLobby = vCManageCapabilities.mvc_lobby.booleanValue();
        vCManageCapability.mForceGetSharePermission = vCManageCapabilities.mforce_get_share_permission.booleanValue();
        vCManageCapability.mSharePermission = vCManageCapabilities.mshare_permission.booleanValue();
        vCManageCapability.mForceMuteMicrophone = vCManageCapabilities.mforce_mute_microphone.booleanValue();
        vCManageCapability.mOnlyPresenterCanAnnotate = vCManageCapabilities.monly_presenter_can_annotate.booleanValue();
        return vCManageCapability;
    }

    /* renamed from: a */
    public static VideoChatSIPSetting m236877a(com.ss.android.lark.pb.videoconference.v1.VideoChatSIPSetting videoChatSIPSetting) {
        VideoChatSIPSetting videoChatSIPSetting2 = new VideoChatSIPSetting();
        if (videoChatSIPSetting == null) {
            return videoChatSIPSetting2;
        }
        videoChatSIPSetting2.setDomain(videoChatSIPSetting.domain);
        return videoChatSIPSetting2;
    }

    /* renamed from: a */
    public static VideoChatSIPSetting m236876a(com.ss.android.lark.pb.videochat.VideoChatSIPSetting videoChatSIPSetting) {
        VideoChatSIPSetting videoChatSIPSetting2 = new VideoChatSIPSetting();
        if (videoChatSIPSetting == null) {
            return videoChatSIPSetting2;
        }
        videoChatSIPSetting2.setDomain(videoChatSIPSetting.mdomain);
        return videoChatSIPSetting2;
    }

    /* renamed from: a */
    public static InMeetingChangedInfo m236838a(com.ss.android.lark.pb.videoconference.v1.InMeetingChangedInfo inMeetingChangedInfo) {
        if (inMeetingChangedInfo == null) {
            return null;
        }
        return new InMeetingChangedInfo(C60932d.m237051b(inMeetingChangedInfo.changes));
    }

    /* renamed from: a */
    public static InMeetingUpdateMessage m236843a(com.ss.android.lark.pb.videoconference.v1.InMeetingUpdateMessage inMeetingUpdateMessage) {
        if (inMeetingUpdateMessage == null) {
            return null;
        }
        return new InMeetingUpdateMessage(inMeetingUpdateMessage.meeting_id, C60932d.m237043a(inMeetingUpdateMessage.in_meeting_info), C60932d.m237050a(inMeetingUpdateMessage.participants));
    }

    /* renamed from: a */
    public static ParticipantChange m236859a(MeetingParticipantChange meetingParticipantChange) {
        if (meetingParticipantChange == null) {
            return null;
        }
        return new ParticipantChange(meetingParticipantChange.meeting_id, C60932d.m237050a(meetingParticipantChange.upsert_participants), C60932d.m237050a(meetingParticipantChange.remove_participants));
    }

    /* renamed from: a */
    public static C60981o m236955a(GetLivePermissionResponse getLivePermissionResponse) {
        if (getLivePermissionResponse == null) {
            return null;
        }
        C60981o oVar = new C60981o();
        oVar.f152710a = getLivePermissionResponse.need_verification.booleanValue();
        return oVar;
    }

    /* renamed from: a */
    public static C60990y m236964a(GetVerificationTicketResponse getVerificationTicketResponse) {
        if (getVerificationTicketResponse == null) {
            return null;
        }
        C60990y yVar = new C60990y();
        yVar.f152730a = getVerificationTicketResponse.ticket;
        return yVar;
    }

    /* renamed from: a */
    public static C60989x m236963a(GetVerificationInfoResponse getVerificationInfoResponse) {
        if (getVerificationInfoResponse == null) {
            return null;
        }
        C60989x xVar = new C60989x();
        xVar.f152728a = getVerificationInfoResponse.app_id.intValue();
        xVar.f152729b = getVerificationInfoResponse.scene;
        return xVar;
    }

    /* renamed from: a */
    public static C62148a m236999a(FullVCLobbyParticipants fullVCLobbyParticipants) {
        C62148a aVar = new C62148a();
        if (fullVCLobbyParticipants != null) {
            aVar.f156113a = fullVCLobbyParticipants.meeting_id;
            if (fullVCLobbyParticipants.lobby_participants != null) {
                aVar.f156114b = new ArrayList();
                for (VCLobbyParticipant vCLobbyParticipant : fullVCLobbyParticipants.lobby_participants) {
                    aVar.f156114b.add(m236995a(vCLobbyParticipant));
                }
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public static com.ss.android.vc.meeting.module.lobby.pb.VCLobbyParticipant m236995a(VCLobbyParticipant vCLobbyParticipant) {
        if (vCLobbyParticipant == null) {
            return null;
        }
        com.ss.android.vc.meeting.module.lobby.pb.VCLobbyParticipant vCLobbyParticipant2 = new com.ss.android.vc.meeting.module.lobby.pb.VCLobbyParticipant();
        vCLobbyParticipant2.setUser(m236832a(vCLobbyParticipant.user));
        vCLobbyParticipant2.setMeetingId(vCLobbyParticipant.meeting_id);
        vCLobbyParticipant2.setIsMicrophoneMuted(vCLobbyParticipant.is_microphone_muted.booleanValue());
        vCLobbyParticipant2.setIsCameraMuted(vCLobbyParticipant.is_camera_muted.booleanValue());
        vCLobbyParticipant2.setStatusWait(vCLobbyParticipant.is_status_wait.booleanValue());
        vCLobbyParticipant2.setGuest(TextUtils.equals(vCLobbyParticipant.is_lark_guest, "1"));
        vCLobbyParticipant2.setSeq_id(vCLobbyParticipant.seq_id.longValue());
        vCLobbyParticipant2.setInApproval(vCLobbyParticipant.is_in_approval.booleanValue());
        vCLobbyParticipant2.setJoinLobbyTime(vCLobbyParticipant.join_lobby_time.longValue());
        vCLobbyParticipant2.setNickName(vCLobbyParticipant.nick_name);
        vCLobbyParticipant2.setInteractive_id(vCLobbyParticipant.interactive_id);
        vCLobbyParticipant2.setLeaveReason(VCLobbyParticipant.LeaveReason.fromValue(vCLobbyParticipant.leave_reason.getValue()));
        vCLobbyParticipant2.setTenantId(vCLobbyParticipant.user_tenant_id);
        vCLobbyParticipant2.setTenantTag(Participant.TenantTag.valueOf(vCLobbyParticipant.tenant_tag.getValue()));
        return vCLobbyParticipant2;
    }

    /* renamed from: a */
    public static VCPreLobbyParticipant m236998a(com.ss.android.lark.pb.videoconference.v1.VCPreLobbyParticipant vCPreLobbyParticipant) {
        if (vCPreLobbyParticipant == null) {
            return null;
        }
        VCPreLobbyParticipant vCPreLobbyParticipant2 = new VCPreLobbyParticipant();
        vCPreLobbyParticipant2.f156107a = m236832a(vCPreLobbyParticipant.user);
        vCPreLobbyParticipant2.f156111e = vCPreLobbyParticipant.is_lark_guest;
        vCPreLobbyParticipant2.f156109c = vCPreLobbyParticipant.is_status_wait.booleanValue();
        vCPreLobbyParticipant2.f156110d = vCPreLobbyParticipant.join_lobby_time.longValue();
        vCPreLobbyParticipant2.f156108b = vCPreLobbyParticipant.meeting_id;
        vCPreLobbyParticipant2.f156112f = VCPreLobbyParticipant.LeaveReason.fromValue(vCPreLobbyParticipant.leave_reason.getValue());
        return vCPreLobbyParticipant2;
    }

    /* renamed from: a */
    public static VCManageNotify m236996a(com.ss.android.lark.pb.videoconference.v1.VCManageNotify vCManageNotify) {
        if (vCManageNotify == null) {
            return null;
        }
        VCManageNotify vCManageNotify2 = new VCManageNotify();
        vCManageNotify2.notification_type = VCManageNotify.NotificationType.fromValue(vCManageNotify.notification_type.getValue());
        vCManageNotify2.meeting_id = vCManageNotify.meeting_id;
        vCManageNotify2.lobby_participants = new ArrayList();
        if (vCManageNotify.lobby_participants != null) {
            for (com.ss.android.lark.pb.videoconference.v1.VCLobbyParticipant vCLobbyParticipant : vCManageNotify.lobby_participants) {
                vCManageNotify2.lobby_participants.add(m236995a(vCLobbyParticipant));
            }
        }
        return vCManageNotify2;
    }

    /* renamed from: a */
    public static VCManageResult m236997a(com.ss.android.lark.pb.videoconference.v1.VCManageResult vCManageResult) {
        if (vCManageResult == null) {
            return null;
        }
        VCManageResult vCManageResult2 = new VCManageResult();
        vCManageResult2.f156103a = vCManageResult.meeting_id;
        vCManageResult2.f156105c = VCManageResult.Action.fromValue(vCManageResult.action.getValue());
        vCManageResult2.f156104b = VCManageResult.Type.fromValue(vCManageResult.type.getValue());
        vCManageResult2.f156106d = m236994a(vCManageResult.breakout_room_count_down_info);
        return vCManageResult2;
    }

    /* renamed from: a */
    public static VCBreakoutRoomCountdownInfo m236994a(VCManageResult.BreakoutRoomCountdownInfo breakoutRoomCountdownInfo) {
        if (breakoutRoomCountdownInfo == null) {
            return null;
        }
        VCBreakoutRoomCountdownInfo vCBreakoutRoomCountdownInfo = new VCBreakoutRoomCountdownInfo();
        vCBreakoutRoomCountdownInfo.countDownFromStarTime = breakoutRoomCountdownInfo.count_down_from_start_time.longValue();
        return vCBreakoutRoomCountdownInfo;
    }

    /* renamed from: a */
    public static InterpreterSetting m236845a(com.ss.android.lark.pb.videoconference.v1.InterpreterSetting interpreterSetting) {
        if (interpreterSetting == null) {
            return null;
        }
        InterpreterSetting interpreterSetting2 = new InterpreterSetting();
        interpreterSetting2.firstLanguage = m236848a(interpreterSetting.first_language);
        interpreterSetting2.secondLanguage = m236848a(interpreterSetting.second_language);
        if (interpreterSetting.confirm_status != null) {
            interpreterSetting2.confirmStatus = InterpreterSetting.ConfirmStatus.forNumber(interpreterSetting.confirm_status.getValue());
        }
        interpreterSetting2.interpretingLanguage = m236848a(interpreterSetting.interpreting_language);
        interpreterSetting2.confirmInterpretationTime = interpreterSetting.confirm_interpretation_time.longValue();
        interpreterSetting2.interpreteSetTime = interpreterSetting.interpreter_set_time.longValue();
        return interpreterSetting2;
    }

    /* renamed from: a */
    public static InterpreterSetting m236844a(com.ss.android.lark.pb.videochat.InterpreterSetting interpreterSetting) {
        if (interpreterSetting == null) {
            return null;
        }
        InterpreterSetting interpreterSetting2 = new InterpreterSetting();
        interpreterSetting2.firstLanguage = m236847a(interpreterSetting.mfirst_language);
        interpreterSetting2.secondLanguage = m236847a(interpreterSetting.msecond_language);
        if (interpreterSetting.mconfirm_status != null) {
            interpreterSetting2.confirmStatus = InterpreterSetting.ConfirmStatus.forNumber(interpreterSetting.mconfirm_status.getValue());
        }
        interpreterSetting2.interpretingLanguage = m236847a(interpreterSetting.minterpreting_language);
        interpreterSetting2.confirmInterpretationTime = interpreterSetting.mconfirm_interpretation_time.longValue();
        interpreterSetting2.interpreteSetTime = interpreterSetting.minterpreter_set_time.longValue();
        return interpreterSetting2;
    }

    /* renamed from: a */
    public static com.ss.android.lark.pb.videoconference.v1.InterpreterSetting m236813a(InterpreterSetting interpreterSetting) {
        if (interpreterSetting == null) {
            return null;
        }
        return new InterpreterSetting.C50801a().mo175614a(m236814a(interpreterSetting.firstLanguage)).mo175617b(m236814a(interpreterSetting.secondLanguage)).mo175613a(InterpreterSetting.ConfirmStatus.fromValue(interpreterSetting.confirmStatus.getNumber())).mo175615a(Long.valueOf(interpreterSetting.confirmInterpretationTime)).mo175619c(m236814a(interpreterSetting.interpretingLanguage)).mo175618b(Long.valueOf(interpreterSetting.interpreteSetTime)).build();
    }

    /* renamed from: a */
    public static LanguageType m236848a(com.ss.android.lark.pb.videoconference.v1.LanguageType languageType) {
        if (languageType == null) {
            return null;
        }
        LanguageType languageType2 = new LanguageType();
        languageType2.languageType = languageType.language_type;
        languageType2.iconStr = languageType.icon_str;
        languageType2.despI18nKey = languageType.desp_i18n_key;
        return languageType2;
    }

    /* renamed from: a */
    public static LanguageType m236847a(com.ss.android.lark.pb.videochat.LanguageType languageType) {
        if (languageType == null) {
            return null;
        }
        LanguageType languageType2 = new LanguageType();
        languageType2.languageType = languageType.mlanguage_type;
        languageType2.iconStr = languageType.micon_str;
        languageType2.despI18nKey = languageType.mdesp_i18n_key;
        return languageType2;
    }

    /* renamed from: a */
    public static HostManageRequest.InterpretationSetting m236812a(C60937f fVar) {
        ArrayList arrayList = null;
        if (fVar == null) {
            return null;
        }
        if (fVar.f152495b != null) {
            arrayList = new ArrayList();
            for (C60940j jVar : fVar.f152495b) {
                arrayList.add(new HostManageRequest.SetInterpreter(m236805a(jVar.f152501a), m236813a(jVar.f152502b), Boolean.valueOf(jVar.f152503c)));
            }
        }
        return new HostManageRequest.InterpretationSetting(Boolean.valueOf(fVar.f152494a), arrayList);
    }

    /* renamed from: a */
    public static CalendarVCSettingsEntity m236908a(CalendarVCSettings calendarVCSettings) {
        if (calendarVCSettings == null) {
            return null;
        }
        CalendarVCSettingsEntity calendarVCSettingsEntity = new CalendarVCSettingsEntity();
        calendarVCSettingsEntity.f152572b = calendarVCSettings.can_join_meeting_before_owner_joined.booleanValue();
        calendarVCSettingsEntity.f152573c = calendarVCSettings.mute_microphone_when_join.booleanValue();
        calendarVCSettingsEntity.f152574d = calendarVCSettings.put_no_permission_user_in_lobby.booleanValue();
        calendarVCSettingsEntity.f152575e = calendarVCSettings.auto_record.booleanValue();
        calendarVCSettingsEntity.f152571a = CalendarVCSettingsEntity.VCSecuritySetting.forNumber(calendarVCSettings.vc_security_setting.getValue());
        return calendarVCSettingsEntity;
    }

    /* renamed from: a */
    public static GetCalendarGuestEntity m236909a(GetCalendarGuestListByMeetingIDResponse getCalendarGuestListByMeetingIDResponse) {
        if (getCalendarGuestListByMeetingIDResponse == null) {
            return null;
        }
        GetCalendarGuestEntity getCalendarGuestEntity = new GetCalendarGuestEntity();
        getCalendarGuestEntity.f152576a = GetCalendarGuestEntity.Status.forNumber(getCalendarGuestListByMeetingIDResponse.status.getValue());
        if (getCalendarGuestListByMeetingIDResponse.result_list != null && getCalendarGuestListByMeetingIDResponse.result_list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (GetCalendarGuestListByMeetingIDResponse.Result result : getCalendarGuestListByMeetingIDResponse.result_list) {
                GetCalendarGuestEntity.C60950d dVar = new GetCalendarGuestEntity.C60950d();
                if (result.lark_user_info != null) {
                    GetCalendarGuestEntity.C60948b bVar = new GetCalendarGuestEntity.C60948b();
                    bVar.f152584b = result.lark_user_info.cross_tenant.booleanValue();
                    bVar.f152583a = result.lark_user_info.department;
                    bVar.f152585c = result.lark_user_info.avatar_key;
                    bVar.f152586d = result.lark_user_info.user_name;
                    dVar.f152590b = bVar;
                }
                if (result.room_user_info != null) {
                    GetCalendarGuestEntity.C60951e eVar = new GetCalendarGuestEntity.C60951e();
                    eVar.f152593a = result.room_user_info.full_name;
                    eVar.f152595c = result.room_user_info.avatar_key;
                    if (result.room_user_info.location != null) {
                        GetCalendarGuestEntity.C60949c cVar = new GetCalendarGuestEntity.C60949c();
                        cVar.f152588b = result.room_user_info.location.building_name;
                        cVar.f152587a = result.room_user_info.location.floor_name;
                        eVar.f152594b = cVar;
                    }
                    dVar.f152591c = eVar;
                }
                if (result.chat_info != null) {
                    GetCalendarGuestEntity.C60947a aVar = new GetCalendarGuestEntity.C60947a();
                    aVar.f152582e = result.chat_info.avatar_key;
                    aVar.f152578a = result.chat_info.chat_id.longValue();
                    aVar.f152579b = result.chat_info.chat_name;
                    aVar.f152580c = result.chat_info.cross_tenant.booleanValue();
                    aVar.f152581d = result.chat_info.member_count.longValue();
                    dVar.f152592d = aVar;
                }
                if (result.user != null) {
                    dVar.f152589a = m236832a(result.user);
                }
                arrayList.add(dVar);
            }
            getCalendarGuestEntity.f152577b = arrayList;
        }
        return getCalendarGuestEntity;
    }

    /* renamed from: a */
    public static VcMsgInfo m236868a(MsgInfo msgInfo) {
        if (msgInfo == null) {
            return null;
        }
        VcMsgInfo vcMsgInfo = new VcMsgInfo();
        vcMsgInfo.type = VcMsgInfo.Type.valueOf(msgInfo.type.ordinal());
        vcMsgInfo.expire = msgInfo.expire.intValue();
        vcMsgInfo.message = msgInfo.message;
        vcMsgInfo.is_override = msgInfo.is_override.booleanValue();
        vcMsgInfo.is_show = msgInfo.is_show.booleanValue();
        if (msgInfo.msg_i18n_key != null) {
            vcMsgInfo.msg_i18n_key = m236867a(msgInfo.msg_i18n_key);
        }
        if (msgInfo.msg_title_i18n_key != null) {
            vcMsgInfo.msg_title_i18n_key = m236867a(msgInfo.msg_title_i18n_key);
        }
        return vcMsgInfo;
    }

    /* renamed from: a */
    public static VirtualBackgroundInfo m236881a(GetVcVirtualBackgroundResponse.VirtualBackgroundInfo virtualBackgroundInfo) {
        if (virtualBackgroundInfo == null) {
            return null;
        }
        VirtualBackgroundInfo virtualBackgroundInfo2 = new VirtualBackgroundInfo();
        virtualBackgroundInfo2.key = virtualBackgroundInfo.key;
        virtualBackgroundInfo2.url = virtualBackgroundInfo.url;
        virtualBackgroundInfo2.path = virtualBackgroundInfo.path;
        virtualBackgroundInfo2.portraitPath = virtualBackgroundInfo.portrait_path;
        virtualBackgroundInfo2.name = virtualBackgroundInfo.name;
        virtualBackgroundInfo2.fileStatus = FileStatus.fromValue(virtualBackgroundInfo.file_status.getValue());
        virtualBackgroundInfo2.isVideo = virtualBackgroundInfo.is_video.booleanValue();
        virtualBackgroundInfo2.thumbnail = virtualBackgroundInfo.thumbnail;
        virtualBackgroundInfo2.materialSource = MaterialSource.fromValue(virtualBackgroundInfo.source.getValue());
        virtualBackgroundInfo2.isMiss = virtualBackgroundInfo.is_miss.booleanValue();
        return virtualBackgroundInfo2;
    }

    /* renamed from: a */
    public static C60936b m236882a(GetVcVirtualBackgroundResponse getVcVirtualBackgroundResponse) {
        if (getVcVirtualBackgroundResponse == null) {
            return null;
        }
        C60936b bVar = new C60936b();
        bVar.f152486b = m237026u(getVcVirtualBackgroundResponse.infos);
        bVar.f152485a = PushVirtualBackgroundType.valueOf(getVcVirtualBackgroundResponse.type.getValue());
        return bVar;
    }

    /* renamed from: a */
    public static C60988w m236961a(MGetChattersResponse mGetChattersResponse) {
        if (mGetChattersResponse == null || mGetChattersResponse.entity == null) {
            return null;
        }
        C60988w wVar = new C60988w();
        if (mGetChattersResponse.entity.chatters != null) {
            ArrayList arrayList = new ArrayList();
            for (Chatter chatter : mGetChattersResponse.entity.chatters.values()) {
                if (chatter != null) {
                    arrayList.add(m236940a(chatter));
                }
            }
            wVar.mo210139a(arrayList);
        }
        return wVar;
    }

    /* renamed from: a */
    public static SetVcVirtualBackgroundEntity m236923a(SetVcVirtualBackgroundResponse setVcVirtualBackgroundResponse) {
        if (setVcVirtualBackgroundResponse == null || CollectionUtils.isEmpty(setVcVirtualBackgroundResponse.infos)) {
            return null;
        }
        SetVcVirtualBackgroundEntity setVcVirtualBackgroundEntity = new SetVcVirtualBackgroundEntity();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < setVcVirtualBackgroundResponse.infos.size(); i++) {
            VirtualBackgroundInfo a = m236881a(setVcVirtualBackgroundResponse.infos.get(i));
            if (a != null) {
                arrayList.add(a);
            }
        }
        setVcVirtualBackgroundEntity.setInfoList(arrayList);
        return setVcVirtualBackgroundEntity;
    }

    /* renamed from: a */
    public static av m236940a(Chatter chatter) {
        if (chatter == null) {
            return null;
        }
        av avVar = new av();
        avVar.mo210117a(chatter.id);
        avVar.mo210119b(chatter.tenant_id);
        return avVar;
    }

    /* renamed from: a */
    public static C60988w m236962a(MGetRoomsResponse mGetRoomsResponse) {
        if (mGetRoomsResponse == null || mGetRoomsResponse.rooms == null) {
            return null;
        }
        C60988w wVar = new C60988w();
        if (mGetRoomsResponse.rooms != null) {
            ArrayList arrayList = new ArrayList();
            for (Room room : mGetRoomsResponse.rooms.values()) {
                if (room != null) {
                    arrayList.add(m236941a(room));
                }
            }
            wVar.mo210139a(arrayList);
        }
        return wVar;
    }

    /* renamed from: a */
    public static av m236941a(Room room) {
        if (room == null) {
            return null;
        }
        av avVar = new av();
        avVar.mo210117a(room.room_id);
        avVar.mo210119b(room.tenant_id);
        return avVar;
    }

    /* renamed from: a */
    public static MeetingBackground m236878a(com.ss.android.lark.pb.videoconference.v1.MeetingBackground meetingBackground) {
        if (meetingBackground == null) {
            return null;
        }
        return new MeetingBackground(MeetingBackground.Type.valueOf(meetingBackground.type.getValue()), meetingBackground.name, meetingBackground.url, null, MaterialSource.APP_SETTINGS);
    }

    /* renamed from: a */
    public static GetAuthChattersResponse m236835a(com.bytedance.lark.pb.contact.v2.GetAuthChattersResponse getAuthChattersResponse) {
        if (getAuthChattersResponse == null || getAuthChattersResponse.auth_result == null || getAuthChattersResponse.auth_result.denied_reasons == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, DeniedReason> entry : getAuthChattersResponse.auth_result.denied_reasons.entrySet()) {
            hashMap.put(entry.getKey(), GetAuthChattersResponse.DeniedReason.Companion.mo208967a(entry.getValue().getValue()));
        }
        return new GetAuthChattersResponse(hashMap);
    }

    /* renamed from: a */
    public static ViewDeviceSetting m236826a(com.ss.android.vc.entity.background.ViewDeviceSetting viewDeviceSetting) {
        if (viewDeviceSetting == null) {
            return null;
        }
        return new ViewDeviceSetting.C51296a().mo176839a((ViewDeviceSetting.Audio) null).mo176840a(m236825a(viewDeviceSetting.video)).build();
    }

    /* renamed from: a */
    public static com.ss.android.vc.entity.background.ViewDeviceSetting m236880a(ViewDeviceSetting viewDeviceSetting) {
        if (viewDeviceSetting == null) {
            return null;
        }
        com.ss.android.vc.entity.background.ViewDeviceSetting viewDeviceSetting2 = new com.ss.android.vc.entity.background.ViewDeviceSetting();
        viewDeviceSetting2.video = m236879a(viewDeviceSetting.video);
        return viewDeviceSetting2;
    }

    /* renamed from: a */
    public static ViewDeviceSetting.Video m236825a(ViewDeviceSetting.Video video) {
        if (video == null) {
            return null;
        }
        return new ViewDeviceSetting.Video.C51294a().mo176829b(Boolean.valueOf(video.backgroundBlur)).mo176831c(Boolean.valueOf(video.faceBeauty)).mo176832d(Boolean.valueOf(video.dynamicLayout)).mo176827a(video.virtualBackground).mo176833e(Boolean.valueOf(video.videoEnhance)).mo176834f(Boolean.valueOf(video.smoothShare)).mo176835g(Boolean.valueOf(video.defaultCameraMuted)).mo176826a(Integer.valueOf(video.faceBeautyLevel)).mo176830b(video.advancedBeauty).mo176825a(Boolean.valueOf(video.mirror)).build();
    }

    /* renamed from: a */
    public static ViewDeviceSetting.Video m236879a(ViewDeviceSetting.Video video) {
        if (video == null) {
            return null;
        }
        ViewDeviceSetting.Video video2 = new ViewDeviceSetting.Video();
        video2.cameraDeviceId = video.camera_device_id;
        video2.mirror = video.mirror.booleanValue();
        video2.backgroundBlur = video.background_blur.booleanValue();
        video2.faceBeauty = video.face_beauty.booleanValue();
        video2.dynamicLayout = video.dynamic_layout.booleanValue();
        video2.virtualBackground = video.virtual_background;
        video2.videoEnhance = video.video_enhance.booleanValue();
        video2.smoothShare = video.smooth_share.booleanValue();
        video2.defaultCameraMuted = video.default_camera_muted.booleanValue();
        video2.faceBeautyLevel = video.face_beauty_level.intValue();
        video2.advancedBeauty = video.advanced_beauty;
        return video2;
    }

    /* renamed from: a */
    public static GetVcVirtualBackgroundRequest.VirtualBackground m236811a(VirtualBackground virtualBackground) {
        if (virtualBackground == null) {
            return null;
        }
        com.ss.android.lark.pb.videoconference.v1.MaterialSource materialSource = com.ss.android.lark.pb.videoconference.v1.MaterialSource.UNKNOWN_SOURCE;
        if (virtualBackground.source == MaterialSource.APP_ADMIN) {
            materialSource = com.ss.android.lark.pb.videoconference.v1.MaterialSource.APP_ADMIN;
        } else if (virtualBackground.source == MaterialSource.APP_SETTINGS) {
            materialSource = com.ss.android.lark.pb.videoconference.v1.MaterialSource.APP_SETTINGS;
        }
        return new GetVcVirtualBackgroundRequest.VirtualBackground(virtualBackground.url, virtualBackground.name, Boolean.valueOf(virtualBackground.isVideo), virtualBackground.portraitUrl, materialSource);
    }

    /* renamed from: a */
    public static RTCProxy m236861a(com.ss.android.lark.pb.videoconference.v1.RTCProxy rTCProxy) {
        if (rTCProxy == null) {
            return null;
        }
        return new RTCProxy(rTCProxy.status.booleanValue(), RTCProxy.ProxyType.fromValue(rTCProxy.proxy_type.getValue()), rTCProxy.proxy_ip, rTCProxy.proxy_port.longValue(), rTCProxy.user_name, rTCProxy.passport);
    }

    /* renamed from: a */
    public static RTCProxy m236860a(com.ss.android.lark.pb.videochat.RTCProxy rTCProxy) {
        if (rTCProxy == null) {
            return null;
        }
        return new RTCProxy(rTCProxy.mstatus.booleanValue(), RTCProxy.ProxyType.fromValue(rTCProxy.mproxy_type.getValue()), rTCProxy.mproxy_ip, rTCProxy.mproxy_port.longValue(), rTCProxy.muser_name, rTCProxy.mpassport);
    }

    /* renamed from: a */
    public static C60965at m236938a(ShareScreenToRoomResponse shareScreenToRoomResponse) {
        if (shareScreenToRoomResponse == null) {
            return null;
        }
        C60965at atVar = new C60965at();
        atVar.f152659a = C60932d.m237040a(shareScreenToRoomResponse.info);
        return atVar;
    }

    /* renamed from: a */
    public static PullVideoChatByShareCodeEntity m236932a(PullVideochatByShareCodeResponse pullVideochatByShareCodeResponse) {
        if (pullVideochatByShareCodeResponse == null) {
            return null;
        }
        return new PullVideoChatByShareCodeEntity(C60932d.m237039a(pullVideochatByShareCodeResponse.minfo));
    }

    /* renamed from: a */
    public static GetShareCodeInfoEntity m236959a(GetShareCodeInfoResponse getShareCodeInfoResponse) {
        if (getShareCodeInfoResponse == null || getShareCodeInfoResponse.muser == null) {
            return null;
        }
        return new GetShareCodeInfoEntity(m236831a(getShareCodeInfoResponse.muser));
    }

    /* renamed from: a */
    public static as m236937a(ShareScreenResponse shareScreenResponse) {
        as asVar = new as();
        if (shareScreenResponse == null) {
            return asVar;
        }
        asVar.f152658a = shareScreenResponse.share_screen_id;
        return asVar;
    }

    /* renamed from: a */
    public static C60987v m236960a(GetSuiteQuotaResponse getSuiteQuotaResponse) {
        if (getSuiteQuotaResponse == null) {
            return null;
        }
        C60987v vVar = new C60987v();
        vVar.f152724b = getSuiteQuotaResponse.interpretation.booleanValue();
        vVar.f152725c = getSuiteQuotaResponse.pstn_call.booleanValue();
        vVar.f152723a = getSuiteQuotaResponse.waiting_room.booleanValue();
        vVar.f152726d = getSuiteQuotaResponse.subtitle.booleanValue();
        return vVar;
    }

    /* renamed from: a */
    public static C60977k m236952a(GetAdminPermissionInfoResponse getAdminPermissionInfoResponse) {
        if (getAdminPermissionInfoResponse == null) {
            return null;
        }
        C60977k kVar = new C60977k();
        kVar.f152695a = getAdminPermissionInfoResponse.misSuperAdministrator.booleanValue();
        return kVar;
    }

    /* renamed from: a */
    public static bb m236946a(VideoChatPullLiveSettingResponse videoChatPullLiveSettingResponse) {
        if (videoChatPullLiveSettingResponse == null) {
            return null;
        }
        bb bbVar = new bb();
        bbVar.f152670a = videoChatPullLiveSettingResponse.mlive_url;
        if (videoChatPullLiveSettingResponse.mprivilege_scope_setting != null) {
            bb.C60969c cVar = new bb.C60969c();
            cVar.f152681b = m236945a(videoChatPullLiveSettingResponse.mprivilege_scope_setting.mscope_public);
            cVar.f152680a = m236945a(videoChatPullLiveSettingResponse.mprivilege_scope_setting.mscope_tenant);
            bbVar.f152672c = cVar;
        }
        if (videoChatPullLiveSettingResponse.mlayout_type_setting != null) {
            bb.C60968b bVar = new bb.C60968b();
            bVar.f152679c = m236945a(videoChatPullLiveSettingResponse.mlayout_type_setting.mlayout_full);
            bVar.f152678b = m236945a(videoChatPullLiveSettingResponse.mlayout_type_setting.mlayout_gallery);
            bVar.f152677a = m236945a(videoChatPullLiveSettingResponse.mlayout_type_setting.mlayout_list);
            bbVar.f152671b = bVar;
        }
        if (videoChatPullLiveSettingResponse.menable_interaction_setting != null) {
            bbVar.f152673d = m236945a(videoChatPullLiveSettingResponse.menable_interaction_setting);
        }
        return bbVar;
    }

    /* renamed from: a */
    public static bb.C60967a m236945a(LiveSettingElement liveSettingElement) {
        if (liveSettingElement == null) {
            return null;
        }
        bb.C60967a aVar = new bb.C60967a();
        aVar.f152676c = liveSettingElement.mdisable_hover_key;
        aVar.f152675b = liveSettingElement.mis_disabled.booleanValue();
        aVar.f152674a = liveSettingElement.mis_selected.booleanValue();
        return aVar;
    }

    /* renamed from: a */
    public static ReservationInfoEntity m236921a(GetReservationResponse getReservationResponse) {
        if (getReservationResponse == null) {
            return null;
        }
        ReservationInfoEntity reservationInfoEntity = new ReservationInfoEntity(getReservationResponse.mid);
        reservationInfoEntity.mo210084a(getReservationResponse.mreserver);
        reservationInfoEntity.mo210082a(m236916a(getReservationResponse.mreserver_type));
        reservationInfoEntity.mo210086b(getReservationResponse.mmeeting_no);
        reservationInfoEntity.mo210087c(getReservationResponse.murl);
        reservationInfoEntity.mo210083a(m236917a(getReservationResponse.mmeeting_pre_config));
        return reservationInfoEntity;
    }

    /* renamed from: a */
    public static ReservationInfoEntity.ReserverType m236916a(GetReservationResponse.ReserverType reserverType) {
        if (reserverType == null) {
            return null;
        }
        return ReservationInfoEntity.ReserverType.valueOf(reserverType.getValue());
    }

    /* renamed from: a */
    public static ReservationInfoEntity.MeetingPreConfig m236917a(GetReservationResponse.MeetingPreConfig meetingPreConfig) {
        if (meetingPreConfig == null) {
            return null;
        }
        ReservationInfoEntity.MeetingPreConfig aVar = new ReservationInfoEntity.MeetingPreConfig();
        aVar.mo210092a(meetingPreConfig.mtopic);
        ArrayList arrayList = new ArrayList();
        for (GetReservationResponse.User user : meetingPreConfig.mauto_invited_users) {
            if (user != null) {
                arrayList.add(m236920a(user));
            }
        }
        aVar.mo210093a(arrayList);
        return aVar;
    }

    /* renamed from: a */
    public static ReservationInfoEntity.User m236920a(GetReservationResponse.User user) {
        if (user == null) {
            return null;
        }
        ReservationInfoEntity.User bVar = new ReservationInfoEntity.User();
        bVar.mo210097a(user.muser_id);
        if (user.muser_type != null) {
            bVar.mo210095a(ParticipantType.forNumber(user.muser_type.getValue()));
        }
        bVar.mo210096a(m236919a(user.mpstn_sip_user_info));
        return bVar;
    }

    /* renamed from: a */
    public static ReservationInfoEntity.User.PstnSipUserInfo m236919a(GetReservationResponse.User.PstnSipUserInfo pstnSipUserInfo) {
        if (pstnSipUserInfo == null) {
            return null;
        }
        ReservationInfoEntity.User.PstnSipUserInfo bVar = new ReservationInfoEntity.User.PstnSipUserInfo();
        bVar.mo210105a(pstnSipUserInfo.mnickname);
        bVar.mo210107b(pstnSipUserInfo.mmain_address);
        bVar.mo210108c(pstnSipUserInfo.msub_address);
        bVar.mo210104a(m236918a(pstnSipUserInfo.mavatar));
        return bVar;
    }

    /* renamed from: a */
    public static ReservationInfoEntity.User.Avater m236918a(GetReservationResponse.User.Avatar avatar) {
        if (avatar == null) {
            return null;
        }
        ReservationInfoEntity.User.Avater aVar = new ReservationInfoEntity.User.Avater();
        aVar.mo210101a(avatar.mkey);
        aVar.mo210102b(avatar.mFsUnit);
        return aVar;
    }

    /* renamed from: a */
    public static PullVCCardInfoEntity m236827a(PullVCCardInfoResponse pullVCCardInfoResponse) {
        if (pullVCCardInfoResponse == null) {
            return null;
        }
        PullVCCardInfoEntity pullVCCardInfoEntity = new PullVCCardInfoEntity();
        pullVCCardInfoEntity.isMore = pullVCCardInfoResponse.mis_more.booleanValue();
        pullVCCardInfoEntity.nextRequestToken = pullVCCardInfoResponse.mnext_request_token;
        pullVCCardInfoEntity.content = m236828a(pullVCCardInfoResponse.mvideo_chat_content);
        return pullVCCardInfoEntity;
    }

    /* renamed from: a */
    public static VideoChatH323Setting m236872a(com.ss.android.lark.pb.videoconference.v1.VideoChatH323Setting videoChatH323Setting) {
        if (videoChatH323Setting == null || CollectionUtils.isEmpty(videoChatH323Setting.h323_access_list)) {
            return null;
        }
        VideoChatH323Setting videoChatH323Setting2 = new VideoChatH323Setting();
        ArrayList<H323Access> arrayList = new ArrayList<>();
        for (VideoChatH323Setting.H323Access h323Access : videoChatH323Setting.h323_access_list) {
            arrayList.add(m236837a(h323Access));
        }
        videoChatH323Setting2.setH323AccessList(arrayList);
        return videoChatH323Setting2;
    }

    /* renamed from: a */
    public static H323Access m236837a(VideoChatH323Setting.H323Access h323Access) {
        if (h323Access == null) {
            return null;
        }
        H323Access h323Access2 = new H323Access();
        h323Access2.setCountry(h323Access.country);
        h323Access2.setIp(h323Access.ip);
        return h323Access2;
    }

    /* renamed from: a */
    public static com.ss.android.vc.entity.VideoChatH323Setting m236871a(com.ss.android.lark.pb.videochat.VideoChatH323Setting videoChatH323Setting) {
        if (videoChatH323Setting == null || CollectionUtils.isEmpty(videoChatH323Setting.mh323_access_list)) {
            return null;
        }
        com.ss.android.vc.entity.VideoChatH323Setting videoChatH323Setting2 = new com.ss.android.vc.entity.VideoChatH323Setting();
        ArrayList<H323Access> arrayList = new ArrayList<>();
        for (VideoChatH323Setting.H323Access h323Access : videoChatH323Setting.mh323_access_list) {
            arrayList.add(m236836a(h323Access));
        }
        videoChatH323Setting2.setH323AccessList(arrayList);
        return videoChatH323Setting2;
    }

    /* renamed from: a */
    public static H323Access m236836a(VideoChatH323Setting.H323Access h323Access) {
        if (h323Access == null) {
            return null;
        }
        H323Access h323Access2 = new H323Access();
        h323Access2.setCountry(h323Access.mcountry);
        h323Access2.setIp(h323Access.mip);
        return h323Access2;
    }

    /* renamed from: a */
    public static VideoChatContent m236828a(com.ss.android.lark.pb.entities.VideoChatContent videoChatContent) {
        VideoChatContent videoChatContent2 = new VideoChatContent();
        if (videoChatContent == null) {
            return videoChatContent2;
        }
        if (videoChatContent.mtype != null) {
            videoChatContent2.type = videoChatContent.mtype.getValue();
        }
        VideoChatContent.MeetingCard meetingCard = videoChatContent.mmeeting_card;
        if (meetingCard != null) {
            VideoChatContent.MeetingCard meetingCard2 = new VideoChatContent.MeetingCard();
            meetingCard2.meetingId = meetingCard.mmeeting_id;
            meetingCard2.endTime = meetingCard.mend_time_ms.longValue();
            meetingCard2.hostId = meetingCard.mhost_id;
            meetingCard2.forwarderId = meetingCard.mforwarder_id;
            if (meetingCard.mstatus != null) {
                meetingCard2.meetingStatus = meetingCard.mstatus.getValue();
            }
            if (meetingCard.mmeeting_source != null) {
                meetingCard2.meetingSource = meetingCard.mmeeting_source.getValue();
            }
            meetingCard2.meetNumber = meetingCard.mmeet_number;
            meetingCard2.calendarId = meetingCard.mcalendar_uid;
            meetingCard2.sponsorId = meetingCard.msponsor_id;
            meetingCard2.startTime = meetingCard.mstart_time_ms.longValue();
            meetingCard2.setIsLocked(meetingCard.mis_locked.booleanValue());
            meetingCard2.setLobbyOpen(meetingCard.mis_open_lobby.booleanValue());
            meetingCard2.topic = meetingCard.mtopic;
            meetingCard2.maxParticipantCount = meetingCard.mmax_participant_count.intValue();
            meetingCard2.hostType = ParticipantType.valueOf(meetingCard.mhost_type.getValue());
            meetingCard2.ownerUserId = meetingCard.mowner_user_id;
            if (meetingCard.mowner_type != null) {
                meetingCard2.ownerType = ParticipantType.valueOf(meetingCard.mowner_type.getValue());
            }
            if (meetingCard.mparticipants != null && meetingCard.mparticipants.size() > 0) {
                for (VideoChatContent.MeetingCard.MeetingParticipant meetingParticipant : meetingCard.mparticipants) {
                    if (meetingParticipant != null) {
                        Participant participant = new Participant();
                        participant.setDeviceId(meetingParticipant.mdevice_id);
                        participant.setJoinTime(meetingParticipant.mjoin_time_ms.longValue());
                        participant.setId(meetingParticipant.muser_id);
                        if (meetingParticipant.mstatus != null) {
                            participant.setStatus(Participant.Status.forNumber(meetingParticipant.mstatus.getValue()));
                        }
                        participant.setParticipantType(ParticipantType.valueOf(meetingParticipant.muser_type.getValue()));
                        if (!C57782ag.m224241a(meetingParticipant.mtenant_id)) {
                            participant.setTenantId(meetingParticipant.mtenant_id);
                        }
                        if (meetingParticipant.mtenant_tag != null) {
                            participant.setTenantTag(Participant.TenantTag.valueOf(meetingParticipant.mtenant_tag.getValue()));
                        }
                        participant.setGuest(meetingParticipant.mis_lark_guest.booleanValue());
                        participant.setDeviceType(Participant.DeviceType.valueOf(meetingParticipant.mdevice_type.getValue()));
                        meetingCard2.participants.add(participant);
                    }
                }
            }
            videoChatContent2.meetingCard = meetingCard2;
            if (meetingCard.mtotal_participant_num != null) {
                meetingCard2.totalParticipantNum = meetingCard.mtotal_participant_num.longValue();
            }
            if (meetingCard.mall_participant_tenant != null) {
                ArrayList<Long> arrayList = new ArrayList<>();
                for (Long l : meetingCard.mall_participant_tenant) {
                    arrayList.add(l);
                }
                meetingCard2.tenantIds = arrayList;
            }
            if (CollectionUtils.isEmpty(meetingCard2.tenantIds)) {
                meetingCard2.isExternal = m237029x(meetingCard2.participants);
            } else {
                meetingCard2.isExternal = m237030y(meetingCard2.tenantIds);
            }
        }
        return videoChatContent2;
    }

    /* renamed from: a */
    public static C60953a m236925a(AdjustMeetingDurationResponse adjustMeetingDurationResponse) {
        if (adjustMeetingDurationResponse == null) {
            return null;
        }
        C60953a aVar = new C60953a();
        aVar.f152631a = adjustMeetingDurationResponse.meeting_duration.longValue();
        aVar.f152632b = adjustMeetingDurationResponse.request_end_time.longValue() - adjustMeetingDurationResponse.request_begin_time.longValue();
        return aVar;
    }

    /* renamed from: a */
    public static ay m236943a(GetUserProfileResponse getUserProfileResponse) {
        ay ayVar = new ay();
        if (!(getUserProfileResponse == null || getUserProfileResponse.company == null)) {
            ayVar.mo210122a(getUserProfileResponse.company.tenant_name);
        }
        return ayVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.entity.a.c$1 */
    public static /* synthetic */ class C609311 {

        /* renamed from: a */
        static final /* synthetic */ int[] f152480a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.lark.pb.videoconference.v1.VCTabStatisticsInfo$Status[] r0 = com.ss.android.lark.pb.videoconference.v1.VCTabStatisticsInfo.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.entity.p3092a.C60930c.C609311.f152480a = r0
                com.ss.android.lark.pb.videoconference.v1.VCTabStatisticsInfo$Status r1 = com.ss.android.lark.pb.videoconference.v1.VCTabStatisticsInfo.Status.READY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.entity.p3092a.C60930c.C609311.f152480a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.pb.videoconference.v1.VCTabStatisticsInfo$Status r1 = com.ss.android.lark.pb.videoconference.v1.VCTabStatisticsInfo.Status.WAITING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.entity.p3092a.C60930c.C609311.f152480a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.pb.videoconference.v1.VCTabStatisticsInfo$Status r1 = com.ss.android.lark.pb.videoconference.v1.VCTabStatisticsInfo.Status.SUCCEEDED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.vc.entity.p3092a.C60930c.C609311.f152480a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.pb.videoconference.v1.VCTabStatisticsInfo$Status r1 = com.ss.android.lark.pb.videoconference.v1.VCTabStatisticsInfo.Status.FAILED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.vc.entity.p3092a.C60930c.C609311.f152480a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.pb.videoconference.v1.VCTabStatisticsInfo$Status r1 = com.ss.android.lark.pb.videoconference.v1.VCTabStatisticsInfo.Status.UNAVAILABLE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.entity.p3092a.C60930c.C609311.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static com.ss.android.lark.pb.videoconference.v1.LanguageType m236814a(LanguageType languageType) {
        if (languageType == null) {
            return null;
        }
        return new com.ss.android.lark.pb.videoconference.v1.LanguageType(languageType.languageType, languageType.despI18nKey, languageType.iconStr);
    }

    /* renamed from: a */
    public static int m236801a(VCTabStatisticsInfo.Status status) {
        int i = C609311.f152480a[status.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    /* renamed from: a */
    public static ChatterCustomStatus.StatusEffectiveInterval m236802a(StatusEffectiveInterval statusEffectiveInterval) {
        if (statusEffectiveInterval == null) {
            return null;
        }
        return new ChatterCustomStatus.StatusEffectiveInterval(statusEffectiveInterval.start_time.longValue(), statusEffectiveInterval.end_time.longValue(), statusEffectiveInterval.is_show_end_time.booleanValue());
    }

    /* renamed from: b */
    public static GetsuggetedParticipants m237006b(GetSuggestedParticipantsResponse getSuggestedParticipantsResponse) {
        if (getSuggestedParticipantsResponse == null) {
            return null;
        }
        GetsuggetedParticipants dVar = new GetsuggetedParticipants();
        if (getSuggestedParticipantsResponse.suggested_participants != null) {
            for (com.ss.android.lark.pb.videoconference.v1.Participant participant : getSuggestedParticipantsResponse.suggested_participants) {
                dVar.mo209709a().add(C60932d.m237035a(participant));
            }
        }
        return dVar;
    }

    /* renamed from: c */
    public static List<com.ss.android.vc.entity.tab.HistoryInfo> m237008c(List<com.ss.android.lark.pb.videoconference.v1.HistoryInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (com.ss.android.lark.pb.videoconference.v1.HistoryInfo historyInfo : list) {
            com.ss.android.vc.entity.tab.HistoryInfo a = m236975a(historyInfo);
            if (a != null) {
                arrayList.add(a);
            }
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        return null;
    }

    /* renamed from: e */
    public static List<an.C60964a> m237010e(List<SearchSubtitlesResponse.Match> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (SearchSubtitlesResponse.Match match : list) {
            an.C60964a aVar = new an.C60964a();
            aVar.f152653a = match.seg_id;
            aVar.f152654b = match.start_pos;
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* renamed from: f */
    public static List<com.ss.android.vc.entity.follow.FollowState> m237011f(List<com.ss.android.lark.pb.videoconference.v1.FollowState> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (com.ss.android.lark.pb.videoconference.v1.FollowState followState : list) {
            arrayList.add(m236892a(followState));
        }
        return arrayList;
    }

    /* renamed from: g */
    public static List<ByteviewUser> m237012g(List<com.ss.android.lark.pb.videoconference.v1.ByteviewUser> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (com.ss.android.lark.pb.videoconference.v1.ByteviewUser byteviewUser : list) {
            arrayList.add(m236832a(byteviewUser));
        }
        return arrayList;
    }

    /* renamed from: h */
    public static List<ByteviewUser> m237013h(List<com.ss.android.lark.pb.videochat.ByteviewUser> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (com.ss.android.lark.pb.videochat.ByteviewUser byteviewUser : list) {
            arrayList.add(m236831a(byteviewUser));
        }
        return arrayList;
    }

    /* renamed from: i */
    public static List<SketchByteviewUser> m237014i(List<com.ss.android.lark.pb.videoconference.v1.ByteviewUser> list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (com.ss.android.lark.pb.videoconference.v1.ByteviewUser byteviewUser : list) {
            if (byteviewUser != null) {
                arrayList.add(new SketchByteviewUser(byteviewUser.device_id, byteviewUser.user_id, byteviewUser.user_type.getValue()));
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public static List<VideoChat> m237015j(List<VideoChatInfo> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (VideoChatInfo videoChatInfo : list) {
            arrayList.add(C60932d.m237040a(videoChatInfo));
        }
        return arrayList;
    }

    /* renamed from: k */
    public static List<com.ss.android.lark.pb.videoconference.v1.ByteviewUser> m237016k(List<ByteviewUser> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (ByteviewUser byteviewUser : list) {
            arrayList.add(new com.ss.android.lark.pb.videoconference.v1.ByteviewUser(byteviewUser.getUserId(), byteviewUser.getDeviceId(), com.ss.android.lark.pb.videoconference.v1.ParticipantType.fromValue(byteviewUser.getParticipantType().getNumber())));
        }
        return arrayList;
    }

    /* renamed from: l */
    public static List<com.ss.android.lark.pb.videoconference.v1.ByteviewUser> m237017l(List<SketchByteviewUser> list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (SketchByteviewUser sketchByteviewUser : list) {
            arrayList.add(new com.ss.android.lark.pb.videoconference.v1.ByteviewUser(sketchByteviewUser.userId, sketchByteviewUser.deviceId, com.ss.android.lark.pb.videoconference.v1.ParticipantType.fromValue(sketchByteviewUser.userType)));
        }
        return arrayList;
    }

    /* renamed from: m */
    public static List<ByteViewUserInfo> m237018m(List<com.ss.android.lark.pb.videoconference.v1.ByteViewUserInfo> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (com.ss.android.lark.pb.videoconference.v1.ByteViewUserInfo byteViewUserInfo : list) {
            arrayList.add(m236830a(byteViewUserInfo));
        }
        return arrayList;
    }

    /* renamed from: n */
    public static List<C60942l> m237019n(List<PullVideoChatConfigResponse.SubtitleLanguage> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (PullVideoChatConfigResponse.SubtitleLanguage subtitleLanguage : list) {
                C60942l lVar = new C60942l();
                lVar.f152506a = subtitleLanguage.language;
                lVar.f152507b = subtitleLanguage.description;
                arrayList.add(lVar);
            }
        }
        return arrayList;
    }

    /* renamed from: o */
    public static List<VCParticipantAbbrInfo> m237020o(List<com.ss.android.lark.pb.videoconference.v1.VCParticipantAbbrInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (!CollectionUtils.isEmpty(list)) {
            for (com.ss.android.lark.pb.videoconference.v1.VCParticipantAbbrInfo vCParticipantAbbrInfo : list) {
                arrayList.add(m236974a(vCParticipantAbbrInfo));
            }
        }
        return arrayList;
    }

    /* renamed from: q */
    public static List<com.ss.android.vc.entity.sketch.SketchDataUnit> m237022q(List<com.ss.android.lark.pb.videoconference.v1.SketchDataUnit> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (com.ss.android.lark.pb.videoconference.v1.SketchDataUnit sketchDataUnit : list) {
            arrayList.add(m236972a(sketchDataUnit));
        }
        return arrayList;
    }

    /* renamed from: r */
    public static List<com.ss.android.vc.entity.sketch.SketchOperationUnit> m237023r(List<com.ss.android.lark.pb.videoconference.v1.SketchOperationUnit> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (com.ss.android.lark.pb.videoconference.v1.SketchOperationUnit sketchOperationUnit : list) {
            arrayList.add(m236973a(sketchOperationUnit));
        }
        return arrayList;
    }

    /* renamed from: s */
    public static List<LanguageType> m237024s(List<com.ss.android.lark.pb.videoconference.v1.LanguageType> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (com.ss.android.lark.pb.videoconference.v1.LanguageType languageType : list) {
            LanguageType languageType2 = new LanguageType();
            languageType2.languageType = languageType.language_type;
            languageType2.iconStr = languageType.icon_str;
            languageType2.despI18nKey = languageType.desp_i18n_key;
            arrayList.add(languageType2);
        }
        return arrayList;
    }

    /* renamed from: t */
    public static List<LanguageType> m237025t(List<com.ss.android.lark.pb.videochat.LanguageType> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (com.ss.android.lark.pb.videochat.LanguageType languageType : list) {
            LanguageType languageType2 = new LanguageType();
            languageType2.languageType = languageType.mlanguage_type;
            languageType2.iconStr = languageType.micon_str;
            languageType2.despI18nKey = languageType.mdesp_i18n_key;
            arrayList.add(languageType2);
        }
        return arrayList;
    }

    /* renamed from: u */
    public static List<VirtualBackgroundInfo> m237026u(List<GetVcVirtualBackgroundResponse.VirtualBackgroundInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (GetVcVirtualBackgroundResponse.VirtualBackgroundInfo virtualBackgroundInfo : list) {
            arrayList.add(m236881a(virtualBackgroundInfo));
        }
        return arrayList;
    }

    /* renamed from: v */
    public static List<MeetingBackground> m237027v(List<com.ss.android.lark.pb.videoconference.v1.MeetingBackground> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (com.ss.android.lark.pb.videoconference.v1.MeetingBackground meetingBackground : list) {
            arrayList.add(m236878a(meetingBackground));
        }
        return arrayList;
    }

    /* renamed from: w */
    public static List<GetVcVirtualBackgroundRequest.VirtualBackground> m237028w(List<VirtualBackground> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (VirtualBackground virtualBackground : list) {
            arrayList.add(m236811a(virtualBackground));
        }
        return arrayList;
    }

    /* renamed from: x */
    private static boolean m237029x(List<Participant> list) {
        if (CollectionUtils.isEmpty(list)) {
            return false;
        }
        for (Participant participant : list) {
            if (C60657a.m235732a().mo208741a(participant)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static BreakoutRoomInfo.BreakoutRoomInfoSettings m236803a(VCBreakoutRoomInfoSettings vCBreakoutRoomInfoSettings) {
        return new BreakoutRoomInfo.BreakoutRoomInfoSettings.C50471a().mo174847a(Boolean.valueOf(vCBreakoutRoomInfoSettings.isMuteOnEntry())).mo174850b(Boolean.valueOf(vCBreakoutRoomInfoSettings.isArticipantUnmuteDeny())).mo174848a(m237016k(vCBreakoutRoomInfoSettings.getSnapShotUsers())).mo174851c(Boolean.valueOf(vCBreakoutRoomInfoSettings.isOnlyPresenterCanAnnote())).build();
    }

    /* renamed from: b */
    public static List<VcTabDetailInfo> m237007b(List<VCTabMeetingAbbrInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (!CollectionUtils.isEmpty(list)) {
            for (VCTabMeetingAbbrInfo vCTabMeetingAbbrInfo : list) {
                VcTabDetailInfo vcTabDetailInfo = new VcTabDetailInfo();
                vcTabDetailInfo.setMeetingId(vCTabMeetingAbbrInfo.meeting_id);
                vcTabDetailInfo.setMeetingBaseInfo(m236981a(vCTabMeetingAbbrInfo.meeting_base_info));
                vcTabDetailInfo.setMeetingUserSpecInfo(m236983a(vCTabMeetingAbbrInfo.user_spec_info));
                arrayList.add(vcTabDetailInfo);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public static List<FollowAbbrInfo> m237009d(List<com.ss.android.lark.pb.videoconference.v1.FollowAbbrInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (!CollectionUtils.isEmpty(list)) {
            for (com.ss.android.lark.pb.videoconference.v1.FollowAbbrInfo followAbbrInfo : list) {
                FollowAbbrInfo followAbbrInfo2 = new FollowAbbrInfo();
                followAbbrInfo2.setDocUrl(followAbbrInfo.raw_url);
                followAbbrInfo2.setDocTitle(followAbbrInfo.file_title);
                followAbbrInfo2.setDocToken(followAbbrInfo.file_token);
                followAbbrInfo2.setDocSubType(FollowInfo.ShareSubType.forNumber(followAbbrInfo.share_subtype.getValue()));
                followAbbrInfo2.setDocLabelUrl(followAbbrInfo.file_label_url);
                ArrayList arrayList2 = new ArrayList();
                for (com.ss.android.lark.pb.videoconference.v1.ByteviewUser byteviewUser : followAbbrInfo.presenters) {
                    arrayList2.add(m236832a(byteviewUser));
                }
                followAbbrInfo2.setByteviewUsers(arrayList2);
                arrayList.add(followAbbrInfo2);
            }
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        return null;
    }

    /* renamed from: p */
    public static List<VCTabDetailItemChangeEvent> m237021p(List<com.ss.android.lark.pb.videoconference.v1.VCTabDetailItemChangeEvent> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (com.ss.android.lark.pb.videoconference.v1.VCTabDetailItemChangeEvent vCTabDetailItemChangeEvent : list) {
            VCTabDetailItemChangeEvent vCTabDetailItemChangeEvent2 = new VCTabDetailItemChangeEvent();
            vCTabDetailItemChangeEvent2.setMeetingId(vCTabDetailItemChangeEvent.meeting_id);
            vCTabDetailItemChangeEvent2.setFollowInfo(m237009d(vCTabDetailItemChangeEvent.follow_info));
            vCTabDetailItemChangeEvent2.setHistoryInfo(m236975a(vCTabDetailItemChangeEvent.history_info));
            vCTabDetailItemChangeEvent2.setRecordInfo(m236984a(vCTabDetailItemChangeEvent.record_info));
            vCTabDetailItemChangeEvent2.setReplaceAllHistory(m237008c(vCTabDetailItemChangeEvent.replace_all_history));
            vCTabDetailItemChangeEvent2.setVersion(vCTabDetailItemChangeEvent.version.intValue());
            arrayList.add(vCTabDetailItemChangeEvent2);
        }
        return arrayList;
    }

    /* renamed from: y */
    private static boolean m237030y(List<Long> list) {
        if (CollectionUtils.isEmpty(list)) {
            return false;
        }
        boolean a = C60657a.m235732a().mo208740a();
        if (C60657a.m235732a().mo208742b() && !a) {
            list.remove((Object) -1L);
            if (list.size() > 1) {
                return true;
            }
            if (list.size() == 1) {
                return !TextUtils.equals(C60657a.m235732a().mo208744d(), list.get(0).toString());
            }
        }
        return false;
    }

    /* renamed from: a */
    public static BreakoutRoomManage m236804a(com.ss.android.vc.entity.breakoutroom.BreakoutRoomManage breakoutRoomManage) {
        BreakoutRoomManage.C50481a aVar = new BreakoutRoomManage.C50481a();
        aVar.f126033a = BreakoutRoomManage.ManageType.fromValue(breakoutRoomManage.getManageType().getNumber());
        ArrayList arrayList = new ArrayList();
        for (VCBreakoutRoomInfo vCBreakoutRoomInfo : breakoutRoomManage.getRoomInfos()) {
            arrayList.add(new BreakoutRoomInfo(vCBreakoutRoomInfo.getBreakoutRoomId(), vCBreakoutRoomInfo.getRoomTopic(), Long.valueOf(vCBreakoutRoomInfo.getStartTime()), m236803a(vCBreakoutRoomInfo.getSettings()), vCBreakoutRoomInfo.getChannelId(), BreakoutRoomInfo.Status.fromValue(vCBreakoutRoomInfo.getStatus().getValue()), Long.valueOf(vCBreakoutRoomInfo.getCountDownFromStartTime()), null));
        }
        aVar.mo174873a(arrayList);
        return aVar.build();
    }

    /* renamed from: a */
    public static com.ss.android.lark.pb.videoconference.v1.ByteviewUser m236805a(ByteviewUser byteviewUser) {
        if (byteviewUser == null) {
            return null;
        }
        return new com.ss.android.lark.pb.videoconference.v1.ByteviewUser(byteviewUser.getUserId(), byteviewUser.getDeviceId(), com.ss.android.lark.pb.videoconference.v1.ParticipantType.fromValue(byteviewUser.getParticipantType().getNumber()));
    }

    /* renamed from: a */
    public static CalendarVCSettings m236806a(CalendarVCSettingsEntity calendarVCSettingsEntity) {
        if (calendarVCSettingsEntity == null) {
            return null;
        }
        return new CalendarVCSettings(VCSecuritySetting.fromValue(calendarVCSettingsEntity.f152571a.getNumber()), Boolean.valueOf(calendarVCSettingsEntity.f152572b), Boolean.valueOf(calendarVCSettingsEntity.f152573c), Boolean.valueOf(calendarVCSettingsEntity.f152574d), Boolean.valueOf(calendarVCSettingsEntity.f152575e));
    }

    /* renamed from: a */
    public static com.ss.android.lark.pb.videoconference.v1.FollowGrootCellPayload m236807a(FollowGrootCellPayload followGrootCellPayload) {
        if (followGrootCellPayload == null) {
            return null;
        }
        FollowGrootCellPayload.C50567a aVar = new FollowGrootCellPayload.C50567a();
        if (followGrootCellPayload.getType() == FollowGrootCellPayload.Type.PATCHES) {
            aVar.mo175083a(FollowGrootCellPayload.Type.PATCHES);
            if (followGrootCellPayload.getFollowPatches() != null && followGrootCellPayload.getFollowPatches().size() > 0) {
                ArrayList arrayList = new ArrayList();
                for (FollowPatch followPatch : followGrootCellPayload.getFollowPatches()) {
                    arrayList.add(m236808a(followPatch));
                }
                aVar.mo175084a(arrayList);
            }
        } else if (followGrootCellPayload.getType() == FollowGrootCellPayload.Type.STATES) {
            aVar.mo175083a(FollowGrootCellPayload.Type.STATES);
            if (followGrootCellPayload.getFollowStates() != null && followGrootCellPayload.getFollowStates().size() > 0) {
                ArrayList arrayList2 = new ArrayList();
                for (com.ss.android.vc.entity.follow.FollowState followState : followGrootCellPayload.getFollowStates()) {
                    arrayList2.add(m236809a(followState));
                }
                aVar.mo175086b(arrayList2);
            }
        }
        return aVar.build();
    }

    /* renamed from: a */
    public static com.ss.android.lark.pb.videoconference.v1.FollowPatch m236808a(FollowPatch followPatch) {
        if (followPatch == null) {
            return null;
        }
        FollowPatch.C50573a aVar = new FollowPatch.C50573a();
        aVar.mo175101a(FollowPatch.Type.fromValue(followPatch.getOpType().getNumber()));
        aVar.mo175100a(com.ss.android.lark.pb.videoconference.v1.FollowDataType.fromValue(followPatch.getDataType().getNumber()));
        aVar.mo175102a(m236810a(followPatch.getWebData()));
        aVar.mo175103a(followPatch.getSenderId());
        return aVar.build();
    }
}
