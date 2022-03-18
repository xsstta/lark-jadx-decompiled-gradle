package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.calendar.v1.CalendarEvent;
import com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class OptimisticReplyCalendarEventInvitationWithSpanRequest extends Message<OptimisticReplyCalendarEventInvitationWithSpanRequest, C15894a> {
    public static final ProtoAdapter<OptimisticReplyCalendarEventInvitationWithSpanRequest> ADAPTER = new C15895b();
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    public static final Boolean DEFAULT_QUIT_MEETING = false;
    public static final CalendarEventAttendee.Status DEFAULT_REPLY_STATUS = CalendarEventAttendee.Status.NEEDS_ACTION;
    public static final CalendarEvent.Span DEFAULT_SPAN = CalendarEvent.Span.NONE_SPAN;
    private static final long serialVersionUID = 0;
    public final String calendar_id;
    public final String comment;
    public final String invite_operator_id;
    public final String key;
    public final String message_id;
    public final Long original_time;
    public final Boolean quit_meeting;
    public final CalendarEventAttendee.Status reply_status;
    public final CalendarEvent.Span span;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.OptimisticReplyCalendarEventInvitationWithSpanRequest$b */
    private static final class C15895b extends ProtoAdapter<OptimisticReplyCalendarEventInvitationWithSpanRequest> {
        C15895b() {
            super(FieldEncoding.LENGTH_DELIMITED, OptimisticReplyCalendarEventInvitationWithSpanRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(OptimisticReplyCalendarEventInvitationWithSpanRequest optimisticReplyCalendarEventInvitationWithSpanRequest) {
            int i;
            int i2;
            int i3;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, optimisticReplyCalendarEventInvitationWithSpanRequest.calendar_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, optimisticReplyCalendarEventInvitationWithSpanRequest.key) + ProtoAdapter.INT64.encodedSizeWithTag(3, optimisticReplyCalendarEventInvitationWithSpanRequest.original_time) + CalendarEvent.Span.ADAPTER.encodedSizeWithTag(4, optimisticReplyCalendarEventInvitationWithSpanRequest.span) + CalendarEventAttendee.Status.ADAPTER.encodedSizeWithTag(5, optimisticReplyCalendarEventInvitationWithSpanRequest.reply_status);
            int i4 = 0;
            if (optimisticReplyCalendarEventInvitationWithSpanRequest.message_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(6, optimisticReplyCalendarEventInvitationWithSpanRequest.message_id);
            } else {
                i = 0;
            }
            int i5 = encodedSizeWithTag + i;
            if (optimisticReplyCalendarEventInvitationWithSpanRequest.quit_meeting != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(7, optimisticReplyCalendarEventInvitationWithSpanRequest.quit_meeting);
            } else {
                i2 = 0;
            }
            int i6 = i5 + i2;
            if (optimisticReplyCalendarEventInvitationWithSpanRequest.comment != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(8, optimisticReplyCalendarEventInvitationWithSpanRequest.comment);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (optimisticReplyCalendarEventInvitationWithSpanRequest.invite_operator_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(9, optimisticReplyCalendarEventInvitationWithSpanRequest.invite_operator_id);
            }
            return i7 + i4 + optimisticReplyCalendarEventInvitationWithSpanRequest.unknownFields().size();
        }

        /* renamed from: a */
        public OptimisticReplyCalendarEventInvitationWithSpanRequest decode(ProtoReader protoReader) throws IOException {
            C15894a aVar = new C15894a();
            aVar.f41846a = "";
            aVar.f41847b = "";
            aVar.f41848c = 0L;
            aVar.f41849d = CalendarEvent.Span.NONE_SPAN;
            aVar.f41850e = CalendarEventAttendee.Status.NEEDS_ACTION;
            aVar.f41851f = "";
            aVar.f41852g = false;
            aVar.f41853h = "";
            aVar.f41854i = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41846a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f41847b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f41848c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            try {
                                aVar.f41849d = CalendarEvent.Span.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            try {
                                aVar.f41850e = CalendarEventAttendee.Status.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 6:
                            aVar.f41851f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f41852g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            aVar.f41853h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f41854i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, OptimisticReplyCalendarEventInvitationWithSpanRequest optimisticReplyCalendarEventInvitationWithSpanRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, optimisticReplyCalendarEventInvitationWithSpanRequest.calendar_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, optimisticReplyCalendarEventInvitationWithSpanRequest.key);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, optimisticReplyCalendarEventInvitationWithSpanRequest.original_time);
            CalendarEvent.Span.ADAPTER.encodeWithTag(protoWriter, 4, optimisticReplyCalendarEventInvitationWithSpanRequest.span);
            CalendarEventAttendee.Status.ADAPTER.encodeWithTag(protoWriter, 5, optimisticReplyCalendarEventInvitationWithSpanRequest.reply_status);
            if (optimisticReplyCalendarEventInvitationWithSpanRequest.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, optimisticReplyCalendarEventInvitationWithSpanRequest.message_id);
            }
            if (optimisticReplyCalendarEventInvitationWithSpanRequest.quit_meeting != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, optimisticReplyCalendarEventInvitationWithSpanRequest.quit_meeting);
            }
            if (optimisticReplyCalendarEventInvitationWithSpanRequest.comment != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, optimisticReplyCalendarEventInvitationWithSpanRequest.comment);
            }
            if (optimisticReplyCalendarEventInvitationWithSpanRequest.invite_operator_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, optimisticReplyCalendarEventInvitationWithSpanRequest.invite_operator_id);
            }
            protoWriter.writeBytes(optimisticReplyCalendarEventInvitationWithSpanRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15894a newBuilder() {
        C15894a aVar = new C15894a();
        aVar.f41846a = this.calendar_id;
        aVar.f41847b = this.key;
        aVar.f41848c = this.original_time;
        aVar.f41849d = this.span;
        aVar.f41850e = this.reply_status;
        aVar.f41851f = this.message_id;
        aVar.f41852g = this.quit_meeting;
        aVar.f41853h = this.comment;
        aVar.f41854i = this.invite_operator_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.OptimisticReplyCalendarEventInvitationWithSpanRequest$a */
    public static final class C15894a extends Message.Builder<OptimisticReplyCalendarEventInvitationWithSpanRequest, C15894a> {

        /* renamed from: a */
        public String f41846a;

        /* renamed from: b */
        public String f41847b;

        /* renamed from: c */
        public Long f41848c;

        /* renamed from: d */
        public CalendarEvent.Span f41849d;

        /* renamed from: e */
        public CalendarEventAttendee.Status f41850e;

        /* renamed from: f */
        public String f41851f;

        /* renamed from: g */
        public Boolean f41852g;

        /* renamed from: h */
        public String f41853h;

        /* renamed from: i */
        public String f41854i;

        /* renamed from: a */
        public OptimisticReplyCalendarEventInvitationWithSpanRequest build() {
            String str;
            Long l;
            CalendarEvent.Span span;
            CalendarEventAttendee.Status status;
            String str2 = this.f41846a;
            if (str2 != null && (str = this.f41847b) != null && (l = this.f41848c) != null && (span = this.f41849d) != null && (status = this.f41850e) != null) {
                return new OptimisticReplyCalendarEventInvitationWithSpanRequest(str2, str, l, span, status, this.f41851f, this.f41852g, this.f41853h, this.f41854i, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "calendar_id", this.f41847b, "key", this.f41848c, "original_time", this.f41849d, "span", this.f41850e, "reply_status");
        }

        /* renamed from: a */
        public C15894a mo57312a(CalendarEvent.Span span) {
            this.f41849d = span;
            return this;
        }

        /* renamed from: b */
        public C15894a mo57318b(String str) {
            this.f41847b = str;
            return this;
        }

        /* renamed from: c */
        public C15894a mo57319c(String str) {
            this.f41851f = str;
            return this;
        }

        /* renamed from: d */
        public C15894a mo57320d(String str) {
            this.f41853h = str;
            return this;
        }

        /* renamed from: e */
        public C15894a mo57321e(String str) {
            this.f41854i = str;
            return this;
        }

        /* renamed from: a */
        public C15894a mo57313a(CalendarEventAttendee.Status status) {
            this.f41850e = status;
            return this;
        }

        /* renamed from: a */
        public C15894a mo57314a(Boolean bool) {
            this.f41852g = bool;
            return this;
        }

        /* renamed from: a */
        public C15894a mo57315a(Long l) {
            this.f41848c = l;
            return this;
        }

        /* renamed from: a */
        public C15894a mo57316a(String str) {
            this.f41846a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "OptimisticReplyCalendarEventInvitationWithSpanRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", calendar_id=");
        sb.append(this.calendar_id);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", original_time=");
        sb.append(this.original_time);
        sb.append(", span=");
        sb.append(this.span);
        sb.append(", reply_status=");
        sb.append(this.reply_status);
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.quit_meeting != null) {
            sb.append(", quit_meeting=");
            sb.append(this.quit_meeting);
        }
        if (this.comment != null) {
            sb.append(", comment=");
            sb.append(this.comment);
        }
        if (this.invite_operator_id != null) {
            sb.append(", invite_operator_id=");
            sb.append(this.invite_operator_id);
        }
        StringBuilder replace = sb.replace(0, 2, "OptimisticReplyCalendarEventInvitationWithSpanRequest{");
        replace.append('}');
        return replace.toString();
    }

    public OptimisticReplyCalendarEventInvitationWithSpanRequest(String str, String str2, Long l, CalendarEvent.Span span2, CalendarEventAttendee.Status status, String str3, Boolean bool, String str4, String str5) {
        this(str, str2, l, span2, status, str3, bool, str4, str5, ByteString.EMPTY);
    }

    public OptimisticReplyCalendarEventInvitationWithSpanRequest(String str, String str2, Long l, CalendarEvent.Span span2, CalendarEventAttendee.Status status, String str3, Boolean bool, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_id = str;
        this.key = str2;
        this.original_time = l;
        this.span = span2;
        this.reply_status = status;
        this.message_id = str3;
        this.quit_meeting = bool;
        this.comment = str4;
        this.invite_operator_id = str5;
    }
}
