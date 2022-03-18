package com.bytedance.lark.pb.onboarding.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PictureElementData extends Message<PictureElementData, C18602a> {
    public static final ProtoAdapter<PictureElementData> ADAPTER = new C18603b();
    public static final ImageType DEFAULT_IMAGE_TYPE = ImageType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String image_data;
    public final ImageType image_type;

    public enum ImageType implements WireEnum {
        UNKNOWN(0),
        RAW_URL(1),
        ENCRYPTED_KEY(2),
        RAW_DATA(3);
        
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
                return RAW_URL;
            }
            if (i == 2) {
                return ENCRYPTED_KEY;
            }
            if (i != 3) {
                return null;
            }
            return RAW_DATA;
        }

        private ImageType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.PictureElementData$b */
    private static final class C18603b extends ProtoAdapter<PictureElementData> {
        C18603b() {
            super(FieldEncoding.LENGTH_DELIMITED, PictureElementData.class);
        }

        /* renamed from: a */
        public int encodedSize(PictureElementData pictureElementData) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, pictureElementData.image_data) + ImageType.ADAPTER.encodedSizeWithTag(2, pictureElementData.image_type) + pictureElementData.unknownFields().size();
        }

        /* renamed from: a */
        public PictureElementData decode(ProtoReader protoReader) throws IOException {
            C18602a aVar = new C18602a();
            aVar.f46104a = "";
            aVar.f46105b = ImageType.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46104a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f46105b = ImageType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PictureElementData pictureElementData) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pictureElementData.image_data);
            ImageType.ADAPTER.encodeWithTag(protoWriter, 2, pictureElementData.image_type);
            protoWriter.writeBytes(pictureElementData.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18602a newBuilder() {
        C18602a aVar = new C18602a();
        aVar.f46104a = this.image_data;
        aVar.f46105b = this.image_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.PictureElementData$a */
    public static final class C18602a extends Message.Builder<PictureElementData, C18602a> {

        /* renamed from: a */
        public String f46104a;

        /* renamed from: b */
        public ImageType f46105b;

        /* renamed from: a */
        public PictureElementData build() {
            ImageType imageType;
            String str = this.f46104a;
            if (str != null && (imageType = this.f46105b) != null) {
                return new PictureElementData(str, imageType, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "image_data", this.f46105b, "image_type");
        }

        /* renamed from: a */
        public C18602a mo64107a(ImageType imageType) {
            this.f46105b = imageType;
            return this;
        }

        /* renamed from: a */
        public C18602a mo64108a(String str) {
            this.f46104a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("onboarding", "PictureElementData");
        StringBuilder sb = new StringBuilder();
        sb.append(", image_data=");
        sb.append(this.image_data);
        sb.append(", image_type=");
        sb.append(this.image_type);
        StringBuilder replace = sb.replace(0, 2, "PictureElementData{");
        replace.append('}');
        return replace.toString();
    }

    public PictureElementData(String str, ImageType imageType) {
        this(str, imageType, ByteString.EMPTY);
    }

    public PictureElementData(String str, ImageType imageType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.image_data = str;
        this.image_type = imageType;
    }
}
