package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PushUserASSetting extends Message<PushUserASSetting, C49505a> {
    public static final ProtoAdapter<PushUserASSetting> ADAPTER = new C49506b();
    private static final long serialVersionUID = 0;
    public final FeatureType mfeature_type;
    public final UserASSetting msetting;

    /* renamed from: com.ss.android.lark.pb.ai.PushUserASSetting$b */
    private static final class C49506b extends ProtoAdapter<PushUserASSetting> {
        C49506b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushUserASSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(PushUserASSetting pushUserASSetting) {
            return UserASSetting.ADAPTER.encodedSizeWithTag(1, pushUserASSetting.msetting) + FeatureType.ADAPTER.encodedSizeWithTag(2, pushUserASSetting.mfeature_type) + pushUserASSetting.unknownFields().size();
        }

        /* renamed from: a */
        public PushUserASSetting decode(ProtoReader protoReader) throws IOException {
            C49505a aVar = new C49505a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124102a = UserASSetting.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f124103b = FeatureType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushUserASSetting pushUserASSetting) throws IOException {
            UserASSetting.ADAPTER.encodeWithTag(protoWriter, 1, pushUserASSetting.msetting);
            FeatureType.ADAPTER.encodeWithTag(protoWriter, 2, pushUserASSetting.mfeature_type);
            protoWriter.writeBytes(pushUserASSetting.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49505a newBuilder() {
        C49505a aVar = new C49505a();
        aVar.f124102a = this.msetting;
        aVar.f124103b = this.mfeature_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.ai.PushUserASSetting$a */
    public static final class C49505a extends Message.Builder<PushUserASSetting, C49505a> {

        /* renamed from: a */
        public UserASSetting f124102a;

        /* renamed from: b */
        public FeatureType f124103b;

        /* renamed from: a */
        public PushUserASSetting build() {
            FeatureType featureType;
            UserASSetting userASSetting = this.f124102a;
            if (userASSetting != null && (featureType = this.f124103b) != null) {
                return new PushUserASSetting(userASSetting, featureType, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(userASSetting, "msetting", this.f124103b, "mfeature_type");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", setting=");
        sb.append(this.msetting);
        sb.append(", feature_type=");
        sb.append(this.mfeature_type);
        StringBuilder replace = sb.replace(0, 2, "PushUserASSetting{");
        replace.append('}');
        return replace.toString();
    }

    public PushUserASSetting(UserASSetting userASSetting, FeatureType featureType) {
        this(userASSetting, featureType, ByteString.EMPTY);
    }

    public PushUserASSetting(UserASSetting userASSetting, FeatureType featureType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.msetting = userASSetting;
        this.mfeature_type = featureType;
    }
}
