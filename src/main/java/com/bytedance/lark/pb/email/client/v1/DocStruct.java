package com.bytedance.lark.pb.email.client.v1;

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

public final class DocStruct extends Message<DocStruct, C16604a> {
    public static final ProtoAdapter<DocStruct> ADAPTER = new C16605b();
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Long DEFAULT_OWNER_ID = 0L;
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String abstract_;
    public final Long create_time;
    public final String icon_key;
    public final String key;
    public final String name;
    public final Long owner_id;
    public final String owner_name;
    public final Type type;
    public final Long update_time;
    public final String url;
    public final List<Permission> user_perm;

    public enum Permission implements WireEnum {
        DISABLE(0),
        VIEW(1),
        EDIT(4);
        
        public static final ProtoAdapter<Permission> ADAPTER = ProtoAdapter.newEnumAdapter(Permission.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Permission fromValue(int i) {
            if (i == 0) {
                return DISABLE;
            }
            if (i == 1) {
                return VIEW;
            }
            if (i != 4) {
                return null;
            }
            return EDIT;
        }

        private Permission(int i) {
            this.value = i;
        }
    }

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

    /* renamed from: com.bytedance.lark.pb.email.client.v1.DocStruct$b */
    private static final class C16605b extends ProtoAdapter<DocStruct> {
        C16605b() {
            super(FieldEncoding.LENGTH_DELIMITED, DocStruct.class);
        }

        /* renamed from: a */
        public int encodedSize(DocStruct docStruct) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10 = 0;
            if (docStruct.key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, docStruct.key);
            } else {
                i = 0;
            }
            if (docStruct.url != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, docStruct.url);
            } else {
                i2 = 0;
            }
            int i11 = i + i2;
            if (docStruct.type != null) {
                i3 = Type.ADAPTER.encodedSizeWithTag(3, docStruct.type);
            } else {
                i3 = 0;
            }
            int i12 = i11 + i3;
            if (docStruct.name != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, docStruct.name);
            } else {
                i4 = 0;
            }
            int i13 = i12 + i4;
            if (docStruct.icon_key != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, docStruct.icon_key);
            } else {
                i5 = 0;
            }
            int i14 = i13 + i5;
            if (docStruct.abstract_ != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, docStruct.abstract_);
            } else {
                i6 = 0;
            }
            int i15 = i14 + i6;
            if (docStruct.create_time != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(7, docStruct.create_time);
            } else {
                i7 = 0;
            }
            int i16 = i15 + i7;
            if (docStruct.update_time != null) {
                i8 = ProtoAdapter.INT64.encodedSizeWithTag(8, docStruct.update_time);
            } else {
                i8 = 0;
            }
            int i17 = i16 + i8;
            if (docStruct.owner_name != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(9, docStruct.owner_name);
            } else {
                i9 = 0;
            }
            int i18 = i17 + i9;
            if (docStruct.owner_id != null) {
                i10 = ProtoAdapter.INT64.encodedSizeWithTag(10, docStruct.owner_id);
            }
            return i18 + i10 + Permission.ADAPTER.asRepeated().encodedSizeWithTag(11, docStruct.user_perm) + docStruct.unknownFields().size();
        }

        /* renamed from: a */
        public DocStruct decode(ProtoReader protoReader) throws IOException {
            C16604a aVar = new C16604a();
            aVar.f42984a = "";
            aVar.f42985b = "";
            aVar.f42986c = Type.UNKNOWN;
            aVar.f42987d = "";
            aVar.f42988e = "";
            aVar.f42989f = "";
            aVar.f42990g = 0L;
            aVar.f42991h = 0L;
            aVar.f42992i = "";
            aVar.f42993j = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f42984a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f42985b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f42986c = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f42987d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f42988e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f42989f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f42990g = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            aVar.f42991h = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 9:
                            aVar.f42992i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f42993j = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 11:
                            try {
                                aVar.f42994k.add(Permission.ADAPTER.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, DocStruct docStruct) throws IOException {
            if (docStruct.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, docStruct.key);
            }
            if (docStruct.url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, docStruct.url);
            }
            if (docStruct.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 3, docStruct.type);
            }
            if (docStruct.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, docStruct.name);
            }
            if (docStruct.icon_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, docStruct.icon_key);
            }
            if (docStruct.abstract_ != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, docStruct.abstract_);
            }
            if (docStruct.create_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, docStruct.create_time);
            }
            if (docStruct.update_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, docStruct.update_time);
            }
            if (docStruct.owner_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, docStruct.owner_name);
            }
            if (docStruct.owner_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 10, docStruct.owner_id);
            }
            Permission.ADAPTER.asRepeated().encodeWithTag(protoWriter, 11, docStruct.user_perm);
            protoWriter.writeBytes(docStruct.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.DocStruct$a */
    public static final class C16604a extends Message.Builder<DocStruct, C16604a> {

        /* renamed from: a */
        public String f42984a;

        /* renamed from: b */
        public String f42985b;

        /* renamed from: c */
        public Type f42986c;

        /* renamed from: d */
        public String f42987d;

        /* renamed from: e */
        public String f42988e;

        /* renamed from: f */
        public String f42989f;

        /* renamed from: g */
        public Long f42990g;

        /* renamed from: h */
        public Long f42991h;

        /* renamed from: i */
        public String f42992i;

        /* renamed from: j */
        public Long f42993j;

        /* renamed from: k */
        public List<Permission> f42994k = Internal.newMutableList();

        /* renamed from: a */
        public DocStruct build() {
            return new DocStruct(this.f42984a, this.f42985b, this.f42986c, this.f42987d, this.f42988e, this.f42989f, this.f42990g, this.f42991h, this.f42992i, this.f42993j, this.f42994k, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16604a newBuilder() {
        C16604a aVar = new C16604a();
        aVar.f42984a = this.key;
        aVar.f42985b = this.url;
        aVar.f42986c = this.type;
        aVar.f42987d = this.name;
        aVar.f42988e = this.icon_key;
        aVar.f42989f = this.abstract_;
        aVar.f42990g = this.create_time;
        aVar.f42991h = this.update_time;
        aVar.f42992i = this.owner_name;
        aVar.f42993j = this.owner_id;
        aVar.f42994k = Internal.copyOf("user_perm", this.user_perm);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "DocStruct");
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
        if (!this.user_perm.isEmpty()) {
            sb.append(", user_perm=");
            sb.append(this.user_perm);
        }
        StringBuilder replace = sb.replace(0, 2, "DocStruct{");
        replace.append('}');
        return replace.toString();
    }

    public DocStruct(String str, String str2, Type type2, String str3, String str4, String str5, Long l, Long l2, String str6, Long l3, List<Permission> list) {
        this(str, str2, type2, str3, str4, str5, l, l2, str6, l3, list, ByteString.EMPTY);
    }

    public DocStruct(String str, String str2, Type type2, String str3, String str4, String str5, Long l, Long l2, String str6, Long l3, List<Permission> list, ByteString byteString) {
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
        this.user_perm = Internal.immutableCopyOf("user_perm", list);
    }
}
