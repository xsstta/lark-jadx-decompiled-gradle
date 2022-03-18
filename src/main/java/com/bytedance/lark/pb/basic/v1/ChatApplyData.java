package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ChatApplyData extends Message<ChatApplyData, C14779a> {
    public static final ProtoAdapter<ChatApplyData> ADAPTER = new C14780b();
    private static final long serialVersionUID = 0;
    public final String chat_id;

    /* renamed from: com.bytedance.lark.pb.basic.v1.ChatApplyData$b */
    private static final class C14780b extends ProtoAdapter<ChatApplyData> {
        C14780b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChatApplyData.class);
        }

        /* renamed from: a */
        public int encodedSize(ChatApplyData chatApplyData) {
            int i;
            if (chatApplyData.chat_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, chatApplyData.chat_id);
            } else {
                i = 0;
            }
            return i + chatApplyData.unknownFields().size();
        }

        /* renamed from: a */
        public ChatApplyData decode(ProtoReader protoReader) throws IOException {
            C14779a aVar = new C14779a();
            aVar.f39060a = "";
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
                    aVar.f39060a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ChatApplyData chatApplyData) throws IOException {
            if (chatApplyData.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, chatApplyData.chat_id);
            }
            protoWriter.writeBytes(chatApplyData.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.ChatApplyData$a */
    public static final class C14779a extends Message.Builder<ChatApplyData, C14779a> {

        /* renamed from: a */
        public String f39060a;

        /* renamed from: a */
        public ChatApplyData build() {
            return new ChatApplyData(this.f39060a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14779a newBuilder() {
        C14779a aVar = new C14779a();
        aVar.f39060a = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "ChatApplyData");
        StringBuilder sb = new StringBuilder();
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        StringBuilder replace = sb.replace(0, 2, "ChatApplyData{");
        replace.append('}');
        return replace.toString();
    }

    public ChatApplyData(String str) {
        this(str, ByteString.EMPTY);
    }

    public ChatApplyData(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
    }
}
