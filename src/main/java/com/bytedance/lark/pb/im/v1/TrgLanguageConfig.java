package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class TrgLanguageConfig extends Message<TrgLanguageConfig, C18121a> {
    public static final ProtoAdapter<TrgLanguageConfig> ADAPTER = new C18122b();
    private static final long serialVersionUID = 0;
    public final String default_locale;
    public final Map<String, String> i18n_language;
    public final String language;
    public final String translation_doc;

    /* renamed from: com.bytedance.lark.pb.im.v1.TrgLanguageConfig$b */
    private static final class C18122b extends ProtoAdapter<TrgLanguageConfig> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f45281a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C18122b() {
            super(FieldEncoding.LENGTH_DELIMITED, TrgLanguageConfig.class);
        }

        /* renamed from: a */
        public int encodedSize(TrgLanguageConfig trgLanguageConfig) {
            return this.f45281a.encodedSizeWithTag(1, trgLanguageConfig.i18n_language) + ProtoAdapter.STRING.encodedSizeWithTag(2, trgLanguageConfig.default_locale) + ProtoAdapter.STRING.encodedSizeWithTag(3, trgLanguageConfig.language) + ProtoAdapter.STRING.encodedSizeWithTag(4, trgLanguageConfig.translation_doc) + trgLanguageConfig.unknownFields().size();
        }

        /* renamed from: a */
        public TrgLanguageConfig decode(ProtoReader protoReader) throws IOException {
            C18121a aVar = new C18121a();
            aVar.f45278b = "en_us";
            aVar.f45279c = "";
            aVar.f45280d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45277a.putAll(this.f45281a.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f45278b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f45279c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45280d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TrgLanguageConfig trgLanguageConfig) throws IOException {
            this.f45281a.encodeWithTag(protoWriter, 1, trgLanguageConfig.i18n_language);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, trgLanguageConfig.default_locale);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, trgLanguageConfig.language);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, trgLanguageConfig.translation_doc);
            protoWriter.writeBytes(trgLanguageConfig.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.TrgLanguageConfig$a */
    public static final class C18121a extends Message.Builder<TrgLanguageConfig, C18121a> {

        /* renamed from: a */
        public Map<String, String> f45277a = Internal.newMutableMap();

        /* renamed from: b */
        public String f45278b;

        /* renamed from: c */
        public String f45279c;

        /* renamed from: d */
        public String f45280d;

        /* renamed from: a */
        public TrgLanguageConfig build() {
            String str;
            String str2;
            String str3 = this.f45278b;
            if (str3 != null && (str = this.f45279c) != null && (str2 = this.f45280d) != null) {
                return new TrgLanguageConfig(this.f45277a, str3, str, str2, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str3, "default_locale", this.f45279c, "language", this.f45280d, "translation_doc");
        }
    }

    @Override // com.squareup.wire.Message
    public C18121a newBuilder() {
        C18121a aVar = new C18121a();
        aVar.f45277a = Internal.copyOf("i18n_language", this.i18n_language);
        aVar.f45278b = this.default_locale;
        aVar.f45279c = this.language;
        aVar.f45280d = this.translation_doc;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "TrgLanguageConfig");
        StringBuilder sb = new StringBuilder();
        if (!this.i18n_language.isEmpty()) {
            sb.append(", i18n_language=");
            sb.append(this.i18n_language);
        }
        sb.append(", default_locale=");
        sb.append(this.default_locale);
        sb.append(", language=");
        sb.append(this.language);
        sb.append(", translation_doc=");
        sb.append(this.translation_doc);
        StringBuilder replace = sb.replace(0, 2, "TrgLanguageConfig{");
        replace.append('}');
        return replace.toString();
    }

    public TrgLanguageConfig(Map<String, String> map, String str, String str2, String str3) {
        this(map, str, str2, str3, ByteString.EMPTY);
    }

    public TrgLanguageConfig(Map<String, String> map, String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.i18n_language = Internal.immutableCopyOf("i18n_language", map);
        this.default_locale = str;
        this.language = str2;
        this.translation_doc = str3;
    }
}
