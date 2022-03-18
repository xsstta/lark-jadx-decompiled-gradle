package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.PickEntities;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PutTeamMemberRequest extends Message<PutTeamMemberRequest, C17983a> {
    public static final ProtoAdapter<PutTeamMemberRequest> ADAPTER = new C17984b();
    public static final Long DEFAULT_TEAM_ID = 0L;
    private static final long serialVersionUID = 0;
    public final List<PickEntities> pick_entities;
    public final Long team_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.PutTeamMemberRequest$b */
    private static final class C17984b extends ProtoAdapter<PutTeamMemberRequest> {
        C17984b() {
            super(FieldEncoding.LENGTH_DELIMITED, PutTeamMemberRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PutTeamMemberRequest putTeamMemberRequest) {
            int i;
            if (putTeamMemberRequest.team_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, putTeamMemberRequest.team_id);
            } else {
                i = 0;
            }
            return i + PickEntities.ADAPTER.asRepeated().encodedSizeWithTag(2, putTeamMemberRequest.pick_entities) + putTeamMemberRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PutTeamMemberRequest decode(ProtoReader protoReader) throws IOException {
            C17983a aVar = new C17983a();
            aVar.f45078a = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45078a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45079b.add(PickEntities.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PutTeamMemberRequest putTeamMemberRequest) throws IOException {
            if (putTeamMemberRequest.team_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, putTeamMemberRequest.team_id);
            }
            PickEntities.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, putTeamMemberRequest.pick_entities);
            protoWriter.writeBytes(putTeamMemberRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PutTeamMemberRequest$a */
    public static final class C17983a extends Message.Builder<PutTeamMemberRequest, C17983a> {

        /* renamed from: a */
        public Long f45078a;

        /* renamed from: b */
        public List<PickEntities> f45079b = Internal.newMutableList();

        /* renamed from: a */
        public PutTeamMemberRequest build() {
            return new PutTeamMemberRequest(this.f45078a, this.f45079b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17983a mo62491a(Long l) {
            this.f45078a = l;
            return this;
        }

        /* renamed from: a */
        public C17983a mo62492a(List<PickEntities> list) {
            Internal.checkElementsNotNull(list);
            this.f45079b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17983a newBuilder() {
        C17983a aVar = new C17983a();
        aVar.f45078a = this.team_id;
        aVar.f45079b = Internal.copyOf("pick_entities", this.pick_entities);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PutTeamMemberRequest");
        StringBuilder sb = new StringBuilder();
        if (this.team_id != null) {
            sb.append(", team_id=");
            sb.append(this.team_id);
        }
        if (!this.pick_entities.isEmpty()) {
            sb.append(", pick_entities=");
            sb.append(this.pick_entities);
        }
        StringBuilder replace = sb.replace(0, 2, "PutTeamMemberRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PutTeamMemberRequest(Long l, List<PickEntities> list) {
        this(l, list, ByteString.EMPTY);
    }

    public PutTeamMemberRequest(Long l, List<PickEntities> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.team_id = l;
        this.pick_entities = Internal.immutableCopyOf("pick_entities", list);
    }
}
