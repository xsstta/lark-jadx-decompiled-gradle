package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.UniversalUserSetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class PushUniversalUserSetting extends Message<PushUniversalUserSetting, C19191a> {
    public static final ProtoAdapter<PushUniversalUserSetting> ADAPTER = new C19192b();
    private static final long serialVersionUID = 0;
    public final Map<String, UniversalUserSetting> settings;

    /* renamed from: com.bytedance.lark.pb.settings.v1.PushUniversalUserSetting$a */
    public static final class C19191a extends Message.Builder<PushUniversalUserSetting, C19191a> {

        /* renamed from: a */
        public Map<String, UniversalUserSetting> f47348a = Internal.newMutableMap();

        /* renamed from: a */
        public PushUniversalUserSetting build() {
            return new PushUniversalUserSetting(this.f47348a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.PushUniversalUserSetting$b */
    private static final class C19192b extends ProtoAdapter<PushUniversalUserSetting> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, UniversalUserSetting>> f47349a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, UniversalUserSetting.ADAPTER);

        C19192b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushUniversalUserSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(PushUniversalUserSetting pushUniversalUserSetting) {
            return this.f47349a.encodedSizeWithTag(1, pushUniversalUserSetting.settings) + pushUniversalUserSetting.unknownFields().size();
        }

        /* renamed from: a */
        public PushUniversalUserSetting decode(ProtoReader protoReader) throws IOException {
            C19191a aVar = new C19191a();
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
                    aVar.f47348a.putAll(this.f47349a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushUniversalUserSetting pushUniversalUserSetting) throws IOException {
            this.f47349a.encodeWithTag(protoWriter, 1, pushUniversalUserSetting.settings);
            protoWriter.writeBytes(pushUniversalUserSetting.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19191a newBuilder() {
        C19191a aVar = new C19191a();
        aVar.f47348a = Internal.copyOf("settings", this.settings);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "PushUniversalUserSetting");
        StringBuilder sb = new StringBuilder();
        if (!this.settings.isEmpty()) {
            sb.append(", settings=");
            sb.append(this.settings);
        }
        StringBuilder replace = sb.replace(0, 2, "PushUniversalUserSetting{");
        replace.append('}');
        return replace.toString();
    }

    public PushUniversalUserSetting(Map<String, UniversalUserSetting> map) {
        this(map, ByteString.EMPTY);
    }

    public PushUniversalUserSetting(Map<String, UniversalUserSetting> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.settings = Internal.immutableCopyOf("settings", map);
    }
}
