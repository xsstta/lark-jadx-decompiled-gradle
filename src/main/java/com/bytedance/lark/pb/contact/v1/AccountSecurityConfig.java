package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class AccountSecurityConfig extends Message<AccountSecurityConfig, C16128a> {
    public static final ProtoAdapter<AccountSecurityConfig> ADAPTER = new C16129b();
    private static final long serialVersionUID = 0;
    public final ModuleSwitchConfig module_2fa;
    public final ModuleSwitchConfig module_account_management;
    public final ModuleSwitchConfig module_device_management;
    public final ModuleSwitchConfig module_modify_pwd;
    public final ModuleSwitchConfig module_security_verification;

    /* renamed from: com.bytedance.lark.pb.contact.v1.AccountSecurityConfig$b */
    private static final class C16129b extends ProtoAdapter<AccountSecurityConfig> {
        C16129b() {
            super(FieldEncoding.LENGTH_DELIMITED, AccountSecurityConfig.class);
        }

        /* renamed from: a */
        public int encodedSize(AccountSecurityConfig accountSecurityConfig) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (accountSecurityConfig.module_modify_pwd != null) {
                i = ModuleSwitchConfig.ADAPTER.encodedSizeWithTag(1, accountSecurityConfig.module_modify_pwd);
            } else {
                i = 0;
            }
            if (accountSecurityConfig.module_account_management != null) {
                i2 = ModuleSwitchConfig.ADAPTER.encodedSizeWithTag(2, accountSecurityConfig.module_account_management);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (accountSecurityConfig.module_security_verification != null) {
                i3 = ModuleSwitchConfig.ADAPTER.encodedSizeWithTag(3, accountSecurityConfig.module_security_verification);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (accountSecurityConfig.module_device_management != null) {
                i4 = ModuleSwitchConfig.ADAPTER.encodedSizeWithTag(4, accountSecurityConfig.module_device_management);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (accountSecurityConfig.module_2fa != null) {
                i5 = ModuleSwitchConfig.ADAPTER.encodedSizeWithTag(5, accountSecurityConfig.module_2fa);
            }
            return i8 + i5 + accountSecurityConfig.unknownFields().size();
        }

        /* renamed from: a */
        public AccountSecurityConfig decode(ProtoReader protoReader) throws IOException {
            C16128a aVar = new C16128a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42237a = ModuleSwitchConfig.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42238b = ModuleSwitchConfig.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f42239c = ModuleSwitchConfig.ADAPTER.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f42240d = ModuleSwitchConfig.ADAPTER.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42241e = ModuleSwitchConfig.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AccountSecurityConfig accountSecurityConfig) throws IOException {
            if (accountSecurityConfig.module_modify_pwd != null) {
                ModuleSwitchConfig.ADAPTER.encodeWithTag(protoWriter, 1, accountSecurityConfig.module_modify_pwd);
            }
            if (accountSecurityConfig.module_account_management != null) {
                ModuleSwitchConfig.ADAPTER.encodeWithTag(protoWriter, 2, accountSecurityConfig.module_account_management);
            }
            if (accountSecurityConfig.module_security_verification != null) {
                ModuleSwitchConfig.ADAPTER.encodeWithTag(protoWriter, 3, accountSecurityConfig.module_security_verification);
            }
            if (accountSecurityConfig.module_device_management != null) {
                ModuleSwitchConfig.ADAPTER.encodeWithTag(protoWriter, 4, accountSecurityConfig.module_device_management);
            }
            if (accountSecurityConfig.module_2fa != null) {
                ModuleSwitchConfig.ADAPTER.encodeWithTag(protoWriter, 5, accountSecurityConfig.module_2fa);
            }
            protoWriter.writeBytes(accountSecurityConfig.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.AccountSecurityConfig$a */
    public static final class C16128a extends Message.Builder<AccountSecurityConfig, C16128a> {

        /* renamed from: a */
        public ModuleSwitchConfig f42237a;

        /* renamed from: b */
        public ModuleSwitchConfig f42238b;

        /* renamed from: c */
        public ModuleSwitchConfig f42239c;

        /* renamed from: d */
        public ModuleSwitchConfig f42240d;

        /* renamed from: e */
        public ModuleSwitchConfig f42241e;

        /* renamed from: a */
        public AccountSecurityConfig build() {
            return new AccountSecurityConfig(this.f42237a, this.f42238b, this.f42239c, this.f42240d, this.f42241e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16128a newBuilder() {
        C16128a aVar = new C16128a();
        aVar.f42237a = this.module_modify_pwd;
        aVar.f42238b = this.module_account_management;
        aVar.f42239c = this.module_security_verification;
        aVar.f42240d = this.module_device_management;
        aVar.f42241e = this.module_2fa;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "AccountSecurityConfig");
        StringBuilder sb = new StringBuilder();
        if (this.module_modify_pwd != null) {
            sb.append(", module_modify_pwd=");
            sb.append(this.module_modify_pwd);
        }
        if (this.module_account_management != null) {
            sb.append(", module_account_management=");
            sb.append(this.module_account_management);
        }
        if (this.module_security_verification != null) {
            sb.append(", module_security_verification=");
            sb.append(this.module_security_verification);
        }
        if (this.module_device_management != null) {
            sb.append(", module_device_management=");
            sb.append(this.module_device_management);
        }
        if (this.module_2fa != null) {
            sb.append(", module_2fa=");
            sb.append(this.module_2fa);
        }
        StringBuilder replace = sb.replace(0, 2, "AccountSecurityConfig{");
        replace.append('}');
        return replace.toString();
    }

    public AccountSecurityConfig(ModuleSwitchConfig moduleSwitchConfig, ModuleSwitchConfig moduleSwitchConfig2, ModuleSwitchConfig moduleSwitchConfig3, ModuleSwitchConfig moduleSwitchConfig4, ModuleSwitchConfig moduleSwitchConfig5) {
        this(moduleSwitchConfig, moduleSwitchConfig2, moduleSwitchConfig3, moduleSwitchConfig4, moduleSwitchConfig5, ByteString.EMPTY);
    }

    public AccountSecurityConfig(ModuleSwitchConfig moduleSwitchConfig, ModuleSwitchConfig moduleSwitchConfig2, ModuleSwitchConfig moduleSwitchConfig3, ModuleSwitchConfig moduleSwitchConfig4, ModuleSwitchConfig moduleSwitchConfig5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.module_modify_pwd = moduleSwitchConfig;
        this.module_account_management = moduleSwitchConfig2;
        this.module_security_verification = moduleSwitchConfig3;
        this.module_device_management = moduleSwitchConfig4;
        this.module_2fa = moduleSwitchConfig5;
    }
}
