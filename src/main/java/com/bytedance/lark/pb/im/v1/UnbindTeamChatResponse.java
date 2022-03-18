package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.bytedance.lark.pb.basic.v1.Item;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UnbindTeamChatResponse extends Message<UnbindTeamChatResponse, C18127a> {
    public static final ProtoAdapter<UnbindTeamChatResponse> ADAPTER = new C18128b();
    private static final long serialVersionUID = 0;
    public final Chat chat;
    public final Item item;

    /* renamed from: com.bytedance.lark.pb.im.v1.UnbindTeamChatResponse$b */
    private static final class C18128b extends ProtoAdapter<UnbindTeamChatResponse> {
        C18128b() {
            super(FieldEncoding.LENGTH_DELIMITED, UnbindTeamChatResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UnbindTeamChatResponse unbindTeamChatResponse) {
            int i;
            int i2 = 0;
            if (unbindTeamChatResponse.chat != null) {
                i = Chat.ADAPTER.encodedSizeWithTag(1, unbindTeamChatResponse.chat);
            } else {
                i = 0;
            }
            if (unbindTeamChatResponse.item != null) {
                i2 = Item.ADAPTER.encodedSizeWithTag(2, unbindTeamChatResponse.item);
            }
            return i + i2 + unbindTeamChatResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UnbindTeamChatResponse decode(ProtoReader protoReader) throws IOException {
            C18127a aVar = new C18127a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45286a = Chat.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45287b = Item.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UnbindTeamChatResponse unbindTeamChatResponse) throws IOException {
            if (unbindTeamChatResponse.chat != null) {
                Chat.ADAPTER.encodeWithTag(protoWriter, 1, unbindTeamChatResponse.chat);
            }
            if (unbindTeamChatResponse.item != null) {
                Item.ADAPTER.encodeWithTag(protoWriter, 2, unbindTeamChatResponse.item);
            }
            protoWriter.writeBytes(unbindTeamChatResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.UnbindTeamChatResponse$a */
    public static final class C18127a extends Message.Builder<UnbindTeamChatResponse, C18127a> {

        /* renamed from: a */
        public Chat f45286a;

        /* renamed from: b */
        public Item f45287b;

        /* renamed from: a */
        public UnbindTeamChatResponse build() {
            return new UnbindTeamChatResponse(this.f45286a, this.f45287b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18127a newBuilder() {
        C18127a aVar = new C18127a();
        aVar.f45286a = this.chat;
        aVar.f45287b = this.item;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "UnbindTeamChatResponse");
        StringBuilder sb = new StringBuilder();
        if (this.chat != null) {
            sb.append(", chat=");
            sb.append(this.chat);
        }
        if (this.item != null) {
            sb.append(", item=");
            sb.append(this.item);
        }
        StringBuilder replace = sb.replace(0, 2, "UnbindTeamChatResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UnbindTeamChatResponse(Chat chat2, Item item2) {
        this(chat2, item2, ByteString.EMPTY);
    }

    public UnbindTeamChatResponse(Chat chat2, Item item2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat = chat2;
        this.item = item2;
    }
}
