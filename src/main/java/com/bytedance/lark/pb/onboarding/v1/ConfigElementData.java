package com.bytedance.lark.pb.onboarding.v1;

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

public final class ConfigElementData extends Message<ConfigElementData, C18572a> {
    public static final ProtoAdapter<ConfigElementData> ADAPTER = new C18573b();
    private static final long serialVersionUID = 0;
    public final Map<String, String> configs;

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.ConfigElementData$a */
    public static final class C18572a extends Message.Builder<ConfigElementData, C18572a> {

        /* renamed from: a */
        public Map<String, String> f46068a = Internal.newMutableMap();

        /* renamed from: a */
        public ConfigElementData build() {
            return new ConfigElementData(this.f46068a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.ConfigElementData$b */
    private static final class C18573b extends ProtoAdapter<ConfigElementData> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f46069a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C18573b() {
            super(FieldEncoding.LENGTH_DELIMITED, ConfigElementData.class);
        }

        /* renamed from: a */
        public int encodedSize(ConfigElementData configElementData) {
            return this.f46069a.encodedSizeWithTag(1, configElementData.configs) + configElementData.unknownFields().size();
        }

        /* renamed from: a */
        public ConfigElementData decode(ProtoReader protoReader) throws IOException {
            C18572a aVar = new C18572a();
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
                    aVar.f46068a.putAll(this.f46069a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ConfigElementData configElementData) throws IOException {
            this.f46069a.encodeWithTag(protoWriter, 1, configElementData.configs);
            protoWriter.writeBytes(configElementData.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18572a newBuilder() {
        C18572a aVar = new C18572a();
        aVar.f46068a = Internal.copyOf("configs", this.configs);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("onboarding", "ConfigElementData");
        StringBuilder sb = new StringBuilder();
        if (!this.configs.isEmpty()) {
            sb.append(", configs=");
            sb.append(this.configs);
        }
        StringBuilder replace = sb.replace(0, 2, "ConfigElementData{");
        replace.append('}');
        return replace.toString();
    }

    public ConfigElementData(Map<String, String> map) {
        this(map, ByteString.EMPTY);
    }

    public ConfigElementData(Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.configs = Internal.immutableCopyOf("configs", map);
    }
}
