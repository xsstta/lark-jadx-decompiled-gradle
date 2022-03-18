package as_setting;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class FeatureSetting extends Message<FeatureSetting, C1631a> {
    public static final ProtoAdapter<FeatureSetting> ADAPTER = new C1632b();
    public static final Boolean DEFAULT_IS_ENABLED = false;
    public static final Boolean DEFAULT_IS_TENANT_ENABLED = false;
    private static final long serialVersionUID = 0;
    public final SceneSetting docs_setting;
    public final Boolean is_enabled;
    public final Boolean is_tenant_enabled;
    public final SceneSetting mail_setting;
    public final SceneSetting messenger_setting;

    /* renamed from: as_setting.FeatureSetting$b */
    private static final class C1632b extends ProtoAdapter<FeatureSetting> {
        C1632b() {
            super(FieldEncoding.LENGTH_DELIMITED, FeatureSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(FeatureSetting featureSetting) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (featureSetting.is_enabled != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, featureSetting.is_enabled);
            } else {
                i = 0;
            }
            if (featureSetting.messenger_setting != null) {
                i2 = SceneSetting.ADAPTER.encodedSizeWithTag(2, featureSetting.messenger_setting);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (featureSetting.mail_setting != null) {
                i3 = SceneSetting.ADAPTER.encodedSizeWithTag(3, featureSetting.mail_setting);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (featureSetting.docs_setting != null) {
                i4 = SceneSetting.ADAPTER.encodedSizeWithTag(4, featureSetting.docs_setting);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (featureSetting.is_tenant_enabled != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, featureSetting.is_tenant_enabled);
            }
            return i8 + i5 + featureSetting.unknownFields().size();
        }

        /* renamed from: a */
        public FeatureSetting decode(ProtoReader protoReader) throws IOException {
            C1631a aVar = new C1631a();
            aVar.f5611a = false;
            aVar.f5615e = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f5611a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f5612b = SceneSetting.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f5613c = SceneSetting.ADAPTER.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f5614d = SceneSetting.ADAPTER.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f5615e = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FeatureSetting featureSetting) throws IOException {
            if (featureSetting.is_enabled != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, featureSetting.is_enabled);
            }
            if (featureSetting.messenger_setting != null) {
                SceneSetting.ADAPTER.encodeWithTag(protoWriter, 2, featureSetting.messenger_setting);
            }
            if (featureSetting.mail_setting != null) {
                SceneSetting.ADAPTER.encodeWithTag(protoWriter, 3, featureSetting.mail_setting);
            }
            if (featureSetting.docs_setting != null) {
                SceneSetting.ADAPTER.encodeWithTag(protoWriter, 4, featureSetting.docs_setting);
            }
            if (featureSetting.is_tenant_enabled != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, featureSetting.is_tenant_enabled);
            }
            protoWriter.writeBytes(featureSetting.unknownFields());
        }
    }

    /* renamed from: as_setting.FeatureSetting$a */
    public static final class C1631a extends Message.Builder<FeatureSetting, C1631a> {

        /* renamed from: a */
        public Boolean f5611a;

        /* renamed from: b */
        public SceneSetting f5612b;

        /* renamed from: c */
        public SceneSetting f5613c;

        /* renamed from: d */
        public SceneSetting f5614d;

        /* renamed from: e */
        public Boolean f5615e;

        /* renamed from: a */
        public FeatureSetting build() {
            return new FeatureSetting(this.f5611a, this.f5612b, this.f5613c, this.f5614d, this.f5615e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C1631a newBuilder() {
        C1631a aVar = new C1631a();
        aVar.f5611a = this.is_enabled;
        aVar.f5612b = this.messenger_setting;
        aVar.f5613c = this.mail_setting;
        aVar.f5614d = this.docs_setting;
        aVar.f5615e = this.is_tenant_enabled;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("as_setting", "FeatureSetting");
        StringBuilder sb = new StringBuilder();
        if (this.is_enabled != null) {
            sb.append(", is_enabled=");
            sb.append(this.is_enabled);
        }
        if (this.messenger_setting != null) {
            sb.append(", messenger_setting=");
            sb.append(this.messenger_setting);
        }
        if (this.mail_setting != null) {
            sb.append(", mail_setting=");
            sb.append(this.mail_setting);
        }
        if (this.docs_setting != null) {
            sb.append(", docs_setting=");
            sb.append(this.docs_setting);
        }
        if (this.is_tenant_enabled != null) {
            sb.append(", is_tenant_enabled=");
            sb.append(this.is_tenant_enabled);
        }
        StringBuilder replace = sb.replace(0, 2, "FeatureSetting{");
        replace.append('}');
        return replace.toString();
    }

    public FeatureSetting(Boolean bool, SceneSetting sceneSetting, SceneSetting sceneSetting2, SceneSetting sceneSetting3, Boolean bool2) {
        this(bool, sceneSetting, sceneSetting2, sceneSetting3, bool2, ByteString.EMPTY);
    }

    public FeatureSetting(Boolean bool, SceneSetting sceneSetting, SceneSetting sceneSetting2, SceneSetting sceneSetting3, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_enabled = bool;
        this.messenger_setting = sceneSetting;
        this.mail_setting = sceneSetting2;
        this.docs_setting = sceneSetting3;
        this.is_tenant_enabled = bool2;
    }
}
