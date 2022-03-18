package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class MailAccount extends Message<MailAccount, C16622a> {
    public static final ProtoAdapter<MailAccount> ADAPTER = new C16623b();
    public static final Boolean DEFAULT_IS_SELECTED = false;
    public static final Boolean DEFAULT_IS_SHARED = false;
    private static final long serialVersionUID = 0;
    public final String account_address;
    public final String account_name;
    public final String account_token;
    public final MailSharedAccountConfig config;
    public final Boolean is_selected;
    public final Boolean is_shared;
    public final String lark_user_id;
    public final String mail_account_id;
    public final Setting mail_setting;
    public final List<MailAccount> shared_accounts;

    public static final class MailSharedAccountConfig extends Message<MailSharedAccountConfig, C16620a> {
        public static final ProtoAdapter<MailSharedAccountConfig> ADAPTER = new C16621b();
        public static final Boolean DEFAULT_NEW_MAIL_NOTIFICATION = false;
        private static final long serialVersionUID = 0;
        public final Boolean new_mail_notification;

        /* renamed from: com.bytedance.lark.pb.email.client.v1.MailAccount$MailSharedAccountConfig$b */
        private static final class C16621b extends ProtoAdapter<MailSharedAccountConfig> {
            C16621b() {
                super(FieldEncoding.LENGTH_DELIMITED, MailSharedAccountConfig.class);
            }

            /* renamed from: a */
            public int encodedSize(MailSharedAccountConfig mailSharedAccountConfig) {
                int i;
                if (mailSharedAccountConfig.new_mail_notification != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, mailSharedAccountConfig.new_mail_notification);
                } else {
                    i = 0;
                }
                return i + mailSharedAccountConfig.unknownFields().size();
            }

            /* renamed from: a */
            public MailSharedAccountConfig decode(ProtoReader protoReader) throws IOException {
                C16620a aVar = new C16620a();
                aVar.f43048a = false;
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
                        aVar.f43048a = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MailSharedAccountConfig mailSharedAccountConfig) throws IOException {
                if (mailSharedAccountConfig.new_mail_notification != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, mailSharedAccountConfig.new_mail_notification);
                }
                protoWriter.writeBytes(mailSharedAccountConfig.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.email.client.v1.MailAccount$MailSharedAccountConfig$a */
        public static final class C16620a extends Message.Builder<MailSharedAccountConfig, C16620a> {

            /* renamed from: a */
            public Boolean f43048a;

            /* renamed from: a */
            public MailSharedAccountConfig build() {
                return new MailSharedAccountConfig(this.f43048a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16620a newBuilder() {
            C16620a aVar = new C16620a();
            aVar.f43048a = this.new_mail_notification;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("email", "MailSharedAccountConfig");
            StringBuilder sb = new StringBuilder();
            if (this.new_mail_notification != null) {
                sb.append(", new_mail_notification=");
                sb.append(this.new_mail_notification);
            }
            StringBuilder replace = sb.replace(0, 2, "MailSharedAccountConfig{");
            replace.append('}');
            return replace.toString();
        }

        public MailSharedAccountConfig(Boolean bool) {
            this(bool, ByteString.EMPTY);
        }

        public MailSharedAccountConfig(Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.new_mail_notification = bool;
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailAccount$b */
    private static final class C16623b extends ProtoAdapter<MailAccount> {
        C16623b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailAccount.class);
        }

        /* renamed from: a */
        public int encodedSize(MailAccount mailAccount) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9 = 0;
            if (mailAccount.lark_user_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailAccount.lark_user_id);
            } else {
                i = 0;
            }
            if (mailAccount.mail_account_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mailAccount.mail_account_id);
            } else {
                i2 = 0;
            }
            int i10 = i + i2;
            if (mailAccount.account_token != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, mailAccount.account_token);
            } else {
                i3 = 0;
            }
            int i11 = i10 + i3;
            if (mailAccount.account_name != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, mailAccount.account_name);
            } else {
                i4 = 0;
            }
            int i12 = i11 + i4;
            if (mailAccount.account_address != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, mailAccount.account_address);
            } else {
                i5 = 0;
            }
            int i13 = i12 + i5;
            if (mailAccount.is_shared != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, mailAccount.is_shared);
            } else {
                i6 = 0;
            }
            int i14 = i13 + i6;
            if (mailAccount.config != null) {
                i7 = MailSharedAccountConfig.ADAPTER.encodedSizeWithTag(7, mailAccount.config);
            } else {
                i7 = 0;
            }
            int i15 = i14 + i7;
            if (mailAccount.is_selected != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(8, mailAccount.is_selected);
            } else {
                i8 = 0;
            }
            int i16 = i15 + i8;
            if (mailAccount.mail_setting != null) {
                i9 = Setting.ADAPTER.encodedSizeWithTag(9, mailAccount.mail_setting);
            }
            return i16 + i9 + MailAccount.ADAPTER.asRepeated().encodedSizeWithTag(10, mailAccount.shared_accounts) + mailAccount.unknownFields().size();
        }

        /* renamed from: a */
        public MailAccount decode(ProtoReader protoReader) throws IOException {
            C16622a aVar = new C16622a();
            aVar.f43049a = "";
            aVar.f43050b = "";
            aVar.f43051c = "";
            aVar.f43052d = "";
            aVar.f43053e = "";
            aVar.f43054f = false;
            aVar.f43056h = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f43049a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f43050b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f43051c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f43052d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f43053e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f43054f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f43055g = MailSharedAccountConfig.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            aVar.f43056h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            aVar.f43057i = Setting.ADAPTER.decode(protoReader);
                            break;
                        case 10:
                            aVar.f43058j.add(MailAccount.ADAPTER.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, MailAccount mailAccount) throws IOException {
            if (mailAccount.lark_user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailAccount.lark_user_id);
            }
            if (mailAccount.mail_account_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailAccount.mail_account_id);
            }
            if (mailAccount.account_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, mailAccount.account_token);
            }
            if (mailAccount.account_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, mailAccount.account_name);
            }
            if (mailAccount.account_address != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, mailAccount.account_address);
            }
            if (mailAccount.is_shared != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, mailAccount.is_shared);
            }
            if (mailAccount.config != null) {
                MailSharedAccountConfig.ADAPTER.encodeWithTag(protoWriter, 7, mailAccount.config);
            }
            if (mailAccount.is_selected != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, mailAccount.is_selected);
            }
            if (mailAccount.mail_setting != null) {
                Setting.ADAPTER.encodeWithTag(protoWriter, 9, mailAccount.mail_setting);
            }
            MailAccount.ADAPTER.asRepeated().encodeWithTag(protoWriter, 10, mailAccount.shared_accounts);
            protoWriter.writeBytes(mailAccount.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailAccount$a */
    public static final class C16622a extends Message.Builder<MailAccount, C16622a> {

        /* renamed from: a */
        public String f43049a;

        /* renamed from: b */
        public String f43050b;

        /* renamed from: c */
        public String f43051c;

        /* renamed from: d */
        public String f43052d;

        /* renamed from: e */
        public String f43053e;

        /* renamed from: f */
        public Boolean f43054f;

        /* renamed from: g */
        public MailSharedAccountConfig f43055g;

        /* renamed from: h */
        public Boolean f43056h;

        /* renamed from: i */
        public Setting f43057i;

        /* renamed from: j */
        public List<MailAccount> f43058j = Internal.newMutableList();

        /* renamed from: a */
        public MailAccount build() {
            return new MailAccount(this.f43049a, this.f43050b, this.f43051c, this.f43052d, this.f43053e, this.f43054f, this.f43055g, this.f43056h, this.f43057i, this.f43058j, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16622a mo59120a(Setting setting) {
            this.f43057i = setting;
            return this;
        }

        /* renamed from: b */
        public C16622a mo59124b(String str) {
            this.f43050b = str;
            return this;
        }

        /* renamed from: c */
        public C16622a mo59125c(String str) {
            this.f43052d = str;
            return this;
        }

        /* renamed from: d */
        public C16622a mo59126d(String str) {
            this.f43053e = str;
            return this;
        }

        /* renamed from: a */
        public C16622a mo59121a(Boolean bool) {
            this.f43054f = bool;
            return this;
        }

        /* renamed from: a */
        public C16622a mo59122a(String str) {
            this.f43049a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16622a newBuilder() {
        C16622a aVar = new C16622a();
        aVar.f43049a = this.lark_user_id;
        aVar.f43050b = this.mail_account_id;
        aVar.f43051c = this.account_token;
        aVar.f43052d = this.account_name;
        aVar.f43053e = this.account_address;
        aVar.f43054f = this.is_shared;
        aVar.f43055g = this.config;
        aVar.f43056h = this.is_selected;
        aVar.f43057i = this.mail_setting;
        aVar.f43058j = Internal.copyOf("shared_accounts", this.shared_accounts);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailAccount");
        StringBuilder sb = new StringBuilder();
        if (this.lark_user_id != null) {
            sb.append(", lark_user_id=");
            sb.append(this.lark_user_id);
        }
        if (this.mail_account_id != null) {
            sb.append(", mail_account_id=");
            sb.append(this.mail_account_id);
        }
        if (this.account_token != null) {
            sb.append(", account_token=");
            sb.append(this.account_token);
        }
        if (this.account_name != null) {
            sb.append(", account_name=");
            sb.append(this.account_name);
        }
        if (this.account_address != null) {
            sb.append(", account_address=");
            sb.append(this.account_address);
        }
        if (this.is_shared != null) {
            sb.append(", is_shared=");
            sb.append(this.is_shared);
        }
        if (this.config != null) {
            sb.append(", config=");
            sb.append(this.config);
        }
        if (this.is_selected != null) {
            sb.append(", is_selected=");
            sb.append(this.is_selected);
        }
        if (this.mail_setting != null) {
            sb.append(", mail_setting=");
            sb.append(this.mail_setting);
        }
        if (!this.shared_accounts.isEmpty()) {
            sb.append(", shared_accounts=");
            sb.append(this.shared_accounts);
        }
        StringBuilder replace = sb.replace(0, 2, "MailAccount{");
        replace.append('}');
        return replace.toString();
    }

    public MailAccount(String str, String str2, String str3, String str4, String str5, Boolean bool, MailSharedAccountConfig mailSharedAccountConfig, Boolean bool2, Setting setting, List<MailAccount> list) {
        this(str, str2, str3, str4, str5, bool, mailSharedAccountConfig, bool2, setting, list, ByteString.EMPTY);
    }

    public MailAccount(String str, String str2, String str3, String str4, String str5, Boolean bool, MailSharedAccountConfig mailSharedAccountConfig, Boolean bool2, Setting setting, List<MailAccount> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.lark_user_id = str;
        this.mail_account_id = str2;
        this.account_token = str3;
        this.account_name = str4;
        this.account_address = str5;
        this.is_shared = bool;
        this.config = mailSharedAccountConfig;
        this.is_selected = bool2;
        this.mail_setting = setting;
        this.shared_accounts = Internal.immutableCopyOf("shared_accounts", list);
    }
}
