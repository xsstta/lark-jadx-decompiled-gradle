package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class LanguageType extends Message<LanguageType, C50366a> {
    public static final ProtoAdapter<LanguageType> ADAPTER = new C50367b();
    private static final long serialVersionUID = 0;
    public final String mdesp_i18n_key;
    public final String micon_str;
    public final String mlanguage_type;

    /* renamed from: com.ss.android.lark.pb.videochat.LanguageType$b */
    private static final class C50367b extends ProtoAdapter<LanguageType> {
        C50367b() {
            super(FieldEncoding.LENGTH_DELIMITED, LanguageType.class);
        }

        /* renamed from: a */
        public int encodedSize(LanguageType languageType) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, languageType.mlanguage_type);
            int i2 = 0;
            if (languageType.mdesp_i18n_key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, languageType.mdesp_i18n_key);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (languageType.micon_str != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, languageType.micon_str);
            }
            return i3 + i2 + languageType.unknownFields().size();
        }

        /* renamed from: a */
        public LanguageType decode(ProtoReader protoReader) throws IOException {
            C50366a aVar = new C50366a();
            aVar.f125757a = "";
            aVar.f125758b = "";
            aVar.f125759c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125757a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125758b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125759c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, LanguageType languageType) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, languageType.mlanguage_type);
            if (languageType.mdesp_i18n_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, languageType.mdesp_i18n_key);
            }
            if (languageType.micon_str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, languageType.micon_str);
            }
            protoWriter.writeBytes(languageType.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50366a newBuilder() {
        C50366a aVar = new C50366a();
        aVar.f125757a = this.mlanguage_type;
        aVar.f125758b = this.mdesp_i18n_key;
        aVar.f125759c = this.micon_str;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videochat.LanguageType$a */
    public static final class C50366a extends Message.Builder<LanguageType, C50366a> {

        /* renamed from: a */
        public String f125757a;

        /* renamed from: b */
        public String f125758b;

        /* renamed from: c */
        public String f125759c;

        /* renamed from: a */
        public LanguageType build() {
            String str = this.f125757a;
            if (str != null) {
                return new LanguageType(str, this.f125758b, this.f125759c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mlanguage_type");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", language_type=");
        sb.append(this.mlanguage_type);
        if (this.mdesp_i18n_key != null) {
            sb.append(", desp_i18n_key=");
            sb.append(this.mdesp_i18n_key);
        }
        if (this.micon_str != null) {
            sb.append(", icon_str=");
            sb.append(this.micon_str);
        }
        StringBuilder replace = sb.replace(0, 2, "LanguageType{");
        replace.append('}');
        return replace.toString();
    }

    public LanguageType(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public LanguageType(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mlanguage_type = str;
        this.mdesp_i18n_key = str2;
        this.micon_str = str3;
    }
}
