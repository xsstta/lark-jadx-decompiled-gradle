package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class DeleteTeamMemberRequest extends Message<DeleteTeamMemberRequest, C17430a> {
    public static final ProtoAdapter<DeleteTeamMemberRequest> ADAPTER = new C17431b();
    public static final Long DEFAULT_NEW_OWNER_ID = 0L;
    public static final Long DEFAULT_TEAM_ID = 0L;
    private static final long serialVersionUID = 0;
    public final List<Long> chatter_ids;
    public final Long new_owner_id;
    public final Long team_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteTeamMemberRequest$b */
    private static final class C17431b extends ProtoAdapter<DeleteTeamMemberRequest> {
        C17431b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteTeamMemberRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteTeamMemberRequest deleteTeamMemberRequest) {
            int i;
            int i2 = 0;
            if (deleteTeamMemberRequest.team_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, deleteTeamMemberRequest.team_id);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(2, deleteTeamMemberRequest.chatter_ids);
            if (deleteTeamMemberRequest.new_owner_id != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, deleteTeamMemberRequest.new_owner_id);
            }
            return encodedSizeWithTag + i2 + deleteTeamMemberRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteTeamMemberRequest decode(ProtoReader protoReader) throws IOException {
            C17430a aVar = new C17430a();
            aVar.f44327a = 0L;
            aVar.f44329c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44327a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44328b.add(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44329c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteTeamMemberRequest deleteTeamMemberRequest) throws IOException {
            if (deleteTeamMemberRequest.team_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, deleteTeamMemberRequest.team_id);
            }
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 2, deleteTeamMemberRequest.chatter_ids);
            if (deleteTeamMemberRequest.new_owner_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, deleteTeamMemberRequest.new_owner_id);
            }
            protoWriter.writeBytes(deleteTeamMemberRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteTeamMemberRequest$a */
    public static final class C17430a extends Message.Builder<DeleteTeamMemberRequest, C17430a> {

        /* renamed from: a */
        public Long f44327a;

        /* renamed from: b */
        public List<Long> f44328b = Internal.newMutableList();

        /* renamed from: c */
        public Long f44329c;

        /* renamed from: a */
        public DeleteTeamMemberRequest build() {
            return new DeleteTeamMemberRequest(this.f44327a, this.f44328b, this.f44329c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17430a mo61138a(Long l) {
            this.f44327a = l;
            return this;
        }

        /* renamed from: a */
        public C17430a mo61139a(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.f44328b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17430a newBuilder() {
        C17430a aVar = new C17430a();
        aVar.f44327a = this.team_id;
        aVar.f44328b = Internal.copyOf("chatter_ids", this.chatter_ids);
        aVar.f44329c = this.new_owner_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "DeleteTeamMemberRequest");
        StringBuilder sb = new StringBuilder();
        if (this.team_id != null) {
            sb.append(", team_id=");
            sb.append(this.team_id);
        }
        if (!this.chatter_ids.isEmpty()) {
            sb.append(", chatter_ids=");
            sb.append(this.chatter_ids);
        }
        if (this.new_owner_id != null) {
            sb.append(", new_owner_id=");
            sb.append(this.new_owner_id);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteTeamMemberRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteTeamMemberRequest(Long l, List<Long> list, Long l2) {
        this(l, list, l2, ByteString.EMPTY);
    }

    public DeleteTeamMemberRequest(Long l, List<Long> list, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.team_id = l;
        this.chatter_ids = Internal.immutableCopyOf("chatter_ids", list);
        this.new_owner_id = l2;
    }
}
