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

public final class PullAllMeetingRoomsInTenantResponse extends Message<PullAllMeetingRoomsInTenantResponse, C15914a> {
    public static final ProtoAdapter<PullAllMeetingRoomsInTenantResponse> ADAPTER = new C15915b();
    private static final long serialVersionUID = 0;
    public final Map<String, CalendarResource> resources;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PullAllMeetingRoomsInTenantResponse$a */
    public static final class C15914a extends Message.Builder<PullAllMeetingRoomsInTenantResponse, C15914a> {

        /* renamed from: a */
        public Map<String, CalendarResource> f41874a = Internal.newMutableMap();

        /* renamed from: a */
        public PullAllMeetingRoomsInTenantResponse build() {
            return new PullAllMeetingRoomsInTenantResponse(this.f41874a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PullAllMeetingRoomsInTenantResponse$b */
    private static final class C15915b extends ProtoAdapter<PullAllMeetingRoomsInTenantResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, CalendarResource>> f41875a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, CalendarResource.ADAPTER);

        C15915b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullAllMeetingRoomsInTenantResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullAllMeetingRoomsInTenantResponse pullAllMeetingRoomsInTenantResponse) {
            return this.f41875a.encodedSizeWithTag(1, pullAllMeetingRoomsInTenantResponse.resources) + pullAllMeetingRoomsInTenantResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullAllMeetingRoomsInTenantResponse decode(ProtoReader protoReader) throws IOException {
            C15914a aVar = new C15914a();
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
                    aVar.f41874a.putAll(this.f41875a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullAllMeetingRoomsInTenantResponse pullAllMeetingRoomsInTenantResponse) throws IOException {
            this.f41875a.encodeWithTag(protoWriter, 1, pullAllMeetingRoomsInTenantResponse.resources);
            protoWriter.writeBytes(pullAllMeetingRoomsInTenantResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15914a newBuilder() {
        C15914a aVar = new C15914a();
        aVar.f41874a = Internal.copyOf("resources", this.resources);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "PullAllMeetingRoomsInTenantResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.resources.isEmpty()) {
            sb.append(", resources=");
            sb.append(this.resources);
        }
        StringBuilder replace = sb.replace(0, 2, "PullAllMeetingRoomsInTenantResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullAllMeetingRoomsInTenantResponse(Map<String, CalendarResource> map) {
        this(map, ByteString.EMPTY);
    }

    public PullAllMeetingRoomsInTenantResponse(Map<String, CalendarResource> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resources = Internal.immutableCopyOf("resources", map);
    }
}
