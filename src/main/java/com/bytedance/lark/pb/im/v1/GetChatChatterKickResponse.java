package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetChatChatterKickResponse extends Message<GetChatChatterKickResponse, C17500a> {
    public static final ProtoAdapter<GetChatChatterKickResponse> ADAPTER = new C17501b();
    private static final long serialVersionUID = 0;
    public final ChatChatterKickInfo chat_chatter_kick_info;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatChatterKickResponse$b */
    private static final class C17501b extends ProtoAdapter<GetChatChatterKickResponse> {
        C17501b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatChatterKickResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatChatterKickResponse getChatChatterKickResponse) {
            int i;
            if (getChatChatterKickResponse.chat_chatter_kick_info != null) {
                i = ChatChatterKickInfo.ADAPTER.encodedSizeWithTag(1, getChatChatterKickResponse.chat_chatter_kick_info);
            } else {
                i = 0;
            }
            return i + getChatChatterKickResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatChatterKickResponse decode(ProtoReader protoReader) throws IOException {
            C17500a aVar = new C17500a();
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
                    aVar.f44406a = ChatChatterKickInfo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatChatterKickResponse getChatChatterKickResponse) throws IOException {
            if (getChatChatterKickResponse.chat_chatter_kick_info != null) {
                ChatChatterKickInfo.ADAPTER.encodeWithTag(protoWriter, 1, getChatChatterKickResponse.chat_chatter_kick_info);
            }
            protoWriter.writeBytes(getChatChatterKickResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatChatterKickResponse$a */
    public static final class C17500a extends Message.Builder<GetChatChatterKickResponse, C17500a> {

        /* renamed from: a */
        public ChatChatterKickInfo f44406a;

        /* renamed from: a */
        public GetChatChatterKickResponse build() {
            return new GetChatChatterKickResponse(this.f44406a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17500a newBuilder() {
        C17500a aVar = new C17500a();
        aVar.f44406a = this.chat_chatter_kick_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatChatterKickResponse");
        StringBuilder sb = new StringBuilder();
        if (this.chat_chatter_kick_info != null) {
            sb.append(", chat_chatter_kick_info=");
            sb.append(this.chat_chatter_kick_info);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatChatterKickResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatChatterKickResponse(ChatChatterKickInfo chatChatterKickInfo) {
        this(chatChatterKickInfo, ByteString.EMPTY);
    }

    public GetChatChatterKickResponse(ChatChatterKickInfo chatChatterKickInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_chatter_kick_info = chatChatterKickInfo;
    }
}
