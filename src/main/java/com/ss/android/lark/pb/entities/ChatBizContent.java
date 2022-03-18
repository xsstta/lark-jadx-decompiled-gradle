package com.ss.android.lark.pb.entities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ChatBizContent extends Message<ChatBizContent, C49654a> {
    public static final ProtoAdapter<ChatBizContent> ADAPTER = new C49655b();
    public static final Long DEFAULT_TEAM_ID = 0L;
    private static final long serialVersionUID = 0;
    public final TeamChatType mteam_chat_type;
    public final Long mteam_id;

    /* renamed from: com.ss.android.lark.pb.entities.ChatBizContent$b */
    private static final class C49655b extends ProtoAdapter<ChatBizContent> {
        C49655b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChatBizContent.class);
        }

        /* renamed from: a */
        public int encodedSize(ChatBizContent chatBizContent) {
            int i;
            int i2 = 0;
            if (chatBizContent.mteam_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, chatBizContent.mteam_id);
            } else {
                i = 0;
            }
            if (chatBizContent.mteam_chat_type != null) {
                i2 = TeamChatType.ADAPTER.encodedSizeWithTag(2, chatBizContent.mteam_chat_type);
            }
            return i + i2 + chatBizContent.unknownFields().size();
        }

        /* renamed from: a */
        public ChatBizContent decode(ProtoReader protoReader) throws IOException {
            C49654a aVar = new C49654a();
            aVar.f124385a = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124385a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f124386b = TeamChatType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ChatBizContent chatBizContent) throws IOException {
            if (chatBizContent.mteam_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, chatBizContent.mteam_id);
            }
            if (chatBizContent.mteam_chat_type != null) {
                TeamChatType.ADAPTER.encodeWithTag(protoWriter, 2, chatBizContent.mteam_chat_type);
            }
            protoWriter.writeBytes(chatBizContent.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.ChatBizContent$a */
    public static final class C49654a extends Message.Builder<ChatBizContent, C49654a> {

        /* renamed from: a */
        public Long f124385a;

        /* renamed from: b */
        public TeamChatType f124386b;

        /* renamed from: a */
        public ChatBizContent build() {
            return new ChatBizContent(this.f124385a, this.f124386b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49654a newBuilder() {
        C49654a aVar = new C49654a();
        aVar.f124385a = this.mteam_id;
        aVar.f124386b = this.mteam_chat_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mteam_id != null) {
            sb.append(", team_id=");
            sb.append(this.mteam_id);
        }
        if (this.mteam_chat_type != null) {
            sb.append(", team_chat_type=");
            sb.append(this.mteam_chat_type);
        }
        StringBuilder replace = sb.replace(0, 2, "ChatBizContent{");
        replace.append('}');
        return replace.toString();
    }

    public ChatBizContent(Long l, TeamChatType teamChatType) {
        this(l, teamChatType, ByteString.EMPTY);
    }

    public ChatBizContent(Long l, TeamChatType teamChatType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mteam_id = l;
        this.mteam_chat_type = teamChatType;
    }
}
