package ai.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class DocMeta extends Message<DocMeta, C0045a> {
    public static final ProtoAdapter<DocMeta> ADAPTER = new C0046b();
    private static final long serialVersionUID = 0;
    public final String title;
    public final String url;

    /* renamed from: ai.v1.DocMeta$b */
    private static final class C0046b extends ProtoAdapter<DocMeta> {
        C0046b() {
            super(FieldEncoding.LENGTH_DELIMITED, DocMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(DocMeta docMeta) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, docMeta.title) + ProtoAdapter.STRING.encodedSizeWithTag(2, docMeta.url) + docMeta.unknownFields().size();
        }

        /* renamed from: a */
        public DocMeta decode(ProtoReader protoReader) throws IOException {
            C0045a aVar = new C0045a();
            aVar.f80a = "";
            aVar.f81b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f80a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f81b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DocMeta docMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, docMeta.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, docMeta.url);
            protoWriter.writeBytes(docMeta.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C0045a newBuilder() {
        C0045a aVar = new C0045a();
        aVar.f80a = this.title;
        aVar.f81b = this.url;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: ai.v1.DocMeta$a */
    public static final class C0045a extends Message.Builder<DocMeta, C0045a> {

        /* renamed from: a */
        public String f80a;

        /* renamed from: b */
        public String f81b;

        /* renamed from: a */
        public DocMeta build() {
            String str;
            String str2 = this.f80a;
            if (str2 != null && (str = this.f81b) != null) {
                return new DocMeta(str2, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "title", this.f81b, "url");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ai", "DocMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", url=");
        sb.append(this.url);
        StringBuilder replace = sb.replace(0, 2, "DocMeta{");
        replace.append('}');
        return replace.toString();
    }

    public DocMeta(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public DocMeta(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.title = str;
        this.url = str2;
    }
}
