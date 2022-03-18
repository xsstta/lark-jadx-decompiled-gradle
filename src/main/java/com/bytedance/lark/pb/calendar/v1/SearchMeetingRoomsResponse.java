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

public final class SearchMeetingRoomsResponse extends Message<SearchMeetingRoomsResponse, C16030a> {
    public static final ProtoAdapter<SearchMeetingRoomsResponse> ADAPTER = new C16031b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    private static final long serialVersionUID = 0;
    public final List<CalendarBuilding> buildings;
    public final Boolean has_more;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SearchMeetingRoomsResponse$b */
    private static final class C16031b extends ProtoAdapter<SearchMeetingRoomsResponse> {
        C16031b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchMeetingRoomsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchMeetingRoomsResponse searchMeetingRoomsResponse) {
            int i;
            int encodedSizeWithTag = CalendarBuilding.ADAPTER.asRepeated().encodedSizeWithTag(1, searchMeetingRoomsResponse.buildings);
            if (searchMeetingRoomsResponse.has_more != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, searchMeetingRoomsResponse.has_more);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + searchMeetingRoomsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SearchMeetingRoomsResponse decode(ProtoReader protoReader) throws IOException {
            C16030a aVar = new C16030a();
            aVar.f42109b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42108a.add(CalendarBuilding.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42109b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SearchMeetingRoomsResponse searchMeetingRoomsResponse) throws IOException {
            CalendarBuilding.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, searchMeetingRoomsResponse.buildings);
            if (searchMeetingRoomsResponse.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, searchMeetingRoomsResponse.has_more);
            }
            protoWriter.writeBytes(searchMeetingRoomsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SearchMeetingRoomsResponse$a */
    public static final class C16030a extends Message.Builder<SearchMeetingRoomsResponse, C16030a> {

        /* renamed from: a */
        public List<CalendarBuilding> f42108a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f42109b;

        /* renamed from: a */
        public SearchMeetingRoomsResponse build() {
            return new SearchMeetingRoomsResponse(this.f42108a, this.f42109b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16030a newBuilder() {
        C16030a aVar = new C16030a();
        aVar.f42108a = Internal.copyOf("buildings", this.buildings);
        aVar.f42109b = this.has_more;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "SearchMeetingRoomsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.buildings.isEmpty()) {
            sb.append(", buildings=");
            sb.append(this.buildings);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchMeetingRoomsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SearchMeetingRoomsResponse(List<CalendarBuilding> list, Boolean bool) {
        this(list, bool, ByteString.EMPTY);
    }

    public SearchMeetingRoomsResponse(List<CalendarBuilding> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.buildings = Internal.immutableCopyOf("buildings", list);
        this.has_more = bool;
    }
}
