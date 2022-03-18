package com.bytedance.lark.pb.openplatform.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetUuidRequest extends Message<GetUuidRequest, C18669a> {
    public static final ProtoAdapter<GetUuidRequest> ADAPTER = new C18670b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.GetUuidRequest$b */
    private static final class C18670b extends ProtoAdapter<GetUuidRequest> {
        C18670b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUuidRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUuidRequest getUuidRequest) {
            return getUuidRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetUuidRequest decode(ProtoReader protoReader) throws IOException {
            C18669a aVar = new C18669a();
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
        public void encode(ProtoWriter protoWriter, GetUuidRequest getUuidRequest) throws IOException {
            protoWriter.writeBytes(getUuidRequest.unknownFields());
        }
    }

    public GetUuidRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.GetUuidRequest$a */
    public static final class C18669a extends Message.Builder<GetUuidRequest, C18669a> {
        /* renamed from: a */
        public GetUuidRequest build() {
            return new GetUuidRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18669a newBuilder() {
        C18669a aVar = new C18669a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "GetUuidRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetUuidRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetUuidRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
