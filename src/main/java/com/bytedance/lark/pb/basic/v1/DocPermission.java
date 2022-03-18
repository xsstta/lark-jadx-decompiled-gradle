package com.bytedance.lark.pb.basic.v1;

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

public final class DocPermission extends Message<DocPermission, C14888a> {
    public static final ProtoAdapter<DocPermission> ADAPTER = new C14889b();
    public static final Long DEFAULT_AUTHED_BY_USER_ID = 0L;
    public static final Integer DEFAULT_AUTHED_PERM = -1;
    public static final Long DEFAULT_EXPIRES = 0L;
    public static final Boolean DEFAULT_MESSAGE_EXISTED = false;
    public static final Integer DEFAULT_RECEIVER_PERM = 0;
    public static final Integer DEFAULT_SELECTED_PERMISSION_INDEX = 0;
    public static final Boolean DEFAULT_SENDER_IS_EXTERNAL = false;
    public static final Long DEFAULT_SHARE_STATUS = 0L;
    public static final Boolean DEFAULT_SHOULD_RENDER = false;
    public static final Integer DEFAULT_USER_PERM = -1;
    private static final long serialVersionUID = 0;
    public final Long authed_by_user_id;
    public final Integer authed_perm;
    public final String channel_id;
    public final String doc_url;
    public final Long expires;
    public final String extra;
    public final String key;
    public final Boolean message_existed;
    public final String message_id;
    public final List<Permission> optional_permissions;
    public final Integer receiver_perm;
    public final Integer selected_permission_index;
    public final Boolean sender_is_external;
    public final Long share_status;
    public final String share_text;
    public final Boolean should_render;
    public final String thumbnail_detail;
    public final String title;
    public final Integer user_perm;

    public static final class Permission extends Message<Permission, C14886a> {
        public static final ProtoAdapter<Permission> ADAPTER = new C14887b();
        public static final Integer DEFAULT_CODE = 0;
        private static final long serialVersionUID = 0;
        public final Integer code;
        public final String name;

        /* renamed from: com.bytedance.lark.pb.basic.v1.DocPermission$Permission$b */
        private static final class C14887b extends ProtoAdapter<Permission> {
            C14887b() {
                super(FieldEncoding.LENGTH_DELIMITED, Permission.class);
            }

            /* renamed from: a */
            public int encodedSize(Permission permission) {
                int i;
                int i2 = 0;
                if (permission.code != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(1, permission.code);
                } else {
                    i = 0;
                }
                if (permission.name != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, permission.name);
                }
                return i + i2 + permission.unknownFields().size();
            }

