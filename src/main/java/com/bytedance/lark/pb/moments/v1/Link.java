package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class Link extends Message<Link, C18412a> {
    public static final ProtoAdapter<Link> ADAPTER = new C18413b();
    private static final long serialVersionUID = 0;
    public final String title;
    public final String url;

    /* renamed from: com.bytedance.lark.pb.moments.v1.Link$b */
    private static final class C18413b extends ProtoAdapter<Link> {
        C18413b() {
            super(FieldEncoding.LENGTH_DELIMITED, Link.class);
        }

        /* renamed from: a */
        public int encodedSize(Link link) {
            int i;
            int i2 = 0;
            if (link.url != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, link.url);
            } else {
                i = 0;
            }
            if (link.title != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, link.title);
            }
            return i + i2 + link.unknownFields().size();
        }

        /* renamed from: a */
        public Link decode(ProtoReader protoReader) throws IOException {
            C18412a aVar = new C18412a();
            aVar.f45798a = "";
            aVar.f45799b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45798a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45799b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Link link) throws IOException {
            if (link.url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, link.url);
            }
            if (link.title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, link.title);
            }
            protoWriter.writeBytes(link.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.Link$a */
    public static final class C18412a extends Message.Builder<Link, C18412a> {

        /* renamed from: a */
        public String f45798a;

        /* renamed from: b */
        public String f45799b;

        /* renamed from: a */
        public Link build() {
            return new Link(this.f45798a, this.f45799b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18412a newBuilder() {
        C18412a aVar = new C18412a();
        aVar.f45798a = this.url;
        aVar.f45799b = this.title;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "Link");
        StringBuilder sb = new StringBuilder();
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        StringBuilder replace = sb.replace(0, 2, "Link{");
        replace.append('}');
        return replace.toString();
    }

    public Link(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public Link(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.url = str;
        this.title = str2;
    }
}
