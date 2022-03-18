package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailSwitchAccountRequest extends Message<MailSwitchAccountRequest, C16906a> {
    public static final ProtoAdapter<MailSwitchAccountRequest> ADAPTER = new C16907b();
    private static final long serialVersionUID = 0;
    public final String account_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSwitchAccountRequest$b */
    private static final class C16907b extends ProtoAdapter<MailSwitchAccountRequest> {
        C16907b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailSwitchAccountRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailSwitchAccountRequest mailSwitchAccountRequest) {
            int i;
            if (mailSwitchAccountRequest.account_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailSwitchAccountRequest.account_id);
            } else {
                i = 0;
            }
            return i + mailSwitchAccountRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailSwitchAccountRequest decode(ProtoReader protoReader) throws IOException {
            C16906a aVar = new C16906a();
            aVar.f43393a = "";
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
                    aVar.f43393a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailSwitchAccountRequest mailSwitchAccountRequest) throws IOException {
            if (mailSwitchAccountRequest.account_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailSwitchAccountRequest.account_id);
            }
            protoWriter.writeBytes(mailSwitchAccountRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSwitchAccountRequest$a */
    public static final class C16906a extends Message.Builder<MailSwitchAccountRequest, C16906a> {

        /* renamed from: a */
        public String f43393a;

        /* renamed from: a */
        public MailSwitchAccountRequest build() {
            return new MailSwitchAccountRequest(this.f43393a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16906a newBuilder() {
        C16906a aVar = new C16906a();
        aVar.f43393a = this.account_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailSwitchAccountRequest");
        StringBuilder sb = new StringBuilder();
        if (this.account_id != null) {
            sb.append(", account_id=");
            sb.append(this.account_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MailSwitchAccountRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailSwitchAccountRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public MailSwitchAccountRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.account_id = str;
    }
}
