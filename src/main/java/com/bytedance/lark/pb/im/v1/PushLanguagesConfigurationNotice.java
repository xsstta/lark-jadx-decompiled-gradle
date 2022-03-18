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

public final class PushLanguagesConfigurationNotice extends Message<PushLanguagesConfigurationNotice, C17903a> {
    public static final ProtoAdapter<PushLanguagesConfigurationNotice> ADAPTER = new C17904b();
    private static final long serialVersionUID = 0;
    public final LanguagesConfiguration global_language_config;
    public final Map<String, LanguagesConfiguration> languages_config;

    /* renamed from: com.bytedance.lark.pb.im.v1.PushLanguagesConfigurationNotice$a */
    public static final class C17903a extends Message.Builder<PushLanguagesConfigurationNotice, C17903a> {

        /* renamed from: a */
        public Map<String, LanguagesConfiguration> f44983a = Internal.newMutableMap();

        /* renamed from: b */
        public LanguagesConfiguration f44984b;

        /* renamed from: a */
        public PushLanguagesConfigurationNotice build() {
            return new PushLanguagesConfigurationNotice(this.f44983a, this.f44984b, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushLanguagesConfigurationNotice$b */
    private static final class C17904b extends ProtoAdapter<PushLanguagesConfigurationNotice> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, LanguagesConfiguration>> f44985a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, LanguagesConfiguration.ADAPTER);

        C17904b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushLanguagesConfigurationNotice.class);
        }

        /* renamed from: a */
        public int encodedSize(PushLanguagesConfigurationNotice pushLanguagesConfigurationNotice) {
            int i;
            int encodedSizeWithTag = this.f44985a.encodedSizeWithTag(1, pushLanguagesConfigurationNotice.languages_config);
            if (pushLanguagesConfigurationNotice.global_language_config != null) {
                i = LanguagesConfiguration.ADAPTER.encodedSizeWithTag(2, pushLanguagesConfigurationNotice.global_language_config);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + pushLanguagesConfigurationNotice.unknownFields().size();
        }

        /* renamed from: a */
        public PushLanguagesConfigurationNotice decode(ProtoReader protoReader) throws IOException {
            C17903a aVar = new C17903a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44983a.putAll(this.f44985a.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44984b = LanguagesConfiguration.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushLanguagesConfigurationNotice pushLanguagesConfigurationNotice) throws IOException {
            this.f44985a.encodeWithTag(protoWriter, 1, pushLanguagesConfigurationNotice.languages_config);
            if (pushLanguagesConfigurationNotice.global_language_config != null) {
                LanguagesConfiguration.ADAPTER.encodeWithTag(protoWriter, 2, pushLanguagesConfigurationNotice.global_language_config);
            }
            protoWriter.writeBytes(pushLanguagesConfigurationNotice.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17903a newBuilder() {
        C17903a aVar = new C17903a();
        aVar.f44983a = Internal.copyOf("languages_config", this.languages_config);
        aVar.f44984b = this.global_language_config;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushLanguagesConfigurationNotice");
        StringBuilder sb = new StringBuilder();
        if (!this.languages_config.isEmpty()) {
            sb.append(", languages_config=");
            sb.append(this.languages_config);
        }
        if (this.global_language_config != null) {
            sb.append(", global_language_config=");
            sb.append(this.global_language_config);
        }
        StringBuilder replace = sb.replace(0, 2, "PushLanguagesConfigurationNotice{");
        replace.append('}');
        return replace.toString();
    }

    public PushLanguagesConfigurationNotice(Map<String, LanguagesConfiguration> map, LanguagesConfiguration languagesConfiguration) {
        this(map, languagesConfiguration, ByteString.EMPTY);
    }

    public PushLanguagesConfigurationNotice(Map<String, LanguagesConfiguration> map, LanguagesConfiguration languagesConfiguration, ByteString byteString) {
        super(ADAPTER, byteString);
        this.languages_config = Internal.immutableCopyOf("languages_config", map);
        this.global_language_config = languagesConfiguration;
    }
}
