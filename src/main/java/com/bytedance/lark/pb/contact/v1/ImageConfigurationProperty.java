package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ImageConfigurationProperty extends Message<ImageConfigurationProperty, C16312a> {
    public static final ProtoAdapter<ImageConfigurationProperty> ADAPTER = new C16313b();
    public static final Float DEFAULT_ALPHA = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
    public static final Integer DEFAULT_OFFSET_X = 0;
    public static final Integer DEFAULT_OFFSET_Y = 0;
    public static final Integer DEFAULT_RESIZE_HEIGHT = 0;
    public static final Integer DEFAULT_RESIZE_WIDTH = 0;
    private static final long serialVersionUID = 0;
    public final Float alpha;
    public final BorderRadius border_radius;
    public final Integer offset_x;
    public final Integer offset_y;
    public final Integer resize_height;
    public final Integer resize_width;

    /* renamed from: com.bytedance.lark.pb.contact.v1.ImageConfigurationProperty$b */
    private static final class C16313b extends ProtoAdapter<ImageConfigurationProperty> {
        C16313b() {
            super(FieldEncoding.LENGTH_DELIMITED, ImageConfigurationProperty.class);
        }

        /* renamed from: a */
        public int encodedSize(ImageConfigurationProperty imageConfigurationProperty) {
            int i;
            int i2;
            int i3;
            int encodedSizeWithTag = ProtoAdapter.UINT32.encodedSizeWithTag(1, imageConfigurationProperty.offset_x) + ProtoAdapter.UINT32.encodedSizeWithTag(2, imageConfigurationProperty.offset_y);
            int i4 = 0;
            if (imageConfigurationProperty.resize_height != null) {
                i = ProtoAdapter.UINT32.encodedSizeWithTag(3, imageConfigurationProperty.resize_height);
            } else {
                i = 0;
            }
            int i5 = encodedSizeWithTag + i;
            if (imageConfigurationProperty.resize_width != null) {
                i2 = ProtoAdapter.UINT32.encodedSizeWithTag(4, imageConfigurationProperty.resize_width);
            } else {
                i2 = 0;
            }
            int i6 = i5 + i2;
            if (imageConfigurationProperty.alpha != null) {
                i3 = ProtoAdapter.FLOAT.encodedSizeWithTag(5, imageConfigurationProperty.alpha);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (imageConfigurationProperty.border_radius != null) {
                i4 = BorderRadius.ADAPTER.encodedSizeWithTag(6, imageConfigurationProperty.border_radius);
            }
            return i7 + i4 + imageConfigurationProperty.unknownFields().size();
        }

        /* renamed from: a */
        public ImageConfigurationProperty decode(ProtoReader protoReader) throws IOException {
            C16312a aVar = new C16312a();
            aVar.f42548a = 0;
            aVar.f42549b = 0;
            aVar.f42550c = 0;
            aVar.f42551d = 0;
            aVar.f42552e = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f42548a = ProtoAdapter.UINT32.decode(protoReader);
                            break;
                        case 2:
                            aVar.f42549b = ProtoAdapter.UINT32.decode(protoReader);
                            break;
                        case 3:
                            aVar.f42550c = ProtoAdapter.UINT32.decode(protoReader);
                            break;
                        case 4:
                            aVar.f42551d = ProtoAdapter.UINT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f42552e = ProtoAdapter.FLOAT.decode(protoReader);
                            break;
                        case 6:
                            aVar.f42553f = BorderRadius.ADAPTER.decode(protoReader);
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
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 1, imageConfigurationProperty.offset_x);
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 2, imageConfigurationProperty.offset_y);
            if (imageConfigurationProperty.resize_height != null) {
                ProtoAdapter.UINT32.encodeWithTag(protoWriter, 3, imageConfigurationProperty.resize_height);
            }
            if (imageConfigurationProperty.resize_width != null) {
                ProtoAdapter.UINT32.encodeWithTag(protoWriter, 4, imageConfigurationProperty.resize_width);
            }
            if (imageConfigurationProperty.alpha != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 5, imageConfigurationProperty.alpha);
            }
            if (imageConfigurationProperty.border_radius != null) {
                BorderRadius.ADAPTER.encodeWithTag(protoWriter, 6, imageConfigurationProperty.border_radius);
            }
            protoWriter.writeBytes(imageConfigurationProperty.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.ImageConfigurationProperty$a */
    public static final class C16312a extends Message.Builder<ImageConfigurationProperty, C16312a> {

        /* renamed from: a */
        public Integer f42548a;

        /* renamed from: b */
        public Integer f42549b;

        /* renamed from: c */
        public Integer f42550c;

        /* renamed from: d */
        public Integer f42551d;

        /* renamed from: e */
        public Float f42552e;

        /* renamed from: f */
        public BorderRadius f42553f;

        /* renamed from: a */
        public ImageConfigurationProperty build() {
            Integer num;
            Integer num2 = this.f42548a;
            if (num2 != null && (num = this.f42549b) != null) {
                return new ImageConfigurationProperty(num2, num, this.f42550c, this.f42551d, this.f42552e, this.f42553f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num2, "offset_x", this.f42549b, "offset_y");
        }
    }

    @Override // com.squareup.wire.Message
    public C16312a newBuilder() {
        C16312a aVar = new C16312a();
        aVar.f42548a = this.offset_x;
        aVar.f42549b = this.offset_y;
        aVar.f42550c = this.resize_height;
        aVar.f42551d = this.resize_width;
        aVar.f42552e = this.alpha;
        aVar.f42553f = this.border_radius;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "ImageConfigurationProperty");
        StringBuilder sb = new StringBuilder();
        sb.append(", offset_x=");
        sb.append(this.offset_x);
        sb.append(", offset_y=");
        sb.append(this.offset_y);
        if (this.resize_height != null) {
            sb.append(", resize_height=");
            sb.append(this.resize_height);
        }
        if (this.resize_width != null) {
            sb.append(", resize_width=");
            sb.append(this.resize_width);
        }
        if (this.alpha != null) {
            sb.append(", alpha=");
            sb.append(this.alpha);
        }
        if (this.border_radius != null) {
            sb.append(", border_radius=");
            sb.append(this.border_radius);
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
        this.offset_x = num;
        this.offset_y = num2;
        this.resize_height = num3;
        this.resize_width = num4;
        this.alpha = f;
        this.border_radius = borderRadius;
    }
}
