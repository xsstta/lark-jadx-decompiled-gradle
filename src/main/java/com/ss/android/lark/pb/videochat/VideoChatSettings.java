package com.ss.android.lark.pb.videochat;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.entities.VideoChatI18nDefaultTopic;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class VideoChatSettings extends Message<VideoChatSettings, C50437a> {
    public static final ProtoAdapter<VideoChatSettings> ADAPTER = new C50438b();
    public static final Boolean DEFAULT_ALLOW_PARTI_UNMUTE = false;
    public static final Integer DEFAULT_COUNTDOWN_DURATION = 0;
    public static final Boolean DEFAULT_IS_BOX_SHARING = false;
    public static final Boolean DEFAULT_IS_CAMERA_MUTED = false;
    public static final Boolean DEFAULT_IS_LOCKED = false;
    public static final Boolean DEFAULT_IS_MEETING_OPEN_INTERPRETATION = false;
    public static final Boolean DEFAULT_IS_MICROPHONE_MUTED = false;
    public static final Boolean DEFAULT_IS_MUTE_ON_ENTRY = false;
    public static final Boolean DEFAULT_IS_OPEN_BREAKOUT_ROOM = false;
    public static final Boolean DEFAULT_IS_OWNER_JOINED_MEETING = false;
    public static final Integer DEFAULT_MAX_PARTICIPANT_NUM = 0;
    public static final Integer DEFAULT_MAX_SOFT_RTC_NORMAL_MODE = 0;
    public static final Integer DEFAULT_MAX_VIDEOCHAT_DURATION = 0;
    public static final Boolean DEFAULT_ONLY_HOST_CAN_REPLACE_SHARE = false;
    public static final Boolean DEFAULT_ONLY_HOST_CAN_SHARE = false;
    public static final Boolean DEFAULT_ONLY_PRESENTER_CAN_ANNOTATE = false;
    public static final Integer DEFAULT_PLAN_TIME_LIMIT = 0;
    public static final Boolean DEFAULT_SHOULD_EARLY_JOIN = false;
    private static final long serialVersionUID = 0;
    public final Boolean mallow_parti_unmute;
    public final Integer mcountdown_duration;
    public final FeatureConfig mfeature_config;
    public final VideoChatH323Setting mh323_setting;
    public final VideoChatI18nDefaultTopic mi18n_default_topic;
    public final Boolean mis_box_sharing;
    public final Boolean mis_camera_muted;
    public final Boolean mis_locked;
    public final Boolean mis_meeting_open_interpretation;
    public final Boolean mis_microphone_muted;
    public final Boolean mis_mute_on_entry;
    public final Boolean mis_open_breakout_room;
    public final Boolean mis_owner_joined_meeting;
    public final VCManageCapabilities mmanage_capabilities;
    public final Integer mmax_participant_num;
    public final Integer mmax_soft_rtc_normal_mode;
    public final Integer mmax_videochat_duration;
    public final List<LanguageType> mmeeting_support_languages;
    public final Boolean monly_host_can_replace_share;
    public final Boolean monly_host_can_share;
    public final Boolean monly_presenter_can_annotate;
    public final Integer mplan_time_limit;
    public final PlanType mplan_type;
    public final VideoChatPSTNSetting mpstn_setting;
    public final RTCProxy mrtc_proxy;
    public final VideoChatSecuritySetting msecurity_setting;
    public final Boolean mshould_early_join;
    public final VideoChatSIPSetting msip_setting;
    public final SubType msub_type;
    public final String mtopic;

    public enum PlanType implements WireEnum {
        PLAN_UNKNOWN(0),
        PLAN_FREE(1),
        PLAN_BASIC(2),
        PLAN_BUSINESS(3),
        PLAN_ENTERPRISE(4),
        PLAN_NEW_STANDARD(5),
        PLAN_NEW_CERT_STANDARD(6),
        PLAN_NEW_BUSINESS(7),
        PLAN_NEW_ENTERPRISE(8);
        
        public static final ProtoAdapter<PlanType> ADAPTER = ProtoAdapter.newEnumAdapter(PlanType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static PlanType fromValue(int i) {
            switch (i) {
                case 0:
                    return PLAN_UNKNOWN;
                case 1:
                    return PLAN_FREE;
                case 2:
                    return PLAN_BASIC;
                case 3:
                    return PLAN_BUSINESS;
                case 4:
                    return PLAN_ENTERPRISE;
                case 5:
                    return PLAN_NEW_STANDARD;
                case 6:
                    return PLAN_NEW_CERT_STANDARD;
                case 7:
                    return PLAN_NEW_BUSINESS;
                case 8:
                    return PLAN_NEW_ENTERPRISE;
                default:
                    return null;
            }
        }

        private PlanType(int i) {
            this.value = i;
        }
    }

    public enum SubType implements WireEnum {
        DEFAULT(0),
        SCREEN_SHARE(1),
        WIRED_SCREEN_SHARE(2),
        FOLLOW_SHARE(3),
        CHAT_ROOM(4),
        SAME_PAGE_MEETING(5);
        
        public static final ProtoAdapter<SubType> ADAPTER = ProtoAdapter.newEnumAdapter(SubType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static SubType fromValue(int i) {
            if (i == 0) {
                return DEFAULT;
            }
            if (i == 1) {
                return SCREEN_SHARE;
            }
            if (i == 2) {
                return WIRED_SCREEN_SHARE;
            }
            if (i == 3) {
                return FOLLOW_SHARE;
            }
            if (i == 4) {
                return CHAT_ROOM;
            }
            if (i != 5) {
                return null;
            }
            return SAME_PAGE_MEETING;
        }

        private SubType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.VideoChatSettings$b */
    private static final class C50438b extends ProtoAdapter<VideoChatSettings> {
        C50438b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatSettings.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatSettings videoChatSettings) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27;
            int i28;
            int i29 = 0;
            if (videoChatSettings.mtopic != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, videoChatSettings.mtopic);
            } else {
                i = 0;
            }
            if (videoChatSettings.mis_microphone_muted != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, videoChatSettings.mis_microphone_muted);
            } else {
                i2 = 0;
            }
            int i30 = i + i2;
            if (videoChatSettings.mis_camera_muted != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, videoChatSettings.mis_camera_muted);
            } else {
                i3 = 0;
            }
            int i31 = i30 + i3;
            if (videoChatSettings.msub_type != null) {
                i4 = SubType.ADAPTER.encodedSizeWithTag(4, videoChatSettings.msub_type);
            } else {
                i4 = 0;
            }
            int i32 = i31 + i4;
            if (videoChatSettings.mmax_participant_num != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(5, videoChatSettings.mmax_participant_num);
            } else {
                i5 = 0;
            }
            int i33 = i32 + i5;
            if (videoChatSettings.mmax_videochat_duration != null) {
                i6 = ProtoAdapter.INT32.encodedSizeWithTag(6, videoChatSettings.mmax_videochat_duration);
            } else {
                i6 = 0;
            }
            int i34 = i33 + i6;
            if (videoChatSettings.mplan_type != null) {
                i7 = PlanType.ADAPTER.encodedSizeWithTag(7, videoChatSettings.mplan_type);
            } else {
                i7 = 0;
            }
            int i35 = i34 + i7;
            if (videoChatSettings.mshould_early_join != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(8, videoChatSettings.mshould_early_join);
            } else {
                i8 = 0;
            }
            int i36 = i35 + i8;
            if (videoChatSettings.mis_locked != null) {
                i9 = ProtoAdapter.BOOL.encodedSizeWithTag(9, videoChatSettings.mis_locked);
            } else {
                i9 = 0;
            }
            int i37 = i36 + i9;
            if (videoChatSettings.mis_mute_on_entry != null) {
                i10 = ProtoAdapter.BOOL.encodedSizeWithTag(10, videoChatSettings.mis_mute_on_entry);
            } else {
                i10 = 0;
            }
            int i38 = i37 + i10;
            if (videoChatSettings.mplan_time_limit != null) {
                i11 = ProtoAdapter.INT32.encodedSizeWithTag(11, videoChatSettings.mplan_time_limit);
            } else {
                i11 = 0;
            }
            int i39 = i38 + i11;
            if (videoChatSettings.msecurity_setting != null) {
                i12 = VideoChatSecuritySetting.ADAPTER.encodedSizeWithTag(12, videoChatSettings.msecurity_setting);
            } else {
                i12 = 0;
            }
            int i40 = i39 + i12;
            if (videoChatSettings.mpstn_setting != null) {
                i13 = VideoChatPSTNSetting.ADAPTER.encodedSizeWithTag(13, videoChatSettings.mpstn_setting);
            } else {
                i13 = 0;
            }
            int i41 = i40 + i13;
            if (videoChatSettings.mi18n_default_topic != null) {
                i14 = VideoChatI18nDefaultTopic.ADAPTER.encodedSizeWithTag(14, videoChatSettings.mi18n_default_topic);
            } else {
                i14 = 0;
            }
            int i42 = i41 + i14;
            if (videoChatSettings.mfeature_config != null) {
                i15 = FeatureConfig.ADAPTER.encodedSizeWithTag(15, videoChatSettings.mfeature_config);
            } else {
                i15 = 0;
            }
            int i43 = i42 + i15;
            if (videoChatSettings.mallow_parti_unmute != null) {
                i16 = ProtoAdapter.BOOL.encodedSizeWithTag(16, videoChatSettings.mallow_parti_unmute);
            } else {
                i16 = 0;
            }
            int i44 = i43 + i16;
            if (videoChatSettings.msip_setting != null) {
                i17 = VideoChatSIPSetting.ADAPTER.encodedSizeWithTag(17, videoChatSettings.msip_setting);
            } else {
                i17 = 0;
            }
            int i45 = i44 + i17;
            if (videoChatSettings.mis_owner_joined_meeting != null) {
                i18 = ProtoAdapter.BOOL.encodedSizeWithTag(18, videoChatSettings.mis_owner_joined_meeting);
            } else {
                i18 = 0;
            }
            int i46 = i45 + i18;
            if (videoChatSettings.monly_host_can_share != null) {
                i19 = ProtoAdapter.BOOL.encodedSizeWithTag(19, videoChatSettings.monly_host_can_share);
            } else {
                i19 = 0;
            }
            int i47 = i46 + i19;
            if (videoChatSettings.mmanage_capabilities != null) {
                i20 = VCManageCapabilities.ADAPTER.encodedSizeWithTag(20, videoChatSettings.mmanage_capabilities);
            } else {
                i20 = 0;
            }
            int i48 = i47 + i20;
            if (videoChatSettings.monly_host_can_replace_share != null) {
                i21 = ProtoAdapter.BOOL.encodedSizeWithTag(21, videoChatSettings.monly_host_can_replace_share);
            } else {
                i21 = 0;
            }
            int i49 = i48 + i21;
            if (videoChatSettings.mmax_soft_rtc_normal_mode != null) {
                i22 = ProtoAdapter.INT32.encodedSizeWithTag(22, videoChatSettings.mmax_soft_rtc_normal_mode);
            } else {
                i22 = 0;
            }
            int i50 = i49 + i22;
            if (videoChatSettings.mrtc_proxy != null) {
                i23 = RTCProxy.ADAPTER.encodedSizeWithTag(23, videoChatSettings.mrtc_proxy);
            } else {
                i23 = 0;
            }
            int i51 = i50 + i23;
            if (videoChatSettings.mis_meeting_open_interpretation != null) {
                i24 = ProtoAdapter.BOOL.encodedSizeWithTag(24, videoChatSettings.mis_meeting_open_interpretation);
            } else {
                i24 = 0;
            }
            int encodedSizeWithTag = i51 + i24 + LanguageType.ADAPTER.asRepeated().encodedSizeWithTag(25, videoChatSettings.mmeeting_support_languages);
            if (videoChatSettings.mis_box_sharing != null) {
                i25 = ProtoAdapter.BOOL.encodedSizeWithTag(26, videoChatSettings.mis_box_sharing);
            } else {
                i25 = 0;
            }
            int i52 = encodedSizeWithTag + i25;
            if (videoChatSettings.monly_presenter_can_annotate != null) {
                i26 = ProtoAdapter.BOOL.encodedSizeWithTag(27, videoChatSettings.monly_presenter_can_annotate);
            } else {
                i26 = 0;
            }
            int i53 = i52 + i26;
            if (videoChatSettings.mcountdown_duration != null) {
                i27 = ProtoAdapter.INT32.encodedSizeWithTag(28, videoChatSettings.mcountdown_duration);
            } else {
                i27 = 0;
            }
            int i54 = i53 + i27;
            if (videoChatSettings.mis_open_breakout_room != null) {
                i28 = ProtoAdapter.BOOL.encodedSizeWithTag(29, videoChatSettings.mis_open_breakout_room);
            } else {
                i28 = 0;
            }
            int i55 = i54 + i28;
            if (videoChatSettings.mh323_setting != null) {
                i29 = VideoChatH323Setting.ADAPTER.encodedSizeWithTag(30, videoChatSettings.mh323_setting);
            }
            return i55 + i29 + videoChatSettings.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatSettings decode(ProtoReader protoReader) throws IOException {
            C50437a aVar = new C50437a();
            aVar.f125955a = "";
            aVar.f125956b = false;
            aVar.f125957c = false;
            aVar.f125959e = 0;
            aVar.f125960f = 0;
            aVar.f125962h = false;
            aVar.f125963i = false;
            aVar.f125964j = false;
            aVar.f125965k = 0;
            aVar.f125970p = false;
            aVar.f125972r = false;
            aVar.f125973s = false;
            aVar.f125975u = false;
            aVar.f125976v = 0;
            aVar.f125978x = false;
            aVar.f125980z = false;
            aVar.f125951A = false;
            aVar.f125952B = 0;
            aVar.f125953C = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125955a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f125956b = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            aVar.f125957c = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            try {
                                aVar.f125958d = SubType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            aVar.f125959e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f125960f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            try {
                                aVar.f125961g = PlanType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 8:
                            aVar.f125962h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            aVar.f125963i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 10:
                            aVar.f125964j = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 11:
                            aVar.f125965k = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f125966l = VideoChatSecuritySetting.ADAPTER.decode(protoReader);
                            break;
                        case 13:
                            aVar.f125967m = VideoChatPSTNSetting.ADAPTER.decode(protoReader);
                            break;
                        case 14:
                            aVar.f125968n = VideoChatI18nDefaultTopic.ADAPTER.decode(protoReader);
                            break;
                        case 15:
                            aVar.f125969o = FeatureConfig.ADAPTER.decode(protoReader);
                            break;
                        case 16:
                            aVar.f125970p = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 17:
                            aVar.f125971q = VideoChatSIPSetting.ADAPTER.decode(protoReader);
                            break;
                        case 18:
                            aVar.f125972r = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 19:
                            aVar.f125973s = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 20:
                            aVar.f125974t = VCManageCapabilities.ADAPTER.decode(protoReader);
                            break;
                        case 21:
                            aVar.f125975u = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 22:
                            aVar.f125976v = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 23:
                            aVar.f125977w = RTCProxy.ADAPTER.decode(protoReader);
                            break;
                        case 24:
                            aVar.f125978x = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                            aVar.f125979y.add(LanguageType.ADAPTER.decode(protoReader));
                            break;
                        case 26:
                            aVar.f125980z = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                            aVar.f125951A = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                            aVar.f125952B = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 29:
                            aVar.f125953C = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 30:
                            aVar.f125954D = VideoChatH323Setting.ADAPTER.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VideoChatSettings videoChatSettings) throws IOException {
            if (videoChatSettings.mtopic != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, videoChatSettings.mtopic);
            }
            if (videoChatSettings.mis_microphone_muted != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, videoChatSettings.mis_microphone_muted);
            }
            if (videoChatSettings.mis_camera_muted != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, videoChatSettings.mis_camera_muted);
            }
            if (videoChatSettings.msub_type != null) {
                SubType.ADAPTER.encodeWithTag(protoWriter, 4, videoChatSettings.msub_type);
            }
            if (videoChatSettings.mmax_participant_num != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, videoChatSettings.mmax_participant_num);
            }
            if (videoChatSettings.mmax_videochat_duration != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, videoChatSettings.mmax_videochat_duration);
            }
            if (videoChatSettings.mplan_type != null) {
                PlanType.ADAPTER.encodeWithTag(protoWriter, 7, videoChatSettings.mplan_type);
            }
            if (videoChatSettings.mshould_early_join != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, videoChatSettings.mshould_early_join);
            }
            if (videoChatSettings.mis_locked != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, videoChatSettings.mis_locked);
            }
            if (videoChatSettings.mis_mute_on_entry != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, videoChatSettings.mis_mute_on_entry);
            }
            if (videoChatSettings.mplan_time_limit != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, videoChatSettings.mplan_time_limit);
            }
            if (videoChatSettings.msecurity_setting != null) {
                VideoChatSecuritySetting.ADAPTER.encodeWithTag(protoWriter, 12, videoChatSettings.msecurity_setting);
            }
            if (videoChatSettings.mpstn_setting != null) {
                VideoChatPSTNSetting.ADAPTER.encodeWithTag(protoWriter, 13, videoChatSettings.mpstn_setting);
            }
            if (videoChatSettings.mi18n_default_topic != null) {
                VideoChatI18nDefaultTopic.ADAPTER.encodeWithTag(protoWriter, 14, videoChatSettings.mi18n_default_topic);
            }
            if (videoChatSettings.mfeature_config != null) {
                FeatureConfig.ADAPTER.encodeWithTag(protoWriter, 15, videoChatSettings.mfeature_config);
            }
            if (videoChatSettings.mallow_parti_unmute != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 16, videoChatSettings.mallow_parti_unmute);
            }
            if (videoChatSettings.msip_setting != null) {
                VideoChatSIPSetting.ADAPTER.encodeWithTag(protoWriter, 17, videoChatSettings.msip_setting);
            }
            if (videoChatSettings.mis_owner_joined_meeting != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 18, videoChatSettings.mis_owner_joined_meeting);
            }
            if (videoChatSettings.monly_host_can_share != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 19, videoChatSettings.monly_host_can_share);
            }
            if (videoChatSettings.mmanage_capabilities != null) {
                VCManageCapabilities.ADAPTER.encodeWithTag(protoWriter, 20, videoChatSettings.mmanage_capabilities);
            }
            if (videoChatSettings.monly_host_can_replace_share != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 21, videoChatSettings.monly_host_can_replace_share);
            }
            if (videoChatSettings.mmax_soft_rtc_normal_mode != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 22, videoChatSettings.mmax_soft_rtc_normal_mode);
            }
            if (videoChatSettings.mrtc_proxy != null) {
                RTCProxy.ADAPTER.encodeWithTag(protoWriter, 23, videoChatSettings.mrtc_proxy);
            }
            if (videoChatSettings.mis_meeting_open_interpretation != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 24, videoChatSettings.mis_meeting_open_interpretation);
            }
            LanguageType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 25, videoChatSettings.mmeeting_support_languages);
            if (videoChatSettings.mis_box_sharing != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 26, videoChatSettings.mis_box_sharing);
            }
            if (videoChatSettings.monly_presenter_can_annotate != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 27, videoChatSettings.monly_presenter_can_annotate);
            }
            if (videoChatSettings.mcountdown_duration != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 28, videoChatSettings.mcountdown_duration);
            }
            if (videoChatSettings.mis_open_breakout_room != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 29, videoChatSettings.mis_open_breakout_room);
            }
            if (videoChatSettings.mh323_setting != null) {
                VideoChatH323Setting.ADAPTER.encodeWithTag(protoWriter, 30, videoChatSettings.mh323_setting);
            }
            protoWriter.writeBytes(videoChatSettings.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.VideoChatSettings$a */
    public static final class C50437a extends Message.Builder<VideoChatSettings, C50437a> {

        /* renamed from: A */
        public Boolean f125951A;

        /* renamed from: B */
        public Integer f125952B;

        /* renamed from: C */
        public Boolean f125953C;

        /* renamed from: D */
        public VideoChatH323Setting f125954D;

        /* renamed from: a */
        public String f125955a;

        /* renamed from: b */
        public Boolean f125956b;

        /* renamed from: c */
        public Boolean f125957c;

        /* renamed from: d */
        public SubType f125958d;

        /* renamed from: e */
        public Integer f125959e;

        /* renamed from: f */
        public Integer f125960f;

        /* renamed from: g */
        public PlanType f125961g;

        /* renamed from: h */
        public Boolean f125962h;

        /* renamed from: i */
        public Boolean f125963i;

        /* renamed from: j */
        public Boolean f125964j;

        /* renamed from: k */
        public Integer f125965k;

        /* renamed from: l */
        public VideoChatSecuritySetting f125966l;

        /* renamed from: m */
        public VideoChatPSTNSetting f125967m;

        /* renamed from: n */
        public VideoChatI18nDefaultTopic f125968n;

        /* renamed from: o */
        public FeatureConfig f125969o;

        /* renamed from: p */
        public Boolean f125970p;

        /* renamed from: q */
        public VideoChatSIPSetting f125971q;

        /* renamed from: r */
        public Boolean f125972r;

        /* renamed from: s */
        public Boolean f125973s;

        /* renamed from: t */
        public VCManageCapabilities f125974t;

        /* renamed from: u */
        public Boolean f125975u;

        /* renamed from: v */
        public Integer f125976v;

        /* renamed from: w */
        public RTCProxy f125977w;

        /* renamed from: x */
        public Boolean f125978x;

        /* renamed from: y */
        public List<LanguageType> f125979y = Internal.newMutableList();

        /* renamed from: z */
        public Boolean f125980z;

        /* renamed from: a */
        public VideoChatSettings build() {
            return new VideoChatSettings(this.f125955a, this.f125956b, this.f125957c, this.f125958d, this.f125959e, this.f125960f, this.f125961g, this.f125962h, this.f125963i, this.f125964j, this.f125965k, this.f125966l, this.f125967m, this.f125968n, this.f125969o, this.f125970p, this.f125971q, this.f125972r, this.f125973s, this.f125974t, this.f125975u, this.f125976v, this.f125977w, this.f125978x, this.f125979y, this.f125980z, this.f125951A, this.f125952B, this.f125953C, this.f125954D, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50437a newBuilder() {
        C50437a aVar = new C50437a();
        aVar.f125955a = this.mtopic;
        aVar.f125956b = this.mis_microphone_muted;
        aVar.f125957c = this.mis_camera_muted;
        aVar.f125958d = this.msub_type;
        aVar.f125959e = this.mmax_participant_num;
        aVar.f125960f = this.mmax_videochat_duration;
        aVar.f125961g = this.mplan_type;
        aVar.f125962h = this.mshould_early_join;
        aVar.f125963i = this.mis_locked;
        aVar.f125964j = this.mis_mute_on_entry;
        aVar.f125965k = this.mplan_time_limit;
        aVar.f125966l = this.msecurity_setting;
        aVar.f125967m = this.mpstn_setting;
        aVar.f125968n = this.mi18n_default_topic;
        aVar.f125969o = this.mfeature_config;
        aVar.f125970p = this.mallow_parti_unmute;
        aVar.f125971q = this.msip_setting;
        aVar.f125972r = this.mis_owner_joined_meeting;
        aVar.f125973s = this.monly_host_can_share;
        aVar.f125974t = this.mmanage_capabilities;
        aVar.f125975u = this.monly_host_can_replace_share;
        aVar.f125976v = this.mmax_soft_rtc_normal_mode;
        aVar.f125977w = this.mrtc_proxy;
        aVar.f125978x = this.mis_meeting_open_interpretation;
        aVar.f125979y = Internal.copyOf("mmeeting_support_languages", this.mmeeting_support_languages);
        aVar.f125980z = this.mis_box_sharing;
        aVar.f125951A = this.monly_presenter_can_annotate;
        aVar.f125952B = this.mcountdown_duration;
        aVar.f125953C = this.mis_open_breakout_room;
        aVar.f125954D = this.mh323_setting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mtopic != null) {
            sb.append(", topic=");
            sb.append(this.mtopic);
        }
        if (this.mis_microphone_muted != null) {
            sb.append(", is_microphone_muted=");
            sb.append(this.mis_microphone_muted);
        }
        if (this.mis_camera_muted != null) {
            sb.append(", is_camera_muted=");
            sb.append(this.mis_camera_muted);
        }
        if (this.msub_type != null) {
            sb.append(", sub_type=");
            sb.append(this.msub_type);
        }
        if (this.mmax_participant_num != null) {
            sb.append(", max_participant_num=");
            sb.append(this.mmax_participant_num);
        }
        if (this.mmax_videochat_duration != null) {
            sb.append(", max_videochat_duration=");
            sb.append(this.mmax_videochat_duration);
        }
        if (this.mplan_type != null) {
            sb.append(", plan_type=");
            sb.append(this.mplan_type);
        }
        if (this.mshould_early_join != null) {
            sb.append(", should_early_join=");
            sb.append(this.mshould_early_join);
        }
        if (this.mis_locked != null) {
            sb.append(", is_locked=");
            sb.append(this.mis_locked);
        }
        if (this.mis_mute_on_entry != null) {
            sb.append(", is_mute_on_entry=");
            sb.append(this.mis_mute_on_entry);
        }
        if (this.mplan_time_limit != null) {
            sb.append(", plan_time_limit=");
            sb.append(this.mplan_time_limit);
        }
        if (this.msecurity_setting != null) {
            sb.append(", security_setting=");
            sb.append(this.msecurity_setting);
        }
        if (this.mpstn_setting != null) {
            sb.append(", pstn_setting=");
            sb.append(this.mpstn_setting);
        }
        if (this.mi18n_default_topic != null) {
            sb.append(", i18n_default_topic=");
            sb.append(this.mi18n_default_topic);
        }
        if (this.mfeature_config != null) {
            sb.append(", feature_config=");
            sb.append(this.mfeature_config);
        }
        if (this.mallow_parti_unmute != null) {
            sb.append(", allow_parti_unmute=");
            sb.append(this.mallow_parti_unmute);
        }
        if (this.msip_setting != null) {
            sb.append(", sip_setting=");
            sb.append(this.msip_setting);
        }
        if (this.mis_owner_joined_meeting != null) {
            sb.append(", is_owner_joined_meeting=");
            sb.append(this.mis_owner_joined_meeting);
        }
        if (this.monly_host_can_share != null) {
            sb.append(", only_host_can_share=");
            sb.append(this.monly_host_can_share);
        }
        if (this.mmanage_capabilities != null) {
            sb.append(", manage_capabilities=");
            sb.append(this.mmanage_capabilities);
        }
        if (this.monly_host_can_replace_share != null) {
            sb.append(", only_host_can_replace_share=");
            sb.append(this.monly_host_can_replace_share);
        }
        if (this.mmax_soft_rtc_normal_mode != null) {
            sb.append(", max_soft_rtc_normal_mode=");
            sb.append(this.mmax_soft_rtc_normal_mode);
        }
        if (this.mrtc_proxy != null) {
            sb.append(", rtc_proxy=");
            sb.append(this.mrtc_proxy);
        }
        if (this.mis_meeting_open_interpretation != null) {
            sb.append(", is_meeting_open_interpretation=");
            sb.append(this.mis_meeting_open_interpretation);
        }
        if (!this.mmeeting_support_languages.isEmpty()) {
            sb.append(", meeting_support_languages=");
            sb.append(this.mmeeting_support_languages);
        }
        if (this.mis_box_sharing != null) {
            sb.append(", is_box_sharing=");
            sb.append(this.mis_box_sharing);
        }
        if (this.monly_presenter_can_annotate != null) {
            sb.append(", only_presenter_can_annotate=");
            sb.append(this.monly_presenter_can_annotate);
        }
        if (this.mcountdown_duration != null) {
            sb.append(", countdown_duration=");
            sb.append(this.mcountdown_duration);
        }
        if (this.mis_open_breakout_room != null) {
            sb.append(", is_open_breakout_room=");
            sb.append(this.mis_open_breakout_room);
        }
        if (this.mh323_setting != null) {
            sb.append(", h323_setting=");
            sb.append(this.mh323_setting);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoChatSettings{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatSettings(String str, Boolean bool, Boolean bool2, SubType subType, Integer num, Integer num2, PlanType planType, Boolean bool3, Boolean bool4, Boolean bool5, Integer num3, VideoChatSecuritySetting videoChatSecuritySetting, VideoChatPSTNSetting videoChatPSTNSetting, VideoChatI18nDefaultTopic videoChatI18nDefaultTopic, FeatureConfig featureConfig, Boolean bool6, VideoChatSIPSetting videoChatSIPSetting, Boolean bool7, Boolean bool8, VCManageCapabilities vCManageCapabilities, Boolean bool9, Integer num4, RTCProxy rTCProxy, Boolean bool10, List<LanguageType> list, Boolean bool11, Boolean bool12, Integer num5, Boolean bool13, VideoChatH323Setting videoChatH323Setting) {
        this(str, bool, bool2, subType, num, num2, planType, bool3, bool4, bool5, num3, videoChatSecuritySetting, videoChatPSTNSetting, videoChatI18nDefaultTopic, featureConfig, bool6, videoChatSIPSetting, bool7, bool8, vCManageCapabilities, bool9, num4, rTCProxy, bool10, list, bool11, bool12, num5, bool13, videoChatH323Setting, ByteString.EMPTY);
    }

    public VideoChatSettings(String str, Boolean bool, Boolean bool2, SubType subType, Integer num, Integer num2, PlanType planType, Boolean bool3, Boolean bool4, Boolean bool5, Integer num3, VideoChatSecuritySetting videoChatSecuritySetting, VideoChatPSTNSetting videoChatPSTNSetting, VideoChatI18nDefaultTopic videoChatI18nDefaultTopic, FeatureConfig featureConfig, Boolean bool6, VideoChatSIPSetting videoChatSIPSetting, Boolean bool7, Boolean bool8, VCManageCapabilities vCManageCapabilities, Boolean bool9, Integer num4, RTCProxy rTCProxy, Boolean bool10, List<LanguageType> list, Boolean bool11, Boolean bool12, Integer num5, Boolean bool13, VideoChatH323Setting videoChatH323Setting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtopic = str;
        this.mis_microphone_muted = bool;
        this.mis_camera_muted = bool2;
        this.msub_type = subType;
        this.mmax_participant_num = num;
        this.mmax_videochat_duration = num2;
        this.mplan_type = planType;
        this.mshould_early_join = bool3;
        this.mis_locked = bool4;
        this.mis_mute_on_entry = bool5;
        this.mplan_time_limit = num3;
        this.msecurity_setting = videoChatSecuritySetting;
        this.mpstn_setting = videoChatPSTNSetting;
        this.mi18n_default_topic = videoChatI18nDefaultTopic;
        this.mfeature_config = featureConfig;
        this.mallow_parti_unmute = bool6;
        this.msip_setting = videoChatSIPSetting;
        this.mis_owner_joined_meeting = bool7;
        this.monly_host_can_share = bool8;
        this.mmanage_capabilities = vCManageCapabilities;
        this.monly_host_can_replace_share = bool9;
        this.mmax_soft_rtc_normal_mode = num4;
        this.mrtc_proxy = rTCProxy;
        this.mis_meeting_open_interpretation = bool10;
        this.mmeeting_support_languages = Internal.immutableCopyOf("mmeeting_support_languages", list);
        this.mis_box_sharing = bool11;
        this.monly_presenter_can_annotate = bool12;
        this.mcountdown_duration = num5;
        this.mis_open_breakout_room = bool13;
        this.mh323_setting = videoChatH323Setting;
    }
}
