package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetPstnSipFeatureConfigResponse extends Message<GetPstnSipFeatureConfigResponse, C50332a> {
    public static final ProtoAdapter<GetPstnSipFeatureConfigResponse> ADAPTER = new C50333b();
    private static final long serialVersionUID = 0;
    public final FeatureConfig mfeature_config;

    /* renamed from: com.ss.android.lark.pb.videochat.GetPstnSipFeatureConfigResponse$b */
    private static final class C50333b extends ProtoAdapter<GetPstnSipFeatureConfigResponse> {
        C50333b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetPstnSipFeatureConfigResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetPstnSipFeatureConfigResponse getPstnSipFeatureConfigResponse) {
            int i;
            if (getPstnSipFeatureConfigResponse.mfeature_config != null) {
                i = FeatureConfig.ADAPTER.encodedSizeWithTag(1, getPstnSipFeatureConfigResponse.mfeature_config);
            } else {
                i = 0;
            }
            return i + getPstnSipFeatureConfigResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetPstnSipFeatureConfigResponse decode(ProtoReader protoReader) throws IOException {
            C50332a aVar = new C50332a();
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
                    aVar.f125713a = FeatureConfig.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetPstnSipFeatureConfigResponse getPstnSipFeatureConfigResponse) throws IOException {
            if (getPstnSipFeatureConfigResponse.mfeature_config != null) {
                FeatureConfig.ADAPTER.encodeWithTag(protoWriter, 1, getPstnSipFeatureConfigResponse.mfeature_config);
            }
            protoWriter.writeBytes(getPstnSipFeatureConfigResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.GetPstnSipFeatureConfigResponse$a */
    public static final class C50332a extends Message.Builder<GetPstnSipFeatureConfigResponse, C50332a> {

        /* renamed from: a */
        public FeatureConfig f125713a;

        /* renamed from: a */
        public GetPstnSipFeatureConfigResponse build() {
            return new GetPstnSipFeatureConfigResponse(this.f125713a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50332a newBuilder() {
        C50332a aVar = new C50332a();
        aVar.f125713a = this.mfeature_config;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mfeature_config != null) {
            sb.append(", feature_config=");
            sb.append(this.mfeature_config);
        }
        StringBuilder replace = sb.replace(0, 2, "GetPstnSipFeatureConfigResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetPstnSipFeatureConfigResponse(FeatureConfig featureConfig) {
        this(featureConfig, ByteString.EMPTY);
    }

    public GetPstnSipFeatureConfigResponse(FeatureConfig featureConfig, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mfeature_config = featureConfig;
    }
}
