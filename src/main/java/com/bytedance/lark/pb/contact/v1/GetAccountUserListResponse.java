package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
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
import java.util.Map;
import okio.ByteString;

public final class GetAccountUserListResponse extends Message<GetAccountUserListResponse, C16182a> {
    public static final ProtoAdapter<GetAccountUserListResponse> ADAPTER = new C16183b();
    private static final long serialVersionUID = 0;
    public final List<AccountUser> account_users;
    public final C14928Entity entity;
    public final Map<String, ServiceData> env_service_data;
    public final List<PendingUser> pending_users;

    public static final class AccountUser extends Message<AccountUser, C16176a> {
        public static final ProtoAdapter<AccountUser> ADAPTER = new C16177b();
        public static final Boolean DEFAULT_IS_ACTIVE = false;
        public static final Boolean DEFAULT_IS_FROZEN = false;
        public static final Boolean DEFAULT_IS_IDP = false;
        public static final TenantTag DEFAULT_TENANT_TAG = TenantTag.STANDARD;
        public static final Boolean DEFAULT_UPGRADE_ENABLED = false;
        private static final long serialVersionUID = 0;
        public final AccountSecurityConfig account_security_config;
        public final String description;
        public final String icon_key;
        public final String icon_url;
        public final Boolean is_active;
        public final Boolean is_frozen;
        public final Boolean is_idp;
        public final String suite_full_domain;
        public final String tenant_code;
        public final List<TenantSingleProduct> tenant_single_products;
        public final TenantTag tenant_tag;
        public final Boolean upgrade_enabled;
        public final String user_brand;
        public final String user_env;
        public final String user_id;
        public final String user_unit;

        public enum TenantTag implements WireEnum {
            STANDARD(0),
            UNDEFINED(1),
            SIMPLE(2);
            
            public static final ProtoAdapter<TenantTag> ADAPTER = ProtoAdapter.newEnumAdapter(TenantTag.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static TenantTag fromValue(int i) {
                if (i == 0) {
                    return STANDARD;
                }
                if (i == 1) {
                    return UNDEFINED;
                }
                if (i != 2) {
                    return null;
                }
                return SIMPLE;
            }

            private TenantTag(int i) {
                this.value = i;
            }
        }

        public static final class TenantSingleProduct extends Message<TenantSingleProduct, C16174a> {
            public static final ProtoAdapter<TenantSingleProduct> ADAPTER = new C16175b();
            public static final Integer DEFAULT_TENANT_SINGLE_PRODUCT = 0;
            private static final long serialVersionUID = 0;
            public final Integer tenant_single_product;

            /* renamed from: com.bytedance.lark.pb.contact.v1.GetAccountUserListResponse$AccountUser$TenantSingleProduct$b */
            private static final class C16175b extends ProtoAdapter<TenantSingleProduct> {
                C16175b() {
                    super(FieldEncoding.LENGTH_DELIMITED, TenantSingleProduct.class);
                }

                /* renamed from: a */
                public int encodedSize(TenantSingleProduct tenantSingleProduct) {
                    int i;
                    if (tenantSingleProduct.tenant_single_product != null) {
                        i = ProtoAdapter.INT32.encodedSizeWithTag(1, tenantSingleProduct.tenant_single_product);
                    } else {
                        i = 0;
                    }
                    return i + tenantSingleProduct.unknownFields().size();
                }

                /* renamed from: a */
                public TenantSingleProduct decode(ProtoReader protoReader) throws IOException {
                    C16174a aVar = new C16174a();
                    aVar.f42309a = 0;
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
                            aVar.f42309a = ProtoAdapter.INT32.decode(protoReader);
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, TenantSingleProduct tenantSingleProduct) throws IOException {
                    if (tenantSingleProduct.tenant_single_product != null) {
                        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, tenantSingleProduct.tenant_single_product);
                    }
                    protoWriter.writeBytes(tenantSingleProduct.unknownFields());
                }
            }

            /* renamed from: com.bytedance.lark.pb.contact.v1.GetAccountUserListResponse$AccountUser$TenantSingleProduct$a */
            public static final class C16174a extends Message.Builder<TenantSingleProduct, C16174a> {

                /* renamed from: a */
                public Integer f42309a;

