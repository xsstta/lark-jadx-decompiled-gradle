package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.calendar.v1.CalendarEvent;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class DeleteEventRequest extends Message<DeleteEventRequest, C15594a> {
    public static final ProtoAdapter<DeleteEventRequest> ADAPTER = new C15595b();
    public static final Boolean DEFAULT_DISSOLVE_MEETING = false;
    public static final CalendarEvent.Span DEFAULT_SPAN = CalendarEvent.Span.NONE_SPAN;
    private static final long serialVersionUID = 0;
    public final Boolean dissolve_meeting;
    public final CalendarEvent event;
    public final CalendarEventInstance instance;
    public final CalendarEvent.Span span;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.DeleteEventRequest$b */
    private static final class C15595b extends ProtoAdapter<DeleteEventRequest> {
        C15595b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteEventRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteEventRequest deleteEventRequest) {
            int i;
            int encodedSizeWithTag = CalendarEvent.ADAPTER.encodedSizeWithTag(1, deleteEventRequest.event) + CalendarEventInstance.ADAPTER.encodedSizeWithTag(2, deleteEventRequest.instance) + CalendarEvent.Span.ADAPTER.encodedSizeWithTag(3, deleteEventRequest.span);
            if (deleteEventRequest.dissolve_meeting != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(4, deleteEventRequest.dissolve_meeting);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + deleteEventRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteEventRequest decode(ProtoReader protoReader) throws IOException {
            C15594a aVar = new C15594a();
            aVar.f41327c = CalendarEvent.Span.NONE_SPAN;
            aVar.f41328d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41325a = CalendarEvent.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41326b = CalendarEventInstance.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f41327c = CalendarEvent.Span.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41328d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteEventRequest deleteEventRequest) throws IOException {
            CalendarEvent.ADAPTER.encodeWithTag(protoWriter, 1, deleteEventRequest.event);
            CalendarEventInstance.ADAPTER.encodeWithTag(protoWriter, 2, deleteEventRequest.instance);
            CalendarEvent.Span.ADAPTER.encodeWithTag(protoWriter, 3, deleteEventRequest.span);
            if (deleteEventRequest.dissolve_meeting != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, deleteEventRequest.dissolve_meeting);
            }
            protoWriter.writeBytes(deleteEventRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15594a newBuilder() {
        C15594a aVar = new C15594a();
        aVar.f41325a = this.event;
        aVar.f41326b = this.instance;
        aVar.f41327c = this.span;
        aVar.f41328d = this.dissolve_meeting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.DeleteEventRequest$a */
    public static final class C15594a extends Message.Builder<DeleteEventRequest, C15594a> {

        /* renamed from: a */
        public CalendarEvent f41325a;

        /* renamed from: b */
        public CalendarEventInstance f41326b;

        /* renamed from: c */
        public CalendarEvent.Span f41327c;

        /* renamed from: d */
        public Boolean f41328d;

        /* renamed from: a */
        public DeleteEventRequest build() {
            CalendarEventInstance calendarEventInstance;
            CalendarEvent.Span span;
            CalendarEvent calendarEvent = this.f41325a;
            if (calendarEvent != null && (calendarEventInstance = this.f41326b) != null && (span = this.f41327c) != null) {
                return new DeleteEventRequest(calendarEvent, calendarEventInstance, span, this.f41328d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(calendarEvent, "event", this.f41326b, "instance", this.f41327c, "span");
        }

        /* renamed from: a */
        public C15594a mo56554a(CalendarEvent.Span span) {
            this.f41327c = span;
            return this;
        }

        /* renamed from: a */
        public C15594a mo56555a(CalendarEvent calendarEvent) {
            this.f41325a = calendarEvent;
            return this;
        }

        /* renamed from: a */
        public C15594a mo56556a(CalendarEventInstance calendarEventInstance) {
            this.f41326b = calendarEventInstance;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "DeleteEventRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", event=");
        sb.append(this.event);
        sb.append(", instance=");
        sb.append(this.instance);
        sb.append(", span=");
        sb.append(this.span);
        if (this.dissolve_meeting != null) {
            sb.append(", dissolve_meeting=");
            sb.append(this.dissolve_meeting);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteEventRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteEventRequest(CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance, CalendarEvent.Span span2, Boolean bool) {
        this(calendarEvent, calendarEventInstance, span2, bool, ByteString.EMPTY);
    }

    public DeleteEventRequest(CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance, CalendarEvent.Span span2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.event = calendarEvent;
        this.instance = calendarEventInstance;
        this.span = span2;
        this.dissolve_meeting = bool;
    }
}
