package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
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

public final class SearchMemberInfo extends Message<SearchMemberInfo, C16976a> {
    public static final ProtoAdapter<SearchMemberInfo> ADAPTER = new C16977b();
    public static final Long DEFAULT_CHAT_ID = 0L;
    public static final Long DEFAULT_ID = 0L;
    public static final SearchMemberType DEFAULT_MEMBER_TYPE = SearchMemberType.MEMBER_GROUP;
    private static final long serialVersionUID = 0;
    public final String avatar_key;
    public final List<String> avatar_urls;
    public final Long chat_id;
    public final String cn_name;
    public final String department;
    public final String email_address;
    public final String en_name;
    public final Long id;
    public final SearchMemberType member_type;
    public final String name;
    public final String tenant_id;
    public final String user_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.SearchMemberInfo$b */
    private static final class C16977b extends ProtoAdapter<SearchMemberInfo> {
        C16977b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchMemberInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchMemberInfo searchMemberInfo) {
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
            if (searchMemberInfo.id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, searchMemberInfo.id);
            } else {
                i = 0;
            }
            if (searchMemberInfo.cn_name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, searchMemberInfo.cn_name);
            } else {
                i2 = 0;
            }
            int i12 = i + i2;
            if (searchMemberInfo.en_name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, searchMemberInfo.en_name);
            } else {
                i3 = 0;
            }
            int i13 = i12 + i3;
            if (searchMemberInfo.email_address != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, searchMemberInfo.email_address);
            } else {
                i4 = 0;
            }
            int i14 = i13 + i4;
            if (searchMemberInfo.department != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, searchMemberInfo.department);
            } else {
                i5 = 0;
            }
            int encodedSizeWithTag = i14 + i5 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, searchMemberInfo.avatar_urls);
            if (searchMemberInfo.avatar_key != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, searchMemberInfo.avatar_key);
            } else {
                i6 = 0;
            }
            int i15 = encodedSizeWithTag + i6;
            if (searchMemberInfo.member_type != null) {
                i7 = SearchMemberType.ADAPTER.encodedSizeWithTag(8, searchMemberInfo.member_type);
            } else {
                i7 = 0;
            }
            int i16 = i15 + i7;
            if (searchMemberInfo.chat_id != null) {
                i8 = ProtoAdapter.INT64.encodedSizeWithTag(9, searchMemberInfo.chat_id);
            } else {
                i8 = 0;
            }
            int i17 = i16 + i8;
            if (searchMemberInfo.name != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(10, searchMemberInfo.name);
            } else {
                i9 = 0;
            }
            int i18 = i17 + i9;
            if (searchMemberInfo.user_id != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(11, searchMemberInfo.user_id);
            } else {
                i10 = 0;
            }
            int i19 = i18 + i10;
            if (searchMemberInfo.tenant_id != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(12, searchMemberInfo.tenant_id);
            }
            return i19 + i11 + searchMemberInfo.unknownFields().size();
        }

        /* renamed from: a */
        public SearchMemberInfo decode(ProtoReader protoReader) throws IOException {
            C16976a aVar = new C16976a();
            aVar.f43536a = 0L;
            aVar.f43537b = "";
            aVar.f43538c = "";
            aVar.f43539d = "";
            aVar.f43540e = "";
            aVar.f43542g = "";
            aVar.f43543h = SearchMemberType.MEMBER_GROUP;
            aVar.f43544i = 0L;
            aVar.f43545j = "";
            aVar.f43546k = "";
            aVar.f43547l = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f43536a = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            aVar.f43537b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f43538c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f43539d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f43540e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f43541f.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            aVar.f43542g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            try {
                                aVar.f43543h = SearchMemberType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 9:
                            aVar.f43544i = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 10:
                            aVar.f43545j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f43546k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f43547l = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, SearchMemberInfo searchMemberInfo) throws IOException {
            if (searchMemberInfo.id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, searchMemberInfo.id);
            }
            if (searchMemberInfo.cn_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, searchMemberInfo.cn_name);
            }
            if (searchMemberInfo.en_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, searchMemberInfo.en_name);
            }
            if (searchMemberInfo.email_address != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, searchMemberInfo.email_address);
            }
            if (searchMemberInfo.department != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, searchMemberInfo.department);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 6, searchMemberInfo.avatar_urls);
            if (searchMemberInfo.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, searchMemberInfo.avatar_key);
            }
            if (searchMemberInfo.member_type != null) {
                SearchMemberType.ADAPTER.encodeWithTag(protoWriter, 8, searchMemberInfo.member_type);
            }
            if (searchMemberInfo.chat_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 9, searchMemberInfo.chat_id);
            }
            if (searchMemberInfo.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, searchMemberInfo.name);
            }
            if (searchMemberInfo.user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, searchMemberInfo.user_id);
            }
            if (searchMemberInfo.tenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, searchMemberInfo.tenant_id);
            }
            protoWriter.writeBytes(searchMemberInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.SearchMemberInfo$a */
    public static final class C16976a extends Message.Builder<SearchMemberInfo, C16976a> {

        /* renamed from: a */
        public Long f43536a;

        /* renamed from: b */
        public String f43537b;

        /* renamed from: c */
        public String f43538c;

        /* renamed from: d */
        public String f43539d;

        /* renamed from: e */
        public String f43540e;

        /* renamed from: f */
        public List<String> f43541f = Internal.newMutableList();

        /* renamed from: g */
        public String f43542g;

        /* renamed from: h */
        public SearchMemberType f43543h;

        /* renamed from: i */
        public Long f43544i;

        /* renamed from: j */
        public String f43545j;

        /* renamed from: k */
        public String f43546k;

        /* renamed from: l */
        public String f43547l;

        /* renamed from: a */
        public SearchMemberInfo build() {
            return new SearchMemberInfo(this.f43536a, this.f43537b, this.f43538c, this.f43539d, this.f43540e, this.f43541f, this.f43542g, this.f43543h, this.f43544i, this.f43545j, this.f43546k, this.f43547l, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16976a newBuilder() {
        C16976a aVar = new C16976a();
        aVar.f43536a = this.id;
        aVar.f43537b = this.cn_name;
        aVar.f43538c = this.en_name;
        aVar.f43539d = this.email_address;
        aVar.f43540e = this.department;
        aVar.f43541f = Internal.copyOf("avatar_urls", this.avatar_urls);
        aVar.f43542g = this.avatar_key;
        aVar.f43543h = this.member_type;
        aVar.f43544i = this.chat_id;
        aVar.f43545j = this.name;
        aVar.f43546k = this.user_id;
        aVar.f43547l = this.tenant_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "SearchMemberInfo");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.cn_name != null) {
            sb.append(", cn_name=");
            sb.append(this.cn_name);
        }
        if (this.en_name != null) {
            sb.append(", en_name=");
            sb.append(this.en_name);
        }
        if (this.email_address != null) {
            sb.append(", email_address=");
            sb.append(this.email_address);
        }
        if (this.department != null) {
            sb.append(", department=");
            sb.append(this.department);
        }
        if (!this.avatar_urls.isEmpty()) {
            sb.append(", avatar_urls=");
            sb.append(this.avatar_urls);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.member_type != null) {
            sb.append(", member_type=");
            sb.append(this.member_type);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.tenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.tenant_id);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchMemberInfo{");
        replace.append('}');
        return replace.toString();
    }

    public SearchMemberInfo(Long l, String str, String str2, String str3, String str4, List<String> list, String str5, SearchMemberType searchMemberType, Long l2, String str6, String str7, String str8) {
        this(l, str, str2, str3, str4, list, str5, searchMemberType, l2, str6, str7, str8, ByteString.EMPTY);
    }

    public SearchMemberInfo(Long l, String str, String str2, String str3, String str4, List<String> list, String str5, SearchMemberType searchMemberType, Long l2, String str6, String str7, String str8, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = l;
        this.cn_name = str;
        this.en_name = str2;
        this.email_address = str3;
        this.department = str4;
        this.avatar_urls = Internal.immutableCopyOf("avatar_urls", list);
        this.avatar_key = str5;
        this.member_type = searchMemberType;
        this.chat_id = l2;
        this.name = str6;
        this.user_id = str7;
        this.tenant_id = str8;
    }
}
