package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetResourcesSizeRequest extends Message<GetResourcesSizeRequest, C18258a> {
    public static final ProtoAdapter<GetResourcesSizeRequest> ADAPTER = new C18259b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.media.v1.GetResourcesSizeRequest$b */
    private static final class C18259b extends ProtoAdapter<GetResourcesSizeRequest> {
        C18259b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetResourcesSizeRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetResourcesSizeRequest getResourcesSizeRequest) {
            return getResourcesSizeRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetResourcesSizeRequest decode(ProtoReader protoReader) throws IOException {
            C18258a aVar = new C18258a();
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
        public void encode(ProtoWriter protoWriter, GetResourcesSizeRequest getResourcesSizeRequest) throws IOException {
            protoWriter.writeBytes(getResourcesSizeRequest.unknownFields());
        }
    }

    public GetResourcesSizeRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.GetResourcesSizeRequest$a */
    public static final class C18258a extends Message.Builder<GetResourcesSizeRequest, C18258a> {
        /* renamed from: a */
        public GetResourcesSizeRequest build() {
            return new GetResourcesSizeRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18258a newBuilder() {
        C18258a aVar = new C18258a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "GetResourcesSizeRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetResourcesSizeRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetResourcesSizeRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
