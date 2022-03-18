package com.ss.android.lark.pb.usearch;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class CustomizationMeta extends Message<CustomizationMeta, C50194a> {
    public static final ProtoAdapter<CustomizationMeta> ADAPTER = new C50195b();
    private static final long serialVersionUID = 0;
    public final String mdata_source_id;
    public final String mid;
    public final String mrender_content;
    public final String mtemplate_name;

    /* renamed from: com.ss.android.lark.pb.usearch.CustomizationMeta$b */
    private static final class C50195b extends ProtoAdapter<CustomizationMeta> {
        C50195b() {
            super(FieldEncoding.LENGTH_DELIMITED, CustomizationMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(CustomizationMeta customizationMeta) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, customizationMeta.mid);
            int i3 = 0;
            if (customizationMeta.mrender_content != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, customizationMeta.mrender_content);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (customizationMeta.mdata_source_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, customizationMeta.mdata_source_id);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (customizationMeta.mtemplate_name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, customizationMeta.mtemplate_name);
            }
            return i5 + i3 + customizationMeta.unknownFields().size();
        }

        /* renamed from: a */
        public CustomizationMeta decode(ProtoReader protoReader) throws IOException {
            C50194a aVar = new C50194a();
            aVar.f125409a = "";
            aVar.f125410b = "";
            aVar.f125411c = "";
            aVar.f125412d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125409a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125410b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f125411c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125412d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CustomizationMeta customizationMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, customizationMeta.mid);
            if (customizationMeta.mrender_content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, customizationMeta.mrender_content);
            }
            if (customizationMeta.mdata_source_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, customizationMeta.mdata_source_id);
            }
            if (customizationMeta.mtemplate_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, customizationMeta.mtemplate_name);
            }
            protoWriter.writeBytes(customizationMeta.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50194a newBuilder() {
        C50194a aVar = new C50194a();
        aVar.f125409a = this.mid;
        aVar.f125410b = this.mrender_content;
        aVar.f125411c = this.mdata_source_id;
        aVar.f125412d = this.mtemplate_name;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.usearch.CustomizationMeta$a */
    public static final class C50194a extends Message.Builder<CustomizationMeta, C50194a> {

        /* renamed from: a */
        public String f125409a;

        /* renamed from: b */
        public String f125410b;

        /* renamed from: c */
        public String f125411c;

        /* renamed from: d */
        public String f125412d;

        /* renamed from: a */
        public CustomizationMeta build() {
            String str = this.f125409a;
            if (str != null) {
                return new CustomizationMeta(str, this.f125410b, this.f125411c, this.f125412d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mid");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.mid);
        if (this.mrender_content != null) {
            sb.append(", render_content=");
            sb.append(this.mrender_content);
        }
        if (this.mdata_source_id != null) {
            sb.append(", data_source_id=");
            sb.append(this.mdata_source_id);
        }
        if (this.mtemplate_name != null) {
            sb.append(", template_name=");
            sb.append(this.mtemplate_name);
        }
        StringBuilder replace = sb.replace(0, 2, "CustomizationMeta{");
        replace.append('}');
        return replace.toString();
    }

    public CustomizationMeta(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, ByteString.EMPTY);
    }

    public CustomizationMeta(String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mid = str;
        this.mrender_content = str2;
        this.mdata_source_id = str3;
        this.mtemplate_name = str4;
    }
}
