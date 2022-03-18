package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetTeamsByIdsRequest extends Message<GetTeamsByIdsRequest, C17695a> {
    public static final ProtoAdapter<GetTeamsByIdsRequest> ADAPTER = new C17696b();
    public static final SyncDataStrategy DEFAULT_STRATEGY = SyncDataStrategy.TRY_LOCAL;
    private static final long serialVersionUID = 0;
    public final SyncDataStrategy strategy;
    public final List<Long> team_ids;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetTeamsByIdsRequest$b */
    private static final class C17696b extends ProtoAdapter<GetTeamsByIdsRequest> {
        C17696b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTeamsByIdsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTeamsByIdsRequest getTeamsByIdsRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(1, getTeamsByIdsRequest.team_ids);
            if (getTeamsByIdsRequest.strategy != null) {
                i = SyncDataStrategy.ADAPTER.encodedSizeWithTag(2, getTeamsByIdsRequest.strategy);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getTeamsByIdsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetTeamsByIdsRequest decode(ProtoReader protoReader) throws IOException {
            C17695a aVar = new C17695a();
            aVar.f44715b = SyncDataStrategy.TRY_LOCAL;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44714a.add(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f44715b = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetTeamsByIdsRequest getTeamsByIdsRequest) throws IOException {
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 1, getTeamsByIdsRequest.team_ids);
            if (getTeamsByIdsRequest.strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 2, getTeamsByIdsRequest.strategy);
            }
            protoWriter.writeBytes(getTeamsByIdsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetTeamsByIdsRequest$a */
    public static final class C17695a extends Message.Builder<GetTeamsByIdsRequest, C17695a> {

        /* renamed from: a */
        public List<Long> f44714a = Internal.newMutableList();

        /* renamed from: b */
        public SyncDataStrategy f44715b;

        /* renamed from: a */
        public GetTeamsByIdsRequest build() {
            return new GetTeamsByIdsRequest(this.f44714a, this.f44715b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17695a mo61808a(SyncDataStrategy syncDataStrategy) {
            this.f44715b = syncDataStrategy;
            return this;
        }

        /* renamed from: a */
        public C17695a mo61809a(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.f44714a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17695a newBuilder() {
        C17695a aVar = new C17695a();
        aVar.f44714a = Internal.copyOf("team_ids", this.team_ids);
        aVar.f44715b = this.strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetTeamsByIdsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.team_ids.isEmpty()) {
            sb.append(", team_ids=");
            sb.append(this.team_ids);
        }
        if (this.strategy != null) {
            sb.append(", strategy=");
            sb.append(this.strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetTeamsByIdsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetTeamsByIdsRequest(List<Long> list, SyncDataStrategy syncDataStrategy) {
        this(list, syncDataStrategy, ByteString.EMPTY);
    }

    public GetTeamsByIdsRequest(List<Long> list, SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.team_ids = Internal.immutableCopyOf("team_ids", list);
        this.strategy = syncDataStrategy;
    }
}
