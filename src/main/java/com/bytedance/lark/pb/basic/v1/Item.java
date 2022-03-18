package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class Item extends Message<Item, C15031a> {
    public static final ProtoAdapter<Item> ADAPTER = new C15032b();
    public static final Type DEFAULT_ENTITY_TYPE = Type.UNKNOWN;
    public static final Long DEFAULT_ID = 0L;
    public static final Boolean DEFAULT_IS_HIDDEN = false;
    public static final Long DEFAULT_ORDER_WEIGHT = 0L;
    public static final Long DEFAULT_PARENT_ID = 0L;
    public static final Long DEFAULT_VERSION = 0L;
    private static final long serialVersionUID = 0;
    public final String entity_id;
    public final Type entity_type;
    public final Long id;
    public final Boolean is_hidden;
    public final String name_weight;
    public final Long order_weight;
    public final Long parent_id;
    public final Long version;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        CHAT(1),
        TEAM(2);
        
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
                return CHAT;
            }
            if (i != 2) {
                return null;
            }
            return TEAM;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Item$b */
    private static final class C15032b extends ProtoAdapter<Item> {
        C15032b() {
            super(FieldEncoding.LENGTH_DELIMITED, Item.class);
        }

        /* renamed from: a */
        public int encodedSize(Item item) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8 = 0;
            if (item.id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, item.id);
            } else {
                i = 0;
            }
            if (item.entity_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, item.entity_id);
            } else {
                i2 = 0;
            }
            int i9 = i + i2;
            if (item.entity_type != null) {
                i3 = Type.ADAPTER.encodedSizeWithTag(3, item.entity_type);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (item.parent_id != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, item.parent_id);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (item.order_weight != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, item.order_weight);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (item.name_weight != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, item.name_weight);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (item.version != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(6, item.version);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (item.is_hidden != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(8, item.is_hidden);
            }
            return i14 + i8 + item.unknownFields().size();
        }

        /* renamed from: a */
        public Item decode(ProtoReader protoReader) throws IOException {
            C15031a aVar = new C15031a();
            aVar.f39764a = 0L;
            aVar.f39765b = "";
            aVar.f39766c = Type.UNKNOWN;
            aVar.f39767d = 0L;
            aVar.f39768e = 0L;
            aVar.f39769f = "";
            aVar.f39770g = 0L;
            aVar.f39771h = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f39764a = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            aVar.f39765b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f39766c = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f39767d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            aVar.f39768e = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            aVar.f39770g = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            aVar.f39769f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f39771h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Item item) throws IOException {
            if (item.id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, item.id);
            }
            if (item.entity_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, item.entity_id);
            }
            if (item.entity_type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 3, item.entity_type);
            }
            if (item.parent_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, item.parent_id);
            }
            if (item.order_weight != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, item.order_weight);
            }
            if (item.name_weight != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, item.name_weight);
            }
            if (item.version != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, item.version);
            }
            if (item.is_hidden != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, item.is_hidden);
            }
            protoWriter.writeBytes(item.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Item$a */
    public static final class C15031a extends Message.Builder<Item, C15031a> {

        /* renamed from: a */
        public Long f39764a;

        /* renamed from: b */
        public String f39765b;

        /* renamed from: c */
        public Type f39766c;

        /* renamed from: d */
        public Long f39767d;

        /* renamed from: e */
        public Long f39768e;

        /* renamed from: f */
        public String f39769f;

        /* renamed from: g */
        public Long f39770g;

        /* renamed from: h */
        public Boolean f39771h;

        /* renamed from: a */
        public Item build() {
            return new Item(this.f39764a, this.f39765b, this.f39766c, this.f39767d, this.f39768e, this.f39769f, this.f39770g, this.f39771h, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15031a newBuilder() {
        C15031a aVar = new C15031a();
        aVar.f39764a = this.id;
        aVar.f39765b = this.entity_id;
        aVar.f39766c = this.entity_type;
        aVar.f39767d = this.parent_id;
        aVar.f39768e = this.order_weight;
        aVar.f39769f = this.name_weight;
        aVar.f39770g = this.version;
        aVar.f39771h = this.is_hidden;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "Item");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.entity_id != null) {
            sb.append(", entity_id=");
            sb.append(this.entity_id);
        }
        if (this.entity_type != null) {
            sb.append(", entity_type=");
            sb.append(this.entity_type);
        }
        if (this.parent_id != null) {
            sb.append(", parent_id=");
            sb.append(this.parent_id);
        }
        if (this.order_weight != null) {
            sb.append(", order_weight=");
            sb.append(this.order_weight);
        }
        if (this.name_weight != null) {
            sb.append(", name_weight=");
            sb.append(this.name_weight);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (this.is_hidden != null) {
            sb.append(", is_hidden=");
            sb.append(this.is_hidden);
        }
        StringBuilder replace = sb.replace(0, 2, "Item{");
        replace.append('}');
        return replace.toString();
    }

    public Item(Long l, String str, Type type, Long l2, Long l3, String str2, Long l4, Boolean bool) {
        this(l, str, type, l2, l3, str2, l4, bool, ByteString.EMPTY);
    }

    public Item(Long l, String str, Type type, Long l2, Long l3, String str2, Long l4, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = l;
        this.entity_id = str;
        this.entity_type = type;
        this.parent_id = l2;
        this.order_weight = l3;
        this.name_weight = str2;
        this.version = l4;
        this.is_hidden = bool;
    }
}
