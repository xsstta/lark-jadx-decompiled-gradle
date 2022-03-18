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

public final class TodoBadgeConfig extends Message<TodoBadgeConfig, C19643a> {
    public static final ProtoAdapter<TodoBadgeConfig> ADAPTER = new C19644b();
    public static final Boolean DEFAULT_ENABLE = false;
    public static final BadgeType DEFAULT_TYPE = BadgeType.OVERDUE;
    private static final long serialVersionUID = 0;
    public final Boolean enable;
    public final BadgeType type;

    public enum BadgeType implements WireEnum {
        OVERDUE(0),
        OVERDUE_AND_TODAY(1);
        
        public static final ProtoAdapter<BadgeType> ADAPTER = ProtoAdapter.newEnumAdapter(BadgeType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static BadgeType fromValue(int i) {
            if (i == 0) {
                return OVERDUE;
            }
            if (i != 1) {
                return null;
            }
            return OVERDUE_AND_TODAY;
        }

        private BadgeType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.TodoBadgeConfig$b */
    private static final class C19644b extends ProtoAdapter<TodoBadgeConfig> {
        C19644b() {
            super(FieldEncoding.LENGTH_DELIMITED, TodoBadgeConfig.class);
        }

        /* renamed from: a */
        public int encodedSize(TodoBadgeConfig todoBadgeConfig) {
            int i;
            int i2 = 0;
            if (todoBadgeConfig.enable != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, todoBadgeConfig.enable);
            } else {
                i = 0;
            }
            if (todoBadgeConfig.type != null) {
                i2 = BadgeType.ADAPTER.encodedSizeWithTag(2, todoBadgeConfig.type);
            }
            return i + i2 + todoBadgeConfig.unknownFields().size();
        }

        /* renamed from: a */
        public TodoBadgeConfig decode(ProtoReader protoReader) throws IOException {
            C19643a aVar = new C19643a();
            aVar.f48059a = false;
            aVar.f48060b = BadgeType.OVERDUE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48059a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f48060b = BadgeType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TodoBadgeConfig todoBadgeConfig) throws IOException {
            if (todoBadgeConfig.enable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, todoBadgeConfig.enable);
            }
            if (todoBadgeConfig.type != null) {
                BadgeType.ADAPTER.encodeWithTag(protoWriter, 2, todoBadgeConfig.type);
            }
            protoWriter.writeBytes(todoBadgeConfig.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.TodoBadgeConfig$a */
    public static final class C19643a extends Message.Builder<TodoBadgeConfig, C19643a> {

        /* renamed from: a */
        public Boolean f48059a;

        /* renamed from: b */
        public BadgeType f48060b;

        /* renamed from: a */
        public TodoBadgeConfig build() {
            return new TodoBadgeConfig(this.f48059a, this.f48060b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19643a mo66648a(BadgeType badgeType) {
            this.f48060b = badgeType;
            return this;
        }

        /* renamed from: a */
        public C19643a mo66649a(Boolean bool) {
            this.f48059a = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19643a newBuilder() {
        C19643a aVar = new C19643a();
        aVar.f48059a = this.enable;
        aVar.f48060b = this.type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "TodoBadgeConfig");
        StringBuilder sb = new StringBuilder();
        if (this.enable != null) {
            sb.append(", enable=");
            sb.append(this.enable);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        StringBuilder replace = sb.replace(0, 2, "TodoBadgeConfig{");
        replace.append('}');
        return replace.toString();
    }

    public TodoBadgeConfig(Boolean bool, BadgeType badgeType) {
        this(bool, badgeType, ByteString.EMPTY);
    }

    public TodoBadgeConfig(Boolean bool, BadgeType badgeType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.enable = bool;
        this.type = badgeType;
    }
}
