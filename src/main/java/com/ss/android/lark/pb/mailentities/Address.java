package com.ss.android.lark.pb.mailentities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class Address extends Message<Address, C49819a> {
    public static final ProtoAdapter<Address> ADAPTER = new C49820b();
    public static final Long DEFAULT_LARK_ENTITY_ID = 0L;
    public static final Boolean DEFAULT_RENAMEBYLARK = false;
    public static final Long DEFAULT_TENANT_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Boolean mRenameByLark;
    public final String maddress;
    public final String mdisplay_name;
    public final Long mlark_entity_id;
    public final LarkEntityType mlark_entity_type;
    public final MailGroupType mmail_group_type;
    public final String mname;
    public final SharedMailboxOperator moperator;
    public final Long mtenant_id;

    public enum LarkEntityType implements WireEnum {
        UNKNOWN(0),
        USER(1),
        GROUP(2),
        SHARED_MAILBOX(3);
        
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
            if (i != 3) {
                return null;
            }
            return SHARED_MAILBOX;
        }

        private LarkEntityType(int i) {
            this.value = i;
        }
    }

    public static final class SharedMailboxOperator extends Message<SharedMailboxOperator, C49817a> {
        public static final ProtoAdapter<SharedMailboxOperator> ADAPTER = new C49818b();
        public static final Long DEFAULT_USER_ID = 0L;
        private static final long serialVersionUID = 0;
        public final String maddress;
        public final String mname;
        public final Long muser_id;

        /* renamed from: com.ss.android.lark.pb.mailentities.Address$SharedMailboxOperator$b */
        private static final class C49818b extends ProtoAdapter<SharedMailboxOperator> {
            C49818b() {
                super(FieldEncoding.LENGTH_DELIMITED, SharedMailboxOperator.class);
            }

            /* renamed from: a */
            public int encodedSize(SharedMailboxOperator sharedMailboxOperator) {
                int i;
                int i2;
                int i3 = 0;
                if (sharedMailboxOperator.muser_id != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, sharedMailboxOperator.muser_id);
                } else {
                    i = 0;
                }
                if (sharedMailboxOperator.maddress != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, sharedMailboxOperator.maddress);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (sharedMailboxOperator.mname != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, sharedMailboxOperator.mname);
                }
                return i4 + i3 + sharedMailboxOperator.unknownFields().size();
            }

            /* renamed from: a */
            public SharedMailboxOperator decode(ProtoReader protoReader) throws IOException {
                C49817a aVar = new C49817a();
                aVar.f124757a = 0L;
                aVar.f124758b = "";
                aVar.f124759c = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f124757a = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f124758b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f124759c = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SharedMailboxOperator sharedMailboxOperator) throws IOException {
                if (sharedMailboxOperator.muser_id != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, sharedMailboxOperator.muser_id);
                }
                if (sharedMailboxOperator.maddress != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, sharedMailboxOperator.maddress);
                }
                if (sharedMailboxOperator.mname != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, sharedMailboxOperator.mname);
                }
                protoWriter.writeBytes(sharedMailboxOperator.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.mailentities.Address$SharedMailboxOperator$a */
        public static final class C49817a extends Message.Builder<SharedMailboxOperator, C49817a> {

            /* renamed from: a */
            public Long f124757a;

            /* renamed from: b */
            public String f124758b;

            /* renamed from: c */
            public String f124759c;

            /* renamed from: a */
            public SharedMailboxOperator build() {
                return new SharedMailboxOperator(this.f124757a, this.f124758b, this.f124759c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49817a newBuilder() {
            C49817a aVar = new C49817a();
            aVar.f124757a = this.muser_id;
            aVar.f124758b = this.maddress;
            aVar.f124759c = this.mname;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.muser_id != null) {
                sb.append(", user_id=");
                sb.append(this.muser_id);
            }
            if (this.maddress != null) {
                sb.append(", address=");
                sb.append(this.maddress);
            }
            if (this.mname != null) {
                sb.append(", name=");
                sb.append(this.mname);
            }
            StringBuilder replace = sb.replace(0, 2, "SharedMailboxOperator{");
            replace.append('}');
            return replace.toString();
        }

        public SharedMailboxOperator(Long l, String str, String str2) {
            this(l, str, str2, ByteString.EMPTY);
        }

        public SharedMailboxOperator(Long l, String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.muser_id = l;
            this.maddress = str;
            this.mname = str2;
        }
    }

    /* renamed from: com.ss.android.lark.pb.mailentities.Address$b */
    private static final class C49820b extends ProtoAdapter<Address> {
        C49820b() {
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
            if (address.mname != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, address.mname);
            } else {
                i = 0;
            }
            if (address.maddress != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, address.maddress);
            } else {
                i2 = 0;
            }
            int i10 = i + i2;
            if (address.mlark_entity_type != null) {
                i3 = LarkEntityType.ADAPTER.encodedSizeWithTag(3, address.mlark_entity_type);
            } else {
                i3 = 0;
            }
            int i11 = i10 + i3;
            if (address.mlark_entity_id != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, address.mlark_entity_id);
            } else {
                i4 = 0;
            }
            int i12 = i11 + i4;
            if (address.mtenant_id != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, address.mtenant_id);
            } else {
                i5 = 0;
            }
            int i13 = i12 + i5;
            if (address.moperator != null) {
                i6 = SharedMailboxOperator.ADAPTER.encodedSizeWithTag(6, address.moperator);
            } else {
                i6 = 0;
            }
            int i14 = i13 + i6;
            if (address.mmail_group_type != null) {
                i7 = MailGroupType.ADAPTER.encodedSizeWithTag(7, address.mmail_group_type);
            } else {
                i7 = 0;
            }
            int i15 = i14 + i7;
            if (address.mRenameByLark != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(8, address.mRenameByLark);
            } else {
                i8 = 0;
            }
            int i16 = i15 + i8;
            if (address.mdisplay_name != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(9, address.mdisplay_name);
            }
            return i16 + i9 + address.unknownFields().size();
        }

        /* renamed from: a */
        public Address decode(ProtoReader protoReader) throws IOException {
            C49819a aVar = new C49819a();
            aVar.f124760a = "";
            aVar.f124761b = "";
            aVar.f124763d = 0L;
            aVar.f124764e = 0L;
            aVar.f124767h = false;
            aVar.f124768i = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124760a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f124761b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f124762c = LarkEntityType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f124763d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            aVar.f124764e = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            aVar.f124765f = SharedMailboxOperator.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            try {
                                aVar.f124766g = MailGroupType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 8:
                            aVar.f124767h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            aVar.f124768i = ProtoAdapter.STRING.decode(protoReader);
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
            if (address.mname != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, address.mname);
            }
            if (address.maddress != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, address.maddress);
            }
            if (address.mlark_entity_type != null) {
                LarkEntityType.ADAPTER.encodeWithTag(protoWriter, 3, address.mlark_entity_type);
            }
            if (address.mlark_entity_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, address.mlark_entity_id);
            }
            if (address.mtenant_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, address.mtenant_id);
            }
            if (address.moperator != null) {
                SharedMailboxOperator.ADAPTER.encodeWithTag(protoWriter, 6, address.moperator);
            }
            if (address.mmail_group_type != null) {
                MailGroupType.ADAPTER.encodeWithTag(protoWriter, 7, address.mmail_group_type);
            }
            if (address.mRenameByLark != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, address.mRenameByLark);
            }
            if (address.mdisplay_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, address.mdisplay_name);
            }
            protoWriter.writeBytes(address.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.mailentities.Address$a */
    public static final class C49819a extends Message.Builder<Address, C49819a> {

        /* renamed from: a */
        public String f124760a;

        /* renamed from: b */
        public String f124761b;

        /* renamed from: c */
        public LarkEntityType f124762c;

        /* renamed from: d */
        public Long f124763d;

        /* renamed from: e */
        public Long f124764e;

        /* renamed from: f */
        public SharedMailboxOperator f124765f;

        /* renamed from: g */
        public MailGroupType f124766g;

        /* renamed from: h */
        public Boolean f124767h;

        /* renamed from: i */
        public String f124768i;

        /* renamed from: a */
        public Address build() {
            return new Address(this.f124760a, this.f124761b, this.f124762c, this.f124763d, this.f124764e, this.f124765f, this.f124766g, this.f124767h, this.f124768i, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49819a newBuilder() {
        C49819a aVar = new C49819a();
        aVar.f124760a = this.mname;
        aVar.f124761b = this.maddress;
        aVar.f124762c = this.mlark_entity_type;
        aVar.f124763d = this.mlark_entity_id;
        aVar.f124764e = this.mtenant_id;
        aVar.f124765f = this.moperator;
        aVar.f124766g = this.mmail_group_type;
        aVar.f124767h = this.mRenameByLark;
        aVar.f124768i = this.mdisplay_name;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mname != null) {
            sb.append(", name=");
            sb.append(this.mname);
        }
        if (this.maddress != null) {
            sb.append(", address=");
            sb.append(this.maddress);
        }
        if (this.mlark_entity_type != null) {
            sb.append(", lark_entity_type=");
            sb.append(this.mlark_entity_type);
        }
        if (this.mlark_entity_id != null) {
            sb.append(", lark_entity_id=");
            sb.append(this.mlark_entity_id);
        }
        if (this.mtenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.mtenant_id);
        }
        if (this.moperator != null) {
            sb.append(", operator=");
            sb.append(this.moperator);
        }
        if (this.mmail_group_type != null) {
            sb.append(", mail_group_type=");
            sb.append(this.mmail_group_type);
        }
        if (this.mRenameByLark != null) {
            sb.append(", RenameByLark=");
            sb.append(this.mRenameByLark);
        }
        if (this.mdisplay_name != null) {
            sb.append(", display_name=");
            sb.append(this.mdisplay_name);
        }
        StringBuilder replace = sb.replace(0, 2, "Address{");
        replace.append('}');
        return replace.toString();
    }

    public Address(String str, String str2, LarkEntityType larkEntityType, Long l, Long l2, SharedMailboxOperator sharedMailboxOperator, MailGroupType mailGroupType, Boolean bool, String str3) {
        this(str, str2, larkEntityType, l, l2, sharedMailboxOperator, mailGroupType, bool, str3, ByteString.EMPTY);
    }

    public Address(String str, String str2, LarkEntityType larkEntityType, Long l, Long l2, SharedMailboxOperator sharedMailboxOperator, MailGroupType mailGroupType, Boolean bool, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mname = str;
        this.maddress = str2;
        this.mlark_entity_type = larkEntityType;
        this.mlark_entity_id = l;
        this.mtenant_id = l2;
        this.moperator = sharedMailboxOperator;
        this.mmail_group_type = mailGroupType;
        this.mRenameByLark = bool;
        this.mdisplay_name = str3;
    }
}
