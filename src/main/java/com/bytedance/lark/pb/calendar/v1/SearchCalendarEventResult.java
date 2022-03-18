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
import java.util.Map;
import okio.ByteString;

public final class SearchCalendarEventResult extends Message<SearchCalendarEventResult, C16022a> {
    public static final ProtoAdapter<SearchCalendarEventResult> ADAPTER = new C16023b();
    public static final Long DEFAULT_SEARCH_RESULT_COUNT = 0L;
    private static final long serialVersionUID = 0;
    public final Map<String, SearchCalendarEventContent> contents;
    public final List<SearchCalendarEventInstance> instances;
    public final Long search_result_count;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SearchCalendarEventResult$a */
    public static final class C16022a extends Message.Builder<SearchCalendarEventResult, C16022a> {

        /* renamed from: a */
        public List<SearchCalendarEventInstance> f42084a = Internal.newMutableList();

        /* renamed from: b */
        public Map<String, SearchCalendarEventContent> f42085b = Internal.newMutableMap();

        /* renamed from: c */
        public Long f42086c;

        /* renamed from: a */
        public SearchCalendarEventResult build() {
            return new SearchCalendarEventResult(this.f42084a, this.f42085b, this.f42086c, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SearchCalendarEventResult$b */
    private static final class C16023b extends ProtoAdapter<SearchCalendarEventResult> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, SearchCalendarEventContent>> f42087a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SearchCalendarEventContent.ADAPTER);

        C16023b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchCalendarEventResult.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchCalendarEventResult searchCalendarEventResult) {
            int i;
            int encodedSizeWithTag = SearchCalendarEventInstance.ADAPTER.asRepeated().encodedSizeWithTag(1, searchCalendarEventResult.instances) + this.f42087a.encodedSizeWithTag(2, searchCalendarEventResult.contents);
            if (searchCalendarEventResult.search_result_count != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(3, searchCalendarEventResult.search_result_count);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + searchCalendarEventResult.unknownFields().size();
        }

        /* renamed from: a */
        public SearchCalendarEventResult decode(ProtoReader protoReader) throws IOException {
            C16022a aVar = new C16022a();
            aVar.f42086c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42084a.add(SearchCalendarEventInstance.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f42085b.putAll(this.f42087a.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42086c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SearchCalendarEventResult searchCalendarEventResult) throws IOException {
            SearchCalendarEventInstance.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, searchCalendarEventResult.instances);
            this.f42087a.encodeWithTag(protoWriter, 2, searchCalendarEventResult.contents);
            if (searchCalendarEventResult.search_result_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, searchCalendarEventResult.search_result_count);
            }
            protoWriter.writeBytes(searchCalendarEventResult.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16022a newBuilder() {
        C16022a aVar = new C16022a();
        aVar.f42084a = Internal.copyOf("instances", this.instances);
        aVar.f42085b = Internal.copyOf("contents", this.contents);
        aVar.f42086c = this.search_result_count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "SearchCalendarEventResult");
        StringBuilder sb = new StringBuilder();
        if (!this.instances.isEmpty()) {
            sb.append(", instances=");
            sb.append(this.instances);
        }
        if (!this.contents.isEmpty()) {
            sb.append(", contents=");
            sb.append(this.contents);
        }
        if (this.search_result_count != null) {
            sb.append(", search_result_count=");
            sb.append(this.search_result_count);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchCalendarEventResult{");
        replace.append('}');
        return replace.toString();
    }

    public SearchCalendarEventResult(List<SearchCalendarEventInstance> list, Map<String, SearchCalendarEventContent> map, Long l) {
        this(list, map, l, ByteString.EMPTY);
    }

    public SearchCalendarEventResult(List<SearchCalendarEventInstance> list, Map<String, SearchCalendarEventContent> map, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.instances = Internal.immutableCopyOf("instances", list);
        this.contents = Internal.immutableCopyOf("contents", map);
        this.search_result_count = l;
    }
}
