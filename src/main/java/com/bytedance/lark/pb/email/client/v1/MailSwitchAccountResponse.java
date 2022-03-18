package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailSwitchAccountResponse extends Message<MailSwitchAccountResponse, C16908a> {
    public static final ProtoAdapter<MailSwitchAccountResponse> ADAPTER = new C16909b();
    private static final long serialVersionUID = 0;
    public final MailAccount account;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSwitchAccountResponse$b */
    private static final class C16909b extends ProtoAdapter<MailSwitchAccountResponse> {
        C16909b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailSwitchAccountResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailSwitchAccountResponse mailSwitchAccountResponse) {
            int i;
            if (mailSwitchAccountResponse.account != null) {
                i = MailAccount.ADAPTER.encodedSizeWithTag(1, mailSwitchAccountResponse.account);
            } else {
                i = 0;
            }
            return i + mailSwitchAccountResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailSwitchAccountResponse decode(ProtoReader protoReader) throws IOException {
            C16908a aVar = new C16908a();
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
                    aVar.f43394a = MailAccount.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailSwitchAccountResponse mailSwitchAccountResponse) throws IOException {
            if (mailSwitchAccountResponse.account != null) {
                MailAccount.ADAPTER.encodeWithTag(protoWriter, 1, mailSwitchAccountResponse.account);
            }
            protoWriter.writeBytes(mailSwitchAccountResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSwitchAccountResponse$a */
    public static final class C16908a extends Message.Builder<MailSwitchAccountResponse, C16908a> {

        /* renamed from: a */
        public MailAccount f43394a;

        /* renamed from: a */
        public MailSwitchAccountResponse build() {
            return new MailSwitchAccountResponse(this.f43394a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16908a newBuilder() {
        C16908a aVar = new C16908a();
        aVar.f43394a = this.account;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailSwitchAccountResponse");
        StringBuilder sb = new StringBuilder();
        if (this.account != null) {
            sb.append(", account=");
            sb.append(this.account);
        }
        StringBuilder replace = sb.replace(0, 2, "MailSwitchAccountResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailSwitchAccountResponse(MailAccount mailAccount) {
        this(mailAccount, ByteString.EMPTY);
    }

    public MailSwitchAccountResponse(MailAccount mailAccount, ByteString byteString) {
        super(ADAPTER, byteString);
        this.account = mailAccount;
    }
}
