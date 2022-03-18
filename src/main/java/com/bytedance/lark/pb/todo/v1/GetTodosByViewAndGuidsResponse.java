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

public final class GetTodosByViewAndGuidsResponse extends Message<GetTodosByViewAndGuidsResponse, C19565a> {
    public static final ProtoAdapter<GetTodosByViewAndGuidsResponse> ADAPTER = new C19566b();
    private static final long serialVersionUID = 0;
    public final List<Todo> todos;

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodosByViewAndGuidsResponse$b */
    private static final class C19566b extends ProtoAdapter<GetTodosByViewAndGuidsResponse> {
        C19566b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTodosByViewAndGuidsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTodosByViewAndGuidsResponse getTodosByViewAndGuidsResponse) {
            return Todo.ADAPTER.asRepeated().encodedSizeWithTag(1, getTodosByViewAndGuidsResponse.todos) + getTodosByViewAndGuidsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetTodosByViewAndGuidsResponse decode(ProtoReader protoReader) throws IOException {
            C19565a aVar = new C19565a();
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
                    aVar.f47914a.add(Todo.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetTodosByViewAndGuidsResponse getTodosByViewAndGuidsResponse) throws IOException {
            Todo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getTodosByViewAndGuidsResponse.todos);
            protoWriter.writeBytes(getTodosByViewAndGuidsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodosByViewAndGuidsResponse$a */
    public static final class C19565a extends Message.Builder<GetTodosByViewAndGuidsResponse, C19565a> {

        /* renamed from: a */
        public List<Todo> f47914a = Internal.newMutableList();

        /* renamed from: a */
        public GetTodosByViewAndGuidsResponse build() {
            return new GetTodosByViewAndGuidsResponse(this.f47914a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19565a newBuilder() {
        C19565a aVar = new C19565a();
        aVar.f47914a = Internal.copyOf("todos", this.todos);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "GetTodosByViewAndGuidsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.todos.isEmpty()) {
            sb.append(", todos=");
            sb.append(this.todos);
        }
        StringBuilder replace = sb.replace(0, 2, "GetTodosByViewAndGuidsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetTodosByViewAndGuidsResponse(List<Todo> list) {
        this(list, ByteString.EMPTY);
    }

    public GetTodosByViewAndGuidsResponse(List<Todo> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.todos = Internal.immutableCopyOf("todos", list);
    }
}
