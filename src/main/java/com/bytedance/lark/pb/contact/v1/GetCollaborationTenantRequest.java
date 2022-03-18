package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetCollaborationTenantRequest extends Message<GetCollaborationTenantRequest, C16216a> {
    public static final ProtoAdapter<GetCollaborationTenantRequest> ADAPTER = new C16217b();
    public static final Integer DEFAULT_COUNT = 0;
    public static final Integer DEFAULT_OFFSET = 0;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final Integer offset;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetCollaborationTenantRequest$b */
    private static final class C16217b extends ProtoAdapter<GetCollaborationTenantRequest> {
        C16217b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCollaborationTenantRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCollaborationTenantRequest getCollaborationTenantRequest) {
            int i;
            int i2 = 0;
            if (getCollaborationTenantRequest.offset != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, getCollaborationTenantRequest.offset);
            } else {
                i = 0;
            }
            if (getCollaborationTenantRequest.count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, getCollaborationTenantRequest.count);
            }
            return i + i2 + getCollaborationTenantRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetCollaborationTenantRequest decode(ProtoReader protoReader) throws IOException {
            C16216a aVar = new C16216a();
            aVar.f42389a = 0;
            aVar.f42390b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42389a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42390b = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCollaborationTenantRequest getCollaborationTenantRequest) throws IOException {
            if (getCollaborationTenantRequest.offset != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, getCollaborationTenantRequest.offset);
            }
            if (getCollaborationTenantRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getCollaborationTenantRequest.count);
            }
            protoWriter.writeBytes(getCollaborationTenantRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetCollaborationTenantRequest$a */
    public static final class C16216a extends Message.Builder<GetCollaborationTenantRequest, C16216a> {

        /* renamed from: a */
        public Integer f42389a;

        /* renamed from: b */
        public Integer f42390b;

        /* renamed from: a */
        public GetCollaborationTenantRequest build() {
            return new GetCollaborationTenantRequest(this.f42389a, this.f42390b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16216a mo58119a(Integer num) {
            this.f42389a = num;
            return this;
        }

        /* renamed from: b */
        public C16216a mo58121b(Integer num) {
            this.f42390b = num;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16216a newBuilder() {
        C16216a aVar = new C16216a();
        aVar.f42389a = this.offset;
        aVar.f42390b = this.count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetCollaborationTenantRequest");
        StringBuilder sb = new StringBuilder();
        if (this.offset != null) {
            sb.append(", offset=");
            sb.append(this.offset);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        StringBuilder replace = sb.replace(0, 2, "GetCollaborationTenantRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetCollaborationTenantRequest(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }

    public GetCollaborationTenantRequest(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.offset = num;
        this.count = num2;
    }
}
