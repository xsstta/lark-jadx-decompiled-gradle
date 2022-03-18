package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class DocMeta extends Message<DocMeta, C49443a> {
    public static final ProtoAdapter<DocMeta> ADAPTER = new C49444b();
    private static final long serialVersionUID = 0;
    public final String mtitle;
    public final String murl;

    /* renamed from: com.ss.android.lark.pb.ai.DocMeta$b */
    private static final class C49444b extends ProtoAdapter<DocMeta> {
        C49444b() {
            super(FieldEncoding.LENGTH_DELIMITED, DocMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(DocMeta docMeta) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, docMeta.mtitle) + ProtoAdapter.STRING.encodedSizeWithTag(2, docMeta.murl) + docMeta.unknownFields().size();
        }

        /* renamed from: a */
        public DocMeta decode(ProtoReader protoReader) throws IOException {
            C49443a aVar = new C49443a();
            aVar.f124001a = "";
            aVar.f124002b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124001a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124002b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DocMeta docMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, docMeta.mtitle);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, docMeta.murl);
            protoWriter.writeBytes(docMeta.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49443a newBuilder() {
        C49443a aVar = new C49443a();
        aVar.f124001a = this.mtitle;
        aVar.f124002b = this.murl;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.ai.DocMeta$a */
    public static final class C49443a extends Message.Builder<DocMeta, C49443a> {

        /* renamed from: a */
        public String f124001a;

        /* renamed from: b */
        public String f124002b;

        /* renamed from: a */
        public DocMeta build() {
            String str;
            String str2 = this.f124001a;
            if (str2 != null && (str = this.f124002b) != null) {
                return new DocMeta(str2, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "mtitle", this.f124002b, "murl");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", title=");
        sb.append(this.mtitle);
        sb.append(", url=");
        sb.append(this.murl);
        StringBuilder replace = sb.replace(0, 2, "DocMeta{");
        replace.append('}');
        return replace.toString();
    }

    public DocMeta(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public DocMeta(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtitle = str;
        this.murl = str2;
    }
}
