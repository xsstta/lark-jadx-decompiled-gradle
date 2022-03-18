package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class HistoryAbbrInfo extends Message<HistoryAbbrInfo, C50737a> {
    public static final ProtoAdapter<HistoryAbbrInfo> ADAPTER = new C50738b();
    public static final Long DEFAULT_CALL_COUNT = 0L;
    public static final CallStatus DEFAULT_CALL_STATUS = CallStatus.CALL_UNKNOWN;
    public static final HistoryType DEFAULT_HISTORY_TYPE = HistoryType.HISTORY_UNKNOWN;
    public static final ParticipantType DEFAULT_INTERACTER_USER_TYPE = ParticipantType.UNKNOW;
    private static final long serialVersionUID = 0;
    public final Long call_count;
    public final CallStatus call_status;
    public final HistoryType history_type;
    public final String interacter_user_id;
    public final ParticipantType interacter_user_type;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.HistoryAbbrInfo$b */
    private static final class C50738b extends ProtoAdapter<HistoryAbbrInfo> {
        C50738b() {
            super(FieldEncoding.LENGTH_DELIMITED, HistoryAbbrInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(HistoryAbbrInfo historyAbbrInfo) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (historyAbbrInfo.history_type != null) {
                i = HistoryType.ADAPTER.encodedSizeWithTag(1, historyAbbrInfo.history_type);
            } else {
                i = 0;
            }
            if (historyAbbrInfo.call_status != null) {
                i2 = CallStatus.ADAPTER.encodedSizeWithTag(2, historyAbbrInfo.call_status);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (historyAbbrInfo.interacter_user_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, historyAbbrInfo.interacter_user_id);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (historyAbbrInfo.interacter_user_type != null) {
                i4 = ParticipantType.ADAPTER.encodedSizeWithTag(4, historyAbbrInfo.interacter_user_type);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (historyAbbrInfo.call_count != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, historyAbbrInfo.call_count);
            }
            return i8 + i5 + historyAbbrInfo.unknownFields().size();
        }

        /* renamed from: a */
        public HistoryAbbrInfo decode(ProtoReader protoReader) throws IOException {
            C50737a aVar = new C50737a();
            aVar.f126488a = HistoryType.HISTORY_UNKNOWN;
            aVar.f126489b = CallStatus.CALL_UNKNOWN;
            aVar.f126490c = "";
            aVar.f126491d = ParticipantType.UNKNOW;
            aVar.f126492e = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f126488a = HistoryType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    try {
                        aVar.f126489b = CallStatus.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f126490c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    try {
                        aVar.f126491d = ParticipantType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                    }
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126492e = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, HistoryAbbrInfo historyAbbrInfo) throws IOException {
            if (historyAbbrInfo.history_type != null) {
                HistoryType.ADAPTER.encodeWithTag(protoWriter, 1, historyAbbrInfo.history_type);
            }
            if (historyAbbrInfo.call_status != null) {
                CallStatus.ADAPTER.encodeWithTag(protoWriter, 2, historyAbbrInfo.call_status);
            }
            if (historyAbbrInfo.interacter_user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, historyAbbrInfo.interacter_user_id);
            }
            if (historyAbbrInfo.interacter_user_type != null) {
                ParticipantType.ADAPTER.encodeWithTag(protoWriter, 4, historyAbbrInfo.interacter_user_type);
            }
            if (historyAbbrInfo.call_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, historyAbbrInfo.call_count);
            }
            protoWriter.writeBytes(historyAbbrInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.HistoryAbbrInfo$a */
    public static final class C50737a extends Message.Builder<HistoryAbbrInfo, C50737a> {

        /* renamed from: a */
        public HistoryType f126488a;

        /* renamed from: b */
        public CallStatus f126489b;

        /* renamed from: c */
        public String f126490c;

        /* renamed from: d */
        public ParticipantType f126491d;

        /* renamed from: e */
        public Long f126492e;

        /* renamed from: a */
        public HistoryAbbrInfo build() {
            return new HistoryAbbrInfo(this.f126488a, this.f126489b, this.f126490c, this.f126491d, this.f126492e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50737a newBuilder() {
        C50737a aVar = new C50737a();
        aVar.f126488a = this.history_type;
        aVar.f126489b = this.call_status;
        aVar.f126490c = this.interacter_user_id;
        aVar.f126491d = this.interacter_user_type;
        aVar.f126492e = this.call_count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "HistoryAbbrInfo");
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
        if (this.call_count != null) {
            sb.append(", call_count=");
            sb.append(this.call_count);
        }
        StringBuilder replace = sb.replace(0, 2, "HistoryAbbrInfo{");
        replace.append('}');
        return replace.toString();
    }

    public HistoryAbbrInfo(HistoryType historyType, CallStatus callStatus, String str, ParticipantType participantType, Long l) {
        this(historyType, callStatus, str, participantType, l, ByteString.EMPTY);
    }

    public HistoryAbbrInfo(HistoryType historyType, CallStatus callStatus, String str, ParticipantType participantType, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.history_type = historyType;
        this.call_status = callStatus;
        this.interacter_user_id = str;
        this.interacter_user_type = participantType;
        this.call_count = l;
    }
}
