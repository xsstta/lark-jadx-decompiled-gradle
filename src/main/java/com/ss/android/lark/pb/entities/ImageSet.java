package com.ss.android.lark.pb.entities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ImageSet extends Message<ImageSet, C49716a> {
    public static final ProtoAdapter<ImageSet> ADAPTER = new C49717b();
    private static final long serialVersionUID = 0;
    public final Image mcover;
    public final String mimage_key;
    public final Image mintact;
    public final String mkey;
    public final Image mmiddle;
    public final Image mmiddle_mp4;
    public final Image mmiddle_webp;
    public final Image morigin;
    public final Image mthumbnail;
    public final Image mthumbnail_webp;

    /* renamed from: com.ss.android.lark.pb.entities.ImageSet$b */
    private static final class C49717b extends ProtoAdapter<ImageSet> {
        C49717b() {
            super(FieldEncoding.LENGTH_DELIMITED, ImageSet.class);
        }

        /* renamed from: a */
        public int encodedSize(ImageSet imageSet) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10 = 0;
            if (imageSet.mkey != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, imageSet.mkey);
            } else {
                i = 0;
            }
            if (imageSet.morigin != null) {
                i2 = Image.ADAPTER.encodedSizeWithTag(2, imageSet.morigin);
            } else {
                i2 = 0;
            }
            int i11 = i + i2;
            if (imageSet.mthumbnail != null) {
                i3 = Image.ADAPTER.encodedSizeWithTag(3, imageSet.mthumbnail);
            } else {
                i3 = 0;
            }
            int i12 = i11 + i3;
            if (imageSet.mimage_key != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, imageSet.mimage_key);
            } else {
                i4 = 0;
            }
            int i13 = i12 + i4;
            if (imageSet.mmiddle != null) {
                i5 = Image.ADAPTER.encodedSizeWithTag(5, imageSet.mmiddle);
            } else {
                i5 = 0;
            }
            int i14 = i13 + i5;
            if (imageSet.mthumbnail_webp != null) {
                i6 = Image.ADAPTER.encodedSizeWithTag(6, imageSet.mthumbnail_webp);
            } else {
                i6 = 0;
            }
            int i15 = i14 + i6;
            if (imageSet.mmiddle_webp != null) {
                i7 = Image.ADAPTER.encodedSizeWithTag(7, imageSet.mmiddle_webp);
            } else {
                i7 = 0;
            }
            int i16 = i15 + i7;
            if (imageSet.mmiddle_mp4 != null) {
                i8 = Image.ADAPTER.encodedSizeWithTag(8, imageSet.mmiddle_mp4);
            } else {
                i8 = 0;
            }
            int i17 = i16 + i8;
            if (imageSet.mcover != null) {
                i9 = Image.ADAPTER.encodedSizeWithTag(9, imageSet.mcover);
            } else {
                i9 = 0;
            }
            int i18 = i17 + i9;
            if (imageSet.mintact != null) {
                i10 = Image.ADAPTER.encodedSizeWithTag(10, imageSet.mintact);
            }
            return i18 + i10 + imageSet.unknownFields().size();
        }

        /* renamed from: a */
        public ImageSet decode(ProtoReader protoReader) throws IOException {
            C49716a aVar = new C49716a();
            aVar.f124474a = "";
            aVar.f124477d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124474a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f124475b = Image.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f124476c = Image.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f124477d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f124478e = Image.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f124479f = Image.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f124480g = Image.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            aVar.f124481h = Image.ADAPTER.decode(protoReader);
                            break;
                        case 9:
                            aVar.f124482i = Image.ADAPTER.decode(protoReader);
                            break;
                        case 10:
                            aVar.f124483j = Image.ADAPTER.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ImageSet imageSet) throws IOException {
            if (imageSet.mkey != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, imageSet.mkey);
            }
            if (imageSet.morigin != null) {
                Image.ADAPTER.encodeWithTag(protoWriter, 2, imageSet.morigin);
            }
            if (imageSet.mthumbnail != null) {
                Image.ADAPTER.encodeWithTag(protoWriter, 3, imageSet.mthumbnail);
            }
            if (imageSet.mimage_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, imageSet.mimage_key);
            }
            if (imageSet.mmiddle != null) {
                Image.ADAPTER.encodeWithTag(protoWriter, 5, imageSet.mmiddle);
            }
            if (imageSet.mthumbnail_webp != null) {
                Image.ADAPTER.encodeWithTag(protoWriter, 6, imageSet.mthumbnail_webp);
            }
            if (imageSet.mmiddle_webp != null) {
                Image.ADAPTER.encodeWithTag(protoWriter, 7, imageSet.mmiddle_webp);
            }
            if (imageSet.mmiddle_mp4 != null) {
                Image.ADAPTER.encodeWithTag(protoWriter, 8, imageSet.mmiddle_mp4);
            }
            if (imageSet.mcover != null) {
                Image.ADAPTER.encodeWithTag(protoWriter, 9, imageSet.mcover);
            }
            if (imageSet.mintact != null) {
                Image.ADAPTER.encodeWithTag(protoWriter, 10, imageSet.mintact);
            }
            protoWriter.writeBytes(imageSet.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.ImageSet$a */
    public static final class C49716a extends Message.Builder<ImageSet, C49716a> {

        /* renamed from: a */
        public String f124474a;

        /* renamed from: b */
        public Image f124475b;

        /* renamed from: c */
        public Image f124476c;

        /* renamed from: d */
        public String f124477d;

        /* renamed from: e */
        public Image f124478e;

        /* renamed from: f */
        public Image f124479f;

        /* renamed from: g */
        public Image f124480g;

        /* renamed from: h */
        public Image f124481h;

        /* renamed from: i */
        public Image f124482i;

        /* renamed from: j */
        public Image f124483j;

        /* renamed from: a */
        public ImageSet build() {
            return new ImageSet(this.f124474a, this.f124475b, this.f124476c, this.f124477d, this.f124478e, this.f124479f, this.f124480g, this.f124481h, this.f124482i, this.f124483j, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49716a newBuilder() {
        C49716a aVar = new C49716a();
        aVar.f124474a = this.mkey;
        aVar.f124475b = this.morigin;
        aVar.f124476c = this.mthumbnail;
        aVar.f124477d = this.mimage_key;
        aVar.f124478e = this.mmiddle;
        aVar.f124479f = this.mthumbnail_webp;
        aVar.f124480g = this.mmiddle_webp;
        aVar.f124481h = this.mmiddle_mp4;
        aVar.f124482i = this.mcover;
        aVar.f124483j = this.mintact;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mkey != null) {
            sb.append(", key=");
            sb.append(this.mkey);
        }
        if (this.morigin != null) {
            sb.append(", origin=");
            sb.append(this.morigin);
        }
        if (this.mthumbnail != null) {
            sb.append(", thumbnail=");
            sb.append(this.mthumbnail);
        }
        if (this.mimage_key != null) {
            sb.append(", image_key=");
            sb.append(this.mimage_key);
        }
        if (this.mmiddle != null) {
            sb.append(", middle=");
            sb.append(this.mmiddle);
        }
        if (this.mthumbnail_webp != null) {
            sb.append(", thumbnail_webp=");
            sb.append(this.mthumbnail_webp);
        }
        if (this.mmiddle_webp != null) {
            sb.append(", middle_webp=");
            sb.append(this.mmiddle_webp);
        }
        if (this.mmiddle_mp4 != null) {
            sb.append(", middle_mp4=");
            sb.append(this.mmiddle_mp4);
        }
        if (this.mcover != null) {
            sb.append(", cover=");
            sb.append(this.mcover);
        }
        if (this.mintact != null) {
            sb.append(", intact=");
            sb.append(this.mintact);
        }
        StringBuilder replace = sb.replace(0, 2, "ImageSet{");
        replace.append('}');
        return replace.toString();
    }

    public ImageSet(String str, Image image, Image image2, String str2, Image image3, Image image4, Image image5, Image image6, Image image7, Image image8) {
        this(str, image, image2, str2, image3, image4, image5, image6, image7, image8, ByteString.EMPTY);
    }

    public ImageSet(String str, Image image, Image image2, String str2, Image image3, Image image4, Image image5, Image image6, Image image7, Image image8, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mkey = str;
        this.morigin = image;
        this.mthumbnail = image2;
        this.mimage_key = str2;
        this.mmiddle = image3;
        this.mthumbnail_webp = image4;
        this.mmiddle_webp = image5;
        this.mmiddle_mp4 = image6;
        this.mcover = image7;
        this.mintact = image8;
    }
}
