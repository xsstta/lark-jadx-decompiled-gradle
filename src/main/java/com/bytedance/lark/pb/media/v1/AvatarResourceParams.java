package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.io.IOException;
import okio.ByteString;

public final class AvatarResourceParams extends Message<AvatarResourceParams, C18186a> {
    public static final ProtoAdapter<AvatarResourceParams> ADAPTER = new C18187b();
    public static final CutType DEFAULT_CUT_TYPE = CutType.TOP;
    public static final ImageFormat DEFAULT_FORMAT = ImageFormat.PNG;
    public static final Integer DEFAULT_HEIGHT;
    public static final Boolean DEFAULT_NOOP = false;
    public static final Integer DEFAULT_QUALITY = 70;
    public static final Integer DEFAULT_WIDTH;
    private static final long serialVersionUID = 0;
    public final CutType cut_type;
    public final ImageFormat format;
    public final Integer height;
    public final Boolean noop;
    public final Integer quality;
    public final Integer width;

    public enum CutType implements WireEnum {
        TOP(1),
        BOTTOM(2),
        LEFT(3),
        RIGHT(4),
        CENTER(5),
        FACE(6);
        
        public static final ProtoAdapter<CutType> ADAPTER = ProtoAdapter.newEnumAdapter(CutType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static CutType fromValue(int i) {
            switch (i) {
                case 1:
                    return TOP;
                case 2:
                    return BOTTOM;
                case 3:
                    return LEFT;
                case 4:
                    return RIGHT;
                case 5:
                    return CENTER;
                case 6:
                    return FACE;
                default:
                    return null;
            }
        }

        private CutType(int i) {
            this.value = i;
        }
    }

    public enum ImageFormat implements WireEnum {
        WEBP(1),
        JPEG(2),
        PNG(3);
        
