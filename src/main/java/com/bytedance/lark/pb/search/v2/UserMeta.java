package com.bytedance.lark.pb.search.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ActionType;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.DeniedReason;
import com.bytedance.lark.pb.basic.v1.Tag;
import com.bytedance.lark.pb.basic.v1.WorkStatus;
import com.bytedance.lark.pb.search.v1.TimeZone;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class UserMeta extends Message<UserMeta, C19109a> {
    public static final ProtoAdapter<UserMeta> ADAPTER = new C19110b();
    public static final Boolean DEFAULT_ACCEPT_SMS_PHONE_URGENT = false;
    public static final Chatter.Description.Type DEFAULT_DESCRIPTION_FLAG = Chatter.Description.Type.ON_DEFAULT;
    public static final Long DEFAULT_DO_NOT_DISTURB_END_TIME = 0L;
    public static final Boolean DEFAULT_IS_REGISTERED = false;
    private static final long serialVersionUID = 0;
    public final Boolean accept_sms_phone_urgent;
    public final List<Chatter.ChatterCustomStatus> custom_status;
    public final List<ActionType> denied_permissions;
    public final Map<Integer, DeniedReason> denied_reason;
    public final String description;
    public final Chatter.Description.Type description_flag;
    public final Long do_not_disturb_end_time;
    public final String enterprise_mail_address;
    public final ExtraFields extra_fields;
    public final String id;
    public final Boolean is_registered;
    public final String mail_address;
    public final SimpleP2PChatInfo p2p_chat_info;
    public final List<Tag> tags;
    public final String tenant_id;
    public final TimeZone timezone;
    public final WorkStatus work_status;

    public static final class ExtraFields extends Message<ExtraFields, C19107a> {
        public static final ProtoAdapter<ExtraFields> ADAPTER = new C19108b();
        public static final Boolean DEFAULT_IS_IN_CHAT = false;
        private static final long serialVersionUID = 0;
        public final Boolean is_in_chat;

        /* renamed from: com.bytedance.lark.pb.search.v2.UserMeta$ExtraFields$b */
        private static final class C19108b extends ProtoAdapter<ExtraFields> {
            C19108b() {
                super(FieldEncoding.LENGTH_DELIMITED, ExtraFields.class);
            }

            /* renamed from: a */
            public int encodedSize(ExtraFields extraFields) {
                int i;
                if (extraFields.is_in_chat != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, extraFields.is_in_chat);
                } else {
                    i = 0;
                }
                return i + extraFields.unknownFields().size();
            }

            /* renamed from: a */
            public ExtraFields decode(ProtoReader protoReader) throws IOException {
                C19107a aVar = new C19107a();
                aVar.f47220a = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag != 1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f47220a = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ExtraFields extraFields) throws IOException {
                if (extraFields.is_in_chat != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, extraFields.is_in_chat);
                }
                protoWriter.writeBytes(extraFields.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.UserMeta$ExtraFields$a */
        public static final class C19107a extends Message.Builder<ExtraFields, C19107a> {

            /* renamed from: a */
            public Boolean f47220a;

            /* renamed from: a */
            public ExtraFields build() {
                return new ExtraFields(this.f47220a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19107a newBuilder() {
            C19107a aVar = new C19107a();
            aVar.f47220a = this.is_in_chat;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "ExtraFields");
            StringBuilder sb = new StringBuilder();
            if (this.is_in_chat != null) {
                sb.append(", is_in_chat=");
                sb.append(this.is_in_chat);
            }
            StringBuilder replace = sb.replace(0, 2, "ExtraFields{");
            replace.append('}');
            return replace.toString();
        }

        public ExtraFields(Boolean bool) {
            this(bool, ByteString.EMPTY);
        }

        public ExtraFields(Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.is_in_chat = bool;
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.UserMeta$b */
    private static final class C19110b extends ProtoAdapter<UserMeta> {

        /* renamed from: a */
        private final ProtoAdapter<Map<Integer, DeniedReason>> f47238a = ProtoAdapter.newMapAdapter(ProtoAdapter.INT32, DeniedReason.ADAPTER);

        C19110b() {
            super(FieldEncoding.LENGTH_DELIMITED, UserMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(UserMeta userMeta) {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, userMeta.id);
            int i12 = 0;
            if (userMeta.is_registered != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, userMeta.is_registered);
            } else {
                i = 0;
            }
            int i13 = encodedSizeWithTag + i;
            if (userMeta.tenant_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, userMeta.tenant_id);
            } else {
                i2 = 0;
            }
            int i14 = i13 + i2;
            if (userMeta.mail_address != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, userMeta.mail_address);
            } else {
                i3 = 0;
            }
            int i15 = i14 + i3;
            if (userMeta.do_not_disturb_end_time != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(5, userMeta.do_not_disturb_end_time);
            } else {
                i4 = 0;
            }
            int i16 = i15 + i4;
            if (userMeta.accept_sms_phone_urgent != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(6, userMeta.accept_sms_phone_urgent);
            } else {
                i5 = 0;
            }
            int i17 = i16 + i5;
            if (userMeta.timezone != null) {
                i6 = TimeZone.ADAPTER.encodedSizeWithTag(8, userMeta.timezone);
            } else {
                i6 = 0;
            }
            int i18 = i17 + i6;
            if (userMeta.description != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(9, userMeta.description);
            } else {
                i7 = 0;
            }
            int i19 = i18 + i7;
            if (userMeta.description_flag != null) {
                i8 = Chatter.Description.Type.ADAPTER.encodedSizeWithTag(10, userMeta.description_flag);
            } else {
                i8 = 0;
            }
            int encodedSizeWithTag2 = i19 + i8 + ActionType.ADAPTER.asRepeated().encodedSizeWithTag(11, userMeta.denied_permissions) + this.f47238a.encodedSizeWithTag(12, userMeta.denied_reason);
            if (userMeta.work_status != null) {
                i9 = WorkStatus.ADAPTER.encodedSizeWithTag(13, userMeta.work_status);
            } else {
                i9 = 0;
            }
            int encodedSizeWithTag3 = encodedSizeWithTag2 + i9 + Tag.ADAPTER.asRepeated().encodedSizeWithTag(14, userMeta.tags);
            if (userMeta.p2p_chat_info != null) {
                i10 = SimpleP2PChatInfo.ADAPTER.encodedSizeWithTag(15, userMeta.p2p_chat_info);
            } else {
                i10 = 0;
            }
            int i20 = encodedSizeWithTag3 + i10;
            if (userMeta.extra_fields != null) {
                i11 = ExtraFields.ADAPTER.encodedSizeWithTag(16, userMeta.extra_fields);
            } else {
                i11 = 0;
            }
            int i21 = i20 + i11;
            if (userMeta.enterprise_mail_address != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(17, userMeta.enterprise_mail_address);
            }
            return i21 + i12 + Chatter.ChatterCustomStatus.ADAPTER.asRepeated().encodedSizeWithTag(18, userMeta.custom_status) + userMeta.unknownFields().size();
        }

        /* renamed from: a */
        public UserMeta decode(ProtoReader protoReader) throws IOException {
            C19109a aVar = new C19109a();
            aVar.f47221a = "";
            aVar.f47222b = false;
            aVar.f47223c = "";
            aVar.f47224d = "";
            aVar.f47225e = 0L;
            aVar.f47226f = false;
            aVar.f47228h = "";
            aVar.f47229i = Chatter.Description.Type.ON_DEFAULT;
            aVar.f47236p = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f47221a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f47222b = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            aVar.f47223c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f47224d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f47225e = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            aVar.f47226f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 8:
                            aVar.f47227g = TimeZone.ADAPTER.decode(protoReader);
                            break;
                        case 9:
                            aVar.f47228h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            try {
                                aVar.f47229i = Chatter.Description.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 11:
                            try {
                                aVar.f47230j.add(ActionType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f47231k.putAll(this.f47238a.decode(protoReader));
                            break;
                        case 13:
                            aVar.f47232l = WorkStatus.ADAPTER.decode(protoReader);
                            break;
                        case 14:
                            try {
                                aVar.f47233m.add(Tag.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 15:
                            aVar.f47234n = SimpleP2PChatInfo.ADAPTER.decode(protoReader);
                            break;
                        case 16:
                            aVar.f47235o = ExtraFields.ADAPTER.decode(protoReader);
                            break;
                        case 17:
                            aVar.f47236p = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 18:
                            aVar.f47237q.add(Chatter.ChatterCustomStatus.ADAPTER.decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UserMeta userMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, userMeta.id);
            if (userMeta.is_registered != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, userMeta.is_registered);
            }
            if (userMeta.tenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, userMeta.tenant_id);
            }
            if (userMeta.mail_address != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, userMeta.mail_address);
            }
            if (userMeta.do_not_disturb_end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, userMeta.do_not_disturb_end_time);
            }
            if (userMeta.accept_sms_phone_urgent != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, userMeta.accept_sms_phone_urgent);
            }
            if (userMeta.timezone != null) {
                TimeZone.ADAPTER.encodeWithTag(protoWriter, 8, userMeta.timezone);
            }
            if (userMeta.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, userMeta.description);
            }
            if (userMeta.description_flag != null) {
                Chatter.Description.Type.ADAPTER.encodeWithTag(protoWriter, 10, userMeta.description_flag);
            }
            ActionType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 11, userMeta.denied_permissions);
            this.f47238a.encodeWithTag(protoWriter, 12, userMeta.denied_reason);
            if (userMeta.work_status != null) {
                WorkStatus.ADAPTER.encodeWithTag(protoWriter, 13, userMeta.work_status);
            }
            Tag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 14, userMeta.tags);
            if (userMeta.p2p_chat_info != null) {
                SimpleP2PChatInfo.ADAPTER.encodeWithTag(protoWriter, 15, userMeta.p2p_chat_info);
            }
            if (userMeta.extra_fields != null) {
                ExtraFields.ADAPTER.encodeWithTag(protoWriter, 16, userMeta.extra_fields);
            }
            if (userMeta.enterprise_mail_address != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 17, userMeta.enterprise_mail_address);
            }
            Chatter.ChatterCustomStatus.ADAPTER.asRepeated().encodeWithTag(protoWriter, 18, userMeta.custom_status);
            protoWriter.writeBytes(userMeta.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.UserMeta$a */
    public static final class C19109a extends Message.Builder<UserMeta, C19109a> {

        /* renamed from: a */
        public String f47221a;

        /* renamed from: b */
        public Boolean f47222b;

        /* renamed from: c */
        public String f47223c;

        /* renamed from: d */
        public String f47224d;

        /* renamed from: e */
        public Long f47225e;

        /* renamed from: f */
        public Boolean f47226f;

        /* renamed from: g */
        public TimeZone f47227g;

        /* renamed from: h */
        public String f47228h;

        /* renamed from: i */
        public Chatter.Description.Type f47229i;

        /* renamed from: j */
        public List<ActionType> f47230j = Internal.newMutableList();

        /* renamed from: k */
        public Map<Integer, DeniedReason> f47231k = Internal.newMutableMap();

        /* renamed from: l */
        public WorkStatus f47232l;

        /* renamed from: m */
        public List<Tag> f47233m = Internal.newMutableList();

        /* renamed from: n */
        public SimpleP2PChatInfo f47234n;

        /* renamed from: o */
        public ExtraFields f47235o;

        /* renamed from: p */
        public String f47236p;

        /* renamed from: q */
        public List<Chatter.ChatterCustomStatus> f47237q = Internal.newMutableList();

        /* renamed from: a */
        public UserMeta build() {
            String str = this.f47221a;
            if (str != null) {
                return new UserMeta(str, this.f47222b, this.f47223c, this.f47224d, this.f47225e, this.f47226f, this.f47227g, this.f47228h, this.f47229i, this.f47230j, this.f47231k, this.f47232l, this.f47233m, this.f47234n, this.f47235o, this.f47236p, this.f47237q, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C19109a newBuilder() {
        C19109a aVar = new C19109a();
        aVar.f47221a = this.id;
        aVar.f47222b = this.is_registered;
        aVar.f47223c = this.tenant_id;
        aVar.f47224d = this.mail_address;
        aVar.f47225e = this.do_not_disturb_end_time;
        aVar.f47226f = this.accept_sms_phone_urgent;
        aVar.f47227g = this.timezone;
        aVar.f47228h = this.description;
        aVar.f47229i = this.description_flag;
        aVar.f47230j = Internal.copyOf("denied_permissions", this.denied_permissions);
        aVar.f47231k = Internal.copyOf("denied_reason", this.denied_reason);
        aVar.f47232l = this.work_status;
        aVar.f47233m = Internal.copyOf("tags", this.tags);
        aVar.f47234n = this.p2p_chat_info;
        aVar.f47235o = this.extra_fields;
        aVar.f47236p = this.enterprise_mail_address;
        aVar.f47237q = Internal.copyOf("custom_status", this.custom_status);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "UserMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.is_registered != null) {
            sb.append(", is_registered=");
            sb.append(this.is_registered);
        }
        if (this.tenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.tenant_id);
        }
        if (this.mail_address != null) {
            sb.append(", mail_address=");
            sb.append(this.mail_address);
        }
        if (this.do_not_disturb_end_time != null) {
            sb.append(", do_not_disturb_end_time=");
            sb.append(this.do_not_disturb_end_time);
        }
        if (this.accept_sms_phone_urgent != null) {
            sb.append(", accept_sms_phone_urgent=");
            sb.append(this.accept_sms_phone_urgent);
        }
        if (this.timezone != null) {
            sb.append(", timezone=");
            sb.append(this.timezone);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.description_flag != null) {
            sb.append(", description_flag=");
            sb.append(this.description_flag);
        }
        if (!this.denied_permissions.isEmpty()) {
            sb.append(", denied_permissions=");
            sb.append(this.denied_permissions);
        }
        if (!this.denied_reason.isEmpty()) {
            sb.append(", denied_reason=");
            sb.append(this.denied_reason);
        }
        if (this.work_status != null) {
            sb.append(", work_status=");
            sb.append(this.work_status);
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        if (this.p2p_chat_info != null) {
            sb.append(", p2p_chat_info=");
            sb.append(this.p2p_chat_info);
        }
        if (this.extra_fields != null) {
            sb.append(", extra_fields=");
            sb.append(this.extra_fields);
        }
        if (this.enterprise_mail_address != null) {
            sb.append(", enterprise_mail_address=");
            sb.append(this.enterprise_mail_address);
        }
        if (!this.custom_status.isEmpty()) {
            sb.append(", custom_status=");
            sb.append(this.custom_status);
        }
        StringBuilder replace = sb.replace(0, 2, "UserMeta{");
        replace.append('}');
        return replace.toString();
    }

    public UserMeta(String str, Boolean bool, String str2, String str3, Long l, Boolean bool2, TimeZone timeZone, String str4, Chatter.Description.Type type, List<ActionType> list, Map<Integer, DeniedReason> map, WorkStatus workStatus, List<Tag> list2, SimpleP2PChatInfo simpleP2PChatInfo, ExtraFields extraFields, String str5, List<Chatter.ChatterCustomStatus> list3) {
        this(str, bool, str2, str3, l, bool2, timeZone, str4, type, list, map, workStatus, list2, simpleP2PChatInfo, extraFields, str5, list3, ByteString.EMPTY);
    }

    public UserMeta(String str, Boolean bool, String str2, String str3, Long l, Boolean bool2, TimeZone timeZone, String str4, Chatter.Description.Type type, List<ActionType> list, Map<Integer, DeniedReason> map, WorkStatus workStatus, List<Tag> list2, SimpleP2PChatInfo simpleP2PChatInfo, ExtraFields extraFields, String str5, List<Chatter.ChatterCustomStatus> list3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.is_registered = bool;
        this.tenant_id = str2;
        this.mail_address = str3;
        this.do_not_disturb_end_time = l;
        this.accept_sms_phone_urgent = bool2;
        this.timezone = timeZone;
        this.description = str4;
        this.description_flag = type;
        this.denied_permissions = Internal.immutableCopyOf("denied_permissions", list);
        this.denied_reason = Internal.immutableCopyOf("denied_reason", map);
        this.work_status = workStatus;
        this.tags = Internal.immutableCopyOf("tags", list2);
        this.p2p_chat_info = simpleP2PChatInfo;
        this.extra_fields = extraFields;
        this.enterprise_mail_address = str5;
        this.custom_status = Internal.immutableCopyOf("custom_status", list3);
    }
}
