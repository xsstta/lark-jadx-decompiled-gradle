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

public final class SetUserASSettingRequest extends Message<SetUserASSettingRequest, C1641a> {
    public static final ProtoAdapter<SetUserASSettingRequest> ADAPTER = new C1642b();
    public static final FeatureType DEFAULT_FEATURE_TYPE = FeatureType.DEFAULT;
    private static final long serialVersionUID = 0;
    public final FeatureType feature_type;
    public final UserASSetting setting;

    /* renamed from: as_setting.SetUserASSettingRequest$b */
    private static final class C1642b extends ProtoAdapter<SetUserASSettingRequest> {
        C1642b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetUserASSettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetUserASSettingRequest setUserASSettingRequest) {
            return UserASSetting.ADAPTER.encodedSizeWithTag(1, setUserASSettingRequest.setting) + FeatureType.ADAPTER.encodedSizeWithTag(2, setUserASSettingRequest.feature_type) + setUserASSettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetUserASSettingRequest decode(ProtoReader protoReader) throws IOException {
            C1641a aVar = new C1641a();
            aVar.f5622b = FeatureType.DEFAULT;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f5621a = UserASSetting.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f5622b = FeatureType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetUserASSettingRequest setUserASSettingRequest) throws IOException {
            UserASSetting.ADAPTER.encodeWithTag(protoWriter, 1, setUserASSettingRequest.setting);
            FeatureType.ADAPTER.encodeWithTag(protoWriter, 2, setUserASSettingRequest.feature_type);
            protoWriter.writeBytes(setUserASSettingRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C1641a newBuilder() {
        C1641a aVar = new C1641a();
        aVar.f5621a = this.setting;
        aVar.f5622b = this.feature_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: as_setting.SetUserASSettingRequest$a */
    public static final class C1641a extends Message.Builder<SetUserASSettingRequest, C1641a> {

        /* renamed from: a */
        public UserASSetting f5621a;

        /* renamed from: b */
        public FeatureType f5622b;

        /* renamed from: a */
        public SetUserASSettingRequest build() {
            FeatureType featureType;
            UserASSetting userASSetting = this.f5621a;
            if (userASSetting != null && (featureType = this.f5622b) != null) {
                return new SetUserASSettingRequest(userASSetting, featureType, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(userASSetting, "setting", this.f5622b, "feature_type");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("as_setting", "SetUserASSettingRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", setting=");
        sb.append(this.setting);
        sb.append(", feature_type=");
        sb.append(this.feature_type);
        StringBuilder replace = sb.replace(0, 2, "SetUserASSettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetUserASSettingRequest(UserASSetting userASSetting, FeatureType featureType) {
        this(userASSetting, featureType, ByteString.EMPTY);
    }

    public SetUserASSettingRequest(UserASSetting userASSetting, FeatureType featureType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.setting = userASSetting;
        this.feature_type = featureType;
    }
}
