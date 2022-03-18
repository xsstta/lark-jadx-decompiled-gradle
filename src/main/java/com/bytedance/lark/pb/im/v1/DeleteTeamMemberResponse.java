package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Team;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DeleteTeamMemberResponse extends Message<DeleteTeamMemberResponse, C17432a> {
    public static final ProtoAdapter<DeleteTeamMemberResponse> ADAPTER = new C17433b();
    private static final long serialVersionUID = 0;
    public final Team team;

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteTeamMemberResponse$b */
    private static final class C17433b extends ProtoAdapter<DeleteTeamMemberResponse> {
        C17433b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteTeamMemberResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteTeamMemberResponse deleteTeamMemberResponse) {
            int i;
            if (deleteTeamMemberResponse.team != null) {
                i = Team.ADAPTER.encodedSizeWithTag(1, deleteTeamMemberResponse.team);
            } else {
                i = 0;
            }
            return i + deleteTeamMemberResponse.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteTeamMemberResponse decode(ProtoReader protoReader) throws IOException {
            C17432a aVar = new C17432a();
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
                    aVar.f44330a = Team.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteTeamMemberResponse deleteTeamMemberResponse) throws IOException {
            if (deleteTeamMemberResponse.team != null) {
                Team.ADAPTER.encodeWithTag(protoWriter, 1, deleteTeamMemberResponse.team);
            }
            protoWriter.writeBytes(deleteTeamMemberResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteTeamMemberResponse$a */
    public static final class C17432a extends Message.Builder<DeleteTeamMemberResponse, C17432a> {

        /* renamed from: a */
        public Team f44330a;

        /* renamed from: a */
        public DeleteTeamMemberResponse build() {
            return new DeleteTeamMemberResponse(this.f44330a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17432a newBuilder() {
        C17432a aVar = new C17432a();
        aVar.f44330a = this.team;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "DeleteTeamMemberResponse");
        StringBuilder sb = new StringBuilder();
        if (this.team != null) {
            sb.append(", team=");
            sb.append(this.team);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteTeamMemberResponse{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteTeamMemberResponse(Team team2) {
        this(team2, ByteString.EMPTY);
    }

    public DeleteTeamMemberResponse(Team team2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.team = team2;
    }
}
