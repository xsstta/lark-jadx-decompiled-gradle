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

public final class PushTeams extends Message<PushTeams, C17951a> {
    public static final ProtoAdapter<PushTeams> ADAPTER = new C17952b();
    private static final long serialVersionUID = 0;
    public final Map<Long, Team> teams;

    /* renamed from: com.bytedance.lark.pb.im.v1.PushTeams$a */
    public static final class C17951a extends Message.Builder<PushTeams, C17951a> {

        /* renamed from: a */
        public Map<Long, Team> f45043a = Internal.newMutableMap();

        /* renamed from: a */
        public PushTeams build() {
            return new PushTeams(this.f45043a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushTeams$b */
    private static final class C17952b extends ProtoAdapter<PushTeams> {

        /* renamed from: a */
        private final ProtoAdapter<Map<Long, Team>> f45044a = ProtoAdapter.newMapAdapter(ProtoAdapter.INT64, Team.ADAPTER);

        C17952b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushTeams.class);
        }

        /* renamed from: a */
        public int encodedSize(PushTeams pushTeams) {
            return this.f45044a.encodedSizeWithTag(1, pushTeams.teams) + pushTeams.unknownFields().size();
        }

        /* renamed from: a */
        public PushTeams decode(ProtoReader protoReader) throws IOException {
            C17951a aVar = new C17951a();
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
                    aVar.f45043a.putAll(this.f45044a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushTeams pushTeams) throws IOException {
            this.f45044a.encodeWithTag(protoWriter, 1, pushTeams.teams);
            protoWriter.writeBytes(pushTeams.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17951a newBuilder() {
        C17951a aVar = new C17951a();
        aVar.f45043a = Internal.copyOf("teams", this.teams);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushTeams");
        StringBuilder sb = new StringBuilder();
        if (!this.teams.isEmpty()) {
            sb.append(", teams=");
            sb.append(this.teams);
        }
        StringBuilder replace = sb.replace(0, 2, "PushTeams{");
        replace.append('}');
        return replace.toString();
    }

    public PushTeams(Map<Long, Team> map) {
        this(map, ByteString.EMPTY);
    }

    public PushTeams(Map<Long, Team> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.teams = Internal.immutableCopyOf("teams", map);
    }
}
