package com.ss.android.lark.pb.entities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ImageSetPassThrough extends Message<ImageSetPassThrough, C49718a> {
    public static final ProtoAdapter<ImageSetPassThrough> ADAPTER = new C49719b();
    private static final long serialVersionUID = 0;
    public final Crypto mcrypto;
    public final String mfs_unit;
    public final String mkey;
    public final String murl;

    /* renamed from: com.ss.android.lark.pb.entities.ImageSetPassThrough$b */
    private static final class C49719b extends ProtoAdapter<ImageSetPassThrough> {
        C49719b() {
            super(FieldEncoding.LENGTH_DELIMITED, ImageSetPassThrough.class);
        }

        /* renamed from: a */
        public int encodedSize(ImageSetPassThrough imageSetPassThrough) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, imageSetPassThrough.mkey);
            int i3 = 0;
            if (imageSetPassThrough.mfs_unit != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, imageSetPassThrough.mfs_unit);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (imageSetPassThrough.murl != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, imageSetPassThrough.murl);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (imageSetPassThrough.mcrypto != null) {
                i3 = Crypto.ADAPTER.encodedSizeWithTag(4, imageSetPassThrough.mcrypto);
            }
            return i5 + i3 + imageSetPassThrough.unknownFields().size();
        }

        /* renamed from: a */
        public ImageSetPassThrough decode(ProtoReader protoReader) throws IOException {
            C49718a aVar = new C49718a();
            aVar.f124484a = "";
            aVar.f124485b = "";
            aVar.f124486c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124484a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124485b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f124486c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124487d = Crypto.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ImageSetPassThrough imageSetPassThrough) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, imageSetPassThrough.mkey);
            if (imageSetPassThrough.mfs_unit != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, imageSetPassThrough.mfs_unit);
            }
            if (imageSetPassThrough.murl != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, imageSetPassThrough.murl);
            }
            if (imageSetPassThrough.mcrypto != null) {
                Crypto.ADAPTER.encodeWithTag(protoWriter, 4, imageSetPassThrough.mcrypto);
            }
            protoWriter.writeBytes(imageSetPassThrough.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49718a newBuilder() {
        C49718a aVar = new C49718a();
        aVar.f124484a = this.mkey;
        aVar.f124485b = this.mfs_unit;
        aVar.f124486c = this.murl;
        aVar.f124487d = this.mcrypto;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.entities.ImageSetPassThrough$a */
    public static final class C49718a extends Message.Builder<ImageSetPassThrough, C49718a> {

        /* renamed from: a */
        public String f124484a;

        /* renamed from: b */
        public String f124485b;

        /* renamed from: c */
        public String f124486c;

        /* renamed from: d */
        public Crypto f124487d;

        /* renamed from: a */
        public ImageSetPassThrough build() {
            String str = this.f124484a;
            if (str != null) {
                return new ImageSetPassThrough(str, this.f124485b, this.f124486c, this.f124487d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mkey");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.mkey);
        if (this.mfs_unit != null) {
            sb.append(", fs_unit=");
            sb.append(this.mfs_unit);
        }
        if (this.murl != null) {
            sb.append(", url=");
            sb.append(this.murl);
        }
        if (this.mcrypto != null) {
            sb.append(", crypto=");
            sb.append(this.mcrypto);
        }
        StringBuilder replace = sb.replace(0, 2, "ImageSetPassThrough{");
        replace.append('}');
        return replace.toString();
    }

    public ImageSetPassThrough(String str, String str2, String str3, Crypto crypto) {
        this(str, str2, str3, crypto, ByteString.EMPTY);
    }

    public ImageSetPassThrough(String str, String str2, String str3, Crypto crypto, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mkey = str;
        this.mfs_unit = str2;
        this.murl = str3;
        this.mcrypto = crypto;
    }
}
