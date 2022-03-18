package com.bytedance.lark.pb.email.client.v1;

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

public final class MailContactSearchResult extends Message<MailContactSearchResult, C16658a> {
    public static final ProtoAdapter<MailContactSearchResult> ADAPTER = new C16659b();
    public static final Long DEFAULT_CHAT_GROUP_MEMBERS_COUNT = 0L;
    public static final MailGroupType DEFAULT_MAIL_GROUP_TYPE = MailGroupType.CHAT_MAIL_GROUP;
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String avatar_key;
    public final List<String> avatar_urls;
    public final Long chat_group_members_count;
    public final String display_name;
    public final String email;
    public final List<String> email_hit_terms;
    public final String lark_id;
    public final MailGroupType mail_group_type;
    public final String subtitle;
    public final String tenant_id;
    public final String title;
    public final List<String> title_hit_terms;
    public final Type type;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        CHATTER(1),
        GROUP(2),
        EXTERNAL_CONTACT(3),
        NAME_CARD(4),
        SHARED_MAILBOX(5),
        ENTERPRISE_MAIL_GROUP(250);
        
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
                return CHATTER;
            }
            if (i == 2) {
                return GROUP;
            }
            if (i == 3) {
                return EXTERNAL_CONTACT;
            }
            if (i == 4) {
                return NAME_CARD;
            }
            if (i == 5) {
                return SHARED_MAILBOX;
            }
            if (i != 250) {
                return null;
            }
            return ENTERPRISE_MAIL_GROUP;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailContactSearchResult$b */
    private static final class C16659b extends ProtoAdapter<MailContactSearchResult> {
        C16659b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailContactSearchResult.class);
        }

        /* renamed from: a */
        public int encodedSize(MailContactSearchResult mailContactSearchResult) {
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
            if (mailContactSearchResult.type != null) {
                i = Type.ADAPTER.encodedSizeWithTag(1, mailContactSearchResult.type);
            } else {
                i = 0;
            }
            if (mailContactSearchResult.title != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mailContactSearchResult.title);
            } else {
                i2 = 0;
            }
            int i11 = i + i2;
            if (mailContactSearchResult.email != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, mailContactSearchResult.email);
            } else {
                i3 = 0;
            }
            int encodedSizeWithTag = i11 + i3 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, mailContactSearchResult.avatar_urls);
            if (mailContactSearchResult.avatar_key != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, mailContactSearchResult.avatar_key);
            } else {
                i4 = 0;
            }
            int i12 = encodedSizeWithTag + i4;
            if (mailContactSearchResult.lark_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, mailContactSearchResult.lark_id);
            } else {
                i5 = 0;
            }
            int i13 = i12 + i5;
            if (mailContactSearchResult.subtitle != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, mailContactSearchResult.subtitle);
            } else {
                i6 = 0;
            }
            int encodedSizeWithTag2 = i13 + i6 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(8, mailContactSearchResult.title_hit_terms) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(9, mailContactSearchResult.email_hit_terms);
            if (mailContactSearchResult.mail_group_type != null) {
                i7 = MailGroupType.ADAPTER.encodedSizeWithTag(10, mailContactSearchResult.mail_group_type);
            } else {
                i7 = 0;
            }
            int i14 = encodedSizeWithTag2 + i7;
            if (mailContactSearchResult.tenant_id != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(11, mailContactSearchResult.tenant_id);
            } else {
                i8 = 0;
            }
            int i15 = i14 + i8;
            if (mailContactSearchResult.display_name != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(12, mailContactSearchResult.display_name);
            } else {
                i9 = 0;
            }
            int i16 = i15 + i9;
            if (mailContactSearchResult.chat_group_members_count != null) {
                i10 = ProtoAdapter.INT64.encodedSizeWithTag(13, mailContactSearchResult.chat_group_members_count);
            }
            return i16 + i10 + mailContactSearchResult.unknownFields().size();
        }

        /* renamed from: a */
        public MailContactSearchResult decode(ProtoReader protoReader) throws IOException {
            C16658a aVar = new C16658a();
            aVar.f43104a = Type.UNKNOWN;
            aVar.f43105b = "";
            aVar.f43106c = "";
            aVar.f43108e = "";
            aVar.f43109f = "";
            aVar.f43110g = "";
            aVar.f43113j = MailGroupType.CHAT_MAIL_GROUP;
            aVar.f43114k = "";
            aVar.f43115l = "";
            aVar.f43116m = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f43104a = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f43105b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f43106c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f43107d.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            aVar.f43108e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f43109f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f43110g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f43111h.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                            aVar.f43112i.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 10:
                            try {
                                aVar.f43113j = MailGroupType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 11:
                            aVar.f43114k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f43115l = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 13:
                            aVar.f43116m = ProtoAdapter.INT64.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, MailContactSearchResult mailContactSearchResult) throws IOException {
            if (mailContactSearchResult.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 1, mailContactSearchResult.type);
            }
            if (mailContactSearchResult.title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailContactSearchResult.title);
            }
            if (mailContactSearchResult.email != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, mailContactSearchResult.email);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 4, mailContactSearchResult.avatar_urls);
            if (mailContactSearchResult.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, mailContactSearchResult.avatar_key);
            }
            if (mailContactSearchResult.lark_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, mailContactSearchResult.lark_id);
            }
            if (mailContactSearchResult.subtitle != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, mailContactSearchResult.subtitle);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 8, mailContactSearchResult.title_hit_terms);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 9, mailContactSearchResult.email_hit_terms);
            if (mailContactSearchResult.mail_group_type != null) {
                MailGroupType.ADAPTER.encodeWithTag(protoWriter, 10, mailContactSearchResult.mail_group_type);
            }
            if (mailContactSearchResult.tenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, mailContactSearchResult.tenant_id);
            }
            if (mailContactSearchResult.display_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, mailContactSearchResult.display_name);
            }
            if (mailContactSearchResult.chat_group_members_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 13, mailContactSearchResult.chat_group_members_count);
            }
            protoWriter.writeBytes(mailContactSearchResult.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailContactSearchResult$a */
    public static final class C16658a extends Message.Builder<MailContactSearchResult, C16658a> {

        /* renamed from: a */
        public Type f43104a;

        /* renamed from: b */
        public String f43105b;

        /* renamed from: c */
        public String f43106c;

        /* renamed from: d */
        public List<String> f43107d = Internal.newMutableList();

        /* renamed from: e */
        public String f43108e;

        /* renamed from: f */
        public String f43109f;

        /* renamed from: g */
        public String f43110g;

        /* renamed from: h */
        public List<String> f43111h = Internal.newMutableList();

        /* renamed from: i */
        public List<String> f43112i = Internal.newMutableList();

        /* renamed from: j */
        public MailGroupType f43113j;

        /* renamed from: k */
        public String f43114k;

        /* renamed from: l */
        public String f43115l;

        /* renamed from: m */
        public Long f43116m;

        /* renamed from: a */
        public MailContactSearchResult build() {
            return new MailContactSearchResult(this.f43104a, this.f43105b, this.f43106c, this.f43107d, this.f43108e, this.f43109f, this.f43110g, this.f43111h, this.f43112i, this.f43113j, this.f43114k, this.f43115l, this.f43116m, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16658a newBuilder() {
        C16658a aVar = new C16658a();
        aVar.f43104a = this.type;
        aVar.f43105b = this.title;
        aVar.f43106c = this.email;
        aVar.f43107d = Internal.copyOf("avatar_urls", this.avatar_urls);
        aVar.f43108e = this.avatar_key;
        aVar.f43109f = this.lark_id;
        aVar.f43110g = this.subtitle;
        aVar.f43111h = Internal.copyOf("title_hit_terms", this.title_hit_terms);
        aVar.f43112i = Internal.copyOf("email_hit_terms", this.email_hit_terms);
        aVar.f43113j = this.mail_group_type;
        aVar.f43114k = this.tenant_id;
        aVar.f43115l = this.display_name;
        aVar.f43116m = this.chat_group_members_count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailContactSearchResult");
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.email != null) {
            sb.append(", email=");
            sb.append(this.email);
        }
        if (!this.avatar_urls.isEmpty()) {
            sb.append(", avatar_urls=");
            sb.append(this.avatar_urls);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.lark_id != null) {
            sb.append(", lark_id=");
            sb.append(this.lark_id);
        }
        if (this.subtitle != null) {
            sb.append(", subtitle=");
            sb.append(this.subtitle);
        }
        if (!this.title_hit_terms.isEmpty()) {
            sb.append(", title_hit_terms=");
            sb.append(this.title_hit_terms);
        }
        if (!this.email_hit_terms.isEmpty()) {
            sb.append(", email_hit_terms=");
            sb.append(this.email_hit_terms);
        }
        if (this.mail_group_type != null) {
            sb.append(", mail_group_type=");
            sb.append(this.mail_group_type);
        }
        if (this.tenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.tenant_id);
        }
        if (this.display_name != null) {
            sb.append(", display_name=");
            sb.append(this.display_name);
        }
        if (this.chat_group_members_count != null) {
            sb.append(", chat_group_members_count=");
            sb.append(this.chat_group_members_count);
        }
        StringBuilder replace = sb.replace(0, 2, "MailContactSearchResult{");
        replace.append('}');
        return replace.toString();
    }

    public MailContactSearchResult(Type type2, String str, String str2, List<String> list, String str3, String str4, String str5, List<String> list2, List<String> list3, MailGroupType mailGroupType, String str6, String str7, Long l) {
        this(type2, str, str2, list, str3, str4, str5, list2, list3, mailGroupType, str6, str7, l, ByteString.EMPTY);
    }

    public MailContactSearchResult(Type type2, String str, String str2, List<String> list, String str3, String str4, String str5, List<String> list2, List<String> list3, MailGroupType mailGroupType, String str6, String str7, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.title = str;
        this.email = str2;
        this.avatar_urls = Internal.immutableCopyOf("avatar_urls", list);
        this.avatar_key = str3;
        this.lark_id = str4;
        this.subtitle = str5;
        this.title_hit_terms = Internal.immutableCopyOf("title_hit_terms", list2);
        this.email_hit_terms = Internal.immutableCopyOf("email_hit_terms", list3);
        this.mail_group_type = mailGroupType;
        this.tenant_id = str6;
        this.display_name = str7;
        this.chat_group_members_count = l;
    }
}
