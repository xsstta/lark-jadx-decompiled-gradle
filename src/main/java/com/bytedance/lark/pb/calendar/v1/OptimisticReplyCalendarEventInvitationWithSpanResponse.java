package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class OptimisticReplyCalendarEventInvitationWithSpanResponse extends Message<OptimisticReplyCalendarEventInvitationWithSpanResponse, C15896a> {
    public static final ProtoAdapter<OptimisticReplyCalendarEventInvitationWithSpanResponse> ADAPTER = new C15897b();
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final CalendarEvent event;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.OptimisticReplyCalendarEventInvitationWithSpanResponse$b */
    private static final class C15897b extends ProtoAdapter<OptimisticReplyCalendarEventInvitationWithSpanResponse> {
        C15897b() {
            super(FieldEncoding.LENGTH_DELIMITED, OptimisticReplyCalendarEventInvitationWithSpanResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(OptimisticReplyCalendarEventInvitationWithSpanResponse optimisticReplyCalendarEventInvitationWithSpanResponse) {
            int i;
            int i2 = 0;
            if (optimisticReplyCalendarEventInvitationWithSpanResponse.event != null) {
                i = CalendarEvent.ADAPTER.encodedSizeWithTag(1, optimisticReplyCalendarEventInvitationWithSpanResponse.event);
            } else {
                i = 0;
            }
            if (optimisticReplyCalendarEventInvitationWithSpanResponse.chat_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, optimisticReplyCalendarEventInvitationWithSpanResponse.chat_id);
            }
            return i + i2 + optimisticReplyCalendarEventInvitationWithSpanResponse.unknownFields().size();
        }

        /* renamed from: a */
        public OptimisticReplyCalendarEventInvitationWithSpanResponse decode(ProtoReader protoReader) throws IOException {
            C15896a aVar = new C15896a();
            aVar.f41856b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41855a = CalendarEvent.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41856b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, OptimisticReplyCalendarEventInvitationWithSpanResponse optimisticReplyCalendarEventInvitationWithSpanResponse) throws IOException {
            if (optimisticReplyCalendarEventInvitationWithSpanResponse.event != null) {
                CalendarEvent.ADAPTER.encodeWithTag(protoWriter, 1, optimisticReplyCalendarEventInvitationWithSpanResponse.event);
            }
            if (optimisticReplyCalendarEventInvitationWithSpanResponse.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, optimisticReplyCalendarEventInvitationWithSpanResponse.chat_id);
            }
            protoWriter.writeBytes(optimisticReplyCalendarEventInvitationWithSpanResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.OptimisticReplyCalendarEventInvitationWithSpanResponse$a */
    public static final class C15896a extends Message.Builder<OptimisticReplyCalendarEventInvitationWithSpanResponse, C15896a> {

        /* renamed from: a */
        public CalendarEvent f41855a;

        /* renamed from: b */
        public String f41856b;

        /* renamed from: a */
        public OptimisticReplyCalendarEventInvitationWithSpanResponse build() {
            return new OptimisticReplyCalendarEventInvitationWithSpanResponse(this.f41855a, this.f41856b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15896a newBuilder() {
        C15896a aVar = new C15896a();
        aVar.f41855a = this.event;
        aVar.f41856b = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "OptimisticReplyCalendarEventInvitationWithSpanResponse");
        StringBuilder sb = new StringBuilder();
        if (this.event != null) {
            sb.append(", event=");
            sb.append(this.event);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        StringBuilder replace = sb.replace(0, 2, "OptimisticReplyCalendarEventInvitationWithSpanResponse{");
        replace.append('}');
        return replace.toString();
    }

    public OptimisticReplyCalendarEventInvitationWithSpanResponse(CalendarEvent calendarEvent, String str) {
        this(calendarEvent, str, ByteString.EMPTY);
    }

    public OptimisticReplyCalendarEventInvitationWithSpanResponse(CalendarEvent calendarEvent, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.event = calendarEvent;
        this.chat_id = str;
    }
}
