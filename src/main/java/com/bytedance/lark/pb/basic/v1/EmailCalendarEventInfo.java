package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.LocationRequest;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class EmailCalendarEventInfo extends Message<EmailCalendarEventInfo, C14922a> {
    public static final ProtoAdapter<EmailCalendarEventInfo> ADAPTER = new C14923b();
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    public static final CalendarMailMessageType DEFAULT_TYPE = CalendarMailMessageType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String calendar_id;
    public final EventCancel event_cancel;
    public final EventInvite event_invite;
    public final EventNotFound event_not_found;
    public final EventReply event_reply;
    public final EventSelfDelete event_self_delete;
    public final String event_server_id;
    public final EventUpdate event_update;
    public final EventUpdateOutdated event_update_outdated;
    public final String mail_id;
    public final Long original_time;
    public final String sender_email;
    public final CalendarMailMessageType type;
    public final String uid;
    public final Unkown unkown;

    public enum AttendeeStatus implements WireEnum {
        NEEDS_ACTION(1),
        ACCEPT(2),
        TENTATIVE(3),
        DECLINE(4),
        REMOVED(5);
        
        public static final ProtoAdapter<AttendeeStatus> ADAPTER = ProtoAdapter.newEnumAdapter(AttendeeStatus.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static AttendeeStatus fromValue(int i) {
            if (i == 1) {
                return NEEDS_ACTION;
            }
            if (i == 2) {
                return ACCEPT;
            }
            if (i == 3) {
                return TENTATIVE;
            }
            if (i == 4) {
                return DECLINE;
            }
            if (i != 5) {
                return null;
            }
            return REMOVED;
        }

        private AttendeeStatus(int i) {
            this.value = i;
        }
    }

    public enum CalendarMailMessageType implements WireEnum {
        UNKNOWN(0),
        EVENT_INVITE(1),
        EVENT_CANCEL(2),
        EVENT_UPDATE(3),
        EVENT_UPDATE_OUTDATED(4),
        EVENT_REPLY(5),
        EVENT_SELF_DELETE(6),
        EVENT_NOT_FOUND(7);
        
        public static final ProtoAdapter<CalendarMailMessageType> ADAPTER = ProtoAdapter.newEnumAdapter(CalendarMailMessageType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static CalendarMailMessageType fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return EVENT_INVITE;
                case 2:
                    return EVENT_CANCEL;
                case 3:
                    return EVENT_UPDATE;
                case 4:
                    return EVENT_UPDATE_OUTDATED;
                case 5:
                    return EVENT_REPLY;
                case 6:
                    return EVENT_SELF_DELETE;
                case 7:
                    return EVENT_NOT_FOUND;
                default:
                    return null;
            }
        }

        private CalendarMailMessageType(int i) {
            this.value = i;
        }
    }

    public enum InteroperabilityType implements WireEnum {
        EXTERNAL(1);
        
        public static final ProtoAdapter<InteroperabilityType> ADAPTER = ProtoAdapter.newEnumAdapter(InteroperabilityType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static InteroperabilityType fromValue(int i) {
            if (i != 1) {
                return null;
            }
            return EXTERNAL;
        }

        private InteroperabilityType(int i) {
            this.value = i;
        }
    }

    public enum MailReplyStatus implements WireEnum {
        MAIL_ACCEPT(1),
        MAIL_TENTATIVE(2),
        MAIL_DECLINE(3);
        
        public static final ProtoAdapter<MailReplyStatus> ADAPTER = ProtoAdapter.newEnumAdapter(MailReplyStatus.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static MailReplyStatus fromValue(int i) {
            if (i == 1) {
                return MAIL_ACCEPT;
            }
            if (i == 2) {
                return MAIL_TENTATIVE;
            }
            if (i != 3) {
                return null;
            }
            return MAIL_DECLINE;
        }

        private MailReplyStatus(int i) {
            this.value = i;
        }
    }

    public enum OutdatedType implements WireEnum {
        ONTIME(1),
        CANCEL(2),
        UPDATE(3);
        
        public static final ProtoAdapter<OutdatedType> ADAPTER = ProtoAdapter.newEnumAdapter(OutdatedType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static OutdatedType fromValue(int i) {
            if (i == 1) {
                return ONTIME;
            }
            if (i == 2) {
                return CANCEL;
            }
            if (i != 3) {
                return null;
            }
            return UPDATE;
        }

        private OutdatedType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo$a */
    public static final class C14922a extends Message.Builder<EmailCalendarEventInfo, C14922a> {

        /* renamed from: a */
        public String f39463a;

        /* renamed from: b */
        public String f39464b;

        /* renamed from: c */
        public String f39465c;

        /* renamed from: d */
        public Long f39466d;

        /* renamed from: e */
        public String f39467e;

        /* renamed from: f */
        public String f39468f;

        /* renamed from: g */
        public CalendarMailMessageType f39469g;

        /* renamed from: h */
        public Unkown f39470h;

        /* renamed from: i */
        public EventInvite f39471i;

        /* renamed from: j */
        public EventCancel f39472j;

        /* renamed from: k */
        public EventUpdate f39473k;

        /* renamed from: l */
        public EventUpdateOutdated f39474l;

        /* renamed from: m */
        public EventReply f39475m;

        /* renamed from: n */
        public EventSelfDelete f39476n;

        /* renamed from: o */
        public EventNotFound f39477o;

        /* renamed from: a */
        public C14922a mo54650a(Unkown unkown) {
            this.f39470h = unkown;
            this.f39471i = null;
            this.f39472j = null;
            this.f39473k = null;
            this.f39474l = null;
            this.f39475m = null;
            this.f39476n = null;
            this.f39477o = null;
            return this;
        }

        /* renamed from: a */
        public EmailCalendarEventInfo build() {
            String str;
            String str2;
            Long l;
            String str3;
            String str4;
            String str5 = this.f39463a;
            if (str5 != null && (str = this.f39464b) != null && (str2 = this.f39465c) != null && (l = this.f39466d) != null && (str3 = this.f39467e) != null && (str4 = this.f39468f) != null) {
                return new EmailCalendarEventInfo(str5, str, str2, l, str3, str4, this.f39469g, this.f39470h, this.f39471i, this.f39472j, this.f39473k, this.f39474l, this.f39475m, this.f39476n, this.f39477o, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str5, "event_server_id", this.f39464b, "calendar_id", this.f39465c, "uid", this.f39466d, "original_time", this.f39467e, "mail_id", this.f39468f, "sender_email");
        }

        /* renamed from: a */
        public C14922a mo54643a(EventCancel eventCancel) {
            this.f39472j = eventCancel;
            this.f39470h = null;
            this.f39471i = null;
            this.f39473k = null;
            this.f39474l = null;
            this.f39475m = null;
            this.f39476n = null;
            this.f39477o = null;
            return this;
        }

        /* renamed from: a */
        public C14922a mo54644a(EventInvite eventInvite) {
            this.f39471i = eventInvite;
            this.f39470h = null;
            this.f39472j = null;
            this.f39473k = null;
            this.f39474l = null;
            this.f39475m = null;
            this.f39476n = null;
            this.f39477o = null;
            return this;
        }

        /* renamed from: a */
        public C14922a mo54645a(EventNotFound eventNotFound) {
            this.f39477o = eventNotFound;
            this.f39470h = null;
            this.f39471i = null;
            this.f39472j = null;
            this.f39473k = null;
            this.f39474l = null;
            this.f39475m = null;
            this.f39476n = null;
            return this;
        }

        /* renamed from: a */
        public C14922a mo54646a(EventReply eventReply) {
            this.f39475m = eventReply;
            this.f39470h = null;
            this.f39471i = null;
            this.f39472j = null;
            this.f39473k = null;
            this.f39474l = null;
            this.f39476n = null;
            this.f39477o = null;
            return this;
        }

        /* renamed from: a */
        public C14922a mo54647a(EventSelfDelete eventSelfDelete) {
            this.f39476n = eventSelfDelete;
            this.f39470h = null;
            this.f39471i = null;
            this.f39472j = null;
            this.f39473k = null;
            this.f39474l = null;
            this.f39475m = null;
            this.f39477o = null;
            return this;
        }

        /* renamed from: a */
        public C14922a mo54648a(EventUpdate eventUpdate) {
            this.f39473k = eventUpdate;
            this.f39470h = null;
            this.f39471i = null;
            this.f39472j = null;
            this.f39474l = null;
            this.f39475m = null;
            this.f39476n = null;
            this.f39477o = null;
            return this;
        }

        /* renamed from: a */
        public C14922a mo54649a(EventUpdateOutdated eventUpdateOutdated) {
            this.f39474l = eventUpdateOutdated;
            this.f39470h = null;
            this.f39471i = null;
            this.f39472j = null;
            this.f39473k = null;
            this.f39475m = null;
            this.f39476n = null;
            this.f39477o = null;
            return this;
        }
    }

    public static final class EventCancel extends Message<EventCancel, C14902a> {
        public static final ProtoAdapter<EventCancel> ADAPTER = new C14903b();
        public static final OutdatedType DEFAULT_OUTDATED_TYPE = OutdatedType.ONTIME;
        private static final long serialVersionUID = 0;
        public final PartEventInfo event_info;
        public final OutdatedType outdated_type;

        /* renamed from: com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo$EventCancel$b */
        private static final class C14903b extends ProtoAdapter<EventCancel> {
            C14903b() {
                super(FieldEncoding.LENGTH_DELIMITED, EventCancel.class);
            }

            /* renamed from: a */
            public int encodedSize(EventCancel eventCancel) {
                int i;
                int i2 = 0;
                if (eventCancel.event_info != null) {
                    i = PartEventInfo.ADAPTER.encodedSizeWithTag(1, eventCancel.event_info);
                } else {
                    i = 0;
                }
                if (eventCancel.outdated_type != null) {
                    i2 = OutdatedType.ADAPTER.encodedSizeWithTag(2, eventCancel.outdated_type);
                }
                return i + i2 + eventCancel.unknownFields().size();
            }

            /* renamed from: a */
            public EventCancel decode(ProtoReader protoReader) throws IOException {
                C14902a aVar = new C14902a();
                aVar.f39428b = OutdatedType.ONTIME;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f39427a = PartEventInfo.ADAPTER.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f39428b = OutdatedType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, EventCancel eventCancel) throws IOException {
                if (eventCancel.event_info != null) {
                    PartEventInfo.ADAPTER.encodeWithTag(protoWriter, 1, eventCancel.event_info);
                }
                if (eventCancel.outdated_type != null) {
                    OutdatedType.ADAPTER.encodeWithTag(protoWriter, 2, eventCancel.outdated_type);
                }
                protoWriter.writeBytes(eventCancel.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo$EventCancel$a */
        public static final class C14902a extends Message.Builder<EventCancel, C14902a> {

            /* renamed from: a */
            public PartEventInfo f39427a;

            /* renamed from: b */
            public OutdatedType f39428b;

            /* renamed from: a */
            public EventCancel build() {
                return new EventCancel(this.f39427a, this.f39428b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14902a newBuilder() {
            C14902a aVar = new C14902a();
            aVar.f39427a = this.event_info;
            aVar.f39428b = this.outdated_type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "EventCancel");
            StringBuilder sb = new StringBuilder();
            if (this.event_info != null) {
                sb.append(", event_info=");
                sb.append(this.event_info);
            }
            if (this.outdated_type != null) {
                sb.append(", outdated_type=");
                sb.append(this.outdated_type);
            }
            StringBuilder replace = sb.replace(0, 2, "EventCancel{");
            replace.append('}');
            return replace.toString();
        }

        public EventCancel(PartEventInfo partEventInfo, OutdatedType outdatedType) {
            this(partEventInfo, outdatedType, ByteString.EMPTY);
        }

        public EventCancel(PartEventInfo partEventInfo, OutdatedType outdatedType, ByteString byteString) {
            super(ADAPTER, byteString);
            this.event_info = partEventInfo;
            this.outdated_type = outdatedType;
        }
    }

    public static final class EventInvite extends Message<EventInvite, C14904a> {
        public static final ProtoAdapter<EventInvite> ADAPTER = new C14905b();
        private static final long serialVersionUID = 0;
        public final FullEventInfo event_info;

        /* renamed from: com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo$EventInvite$b */
        private static final class C14905b extends ProtoAdapter<EventInvite> {
            C14905b() {
                super(FieldEncoding.LENGTH_DELIMITED, EventInvite.class);
            }

            /* renamed from: a */
            public int encodedSize(EventInvite eventInvite) {
                int i;
                if (eventInvite.event_info != null) {
                    i = FullEventInfo.ADAPTER.encodedSizeWithTag(1, eventInvite.event_info);
                } else {
                    i = 0;
                }
                return i + eventInvite.unknownFields().size();
            }

            /* renamed from: a */
            public EventInvite decode(ProtoReader protoReader) throws IOException {
                C14904a aVar = new C14904a();
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
                        aVar.f39429a = FullEventInfo.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, EventInvite eventInvite) throws IOException {
                if (eventInvite.event_info != null) {
                    FullEventInfo.ADAPTER.encodeWithTag(protoWriter, 1, eventInvite.event_info);
                }
                protoWriter.writeBytes(eventInvite.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo$EventInvite$a */
        public static final class C14904a extends Message.Builder<EventInvite, C14904a> {

            /* renamed from: a */
            public FullEventInfo f39429a;

            /* renamed from: a */
            public EventInvite build() {
                return new EventInvite(this.f39429a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14904a newBuilder() {
            C14904a aVar = new C14904a();
            aVar.f39429a = this.event_info;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "EventInvite");
            StringBuilder sb = new StringBuilder();
            if (this.event_info != null) {
                sb.append(", event_info=");
                sb.append(this.event_info);
            }
            StringBuilder replace = sb.replace(0, 2, "EventInvite{");
            replace.append('}');
            return replace.toString();
        }

        public EventInvite(FullEventInfo fullEventInfo) {
            this(fullEventInfo, ByteString.EMPTY);
        }

        public EventInvite(FullEventInfo fullEventInfo, ByteString byteString) {
            super(ADAPTER, byteString);
            this.event_info = fullEventInfo;
        }
    }

    public static final class EventNotFound extends Message<EventNotFound, C14906a> {
        public static final ProtoAdapter<EventNotFound> ADAPTER = new C14907b();
        private static final long serialVersionUID = 0;
        public final FullEventInfo event_info;

        /* renamed from: com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo$EventNotFound$b */
        private static final class C14907b extends ProtoAdapter<EventNotFound> {
            C14907b() {
                super(FieldEncoding.LENGTH_DELIMITED, EventNotFound.class);
            }

            /* renamed from: a */
            public int encodedSize(EventNotFound eventNotFound) {
                int i;
                if (eventNotFound.event_info != null) {
                    i = FullEventInfo.ADAPTER.encodedSizeWithTag(1, eventNotFound.event_info);
                } else {
                    i = 0;
                }
                return i + eventNotFound.unknownFields().size();
            }

            /* renamed from: a */
            public EventNotFound decode(ProtoReader protoReader) throws IOException {
                C14906a aVar = new C14906a();
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
                        aVar.f39430a = FullEventInfo.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, EventNotFound eventNotFound) throws IOException {
                if (eventNotFound.event_info != null) {
                    FullEventInfo.ADAPTER.encodeWithTag(protoWriter, 1, eventNotFound.event_info);
                }
                protoWriter.writeBytes(eventNotFound.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo$EventNotFound$a */
        public static final class C14906a extends Message.Builder<EventNotFound, C14906a> {

            /* renamed from: a */
            public FullEventInfo f39430a;

            /* renamed from: a */
            public EventNotFound build() {
                return new EventNotFound(this.f39430a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14906a newBuilder() {
            C14906a aVar = new C14906a();
            aVar.f39430a = this.event_info;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "EventNotFound");
            StringBuilder sb = new StringBuilder();
            if (this.event_info != null) {
                sb.append(", event_info=");
                sb.append(this.event_info);
            }
            StringBuilder replace = sb.replace(0, 2, "EventNotFound{");
            replace.append('}');
            return replace.toString();
        }

        public EventNotFound(FullEventInfo fullEventInfo) {
            this(fullEventInfo, ByteString.EMPTY);
        }

        public EventNotFound(FullEventInfo fullEventInfo, ByteString byteString) {
            super(ADAPTER, byteString);
            this.event_info = fullEventInfo;
        }
    }

    public static final class EventReply extends Message<EventReply, C14908a> {
        public static final ProtoAdapter<EventReply> ADAPTER = new C14909b();
        public static final Long DEFAULT_END_TIME = 0L;
        public static final Boolean DEFAULT_IS_ALL_DAY = false;
        public static final Boolean DEFAULT_IS_LATEST = true;
        public static final OutdatedType DEFAULT_OUTDATED_TYPE = OutdatedType.ONTIME;
        public static final MailReplyStatus DEFAULT_REPLY_STATUS = MailReplyStatus.MAIL_ACCEPT;
        public static final Long DEFAULT_START_TIME = 0L;
        private static final long serialVersionUID = 0;
        public final Long end_time;
        public final String end_timezone;
        public final PartEventInfo event_info;
        public final Boolean is_all_day;
        public final Boolean is_latest;
        public final OutdatedType outdated_type;
        public final MailReplyStatus reply_status;
        public final String rrule;
        public final Long start_time;
        public final String start_timezone;

        /* renamed from: com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo$EventReply$b */
        private static final class C14909b extends ProtoAdapter<EventReply> {
            C14909b() {
                super(FieldEncoding.LENGTH_DELIMITED, EventReply.class);
            }

            /* renamed from: a */
            public int encodedSize(EventReply eventReply) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                int i10 = 0;
                if (eventReply.event_info != null) {
                    i = PartEventInfo.ADAPTER.encodedSizeWithTag(1, eventReply.event_info);
                } else {
                    i = 0;
                }
                if (eventReply.is_latest != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, eventReply.is_latest);
                } else {
                    i2 = 0;
                }
                int i11 = i + i2;
                if (eventReply.outdated_type != null) {
                    i3 = OutdatedType.ADAPTER.encodedSizeWithTag(3, eventReply.outdated_type);
                } else {
                    i3 = 0;
                }
                int i12 = i11 + i3;
                if (eventReply.reply_status != null) {
                    i4 = MailReplyStatus.ADAPTER.encodedSizeWithTag(4, eventReply.reply_status);
                } else {
                    i4 = 0;
                }
                int i13 = i12 + i4;
                if (eventReply.start_time != null) {
                    i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, eventReply.start_time);
                } else {
                    i5 = 0;
                }
                int i14 = i13 + i5;
                if (eventReply.start_timezone != null) {
                    i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, eventReply.start_timezone);
                } else {
                    i6 = 0;
                }
                int i15 = i14 + i6;
                if (eventReply.end_time != null) {
                    i7 = ProtoAdapter.INT64.encodedSizeWithTag(7, eventReply.end_time);
                } else {
                    i7 = 0;
                }
                int i16 = i15 + i7;
                if (eventReply.end_timezone != null) {
                    i8 = ProtoAdapter.STRING.encodedSizeWithTag(8, eventReply.end_timezone);
                } else {
                    i8 = 0;
                }
                int i17 = i16 + i8;
                if (eventReply.rrule != null) {
                    i9 = ProtoAdapter.STRING.encodedSizeWithTag(9, eventReply.rrule);
                } else {
                    i9 = 0;
                }
                int i18 = i17 + i9;
                if (eventReply.is_all_day != null) {
                    i10 = ProtoAdapter.BOOL.encodedSizeWithTag(10, eventReply.is_all_day);
                }
                return i18 + i10 + eventReply.unknownFields().size();
            }

            /* renamed from: a */
            public EventReply decode(ProtoReader protoReader) throws IOException {
                C14908a aVar = new C14908a();
                aVar.f39432b = true;
                aVar.f39433c = OutdatedType.ONTIME;
                aVar.f39434d = MailReplyStatus.MAIL_ACCEPT;
                aVar.f39435e = 0L;
                aVar.f39436f = "";
                aVar.f39437g = 0L;
                aVar.f39438h = "";
                aVar.f39439i = "";
                aVar.f39440j = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f39431a = PartEventInfo.ADAPTER.decode(protoReader);
                                break;
                            case 2:
                                aVar.f39432b = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 3:
                                try {
                                    aVar.f39433c = OutdatedType.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 4:
                                try {
                                    aVar.f39434d = MailReplyStatus.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                    break;
                                }
                            case 5:
                                aVar.f39435e = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 6:
                                aVar.f39436f = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 7:
                                aVar.f39437g = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 8:
                                aVar.f39438h = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 9:
                                aVar.f39439i = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 10:
                                aVar.f39440j = ProtoAdapter.BOOL.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, EventReply eventReply) throws IOException {
                if (eventReply.event_info != null) {
                    PartEventInfo.ADAPTER.encodeWithTag(protoWriter, 1, eventReply.event_info);
                }
                if (eventReply.is_latest != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, eventReply.is_latest);
                }
                if (eventReply.outdated_type != null) {
                    OutdatedType.ADAPTER.encodeWithTag(protoWriter, 3, eventReply.outdated_type);
                }
                if (eventReply.reply_status != null) {
                    MailReplyStatus.ADAPTER.encodeWithTag(protoWriter, 4, eventReply.reply_status);
                }
                if (eventReply.start_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, eventReply.start_time);
                }
                if (eventReply.start_timezone != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, eventReply.start_timezone);
                }
                if (eventReply.end_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, eventReply.end_time);
                }
                if (eventReply.end_timezone != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, eventReply.end_timezone);
                }
                if (eventReply.rrule != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, eventReply.rrule);
                }
                if (eventReply.is_all_day != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, eventReply.is_all_day);
                }
                protoWriter.writeBytes(eventReply.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo$EventReply$a */
        public static final class C14908a extends Message.Builder<EventReply, C14908a> {

            /* renamed from: a */
            public PartEventInfo f39431a;

            /* renamed from: b */
            public Boolean f39432b;

            /* renamed from: c */
            public OutdatedType f39433c;

            /* renamed from: d */
            public MailReplyStatus f39434d;

            /* renamed from: e */
            public Long f39435e;

            /* renamed from: f */
            public String f39436f;

            /* renamed from: g */
            public Long f39437g;

            /* renamed from: h */
            public String f39438h;

            /* renamed from: i */
            public String f39439i;

            /* renamed from: j */
            public Boolean f39440j;

            /* renamed from: a */
            public EventReply build() {
                return new EventReply(this.f39431a, this.f39432b, this.f39433c, this.f39434d, this.f39435e, this.f39436f, this.f39437g, this.f39438h, this.f39439i, this.f39440j, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14908a newBuilder() {
            C14908a aVar = new C14908a();
            aVar.f39431a = this.event_info;
            aVar.f39432b = this.is_latest;
            aVar.f39433c = this.outdated_type;
            aVar.f39434d = this.reply_status;
            aVar.f39435e = this.start_time;
            aVar.f39436f = this.start_timezone;
            aVar.f39437g = this.end_time;
            aVar.f39438h = this.end_timezone;
            aVar.f39439i = this.rrule;
            aVar.f39440j = this.is_all_day;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "EventReply");
            StringBuilder sb = new StringBuilder();
            if (this.event_info != null) {
                sb.append(", event_info=");
                sb.append(this.event_info);
            }
            if (this.is_latest != null) {
                sb.append(", is_latest=");
                sb.append(this.is_latest);
            }
            if (this.outdated_type != null) {
                sb.append(", outdated_type=");
                sb.append(this.outdated_type);
            }
            if (this.reply_status != null) {
                sb.append(", reply_status=");
                sb.append(this.reply_status);
            }
            if (this.start_time != null) {
                sb.append(", start_time=");
                sb.append(this.start_time);
            }
            if (this.start_timezone != null) {
                sb.append(", start_timezone=");
                sb.append(this.start_timezone);
            }
            if (this.end_time != null) {
                sb.append(", end_time=");
                sb.append(this.end_time);
            }
            if (this.end_timezone != null) {
                sb.append(", end_timezone=");
                sb.append(this.end_timezone);
            }
            if (this.rrule != null) {
                sb.append(", rrule=");
                sb.append(this.rrule);
            }
            if (this.is_all_day != null) {
                sb.append(", is_all_day=");
                sb.append(this.is_all_day);
            }
            StringBuilder replace = sb.replace(0, 2, "EventReply{");
            replace.append('}');
            return replace.toString();
        }

        public EventReply(PartEventInfo partEventInfo, Boolean bool, OutdatedType outdatedType, MailReplyStatus mailReplyStatus, Long l, String str, Long l2, String str2, String str3, Boolean bool2) {
            this(partEventInfo, bool, outdatedType, mailReplyStatus, l, str, l2, str2, str3, bool2, ByteString.EMPTY);
        }

        public EventReply(PartEventInfo partEventInfo, Boolean bool, OutdatedType outdatedType, MailReplyStatus mailReplyStatus, Long l, String str, Long l2, String str2, String str3, Boolean bool2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.event_info = partEventInfo;
            this.is_latest = bool;
            this.outdated_type = outdatedType;
            this.reply_status = mailReplyStatus;
            this.start_time = l;
            this.start_timezone = str;
            this.end_time = l2;
            this.end_timezone = str2;
            this.rrule = str3;
            this.is_all_day = bool2;
        }
    }

    public static final class EventSelfDelete extends Message<EventSelfDelete, C14910a> {
        public static final ProtoAdapter<EventSelfDelete> ADAPTER = new C14911b();
        public static final CalendarMailMessageType DEFAULT_ORIGINAL_TYPE = CalendarMailMessageType.UNKNOWN;
        private static final long serialVersionUID = 0;
        public final PartEventInfo event_info;
        public final CalendarMailMessageType original_type;

        /* renamed from: com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo$EventSelfDelete$b */
        private static final class C14911b extends ProtoAdapter<EventSelfDelete> {
            C14911b() {
                super(FieldEncoding.LENGTH_DELIMITED, EventSelfDelete.class);
            }

            /* renamed from: a */
            public int encodedSize(EventSelfDelete eventSelfDelete) {
                int i;
                int i2 = 0;
                if (eventSelfDelete.event_info != null) {
                    i = PartEventInfo.ADAPTER.encodedSizeWithTag(1, eventSelfDelete.event_info);
                } else {
                    i = 0;
                }
                if (eventSelfDelete.original_type != null) {
                    i2 = CalendarMailMessageType.ADAPTER.encodedSizeWithTag(2, eventSelfDelete.original_type);
                }
                return i + i2 + eventSelfDelete.unknownFields().size();
            }

            /* renamed from: a */
            public EventSelfDelete decode(ProtoReader protoReader) throws IOException {
                C14910a aVar = new C14910a();
                aVar.f39442b = CalendarMailMessageType.UNKNOWN;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f39441a = PartEventInfo.ADAPTER.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f39442b = CalendarMailMessageType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, EventSelfDelete eventSelfDelete) throws IOException {
                if (eventSelfDelete.event_info != null) {
                    PartEventInfo.ADAPTER.encodeWithTag(protoWriter, 1, eventSelfDelete.event_info);
                }
                if (eventSelfDelete.original_type != null) {
                    CalendarMailMessageType.ADAPTER.encodeWithTag(protoWriter, 2, eventSelfDelete.original_type);
                }
                protoWriter.writeBytes(eventSelfDelete.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo$EventSelfDelete$a */
        public static final class C14910a extends Message.Builder<EventSelfDelete, C14910a> {

            /* renamed from: a */
            public PartEventInfo f39441a;

            /* renamed from: b */
            public CalendarMailMessageType f39442b;

            /* renamed from: a */
            public EventSelfDelete build() {
                return new EventSelfDelete(this.f39441a, this.f39442b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14910a newBuilder() {
            C14910a aVar = new C14910a();
            aVar.f39441a = this.event_info;
            aVar.f39442b = this.original_type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "EventSelfDelete");
            StringBuilder sb = new StringBuilder();
            if (this.event_info != null) {
                sb.append(", event_info=");
                sb.append(this.event_info);
            }
            if (this.original_type != null) {
                sb.append(", original_type=");
                sb.append(this.original_type);
            }
            StringBuilder replace = sb.replace(0, 2, "EventSelfDelete{");
            replace.append('}');
            return replace.toString();
        }

        public EventSelfDelete(PartEventInfo partEventInfo, CalendarMailMessageType calendarMailMessageType) {
            this(partEventInfo, calendarMailMessageType, ByteString.EMPTY);
        }

        public EventSelfDelete(PartEventInfo partEventInfo, CalendarMailMessageType calendarMailMessageType, ByteString byteString) {
            super(ADAPTER, byteString);
            this.event_info = partEventInfo;
            this.original_type = calendarMailMessageType;
        }
    }

    public static final class EventUpdate extends Message<EventUpdate, C14912a> {
        public static final ProtoAdapter<EventUpdate> ADAPTER = new C14913b();
        private static final long serialVersionUID = 0;
        public final FullEventInfo event_info;

        /* renamed from: com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo$EventUpdate$b */
        private static final class C14913b extends ProtoAdapter<EventUpdate> {
            C14913b() {
                super(FieldEncoding.LENGTH_DELIMITED, EventUpdate.class);
            }

            /* renamed from: a */
            public int encodedSize(EventUpdate eventUpdate) {
                int i;
                if (eventUpdate.event_info != null) {
                    i = FullEventInfo.ADAPTER.encodedSizeWithTag(1, eventUpdate.event_info);
                } else {
                    i = 0;
                }
                return i + eventUpdate.unknownFields().size();
            }

            /* renamed from: a */
            public EventUpdate decode(ProtoReader protoReader) throws IOException {
                C14912a aVar = new C14912a();
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
                        aVar.f39443a = FullEventInfo.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, EventUpdate eventUpdate) throws IOException {
                if (eventUpdate.event_info != null) {
                    FullEventInfo.ADAPTER.encodeWithTag(protoWriter, 1, eventUpdate.event_info);
                }
                protoWriter.writeBytes(eventUpdate.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo$EventUpdate$a */
        public static final class C14912a extends Message.Builder<EventUpdate, C14912a> {

            /* renamed from: a */
            public FullEventInfo f39443a;

            /* renamed from: a */
            public EventUpdate build() {
                return new EventUpdate(this.f39443a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14912a newBuilder() {
            C14912a aVar = new C14912a();
            aVar.f39443a = this.event_info;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "EventUpdate");
            StringBuilder sb = new StringBuilder();
            if (this.event_info != null) {
                sb.append(", event_info=");
                sb.append(this.event_info);
            }
            StringBuilder replace = sb.replace(0, 2, "EventUpdate{");
            replace.append('}');
            return replace.toString();
        }

        public EventUpdate(FullEventInfo fullEventInfo) {
            this(fullEventInfo, ByteString.EMPTY);
        }

        public EventUpdate(FullEventInfo fullEventInfo, ByteString byteString) {
            super(ADAPTER, byteString);
            this.event_info = fullEventInfo;
        }
    }

    public static final class EventUpdateOutdated extends Message<EventUpdateOutdated, C14914a> {
        public static final ProtoAdapter<EventUpdateOutdated> ADAPTER = new C14915b();
        public static final OutdatedType DEFAULT_OUTDATED_TYPE = OutdatedType.UPDATE;
        private static final long serialVersionUID = 0;
        public final PartEventInfo event_info;
        public final OutdatedType outdated_type;

        /* renamed from: com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo$EventUpdateOutdated$b */
        private static final class C14915b extends ProtoAdapter<EventUpdateOutdated> {
            C14915b() {
                super(FieldEncoding.LENGTH_DELIMITED, EventUpdateOutdated.class);
            }

            /* renamed from: a */
            public int encodedSize(EventUpdateOutdated eventUpdateOutdated) {
                int i;
                int i2 = 0;
                if (eventUpdateOutdated.event_info != null) {
                    i = PartEventInfo.ADAPTER.encodedSizeWithTag(1, eventUpdateOutdated.event_info);
                } else {
                    i = 0;
                }
                if (eventUpdateOutdated.outdated_type != null) {
                    i2 = OutdatedType.ADAPTER.encodedSizeWithTag(2, eventUpdateOutdated.outdated_type);
                }
                return i + i2 + eventUpdateOutdated.unknownFields().size();
            }

            /* renamed from: a */
            public EventUpdateOutdated decode(ProtoReader protoReader) throws IOException {
                C14914a aVar = new C14914a();
                aVar.f39445b = OutdatedType.UPDATE;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f39444a = PartEventInfo.ADAPTER.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f39445b = OutdatedType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, EventUpdateOutdated eventUpdateOutdated) throws IOException {
                if (eventUpdateOutdated.event_info != null) {
                    PartEventInfo.ADAPTER.encodeWithTag(protoWriter, 1, eventUpdateOutdated.event_info);
                }
                if (eventUpdateOutdated.outdated_type != null) {
                    OutdatedType.ADAPTER.encodeWithTag(protoWriter, 2, eventUpdateOutdated.outdated_type);
                }
                protoWriter.writeBytes(eventUpdateOutdated.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo$EventUpdateOutdated$a */
        public static final class C14914a extends Message.Builder<EventUpdateOutdated, C14914a> {

            /* renamed from: a */
            public PartEventInfo f39444a;

            /* renamed from: b */
            public OutdatedType f39445b;

            /* renamed from: a */
            public EventUpdateOutdated build() {
                return new EventUpdateOutdated(this.f39444a, this.f39445b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14914a newBuilder() {
            C14914a aVar = new C14914a();
            aVar.f39444a = this.event_info;
            aVar.f39445b = this.outdated_type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "EventUpdateOutdated");
            StringBuilder sb = new StringBuilder();
            if (this.event_info != null) {
                sb.append(", event_info=");
                sb.append(this.event_info);
            }
            if (this.outdated_type != null) {
                sb.append(", outdated_type=");
                sb.append(this.outdated_type);
            }
            StringBuilder replace = sb.replace(0, 2, "EventUpdateOutdated{");
            replace.append('}');
            return replace.toString();
        }

        public EventUpdateOutdated(PartEventInfo partEventInfo, OutdatedType outdatedType) {
            this(partEventInfo, outdatedType, ByteString.EMPTY);
        }

        public EventUpdateOutdated(PartEventInfo partEventInfo, OutdatedType outdatedType, ByteString byteString) {
            super(ADAPTER, byteString);
            this.event_info = partEventInfo;
            this.outdated_type = outdatedType;
        }
    }

    public static final class FullEventInfo extends Message<FullEventInfo, C14916a> {
        public static final ProtoAdapter<FullEventInfo> ADAPTER = new C14917b();
        public static final Long DEFAULT_END_TIME = 0L;
        public static final InteroperabilityType DEFAULT_INTER_TYPE = InteroperabilityType.EXTERNAL;
        public static final Boolean DEFAULT_IS_ALL_DAY = false;
        public static final Boolean DEFAULT_IS_SELF_ATTENDEE_OPTIONAL = true;
        public static final AttendeeStatus DEFAULT_SELF_ATTENDEE_STATUS = AttendeeStatus.NEEDS_ACTION;
        public static final Long DEFAULT_START_TIME = 0L;
        private static final long serialVersionUID = 0;
        public final List<String> attendee_emails;
        public final CalendarEventConflictInfo conflict_info;
        public final Long end_time;
        public final String end_timezone;
        public final InteroperabilityType inter_type;
        public final Boolean is_all_day;
        public final Boolean is_self_attendee_optional;
        public final String location;
        public final String organizer_email;
        public final String rrule;
        public final AttendeeStatus self_attendee_status;
        public final Long start_time;
        public final String start_timezone;
        public final String summary;

        /* renamed from: com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo$FullEventInfo$b */
        private static final class C14917b extends ProtoAdapter<FullEventInfo> {
            C14917b() {
                super(FieldEncoding.LENGTH_DELIMITED, FullEventInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(FullEventInfo fullEventInfo) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                int i10;
                int i11;
                int i12;
                int i13 = 0;
                if (fullEventInfo.start_time != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, fullEventInfo.start_time);
                } else {
                    i = 0;
                }
                if (fullEventInfo.start_timezone != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, fullEventInfo.start_timezone);
                } else {
                    i2 = 0;
                }
                int i14 = i + i2;
                if (fullEventInfo.end_time != null) {
                    i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, fullEventInfo.end_time);
                } else {
                    i3 = 0;
                }
                int i15 = i14 + i3;
                if (fullEventInfo.end_timezone != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, fullEventInfo.end_timezone);
                } else {
                    i4 = 0;
                }
                int i16 = i15 + i4;
                if (fullEventInfo.is_all_day != null) {
                    i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, fullEventInfo.is_all_day);
                } else {
                    i5 = 0;
                }
                int i17 = i16 + i5;
                if (fullEventInfo.summary != null) {
                    i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, fullEventInfo.summary);
                } else {
                    i6 = 0;
                }
                int i18 = i17 + i6;
                if (fullEventInfo.location != null) {
                    i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, fullEventInfo.location);
                } else {
                    i7 = 0;
                }
                int i19 = i18 + i7;
                if (fullEventInfo.rrule != null) {
                    i8 = ProtoAdapter.STRING.encodedSizeWithTag(8, fullEventInfo.rrule);
                } else {
                    i8 = 0;
                }
                int i20 = i19 + i8;
                if (fullEventInfo.is_self_attendee_optional != null) {
                    i9 = ProtoAdapter.BOOL.encodedSizeWithTag(9, fullEventInfo.is_self_attendee_optional);
                } else {
                    i9 = 0;
                }
                int i21 = i20 + i9;
                if (fullEventInfo.inter_type != null) {
                    i10 = InteroperabilityType.ADAPTER.encodedSizeWithTag(10, fullEventInfo.inter_type);
                } else {
                    i10 = 0;
                }
                int i22 = i21 + i10;
                if (fullEventInfo.organizer_email != null) {
                    i11 = ProtoAdapter.STRING.encodedSizeWithTag(11, fullEventInfo.organizer_email);
                } else {
                    i11 = 0;
                }
                int encodedSizeWithTag = i22 + i11 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(12, fullEventInfo.attendee_emails);
                if (fullEventInfo.self_attendee_status != null) {
                    i12 = AttendeeStatus.ADAPTER.encodedSizeWithTag(13, fullEventInfo.self_attendee_status);
                } else {
                    i12 = 0;
                }
                int i23 = encodedSizeWithTag + i12;
                if (fullEventInfo.conflict_info != null) {
                    i13 = CalendarEventConflictInfo.ADAPTER.encodedSizeWithTag(100, fullEventInfo.conflict_info);
                }
                return i23 + i13 + fullEventInfo.unknownFields().size();
            }

            /* renamed from: a */
            public FullEventInfo decode(ProtoReader protoReader) throws IOException {
                C14916a aVar = new C14916a();
                aVar.f39446a = 0L;
                aVar.f39447b = "";
                aVar.f39448c = 0L;
                aVar.f39449d = "";
                aVar.f39450e = false;
                aVar.f39451f = "";
                aVar.f39452g = "";
                aVar.f39453h = "";
                aVar.f39454i = true;
                aVar.f39455j = InteroperabilityType.EXTERNAL;
                aVar.f39456k = "";
                aVar.f39458m = AttendeeStatus.NEEDS_ACTION;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag != 100) {
                        switch (nextTag) {
                            case 1:
                                aVar.f39446a = ProtoAdapter.INT64.decode(protoReader);
                                continue;
                            case 2:
                                aVar.f39447b = ProtoAdapter.STRING.decode(protoReader);
                                continue;
                            case 3:
                                aVar.f39448c = ProtoAdapter.INT64.decode(protoReader);
                                continue;
                            case 4:
                                aVar.f39449d = ProtoAdapter.STRING.decode(protoReader);
                                continue;
                            case 5:
                                aVar.f39450e = ProtoAdapter.BOOL.decode(protoReader);
                                continue;
                            case 6:
                                aVar.f39451f = ProtoAdapter.STRING.decode(protoReader);
                                continue;
                            case 7:
                                aVar.f39452g = ProtoAdapter.STRING.decode(protoReader);
                                continue;
                            case 8:
                                aVar.f39453h = ProtoAdapter.STRING.decode(protoReader);
                                continue;
                            case 9:
                                aVar.f39454i = ProtoAdapter.BOOL.decode(protoReader);
                                continue;
                            case 10:
                                try {
                                    aVar.f39455j = InteroperabilityType.ADAPTER.decode(protoReader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 11:
                                aVar.f39456k = ProtoAdapter.STRING.decode(protoReader);
                                continue;
                            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                                aVar.f39457l.add(ProtoAdapter.STRING.decode(protoReader));
                                continue;
                            case 13:
                                try {
                                    aVar.f39458m = AttendeeStatus.ADAPTER.decode(protoReader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                    break;
                                }
                            default:
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                continue;
                        }
                    } else {
                        aVar.f39459n = CalendarEventConflictInfo.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, FullEventInfo fullEventInfo) throws IOException {
                if (fullEventInfo.start_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, fullEventInfo.start_time);
                }
                if (fullEventInfo.start_timezone != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, fullEventInfo.start_timezone);
                }
                if (fullEventInfo.end_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, fullEventInfo.end_time);
                }
                if (fullEventInfo.end_timezone != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, fullEventInfo.end_timezone);
                }
                if (fullEventInfo.is_all_day != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, fullEventInfo.is_all_day);
                }
                if (fullEventInfo.summary != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, fullEventInfo.summary);
                }
                if (fullEventInfo.location != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, fullEventInfo.location);
                }
                if (fullEventInfo.rrule != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, fullEventInfo.rrule);
                }
                if (fullEventInfo.is_self_attendee_optional != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, fullEventInfo.is_self_attendee_optional);
                }
                if (fullEventInfo.inter_type != null) {
                    InteroperabilityType.ADAPTER.encodeWithTag(protoWriter, 10, fullEventInfo.inter_type);
                }
                if (fullEventInfo.organizer_email != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, fullEventInfo.organizer_email);
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 12, fullEventInfo.attendee_emails);
                if (fullEventInfo.self_attendee_status != null) {
                    AttendeeStatus.ADAPTER.encodeWithTag(protoWriter, 13, fullEventInfo.self_attendee_status);
                }
                if (fullEventInfo.conflict_info != null) {
                    CalendarEventConflictInfo.ADAPTER.encodeWithTag(protoWriter, 100, fullEventInfo.conflict_info);
                }
                protoWriter.writeBytes(fullEventInfo.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo$FullEventInfo$a */
        public static final class C14916a extends Message.Builder<FullEventInfo, C14916a> {

            /* renamed from: a */
            public Long f39446a;

            /* renamed from: b */
            public String f39447b;

            /* renamed from: c */
            public Long f39448c;

            /* renamed from: d */
            public String f39449d;

            /* renamed from: e */
            public Boolean f39450e;

            /* renamed from: f */
            public String f39451f;

            /* renamed from: g */
            public String f39452g;

            /* renamed from: h */
            public String f39453h;

            /* renamed from: i */
            public Boolean f39454i;

            /* renamed from: j */
            public InteroperabilityType f39455j;

            /* renamed from: k */
            public String f39456k;

            /* renamed from: l */
            public List<String> f39457l = Internal.newMutableList();

            /* renamed from: m */
            public AttendeeStatus f39458m;

            /* renamed from: n */
            public CalendarEventConflictInfo f39459n;

            /* renamed from: a */
            public FullEventInfo build() {
                return new FullEventInfo(this.f39446a, this.f39447b, this.f39448c, this.f39449d, this.f39450e, this.f39451f, this.f39452g, this.f39453h, this.f39454i, this.f39455j, this.f39456k, this.f39457l, this.f39458m, this.f39459n, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14916a newBuilder() {
            C14916a aVar = new C14916a();
            aVar.f39446a = this.start_time;
            aVar.f39447b = this.start_timezone;
            aVar.f39448c = this.end_time;
            aVar.f39449d = this.end_timezone;
            aVar.f39450e = this.is_all_day;
            aVar.f39451f = this.summary;
            aVar.f39452g = this.location;
            aVar.f39453h = this.rrule;
            aVar.f39454i = this.is_self_attendee_optional;
            aVar.f39455j = this.inter_type;
            aVar.f39456k = this.organizer_email;
            aVar.f39457l = Internal.copyOf("attendee_emails", this.attendee_emails);
            aVar.f39458m = this.self_attendee_status;
            aVar.f39459n = this.conflict_info;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "FullEventInfo");
            StringBuilder sb = new StringBuilder();
            if (this.start_time != null) {
                sb.append(", start_time=");
                sb.append(this.start_time);
            }
            if (this.start_timezone != null) {
                sb.append(", start_timezone=");
                sb.append(this.start_timezone);
            }
            if (this.end_time != null) {
                sb.append(", end_time=");
                sb.append(this.end_time);
            }
            if (this.end_timezone != null) {
                sb.append(", end_timezone=");
                sb.append(this.end_timezone);
            }
            if (this.is_all_day != null) {
                sb.append(", is_all_day=");
                sb.append(this.is_all_day);
            }
            if (this.summary != null) {
                sb.append(", summary=");
                sb.append(this.summary);
            }
            if (this.location != null) {
                sb.append(", location=");
                sb.append(this.location);
            }
            if (this.rrule != null) {
                sb.append(", rrule=");
                sb.append(this.rrule);
            }
            if (this.is_self_attendee_optional != null) {
                sb.append(", is_self_attendee_optional=");
                sb.append(this.is_self_attendee_optional);
            }
            if (this.inter_type != null) {
                sb.append(", inter_type=");
                sb.append(this.inter_type);
            }
            if (this.organizer_email != null) {
                sb.append(", organizer_email=");
                sb.append(this.organizer_email);
            }
            if (!this.attendee_emails.isEmpty()) {
                sb.append(", attendee_emails=");
                sb.append(this.attendee_emails);
            }
            if (this.self_attendee_status != null) {
                sb.append(", self_attendee_status=");
                sb.append(this.self_attendee_status);
            }
            if (this.conflict_info != null) {
                sb.append(", conflict_info=");
                sb.append(this.conflict_info);
            }
            StringBuilder replace = sb.replace(0, 2, "FullEventInfo{");
            replace.append('}');
            return replace.toString();
        }

        public FullEventInfo(Long l, String str, Long l2, String str2, Boolean bool, String str3, String str4, String str5, Boolean bool2, InteroperabilityType interoperabilityType, String str6, List<String> list, AttendeeStatus attendeeStatus, CalendarEventConflictInfo calendarEventConflictInfo) {
            this(l, str, l2, str2, bool, str3, str4, str5, bool2, interoperabilityType, str6, list, attendeeStatus, calendarEventConflictInfo, ByteString.EMPTY);
        }

        public FullEventInfo(Long l, String str, Long l2, String str2, Boolean bool, String str3, String str4, String str5, Boolean bool2, InteroperabilityType interoperabilityType, String str6, List<String> list, AttendeeStatus attendeeStatus, CalendarEventConflictInfo calendarEventConflictInfo, ByteString byteString) {
            super(ADAPTER, byteString);
            this.start_time = l;
            this.start_timezone = str;
            this.end_time = l2;
            this.end_timezone = str2;
            this.is_all_day = bool;
            this.summary = str3;
            this.location = str4;
            this.rrule = str5;
            this.is_self_attendee_optional = bool2;
            this.inter_type = interoperabilityType;
            this.organizer_email = str6;
            this.attendee_emails = Internal.immutableCopyOf("attendee_emails", list);
            this.self_attendee_status = attendeeStatus;
            this.conflict_info = calendarEventConflictInfo;
        }
    }

    public static final class PartEventInfo extends Message<PartEventInfo, C14918a> {
        public static final ProtoAdapter<PartEventInfo> ADAPTER = new C14919b();
        public static final InteroperabilityType DEFAULT_INTER_TYPE = InteroperabilityType.EXTERNAL;
        public static final Boolean DEFAULT_IS_SELF_ATTENDEE_OPTIONAL = true;
        private static final long serialVersionUID = 0;
        public final InteroperabilityType inter_type;
        public final Boolean is_self_attendee_optional;
        public final String summary;

        /* renamed from: com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo$PartEventInfo$b */
        private static final class C14919b extends ProtoAdapter<PartEventInfo> {
            C14919b() {
                super(FieldEncoding.LENGTH_DELIMITED, PartEventInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(PartEventInfo partEventInfo) {
                int i;
                int i2;
                int i3 = 0;
                if (partEventInfo.summary != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, partEventInfo.summary);
                } else {
                    i = 0;
                }
                if (partEventInfo.is_self_attendee_optional != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, partEventInfo.is_self_attendee_optional);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (partEventInfo.inter_type != null) {
                    i3 = InteroperabilityType.ADAPTER.encodedSizeWithTag(3, partEventInfo.inter_type);
                }
                return i4 + i3 + partEventInfo.unknownFields().size();
            }

            /* renamed from: a */
            public PartEventInfo decode(ProtoReader protoReader) throws IOException {
                C14918a aVar = new C14918a();
                aVar.f39460a = "";
                aVar.f39461b = true;
                aVar.f39462c = InteroperabilityType.EXTERNAL;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f39460a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f39461b = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f39462c = InteroperabilityType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, PartEventInfo partEventInfo) throws IOException {
                if (partEventInfo.summary != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, partEventInfo.summary);
                }
                if (partEventInfo.is_self_attendee_optional != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, partEventInfo.is_self_attendee_optional);
                }
                if (partEventInfo.inter_type != null) {
                    InteroperabilityType.ADAPTER.encodeWithTag(protoWriter, 3, partEventInfo.inter_type);
                }
                protoWriter.writeBytes(partEventInfo.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo$PartEventInfo$a */
        public static final class C14918a extends Message.Builder<PartEventInfo, C14918a> {

            /* renamed from: a */
            public String f39460a;

            /* renamed from: b */
            public Boolean f39461b;

            /* renamed from: c */
            public InteroperabilityType f39462c;

            /* renamed from: a */
            public PartEventInfo build() {
                return new PartEventInfo(this.f39460a, this.f39461b, this.f39462c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14918a newBuilder() {
            C14918a aVar = new C14918a();
            aVar.f39460a = this.summary;
            aVar.f39461b = this.is_self_attendee_optional;
            aVar.f39462c = this.inter_type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "PartEventInfo");
            StringBuilder sb = new StringBuilder();
            if (this.summary != null) {
                sb.append(", summary=");
                sb.append(this.summary);
            }
            if (this.is_self_attendee_optional != null) {
                sb.append(", is_self_attendee_optional=");
                sb.append(this.is_self_attendee_optional);
            }
            if (this.inter_type != null) {
                sb.append(", inter_type=");
                sb.append(this.inter_type);
            }
            StringBuilder replace = sb.replace(0, 2, "PartEventInfo{");
            replace.append('}');
            return replace.toString();
        }

        public PartEventInfo(String str, Boolean bool, InteroperabilityType interoperabilityType) {
            this(str, bool, interoperabilityType, ByteString.EMPTY);
        }

        public PartEventInfo(String str, Boolean bool, InteroperabilityType interoperabilityType, ByteString byteString) {
            super(ADAPTER, byteString);
            this.summary = str;
            this.is_self_attendee_optional = bool;
            this.inter_type = interoperabilityType;
        }
    }

    public static final class Unkown extends Message<Unkown, C14920a> {
        public static final ProtoAdapter<Unkown> ADAPTER = new C14921b();
        private static final long serialVersionUID = 0;

        /* renamed from: com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo$Unkown$b */
        private static final class C14921b extends ProtoAdapter<Unkown> {
            C14921b() {
                super(FieldEncoding.LENGTH_DELIMITED, Unkown.class);
            }

            /* renamed from: a */
            public int encodedSize(Unkown unkown) {
                return unkown.unknownFields().size();
            }

            /* renamed from: a */
            public Unkown decode(ProtoReader protoReader) throws IOException {
                C14920a aVar = new C14920a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Unkown unkown) throws IOException {
                protoWriter.writeBytes(unkown.unknownFields());
            }
        }

        public Unkown() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo$Unkown$a */
        public static final class C14920a extends Message.Builder<Unkown, C14920a> {
            /* renamed from: a */
            public Unkown build() {
                return new Unkown(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14920a newBuilder() {
            C14920a aVar = new C14920a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "Unkown");
            StringBuilder replace = new StringBuilder().replace(0, 2, "Unkown{");
            replace.append('}');
            return replace.toString();
        }

        public Unkown(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo$b */
    private static final class C14923b extends ProtoAdapter<EmailCalendarEventInfo> {
        C14923b() {
            super(FieldEncoding.LENGTH_DELIMITED, EmailCalendarEventInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(EmailCalendarEventInfo emailCalendarEventInfo) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, emailCalendarEventInfo.event_server_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, emailCalendarEventInfo.calendar_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, emailCalendarEventInfo.uid) + ProtoAdapter.INT64.encodedSizeWithTag(4, emailCalendarEventInfo.original_time) + ProtoAdapter.STRING.encodedSizeWithTag(5, emailCalendarEventInfo.mail_id) + ProtoAdapter.STRING.encodedSizeWithTag(6, emailCalendarEventInfo.sender_email);
            int i9 = 0;
            if (emailCalendarEventInfo.type != null) {
                i = CalendarMailMessageType.ADAPTER.encodedSizeWithTag(7, emailCalendarEventInfo.type);
            } else {
                i = 0;
            }
            int i10 = encodedSizeWithTag + i;
            if (emailCalendarEventInfo.unkown != null) {
                i2 = Unkown.ADAPTER.encodedSizeWithTag(100, emailCalendarEventInfo.unkown);
            } else {
                i2 = 0;
            }
            int i11 = i10 + i2;
            if (emailCalendarEventInfo.event_invite != null) {
                i3 = EventInvite.ADAPTER.encodedSizeWithTag(101, emailCalendarEventInfo.event_invite);
            } else {
                i3 = 0;
            }
            int i12 = i11 + i3;
            if (emailCalendarEventInfo.event_cancel != null) {
                i4 = EventCancel.ADAPTER.encodedSizeWithTag(102, emailCalendarEventInfo.event_cancel);
            } else {
                i4 = 0;
            }
            int i13 = i12 + i4;
            if (emailCalendarEventInfo.event_update != null) {
                i5 = EventUpdate.ADAPTER.encodedSizeWithTag(103, emailCalendarEventInfo.event_update);
            } else {
                i5 = 0;
            }
            int i14 = i13 + i5;
            if (emailCalendarEventInfo.event_update_outdated != null) {
                i6 = EventUpdateOutdated.ADAPTER.encodedSizeWithTag(104, emailCalendarEventInfo.event_update_outdated);
            } else {
                i6 = 0;
            }
            int i15 = i14 + i6;
            if (emailCalendarEventInfo.event_reply != null) {
                i7 = EventReply.ADAPTER.encodedSizeWithTag(LocationRequest.PRIORITY_NO_POWER, emailCalendarEventInfo.event_reply);
            } else {
                i7 = 0;
            }
            int i16 = i15 + i7;
            if (emailCalendarEventInfo.event_self_delete != null) {
                i8 = EventSelfDelete.ADAPTER.encodedSizeWithTag(106, emailCalendarEventInfo.event_self_delete);
            } else {
                i8 = 0;
            }
            int i17 = i16 + i8;
            if (emailCalendarEventInfo.event_not_found != null) {
                i9 = EventNotFound.ADAPTER.encodedSizeWithTag(ActivityIdentificationData.WALKING, emailCalendarEventInfo.event_not_found);
            }
            return i17 + i9 + emailCalendarEventInfo.unknownFields().size();
        }

        /* renamed from: a */
        public EmailCalendarEventInfo decode(ProtoReader protoReader) throws IOException {
            C14922a aVar = new C14922a();
            aVar.f39463a = "";
            aVar.f39464b = "";
            aVar.f39465c = "";
            aVar.f39466d = 0L;
            aVar.f39467e = "";
            aVar.f39468f = "";
            aVar.f39469g = CalendarMailMessageType.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f39463a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f39464b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f39465c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f39466d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            aVar.f39467e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f39468f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            try {
                                aVar.f39469g = CalendarMailMessageType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        default:
                            switch (nextTag) {
                                case 100:
                                    aVar.mo54650a(Unkown.ADAPTER.decode(protoReader));
                                    continue;
                                case 101:
                                    aVar.mo54644a(EventInvite.ADAPTER.decode(protoReader));
                                    continue;
                                case 102:
                                    aVar.mo54643a(EventCancel.ADAPTER.decode(protoReader));
                                    continue;
                                case 103:
                                    aVar.mo54648a(EventUpdate.ADAPTER.decode(protoReader));
                                    continue;
                                case 104:
                                    aVar.mo54649a(EventUpdateOutdated.ADAPTER.decode(protoReader));
                                    continue;
                                case LocationRequest.PRIORITY_NO_POWER /*{ENCODED_INT: 105}*/:
                                    aVar.mo54646a(EventReply.ADAPTER.decode(protoReader));
                                    continue;
                                case 106:
                                    aVar.mo54647a(EventSelfDelete.ADAPTER.decode(protoReader));
                                    continue;
                                case ActivityIdentificationData.WALKING /*{ENCODED_INT: 107}*/:
                                    aVar.mo54645a(EventNotFound.ADAPTER.decode(protoReader));
                                    continue;
                                default:
                                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    continue;
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, EmailCalendarEventInfo emailCalendarEventInfo) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, emailCalendarEventInfo.event_server_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, emailCalendarEventInfo.calendar_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, emailCalendarEventInfo.uid);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, emailCalendarEventInfo.original_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, emailCalendarEventInfo.mail_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, emailCalendarEventInfo.sender_email);
            if (emailCalendarEventInfo.type != null) {
                CalendarMailMessageType.ADAPTER.encodeWithTag(protoWriter, 7, emailCalendarEventInfo.type);
            }
            if (emailCalendarEventInfo.unkown != null) {
                Unkown.ADAPTER.encodeWithTag(protoWriter, 100, emailCalendarEventInfo.unkown);
            }
            if (emailCalendarEventInfo.event_invite != null) {
                EventInvite.ADAPTER.encodeWithTag(protoWriter, 101, emailCalendarEventInfo.event_invite);
            }
            if (emailCalendarEventInfo.event_cancel != null) {
                EventCancel.ADAPTER.encodeWithTag(protoWriter, 102, emailCalendarEventInfo.event_cancel);
            }
            if (emailCalendarEventInfo.event_update != null) {
                EventUpdate.ADAPTER.encodeWithTag(protoWriter, 103, emailCalendarEventInfo.event_update);
            }
            if (emailCalendarEventInfo.event_update_outdated != null) {
                EventUpdateOutdated.ADAPTER.encodeWithTag(protoWriter, 104, emailCalendarEventInfo.event_update_outdated);
            }
            if (emailCalendarEventInfo.event_reply != null) {
                EventReply.ADAPTER.encodeWithTag(protoWriter, LocationRequest.PRIORITY_NO_POWER, emailCalendarEventInfo.event_reply);
            }
            if (emailCalendarEventInfo.event_self_delete != null) {
                EventSelfDelete.ADAPTER.encodeWithTag(protoWriter, 106, emailCalendarEventInfo.event_self_delete);
            }
            if (emailCalendarEventInfo.event_not_found != null) {
                EventNotFound.ADAPTER.encodeWithTag(protoWriter, ActivityIdentificationData.WALKING, emailCalendarEventInfo.event_not_found);
            }
            protoWriter.writeBytes(emailCalendarEventInfo.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14922a newBuilder() {
        C14922a aVar = new C14922a();
        aVar.f39463a = this.event_server_id;
        aVar.f39464b = this.calendar_id;
        aVar.f39465c = this.uid;
        aVar.f39466d = this.original_time;
        aVar.f39467e = this.mail_id;
        aVar.f39468f = this.sender_email;
        aVar.f39469g = this.type;
        aVar.f39470h = this.unkown;
        aVar.f39471i = this.event_invite;
        aVar.f39472j = this.event_cancel;
        aVar.f39473k = this.event_update;
        aVar.f39474l = this.event_update_outdated;
        aVar.f39475m = this.event_reply;
        aVar.f39476n = this.event_self_delete;
        aVar.f39477o = this.event_not_found;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "EmailCalendarEventInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(", event_server_id=");
        sb.append(this.event_server_id);
        sb.append(", calendar_id=");
        sb.append(this.calendar_id);
        sb.append(", uid=");
        sb.append(this.uid);
        sb.append(", original_time=");
        sb.append(this.original_time);
        sb.append(", mail_id=");
        sb.append(this.mail_id);
        sb.append(", sender_email=");
        sb.append(this.sender_email);
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.unkown != null) {
            sb.append(", unkown=");
            sb.append(this.unkown);
        }
        if (this.event_invite != null) {
            sb.append(", event_invite=");
            sb.append(this.event_invite);
        }
        if (this.event_cancel != null) {
            sb.append(", event_cancel=");
            sb.append(this.event_cancel);
        }
        if (this.event_update != null) {
            sb.append(", event_update=");
            sb.append(this.event_update);
        }
        if (this.event_update_outdated != null) {
            sb.append(", event_update_outdated=");
            sb.append(this.event_update_outdated);
        }
        if (this.event_reply != null) {
            sb.append(", event_reply=");
            sb.append(this.event_reply);
        }
        if (this.event_self_delete != null) {
            sb.append(", event_self_delete=");
            sb.append(this.event_self_delete);
        }
        if (this.event_not_found != null) {
            sb.append(", event_not_found=");
            sb.append(this.event_not_found);
        }
        StringBuilder replace = sb.replace(0, 2, "EmailCalendarEventInfo{");
        replace.append('}');
        return replace.toString();
    }

    public EmailCalendarEventInfo(String str, String str2, String str3, Long l, String str4, String str5, CalendarMailMessageType calendarMailMessageType, Unkown unkown2, EventInvite eventInvite, EventCancel eventCancel, EventUpdate eventUpdate, EventUpdateOutdated eventUpdateOutdated, EventReply eventReply, EventSelfDelete eventSelfDelete, EventNotFound eventNotFound) {
        this(str, str2, str3, l, str4, str5, calendarMailMessageType, unkown2, eventInvite, eventCancel, eventUpdate, eventUpdateOutdated, eventReply, eventSelfDelete, eventNotFound, ByteString.EMPTY);
    }

    public EmailCalendarEventInfo(String str, String str2, String str3, Long l, String str4, String str5, CalendarMailMessageType calendarMailMessageType, Unkown unkown2, EventInvite eventInvite, EventCancel eventCancel, EventUpdate eventUpdate, EventUpdateOutdated eventUpdateOutdated, EventReply eventReply, EventSelfDelete eventSelfDelete, EventNotFound eventNotFound, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(unkown2, eventInvite, eventCancel, eventUpdate, eventUpdateOutdated, eventReply, eventSelfDelete, eventNotFound) <= 1) {
            this.event_server_id = str;
            this.calendar_id = str2;
            this.uid = str3;
            this.original_time = l;
            this.mail_id = str4;
            this.sender_email = str5;
            this.type = calendarMailMessageType;
            this.unkown = unkown2;
            this.event_invite = eventInvite;
            this.event_cancel = eventCancel;
            this.event_update = eventUpdate;
            this.event_update_outdated = eventUpdateOutdated;
            this.event_reply = eventReply;
            this.event_self_delete = eventSelfDelete;
            this.event_not_found = eventNotFound;
            return;
        }
        throw new IllegalArgumentException("at most one of unkown, event_invite, event_cancel, event_update, event_update_outdated, event_reply, event_self_delete, event_not_found may be non-null");
    }
}
