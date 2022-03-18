package com.bytedance.lark.pb.media.v1;

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

public final class UploadImageV2Request extends Message<UploadImageV2Request, C18308a> {
    public static final ProtoAdapter<UploadImageV2Request> ADAPTER = new C18309b();
    public static final ByteString DEFAULT_IMAGE = ByteString.EMPTY;
    public static final ImageType DEFAULT_IMAGE_TYPE = ImageType.ProfileTopImage;
    private static final long serialVersionUID = 0;
    public final ByteString image;
    public final ImageType image_type;

    public enum ImageType implements WireEnum {
        ProfileTopImage(1);
        
        public static final ProtoAdapter<ImageType> ADAPTER = ProtoAdapter.newEnumAdapter(ImageType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ImageType fromValue(int i) {
            if (i != 1) {
                return null;
            }
            return ProfileTopImage;
        }

        private ImageType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.UploadImageV2Request$b */
    private static final class C18309b extends ProtoAdapter<UploadImageV2Request> {
        C18309b() {
            super(FieldEncoding.LENGTH_DELIMITED, UploadImageV2Request.class);
        }

        /* renamed from: a */
        public int encodedSize(UploadImageV2Request uploadImageV2Request) {
            int i;
            int encodedSizeWithTag = ImageType.ADAPTER.encodedSizeWithTag(1, uploadImageV2Request.image_type);
            if (uploadImageV2Request.image != null) {
                i = ProtoAdapter.BYTES.encodedSizeWithTag(2, uploadImageV2Request.image);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + uploadImageV2Request.unknownFields().size();
        }

        /* renamed from: a */
        public UploadImageV2Request decode(ProtoReader protoReader) throws IOException {
            C18308a aVar = new C18308a();
            aVar.f45610a = ImageType.ProfileTopImage;
            aVar.f45611b = ByteString.EMPTY;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f45610a = ImageType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45611b = ProtoAdapter.BYTES.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UploadImageV2Request uploadImageV2Request) throws IOException {
            ImageType.ADAPTER.encodeWithTag(protoWriter, 1, uploadImageV2Request.image_type);
            if (uploadImageV2Request.image != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, uploadImageV2Request.image);
            }
            protoWriter.writeBytes(uploadImageV2Request.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.UploadImageV2Request$a */
    public static final class C18308a extends Message.Builder<UploadImageV2Request, C18308a> {

        /* renamed from: a */
        public ImageType f45610a;

        /* renamed from: b */
        public ByteString f45611b;

        /* renamed from: a */
        public UploadImageV2Request build() {
            ImageType imageType = this.f45610a;
            if (imageType != null) {
                return new UploadImageV2Request(imageType, this.f45611b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(imageType, "image_type");
        }

        /* renamed from: a */
        public C18308a mo63388a(ImageType imageType) {
            this.f45610a = imageType;
            return this;
        }

        /* renamed from: a */
        public C18308a mo63389a(ByteString byteString) {
            this.f45611b = byteString;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18308a newBuilder() {
        C18308a aVar = new C18308a();
        aVar.f45610a = this.image_type;
        aVar.f45611b = this.image;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "UploadImageV2Request");
        StringBuilder sb = new StringBuilder();
        sb.append(", image_type=");
        sb.append(this.image_type);
        if (this.image != null) {
            sb.append(", image=");
            sb.append(this.image);
        }
        StringBuilder replace = sb.replace(0, 2, "UploadImageV2Request{");
        replace.append('}');
        return replace.toString();
    }

    public UploadImageV2Request(ImageType imageType, ByteString byteString) {
        this(imageType, byteString, ByteString.EMPTY);
    }

    public UploadImageV2Request(ImageType imageType, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.image_type = imageType;
        this.image = byteString;
    }
}
