package com.ss.android.lark.pb.entities;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class VideoChatContent extends Message<VideoChatContent, C49748a> {
    public static final ProtoAdapter<VideoChatContent> ADAPTER = new C49749b();
    public static final Long DEFAULT_SEQUENCE_ID = 0L;
    private static final long serialVersionUID = 0;
    public final MeetingCard mmeeting_card;
    public final Long msequence_id;
    public final Type mtype;

    public static final class MeetingCard extends Message<MeetingCard, C49746a> {
        public static final ProtoAdapter<MeetingCard> ADAPTER = new C49747b();
        public static final Long DEFAULT_END_TIME_MS = 0L;
        public static final Boolean DEFAULT_IS_LOCKED = false;
        public static final Boolean DEFAULT_IS_LOCKED_JOINABLE = false;
        public static final Boolean DEFAULT_IS_OPEN_LOBBY = false;
        public static final Integer DEFAULT_MAX_PARTICIPANT_COUNT = 0;
        public static final Long DEFAULT_START_TIME_MS = 0L;
        public static final Long DEFAULT_TOTAL_PARTICIPANT_NUM = 0L;
        private static final long serialVersionUID = 0;
        public final List<Long> mall_participant_tenant;
        public final String mcalendar_uid;
        public final CardType mcard_type;
        public final Long mend_time_ms;
        public final String mforwarder_id;
        public final String mgroup_id;
        public final String mhost_id;
        public final ParticipantType mhost_type;
        public final VideoChatI18nDefaultTopic mi18n_default_topic;
        public final Boolean mis_locked;
        public final Boolean mis_locked_joinable;
        public final Boolean mis_open_lobby;
        public final Integer mmax_participant_count;
        public final String mmeet_number;
        public final String mmeeting_id;
        public final MeetingSource mmeeting_source;
        public final ParticipantType mowner_type;
        public final String mowner_user_id;
        public final List<MeetingParticipant> mparticipants;
        public final String msponsor_id;
        public final Long mstart_time_ms;
        public final Status mstatus;
        public final String mtopic;
        public final Long mtotal_participant_num;

        public static final class MeetingParticipant extends Message<MeetingParticipant, C49744a> {
            public static final ProtoAdapter<MeetingParticipant> ADAPTER = new C49745b();
            public static final Boolean DEFAULT_IS_LARK_GUEST = false;
            public static final Long DEFAULT_JOIN_TIME_MS = 0L;
            private static final long serialVersionUID = 0;
            public final String mbind_id;
            public final BindType mbind_type;
            public final String mdevice_id;
            public final DeviceType mdevice_type;
            public final Boolean mis_lark_guest;
            public final Long mjoin_time_ms;
            public final Status mstatus;
            public final String mtenant_id;
            public final TenantTag mtenant_tag;
            public final String muser_id;
            public final ParticipantType muser_type;

            public enum BindType implements WireEnum {
                UNKOWN(0),
                LARK(1);
                
                public static final ProtoAdapter<BindType> ADAPTER = ProtoAdapter.newEnumAdapter(BindType.class);
                private final int value;

                @Override // com.squareup.wire.WireEnum
                public int getValue() {
                    return this.value;
                }

                public static BindType fromValue(int i) {
                    if (i == 0) {
                        return UNKOWN;
                    }
                    if (i != 1) {
                        return null;
                    }
                    return LARK;
                }

                private BindType(int i) {
                    this.value = i;
                }
            }

            public enum DeviceType implements WireEnum {
                UNKNOWN_DEVICE_TYPE(0),
                DESKTOP(1),
                MOBILE(2),
                WEB(3);
                
                public static final ProtoAdapter<DeviceType> ADAPTER = ProtoAdapter.newEnumAdapter(DeviceType.class);
                private final int value;

                @Override // com.squareup.wire.WireEnum
                public int getValue() {
                    return this.value;
                }

                public static DeviceType fromValue(int i) {
                    if (i == 0) {
                        return UNKNOWN_DEVICE_TYPE;
                    }
                    if (i == 1) {
                        return DESKTOP;
                    }
                    if (i == 2) {
                        return MOBILE;
                    }
                    if (i != 3) {
                        return null;
                    }
                    return WEB;
                }

                private DeviceType(int i) {
                    this.value = i;
                }
            }

            public enum Status implements WireEnum {
                UNKNOWN(0),
                CALLING(1),
                ON_THE_CALL(2),
                RINGING(3),
                IDLE(4);
                
                public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
                private final int value;

                @Override // com.squareup.wire.WireEnum
                public int getValue() {
                    return this.value;
                }

                public static Status fromValue(int i) {
                    if (i == 0) {
                        return UNKNOWN;
                    }
                    if (i == 1) {
                        return CALLING;
                    }
                    if (i == 2) {
                        return ON_THE_CALL;
                    }
                    if (i == 3) {
                        return RINGING;
                    }
                    if (i != 4) {
                        return null;
                    }
                    return IDLE;
                }

                private Status(int i) {
                    this.value = i;
                }
            }

            public enum TenantTag implements WireEnum {
                STANDARD(0),
                UNDEFINED(1),
                SIMPLE(2);
                
                public static final ProtoAdapter<TenantTag> ADAPTER = ProtoAdapter.newEnumAdapter(TenantTag.class);
                private final int value;

                @Override // com.squareup.wire.WireEnum
                public int getValue() {
                    return this.value;
                }

                public static TenantTag fromValue(int i) {
                    if (i == 0) {
                        return STANDARD;
                    }
                    if (i == 1) {
                        return UNDEFINED;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return SIMPLE;
                }

                private TenantTag(int i) {
                    this.value = i;
                }
            }

            /* renamed from: com.ss.android.lark.pb.entities.VideoChatContent$MeetingCard$MeetingParticipant$b */
            private static final class C49745b extends ProtoAdapter<MeetingParticipant> {
                C49745b() {
                    super(FieldEncoding.LENGTH_DELIMITED, MeetingParticipant.class);
                }

                /* renamed from: a */
                public int encodedSize(MeetingParticipant meetingParticipant) {
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    int i5;
                    int i6;
                    int i7;
                    int i8;
                    int i9;
                    int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, meetingParticipant.muser_id);
                    int i10 = 0;
                    if (meetingParticipant.mjoin_time_ms != null) {
                        i = ProtoAdapter.INT64.encodedSizeWithTag(2, meetingParticipant.mjoin_time_ms);
                    } else {
                        i = 0;
                    }
                    int i11 = encodedSizeWithTag + i;
                    if (meetingParticipant.mstatus != null) {
                        i2 = Status.ADAPTER.encodedSizeWithTag(3, meetingParticipant.mstatus);
                    } else {
                        i2 = 0;
                    }
                    int i12 = i11 + i2;
                    if (meetingParticipant.mdevice_id != null) {
                        i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, meetingParticipant.mdevice_id);
                    } else {
                        i3 = 0;
                    }
                    int i13 = i12 + i3;
                    if (meetingParticipant.muser_type != null) {
                        i4 = ParticipantType.ADAPTER.encodedSizeWithTag(5, meetingParticipant.muser_type);
                    } else {
                        i4 = 0;
                    }
                    int i14 = i13 + i4;
                    if (meetingParticipant.mis_lark_guest != null) {
                        i5 = ProtoAdapter.BOOL.encodedSizeWithTag(6, meetingParticipant.mis_lark_guest);
                    } else {
                        i5 = 0;
                    }
                    int i15 = i14 + i5;
                    if (meetingParticipant.mdevice_type != null) {
                        i6 = DeviceType.ADAPTER.encodedSizeWithTag(7, meetingParticipant.mdevice_type);
                    } else {
                        i6 = 0;
                    }
                    int i16 = i15 + i6;
                    if (meetingParticipant.mtenant_id != null) {
                        i7 = ProtoAdapter.STRING.encodedSizeWithTag(8, meetingParticipant.mtenant_id);
                    } else {
                        i7 = 0;
                    }
                    int i17 = i16 + i7;
                    if (meetingParticipant.mtenant_tag != null) {
                        i8 = TenantTag.ADAPTER.encodedSizeWithTag(9, meetingParticipant.mtenant_tag);
                    } else {
                        i8 = 0;
                    }
                    int i18 = i17 + i8;
                    if (meetingParticipant.mbind_id != null) {
                        i9 = ProtoAdapter.STRING.encodedSizeWithTag(10, meetingParticipant.mbind_id);
                    } else {
                        i9 = 0;
                    }
                    int i19 = i18 + i9;
                    if (meetingParticipant.mbind_type != null) {
                        i10 = BindType.ADAPTER.encodedSizeWithTag(11, meetingParticipant.mbind_type);
                    }
                    return i19 + i10 + meetingParticipant.unknownFields().size();
                }

                /* renamed from: a */
                public MeetingParticipant decode(ProtoReader protoReader) throws IOException {
                    C49744a aVar = new C49744a();
                    aVar.f124579a = "";
                    aVar.f124580b = 0L;
                    aVar.f124582d = "";
                    aVar.f124584f = false;
                    aVar.f124586h = "";
                    aVar.f124588j = "";
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag != -1) {
                            switch (nextTag) {
                                case 1:
                                    aVar.f124579a = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 2:
                                    aVar.f124580b = ProtoAdapter.INT64.decode(protoReader);
                                    break;
                                case 3:
                                    try {
                                        aVar.f124581c = Status.ADAPTER.decode(protoReader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                        break;
                                    }
                                case 4:
                                    aVar.f124582d = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 5:
                                    try {
                                        aVar.f124583e = ParticipantType.ADAPTER.decode(protoReader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                        break;
                                    }
                                case 6:
                                    aVar.f124584f = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 7:
                                    try {
                                        aVar.f124585g = DeviceType.ADAPTER.decode(protoReader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                        break;
                                    }
                                case 8:
                                    aVar.f124586h = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 9:
                                    try {
                                        aVar.f124587i = TenantTag.ADAPTER.decode(protoReader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                        break;
                                    }
                                case 10:
                                    aVar.f124588j = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 11:
                                    try {
                                        aVar.f124589k = BindType.ADAPTER.decode(protoReader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e5.value));
                                        break;
                                    }
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
                public void encode(ProtoWriter protoWriter, MeetingParticipant meetingParticipant) throws IOException {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, meetingParticipant.muser_id);
                    if (meetingParticipant.mjoin_time_ms != null) {
                        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, meetingParticipant.mjoin_time_ms);
                    }
                    if (meetingParticipant.mstatus != null) {
                        Status.ADAPTER.encodeWithTag(protoWriter, 3, meetingParticipant.mstatus);
                    }
                    if (meetingParticipant.mdevice_id != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, meetingParticipant.mdevice_id);
                    }
                    if (meetingParticipant.muser_type != null) {
                        ParticipantType.ADAPTER.encodeWithTag(protoWriter, 5, meetingParticipant.muser_type);
                    }
                    if (meetingParticipant.mis_lark_guest != null) {
                        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, meetingParticipant.mis_lark_guest);
                    }
                    if (meetingParticipant.mdevice_type != null) {
                        DeviceType.ADAPTER.encodeWithTag(protoWriter, 7, meetingParticipant.mdevice_type);
                    }
                    if (meetingParticipant.mtenant_id != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, meetingParticipant.mtenant_id);
                    }
                    if (meetingParticipant.mtenant_tag != null) {
                        TenantTag.ADAPTER.encodeWithTag(protoWriter, 9, meetingParticipant.mtenant_tag);
                    }
                    if (meetingParticipant.mbind_id != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, meetingParticipant.mbind_id);
                    }
                    if (meetingParticipant.mbind_type != null) {
                        BindType.ADAPTER.encodeWithTag(protoWriter, 11, meetingParticipant.mbind_type);
                    }
                    protoWriter.writeBytes(meetingParticipant.unknownFields());
                }
            }

            /* renamed from: com.ss.android.lark.pb.entities.VideoChatContent$MeetingCard$MeetingParticipant$a */
            public static final class C49744a extends Message.Builder<MeetingParticipant, C49744a> {

                /* renamed from: a */
                public String f124579a;

                /* renamed from: b */
                public Long f124580b;

                /* renamed from: c */
                public Status f124581c;

                /* renamed from: d */
                public String f124582d;

                /* renamed from: e */
                public ParticipantType f124583e;

                /* renamed from: f */
                public Boolean f124584f;

                /* renamed from: g */
                public DeviceType f124585g;

                /* renamed from: h */
                public String f124586h;

                /* renamed from: i */
                public TenantTag f124587i;

                /* renamed from: j */
                public String f124588j;

                /* renamed from: k */
                public BindType f124589k;

                /* renamed from: a */
                public MeetingParticipant build() {
                    String str = this.f124579a;
                    if (str != null) {
                        return new MeetingParticipant(str, this.f124580b, this.f124581c, this.f124582d, this.f124583e, this.f124584f, this.f124585g, this.f124586h, this.f124587i, this.f124588j, this.f124589k, super.buildUnknownFields());
                    }
                    throw Internal.missingRequiredFields(str, "muser_id");
                }
            }

            @Override // com.squareup.wire.Message
            public C49744a newBuilder() {
                C49744a aVar = new C49744a();
                aVar.f124579a = this.muser_id;
                aVar.f124580b = this.mjoin_time_ms;
                aVar.f124581c = this.mstatus;
                aVar.f124582d = this.mdevice_id;
                aVar.f124583e = this.muser_type;
                aVar.f124584f = this.mis_lark_guest;
                aVar.f124585g = this.mdevice_type;
                aVar.f124586h = this.mtenant_id;
                aVar.f124587i = this.mtenant_tag;
                aVar.f124588j = this.mbind_id;
                aVar.f124589k = this.mbind_type;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(", user_id=");
                sb.append(this.muser_id);
                if (this.mjoin_time_ms != null) {
                    sb.append(", join_time_ms=");
                    sb.append(this.mjoin_time_ms);
                }
                if (this.mstatus != null) {
                    sb.append(", status=");
                    sb.append(this.mstatus);
                }
                if (this.mdevice_id != null) {
                    sb.append(", device_id=");
                    sb.append(this.mdevice_id);
                }
                if (this.muser_type != null) {
                    sb.append(", user_type=");
                    sb.append(this.muser_type);
                }
                if (this.mis_lark_guest != null) {
                    sb.append(", is_lark_guest=");
                    sb.append(this.mis_lark_guest);
                }
                if (this.mdevice_type != null) {
                    sb.append(", device_type=");
                    sb.append(this.mdevice_type);
                }
                if (this.mtenant_id != null) {
                    sb.append(", tenant_id=");
                    sb.append(this.mtenant_id);
                }
                if (this.mtenant_tag != null) {
                    sb.append(", tenant_tag=");
                    sb.append(this.mtenant_tag);
                }
                if (this.mbind_id != null) {
                    sb.append(", bind_id=");
                    sb.append(this.mbind_id);
                }
                if (this.mbind_type != null) {
                    sb.append(", bind_type=");
                    sb.append(this.mbind_type);
                }
                StringBuilder replace = sb.replace(0, 2, "MeetingParticipant{");
                replace.append('}');
                return replace.toString();
            }

            public MeetingParticipant(String str, Long l, Status status, String str2, ParticipantType participantType, Boolean bool, DeviceType deviceType, String str3, TenantTag tenantTag, String str4, BindType bindType) {
                this(str, l, status, str2, participantType, bool, deviceType, str3, tenantTag, str4, bindType, ByteString.EMPTY);
            }

            public MeetingParticipant(String str, Long l, Status status, String str2, ParticipantType participantType, Boolean bool, DeviceType deviceType, String str3, TenantTag tenantTag, String str4, BindType bindType, ByteString byteString) {
                super(ADAPTER, byteString);
                this.muser_id = str;
                this.mjoin_time_ms = l;
                this.mstatus = status;
                this.mdevice_id = str2;
                this.muser_type = participantType;
                this.mis_lark_guest = bool;
                this.mdevice_type = deviceType;
                this.mtenant_id = str3;
                this.mtenant_tag = tenantTag;
                this.mbind_id = str4;
                this.mbind_type = bindType;
            }
        }

        public enum CardType implements WireEnum {
            UNKNOWN_CARD_TYPE(0),
            SPONSOR(1),
            FORWARD(2);
            
            public static final ProtoAdapter<CardType> ADAPTER = ProtoAdapter.newEnumAdapter(CardType.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static CardType fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN_CARD_TYPE;
                }
                if (i == 1) {
                    return SPONSOR;
                }
                if (i != 2) {
                    return null;
                }
                return FORWARD;
            }

            private CardType(int i) {
                this.value = i;
            }
        }

        public enum MeetingSource implements WireEnum {
            CARD_UNKNOWN_SOURCE_TYPE(0),
            CARD_FROM_USER(1),
            CARD_FROM_CALENDAR(2),
            CARD_FROM_INTERVIEW(3);
            
            public static final ProtoAdapter<MeetingSource> ADAPTER = ProtoAdapter.newEnumAdapter(MeetingSource.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static MeetingSource fromValue(int i) {
                if (i == 0) {
                    return CARD_UNKNOWN_SOURCE_TYPE;
                }
                if (i == 1) {
                    return CARD_FROM_USER;
                }
                if (i == 2) {
                    return CARD_FROM_CALENDAR;
                }
                if (i != 3) {
                    return null;
                }
                return CARD_FROM_INTERVIEW;
            }

            private MeetingSource(int i) {
                this.value = i;
            }
        }

        public enum ParticipantType implements WireEnum {
            UNKNOW_TYPE(0),
            LARK_USER(1),
            ROOM(2),
            DOC_USER(3),
            NEO_USER(4),
            NEO_GUEST_USER(5),
            PSTN_USER(6),
            SIP_USER(7),
            RESERVED_USER_1(8),
            RESERVED_USER_2(9),
            RESERVED_USER_3(10),
            RESERVED_USER_4(11),
            RESERVED_USER_5(12),
            RESERVED_USER_6(13),
            RESERVED_USER_7(14),
            RESERVED_USER_8(15),
            RESERVED_USER_9(16),
            RESERVED_USER_10(17),
            RESERVED_USER_11(18),
            RESERVED_USER_12(19),
            RESERVED_USER_13(20),
            RESERVED_USER_14(21),
            RESERVED_USER_15(22),
            RESERVED_USER_16(23),
            RESERVED_USER_17(24),
            RESERVED_USER_18(25),
            RESERVED_USER_19(26),
            RESERVED_USER_20(27);
            
            public static final ProtoAdapter<ParticipantType> ADAPTER = ProtoAdapter.newEnumAdapter(ParticipantType.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static ParticipantType fromValue(int i) {
                switch (i) {
                    case 0:
                        return UNKNOW_TYPE;
                    case 1:
                        return LARK_USER;
                    case 2:
                        return ROOM;
                    case 3:
                        return DOC_USER;
                    case 4:
                        return NEO_USER;
                    case 5:
                        return NEO_GUEST_USER;
                    case 6:
                        return PSTN_USER;
                    case 7:
                        return SIP_USER;
                    case 8:
                        return RESERVED_USER_1;
                    case 9:
                        return RESERVED_USER_2;
                    case 10:
                        return RESERVED_USER_3;
                    case 11:
                        return RESERVED_USER_4;
                    case HwBuildEx.VersionCodes.EMUI_5_1:
                        return RESERVED_USER_5;
                    case 13:
                        return RESERVED_USER_6;
                    case 14:
                        return RESERVED_USER_7;
                    case 15:
                        return RESERVED_USER_8;
                    case 16:
                        return RESERVED_USER_9;
                    case 17:
                        return RESERVED_USER_10;
                    case 18:
                        return RESERVED_USER_11;
                    case 19:
                        return RESERVED_USER_12;
                    case 20:
                        return RESERVED_USER_13;
                    case 21:
                        return RESERVED_USER_14;
                    case 22:
                        return RESERVED_USER_15;
                    case 23:
                        return RESERVED_USER_16;
                    case 24:
                        return RESERVED_USER_17;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                        return RESERVED_USER_18;
                    case 26:
                        return RESERVED_USER_19;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                        return RESERVED_USER_20;
                    default:
                        return null;
                }
            }

            private ParticipantType(int i) {
                this.value = i;
            }
        }

        public enum Status implements WireEnum {
            UNKNOWN(0),
            JOINABLE(1),
            FULL(2),
            END(3);
            
            public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Status fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return JOINABLE;
                }
                if (i == 2) {
                    return FULL;
                }
                if (i != 3) {
                    return null;
                }
                return END;
            }

            private Status(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.ss.android.lark.pb.entities.VideoChatContent$MeetingCard$b */
        private static final class C49747b extends ProtoAdapter<MeetingCard> {
            C49747b() {
                super(FieldEncoding.LENGTH_DELIMITED, MeetingCard.class);
            }

            /* renamed from: a */
            public int encodedSize(MeetingCard meetingCard) {
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
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, meetingCard.mmeeting_id) + Status.ADAPTER.encodedSizeWithTag(2, meetingCard.mstatus) + ProtoAdapter.INT64.encodedSizeWithTag(3, meetingCard.mstart_time_ms);
                int i17 = 0;
                if (meetingCard.mend_time_ms != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(4, meetingCard.mend_time_ms);
                } else {
                    i = 0;
                }
                int encodedSizeWithTag2 = encodedSizeWithTag + i + ProtoAdapter.STRING.encodedSizeWithTag(5, meetingCard.mtopic) + ProtoAdapter.STRING.encodedSizeWithTag(6, meetingCard.msponsor_id);
                if (meetingCard.mhost_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(7, meetingCard.mhost_id);
                } else {
                    i2 = 0;
                }
                int i18 = encodedSizeWithTag2 + i2;
                if (meetingCard.mmeet_number != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(8, meetingCard.mmeet_number);
                } else {
                    i3 = 0;
                }
                int encodedSizeWithTag3 = i18 + i3 + MeetingParticipant.ADAPTER.asRepeated().encodedSizeWithTag(9, meetingCard.mparticipants);
                if (meetingCard.mmax_participant_count != null) {
                    i4 = ProtoAdapter.INT32.encodedSizeWithTag(10, meetingCard.mmax_participant_count);
                } else {
                    i4 = 0;
                }
                int i19 = encodedSizeWithTag3 + i4;
                if (meetingCard.mhost_type != null) {
                    i5 = ParticipantType.ADAPTER.encodedSizeWithTag(11, meetingCard.mhost_type);
                } else {
                    i5 = 0;
                }
                int i20 = i19 + i5;
                if (meetingCard.mcard_type != null) {
                    i6 = CardType.ADAPTER.encodedSizeWithTag(12, meetingCard.mcard_type);
                } else {
                    i6 = 0;
                }
                int i21 = i20 + i6;
                if (meetingCard.mforwarder_id != null) {
                    i7 = ProtoAdapter.STRING.encodedSizeWithTag(13, meetingCard.mforwarder_id);
                } else {
                    i7 = 0;
                }
                int i22 = i21 + i7;
                if (meetingCard.mmeeting_source != null) {
                    i8 = MeetingSource.ADAPTER.encodedSizeWithTag(14, meetingCard.mmeeting_source);
                } else {
                    i8 = 0;
                }
                int i23 = i22 + i8;
                if (meetingCard.mcalendar_uid != null) {
                    i9 = ProtoAdapter.STRING.encodedSizeWithTag(15, meetingCard.mcalendar_uid);
                } else {
                    i9 = 0;
                }
                int i24 = i23 + i9;
                if (meetingCard.mis_locked != null) {
                    i10 = ProtoAdapter.BOOL.encodedSizeWithTag(16, meetingCard.mis_locked);
                } else {
                    i10 = 0;
                }
                int i25 = i24 + i10;
                if (meetingCard.mis_locked_joinable != null) {
                    i11 = ProtoAdapter.BOOL.encodedSizeWithTag(17, meetingCard.mis_locked_joinable);
                } else {
                    i11 = 0;
                }
                int i26 = i25 + i11;
                if (meetingCard.mgroup_id != null) {
                    i12 = ProtoAdapter.STRING.encodedSizeWithTag(18, meetingCard.mgroup_id);
                } else {
                    i12 = 0;
                }
                int i27 = i26 + i12;
                if (meetingCard.mi18n_default_topic != null) {
                    i13 = VideoChatI18nDefaultTopic.ADAPTER.encodedSizeWithTag(19, meetingCard.mi18n_default_topic);
                } else {
                    i13 = 0;
                }
                int i28 = i27 + i13;
                if (meetingCard.mis_open_lobby != null) {
                    i14 = ProtoAdapter.BOOL.encodedSizeWithTag(20, meetingCard.mis_open_lobby);
                } else {
                    i14 = 0;
                }
                int i29 = i28 + i14;
                if (meetingCard.mowner_user_id != null) {
                    i15 = ProtoAdapter.STRING.encodedSizeWithTag(21, meetingCard.mowner_user_id);
                } else {
                    i15 = 0;
                }
                int i30 = i29 + i15;
                if (meetingCard.mowner_type != null) {
                    i16 = ParticipantType.ADAPTER.encodedSizeWithTag(22, meetingCard.mowner_type);
                } else {
                    i16 = 0;
                }
                int i31 = i30 + i16;
                if (meetingCard.mtotal_participant_num != null) {
                    i17 = ProtoAdapter.INT64.encodedSizeWithTag(23, meetingCard.mtotal_participant_num);
                }
                return i31 + i17 + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(24, meetingCard.mall_participant_tenant) + meetingCard.unknownFields().size();
            }

            /* renamed from: a */
            public MeetingCard decode(ProtoReader protoReader) throws IOException {
                C49746a aVar = new C49746a();
                aVar.f124590a = "";
                aVar.f124592c = 0L;
                aVar.f124593d = 0L;
                aVar.f124594e = "";
                aVar.f124595f = "";
                aVar.f124596g = "";
                aVar.f124597h = "";
                aVar.f124599j = 0;
                aVar.f124602m = "";
                aVar.f124604o = "";
                aVar.f124605p = false;
                aVar.f124606q = false;
                aVar.f124607r = "";
                aVar.f124609t = false;
                aVar.f124610u = "";
                aVar.f124612w = 0L;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f124590a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                try {
                                    aVar.f124591b = Status.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 3:
                                aVar.f124592c = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 4:
                                aVar.f124593d = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 5:
                                aVar.f124594e = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                aVar.f124595f = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 7:
                                aVar.f124596g = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 8:
                                aVar.f124597h = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 9:
                                aVar.f124598i.add(MeetingParticipant.ADAPTER.decode(protoReader));
                                break;
                            case 10:
                                aVar.f124599j = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 11:
                                try {
                                    aVar.f124600k = ParticipantType.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                    break;
                                }
                            case HwBuildEx.VersionCodes.EMUI_5_1:
                                try {
                                    aVar.f124601l = CardType.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                    break;
                                }
                            case 13:
                                aVar.f124602m = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 14:
                                try {
                                    aVar.f124603n = MeetingSource.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                    break;
                                }
                            case 15:
                                aVar.f124604o = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 16:
                                aVar.f124605p = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 17:
                                aVar.f124606q = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 18:
                                aVar.f124607r = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 19:
                                aVar.f124608s = VideoChatI18nDefaultTopic.ADAPTER.decode(protoReader);
                                break;
                            case 20:
                                aVar.f124609t = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 21:
                                aVar.f124610u = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 22:
                                try {
                                    aVar.f124611v = ParticipantType.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e5.value));
                                    break;
                                }
                            case 23:
                                aVar.f124612w = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 24:
                                aVar.f124613x.add(ProtoAdapter.INT64.decode(protoReader));
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
            public void encode(ProtoWriter protoWriter, MeetingCard meetingCard) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, meetingCard.mmeeting_id);
                Status.ADAPTER.encodeWithTag(protoWriter, 2, meetingCard.mstatus);
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, meetingCard.mstart_time_ms);
                if (meetingCard.mend_time_ms != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, meetingCard.mend_time_ms);
                }
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, meetingCard.mtopic);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, meetingCard.msponsor_id);
                if (meetingCard.mhost_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, meetingCard.mhost_id);
                }
                if (meetingCard.mmeet_number != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, meetingCard.mmeet_number);
                }
                MeetingParticipant.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, meetingCard.mparticipants);
                if (meetingCard.mmax_participant_count != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, meetingCard.mmax_participant_count);
                }
                if (meetingCard.mhost_type != null) {
                    ParticipantType.ADAPTER.encodeWithTag(protoWriter, 11, meetingCard.mhost_type);
                }
                if (meetingCard.mcard_type != null) {
                    CardType.ADAPTER.encodeWithTag(protoWriter, 12, meetingCard.mcard_type);
                }
                if (meetingCard.mforwarder_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, meetingCard.mforwarder_id);
                }
                if (meetingCard.mmeeting_source != null) {
                    MeetingSource.ADAPTER.encodeWithTag(protoWriter, 14, meetingCard.mmeeting_source);
                }
                if (meetingCard.mcalendar_uid != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, meetingCard.mcalendar_uid);
                }
                if (meetingCard.mis_locked != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 16, meetingCard.mis_locked);
                }
                if (meetingCard.mis_locked_joinable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 17, meetingCard.mis_locked_joinable);
                }
                if (meetingCard.mgroup_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 18, meetingCard.mgroup_id);
                }
                if (meetingCard.mi18n_default_topic != null) {
                    VideoChatI18nDefaultTopic.ADAPTER.encodeWithTag(protoWriter, 19, meetingCard.mi18n_default_topic);
                }
                if (meetingCard.mis_open_lobby != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 20, meetingCard.mis_open_lobby);
                }
                if (meetingCard.mowner_user_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 21, meetingCard.mowner_user_id);
                }
                if (meetingCard.mowner_type != null) {
                    ParticipantType.ADAPTER.encodeWithTag(protoWriter, 22, meetingCard.mowner_type);
                }
                if (meetingCard.mtotal_participant_num != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 23, meetingCard.mtotal_participant_num);
                }
                ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 24, meetingCard.mall_participant_tenant);
                protoWriter.writeBytes(meetingCard.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49746a newBuilder() {
            C49746a aVar = new C49746a();
            aVar.f124590a = this.mmeeting_id;
            aVar.f124591b = this.mstatus;
            aVar.f124592c = this.mstart_time_ms;
            aVar.f124593d = this.mend_time_ms;
            aVar.f124594e = this.mtopic;
            aVar.f124595f = this.msponsor_id;
            aVar.f124596g = this.mhost_id;
            aVar.f124597h = this.mmeet_number;
            aVar.f124598i = Internal.copyOf("mparticipants", this.mparticipants);
            aVar.f124599j = this.mmax_participant_count;
            aVar.f124600k = this.mhost_type;
            aVar.f124601l = this.mcard_type;
            aVar.f124602m = this.mforwarder_id;
            aVar.f124603n = this.mmeeting_source;
            aVar.f124604o = this.mcalendar_uid;
            aVar.f124605p = this.mis_locked;
            aVar.f124606q = this.mis_locked_joinable;
            aVar.f124607r = this.mgroup_id;
            aVar.f124608s = this.mi18n_default_topic;
            aVar.f124609t = this.mis_open_lobby;
            aVar.f124610u = this.mowner_user_id;
            aVar.f124611v = this.mowner_type;
            aVar.f124612w = this.mtotal_participant_num;
            aVar.f124613x = Internal.copyOf("mall_participant_tenant", this.mall_participant_tenant);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.ss.android.lark.pb.entities.VideoChatContent$MeetingCard$a */
        public static final class C49746a extends Message.Builder<MeetingCard, C49746a> {

            /* renamed from: a */
            public String f124590a;

            /* renamed from: b */
            public Status f124591b;

            /* renamed from: c */
            public Long f124592c;

            /* renamed from: d */
            public Long f124593d;

            /* renamed from: e */
            public String f124594e;

            /* renamed from: f */
            public String f124595f;

            /* renamed from: g */
            public String f124596g;

            /* renamed from: h */
            public String f124597h;

            /* renamed from: i */
            public List<MeetingParticipant> f124598i = Internal.newMutableList();

            /* renamed from: j */
            public Integer f124599j;

            /* renamed from: k */
            public ParticipantType f124600k;

            /* renamed from: l */
            public CardType f124601l;

            /* renamed from: m */
            public String f124602m;

            /* renamed from: n */
            public MeetingSource f124603n;

            /* renamed from: o */
            public String f124604o;

            /* renamed from: p */
            public Boolean f124605p;

            /* renamed from: q */
            public Boolean f124606q;

            /* renamed from: r */
            public String f124607r;

            /* renamed from: s */
            public VideoChatI18nDefaultTopic f124608s;

            /* renamed from: t */
            public Boolean f124609t;

            /* renamed from: u */
            public String f124610u;

            /* renamed from: v */
            public ParticipantType f124611v;

            /* renamed from: w */
            public Long f124612w;

            /* renamed from: x */
            public List<Long> f124613x = Internal.newMutableList();

            /* renamed from: a */
            public MeetingCard build() {
                Status status;
                Long l;
                String str;
                String str2;
                String str3 = this.f124590a;
                if (str3 != null && (status = this.f124591b) != null && (l = this.f124592c) != null && (str = this.f124594e) != null && (str2 = this.f124595f) != null) {
                    return new MeetingCard(str3, status, l, this.f124593d, str, str2, this.f124596g, this.f124597h, this.f124598i, this.f124599j, this.f124600k, this.f124601l, this.f124602m, this.f124603n, this.f124604o, this.f124605p, this.f124606q, this.f124607r, this.f124608s, this.f124609t, this.f124610u, this.f124611v, this.f124612w, this.f124613x, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str3, "mmeeting_id", this.f124591b, "mstatus", this.f124592c, "mstart_time_ms", this.f124594e, "mtopic", this.f124595f, "msponsor_id");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", meeting_id=");
            sb.append(this.mmeeting_id);
            sb.append(", status=");
            sb.append(this.mstatus);
            sb.append(", start_time_ms=");
            sb.append(this.mstart_time_ms);
            if (this.mend_time_ms != null) {
                sb.append(", end_time_ms=");
                sb.append(this.mend_time_ms);
            }
            sb.append(", topic=");
            sb.append(this.mtopic);
            sb.append(", sponsor_id=");
            sb.append(this.msponsor_id);
            if (this.mhost_id != null) {
                sb.append(", host_id=");
                sb.append(this.mhost_id);
            }
            if (this.mmeet_number != null) {
                sb.append(", meet_number=");
                sb.append(this.mmeet_number);
            }
            if (!this.mparticipants.isEmpty()) {
                sb.append(", participants=");
                sb.append(this.mparticipants);
            }
            if (this.mmax_participant_count != null) {
                sb.append(", max_participant_count=");
                sb.append(this.mmax_participant_count);
            }
            if (this.mhost_type != null) {
                sb.append(", host_type=");
                sb.append(this.mhost_type);
            }
            if (this.mcard_type != null) {
                sb.append(", card_type=");
                sb.append(this.mcard_type);
            }
            if (this.mforwarder_id != null) {
                sb.append(", forwarder_id=");
                sb.append(this.mforwarder_id);
            }
            if (this.mmeeting_source != null) {
                sb.append(", meeting_source=");
                sb.append(this.mmeeting_source);
            }
            if (this.mcalendar_uid != null) {
                sb.append(", calendar_uid=");
                sb.append(this.mcalendar_uid);
            }
            if (this.mis_locked != null) {
                sb.append(", is_locked=");
                sb.append(this.mis_locked);
            }
            if (this.mis_locked_joinable != null) {
                sb.append(", is_locked_joinable=");
                sb.append(this.mis_locked_joinable);
            }
            if (this.mgroup_id != null) {
                sb.append(", group_id=");
                sb.append(this.mgroup_id);
            }
            if (this.mi18n_default_topic != null) {
                sb.append(", i18n_default_topic=");
                sb.append(this.mi18n_default_topic);
            }
            if (this.mis_open_lobby != null) {
                sb.append(", is_open_lobby=");
                sb.append(this.mis_open_lobby);
            }
            if (this.mowner_user_id != null) {
                sb.append(", owner_user_id=");
                sb.append(this.mowner_user_id);
            }
            if (this.mowner_type != null) {
                sb.append(", owner_type=");
                sb.append(this.mowner_type);
            }
            if (this.mtotal_participant_num != null) {
                sb.append(", total_participant_num=");
                sb.append(this.mtotal_participant_num);
            }
            if (!this.mall_participant_tenant.isEmpty()) {
                sb.append(", all_participant_tenant=");
                sb.append(this.mall_participant_tenant);
            }
            StringBuilder replace = sb.replace(0, 2, "MeetingCard{");
            replace.append('}');
            return replace.toString();
        }

        public MeetingCard(String str, Status status, Long l, Long l2, String str2, String str3, String str4, String str5, List<MeetingParticipant> list, Integer num, ParticipantType participantType, CardType cardType, String str6, MeetingSource meetingSource, String str7, Boolean bool, Boolean bool2, String str8, VideoChatI18nDefaultTopic videoChatI18nDefaultTopic, Boolean bool3, String str9, ParticipantType participantType2, Long l3, List<Long> list2) {
            this(str, status, l, l2, str2, str3, str4, str5, list, num, participantType, cardType, str6, meetingSource, str7, bool, bool2, str8, videoChatI18nDefaultTopic, bool3, str9, participantType2, l3, list2, ByteString.EMPTY);
        }

        public MeetingCard(String str, Status status, Long l, Long l2, String str2, String str3, String str4, String str5, List<MeetingParticipant> list, Integer num, ParticipantType participantType, CardType cardType, String str6, MeetingSource meetingSource, String str7, Boolean bool, Boolean bool2, String str8, VideoChatI18nDefaultTopic videoChatI18nDefaultTopic, Boolean bool3, String str9, ParticipantType participantType2, Long l3, List<Long> list2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mmeeting_id = str;
            this.mstatus = status;
            this.mstart_time_ms = l;
            this.mend_time_ms = l2;
            this.mtopic = str2;
            this.msponsor_id = str3;
            this.mhost_id = str4;
            this.mmeet_number = str5;
            this.mparticipants = Internal.immutableCopyOf("mparticipants", list);
            this.mmax_participant_count = num;
            this.mhost_type = participantType;
            this.mcard_type = cardType;
            this.mforwarder_id = str6;
            this.mmeeting_source = meetingSource;
            this.mcalendar_uid = str7;
            this.mis_locked = bool;
            this.mis_locked_joinable = bool2;
            this.mgroup_id = str8;
            this.mi18n_default_topic = videoChatI18nDefaultTopic;
            this.mis_open_lobby = bool3;
            this.mowner_user_id = str9;
            this.mowner_type = participantType2;
            this.mtotal_participant_num = l3;
            this.mall_participant_tenant = Internal.immutableCopyOf("mall_participant_tenant", list2);
        }
    }

    public enum Type implements WireEnum {
        UNKNOWN(0),
        MEETING_CARD(1),
        CHAT_ROOM_CARD(2),
        SAME_PAGE_MEETING(3);
        
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
                return MEETING_CARD;
            }
            if (i == 2) {
                return CHAT_ROOM_CARD;
            }
            if (i != 3) {
                return null;
            }
            return SAME_PAGE_MEETING;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.VideoChatContent$b */
    private static final class C49749b extends ProtoAdapter<VideoChatContent> {
        C49749b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatContent.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatContent videoChatContent) {
            int i;
            int encodedSizeWithTag = Type.ADAPTER.encodedSizeWithTag(1, videoChatContent.mtype);
            int i2 = 0;
            if (videoChatContent.mmeeting_card != null) {
                i = MeetingCard.ADAPTER.encodedSizeWithTag(2, videoChatContent.mmeeting_card);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (videoChatContent.msequence_id != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, videoChatContent.msequence_id);
            }
            return i3 + i2 + videoChatContent.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatContent decode(ProtoReader protoReader) throws IOException {
            C49748a aVar = new C49748a();
            aVar.f124616c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f124614a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f124615b = MeetingCard.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124616c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VideoChatContent videoChatContent) throws IOException {
            Type.ADAPTER.encodeWithTag(protoWriter, 1, videoChatContent.mtype);
            if (videoChatContent.mmeeting_card != null) {
                MeetingCard.ADAPTER.encodeWithTag(protoWriter, 2, videoChatContent.mmeeting_card);
            }
            if (videoChatContent.msequence_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, videoChatContent.msequence_id);
            }
            protoWriter.writeBytes(videoChatContent.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49748a newBuilder() {
        C49748a aVar = new C49748a();
        aVar.f124614a = this.mtype;
        aVar.f124615b = this.mmeeting_card;
        aVar.f124616c = this.msequence_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.entities.VideoChatContent$a */
    public static final class C49748a extends Message.Builder<VideoChatContent, C49748a> {

        /* renamed from: a */
        public Type f124614a;

        /* renamed from: b */
        public MeetingCard f124615b;

        /* renamed from: c */
        public Long f124616c;

        /* renamed from: a */
        public VideoChatContent build() {
            Type type = this.f124614a;
            if (type != null) {
                return new VideoChatContent(type, this.f124615b, this.f124616c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(type, "mtype");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.mtype);
        if (this.mmeeting_card != null) {
            sb.append(", meeting_card=");
            sb.append(this.mmeeting_card);
        }
        if (this.msequence_id != null) {
            sb.append(", sequence_id=");
            sb.append(this.msequence_id);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoChatContent{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatContent(Type type, MeetingCard meetingCard, Long l) {
        this(type, meetingCard, l, ByteString.EMPTY);
    }

    public VideoChatContent(Type type, MeetingCard meetingCard, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtype = type;
        this.mmeeting_card = meetingCard;
        this.msequence_id = l;
    }
}
