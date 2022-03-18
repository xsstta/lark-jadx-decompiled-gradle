package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetBlockUserNumRequest extends Message<GetBlockUserNumRequest, C16444a> {
    public static final ProtoAdapter<GetBlockUserNumRequest> ADAPTER = new C16445b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetBlockUserNumRequest$b */
    private static final class C16445b extends ProtoAdapter<GetBlockUserNumRequest> {
        C16445b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetBlockUserNumRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetBlockUserNumRequest getBlockUserNumRequest) {
            return getBlockUserNumRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetBlockUserNumRequest decode(ProtoReader protoReader) throws IOException {
            C16444a aVar = new C16444a();
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
        public void encode(ProtoWriter protoWriter, GetBlockUserNumRequest getBlockUserNumRequest) throws IOException {
            protoWriter.writeBytes(getBlockUserNumRequest.unknownFields());
        }
    }

    public GetBlockUserNumRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetBlockUserNumRequest$a */
    public static final class C16444a extends Message.Builder<GetBlockUserNumRequest, C16444a> {
        /* renamed from: a */
        public GetBlockUserNumRequest build() {
            return new GetBlockUserNumRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16444a newBuilder() {
        C16444a aVar = new C16444a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetBlockUserNumRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetBlockUserNumRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetBlockUserNumRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
