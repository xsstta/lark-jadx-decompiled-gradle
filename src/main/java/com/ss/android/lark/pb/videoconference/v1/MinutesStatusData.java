package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class MinutesStatusData extends Message<MinutesStatusData, C50879a> {
    public static final ProtoAdapter<MinutesStatusData> ADAPTER = new C50880b();
    public static final Long DEFAULT_SEQ = 0L;
    public static final Status DEFAULT_STATUS = Status.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Long seq;
    public final Status status;

    public enum Status implements WireEnum {
        UNKNOWN(0),
        OPEN(1),
        CLOSE(2);
        
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
                return OPEN;
            }
            if (i != 2) {
                return null;
            }
            return CLOSE;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.MinutesStatusData$b */
    private static final class C50880b extends ProtoAdapter<MinutesStatusData> {
        C50880b() {
            super(FieldEncoding.LENGTH_DELIMITED, MinutesStatusData.class);
        }

        /* renamed from: a */
        public int encodedSize(MinutesStatusData minutesStatusData) {
            int i;
            int i2 = 0;
            if (minutesStatusData.status != null) {
                i = Status.ADAPTER.encodedSizeWithTag(1, minutesStatusData.status);
            } else {
                i = 0;
            }
            if (minutesStatusData.seq != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, minutesStatusData.seq);
            }
            return i + i2 + minutesStatusData.unknownFields().size();
        }

        /* renamed from: a */
        public MinutesStatusData decode(ProtoReader protoReader) throws IOException {
            C50879a aVar = new C50879a();
            aVar.f126803a = Status.UNKNOWN;
            aVar.f126804b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f126803a = Status.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126804b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MinutesStatusData minutesStatusData) throws IOException {
            if (minutesStatusData.status != null) {
                Status.ADAPTER.encodeWithTag(protoWriter, 1, minutesStatusData.status);
            }
            if (minutesStatusData.seq != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, minutesStatusData.seq);
            }
            protoWriter.writeBytes(minutesStatusData.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.MinutesStatusData$a */
    public static final class C50879a extends Message.Builder<MinutesStatusData, C50879a> {

        /* renamed from: a */
        public Status f126803a;

        /* renamed from: b */
        public Long f126804b;

        /* renamed from: a */
        public MinutesStatusData build() {
            return new MinutesStatusData(this.f126803a, this.f126804b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50879a newBuilder() {
        C50879a aVar = new C50879a();
        aVar.f126803a = this.status;
        aVar.f126804b = this.seq;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "MinutesStatusData");
        StringBuilder sb = new StringBuilder();
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.seq != null) {
            sb.append(", seq=");
            sb.append(this.seq);
        }
        StringBuilder replace = sb.replace(0, 2, "MinutesStatusData{");
        replace.append('}');
        return replace.toString();
    }

    public MinutesStatusData(Status status2, Long l) {
        this(status2, l, ByteString.EMPTY);
    }

    public MinutesStatusData(Status status2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status = status2;
        this.seq = l;
    }
}
