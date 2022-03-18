package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class VideoChatContent extends Message<VideoChatContent, C15440a> {
    public static final ProtoAdapter<VideoChatContent> ADAPTER = new C15441b();
    public static final Long DEFAULT_SEQUENCE_ID = 0L;
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final MeetingCard meeting_card;
    public final Long sequence_id;
    public final Type type;

    public static final class MeetingCard extends Message<MeetingCard, C15438a> {
        public static final ProtoAdapter<MeetingCard> ADAPTER = new C15439b();
        public static final CardType DEFAULT_CARD_TYPE = CardType.UNKNOWN_CARD_TYPE;
        public static final Long DEFAULT_END_TIME_MS = 0L;
        public static final ParticipantType DEFAULT_HOST_TYPE = ParticipantType.LARK_USER;
        public static final Boolean DEFAULT_IS_LOCKED = false;
        public static final Boolean DEFAULT_IS_OPEN_LOBBY = false;
        public static final Integer DEFAULT_MAX_PARTICIPANT_COUNT = 0;
        public static final MeetingSource DEFAULT_MEETING_SOURCE = MeetingSource.CARD_UNKNOWN_SOURCE_TYPE;
        public static final ParticipantType DEFAULT_OWNER_TYPE = ParticipantType.UNKNOW_TYPE;
        public static final Long DEFAULT_START_TIME_MS = 0L;
        public static final Status DEFAULT_STATUS = Status.UNKNOWN;
        public static final Long DEFAULT_TOTAL_PARTICIPANT_NUM = 0L;
        private static final long serialVersionUID = 0;
        public final List<Long> all_participant_tenant;
        public final String calendar_uid;
        public final CardType card_type;
        public final Long end_time_ms;
        public final String forwarder_id;
        public final String host_id;
        public final ParticipantType host_type;
        public final VideoChatI18nDefaultTopic i18n_default_topic;
        public final Boolean is_locked;
        public final Boolean is_open_lobby;
        public final Integer max_participant_count;
        public final String meet_number;
        public final String meeting_id;
        public final MeetingSource meeting_source;
        public final ParticipantType owner_type;
        public final String owner_user_id;
        public final List<MeetingParticipant> participants;
        public final String sponsor_id;
        public final Long start_time_ms;
        public final Status status;
        public final String topic;
        public final Long total_participant_num;

        public static final class MeetingParticipant extends Message<MeetingParticipant, C15436a> {
            public static final ProtoAdapter<MeetingParticipant> ADAPTER = new C15437b();
            public static final BindType DEFAULT_BIND_TYPE = BindType.UNKOWN;
            public static final DeviceType DEFAULT_DEVICE_TYPE = DeviceType.UNKNOWN_DEVICE_TYPE;
            public static final Boolean DEFAULT_IS_LARK_GUEST = false;
            public static final Long DEFAULT_JOIN_TIME_MS = 0L;
            public static final Status DEFAULT_STATUS = Status.UNKNOWN;
            public static final TenantTag DEFAULT_TENANT_TAG = TenantTag.STANDARD;
            public static final ParticipantType DEFAULT_USER_TYPE = ParticipantType.LARK_USER;
            private static final long serialVersionUID = 0;
            public final String bind_id;
            public final BindType bind_type;
            public final String device_id;
            public final DeviceType device_type;
            public final Boolean is_lark_guest;
            public final Long join_time_ms;
            public final Status status;
            public final String tenant_id;
            public final TenantTag tenant_tag;
            public final String user_id;
            public final ParticipantType user_type;

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

            /* renamed from: com.bytedance.lark.pb.basic.v1.VideoChatContent$MeetingCard$MeetingParticipant$b */
            private static final class C15437b extends ProtoAdapter<MeetingParticipant> {
                C15437b() {
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
                    int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, meetingParticipant.user_id);
                    int i10 = 0;
                    if (meetingParticipant.join_time_ms != null) {
                        i = ProtoAdapter.INT64.encodedSizeWithTag(2, meetingParticipant.join_time_ms);
                    } else {
                        i = 0;
                    }
                    int i11 = encodedSizeWithTag + i;
                    if (meetingParticipant.status != null) {
                        i2 = Status.ADAPTER.encodedSizeWithTag(3, meetingParticipant.status);
                    } else {
                        i2 = 0;
                    }
                    int i12 = i11 + i2;
                    if (meetingParticipant.device_id != null) {
                        i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, meetingParticipant.device_id);
                    } else {
                        i3 = 0;
                    }
                    int i13 = i12 + i3;
                    if (meetingParticipant.user_type != null) {
                        i4 = ParticipantType.ADAPTER.encodedSizeWithTag(5, meetingParticipant.user_type);
                    } else {
                        i4 = 0;
                    }
                    int i14 = i13 + i4;
                    if (meetingParticipant.is_lark_guest != null) {
                        i5 = ProtoAdapter.BOOL.encodedSizeWithTag(6, meetingParticipant.is_lark_guest);
                    } else {
                        i5 = 0;
                    }
                    int i15 = i14 + i5;
                    if (meetingParticipant.device_type != null) {
                        i6 = DeviceType.ADAPTER.encodedSizeWithTag(7, meetingParticipant.device_type);
                    } else {
                        i6 = 0;
                    }
                    int i16 = i15 + i6;
                    if (meetingParticipant.tenant_id != null) {
                        i7 = ProtoAdapter.STRING.encodedSizeWithTag(8, meetingParticipant.tenant_id);
                    } else {
                        i7 = 0;
                    }
                    int i17 = i16 + i7;
                    if (meetingParticipant.tenant_tag != null) {
                        i8 = TenantTag.ADAPTER.encodedSizeWithTag(9, meetingParticipant.tenant_tag);
                    } else {
                        i8 = 0;
                    }
                    int i18 = i17 + i8;
                    if (meetingParticipant.bind_id != null) {
                        i9 = ProtoAdapter.STRING.encodedSizeWithTag(10, meetingParticipant.bind_id);
                    } else {
                        i9 = 0;
                    }
                    int i19 = i18 + i9;
                    if (meetingParticipant.bind_type != null) {
                        i10 = BindType.ADAPTER.encodedSizeWithTag(11, meetingParticipant.bind_type);
                    }
                    return i19 + i10 + meetingParticipant.unknownFields().size();
                }

                /* renamed from: a */
                public MeetingParticipant decode(ProtoReader protoReader) throws IOException {
                    C15436a aVar = new C15436a();
                    aVar.f40857a = "";
                    aVar.f40858b = 0L;
                    aVar.f40859c = Status.UNKNOWN;
                    aVar.f40860d = "";
                    aVar.f40861e = ParticipantType.LARK_USER;
                    aVar.f40862f = false;
                    aVar.f40863g = DeviceType.UNKNOWN_DEVICE_TYPE;
                    aVar.f40864h = "";
                    aVar.f40865i = TenantTag.STANDARD;
                    aVar.f40866j = "";
                    aVar.f40867k = BindType.UNKOWN;
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag != -1) {
                            switch (nextTag) {
                                case 1:
                                    aVar.f40857a = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 2:
                                    aVar.f40858b = ProtoAdapter.INT64.decode(protoReader);
                                    break;
                                case 3:
                                    try {
                                        aVar.f40859c = Status.ADAPTER.decode(protoReader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                        break;
                                    }
                                case 4:
                                    aVar.f40860d = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 5:
                                    try {
                                        aVar.f40861e = ParticipantType.ADAPTER.decode(protoReader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                        break;
                                    }
                                case 6:
                                    aVar.f40862f = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 7:
                                    try {
                                        aVar.f40863g = DeviceType.ADAPTER.decode(protoReader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                        break;
                                    }
                                case 8:
                                    aVar.f40864h = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 9:
                                    try {
                                        aVar.f40865i = TenantTag.ADAPTER.decode(protoReader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                        break;
                                    }
                                case 10:
                                    aVar.f40866j = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 11:
                                    try {
                                        aVar.f40867k = BindType.ADAPTER.decode(protoReader);
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
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, meetingParticipant.user_id);
                    if (meetingParticipant.join_time_ms != null) {
                        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, meetingParticipant.join_time_ms);
                    }
                    if (meetingParticipant.status != null) {
                        Status.ADAPTER.encodeWithTag(protoWriter, 3, meetingParticipant.status);
                    }
                    if (meetingParticipant.device_id != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, meetingParticipant.device_id);
                    }
                    if (meetingParticipant.user_type != null) {
                        ParticipantType.ADAPTER.encodeWithTag(protoWriter, 5, meetingParticipant.user_type);
                    }
                    if (meetingParticipant.is_lark_guest != null) {
                        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, meetingParticipant.is_lark_guest);
                    }
                    if (meetingParticipant.device_type != null) {
                        DeviceType.ADAPTER.encodeWithTag(protoWriter, 7, meetingParticipant.device_type);
                    }
                    if (meetingParticipant.tenant_id != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, meetingParticipant.tenant_id);
                    }
                    if (meetingParticipant.tenant_tag != null) {
                        TenantTag.ADAPTER.encodeWithTag(protoWriter, 9, meetingParticipant.tenant_tag);
                    }
                    if (meetingParticipant.bind_id != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, meetingParticipant.bind_id);
                    }
                    if (meetingParticipant.bind_type != null) {
                        BindType.ADAPTER.encodeWithTag(protoWriter, 11, meetingParticipant.bind_type);
                    }
                    protoWriter.writeBytes(meetingParticipant.unknownFields());
                }
            }

            /* renamed from: com.bytedance.lark.pb.basic.v1.VideoChatContent$MeetingCard$MeetingParticipant$a */
            public static final class C15436a extends Message.Builder<MeetingParticipant, C15436a> {

                /* renamed from: a */
                public String f40857a;

                /* renamed from: b */
                public Long f40858b;

                /* renamed from: c */
                public Status f40859c;

                /* renamed from: d */
                public String f40860d;

                /* renamed from: e */
                public ParticipantType f40861e;

                /* renamed from: f */
                public Boolean f40862f;

                /* renamed from: g */
                public DeviceType f40863g;

                /* renamed from: h */
                public String f40864h;

                /* renamed from: i */
                public TenantTag f40865i;

                /* renamed from: j */
                public String f40866j;

                /* renamed from: k */
                public BindType f40867k;

                /* renamed from: a */
                public MeetingParticipant build() {
                    String str = this.f40857a;
                    if (str != null) {
                        return new MeetingParticipant(str, this.f40858b, this.f40859c, this.f40860d, this.f40861e, this.f40862f, this.f40863g, this.f40864h, this.f40865i, this.f40866j, this.f40867k, super.buildUnknownFields());
                    }
                    throw Internal.missingRequiredFields(str, "user_id");
                }
            }

            @Override // com.squareup.wire.Message
            public C15436a newBuilder() {
                C15436a aVar = new C15436a();
                aVar.f40857a = this.user_id;
                aVar.f40858b = this.join_time_ms;
                aVar.f40859c = this.status;
                aVar.f40860d = this.device_id;
                aVar.f40861e = this.user_type;
                aVar.f40862f = this.is_lark_guest;
                aVar.f40863g = this.device_type;
                aVar.f40864h = this.tenant_id;
                aVar.f40865i = this.tenant_tag;
                aVar.f40866j = this.bind_id;
                aVar.f40867k = this.bind_type;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("basic", "MeetingParticipant");
                StringBuilder sb = new StringBuilder();
                sb.append(", user_id=");
                sb.append(this.user_id);
                if (this.join_time_ms != null) {
                    sb.append(", join_time_ms=");
                    sb.append(this.join_time_ms);
                }
                if (this.status != null) {
                    sb.append(", status=");
                    sb.append(this.status);
                }
                if (this.device_id != null) {
                    sb.append(", device_id=");
                    sb.append(this.device_id);
                }
                if (this.user_type != null) {
                    sb.append(", user_type=");
                    sb.append(this.user_type);
                }
                if (this.is_lark_guest != null) {
                    sb.append(", is_lark_guest=");
                    sb.append(this.is_lark_guest);
                }
                if (this.device_type != null) {
                    sb.append(", device_type=");
                    sb.append(this.device_type);
                }
                if (this.tenant_id != null) {
                    sb.append(", tenant_id=");
                    sb.append(this.tenant_id);
                }
                if (this.tenant_tag != null) {
                    sb.append(", tenant_tag=");
                    sb.append(this.tenant_tag);
                }
                if (this.bind_id != null) {
                    sb.append(", bind_id=");
                    sb.append(this.bind_id);
                }
                if (this.bind_type != null) {
                    sb.append(", bind_type=");
                    sb.append(this.bind_type);
                }
                StringBuilder replace = sb.replace(0, 2, "MeetingParticipant{");
                replace.append('}');
                return replace.toString();
            }

            public MeetingParticipant(String str, Long l, Status status2, String str2, ParticipantType participantType, Boolean bool, DeviceType deviceType, String str3, TenantTag tenantTag, String str4, BindType bindType) {
                this(str, l, status2, str2, participantType, bool, deviceType, str3, tenantTag, str4, bindType, ByteString.EMPTY);
            }

            public MeetingParticipant(String str, Long l, Status status2, String str2, ParticipantType participantType, Boolean bool, DeviceType deviceType, String str3, TenantTag tenantTag, String str4, BindType bindType, ByteString byteString) {
                super(ADAPTER, byteString);
                this.user_id = str;
                this.join_time_ms = l;
                this.status = status2;
                this.device_id = str2;
                this.user_type = participantType;
                this.is_lark_guest = bool;
                this.device_type = deviceType;
                this.tenant_id = str3;
                this.tenant_tag = tenantTag;
                this.bind_id = str4;
                this.bind_type = bindType;
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
                    case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
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
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                        return RESERVED_USER_18;
                    case 26:
                        return RESERVED_USER_19;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
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

        /* renamed from: com.bytedance.lark.pb.basic.v1.VideoChatContent$MeetingCard$b */
        private static final class C15439b extends ProtoAdapter<MeetingCard> {
            C15439b() {
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
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, meetingCard.meeting_id) + Status.ADAPTER.encodedSizeWithTag(2, meetingCard.status) + ProtoAdapter.INT64.encodedSizeWithTag(3, meetingCard.start_time_ms);
                int i15 = 0;
                if (meetingCard.end_time_ms != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(4, meetingCard.end_time_ms);
                } else {
                    i = 0;
                }
                int encodedSizeWithTag2 = encodedSizeWithTag + i + ProtoAdapter.STRING.encodedSizeWithTag(5, meetingCard.topic) + ProtoAdapter.STRING.encodedSizeWithTag(6, meetingCard.sponsor_id);
                if (meetingCard.host_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(7, meetingCard.host_id);
                } else {
                    i2 = 0;
                }
                int i16 = encodedSizeWithTag2 + i2;
                if (meetingCard.meet_number != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(8, meetingCard.meet_number);
                } else {
                    i3 = 0;
                }
                int encodedSizeWithTag3 = i16 + i3 + MeetingParticipant.ADAPTER.asRepeated().encodedSizeWithTag(9, meetingCard.participants);
                if (meetingCard.max_participant_count != null) {
                    i4 = ProtoAdapter.INT32.encodedSizeWithTag(10, meetingCard.max_participant_count);
                } else {
                    i4 = 0;
                }
                int i17 = encodedSizeWithTag3 + i4;
                if (meetingCard.host_type != null) {
                    i5 = ParticipantType.ADAPTER.encodedSizeWithTag(11, meetingCard.host_type);
                } else {
                    i5 = 0;
                }
                int i18 = i17 + i5;
                if (meetingCard.card_type != null) {
                    i6 = CardType.ADAPTER.encodedSizeWithTag(12, meetingCard.card_type);
                } else {
                    i6 = 0;
                }
                int i19 = i18 + i6;
                if (meetingCard.forwarder_id != null) {
                    i7 = ProtoAdapter.STRING.encodedSizeWithTag(13, meetingCard.forwarder_id);
                } else {
                    i7 = 0;
                }
                int i20 = i19 + i7;
                if (meetingCard.meeting_source != null) {
                    i8 = MeetingSource.ADAPTER.encodedSizeWithTag(14, meetingCard.meeting_source);
                } else {
                    i8 = 0;
                }
                int i21 = i20 + i8;
                if (meetingCard.calendar_uid != null) {
                    i9 = ProtoAdapter.STRING.encodedSizeWithTag(15, meetingCard.calendar_uid);
                } else {
                    i9 = 0;
                }
                int i22 = i21 + i9;
                if (meetingCard.is_locked != null) {
                    i10 = ProtoAdapter.BOOL.encodedSizeWithTag(16, meetingCard.is_locked);
                } else {
                    i10 = 0;
                }
                int i23 = i22 + i10;
                if (meetingCard.i18n_default_topic != null) {
                    i11 = VideoChatI18nDefaultTopic.ADAPTER.encodedSizeWithTag(19, meetingCard.i18n_default_topic);
                } else {
                    i11 = 0;
                }
                int i24 = i23 + i11;
                if (meetingCard.is_open_lobby != null) {
                    i12 = ProtoAdapter.BOOL.encodedSizeWithTag(20, meetingCard.is_open_lobby);
                } else {
                    i12 = 0;
                }
                int i25 = i24 + i12;
                if (meetingCard.owner_user_id != null) {
                    i13 = ProtoAdapter.STRING.encodedSizeWithTag(21, meetingCard.owner_user_id);
                } else {
                    i13 = 0;
                }
                int i26 = i25 + i13;
                if (meetingCard.owner_type != null) {
                    i14 = ParticipantType.ADAPTER.encodedSizeWithTag(22, meetingCard.owner_type);
                } else {
                    i14 = 0;
                }
                int i27 = i26 + i14;
                if (meetingCard.total_participant_num != null) {
                    i15 = ProtoAdapter.INT64.encodedSizeWithTag(23, meetingCard.total_participant_num);
                }
                return i27 + i15 + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(24, meetingCard.all_participant_tenant) + meetingCard.unknownFields().size();
            }

            /* renamed from: a */
            public MeetingCard decode(ProtoReader protoReader) throws IOException {
                C15438a aVar = new C15438a();
                aVar.f40868a = "";
                aVar.f40869b = Status.UNKNOWN;
                aVar.f40870c = 0L;
                aVar.f40871d = 0L;
                aVar.f40872e = "";
                aVar.f40873f = "";
                aVar.f40874g = "";
                aVar.f40875h = "";
                aVar.f40877j = 0;
                aVar.f40878k = ParticipantType.LARK_USER;
                aVar.f40879l = CardType.UNKNOWN_CARD_TYPE;
                aVar.f40880m = "";
                aVar.f40881n = MeetingSource.CARD_UNKNOWN_SOURCE_TYPE;
                aVar.f40882o = "";
                aVar.f40883p = false;
                aVar.f40885r = false;
                aVar.f40886s = "";
                aVar.f40887t = ParticipantType.UNKNOW_TYPE;
                aVar.f40888u = 0L;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f40868a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                try {
                                    aVar.f40869b = Status.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 3:
                                aVar.f40870c = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 4:
                                aVar.f40871d = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 5:
                                aVar.f40872e = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                aVar.f40873f = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 7:
                                aVar.f40874g = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 8:
                                aVar.f40875h = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 9:
                                aVar.f40876i.add(MeetingParticipant.ADAPTER.decode(protoReader));
                                break;
                            case 10:
                                aVar.f40877j = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 11:
                                try {
                                    aVar.f40878k = ParticipantType.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                    break;
                                }
                            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                                try {
                                    aVar.f40879l = CardType.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                    break;
                                }
                            case 13:
                                aVar.f40880m = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 14:
                                try {
                                    aVar.f40881n = MeetingSource.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                    break;
                                }
                            case 15:
                                aVar.f40882o = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 16:
                                aVar.f40883p = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 17:
                            case 18:
                            default:
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            case 19:
                                aVar.f40884q = VideoChatI18nDefaultTopic.ADAPTER.decode(protoReader);
                                break;
                            case 20:
                                aVar.f40885r = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 21:
                                aVar.f40886s = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 22:
                                try {
                                    aVar.f40887t = ParticipantType.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e5.value));
                                    break;
                                }
                            case 23:
                                aVar.f40888u = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 24:
                                aVar.f40889v.add(ProtoAdapter.INT64.decode(protoReader));
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
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, meetingCard.meeting_id);
                Status.ADAPTER.encodeWithTag(protoWriter, 2, meetingCard.status);
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, meetingCard.start_time_ms);
                if (meetingCard.end_time_ms != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, meetingCard.end_time_ms);
                }
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, meetingCard.topic);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, meetingCard.sponsor_id);
                if (meetingCard.host_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, meetingCard.host_id);
                }
                if (meetingCard.meet_number != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, meetingCard.meet_number);
                }
                MeetingParticipant.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, meetingCard.participants);
                if (meetingCard.max_participant_count != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, meetingCard.max_participant_count);
                }
                if (meetingCard.host_type != null) {
                    ParticipantType.ADAPTER.encodeWithTag(protoWriter, 11, meetingCard.host_type);
                }
                if (meetingCard.card_type != null) {
                    CardType.ADAPTER.encodeWithTag(protoWriter, 12, meetingCard.card_type);
                }
                if (meetingCard.forwarder_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, meetingCard.forwarder_id);
                }
                if (meetingCard.meeting_source != null) {
                    MeetingSource.ADAPTER.encodeWithTag(protoWriter, 14, meetingCard.meeting_source);
                }
                if (meetingCard.calendar_uid != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, meetingCard.calendar_uid);
                }
                if (meetingCard.is_locked != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 16, meetingCard.is_locked);
                }
                if (meetingCard.i18n_default_topic != null) {
                    VideoChatI18nDefaultTopic.ADAPTER.encodeWithTag(protoWriter, 19, meetingCard.i18n_default_topic);
                }
                if (meetingCard.is_open_lobby != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 20, meetingCard.is_open_lobby);
                }
                if (meetingCard.owner_user_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 21, meetingCard.owner_user_id);
                }
                if (meetingCard.owner_type != null) {
                    ParticipantType.ADAPTER.encodeWithTag(protoWriter, 22, meetingCard.owner_type);
                }
                if (meetingCard.total_participant_num != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 23, meetingCard.total_participant_num);
                }
                ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 24, meetingCard.all_participant_tenant);
                protoWriter.writeBytes(meetingCard.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15438a newBuilder() {
            C15438a aVar = new C15438a();
            aVar.f40868a = this.meeting_id;
            aVar.f40869b = this.status;
            aVar.f40870c = this.start_time_ms;
            aVar.f40871d = this.end_time_ms;
            aVar.f40872e = this.topic;
            aVar.f40873f = this.sponsor_id;
            aVar.f40874g = this.host_id;
            aVar.f40875h = this.meet_number;
            aVar.f40876i = Internal.copyOf("participants", this.participants);
            aVar.f40877j = this.max_participant_count;
            aVar.f40878k = this.host_type;
            aVar.f40879l = this.card_type;
            aVar.f40880m = this.forwarder_id;
            aVar.f40881n = this.meeting_source;
            aVar.f40882o = this.calendar_uid;
            aVar.f40883p = this.is_locked;
            aVar.f40884q = this.i18n_default_topic;
            aVar.f40885r = this.is_open_lobby;
            aVar.f40886s = this.owner_user_id;
            aVar.f40887t = this.owner_type;
            aVar.f40888u = this.total_participant_num;
            aVar.f40889v = Internal.copyOf("all_participant_tenant", this.all_participant_tenant);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.VideoChatContent$MeetingCard$a */
        public static final class C15438a extends Message.Builder<MeetingCard, C15438a> {

            /* renamed from: a */
            public String f40868a;

            /* renamed from: b */
            public Status f40869b;

            /* renamed from: c */
            public Long f40870c;

            /* renamed from: d */
            public Long f40871d;

            /* renamed from: e */
            public String f40872e;

            /* renamed from: f */
            public String f40873f;

            /* renamed from: g */
            public String f40874g;

            /* renamed from: h */
            public String f40875h;

            /* renamed from: i */
            public List<MeetingParticipant> f40876i = Internal.newMutableList();

            /* renamed from: j */
            public Integer f40877j;

            /* renamed from: k */
            public ParticipantType f40878k;

            /* renamed from: l */
            public CardType f40879l;

            /* renamed from: m */
            public String f40880m;

            /* renamed from: n */
            public MeetingSource f40881n;

            /* renamed from: o */
            public String f40882o;

            /* renamed from: p */
            public Boolean f40883p;

            /* renamed from: q */
            public VideoChatI18nDefaultTopic f40884q;

            /* renamed from: r */
            public Boolean f40885r;

            /* renamed from: s */
            public String f40886s;

            /* renamed from: t */
            public ParticipantType f40887t;

            /* renamed from: u */
            public Long f40888u;

            /* renamed from: v */
            public List<Long> f40889v = Internal.newMutableList();

            /* renamed from: a */
            public MeetingCard build() {
                Status status;
                Long l;
                String str;
                String str2;
                String str3 = this.f40868a;
                if (str3 != null && (status = this.f40869b) != null && (l = this.f40870c) != null && (str = this.f40872e) != null && (str2 = this.f40873f) != null) {
                    return new MeetingCard(str3, status, l, this.f40871d, str, str2, this.f40874g, this.f40875h, this.f40876i, this.f40877j, this.f40878k, this.f40879l, this.f40880m, this.f40881n, this.f40882o, this.f40883p, this.f40884q, this.f40885r, this.f40886s, this.f40887t, this.f40888u, this.f40889v, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str3, "meeting_id", this.f40869b, UpdateKey.STATUS, this.f40870c, "start_time_ms", this.f40872e, ChatTypeStateKeeper.f135670e, this.f40873f, "sponsor_id");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "MeetingCard");
            StringBuilder sb = new StringBuilder();
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
            sb.append(", status=");
            sb.append(this.status);
            sb.append(", start_time_ms=");
            sb.append(this.start_time_ms);
            if (this.end_time_ms != null) {
                sb.append(", end_time_ms=");
                sb.append(this.end_time_ms);
            }
            sb.append(", topic=");
            sb.append(this.topic);
            sb.append(", sponsor_id=");
            sb.append(this.sponsor_id);
            if (this.host_id != null) {
                sb.append(", host_id=");
                sb.append(this.host_id);
            }
            if (this.meet_number != null) {
                sb.append(", meet_number=");
                sb.append(this.meet_number);
            }
            if (!this.participants.isEmpty()) {
                sb.append(", participants=");
                sb.append(this.participants);
            }
            if (this.max_participant_count != null) {
                sb.append(", max_participant_count=");
                sb.append(this.max_participant_count);
            }
            if (this.host_type != null) {
                sb.append(", host_type=");
                sb.append(this.host_type);
            }
            if (this.card_type != null) {
                sb.append(", card_type=");
                sb.append(this.card_type);
            }
            if (this.forwarder_id != null) {
                sb.append(", forwarder_id=");
                sb.append(this.forwarder_id);
            }
            if (this.meeting_source != null) {
                sb.append(", meeting_source=");
                sb.append(this.meeting_source);
            }
            if (this.calendar_uid != null) {
                sb.append(", calendar_uid=");
                sb.append(this.calendar_uid);
            }
            if (this.is_locked != null) {
                sb.append(", is_locked=");
                sb.append(this.is_locked);
            }
            if (this.i18n_default_topic != null) {
                sb.append(", i18n_default_topic=");
                sb.append(this.i18n_default_topic);
            }
            if (this.is_open_lobby != null) {
                sb.append(", is_open_lobby=");
                sb.append(this.is_open_lobby);
            }
            if (this.owner_user_id != null) {
                sb.append(", owner_user_id=");
                sb.append(this.owner_user_id);
            }
            if (this.owner_type != null) {
                sb.append(", owner_type=");
                sb.append(this.owner_type);
            }
            if (this.total_participant_num != null) {
                sb.append(", total_participant_num=");
                sb.append(this.total_participant_num);
            }
            if (!this.all_participant_tenant.isEmpty()) {
                sb.append(", all_participant_tenant=");
                sb.append(this.all_participant_tenant);
            }
            StringBuilder replace = sb.replace(0, 2, "MeetingCard{");
            replace.append('}');
            return replace.toString();
        }

        public MeetingCard(String str, Status status2, Long l, Long l2, String str2, String str3, String str4, String str5, List<MeetingParticipant> list, Integer num, ParticipantType participantType, CardType cardType, String str6, MeetingSource meetingSource, String str7, Boolean bool, VideoChatI18nDefaultTopic videoChatI18nDefaultTopic, Boolean bool2, String str8, ParticipantType participantType2, Long l3, List<Long> list2) {
            this(str, status2, l, l2, str2, str3, str4, str5, list, num, participantType, cardType, str6, meetingSource, str7, bool, videoChatI18nDefaultTopic, bool2, str8, participantType2, l3, list2, ByteString.EMPTY);
        }

        public MeetingCard(String str, Status status2, Long l, Long l2, String str2, String str3, String str4, String str5, List<MeetingParticipant> list, Integer num, ParticipantType participantType, CardType cardType, String str6, MeetingSource meetingSource, String str7, Boolean bool, VideoChatI18nDefaultTopic videoChatI18nDefaultTopic, Boolean bool2, String str8, ParticipantType participantType2, Long l3, List<Long> list2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.meeting_id = str;
            this.status = status2;
            this.start_time_ms = l;
            this.end_time_ms = l2;
            this.topic = str2;
            this.sponsor_id = str3;
            this.host_id = str4;
            this.meet_number = str5;
            this.participants = Internal.immutableCopyOf("participants", list);
            this.max_participant_count = num;
            this.host_type = participantType;
            this.card_type = cardType;
            this.forwarder_id = str6;
            this.meeting_source = meetingSource;
            this.calendar_uid = str7;
            this.is_locked = bool;
            this.i18n_default_topic = videoChatI18nDefaultTopic;
            this.is_open_lobby = bool2;
            this.owner_user_id = str8;
            this.owner_type = participantType2;
            this.total_participant_num = l3;
            this.all_participant_tenant = Internal.immutableCopyOf("all_participant_tenant", list2);
        }
    }

    public enum Type implements WireEnum {
        UNKNOWN(0),
        MEETING_CARD(1),
        CHAT_ROOM_CARD(2);
        
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
            if (i != 2) {
                return null;
            }
            return CHAT_ROOM_CARD;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.VideoChatContent$b */
    private static final class C15441b extends ProtoAdapter<VideoChatContent> {
        C15441b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatContent.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatContent videoChatContent) {
            int i;
            int encodedSizeWithTag = Type.ADAPTER.encodedSizeWithTag(1, videoChatContent.type);
            int i2 = 0;
            if (videoChatContent.meeting_card != null) {
                i = MeetingCard.ADAPTER.encodedSizeWithTag(2, videoChatContent.meeting_card);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (videoChatContent.sequence_id != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, videoChatContent.sequence_id);
            }
            return i3 + i2 + videoChatContent.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatContent decode(ProtoReader protoReader) throws IOException {
            C15440a aVar = new C15440a();
            aVar.f40890a = Type.UNKNOWN;
            aVar.f40892c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f40890a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f40891b = MeetingCard.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40892c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VideoChatContent videoChatContent) throws IOException {
            Type.ADAPTER.encodeWithTag(protoWriter, 1, videoChatContent.type);
            if (videoChatContent.meeting_card != null) {
                MeetingCard.ADAPTER.encodeWithTag(protoWriter, 2, videoChatContent.meeting_card);
            }
            if (videoChatContent.sequence_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, videoChatContent.sequence_id);
            }
            protoWriter.writeBytes(videoChatContent.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15440a newBuilder() {
        C15440a aVar = new C15440a();
        aVar.f40890a = this.type;
        aVar.f40891b = this.meeting_card;
        aVar.f40892c = this.sequence_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.VideoChatContent$a */
    public static final class C15440a extends Message.Builder<VideoChatContent, C15440a> {

        /* renamed from: a */
        public Type f40890a;

        /* renamed from: b */
        public MeetingCard f40891b;

        /* renamed from: c */
        public Long f40892c;

        /* renamed from: a */
        public VideoChatContent build() {
            Type type = this.f40890a;
            if (type != null) {
                return new VideoChatContent(type, this.f40891b, this.f40892c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(type, ShareHitPoint.f121869d);
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "VideoChatContent");
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.type);
        if (this.meeting_card != null) {
            sb.append(", meeting_card=");
            sb.append(this.meeting_card);
        }
        if (this.sequence_id != null) {
            sb.append(", sequence_id=");
            sb.append(this.sequence_id);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoChatContent{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatContent(Type type2, MeetingCard meetingCard, Long l) {
        this(type2, meetingCard, l, ByteString.EMPTY);
    }

    public VideoChatContent(Type type2, MeetingCard meetingCard, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.meeting_card = meetingCard;
        this.sequence_id = l;
    }
}
