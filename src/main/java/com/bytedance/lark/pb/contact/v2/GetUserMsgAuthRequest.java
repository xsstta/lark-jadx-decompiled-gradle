package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetUserMsgAuthRequest extends Message<GetUserMsgAuthRequest, C16484a> {
    public static final ProtoAdapter<GetUserMsgAuthRequest> ADAPTER = new C16485b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserMsgAuthRequest$b */
    private static final class C16485b extends ProtoAdapter<GetUserMsgAuthRequest> {
        C16485b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserMsgAuthRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserMsgAuthRequest getUserMsgAuthRequest) {
            return getUserMsgAuthRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserMsgAuthRequest decode(ProtoReader protoReader) throws IOException {
            C16484a aVar = new C16484a();
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
        public void encode(ProtoWriter protoWriter, GetUserMsgAuthRequest getUserMsgAuthRequest) throws IOException {
            protoWriter.writeBytes(getUserMsgAuthRequest.unknownFields());
        }
    }

    public GetUserMsgAuthRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserMsgAuthRequest$a */
    public static final class C16484a extends Message.Builder<GetUserMsgAuthRequest, C16484a> {
        /* renamed from: a */
        public GetUserMsgAuthRequest build() {
            return new GetUserMsgAuthRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16484a newBuilder() {
        C16484a aVar = new C16484a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetUserMsgAuthRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetUserMsgAuthRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserMsgAuthRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
