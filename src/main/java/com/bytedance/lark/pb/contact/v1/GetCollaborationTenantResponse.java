package com.bytedance.lark.pb.contact.v1;

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

public final class GetCollaborationTenantResponse extends Message<GetCollaborationTenantResponse, C16218a> {
    public static final ProtoAdapter<GetCollaborationTenantResponse> ADAPTER = new C16219b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    private static final long serialVersionUID = 0;
    public final Boolean has_more;
    public final List<CollaborationTenant> tenants;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetCollaborationTenantResponse$b */
    private static final class C16219b extends ProtoAdapter<GetCollaborationTenantResponse> {
        C16219b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCollaborationTenantResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCollaborationTenantResponse getCollaborationTenantResponse) {
            int i;
            int encodedSizeWithTag = CollaborationTenant.ADAPTER.asRepeated().encodedSizeWithTag(1, getCollaborationTenantResponse.tenants);
            if (getCollaborationTenantResponse.has_more != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, getCollaborationTenantResponse.has_more);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getCollaborationTenantResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetCollaborationTenantResponse decode(ProtoReader protoReader) throws IOException {
            C16218a aVar = new C16218a();
            aVar.f42392b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42391a.add(CollaborationTenant.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42392b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCollaborationTenantResponse getCollaborationTenantResponse) throws IOException {
            CollaborationTenant.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getCollaborationTenantResponse.tenants);
            if (getCollaborationTenantResponse.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getCollaborationTenantResponse.has_more);
            }
            protoWriter.writeBytes(getCollaborationTenantResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetCollaborationTenantResponse$a */
    public static final class C16218a extends Message.Builder<GetCollaborationTenantResponse, C16218a> {

        /* renamed from: a */
        public List<CollaborationTenant> f42391a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f42392b;

        /* renamed from: a */
        public GetCollaborationTenantResponse build() {
            return new GetCollaborationTenantResponse(this.f42391a, this.f42392b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16218a newBuilder() {
        C16218a aVar = new C16218a();
        aVar.f42391a = Internal.copyOf("tenants", this.tenants);
        aVar.f42392b = this.has_more;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetCollaborationTenantResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.tenants.isEmpty()) {
            sb.append(", tenants=");
            sb.append(this.tenants);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        StringBuilder replace = sb.replace(0, 2, "GetCollaborationTenantResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetCollaborationTenantResponse(List<CollaborationTenant> list, Boolean bool) {
        this(list, bool, ByteString.EMPTY);
    }

    public GetCollaborationTenantResponse(List<CollaborationTenant> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.tenants = Internal.immutableCopyOf("tenants", list);
        this.has_more = bool;
    }
}
