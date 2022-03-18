package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class OptimisticReplyCalendarEventInvitationResponse extends Message<OptimisticReplyCalendarEventInvitationResponse, C15892a> {
    public static final ProtoAdapter<OptimisticReplyCalendarEventInvitationResponse> ADAPTER = new C15893b();
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final CalendarEvent event;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.OptimisticReplyCalendarEventInvitationResponse$b */
    private static final class C15893b extends ProtoAdapter<OptimisticReplyCalendarEventInvitationResponse> {
        C15893b() {
            super(FieldEncoding.LENGTH_DELIMITED, OptimisticReplyCalendarEventInvitationResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(OptimisticReplyCalendarEventInvitationResponse optimisticReplyCalendarEventInvitationResponse) {
            int i;
            int i2 = 0;
            if (optimisticReplyCalendarEventInvitationResponse.event != null) {
                i = CalendarEvent.ADAPTER.encodedSizeWithTag(1, optimisticReplyCalendarEventInvitationResponse.event);
            } else {
                i = 0;
            }
            if (optimisticReplyCalendarEventInvitationResponse.chat_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, optimisticReplyCalendarEventInvitationResponse.chat_id);
            }
            return i + i2 + optimisticReplyCalendarEventInvitationResponse.unknownFields().size();
        }

        /* renamed from: a */
        public OptimisticReplyCalendarEventInvitationResponse decode(ProtoReader protoReader) throws IOException {
            C15892a aVar = new C15892a();
            aVar.f41845b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41844a = CalendarEvent.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41845b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, OptimisticReplyCalendarEventInvitationResponse optimisticReplyCalendarEventInvitationResponse) throws IOException {
            if (optimisticReplyCalendarEventInvitationResponse.event != null) {
                CalendarEvent.ADAPTER.encodeWithTag(protoWriter, 1, optimisticReplyCalendarEventInvitationResponse.event);
            }
            if (optimisticReplyCalendarEventInvitationResponse.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, optimisticReplyCalendarEventInvitationResponse.chat_id);
            }
            protoWriter.writeBytes(optimisticReplyCalendarEventInvitationResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.OptimisticReplyCalendarEventInvitationResponse$a */
    public static final class C15892a extends Message.Builder<OptimisticReplyCalendarEventInvitationResponse, C15892a> {

        /* renamed from: a */
        public CalendarEvent f41844a;

        /* renamed from: b */
        public String f41845b;

        /* renamed from: a */
        public OptimisticReplyCalendarEventInvitationResponse build() {
            return new OptimisticReplyCalendarEventInvitationResponse(this.f41844a, this.f41845b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15892a newBuilder() {
        C15892a aVar = new C15892a();
        aVar.f41844a = this.event;
        aVar.f41845b = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "OptimisticReplyCalendarEventInvitationResponse");
        StringBuilder sb = new StringBuilder();
        if (this.event != null) {
            sb.append(", event=");
            sb.append(this.event);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        StringBuilder replace = sb.replace(0, 2, "OptimisticReplyCalendarEventInvitationResponse{");
        replace.append('}');
        return replace.toString();
    }

    public OptimisticReplyCalendarEventInvitationResponse(CalendarEvent calendarEvent, String str) {
        this(calendarEvent, str, ByteString.EMPTY);
    }

    public OptimisticReplyCalendarEventInvitationResponse(CalendarEvent calendarEvent, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.event = calendarEvent;
        this.chat_id = str;
    }
}
