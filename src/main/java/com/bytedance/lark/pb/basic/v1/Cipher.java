package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class Cipher extends Message<Cipher, Builder> {
    public static final ProtoAdapter<Cipher> ADAPTER = new C14827a();
    public static final ByteString DEFAULT_ADDITIONAL_DATA = ByteString.EMPTY;
    public static final ByteString DEFAULT_NONCE = ByteString.EMPTY;
    public static final ByteString DEFAULT_SECRET = ByteString.EMPTY;
    private static final long serialVersionUID = 0;
    public final ByteString additional_data;
    public final ByteString nonce;
    public final ByteString secret;

    /* renamed from: com.bytedance.lark.pb.basic.v1.Cipher$a */
    private static final class C14827a extends ProtoAdapter<Cipher> {
        C14827a() {
            super(FieldEncoding.LENGTH_DELIMITED, Cipher.class);
        }

        /* renamed from: a */
        public int encodedSize(Cipher cipher) {
            int i;
            int i2;
            int i3 = 0;
            if (cipher.secret != null) {
                i = ProtoAdapter.BYTES.encodedSizeWithTag(1, cipher.secret);
            } else {
                i = 0;
            }
            if (cipher.nonce != null) {
                i2 = ProtoAdapter.BYTES.encodedSizeWithTag(2, cipher.nonce);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (cipher.additional_data != null) {
                i3 = ProtoAdapter.BYTES.encodedSizeWithTag(3, cipher.additional_data);
            }
            return i4 + i3 + cipher.unknownFields().size();
        }

        /* renamed from: a */
        public Cipher decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            builder.secret = ByteString.EMPTY;
            builder.nonce = ByteString.EMPTY;
            builder.additional_data = ByteString.EMPTY;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.secret = ProtoAdapter.BYTES.decode(protoReader);
                } else if (nextTag == 2) {
                    builder.nonce = ProtoAdapter.BYTES.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.additional_data = ProtoAdapter.BYTES.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Cipher cipher) throws IOException {
            if (cipher.secret != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, cipher.secret);
            }
            if (cipher.nonce != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, cipher.nonce);
            }
            if (cipher.additional_data != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 3, cipher.additional_data);
            }
            protoWriter.writeBytes(cipher.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<Cipher, Builder> {
        public ByteString additional_data;
        public ByteString nonce;
        public ByteString secret;

        @Override // com.squareup.wire.Message.Builder
        public Cipher build() {
            return new Cipher(this.secret, this.nonce, this.additional_data, super.buildUnknownFields());
        }

        public Builder additional_data(ByteString byteString) {
            this.additional_data = byteString;
            return this;
        }

        public Builder nonce(ByteString byteString) {
            this.nonce = byteString;
            return this;
        }

        public Builder secret(ByteString byteString) {
            this.secret = byteString;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.secret = this.secret;
        builder.nonce = this.nonce;
        builder.additional_data = this.additional_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "Cipher");
        StringBuilder sb = new StringBuilder();
        if (this.secret != null) {
            sb.append(", secret=");
            sb.append(this.secret);
        }
        if (this.nonce != null) {
            sb.append(", nonce=");
            sb.append(this.nonce);
        }
        if (this.additional_data != null) {
            sb.append(", additional_data=");
            sb.append(this.additional_data);
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
        this.secret = byteString;
        this.nonce = byteString2;
        this.additional_data = byteString3;
    }
}
