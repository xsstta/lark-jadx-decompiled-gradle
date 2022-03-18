package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailUpdateAccountRequest extends Message<MailUpdateAccountRequest, C16930a> {
    public static final ProtoAdapter<MailUpdateAccountRequest> ADAPTER = new C16931b();
    private static final long serialVersionUID = 0;
    public final MailAccount account;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUpdateAccountRequest$b */
    private static final class C16931b extends ProtoAdapter<MailUpdateAccountRequest> {
        C16931b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailUpdateAccountRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailUpdateAccountRequest mailUpdateAccountRequest) {
            int i;
            if (mailUpdateAccountRequest.account != null) {
                i = MailAccount.ADAPTER.encodedSizeWithTag(1, mailUpdateAccountRequest.account);
            } else {
                i = 0;
            }
            return i + mailUpdateAccountRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailUpdateAccountRequest decode(ProtoReader protoReader) throws IOException {
            C16930a aVar = new C16930a();
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
                    aVar.f43424a = MailAccount.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailUpdateAccountRequest mailUpdateAccountRequest) throws IOException {
            if (mailUpdateAccountRequest.account != null) {
                MailAccount.ADAPTER.encodeWithTag(protoWriter, 1, mailUpdateAccountRequest.account);
            }
            protoWriter.writeBytes(mailUpdateAccountRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUpdateAccountRequest$a */
    public static final class C16930a extends Message.Builder<MailUpdateAccountRequest, C16930a> {

        /* renamed from: a */
        public MailAccount f43424a;

        /* renamed from: a */
        public MailUpdateAccountRequest build() {
            return new MailUpdateAccountRequest(this.f43424a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16930a mo59831a(MailAccount mailAccount) {
            this.f43424a = mailAccount;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16930a newBuilder() {
        C16930a aVar = new C16930a();
        aVar.f43424a = this.account;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailUpdateAccountRequest");
        StringBuilder sb = new StringBuilder();
        if (this.account != null) {
            sb.append(", account=");
            sb.append(this.account);
        }
        StringBuilder replace = sb.replace(0, 2, "MailUpdateAccountRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailUpdateAccountRequest(MailAccount mailAccount) {
        this(mailAccount, ByteString.EMPTY);
    }

    public MailUpdateAccountRequest(MailAccount mailAccount, ByteString byteString) {
        super(ADAPTER, byteString);
        this.account = mailAccount;
    }
}
