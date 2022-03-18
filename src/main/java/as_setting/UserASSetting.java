package as_setting;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UserASSetting extends Message<UserASSetting, C1645a> {
    public static final ProtoAdapter<UserASSetting> ADAPTER = new C1646b();
    private static final long serialVersionUID = 0;
    public final FeatureSetting nautilus_setting;

    /* renamed from: as_setting.UserASSetting$b */
    private static final class C1646b extends ProtoAdapter<UserASSetting> {
        C1646b() {
            super(FieldEncoding.LENGTH_DELIMITED, UserASSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(UserASSetting userASSetting) {
            int i;
            if (userASSetting.nautilus_setting != null) {
                i = FeatureSetting.ADAPTER.encodedSizeWithTag(1, userASSetting.nautilus_setting);
            } else {
                i = 0;
            }
            return i + userASSetting.unknownFields().size();
        }

        /* renamed from: a */
        public UserASSetting decode(ProtoReader protoReader) throws IOException {
            C1645a aVar = new C1645a();
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
                    aVar.f5623a = FeatureSetting.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UserASSetting userASSetting) throws IOException {
            if (userASSetting.nautilus_setting != null) {
                FeatureSetting.ADAPTER.encodeWithTag(protoWriter, 1, userASSetting.nautilus_setting);
            }
            protoWriter.writeBytes(userASSetting.unknownFields());
        }
    }

    /* renamed from: as_setting.UserASSetting$a */
    public static final class C1645a extends Message.Builder<UserASSetting, C1645a> {

        /* renamed from: a */
        public FeatureSetting f5623a;

        /* renamed from: a */
        public UserASSetting build() {
            return new UserASSetting(this.f5623a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C1645a newBuilder() {
        C1645a aVar = new C1645a();
        aVar.f5623a = this.nautilus_setting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("as_setting", "UserASSetting");
        StringBuilder sb = new StringBuilder();
        if (this.nautilus_setting != null) {
            sb.append(", nautilus_setting=");
            sb.append(this.nautilus_setting);
        }
        StringBuilder replace = sb.replace(0, 2, "UserASSetting{");
        replace.append('}');
        return replace.toString();
    }

    public UserASSetting(FeatureSetting featureSetting) {
        this(featureSetting, ByteString.EMPTY);
    }

    public UserASSetting(FeatureSetting featureSetting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.nautilus_setting = featureSetting;
    }
}
