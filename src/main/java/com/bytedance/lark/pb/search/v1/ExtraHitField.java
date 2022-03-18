package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ExtraHitField extends Message<ExtraHitField, C18825a> {
    public static final ProtoAdapter<ExtraHitField> ADAPTER = new C18826b();
    private static final long serialVersionUID = 0;
    public final String field_name;
    public final String title;
    public final List<String> title_hit_terms;

    /* renamed from: com.bytedance.lark.pb.search.v1.ExtraHitField$b */
    private static final class C18826b extends ProtoAdapter<ExtraHitField> {
        C18826b() {
            super(FieldEncoding.LENGTH_DELIMITED, ExtraHitField.class);
        }

        /* renamed from: a */
        public int encodedSize(ExtraHitField extraHitField) {
            int i;
            int i2 = 0;
            if (extraHitField.field_name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, extraHitField.field_name);
            } else {
                i = 0;
            }
            if (extraHitField.title != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, extraHitField.title);
            }
            return i + i2 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, extraHitField.title_hit_terms) + extraHitField.unknownFields().size();
        }

        /* renamed from: a */
        public ExtraHitField decode(ProtoReader protoReader) throws IOException {
            C18825a aVar = new C18825a();
            aVar.f46389a = "";
            aVar.f46390b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46389a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46390b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46391c.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ExtraHitField extraHitField) throws IOException {
            if (extraHitField.field_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, extraHitField.field_name);
            }
            if (extraHitField.title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, extraHitField.title);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, extraHitField.title_hit_terms);
            protoWriter.writeBytes(extraHitField.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.ExtraHitField$a */
    public static final class C18825a extends Message.Builder<ExtraHitField, C18825a> {

        /* renamed from: a */
        public String f46389a;

        /* renamed from: b */
        public String f46390b;

        /* renamed from: c */
        public List<String> f46391c = Internal.newMutableList();

        /* renamed from: a */
        public ExtraHitField build() {
            return new ExtraHitField(this.f46389a, this.f46390b, this.f46391c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18825a newBuilder() {
        C18825a aVar = new C18825a();
        aVar.f46389a = this.field_name;
        aVar.f46390b = this.title;
        aVar.f46391c = Internal.copyOf("title_hit_terms", this.title_hit_terms);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "ExtraHitField");
        StringBuilder sb = new StringBuilder();
        if (this.field_name != null) {
            sb.append(", field_name=");
            sb.append(this.field_name);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (!this.title_hit_terms.isEmpty()) {
            sb.append(", title_hit_terms=");
            sb.append(this.title_hit_terms);
        }
        StringBuilder replace = sb.replace(0, 2, "ExtraHitField{");
        replace.append('}');
        return replace.toString();
    }

    public ExtraHitField(String str, String str2, List<String> list) {
        this(str, str2, list, ByteString.EMPTY);
    }

    public ExtraHitField(String str, String str2, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.field_name = str;
        this.title = str2;
        this.title_hit_terms = Internal.immutableCopyOf("title_hit_terms", list);
    }
}
