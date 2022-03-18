package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.calendar.v1.CalendarEvent;
import com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee;
import com.bytedance.lark.pb.calendar.v1.ConflictType;
import com.bytedance.lark.pb.calendar.v1.OldVersionCalendarEvent;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ShareCalendarEventContent extends Message<ShareCalendarEventContent, C15282a> {
    public static final ProtoAdapter<ShareCalendarEventContent> ADAPTER = new C15283b();
    public static final Integer DEFAULT_ATTENDEES_COUNT = 0;
    public static final Long DEFAULT_CONFLICT_TIME = 0L;
    public static final ConflictType DEFAULT_CONFLICT_TYPE = ConflictType.NONE;
    public static final Boolean DEFAULT_IS_JOINED = false;
    public static final Boolean DEFAULT_IS_SHARABLE = false;
    public static final CalendarEventAttendee.Status DEFAULT_SELF_ATTENDEE_STATUS = CalendarEventAttendee.Status.NEEDS_ACTION;
    private static final long serialVersionUID = 0;
    public final Integer attendees_count;
    public final CalendarEvent calendar_event;
    public final Long conflict_time;
    public final ConflictType conflict_type;
    public final String current_user_cal_id;
    public final Boolean is_joined;
    public final Boolean is_sharable;
    public final OldVersionCalendarEvent old_version_calendar_event;
    public final CalendarEventAttendee.Status self_attendee_status;

    /* renamed from: com.bytedance.lark.pb.basic.v1.ShareCalendarEventContent$b */
    private static final class C15283b extends ProtoAdapter<ShareCalendarEventContent> {
        C15283b() {
            super(FieldEncoding.LENGTH_DELIMITED, ShareCalendarEventContent.class);
        }

        /* renamed from: a */
        public int encodedSize(ShareCalendarEventContent shareCalendarEventContent) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int encodedSizeWithTag = OldVersionCalendarEvent.ADAPTER.encodedSizeWithTag(1, shareCalendarEventContent.old_version_calendar_event) + ProtoAdapter.INT32.encodedSizeWithTag(2, shareCalendarEventContent.attendees_count);
            int i7 = 0;
            if (shareCalendarEventContent.is_joined != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(3, shareCalendarEventContent.is_joined);
            } else {
                i = 0;
            }
            int i8 = encodedSizeWithTag + i;
            if (shareCalendarEventContent.is_sharable != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(4, shareCalendarEventContent.is_sharable);
            } else {
                i2 = 0;
            }
            int i9 = i8 + i2;
            if (shareCalendarEventContent.conflict_type != null) {
                i3 = ConflictType.ADAPTER.encodedSizeWithTag(5, shareCalendarEventContent.conflict_type);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (shareCalendarEventContent.conflict_time != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(6, shareCalendarEventContent.conflict_time);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (shareCalendarEventContent.calendar_event != null) {
                i5 = CalendarEvent.ADAPTER.encodedSizeWithTag(7, shareCalendarEventContent.calendar_event);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (shareCalendarEventContent.self_attendee_status != null) {
                i6 = CalendarEventAttendee.Status.ADAPTER.encodedSizeWithTag(8, shareCalendarEventContent.self_attendee_status);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (shareCalendarEventContent.current_user_cal_id != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(9, shareCalendarEventContent.current_user_cal_id);
            }
            return i13 + i7 + shareCalendarEventContent.unknownFields().size();
        }

        /* renamed from: a */
        public ShareCalendarEventContent decode(ProtoReader protoReader) throws IOException {
            C15282a aVar = new C15282a();
            aVar.f40477b = 0;
            aVar.f40478c = false;
            aVar.f40479d = false;
            aVar.f40480e = ConflictType.NONE;
            aVar.f40481f = 0L;
            aVar.f40483h = CalendarEventAttendee.Status.NEEDS_ACTION;
            aVar.f40484i = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f40476a = OldVersionCalendarEvent.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            aVar.f40477b = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            aVar.f40478c = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            aVar.f40479d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f40480e = ConflictType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 6:
                            aVar.f40481f = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            aVar.f40482g = CalendarEvent.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            try {
                                aVar.f40483h = CalendarEventAttendee.Status.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 9:
                            aVar.f40484i = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, ShareCalendarEventContent shareCalendarEventContent) throws IOException {
            OldVersionCalendarEvent.ADAPTER.encodeWithTag(protoWriter, 1, shareCalendarEventContent.old_version_calendar_event);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, shareCalendarEventContent.attendees_count);
            if (shareCalendarEventContent.is_joined != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, shareCalendarEventContent.is_joined);
            }
            if (shareCalendarEventContent.is_sharable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, shareCalendarEventContent.is_sharable);
            }
            if (shareCalendarEventContent.conflict_type != null) {
                ConflictType.ADAPTER.encodeWithTag(protoWriter, 5, shareCalendarEventContent.conflict_type);
            }
            if (shareCalendarEventContent.conflict_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, shareCalendarEventContent.conflict_time);
            }
            if (shareCalendarEventContent.calendar_event != null) {
                CalendarEvent.ADAPTER.encodeWithTag(protoWriter, 7, shareCalendarEventContent.calendar_event);
            }
            if (shareCalendarEventContent.self_attendee_status != null) {
                CalendarEventAttendee.Status.ADAPTER.encodeWithTag(protoWriter, 8, shareCalendarEventContent.self_attendee_status);
            }
            if (shareCalendarEventContent.current_user_cal_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, shareCalendarEventContent.current_user_cal_id);
            }
            protoWriter.writeBytes(shareCalendarEventContent.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.ShareCalendarEventContent$a */
    public static final class C15282a extends Message.Builder<ShareCalendarEventContent, C15282a> {

        /* renamed from: a */
        public OldVersionCalendarEvent f40476a;

        /* renamed from: b */
        public Integer f40477b;

        /* renamed from: c */
        public Boolean f40478c;

        /* renamed from: d */
        public Boolean f40479d;

        /* renamed from: e */
        public ConflictType f40480e;

        /* renamed from: f */
        public Long f40481f;

        /* renamed from: g */
        public CalendarEvent f40482g;

        /* renamed from: h */
        public CalendarEventAttendee.Status f40483h;

        /* renamed from: i */
        public String f40484i;

        /* renamed from: a */
        public ShareCalendarEventContent build() {
            Integer num;
            OldVersionCalendarEvent oldVersionCalendarEvent = this.f40476a;
            if (oldVersionCalendarEvent != null && (num = this.f40477b) != null) {
                return new ShareCalendarEventContent(oldVersionCalendarEvent, num, this.f40478c, this.f40479d, this.f40480e, this.f40481f, this.f40482g, this.f40483h, this.f40484i, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(oldVersionCalendarEvent, "old_version_calendar_event", this.f40477b, "attendees_count");
        }
    }

    @Override // com.squareup.wire.Message
    public C15282a newBuilder() {
        C15282a aVar = new C15282a();
        aVar.f40476a = this.old_version_calendar_event;
        aVar.f40477b = this.attendees_count;
        aVar.f40478c = this.is_joined;
        aVar.f40479d = this.is_sharable;
        aVar.f40480e = this.conflict_type;
        aVar.f40481f = this.conflict_time;
        aVar.f40482g = this.calendar_event;
        aVar.f40483h = this.self_attendee_status;
        aVar.f40484i = this.current_user_cal_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "ShareCalendarEventContent");
        StringBuilder sb = new StringBuilder();
        sb.append(", old_version_calendar_event=");
        sb.append(this.old_version_calendar_event);
        sb.append(", attendees_count=");
        sb.append(this.attendees_count);
        if (this.is_joined != null) {
            sb.append(", is_joined=");
            sb.append(this.is_joined);
        }
        if (this.is_sharable != null) {
            sb.append(", is_sharable=");
            sb.append(this.is_sharable);
        }
        if (this.conflict_type != null) {
            sb.append(", conflict_type=");
            sb.append(this.conflict_type);
        }
        if (this.conflict_time != null) {
            sb.append(", conflict_time=");
            sb.append(this.conflict_time);
        }
        if (this.calendar_event != null) {
            sb.append(", calendar_event=");
            sb.append(this.calendar_event);
        }
        if (this.self_attendee_status != null) {
            sb.append(", self_attendee_status=");
            sb.append(this.self_attendee_status);
        }
        if (this.current_user_cal_id != null) {
            sb.append(", current_user_cal_id=");
            sb.append(this.current_user_cal_id);
        }
        StringBuilder replace = sb.replace(0, 2, "ShareCalendarEventContent{");
        replace.append('}');
        return replace.toString();
    }

    public ShareCalendarEventContent(OldVersionCalendarEvent oldVersionCalendarEvent, Integer num, Boolean bool, Boolean bool2, ConflictType conflictType, Long l, CalendarEvent calendarEvent, CalendarEventAttendee.Status status, String str) {
        this(oldVersionCalendarEvent, num, bool, bool2, conflictType, l, calendarEvent, status, str, ByteString.EMPTY);
    }

    public ShareCalendarEventContent(OldVersionCalendarEvent oldVersionCalendarEvent, Integer num, Boolean bool, Boolean bool2, ConflictType conflictType, Long l, CalendarEvent calendarEvent, CalendarEventAttendee.Status status, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.old_version_calendar_event = oldVersionCalendarEvent;
        this.attendees_count = num;
        this.is_joined = bool;
        this.is_sharable = bool2;
        this.conflict_type = conflictType;
        this.conflict_time = l;
        this.calendar_event = calendarEvent;
        this.self_attendee_status = status;
        this.current_user_cal_id = str;
    }
}
