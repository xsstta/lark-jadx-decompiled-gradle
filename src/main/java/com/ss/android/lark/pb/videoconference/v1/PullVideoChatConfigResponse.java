package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class PullVideoChatConfigResponse extends Message<PullVideoChatConfigResponse, C50936a> {
    public static final ProtoAdapter<PullVideoChatConfigResponse> ADAPTER = new C50937b();
    public static final Integer DEFAULT_CALL_HEARTBEAT_CYCLE = 0;
    public static final Integer DEFAULT_CALL_HEARTBEAT_EXPIRED_TIME = 0;
    public static final Integer DEFAULT_HEARTBEAT_CYCLE = 0;
    public static final Integer DEFAULT_HEARTBEAT_EXPIRED_TIME = 0;
    public static final Integer DEFAULT_LOBBY_HEARTBEAT_CYCLE = 0;
    public static final Integer DEFAULT_LOBBY_HEARTBEAT_EXPIRED_TIME = 0;
    public static final Integer DEFAULT_MAX_PARTICIPANT_COUNT = 0;
    public static final Integer DEFAULT_MEETING_HEARTBEAT_CYCLE = 0;
    public static final Integer DEFAULT_MEETING_HEARTBEAT_EXPIRED_TIME = 0;
    public static final Integer DEFAULT_PC_BATTERY_LOW_THRESHOLD = 40;
    public static final Integer DEFAULT_PC_CPU_WARN_THRESHOLD = 90;
    public static final Integer DEFAULT_PC_MAX_VISIBLE_VIDEO = 10;
    public static final Integer DEFAULT_RTC_MAX_PARTICIPANT_COUNT = 0;
    public static final Integer DEFAULT_VIDEOCHAT_COUNTDOWN_DURATION = 0;
    public static final Integer DEFAULT_VIDEO_STATUS_TTL = 3;
    private static final long serialVersionUID = 0;
    public final String active_user_config;
    public final ByteSdkRateConfig byte_sdk_rate_config;
    public final String bytesdk_pc_versions;
    public final Integer call_heartbeat_cycle;
    public final Integer call_heartbeat_expired_time;
    public final Map<Integer, Boolean> enable_upgrade_plan_notice;
    public final List<String> feedback_reason_subkeys;
    public final Integer heartbeat_cycle;
    public final Integer heartbeat_expired_time;
    public final Integer lobby_heartbeat_cycle;
    public final Integer lobby_heartbeat_expired_time;
    public final Integer max_participant_count;
    public final Integer meeting_heartbeat_cycle;
    public final Integer meeting_heartbeat_expired_time;
    public final List<LanguageType> meeting_support_interpretation_language;
    public final List<String> meeting_url_keys;
    public final List<String> meeting_url_path_keys;
    public final List<String> mobile_share_screen_feedback_reason_subkeys;
    public final Integer pc_battery_low_threshold;
    public final Integer pc_cpu_warn_threshold;
    public final Integer pc_max_visible_video;
    public final List<String> pc_share_screen_feedback_reason_subkeys;
    public final Integer rtc_max_participant_count;
    public final List<SubtitleLanguage> spoken_languages;
    public final List<SubtitleLanguage> subtitle_languages;
    public final Integer video_status_ttl;
    public final Integer videochat_countdown_duration;

    public static final class SubtitleLanguage extends Message<SubtitleLanguage, C50934a> {
        public static final ProtoAdapter<SubtitleLanguage> ADAPTER = new C50935b();
        private static final long serialVersionUID = 0;
        public final String description;
        public final String language;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.PullVideoChatConfigResponse$SubtitleLanguage$b */
        private static final class C50935b extends ProtoAdapter<SubtitleLanguage> {
            C50935b() {
                super(FieldEncoding.LENGTH_DELIMITED, SubtitleLanguage.class);
            }

            /* renamed from: a */
            public int encodedSize(SubtitleLanguage subtitleLanguage) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, subtitleLanguage.language) + ProtoAdapter.STRING.encodedSizeWithTag(2, subtitleLanguage.description) + subtitleLanguage.unknownFields().size();
            }

            /* renamed from: a */
            public SubtitleLanguage decode(ProtoReader protoReader) throws IOException {
                C50934a aVar = new C50934a();
                aVar.f126930a = "";
                aVar.f126931b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f126930a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126931b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SubtitleLanguage subtitleLanguage) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, subtitleLanguage.language);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, subtitleLanguage.description);
                protoWriter.writeBytes(subtitleLanguage.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50934a newBuilder() {
            C50934a aVar = new C50934a();
            aVar.f126930a = this.language;
            aVar.f126931b = this.description;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.PullVideoChatConfigResponse$SubtitleLanguage$a */
        public static final class C50934a extends Message.Builder<SubtitleLanguage, C50934a> {

            /* renamed from: a */
            public String f126930a;

            /* renamed from: b */
            public String f126931b;

            /* renamed from: a */
            public SubtitleLanguage build() {
                String str;
                String str2 = this.f126930a;
                if (str2 != null && (str = this.f126931b) != null) {
                    return new SubtitleLanguage(str2, str, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str2, "language", this.f126931b, "description");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "SubtitleLanguage");
            StringBuilder sb = new StringBuilder();
            sb.append(", language=");
            sb.append(this.language);
            sb.append(", description=");
            sb.append(this.description);
            StringBuilder replace = sb.replace(0, 2, "SubtitleLanguage{");
            replace.append('}');
            return replace.toString();
        }

        public SubtitleLanguage(String str, String str2) {
            this(str, str2, ByteString.EMPTY);
        }

        public SubtitleLanguage(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.language = str;
            this.description = str2;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PullVideoChatConfigResponse$b */
    private static final class C50937b extends ProtoAdapter<PullVideoChatConfigResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<Integer, Boolean>> f126959a = ProtoAdapter.newMapAdapter(ProtoAdapter.INT32, ProtoAdapter.BOOL);

        C50937b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullVideoChatConfigResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullVideoChatConfigResponse pullVideoChatConfigResponse) {
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
            int i18 = 0;
            if (pullVideoChatConfigResponse.max_participant_count != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, pullVideoChatConfigResponse.max_participant_count);
            } else {
                i = 0;
            }
            if (pullVideoChatConfigResponse.heartbeat_cycle != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, pullVideoChatConfigResponse.heartbeat_cycle);
            } else {
                i2 = 0;
            }
            int i19 = i + i2;
            if (pullVideoChatConfigResponse.heartbeat_expired_time != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, pullVideoChatConfigResponse.heartbeat_expired_time);
            } else {
                i3 = 0;
            }
            int i20 = i19 + i3;
            if (pullVideoChatConfigResponse.meeting_heartbeat_cycle != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(4, pullVideoChatConfigResponse.meeting_heartbeat_cycle);
            } else {
                i4 = 0;
            }
            int i21 = i20 + i4;
            if (pullVideoChatConfigResponse.meeting_heartbeat_expired_time != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(5, pullVideoChatConfigResponse.meeting_heartbeat_expired_time);
            } else {
                i5 = 0;
            }
            int i22 = i21 + i5;
            if (pullVideoChatConfigResponse.call_heartbeat_cycle != null) {
                i6 = ProtoAdapter.INT32.encodedSizeWithTag(6, pullVideoChatConfigResponse.call_heartbeat_cycle);
            } else {
                i6 = 0;
            }
            int i23 = i22 + i6;
            if (pullVideoChatConfigResponse.call_heartbeat_expired_time != null) {
                i7 = ProtoAdapter.INT32.encodedSizeWithTag(7, pullVideoChatConfigResponse.call_heartbeat_expired_time);
            } else {
                i7 = 0;
            }
            int encodedSizeWithTag = i23 + i7 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(8, pullVideoChatConfigResponse.feedback_reason_subkeys);
            if (pullVideoChatConfigResponse.rtc_max_participant_count != null) {
                i8 = ProtoAdapter.INT32.encodedSizeWithTag(10, pullVideoChatConfigResponse.rtc_max_participant_count);
            } else {
                i8 = 0;
            }
            int i24 = encodedSizeWithTag + i8;
            if (pullVideoChatConfigResponse.bytesdk_pc_versions != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(11, pullVideoChatConfigResponse.bytesdk_pc_versions);
            } else {
                i9 = 0;
            }
            int i25 = i24 + i9;
            if (pullVideoChatConfigResponse.byte_sdk_rate_config != null) {
                i10 = ByteSdkRateConfig.ADAPTER.encodedSizeWithTag(14, pullVideoChatConfigResponse.byte_sdk_rate_config);
            } else {
                i10 = 0;
            }
            int i26 = i25 + i10;
            if (pullVideoChatConfigResponse.pc_max_visible_video != null) {
                i11 = ProtoAdapter.INT32.encodedSizeWithTag(16, pullVideoChatConfigResponse.pc_max_visible_video);
            } else {
                i11 = 0;
            }
            int i27 = i26 + i11;
            if (pullVideoChatConfigResponse.active_user_config != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(17, pullVideoChatConfigResponse.active_user_config);
            } else {
                i12 = 0;
            }
            int i28 = i27 + i12;
            if (pullVideoChatConfigResponse.videochat_countdown_duration != null) {
                i13 = ProtoAdapter.INT32.encodedSizeWithTag(18, pullVideoChatConfigResponse.videochat_countdown_duration);
            } else {
                i13 = 0;
            }
            int i29 = i28 + i13;
            if (pullVideoChatConfigResponse.pc_cpu_warn_threshold != null) {
                i14 = ProtoAdapter.INT32.encodedSizeWithTag(19, pullVideoChatConfigResponse.pc_cpu_warn_threshold);
            } else {
                i14 = 0;
            }
            int i30 = i29 + i14;
            if (pullVideoChatConfigResponse.pc_battery_low_threshold != null) {
                i15 = ProtoAdapter.INT32.encodedSizeWithTag(20, pullVideoChatConfigResponse.pc_battery_low_threshold);
            } else {
                i15 = 0;
            }
            int i31 = i30 + i15;
            if (pullVideoChatConfigResponse.video_status_ttl != null) {
                i16 = ProtoAdapter.INT32.encodedSizeWithTag(21, pullVideoChatConfigResponse.video_status_ttl);
            } else {
                i16 = 0;
            }
            int encodedSizeWithTag2 = i31 + i16 + SubtitleLanguage.ADAPTER.asRepeated().encodedSizeWithTag(22, pullVideoChatConfigResponse.subtitle_languages) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(23, pullVideoChatConfigResponse.pc_share_screen_feedback_reason_subkeys) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(24, pullVideoChatConfigResponse.mobile_share_screen_feedback_reason_subkeys) + SubtitleLanguage.ADAPTER.asRepeated().encodedSizeWithTag(25, pullVideoChatConfigResponse.spoken_languages) + this.f126959a.encodedSizeWithTag(26, pullVideoChatConfigResponse.enable_upgrade_plan_notice) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(27, pullVideoChatConfigResponse.meeting_url_keys) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(28, pullVideoChatConfigResponse.meeting_url_path_keys);
            if (pullVideoChatConfigResponse.lobby_heartbeat_cycle != null) {
                i17 = ProtoAdapter.INT32.encodedSizeWithTag(29, pullVideoChatConfigResponse.lobby_heartbeat_cycle);
            } else {
                i17 = 0;
            }
            int i32 = encodedSizeWithTag2 + i17;
            if (pullVideoChatConfigResponse.lobby_heartbeat_expired_time != null) {
                i18 = ProtoAdapter.INT32.encodedSizeWithTag(30, pullVideoChatConfigResponse.lobby_heartbeat_expired_time);
            }
            return i32 + i18 + LanguageType.ADAPTER.asRepeated().encodedSizeWithTag(31, pullVideoChatConfigResponse.meeting_support_interpretation_language) + pullVideoChatConfigResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullVideoChatConfigResponse decode(ProtoReader protoReader) throws IOException {
            C50936a aVar = new C50936a();
            aVar.f126933a = 0;
            aVar.f126934b = 0;
            aVar.f126935c = 0;
            aVar.f126936d = 0;
            aVar.f126937e = 0;
            aVar.f126938f = 0;
            aVar.f126939g = 0;
            aVar.f126941i = 0;
            aVar.f126942j = "";
            aVar.f126944l = 10;
            aVar.f126945m = "";
            aVar.f126946n = 0;
            aVar.f126947o = 90;
            aVar.f126948p = 40;
            aVar.f126949q = 3;
            aVar.f126957y = 0;
            aVar.f126958z = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f126933a = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            aVar.f126934b = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            aVar.f126935c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            aVar.f126936d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f126937e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f126938f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            aVar.f126939g = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            aVar.f126940h.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                        case 13:
                        case 15:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 10:
                            aVar.f126941i = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 11:
                            aVar.f126942j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            aVar.f126943k = ByteSdkRateConfig.ADAPTER.decode(protoReader);
                            break;
                        case 16:
                            aVar.f126944l = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 17:
                            aVar.f126945m = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 18:
                            aVar.f126946n = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 19:
                            aVar.f126947o = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 20:
                            aVar.f126948p = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 21:
                            aVar.f126949q = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 22:
                            aVar.f126950r.add(SubtitleLanguage.ADAPTER.decode(protoReader));
                            break;
                        case 23:
                            aVar.f126951s.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 24:
                            aVar.f126952t.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                            aVar.f126953u.add(SubtitleLanguage.ADAPTER.decode(protoReader));
                            break;
                        case 26:
                            aVar.f126954v.putAll(this.f126959a.decode(protoReader));
                            break;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                            aVar.f126955w.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                            aVar.f126956x.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 29:
                            aVar.f126957y = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 30:
                            aVar.f126958z = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                            aVar.f126932A.add(LanguageType.ADAPTER.decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullVideoChatConfigResponse pullVideoChatConfigResponse) throws IOException {
            if (pullVideoChatConfigResponse.max_participant_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, pullVideoChatConfigResponse.max_participant_count);
            }
            if (pullVideoChatConfigResponse.heartbeat_cycle != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, pullVideoChatConfigResponse.heartbeat_cycle);
            }
            if (pullVideoChatConfigResponse.heartbeat_expired_time != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, pullVideoChatConfigResponse.heartbeat_expired_time);
            }
            if (pullVideoChatConfigResponse.meeting_heartbeat_cycle != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, pullVideoChatConfigResponse.meeting_heartbeat_cycle);
            }
            if (pullVideoChatConfigResponse.meeting_heartbeat_expired_time != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, pullVideoChatConfigResponse.meeting_heartbeat_expired_time);
            }
            if (pullVideoChatConfigResponse.call_heartbeat_cycle != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, pullVideoChatConfigResponse.call_heartbeat_cycle);
            }
            if (pullVideoChatConfigResponse.call_heartbeat_expired_time != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, pullVideoChatConfigResponse.call_heartbeat_expired_time);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 8, pullVideoChatConfigResponse.feedback_reason_subkeys);
            if (pullVideoChatConfigResponse.rtc_max_participant_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, pullVideoChatConfigResponse.rtc_max_participant_count);
            }
            if (pullVideoChatConfigResponse.bytesdk_pc_versions != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, pullVideoChatConfigResponse.bytesdk_pc_versions);
            }
            if (pullVideoChatConfigResponse.byte_sdk_rate_config != null) {
                ByteSdkRateConfig.ADAPTER.encodeWithTag(protoWriter, 14, pullVideoChatConfigResponse.byte_sdk_rate_config);
            }
            if (pullVideoChatConfigResponse.pc_max_visible_video != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 16, pullVideoChatConfigResponse.pc_max_visible_video);
            }
            if (pullVideoChatConfigResponse.active_user_config != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 17, pullVideoChatConfigResponse.active_user_config);
            }
            if (pullVideoChatConfigResponse.videochat_countdown_duration != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 18, pullVideoChatConfigResponse.videochat_countdown_duration);
            }
            if (pullVideoChatConfigResponse.pc_cpu_warn_threshold != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 19, pullVideoChatConfigResponse.pc_cpu_warn_threshold);
            }
            if (pullVideoChatConfigResponse.pc_battery_low_threshold != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 20, pullVideoChatConfigResponse.pc_battery_low_threshold);
            }
            if (pullVideoChatConfigResponse.video_status_ttl != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 21, pullVideoChatConfigResponse.video_status_ttl);
            }
            SubtitleLanguage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 22, pullVideoChatConfigResponse.subtitle_languages);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 23, pullVideoChatConfigResponse.pc_share_screen_feedback_reason_subkeys);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 24, pullVideoChatConfigResponse.mobile_share_screen_feedback_reason_subkeys);
            SubtitleLanguage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 25, pullVideoChatConfigResponse.spoken_languages);
            this.f126959a.encodeWithTag(protoWriter, 26, pullVideoChatConfigResponse.enable_upgrade_plan_notice);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 27, pullVideoChatConfigResponse.meeting_url_keys);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 28, pullVideoChatConfigResponse.meeting_url_path_keys);
            if (pullVideoChatConfigResponse.lobby_heartbeat_cycle != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 29, pullVideoChatConfigResponse.lobby_heartbeat_cycle);
            }
            if (pullVideoChatConfigResponse.lobby_heartbeat_expired_time != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 30, pullVideoChatConfigResponse.lobby_heartbeat_expired_time);
            }
            LanguageType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 31, pullVideoChatConfigResponse.meeting_support_interpretation_language);
            protoWriter.writeBytes(pullVideoChatConfigResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PullVideoChatConfigResponse$a */
    public static final class C50936a extends Message.Builder<PullVideoChatConfigResponse, C50936a> {

        /* renamed from: A */
        public List<LanguageType> f126932A = Internal.newMutableList();

        /* renamed from: a */
        public Integer f126933a;

        /* renamed from: b */
        public Integer f126934b;

        /* renamed from: c */
        public Integer f126935c;

        /* renamed from: d */
        public Integer f126936d;

        /* renamed from: e */
        public Integer f126937e;

        /* renamed from: f */
        public Integer f126938f;

        /* renamed from: g */
        public Integer f126939g;

        /* renamed from: h */
        public List<String> f126940h = Internal.newMutableList();

        /* renamed from: i */
        public Integer f126941i;

        /* renamed from: j */
        public String f126942j;

        /* renamed from: k */
        public ByteSdkRateConfig f126943k;

        /* renamed from: l */
        public Integer f126944l;

        /* renamed from: m */
        public String f126945m;

        /* renamed from: n */
        public Integer f126946n;

        /* renamed from: o */
        public Integer f126947o;

        /* renamed from: p */
        public Integer f126948p;

        /* renamed from: q */
        public Integer f126949q;

        /* renamed from: r */
        public List<SubtitleLanguage> f126950r = Internal.newMutableList();

        /* renamed from: s */
        public List<String> f126951s = Internal.newMutableList();

        /* renamed from: t */
        public List<String> f126952t = Internal.newMutableList();

        /* renamed from: u */
        public List<SubtitleLanguage> f126953u = Internal.newMutableList();

        /* renamed from: v */
        public Map<Integer, Boolean> f126954v = Internal.newMutableMap();

        /* renamed from: w */
        public List<String> f126955w = Internal.newMutableList();

        /* renamed from: x */
        public List<String> f126956x = Internal.newMutableList();

        /* renamed from: y */
        public Integer f126957y;

        /* renamed from: z */
        public Integer f126958z;

        /* renamed from: a */
        public PullVideoChatConfigResponse build() {
            return new PullVideoChatConfigResponse(this.f126933a, this.f126934b, this.f126935c, this.f126936d, this.f126937e, this.f126938f, this.f126939g, this.f126940h, this.f126941i, this.f126942j, this.f126943k, this.f126944l, this.f126945m, this.f126946n, this.f126947o, this.f126948p, this.f126949q, this.f126950r, this.f126951s, this.f126952t, this.f126953u, this.f126954v, this.f126955w, this.f126956x, this.f126957y, this.f126958z, this.f126932A, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50936a newBuilder() {
        C50936a aVar = new C50936a();
        aVar.f126933a = this.max_participant_count;
        aVar.f126934b = this.heartbeat_cycle;
        aVar.f126935c = this.heartbeat_expired_time;
        aVar.f126936d = this.meeting_heartbeat_cycle;
        aVar.f126937e = this.meeting_heartbeat_expired_time;
        aVar.f126938f = this.call_heartbeat_cycle;
        aVar.f126939g = this.call_heartbeat_expired_time;
        aVar.f126940h = Internal.copyOf("feedback_reason_subkeys", this.feedback_reason_subkeys);
        aVar.f126941i = this.rtc_max_participant_count;
        aVar.f126942j = this.bytesdk_pc_versions;
        aVar.f126943k = this.byte_sdk_rate_config;
        aVar.f126944l = this.pc_max_visible_video;
        aVar.f126945m = this.active_user_config;
        aVar.f126946n = this.videochat_countdown_duration;
        aVar.f126947o = this.pc_cpu_warn_threshold;
        aVar.f126948p = this.pc_battery_low_threshold;
        aVar.f126949q = this.video_status_ttl;
        aVar.f126950r = Internal.copyOf("subtitle_languages", this.subtitle_languages);
        aVar.f126951s = Internal.copyOf("pc_share_screen_feedback_reason_subkeys", this.pc_share_screen_feedback_reason_subkeys);
        aVar.f126952t = Internal.copyOf("mobile_share_screen_feedback_reason_subkeys", this.mobile_share_screen_feedback_reason_subkeys);
        aVar.f126953u = Internal.copyOf("spoken_languages", this.spoken_languages);
        aVar.f126954v = Internal.copyOf("enable_upgrade_plan_notice", this.enable_upgrade_plan_notice);
        aVar.f126955w = Internal.copyOf("meeting_url_keys", this.meeting_url_keys);
        aVar.f126956x = Internal.copyOf("meeting_url_path_keys", this.meeting_url_path_keys);
        aVar.f126957y = this.lobby_heartbeat_cycle;
        aVar.f126958z = this.lobby_heartbeat_expired_time;
        aVar.f126932A = Internal.copyOf("meeting_support_interpretation_language", this.meeting_support_interpretation_language);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "PullVideoChatConfigResponse");
        StringBuilder sb = new StringBuilder();
        if (this.max_participant_count != null) {
            sb.append(", max_participant_count=");
            sb.append(this.max_participant_count);
        }
        if (this.heartbeat_cycle != null) {
            sb.append(", heartbeat_cycle=");
            sb.append(this.heartbeat_cycle);
        }
        if (this.heartbeat_expired_time != null) {
            sb.append(", heartbeat_expired_time=");
            sb.append(this.heartbeat_expired_time);
        }
        if (this.meeting_heartbeat_cycle != null) {
            sb.append(", meeting_heartbeat_cycle=");
            sb.append(this.meeting_heartbeat_cycle);
        }
        if (this.meeting_heartbeat_expired_time != null) {
            sb.append(", meeting_heartbeat_expired_time=");
            sb.append(this.meeting_heartbeat_expired_time);
        }
        if (this.call_heartbeat_cycle != null) {
            sb.append(", call_heartbeat_cycle=");
            sb.append(this.call_heartbeat_cycle);
        }
        if (this.call_heartbeat_expired_time != null) {
            sb.append(", call_heartbeat_expired_time=");
            sb.append(this.call_heartbeat_expired_time);
        }
        if (!this.feedback_reason_subkeys.isEmpty()) {
            sb.append(", feedback_reason_subkeys=");
            sb.append(this.feedback_reason_subkeys);
        }
        if (this.rtc_max_participant_count != null) {
            sb.append(", rtc_max_participant_count=");
            sb.append(this.rtc_max_participant_count);
        }
        if (this.bytesdk_pc_versions != null) {
            sb.append(", bytesdk_pc_versions=");
            sb.append(this.bytesdk_pc_versions);
        }
        if (this.byte_sdk_rate_config != null) {
            sb.append(", byte_sdk_rate_config=");
            sb.append(this.byte_sdk_rate_config);
        }
        if (this.pc_max_visible_video != null) {
            sb.append(", pc_max_visible_video=");
            sb.append(this.pc_max_visible_video);
        }
        if (this.active_user_config != null) {
            sb.append(", active_user_config=");
            sb.append(this.active_user_config);
        }
        if (this.videochat_countdown_duration != null) {
            sb.append(", videochat_countdown_duration=");
            sb.append(this.videochat_countdown_duration);
        }
        if (this.pc_cpu_warn_threshold != null) {
            sb.append(", pc_cpu_warn_threshold=");
            sb.append(this.pc_cpu_warn_threshold);
        }
        if (this.pc_battery_low_threshold != null) {
            sb.append(", pc_battery_low_threshold=");
            sb.append(this.pc_battery_low_threshold);
        }
        if (this.video_status_ttl != null) {
            sb.append(", video_status_ttl=");
            sb.append(this.video_status_ttl);
        }
        if (!this.subtitle_languages.isEmpty()) {
            sb.append(", subtitle_languages=");
            sb.append(this.subtitle_languages);
        }
        if (!this.pc_share_screen_feedback_reason_subkeys.isEmpty()) {
            sb.append(", pc_share_screen_feedback_reason_subkeys=");
            sb.append(this.pc_share_screen_feedback_reason_subkeys);
        }
        if (!this.mobile_share_screen_feedback_reason_subkeys.isEmpty()) {
            sb.append(", mobile_share_screen_feedback_reason_subkeys=");
            sb.append(this.mobile_share_screen_feedback_reason_subkeys);
        }
        if (!this.spoken_languages.isEmpty()) {
            sb.append(", spoken_languages=");
            sb.append(this.spoken_languages);
        }
        if (!this.enable_upgrade_plan_notice.isEmpty()) {
            sb.append(", enable_upgrade_plan_notice=");
            sb.append(this.enable_upgrade_plan_notice);
        }
        if (!this.meeting_url_keys.isEmpty()) {
            sb.append(", meeting_url_keys=");
            sb.append(this.meeting_url_keys);
        }
        if (!this.meeting_url_path_keys.isEmpty()) {
            sb.append(", meeting_url_path_keys=");
            sb.append(this.meeting_url_path_keys);
        }
        if (this.lobby_heartbeat_cycle != null) {
            sb.append(", lobby_heartbeat_cycle=");
            sb.append(this.lobby_heartbeat_cycle);
        }
        if (this.lobby_heartbeat_expired_time != null) {
            sb.append(", lobby_heartbeat_expired_time=");
            sb.append(this.lobby_heartbeat_expired_time);
        }
        if (!this.meeting_support_interpretation_language.isEmpty()) {
            sb.append(", meeting_support_interpretation_language=");
            sb.append(this.meeting_support_interpretation_language);
        }
        StringBuilder replace = sb.replace(0, 2, "PullVideoChatConfigResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullVideoChatConfigResponse(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, List<String> list, Integer num8, String str, ByteSdkRateConfig byteSdkRateConfig, Integer num9, String str2, Integer num10, Integer num11, Integer num12, Integer num13, List<SubtitleLanguage> list2, List<String> list3, List<String> list4, List<SubtitleLanguage> list5, Map<Integer, Boolean> map, List<String> list6, List<String> list7, Integer num14, Integer num15, List<LanguageType> list8) {
        this(num, num2, num3, num4, num5, num6, num7, list, num8, str, byteSdkRateConfig, num9, str2, num10, num11, num12, num13, list2, list3, list4, list5, map, list6, list7, num14, num15, list8, ByteString.EMPTY);
    }

    public PullVideoChatConfigResponse(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, List<String> list, Integer num8, String str, ByteSdkRateConfig byteSdkRateConfig, Integer num9, String str2, Integer num10, Integer num11, Integer num12, Integer num13, List<SubtitleLanguage> list2, List<String> list3, List<String> list4, List<SubtitleLanguage> list5, Map<Integer, Boolean> map, List<String> list6, List<String> list7, Integer num14, Integer num15, List<LanguageType> list8, ByteString byteString) {
        super(ADAPTER, byteString);
        this.max_participant_count = num;
        this.heartbeat_cycle = num2;
        this.heartbeat_expired_time = num3;
        this.meeting_heartbeat_cycle = num4;
        this.meeting_heartbeat_expired_time = num5;
        this.call_heartbeat_cycle = num6;
        this.call_heartbeat_expired_time = num7;
        this.feedback_reason_subkeys = Internal.immutableCopyOf("feedback_reason_subkeys", list);
        this.rtc_max_participant_count = num8;
        this.bytesdk_pc_versions = str;
        this.byte_sdk_rate_config = byteSdkRateConfig;
        this.pc_max_visible_video = num9;
        this.active_user_config = str2;
        this.videochat_countdown_duration = num10;
        this.pc_cpu_warn_threshold = num11;
        this.pc_battery_low_threshold = num12;
        this.video_status_ttl = num13;
        this.subtitle_languages = Internal.immutableCopyOf("subtitle_languages", list2);
        this.pc_share_screen_feedback_reason_subkeys = Internal.immutableCopyOf("pc_share_screen_feedback_reason_subkeys", list3);
        this.mobile_share_screen_feedback_reason_subkeys = Internal.immutableCopyOf("mobile_share_screen_feedback_reason_subkeys", list4);
        this.spoken_languages = Internal.immutableCopyOf("spoken_languages", list5);
        this.enable_upgrade_plan_notice = Internal.immutableCopyOf("enable_upgrade_plan_notice", map);
        this.meeting_url_keys = Internal.immutableCopyOf("meeting_url_keys", list6);
        this.meeting_url_path_keys = Internal.immutableCopyOf("meeting_url_path_keys", list7);
        this.lobby_heartbeat_cycle = num14;
        this.lobby_heartbeat_expired_time = num15;
        this.meeting_support_interpretation_language = Internal.immutableCopyOf("meeting_support_interpretation_language", list8);
    }
}
