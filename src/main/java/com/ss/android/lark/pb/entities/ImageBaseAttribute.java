package com.ss.android.lark.pb.entities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ImageBaseAttribute extends Message<ImageBaseAttribute, C49714a> {
    public static final ProtoAdapter<ImageBaseAttribute> ADAPTER = new C49715b();
    public static final Integer DEFAULT_EXIF_ORIENTATION = 0;
    public static final Integer DEFAULT_HEIGHT = 0;
    public static final Integer DEFAULT_WIDTH = 0;
    private static final long serialVersionUID = 0;
    public final Integer mexif_orientation;
    public final Integer mheight;
    public final Integer mwidth;

    /* renamed from: com.ss.android.lark.pb.entities.ImageBaseAttribute$b */
    private static final class C49715b extends ProtoAdapter<ImageBaseAttribute> {
        C49715b() {
            super(FieldEncoding.LENGTH_DELIMITED, ImageBaseAttribute.class);
        }

        /* renamed from: a */
        public int encodedSize(ImageBaseAttribute imageBaseAttribute) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.UINT32.encodedSizeWithTag(1, imageBaseAttribute.mwidth) + ProtoAdapter.UINT32.encodedSizeWithTag(2, imageBaseAttribute.mheight);
            if (imageBaseAttribute.mexif_orientation != null) {
                i = ProtoAdapter.UINT32.encodedSizeWithTag(3, imageBaseAttribute.mexif_orientation);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + imageBaseAttribute.unknownFields().size();
        }

        /* renamed from: a */
        public ImageBaseAttribute decode(ProtoReader protoReader) throws IOException {
            C49714a aVar = new C49714a();
            aVar.f124471a = 0;
            aVar.f124472b = 0;
            aVar.f124473c = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124471a = ProtoAdapter.UINT32.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124472b = ProtoAdapter.UINT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124473c = ProtoAdapter.UINT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ImageBaseAttribute imageBaseAttribute) throws IOException {
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 1, imageBaseAttribute.mwidth);
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 2, imageBaseAttribute.mheight);
            if (imageBaseAttribute.mexif_orientation != null) {
                ProtoAdapter.UINT32.encodeWithTag(protoWriter, 3, imageBaseAttribute.mexif_orientation);
            }
            protoWriter.writeBytes(imageBaseAttribute.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49714a newBuilder() {
        C49714a aVar = new C49714a();
        aVar.f124471a = this.mwidth;
        aVar.f124472b = this.mheight;
        aVar.f124473c = this.mexif_orientation;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.entities.ImageBaseAttribute$a */
    public static final class C49714a extends Message.Builder<ImageBaseAttribute, C49714a> {

        /* renamed from: a */
        public Integer f124471a;

        /* renamed from: b */
        public Integer f124472b;

        /* renamed from: c */
        public Integer f124473c;

        /* renamed from: a */
        public ImageBaseAttribute build() {
            Integer num;
            Integer num2 = this.f124471a;
            if (num2 != null && (num = this.f124472b) != null) {
                return new ImageBaseAttribute(num2, num, this.f124473c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num2, "mwidth", this.f124472b, "mheight");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", width=");
        sb.append(this.mwidth);
        sb.append(", height=");
        sb.append(this.mheight);
        if (this.mexif_orientation != null) {
            sb.append(", exif_orientation=");
            sb.append(this.mexif_orientation);
        }
        StringBuilder replace = sb.replace(0, 2, "ImageBaseAttribute{");
        replace.append('}');
        return replace.toString();
    }

    public ImageBaseAttribute(Integer num, Integer num2, Integer num3) {
        this(num, num2, num3, ByteString.EMPTY);
    }

    public ImageBaseAttribute(Integer num, Integer num2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mwidth = num;
        this.mheight = num2;
        this.mexif_orientation = num3;
    }
}
