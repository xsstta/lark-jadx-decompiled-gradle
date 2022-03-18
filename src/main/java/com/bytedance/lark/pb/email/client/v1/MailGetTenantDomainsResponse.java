package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class MailGetTenantDomainsResponse extends Message<MailGetTenantDomainsResponse, C16794a> {
    public static final ProtoAdapter<MailGetTenantDomainsResponse> ADAPTER = new C16795b();
    private static final long serialVersionUID = 0;
    public final List<String> domains;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetTenantDomainsResponse$b */
    private static final class C16795b extends ProtoAdapter<MailGetTenantDomainsResponse> {
        C16795b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetTenantDomainsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetTenantDomainsResponse mailGetTenantDomainsResponse) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, mailGetTenantDomainsResponse.domains) + mailGetTenantDomainsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetTenantDomainsResponse decode(ProtoReader protoReader) throws IOException {
            C16794a aVar = new C16794a();
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
                    aVar.f43259a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetTenantDomainsResponse mailGetTenantDomainsResponse) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, mailGetTenantDomainsResponse.domains);
            protoWriter.writeBytes(mailGetTenantDomainsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetTenantDomainsResponse$a */
    public static final class C16794a extends Message.Builder<MailGetTenantDomainsResponse, C16794a> {

        /* renamed from: a */
        public List<String> f43259a = Internal.newMutableList();

        /* renamed from: a */
        public MailGetTenantDomainsResponse build() {
            return new MailGetTenantDomainsResponse(this.f43259a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16794a newBuilder() {
        C16794a aVar = new C16794a();
        aVar.f43259a = Internal.copyOf("domains", this.domains);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetTenantDomainsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.domains.isEmpty()) {
            sb.append(", domains=");
            sb.append(this.domains);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetTenantDomainsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetTenantDomainsResponse(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public MailGetTenantDomainsResponse(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.domains = Internal.immutableCopyOf("domains", list);
    }
}
