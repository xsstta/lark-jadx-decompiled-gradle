package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.basic.v1.MediaContent;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetChatResourcesResponse extends Message<GetChatResourcesResponse, C18232a> {
    public static final ProtoAdapter<GetChatResourcesResponse> ADAPTER = new C18233b();
    public static final Boolean DEFAULT_HAS_MORE_AFTER = false;
    public static final Boolean DEFAULT_HAS_MORE_BEFORE = false;
    public static final Integer DEFAULT_MESSAGE_INDEX = 0;
    private static final long serialVersionUID = 0;
    public final Boolean has_more_after;
    public final Boolean has_more_before;
    public final Integer message_index;
    public final List<MessageMeta> messages;

    public static final class Resource extends Message<Resource, C18230a> {
        public static final ProtoAdapter<Resource> ADAPTER = new C18231b();
        public static final Boolean DEFAULT_IS_ORIGIN_SOURCE = false;
        public static final Long DEFAULT_ORIGIN_SIZE = 0L;
        public static final ChatResourceType DEFAULT_TYPE = ChatResourceType.IMAGE;
        private static final long serialVersionUID = 0;
        public final ImageSet image;
        public final Boolean is_origin_source;
        public final Long origin_size;
        public final ChatResourceType type;
        public final MediaMeta video;

        public static final class MediaMeta extends Message<MediaMeta, C18228a> {
            public static final ProtoAdapter<MediaMeta> ADAPTER = new C18229b();
            private static final long serialVersionUID = 0;
            public final String file_path;
            public final MediaContent media_content;

            /* renamed from: com.bytedance.lark.pb.media.v1.GetChatResourcesResponse$Resource$MediaMeta$b */
            private static final class C18229b extends ProtoAdapter<MediaMeta> {
                C18229b() {
                    super(FieldEncoding.LENGTH_DELIMITED, MediaMeta.class);
                }

                /* renamed from: a */
                public int encodedSize(MediaMeta mediaMeta) {
                    int i;
                    int encodedSizeWithTag = MediaContent.ADAPTER.encodedSizeWithTag(1, mediaMeta.media_content);
                    if (mediaMeta.file_path != null) {
                        i = ProtoAdapter.STRING.encodedSizeWithTag(2, mediaMeta.file_path);
                    } else {
                        i = 0;
                    }
                    return encodedSizeWithTag + i + mediaMeta.unknownFields().size();
                }

                /* renamed from: a */
                public MediaMeta decode(ProtoReader protoReader) throws IOException {
                    C18228a aVar = new C18228a();
                    aVar.f45472b = "";
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag == -1) {
                            protoReader.endMessage(beginMessage);
                            return aVar.build();
                        } else if (nextTag == 1) {
                            aVar.f45471a = MediaContent.ADAPTER.decode(protoReader);
                        } else if (nextTag != 2) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            aVar.f45472b = ProtoAdapter.STRING.decode(protoReader);
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, MediaMeta mediaMeta) throws IOException {
                    MediaContent.ADAPTER.encodeWithTag(protoWriter, 1, mediaMeta.media_content);
                    if (mediaMeta.file_path != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mediaMeta.file_path);
                    }
                    protoWriter.writeBytes(mediaMeta.unknownFields());
                }
            }

            /* renamed from: com.bytedance.lark.pb.media.v1.GetChatResourcesResponse$Resource$MediaMeta$a */
            public static final class C18228a extends Message.Builder<MediaMeta, C18228a> {

                /* renamed from: a */
                public MediaContent f45471a;

                /* renamed from: b */
                public String f45472b;

                /* renamed from: a */
                public MediaMeta build() {
                    MediaContent mediaContent = this.f45471a;
                    if (mediaContent != null) {
                        return new MediaMeta(mediaContent, this.f45472b, super.buildUnknownFields());
                    }
                    throw Internal.missingRequiredFields(mediaContent, "media_content");
                }
            }

            @Override // com.squareup.wire.Message
            public C18228a newBuilder() {
                C18228a aVar = new C18228a();
                aVar.f45471a = this.media_content;
                aVar.f45472b = this.file_path;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("media", "MediaMeta");
                StringBuilder sb = new StringBuilder();
                sb.append(", media_content=");
                sb.append(this.media_content);
                if (this.file_path != null) {
                    sb.append(", file_path=");
                    sb.append(this.file_path);
                }
                StringBuilder replace = sb.replace(0, 2, "MediaMeta{");
                replace.append('}');
                return replace.toString();
            }

            public MediaMeta(MediaContent mediaContent, String str) {
                this(mediaContent, str, ByteString.EMPTY);
            }

            public MediaMeta(MediaContent mediaContent, String str, ByteString byteString) {
                super(ADAPTER, byteString);
                this.media_content = mediaContent;
                this.file_path = str;
            }
        }

        /* renamed from: com.bytedance.lark.pb.media.v1.GetChatResourcesResponse$Resource$b */
        private static final class C18231b extends ProtoAdapter<Resource> {
            C18231b() {
                super(FieldEncoding.LENGTH_DELIMITED, Resource.class);
            }

            /* renamed from: a */
            public int encodedSize(Resource resource) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 0;
                if (resource.type != null) {
                    i = ChatResourceType.ADAPTER.encodedSizeWithTag(1, resource.type);
                } else {
                    i = 0;
                }
                if (resource.image != null) {
                    i2 = ImageSet.ADAPTER.encodedSizeWithTag(2, resource.image);
                } else {
                    i2 = 0;
                }
                int i6 = i + i2;
                if (resource.video != null) {
                    i3 = MediaMeta.ADAPTER.encodedSizeWithTag(3, resource.video);
                } else {
                    i3 = 0;
                }
                int i7 = i6 + i3;
                if (resource.is_origin_source != null) {
                    i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, resource.is_origin_source);
                } else {
                    i4 = 0;
                }
                int i8 = i7 + i4;
                if (resource.origin_size != null) {
                    i5 = ProtoAdapter.UINT64.encodedSizeWithTag(5, resource.origin_size);
                }
                return i8 + i5 + resource.unknownFields().size();
            }

            /* renamed from: a */
            public Resource decode(ProtoReader protoReader) throws IOException {
                C18230a aVar = new C18230a();
                aVar.f45473a = ChatResourceType.IMAGE;
                aVar.f45476d = false;
                aVar.f45477e = 0L;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f45473a = ChatResourceType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 2) {
                        aVar.f45474b = ImageSet.ADAPTER.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f45475c = MediaMeta.ADAPTER.decode(protoReader);
                    } else if (nextTag == 4) {
                        aVar.f45476d = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f45477e = ProtoAdapter.UINT64.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Resource resource) throws IOException {
                if (resource.type != null) {
                    ChatResourceType.ADAPTER.encodeWithTag(protoWriter, 1, resource.type);
                }
                if (resource.image != null) {
                    ImageSet.ADAPTER.encodeWithTag(protoWriter, 2, resource.image);
                }
                if (resource.video != null) {
                    MediaMeta.ADAPTER.encodeWithTag(protoWriter, 3, resource.video);
                }
                if (resource.is_origin_source != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, resource.is_origin_source);
                }
                if (resource.origin_size != null) {
                    ProtoAdapter.UINT64.encodeWithTag(protoWriter, 5, resource.origin_size);
                }
                protoWriter.writeBytes(resource.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.media.v1.GetChatResourcesResponse$Resource$a */
        public static final class C18230a extends Message.Builder<Resource, C18230a> {

            /* renamed from: a */
            public ChatResourceType f45473a;

            /* renamed from: b */
            public ImageSet f45474b;

            /* renamed from: c */
            public MediaMeta f45475c;

            /* renamed from: d */
            public Boolean f45476d;

            /* renamed from: e */
            public Long f45477e;

            /* renamed from: a */
            public Resource build() {
                return new Resource(this.f45473a, this.f45474b, this.f45475c, this.f45476d, this.f45477e, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18230a newBuilder() {
            C18230a aVar = new C18230a();
            aVar.f45473a = this.type;
            aVar.f45474b = this.image;
            aVar.f45475c = this.video;
            aVar.f45476d = this.is_origin_source;
            aVar.f45477e = this.origin_size;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("media", "Resource");
            StringBuilder sb = new StringBuilder();
            if (this.type != null) {
                sb.append(", type=");
                sb.append(this.type);
            }
            if (this.image != null) {
                sb.append(", image=");
                sb.append(this.image);
            }
            if (this.video != null) {
                sb.append(", video=");
                sb.append(this.video);
            }
            if (this.is_origin_source != null) {
                sb.append(", is_origin_source=");
                sb.append(this.is_origin_source);
            }
            if (this.origin_size != null) {
                sb.append(", origin_size=");
                sb.append(this.origin_size);
            }
            StringBuilder replace = sb.replace(0, 2, "Resource{");
            replace.append('}');
            return replace.toString();
        }

        public Resource(ChatResourceType chatResourceType, ImageSet imageSet, MediaMeta mediaMeta, Boolean bool, Long l) {
            this(chatResourceType, imageSet, mediaMeta, bool, l, ByteString.EMPTY);
        }

        public Resource(ChatResourceType chatResourceType, ImageSet imageSet, MediaMeta mediaMeta, Boolean bool, Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            this.type = chatResourceType;
            this.image = imageSet;
            this.video = mediaMeta;
            this.is_origin_source = bool;
            this.origin_size = l;
        }
    }

    public static final class MessageMeta extends Message<MessageMeta, C18226a> {
        public static final ProtoAdapter<MessageMeta> ADAPTER = new C18227b();
        public static final Long DEFAULT_CREATE_TIME = 0L;
        public static final Integer DEFAULT_POSITION = 0;
        public static final Integer DEFAULT_THREAD_POSITION = 0;
        private static final long serialVersionUID = 0;
        public final Long create_time;
        public final String id;
        public final Integer position;
        public final List<Resource> resources;
        public final String thread_id;
        public final Integer thread_position;

        /* renamed from: com.bytedance.lark.pb.media.v1.GetChatResourcesResponse$MessageMeta$b */
        private static final class C18227b extends ProtoAdapter<MessageMeta> {
            C18227b() {
                super(FieldEncoding.LENGTH_DELIMITED, MessageMeta.class);
            }

            /* renamed from: a */
            public int encodedSize(MessageMeta messageMeta) {
                int i;
                int i2;
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, messageMeta.id);
                int i3 = 0;
                if (messageMeta.position != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(2, messageMeta.position);
                } else {
                    i = 0;
                }
                int encodedSizeWithTag2 = encodedSizeWithTag + i + ProtoAdapter.INT64.encodedSizeWithTag(3, messageMeta.create_time) + Resource.ADAPTER.asRepeated().encodedSizeWithTag(4, messageMeta.resources);
                if (messageMeta.thread_position != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(5, messageMeta.thread_position);
                } else {
                    i2 = 0;
                }
                int i4 = encodedSizeWithTag2 + i2;
                if (messageMeta.thread_id != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(6, messageMeta.thread_id);
                }
                return i4 + i3 + messageMeta.unknownFields().size();
            }

            /* renamed from: a */
            public MessageMeta decode(ProtoReader protoReader) throws IOException {
                C18226a aVar = new C18226a();
                aVar.f45465a = "";
                aVar.f45466b = 0;
                aVar.f45467c = 0L;
                aVar.f45469e = 0;
                aVar.f45470f = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f45465a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                aVar.f45466b = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 3:
                                aVar.f45467c = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 4:
                                aVar.f45468d.add(Resource.ADAPTER.decode(protoReader));
                                break;
                            case 5:
                                aVar.f45469e = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 6:
                                aVar.f45470f = ProtoAdapter.STRING.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, MessageMeta messageMeta) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, messageMeta.id);
                if (messageMeta.position != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, messageMeta.position);
                }
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, messageMeta.create_time);
                Resource.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, messageMeta.resources);
                if (messageMeta.thread_position != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, messageMeta.thread_position);
                }
                if (messageMeta.thread_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, messageMeta.thread_id);
                }
                protoWriter.writeBytes(messageMeta.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.media.v1.GetChatResourcesResponse$MessageMeta$a */
        public static final class C18226a extends Message.Builder<MessageMeta, C18226a> {

            /* renamed from: a */
            public String f45465a;

            /* renamed from: b */
            public Integer f45466b;

            /* renamed from: c */
            public Long f45467c;

            /* renamed from: d */
            public List<Resource> f45468d = Internal.newMutableList();

            /* renamed from: e */
            public Integer f45469e;

            /* renamed from: f */
            public String f45470f;

            /* renamed from: a */
            public MessageMeta build() {
                Long l;
                String str = this.f45465a;
                if (str != null && (l = this.f45467c) != null) {
                    return new MessageMeta(str, this.f45466b, l, this.f45468d, this.f45469e, this.f45470f, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "id", this.f45467c, "create_time");
            }
        }

        @Override // com.squareup.wire.Message
        public C18226a newBuilder() {
            C18226a aVar = new C18226a();
            aVar.f45465a = this.id;
            aVar.f45466b = this.position;
            aVar.f45467c = this.create_time;
            aVar.f45468d = Internal.copyOf("resources", this.resources);
            aVar.f45469e = this.thread_position;
            aVar.f45470f = this.thread_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("media", "MessageMeta");
            StringBuilder sb = new StringBuilder();
            sb.append(", id=");
            sb.append(this.id);
            if (this.position != null) {
                sb.append(", position=");
                sb.append(this.position);
            }
            sb.append(", create_time=");
            sb.append(this.create_time);
            if (!this.resources.isEmpty()) {
                sb.append(", resources=");
                sb.append(this.resources);
            }
            if (this.thread_position != null) {
                sb.append(", thread_position=");
                sb.append(this.thread_position);
            }
            if (this.thread_id != null) {
                sb.append(", thread_id=");
                sb.append(this.thread_id);
            }
            StringBuilder replace = sb.replace(0, 2, "MessageMeta{");
            replace.append('}');
            return replace.toString();
        }

        public MessageMeta(String str, Integer num, Long l, List<Resource> list, Integer num2, String str2) {
            this(str, num, l, list, num2, str2, ByteString.EMPTY);
        }

        public MessageMeta(String str, Integer num, Long l, List<Resource> list, Integer num2, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.id = str;
            this.position = num;
            this.create_time = l;
            this.resources = Internal.immutableCopyOf("resources", list);
            this.thread_position = num2;
            this.thread_id = str2;
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.GetChatResourcesResponse$b */
    private static final class C18233b extends ProtoAdapter<GetChatResourcesResponse> {
        C18233b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatResourcesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatResourcesResponse getChatResourcesResponse) {
            int i;
            int i2;
            int encodedSizeWithTag = MessageMeta.ADAPTER.asRepeated().encodedSizeWithTag(1, getChatResourcesResponse.messages);
            int i3 = 0;
            if (getChatResourcesResponse.message_index != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, getChatResourcesResponse.message_index);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (getChatResourcesResponse.has_more_before != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, getChatResourcesResponse.has_more_before);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (getChatResourcesResponse.has_more_after != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, getChatResourcesResponse.has_more_after);
            }
            return i5 + i3 + getChatResourcesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatResourcesResponse decode(ProtoReader protoReader) throws IOException {
            C18232a aVar = new C18232a();
            aVar.f45479b = 0;
            aVar.f45480c = false;
            aVar.f45481d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45478a.add(MessageMeta.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f45479b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f45480c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45481d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatResourcesResponse getChatResourcesResponse) throws IOException {
            MessageMeta.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getChatResourcesResponse.messages);
            if (getChatResourcesResponse.message_index != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getChatResourcesResponse.message_index);
            }
            if (getChatResourcesResponse.has_more_before != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getChatResourcesResponse.has_more_before);
            }
            if (getChatResourcesResponse.has_more_after != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, getChatResourcesResponse.has_more_after);
            }
            protoWriter.writeBytes(getChatResourcesResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.GetChatResourcesResponse$a */
    public static final class C18232a extends Message.Builder<GetChatResourcesResponse, C18232a> {

        /* renamed from: a */
        public List<MessageMeta> f45478a = Internal.newMutableList();

        /* renamed from: b */
        public Integer f45479b;

        /* renamed from: c */
        public Boolean f45480c;

        /* renamed from: d */
        public Boolean f45481d;

        /* renamed from: a */
        public GetChatResourcesResponse build() {
            return new GetChatResourcesResponse(this.f45478a, this.f45479b, this.f45480c, this.f45481d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18232a newBuilder() {
        C18232a aVar = new C18232a();
        aVar.f45478a = Internal.copyOf("messages", this.messages);
        aVar.f45479b = this.message_index;
        aVar.f45480c = this.has_more_before;
        aVar.f45481d = this.has_more_after;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "GetChatResourcesResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.messages.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        if (this.message_index != null) {
            sb.append(", message_index=");
            sb.append(this.message_index);
        }
        if (this.has_more_before != null) {
            sb.append(", has_more_before=");
            sb.append(this.has_more_before);
        }
        if (this.has_more_after != null) {
            sb.append(", has_more_after=");
            sb.append(this.has_more_after);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatResourcesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatResourcesResponse(List<MessageMeta> list, Integer num, Boolean bool, Boolean bool2) {
        this(list, num, bool, bool2, ByteString.EMPTY);
    }

    public GetChatResourcesResponse(List<MessageMeta> list, Integer num, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.messages = Internal.immutableCopyOf("messages", list);
        this.message_index = num;
        this.has_more_before = bool;
        this.has_more_after = bool2;
    }
}
