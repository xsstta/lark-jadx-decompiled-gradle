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

public final class PushUserASSetting extends Message<PushUserASSetting, C1637a> {
    public static final ProtoAdapter<PushUserASSetting> ADAPTER = new C1638b();
    public static final FeatureType DEFAULT_FEATURE_TYPE = FeatureType.DEFAULT;
    private static final long serialVersionUID = 0;
    public final FeatureType feature_type;
    public final UserASSetting setting;

    /* renamed from: as_setting.PushUserASSetting$b */
    private static final class C1638b extends ProtoAdapter<PushUserASSetting> {
        C1638b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushUserASSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(PushUserASSetting pushUserASSetting) {
            return UserASSetting.ADAPTER.encodedSizeWithTag(1, pushUserASSetting.setting) + FeatureType.ADAPTER.encodedSizeWithTag(2, pushUserASSetting.feature_type) + pushUserASSetting.unknownFields().size();
        }

        /* renamed from: a */
        public PushUserASSetting decode(ProtoReader protoReader) throws IOException {
            C1637a aVar = new C1637a();
            aVar.f5619b = FeatureType.DEFAULT;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f5618a = UserASSetting.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f5619b = FeatureType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushUserASSetting pushUserASSetting) throws IOException {
            UserASSetting.ADAPTER.encodeWithTag(protoWriter, 1, pushUserASSetting.setting);
            FeatureType.ADAPTER.encodeWithTag(protoWriter, 2, pushUserASSetting.feature_type);
            protoWriter.writeBytes(pushUserASSetting.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C1637a newBuilder() {
        C1637a aVar = new C1637a();
        aVar.f5618a = this.setting;
        aVar.f5619b = this.feature_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: as_setting.PushUserASSetting$a */
    public static final class C1637a extends Message.Builder<PushUserASSetting, C1637a> {

        /* renamed from: a */
        public UserASSetting f5618a;

        /* renamed from: b */
        public FeatureType f5619b;

        /* renamed from: a */
        public PushUserASSetting build() {
            FeatureType featureType;
            UserASSetting userASSetting = this.f5618a;
            if (userASSetting != null && (featureType = this.f5619b) != null) {
                return new PushUserASSetting(userASSetting, featureType, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(userASSetting, "setting", this.f5619b, "feature_type");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("as_setting", "PushUserASSetting");
        StringBuilder sb = new StringBuilder();
        sb.append(", setting=");
        sb.append(this.setting);
        sb.append(", feature_type=");
        sb.append(this.feature_type);
        StringBuilder replace = sb.replace(0, 2, "PushUserASSetting{");
        replace.append('}');
        return replace.toString();
    }

    public PushUserASSetting(UserASSetting userASSetting, FeatureType featureType) {
        this(userASSetting, featureType, ByteString.EMPTY);
    }

    public PushUserASSetting(UserASSetting userASSetting, FeatureType featureType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.setting = userASSetting;
        this.feature_type = featureType;
    }
}
