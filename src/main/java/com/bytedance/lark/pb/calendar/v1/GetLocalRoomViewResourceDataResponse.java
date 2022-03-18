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

public final class GetLocalRoomViewResourceDataResponse extends Message<GetLocalRoomViewResourceDataResponse, C15726a> {
    public static final ProtoAdapter<GetLocalRoomViewResourceDataResponse> ADAPTER = new C15727b();
    private static final long serialVersionUID = 0;
    public final Map<String, CalendarBuilding> buildings;
    public final Map<String, CalendarResource> resources;
    public final RoomViewFilterConfigs room_view_filter_configs;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetLocalRoomViewResourceDataResponse$a */
    public static final class C15726a extends Message.Builder<GetLocalRoomViewResourceDataResponse, C15726a> {

        /* renamed from: a */
        public RoomViewFilterConfigs f41482a;

        /* renamed from: b */
        public Map<String, CalendarResource> f41483b = Internal.newMutableMap();

        /* renamed from: c */
        public Map<String, CalendarBuilding> f41484c = Internal.newMutableMap();

        /* renamed from: a */
        public GetLocalRoomViewResourceDataResponse build() {
            return new GetLocalRoomViewResourceDataResponse(this.f41482a, this.f41483b, this.f41484c, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetLocalRoomViewResourceDataResponse$b */
    private static final class C15727b extends ProtoAdapter<GetLocalRoomViewResourceDataResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, CalendarResource>> f41485a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, CalendarResource.ADAPTER);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, CalendarBuilding>> f41486b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, CalendarBuilding.ADAPTER);

        C15727b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetLocalRoomViewResourceDataResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetLocalRoomViewResourceDataResponse getLocalRoomViewResourceDataResponse) {
            int i;
            if (getLocalRoomViewResourceDataResponse.room_view_filter_configs != null) {
                i = RoomViewFilterConfigs.ADAPTER.encodedSizeWithTag(1, getLocalRoomViewResourceDataResponse.room_view_filter_configs);
            } else {
                i = 0;
            }
            return i + this.f41485a.encodedSizeWithTag(2, getLocalRoomViewResourceDataResponse.resources) + this.f41486b.encodedSizeWithTag(3, getLocalRoomViewResourceDataResponse.buildings) + getLocalRoomViewResourceDataResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetLocalRoomViewResourceDataResponse decode(ProtoReader protoReader) throws IOException {
            C15726a aVar = new C15726a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41482a = RoomViewFilterConfigs.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41483b.putAll(this.f41485a.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41484c.putAll(this.f41486b.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetLocalRoomViewResourceDataResponse getLocalRoomViewResourceDataResponse) throws IOException {
            if (getLocalRoomViewResourceDataResponse.room_view_filter_configs != null) {
                RoomViewFilterConfigs.ADAPTER.encodeWithTag(protoWriter, 1, getLocalRoomViewResourceDataResponse.room_view_filter_configs);
            }
            this.f41485a.encodeWithTag(protoWriter, 2, getLocalRoomViewResourceDataResponse.resources);
            this.f41486b.encodeWithTag(protoWriter, 3, getLocalRoomViewResourceDataResponse.buildings);
            protoWriter.writeBytes(getLocalRoomViewResourceDataResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15726a newBuilder() {
        C15726a aVar = new C15726a();
        aVar.f41482a = this.room_view_filter_configs;
        aVar.f41483b = Internal.copyOf("resources", this.resources);
        aVar.f41484c = Internal.copyOf("buildings", this.buildings);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetLocalRoomViewResourceDataResponse");
        StringBuilder sb = new StringBuilder();
        if (this.room_view_filter_configs != null) {
            sb.append(", room_view_filter_configs=");
            sb.append(this.room_view_filter_configs);
        }
        if (!this.resources.isEmpty()) {
            sb.append(", resources=");
            sb.append(this.resources);
        }
        if (!this.buildings.isEmpty()) {
            sb.append(", buildings=");
            sb.append(this.buildings);
        }
        StringBuilder replace = sb.replace(0, 2, "GetLocalRoomViewResourceDataResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetLocalRoomViewResourceDataResponse(RoomViewFilterConfigs roomViewFilterConfigs, Map<String, CalendarResource> map, Map<String, CalendarBuilding> map2) {
        this(roomViewFilterConfigs, map, map2, ByteString.EMPTY);
    }

    public GetLocalRoomViewResourceDataResponse(RoomViewFilterConfigs roomViewFilterConfigs, Map<String, CalendarResource> map, Map<String, CalendarBuilding> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.room_view_filter_configs = roomViewFilterConfigs;
        this.resources = Internal.immutableCopyOf("resources", map);
        this.buildings = Internal.immutableCopyOf("buildings", map2);
    }
}
