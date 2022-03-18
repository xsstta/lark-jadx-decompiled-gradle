package com.bytedance.lark.pb.onboarding.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetDynamicFlowRequest extends Message<GetDynamicFlowRequest, C18584a> {
    public static final ProtoAdapter<GetDynamicFlowRequest> ADAPTER = new C18585b();
    private static final long serialVersionUID = 0;
    public final FlowQueryContext flow_context;

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.GetDynamicFlowRequest$b */
    private static final class C18585b extends ProtoAdapter<GetDynamicFlowRequest> {
        C18585b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetDynamicFlowRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetDynamicFlowRequest getDynamicFlowRequest) {
            return FlowQueryContext.ADAPTER.encodedSizeWithTag(1, getDynamicFlowRequest.flow_context) + getDynamicFlowRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetDynamicFlowRequest decode(ProtoReader protoReader) throws IOException {
            C18584a aVar = new C18584a();
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
                    aVar.f46093a = FlowQueryContext.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetDynamicFlowRequest getDynamicFlowRequest) throws IOException {
            FlowQueryContext.ADAPTER.encodeWithTag(protoWriter, 1, getDynamicFlowRequest.flow_context);
            protoWriter.writeBytes(getDynamicFlowRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.GetDynamicFlowRequest$a */
    public static final class C18584a extends Message.Builder<GetDynamicFlowRequest, C18584a> {

        /* renamed from: a */
        public FlowQueryContext f46093a;

        /* renamed from: a */
        public GetDynamicFlowRequest build() {
            FlowQueryContext flowQueryContext = this.f46093a;
            if (flowQueryContext != null) {
                return new GetDynamicFlowRequest(flowQueryContext, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(flowQueryContext, "flow_context");
        }

        /* renamed from: a */
        public C18584a mo64070a(FlowQueryContext flowQueryContext) {
            this.f46093a = flowQueryContext;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18584a newBuilder() {
        C18584a aVar = new C18584a();
        aVar.f46093a = this.flow_context;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("onboarding", "GetDynamicFlowRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", flow_context=");
        sb.append(this.flow_context);
        StringBuilder replace = sb.replace(0, 2, "GetDynamicFlowRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetDynamicFlowRequest(FlowQueryContext flowQueryContext) {
        this(flowQueryContext, ByteString.EMPTY);
    }

    public GetDynamicFlowRequest(FlowQueryContext flowQueryContext, ByteString byteString) {
        super(ADAPTER, byteString);
        this.flow_context = flowQueryContext;
    }
}
