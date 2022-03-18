package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SwitchEventCalendarResponse extends Message<SwitchEventCalendarResponse, C16074a> {
    public static final ProtoAdapter<SwitchEventCalendarResponse> ADAPTER = new C16075b();
    private static final long serialVersionUID = 0;
    public final CalendarEvent switched_event;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SwitchEventCalendarResponse$b */
    private static final class C16075b extends ProtoAdapter<SwitchEventCalendarResponse> {
        C16075b() {
            super(FieldEncoding.LENGTH_DELIMITED, SwitchEventCalendarResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SwitchEventCalendarResponse switchEventCalendarResponse) {
            int i;
            if (switchEventCalendarResponse.switched_event != null) {
                i = CalendarEvent.ADAPTER.encodedSizeWithTag(1, switchEventCalendarResponse.switched_event);
            } else {
                i = 0;
            }
            return i + switchEventCalendarResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SwitchEventCalendarResponse decode(ProtoReader protoReader) throws IOException {
            C16074a aVar = new C16074a();
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
                    aVar.f42164a = CalendarEvent.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SwitchEventCalendarResponse switchEventCalendarResponse) throws IOException {
            if (switchEventCalendarResponse.switched_event != null) {
                CalendarEvent.ADAPTER.encodeWithTag(protoWriter, 1, switchEventCalendarResponse.switched_event);
            }
            protoWriter.writeBytes(switchEventCalendarResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SwitchEventCalendarResponse$a */
    public static final class C16074a extends Message.Builder<SwitchEventCalendarResponse, C16074a> {

        /* renamed from: a */
        public CalendarEvent f42164a;

        /* renamed from: a */
        public SwitchEventCalendarResponse build() {
            return new SwitchEventCalendarResponse(this.f42164a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16074a newBuilder() {
        C16074a aVar = new C16074a();
        aVar.f42164a = this.switched_event;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "SwitchEventCalendarResponse");
        StringBuilder sb = new StringBuilder();
        if (this.switched_event != null) {
            sb.append(", switched_event=");
            sb.append(this.switched_event);
        }
        StringBuilder replace = sb.replace(0, 2, "SwitchEventCalendarResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SwitchEventCalendarResponse(CalendarEvent calendarEvent) {
        this(calendarEvent, ByteString.EMPTY);
    }

    public SwitchEventCalendarResponse(CalendarEvent calendarEvent, ByteString byteString) {
        super(ADAPTER, byteString);
        this.switched_event = calendarEvent;
    }
}
