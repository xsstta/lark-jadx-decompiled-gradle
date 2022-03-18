package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CreateTodoResponse extends Message<CreateTodoResponse, C19483a> {
    public static final ProtoAdapter<CreateTodoResponse> ADAPTER = new C19484b();
    private static final long serialVersionUID = 0;
    public final Todo todo;

    /* renamed from: com.bytedance.lark.pb.todo.v1.CreateTodoResponse$b */
    private static final class C19484b extends ProtoAdapter<CreateTodoResponse> {
        C19484b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateTodoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateTodoResponse createTodoResponse) {
            int i;
            if (createTodoResponse.todo != null) {
                i = Todo.ADAPTER.encodedSizeWithTag(1, createTodoResponse.todo);
            } else {
                i = 0;
            }
            return i + createTodoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CreateTodoResponse decode(ProtoReader protoReader) throws IOException {
            C19483a aVar = new C19483a();
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
                    aVar.f47837a = Todo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateTodoResponse createTodoResponse) throws IOException {
            if (createTodoResponse.todo != null) {
                Todo.ADAPTER.encodeWithTag(protoWriter, 1, createTodoResponse.todo);
            }
            protoWriter.writeBytes(createTodoResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.CreateTodoResponse$a */
    public static final class C19483a extends Message.Builder<CreateTodoResponse, C19483a> {

        /* renamed from: a */
        public Todo f47837a;

        /* renamed from: a */
        public CreateTodoResponse build() {
            return new CreateTodoResponse(this.f47837a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19483a newBuilder() {
        C19483a aVar = new C19483a();
        aVar.f47837a = this.todo;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "CreateTodoResponse");
        StringBuilder sb = new StringBuilder();
        if (this.todo != null) {
            sb.append(", todo=");
            sb.append(this.todo);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateTodoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CreateTodoResponse(Todo todo2) {
        this(todo2, ByteString.EMPTY);
    }

    public CreateTodoResponse(Todo todo2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.todo = todo2;
    }
}
