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

public final class UpgradeToTeamResponse extends Message<UpgradeToTeamResponse, C18172a> {
    public static final ProtoAdapter<UpgradeToTeamResponse> ADAPTER = new C18173b();
    private static final long serialVersionUID = 0;
    public final Chat chat;
    public final Item chat_item;
    public final Team team;
    public final Item team_item;

    /* renamed from: com.bytedance.lark.pb.im.v1.UpgradeToTeamResponse$b */
    private static final class C18173b extends ProtoAdapter<UpgradeToTeamResponse> {
        C18173b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpgradeToTeamResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UpgradeToTeamResponse upgradeToTeamResponse) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (upgradeToTeamResponse.team != null) {
                i = Team.ADAPTER.encodedSizeWithTag(1, upgradeToTeamResponse.team);
            } else {
                i = 0;
            }
            if (upgradeToTeamResponse.team_item != null) {
                i2 = Item.ADAPTER.encodedSizeWithTag(2, upgradeToTeamResponse.team_item);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (upgradeToTeamResponse.chat != null) {
                i3 = Chat.ADAPTER.encodedSizeWithTag(3, upgradeToTeamResponse.chat);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (upgradeToTeamResponse.chat_item != null) {
                i4 = Item.ADAPTER.encodedSizeWithTag(4, upgradeToTeamResponse.chat_item);
            }
            return i6 + i4 + upgradeToTeamResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UpgradeToTeamResponse decode(ProtoReader protoReader) throws IOException {
            C18172a aVar = new C18172a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45379a = Team.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45380b = Item.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f45381c = Chat.ADAPTER.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45382d = Item.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpgradeToTeamResponse upgradeToTeamResponse) throws IOException {
            if (upgradeToTeamResponse.team != null) {
                Team.ADAPTER.encodeWithTag(protoWriter, 1, upgradeToTeamResponse.team);
            }
            if (upgradeToTeamResponse.team_item != null) {
                Item.ADAPTER.encodeWithTag(protoWriter, 2, upgradeToTeamResponse.team_item);
            }
            if (upgradeToTeamResponse.chat != null) {
                Chat.ADAPTER.encodeWithTag(protoWriter, 3, upgradeToTeamResponse.chat);
            }
            if (upgradeToTeamResponse.chat_item != null) {
                Item.ADAPTER.encodeWithTag(protoWriter, 4, upgradeToTeamResponse.chat_item);
            }
            protoWriter.writeBytes(upgradeToTeamResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.UpgradeToTeamResponse$a */
    public static final class C18172a extends Message.Builder<UpgradeToTeamResponse, C18172a> {

        /* renamed from: a */
        public Team f45379a;

        /* renamed from: b */
        public Item f45380b;

        /* renamed from: c */
        public Chat f45381c;

        /* renamed from: d */
        public Item f45382d;

        /* renamed from: a */
        public UpgradeToTeamResponse build() {
            return new UpgradeToTeamResponse(this.f45379a, this.f45380b, this.f45381c, this.f45382d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18172a newBuilder() {
        C18172a aVar = new C18172a();
        aVar.f45379a = this.team;
        aVar.f45380b = this.team_item;
        aVar.f45381c = this.chat;
        aVar.f45382d = this.chat_item;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "UpgradeToTeamResponse");
        StringBuilder sb = new StringBuilder();
        if (this.team != null) {
            sb.append(", team=");
            sb.append(this.team);
        }
        if (this.team_item != null) {
            sb.append(", team_item=");
            sb.append(this.team_item);
        }
        if (this.chat != null) {
            sb.append(", chat=");
            sb.append(this.chat);
        }
        if (this.chat_item != null) {
            sb.append(", chat_item=");
            sb.append(this.chat_item);
        }
        StringBuilder replace = sb.replace(0, 2, "UpgradeToTeamResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UpgradeToTeamResponse(Team team2, Item item, Chat chat2, Item item2) {
        this(team2, item, chat2, item2, ByteString.EMPTY);
    }

    public UpgradeToTeamResponse(Team team2, Item item, Chat chat2, Item item2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.team = team2;
        this.team_item = item;
        this.chat = chat2;
        this.chat_item = item2;
    }
}
