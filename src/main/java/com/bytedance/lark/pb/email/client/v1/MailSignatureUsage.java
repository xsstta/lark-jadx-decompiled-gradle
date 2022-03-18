package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailSignatureUsage extends Message<MailSignatureUsage, C16898a> {
    public static final ProtoAdapter<MailSignatureUsage> ADAPTER = new C16899b();
    private static final long serialVersionUID = 0;
    public final String address;
    public final String new_mail_signature_id;
    public final String reply_mail_signature_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSignatureUsage$b */
    private static final class C16899b extends ProtoAdapter<MailSignatureUsage> {
        C16899b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailSignatureUsage.class);
        }

        /* renamed from: a */
        public int encodedSize(MailSignatureUsage mailSignatureUsage) {
            int i;
            int i2;
            int i3 = 0;
            if (mailSignatureUsage.address != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailSignatureUsage.address);
            } else {
                i = 0;
            }
            if (mailSignatureUsage.new_mail_signature_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mailSignatureUsage.new_mail_signature_id);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (mailSignatureUsage.reply_mail_signature_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, mailSignatureUsage.reply_mail_signature_id);
            }
            return i4 + i3 + mailSignatureUsage.unknownFields().size();
        }

        /* renamed from: a */
        public MailSignatureUsage decode(ProtoReader protoReader) throws IOException {
            C16898a aVar = new C16898a();
            aVar.f43378a = "";
            aVar.f43379b = "";
            aVar.f43380c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43378a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43379b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43380c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailSignatureUsage mailSignatureUsage) throws IOException {
            if (mailSignatureUsage.address != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailSignatureUsage.address);
            }
            if (mailSignatureUsage.new_mail_signature_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailSignatureUsage.new_mail_signature_id);
            }
            if (mailSignatureUsage.reply_mail_signature_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, mailSignatureUsage.reply_mail_signature_id);
            }
            protoWriter.writeBytes(mailSignatureUsage.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSignatureUsage$a */
    public static final class C16898a extends Message.Builder<MailSignatureUsage, C16898a> {

        /* renamed from: a */
        public String f43378a;

        /* renamed from: b */
        public String f43379b;

        /* renamed from: c */
        public String f43380c;

        /* renamed from: a */
        public MailSignatureUsage build() {
            return new MailSignatureUsage(this.f43378a, this.f43379b, this.f43380c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16898a newBuilder() {
        C16898a aVar = new C16898a();
        aVar.f43378a = this.address;
        aVar.f43379b = this.new_mail_signature_id;
        aVar.f43380c = this.reply_mail_signature_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailSignatureUsage");
        StringBuilder sb = new StringBuilder();
        if (this.address != null) {
            sb.append(", address=");
            sb.append(this.address);
        }
        if (this.new_mail_signature_id != null) {
            sb.append(", new_mail_signature_id=");
            sb.append(this.new_mail_signature_id);
        }
        if (this.reply_mail_signature_id != null) {
            sb.append(", reply_mail_signature_id=");
            sb.append(this.reply_mail_signature_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MailSignatureUsage{");
        replace.append('}');
        return replace.toString();
    }

    public MailSignatureUsage(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public MailSignatureUsage(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.address = str;
        this.new_mail_signature_id = str2;
        this.reply_mail_signature_id = str3;
    }
}
