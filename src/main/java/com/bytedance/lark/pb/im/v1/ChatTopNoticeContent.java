package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class ChatTopNoticeContent extends Message<ChatTopNoticeContent, C17318a> {
    public static final ProtoAdapter<ChatTopNoticeContent> ADAPTER = new C17319b();
    public static final Long DEFAULT_MESSAGE_ID = 0L;
    public static final ContentType DEFAULT_TYPE = ContentType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Chat.Announcement announcement;
    public final C14928Entity entity;
    public final Long message_id;
    public final ContentType type;

    public enum ContentType implements WireEnum {
        UNKNOWN(0),
        MSG_TYPE(1),
        ANNOUNCEMENT_TYPE(2);
        
        public static final ProtoAdapter<ContentType> ADAPTER = ProtoAdapter.newEnumAdapter(ContentType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ContentType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return MSG_TYPE;
            }
            if (i != 2) {
                return null;
            }
            return ANNOUNCEMENT_TYPE;
        }

        private ContentType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.ChatTopNoticeContent$b */
    private static final class C17319b extends ProtoAdapter<ChatTopNoticeContent> {
        C17319b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChatTopNoticeContent.class);
        }

        /* renamed from: a */
        public int encodedSize(ChatTopNoticeContent chatTopNoticeContent) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (chatTopNoticeContent.type != null) {
                i = ContentType.ADAPTER.encodedSizeWithTag(1, chatTopNoticeContent.type);
            } else {
                i = 0;
            }
            if (chatTopNoticeContent.message_id != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, chatTopNoticeContent.message_id);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (chatTopNoticeContent.entity != null) {
                i3 = C14928Entity.ADAPTER.encodedSizeWithTag(3, chatTopNoticeContent.entity);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (chatTopNoticeContent.announcement != null) {
                i4 = Chat.Announcement.ADAPTER.encodedSizeWithTag(4, chatTopNoticeContent.announcement);
            }
            return i6 + i4 + chatTopNoticeContent.unknownFields().size();
        }

        /* renamed from: a */
        public ChatTopNoticeContent decode(ProtoReader protoReader) throws IOException {
            C17318a aVar = new C17318a();
            aVar.f44167a = ContentType.UNKNOWN;
            aVar.f44168b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f44167a = ContentType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f44168b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f44169c = C14928Entity.ADAPTER.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44170d = Chat.Announcement.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ChatTopNoticeContent chatTopNoticeContent) throws IOException {
            if (chatTopNoticeContent.type != null) {
                ContentType.ADAPTER.encodeWithTag(protoWriter, 1, chatTopNoticeContent.type);
            }
            if (chatTopNoticeContent.message_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, chatTopNoticeContent.message_id);
            }
            if (chatTopNoticeContent.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 3, chatTopNoticeContent.entity);
            }
            if (chatTopNoticeContent.announcement != null) {
                Chat.Announcement.ADAPTER.encodeWithTag(protoWriter, 4, chatTopNoticeContent.announcement);
            }
            protoWriter.writeBytes(chatTopNoticeContent.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.ChatTopNoticeContent$a */
    public static final class C17318a extends Message.Builder<ChatTopNoticeContent, C17318a> {

        /* renamed from: a */
        public ContentType f44167a;

        /* renamed from: b */
        public Long f44168b;

        /* renamed from: c */
        public C14928Entity f44169c;

        /* renamed from: d */
        public Chat.Announcement f44170d;

        /* renamed from: a */
        public ChatTopNoticeContent build() {
            return new ChatTopNoticeContent(this.f44167a, this.f44168b, this.f44169c, this.f44170d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17318a newBuilder() {
        C17318a aVar = new C17318a();
        aVar.f44167a = this.type;
        aVar.f44168b = this.message_id;
        aVar.f44169c = this.entity;
        aVar.f44170d = this.announcement;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "ChatTopNoticeContent");
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        if (this.announcement != null) {
            sb.append(", announcement=");
            sb.append(this.announcement);
        }
        StringBuilder replace = sb.replace(0, 2, "ChatTopNoticeContent{");
        replace.append('}');
        return replace.toString();
    }

    public ChatTopNoticeContent(ContentType contentType, Long l, C14928Entity entity2, Chat.Announcement announcement2) {
        this(contentType, l, entity2, announcement2, ByteString.EMPTY);
    }

    public ChatTopNoticeContent(ContentType contentType, Long l, C14928Entity entity2, Chat.Announcement announcement2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = contentType;
        this.message_id = l;
        this.entity = entity2;
        this.announcement = announcement2;
    }
}
