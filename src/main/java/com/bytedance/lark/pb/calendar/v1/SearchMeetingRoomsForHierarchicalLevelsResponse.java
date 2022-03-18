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

public final class SearchMeetingRoomsForHierarchicalLevelsResponse extends Message<SearchMeetingRoomsForHierarchicalLevelsResponse, C16026a> {
    public static final ProtoAdapter<SearchMeetingRoomsForHierarchicalLevelsResponse> ADAPTER = new C16027b();
    public static final Integer DEFAULT_CURSOR = 0;
    public static final Boolean DEFAULT_HAS_MORE = false;
    private static final long serialVersionUID = 0;
    public final Integer cursor;
    public final Boolean has_more;
    public final List<CalendarResource> resources;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SearchMeetingRoomsForHierarchicalLevelsResponse$b */
    private static final class C16027b extends ProtoAdapter<SearchMeetingRoomsForHierarchicalLevelsResponse> {
        C16027b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchMeetingRoomsForHierarchicalLevelsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchMeetingRoomsForHierarchicalLevelsResponse searchMeetingRoomsForHierarchicalLevelsResponse) {
            int i;
            int encodedSizeWithTag = CalendarResource.ADAPTER.asRepeated().encodedSizeWithTag(1, searchMeetingRoomsForHierarchicalLevelsResponse.resources);
            int i2 = 0;
            if (searchMeetingRoomsForHierarchicalLevelsResponse.cursor != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, searchMeetingRoomsForHierarchicalLevelsResponse.cursor);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (searchMeetingRoomsForHierarchicalLevelsResponse.has_more != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, searchMeetingRoomsForHierarchicalLevelsResponse.has_more);
            }
            return i3 + i2 + searchMeetingRoomsForHierarchicalLevelsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SearchMeetingRoomsForHierarchicalLevelsResponse decode(ProtoReader protoReader) throws IOException {
            C16026a aVar = new C16026a();
            aVar.f42098b = 0;
            aVar.f42099c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42097a.add(CalendarResource.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f42098b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42099c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SearchMeetingRoomsForHierarchicalLevelsResponse searchMeetingRoomsForHierarchicalLevelsResponse) throws IOException {
            CalendarResource.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, searchMeetingRoomsForHierarchicalLevelsResponse.resources);
            if (searchMeetingRoomsForHierarchicalLevelsResponse.cursor != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, searchMeetingRoomsForHierarchicalLevelsResponse.cursor);
            }
            if (searchMeetingRoomsForHierarchicalLevelsResponse.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, searchMeetingRoomsForHierarchicalLevelsResponse.has_more);
            }
            protoWriter.writeBytes(searchMeetingRoomsForHierarchicalLevelsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SearchMeetingRoomsForHierarchicalLevelsResponse$a */
    public static final class C16026a extends Message.Builder<SearchMeetingRoomsForHierarchicalLevelsResponse, C16026a> {

        /* renamed from: a */
        public List<CalendarResource> f42097a = Internal.newMutableList();

        /* renamed from: b */
        public Integer f42098b;

        /* renamed from: c */
        public Boolean f42099c;

        /* renamed from: a */
        public SearchMeetingRoomsForHierarchicalLevelsResponse build() {
            return new SearchMeetingRoomsForHierarchicalLevelsResponse(this.f42097a, this.f42098b, this.f42099c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16026a newBuilder() {
        C16026a aVar = new C16026a();
        aVar.f42097a = Internal.copyOf("resources", this.resources);
        aVar.f42098b = this.cursor;
        aVar.f42099c = this.has_more;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "SearchMeetingRoomsForHierarchicalLevelsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.resources.isEmpty()) {
            sb.append(", resources=");
            sb.append(this.resources);
        }
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchMeetingRoomsForHierarchicalLevelsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SearchMeetingRoomsForHierarchicalLevelsResponse(List<CalendarResource> list, Integer num, Boolean bool) {
        this(list, num, bool, ByteString.EMPTY);
    }

    public SearchMeetingRoomsForHierarchicalLevelsResponse(List<CalendarResource> list, Integer num, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resources = Internal.immutableCopyOf("resources", list);
        this.cursor = num;
        this.has_more = bool;
    }
}
