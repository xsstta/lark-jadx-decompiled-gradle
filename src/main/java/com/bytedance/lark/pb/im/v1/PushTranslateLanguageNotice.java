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
import java.util.Map;
import okio.ByteString;

public final class PushTranslateLanguageNotice extends Message<PushTranslateLanguageNotice, C17963a> {
    public static final ProtoAdapter<PushTranslateLanguageNotice> ADAPTER = new C17964b();
    private static final long serialVersionUID = 0;
    public final List<String> language_keys;
    public final Map<String, String> supported_languages;
    public final String target_language;

    /* renamed from: com.bytedance.lark.pb.im.v1.PushTranslateLanguageNotice$b */
    private static final class C17964b extends ProtoAdapter<PushTranslateLanguageNotice> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f45056a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C17964b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushTranslateLanguageNotice.class);
        }

        /* renamed from: a */
        public int encodedSize(PushTranslateLanguageNotice pushTranslateLanguageNotice) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, pushTranslateLanguageNotice.target_language) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, pushTranslateLanguageNotice.language_keys) + this.f45056a.encodedSizeWithTag(3, pushTranslateLanguageNotice.supported_languages) + pushTranslateLanguageNotice.unknownFields().size();
        }

        /* renamed from: a */
        public PushTranslateLanguageNotice decode(ProtoReader protoReader) throws IOException {
            C17963a aVar = new C17963a();
            aVar.f45053a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45053a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45054b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45055c.putAll(this.f45056a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushTranslateLanguageNotice pushTranslateLanguageNotice) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushTranslateLanguageNotice.target_language);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, pushTranslateLanguageNotice.language_keys);
            this.f45056a.encodeWithTag(protoWriter, 3, pushTranslateLanguageNotice.supported_languages);
            protoWriter.writeBytes(pushTranslateLanguageNotice.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushTranslateLanguageNotice$a */
    public static final class C17963a extends Message.Builder<PushTranslateLanguageNotice, C17963a> {

        /* renamed from: a */
        public String f45053a;

        /* renamed from: b */
        public List<String> f45054b = Internal.newMutableList();

        /* renamed from: c */
        public Map<String, String> f45055c = Internal.newMutableMap();

        /* renamed from: a */
        public PushTranslateLanguageNotice build() {
            String str = this.f45053a;
            if (str != null) {
                return new PushTranslateLanguageNotice(str, this.f45054b, this.f45055c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "target_language");
        }
    }

    @Override // com.squareup.wire.Message
    public C17963a newBuilder() {
        C17963a aVar = new C17963a();
        aVar.f45053a = this.target_language;
        aVar.f45054b = Internal.copyOf("language_keys", this.language_keys);
        aVar.f45055c = Internal.copyOf("supported_languages", this.supported_languages);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushTranslateLanguageNotice");
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
        StringBuilder replace = sb.replace(0, 2, "PushTranslateLanguageNotice{");
        replace.append('}');
        return replace.toString();
    }

    public PushTranslateLanguageNotice(String str, List<String> list, Map<String, String> map) {
        this(str, list, map, ByteString.EMPTY);
    }

    public PushTranslateLanguageNotice(String str, List<String> list, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.target_language = str;
        this.language_keys = Internal.immutableCopyOf("language_keys", list);
        this.supported_languages = Internal.immutableCopyOf("supported_languages", map);
    }
}
