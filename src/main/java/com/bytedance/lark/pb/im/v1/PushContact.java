package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Contact;
import com.bytedance.lark.pb.basic.v1.ContactInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PushContact extends Message<PushContact, C17883a> {
    public static final ProtoAdapter<PushContact> ADAPTER = new C17884b();
    private static final long serialVersionUID = 0;
    public final Contact contact;
    public final ContactInfo contact_info;
    public final C14928Entity entity;

    /* renamed from: com.bytedance.lark.pb.im.v1.PushContact$b */
    private static final class C17884b extends ProtoAdapter<PushContact> {
        C17884b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushContact.class);
        }

        /* renamed from: a */
        public int encodedSize(PushContact pushContact) {
            int i;
            int i2;
            int i3 = 0;
            if (pushContact.contact != null) {
                i = Contact.ADAPTER.encodedSizeWithTag(1, pushContact.contact);
            } else {
                i = 0;
            }
            if (pushContact.entity != null) {
                i2 = C14928Entity.ADAPTER.encodedSizeWithTag(2, pushContact.entity);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (pushContact.contact_info != null) {
                i3 = ContactInfo.ADAPTER.encodedSizeWithTag(3, pushContact.contact_info);
            }
            return i4 + i3 + pushContact.unknownFields().size();
        }

        /* renamed from: a */
        public PushContact decode(ProtoReader protoReader) throws IOException {
            C17883a aVar = new C17883a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44958a = Contact.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44959b = C14928Entity.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44960c = ContactInfo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushContact pushContact) throws IOException {
            if (pushContact.contact != null) {
                Contact.ADAPTER.encodeWithTag(protoWriter, 1, pushContact.contact);
            }
            if (pushContact.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 2, pushContact.entity);
            }
            if (pushContact.contact_info != null) {
                ContactInfo.ADAPTER.encodeWithTag(protoWriter, 3, pushContact.contact_info);
            }
            protoWriter.writeBytes(pushContact.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushContact$a */
    public static final class C17883a extends Message.Builder<PushContact, C17883a> {

        /* renamed from: a */
        public Contact f44958a;

        /* renamed from: b */
        public C14928Entity f44959b;

        /* renamed from: c */
        public ContactInfo f44960c;

        /* renamed from: a */
        public PushContact build() {
            return new PushContact(this.f44958a, this.f44959b, this.f44960c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17883a newBuilder() {
        C17883a aVar = new C17883a();
        aVar.f44958a = this.contact;
        aVar.f44959b = this.entity;
        aVar.f44960c = this.contact_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushContact");
        StringBuilder sb = new StringBuilder();
        if (this.contact != null) {
            sb.append(", contact=");
            sb.append(this.contact);
        }
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        if (this.contact_info != null) {
            sb.append(", contact_info=");
            sb.append(this.contact_info);
        }
        StringBuilder replace = sb.replace(0, 2, "PushContact{");
        replace.append('}');
        return replace.toString();
    }

    public PushContact(Contact contact2, C14928Entity entity2, ContactInfo contactInfo) {
        this(contact2, entity2, contactInfo, ByteString.EMPTY);
    }

    public PushContact(Contact contact2, C14928Entity entity2, ContactInfo contactInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.contact = contact2;
        this.entity = entity2;
        this.contact_info = contactInfo;
    }
}
