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

public final class GetPagingTodosResponse extends Message<GetPagingTodosResponse, C19523a> {
    public static final ProtoAdapter<GetPagingTodosResponse> ADAPTER = new C19524b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    private static final long serialVersionUID = 0;
    public final Boolean has_more;
    public final List<Todo> todos;

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetPagingTodosResponse$b */
    private static final class C19524b extends ProtoAdapter<GetPagingTodosResponse> {
        C19524b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetPagingTodosResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetPagingTodosResponse getPagingTodosResponse) {
            int i;
            int encodedSizeWithTag = Todo.ADAPTER.asRepeated().encodedSizeWithTag(1, getPagingTodosResponse.todos);
            if (getPagingTodosResponse.has_more != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, getPagingTodosResponse.has_more);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getPagingTodosResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetPagingTodosResponse decode(ProtoReader protoReader) throws IOException {
            C19523a aVar = new C19523a();
            aVar.f47879b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47878a.add(Todo.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47879b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetPagingTodosResponse getPagingTodosResponse) throws IOException {
            Todo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getPagingTodosResponse.todos);
            if (getPagingTodosResponse.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getPagingTodosResponse.has_more);
            }
            protoWriter.writeBytes(getPagingTodosResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetPagingTodosResponse$a */
    public static final class C19523a extends Message.Builder<GetPagingTodosResponse, C19523a> {

        /* renamed from: a */
        public List<Todo> f47878a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f47879b;

        /* renamed from: a */
        public GetPagingTodosResponse build() {
            return new GetPagingTodosResponse(this.f47878a, this.f47879b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19523a newBuilder() {
        C19523a aVar = new C19523a();
        aVar.f47878a = Internal.copyOf("todos", this.todos);
        aVar.f47879b = this.has_more;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "GetPagingTodosResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.todos.isEmpty()) {
            sb.append(", todos=");
            sb.append(this.todos);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        StringBuilder replace = sb.replace(0, 2, "GetPagingTodosResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetPagingTodosResponse(List<Todo> list, Boolean bool) {
        this(list, bool, ByteString.EMPTY);
    }

    public GetPagingTodosResponse(List<Todo> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.todos = Internal.immutableCopyOf("todos", list);
        this.has_more = bool;
    }
}
