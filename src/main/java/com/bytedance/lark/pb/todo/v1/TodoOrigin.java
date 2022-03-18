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
import java.util.Map;
import okio.ByteString;

public final class TodoOrigin extends Message<TodoOrigin, C19659a> {
    public static final ProtoAdapter<TodoOrigin> ADAPTER = new C19660b();
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final TodoSourceBlock block;
    public final String display_i18n_name;
    public final TodoSourceHref href;
    public final Map<String, String> platform_i18n_name;
    public final Type type;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        BLOCK(1),
        HREF(2);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return BLOCK;
            }
            if (i != 2) {
                return null;
            }
            return HREF;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.TodoOrigin$a */
    public static final class C19659a extends Message.Builder<TodoOrigin, C19659a> {

        /* renamed from: a */
        public Type f48095a;

        /* renamed from: b */
        public Map<String, String> f48096b = Internal.newMutableMap();

        /* renamed from: c */
        public String f48097c;

        /* renamed from: d */
        public TodoSourceBlock f48098d;

        /* renamed from: e */
        public TodoSourceHref f48099e;

        /* renamed from: a */
        public TodoOrigin build() {
            return new TodoOrigin(this.f48095a, this.f48096b, this.f48097c, this.f48098d, this.f48099e, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19659a mo66688a(Type type) {
            this.f48095a = type;
            return this;
        }

        /* renamed from: a */
        public C19659a mo66689a(TodoSourceBlock todoSourceBlock) {
            this.f48098d = todoSourceBlock;
            this.f48099e = null;
            return this;
        }

        /* renamed from: a */
        public C19659a mo66690a(TodoSourceHref todoSourceHref) {
            this.f48099e = todoSourceHref;
            this.f48098d = null;
            return this;
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.TodoOrigin$b */
    private static final class C19660b extends ProtoAdapter<TodoOrigin> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f48100a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C19660b() {
            super(FieldEncoding.LENGTH_DELIMITED, TodoOrigin.class);
        }

        /* renamed from: a */
        public int encodedSize(TodoOrigin todoOrigin) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (todoOrigin.type != null) {
                i = Type.ADAPTER.encodedSizeWithTag(1, todoOrigin.type);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + this.f48100a.encodedSizeWithTag(3, todoOrigin.platform_i18n_name);
            if (todoOrigin.display_i18n_name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(150, todoOrigin.display_i18n_name);
            } else {
                i2 = 0;
            }
            int i5 = encodedSizeWithTag + i2;
            if (todoOrigin.block != null) {
                i3 = TodoSourceBlock.ADAPTER.encodedSizeWithTag(100, todoOrigin.block);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (todoOrigin.href != null) {
                i4 = TodoSourceHref.ADAPTER.encodedSizeWithTag(101, todoOrigin.href);
            }
            return i6 + i4 + todoOrigin.unknownFields().size();
        }

        /* renamed from: a */
        public TodoOrigin decode(ProtoReader protoReader) throws IOException {
            C19659a aVar = new C19659a();
            aVar.f48095a = Type.UNKNOWN;
            aVar.f48097c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f48095a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f48096b.putAll(this.f48100a.decode(protoReader));
                } else if (nextTag == 150) {
                    aVar.f48097c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 100) {
                    aVar.mo66689a(TodoSourceBlock.ADAPTER.decode(protoReader));
                } else if (nextTag != 101) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.mo66690a(TodoSourceHref.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TodoOrigin todoOrigin) throws IOException {
            if (todoOrigin.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 1, todoOrigin.type);
            }
            this.f48100a.encodeWithTag(protoWriter, 3, todoOrigin.platform_i18n_name);
            if (todoOrigin.display_i18n_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 150, todoOrigin.display_i18n_name);
            }
            if (todoOrigin.block != null) {
                TodoSourceBlock.ADAPTER.encodeWithTag(protoWriter, 100, todoOrigin.block);
            }
            if (todoOrigin.href != null) {
                TodoSourceHref.ADAPTER.encodeWithTag(protoWriter, 101, todoOrigin.href);
            }
            protoWriter.writeBytes(todoOrigin.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19659a newBuilder() {
        C19659a aVar = new C19659a();
        aVar.f48095a = this.type;
        aVar.f48096b = Internal.copyOf("platform_i18n_name", this.platform_i18n_name);
        aVar.f48097c = this.display_i18n_name;
        aVar.f48098d = this.block;
        aVar.f48099e = this.href;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "TodoOrigin");
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (!this.platform_i18n_name.isEmpty()) {
            sb.append(", platform_i18n_name=");
            sb.append(this.platform_i18n_name);
        }
        if (this.display_i18n_name != null) {
            sb.append(", display_i18n_name=");
            sb.append(this.display_i18n_name);
        }
        if (this.block != null) {
            sb.append(", block=");
            sb.append(this.block);
        }
        if (this.href != null) {
            sb.append(", href=");
            sb.append(this.href);
        }
        StringBuilder replace = sb.replace(0, 2, "TodoOrigin{");
        replace.append('}');
        return replace.toString();
    }

    public TodoOrigin(Type type2, Map<String, String> map, String str, TodoSourceBlock todoSourceBlock, TodoSourceHref todoSourceHref) {
        this(type2, map, str, todoSourceBlock, todoSourceHref, ByteString.EMPTY);
    }

    public TodoOrigin(Type type2, Map<String, String> map, String str, TodoSourceBlock todoSourceBlock, TodoSourceHref todoSourceHref, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(todoSourceBlock, todoSourceHref) <= 1) {
            this.type = type2;
            this.platform_i18n_name = Internal.immutableCopyOf("platform_i18n_name", map);
            this.display_i18n_name = str;
            this.block = todoSourceBlock;
            this.href = todoSourceHref;
            return;
        }
        throw new IllegalArgumentException("at most one of block, href may be non-null");
    }
}
