package as_setting;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetUserASSettingRequest extends Message<GetUserASSettingRequest, C1633a> {
    public static final ProtoAdapter<GetUserASSettingRequest> ADAPTER = new C1634b();
    public static final FeatureType DEFAULT_FEATURE_TYPE = FeatureType.DEFAULT;
    private static final long serialVersionUID = 0;
    public final FeatureType feature_type;

    /* renamed from: as_setting.GetUserASSettingRequest$b */
    private static final class C1634b extends ProtoAdapter<GetUserASSettingRequest> {
        C1634b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserASSettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserASSettingRequest getUserASSettingRequest) {
            return FeatureType.ADAPTER.encodedSizeWithTag(1, getUserASSettingRequest.feature_type) + getUserASSettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserASSettingRequest decode(ProtoReader protoReader) throws IOException {
            C1633a aVar = new C1633a();
            aVar.f5616a = FeatureType.DEFAULT;
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
                        aVar.f5616a = FeatureType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUserASSettingRequest getUserASSettingRequest) throws IOException {
            FeatureType.ADAPTER.encodeWithTag(protoWriter, 1, getUserASSettingRequest.feature_type);
            protoWriter.writeBytes(getUserASSettingRequest.unknownFields());
        }
    }

    /* renamed from: as_setting.GetUserASSettingRequest$a */
    public static final class C1633a extends Message.Builder<GetUserASSettingRequest, C1633a> {

        /* renamed from: a */
        public FeatureType f5616a;

        /* renamed from: a */
        public GetUserASSettingRequest build() {
            FeatureType featureType = this.f5616a;
            if (featureType != null) {
                return new GetUserASSettingRequest(featureType, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(featureType, "feature_type");
        }
    }

    @Override // com.squareup.wire.Message
    public C1633a newBuilder() {
        C1633a aVar = new C1633a();
        aVar.f5616a = this.feature_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("as_setting", "GetUserASSettingRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", feature_type=");
        sb.append(this.feature_type);
        StringBuilder replace = sb.replace(0, 2, "GetUserASSettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserASSettingRequest(FeatureType featureType) {
        this(featureType, ByteString.EMPTY);
    }

    public GetUserASSettingRequest(FeatureType featureType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.feature_type = featureType;
    }
}
