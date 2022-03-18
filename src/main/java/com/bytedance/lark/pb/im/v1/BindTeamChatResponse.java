package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.bytedance.lark.pb.basic.v1.Item;
import com.bytedance.lark.pb.basic.v1.Team;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class BindTeamChatResponse extends Message<BindTeamChatResponse, C17302a> {
    public static final ProtoAdapter<BindTeamChatResponse> ADAPTER = new C17303b();
    private static final long serialVersionUID = 0;
    public final Chat chat;
    public final Item item;
    public final Team team;

    /* renamed from: com.bytedance.lark.pb.im.v1.BindTeamChatResponse$b */
    private static final class C17303b extends ProtoAdapter<BindTeamChatResponse> {
        C17303b() {
            super(FieldEncoding.LENGTH_DELIMITED, BindTeamChatResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(BindTeamChatResponse bindTeamChatResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (bindTeamChatResponse.team != null) {
                i = Team.ADAPTER.encodedSizeWithTag(1, bindTeamChatResponse.team);
            } else {
                i = 0;
            }
            if (bindTeamChatResponse.chat != null) {
                i2 = Chat.ADAPTER.encodedSizeWithTag(2, bindTeamChatResponse.chat);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (bindTeamChatResponse.item != null) {
                i3 = Item.ADAPTER.encodedSizeWithTag(3, bindTeamChatResponse.item);
            }
            return i4 + i3 + bindTeamChatResponse.unknownFields().size();
        }

        /* renamed from: a */
        public BindTeamChatResponse decode(ProtoReader protoReader) throws IOException {
            C17302a aVar = new C17302a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44145a = Team.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44146b = Chat.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44147c = Item.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BindTeamChatResponse bindTeamChatResponse) throws IOException {
            if (bindTeamChatResponse.team != null) {
                Team.ADAPTER.encodeWithTag(protoWriter, 1, bindTeamChatResponse.team);
            }
            if (bindTeamChatResponse.chat != null) {
                Chat.ADAPTER.encodeWithTag(protoWriter, 2, bindTeamChatResponse.chat);
            }
            if (bindTeamChatResponse.item != null) {
                Item.ADAPTER.encodeWithTag(protoWriter, 3, bindTeamChatResponse.item);
            }
            protoWriter.writeBytes(bindTeamChatResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.BindTeamChatResponse$a */
    public static final class C17302a extends Message.Builder<BindTeamChatResponse, C17302a> {

        /* renamed from: a */
        public Team f44145a;

        /* renamed from: b */
        public Chat f44146b;

        /* renamed from: c */
        public Item f44147c;

        /* renamed from: a */
        public BindTeamChatResponse build() {
            return new BindTeamChatResponse(this.f44145a, this.f44146b, this.f44147c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17302a newBuilder() {
        C17302a aVar = new C17302a();
        aVar.f44145a = this.team;
        aVar.f44146b = this.chat;
        aVar.f44147c = this.item;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "BindTeamChatResponse");
        StringBuilder sb = new StringBuilder();
        if (this.team != null) {
            sb.append(", team=");
            sb.append(this.team);
        }
        if (this.chat != null) {
            sb.append(", chat=");
            sb.append(this.chat);
        }
        if (this.item != null) {
            sb.append(", item=");
            sb.append(this.item);
        }
        StringBuilder replace = sb.replace(0, 2, "BindTeamChatResponse{");
        replace.append('}');
        return replace.toString();
    }

    public BindTeamChatResponse(Team team2, Chat chat2, Item item2) {
        this(team2, chat2, item2, ByteString.EMPTY);
    }

    public BindTeamChatResponse(Team team2, Chat chat2, Item item2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.team = team2;
        this.chat = chat2;
        this.item = item2;
    }
}
