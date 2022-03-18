package com.bytedance.lark.pb.im.v1;

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

public final class WebTranslationConfig extends Message<WebTranslationConfig, C18176a> {
    public static final ProtoAdapter<WebTranslationConfig> ADAPTER = new C18177b();
    private static final long serialVersionUID = 0;
    public final List<String> black_domains;

    /* renamed from: com.bytedance.lark.pb.im.v1.WebTranslationConfig$b */
    private static final class C18177b extends ProtoAdapter<WebTranslationConfig> {
        C18177b() {
            super(FieldEncoding.LENGTH_DELIMITED, WebTranslationConfig.class);
        }

        /* renamed from: a */
        public int encodedSize(WebTranslationConfig webTranslationConfig) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, webTranslationConfig.black_domains) + webTranslationConfig.unknownFields().size();
        }

        /* renamed from: a */
        public WebTranslationConfig decode(ProtoReader protoReader) throws IOException {
            C18176a aVar = new C18176a();
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
                    aVar.f45386a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, WebTranslationConfig webTranslationConfig) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, webTranslationConfig.black_domains);
            protoWriter.writeBytes(webTranslationConfig.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.WebTranslationConfig$a */
    public static final class C18176a extends Message.Builder<WebTranslationConfig, C18176a> {

        /* renamed from: a */
        public List<String> f45386a = Internal.newMutableList();

        /* renamed from: a */
        public WebTranslationConfig build() {
            return new WebTranslationConfig(this.f45386a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18176a mo63033a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f45386a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18176a newBuilder() {
        C18176a aVar = new C18176a();
        aVar.f45386a = Internal.copyOf("black_domains", this.black_domains);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "WebTranslationConfig");
        StringBuilder sb = new StringBuilder();
        if (!this.black_domains.isEmpty()) {
            sb.append(", black_domains=");
            sb.append(this.black_domains);
        }
        StringBuilder replace = sb.replace(0, 2, "WebTranslationConfig{");
        replace.append('}');
        return replace.toString();
    }

    public WebTranslationConfig(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public WebTranslationConfig(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.black_domains = Internal.immutableCopyOf("black_domains", list);
    }
}
