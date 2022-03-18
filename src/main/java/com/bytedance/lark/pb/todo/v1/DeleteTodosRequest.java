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

public final class DeleteTodosRequest extends Message<DeleteTodosRequest, C19495a> {
    public static final ProtoAdapter<DeleteTodosRequest> ADAPTER = new C19496b();
    public static final TodoSource DEFAULT_SOURCE = TodoSource.UNKNOWN_SOURCE;
    private static final long serialVersionUID = 0;
    public final TodoSource source;
    public final List<String> todo_guids;

    /* renamed from: com.bytedance.lark.pb.todo.v1.DeleteTodosRequest$b */
    private static final class C19496b extends ProtoAdapter<DeleteTodosRequest> {
        C19496b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteTodosRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteTodosRequest deleteTodosRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, deleteTodosRequest.todo_guids);
            if (deleteTodosRequest.source != null) {
                i = TodoSource.ADAPTER.encodedSizeWithTag(2, deleteTodosRequest.source);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + deleteTodosRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteTodosRequest decode(ProtoReader protoReader) throws IOException {
            C19495a aVar = new C19495a();
            aVar.f47849b = TodoSource.UNKNOWN_SOURCE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47848a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f47849b = TodoSource.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteTodosRequest deleteTodosRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, deleteTodosRequest.todo_guids);
            if (deleteTodosRequest.source != null) {
                TodoSource.ADAPTER.encodeWithTag(protoWriter, 2, deleteTodosRequest.source);
            }
            protoWriter.writeBytes(deleteTodosRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.DeleteTodosRequest$a */
    public static final class C19495a extends Message.Builder<DeleteTodosRequest, C19495a> {

        /* renamed from: a */
        public List<String> f47848a = Internal.newMutableList();

        /* renamed from: b */
        public TodoSource f47849b;

        /* renamed from: a */
        public DeleteTodosRequest build() {
            return new DeleteTodosRequest(this.f47848a, this.f47849b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19495a mo66283a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f47848a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19495a newBuilder() {
        C19495a aVar = new C19495a();
        aVar.f47848a = Internal.copyOf("todo_guids", this.todo_guids);
        aVar.f47849b = this.source;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "DeleteTodosRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.todo_guids.isEmpty()) {
            sb.append(", todo_guids=");
            sb.append(this.todo_guids);
        }
        if (this.source != null) {
            sb.append(", source=");
            sb.append(this.source);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteTodosRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteTodosRequest(List<String> list, TodoSource todoSource) {
        this(list, todoSource, ByteString.EMPTY);
    }

    public DeleteTodosRequest(List<String> list, TodoSource todoSource, ByteString byteString) {
        super(ADAPTER, byteString);
        this.todo_guids = Internal.immutableCopyOf("todo_guids", list);
        this.source = todoSource;
    }
}
