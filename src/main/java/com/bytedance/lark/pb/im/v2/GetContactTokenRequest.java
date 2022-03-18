package com.bytedance.lark.pb.im.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetContactTokenRequest extends Message<GetContactTokenRequest, C18178a> {
    public static final ProtoAdapter<GetContactTokenRequest> ADAPTER = new C18179b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.im.v2.GetContactTokenRequest$b */
    private static final class C18179b extends ProtoAdapter<GetContactTokenRequest> {
        C18179b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetContactTokenRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetContactTokenRequest getContactTokenRequest) {
            return getContactTokenRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetContactTokenRequest decode(ProtoReader protoReader) throws IOException {
            C18178a aVar = new C18178a();
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
        public void encode(ProtoWriter protoWriter, GetContactTokenRequest getContactTokenRequest) throws IOException {
            protoWriter.writeBytes(getContactTokenRequest.unknownFields());
        }
    }

    public GetContactTokenRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.im.v2.GetContactTokenRequest$a */
    public static final class C18178a extends Message.Builder<GetContactTokenRequest, C18178a> {
        /* renamed from: a */
        public GetContactTokenRequest build() {
            return new GetContactTokenRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18178a newBuilder() {
        C18178a aVar = new C18178a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetContactTokenRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetContactTokenRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetContactTokenRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
