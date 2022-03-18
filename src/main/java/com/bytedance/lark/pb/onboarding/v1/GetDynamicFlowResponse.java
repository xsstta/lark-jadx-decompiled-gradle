package com.bytedance.lark.pb.onboarding.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetDynamicFlowResponse extends Message<GetDynamicFlowResponse, C18586a> {
    public static final ProtoAdapter<GetDynamicFlowResponse> ADAPTER = new C18587b();
    private static final long serialVersionUID = 0;
    public final Flow flow;

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.GetDynamicFlowResponse$b */
    private static final class C18587b extends ProtoAdapter<GetDynamicFlowResponse> {
        C18587b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetDynamicFlowResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetDynamicFlowResponse getDynamicFlowResponse) {
            int i;
            if (getDynamicFlowResponse.flow != null) {
                i = Flow.ADAPTER.encodedSizeWithTag(1, getDynamicFlowResponse.flow);
            } else {
                i = 0;
            }
            return i + getDynamicFlowResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetDynamicFlowResponse decode(ProtoReader protoReader) throws IOException {
            C18586a aVar = new C18586a();
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
                    aVar.f46094a = Flow.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetDynamicFlowResponse getDynamicFlowResponse) throws IOException {
            if (getDynamicFlowResponse.flow != null) {
                Flow.ADAPTER.encodeWithTag(protoWriter, 1, getDynamicFlowResponse.flow);
            }
            protoWriter.writeBytes(getDynamicFlowResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.GetDynamicFlowResponse$a */
    public static final class C18586a extends Message.Builder<GetDynamicFlowResponse, C18586a> {

        /* renamed from: a */
        public Flow f46094a;

        /* renamed from: a */
        public GetDynamicFlowResponse build() {
            return new GetDynamicFlowResponse(this.f46094a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18586a newBuilder() {
        C18586a aVar = new C18586a();
        aVar.f46094a = this.flow;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("onboarding", "GetDynamicFlowResponse");
        StringBuilder sb = new StringBuilder();
        if (this.flow != null) {
            sb.append(", flow=");
            sb.append(this.flow);
        }
        StringBuilder replace = sb.replace(0, 2, "GetDynamicFlowResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetDynamicFlowResponse(Flow flow2) {
        this(flow2, ByteString.EMPTY);
    }

    public GetDynamicFlowResponse(Flow flow2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.flow = flow2;
    }
}
