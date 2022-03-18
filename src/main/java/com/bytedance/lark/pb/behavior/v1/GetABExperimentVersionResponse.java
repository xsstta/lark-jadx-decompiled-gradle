package com.bytedance.lark.pb.behavior.v1;

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

public final class GetABExperimentVersionResponse extends Message<GetABExperimentVersionResponse, C15458a> {
    public static final ProtoAdapter<GetABExperimentVersionResponse> ADAPTER = new C15459b();
    private static final long serialVersionUID = 0;
    public final Map<String, String> feature_with_ab_map;
    public final Map<String, String> tea_event_key_map;

    /* renamed from: com.bytedance.lark.pb.behavior.v1.GetABExperimentVersionResponse$a */
    public static final class C15458a extends Message.Builder<GetABExperimentVersionResponse, C15458a> {

        /* renamed from: a */
        public Map<String, String> f40912a = Internal.newMutableMap();

        /* renamed from: b */
        public Map<String, String> f40913b = Internal.newMutableMap();

        /* renamed from: a */
        public GetABExperimentVersionResponse build() {
            return new GetABExperimentVersionResponse(this.f40912a, this.f40913b, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.behavior.v1.GetABExperimentVersionResponse$b */
    private static final class C15459b extends ProtoAdapter<GetABExperimentVersionResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f40914a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, String>> f40915b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C15459b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetABExperimentVersionResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetABExperimentVersionResponse getABExperimentVersionResponse) {
            return this.f40914a.encodedSizeWithTag(16, getABExperimentVersionResponse.tea_event_key_map) + this.f40915b.encodedSizeWithTag(17, getABExperimentVersionResponse.feature_with_ab_map) + getABExperimentVersionResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetABExperimentVersionResponse decode(ProtoReader protoReader) throws IOException {
            C15458a aVar = new C15458a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 16) {
                    aVar.f40912a.putAll(this.f40914a.decode(protoReader));
                } else if (nextTag != 17) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40913b.putAll(this.f40915b.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetABExperimentVersionResponse getABExperimentVersionResponse) throws IOException {
            this.f40914a.encodeWithTag(protoWriter, 16, getABExperimentVersionResponse.tea_event_key_map);
            this.f40915b.encodeWithTag(protoWriter, 17, getABExperimentVersionResponse.feature_with_ab_map);
            protoWriter.writeBytes(getABExperimentVersionResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15458a newBuilder() {
        C15458a aVar = new C15458a();
        aVar.f40912a = Internal.copyOf("tea_event_key_map", this.tea_event_key_map);
        aVar.f40913b = Internal.copyOf("feature_with_ab_map", this.feature_with_ab_map);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("behavior", "GetABExperimentVersionResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.tea_event_key_map.isEmpty()) {
            sb.append(", tea_event_key_map=");
            sb.append(this.tea_event_key_map);
        }
        if (!this.feature_with_ab_map.isEmpty()) {
            sb.append(", feature_with_ab_map=");
            sb.append(this.feature_with_ab_map);
        }
        StringBuilder replace = sb.replace(0, 2, "GetABExperimentVersionResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetABExperimentVersionResponse(Map<String, String> map, Map<String, String> map2) {
        this(map, map2, ByteString.EMPTY);
    }

    public GetABExperimentVersionResponse(Map<String, String> map, Map<String, String> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.tea_event_key_map = Internal.immutableCopyOf("tea_event_key_map", map);
        this.feature_with_ab_map = Internal.immutableCopyOf("feature_with_ab_map", map2);
    }
}
