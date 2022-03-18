package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.VideoChatI18nDefaultTopic;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class VideoChatSettings extends Message<VideoChatSettings, C51286a> {
    public static final ProtoAdapter<VideoChatSettings> ADAPTER = new C51287b();
    public static final Boolean DEFAULT_ALLOW_PARTI_UNMUTE = true;
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
    public static final PlanType DEFAULT_PLAN_TYPE = PlanType.PLAN_FREE;
    public static final Boolean DEFAULT_SHOULD_EARLY_JOIN = false;
    public static final SubType DEFAULT_SUB_TYPE = SubType.DEFAULT;
    private static final long serialVersionUID = 0;
    public final Boolean allow_parti_unmute;
    public final Integer countdown_duration;
    public final FeatureConfig feature_config;
    public final VideoChatH323Setting h323_setting;
    public final VideoChatI18nDefaultTopic i18n_default_topic;
    public final Boolean is_box_sharing;
    public final Boolean is_camera_muted;
    public final Boolean is_locked;
    public final Boolean is_meeting_open_interpretation;
    public final Boolean is_microphone_muted;
    public final Boolean is_mute_on_entry;
    public final Boolean is_open_breakout_room;
    public final Boolean is_owner_joined_meeting;
    public final VCManageCapabilities manage_capabilities;
    public final Integer max_participant_num;
    public final Integer max_soft_rtc_normal_mode;
    public final Integer max_videochat_duration;
    public final List<LanguageType> meeting_support_languages;
    public final Boolean only_host_can_replace_share;
    public final Boolean only_host_can_share;
    public final Boolean only_presenter_can_annotate;
    public final Integer plan_time_limit;
    public final PlanType plan_type;
    public final RTCProxy rtc_proxy;
    public final VideoChatSecuritySetting security_setting;
    public final Boolean should_early_join;
    public final VideoChatSIPSetting sip_setting;
    public final SubType sub_type;
    public final String topic;

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
        CHAT_ROOM(4);
        
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
            if (i != 4) {
                return null;
            }
            return CHAT_ROOM;
        }

        private SubType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatSettings$b */
    private static final class C51287b extends ProtoAdapter<VideoChatSettings> {
        C51287b() {
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
            int i28 = 0;
            if (videoChatSettings.topic != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, videoChatSettings.topic);
            } else {
                i = 0;
            }
            if (videoChatSettings.is_microphone_muted != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, videoChatSettings.is_microphone_muted);
            } else {
                i2 = 0;
            }
            int i29 = i + i2;
            if (videoChatSettings.is_camera_muted != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, videoChatSettings.is_camera_muted);
            } else {
                i3 = 0;
            }
            int i30 = i29 + i3;
            if (videoChatSettings.sub_type != null) {
                i4 = SubType.ADAPTER.encodedSizeWithTag(4, videoChatSettings.sub_type);
            } else {
                i4 = 0;
            }
            int i31 = i30 + i4;
            if (videoChatSettings.max_participant_num != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(5, videoChatSettings.max_participant_num);
            } else {
                i5 = 0;
            }
            int i32 = i31 + i5;
            if (videoChatSettings.max_videochat_duration != null) {
                i6 = ProtoAdapter.INT32.encodedSizeWithTag(6, videoChatSettings.max_videochat_duration);
            } else {
                i6 = 0;
            }
            int i33 = i32 + i6;
            if (videoChatSettings.plan_type != null) {
                i7 = PlanType.ADAPTER.encodedSizeWithTag(7, videoChatSettings.plan_type);
            } else {
                i7 = 0;
            }
            int i34 = i33 + i7;
            if (videoChatSettings.should_early_join != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(8, videoChatSettings.should_early_join);
            } else {
                i8 = 0;
            }
            int i35 = i34 + i8;
            if (videoChatSettings.is_locked != null) {
                i9 = ProtoAdapter.BOOL.encodedSizeWithTag(9, videoChatSettings.is_locked);
            } else {
                i9 = 0;
            }
            int i36 = i35 + i9;
            if (videoChatSettings.is_mute_on_entry != null) {
                i10 = ProtoAdapter.BOOL.encodedSizeWithTag(10, videoChatSettings.is_mute_on_entry);
            } else {
                i10 = 0;
            }
            int i37 = i36 + i10;
            if (videoChatSettings.plan_time_limit != null) {
                i11 = ProtoAdapter.INT32.encodedSizeWithTag(11, videoChatSettings.plan_time_limit);
            } else {
                i11 = 0;
            }
            int i38 = i37 + i11;
            if (videoChatSettings.security_setting != null) {
                i12 = VideoChatSecuritySetting.ADAPTER.encodedSizeWithTag(12, videoChatSettings.security_setting);
            } else {
                i12 = 0;
            }
            int i39 = i38 + i12;
            if (videoChatSettings.i18n_default_topic != null) {
                i13 = VideoChatI18nDefaultTopic.ADAPTER.encodedSizeWithTag(14, videoChatSettings.i18n_default_topic);
            } else {
                i13 = 0;
            }
            int i40 = i39 + i13;
            if (videoChatSettings.feature_config != null) {
                i14 = FeatureConfig.ADAPTER.encodedSizeWithTag(15, videoChatSettings.feature_config);
            } else {
                i14 = 0;
            }
            int i41 = i40 + i14;
            if (videoChatSettings.allow_parti_unmute != null) {
                i15 = ProtoAdapter.BOOL.encodedSizeWithTag(16, videoChatSettings.allow_parti_unmute);
            } else {
                i15 = 0;
            }
            int i42 = i41 + i15;
            if (videoChatSettings.sip_setting != null) {
                i16 = VideoChatSIPSetting.ADAPTER.encodedSizeWithTag(17, videoChatSettings.sip_setting);
            } else {
                i16 = 0;
            }
            int i43 = i42 + i16;
            if (videoChatSettings.is_owner_joined_meeting != null) {
                i17 = ProtoAdapter.BOOL.encodedSizeWithTag(18, videoChatSettings.is_owner_joined_meeting);
            } else {
                i17 = 0;
            }
            int i44 = i43 + i17;
            if (videoChatSettings.only_host_can_share != null) {
                i18 = ProtoAdapter.BOOL.encodedSizeWithTag(19, videoChatSettings.only_host_can_share);
            } else {
                i18 = 0;
            }
            int i45 = i44 + i18;
            if (videoChatSettings.manage_capabilities != null) {
                i19 = VCManageCapabilities.ADAPTER.encodedSizeWithTag(20, videoChatSettings.manage_capabilities);
            } else {
                i19 = 0;
            }
            int i46 = i45 + i19;
            if (videoChatSettings.only_host_can_replace_share != null) {
                i20 = ProtoAdapter.BOOL.encodedSizeWithTag(21, videoChatSettings.only_host_can_replace_share);
            } else {
                i20 = 0;
            }
            int i47 = i46 + i20;
            if (videoChatSettings.max_soft_rtc_normal_mode != null) {
                i21 = ProtoAdapter.INT32.encodedSizeWithTag(22, videoChatSettings.max_soft_rtc_normal_mode);
            } else {
                i21 = 0;
            }
            int i48 = i47 + i21;
            if (videoChatSettings.rtc_proxy != null) {
                i22 = RTCProxy.ADAPTER.encodedSizeWithTag(23, videoChatSettings.rtc_proxy);
            } else {
                i22 = 0;
            }
            int i49 = i48 + i22;
            if (videoChatSettings.is_meeting_open_interpretation != null) {
                i23 = ProtoAdapter.BOOL.encodedSizeWithTag(24, videoChatSettings.is_meeting_open_interpretation);
            } else {
                i23 = 0;
            }
            int encodedSizeWithTag = i49 + i23 + LanguageType.ADAPTER.asRepeated().encodedSizeWithTag(25, videoChatSettings.meeting_support_languages);
            if (videoChatSettings.is_box_sharing != null) {
                i24 = ProtoAdapter.BOOL.encodedSizeWithTag(26, videoChatSettings.is_box_sharing);
            } else {
                i24 = 0;
            }
            int i50 = encodedSizeWithTag + i24;
            if (videoChatSettings.only_presenter_can_annotate != null) {
                i25 = ProtoAdapter.BOOL.encodedSizeWithTag(27, videoChatSettings.only_presenter_can_annotate);
            } else {
                i25 = 0;
            }
            int i51 = i50 + i25;
            if (videoChatSettings.countdown_duration != null) {
                i26 = ProtoAdapter.INT32.encodedSizeWithTag(28, videoChatSettings.countdown_duration);
            } else {
                i26 = 0;
            }
            int i52 = i51 + i26;
            if (videoChatSettings.is_open_breakout_room != null) {
                i27 = ProtoAdapter.BOOL.encodedSizeWithTag(29, videoChatSettings.is_open_breakout_room);
            } else {
                i27 = 0;
            }
            int i53 = i52 + i27;
            if (videoChatSettings.h323_setting != null) {
                i28 = VideoChatH323Setting.ADAPTER.encodedSizeWithTag(30, videoChatSettings.h323_setting);
            }
            return i53 + i28 + videoChatSettings.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatSettings decode(ProtoReader protoReader) throws IOException {
            C51286a aVar = new C51286a();
            aVar.f127720a = "";
            aVar.f127721b = false;
            aVar.f127722c = false;
            aVar.f127723d = SubType.DEFAULT;
            aVar.f127724e = 0;
            aVar.f127725f = 0;
            aVar.f127726g = PlanType.PLAN_FREE;
            aVar.f127727h = false;
            aVar.f127728i = false;
            aVar.f127729j = false;
            aVar.f127730k = 0;
            aVar.f127734o = true;
            aVar.f127736q = false;
            aVar.f127737r = false;
            aVar.f127739t = false;
            aVar.f127740u = 0;
            aVar.f127742w = false;
            aVar.f127744y = false;
            aVar.f127745z = false;
            aVar.f127717A = 0;
            aVar.f127718B = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f127720a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f127721b = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            aVar.f127722c = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            try {
                                aVar.f127723d = SubType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            aVar.f127724e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f127725f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            try {
                                aVar.f127726g = PlanType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 8:
                            aVar.f127727h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            aVar.f127728i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 10:
                            aVar.f127729j = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 11:
                            aVar.f127730k = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f127731l = VideoChatSecuritySetting.ADAPTER.decode(protoReader);
                            break;
                        case 13:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 14:
                            aVar.f127732m = VideoChatI18nDefaultTopic.ADAPTER.decode(protoReader);
                            break;
                        case 15:
                            aVar.f127733n = FeatureConfig.ADAPTER.decode(protoReader);
                            break;
                        case 16:
                            aVar.f127734o = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 17:
                            aVar.f127735p = VideoChatSIPSetting.ADAPTER.decode(protoReader);
                            break;
                        case 18:
                            aVar.f127736q = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 19:
                            aVar.f127737r = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 20:
                            aVar.f127738s = VCManageCapabilities.ADAPTER.decode(protoReader);
                            break;
                        case 21:
                            aVar.f127739t = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 22:
                            aVar.f127740u = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 23:
                            aVar.f127741v = RTCProxy.ADAPTER.decode(protoReader);
                            break;
                        case 24:
                            aVar.f127742w = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                            aVar.f127743x.add(LanguageType.ADAPTER.decode(protoReader));
                            break;
                        case 26:
                            aVar.f127744y = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                            aVar.f127745z = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                            aVar.f127717A = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 29:
                            aVar.f127718B = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 30:
                            aVar.f127719C = VideoChatH323Setting.ADAPTER.decode(protoReader);
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
            if (videoChatSettings.topic != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, videoChatSettings.topic);
            }
            if (videoChatSettings.is_microphone_muted != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, videoChatSettings.is_microphone_muted);
            }
            if (videoChatSettings.is_camera_muted != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, videoChatSettings.is_camera_muted);
            }
            if (videoChatSettings.sub_type != null) {
                SubType.ADAPTER.encodeWithTag(protoWriter, 4, videoChatSettings.sub_type);
            }
            if (videoChatSettings.max_participant_num != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, videoChatSettings.max_participant_num);
            }
            if (videoChatSettings.max_videochat_duration != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, videoChatSettings.max_videochat_duration);
            }
            if (videoChatSettings.plan_type != null) {
                PlanType.ADAPTER.encodeWithTag(protoWriter, 7, videoChatSettings.plan_type);
            }
            if (videoChatSettings.should_early_join != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, videoChatSettings.should_early_join);
            }
            if (videoChatSettings.is_locked != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, videoChatSettings.is_locked);
            }
            if (videoChatSettings.is_mute_on_entry != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, videoChatSettings.is_mute_on_entry);
            }
            if (videoChatSettings.plan_time_limit != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, videoChatSettings.plan_time_limit);
            }
            if (videoChatSettings.security_setting != null) {
                VideoChatSecuritySetting.ADAPTER.encodeWithTag(protoWriter, 12, videoChatSettings.security_setting);
            }
            if (videoChatSettings.i18n_default_topic != null) {
                VideoChatI18nDefaultTopic.ADAPTER.encodeWithTag(protoWriter, 14, videoChatSettings.i18n_default_topic);
            }
            if (videoChatSettings.feature_config != null) {
                FeatureConfig.ADAPTER.encodeWithTag(protoWriter, 15, videoChatSettings.feature_config);
            }
            if (videoChatSettings.allow_parti_unmute != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 16, videoChatSettings.allow_parti_unmute);
            }
            if (videoChatSettings.sip_setting != null) {
                VideoChatSIPSetting.ADAPTER.encodeWithTag(protoWriter, 17, videoChatSettings.sip_setting);
            }
            if (videoChatSettings.is_owner_joined_meeting != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 18, videoChatSettings.is_owner_joined_meeting);
            }
            if (videoChatSettings.only_host_can_share != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 19, videoChatSettings.only_host_can_share);
            }
            if (videoChatSettings.manage_capabilities != null) {
                VCManageCapabilities.ADAPTER.encodeWithTag(protoWriter, 20, videoChatSettings.manage_capabilities);
            }
            if (videoChatSettings.only_host_can_replace_share != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 21, videoChatSettings.only_host_can_replace_share);
            }
            if (videoChatSettings.max_soft_rtc_normal_mode != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 22, videoChatSettings.max_soft_rtc_normal_mode);
            }
            if (videoChatSettings.rtc_proxy != null) {
                RTCProxy.ADAPTER.encodeWithTag(protoWriter, 23, videoChatSettings.rtc_proxy);
            }
            if (videoChatSettings.is_meeting_open_interpretation != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 24, videoChatSettings.is_meeting_open_interpretation);
            }
            LanguageType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 25, videoChatSettings.meeting_support_languages);
            if (videoChatSettings.is_box_sharing != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 26, videoChatSettings.is_box_sharing);
            }
            if (videoChatSettings.only_presenter_can_annotate != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 27, videoChatSettings.only_presenter_can_annotate);
            }
            if (videoChatSettings.countdown_duration != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 28, videoChatSettings.countdown_duration);
            }
            if (videoChatSettings.is_open_breakout_room != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 29, videoChatSettings.is_open_breakout_room);
            }
            if (videoChatSettings.h323_setting != null) {
                VideoChatH323Setting.ADAPTER.encodeWithTag(protoWriter, 30, videoChatSettings.h323_setting);
            }
            protoWriter.writeBytes(videoChatSettings.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatSettings$a */
    public static final class C51286a extends Message.Builder<VideoChatSettings, C51286a> {

        /* renamed from: A */
        public Integer f127717A;

        /* renamed from: B */
        public Boolean f127718B;

        /* renamed from: C */
        public VideoChatH323Setting f127719C;

        /* renamed from: a */
        public String f127720a;

        /* renamed from: b */
        public Boolean f127721b;

        /* renamed from: c */
        public Boolean f127722c;

        /* renamed from: d */
        public SubType f127723d;

        /* renamed from: e */
        public Integer f127724e;

        /* renamed from: f */
        public Integer f127725f;

        /* renamed from: g */
        public PlanType f127726g;

        /* renamed from: h */
        public Boolean f127727h;

        /* renamed from: i */
        public Boolean f127728i;

        /* renamed from: j */
        public Boolean f127729j;

        /* renamed from: k */
        public Integer f127730k;

        /* renamed from: l */
        public VideoChatSecuritySetting f127731l;

        /* renamed from: m */
        public VideoChatI18nDefaultTopic f127732m;

        /* renamed from: n */
        public FeatureConfig f127733n;

        /* renamed from: o */
        public Boolean f127734o;

        /* renamed from: p */
        public VideoChatSIPSetting f127735p;

        /* renamed from: q */
        public Boolean f127736q;

        /* renamed from: r */
        public Boolean f127737r;

        /* renamed from: s */
        public VCManageCapabilities f127738s;

        /* renamed from: t */
        public Boolean f127739t;

        /* renamed from: u */
        public Integer f127740u;

        /* renamed from: v */
        public RTCProxy f127741v;

        /* renamed from: w */
        public Boolean f127742w;

        /* renamed from: x */
        public List<LanguageType> f127743x = Internal.newMutableList();

        /* renamed from: y */
        public Boolean f127744y;

        /* renamed from: z */
        public Boolean f127745z;

        /* renamed from: a */
        public VideoChatSettings build() {
            return new VideoChatSettings(this.f127720a, this.f127721b, this.f127722c, this.f127723d, this.f127724e, this.f127725f, this.f127726g, this.f127727h, this.f127728i, this.f127729j, this.f127730k, this.f127731l, this.f127732m, this.f127733n, this.f127734o, this.f127735p, this.f127736q, this.f127737r, this.f127738s, this.f127739t, this.f127740u, this.f127741v, this.f127742w, this.f127743x, this.f127744y, this.f127745z, this.f127717A, this.f127718B, this.f127719C, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C51286a mo176806a(Boolean bool) {
            this.f127721b = bool;
            return this;
        }

        /* renamed from: b */
        public C51286a mo176809b(Boolean bool) {
            this.f127722c = bool;
            return this;
        }

        /* renamed from: a */
        public C51286a mo176807a(String str) {
            this.f127720a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C51286a newBuilder() {
        C51286a aVar = new C51286a();
        aVar.f127720a = this.topic;
        aVar.f127721b = this.is_microphone_muted;
        aVar.f127722c = this.is_camera_muted;
        aVar.f127723d = this.sub_type;
        aVar.f127724e = this.max_participant_num;
        aVar.f127725f = this.max_videochat_duration;
        aVar.f127726g = this.plan_type;
        aVar.f127727h = this.should_early_join;
        aVar.f127728i = this.is_locked;
        aVar.f127729j = this.is_mute_on_entry;
        aVar.f127730k = this.plan_time_limit;
        aVar.f127731l = this.security_setting;
        aVar.f127732m = this.i18n_default_topic;
        aVar.f127733n = this.feature_config;
        aVar.f127734o = this.allow_parti_unmute;
        aVar.f127735p = this.sip_setting;
        aVar.f127736q = this.is_owner_joined_meeting;
        aVar.f127737r = this.only_host_can_share;
        aVar.f127738s = this.manage_capabilities;
        aVar.f127739t = this.only_host_can_replace_share;
        aVar.f127740u = this.max_soft_rtc_normal_mode;
        aVar.f127741v = this.rtc_proxy;
        aVar.f127742w = this.is_meeting_open_interpretation;
        aVar.f127743x = Internal.copyOf("meeting_support_languages", this.meeting_support_languages);
        aVar.f127744y = this.is_box_sharing;
        aVar.f127745z = this.only_presenter_can_annotate;
        aVar.f127717A = this.countdown_duration;
        aVar.f127718B = this.is_open_breakout_room;
        aVar.f127719C = this.h323_setting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VideoChatSettings");
        StringBuilder sb = new StringBuilder();
        if (this.topic != null) {
            sb.append(", topic=");
            sb.append(this.topic);
        }
        if (this.is_microphone_muted != null) {
            sb.append(", is_microphone_muted=");
            sb.append(this.is_microphone_muted);
        }
        if (this.is_camera_muted != null) {
            sb.append(", is_camera_muted=");
            sb.append(this.is_camera_muted);
        }
        if (this.sub_type != null) {
            sb.append(", sub_type=");
            sb.append(this.sub_type);
        }
        if (this.max_participant_num != null) {
            sb.append(", max_participant_num=");
            sb.append(this.max_participant_num);
        }
        if (this.max_videochat_duration != null) {
            sb.append(", max_videochat_duration=");
            sb.append(this.max_videochat_duration);
        }
        if (this.plan_type != null) {
            sb.append(", plan_type=");
            sb.append(this.plan_type);
        }
        if (this.should_early_join != null) {
            sb.append(", should_early_join=");
            sb.append(this.should_early_join);
        }
        if (this.is_locked != null) {
            sb.append(", is_locked=");
            sb.append(this.is_locked);
        }
        if (this.is_mute_on_entry != null) {
            sb.append(", is_mute_on_entry=");
            sb.append(this.is_mute_on_entry);
        }
        if (this.plan_time_limit != null) {
            sb.append(", plan_time_limit=");
            sb.append(this.plan_time_limit);
        }
        if (this.security_setting != null) {
            sb.append(", security_setting=");
            sb.append(this.security_setting);
        }
        if (this.i18n_default_topic != null) {
            sb.append(", i18n_default_topic=");
            sb.append(this.i18n_default_topic);
        }
        if (this.feature_config != null) {
            sb.append(", feature_config=");
            sb.append(this.feature_config);
        }
        if (this.allow_parti_unmute != null) {
            sb.append(", allow_parti_unmute=");
            sb.append(this.allow_parti_unmute);
        }
        if (this.sip_setting != null) {
            sb.append(", sip_setting=");
            sb.append(this.sip_setting);
        }
        if (this.is_owner_joined_meeting != null) {
            sb.append(", is_owner_joined_meeting=");
            sb.append(this.is_owner_joined_meeting);
        }
        if (this.only_host_can_share != null) {
            sb.append(", only_host_can_share=");
            sb.append(this.only_host_can_share);
        }
        if (this.manage_capabilities != null) {
            sb.append(", manage_capabilities=");
            sb.append(this.manage_capabilities);
        }
        if (this.only_host_can_replace_share != null) {
            sb.append(", only_host_can_replace_share=");
            sb.append(this.only_host_can_replace_share);
        }
        if (this.max_soft_rtc_normal_mode != null) {
            sb.append(", max_soft_rtc_normal_mode=");
            sb.append(this.max_soft_rtc_normal_mode);
        }
        if (this.rtc_proxy != null) {
            sb.append(", rtc_proxy=");
            sb.append(this.rtc_proxy);
        }
        if (this.is_meeting_open_interpretation != null) {
            sb.append(", is_meeting_open_interpretation=");
            sb.append(this.is_meeting_open_interpretation);
        }
        if (!this.meeting_support_languages.isEmpty()) {
            sb.append(", meeting_support_languages=");
            sb.append(this.meeting_support_languages);
        }
        if (this.is_box_sharing != null) {
            sb.append(", is_box_sharing=");
            sb.append(this.is_box_sharing);
        }
        if (this.only_presenter_can_annotate != null) {
            sb.append(", only_presenter_can_annotate=");
            sb.append(this.only_presenter_can_annotate);
        }
        if (this.countdown_duration != null) {
            sb.append(", countdown_duration=");
            sb.append(this.countdown_duration);
        }
        if (this.is_open_breakout_room != null) {
            sb.append(", is_open_breakout_room=");
            sb.append(this.is_open_breakout_room);
        }
        if (this.h323_setting != null) {
            sb.append(", h323_setting=");
            sb.append(this.h323_setting);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoChatSettings{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatSettings(String str, Boolean bool, Boolean bool2, SubType subType, Integer num, Integer num2, PlanType planType, Boolean bool3, Boolean bool4, Boolean bool5, Integer num3, VideoChatSecuritySetting videoChatSecuritySetting, VideoChatI18nDefaultTopic videoChatI18nDefaultTopic, FeatureConfig featureConfig, Boolean bool6, VideoChatSIPSetting videoChatSIPSetting, Boolean bool7, Boolean bool8, VCManageCapabilities vCManageCapabilities, Boolean bool9, Integer num4, RTCProxy rTCProxy, Boolean bool10, List<LanguageType> list, Boolean bool11, Boolean bool12, Integer num5, Boolean bool13, VideoChatH323Setting videoChatH323Setting) {
        this(str, bool, bool2, subType, num, num2, planType, bool3, bool4, bool5, num3, videoChatSecuritySetting, videoChatI18nDefaultTopic, featureConfig, bool6, videoChatSIPSetting, bool7, bool8, vCManageCapabilities, bool9, num4, rTCProxy, bool10, list, bool11, bool12, num5, bool13, videoChatH323Setting, ByteString.EMPTY);
    }

    public VideoChatSettings(String str, Boolean bool, Boolean bool2, SubType subType, Integer num, Integer num2, PlanType planType, Boolean bool3, Boolean bool4, Boolean bool5, Integer num3, VideoChatSecuritySetting videoChatSecuritySetting, VideoChatI18nDefaultTopic videoChatI18nDefaultTopic, FeatureConfig featureConfig, Boolean bool6, VideoChatSIPSetting videoChatSIPSetting, Boolean bool7, Boolean bool8, VCManageCapabilities vCManageCapabilities, Boolean bool9, Integer num4, RTCProxy rTCProxy, Boolean bool10, List<LanguageType> list, Boolean bool11, Boolean bool12, Integer num5, Boolean bool13, VideoChatH323Setting videoChatH323Setting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.topic = str;
        this.is_microphone_muted = bool;
        this.is_camera_muted = bool2;
        this.sub_type = subType;
        this.max_participant_num = num;
        this.max_videochat_duration = num2;
        this.plan_type = planType;
        this.should_early_join = bool3;
        this.is_locked = bool4;
        this.is_mute_on_entry = bool5;
        this.plan_time_limit = num3;
        this.security_setting = videoChatSecuritySetting;
        this.i18n_default_topic = videoChatI18nDefaultTopic;
        this.feature_config = featureConfig;
        this.allow_parti_unmute = bool6;
        this.sip_setting = videoChatSIPSetting;
        this.is_owner_joined_meeting = bool7;
        this.only_host_can_share = bool8;
        this.manage_capabilities = vCManageCapabilities;
        this.only_host_can_replace_share = bool9;
        this.max_soft_rtc_normal_mode = num4;
        this.rtc_proxy = rTCProxy;
        this.is_meeting_open_interpretation = bool10;
        this.meeting_support_languages = Internal.immutableCopyOf("meeting_support_languages", list);
        this.is_box_sharing = bool11;
        this.only_presenter_can_annotate = bool12;
        this.countdown_duration = num5;
        this.is_open_breakout_room = bool13;
        this.h323_setting = videoChatH323Setting;
    }
}
