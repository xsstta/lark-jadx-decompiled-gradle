package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class Link extends Message<Link, C49493a> {
    public static final ProtoAdapter<Link> ADAPTER = new C49494b();
    private static final long serialVersionUID = 0;
    public final String mtitle;
    public final String mtype;
    public final String murl;

    /* renamed from: com.ss.android.lark.pb.ai.Link$b */
    private static final class C49494b extends ProtoAdapter<Link> {
        C49494b() {
            super(FieldEncoding.LENGTH_DELIMITED, Link.class);
        }

        /* renamed from: a */
        public int encodedSize(Link link) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, link.mtitle) + ProtoAdapter.STRING.encodedSizeWithTag(2, link.murl) + ProtoAdapter.STRING.encodedSizeWithTag(3, link.mtype) + link.unknownFields().size();
        }

        /* renamed from: a */
        public Link decode(ProtoReader protoReader) throws IOException {
            C49493a aVar = new C49493a();
            aVar.f124084a = "";
            aVar.f124085b = "";
            aVar.f124086c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124084a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124085b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124086c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Link link) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, link.mtitle);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, link.murl);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, link.mtype);
            protoWriter.writeBytes(link.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49493a newBuilder() {
        C49493a aVar = new C49493a();
        aVar.f124084a = this.mtitle;
        aVar.f124085b = this.murl;
        aVar.f124086c = this.mtype;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.ai.Link$a */
    public static final class C49493a extends Message.Builder<Link, C49493a> {

        /* renamed from: a */
        public String f124084a;

        /* renamed from: b */
        public String f124085b;

        /* renamed from: c */
        public String f124086c;

        /* renamed from: a */
        public Link build() {
            String str;
            String str2;
            String str3 = this.f124084a;
            if (str3 != null && (str = this.f124085b) != null && (str2 = this.f124086c) != null) {
                return new Link(str3, str, str2, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str3, "mtitle", this.f124085b, "murl", this.f124086c, "mtype");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", title=");
        sb.append(this.mtitle);
        sb.append(", url=");
        sb.append(this.murl);
        sb.append(", type=");
        sb.append(this.mtype);
        StringBuilder replace = sb.replace(0, 2, "Link{");
        replace.append('}');
        return replace.toString();
    }

    public Link(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public Link(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtitle = str;
        this.murl = str2;
        this.mtype = str3;
    }
}
