package com.bytedance.lark.pb.search.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class MailContactMeta extends Message<MailContactMeta, C18993a> {
    public static final ProtoAdapter<MailContactMeta> ADAPTER = new C18994b();
    public static final ContactType DEFAULT_TYPE = ContactType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String email;
    public final String id;
    public final ContactType type;

    public enum ContactType implements WireEnum {
        UNKNOWN(0),
        CHATTER(1),
        GROUP(2),
        EXTERNAL_CONTACT(3),
        NAME_CARD(4),
        SHARED_MAILBOX(5),
        MAIL_GROUP(6),
        NONE_TYPE(7);
        
        public static final ProtoAdapter<ContactType> ADAPTER = ProtoAdapter.newEnumAdapter(ContactType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ContactType fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return CHATTER;
                case 2:
                    return GROUP;
                case 3:
                    return EXTERNAL_CONTACT;
                case 4:
                    return NAME_CARD;
                case 5:
                    return SHARED_MAILBOX;
                case 6:
                    return MAIL_GROUP;
                case 7:
                    return NONE_TYPE;
                default:
                    return null;
            }
        }

        private ContactType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.MailContactMeta$b */
    private static final class C18994b extends ProtoAdapter<MailContactMeta> {
        C18994b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailContactMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(MailContactMeta mailContactMeta) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, mailContactMeta.id);
            int i2 = 0;
            if (mailContactMeta.type != null) {
                i = ContactType.ADAPTER.encodedSizeWithTag(2, mailContactMeta.type);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (mailContactMeta.email != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, mailContactMeta.email);
            }
            return i3 + i2 + mailContactMeta.unknownFields().size();
        }

        /* renamed from: a */
        public MailContactMeta decode(ProtoReader protoReader) throws IOException {
            C18993a aVar = new C18993a();
            aVar.f46969a = "";
            aVar.f46970b = ContactType.UNKNOWN;
            aVar.f46971c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46969a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f46970b = ContactType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46971c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailContactMeta mailContactMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailContactMeta.id);
            if (mailContactMeta.type != null) {
                ContactType.ADAPTER.encodeWithTag(protoWriter, 2, mailContactMeta.type);
            }
            if (mailContactMeta.email != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, mailContactMeta.email);
            }
            protoWriter.writeBytes(mailContactMeta.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18993a newBuilder() {
        C18993a aVar = new C18993a();
        aVar.f46969a = this.id;
        aVar.f46970b = this.type;
        aVar.f46971c = this.email;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.MailContactMeta$a */
    public static final class C18993a extends Message.Builder<MailContactMeta, C18993a> {

        /* renamed from: a */
        public String f46969a;

        /* renamed from: b */
        public ContactType f46970b;

        /* renamed from: c */
        public String f46971c;

        /* renamed from: a */
        public MailContactMeta build() {
            String str = this.f46969a;
            if (str != null) {
                return new MailContactMeta(str, this.f46970b, this.f46971c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "MailContactMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.email != null) {
            sb.append(", email=");
            sb.append(this.email);
        }
        StringBuilder replace = sb.replace(0, 2, "MailContactMeta{");
        replace.append('}');
        return replace.toString();
    }

    public MailContactMeta(String str, ContactType contactType, String str2) {
        this(str, contactType, str2, ByteString.EMPTY);
    }

    public MailContactMeta(String str, ContactType contactType, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.type = contactType;
        this.email = str2;
    }
}
