package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class ImageOptions extends Message<ImageOptions, C16314a> {
    public static final ProtoAdapter<ImageOptions> ADAPTER = new C16315b();
    public static final Long DEFAULT_HEIGHT = 0L;
    public static final ResolutionType DEFAULT_RESOLUTION_TYPE = ResolutionType.UnknownResolution;
    public static final Long DEFAULT_WIDTH = 0L;
    private static final long serialVersionUID = 0;
    public final Long height;
    public final ResolutionType resolution_type;
    public final Long width;

    public enum ResolutionType implements WireEnum {
        UnknownResolution(0),
        HighDefinition(1),
        Normal(2),
        Thumbnail(3);
        
        public static final ProtoAdapter<ResolutionType> ADAPTER = ProtoAdapter.newEnumAdapter(ResolutionType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ResolutionType fromValue(int i) {
            if (i == 0) {
                return UnknownResolution;
            }
            if (i == 1) {
                return HighDefinition;
            }
            if (i == 2) {
                return Normal;
            }
            if (i != 3) {
                return null;
            }
            return Thumbnail;
        }

        private ResolutionType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.ImageOptions$b */
    private static final class C16315b extends ProtoAdapter<ImageOptions> {
        C16315b() {
            super(FieldEncoding.LENGTH_DELIMITED, ImageOptions.class);
        }

        /* renamed from: a */
        public int encodedSize(ImageOptions imageOptions) {
            int i;
            int i2;
            int i3 = 0;
            if (imageOptions.resolution_type != null) {
                i = ResolutionType.ADAPTER.encodedSizeWithTag(1, imageOptions.resolution_type);
            } else {
                i = 0;
            }
            if (imageOptions.width != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, imageOptions.width);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (imageOptions.height != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, imageOptions.height);
            }
            return i4 + i3 + imageOptions.unknownFields().size();
        }

        /* renamed from: a */
        public ImageOptions decode(ProtoReader protoReader) throws IOException {
            C16314a aVar = new C16314a();
            aVar.f42554a = ResolutionType.UnknownResolution;
            aVar.f42555b = 0L;
            aVar.f42556c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f42554a = ResolutionType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f42555b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42556c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ImageOptions imageOptions) throws IOException {
            if (imageOptions.resolution_type != null) {
                ResolutionType.ADAPTER.encodeWithTag(protoWriter, 1, imageOptions.resolution_type);
            }
            if (imageOptions.width != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, imageOptions.width);
            }
            if (imageOptions.height != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, imageOptions.height);
            }
            protoWriter.writeBytes(imageOptions.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.ImageOptions$a */
    public static final class C16314a extends Message.Builder<ImageOptions, C16314a> {

        /* renamed from: a */
        public ResolutionType f42554a;

        /* renamed from: b */
        public Long f42555b;

        /* renamed from: c */
        public Long f42556c;

        /* renamed from: a */
        public ImageOptions build() {
            return new ImageOptions(this.f42554a, this.f42555b, this.f42556c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16314a mo58348a(ResolutionType resolutionType) {
            this.f42554a = resolutionType;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16314a newBuilder() {
        C16314a aVar = new C16314a();
        aVar.f42554a = this.resolution_type;
        aVar.f42555b = this.width;
        aVar.f42556c = this.height;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "ImageOptions");
        StringBuilder sb = new StringBuilder();
        if (this.resolution_type != null) {
            sb.append(", resolution_type=");
            sb.append(this.resolution_type);
        }
        if (this.width != null) {
            sb.append(", width=");
            sb.append(this.width);
        }
        if (this.height != null) {
            sb.append(", height=");
            sb.append(this.height);
        }
        StringBuilder replace = sb.replace(0, 2, "ImageOptions{");
        replace.append('}');
        return replace.toString();
    }

    public ImageOptions(ResolutionType resolutionType, Long l, Long l2) {
        this(resolutionType, l, l2, ByteString.EMPTY);
    }

    public ImageOptions(ResolutionType resolutionType, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resolution_type = resolutionType;
        this.width = l;
        this.height = l2;
    }
}
