package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class VideoChatInfo extends Message<VideoChatInfo, C51246a> {
    public static final ProtoAdapter<VideoChatInfo> ADAPTER = new C51247b();
    public static final EndReason DEFAULT_END_REASON = EndReason.UNKNOWN_END_REASON;
    public static final Boolean DEFAULT_FORCE = false;
    public static final ParticipantType DEFAULT_HOST_TYPE = ParticipantType.LARK_USER;
    public static final ParticipantType DEFAULT_INVITER_TYPE = ParticipantType.LARK_USER;
    public static final Boolean DEFAULT_IS_EXTERNAL_MEETING_WHEN_RING = false;
    public static final Boolean DEFAULT_IS_LARK_MEETING = false;
    public static final Boolean DEFAULT_IS_VOICE_CALL = false;
    public static final MeetingSource DEFAULT_MEETING_SOURCE = MeetingSource.VC_UNKNOWN_SOURCE_TYPE;
    public static final Long DEFAULT_SEQ_ID = 0L;
    public static final Long DEFAULT_START_TIME = 0L;
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    public static final VendorType DEFAULT_VENDOR_TYPE = VendorType.UNKNOWN_VENDOR_TYPE;
    private static final long serialVersionUID = 0;
    public final ActionTime action_time;
    public final List<BreakoutRoomInfo> breakout_room_infos;
    public final EndReason end_reason;
    public final Boolean force;
    public final String group_id;
    public final String host_device_id;
    public final String host_id;
    public final ParticipantType host_type;
    public final String id;
    public final String info;
    public final String inviter_id;
    public final ParticipantType inviter_type;
    public final Boolean is_external_meeting_when_ring;
    public final Boolean is_lark_meeting;
    public final Boolean is_voice_call;
    public final String meet_number;
    public final ByteviewUser meeting_owner;
    public final MeetingSource meeting_source;
    public final MsgInfo msg;
    public final List<Participant> participants;
    public final Long seq_id;
    public final VideoChatSettings settings;
    public final String sid;
    public final ByteviewUser sponsor;
    public final Long start_time;
    public final String tenant_id;
    public final Map<String, String> track_info;
    public final Type type;
    public final VendorType vendor_type;

    public enum EndReason implements WireEnum {
        UNKNOWN_END_REASON(0),
        HANG_UP(1),
        CONNECTION_FAILED(2),
        RING_TIMEOUT(3),
        SDK_EXCEPTION(4),
        CANCEL(5),
        REFUSE(6),
        ACCEPT_OTHER(7),
        TRIAL_TIMEOUT(8),
        CALL_EXCEPTION(9),
        AUTO_END(10);
        
        public static final ProtoAdapter<EndReason> ADAPTER = ProtoAdapter.newEnumAdapter(EndReason.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static EndReason fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_END_REASON;
                case 1:
                    return HANG_UP;
                case 2:
                    return CONNECTION_FAILED;
                case 3:
                    return RING_TIMEOUT;
                case 4:
                    return SDK_EXCEPTION;
                case 5:
                    return CANCEL;
                case 6:
                    return REFUSE;
                case 7:
                    return ACCEPT_OTHER;
                case 8:
                    return TRIAL_TIMEOUT;
                case 9:
                    return CALL_EXCEPTION;
                case 10:
                    return AUTO_END;
                default:
                    return null;
            }
        }

        private EndReason(int i) {
            this.value = i;
        }
    }

    public enum MeetingSource implements WireEnum {
        VC_UNKNOWN_SOURCE_TYPE(0),
        VC_FROM_USER(1),
        VC_FROM_CALENDAR(2),
        VC_FROM_INTERVIEW(3),
        VC_FROM_DOC(5);
        
        public static final ProtoAdapter<MeetingSource> ADAPTER = ProtoAdapter.newEnumAdapter(MeetingSource.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static MeetingSource fromValue(int i) {
            if (i == 0) {
                return VC_UNKNOWN_SOURCE_TYPE;
            }
            if (i == 1) {
                return VC_FROM_USER;
            }
            if (i == 2) {
                return VC_FROM_CALENDAR;
            }
            if (i == 3) {
                return VC_FROM_INTERVIEW;
            }
            if (i != 5) {
                return null;
            }
            return VC_FROM_DOC;
        }

        private MeetingSource(int i) {
            this.value = i;
        }
    }

    public enum Type implements WireEnum {
        UNKNOWN(0),
        CALL(1),
        MEET(2);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return CALL;
            }
            if (i != 2) {
                return null;
            }
            return MEET;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public enum VendorType implements WireEnum {
        UNKNOWN_VENDOR_TYPE(0),
        ZOOM(1),
        RTC(2),
        LARK_RTC(3),
        LARK_PRE_RTC(4),
        LARK_RTC_TEST_PRE(240),
        LARK_RTC_TEST_GAUSS(241),
        LARK_RTC_TEST(255);
        
        public static final ProtoAdapter<VendorType> ADAPTER = ProtoAdapter.newEnumAdapter(VendorType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static VendorType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_VENDOR_TYPE;
            }
            if (i == 1) {
                return ZOOM;
            }
            if (i == 2) {
                return RTC;
            }
            if (i == 3) {
                return LARK_RTC;
            }
            if (i == 4) {
                return LARK_PRE_RTC;
            }
            if (i == 240) {
                return LARK_RTC_TEST_PRE;
            }
            if (i == 241) {
                return LARK_RTC_TEST_GAUSS;
            }
            if (i != 255) {
                return null;
            }
            return LARK_RTC_TEST;
        }

        private VendorType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatInfo$b */
    private static final class C51247b extends ProtoAdapter<VideoChatInfo> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f127618a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C51247b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatInfo videoChatInfo) {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, videoChatInfo.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, videoChatInfo.host_id) + Type.ADAPTER.encodedSizeWithTag(3, videoChatInfo.type) + Participant.ADAPTER.asRepeated().encodedSizeWithTag(4, videoChatInfo.participants);
            int i21 = 0;
            if (videoChatInfo.group_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(5, videoChatInfo.group_id);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + ProtoAdapter.STRING.encodedSizeWithTag(6, videoChatInfo.info) + ProtoAdapter.STRING.encodedSizeWithTag(7, videoChatInfo.inviter_id);
            if (videoChatInfo.force != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(8, videoChatInfo.force);
            } else {
                i2 = 0;
            }
            int i22 = encodedSizeWithTag2 + i2;
            if (videoChatInfo.end_reason != null) {
                i3 = EndReason.ADAPTER.encodedSizeWithTag(10, videoChatInfo.end_reason);
            } else {
                i3 = 0;
            }
            int i23 = i22 + i3;
            if (videoChatInfo.action_time != null) {
                i4 = ActionTime.ADAPTER.encodedSizeWithTag(11, videoChatInfo.action_time);
            } else {
                i4 = 0;
            }
            int i24 = i23 + i4;
            if (videoChatInfo.seq_id != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(12, videoChatInfo.seq_id);
            } else {
                i5 = 0;
            }
            int i25 = i24 + i5;
            if (videoChatInfo.settings != null) {
                i6 = VideoChatSettings.ADAPTER.encodedSizeWithTag(13, videoChatInfo.settings);
            } else {
                i6 = 0;
            }
            int i26 = i25 + i6;
            if (videoChatInfo.vendor_type != null) {
                i7 = VendorType.ADAPTER.encodedSizeWithTag(14, videoChatInfo.vendor_type);
            } else {
                i7 = 0;
            }
            int encodedSizeWithTag3 = i26 + i7 + this.f127618a.encodedSizeWithTag(15, videoChatInfo.track_info);
            if (videoChatInfo.start_time != null) {
                i8 = ProtoAdapter.INT64.encodedSizeWithTag(16, videoChatInfo.start_time);
            } else {
                i8 = 0;
            }
            int i27 = encodedSizeWithTag3 + i8;
            if (videoChatInfo.host_type != null) {
                i9 = ParticipantType.ADAPTER.encodedSizeWithTag(17, videoChatInfo.host_type);
            } else {
                i9 = 0;
            }
            int i28 = i27 + i9;
            if (videoChatInfo.inviter_type != null) {
                i10 = ParticipantType.ADAPTER.encodedSizeWithTag(18, videoChatInfo.inviter_type);
            } else {
                i10 = 0;
            }
            int i29 = i28 + i10;
            if (videoChatInfo.meet_number != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(19, videoChatInfo.meet_number);
            } else {
                i11 = 0;
            }
            int i30 = i29 + i11;
            if (videoChatInfo.msg != null) {
                i12 = MsgInfo.ADAPTER.encodedSizeWithTag(20, videoChatInfo.msg);
            } else {
                i12 = 0;
            }
            int i31 = i30 + i12;
            if (videoChatInfo.meeting_source != null) {
                i13 = MeetingSource.ADAPTER.encodedSizeWithTag(21, videoChatInfo.meeting_source);
            } else {
                i13 = 0;
            }
            int i32 = i31 + i13;
            if (videoChatInfo.host_device_id != null) {
                i14 = ProtoAdapter.STRING.encodedSizeWithTag(22, videoChatInfo.host_device_id);
            } else {
                i14 = 0;
            }
            int i33 = i32 + i14;
            if (videoChatInfo.is_voice_call != null) {
                i15 = ProtoAdapter.BOOL.encodedSizeWithTag(23, videoChatInfo.is_voice_call);
            } else {
                i15 = 0;
            }
            int i34 = i33 + i15;
            if (videoChatInfo.sponsor != null) {
                i16 = ByteviewUser.ADAPTER.encodedSizeWithTag(24, videoChatInfo.sponsor);
            } else {
                i16 = 0;
            }
            int i35 = i34 + i16;
            if (videoChatInfo.tenant_id != null) {
                i17 = ProtoAdapter.STRING.encodedSizeWithTag(25, videoChatInfo.tenant_id);
            } else {
                i17 = 0;
            }
            int i36 = i35 + i17;
            if (videoChatInfo.is_lark_meeting != null) {
                i18 = ProtoAdapter.BOOL.encodedSizeWithTag(27, videoChatInfo.is_lark_meeting);
            } else {
                i18 = 0;
            }
            int i37 = i36 + i18;
            if (videoChatInfo.meeting_owner != null) {
                i19 = ByteviewUser.ADAPTER.encodedSizeWithTag(28, videoChatInfo.meeting_owner);
            } else {
                i19 = 0;
            }
            int i38 = i37 + i19;
            if (videoChatInfo.is_external_meeting_when_ring != null) {
                i20 = ProtoAdapter.BOOL.encodedSizeWithTag(29, videoChatInfo.is_external_meeting_when_ring);
            } else {
                i20 = 0;
            }
            int i39 = i38 + i20;
            if (videoChatInfo.sid != null) {
                i21 = ProtoAdapter.STRING.encodedSizeWithTag(31, videoChatInfo.sid);
            }
            return i39 + i21 + BreakoutRoomInfo.ADAPTER.asRepeated().encodedSizeWithTag(33, videoChatInfo.breakout_room_infos) + videoChatInfo.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatInfo decode(ProtoReader protoReader) throws IOException {
            C51246a aVar = new C51246a();
            aVar.f127592a = "";
            aVar.f127593b = "";
            aVar.f127594c = Type.UNKNOWN;
            aVar.f127596e = "";
            aVar.f127597f = "";
            aVar.f127598g = "";
            aVar.f127599h = false;
            aVar.f127600i = EndReason.UNKNOWN_END_REASON;
            aVar.f127602k = 0L;
            aVar.f127604m = VendorType.UNKNOWN_VENDOR_TYPE;
            aVar.f127606o = 0L;
            aVar.f127607p = ParticipantType.LARK_USER;
            aVar.f127608q = ParticipantType.LARK_USER;
            aVar.f127609r = "";
            aVar.f127611t = MeetingSource.VC_UNKNOWN_SOURCE_TYPE;
            aVar.f127612u = "";
            aVar.f127613v = false;
            aVar.f127615x = "";
            aVar.f127616y = false;
            aVar.f127589A = false;
            aVar.f127590B = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f127592a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f127593b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f127594c = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f127595d.add(Participant.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            aVar.f127596e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f127597f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f127598g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f127599h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                        case 26:
                        case 30:
                        case 32:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 10:
                            try {
                                aVar.f127600i = EndReason.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 11:
                            aVar.f127601j = ActionTime.ADAPTER.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f127602k = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 13:
                            aVar.f127603l = VideoChatSettings.ADAPTER.decode(protoReader);
                            break;
                        case 14:
                            try {
                                aVar.f127604m = VendorType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 15:
                            aVar.f127605n.putAll(this.f127618a.decode(protoReader));
                            break;
                        case 16:
                            aVar.f127606o = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 17:
                            try {
                                aVar.f127607p = ParticipantType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                break;
                            }
                        case 18:
                            try {
                                aVar.f127608q = ParticipantType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e5.value));
                                break;
                            }
                        case 19:
                            aVar.f127609r = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 20:
                            aVar.f127610s = MsgInfo.ADAPTER.decode(protoReader);
                            break;
                        case 21:
                            try {
                                aVar.f127611t = MeetingSource.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e6.value));
                                break;
                            }
                        case 22:
                            aVar.f127612u = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 23:
                            aVar.f127613v = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 24:
                            aVar.f127614w = ByteviewUser.ADAPTER.decode(protoReader);
                            break;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                            aVar.f127615x = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                            aVar.f127616y = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                            aVar.f127617z = ByteviewUser.ADAPTER.decode(protoReader);
                            break;
                        case 29:
                            aVar.f127589A = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                            aVar.f127590B = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 33:
                            aVar.f127591C.add(BreakoutRoomInfo.ADAPTER.decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VideoChatInfo videoChatInfo) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, videoChatInfo.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, videoChatInfo.host_id);
            Type.ADAPTER.encodeWithTag(protoWriter, 3, videoChatInfo.type);
            Participant.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, videoChatInfo.participants);
            if (videoChatInfo.group_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, videoChatInfo.group_id);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, videoChatInfo.info);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, videoChatInfo.inviter_id);
            if (videoChatInfo.force != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, videoChatInfo.force);
            }
            if (videoChatInfo.end_reason != null) {
                EndReason.ADAPTER.encodeWithTag(protoWriter, 10, videoChatInfo.end_reason);
            }
            if (videoChatInfo.action_time != null) {
                ActionTime.ADAPTER.encodeWithTag(protoWriter, 11, videoChatInfo.action_time);
            }
            if (videoChatInfo.seq_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 12, videoChatInfo.seq_id);
            }
            if (videoChatInfo.settings != null) {
                VideoChatSettings.ADAPTER.encodeWithTag(protoWriter, 13, videoChatInfo.settings);
            }
            if (videoChatInfo.vendor_type != null) {
                VendorType.ADAPTER.encodeWithTag(protoWriter, 14, videoChatInfo.vendor_type);
            }
            this.f127618a.encodeWithTag(protoWriter, 15, videoChatInfo.track_info);
            if (videoChatInfo.start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 16, videoChatInfo.start_time);
            }
            if (videoChatInfo.host_type != null) {
                ParticipantType.ADAPTER.encodeWithTag(protoWriter, 17, videoChatInfo.host_type);
            }
            if (videoChatInfo.inviter_type != null) {
                ParticipantType.ADAPTER.encodeWithTag(protoWriter, 18, videoChatInfo.inviter_type);
            }
            if (videoChatInfo.meet_number != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 19, videoChatInfo.meet_number);
            }
            if (videoChatInfo.msg != null) {
                MsgInfo.ADAPTER.encodeWithTag(protoWriter, 20, videoChatInfo.msg);
            }
            if (videoChatInfo.meeting_source != null) {
                MeetingSource.ADAPTER.encodeWithTag(protoWriter, 21, videoChatInfo.meeting_source);
            }
            if (videoChatInfo.host_device_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 22, videoChatInfo.host_device_id);
            }
            if (videoChatInfo.is_voice_call != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 23, videoChatInfo.is_voice_call);
            }
            if (videoChatInfo.sponsor != null) {
                ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 24, videoChatInfo.sponsor);
            }
            if (videoChatInfo.tenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 25, videoChatInfo.tenant_id);
            }
            if (videoChatInfo.is_lark_meeting != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 27, videoChatInfo.is_lark_meeting);
            }
            if (videoChatInfo.meeting_owner != null) {
                ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 28, videoChatInfo.meeting_owner);
            }
            if (videoChatInfo.is_external_meeting_when_ring != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 29, videoChatInfo.is_external_meeting_when_ring);
            }
            if (videoChatInfo.sid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 31, videoChatInfo.sid);
            }
            BreakoutRoomInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 33, videoChatInfo.breakout_room_infos);
            protoWriter.writeBytes(videoChatInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatInfo$a */
    public static final class C51246a extends Message.Builder<VideoChatInfo, C51246a> {

        /* renamed from: A */
        public Boolean f127589A;

        /* renamed from: B */
        public String f127590B;

        /* renamed from: C */
        public List<BreakoutRoomInfo> f127591C = Internal.newMutableList();

        /* renamed from: a */
        public String f127592a;

        /* renamed from: b */
        public String f127593b;

        /* renamed from: c */
        public Type f127594c;

        /* renamed from: d */
        public List<Participant> f127595d = Internal.newMutableList();

        /* renamed from: e */
        public String f127596e;

        /* renamed from: f */
        public String f127597f;

        /* renamed from: g */
        public String f127598g;

        /* renamed from: h */
        public Boolean f127599h;

        /* renamed from: i */
        public EndReason f127600i;

        /* renamed from: j */
        public ActionTime f127601j;

        /* renamed from: k */
        public Long f127602k;

        /* renamed from: l */
        public VideoChatSettings f127603l;

        /* renamed from: m */
        public VendorType f127604m;

        /* renamed from: n */
        public Map<String, String> f127605n = Internal.newMutableMap();

        /* renamed from: o */
        public Long f127606o;

        /* renamed from: p */
        public ParticipantType f127607p;

        /* renamed from: q */
        public ParticipantType f127608q;

        /* renamed from: r */
        public String f127609r;

        /* renamed from: s */
        public MsgInfo f127610s;

        /* renamed from: t */
        public MeetingSource f127611t;

        /* renamed from: u */
        public String f127612u;

        /* renamed from: v */
        public Boolean f127613v;

        /* renamed from: w */
        public ByteviewUser f127614w;

        /* renamed from: x */
        public String f127615x;

        /* renamed from: y */
        public Boolean f127616y;

        /* renamed from: z */
        public ByteviewUser f127617z;

        /* renamed from: a */
        public VideoChatInfo build() {
            String str;
            Type type;
            String str2;
            String str3;
            String str4 = this.f127592a;
            if (str4 != null && (str = this.f127593b) != null && (type = this.f127594c) != null && (str2 = this.f127597f) != null && (str3 = this.f127598g) != null) {
                return new VideoChatInfo(str4, str, type, this.f127595d, this.f127596e, str2, str3, this.f127599h, this.f127600i, this.f127601j, this.f127602k, this.f127603l, this.f127604m, this.f127605n, this.f127606o, this.f127607p, this.f127608q, this.f127609r, this.f127610s, this.f127611t, this.f127612u, this.f127613v, this.f127614w, this.f127615x, this.f127616y, this.f127617z, this.f127589A, this.f127590B, this.f127591C, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str4, "id", this.f127593b, "host_id", this.f127594c, ShareHitPoint.f121869d, this.f127597f, "info", this.f127598g, "inviter_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C51246a newBuilder() {
        C51246a aVar = new C51246a();
        aVar.f127592a = this.id;
        aVar.f127593b = this.host_id;
        aVar.f127594c = this.type;
        aVar.f127595d = Internal.copyOf("participants", this.participants);
        aVar.f127596e = this.group_id;
        aVar.f127597f = this.info;
        aVar.f127598g = this.inviter_id;
        aVar.f127599h = this.force;
        aVar.f127600i = this.end_reason;
        aVar.f127601j = this.action_time;
        aVar.f127602k = this.seq_id;
        aVar.f127603l = this.settings;
        aVar.f127604m = this.vendor_type;
        aVar.f127605n = Internal.copyOf("track_info", this.track_info);
        aVar.f127606o = this.start_time;
        aVar.f127607p = this.host_type;
        aVar.f127608q = this.inviter_type;
        aVar.f127609r = this.meet_number;
        aVar.f127610s = this.msg;
        aVar.f127611t = this.meeting_source;
        aVar.f127612u = this.host_device_id;
        aVar.f127613v = this.is_voice_call;
        aVar.f127614w = this.sponsor;
        aVar.f127615x = this.tenant_id;
        aVar.f127616y = this.is_lark_meeting;
        aVar.f127617z = this.meeting_owner;
        aVar.f127589A = this.is_external_meeting_when_ring;
        aVar.f127590B = this.sid;
        aVar.f127591C = Internal.copyOf("breakout_room_infos", this.breakout_room_infos);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VideoChatInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", host_id=");
        sb.append(this.host_id);
        sb.append(", type=");
        sb.append(this.type);
        if (!this.participants.isEmpty()) {
            sb.append(", participants=");
            sb.append(this.participants);
        }
        if (this.group_id != null) {
            sb.append(", group_id=");
            sb.append(this.group_id);
        }
        sb.append(", info=");
        sb.append(this.info);
        sb.append(", inviter_id=");
        sb.append(this.inviter_id);
        if (this.force != null) {
            sb.append(", force=");
            sb.append(this.force);
        }
        if (this.end_reason != null) {
            sb.append(", end_reason=");
            sb.append(this.end_reason);
        }
        if (this.action_time != null) {
            sb.append(", action_time=");
            sb.append(this.action_time);
        }
        if (this.seq_id != null) {
            sb.append(", seq_id=");
            sb.append(this.seq_id);
        }
        if (this.settings != null) {
            sb.append(", settings=");
            sb.append(this.settings);
        }
        if (this.vendor_type != null) {
            sb.append(", vendor_type=");
            sb.append(this.vendor_type);
        }
        if (!this.track_info.isEmpty()) {
            sb.append(", track_info=");
            sb.append(this.track_info);
        }
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        if (this.host_type != null) {
            sb.append(", host_type=");
            sb.append(this.host_type);
        }
        if (this.inviter_type != null) {
            sb.append(", inviter_type=");
            sb.append(this.inviter_type);
        }
        if (this.meet_number != null) {
            sb.append(", meet_number=");
            sb.append(this.meet_number);
        }
        if (this.msg != null) {
            sb.append(", msg=");
            sb.append(this.msg);
        }
        if (this.meeting_source != null) {
            sb.append(", meeting_source=");
            sb.append(this.meeting_source);
        }
        if (this.host_device_id != null) {
            sb.append(", host_device_id=");
            sb.append(this.host_device_id);
        }
        if (this.is_voice_call != null) {
            sb.append(", is_voice_call=");
            sb.append(this.is_voice_call);
        }
        if (this.sponsor != null) {
            sb.append(", sponsor=");
            sb.append(this.sponsor);
        }
        if (this.tenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.tenant_id);
        }
        if (this.is_lark_meeting != null) {
            sb.append(", is_lark_meeting=");
            sb.append(this.is_lark_meeting);
        }
        if (this.meeting_owner != null) {
            sb.append(", meeting_owner=");
            sb.append(this.meeting_owner);
        }
        if (this.is_external_meeting_when_ring != null) {
            sb.append(", is_external_meeting_when_ring=");
            sb.append(this.is_external_meeting_when_ring);
        }
        if (this.sid != null) {
            sb.append(", sid=");
            sb.append(this.sid);
        }
        if (!this.breakout_room_infos.isEmpty()) {
            sb.append(", breakout_room_infos=");
            sb.append(this.breakout_room_infos);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoChatInfo{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatInfo(String str, String str2, Type type2, List<Participant> list, String str3, String str4, String str5, Boolean bool, EndReason endReason, ActionTime actionTime, Long l, VideoChatSettings videoChatSettings, VendorType vendorType, Map<String, String> map, Long l2, ParticipantType participantType, ParticipantType participantType2, String str6, MsgInfo msgInfo, MeetingSource meetingSource, String str7, Boolean bool2, ByteviewUser byteviewUser, String str8, Boolean bool3, ByteviewUser byteviewUser2, Boolean bool4, String str9, List<BreakoutRoomInfo> list2) {
        this(str, str2, type2, list, str3, str4, str5, bool, endReason, actionTime, l, videoChatSettings, vendorType, map, l2, participantType, participantType2, str6, msgInfo, meetingSource, str7, bool2, byteviewUser, str8, bool3, byteviewUser2, bool4, str9, list2, ByteString.EMPTY);
    }

    public VideoChatInfo(String str, String str2, Type type2, List<Participant> list, String str3, String str4, String str5, Boolean bool, EndReason endReason, ActionTime actionTime, Long l, VideoChatSettings videoChatSettings, VendorType vendorType, Map<String, String> map, Long l2, ParticipantType participantType, ParticipantType participantType2, String str6, MsgInfo msgInfo, MeetingSource meetingSource, String str7, Boolean bool2, ByteviewUser byteviewUser, String str8, Boolean bool3, ByteviewUser byteviewUser2, Boolean bool4, String str9, List<BreakoutRoomInfo> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.host_id = str2;
        this.type = type2;
        this.participants = Internal.immutableCopyOf("participants", list);
        this.group_id = str3;
        this.info = str4;
        this.inviter_id = str5;
        this.force = bool;
        this.end_reason = endReason;
        this.action_time = actionTime;
        this.seq_id = l;
        this.settings = videoChatSettings;
        this.vendor_type = vendorType;
        this.track_info = Internal.immutableCopyOf("track_info", map);
        this.start_time = l2;
        this.host_type = participantType;
        this.inviter_type = participantType2;
        this.meet_number = str6;
        this.msg = msgInfo;
        this.meeting_source = meetingSource;
        this.host_device_id = str7;
        this.is_voice_call = bool2;
        this.sponsor = byteviewUser;
        this.tenant_id = str8;
        this.is_lark_meeting = bool3;
        this.meeting_owner = byteviewUser2;
        this.is_external_meeting_when_ring = bool4;
        this.sid = str9;
        this.breakout_room_infos = Internal.immutableCopyOf("breakout_room_infos", list2);
    }
}
