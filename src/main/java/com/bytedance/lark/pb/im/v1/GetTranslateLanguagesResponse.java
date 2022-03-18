package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class GetTranslateLanguagesResponse extends Message<GetTranslateLanguagesResponse, C17731a> {
    public static final ProtoAdapter<GetTranslateLanguagesResponse> ADAPTER = new C17732b();
    public static final Boolean DEFAULT_AUTO_TRANSLATE_GLOBAL_SWITCH = false;
    public static final Integer DEFAULT_SWITCH_SCOPES = 0;
    private static final long serialVersionUID = 0;
    public final Boolean auto_translate_global_switch;
    public final List<String> dis_auto_translate_languages_conf;
    public final LanguagesConfiguration global_conf;
    public final List<String> image_language_keys;
    public final List<String> language_keys;
    public final Map<String, LanguagesConfiguration> languages_conf;
    public final Map<String, SrcLanguageConfig> src_languages_config;
    public final List<String> src_lanugages;
    public final Map<String, String> supported_languages;
    public final Integer switch_scopes;
    public final String target_language;
    public final Map<String, TrgLanguageConfig> trg_languages_config;
    public final List<String> web_language_keys;
    public final WebTranslationConfig web_translation_config;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetTranslateLanguagesResponse$a */
    public static final class C17731a extends Message.Builder<GetTranslateLanguagesResponse, C17731a> {

        /* renamed from: a */
        public String f44761a;

        /* renamed from: b */
        public List<String> f44762b = Internal.newMutableList();

        /* renamed from: c */
        public Map<String, String> f44763c = Internal.newMutableMap();

        /* renamed from: d */
        public Map<String, LanguagesConfiguration> f44764d = Internal.newMutableMap();

        /* renamed from: e */
        public LanguagesConfiguration f44765e;

        /* renamed from: f */
        public List<String> f44766f = Internal.newMutableList();

        /* renamed from: g */
        public Boolean f44767g;

        /* renamed from: h */
        public Integer f44768h;

        /* renamed from: i */
        public List<String> f44769i = Internal.newMutableList();

        /* renamed from: j */
        public Map<String, SrcLanguageConfig> f44770j = Internal.newMutableMap();

        /* renamed from: k */
        public WebTranslationConfig f44771k;

        /* renamed from: l */
        public Map<String, TrgLanguageConfig> f44772l = Internal.newMutableMap();

        /* renamed from: m */
        public List<String> f44773m = Internal.newMutableList();

        /* renamed from: n */
        public List<String> f44774n = Internal.newMutableList();

        /* renamed from: a */
        public GetTranslateLanguagesResponse build() {
            String str = this.f44761a;
            if (str != null) {
                return new GetTranslateLanguagesResponse(str, this.f44762b, this.f44763c, this.f44764d, this.f44765e, this.f44766f, this.f44767g, this.f44768h, this.f44769i, this.f44770j, this.f44771k, this.f44772l, this.f44773m, this.f44774n, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "target_language");
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetTranslateLanguagesResponse$b */
    private static final class C17732b extends ProtoAdapter<GetTranslateLanguagesResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f44775a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, LanguagesConfiguration>> f44776b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, LanguagesConfiguration.ADAPTER);

        /* renamed from: c */
        private final ProtoAdapter<Map<String, SrcLanguageConfig>> f44777c = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SrcLanguageConfig.ADAPTER);

        /* renamed from: d */
        private final ProtoAdapter<Map<String, TrgLanguageConfig>> f44778d = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, TrgLanguageConfig.ADAPTER);

        C17732b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTranslateLanguagesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTranslateLanguagesResponse getTranslateLanguagesResponse) {
            int i;
            int i2;
            int i3;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getTranslateLanguagesResponse.target_language) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, getTranslateLanguagesResponse.language_keys) + this.f44775a.encodedSizeWithTag(3, getTranslateLanguagesResponse.supported_languages) + this.f44776b.encodedSizeWithTag(4, getTranslateLanguagesResponse.languages_conf);
            int i4 = 0;
            if (getTranslateLanguagesResponse.global_conf != null) {
                i = LanguagesConfiguration.ADAPTER.encodedSizeWithTag(5, getTranslateLanguagesResponse.global_conf);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, getTranslateLanguagesResponse.dis_auto_translate_languages_conf);
            if (getTranslateLanguagesResponse.auto_translate_global_switch != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(7, getTranslateLanguagesResponse.auto_translate_global_switch);
            } else {
                i2 = 0;
            }
            int i5 = encodedSizeWithTag2 + i2;
            if (getTranslateLanguagesResponse.switch_scopes != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(8, getTranslateLanguagesResponse.switch_scopes);
            } else {
                i3 = 0;
            }
            int encodedSizeWithTag3 = i5 + i3 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(9, getTranslateLanguagesResponse.src_lanugages) + this.f44777c.encodedSizeWithTag(10, getTranslateLanguagesResponse.src_languages_config);
            if (getTranslateLanguagesResponse.web_translation_config != null) {
                i4 = WebTranslationConfig.ADAPTER.encodedSizeWithTag(11, getTranslateLanguagesResponse.web_translation_config);
            }
            return encodedSizeWithTag3 + i4 + this.f44778d.encodedSizeWithTag(12, getTranslateLanguagesResponse.trg_languages_config) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(13, getTranslateLanguagesResponse.image_language_keys) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(14, getTranslateLanguagesResponse.web_language_keys) + getTranslateLanguagesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetTranslateLanguagesResponse decode(ProtoReader protoReader) throws IOException {
            C17731a aVar = new C17731a();
            aVar.f44761a = "";
            aVar.f44767g = false;
            aVar.f44768h = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f44761a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f44762b.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            aVar.f44763c.putAll(this.f44775a.decode(protoReader));
                            break;
                        case 4:
                            aVar.f44764d.putAll(this.f44776b.decode(protoReader));
                            break;
                        case 5:
                            aVar.f44765e = LanguagesConfiguration.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f44766f.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            aVar.f44767g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            aVar.f44768h = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 9:
                            aVar.f44769i.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 10:
                            aVar.f44770j.putAll(this.f44777c.decode(protoReader));
                            break;
                        case 11:
                            aVar.f44771k = WebTranslationConfig.ADAPTER.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f44772l.putAll(this.f44778d.decode(protoReader));
                            break;
                        case 13:
                            aVar.f44773m.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 14:
                            aVar.f44774n.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetTranslateLanguagesResponse getTranslateLanguagesResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getTranslateLanguagesResponse.target_language);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, getTranslateLanguagesResponse.language_keys);
            this.f44775a.encodeWithTag(protoWriter, 3, getTranslateLanguagesResponse.supported_languages);
            this.f44776b.encodeWithTag(protoWriter, 4, getTranslateLanguagesResponse.languages_conf);
            if (getTranslateLanguagesResponse.global_conf != null) {
                LanguagesConfiguration.ADAPTER.encodeWithTag(protoWriter, 5, getTranslateLanguagesResponse.global_conf);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 6, getTranslateLanguagesResponse.dis_auto_translate_languages_conf);
            if (getTranslateLanguagesResponse.auto_translate_global_switch != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, getTranslateLanguagesResponse.auto_translate_global_switch);
            }
            if (getTranslateLanguagesResponse.switch_scopes != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, getTranslateLanguagesResponse.switch_scopes);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 9, getTranslateLanguagesResponse.src_lanugages);
            this.f44777c.encodeWithTag(protoWriter, 10, getTranslateLanguagesResponse.src_languages_config);
            if (getTranslateLanguagesResponse.web_translation_config != null) {
                WebTranslationConfig.ADAPTER.encodeWithTag(protoWriter, 11, getTranslateLanguagesResponse.web_translation_config);
            }
            this.f44778d.encodeWithTag(protoWriter, 12, getTranslateLanguagesResponse.trg_languages_config);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 13, getTranslateLanguagesResponse.image_language_keys);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 14, getTranslateLanguagesResponse.web_language_keys);
            protoWriter.writeBytes(getTranslateLanguagesResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17731a newBuilder() {
        C17731a aVar = new C17731a();
        aVar.f44761a = this.target_language;
        aVar.f44762b = Internal.copyOf("language_keys", this.language_keys);
        aVar.f44763c = Internal.copyOf("supported_languages", this.supported_languages);
        aVar.f44764d = Internal.copyOf("languages_conf", this.languages_conf);
        aVar.f44765e = this.global_conf;
        aVar.f44766f = Internal.copyOf("dis_auto_translate_languages_conf", this.dis_auto_translate_languages_conf);
        aVar.f44767g = this.auto_translate_global_switch;
        aVar.f44768h = this.switch_scopes;
        aVar.f44769i = Internal.copyOf("src_lanugages", this.src_lanugages);
        aVar.f44770j = Internal.copyOf("src_languages_config", this.src_languages_config);
        aVar.f44771k = this.web_translation_config;
        aVar.f44772l = Internal.copyOf("trg_languages_config", this.trg_languages_config);
        aVar.f44773m = Internal.copyOf("image_language_keys", this.image_language_keys);
        aVar.f44774n = Internal.copyOf("web_language_keys", this.web_language_keys);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetTranslateLanguagesResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", target_language=");
        sb.append(this.target_language);
        if (!this.language_keys.isEmpty()) {
            sb.append(", language_keys=");
            sb.append(this.language_keys);
        }
        if (!this.supported_languages.isEmpty()) {
            sb.append(", supported_languages=");
            sb.append(this.supported_languages);
        }
        if (!this.languages_conf.isEmpty()) {
            sb.append(", languages_conf=");
            sb.append(this.languages_conf);
        }
        if (this.global_conf != null) {
            sb.append(", global_conf=");
            sb.append(this.global_conf);
        }
        if (!this.dis_auto_translate_languages_conf.isEmpty()) {
            sb.append(", dis_auto_translate_languages_conf=");
            sb.append(this.dis_auto_translate_languages_conf);
        }
        if (this.auto_translate_global_switch != null) {
            sb.append(", auto_translate_global_switch=");
            sb.append(this.auto_translate_global_switch);
        }
        if (this.switch_scopes != null) {
            sb.append(", switch_scopes=");
            sb.append(this.switch_scopes);
        }
        if (!this.src_lanugages.isEmpty()) {
            sb.append(", src_lanugages=");
            sb.append(this.src_lanugages);
        }
        if (!this.src_languages_config.isEmpty()) {
            sb.append(", src_languages_config=");
            sb.append(this.src_languages_config);
        }
        if (this.web_translation_config != null) {
            sb.append(", web_translation_config=");
            sb.append(this.web_translation_config);
        }
        if (!this.trg_languages_config.isEmpty()) {
            sb.append(", trg_languages_config=");
            sb.append(this.trg_languages_config);
        }
        if (!this.image_language_keys.isEmpty()) {
            sb.append(", image_language_keys=");
            sb.append(this.image_language_keys);
        }
        if (!this.web_language_keys.isEmpty()) {
            sb.append(", web_language_keys=");
            sb.append(this.web_language_keys);
        }
        StringBuilder replace = sb.replace(0, 2, "GetTranslateLanguagesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetTranslateLanguagesResponse(String str, List<String> list, Map<String, String> map, Map<String, LanguagesConfiguration> map2, LanguagesConfiguration languagesConfiguration, List<String> list2, Boolean bool, Integer num, List<String> list3, Map<String, SrcLanguageConfig> map3, WebTranslationConfig webTranslationConfig, Map<String, TrgLanguageConfig> map4, List<String> list4, List<String> list5) {
        this(str, list, map, map2, languagesConfiguration, list2, bool, num, list3, map3, webTranslationConfig, map4, list4, list5, ByteString.EMPTY);
    }

    public GetTranslateLanguagesResponse(String str, List<String> list, Map<String, String> map, Map<String, LanguagesConfiguration> map2, LanguagesConfiguration languagesConfiguration, List<String> list2, Boolean bool, Integer num, List<String> list3, Map<String, SrcLanguageConfig> map3, WebTranslationConfig webTranslationConfig, Map<String, TrgLanguageConfig> map4, List<String> list4, List<String> list5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.target_language = str;
        this.language_keys = Internal.immutableCopyOf("language_keys", list);
        this.supported_languages = Internal.immutableCopyOf("supported_languages", map);
        this.languages_conf = Internal.immutableCopyOf("languages_conf", map2);
        this.global_conf = languagesConfiguration;
        this.dis_auto_translate_languages_conf = Internal.immutableCopyOf("dis_auto_translate_languages_conf", list2);
        this.auto_translate_global_switch = bool;
        this.switch_scopes = num;
        this.src_lanugages = Internal.immutableCopyOf("src_lanugages", list3);
        this.src_languages_config = Internal.immutableCopyOf("src_languages_config", map3);
        this.web_translation_config = webTranslationConfig;
        this.trg_languages_config = Internal.immutableCopyOf("trg_languages_config", map4);
        this.image_language_keys = Internal.immutableCopyOf("image_language_keys", list4);
        this.web_language_keys = Internal.immutableCopyOf("web_language_keys", list5);
    }
}
