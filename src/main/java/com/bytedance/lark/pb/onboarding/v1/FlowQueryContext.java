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

public final class FlowQueryContext extends Message<FlowQueryContext, C18582a> {
    public static final ProtoAdapter<FlowQueryContext> ADAPTER = new C18583b();
    public static final Long DEFAULT_FLOW_SUITE_ID = 0L;
    public static final FlowPlatformType DEFAULT_PLATFORM_TYPE = FlowPlatformType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Long flow_suite_id;
    public final FlowPlatformType platform_type;
    public final Map<String, String> replacement_args;

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.FlowQueryContext$b */
    private static final class C18583b extends ProtoAdapter<FlowQueryContext> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f46092a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C18583b() {
            super(FieldEncoding.LENGTH_DELIMITED, FlowQueryContext.class);
        }

        /* renamed from: a */
        public int encodedSize(FlowQueryContext flowQueryContext) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, flowQueryContext.flow_suite_id);
            if (flowQueryContext.platform_type != null) {
                i = FlowPlatformType.ADAPTER.encodedSizeWithTag(2, flowQueryContext.platform_type);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + this.f46092a.encodedSizeWithTag(3, flowQueryContext.replacement_args) + flowQueryContext.unknownFields().size();
        }

        /* renamed from: a */
        public FlowQueryContext decode(ProtoReader protoReader) throws IOException {
            C18582a aVar = new C18582a();
            aVar.f46089a = 0L;
            aVar.f46090b = FlowPlatformType.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46089a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f46090b = FlowPlatformType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46091c.putAll(this.f46092a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FlowQueryContext flowQueryContext) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, flowQueryContext.flow_suite_id);
            if (flowQueryContext.platform_type != null) {
                FlowPlatformType.ADAPTER.encodeWithTag(protoWriter, 2, flowQueryContext.platform_type);
            }
            this.f46092a.encodeWithTag(protoWriter, 3, flowQueryContext.replacement_args);
            protoWriter.writeBytes(flowQueryContext.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18582a newBuilder() {
        C18582a aVar = new C18582a();
        aVar.f46089a = this.flow_suite_id;
        aVar.f46090b = this.platform_type;
        aVar.f46091c = Internal.copyOf("replacement_args", this.replacement_args);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.FlowQueryContext$a */
    public static final class C18582a extends Message.Builder<FlowQueryContext, C18582a> {

        /* renamed from: a */
        public Long f46089a;

        /* renamed from: b */
        public FlowPlatformType f46090b;

        /* renamed from: c */
        public Map<String, String> f46091c = Internal.newMutableMap();

        /* renamed from: a */
        public FlowQueryContext build() {
            Long l = this.f46089a;
            if (l != null) {
                return new FlowQueryContext(l, this.f46090b, this.f46091c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l, "flow_suite_id");
        }

        /* renamed from: a */
        public C18582a mo64063a(FlowPlatformType flowPlatformType) {
            this.f46090b = flowPlatformType;
            return this;
        }

        /* renamed from: a */
        public C18582a mo64064a(Long l) {
            this.f46089a = l;
            return this;
        }

        /* renamed from: a */
        public C18582a mo64065a(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.f46091c = map;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("onboarding", "FlowQueryContext");
        StringBuilder sb = new StringBuilder();
        sb.append(", flow_suite_id=");
        sb.append(this.flow_suite_id);
        if (this.platform_type != null) {
            sb.append(", platform_type=");
            sb.append(this.platform_type);
        }
        if (!this.replacement_args.isEmpty()) {
            sb.append(", replacement_args=");
            sb.append(this.replacement_args);
        }
        StringBuilder replace = sb.replace(0, 2, "FlowQueryContext{");
        replace.append('}');
        return replace.toString();
    }

    public FlowQueryContext(Long l, FlowPlatformType flowPlatformType, Map<String, String> map) {
        this(l, flowPlatformType, map, ByteString.EMPTY);
    }

    public FlowQueryContext(Long l, FlowPlatformType flowPlatformType, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.flow_suite_id = l;
        this.platform_type = flowPlatformType;
        this.replacement_args = Internal.immutableCopyOf("replacement_args", map);
    }
}
