package com.ss.android.vc.net.request;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.ActionType;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.Doc;
import com.bytedance.lark.pb.basic.v1.SendHttpRequest;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.bytedance.lark.pb.calendar.v1.GetCurrentUserBriefPrimaryCalendarRequest;
import com.bytedance.lark.pb.calendar.v1.GetCurrentUserBriefPrimaryCalendarResponse;
import com.bytedance.lark.pb.contact.v1.GetUserProfileRequest;
import com.bytedance.lark.pb.contact.v1.GetUserProfileResponse;
import com.bytedance.lark.pb.contact.v1.MGetChattersRequest;
import com.bytedance.lark.pb.contact.v1.MGetChattersResponse;
import com.bytedance.lark.pb.contact.v2.GetAuthChattersRequest;
import com.bytedance.lark.pb.settings.v1.GetSettingsRequest;
import com.bytedance.lark.pb.settings.v1.GetSettingsResponse;
import com.bytedance.lark.pb.settings.v1.SearchFeatureGatingByPrefixRequest;
import com.bytedance.lark.pb.settings.v1.SearchFeatureGatingByPrefixResponse;
import com.bytedance.lark.pb.space.doc.v1.CreateDocRequest;
import com.bytedance.lark.pb.space.doc.v1.CreateDocResponse;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.aj;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.chat.service.lkp.ConvertOfficeToSpaceService;
import com.ss.android.lark.pb.role.GetAdminPermissionInfoRequest;
import com.ss.android.lark.pb.role.GetAdminPermissionInfoResponse;
import com.ss.android.lark.pb.videochat.CancelEnterprisePhoneRequest;
import com.ss.android.lark.pb.videochat.CancelEnterprisePhoneResponse;
import com.ss.android.lark.pb.videochat.CheckEnterprisePhoneQuotaRequest;
import com.ss.android.lark.pb.videochat.CheckEnterprisePhoneQuotaResponse;
import com.ss.android.lark.pb.videochat.CreateEnterprisePhoneRequest;
import com.ss.android.lark.pb.videochat.CreateEnterprisePhoneResponse;
import com.ss.android.lark.pb.videochat.GetEnterprisePhoneConfigRequest;
import com.ss.android.lark.pb.videochat.GetEnterprisePhoneConfigResponse;
import com.ss.android.lark.pb.videochat.GetH323AccessInfoByUniqueIDRequest;
import com.ss.android.lark.pb.videochat.GetH323AccessInfoByUniqueIDResponse;
import com.ss.android.lark.pb.videochat.GetPhoneNumberAttributtonRequest;
import com.ss.android.lark.pb.videochat.GetPhoneNumberAttributtonResponse;
import com.ss.android.lark.pb.videochat.GetPstnSipFeatureConfigRequest;
import com.ss.android.lark.pb.videochat.GetPstnSipFeatureConfigResponse;
import com.ss.android.lark.pb.videochat.GetReservationRequest;
import com.ss.android.lark.pb.videochat.GetReservationResponse;
import com.ss.android.lark.pb.videochat.GetRoomStatusByShareCodeRequest;
import com.ss.android.lark.pb.videochat.GetRoomStatusByShareCodeResponse;
import com.ss.android.lark.pb.videochat.GetSIPDomainByUniqueIDRequest;
import com.ss.android.lark.pb.videochat.GetSIPDomainByUniqueIDResponse;
import com.ss.android.lark.pb.videochat.GetShareCodeInfoRequest;
import com.ss.android.lark.pb.videochat.GetShareCodeInfoResponse;
import com.ss.android.lark.pb.videochat.KeepMeetingRequest;
import com.ss.android.lark.pb.videochat.NetworkType;
import com.ss.android.lark.pb.videochat.PullVCCardInfoRequest;
import com.ss.android.lark.pb.videochat.PullVCCardInfoResponse;
import com.ss.android.lark.pb.videochat.PullVideochatByShareCodeRequest;
import com.ss.android.lark.pb.videochat.PullVideochatByShareCodeResponse;
import com.ss.android.lark.pb.videochat.UploadParticipantInfoRequest;
import com.ss.android.lark.pb.videochat.VCManageApplyRequest;
import com.ss.android.lark.pb.videochat.VCManageApplyResponse;
import com.ss.android.lark.pb.videochat.VideoChatPullLiveSettingRequest;
import com.ss.android.lark.pb.videochat.VideoChatPullLiveSettingResponse;
import com.ss.android.lark.pb.videochat_tab_v2.CreateVCTabMeetingStatisticsRequest;
import com.ss.android.lark.pb.videochat_tab_v2.CreateVCTabMeetingStatisticsResponse;
import com.ss.android.lark.pb.videochat_tab_v2.GetVCTabTotalMissedCallRequest;
import com.ss.android.lark.pb.videochat_tab_v2.GetVCTabTotalMissedCallResponse;
import com.ss.android.lark.pb.videochat_tab_v2.VCTabMissedCallConfirmRequest;
import com.ss.android.lark.pb.videochat_tab_v2.VCTabMissedCallConfirmResponse;
import com.ss.android.lark.pb.videoconference.v1.ActionTime;
import com.ss.android.lark.pb.videoconference.v1.AdjustMeetingDurationRequest;
import com.ss.android.lark.pb.videoconference.v1.AdjustMeetingDurationResponse;
import com.ss.android.lark.pb.videoconference.v1.ApplyByteviewAccessibilityRequest;
import com.ss.android.lark.pb.videoconference.v1.ApplyByteviewAccessibilityResponse;
import com.ss.android.lark.pb.videoconference.v1.BreakoutRoomJoinRequest;
import com.ss.android.lark.pb.videoconference.v1.BreakoutRoomJoinResponse;
import com.ss.android.lark.pb.videoconference.v1.ChannelMeta;
import com.ss.android.lark.pb.videoconference.v1.CheckGuestJoinVcRequest;
import com.ss.android.lark.pb.videoconference.v1.CheckGuestJoinVcResponse;
import com.ss.android.lark.pb.videoconference.v1.CheckVCManageCapabilitiesRequest;
import com.ss.android.lark.pb.videoconference.v1.CheckVCManageCapabilitiesResponse;
import com.ss.android.lark.pb.videoconference.v1.CloseGrootChannelRequest;
import com.ss.android.lark.pb.videoconference.v1.CloseGrootChannelResponse;
import com.ss.android.lark.pb.videoconference.v1.CreateVideoChatRequest;
import com.ss.android.lark.pb.videoconference.v1.DelVcVirtualBackgroundRequest;
import com.ss.android.lark.pb.videoconference.v1.DelVcVirtualBackgroundResponse;
import com.ss.android.lark.pb.videoconference.v1.EntrustServerTrackRequest;
import com.ss.android.lark.pb.videoconference.v1.FetchAllSketchDataRequest;
import com.ss.android.lark.pb.videoconference.v1.FetchAllSketchDataResponse;
import com.ss.android.lark.pb.videoconference.v1.FollowAssociateType;
import com.ss.android.lark.pb.videoconference.v1.FollowInfo;
import com.ss.android.lark.pb.videoconference.v1.ForceTransferHostRequest;
import com.ss.android.lark.pb.videoconference.v1.ForceTransferHostResponse;
import com.ss.android.lark.pb.videoconference.v1.GetAdminSettingsRequest;
import com.ss.android.lark.pb.videoconference.v1.GetAdminSettingsResponse;
import com.ss.android.lark.pb.videoconference.v1.GetAssociatedVideoChatRequest;
import com.ss.android.lark.pb.videoconference.v1.GetAssociatedVideoChatResponse;
import com.ss.android.lark.pb.videoconference.v1.GetAssociatedVideoChatStatusRequest;
import com.ss.android.lark.pb.videoconference.v1.GetAssociatedVideoChatStatusResponse;
import com.ss.android.lark.pb.videoconference.v1.GetCalendarGroupRequest;
import com.ss.android.lark.pb.videoconference.v1.GetCalendarGroupResponse;
import com.ss.android.lark.pb.videoconference.v1.GetCalendarGuestListByMeetingIDRequest;
import com.ss.android.lark.pb.videoconference.v1.GetCalendarGuestListByMeetingIDResponse;
import com.ss.android.lark.pb.videoconference.v1.GetCalendarInfoRequest;
import com.ss.android.lark.pb.videoconference.v1.GetCalendarInfoResponse;
import com.ss.android.lark.pb.videoconference.v1.GetCalendarVCSettingsRequest;
import com.ss.android.lark.pb.videoconference.v1.GetCalendarVCSettingsResponse;
import com.ss.android.lark.pb.videoconference.v1.GetFeedbackReasonsRequest;
import com.ss.android.lark.pb.videoconference.v1.GetFeedbackReasonsResponse;
import com.ss.android.lark.pb.videoconference.v1.GetLivePermissionRequest;
import com.ss.android.lark.pb.videoconference.v1.GetLivePermissionResponse;
import com.ss.android.lark.pb.videoconference.v1.GetMeetingURLInfoRequest;
import com.ss.android.lark.pb.videoconference.v1.GetMeetingURLInfoResponse;
import com.ss.android.lark.pb.videoconference.v1.GetParticipantListRequest;
import com.ss.android.lark.pb.videoconference.v1.GetParticipantListResponse;
import com.ss.android.lark.pb.videoconference.v1.GetParticipantsByIdsRequest;
import com.ss.android.lark.pb.videoconference.v1.GetParticipantsByIdsResponse;
import com.ss.android.lark.pb.videoconference.v1.GetRTCDNSRequest;
import com.ss.android.lark.pb.videoconference.v1.GetRTCDNSResponse;
import com.ss.android.lark.pb.videoconference.v1.GetSuggestedParticipantsRequest;
import com.ss.android.lark.pb.videoconference.v1.GetSuggestedParticipantsResponse;
import com.ss.android.lark.pb.videoconference.v1.GetSuiteQuotaRequest;
import com.ss.android.lark.pb.videoconference.v1.GetSuiteQuotaResponse;
import com.ss.android.lark.pb.videoconference.v1.GetUrlBriefsRequest;
import com.ss.android.lark.pb.videoconference.v1.GetUrlBriefsResponse;
import com.ss.android.lark.pb.videoconference.v1.GetVCTabHistoryListRequest;
import com.ss.android.lark.pb.videoconference.v1.GetVCTabHistoryListResponse;
import com.ss.android.lark.pb.videoconference.v1.GetVCTabMeetingDetailRequest;
import com.ss.android.lark.pb.videoconference.v1.GetVCTabMeetingDetailResponse;
import com.ss.android.lark.pb.videoconference.v1.GetVCUpcomingCalendarInstancesRequest;
import com.ss.android.lark.pb.videoconference.v1.GetVCUpcomingCalendarInstancesResponse;
import com.ss.android.lark.pb.videoconference.v1.GetVcMeetingJoinStatusRequest;
import com.ss.android.lark.pb.videoconference.v1.GetVcMeetingJoinStatusResponse;
import com.ss.android.lark.pb.videoconference.v1.GetVcVirtualBackgroundRequest;
import com.ss.android.lark.pb.videoconference.v1.GetVcVirtualBackgroundResponse;
import com.ss.android.lark.pb.videoconference.v1.GetVerificationInfoRequest;
import com.ss.android.lark.pb.videoconference.v1.GetVerificationInfoResponse;
import com.ss.android.lark.pb.videoconference.v1.GetVerificationTicketRequest;
import com.ss.android.lark.pb.videoconference.v1.GetVerificationTicketResponse;
import com.ss.android.lark.pb.videoconference.v1.GetViewI18nTemplateRequest;
import com.ss.android.lark.pb.videoconference.v1.GetViewI18nTemplateResponse;
import com.ss.android.lark.pb.videoconference.v1.GrantFollowTokenRequest;
import com.ss.android.lark.pb.videoconference.v1.GrantFollowTokenResponse;
import com.ss.android.lark.pb.videoconference.v1.GrootCell;
import com.ss.android.lark.pb.videoconference.v1.GrootChannel;
import com.ss.android.lark.pb.videoconference.v1.HostManageRequest;
import com.ss.android.lark.pb.videoconference.v1.HostManageResponse;
import com.ss.android.lark.pb.videoconference.v1.IDType;
import com.ss.android.lark.pb.videoconference.v1.InMeetingData;
import com.ss.android.lark.pb.videoconference.v1.InviteVideoChatRequest;
import com.ss.android.lark.pb.videoconference.v1.InviteVideoChatResponse;
import com.ss.android.lark.pb.videoconference.v1.JoinCalendarGroupMeetingRequest;
import com.ss.android.lark.pb.videoconference.v1.JoinCalendarGroupMeetingResponse;
import com.ss.android.lark.pb.videoconference.v1.JoinInterviewGroupMeetingRequest;
import com.ss.android.lark.pb.videoconference.v1.JoinInterviewGroupMeetingResponse;
import com.ss.android.lark.pb.videoconference.v1.JoinMeetingPreCheckRequest;
import com.ss.android.lark.pb.videoconference.v1.JoinMeetingPreCheckResponse;
import com.ss.android.lark.pb.videoconference.v1.JoinMeetingRequest;
import com.ss.android.lark.pb.videoconference.v1.JoinMeetingResponse;
import com.ss.android.lark.pb.videoconference.v1.MGetRoomsRequest;
import com.ss.android.lark.pb.videoconference.v1.MGetRoomsResponse;
import com.ss.android.lark.pb.videoconference.v1.MaterialSource;
import com.ss.android.lark.pb.videoconference.v1.NoticeByteviewEventRequest;
import com.ss.android.lark.pb.videoconference.v1.OpenGrootChannelRequest;
import com.ss.android.lark.pb.videoconference.v1.OpenGrootChannelResponse;
import com.ss.android.lark.pb.videoconference.v1.PSTNInfo;
import com.ss.android.lark.pb.videoconference.v1.Participant;
import com.ss.android.lark.pb.videoconference.v1.ParticipantChangeSettingsRequest;
import com.ss.android.lark.pb.videoconference.v1.ParticipantChangeSettingsResponse;
import com.ss.android.lark.pb.videoconference.v1.ParticipantSettings;
import com.ss.android.lark.pb.videoconference.v1.PatchViewUserSettingRequest;
import com.ss.android.lark.pb.videoconference.v1.PatchViewUserSettingResponse;
import com.ss.android.lark.pb.videoconference.v1.PullAllFollowStatesRequest;
import com.ss.android.lark.pb.videoconference.v1.PullAllFollowStatesResponse;
import com.ss.android.lark.pb.videoconference.v1.PullParticipantInfoRequest;
import com.ss.android.lark.pb.videoconference.v1.PullParticipantInfoResponse;
import com.ss.android.lark.pb.videoconference.v1.PullPreVideoChatSettingRequest;
import com.ss.android.lark.pb.videoconference.v1.PullPreVideoChatSettingResponse;
import com.ss.android.lark.pb.videoconference.v1.PullSubtitlesRequest;
import com.ss.android.lark.pb.videoconference.v1.PullSubtitlesResponse;
import com.ss.android.lark.pb.videoconference.v1.PullVideoChatConfigRequest;
import com.ss.android.lark.pb.videoconference.v1.PullVideoChatConfigResponse;
import com.ss.android.lark.pb.videoconference.v1.PullVideoChatInteractionMessagesRequest;
import com.ss.android.lark.pb.videoconference.v1.PullVideoChatInteractionMessagesResponse;
import com.ss.android.lark.pb.videoconference.v1.PullViewUserSettingRequest;
import com.ss.android.lark.pb.videoconference.v1.PullViewUserSettingResponse;
import com.ss.android.lark.pb.videoconference.v1.ReactionMessageContent;
import com.ss.android.lark.pb.videoconference.v1.RecordMeetingRequest;
import com.ss.android.lark.pb.videoconference.v1.RecordMeetingResponse;
import com.ss.android.lark.pb.videoconference.v1.RegisterClientInfoRequest;
import com.ss.android.lark.pb.videoconference.v1.RegisterClientInfoResponse;
import com.ss.android.lark.pb.videoconference.v1.RejoinVideoChatRequest;
import com.ss.android.lark.pb.videoconference.v1.RejoinVideoChatResponse;
import com.ss.android.lark.pb.videoconference.v1.ReplyFollowNoticeRequest;
import com.ss.android.lark.pb.videoconference.v1.ReplyFollowNoticeResponse;
import com.ss.android.lark.pb.videoconference.v1.ReplyVideoChatNoticeRequest;
import com.ss.android.lark.pb.videoconference.v1.ReplyVideoChatNoticeResponse;
import com.ss.android.lark.pb.videoconference.v1.ReplyVideoChatPromptRequest;
import com.ss.android.lark.pb.videoconference.v1.ReplyVideoChatPromptResponse;
import com.ss.android.lark.pb.videoconference.v1.RequestFollowPermRequest;
import com.ss.android.lark.pb.videoconference.v1.RequestFollowPermResponse;
import com.ss.android.lark.pb.videoconference.v1.SearchSubtitlesRequest;
import com.ss.android.lark.pb.videoconference.v1.SearchSubtitlesResponse;
import com.ss.android.lark.pb.videoconference.v1.SearchUsersAndChatsRequest;
import com.ss.android.lark.pb.videoconference.v1.SearchUsersAndChatsResponse;
import com.ss.android.lark.pb.videoconference.v1.SendGrootCellsRequest;
import com.ss.android.lark.pb.videoconference.v1.SendGrootCellsResponse;
import com.ss.android.lark.pb.videoconference.v1.SendVideoChatInteractionMessageRequest;
import com.ss.android.lark.pb.videoconference.v1.SendVideoChatInteractionMessageResponse;
import com.ss.android.lark.pb.videoconference.v1.SetCalendarVCSettingsRequest;
import com.ss.android.lark.pb.videoconference.v1.SetCalendarVCSettingsResponse;
import com.ss.android.lark.pb.videoconference.v1.SetSubtitlesFilterRequest;
import com.ss.android.lark.pb.videoconference.v1.SetSubtitlesFilterResponse;
import com.ss.android.lark.pb.videoconference.v1.SetVcVirtualBackgroundRequest;
import com.ss.android.lark.pb.videoconference.v1.SetVcVirtualBackgroundResponse;
import com.ss.android.lark.pb.videoconference.v1.ShareFollowRequest;
import com.ss.android.lark.pb.videoconference.v1.ShareFollowResponse;
import com.ss.android.lark.pb.videoconference.v1.ShareScreenRequest;
import com.ss.android.lark.pb.videoconference.v1.ShareScreenResponse;
import com.ss.android.lark.pb.videoconference.v1.ShareScreenToRoomRequest;
import com.ss.android.lark.pb.videoconference.v1.ShareScreenToRoomResponse;
import com.ss.android.lark.pb.videoconference.v1.ShareVideoChatRequest;
import com.ss.android.lark.pb.videoconference.v1.ShareVideoChatResponse;
import com.ss.android.lark.pb.videoconference.v1.SketchGrootCellPayload;
import com.ss.android.lark.pb.videoconference.v1.SketchStartRequest;
import com.ss.android.lark.pb.videoconference.v1.SketchStartResponse;
import com.ss.android.lark.pb.videoconference.v1.StartByteviewHeartbeatRequest;
import com.ss.android.lark.pb.videoconference.v1.StartByteviewPollingRequest;
import com.ss.android.lark.pb.videoconference.v1.StopByteviewHeartbeatRequest;
import com.ss.android.lark.pb.videoconference.v1.StopByteviewPollingRequest;
import com.ss.android.lark.pb.videoconference.v1.SyncSubtitlesRequest;
import com.ss.android.lark.pb.videoconference.v1.SyncSubtitlesResponse;
import com.ss.android.lark.pb.videoconference.v1.TextMessageContent;
import com.ss.android.lark.pb.videoconference.v1.TrigPushFullMeetingInfoRequest;
import com.ss.android.lark.pb.videoconference.v1.TrigPushSelfInfoRequest;
import com.ss.android.lark.pb.videoconference.v1.TriggerPushFullVCLobbyParticipantsRequest;
import com.ss.android.lark.pb.videoconference.v1.UpdateVCLobbyParticipantRequest;
import com.ss.android.lark.pb.videoconference.v1.UpdateVCLobbyParticipantResponse;
import com.ss.android.lark.pb.videoconference.v1.UpdateVideoChatRequest;
import com.ss.android.lark.pb.videoconference.v1.UpdateVideoChatResponse;
import com.ss.android.lark.pb.videoconference.v1.VCManageApprovalRequest;
import com.ss.android.lark.pb.videoconference.v1.VCManageApprovalResponse;
import com.ss.android.lark.pb.videoconference.v1.VCSearchUserInMeetingRequest;
import com.ss.android.lark.pb.videoconference.v1.VCSearchUserInMeetingResponse;
import com.ss.android.lark.pb.videoconference.v1.VcQueryDocsRequest;
import com.ss.android.lark.pb.videoconference.v1.VcQueryDocsResponse;
import com.ss.android.lark.pb.videoconference.v1.VerifyTwoElementRequest;
import com.ss.android.lark.pb.videoconference.v1.VerifyTwoElementResponse;
import com.ss.android.lark.pb.videoconference.v1.VideoChatFeedbackRequest;
import com.ss.android.lark.pb.videoconference.v1.VideoChatFeedbackResponse;
import com.ss.android.lark.pb.videoconference.v1.VideoChatFetchLivePolicyRequest;
import com.ss.android.lark.pb.videoconference.v1.VideoChatFetchLivePolicyResponse;
import com.ss.android.lark.pb.videoconference.v1.VideoChatInfo;
import com.ss.android.lark.pb.videoconference.v1.VideoChatInteractionMessage;
import com.ss.android.lark.pb.videoconference.v1.VideoChatLiveActionRequest;
import com.ss.android.lark.pb.videoconference.v1.VideoChatLiveActionResponse;
import com.ss.android.lark.pb.videoconference.v1.VideoChatLivePreCheckRequest;
import com.ss.android.lark.pb.videoconference.v1.VideoChatLivePreCheckResponse;
import com.ss.android.lark.pb.videoconference.v1.VideoChatMeetingFeedbackRequest;
import com.ss.android.lark.pb.videoconference.v1.VideoChatMeetingFeedbackResponse;
import com.ss.android.lark.pb.videoconference.v1.VideoChatPrompt;
import com.ss.android.lark.pb.videoconference.v1.VideoChatSettings;
import com.ss.android.lark.pb.videoconference.v1.ViewUserSetting;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.vc.C60657a;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.dto.PullVCCardInfoEntity;
import com.ss.android.vc.dto.SearchResponse;
import com.ss.android.vc.dto.VideoChatSearchChatterResponse;
import com.ss.android.vc.entity.AdminSettings;
import com.ss.android.vc.entity.BaseFeedbackBean;
import com.ss.android.vc.entity.ByteViewUserInfo;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.C60933b;
import com.ss.android.vc.entity.C60939i;
import com.ss.android.vc.entity.C60946m;
import com.ss.android.vc.entity.CalendarGroupResponse;
import com.ss.android.vc.entity.CalendarInfo;
import com.ss.android.vc.entity.ChannelMeta;
import com.ss.android.vc.entity.CheckVcManageCapabilitiesEntity;
import com.ss.android.vc.entity.FeedbackBean;
import com.ss.android.vc.entity.FeedbackReasons;
import com.ss.android.vc.entity.GetAuthChattersResponse;
import com.ss.android.vc.entity.GetsuggetedParticipants;
import com.ss.android.vc.entity.InMeetingData;
import com.ss.android.vc.entity.InterpreterSetting;
import com.ss.android.vc.entity.MeetingFeedbackBean;
import com.ss.android.vc.entity.PSTNInfo;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantRole;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.QuerySource;
import com.ss.android.vc.entity.RegisterClientInfoEntity;
import com.ss.android.vc.entity.Room;
import com.ss.android.vc.entity.RtcDnsInfo;
import com.ss.android.vc.entity.ShareCardResponse;
import com.ss.android.vc.entity.VCFeatureConfig;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatConfig;
import com.ss.android.vc.entity.VideoChatH323Setting;
import com.ss.android.vc.entity.VideoChatPrompt;
import com.ss.android.vc.entity.background.C60935a;
import com.ss.android.vc.entity.background.ViewDeviceSetting;
import com.ss.android.vc.entity.background.VirtualBackground;
import com.ss.android.vc.entity.background.VirtualBackgroundInfo;
import com.ss.android.vc.entity.breakoutroom.VCBreakoutRoomJoinEntity;
import com.ss.android.vc.entity.follow.FollowGrootCellPayload;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.entity.livestream.C60943c;
import com.ss.android.vc.entity.livestream.C60944d;
import com.ss.android.vc.entity.livestream.C60945e;
import com.ss.android.vc.entity.p3092a.C60930c;
import com.ss.android.vc.entity.p3092a.C60932d;
import com.ss.android.vc.entity.parser.ModelHelper;
import com.ss.android.vc.entity.request.CreateDocEntityRequest;
import com.ss.android.vc.entity.request.HostManageRequest;
import com.ss.android.vc.entity.request.JoinCalendarGroupMeetingEntityRequest;
import com.ss.android.vc.entity.request.JoinMeetingPreCheckEntityRequest;
import com.ss.android.vc.entity.request.ManageApprovalRequest;
import com.ss.android.vc.entity.request.ParticipantSettingRequest;
import com.ss.android.vc.entity.request.RecordMeetingEntityRequest;
import com.ss.android.vc.entity.request.RegisterClientInfoEntityRequest;
import com.ss.android.vc.entity.request.ShareScreenToRoomEntityRequest;
import com.ss.android.vc.entity.request.ShareVideoChatEntityRequest;
import com.ss.android.vc.entity.request.StartByteviewHeartbeatEntityRequest;
import com.ss.android.vc.entity.request.UpdateVideoChatEntityRequest;
import com.ss.android.vc.entity.request.VideoChatLiveActionEntityRequest;
import com.ss.android.vc.entity.response.C60953a;
import com.ss.android.vc.entity.response.C60954aa;
import com.ss.android.vc.entity.response.C60955ab;
import com.ss.android.vc.entity.response.C60956ac;
import com.ss.android.vc.entity.response.C60959ae;
import com.ss.android.vc.entity.response.C60960af;
import com.ss.android.vc.entity.response.C60961ag;
import com.ss.android.vc.entity.response.C60962ah;
import com.ss.android.vc.entity.response.C60963ai;
import com.ss.android.vc.entity.response.C60965at;
import com.ss.android.vc.entity.response.C60966b;
import com.ss.android.vc.entity.response.C60970c;
import com.ss.android.vc.entity.response.C60971e;
import com.ss.android.vc.entity.response.C60972f;
import com.ss.android.vc.entity.response.C60973g;
import com.ss.android.vc.entity.response.C60974h;
import com.ss.android.vc.entity.response.C60975i;
import com.ss.android.vc.entity.response.C60976j;
import com.ss.android.vc.entity.response.C60977k;
import com.ss.android.vc.entity.response.C60978l;
import com.ss.android.vc.entity.response.C60979m;
import com.ss.android.vc.entity.response.C60980n;
import com.ss.android.vc.entity.response.C60981o;
import com.ss.android.vc.entity.response.C60982p;
import com.ss.android.vc.entity.response.C60983q;
import com.ss.android.vc.entity.response.C60984s;
import com.ss.android.vc.entity.response.C60986t;
import com.ss.android.vc.entity.response.C60987v;
import com.ss.android.vc.entity.response.C60988w;
import com.ss.android.vc.entity.response.C60989x;
import com.ss.android.vc.entity.response.C60990y;
import com.ss.android.vc.entity.response.C60991z;
import com.ss.android.vc.entity.response.CalendarVCSettingsEntity;
import com.ss.android.vc.entity.response.CheckEnterprisePhoneQuotaEntity;
import com.ss.android.vc.entity.response.GetCalendarGuestEntity;
import com.ss.android.vc.entity.response.GetPhoneNumberAttributtonEntity;
import com.ss.android.vc.entity.response.GetShareCodeInfoEntity;
import com.ss.android.vc.entity.response.GetUrlBriefsEntity;
import com.ss.android.vc.entity.response.GrootChannelEntity;
import com.ss.android.vc.entity.response.IDTypeEntity;
import com.ss.android.vc.entity.response.JoinCalendarGroupMeetingEntity;
import com.ss.android.vc.entity.response.JoinMeetingEntity;
import com.ss.android.vc.entity.response.JoinMeetingPreCheckEntity;
import com.ss.android.vc.entity.response.PullVideoChatByShareCodeEntity;
import com.ss.android.vc.entity.response.RejoinVideoChatEntity;
import com.ss.android.vc.entity.response.ReservationInfoEntity;
import com.ss.android.vc.entity.response.SearchUsersAndChatsEntity;
import com.ss.android.vc.entity.response.SetVcVirtualBackgroundEntity;
import com.ss.android.vc.entity.response.SketchStartEntity;
import com.ss.android.vc.entity.response.ak;
import com.ss.android.vc.entity.response.al;
import com.ss.android.vc.entity.response.am;
import com.ss.android.vc.entity.response.an;
import com.ss.android.vc.entity.response.ao;
import com.ss.android.vc.entity.response.ap;
import com.ss.android.vc.entity.response.aq;
import com.ss.android.vc.entity.response.as;
import com.ss.android.vc.entity.response.au;
import com.ss.android.vc.entity.response.aw;
import com.ss.android.vc.entity.response.ax;
import com.ss.android.vc.entity.response.ay;
import com.ss.android.vc.entity.response.az;
import com.ss.android.vc.entity.response.ba;
import com.ss.android.vc.entity.response.bb;
import com.ss.android.vc.entity.sketch.SketchOperationUnit;
import com.ss.android.vc.entity.tab.VCMeetingJoinInfoEntity;
import com.ss.android.vc.entity.tab.VCTabListHistoryListEntity;
import com.ss.android.vc.entity.tab.VCTabListItem;
import com.ss.android.vc.entity.tab.VcTabDetailResponse;
import com.ss.android.vc.lark.setting.C61188b;
import com.ss.android.vc.meeting.module.p3143n.p3144a.p3145a.C62530a;
import com.ss.android.vc.meeting.module.reaction.entity.InteractionMessageType;
import com.ss.android.vc.meeting.module.reaction.entity.ReactionContent;
import com.ss.android.vc.meeting.module.reaction.entity.TextContent;
import com.ss.android.vc.p3088d.p3090b.C60871a;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okio.ByteString;
import org.json.JSONException;
import org.json.JSONObject;
import videoconference.v1.UploadEquipmentInfoRequest;
import videoconference.v1.UploadEquipmentInfoResponse;

