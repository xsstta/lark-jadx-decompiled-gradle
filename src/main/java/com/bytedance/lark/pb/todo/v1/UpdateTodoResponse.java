package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UpdateTodoResponse extends Message<UpdateTodoResponse, C19681a> {
    public static final ProtoAdapter<UpdateTodoResponse> ADAPTER = new C19682b();
    private static final long serialVersionUID = 0;
    public final Todo todo;

    /* renamed from: com.bytedance.lark.pb.todo.v1.UpdateTodoResponse$b */
    private static final class C19682b extends ProtoAdapter<UpdateTodoResponse> {
        C19682b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateTodoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateTodoResponse updateTodoResponse) {
            int i;
            if (updateTodoResponse.todo != null) {
                i = Todo.ADAPTER.encodedSizeWithTag(1, updateTodoResponse.todo);
            } else {
                i = 0;
            }
            return i + updateTodoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateTodoResponse decode(ProtoReader protoReader) throws IOException {
            C19681a aVar = new C19681a();
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
                    aVar.f48127a = Todo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateTodoResponse updateTodoResponse) throws IOException {
            if (updateTodoResponse.todo != null) {
                Todo.ADAPTER.encodeWithTag(protoWriter, 1, updateTodoResponse.todo);
            }
            protoWriter.writeBytes(updateTodoResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.UpdateTodoResponse$a */
    public static final class C19681a extends Message.Builder<UpdateTodoResponse, C19681a> {

        /* renamed from: a */
        public Todo f48127a;

        /* renamed from: a */
        public UpdateTodoResponse build() {
            return new UpdateTodoResponse(this.f48127a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19681a newBuilder() {
        C19681a aVar = new C19681a();
        aVar.f48127a = this.todo;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "UpdateTodoResponse");
        StringBuilder sb = new StringBuilder();
        if (this.todo != null) {
            sb.append(", todo=");
            sb.append(this.todo);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateTodoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateTodoResponse(Todo todo2) {
        this(todo2, ByteString.EMPTY);
    }

    public UpdateTodoResponse(Todo todo2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.todo = todo2;
    }
}
