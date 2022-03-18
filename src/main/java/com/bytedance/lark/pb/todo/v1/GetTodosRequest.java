package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.todo.v1.TodoListView;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetTodosRequest extends Message<GetTodosRequest, C19567a> {
    public static final ProtoAdapter<GetTodosRequest> ADAPTER = new C19568b();
    public static final TodoListView.Type DEFAULT_TODO_VIEW = TodoListView.Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final TodoListView.Type todo_view;

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodosRequest$b */
    private static final class C19568b extends ProtoAdapter<GetTodosRequest> {
        C19568b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTodosRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTodosRequest getTodosRequest) {
            int i;
            if (getTodosRequest.todo_view != null) {
                i = TodoListView.Type.ADAPTER.encodedSizeWithTag(1, getTodosRequest.todo_view);
            } else {
                i = 0;
            }
            return i + getTodosRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetTodosRequest decode(ProtoReader protoReader) throws IOException {
            C19567a aVar = new C19567a();
            aVar.f47915a = TodoListView.Type.UNKNOWN;
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
                    try {
                        aVar.f47915a = TodoListView.Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetTodosRequest getTodosRequest) throws IOException {
            if (getTodosRequest.todo_view != null) {
                TodoListView.Type.ADAPTER.encodeWithTag(protoWriter, 1, getTodosRequest.todo_view);
            }
            protoWriter.writeBytes(getTodosRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodosRequest$a */
    public static final class C19567a extends Message.Builder<GetTodosRequest, C19567a> {

        /* renamed from: a */
        public TodoListView.Type f47915a;

        /* renamed from: a */
        public GetTodosRequest build() {
            return new GetTodosRequest(this.f47915a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19567a mo66457a(TodoListView.Type type) {
            this.f47915a = type;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19567a newBuilder() {
        C19567a aVar = new C19567a();
        aVar.f47915a = this.todo_view;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "GetTodosRequest");
        StringBuilder sb = new StringBuilder();
        if (this.todo_view != null) {
            sb.append(", todo_view=");
            sb.append(this.todo_view);
        }
        StringBuilder replace = sb.replace(0, 2, "GetTodosRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetTodosRequest(TodoListView.Type type) {
        this(type, ByteString.EMPTY);
    }

    public GetTodosRequest(TodoListView.Type type, ByteString byteString) {
        super(ADAPTER, byteString);
        this.todo_view = type;
    }
}
