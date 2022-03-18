package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class ImageTranslationInfo extends Message<ImageTranslationInfo, C15017a> {
    public static final ProtoAdapter<ImageTranslationInfo> ADAPTER = new C15018b();
    public static final EntityType DEFAULT_ENTITY_TYPE = EntityType.UNKNOWN_ENTITY;
    private static final long serialVersionUID = 0;
    public final String entity_id;
    public final EntityType entity_type;
    public final Map<String, TranslatedImage> translated_images;

    public enum EntityType implements WireEnum {
        UNKNOWN_ENTITY(0),
        MESSAGE_ENTITY(1);
        
        public static final ProtoAdapter<EntityType> ADAPTER = ProtoAdapter.newEnumAdapter(EntityType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static EntityType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_ENTITY;
            }
            if (i != 1) {
                return null;
            }
            return MESSAGE_ENTITY;
        }

        private EntityType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.ImageTranslationInfo$b */
    private static final class C15018b extends ProtoAdapter<ImageTranslationInfo> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, TranslatedImage>> f39712a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, TranslatedImage.ADAPTER);

        C15018b() {
            super(FieldEncoding.LENGTH_DELIMITED, ImageTranslationInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(ImageTranslationInfo imageTranslationInfo) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, imageTranslationInfo.entity_id) + EntityType.ADAPTER.encodedSizeWithTag(2, imageTranslationInfo.entity_type) + this.f39712a.encodedSizeWithTag(3, imageTranslationInfo.translated_images) + imageTranslationInfo.unknownFields().size();
        }

        /* renamed from: a */
        public ImageTranslationInfo decode(ProtoReader protoReader) throws IOException {
            C15017a aVar = new C15017a();
            aVar.f39709a = "";
            aVar.f39710b = EntityType.UNKNOWN_ENTITY;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39709a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f39710b = EntityType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f39711c.putAll(this.f39712a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ImageTranslationInfo imageTranslationInfo) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, imageTranslationInfo.entity_id);
            EntityType.ADAPTER.encodeWithTag(protoWriter, 2, imageTranslationInfo.entity_type);
            this.f39712a.encodeWithTag(protoWriter, 3, imageTranslationInfo.translated_images);
            protoWriter.writeBytes(imageTranslationInfo.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15017a newBuilder() {
        C15017a aVar = new C15017a();
        aVar.f39709a = this.entity_id;
        aVar.f39710b = this.entity_type;
        aVar.f39711c = Internal.copyOf("translated_images", this.translated_images);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.ImageTranslationInfo$a */
    public static final class C15017a extends Message.Builder<ImageTranslationInfo, C15017a> {

        /* renamed from: a */
        public String f39709a;

        /* renamed from: b */
        public EntityType f39710b;

        /* renamed from: c */
        public Map<String, TranslatedImage> f39711c = Internal.newMutableMap();

        /* renamed from: a */
        public ImageTranslationInfo build() {
            EntityType entityType;
            String str = this.f39709a;
            if (str != null && (entityType = this.f39710b) != null) {
                return new ImageTranslationInfo(str, entityType, this.f39711c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "entity_id", this.f39710b, "entity_type");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "ImageTranslationInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(", entity_id=");
        sb.append(this.entity_id);
        sb.append(", entity_type=");
        sb.append(this.entity_type);
        if (!this.translated_images.isEmpty()) {
            sb.append(", translated_images=");
            sb.append(this.translated_images);
        }
        StringBuilder replace = sb.replace(0, 2, "ImageTranslationInfo{");
        replace.append('}');
        return replace.toString();
    }

    public ImageTranslationInfo(String str, EntityType entityType, Map<String, TranslatedImage> map) {
        this(str, entityType, map, ByteString.EMPTY);
    }

    public ImageTranslationInfo(String str, EntityType entityType, Map<String, TranslatedImage> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity_id = str;
        this.entity_type = entityType;
        this.translated_images = Internal.immutableCopyOf("translated_images", map);
    }
}
