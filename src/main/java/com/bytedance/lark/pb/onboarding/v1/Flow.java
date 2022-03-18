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

public final class Flow extends Message<Flow, C18578a> {
    public static final ProtoAdapter<Flow> ADAPTER = new C18579b();
    public static final Long DEFAULT_FLOW_SUITE_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Map<String, Element> elements;
    public final FlowContext flow_context;
    public final String flow_name;
    public final Long flow_suite_id;
    public final String root_step_url;
    public final Map<String, Step> steps;

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.Flow$b */
    private static final class C18579b extends ProtoAdapter<Flow> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Step>> f46085a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Step.ADAPTER);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, Element>> f46086b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Element.ADAPTER);

        C18579b() {
            super(FieldEncoding.LENGTH_DELIMITED, Flow.class);
        }

        /* renamed from: a */
        public int encodedSize(Flow flow) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, flow.flow_suite_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, flow.flow_name) + this.f46085a.encodedSizeWithTag(3, flow.steps) + this.f46086b.encodedSizeWithTag(4, flow.elements) + ProtoAdapter.STRING.encodedSizeWithTag(5, flow.root_step_url) + FlowContext.ADAPTER.encodedSizeWithTag(6, flow.flow_context) + flow.unknownFields().size();
        }

        /* renamed from: a */
        public Flow decode(ProtoReader protoReader) throws IOException {
            C18578a aVar = new C18578a();
            aVar.f46079a = 0L;
            aVar.f46080b = "";
            aVar.f46083e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f46079a = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            aVar.f46080b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f46081c.putAll(this.f46085a.decode(protoReader));
                            break;
                        case 4:
                            aVar.f46082d.putAll(this.f46086b.decode(protoReader));
                            break;
                        case 5:
                            aVar.f46083e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f46084f = FlowContext.ADAPTER.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Flow flow) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, flow.flow_suite_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, flow.flow_name);
            this.f46085a.encodeWithTag(protoWriter, 3, flow.steps);
            this.f46086b.encodeWithTag(protoWriter, 4, flow.elements);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, flow.root_step_url);
            FlowContext.ADAPTER.encodeWithTag(protoWriter, 6, flow.flow_context);
            protoWriter.writeBytes(flow.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18578a newBuilder() {
        C18578a aVar = new C18578a();
        aVar.f46079a = this.flow_suite_id;
        aVar.f46080b = this.flow_name;
        aVar.f46081c = Internal.copyOf("steps", this.steps);
        aVar.f46082d = Internal.copyOf("elements", this.elements);
        aVar.f46083e = this.root_step_url;
        aVar.f46084f = this.flow_context;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.Flow$a */
    public static final class C18578a extends Message.Builder<Flow, C18578a> {

        /* renamed from: a */
        public Long f46079a;

        /* renamed from: b */
        public String f46080b;

        /* renamed from: c */
        public Map<String, Step> f46081c = Internal.newMutableMap();

        /* renamed from: d */
        public Map<String, Element> f46082d = Internal.newMutableMap();

        /* renamed from: e */
        public String f46083e;

        /* renamed from: f */
        public FlowContext f46084f;

        /* renamed from: a */
        public Flow build() {
            String str;
            String str2;
            FlowContext flowContext;
            Long l = this.f46079a;
            if (l != null && (str = this.f46080b) != null && (str2 = this.f46083e) != null && (flowContext = this.f46084f) != null) {
                return new Flow(l, str, this.f46081c, this.f46082d, str2, flowContext, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l, "flow_suite_id", this.f46080b, "flow_name", this.f46083e, "root_step_url", this.f46084f, "flow_context");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("onboarding", "Flow");
        StringBuilder sb = new StringBuilder();
        sb.append(", flow_suite_id=");
        sb.append(this.flow_suite_id);
        sb.append(", flow_name=");
        sb.append(this.flow_name);
        if (!this.steps.isEmpty()) {
            sb.append(", steps=");
            sb.append(this.steps);
        }
        if (!this.elements.isEmpty()) {
            sb.append(", elements=");
            sb.append(this.elements);
        }
        sb.append(", root_step_url=");
        sb.append(this.root_step_url);
        sb.append(", flow_context=");
        sb.append(this.flow_context);
        StringBuilder replace = sb.replace(0, 2, "Flow{");
        replace.append('}');
        return replace.toString();
    }

    public Flow(Long l, String str, Map<String, Step> map, Map<String, Element> map2, String str2, FlowContext flowContext) {
        this(l, str, map, map2, str2, flowContext, ByteString.EMPTY);
    }

    public Flow(Long l, String str, Map<String, Step> map, Map<String, Element> map2, String str2, FlowContext flowContext, ByteString byteString) {
        super(ADAPTER, byteString);
        this.flow_suite_id = l;
        this.flow_name = str;
        this.steps = Internal.immutableCopyOf("steps", map);
        this.elements = Internal.immutableCopyOf("elements", map2);
        this.root_step_url = str2;
        this.flow_context = flowContext;
    }
}
