package com.bytedance.lark.pb.security.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SecuritySdkSetupRequest extends Message<SecuritySdkSetupRequest, C19129a> {
    public static final ProtoAdapter<SecuritySdkSetupRequest> ADAPTER = new C19130b();
    public static final Long DEFAULT_USER_ID = 0L;
    private static final long serialVersionUID = 0;
    public final String device_id;
    public final String security_workspace_path;
    public final String session;
    public final Long user_id;

    /* renamed from: com.bytedance.lark.pb.security.v1.SecuritySdkSetupRequest$b */
    private static final class C19130b extends ProtoAdapter<SecuritySdkSetupRequest> {
        C19130b() {
            super(FieldEncoding.LENGTH_DELIMITED, SecuritySdkSetupRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SecuritySdkSetupRequest securitySdkSetupRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, securitySdkSetupRequest.security_workspace_path) + ProtoAdapter.STRING.encodedSizeWithTag(2, securitySdkSetupRequest.device_id) + ProtoAdapter.INT64.encodedSizeWithTag(3, securitySdkSetupRequest.user_id) + ProtoAdapter.STRING.encodedSizeWithTag(4, securitySdkSetupRequest.session) + securitySdkSetupRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SecuritySdkSetupRequest decode(ProtoReader protoReader) throws IOException {
            C19129a aVar = new C19129a();
            aVar.f47268a = "";
            aVar.f47269b = "";
            aVar.f47270c = 0L;
            aVar.f47271d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47268a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f47269b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f47270c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47271d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SecuritySdkSetupRequest securitySdkSetupRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, securitySdkSetupRequest.security_workspace_path);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, securitySdkSetupRequest.device_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, securitySdkSetupRequest.user_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, securitySdkSetupRequest.session);
            protoWriter.writeBytes(securitySdkSetupRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19129a newBuilder() {
        C19129a aVar = new C19129a();
        aVar.f47268a = this.security_workspace_path;
        aVar.f47269b = this.device_id;
        aVar.f47270c = this.user_id;
        aVar.f47271d = this.session;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.security.v1.SecuritySdkSetupRequest$a */
    public static final class C19129a extends Message.Builder<SecuritySdkSetupRequest, C19129a> {

        /* renamed from: a */
        public String f47268a;

        /* renamed from: b */
        public String f47269b;

        /* renamed from: c */
        public Long f47270c;

        /* renamed from: d */
        public String f47271d;

        /* renamed from: a */
        public SecuritySdkSetupRequest build() {
            String str;
            Long l;
            String str2;
            String str3 = this.f47268a;
            if (str3 != null && (str = this.f47269b) != null && (l = this.f47270c) != null && (str2 = this.f47271d) != null) {
                return new SecuritySdkSetupRequest(str3, str, l, str2, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str3, "security_workspace_path", this.f47269b, "device_id", this.f47270c, "user_id", this.f47271d, "session");
        }

        /* renamed from: a */
        public C19129a mo65399a(Long l) {
            this.f47270c = l;
            return this;
        }

        /* renamed from: b */
        public C19129a mo65402b(String str) {
            this.f47269b = str;
            return this;
        }

        /* renamed from: c */
        public C19129a mo65403c(String str) {
            this.f47271d = str;
            return this;
        }

        /* renamed from: a */
        public C19129a mo65400a(String str) {
            this.f47268a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("security", "SecuritySdkSetupRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", security_workspace_path=");
        sb.append(this.security_workspace_path);
        sb.append(", device_id=");
        sb.append(this.device_id);
        sb.append(", user_id=");
        sb.append(this.user_id);
        sb.append(", session=");
        sb.append(this.session);
        StringBuilder replace = sb.replace(0, 2, "SecuritySdkSetupRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SecuritySdkSetupRequest(String str, String str2, Long l, String str3) {
        this(str, str2, l, str3, ByteString.EMPTY);
    }

    public SecuritySdkSetupRequest(String str, String str2, Long l, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.security_workspace_path = str;
        this.device_id = str2;
        this.user_id = l;
        this.session = str3;
    }
}
