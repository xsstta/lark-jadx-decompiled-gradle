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

public final class GetABExperimentFeatureMapResponse extends Message<GetABExperimentFeatureMapResponse, C15454a> {
    public static final ProtoAdapter<GetABExperimentFeatureMapResponse> ADAPTER = new C15455b();
    public static final Boolean DEFAULT_IS_FROM_DB = false;
    private static final long serialVersionUID = 0;
    public final Map<String, String> feature_with_ab_map;
    public final Boolean is_from_db;

    /* renamed from: com.bytedance.lark.pb.behavior.v1.GetABExperimentFeatureMapResponse$a */
    public static final class C15454a extends Message.Builder<GetABExperimentFeatureMapResponse, C15454a> {

        /* renamed from: a */
        public Map<String, String> f40906a = Internal.newMutableMap();

        /* renamed from: b */
        public Boolean f40907b;

        /* renamed from: a */
        public GetABExperimentFeatureMapResponse build() {
            return new GetABExperimentFeatureMapResponse(this.f40906a, this.f40907b, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.behavior.v1.GetABExperimentFeatureMapResponse$b */
    private static final class C15455b extends ProtoAdapter<GetABExperimentFeatureMapResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f40908a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C15455b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetABExperimentFeatureMapResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetABExperimentFeatureMapResponse getABExperimentFeatureMapResponse) {
            int i;
            int encodedSizeWithTag = this.f40908a.encodedSizeWithTag(1, getABExperimentFeatureMapResponse.feature_with_ab_map);
            if (getABExperimentFeatureMapResponse.is_from_db != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, getABExperimentFeatureMapResponse.is_from_db);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getABExperimentFeatureMapResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetABExperimentFeatureMapResponse decode(ProtoReader protoReader) throws IOException {
            C15454a aVar = new C15454a();
            aVar.f40907b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40906a.putAll(this.f40908a.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40907b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetABExperimentFeatureMapResponse getABExperimentFeatureMapResponse) throws IOException {
            this.f40908a.encodeWithTag(protoWriter, 1, getABExperimentFeatureMapResponse.feature_with_ab_map);
            if (getABExperimentFeatureMapResponse.is_from_db != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getABExperimentFeatureMapResponse.is_from_db);
            }
            protoWriter.writeBytes(getABExperimentFeatureMapResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15454a newBuilder() {
        C15454a aVar = new C15454a();
        aVar.f40906a = Internal.copyOf("feature_with_ab_map", this.feature_with_ab_map);
        aVar.f40907b = this.is_from_db;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("behavior", "GetABExperimentFeatureMapResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.feature_with_ab_map.isEmpty()) {
            sb.append(", feature_with_ab_map=");
            sb.append(this.feature_with_ab_map);
        }
        if (this.is_from_db != null) {
            sb.append(", is_from_db=");
            sb.append(this.is_from_db);
        }
        StringBuilder replace = sb.replace(0, 2, "GetABExperimentFeatureMapResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetABExperimentFeatureMapResponse(Map<String, String> map, Boolean bool) {
        this(map, bool, ByteString.EMPTY);
    }

    public GetABExperimentFeatureMapResponse(Map<String, String> map, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.feature_with_ab_map = Internal.immutableCopyOf("feature_with_ab_map", map);
        this.is_from_db = bool;
    }
}
