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

public final class PatchTeamSettingResponse extends Message<PatchTeamSettingResponse, C17847a> {
    public static final ProtoAdapter<PatchTeamSettingResponse> ADAPTER = new C17848b();
    private static final long serialVersionUID = 0;
    public final Team team;

    /* renamed from: com.bytedance.lark.pb.im.v1.PatchTeamSettingResponse$b */
    private static final class C17848b extends ProtoAdapter<PatchTeamSettingResponse> {
        C17848b() {
            super(FieldEncoding.LENGTH_DELIMITED, PatchTeamSettingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PatchTeamSettingResponse patchTeamSettingResponse) {
            int i;
            if (patchTeamSettingResponse.team != null) {
                i = Team.ADAPTER.encodedSizeWithTag(1, patchTeamSettingResponse.team);
            } else {
                i = 0;
            }
            return i + patchTeamSettingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PatchTeamSettingResponse decode(ProtoReader protoReader) throws IOException {
            C17847a aVar = new C17847a();
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
                    aVar.f44914a = Team.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PatchTeamSettingResponse patchTeamSettingResponse) throws IOException {
            if (patchTeamSettingResponse.team != null) {
                Team.ADAPTER.encodeWithTag(protoWriter, 1, patchTeamSettingResponse.team);
            }
            protoWriter.writeBytes(patchTeamSettingResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PatchTeamSettingResponse$a */
    public static final class C17847a extends Message.Builder<PatchTeamSettingResponse, C17847a> {

        /* renamed from: a */
        public Team f44914a;

        /* renamed from: a */
        public PatchTeamSettingResponse build() {
            return new PatchTeamSettingResponse(this.f44914a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17847a newBuilder() {
        C17847a aVar = new C17847a();
        aVar.f44914a = this.team;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PatchTeamSettingResponse");
        StringBuilder sb = new StringBuilder();
        if (this.team != null) {
            sb.append(", team=");
            sb.append(this.team);
        }
        StringBuilder replace = sb.replace(0, 2, "PatchTeamSettingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PatchTeamSettingResponse(Team team2) {
        this(team2, ByteString.EMPTY);
    }

    public PatchTeamSettingResponse(Team team2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.team = team2;
    }
}
