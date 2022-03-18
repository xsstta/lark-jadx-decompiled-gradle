package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MarkTodoCompletedResponse extends Message<MarkTodoCompletedResponse, C19587a> {
    public static final ProtoAdapter<MarkTodoCompletedResponse> ADAPTER = new C19588b();
    private static final long serialVersionUID = 0;
    public final Todo todo;

    /* renamed from: com.bytedance.lark.pb.todo.v1.MarkTodoCompletedResponse$b */
    private static final class C19588b extends ProtoAdapter<MarkTodoCompletedResponse> {
        C19588b() {
            super(FieldEncoding.LENGTH_DELIMITED, MarkTodoCompletedResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MarkTodoCompletedResponse markTodoCompletedResponse) {
            int i;
            if (markTodoCompletedResponse.todo != null) {
                i = Todo.ADAPTER.encodedSizeWithTag(1, markTodoCompletedResponse.todo);
            } else {
                i = 0;
            }
            return i + markTodoCompletedResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MarkTodoCompletedResponse decode(ProtoReader protoReader) throws IOException {
            C19587a aVar = new C19587a();
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
                    aVar.f47939a = Todo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MarkTodoCompletedResponse markTodoCompletedResponse) throws IOException {
            if (markTodoCompletedResponse.todo != null) {
                Todo.ADAPTER.encodeWithTag(protoWriter, 1, markTodoCompletedResponse.todo);
            }
            protoWriter.writeBytes(markTodoCompletedResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.MarkTodoCompletedResponse$a */
    public static final class C19587a extends Message.Builder<MarkTodoCompletedResponse, C19587a> {

        /* renamed from: a */
        public Todo f47939a;

        /* renamed from: a */
        public MarkTodoCompletedResponse build() {
            return new MarkTodoCompletedResponse(this.f47939a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19587a newBuilder() {
        C19587a aVar = new C19587a();
        aVar.f47939a = this.todo;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "MarkTodoCompletedResponse");
        StringBuilder sb = new StringBuilder();
        if (this.todo != null) {
            sb.append(", todo=");
            sb.append(this.todo);
        }
        StringBuilder replace = sb.replace(0, 2, "MarkTodoCompletedResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MarkTodoCompletedResponse(Todo todo2) {
        this(todo2, ByteString.EMPTY);
    }

    public MarkTodoCompletedResponse(Todo todo2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.todo = todo2;
    }
}
