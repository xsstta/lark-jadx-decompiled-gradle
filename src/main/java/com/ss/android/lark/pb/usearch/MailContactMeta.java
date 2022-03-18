package com.ss.android.lark.pb.usearch;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class MailContactMeta extends Message<MailContactMeta, C50210a> {
    public static final ProtoAdapter<MailContactMeta> ADAPTER = new C50211b();
    private static final long serialVersionUID = 0;
    public final String memail;
    public final String mid;
    public final ContactType mtype;

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

    /* renamed from: com.ss.android.lark.pb.usearch.MailContactMeta$b */
    private static final class C50211b extends ProtoAdapter<MailContactMeta> {
        C50211b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailContactMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(MailContactMeta mailContactMeta) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, mailContactMeta.mid);
            int i2 = 0;
            if (mailContactMeta.mtype != null) {
                i = ContactType.ADAPTER.encodedSizeWithTag(2, mailContactMeta.mtype);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (mailContactMeta.memail != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, mailContactMeta.memail);
            }
            return i3 + i2 + mailContactMeta.unknownFields().size();
        }

        /* renamed from: a */
        public MailContactMeta decode(ProtoReader protoReader) throws IOException {
            C50210a aVar = new C50210a();
            aVar.f125456a = "";
            aVar.f125458c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125456a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f125457b = ContactType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125458c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailContactMeta mailContactMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailContactMeta.mid);
            if (mailContactMeta.mtype != null) {
                ContactType.ADAPTER.encodeWithTag(protoWriter, 2, mailContactMeta.mtype);
            }
            if (mailContactMeta.memail != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, mailContactMeta.memail);
            }
            protoWriter.writeBytes(mailContactMeta.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50210a newBuilder() {
        C50210a aVar = new C50210a();
        aVar.f125456a = this.mid;
        aVar.f125457b = this.mtype;
        aVar.f125458c = this.memail;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.usearch.MailContactMeta$a */
    public static final class C50210a extends Message.Builder<MailContactMeta, C50210a> {

        /* renamed from: a */
        public String f125456a;

        /* renamed from: b */
        public ContactType f125457b;

        /* renamed from: c */
        public String f125458c;

        /* renamed from: a */
        public MailContactMeta build() {
            String str = this.f125456a;
            if (str != null) {
                return new MailContactMeta(str, this.f125457b, this.f125458c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mid");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.mid);
        if (this.mtype != null) {
            sb.append(", type=");
            sb.append(this.mtype);
        }
        if (this.memail != null) {
            sb.append(", email=");
            sb.append(this.memail);
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
        this.mid = str;
        this.mtype = contactType;
        this.memail = str2;
    }
}
