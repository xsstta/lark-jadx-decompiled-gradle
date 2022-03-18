package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class Contact extends Message<Contact, C14830a> {
    public static final ProtoAdapter<Contact> ADAPTER = new C14831b();
    public static final Boolean DEFAULT_IS_DELETED = false;
    private static final long serialVersionUID = 0;
    public final String chatter_id;
    public final String id;
    public final Boolean is_deleted;

    /* renamed from: com.bytedance.lark.pb.basic.v1.Contact$b */
    private static final class C14831b extends ProtoAdapter<Contact> {
        C14831b() {
            super(FieldEncoding.LENGTH_DELIMITED, Contact.class);
        }

        /* renamed from: a */
        public int encodedSize(Contact contact) {
            int i;
            int i2;
            int i3 = 0;
            if (contact.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, contact.id);
            } else {
                i = 0;
            }
            if (contact.chatter_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, contact.chatter_id);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (contact.is_deleted != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, contact.is_deleted);
            }
            return i4 + i3 + contact.unknownFields().size();
        }

        /* renamed from: a */
        public Contact decode(ProtoReader protoReader) throws IOException {
            C14830a aVar = new C14830a();
            aVar.f39175a = "";
            aVar.f39176b = "";
            aVar.f39177c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39175a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f39176b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f39177c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Contact contact) throws IOException {
            if (contact.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, contact.id);
            }
            if (contact.chatter_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, contact.chatter_id);
            }
            if (contact.is_deleted != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, contact.is_deleted);
            }
            protoWriter.writeBytes(contact.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Contact$a */
    public static final class C14830a extends Message.Builder<Contact, C14830a> {

        /* renamed from: a */
        public String f39175a;

        /* renamed from: b */
        public String f39176b;

        /* renamed from: c */
        public Boolean f39177c;

        /* renamed from: a */
        public Contact build() {
            return new Contact(this.f39175a, this.f39176b, this.f39177c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14830a newBuilder() {
        C14830a aVar = new C14830a();
        aVar.f39175a = this.id;
        aVar.f39176b = this.chatter_id;
        aVar.f39177c = this.is_deleted;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "Contact");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.chatter_id != null) {
            sb.append(", chatter_id=");
            sb.append(this.chatter_id);
        }
        if (this.is_deleted != null) {
            sb.append(", is_deleted=");
            sb.append(this.is_deleted);
        }
        StringBuilder replace = sb.replace(0, 2, "Contact{");
        replace.append('}');
        return replace.toString();
    }

    public Contact(String str, String str2, Boolean bool) {
        this(str, str2, bool, ByteString.EMPTY);
    }

    public Contact(String str, String str2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.chatter_id = str2;
        this.is_deleted = bool;
    }
}
