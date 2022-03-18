package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class LanguageType extends Message<LanguageType, C50841a> {
    public static final ProtoAdapter<LanguageType> ADAPTER = new C50842b();
    private static final long serialVersionUID = 0;
    public final String desp_i18n_key;
    public final String icon_str;
    public final String language_type;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.LanguageType$b */
    private static final class C50842b extends ProtoAdapter<LanguageType> {
        C50842b() {
            super(FieldEncoding.LENGTH_DELIMITED, LanguageType.class);
        }

        /* renamed from: a */
        public int encodedSize(LanguageType languageType) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, languageType.language_type);
            int i2 = 0;
            if (languageType.desp_i18n_key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, languageType.desp_i18n_key);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (languageType.icon_str != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, languageType.icon_str);
            }
            return i3 + i2 + languageType.unknownFields().size();
        }

        /* renamed from: a */
        public LanguageType decode(ProtoReader protoReader) throws IOException {
            C50841a aVar = new C50841a();
            aVar.f126732a = "";
            aVar.f126733b = "";
            aVar.f126734c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126732a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f126733b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126734c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, LanguageType languageType) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, languageType.language_type);
            if (languageType.desp_i18n_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, languageType.desp_i18n_key);
            }
            if (languageType.icon_str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, languageType.icon_str);
            }
            protoWriter.writeBytes(languageType.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50841a newBuilder() {
        C50841a aVar = new C50841a();
        aVar.f126732a = this.language_type;
        aVar.f126733b = this.desp_i18n_key;
        aVar.f126734c = this.icon_str;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.LanguageType$a */
    public static final class C50841a extends Message.Builder<LanguageType, C50841a> {

        /* renamed from: a */
        public String f126732a;

        /* renamed from: b */
        public String f126733b;

        /* renamed from: c */
        public String f126734c;

        /* renamed from: a */
        public LanguageType build() {
            String str = this.f126732a;
            if (str != null) {
                return new LanguageType(str, this.f126733b, this.f126734c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "language_type");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "LanguageType");
        StringBuilder sb = new StringBuilder();
        sb.append(", language_type=");
        sb.append(this.language_type);
        if (this.desp_i18n_key != null) {
            sb.append(", desp_i18n_key=");
            sb.append(this.desp_i18n_key);
        }
        if (this.icon_str != null) {
            sb.append(", icon_str=");
            sb.append(this.icon_str);
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
        this.language_type = str;
        this.desp_i18n_key = str2;
        this.icon_str = str3;
    }
}
