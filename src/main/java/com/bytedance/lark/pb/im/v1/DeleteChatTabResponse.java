package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class DeleteChatTabResponse extends Message<DeleteChatTabResponse, C17400a> {
    public static final ProtoAdapter<DeleteChatTabResponse> ADAPTER = new C17401b();
    public static final Long DEFAULT_CHAT_ID = 0L;
    public static final Long DEFAULT_VERSION = 0L;
    private static final long serialVersionUID = 0;
    public final Long chat_id;
    public final List<ChatTab> tabs;
    public final Long version;

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteChatTabResponse$b */
    private static final class C17401b extends ProtoAdapter<DeleteChatTabResponse> {
        C17401b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteChatTabResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteChatTabResponse deleteChatTabResponse) {
            int i;
            int i2 = 0;
            if (deleteChatTabResponse.chat_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, deleteChatTabResponse.chat_id);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + ChatTab.ADAPTER.asRepeated().encodedSizeWithTag(2, deleteChatTabResponse.tabs);
            if (deleteChatTabResponse.version != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, deleteChatTabResponse.version);
            }
            return encodedSizeWithTag + i2 + deleteChatTabResponse.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteChatTabResponse decode(ProtoReader protoReader) throws IOException {
            C17400a aVar = new C17400a();
            aVar.f44310a = 0L;
            aVar.f44312c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44310a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44311b.add(ChatTab.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44312c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteChatTabResponse deleteChatTabResponse) throws IOException {
            if (deleteChatTabResponse.chat_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, deleteChatTabResponse.chat_id);
            }
            ChatTab.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, deleteChatTabResponse.tabs);
            if (deleteChatTabResponse.version != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, deleteChatTabResponse.version);
            }
            protoWriter.writeBytes(deleteChatTabResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteChatTabResponse$a */
    public static final class C17400a extends Message.Builder<DeleteChatTabResponse, C17400a> {

        /* renamed from: a */
        public Long f44310a;

        /* renamed from: b */
        public List<ChatTab> f44311b = Internal.newMutableList();

        /* renamed from: c */
        public Long f44312c;

        /* renamed from: a */
        public DeleteChatTabResponse build() {
            return new DeleteChatTabResponse(this.f44310a, this.f44311b, this.f44312c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17400a newBuilder() {
        C17400a aVar = new C17400a();
        aVar.f44310a = this.chat_id;
        aVar.f44311b = Internal.copyOf("tabs", this.tabs);
        aVar.f44312c = this.version;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "DeleteChatTabResponse");
        StringBuilder sb = new StringBuilder();
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (!this.tabs.isEmpty()) {
            sb.append(", tabs=");
            sb.append(this.tabs);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteChatTabResponse{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteChatTabResponse(Long l, List<ChatTab> list, Long l2) {
        this(l, list, l2, ByteString.EMPTY);
    }

    public DeleteChatTabResponse(Long l, List<ChatTab> list, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = l;
        this.tabs = Internal.immutableCopyOf("tabs", list);
        this.version = l2;
    }
}
