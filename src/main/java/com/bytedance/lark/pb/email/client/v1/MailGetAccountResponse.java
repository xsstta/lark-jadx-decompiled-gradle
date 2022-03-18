package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetAccountResponse extends Message<MailGetAccountResponse, C16706a> {
    public static final ProtoAdapter<MailGetAccountResponse> ADAPTER = new C16707b();
    private static final long serialVersionUID = 0;
    public final MailAccount account;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetAccountResponse$b */
    private static final class C16707b extends ProtoAdapter<MailGetAccountResponse> {
        C16707b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetAccountResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetAccountResponse mailGetAccountResponse) {
            int i;
            if (mailGetAccountResponse.account != null) {
                i = MailAccount.ADAPTER.encodedSizeWithTag(1, mailGetAccountResponse.account);
            } else {
                i = 0;
            }
            return i + mailGetAccountResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetAccountResponse decode(ProtoReader protoReader) throws IOException {
            C16706a aVar = new C16706a();
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
                    aVar.f43170a = MailAccount.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetAccountResponse mailGetAccountResponse) throws IOException {
            if (mailGetAccountResponse.account != null) {
                MailAccount.ADAPTER.encodeWithTag(protoWriter, 1, mailGetAccountResponse.account);
            }
            protoWriter.writeBytes(mailGetAccountResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetAccountResponse$a */
    public static final class C16706a extends Message.Builder<MailGetAccountResponse, C16706a> {

        /* renamed from: a */
        public MailAccount f43170a;

        /* renamed from: a */
        public MailGetAccountResponse build() {
            return new MailGetAccountResponse(this.f43170a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16706a newBuilder() {
        C16706a aVar = new C16706a();
        aVar.f43170a = this.account;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetAccountResponse");
        StringBuilder sb = new StringBuilder();
        if (this.account != null) {
            sb.append(", account=");
            sb.append(this.account);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetAccountResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetAccountResponse(MailAccount mailAccount) {
        this(mailAccount, ByteString.EMPTY);
    }

    public MailGetAccountResponse(MailAccount mailAccount, ByteString byteString) {
        super(ADAPTER, byteString);
        this.account = mailAccount;
    }
}
