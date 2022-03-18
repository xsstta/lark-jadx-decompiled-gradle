package com.ss.android.lark.pb.todo;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetChatTodoStatusResponse extends Message<GetChatTodoStatusResponse, C50072a> {
    public static final ProtoAdapter<GetChatTodoStatusResponse> ADAPTER = new C50073b();
    public static final Boolean DEFAULT_RED_DOT = false;
    private static final long serialVersionUID = 0;
    public final Boolean mred_dot;

    /* renamed from: com.ss.android.lark.pb.todo.GetChatTodoStatusResponse$b */
    private static final class C50073b extends ProtoAdapter<GetChatTodoStatusResponse> {
        C50073b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatTodoStatusResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatTodoStatusResponse getChatTodoStatusResponse) {
            int i;
            if (getChatTodoStatusResponse.mred_dot != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, getChatTodoStatusResponse.mred_dot);
            } else {
                i = 0;
            }
            return i + getChatTodoStatusResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatTodoStatusResponse decode(ProtoReader protoReader) throws IOException {
            C50072a aVar = new C50072a();
            aVar.f125196a = false;
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
                    aVar.f125196a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatTodoStatusResponse getChatTodoStatusResponse) throws IOException {
            if (getChatTodoStatusResponse.mred_dot != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getChatTodoStatusResponse.mred_dot);
            }
            protoWriter.writeBytes(getChatTodoStatusResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.todo.GetChatTodoStatusResponse$a */
    public static final class C50072a extends Message.Builder<GetChatTodoStatusResponse, C50072a> {

        /* renamed from: a */
        public Boolean f125196a;

        /* renamed from: a */
        public GetChatTodoStatusResponse build() {
            return new GetChatTodoStatusResponse(this.f125196a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50072a newBuilder() {
        C50072a aVar = new C50072a();
        aVar.f125196a = this.mred_dot;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mred_dot != null) {
            sb.append(", red_dot=");
            sb.append(this.mred_dot);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatTodoStatusResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatTodoStatusResponse(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public GetChatTodoStatusResponse(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mred_dot = bool;
    }
}
