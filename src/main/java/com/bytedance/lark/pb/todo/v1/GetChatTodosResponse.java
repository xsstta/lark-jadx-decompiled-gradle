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

public final class GetChatTodosResponse extends Message<GetChatTodosResponse, C19515a> {
    public static final ProtoAdapter<GetChatTodosResponse> ADAPTER = new C19516b();
    private static final long serialVersionUID = 0;
    public final List<ChatTodoInfo> assign_to_me_todos;
    public final List<ChatTodoInfo> assign_to_other_todos;

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetChatTodosResponse$b */
    private static final class C19516b extends ProtoAdapter<GetChatTodosResponse> {
        C19516b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatTodosResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatTodosResponse getChatTodosResponse) {
            return ChatTodoInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, getChatTodosResponse.assign_to_me_todos) + ChatTodoInfo.ADAPTER.asRepeated().encodedSizeWithTag(2, getChatTodosResponse.assign_to_other_todos) + getChatTodosResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatTodosResponse decode(ProtoReader protoReader) throws IOException {
            C19515a aVar = new C19515a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47867a.add(ChatTodoInfo.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47868b.add(ChatTodoInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatTodosResponse getChatTodosResponse) throws IOException {
            ChatTodoInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getChatTodosResponse.assign_to_me_todos);
            ChatTodoInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getChatTodosResponse.assign_to_other_todos);
            protoWriter.writeBytes(getChatTodosResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetChatTodosResponse$a */
    public static final class C19515a extends Message.Builder<GetChatTodosResponse, C19515a> {

        /* renamed from: a */
        public List<ChatTodoInfo> f47867a = Internal.newMutableList();

        /* renamed from: b */
        public List<ChatTodoInfo> f47868b = Internal.newMutableList();

        /* renamed from: a */
        public GetChatTodosResponse build() {
            return new GetChatTodosResponse(this.f47867a, this.f47868b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19515a newBuilder() {
        C19515a aVar = new C19515a();
        aVar.f47867a = Internal.copyOf("assign_to_me_todos", this.assign_to_me_todos);
        aVar.f47868b = Internal.copyOf("assign_to_other_todos", this.assign_to_other_todos);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "GetChatTodosResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.assign_to_me_todos.isEmpty()) {
            sb.append(", assign_to_me_todos=");
            sb.append(this.assign_to_me_todos);
        }
        if (!this.assign_to_other_todos.isEmpty()) {
            sb.append(", assign_to_other_todos=");
            sb.append(this.assign_to_other_todos);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatTodosResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatTodosResponse(List<ChatTodoInfo> list, List<ChatTodoInfo> list2) {
        this(list, list2, ByteString.EMPTY);
    }

    public GetChatTodosResponse(List<ChatTodoInfo> list, List<ChatTodoInfo> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.assign_to_me_todos = Internal.immutableCopyOf("assign_to_me_todos", list);
        this.assign_to_other_todos = Internal.immutableCopyOf("assign_to_other_todos", list2);
    }
}
