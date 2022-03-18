package com.ss.android.lark.pb.mailentities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailRequestBase extends Message<MailRequestBase, C49821a> {
    public static final ProtoAdapter<MailRequestBase> ADAPTER = new C49822b();
    private static final long serialVersionUID = 0;
    public final SharedEmailAccount mshared_email_account;

    /* renamed from: com.ss.android.lark.pb.mailentities.MailRequestBase$b */
    private static final class C49822b extends ProtoAdapter<MailRequestBase> {
        C49822b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailRequestBase.class);
        }

        /* renamed from: a */
        public int encodedSize(MailRequestBase mailRequestBase) {
            int i;
            if (mailRequestBase.mshared_email_account != null) {
                i = SharedEmailAccount.ADAPTER.encodedSizeWithTag(1, mailRequestBase.mshared_email_account);
            } else {
                i = 0;
            }
            return i + mailRequestBase.unknownFields().size();
        }

        /* renamed from: a */
        public MailRequestBase decode(ProtoReader protoReader) throws IOException {
            C49821a aVar = new C49821a();
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
                    aVar.f124769a = SharedEmailAccount.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailRequestBase mailRequestBase) throws IOException {
            if (mailRequestBase.mshared_email_account != null) {
                SharedEmailAccount.ADAPTER.encodeWithTag(protoWriter, 1, mailRequestBase.mshared_email_account);
            }
            protoWriter.writeBytes(mailRequestBase.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.mailentities.MailRequestBase$a */
    public static final class C49821a extends Message.Builder<MailRequestBase, C49821a> {

        /* renamed from: a */
        public SharedEmailAccount f124769a;

        /* renamed from: a */
        public MailRequestBase build() {
            return new MailRequestBase(this.f124769a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C49821a mo173393a(SharedEmailAccount sharedEmailAccount) {
            this.f124769a = sharedEmailAccount;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49821a newBuilder() {
        C49821a aVar = new C49821a();
        aVar.f124769a = this.mshared_email_account;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mshared_email_account != null) {
            sb.append(", shared_email_account=");
            sb.append(this.mshared_email_account);
        }
        StringBuilder replace = sb.replace(0, 2, "MailRequestBase{");
        replace.append('}');
        return replace.toString();
    }

    public MailRequestBase(SharedEmailAccount sharedEmailAccount) {
        this(sharedEmailAccount, ByteString.EMPTY);
    }

    public MailRequestBase(SharedEmailAccount sharedEmailAccount, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mshared_email_account = sharedEmailAccount;
    }
}
