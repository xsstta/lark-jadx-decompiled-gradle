package com.bytedance.lark.pb.search.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ExplanationTag extends Message<ExplanationTag, C18983a> {
    public static final ProtoAdapter<ExplanationTag> ADAPTER = new C18984b();
    private static final long serialVersionUID = 0;
    public final String tag_type;
    public final String text;

    /* renamed from: com.bytedance.lark.pb.search.v2.ExplanationTag$b */
    private static final class C18984b extends ProtoAdapter<ExplanationTag> {
        C18984b() {
            super(FieldEncoding.LENGTH_DELIMITED, ExplanationTag.class);
        }

        /* renamed from: a */
        public int encodedSize(ExplanationTag explanationTag) {
            int i;
            int i2 = 0;
            if (explanationTag.text != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, explanationTag.text);
            } else {
                i = 0;
            }
            if (explanationTag.tag_type != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, explanationTag.tag_type);
            }
            return i + i2 + explanationTag.unknownFields().size();
        }

        /* renamed from: a */
        public ExplanationTag decode(ProtoReader protoReader) throws IOException {
            C18983a aVar = new C18983a();
            aVar.f46955a = "";
            aVar.f46956b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46955a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46956b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ExplanationTag explanationTag) throws IOException {
            if (explanationTag.text != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, explanationTag.text);
            }
            if (explanationTag.tag_type != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, explanationTag.tag_type);
            }
            protoWriter.writeBytes(explanationTag.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.ExplanationTag$a */
    public static final class C18983a extends Message.Builder<ExplanationTag, C18983a> {

        /* renamed from: a */
        public String f46955a;

        /* renamed from: b */
        public String f46956b;

        /* renamed from: a */
        public ExplanationTag build() {
            return new ExplanationTag(this.f46955a, this.f46956b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18983a newBuilder() {
        C18983a aVar = new C18983a();
        aVar.f46955a = this.text;
        aVar.f46956b = this.tag_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "ExplanationTag");
        StringBuilder sb = new StringBuilder();
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        if (this.tag_type != null) {
            sb.append(", tag_type=");
            sb.append(this.tag_type);
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
        this.text = str;
        this.tag_type = str2;
    }
}
