package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class PullEventGroupsSimpleMembersResponse extends Message<PullEventGroupsSimpleMembersResponse, C15932a> {
    public static final ProtoAdapter<PullEventGroupsSimpleMembersResponse> ADAPTER = new C15933b();
    private static final long serialVersionUID = 0;
    public final Map<String, SimpleMembers> group_members;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PullEventGroupsSimpleMembersResponse$a */
    public static final class C15932a extends Message.Builder<PullEventGroupsSimpleMembersResponse, C15932a> {

        /* renamed from: a */
        public Map<String, SimpleMembers> f41908a = Internal.newMutableMap();

        /* renamed from: a */
        public PullEventGroupsSimpleMembersResponse build() {
            return new PullEventGroupsSimpleMembersResponse(this.f41908a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PullEventGroupsSimpleMembersResponse$b */
    private static final class C15933b extends ProtoAdapter<PullEventGroupsSimpleMembersResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, SimpleMembers>> f41909a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SimpleMembers.ADAPTER);

        C15933b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullEventGroupsSimpleMembersResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullEventGroupsSimpleMembersResponse pullEventGroupsSimpleMembersResponse) {
            return this.f41909a.encodedSizeWithTag(1, pullEventGroupsSimpleMembersResponse.group_members) + pullEventGroupsSimpleMembersResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullEventGroupsSimpleMembersResponse decode(ProtoReader protoReader) throws IOException {
            C15932a aVar = new C15932a();
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
                    aVar.f41908a.putAll(this.f41909a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullEventGroupsSimpleMembersResponse pullEventGroupsSimpleMembersResponse) throws IOException {
            this.f41909a.encodeWithTag(protoWriter, 1, pullEventGroupsSimpleMembersResponse.group_members);
            protoWriter.writeBytes(pullEventGroupsSimpleMembersResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15932a newBuilder() {
        C15932a aVar = new C15932a();
        aVar.f41908a = Internal.copyOf("group_members", this.group_members);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "PullEventGroupsSimpleMembersResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.group_members.isEmpty()) {
            sb.append(", group_members=");
            sb.append(this.group_members);
        }
        StringBuilder replace = sb.replace(0, 2, "PullEventGroupsSimpleMembersResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullEventGroupsSimpleMembersResponse(Map<String, SimpleMembers> map) {
        this(map, ByteString.EMPTY);
    }

    public PullEventGroupsSimpleMembersResponse(Map<String, SimpleMembers> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.group_members = Internal.immutableCopyOf("group_members", map);
    }
}
