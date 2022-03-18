package com.ss.android.lark.pb.entities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class Cipher extends Message<Cipher, C49692a> {
    public static final ProtoAdapter<Cipher> ADAPTER = new C49693b();
    public static final ByteString DEFAULT_ADDITIONAL_DATA = ByteString.EMPTY;
    public static final ByteString DEFAULT_NONCE = ByteString.EMPTY;
    public static final ByteString DEFAULT_SECRET = ByteString.EMPTY;
    private static final long serialVersionUID = 0;
    public final ByteString madditional_data;
    public final ByteString mnonce;
    public final ByteString msecret;

    /* renamed from: com.ss.android.lark.pb.entities.Cipher$b */
    private static final class C49693b extends ProtoAdapter<Cipher> {
        C49693b() {
            super(FieldEncoding.LENGTH_DELIMITED, Cipher.class);
        }

        /* renamed from: a */
        public int encodedSize(Cipher cipher) {
            int i;
            int i2;
            int i3 = 0;
            if (cipher.msecret != null) {
                i = ProtoAdapter.BYTES.encodedSizeWithTag(1, cipher.msecret);
            } else {
                i = 0;
            }
            if (cipher.mnonce != null) {
                i2 = ProtoAdapter.BYTES.encodedSizeWithTag(2, cipher.mnonce);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (cipher.madditional_data != null) {
                i3 = ProtoAdapter.BYTES.encodedSizeWithTag(3, cipher.madditional_data);
            }
            return i4 + i3 + cipher.unknownFields().size();
        }

        /* renamed from: a */
        public Cipher decode(ProtoReader protoReader) throws IOException {
            C49692a aVar = new C49692a();
            aVar.f124417a = ByteString.EMPTY;
            aVar.f124418b = ByteString.EMPTY;
            aVar.f124419c = ByteString.EMPTY;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124417a = ProtoAdapter.BYTES.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124418b = ProtoAdapter.BYTES.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124419c = ProtoAdapter.BYTES.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Cipher cipher) throws IOException {
            if (cipher.msecret != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, cipher.msecret);
            }
            if (cipher.mnonce != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, cipher.mnonce);
            }
            if (cipher.madditional_data != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 3, cipher.madditional_data);
            }
            protoWriter.writeBytes(cipher.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.Cipher$a */
    public static final class C49692a extends Message.Builder<Cipher, C49692a> {

        /* renamed from: a */
        public ByteString f124417a;

        /* renamed from: b */
        public ByteString f124418b;

        /* renamed from: c */
        public ByteString f124419c;

        /* renamed from: a */
        public Cipher build() {
            return new Cipher(this.f124417a, this.f124418b, this.f124419c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49692a newBuilder() {
        C49692a aVar = new C49692a();
        aVar.f124417a = this.msecret;
        aVar.f124418b = this.mnonce;
        aVar.f124419c = this.madditional_data;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.msecret != null) {
            sb.append(", secret=");
            sb.append(this.msecret);
        }
        if (this.mnonce != null) {
            sb.append(", nonce=");
            sb.append(this.mnonce);
        }
        if (this.madditional_data != null) {
            sb.append(", additional_data=");
            sb.append(this.madditional_data);
        }
        StringBuilder replace = sb.replace(0, 2, "Cipher{");
        replace.append('}');
        return replace.toString();
    }

    public Cipher(ByteString byteString, ByteString byteString2, ByteString byteString3) {
        this(byteString, byteString2, byteString3, ByteString.EMPTY);
    }

    public Cipher(ByteString byteString, ByteString byteString2, ByteString byteString3, ByteString byteString4) {
        super(ADAPTER, byteString4);
        this.msecret = byteString;
        this.mnonce = byteString2;
        this.madditional_data = byteString3;
    }
}
