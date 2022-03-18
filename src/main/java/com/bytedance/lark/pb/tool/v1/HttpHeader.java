package com.bytedance.lark.pb.tool.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class HttpHeader extends Message<HttpHeader, C19711a> {
    public static final ProtoAdapter<HttpHeader> ADAPTER = new C19712b();
    private static final long serialVersionUID = 0;
    public final String name;
    public final String value;

    /* renamed from: com.bytedance.lark.pb.tool.v1.HttpHeader$b */
    private static final class C19712b extends ProtoAdapter<HttpHeader> {
        C19712b() {
            super(FieldEncoding.LENGTH_DELIMITED, HttpHeader.class);
        }

        /* renamed from: a */
        public int encodedSize(HttpHeader httpHeader) {
            int i;
            int i2 = 0;
            if (httpHeader.name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, httpHeader.name);
            } else {
                i = 0;
            }
            if (httpHeader.value != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, httpHeader.value);
            }
            return i + i2 + httpHeader.unknownFields().size();
        }

        /* renamed from: a */
        public HttpHeader decode(ProtoReader protoReader) throws IOException {
            C19711a aVar = new C19711a();
            aVar.f48170a = "";
            aVar.f48171b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48170a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48171b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, HttpHeader httpHeader) throws IOException {
            if (httpHeader.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, httpHeader.name);
            }
            if (httpHeader.value != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, httpHeader.value);
            }
            protoWriter.writeBytes(httpHeader.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.HttpHeader$a */
    public static final class C19711a extends Message.Builder<HttpHeader, C19711a> {

        /* renamed from: a */
        public String f48170a;

        /* renamed from: b */
        public String f48171b;

        /* renamed from: a */
        public HttpHeader build() {
            return new HttpHeader(this.f48170a, this.f48171b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19711a newBuilder() {
        C19711a aVar = new C19711a();
        aVar.f48170a = this.name;
        aVar.f48171b = this.value;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("tool", "HttpHeader");
        StringBuilder sb = new StringBuilder();
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.value != null) {
            sb.append(", value=");
            sb.append(this.value);
        }
        StringBuilder replace = sb.replace(0, 2, "HttpHeader{");
        replace.append('}');
        return replace.toString();
    }

    public HttpHeader(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public HttpHeader(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
        this.value = str2;
    }
}
