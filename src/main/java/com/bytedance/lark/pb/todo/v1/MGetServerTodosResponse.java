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

public final class MGetServerTodosResponse extends Message<MGetServerTodosResponse, C19583a> {
    public static final ProtoAdapter<MGetServerTodosResponse> ADAPTER = new C19584b();
    private static final long serialVersionUID = 0;
    public final List<Todo> todos;

    /* renamed from: com.bytedance.lark.pb.todo.v1.MGetServerTodosResponse$b */
    private static final class C19584b extends ProtoAdapter<MGetServerTodosResponse> {
        C19584b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetServerTodosResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetServerTodosResponse mGetServerTodosResponse) {
            return Todo.ADAPTER.asRepeated().encodedSizeWithTag(2, mGetServerTodosResponse.todos) + mGetServerTodosResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MGetServerTodosResponse decode(ProtoReader protoReader) throws IOException {
            C19583a aVar = new C19583a();
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
                    aVar.f47933a.add(Todo.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MGetServerTodosResponse mGetServerTodosResponse) throws IOException {
            Todo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, mGetServerTodosResponse.todos);
            protoWriter.writeBytes(mGetServerTodosResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.MGetServerTodosResponse$a */
    public static final class C19583a extends Message.Builder<MGetServerTodosResponse, C19583a> {

        /* renamed from: a */
        public List<Todo> f47933a = Internal.newMutableList();

        /* renamed from: a */
        public MGetServerTodosResponse build() {
            return new MGetServerTodosResponse(this.f47933a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19583a newBuilder() {
        C19583a aVar = new C19583a();
        aVar.f47933a = Internal.copyOf("todos", this.todos);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "MGetServerTodosResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.todos.isEmpty()) {
            sb.append(", todos=");
            sb.append(this.todos);
        }
        StringBuilder replace = sb.replace(0, 2, "MGetServerTodosResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MGetServerTodosResponse(List<Todo> list) {
        this(list, ByteString.EMPTY);
    }

    public MGetServerTodosResponse(List<Todo> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.todos = Internal.immutableCopyOf("todos", list);
    }
}
