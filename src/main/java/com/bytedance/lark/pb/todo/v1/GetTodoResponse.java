package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetTodoResponse extends Message<GetTodoResponse, C19557a> {
    public static final ProtoAdapter<GetTodoResponse> ADAPTER = new C19558b();
    private static final long serialVersionUID = 0;
    public final Todo todo;

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodoResponse$b */
    private static final class C19558b extends ProtoAdapter<GetTodoResponse> {
        C19558b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTodoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTodoResponse getTodoResponse) {
            int i;
            if (getTodoResponse.todo != null) {
                i = Todo.ADAPTER.encodedSizeWithTag(1, getTodoResponse.todo);
            } else {
                i = 0;
            }
            return i + getTodoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetTodoResponse decode(ProtoReader protoReader) throws IOException {
            C19557a aVar = new C19557a();
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
                    aVar.f47908a = Todo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetTodoResponse getTodoResponse) throws IOException {
            if (getTodoResponse.todo != null) {
                Todo.ADAPTER.encodeWithTag(protoWriter, 1, getTodoResponse.todo);
            }
            protoWriter.writeBytes(getTodoResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodoResponse$a */
    public static final class C19557a extends Message.Builder<GetTodoResponse, C19557a> {

        /* renamed from: a */
        public Todo f47908a;

        /* renamed from: a */
        public GetTodoResponse build() {
            return new GetTodoResponse(this.f47908a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19557a newBuilder() {
        C19557a aVar = new C19557a();
        aVar.f47908a = this.todo;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "GetTodoResponse");
        StringBuilder sb = new StringBuilder();
        if (this.todo != null) {
            sb.append(", todo=");
            sb.append(this.todo);
        }
        StringBuilder replace = sb.replace(0, 2, "GetTodoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetTodoResponse(Todo todo2) {
        this(todo2, ByteString.EMPTY);
    }

    public GetTodoResponse(Todo todo2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.todo = todo2;
    }
}
