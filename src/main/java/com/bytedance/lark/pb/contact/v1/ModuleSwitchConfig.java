package com.bytedance.lark.pb.contact.v1;

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

public final class ModuleSwitchConfig extends Message<ModuleSwitchConfig, C16332a> {
    public static final ProtoAdapter<ModuleSwitchConfig> ADAPTER = new C16333b();
    public static final Integer DEFAULT_SWITCH_STATUS = 0;
    private static final long serialVersionUID = 0;
    public final Map<String, String> module_info;
    public final Integer switch_status;

    /* renamed from: com.bytedance.lark.pb.contact.v1.ModuleSwitchConfig$a */
    public static final class C16332a extends Message.Builder<ModuleSwitchConfig, C16332a> {

        /* renamed from: a */
        public Integer f42578a;

        /* renamed from: b */
        public Map<String, String> f42579b = Internal.newMutableMap();

        /* renamed from: a */
        public ModuleSwitchConfig build() {
            return new ModuleSwitchConfig(this.f42578a, this.f42579b, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.ModuleSwitchConfig$b */
    private static final class C16333b extends ProtoAdapter<ModuleSwitchConfig> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f42580a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C16333b() {
            super(FieldEncoding.LENGTH_DELIMITED, ModuleSwitchConfig.class);
        }

        /* renamed from: a */
        public int encodedSize(ModuleSwitchConfig moduleSwitchConfig) {
            int i;
            if (moduleSwitchConfig.switch_status != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, moduleSwitchConfig.switch_status);
            } else {
                i = 0;
            }
            return i + this.f42580a.encodedSizeWithTag(2, moduleSwitchConfig.module_info) + moduleSwitchConfig.unknownFields().size();
        }

        /* renamed from: a */
        public ModuleSwitchConfig decode(ProtoReader protoReader) throws IOException {
            C16332a aVar = new C16332a();
            aVar.f42578a = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42578a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42579b.putAll(this.f42580a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ModuleSwitchConfig moduleSwitchConfig) throws IOException {
            if (moduleSwitchConfig.switch_status != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, moduleSwitchConfig.switch_status);
            }
            this.f42580a.encodeWithTag(protoWriter, 2, moduleSwitchConfig.module_info);
            protoWriter.writeBytes(moduleSwitchConfig.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16332a newBuilder() {
        C16332a aVar = new C16332a();
        aVar.f42578a = this.switch_status;
        aVar.f42579b = Internal.copyOf("module_info", this.module_info);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "ModuleSwitchConfig");
        StringBuilder sb = new StringBuilder();
        if (this.switch_status != null) {
            sb.append(", switch_status=");
            sb.append(this.switch_status);
        }
        if (!this.module_info.isEmpty()) {
            sb.append(", module_info=");
            sb.append(this.module_info);
        }
        StringBuilder replace = sb.replace(0, 2, "ModuleSwitchConfig{");
        replace.append('}');
        return replace.toString();
    }

    public ModuleSwitchConfig(Integer num, Map<String, String> map) {
        this(num, map, ByteString.EMPTY);
    }

    public ModuleSwitchConfig(Integer num, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.switch_status = num;
        this.module_info = Internal.immutableCopyOf("module_info", map);
    }
}
