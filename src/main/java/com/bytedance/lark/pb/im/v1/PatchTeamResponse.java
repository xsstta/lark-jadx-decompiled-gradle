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

public final class PatchTeamResponse extends Message<PatchTeamResponse, C17843a> {
    public static final ProtoAdapter<PatchTeamResponse> ADAPTER = new C17844b();
    private static final long serialVersionUID = 0;
    public final Team team;

    /* renamed from: com.bytedance.lark.pb.im.v1.PatchTeamResponse$b */
    private static final class C17844b extends ProtoAdapter<PatchTeamResponse> {
        C17844b() {
            super(FieldEncoding.LENGTH_DELIMITED, PatchTeamResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PatchTeamResponse patchTeamResponse) {
            int i;
            if (patchTeamResponse.team != null) {
                i = Team.ADAPTER.encodedSizeWithTag(1, patchTeamResponse.team);
            } else {
                i = 0;
            }
            return i + patchTeamResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PatchTeamResponse decode(ProtoReader protoReader) throws IOException {
            C17843a aVar = new C17843a();
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
                    aVar.f44908a = Team.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PatchTeamResponse patchTeamResponse) throws IOException {
            if (patchTeamResponse.team != null) {
                Team.ADAPTER.encodeWithTag(protoWriter, 1, patchTeamResponse.team);
            }
            protoWriter.writeBytes(patchTeamResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PatchTeamResponse$a */
    public static final class C17843a extends Message.Builder<PatchTeamResponse, C17843a> {

        /* renamed from: a */
        public Team f44908a;

        /* renamed from: a */
        public PatchTeamResponse build() {
            return new PatchTeamResponse(this.f44908a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17843a newBuilder() {
        C17843a aVar = new C17843a();
        aVar.f44908a = this.team;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PatchTeamResponse");
        StringBuilder sb = new StringBuilder();
        if (this.team != null) {
            sb.append(", team=");
            sb.append(this.team);
        }
        StringBuilder replace = sb.replace(0, 2, "PatchTeamResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PatchTeamResponse(Team team2) {
        this(team2, ByteString.EMPTY);
    }

    public PatchTeamResponse(Team team2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.team = team2;
    }
}
