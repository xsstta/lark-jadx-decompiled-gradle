package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.actions.SearchIntents;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class AdvanceSearchCalendarEventRequest extends Message<AdvanceSearchCalendarEventRequest, C15496a> {
    public static final ProtoAdapter<AdvanceSearchCalendarEventRequest> ADAPTER = new C15497b();
    private static final long serialVersionUID = 0;
    public final EventFilter filter;
    public final String query;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.AdvanceSearchCalendarEventRequest$b */
    private static final class C15497b extends ProtoAdapter<AdvanceSearchCalendarEventRequest> {
        C15497b() {
            super(FieldEncoding.LENGTH_DELIMITED, AdvanceSearchCalendarEventRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(AdvanceSearchCalendarEventRequest advanceSearchCalendarEventRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, advanceSearchCalendarEventRequest.query) + EventFilter.ADAPTER.encodedSizeWithTag(2, advanceSearchCalendarEventRequest.filter) + advanceSearchCalendarEventRequest.unknownFields().size();
        }

        /* renamed from: a */
        public AdvanceSearchCalendarEventRequest decode(ProtoReader protoReader) throws IOException {
            C15496a aVar = new C15496a();
            aVar.f40955a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40955a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40956b = EventFilter.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AdvanceSearchCalendarEventRequest advanceSearchCalendarEventRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, advanceSearchCalendarEventRequest.query);
            EventFilter.ADAPTER.encodeWithTag(protoWriter, 2, advanceSearchCalendarEventRequest.filter);
            protoWriter.writeBytes(advanceSearchCalendarEventRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15496a newBuilder() {
        C15496a aVar = new C15496a();
        aVar.f40955a = this.query;
        aVar.f40956b = this.filter;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.AdvanceSearchCalendarEventRequest$a */
    public static final class C15496a extends Message.Builder<AdvanceSearchCalendarEventRequest, C15496a> {

        /* renamed from: a */
        public String f40955a;

        /* renamed from: b */
        public EventFilter f40956b;

        /* renamed from: a */
        public AdvanceSearchCalendarEventRequest build() {
            EventFilter eventFilter;
            String str = this.f40955a;
            if (str != null && (eventFilter = this.f40956b) != null) {
                return new AdvanceSearchCalendarEventRequest(str, eventFilter, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, SearchIntents.EXTRA_QUERY, this.f40956b, "filter");
        }

        /* renamed from: a */
        public C15496a mo56098a(EventFilter eventFilter) {
            this.f40956b = eventFilter;
            return this;
        }

        /* renamed from: a */
        public C15496a mo56099a(String str) {
            this.f40955a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "AdvanceSearchCalendarEventRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", query=");
        sb.append(this.query);
        sb.append(", filter=");
        sb.append(this.filter);
        StringBuilder replace = sb.replace(0, 2, "AdvanceSearchCalendarEventRequest{");
        replace.append('}');
        return replace.toString();
    }

    public AdvanceSearchCalendarEventRequest(String str, EventFilter eventFilter) {
        this(str, eventFilter, ByteString.EMPTY);
    }

    public AdvanceSearchCalendarEventRequest(String str, EventFilter eventFilter, ByteString byteString) {
        super(ADAPTER, byteString);
        this.query = str;
        this.filter = eventFilter;
    }
}
