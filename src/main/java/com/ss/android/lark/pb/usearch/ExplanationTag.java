package com.ss.android.lark.pb.usearch;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ExplanationTag extends Message<ExplanationTag, C50200a> {
    public static final ProtoAdapter<ExplanationTag> ADAPTER = new C50201b();
    private static final long serialVersionUID = 0;
    public final String mtag_type;
    public final String mtext;

    /* renamed from: com.ss.android.lark.pb.usearch.ExplanationTag$b */
    private static final class C50201b extends ProtoAdapter<ExplanationTag> {
        C50201b() {
            super(FieldEncoding.LENGTH_DELIMITED, ExplanationTag.class);
        }

        /* renamed from: a */
        public int encodedSize(ExplanationTag explanationTag) {
            int i;
            int i2 = 0;
            if (explanationTag.mtext != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, explanationTag.mtext);
            } else {
                i = 0;
            }
            if (explanationTag.mtag_type != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, explanationTag.mtag_type);
            }
            return i + i2 + explanationTag.unknownFields().size();
        }

        /* renamed from: a */
        public ExplanationTag decode(ProtoReader protoReader) throws IOException {
            C50200a aVar = new C50200a();
            aVar.f125432a = "";
            aVar.f125433b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125432a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125433b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ExplanationTag explanationTag) throws IOException {
            if (explanationTag.mtext != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, explanationTag.mtext);
            }
            if (explanationTag.mtag_type != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, explanationTag.mtag_type);
            }
            protoWriter.writeBytes(explanationTag.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.usearch.ExplanationTag$a */
    public static final class C50200a extends Message.Builder<ExplanationTag, C50200a> {

        /* renamed from: a */
        public String f125432a;

        /* renamed from: b */
        public String f125433b;

        /* renamed from: a */
        public ExplanationTag build() {
            return new ExplanationTag(this.f125432a, this.f125433b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50200a newBuilder() {
        C50200a aVar = new C50200a();
        aVar.f125432a = this.mtext;
        aVar.f125433b = this.mtag_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mtext != null) {
            sb.append(", text=");
            sb.append(this.mtext);
        }
        if (this.mtag_type != null) {
            sb.append(", tag_type=");
            sb.append(this.mtag_type);
        }
        StringBuilder replace = sb.replace(0, 2, "ExplanationTag{");
        replace.append('}');
        return replace.toString();
    }

    public ExplanationTag(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public ExplanationTag(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtext = str;
        this.mtag_type = str2;
    }
}
