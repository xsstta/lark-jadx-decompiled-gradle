package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PatchWebTranslationConfigRequest extends Message<PatchWebTranslationConfigRequest, C17849a> {
    public static final ProtoAdapter<PatchWebTranslationConfigRequest> ADAPTER = new C17850b();
    private static final long serialVersionUID = 0;
    public final WebTranslationConfig web_translation_config;

    /* renamed from: com.bytedance.lark.pb.im.v1.PatchWebTranslationConfigRequest$b */
    private static final class C17850b extends ProtoAdapter<PatchWebTranslationConfigRequest> {
        C17850b() {
            super(FieldEncoding.LENGTH_DELIMITED, PatchWebTranslationConfigRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PatchWebTranslationConfigRequest patchWebTranslationConfigRequest) {
            return WebTranslationConfig.ADAPTER.encodedSizeWithTag(1, patchWebTranslationConfigRequest.web_translation_config) + patchWebTranslationConfigRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PatchWebTranslationConfigRequest decode(ProtoReader protoReader) throws IOException {
            C17849a aVar = new C17849a();
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
                    aVar.f44915a = WebTranslationConfig.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PatchWebTranslationConfigRequest patchWebTranslationConfigRequest) throws IOException {
            WebTranslationConfig.ADAPTER.encodeWithTag(protoWriter, 1, patchWebTranslationConfigRequest.web_translation_config);
            protoWriter.writeBytes(patchWebTranslationConfigRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PatchWebTranslationConfigRequest$a */
    public static final class C17849a extends Message.Builder<PatchWebTranslationConfigRequest, C17849a> {

        /* renamed from: a */
        public WebTranslationConfig f44915a;

        /* renamed from: a */
        public PatchWebTranslationConfigRequest build() {
            WebTranslationConfig webTranslationConfig = this.f44915a;
            if (webTranslationConfig != null) {
                return new PatchWebTranslationConfigRequest(webTranslationConfig, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(webTranslationConfig, "web_translation_config");
        }

        /* renamed from: a */
        public C17849a mo62204a(WebTranslationConfig webTranslationConfig) {
            this.f44915a = webTranslationConfig;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17849a newBuilder() {
        C17849a aVar = new C17849a();
        aVar.f44915a = this.web_translation_config;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PatchWebTranslationConfigRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", web_translation_config=");
        sb.append(this.web_translation_config);
        StringBuilder replace = sb.replace(0, 2, "PatchWebTranslationConfigRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PatchWebTranslationConfigRequest(WebTranslationConfig webTranslationConfig) {
        this(webTranslationConfig, ByteString.EMPTY);
    }

    public PatchWebTranslationConfigRequest(WebTranslationConfig webTranslationConfig, ByteString byteString) {
        super(ADAPTER, byteString);
        this.web_translation_config = webTranslationConfig;
    }
}
