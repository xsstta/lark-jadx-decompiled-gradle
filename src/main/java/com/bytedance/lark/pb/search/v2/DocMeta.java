package com.bytedance.lark.pb.search.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Doc;
import com.bytedance.lark.pb.basic.v1.Icon;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class DocMeta extends Message<DocMeta, C18981a> {
    public static final ProtoAdapter<DocMeta> ADAPTER = new C18982b();
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Boolean DEFAULT_IS_CROSS_TENANT = false;
    public static final Long DEFAULT_LAST_OPEN_TIME = 0L;
    public static final Integer DEFAULT_POSITION = 0;
    public static final Integer DEFAULT_THREAD_CHAT_POSITION = 0;
    public static final Integer DEFAULT_THREAD_POSITION = 0;
    public static final Doc.Type DEFAULT_TYPE = Doc.Type.UNKNOWN;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final Long create_time;
    public final String edit_user_id;
    public final String edit_user_name;
    public final Icon icon;
    public final String id;
    public final Boolean is_cross_tenant;
    public final Long last_open_time;
    public final String message_id;
    public final String owner_id;
    public final String owner_name;
    public final Integer position;
    public final Integer thread_chat_position;
    public final String thread_id;
    public final Integer thread_position;
    public final Doc.Type type;
    public final Long update_time;
    public final String url;

    /* renamed from: com.bytedance.lark.pb.search.v2.DocMeta$b */
    private static final class C18982b extends ProtoAdapter<DocMeta> {
        C18982b() {
            super(FieldEncoding.LENGTH_DELIMITED, DocMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(DocMeta docMeta) {
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
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, docMeta.id);
            int i17 = 0;
            if (docMeta.type != null) {
                i = Doc.Type.ADAPTER.encodedSizeWithTag(2, docMeta.type);
            } else {
                i = 0;
            }
            int i18 = encodedSizeWithTag + i;
            if (docMeta.update_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, docMeta.update_time);
            } else {
                i2 = 0;
            }
            int i19 = i18 + i2;
            if (docMeta.url != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, docMeta.url);
            } else {
                i3 = 0;
            }
            int i20 = i19 + i3;
            if (docMeta.owner_name != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, docMeta.owner_name);
            } else {
                i4 = 0;
            }
            int i21 = i20 + i4;
            if (docMeta.owner_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, docMeta.owner_id);
            } else {
                i5 = 0;
            }
            int i22 = i21 + i5;
            if (docMeta.message_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, docMeta.message_id);
            } else {
                i6 = 0;
            }
            int i23 = i22 + i6;
            if (docMeta.position != null) {
                i7 = ProtoAdapter.INT32.encodedSizeWithTag(8, docMeta.position);
            } else {
                i7 = 0;
            }
            int i24 = i23 + i7;
            if (docMeta.is_cross_tenant != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(9, docMeta.is_cross_tenant);
            } else {
                i8 = 0;
            }
            int i25 = i24 + i8;
            if (docMeta.create_time != null) {
                i9 = ProtoAdapter.INT64.encodedSizeWithTag(10, docMeta.create_time);
            } else {
                i9 = 0;
            }
            int i26 = i25 + i9;
            if (docMeta.last_open_time != null) {
                i10 = ProtoAdapter.INT64.encodedSizeWithTag(11, docMeta.last_open_time);
            } else {
                i10 = 0;
            }
            int i27 = i26 + i10;
            if (docMeta.edit_user_id != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(12, docMeta.edit_user_id);
            } else {
                i11 = 0;
            }
            int i28 = i27 + i11;
            if (docMeta.edit_user_name != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(13, docMeta.edit_user_name);
            } else {
                i12 = 0;
            }
            int i29 = i28 + i12;
            if (docMeta.chat_id != null) {
                i13 = ProtoAdapter.STRING.encodedSizeWithTag(14, docMeta.chat_id);
            } else {
                i13 = 0;
            }
            int i30 = i29 + i13;
            if (docMeta.thread_id != null) {
                i14 = ProtoAdapter.STRING.encodedSizeWithTag(15, docMeta.thread_id);
            } else {
                i14 = 0;
            }
            int i31 = i30 + i14;
            if (docMeta.thread_position != null) {
                i15 = ProtoAdapter.INT32.encodedSizeWithTag(16, docMeta.thread_position);
            } else {
                i15 = 0;
            }
            int i32 = i31 + i15;
            if (docMeta.thread_chat_position != null) {
                i16 = ProtoAdapter.INT32.encodedSizeWithTag(17, docMeta.thread_chat_position);
            } else {
                i16 = 0;
            }
            int i33 = i32 + i16;
            if (docMeta.icon != null) {
                i17 = Icon.ADAPTER.encodedSizeWithTag(18, docMeta.icon);
            }
            return i33 + i17 + docMeta.unknownFields().size();
        }

        /* renamed from: a */
        public DocMeta decode(ProtoReader protoReader) throws IOException {
            C18981a aVar = new C18981a();
            aVar.f46937a = "";
            aVar.f46938b = Doc.Type.UNKNOWN;
            aVar.f46939c = 0L;
            aVar.f46940d = "";
            aVar.f46941e = "";
            aVar.f46942f = "";
            aVar.f46943g = "";
            aVar.f46944h = 0;
            aVar.f46945i = false;
            aVar.f46946j = 0L;
            aVar.f46947k = 0L;
            aVar.f46948l = "";
            aVar.f46949m = "";
            aVar.f46950n = "";
            aVar.f46951o = "";
            aVar.f46952p = 0;
            aVar.f46953q = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f46937a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f46938b = Doc.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f46939c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f46940d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f46941e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f46942f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f46943g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f46944h = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 9:
                            aVar.f46945i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 10:
                            aVar.f46946j = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 11:
                            aVar.f46947k = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f46948l = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 13:
                            aVar.f46949m = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            aVar.f46950n = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            aVar.f46951o = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            aVar.f46952p = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 17:
                            aVar.f46953q = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 18:
                            aVar.f46954r = Icon.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, DocMeta docMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, docMeta.id);
            if (docMeta.type != null) {
                Doc.Type.ADAPTER.encodeWithTag(protoWriter, 2, docMeta.type);
            }
            if (docMeta.update_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, docMeta.update_time);
            }
            if (docMeta.url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, docMeta.url);
            }
            if (docMeta.owner_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, docMeta.owner_name);
            }
            if (docMeta.owner_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, docMeta.owner_id);
            }
            if (docMeta.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, docMeta.message_id);
            }
            if (docMeta.position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, docMeta.position);
            }
            if (docMeta.is_cross_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, docMeta.is_cross_tenant);
            }
            if (docMeta.create_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 10, docMeta.create_time);
            }
            if (docMeta.last_open_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 11, docMeta.last_open_time);
            }
            if (docMeta.edit_user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, docMeta.edit_user_id);
            }
            if (docMeta.edit_user_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, docMeta.edit_user_name);
            }
            if (docMeta.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, docMeta.chat_id);
            }
            if (docMeta.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, docMeta.thread_id);
            }
            if (docMeta.thread_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 16, docMeta.thread_position);
            }
            if (docMeta.thread_chat_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 17, docMeta.thread_chat_position);
            }
            if (docMeta.icon != null) {
                Icon.ADAPTER.encodeWithTag(protoWriter, 18, docMeta.icon);
            }
            protoWriter.writeBytes(docMeta.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.DocMeta$a */
    public static final class C18981a extends Message.Builder<DocMeta, C18981a> {

        /* renamed from: a */
        public String f46937a;

        /* renamed from: b */
        public Doc.Type f46938b;

        /* renamed from: c */
        public Long f46939c;

        /* renamed from: d */
        public String f46940d;

        /* renamed from: e */
        public String f46941e;

        /* renamed from: f */
        public String f46942f;

        /* renamed from: g */
        public String f46943g;

        /* renamed from: h */
        public Integer f46944h;

        /* renamed from: i */
        public Boolean f46945i;

        /* renamed from: j */
        public Long f46946j;

        /* renamed from: k */
        public Long f46947k;

        /* renamed from: l */
        public String f46948l;

        /* renamed from: m */
        public String f46949m;

        /* renamed from: n */
        public String f46950n;

        /* renamed from: o */
        public String f46951o;

        /* renamed from: p */
        public Integer f46952p;

        /* renamed from: q */
        public Integer f46953q;

        /* renamed from: r */
        public Icon f46954r;

        /* renamed from: a */
        public DocMeta build() {
            String str = this.f46937a;
            if (str != null) {
                return new DocMeta(str, this.f46938b, this.f46939c, this.f46940d, this.f46941e, this.f46942f, this.f46943g, this.f46944h, this.f46945i, this.f46946j, this.f46947k, this.f46948l, this.f46949m, this.f46950n, this.f46951o, this.f46952p, this.f46953q, this.f46954r, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C18981a newBuilder() {
        C18981a aVar = new C18981a();
        aVar.f46937a = this.id;
        aVar.f46938b = this.type;
        aVar.f46939c = this.update_time;
        aVar.f46940d = this.url;
        aVar.f46941e = this.owner_name;
        aVar.f46942f = this.owner_id;
        aVar.f46943g = this.message_id;
        aVar.f46944h = this.position;
        aVar.f46945i = this.is_cross_tenant;
        aVar.f46946j = this.create_time;
        aVar.f46947k = this.last_open_time;
        aVar.f46948l = this.edit_user_id;
        aVar.f46949m = this.edit_user_name;
        aVar.f46950n = this.chat_id;
        aVar.f46951o = this.thread_id;
        aVar.f46952p = this.thread_position;
        aVar.f46953q = this.thread_chat_position;
        aVar.f46954r = this.icon;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "DocMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.update_time != null) {
            sb.append(", update_time=");
            sb.append(this.update_time);
        }
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        if (this.owner_name != null) {
            sb.append(", owner_name=");
            sb.append(this.owner_name);
        }
        if (this.owner_id != null) {
            sb.append(", owner_id=");
            sb.append(this.owner_id);
        }
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.position != null) {
            sb.append(", position=");
            sb.append(this.position);
        }
        if (this.is_cross_tenant != null) {
            sb.append(", is_cross_tenant=");
            sb.append(this.is_cross_tenant);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.last_open_time != null) {
            sb.append(", last_open_time=");
            sb.append(this.last_open_time);
        }
        if (this.edit_user_id != null) {
            sb.append(", edit_user_id=");
            sb.append(this.edit_user_id);
        }
        if (this.edit_user_name != null) {
            sb.append(", edit_user_name=");
            sb.append(this.edit_user_name);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        if (this.thread_position != null) {
            sb.append(", thread_position=");
            sb.append(this.thread_position);
        }
        if (this.thread_chat_position != null) {
            sb.append(", thread_chat_position=");
            sb.append(this.thread_chat_position);
        }
        if (this.icon != null) {
            sb.append(", icon=");
            sb.append(this.icon);
        }
        StringBuilder replace = sb.replace(0, 2, "DocMeta{");
        replace.append('}');
        return replace.toString();
    }

    public DocMeta(String str, Doc.Type type2, Long l, String str2, String str3, String str4, String str5, Integer num, Boolean bool, Long l2, Long l3, String str6, String str7, String str8, String str9, Integer num2, Integer num3, Icon icon2) {
        this(str, type2, l, str2, str3, str4, str5, num, bool, l2, l3, str6, str7, str8, str9, num2, num3, icon2, ByteString.EMPTY);
    }

    public DocMeta(String str, Doc.Type type2, Long l, String str2, String str3, String str4, String str5, Integer num, Boolean bool, Long l2, Long l3, String str6, String str7, String str8, String str9, Integer num2, Integer num3, Icon icon2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.type = type2;
        this.update_time = l;
        this.url = str2;
        this.owner_name = str3;
        this.owner_id = str4;
        this.message_id = str5;
        this.position = num;
        this.is_cross_tenant = bool;
        this.create_time = l2;
        this.last_open_time = l3;
        this.edit_user_id = str6;
        this.edit_user_name = str7;
        this.chat_id = str8;
        this.thread_id = str9;
        this.thread_position = num2;
        this.thread_chat_position = num3;
        this.icon = icon2;
    }
}
