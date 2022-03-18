package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SetUserASSettingRequest extends Message<SetUserASSettingRequest, C49519a> {
    public static final ProtoAdapter<SetUserASSettingRequest> ADAPTER = new C49520b();
    private static final long serialVersionUID = 0;
    public final FeatureType mfeature_type;
    public final UserASSetting msetting;

    /* renamed from: com.ss.android.lark.pb.ai.SetUserASSettingRequest$b */
    private static final class C49520b extends ProtoAdapter<SetUserASSettingRequest> {
        C49520b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetUserASSettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetUserASSettingRequest setUserASSettingRequest) {
            return UserASSetting.ADAPTER.encodedSizeWithTag(1, setUserASSettingRequest.msetting) + FeatureType.ADAPTER.encodedSizeWithTag(2, setUserASSettingRequest.mfeature_type) + setUserASSettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetUserASSettingRequest decode(ProtoReader protoReader) throws IOException {
            C49519a aVar = new C49519a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124116a = UserASSetting.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f124117b = FeatureType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetUserASSettingRequest setUserASSettingRequest) throws IOException {
            UserASSetting.ADAPTER.encodeWithTag(protoWriter, 1, setUserASSettingRequest.msetting);
            FeatureType.ADAPTER.encodeWithTag(protoWriter, 2, setUserASSettingRequest.mfeature_type);
            protoWriter.writeBytes(setUserASSettingRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49519a newBuilder() {
        C49519a aVar = new C49519a();
        aVar.f124116a = this.msetting;
        aVar.f124117b = this.mfeature_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.ai.SetUserASSettingRequest$a */
    public static final class C49519a extends Message.Builder<SetUserASSettingRequest, C49519a> {

        /* renamed from: a */
        public UserASSetting f124116a;

        /* renamed from: b */
        public FeatureType f124117b;

        /* renamed from: a */
        public SetUserASSettingRequest build() {
            FeatureType featureType;
            UserASSetting userASSetting = this.f124116a;
            if (userASSetting != null && (featureType = this.f124117b) != null) {
                return new SetUserASSettingRequest(userASSetting, featureType, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(userASSetting, "msetting", this.f124117b, "mfeature_type");
        }

        /* renamed from: a */
        public C49519a mo172715a(FeatureType featureType) {
            this.f124117b = featureType;
            return this;
        }

        /* renamed from: a */
        public C49519a mo172716a(UserASSetting userASSetting) {
            this.f124116a = userASSetting;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", setting=");
        sb.append(this.msetting);
        sb.append(", feature_type=");
        sb.append(this.mfeature_type);
        StringBuilder replace = sb.replace(0, 2, "SetUserASSettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetUserASSettingRequest(UserASSetting userASSetting, FeatureType featureType) {
        this(userASSetting, featureType, ByteString.EMPTY);
    }

    public SetUserASSettingRequest(UserASSetting userASSetting, FeatureType featureType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.msetting = userASSetting;
        this.mfeature_type = featureType;
    }
}
