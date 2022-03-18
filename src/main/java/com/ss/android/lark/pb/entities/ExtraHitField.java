package com.ss.android.lark.pb.entities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ExtraHitField extends Message<ExtraHitField, C49700a> {
    public static final ProtoAdapter<ExtraHitField> ADAPTER = new C49701b();
    private static final long serialVersionUID = 0;
    public final String mfield_name;
    public final String mtitle;
    public final List<String> mtitle_hit_terms;

    /* renamed from: com.ss.android.lark.pb.entities.ExtraHitField$b */
    private static final class C49701b extends ProtoAdapter<ExtraHitField> {
        C49701b() {
            super(FieldEncoding.LENGTH_DELIMITED, ExtraHitField.class);
        }

        /* renamed from: a */
        public int encodedSize(ExtraHitField extraHitField) {
            int i;
            int i2 = 0;
            if (extraHitField.mfield_name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, extraHitField.mfield_name);
            } else {
                i = 0;
            }
            if (extraHitField.mtitle != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, extraHitField.mtitle);
            }
            return i + i2 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, extraHitField.mtitle_hit_terms) + extraHitField.unknownFields().size();
        }

        /* renamed from: a */
        public ExtraHitField decode(ProtoReader protoReader) throws IOException {
            C49700a aVar = new C49700a();
            aVar.f124431a = "";
            aVar.f124432b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124431a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124432b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124433c.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ExtraHitField extraHitField) throws IOException {
            if (extraHitField.mfield_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, extraHitField.mfield_name);
            }
            if (extraHitField.mtitle != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, extraHitField.mtitle);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, extraHitField.mtitle_hit_terms);
            protoWriter.writeBytes(extraHitField.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.ExtraHitField$a */
    public static final class C49700a extends Message.Builder<ExtraHitField, C49700a> {

        /* renamed from: a */
        public String f124431a;

        /* renamed from: b */
        public String f124432b;

        /* renamed from: c */
        public List<String> f124433c = Internal.newMutableList();

        /* renamed from: a */
        public ExtraHitField build() {
            return new ExtraHitField(this.f124431a, this.f124432b, this.f124433c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49700a newBuilder() {
        C49700a aVar = new C49700a();
        aVar.f124431a = this.mfield_name;
        aVar.f124432b = this.mtitle;
        aVar.f124433c = Internal.copyOf("mtitle_hit_terms", this.mtitle_hit_terms);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mfield_name != null) {
            sb.append(", field_name=");
            sb.append(this.mfield_name);
        }
        if (this.mtitle != null) {
            sb.append(", title=");
            sb.append(this.mtitle);
        }
        if (!this.mtitle_hit_terms.isEmpty()) {
            sb.append(", title_hit_terms=");
            sb.append(this.mtitle_hit_terms);
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
        this.mfield_name = str;
        this.mtitle = str2;
        this.mtitle_hit_terms = Internal.immutableCopyOf("mtitle_hit_terms", list);
    }
}