                /* renamed from: a */
                public TenantSingleProduct build() {
                    return new TenantSingleProduct(this.f42309a, super.buildUnknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C16174a newBuilder() {
                C16174a aVar = new C16174a();
                aVar.f42309a = this.tenant_single_product;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("contact", "TenantSingleProduct");
                StringBuilder sb = new StringBuilder();
                if (this.tenant_single_product != null) {
                    sb.append(", tenant_single_product=");
                    sb.append(this.tenant_single_product);
                }
                StringBuilder replace = sb.replace(0, 2, "TenantSingleProduct{");
                replace.append('}');
                return replace.toString();
            }

            public TenantSingleProduct(Integer num) {
                this(num, ByteString.EMPTY);
            }

            public TenantSingleProduct(Integer num, ByteString byteString) {
                super(ADAPTER, byteString);
                this.tenant_single_product = num;
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v1.GetAccountUserListResponse$AccountUser$b */
        private static final class C16177b extends ProtoAdapter<AccountUser> {
            C16177b() {
                super(FieldEncoding.LENGTH_DELIMITED, AccountUser.class);
            }

            /* renamed from: a */
            public int encodedSize(AccountUser accountUser) {
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
                int i15 = 0;
                if (accountUser.user_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, accountUser.user_id);
                } else {
                    i = 0;
                }
                if (accountUser.icon_url != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, accountUser.icon_url);
                } else {
                    i2 = 0;
                }
                int i16 = i + i2;
                if (accountUser.description != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, accountUser.description);
                } else {
                    i3 = 0;
                }
                int i17 = i16 + i3;
                if (accountUser.tenant_code != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, accountUser.tenant_code);
                } else {
                    i4 = 0;
                }
                int i18 = i17 + i4;
                if (accountUser.user_env != null) {
                    i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, accountUser.user_env);
                } else {
                    i5 = 0;
                }
                int i19 = i18 + i5;
                if (accountUser.tenant_tag != null) {
                    i6 = TenantTag.ADAPTER.encodedSizeWithTag(6, accountUser.tenant_tag);
                } else {
                    i6 = 0;
                }
                int i20 = i19 + i6;
                if (accountUser.icon_key != null) {
                    i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, accountUser.icon_key);
                } else {
                    i7 = 0;
                }
                int i21 = i20 + i7;
                if (accountUser.account_security_config != null) {
                    i8 = AccountSecurityConfig.ADAPTER.encodedSizeWithTag(8, accountUser.account_security_config);
                } else {
                    i8 = 0;
                }
                int encodedSizeWithTag = i21 + i8 + TenantSingleProduct.ADAPTER.asRepeated().encodedSizeWithTag(9, accountUser.tenant_single_products);
                if (accountUser.is_idp != null) {
                    i9 = ProtoAdapter.BOOL.encodedSizeWithTag(10, accountUser.is_idp);
                } else {
                    i9 = 0;
                }
                int i22 = encodedSizeWithTag + i9;
                if (accountUser.is_frozen != null) {
                    i10 = ProtoAdapter.BOOL.encodedSizeWithTag(11, accountUser.is_frozen);
                } else {
                    i10 = 0;
                }
                int i23 = i22 + i10;
                if (accountUser.is_active != null) {
                    i11 = ProtoAdapter.BOOL.encodedSizeWithTag(12, accountUser.is_active);
                } else {
                    i11 = 0;
                }
                int i24 = i23 + i11;
                if (accountUser.user_unit != null) {
                    i12 = ProtoAdapter.STRING.encodedSizeWithTag(13, accountUser.user_unit);
                } else {
                    i12 = 0;
                }
                int i25 = i24 + i12;
                if (accountUser.user_brand != null) {
                    i13 = ProtoAdapter.STRING.encodedSizeWithTag(14, accountUser.user_brand);
                } else {
                    i13 = 0;
                }
                int i26 = i25 + i13;
                if (accountUser.suite_full_domain != null) {
                    i14 = ProtoAdapter.STRING.encodedSizeWithTag(15, accountUser.suite_full_domain);
                } else {
                    i14 = 0;
                }
                int i27 = i26 + i14;
                if (accountUser.upgrade_enabled != null) {
                    i15 = ProtoAdapter.BOOL.encodedSizeWithTag(16, accountUser.upgrade_enabled);
                }
                return i27 + i15 + accountUser.unknownFields().size();
            }

