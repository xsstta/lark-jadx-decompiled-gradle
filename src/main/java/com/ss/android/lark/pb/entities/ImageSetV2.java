package com.ss.android.lark.pb.entities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ImageSetV2 extends Message<ImageSetV2, C49722a> {
    public static final ProtoAdapter<ImageSetV2> ADAPTER = new C49723b();
    public static final ByteString DEFAULT_INLINE_PREVIEW = ByteString.EMPTY;
    private static final long serialVersionUID = 0;
    public final Crypto mcrypto;
    public final String mfs_unit;
    public final String mimage_key;
    public final List<ImageAttribute> mimages;
    public final ByteString minline_preview;

    public static final class ImageAttribute extends Message<ImageAttribute, C49720a> {
        public static final ProtoAdapter<ImageAttribute> ADAPTER = new C49721b();
        private static final long serialVersionUID = 0;
        public final ImageBaseAttribute mattribute;
        public final ImageCropType mtype;

        /* renamed from: com.ss.android.lark.pb.entities.ImageSetV2$ImageAttribute$b */
        private static final class C49721b extends ProtoAdapter<ImageAttribute> {
            C49721b() {
                super(FieldEncoding.LENGTH_DELIMITED, ImageAttribute.class);
            }

            /* renamed from: a */
            public int encodedSize(ImageAttribute imageAttribute) {
                return ImageCropType.ADAPTER.encodedSizeWithTag(1, imageAttribute.mtype) + ImageBaseAttribute.ADAPTER.encodedSizeWithTag(2, imageAttribute.mattribute) + imageAttribute.unknownFields().size();
            }

            /* renamed from: a */
            public ImageAttribute decode(ProtoReader protoReader) throws IOException {
                C49720a aVar = new C49720a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f124488a = ImageCropType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f124489b = ImageBaseAttribute.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ImageAttribute imageAttribute) throws IOException {
                ImageCropType.ADAPTER.encodeWithTag(protoWriter, 1, imageAttribute.mtype);
                ImageBaseAttribute.ADAPTER.encodeWithTag(protoWriter, 2, imageAttribute.mattribute);
                protoWriter.writeBytes(imageAttribute.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49720a newBuilder() {
            C49720a aVar = new C49720a();
            aVar.f124488a = this.mtype;
            aVar.f124489b = this.mattribute;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.ss.android.lark.pb.entities.ImageSetV2$ImageAttribute$a */
        public static final class C49720a extends Message.Builder<ImageAttribute, C49720a> {

            /* renamed from: a */
            public ImageCropType f124488a;

            /* renamed from: b */
            public ImageBaseAttribute f124489b;

            /* renamed from: a */
            public ImageAttribute build() {
                ImageBaseAttribute imageBaseAttribute;
                ImageCropType imageCropType = this.f124488a;
                if (imageCropType != null && (imageBaseAttribute = this.f124489b) != null) {
                    return new ImageAttribute(imageCropType, imageBaseAttribute, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(imageCropType, "mtype", this.f124489b, "mattribute");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", type=");
            sb.append(this.mtype);
            sb.append(", attribute=");
            sb.append(this.mattribute);
            StringBuilder replace = sb.replace(0, 2, "ImageAttribute{");
            replace.append('}');
            return replace.toString();
        }

        public ImageAttribute(ImageCropType imageCropType, ImageBaseAttribute imageBaseAttribute) {
            this(imageCropType, imageBaseAttribute, ByteString.EMPTY);
        }

        public ImageAttribute(ImageCropType imageCropType, ImageBaseAttribute imageBaseAttribute, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mtype = imageCropType;
            this.mattribute = imageBaseAttribute;
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.ImageSetV2$b */
    private static final class C49723b extends ProtoAdapter<ImageSetV2> {
        C49723b() {
            super(FieldEncoding.LENGTH_DELIMITED, ImageSetV2.class);
        }

        /* renamed from: a */
        public int encodedSize(ImageSetV2 imageSetV2) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (imageSetV2.mimage_key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, imageSetV2.mimage_key);
            } else {
                i = 0;
            }
            if (imageSetV2.mfs_unit != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, imageSetV2.mfs_unit);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (imageSetV2.mcrypto != null) {
                i3 = Crypto.ADAPTER.encodedSizeWithTag(3, imageSetV2.mcrypto);
            } else {
                i3 = 0;
            }
            int encodedSizeWithTag = i5 + i3 + ImageAttribute.ADAPTER.asRepeated().encodedSizeWithTag(4, imageSetV2.mimages);
            if (imageSetV2.minline_preview != null) {
                i4 = ProtoAdapter.BYTES.encodedSizeWithTag(5, imageSetV2.minline_preview);
            }
            return encodedSizeWithTag + i4 + imageSetV2.unknownFields().size();
        }

        /* renamed from: a */
        public ImageSetV2 decode(ProtoReader protoReader) throws IOException {
            C49722a aVar = new C49722a();
            aVar.f124490a = "";
            aVar.f124491b = "";
            aVar.f124494e = ByteString.EMPTY;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124490a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124491b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f124492c = Crypto.ADAPTER.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f124493d.add(ImageAttribute.ADAPTER.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124494e = ProtoAdapter.BYTES.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ImageSetV2 imageSetV2) throws IOException {
            if (imageSetV2.mimage_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, imageSetV2.mimage_key);
            }
            if (imageSetV2.mfs_unit != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, imageSetV2.mfs_unit);
            }
            if (imageSetV2.mcrypto != null) {
                Crypto.ADAPTER.encodeWithTag(protoWriter, 3, imageSetV2.mcrypto);
            }
            ImageAttribute.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, imageSetV2.mimages);
            if (imageSetV2.minline_preview != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 5, imageSetV2.minline_preview);
            }
            protoWriter.writeBytes(imageSetV2.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.ImageSetV2$a */
    public static final class C49722a extends Message.Builder<ImageSetV2, C49722a> {

        /* renamed from: a */
        public String f124490a;

        /* renamed from: b */
        public String f124491b;

        /* renamed from: c */
        public Crypto f124492c;

        /* renamed from: d */
        public List<ImageAttribute> f124493d = Internal.newMutableList();

        /* renamed from: e */
        public ByteString f124494e;

        /* renamed from: a */
        public ImageSetV2 build() {
            return new ImageSetV2(this.f124490a, this.f124491b, this.f124492c, this.f124493d, this.f124494e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49722a newBuilder() {
        C49722a aVar = new C49722a();
        aVar.f124490a = this.mimage_key;
        aVar.f124491b = this.mfs_unit;
        aVar.f124492c = this.mcrypto;
        aVar.f124493d = Internal.copyOf("mimages", this.mimages);
        aVar.f124494e = this.minline_preview;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mimage_key != null) {
            sb.append(", image_key=");
            sb.append(this.mimage_key);
        }
        if (this.mfs_unit != null) {
            sb.append(", fs_unit=");
            sb.append(this.mfs_unit);
        }
        if (this.mcrypto != null) {
            sb.append(", crypto=");
            sb.append(this.mcrypto);
        }
        if (!this.mimages.isEmpty()) {
            sb.append(", images=");
            sb.append(this.mimages);
        }
        if (this.minline_preview != null) {
            sb.append(", inline_preview=");
            sb.append(this.minline_preview);
        }
        StringBuilder replace = sb.replace(0, 2, "ImageSetV2{");
        replace.append('}');
        return replace.toString();
    }

    public ImageSetV2(String str, String str2, Crypto crypto, List<ImageAttribute> list, ByteString byteString) {
        this(str, str2, crypto, list, byteString, ByteString.EMPTY);
    }

    public ImageSetV2(String str, String str2, Crypto crypto, List<ImageAttribute> list, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.mimage_key = str;
        this.mfs_unit = str2;
        this.mcrypto = crypto;
        this.mimages = Internal.immutableCopyOf("mimages", list);
        this.minline_preview = byteString;
    }
}
