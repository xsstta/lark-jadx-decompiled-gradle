package com.bytedance.lark.pb.ugreach.v1;

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

public final class ScenarioContextCache extends Message<ScenarioContextCache, C19805a> {
    public static final ProtoAdapter<ScenarioContextCache> ADAPTER = new C19806b();
    private static final long serialVersionUID = 0;
    public final ScenarioContext meta;
    public final Map<String, Long> rpid2update_time;

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.ScenarioContextCache$a */
    public static final class C19805a extends Message.Builder<ScenarioContextCache, C19805a> {

        /* renamed from: a */
        public ScenarioContext f48284a;

        /* renamed from: b */
        public Map<String, Long> f48285b = Internal.newMutableMap();

        /* renamed from: a */
        public ScenarioContextCache build() {
            return new ScenarioContextCache(this.f48284a, this.f48285b, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.ScenarioContextCache$b */
    private static final class C19806b extends ProtoAdapter<ScenarioContextCache> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Long>> f48286a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.INT64);

        C19806b() {
            super(FieldEncoding.LENGTH_DELIMITED, ScenarioContextCache.class);
        }

        /* renamed from: a */
        public int encodedSize(ScenarioContextCache scenarioContextCache) {
            int i;
            if (scenarioContextCache.meta != null) {
                i = ScenarioContext.ADAPTER.encodedSizeWithTag(1, scenarioContextCache.meta);
            } else {
                i = 0;
            }
            return i + this.f48286a.encodedSizeWithTag(2, scenarioContextCache.rpid2update_time) + scenarioContextCache.unknownFields().size();
        }

        /* renamed from: a */
        public ScenarioContextCache decode(ProtoReader protoReader) throws IOException {
            C19805a aVar = new C19805a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48284a = ScenarioContext.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48285b.putAll(this.f48286a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ScenarioContextCache scenarioContextCache) throws IOException {
            if (scenarioContextCache.meta != null) {
                ScenarioContext.ADAPTER.encodeWithTag(protoWriter, 1, scenarioContextCache.meta);
            }
            this.f48286a.encodeWithTag(protoWriter, 2, scenarioContextCache.rpid2update_time);
            protoWriter.writeBytes(scenarioContextCache.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19805a newBuilder() {
        C19805a aVar = new C19805a();
        aVar.f48284a = this.meta;
        aVar.f48285b = Internal.copyOf("rpid2update_time", this.rpid2update_time);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ugreach", "ScenarioContextCache");
        StringBuilder sb = new StringBuilder();
        if (this.meta != null) {
            sb.append(", meta=");
            sb.append(this.meta);
        }
        if (!this.rpid2update_time.isEmpty()) {
            sb.append(", rpid2update_time=");
            sb.append(this.rpid2update_time);
        }
        StringBuilder replace = sb.replace(0, 2, "ScenarioContextCache{");
        replace.append('}');
        return replace.toString();
    }

    public ScenarioContextCache(ScenarioContext scenarioContext, Map<String, Long> map) {
        this(scenarioContext, map, ByteString.EMPTY);
    }

    public ScenarioContextCache(ScenarioContext scenarioContext, Map<String, Long> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meta = scenarioContext;
        this.rpid2update_time = Internal.immutableCopyOf("rpid2update_time", map);
    }
}