            /* renamed from: a */
            public AccountUser decode(ProtoReader protoReader) throws IOException {
                C16176a aVar = new C16176a();
                aVar.f42310a = "";
                aVar.f42311b = "";
                aVar.f42312c = "";
                aVar.f42313d = "";
                aVar.f42314e = "";
                aVar.f42315f = TenantTag.STANDARD;
                aVar.f42316g = "";
                aVar.f42319j = false;
                aVar.f42320k = false;
                aVar.f42321l = false;
                aVar.f42322m = "";
                aVar.f42323n = "";
                aVar.f42324o = "";
                aVar.f42325p = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f42310a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                aVar.f42311b = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                aVar.f42312c = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                aVar.f42313d = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                aVar.f42314e = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                try {
                                    aVar.f42315f = TenantTag.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 7:
                                aVar.f42316g = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 8:
                                aVar.f42317h = AccountSecurityConfig.ADAPTER.decode(protoReader);
                                break;
                            case 9:
                                aVar.f42318i.add(TenantSingleProduct.ADAPTER.decode(protoReader));
                                break;
                            case 10:
                                aVar.f42319j = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 11:
                                aVar.f42320k = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                                aVar.f42321l = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 13:
                                aVar.f42322m = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 14:
                                aVar.f42323n = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 15:
                                aVar.f42324o = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 16:
                                aVar.f42325p = ProtoAdapter.BOOL.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, AccountUser accountUser) throws IOException {
                if (accountUser.user_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, accountUser.user_id);
                }
                if (accountUser.icon_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, accountUser.icon_url);
                }
                if (accountUser.description != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, accountUser.description);
                }
                if (accountUser.tenant_code != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, accountUser.tenant_code);
                }
                if (accountUser.user_env != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, accountUser.user_env);
                }
                if (accountUser.tenant_tag != null) {
                    TenantTag.ADAPTER.encodeWithTag(protoWriter, 6, accountUser.tenant_tag);
                }
                if (accountUser.icon_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, accountUser.icon_key);
                }
                if (accountUser.account_security_config != null) {
                    AccountSecurityConfig.ADAPTER.encodeWithTag(protoWriter, 8, accountUser.account_security_config);
                }
                TenantSingleProduct.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, accountUser.tenant_single_products);
                if (accountUser.is_idp != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, accountUser.is_idp);
                }
                if (accountUser.is_frozen != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, accountUser.is_frozen);
                }
                if (accountUser.is_active != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 12, accountUser.is_active);
                }
                if (accountUser.user_unit != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, accountUser.user_unit);
                }
                if (accountUser.user_brand != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, accountUser.user_brand);
                }
                if (accountUser.suite_full_domain != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, accountUser.suite_full_domain);
                }
                if (accountUser.upgrade_enabled != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 16, accountUser.upgrade_enabled);
                }
                protoWriter.writeBytes(accountUser.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v1.GetAccountUserListResponse$AccountUser$a */
        public static final class C16176a extends Message.Builder<AccountUser, C16176a> {

            /* renamed from: a */
            public String f42310a;

            /* renamed from: b */
            public String f42311b;

            /* renamed from: c */
            public String f42312c;

            /* renamed from: d */
            public String f42313d;

            /* renamed from: e */
            public String f42314e;

            /* renamed from: f */
            public TenantTag f42315f;

            /* renamed from: g */
            public String f42316g;

            /* renamed from: h */
            public AccountSecurityConfig f42317h;

            /* renamed from: i */
            public List<TenantSingleProduct> f42318i = Internal.newMutableList();

            /* renamed from: j */
            public Boolean f42319j;

            /* renamed from: k */
            public Boolean f42320k;

            /* renamed from: l */
            public Boolean f42321l;

            /* renamed from: m */
            public String f42322m;

            /* renamed from: n */
            public String f42323n;

            /* renamed from: o */
            public String f42324o;

            /* renamed from: p */
            public Boolean f42325p;

            /* renamed from: a */
            public AccountUser build() {
                return new AccountUser(this.f42310a, this.f42311b, this.f42312c, this.f42313d, this.f42314e, this.f42315f, this.f42316g, this.f42317h, this.f42318i, this.f42319j, this.f42320k, this.f42321l, this.f42322m, this.f42323n, this.f42324o, this.f42325p, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16176a newBuilder() {
            C16176a aVar = new C16176a();
            aVar.f42310a = this.user_id;
            aVar.f42311b = this.icon_url;
            aVar.f42312c = this.description;
            aVar.f42313d = this.tenant_code;
            aVar.f42314e = this.user_env;
            aVar.f42315f = this.tenant_tag;
            aVar.f42316g = this.icon_key;
            aVar.f42317h = this.account_security_config;
            aVar.f42318i = Internal.copyOf("tenant_single_products", this.tenant_single_products);
            aVar.f42319j = this.is_idp;
            aVar.f42320k = this.is_frozen;
            aVar.f42321l = this.is_active;
            aVar.f42322m = this.user_unit;
            aVar.f42323n = this.user_brand;
            aVar.f42324o = this.suite_full_domain;
            aVar.f42325p = this.upgrade_enabled;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("contact", "AccountUser");
            StringBuilder sb = new StringBuilder();
            if (this.user_id != null) {
                sb.append(", user_id=");
                sb.append(this.user_id);
            }
            if (this.icon_url != null) {
                sb.append(", icon_url=");
                sb.append(this.icon_url);
            }
            if (this.description != null) {
                sb.append(", description=");
                sb.append(this.description);
            }
            if (this.tenant_code != null) {
                sb.append(", tenant_code=");
                sb.append(this.tenant_code);
            }
            if (this.user_env != null) {
                sb.append(", user_env=");
                sb.append(this.user_env);
            }
            if (this.tenant_tag != null) {
                sb.append(", tenant_tag=");
                sb.append(this.tenant_tag);
            }
            if (this.icon_key != null) {
                sb.append(", icon_key=");
                sb.append(this.icon_key);
            }
            if (this.account_security_config != null) {
                sb.append(", account_security_config=");
                sb.append(this.account_security_config);
            }
            if (!this.tenant_single_products.isEmpty()) {
                sb.append(", tenant_single_products=");
                sb.append(this.tenant_single_products);
            }
            if (this.is_idp != null) {
                sb.append(", is_idp=");
                sb.append(this.is_idp);
            }
            if (this.is_frozen != null) {
                sb.append(", is_frozen=");
                sb.append(this.is_frozen);
            }
            if (this.is_active != null) {
                sb.append(", is_active=");
                sb.append(this.is_active);
            }
            if (this.user_unit != null) {
                sb.append(", user_unit=");
                sb.append(this.user_unit);
            }
            if (this.user_brand != null) {
                sb.append(", user_brand=");
                sb.append(this.user_brand);
            }
            if (this.suite_full_domain != null) {
                sb.append(", suite_full_domain=");
                sb.append(this.suite_full_domain);
            }
            if (this.upgrade_enabled != null) {
                sb.append(", upgrade_enabled=");
                sb.append(this.upgrade_enabled);
            }
            StringBuilder replace = sb.replace(0, 2, "AccountUser{");
            replace.append('}');
            return replace.toString();
        }

        public AccountUser(String str, String str2, String str3, String str4, String str5, TenantTag tenantTag, String str6, AccountSecurityConfig accountSecurityConfig, List<TenantSingleProduct> list, Boolean bool, Boolean bool2, Boolean bool3, String str7, String str8, String str9, Boolean bool4) {
            this(str, str2, str3, str4, str5, tenantTag, str6, accountSecurityConfig, list, bool, bool2, bool3, str7, str8, str9, bool4, ByteString.EMPTY);
        }

        public AccountUser(String str, String str2, String str3, String str4, String str5, TenantTag tenantTag, String str6, AccountSecurityConfig accountSecurityConfig, List<TenantSingleProduct> list, Boolean bool, Boolean bool2, Boolean bool3, String str7, String str8, String str9, Boolean bool4, ByteString byteString) {
            super(ADAPTER, byteString);
            this.user_id = str;
            this.icon_url = str2;
            this.description = str3;
            this.tenant_code = str4;
            this.user_env = str5;
            this.tenant_tag = tenantTag;
            this.icon_key = str6;
            this.account_security_config = accountSecurityConfig;
            this.tenant_single_products = Internal.immutableCopyOf("tenant_single_products", list);
            this.is_idp = bool;
            this.is_frozen = bool2;
            this.is_active = bool3;
            this.user_unit = str7;
            this.user_brand = str8;
            this.suite_full_domain = str9;
            this.upgrade_enabled = bool4;
        }
    }

    public static final class PendingUser extends Message<PendingUser, C16178a> {
        public static final ProtoAdapter<PendingUser> ADAPTER = new C16179b();
        public static final Long DEFAULT_TENANT_ID = 0L;
        private static final long serialVersionUID = 0;
        public final String tenant_icon_url;
        public final Long tenant_id;
        public final String tenant_name;
        public final String user_brand;
        public final String user_env;
        public final String user_name;
        public final String user_unit;

        /* renamed from: com.bytedance.lark.pb.contact.v1.GetAccountUserListResponse$PendingUser$b */
        private static final class C16179b extends ProtoAdapter<PendingUser> {
            C16179b() {
                super(FieldEncoding.LENGTH_DELIMITED, PendingUser.class);
            }

            /* renamed from: a */
            public int encodedSize(PendingUser pendingUser) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7 = 0;
                if (pendingUser.user_name != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, pendingUser.user_name);
                } else {
                    i = 0;
                }
                if (pendingUser.user_env != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, pendingUser.user_env);
                } else {
                    i2 = 0;
                }
                int i8 = i + i2;
                if (pendingUser.tenant_id != null) {
                    i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, pendingUser.tenant_id);
                } else {
                    i3 = 0;
                }
                int i9 = i8 + i3;
                if (pendingUser.tenant_name != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, pendingUser.tenant_name);
                } else {
                    i4 = 0;
                }
                int i10 = i9 + i4;
                if (pendingUser.tenant_icon_url != null) {
                    i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, pendingUser.tenant_icon_url);
                } else {
                    i5 = 0;
                }
                int i11 = i10 + i5;
                if (pendingUser.user_unit != null) {
                    i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, pendingUser.user_unit);
                } else {
                    i6 = 0;
                }
                int i12 = i11 + i6;
                if (pendingUser.user_brand != null) {
                    i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, pendingUser.user_brand);
                }
                return i12 + i7 + pendingUser.unknownFields().size();
            }

            /* renamed from: a */
            public PendingUser decode(ProtoReader protoReader) throws IOException {
                C16178a aVar = new C16178a();
                aVar.f42326a = "";
                aVar.f42327b = "";
                aVar.f42328c = 0L;
                aVar.f42329d = "";
                aVar.f42330e = "";
                aVar.f42331f = "";
                aVar.f42332g = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f42326a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                aVar.f42327b = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                aVar.f42328c = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 4:
                                aVar.f42329d = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                aVar.f42330e = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                aVar.f42331f = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 7:
                                aVar.f42332g = ProtoAdapter.STRING.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, PendingUser pendingUser) throws IOException {
                if (pendingUser.user_name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pendingUser.user_name);
                }
                if (pendingUser.user_env != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pendingUser.user_env);
                }
                if (pendingUser.tenant_id != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, pendingUser.tenant_id);
                }
                if (pendingUser.tenant_name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, pendingUser.tenant_name);
                }
                if (pendingUser.tenant_icon_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, pendingUser.tenant_icon_url);
                }
                if (pendingUser.user_unit != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, pendingUser.user_unit);
                }
                if (pendingUser.user_brand != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, pendingUser.user_brand);
                }
                protoWriter.writeBytes(pendingUser.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v1.GetAccountUserListResponse$PendingUser$a */
        public static final class C16178a extends Message.Builder<PendingUser, C16178a> {

            /* renamed from: a */
            public String f42326a;

            /* renamed from: b */
            public String f42327b;

            /* renamed from: c */
            public Long f42328c;

            /* renamed from: d */
            public String f42329d;

            /* renamed from: e */
            public String f42330e;

            /* renamed from: f */
            public String f42331f;

            /* renamed from: g */
            public String f42332g;

            /* renamed from: a */
            public PendingUser build() {
                return new PendingUser(this.f42326a, this.f42327b, this.f42328c, this.f42329d, this.f42330e, this.f42331f, this.f42332g, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16178a newBuilder() {
            C16178a aVar = new C16178a();
            aVar.f42326a = this.user_name;
            aVar.f42327b = this.user_env;
            aVar.f42328c = this.tenant_id;
            aVar.f42329d = this.tenant_name;
            aVar.f42330e = this.tenant_icon_url;
            aVar.f42331f = this.user_unit;
            aVar.f42332g = this.user_brand;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("contact", "PendingUser");
            StringBuilder sb = new StringBuilder();
            if (this.user_name != null) {
                sb.append(", user_name=");
                sb.append(this.user_name);
            }
            if (this.user_env != null) {
                sb.append(", user_env=");
                sb.append(this.user_env);
            }
            if (this.tenant_id != null) {
                sb.append(", tenant_id=");
                sb.append(this.tenant_id);
            }
            if (this.tenant_name != null) {
                sb.append(", tenant_name=");
                sb.append(this.tenant_name);
            }
            if (this.tenant_icon_url != null) {
                sb.append(", tenant_icon_url=");
                sb.append(this.tenant_icon_url);
            }
            if (this.user_unit != null) {
                sb.append(", user_unit=");
                sb.append(this.user_unit);
            }
            if (this.user_brand != null) {
                sb.append(", user_brand=");
                sb.append(this.user_brand);
            }
            StringBuilder replace = sb.replace(0, 2, "PendingUser{");
            replace.append('}');
            return replace.toString();
        }

        public PendingUser(String str, String str2, Long l, String str3, String str4, String str5, String str6) {
            this(str, str2, l, str3, str4, str5, str6, ByteString.EMPTY);
        }

        public PendingUser(String str, String str2, Long l, String str3, String str4, String str5, String str6, ByteString byteString) {
            super(ADAPTER, byteString);
            this.user_name = str;
            this.user_env = str2;
            this.tenant_id = l;
            this.tenant_name = str3;
            this.tenant_icon_url = str4;
            this.user_unit = str5;
            this.user_brand = str6;
        }
    }

    public static final class ServiceData extends Message<ServiceData, C16180a> {
        public static final ProtoAdapter<ServiceData> ADAPTER = new C16181b();
        private static final long serialVersionUID = 0;
        public final String captcha_service_url;
        public final String device_service_url;
        public final String passport_service_url;
        public final String root_domain;

        /* renamed from: com.bytedance.lark.pb.contact.v1.GetAccountUserListResponse$ServiceData$b */
        private static final class C16181b extends ProtoAdapter<ServiceData> {
            C16181b() {
                super(FieldEncoding.LENGTH_DELIMITED, ServiceData.class);
            }

            /* renamed from: a */
            public int encodedSize(ServiceData serviceData) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (serviceData.passport_service_url != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, serviceData.passport_service_url);
                } else {
                    i = 0;
                }
                if (serviceData.device_service_url != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, serviceData.device_service_url);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (serviceData.captcha_service_url != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, serviceData.captcha_service_url);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (serviceData.root_domain != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, serviceData.root_domain);
                }
                return i6 + i4 + serviceData.unknownFields().size();
            }

            /* renamed from: a */
            public ServiceData decode(ProtoReader protoReader) throws IOException {
                C16180a aVar = new C16180a();
                aVar.f42333a = "";
                aVar.f42334b = "";
                aVar.f42335c = "";
                aVar.f42336d = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f42333a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f42334b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f42335c = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f42336d = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ServiceData serviceData) throws IOException {
                if (serviceData.passport_service_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, serviceData.passport_service_url);
                }
                if (serviceData.device_service_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, serviceData.device_service_url);
                }
                if (serviceData.captcha_service_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, serviceData.captcha_service_url);
                }
                if (serviceData.root_domain != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, serviceData.root_domain);
                }
                protoWriter.writeBytes(serviceData.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v1.GetAccountUserListResponse$ServiceData$a */
        public static final class C16180a extends Message.Builder<ServiceData, C16180a> {

            /* renamed from: a */
            public String f42333a;

            /* renamed from: b */
            public String f42334b;

            /* renamed from: c */
            public String f42335c;

            /* renamed from: d */
            public String f42336d;

            /* renamed from: a */
            public ServiceData build() {
                return new ServiceData(this.f42333a, this.f42334b, this.f42335c, this.f42336d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16180a newBuilder() {
            C16180a aVar = new C16180a();
            aVar.f42333a = this.passport_service_url;
            aVar.f42334b = this.device_service_url;
            aVar.f42335c = this.captcha_service_url;
            aVar.f42336d = this.root_domain;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("contact", "ServiceData");
            StringBuilder sb = new StringBuilder();
            if (this.passport_service_url != null) {
                sb.append(", passport_service_url=");
                sb.append(this.passport_service_url);
            }
            if (this.device_service_url != null) {
                sb.append(", device_service_url=");
                sb.append(this.device_service_url);
            }
            if (this.captcha_service_url != null) {
                sb.append(", captcha_service_url=");
                sb.append(this.captcha_service_url);
            }
            if (this.root_domain != null) {
                sb.append(", root_domain=");
                sb.append(this.root_domain);
            }
            StringBuilder replace = sb.replace(0, 2, "ServiceData{");
            replace.append('}');
            return replace.toString();
        }

        public ServiceData(String str, String str2, String str3, String str4) {
            this(str, str2, str3, str4, ByteString.EMPTY);
        }

        public ServiceData(String str, String str2, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            this.passport_service_url = str;
            this.device_service_url = str2;
            this.captcha_service_url = str3;
            this.root_domain = str4;
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetAccountUserListResponse$b */
    private static final class C16183b extends ProtoAdapter<GetAccountUserListResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, ServiceData>> f42341a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ServiceData.ADAPTER);

        C16183b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAccountUserListResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAccountUserListResponse getAccountUserListResponse) {
            return C14928Entity.ADAPTER.encodedSizeWithTag(1, getAccountUserListResponse.entity) + AccountUser.ADAPTER.asRepeated().encodedSizeWithTag(2, getAccountUserListResponse.account_users) + this.f42341a.encodedSizeWithTag(3, getAccountUserListResponse.env_service_data) + PendingUser.ADAPTER.asRepeated().encodedSizeWithTag(4, getAccountUserListResponse.pending_users) + getAccountUserListResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetAccountUserListResponse decode(ProtoReader protoReader) throws IOException {
            C16182a aVar = new C16182a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42337a = C14928Entity.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42338b.add(AccountUser.ADAPTER.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f42339c.putAll(this.f42341a.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42340d.add(PendingUser.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAccountUserListResponse getAccountUserListResponse) throws IOException {
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 1, getAccountUserListResponse.entity);
            AccountUser.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getAccountUserListResponse.account_users);
            this.f42341a.encodeWithTag(protoWriter, 3, getAccountUserListResponse.env_service_data);
            PendingUser.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, getAccountUserListResponse.pending_users);
            protoWriter.writeBytes(getAccountUserListResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetAccountUserListResponse$a */
    public static final class C16182a extends Message.Builder<GetAccountUserListResponse, C16182a> {

        /* renamed from: a */
        public C14928Entity f42337a;

        /* renamed from: b */
        public List<AccountUser> f42338b = Internal.newMutableList();

        /* renamed from: c */
        public Map<String, ServiceData> f42339c = Internal.newMutableMap();

        /* renamed from: d */
        public List<PendingUser> f42340d = Internal.newMutableList();

        /* renamed from: a */
        public GetAccountUserListResponse build() {
            C14928Entity entity = this.f42337a;
            if (entity != null) {
                return new GetAccountUserListResponse(entity, this.f42338b, this.f42339c, this.f42340d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(entity, "entity");
        }
    }

    @Override // com.squareup.wire.Message
    public C16182a newBuilder() {
        C16182a aVar = new C16182a();
        aVar.f42337a = this.entity;
        aVar.f42338b = Internal.copyOf("account_users", this.account_users);
        aVar.f42339c = Internal.copyOf("env_service_data", this.env_service_data);
        aVar.f42340d = Internal.copyOf("pending_users", this.pending_users);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetAccountUserListResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", entity=");
        sb.append(this.entity);
        if (!this.account_users.isEmpty()) {
            sb.append(", account_users=");
            sb.append(this.account_users);
        }
        if (!this.env_service_data.isEmpty()) {
            sb.append(", env_service_data=");
            sb.append(this.env_service_data);
        }
        if (!this.pending_users.isEmpty()) {
            sb.append(", pending_users=");
            sb.append(this.pending_users);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAccountUserListResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetAccountUserListResponse(C14928Entity entity2, List<AccountUser> list, Map<String, ServiceData> map, List<PendingUser> list2) {
        this(entity2, list, map, list2, ByteString.EMPTY);
    }

    public GetAccountUserListResponse(C14928Entity entity2, List<AccountUser> list, Map<String, ServiceData> map, List<PendingUser> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity = entity2;
        this.account_users = Internal.immutableCopyOf("account_users", list);
        this.env_service_data = Internal.immutableCopyOf("env_service_data", map);
        this.pending_users = Internal.immutableCopyOf("pending_users", list2);
    }
}
