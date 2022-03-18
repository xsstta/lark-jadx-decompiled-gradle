package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SearchMeetingRoomsRequest extends Message<SearchMeetingRoomsRequest, C16028a> {
    public static final ProtoAdapter<SearchMeetingRoomsRequest> ADAPTER = new C16029b();
    public static final Integer DEFAULT_COUNT = 40;
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Boolean DEFAULT_NEED_DISABLED_RESOURCE = false;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final Long end_time;
    public final String keywords;
    public final MeetingRoomFilter meeting_room_filter;
    public final Boolean need_disabled_resource;
    public final String rrule;
    public final Long start_time;
    public final String start_timezone;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SearchMeetingRoomsRequest$b */
    private static final class C16029b extends ProtoAdapter<SearchMeetingRoomsRequest> {
        C16029b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchMeetingRoomsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchMeetingRoomsRequest searchMeetingRoomsRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8 = 0;
            if (searchMeetingRoomsRequest.start_time != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, searchMeetingRoomsRequest.start_time);
            } else {
                i = 0;
            }
            if (searchMeetingRoomsRequest.end_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, searchMeetingRoomsRequest.end_time);
            } else {
                i2 = 0;
            }
            int i9 = i + i2;
            if (searchMeetingRoomsRequest.keywords != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, searchMeetingRoomsRequest.keywords);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (searchMeetingRoomsRequest.count != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(4, searchMeetingRoomsRequest.count);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (searchMeetingRoomsRequest.rrule != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, searchMeetingRoomsRequest.rrule);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (searchMeetingRoomsRequest.need_disabled_resource != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, searchMeetingRoomsRequest.need_disabled_resource);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (searchMeetingRoomsRequest.start_timezone != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, searchMeetingRoomsRequest.start_timezone);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (searchMeetingRoomsRequest.meeting_room_filter != null) {
                i8 = MeetingRoomFilter.ADAPTER.encodedSizeWithTag(8, searchMeetingRoomsRequest.meeting_room_filter);
            }
            return i14 + i8 + searchMeetingRoomsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SearchMeetingRoomsRequest decode(ProtoReader protoReader) throws IOException {
            C16028a aVar = new C16028a();
            aVar.f42100a = 0L;
            aVar.f42101b = 0L;
            aVar.f42102c = "";
            aVar.f42103d = 40;
            aVar.f42104e = "";
            aVar.f42105f = false;
            aVar.f42106g = "UTC";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f42100a = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            aVar.f42101b = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            aVar.f42102c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f42103d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f42104e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f42105f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f42106g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f42107h = MeetingRoomFilter.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, SearchMeetingRoomsRequest searchMeetingRoomsRequest) throws IOException {
            if (searchMeetingRoomsRequest.start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, searchMeetingRoomsRequest.start_time);
            }
            if (searchMeetingRoomsRequest.end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, searchMeetingRoomsRequest.end_time);
            }
            if (searchMeetingRoomsRequest.keywords != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, searchMeetingRoomsRequest.keywords);
            }
            if (searchMeetingRoomsRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, searchMeetingRoomsRequest.count);
            }
            if (searchMeetingRoomsRequest.rrule != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, searchMeetingRoomsRequest.rrule);
            }
            if (searchMeetingRoomsRequest.need_disabled_resource != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, searchMeetingRoomsRequest.need_disabled_resource);
            }
            if (searchMeetingRoomsRequest.start_timezone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, searchMeetingRoomsRequest.start_timezone);
            }
            if (searchMeetingRoomsRequest.meeting_room_filter != null) {
                MeetingRoomFilter.ADAPTER.encodeWithTag(protoWriter, 8, searchMeetingRoomsRequest.meeting_room_filter);
            }
            protoWriter.writeBytes(searchMeetingRoomsRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16028a newBuilder() {
        C16028a aVar = new C16028a();
        aVar.f42100a = this.start_time;
        aVar.f42101b = this.end_time;
        aVar.f42102c = this.keywords;
        aVar.f42103d = this.count;
        aVar.f42104e = this.rrule;
        aVar.f42105f = this.need_disabled_resource;
        aVar.f42106g = this.start_timezone;
        aVar.f42107h = this.meeting_room_filter;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SearchMeetingRoomsRequest$a */
    public static final class C16028a extends Message.Builder<SearchMeetingRoomsRequest, C16028a> {

        /* renamed from: a */
        public Long f42100a;

        /* renamed from: b */
        public Long f42101b;

        /* renamed from: c */
        public String f42102c;

        /* renamed from: d */
        public Integer f42103d;

        /* renamed from: e */
        public String f42104e;

        /* renamed from: f */
        public Boolean f42105f;

        /* renamed from: g */
        public String f42106g;

        /* renamed from: h */
        public MeetingRoomFilter f42107h;

        /* renamed from: a */
        public SearchMeetingRoomsRequest build() {
            return new SearchMeetingRoomsRequest(this.f42100a, this.f42101b, this.f42102c, this.f42103d, this.f42104e, this.f42105f, this.f42106g, this.f42107h, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16028a mo57656a(MeetingRoomFilter meetingRoomFilter) {
            this.f42107h = meetingRoomFilter;
            return this;
        }

        /* renamed from: b */
        public C16028a mo57662b(Long l) {
            this.f42101b = l;
            return this;
        }

        /* renamed from: a */
        public C16028a mo57657a(Boolean bool) {
            this.f42105f = bool;
            return this;
        }

        /* renamed from: b */
        public C16028a mo57663b(String str) {
            this.f42104e = str;
            return this;
        }

        /* renamed from: a */
        public C16028a mo57658a(Integer num) {
            this.f42103d = num;
            return this;
        }

        /* renamed from: a */
        public C16028a mo57659a(Long l) {
            this.f42100a = l;
            return this;
        }

        /* renamed from: a */
        public C16028a mo57660a(String str) {
            this.f42102c = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "SearchMeetingRoomsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        if (this.end_time != null) {
            sb.append(", end_time=");
            sb.append(this.end_time);
        }
        if (this.keywords != null) {
            sb.append(", keywords=");
            sb.append(this.keywords);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
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
        StringBuilder replace = sb.replace(0, 2, "SearchMeetingRoomsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SearchMeetingRoomsRequest(Long l, Long l2, String str, Integer num, String str2, Boolean bool, String str3, MeetingRoomFilter meetingRoomFilter) {
        this(l, l2, str, num, str2, bool, str3, meetingRoomFilter, ByteString.EMPTY);
    }

    public SearchMeetingRoomsRequest(Long l, Long l2, String str, Integer num, String str2, Boolean bool, String str3, MeetingRoomFilter meetingRoomFilter, ByteString byteString) {
        super(ADAPTER, byteString);
        this.start_time = l;
        this.end_time = l2;
        this.keywords = str;
        this.count = num;
        this.rrule = str2;
        this.need_disabled_resource = bool;
        this.start_timezone = str3;
        this.meeting_room_filter = meetingRoomFilter;
    }
}
