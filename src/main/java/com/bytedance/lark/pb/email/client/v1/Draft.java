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

public final class Draft extends Message<Draft, C16608a> {
    public static final ProtoAdapter<Draft> ADAPTER = new C16609b();
    public static final Long DEFAULT_CREATED_TIMESTAMP = 0L;
    public static final Boolean DEFAULT_IS_SEND_SEPARATELY = false;
    public static final Long DEFAULT_LAST_UPDATED_TIMESTAMP = 0L;
    public static final PermissionCode DEFAULT_PERMISSION_CODE = PermissionCode.NONE;
    private static final long serialVersionUID = 0;
    public final List<Attachment> attachments;
    public final List<Address> bcc;
    public final String body_html;
    public final String body_plaintext;
    public final List<Address> cc;
    public final Long created_timestamp;
    public final String doc_id;
    public final List<DocsPermissionConfig> docs_permissions;
    public final EmailAlias email_alias;
    public final Address from;
    public final String id;
    public final List<DraftImage> images;
    public final Boolean is_send_separately;
    public final Long last_updated_timestamp;
    public final PermissionCode permission_code;
    public final String reply_message_id;
    public final String reply_share_message_id;
    public final String subject;
    public final String thread_id;
    public final List<Address> to;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.Draft$b */
    private static final class C16609b extends ProtoAdapter<Draft> {
        C16609b() {
            super(FieldEncoding.LENGTH_DELIMITED, Draft.class);
        }

        /* renamed from: a */
        public int encodedSize(Draft draft) {
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
            int i14 = 0;
            if (draft.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, draft.id);
            } else {
                i = 0;
            }
            if (draft.from != null) {
                i2 = Address.ADAPTER.encodedSizeWithTag(2, draft.from);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag = i + i2 + Address.ADAPTER.asRepeated().encodedSizeWithTag(3, draft.to) + Address.ADAPTER.asRepeated().encodedSizeWithTag(4, draft.cc) + Address.ADAPTER.asRepeated().encodedSizeWithTag(5, draft.bcc);
            if (draft.subject != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(6, draft.subject);
            } else {
                i3 = 0;
            }
            int i15 = encodedSizeWithTag + i3;
            if (draft.body_html != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(7, draft.body_html);
            } else {
                i4 = 0;
            }
            int encodedSizeWithTag2 = i15 + i4 + Attachment.ADAPTER.asRepeated().encodedSizeWithTag(8, draft.attachments);
            if (draft.last_updated_timestamp != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(9, draft.last_updated_timestamp);
            } else {
                i5 = 0;
            }
            int i16 = encodedSizeWithTag2 + i5;
            if (draft.created_timestamp != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(10, draft.created_timestamp);
            } else {
                i6 = 0;
            }
            int encodedSizeWithTag3 = i16 + i6 + DraftImage.ADAPTER.asRepeated().encodedSizeWithTag(11, draft.images);
            if (draft.body_plaintext != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(12, draft.body_plaintext);
            } else {
                i7 = 0;
            }
            int encodedSizeWithTag4 = encodedSizeWithTag3 + i7 + DocsPermissionConfig.ADAPTER.asRepeated().encodedSizeWithTag(13, draft.docs_permissions);
            if (draft.doc_id != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(14, draft.doc_id);
            } else {
                i8 = 0;
            }
            int i17 = encodedSizeWithTag4 + i8;
            if (draft.reply_message_id != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(15, draft.reply_message_id);
            } else {
                i9 = 0;
            }
            int i18 = i17 + i9;
            if (draft.email_alias != null) {
                i10 = EmailAlias.ADAPTER.encodedSizeWithTag(16, draft.email_alias);
            } else {
                i10 = 0;
            }
            int i19 = i18 + i10;
            if (draft.thread_id != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(17, draft.thread_id);
            } else {
                i11 = 0;
            }
            int i20 = i19 + i11;
            if (draft.permission_code != null) {
                i12 = PermissionCode.ADAPTER.encodedSizeWithTag(18, draft.permission_code);
            } else {
                i12 = 0;
            }
            int i21 = i20 + i12;
            if (draft.reply_share_message_id != null) {
                i13 = ProtoAdapter.STRING.encodedSizeWithTag(19, draft.reply_share_message_id);
            } else {
                i13 = 0;
            }
            int i22 = i21 + i13;
            if (draft.is_send_separately != null) {
                i14 = ProtoAdapter.BOOL.encodedSizeWithTag(20, draft.is_send_separately);
            }
            return i22 + i14 + draft.unknownFields().size();
        }

