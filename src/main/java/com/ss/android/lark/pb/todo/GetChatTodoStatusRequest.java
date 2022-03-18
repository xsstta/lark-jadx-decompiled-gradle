package com.ss.android.lark.pb.todo;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetChatTodoStatusRequest extends Message<GetChatTodoStatusRequest, C50070a> {
    public static final ProtoAdapter<GetChatTodoStatusRequest> ADAPTER = new C50071b();
    private static final long serialVersionUID = 0;
    public final String mchat_id;

    /* renamed from: com.ss.android.lark.pb.todo.GetChatTodoStatusRequest$b */
    private static final class C50071b extends ProtoAdapter<GetChatTodoStatusRequest> {
        C50071b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatTodoStatusRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatTodoStatusRequest getChatTodoStatusRequest) {
            int i;
            if (getChatTodoStatusRequest.mchat_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getChatTodoStatusRequest.mchat_id);
            } else {
                i = 0;
            }
            return i + getChatTodoStatusRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatTodoStatusRequest decode(ProtoReader protoReader) throws IOException {
            C50070a aVar = new C50070a();
            aVar.f125195a = "";
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
                    aVar.f125195a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatTodoStatusRequest getChatTodoStatusRequest) throws IOException {
            if (getChatTodoStatusRequest.mchat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getChatTodoStatusRequest.mchat_id);
            }
            protoWriter.writeBytes(getChatTodoStatusRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.todo.GetChatTodoStatusRequest$a */
    public static final class C50070a extends Message.Builder<GetChatTodoStatusRequest, C50070a> {

        /* renamed from: a */
        public String f125195a;

        /* renamed from: a */
        public GetChatTodoStatusRequest build() {
            return new GetChatTodoStatusRequest(this.f125195a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50070a mo173948a(String str) {
            this.f125195a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50070a newBuilder() {
        C50070a aVar = new C50070a();
        aVar.f125195a = this.mchat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mchat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.mchat_id);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatTodoStatusRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatTodoStatusRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetChatTodoStatusRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mchat_id = str;
    }
}
