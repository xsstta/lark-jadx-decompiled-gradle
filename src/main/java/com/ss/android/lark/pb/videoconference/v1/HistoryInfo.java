package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class HistoryInfo extends Message<HistoryInfo, C50739a> {
    public static final ProtoAdapter<HistoryInfo> ADAPTER = new C50740b();
    public static final Long DEFAULT_CALL_START_TIME = 0L;
    public static final CallStatus DEFAULT_CALL_STATUS = CallStatus.CALL_UNKNOWN;
    public static final HistoryInfoType DEFAULT_HISTORY_INFO_TYPE = HistoryInfoType.HistoryInfoType_UNKNOWN;
    public static final HistoryType DEFAULT_HISTORY_TYPE = HistoryType.HISTORY_UNKNOWN;
    public static final ParticipantType DEFAULT_INTERACTER_USER_TYPE = ParticipantType.UNKNOW;
    public static final Long DEFAULT_JOIN_TIME = 0L;
    public static final Long DEFAULT_LEAVE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Long call_start_time;
    public final CallStatus call_status;
    public final HistoryInfoType history_info_type;
    public final HistoryType history_type;
    public final String interacter_user_id;
    public final ParticipantType interacter_user_type;
    public final Long join_time;
    public final Long leave_time;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.HistoryInfo$b */
    private static final class C50740b extends ProtoAdapter<HistoryInfo> {
        C50740b() {
            super(FieldEncoding.LENGTH_DELIMITED, HistoryInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(HistoryInfo historyInfo) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8 = 0;
            if (historyInfo.history_type != null) {
                i = HistoryType.ADAPTER.encodedSizeWithTag(1, historyInfo.history_type);
            } else {
                i = 0;
            }
            if (historyInfo.call_status != null) {
                i2 = CallStatus.ADAPTER.encodedSizeWithTag(2, historyInfo.call_status);
            } else {
                i2 = 0;
            }
            int i9 = i + i2;
            if (historyInfo.interacter_user_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, historyInfo.interacter_user_id);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (historyInfo.interacter_user_type != null) {
                i4 = ParticipantType.ADAPTER.encodedSizeWithTag(4, historyInfo.interacter_user_type);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (historyInfo.call_start_time != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, historyInfo.call_start_time);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (historyInfo.join_time != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(6, historyInfo.join_time);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (historyInfo.leave_time != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(7, historyInfo.leave_time);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (historyInfo.history_info_type != null) {
                i8 = HistoryInfoType.ADAPTER.encodedSizeWithTag(8, historyInfo.history_info_type);
            }
            return i14 + i8 + historyInfo.unknownFields().size();
        }

        /* renamed from: a */
        public HistoryInfo decode(ProtoReader protoReader) throws IOException {
            C50739a aVar = new C50739a();
            aVar.f126493a = HistoryType.HISTORY_UNKNOWN;
            aVar.f126494b = CallStatus.CALL_UNKNOWN;
            aVar.f126495c = "";
            aVar.f126496d = ParticipantType.UNKNOW;
            aVar.f126497e = 0L;
            aVar.f126498f = 0L;
            aVar.f126499g = 0L;
            aVar.f126500h = HistoryInfoType.HistoryInfoType_UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f126493a = HistoryType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            try {
                                aVar.f126494b = CallStatus.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 3:
                            aVar.f126495c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            try {
                                aVar.f126496d = ParticipantType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 5:
                            aVar.f126497e = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            aVar.f126498f = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            aVar.f126499g = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            try {
                                aVar.f126500h = HistoryInfoType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
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
        public void encode(ProtoWriter protoWriter, HistoryInfo historyInfo) throws IOException {
            if (historyInfo.history_type != null) {
                HistoryType.ADAPTER.encodeWithTag(protoWriter, 1, historyInfo.history_type);
            }
            if (historyInfo.call_status != null) {
                CallStatus.ADAPTER.encodeWithTag(protoWriter, 2, historyInfo.call_status);
            }
            if (historyInfo.interacter_user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, historyInfo.interacter_user_id);
            }
            if (historyInfo.interacter_user_type != null) {
                ParticipantType.ADAPTER.encodeWithTag(protoWriter, 4, historyInfo.interacter_user_type);
            }
            if (historyInfo.call_start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, historyInfo.call_start_time);
            }
            if (historyInfo.join_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, historyInfo.join_time);
            }
            if (historyInfo.leave_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, historyInfo.leave_time);
            }
            if (historyInfo.history_info_type != null) {
                HistoryInfoType.ADAPTER.encodeWithTag(protoWriter, 8, historyInfo.history_info_type);
            }
            protoWriter.writeBytes(historyInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.HistoryInfo$a */
    public static final class C50739a extends Message.Builder<HistoryInfo, C50739a> {

        /* renamed from: a */
        public HistoryType f126493a;

        /* renamed from: b */
        public CallStatus f126494b;

        /* renamed from: c */
        public String f126495c;

        /* renamed from: d */
        public ParticipantType f126496d;

        /* renamed from: e */
        public Long f126497e;

        /* renamed from: f */
        public Long f126498f;

        /* renamed from: g */
        public Long f126499g;

        /* renamed from: h */
        public HistoryInfoType f126500h;

        /* renamed from: a */
        public HistoryInfo build() {
            return new HistoryInfo(this.f126493a, this.f126494b, this.f126495c, this.f126496d, this.f126497e, this.f126498f, this.f126499g, this.f126500h, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50739a newBuilder() {
        C50739a aVar = new C50739a();
        aVar.f126493a = this.history_type;
        aVar.f126494b = this.call_status;
        aVar.f126495c = this.interacter_user_id;
        aVar.f126496d = this.interacter_user_type;
        aVar.f126497e = this.call_start_time;
        aVar.f126498f = this.join_time;
        aVar.f126499g = this.leave_time;
        aVar.f126500h = this.history_info_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "HistoryInfo");
        StringBuilder sb = new StringBuilder();
        if (this.history_type != null) {
            sb.append(", history_type=");
            sb.append(this.history_type);
        }
        if (this.call_status != null) {
            sb.append(", call_status=");
            sb.append(this.call_status);
        }
        if (this.interacter_user_id != null) {
            sb.append(", interacter_user_id=");
            sb.append(this.interacter_user_id);
        }
        if (this.interacter_user_type != null) {
            sb.append(", interacter_user_type=");
            sb.append(this.interacter_user_type);
        }
        if (this.call_start_time != null) {
            sb.append(", call_start_time=");
            sb.append(this.call_start_time);
        }
        if (this.join_time != null) {
            sb.append(", join_time=");
            sb.append(this.join_time);
        }
        if (this.leave_time != null) {
            sb.append(", leave_time=");
            sb.append(this.leave_time);
        }
        if (this.history_info_type != null) {
            sb.append(", history_info_type=");
            sb.append(this.history_info_type);
        }
        StringBuilder replace = sb.replace(0, 2, "HistoryInfo{");
        replace.append('}');
        return replace.toString();
    }

    public HistoryInfo(HistoryType historyType, CallStatus callStatus, String str, ParticipantType participantType, Long l, Long l2, Long l3, HistoryInfoType historyInfoType) {
        this(historyType, callStatus, str, participantType, l, l2, l3, historyInfoType, ByteString.EMPTY);
    }

    public HistoryInfo(HistoryType historyType, CallStatus callStatus, String str, ParticipantType participantType, Long l, Long l2, Long l3, HistoryInfoType historyInfoType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.history_type = historyType;
        this.call_status = callStatus;
        this.interacter_user_id = str;
        this.interacter_user_type = participantType;
        this.call_start_time = l;
        this.join_time = l2;
        this.leave_time = l3;
        this.history_info_type = historyInfoType;
    }
}
