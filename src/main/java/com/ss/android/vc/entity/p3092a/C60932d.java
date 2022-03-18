package com.ss.android.vc.entity.p3092a;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.ChatterMeetingStatus;
import com.bytedance.lark.pb.basic.v1.Content;
import com.bytedance.lark.pb.basic.v1.RoomMeetingStatus;
import com.bytedance.lark.pb.basic.v1.VideoChatContent;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.pb.videochat.BreakoutRoomInfo;
import com.ss.android.lark.pb.videoconference.v1.BreakoutRoomInfo;
import com.ss.android.lark.pb.videoconference.v1.CalendarInfo;
import com.ss.android.lark.pb.videoconference.v1.FollowAction;
import com.ss.android.lark.pb.videoconference.v1.GetFeedbackReasonsResponse;
import com.ss.android.lark.pb.videoconference.v1.RegisterClientInfoResponse;
import com.ss.android.lark.pb.videoconference.v1.VcDocs;
import com.ss.android.lark.pb.videoconference.v1.VideoChatInfo;
import com.ss.android.lark.pb.videoconference.v1.VideoChatPrompt;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.vc.C60657a;
import com.ss.android.vc.dto.VideoChatContent;
import com.ss.android.vc.entity.ActionTime;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.CalendarInfo;
import com.ss.android.vc.entity.CalendarLocation;
import com.ss.android.vc.entity.ContainerType;
import com.ss.android.vc.entity.FeedbackReasons;
import com.ss.android.vc.entity.InMeetingData;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantMeetingRole;
import com.ss.android.vc.entity.ParticipantRole;
import com.ss.android.vc.entity.ParticipantRoleSettings;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.RegisterClientInfoEntity;
import com.ss.android.vc.entity.Room;
import com.ss.android.vc.entity.VcDoc;
import com.ss.android.vc.entity.VcDocShareStatus;
import com.ss.android.vc.entity.VcDocSubType;
import com.ss.android.vc.entity.VcDocType;
import com.ss.android.vc.entity.VcI18nKeyInfo;
import com.ss.android.vc.entity.VcMsgInfo;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatCapabilities;
import com.ss.android.vc.entity.VideoChatCombinedInfo;
import com.ss.android.vc.entity.VideoChatExtraInfo;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.entity.sketch.SketchTransferMode;
import com.ss.android.vc.meeting.module.VCBreakoutRoomInfo;
import com.ss.android.vc.meeting.module.VCBreakoutRoomInfoSettings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.vc.entity.a.d */
public class C60932d {
    /* renamed from: a */
    public static List<Participant> m237050a(List<com.ss.android.lark.pb.videoconference.v1.Participant> list) {
        ArrayList arrayList = new ArrayList();
        for (com.ss.android.lark.pb.videoconference.v1.Participant participant : list) {
            Participant a = m237035a(participant);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static VCBreakoutRoomInfo m237047a(BreakoutRoomInfo breakoutRoomInfo) {
        if (breakoutRoomInfo == null) {
            return null;
        }
        VCBreakoutRoomInfo vCBreakoutRoomInfo = new VCBreakoutRoomInfo();
        vCBreakoutRoomInfo.setChannelId(breakoutRoomInfo.channel_id);
        vCBreakoutRoomInfo.setBreakoutRoomId(breakoutRoomInfo.breakout_room_id);
        vCBreakoutRoomInfo.setRoomTopic(breakoutRoomInfo.topic);
        vCBreakoutRoomInfo.setStatus(VCBreakoutRoomInfo.Status.fromValue(breakoutRoomInfo.status.getValue()));
        vCBreakoutRoomInfo.setStartTime(breakoutRoomInfo.start_time.longValue());
        VCBreakoutRoomInfoSettings a = m237049a(breakoutRoomInfo.settings);
        if (a != null) {
            vCBreakoutRoomInfo.setSettings(a);
        }
        vCBreakoutRoomInfo.setCountDownFromStartTime(breakoutRoomInfo.count_down_from_start_time.longValue());
        return vCBreakoutRoomInfo;
    }

    /* renamed from: a */
    public static VCBreakoutRoomInfo m237046a(com.ss.android.lark.pb.videochat.BreakoutRoomInfo breakoutRoomInfo) {
        if (breakoutRoomInfo == null) {
            return null;
        }
        VCBreakoutRoomInfo vCBreakoutRoomInfo = new VCBreakoutRoomInfo();
        vCBreakoutRoomInfo.setChannelId(breakoutRoomInfo.mchannel_id);
        vCBreakoutRoomInfo.setBreakoutRoomId(breakoutRoomInfo.mbreakout_room_id);
        vCBreakoutRoomInfo.setRoomTopic(breakoutRoomInfo.mtopic);
        vCBreakoutRoomInfo.setStatus(VCBreakoutRoomInfo.Status.fromValue(breakoutRoomInfo.mstatus.getValue()));
        vCBreakoutRoomInfo.setStartTime(breakoutRoomInfo.mstart_time.longValue());
        VCBreakoutRoomInfoSettings a = m237048a(breakoutRoomInfo.msettings);
        if (a != null) {
            vCBreakoutRoomInfo.setSettings(a);
        }
        vCBreakoutRoomInfo.setCountDownFromStartTime(breakoutRoomInfo.mcount_down_from_start_time.longValue());
        return vCBreakoutRoomInfo;
    }

    /* renamed from: a */
    private static VCBreakoutRoomInfoSettings m237049a(BreakoutRoomInfo.BreakoutRoomInfoSettings breakoutRoomInfoSettings) {
        if (breakoutRoomInfoSettings == null) {
            return null;
        }
        VCBreakoutRoomInfoSettings vCBreakoutRoomInfoSettings = new VCBreakoutRoomInfoSettings();
        vCBreakoutRoomInfoSettings.setArticipantUnmuteDeny(breakoutRoomInfoSettings.participant_unmute_deny.booleanValue());
        vCBreakoutRoomInfoSettings.setMuteOnEntry(breakoutRoomInfoSettings.mute_on_entry.booleanValue());
        vCBreakoutRoomInfoSettings.setOnlyPresenterCanAnnote(breakoutRoomInfoSettings.only_presenter_can_annotate.booleanValue());
        List<ByteviewUser> g = C60930c.m237012g(breakoutRoomInfoSettings.snapshot_users);
        if (!CollectionUtils.isEmpty(g)) {
            vCBreakoutRoomInfoSettings.setSnapShotUsers(g);
        }
        return vCBreakoutRoomInfoSettings;
    }

    /* renamed from: a */
    private static VideoChatSettings m237045a(com.ss.android.lark.pb.videoconference.v1.VideoChatSettings videoChatSettings) {
        if (videoChatSettings == null) {
            return null;
        }
        int i = 6;
        VideoChatSettings videoChatSettings2 = new VideoChatSettings();
        videoChatSettings2.setTopic(videoChatSettings.topic);
        videoChatSettings2.setCameraMuted(videoChatSettings.is_camera_muted.booleanValue());
        videoChatSettings2.setMicrophoneMuted(videoChatSettings.is_microphone_muted.booleanValue());
        if (videoChatSettings.max_participant_num.intValue() > 0) {
            i = videoChatSettings.max_participant_num.intValue();
        }
        videoChatSettings2.setMaxParticipantNum(i);
        videoChatSettings2.setMaxVideoChatDuration(videoChatSettings.max_videochat_duration.intValue());
        videoChatSettings2.setPlanType(VideoChatSettings.PlanType.forNumber(videoChatSettings.plan_type.getValue()));
        videoChatSettings2.setSubType(VideoChatSettings.SubType.forNumber(videoChatSettings.sub_type.getValue()));
        videoChatSettings2.setSecuritySetting(C60930c.m236852a(videoChatSettings.security_setting));
        videoChatSettings2.setMuteOnEntry(videoChatSettings.is_mute_on_entry.booleanValue());
        videoChatSettings2.setPlanTimeLimit(videoChatSettings.plan_time_limit.intValue());
        videoChatSettings2.setFeatureConfig(C60930c.m236863a(videoChatSettings.feature_config));
        videoChatSettings2.setAllowPartiUnMute(videoChatSettings.allow_parti_unmute.booleanValue());
        videoChatSettings2.setSIPSetting(C60930c.m236877a(videoChatSettings.sip_setting));
        videoChatSettings2.setIsOwnerJoinedMeeting(videoChatSettings.is_owner_joined_meeting.booleanValue());
        videoChatSettings2.setMaxSoftRtcNormalMode(videoChatSettings.max_soft_rtc_normal_mode.intValue());
        videoChatSettings2.setMeetingOpenInterpretation(videoChatSettings.is_meeting_open_interpretation.booleanValue());
        videoChatSettings2.setCountDownDuration(videoChatSettings.countdown_duration.intValue());
        videoChatSettings2.setMeetingSupportLanguages(C60930c.m237024s(videoChatSettings.meeting_support_languages));
        if (videoChatSettings.manage_capabilities != null) {
            videoChatSettings2.setManageCapability(C60930c.m236865a(videoChatSettings.manage_capabilities));
        }
        videoChatSettings2.setOnlyHostCanShare(videoChatSettings.only_host_can_share.booleanValue());
        videoChatSettings2.setOnlyHostCanReplaceShare(videoChatSettings.only_host_can_replace_share.booleanValue());
        videoChatSettings2.setOnlyPresenterCanAnnotate(videoChatSettings.only_presenter_can_annotate.booleanValue());
        videoChatSettings2.setBoxSharing(videoChatSettings.is_box_sharing.booleanValue());
        videoChatSettings2.setH323Setting(C60930c.m236872a(videoChatSettings.h323_setting));
        videoChatSettings2.setRTCProxy(C60930c.m236861a(videoChatSettings.rtc_proxy));
        videoChatSettings2.setOpenBreakoutRoom(videoChatSettings.is_open_breakout_room.booleanValue());
        return videoChatSettings2;
    }

    /* renamed from: a */
    private static VideoChatSettings m237044a(com.ss.android.lark.pb.videochat.VideoChatSettings videoChatSettings) {
        if (videoChatSettings == null) {
            return null;
        }
        int i = 6;
        VideoChatSettings videoChatSettings2 = new VideoChatSettings();
        videoChatSettings2.setTopic(videoChatSettings.mtopic);
        videoChatSettings2.setCameraMuted(videoChatSettings.mis_camera_muted.booleanValue());
        videoChatSettings2.setMicrophoneMuted(videoChatSettings.mis_microphone_muted.booleanValue());
        if (videoChatSettings.mmax_participant_num.intValue() > 0) {
            i = videoChatSettings.mmax_participant_num.intValue();
        }
        videoChatSettings2.setMaxParticipantNum(i);
        videoChatSettings2.setMaxVideoChatDuration(videoChatSettings.mmax_videochat_duration.intValue());
        videoChatSettings2.setPlanType(VideoChatSettings.PlanType.forNumber(videoChatSettings.mplan_type.getValue()));
        videoChatSettings2.setSubType(VideoChatSettings.SubType.forNumber(videoChatSettings.msub_type.getValue()));
        videoChatSettings2.setSecuritySetting(C60930c.m236851a(videoChatSettings.msecurity_setting));
        videoChatSettings2.setMuteOnEntry(videoChatSettings.mis_mute_on_entry.booleanValue());
        videoChatSettings2.setPlanTimeLimit(videoChatSettings.mplan_time_limit.intValue());
        videoChatSettings2.setFeatureConfig(C60930c.m236862a(videoChatSettings.mfeature_config));
        videoChatSettings2.setAllowPartiUnMute(videoChatSettings.mallow_parti_unmute.booleanValue());
        videoChatSettings2.setSIPSetting(C60930c.m236876a(videoChatSettings.msip_setting));
        videoChatSettings2.setIsOwnerJoinedMeeting(videoChatSettings.mis_owner_joined_meeting.booleanValue());
        videoChatSettings2.setMaxSoftRtcNormalMode(videoChatSettings.mmax_soft_rtc_normal_mode.intValue());
        videoChatSettings2.setMeetingOpenInterpretation(videoChatSettings.mis_meeting_open_interpretation.booleanValue());
        videoChatSettings2.setCountDownDuration(videoChatSettings.mcountdown_duration.intValue());
        videoChatSettings2.setMeetingSupportLanguages(C60930c.m237025t(videoChatSettings.mmeeting_support_languages));
        if (videoChatSettings.mmanage_capabilities != null) {
            videoChatSettings2.setManageCapability(C60930c.m236864a(videoChatSettings.mmanage_capabilities));
        }
        videoChatSettings2.setOnlyHostCanShare(videoChatSettings.monly_host_can_share.booleanValue());
        videoChatSettings2.setOnlyHostCanReplaceShare(videoChatSettings.monly_host_can_replace_share.booleanValue());
        videoChatSettings2.setOnlyPresenterCanAnnotate(videoChatSettings.monly_presenter_can_annotate.booleanValue());
        videoChatSettings2.setBoxSharing(videoChatSettings.mis_box_sharing.booleanValue());
        videoChatSettings2.setH323Setting(C60930c.m236871a(videoChatSettings.mh323_setting));
        videoChatSettings2.setRTCProxy(C60930c.m236860a(videoChatSettings.mrtc_proxy));
        videoChatSettings2.setOpenBreakoutRoom(videoChatSettings.mis_open_breakout_room.booleanValue());
        return videoChatSettings2;
    }

    /* renamed from: a */
    public static VideoChat m237040a(VideoChatInfo videoChatInfo) {
        if (videoChatInfo == null) {
            return null;
        }
        VideoChat videoChat = new VideoChat();
        videoChat.setId(videoChatInfo.id);
        videoChat.setHostId(videoChatInfo.host_id);
        videoChat.setHostDeviceId(videoChatInfo.host_device_id);
        videoChat.setHostType(ParticipantType.valueOf(videoChatInfo.host_type.getValue()));
        videoChat.setGroudId(videoChatInfo.group_id);
        videoChat.setInfo(videoChatInfo.info);
        videoChat.setInviteId(videoChatInfo.inviter_id);
        videoChat.setInviterType(ParticipantType.valueOf(videoChatInfo.inviter_type.getValue()));
        videoChat.setForce(videoChatInfo.force.booleanValue());
        videoChat.setStartTime(videoChatInfo.start_time.longValue());
        videoChat.setMeetNumber(videoChatInfo.meet_number);
        videoChat.setVoiceCall(videoChatInfo.is_voice_call.booleanValue());
        videoChat.setSponsorUser(C60930c.m236832a(videoChatInfo.sponsor));
        videoChat.setTenantId(videoChatInfo.tenant_id);
        videoChat.setIsLarkMeeting(videoChatInfo.is_lark_meeting.booleanValue());
        if (videoChatInfo.meeting_owner != null) {
            videoChat.setMeetingOwner(C60930c.m236832a(videoChatInfo.meeting_owner));
        }
        if (videoChatInfo.type != null) {
            videoChat.setType(VideoChat.Type.valueOf(videoChatInfo.type.getValue()));
        }
        if (videoChatInfo.end_reason != null) {
            videoChat.setEndReason(VideoChat.EndReason.valueOf(videoChatInfo.end_reason.getValue()));
        }
        if (videoChatInfo.action_time != null) {
            ActionTime actionTime = new ActionTime();
            actionTime.setInviteTime(videoChatInfo.action_time.invite.longValue());
            actionTime.setAcceptTime(videoChatInfo.action_time.accept.longValue());
            actionTime.setPushTime(videoChatInfo.action_time.push.longValue());
            videoChat.setActionTime(actionTime);
        }
        if (videoChatInfo.participants != null) {
            ArrayList arrayList = new ArrayList();
            for (com.ss.android.lark.pb.videoconference.v1.Participant participant : videoChatInfo.participants) {
                Participant a = m237035a(participant);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            videoChat.setParticipants(arrayList);
        }
        videoChat.setExternalForRing(videoChatInfo.is_external_meeting_when_ring.booleanValue());
        videoChat.setPushSid(videoChatInfo.sid);
        if (videoChatInfo.vendor_type != null) {
            videoChat.setVendorType(VideoChat.VendorType.valueOf(videoChatInfo.vendor_type.getValue()));
        }
        videoChat.setMeetingSource(VideoChat.MeetingSource.valueOf(videoChatInfo.meeting_source.getValue()));
        videoChat.setVideoChatSettings(m237045a(videoChatInfo.settings));
        if (videoChatInfo.msg != null) {
            VcMsgInfo vcMsgInfo = new VcMsgInfo();
            vcMsgInfo.type = VcMsgInfo.Type.valueOf(videoChatInfo.msg.type.ordinal());
            vcMsgInfo.expire = videoChatInfo.msg.expire.intValue();
            vcMsgInfo.message = videoChatInfo.msg.message;
            vcMsgInfo.is_override = videoChatInfo.msg.is_override.booleanValue();
            vcMsgInfo.is_show = videoChatInfo.msg.is_show.booleanValue();
            if (videoChatInfo.msg.msg_i18n_key != null) {
                vcMsgInfo.msg_i18n_key = new VcI18nKeyInfo();
                vcMsgInfo.msg_i18n_key.key = videoChatInfo.msg.msg_i18n_key.key;
                vcMsgInfo.msg_i18n_key.params = videoChatInfo.msg.msg_i18n_key.params;
                vcMsgInfo.msg_i18n_key.type = VcI18nKeyInfo.Type.valueOf(videoChatInfo.msg.msg_i18n_key.type.getValue());
                vcMsgInfo.msg_i18n_key.jumpScheme = videoChatInfo.msg.msg_i18n_key.jump_scheme;
                vcMsgInfo.msg_i18n_key.newKey = videoChatInfo.msg.msg_i18n_key.new_key;
            }
            videoChat.setMsgInfo(vcMsgInfo);
        }
        if (!CollectionUtils.isEmpty(videoChatInfo.breakout_room_infos)) {
            ArrayList arrayList2 = new ArrayList();
            for (BreakoutRoomInfo breakoutRoomInfo : videoChatInfo.breakout_room_infos) {
                VCBreakoutRoomInfo a2 = m237047a(breakoutRoomInfo);
                if (a2 != null) {
                    arrayList2.add(a2);
                }
            }
            videoChat.setBreakoutRoomInfos(arrayList2);
        }
        return videoChat;
    }

    /* renamed from: a */
    public static VideoChat m237039a(com.ss.android.lark.pb.videochat.VideoChatInfo videoChatInfo) {
        if (videoChatInfo == null) {
            return null;
        }
        VideoChat videoChat = new VideoChat();
        videoChat.setId(videoChatInfo.mid);
        videoChat.setHostId(videoChatInfo.mhost_id);
        videoChat.setHostDeviceId(videoChatInfo.mhost_device_id);
        videoChat.setHostType(ParticipantType.valueOf(videoChatInfo.mhost_type.getValue()));
        videoChat.setGroudId(videoChatInfo.mgroup_id);
        videoChat.setInfo(videoChatInfo.minfo);
        videoChat.setInviteId(videoChatInfo.minviter_id);
        if (videoChatInfo.minviter_type != null) {
            videoChat.setInviterType(ParticipantType.valueOf(videoChatInfo.minviter_type.getValue()));
        }
        videoChat.setForce(videoChatInfo.mforce.booleanValue());
        videoChat.setStartTime(videoChatInfo.mstart_time.longValue());
        videoChat.setMeetNumber(videoChatInfo.mmeet_number);
        videoChat.setVoiceCall(videoChatInfo.mis_voice_call.booleanValue());
        videoChat.setSponsorUser(C60930c.m236831a(videoChatInfo.msponsor));
        videoChat.setTenantId(videoChatInfo.mtenant_id);
        videoChat.setIsLarkMeeting(videoChatInfo.mis_lark_meeting.booleanValue());
        if (videoChatInfo.mmeeting_owner != null) {
            videoChat.setMeetingOwner(C60930c.m236831a(videoChatInfo.mmeeting_owner));
        }
        if (videoChatInfo.mtype != null) {
            videoChat.setType(VideoChat.Type.valueOf(videoChatInfo.mtype.getValue()));
        }
        if (videoChatInfo.mend_reason != null) {
            videoChat.setEndReason(VideoChat.EndReason.valueOf(videoChatInfo.mend_reason.getValue()));
        }
        if (videoChatInfo.maction_time != null) {
            ActionTime actionTime = new ActionTime();
            actionTime.setInviteTime(videoChatInfo.maction_time.minvite.longValue());
            actionTime.setAcceptTime(videoChatInfo.maction_time.maccept.longValue());
            actionTime.setPushTime(videoChatInfo.maction_time.mpush.longValue());
            videoChat.setActionTime(actionTime);
        }
        if (videoChatInfo.mparticipants != null) {
            ArrayList arrayList = new ArrayList();
            for (com.ss.android.lark.pb.videochat.Participant participant : videoChatInfo.mparticipants) {
                Participant a = m237034a(participant);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            videoChat.setParticipants(arrayList);
        }
        videoChat.setExternalForRing(videoChatInfo.mis_external_meeting_when_ring.booleanValue());
        videoChat.setPushSid(videoChatInfo.mpush_sid);
        if (videoChatInfo.mvendor_type != null) {
            videoChat.setVendorType(VideoChat.VendorType.valueOf(videoChatInfo.mvendor_type.getValue()));
        }
        videoChat.setMeetingSource(VideoChat.MeetingSource.valueOf(videoChatInfo.mmeeting_source.getValue()));
        videoChat.setVideoChatSettings(m237044a(videoChatInfo.msettings));
        if (videoChatInfo.mmsg != null) {
            VcMsgInfo vcMsgInfo = new VcMsgInfo();
            vcMsgInfo.type = VcMsgInfo.Type.valueOf(videoChatInfo.mmsg.mtype.ordinal());
            vcMsgInfo.expire = videoChatInfo.mmsg.mexpire.intValue();
            vcMsgInfo.message = videoChatInfo.mmsg.mmessage;
            vcMsgInfo.is_override = videoChatInfo.mmsg.mis_override.booleanValue();
            vcMsgInfo.is_show = videoChatInfo.mmsg.mis_show.booleanValue();
            if (videoChatInfo.mmsg.mmsg_i18n_key != null) {
                vcMsgInfo.msg_i18n_key = new VcI18nKeyInfo();
                vcMsgInfo.msg_i18n_key.key = videoChatInfo.mmsg.mmsg_i18n_key.mkey;
                vcMsgInfo.msg_i18n_key.params = videoChatInfo.mmsg.mmsg_i18n_key.mparams;
                vcMsgInfo.msg_i18n_key.type = VcI18nKeyInfo.Type.valueOf(videoChatInfo.mmsg.mmsg_i18n_key.mtype.getValue());
                vcMsgInfo.msg_i18n_key.jumpScheme = videoChatInfo.mmsg.mmsg_i18n_key.mjump_scheme;
                vcMsgInfo.msg_i18n_key.newKey = videoChatInfo.mmsg.mmsg_i18n_key.mnew_key;
            }
            videoChat.setMsgInfo(vcMsgInfo);
        }
        if (!CollectionUtils.isEmpty(videoChatInfo.mbreakout_room_infos)) {
            ArrayList arrayList2 = new ArrayList();
            for (com.ss.android.lark.pb.videochat.BreakoutRoomInfo breakoutRoomInfo : videoChatInfo.mbreakout_room_infos) {
                VCBreakoutRoomInfo a2 = m237046a(breakoutRoomInfo);
                if (a2 != null) {
                    arrayList2.add(a2);
                }
            }
            videoChat.setBreakoutRoomInfos(arrayList2);
        }
        return videoChat;
    }

    /* renamed from: a */
    public static VideoChatExtraInfo m237042a(com.ss.android.lark.pb.videoconference.v1.VideoChatExtraInfo videoChatExtraInfo) {
        if (videoChatExtraInfo == null) {
            return null;
        }
        VideoChatExtraInfo videoChatExtraInfo2 = new VideoChatExtraInfo();
        if (videoChatExtraInfo.type != null) {
            videoChatExtraInfo2.type = VideoChatExtraInfo.Type.valueOf(videoChatExtraInfo.type.getValue());
        }
        if (videoChatExtraInfo.ringing_received_data != null) {
            VideoChatExtraInfo.RingingReceivedData ringingReceivedData = new VideoChatExtraInfo.RingingReceivedData();
            ringingReceivedData.meetingId = videoChatExtraInfo.ringing_received_data.meeting_id;
            if (videoChatExtraInfo.ringing_received_data.participant != null) {
                Participant participant = new Participant();
                participant.setRingingReceived(videoChatExtraInfo.ringing_received_data.participant.ringing_received.booleanValue());
                participant.setHost(videoChatExtraInfo.ringing_received_data.participant.is_host.booleanValue());
                participant.setId(videoChatExtraInfo.ringing_received_data.participant.id);
                if (videoChatExtraInfo.ringing_received_data.participant.status != null) {
                    participant.setStatus(Participant.Status.forNumber(videoChatExtraInfo.ringing_received_data.participant.status.getValue()));
                }
                ringingReceivedData.participant = participant;
            }
            videoChatExtraInfo2.ringingReceivedData = ringingReceivedData;
        }
        if (videoChatExtraInfo.action_time != null) {
            ActionTime actionTime = new ActionTime();
            actionTime.setAcceptTime(videoChatExtraInfo.action_time.accept.longValue());
            actionTime.setInviteTime(videoChatExtraInfo.action_time.invite.longValue());
            actionTime.setPushTime(videoChatExtraInfo.action_time.push.longValue());
            videoChatExtraInfo2.actionTime = actionTime;
        }
        if (videoChatExtraInfo.in_meeting_data != null) {
            videoChatExtraInfo2.inMeetingDatas = m237051b(videoChatExtraInfo.in_meeting_data);
        }
        if (videoChatExtraInfo.subtitle != null) {
            videoChatExtraInfo2.mMeetingSubtitleData = C60930c.m236855a(videoChatExtraInfo.subtitle);
        }
        videoChatExtraInfo2.version = videoChatExtraInfo.version;
        if (videoChatExtraInfo.live_extra_info != null) {
            videoChatExtraInfo2.mLiveExtraInfo = C60930c.m236897a(videoChatExtraInfo.live_extra_info);
        }
        return videoChatExtraInfo2;
    }

    /* renamed from: a */
    public static VideoChatInMeetingInfo m237043a(com.ss.android.lark.pb.videoconference.v1.VideoChatInMeetingInfo videoChatInMeetingInfo) {
        if (videoChatInMeetingInfo == null) {
            return null;
        }
        VideoChatInMeetingInfo videoChatInMeetingInfo2 = new VideoChatInMeetingInfo();
        videoChatInMeetingInfo2.setId(videoChatInMeetingInfo.id);
        videoChatInMeetingInfo2.setHostId(videoChatInMeetingInfo.host_id);
        videoChatInMeetingInfo2.setMeetingUrl(videoChatInMeetingInfo.meeting_url);
        videoChatInMeetingInfo2.setHostDeviceId(videoChatInMeetingInfo.host_device_id);
        videoChatInMeetingInfo2.setVersion(videoChatInMeetingInfo.version);
        videoChatInMeetingInfo2.setVideoChatSettings(m237045a(videoChatInMeetingInfo.meeting_settings));
        videoChatInMeetingInfo2.setHostType(ParticipantType.valueOf(videoChatInMeetingInfo.host_type.getValue()));
        videoChatInMeetingInfo2.setShouldPullSuggested(videoChatInMeetingInfo.should_pull_suggested.booleanValue());
        if (videoChatInMeetingInfo.share_screen_in_meeting_info != null) {
            InMeetingData.ScreenSharedData screenSharedData = new InMeetingData.ScreenSharedData();
            screenSharedData.setSharing(videoChatInMeetingInfo.share_screen_in_meeting_info.is_sharing.booleanValue());
            screenSharedData.setParticipantId(videoChatInMeetingInfo.share_screen_in_meeting_info.participant_id);
            screenSharedData.setParticipantDeviceId(videoChatInMeetingInfo.share_screen_in_meeting_info.participant_device_id);
            screenSharedData.setWidth(videoChatInMeetingInfo.share_screen_in_meeting_info.width.intValue());
            screenSharedData.setHeight(videoChatInMeetingInfo.share_screen_in_meeting_info.height.intValue());
            screenSharedData.setParticipantType(ParticipantType.valueOf(videoChatInMeetingInfo.share_screen_in_meeting_info.participant_type.getValue()));
            screenSharedData.setShareScreenId(videoChatInMeetingInfo.share_screen_in_meeting_info.share_screen_id);
            screenSharedData.setCanSketch(videoChatInMeetingInfo.share_screen_in_meeting_info.can_sketch.booleanValue());
            screenSharedData.setSketch(videoChatInMeetingInfo.share_screen_in_meeting_info.is_sketch.booleanValue());
            screenSharedData.setAccessibility(videoChatInMeetingInfo.share_screen_in_meeting_info.accessibility.booleanValue());
            screenSharedData.setPortraitMode(videoChatInMeetingInfo.share_screen_in_meeting_info.is_portrait_mode.booleanValue());
            screenSharedData.setSketchTransferMode(SketchTransferMode.fromNumber(videoChatInMeetingInfo.share_screen_in_meeting_info.sketch_transfer_mode.getValue()));
            videoChatInMeetingInfo2.setScreenSharedData(screenSharedData);
        }
        videoChatInMeetingInfo2.setRecordMeetingData(C60930c.m236841a(videoChatInMeetingInfo.recording_data));
        if (videoChatInMeetingInfo.vc_type != null) {
            videoChatInMeetingInfo2.setType(VideoChat.Type.valueOf(videoChatInMeetingInfo.vc_type.getValue()));
        }
        videoChatInMeetingInfo2.setFollowInfo(C60930c.m236890a(videoChatInMeetingInfo.follow_info));
        videoChatInMeetingInfo2.setRecording(videoChatInMeetingInfo.is_recording.booleanValue());
        videoChatInMeetingInfo2.setHasRecorded(videoChatInMeetingInfo.has_recorded.booleanValue());
        videoChatInMeetingInfo2.setSubtitleOn(videoChatInMeetingInfo.is_subtitle_on.booleanValue());
        if (videoChatInMeetingInfo.live_info != null) {
            videoChatInMeetingInfo2.setLiveInfo(C60930c.m236899a(videoChatInMeetingInfo.live_info));
        }
        if (videoChatInMeetingInfo.breakout_room_infos != null) {
            ArrayList arrayList = new ArrayList();
            for (BreakoutRoomInfo breakoutRoomInfo : videoChatInMeetingInfo.breakout_room_infos) {
                VCBreakoutRoomInfo a = m237047a(breakoutRoomInfo);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            videoChatInMeetingInfo2.setBreakoutRoomInfos(arrayList);
        }
        return videoChatInMeetingInfo2;
    }

    /* renamed from: a */
    public static Room m237037a(com.ss.android.lark.pb.videoconference.v1.Room room) {
        Room room2 = new Room();
        room2.avatarKey = room.avatar_key;
        room2.backgroundUrl = room.background_url;
        room2.capacity = room.capacity.intValue();
        room2.controllerIdList = new ArrayList(room.controller_id_list);
        room2.meetingNumber = room.meeting_number;
        room2.name = room.name;
        room2.roomId = room.room_id;
        room2.fullNameParticipant = room.full_name_participant;
        room2.fullNameSite = room.full_name_site;
        room2.primaryNameParticipant = room.primary_name_participant;
        room2.primaryNameSite = room.primary_name_site;
        room2.secondaryName = room.secondary_name;
        if (room.location != null) {
            Room.Location location = new Room.Location();
            location.buildingName = room.location.building_name;
            location.floorName = room.location.floor_name;
            room2.location = location;
        }
        return room2;
    }

    /* renamed from: a */
    private static VcDoc m237038a(VcDocs vcDocs) {
        VcDoc vcDoc = new VcDoc();
        vcDoc.setDocTitle(vcDocs.doc_title);
        vcDoc.setDocHighlightTitle(vcDocs.doc_title_highlight);
        vcDoc.setDocAbstract(vcDocs.abstract_);
        vcDoc.setDocOwner(vcDocs.owner_name);
        vcDoc.setOwnerId(vcDocs.owner_id);
        vcDoc.setDocToken(vcDocs.doc_token);
        vcDoc.setDocType(VcDocType.forNumber(vcDocs.doc_type.getValue()));
        vcDoc.setCrossTenant(vcDocs.is_cross_tenant.booleanValue());
        vcDoc.setShareStatus(VcDocShareStatus.forNumber(vcDocs.status.getValue()));
        vcDoc.setDocUrl(vcDocs.doc_url);
        vcDoc.setDocSubType(VcDocSubType.forNumber(vcDocs.doc_sub_type.getValue()));
        vcDoc.setThumbnailDetail(C60930c.m236895a(vcDocs.thumbnail));
        vcDoc.setDocLabelUrl(vcDocs.doc_label_url);
        vcDoc.setContainerType(ContainerType.fromValue(vcDocs.container_type.getValue()));
        return vcDoc;
    }

    /* renamed from: a */
    public static VideoChatCombinedInfo m237041a(com.ss.android.lark.pb.videoconference.v1.VideoChatCombinedInfo videoChatCombinedInfo) {
        if (videoChatCombinedInfo == null) {
            return null;
        }
        VideoChatCombinedInfo videoChatCombinedInfo2 = new VideoChatCombinedInfo();
        videoChatCombinedInfo2.setVideoChatInMeetingInfo(m237043a(videoChatCombinedInfo.in_meeting_info));
        videoChatCombinedInfo2.setCalendarInfo(m237032a(videoChatCombinedInfo.calendar_info));
        return videoChatCombinedInfo2;
    }

    /* renamed from: c */
    public static List<VcDoc> m237052c(List<VcDocs> list) {
        ArrayList arrayList = new ArrayList();
        for (VcDocs vcDocs : list) {
            arrayList.add(m237038a(vcDocs));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static VCBreakoutRoomInfoSettings m237048a(BreakoutRoomInfo.BreakoutRoomInfoSettings breakoutRoomInfoSettings) {
        if (breakoutRoomInfoSettings == null) {
            return null;
        }
        VCBreakoutRoomInfoSettings vCBreakoutRoomInfoSettings = new VCBreakoutRoomInfoSettings();
        vCBreakoutRoomInfoSettings.setArticipantUnmuteDeny(breakoutRoomInfoSettings.mparticipant_unmute_deny.booleanValue());
        vCBreakoutRoomInfoSettings.setMuteOnEntry(breakoutRoomInfoSettings.mmute_on_entry.booleanValue());
        vCBreakoutRoomInfoSettings.setOnlyPresenterCanAnnote(breakoutRoomInfoSettings.monly_presenter_can_annotate.booleanValue());
        List<ByteviewUser> h = C60930c.m237013h(breakoutRoomInfoSettings.msnapshot_users);
        if (!CollectionUtils.isEmpty(h)) {
            vCBreakoutRoomInfoSettings.setSnapShotUsers(h);
        }
        return vCBreakoutRoomInfoSettings;
    }

    /* renamed from: d */
    private static boolean m237053d(List<Participant> list) {
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
    public static RegisterClientInfoEntity m237036a(RegisterClientInfoResponse registerClientInfoResponse) {
        RegisterClientInfoEntity registerClientInfoEntity = new RegisterClientInfoEntity();
        if (registerClientInfoResponse == null) {
            return registerClientInfoEntity;
        }
        ArrayList arrayList = new ArrayList();
        if (registerClientInfoResponse.infos != null) {
            for (VideoChatInfo videoChatInfo : registerClientInfoResponse.infos) {
                arrayList.add(m237040a(videoChatInfo));
            }
        }
        registerClientInfoEntity.setVideoChat(arrayList);
        registerClientInfoEntity.setMeetingId(registerClientInfoResponse.meeting_id);
        if (registerClientInfoResponse.status != null) {
            registerClientInfoEntity.setStatusCode(RegisterClientInfoEntity.StatusCode.fromValue(registerClientInfoResponse.status.getValue()));
        }
        if (registerClientInfoResponse.prompts != null) {
            ArrayList arrayList2 = new ArrayList();
            for (VideoChatPrompt videoChatPrompt : registerClientInfoResponse.prompts) {
                arrayList2.add(C60930c.m236875a(videoChatPrompt));
            }
            registerClientInfoEntity.setVideoChatPrompts(arrayList2);
        }
        return registerClientInfoEntity;
    }

    /* renamed from: e */
    private static boolean m237054e(List<Long> list) {
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
    public static FeedbackReasons m237033a(GetFeedbackReasonsResponse getFeedbackReasonsResponse) {
        FeedbackReasons feedbackReasons = new FeedbackReasons();
        if (getFeedbackReasonsResponse.multi_items != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (getFeedbackReasonsResponse.multi_items.video_items != null && getFeedbackReasonsResponse.multi_items.video_items.size() > 0) {
                for (GetFeedbackReasonsResponse.FeedbackReasonItem feedbackReasonItem : getFeedbackReasonsResponse.multi_items.video_items) {
                    if (feedbackReasonItem != null) {
                        arrayList.add(new FeedbackReasons.FeedbackReasonItem(feedbackReasonItem.subkey, feedbackReasonItem.message));
                    }
                }
            }
            if (getFeedbackReasonsResponse.multi_items.share_screen_items != null && getFeedbackReasonsResponse.multi_items.share_screen_items.size() > 0) {
                for (GetFeedbackReasonsResponse.FeedbackReasonItem feedbackReasonItem2 : getFeedbackReasonsResponse.multi_items.share_screen_items) {
                    if (feedbackReasonItem2 != null) {
                        arrayList2.add(new FeedbackReasons.FeedbackReasonItem(feedbackReasonItem2.subkey, feedbackReasonItem2.message));
                    }
                }
            }
            feedbackReasons.meetingFeedbackReason = new FeedbackReasons.MeetingFeedbackReasonItem(arrayList, arrayList2);
        }
        return feedbackReasons;
    }

    /* renamed from: a */
    public static VideoChatContent m237031a(Object obj) {
        com.bytedance.lark.pb.basic.v1.VideoChatContent videoChatContent;
        Content content = (Content) obj;
        VideoChatContent videoChatContent2 = new VideoChatContent();
        if (content == null || (videoChatContent = content.videochat_content) == null) {
            return videoChatContent2;
        }
        if (videoChatContent.type != null) {
            videoChatContent2.type = videoChatContent.type.getValue();
        }
        VideoChatContent.MeetingCard meetingCard = videoChatContent.meeting_card;
        if (meetingCard != null) {
            VideoChatContent.MeetingCard meetingCard2 = new VideoChatContent.MeetingCard();
            meetingCard2.meetingId = meetingCard.meeting_id;
            meetingCard2.endTime = meetingCard.end_time_ms.longValue();
            meetingCard2.hostId = meetingCard.host_id;
            meetingCard2.forwarderId = meetingCard.forwarder_id;
            if (meetingCard.status != null) {
                meetingCard2.meetingStatus = meetingCard.status.getValue();
            }
            if (meetingCard.meeting_source != null) {
                meetingCard2.meetingSource = meetingCard.meeting_source.getValue();
            }
            meetingCard2.meetNumber = meetingCard.meet_number;
            meetingCard2.calendarId = meetingCard.calendar_uid;
            meetingCard2.sponsorId = meetingCard.sponsor_id;
            meetingCard2.startTime = meetingCard.start_time_ms.longValue();
            meetingCard2.setIsLocked(meetingCard.is_locked.booleanValue());
            meetingCard2.setLobbyOpen(meetingCard.is_open_lobby.booleanValue());
            meetingCard2.topic = meetingCard.topic;
            meetingCard2.maxParticipantCount = meetingCard.max_participant_count.intValue();
            meetingCard2.hostType = ParticipantType.valueOf(meetingCard.host_type.getValue());
            meetingCard2.ownerUserId = meetingCard.owner_user_id;
            if (meetingCard.owner_type != null) {
                meetingCard2.ownerType = ParticipantType.valueOf(meetingCard.owner_type.getValue());
            }
            if (meetingCard.participants != null && meetingCard.participants.size() > 0) {
                for (VideoChatContent.MeetingCard.MeetingParticipant meetingParticipant : meetingCard.participants) {
                    if (meetingParticipant != null) {
                        Participant participant = new Participant();
                        participant.setDeviceId(meetingParticipant.device_id);
                        participant.setJoinTime(meetingParticipant.join_time_ms.longValue());
                        participant.setId(meetingParticipant.user_id);
                        if (meetingParticipant.status != null) {
                            participant.setStatus(Participant.Status.forNumber(meetingParticipant.status.getValue()));
                        }
                        participant.setParticipantType(ParticipantType.valueOf(meetingParticipant.user_type.getValue()));
                        if (!C57782ag.m224241a(meetingParticipant.tenant_id)) {
                            participant.setTenantId(meetingParticipant.tenant_id);
                        }
                        if (meetingParticipant.tenant_tag != null) {
                            participant.setTenantTag(Participant.TenantTag.valueOf(meetingParticipant.tenant_tag.getValue()));
                        }
                        participant.setGuest(meetingParticipant.is_lark_guest.booleanValue());
                        participant.setDeviceType(Participant.DeviceType.valueOf(meetingParticipant.device_type.getValue()));
                        meetingCard2.participants.add(participant);
                    }
                }
            }
            videoChatContent2.meetingCard = meetingCard2;
            if (meetingCard.total_participant_num != null) {
                meetingCard2.totalParticipantNum = meetingCard.total_participant_num.longValue();
            }
            if (meetingCard.all_participant_tenant != null) {
                ArrayList<Long> arrayList = new ArrayList<>();
                for (Long l : meetingCard.all_participant_tenant) {
                    arrayList.add(l);
                }
                meetingCard2.tenantIds = arrayList;
            }
            if (CollectionUtils.isEmpty(meetingCard2.tenantIds)) {
                meetingCard2.isExternal = m237053d(meetingCard2.participants);
            } else {
                meetingCard2.isExternal = m237054e(meetingCard2.tenantIds);
            }
        }
        return videoChatContent2;
    }

    /* renamed from: b */
    public static List<InMeetingData> m237051b(List<com.ss.android.lark.pb.videoconference.v1.InMeetingData> list) {
        ArrayList arrayList = new ArrayList();
        for (com.ss.android.lark.pb.videoconference.v1.InMeetingData inMeetingData : list) {
            InMeetingData inMeetingData2 = new InMeetingData();
            inMeetingData2.setMeetingId(inMeetingData.meeting_id);
            if (inMeetingData.type != null) {
                inMeetingData2.setType(InMeetingData.Type.valueOf(inMeetingData.type.getValue()));
            }
            if (inMeetingData.host_transfer_data != null) {
                InMeetingData.HostTransferredData hostTransferredData = new InMeetingData.HostTransferredData();
                hostTransferredData.setHostId(inMeetingData.host_transfer_data.host_id);
                hostTransferredData.setHostDeviceId(inMeetingData.host_transfer_data.host_device_id);
                hostTransferredData.setHostType(ParticipantType.valueOf(inMeetingData.host_transfer_data.host_type.getValue()));
                inMeetingData2.setHostTransferredData(hostTransferredData);
            }
            if (inMeetingData.mute_all_data != null) {
                InMeetingData.AllMicrophoneMutedData allMicrophoneMutedData = new InMeetingData.AllMicrophoneMutedData();
                allMicrophoneMutedData.setMuted(inMeetingData.mute_all_data.is_muted.booleanValue());
                allMicrophoneMutedData.setOperationUser(C60930c.m236832a(inMeetingData.mute_all_data.operation_user));
                inMeetingData2.setAllMicrophoneMutedData(allMicrophoneMutedData);
            }
            if (inMeetingData.participants_changed_data != null) {
                InMeetingData.ParticipantsChangedData participantsChangedData = new InMeetingData.ParticipantsChangedData();
                if (inMeetingData.participants_changed_data.participants != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (com.ss.android.lark.pb.videoconference.v1.Participant participant : inMeetingData.participants_changed_data.participants) {
                        Participant a = m237035a(participant);
                        if (a != null) {
                            arrayList2.add(a);
                        }
                    }
                    participantsChangedData.setParticipants(arrayList2);
                }
                inMeetingData2.setParticipantsChangedData(participantsChangedData);
            }
            if (inMeetingData.screen_shared_data != null) {
                InMeetingData.ScreenSharedData screenSharedData = new InMeetingData.ScreenSharedData();
                screenSharedData.setSharing(inMeetingData.screen_shared_data.is_sharing.booleanValue());
                screenSharedData.setParticipantId(inMeetingData.screen_shared_data.participant_id);
                screenSharedData.setParticipantDeviceId(inMeetingData.screen_shared_data.participant_device_id);
                screenSharedData.setWidth(inMeetingData.screen_shared_data.width.intValue());
                screenSharedData.setHeight(inMeetingData.screen_shared_data.height.intValue());
                screenSharedData.setParticipantType(ParticipantType.valueOf(inMeetingData.screen_shared_data.participant_type.getValue()));
                screenSharedData.setShareScreenId(inMeetingData.screen_shared_data.share_screen_id);
                screenSharedData.setCanSketch(inMeetingData.screen_shared_data.can_sketch.booleanValue());
                screenSharedData.setSketch(inMeetingData.screen_shared_data.is_sketch.booleanValue());
                screenSharedData.setAccessibility(inMeetingData.screen_shared_data.accessibility.booleanValue());
                screenSharedData.setPortraitMode(inMeetingData.screen_shared_data.is_portrait_mode.booleanValue());
                screenSharedData.setSketchTransferMode(SketchTransferMode.fromNumber(inMeetingData.screen_shared_data.sketch_transfer_mode.getValue()));
                inMeetingData2.setScreenSharedData(screenSharedData);
            }
            if (inMeetingData.settings_changed_data != null) {
                InMeetingData.SettingsChangedData settingsChangedData = new InMeetingData.SettingsChangedData();
                settingsChangedData.setVideoChatSettings(m237045a(inMeetingData.settings_changed_data.meeting_settings));
                inMeetingData2.setSettingsChangedData(settingsChangedData);
            }
            if (inMeetingData.follow_data != null) {
                InMeetingData.FollowData followData = new InMeetingData.FollowData();
                followData.setFollowInfo(C60930c.m236890a(inMeetingData.follow_data.follow_info));
                if (inMeetingData.follow_data.follow_actions != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (FollowAction followAction : inMeetingData.follow_data.follow_actions) {
                        arrayList3.add(C60930c.m236887a(followAction));
                    }
                    followData.setFollowActions(arrayList3);
                }
                followData.setTokenRequester(C60930c.m236832a(inMeetingData.follow_data.token_requester));
                followData.setTokenGranter(C60930c.m236832a(inMeetingData.follow_data.token_granter));
                inMeetingData2.setFollowData(followData);
            }
            if (inMeetingData.live_data != null) {
                inMeetingData2.setLiveMeetingData(C60930c.m236840a(inMeetingData.live_data));
            }
            if (inMeetingData.recording_data != null) {
                inMeetingData2.setRecordMeetingData(C60930c.m236841a(inMeetingData.recording_data));
            }
            if (inMeetingData.subtitle_status_data != null) {
                inMeetingData2.setSubtitleStatusData(C60930c.m236842a(inMeetingData.subtitle_status_data));
            }
            if (inMeetingData.meeting_owner != null) {
                inMeetingData2.setMeetingOwner(C60930c.m236832a(inMeetingData.meeting_owner));
            }
            arrayList.add(inMeetingData2);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static CalendarInfo m237032a(com.ss.android.lark.pb.videoconference.v1.CalendarInfo calendarInfo) {
        if (calendarInfo == null) {
            return null;
        }
        CalendarInfo calendarInfo2 = new CalendarInfo();
        calendarInfo2.setTopic(calendarInfo.topic);
        calendarInfo2.setTheEventStartTime(calendarInfo.the_event_start_time.longValue());
        calendarInfo2.setTheEventEndTime(calendarInfo.the_event_end_time.longValue());
        calendarInfo2.setWholeEventEndTime(calendarInfo.whole_event_end_time.longValue());
        calendarInfo2.setEventType(CalendarInfo.EventType.valueOf(calendarInfo.event_type.getValue()));
        calendarInfo2.setDescription(calendarInfo.description);
        calendarInfo2.setCanEnterOrCreateGroup(calendarInfo.can_enter_or_create_group.booleanValue());
        calendarInfo2.setTotal(calendarInfo.total.intValue());
        if (calendarInfo.users != null) {
            HashMap hashMap = new HashMap();
            hashMap.putAll(calendarInfo.users);
            calendarInfo2.setUsers(C60657a.m235732a().mo208738a(hashMap));
        }
        calendarInfo2.setSubtitles(calendarInfo.subtitles);
        calendarInfo2.setVersionSupport(calendarInfo.version_support);
        calendarInfo2.setAllDay(calendarInfo.is_all_day.booleanValue());
        calendarInfo2.setCreatorId(calendarInfo.creator_id);
        calendarInfo2.setOrganizerId(calendarInfo.organizer_id);
        calendarInfo2.setGroupId(calendarInfo.group_id.longValue());
        if (calendarInfo.rooms != null && calendarInfo.rooms.size() > 0) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry<String, com.ss.android.lark.pb.videoconference.v1.Room> entry : calendarInfo.rooms.entrySet()) {
                hashMap2.put(entry.getKey(), m237037a(entry.getValue()));
            }
            calendarInfo2.setRooms(hashMap2);
        }
        if (calendarInfo.view_rooms != null && calendarInfo.view_rooms.size() > 0) {
            HashMap hashMap3 = new HashMap();
            for (Map.Entry<String, com.ss.android.lark.pb.videoconference.v1.Room> entry2 : calendarInfo.view_rooms.entrySet()) {
                hashMap3.put(entry2.getKey(), m237037a(entry2.getValue()));
            }
            calendarInfo2.setRooms(hashMap3);
        }
        if (calendarInfo.chatter_meeting_status != null && calendarInfo.chatter_meeting_status.size() > 0) {
            HashMap hashMap4 = new HashMap();
            for (Map.Entry<String, ChatterMeetingStatus> entry3 : calendarInfo.chatter_meeting_status.entrySet()) {
                hashMap4.put(entry3.getKey(), com.ss.android.vc.entity.ChatterMeetingStatus.valueOf(entry3.getValue().getValue()));
            }
            calendarInfo2.setUserMeetingStatus(hashMap4);
        }
        if (calendarInfo.room_meeting_status != null && calendarInfo.room_meeting_status.size() > 0) {
            HashMap hashMap5 = new HashMap();
            for (Map.Entry<String, RoomMeetingStatus> entry4 : calendarInfo.room_meeting_status.entrySet()) {
                hashMap5.put(entry4.getKey(), com.ss.android.vc.entity.RoomMeetingStatus.valueOf(entry4.getValue().getValue()));
            }
            calendarInfo2.setRoomMeetingStatus(hashMap5);
        }
        if (calendarInfo.user_status != null && calendarInfo.user_status.size() > 0) {
            HashMap hashMap6 = new HashMap();
            for (Map.Entry<String, CalendarInfo.CalendarAcceptStatus> entry5 : calendarInfo.user_status.entrySet()) {
                hashMap6.put(entry5.getKey(), CalendarInfo.CalendarAcceptStatus.valueOf(entry5.getValue().getValue()));
            }
            calendarInfo2.setUserStatus(hashMap6);
        }
        if (calendarInfo.room_status != null && calendarInfo.room_status.size() > 0) {
            HashMap hashMap7 = new HashMap();
            for (Map.Entry<String, CalendarInfo.CalendarAcceptStatus> entry6 : calendarInfo.room_status.entrySet()) {
                hashMap7.put(entry6.getKey(), CalendarInfo.CalendarAcceptStatus.valueOf(entry6.getValue().getValue()));
            }
            calendarInfo2.setRoomStatus(hashMap7);
        }
        if (calendarInfo.calendar_locations != null && calendarInfo.calendar_locations.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (CalendarInfo.CalendarLocation calendarLocation : calendarInfo.calendar_locations) {
                if (calendarLocation != null) {
                    CalendarLocation calendarLocation2 = new CalendarLocation();
                    calendarLocation2.setName(calendarLocation.name);
                    calendarLocation2.setAddress(calendarLocation.address);
                    arrayList.add(calendarLocation2);
                }
            }
            calendarInfo2.setLocations(arrayList);
        }
        return calendarInfo2;
    }

    /* renamed from: a */
    public static Participant m237034a(com.ss.android.lark.pb.videochat.Participant participant) {
        String str;
        if (participant == null) {
            return null;
        }
        Participant participant2 = new Participant();
        participant2.setId(participant.mid);
        if (participant.mdevice_id == null) {
            str = "";
        } else {
            str = participant.mdevice_id;
        }
        participant2.setDeviceId(str);
        participant2.setHost(participant.mis_host.booleanValue());
        participant2.setGuest(participant.mis_lark_guest.booleanValue());
        if (participant.mstatus != null) {
            participant2.setStatus(Participant.Status.valueOf(participant.mstatus.getValue()));
        }
        if (participant.mdevice_type != null) {
            participant2.setDeviceType(Participant.DeviceType.valueOf(participant.mdevice_type.getValue()));
        }
        if (participant.moffline_reason != null) {
            participant2.setOfflineReason(Participant.OfflineReason.valueOf(participant.moffline_reason.getValue()));
        }
        if (participant.msettings != null) {
            ParticipantSettings participantSettings = new ParticipantSettings();
            participantSettings.setCameraMuted(participant.msettings.mis_camera_muted.booleanValue());
            participantSettings.setMicrophoneMuted(participant.msettings.mis_microphone_muted.booleanValue());
            participantSettings.setCameraStatus(ModelHelper.m236799a(participant.msettings.mcamera_status));
            participantSettings.setMicrophoneStatus(ModelHelper.m236799a(participant.msettings.mmicrophone_status));
            participantSettings.setPlayMeetingTone(participant.msettings.mplay_enter_exit_chimes.booleanValue());
            participantSettings.setSubtitleOn(participant.msettings.mis_translation_on.booleanValue());
            participantSettings.setSpokenLanguage(participant.msettings.mspoken_language);
            participantSettings.setAppliedSpokenLanguage(participant.msettings.mapplied_spoken_language);
            participantSettings.setSubtitleLanguage(participant.msettings.msubtitle_language);
            participantSettings.setFollowingStatus(participant.msettings.mfollowing_status.booleanValue());
            participantSettings.setNickname(participant.msettings.mnickname);
            participantSettings.setEnableSubtitleRecord(participant.msettings.menable_subtitle_record.booleanValue());
            participantSettings.setHandsStatus(ParticipantSettings.HandsStatus.forNumber(participant.msettings.mhands_status.getValue()));
            participantSettings.setRtcMode(ParticipantSettings.RtcMode.forNumber(participant.msettings.mrtc_mode.getValue()));
            if (participant.msettings.minterpreter_setting != null) {
                participantSettings.setInterpreterSetting(C60930c.m236844a(participant.msettings.minterpreter_setting));
            }
            participant2.setParticipantSettings(participantSettings);
        }
        if (participant.mparticipant_role_settings != null) {
            ParticipantRoleSettings participantRoleSettings = new ParticipantRoleSettings();
            participantRoleSettings.setMeetingOwner(participant.mparticipant_role_settings.mis_meeting_owner.booleanValue());
            participantRoleSettings.setMeetingRole(ParticipantMeetingRole.forNumber(participant.mparticipant_role_settings.mmeeting_role.getValue()));
            participant2.setParticipantRoleSettings(participantRoleSettings);
        }
        participant2.setInteractiveId(participant.minteractive_id);
        participant2.setBreakoutRoomId(participant.mbreakout_room_id);
        participant2.setParticipantType(ParticipantType.valueOf(participant.mtype.getValue()));
        participant2.setInviterId(participant.minviter_id);
        participant2.setInviterDeviceId(participant.minviter_device_id);
        participant2.setInviterType(ParticipantType.valueOf(participant.minviter_type.getValue()));
        participant2.setOngoingMeetingId(participant.mongoing_meeting_id);
        participant2.setOngoingInteractiveId(participant.mongoing_meeting_interactive_id);
        participant2.setParticipantRole(ParticipantRole.valueOf(participant.mrole.getValue()));
        participant2.setRtcJoinId(participant.mrtc_join_id);
        participant2.setJoinTime(participant.mjoin_time.longValue());
        participant2.setHandsUpTime(participant.mhands_up_time.longValue());
        participant2.setGlobalSeqId(participant.mglobal_seq_id.longValue());
        if (participant.mtenant_tag != null) {
            participant2.setTenantTag(Participant.TenantTag.valueOf(participant.mtenant_tag.getValue()));
        }
        if (!C57782ag.m224241a(participant.muser_tenant_id)) {
            participant2.setTenantId(participant.muser_tenant_id);
        }
        if (participant.mcapabilities != null) {
            VideoChatCapabilities videoChatCapabilities = new VideoChatCapabilities();
            videoChatCapabilities.setShareScreen(participant.mcapabilities.mshare_screen.booleanValue());
            videoChatCapabilities.setUpdateMeeting(participant.mcapabilities.mupgrade_meeting.booleanValue());
            videoChatCapabilities.setFollow(participant.mcapabilities.mfollow.booleanValue());
            videoChatCapabilities.setFollowPresenter(participant.mcapabilities.mfollow_presenter.booleanValue());
            videoChatCapabilities.setFollowConsumeStrategyIds(participant.mcapabilities.mfollow_consume_strategy_ids);
            videoChatCapabilities.setFollowProduceStrategyIds(participant.mcapabilities.mfollow_produce_strategy_ids);
            videoChatCapabilities.setJoinLobby(participant.mcapabilities.mjoin_lobby.booleanValue());
            videoChatCapabilities.setSupportHandManage(participant.mcapabilities.msupport_hands_up.booleanValue());
            videoChatCapabilities.setBecomeInterpreter(participant.mcapabilities.mbecome_interpreter.booleanValue());
            videoChatCapabilities.setCanBeHost(participant.mcapabilities.mcan_be_host.booleanValue());
            videoChatCapabilities.setCanBeCoHost(participant.mcapabilities.mcan_be_co_host.booleanValue());
            participant2.setCapabilities(videoChatCapabilities);
        }
        if (participant.mpstn_info != null) {
            participant2.setPSTNInfo(C60930c.m236856a(participant.mpstn_info));
        }
        return participant2;
    }

    /* renamed from: a */
    public static Participant m237035a(com.ss.android.lark.pb.videoconference.v1.Participant participant) {
        String str;
        if (participant == null) {
            return null;
        }
        Participant participant2 = new Participant();
        participant2.setId(participant.id);
        String str2 = "";
        if (participant.device_id == null) {
            str = str2;
        } else {
            str = participant.device_id;
        }
        participant2.setDeviceId(str);
        participant2.setHost(participant.is_host.booleanValue());
        participant2.setGuest(participant.is_lark_guest.booleanValue());
        if (participant.sort_name != null) {
            str2 = participant.sort_name;
        }
        participant2.setSortName(str2);
        if (participant.status != null) {
            participant2.setStatus(Participant.Status.valueOf(participant.status.getValue()));
        }
        if (participant.device_type != null) {
            participant2.setDeviceType(Participant.DeviceType.valueOf(participant.device_type.getValue()));
        }
        if (participant.offline_reason != null) {
            participant2.setOfflineReason(Participant.OfflineReason.valueOf(participant.offline_reason.getValue()));
        }
        if (participant.settings != null) {
            ParticipantSettings participantSettings = new ParticipantSettings();
            participantSettings.setCameraMuted(participant.settings.is_camera_muted.booleanValue());
            participantSettings.setMicrophoneMuted(participant.settings.is_microphone_muted.booleanValue());
            participantSettings.setCameraStatus(ModelHelper.m236800a(participant.settings.camera_status));
            participantSettings.setMicrophoneStatus(ModelHelper.m236800a(participant.settings.microphone_status));
            participantSettings.setPlayMeetingTone(participant.settings.play_enter_exit_chimes.booleanValue());
            participantSettings.setSubtitleOn(participant.settings.is_translation_on.booleanValue());
            participantSettings.setSpokenLanguage(participant.settings.spoken_language);
            participantSettings.setAppliedSpokenLanguage(participant.settings.applied_spoken_language);
            participantSettings.setSubtitleLanguage(participant.settings.subtitle_language);
            participantSettings.setFollowingStatus(participant.settings.following_status.booleanValue());
            participantSettings.setNickname(participant.settings.nickname);
            participantSettings.setEnableSubtitleRecord(participant.settings.enable_subtitle_record.booleanValue());
            participantSettings.setHandsStatus(ParticipantSettings.HandsStatus.forNumber(participant.settings.hands_status.getValue()));
            participantSettings.setRtcMode(ParticipantSettings.RtcMode.forNumber(participant.settings.rtc_mode.getValue()));
            if (participant.settings.interpreter_setting != null) {
                participantSettings.setInterpreterSetting(C60930c.m236845a(participant.settings.interpreter_setting));
            }
            participant2.setParticipantSettings(participantSettings);
        }
        if (participant.participant_role_settings != null) {
            ParticipantRoleSettings participantRoleSettings = new ParticipantRoleSettings();
            participantRoleSettings.setMeetingOwner(participant.participant_role_settings.is_meeting_owner.booleanValue());
            participantRoleSettings.setMeetingRole(ParticipantMeetingRole.forNumber(participant.participant_role_settings.meeting_role.getValue()));
            participant2.setParticipantRoleSettings(participantRoleSettings);
        }
        participant2.setInteractiveId(participant.interactive_id);
        participant2.setBreakoutRoomId(participant.breakout_room_id);
        participant2.setParticipantType(ParticipantType.valueOf(participant.type.getValue()));
        participant2.setInviterId(participant.inviter_id);
        participant2.setInviterDeviceId(participant.inviter_device_id);
        participant2.setInviterType(ParticipantType.valueOf(participant.inviter_type.getValue()));
        participant2.setOngoingMeetingId(participant.ongoing_meeting_id);
        participant2.setOngoingInteractiveId(participant.ongoing_meeting_interactive_id);
        participant2.setParticipantRole(ParticipantRole.valueOf(participant.role.getValue()));
        participant2.setRtcJoinId(participant.rtc_join_id);
        participant2.setJoinTime(participant.join_time.longValue());
        participant2.setHandsUpTime(participant.hands_up_time.longValue());
        participant2.setGlobalSeqId(participant.global_seq_id.longValue());
        if (participant.tenant_tag != null) {
            participant2.setTenantTag(Participant.TenantTag.valueOf(participant.tenant_tag.getValue()));
        }
        if (!C57782ag.m224241a(participant.user_tenant_id)) {
            participant2.setTenantId(participant.user_tenant_id);
        }
        if (participant.capabilities != null) {
            VideoChatCapabilities videoChatCapabilities = new VideoChatCapabilities();
            videoChatCapabilities.setShareScreen(participant.capabilities.share_screen.booleanValue());
            videoChatCapabilities.setUpdateMeeting(participant.capabilities.upgrade_meeting.booleanValue());
            videoChatCapabilities.setFollow(participant.capabilities.follow.booleanValue());
            videoChatCapabilities.setFollowPresenter(participant.capabilities.follow_presenter.booleanValue());
            videoChatCapabilities.setFollowConsumeStrategyIds(participant.capabilities.follow_consume_strategy_ids);
            videoChatCapabilities.setFollowProduceStrategyIds(participant.capabilities.follow_produce_strategy_ids);
            videoChatCapabilities.setJoinLobby(participant.capabilities.join_lobby.booleanValue());
            videoChatCapabilities.setSupportHandManage(participant.capabilities.support_hands_up.booleanValue());
            videoChatCapabilities.setBecomeInterpreter(participant.capabilities.become_interpreter.booleanValue());
            videoChatCapabilities.setCanBeHost(participant.capabilities.can_be_host.booleanValue());
            videoChatCapabilities.setCanBeCoHost(participant.capabilities.can_be_co_host.booleanValue());
            participant2.setCapabilities(videoChatCapabilities);
        }
        if (participant.pstn_info != null) {
            participant2.setPSTNInfo(C60930c.m236857a(participant.pstn_info));
        }
        return participant2;
    }
}
