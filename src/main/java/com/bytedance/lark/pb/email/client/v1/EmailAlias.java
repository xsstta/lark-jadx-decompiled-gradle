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

public final class EmailAlias extends Message<EmailAlias, C16612a> {
    public static final ProtoAdapter<EmailAlias> ADAPTER = new C16613b();
    public static final Boolean DEFAULT_IS_ENABLE = false;
    private static final long serialVersionUID = 0;
    public final List<Address> all_addresses;
    public final Address default_address;
    public final List<Address> granted_addresses;
    public final Boolean is_enable;
    public final Address primary_address;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.EmailAlias$b */
    private static final class C16613b extends ProtoAdapter<EmailAlias> {
        C16613b() {
            super(FieldEncoding.LENGTH_DELIMITED, EmailAlias.class);
        }

        /* renamed from: a */
        public int encodedSize(EmailAlias emailAlias) {
            int i;
            int i2;
            int i3 = 0;
            if (emailAlias.is_enable != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, emailAlias.is_enable);
            } else {
                i = 0;
            }
            if (emailAlias.default_address != null) {
                i2 = Address.ADAPTER.encodedSizeWithTag(2, emailAlias.default_address);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag = i + i2 + Address.ADAPTER.asRepeated().encodedSizeWithTag(3, emailAlias.all_addresses);
            if (emailAlias.primary_address != null) {
                i3 = Address.ADAPTER.encodedSizeWithTag(4, emailAlias.primary_address);
            }
            return encodedSizeWithTag + i3 + Address.ADAPTER.asRepeated().encodedSizeWithTag(5, emailAlias.granted_addresses) + emailAlias.unknownFields().size();
        }

        /* renamed from: a */
        public EmailAlias decode(ProtoReader protoReader) throws IOException {
            C16612a aVar = new C16612a();
            aVar.f43022a = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43022a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43023b = Address.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f43024c.add(Address.ADAPTER.decode(protoReader));
                } else if (nextTag == 4) {
                    aVar.f43025d = Address.ADAPTER.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43026e.add(Address.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, EmailAlias emailAlias) throws IOException {
            if (emailAlias.is_enable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, emailAlias.is_enable);
            }
            if (emailAlias.default_address != null) {
                Address.ADAPTER.encodeWithTag(protoWriter, 2, emailAlias.default_address);
            }
            Address.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, emailAlias.all_addresses);
            if (emailAlias.primary_address != null) {
                Address.ADAPTER.encodeWithTag(protoWriter, 4, emailAlias.primary_address);
            }
            Address.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, emailAlias.granted_addresses);
            protoWriter.writeBytes(emailAlias.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.EmailAlias$a */
    public static final class C16612a extends Message.Builder<EmailAlias, C16612a> {

        /* renamed from: a */
        public Boolean f43022a;

        /* renamed from: b */
        public Address f43023b;

        /* renamed from: c */
        public List<Address> f43024c = Internal.newMutableList();

        /* renamed from: d */
        public Address f43025d;

        /* renamed from: e */
        public List<Address> f43026e = Internal.newMutableList();

        /* renamed from: a */
        public EmailAlias build() {
            return new EmailAlias(this.f43022a, this.f43023b, this.f43024c, this.f43025d, this.f43026e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16612a newBuilder() {
        C16612a aVar = new C16612a();
        aVar.f43022a = this.is_enable;
        aVar.f43023b = this.default_address;
        aVar.f43024c = Internal.copyOf("all_addresses", this.all_addresses);
        aVar.f43025d = this.primary_address;
        aVar.f43026e = Internal.copyOf("granted_addresses", this.granted_addresses);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "EmailAlias");
        StringBuilder sb = new StringBuilder();
        if (this.is_enable != null) {
            sb.append(", is_enable=");
            sb.append(this.is_enable);
        }
        if (this.default_address != null) {
            sb.append(", default_address=");
            sb.append(this.default_address);
        }
        if (!this.all_addresses.isEmpty()) {
            sb.append(", all_addresses=");
            sb.append(this.all_addresses);
        }
        if (this.primary_address != null) {
            sb.append(", primary_address=");
            sb.append(this.primary_address);
        }
        if (!this.granted_addresses.isEmpty()) {
            sb.append(", granted_addresses=");
            sb.append(this.granted_addresses);
        }
        StringBuilder replace = sb.replace(0, 2, "EmailAlias{");
        replace.append('}');
        return replace.toString();
    }

    public EmailAlias(Boolean bool, Address address, List<Address> list, Address address2, List<Address> list2) {
        this(bool, address, list, address2, list2, ByteString.EMPTY);
    }

    public EmailAlias(Boolean bool, Address address, List<Address> list, Address address2, List<Address> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_enable = bool;
        this.default_address = address;
        this.all_addresses = Internal.immutableCopyOf("all_addresses", list);
        this.primary_address = address2;
        this.granted_addresses = Internal.immutableCopyOf("granted_addresses", list2);
    }
}
