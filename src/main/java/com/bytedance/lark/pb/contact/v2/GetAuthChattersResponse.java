package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ChattersAuthResult;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetAuthChattersResponse extends Message<GetAuthChattersResponse, C16438a> {
    public static final ProtoAdapter<GetAuthChattersResponse> ADAPTER = new C16439b();
    private static final long serialVersionUID = 0;
    public final ChattersAuthResult auth_result;

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetAuthChattersResponse$b */
    private static final class C16439b extends ProtoAdapter<GetAuthChattersResponse> {
        C16439b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAuthChattersResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAuthChattersResponse getAuthChattersResponse) {
            int i;
            if (getAuthChattersResponse.auth_result != null) {
                i = ChattersAuthResult.ADAPTER.encodedSizeWithTag(1, getAuthChattersResponse.auth_result);
            } else {
                i = 0;
            }
            return i + getAuthChattersResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetAuthChattersResponse decode(ProtoReader protoReader) throws IOException {
            C16438a aVar = new C16438a();
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
                    aVar.f42739a = ChattersAuthResult.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAuthChattersResponse getAuthChattersResponse) throws IOException {
            if (getAuthChattersResponse.auth_result != null) {
                ChattersAuthResult.ADAPTER.encodeWithTag(protoWriter, 1, getAuthChattersResponse.auth_result);
            }
            protoWriter.writeBytes(getAuthChattersResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetAuthChattersResponse$a */
    public static final class C16438a extends Message.Builder<GetAuthChattersResponse, C16438a> {

        /* renamed from: a */
        public ChattersAuthResult f42739a;

        /* renamed from: a */
        public GetAuthChattersResponse build() {
            return new GetAuthChattersResponse(this.f42739a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16438a newBuilder() {
        C16438a aVar = new C16438a();
        aVar.f42739a = this.auth_result;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetAuthChattersResponse");
        StringBuilder sb = new StringBuilder();
        if (this.auth_result != null) {
            sb.append(", auth_result=");
            sb.append(this.auth_result);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAuthChattersResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetAuthChattersResponse(ChattersAuthResult chattersAuthResult) {
        this(chattersAuthResult, ByteString.EMPTY);
    }

    public GetAuthChattersResponse(ChattersAuthResult chattersAuthResult, ByteString byteString) {
        super(ADAPTER, byteString);
        this.auth_result = chattersAuthResult;
    }
}
