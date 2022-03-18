package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetChatCompletedTodosResponse extends Message<GetChatCompletedTodosResponse, C19511a> {
    public static final ProtoAdapter<GetChatCompletedTodosResponse> ADAPTER = new C19512b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Long DEFAULT_LAST_OFFSET = 0L;
    private static final long serialVersionUID = 0;
    public final Boolean has_more;
    public final Long last_offset;
    public final List<ChatTodoInfo> todos;

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetChatCompletedTodosResponse$b */
    private static final class C19512b extends ProtoAdapter<GetChatCompletedTodosResponse> {
        C19512b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatCompletedTodosResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatCompletedTodosResponse getChatCompletedTodosResponse) {
            int i;
            int encodedSizeWithTag = ChatTodoInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, getChatCompletedTodosResponse.todos);
            int i2 = 0;
            if (getChatCompletedTodosResponse.last_offset != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(2, getChatCompletedTodosResponse.last_offset);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getChatCompletedTodosResponse.has_more != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, getChatCompletedTodosResponse.has_more);
            }
            return i3 + i2 + getChatCompletedTodosResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatCompletedTodosResponse decode(ProtoReader protoReader) throws IOException {
            C19511a aVar = new C19511a();
            aVar.f47864b = 0L;
            aVar.f47865c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47863a.add(ChatTodoInfo.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f47864b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47865c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatCompletedTodosResponse getChatCompletedTodosResponse) throws IOException {
            ChatTodoInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getChatCompletedTodosResponse.todos);
            if (getChatCompletedTodosResponse.last_offset != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getChatCompletedTodosResponse.last_offset);
            }
            if (getChatCompletedTodosResponse.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getChatCompletedTodosResponse.has_more);
            }
            protoWriter.writeBytes(getChatCompletedTodosResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetChatCompletedTodosResponse$a */
    public static final class C19511a extends Message.Builder<GetChatCompletedTodosResponse, C19511a> {

        /* renamed from: a */
        public List<ChatTodoInfo> f47863a = Internal.newMutableList();

        /* renamed from: b */
        public Long f47864b;

        /* renamed from: c */
        public Boolean f47865c;

        /* renamed from: a */
        public GetChatCompletedTodosResponse build() {
            return new GetChatCompletedTodosResponse(this.f47863a, this.f47864b, this.f47865c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19511a newBuilder() {
        C19511a aVar = new C19511a();
        aVar.f47863a = Internal.copyOf("todos", this.todos);
        aVar.f47864b = this.last_offset;
        aVar.f47865c = this.has_more;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "GetChatCompletedTodosResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.todos.isEmpty()) {
            sb.append(", todos=");
            sb.append(this.todos);
        }
        if (this.last_offset != null) {
            sb.append(", last_offset=");
            sb.append(this.last_offset);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatCompletedTodosResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatCompletedTodosResponse(List<ChatTodoInfo> list, Long l, Boolean bool) {
        this(list, l, bool, ByteString.EMPTY);
    }

    public GetChatCompletedTodosResponse(List<ChatTodoInfo> list, Long l, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.todos = Internal.immutableCopyOf("todos", list);
        this.last_offset = l;
        this.has_more = bool;
    }
}
