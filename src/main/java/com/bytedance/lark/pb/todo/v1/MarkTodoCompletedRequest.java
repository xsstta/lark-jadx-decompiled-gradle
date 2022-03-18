package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class MarkTodoCompletedRequest extends Message<MarkTodoCompletedRequest, C19585a> {
    public static final ProtoAdapter<MarkTodoCompletedRequest> ADAPTER = new C19586b();
    public static final Boolean DEFAULT_IS_COMPLETED = false;
    public static final TodoSource DEFAULT_SOURCE = TodoSource.UNKNOWN_SOURCE;
    public static final Type DEFAULT_TYPE = Type.USER;
    private static final long serialVersionUID = 0;
    public final String guid;
    public final Boolean is_completed;
    public final TodoSource source;
    public final List<String> target_user_ids;
    public final Type type;

    public enum Type implements WireEnum {
        Todo(1),
        USER(2);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 1) {
                return Todo;
            }
            if (i != 2) {
                return null;
            }
            return USER;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.MarkTodoCompletedRequest$b */
    private static final class C19586b extends ProtoAdapter<MarkTodoCompletedRequest> {
        C19586b() {
            super(FieldEncoding.LENGTH_DELIMITED, MarkTodoCompletedRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MarkTodoCompletedRequest markTodoCompletedRequest) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (markTodoCompletedRequest.guid != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, markTodoCompletedRequest.guid);
            } else {
                i = 0;
            }
            if (markTodoCompletedRequest.is_completed != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, markTodoCompletedRequest.is_completed);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (markTodoCompletedRequest.source != null) {
                i3 = TodoSource.ADAPTER.encodedSizeWithTag(3, markTodoCompletedRequest.source);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (markTodoCompletedRequest.type != null) {
                i4 = Type.ADAPTER.encodedSizeWithTag(4, markTodoCompletedRequest.type);
            }
            return i6 + i4 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(5, markTodoCompletedRequest.target_user_ids) + markTodoCompletedRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MarkTodoCompletedRequest decode(ProtoReader protoReader) throws IOException {
            C19585a aVar = new C19585a();
            aVar.f47934a = "";
            aVar.f47935b = false;
            aVar.f47936c = TodoSource.UNKNOWN_SOURCE;
            aVar.f47937d = Type.USER;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47934a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f47935b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f47936c = TodoSource.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 4) {
                    try {
                        aVar.f47937d = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47938e.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MarkTodoCompletedRequest markTodoCompletedRequest) throws IOException {
            if (markTodoCompletedRequest.guid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, markTodoCompletedRequest.guid);
            }
            if (markTodoCompletedRequest.is_completed != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, markTodoCompletedRequest.is_completed);
            }
            if (markTodoCompletedRequest.source != null) {
                TodoSource.ADAPTER.encodeWithTag(protoWriter, 3, markTodoCompletedRequest.source);
            }
            if (markTodoCompletedRequest.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 4, markTodoCompletedRequest.type);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 5, markTodoCompletedRequest.target_user_ids);
            protoWriter.writeBytes(markTodoCompletedRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19585a newBuilder() {
        C19585a aVar = new C19585a();
        aVar.f47934a = this.guid;
        aVar.f47935b = this.is_completed;
        aVar.f47936c = this.source;
        aVar.f47937d = this.type;
        aVar.f47938e = Internal.copyOf("target_user_ids", this.target_user_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.MarkTodoCompletedRequest$a */
    public static final class C19585a extends Message.Builder<MarkTodoCompletedRequest, C19585a> {

        /* renamed from: a */
        public String f47934a;

        /* renamed from: b */
        public Boolean f47935b;

        /* renamed from: c */
        public TodoSource f47936c;

        /* renamed from: d */
        public Type f47937d;

        /* renamed from: e */
        public List<String> f47938e = Internal.newMutableList();

        /* renamed from: a */
        public MarkTodoCompletedRequest build() {
            return new MarkTodoCompletedRequest(this.f47934a, this.f47935b, this.f47936c, this.f47937d, this.f47938e, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19585a mo66501a(Type type) {
            this.f47937d = type;
            return this;
        }

        /* renamed from: a */
        public C19585a mo66502a(TodoSource todoSource) {
            this.f47936c = todoSource;
            return this;
        }

        /* renamed from: a */
        public C19585a mo66503a(Boolean bool) {
            this.f47935b = bool;
            return this;
        }

        /* renamed from: a */
        public C19585a mo66504a(String str) {
            this.f47934a = str;
            return this;
        }

        /* renamed from: a */
        public C19585a mo66505a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f47938e = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "MarkTodoCompletedRequest");
        StringBuilder sb = new StringBuilder();
        if (this.guid != null) {
            sb.append(", guid=");
            sb.append(this.guid);
        }
        if (this.is_completed != null) {
            sb.append(", is_completed=");
            sb.append(this.is_completed);
        }
        if (this.source != null) {
            sb.append(", source=");
            sb.append(this.source);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (!this.target_user_ids.isEmpty()) {
            sb.append(", target_user_ids=");
            sb.append(this.target_user_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "MarkTodoCompletedRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MarkTodoCompletedRequest(String str, Boolean bool, TodoSource todoSource, Type type2, List<String> list) {
        this(str, bool, todoSource, type2, list, ByteString.EMPTY);
    }

    public MarkTodoCompletedRequest(String str, Boolean bool, TodoSource todoSource, Type type2, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.guid = str;
        this.is_completed = bool;
        this.source = todoSource;
        this.type = type2;
        this.target_user_ids = Internal.immutableCopyOf("target_user_ids", list);
    }
}
