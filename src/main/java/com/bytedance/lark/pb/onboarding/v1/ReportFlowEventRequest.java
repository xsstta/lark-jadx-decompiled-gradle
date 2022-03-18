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

public final class ReportFlowEventRequest extends Message<ReportFlowEventRequest, C18616a> {
    public static final ProtoAdapter<ReportFlowEventRequest> ADAPTER = new C18617b();
    public static final Long DEFAULT_FLOW_SUITE_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Long flow_suite_id;
    public final String slot_id;
    public final String step_id;

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.ReportFlowEventRequest$b */
    private static final class C18617b extends ProtoAdapter<ReportFlowEventRequest> {
        C18617b() {
            super(FieldEncoding.LENGTH_DELIMITED, ReportFlowEventRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ReportFlowEventRequest reportFlowEventRequest) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, reportFlowEventRequest.flow_suite_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, reportFlowEventRequest.step_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, reportFlowEventRequest.slot_id) + reportFlowEventRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ReportFlowEventRequest decode(ProtoReader protoReader) throws IOException {
            C18616a aVar = new C18616a();
            aVar.f46120a = 0L;
            aVar.f46121b = "";
            aVar.f46122c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46120a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46121b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46122c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ReportFlowEventRequest reportFlowEventRequest) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, reportFlowEventRequest.flow_suite_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, reportFlowEventRequest.step_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, reportFlowEventRequest.slot_id);
            protoWriter.writeBytes(reportFlowEventRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18616a newBuilder() {
        C18616a aVar = new C18616a();
        aVar.f46120a = this.flow_suite_id;
        aVar.f46121b = this.step_id;
        aVar.f46122c = this.slot_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.ReportFlowEventRequest$a */
    public static final class C18616a extends Message.Builder<ReportFlowEventRequest, C18616a> {

        /* renamed from: a */
        public Long f46120a;

        /* renamed from: b */
        public String f46121b;

        /* renamed from: c */
        public String f46122c;

        /* renamed from: a */
        public ReportFlowEventRequest build() {
            String str;
            String str2;
            Long l = this.f46120a;
            if (l != null && (str = this.f46121b) != null && (str2 = this.f46122c) != null) {
                return new ReportFlowEventRequest(l, str, str2, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l, "flow_suite_id", this.f46121b, "step_id", this.f46122c, "slot_id");
        }

        /* renamed from: a */
        public C18616a mo64140a(Long l) {
            this.f46120a = l;
            return this;
        }

        /* renamed from: b */
        public C18616a mo64143b(String str) {
            this.f46122c = str;
            return this;
        }

        /* renamed from: a */
        public C18616a mo64141a(String str) {
            this.f46121b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("onboarding", "ReportFlowEventRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", flow_suite_id=");
        sb.append(this.flow_suite_id);
        sb.append(", step_id=");
        sb.append(this.step_id);
        sb.append(", slot_id=");
        sb.append(this.slot_id);
        StringBuilder replace = sb.replace(0, 2, "ReportFlowEventRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ReportFlowEventRequest(Long l, String str, String str2) {
        this(l, str, str2, ByteString.EMPTY);
    }

    public ReportFlowEventRequest(Long l, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.flow_suite_id = l;
        this.step_id = str;
        this.slot_id = str2;
    }
}
