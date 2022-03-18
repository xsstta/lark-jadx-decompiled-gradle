package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ChatChatterKickInfo extends Message<ChatChatterKickInfo, C17308a> {
    public static final ProtoAdapter<ChatChatterKickInfo> ADAPTER = new C17309b();
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final String reason;

    /* renamed from: com.bytedance.lark.pb.im.v1.ChatChatterKickInfo$b */
    private static final class C17309b extends ProtoAdapter<ChatChatterKickInfo> {
        C17309b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChatChatterKickInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(ChatChatterKickInfo chatChatterKickInfo) {
            int i;
            int i2 = 0;
            if (chatChatterKickInfo.chat_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, chatChatterKickInfo.chat_id);
            } else {
                i = 0;
            }
            if (chatChatterKickInfo.reason != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, chatChatterKickInfo.reason);
            }
            return i + i2 + chatChatterKickInfo.unknownFields().size();
        }

        /* renamed from: a */
        public ChatChatterKickInfo decode(ProtoReader protoReader) throws IOException {
            C17308a aVar = new C17308a();
            aVar.f44153a = "";
            aVar.f44154b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44153a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44154b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ChatChatterKickInfo chatChatterKickInfo) throws IOException {
            if (chatChatterKickInfo.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, chatChatterKickInfo.chat_id);
            }
            if (chatChatterKickInfo.reason != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, chatChatterKickInfo.reason);
            }
            protoWriter.writeBytes(chatChatterKickInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.ChatChatterKickInfo$a */
    public static final class C17308a extends Message.Builder<ChatChatterKickInfo, C17308a> {

        /* renamed from: a */
        public String f44153a;

        /* renamed from: b */
        public String f44154b;

        /* renamed from: a */
        public ChatChatterKickInfo build() {
            return new ChatChatterKickInfo(this.f44153a, this.f44154b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17308a newBuilder() {
        C17308a aVar = new C17308a();
        aVar.f44153a = this.chat_id;
        aVar.f44154b = this.reason;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "ChatChatterKickInfo");
        StringBuilder sb = new StringBuilder();
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.reason != null) {
            sb.append(", reason=");
            sb.append(this.reason);
        }
        StringBuilder replace = sb.replace(0, 2, "ChatChatterKickInfo{");
        replace.append('}');
        return replace.toString();
    }

    public ChatChatterKickInfo(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public ChatChatterKickInfo(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.reason = str2;
    }
}
