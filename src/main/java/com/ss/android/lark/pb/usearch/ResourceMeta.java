package com.ss.android.lark.pb.usearch;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.entities.ImageSetV2;
import com.ss.android.lark.pb.entities.MediaContent;
import java.io.IOException;
import okio.ByteString;

public final class ResourceMeta extends Message<ResourceMeta, C50234a> {
    public static final ProtoAdapter<ResourceMeta> ADAPTER = new C50235b();
    private static final long serialVersionUID = 0;
    public final String mid;
    public final ImageSetV2 mimage;
    public final MediaContent mmedia_content;
    public final MessageRelatedInfo mmessage_related_info;
    public final ResourceType mresourceType;

    public enum ResourceType implements WireEnum {
        UNKNOWN(0),
        IMAGE(1),
        VIDEO(2);
        
        public static final ProtoAdapter<ResourceType> ADAPTER = ProtoAdapter.newEnumAdapter(ResourceType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ResourceType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return IMAGE;
            }
            if (i != 2) {
                return null;
            }
            return VIDEO;
        }

        private ResourceType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.usearch.ResourceMeta$b */
    private static final class C50235b extends ProtoAdapter<ResourceMeta> {
        C50235b() {
            super(FieldEncoding.LENGTH_DELIMITED, ResourceMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(ResourceMeta resourceMeta) {
            int i;
            int i2;
            int i3;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, resourceMeta.mid);
            int i4 = 0;
            if (resourceMeta.mresourceType != null) {
                i = ResourceType.ADAPTER.encodedSizeWithTag(2, resourceMeta.mresourceType);
            } else {
                i = 0;
            }
            int i5 = encodedSizeWithTag + i;
            if (resourceMeta.mmessage_related_info != null) {
                i2 = MessageRelatedInfo.ADAPTER.encodedSizeWithTag(3, resourceMeta.mmessage_related_info);
            } else {
                i2 = 0;
            }
            int i6 = i5 + i2;
            if (resourceMeta.mmedia_content != null) {
                i3 = MediaContent.ADAPTER.encodedSizeWithTag(4, resourceMeta.mmedia_content);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (resourceMeta.mimage != null) {
                i4 = ImageSetV2.ADAPTER.encodedSizeWithTag(5, resourceMeta.mimage);
            }
            return i7 + i4 + resourceMeta.unknownFields().size();
        }

        /* renamed from: a */
        public ResourceMeta decode(ProtoReader protoReader) throws IOException {
            C50234a aVar = new C50234a();
            aVar.f125510a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125510a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f125511b = ResourceType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f125512c = MessageRelatedInfo.ADAPTER.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f125513d = MediaContent.ADAPTER.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125514e = ImageSetV2.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ResourceMeta resourceMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, resourceMeta.mid);
            if (resourceMeta.mresourceType != null) {
                ResourceType.ADAPTER.encodeWithTag(protoWriter, 2, resourceMeta.mresourceType);
            }
            if (resourceMeta.mmessage_related_info != null) {
                MessageRelatedInfo.ADAPTER.encodeWithTag(protoWriter, 3, resourceMeta.mmessage_related_info);
            }
            if (resourceMeta.mmedia_content != null) {
                MediaContent.ADAPTER.encodeWithTag(protoWriter, 4, resourceMeta.mmedia_content);
            }
            if (resourceMeta.mimage != null) {
                ImageSetV2.ADAPTER.encodeWithTag(protoWriter, 5, resourceMeta.mimage);
            }
            protoWriter.writeBytes(resourceMeta.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.usearch.ResourceMeta$a */
    public static final class C50234a extends Message.Builder<ResourceMeta, C50234a> {

        /* renamed from: a */
        public String f125510a;

        /* renamed from: b */
        public ResourceType f125511b;

        /* renamed from: c */
        public MessageRelatedInfo f125512c;

        /* renamed from: d */
        public MediaContent f125513d;

        /* renamed from: e */
        public ImageSetV2 f125514e;

        /* renamed from: a */
        public ResourceMeta build() {
            String str = this.f125510a;
            if (str != null) {
                return new ResourceMeta(str, this.f125511b, this.f125512c, this.f125513d, this.f125514e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mid");
        }
    }

    @Override // com.squareup.wire.Message
    public C50234a newBuilder() {
        C50234a aVar = new C50234a();
        aVar.f125510a = this.mid;
        aVar.f125511b = this.mresourceType;
        aVar.f125512c = this.mmessage_related_info;
        aVar.f125513d = this.mmedia_content;
        aVar.f125514e = this.mimage;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.mid);
        if (this.mresourceType != null) {
            sb.append(", resourceType=");
            sb.append(this.mresourceType);
        }
        if (this.mmessage_related_info != null) {
            sb.append(", message_related_info=");
            sb.append(this.mmessage_related_info);
        }
        if (this.mmedia_content != null) {
            sb.append(", media_content=");
            sb.append(this.mmedia_content);
        }
        if (this.mimage != null) {
            sb.append(", image=");
            sb.append(this.mimage);
        }
        StringBuilder replace = sb.replace(0, 2, "ResourceMeta{");
        replace.append('}');
        return replace.toString();
    }

    public ResourceMeta(String str, ResourceType resourceType, MessageRelatedInfo messageRelatedInfo, MediaContent mediaContent, ImageSetV2 imageSetV2) {
        this(str, resourceType, messageRelatedInfo, mediaContent, imageSetV2, ByteString.EMPTY);
    }

    public ResourceMeta(String str, ResourceType resourceType, MessageRelatedInfo messageRelatedInfo, MediaContent mediaContent, ImageSetV2 imageSetV2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mid = str;
        this.mresourceType = resourceType;
        this.mmessage_related_info = messageRelatedInfo;
        this.mmedia_content = mediaContent;
        this.mimage = imageSetV2;
    }
}
