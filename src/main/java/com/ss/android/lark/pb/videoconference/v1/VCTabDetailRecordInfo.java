package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
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

public final class VCTabDetailRecordInfo extends Message<VCTabDetailRecordInfo, C51186a> {
    public static final ProtoAdapter<VCTabDetailRecordInfo> ADAPTER = new C51187b();
    public static final RecordType DEFAULT_TYPE = RecordType.LARK_MINUTES;
    private static final long serialVersionUID = 0;
    public final RecordType type;
    public final List<String> url;

    public enum RecordType implements WireEnum {
        LARK_MINUTES(0),
        RECORD(1);
        
        public static final ProtoAdapter<RecordType> ADAPTER = ProtoAdapter.newEnumAdapter(RecordType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static RecordType fromValue(int i) {
            if (i == 0) {
                return LARK_MINUTES;
            }
            if (i != 1) {
                return null;
            }
            return RECORD;
        }

        private RecordType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCTabDetailRecordInfo$b */
    private static final class C51187b extends ProtoAdapter<VCTabDetailRecordInfo> {
        C51187b() {
            super(FieldEncoding.LENGTH_DELIMITED, VCTabDetailRecordInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(VCTabDetailRecordInfo vCTabDetailRecordInfo) {
            int i;
            if (vCTabDetailRecordInfo.type != null) {
                i = RecordType.ADAPTER.encodedSizeWithTag(1, vCTabDetailRecordInfo.type);
            } else {
                i = 0;
            }
            return i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, vCTabDetailRecordInfo.url) + vCTabDetailRecordInfo.unknownFields().size();
        }

        /* renamed from: a */
        public VCTabDetailRecordInfo decode(ProtoReader protoReader) throws IOException {
            C51186a aVar = new C51186a();
            aVar.f127399a = RecordType.LARK_MINUTES;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f127399a = RecordType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127400b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VCTabDetailRecordInfo vCTabDetailRecordInfo) throws IOException {
            if (vCTabDetailRecordInfo.type != null) {
                RecordType.ADAPTER.encodeWithTag(protoWriter, 1, vCTabDetailRecordInfo.type);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, vCTabDetailRecordInfo.url);
            protoWriter.writeBytes(vCTabDetailRecordInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCTabDetailRecordInfo$a */
    public static final class C51186a extends Message.Builder<VCTabDetailRecordInfo, C51186a> {

        /* renamed from: a */
        public RecordType f127399a;

        /* renamed from: b */
        public List<String> f127400b = Internal.newMutableList();

        /* renamed from: a */
        public VCTabDetailRecordInfo build() {
            return new VCTabDetailRecordInfo(this.f127399a, this.f127400b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51186a newBuilder() {
        C51186a aVar = new C51186a();
        aVar.f127399a = this.type;
        aVar.f127400b = Internal.copyOf("url", this.url);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VCTabDetailRecordInfo");
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (!this.url.isEmpty()) {
            sb.append(", url=");
            sb.append(this.url);
        }
        StringBuilder replace = sb.replace(0, 2, "VCTabDetailRecordInfo{");
        replace.append('}');
        return replace.toString();
    }

    public VCTabDetailRecordInfo(RecordType recordType, List<String> list) {
        this(recordType, list, ByteString.EMPTY);
    }

    public VCTabDetailRecordInfo(RecordType recordType, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = recordType;
        this.url = Internal.immutableCopyOf("url", list);
    }
}
