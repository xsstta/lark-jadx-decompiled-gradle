package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.basic.v1.RichTextElement;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetTranslateOriginImageResponse extends Message<GetTranslateOriginImageResponse, C17735a> {
    public static final ProtoAdapter<GetTranslateOriginImageResponse> ADAPTER = new C17736b();
    private static final long serialVersionUID = 0;
    public final String origin_image_key;
    public final RichTextElement.ImageProperty origin_image_property;
    public final ImageSet origin_image_set;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetTranslateOriginImageResponse$b */
    private static final class C17736b extends ProtoAdapter<GetTranslateOriginImageResponse> {
        C17736b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTranslateOriginImageResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTranslateOriginImageResponse getTranslateOriginImageResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (getTranslateOriginImageResponse.origin_image_key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getTranslateOriginImageResponse.origin_image_key);
            } else {
                i = 0;
            }
            if (getTranslateOriginImageResponse.origin_image_set != null) {
                i2 = ImageSet.ADAPTER.encodedSizeWithTag(2, getTranslateOriginImageResponse.origin_image_set);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (getTranslateOriginImageResponse.origin_image_property != null) {
                i3 = RichTextElement.ImageProperty.ADAPTER.encodedSizeWithTag(3, getTranslateOriginImageResponse.origin_image_property);
            }
            return i4 + i3 + getTranslateOriginImageResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetTranslateOriginImageResponse decode(ProtoReader protoReader) throws IOException {
            C17735a aVar = new C17735a();
            aVar.f44782a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44782a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44783b = ImageSet.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44784c = RichTextElement.ImageProperty.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetTranslateOriginImageResponse getTranslateOriginImageResponse) throws IOException {
            if (getTranslateOriginImageResponse.origin_image_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getTranslateOriginImageResponse.origin_image_key);
            }
            if (getTranslateOriginImageResponse.origin_image_set != null) {
                ImageSet.ADAPTER.encodeWithTag(protoWriter, 2, getTranslateOriginImageResponse.origin_image_set);
            }
            if (getTranslateOriginImageResponse.origin_image_property != null) {
                RichTextElement.ImageProperty.ADAPTER.encodeWithTag(protoWriter, 3, getTranslateOriginImageResponse.origin_image_property);
            }
            protoWriter.writeBytes(getTranslateOriginImageResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetTranslateOriginImageResponse$a */
    public static final class C17735a extends Message.Builder<GetTranslateOriginImageResponse, C17735a> {

        /* renamed from: a */
        public String f44782a;

        /* renamed from: b */
        public ImageSet f44783b;

        /* renamed from: c */
        public RichTextElement.ImageProperty f44784c;

        /* renamed from: a */
        public GetTranslateOriginImageResponse build() {
            return new GetTranslateOriginImageResponse(this.f44782a, this.f44783b, this.f44784c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17735a newBuilder() {
        C17735a aVar = new C17735a();
        aVar.f44782a = this.origin_image_key;
        aVar.f44783b = this.origin_image_set;
        aVar.f44784c = this.origin_image_property;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetTranslateOriginImageResponse");
        StringBuilder sb = new StringBuilder();
        if (this.origin_image_key != null) {
            sb.append(", origin_image_key=");
            sb.append(this.origin_image_key);
        }
        if (this.origin_image_set != null) {
            sb.append(", origin_image_set=");
            sb.append(this.origin_image_set);
        }
        if (this.origin_image_property != null) {
            sb.append(", origin_image_property=");
            sb.append(this.origin_image_property);
        }
        StringBuilder replace = sb.replace(0, 2, "GetTranslateOriginImageResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetTranslateOriginImageResponse(String str, ImageSet imageSet, RichTextElement.ImageProperty imageProperty) {
        this(str, imageSet, imageProperty, ByteString.EMPTY);
    }

    public GetTranslateOriginImageResponse(String str, ImageSet imageSet, RichTextElement.ImageProperty imageProperty, ByteString byteString) {
        super(ADAPTER, byteString);
        this.origin_image_key = str;
        this.origin_image_set = imageSet;
        this.origin_image_property = imageProperty;
    }
}
