package com.ss.android.lark.pb.ug_reach;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CdnImageElement extends Message<CdnImageElement, C50120a> {
    public static final ProtoAdapter<CdnImageElement> ADAPTER = new C50121b();
    public static final ByteString DEFAULT_SECRETS = ByteString.EMPTY;
    private static final long serialVersionUID = 0;
    public final ByteString msecrets;
    public final String murl;

    /* renamed from: com.ss.android.lark.pb.ug_reach.CdnImageElement$b */
    private static final class C50121b extends ProtoAdapter<CdnImageElement> {
        C50121b() {
            super(FieldEncoding.LENGTH_DELIMITED, CdnImageElement.class);
        }

        /* renamed from: a */
        public int encodedSize(CdnImageElement cdnImageElement) {
            int i;
            int i2 = 0;
            if (cdnImageElement.murl != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, cdnImageElement.murl);
            } else {
                i = 0;
            }
            if (cdnImageElement.msecrets != null) {
                i2 = ProtoAdapter.BYTES.encodedSizeWithTag(2, cdnImageElement.msecrets);
            }
            return i + i2 + cdnImageElement.unknownFields().size();
        }

        /* renamed from: a */
        public CdnImageElement decode(ProtoReader protoReader) throws IOException {
            C50120a aVar = new C50120a();
            aVar.f125273a = "";
            aVar.f125274b = ByteString.EMPTY;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125273a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125274b = ProtoAdapter.BYTES.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CdnImageElement cdnImageElement) throws IOException {
            if (cdnImageElement.murl != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, cdnImageElement.murl);
            }
            if (cdnImageElement.msecrets != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, cdnImageElement.msecrets);
            }
            protoWriter.writeBytes(cdnImageElement.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ug_reach.CdnImageElement$a */
    public static final class C50120a extends Message.Builder<CdnImageElement, C50120a> {

        /* renamed from: a */
        public String f125273a;

        /* renamed from: b */
        public ByteString f125274b;

        /* renamed from: a */
        public CdnImageElement build() {
            return new CdnImageElement(this.f125273a, this.f125274b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50120a newBuilder() {
        C50120a aVar = new C50120a();
        aVar.f125273a = this.murl;
        aVar.f125274b = this.msecrets;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.murl != null) {
            sb.append(", url=");
            sb.append(this.murl);
        }
        if (this.msecrets != null) {
            sb.append(", secrets=");
            sb.append(this.msecrets);
        }
        StringBuilder replace = sb.replace(0, 2, "CdnImageElement{");
        replace.append('}');
        return replace.toString();
    }

    public CdnImageElement(String str, ByteString byteString) {
        this(str, byteString, ByteString.EMPTY);
    }

    public CdnImageElement(String str, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.murl = str;
        this.msecrets = byteString;
    }
}
