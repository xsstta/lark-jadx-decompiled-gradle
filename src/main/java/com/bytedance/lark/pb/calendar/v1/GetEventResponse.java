package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetEventResponse extends Message<GetEventResponse, C15702a> {
    public static final ProtoAdapter<GetEventResponse> ADAPTER = new C15703b();
    private static final long serialVersionUID = 0;
    public final CalendarEvent event;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetEventResponse$b */
    private static final class C15703b extends ProtoAdapter<GetEventResponse> {
        C15703b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetEventResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetEventResponse getEventResponse) {
            int i;
            if (getEventResponse.event != null) {
                i = CalendarEvent.ADAPTER.encodedSizeWithTag(1, getEventResponse.event);
            } else {
                i = 0;
            }
            return i + getEventResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetEventResponse decode(ProtoReader protoReader) throws IOException {
            C15702a aVar = new C15702a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41460a = CalendarEvent.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetEventResponse getEventResponse) throws IOException {
            if (getEventResponse.event != null) {
                CalendarEvent.ADAPTER.encodeWithTag(protoWriter, 1, getEventResponse.event);
            }
            protoWriter.writeBytes(getEventResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetEventResponse$a */
    public static final class C15702a extends Message.Builder<GetEventResponse, C15702a> {

        /* renamed from: a */
        public CalendarEvent f41460a;

        /* renamed from: a */
        public GetEventResponse build() {
            return new GetEventResponse(this.f41460a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15702a newBuilder() {
        C15702a aVar = new C15702a();
        aVar.f41460a = this.event;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetEventResponse");
        StringBuilder sb = new StringBuilder();
        if (this.event != null) {
            sb.append(", event=");
            sb.append(this.event);
        }
        StringBuilder replace = sb.replace(0, 2, "GetEventResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetEventResponse(CalendarEvent calendarEvent) {
        this(calendarEvent, ByteString.EMPTY);
    }

    public GetEventResponse(CalendarEvent calendarEvent, ByteString byteString) {
        super(ADAPTER, byteString);
        this.event = calendarEvent;
    }
}
