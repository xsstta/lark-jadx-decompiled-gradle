package com.bytedance.lark.pb.ugreach.v1;

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

public final class GetUGScenarioRequest extends Message<GetUGScenarioRequest, C19783a> {
    public static final ProtoAdapter<GetUGScenarioRequest> ADAPTER = new C19784b();
    private static final long serialVersionUID = 0;
    public final Map<String, String> biz_context;
    public final String scenario_id;
    public final List<String> specified_reach_point_ids;

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.GetUGScenarioRequest$a */
    public static final class C19783a extends Message.Builder<GetUGScenarioRequest, C19783a> {

        /* renamed from: a */
        public String f48242a;

        /* renamed from: b */
        public List<String> f48243b = Internal.newMutableList();

        /* renamed from: c */
        public Map<String, String> f48244c = Internal.newMutableMap();

        /* renamed from: a */
        public GetUGScenarioRequest build() {
            return new GetUGScenarioRequest(this.f48242a, this.f48243b, this.f48244c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19783a mo66980a(String str) {
            this.f48242a = str;
            return this;
        }

        /* renamed from: a */
        public C19783a mo66981a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f48243b = list;
            return this;
        }

        /* renamed from: a */
        public C19783a mo66982a(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.f48244c = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.GetUGScenarioRequest$b */
    private static final class C19784b extends ProtoAdapter<GetUGScenarioRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f48245a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C19784b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUGScenarioRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUGScenarioRequest getUGScenarioRequest) {
            int i;
            if (getUGScenarioRequest.scenario_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getUGScenarioRequest.scenario_id);
            } else {
                i = 0;
            }
            return i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, getUGScenarioRequest.specified_reach_point_ids) + this.f48245a.encodedSizeWithTag(3, getUGScenarioRequest.biz_context) + getUGScenarioRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetUGScenarioRequest decode(ProtoReader protoReader) throws IOException {
            C19783a aVar = new C19783a();
            aVar.f48242a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48242a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f48243b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48244c.putAll(this.f48245a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUGScenarioRequest getUGScenarioRequest) throws IOException {
            if (getUGScenarioRequest.scenario_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getUGScenarioRequest.scenario_id);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, getUGScenarioRequest.specified_reach_point_ids);
            this.f48245a.encodeWithTag(protoWriter, 3, getUGScenarioRequest.biz_context);
            protoWriter.writeBytes(getUGScenarioRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19783a newBuilder() {
        C19783a aVar = new C19783a();
        aVar.f48242a = this.scenario_id;
        aVar.f48243b = Internal.copyOf("specified_reach_point_ids", this.specified_reach_point_ids);
        aVar.f48244c = Internal.copyOf("biz_context", this.biz_context);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ugreach", "GetUGScenarioRequest");
        StringBuilder sb = new StringBuilder();
        if (this.scenario_id != null) {
            sb.append(", scenario_id=");
            sb.append(this.scenario_id);
        }
        if (!this.specified_reach_point_ids.isEmpty()) {
            sb.append(", specified_reach_point_ids=");
            sb.append(this.specified_reach_point_ids);
        }
        if (!this.biz_context.isEmpty()) {
            sb.append(", biz_context=");
            sb.append(this.biz_context);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUGScenarioRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetUGScenarioRequest(String str, List<String> list, Map<String, String> map) {
        this(str, list, map, ByteString.EMPTY);
    }

    public GetUGScenarioRequest(String str, List<String> list, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.scenario_id = str;
        this.specified_reach_point_ids = Internal.immutableCopyOf("specified_reach_point_ids", list);
        this.biz_context = Internal.immutableCopyOf("biz_context", map);
    }
}
