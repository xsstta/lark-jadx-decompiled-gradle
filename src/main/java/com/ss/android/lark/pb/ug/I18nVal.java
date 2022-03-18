package com.ss.android.lark.pb.ug;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class I18nVal extends Message<I18nVal, C50094a> {
    public static final ProtoAdapter<I18nVal> ADAPTER = new C50095b();
    private static final long serialVersionUID = 0;
    public final String mdefault_val;
    public final Map<String, String> mi18n_vals;

    /* renamed from: com.ss.android.lark.pb.ug.I18nVal$a */
    public static final class C50094a extends Message.Builder<I18nVal, C50094a> {

        /* renamed from: a */
        public String f125222a;

        /* renamed from: b */
        public Map<String, String> f125223b = Internal.newMutableMap();

        /* renamed from: a */
        public I18nVal build() {
            String str = this.f125222a;
            if (str != null) {
                return new I18nVal(str, this.f125223b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mdefault_val");
        }
    }

    /* renamed from: com.ss.android.lark.pb.ug.I18nVal$b */
    private static final class C50095b extends ProtoAdapter<I18nVal> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f125224a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C50095b() {
            super(FieldEncoding.LENGTH_DELIMITED, I18nVal.class);
        }

        /* renamed from: a */
        public int encodedSize(I18nVal i18nVal) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, i18nVal.mdefault_val) + this.f125224a.encodedSizeWithTag(2, i18nVal.mi18n_vals) + i18nVal.unknownFields().size();
        }

        /* renamed from: a */
        public I18nVal decode(ProtoReader protoReader) throws IOException {
            C50094a aVar = new C50094a();
            aVar.f125222a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125222a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125223b.putAll(this.f125224a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, I18nVal i18nVal) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, i18nVal.mdefault_val);
            this.f125224a.encodeWithTag(protoWriter, 2, i18nVal.mi18n_vals);
            protoWriter.writeBytes(i18nVal.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50094a newBuilder() {
        C50094a aVar = new C50094a();
        aVar.f125222a = this.mdefault_val;
        aVar.f125223b = Internal.copyOf("mi18n_vals", this.mi18n_vals);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", default_val=");
        sb.append(this.mdefault_val);
        if (!this.mi18n_vals.isEmpty()) {
            sb.append(", i18n_vals=");
            sb.append(this.mi18n_vals);
        }
        StringBuilder replace = sb.replace(0, 2, "I18nVal{");
        replace.append('}');
        return replace.toString();
    }

    public I18nVal(String str, Map<String, String> map) {
        this(str, map, ByteString.EMPTY);
    }

    public I18nVal(String str, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mdefault_val = str;
        this.mi18n_vals = Internal.immutableCopyOf("mi18n_vals", map);
    }
}
