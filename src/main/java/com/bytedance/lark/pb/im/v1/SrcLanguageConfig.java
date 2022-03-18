package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.DisplayRule;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class SrcLanguageConfig extends Message<SrcLanguageConfig, C18079a> {
    public static final ProtoAdapter<SrcLanguageConfig> ADAPTER = new C18080b();
    public static final DisplayRule DEFAULT_RULE = DisplayRule.ONLY_TRANSLATION;
    public static final Integer DEFAULT_SCOPES = 0;
    private static final long serialVersionUID = 0;
    public final String default_locale;
    public final Map<String, String> i18n_language;
    public final String language;
    public final DisplayRule rule;
    public final Integer scopes;

    /* renamed from: com.bytedance.lark.pb.im.v1.SrcLanguageConfig$b */
    private static final class C18080b extends ProtoAdapter<SrcLanguageConfig> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f45210a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C18080b() {
            super(FieldEncoding.LENGTH_DELIMITED, SrcLanguageConfig.class);
        }

        /* renamed from: a */
        public int encodedSize(SrcLanguageConfig srcLanguageConfig) {
            return this.f45210a.encodedSizeWithTag(1, srcLanguageConfig.i18n_language) + ProtoAdapter.STRING.encodedSizeWithTag(2, srcLanguageConfig.default_locale) + ProtoAdapter.STRING.encodedSizeWithTag(3, srcLanguageConfig.language) + ProtoAdapter.INT32.encodedSizeWithTag(4, srcLanguageConfig.scopes) + DisplayRule.ADAPTER.encodedSizeWithTag(5, srcLanguageConfig.rule) + srcLanguageConfig.unknownFields().size();
        }

        /* renamed from: a */
        public SrcLanguageConfig decode(ProtoReader protoReader) throws IOException {
            C18079a aVar = new C18079a();
            aVar.f45206b = "en_us";
            aVar.f45207c = "";
            aVar.f45208d = 0;
            aVar.f45209e = DisplayRule.ONLY_TRANSLATION;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45205a.putAll(this.f45210a.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f45206b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f45207c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f45208d = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f45209e = DisplayRule.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SrcLanguageConfig srcLanguageConfig) throws IOException {
            this.f45210a.encodeWithTag(protoWriter, 1, srcLanguageConfig.i18n_language);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, srcLanguageConfig.default_locale);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, srcLanguageConfig.language);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, srcLanguageConfig.scopes);
            DisplayRule.ADAPTER.encodeWithTag(protoWriter, 5, srcLanguageConfig.rule);
            protoWriter.writeBytes(srcLanguageConfig.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18079a newBuilder() {
        C18079a aVar = new C18079a();
        aVar.f45205a = Internal.copyOf("i18n_language", this.i18n_language);
        aVar.f45206b = this.default_locale;
        aVar.f45207c = this.language;
        aVar.f45208d = this.scopes;
        aVar.f45209e = this.rule;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.SrcLanguageConfig$a */
    public static final class C18079a extends Message.Builder<SrcLanguageConfig, C18079a> {

        /* renamed from: a */
        public Map<String, String> f45205a = Internal.newMutableMap();

        /* renamed from: b */
        public String f45206b;

        /* renamed from: c */
        public String f45207c;

        /* renamed from: d */
        public Integer f45208d;

        /* renamed from: e */
        public DisplayRule f45209e;

        /* renamed from: a */
        public SrcLanguageConfig build() {
            String str;
            Integer num;
            DisplayRule displayRule;
            String str2 = this.f45206b;
            if (str2 != null && (str = this.f45207c) != null && (num = this.f45208d) != null && (displayRule = this.f45209e) != null) {
                return new SrcLanguageConfig(this.f45205a, str2, str, num, displayRule, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "default_locale", this.f45207c, "language", this.f45208d, "scopes", this.f45209e, "rule");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "SrcLanguageConfig");
        StringBuilder sb = new StringBuilder();
        if (!this.i18n_language.isEmpty()) {
            sb.append(", i18n_language=");
            sb.append(this.i18n_language);
        }
        sb.append(", default_locale=");
        sb.append(this.default_locale);
        sb.append(", language=");
        sb.append(this.language);
        sb.append(", scopes=");
        sb.append(this.scopes);
        sb.append(", rule=");
        sb.append(this.rule);
        StringBuilder replace = sb.replace(0, 2, "SrcLanguageConfig{");
        replace.append('}');
        return replace.toString();
    }

    public SrcLanguageConfig(Map<String, String> map, String str, String str2, Integer num, DisplayRule displayRule) {
        this(map, str, str2, num, displayRule, ByteString.EMPTY);
    }

    public SrcLanguageConfig(Map<String, String> map, String str, String str2, Integer num, DisplayRule displayRule, ByteString byteString) {
        super(ADAPTER, byteString);
        this.i18n_language = Internal.immutableCopyOf("i18n_language", map);
        this.default_locale = str;
        this.language = str2;
        this.scopes = num;
        this.rule = displayRule;
    }
}
