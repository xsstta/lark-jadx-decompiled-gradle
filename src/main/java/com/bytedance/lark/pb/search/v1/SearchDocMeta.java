package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Doc;
import com.bytedance.lark.pb.basic.v1.Tag;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class SearchDocMeta extends Message<SearchDocMeta, C18869a> {
    public static final ProtoAdapter<SearchDocMeta> ADAPTER = new C18870b();
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
    public final String id;
    public final Boolean is_cross_tenant;
    public final Long last_open_time;
    public final String message_id;
    public final String owner_id;
    public final String owner_name;
    public final Integer position;
    public final String str_type;
    public final List<Tag> tags;
    public final Integer thread_chat_position;
    public final String thread_id;
    public final Integer thread_position;
    public final Doc.Type type;
    public final Long update_time;
    public final String url;
    public final List<WikiInfo> wiki_info;

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchDocMeta$b */
    private static final class C18870b extends ProtoAdapter<SearchDocMeta> {
        C18870b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchDocMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchDocMeta searchDocMeta) {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, searchDocMeta.id);
            int i17 = 0;
            if (searchDocMeta.type != null) {
                i = Doc.Type.ADAPTER.encodedSizeWithTag(2, searchDocMeta.type);
            } else {
                i = 0;
            }
            int i18 = encodedSizeWithTag + i;
            if (searchDocMeta.update_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, searchDocMeta.update_time);
            } else {
                i2 = 0;
            }
            int i19 = i18 + i2;
            if (searchDocMeta.url != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, searchDocMeta.url);
            } else {
                i3 = 0;
            }
            int i20 = i19 + i3;
            if (searchDocMeta.owner_name != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, searchDocMeta.owner_name);
            } else {
                i4 = 0;
            }
            int i21 = i20 + i4;
            if (searchDocMeta.owner_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, searchDocMeta.owner_id);
            } else {
                i5 = 0;
            }
            int i22 = i21 + i5;
            if (searchDocMeta.message_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, searchDocMeta.message_id);
            } else {
                i6 = 0;
            }
            int i23 = i22 + i6;
            if (searchDocMeta.position != null) {
                i7 = ProtoAdapter.INT32.encodedSizeWithTag(8, searchDocMeta.position);
            } else {
                i7 = 0;
            }
            int i24 = i23 + i7;
            if (searchDocMeta.is_cross_tenant != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(9, searchDocMeta.is_cross_tenant);
            } else {
                i8 = 0;
            }
            int i25 = i24 + i8;
            if (searchDocMeta.create_time != null) {
                i9 = ProtoAdapter.INT64.encodedSizeWithTag(10, searchDocMeta.create_time);
            } else {
                i9 = 0;
            }
            int i26 = i25 + i9;
            if (searchDocMeta.last_open_time != null) {
                i10 = ProtoAdapter.INT64.encodedSizeWithTag(11, searchDocMeta.last_open_time);
            } else {
                i10 = 0;
            }
            int i27 = i26 + i10;
            if (searchDocMeta.edit_user_id != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(12, searchDocMeta.edit_user_id);
            } else {
                i11 = 0;
            }
            int i28 = i27 + i11;
            if (searchDocMeta.edit_user_name != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(13, searchDocMeta.edit_user_name);
            } else {
                i12 = 0;
            }
            int i29 = i28 + i12;
            if (searchDocMeta.str_type != null) {
                i13 = ProtoAdapter.STRING.encodedSizeWithTag(14, searchDocMeta.str_type);
            } else {
                i13 = 0;
            }
            int i30 = i29 + i13;
            if (searchDocMeta.chat_id != null) {
                i14 = ProtoAdapter.STRING.encodedSizeWithTag(15, searchDocMeta.chat_id);
            } else {
                i14 = 0;
            }
            int i31 = i30 + i14;
            if (searchDocMeta.thread_id != null) {
                i15 = ProtoAdapter.STRING.encodedSizeWithTag(16, searchDocMeta.thread_id);
            } else {
                i15 = 0;
            }
            int i32 = i31 + i15;
            if (searchDocMeta.thread_position != null) {
                i16 = ProtoAdapter.INT32.encodedSizeWithTag(17, searchDocMeta.thread_position);
            } else {
                i16 = 0;
            }
            int i33 = i32 + i16;
            if (searchDocMeta.thread_chat_position != null) {
                i17 = ProtoAdapter.INT32.encodedSizeWithTag(18, searchDocMeta.thread_chat_position);
            }
            return i33 + i17 + Tag.ADAPTER.asRepeated().encodedSizeWithTag(19, searchDocMeta.tags) + WikiInfo.ADAPTER.asRepeated().encodedSizeWithTag(20, searchDocMeta.wiki_info) + searchDocMeta.unknownFields().size();
        }

        /* renamed from: a */
        public SearchDocMeta decode(ProtoReader protoReader) throws IOException {
            C18869a aVar = new C18869a();
            aVar.f46640a = "";
            aVar.f46641b = Doc.Type.UNKNOWN;
            aVar.f46642c = 0L;
            aVar.f46643d = "";
            aVar.f46644e = "";
            aVar.f46645f = "";
            aVar.f46646g = "";
            aVar.f46647h = 0;
            aVar.f46648i = false;
            aVar.f46649j = 0L;
            aVar.f46650k = 0L;
            aVar.f46651l = "";
            aVar.f46652m = "";
            aVar.f46653n = "";
            aVar.f46654o = "";
            aVar.f46655p = "";
            aVar.f46656q = 0;
            aVar.f46657r = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f46640a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f46641b = Doc.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f46642c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f46643d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f46644e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f46645f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f46646g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f46647h = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 9:
                            aVar.f46648i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 10:
                            aVar.f46649j = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 11:
                            aVar.f46650k = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f46651l = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 13:
                            aVar.f46652m = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            aVar.f46653n = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            aVar.f46654o = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            aVar.f46655p = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 17:
                            aVar.f46656q = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 18:
                            aVar.f46657r = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 19:
                            try {
                                aVar.f46658s.add(Tag.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 20:
                            aVar.f46659t.add(WikiInfo.ADAPTER.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, SearchDocMeta searchDocMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchDocMeta.id);
            if (searchDocMeta.type != null) {
                Doc.Type.ADAPTER.encodeWithTag(protoWriter, 2, searchDocMeta.type);
            }
            if (searchDocMeta.update_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, searchDocMeta.update_time);
            }
            if (searchDocMeta.url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, searchDocMeta.url);
            }
            if (searchDocMeta.owner_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, searchDocMeta.owner_name);
            }
            if (searchDocMeta.owner_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, searchDocMeta.owner_id);
            }
            if (searchDocMeta.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, searchDocMeta.message_id);
            }
            if (searchDocMeta.position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, searchDocMeta.position);
            }
            if (searchDocMeta.is_cross_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, searchDocMeta.is_cross_tenant);
            }
            if (searchDocMeta.create_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 10, searchDocMeta.create_time);
            }
            if (searchDocMeta.last_open_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 11, searchDocMeta.last_open_time);
            }
            if (searchDocMeta.edit_user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, searchDocMeta.edit_user_id);
            }
            if (searchDocMeta.edit_user_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, searchDocMeta.edit_user_name);
            }
            if (searchDocMeta.str_type != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, searchDocMeta.str_type);
            }
            if (searchDocMeta.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, searchDocMeta.chat_id);
            }
            if (searchDocMeta.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 16, searchDocMeta.thread_id);
            }
            if (searchDocMeta.thread_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 17, searchDocMeta.thread_position);
            }
            if (searchDocMeta.thread_chat_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 18, searchDocMeta.thread_chat_position);
            }
            Tag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 19, searchDocMeta.tags);
            WikiInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 20, searchDocMeta.wiki_info);
            protoWriter.writeBytes(searchDocMeta.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchDocMeta$a */
    public static final class C18869a extends Message.Builder<SearchDocMeta, C18869a> {

        /* renamed from: a */
        public String f46640a;

        /* renamed from: b */
        public Doc.Type f46641b;

        /* renamed from: c */
        public Long f46642c;

        /* renamed from: d */
        public String f46643d;

        /* renamed from: e */
        public String f46644e;

        /* renamed from: f */
        public String f46645f;

        /* renamed from: g */
        public String f46646g;

        /* renamed from: h */
        public Integer f46647h;

        /* renamed from: i */
        public Boolean f46648i;

        /* renamed from: j */
        public Long f46649j;

        /* renamed from: k */
        public Long f46650k;

        /* renamed from: l */
        public String f46651l;

        /* renamed from: m */
        public String f46652m;

        /* renamed from: n */
        public String f46653n;

        /* renamed from: o */
        public String f46654o;

        /* renamed from: p */
        public String f46655p;

        /* renamed from: q */
        public Integer f46656q;

        /* renamed from: r */
        public Integer f46657r;

        /* renamed from: s */
        public List<Tag> f46658s = Internal.newMutableList();

        /* renamed from: t */
        public List<WikiInfo> f46659t = Internal.newMutableList();

        /* renamed from: a */
        public SearchDocMeta build() {
            String str = this.f46640a;
            if (str != null) {
                return new SearchDocMeta(str, this.f46641b, this.f46642c, this.f46643d, this.f46644e, this.f46645f, this.f46646g, this.f46647h, this.f46648i, this.f46649j, this.f46650k, this.f46651l, this.f46652m, this.f46653n, this.f46654o, this.f46655p, this.f46656q, this.f46657r, this.f46658s, this.f46659t, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C18869a newBuilder() {
        C18869a aVar = new C18869a();
        aVar.f46640a = this.id;
        aVar.f46641b = this.type;
        aVar.f46642c = this.update_time;
        aVar.f46643d = this.url;
        aVar.f46644e = this.owner_name;
        aVar.f46645f = this.owner_id;
        aVar.f46646g = this.message_id;
        aVar.f46647h = this.position;
        aVar.f46648i = this.is_cross_tenant;
        aVar.f46649j = this.create_time;
        aVar.f46650k = this.last_open_time;
        aVar.f46651l = this.edit_user_id;
        aVar.f46652m = this.edit_user_name;
        aVar.f46653n = this.str_type;
        aVar.f46654o = this.chat_id;
        aVar.f46655p = this.thread_id;
        aVar.f46656q = this.thread_position;
        aVar.f46657r = this.thread_chat_position;
        aVar.f46658s = Internal.copyOf("tags", this.tags);
        aVar.f46659t = Internal.copyOf("wiki_info", this.wiki_info);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SearchDocMeta");
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
        if (this.str_type != null) {
            sb.append(", str_type=");
            sb.append(this.str_type);
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
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        if (!this.wiki_info.isEmpty()) {
            sb.append(", wiki_info=");
            sb.append(this.wiki_info);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchDocMeta{");
        replace.append('}');
        return replace.toString();
    }

    public SearchDocMeta(String str, Doc.Type type2, Long l, String str2, String str3, String str4, String str5, Integer num, Boolean bool, Long l2, Long l3, String str6, String str7, String str8, String str9, String str10, Integer num2, Integer num3, List<Tag> list, List<WikiInfo> list2) {
        this(str, type2, l, str2, str3, str4, str5, num, bool, l2, l3, str6, str7, str8, str9, str10, num2, num3, list, list2, ByteString.EMPTY);
    }

    public SearchDocMeta(String str, Doc.Type type2, Long l, String str2, String str3, String str4, String str5, Integer num, Boolean bool, Long l2, Long l3, String str6, String str7, String str8, String str9, String str10, Integer num2, Integer num3, List<Tag> list, List<WikiInfo> list2, ByteString byteString) {
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
        this.str_type = str8;
        this.chat_id = str9;
        this.thread_id = str10;
        this.thread_position = num2;
        this.thread_chat_position = num3;
        this.tags = Internal.immutableCopyOf("tags", list);
        this.wiki_info = Internal.immutableCopyOf("wiki_info", list2);
    }
}
