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

public final class GetTodosResponse extends Message<GetTodosResponse, C19569a> {
    public static final ProtoAdapter<GetTodosResponse> ADAPTER = new C19570b();
    private static final long serialVersionUID = 0;
    public final List<Todo> todos;

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodosResponse$b */
    private static final class C19570b extends ProtoAdapter<GetTodosResponse> {
        C19570b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTodosResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTodosResponse getTodosResponse) {
            return Todo.ADAPTER.asRepeated().encodedSizeWithTag(1, getTodosResponse.todos) + getTodosResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetTodosResponse decode(ProtoReader protoReader) throws IOException {
            C19569a aVar = new C19569a();
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
                    aVar.f47916a.add(Todo.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetTodosResponse getTodosResponse) throws IOException {
            Todo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getTodosResponse.todos);
            protoWriter.writeBytes(getTodosResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodosResponse$a */
    public static final class C19569a extends Message.Builder<GetTodosResponse, C19569a> {

        /* renamed from: a */
        public List<Todo> f47916a = Internal.newMutableList();

        /* renamed from: a */
        public GetTodosResponse build() {
            return new GetTodosResponse(this.f47916a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19569a newBuilder() {
        C19569a aVar = new C19569a();
        aVar.f47916a = Internal.copyOf("todos", this.todos);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "GetTodosResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.todos.isEmpty()) {
            sb.append(", todos=");
            sb.append(this.todos);
        }
        StringBuilder replace = sb.replace(0, 2, "GetTodosResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetTodosResponse(List<Todo> list) {
        this(list, ByteString.EMPTY);
    }

    public GetTodosResponse(List<Todo> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.todos = Internal.immutableCopyOf("todos", list);
    }
}
