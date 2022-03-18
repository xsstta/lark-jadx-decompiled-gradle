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

public final class GetDynamicFlowStepResponse extends Message<GetDynamicFlowStepResponse, C18588a> {
    public static final ProtoAdapter<GetDynamicFlowStepResponse> ADAPTER = new C18589b();
    private static final long serialVersionUID = 0;
    public final Map<String, Element> elements;
    public final FlowContext flow_context;
    public final Step step;

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.GetDynamicFlowStepResponse$b */
    private static final class C18589b extends ProtoAdapter<GetDynamicFlowStepResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Element>> f46098a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Element.ADAPTER);

        C18589b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetDynamicFlowStepResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetDynamicFlowStepResponse getDynamicFlowStepResponse) {
            return Step.ADAPTER.encodedSizeWithTag(1, getDynamicFlowStepResponse.step) + this.f46098a.encodedSizeWithTag(2, getDynamicFlowStepResponse.elements) + FlowContext.ADAPTER.encodedSizeWithTag(3, getDynamicFlowStepResponse.flow_context) + getDynamicFlowStepResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetDynamicFlowStepResponse decode(ProtoReader protoReader) throws IOException {
            C18588a aVar = new C18588a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46095a = Step.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46096b.putAll(this.f46098a.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46097c = FlowContext.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetDynamicFlowStepResponse getDynamicFlowStepResponse) throws IOException {
            Step.ADAPTER.encodeWithTag(protoWriter, 1, getDynamicFlowStepResponse.step);
            this.f46098a.encodeWithTag(protoWriter, 2, getDynamicFlowStepResponse.elements);
            FlowContext.ADAPTER.encodeWithTag(protoWriter, 3, getDynamicFlowStepResponse.flow_context);
            protoWriter.writeBytes(getDynamicFlowStepResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18588a newBuilder() {
        C18588a aVar = new C18588a();
        aVar.f46095a = this.step;
        aVar.f46096b = Internal.copyOf("elements", this.elements);
        aVar.f46097c = this.flow_context;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.GetDynamicFlowStepResponse$a */
    public static final class C18588a extends Message.Builder<GetDynamicFlowStepResponse, C18588a> {

        /* renamed from: a */
        public Step f46095a;

        /* renamed from: b */
        public Map<String, Element> f46096b = Internal.newMutableMap();

        /* renamed from: c */
        public FlowContext f46097c;

        /* renamed from: a */
        public GetDynamicFlowStepResponse build() {
            FlowContext flowContext;
            Step step = this.f46095a;
            if (step != null && (flowContext = this.f46097c) != null) {
                return new GetDynamicFlowStepResponse(step, this.f46096b, flowContext, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(step, "step", this.f46097c, "flow_context");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("onboarding", "GetDynamicFlowStepResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", step=");
        sb.append(this.step);
        if (!this.elements.isEmpty()) {
            sb.append(", elements=");
            sb.append(this.elements);
        }
        sb.append(", flow_context=");
        sb.append(this.flow_context);
        StringBuilder replace = sb.replace(0, 2, "GetDynamicFlowStepResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetDynamicFlowStepResponse(Step step2, Map<String, Element> map, FlowContext flowContext) {
        this(step2, map, flowContext, ByteString.EMPTY);
    }

    public GetDynamicFlowStepResponse(Step step2, Map<String, Element> map, FlowContext flowContext, ByteString byteString) {
        super(ADAPTER, byteString);
        this.step = step2;
        this.elements = Internal.immutableCopyOf("elements", map);
        this.flow_context = flowContext;
    }
}
