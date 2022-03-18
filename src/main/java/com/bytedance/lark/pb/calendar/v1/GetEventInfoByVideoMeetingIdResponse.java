package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetEventInfoByVideoMeetingIdResponse extends Message<GetEventInfoByVideoMeetingIdResponse, C15698a> {
    public static final ProtoAdapter<GetEventInfoByVideoMeetingIdResponse> ADAPTER = new C15699b();
    private static final long serialVersionUID = 0;
    public final CalendarEvent event;
    public final CalendarEventInstanceTime instance_start_end_time;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetEventInfoByVideoMeetingIdResponse$b */
    private static final class C15699b extends ProtoAdapter<GetEventInfoByVideoMeetingIdResponse> {
        C15699b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetEventInfoByVideoMeetingIdResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetEventInfoByVideoMeetingIdResponse getEventInfoByVideoMeetingIdResponse) {
            int i;
            int i2 = 0;
            if (getEventInfoByVideoMeetingIdResponse.event != null) {
                i = CalendarEvent.ADAPTER.encodedSizeWithTag(1, getEventInfoByVideoMeetingIdResponse.event);
            } else {
                i = 0;
            }
            if (getEventInfoByVideoMeetingIdResponse.instance_start_end_time != null) {
                i2 = CalendarEventInstanceTime.ADAPTER.encodedSizeWithTag(2, getEventInfoByVideoMeetingIdResponse.instance_start_end_time);
            }
            return i + i2 + getEventInfoByVideoMeetingIdResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetEventInfoByVideoMeetingIdResponse decode(ProtoReader protoReader) throws IOException {
            C15698a aVar = new C15698a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41455a = CalendarEvent.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41456b = CalendarEventInstanceTime.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetEventInfoByVideoMeetingIdResponse getEventInfoByVideoMeetingIdResponse) throws IOException {
            if (getEventInfoByVideoMeetingIdResponse.event != null) {
                CalendarEvent.ADAPTER.encodeWithTag(protoWriter, 1, getEventInfoByVideoMeetingIdResponse.event);
            }
            if (getEventInfoByVideoMeetingIdResponse.instance_start_end_time != null) {
                CalendarEventInstanceTime.ADAPTER.encodeWithTag(protoWriter, 2, getEventInfoByVideoMeetingIdResponse.instance_start_end_time);
            }
            protoWriter.writeBytes(getEventInfoByVideoMeetingIdResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetEventInfoByVideoMeetingIdResponse$a */
    public static final class C15698a extends Message.Builder<GetEventInfoByVideoMeetingIdResponse, C15698a> {

        /* renamed from: a */
        public CalendarEvent f41455a;

        /* renamed from: b */
        public CalendarEventInstanceTime f41456b;

        /* renamed from: a */
        public GetEventInfoByVideoMeetingIdResponse build() {
            return new GetEventInfoByVideoMeetingIdResponse(this.f41455a, this.f41456b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15698a newBuilder() {
        C15698a aVar = new C15698a();
        aVar.f41455a = this.event;
        aVar.f41456b = this.instance_start_end_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetEventInfoByVideoMeetingIdResponse");
        StringBuilder sb = new StringBuilder();
        if (this.event != null) {
            sb.append(", event=");
            sb.append(this.event);
        }
        if (this.instance_start_end_time != null) {
            sb.append(", instance_start_end_time=");
            sb.append(this.instance_start_end_time);
        }
        StringBuilder replace = sb.replace(0, 2, "GetEventInfoByVideoMeetingIdResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetEventInfoByVideoMeetingIdResponse(CalendarEvent calendarEvent, CalendarEventInstanceTime calendarEventInstanceTime) {
        this(calendarEvent, calendarEventInstanceTime, ByteString.EMPTY);
    }

    public GetEventInfoByVideoMeetingIdResponse(CalendarEvent calendarEvent, CalendarEventInstanceTime calendarEventInstanceTime, ByteString byteString) {
        super(ADAPTER, byteString);
        this.event = calendarEvent;
        this.instance_start_end_time = calendarEventInstanceTime;
    }
}
