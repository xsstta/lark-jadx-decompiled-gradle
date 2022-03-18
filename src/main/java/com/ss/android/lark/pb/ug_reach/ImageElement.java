package com.ss.android.lark.pb.ug_reach;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ImageElement extends Message<ImageElement, C50124a> {
    public static final ProtoAdapter<ImageElement> ADAPTER = new C50125b();
    private static final long serialVersionUID = 0;
    public final CdnImageElement mcdn_image;
    public final RawImageElement mraw_image;
    public final ImageType mtype;

    public enum ImageType implements WireEnum {
        UNKNOWN(0),
        RAW_BYTES(1),
        ENCRYPTED_BYTES(2),
        RAW_CDN_URL(3),
        ENCRYPTED_CDN_URL(4);
        
        public static final ProtoAdapter<ImageType> ADAPTER = ProtoAdapter.newEnumAdapter(ImageType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ImageType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return RAW_BYTES;
            }
            if (i == 2) {
                return ENCRYPTED_BYTES;
            }
            if (i == 3) {
                return RAW_CDN_URL;
            }
            if (i != 4) {
                return null;
            }
            return ENCRYPTED_CDN_URL;
        }

        private ImageType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.ug_reach.ImageElement$b */
    private static final class C50125b extends ProtoAdapter<ImageElement> {
        C50125b() {
            super(FieldEncoding.LENGTH_DELIMITED, ImageElement.class);
        }

        /* renamed from: a */
        public int encodedSize(ImageElement imageElement) {
            int i;
            int i2;
            int i3 = 0;
            if (imageElement.mtype != null) {
                i = ImageType.ADAPTER.encodedSizeWithTag(1, imageElement.mtype);
            } else {
                i = 0;
            }
            if (imageElement.mraw_image != null) {
                i2 = RawImageElement.ADAPTER.encodedSizeWithTag(2, imageElement.mraw_image);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (imageElement.mcdn_image != null) {
                i3 = CdnImageElement.ADAPTER.encodedSizeWithTag(3, imageElement.mcdn_image);
            }
            return i4 + i3 + imageElement.unknownFields().size();
        }

        /* renamed from: a */
        public ImageElement decode(ProtoReader protoReader) throws IOException {
            C50124a aVar = new C50124a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f125277a = ImageType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.mo174074a(RawImageElement.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.mo174073a(CdnImageElement.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ImageElement imageElement) throws IOException {
            if (imageElement.mtype != null) {
                ImageType.ADAPTER.encodeWithTag(protoWriter, 1, imageElement.mtype);
            }
            if (imageElement.mraw_image != null) {
                RawImageElement.ADAPTER.encodeWithTag(protoWriter, 2, imageElement.mraw_image);
            }
            if (imageElement.mcdn_image != null) {
                CdnImageElement.ADAPTER.encodeWithTag(protoWriter, 3, imageElement.mcdn_image);
            }
            protoWriter.writeBytes(imageElement.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ug_reach.ImageElement$a */
    public static final class C50124a extends Message.Builder<ImageElement, C50124a> {

        /* renamed from: a */
        public ImageType f125277a;

        /* renamed from: b */
        public RawImageElement f125278b;

        /* renamed from: c */
        public CdnImageElement f125279c;

        /* renamed from: a */
        public ImageElement build() {
            return new ImageElement(this.f125277a, this.f125278b, this.f125279c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50124a mo174073a(CdnImageElement cdnImageElement) {
            this.f125279c = cdnImageElement;
            this.f125278b = null;
            return this;
        }

        /* renamed from: a */
        public C50124a mo174074a(RawImageElement rawImageElement) {
            this.f125278b = rawImageElement;
            this.f125279c = null;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50124a newBuilder() {
        C50124a aVar = new C50124a();
        aVar.f125277a = this.mtype;
        aVar.f125278b = this.mraw_image;
        aVar.f125279c = this.mcdn_image;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mtype != null) {
            sb.append(", type=");
            sb.append(this.mtype);
        }
        if (this.mraw_image != null) {
            sb.append(", raw_image=");
            sb.append(this.mraw_image);
        }
        if (this.mcdn_image != null) {
            sb.append(", cdn_image=");
            sb.append(this.mcdn_image);
        }
        StringBuilder replace = sb.replace(0, 2, "ImageElement{");
        replace.append('}');
        return replace.toString();
    }

    public ImageElement(ImageType imageType, RawImageElement rawImageElement, CdnImageElement cdnImageElement) {
        this(imageType, rawImageElement, cdnImageElement, ByteString.EMPTY);
    }

    public ImageElement(ImageType imageType, RawImageElement rawImageElement, CdnImageElement cdnImageElement, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(rawImageElement, cdnImageElement) <= 1) {
            this.mtype = imageType;
            this.mraw_image = rawImageElement;
            this.mcdn_image = cdnImageElement;
            return;
        }
        throw new IllegalArgumentException("at most one of mraw_image, mcdn_image may be non-null");
    }
}
