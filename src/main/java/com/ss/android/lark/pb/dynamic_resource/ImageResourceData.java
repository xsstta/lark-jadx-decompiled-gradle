package com.ss.android.lark.pb.dynamic_resource;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ImageResourceData extends Message<ImageResourceData, C49626a> {
    public static final ProtoAdapter<ImageResourceData> ADAPTER = new C49627b();
    public static final ByteString DEFAULT_SECRETS = ByteString.EMPTY;
    private static final long serialVersionUID = 0;
    public final CdnImageData mcdn_image;
    public final ConstantKeyImageData mconstant_key_image;
    public final TextValue mraw_html;
    public final RawImageData mraw_image;
    public final ByteString msecrets;
    public final TextValue mtext;
    public final ImageResourceType mtype;

    /* renamed from: com.ss.android.lark.pb.dynamic_resource.ImageResourceData$b */
    private static final class C49627b extends ProtoAdapter<ImageResourceData> {
        C49627b() {
            super(FieldEncoding.LENGTH_DELIMITED, ImageResourceData.class);
        }

        /* renamed from: a */
        public int encodedSize(ImageResourceData imageResourceData) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int encodedSizeWithTag = ImageResourceType.ADAPTER.encodedSizeWithTag(1, imageResourceData.mtype);
            int i6 = 0;
            if (imageResourceData.msecrets != null) {
                i = ProtoAdapter.BYTES.encodedSizeWithTag(2, imageResourceData.msecrets);
            } else {
                i = 0;
            }
            int i7 = encodedSizeWithTag + i;
            if (imageResourceData.mraw_image != null) {
                i2 = RawImageData.ADAPTER.encodedSizeWithTag(3, imageResourceData.mraw_image);
            } else {
                i2 = 0;
            }
            int i8 = i7 + i2;
            if (imageResourceData.mcdn_image != null) {
                i3 = CdnImageData.ADAPTER.encodedSizeWithTag(4, imageResourceData.mcdn_image);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (imageResourceData.mconstant_key_image != null) {
                i4 = ConstantKeyImageData.ADAPTER.encodedSizeWithTag(5, imageResourceData.mconstant_key_image);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (imageResourceData.mtext != null) {
                i5 = TextValue.ADAPTER.encodedSizeWithTag(6, imageResourceData.mtext);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (imageResourceData.mraw_html != null) {
                i6 = TextValue.ADAPTER.encodedSizeWithTag(7, imageResourceData.mraw_html);
            }
            return i11 + i6 + imageResourceData.unknownFields().size();
        }

        /* renamed from: a */
        public ImageResourceData decode(ProtoReader protoReader) throws IOException {
            C49626a aVar = new C49626a();
            aVar.f124259b = ByteString.EMPTY;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f124258a = ImageResourceType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f124259b = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        case 3:
                            aVar.f124260c = RawImageData.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f124261d = CdnImageData.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f124262e = ConstantKeyImageData.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f124263f = TextValue.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f124264g = TextValue.ADAPTER.decode(protoReader);
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
            ImageResourceType.ADAPTER.encodeWithTag(protoWriter, 1, imageResourceData.mtype);
            if (imageResourceData.msecrets != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, imageResourceData.msecrets);
            }
            if (imageResourceData.mraw_image != null) {
                RawImageData.ADAPTER.encodeWithTag(protoWriter, 3, imageResourceData.mraw_image);
            }
            if (imageResourceData.mcdn_image != null) {
                CdnImageData.ADAPTER.encodeWithTag(protoWriter, 4, imageResourceData.mcdn_image);
            }
            if (imageResourceData.mconstant_key_image != null) {
                ConstantKeyImageData.ADAPTER.encodeWithTag(protoWriter, 5, imageResourceData.mconstant_key_image);
            }
            if (imageResourceData.mtext != null) {
                TextValue.ADAPTER.encodeWithTag(protoWriter, 6, imageResourceData.mtext);
            }
            if (imageResourceData.mraw_html != null) {
                TextValue.ADAPTER.encodeWithTag(protoWriter, 7, imageResourceData.mraw_html);
            }
            protoWriter.writeBytes(imageResourceData.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.dynamic_resource.ImageResourceData$a */
    public static final class C49626a extends Message.Builder<ImageResourceData, C49626a> {

        /* renamed from: a */
        public ImageResourceType f124258a;

        /* renamed from: b */
        public ByteString f124259b;

        /* renamed from: c */
        public RawImageData f124260c;

        /* renamed from: d */
        public CdnImageData f124261d;

        /* renamed from: e */
        public ConstantKeyImageData f124262e;

        /* renamed from: f */
        public TextValue f124263f;

        /* renamed from: g */
        public TextValue f124264g;

        /* renamed from: a */
        public ImageResourceData build() {
            ImageResourceType imageResourceType = this.f124258a;
            if (imageResourceType != null) {
                return new ImageResourceData(imageResourceType, this.f124259b, this.f124260c, this.f124261d, this.f124262e, this.f124263f, this.f124264g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(imageResourceType, "mtype");
        }
    }

    @Override // com.squareup.wire.Message
    public C49626a newBuilder() {
        C49626a aVar = new C49626a();
        aVar.f124258a = this.mtype;
        aVar.f124259b = this.msecrets;
        aVar.f124260c = this.mraw_image;
        aVar.f124261d = this.mcdn_image;
        aVar.f124262e = this.mconstant_key_image;
        aVar.f124263f = this.mtext;
        aVar.f124264g = this.mraw_html;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.mtype);
        if (this.msecrets != null) {
            sb.append(", secrets=");
            sb.append(this.msecrets);
        }
        if (this.mraw_image != null) {
            sb.append(", raw_image=");
            sb.append(this.mraw_image);
        }
        if (this.mcdn_image != null) {
            sb.append(", cdn_image=");
            sb.append(this.mcdn_image);
        }
        if (this.mconstant_key_image != null) {
            sb.append(", constant_key_image=");
            sb.append(this.mconstant_key_image);
        }
        if (this.mtext != null) {
            sb.append(", text=");
            sb.append(this.mtext);
        }
        if (this.mraw_html != null) {
            sb.append(", raw_html=");
            sb.append(this.mraw_html);
        }
        StringBuilder replace = sb.replace(0, 2, "ImageResourceData{");
        replace.append('}');
        return replace.toString();
    }

    public ImageResourceData(ImageResourceType imageResourceType, ByteString byteString, RawImageData rawImageData, CdnImageData cdnImageData, ConstantKeyImageData constantKeyImageData, TextValue textValue, TextValue textValue2) {
        this(imageResourceType, byteString, rawImageData, cdnImageData, constantKeyImageData, textValue, textValue2, ByteString.EMPTY);
    }

    public ImageResourceData(ImageResourceType imageResourceType, ByteString byteString, RawImageData rawImageData, CdnImageData cdnImageData, ConstantKeyImageData constantKeyImageData, TextValue textValue, TextValue textValue2, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.mtype = imageResourceType;
        this.msecrets = byteString;
        this.mraw_image = rawImageData;
        this.mcdn_image = cdnImageData;
        this.mconstant_key_image = constantKeyImageData;
        this.mtext = textValue;
        this.mraw_html = textValue2;
    }
}
