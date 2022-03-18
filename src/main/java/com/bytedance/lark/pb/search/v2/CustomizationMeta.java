package com.bytedance.lark.pb.search.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class CustomizationMeta extends Message<CustomizationMeta, C18977a> {
    public static final ProtoAdapter<CustomizationMeta> ADAPTER = new C18978b();
    private static final long serialVersionUID = 0;
    public final String data_source_id;
    public final String id;
    public final String render_content;
    public final String template_name;

    /* renamed from: com.bytedance.lark.pb.search.v2.CustomizationMeta$b */
    private static final class C18978b extends ProtoAdapter<CustomizationMeta> {
        C18978b() {
            super(FieldEncoding.LENGTH_DELIMITED, CustomizationMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(CustomizationMeta customizationMeta) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, customizationMeta.id);
            int i3 = 0;
            if (customizationMeta.render_content != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, customizationMeta.render_content);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (customizationMeta.data_source_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, customizationMeta.data_source_id);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (customizationMeta.template_name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, customizationMeta.template_name);
            }
            return i5 + i3 + customizationMeta.unknownFields().size();
        }

        /* renamed from: a */
        public CustomizationMeta decode(ProtoReader protoReader) throws IOException {
            C18977a aVar = new C18977a();
            aVar.f46932a = "";
            aVar.f46933b = "";
            aVar.f46934c = "";
            aVar.f46935d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46932a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46933b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f46934c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46935d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CustomizationMeta customizationMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, customizationMeta.id);
            if (customizationMeta.render_content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, customizationMeta.render_content);
            }
            if (customizationMeta.data_source_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, customizationMeta.data_source_id);
            }
            if (customizationMeta.template_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, customizationMeta.template_name);
            }
            protoWriter.writeBytes(customizationMeta.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18977a newBuilder() {
        C18977a aVar = new C18977a();
        aVar.f46932a = this.id;
        aVar.f46933b = this.render_content;
        aVar.f46934c = this.data_source_id;
        aVar.f46935d = this.template_name;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.CustomizationMeta$a */
    public static final class C18977a extends Message.Builder<CustomizationMeta, C18977a> {

        /* renamed from: a */
        public String f46932a;

        /* renamed from: b */
        public String f46933b;

        /* renamed from: c */
        public String f46934c;

        /* renamed from: d */
        public String f46935d;

        /* renamed from: a */
        public CustomizationMeta build() {
            String str = this.f46932a;
            if (str != null) {
                return new CustomizationMeta(str, this.f46933b, this.f46934c, this.f46935d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "CustomizationMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.render_content != null) {
            sb.append(", render_content=");
            sb.append(this.render_content);
        }
        if (this.data_source_id != null) {
            sb.append(", data_source_id=");
            sb.append(this.data_source_id);
        }
        if (this.template_name != null) {
            sb.append(", template_name=");
            sb.append(this.template_name);
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
        this.id = str;
        this.render_content = str2;
        this.data_source_id = str3;
        this.template_name = str4;
    }
}
