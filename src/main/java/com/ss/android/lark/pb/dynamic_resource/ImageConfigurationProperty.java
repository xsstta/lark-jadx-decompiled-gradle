package com.ss.android.lark.pb.dynamic_resource;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ImageConfigurationProperty extends Message<ImageConfigurationProperty, C49624a> {
    public static final ProtoAdapter<ImageConfigurationProperty> ADAPTER = new C49625b();
    public static final Float DEFAULT_ALPHA = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
    public static final Integer DEFAULT_OFFSET_X = 0;
    public static final Integer DEFAULT_OFFSET_Y = 0;
    public static final Integer DEFAULT_RESIZE_HEIGHT = 0;
    public static final Integer DEFAULT_RESIZE_WIDTH = 0;
    private static final long serialVersionUID = 0;
    public final Float malpha;
    public final BorderRadius mborder_radius;
    public final Integer moffset_x;
    public final Integer moffset_y;
    public final Integer mresize_height;
    public final Integer mresize_width;

    /* renamed from: com.ss.android.lark.pb.dynamic_resource.ImageConfigurationProperty$b */
    private static final class C49625b extends ProtoAdapter<ImageConfigurationProperty> {
        C49625b() {
            super(FieldEncoding.LENGTH_DELIMITED, ImageConfigurationProperty.class);
        }

        /* renamed from: a */
        public int encodedSize(ImageConfigurationProperty imageConfigurationProperty) {
            int i;
            int i2;
            int i3;
            int encodedSizeWithTag = ProtoAdapter.UINT32.encodedSizeWithTag(1, imageConfigurationProperty.moffset_x) + ProtoAdapter.UINT32.encodedSizeWithTag(2, imageConfigurationProperty.moffset_y);
            int i4 = 0;
            if (imageConfigurationProperty.mresize_height != null) {
                i = ProtoAdapter.UINT32.encodedSizeWithTag(3, imageConfigurationProperty.mresize_height);
            } else {
                i = 0;
            }
            int i5 = encodedSizeWithTag + i;
            if (imageConfigurationProperty.mresize_width != null) {
                i2 = ProtoAdapter.UINT32.encodedSizeWithTag(4, imageConfigurationProperty.mresize_width);
            } else {
                i2 = 0;
            }
            int i6 = i5 + i2;
            if (imageConfigurationProperty.malpha != null) {
                i3 = ProtoAdapter.FLOAT.encodedSizeWithTag(5, imageConfigurationProperty.malpha);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (imageConfigurationProperty.mborder_radius != null) {
                i4 = BorderRadius.ADAPTER.encodedSizeWithTag(6, imageConfigurationProperty.mborder_radius);
            }
            return i7 + i4 + imageConfigurationProperty.unknownFields().size();
        }

        /* renamed from: a */
        public ImageConfigurationProperty decode(ProtoReader protoReader) throws IOException {
            C49624a aVar = new C49624a();
            aVar.f124252a = 0;
            aVar.f124253b = 0;
            aVar.f124254c = 0;
            aVar.f124255d = 0;
            aVar.f124256e = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124252a = ProtoAdapter.UINT32.decode(protoReader);
                            break;
                        case 2:
                            aVar.f124253b = ProtoAdapter.UINT32.decode(protoReader);
                            break;
                        case 3:
                            aVar.f124254c = ProtoAdapter.UINT32.decode(protoReader);
                            break;
                        case 4:
                            aVar.f124255d = ProtoAdapter.UINT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f124256e = ProtoAdapter.FLOAT.decode(protoReader);
                            break;
                        case 6:
                            aVar.f124257f = BorderRadius.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, ImageConfigurationProperty imageConfigurationProperty) throws IOException {
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 1, imageConfigurationProperty.moffset_x);
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 2, imageConfigurationProperty.moffset_y);
            if (imageConfigurationProperty.mresize_height != null) {
                ProtoAdapter.UINT32.encodeWithTag(protoWriter, 3, imageConfigurationProperty.mresize_height);
            }
            if (imageConfigurationProperty.mresize_width != null) {
                ProtoAdapter.UINT32.encodeWithTag(protoWriter, 4, imageConfigurationProperty.mresize_width);
            }
            if (imageConfigurationProperty.malpha != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 5, imageConfigurationProperty.malpha);
            }
            if (imageConfigurationProperty.mborder_radius != null) {
                BorderRadius.ADAPTER.encodeWithTag(protoWriter, 6, imageConfigurationProperty.mborder_radius);
            }
            protoWriter.writeBytes(imageConfigurationProperty.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.dynamic_resource.ImageConfigurationProperty$a */
    public static final class C49624a extends Message.Builder<ImageConfigurationProperty, C49624a> {

        /* renamed from: a */
        public Integer f124252a;

        /* renamed from: b */
        public Integer f124253b;

        /* renamed from: c */
        public Integer f124254c;

        /* renamed from: d */
        public Integer f124255d;

        /* renamed from: e */
        public Float f124256e;

        /* renamed from: f */
        public BorderRadius f124257f;

        /* renamed from: a */
        public ImageConfigurationProperty build() {
            Integer num;
            Integer num2 = this.f124252a;
            if (num2 != null && (num = this.f124253b) != null) {
                return new ImageConfigurationProperty(num2, num, this.f124254c, this.f124255d, this.f124256e, this.f124257f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num2, "moffset_x", this.f124253b, "moffset_y");
        }
    }

    @Override // com.squareup.wire.Message
    public C49624a newBuilder() {
        C49624a aVar = new C49624a();
        aVar.f124252a = this.moffset_x;
        aVar.f124253b = this.moffset_y;
        aVar.f124254c = this.mresize_height;
        aVar.f124255d = this.mresize_width;
        aVar.f124256e = this.malpha;
        aVar.f124257f = this.mborder_radius;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", offset_x=");
        sb.append(this.moffset_x);
        sb.append(", offset_y=");
        sb.append(this.moffset_y);
        if (this.mresize_height != null) {
            sb.append(", resize_height=");
            sb.append(this.mresize_height);
        }
        if (this.mresize_width != null) {
            sb.append(", resize_width=");
            sb.append(this.mresize_width);
        }
        if (this.malpha != null) {
            sb.append(", alpha=");
            sb.append(this.malpha);
        }
        if (this.mborder_radius != null) {
            sb.append(", border_radius=");
            sb.append(this.mborder_radius);
        }
        StringBuilder replace = sb.replace(0, 2, "ImageConfigurationProperty{");
        replace.append('}');
        return replace.toString();
    }

    public ImageConfigurationProperty(Integer num, Integer num2, Integer num3, Integer num4, Float f, BorderRadius borderRadius) {
        this(num, num2, num3, num4, f, borderRadius, ByteString.EMPTY);
    }

    public ImageConfigurationProperty(Integer num, Integer num2, Integer num3, Integer num4, Float f, BorderRadius borderRadius, ByteString byteString) {
        super(ADAPTER, byteString);
        this.moffset_x = num;
        this.moffset_y = num2;
        this.mresize_height = num3;
        this.mresize_width = num4;
        this.malpha = f;
        this.mborder_radius = borderRadius;
    }
}
