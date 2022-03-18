package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class FeatureSetting extends Message<FeatureSetting, C49459a> {
    public static final ProtoAdapter<FeatureSetting> ADAPTER = new C49460b();
    public static final Boolean DEFAULT_IS_ENABLED = false;
    public static final Boolean DEFAULT_IS_TENANT_ENABLED = false;
    private static final long serialVersionUID = 0;
    public final SceneSetting mdocs_setting;
    public final Boolean mis_enabled;
    public final Boolean mis_tenant_enabled;
    public final SceneSetting mmail_setting;
    public final SceneSetting mmessenger_setting;

    /* renamed from: com.ss.android.lark.pb.ai.FeatureSetting$b */
    private static final class C49460b extends ProtoAdapter<FeatureSetting> {
        C49460b() {
            super(FieldEncoding.LENGTH_DELIMITED, FeatureSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(FeatureSetting featureSetting) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (featureSetting.mis_enabled != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, featureSetting.mis_enabled);
            } else {
                i = 0;
            }
            if (featureSetting.mmessenger_setting != null) {
                i2 = SceneSetting.ADAPTER.encodedSizeWithTag(2, featureSetting.mmessenger_setting);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (featureSetting.mmail_setting != null) {
                i3 = SceneSetting.ADAPTER.encodedSizeWithTag(3, featureSetting.mmail_setting);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (featureSetting.mdocs_setting != null) {
                i4 = SceneSetting.ADAPTER.encodedSizeWithTag(4, featureSetting.mdocs_setting);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (featureSetting.mis_tenant_enabled != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, featureSetting.mis_tenant_enabled);
            }
            return i8 + i5 + featureSetting.unknownFields().size();
        }

        /* renamed from: a */
        public FeatureSetting decode(ProtoReader protoReader) throws IOException {
            C49459a aVar = new C49459a();
            aVar.f124052a = false;
            aVar.f124056e = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124052a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124053b = SceneSetting.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f124054c = SceneSetting.ADAPTER.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f124055d = SceneSetting.ADAPTER.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124056e = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FeatureSetting featureSetting) throws IOException {
            if (featureSetting.mis_enabled != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, featureSetting.mis_enabled);
            }
            if (featureSetting.mmessenger_setting != null) {
                SceneSetting.ADAPTER.encodeWithTag(protoWriter, 2, featureSetting.mmessenger_setting);
            }
            if (featureSetting.mmail_setting != null) {
                SceneSetting.ADAPTER.encodeWithTag(protoWriter, 3, featureSetting.mmail_setting);
            }
            if (featureSetting.mdocs_setting != null) {
                SceneSetting.ADAPTER.encodeWithTag(protoWriter, 4, featureSetting.mdocs_setting);
            }
            if (featureSetting.mis_tenant_enabled != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, featureSetting.mis_tenant_enabled);
            }
            protoWriter.writeBytes(featureSetting.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.FeatureSetting$a */
    public static final class C49459a extends Message.Builder<FeatureSetting, C49459a> {

        /* renamed from: a */
        public Boolean f124052a;

        /* renamed from: b */
        public SceneSetting f124053b;

        /* renamed from: c */
        public SceneSetting f124054c;

        /* renamed from: d */
        public SceneSetting f124055d;

        /* renamed from: e */
        public Boolean f124056e;

        /* renamed from: a */
        public FeatureSetting build() {
            return new FeatureSetting(this.f124052a, this.f124053b, this.f124054c, this.f124055d, this.f124056e, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C49459a mo172574a(SceneSetting sceneSetting) {
            this.f124053b = sceneSetting;
            return this;
        }

        /* renamed from: b */
        public C49459a mo172577b(SceneSetting sceneSetting) {
            this.f124054c = sceneSetting;
            return this;
        }

        /* renamed from: c */
        public C49459a mo172578c(SceneSetting sceneSetting) {
            this.f124055d = sceneSetting;
            return this;
        }

        /* renamed from: a */
        public C49459a mo172575a(Boolean bool) {
            this.f124056e = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49459a newBuilder() {
        C49459a aVar = new C49459a();
        aVar.f124052a = this.mis_enabled;
        aVar.f124053b = this.mmessenger_setting;
        aVar.f124054c = this.mmail_setting;
        aVar.f124055d = this.mdocs_setting;
        aVar.f124056e = this.mis_tenant_enabled;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mis_enabled != null) {
            sb.append(", is_enabled=");
            sb.append(this.mis_enabled);
        }
        if (this.mmessenger_setting != null) {
            sb.append(", messenger_setting=");
            sb.append(this.mmessenger_setting);
        }
        if (this.mmail_setting != null) {
            sb.append(", mail_setting=");
            sb.append(this.mmail_setting);
        }
        if (this.mdocs_setting != null) {
            sb.append(", docs_setting=");
            sb.append(this.mdocs_setting);
        }
        if (this.mis_tenant_enabled != null) {
            sb.append(", is_tenant_enabled=");
            sb.append(this.mis_tenant_enabled);
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
        this.mis_enabled = bool;
        this.mmessenger_setting = sceneSetting;
        this.mmail_setting = sceneSetting2;
        this.mdocs_setting = sceneSetting3;
        this.mis_tenant_enabled = bool2;
    }
}
