package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SearchMeetingRoomsForHierarchicalLevelsRequest extends Message<SearchMeetingRoomsForHierarchicalLevelsRequest, C16024a> {
    public static final ProtoAdapter<SearchMeetingRoomsForHierarchicalLevelsRequest> ADAPTER = new C16025b();
    public static final Integer DEFAULT_COUNT = 50;
    public static final Integer DEFAULT_CURSOR = 0;
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Boolean DEFAULT_NEED_DISABLED_RESOURCE = false;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final Integer cursor;
    public final Long end_time;
    public final String keyword;
    public final MeetingRoomFilter meeting_room_filter;
    public final Boolean need_disabled_resource;
    public final String rrule;
    public final Long start_time;
    public final String start_timezone;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SearchMeetingRoomsForHierarchicalLevelsRequest$b */
    private static final class C16025b extends ProtoAdapter<SearchMeetingRoomsForHierarchicalLevelsRequest> {
        C16025b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchMeetingRoomsForHierarchicalLevelsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchMeetingRoomsForHierarchicalLevelsRequest searchMeetingRoomsForHierarchicalLevelsRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9 = 0;
            if (searchMeetingRoomsForHierarchicalLevelsRequest.start_time != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, searchMeetingRoomsForHierarchicalLevelsRequest.start_time);
            } else {
                i = 0;
            }
            if (searchMeetingRoomsForHierarchicalLevelsRequest.end_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, searchMeetingRoomsForHierarchicalLevelsRequest.end_time);
            } else {
                i2 = 0;
            }
            int i10 = i + i2;
            if (searchMeetingRoomsForHierarchicalLevelsRequest.keyword != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, searchMeetingRoomsForHierarchicalLevelsRequest.keyword);
            } else {
                i3 = 0;
            }
            int i11 = i10 + i3;
            if (searchMeetingRoomsForHierarchicalLevelsRequest.count != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(4, searchMeetingRoomsForHierarchicalLevelsRequest.count);
            } else {
                i4 = 0;
            }
            int i12 = i11 + i4;
            if (searchMeetingRoomsForHierarchicalLevelsRequest.rrule != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, searchMeetingRoomsForHierarchicalLevelsRequest.rrule);
            } else {
                i5 = 0;
            }
            int i13 = i12 + i5;
            if (searchMeetingRoomsForHierarchicalLevelsRequest.need_disabled_resource != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, searchMeetingRoomsForHierarchicalLevelsRequest.need_disabled_resource);
            } else {
                i6 = 0;
            }
            int i14 = i13 + i6;
            if (searchMeetingRoomsForHierarchicalLevelsRequest.start_timezone != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, searchMeetingRoomsForHierarchicalLevelsRequest.start_timezone);
            } else {
                i7 = 0;
            }
            int i15 = i14 + i7;
            if (searchMeetingRoomsForHierarchicalLevelsRequest.cursor != null) {
                i8 = ProtoAdapter.INT32.encodedSizeWithTag(8, searchMeetingRoomsForHierarchicalLevelsRequest.cursor);
            } else {
                i8 = 0;
            }
            int i16 = i15 + i8;
            if (searchMeetingRoomsForHierarchicalLevelsRequest.meeting_room_filter != null) {
                i9 = MeetingRoomFilter.ADAPTER.encodedSizeWithTag(9, searchMeetingRoomsForHierarchicalLevelsRequest.meeting_room_filter);
            }
            return i16 + i9 + searchMeetingRoomsForHierarchicalLevelsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SearchMeetingRoomsForHierarchicalLevelsRequest decode(ProtoReader protoReader) throws IOException {
            C16024a aVar = new C16024a();
            aVar.f42088a = 0L;
            aVar.f42089b = 0L;
            aVar.f42090c = "";
            aVar.f42091d = 50;
            aVar.f42092e = "";
            aVar.f42093f = false;
            aVar.f42094g = "UTC";
            aVar.f42095h = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f42088a = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            aVar.f42089b = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            aVar.f42090c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f42091d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f42092e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f42093f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f42094g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f42095h = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 9:
                            aVar.f42096i = MeetingRoomFilter.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, SearchMeetingRoomsForHierarchicalLevelsRequest searchMeetingRoomsForHierarchicalLevelsRequest) throws IOException {
            if (searchMeetingRoomsForHierarchicalLevelsRequest.start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, searchMeetingRoomsForHierarchicalLevelsRequest.start_time);
            }
            if (searchMeetingRoomsForHierarchicalLevelsRequest.end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, searchMeetingRoomsForHierarchicalLevelsRequest.end_time);
            }
            if (searchMeetingRoomsForHierarchicalLevelsRequest.keyword != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, searchMeetingRoomsForHierarchicalLevelsRequest.keyword);
            }
            if (searchMeetingRoomsForHierarchicalLevelsRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, searchMeetingRoomsForHierarchicalLevelsRequest.count);
            }
            if (searchMeetingRoomsForHierarchicalLevelsRequest.rrule != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, searchMeetingRoomsForHierarchicalLevelsRequest.rrule);
            }
            if (searchMeetingRoomsForHierarchicalLevelsRequest.need_disabled_resource != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, searchMeetingRoomsForHierarchicalLevelsRequest.need_disabled_resource);
            }
            if (searchMeetingRoomsForHierarchicalLevelsRequest.start_timezone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, searchMeetingRoomsForHierarchicalLevelsRequest.start_timezone);
            }
            if (searchMeetingRoomsForHierarchicalLevelsRequest.cursor != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, searchMeetingRoomsForHierarchicalLevelsRequest.cursor);
            }
            if (searchMeetingRoomsForHierarchicalLevelsRequest.meeting_room_filter != null) {
                MeetingRoomFilter.ADAPTER.encodeWithTag(protoWriter, 9, searchMeetingRoomsForHierarchicalLevelsRequest.meeting_room_filter);
            }
            protoWriter.writeBytes(searchMeetingRoomsForHierarchicalLevelsRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16024a newBuilder() {
        C16024a aVar = new C16024a();
        aVar.f42088a = this.start_time;
        aVar.f42089b = this.end_time;
        aVar.f42090c = this.keyword;
        aVar.f42091d = this.count;
        aVar.f42092e = this.rrule;
        aVar.f42093f = this.need_disabled_resource;
        aVar.f42094g = this.start_timezone;
        aVar.f42095h = this.cursor;
        aVar.f42096i = this.meeting_room_filter;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SearchMeetingRoomsForHierarchicalLevelsRequest$a */
    public static final class C16024a extends Message.Builder<SearchMeetingRoomsForHierarchicalLevelsRequest, C16024a> {

        /* renamed from: a */
        public Long f42088a;

        /* renamed from: b */
        public Long f42089b;

        /* renamed from: c */
        public String f42090c;

        /* renamed from: d */
        public Integer f42091d;

        /* renamed from: e */
        public String f42092e;

        /* renamed from: f */
        public Boolean f42093f;

        /* renamed from: g */
        public String f42094g;

        /* renamed from: h */
        public Integer f42095h;

        /* renamed from: i */
        public MeetingRoomFilter f42096i;

        /* renamed from: a */
        public SearchMeetingRoomsForHierarchicalLevelsRequest build() {
            return new SearchMeetingRoomsForHierarchicalLevelsRequest(this.f42088a, this.f42089b, this.f42090c, this.f42091d, this.f42092e, this.f42093f, this.f42094g, this.f42095h, this.f42096i, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16024a mo57640a(MeetingRoomFilter meetingRoomFilter) {
            this.f42096i = meetingRoomFilter;
            return this;
        }

        /* renamed from: b */
        public C16024a mo57646b(Integer num) {
            this.f42095h = num;
            return this;
        }

        /* renamed from: a */
        public C16024a mo57641a(Boolean bool) {
            this.f42093f = bool;
            return this;
        }

        /* renamed from: b */
        public C16024a mo57647b(Long l) {
            this.f42089b = l;
            return this;
        }

        /* renamed from: a */
        public C16024a mo57642a(Integer num) {
            this.f42091d = num;
            return this;
        }

        /* renamed from: b */
        public C16024a mo57648b(String str) {
            this.f42092e = str;
            return this;
        }

        /* renamed from: a */
        public C16024a mo57643a(Long l) {
            this.f42088a = l;
            return this;
        }

        /* renamed from: a */
        public C16024a mo57644a(String str) {
            this.f42090c = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "SearchMeetingRoomsForHierarchicalLevelsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        if (this.end_time != null) {
            sb.append(", end_time=");
            sb.append(this.end_time);
        }
        if (this.keyword != null) {
            sb.append(", keyword=");
            sb.append(this.keyword);
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
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.meeting_room_filter != null) {
            sb.append(", meeting_room_filter=");
            sb.append(this.meeting_room_filter);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchMeetingRoomsForHierarchicalLevelsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SearchMeetingRoomsForHierarchicalLevelsRequest(Long l, Long l2, String str, Integer num, String str2, Boolean bool, String str3, Integer num2, MeetingRoomFilter meetingRoomFilter) {
        this(l, l2, str, num, str2, bool, str3, num2, meetingRoomFilter, ByteString.EMPTY);
    }

    public SearchMeetingRoomsForHierarchicalLevelsRequest(Long l, Long l2, String str, Integer num, String str2, Boolean bool, String str3, Integer num2, MeetingRoomFilter meetingRoomFilter, ByteString byteString) {
        super(ADAPTER, byteString);
        this.start_time = l;
        this.end_time = l2;
        this.keyword = str;
        this.count = num;
        this.rrule = str2;
        this.need_disabled_resource = bool;
        this.start_timezone = str3;
        this.cursor = num2;
        this.meeting_room_filter = meetingRoomFilter;
    }
}
