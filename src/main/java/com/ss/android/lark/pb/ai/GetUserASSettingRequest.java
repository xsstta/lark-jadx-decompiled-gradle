package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetUserASSettingRequest extends Message<GetUserASSettingRequest, C49483a> {
    public static final ProtoAdapter<GetUserASSettingRequest> ADAPTER = new C49484b();
    private static final long serialVersionUID = 0;
    public final FeatureType mfeature_type;

    /* renamed from: com.ss.android.lark.pb.ai.GetUserASSettingRequest$b */
    private static final class C49484b extends ProtoAdapter<GetUserASSettingRequest> {
        C49484b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserASSettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserASSettingRequest getUserASSettingRequest) {
            return FeatureType.ADAPTER.encodedSizeWithTag(1, getUserASSettingRequest.mfeature_type) + getUserASSettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserASSettingRequest decode(ProtoReader protoReader) throws IOException {
            C49483a aVar = new C49483a();
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
                    try {
                        aVar.f124078a = FeatureType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUserASSettingRequest getUserASSettingRequest) throws IOException {
            FeatureType.ADAPTER.encodeWithTag(protoWriter, 1, getUserASSettingRequest.mfeature_type);
            protoWriter.writeBytes(getUserASSettingRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.GetUserASSettingRequest$a */
    public static final class C49483a extends Message.Builder<GetUserASSettingRequest, C49483a> {

        /* renamed from: a */
        public FeatureType f124078a;

        /* renamed from: a */
        public GetUserASSettingRequest build() {
            FeatureType featureType = this.f124078a;
            if (featureType != null) {
                return new GetUserASSettingRequest(featureType, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(featureType, "mfeature_type");
        }

        /* renamed from: a */
        public C49483a mo172632a(FeatureType featureType) {
            this.f124078a = featureType;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49483a newBuilder() {
        C49483a aVar = new C49483a();
        aVar.f124078a = this.mfeature_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", feature_type=");
        sb.append(this.mfeature_type);
        StringBuilder replace = sb.replace(0, 2, "GetUserASSettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserASSettingRequest(FeatureType featureType) {
        this(featureType, ByteString.EMPTY);
    }

    public GetUserASSettingRequest(FeatureType featureType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mfeature_type = featureType;
    }
}
