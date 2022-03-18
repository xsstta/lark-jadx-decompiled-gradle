package com.bytedance.lark.pb.calendar.v1;

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

public final class RoomViewFilterConfigs extends Message<RoomViewFilterConfigs, C15984a> {
    public static final ProtoAdapter<RoomViewFilterConfigs> ADAPTER = new C15985b();
    private static final long serialVersionUID = 0;
    public final MeetingRoomFilter meeting_room_filter;
    public final List<BuildingFloorFilter> needed_building_floors;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.RoomViewFilterConfigs$b */
    private static final class C15985b extends ProtoAdapter<RoomViewFilterConfigs> {
        C15985b() {
            super(FieldEncoding.LENGTH_DELIMITED, RoomViewFilterConfigs.class);
        }

        /* renamed from: a */
        public int encodedSize(RoomViewFilterConfigs roomViewFilterConfigs) {
            int i;
            int encodedSizeWithTag = BuildingFloorFilter.ADAPTER.asRepeated().encodedSizeWithTag(1, roomViewFilterConfigs.needed_building_floors);
            if (roomViewFilterConfigs.meeting_room_filter != null) {
                i = MeetingRoomFilter.ADAPTER.encodedSizeWithTag(2, roomViewFilterConfigs.meeting_room_filter);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + roomViewFilterConfigs.unknownFields().size();
        }

        /* renamed from: a */
        public RoomViewFilterConfigs decode(ProtoReader protoReader) throws IOException {
            C15984a aVar = new C15984a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41983a.add(BuildingFloorFilter.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41984b = MeetingRoomFilter.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, RoomViewFilterConfigs roomViewFilterConfigs) throws IOException {
            BuildingFloorFilter.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, roomViewFilterConfigs.needed_building_floors);
            if (roomViewFilterConfigs.meeting_room_filter != null) {
                MeetingRoomFilter.ADAPTER.encodeWithTag(protoWriter, 2, roomViewFilterConfigs.meeting_room_filter);
            }
            protoWriter.writeBytes(roomViewFilterConfigs.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.RoomViewFilterConfigs$a */
    public static final class C15984a extends Message.Builder<RoomViewFilterConfigs, C15984a> {

        /* renamed from: a */
        public List<BuildingFloorFilter> f41983a = Internal.newMutableList();

        /* renamed from: b */
        public MeetingRoomFilter f41984b;

        /* renamed from: a */
        public RoomViewFilterConfigs build() {
            return new RoomViewFilterConfigs(this.f41983a, this.f41984b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15984a mo57537a(MeetingRoomFilter meetingRoomFilter) {
            this.f41984b = meetingRoomFilter;
            return this;
        }

        /* renamed from: a */
        public C15984a mo57538a(List<BuildingFloorFilter> list) {
            Internal.checkElementsNotNull(list);
            this.f41983a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15984a newBuilder() {
        C15984a aVar = new C15984a();
        aVar.f41983a = Internal.copyOf("needed_building_floors", this.needed_building_floors);
        aVar.f41984b = this.meeting_room_filter;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "RoomViewFilterConfigs");
        StringBuilder sb = new StringBuilder();
        if (!this.needed_building_floors.isEmpty()) {
            sb.append(", needed_building_floors=");
            sb.append(this.needed_building_floors);
        }
        if (this.meeting_room_filter != null) {
            sb.append(", meeting_room_filter=");
            sb.append(this.meeting_room_filter);
        }
        StringBuilder replace = sb.replace(0, 2, "RoomViewFilterConfigs{");
        replace.append('}');
        return replace.toString();
    }

    public RoomViewFilterConfigs(List<BuildingFloorFilter> list, MeetingRoomFilter meetingRoomFilter) {
        this(list, meetingRoomFilter, ByteString.EMPTY);
    }

    public RoomViewFilterConfigs(List<BuildingFloorFilter> list, MeetingRoomFilter meetingRoomFilter, ByteString byteString) {
        super(ADAPTER, byteString);
        this.needed_building_floors = Internal.immutableCopyOf("needed_building_floors", list);
        this.meeting_room_filter = meetingRoomFilter;
    }
}
