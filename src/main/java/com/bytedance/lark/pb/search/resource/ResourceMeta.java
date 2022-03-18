package com.bytedance.lark.pb.search.resource;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.basic.v1.MediaContent;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ResourceMeta extends Message<ResourceMeta, C18787a> {
    public static final ProtoAdapter<ResourceMeta> ADAPTER = new C18788b();
    public static final ResourceType DEFAULT_RESOURCE_TYPE = ResourceType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String id;
    public final MessageRelatedInfo message_related_info;
    public final ResourceContent resource_content;
    public final ResourceType resource_type;

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

    public static final class ImageContent extends Message<ImageContent, C18781a> {
        public static final ProtoAdapter<ImageContent> ADAPTER = new C18782b();
        private static final long serialVersionUID = 0;
        public final ImageSet image;

        /* renamed from: com.bytedance.lark.pb.search.resource.ResourceMeta$ImageContent$b */
        private static final class C18782b extends ProtoAdapter<ImageContent> {
            C18782b() {
                super(FieldEncoding.LENGTH_DELIMITED, ImageContent.class);
            }

            /* renamed from: a */
            public int encodedSize(ImageContent imageContent) {
                return ImageSet.ADAPTER.encodedSizeWithTag(1, imageContent.image) + imageContent.unknownFields().size();
            }

            /* renamed from: a */
            public ImageContent decode(ProtoReader protoReader) throws IOException {
                C18781a aVar = new C18781a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag != 1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f46340a = ImageSet.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ImageContent imageContent) throws IOException {
                ImageSet.ADAPTER.encodeWithTag(protoWriter, 1, imageContent.image);
                protoWriter.writeBytes(imageContent.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.resource.ResourceMeta$ImageContent$a */
        public static final class C18781a extends Message.Builder<ImageContent, C18781a> {

            /* renamed from: a */
            public ImageSet f46340a;

            /* renamed from: a */
            public ImageContent build() {
                ImageSet imageSet = this.f46340a;
                if (imageSet != null) {
                    return new ImageContent(imageSet, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(imageSet, "image");
            }
        }

        @Override // com.squareup.wire.Message
        public C18781a newBuilder() {
            C18781a aVar = new C18781a();
            aVar.f46340a = this.image;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "ImageContent");
            StringBuilder sb = new StringBuilder();
            sb.append(", image=");
            sb.append(this.image);
            StringBuilder replace = sb.replace(0, 2, "ImageContent{");
            replace.append('}');
            return replace.toString();
        }

        public ImageContent(ImageSet imageSet) {
            this(imageSet, ByteString.EMPTY);
        }

        public ImageContent(ImageSet imageSet, ByteString byteString) {
            super(ADAPTER, byteString);
            this.image = imageSet;
        }
    }

    public static final class ResourceContent extends Message<ResourceContent, C18783a> {
        public static final ProtoAdapter<ResourceContent> ADAPTER = new C18784b();
        private static final long serialVersionUID = 0;
        public final ImageContent image_content;
        public final VideoContent video_content;

        /* renamed from: com.bytedance.lark.pb.search.resource.ResourceMeta$ResourceContent$b */
        private static final class C18784b extends ProtoAdapter<ResourceContent> {
            C18784b() {
                super(FieldEncoding.LENGTH_DELIMITED, ResourceContent.class);
            }

            /* renamed from: a */
            public int encodedSize(ResourceContent resourceContent) {
                int i;
                int i2 = 0;
                if (resourceContent.image_content != null) {
                    i = ImageContent.ADAPTER.encodedSizeWithTag(1, resourceContent.image_content);
                } else {
                    i = 0;
                }
                if (resourceContent.video_content != null) {
                    i2 = VideoContent.ADAPTER.encodedSizeWithTag(2, resourceContent.video_content);
                }
                return i + i2 + resourceContent.unknownFields().size();
            }

            /* renamed from: a */
            public ResourceContent decode(ProtoReader protoReader) throws IOException {
                C18783a aVar = new C18783a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.mo64532a(ImageContent.ADAPTER.decode(protoReader));
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.mo64533a(VideoContent.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ResourceContent resourceContent) throws IOException {
                if (resourceContent.image_content != null) {
                    ImageContent.ADAPTER.encodeWithTag(protoWriter, 1, resourceContent.image_content);
                }
                if (resourceContent.video_content != null) {
                    VideoContent.ADAPTER.encodeWithTag(protoWriter, 2, resourceContent.video_content);
                }
                protoWriter.writeBytes(resourceContent.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.resource.ResourceMeta$ResourceContent$a */
        public static final class C18783a extends Message.Builder<ResourceContent, C18783a> {

            /* renamed from: a */
            public ImageContent f46341a;

            /* renamed from: b */
            public VideoContent f46342b;

            /* renamed from: a */
            public ResourceContent build() {
                return new ResourceContent(this.f46341a, this.f46342b, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C18783a mo64532a(ImageContent imageContent) {
                this.f46341a = imageContent;
                this.f46342b = null;
                return this;
            }

            /* renamed from: a */
            public C18783a mo64533a(VideoContent videoContent) {
                this.f46342b = videoContent;
                this.f46341a = null;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C18783a newBuilder() {
            C18783a aVar = new C18783a();
            aVar.f46341a = this.image_content;
            aVar.f46342b = this.video_content;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "ResourceContent");
            StringBuilder sb = new StringBuilder();
            if (this.image_content != null) {
                sb.append(", image_content=");
                sb.append(this.image_content);
            }
            if (this.video_content != null) {
                sb.append(", video_content=");
                sb.append(this.video_content);
            }
            StringBuilder replace = sb.replace(0, 2, "ResourceContent{");
            replace.append('}');
            return replace.toString();
        }

        public ResourceContent(ImageContent imageContent, VideoContent videoContent) {
            this(imageContent, videoContent, ByteString.EMPTY);
        }

        public ResourceContent(ImageContent imageContent, VideoContent videoContent, ByteString byteString) {
            super(ADAPTER, byteString);
            if (Internal.countNonNull(imageContent, videoContent) <= 1) {
                this.image_content = imageContent;
                this.video_content = videoContent;
                return;
            }
            throw new IllegalArgumentException("at most one of image_content, video_content may be non-null");
        }
    }

    public static final class VideoContent extends Message<VideoContent, C18785a> {
        public static final ProtoAdapter<VideoContent> ADAPTER = new C18786b();
        private static final long serialVersionUID = 0;
        public final MediaContent media;

        /* renamed from: com.bytedance.lark.pb.search.resource.ResourceMeta$VideoContent$b */
        private static final class C18786b extends ProtoAdapter<VideoContent> {
            C18786b() {
                super(FieldEncoding.LENGTH_DELIMITED, VideoContent.class);
            }

            /* renamed from: a */
            public int encodedSize(VideoContent videoContent) {
                return MediaContent.ADAPTER.encodedSizeWithTag(1, videoContent.media) + videoContent.unknownFields().size();
            }

            /* renamed from: a */
            public VideoContent decode(ProtoReader protoReader) throws IOException {
                C18785a aVar = new C18785a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag != 1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f46343a = MediaContent.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, VideoContent videoContent) throws IOException {
                MediaContent.ADAPTER.encodeWithTag(protoWriter, 1, videoContent.media);
                protoWriter.writeBytes(videoContent.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.resource.ResourceMeta$VideoContent$a */
        public static final class C18785a extends Message.Builder<VideoContent, C18785a> {

            /* renamed from: a */
            public MediaContent f46343a;

            /* renamed from: a */
            public VideoContent build() {
                MediaContent mediaContent = this.f46343a;
                if (mediaContent != null) {
                    return new VideoContent(mediaContent, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(mediaContent, "media");
            }
        }

        @Override // com.squareup.wire.Message
        public C18785a newBuilder() {
            C18785a aVar = new C18785a();
            aVar.f46343a = this.media;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "VideoContent");
            StringBuilder sb = new StringBuilder();
            sb.append(", media=");
            sb.append(this.media);
            StringBuilder replace = sb.replace(0, 2, "VideoContent{");
            replace.append('}');
            return replace.toString();
        }

        public VideoContent(MediaContent mediaContent) {
            this(mediaContent, ByteString.EMPTY);
        }

        public VideoContent(MediaContent mediaContent, ByteString byteString) {
            super(ADAPTER, byteString);
            this.media = mediaContent;
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.resource.ResourceMeta$b */
    private static final class C18788b extends ProtoAdapter<ResourceMeta> {
        C18788b() {
            super(FieldEncoding.LENGTH_DELIMITED, ResourceMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(ResourceMeta resourceMeta) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, resourceMeta.id);
            int i3 = 0;
            if (resourceMeta.resource_type != null) {
                i = ResourceType.ADAPTER.encodedSizeWithTag(2, resourceMeta.resource_type);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (resourceMeta.message_related_info != null) {
                i2 = MessageRelatedInfo.ADAPTER.encodedSizeWithTag(3, resourceMeta.message_related_info);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (resourceMeta.resource_content != null) {
                i3 = ResourceContent.ADAPTER.encodedSizeWithTag(4, resourceMeta.resource_content);
            }
            return i5 + i3 + resourceMeta.unknownFields().size();
        }

        /* renamed from: a */
        public ResourceMeta decode(ProtoReader protoReader) throws IOException {
            C18787a aVar = new C18787a();
            aVar.f46344a = "";
            aVar.f46345b = ResourceType.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46344a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f46345b = ResourceType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f46346c = MessageRelatedInfo.ADAPTER.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46347d = ResourceContent.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ResourceMeta resourceMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, resourceMeta.id);
            if (resourceMeta.resource_type != null) {
                ResourceType.ADAPTER.encodeWithTag(protoWriter, 2, resourceMeta.resource_type);
            }
            if (resourceMeta.message_related_info != null) {
                MessageRelatedInfo.ADAPTER.encodeWithTag(protoWriter, 3, resourceMeta.message_related_info);
            }
            if (resourceMeta.resource_content != null) {
                ResourceContent.ADAPTER.encodeWithTag(protoWriter, 4, resourceMeta.resource_content);
            }
            protoWriter.writeBytes(resourceMeta.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18787a newBuilder() {
        C18787a aVar = new C18787a();
        aVar.f46344a = this.id;
        aVar.f46345b = this.resource_type;
        aVar.f46346c = this.message_related_info;
        aVar.f46347d = this.resource_content;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.search.resource.ResourceMeta$a */
    public static final class C18787a extends Message.Builder<ResourceMeta, C18787a> {

        /* renamed from: a */
        public String f46344a;

        /* renamed from: b */
        public ResourceType f46345b;

        /* renamed from: c */
        public MessageRelatedInfo f46346c;

        /* renamed from: d */
        public ResourceContent f46347d;

        /* renamed from: a */
        public ResourceMeta build() {
            String str = this.f46344a;
            if (str != null) {
                return new ResourceMeta(str, this.f46345b, this.f46346c, this.f46347d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "ResourceMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.resource_type != null) {
            sb.append(", resource_type=");
            sb.append(this.resource_type);
        }
        if (this.message_related_info != null) {
            sb.append(", message_related_info=");
            sb.append(this.message_related_info);
        }
        if (this.resource_content != null) {
            sb.append(", resource_content=");
            sb.append(this.resource_content);
        }
        StringBuilder replace = sb.replace(0, 2, "ResourceMeta{");
        replace.append('}');
        return replace.toString();
    }

    public ResourceMeta(String str, ResourceType resourceType, MessageRelatedInfo messageRelatedInfo, ResourceContent resourceContent) {
        this(str, resourceType, messageRelatedInfo, resourceContent, ByteString.EMPTY);
    }

    public ResourceMeta(String str, ResourceType resourceType, MessageRelatedInfo messageRelatedInfo, ResourceContent resourceContent, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.resource_type = resourceType;
        this.message_related_info = messageRelatedInfo;
        this.resource_content = resourceContent;
    }
}
