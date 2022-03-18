package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class EntitySchema extends Message<EntitySchema, C15602a> {
    public static final ProtoAdapter<EntitySchema> ADAPTER = new C15603b();
    public static final IncompatibleLevel DEFAULT_INCOMPATIBLE_LEVEL = IncompatibleLevel.SHOW_HINT;
    public static final ItemUILevel DEFAULT_UI_LEVEL = ItemUILevel.HIDE;
    private static final long serialVersionUID = 0;
    public final String app_link;
    public final IncompatibleLevel incompatible_level;
    public final ItemUILevel ui_level;
    public final String unique_name;

    public enum ItemUILevel implements WireEnum {
        HIDE(1),
        READONLY(2),
        EDITABLE(3);
        
        public static final ProtoAdapter<ItemUILevel> ADAPTER = ProtoAdapter.newEnumAdapter(ItemUILevel.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ItemUILevel fromValue(int i) {
            if (i == 1) {
                return HIDE;
            }
            if (i == 2) {
                return READONLY;
            }
            if (i != 3) {
                return null;
            }
            return EDITABLE;
        }

        private ItemUILevel(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.EntitySchema$b */
    private static final class C15603b extends ProtoAdapter<EntitySchema> {
        C15603b() {
            super(FieldEncoding.LENGTH_DELIMITED, EntitySchema.class);
        }

        /* renamed from: a */
        public int encodedSize(EntitySchema entitySchema) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (entitySchema.unique_name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, entitySchema.unique_name);
            } else {
                i = 0;
            }
            if (entitySchema.ui_level != null) {
                i2 = ItemUILevel.ADAPTER.encodedSizeWithTag(2, entitySchema.ui_level);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (entitySchema.app_link != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, entitySchema.app_link);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (entitySchema.incompatible_level != null) {
                i4 = IncompatibleLevel.ADAPTER.encodedSizeWithTag(4, entitySchema.incompatible_level);
            }
            return i6 + i4 + entitySchema.unknownFields().size();
        }

        /* renamed from: a */
        public EntitySchema decode(ProtoReader protoReader) throws IOException {
            C15602a aVar = new C15602a();
            aVar.f41331a = "";
            aVar.f41332b = ItemUILevel.HIDE;
            aVar.f41333c = "";
            aVar.f41334d = IncompatibleLevel.SHOW_HINT;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41331a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f41332b = ItemUILevel.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f41333c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f41334d = IncompatibleLevel.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, EntitySchema entitySchema) throws IOException {
            if (entitySchema.unique_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, entitySchema.unique_name);
            }
            if (entitySchema.ui_level != null) {
                ItemUILevel.ADAPTER.encodeWithTag(protoWriter, 2, entitySchema.ui_level);
            }
            if (entitySchema.app_link != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, entitySchema.app_link);
            }
            if (entitySchema.incompatible_level != null) {
                IncompatibleLevel.ADAPTER.encodeWithTag(protoWriter, 4, entitySchema.incompatible_level);
            }
            protoWriter.writeBytes(entitySchema.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.EntitySchema$a */
    public static final class C15602a extends Message.Builder<EntitySchema, C15602a> {

        /* renamed from: a */
        public String f41331a;

        /* renamed from: b */
        public ItemUILevel f41332b;

        /* renamed from: c */
        public String f41333c;

        /* renamed from: d */
        public IncompatibleLevel f41334d;

        /* renamed from: a */
        public EntitySchema build() {
            return new EntitySchema(this.f41331a, this.f41332b, this.f41333c, this.f41334d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15602a mo56574a(ItemUILevel itemUILevel) {
            this.f41332b = itemUILevel;
            return this;
        }

        /* renamed from: b */
        public C15602a mo56577b(String str) {
            this.f41333c = str;
            return this;
        }

        /* renamed from: a */
        public C15602a mo56575a(String str) {
            this.f41331a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15602a newBuilder() {
        C15602a aVar = new C15602a();
        aVar.f41331a = this.unique_name;
        aVar.f41332b = this.ui_level;
        aVar.f41333c = this.app_link;
        aVar.f41334d = this.incompatible_level;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "EntitySchema");
        StringBuilder sb = new StringBuilder();
        if (this.unique_name != null) {
            sb.append(", unique_name=");
            sb.append(this.unique_name);
        }
        if (this.ui_level != null) {
            sb.append(", ui_level=");
            sb.append(this.ui_level);
        }
        if (this.app_link != null) {
            sb.append(", app_link=");
            sb.append(this.app_link);
        }
        if (this.incompatible_level != null) {
            sb.append(", incompatible_level=");
            sb.append(this.incompatible_level);
        }
        StringBuilder replace = sb.replace(0, 2, "EntitySchema{");
        replace.append('}');
        return replace.toString();
    }

    public EntitySchema(String str, ItemUILevel itemUILevel, String str2, IncompatibleLevel incompatibleLevel) {
        this(str, itemUILevel, str2, incompatibleLevel, ByteString.EMPTY);
    }

    public EntitySchema(String str, ItemUILevel itemUILevel, String str2, IncompatibleLevel incompatibleLevel, ByteString byteString) {
        super(ADAPTER, byteString);
        this.unique_name = str;
        this.ui_level = itemUILevel;
        this.app_link = str2;
        this.incompatible_level = incompatibleLevel;
    }
}
