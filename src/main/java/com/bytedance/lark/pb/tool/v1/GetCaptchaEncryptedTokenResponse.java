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

public final class GetCaptchaEncryptedTokenResponse extends Message<GetCaptchaEncryptedTokenResponse, C19699a> {
    public static final ProtoAdapter<GetCaptchaEncryptedTokenResponse> ADAPTER = new C19700b();
    private static final long serialVersionUID = 0;
    public final String token;

    /* renamed from: com.bytedance.lark.pb.tool.v1.GetCaptchaEncryptedTokenResponse$b */
    private static final class C19700b extends ProtoAdapter<GetCaptchaEncryptedTokenResponse> {
        C19700b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCaptchaEncryptedTokenResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCaptchaEncryptedTokenResponse getCaptchaEncryptedTokenResponse) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getCaptchaEncryptedTokenResponse.token) + getCaptchaEncryptedTokenResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetCaptchaEncryptedTokenResponse decode(ProtoReader protoReader) throws IOException {
            C19699a aVar = new C19699a();
            aVar.f48158a = "";
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
                    aVar.f48158a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCaptchaEncryptedTokenResponse getCaptchaEncryptedTokenResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getCaptchaEncryptedTokenResponse.token);
            protoWriter.writeBytes(getCaptchaEncryptedTokenResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.GetCaptchaEncryptedTokenResponse$a */
    public static final class C19699a extends Message.Builder<GetCaptchaEncryptedTokenResponse, C19699a> {

        /* renamed from: a */
        public String f48158a;

        /* renamed from: a */
        public GetCaptchaEncryptedTokenResponse build() {
            String str = this.f48158a;
            if (str != null) {
                return new GetCaptchaEncryptedTokenResponse(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "token");
        }
    }

    @Override // com.squareup.wire.Message
    public C19699a newBuilder() {
        C19699a aVar = new C19699a();
        aVar.f48158a = this.token;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("tool", "GetCaptchaEncryptedTokenResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", token=");
        sb.append(this.token);
        StringBuilder replace = sb.replace(0, 2, "GetCaptchaEncryptedTokenResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetCaptchaEncryptedTokenResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetCaptchaEncryptedTokenResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.token = str;
    }
}
