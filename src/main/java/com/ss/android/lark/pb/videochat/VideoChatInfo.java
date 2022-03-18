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
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class VideoChatInfo extends Message<VideoChatInfo, C50423a> {
    public static final ProtoAdapter<VideoChatInfo> ADAPTER = new C50424b();
    public static final Long DEFAULT_EXPIRE_TIME_IN_SECOND = 0L;
    public static final Boolean DEFAULT_FORCE = false;
    public static final Boolean DEFAULT_IS_EXTERNAL_MEETING_WHEN_RING = false;
    public static final Boolean DEFAULT_IS_LARK_MEETING = false;
    public static final Boolean DEFAULT_IS_VOICE_CALL = false;
    public static final Long DEFAULT_SEQ_ID = 0L;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final ActionTime maction_time;
    public final List<BreakoutRoomInfo> mbreakout_room_infos;
    public final EndReason mend_reason;
    public final Long mexpire_time_in_second;
    public final VideoChatInfoExtraCommand mextra_command;
    public final Boolean mforce;
    public final String mgroup_id;
    public final String mhost_device_id;
    public final String mhost_id;
    public final ParticipantType mhost_type;
    public final String mid;
    public final String minfo;
    public final String minviter_id;
    public final ParticipantType minviter_type;
    public final Boolean mis_external_meeting_when_ring;
    public final Boolean mis_lark_meeting;
    public final Boolean mis_voice_call;
    public final String mmeet_number;
    public final ByteviewUser mmeeting_owner;
    public final MeetingSource mmeeting_source;
    public final MsgInfo mmsg;
    public final List<Participant> mparticipants;
    public final String mpush_sid;
    public final Long mseq_id;
    public final VideoChatSettings msettings;
    public final ByteviewUser msponsor;
    public final Long mstart_time;
    public final String mtenant_id;
    public final String mtoken;
    public final Map<String, String> mtrack_info;
    public final Type mtype;
    public final VendorType mvendor_type;

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

    /* renamed from: com.ss.android.lark.pb.videochat.VideoChatInfo$b */
    private static final class C50424b extends ProtoAdapter<VideoChatInfo> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f125932a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C50424b() {
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
            int i21;
            int i22;
            int i23;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, videoChatInfo.mid) + ProtoAdapter.STRING.encodedSizeWithTag(2, videoChatInfo.mhost_id) + Type.ADAPTER.encodedSizeWithTag(3, videoChatInfo.mtype) + Participant.ADAPTER.asRepeated().encodedSizeWithTag(4, videoChatInfo.mparticipants);
            int i24 = 0;
            if (videoChatInfo.mgroup_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(5, videoChatInfo.mgroup_id);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + ProtoAdapter.STRING.encodedSizeWithTag(6, videoChatInfo.minfo) + ProtoAdapter.STRING.encodedSizeWithTag(7, videoChatInfo.minviter_id);
            if (videoChatInfo.mforce != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(8, videoChatInfo.mforce);
            } else {
                i2 = 0;
            }
            int i25 = encodedSizeWithTag2 + i2;
            if (videoChatInfo.mtoken != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(9, videoChatInfo.mtoken);
            } else {
                i3 = 0;
            }
            int i26 = i25 + i3;
            if (videoChatInfo.mend_reason != null) {
                i4 = EndReason.ADAPTER.encodedSizeWithTag(10, videoChatInfo.mend_reason);
            } else {
                i4 = 0;
            }
            int i27 = i26 + i4;
            if (videoChatInfo.maction_time != null) {
                i5 = ActionTime.ADAPTER.encodedSizeWithTag(11, videoChatInfo.maction_time);
            } else {
                i5 = 0;
            }
            int i28 = i27 + i5;
            if (videoChatInfo.mseq_id != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(12, videoChatInfo.mseq_id);
            } else {
                i6 = 0;
            }
            int i29 = i28 + i6;
            if (videoChatInfo.msettings != null) {
                i7 = VideoChatSettings.ADAPTER.encodedSizeWithTag(13, videoChatInfo.msettings);
            } else {
                i7 = 0;
            }
            int i30 = i29 + i7;
            if (videoChatInfo.mvendor_type != null) {
                i8 = VendorType.ADAPTER.encodedSizeWithTag(14, videoChatInfo.mvendor_type);
            } else {
                i8 = 0;
            }
            int encodedSizeWithTag3 = i30 + i8 + this.f125932a.encodedSizeWithTag(15, videoChatInfo.mtrack_info);
            if (videoChatInfo.mstart_time != null) {
                i9 = ProtoAdapter.INT64.encodedSizeWithTag(16, videoChatInfo.mstart_time);
            } else {
                i9 = 0;
            }
            int i31 = encodedSizeWithTag3 + i9;
            if (videoChatInfo.mhost_type != null) {
                i10 = ParticipantType.ADAPTER.encodedSizeWithTag(17, videoChatInfo.mhost_type);
            } else {
                i10 = 0;
            }
            int i32 = i31 + i10;
            if (videoChatInfo.minviter_type != null) {
                i11 = ParticipantType.ADAPTER.encodedSizeWithTag(18, videoChatInfo.minviter_type);
            } else {
                i11 = 0;
            }
            int i33 = i32 + i11;
            if (videoChatInfo.mmeet_number != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(19, videoChatInfo.mmeet_number);
            } else {
                i12 = 0;
            }
            int i34 = i33 + i12;
            if (videoChatInfo.mmsg != null) {
                i13 = MsgInfo.ADAPTER.encodedSizeWithTag(20, videoChatInfo.mmsg);
            } else {
                i13 = 0;
            }
            int i35 = i34 + i13;
            if (videoChatInfo.mmeeting_source != null) {
                i14 = MeetingSource.ADAPTER.encodedSizeWithTag(21, videoChatInfo.mmeeting_source);
            } else {
                i14 = 0;
            }
            int i36 = i35 + i14;
            if (videoChatInfo.mhost_device_id != null) {
                i15 = ProtoAdapter.STRING.encodedSizeWithTag(22, videoChatInfo.mhost_device_id);
            } else {
                i15 = 0;
            }
            int i37 = i36 + i15;
            if (videoChatInfo.mis_voice_call != null) {
                i16 = ProtoAdapter.BOOL.encodedSizeWithTag(23, videoChatInfo.mis_voice_call);
            } else {
                i16 = 0;
            }
            int i38 = i37 + i16;
            if (videoChatInfo.msponsor != null) {
                i17 = ByteviewUser.ADAPTER.encodedSizeWithTag(24, videoChatInfo.msponsor);
            } else {
                i17 = 0;
            }
            int i39 = i38 + i17;
            if (videoChatInfo.mtenant_id != null) {
                i18 = ProtoAdapter.STRING.encodedSizeWithTag(25, videoChatInfo.mtenant_id);
            } else {
                i18 = 0;
            }
            int i40 = i39 + i18;
            if (videoChatInfo.mis_lark_meeting != null) {
                i19 = ProtoAdapter.BOOL.encodedSizeWithTag(27, videoChatInfo.mis_lark_meeting);
            } else {
                i19 = 0;
            }
            int i41 = i40 + i19;
            if (videoChatInfo.mmeeting_owner != null) {
                i20 = ByteviewUser.ADAPTER.encodedSizeWithTag(28, videoChatInfo.mmeeting_owner);
            } else {
                i20 = 0;
            }
            int i42 = i41 + i20;
            if (videoChatInfo.mis_external_meeting_when_ring != null) {
                i21 = ProtoAdapter.BOOL.encodedSizeWithTag(29, videoChatInfo.mis_external_meeting_when_ring);
            } else {
                i21 = 0;
            }
            int i43 = i42 + i21;
            if (videoChatInfo.mpush_sid != null) {
                i22 = ProtoAdapter.STRING.encodedSizeWithTag(31, videoChatInfo.mpush_sid);
            } else {
                i22 = 0;
            }
            int i44 = i43 + i22;
            if (videoChatInfo.mextra_command != null) {
                i23 = VideoChatInfoExtraCommand.ADAPTER.encodedSizeWithTag(32, videoChatInfo.mextra_command);
            } else {
                i23 = 0;
            }
            int encodedSizeWithTag4 = i44 + i23 + BreakoutRoomInfo.ADAPTER.asRepeated().encodedSizeWithTag(33, videoChatInfo.mbreakout_room_infos);
            if (videoChatInfo.mexpire_time_in_second != null) {
                i24 = ProtoAdapter.INT64.encodedSizeWithTag(34, videoChatInfo.mexpire_time_in_second);
            }
            return encodedSizeWithTag4 + i24 + videoChatInfo.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatInfo decode(ProtoReader protoReader) throws IOException {
            C50423a aVar = new C50423a();
            aVar.f125906a = "";
            aVar.f125907b = "";
            aVar.f125910e = "";
            aVar.f125911f = "";
            aVar.f125912g = "";
            aVar.f125913h = false;
            aVar.f125914i = "";
            aVar.f125917l = 0L;
            aVar.f125921p = 0L;
            aVar.f125924s = "";
            aVar.f125927v = "";
            aVar.f125928w = false;
            aVar.f125930y = "";
            aVar.f125931z = false;
            aVar.f125901B = false;
            aVar.f125902C = "";
            aVar.f125905F = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125906a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f125907b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f125908c = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f125909d.add(Participant.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            aVar.f125910e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f125911f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f125912g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f125913h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            aVar.f125914i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            try {
                                aVar.f125915j = EndReason.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 11:
                            aVar.f125916k = ActionTime.ADAPTER.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f125917l = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 13:
                            aVar.f125918m = VideoChatSettings.ADAPTER.decode(protoReader);
                            break;
                        case 14:
                            try {
                                aVar.f125919n = VendorType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 15:
                            aVar.f125920o.putAll(this.f125932a.decode(protoReader));
                            break;
                        case 16:
                            aVar.f125921p = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 17:
                            try {
                                aVar.f125922q = ParticipantType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                break;
                            }
                        case 18:
                            try {
                                aVar.f125923r = ParticipantType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e5.value));
                                break;
                            }
                        case 19:
                            aVar.f125924s = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 20:
                            aVar.f125925t = MsgInfo.ADAPTER.decode(protoReader);
                            break;
                        case 21:
                            try {
                                aVar.f125926u = MeetingSource.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e6.value));
                                break;
                            }
                        case 22:
                            aVar.f125927v = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 23:
                            aVar.f125928w = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 24:
                            aVar.f125929x = ByteviewUser.ADAPTER.decode(protoReader);
                            break;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                            aVar.f125930y = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 26:
                        case 30:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                            aVar.f125931z = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                            aVar.f125900A = ByteviewUser.ADAPTER.decode(protoReader);
                            break;
                        case 29:
                            aVar.f125901B = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                            aVar.f125902C = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 32:
                            aVar.f125903D = VideoChatInfoExtraCommand.ADAPTER.decode(protoReader);
                            break;
                        case 33:
                            aVar.f125904E.add(BreakoutRoomInfo.ADAPTER.decode(protoReader));
                            break;
                        case 34:
                            aVar.f125905F = ProtoAdapter.INT64.decode(protoReader);
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
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, videoChatInfo.mid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, videoChatInfo.mhost_id);
            Type.ADAPTER.encodeWithTag(protoWriter, 3, videoChatInfo.mtype);
            Participant.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, videoChatInfo.mparticipants);
            if (videoChatInfo.mgroup_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, videoChatInfo.mgroup_id);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, videoChatInfo.minfo);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, videoChatInfo.minviter_id);
            if (videoChatInfo.mforce != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, videoChatInfo.mforce);
            }
            if (videoChatInfo.mtoken != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, videoChatInfo.mtoken);
            }
            if (videoChatInfo.mend_reason != null) {
                EndReason.ADAPTER.encodeWithTag(protoWriter, 10, videoChatInfo.mend_reason);
            }
            if (videoChatInfo.maction_time != null) {
                ActionTime.ADAPTER.encodeWithTag(protoWriter, 11, videoChatInfo.maction_time);
            }
            if (videoChatInfo.mseq_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 12, videoChatInfo.mseq_id);
            }
            if (videoChatInfo.msettings != null) {
                VideoChatSettings.ADAPTER.encodeWithTag(protoWriter, 13, videoChatInfo.msettings);
            }
            if (videoChatInfo.mvendor_type != null) {
                VendorType.ADAPTER.encodeWithTag(protoWriter, 14, videoChatInfo.mvendor_type);
            }
            this.f125932a.encodeWithTag(protoWriter, 15, videoChatInfo.mtrack_info);
            if (videoChatInfo.mstart_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 16, videoChatInfo.mstart_time);
            }
            if (videoChatInfo.mhost_type != null) {
                ParticipantType.ADAPTER.encodeWithTag(protoWriter, 17, videoChatInfo.mhost_type);
            }
            if (videoChatInfo.minviter_type != null) {
                ParticipantType.ADAPTER.encodeWithTag(protoWriter, 18, videoChatInfo.minviter_type);
            }
            if (videoChatInfo.mmeet_number != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 19, videoChatInfo.mmeet_number);
            }
            if (videoChatInfo.mmsg != null) {
                MsgInfo.ADAPTER.encodeWithTag(protoWriter, 20, videoChatInfo.mmsg);
            }
            if (videoChatInfo.mmeeting_source != null) {
                MeetingSource.ADAPTER.encodeWithTag(protoWriter, 21, videoChatInfo.mmeeting_source);
            }
            if (videoChatInfo.mhost_device_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 22, videoChatInfo.mhost_device_id);
            }
            if (videoChatInfo.mis_voice_call != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 23, videoChatInfo.mis_voice_call);
            }
            if (videoChatInfo.msponsor != null) {
                ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 24, videoChatInfo.msponsor);
            }
            if (videoChatInfo.mtenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 25, videoChatInfo.mtenant_id);
            }
            if (videoChatInfo.mis_lark_meeting != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 27, videoChatInfo.mis_lark_meeting);
            }
            if (videoChatInfo.mmeeting_owner != null) {
                ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 28, videoChatInfo.mmeeting_owner);
            }
            if (videoChatInfo.mis_external_meeting_when_ring != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 29, videoChatInfo.mis_external_meeting_when_ring);
            }
            if (videoChatInfo.mpush_sid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 31, videoChatInfo.mpush_sid);
            }
            if (videoChatInfo.mextra_command != null) {
                VideoChatInfoExtraCommand.ADAPTER.encodeWithTag(protoWriter, 32, videoChatInfo.mextra_command);
            }
            BreakoutRoomInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 33, videoChatInfo.mbreakout_room_infos);
            if (videoChatInfo.mexpire_time_in_second != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 34, videoChatInfo.mexpire_time_in_second);
            }
            protoWriter.writeBytes(videoChatInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.VideoChatInfo$a */
    public static final class C50423a extends Message.Builder<VideoChatInfo, C50423a> {

        /* renamed from: A */
        public ByteviewUser f125900A;

        /* renamed from: B */
        public Boolean f125901B;

        /* renamed from: C */
        public String f125902C;

        /* renamed from: D */
        public VideoChatInfoExtraCommand f125903D;

        /* renamed from: E */
        public List<BreakoutRoomInfo> f125904E = Internal.newMutableList();

        /* renamed from: F */
        public Long f125905F;

        /* renamed from: a */
        public String f125906a;

        /* renamed from: b */
        public String f125907b;

        /* renamed from: c */
        public Type f125908c;

        /* renamed from: d */
        public List<Participant> f125909d = Internal.newMutableList();

        /* renamed from: e */
        public String f125910e;

        /* renamed from: f */
        public String f125911f;

        /* renamed from: g */
        public String f125912g;

        /* renamed from: h */
        public Boolean f125913h;

        /* renamed from: i */
        public String f125914i;

        /* renamed from: j */
        public EndReason f125915j;

        /* renamed from: k */
        public ActionTime f125916k;

        /* renamed from: l */
        public Long f125917l;

        /* renamed from: m */
        public VideoChatSettings f125918m;

        /* renamed from: n */
        public VendorType f125919n;

        /* renamed from: o */
        public Map<String, String> f125920o = Internal.newMutableMap();

        /* renamed from: p */
        public Long f125921p;

        /* renamed from: q */
        public ParticipantType f125922q;

        /* renamed from: r */
        public ParticipantType f125923r;

        /* renamed from: s */
        public String f125924s;

        /* renamed from: t */
        public MsgInfo f125925t;

        /* renamed from: u */
        public MeetingSource f125926u;

        /* renamed from: v */
        public String f125927v;

        /* renamed from: w */
        public Boolean f125928w;

        /* renamed from: x */
        public ByteviewUser f125929x;

        /* renamed from: y */
        public String f125930y;

        /* renamed from: z */
        public Boolean f125931z;

        /* renamed from: a */
        public VideoChatInfo build() {
            String str;
            Type type;
            String str2;
            String str3;
            String str4 = this.f125906a;
            if (str4 != null && (str = this.f125907b) != null && (type = this.f125908c) != null && (str2 = this.f125911f) != null && (str3 = this.f125912g) != null) {
                return new VideoChatInfo(str4, str, type, this.f125909d, this.f125910e, str2, str3, this.f125913h, this.f125914i, this.f125915j, this.f125916k, this.f125917l, this.f125918m, this.f125919n, this.f125920o, this.f125921p, this.f125922q, this.f125923r, this.f125924s, this.f125925t, this.f125926u, this.f125927v, this.f125928w, this.f125929x, this.f125930y, this.f125931z, this.f125900A, this.f125901B, this.f125902C, this.f125903D, this.f125904E, this.f125905F, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str4, "mid", this.f125907b, "mhost_id", this.f125908c, "mtype", this.f125911f, "minfo", this.f125912g, "minviter_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C50423a newBuilder() {
        C50423a aVar = new C50423a();
        aVar.f125906a = this.mid;
        aVar.f125907b = this.mhost_id;
        aVar.f125908c = this.mtype;
        aVar.f125909d = Internal.copyOf("mparticipants", this.mparticipants);
        aVar.f125910e = this.mgroup_id;
        aVar.f125911f = this.minfo;
        aVar.f125912g = this.minviter_id;
        aVar.f125913h = this.mforce;
        aVar.f125914i = this.mtoken;
        aVar.f125915j = this.mend_reason;
        aVar.f125916k = this.maction_time;
        aVar.f125917l = this.mseq_id;
        aVar.f125918m = this.msettings;
        aVar.f125919n = this.mvendor_type;
        aVar.f125920o = Internal.copyOf("mtrack_info", this.mtrack_info);
        aVar.f125921p = this.mstart_time;
        aVar.f125922q = this.mhost_type;
        aVar.f125923r = this.minviter_type;
        aVar.f125924s = this.mmeet_number;
        aVar.f125925t = this.mmsg;
        aVar.f125926u = this.mmeeting_source;
        aVar.f125927v = this.mhost_device_id;
        aVar.f125928w = this.mis_voice_call;
        aVar.f125929x = this.msponsor;
        aVar.f125930y = this.mtenant_id;
        aVar.f125931z = this.mis_lark_meeting;
        aVar.f125900A = this.mmeeting_owner;
        aVar.f125901B = this.mis_external_meeting_when_ring;
        aVar.f125902C = this.mpush_sid;
        aVar.f125903D = this.mextra_command;
        aVar.f125904E = Internal.copyOf("mbreakout_room_infos", this.mbreakout_room_infos);
        aVar.f125905F = this.mexpire_time_in_second;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.mid);
        sb.append(", host_id=");
        sb.append(this.mhost_id);
        sb.append(", type=");
        sb.append(this.mtype);
        if (!this.mparticipants.isEmpty()) {
            sb.append(", participants=");
            sb.append(this.mparticipants);
        }
        if (this.mgroup_id != null) {
            sb.append(", group_id=");
            sb.append(this.mgroup_id);
        }
        sb.append(", info=");
        sb.append(this.minfo);
        sb.append(", inviter_id=");
        sb.append(this.minviter_id);
        if (this.mforce != null) {
            sb.append(", force=");
            sb.append(this.mforce);
        }
        if (this.mtoken != null) {
            sb.append(", token=");
            sb.append(this.mtoken);
        }
        if (this.mend_reason != null) {
            sb.append(", end_reason=");
            sb.append(this.mend_reason);
        }
        if (this.maction_time != null) {
            sb.append(", action_time=");
            sb.append(this.maction_time);
        }
        if (this.mseq_id != null) {
            sb.append(", seq_id=");
            sb.append(this.mseq_id);
        }
        if (this.msettings != null) {
            sb.append(", settings=");
            sb.append(this.msettings);
        }
        if (this.mvendor_type != null) {
            sb.append(", vendor_type=");
            sb.append(this.mvendor_type);
        }
        if (!this.mtrack_info.isEmpty()) {
            sb.append(", track_info=");
            sb.append(this.mtrack_info);
        }
        if (this.mstart_time != null) {
            sb.append(", start_time=");
            sb.append(this.mstart_time);
        }
        if (this.mhost_type != null) {
            sb.append(", host_type=");
            sb.append(this.mhost_type);
        }
        if (this.minviter_type != null) {
            sb.append(", inviter_type=");
            sb.append(this.minviter_type);
        }
        if (this.mmeet_number != null) {
            sb.append(", meet_number=");
            sb.append(this.mmeet_number);
        }
        if (this.mmsg != null) {
            sb.append(", msg=");
            sb.append(this.mmsg);
        }
        if (this.mmeeting_source != null) {
            sb.append(", meeting_source=");
            sb.append(this.mmeeting_source);
        }
        if (this.mhost_device_id != null) {
            sb.append(", host_device_id=");
            sb.append(this.mhost_device_id);
        }
        if (this.mis_voice_call != null) {
            sb.append(", is_voice_call=");
            sb.append(this.mis_voice_call);
        }
        if (this.msponsor != null) {
            sb.append(", sponsor=");
            sb.append(this.msponsor);
        }
        if (this.mtenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.mtenant_id);
        }
        if (this.mis_lark_meeting != null) {
            sb.append(", is_lark_meeting=");
            sb.append(this.mis_lark_meeting);
        }
        if (this.mmeeting_owner != null) {
            sb.append(", meeting_owner=");
            sb.append(this.mmeeting_owner);
        }
        if (this.mis_external_meeting_when_ring != null) {
            sb.append(", is_external_meeting_when_ring=");
            sb.append(this.mis_external_meeting_when_ring);
        }
        if (this.mpush_sid != null) {
            sb.append(", push_sid=");
            sb.append(this.mpush_sid);
        }
        if (this.mextra_command != null) {
            sb.append(", extra_command=");
            sb.append(this.mextra_command);
        }
        if (!this.mbreakout_room_infos.isEmpty()) {
            sb.append(", breakout_room_infos=");
            sb.append(this.mbreakout_room_infos);
        }
        if (this.mexpire_time_in_second != null) {
            sb.append(", expire_time_in_second=");
            sb.append(this.mexpire_time_in_second);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoChatInfo{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatInfo(String str, String str2, Type type, List<Participant> list, String str3, String str4, String str5, Boolean bool, String str6, EndReason endReason, ActionTime actionTime, Long l, VideoChatSettings videoChatSettings, VendorType vendorType, Map<String, String> map, Long l2, ParticipantType participantType, ParticipantType participantType2, String str7, MsgInfo msgInfo, MeetingSource meetingSource, String str8, Boolean bool2, ByteviewUser byteviewUser, String str9, Boolean bool3, ByteviewUser byteviewUser2, Boolean bool4, String str10, VideoChatInfoExtraCommand videoChatInfoExtraCommand, List<BreakoutRoomInfo> list2, Long l3) {
        this(str, str2, type, list, str3, str4, str5, bool, str6, endReason, actionTime, l, videoChatSettings, vendorType, map, l2, participantType, participantType2, str7, msgInfo, meetingSource, str8, bool2, byteviewUser, str9, bool3, byteviewUser2, bool4, str10, videoChatInfoExtraCommand, list2, l3, ByteString.EMPTY);
    }

    public VideoChatInfo(String str, String str2, Type type, List<Participant> list, String str3, String str4, String str5, Boolean bool, String str6, EndReason endReason, ActionTime actionTime, Long l, VideoChatSettings videoChatSettings, VendorType vendorType, Map<String, String> map, Long l2, ParticipantType participantType, ParticipantType participantType2, String str7, MsgInfo msgInfo, MeetingSource meetingSource, String str8, Boolean bool2, ByteviewUser byteviewUser, String str9, Boolean bool3, ByteviewUser byteviewUser2, Boolean bool4, String str10, VideoChatInfoExtraCommand videoChatInfoExtraCommand, List<BreakoutRoomInfo> list2, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mid = str;
        this.mhost_id = str2;
        this.mtype = type;
        this.mparticipants = Internal.immutableCopyOf("mparticipants", list);
        this.mgroup_id = str3;
        this.minfo = str4;
        this.minviter_id = str5;
        this.mforce = bool;
        this.mtoken = str6;
        this.mend_reason = endReason;
        this.maction_time = actionTime;
        this.mseq_id = l;
        this.msettings = videoChatSettings;
        this.mvendor_type = vendorType;
        this.mtrack_info = Internal.immutableCopyOf("mtrack_info", map);
        this.mstart_time = l2;
        this.mhost_type = participantType;
        this.minviter_type = participantType2;
        this.mmeet_number = str7;
        this.mmsg = msgInfo;
        this.mmeeting_source = meetingSource;
        this.mhost_device_id = str8;
        this.mis_voice_call = bool2;
        this.msponsor = byteviewUser;
        this.mtenant_id = str9;
        this.mis_lark_meeting = bool3;
        this.mmeeting_owner = byteviewUser2;
        this.mis_external_meeting_when_ring = bool4;
        this.mpush_sid = str10;
        this.mextra_command = videoChatInfoExtraCommand;
        this.mbreakout_room_infos = Internal.immutableCopyOf("mbreakout_room_infos", list2);
        this.mexpire_time_in_second = l3;
    }
}
