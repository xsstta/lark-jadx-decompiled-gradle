package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import okio.ByteString;

public final class ImageResourceData extends Message<ImageResourceData, C16316a> {
    public static final ProtoAdapter<ImageResourceData> ADAPTER = new C16317b();
    public static final ImageResourceType DEFAULT_TYPE = ImageResourceType.UnknownType;
    private static final long serialVersionUID = 0;
    public final CdnImageData cdn_image;
    public final ConstantKeyImageData constant_key_image;
    public final TextValue raw_html;
    public final RawImageData raw_image;
    public final TextValue text;
    public final ImageResourceType type;

    /* renamed from: com.bytedance.lark.pb.contact.v1.ImageResourceData$b */
    private static final class C16317b extends ProtoAdapter<ImageResourceData> {
        C16317b() {
            super(FieldEncoding.LENGTH_DELIMITED, ImageResourceData.class);
        }

        /* renamed from: a */
        public int encodedSize(ImageResourceData imageResourceData) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = ImageResourceType.ADAPTER.encodedSizeWithTag(1, imageResourceData.type);
            int i5 = 0;
            if (imageResourceData.raw_image != null) {
                i = RawImageData.ADAPTER.encodedSizeWithTag(2, imageResourceData.raw_image);
            } else {
                i = 0;
            }
            int i6 = encodedSizeWithTag + i;
            if (imageResourceData.cdn_image != null) {
                i2 = CdnImageData.ADAPTER.encodedSizeWithTag(3, imageResourceData.cdn_image);
            } else {
                i2 = 0;
            }
            int i7 = i6 + i2;
            if (imageResourceData.constant_key_image != null) {
                i3 = ConstantKeyImageData.ADAPTER.encodedSizeWithTag(4, imageResourceData.constant_key_image);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (imageResourceData.text != null) {
                i4 = TextValue.ADAPTER.encodedSizeWithTag(5, imageResourceData.text);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (imageResourceData.raw_html != null) {
                i5 = TextValue.ADAPTER.encodedSizeWithTag(6, imageResourceData.raw_html);
            }
            return i9 + i5 + imageResourceData.unknownFields().size();
        }

        /* renamed from: a */
        public ImageResourceData decode(ProtoReader protoReader) throws IOException {
            C16316a aVar = new C16316a();
            aVar.f42557a = ImageResourceType.UnknownType;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f42557a = ImageResourceType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f42558b = RawImageData.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f42559c = CdnImageData.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f42560d = ConstantKeyImageData.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f42561e = TextValue.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f42562f = TextValue.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, ImageResourceData imageResourceData) throws IOException {
            ImageResourceType.ADAPTER.encodeWithTag(protoWriter, 1, imageResourceData.type);
            if (imageResourceData.raw_image != null) {
                RawImageData.ADAPTER.encodeWithTag(protoWriter, 2, imageResourceData.raw_image);
            }
            if (imageResourceData.cdn_image != null) {
                CdnImageData.ADAPTER.encodeWithTag(protoWriter, 3, imageResourceData.cdn_image);
            }
            if (imageResourceData.constant_key_image != null) {
                ConstantKeyImageData.ADAPTER.encodeWithTag(protoWriter, 4, imageResourceData.constant_key_image);
            }
            if (imageResourceData.text != null) {
                TextValue.ADAPTER.encodeWithTag(protoWriter, 5, imageResourceData.text);
            }
            if (imageResourceData.raw_html != null) {
                TextValue.ADAPTER.encodeWithTag(protoWriter, 6, imageResourceData.raw_html);
            }
            protoWriter.writeBytes(imageResourceData.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.ImageResourceData$a */
    public static final class C16316a extends Message.Builder<ImageResourceData, C16316a> {

        /* renamed from: a */
        public ImageResourceType f42557a;

        /* renamed from: b */
        public RawImageData f42558b;

        /* renamed from: c */
        public CdnImageData f42559c;

        /* renamed from: d */
        public ConstantKeyImageData f42560d;

        /* renamed from: e */
        public TextValue f42561e;

        /* renamed from: f */
        public TextValue f42562f;

        /* renamed from: a */
        public ImageResourceData build() {
            ImageResourceType imageResourceType = this.f42557a;
            if (imageResourceType != null) {
                return new ImageResourceData(imageResourceType, this.f42558b, this.f42559c, this.f42560d, this.f42561e, this.f42562f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(imageResourceType, ShareHitPoint.f121869d);
        }
    }

    @Override // com.squareup.wire.Message
    public C16316a newBuilder() {
        C16316a aVar = new C16316a();
        aVar.f42557a = this.type;
        aVar.f42558b = this.raw_image;
        aVar.f42559c = this.cdn_image;
        aVar.f42560d = this.constant_key_image;
        aVar.f42561e = this.text;
        aVar.f42562f = this.raw_html;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "ImageResourceData");
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.type);
        if (this.raw_image != null) {
            sb.append(", raw_image=");
            sb.append(this.raw_image);
        }
        if (this.cdn_image != null) {
            sb.append(", cdn_image=");
            sb.append(this.cdn_image);
        }
        if (this.constant_key_image != null) {
            sb.append(", constant_key_image=");
            sb.append(this.constant_key_image);
        }
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        if (this.raw_html != null) {
            sb.append(", raw_html=");
            sb.append(this.raw_html);
        }
        StringBuilder replace = sb.replace(0, 2, "ImageResourceData{");
        replace.append('}');
        return replace.toString();
    }

    public ImageResourceData(ImageResourceType imageResourceType, RawImageData rawImageData, CdnImageData cdnImageData, ConstantKeyImageData constantKeyImageData, TextValue textValue, TextValue textValue2) {
        this(imageResourceType, rawImageData, cdnImageData, constantKeyImageData, textValue, textValue2, ByteString.EMPTY);
    }

    public ImageResourceData(ImageResourceType imageResourceType, RawImageData rawImageData, CdnImageData cdnImageData, ConstantKeyImageData constantKeyImageData, TextValue textValue, TextValue textValue2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = imageResourceType;
        this.raw_image = rawImageData;
        this.cdn_image = cdnImageData;
        this.constant_key_image = constantKeyImageData;
        this.text = textValue;
        this.raw_html = textValue2;
    }
}
