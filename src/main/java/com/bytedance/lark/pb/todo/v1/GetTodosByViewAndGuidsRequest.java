package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.todo.v1.TodoListView;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetTodosByViewAndGuidsRequest extends Message<GetTodosByViewAndGuidsRequest, C19563a> {
    public static final ProtoAdapter<GetTodosByViewAndGuidsRequest> ADAPTER = new C19564b();
    public static final Boolean DEFAULT_BY_VIEW_TYPE = true;
    public static final TodoListView.Type DEFAULT_TODO_VIEW = TodoListView.Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Boolean by_view_type;
    public final List<String> guids;
    public final TodoListView.Type todo_view;

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodosByViewAndGuidsRequest$b */
    private static final class C19564b extends ProtoAdapter<GetTodosByViewAndGuidsRequest> {
        C19564b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTodosByViewAndGuidsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTodosByViewAndGuidsRequest getTodosByViewAndGuidsRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getTodosByViewAndGuidsRequest.guids);
            int i2 = 0;
            if (getTodosByViewAndGuidsRequest.todo_view != null) {
                i = TodoListView.Type.ADAPTER.encodedSizeWithTag(2, getTodosByViewAndGuidsRequest.todo_view);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getTodosByViewAndGuidsRequest.by_view_type != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, getTodosByViewAndGuidsRequest.by_view_type);
            }
            return i3 + i2 + getTodosByViewAndGuidsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetTodosByViewAndGuidsRequest decode(ProtoReader protoReader) throws IOException {
            C19563a aVar = new C19563a();
            aVar.f47912b = TodoListView.Type.UNKNOWN;
            aVar.f47913c = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47911a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    try {
                        aVar.f47912b = TodoListView.Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47913c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetTodosByViewAndGuidsRequest getTodosByViewAndGuidsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getTodosByViewAndGuidsRequest.guids);
            if (getTodosByViewAndGuidsRequest.todo_view != null) {
                TodoListView.Type.ADAPTER.encodeWithTag(protoWriter, 2, getTodosByViewAndGuidsRequest.todo_view);
            }
            if (getTodosByViewAndGuidsRequest.by_view_type != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getTodosByViewAndGuidsRequest.by_view_type);
            }
            protoWriter.writeBytes(getTodosByViewAndGuidsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodosByViewAndGuidsRequest$a */
    public static final class C19563a extends Message.Builder<GetTodosByViewAndGuidsRequest, C19563a> {

        /* renamed from: a */
        public List<String> f47911a = Internal.newMutableList();

        /* renamed from: b */
        public TodoListView.Type f47912b;

        /* renamed from: c */
        public Boolean f47913c;

        /* renamed from: a */
        public GetTodosByViewAndGuidsRequest build() {
            return new GetTodosByViewAndGuidsRequest(this.f47911a, this.f47912b, this.f47913c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19563a mo66447a(TodoListView.Type type) {
            this.f47912b = type;
            return this;
        }

        /* renamed from: a */
        public C19563a mo66448a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f47911a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19563a newBuilder() {
        C19563a aVar = new C19563a();
        aVar.f47911a = Internal.copyOf("guids", this.guids);
        aVar.f47912b = this.todo_view;
        aVar.f47913c = this.by_view_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "GetTodosByViewAndGuidsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.guids.isEmpty()) {
            sb.append(", guids=");
            sb.append(this.guids);
        }
        if (this.todo_view != null) {
            sb.append(", todo_view=");
            sb.append(this.todo_view);
        }
        if (this.by_view_type != null) {
            sb.append(", by_view_type=");
            sb.append(this.by_view_type);
        }
        StringBuilder replace = sb.replace(0, 2, "GetTodosByViewAndGuidsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetTodosByViewAndGuidsRequest(List<String> list, TodoListView.Type type, Boolean bool) {
        this(list, type, bool, ByteString.EMPTY);
    }

    public GetTodosByViewAndGuidsRequest(List<String> list, TodoListView.Type type, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.guids = Internal.immutableCopyOf("guids", list);
        this.todo_view = type;
        this.by_view_type = bool;
    }
}
