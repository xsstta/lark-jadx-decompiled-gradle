package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetRTCDNSRequest extends Message<GetRTCDNSRequest, C50669a> {
    public static final ProtoAdapter<GetRTCDNSRequest> ADAPTER = new C50670b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetRTCDNSRequest$b */
    private static final class C50670b extends ProtoAdapter<GetRTCDNSRequest> {
        C50670b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetRTCDNSRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetRTCDNSRequest getRTCDNSRequest) {
            return getRTCDNSRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetRTCDNSRequest decode(ProtoReader protoReader) throws IOException {
            C50669a aVar = new C50669a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetRTCDNSRequest getRTCDNSRequest) throws IOException {
            protoWriter.writeBytes(getRTCDNSRequest.unknownFields());
        }
    }

    public GetRTCDNSRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetRTCDNSRequest$a */
    public static final class C50669a extends Message.Builder<GetRTCDNSRequest, C50669a> {
        /* renamed from: a */
        public GetRTCDNSRequest build() {
            return new GetRTCDNSRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50669a newBuilder() {
        C50669a aVar = new C50669a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetRTCDNSRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetRTCDNSRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetRTCDNSRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
