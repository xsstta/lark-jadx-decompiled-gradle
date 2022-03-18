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

public final class Link extends Message<Link, C0067a> {
    public static final ProtoAdapter<Link> ADAPTER = new C0068b();
    private static final long serialVersionUID = 0;
    public final String title;
    public final String url;

    /* renamed from: ai.v1.Link$b */
    private static final class C0068b extends ProtoAdapter<Link> {
        C0068b() {
            super(FieldEncoding.LENGTH_DELIMITED, Link.class);
        }

        /* renamed from: a */
        public int encodedSize(Link link) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, link.title) + ProtoAdapter.STRING.encodedSizeWithTag(2, link.url) + link.unknownFields().size();
        }

        /* renamed from: a */
        public Link decode(ProtoReader protoReader) throws IOException {
            C0067a aVar = new C0067a();
            aVar.f119a = "";
            aVar.f120b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f119a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f120b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Link link) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, link.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, link.url);
            protoWriter.writeBytes(link.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C0067a newBuilder() {
        C0067a aVar = new C0067a();
        aVar.f119a = this.title;
        aVar.f120b = this.url;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: ai.v1.Link$a */
    public static final class C0067a extends Message.Builder<Link, C0067a> {

        /* renamed from: a */
        public String f119a;

        /* renamed from: b */
        public String f120b;

        /* renamed from: a */
        public Link build() {
            String str;
            String str2 = this.f119a;
            if (str2 != null && (str = this.f120b) != null) {
                return new Link(str2, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "title", this.f120b, "url");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ai", "Link");
        StringBuilder sb = new StringBuilder();
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", url=");
        sb.append(this.url);
        StringBuilder replace = sb.replace(0, 2, "Link{");
        replace.append('}');
        return replace.toString();
    }

    public Link(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public Link(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.title = str;
        this.url = str2;
    }
}
