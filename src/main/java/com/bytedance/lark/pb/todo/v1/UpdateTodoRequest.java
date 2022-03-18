package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UpdateTodoRequest extends Message<UpdateTodoRequest, C19679a> {
    public static final ProtoAdapter<UpdateTodoRequest> ADAPTER = new C19680b();
    private static final long serialVersionUID = 0;
    public final Todo old_todo;
    public final Todo todo;

    /* renamed from: com.bytedance.lark.pb.todo.v1.UpdateTodoRequest$b */
    private static final class C19680b extends ProtoAdapter<UpdateTodoRequest> {
        C19680b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateTodoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateTodoRequest updateTodoRequest) {
            int i;
            int i2 = 0;
            if (updateTodoRequest.todo != null) {
                i = Todo.ADAPTER.encodedSizeWithTag(1, updateTodoRequest.todo);
            } else {
                i = 0;
            }
            if (updateTodoRequest.old_todo != null) {
                i2 = Todo.ADAPTER.encodedSizeWithTag(2, updateTodoRequest.old_todo);
            }
            return i + i2 + updateTodoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateTodoRequest decode(ProtoReader protoReader) throws IOException {
            C19679a aVar = new C19679a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48125a = Todo.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48126b = Todo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateTodoRequest updateTodoRequest) throws IOException {
            if (updateTodoRequest.todo != null) {
                Todo.ADAPTER.encodeWithTag(protoWriter, 1, updateTodoRequest.todo);
            }
            if (updateTodoRequest.old_todo != null) {
                Todo.ADAPTER.encodeWithTag(protoWriter, 2, updateTodoRequest.old_todo);
            }
            protoWriter.writeBytes(updateTodoRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.UpdateTodoRequest$a */
    public static final class C19679a extends Message.Builder<UpdateTodoRequest, C19679a> {

        /* renamed from: a */
        public Todo f48125a;

        /* renamed from: b */
        public Todo f48126b;

        /* renamed from: a */
        public UpdateTodoRequest build() {
            return new UpdateTodoRequest(this.f48125a, this.f48126b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19679a mo66735a(Todo todo) {
            this.f48125a = todo;
            return this;
        }

        /* renamed from: b */
        public C19679a mo66737b(Todo todo) {
            this.f48126b = todo;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19679a newBuilder() {
        C19679a aVar = new C19679a();
        aVar.f48125a = this.todo;
        aVar.f48126b = this.old_todo;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "UpdateTodoRequest");
        StringBuilder sb = new StringBuilder();
        if (this.todo != null) {
            sb.append(", todo=");
            sb.append(this.todo);
        }
        if (this.old_todo != null) {
            sb.append(", old_todo=");
            sb.append(this.old_todo);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateTodoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateTodoRequest(Todo todo2, Todo todo3) {
        this(todo2, todo3, ByteString.EMPTY);
    }

    public UpdateTodoRequest(Todo todo2, Todo todo3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.todo = todo2;
        this.old_todo = todo3;
    }
}
