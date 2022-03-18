package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class CollaborationTenant extends Message<CollaborationTenant, C16148a> {
    public static final ProtoAdapter<CollaborationTenant> ADAPTER = new C16149b();
    public static final Integer DEFAULT_TENANT_USER_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final String tenant_id;
    public final String tenant_name;
    public final Integer tenant_user_count;

    /* renamed from: com.bytedance.lark.pb.contact.v1.CollaborationTenant$b */
    private static final class C16149b extends ProtoAdapter<CollaborationTenant> {
        C16149b() {
            super(FieldEncoding.LENGTH_DELIMITED, CollaborationTenant.class);
        }

        /* renamed from: a */
        public int encodedSize(CollaborationTenant collaborationTenant) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, collaborationTenant.tenant_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, collaborationTenant.tenant_name);
            if (collaborationTenant.tenant_user_count != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(3, collaborationTenant.tenant_user_count);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + collaborationTenant.unknownFields().size();
        }

        /* renamed from: a */
        public CollaborationTenant decode(ProtoReader protoReader) throws IOException {
            C16148a aVar = new C16148a();
            aVar.f42269a = "";
            aVar.f42270b = "";
            aVar.f42271c = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42269a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42270b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42271c = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CollaborationTenant collaborationTenant) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, collaborationTenant.tenant_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, collaborationTenant.tenant_name);
            if (collaborationTenant.tenant_user_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, collaborationTenant.tenant_user_count);
            }
            protoWriter.writeBytes(collaborationTenant.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16148a newBuilder() {
        C16148a aVar = new C16148a();
        aVar.f42269a = this.tenant_id;
        aVar.f42270b = this.tenant_name;
        aVar.f42271c = this.tenant_user_count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.CollaborationTenant$a */
    public static final class C16148a extends Message.Builder<CollaborationTenant, C16148a> {

        /* renamed from: a */
        public String f42269a;

        /* renamed from: b */
        public String f42270b;

        /* renamed from: c */
        public Integer f42271c;

        /* renamed from: a */
        public CollaborationTenant build() {
            String str;
            String str2 = this.f42269a;
            if (str2 != null && (str = this.f42270b) != null) {
                return new CollaborationTenant(str2, str, this.f42271c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "tenant_id", this.f42270b, "tenant_name");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "CollaborationTenant");
        StringBuilder sb = new StringBuilder();
        sb.append(", tenant_id=");
        sb.append(this.tenant_id);
        sb.append(", tenant_name=");
        sb.append(this.tenant_name);
        if (this.tenant_user_count != null) {
            sb.append(", tenant_user_count=");
            sb.append(this.tenant_user_count);
        }
        StringBuilder replace = sb.replace(0, 2, "CollaborationTenant{");
        replace.append('}');
        return replace.toString();
    }

    public CollaborationTenant(String str, String str2, Integer num) {
        this(str, str2, num, ByteString.EMPTY);
    }

    public CollaborationTenant(String str, String str2, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.tenant_id = str;
        this.tenant_name = str2;
        this.tenant_user_count = num;
    }
}
