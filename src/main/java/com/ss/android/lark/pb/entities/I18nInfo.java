package com.ss.android.lark.pb.entities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class I18nInfo extends Message<I18nInfo, C49708a> {
    public static final ProtoAdapter<I18nInfo> ADAPTER = new C49709b();
    public static final Boolean DEFAULT_IS_I18N_MESSAGE = false;
    private static final long serialVersionUID = 0;
    public final Boolean mis_i18n_message;
    public final String mlocale;

    /* renamed from: com.ss.android.lark.pb.entities.I18nInfo$b */
    private static final class C49709b extends ProtoAdapter<I18nInfo> {
        C49709b() {
            super(FieldEncoding.LENGTH_DELIMITED, I18nInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(I18nInfo i18nInfo) {
            int i;
            int i2 = 0;
            if (i18nInfo.mis_i18n_message != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, i18nInfo.mis_i18n_message);
            } else {
                i = 0;
            }
            if (i18nInfo.mlocale != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, i18nInfo.mlocale);
            }
            return i + i2 + i18nInfo.unknownFields().size();
        }

        /* renamed from: a */
        public I18nInfo decode(ProtoReader protoReader) throws IOException {
            C49708a aVar = new C49708a();
            aVar.f124452a = false;
            aVar.f124453b = "zh_cn";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124452a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124453b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, I18nInfo i18nInfo) throws IOException {
            if (i18nInfo.mis_i18n_message != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, i18nInfo.mis_i18n_message);
            }
            if (i18nInfo.mlocale != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, i18nInfo.mlocale);
            }
            protoWriter.writeBytes(i18nInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.I18nInfo$a */
    public static final class C49708a extends Message.Builder<I18nInfo, C49708a> {

        /* renamed from: a */
        public Boolean f124452a;

        /* renamed from: b */
        public String f124453b;

        /* renamed from: a */
        public I18nInfo build() {
            return new I18nInfo(this.f124452a, this.f124453b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49708a newBuilder() {
        C49708a aVar = new C49708a();
        aVar.f124452a = this.mis_i18n_message;
        aVar.f124453b = this.mlocale;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mis_i18n_message != null) {
            sb.append(", is_i18n_message=");
            sb.append(this.mis_i18n_message);
        }
        if (this.mlocale != null) {
            sb.append(", locale=");
            sb.append(this.mlocale);
        }
        StringBuilder replace = sb.replace(0, 2, "I18nInfo{");
        replace.append('}');
        return replace.toString();
    }

    public I18nInfo(Boolean bool, String str) {
        this(bool, str, ByteString.EMPTY);
    }

    public I18nInfo(Boolean bool, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mis_i18n_message = bool;
        this.mlocale = str;
    }
}
