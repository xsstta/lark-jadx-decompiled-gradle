package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetChatChatterKickRequest extends Message<GetChatChatterKickRequest, C17498a> {
    public static final ProtoAdapter<GetChatChatterKickRequest> ADAPTER = new C17499b();
    private static final long serialVersionUID = 0;
    public final String chat_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatChatterKickRequest$b */
    private static final class C17499b extends ProtoAdapter<GetChatChatterKickRequest> {
        C17499b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatChatterKickRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatChatterKickRequest getChatChatterKickRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getChatChatterKickRequest.chat_id) + getChatChatterKickRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatChatterKickRequest decode(ProtoReader protoReader) throws IOException {
            C17498a aVar = new C17498a();
            aVar.f44405a = "";
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
                    aVar.f44405a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatChatterKickRequest getChatChatterKickRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getChatChatterKickRequest.chat_id);
            protoWriter.writeBytes(getChatChatterKickRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatChatterKickRequest$a */
    public static final class C17498a extends Message.Builder<GetChatChatterKickRequest, C17498a> {

        /* renamed from: a */
        public String f44405a;

        /* renamed from: a */
        public GetChatChatterKickRequest build() {
            String str = this.f44405a;
            if (str != null) {
                return new GetChatChatterKickRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }

        /* renamed from: a */
        public C17498a mo61306a(String str) {
            this.f44405a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17498a newBuilder() {
        C17498a aVar = new C17498a();
        aVar.f44405a = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatChatterKickRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        StringBuilder replace = sb.replace(0, 2, "GetChatChatterKickRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatChatterKickRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetChatChatterKickRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
    }
}
