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

public final class GetMeetingRoomsInBuildingRequest extends Message<GetMeetingRoomsInBuildingRequest, C15736a> {
    public static final ProtoAdapter<GetMeetingRoomsInBuildingRequest> ADAPTER = new C15737b();
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Boolean DEFAULT_NEED_DISABLED_RESOURCE = false;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final List<String> building_ids;
    public final Long end_time;
    public final MeetingRoomFilter meeting_room_filter;
    public final Boolean need_disabled_resource;
    public final List<BuildingFloorFilter> needed_building_floors;
    public final String rrule;
    public final Long start_time;
    public final String start_timezone;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetMeetingRoomsInBuildingRequest$b */
    private static final class C15737b extends ProtoAdapter<GetMeetingRoomsInBuildingRequest> {
        C15737b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMeetingRoomsInBuildingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMeetingRoomsInBuildingRequest getMeetingRoomsInBuildingRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (getMeetingRoomsInBuildingRequest.start_time != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, getMeetingRoomsInBuildingRequest.start_time);
            } else {
                i = 0;
            }
            if (getMeetingRoomsInBuildingRequest.end_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, getMeetingRoomsInBuildingRequest.end_time);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag = i + i2 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, getMeetingRoomsInBuildingRequest.building_ids);
            if (getMeetingRoomsInBuildingRequest.rrule != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, getMeetingRoomsInBuildingRequest.rrule);
            } else {
                i3 = 0;
            }
            int i7 = encodedSizeWithTag + i3;
            if (getMeetingRoomsInBuildingRequest.need_disabled_resource != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(5, getMeetingRoomsInBuildingRequest.need_disabled_resource);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (getMeetingRoomsInBuildingRequest.start_timezone != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, getMeetingRoomsInBuildingRequest.start_timezone);
            } else {
                i5 = 0;
            }
            int i9 = i8 + i5;
            if (getMeetingRoomsInBuildingRequest.meeting_room_filter != null) {
                i6 = MeetingRoomFilter.ADAPTER.encodedSizeWithTag(7, getMeetingRoomsInBuildingRequest.meeting_room_filter);
            }
            return i9 + i6 + BuildingFloorFilter.ADAPTER.asRepeated().encodedSizeWithTag(8, getMeetingRoomsInBuildingRequest.needed_building_floors) + getMeetingRoomsInBuildingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetMeetingRoomsInBuildingRequest decode(ProtoReader protoReader) throws IOException {
            C15736a aVar = new C15736a();
            aVar.f41495a = 0L;
            aVar.f41496b = 0L;
            aVar.f41498d = "";
            aVar.f41499e = false;
            aVar.f41500f = "UTC";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41495a = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            aVar.f41496b = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            aVar.f41497c.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            aVar.f41498d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f41499e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f41500f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f41501g = MeetingRoomFilter.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            aVar.f41502h.add(BuildingFloorFilter.ADAPTER.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMeetingRoomsInBuildingRequest getMeetingRoomsInBuildingRequest) throws IOException {
            if (getMeetingRoomsInBuildingRequest.start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getMeetingRoomsInBuildingRequest.start_time);
            }
            if (getMeetingRoomsInBuildingRequest.end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getMeetingRoomsInBuildingRequest.end_time);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, getMeetingRoomsInBuildingRequest.building_ids);
            if (getMeetingRoomsInBuildingRequest.rrule != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getMeetingRoomsInBuildingRequest.rrule);
            }
            if (getMeetingRoomsInBuildingRequest.need_disabled_resource != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, getMeetingRoomsInBuildingRequest.need_disabled_resource);
            }
            if (getMeetingRoomsInBuildingRequest.start_timezone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, getMeetingRoomsInBuildingRequest.start_timezone);
            }
            if (getMeetingRoomsInBuildingRequest.meeting_room_filter != null) {
                MeetingRoomFilter.ADAPTER.encodeWithTag(protoWriter, 7, getMeetingRoomsInBuildingRequest.meeting_room_filter);
            }
            BuildingFloorFilter.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, getMeetingRoomsInBuildingRequest.needed_building_floors);
            protoWriter.writeBytes(getMeetingRoomsInBuildingRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15736a newBuilder() {
        C15736a aVar = new C15736a();
        aVar.f41495a = this.start_time;
        aVar.f41496b = this.end_time;
        aVar.f41497c = Internal.copyOf("building_ids", this.building_ids);
        aVar.f41498d = this.rrule;
        aVar.f41499e = this.need_disabled_resource;
        aVar.f41500f = this.start_timezone;
        aVar.f41501g = this.meeting_room_filter;
        aVar.f41502h = Internal.copyOf("needed_building_floors", this.needed_building_floors);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetMeetingRoomsInBuildingRequest$a */
    public static final class C15736a extends Message.Builder<GetMeetingRoomsInBuildingRequest, C15736a> {

        /* renamed from: a */
        public Long f41495a;

        /* renamed from: b */
        public Long f41496b;

        /* renamed from: c */
        public List<String> f41497c = Internal.newMutableList();

        /* renamed from: d */
        public String f41498d;

        /* renamed from: e */
        public Boolean f41499e;

        /* renamed from: f */
        public String f41500f;

        /* renamed from: g */
        public MeetingRoomFilter f41501g;

        /* renamed from: h */
        public List<BuildingFloorFilter> f41502h = Internal.newMutableList();

        /* renamed from: a */
        public GetMeetingRoomsInBuildingRequest build() {
            return new GetMeetingRoomsInBuildingRequest(this.f41495a, this.f41496b, this.f41497c, this.f41498d, this.f41499e, this.f41500f, this.f41501g, this.f41502h, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15736a mo56903a(MeetingRoomFilter meetingRoomFilter) {
            this.f41501g = meetingRoomFilter;
            return this;
        }

        /* renamed from: b */
        public C15736a mo56909b(Long l) {
            this.f41496b = l;
            return this;
        }

        /* renamed from: a */
        public C15736a mo56904a(Boolean bool) {
            this.f41499e = bool;
            return this;
        }

        /* renamed from: a */
        public C15736a mo56905a(Long l) {
            this.f41495a = l;
            return this;
        }

        /* renamed from: a */
        public C15736a mo56906a(String str) {
            this.f41498d = str;
            return this;
        }

        /* renamed from: a */
        public C15736a mo56907a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f41497c = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetMeetingRoomsInBuildingRequest");
        StringBuilder sb = new StringBuilder();
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        if (this.end_time != null) {
            sb.append(", end_time=");
            sb.append(this.end_time);
        }
        if (!this.building_ids.isEmpty()) {
            sb.append(", building_ids=");
            sb.append(this.building_ids);
        }
        if (this.rrule != null) {
            sb.append(", rrule=");
            sb.append(this.rrule);
        }
        if (this.need_disabled_resource != null) {
            sb.append(", need_disabled_resource=");
            sb.append(this.need_disabled_resource);
        }
        if (this.start_timezone != null) {
            sb.append(", start_timezone=");
            sb.append(this.start_timezone);
        }
        if (this.meeting_room_filter != null) {
            sb.append(", meeting_room_filter=");
            sb.append(this.meeting_room_filter);
        }
        if (!this.needed_building_floors.isEmpty()) {
            sb.append(", needed_building_floors=");
            sb.append(this.needed_building_floors);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMeetingRoomsInBuildingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetMeetingRoomsInBuildingRequest(Long l, Long l2, List<String> list, String str, Boolean bool, String str2, MeetingRoomFilter meetingRoomFilter, List<BuildingFloorFilter> list2) {
        this(l, l2, list, str, bool, str2, meetingRoomFilter, list2, ByteString.EMPTY);
    }

    public GetMeetingRoomsInBuildingRequest(Long l, Long l2, List<String> list, String str, Boolean bool, String str2, MeetingRoomFilter meetingRoomFilter, List<BuildingFloorFilter> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.start_time = l;
        this.end_time = l2;
        this.building_ids = Internal.immutableCopyOf("building_ids", list);
        this.rrule = str;
        this.need_disabled_resource = bool;
        this.start_timezone = str2;
        this.meeting_room_filter = meetingRoomFilter;
        this.needed_building_floors = Internal.immutableCopyOf("needed_building_floors", list2);
    }
}
