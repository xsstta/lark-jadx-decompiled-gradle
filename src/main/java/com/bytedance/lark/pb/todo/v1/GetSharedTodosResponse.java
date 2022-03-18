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

public final class GetSharedTodosResponse extends Message<GetSharedTodosResponse, C19533a> {
    public static final ProtoAdapter<GetSharedTodosResponse> ADAPTER = new C19534b();
    private static final long serialVersionUID = 0;
    public final List<Todo> todos;

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetSharedTodosResponse$b */
    private static final class C19534b extends ProtoAdapter<GetSharedTodosResponse> {
        C19534b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetSharedTodosResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetSharedTodosResponse getSharedTodosResponse) {
            return Todo.ADAPTER.asRepeated().encodedSizeWithTag(2, getSharedTodosResponse.todos) + getSharedTodosResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetSharedTodosResponse decode(ProtoReader protoReader) throws IOException {
            C19533a aVar = new C19533a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47891a.add(Todo.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetSharedTodosResponse getSharedTodosResponse) throws IOException {
            Todo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getSharedTodosResponse.todos);
            protoWriter.writeBytes(getSharedTodosResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetSharedTodosResponse$a */
    public static final class C19533a extends Message.Builder<GetSharedTodosResponse, C19533a> {

        /* renamed from: a */
        public List<Todo> f47891a = Internal.newMutableList();

        /* renamed from: a */
        public GetSharedTodosResponse build() {
            return new GetSharedTodosResponse(this.f47891a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19533a newBuilder() {
        C19533a aVar = new C19533a();
        aVar.f47891a = Internal.copyOf("todos", this.todos);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "GetSharedTodosResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.todos.isEmpty()) {
            sb.append(", todos=");
            sb.append(this.todos);
        }
        StringBuilder replace = sb.replace(0, 2, "GetSharedTodosResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetSharedTodosResponse(List<Todo> list) {
        this(list, ByteString.EMPTY);
    }

    public GetSharedTodosResponse(List<Todo> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.todos = Internal.immutableCopyOf("todos", list);
    }
}