            /* renamed from: a */
            public Permission decode(ProtoReader protoReader) throws IOException {
                C14886a aVar = new C14886a();
                aVar.f39384a = 0;
                aVar.f39385b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f39384a = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f39385b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Permission permission) throws IOException {
                if (permission.code != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, permission.code);
                }
                if (permission.name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, permission.name);
                }
                protoWriter.writeBytes(permission.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.DocPermission$Permission$a */
        public static final class C14886a extends Message.Builder<Permission, C14886a> {

            /* renamed from: a */
            public Integer f39384a;

            /* renamed from: b */
            public String f39385b;

            /* renamed from: a */
            public Permission build() {
                return new Permission(this.f39384a, this.f39385b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14886a newBuilder() {
            C14886a aVar = new C14886a();
            aVar.f39384a = this.code;
            aVar.f39385b = this.name;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "Permission");
            StringBuilder sb = new StringBuilder();
            if (this.code != null) {
                sb.append(", code=");
                sb.append(this.code);
            }
            if (this.name != null) {
                sb.append(", name=");
                sb.append(this.name);
            }
            StringBuilder replace = sb.replace(0, 2, "Permission{");
            replace.append('}');
            return replace.toString();
        }

        public Permission(Integer num, String str) {
            this(num, str, ByteString.EMPTY);
        }

        public Permission(Integer num, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.code = num;
            this.name = str;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.DocPermission$b */
    private static final class C14889b extends ProtoAdapter<DocPermission> {
        C14889b() {
            super(FieldEncoding.LENGTH_DELIMITED, DocPermission.class);
        }

        /* renamed from: a */
        public int encodedSize(DocPermission docPermission) {
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
            int i18 = 0;
            if (docPermission.key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, docPermission.key);
            } else {
                i = 0;
            }
            if (docPermission.message_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, docPermission.message_id);
            } else {
                i2 = 0;
            }
            int i19 = i + i2;
            if (docPermission.channel_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, docPermission.channel_id);
            } else {
                i3 = 0;
            }
            int encodedSizeWithTag = i19 + i3 + Permission.ADAPTER.asRepeated().encodedSizeWithTag(4, docPermission.optional_permissions);
            if (docPermission.selected_permission_index != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(5, docPermission.selected_permission_index);
            } else {
                i4 = 0;
            }
            int i20 = encodedSizeWithTag + i4;
            if (docPermission.share_text != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, docPermission.share_text);
            } else {
                i5 = 0;
            }
            int i21 = i20 + i5;
            if (docPermission.should_render != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(7, docPermission.should_render);
            } else {
                i6 = 0;
            }
            int i22 = i21 + i6;
            if (docPermission.title != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(8, docPermission.title);
            } else {
                i7 = 0;
            }
            int i23 = i22 + i7;
            if (docPermission.expires != null) {
                i8 = ProtoAdapter.INT64.encodedSizeWithTag(9, docPermission.expires);
            } else {
                i8 = 0;
            }
            int i24 = i23 + i8;
            if (docPermission.user_perm != null) {
                i9 = ProtoAdapter.INT32.encodedSizeWithTag(10, docPermission.user_perm);
            } else {
                i9 = 0;
            }
            int i25 = i24 + i9;
            if (docPermission.authed_by_user_id != null) {
                i10 = ProtoAdapter.INT64.encodedSizeWithTag(11, docPermission.authed_by_user_id);
            } else {
                i10 = 0;
            }
            int i26 = i25 + i10;
            if (docPermission.authed_perm != null) {
                i11 = ProtoAdapter.INT32.encodedSizeWithTag(12, docPermission.authed_perm);
            } else {
                i11 = 0;
            }
            int i27 = i26 + i11;
            if (docPermission.message_existed != null) {
                i12 = ProtoAdapter.BOOL.encodedSizeWithTag(13, docPermission.message_existed);
            } else {
                i12 = 0;
            }
            int i28 = i27 + i12;
            if (docPermission.share_status != null) {
                i13 = ProtoAdapter.INT64.encodedSizeWithTag(14, docPermission.share_status);
            } else {
                i13 = 0;
            }
            int i29 = i28 + i13;
            if (docPermission.thumbnail_detail != null) {
                i14 = ProtoAdapter.STRING.encodedSizeWithTag(15, docPermission.thumbnail_detail);
            } else {
                i14 = 0;
            }
            int i30 = i29 + i14;
            if (docPermission.doc_url != null) {
                i15 = ProtoAdapter.STRING.encodedSizeWithTag(16, docPermission.doc_url);
            } else {
                i15 = 0;
            }
            int i31 = i30 + i15;
            if (docPermission.receiver_perm != null) {
                i16 = ProtoAdapter.INT32.encodedSizeWithTag(17, docPermission.receiver_perm);
            } else {
                i16 = 0;
            }
            int i32 = i31 + i16;
            if (docPermission.sender_is_external != null) {
                i17 = ProtoAdapter.BOOL.encodedSizeWithTag(18, docPermission.sender_is_external);
            } else {
                i17 = 0;
            }
            int i33 = i32 + i17;
            if (docPermission.extra != null) {
                i18 = ProtoAdapter.STRING.encodedSizeWithTag(19, docPermission.extra);
            }
            return i33 + i18 + docPermission.unknownFields().size();
        }

        /* renamed from: a */
        public DocPermission decode(ProtoReader protoReader) throws IOException {
            C14888a aVar = new C14888a();
            aVar.f39386a = "";
            aVar.f39387b = "";
            aVar.f39388c = "";
            aVar.f39390e = 0;
            aVar.f39391f = "";
            aVar.f39392g = false;
            aVar.f39393h = "";
            aVar.f39394i = 0L;
            aVar.f39395j = -1;
            aVar.f39396k = 0L;
            aVar.f39397l = -1;
            aVar.f39398m = false;
            aVar.f39399n = 0L;
            aVar.f39400o = "";
            aVar.f39401p = "";
            aVar.f39402q = 0;
            aVar.f39403r = false;
            aVar.f39404s = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f39386a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f39387b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f39388c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f39389d.add(Permission.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            aVar.f39390e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f39391f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f39392g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            aVar.f39393h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f39394i = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 10:
                            aVar.f39395j = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 11:
                            aVar.f39396k = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f39397l = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 13:
                            aVar.f39398m = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 14:
                            aVar.f39399n = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 15:
                            aVar.f39400o = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            aVar.f39401p = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 17:
                            aVar.f39402q = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 18:
                            aVar.f39403r = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 19:
                            aVar.f39404s = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, DocPermission docPermission) throws IOException {
            if (docPermission.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, docPermission.key);
            }
            if (docPermission.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, docPermission.message_id);
            }
            if (docPermission.channel_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, docPermission.channel_id);
            }
            Permission.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, docPermission.optional_permissions);
            if (docPermission.selected_permission_index != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, docPermission.selected_permission_index);
            }
            if (docPermission.share_text != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, docPermission.share_text);
            }
            if (docPermission.should_render != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, docPermission.should_render);
            }
            if (docPermission.title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, docPermission.title);
            }
            if (docPermission.expires != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 9, docPermission.expires);
            }
            if (docPermission.user_perm != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, docPermission.user_perm);
            }
            if (docPermission.authed_by_user_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 11, docPermission.authed_by_user_id);
            }
            if (docPermission.authed_perm != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 12, docPermission.authed_perm);
            }
            if (docPermission.message_existed != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 13, docPermission.message_existed);
            }
            if (docPermission.share_status != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 14, docPermission.share_status);
            }
            if (docPermission.thumbnail_detail != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, docPermission.thumbnail_detail);
            }
            if (docPermission.doc_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 16, docPermission.doc_url);
            }
            if (docPermission.receiver_perm != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 17, docPermission.receiver_perm);
            }
            if (docPermission.sender_is_external != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 18, docPermission.sender_is_external);
            }
            if (docPermission.extra != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 19, docPermission.extra);
            }
            protoWriter.writeBytes(docPermission.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.DocPermission$a */
    public static final class C14888a extends Message.Builder<DocPermission, C14888a> {

        /* renamed from: a */
        public String f39386a;

        /* renamed from: b */
        public String f39387b;

        /* renamed from: c */
        public String f39388c;

        /* renamed from: d */
        public List<Permission> f39389d = Internal.newMutableList();

        /* renamed from: e */
        public Integer f39390e;

        /* renamed from: f */
        public String f39391f;

        /* renamed from: g */
        public Boolean f39392g;

        /* renamed from: h */
        public String f39393h;

        /* renamed from: i */
        public Long f39394i;

        /* renamed from: j */
        public Integer f39395j;

        /* renamed from: k */
        public Long f39396k;

        /* renamed from: l */
        public Integer f39397l;

        /* renamed from: m */
        public Boolean f39398m;

        /* renamed from: n */
        public Long f39399n;

        /* renamed from: o */
        public String f39400o;

        /* renamed from: p */
        public String f39401p;

        /* renamed from: q */
        public Integer f39402q;

        /* renamed from: r */
        public Boolean f39403r;

        /* renamed from: s */
        public String f39404s;

        /* renamed from: a */
        public DocPermission build() {
            return new DocPermission(this.f39386a, this.f39387b, this.f39388c, this.f39389d, this.f39390e, this.f39391f, this.f39392g, this.f39393h, this.f39394i, this.f39395j, this.f39396k, this.f39397l, this.f39398m, this.f39399n, this.f39400o, this.f39401p, this.f39402q, this.f39403r, this.f39404s, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14888a newBuilder() {
        C14888a aVar = new C14888a();
        aVar.f39386a = this.key;
        aVar.f39387b = this.message_id;
        aVar.f39388c = this.channel_id;
        aVar.f39389d = Internal.copyOf("optional_permissions", this.optional_permissions);
        aVar.f39390e = this.selected_permission_index;
        aVar.f39391f = this.share_text;
        aVar.f39392g = this.should_render;
        aVar.f39393h = this.title;
        aVar.f39394i = this.expires;
        aVar.f39395j = this.user_perm;
        aVar.f39396k = this.authed_by_user_id;
        aVar.f39397l = this.authed_perm;
        aVar.f39398m = this.message_existed;
        aVar.f39399n = this.share_status;
        aVar.f39400o = this.thumbnail_detail;
        aVar.f39401p = this.doc_url;
        aVar.f39402q = this.receiver_perm;
        aVar.f39403r = this.sender_is_external;
        aVar.f39404s = this.extra;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "DocPermission");
        StringBuilder sb = new StringBuilder();
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.channel_id != null) {
            sb.append(", channel_id=");
            sb.append(this.channel_id);
        }
        if (!this.optional_permissions.isEmpty()) {
            sb.append(", optional_permissions=");
            sb.append(this.optional_permissions);
        }
        if (this.selected_permission_index != null) {
            sb.append(", selected_permission_index=");
            sb.append(this.selected_permission_index);
        }
        if (this.share_text != null) {
            sb.append(", share_text=");
            sb.append(this.share_text);
        }
        if (this.should_render != null) {
            sb.append(", should_render=");
            sb.append(this.should_render);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.expires != null) {
            sb.append(", expires=");
            sb.append(this.expires);
        }
        if (this.user_perm != null) {
            sb.append(", user_perm=");
            sb.append(this.user_perm);
        }
        if (this.authed_by_user_id != null) {
            sb.append(", authed_by_user_id=");
            sb.append(this.authed_by_user_id);
        }
        if (this.authed_perm != null) {
            sb.append(", authed_perm=");
            sb.append(this.authed_perm);
        }
        if (this.message_existed != null) {
            sb.append(", message_existed=");
            sb.append(this.message_existed);
        }
        if (this.share_status != null) {
            sb.append(", share_status=");
            sb.append(this.share_status);
        }
        if (this.thumbnail_detail != null) {
            sb.append(", thumbnail_detail=");
            sb.append(this.thumbnail_detail);
        }
        if (this.doc_url != null) {
            sb.append(", doc_url=");
            sb.append(this.doc_url);
        }
        if (this.receiver_perm != null) {
            sb.append(", receiver_perm=");
            sb.append(this.receiver_perm);
        }
        if (this.sender_is_external != null) {
            sb.append(", sender_is_external=");
            sb.append(this.sender_is_external);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        StringBuilder replace = sb.replace(0, 2, "DocPermission{");
        replace.append('}');
        return replace.toString();
    }

    public DocPermission(String str, String str2, String str3, List<Permission> list, Integer num, String str4, Boolean bool, String str5, Long l, Integer num2, Long l2, Integer num3, Boolean bool2, Long l3, String str6, String str7, Integer num4, Boolean bool3, String str8) {
        this(str, str2, str3, list, num, str4, bool, str5, l, num2, l2, num3, bool2, l3, str6, str7, num4, bool3, str8, ByteString.EMPTY);
    }

    public DocPermission(String str, String str2, String str3, List<Permission> list, Integer num, String str4, Boolean bool, String str5, Long l, Integer num2, Long l2, Integer num3, Boolean bool2, Long l3, String str6, String str7, Integer num4, Boolean bool3, String str8, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.message_id = str2;
        this.channel_id = str3;
        this.optional_permissions = Internal.immutableCopyOf("optional_permissions", list);
        this.selected_permission_index = num;
        this.share_text = str4;
        this.should_render = bool;
        this.title = str5;
        this.expires = l;
        this.user_perm = num2;
        this.authed_by_user_id = l2;
        this.authed_perm = num3;
        this.message_existed = bool2;
        this.share_status = l3;
        this.thumbnail_detail = str6;
        this.doc_url = str7;
        this.receiver_perm = num4;
        this.sender_is_external = bool3;
        this.extra = str8;
    }
}