        /* renamed from: a */
        public Draft decode(ProtoReader protoReader) throws IOException {
            C16608a aVar = new C16608a();
            aVar.f42997a = "";
            aVar.f43002f = "";
            aVar.f43003g = "";
            aVar.f43005i = 0L;
            aVar.f43006j = 0L;
            aVar.f43008l = "";
            aVar.f43010n = "";
            aVar.f43011o = "";
            aVar.f43013q = "";
            aVar.f43014r = PermissionCode.NONE;
            aVar.f43015s = "";
            aVar.f43016t = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f42997a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f42998b = Address.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f42999c.add(Address.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            aVar.f43000d.add(Address.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            aVar.f43001e.add(Address.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            aVar.f43002f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f43003g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f43004h.add(Attachment.ADAPTER.decode(protoReader));
                            break;
                        case 9:
                            aVar.f43005i = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 10:
                            aVar.f43006j = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 11:
                            aVar.f43007k.add(DraftImage.ADAPTER.decode(protoReader));
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f43008l = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 13:
                            aVar.f43009m.add(DocsPermissionConfig.ADAPTER.decode(protoReader));
                            break;
                        case 14:
                            aVar.f43010n = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            aVar.f43011o = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            aVar.f43012p = EmailAlias.ADAPTER.decode(protoReader);
                            break;
                        case 17:
                            aVar.f43013q = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 18:
                            try {
                                aVar.f43014r = PermissionCode.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 19:
                            aVar.f43015s = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 20:
                            aVar.f43016t = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, Draft draft) throws IOException {
            if (draft.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, draft.id);
            }
            if (draft.from != null) {
                Address.ADAPTER.encodeWithTag(protoWriter, 2, draft.from);
            }
            Address.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, draft.to);
            Address.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, draft.cc);
            Address.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, draft.bcc);
            if (draft.subject != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, draft.subject);
            }
            if (draft.body_html != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, draft.body_html);
            }
            Attachment.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, draft.attachments);
            if (draft.last_updated_timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 9, draft.last_updated_timestamp);
            }
            if (draft.created_timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 10, draft.created_timestamp);
            }
            DraftImage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 11, draft.images);
            if (draft.body_plaintext != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, draft.body_plaintext);
            }
            DocsPermissionConfig.ADAPTER.asRepeated().encodeWithTag(protoWriter, 13, draft.docs_permissions);
            if (draft.doc_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, draft.doc_id);
            }
            if (draft.reply_message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, draft.reply_message_id);
            }
            if (draft.email_alias != null) {
                EmailAlias.ADAPTER.encodeWithTag(protoWriter, 16, draft.email_alias);
            }
            if (draft.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 17, draft.thread_id);
            }
            if (draft.permission_code != null) {
                PermissionCode.ADAPTER.encodeWithTag(protoWriter, 18, draft.permission_code);
            }
            if (draft.reply_share_message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 19, draft.reply_share_message_id);
            }
            if (draft.is_send_separately != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 20, draft.is_send_separately);
            }
            protoWriter.writeBytes(draft.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.Draft$a */
    public static final class C16608a extends Message.Builder<Draft, C16608a> {

        /* renamed from: a */
        public String f42997a;

        /* renamed from: b */
        public Address f42998b;

        /* renamed from: c */
        public List<Address> f42999c = Internal.newMutableList();

        /* renamed from: d */
        public List<Address> f43000d = Internal.newMutableList();

        /* renamed from: e */
        public List<Address> f43001e = Internal.newMutableList();

        /* renamed from: f */
        public String f43002f;

        /* renamed from: g */
        public String f43003g;

        /* renamed from: h */
        public List<Attachment> f43004h = Internal.newMutableList();

        /* renamed from: i */
        public Long f43005i;

        /* renamed from: j */
        public Long f43006j;

        /* renamed from: k */
        public List<DraftImage> f43007k = Internal.newMutableList();

        /* renamed from: l */
        public String f43008l;

        /* renamed from: m */
        public List<DocsPermissionConfig> f43009m = Internal.newMutableList();

        /* renamed from: n */
        public String f43010n;

        /* renamed from: o */
        public String f43011o;

        /* renamed from: p */
        public EmailAlias f43012p;

        /* renamed from: q */
        public String f43013q;

        /* renamed from: r */
        public PermissionCode f43014r;

        /* renamed from: s */
        public String f43015s;

        /* renamed from: t */
        public Boolean f43016t;

        /* renamed from: a */
        public Draft build() {
            return new Draft(this.f42997a, this.f42998b, this.f42999c, this.f43000d, this.f43001e, this.f43002f, this.f43003g, this.f43004h, this.f43005i, this.f43006j, this.f43007k, this.f43008l, this.f43009m, this.f43010n, this.f43011o, this.f43012p, this.f43013q, this.f43014r, this.f43015s, this.f43016t, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16608a newBuilder() {
        C16608a aVar = new C16608a();
        aVar.f42997a = this.id;
        aVar.f42998b = this.from;
        aVar.f42999c = Internal.copyOf("to", this.to);
        aVar.f43000d = Internal.copyOf("cc", this.cc);
        aVar.f43001e = Internal.copyOf("bcc", this.bcc);
        aVar.f43002f = this.subject;
        aVar.f43003g = this.body_html;
        aVar.f43004h = Internal.copyOf("attachments", this.attachments);
        aVar.f43005i = this.last_updated_timestamp;
        aVar.f43006j = this.created_timestamp;
        aVar.f43007k = Internal.copyOf("images", this.images);
        aVar.f43008l = this.body_plaintext;
        aVar.f43009m = Internal.copyOf("docs_permissions", this.docs_permissions);
        aVar.f43010n = this.doc_id;
        aVar.f43011o = this.reply_message_id;
        aVar.f43012p = this.email_alias;
        aVar.f43013q = this.thread_id;
        aVar.f43014r = this.permission_code;
        aVar.f43015s = this.reply_share_message_id;
        aVar.f43016t = this.is_send_separately;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "Draft");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.from != null) {
            sb.append(", from=");
            sb.append(this.from);
        }
        if (!this.to.isEmpty()) {
            sb.append(", to=");
            sb.append(this.to);
        }
        if (!this.cc.isEmpty()) {
            sb.append(", cc=");
            sb.append(this.cc);
        }
        if (!this.bcc.isEmpty()) {
            sb.append(", bcc=");
            sb.append(this.bcc);
        }
        if (this.subject != null) {
            sb.append(", subject=");
            sb.append(this.subject);
        }
        if (this.body_html != null) {
            sb.append(", body_html=");
            sb.append(this.body_html);
        }
        if (!this.attachments.isEmpty()) {
            sb.append(", attachments=");
            sb.append(this.attachments);
        }
        if (this.last_updated_timestamp != null) {
            sb.append(", last_updated_timestamp=");
            sb.append(this.last_updated_timestamp);
        }
        if (this.created_timestamp != null) {
            sb.append(", created_timestamp=");
            sb.append(this.created_timestamp);
        }
        if (!this.images.isEmpty()) {
            sb.append(", images=");
            sb.append(this.images);
        }
        if (this.body_plaintext != null) {
            sb.append(", body_plaintext=");
            sb.append(this.body_plaintext);
        }
        if (!this.docs_permissions.isEmpty()) {
            sb.append(", docs_permissions=");
            sb.append(this.docs_permissions);
        }
        if (this.doc_id != null) {
            sb.append(", doc_id=");
            sb.append(this.doc_id);
        }
        if (this.reply_message_id != null) {
            sb.append(", reply_message_id=");
            sb.append(this.reply_message_id);
        }
        if (this.email_alias != null) {
            sb.append(", email_alias=");
            sb.append(this.email_alias);
        }
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        if (this.permission_code != null) {
            sb.append(", permission_code=");
            sb.append(this.permission_code);
        }
        if (this.reply_share_message_id != null) {
            sb.append(", reply_share_message_id=");
            sb.append(this.reply_share_message_id);
        }
        if (this.is_send_separately != null) {
            sb.append(", is_send_separately=");
            sb.append(this.is_send_separately);
        }
        StringBuilder replace = sb.replace(0, 2, "Draft{");
        replace.append('}');
        return replace.toString();
    }

    public Draft(String str, Address address, List<Address> list, List<Address> list2, List<Address> list3, String str2, String str3, List<Attachment> list4, Long l, Long l2, List<DraftImage> list5, String str4, List<DocsPermissionConfig> list6, String str5, String str6, EmailAlias emailAlias, String str7, PermissionCode permissionCode, String str8, Boolean bool) {
        this(str, address, list, list2, list3, str2, str3, list4, l, l2, list5, str4, list6, str5, str6, emailAlias, str7, permissionCode, str8, bool, ByteString.EMPTY);
    }

    public Draft(String str, Address address, List<Address> list, List<Address> list2, List<Address> list3, String str2, String str3, List<Attachment> list4, Long l, Long l2, List<DraftImage> list5, String str4, List<DocsPermissionConfig> list6, String str5, String str6, EmailAlias emailAlias, String str7, PermissionCode permissionCode, String str8, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.from = address;
        this.to = Internal.immutableCopyOf("to", list);
        this.cc = Internal.immutableCopyOf("cc", list2);
        this.bcc = Internal.immutableCopyOf("bcc", list3);
        this.subject = str2;
        this.body_html = str3;
        this.attachments = Internal.immutableCopyOf("attachments", list4);
        this.last_updated_timestamp = l;
        this.created_timestamp = l2;
        this.images = Internal.immutableCopyOf("images", list5);
        this.body_plaintext = str4;
        this.docs_permissions = Internal.immutableCopyOf("docs_permissions", list6);
        this.doc_id = str5;
        this.reply_message_id = str6;
        this.email_alias = emailAlias;
        this.thread_id = str7;
        this.permission_code = permissionCode;
        this.reply_share_message_id = str8;
        this.is_send_separately = bool;
    }
}
