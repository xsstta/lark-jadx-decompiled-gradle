package com.bytedance.lark.pb.search.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Doc;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class WikiMeta extends Message<WikiMeta, C19111a> {
    public static final ProtoAdapter<WikiMeta> ADAPTER = new C19112b();
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Boolean DEFAULT_IS_CROSS_TENANT = false;
    public static final Long DEFAULT_LAST_OPEN_TIME = 0L;
    public static final Integer DEFAULT_POSITION = 0;
    public static final Long DEFAULT_SPACE_ID = 0L;
    public static final Integer DEFAULT_THREAD_CHAT_POSITION = 0;
    public static final Integer DEFAULT_THREAD_POSITION = 0;
    public static final Doc.Type DEFAULT_TYPE = Doc.Type.UNKNOWN;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final Long create_time;
    public final String doc_url;
    public final String edit_user_id;
    public final String edit_user_name;
    public final String id;
    public final Boolean is_cross_tenant;
    public final Long last_open_time;
    public final String message_id;
    public final Integer position;
    public final Long space_id;
    public final String space_name;
    public final Integer thread_chat_position;
    public final String thread_id;
    public final Integer thread_position;
    public final String token;
    public final Doc.Type type;
    public final Long update_time;
    public final String url;

    /* renamed from: com.bytedance.lark.pb.search.v2.WikiMeta$b */
    private static final class C19112b extends ProtoAdapter<WikiMeta> {
        C19112b() {
            super(FieldEncoding.LENGTH_DELIMITED, WikiMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(WikiMeta wikiMeta) {
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
            int i17;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, wikiMeta.id);
            int i18 = 0;
            if (wikiMeta.type != null) {
                i = Doc.Type.ADAPTER.encodedSizeWithTag(2, wikiMeta.type);
            } else {
                i = 0;
            }
            int i19 = encodedSizeWithTag + i;
            if (wikiMeta.update_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, wikiMeta.update_time);
            } else {
                i2 = 0;
            }
            int i20 = i19 + i2;
            if (wikiMeta.is_cross_tenant != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, wikiMeta.is_cross_tenant);
            } else {
                i3 = 0;
            }
            int i21 = i20 + i3;
            if (wikiMeta.chat_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, wikiMeta.chat_id);
            } else {
                i4 = 0;
            }
            int i22 = i21 + i4;
            if (wikiMeta.position != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(6, wikiMeta.position);
            } else {
                i5 = 0;
            }
            int i23 = i22 + i5;
            if (wikiMeta.thread_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, wikiMeta.thread_id);
            } else {
                i6 = 0;
            }
            int i24 = i23 + i6;
            if (wikiMeta.thread_position != null) {
                i7 = ProtoAdapter.INT32.encodedSizeWithTag(8, wikiMeta.thread_position);
            } else {
                i7 = 0;
            }
            int i25 = i24 + i7;
            if (wikiMeta.thread_chat_position != null) {
                i8 = ProtoAdapter.INT32.encodedSizeWithTag(9, wikiMeta.thread_chat_position);
            } else {
                i8 = 0;
            }
            int i26 = i25 + i8;
            if (wikiMeta.message_id != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(10, wikiMeta.message_id);
            } else {
                i9 = 0;
            }
            int i27 = i26 + i9;
            if (wikiMeta.create_time != null) {
                i10 = ProtoAdapter.INT64.encodedSizeWithTag(11, wikiMeta.create_time);
            } else {
                i10 = 0;
            }
            int i28 = i27 + i10;
            if (wikiMeta.last_open_time != null) {
                i11 = ProtoAdapter.INT64.encodedSizeWithTag(12, wikiMeta.last_open_time);
            } else {
                i11 = 0;
            }
            int i29 = i28 + i11;
            if (wikiMeta.edit_user_id != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(13, wikiMeta.edit_user_id);
            } else {
                i12 = 0;
            }
            int i30 = i29 + i12;
            if (wikiMeta.edit_user_name != null) {
                i13 = ProtoAdapter.STRING.encodedSizeWithTag(14, wikiMeta.edit_user_name);
            } else {
                i13 = 0;
            }
            int i31 = i30 + i13;
            if (wikiMeta.url != null) {
                i14 = ProtoAdapter.STRING.encodedSizeWithTag(15, wikiMeta.url);
            } else {
                i14 = 0;
            }
            int i32 = i31 + i14;
            if (wikiMeta.doc_url != null) {
                i15 = ProtoAdapter.STRING.encodedSizeWithTag(16, wikiMeta.doc_url);
            } else {
                i15 = 0;
            }
            int i33 = i32 + i15;
            if (wikiMeta.space_id != null) {
                i16 = ProtoAdapter.INT64.encodedSizeWithTag(17, wikiMeta.space_id);
            } else {
                i16 = 0;
            }
            int i34 = i33 + i16;
            if (wikiMeta.space_name != null) {
                i17 = ProtoAdapter.STRING.encodedSizeWithTag(18, wikiMeta.space_name);
            } else {
                i17 = 0;
            }
            int i35 = i34 + i17;
            if (wikiMeta.token != null) {
                i18 = ProtoAdapter.STRING.encodedSizeWithTag(19, wikiMeta.token);
            }
            return i35 + i18 + wikiMeta.unknownFields().size();
        }

        /* renamed from: a */
        public WikiMeta decode(ProtoReader protoReader) throws IOException {
            C19111a aVar = new C19111a();
            aVar.f47239a = "";
            aVar.f47240b = Doc.Type.UNKNOWN;
            aVar.f47241c = 0L;
            aVar.f47242d = false;
            aVar.f47243e = "";
            aVar.f47244f = 0;
            aVar.f47245g = "";
            aVar.f47246h = 0;
            aVar.f47247i = 0;
            aVar.f47248j = "";
            aVar.f47249k = 0L;
            aVar.f47250l = 0L;
            aVar.f47251m = "";
            aVar.f47252n = "";
            aVar.f47253o = "";
            aVar.f47254p = "";
            aVar.f47255q = 0L;
            aVar.f47256r = "";
            aVar.f47257s = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f47239a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f47240b = Doc.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f47241c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f47242d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f47243e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f47244f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            aVar.f47245g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f47246h = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 9:
                            aVar.f47247i = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 10:
                            aVar.f47248j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f47249k = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f47250l = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 13:
                            aVar.f47251m = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            aVar.f47252n = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            aVar.f47253o = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            aVar.f47254p = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 17:
                            aVar.f47255q = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 18:
                            aVar.f47256r = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 19:
                            aVar.f47257s = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, WikiMeta wikiMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, wikiMeta.id);
            if (wikiMeta.type != null) {
                Doc.Type.ADAPTER.encodeWithTag(protoWriter, 2, wikiMeta.type);
            }
            if (wikiMeta.update_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, wikiMeta.update_time);
            }
            if (wikiMeta.is_cross_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, wikiMeta.is_cross_tenant);
            }
            if (wikiMeta.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, wikiMeta.chat_id);
            }
            if (wikiMeta.position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, wikiMeta.position);
            }
            if (wikiMeta.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, wikiMeta.thread_id);
            }
            if (wikiMeta.thread_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, wikiMeta.thread_position);
            }
            if (wikiMeta.thread_chat_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, wikiMeta.thread_chat_position);
            }
            if (wikiMeta.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, wikiMeta.message_id);
            }
            if (wikiMeta.create_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 11, wikiMeta.create_time);
            }
            if (wikiMeta.last_open_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 12, wikiMeta.last_open_time);
            }
            if (wikiMeta.edit_user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, wikiMeta.edit_user_id);
            }
            if (wikiMeta.edit_user_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, wikiMeta.edit_user_name);
            }
            if (wikiMeta.url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, wikiMeta.url);
            }
            if (wikiMeta.doc_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 16, wikiMeta.doc_url);
            }
            if (wikiMeta.space_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 17, wikiMeta.space_id);
            }
            if (wikiMeta.space_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 18, wikiMeta.space_name);
            }
            if (wikiMeta.token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 19, wikiMeta.token);
            }
            protoWriter.writeBytes(wikiMeta.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.WikiMeta$a */
    public static final class C19111a extends Message.Builder<WikiMeta, C19111a> {

        /* renamed from: a */
        public String f47239a;

        /* renamed from: b */
        public Doc.Type f47240b;

        /* renamed from: c */
        public Long f47241c;

        /* renamed from: d */
        public Boolean f47242d;

        /* renamed from: e */
        public String f47243e;

        /* renamed from: f */
        public Integer f47244f;

        /* renamed from: g */
        public String f47245g;

        /* renamed from: h */
        public Integer f47246h;

        /* renamed from: i */
        public Integer f47247i;

        /* renamed from: j */
        public String f47248j;

        /* renamed from: k */
        public Long f47249k;

        /* renamed from: l */
        public Long f47250l;

        /* renamed from: m */
        public String f47251m;

        /* renamed from: n */
        public String f47252n;

        /* renamed from: o */
        public String f47253o;

        /* renamed from: p */
        public String f47254p;

        /* renamed from: q */
        public Long f47255q;

        /* renamed from: r */
        public String f47256r;

        /* renamed from: s */
        public String f47257s;

        /* renamed from: a */
        public WikiMeta build() {
            String str = this.f47239a;
            if (str != null) {
                return new WikiMeta(str, this.f47240b, this.f47241c, this.f47242d, this.f47243e, this.f47244f, this.f47245g, this.f47246h, this.f47247i, this.f47248j, this.f47249k, this.f47250l, this.f47251m, this.f47252n, this.f47253o, this.f47254p, this.f47255q, this.f47256r, this.f47257s, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C19111a newBuilder() {
        C19111a aVar = new C19111a();
        aVar.f47239a = this.id;
        aVar.f47240b = this.type;
        aVar.f47241c = this.update_time;
        aVar.f47242d = this.is_cross_tenant;
        aVar.f47243e = this.chat_id;
        aVar.f47244f = this.position;
        aVar.f47245g = this.thread_id;
        aVar.f47246h = this.thread_position;
        aVar.f47247i = this.thread_chat_position;
        aVar.f47248j = this.message_id;
        aVar.f47249k = this.create_time;
        aVar.f47250l = this.last_open_time;
        aVar.f47251m = this.edit_user_id;
        aVar.f47252n = this.edit_user_name;
        aVar.f47253o = this.url;
        aVar.f47254p = this.doc_url;
        aVar.f47255q = this.space_id;
        aVar.f47256r = this.space_name;
        aVar.f47257s = this.token;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "WikiMeta");
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
        if (this.is_cross_tenant != null) {
            sb.append(", is_cross_tenant=");
            sb.append(this.is_cross_tenant);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.position != null) {
            sb.append(", position=");
            sb.append(this.position);
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
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
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
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        if (this.doc_url != null) {
            sb.append(", doc_url=");
            sb.append(this.doc_url);
        }
        if (this.space_id != null) {
            sb.append(", space_id=");
            sb.append(this.space_id);
        }
        if (this.space_name != null) {
            sb.append(", space_name=");
            sb.append(this.space_name);
        }
        if (this.token != null) {
            sb.append(", token=");
            sb.append(this.token);
        }
        StringBuilder replace = sb.replace(0, 2, "WikiMeta{");
        replace.append('}');
        return replace.toString();
    }

    public WikiMeta(String str, Doc.Type type2, Long l, Boolean bool, String str2, Integer num, String str3, Integer num2, Integer num3, String str4, Long l2, Long l3, String str5, String str6, String str7, String str8, Long l4, String str9, String str10) {
        this(str, type2, l, bool, str2, num, str3, num2, num3, str4, l2, l3, str5, str6, str7, str8, l4, str9, str10, ByteString.EMPTY);
    }

    public WikiMeta(String str, Doc.Type type2, Long l, Boolean bool, String str2, Integer num, String str3, Integer num2, Integer num3, String str4, Long l2, Long l3, String str5, String str6, String str7, String str8, Long l4, String str9, String str10, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.type = type2;
        this.update_time = l;
        this.is_cross_tenant = bool;
        this.chat_id = str2;
        this.position = num;
        this.thread_id = str3;
        this.thread_position = num2;
        this.thread_chat_position = num3;
        this.message_id = str4;
        this.create_time = l2;
        this.last_open_time = l3;
        this.edit_user_id = str5;
        this.edit_user_name = str6;
        this.url = str7;
        this.doc_url = str8;
        this.space_id = l4;
        this.space_name = str9;
        this.token = str10;
    }
}
