package com.ss.android.lark.pb.videoconference.v1;

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

public final class GetUpcomingEventsResponse extends Message<GetUpcomingEventsResponse, C50685a> {
    public static final ProtoAdapter<GetUpcomingEventsResponse> ADAPTER = new C50686b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    private static final long serialVersionUID = 0;
    public final List<UpcomingEvent> events;
    public final Boolean has_more;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetUpcomingEventsResponse$b */
    private static final class C50686b extends ProtoAdapter<GetUpcomingEventsResponse> {
        C50686b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUpcomingEventsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUpcomingEventsResponse getUpcomingEventsResponse) {
            int i;
            int encodedSizeWithTag = UpcomingEvent.ADAPTER.asRepeated().encodedSizeWithTag(1, getUpcomingEventsResponse.events);
            if (getUpcomingEventsResponse.has_more != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, getUpcomingEventsResponse.has_more);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getUpcomingEventsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetUpcomingEventsResponse decode(ProtoReader protoReader) throws IOException {
            C50685a aVar = new C50685a();
            aVar.f126414b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126413a.add(UpcomingEvent.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126414b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUpcomingEventsResponse getUpcomingEventsResponse) throws IOException {
            UpcomingEvent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getUpcomingEventsResponse.events);
            if (getUpcomingEventsResponse.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getUpcomingEventsResponse.has_more);
            }
            protoWriter.writeBytes(getUpcomingEventsResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetUpcomingEventsResponse$a */
    public static final class C50685a extends Message.Builder<GetUpcomingEventsResponse, C50685a> {

        /* renamed from: a */
        public List<UpcomingEvent> f126413a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f126414b;

        /* renamed from: a */
        public GetUpcomingEventsResponse build() {
            return new GetUpcomingEventsResponse(this.f126413a, this.f126414b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50685a newBuilder() {
        C50685a aVar = new C50685a();
        aVar.f126413a = Internal.copyOf("events", this.events);
        aVar.f126414b = this.has_more;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetUpcomingEventsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.events.isEmpty()) {
            sb.append(", events=");
            sb.append(this.events);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUpcomingEventsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetUpcomingEventsResponse(List<UpcomingEvent> list, Boolean bool) {
        this(list, bool, ByteString.EMPTY);
    }

    public GetUpcomingEventsResponse(List<UpcomingEvent> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.events = Internal.immutableCopyOf("events", list);
        this.has_more = bool;
    }
}
