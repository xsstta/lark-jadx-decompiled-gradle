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
import java.util.List;
import okio.ByteString;

public final class TranslateImageKeysRequest extends Message<TranslateImageKeysRequest, C18099a> {
    public static final ProtoAdapter<TranslateImageKeysRequest> ADAPTER = new C18100b();
    public static final ImageTranslationInfo.EntityType DEFAULT_ENTITY_TYPE = ImageTranslationInfo.EntityType.UNKNOWN_ENTITY;
    private static final long serialVersionUID = 0;
    public final String entity_id;
    public final ImageTranslationInfo.EntityType entity_type;
    public final List<ImageKeyInfo> image_keys_info;
    public final String target_language;

    /* renamed from: com.bytedance.lark.pb.im.v1.TranslateImageKeysRequest$b */
    private static final class C18100b extends ProtoAdapter<TranslateImageKeysRequest> {
        C18100b() {
            super(FieldEncoding.LENGTH_DELIMITED, TranslateImageKeysRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(TranslateImageKeysRequest translateImageKeysRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, translateImageKeysRequest.entity_id) + ImageTranslationInfo.EntityType.ADAPTER.encodedSizeWithTag(2, translateImageKeysRequest.entity_type) + ImageKeyInfo.ADAPTER.asRepeated().encodedSizeWithTag(3, translateImageKeysRequest.image_keys_info);
            if (translateImageKeysRequest.target_language != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(4, translateImageKeysRequest.target_language);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + translateImageKeysRequest.unknownFields().size();
        }

        /* renamed from: a */
        public TranslateImageKeysRequest decode(ProtoReader protoReader) throws IOException {
            C18099a aVar = new C18099a();
            aVar.f45242a = "";
            aVar.f45243b = ImageTranslationInfo.EntityType.UNKNOWN_ENTITY;
            aVar.f45245d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45242a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f45243b = ImageTranslationInfo.EntityType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f45244c.add(ImageKeyInfo.ADAPTER.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45245d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TranslateImageKeysRequest translateImageKeysRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, translateImageKeysRequest.entity_id);
            ImageTranslationInfo.EntityType.ADAPTER.encodeWithTag(protoWriter, 2, translateImageKeysRequest.entity_type);
            ImageKeyInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, translateImageKeysRequest.image_keys_info);
            if (translateImageKeysRequest.target_language != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, translateImageKeysRequest.target_language);
            }
            protoWriter.writeBytes(translateImageKeysRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.TranslateImageKeysRequest$a */
    public static final class C18099a extends Message.Builder<TranslateImageKeysRequest, C18099a> {

        /* renamed from: a */
        public String f45242a;

        /* renamed from: b */
        public ImageTranslationInfo.EntityType f45243b;

        /* renamed from: c */
        public List<ImageKeyInfo> f45244c = Internal.newMutableList();

        /* renamed from: d */
        public String f45245d;

        /* renamed from: a */
        public TranslateImageKeysRequest build() {
            ImageTranslationInfo.EntityType entityType;
            String str = this.f45242a;
            if (str != null && (entityType = this.f45243b) != null) {
                return new TranslateImageKeysRequest(str, entityType, this.f45244c, this.f45245d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "entity_id", this.f45243b, "entity_type");
        }

        /* renamed from: a */
        public C18099a mo62791a(ImageTranslationInfo.EntityType entityType) {
            this.f45243b = entityType;
            return this;
        }

        /* renamed from: b */
        public C18099a mo62795b(String str) {
            this.f45245d = str;
            return this;
        }

        /* renamed from: a */
        public C18099a mo62792a(String str) {
            this.f45242a = str;
            return this;
        }

        /* renamed from: a */
        public C18099a mo62793a(List<ImageKeyInfo> list) {
            Internal.checkElementsNotNull(list);
            this.f45244c = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18099a newBuilder() {
        C18099a aVar = new C18099a();
        aVar.f45242a = this.entity_id;
        aVar.f45243b = this.entity_type;
        aVar.f45244c = Internal.copyOf("image_keys_info", this.image_keys_info);
        aVar.f45245d = this.target_language;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "TranslateImageKeysRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", entity_id=");
        sb.append(this.entity_id);
        sb.append(", entity_type=");
        sb.append(this.entity_type);
        if (!this.image_keys_info.isEmpty()) {
            sb.append(", image_keys_info=");
            sb.append(this.image_keys_info);
        }
        if (this.target_language != null) {
            sb.append(", target_language=");
            sb.append(this.target_language);
        }
        StringBuilder replace = sb.replace(0, 2, "TranslateImageKeysRequest{");
        replace.append('}');
        return replace.toString();
    }

    public TranslateImageKeysRequest(String str, ImageTranslationInfo.EntityType entityType, List<ImageKeyInfo> list, String str2) {
        this(str, entityType, list, str2, ByteString.EMPTY);
    }

    public TranslateImageKeysRequest(String str, ImageTranslationInfo.EntityType entityType, List<ImageKeyInfo> list, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity_id = str;
        this.entity_type = entityType;
        this.image_keys_info = Internal.immutableCopyOf("image_keys_info", list);
        this.target_language = str2;
    }
}
