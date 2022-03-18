package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class Address extends Message<Address, C16600a> {
    public static final ProtoAdapter<Address> ADAPTER = new C16601b();
    public static final Long DEFAULT_LARK_ENTITY_ID = 0L;
    public static final LarkEntityType DEFAULT_LARK_ENTITY_TYPE = LarkEntityType.UNKNOWN;
    public static final MailGroupType DEFAULT_MAIL_GROUP_TYPE = MailGroupType.CHAT_MAIL_GROUP;
    private static final long serialVersionUID = 0;
    public final String address;
    public final String display_name;
    public final Long lark_entity_id;
    public final String lark_entity_id_string;
    public final LarkEntityType lark_entity_type;
    public final MailGroupType mail_group_type;
    public final String name;
    public final SharedMailboxOperator operator;
    public final String tenant_id;

    public enum LarkEntityType implements WireEnum {
        UNKNOWN(0),
        USER(1),
        GROUP(2),
        SHARED_MAILBOX(3),
        ENTERPRISE_MAIL_GROUP(250);
        
        public static final ProtoAdapter<LarkEntityType> ADAPTER = ProtoAdapter.newEnumAdapter(LarkEntityType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static LarkEntityType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return USER;
            }
            if (i == 2) {
                return GROUP;
            }
            if (i == 3) {
                return SHARED_MAILBOX;
            }
            if (i != 250) {
                return null;
            }
            return ENTERPRISE_MAIL_GROUP;
        }

        private LarkEntityType(int i) {
            this.value = i;
        }
    }

    public static final class SharedMailboxOperator extends Message<SharedMailboxOperator, C16598a> {
        public static final ProtoAdapter<SharedMailboxOperator> ADAPTER = new C16599b();
        private static final long serialVersionUID = 0;
        public final String address;
        public final String name;
        public final String user_id;

        /* renamed from: com.bytedance.lark.pb.email.client.v1.Address$SharedMailboxOperator$b */
        private static final class C16599b extends ProtoAdapter<SharedMailboxOperator> {
            C16599b() {
                super(FieldEncoding.LENGTH_DELIMITED, SharedMailboxOperator.class);
            }

            /* renamed from: a */
            public int encodedSize(SharedMailboxOperator sharedMailboxOperator) {
                int i;
                int i2;
                int i3 = 0;
                if (sharedMailboxOperator.user_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, sharedMailboxOperator.user_id);
                } else {
                    i = 0;
                }
                if (sharedMailboxOperator.address != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, sharedMailboxOperator.address);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (sharedMailboxOperator.name != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, sharedMailboxOperator.name);
                }
                return i4 + i3 + sharedMailboxOperator.unknownFields().size();
            }

            /* renamed from: a */
            public SharedMailboxOperator decode(ProtoReader protoReader) throws IOException {
                C16598a aVar = new C16598a();
                aVar.f42964a = "";
                aVar.f42965b = "";
                aVar.f42966c = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f42964a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f42965b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f42966c = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SharedMailboxOperator sharedMailboxOperator) throws IOException {
                if (sharedMailboxOperator.user_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sharedMailboxOperator.user_id);
                }
                if (sharedMailboxOperator.address != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, sharedMailboxOperator.address);
                }
                if (sharedMailboxOperator.name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, sharedMailboxOperator.name);
                }
                protoWriter.writeBytes(sharedMailboxOperator.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.email.client.v1.Address$SharedMailboxOperator$a */
        public static final class C16598a extends Message.Builder<SharedMailboxOperator, C16598a> {

            /* renamed from: a */
            public String f42964a;

            /* renamed from: b */
            public String f42965b;

            /* renamed from: c */
            public String f42966c;

            /* renamed from: a */
            public SharedMailboxOperator build() {
                return new SharedMailboxOperator(this.f42964a, this.f42965b, this.f42966c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16598a newBuilder() {
            C16598a aVar = new C16598a();
            aVar.f42964a = this.user_id;
            aVar.f42965b = this.address;
            aVar.f42966c = this.name;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("email", "SharedMailboxOperator");
            StringBuilder sb = new StringBuilder();
            if (this.user_id != null) {
                sb.append(", user_id=");
                sb.append(this.user_id);
            }
            if (this.address != null) {
                sb.append(", address=");
                sb.append(this.address);
            }
            if (this.name != null) {
                sb.append(", name=");
                sb.append(this.name);
            }
            StringBuilder replace = sb.replace(0, 2, "SharedMailboxOperator{");
            replace.append('}');
            return replace.toString();
        }

        public SharedMailboxOperator(String str, String str2, String str3) {
            this(str, str2, str3, ByteString.EMPTY);
        }

        public SharedMailboxOperator(String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.user_id = str;
            this.address = str2;
            this.name = str3;
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.Address$b */
    private static final class C16601b extends ProtoAdapter<Address> {
        C16601b() {
            super(FieldEncoding.LENGTH_DELIMITED, Address.class);
        }

        /* renamed from: a */
        public int encodedSize(Address address) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9 = 0;
            if (address.name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, address.name);
            } else {
                i = 0;
            }
            if (address.address != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, address.address);
            } else {
                i2 = 0;
            }
            int i10 = i + i2;
            if (address.lark_entity_type != null) {
                i3 = LarkEntityType.ADAPTER.encodedSizeWithTag(3, address.lark_entity_type);
            } else {
                i3 = 0;
            }
            int i11 = i10 + i3;
            if (address.lark_entity_id != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, address.lark_entity_id);
            } else {
                i4 = 0;
            }
            int i12 = i11 + i4;
            if (address.lark_entity_id_string != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, address.lark_entity_id_string);
            } else {
                i5 = 0;
            }
            int i13 = i12 + i5;
            if (address.operator != null) {
                i6 = SharedMailboxOperator.ADAPTER.encodedSizeWithTag(6, address.operator);
            } else {
                i6 = 0;
            }
            int i14 = i13 + i6;
            if (address.mail_group_type != null) {
                i7 = MailGroupType.ADAPTER.encodedSizeWithTag(7, address.mail_group_type);
            } else {
                i7 = 0;
            }
            int i15 = i14 + i7;
            if (address.tenant_id != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(8, address.tenant_id);
            } else {
                i8 = 0;
            }
            int i16 = i15 + i8;
            if (address.display_name != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(9, address.display_name);
            }
            return i16 + i9 + address.unknownFields().size();
        }

        /* renamed from: a */
        public Address decode(ProtoReader protoReader) throws IOException {
            C16600a aVar = new C16600a();
            aVar.f42967a = "";
            aVar.f42968b = "";
            aVar.f42969c = LarkEntityType.UNKNOWN;
            aVar.f42970d = 0L;
            aVar.f42971e = "";
            aVar.f42973g = MailGroupType.CHAT_MAIL_GROUP;
            aVar.f42974h = "";
            aVar.f42975i = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f42967a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f42968b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f42969c = LarkEntityType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f42970d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            aVar.f42971e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f42972f = SharedMailboxOperator.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            try {
                                aVar.f42973g = MailGroupType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 8:
                            aVar.f42974h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f42975i = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, Address address) throws IOException {
            if (address.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, address.name);
            }
            if (address.address != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, address.address);
            }
            if (address.lark_entity_type != null) {
                LarkEntityType.ADAPTER.encodeWithTag(protoWriter, 3, address.lark_entity_type);
            }
            if (address.lark_entity_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, address.lark_entity_id);
            }
            if (address.lark_entity_id_string != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, address.lark_entity_id_string);
            }
            if (address.operator != null) {
                SharedMailboxOperator.ADAPTER.encodeWithTag(protoWriter, 6, address.operator);
            }
            if (address.mail_group_type != null) {
                MailGroupType.ADAPTER.encodeWithTag(protoWriter, 7, address.mail_group_type);
            }
            if (address.tenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, address.tenant_id);
            }
            if (address.display_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, address.display_name);
            }
            protoWriter.writeBytes(address.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.Address$a */
    public static final class C16600a extends Message.Builder<Address, C16600a> {

        /* renamed from: a */
        public String f42967a;

        /* renamed from: b */
        public String f42968b;

        /* renamed from: c */
        public LarkEntityType f42969c;

        /* renamed from: d */
        public Long f42970d;

        /* renamed from: e */
        public String f42971e;

        /* renamed from: f */
        public SharedMailboxOperator f42972f;

        /* renamed from: g */
        public MailGroupType f42973g;

        /* renamed from: h */
        public String f42974h;

        /* renamed from: i */
        public String f42975i;

        /* renamed from: a */
        public Address build() {
            return new Address(this.f42967a, this.f42968b, this.f42969c, this.f42970d, this.f42971e, this.f42972f, this.f42973g, this.f42974h, this.f42975i, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16600a mo59046a(LarkEntityType larkEntityType) {
            this.f42969c = larkEntityType;
            return this;
        }

        /* renamed from: b */
        public C16600a mo59050b(String str) {
            this.f42968b = str;
            return this;
        }

        /* renamed from: c */
        public C16600a mo59051c(String str) {
            this.f42971e = str;
            return this;
        }

        /* renamed from: d */
        public C16600a mo59052d(String str) {
            this.f42974h = str;
            return this;
        }

        /* renamed from: e */
        public C16600a mo59053e(String str) {
            this.f42975i = str;
            return this;
        }

        /* renamed from: a */
        public C16600a mo59047a(SharedMailboxOperator sharedMailboxOperator) {
            this.f42972f = sharedMailboxOperator;
            return this;
        }

        /* renamed from: a */
        public C16600a mo59048a(String str) {
            this.f42967a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16600a newBuilder() {
        C16600a aVar = new C16600a();
        aVar.f42967a = this.name;
        aVar.f42968b = this.address;
        aVar.f42969c = this.lark_entity_type;
        aVar.f42970d = this.lark_entity_id;
        aVar.f42971e = this.lark_entity_id_string;
        aVar.f42972f = this.operator;
        aVar.f42973g = this.mail_group_type;
        aVar.f42974h = this.tenant_id;
        aVar.f42975i = this.display_name;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "Address");
        StringBuilder sb = new StringBuilder();
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.address != null) {
            sb.append(", address=");
            sb.append(this.address);
        }
        if (this.lark_entity_type != null) {
            sb.append(", lark_entity_type=");
            sb.append(this.lark_entity_type);
        }
        if (this.lark_entity_id != null) {
            sb.append(", lark_entity_id=");
            sb.append(this.lark_entity_id);
        }
        if (this.lark_entity_id_string != null) {
            sb.append(", lark_entity_id_string=");
            sb.append(this.lark_entity_id_string);
        }
        if (this.operator != null) {
            sb.append(", operator=");
            sb.append(this.operator);
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
        StringBuilder replace = sb.replace(0, 2, "Address{");
        replace.append('}');
        return replace.toString();
    }

    public Address(String str, String str2, LarkEntityType larkEntityType, Long l, String str3, SharedMailboxOperator sharedMailboxOperator, MailGroupType mailGroupType, String str4, String str5) {
        this(str, str2, larkEntityType, l, str3, sharedMailboxOperator, mailGroupType, str4, str5, ByteString.EMPTY);
    }

    public Address(String str, String str2, LarkEntityType larkEntityType, Long l, String str3, SharedMailboxOperator sharedMailboxOperator, MailGroupType mailGroupType, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
        this.address = str2;
        this.lark_entity_type = larkEntityType;
        this.lark_entity_id = l;
        this.lark_entity_id_string = str3;
        this.operator = sharedMailboxOperator;
        this.mail_group_type = mailGroupType;
        this.tenant_id = str4;
        this.display_name = str5;
    }
}
