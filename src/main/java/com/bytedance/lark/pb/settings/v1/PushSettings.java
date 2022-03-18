package com.bytedance.lark.pb.settings.v1;

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

public final class PushSettings extends Message<PushSettings, C19189a> {
    public static final ProtoAdapter<PushSettings> ADAPTER = new C19190b();
    private static final long serialVersionUID = 0;
    public final Map<String, String> field_groups;

    /* renamed from: com.bytedance.lark.pb.settings.v1.PushSettings$a */
    public static final class C19189a extends Message.Builder<PushSettings, C19189a> {

        /* renamed from: a */
        public Map<String, String> f47346a = Internal.newMutableMap();

        /* renamed from: a */
        public PushSettings build() {
            return new PushSettings(this.f47346a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.PushSettings$b */
    private static final class C19190b extends ProtoAdapter<PushSettings> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f47347a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C19190b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushSettings.class);
        }

        /* renamed from: a */
        public int encodedSize(PushSettings pushSettings) {
            return this.f47347a.encodedSizeWithTag(1, pushSettings.field_groups) + pushSettings.unknownFields().size();
        }

        /* renamed from: a */
        public PushSettings decode(ProtoReader protoReader) throws IOException {
            C19189a aVar = new C19189a();
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
                    aVar.f47346a.putAll(this.f47347a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushSettings pushSettings) throws IOException {
            this.f47347a.encodeWithTag(protoWriter, 1, pushSettings.field_groups);
            protoWriter.writeBytes(pushSettings.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19189a newBuilder() {
        C19189a aVar = new C19189a();
        aVar.f47346a = Internal.copyOf("field_groups", this.field_groups);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "PushSettings");
        StringBuilder sb = new StringBuilder();
        if (!this.field_groups.isEmpty()) {
            sb.append(", field_groups=");
            sb.append(this.field_groups);
        }
        StringBuilder replace = sb.replace(0, 2, "PushSettings{");
        replace.append('}');
        return replace.toString();
    }

    public PushSettings(Map<String, String> map) {
        this(map, ByteString.EMPTY);
    }

    public PushSettings(Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.field_groups = Internal.immutableCopyOf("field_groups", map);
    }
}
