package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetMyCustomerServiceChatRequest extends Message<GetMyCustomerServiceChatRequest, C17641a> {
    public static final ProtoAdapter<GetMyCustomerServiceChatRequest> ADAPTER = new C17642b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMyCustomerServiceChatRequest$b */
    private static final class C17642b extends ProtoAdapter<GetMyCustomerServiceChatRequest> {
        C17642b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMyCustomerServiceChatRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMyCustomerServiceChatRequest getMyCustomerServiceChatRequest) {
            return getMyCustomerServiceChatRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetMyCustomerServiceChatRequest decode(ProtoReader protoReader) throws IOException {
            C17641a aVar = new C17641a();
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
        public void encode(ProtoWriter protoWriter, GetMyCustomerServiceChatRequest getMyCustomerServiceChatRequest) throws IOException {
            protoWriter.writeBytes(getMyCustomerServiceChatRequest.unknownFields());
        }
    }

    public GetMyCustomerServiceChatRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMyCustomerServiceChatRequest$a */
    public static final class C17641a extends Message.Builder<GetMyCustomerServiceChatRequest, C17641a> {
        /* renamed from: a */
        public GetMyCustomerServiceChatRequest build() {
            return new GetMyCustomerServiceChatRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17641a newBuilder() {
        C17641a aVar = new C17641a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetMyCustomerServiceChatRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetMyCustomerServiceChatRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetMyCustomerServiceChatRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
