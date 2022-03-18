package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class AvatarFsUnitParams extends Message<AvatarFsUnitParams, C18184a> {
    public static final ProtoAdapter<AvatarFsUnitParams> ADAPTER = new C18185b();
    public static final CutType DEFAULT_CUT_TYPE = CutType.NOOP;
    public static final Format DEFAULT_FORMAT = Format.WEBP;
    public static final Quality DEFAULT_QUALITY = Quality.Q_NOOP;
    public static final ImageSizeType DEFAULT_SIZE_TYPE = ImageSizeType.MIDDLE;
    private static final long serialVersionUID = 0;
    public final CutType cut_type;
    public final Format format;
    public final Quality quality;
    public final ImageSizeType size_type;

    public enum CutType implements WireEnum {
        FACE(1),
        NOOP(2);
        
        public static final ProtoAdapter<CutType> ADAPTER = ProtoAdapter.newEnumAdapter(CutType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static CutType fromValue(int i) {
            if (i == 1) {
                return FACE;
            }
            if (i != 2) {
                return null;
            }
            return NOOP;
        }

        private CutType(int i) {
            this.value = i;
        }
    }

    public enum Format implements WireEnum {
        WEBP(1),
        JPEG(2),
        PNG(3),
        IMAGE(4);
        
        public static final ProtoAdapter<Format> ADAPTER = ProtoAdapter.newEnumAdapter(Format.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Format fromValue(int i) {
            if (i == 1) {
                return WEBP;
            }
            if (i == 2) {
                return JPEG;
            }
            if (i == 3) {
                return PNG;
            }
            if (i != 4) {
                return null;
            }
            return IMAGE;
        }

        private Format(int i) {
            this.value = i;
        }
    }

    public enum ImageSizeType implements WireEnum {
        SMALL(1),
        MIDDLE(2),
        ORIGIN(3),
        BIG(4);
        
        public static final ProtoAdapter<ImageSizeType> ADAPTER = ProtoAdapter.newEnumAdapter(ImageSizeType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ImageSizeType fromValue(int i) {
            if (i == 1) {
                return SMALL;
            }
            if (i == 2) {
                return MIDDLE;
            }
            if (i == 3) {
                return ORIGIN;
            }
            if (i != 4) {
                return null;
            }
            return BIG;
        }

        private ImageSizeType(int i) {
            this.value = i;
        }
    }

    public enum Quality implements WireEnum {
        Q1(1),
        Q70(2),
        Q_NOOP(3);
        
        public static final ProtoAdapter<Quality> ADAPTER = ProtoAdapter.newEnumAdapter(Quality.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Quality fromValue(int i) {
            if (i == 1) {
                return Q1;
            }
            if (i == 2) {
                return Q70;
            }
            if (i != 3) {
                return null;
            }
            return Q_NOOP;
        }

        private Quality(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.AvatarFsUnitParams$b */
    private static final class C18185b extends ProtoAdapter<AvatarFsUnitParams> {
        C18185b() {
            super(FieldEncoding.LENGTH_DELIMITED, AvatarFsUnitParams.class);
        }

        /* renamed from: a */
        public int encodedSize(AvatarFsUnitParams avatarFsUnitParams) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (avatarFsUnitParams.cut_type != null) {
                i = CutType.ADAPTER.encodedSizeWithTag(1, avatarFsUnitParams.cut_type);
            } else {
                i = 0;
            }
            if (avatarFsUnitParams.size_type != null) {
                i2 = ImageSizeType.ADAPTER.encodedSizeWithTag(2, avatarFsUnitParams.size_type);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (avatarFsUnitParams.format != null) {
                i3 = Format.ADAPTER.encodedSizeWithTag(3, avatarFsUnitParams.format);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (avatarFsUnitParams.quality != null) {
                i4 = Quality.ADAPTER.encodedSizeWithTag(4, avatarFsUnitParams.quality);
            }
            return i6 + i4 + avatarFsUnitParams.unknownFields().size();
        }

        /* renamed from: a */
        public AvatarFsUnitParams decode(ProtoReader protoReader) throws IOException {
            C18184a aVar = new C18184a();
            aVar.f45395a = CutType.NOOP;
            aVar.f45396b = ImageSizeType.MIDDLE;
            aVar.f45397c = Format.WEBP;
            aVar.f45398d = Quality.Q_NOOP;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f45395a = CutType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    try {
                        aVar.f45396b = ImageSizeType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag == 3) {
                    try {
                        aVar.f45397c = Format.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                    }
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f45398d = Quality.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AvatarFsUnitParams avatarFsUnitParams) throws IOException {
            if (avatarFsUnitParams.cut_type != null) {
                CutType.ADAPTER.encodeWithTag(protoWriter, 1, avatarFsUnitParams.cut_type);
            }
            if (avatarFsUnitParams.size_type != null) {
                ImageSizeType.ADAPTER.encodeWithTag(protoWriter, 2, avatarFsUnitParams.size_type);
            }
            if (avatarFsUnitParams.format != null) {
                Format.ADAPTER.encodeWithTag(protoWriter, 3, avatarFsUnitParams.format);
            }
            if (avatarFsUnitParams.quality != null) {
                Quality.ADAPTER.encodeWithTag(protoWriter, 4, avatarFsUnitParams.quality);
            }
            protoWriter.writeBytes(avatarFsUnitParams.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18184a newBuilder() {
        C18184a aVar = new C18184a();
        aVar.f45395a = this.cut_type;
        aVar.f45396b = this.size_type;
        aVar.f45397c = this.format;
        aVar.f45398d = this.quality;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.AvatarFsUnitParams$a */
    public static final class C18184a extends Message.Builder<AvatarFsUnitParams, C18184a> {

        /* renamed from: a */
        public CutType f45395a;

        /* renamed from: b */
        public ImageSizeType f45396b;

        /* renamed from: c */
        public Format f45397c;

        /* renamed from: d */
        public Quality f45398d;

        /* renamed from: a */
        public AvatarFsUnitParams build() {
            return new AvatarFsUnitParams(this.f45395a, this.f45396b, this.f45397c, this.f45398d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18184a mo63050a(CutType cutType) {
            this.f45395a = cutType;
            return this;
        }

        /* renamed from: a */
        public C18184a mo63051a(Format format) {
            this.f45397c = format;
            return this;
        }

        /* renamed from: a */
        public C18184a mo63052a(ImageSizeType imageSizeType) {
            this.f45396b = imageSizeType;
            return this;
        }

        /* renamed from: a */
        public C18184a mo63053a(Quality quality) {
            this.f45398d = quality;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "AvatarFsUnitParams");
        StringBuilder sb = new StringBuilder();
        if (this.cut_type != null) {
            sb.append(", cut_type=");
            sb.append(this.cut_type);
        }
        if (this.size_type != null) {
            sb.append(", size_type=");
            sb.append(this.size_type);
        }
        if (this.format != null) {
            sb.append(", format=");
            sb.append(this.format);
        }
        if (this.quality != null) {
            sb.append(", quality=");
            sb.append(this.quality);
        }
        StringBuilder replace = sb.replace(0, 2, "AvatarFsUnitParams{");
        replace.append('}');
        return replace.toString();
    }

    public AvatarFsUnitParams(CutType cutType, ImageSizeType imageSizeType, Format format2, Quality quality2) {
        this(cutType, imageSizeType, format2, quality2, ByteString.EMPTY);
    }

    public AvatarFsUnitParams(CutType cutType, ImageSizeType imageSizeType, Format format2, Quality quality2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cut_type = cutType;
        this.size_type = imageSizeType;
        this.format = format2;
        this.quality = quality2;
    }
}
