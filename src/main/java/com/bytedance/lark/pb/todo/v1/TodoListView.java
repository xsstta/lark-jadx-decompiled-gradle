package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class TodoListView extends Message<TodoListView, C19655a> {
    public static final ProtoAdapter<TodoListView> ADAPTER = new C19656b();
    public static final Integer DEFAULT_CHILD_COUNT = 0;
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Integer child_count;
    public final Type type;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        ALL(1),
        ASSIGN_FROM_ME(2),
        ASSIGN_TO_ME(3),
        COMPLETED(4),
        DELETED(5),
        FOLLOWED(6),
        FROM_DOC(7);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return ALL;
                case 2:
                    return ASSIGN_FROM_ME;
                case 3:
                    return ASSIGN_TO_ME;
                case 4:
                    return COMPLETED;
                case 5:
                    return DELETED;
                case 6:
                    return FOLLOWED;
                case 7:
                    return FROM_DOC;
                default:
                    return null;
            }
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.TodoListView$b */
    private static final class C19656b extends ProtoAdapter<TodoListView> {
        C19656b() {
            super(FieldEncoding.LENGTH_DELIMITED, TodoListView.class);
        }

        /* renamed from: a */
        public int encodedSize(TodoListView todoListView) {
            int i;
            int i2 = 0;
            if (todoListView.type != null) {
                i = Type.ADAPTER.encodedSizeWithTag(1, todoListView.type);
            } else {
                i = 0;
            }
            if (todoListView.child_count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, todoListView.child_count);
            }
            return i + i2 + todoListView.unknownFields().size();
        }

        /* renamed from: a */
        public TodoListView decode(ProtoReader protoReader) throws IOException {
            C19655a aVar = new C19655a();
            aVar.f48091a = Type.UNKNOWN;
            aVar.f48092b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f48091a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48092b = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TodoListView todoListView) throws IOException {
            if (todoListView.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 1, todoListView.type);
            }
            if (todoListView.child_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, todoListView.child_count);
            }
            protoWriter.writeBytes(todoListView.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.TodoListView$a */
    public static final class C19655a extends Message.Builder<TodoListView, C19655a> {

        /* renamed from: a */
        public Type f48091a;

        /* renamed from: b */
        public Integer f48092b;

        /* renamed from: a */
        public TodoListView build() {
            return new TodoListView(this.f48091a, this.f48092b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19655a newBuilder() {
        C19655a aVar = new C19655a();
        aVar.f48091a = this.type;
        aVar.f48092b = this.child_count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "TodoListView");
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.child_count != null) {
            sb.append(", child_count=");
            sb.append(this.child_count);
        }
        StringBuilder replace = sb.replace(0, 2, "TodoListView{");
        replace.append('}');
        return replace.toString();
    }

    public TodoListView(Type type2, Integer num) {
        this(type2, num, ByteString.EMPTY);
    }

    public TodoListView(Type type2, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.child_count = num;
    }
}
