package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class URL extends Message<URL, C15366a> {
    public static final ProtoAdapter<URL> ADAPTER = new C15367b();
    private static final long serialVersionUID = 0;

    /* renamed from: android  reason: collision with root package name */
    public final String f175430android;
    public final String ios;
    public final String pc;
    public final String url;
    public final String web;

    /* renamed from: com.bytedance.lark.pb.basic.v1.URL$b */
    private static final class C15367b extends ProtoAdapter<URL> {
        C15367b() {
            super(FieldEncoding.LENGTH_DELIMITED, URL.class);
        }

        /* renamed from: a */
        public int encodedSize(URL url) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (url.url != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, url.url);
            } else {
                i = 0;
            }
            if (url.ios != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, url.ios);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (url.f175430android != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, url.f175430android);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (url.pc != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, url.pc);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (url.web != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, url.web);
            }
            return i8 + i5 + url.unknownFields().size();
        }

        /* renamed from: a */
        public URL decode(ProtoReader protoReader) throws IOException {
            C15366a aVar = new C15366a();
            aVar.f40680a = "";
            aVar.f40681b = "";
            aVar.f40682c = "";
            aVar.f40683d = "";
            aVar.f40684e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40680a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f40681b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f40682c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f40683d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40684e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, URL url) throws IOException {
            if (url.url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, url.url);
            }
            if (url.ios != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, url.ios);
            }
            if (url.f175430android != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, url.f175430android);
            }
            if (url.pc != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, url.pc);
            }
            if (url.web != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, url.web);
            }
            protoWriter.writeBytes(url.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.URL$a */
    public static final class C15366a extends Message.Builder<URL, C15366a> {

        /* renamed from: a */
        public String f40680a;

        /* renamed from: b */
        public String f40681b;

        /* renamed from: c */
        public String f40682c;

        /* renamed from: d */
        public String f40683d;

        /* renamed from: e */
        public String f40684e;

        /* renamed from: a */
        public URL build() {
            return new URL(this.f40680a, this.f40681b, this.f40682c, this.f40683d, this.f40684e, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15366a mo55800a(String str) {
            this.f40680a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15366a newBuilder() {
        C15366a aVar = new C15366a();
        aVar.f40680a = this.url;
        aVar.f40681b = this.ios;
        aVar.f40682c = this.f175430android;
        aVar.f40683d = this.pc;
        aVar.f40684e = this.web;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "URL");
        StringBuilder sb = new StringBuilder();
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        if (this.ios != null) {
            sb.append(", ios=");
            sb.append(this.ios);
        }
        if (this.f175430android != null) {
            sb.append(", android=");
            sb.append(this.f175430android);
        }
        if (this.pc != null) {
            sb.append(", pc=");
            sb.append(this.pc);
        }
        if (this.web != null) {
            sb.append(", web=");
            sb.append(this.web);
        }
        StringBuilder replace = sb.replace(0, 2, "URL{");
        replace.append('}');
        return replace.toString();
    }

    public URL(String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, ByteString.EMPTY);
    }

    public URL(String str, String str2, String str3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.url = str;
        this.ios = str2;
        this.f175430android = str3;
        this.pc = str4;
        this.web = str5;
    }
}
