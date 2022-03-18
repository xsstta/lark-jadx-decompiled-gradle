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

public final class PushDynamicFlowStepEvent extends Message<PushDynamicFlowStepEvent, C18608a> {
    public static final ProtoAdapter<PushDynamicFlowStepEvent> ADAPTER = new C18609b();
    public static final Long DEFAULT_FLOW_SUITE_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Map<String, Element> elements;
    public final FlowContext flow_context;
    public final String flow_name;
    public final Long flow_suite_id;
    public final Step step;

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.PushDynamicFlowStepEvent$b */
    private static final class C18609b extends ProtoAdapter<PushDynamicFlowStepEvent> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Element>> f46112a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Element.ADAPTER);

        C18609b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushDynamicFlowStepEvent.class);
        }

        /* renamed from: a */
        public int encodedSize(PushDynamicFlowStepEvent pushDynamicFlowStepEvent) {
            int i;
            int encodedSizeWithTag = Step.ADAPTER.encodedSizeWithTag(1, pushDynamicFlowStepEvent.step) + this.f46112a.encodedSizeWithTag(2, pushDynamicFlowStepEvent.elements) + FlowContext.ADAPTER.encodedSizeWithTag(3, pushDynamicFlowStepEvent.flow_context) + ProtoAdapter.INT64.encodedSizeWithTag(4, pushDynamicFlowStepEvent.flow_suite_id);
            if (pushDynamicFlowStepEvent.flow_name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(5, pushDynamicFlowStepEvent.flow_name);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + pushDynamicFlowStepEvent.unknownFields().size();
        }

        /* renamed from: a */
        public PushDynamicFlowStepEvent decode(ProtoReader protoReader) throws IOException {
            C18608a aVar = new C18608a();
            aVar.f46110d = 0L;
            aVar.f46111e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46107a = Step.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46108b.putAll(this.f46112a.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f46109c = FlowContext.ADAPTER.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f46110d = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46111e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushDynamicFlowStepEvent pushDynamicFlowStepEvent) throws IOException {
            Step.ADAPTER.encodeWithTag(protoWriter, 1, pushDynamicFlowStepEvent.step);
            this.f46112a.encodeWithTag(protoWriter, 2, pushDynamicFlowStepEvent.elements);
            FlowContext.ADAPTER.encodeWithTag(protoWriter, 3, pushDynamicFlowStepEvent.flow_context);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, pushDynamicFlowStepEvent.flow_suite_id);
            if (pushDynamicFlowStepEvent.flow_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, pushDynamicFlowStepEvent.flow_name);
            }
            protoWriter.writeBytes(pushDynamicFlowStepEvent.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.PushDynamicFlowStepEvent$a */
    public static final class C18608a extends Message.Builder<PushDynamicFlowStepEvent, C18608a> {

        /* renamed from: a */
        public Step f46107a;

        /* renamed from: b */
        public Map<String, Element> f46108b = Internal.newMutableMap();

        /* renamed from: c */
        public FlowContext f46109c;

        /* renamed from: d */
        public Long f46110d;

        /* renamed from: e */
        public String f46111e;

        /* renamed from: a */
        public PushDynamicFlowStepEvent build() {
            FlowContext flowContext;
            Long l;
            Step step = this.f46107a;
            if (step != null && (flowContext = this.f46109c) != null && (l = this.f46110d) != null) {
                return new PushDynamicFlowStepEvent(step, this.f46108b, flowContext, l, this.f46111e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(step, "step", this.f46109c, "flow_context", this.f46110d, "flow_suite_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C18608a newBuilder() {
        C18608a aVar = new C18608a();
        aVar.f46107a = this.step;
        aVar.f46108b = Internal.copyOf("elements", this.elements);
        aVar.f46109c = this.flow_context;
        aVar.f46110d = this.flow_suite_id;
        aVar.f46111e = this.flow_name;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("onboarding", "PushDynamicFlowStepEvent");
        StringBuilder sb = new StringBuilder();
        sb.append(", step=");
        sb.append(this.step);
        if (!this.elements.isEmpty()) {
            sb.append(", elements=");
            sb.append(this.elements);
        }
        sb.append(", flow_context=");
        sb.append(this.flow_context);
        sb.append(", flow_suite_id=");
        sb.append(this.flow_suite_id);
        if (this.flow_name != null) {
            sb.append(", flow_name=");
            sb.append(this.flow_name);
        }
        StringBuilder replace = sb.replace(0, 2, "PushDynamicFlowStepEvent{");
        replace.append('}');
        return replace.toString();
    }

    public PushDynamicFlowStepEvent(Step step2, Map<String, Element> map, FlowContext flowContext, Long l, String str) {
        this(step2, map, flowContext, l, str, ByteString.EMPTY);
    }

    public PushDynamicFlowStepEvent(Step step2, Map<String, Element> map, FlowContext flowContext, Long l, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.step = step2;
        this.elements = Internal.immutableCopyOf("elements", map);
        this.flow_context = flowContext;
        this.flow_suite_id = l;
        this.flow_name = str;
    }
}
