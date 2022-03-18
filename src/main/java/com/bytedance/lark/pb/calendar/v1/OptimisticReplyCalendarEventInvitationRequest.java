package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class OptimisticReplyCalendarEventInvitationRequest extends Message<OptimisticReplyCalendarEventInvitationRequest, C15890a> {
    public static final ProtoAdapter<OptimisticReplyCalendarEventInvitationRequest> ADAPTER = new C15891b();
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    public static final Boolean DEFAULT_QUIT_MEETING = false;
    public static final CalendarEventAttendee.Status DEFAULT_REPLY_STATUS = CalendarEventAttendee.Status.NEEDS_ACTION;
    private static final long serialVersionUID = 0;
    public final String calendar_id;
    public final String comment;
    public final String invite_operator_id;
    public final String key;
    public final String message_id;
    public final Long original_time;
    public final Boolean quit_meeting;
    public final CalendarEventAttendee.Status reply_status;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.OptimisticReplyCalendarEventInvitationRequest$b */
    private static final class C15891b extends ProtoAdapter<OptimisticReplyCalendarEventInvitationRequest> {
        C15891b() {
            super(FieldEncoding.LENGTH_DELIMITED, OptimisticReplyCalendarEventInvitationRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(OptimisticReplyCalendarEventInvitationRequest optimisticReplyCalendarEventInvitationRequest) {
            int i;
            int i2;
            int i3;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, optimisticReplyCalendarEventInvitationRequest.calendar_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, optimisticReplyCalendarEventInvitationRequest.key) + ProtoAdapter.INT64.encodedSizeWithTag(3, optimisticReplyCalendarEventInvitationRequest.original_time) + CalendarEventAttendee.Status.ADAPTER.encodedSizeWithTag(4, optimisticReplyCalendarEventInvitationRequest.reply_status);
            int i4 = 0;
            if (optimisticReplyCalendarEventInvitationRequest.message_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(5, optimisticReplyCalendarEventInvitationRequest.message_id);
            } else {
                i = 0;
            }
            int i5 = encodedSizeWithTag + i;
            if (optimisticReplyCalendarEventInvitationRequest.quit_meeting != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(6, optimisticReplyCalendarEventInvitationRequest.quit_meeting);
            } else {
                i2 = 0;
            }
            int i6 = i5 + i2;
            if (optimisticReplyCalendarEventInvitationRequest.comment != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(7, optimisticReplyCalendarEventInvitationRequest.comment);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (optimisticReplyCalendarEventInvitationRequest.invite_operator_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(8, optimisticReplyCalendarEventInvitationRequest.invite_operator_id);
            }
            return i7 + i4 + optimisticReplyCalendarEventInvitationRequest.unknownFields().size();
        }

        /* renamed from: a */
        public OptimisticReplyCalendarEventInvitationRequest decode(ProtoReader protoReader) throws IOException {
            C15890a aVar = new C15890a();
            aVar.f41836a = "";
            aVar.f41837b = "";
            aVar.f41838c = 0L;
            aVar.f41839d = CalendarEventAttendee.Status.NEEDS_ACTION;
            aVar.f41840e = "";
            aVar.f41841f = false;
            aVar.f41842g = "";
            aVar.f41843h = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41836a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f41837b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f41838c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            try {
                                aVar.f41839d = CalendarEventAttendee.Status.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            aVar.f41840e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f41841f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f41842g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f41843h = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, OptimisticReplyCalendarEventInvitationRequest optimisticReplyCalendarEventInvitationRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, optimisticReplyCalendarEventInvitationRequest.calendar_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, optimisticReplyCalendarEventInvitationRequest.key);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, optimisticReplyCalendarEventInvitationRequest.original_time);
            CalendarEventAttendee.Status.ADAPTER.encodeWithTag(protoWriter, 4, optimisticReplyCalendarEventInvitationRequest.reply_status);
            if (optimisticReplyCalendarEventInvitationRequest.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, optimisticReplyCalendarEventInvitationRequest.message_id);
            }
            if (optimisticReplyCalendarEventInvitationRequest.quit_meeting != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, optimisticReplyCalendarEventInvitationRequest.quit_meeting);
            }
            if (optimisticReplyCalendarEventInvitationRequest.comment != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, optimisticReplyCalendarEventInvitationRequest.comment);
            }
            if (optimisticReplyCalendarEventInvitationRequest.invite_operator_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, optimisticReplyCalendarEventInvitationRequest.invite_operator_id);
            }
            protoWriter.writeBytes(optimisticReplyCalendarEventInvitationRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15890a newBuilder() {
        C15890a aVar = new C15890a();
        aVar.f41836a = this.calendar_id;
        aVar.f41837b = this.key;
        aVar.f41838c = this.original_time;
        aVar.f41839d = this.reply_status;
        aVar.f41840e = this.message_id;
        aVar.f41841f = this.quit_meeting;
        aVar.f41842g = this.comment;
        aVar.f41843h = this.invite_operator_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.OptimisticReplyCalendarEventInvitationRequest$a */
    public static final class C15890a extends Message.Builder<OptimisticReplyCalendarEventInvitationRequest, C15890a> {

        /* renamed from: a */
        public String f41836a;

        /* renamed from: b */
        public String f41837b;

        /* renamed from: c */
        public Long f41838c;

        /* renamed from: d */
        public CalendarEventAttendee.Status f41839d;

        /* renamed from: e */
        public String f41840e;

        /* renamed from: f */
        public Boolean f41841f;

        /* renamed from: g */
        public String f41842g;

        /* renamed from: h */
        public String f41843h;

        /* renamed from: a */
        public OptimisticReplyCalendarEventInvitationRequest build() {
            String str;
            Long l;
            CalendarEventAttendee.Status status;
            String str2 = this.f41836a;
            if (str2 != null && (str = this.f41837b) != null && (l = this.f41838c) != null && (status = this.f41839d) != null) {
                return new OptimisticReplyCalendarEventInvitationRequest(str2, str, l, status, this.f41840e, this.f41841f, this.f41842g, this.f41843h, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "calendar_id", this.f41837b, "key", this.f41838c, "original_time", this.f41839d, "reply_status");
        }

        /* renamed from: a */
        public C15890a mo57296a(CalendarEventAttendee.Status status) {
            this.f41839d = status;
            return this;
        }

        /* renamed from: b */
        public C15890a mo57301b(String str) {
            this.f41837b = str;
            return this;
        }

        /* renamed from: c */
        public C15890a mo57302c(String str) {
            this.f41840e = str;
            return this;
        }

        /* renamed from: d */
        public C15890a mo57303d(String str) {
            this.f41842g = str;
            return this;
        }

        /* renamed from: e */
        public C15890a mo57304e(String str) {
            this.f41843h = str;
            return this;
        }

        /* renamed from: a */
        public C15890a mo57297a(Boolean bool) {
            this.f41841f = bool;
            return this;
        }

        /* renamed from: a */
        public C15890a mo57298a(Long l) {
            this.f41838c = l;
            return this;
        }

        /* renamed from: a */
        public C15890a mo57299a(String str) {
            this.f41836a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "OptimisticReplyCalendarEventInvitationRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", calendar_id=");
        sb.append(this.calendar_id);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", original_time=");
        sb.append(this.original_time);
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
        StringBuilder replace = sb.replace(0, 2, "OptimisticReplyCalendarEventInvitationRequest{");
        replace.append('}');
        return replace.toString();
    }

    public OptimisticReplyCalendarEventInvitationRequest(String str, String str2, Long l, CalendarEventAttendee.Status status, String str3, Boolean bool, String str4, String str5) {
        this(str, str2, l, status, str3, bool, str4, str5, ByteString.EMPTY);
    }

    public OptimisticReplyCalendarEventInvitationRequest(String str, String str2, Long l, CalendarEventAttendee.Status status, String str3, Boolean bool, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_id = str;
        this.key = str2;
        this.original_time = l;
        this.reply_status = status;
        this.message_id = str3;
        this.quit_meeting = bool;
        this.comment = str4;
        this.invite_operator_id = str5;
    }
}
