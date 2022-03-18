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

public final class FlowContext extends Message<FlowContext, C18580a> {
    public static final ProtoAdapter<FlowContext> ADAPTER = new C18581b();
    private static final long serialVersionUID = 0;
    public final Map<String, String> parameters;

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.FlowContext$a */
    public static final class C18580a extends Message.Builder<FlowContext, C18580a> {

        /* renamed from: a */
        public Map<String, String> f46087a = Internal.newMutableMap();

        /* renamed from: a */
        public FlowContext build() {
            return new FlowContext(this.f46087a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.FlowContext$b */
    private static final class C18581b extends ProtoAdapter<FlowContext> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f46088a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C18581b() {
            super(FieldEncoding.LENGTH_DELIMITED, FlowContext.class);
        }

        /* renamed from: a */
        public int encodedSize(FlowContext flowContext) {
            return this.f46088a.encodedSizeWithTag(1, flowContext.parameters) + flowContext.unknownFields().size();
        }

        /* renamed from: a */
        public FlowContext decode(ProtoReader protoReader) throws IOException {
            C18580a aVar = new C18580a();
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
                    aVar.f46087a.putAll(this.f46088a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FlowContext flowContext) throws IOException {
            this.f46088a.encodeWithTag(protoWriter, 1, flowContext.parameters);
            protoWriter.writeBytes(flowContext.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18580a newBuilder() {
        C18580a aVar = new C18580a();
        aVar.f46087a = Internal.copyOf("parameters", this.parameters);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("onboarding", "FlowContext");
        StringBuilder sb = new StringBuilder();
        if (!this.parameters.isEmpty()) {
            sb.append(", parameters=");
            sb.append(this.parameters);
        }
        StringBuilder replace = sb.replace(0, 2, "FlowContext{");
        replace.append('}');
        return replace.toString();
    }

    public FlowContext(Map<String, String> map) {
        this(map, ByteString.EMPTY);
    }

    public FlowContext(Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.parameters = Internal.immutableCopyOf("parameters", map);
    }
}
