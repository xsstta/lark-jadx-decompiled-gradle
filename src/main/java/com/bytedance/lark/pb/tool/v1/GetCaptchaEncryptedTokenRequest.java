package com.bytedance.lark.pb.tool.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetCaptchaEncryptedTokenRequest extends Message<GetCaptchaEncryptedTokenRequest, C19697a> {
    public static final ProtoAdapter<GetCaptchaEncryptedTokenRequest> ADAPTER = new C19698b();
    private static final long serialVersionUID = 0;
    public final String app_version;
    public final String device_platform;
    public final String method;
    public final String request_body;

    /* renamed from: com.bytedance.lark.pb.tool.v1.GetCaptchaEncryptedTokenRequest$b */
    private static final class C19698b extends ProtoAdapter<GetCaptchaEncryptedTokenRequest> {
        C19698b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCaptchaEncryptedTokenRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCaptchaEncryptedTokenRequest getCaptchaEncryptedTokenRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getCaptchaEncryptedTokenRequest.method) + ProtoAdapter.STRING.encodedSizeWithTag(2, getCaptchaEncryptedTokenRequest.request_body) + ProtoAdapter.STRING.encodedSizeWithTag(3, getCaptchaEncryptedTokenRequest.app_version) + ProtoAdapter.STRING.encodedSizeWithTag(4, getCaptchaEncryptedTokenRequest.device_platform) + getCaptchaEncryptedTokenRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetCaptchaEncryptedTokenRequest decode(ProtoReader protoReader) throws IOException {
            C19697a aVar = new C19697a();
            aVar.f48154a = "";
            aVar.f48155b = "";
            aVar.f48156c = "";
            aVar.f48157d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48154a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f48155b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f48156c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48157d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCaptchaEncryptedTokenRequest getCaptchaEncryptedTokenRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getCaptchaEncryptedTokenRequest.method);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getCaptchaEncryptedTokenRequest.request_body);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getCaptchaEncryptedTokenRequest.app_version);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getCaptchaEncryptedTokenRequest.device_platform);
            protoWriter.writeBytes(getCaptchaEncryptedTokenRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19697a newBuilder() {
        C19697a aVar = new C19697a();
        aVar.f48154a = this.method;
        aVar.f48155b = this.request_body;
        aVar.f48156c = this.app_version;
        aVar.f48157d = this.device_platform;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.GetCaptchaEncryptedTokenRequest$a */
    public static final class C19697a extends Message.Builder<GetCaptchaEncryptedTokenRequest, C19697a> {

        /* renamed from: a */
        public String f48154a;

        /* renamed from: b */
        public String f48155b;

        /* renamed from: c */
        public String f48156c;

        /* renamed from: d */
        public String f48157d;

        /* renamed from: a */
        public GetCaptchaEncryptedTokenRequest build() {
            String str;
            String str2;
            String str3;
            String str4 = this.f48154a;
            if (str4 != null && (str = this.f48155b) != null && (str2 = this.f48156c) != null && (str3 = this.f48157d) != null) {
                return new GetCaptchaEncryptedTokenRequest(str4, str, str2, str3, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str4, "method", this.f48155b, "request_body", this.f48156c, "app_version", this.f48157d, "device_platform");
        }

        /* renamed from: a */
        public C19697a mo66780a(String str) {
            this.f48154a = str;
            return this;
        }

        /* renamed from: b */
        public C19697a mo66782b(String str) {
            this.f48155b = str;
            return this;
        }

        /* renamed from: c */
        public C19697a mo66783c(String str) {
            this.f48156c = str;
            return this;
        }

        /* renamed from: d */
        public C19697a mo66784d(String str) {
            this.f48157d = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("tool", "GetCaptchaEncryptedTokenRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", method=");
        sb.append(this.method);
        sb.append(", request_body=");
        sb.append(this.request_body);
        sb.append(", app_version=");
        sb.append(this.app_version);
        sb.append(", device_platform=");
        sb.append(this.device_platform);
        StringBuilder replace = sb.replace(0, 2, "GetCaptchaEncryptedTokenRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetCaptchaEncryptedTokenRequest(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, ByteString.EMPTY);
    }

    public GetCaptchaEncryptedTokenRequest(String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.method = str;
        this.request_body = str2;
        this.app_version = str3;
        this.device_platform = str4;
    }
}
