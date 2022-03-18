package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
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

public final class Doc extends Message<Doc, C14868a> {
    public static final ProtoAdapter<Doc> ADAPTER = new C14869b();
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Long DEFAULT_OWNER_ID = 0L;
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String abstract_;
    public final Long create_time;
    public final Icon icon;
    public final String icon_key;
    public final String key;
    public final String name;
    public final Long owner_id;
    public final String owner_name;
    public final List<Tag> tags;
    public final Type type;
    public final Long update_time;
    public final String url;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        DOC(1),
        SHEET(2),
        BITABLE(3),
        MINDNOTE(4),
        FILE(5),
        SLIDE(6),
        WIKI(7),
        DOCX(8);
        
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
                    return DOC;
                case 2:
                    return SHEET;
                case 3:
                    return BITABLE;
                case 4:
                    return MINDNOTE;
                case 5:
                    return FILE;
                case 6:
                    return SLIDE;
                case 7:
                    return WIKI;
                case 8:
                    return DOCX;
                default:
                    return null;
            }
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Doc$b */
    private static final class C14869b extends ProtoAdapter<Doc> {
        C14869b() {
            super(FieldEncoding.LENGTH_DELIMITED, Doc.class);
        }

        /* renamed from: a */
        public int encodedSize(Doc doc) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11 = 0;
            if (doc.key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, doc.key);
            } else {
                i = 0;
            }
            if (doc.url != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, doc.url);
            } else {
                i2 = 0;
            }
            int i12 = i + i2;
            if (doc.type != null) {
                i3 = Type.ADAPTER.encodedSizeWithTag(3, doc.type);
            } else {
                i3 = 0;
            }
            int i13 = i12 + i3;
            if (doc.name != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, doc.name);
            } else {
                i4 = 0;
            }
            int i14 = i13 + i4;
            if (doc.icon_key != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, doc.icon_key);
            } else {
                i5 = 0;
            }
            int i15 = i14 + i5;
            if (doc.abstract_ != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, doc.abstract_);
            } else {
                i6 = 0;
            }
            int i16 = i15 + i6;
            if (doc.create_time != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(7, doc.create_time);
            } else {
                i7 = 0;
            }
            int i17 = i16 + i7;
            if (doc.update_time != null) {
                i8 = ProtoAdapter.INT64.encodedSizeWithTag(8, doc.update_time);
            } else {
                i8 = 0;
            }
            int i18 = i17 + i8;
            if (doc.owner_name != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(9, doc.owner_name);
            } else {
                i9 = 0;
            }
            int i19 = i18 + i9;
            if (doc.owner_id != null) {
                i10 = ProtoAdapter.INT64.encodedSizeWithTag(10, doc.owner_id);
            } else {
                i10 = 0;
            }
            int i20 = i19 + i10;
            if (doc.icon != null) {
                i11 = Icon.ADAPTER.encodedSizeWithTag(11, doc.icon);
            }
            return i20 + i11 + Tag.ADAPTER.asRepeated().encodedSizeWithTag(12, doc.tags) + doc.unknownFields().size();
        }

        /* renamed from: a */
        public Doc decode(ProtoReader protoReader) throws IOException {
            C14868a aVar = new C14868a();
            aVar.f39315a = "";
            aVar.f39316b = "";
            aVar.f39317c = Type.UNKNOWN;
            aVar.f39318d = "";
            aVar.f39319e = "";
            aVar.f39320f = "";
            aVar.f39321g = 0L;
            aVar.f39322h = 0L;
            aVar.f39323i = "";
            aVar.f39324j = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f39315a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f39316b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f39317c = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f39318d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f39319e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f39320f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f39321g = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            aVar.f39322h = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 9:
                            aVar.f39323i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f39324j = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 11:
                            aVar.f39325k = Icon.ADAPTER.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            try {
                                aVar.f39326l.add(Tag.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
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
        public void encode(ProtoWriter protoWriter, Doc doc) throws IOException {
            if (doc.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, doc.key);
            }
            if (doc.url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, doc.url);
            }
            if (doc.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 3, doc.type);
            }
            if (doc.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, doc.name);
            }
            if (doc.icon_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, doc.icon_key);
            }
            if (doc.abstract_ != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, doc.abstract_);
            }
            if (doc.create_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, doc.create_time);
            }
            if (doc.update_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, doc.update_time);
            }
            if (doc.owner_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, doc.owner_name);
            }
            if (doc.owner_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 10, doc.owner_id);
            }
            if (doc.icon != null) {
                Icon.ADAPTER.encodeWithTag(protoWriter, 11, doc.icon);
            }
            Tag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 12, doc.tags);
            protoWriter.writeBytes(doc.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Doc$a */
    public static final class C14868a extends Message.Builder<Doc, C14868a> {

        /* renamed from: a */
        public String f39315a;

        /* renamed from: b */
        public String f39316b;

        /* renamed from: c */
        public Type f39317c;

        /* renamed from: d */
        public String f39318d;

        /* renamed from: e */
        public String f39319e;

        /* renamed from: f */
        public String f39320f;

        /* renamed from: g */
        public Long f39321g;

        /* renamed from: h */
        public Long f39322h;

        /* renamed from: i */
        public String f39323i;

        /* renamed from: j */
        public Long f39324j;

        /* renamed from: k */
        public Icon f39325k;

        /* renamed from: l */
        public List<Tag> f39326l = Internal.newMutableList();

        /* renamed from: a */
        public Doc build() {
            return new Doc(this.f39315a, this.f39316b, this.f39317c, this.f39318d, this.f39319e, this.f39320f, this.f39321g, this.f39322h, this.f39323i, this.f39324j, this.f39325k, this.f39326l, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14868a newBuilder() {
        C14868a aVar = new C14868a();
        aVar.f39315a = this.key;
        aVar.f39316b = this.url;
        aVar.f39317c = this.type;
        aVar.f39318d = this.name;
        aVar.f39319e = this.icon_key;
        aVar.f39320f = this.abstract_;
        aVar.f39321g = this.create_time;
        aVar.f39322h = this.update_time;
        aVar.f39323i = this.owner_name;
        aVar.f39324j = this.owner_id;
        aVar.f39325k = this.icon;
        aVar.f39326l = Internal.copyOf("tags", this.tags);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "Doc");
        StringBuilder sb = new StringBuilder();
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.icon_key != null) {
            sb.append(", icon_key=");
            sb.append(this.icon_key);
        }
        if (this.abstract_ != null) {
            sb.append(", abstract=");
            sb.append(this.abstract_);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.update_time != null) {
            sb.append(", update_time=");
            sb.append(this.update_time);
        }
        if (this.owner_name != null) {
            sb.append(", owner_name=");
            sb.append(this.owner_name);
        }
        if (this.owner_id != null) {
            sb.append(", owner_id=");
            sb.append(this.owner_id);
        }
        if (this.icon != null) {
            sb.append(", icon=");
            sb.append(this.icon);
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        StringBuilder replace = sb.replace(0, 2, "Doc{");
        replace.append('}');
        return replace.toString();
    }

    public Doc(String str, String str2, Type type2, String str3, String str4, String str5, Long l, Long l2, String str6, Long l3, Icon icon2, List<Tag> list) {
        this(str, str2, type2, str3, str4, str5, l, l2, str6, l3, icon2, list, ByteString.EMPTY);
    }

    public Doc(String str, String str2, Type type2, String str3, String str4, String str5, Long l, Long l2, String str6, Long l3, Icon icon2, List<Tag> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.url = str2;
        this.type = type2;
        this.name = str3;
        this.icon_key = str4;
        this.abstract_ = str5;
        this.create_time = l;
        this.update_time = l2;
        this.owner_name = str6;
        this.owner_id = l3;
        this.icon = icon2;
        this.tags = Internal.immutableCopyOf("tags", list);
    }
}
