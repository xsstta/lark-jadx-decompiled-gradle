package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class FollowTodoResponse extends Message<FollowTodoResponse, C19503a> {
    public static final ProtoAdapter<FollowTodoResponse> ADAPTER = new C19504b();
    private static final long serialVersionUID = 0;
    public final Todo todo;

    /* renamed from: com.bytedance.lark.pb.todo.v1.FollowTodoResponse$b */
    private static final class C19504b extends ProtoAdapter<FollowTodoResponse> {
        C19504b() {
            super(FieldEncoding.LENGTH_DELIMITED, FollowTodoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(FollowTodoResponse followTodoResponse) {
            int i;
            if (followTodoResponse.todo != null) {
                i = Todo.ADAPTER.encodedSizeWithTag(1, followTodoResponse.todo);
            } else {
                i = 0;
            }
            return i + followTodoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public FollowTodoResponse decode(ProtoReader protoReader) throws IOException {
            C19503a aVar = new C19503a();
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
                    aVar.f47857a = Todo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FollowTodoResponse followTodoResponse) throws IOException {
            if (followTodoResponse.todo != null) {
                Todo.ADAPTER.encodeWithTag(protoWriter, 1, followTodoResponse.todo);
            }
            protoWriter.writeBytes(followTodoResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.FollowTodoResponse$a */
    public static final class C19503a extends Message.Builder<FollowTodoResponse, C19503a> {

        /* renamed from: a */
        public Todo f47857a;

        /* renamed from: a */
        public FollowTodoResponse build() {
            return new FollowTodoResponse(this.f47857a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19503a newBuilder() {
        C19503a aVar = new C19503a();
        aVar.f47857a = this.todo;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "FollowTodoResponse");
        StringBuilder sb = new StringBuilder();
        if (this.todo != null) {
            sb.append(", todo=");
            sb.append(this.todo);
        }
        StringBuilder replace = sb.replace(0, 2, "FollowTodoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public FollowTodoResponse(Todo todo2) {
        this(todo2, ByteString.EMPTY);
    }

    public FollowTodoResponse(Todo todo2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.todo = todo2;
    }
}
