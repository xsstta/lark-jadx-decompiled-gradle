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

public final class GetMeetingRoomsInBuildingResponse extends Message<GetMeetingRoomsInBuildingResponse, C15738a> {
    public static final ProtoAdapter<GetMeetingRoomsInBuildingResponse> ADAPTER = new C15739b();
    private static final long serialVersionUID = 0;
    public final Map<String, CalendarResource> resources;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetMeetingRoomsInBuildingResponse$a */
    public static final class C15738a extends Message.Builder<GetMeetingRoomsInBuildingResponse, C15738a> {

        /* renamed from: a */
        public Map<String, CalendarResource> f41503a = Internal.newMutableMap();

        /* renamed from: a */
        public GetMeetingRoomsInBuildingResponse build() {
            return new GetMeetingRoomsInBuildingResponse(this.f41503a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetMeetingRoomsInBuildingResponse$b */
    private static final class C15739b extends ProtoAdapter<GetMeetingRoomsInBuildingResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, CalendarResource>> f41504a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, CalendarResource.ADAPTER);

        C15739b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMeetingRoomsInBuildingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMeetingRoomsInBuildingResponse getMeetingRoomsInBuildingResponse) {
            return this.f41504a.encodedSizeWithTag(1, getMeetingRoomsInBuildingResponse.resources) + getMeetingRoomsInBuildingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetMeetingRoomsInBuildingResponse decode(ProtoReader protoReader) throws IOException {
            C15738a aVar = new C15738a();
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
                    aVar.f41503a.putAll(this.f41504a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMeetingRoomsInBuildingResponse getMeetingRoomsInBuildingResponse) throws IOException {
            this.f41504a.encodeWithTag(protoWriter, 1, getMeetingRoomsInBuildingResponse.resources);
            protoWriter.writeBytes(getMeetingRoomsInBuildingResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15738a newBuilder() {
        C15738a aVar = new C15738a();
        aVar.f41503a = Internal.copyOf("resources", this.resources);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetMeetingRoomsInBuildingResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.resources.isEmpty()) {
            sb.append(", resources=");
            sb.append(this.resources);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMeetingRoomsInBuildingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetMeetingRoomsInBuildingResponse(Map<String, CalendarResource> map) {
        this(map, ByteString.EMPTY);
    }

    public GetMeetingRoomsInBuildingResponse(Map<String, CalendarResource> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resources = Internal.immutableCopyOf("resources", map);
    }
}
