package com.bytedance.lark.pb.behavior.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetABExperimentFeatureMapRequest extends Message<GetABExperimentFeatureMapRequest, C15452a> {
    public static final ProtoAdapter<GetABExperimentFeatureMapRequest> ADAPTER = new C15453b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.behavior.v1.GetABExperimentFeatureMapRequest$b */
    private static final class C15453b extends ProtoAdapter<GetABExperimentFeatureMapRequest> {
        C15453b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetABExperimentFeatureMapRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetABExperimentFeatureMapRequest getABExperimentFeatureMapRequest) {
            return getABExperimentFeatureMapRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetABExperimentFeatureMapRequest decode(ProtoReader protoReader) throws IOException {
            C15452a aVar = new C15452a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetABExperimentFeatureMapRequest getABExperimentFeatureMapRequest) throws IOException {
            protoWriter.writeBytes(getABExperimentFeatureMapRequest.unknownFields());
        }
    }

    public GetABExperimentFeatureMapRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.behavior.v1.GetABExperimentFeatureMapRequest$a */
    public static final class C15452a extends Message.Builder<GetABExperimentFeatureMapRequest, C15452a> {
        /* renamed from: a */
        public GetABExperimentFeatureMapRequest build() {
            return new GetABExperimentFeatureMapRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15452a newBuilder() {
        C15452a aVar = new C15452a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("behavior", "GetABExperimentFeatureMapRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetABExperimentFeatureMapRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetABExperimentFeatureMapRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
