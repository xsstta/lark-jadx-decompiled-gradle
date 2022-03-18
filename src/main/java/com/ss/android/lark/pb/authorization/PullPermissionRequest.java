package com.ss.android.lark.pb.authorization;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PullPermissionRequest extends Message<PullPermissionRequest, C49558a> {
    public static final ProtoAdapter<PullPermissionRequest> ADAPTER = new C49559b();
    public static final Long DEFAULT_APP_ID = 0L;
    private static final long serialVersionUID = 0;
    public final String mapi_version;
    public final Long mapp_id;
    public final String mperm_version;

    /* renamed from: com.ss.android.lark.pb.authorization.PullPermissionRequest$b */
    private static final class C49559b extends ProtoAdapter<PullPermissionRequest> {
        C49559b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullPermissionRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullPermissionRequest pullPermissionRequest) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, pullPermissionRequest.mapp_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, pullPermissionRequest.mapi_version) + ProtoAdapter.STRING.encodedSizeWithTag(3, pullPermissionRequest.mperm_version) + pullPermissionRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullPermissionRequest decode(ProtoReader protoReader) throws IOException {
            C49558a aVar = new C49558a();
            aVar.f124171a = 0L;
            aVar.f124172b = "";
            aVar.f124173c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124171a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124172b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124173c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullPermissionRequest pullPermissionRequest) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, pullPermissionRequest.mapp_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pullPermissionRequest.mapi_version);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, pullPermissionRequest.mperm_version);
            protoWriter.writeBytes(pullPermissionRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49558a newBuilder() {
        C49558a aVar = new C49558a();
        aVar.f124171a = this.mapp_id;
        aVar.f124172b = this.mapi_version;
        aVar.f124173c = this.mperm_version;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.authorization.PullPermissionRequest$a */
    public static final class C49558a extends Message.Builder<PullPermissionRequest, C49558a> {

        /* renamed from: a */
        public Long f124171a;

        /* renamed from: b */
        public String f124172b;

        /* renamed from: c */
        public String f124173c;

        /* renamed from: a */
        public PullPermissionRequest build() {
            String str;
            String str2;
            Long l = this.f124171a;
            if (l != null && (str = this.f124172b) != null && (str2 = this.f124173c) != null) {
                return new PullPermissionRequest(l, str, str2, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l, "mapp_id", this.f124172b, "mapi_version", this.f124173c, "mperm_version");
        }

        /* renamed from: a */
        public C49558a mo172820a(Long l) {
            this.f124171a = l;
            return this;
        }

        /* renamed from: b */
        public C49558a mo172823b(String str) {
            this.f124173c = str;
            return this;
        }

        /* renamed from: a */
        public C49558a mo172821a(String str) {
            this.f124172b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", app_id=");
        sb.append(this.mapp_id);
        sb.append(", api_version=");
        sb.append(this.mapi_version);
        sb.append(", perm_version=");
        sb.append(this.mperm_version);
        StringBuilder replace = sb.replace(0, 2, "PullPermissionRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullPermissionRequest(Long l, String str, String str2) {
        this(l, str, str2, ByteString.EMPTY);
    }

    public PullPermissionRequest(Long l, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mapp_id = l;
        this.mapi_version = str;
        this.mperm_version = str2;
    }
}
