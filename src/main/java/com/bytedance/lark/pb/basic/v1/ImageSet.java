package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ImageSet extends Message<ImageSet, C15011a> {
    public static final ProtoAdapter<ImageSet> ADAPTER = new C15012b();
    public static final ByteString DEFAULT_INLINE_PREVIEW = ByteString.EMPTY;
    private static final long serialVersionUID = 0;
    public final Image cover;
    public final ByteString inline_preview;
    public final Image intact;
    public final String key;
    public final Image middle;
    public final Image middle_mp4;
    public final Image middle_webp;
    public final Image origin;
    public final Image thumbnail;
    public final Image thumbnail_webp;

    /* renamed from: com.bytedance.lark.pb.basic.v1.ImageSet$b */
    private static final class C15012b extends ProtoAdapter<ImageSet> {
        C15012b() {
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
            if (imageSet.key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, imageSet.key);
            } else {
                i = 0;
            }
            if (imageSet.origin != null) {
                i2 = Image.ADAPTER.encodedSizeWithTag(2, imageSet.origin);
            } else {
                i2 = 0;
            }
            int i11 = i + i2;
            if (imageSet.thumbnail != null) {
                i3 = Image.ADAPTER.encodedSizeWithTag(3, imageSet.thumbnail);
            } else {
                i3 = 0;
            }
            int i12 = i11 + i3;
            if (imageSet.middle != null) {
                i4 = Image.ADAPTER.encodedSizeWithTag(4, imageSet.middle);
            } else {
                i4 = 0;
            }
            int i13 = i12 + i4;
            if (imageSet.thumbnail_webp != null) {
                i5 = Image.ADAPTER.encodedSizeWithTag(5, imageSet.thumbnail_webp);
            } else {
                i5 = 0;
            }
            int i14 = i13 + i5;
            if (imageSet.middle_webp != null) {
                i6 = Image.ADAPTER.encodedSizeWithTag(6, imageSet.middle_webp);
            } else {
                i6 = 0;
            }
            int i15 = i14 + i6;
            if (imageSet.middle_mp4 != null) {
                i7 = Image.ADAPTER.encodedSizeWithTag(7, imageSet.middle_mp4);
            } else {
                i7 = 0;
            }
            int i16 = i15 + i7;
            if (imageSet.cover != null) {
                i8 = Image.ADAPTER.encodedSizeWithTag(8, imageSet.cover);
            } else {
                i8 = 0;
            }
            int i17 = i16 + i8;
            if (imageSet.inline_preview != null) {
                i9 = ProtoAdapter.BYTES.encodedSizeWithTag(9, imageSet.inline_preview);
            } else {
                i9 = 0;
            }
            int i18 = i17 + i9;
            if (imageSet.intact != null) {
                i10 = Image.ADAPTER.encodedSizeWithTag(10, imageSet.intact);
            }
            return i18 + i10 + imageSet.unknownFields().size();
        }

        /* renamed from: a */
        public ImageSet decode(ProtoReader protoReader) throws IOException {
            C15011a aVar = new C15011a();
            aVar.f39694a = "";
            aVar.f39702i = ByteString.EMPTY;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f39694a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f39695b = Image.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f39696c = Image.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f39697d = Image.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f39698e = Image.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f39699f = Image.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f39700g = Image.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            aVar.f39701h = Image.ADAPTER.decode(protoReader);
                            break;
                        case 9:
                            aVar.f39702i = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        case 10:
                            aVar.f39703j = Image.ADAPTER.decode(protoReader);
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
            if (imageSet.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, imageSet.key);
            }
            if (imageSet.origin != null) {
                Image.ADAPTER.encodeWithTag(protoWriter, 2, imageSet.origin);
            }
            if (imageSet.thumbnail != null) {
                Image.ADAPTER.encodeWithTag(protoWriter, 3, imageSet.thumbnail);
            }
            if (imageSet.middle != null) {
                Image.ADAPTER.encodeWithTag(protoWriter, 4, imageSet.middle);
            }
            if (imageSet.thumbnail_webp != null) {
                Image.ADAPTER.encodeWithTag(protoWriter, 5, imageSet.thumbnail_webp);
            }
            if (imageSet.middle_webp != null) {
                Image.ADAPTER.encodeWithTag(protoWriter, 6, imageSet.middle_webp);
            }
            if (imageSet.middle_mp4 != null) {
                Image.ADAPTER.encodeWithTag(protoWriter, 7, imageSet.middle_mp4);
            }
            if (imageSet.cover != null) {
                Image.ADAPTER.encodeWithTag(protoWriter, 8, imageSet.cover);
            }
            if (imageSet.inline_preview != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 9, imageSet.inline_preview);
            }
            if (imageSet.intact != null) {
                Image.ADAPTER.encodeWithTag(protoWriter, 10, imageSet.intact);
            }
            protoWriter.writeBytes(imageSet.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.ImageSet$a */
    public static final class C15011a extends Message.Builder<ImageSet, C15011a> {

        /* renamed from: a */
        public String f39694a;

        /* renamed from: b */
        public Image f39695b;

        /* renamed from: c */
        public Image f39696c;

        /* renamed from: d */
        public Image f39697d;

        /* renamed from: e */
        public Image f39698e;

        /* renamed from: f */
        public Image f39699f;

        /* renamed from: g */
        public Image f39700g;

        /* renamed from: h */
        public Image f39701h;

        /* renamed from: i */
        public ByteString f39702i;

        /* renamed from: j */
        public Image f39703j;

        /* renamed from: a */
        public ImageSet build() {
            return new ImageSet(this.f39694a, this.f39695b, this.f39696c, this.f39697d, this.f39698e, this.f39699f, this.f39700g, this.f39701h, this.f39702i, this.f39703j, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15011a mo54856a(Image image) {
            this.f39695b = image;
            return this;
        }

        /* renamed from: b */
        public C15011a mo54859b(Image image) {
            this.f39696c = image;
            return this;
        }

        /* renamed from: c */
        public C15011a mo54860c(Image image) {
            this.f39697d = image;
            return this;
        }

        /* renamed from: a */
        public C15011a mo54857a(String str) {
            this.f39694a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15011a newBuilder() {
        C15011a aVar = new C15011a();
        aVar.f39694a = this.key;
        aVar.f39695b = this.origin;
        aVar.f39696c = this.thumbnail;
        aVar.f39697d = this.middle;
        aVar.f39698e = this.thumbnail_webp;
        aVar.f39699f = this.middle_webp;
        aVar.f39700g = this.middle_mp4;
        aVar.f39701h = this.cover;
        aVar.f39702i = this.inline_preview;
        aVar.f39703j = this.intact;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "ImageSet");
        StringBuilder sb = new StringBuilder();
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.origin != null) {
            sb.append(", origin=");
            sb.append(this.origin);
        }
        if (this.thumbnail != null) {
            sb.append(", thumbnail=");
            sb.append(this.thumbnail);
        }
        if (this.middle != null) {
            sb.append(", middle=");
            sb.append(this.middle);
        }
        if (this.thumbnail_webp != null) {
            sb.append(", thumbnail_webp=");
            sb.append(this.thumbnail_webp);
        }
        if (this.middle_webp != null) {
            sb.append(", middle_webp=");
            sb.append(this.middle_webp);
        }
        if (this.middle_mp4 != null) {
            sb.append(", middle_mp4=");
            sb.append(this.middle_mp4);
        }
        if (this.cover != null) {
            sb.append(", cover=");
            sb.append(this.cover);
        }
        if (this.inline_preview != null) {
            sb.append(", inline_preview=");
            sb.append(this.inline_preview);
        }
        if (this.intact != null) {
            sb.append(", intact=");
            sb.append(this.intact);
        }
        StringBuilder replace = sb.replace(0, 2, "ImageSet{");
        replace.append('}');
        return replace.toString();
    }

    public ImageSet(String str, Image image, Image image2, Image image3, Image image4, Image image5, Image image6, Image image7, ByteString byteString, Image image8) {
        this(str, image, image2, image3, image4, image5, image6, image7, byteString, image8, ByteString.EMPTY);
    }

    public ImageSet(String str, Image image, Image image2, Image image3, Image image4, Image image5, Image image6, Image image7, ByteString byteString, Image image8, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.key = str;
        this.origin = image;
        this.thumbnail = image2;
        this.middle = image3;
        this.thumbnail_webp = image4;
        this.middle_webp = image5;
        this.middle_mp4 = image6;
        this.cover = image7;
        this.inline_preview = byteString;
        this.intact = image8;
    }
}
