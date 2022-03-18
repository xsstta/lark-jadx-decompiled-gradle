package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ImageTranslationInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetTranslateOriginImageRequest extends Message<GetTranslateOriginImageRequest, C17733a> {
    public static final ProtoAdapter<GetTranslateOriginImageRequest> ADAPTER = new C17734b();
    public static final ImageTranslationInfo.EntityType DEFAULT_ENTITY_TYPE = ImageTranslationInfo.EntityType.UNKNOWN_ENTITY;
    private static final long serialVersionUID = 0;
    public final String entity_id;
    public final ImageTranslationInfo.EntityType entity_type;
    public final String translate_image_key;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetTranslateOriginImageRequest$b */
    private static final class C17734b extends ProtoAdapter<GetTranslateOriginImageRequest> {
        C17734b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTranslateOriginImageRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTranslateOriginImageRequest getTranslateOriginImageRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getTranslateOriginImageRequest.entity_id) + ImageTranslationInfo.EntityType.ADAPTER.encodedSizeWithTag(2, getTranslateOriginImageRequest.entity_type) + ProtoAdapter.STRING.encodedSizeWithTag(3, getTranslateOriginImageRequest.translate_image_key) + getTranslateOriginImageRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetTranslateOriginImageRequest decode(ProtoReader protoReader) throws IOException {
            C17733a aVar = new C17733a();
            aVar.f44779a = "";
            aVar.f44780b = ImageTranslationInfo.EntityType.UNKNOWN_ENTITY;
            aVar.f44781c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44779a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f44780b = ImageTranslationInfo.EntityType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44781c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetTranslateOriginImageRequest getTranslateOriginImageRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getTranslateOriginImageRequest.entity_id);
            ImageTranslationInfo.EntityType.ADAPTER.encodeWithTag(protoWriter, 2, getTranslateOriginImageRequest.entity_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getTranslateOriginImageRequest.translate_image_key);
            protoWriter.writeBytes(getTranslateOriginImageRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17733a newBuilder() {
        C17733a aVar = new C17733a();
        aVar.f44779a = this.entity_id;
        aVar.f44780b = this.entity_type;
        aVar.f44781c = this.translate_image_key;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetTranslateOriginImageRequest$a */
    public static final class C17733a extends Message.Builder<GetTranslateOriginImageRequest, C17733a> {

        /* renamed from: a */
        public String f44779a;

        /* renamed from: b */
        public ImageTranslationInfo.EntityType f44780b;

        /* renamed from: c */
        public String f44781c;

        /* renamed from: a */
        public GetTranslateOriginImageRequest build() {
            ImageTranslationInfo.EntityType entityType;
            String str;
            String str2 = this.f44779a;
            if (str2 != null && (entityType = this.f44780b) != null && (str = this.f44781c) != null) {
                return new GetTranslateOriginImageRequest(str2, entityType, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "entity_id", this.f44780b, "entity_type", this.f44781c, "translate_image_key");
        }

        /* renamed from: a */
        public C17733a mo61905a(ImageTranslationInfo.EntityType entityType) {
            this.f44780b = entityType;
            return this;
        }

        /* renamed from: b */
        public C17733a mo61908b(String str) {
            this.f44781c = str;
            return this;
        }

        /* renamed from: a */
        public C17733a mo61906a(String str) {
            this.f44779a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetTranslateOriginImageRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", entity_id=");
        sb.append(this.entity_id);
        sb.append(", entity_type=");
        sb.append(this.entity_type);
        sb.append(", translate_image_key=");
        sb.append(this.translate_image_key);
        StringBuilder replace = sb.replace(0, 2, "GetTranslateOriginImageRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetTranslateOriginImageRequest(String str, ImageTranslationInfo.EntityType entityType, String str2) {
        this(str, entityType, str2, ByteString.EMPTY);
    }

    public GetTranslateOriginImageRequest(String str, ImageTranslationInfo.EntityType entityType, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity_id = str;
        this.entity_type = entityType;
        this.translate_image_key = str2;
    }
}
