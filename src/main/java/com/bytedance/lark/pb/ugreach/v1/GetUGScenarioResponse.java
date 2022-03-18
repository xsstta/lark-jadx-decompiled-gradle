package com.bytedance.lark.pb.ugreach.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetUGScenarioResponse extends Message<GetUGScenarioResponse, C19785a> {
    public static final ProtoAdapter<GetUGScenarioResponse> ADAPTER = new C19786b();
    private static final long serialVersionUID = 0;
    public final ScenarioContext scenario_context;
    public final String scenario_id;

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.GetUGScenarioResponse$b */
    private static final class C19786b extends ProtoAdapter<GetUGScenarioResponse> {
        C19786b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUGScenarioResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUGScenarioResponse getUGScenarioResponse) {
            int i;
            int i2 = 0;
            if (getUGScenarioResponse.scenario_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getUGScenarioResponse.scenario_id);
            } else {
                i = 0;
            }
            if (getUGScenarioResponse.scenario_context != null) {
                i2 = ScenarioContext.ADAPTER.encodedSizeWithTag(2, getUGScenarioResponse.scenario_context);
            }
            return i + i2 + getUGScenarioResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetUGScenarioResponse decode(ProtoReader protoReader) throws IOException {
            C19785a aVar = new C19785a();
            aVar.f48246a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48246a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48247b = ScenarioContext.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUGScenarioResponse getUGScenarioResponse) throws IOException {
            if (getUGScenarioResponse.scenario_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getUGScenarioResponse.scenario_id);
            }
            if (getUGScenarioResponse.scenario_context != null) {
                ScenarioContext.ADAPTER.encodeWithTag(protoWriter, 2, getUGScenarioResponse.scenario_context);
            }
            protoWriter.writeBytes(getUGScenarioResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.GetUGScenarioResponse$a */
    public static final class C19785a extends Message.Builder<GetUGScenarioResponse, C19785a> {

        /* renamed from: a */
        public String f48246a;

        /* renamed from: b */
        public ScenarioContext f48247b;

        /* renamed from: a */
        public GetUGScenarioResponse build() {
            return new GetUGScenarioResponse(this.f48246a, this.f48247b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19785a newBuilder() {
        C19785a aVar = new C19785a();
        aVar.f48246a = this.scenario_id;
        aVar.f48247b = this.scenario_context;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ugreach", "GetUGScenarioResponse");
        StringBuilder sb = new StringBuilder();
        if (this.scenario_id != null) {
            sb.append(", scenario_id=");
            sb.append(this.scenario_id);
        }
        if (this.scenario_context != null) {
            sb.append(", scenario_context=");
            sb.append(this.scenario_context);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUGScenarioResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetUGScenarioResponse(String str, ScenarioContext scenarioContext) {
        this(str, scenarioContext, ByteString.EMPTY);
    }

    public GetUGScenarioResponse(String str, ScenarioContext scenarioContext, ByteString byteString) {
        super(ADAPTER, byteString);
        this.scenario_id = str;
        this.scenario_context = scenarioContext;
    }
}
