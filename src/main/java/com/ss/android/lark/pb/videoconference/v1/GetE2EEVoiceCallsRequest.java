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

public final class GetE2EEVoiceCallsRequest extends Message<GetE2EEVoiceCallsRequest, C50635a> {
    public static final ProtoAdapter<GetE2EEVoiceCallsRequest> ADAPTER = new C50636b();
    public static final SourceType DEFAULT_SOURCE_TYPE = SourceType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final SourceType source_type;

    public enum SourceType implements WireEnum {
        UNKNOWN(0),
        LONG_CONNECTION_LOSS(1),
        STARTUP(2);
        
        public static final ProtoAdapter<SourceType> ADAPTER = ProtoAdapter.newEnumAdapter(SourceType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static SourceType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return LONG_CONNECTION_LOSS;
            }
            if (i != 2) {
                return null;
            }
            return STARTUP;
        }

        private SourceType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetE2EEVoiceCallsRequest$b */
    private static final class C50636b extends ProtoAdapter<GetE2EEVoiceCallsRequest> {
        C50636b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetE2EEVoiceCallsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetE2EEVoiceCallsRequest getE2EEVoiceCallsRequest) {
            int i;
            if (getE2EEVoiceCallsRequest.source_type != null) {
                i = SourceType.ADAPTER.encodedSizeWithTag(1, getE2EEVoiceCallsRequest.source_type);
            } else {
                i = 0;
            }
            return i + getE2EEVoiceCallsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetE2EEVoiceCallsRequest decode(ProtoReader protoReader) throws IOException {
            C50635a aVar = new C50635a();
            aVar.f126373a = SourceType.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f126373a = SourceType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetE2EEVoiceCallsRequest getE2EEVoiceCallsRequest) throws IOException {
            if (getE2EEVoiceCallsRequest.source_type != null) {
                SourceType.ADAPTER.encodeWithTag(protoWriter, 1, getE2EEVoiceCallsRequest.source_type);
            }
            protoWriter.writeBytes(getE2EEVoiceCallsRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetE2EEVoiceCallsRequest$a */
    public static final class C50635a extends Message.Builder<GetE2EEVoiceCallsRequest, C50635a> {

        /* renamed from: a */
        public SourceType f126373a;

        /* renamed from: a */
        public GetE2EEVoiceCallsRequest build() {
            return new GetE2EEVoiceCallsRequest(this.f126373a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50635a newBuilder() {
        C50635a aVar = new C50635a();
        aVar.f126373a = this.source_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetE2EEVoiceCallsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.source_type != null) {
            sb.append(", source_type=");
            sb.append(this.source_type);
        }
        StringBuilder replace = sb.replace(0, 2, "GetE2EEVoiceCallsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetE2EEVoiceCallsRequest(SourceType sourceType) {
        this(sourceType, ByteString.EMPTY);
    }

    public GetE2EEVoiceCallsRequest(SourceType sourceType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.source_type = sourceType;
    }
}
