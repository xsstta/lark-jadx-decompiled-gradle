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

public final class UpdateRoomViewResourceDataResponse extends Message<UpdateRoomViewResourceDataResponse, C16100a> {
    public static final ProtoAdapter<UpdateRoomViewResourceDataResponse> ADAPTER = new C16101b();
    private static final long serialVersionUID = 0;
    public final Map<String, CalendarBuilding> buildings;
    public final Map<String, CalendarResource> resources;
    public final RoomViewFilterConfigs room_view_filter_configs;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.UpdateRoomViewResourceDataResponse$a */
    public static final class C16100a extends Message.Builder<UpdateRoomViewResourceDataResponse, C16100a> {

        /* renamed from: a */
        public RoomViewFilterConfigs f42183a;

        /* renamed from: b */
        public Map<String, CalendarResource> f42184b = Internal.newMutableMap();

        /* renamed from: c */
        public Map<String, CalendarBuilding> f42185c = Internal.newMutableMap();

        /* renamed from: a */
        public UpdateRoomViewResourceDataResponse build() {
            return new UpdateRoomViewResourceDataResponse(this.f42183a, this.f42184b, this.f42185c, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.UpdateRoomViewResourceDataResponse$b */
    private static final class C16101b extends ProtoAdapter<UpdateRoomViewResourceDataResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, CalendarResource>> f42186a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, CalendarResource.ADAPTER);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, CalendarBuilding>> f42187b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, CalendarBuilding.ADAPTER);

        C16101b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateRoomViewResourceDataResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateRoomViewResourceDataResponse updateRoomViewResourceDataResponse) {
            int i;
            if (updateRoomViewResourceDataResponse.room_view_filter_configs != null) {
                i = RoomViewFilterConfigs.ADAPTER.encodedSizeWithTag(1, updateRoomViewResourceDataResponse.room_view_filter_configs);
            } else {
                i = 0;
            }
            return i + this.f42186a.encodedSizeWithTag(2, updateRoomViewResourceDataResponse.resources) + this.f42187b.encodedSizeWithTag(3, updateRoomViewResourceDataResponse.buildings) + updateRoomViewResourceDataResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateRoomViewResourceDataResponse decode(ProtoReader protoReader) throws IOException {
            C16100a aVar = new C16100a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42183a = RoomViewFilterConfigs.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42184b.putAll(this.f42186a.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42185c.putAll(this.f42187b.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateRoomViewResourceDataResponse updateRoomViewResourceDataResponse) throws IOException {
            if (updateRoomViewResourceDataResponse.room_view_filter_configs != null) {
                RoomViewFilterConfigs.ADAPTER.encodeWithTag(protoWriter, 1, updateRoomViewResourceDataResponse.room_view_filter_configs);
            }
            this.f42186a.encodeWithTag(protoWriter, 2, updateRoomViewResourceDataResponse.resources);
            this.f42187b.encodeWithTag(protoWriter, 3, updateRoomViewResourceDataResponse.buildings);
            protoWriter.writeBytes(updateRoomViewResourceDataResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16100a newBuilder() {
        C16100a aVar = new C16100a();
        aVar.f42183a = this.room_view_filter_configs;
        aVar.f42184b = Internal.copyOf("resources", this.resources);
        aVar.f42185c = Internal.copyOf("buildings", this.buildings);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "UpdateRoomViewResourceDataResponse");
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
        StringBuilder replace = sb.replace(0, 2, "UpdateRoomViewResourceDataResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateRoomViewResourceDataResponse(RoomViewFilterConfigs roomViewFilterConfigs, Map<String, CalendarResource> map, Map<String, CalendarBuilding> map2) {
        this(roomViewFilterConfigs, map, map2, ByteString.EMPTY);
    }

    public UpdateRoomViewResourceDataResponse(RoomViewFilterConfigs roomViewFilterConfigs, Map<String, CalendarResource> map, Map<String, CalendarBuilding> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.room_view_filter_configs = roomViewFilterConfigs;
        this.resources = Internal.immutableCopyOf("resources", map);
        this.buildings = Internal.immutableCopyOf("buildings", map2);
    }
}
