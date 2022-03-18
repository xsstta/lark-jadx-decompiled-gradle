package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class MailUpdateSignatureUsageRequest extends Message<MailUpdateSignatureUsageRequest, C16960a> {
    public static final ProtoAdapter<MailUpdateSignatureUsageRequest> ADAPTER = new C16961b();
    private static final long serialVersionUID = 0;
    public final String account_id;
    public final MailSignatureUsage signature_usage;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUpdateSignatureUsageRequest$b */
    private static final class C16961b extends ProtoAdapter<MailUpdateSignatureUsageRequest> {
        C16961b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailUpdateSignatureUsageRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailUpdateSignatureUsageRequest mailUpdateSignatureUsageRequest) {
            int i;
            if (mailUpdateSignatureUsageRequest.signature_usage != null) {
                i = MailSignatureUsage.ADAPTER.encodedSizeWithTag(1, mailUpdateSignatureUsageRequest.signature_usage);
            } else {
                i = 0;
            }
            return i + ProtoAdapter.STRING.encodedSizeWithTag(2, mailUpdateSignatureUsageRequest.account_id) + mailUpdateSignatureUsageRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailUpdateSignatureUsageRequest decode(ProtoReader protoReader) throws IOException {
            C16960a aVar = new C16960a();
            aVar.f43467b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43466a = MailSignatureUsage.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43467b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailUpdateSignatureUsageRequest mailUpdateSignatureUsageRequest) throws IOException {
            if (mailUpdateSignatureUsageRequest.signature_usage != null) {
                MailSignatureUsage.ADAPTER.encodeWithTag(protoWriter, 1, mailUpdateSignatureUsageRequest.signature_usage);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailUpdateSignatureUsageRequest.account_id);
            protoWriter.writeBytes(mailUpdateSignatureUsageRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUpdateSignatureUsageRequest$a */
    public static final class C16960a extends Message.Builder<MailUpdateSignatureUsageRequest, C16960a> {

        /* renamed from: a */
        public MailSignatureUsage f43466a;

        /* renamed from: b */
        public String f43467b;

        /* renamed from: a */
        public MailUpdateSignatureUsageRequest build() {
            String str = this.f43467b;
            if (str != null) {
                return new MailUpdateSignatureUsageRequest(this.f43466a, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "account_id");
        }

        /* renamed from: a */
        public C16960a mo59901a(MailSignatureUsage mailSignatureUsage) {
            this.f43466a = mailSignatureUsage;
            return this;
        }

        /* renamed from: a */
        public C16960a mo59902a(String str) {
            this.f43467b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16960a newBuilder() {
        C16960a aVar = new C16960a();
        aVar.f43466a = this.signature_usage;
        aVar.f43467b = this.account_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailUpdateSignatureUsageRequest");
        StringBuilder sb = new StringBuilder();
        if (this.signature_usage != null) {
            sb.append(", signature_usage=");
            sb.append(this.signature_usage);
        }
        sb.append(", account_id=");
        sb.append(this.account_id);
        StringBuilder replace = sb.replace(0, 2, "MailUpdateSignatureUsageRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailUpdateSignatureUsageRequest(MailSignatureUsage mailSignatureUsage, String str) {
        this(mailSignatureUsage, str, ByteString.EMPTY);
    }

    public MailUpdateSignatureUsageRequest(MailSignatureUsage mailSignatureUsage, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.signature_usage = mailSignatureUsage;
        this.account_id = str;
    }
}