        public static final ProtoAdapter<ImageFormat> ADAPTER = ProtoAdapter.newEnumAdapter(ImageFormat.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ImageFormat fromValue(int i) {
            if (i == 1) {
                return WEBP;
            }
            if (i == 2) {
                return JPEG;
            }
            if (i != 3) {
                return null;
            }
            return PNG;
        }

        private ImageFormat(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.AvatarResourceParams$b */
    private static final class C18187b extends ProtoAdapter<AvatarResourceParams> {
        C18187b() {
            super(FieldEncoding.LENGTH_DELIMITED, AvatarResourceParams.class);
        }

        /* renamed from: a */
        public int encodedSize(AvatarResourceParams avatarResourceParams) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (avatarResourceParams.width != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, avatarResourceParams.width);
            } else {
                i = 0;
            }
            if (avatarResourceParams.height != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, avatarResourceParams.height);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (avatarResourceParams.cut_type != null) {
                i3 = CutType.ADAPTER.encodedSizeWithTag(3, avatarResourceParams.cut_type);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (avatarResourceParams.format != null) {
                i4 = ImageFormat.ADAPTER.encodedSizeWithTag(4, avatarResourceParams.format);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (avatarResourceParams.quality != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(5, avatarResourceParams.quality);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (avatarResourceParams.noop != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, avatarResourceParams.noop);
            }
            return i10 + i6 + avatarResourceParams.unknownFields().size();
        }

        /* renamed from: a */
        public AvatarResourceParams decode(ProtoReader protoReader) throws IOException {
            C18186a aVar = new C18186a();
            Integer valueOf = Integer.valueOf((int) SmEvents.EVENT_NW);
            aVar.f45399a = valueOf;
            aVar.f45400b = valueOf;
            aVar.f45401c = CutType.TOP;
            aVar.f45402d = ImageFormat.PNG;
            aVar.f45403e = 70;
            aVar.f45404f = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f45399a = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            aVar.f45400b = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f45401c = CutType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            try {
                                aVar.f45402d = ImageFormat.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 5:
                            aVar.f45403e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f45404f = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, AvatarResourceParams avatarResourceParams) throws IOException {
            if (avatarResourceParams.width != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, avatarResourceParams.width);
            }
            if (avatarResourceParams.height != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, avatarResourceParams.height);
            }
            if (avatarResourceParams.cut_type != null) {
                CutType.ADAPTER.encodeWithTag(protoWriter, 3, avatarResourceParams.cut_type);
            }
            if (avatarResourceParams.format != null) {
                ImageFormat.ADAPTER.encodeWithTag(protoWriter, 4, avatarResourceParams.format);
            }
            if (avatarResourceParams.quality != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, avatarResourceParams.quality);
            }
            if (avatarResourceParams.noop != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, avatarResourceParams.noop);
            }
            protoWriter.writeBytes(avatarResourceParams.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.AvatarResourceParams$a */
    public static final class C18186a extends Message.Builder<AvatarResourceParams, C18186a> {

        /* renamed from: a */
        public Integer f45399a;

        /* renamed from: b */
        public Integer f45400b;

        /* renamed from: c */
        public CutType f45401c;

        /* renamed from: d */
        public ImageFormat f45402d;

        /* renamed from: e */
        public Integer f45403e;

        /* renamed from: f */
        public Boolean f45404f;

        /* renamed from: a */
        public AvatarResourceParams build() {
            return new AvatarResourceParams(this.f45399a, this.f45400b, this.f45401c, this.f45402d, this.f45403e, this.f45404f, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18186a mo63058a(CutType cutType) {
            this.f45401c = cutType;
            return this;
        }

        /* renamed from: b */
        public C18186a mo63063b(Integer num) {
            this.f45400b = num;
            return this;
        }

        /* renamed from: c */
        public C18186a mo63064c(Integer num) {
            this.f45403e = num;
            return this;
        }

        /* renamed from: a */
        public C18186a mo63059a(ImageFormat imageFormat) {
            this.f45402d = imageFormat;
            return this;
        }

        /* renamed from: a */
        public C18186a mo63060a(Boolean bool) {
            this.f45404f = bool;
            return this;
        }

        /* renamed from: a */
        public C18186a mo63061a(Integer num) {
            this.f45399a = num;
            return this;
        }
    }

    static {
        Integer valueOf = Integer.valueOf((int) SmEvents.EVENT_NW);
        DEFAULT_WIDTH = valueOf;
        DEFAULT_HEIGHT = valueOf;
    }

    @Override // com.squareup.wire.Message
    public C18186a newBuilder() {
        C18186a aVar = new C18186a();
        aVar.f45399a = this.width;
        aVar.f45400b = this.height;
        aVar.f45401c = this.cut_type;
        aVar.f45402d = this.format;
        aVar.f45403e = this.quality;
        aVar.f45404f = this.noop;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "AvatarResourceParams");
        StringBuilder sb = new StringBuilder();
        if (this.width != null) {
            sb.append(", width=");
            sb.append(this.width);
        }
        if (this.height != null) {
            sb.append(", height=");
            sb.append(this.height);
        }
        if (this.cut_type != null) {
            sb.append(", cut_type=");
            sb.append(this.cut_type);
        }
        if (this.format != null) {
            sb.append(", format=");
            sb.append(this.format);
        }
        if (this.quality != null) {
            sb.append(", quality=");
            sb.append(this.quality);
        }
        if (this.noop != null) {
            sb.append(", noop=");
            sb.append(this.noop);
        }
        StringBuilder replace = sb.replace(0, 2, "AvatarResourceParams{");
        replace.append('}');
        return replace.toString();
    }

    public AvatarResourceParams(Integer num, Integer num2, CutType cutType, ImageFormat imageFormat, Integer num3, Boolean bool) {
        this(num, num2, cutType, imageFormat, num3, bool, ByteString.EMPTY);
    }

    public AvatarResourceParams(Integer num, Integer num2, CutType cutType, ImageFormat imageFormat, Integer num3, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.width = num;
        this.height = num2;
        this.cut_type = cutType;
        this.format = imageFormat;
        this.quality = num3;
        this.noop = bool;
    }
}
