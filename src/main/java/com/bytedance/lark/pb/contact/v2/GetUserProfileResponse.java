package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.AvatarMedal;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.ImageSetPassThrough;
import com.bytedance.lark.pb.basic.v1.WorkStatus;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.location.LocationRequest;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class GetUserProfileResponse extends Message<GetUserProfileResponse, C16532a> {
    public static final ProtoAdapter<GetUserProfileResponse> ADAPTER = new C16533b();
    private static final long serialVersionUID = 0;
    public final List<CTA> cta_orders;
    public final List<Field> field_orders;
    public final Permission permission;
    public final List<TabInfo> tab_orders;
    public final UserInfo user_info;

    public static final class CTA extends Message<CTA, C16490a> {
        public static final ProtoAdapter<CTA> ADAPTER = new C16491b();
        public static final CTAType DEFAULT_CTA_TYPE = CTAType.UNKNOWN;
        public static final com.bytedance.lark.pb.basic.v1.DeniedReason DEFAULT_DENIED_REASON = com.bytedance.lark.pb.basic.v1.DeniedReason.UNKNOWN_REASON;
        public static final DeniedReason DEFAULT_DENY_REASON = DeniedReason.UNKNOWN_REASON;
        public static final Boolean DEFAULT_ENABLE = false;
        private static final long serialVersionUID = 0;
        public final CTAType cta_type;
        public final I18nVal denied_description;
        public final com.bytedance.lark.pb.basic.v1.DeniedReason denied_reason;
        public final DeniedReason deny_reason;
        public final Boolean enable;
        public final I18nVal i18n_names;
        public final String icon_key;
        public final String key;
        public final String link;

        public enum CTAType implements WireEnum {
            UNKNOWN(0, null),
            LINK(1, null),
            CHAT(10, null),
            CRYPTO_CHAT(11, null),
            VOICE(12, null),
            VIDEO(13, null),
            USER_CARD(14, null),
            BLOCK_SETTING(15, true),
            COLLABORATION_PERMISSION_SETTING(16, true);
            
            public static final ProtoAdapter<CTAType> ADAPTER = ProtoAdapter.newEnumAdapter(CTAType.class);
            public final Boolean deprecated;
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static CTAType fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return LINK;
                }
                switch (i) {
                    case 10:
                        return CHAT;
                    case 11:
                        return CRYPTO_CHAT;
                    case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                        return VOICE;
                    case 13:
                        return VIDEO;
                    case 14:
                        return USER_CARD;
                    case 15:
                        return BLOCK_SETTING;
                    case 16:
                        return COLLABORATION_PERMISSION_SETTING;
                    default:
                        return null;
                }
            }

            private CTAType(int i, Boolean bool) {
                this.value = i;
                this.deprecated = bool;
            }
        }

        public enum DeniedReason implements WireEnum {
            UNKNOWN_REASON(0),
            CROSS_TENANT_BLOCKED(1),
            CROSS_TENANT_DENY(2),
            SAME_TENANT_DENY(3);
            
            public static final ProtoAdapter<DeniedReason> ADAPTER = ProtoAdapter.newEnumAdapter(DeniedReason.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static DeniedReason fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN_REASON;
                }
                if (i == 1) {
                    return CROSS_TENANT_BLOCKED;
                }
                if (i == 2) {
                    return CROSS_TENANT_DENY;
                }
                if (i != 3) {
                    return null;
                }
                return SAME_TENANT_DENY;
            }

            private DeniedReason(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$CTA$b */
        private static final class C16491b extends ProtoAdapter<CTA> {
            C16491b() {
                super(FieldEncoding.LENGTH_DELIMITED, CTA.class);
            }

            /* renamed from: a */
            public int encodedSize(CTA cta) {
                int i;
                int i2;
                int i3;
                int i4;
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, cta.key) + I18nVal.ADAPTER.encodedSizeWithTag(2, cta.i18n_names) + ProtoAdapter.BOOL.encodedSizeWithTag(3, cta.enable) + CTAType.ADAPTER.encodedSizeWithTag(4, cta.cta_type);
                int i5 = 0;
                if (cta.icon_key != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(5, cta.icon_key);
                } else {
                    i = 0;
                }
                int i6 = encodedSizeWithTag + i;
                if (cta.link != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(6, cta.link);
                } else {
                    i2 = 0;
                }
                int i7 = i6 + i2;
                if (cta.deny_reason != null) {
                    i3 = DeniedReason.ADAPTER.encodedSizeWithTag(7, cta.deny_reason);
                } else {
                    i3 = 0;
                }
                int i8 = i7 + i3;
                if (cta.denied_reason != null) {
                    i4 = com.bytedance.lark.pb.basic.v1.DeniedReason.ADAPTER.encodedSizeWithTag(8, cta.denied_reason);
                } else {
                    i4 = 0;
                }
                int i9 = i8 + i4;
                if (cta.denied_description != null) {
                    i5 = I18nVal.ADAPTER.encodedSizeWithTag(9, cta.denied_description);
                }
                return i9 + i5 + cta.unknownFields().size();
            }

            /* renamed from: a */
            public CTA decode(ProtoReader protoReader) throws IOException {
                C16490a aVar = new C16490a();
                aVar.f42802a = "";
                aVar.f42804c = false;
                aVar.f42805d = CTAType.UNKNOWN;
                aVar.f42806e = "";
                aVar.f42807f = "";
                aVar.f42808g = DeniedReason.UNKNOWN_REASON;
                aVar.f42809h = com.bytedance.lark.pb.basic.v1.DeniedReason.UNKNOWN_REASON;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f42802a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                aVar.f42803b = I18nVal.ADAPTER.decode(protoReader);
                                break;
                            case 3:
                                aVar.f42804c = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 4:
                                try {
                                    aVar.f42805d = CTAType.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 5:
                                aVar.f42806e = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                aVar.f42807f = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 7:
                                try {
                                    aVar.f42808g = DeniedReason.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                    break;
                                }
                            case 8:
                                try {
                                    aVar.f42809h = com.bytedance.lark.pb.basic.v1.DeniedReason.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                    break;
                                }
                            case 9:
                                aVar.f42810i = I18nVal.ADAPTER.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, CTA cta) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, cta.key);
                I18nVal.ADAPTER.encodeWithTag(protoWriter, 2, cta.i18n_names);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, cta.enable);
                CTAType.ADAPTER.encodeWithTag(protoWriter, 4, cta.cta_type);
                if (cta.icon_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, cta.icon_key);
                }
                if (cta.link != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, cta.link);
                }
                if (cta.deny_reason != null) {
                    DeniedReason.ADAPTER.encodeWithTag(protoWriter, 7, cta.deny_reason);
                }
                if (cta.denied_reason != null) {
                    com.bytedance.lark.pb.basic.v1.DeniedReason.ADAPTER.encodeWithTag(protoWriter, 8, cta.denied_reason);
                }
                if (cta.denied_description != null) {
                    I18nVal.ADAPTER.encodeWithTag(protoWriter, 9, cta.denied_description);
                }
                protoWriter.writeBytes(cta.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16490a newBuilder() {
            C16490a aVar = new C16490a();
            aVar.f42802a = this.key;
            aVar.f42803b = this.i18n_names;
            aVar.f42804c = this.enable;
            aVar.f42805d = this.cta_type;
            aVar.f42806e = this.icon_key;
            aVar.f42807f = this.link;
            aVar.f42808g = this.deny_reason;
            aVar.f42809h = this.denied_reason;
            aVar.f42810i = this.denied_description;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$CTA$a */
        public static final class C16490a extends Message.Builder<CTA, C16490a> {

            /* renamed from: a */
            public String f42802a;

            /* renamed from: b */
            public I18nVal f42803b;

            /* renamed from: c */
            public Boolean f42804c;

            /* renamed from: d */
            public CTAType f42805d;

            /* renamed from: e */
            public String f42806e;

            /* renamed from: f */
            public String f42807f;

            /* renamed from: g */
            public DeniedReason f42808g;

            /* renamed from: h */
            public com.bytedance.lark.pb.basic.v1.DeniedReason f42809h;

            /* renamed from: i */
            public I18nVal f42810i;

            /* renamed from: a */
            public CTA build() {
                I18nVal i18nVal;
                Boolean bool;
                CTAType cTAType;
                String str = this.f42802a;
                if (str != null && (i18nVal = this.f42803b) != null && (bool = this.f42804c) != null && (cTAType = this.f42805d) != null) {
                    return new CTA(str, i18nVal, bool, cTAType, this.f42806e, this.f42807f, this.f42808g, this.f42809h, this.f42810i, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "key", this.f42803b, "i18n_names", this.f42804c, "enable", this.f42805d, "cta_type");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("contact", "CTA");
            StringBuilder sb = new StringBuilder();
            sb.append(", key=");
            sb.append(this.key);
            sb.append(", i18n_names=");
            sb.append(this.i18n_names);
            sb.append(", enable=");
            sb.append(this.enable);
            sb.append(", cta_type=");
            sb.append(this.cta_type);
            if (this.icon_key != null) {
                sb.append(", icon_key=");
                sb.append(this.icon_key);
            }
            if (this.link != null) {
                sb.append(", link=");
                sb.append(this.link);
            }
            if (this.deny_reason != null) {
                sb.append(", deny_reason=");
                sb.append(this.deny_reason);
            }
            if (this.denied_reason != null) {
                sb.append(", denied_reason=");
                sb.append(this.denied_reason);
            }
            if (this.denied_description != null) {
                sb.append(", denied_description=");
                sb.append(this.denied_description);
            }
            StringBuilder replace = sb.replace(0, 2, "CTA{");
            replace.append('}');
            return replace.toString();
        }

        public CTA(String str, I18nVal i18nVal, Boolean bool, CTAType cTAType, String str2, String str3, DeniedReason deniedReason, com.bytedance.lark.pb.basic.v1.DeniedReason deniedReason2, I18nVal i18nVal2) {
            this(str, i18nVal, bool, cTAType, str2, str3, deniedReason, deniedReason2, i18nVal2, ByteString.EMPTY);
        }

        public CTA(String str, I18nVal i18nVal, Boolean bool, CTAType cTAType, String str2, String str3, DeniedReason deniedReason, com.bytedance.lark.pb.basic.v1.DeniedReason deniedReason2, I18nVal i18nVal2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.key = str;
            this.i18n_names = i18nVal;
            this.enable = bool;
            this.cta_type = cTAType;
            this.icon_key = str2;
            this.link = str3;
            this.deny_reason = deniedReason;
            this.denied_reason = deniedReason2;
            this.denied_description = i18nVal2;
        }
    }

    public static final class Field extends Message<Field, C16500a> {
        public static final ProtoAdapter<Field> ADAPTER = new C16501b();
        public static final FieldType DEFAULT_FIELD_TYPE = FieldType.UNKNOWN;
        public static final ByteString DEFAULT_FIELD_VAL = ByteString.EMPTY;
        private static final long serialVersionUID = 0;
        public final FieldType field_type;
        public final ByteString field_val;
        public final I18nVal i18n_names;
        public final String json_field_val;
        public final String key;

        public enum FieldType implements WireEnum {
            UNKNOWN(0),
            TEXT(1),
            LINK(2),
            TEXT_LIST(3),
            LINK_LIST(4),
            C_ALIAS(50),
            C_DESCRIPTION(51),
            S_DEPARTMENT(100),
            S_PHONE_NUMBER(101),
            S_FRIEND_LINK(102),
            CUSTOM_FIELD_IMAGE(103),
            ALIAS_AND_MEMO(104),
            MEMO_DESCRIPTION(LocationRequest.PRIORITY_NO_POWER);
            
            public static final ProtoAdapter<FieldType> ADAPTER = ProtoAdapter.newEnumAdapter(FieldType.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static FieldType fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return TEXT;
                }
                if (i == 2) {
                    return LINK;
                }
                if (i == 3) {
                    return TEXT_LIST;
                }
                if (i == 4) {
                    return LINK_LIST;
                }
                if (i == 50) {
                    return C_ALIAS;
                }
                if (i == 51) {
                    return C_DESCRIPTION;
                }
                switch (i) {
                    case 100:
                        return S_DEPARTMENT;
                    case 101:
                        return S_PHONE_NUMBER;
                    case 102:
                        return S_FRIEND_LINK;
                    case 103:
                        return CUSTOM_FIELD_IMAGE;
                    case 104:
                        return ALIAS_AND_MEMO;
                    case LocationRequest.PRIORITY_NO_POWER /*{ENCODED_INT: 105}*/:
                        return MEMO_DESCRIPTION;
                    default:
                        return null;
                }
            }

            private FieldType(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$Field$b */
        private static final class C16501b extends ProtoAdapter<Field> {
            C16501b() {
                super(FieldEncoding.LENGTH_DELIMITED, Field.class);
            }

            /* renamed from: a */
            public int encodedSize(Field field) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, field.key) + I18nVal.ADAPTER.encodedSizeWithTag(2, field.i18n_names) + FieldType.ADAPTER.encodedSizeWithTag(3, field.field_type);
                int i2 = 0;
                if (field.field_val != null) {
                    i = ProtoAdapter.BYTES.encodedSizeWithTag(4, field.field_val);
                } else {
                    i = 0;
                }
                int i3 = encodedSizeWithTag + i;
                if (field.json_field_val != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(5, field.json_field_val);
                }
                return i3 + i2 + field.unknownFields().size();
            }

            /* renamed from: a */
            public Field decode(ProtoReader protoReader) throws IOException {
                C16500a aVar = new C16500a();
                aVar.f42816a = "";
                aVar.f42818c = FieldType.UNKNOWN;
                aVar.f42819d = ByteString.EMPTY;
                aVar.f42820e = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f42816a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f42817b = I18nVal.ADAPTER.decode(protoReader);
                    } else if (nextTag == 3) {
                        try {
                            aVar.f42818c = FieldType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 4) {
                        aVar.f42819d = ProtoAdapter.BYTES.decode(protoReader);
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f42820e = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Field field) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, field.key);
                I18nVal.ADAPTER.encodeWithTag(protoWriter, 2, field.i18n_names);
                FieldType.ADAPTER.encodeWithTag(protoWriter, 3, field.field_type);
                if (field.field_val != null) {
                    ProtoAdapter.BYTES.encodeWithTag(protoWriter, 4, field.field_val);
                }
                if (field.json_field_val != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, field.json_field_val);
                }
                protoWriter.writeBytes(field.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$Field$a */
        public static final class C16500a extends Message.Builder<Field, C16500a> {

            /* renamed from: a */
            public String f42816a;

            /* renamed from: b */
            public I18nVal f42817b;

            /* renamed from: c */
            public FieldType f42818c;

            /* renamed from: d */
            public ByteString f42819d;

            /* renamed from: e */
            public String f42820e;

            /* renamed from: a */
            public Field build() {
                I18nVal i18nVal;
                FieldType fieldType;
                String str = this.f42816a;
                if (str != null && (i18nVal = this.f42817b) != null && (fieldType = this.f42818c) != null) {
                    return new Field(str, i18nVal, fieldType, this.f42819d, this.f42820e, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "key", this.f42817b, "i18n_names", this.f42818c, "field_type");
            }
        }

        @Override // com.squareup.wire.Message
        public C16500a newBuilder() {
            C16500a aVar = new C16500a();
            aVar.f42816a = this.key;
            aVar.f42817b = this.i18n_names;
            aVar.f42818c = this.field_type;
            aVar.f42819d = this.field_val;
            aVar.f42820e = this.json_field_val;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("contact", "Field");
            StringBuilder sb = new StringBuilder();
            sb.append(", key=");
            sb.append(this.key);
            sb.append(", i18n_names=");
            sb.append(this.i18n_names);
            sb.append(", field_type=");
            sb.append(this.field_type);
            if (this.field_val != null) {
                sb.append(", field_val=");
                sb.append(this.field_val);
            }
            if (this.json_field_val != null) {
                sb.append(", json_field_val=");
                sb.append(this.json_field_val);
            }
            StringBuilder replace = sb.replace(0, 2, "Field{");
            replace.append('}');
            return replace.toString();
        }

        public Field(String str, I18nVal i18nVal, FieldType fieldType, ByteString byteString, String str2) {
            this(str, i18nVal, fieldType, byteString, str2, ByteString.EMPTY);
        }

        public Field(String str, I18nVal i18nVal, FieldType fieldType, ByteString byteString, String str2, ByteString byteString2) {
            super(ADAPTER, byteString2);
            this.key = str;
            this.i18n_names = i18nVal;
            this.field_type = fieldType;
            this.field_val = byteString;
            this.json_field_val = str2;
        }
    }

    public static final class TabInfo extends Message<TabInfo, C16524a> {
        public static final ProtoAdapter<TabInfo> ADAPTER = new C16525b();
        public static final TabType DEFAULT_TAB_TYPE = TabType.F_UNKNOWN;
        private static final long serialVersionUID = 0;
        public final String content;
        public final String key;
        public final I18nVal name;
        public final TabType tab_type;

        public enum TabType implements WireEnum {
            F_UNKNOWN(0),
            F_COMMON_INFO(1),
            F_COMMUNITY(2),
            F_SINGLE_FIELD(3);
            
            public static final ProtoAdapter<TabType> ADAPTER = ProtoAdapter.newEnumAdapter(TabType.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static TabType fromValue(int i) {
                if (i == 0) {
                    return F_UNKNOWN;
                }
                if (i == 1) {
                    return F_COMMON_INFO;
                }
                if (i == 2) {
                    return F_COMMUNITY;
                }
                if (i != 3) {
                    return null;
                }
                return F_SINGLE_FIELD;
            }

            private TabType(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$TabInfo$b */
        private static final class C16525b extends ProtoAdapter<TabInfo> {
            C16525b() {
                super(FieldEncoding.LENGTH_DELIMITED, TabInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(TabInfo tabInfo) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (tabInfo.key != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, tabInfo.key);
                } else {
                    i = 0;
                }
                if (tabInfo.name != null) {
                    i2 = I18nVal.ADAPTER.encodedSizeWithTag(2, tabInfo.name);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (tabInfo.tab_type != null) {
                    i3 = TabType.ADAPTER.encodedSizeWithTag(3, tabInfo.tab_type);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (tabInfo.content != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, tabInfo.content);
                }
                return i6 + i4 + tabInfo.unknownFields().size();
            }

            /* renamed from: a */
            public TabInfo decode(ProtoReader protoReader) throws IOException {
                C16524a aVar = new C16524a();
                aVar.f42847a = "";
                aVar.f42849c = TabType.F_UNKNOWN;
                aVar.f42850d = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f42847a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f42848b = I18nVal.ADAPTER.decode(protoReader);
                    } else if (nextTag == 3) {
                        try {
                            aVar.f42849c = TabType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f42850d = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, TabInfo tabInfo) throws IOException {
                if (tabInfo.key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, tabInfo.key);
                }
                if (tabInfo.name != null) {
                    I18nVal.ADAPTER.encodeWithTag(protoWriter, 2, tabInfo.name);
                }
                if (tabInfo.tab_type != null) {
                    TabType.ADAPTER.encodeWithTag(protoWriter, 3, tabInfo.tab_type);
                }
                if (tabInfo.content != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, tabInfo.content);
                }
                protoWriter.writeBytes(tabInfo.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$TabInfo$a */
        public static final class C16524a extends Message.Builder<TabInfo, C16524a> {

            /* renamed from: a */
            public String f42847a;

            /* renamed from: b */
            public I18nVal f42848b;

            /* renamed from: c */
            public TabType f42849c;

            /* renamed from: d */
            public String f42850d;

            /* renamed from: a */
            public TabInfo build() {
                return new TabInfo(this.f42847a, this.f42848b, this.f42849c, this.f42850d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16524a newBuilder() {
            C16524a aVar = new C16524a();
            aVar.f42847a = this.key;
            aVar.f42848b = this.name;
            aVar.f42849c = this.tab_type;
            aVar.f42850d = this.content;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("contact", "TabInfo");
            StringBuilder sb = new StringBuilder();
            if (this.key != null) {
                sb.append(", key=");
                sb.append(this.key);
            }
            if (this.name != null) {
                sb.append(", name=");
                sb.append(this.name);
            }
            if (this.tab_type != null) {
                sb.append(", tab_type=");
                sb.append(this.tab_type);
            }
            if (this.content != null) {
                sb.append(", content=");
                sb.append(this.content);
            }
            StringBuilder replace = sb.replace(0, 2, "TabInfo{");
            replace.append('}');
            return replace.toString();
        }

        public TabInfo(String str, I18nVal i18nVal, TabType tabType, String str2) {
            this(str, i18nVal, tabType, str2, ByteString.EMPTY);
        }

        public TabInfo(String str, I18nVal i18nVal, TabType tabType, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.key = str;
            this.name = i18nVal;
            this.tab_type = tabType;
            this.content = str2;
        }
    }

    public static final class UserInfo extends Message<UserInfo, C16530a> {
        public static final ProtoAdapter<UserInfo> ADAPTER = new C16531b();
        public static final BlockStatus DEFAULT_BLOCK_STATUS = BlockStatus.B_UNKNOWN;
        public static final Long DEFAULT_CONTACT_APPLICATION_ID = 0L;
        public static final Long DEFAULT_DO_NOT_DISTURB_END_TIME = 0L;
        public static final Boolean DEFAULT_ENABLE_ADD_BY_CONTACT_TOKEN = false;
        public static final FriendStatus DEFAULT_FRIEND_STATUS = FriendStatus.UNKNOWN;
        public static final Gender DEFAULT_GENDER = Gender.DEFAULT;
        public static final Boolean DEFAULT_HAS_TENANT_CERTIFICATION = false;
        public static final Boolean DEFAULT_IS_BLOCKED = false;
        public static final Boolean DEFAULT_IS_FROZEN = false;
        public static final Boolean DEFAULT_IS_REGISTERED = false;
        public static final Boolean DEFAULT_IS_RESIGNED = false;
        public static final Boolean DEFAULT_IS_SPECIAL_FOCUS = false;
        public static final Boolean DEFAULT_IS_TENANT_CERTIFICATION = false;
        public static final UserTag DEFAULT_USER_TAG = UserTag.U_Default;
        private static final long serialVersionUID = 0;
        public final String avatar_key;
        public final AvatarMedal avatar_medal;
        public final BlockStatus block_status;
        public final List<Chatter.ChatterCustomStatus> chatter_status;
        public final Long contact_application_id;
        public final String contact_token;
        public final List<Field> custom_tag_fields;
        public final Chatter.Description description;
        public final Long do_not_disturb_end_time;
        public final Boolean enable_add_by_contact_token;
        public final FriendStatus friend_status;
        public final Gender gender;
        public final Boolean has_tenant_certification;
        public final Boolean is_blocked;
        public final Boolean is_frozen;
        public final Boolean is_registered;
        public final Boolean is_resigned;
        public final Boolean is_special_focus;
        public final Boolean is_tenant_certification;
        public final String leader_id;
        public final MedalList medal_list;
        public final ShareInfo share_info;
        public final String str_contact_application_id;
        public final String tenant_certification_url;
        public final String tenant_id;
        public final I18nVal tenant_name;
        public final ImageSetPassThrough top_image;
        public final String user_id;
        public final String user_name;
        public final UserTag user_tag;
        public final WorkStatus work_status;

        public enum BlockStatus implements WireEnum {
            B_UNKNOWN(0),
            B_NONE(1),
            B_FORWARD(2),
            B_REVERSE(3),
            B_DOUBLE(4);
            
            public static final ProtoAdapter<BlockStatus> ADAPTER = ProtoAdapter.newEnumAdapter(BlockStatus.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static BlockStatus fromValue(int i) {
                if (i == 0) {
                    return B_UNKNOWN;
                }
                if (i == 1) {
                    return B_NONE;
                }
                if (i == 2) {
                    return B_FORWARD;
                }
                if (i == 3) {
                    return B_REVERSE;
                }
                if (i != 4) {
                    return null;
                }
                return B_DOUBLE;
            }

            private BlockStatus(int i) {
                this.value = i;
            }
        }

        public enum FriendStatus implements WireEnum {
            UNKNOWN(0),
            DOUBLE(1),
            FORWARD(2),
            REVERSE(3),
            NONE(4);
            
            public static final ProtoAdapter<FriendStatus> ADAPTER = ProtoAdapter.newEnumAdapter(FriendStatus.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static FriendStatus fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return DOUBLE;
                }
                if (i == 2) {
                    return FORWARD;
                }
                if (i == 3) {
                    return REVERSE;
                }
                if (i != 4) {
                    return null;
                }
                return NONE;
            }

            private FriendStatus(int i) {
                this.value = i;
            }
        }

        public enum Gender implements WireEnum {
            DEFAULT(0),
            MAN(1),
            WOMAN(2);
            
            public static final ProtoAdapter<Gender> ADAPTER = ProtoAdapter.newEnumAdapter(Gender.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Gender fromValue(int i) {
                if (i == 0) {
                    return DEFAULT;
                }
                if (i == 1) {
                    return MAN;
                }
                if (i != 2) {
                    return null;
                }
                return WOMAN;
            }

            private Gender(int i) {
                this.value = i;
            }
        }

        public enum UserTag implements WireEnum {
            U_Default(0),
            U_Student(1),
            U_Parent(2);
            
            public static final ProtoAdapter<UserTag> ADAPTER = ProtoAdapter.newEnumAdapter(UserTag.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static UserTag fromValue(int i) {
                if (i == 0) {
                    return U_Default;
                }
                if (i == 1) {
                    return U_Student;
                }
                if (i != 2) {
                    return null;
                }
                return U_Parent;
            }

            private UserTag(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$UserInfo$b */
        private static final class C16531b extends ProtoAdapter<UserInfo> {
            C16531b() {
                super(FieldEncoding.LENGTH_DELIMITED, UserInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(UserInfo userInfo) {
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
                int i18;
                int i19;
                int i20;
                int i21;
                int i22;
                int i23;
                int i24;
                int i25;
                int i26;
                int i27;
                int i28;
                int i29 = 0;
                if (userInfo.friend_status != null) {
                    i = FriendStatus.ADAPTER.encodedSizeWithTag(1, userInfo.friend_status);
                } else {
                    i = 0;
                }
                if (userInfo.gender != null) {
                    i2 = Gender.ADAPTER.encodedSizeWithTag(2, userInfo.gender);
                } else {
                    i2 = 0;
                }
                int i30 = i + i2;
                if (userInfo.tenant_name != null) {
                    i3 = I18nVal.ADAPTER.encodedSizeWithTag(3, userInfo.tenant_name);
                } else {
                    i3 = 0;
                }
                int i31 = i30 + i3;
                if (userInfo.contact_token != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, userInfo.contact_token);
                } else {
                    i4 = 0;
                }
                int i32 = i31 + i4;
                if (userInfo.contact_application_id != null) {
                    i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, userInfo.contact_application_id);
                } else {
                    i5 = 0;
                }
                int i33 = i32 + i5;
                if (userInfo.enable_add_by_contact_token != null) {
                    i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, userInfo.enable_add_by_contact_token);
                } else {
                    i6 = 0;
                }
                int i34 = i33 + i6;
                if (userInfo.leader_id != null) {
                    i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, userInfo.leader_id);
                } else {
                    i7 = 0;
                }
                int i35 = i34 + i7;
                if (userInfo.str_contact_application_id != null) {
                    i8 = ProtoAdapter.STRING.encodedSizeWithTag(8, userInfo.str_contact_application_id);
                } else {
                    i8 = 0;
                }
                int i36 = i35 + i8;
                if (userInfo.is_blocked != null) {
                    i9 = ProtoAdapter.BOOL.encodedSizeWithTag(9, userInfo.is_blocked);
                } else {
                    i9 = 0;
                }
                int i37 = i36 + i9;
                if (userInfo.block_status != null) {
                    i10 = BlockStatus.ADAPTER.encodedSizeWithTag(10, userInfo.block_status);
                } else {
                    i10 = 0;
                }
                int i38 = i37 + i10;
                if (userInfo.user_tag != null) {
                    i11 = UserTag.ADAPTER.encodedSizeWithTag(11, userInfo.user_tag);
                } else {
                    i11 = 0;
                }
                int i39 = i38 + i11;
                if (userInfo.is_tenant_certification != null) {
                    i12 = ProtoAdapter.BOOL.encodedSizeWithTag(12, userInfo.is_tenant_certification);
                } else {
                    i12 = 0;
                }
                int i40 = i39 + i12;
                if (userInfo.tenant_certification_url != null) {
                    i13 = ProtoAdapter.STRING.encodedSizeWithTag(13, userInfo.tenant_certification_url);
                } else {
                    i13 = 0;
                }
                int i41 = i40 + i13;
                if (userInfo.has_tenant_certification != null) {
                    i14 = ProtoAdapter.BOOL.encodedSizeWithTag(14, userInfo.has_tenant_certification);
                } else {
                    i14 = 0;
                }
                int encodedSizeWithTag = i41 + i14 + Field.ADAPTER.asRepeated().encodedSizeWithTag(15, userInfo.custom_tag_fields);
                if (userInfo.top_image != null) {
                    i15 = ImageSetPassThrough.ADAPTER.encodedSizeWithTag(16, userInfo.top_image);
                } else {
                    i15 = 0;
                }
                int i42 = encodedSizeWithTag + i15;
                if (userInfo.share_info != null) {
                    i16 = ShareInfo.ADAPTER.encodedSizeWithTag(17, userInfo.share_info);
                } else {
                    i16 = 0;
                }
                int i43 = i42 + i16;
                if (userInfo.medal_list != null) {
                    i17 = MedalList.ADAPTER.encodedSizeWithTag(18, userInfo.medal_list);
                } else {
                    i17 = 0;
                }
                int i44 = i43 + i17;
                if (userInfo.is_special_focus != null) {
                    i18 = ProtoAdapter.BOOL.encodedSizeWithTag(19, userInfo.is_special_focus);
                } else {
                    i18 = 0;
                }
                int i45 = i44 + i18;
                if (userInfo.user_id != null) {
                    i19 = ProtoAdapter.STRING.encodedSizeWithTag(50, userInfo.user_id);
                } else {
                    i19 = 0;
                }
                int i46 = i45 + i19;
                if (userInfo.user_name != null) {
                    i20 = ProtoAdapter.STRING.encodedSizeWithTag(51, userInfo.user_name);
                } else {
                    i20 = 0;
                }
                int i47 = i46 + i20;
                if (userInfo.tenant_id != null) {
                    i21 = ProtoAdapter.STRING.encodedSizeWithTag(52, userInfo.tenant_id);
                } else {
                    i21 = 0;
                }
                int i48 = i47 + i21;
                if (userInfo.is_resigned != null) {
                    i22 = ProtoAdapter.BOOL.encodedSizeWithTag(56, userInfo.is_resigned);
                } else {
                    i22 = 0;
                }
                int i49 = i48 + i22;
                if (userInfo.do_not_disturb_end_time != null) {
                    i23 = ProtoAdapter.INT64.encodedSizeWithTag(57, userInfo.do_not_disturb_end_time);
                } else {
                    i23 = 0;
                }
                int i50 = i49 + i23;
                if (userInfo.work_status != null) {
                    i24 = WorkStatus.ADAPTER.encodedSizeWithTag(60, userInfo.work_status);
                } else {
                    i24 = 0;
                }
                int i51 = i50 + i24;
                if (userInfo.avatar_key != null) {
                    i25 = ProtoAdapter.STRING.encodedSizeWithTag(61, userInfo.avatar_key);
                } else {
                    i25 = 0;
                }
                int i52 = i51 + i25;
                if (userInfo.is_registered != null) {
                    i26 = ProtoAdapter.BOOL.encodedSizeWithTag(62, userInfo.is_registered);
                } else {
                    i26 = 0;
                }
                int i53 = i52 + i26;
                if (userInfo.is_frozen != null) {
                    i27 = ProtoAdapter.BOOL.encodedSizeWithTag(63, userInfo.is_frozen);
                } else {
                    i27 = 0;
                }
                int i54 = i53 + i27;
                if (userInfo.description != null) {
                    i28 = Chatter.Description.ADAPTER.encodedSizeWithTag(64, userInfo.description);
                } else {
                    i28 = 0;
                }
                int encodedSizeWithTag2 = i54 + i28 + Chatter.ChatterCustomStatus.ADAPTER.asRepeated().encodedSizeWithTag(65, userInfo.chatter_status);
                if (userInfo.avatar_medal != null) {
                    i29 = AvatarMedal.ADAPTER.encodedSizeWithTag(66, userInfo.avatar_medal);
                }
                return encodedSizeWithTag2 + i29 + userInfo.unknownFields().size();
            }

            /* renamed from: a */
            public UserInfo decode(ProtoReader protoReader) throws IOException {
                C16530a aVar = new C16530a();
                aVar.f42859a = FriendStatus.UNKNOWN;
                aVar.f42860b = Gender.DEFAULT;
                aVar.f42862d = "";
                aVar.f42863e = 0L;
                aVar.f42864f = false;
                aVar.f42865g = "";
                aVar.f42866h = "";
                aVar.f42867i = false;
                aVar.f42868j = BlockStatus.B_UNKNOWN;
                aVar.f42869k = UserTag.U_Default;
                aVar.f42870l = false;
                aVar.f42871m = "";
                aVar.f42872n = false;
                aVar.f42877s = false;
                aVar.f42878t = "";
                aVar.f42879u = "";
                aVar.f42880v = "";
                aVar.f42881w = false;
                aVar.f42882x = 0L;
                aVar.f42884z = "";
                aVar.f42854A = false;
                aVar.f42855B = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 56) {
                        aVar.f42881w = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 57) {
                        switch (nextTag) {
                            case 1:
                                try {
                                    aVar.f42859a = FriendStatus.ADAPTER.decode(protoReader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 2:
                                try {
                                    aVar.f42860b = Gender.ADAPTER.decode(protoReader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                    break;
                                }
                            case 3:
                                aVar.f42861c = I18nVal.ADAPTER.decode(protoReader);
                                continue;
                            case 4:
                                aVar.f42862d = ProtoAdapter.STRING.decode(protoReader);
                                continue;
                            case 5:
                                aVar.f42863e = ProtoAdapter.INT64.decode(protoReader);
                                continue;
                            case 6:
                                aVar.f42864f = ProtoAdapter.BOOL.decode(protoReader);
                                continue;
                            case 7:
                                aVar.f42865g = ProtoAdapter.STRING.decode(protoReader);
                                continue;
                            case 8:
                                aVar.f42866h = ProtoAdapter.STRING.decode(protoReader);
                                continue;
                            case 9:
                                aVar.f42867i = ProtoAdapter.BOOL.decode(protoReader);
                                continue;
                            case 10:
                                try {
                                    aVar.f42868j = BlockStatus.ADAPTER.decode(protoReader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                    break;
                                }
                            case 11:
                                try {
                                    aVar.f42869k = UserTag.ADAPTER.decode(protoReader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                    break;
                                }
                            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                                aVar.f42870l = ProtoAdapter.BOOL.decode(protoReader);
                                continue;
                            case 13:
                                aVar.f42871m = ProtoAdapter.STRING.decode(protoReader);
                                continue;
                            case 14:
                                aVar.f42872n = ProtoAdapter.BOOL.decode(protoReader);
                                continue;
                            case 15:
                                aVar.f42873o.add(Field.ADAPTER.decode(protoReader));
                                continue;
                            case 16:
                                aVar.f42874p = ImageSetPassThrough.ADAPTER.decode(protoReader);
                                continue;
                            case 17:
                                aVar.f42875q = ShareInfo.ADAPTER.decode(protoReader);
                                continue;
                            case 18:
                                aVar.f42876r = MedalList.ADAPTER.decode(protoReader);
                                continue;
                            case 19:
                                aVar.f42877s = ProtoAdapter.BOOL.decode(protoReader);
                                continue;
                            default:
                                switch (nextTag) {
                                    case MmListControl.f116813f /*{ENCODED_INT: 50}*/:
                                        aVar.f42878t = ProtoAdapter.STRING.decode(protoReader);
                                        continue;
                                    case 51:
                                        aVar.f42879u = ProtoAdapter.STRING.decode(protoReader);
                                        continue;
                                    case 52:
                                        aVar.f42880v = ProtoAdapter.STRING.decode(protoReader);
                                        continue;
                                    default:
                                        switch (nextTag) {
                                            case 60:
                                                aVar.f42883y = WorkStatus.ADAPTER.decode(protoReader);
                                                continue;
                                            case 61:
                                                aVar.f42884z = ProtoAdapter.STRING.decode(protoReader);
                                                continue;
                                            case 62:
                                                aVar.f42854A = ProtoAdapter.BOOL.decode(protoReader);
                                                continue;
                                            case 63:
                                                aVar.f42855B = ProtoAdapter.BOOL.decode(protoReader);
                                                continue;
                                            case 64:
                                                aVar.f42856C = Chatter.Description.ADAPTER.decode(protoReader);
                                                continue;
                                            case 65:
                                                aVar.f42857D.add(Chatter.ChatterCustomStatus.ADAPTER.decode(protoReader));
                                                continue;
                                            case 66:
                                                aVar.f42858E = AvatarMedal.ADAPTER.decode(protoReader);
                                                continue;
                                            default:
                                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                                aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                                continue;
                                                continue;
                                                continue;
                                        }
                                }
                        }
                    } else {
                        aVar.f42882x = ProtoAdapter.INT64.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, UserInfo userInfo) throws IOException {
                if (userInfo.friend_status != null) {
                    FriendStatus.ADAPTER.encodeWithTag(protoWriter, 1, userInfo.friend_status);
                }
                if (userInfo.gender != null) {
                    Gender.ADAPTER.encodeWithTag(protoWriter, 2, userInfo.gender);
                }
                if (userInfo.tenant_name != null) {
                    I18nVal.ADAPTER.encodeWithTag(protoWriter, 3, userInfo.tenant_name);
                }
                if (userInfo.contact_token != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, userInfo.contact_token);
                }
                if (userInfo.contact_application_id != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, userInfo.contact_application_id);
                }
                if (userInfo.enable_add_by_contact_token != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, userInfo.enable_add_by_contact_token);
                }
                if (userInfo.leader_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, userInfo.leader_id);
                }
                if (userInfo.str_contact_application_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, userInfo.str_contact_application_id);
                }
                if (userInfo.is_blocked != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, userInfo.is_blocked);
                }
                if (userInfo.block_status != null) {
                    BlockStatus.ADAPTER.encodeWithTag(protoWriter, 10, userInfo.block_status);
                }
                if (userInfo.user_tag != null) {
                    UserTag.ADAPTER.encodeWithTag(protoWriter, 11, userInfo.user_tag);
                }
                if (userInfo.is_tenant_certification != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 12, userInfo.is_tenant_certification);
                }
                if (userInfo.tenant_certification_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, userInfo.tenant_certification_url);
                }
                if (userInfo.has_tenant_certification != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 14, userInfo.has_tenant_certification);
                }
                Field.ADAPTER.asRepeated().encodeWithTag(protoWriter, 15, userInfo.custom_tag_fields);
                if (userInfo.top_image != null) {
                    ImageSetPassThrough.ADAPTER.encodeWithTag(protoWriter, 16, userInfo.top_image);
                }
                if (userInfo.share_info != null) {
                    ShareInfo.ADAPTER.encodeWithTag(protoWriter, 17, userInfo.share_info);
                }
                if (userInfo.medal_list != null) {
                    MedalList.ADAPTER.encodeWithTag(protoWriter, 18, userInfo.medal_list);
                }
                if (userInfo.is_special_focus != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 19, userInfo.is_special_focus);
                }
                if (userInfo.user_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 50, userInfo.user_id);
                }
                if (userInfo.user_name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 51, userInfo.user_name);
                }
                if (userInfo.tenant_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 52, userInfo.tenant_id);
                }
                if (userInfo.is_resigned != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 56, userInfo.is_resigned);
                }
                if (userInfo.do_not_disturb_end_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 57, userInfo.do_not_disturb_end_time);
                }
                if (userInfo.work_status != null) {
                    WorkStatus.ADAPTER.encodeWithTag(protoWriter, 60, userInfo.work_status);
                }
                if (userInfo.avatar_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 61, userInfo.avatar_key);
                }
                if (userInfo.is_registered != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 62, userInfo.is_registered);
                }
                if (userInfo.is_frozen != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 63, userInfo.is_frozen);
                }
                if (userInfo.description != null) {
                    Chatter.Description.ADAPTER.encodeWithTag(protoWriter, 64, userInfo.description);
                }
                Chatter.ChatterCustomStatus.ADAPTER.asRepeated().encodeWithTag(protoWriter, 65, userInfo.chatter_status);
                if (userInfo.avatar_medal != null) {
                    AvatarMedal.ADAPTER.encodeWithTag(protoWriter, 66, userInfo.avatar_medal);
                }
                protoWriter.writeBytes(userInfo.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$UserInfo$a */
        public static final class C16530a extends Message.Builder<UserInfo, C16530a> {

            /* renamed from: A */
            public Boolean f42854A;

            /* renamed from: B */
            public Boolean f42855B;

            /* renamed from: C */
            public Chatter.Description f42856C;

            /* renamed from: D */
            public List<Chatter.ChatterCustomStatus> f42857D = Internal.newMutableList();

            /* renamed from: E */
            public AvatarMedal f42858E;

            /* renamed from: a */
            public FriendStatus f42859a;

            /* renamed from: b */
            public Gender f42860b;

            /* renamed from: c */
            public I18nVal f42861c;

            /* renamed from: d */
            public String f42862d;

            /* renamed from: e */
            public Long f42863e;

            /* renamed from: f */
            public Boolean f42864f;

            /* renamed from: g */
            public String f42865g;

            /* renamed from: h */
            public String f42866h;

            /* renamed from: i */
            public Boolean f42867i;

            /* renamed from: j */
            public BlockStatus f42868j;

            /* renamed from: k */
            public UserTag f42869k;

            /* renamed from: l */
            public Boolean f42870l;

            /* renamed from: m */
            public String f42871m;

            /* renamed from: n */
            public Boolean f42872n;

            /* renamed from: o */
            public List<Field> f42873o = Internal.newMutableList();

            /* renamed from: p */
            public ImageSetPassThrough f42874p;

            /* renamed from: q */
            public ShareInfo f42875q;

            /* renamed from: r */
            public MedalList f42876r;

            /* renamed from: s */
            public Boolean f42877s;

            /* renamed from: t */
            public String f42878t;

            /* renamed from: u */
            public String f42879u;

            /* renamed from: v */
            public String f42880v;

            /* renamed from: w */
            public Boolean f42881w;

            /* renamed from: x */
            public Long f42882x;

            /* renamed from: y */
            public WorkStatus f42883y;

            /* renamed from: z */
            public String f42884z;

            /* renamed from: a */
            public UserInfo build() {
                return new UserInfo(this.f42859a, this.f42860b, this.f42861c, this.f42862d, this.f42863e, this.f42864f, this.f42865g, this.f42866h, this.f42867i, this.f42868j, this.f42869k, this.f42870l, this.f42871m, this.f42872n, this.f42873o, this.f42874p, this.f42875q, this.f42876r, this.f42877s, this.f42878t, this.f42879u, this.f42880v, this.f42881w, this.f42882x, this.f42883y, this.f42884z, this.f42854A, this.f42855B, this.f42856C, this.f42857D, this.f42858E, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C16530a mo58855a(AvatarMedal avatarMedal) {
                this.f42858E = avatarMedal;
                return this;
            }

            /* renamed from: a */
            public C16530a mo58856a(Chatter.Description description) {
                this.f42856C = description;
                return this;
            }

            /* renamed from: a */
            public C16530a mo58857a(ImageSetPassThrough imageSetPassThrough) {
                this.f42874p = imageSetPassThrough;
                return this;
            }

            /* renamed from: a */
            public C16530a mo58858a(FriendStatus friendStatus) {
                this.f42859a = friendStatus;
                return this;
            }

            /* renamed from: a */
            public C16530a mo58859a(Boolean bool) {
                this.f42877s = bool;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C16530a newBuilder() {
            C16530a aVar = new C16530a();
            aVar.f42859a = this.friend_status;
            aVar.f42860b = this.gender;
            aVar.f42861c = this.tenant_name;
            aVar.f42862d = this.contact_token;
            aVar.f42863e = this.contact_application_id;
            aVar.f42864f = this.enable_add_by_contact_token;
            aVar.f42865g = this.leader_id;
            aVar.f42866h = this.str_contact_application_id;
            aVar.f42867i = this.is_blocked;
            aVar.f42868j = this.block_status;
            aVar.f42869k = this.user_tag;
            aVar.f42870l = this.is_tenant_certification;
            aVar.f42871m = this.tenant_certification_url;
            aVar.f42872n = this.has_tenant_certification;
            aVar.f42873o = Internal.copyOf("custom_tag_fields", this.custom_tag_fields);
            aVar.f42874p = this.top_image;
            aVar.f42875q = this.share_info;
            aVar.f42876r = this.medal_list;
            aVar.f42877s = this.is_special_focus;
            aVar.f42878t = this.user_id;
            aVar.f42879u = this.user_name;
            aVar.f42880v = this.tenant_id;
            aVar.f42881w = this.is_resigned;
            aVar.f42882x = this.do_not_disturb_end_time;
            aVar.f42883y = this.work_status;
            aVar.f42884z = this.avatar_key;
            aVar.f42854A = this.is_registered;
            aVar.f42855B = this.is_frozen;
            aVar.f42856C = this.description;
            aVar.f42857D = Internal.copyOf("chatter_status", this.chatter_status);
            aVar.f42858E = this.avatar_medal;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("contact", "UserInfo");
            StringBuilder sb = new StringBuilder();
            if (this.friend_status != null) {
                sb.append(", friend_status=");
                sb.append(this.friend_status);
            }
            if (this.gender != null) {
                sb.append(", gender=");
                sb.append(this.gender);
            }
            if (this.tenant_name != null) {
                sb.append(", tenant_name=");
                sb.append(this.tenant_name);
            }
            if (this.contact_token != null) {
                sb.append(", contact_token=");
                sb.append(this.contact_token);
            }
            if (this.contact_application_id != null) {
                sb.append(", contact_application_id=");
                sb.append(this.contact_application_id);
            }
            if (this.enable_add_by_contact_token != null) {
                sb.append(", enable_add_by_contact_token=");
                sb.append(this.enable_add_by_contact_token);
            }
            if (this.leader_id != null) {
                sb.append(", leader_id=");
                sb.append(this.leader_id);
            }
            if (this.str_contact_application_id != null) {
                sb.append(", str_contact_application_id=");
                sb.append(this.str_contact_application_id);
            }
            if (this.is_blocked != null) {
                sb.append(", is_blocked=");
                sb.append(this.is_blocked);
            }
            if (this.block_status != null) {
                sb.append(", block_status=");
                sb.append(this.block_status);
            }
            if (this.user_tag != null) {
                sb.append(", user_tag=");
                sb.append(this.user_tag);
            }
            if (this.is_tenant_certification != null) {
                sb.append(", is_tenant_certification=");
                sb.append(this.is_tenant_certification);
            }
            if (this.tenant_certification_url != null) {
                sb.append(", tenant_certification_url=");
                sb.append(this.tenant_certification_url);
            }
            if (this.has_tenant_certification != null) {
                sb.append(", has_tenant_certification=");
                sb.append(this.has_tenant_certification);
            }
            if (!this.custom_tag_fields.isEmpty()) {
                sb.append(", custom_tag_fields=");
                sb.append(this.custom_tag_fields);
            }
            if (this.top_image != null) {
                sb.append(", top_image=");
                sb.append(this.top_image);
            }
            if (this.share_info != null) {
                sb.append(", share_info=");
                sb.append(this.share_info);
            }
            if (this.medal_list != null) {
                sb.append(", medal_list=");
                sb.append(this.medal_list);
            }
            if (this.is_special_focus != null) {
                sb.append(", is_special_focus=");
                sb.append(this.is_special_focus);
            }
            if (this.user_id != null) {
                sb.append(", user_id=");
                sb.append(this.user_id);
            }
            if (this.user_name != null) {
                sb.append(", user_name=");
                sb.append(this.user_name);
            }
            if (this.tenant_id != null) {
                sb.append(", tenant_id=");
                sb.append(this.tenant_id);
            }
            if (this.is_resigned != null) {
                sb.append(", is_resigned=");
                sb.append(this.is_resigned);
            }
            if (this.do_not_disturb_end_time != null) {
                sb.append(", do_not_disturb_end_time=");
                sb.append(this.do_not_disturb_end_time);
            }
            if (this.work_status != null) {
                sb.append(", work_status=");
                sb.append(this.work_status);
            }
            if (this.avatar_key != null) {
                sb.append(", avatar_key=");
                sb.append(this.avatar_key);
            }
            if (this.is_registered != null) {
                sb.append(", is_registered=");
                sb.append(this.is_registered);
            }
            if (this.is_frozen != null) {
                sb.append(", is_frozen=");
                sb.append(this.is_frozen);
            }
            if (this.description != null) {
                sb.append(", description=");
                sb.append(this.description);
            }
            if (!this.chatter_status.isEmpty()) {
                sb.append(", chatter_status=");
                sb.append(this.chatter_status);
            }
            if (this.avatar_medal != null) {
                sb.append(", avatar_medal=");
                sb.append(this.avatar_medal);
            }
            StringBuilder replace = sb.replace(0, 2, "UserInfo{");
            replace.append('}');
            return replace.toString();
        }

        public UserInfo(FriendStatus friendStatus, Gender gender2, I18nVal i18nVal, String str, Long l, Boolean bool, String str2, String str3, Boolean bool2, BlockStatus blockStatus, UserTag userTag, Boolean bool3, String str4, Boolean bool4, List<Field> list, ImageSetPassThrough imageSetPassThrough, ShareInfo shareInfo, MedalList medalList, Boolean bool5, String str5, String str6, String str7, Boolean bool6, Long l2, WorkStatus workStatus, String str8, Boolean bool7, Boolean bool8, Chatter.Description description2, List<Chatter.ChatterCustomStatus> list2, AvatarMedal avatarMedal) {
            this(friendStatus, gender2, i18nVal, str, l, bool, str2, str3, bool2, blockStatus, userTag, bool3, str4, bool4, list, imageSetPassThrough, shareInfo, medalList, bool5, str5, str6, str7, bool6, l2, workStatus, str8, bool7, bool8, description2, list2, avatarMedal, ByteString.EMPTY);
        }

        public UserInfo(FriendStatus friendStatus, Gender gender2, I18nVal i18nVal, String str, Long l, Boolean bool, String str2, String str3, Boolean bool2, BlockStatus blockStatus, UserTag userTag, Boolean bool3, String str4, Boolean bool4, List<Field> list, ImageSetPassThrough imageSetPassThrough, ShareInfo shareInfo, MedalList medalList, Boolean bool5, String str5, String str6, String str7, Boolean bool6, Long l2, WorkStatus workStatus, String str8, Boolean bool7, Boolean bool8, Chatter.Description description2, List<Chatter.ChatterCustomStatus> list2, AvatarMedal avatarMedal, ByteString byteString) {
            super(ADAPTER, byteString);
            this.friend_status = friendStatus;
            this.gender = gender2;
            this.tenant_name = i18nVal;
            this.contact_token = str;
            this.contact_application_id = l;
            this.enable_add_by_contact_token = bool;
            this.leader_id = str2;
            this.str_contact_application_id = str3;
            this.is_blocked = bool2;
            this.block_status = blockStatus;
            this.user_tag = userTag;
            this.is_tenant_certification = bool3;
            this.tenant_certification_url = str4;
            this.has_tenant_certification = bool4;
            this.custom_tag_fields = Internal.immutableCopyOf("custom_tag_fields", list);
            this.top_image = imageSetPassThrough;
            this.share_info = shareInfo;
            this.medal_list = medalList;
            this.is_special_focus = bool5;
            this.user_id = str5;
            this.user_name = str6;
            this.tenant_id = str7;
            this.is_resigned = bool6;
            this.do_not_disturb_end_time = l2;
            this.work_status = workStatus;
            this.avatar_key = str8;
            this.is_registered = bool7;
            this.is_frozen = bool8;
            this.description = description2;
            this.chatter_status = Internal.immutableCopyOf("chatter_status", list2);
            this.avatar_medal = avatarMedal;
        }
    }

    public static final class Department extends Message<Department, C16498a> {
        public static final ProtoAdapter<Department> ADAPTER = new C16499b();
        private static final long serialVersionUID = 0;
        public final List<DepartmentPath> department_paths;

        public static final class DepartmentPath extends Message<DepartmentPath, C16496a> {
            public static final ProtoAdapter<DepartmentPath> ADAPTER = new C16497b();
            private static final long serialVersionUID = 0;
            public final List<DepartmentNode> department_nodes;

            public static final class DepartmentNode extends Message<DepartmentNode, C16494a> {
                public static final ProtoAdapter<DepartmentNode> ADAPTER = new C16495b();
                private static final long serialVersionUID = 0;
                public final String department_id;
                public final I18nVal department_name;

                /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$Department$DepartmentPath$DepartmentNode$b */
                private static final class C16495b extends ProtoAdapter<DepartmentNode> {
                    C16495b() {
                        super(FieldEncoding.LENGTH_DELIMITED, DepartmentNode.class);
                    }

                    /* renamed from: a */
                    public int encodedSize(DepartmentNode departmentNode) {
                        int i;
                        int i2 = 0;
                        if (departmentNode.department_name != null) {
                            i = I18nVal.ADAPTER.encodedSizeWithTag(1, departmentNode.department_name);
                        } else {
                            i = 0;
                        }
                        if (departmentNode.department_id != null) {
                            i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, departmentNode.department_id);
                        }
                        return i + i2 + departmentNode.unknownFields().size();
                    }

                    /* renamed from: a */
                    public DepartmentNode decode(ProtoReader protoReader) throws IOException {
                        C16494a aVar = new C16494a();
                        aVar.f42813b = "";
                        long beginMessage = protoReader.beginMessage();
                        while (true) {
                            int nextTag = protoReader.nextTag();
                            if (nextTag == -1) {
                                protoReader.endMessage(beginMessage);
                                return aVar.build();
                            } else if (nextTag == 1) {
                                aVar.f42812a = I18nVal.ADAPTER.decode(protoReader);
                            } else if (nextTag != 2) {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                aVar.f42813b = ProtoAdapter.STRING.decode(protoReader);
                            }
                        }
                    }

                    /* renamed from: a */
                    public void encode(ProtoWriter protoWriter, DepartmentNode departmentNode) throws IOException {
                        if (departmentNode.department_name != null) {
                            I18nVal.ADAPTER.encodeWithTag(protoWriter, 1, departmentNode.department_name);
                        }
                        if (departmentNode.department_id != null) {
                            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, departmentNode.department_id);
                        }
                        protoWriter.writeBytes(departmentNode.unknownFields());
                    }
                }

                /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$Department$DepartmentPath$DepartmentNode$a */
                public static final class C16494a extends Message.Builder<DepartmentNode, C16494a> {

                    /* renamed from: a */
                    public I18nVal f42812a;

                    /* renamed from: b */
                    public String f42813b;

                    /* renamed from: a */
                    public DepartmentNode build() {
                        return new DepartmentNode(this.f42812a, this.f42813b, super.buildUnknownFields());
                    }
                }

                @Override // com.squareup.wire.Message
                public C16494a newBuilder() {
                    C16494a aVar = new C16494a();
                    aVar.f42812a = this.department_name;
                    aVar.f42813b = this.department_id;
                    aVar.addUnknownFields(unknownFields());
                    return aVar;
                }

                @Override // com.squareup.wire.Message
                public String toString() {
                    C1911a.m8540a("contact", "DepartmentNode");
                    StringBuilder sb = new StringBuilder();
                    if (this.department_name != null) {
                        sb.append(", department_name=");
                        sb.append(this.department_name);
                    }
                    if (this.department_id != null) {
                        sb.append(", department_id=");
                        sb.append(this.department_id);
                    }
                    StringBuilder replace = sb.replace(0, 2, "DepartmentNode{");
                    replace.append('}');
                    return replace.toString();
                }

                public DepartmentNode(I18nVal i18nVal, String str) {
                    this(i18nVal, str, ByteString.EMPTY);
                }

                public DepartmentNode(I18nVal i18nVal, String str, ByteString byteString) {
                    super(ADAPTER, byteString);
                    this.department_name = i18nVal;
                    this.department_id = str;
                }
            }

            /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$Department$DepartmentPath$b */
            private static final class C16497b extends ProtoAdapter<DepartmentPath> {
                C16497b() {
                    super(FieldEncoding.LENGTH_DELIMITED, DepartmentPath.class);
                }

                /* renamed from: a */
                public int encodedSize(DepartmentPath departmentPath) {
                    return DepartmentNode.ADAPTER.asRepeated().encodedSizeWithTag(1, departmentPath.department_nodes) + departmentPath.unknownFields().size();
                }

                /* renamed from: a */
                public DepartmentPath decode(ProtoReader protoReader) throws IOException {
                    C16496a aVar = new C16496a();
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
                            aVar.f42814a.add(DepartmentNode.ADAPTER.decode(protoReader));
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, DepartmentPath departmentPath) throws IOException {
                    DepartmentNode.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, departmentPath.department_nodes);
                    protoWriter.writeBytes(departmentPath.unknownFields());
                }
            }

            /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$Department$DepartmentPath$a */
            public static final class C16496a extends Message.Builder<DepartmentPath, C16496a> {

                /* renamed from: a */
                public List<DepartmentNode> f42814a = Internal.newMutableList();

                /* renamed from: a */
                public DepartmentPath build() {
                    return new DepartmentPath(this.f42814a, super.buildUnknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C16496a newBuilder() {
                C16496a aVar = new C16496a();
                aVar.f42814a = Internal.copyOf("department_nodes", this.department_nodes);
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("contact", "DepartmentPath");
                StringBuilder sb = new StringBuilder();
                if (!this.department_nodes.isEmpty()) {
                    sb.append(", department_nodes=");
                    sb.append(this.department_nodes);
                }
                StringBuilder replace = sb.replace(0, 2, "DepartmentPath{");
                replace.append('}');
                return replace.toString();
            }

            public DepartmentPath(List<DepartmentNode> list) {
                this(list, ByteString.EMPTY);
            }

            public DepartmentPath(List<DepartmentNode> list, ByteString byteString) {
                super(ADAPTER, byteString);
                this.department_nodes = Internal.immutableCopyOf("department_nodes", list);
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$Department$b */
        private static final class C16499b extends ProtoAdapter<Department> {
            C16499b() {
                super(FieldEncoding.LENGTH_DELIMITED, Department.class);
            }

            /* renamed from: a */
            public int encodedSize(Department department) {
                return DepartmentPath.ADAPTER.asRepeated().encodedSizeWithTag(1, department.department_paths) + department.unknownFields().size();
            }

            /* renamed from: a */
            public Department decode(ProtoReader protoReader) throws IOException {
                C16498a aVar = new C16498a();
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
                        aVar.f42815a.add(DepartmentPath.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Department department) throws IOException {
                DepartmentPath.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, department.department_paths);
                protoWriter.writeBytes(department.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$Department$a */
        public static final class C16498a extends Message.Builder<Department, C16498a> {

            /* renamed from: a */
            public List<DepartmentPath> f42815a = Internal.newMutableList();

            /* renamed from: a */
            public Department build() {
                return new Department(this.f42815a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16498a newBuilder() {
            C16498a aVar = new C16498a();
            aVar.f42815a = Internal.copyOf("department_paths", this.department_paths);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("contact", "Department");
            StringBuilder sb = new StringBuilder();
            if (!this.department_paths.isEmpty()) {
                sb.append(", department_paths=");
                sb.append(this.department_paths);
            }
            StringBuilder replace = sb.replace(0, 2, "Department{");
            replace.append('}');
            return replace.toString();
        }

        public Department(List<DepartmentPath> list) {
            this(list, ByteString.EMPTY);
        }

        public Department(List<DepartmentPath> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.department_paths = Internal.immutableCopyOf("department_paths", list);
        }
    }

    public static final class CustomImage extends Message<CustomImage, C16492a> {
        public static final ProtoAdapter<CustomImage> ADAPTER = new C16493b();
        private static final long serialVersionUID = 0;
        public final String resource_key;

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$CustomImage$b */
        private static final class C16493b extends ProtoAdapter<CustomImage> {
            C16493b() {
                super(FieldEncoding.LENGTH_DELIMITED, CustomImage.class);
            }

            /* renamed from: a */
            public int encodedSize(CustomImage customImage) {
                int i;
                if (customImage.resource_key != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, customImage.resource_key);
                } else {
                    i = 0;
                }
                return i + customImage.unknownFields().size();
            }

            /* renamed from: a */
            public CustomImage decode(ProtoReader protoReader) throws IOException {
                C16492a aVar = new C16492a();
                aVar.f42811a = "";
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
                        aVar.f42811a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, CustomImage customImage) throws IOException {
                if (customImage.resource_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, customImage.resource_key);
                }
                protoWriter.writeBytes(customImage.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$CustomImage$a */
        public static final class C16492a extends Message.Builder<CustomImage, C16492a> {

            /* renamed from: a */
            public String f42811a;

            /* renamed from: a */
            public CustomImage build() {
                return new CustomImage(this.f42811a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16492a newBuilder() {
            C16492a aVar = new C16492a();
            aVar.f42811a = this.resource_key;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("contact", "CustomImage");
            StringBuilder sb = new StringBuilder();
            if (this.resource_key != null) {
                sb.append(", resource_key=");
                sb.append(this.resource_key);
            }
            StringBuilder replace = sb.replace(0, 2, "CustomImage{");
            replace.append('}');
            return replace.toString();
        }

        public CustomImage(String str) {
            this(str, ByteString.EMPTY);
        }

        public CustomImage(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.resource_key = str;
        }
    }

    public static final class Href extends Message<Href, C16502a> {
        public static final ProtoAdapter<Href> ADAPTER = new C16503b();
        private static final long serialVersionUID = 0;
        public final I18nVal link;
        public final Style style;
        public final I18nVal title;

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$Href$b */
        private static final class C16503b extends ProtoAdapter<Href> {
            C16503b() {
                super(FieldEncoding.LENGTH_DELIMITED, Href.class);
            }

            /* renamed from: a */
            public int encodedSize(Href href) {
                int i;
                int i2;
                int i3 = 0;
                if (href.title != null) {
                    i = I18nVal.ADAPTER.encodedSizeWithTag(1, href.title);
                } else {
                    i = 0;
                }
                if (href.link != null) {
                    i2 = I18nVal.ADAPTER.encodedSizeWithTag(2, href.link);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (href.style != null) {
                    i3 = Style.ADAPTER.encodedSizeWithTag(3, href.style);
                }
                return i4 + i3 + href.unknownFields().size();
            }

            /* renamed from: a */
            public Href decode(ProtoReader protoReader) throws IOException {
                C16502a aVar = new C16502a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f42821a = I18nVal.ADAPTER.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f42822b = I18nVal.ADAPTER.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f42823c = Style.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Href href) throws IOException {
                if (href.title != null) {
                    I18nVal.ADAPTER.encodeWithTag(protoWriter, 1, href.title);
                }
                if (href.link != null) {
                    I18nVal.ADAPTER.encodeWithTag(protoWriter, 2, href.link);
                }
                if (href.style != null) {
                    Style.ADAPTER.encodeWithTag(protoWriter, 3, href.style);
                }
                protoWriter.writeBytes(href.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$Href$a */
        public static final class C16502a extends Message.Builder<Href, C16502a> {

            /* renamed from: a */
            public I18nVal f42821a;

            /* renamed from: b */
            public I18nVal f42822b;

            /* renamed from: c */
            public Style f42823c;

            /* renamed from: a */
            public Href build() {
                return new Href(this.f42821a, this.f42822b, this.f42823c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16502a newBuilder() {
            C16502a aVar = new C16502a();
            aVar.f42821a = this.title;
            aVar.f42822b = this.link;
            aVar.f42823c = this.style;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("contact", "Href");
            StringBuilder sb = new StringBuilder();
            if (this.title != null) {
                sb.append(", title=");
                sb.append(this.title);
            }
            if (this.link != null) {
                sb.append(", link=");
                sb.append(this.link);
            }
            if (this.style != null) {
                sb.append(", style=");
                sb.append(this.style);
            }
            StringBuilder replace = sb.replace(0, 2, "Href{");
            replace.append('}');
            return replace.toString();
        }

        public Href(I18nVal i18nVal, I18nVal i18nVal2, Style style2) {
            this(i18nVal, i18nVal2, style2, ByteString.EMPTY);
        }

        public Href(I18nVal i18nVal, I18nVal i18nVal2, Style style2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.title = i18nVal;
            this.link = i18nVal2;
            this.style = style2;
        }
    }

    public static final class HrefList extends Message<HrefList, C16504a> {
        public static final ProtoAdapter<HrefList> ADAPTER = new C16505b();
        private static final long serialVersionUID = 0;
        public final List<Href> href_list;

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$HrefList$b */
        private static final class C16505b extends ProtoAdapter<HrefList> {
            C16505b() {
                super(FieldEncoding.LENGTH_DELIMITED, HrefList.class);
            }

            /* renamed from: a */
            public int encodedSize(HrefList hrefList) {
                return Href.ADAPTER.asRepeated().encodedSizeWithTag(1, hrefList.href_list) + hrefList.unknownFields().size();
            }

            /* renamed from: a */
            public HrefList decode(ProtoReader protoReader) throws IOException {
                C16504a aVar = new C16504a();
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
                        aVar.f42824a.add(Href.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, HrefList hrefList) throws IOException {
                Href.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, hrefList.href_list);
                protoWriter.writeBytes(hrefList.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$HrefList$a */
        public static final class C16504a extends Message.Builder<HrefList, C16504a> {

            /* renamed from: a */
            public List<Href> f42824a = Internal.newMutableList();

            /* renamed from: a */
            public HrefList build() {
                return new HrefList(this.f42824a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16504a newBuilder() {
            C16504a aVar = new C16504a();
            aVar.f42824a = Internal.copyOf("href_list", this.href_list);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("contact", "HrefList");
            StringBuilder sb = new StringBuilder();
            if (!this.href_list.isEmpty()) {
                sb.append(", href_list=");
                sb.append(this.href_list);
            }
            StringBuilder replace = sb.replace(0, 2, "HrefList{");
            replace.append('}');
            return replace.toString();
        }

        public HrefList(List<Href> list) {
            this(list, ByteString.EMPTY);
        }

        public HrefList(List<Href> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.href_list = Internal.immutableCopyOf("href_list", list);
        }
    }

    public static final class Medal extends Message<Medal, C16508a> {
        public static final ProtoAdapter<Medal> ADAPTER = new C16509b();
        private static final long serialVersionUID = 0;
        public final I18nVal i18n_name;
        public final ImageSetPassThrough image;

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$Medal$b */
        private static final class C16509b extends ProtoAdapter<Medal> {
            C16509b() {
                super(FieldEncoding.LENGTH_DELIMITED, Medal.class);
            }

            /* renamed from: a */
            public int encodedSize(Medal medal) {
                int i;
                int i2 = 0;
                if (medal.image != null) {
                    i = ImageSetPassThrough.ADAPTER.encodedSizeWithTag(1, medal.image);
                } else {
                    i = 0;
                }
                if (medal.i18n_name != null) {
                    i2 = I18nVal.ADAPTER.encodedSizeWithTag(2, medal.i18n_name);
                }
                return i + i2 + medal.unknownFields().size();
            }

            /* renamed from: a */
            public Medal decode(ProtoReader protoReader) throws IOException {
                C16508a aVar = new C16508a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f42828a = ImageSetPassThrough.ADAPTER.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f42829b = I18nVal.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Medal medal) throws IOException {
                if (medal.image != null) {
                    ImageSetPassThrough.ADAPTER.encodeWithTag(protoWriter, 1, medal.image);
                }
                if (medal.i18n_name != null) {
                    I18nVal.ADAPTER.encodeWithTag(protoWriter, 2, medal.i18n_name);
                }
                protoWriter.writeBytes(medal.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$Medal$a */
        public static final class C16508a extends Message.Builder<Medal, C16508a> {

            /* renamed from: a */
            public ImageSetPassThrough f42828a;

            /* renamed from: b */
            public I18nVal f42829b;

            /* renamed from: a */
            public Medal build() {
                return new Medal(this.f42828a, this.f42829b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16508a newBuilder() {
            C16508a aVar = new C16508a();
            aVar.f42828a = this.image;
            aVar.f42829b = this.i18n_name;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("contact", "Medal");
            StringBuilder sb = new StringBuilder();
            if (this.image != null) {
                sb.append(", image=");
                sb.append(this.image);
            }
            if (this.i18n_name != null) {
                sb.append(", i18n_name=");
                sb.append(this.i18n_name);
            }
            StringBuilder replace = sb.replace(0, 2, "Medal{");
            replace.append('}');
            return replace.toString();
        }

        public Medal(ImageSetPassThrough imageSetPassThrough, I18nVal i18nVal) {
            this(imageSetPassThrough, i18nVal, ByteString.EMPTY);
        }

        public Medal(ImageSetPassThrough imageSetPassThrough, I18nVal i18nVal, ByteString byteString) {
            super(ADAPTER, byteString);
            this.image = imageSetPassThrough;
            this.i18n_name = i18nVal;
        }
    }

    public static final class MedalList extends Message<MedalList, C16510a> {
        public static final ProtoAdapter<MedalList> ADAPTER = new C16511b();
        public static final Integer DEFAULT_TOTAL_NUM = 0;
        private static final long serialVersionUID = 0;
        public final List<Medal> medal_meta;
        public final Integer total_num;

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$MedalList$b */
        private static final class C16511b extends ProtoAdapter<MedalList> {
            C16511b() {
                super(FieldEncoding.LENGTH_DELIMITED, MedalList.class);
            }

            /* renamed from: a */
            public int encodedSize(MedalList medalList) {
                int i;
                int encodedSizeWithTag = Medal.ADAPTER.asRepeated().encodedSizeWithTag(1, medalList.medal_meta);
                if (medalList.total_num != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(2, medalList.total_num);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + medalList.unknownFields().size();
            }

            /* renamed from: a */
            public MedalList decode(ProtoReader protoReader) throws IOException {
                C16510a aVar = new C16510a();
                aVar.f42831b = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f42830a.add(Medal.ADAPTER.decode(protoReader));
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f42831b = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MedalList medalList) throws IOException {
                Medal.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, medalList.medal_meta);
                if (medalList.total_num != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, medalList.total_num);
                }
                protoWriter.writeBytes(medalList.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$MedalList$a */
        public static final class C16510a extends Message.Builder<MedalList, C16510a> {

            /* renamed from: a */
            public List<Medal> f42830a = Internal.newMutableList();

            /* renamed from: b */
            public Integer f42831b;

            /* renamed from: a */
            public MedalList build() {
                return new MedalList(this.f42830a, this.f42831b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16510a newBuilder() {
            C16510a aVar = new C16510a();
            aVar.f42830a = Internal.copyOf("medal_meta", this.medal_meta);
            aVar.f42831b = this.total_num;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("contact", "MedalList");
            StringBuilder sb = new StringBuilder();
            if (!this.medal_meta.isEmpty()) {
                sb.append(", medal_meta=");
                sb.append(this.medal_meta);
            }
            if (this.total_num != null) {
                sb.append(", total_num=");
                sb.append(this.total_num);
            }
            StringBuilder replace = sb.replace(0, 2, "MedalList{");
            replace.append('}');
            return replace.toString();
        }

        public MedalList(List<Medal> list, Integer num) {
            this(list, num, ByteString.EMPTY);
        }

        public MedalList(List<Medal> list, Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            this.medal_meta = Internal.immutableCopyOf("medal_meta", list);
            this.total_num = num;
        }
    }

    public static final class MemoDescription extends Message<MemoDescription, C16512a> {
        public static final ProtoAdapter<MemoDescription> ADAPTER = new C16513b();
        private static final long serialVersionUID = 0;
        public final ImageSetPassThrough memo_picture;
        public final String memo_text;

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$MemoDescription$b */
        private static final class C16513b extends ProtoAdapter<MemoDescription> {
            C16513b() {
                super(FieldEncoding.LENGTH_DELIMITED, MemoDescription.class);
            }

            /* renamed from: a */
            public int encodedSize(MemoDescription memoDescription) {
                int i;
                int i2 = 0;
                if (memoDescription.memo_text != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, memoDescription.memo_text);
                } else {
                    i = 0;
                }
                if (memoDescription.memo_picture != null) {
                    i2 = ImageSetPassThrough.ADAPTER.encodedSizeWithTag(2, memoDescription.memo_picture);
                }
                return i + i2 + memoDescription.unknownFields().size();
            }

            /* renamed from: a */
            public MemoDescription decode(ProtoReader protoReader) throws IOException {
                C16512a aVar = new C16512a();
                aVar.f42832a = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f42832a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f42833b = ImageSetPassThrough.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MemoDescription memoDescription) throws IOException {
                if (memoDescription.memo_text != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, memoDescription.memo_text);
                }
                if (memoDescription.memo_picture != null) {
                    ImageSetPassThrough.ADAPTER.encodeWithTag(protoWriter, 2, memoDescription.memo_picture);
                }
                protoWriter.writeBytes(memoDescription.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$MemoDescription$a */
        public static final class C16512a extends Message.Builder<MemoDescription, C16512a> {

            /* renamed from: a */
            public String f42832a;

            /* renamed from: b */
            public ImageSetPassThrough f42833b;

            /* renamed from: a */
            public MemoDescription build() {
                return new MemoDescription(this.f42832a, this.f42833b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16512a newBuilder() {
            C16512a aVar = new C16512a();
            aVar.f42832a = this.memo_text;
            aVar.f42833b = this.memo_picture;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("contact", "MemoDescription");
            StringBuilder sb = new StringBuilder();
            if (this.memo_text != null) {
                sb.append(", memo_text=");
                sb.append(this.memo_text);
            }
            if (this.memo_picture != null) {
                sb.append(", memo_picture=");
                sb.append(this.memo_picture);
            }
            StringBuilder replace = sb.replace(0, 2, "MemoDescription{");
            replace.append('}');
            return replace.toString();
        }

        public MemoDescription(String str, ImageSetPassThrough imageSetPassThrough) {
            this(str, imageSetPassThrough, ByteString.EMPTY);
        }

        public MemoDescription(String str, ImageSetPassThrough imageSetPassThrough, ByteString byteString) {
            super(ADAPTER, byteString);
            this.memo_text = str;
            this.memo_picture = imageSetPassThrough;
        }
    }

    public static final class Permission extends Message<Permission, C16514a> {
        public static final ProtoAdapter<Permission> ADAPTER = new C16515b();
        public static final Boolean DEFAULT_CAN_FIND = false;
        public static final Boolean DEFAULT_CAN_NOT_FIND = false;
        private static final long serialVersionUID = 0;
        public final Boolean can_find;
        public final Boolean can_not_find;

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$Permission$b */
        private static final class C16515b extends ProtoAdapter<Permission> {
            C16515b() {
                super(FieldEncoding.LENGTH_DELIMITED, Permission.class);
            }

            /* renamed from: a */
            public int encodedSize(Permission permission) {
                int i;
                int i2 = 0;
                if (permission.can_find != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, permission.can_find);
                } else {
                    i = 0;
                }
                if (permission.can_not_find != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, permission.can_not_find);
                }
                return i + i2 + permission.unknownFields().size();
            }

            /* renamed from: a */
            public Permission decode(ProtoReader protoReader) throws IOException {
                C16514a aVar = new C16514a();
                aVar.f42834a = false;
                aVar.f42835b = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f42834a = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f42835b = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Permission permission) throws IOException {
                if (permission.can_find != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, permission.can_find);
                }
                if (permission.can_not_find != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, permission.can_not_find);
                }
                protoWriter.writeBytes(permission.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$Permission$a */
        public static final class C16514a extends Message.Builder<Permission, C16514a> {

            /* renamed from: a */
            public Boolean f42834a;

            /* renamed from: b */
            public Boolean f42835b;

            /* renamed from: a */
            public Permission build() {
                return new Permission(this.f42834a, this.f42835b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16514a newBuilder() {
            C16514a aVar = new C16514a();
            aVar.f42834a = this.can_find;
            aVar.f42835b = this.can_not_find;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("contact", "Permission");
            StringBuilder sb = new StringBuilder();
            if (this.can_find != null) {
                sb.append(", can_find=");
                sb.append(this.can_find);
            }
            if (this.can_not_find != null) {
                sb.append(", can_not_find=");
                sb.append(this.can_not_find);
            }
            StringBuilder replace = sb.replace(0, 2, "Permission{");
            replace.append('}');
            return replace.toString();
        }

        public Permission(Boolean bool, Boolean bool2) {
            this(bool, bool2, ByteString.EMPTY);
        }

        public Permission(Boolean bool, Boolean bool2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.can_find = bool;
            this.can_not_find = bool2;
        }
    }

    public static final class PhoneNumber extends Message<PhoneNumber, C16516a> {
        public static final ProtoAdapter<PhoneNumber> ADAPTER = new C16517b();
        public static final Boolean DEFAULT_IS_PLAIN = false;
        public static final Boolean DEFAULT_RATE_LIMITED = false;
        private static final long serialVersionUID = 0;
        public final String country_code;
        public final Boolean is_plain;
        public final String number;
        public final Boolean rate_limited;

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$PhoneNumber$b */
        private static final class C16517b extends ProtoAdapter<PhoneNumber> {
            C16517b() {
                super(FieldEncoding.LENGTH_DELIMITED, PhoneNumber.class);
            }

            /* renamed from: a */
            public int encodedSize(PhoneNumber phoneNumber) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (phoneNumber.number != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, phoneNumber.number);
                } else {
                    i = 0;
                }
                if (phoneNumber.country_code != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, phoneNumber.country_code);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (phoneNumber.rate_limited != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, phoneNumber.rate_limited);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (phoneNumber.is_plain != null) {
                    i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, phoneNumber.is_plain);
                }
                return i6 + i4 + phoneNumber.unknownFields().size();
            }

            /* renamed from: a */
            public PhoneNumber decode(ProtoReader protoReader) throws IOException {
                C16516a aVar = new C16516a();
                aVar.f42836a = "";
                aVar.f42837b = "";
                aVar.f42838c = false;
                aVar.f42839d = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f42836a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f42837b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f42838c = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f42839d = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, PhoneNumber phoneNumber) throws IOException {
                if (phoneNumber.number != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, phoneNumber.number);
                }
                if (phoneNumber.country_code != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, phoneNumber.country_code);
                }
                if (phoneNumber.rate_limited != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, phoneNumber.rate_limited);
                }
                if (phoneNumber.is_plain != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, phoneNumber.is_plain);
                }
                protoWriter.writeBytes(phoneNumber.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$PhoneNumber$a */
        public static final class C16516a extends Message.Builder<PhoneNumber, C16516a> {

            /* renamed from: a */
            public String f42836a;

            /* renamed from: b */
            public String f42837b;

            /* renamed from: c */
            public Boolean f42838c;

            /* renamed from: d */
            public Boolean f42839d;

            /* renamed from: a */
            public PhoneNumber build() {
                return new PhoneNumber(this.f42836a, this.f42837b, this.f42838c, this.f42839d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16516a newBuilder() {
            C16516a aVar = new C16516a();
            aVar.f42836a = this.number;
            aVar.f42837b = this.country_code;
            aVar.f42838c = this.rate_limited;
            aVar.f42839d = this.is_plain;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("contact", "PhoneNumber");
            StringBuilder sb = new StringBuilder();
            if (this.number != null) {
                sb.append(", number=");
                sb.append(this.number);
            }
            if (this.country_code != null) {
                sb.append(", country_code=");
                sb.append(this.country_code);
            }
            if (this.rate_limited != null) {
                sb.append(", rate_limited=");
                sb.append(this.rate_limited);
            }
            if (this.is_plain != null) {
                sb.append(", is_plain=");
                sb.append(this.is_plain);
            }
            StringBuilder replace = sb.replace(0, 2, "PhoneNumber{");
            replace.append('}');
            return replace.toString();
        }

        public PhoneNumber(String str, String str2, Boolean bool, Boolean bool2) {
            this(str, str2, bool, bool2, ByteString.EMPTY);
        }

        public PhoneNumber(String str, String str2, Boolean bool, Boolean bool2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.number = str;
            this.country_code = str2;
            this.rate_limited = bool;
            this.is_plain = bool2;
        }
    }

    public static final class ShareInfo extends Message<ShareInfo, C16518a> {
        public static final ProtoAdapter<ShareInfo> ADAPTER = new C16519b();
        public static final Boolean DEFAULT_ENABLE = false;
        private static final long serialVersionUID = 0;
        public final I18nVal denied_description;
        public final Boolean enable;
        public final I18nVal i18n_names;

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$ShareInfo$b */
        private static final class C16519b extends ProtoAdapter<ShareInfo> {
            C16519b() {
                super(FieldEncoding.LENGTH_DELIMITED, ShareInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(ShareInfo shareInfo) {
                int i;
                int i2;
                int i3 = 0;
                if (shareInfo.enable != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, shareInfo.enable);
                } else {
                    i = 0;
                }
                if (shareInfo.i18n_names != null) {
                    i2 = I18nVal.ADAPTER.encodedSizeWithTag(2, shareInfo.i18n_names);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (shareInfo.denied_description != null) {
                    i3 = I18nVal.ADAPTER.encodedSizeWithTag(3, shareInfo.denied_description);
                }
                return i4 + i3 + shareInfo.unknownFields().size();
            }

            /* renamed from: a */
            public ShareInfo decode(ProtoReader protoReader) throws IOException {
                C16518a aVar = new C16518a();
                aVar.f42840a = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f42840a = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f42841b = I18nVal.ADAPTER.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f42842c = I18nVal.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ShareInfo shareInfo) throws IOException {
                if (shareInfo.enable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, shareInfo.enable);
                }
                if (shareInfo.i18n_names != null) {
                    I18nVal.ADAPTER.encodeWithTag(protoWriter, 2, shareInfo.i18n_names);
                }
                if (shareInfo.denied_description != null) {
                    I18nVal.ADAPTER.encodeWithTag(protoWriter, 3, shareInfo.denied_description);
                }
                protoWriter.writeBytes(shareInfo.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$ShareInfo$a */
        public static final class C16518a extends Message.Builder<ShareInfo, C16518a> {

            /* renamed from: a */
            public Boolean f42840a;

            /* renamed from: b */
            public I18nVal f42841b;

            /* renamed from: c */
            public I18nVal f42842c;

            /* renamed from: a */
            public ShareInfo build() {
                return new ShareInfo(this.f42840a, this.f42841b, this.f42842c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16518a newBuilder() {
            C16518a aVar = new C16518a();
            aVar.f42840a = this.enable;
            aVar.f42841b = this.i18n_names;
            aVar.f42842c = this.denied_description;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("contact", "ShareInfo");
            StringBuilder sb = new StringBuilder();
            if (this.enable != null) {
                sb.append(", enable=");
                sb.append(this.enable);
            }
            if (this.i18n_names != null) {
                sb.append(", i18n_names=");
                sb.append(this.i18n_names);
            }
            if (this.denied_description != null) {
                sb.append(", denied_description=");
                sb.append(this.denied_description);
            }
            StringBuilder replace = sb.replace(0, 2, "ShareInfo{");
            replace.append('}');
            return replace.toString();
        }

        public ShareInfo(Boolean bool, I18nVal i18nVal, I18nVal i18nVal2) {
            this(bool, i18nVal, i18nVal2, ByteString.EMPTY);
        }

        public ShareInfo(Boolean bool, I18nVal i18nVal, I18nVal i18nVal2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.enable = bool;
            this.i18n_names = i18nVal;
            this.denied_description = i18nVal2;
        }
    }

    public static final class SingleFieldTabInfo extends Message<SingleFieldTabInfo, C16520a> {
        public static final ProtoAdapter<SingleFieldTabInfo> ADAPTER = new C16521b();
        private static final long serialVersionUID = 0;
        public final Field single_field;

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$SingleFieldTabInfo$b */
        private static final class C16521b extends ProtoAdapter<SingleFieldTabInfo> {
            C16521b() {
                super(FieldEncoding.LENGTH_DELIMITED, SingleFieldTabInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(SingleFieldTabInfo singleFieldTabInfo) {
                int i;
                if (singleFieldTabInfo.single_field != null) {
                    i = Field.ADAPTER.encodedSizeWithTag(1, singleFieldTabInfo.single_field);
                } else {
                    i = 0;
                }
                return i + singleFieldTabInfo.unknownFields().size();
            }

            /* renamed from: a */
            public SingleFieldTabInfo decode(ProtoReader protoReader) throws IOException {
                C16520a aVar = new C16520a();
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
                        aVar.f42843a = Field.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SingleFieldTabInfo singleFieldTabInfo) throws IOException {
                if (singleFieldTabInfo.single_field != null) {
                    Field.ADAPTER.encodeWithTag(protoWriter, 1, singleFieldTabInfo.single_field);
                }
                protoWriter.writeBytes(singleFieldTabInfo.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$SingleFieldTabInfo$a */
        public static final class C16520a extends Message.Builder<SingleFieldTabInfo, C16520a> {

            /* renamed from: a */
            public Field f42843a;

            /* renamed from: a */
            public SingleFieldTabInfo build() {
                return new SingleFieldTabInfo(this.f42843a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16520a newBuilder() {
            C16520a aVar = new C16520a();
            aVar.f42843a = this.single_field;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("contact", "SingleFieldTabInfo");
            StringBuilder sb = new StringBuilder();
            if (this.single_field != null) {
                sb.append(", single_field=");
                sb.append(this.single_field);
            }
            StringBuilder replace = sb.replace(0, 2, "SingleFieldTabInfo{");
            replace.append('}');
            return replace.toString();
        }

        public SingleFieldTabInfo(Field field) {
            this(field, ByteString.EMPTY);
        }

        public SingleFieldTabInfo(Field field, ByteString byteString) {
            super(ADAPTER, byteString);
            this.single_field = field;
        }
    }

    public static final class Style extends Message<Style, C16522a> {
        public static final ProtoAdapter<Style> ADAPTER = new C16523b();
        public static final Boolean DEFAULT_EXPANDABLE = false;
        public static final Integer DEFAULT_MAX_LINES = 0;
        private static final long serialVersionUID = 0;
        public final String color;
        public final Boolean expandable;
        public final Integer max_lines;

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$Style$b */
        private static final class C16523b extends ProtoAdapter<Style> {
            C16523b() {
                super(FieldEncoding.LENGTH_DELIMITED, Style.class);
            }

            /* renamed from: a */
            public int encodedSize(Style style) {
                int i;
                int i2;
                int i3 = 0;
                if (style.max_lines != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(1, style.max_lines);
                } else {
                    i = 0;
                }
                if (style.expandable != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, style.expandable);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (style.color != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, style.color);
                }
                return i4 + i3 + style.unknownFields().size();
            }

            /* renamed from: a */
            public Style decode(ProtoReader protoReader) throws IOException {
                C16522a aVar = new C16522a();
                aVar.f42844a = 0;
                aVar.f42845b = false;
                aVar.f42846c = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f42844a = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f42845b = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f42846c = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Style style) throws IOException {
                if (style.max_lines != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, style.max_lines);
                }
                if (style.expandable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, style.expandable);
                }
                if (style.color != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, style.color);
                }
                protoWriter.writeBytes(style.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$Style$a */
        public static final class C16522a extends Message.Builder<Style, C16522a> {

            /* renamed from: a */
            public Integer f42844a;

            /* renamed from: b */
            public Boolean f42845b;

            /* renamed from: c */
            public String f42846c;

            /* renamed from: a */
            public Style build() {
                return new Style(this.f42844a, this.f42845b, this.f42846c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16522a newBuilder() {
            C16522a aVar = new C16522a();
            aVar.f42844a = this.max_lines;
            aVar.f42845b = this.expandable;
            aVar.f42846c = this.color;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("contact", "Style");
            StringBuilder sb = new StringBuilder();
            if (this.max_lines != null) {
                sb.append(", max_lines=");
                sb.append(this.max_lines);
            }
            if (this.expandable != null) {
                sb.append(", expandable=");
                sb.append(this.expandable);
            }
            if (this.color != null) {
                sb.append(", color=");
                sb.append(this.color);
            }
            StringBuilder replace = sb.replace(0, 2, "Style{");
            replace.append('}');
            return replace.toString();
        }

        public Style(Integer num, Boolean bool, String str) {
            this(num, bool, str, ByteString.EMPTY);
        }

        public Style(Integer num, Boolean bool, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.max_lines = num;
            this.expandable = bool;
            this.color = str;
        }
    }

    public static final class Text extends Message<Text, C16526a> {
        public static final ProtoAdapter<Text> ADAPTER = new C16527b();
        private static final long serialVersionUID = 0;
        public final Style style;
        public final I18nVal text;

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$Text$b */
        private static final class C16527b extends ProtoAdapter<Text> {
            C16527b() {
                super(FieldEncoding.LENGTH_DELIMITED, Text.class);
            }

            /* renamed from: a */
            public int encodedSize(Text text) {
                int i;
                int i2 = 0;
                if (text.text != null) {
                    i = I18nVal.ADAPTER.encodedSizeWithTag(1, text.text);
                } else {
                    i = 0;
                }
                if (text.style != null) {
                    i2 = Style.ADAPTER.encodedSizeWithTag(2, text.style);
                }
                return i + i2 + text.unknownFields().size();
            }

            /* renamed from: a */
            public Text decode(ProtoReader protoReader) throws IOException {
                C16526a aVar = new C16526a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f42851a = I18nVal.ADAPTER.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f42852b = Style.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Text text) throws IOException {
                if (text.text != null) {
                    I18nVal.ADAPTER.encodeWithTag(protoWriter, 1, text.text);
                }
                if (text.style != null) {
                    Style.ADAPTER.encodeWithTag(protoWriter, 2, text.style);
                }
                protoWriter.writeBytes(text.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$Text$a */
        public static final class C16526a extends Message.Builder<Text, C16526a> {

            /* renamed from: a */
            public I18nVal f42851a;

            /* renamed from: b */
            public Style f42852b;

            /* renamed from: a */
            public Text build() {
                return new Text(this.f42851a, this.f42852b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16526a newBuilder() {
            C16526a aVar = new C16526a();
            aVar.f42851a = this.text;
            aVar.f42852b = this.style;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("contact", "Text");
            StringBuilder sb = new StringBuilder();
            if (this.text != null) {
                sb.append(", text=");
                sb.append(this.text);
            }
            if (this.style != null) {
                sb.append(", style=");
                sb.append(this.style);
            }
            StringBuilder replace = sb.replace(0, 2, "Text{");
            replace.append('}');
            return replace.toString();
        }

        public Text(I18nVal i18nVal, Style style2) {
            this(i18nVal, style2, ByteString.EMPTY);
        }

        public Text(I18nVal i18nVal, Style style2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.text = i18nVal;
            this.style = style2;
        }
    }

    public static final class TextList extends Message<TextList, C16528a> {
        public static final ProtoAdapter<TextList> ADAPTER = new C16529b();
        private static final long serialVersionUID = 0;
        public final List<Text> text_list;

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$TextList$b */
        private static final class C16529b extends ProtoAdapter<TextList> {
            C16529b() {
                super(FieldEncoding.LENGTH_DELIMITED, TextList.class);
            }

            /* renamed from: a */
            public int encodedSize(TextList textList) {
                return Text.ADAPTER.asRepeated().encodedSizeWithTag(1, textList.text_list) + textList.unknownFields().size();
            }

            /* renamed from: a */
            public TextList decode(ProtoReader protoReader) throws IOException {
                C16528a aVar = new C16528a();
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
                        aVar.f42853a.add(Text.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, TextList textList) throws IOException {
                Text.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, textList.text_list);
                protoWriter.writeBytes(textList.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$TextList$a */
        public static final class C16528a extends Message.Builder<TextList, C16528a> {

            /* renamed from: a */
            public List<Text> f42853a = Internal.newMutableList();

            /* renamed from: a */
            public TextList build() {
                return new TextList(this.f42853a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16528a newBuilder() {
            C16528a aVar = new C16528a();
            aVar.f42853a = Internal.copyOf("text_list", this.text_list);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("contact", "TextList");
            StringBuilder sb = new StringBuilder();
            if (!this.text_list.isEmpty()) {
                sb.append(", text_list=");
                sb.append(this.text_list);
            }
            StringBuilder replace = sb.replace(0, 2, "TextList{");
            replace.append('}');
            return replace.toString();
        }

        public TextList(List<Text> list) {
            this(list, ByteString.EMPTY);
        }

        public TextList(List<Text> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.text_list = Internal.immutableCopyOf("text_list", list);
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$b */
    private static final class C16533b extends ProtoAdapter<GetUserProfileResponse> {
        C16533b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserProfileResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserProfileResponse getUserProfileResponse) {
            int i;
            int encodedSizeWithTag = UserInfo.ADAPTER.encodedSizeWithTag(1, getUserProfileResponse.user_info) + CTA.ADAPTER.asRepeated().encodedSizeWithTag(2, getUserProfileResponse.cta_orders) + Field.ADAPTER.asRepeated().encodedSizeWithTag(3, getUserProfileResponse.field_orders);
            if (getUserProfileResponse.permission != null) {
                i = Permission.ADAPTER.encodedSizeWithTag(4, getUserProfileResponse.permission);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + TabInfo.ADAPTER.asRepeated().encodedSizeWithTag(5, getUserProfileResponse.tab_orders) + getUserProfileResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserProfileResponse decode(ProtoReader protoReader) throws IOException {
            C16532a aVar = new C16532a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42885a = UserInfo.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42886b.add(CTA.ADAPTER.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f42887c.add(Field.ADAPTER.decode(protoReader));
                } else if (nextTag == 4) {
                    aVar.f42888d = Permission.ADAPTER.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42889e.add(TabInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUserProfileResponse getUserProfileResponse) throws IOException {
            UserInfo.ADAPTER.encodeWithTag(protoWriter, 1, getUserProfileResponse.user_info);
            CTA.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getUserProfileResponse.cta_orders);
            Field.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, getUserProfileResponse.field_orders);
            if (getUserProfileResponse.permission != null) {
                Permission.ADAPTER.encodeWithTag(protoWriter, 4, getUserProfileResponse.permission);
            }
            TabInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, getUserProfileResponse.tab_orders);
            protoWriter.writeBytes(getUserProfileResponse.unknownFields());
        }
    }

    public static final class I18nVal extends Message<I18nVal, C16506a> {
        public static final ProtoAdapter<I18nVal> ADAPTER = new C16507b();
        private static final long serialVersionUID = 0;
        public final String default_val;
        public final Map<String, String> i18n_vals;

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$I18nVal$a */
        public static final class C16506a extends Message.Builder<I18nVal, C16506a> {

            /* renamed from: a */
            public String f42825a;

            /* renamed from: b */
            public Map<String, String> f42826b = Internal.newMutableMap();

            /* renamed from: a */
            public I18nVal build() {
                String str = this.f42825a;
                if (str != null) {
                    return new I18nVal(str, this.f42826b, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "default_val");
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$I18nVal$b */
        private static final class C16507b extends ProtoAdapter<I18nVal> {

            /* renamed from: a */
            private final ProtoAdapter<Map<String, String>> f42827a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

            C16507b() {
                super(FieldEncoding.LENGTH_DELIMITED, I18nVal.class);
            }

            /* renamed from: a */
            public int encodedSize(I18nVal i18nVal) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, i18nVal.default_val) + this.f42827a.encodedSizeWithTag(2, i18nVal.i18n_vals) + i18nVal.unknownFields().size();
            }

            /* renamed from: a */
            public I18nVal decode(ProtoReader protoReader) throws IOException {
                C16506a aVar = new C16506a();
                aVar.f42825a = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f42825a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f42826b.putAll(this.f42827a.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, I18nVal i18nVal) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, i18nVal.default_val);
                this.f42827a.encodeWithTag(protoWriter, 2, i18nVal.i18n_vals);
                protoWriter.writeBytes(i18nVal.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16506a newBuilder() {
            C16506a aVar = new C16506a();
            aVar.f42825a = this.default_val;
            aVar.f42826b = Internal.copyOf("i18n_vals", this.i18n_vals);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("contact", "I18nVal");
            StringBuilder sb = new StringBuilder();
            sb.append(", default_val=");
            sb.append(this.default_val);
            if (!this.i18n_vals.isEmpty()) {
                sb.append(", i18n_vals=");
                sb.append(this.i18n_vals);
            }
            StringBuilder replace = sb.replace(0, 2, "I18nVal{");
            replace.append('}');
            return replace.toString();
        }

        public I18nVal(String str, Map<String, String> map) {
            this(str, map, ByteString.EMPTY);
        }

        public I18nVal(String str, Map<String, String> map, ByteString byteString) {
            super(ADAPTER, byteString);
            this.default_val = str;
            this.i18n_vals = Internal.immutableCopyOf("i18n_vals", map);
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$a */
    public static final class C16532a extends Message.Builder<GetUserProfileResponse, C16532a> {

        /* renamed from: a */
        public UserInfo f42885a;

        /* renamed from: b */
        public List<CTA> f42886b = Internal.newMutableList();

        /* renamed from: c */
        public List<Field> f42887c = Internal.newMutableList();

        /* renamed from: d */
        public Permission f42888d;

        /* renamed from: e */
        public List<TabInfo> f42889e = Internal.newMutableList();

        /* renamed from: a */
        public GetUserProfileResponse build() {
            UserInfo userInfo = this.f42885a;
            if (userInfo != null) {
                return new GetUserProfileResponse(userInfo, this.f42886b, this.f42887c, this.f42888d, this.f42889e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(userInfo, "user_info");
        }

        /* renamed from: a */
        public C16532a mo58864a(UserInfo userInfo) {
            this.f42885a = userInfo;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16532a newBuilder() {
        C16532a aVar = new C16532a();
        aVar.f42885a = this.user_info;
        aVar.f42886b = Internal.copyOf("cta_orders", this.cta_orders);
        aVar.f42887c = Internal.copyOf("field_orders", this.field_orders);
        aVar.f42888d = this.permission;
        aVar.f42889e = Internal.copyOf("tab_orders", this.tab_orders);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetUserProfileResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", user_info=");
        sb.append(this.user_info);
        if (!this.cta_orders.isEmpty()) {
            sb.append(", cta_orders=");
            sb.append(this.cta_orders);
        }
        if (!this.field_orders.isEmpty()) {
            sb.append(", field_orders=");
            sb.append(this.field_orders);
        }
        if (this.permission != null) {
            sb.append(", permission=");
            sb.append(this.permission);
        }
        if (!this.tab_orders.isEmpty()) {
            sb.append(", tab_orders=");
            sb.append(this.tab_orders);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUserProfileResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserProfileResponse(UserInfo userInfo, List<CTA> list, List<Field> list2, Permission permission2, List<TabInfo> list3) {
        this(userInfo, list, list2, permission2, list3, ByteString.EMPTY);
    }

    public GetUserProfileResponse(UserInfo userInfo, List<CTA> list, List<Field> list2, Permission permission2, List<TabInfo> list3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_info = userInfo;
        this.cta_orders = Internal.immutableCopyOf("cta_orders", list);
        this.field_orders = Internal.immutableCopyOf("field_orders", list2);
        this.permission = permission2;
        this.tab_orders = Internal.immutableCopyOf("tab_orders", list3);
    }
}
