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

public final class PutTeamMemberResponse extends Message<PutTeamMemberResponse, C17985a> {
    public static final ProtoAdapter<PutTeamMemberResponse> ADAPTER = new C17986b();
    private static final long serialVersionUID = 0;
    public final Team team;

    /* renamed from: com.bytedance.lark.pb.im.v1.PutTeamMemberResponse$b */
    private static final class C17986b extends ProtoAdapter<PutTeamMemberResponse> {
        C17986b() {
            super(FieldEncoding.LENGTH_DELIMITED, PutTeamMemberResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PutTeamMemberResponse putTeamMemberResponse) {
            int i;
            if (putTeamMemberResponse.team != null) {
                i = Team.ADAPTER.encodedSizeWithTag(1, putTeamMemberResponse.team);
            } else {
                i = 0;
            }
            return i + putTeamMemberResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PutTeamMemberResponse decode(ProtoReader protoReader) throws IOException {
            C17985a aVar = new C17985a();
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
                    aVar.f45080a = Team.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PutTeamMemberResponse putTeamMemberResponse) throws IOException {
            if (putTeamMemberResponse.team != null) {
                Team.ADAPTER.encodeWithTag(protoWriter, 1, putTeamMemberResponse.team);
            }
            protoWriter.writeBytes(putTeamMemberResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PutTeamMemberResponse$a */
    public static final class C17985a extends Message.Builder<PutTeamMemberResponse, C17985a> {

        /* renamed from: a */
        public Team f45080a;

        /* renamed from: a */
        public PutTeamMemberResponse build() {
            return new PutTeamMemberResponse(this.f45080a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17985a newBuilder() {
        C17985a aVar = new C17985a();
        aVar.f45080a = this.team;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PutTeamMemberResponse");
        StringBuilder sb = new StringBuilder();
        if (this.team != null) {
            sb.append(", team=");
            sb.append(this.team);
        }
        StringBuilder replace = sb.replace(0, 2, "PutTeamMemberResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PutTeamMemberResponse(Team team2) {
        this(team2, ByteString.EMPTY);
    }

    public PutTeamMemberResponse(Team team2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.team = team2;
    }
}
