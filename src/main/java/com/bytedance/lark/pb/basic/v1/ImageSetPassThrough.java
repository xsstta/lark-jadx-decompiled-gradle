package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ImageSetPassThrough extends Message<ImageSetPassThrough, C15013a> {
    public static final ProtoAdapter<ImageSetPassThrough> ADAPTER = new C15014b();
    private static final long serialVersionUID = 0;
    public final SerCrypto crypto;
    public final String fs_unit;
    public final String key;

    /* renamed from: com.bytedance.lark.pb.basic.v1.ImageSetPassThrough$b */
    private static final class C15014b extends ProtoAdapter<ImageSetPassThrough> {
        C15014b() {
            super(FieldEncoding.LENGTH_DELIMITED, ImageSetPassThrough.class);
        }

        /* renamed from: a */
        public int encodedSize(ImageSetPassThrough imageSetPassThrough) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, imageSetPassThrough.key);
            int i2 = 0;
            if (imageSetPassThrough.fs_unit != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, imageSetPassThrough.fs_unit);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (imageSetPassThrough.crypto != null) {
                i2 = SerCrypto.ADAPTER.encodedSizeWithTag(4, imageSetPassThrough.crypto);
            }
            return i3 + i2 + imageSetPassThrough.unknownFields().size();
        }

        /* renamed from: a */
        public ImageSetPassThrough decode(ProtoReader protoReader) throws IOException {
            C15013a aVar = new C15013a();
            aVar.f39704a = "";
            aVar.f39705b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39704a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f39705b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f39706c = SerCrypto.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ImageSetPassThrough imageSetPassThrough) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, imageSetPassThrough.key);
            if (imageSetPassThrough.fs_unit != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, imageSetPassThrough.fs_unit);
            }
            if (imageSetPassThrough.crypto != null) {
                SerCrypto.ADAPTER.encodeWithTag(protoWriter, 4, imageSetPassThrough.crypto);
            }
            protoWriter.writeBytes(imageSetPassThrough.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15013a newBuilder() {
        C15013a aVar = new C15013a();
        aVar.f39704a = this.key;
        aVar.f39705b = this.fs_unit;
        aVar.f39706c = this.crypto;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.ImageSetPassThrough$a */
    public static final class C15013a extends Message.Builder<ImageSetPassThrough, C15013a> {

        /* renamed from: a */
        public String f39704a;

        /* renamed from: b */
        public String f39705b;

        /* renamed from: c */
        public SerCrypto f39706c;

        /* renamed from: a */
        public ImageSetPassThrough build() {
            String str = this.f39704a;
            if (str != null) {
                return new ImageSetPassThrough(str, this.f39705b, this.f39706c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "key");
        }

        /* renamed from: a */
        public C15013a mo54864a(SerCrypto serCrypto) {
            this.f39706c = serCrypto;
            return this;
        }

        /* renamed from: b */
        public C15013a mo54867b(String str) {
            this.f39705b = str;
            return this;
        }

        /* renamed from: a */
        public C15013a mo54865a(String str) {
            this.f39704a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "ImageSetPassThrough");
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        if (this.fs_unit != null) {
            sb.append(", fs_unit=");
            sb.append(this.fs_unit);
        }
        if (this.crypto != null) {
            sb.append(", crypto=");
            sb.append(this.crypto);
        }
        StringBuilder replace = sb.replace(0, 2, "ImageSetPassThrough{");
        replace.append('}');
        return replace.toString();
    }

    public ImageSetPassThrough(String str, String str2, SerCrypto serCrypto) {
        this(str, str2, serCrypto, ByteString.EMPTY);
    }

    public ImageSetPassThrough(String str, String str2, SerCrypto serCrypto, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.fs_unit = str2;
        this.crypto = serCrypto;
    }
}
