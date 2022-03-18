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

public final class TodoListViewSetting extends Message<TodoListViewSetting, C19657a> {
    public static final ProtoAdapter<TodoListViewSetting> ADAPTER = new C19658b();
    public static final TodoSortType DEFAULT_SORT_TYPE = TodoSortType.UNKNOWN;
    public static final TodoListView.Type DEFAULT_VIEW = TodoListView.Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final TodoSortType sort_type;
    public final TodoListView.Type view;

    /* renamed from: com.bytedance.lark.pb.todo.v1.TodoListViewSetting$b */
    private static final class C19658b extends ProtoAdapter<TodoListViewSetting> {
        C19658b() {
            super(FieldEncoding.LENGTH_DELIMITED, TodoListViewSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(TodoListViewSetting todoListViewSetting) {
            int i;
            int i2 = 0;
            if (todoListViewSetting.view != null) {
                i = TodoListView.Type.ADAPTER.encodedSizeWithTag(1, todoListViewSetting.view);
            } else {
                i = 0;
            }
            if (todoListViewSetting.sort_type != null) {
                i2 = TodoSortType.ADAPTER.encodedSizeWithTag(2, todoListViewSetting.sort_type);
            }
            return i + i2 + todoListViewSetting.unknownFields().size();
        }

        /* renamed from: a */
        public TodoListViewSetting decode(ProtoReader protoReader) throws IOException {
            C19657a aVar = new C19657a();
            aVar.f48093a = TodoListView.Type.UNKNOWN;
            aVar.f48094b = TodoSortType.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f48093a = TodoListView.Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f48094b = TodoSortType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TodoListViewSetting todoListViewSetting) throws IOException {
            if (todoListViewSetting.view != null) {
                TodoListView.Type.ADAPTER.encodeWithTag(protoWriter, 1, todoListViewSetting.view);
            }
            if (todoListViewSetting.sort_type != null) {
                TodoSortType.ADAPTER.encodeWithTag(protoWriter, 2, todoListViewSetting.sort_type);
            }
            protoWriter.writeBytes(todoListViewSetting.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.TodoListViewSetting$a */
    public static final class C19657a extends Message.Builder<TodoListViewSetting, C19657a> {

        /* renamed from: a */
        public TodoListView.Type f48093a;

        /* renamed from: b */
        public TodoSortType f48094b;

        /* renamed from: a */
        public TodoListViewSetting build() {
            return new TodoListViewSetting(this.f48093a, this.f48094b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19657a newBuilder() {
        C19657a aVar = new C19657a();
        aVar.f48093a = this.view;
        aVar.f48094b = this.sort_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "TodoListViewSetting");
        StringBuilder sb = new StringBuilder();
        if (this.view != null) {
            sb.append(", view=");
            sb.append(this.view);
        }
        if (this.sort_type != null) {
            sb.append(", sort_type=");
            sb.append(this.sort_type);
        }
        StringBuilder replace = sb.replace(0, 2, "TodoListViewSetting{");
        replace.append('}');
        return replace.toString();
    }

    public TodoListViewSetting(TodoListView.Type type, TodoSortType todoSortType) {
        this(type, todoSortType, ByteString.EMPTY);
    }

    public TodoListViewSetting(TodoListView.Type type, TodoSortType todoSortType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.view = type;
        this.sort_type = todoSortType;
    }
}
