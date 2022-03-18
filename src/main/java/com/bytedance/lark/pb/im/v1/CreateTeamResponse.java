package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Item;
import com.bytedance.lark.pb.basic.v1.Team;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CreateTeamResponse extends Message<CreateTeamResponse, C17386a> {
    public static final ProtoAdapter<CreateTeamResponse> ADAPTER = new C17387b();
    private static final long serialVersionUID = 0;
    public final Item item;
    public final Team team;

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateTeamResponse$b */
    private static final class C17387b extends ProtoAdapter<CreateTeamResponse> {
        C17387b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateTeamResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateTeamResponse createTeamResponse) {
            int i;
            int i2 = 0;
            if (createTeamResponse.team != null) {
                i = Team.ADAPTER.encodedSizeWithTag(1, createTeamResponse.team);
            } else {
                i = 0;
            }
            if (createTeamResponse.item != null) {
                i2 = Item.ADAPTER.encodedSizeWithTag(2, createTeamResponse.item);
            }
            return i + i2 + createTeamResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CreateTeamResponse decode(ProtoReader protoReader) throws IOException {
            C17386a aVar = new C17386a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44290a = Team.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44291b = Item.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateTeamResponse createTeamResponse) throws IOException {
            if (createTeamResponse.team != null) {
                Team.ADAPTER.encodeWithTag(protoWriter, 1, createTeamResponse.team);
            }
            if (createTeamResponse.item != null) {
                Item.ADAPTER.encodeWithTag(protoWriter, 2, createTeamResponse.item);
            }
            protoWriter.writeBytes(createTeamResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateTeamResponse$a */
    public static final class C17386a extends Message.Builder<CreateTeamResponse, C17386a> {

        /* renamed from: a */
        public Team f44290a;

        /* renamed from: b */
        public Item f44291b;

        /* renamed from: a */
        public CreateTeamResponse build() {
            return new CreateTeamResponse(this.f44290a, this.f44291b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17386a newBuilder() {
        C17386a aVar = new C17386a();
        aVar.f44290a = this.team;
        aVar.f44291b = this.item;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CreateTeamResponse");
        StringBuilder sb = new StringBuilder();
        if (this.team != null) {
            sb.append(", team=");
            sb.append(this.team);
        }
        if (this.item != null) {
            sb.append(", item=");
            sb.append(this.item);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateTeamResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CreateTeamResponse(Team team2, Item item2) {
        this(team2, item2, ByteString.EMPTY);
    }

    public CreateTeamResponse(Team team2, Item item2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.team = team2;
        this.item = item2;
    }
}
