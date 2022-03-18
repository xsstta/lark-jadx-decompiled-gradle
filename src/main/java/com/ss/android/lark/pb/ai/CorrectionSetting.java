package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CorrectionSetting extends Message<CorrectionSetting, C49441a> {
    public static final ProtoAdapter<CorrectionSetting> ADAPTER = new C49442b();
    public static final Boolean DEFAULT_IS_ENABLED = false;
    private static final long serialVersionUID = 0;
    public final SceneSetting mdocs_setting;
    public final Boolean mis_enabled;
    public final SceneSetting mmail_setting;
    public final SceneSetting mmessenger_setting;
    public final SceneSetting mminutes_setting;

    /* renamed from: com.ss.android.lark.pb.ai.CorrectionSetting$b */
    private static final class C49442b extends ProtoAdapter<CorrectionSetting> {
        C49442b() {
            super(FieldEncoding.LENGTH_DELIMITED, CorrectionSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(CorrectionSetting correctionSetting) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (correctionSetting.mis_enabled != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, correctionSetting.mis_enabled);
            } else {
                i = 0;
            }
            if (correctionSetting.mmessenger_setting != null) {
                i2 = SceneSetting.ADAPTER.encodedSizeWithTag(2, correctionSetting.mmessenger_setting);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (correctionSetting.mmail_setting != null) {
                i3 = SceneSetting.ADAPTER.encodedSizeWithTag(3, correctionSetting.mmail_setting);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (correctionSetting.mdocs_setting != null) {
                i4 = SceneSetting.ADAPTER.encodedSizeWithTag(4, correctionSetting.mdocs_setting);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (correctionSetting.mminutes_setting != null) {
                i5 = SceneSetting.ADAPTER.encodedSizeWithTag(5, correctionSetting.mminutes_setting);
            }
            return i8 + i5 + correctionSetting.unknownFields().size();
        }

        /* renamed from: a */
        public CorrectionSetting decode(ProtoReader protoReader) throws IOException {
            C49441a aVar = new C49441a();
            aVar.f123996a = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f123996a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f123997b = SceneSetting.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f123998c = SceneSetting.ADAPTER.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f123999d = SceneSetting.ADAPTER.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124000e = SceneSetting.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CorrectionSetting correctionSetting) throws IOException {
            if (correctionSetting.mis_enabled != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, correctionSetting.mis_enabled);
            }
            if (correctionSetting.mmessenger_setting != null) {
                SceneSetting.ADAPTER.encodeWithTag(protoWriter, 2, correctionSetting.mmessenger_setting);
            }
            if (correctionSetting.mmail_setting != null) {
                SceneSetting.ADAPTER.encodeWithTag(protoWriter, 3, correctionSetting.mmail_setting);
            }
            if (correctionSetting.mdocs_setting != null) {
                SceneSetting.ADAPTER.encodeWithTag(protoWriter, 4, correctionSetting.mdocs_setting);
            }
            if (correctionSetting.mminutes_setting != null) {
                SceneSetting.ADAPTER.encodeWithTag(protoWriter, 5, correctionSetting.mminutes_setting);
            }
            protoWriter.writeBytes(correctionSetting.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.CorrectionSetting$a */
    public static final class C49441a extends Message.Builder<CorrectionSetting, C49441a> {

        /* renamed from: a */
        public Boolean f123996a;

        /* renamed from: b */
        public SceneSetting f123997b;

        /* renamed from: c */
        public SceneSetting f123998c;

        /* renamed from: d */
        public SceneSetting f123999d;

        /* renamed from: e */
        public SceneSetting f124000e;

        /* renamed from: a */
        public CorrectionSetting build() {
            return new CorrectionSetting(this.f123996a, this.f123997b, this.f123998c, this.f123999d, this.f124000e, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C49441a mo172524a(SceneSetting sceneSetting) {
            this.f123997b = sceneSetting;
            return this;
        }

        /* renamed from: b */
        public C49441a mo172526b(SceneSetting sceneSetting) {
            this.f123998c = sceneSetting;
            return this;
        }

        /* renamed from: c */
        public C49441a mo172527c(SceneSetting sceneSetting) {
            this.f123999d = sceneSetting;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49441a newBuilder() {
        C49441a aVar = new C49441a();
        aVar.f123996a = this.mis_enabled;
        aVar.f123997b = this.mmessenger_setting;
        aVar.f123998c = this.mmail_setting;
        aVar.f123999d = this.mdocs_setting;
        aVar.f124000e = this.mminutes_setting;
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
        if (this.mminutes_setting != null) {
            sb.append(", minutes_setting=");
            sb.append(this.mminutes_setting);
        }
        StringBuilder replace = sb.replace(0, 2, "CorrectionSetting{");
        replace.append('}');
        return replace.toString();
    }

    public CorrectionSetting(Boolean bool, SceneSetting sceneSetting, SceneSetting sceneSetting2, SceneSetting sceneSetting3, SceneSetting sceneSetting4) {
        this(bool, sceneSetting, sceneSetting2, sceneSetting3, sceneSetting4, ByteString.EMPTY);
    }

    public CorrectionSetting(Boolean bool, SceneSetting sceneSetting, SceneSetting sceneSetting2, SceneSetting sceneSetting3, SceneSetting sceneSetting4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mis_enabled = bool;
        this.mmessenger_setting = sceneSetting;
        this.mmail_setting = sceneSetting2;
        this.mdocs_setting = sceneSetting3;
        this.mminutes_setting = sceneSetting4;
    }
}
