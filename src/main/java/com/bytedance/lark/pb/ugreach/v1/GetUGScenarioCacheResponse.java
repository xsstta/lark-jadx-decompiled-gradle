package com.bytedance.lark.pb.ugreach.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetUGScenarioCacheResponse extends Message<GetUGScenarioCacheResponse, C19781a> {
    public static final ProtoAdapter<GetUGScenarioCacheResponse> ADAPTER = new C19782b();
    private static final long serialVersionUID = 0;
    public final ScenarioContextCache scenario_cache;

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.GetUGScenarioCacheResponse$b */
    private static final class C19782b extends ProtoAdapter<GetUGScenarioCacheResponse> {
        C19782b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUGScenarioCacheResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUGScenarioCacheResponse getUGScenarioCacheResponse) {
            int i;
            if (getUGScenarioCacheResponse.scenario_cache != null) {
                i = ScenarioContextCache.ADAPTER.encodedSizeWithTag(1, getUGScenarioCacheResponse.scenario_cache);
            } else {
                i = 0;
            }
            return i + getUGScenarioCacheResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetUGScenarioCacheResponse decode(ProtoReader protoReader) throws IOException {
            C19781a aVar = new C19781a();
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
                    aVar.f48241a = ScenarioContextCache.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUGScenarioCacheResponse getUGScenarioCacheResponse) throws IOException {
            if (getUGScenarioCacheResponse.scenario_cache != null) {
                ScenarioContextCache.ADAPTER.encodeWithTag(protoWriter, 1, getUGScenarioCacheResponse.scenario_cache);
            }
            protoWriter.writeBytes(getUGScenarioCacheResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.GetUGScenarioCacheResponse$a */
    public static final class C19781a extends Message.Builder<GetUGScenarioCacheResponse, C19781a> {

        /* renamed from: a */
        public ScenarioContextCache f48241a;

        /* renamed from: a */
        public GetUGScenarioCacheResponse build() {
            return new GetUGScenarioCacheResponse(this.f48241a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19781a newBuilder() {
        C19781a aVar = new C19781a();
        aVar.f48241a = this.scenario_cache;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ugreach", "GetUGScenarioCacheResponse");
        StringBuilder sb = new StringBuilder();
        if (this.scenario_cache != null) {
            sb.append(", scenario_cache=");
            sb.append(this.scenario_cache);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUGScenarioCacheResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetUGScenarioCacheResponse(ScenarioContextCache scenarioContextCache) {
        this(scenarioContextCache, ByteString.EMPTY);
    }

    public GetUGScenarioCacheResponse(ScenarioContextCache scenarioContextCache, ByteString byteString) {
        super(ADAPTER, byteString);
        this.scenario_cache = scenarioContextCache;
    }
}
