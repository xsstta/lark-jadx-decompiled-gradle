package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetMyCustomerServiceChatResponse extends Message<GetMyCustomerServiceChatResponse, C17643a> {
    public static final ProtoAdapter<GetMyCustomerServiceChatResponse> ADAPTER = new C17644b();
    private static final long serialVersionUID = 0;
    public final Chat chat;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMyCustomerServiceChatResponse$b */
    private static final class C17644b extends ProtoAdapter<GetMyCustomerServiceChatResponse> {
        C17644b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMyCustomerServiceChatResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMyCustomerServiceChatResponse getMyCustomerServiceChatResponse) {
            return Chat.ADAPTER.encodedSizeWithTag(1, getMyCustomerServiceChatResponse.chat) + getMyCustomerServiceChatResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetMyCustomerServiceChatResponse decode(ProtoReader protoReader) throws IOException {
            C17643a aVar = new C17643a();
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
                    aVar.f44650a = Chat.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMyCustomerServiceChatResponse getMyCustomerServiceChatResponse) throws IOException {
            Chat.ADAPTER.encodeWithTag(protoWriter, 1, getMyCustomerServiceChatResponse.chat);
            protoWriter.writeBytes(getMyCustomerServiceChatResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMyCustomerServiceChatResponse$a */
    public static final class C17643a extends Message.Builder<GetMyCustomerServiceChatResponse, C17643a> {

        /* renamed from: a */
        public Chat f44650a;

        /* renamed from: a */
        public GetMyCustomerServiceChatResponse build() {
            Chat chat = this.f44650a;
            if (chat != null) {
                return new GetMyCustomerServiceChatResponse(chat, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(chat, "chat");
        }
    }

    @Override // com.squareup.wire.Message
    public C17643a newBuilder() {
        C17643a aVar = new C17643a();
        aVar.f44650a = this.chat;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetMyCustomerServiceChatResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat=");
        sb.append(this.chat);
        StringBuilder replace = sb.replace(0, 2, "GetMyCustomerServiceChatResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetMyCustomerServiceChatResponse(Chat chat2) {
        this(chat2, ByteString.EMPTY);
    }

    public GetMyCustomerServiceChatResponse(Chat chat2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat = chat2;
    }
}
