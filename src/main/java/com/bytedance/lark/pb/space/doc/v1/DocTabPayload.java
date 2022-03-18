package com.bytedance.lark.pb.space.doc.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DocTabPayload extends Message<DocTabPayload, C19245a> {
    public static final ProtoAdapter<DocTabPayload> ADAPTER = new C19246b();
    private static final long serialVersionUID = 0;
    public final String key;
    public final String name;
    public final String url;

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.DocTabPayload$b */
    private static final class C19246b extends ProtoAdapter<DocTabPayload> {
        C19246b() {
            super(FieldEncoding.LENGTH_DELIMITED, DocTabPayload.class);
        }

        /* renamed from: a */
        public int encodedSize(DocTabPayload docTabPayload) {
            int i;
            int i2;
            int i3 = 0;
            if (docTabPayload.key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, docTabPayload.key);
            } else {
                i = 0;
            }
            if (docTabPayload.url != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, docTabPayload.url);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (docTabPayload.name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, docTabPayload.name);
            }
            return i4 + i3 + docTabPayload.unknownFields().size();
        }

        /* renamed from: a */
        public DocTabPayload decode(ProtoReader protoReader) throws IOException {
            C19245a aVar = new C19245a();
            aVar.f47433a = "";
            aVar.f47434b = "";
            aVar.f47435c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47433a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f47434b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47435c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DocTabPayload docTabPayload) throws IOException {
            if (docTabPayload.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, docTabPayload.key);
            }
            if (docTabPayload.url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, docTabPayload.url);
            }
            if (docTabPayload.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, docTabPayload.name);
            }
            protoWriter.writeBytes(docTabPayload.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.DocTabPayload$a */
    public static final class C19245a extends Message.Builder<DocTabPayload, C19245a> {

        /* renamed from: a */
        public String f47433a;

        /* renamed from: b */
        public String f47434b;

        /* renamed from: c */
        public String f47435c;

        /* renamed from: a */
        public DocTabPayload build() {
            return new DocTabPayload(this.f47433a, this.f47434b, this.f47435c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19245a mo65681a(String str) {
            this.f47433a = str;
            return this;
        }

        /* renamed from: b */
        public C19245a mo65683b(String str) {
            this.f47434b = str;
            return this;
        }

        /* renamed from: c */
        public C19245a mo65684c(String str) {
            this.f47435c = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19245a newBuilder() {
        C19245a aVar = new C19245a();
        aVar.f47433a = this.key;
        aVar.f47434b = this.url;
        aVar.f47435c = this.name;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "DocTabPayload");
        StringBuilder sb = new StringBuilder();
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        StringBuilder replace = sb.replace(0, 2, "DocTabPayload{");
        replace.append('}');
        return replace.toString();
    }

    public DocTabPayload(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public DocTabPayload(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.url = str2;
        this.name = str3;
    }
}
