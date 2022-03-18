package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ChatChatterTagInfo extends Message<ChatChatterTagInfo, C17312a> {
    public static final ProtoAdapter<ChatChatterTagInfo> ADAPTER = new C17313b();
    private static final long serialVersionUID = 0;
    public final List<TagInfo> tags;

    public static final class TagInfo extends Message<TagInfo, C17310a> {
        public static final ProtoAdapter<TagInfo> ADAPTER = new C17311b();
        public static final TagType DEFAULT_TAG_TYPE = TagType.UNKNOWN;
        private static final long serialVersionUID = 0;
        public final String description;
        public final TagType tag_type;

        public enum TagType implements WireEnum {
            UNKNOWN(0),
            CLASS_TEACHER(1),
            DISCIPLINE_TEACHER(2);
            
            public static final ProtoAdapter<TagType> ADAPTER = ProtoAdapter.newEnumAdapter(TagType.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static TagType fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return CLASS_TEACHER;
                }
                if (i != 2) {
                    return null;
                }
                return DISCIPLINE_TEACHER;
            }

            private TagType(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.ChatChatterTagInfo$TagInfo$b */
        private static final class C17311b extends ProtoAdapter<TagInfo> {
            C17311b() {
                super(FieldEncoding.LENGTH_DELIMITED, TagInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(TagInfo tagInfo) {
                int i;
                int i2 = 0;
                if (tagInfo.tag_type != null) {
                    i = TagType.ADAPTER.encodedSizeWithTag(1, tagInfo.tag_type);
                } else {
                    i = 0;
                }
                if (tagInfo.description != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, tagInfo.description);
                }
                return i + i2 + tagInfo.unknownFields().size();
            }

            /* renamed from: a */
            public TagInfo decode(ProtoReader protoReader) throws IOException {
                C17310a aVar = new C17310a();
                aVar.f44155a = TagType.UNKNOWN;
                aVar.f44156b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f44155a = TagType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f44156b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, TagInfo tagInfo) throws IOException {
                if (tagInfo.tag_type != null) {
                    TagType.ADAPTER.encodeWithTag(protoWriter, 1, tagInfo.tag_type);
                }
                if (tagInfo.description != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, tagInfo.description);
                }
                protoWriter.writeBytes(tagInfo.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.ChatChatterTagInfo$TagInfo$a */
        public static final class C17310a extends Message.Builder<TagInfo, C17310a> {

            /* renamed from: a */
            public TagType f44155a;

            /* renamed from: b */
            public String f44156b;

            /* renamed from: a */
            public TagInfo build() {
                return new TagInfo(this.f44155a, this.f44156b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C17310a newBuilder() {
            C17310a aVar = new C17310a();
            aVar.f44155a = this.tag_type;
            aVar.f44156b = this.description;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("im", "TagInfo");
            StringBuilder sb = new StringBuilder();
            if (this.tag_type != null) {
                sb.append(", tag_type=");
                sb.append(this.tag_type);
            }
            if (this.description != null) {
                sb.append(", description=");
                sb.append(this.description);
            }
            StringBuilder replace = sb.replace(0, 2, "TagInfo{");
            replace.append('}');
            return replace.toString();
        }

        public TagInfo(TagType tagType, String str) {
            this(tagType, str, ByteString.EMPTY);
        }

        public TagInfo(TagType tagType, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.tag_type = tagType;
            this.description = str;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.ChatChatterTagInfo$b */
    private static final class C17313b extends ProtoAdapter<ChatChatterTagInfo> {
        C17313b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChatChatterTagInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(ChatChatterTagInfo chatChatterTagInfo) {
            return TagInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, chatChatterTagInfo.tags) + chatChatterTagInfo.unknownFields().size();
        }

        /* renamed from: a */
        public ChatChatterTagInfo decode(ProtoReader protoReader) throws IOException {
            C17312a aVar = new C17312a();
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
                    aVar.f44157a.add(TagInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ChatChatterTagInfo chatChatterTagInfo) throws IOException {
            TagInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, chatChatterTagInfo.tags);
            protoWriter.writeBytes(chatChatterTagInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.ChatChatterTagInfo$a */
    public static final class C17312a extends Message.Builder<ChatChatterTagInfo, C17312a> {

        /* renamed from: a */
        public List<TagInfo> f44157a = Internal.newMutableList();

        /* renamed from: a */
        public ChatChatterTagInfo build() {
            return new ChatChatterTagInfo(this.f44157a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17312a newBuilder() {
        C17312a aVar = new C17312a();
        aVar.f44157a = Internal.copyOf("tags", this.tags);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "ChatChatterTagInfo");
        StringBuilder sb = new StringBuilder();
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        StringBuilder replace = sb.replace(0, 2, "ChatChatterTagInfo{");
        replace.append('}');
        return replace.toString();
    }

    public ChatChatterTagInfo(List<TagInfo> list) {
        this(list, ByteString.EMPTY);
    }

    public ChatChatterTagInfo(List<TagInfo> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.tags = Internal.immutableCopyOf("tags", list);
    }
}
