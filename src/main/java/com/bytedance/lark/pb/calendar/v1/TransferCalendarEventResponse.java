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

public final class TransferCalendarEventResponse extends Message<TransferCalendarEventResponse, C16086a> {
    public static final ProtoAdapter<TransferCalendarEventResponse> ADAPTER = new C16087b();
    private static final long serialVersionUID = 0;
    public final List<CalendarEvent> events;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.TransferCalendarEventResponse$b */
    private static final class C16087b extends ProtoAdapter<TransferCalendarEventResponse> {
        C16087b() {
            super(FieldEncoding.LENGTH_DELIMITED, TransferCalendarEventResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(TransferCalendarEventResponse transferCalendarEventResponse) {
            return CalendarEvent.ADAPTER.asRepeated().encodedSizeWithTag(1, transferCalendarEventResponse.events) + transferCalendarEventResponse.unknownFields().size();
        }

        /* renamed from: a */
        public TransferCalendarEventResponse decode(ProtoReader protoReader) throws IOException {
            C16086a aVar = new C16086a();
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
                    aVar.f42175a.add(CalendarEvent.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TransferCalendarEventResponse transferCalendarEventResponse) throws IOException {
            CalendarEvent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, transferCalendarEventResponse.events);
            protoWriter.writeBytes(transferCalendarEventResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.TransferCalendarEventResponse$a */
    public static final class C16086a extends Message.Builder<TransferCalendarEventResponse, C16086a> {

        /* renamed from: a */
        public List<CalendarEvent> f42175a = Internal.newMutableList();

        /* renamed from: a */
        public TransferCalendarEventResponse build() {
            return new TransferCalendarEventResponse(this.f42175a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16086a newBuilder() {
        C16086a aVar = new C16086a();
        aVar.f42175a = Internal.copyOf("events", this.events);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "TransferCalendarEventResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.events.isEmpty()) {
            sb.append(", events=");
            sb.append(this.events);
        }
        StringBuilder replace = sb.replace(0, 2, "TransferCalendarEventResponse{");
        replace.append('}');
        return replace.toString();
    }

    public TransferCalendarEventResponse(List<CalendarEvent> list) {
        this(list, ByteString.EMPTY);
    }

    public TransferCalendarEventResponse(List<CalendarEvent> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.events = Internal.immutableCopyOf("events", list);
    }
}