@XClass(isStatic = true)
public class VcBizSender {
    /* access modifiers changed from: private */
    /* renamed from: V */
    public static /* synthetic */ String m249127V(byte[] bArr) throws IOException {
        return "";
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public static /* synthetic */ String m249128W(byte[] bArr) throws IOException {
        return "";
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public static /* synthetic */ String m249129X(byte[] bArr) throws IOException {
        return "";
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Object m249209a(byte[] bArr) throws IOException {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ Object m249243b(byte[] bArr) throws IOException {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static /* synthetic */ String m249304n(byte[] bArr) throws IOException {
        return "";
    }

    /* renamed from: a */
    public static VcBizTask<RegisterClientInfoEntity> m249146a(Participant.Status status, boolean z, RegisterClientInfoEntityRequest.SourceType sourceType) {
        return new VcBizTask<>(Command.REGISTER_CLIENT_INFO, new RegisterClientInfoRequest.C50962a().mo176009a(Participant.Status.fromValue(status.getNumber())).mo176011a(Boolean.valueOf(z)).mo176010a(RegisterClientInfoRequest.SourceType.fromValue(sourceType.getNumber())), new SdkSender.IParser<RegisterClientInfoEntity>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass18 */

            /* renamed from: a */
            public RegisterClientInfoEntity parse(byte[] bArr) throws IOException {
                return C60932d.m237036a(RegisterClientInfoResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<JoinCalendarGroupMeetingEntity> m249151a(JoinCalendarGroupMeetingEntityRequest.EntrySource entrySource, String str, ParticipantType participantType, ParticipantSettings participantSettings, boolean z) {
        return new VcBizTask<>(Command.JOIN_CALENDAR_GROUP_MEETING, new JoinCalendarGroupMeetingRequest.C50811a().mo175643a(JoinCalendarGroupMeetingRequest.EntrySource.fromValue(entrySource.getNumber())).mo175647a(str).mo175645a(com.ss.android.lark.pb.videoconference.v1.ParticipantType.fromValue(participantType.getNumber())).mo175646a(Boolean.valueOf(z)).mo175644a(new ParticipantSettings.C50910a().mo175878b(Boolean.valueOf(participantSettings.isCameraMuted())).mo175874a(Boolean.valueOf(participantSettings.isMicrophoneMuted())).mo175877b(ParticipantSettings.EquipmentStatus.fromValue(participantSettings.getCameraStatus().ordinal())).mo175872a(ParticipantSettings.EquipmentStatus.fromValue(participantSettings.getMicrophoneStatus().ordinal())).build()), new SdkSender.IParser<JoinCalendarGroupMeetingEntity>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass29 */

            /* renamed from: a */
            public JoinCalendarGroupMeetingEntity parse(byte[] bArr) throws IOException {
                return C60930c.m236911a(JoinCalendarGroupMeetingResponse.ADAPTER.decode(bArr));
            }
        }, true);
    }

    /* renamed from: a */
    public static VcBizTask<VideoChat> m249163a(String str, VideoChat.Type type, List<String> list, int i, String str2, long j, boolean z, boolean z2, boolean z3, boolean z4, String str3) {
        VideoChatSettings a = new VideoChatSettings.C51286a().mo176809b(false).mo176806a((Boolean) false).mo176807a(str).build();
        return new VcBizTask<>(Command.CREATE_VIDEO_CHAT, new CreateVideoChatRequest.C50521a().mo174973a(list).mo174968a(VideoChatInfo.Type.fromValue(type.getNumber())).mo174972a(str).mo174969a(VideoChatInfo.VendorType.fromValue(i)).mo174970a(a).mo174967a(new ParticipantSettings.C50910a().mo175878b(Boolean.valueOf(z3)).mo175874a(Boolean.valueOf(z4)).mo175877b(ParticipantSettings.EquipmentStatus.UNKNOWN).mo175872a(ParticipantSettings.EquipmentStatus.UNKNOWN).build()).mo174976b(str2).mo174966a(new ActionTime.C50455a().mo174807a(Long.valueOf(j)).build()).mo174971a(Boolean.valueOf(z)).mo174975b(Boolean.valueOf(z2)).mo174977c(str3), new SdkSender.IParser<VideoChat>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass40 */

            /* renamed from: a */
            public VideoChat parse(byte[] bArr) throws IOException {
                return C60932d.m237040a(VideoChatInfo.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<JoinMeetingEntity> m249196a(String str, boolean z, VideoChat.Type type, String str2, long j, boolean z2, boolean z3) {
        VideoChatSettings a = new VideoChatSettings.C51286a().mo176809b(false).mo176806a((Boolean) false).mo176807a(z ? null : str).build();
        com.ss.android.lark.pb.videoconference.v1.ParticipantSettings a2 = new ParticipantSettings.C50910a().mo175878b(Boolean.valueOf(z2)).mo175874a(Boolean.valueOf(z3)).mo175877b(ParticipantSettings.EquipmentStatus.UNKNOWN).mo175872a(ParticipantSettings.EquipmentStatus.UNKNOWN).build();
        JoinMeetingRequest.Invitee invitee = new JoinMeetingRequest.Invitee(Collections.EMPTY_LIST, Collections.EMPTY_LIST);
        JoinMeetingRequest.Handle handle = new JoinMeetingRequest.Handle(null, null, str2, null, null, null, null);
        JoinMeetingRequest.CreationMetaData creationMetaData = new JoinMeetingRequest.CreationMetaData(VideoChatInfo.Type.fromValue(type.getNumber()), str, new ActionTime.C50455a().mo174807a(Long.valueOf(j)).build(), a, null, null, null);
        JoinMeetingRequest.SelfParticipantInfo selfParticipantInfo = new JoinMeetingRequest.SelfParticipantInfo(com.ss.android.lark.pb.videoconference.v1.ParticipantType.LARK_USER, a2);
        JoinMeetingRequest.C50837a aVar = new JoinMeetingRequest.C50837a();
        aVar.mo175712a(JoinMeetingRequest.JoinType.JOIN_VC_VIA_GROUP_ID);
        aVar.mo175711a(invitee);
        aVar.mo175710a(handle);
        aVar.mo175713a(selfParticipantInfo);
        aVar.mo175709a(creationMetaData);
        return new VcBizTask<>(Command.JOIN_MEETING, aVar, new SdkSender.IParser<JoinMeetingEntity>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass51 */

            /* renamed from: a */
            public JoinMeetingEntity parse(byte[] bArr) throws IOException {
                return C60930c.m236912a(JoinMeetingResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<ax> m249155a(UpdateVideoChatEntityRequest.Action action, String str) {
        UpdateVideoChatRequest.C51140a aVar = new UpdateVideoChatRequest.C51140a();
        aVar.mo176450a(UpdateVideoChatRequest.Action.fromValue(action.getNumber()));
        aVar.mo176452a(str);
        return new VcBizTask<>(Command.UPDATE_VIDEO_CHAT, aVar, new SdkSender.IParser<ax>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass71 */

            /* renamed from: a */
            public ax parse(byte[] bArr) throws IOException {
                return C60930c.m236942a(UpdateVideoChatResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<RejoinVideoChatEntity> m249195a(String str, boolean z) {
        return new VcBizTask<>(Command.REJOIN_VIDEO_CHAT, new RejoinVideoChatRequest.C50966a().mo176021a(str).mo176020a(Boolean.valueOf(z)), new SdkSender.IParser<RejoinVideoChatEntity>() {
            /* class com.ss.android.vc.net.request.VcBizSender.C635862 */

            /* renamed from: a */
            public RejoinVideoChatEntity parse(byte[] bArr) throws IOException {
                RejoinVideoChatEntity a = C60930c.m236915a(RejoinVideoChatResponse.ADAPTER.decode(bArr));
                if (a == null) {
                    return null;
                }
                return a;
            }
        }, true);
    }

    /* renamed from: a */
    public static VcBizTask<String> m249144a(FeedbackBean feedbackBean) {
        if (feedbackBean == null || feedbackBean.meetingId == null || feedbackBean.quatity == null || feedbackBean.sdkVersion == null || feedbackBean.larkVersion == null) {
            return null;
        }
        VideoChatFeedbackRequest.C51232a d = new VideoChatFeedbackRequest.C51232a().mo176665a(feedbackBean.meetingId).mo176663a(VideoChatFeedbackRequest.Network.fromValue(feedbackBean.network.getNumber())).mo176664a(VideoChatFeedbackRequest.Quality.fromValue(feedbackBean.quatity.getNumber())).mo176670c(feedbackBean.sdkVersion).mo176671d(feedbackBean.larkVersion);
        if (feedbackBean.quatity == BaseFeedbackBean.Quality.BAD) {
            if (feedbackBean.otherReason != null) {
                d.mo176668b(feedbackBean.otherReason);
            }
            if (feedbackBean.audioVideoFeedback != null) {
                d.mo176666a(feedbackBean.audioVideoFeedback.reasonSubkeys);
            }
            if (feedbackBean.shareScreenFeedback != null) {
                d.mo176669b(feedbackBean.shareScreenFeedback.reasonSubkeys);
            }
        }
        return new VcBizTask<>(Command.PUT_FEEDBACKS, d, new SdkSender.IParser<String>() {
            /* class com.ss.android.vc.net.request.VcBizSender.C635939 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                VideoChatFeedbackResponse decode = VideoChatFeedbackResponse.ADAPTER.decode(bArr);
                if (decode == null) {
                    return null;
                }
                return decode.toString();
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<String> m249145a(MeetingFeedbackBean meetingFeedbackBean) {
        VideoChatMeetingFeedbackRequest.ShareScreenFeedback shareScreenFeedback = null;
        if (meetingFeedbackBean == null || meetingFeedbackBean.meetingId == null || meetingFeedbackBean.quatity == null || meetingFeedbackBean.sdkVersion == null || meetingFeedbackBean.larkVersion == null) {
            return null;
        }
        VideoChatMeetingFeedbackRequest.AudioVideoFeedback audioVideoFeedback = meetingFeedbackBean.audioVideoFeedback != null ? new VideoChatMeetingFeedbackRequest.AudioVideoFeedback(meetingFeedbackBean.audioVideoFeedback.reasonSubkeys, meetingFeedbackBean.audioVideoFeedback.otherReason) : null;
        if (meetingFeedbackBean.shareScreenFeedback != null) {
            shareScreenFeedback = new VideoChatMeetingFeedbackRequest.ShareScreenFeedback(meetingFeedbackBean.shareScreenFeedback.reasonSubkeys, meetingFeedbackBean.shareScreenFeedback.otherReason);
        }
        return new VcBizTask<>(Command.PUT_VIDEO_CHAT_FEEDBACKS, new VideoChatMeetingFeedbackRequest.C51266a().mo176756a(meetingFeedbackBean.meetingId).mo176758b(meetingFeedbackBean.sdkVersion).mo176760d(meetingFeedbackBean.larkVersion).mo176753a(VideoChatMeetingFeedbackRequest.NetworkType.fromValue(meetingFeedbackBean.network.getNumber())).mo176755a(VideoChatMeetingFeedbackRequest.VideoChatMeetingQuality.fromValue(meetingFeedbackBean.quatity.getNumber())).mo176752a(audioVideoFeedback).mo176754a(shareScreenFeedback).mo176759c(meetingFeedbackBean.otherReason), new SdkSender.IParser<String>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass10 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                VideoChatMeetingFeedbackResponse decode = VideoChatMeetingFeedbackResponse.ADAPTER.decode(bArr);
                if (decode == null) {
                    return null;
                }
                return decode.toString();
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<Map<String, Room>> m249200a(List<String> list) {
        return new VcBizTask<>(Command.MGET_ROOMS, new MGetRoomsRequest.C50851a().mo175742a(list), $$Lambda$VcBizSender$xd_mD8dqdfQeAOk24Ia7HN5_ho4.INSTANCE);
    }

    /* renamed from: a */
    public static void m249219a(String str, AbstractC63598b<String> bVar) {
        GetRoomStatusByShareCodeRequest.C50346a aVar = new GetRoomStatusByShareCodeRequest.C50346a();
        aVar.mo174580a(str);
        new VcBizTask(com.ss.android.lark.pb.improto.Command.GET_ROOM_STATUS_BY_SHARE_CODE, aVar, $$Lambda$VcBizSender$IstYTjMC_pmsHbBcw6w3Rc5iIXM.INSTANCE).mo219889a(bVar);
    }

    /* renamed from: a */
    public static VcBizTask<C60974h> m249178a(String str, String str2) {
        CreateEnterprisePhoneRequest.C50286a aVar = new CreateEnterprisePhoneRequest.C50286a();
        aVar.mo174448a(str);
        if (!TextUtils.isEmpty(str2)) {
            aVar.mo174450b(str2);
        }
        return new VcBizTask<>(com.ss.android.lark.pb.improto.Command.CREATE_ENTERPRISE_PHONE, aVar, $$Lambda$VcBizSender$4TiCYVXEgX_jeaC2Z2S2uvbKc3Q.INSTANCE);
    }

    /* renamed from: a */
    public static VcBizTask<C60974h> m249158a(String str) {
        CreateEnterprisePhoneRequest.C50286a aVar = new CreateEnterprisePhoneRequest.C50286a();
        aVar.mo174448a("");
        if (!TextUtils.isEmpty(str)) {
            aVar.mo174451c(str);
        }
        return new VcBizTask<>(com.ss.android.lark.pb.improto.Command.CREATE_ENTERPRISE_PHONE, aVar, $$Lambda$VcBizSender$08IK8ArEpnDgnA3Ryhr3mliMPIA.INSTANCE);
    }

    /* renamed from: b */
    public static VcBizTask<C60970c> m249231b(String str, String str2) {
        CancelEnterprisePhoneRequest.C50278a aVar = new CancelEnterprisePhoneRequest.C50278a();
        aVar.mo174430a(str).mo174432b(str2).build();
        return new VcBizTask<>(com.ss.android.lark.pb.improto.Command.CANCEL_ENTERPRISE_PHONE, aVar, $$Lambda$VcBizSender$rEVQya8NbPQQXpPV1ltzvQ9qUT4.INSTANCE);
    }

    /* renamed from: a */
    public static void m249217a(AbstractC63598b<C60980n> bVar) {
        new VcBizTask(com.ss.android.lark.pb.improto.Command.GET_ENTERPRISE_PHONE_CONFIG, new GetEnterprisePhoneConfigRequest.C50318a(), $$Lambda$VcBizSender$Ygnuz3F9gooHeYSRufB9XQQt3UQ.INSTANCE).mo219893b(bVar);
    }

    /* renamed from: a */
    public static VcBizTask<String> m249150a(HostManageRequest hostManageRequest) {
        HostManageRequest.C50749a aVar = new HostManageRequest.C50749a();
        aVar.mo175494a(HostManageRequest.Action.fromValue(hostManageRequest.getAction().getNumber()));
        aVar.mo175498a(Boolean.valueOf(hostManageRequest.isMuted()));
        if (hostManageRequest.getSecuritySetting() != null) {
            aVar.mo175497a(C60930c.m236824a(hostManageRequest.getSecuritySetting()));
        }
        if (!TextUtils.isEmpty(hostManageRequest.getBreakoutRoomId())) {
            aVar.f126531t = hostManageRequest.getBreakoutRoomId();
        }
        if (hostManageRequest.getBreakoutRoomManage() != null) {
            aVar.mo175493a(C60930c.m236804a(hostManageRequest.getBreakoutRoomManage()));
        }
        aVar.mo175501b(Boolean.valueOf(hostManageRequest.isMuteOnEntry()));
        aVar.mo175506d(hostManageRequest.getTopic());
        aVar.mo175499a(hostManageRequest.getMeetingId());
        aVar.mo175502b(hostManageRequest.getParticipantId());
        aVar.mo175504c(hostManageRequest.getParticipantDeviceId());
        aVar.mo175508e(hostManageRequest.getGlobalSpokenLanguage());
        aVar.mo175503c(hostManageRequest.getAllowPartiUnmute());
        aVar.mo175505d(Boolean.valueOf(hostManageRequest.getOnlyHostCanShare()));
        aVar.mo175507e(Boolean.valueOf(hostManageRequest.getOnlyHostCanReplaceShare()));
        aVar.mo175509f(Boolean.valueOf(hostManageRequest.getOnlyPresenterCanAnnotate()));
        if (hostManageRequest.getParticipantType() != null) {
            aVar.mo175496a(com.ss.android.lark.pb.videoconference.v1.ParticipantType.fromValue(hostManageRequest.getParticipantType().getNumber()));
        }
        if (hostManageRequest.getCoHostAction() != null) {
            aVar.mo175495a(HostManageRequest.SetCoHostAction.fromValue(hostManageRequest.getCoHostAction().getNumber()));
        }
        if (hostManageRequest.getInterpretationSetting() != null) {
            aVar.f126527p = C60930c.m236812a(hostManageRequest.getInterpretationSetting());
        }
        return new VcBizTask<>(Command.HOST_MANAGE, aVar, new SdkSender.IParser<String>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass11 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                HostManageResponse decode = HostManageResponse.ADAPTER.decode(bArr);
                if (decode == null) {
                    return null;
                }
                return decode.toString();
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<String> m249198a(String str, boolean z, boolean z2, boolean z3) {
        ParticipantSettings.C50910a aVar = new ParticipantSettings.C50910a();
        aVar.mo175878b(Boolean.valueOf(z));
        if (z3) {
            aVar.mo175877b(ParticipantSettings.EquipmentStatus.NORMAL);
        } else {
            aVar.mo175877b(ParticipantSettings.EquipmentStatus.NO_PERMISSION);
        }
        ParticipantChangeSettingsRequest.C50906a aVar2 = new ParticipantChangeSettingsRequest.C50906a();
        aVar2.mo175861a(str);
        aVar2.mo175859a(aVar.build());
        aVar2.mo175860a(Boolean.valueOf(z2));
        return new VcBizTask<>(Command.PARTICIPANT_CHANGE_SETTINGS, aVar2, new SdkSender.IParser<String>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass12 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                ParticipantChangeSettingsResponse decode = ParticipantChangeSettingsResponse.ADAPTER.decode(bArr);
                if (decode == null) {
                    return null;
                }
                return decode.toString();
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<String> m249192a(String str, String str2, boolean z, boolean z2, boolean z3) {
        ParticipantSettings.C50910a aVar = new ParticipantSettings.C50910a();
        if (z3) {
            aVar.mo175872a(ParticipantSettings.EquipmentStatus.NORMAL);
        } else {
            aVar.mo175872a(ParticipantSettings.EquipmentStatus.NO_PERMISSION);
        }
        aVar.mo175874a(Boolean.valueOf(z));
        ParticipantChangeSettingsRequest.C50906a aVar2 = new ParticipantChangeSettingsRequest.C50906a();
        aVar2.mo175861a(str);
        if (!TextUtils.isEmpty(str2)) {
            aVar2.mo175863b(str2);
        }
        aVar2.mo175859a(aVar.build());
        aVar2.mo175860a(Boolean.valueOf(z2));
        return new VcBizTask<>(Command.PARTICIPANT_CHANGE_SETTINGS, aVar2, new SdkSender.IParser<String>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass13 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                ParticipantChangeSettingsResponse decode = ParticipantChangeSettingsResponse.ADAPTER.decode(bArr);
                if (decode == null) {
                    return null;
                }
                return decode.toString();
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<String> m249153a(ParticipantSettingRequest participantSettingRequest, String str) {
        ParticipantSettings.C50910a aVar = new ParticipantSettings.C50910a();
        aVar.mo175878b(Boolean.valueOf(participantSettingRequest.getParticipantSettings().isCameraMuted()));
        aVar.mo175874a(Boolean.valueOf(participantSettingRequest.getParticipantSettings().isMicrophoneMuted()));
        aVar.mo175872a(ModelHelper.m236798a(participantSettingRequest.getParticipantSettings().getMicrophoneStatus()));
        aVar.mo175877b(ModelHelper.m236798a(participantSettingRequest.getParticipantSettings().getCameraStatus()));
        if (participantSettingRequest.getParticipantSettings().getHandsStatus() != null) {
            aVar.mo175873a(ParticipantSettings.HandsStatus.fromValue(participantSettingRequest.getParticipantSettings().getHandsStatus().getNumber()));
        }
        ParticipantChangeSettingsRequest.C50906a aVar2 = new ParticipantChangeSettingsRequest.C50906a();
        aVar2.mo175861a(participantSettingRequest.getMeetingId());
        aVar2.mo175859a(aVar.build());
        if (!TextUtils.isEmpty(str)) {
            aVar2.mo175863b(str);
        }
        return new VcBizTask<>(Command.PARTICIPANT_CHANGE_SETTINGS, aVar2, new SdkSender.IParser<String>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass14 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                ParticipantChangeSettingsResponse decode = ParticipantChangeSettingsResponse.ADAPTER.decode(bArr);
                if (decode == null) {
                    return null;
                }
                return decode.toString();
            }
        });
    }

    /* renamed from: a */
    public static void m249216a(VideoChat videoChat, boolean z) {
        StartByteviewPollingRequest.ServiceType serviceType;
        if (videoChat == null) {
            C60871a.m236612c("VcBizSender", "[startPolling] videochat is null");
        } else if (aj.m95021b(videoChat.getId())) {
            C60871a.m236612c("VcBizSender", "[startPolling] videochat.getID is blank");
        } else {
            if (z) {
                serviceType = StartByteviewPollingRequest.ServiceType.CALLING;
            } else {
                serviceType = StartByteviewPollingRequest.ServiceType.RINGING;
            }
            new VcBizTask(Command.START_BYTEVIEW_POLLING, new StartByteviewPollingRequest.C51092a().mo176335a(videoChat.getId()).mo176334a(serviceType), new SdkSender.IParser<String>() {
                /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass15 */

                /* renamed from: a */
                public String parse(byte[] bArr) throws IOException {
                    return "";
                }
            }).mo219893b(new C63594a("startPolling"));
        }
    }

    /* renamed from: b */
    public static void m249245b(VideoChat videoChat, boolean z) {
        StartByteviewPollingRequest.ServiceType serviceType;
        if (z) {
            serviceType = StartByteviewPollingRequest.ServiceType.CALLING;
        } else {
            serviceType = StartByteviewPollingRequest.ServiceType.RINGING;
        }
        StopByteviewPollingRequest.C51100a a = new StopByteviewPollingRequest.C51100a().mo176355a(serviceType);
        if (videoChat != null && !aj.m95021b(videoChat.getId())) {
            a.mo176356a(videoChat.getId());
        }
        new VcBizTask(Command.STOP_BYTEVIEW_POLLING, a, new SdkSender.IParser<String>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass16 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                return "";
            }
        }).mo219893b(new C63594a("stopPolling"));
    }

    /* renamed from: b */
    public static VcBizTask<JoinMeetingEntity> m249237b(String str, boolean z, boolean z2, boolean z3) {
        ParticipantSettings.C50910a aVar = new ParticipantSettings.C50910a();
        aVar.mo175878b(Boolean.valueOf(z)).mo175874a(Boolean.valueOf(z2));
        JoinMeetingRequest.Invitee invitee = new JoinMeetingRequest.Invitee(Collections.EMPTY_LIST, Collections.EMPTY_LIST);
        JoinMeetingRequest.Handle handle = new JoinMeetingRequest.Handle(str, null, null, null, null, null, null);
        JoinMeetingRequest.CreationMetaData creationMetaData = new JoinMeetingRequest.CreationMetaData(null, null, null, null, null, null, null);
        JoinMeetingRequest.SelfParticipantInfo selfParticipantInfo = new JoinMeetingRequest.SelfParticipantInfo(com.ss.android.lark.pb.videoconference.v1.ParticipantType.LARK_USER, aVar.build());
        JoinMeetingRequest.C50837a aVar2 = new JoinMeetingRequest.C50837a();
        aVar2.mo175712a(JoinMeetingRequest.JoinType.JOIN_VC_VIA_MEETING_ID);
        aVar2.mo175711a(invitee);
        aVar2.mo175710a(handle);
        aVar2.mo175713a(selfParticipantInfo);
        aVar2.mo175709a(creationMetaData);
        return new VcBizTask<>(Command.JOIN_MEETING, aVar2, new SdkSender.IParser<JoinMeetingEntity>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass17 */

            /* renamed from: a */
            public JoinMeetingEntity parse(byte[] bArr) throws IOException {
                return C60930c.m236912a(JoinMeetingResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: a */
    public static void m249214a(VideoChat videoChat, VideoChatConfig videoChatConfig, StartByteviewHeartbeatEntityRequest.ServiceType serviceType) {
        if (videoChatConfig == null) {
            C60871a.m236612c("VcBizSender", "[startHeartbeat] videoChatConfig is null");
        } else if (videoChat == null) {
            C60871a.m236612c("VcBizSender", "[startHeartbeat] videoChat is null");
        } else {
            C60871a.m236611b("VcBizSender", "[startHeartbeat]");
            int i = 15;
            int i2 = 60;
            if (serviceType == StartByteviewHeartbeatEntityRequest.ServiceType.VC) {
                if (videoChat.getType().getNumber() == VideoChat.Type.CALL.getNumber()) {
                    i = videoChatConfig.getCallHeartbeatCycle();
                    i2 = videoChatConfig.getCallHeartbeatExpireTime();
                } else if (videoChat.getType().getNumber() == VideoChat.Type.MEET.getNumber()) {
                    i = videoChatConfig.getMeetingHeartbeatCycle();
                    i2 = videoChatConfig.getMeetingHeartbeatExpireTime();
                }
            } else if (serviceType == StartByteviewHeartbeatEntityRequest.ServiceType.VCLOBBY) {
                i = videoChatConfig.getLobbyHeartbeatCycle();
                i2 = videoChatConfig.getLobbyHeartbeatExpiredTime();
            }
            new VcBizTask(Command.START_BYTEVIEW_HEARTBEAT, new StartByteviewHeartbeatRequest.C51088a().mo176322a(StartByteviewHeartbeatRequest.ServiceType.fromValue(serviceType.getValue())).mo176323a(Integer.valueOf(i)).mo176326b(Integer.valueOf(i2)).mo176324a(videoChat.getId()), $$Lambda$VcBizSender$hFzhHojL6liSad2gS3aMXwZCxSQ.INSTANCE).mo219893b(new C63594a("startHeartbeat"));
        }
    }

    /* renamed from: a */
    public static void m249215a(VideoChat videoChat, StartByteviewHeartbeatEntityRequest.ServiceType serviceType) {
        if (videoChat == null) {
            C60871a.m236612c("VcBizSender", "[stopHeartbeat] videoChat is null");
            return;
        }
        C60871a.m236611b("VcBizSender", "[stopHeartbeat]");
        new VcBizTask(Command.STOP_BYTEVIEW_HEARTBEAT, new StopByteviewHeartbeatRequest.C51096a().mo176345a(StartByteviewHeartbeatRequest.ServiceType.fromValue(serviceType.getValue())).mo176346a(videoChat.getId()), $$Lambda$VcBizSender$I3BP1dxKVy4Fpitrx2OixqBu3xU.INSTANCE).mo219893b(new C63594a("stopHeartbeat"));
    }

    /* renamed from: a */
    public static VcBizTask<String> m249202a(List<String> list, List<String> list2, String str) {
        return new VcBizTask<>(Command.INVITE_VIDEO_CHAT, new InviteVideoChatRequest.C50807a().mo175632a(list).mo175634b(list2).mo175631a(str), new SdkSender.IParser<String>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass20 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                return "";
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<C60955ab> m249201a(List<PSTNInfo> list, String str) {
        ArrayList arrayList = new ArrayList();
        for (PSTNInfo pSTNInfo : list) {
            arrayList.add(new PSTNInfo.C50896a().mo175836a(pSTNInfo.mainAddress).mo175838b(pSTNInfo.subAddress).mo175835a(com.ss.android.lark.pb.videoconference.v1.ParticipantType.fromValue(pSTNInfo.participantType.getNumber())).mo175839c(pSTNInfo.displayName).build());
        }
        return new VcBizTask<>(Command.INVITE_VIDEO_CHAT, new InviteVideoChatRequest.C50807a().mo175635c(arrayList).mo175631a(str), new SdkSender.IParser<C60955ab>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass21 */

            /* renamed from: a */
            public C60955ab parse(byte[] bArr) throws IOException {
                return C60930c.m236926a(InviteVideoChatResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: b */
    public static VcBizTask<String> m249240b(List<ByteviewUser> list, String str) {
        UpdateVideoChatRequest.C51140a a = new UpdateVideoChatRequest.C51140a().mo176450a(UpdateVideoChatRequest.Action.CANCEL).mo176452a(str);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        for (ByteviewUser byteviewUser : list) {
            ParticipantType participantType = byteviewUser.getParticipantType();
            if (participantType == ParticipantType.ROOM) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(byteviewUser.getUserId());
            } else if (participantType == ParticipantType.PSTN_USER || participantType == ParticipantType.SIP_USER) {
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                }
                arrayList3.add(byteviewUser.getUserId());
            } else {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(byteviewUser.getUserId());
            }
        }
        if (!CollectionUtils.isEmpty(arrayList)) {
            a.mo176453a(arrayList);
        }
        if (!CollectionUtils.isEmpty(arrayList2)) {
            a.mo176456b(arrayList2);
        }
        if (!CollectionUtils.isEmpty(arrayList3)) {
            a.mo176457c(arrayList3);
        }
        a.mo176458d(C60930c.m237016k(list));
        return new VcBizTask<>(Command.UPDATE_VIDEO_CHAT, a, $$Lambda$VcBizSender$aPBmFscZm33FJTblQbOiVO_QdKQ.INSTANCE);
    }

    /* renamed from: a */
    public static VcBizTask<ShareCardResponse> m249193a(String str, List<String> list, List<String> list2, ShareVideoChatEntityRequest.ShareFrom shareFrom, String str2) {
        ShareVideoChatRequest.C51054a a = new ShareVideoChatRequest.C51054a().mo176246a(str).mo176247a(list).mo176250b(list2).mo176245a(ShareVideoChatRequest.ShareFrom.fromValue(shareFrom.getNumber()));
        if (!TextUtils.isEmpty(str2)) {
            a.f127136d = str2;
        }
        return new VcBizTask<>(Command.SHARE_VIDEO_CHAT, a, new SdkSender.IParser<ShareCardResponse>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass22 */

            /* renamed from: a */
            public ShareCardResponse parse(byte[] bArr) throws IOException {
                ShareVideoChatResponse decode = ShareVideoChatResponse.ADAPTER.decode(bArr);
                ShareCardResponse shareCardResponse = new ShareCardResponse();
                if (decode != null) {
                    shareCardResponse.setBannedGroupIds(decode.banned_group_ids);
                    shareCardResponse.setTargetUserPermissions(ShareCardResponse.TargetUserPermissions.valueOf(decode.target_user_permissions.getValue()));
                }
                return shareCardResponse;
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<C60978l> m249175a(String str, IDTypeEntity iDTypeEntity, boolean z) {
        GetAssociatedVideoChatRequest.C50601a aVar = new GetAssociatedVideoChatRequest.C50601a();
        aVar.mo175171a(str);
        aVar.mo175169a(IDType.fromValue(iDTypeEntity.getNumber()));
        aVar.mo175170a(Boolean.valueOf(z));
        return new VcBizTask<>(Command.GET_ASSOCIATED_VC, aVar, new SdkSender.IParser<C60978l>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass23 */

            /* renamed from: a */
            public C60978l parse(byte[] bArr) throws IOException {
                return C60930c.m236953a(GetAssociatedVideoChatResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: b */
    public static VcBizTask<CalendarGroupResponse> m249236b(String str, boolean z) {
        return new VcBizTask<>(Command.GET_CALENDAR_GROUP, new GetCalendarGroupRequest.C50609a().mo175191a(str).mo175190a(Boolean.valueOf(z)), $$Lambda$VcBizSender$qEhJ0ybKK680WKSUxYMlAjhowls.INSTANCE);
    }

    /* renamed from: a */
    public static VcBizTask<JoinMeetingEntity> m249199a(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        JoinMeetingRequest.C50837a a = m249133a(z, z2, z3, z4);
        a.mo175712a(JoinMeetingRequest.JoinType.JOIN_VC_VIA_MEETING_ID);
        a.mo175710a(new JoinMeetingRequest.Handle(str, null, null, null, null, null, null));
        return new VcBizTask<>(Command.JOIN_MEETING, a, new SdkSender.IParser<JoinMeetingEntity>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass26 */

            /* renamed from: a */
            public JoinMeetingEntity parse(byte[] bArr) throws IOException {
                return C60930c.m236912a(JoinMeetingResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: b */
    public static VcBizTask<JoinMeetingEntity> m249238b(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        JoinMeetingRequest.C50837a a = m249133a(z, z2, z3, z4);
        a.mo175712a(JoinMeetingRequest.JoinType.JOIN_VC_VIA_MEETING_NUMBER);
        a.mo175710a(new JoinMeetingRequest.Handle(null, str, null, null, null, null, null));
        return new VcBizTask<>(Command.JOIN_MEETING, a, new SdkSender.IParser<JoinMeetingEntity>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass27 */

            /* renamed from: a */
            public JoinMeetingEntity parse(byte[] bArr) throws IOException {
                return C60930c.m236912a(JoinMeetingResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<JoinMeetingEntity> m249206a(boolean z, String str, String str2, boolean z2, boolean z3, boolean z4, boolean z5) {
        JoinMeetingRequest.C50837a a = m249132a(z2, z3, z, str, z4, z5);
        a.mo175712a(JoinMeetingRequest.JoinType.JOIN_VC_VIA_MEETING_NUMBER);
        a.mo175710a(new JoinMeetingRequest.Handle(null, str2, null, null, null, null, null));
        return new VcBizTask<>(Command.JOIN_MEETING, a, new SdkSender.IParser<JoinMeetingEntity>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass28 */

            /* renamed from: a */
            public JoinMeetingEntity parse(byte[] bArr) throws IOException {
                return C60930c.m236912a(JoinMeetingResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<JoinMeetingEntity> m249208a(boolean z, boolean z2, String str, boolean z3, boolean z4) {
        JoinMeetingRequest.C50837a a = m249133a(z, z2, z3, z4);
        a.mo175712a(JoinMeetingRequest.JoinType.JOIN_VC_VIA_RESERVE_ID);
        a.mo175710a(new JoinMeetingRequest.Handle(null, null, null, str, null, null, null));
        return new VcBizTask<>(Command.JOIN_MEETING, a, new SdkSender.IParser<JoinMeetingEntity>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass30 */

            /* renamed from: a */
            public JoinMeetingEntity parse(byte[] bArr) throws IOException {
                return C60930c.m236912a(JoinMeetingResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<String> m249194a(final String str, Map<String, String> map) {
        return new VcBizTask<>(Command.GET_VIEW_I18N_TEMPLATE, new GetViewI18nTemplateRequest.C50725a().mo175438a(Arrays.asList(str)), new SdkSender.IParser<String>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass34 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                GetViewI18nTemplateResponse decode = GetViewI18nTemplateResponse.ADAPTER.decode(bArr);
                if (decode != null && decode.templates != null) {
                    return decode.templates.get(str);
                }
                C60871a.m236612c("VcBizSender", "GetViewI18nTemplateResponse: response or template is empty");
                return "";
            }
        }, true);
    }

    /* renamed from: a */
    public static VcBizTask<Map<String, String>> m249203a(List<String> list, Map<String, String> map) {
        return new VcBizTask<>(Command.GET_VIEW_I18N_TEMPLATE, new GetViewI18nTemplateRequest.C50725a().mo175438a(list), $$Lambda$VcBizSender$7dlG7Pm2rXAZulC2lrlswrK0ww.INSTANCE, true);
    }

    /* renamed from: b */
    public static VcBizTask<String> m249235b(final String str, final Map<String, String> map) {
        return new VcBizTask<>(Command.GET_VIEW_I18N_TEMPLATE, new GetViewI18nTemplateRequest.C50725a().mo175438a(Arrays.asList(str)), new SdkSender.IParser<String>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass35 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                String str;
                GetViewI18nTemplateResponse decode = GetViewI18nTemplateResponse.ADAPTER.decode(bArr);
                if (decode == null || decode.templates == null) {
                    C60871a.m236612c("VcBizSender", "GetViewI18nTemplateResponse: response or template is empty");
                    return "";
                }
                String str2 = decode.templates.get(str);
                if (TextUtils.isEmpty(str2)) {
                    C60871a.m236611b("VcBizSender", "GetViewI18nTemplateResponse, no such key: " + str);
                    return "";
                }
                Matcher matcher = Pattern.compile("\\{\\{[0-9a-zA-Z_]+\\}\\}").matcher(str2);
                String str3 = str2;
                while (matcher.find()) {
                    String group = matcher.group();
                    String substring = str2.substring(matcher.start() + 2, matcher.end() - 2);
                    Map map = map;
                    if (map == null || !map.containsKey(substring)) {
                        Context a = ar.m236694a();
                        Resources resources = a.getResources();
                        int identifier = resources.getIdentifier(substring, "string", a.getPackageName());
                        if (identifier == 0) {
                            str = "";
                        } else {
                            str = resources.getString(identifier);
                        }
                    } else {
                        str = (String) map.get(substring);
                    }
                    str3 = str3.replace(group, str);
                }
                return str3;
            }
        }, true);
    }

    /* renamed from: b */
    public static VcBizTask<List<String>> m249241b(List<String> list, Map<String, String> map) {
        return new VcBizTask<>(Command.GET_VIEW_I18N_TEMPLATE, new GetViewI18nTemplateRequest.C50725a().mo175438a(list), new SdkSender.IParser(list, map) {
            /* class com.ss.android.vc.net.request.$$Lambda$VcBizSender$n4ePDS1gfWa1A1aT2Nbiev2vUw8 */
            public final /* synthetic */ List f$0;
            public final /* synthetic */ Map f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return VcBizSender.m249211a(this.f$0, this.f$1, bArr);
            }
        }, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ List m249211a(List list, Map map, byte[] bArr) throws IOException {
        String str;
        GetViewI18nTemplateResponse decode = GetViewI18nTemplateResponse.ADAPTER.decode(bArr);
        ArrayList arrayList = new ArrayList();
        if (decode == null || decode.templates == null) {
            C60871a.m236612c("VcBizSender", "GetViewI18nTemplateResponse: response or template is empty");
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String str3 = decode.templates.get(str2);
                C60871a.m236609a("VcBizSender", "GetViewI18nTemplateResponse, template: " + str3);
                if (TextUtils.isEmpty(str3)) {
                    C60871a.m236611b("VcBizSender", "GetViewI18nTemplateResponse, no such key: " + str2);
                    arrayList.add("");
                } else {
                    Matcher matcher = Pattern.compile("\\{\\{[0-9a-zA-Z_]+\\}\\}").matcher(str3);
                    String str4 = str3;
                    while (matcher.find()) {
                        String group = matcher.group();
                        String substring = str3.substring(matcher.start() + 2, matcher.end() - 2);
                        if (map == null || !map.containsKey(substring)) {
                            Context a = ar.m236694a();
                            Resources resources = a.getResources();
                            int identifier = resources.getIdentifier(substring, "string", a.getPackageName());
                            if (identifier == 0) {
                                str = "";
                            } else {
                                str = resources.getString(identifier);
                            }
                        } else {
                            str = (String) map.get(substring);
                        }
                        str4 = str4.replace(group, str);
                    }
                    arrayList.add(str4);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static VcBizTask<C60978l> m249174a(String str, IDTypeEntity iDTypeEntity) {
        GetAssociatedVideoChatRequest.C50601a aVar = new GetAssociatedVideoChatRequest.C50601a();
        aVar.mo175171a(str);
        aVar.mo175169a(IDType.fromValue(iDTypeEntity.getNumber()));
        return new VcBizTask<>(Command.GET_ASSOCIATED_VC, aVar, new SdkSender.IParser<C60978l>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass36 */

            /* renamed from: a */
            public C60978l parse(byte[] bArr) throws IOException {
                return C60930c.m236953a(GetAssociatedVideoChatResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<String> m249197a(String str, boolean z, String str2, String str3, Boolean bool) {
        ParticipantSettings.C50910a aVar = new ParticipantSettings.C50910a();
        aVar.mo175882d(Boolean.valueOf(z));
        aVar.mo175879b(str2);
        aVar.mo175875a(str3);
        aVar.mo175883e(bool);
        ParticipantChangeSettingsRequest.C50906a aVar2 = new ParticipantChangeSettingsRequest.C50906a();
        aVar2.mo175861a(str);
        aVar2.mo175859a(aVar.build());
        return new VcBizTask<>(Command.PARTICIPANT_CHANGE_SETTINGS, aVar2, $$Lambda$VcBizSender$UIkPtHQqN7jOYwvjFbgiBe3q4.INSTANCE, true);
    }

    /* renamed from: a */
    public static VcBizTask<String> m249187a(String str, String str2, String str3, Boolean bool) {
        ParticipantSettings.C50910a aVar = new ParticipantSettings.C50910a();
        aVar.mo175879b(str2);
        aVar.mo175875a(str3);
        aVar.mo175883e(bool);
        ParticipantChangeSettingsRequest.C50906a aVar2 = new ParticipantChangeSettingsRequest.C50906a();
        aVar2.mo175861a(str);
        aVar2.mo175859a(aVar.build());
        return new VcBizTask<>(Command.PARTICIPANT_CHANGE_SETTINGS, aVar2, $$Lambda$VcBizSender$JCpliu97PHXXrnRsrlqQU7nTwjQ.INSTANCE, true);
    }

    /* renamed from: a */
    public static VcBizTask<C60963ai> m249182a(String str, String str2, Long l, Long l2, Boolean bool) {
        PullSubtitlesRequest.C50928a aVar = new PullSubtitlesRequest.C50928a();
        aVar.mo175928a(str).mo175932b(str2);
        if (l != null) {
            aVar.mo175927a(l);
        }
        if (l2 != null) {
            aVar.mo175931b(l2);
        }
        if (bool != null) {
            aVar.mo175925a(bool);
        }
        return new VcBizTask<>(Command.PULL_SUBTITLES, aVar, new SdkSender.IParser() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass38 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public Object parse(byte[] bArr) throws IOException {
                return C60930c.m236931a(PullSubtitlesResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<C60963ai> m249183a(String str, String str2, Long l, Long l2, Boolean bool, Integer num, Integer num2) {
        PullSubtitlesRequest.C50928a aVar = new PullSubtitlesRequest.C50928a();
        aVar.mo175928a(str).mo175932b(str2);
        if (l != null) {
            aVar.mo175927a(l);
        }
        if (l2 != null) {
            aVar.mo175931b(l2);
        }
        if (bool != null) {
            aVar.mo175925a(bool);
        }
        if (num != null) {
            aVar.mo175926a(num);
        }
        if (num2 != null) {
            aVar.mo175930b(num2);
        }
        return new VcBizTask<>(Command.PULL_SUBTITLES, aVar, new SdkSender.IParser() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass39 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public Object parse(byte[] bArr) throws IOException {
                return C60930c.m236931a(PullSubtitlesResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<aq> m249140a(ByteviewUser byteviewUser) {
        SetSubtitlesFilterRequest.C51020a aVar = new SetSubtitlesFilterRequest.C51020a();
        ArrayList arrayList = new ArrayList();
        if (byteviewUser != null) {
            arrayList.add(new com.ss.android.lark.pb.videoconference.v1.ByteviewUser(byteviewUser.getUserId(), byteviewUser.getDeviceId(), com.ss.android.lark.pb.videoconference.v1.ParticipantType.fromValue(byteviewUser.getParticipantType().getNumber())));
        }
        aVar.f127081a = arrayList;
        return new VcBizTask<>(Command.SET_SUBTITLES_FILTER, aVar, new SdkSender.IParser() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass42 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public Object parse(byte[] bArr) throws IOException {
                SetSubtitlesFilterResponse.ADAPTER.decode(bArr);
                return new aq();
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<an> m249157a(Long l, String str) {
        SearchSubtitlesRequest.C50990a aVar = new SearchSubtitlesRequest.C50990a();
        if (l != null) {
            aVar.mo176078a(l);
        }
        aVar.mo176079a(str);
        return new VcBizTask<>(Command.SEARCH_SUBTITLES, aVar, new SdkSender.IParser() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass43 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public Object parse(byte[] bArr) throws IOException {
                return C60930c.m236934a(SearchSubtitlesResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<al> m249166a(String str, RecordMeetingEntityRequest.Action action, ByteviewUser byteviewUser, String str2) {
        RecordMeetingRequest.C50958a a = new RecordMeetingRequest.C50958a().mo175999a(str).mo175998a(RecordMeetingRequest.Action.fromValue(action.getNumber()));
        if (byteviewUser != null) {
            a.mo175997a(new com.ss.android.lark.pb.videoconference.v1.ByteviewUser(byteviewUser.getUserId(), byteviewUser.getDeviceId(), com.ss.android.lark.pb.videoconference.v1.ParticipantType.fromValue(byteviewUser.getParticipantType().getNumber())));
        }
        if (!TextUtils.isEmpty(str2)) {
            a.mo176001b(str2);
        }
        return new VcBizTask<>(Command.RECORD_MEETING, a, new SdkSender.IParser() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass45 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public Object parse(byte[] bArr) throws IOException {
                al alVar = new al();
                RecordMeetingResponse.ADAPTER.decode(bArr);
                return alVar;
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<C60944d> m249167a(String str, VideoChatLiveActionEntityRequest.Action action, ByteviewUser byteviewUser, String str2) {
        VideoChatLiveActionRequest.C51250a a = new VideoChatLiveActionRequest.C51250a().mo176715a(str).mo176713a(VideoChatLiveActionRequest.Action.fromValue(action.getNumber()));
        if (byteviewUser != null) {
            a.mo176710a(new com.ss.android.lark.pb.videoconference.v1.ByteviewUser(byteviewUser.getUserId(), byteviewUser.getDeviceId(), com.ss.android.lark.pb.videoconference.v1.ParticipantType.fromValue(byteviewUser.getParticipantType().getNumber())));
        }
        if (!TextUtils.isEmpty(str2)) {
            a.mo176717b(str2);
        }
        return new VcBizTask<>(Command.LIVE_MEETING_ACTION, a, new SdkSender.IParser() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass46 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public Object parse(byte[] bArr) throws IOException {
                return C60930c.m236901a(VideoChatLiveActionResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<C60944d> m249170a(String str, VideoChatLiveActionEntityRequest.Action action, InMeetingData.LiveMeetingData.Privilege privilege, boolean z) {
        VideoChatLiveActionRequest.C51250a a = new VideoChatLiveActionRequest.C51250a().mo176715a(str).mo176713a(VideoChatLiveActionRequest.Action.fromValue(action.getNumber()));
        if (z && privilege != null) {
            a.mo176712a(InMeetingData.LiveMeetingData.Privilege.fromValue(privilege.getValue()));
        }
        return new VcBizTask<>(Command.LIVE_MEETING_ACTION, a, new SdkSender.IParser() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass47 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public Object parse(byte[] bArr) throws IOException {
                return C60930c.m236901a(VideoChatLiveActionResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<C60944d> m249168a(String str, VideoChatLiveActionEntityRequest.Action action, InMeetingData.LiveMeetingData.LayoutStyle layoutStyle) {
        VideoChatLiveActionRequest.C51250a a = new VideoChatLiveActionRequest.C51250a().mo176715a(str).mo176713a(VideoChatLiveActionRequest.Action.fromValue(action.getNumber()));
        InMeetingData.LiveMeetingData.LayoutStyle fromValue = InMeetingData.LiveMeetingData.LayoutStyle.fromValue(layoutStyle.getValue());
        if (fromValue != InMeetingData.LiveMeetingData.LayoutStyle.STYLE_UNKNOWN) {
            a.mo176711a(fromValue);
        }
        return new VcBizTask<>(Command.LIVE_MEETING_ACTION, a, new SdkSender.IParser() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass48 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public Object parse(byte[] bArr) throws IOException {
                return C60930c.m236901a(VideoChatLiveActionResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<C60944d> m249171a(String str, VideoChatLiveActionEntityRequest.Action action, boolean z) {
        VideoChatLiveActionRequest.C51250a a = new VideoChatLiveActionRequest.C51250a().mo176715a(str).mo176713a(VideoChatLiveActionRequest.Action.fromValue(action.getNumber()));
        a.mo176714a(Boolean.valueOf(z));
        return new VcBizTask<>(Command.LIVE_MEETING_ACTION, a, new SdkSender.IParser() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass49 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public Object parse(byte[] bArr) throws IOException {
                return C60930c.m236901a(VideoChatLiveActionResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<C60944d> m249169a(String str, VideoChatLiveActionEntityRequest.Action action, InMeetingData.LiveMeetingData.Privilege privilege, InMeetingData.LiveMeetingData.LayoutStyle layoutStyle, boolean z, boolean z2) {
        VideoChatLiveActionRequest.C51250a a = new VideoChatLiveActionRequest.C51250a().mo176715a(str).mo176713a(VideoChatLiveActionRequest.Action.fromValue(action.getNumber()));
        if (z2 && privilege != null) {
            a.mo176712a(InMeetingData.LiveMeetingData.Privilege.fromValue(privilege.getValue()));
        }
        InMeetingData.LiveMeetingData.LayoutStyle fromValue = InMeetingData.LiveMeetingData.LayoutStyle.fromValue(layoutStyle.getValue());
        if (fromValue != InMeetingData.LiveMeetingData.LayoutStyle.STYLE_UNKNOWN) {
            a.mo176711a(fromValue);
        }
        a.mo176714a(Boolean.valueOf(z));
        return new VcBizTask<>(Command.LIVE_MEETING_ACTION, a, new SdkSender.IParser() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass50 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public Object parse(byte[] bArr) throws IOException {
                return C60930c.m236901a(VideoChatLiveActionResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<C60945e> m249184a(String str, String str2, String str3) {
        return new VcBizTask<>(Command.LIVE_MEETING_JOIN_PRE_CHECK, new VideoChatLivePreCheckRequest.C51258a().mo176733a(str).mo176735b(str2).mo176736c(str3), new SdkSender.IParser<C60945e>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass52 */

            /* renamed from: a */
            public C60945e parse(byte[] bArr) throws IOException {
                return C60930c.m236902a(VideoChatLivePreCheckResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<ba> m249179a(String str, String str2, int i, int i2, String str3) {
        return new VcBizTask<>(Command.LIVE_MEETING_VERIFY_TWO_ELEMENT, new VerifyTwoElementRequest.C51220a().mo176639c(str).mo176638b(str2).mo176637b(Integer.valueOf(i)).mo176634a(Integer.valueOf(i2)).mo176635a(str3), new SdkSender.IParser() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass56 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public Object parse(byte[] bArr) throws IOException {
                VerifyTwoElementResponse.ADAPTER.decode(bArr);
                return new ba();
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<C60960af> m249143a(ChannelMeta.GrootChannel grootChannel, String str, String str2, int i) {
        OpenGrootChannelRequest.C50892a aVar = new OpenGrootChannelRequest.C50892a();
        ChannelMeta.C50499a aVar2 = new ChannelMeta.C50499a();
        aVar2.mo174910a(GrootChannel.fromValue(grootChannel.getValue())).mo174911a(str);
        aVar.mo175824a(aVar2.build()).mo175826a(Long.valueOf(str2));
        if (i >= 0) {
            aVar.mo175825a(Integer.valueOf(i));
        }
        return new VcBizTask<>(Command.OPEN_GROOT_CHANNEL, aVar, $$Lambda$VcBizSender$2xsReiCmPxpY_6efGsqYPkobtbc.INSTANCE);
    }

    /* renamed from: a */
    public static VcBizTask<VcTabDetailResponse> m249191a(String str, String str2, boolean z) {
        GetVCTabMeetingDetailRequest.C50697a aVar = new GetVCTabMeetingDetailRequest.C50697a();
        aVar.mo175376a(str);
        aVar.mo175378b(str2);
        aVar.mo175375a(Boolean.valueOf(z));
        return new VcBizTask<>(Command.GET_VC_TAB_MEETING_DETAIL, aVar, $$Lambda$VcBizSender$TVBBkniBDzC4DKWJQoqbigmCLlQ.INSTANCE);
    }

    /* renamed from: a */
    public static void m249223a(String str, String str2, boolean z, String str3, AbstractC63598b<Object> bVar) {
        CreateVCTabMeetingStatisticsRequest.C50439a aVar = new CreateVCTabMeetingStatisticsRequest.C50439a();
        aVar.mo174772a(str).mo174774b(str2).mo174771a(Boolean.valueOf(z)).mo174775c(str3);
        com.ss.android.lark.pb.improto.Command command = com.ss.android.lark.pb.improto.Command.CREATE_VC_TAB_MEETING_STATISTICS;
        ProtoAdapter<CreateVCTabMeetingStatisticsResponse> protoAdapter = CreateVCTabMeetingStatisticsResponse.ADAPTER;
        protoAdapter.getClass();
        new VcBizTask(command, aVar, new SdkSender.IParser() {
            /* class com.ss.android.vc.net.request.$$Lambda$OhM8fB2M14tQNGN0Y_5tKlinidE */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return ProtoAdapter.this.decode(bArr);
            }
        }).mo219893b(bVar);
    }

    /* renamed from: b */
    public static void m249246b(AbstractC63598b<Object> bVar) {
        new VcBizTask(com.ss.android.lark.pb.improto.Command.GET_VC_TAB_TOTAL_MISSED_CALL, new GetVCTabTotalMissedCallRequest.C50443a(), $$Lambda$VcBizSender$alYY2gAhT8_AizO0mP3DNXDFeU.INSTANCE).mo219893b(bVar);
    }

    /* renamed from: a */
    public static void m249212a(long j, AbstractC63598b<Object> bVar) {
        VCTabMissedCallConfirmRequest.C50447a aVar = new VCTabMissedCallConfirmRequest.C50447a();
        aVar.f125986a = Long.valueOf(j);
        com.ss.android.lark.pb.improto.Command command = com.ss.android.lark.pb.improto.Command.VC_TAB_MISSED_CALL_CONFIRM;
        ProtoAdapter<VCTabMissedCallConfirmResponse> protoAdapter = VCTabMissedCallConfirmResponse.ADAPTER;
        protoAdapter.getClass();
        new VcBizTask(command, aVar, new SdkSender.IParser() {
            /* class com.ss.android.vc.net.request.$$Lambda$OhM8fB2M14tQNGN0Y_5tKlinidE */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return ProtoAdapter.this.decode(bArr);
            }
        }).mo219893b(bVar);
    }

    /* renamed from: a */
    public static VcBizTask<C60960af> m249142a(ChannelMeta.GrootChannel grootChannel, String str, int i) {
        OpenGrootChannelRequest.C50892a aVar = new OpenGrootChannelRequest.C50892a();
        ChannelMeta.C50499a aVar2 = new ChannelMeta.C50499a();
        aVar2.mo174910a(GrootChannel.fromValue(grootChannel.getValue()));
        aVar2.mo174911a(str);
        aVar.mo175824a(aVar2.build());
        aVar.mo175825a(Integer.valueOf(i));
        return new VcBizTask<>(Command.OPEN_GROOT_CHANNEL, aVar, $$Lambda$VcBizSender$AtZH0l5uAO8X1LZ4clhzNcDYshY.INSTANCE);
    }

    /* renamed from: a */
    public static VcBizTask<C60960af> m249141a(ChannelMeta.GrootChannel grootChannel, String str) {
        OpenGrootChannelRequest.C50892a aVar = new OpenGrootChannelRequest.C50892a();
        ChannelMeta.C50499a aVar2 = new ChannelMeta.C50499a();
        aVar2.mo174910a(GrootChannel.fromValue(grootChannel.getValue()));
        aVar2.mo174911a(str);
        aVar.mo175824a(aVar2.build());
        return new VcBizTask<>(Command.OPEN_GROOT_CHANNEL, aVar, $$Lambda$VcBizSender$ttITb4zWD7Jwruu3dBDKH3_osfE.INSTANCE);
    }

    /* renamed from: a */
    public static VcBizTask<VCTabListHistoryListEntity> m249177a(String str, Long l, boolean z) {
        GetVCTabHistoryListRequest.C50693a aVar = new GetVCTabHistoryListRequest.C50693a();
        aVar.f126422a = str;
        aVar.f126423b = l;
        aVar.f126424c = TimeZone.getDefault().getID();
        aVar.f126425d = Boolean.valueOf(z);
        return new VcBizTask<>(Command.GET_VC_TAB_HISTORY_LIST, aVar, $$Lambda$VcBizSender$IuYOZeA4ChghZemzABTHiFXcOrM.INSTANCE);
    }

    /* renamed from: a */
    public static VcBizTask<List<VCTabListItem>> m249156a(Long l) {
        GetVCUpcomingCalendarInstancesRequest.C50701a aVar = new GetVCUpcomingCalendarInstancesRequest.C50701a();
        aVar.f126438a = Long.valueOf(System.currentTimeMillis());
        aVar.f126439b = TimeZone.getDefault().getID();
        aVar.f126440c = l;
        return new VcBizTask<>(Command.GET_VC_UPCOMING_CALENDAR_INSTANCES, aVar, $$Lambda$VcBizSender$SI97NfxYsJzHAqxQbZQZoxdww.INSTANCE);
    }

    /* renamed from: a */
    public static VcBizTask<String> m249205a(boolean z) {
        GetCurrentUserBriefPrimaryCalendarRequest.C15692a aVar = new GetCurrentUserBriefPrimaryCalendarRequest.C15692a();
        aVar.f41450a = Boolean.valueOf(z);
        return new VcBizTask<>(Command.GET_CURRENT_USER_BRIEF_PRIMARY_CALENDAR, aVar, $$Lambda$VcBizSender$QG_C1jvw3DBVAcFD3g80AIs8CgU.INSTANCE);
    }

    /* renamed from: a */
    public static void m249220a(String str, String str2, AbstractC63598b<VCBreakoutRoomJoinEntity> bVar) {
        BreakoutRoomJoinRequest.C50475a aVar = new BreakoutRoomJoinRequest.C50475a();
        aVar.mo174859a(str).mo174861b(str2);
        new VcBizTask(com.ss.android.lark.pb.improto.Command.JOIN_MEETING_BREAKOUT_ROOM, aVar, $$Lambda$VcBizSender$qpNYmaCC0Q0jmd5Ke5USFBpIPps.INSTANCE).mo219889a(bVar);
    }

    /* renamed from: b */
    public static void m249248b(String str, String str2, AbstractC63598b<VCManageApplyResponse> bVar) {
        VCManageApplyRequest.C50413a aVar = new VCManageApplyRequest.C50413a();
        aVar.f125889b = str2;
        aVar.f125888a = str;
        aVar.f125890c = VCManageApplyRequest.ApplyType.APPLY_FOR_HELP_FROM_BREAKOUT_ROOM;
        new VcBizTask(com.ss.android.lark.pb.improto.Command.VC_MANAGE_APPLY, aVar, $$Lambda$VcBizSender$aHO47YAFM5EJmDZQgycXgQpKPNc.INSTANCE).mo219893b(bVar);
    }

    /* renamed from: a */
    public static VcBizTask<az> m249180a(String str, String str2, int i, int i2, boolean z, QuerySource querySource) {
        VcQueryDocsRequest.C51216a aVar = new VcQueryDocsRequest.C51216a();
        VcQueryDocsRequest.QueryOpts.C51214a aVar2 = new VcQueryDocsRequest.QueryOpts.C51214a();
        aVar2.mo176614a((Boolean) true);
        if (!TextUtils.isEmpty(str2)) {
            aVar2.mo176615a(str2);
        }
        aVar.mo176621a(aVar2.mo176617b(Boolean.valueOf(z)).build());
        aVar.mo176624a(str).mo176623a(Integer.valueOf(i2)).mo176626b(Integer.valueOf(i)).mo176622a(VcQueryDocsRequest.QuerySource.fromValue(querySource.getValue()));
        return new VcBizTask<>(Command.VC_QUERY_DOCS, aVar, $$Lambda$VcBizSender$MylcDkR0Vgl_aygPRYF46samqI.INSTANCE);
    }

    /* renamed from: b */
    public static VcBizTask<GetUrlBriefsEntity> m249239b(List<String> list) {
        GetUrlBriefsRequest.C50689a aVar = new GetUrlBriefsRequest.C50689a();
        if (!CollectionUtils.isEmpty(list)) {
            aVar.mo175358a(list);
        }
        aVar.mo175357a(new GetUrlBriefsRequest.Opts(true, true, true));
        return new VcBizTask<>(Command.GET_URL_BRIEFS, aVar, $$Lambda$VcBizSender$nsfgKAGwHzO172YupxJoShaJSc.INSTANCE);
    }

    /* renamed from: a */
    public static VcBizTask<com.ss.android.vc.entity.response.ar> m249189a(String str, String str2, String str3, boolean z, FollowInfo.InitSource initSource, boolean z2, int i) {
        FollowInfo.LifeTime lifeTime;
        ShareFollowRequest.C51038a aVar = new ShareFollowRequest.C51038a();
        FollowInfo.Options a = new FollowInfo.Options.C50569a().mo175090a(true).mo175092b(false).build();
        if (z) {
            lifeTime = FollowInfo.LifeTime.PERMANENT;
        } else {
            lifeTime = FollowInfo.LifeTime.EPHEMERAL;
        }
        aVar.mo176195a(ShareFollowRequest.Action.START).mo176194a(a).mo176193a(lifeTime).mo176200a(str).mo176202b(str3).mo176192a(FollowInfo.InitSource.fromValue(initSource.getNumber()));
        if (TextUtils.isEmpty(str2) || "1".equals(str2)) {
            aVar.f127105n = FollowAssociateType.FOLLOW_ASSOCIATE_TYPE_MEETING;
        } else {
            aVar.f127105n = FollowAssociateType.FOLLOW_ASSOCIATE_TYPE_BREAKOUT_MEETING;
            aVar.mo176203c(str2);
        }
        if (z2) {
            aVar.mo176199a(Integer.valueOf(i));
        }
        return new VcBizTask<>(Command.SHARE_FOLLOW, aVar, new SdkSender.IParser<com.ss.android.vc.entity.response.ar>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass63 */

            /* renamed from: a */
            public com.ss.android.vc.entity.response.ar parse(byte[] bArr) throws IOException {
                return C60930c.m236936a(ShareFollowResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: b */
    public static VcBizTask<com.ss.android.vc.entity.response.ar> m249232b(String str, String str2, String str3) {
        ShareFollowRequest.C51038a aVar = new ShareFollowRequest.C51038a();
        ShareFollowRequest.C51038a a = aVar.mo176195a(ShareFollowRequest.Action.STOP).mo176200a(str);
        if (str3 == null) {
            str3 = "";
        }
        a.mo176202b(str3);
        if (TextUtils.isEmpty(str2) || "1".equals(str2)) {
            aVar.f127105n = FollowAssociateType.FOLLOW_ASSOCIATE_TYPE_MEETING;
        } else {
            aVar.f127105n = FollowAssociateType.FOLLOW_ASSOCIATE_TYPE_BREAKOUT_MEETING;
            aVar.mo176203c(str2);
        }
        return new VcBizTask<>(Command.SHARE_FOLLOW, aVar, new SdkSender.IParser<com.ss.android.vc.entity.response.ar>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass64 */

            /* renamed from: a */
            public com.ss.android.vc.entity.response.ar parse(byte[] bArr) throws IOException {
                return C60930c.m236936a(ShareFollowResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<C60973g> m249149a(CreateDocEntityRequest.CreateDocType createDocType) {
        CreateDocRequest.C19239a aVar = new CreateDocRequest.C19239a();
        aVar.mo65666a(Doc.Type.DOC);
        aVar.mo65668a(CreateDocRequest.CreateDocType.fromValue(createDocType.getNumber()));
        aVar.mo65667a(CreateDocRequest.CreateDocSource.VIDEO_CONFERECNE);
        return new VcBizTask<>(Command.CREATE_DOC, aVar, new SdkSender.IParser<C60973g>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass65 */

            /* renamed from: a */
            public C60973g parse(byte[] bArr) throws IOException {
                return C60930c.m236949a(CreateDocResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<com.ss.android.vc.entity.response.ar> m249186a(String str, String str2, String str3, com.ss.android.vc.entity.Participant participant) {
        ShareFollowRequest.C51038a aVar = new ShareFollowRequest.C51038a();
        if (TextUtils.isEmpty(str2) || "1".equals(str2)) {
            aVar.f127105n = FollowAssociateType.FOLLOW_ASSOCIATE_TYPE_MEETING;
        } else {
            aVar.f127105n = FollowAssociateType.FOLLOW_ASSOCIATE_TYPE_BREAKOUT_MEETING;
            aVar.mo176203c(str2);
        }
        if (participant != null) {
            aVar.mo176198a(new ShareFollowRequest.TransPresenterData(new com.ss.android.lark.pb.videoconference.v1.ByteviewUser(participant.getId(), participant.getDeviceId(), com.ss.android.lark.pb.videoconference.v1.ParticipantType.fromValue(participant.getParticipantType().getNumber()))));
        }
        aVar.mo176200a(str).mo176202b(str3).mo176195a(ShareFollowRequest.Action.TRANS_PRESENTER);
        return new VcBizTask<>(Command.SHARE_FOLLOW, aVar, new SdkSender.IParser<com.ss.android.vc.entity.response.ar>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass66 */

            /* renamed from: a */
            public com.ss.android.vc.entity.response.ar parse(byte[] bArr) throws IOException {
                return C60930c.m236936a(ShareFollowResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<com.ss.android.vc.entity.response.ar> m249188a(String str, String str2, String str3, String str4) {
        ShareFollowRequest.C51038a aVar = new ShareFollowRequest.C51038a();
        if (TextUtils.isEmpty(str2) || "1".equals(str2)) {
            aVar.f127105n = FollowAssociateType.FOLLOW_ASSOCIATE_TYPE_MEETING;
        } else {
            aVar.f127105n = FollowAssociateType.FOLLOW_ASSOCIATE_TYPE_BREAKOUT_MEETING;
            aVar.mo176203c(str2);
        }
        aVar.mo176200a(str).mo176202b(str3).mo176195a(ShareFollowRequest.Action.TAKE_OVER).mo176197a(new ShareFollowRequest.TakeOverData.C51034a().mo176183a(str4).build());
        return new VcBizTask<>(Command.SHARE_FOLLOW, aVar, new SdkSender.IParser<com.ss.android.vc.entity.response.ar>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass67 */

            /* renamed from: a */
            public com.ss.android.vc.entity.response.ar parse(byte[] bArr) throws IOException {
                return C60930c.m236936a(ShareFollowResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: b */
    public static VcBizTask<com.ss.android.vc.entity.response.ar> m249233b(String str, String str2, String str3, String str4) {
        ShareFollowRequest.C51038a aVar = new ShareFollowRequest.C51038a();
        FollowInfo.Options a = new FollowInfo.Options.C50569a().mo175090a(true).mo175092b(false).build();
        ShareFollowRequest.ReactivateData.C51032a aVar2 = new ShareFollowRequest.ReactivateData.C51032a();
        aVar2.mo176178a(str4);
        if (TextUtils.isEmpty(str2) || "1".equals(str2)) {
            aVar.f127105n = FollowAssociateType.FOLLOW_ASSOCIATE_TYPE_MEETING;
        } else {
            aVar.f127105n = FollowAssociateType.FOLLOW_ASSOCIATE_TYPE_BREAKOUT_MEETING;
            aVar.mo176203c(str2);
        }
        aVar.mo176195a(ShareFollowRequest.Action.REACTIVATE).mo176194a(a).mo176193a(FollowInfo.LifeTime.EPHEMERAL).mo176200a(str).mo176202b(str3).mo176192a(FollowInfo.InitSource.INIT_REACTIVATED).mo176196a(aVar2.build());
        return new VcBizTask<>(Command.SHARE_FOLLOW, aVar, new SdkSender.IParser<com.ss.android.vc.entity.response.ar>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass68 */

            /* renamed from: a */
            public com.ss.android.vc.entity.response.ar parse(byte[] bArr) throws IOException {
                return C60930c.m236936a(ShareFollowResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<ao> m249164a(String str, FollowGrootCellPayload followGrootCellPayload, boolean z) {
        SendGrootCellsRequest.C51008a aVar = new SendGrootCellsRequest.C51008a();
        ChannelMeta.C50499a a = new ChannelMeta.C50499a().mo174910a(GrootChannel.FOLLOW).mo174911a(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new GrootCell.C50735a().mo175463a(z ? GrootCell.Action.TRIGGER : GrootCell.Action.CLIENT_REQ).mo175464a(ByteString.of(com.ss.android.lark.pb.videoconference.v1.FollowGrootCellPayload.ADAPTER.encode(C60930c.m236807a(followGrootCellPayload)))).build());
        aVar.mo176122a(arrayList).mo176121a(a.build());
        return new VcBizTask<>(Command.SEND_GROOT_CELLS, aVar, new SdkSender.IParser<ao>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass69 */

            /* renamed from: a */
            public ao parse(byte[] bArr) throws IOException {
                return new ao();
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<C60954aa> m249185a(String str, String str2, String str3, long j) {
        GrantFollowTokenRequest.C50731a aVar = new GrantFollowTokenRequest.C50731a();
        aVar.mo175452a(str).mo175454b(str2).mo175455c(str3).mo175451a(Long.valueOf(j));
        return new VcBizTask<>(Command.GRANT_FOLLOW_TOKEN, aVar, new SdkSender.IParser<C60954aa>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass72 */

            /* renamed from: a */
            public C60954aa parse(byte[] bArr) throws IOException {
                C60954aa aaVar = new C60954aa();
                GrantFollowTokenResponse.ADAPTER.decode(bArr);
                return aaVar;
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<ao> m249173a(String str, GrootChannelEntity grootChannelEntity) {
        SendGrootCellsRequest.C51008a aVar = new SendGrootCellsRequest.C51008a();
        aVar.mo176122a(new ArrayList()).mo176121a(new ChannelMeta.C50499a().mo174910a(GrootChannel.fromValue(grootChannelEntity.getNumber())).mo174911a(str).build());
        return new VcBizTask<>(Command.SEND_GROOT_CELLS, aVar, new SdkSender.IParser<ao>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass73 */

            /* renamed from: a */
            public ao parse(byte[] bArr) throws IOException {
                ao aoVar = new ao();
                SendGrootCellsResponse.ADAPTER.decode(bArr);
                return aoVar;
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<ao> m249190a(String str, String str2, List<SketchOperationUnit> list) {
        ArrayList arrayList = new ArrayList();
        for (SketchOperationUnit sketchOperationUnit : list) {
            arrayList.add(C60930c.m236823a(sketchOperationUnit));
        }
        SendGrootCellsRequest.C51008a aVar = new SendGrootCellsRequest.C51008a();
        ChannelMeta.C50499a a = new ChannelMeta.C50499a().mo174910a(GrootChannel.SKETCH).mo174911a(str2);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new GrootCell.C50735a().mo175463a(GrootCell.Action.CLIENT_REQ).mo175464a(ByteString.of(SketchGrootCellPayload.ADAPTER.encode(new SketchGrootCellPayload.C51078a().mo176298a(str).mo176299a(arrayList).build()))).build());
        aVar.mo176122a(arrayList2).mo176121a(a.build());
        return new VcBizTask<>(Command.SEND_GROOT_CELLS, aVar, new SdkSender.IParser<ao>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass74 */

            /* renamed from: a */
            public ao parse(byte[] bArr) throws IOException {
                SendGrootCellsResponse.ADAPTER.decode(bArr);
                return new ao();
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<C61188b> m249139a(int i, boolean z) {
        PatchViewUserSettingRequest.C50912a aVar = new PatchViewUserSettingRequest.C50912a();
        ViewUserSetting.MeetingGeneral.C51310a aVar2 = new ViewUserSetting.MeetingGeneral.C51310a();
        ViewUserSetting.MeetingAdvanced.C51308a aVar3 = new ViewUserSetting.MeetingAdvanced.C51308a();
        ViewUserSetting.MagicShare.C51302a aVar4 = new ViewUserSetting.MagicShare.C51302a();
        if (i == 1) {
            aVar2.f127790b = Boolean.valueOf(z);
        } else if (i == 2) {
            aVar2.f127789a = Boolean.valueOf(z);
        } else if (i == 3) {
            aVar3.f127787a = new ViewUserSetting.MeetingAdvanced.Subtitle(Boolean.valueOf(z));
        } else if (i == 4) {
            aVar4.mo176853a(Boolean.valueOf(z));
        } else if (i == 5) {
            aVar3.f127788b = new ViewUserSetting.MeetingAdvanced.Interpretation(Boolean.valueOf(z));
        }
        ViewUserSetting.C51316a aVar5 = new ViewUserSetting.C51316a();
        aVar5.mo176884a(aVar2.build());
        aVar5.mo176883a(aVar3.build());
        aVar5.mo176882a(aVar4.build());
        aVar.mo175888a(aVar5.build());
        return new VcBizTask<>(Command.PATCH_VIEW_USER_SETTING, aVar, new SdkSender.IParser<C61188b>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass77 */

            /* renamed from: a */
            public C61188b parse(byte[] bArr) throws IOException {
                return C60930c.m236993a(PullViewUserSettingResponse.ADAPTER.decode(bArr).user_setting);
            }
        });
    }

    /* renamed from: b */
    public static VcBizTask<C60959ae> m249242b(boolean z) {
        NoticeByteviewEventRequest.C50890a aVar = new NoticeByteviewEventRequest.C50890a();
        aVar.mo175819a(z ? NoticeByteviewEventRequest.EventType.ENTER : NoticeByteviewEventRequest.EventType.LEAVE);
        return new VcBizTask<>(Command.NOTICE_BYTEVIEW_EVENT, aVar, new SdkSender.IParser<C60959ae>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass78 */

            /* renamed from: a */
            public C60959ae parse(byte[] bArr) throws IOException {
                return new C60959ae();
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<SearchUsersAndChatsEntity> m249159a(String str, int i, int i2, boolean z) {
        return new VcBizTask<>(Command.SEARCH_USERS_AND_CHATS, new SearchUsersAndChatsRequest.C50996a().mo176095a(str).mo176092a(SearchUsersAndChatsRequest.QueryType.SEARCH_FOR_SHARE_CARD).mo176094a(Integer.valueOf(i)).mo176097b(Integer.valueOf(i2)).mo176093a(Boolean.valueOf(z)), new SdkSender.IParser<SearchUsersAndChatsEntity>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass79 */

            /* renamed from: a */
            public SearchUsersAndChatsEntity parse(byte[] bArr) throws IOException {
                return C60930c.m236922a(SearchUsersAndChatsResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<am> m249147a(VideoChatPrompt.Type type, boolean z, String str) {
        ReplyVideoChatPromptRequest.C50978a aVar = new ReplyVideoChatPromptRequest.C50978a();
        aVar.mo176052a(VideoChatPrompt.Type.fromValue(type.getNumber())).mo176051a(z ? ReplyVideoChatPromptRequest.Action.CONFIRM : ReplyVideoChatPromptRequest.Action.CANCEL).mo176053a(str);
        return new VcBizTask<>(Command.REPLY_VIDEO_CHAT_PROMPT, aVar, new SdkSender.IParser<am>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass81 */

            /* renamed from: a */
            public am parse(byte[] bArr) throws IOException {
                ReplyVideoChatPromptResponse.ADAPTER.decode(bArr);
                return new am();
            }
        });
    }

    /* renamed from: b */
    public static VcBizTask<as> m249234b(String str, String str2, boolean z) {
        ShareScreenRequest.Action action;
        if (str == null) {
            str = "";
        }
        if (z) {
            action = ShareScreenRequest.Action.START;
        } else {
            action = ShareScreenRequest.Action.STOP;
        }
        ShareScreenRequest.C51042a aVar = new ShareScreenRequest.C51042a();
        aVar.mo176212a(str).mo176211a(action);
        if (TextUtils.isEmpty(str2) || "1".equals(str2)) {
            aVar.f127116i = FollowAssociateType.FOLLOW_ASSOCIATE_TYPE_MEETING;
        } else {
            aVar.mo176214b(str2);
            aVar.f127116i = FollowAssociateType.FOLLOW_ASSOCIATE_TYPE_BREAKOUT_MEETING;
        }
        return new VcBizTask<>(Command.SHARE_SCREEN, aVar, new SdkSender.IParser<as>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass82 */

            /* renamed from: a */
            public as parse(byte[] bArr) throws IOException {
                return C60930c.m236937a(ShareScreenResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<C60965at> m249154a(ShareScreenToRoomEntityRequest shareScreenToRoomEntityRequest) {
        ShareScreenToRoomRequest.C51050a a = new ShareScreenToRoomRequest.C51050a().mo176233a(VideoChatInfo.MeetingSource.VC_FROM_USER).mo176232a(ShareScreenToRoomRequest.ShareType.fromValue(shareScreenToRoomEntityRequest.mo210047a().getValue()));
        if (shareScreenToRoomEntityRequest.mo210056e() == ShareScreenToRoomEntityRequest.JoinPath.JOIN_BY_SHARE_CODE) {
            a.mo176234a(shareScreenToRoomEntityRequest.mo210052b());
        } else if (shareScreenToRoomEntityRequest.mo210056e() == ShareScreenToRoomEntityRequest.JoinPath.JOIN_BY_MEETING_NUMBER) {
            a.mo176234a("").mo176237c(shareScreenToRoomEntityRequest.mo210052b());
        }
        if (shareScreenToRoomEntityRequest.mo210054c() != null && !TextUtils.isEmpty(shareScreenToRoomEntityRequest.mo210054c().mo210058a())) {
            a.mo176231a(new ShareScreenToRoomRequest.MagicShareInfo.C51048a().mo176226a(shareScreenToRoomEntityRequest.mo210054c().mo210058a()).build());
        }
        a.mo176236b(shareScreenToRoomEntityRequest.mo210055d());
        return new VcBizTask<>(Command.SHARE_SCREEN_TO_ROOM, a, new SdkSender.IParser<C60965at>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass83 */

            /* renamed from: a */
            public C60965at parse(byte[] bArr) throws IOException {
                return C60930c.m236938a(ShareScreenToRoomResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: b */
    public static void m249247b(String str, AbstractC63598b<PullVideoChatByShareCodeEntity> bVar) {
        new VcBizTask(com.ss.android.lark.pb.improto.Command.PULL_VIDEOCHAT_BY_SHARE_CODE, new PullVideochatByShareCodeRequest.C50405a().mo174700a(str), $$Lambda$VcBizSender$xABBM31MHLE5BJPWmlmP0yoO91s.INSTANCE).mo219889a(bVar);
    }

    /* renamed from: c */
    public static void m249257c(String str, AbstractC63598b<GetShareCodeInfoEntity> bVar) {
        new VcBizTask(com.ss.android.lark.pb.improto.Command.GET_SHARE_CODE_INFO, new GetShareCodeInfoRequest.C50354a().mo174598a(str), $$Lambda$VcBizSender$VFh4F4_dxZxjB8089LD5qNtUc04.INSTANCE).mo219889a(bVar);
    }

    /* renamed from: a */
    public static VcBizTask<ap> m249176a(String str, InteractionMessageType interactionMessageType, ReactionContent bVar, TextContent dVar) {
        SendVideoChatInteractionMessageRequest.C51012a aVar;
        String uuid = UUID.randomUUID().toString();
        if (interactionMessageType == InteractionMessageType.TEXT) {
            aVar = new SendVideoChatInteractionMessageRequest.C51012a().mo176134a(str).mo176136b(uuid).mo176133a(VideoChatInteractionMessage.Type.TEXT).mo176132a(new TextMessageContent.C51114a().mo176387a(C60657a.m235732a().mo208736a(dVar.mo216936a())).build());
        } else if (interactionMessageType == InteractionMessageType.REACTION) {
            aVar = new SendVideoChatInteractionMessageRequest.C51012a().mo176134a(str).mo176136b(uuid).mo176133a(VideoChatInteractionMessage.Type.REACTION).mo176131a(new ReactionMessageContent.C50956a().mo175992a(bVar.mo216929a()).build());
        } else {
            aVar = null;
        }
        return new VcBizTask<>(Command.SEND_VIDEO_CHAT_INTERACTION_MESSAGE, aVar, new SdkSender.IParser<ap>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass85 */

            /* renamed from: a */
            public ap parse(byte[] bArr) throws IOException {
                return C60930c.m236935a(SendVideoChatInteractionMessageResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<ak> m249160a(String str, int i, boolean z, int i2) {
        return new VcBizTask<>(Command.PULL_VIDEO_CHAT_INTERACTION_MESSAGES, new PullVideoChatInteractionMessagesRequest.C50938a().mo175954a(str).mo175953a(Integer.valueOf(i)).mo175952a(Boolean.valueOf(z)).mo175956b(Integer.valueOf(i2)), new SdkSender.IParser<ak>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass86 */

            /* renamed from: a */
            public ak parse(byte[] bArr) throws IOException {
                return C60930c.m236933a(PullVideoChatInteractionMessagesResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<JoinMeetingPreCheckEntity> m249165a(String str, JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType joinMeetingCheckIDType, boolean z, ParticipantRole participantRole) {
        JoinMeetingPreCheckRequest.C50821a a = new JoinMeetingPreCheckRequest.C50821a().mo175676a(str).mo175673a(JoinMeetingPreCheckRequest.JoinMeetingCheckIDType.fromValue(joinMeetingCheckIDType.getNumber())).mo175675a(Boolean.valueOf(z));
        if (participantRole != null) {
            a.mo175674a(com.ss.android.lark.pb.videoconference.v1.ParticipantRole.fromValue(participantRole.getNumber()));
        }
        return new VcBizTask<>(Command.JOIN_MEETING_PRE_CHECK, a, new SdkSender.IParser<JoinMeetingPreCheckEntity>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass87 */

            /* renamed from: a */
            public JoinMeetingPreCheckEntity parse(byte[] bArr) throws IOException {
                return C60930c.m236913a(JoinMeetingPreCheckResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<ByteViewUserInfo> m249181a(String str, String str2, ParticipantType participantType, String str3) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new com.ss.android.lark.pb.videoconference.v1.ByteviewUser(str, str2, com.ss.android.lark.pb.videoconference.v1.ParticipantType.fromValue(participantType.getNumber())));
        return new VcBizTask<>(Command.PULL_PARTICIPANT_INFO, new PullParticipantInfoRequest.C50920a().mo175907a(str3).mo175908a(arrayList), $$Lambda$VcBizSender$rKNPY1ddbJZgsD2GsoyYzlV_kZs.INSTANCE);
    }

    /* renamed from: a */
    public static VcBizTask<Boolean> m249207a(boolean z, boolean z2, String str) {
        return new VcBizTask<>(Command.UPDATE_VC_LOBBY_PARTICIPANT, new UpdateVCLobbyParticipantRequest.C51136a().mo176440b(Boolean.valueOf(z2)).mo176437a(Boolean.valueOf(z)).mo176438a(str), $$Lambda$VcBizSender$NHMTLK_JtNnuZO3XGlusF8P0E.INSTANCE);
    }

    /* renamed from: a */
    public static VcBizTask<String> m249152a(ManageApprovalRequest manageApprovalRequest) {
        VCManageApprovalRequest.C51148a aVar = new VCManageApprovalRequest.C51148a();
        aVar.mo176476a(manageApprovalRequest.getMeetingId()).mo176474a(VCManageApprovalRequest.ApprovalAction.fromValue(manageApprovalRequest.getApprovalAction().getNumber())).mo176475a(VCManageApprovalRequest.ApprovalType.fromValue(manageApprovalRequest.getApprovalType().getNumber()));
        if (manageApprovalRequest.getByteviewUsers() != null) {
            aVar.mo176477a(C60930c.m237016k(manageApprovalRequest.getByteviewUsers()));
        }
        return new VcBizTask<>(Command.VC_MANAGE_APPROVAL, aVar, $$Lambda$VcBizSender$JHq1TVME_59o3g_eA_uNV3FVVY.INSTANCE);
    }

    /* renamed from: a */
    public static VcBizTask<CheckVcManageCapabilitiesEntity> m249161a(String str, ByteviewUser byteviewUser) {
        CheckVCManageCapabilitiesRequest.C50505a aVar = new CheckVCManageCapabilitiesRequest.C50505a();
        aVar.mo174926a(str).mo174925a(C60930c.m236805a(byteviewUser));
        return new VcBizTask<>(Command.CHECK_VC_MANAGE_CAPABILITIES, aVar, $$Lambda$VcBizSender$XcgFaLOZ1Od4Yw5LE82UdDBNgMo.INSTANCE);
    }

    /* renamed from: a */
    public static String m249210a(String str, String str2, ParticipantType participantType, boolean z, boolean z2, ParticipantRole participantRole, boolean z3, AbstractC63598b<C60956ac> bVar) {
        com.ss.android.lark.pb.videoconference.v1.ParticipantSettings a = new ParticipantSettings.C50910a().mo175878b(Boolean.valueOf(!z)).mo175874a(Boolean.valueOf(!z2)).mo175877b(ParticipantSettings.EquipmentStatus.UNKNOWN).mo175872a(ParticipantSettings.EquipmentStatus.UNKNOWN).build();
        C60871a.m236611b("VcBizSender", "[sendJoinMeetingRequest] interviewId = " + str + ", interviewRole = " + str2 + ", type = " + participantType + ", settings = " + a + ", force = " + z3);
        VcBizTask vcBizTask = new VcBizTask(Command.JOIN_INTERVIEW_GROUP_MEETING, new JoinInterviewGroupMeetingRequest.C50815a().mo175660a(str).mo175656a(com.ss.android.lark.pb.videoconference.v1.ParticipantRole.fromValue(participantRole.getNumber())).mo175658a(com.ss.android.lark.pb.videoconference.v1.ParticipantType.LARK_USER).mo175657a(a).mo175659a(Boolean.valueOf(z3)), new SdkSender.IParser<C60956ac>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass92 */

            /* renamed from: a */
            public C60956ac parse(byte[] bArr) throws IOException {
                return C60930c.m236927a(JoinInterviewGroupMeetingResponse.ADAPTER.decode(bArr));
            }
        });
        vcBizTask.mo219889a(bVar);
        return vcBizTask.mo219895c();
    }

    /* renamed from: a */
    public static VcBizTask<GetAuthChattersResponse> m249204a(Map<String, String> map) {
        GetAuthChattersRequest.C16436a aVar = new GetAuthChattersRequest.C16436a();
        aVar.f42736a = ActionType.SHARE_MESSAGE_SELECT_USER;
        aVar.f42737b = map;
        return new VcBizTask<>(Command.GET_AUTH_CHATTERS, aVar, $$Lambda$VcBizSender$FEMU4wcXwmZdO1r7s37wSxP9vWM.INSTANCE);
    }

    /* renamed from: a */
    public static VcBizTask<PatchViewUserSettingResponse> m249148a(ViewDeviceSetting viewDeviceSetting) {
        PatchViewUserSettingRequest.C50912a aVar = new PatchViewUserSettingRequest.C50912a();
        aVar.mo175887a(C60930c.m236826a(viewDeviceSetting));
        Command command = Command.PATCH_VIEW_USER_SETTING;
        ProtoAdapter<PatchViewUserSettingResponse> protoAdapter = PatchViewUserSettingResponse.ADAPTER;
        protoAdapter.getClass();
        return new VcBizTask<>(command, aVar, new SdkSender.IParser() {
            /* class com.ss.android.vc.net.request.$$Lambda$rPe9xdrURNTVCnMN72SNNyIAwSo */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (PatchViewUserSettingResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<String> m249162a(String str, InterpreterSetting interpreterSetting) {
        ParticipantSettings.C50910a aVar = new ParticipantSettings.C50910a();
        aVar.mo175871a(C60930c.m236813a(interpreterSetting));
        ParticipantChangeSettingsRequest.C50906a aVar2 = new ParticipantChangeSettingsRequest.C50906a();
        aVar2.mo175861a(str);
        aVar2.mo175859a(aVar.build());
        return new VcBizTask<>(Command.PARTICIPANT_CHANGE_SETTINGS, aVar2, new SdkSender.IParser<String>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass98 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                ParticipantChangeSettingsResponse decode = ParticipantChangeSettingsResponse.ADAPTER.decode(bArr);
                if (decode == null) {
                    return null;
                }
                return decode.toString();
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<CalendarVCSettingsEntity> m249172a(String str, CalendarVCSettingsEntity calendarVCSettingsEntity) {
        SetCalendarVCSettingsRequest.C51016a aVar = new SetCalendarVCSettingsRequest.C51016a();
        aVar.f127078a = str;
        aVar.f127079b = C60930c.m236806a(calendarVCSettingsEntity);
        return new VcBizTask<>(Command.SET_CALENDAR_VC_SETTINGS, aVar, new SdkSender.IParser<CalendarVCSettingsEntity>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass101 */

            /* renamed from: a */
            public CalendarVCSettingsEntity parse(byte[] bArr) throws IOException {
                SetCalendarVCSettingsResponse.ADAPTER.decode(bArr);
                return null;
            }
        });
    }

    /* renamed from: a */
    public static void m249222a(String str, String str2, String str3, String str4, String str5, String str6) {
        new VcBizTask(Command.UPLOAD_EQUIPMENT_INFO, new UploadEquipmentInfoRequest.C70216a().mo247415a(new com.ss.android.lark.pb.videoconference.v1.ByteviewUser(str2, str3, com.ss.android.lark.pb.videoconference.v1.ParticipantType.LARK_USER)).mo247416a(str).mo247418b(str4).mo247419c(str5).mo247420d(str6), new SdkSender.IParser() {
            /* class com.ss.android.vc.net.request.VcBizSender.C635884 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public Object parse(byte[] bArr) throws IOException {
                return UploadEquipmentInfoResponse.ADAPTER.decode(bArr);
            }
        }).mo219896d();
    }

    /* renamed from: a */
    public static void m249213a(IGetDataCallback<VideoChatSearchChatterResponse> iGetDataCallback, String str, String str2, int i) {
        SdkSender.asynSendRequestNonWrap(Command.VC_LARK_SEARCH_USER_IN_MEETING, new VCSearchUserInMeetingRequest.C51168a().mo176520a(str).mo176519a(Integer.valueOf(i)).mo176522b(str2).mo176518a(VCSearchUserInMeetingRequest.QueryType.QUERY_ALL), iGetDataCallback, new SdkSender.IParser(str) {
            /* class com.ss.android.vc.net.request.$$Lambda$VcBizSender$NC3e6rF8di9HHt7TXLH1NVsuZE */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return VcBizSender.m249224b(this.f$0, bArr);
            }
        });
    }

    /* renamed from: b */
    public static void m249244b(IGetDataCallback<VideoChatSearchChatterResponse> iGetDataCallback, String str, String str2, int i) {
        SdkSender.asynSendRequestNonWrap(Command.VC_LARK_SEARCH_USER_IN_MEETING, new VCSearchUserInMeetingRequest.C51168a().mo176520a(str).mo176519a(Integer.valueOf(i)).mo176522b(str2).mo176518a(VCSearchUserInMeetingRequest.QueryType.QUERY_IN_MEETING), iGetDataCallback, new SdkSender.IParser(str) {
            /* class com.ss.android.vc.net.request.$$Lambda$VcBizSender$RiSdqH8GapV_17gZ9fw47E0nJM */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return VcBizSender.m249134a(this.f$0, bArr);
            }
        });
    }

    /* renamed from: a */
    public static void m249221a(String str, String str2, String str3, AbstractC63598b<PullVCCardInfoEntity> bVar) {
        PullVCCardInfoRequest.C50401a aVar = new PullVCCardInfoRequest.C50401a();
        aVar.f125872a = str;
        aVar.f125874c = str2;
        aVar.f125873b = str3;
        new VcBizTask(com.ss.android.lark.pb.improto.Command.VC_PULL_CARD_INFO, aVar, $$Lambda$VcBizSender$sbCPJ3RtduThXnGi0Y9JMiFJYA8.INSTANCE).mo219893b(bVar);
    }

    /* renamed from: a */
    public static void m249218a(String str, NetworkType networkType, AbstractC63598b<Object> bVar) {
        if (!TextUtils.isEmpty(str)) {
            if (networkType == null) {
                networkType = NetworkType.NetworkType_UNKNOWN;
            }
            UploadParticipantInfoRequest.C50411a aVar = new UploadParticipantInfoRequest.C50411a();
            aVar.mo174713a(str);
            aVar.f125887b = networkType;
            new VcBizTask(com.ss.android.lark.pb.improto.Command.UPLOAD_PARTICIPANT_INFO, aVar, $$Lambda$VcBizSender$j3fgwhuli3W_7ESGtCyqMmMneFY.INSTANCE).mo219893b(bVar);
        }
    }

    /* renamed from: i */
    public static VcBizTask<VCMeetingJoinInfoEntity> m249289i() {
        return new VcBizTask<>(Command.GET_VC_MEETING_JOIN_STATUS, new GetVcMeetingJoinStatusRequest.C50705a(), $$Lambda$VcBizSender$K2eGs5eeOaxSajKOm2jccZ7Q7iw.INSTANCE);
    }

    /* renamed from: c */
    public static VcBizTask<CheckEnterprisePhoneQuotaEntity> m249250c() {
        CheckEnterprisePhoneQuotaRequest.C50282a aVar = new CheckEnterprisePhoneQuotaRequest.C50282a();
        aVar.build();
        return new VcBizTask<>(com.ss.android.lark.pb.improto.Command.CHECK_ENTERPRISE_PHONE_QUOTA, aVar, $$Lambda$VcBizSender$Z4VMJp9hcUKQ3tiIkEC87HKk5nc.INSTANCE);
    }

    /* renamed from: d */
    public static VcBizTask<FeedbackReasons> m249259d() {
        return new VcBizTask<>(Command.GET_FEEDBACK_REASONS, new GetFeedbackReasonsRequest.C50639a().mo175253a(GetFeedbackReasonsRequest.FeedbackType.MULTI), new SdkSender.IParser<FeedbackReasons>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass19 */

            /* renamed from: a */
            public FeedbackReasons parse(byte[] bArr) throws IOException {
                GetFeedbackReasonsResponse decode = GetFeedbackReasonsResponse.ADAPTER.decode(bArr);
                C60871a.m236609a("VcBizSender", "[initForFeedback] [parse] " + decode.toString());
                return C60932d.m237033a(decode);
            }
        });
    }

    /* renamed from: f */
    public static VcBizTask<C60983q> m249273f() {
        return new VcBizTask<>(Command.GET_PARTICIPANT_LIST, new GetParticipantListRequest.C50661a(), new SdkSender.IParser() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass41 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public Object parse(byte[] bArr) throws IOException {
                return C60930c.m236957a(GetParticipantListResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: g */
    public static VcBizTask<C60943c> m249279g() {
        return new VcBizTask<>(Command.LIVE_MEETING_FETCH_LIVE_POLICY, new VideoChatFetchLivePolicyRequest.C51236a(), new SdkSender.IParser<C60943c>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass53 */

            /* renamed from: a */
            public C60943c parse(byte[] bArr) throws IOException {
                return C60930c.m236900a(VideoChatFetchLivePolicyResponse.ADAPTER.decode(bArr));
            }
        });
    }

    @XMethod
    public static RtcDnsInfo getRtcDns() {
        return (RtcDnsInfo) SdkSender.syncSend(Command.GET_RTC_DNS, new GetRTCDNSRequest.C50669a(), new SdkSender.IParser<RtcDnsInfo>() {
            /* class com.ss.android.vc.net.request.VcBizSender.C635851 */

            /* renamed from: a */
            public RtcDnsInfo parse(byte[] bArr) throws IOException {
                GetRTCDNSResponse decode = GetRTCDNSResponse.ADAPTER.decode(bArr);
                if (decode == null || decode.result == null) {
                    return null;
                }
                HashMap hashMap = new HashMap();
                for (Map.Entry<String, GetRTCDNSResponse.IPList> entry : decode.result.entrySet()) {
                    if (!(entry.getKey() == null || entry.getValue() == null || entry.getValue().ips == null || entry.getValue().ips.size() <= 0)) {
                        hashMap.put(entry.getKey(), entry.getValue().ips);
                    }
                }
                C60984s a = C60930c.m236958a(decode);
                RtcDnsInfo rtcDnsInfo = new RtcDnsInfo();
                rtcDnsInfo.setResult(a.f152718a);
                rtcDnsInfo.setHostIps(hashMap);
                return rtcDnsInfo;
            }
        });
    }

    /* renamed from: h */
    public static VcBizTask<C60981o> m249285h() {
        return new VcBizTask<>(Command.LIVE_MEETING_GET_LIVE_PERMISSION, new GetLivePermissionRequest.C50653a(), new SdkSender.IParser() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass54 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public Object parse(byte[] bArr) throws IOException {
                return C60930c.m236955a(GetLivePermissionResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: j */
    public static VcBizTask<C61188b> m249292j() {
        return new VcBizTask<>(Command.PULL_VIEW_USER_SETTING, new PullViewUserSettingRequest.C50942a(), new SdkSender.IParser<C61188b>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass76 */

            /* renamed from: a */
            public C61188b parse(byte[] bArr) throws IOException {
                return C60930c.m236993a(PullViewUserSettingResponse.ADAPTER.decode(bArr).user_setting);
            }
        });
    }

    @XMethod
    public static VcBizTask<VideoChatConfig> pullVideoChatConfig() {
        return new VcBizTask<>(Command.PULL_VIDEO_CHAT_CONFIG, new PullVideoChatConfigRequest.C50932a(), new SdkSender.IParser<VideoChatConfig>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass94 */

            /* renamed from: a */
            public VideoChatConfig parse(byte[] bArr) throws IOException {
                return C60930c.m236870a(PullVideoChatConfigResponse.ADAPTER.decode(bArr));
            }
        });
    }

    @XMethod
    public static ViewDeviceSetting syncGetViewUserSetting() {
        return (ViewDeviceSetting) SdkSender.syncSend(Command.GET_VIEW_USER_SETTING, new PullViewUserSettingRequest.C50942a(), new SdkSender.IParser<ViewDeviceSetting>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass96 */

            /* renamed from: a */
            public ViewDeviceSetting parse(byte[] bArr) throws IOException {
                PullViewUserSettingResponse decode = PullViewUserSettingResponse.ADAPTER.decode(bArr);
                if (decode == null) {
                    return null;
                }
                return C60930c.m236880a(decode.device_setting);
            }
        });
    }

    @XMethod
    public static VideoChatConfig syncPullVideoChatConfig() {
        return (VideoChatConfig) SdkSender.syncSend(Command.PULL_VIDEO_CHAT_CONFIG, new PullVideoChatConfigRequest.C50932a(), new SdkSender.IParser<VideoChatConfig>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass93 */

            /* renamed from: a */
            public VideoChatConfig parse(byte[] bArr) throws IOException {
                return C60930c.m236870a(PullVideoChatConfigResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: a */
    public static VcBizTask<C60946m> m249135a() {
        return new VcBizTask<>(Command.TRIG_PUSH_FULL_MEETING_INFO, new TrigPushFullMeetingInfoRequest.C51118a(), new SdkSender.IParser<C60946m>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass80 */

            /* renamed from: a */
            public C60946m parse(byte[] bArr) throws IOException {
                return new C60946m();
            }
        }, true);
    }

    /* renamed from: b */
    public static VcBizTask<aw> m249225b() {
        return new VcBizTask<>(Command.TRIG_PUSH_SELF_INFO, new TrigPushSelfInfoRequest.C51120a(), new SdkSender.IParser<aw>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass91 */

            /* renamed from: a */
            public aw parse(byte[] bArr) throws IOException {
                return new aw();
            }
        }, true);
    }

    /* renamed from: e */
    public static VcBizTask<C60962ah> m249267e() {
        return new VcBizTask<>(Command.PULL_PRE_VIDEO_CHAT_SETTING, new PullPreVideoChatSettingRequest.C50924a(), new SdkSender.IParser<C60962ah>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass32 */

            /* renamed from: a */
            public C60962ah parse(byte[] bArr) throws IOException {
                return C60930c.m236930a(PullPreVideoChatSettingResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: k */
    public static void m249297k() {
        new VcBizTask(Command.TRIGGER_PUSH_FULL_VC_LOBBY_PARTICIPANTS, new TriggerPushFullVCLobbyParticipantsRequest.C51122a(), $$Lambda$VcBizSender$6ZamQvDMUaheTYiFWO2r3uThKU0.INSTANCE).mo219893b(new C63594a("triggerPushFullVCLobbyParticipants"));
    }

    /* renamed from: l */
    public static String m249300l() {
        SearchFeatureGatingByPrefixRequest.C19197a aVar = new SearchFeatureGatingByPrefixRequest.C19197a();
        aVar.f47363a = "byteview.callmeeting.client.rtc";
        return (String) SdkSender.syncSend(Command.SEARCH_FEATURE_GATING_BY_PREFIX, aVar, new SdkSender.IParser<String>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass99 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                SearchFeatureGatingByPrefixResponse decode = SearchFeatureGatingByPrefixResponse.ADAPTER.decode(bArr);
                if (decode != null) {
                    return decode.fg_json_string;
                }
                return "";
            }
        });
    }

    /* renamed from: com.ss.android.vc.net.request.VcBizSender$a */
    public static class C63594a implements AbstractC63598b<String> {

        /* renamed from: c */
        public String f160586c = "VcLogCallback";

        public C63594a(String str) {
            this.f160586c = str;
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            C60871a.m236609a("VcLogCallback", "[" + this.f160586c + "] success " + str);
        }

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
            C60871a.m236611b("VcLogCallback", "[" + this.f160586c + "] error " + eVar.toString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public static /* synthetic */ GetUrlBriefsEntity m249106A(byte[] bArr) throws IOException {
        return C60930c.m236910a(GetUrlBriefsResponse.ADAPTER.decode(bArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public static /* synthetic */ az m249107B(byte[] bArr) throws IOException {
        return C60930c.m236944a(VcQueryDocsResponse.ADAPTER.decode(bArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public static /* synthetic */ VCMeetingJoinInfoEntity m249108C(byte[] bArr) throws IOException {
        return C60930c.m236976a(GetVcMeetingJoinStatusResponse.ADAPTER.decode(bArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public static /* synthetic */ VCManageApplyResponse m249109D(byte[] bArr) throws IOException {
        return VCManageApplyResponse.ADAPTER.decode(bArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public static /* synthetic */ VCBreakoutRoomJoinEntity m249110E(byte[] bArr) throws IOException {
        return C60930c.m236883a(BreakoutRoomJoinResponse.ADAPTER.decode(bArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public static /* synthetic */ String m249111F(byte[] bArr) throws IOException {
        return GetCurrentUserBriefPrimaryCalendarResponse.ADAPTER.decode(bArr).calendar.server_id;
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public static /* synthetic */ List m249112G(byte[] bArr) throws IOException {
        return C60930c.m237003a(GetVCUpcomingCalendarInstancesResponse.ADAPTER.decode(bArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public static /* synthetic */ VCTabListHistoryListEntity m249113H(byte[] bArr) throws IOException {
        return C60930c.m236978a(GetVCTabHistoryListResponse.ADAPTER.decode(bArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public static /* synthetic */ C60972f m249114I(byte[] bArr) throws IOException {
        return C60930c.m236948a(CloseGrootChannelResponse.ADAPTER.decode(bArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public static /* synthetic */ Object m249117L(byte[] bArr) throws IOException {
        return C60930c.m236985a(GetVCTabTotalMissedCallResponse.ADAPTER.decode(bArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public static /* synthetic */ VcTabDetailResponse m249118M(byte[] bArr) throws IOException {
        return C60930c.m236992a(GetVCTabMeetingDetailResponse.ADAPTER.decode(bArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public static /* synthetic */ CalendarInfo m249126U(byte[] bArr) throws IOException {
        return C60932d.m237032a(GetCalendarInfoResponse.ADAPTER.decode(bArr).calendar_info);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C60970c ab(byte[] bArr) throws IOException {
        CancelEnterprisePhoneResponse.ADAPTER.decode(bArr);
        return new C60970c();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ ay m249249c(byte[] bArr) throws IOException {
        return C60930c.m236943a(GetUserProfileResponse.ADAPTER.decode(bArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ PullVCCardInfoEntity m249258d(byte[] bArr) throws IOException {
        return C60930c.m236827a(PullVCCardInfoResponse.ADAPTER.decode(bArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ ReservationInfoEntity m249265e(byte[] bArr) throws IOException {
        return C60930c.m236921a(GetReservationResponse.ADAPTER.decode(bArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ bb m249272f(byte[] bArr) throws IOException {
        return C60930c.m236946a(VideoChatPullLiveSettingResponse.ADAPTER.decode(bArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ C60977k m249278g(byte[] bArr) throws IOException {
        return C60930c.m236952a(GetAdminPermissionInfoResponse.ADAPTER.decode(bArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static /* synthetic */ String m249313v(byte[] bArr) throws IOException {
        GetSIPDomainByUniqueIDResponse decode = GetSIPDomainByUniqueIDResponse.ADAPTER.decode(bArr);
        if (decode == null) {
            return "";
        }
        return decode.mdomain;
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static /* synthetic */ AdminSettings m249314w(byte[] bArr) throws IOException {
        return C60930c.m236829a(GetAdminSettingsResponse.ADAPTER.decode(bArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static /* synthetic */ GetShareCodeInfoEntity m249315x(byte[] bArr) throws IOException {
        return C60930c.m236959a(GetShareCodeInfoResponse.ADAPTER.decode(bArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static /* synthetic */ PullVideoChatByShareCodeEntity m249316y(byte[] bArr) throws IOException {
        return C60930c.m236932a(PullVideochatByShareCodeResponse.ADAPTER.decode(bArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public static /* synthetic */ C60960af m249115J(byte[] bArr) throws IOException {
        C60960af afVar = new C60960af();
        afVar.f152640a = C60930c.m236914a(OpenGrootChannelResponse.ADAPTER.decode(bArr).status);
        return afVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public static /* synthetic */ C60960af m249116K(byte[] bArr) throws IOException {
        C60960af afVar = new C60960af();
        afVar.f152640a = C60930c.m236914a(OpenGrootChannelResponse.ADAPTER.decode(bArr).status);
        return afVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public static /* synthetic */ C60960af m249119N(byte[] bArr) throws IOException {
        C60960af afVar = new C60960af();
        afVar.f152640a = C60930c.m236914a(OpenGrootChannelResponse.ADAPTER.decode(bArr).status);
        return afVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public static /* synthetic */ C60960af m249120O(byte[] bArr) throws IOException {
        C60960af afVar = new C60960af();
        afVar.f152640a = C60930c.m236914a(OpenGrootChannelResponse.ADAPTER.decode(bArr).status);
        return afVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public static /* synthetic */ String m249121P(byte[] bArr) throws IOException {
        ParticipantChangeSettingsResponse decode = ParticipantChangeSettingsResponse.ADAPTER.decode(bArr);
        if (decode == null) {
            return "";
        }
        return decode.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public static /* synthetic */ String m249122Q(byte[] bArr) throws IOException {
        ParticipantChangeSettingsResponse decode = ParticipantChangeSettingsResponse.ADAPTER.decode(bArr);
        if (decode == null) {
            return "";
        }
        return decode.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public static /* synthetic */ String m249123R(byte[] bArr) throws IOException {
        ParticipantChangeSettingsResponse decode = ParticipantChangeSettingsResponse.ADAPTER.decode(bArr);
        if (decode == null) {
            return "";
        }
        return decode.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public static /* synthetic */ Map m249124S(byte[] bArr) throws IOException {
        GetViewI18nTemplateResponse decode = GetViewI18nTemplateResponse.ADAPTER.decode(bArr);
        if (decode != null && decode.templates != null) {
            return decode.templates;
        }
        C60871a.m236612c("VcBizSender", "GetViewI18nTemplateResponse: response or template is empty");
        return Collections.emptyMap();
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public static /* synthetic */ CalendarGroupResponse m249125T(byte[] bArr) throws IOException {
        GetCalendarGroupResponse decode = GetCalendarGroupResponse.ADAPTER.decode(bArr);
        CalendarGroupResponse calendarGroupResponse = new CalendarGroupResponse();
        calendarGroupResponse.setGroupId(decode.group_id);
        calendarGroupResponse.setGroupStatus(CalendarGroupResponse.GetCalendarGroupStatus.valueOf(decode.get_cal_group_status.getValue()));
        return calendarGroupResponse;
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public static /* synthetic */ GetPhoneNumberAttributtonEntity m249130Y(byte[] bArr) throws IOException {
        GetPhoneNumberAttributtonResponse decode = GetPhoneNumberAttributtonResponse.ADAPTER.decode(bArr);
        return new GetPhoneNumberAttributtonEntity(decode.mprovince, decode.misp);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public static /* synthetic */ CheckEnterprisePhoneQuotaEntity m249131Z(byte[] bArr) throws IOException {
        CheckEnterprisePhoneQuotaResponse decode = CheckEnterprisePhoneQuotaResponse.ADAPTER.decode(bArr);
        return new CheckEnterprisePhoneQuotaEntity(decode.mdate, decode.mavailable_enterprise_phone_amount, decode.mdepartment_name);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C60980n aa(byte[] bArr) throws IOException {
        C60980n nVar = new C60980n();
        nVar.f152709a = GetEnterprisePhoneConfigResponse.ADAPTER.decode(bArr).mauthorized.booleanValue();
        return nVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C60974h ac(byte[] bArr) throws IOException {
        C60974h hVar = new C60974h();
        hVar.f152690a = CreateEnterprisePhoneResponse.ADAPTER.decode(bArr).menterprise_phone_id;
        return hVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C60974h ad(byte[] bArr) throws IOException {
        C60974h hVar = new C60974h();
        hVar.f152690a = CreateEnterprisePhoneResponse.ADAPTER.decode(bArr).menterprise_phone_id;
        return hVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String ae(byte[] bArr) throws IOException {
        GetRoomStatusByShareCodeResponse decode = GetRoomStatusByShareCodeResponse.ADAPTER.decode(bArr);
        if (decode.mroom_id == null) {
            return "";
        }
        return decode.mroom_id;
    }

    /* renamed from: e */
    public static C60991z m249266e(List<String> list) {
        return (C60991z) SdkSender.syncSend(Command.GET_VIEW_I18N_TEMPLATE, new GetViewI18nTemplateRequest.C50725a().mo175438a(list), new SdkSender.IParser<C60991z>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass90 */

            /* renamed from: a */
            public C60991z parse(byte[] bArr) throws IOException {
                return C60930c.m236965a(GetViewI18nTemplateResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ SetVcVirtualBackgroundEntity m249288i(byte[] bArr) throws IOException {
        SetVcVirtualBackgroundResponse decode = SetVcVirtualBackgroundResponse.ADAPTER.decode(bArr);
        if (decode == null) {
            return null;
        }
        return C60930c.m236923a(decode);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ C60986t m249295k(byte[] bArr) throws IOException {
        C60986t tVar = new C60986t();
        tVar.f152721a = GetSettingsResponse.ADAPTER.decode(bArr).field_groups;
        return tVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ C60986t m249298l(byte[] bArr) throws IOException {
        C60986t tVar = new C60986t();
        tVar.f152721a = GetSettingsResponse.ADAPTER.decode(bArr).field_groups;
        return tVar;
    }

    /* renamed from: m */
    public static VcBizTask<GetCalendarGuestEntity> m249302m(String str) {
        GetCalendarGuestListByMeetingIDRequest.C50613a aVar = new GetCalendarGuestListByMeetingIDRequest.C50613a();
        aVar.f126347a = str;
        return new VcBizTask<>(Command.GET_CALENDAR_GUEST_LIST, aVar, new SdkSender.IParser<GetCalendarGuestEntity>() {
            /* class com.ss.android.vc.net.request.VcBizSender.C635873 */

            /* renamed from: a */
            public GetCalendarGuestEntity parse(byte[] bArr) throws IOException {
                return C60930c.m236909a(GetCalendarGuestListByMeetingIDResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: n */
    public static VcBizTask<C60987v> m249303n(String str) {
        GetSuiteQuotaRequest.C50679a aVar = new GetSuiteQuotaRequest.C50679a();
        if (!TextUtils.isEmpty(str)) {
            aVar.f126403a = str;
        }
        return new VcBizTask<>(Command.VC_GET_SUITE_QUOTA, aVar, new SdkSender.IParser<C60987v>() {
            /* class com.ss.android.vc.net.request.VcBizSender.C635917 */

            /* renamed from: a */
            public C60987v parse(byte[] bArr) throws IOException {
                return C60930c.m236960a(GetSuiteQuotaResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: o */
    public static VcBizTask<C60953a> m249305o(String str) {
        AdjustMeetingDurationRequest.C50457a aVar = new AdjustMeetingDurationRequest.C50457a();
        aVar.f125995a = str;
        return new VcBizTask<>(Command.ADJUEST_MEETING_DURATION, aVar, new SdkSender.IParser<C60953a>() {
            /* class com.ss.android.vc.net.request.VcBizSender.C635928 */

            /* renamed from: a */
            public C60953a parse(byte[] bArr) throws IOException {
                return C60930c.m236925a(AdjustMeetingDurationResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static /* synthetic */ Boolean m249307p(byte[] bArr) throws IOException {
        boolean z;
        if (UpdateVCLobbyParticipantResponse.ADAPTER.decode(bArr) != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static /* synthetic */ List m249309r(byte[] bArr) throws IOException {
        PullParticipantInfoResponse decode = PullParticipantInfoResponse.ADAPTER.decode(bArr);
        if (decode == null) {
            return null;
        }
        return C60930c.m237018m(decode.user_infos);
    }

    @XMethod
    public static AdminSettings syncGetAdminSettings(String str) {
        GetAdminSettingsRequest.C50593a aVar = new GetAdminSettingsRequest.C50593a();
        if (!TextUtils.isEmpty(str)) {
            aVar.mo175151a(Long.valueOf(str));
        }
        return (AdminSettings) SdkSender.syncSend(Command.GET_ADMIN_SETTINGS, aVar, $$Lambda$VcBizSender$0vj8OeDu00zD2SMsysdSpbloNI.INSTANCE);
    }

    @XMethod
    public static C60986t syncGetSetting(List<String> list) {
        GetSettingsRequest.C19155a aVar = new GetSettingsRequest.C19155a();
        aVar.mo65459a(list);
        return (C60986t) SdkSender.syncSend(Command.GET_SETTINGS, aVar, $$Lambda$VcBizSender$zDAfpYAhYnt2KhQl7oTEtun3gUM.INSTANCE);
    }

    @XMethod
    public static List<VirtualBackgroundInfo> syncGetVcVirtualBackground(List<VirtualBackground> list) {
        GetVcVirtualBackgroundRequest.C50711a aVar = new GetVcVirtualBackgroundRequest.C50711a();
        aVar.mo175406a(C60930c.m237028w(list));
        return (List) SdkSender.syncSend(Command.GET_VC_VIRTUAL_BACKGROUND, aVar, $$Lambda$VcBizSender$v4fmHyOLyfaFm9YS61uZxhivoGA.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static /* synthetic */ VideoChatH323Setting m249311t(byte[] bArr) throws IOException {
        GetH323AccessInfoByUniqueIDResponse decode = GetH323AccessInfoByUniqueIDResponse.ADAPTER.decode(bArr);
        if (decode == null) {
            return null;
        }
        return C60930c.m236871a(decode.mh323_access);
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static /* synthetic */ VCFeatureConfig m249312u(byte[] bArr) throws IOException {
        GetPstnSipFeatureConfigResponse decode = GetPstnSipFeatureConfigResponse.ADAPTER.decode(bArr);
        if (decode == null) {
            return null;
        }
        return C60930c.m236862a(decode.mfeature_config);
    }

    /* renamed from: c */
    public static VcBizTask<CalendarInfo> m249251c(String str) {
        return new VcBizTask<>(Command.GET_CALENDAR_INFO, new GetCalendarInfoRequest.C50627a().mo175228a(str), $$Lambda$VcBizSender$YGYzlh7CECAnxl23zqb4YdCPsFE.INSTANCE);
    }

    /* renamed from: d */
    public static VcBizTask<C60971e> m249260d(String str) {
        CheckGuestJoinVcRequest.C50501a aVar = new CheckGuestJoinVcRequest.C50501a();
        aVar.mo174916a(str);
        aVar.build();
        return new VcBizTask<>(Command.CHECK_GUEST_JOIN_VC, aVar, new SdkSender.IParser<C60971e>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass31 */

            /* renamed from: a */
            public C60971e parse(byte[] bArr) throws IOException {
                return C60930c.m236947a(CheckGuestJoinVcResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: f */
    public static VcBizTask<C60989x> m249274f(String str) {
        return new VcBizTask<>(Command.LIVE_MEETING_GET_VERIFICATION_INFO, new GetVerificationInfoRequest.C50717a().mo175419a(str), new SdkSender.IParser() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass55 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public Object parse(byte[] bArr) throws IOException {
                return C60930c.m236963a(GetVerificationInfoResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: g */
    public static VcBizTask<GetsuggetedParticipants> m249280g(String str) {
        return new VcBizTask<>(Command.GET_SUGGESTED_PARTICIPANTS, new GetSuggestedParticipantsRequest.C50675a().mo175328a(str), new SdkSender.IParser() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass58 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public Object parse(byte[] bArr) throws IOException {
                return C60930c.m236885a(GetSuggestedParticipantsResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ GetAuthChattersResponse m249284h(byte[] bArr) throws IOException {
        com.bytedance.lark.pb.contact.v2.GetAuthChattersResponse decode = com.bytedance.lark.pb.contact.v2.GetAuthChattersResponse.ADAPTER.decode(bArr);
        C60871a.m236611b("VcBizSender", "getChatterAuthInfo: " + decode);
        return C60930c.m236835a(decode);
    }

    /* renamed from: i */
    public static VcBizTask<AdminSettings> m249290i(String str) {
        GetAdminSettingsRequest.C50593a aVar = new GetAdminSettingsRequest.C50593a();
        if (!TextUtils.isEmpty(str)) {
            aVar.mo175151a(Long.valueOf(str));
        }
        return new VcBizTask<>(Command.GET_ADMIN_SETTINGS, aVar, new SdkSender.IParser<AdminSettings>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass84 */

            /* renamed from: a */
            public AdminSettings parse(byte[] bArr) throws IOException {
                return C60930c.m236829a(GetAdminSettingsResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: j */
    public static VcBizTask<C60976j> m249293j(String str) {
        return new VcBizTask<>(Command.VC_OWNER_FORCE_TRANSFER_HOST, new ForceTransferHostRequest.C50587a().mo175138a(str), new SdkSender.IParser<C60976j>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass88 */

            /* renamed from: a */
            public C60976j parse(byte[] bArr) throws IOException {
                return C60930c.m236951a(ForceTransferHostResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: k */
    public static VcBizTask<DelVcVirtualBackgroundResponse> m249296k(String str) {
        DelVcVirtualBackgroundRequest.C50523a aVar = new DelVcVirtualBackgroundRequest.C50523a();
        aVar.mo174981a(str);
        return new VcBizTask<>(Command.DEL_VC_VIRTUAL_BACKGROUND, aVar, new SdkSender.IParser<DelVcVirtualBackgroundResponse>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass95 */

            /* renamed from: a */
            public DelVcVirtualBackgroundResponse parse(byte[] bArr) throws IOException {
                DelVcVirtualBackgroundResponse decode = DelVcVirtualBackgroundResponse.ADAPTER.decode(bArr);
                if (decode == null) {
                    return null;
                }
                return decode;
            }
        }, true);
    }

    /* renamed from: l */
    public static VcBizTask<CalendarVCSettingsEntity> m249299l(String str) {
        GetCalendarVCSettingsRequest.C50631a aVar = new GetCalendarVCSettingsRequest.C50631a();
        aVar.f126370a = str;
        return new VcBizTask<>(Command.GET_CALENDAR_VC_SETTINGS, aVar, new SdkSender.IParser<CalendarVCSettingsEntity>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass100 */

            /* renamed from: a */
            public CalendarVCSettingsEntity parse(byte[] bArr) throws IOException {
                return C60930c.m236908a(GetCalendarVCSettingsResponse.ADAPTER.decode(bArr).settings);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ CheckVcManageCapabilitiesEntity m249301m(byte[] bArr) throws IOException {
        CheckVCManageCapabilitiesResponse decode = CheckVCManageCapabilitiesResponse.ADAPTER.decode(bArr);
        C60871a.m236611b("VcBizSender", "checkVCManageCapabilities" + decode);
        return C60930c.m236834a(decode);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static /* synthetic */ String m249306o(byte[] bArr) throws IOException {
        VCManageApprovalResponse decode = VCManageApprovalResponse.ADAPTER.decode(bArr);
        if (decode == null) {
            return null;
        }
        return decode.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static /* synthetic */ ByteViewUserInfo m249308q(byte[] bArr) throws IOException {
        PullParticipantInfoResponse decode = PullParticipantInfoResponse.ADAPTER.decode(bArr);
        if (decode == null) {
            return null;
        }
        List<ByteViewUserInfo> m = C60930c.m237018m(decode.user_infos);
        if (m.isEmpty()) {
            return null;
        }
        return m.get(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static /* synthetic */ List m249310s(byte[] bArr) throws IOException {
        GetParticipantsByIdsResponse decode = GetParticipantsByIdsResponse.ADAPTER.decode(bArr);
        ArrayList arrayList = new ArrayList();
        if (!(decode == null || decode.participants == null || decode.participants.size() < 1)) {
            for (com.ss.android.lark.pb.videoconference.v1.Participant participant : decode.participants) {
                arrayList.add(C60932d.m237035a(participant));
            }
        }
        return arrayList;
    }

    @XMethod
    public static GetAdminSettingsResponse syncGetAdminSettingsResponse(String str) {
        GetAdminSettingsRequest.C50593a aVar = new GetAdminSettingsRequest.C50593a();
        if (!TextUtils.isEmpty(str)) {
            aVar.mo175151a(Long.valueOf(str));
        }
        Command command = Command.GET_ADMIN_SETTINGS;
        ProtoAdapter<GetAdminSettingsResponse> protoAdapter = GetAdminSettingsResponse.ADAPTER;
        protoAdapter.getClass();
        return (GetAdminSettingsResponse) SdkSender.syncSend(command, aVar, new SdkSender.IParser() {
            /* class com.ss.android.vc.net.request.$$Lambda$fatiZozTZuskRNq1e2EVht8cj8k */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (GetAdminSettingsResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public static /* synthetic */ String m249317z(byte[] bArr) throws IOException {
        SendHttpResponse decode = SendHttpResponse.ADAPTER.decode(bArr);
        C60871a.m236611b("FollowLog_getDocsToken", "json_body = " + decode.json_body);
        if (decode.http_status_code.intValue() == 200) {
            try {
                return new JSONObject(decode.json_body).getString(ConvertOfficeToSpaceService.f88308f);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Map af(byte[] bArr) throws IOException {
        MGetRoomsResponse decode = MGetRoomsResponse.ADAPTER.decode(bArr);
        if (decode.rooms == null || decode.rooms.size() <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, com.ss.android.lark.pb.videoconference.v1.Room> entry : decode.rooms.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey()) && entry.getValue() != null) {
                hashMap.put(entry.getKey(), C60932d.m237037a(entry.getValue()));
            }
        }
        return hashMap;
    }

    /* renamed from: e */
    public static VcBizTask<C60982p> m249268e(String str) {
        return new VcBizTask<>(Command.GET_MEETING_URL_INFO, new GetMeetingURLInfoRequest.C50657a().mo175290a(str), new SdkSender.IParser<C60982p>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass33 */

            /* renamed from: a */
            public C60982p parse(byte[] bArr) throws IOException {
                return C60930c.m236956a(GetMeetingURLInfoResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: h */
    public static VcBizTask<C60975i> m249286h(String str) {
        FetchAllSketchDataRequest.C50553a aVar = new FetchAllSketchDataRequest.C50553a();
        aVar.mo175054a(str);
        return new VcBizTask<>(Command.FETCH_ALL_SKETCH_DATA, aVar, new SdkSender.IParser<C60975i>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass59 */

            /* renamed from: a */
            public C60975i parse(byte[] bArr) throws IOException {
                return C60930c.m236950a(FetchAllSketchDataResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: i */
    public static VcBizTask<C60988w> m249291i(List<String> list) {
        return new VcBizTask<>(Command.MGET_ROOMS, new MGetRoomsRequest.C50851a().mo175742a(list), new SdkSender.IParser<C60988w>() {
            /* class com.ss.android.vc.net.request.VcBizSender.C635906 */

            /* renamed from: a */
            public C60988w parse(byte[] bArr) throws IOException {
                return C60930c.m236962a(MGetRoomsResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ List m249294j(byte[] bArr) throws IOException {
        GetVcVirtualBackgroundResponse decode = GetVcVirtualBackgroundResponse.ADAPTER.decode(bArr);
        if (decode == null) {
            return null;
        }
        return C60930c.m237026u(decode.infos);
    }

    /* renamed from: f */
    public static VcBizTask<C60986t> m249276f(List<String> list) {
        GetSettingsRequest.C19155a aVar = new GetSettingsRequest.C19155a();
        aVar.mo65459a(list);
        return new VcBizTask<>(Command.GET_SETTINGS, aVar, $$Lambda$VcBizSender$JypVRmc5KuLx78gWo0PpjngDvk.INSTANCE);
    }

    /* renamed from: g */
    public static VcBizTask<SetVcVirtualBackgroundEntity> m249282g(List<C60935a> list) {
        SetVcVirtualBackgroundRequest.C51026a aVar = new SetVcVirtualBackgroundRequest.C51026a();
        ArrayList arrayList = new ArrayList();
        for (C60935a aVar2 : list) {
            arrayList.add(new SetVcVirtualBackgroundRequest.CustomVirtualBackground(aVar2.mo209692a(), aVar2.mo209693b(), MaterialSource.fromValue(aVar2.mo209694c().getValue())));
        }
        aVar.mo176165a(arrayList);
        aVar.mo176164a((Boolean) false);
        return new VcBizTask<>(Command.SET_VC_VIRTUAL_BACKGROUND, aVar, $$Lambda$VcBizSender$vyspied7sGlSD3oXhdddsYEAHYY.INSTANCE, true);
    }

    /* renamed from: h */
    public static VcBizTask<C60988w> m249287h(List<String> list) {
        return new VcBizTask<>(Command.MGET_CHATTERS, new MGetChattersRequest.C16324a().mo58370a(list), new SdkSender.IParser<C60988w>() {
            /* class com.ss.android.vc.net.request.VcBizSender.C635895 */

            /* renamed from: a */
            public C60988w parse(byte[] bArr) throws IOException {
                return C60930c.m236961a(MGetChattersResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: d */
    public static VcBizTask<C60991z> m249263d(List<String> list) {
        return new VcBizTask<>(Command.GET_VIEW_I18N_TEMPLATE, new GetViewI18nTemplateRequest.C50725a().mo175438a(list), new SdkSender.IParser<C60991z>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass89 */

            /* renamed from: a */
            public C60991z parse(byte[] bArr) throws IOException {
                return C60930c.m236965a(GetViewI18nTemplateResponse.ADAPTER.decode(bArr));
            }
        }, true);
    }

    /* renamed from: b */
    public static VcBizTask<GetPhoneNumberAttributtonEntity> m249229b(String str) {
        GetPhoneNumberAttributtonRequest.C50326a aVar = new GetPhoneNumberAttributtonRequest.C50326a();
        aVar.mo174534a(str).build();
        return new VcBizTask<>(com.ss.android.lark.pb.improto.Command.GET_PHONE_NUMBER_ATTRIBUTION, aVar, $$Lambda$VcBizSender$NlWpmXy93UkM8XMf_mJch2qKWM.INSTANCE);
    }

    /* renamed from: c */
    public static VcBizTask<List<com.ss.android.vc.entity.Participant>> m249255c(List<String> list) {
        return new VcBizTask<>(Command.GET_PARTICIPANTS_BY_IDS, new GetParticipantsByIdsRequest.C50665a().mo175307a(list), $$Lambda$VcBizSender$snqv5gZAYYaewzF8azekRtYEbx8.INSTANCE);
    }

    /* renamed from: c */
    public static void m249256c(AbstractC63598b<C60977k> bVar) {
        new VcBizTask(com.ss.android.lark.pb.improto.Command.GET_ADMIN_PERMISSION_INFO, new GetAdminPermissionInfoRequest.C50002a(), $$Lambda$VcBizSender$i9_XE1P0uYSPU7731V5ATaVuDrQ.INSTANCE).mo219893b(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ VideoChatSearchChatterResponse m249134a(String str, byte[] bArr) throws IOException {
        SearchResponse a = C62530a.m244584a(VCSearchUserInMeetingResponse.ADAPTER.decode(bArr).users);
        a.setSearchKey(str);
        VideoChatSearchChatterResponse videoChatSearchChatterResponse = new VideoChatSearchChatterResponse();
        videoChatSearchChatterResponse.setSearchResponse(a);
        return videoChatSearchChatterResponse;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ VideoChatSearchChatterResponse m249224b(String str, byte[] bArr) throws IOException {
        SearchResponse a = C62530a.m244584a(VCSearchUserInMeetingResponse.ADAPTER.decode(bArr).users);
        a.setSearchKey(str);
        VideoChatSearchChatterResponse videoChatSearchChatterResponse = new VideoChatSearchChatterResponse();
        videoChatSearchChatterResponse.setSearchResponse(a);
        return videoChatSearchChatterResponse;
    }

    @XMethod
    public static void getSIPDomainByUniqueID(String str, AbstractC63598b<String> bVar) {
        GetSIPDomainByUniqueIDRequest.C50350a aVar = new GetSIPDomainByUniqueIDRequest.C50350a();
        if (!TextUtils.isEmpty(str)) {
            aVar.mo174589a(Long.valueOf(str));
        }
        new VcBizTask(com.ss.android.lark.pb.improto.Command.GET_SIP_DOMAIN_BY_UNIQUE_ID, aVar, $$Lambda$VcBizSender$eU5luu3ZXwJ8NzIQ4c8mT3XHAkU.INSTANCE).mo219893b(bVar);
    }

    /* renamed from: b */
    public static VcBizTask<C60990y> m249226b(int i, String str) {
        return new VcBizTask<>(Command.LIVE_MEETING_GET_VERIFICATION_TICKET, new GetVerificationTicketRequest.C50721a().mo175428a(Integer.valueOf(i)).mo175429a(str), new SdkSender.IParser() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass57 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public Object parse(byte[] bArr) throws IOException {
                return C60930c.m236964a(GetVerificationTicketResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: c */
    public static VcBizTask<SketchStartEntity> m249252c(String str, String str2) {
        SketchStartRequest.C51084a aVar = new SketchStartRequest.C51084a();
        aVar.mo176312a(str);
        aVar.mo176314b(str2);
        return new VcBizTask<>(Command.SKETCH_START, aVar, new SdkSender.IParser<SketchStartEntity>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass60 */

            /* renamed from: a */
            public SketchStartEntity parse(byte[] bArr) throws IOException {
                return C60930c.m236924a(SketchStartResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: d */
    public static VcBizTask<C60961ag> m249261d(String str, String str2) {
        PullAllFollowStatesRequest.C50916a aVar = new PullAllFollowStatesRequest.C50916a();
        aVar.mo175897a(str).mo175899b(str2);
        return new VcBizTask<>(Command.PULL_ALL_FOLLOW_STATES, aVar, new SdkSender.IParser<C60961ag>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass70 */

            /* renamed from: a */
            public C60961ag parse(byte[] bArr) throws IOException {
                return C60930c.m236929a(PullAllFollowStatesResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: f */
    public static VcBizTask<C60966b> m249275f(String str, String str2) {
        return new VcBizTask<>(Command.APPLY_BYTEVIEW_ACCESSIBILITY, new ApplyByteviewAccessibilityRequest.C50461a().mo174821a(str).mo174823b(str2), new SdkSender.IParser<C60966b>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass75 */

            /* renamed from: a */
            public C60966b parse(byte[] bArr) throws IOException {
                ApplyByteviewAccessibilityResponse.ADAPTER.decode(bArr);
                return new C60966b();
            }
        });
    }

    /* renamed from: g */
    public static VcBizTask<C60933b> m249281g(String str, String str2) {
        EntrustServerTrackRequest.C50537a aVar = new EntrustServerTrackRequest.C50537a();
        aVar.mo175020a(str);
        aVar.mo175022b(str2);
        return new VcBizTask<>(Command.ENTRUST_SERVER_TRACK, aVar, new SdkSender.IParser<C60933b>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass97 */

            /* renamed from: a */
            public C60933b parse(byte[] bArr) throws IOException {
                return new C60933b();
            }
        });
    }

    /* renamed from: b */
    public static VcBizTask<C60972f> m249227b(ChannelMeta.GrootChannel grootChannel, String str) {
        CloseGrootChannelRequest.C50509a aVar = new CloseGrootChannelRequest.C50509a();
        ChannelMeta.C50499a aVar2 = new ChannelMeta.C50499a();
        aVar2.mo174910a(GrootChannel.fromValue(grootChannel.getValue()));
        aVar2.mo174911a(str);
        aVar.mo174935a(aVar2.build());
        return new VcBizTask<>(Command.CLOSE_GROOT_CHANNEL, aVar, $$Lambda$VcBizSender$kYKKF9UJDPcvVQSqeXzv84WfHrI.INSTANCE);
    }

    /* renamed from: c */
    public static VcBizTask<List<ByteViewUserInfo>> m249253c(String str, Map<String, ParticipantType> map) {
        return new VcBizTask<>(Command.PULL_PARTICIPANT_INFO, new PullParticipantInfoRequest.C50920a().mo175907a(str).mo175908a(C60930c.m237005a(map)), $$Lambda$VcBizSender$pC5UNdHnOMhQt8k8lAlxYR5WKcc.INSTANCE);
    }

    /* renamed from: d */
    public static VcBizTask<String> m249262d(String str, boolean z) {
        ParticipantSettings.C50910a aVar = new ParticipantSettings.C50910a();
        aVar.mo175880c(Boolean.valueOf(z));
        ParticipantChangeSettingsRequest.C50906a aVar2 = new ParticipantChangeSettingsRequest.C50906a();
        aVar2.mo175859a(aVar.build());
        aVar2.mo175861a(str);
        return new VcBizTask<>(Command.PARTICIPANT_CHANGE_SETTINGS, aVar2, $$Lambda$VcBizSender$PDlnITtcakqTHXEs1_ChbZTjpXk.INSTANCE, true);
    }

    /* renamed from: e */
    public static VcBizTask<String> m249269e(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("Cookie", "session=" + str2);
        SendHttpRequest.C15253a aVar = new SendHttpRequest.C15253a();
        aVar.mo55528a(str + "/suite/api/login/disposable/?app_id=2").mo55529a(hashMap).mo55526a(SendHttpRequest.Method.POST);
        return new VcBizTask<>(Command.SEND_HTTP, aVar, $$Lambda$VcBizSender$pzF8xAxxYj3UMFieOspaJ69Ad4.INSTANCE);
    }

    /* renamed from: a */
    public static VcBizTask<C60939i> m249136a(int i, String str) {
        return new VcBizTask<>(Command.REPLY_VIDEO_CHAT_NOTICE, new ReplyVideoChatNoticeRequest.C50974a().mo176041a(ReplyVideoChatNoticeRequest.Action.fromValue(i)).mo176042a(str), new SdkSender.IParser<C60939i>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass24 */

            /* renamed from: a */
            public C60939i parse(byte[] bArr) throws IOException {
                ReplyVideoChatNoticeResponse.ADAPTER.decode(bArr);
                return new C60939i();
            }
        });
    }

    /* renamed from: c */
    public static VcBizTask<au> m249254c(String str, boolean z) {
        SyncSubtitlesRequest.C51108a aVar = new SyncSubtitlesRequest.C51108a();
        aVar.mo176374a(str).mo176373a(Boolean.valueOf(z));
        return new VcBizTask<>(Command.SYNC_SUBTITLES, aVar, new SdkSender.IParser() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass44 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public Object parse(byte[] bArr) throws IOException {
                return C60930c.m236939a(SyncSubtitlesResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: e */
    public static VcBizTask<String> m249270e(String str, boolean z) {
        RequestFollowPermRequest.C50982a aVar = new RequestFollowPermRequest.C50982a();
        if (!TextUtils.isEmpty(str)) {
            aVar.f127011a = str;
        }
        aVar.f127012b = "";
        aVar.f127013c = Boolean.valueOf(z);
        return new VcBizTask<>(Command.REQUEST_FOLLOW_PERM, aVar, new SdkSender.IParser<String>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass61 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                RequestFollowPermResponse decode = RequestFollowPermResponse.ADAPTER.decode(bArr);
                if (decode == null) {
                    return null;
                }
                return decode.toString();
            }
        });
    }

    /* renamed from: f */
    public static void m249277f(String str, AbstractC63598b<ay> bVar) {
        GetUserProfileRequest.C16280a aVar = new GetUserProfileRequest.C16280a();
        aVar.mo58277a(str);
        aVar.mo58279b((Boolean) true);
        aVar.mo58276a((Boolean) false);
        aVar.mo58280b("");
        new VcBizTask(Command.GET_USER_PROFILE, aVar, $$Lambda$VcBizSender$JkPvsGzM7fmFGCcusF5TfAN5DX0.INSTANCE).mo219893b(bVar);
    }

    /* renamed from: g */
    public static void m249283g(String str, AbstractC63598b<Object> bVar) {
        if (!TextUtils.isEmpty(str)) {
            KeepMeetingRequest.C50364a aVar = new KeepMeetingRequest.C50364a();
            aVar.mo174619a(str);
            new VcBizTask(com.ss.android.lark.pb.improto.Command.KEEP_MEETING, aVar, $$Lambda$VcBizSender$ay8yM3919Xj5SGEcypKiHe2kvPc.INSTANCE).mo219889a(bVar);
        }
    }

    /* renamed from: d */
    public static void m249264d(String str, AbstractC63598b<bb> bVar) {
        new VcBizTask(com.ss.android.lark.pb.improto.Command.LIVE_MEETING_PULL_SETTING, new VideoChatPullLiveSettingRequest.C50429a().mo174750a(str), $$Lambda$VcBizSender$0KIkdZPEsBFJ4yCT8QrqvnV7UM.INSTANCE).mo219893b(bVar);
    }

    /* renamed from: e */
    public static void m249271e(String str, AbstractC63598b<ReservationInfoEntity> bVar) {
        new VcBizTask(com.ss.android.lark.pb.improto.Command.GET_RESERVATION, new GetReservationRequest.C50334a().mo174555a(str), $$Lambda$VcBizSender$rAlcZjT5FWF71GYSQUCq29E5uGs.INSTANCE).mo219893b(bVar);
    }

    /* renamed from: b */
    public static VcBizTask<C60979m> m249230b(String str, IDTypeEntity iDTypeEntity) {
        GetAssociatedVideoChatStatusRequest.C50605a aVar = new GetAssociatedVideoChatStatusRequest.C50605a();
        aVar.mo175181a(str);
        aVar.mo175180a(IDType.fromValue(iDTypeEntity.getNumber()));
        return new VcBizTask<>(Command.GET_ASSOCIATED_VC_STATUS, aVar, new SdkSender.IParser<C60979m>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass37 */

            /* renamed from: a */
            public C60979m parse(byte[] bArr) throws IOException {
                return C60930c.m236954a(GetAssociatedVideoChatStatusResponse.ADAPTER.decode(bArr));
            }
        });
    }

    @XMethod
    public static void getH323Setting(String str, String str2, AbstractC63598b<VideoChatH323Setting> bVar) {
        GetH323AccessInfoByUniqueIDRequest.C50322a aVar = new GetH323AccessInfoByUniqueIDRequest.C50322a();
        if (!TextUtils.isEmpty(str)) {
            aVar.mo174524a(Long.valueOf(str));
        }
        if (!TextUtils.isEmpty(str2)) {
            aVar.mo174525a(str2);
        }
        new VcBizTask(com.ss.android.lark.pb.improto.Command.GET_H323_ACCESS_BY_UNIQUE_ID, aVar, $$Lambda$VcBizSender$XR5SKWZSKUVFPOvNW9FezVqFpbQ.INSTANCE).mo219893b(bVar);
    }

    /* renamed from: a */
    public static VcBizTask<ReplyFollowNoticeResponse> m249137a(int i, String str, String str2) {
        return new VcBizTask<>(Command.REPLY_FOLLOW_NOTICE, new ReplyFollowNoticeRequest.C50970a().mo176030a(ReplyFollowNoticeRequest.Action.fromValue(i)).mo176031a(str).mo176033b(str2), new SdkSender.IParser<ReplyFollowNoticeResponse>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass25 */

            /* renamed from: a */
            public ReplyFollowNoticeResponse parse(byte[] bArr) throws IOException {
                return ReplyFollowNoticeResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* renamed from: a */
    private static JoinMeetingRequest.C50837a m249133a(boolean z, boolean z2, boolean z3, boolean z4) {
        ParticipantSettings.EquipmentStatus equipmentStatus = ParticipantSettings.EquipmentStatus.NORMAL;
        ParticipantSettings.EquipmentStatus equipmentStatus2 = ParticipantSettings.EquipmentStatus.NORMAL;
        if (!z3) {
            equipmentStatus = ParticipantSettings.EquipmentStatus.NO_PERMISSION;
        }
        if (!z4) {
            equipmentStatus2 = ParticipantSettings.EquipmentStatus.NO_PERMISSION;
        }
        com.ss.android.lark.pb.videoconference.v1.ParticipantSettings a = new ParticipantSettings.C50910a().mo175874a(Boolean.valueOf(z)).mo175878b(Boolean.valueOf(z2)).mo175872a(equipmentStatus2).mo175877b(equipmentStatus).build();
        JoinMeetingRequest.Invitee invitee = new JoinMeetingRequest.Invitee(Collections.EMPTY_LIST, Collections.EMPTY_LIST);
        JoinMeetingRequest.CreationMetaData creationMetaData = new JoinMeetingRequest.CreationMetaData(null, null, null, null, null, null, null);
        JoinMeetingRequest.SelfParticipantInfo selfParticipantInfo = new JoinMeetingRequest.SelfParticipantInfo(com.ss.android.lark.pb.videoconference.v1.ParticipantType.LARK_USER, a);
        JoinMeetingRequest.C50837a aVar = new JoinMeetingRequest.C50837a();
        aVar.mo175711a(invitee);
        aVar.mo175713a(selfParticipantInfo);
        aVar.mo175709a(creationMetaData);
        return aVar;
    }

    /* renamed from: b */
    public static VcBizTask<C60960af> m249228b(ChannelMeta.GrootChannel grootChannel, String str, String str2, int i) {
        OpenGrootChannelRequest.C50892a aVar = new OpenGrootChannelRequest.C50892a();
        ChannelMeta.C50499a aVar2 = new ChannelMeta.C50499a();
        aVar2.mo174910a(GrootChannel.fromValue(grootChannel.getValue())).mo174911a(str);
        aVar.mo175824a(aVar2.build()).mo175826a(Long.valueOf(str2));
        if (i >= 0) {
            aVar.mo175825a(Integer.valueOf(i));
        }
        return new VcBizTask<>(Command.OPEN_GROOT_CHANNEL, aVar, $$Lambda$VcBizSender$iTFnrXphvS5urcH2jcRCMUwakU.INSTANCE);
    }

    @XMethod
    public static void getPstnSipFeatureConfig(String str, String str2, String str3, GetPstnSipFeatureConfigRequest.CalendarType calendarType, AbstractC63598b<VCFeatureConfig> bVar) {
        GetPstnSipFeatureConfigRequest.C50330a aVar = new GetPstnSipFeatureConfigRequest.C50330a();
        if (!TextUtils.isEmpty(str)) {
            aVar.mo174544a(Long.valueOf(str));
        }
        if (!TextUtils.isEmpty(str2)) {
            aVar.mo174546b(Long.valueOf(str2));
        }
        if (!TextUtils.isEmpty(str3)) {
            aVar.mo174547c(Long.valueOf(str3));
        }
        aVar.mo174543a(calendarType);
        new VcBizTask(com.ss.android.lark.pb.improto.Command.GET_PSTN_SIP_FC, aVar, $$Lambda$VcBizSender$zKsfIaWuzP6JKFAoQob4nxYZ80.INSTANCE).mo219893b(bVar);
    }

    /* renamed from: a */
    private static JoinMeetingRequest.C50837a m249132a(boolean z, boolean z2, boolean z3, String str, boolean z4, boolean z5) {
        com.ss.android.lark.pb.videoconference.v1.ParticipantSettings participantSettings;
        ParticipantSettings.EquipmentStatus equipmentStatus = ParticipantSettings.EquipmentStatus.NORMAL;
        ParticipantSettings.EquipmentStatus equipmentStatus2 = ParticipantSettings.EquipmentStatus.NORMAL;
        if (!z4) {
            equipmentStatus = ParticipantSettings.EquipmentStatus.NO_PERMISSION;
        }
        if (!z5) {
            equipmentStatus2 = ParticipantSettings.EquipmentStatus.NO_PERMISSION;
        }
        if (z3) {
            participantSettings = new ParticipantSettings.C50910a().mo175874a(Boolean.valueOf(z)).mo175878b(Boolean.valueOf(z2)).mo175872a(equipmentStatus2).mo175877b(equipmentStatus).mo175881c(str).build();
        } else {
            participantSettings = new ParticipantSettings.C50910a().mo175874a(Boolean.valueOf(z)).mo175878b(Boolean.valueOf(z2)).mo175872a(equipmentStatus2).mo175877b(equipmentStatus).build();
        }
        JoinMeetingRequest.Invitee invitee = new JoinMeetingRequest.Invitee(Collections.EMPTY_LIST, Collections.EMPTY_LIST);
        JoinMeetingRequest.CreationMetaData creationMetaData = new JoinMeetingRequest.CreationMetaData(null, null, null, null, null, null, null);
        JoinMeetingRequest.SelfParticipantInfo selfParticipantInfo = new JoinMeetingRequest.SelfParticipantInfo(com.ss.android.lark.pb.videoconference.v1.ParticipantType.LARK_USER, participantSettings);
        JoinMeetingRequest.C50837a aVar = new JoinMeetingRequest.C50837a();
        aVar.mo175711a(invitee);
        aVar.mo175713a(selfParticipantInfo);
        aVar.mo175709a(creationMetaData);
        return aVar;
    }

    /* renamed from: a */
    public static VcBizTask<ax> m249138a(int i, String str, String str2, boolean z, boolean z2, ParticipantSettings.EquipmentStatus equipmentStatus, ParticipantSettings.EquipmentStatus equipmentStatus2, VideoChat.UpdateVideoChatAction updateVideoChatAction, long j) {
        UpdateVideoChatRequest.C51140a a = new UpdateVideoChatRequest.C51140a().mo176450a(UpdateVideoChatRequest.Action.fromValue(i)).mo176452a(str).mo176455b(str2).mo176449a(new ParticipantSettings.C50910a().mo175874a(Boolean.valueOf(z)).mo175878b(Boolean.valueOf(z2)).mo175872a(ModelHelper.m236798a(equipmentStatus)).mo175877b(ModelHelper.m236798a(equipmentStatus2)).build());
        if (updateVideoChatAction == VideoChat.UpdateVideoChatAction.ACCEPT) {
            a.mo176448a(new ActionTime.C50455a().mo174809b(Long.valueOf(j)).build());
        }
        return new VcBizTask<>(Command.UPDATE_VIDEO_CHAT, a, new SdkSender.IParser<ax>() {
            /* class com.ss.android.vc.net.request.VcBizSender.AnonymousClass62 */

            /* renamed from: a */
            public ax parse(byte[] bArr) throws IOException {
                return C60930c.m236942a(UpdateVideoChatResponse.ADAPTER.decode(bArr));
            }
        });
    }
}
