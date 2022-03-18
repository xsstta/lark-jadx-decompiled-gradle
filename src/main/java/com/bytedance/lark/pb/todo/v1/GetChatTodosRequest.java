package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetChatTodosRequest extends Message<GetChatTodosRequest, C19513a> {
    public static final ProtoAdapter<GetChatTodosRequest> ADAPTER = new C19514b();
    private static final long serialVersionUID = 0;
    public final String chat_id;

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetChatTodosRequest$b */
    private static final class C19514b extends ProtoAdapter<GetChatTodosRequest> {
        C19514b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatTodosRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatTodosRequest getChatTodosRequest) {
            int i;
            if (getChatTodosRequest.chat_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getChatTodosRequest.chat_id);
            } else {
                i = 0;
            }
            return i + getChatTodosRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatTodosRequest decode(ProtoReader protoReader) throws IOException {
            C19513a aVar = new C19513a();
            aVar.f47866a = "";
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
                    aVar.f47866a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatTodosRequest getChatTodosRequest) throws IOException {
            if (getChatTodosRequest.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getChatTodosRequest.chat_id);
            }
            protoWriter.writeBytes(getChatTodosRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetChatTodosRequest$a */
    public static final class C19513a extends Message.Builder<GetChatTodosRequest, C19513a> {

        /* renamed from: a */
        public String f47866a;

        /* renamed from: a */
        public GetChatTodosRequest build() {
            return new GetChatTodosRequest(this.f47866a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19513a mo66328a(String str) {
            this.f47866a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19513a newBuilder() {
        C19513a aVar = new C19513a();
        aVar.f47866a = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "GetChatTodosRequest");
        StringBuilder sb = new StringBuilder();
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatTodosRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatTodosRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetChatTodosRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
    }
}
