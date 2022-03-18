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

public final class TodoReminder extends Message<TodoReminder, C19665a> {
    public static final ProtoAdapter<TodoReminder> ADAPTER = new C19666b();
    public static final Boolean DEFAULT_IS_ALL_DAY = false;
    public static final Long DEFAULT_TIME = 0L;
    public static final Type DEFAULT_TYPE = Type.ABSOLUTE;
    private static final long serialVersionUID = 0;
    public final Boolean is_all_day;
    public final Long time;
    public final Type type;

    public enum Type implements WireEnum {
        ABSOLUTE(1),
        RELATIVE(2),
        FLOATING(3);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 1) {
                return ABSOLUTE;
            }
            if (i == 2) {
                return RELATIVE;
            }
            if (i != 3) {
                return null;
            }
            return FLOATING;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.TodoReminder$b */
    private static final class C19666b extends ProtoAdapter<TodoReminder> {
        C19666b() {
            super(FieldEncoding.LENGTH_DELIMITED, TodoReminder.class);
        }

        /* renamed from: a */
        public int encodedSize(TodoReminder todoReminder) {
            int i;
            int i2;
            int i3 = 0;
            if (todoReminder.type != null) {
                i = Type.ADAPTER.encodedSizeWithTag(1, todoReminder.type);
            } else {
                i = 0;
            }
            if (todoReminder.time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, todoReminder.time);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (todoReminder.is_all_day != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, todoReminder.is_all_day);
            }
            return i4 + i3 + todoReminder.unknownFields().size();
        }

        /* renamed from: a */
        public TodoReminder decode(ProtoReader protoReader) throws IOException {
            C19665a aVar = new C19665a();
            aVar.f48106a = Type.ABSOLUTE;
            aVar.f48107b = 0L;
            aVar.f48108c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f48106a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f48107b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48108c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TodoReminder todoReminder) throws IOException {
            if (todoReminder.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 1, todoReminder.type);
            }
            if (todoReminder.time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, todoReminder.time);
            }
            if (todoReminder.is_all_day != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, todoReminder.is_all_day);
            }
            protoWriter.writeBytes(todoReminder.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.TodoReminder$a */
    public static final class C19665a extends Message.Builder<TodoReminder, C19665a> {

        /* renamed from: a */
        public Type f48106a;

        /* renamed from: b */
        public Long f48107b;

        /* renamed from: c */
        public Boolean f48108c;

        /* renamed from: a */
        public TodoReminder build() {
            return new TodoReminder(this.f48106a, this.f48107b, this.f48108c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19665a mo66704a(Type type) {
            this.f48106a = type;
            return this;
        }

        /* renamed from: a */
        public C19665a mo66705a(Long l) {
            this.f48107b = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19665a newBuilder() {
        C19665a aVar = new C19665a();
        aVar.f48106a = this.type;
        aVar.f48107b = this.time;
        aVar.f48108c = this.is_all_day;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "TodoReminder");
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.time != null) {
            sb.append(", time=");
            sb.append(this.time);
        }
        if (this.is_all_day != null) {
            sb.append(", is_all_day=");
            sb.append(this.is_all_day);
        }
        StringBuilder replace = sb.replace(0, 2, "TodoReminder{");
        replace.append('}');
        return replace.toString();
    }

    public TodoReminder(Type type2, Long l, Boolean bool) {
        this(type2, l, bool, ByteString.EMPTY);
    }

    public TodoReminder(Type type2, Long l, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.time = l;
        this.is_all_day = bool;
    }
}
