package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetTenantDomainsRequest extends Message<MailGetTenantDomainsRequest, C16792a> {
    public static final ProtoAdapter<MailGetTenantDomainsRequest> ADAPTER = new C16793b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetTenantDomainsRequest$b */
    private static final class C16793b extends ProtoAdapter<MailGetTenantDomainsRequest> {
        C16793b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetTenantDomainsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetTenantDomainsRequest mailGetTenantDomainsRequest) {
            return mailGetTenantDomainsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetTenantDomainsRequest decode(ProtoReader protoReader) throws IOException {
            C16792a aVar = new C16792a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetTenantDomainsRequest mailGetTenantDomainsRequest) throws IOException {
            protoWriter.writeBytes(mailGetTenantDomainsRequest.unknownFields());
        }
    }

    public MailGetTenantDomainsRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetTenantDomainsRequest$a */
    public static final class C16792a extends Message.Builder<MailGetTenantDomainsRequest, C16792a> {
        /* renamed from: a */
        public MailGetTenantDomainsRequest build() {
            return new MailGetTenantDomainsRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16792a newBuilder() {
        C16792a aVar = new C16792a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetTenantDomainsRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "MailGetTenantDomainsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetTenantDomainsRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
