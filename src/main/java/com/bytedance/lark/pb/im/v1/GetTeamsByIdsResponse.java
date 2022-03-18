package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Team;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class GetTeamsByIdsResponse extends Message<GetTeamsByIdsResponse, C17697a> {
    public static final ProtoAdapter<GetTeamsByIdsResponse> ADAPTER = new C17698b();
    private static final long serialVersionUID = 0;
    public final Map<Long, Team> teams;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetTeamsByIdsResponse$a */
    public static final class C17697a extends Message.Builder<GetTeamsByIdsResponse, C17697a> {

        /* renamed from: a */
        public Map<Long, Team> f44716a = Internal.newMutableMap();

        /* renamed from: a */
        public GetTeamsByIdsResponse build() {
            return new GetTeamsByIdsResponse(this.f44716a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetTeamsByIdsResponse$b */
    private static final class C17698b extends ProtoAdapter<GetTeamsByIdsResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<Long, Team>> f44717a = ProtoAdapter.newMapAdapter(ProtoAdapter.INT64, Team.ADAPTER);

        C17698b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTeamsByIdsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTeamsByIdsResponse getTeamsByIdsResponse) {
            return this.f44717a.encodedSizeWithTag(1, getTeamsByIdsResponse.teams) + getTeamsByIdsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetTeamsByIdsResponse decode(ProtoReader protoReader) throws IOException {
            C17697a aVar = new C17697a();
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
                    aVar.f44716a.putAll(this.f44717a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetTeamsByIdsResponse getTeamsByIdsResponse) throws IOException {
            this.f44717a.encodeWithTag(protoWriter, 1, getTeamsByIdsResponse.teams);
            protoWriter.writeBytes(getTeamsByIdsResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17697a newBuilder() {
        C17697a aVar = new C17697a();
        aVar.f44716a = Internal.copyOf("teams", this.teams);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetTeamsByIdsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.teams.isEmpty()) {
            sb.append(", teams=");
            sb.append(this.teams);
        }
        StringBuilder replace = sb.replace(0, 2, "GetTeamsByIdsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetTeamsByIdsResponse(Map<Long, Team> map) {
        this(map, ByteString.EMPTY);
    }

    public GetTeamsByIdsResponse(Map<Long, Team> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.teams = Internal.immutableCopyOf("teams", map);
    }
}
