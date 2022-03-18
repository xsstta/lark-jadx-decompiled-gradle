package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class Image extends Message<Image, C15009a> {
    public static final ProtoAdapter<Image> ADAPTER = new C15010b();
    public static final Integer DEFAULT_EXIF_ORIENTATION = 0;
    public static final Integer DEFAULT_HEIGHT = 0;
    public static final Type DEFAULT_TYPE = Type.NORMAL;
    public static final Integer DEFAULT_WIDTH = 0;
    private static final long serialVersionUID = 0;
    public final Integer exif_orientation;
    public final Integer height;
    public final String key;
    public final Type type;
    public final List<String> urls;
    public final Integer width;

    public enum Type implements WireEnum {
        NORMAL(1),
        ENCRYPTED(2);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 1) {
                return NORMAL;
            }
            if (i != 2) {
                return null;
            }
            return ENCRYPTED;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Image$b */
    private static final class C15010b extends ProtoAdapter<Image> {
        C15010b() {
            super(FieldEncoding.LENGTH_DELIMITED, Image.class);
        }

        /* renamed from: a */
        public int encodedSize(Image image) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (image.key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, image.key);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, image.urls);
            if (image.width != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, image.width);
            } else {
                i2 = 0;
            }
            int i6 = encodedSizeWithTag + i2;
            if (image.height != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(4, image.height);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (image.type != null) {
                i4 = Type.ADAPTER.encodedSizeWithTag(5, image.type);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (image.exif_orientation != null) {
                i5 = ProtoAdapter.UINT32.encodedSizeWithTag(6, image.exif_orientation);
            }
            return i8 + i5 + image.unknownFields().size();
        }

        /* renamed from: a */
        public Image decode(ProtoReader protoReader) throws IOException {
            C15009a aVar = new C15009a();
            aVar.f39688a = "";
            aVar.f39690c = 0;
            aVar.f39691d = 0;
            aVar.f39692e = Type.NORMAL;
            aVar.f39693f = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f39688a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f39689b.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            aVar.f39690c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            aVar.f39691d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f39692e = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 6:
                            aVar.f39693f = ProtoAdapter.UINT32.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, Image image) throws IOException {
            if (image.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, image.key);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, image.urls);
            if (image.width != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, image.width);
            }
            if (image.height != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, image.height);
            }
            if (image.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 5, image.type);
            }
            if (image.exif_orientation != null) {
                ProtoAdapter.UINT32.encodeWithTag(protoWriter, 6, image.exif_orientation);
            }
            protoWriter.writeBytes(image.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Image$a */
    public static final class C15009a extends Message.Builder<Image, C15009a> {

        /* renamed from: a */
        public String f39688a;

        /* renamed from: b */
        public List<String> f39689b = Internal.newMutableList();

        /* renamed from: c */
        public Integer f39690c;

        /* renamed from: d */
        public Integer f39691d;

        /* renamed from: e */
        public Type f39692e;

        /* renamed from: f */
        public Integer f39693f;

        /* renamed from: a */
        public Image build() {
            return new Image(this.f39688a, this.f39689b, this.f39690c, this.f39691d, this.f39692e, this.f39693f, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15009a mo54847a(Type type) {
            this.f39692e = type;
            return this;
        }

        /* renamed from: b */
        public C15009a mo54852b(Integer num) {
            this.f39691d = num;
            return this;
        }

        /* renamed from: a */
        public C15009a mo54848a(Integer num) {
            this.f39690c = num;
            return this;
        }

        /* renamed from: a */
        public C15009a mo54849a(String str) {
            this.f39688a = str;
            return this;
        }

        /* renamed from: a */
        public C15009a mo54850a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f39689b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15009a newBuilder() {
        C15009a aVar = new C15009a();
        aVar.f39688a = this.key;
        aVar.f39689b = Internal.copyOf("urls", this.urls);
        aVar.f39690c = this.width;
        aVar.f39691d = this.height;
        aVar.f39692e = this.type;
        aVar.f39693f = this.exif_orientation;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "Image");
        StringBuilder sb = new StringBuilder();
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (!this.urls.isEmpty()) {
            sb.append(", urls=");
            sb.append(this.urls);
        }
        if (this.width != null) {
            sb.append(", width=");
            sb.append(this.width);
        }
        if (this.height != null) {
            sb.append(", height=");
            sb.append(this.height);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.exif_orientation != null) {
            sb.append(", exif_orientation=");
            sb.append(this.exif_orientation);
        }
        StringBuilder replace = sb.replace(0, 2, "Image{");
        replace.append('}');
        return replace.toString();
    }

    public Image(String str, List<String> list, Integer num, Integer num2, Type type2, Integer num3) {
        this(str, list, num, num2, type2, num3, ByteString.EMPTY);
    }

    public Image(String str, List<String> list, Integer num, Integer num2, Type type2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.urls = Internal.immutableCopyOf("urls", list);
        this.width = num;
        this.height = num2;
        this.type = type2;
        this.exif_orientation = num3;
    }
}
