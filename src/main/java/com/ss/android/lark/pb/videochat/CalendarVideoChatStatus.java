package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class CalendarVideoChatStatus extends Message<CalendarVideoChatStatus, C50276a> {
    public static final ProtoAdapter<CalendarVideoChatStatus> ADAPTER = new C50277b();
    public static final Long DEFAULT_MEETING_DURATION = 0L;
    public static final Long DEFAULT_MEETING_ID = 0L;
    public static final Long DEFAULT_REQUEST_BEGIN_TIME = 0L;
    public static final Long DEFAULT_REQUEST_END_TIME = 0L;
    public static final Long DEFAULT_START_TIME = 0L;
    public static final Long DEFAULT_TENANT_ID = 0L;
    public static final Long DEFAULT_UNIQUE_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Long mmeeting_duration;
    public final Long mmeeting_id;
    public final Long mrequest_begin_time;
    public final Long mrequest_end_time;
    public final Long mstart_time;
    public final Status mstatus;
    public final Long mtenant_id;
    public final Long munique_id;

    public enum Status implements WireEnum {
        STATUS_UNKNOWN(0),
        STATUS_LIVE(1),
        STATUS_NOT_LIVE(2);
        
        public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Status fromValue(int i) {
            if (i == 0) {
                return STATUS_UNKNOWN;
            }
            if (i == 1) {
                return STATUS_LIVE;
            }
            if (i != 2) {
                return null;
            }
            return STATUS_NOT_LIVE;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.CalendarVideoChatStatus$b */
    private static final class C50277b extends ProtoAdapter<CalendarVideoChatStatus> {
        C50277b() {
            super(FieldEncoding.LENGTH_DELIMITED, CalendarVideoChatStatus.class);
        }

        /* renamed from: a */
        public int encodedSize(CalendarVideoChatStatus calendarVideoChatStatus) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8 = 0;
            if (calendarVideoChatStatus.munique_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, calendarVideoChatStatus.munique_id);
            } else {
                i = 0;
            }
            if (calendarVideoChatStatus.mstatus != null) {
                i2 = Status.ADAPTER.encodedSizeWithTag(2, calendarVideoChatStatus.mstatus);
            } else {
                i2 = 0;
            }
            int i9 = i + i2;
            if (calendarVideoChatStatus.mstart_time != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, calendarVideoChatStatus.mstart_time);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (calendarVideoChatStatus.mmeeting_id != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, calendarVideoChatStatus.mmeeting_id);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (calendarVideoChatStatus.mmeeting_duration != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, calendarVideoChatStatus.mmeeting_duration);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (calendarVideoChatStatus.mrequest_begin_time != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(6, calendarVideoChatStatus.mrequest_begin_time);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (calendarVideoChatStatus.mrequest_end_time != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(7, calendarVideoChatStatus.mrequest_end_time);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (calendarVideoChatStatus.mtenant_id != null) {
                i8 = ProtoAdapter.INT64.encodedSizeWithTag(8, calendarVideoChatStatus.mtenant_id);
            }
            return i14 + i8 + calendarVideoChatStatus.unknownFields().size();
        }

        /* renamed from: a */
        public CalendarVideoChatStatus decode(ProtoReader protoReader) throws IOException {
            C50276a aVar = new C50276a();
            aVar.f125635a = 0L;
            aVar.f125637c = 0L;
            aVar.f125638d = 0L;
            aVar.f125639e = 0L;
            aVar.f125640f = 0L;
            aVar.f125641g = 0L;
            aVar.f125642h = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125635a = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f125636b = Status.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f125637c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f125638d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            aVar.f125639e = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            aVar.f125640f = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            aVar.f125641g = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            aVar.f125642h = ProtoAdapter.INT64.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, CalendarVideoChatStatus calendarVideoChatStatus) throws IOException {
            if (calendarVideoChatStatus.munique_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, calendarVideoChatStatus.munique_id);
            }
            if (calendarVideoChatStatus.mstatus != null) {
                Status.ADAPTER.encodeWithTag(protoWriter, 2, calendarVideoChatStatus.mstatus);
            }
            if (calendarVideoChatStatus.mstart_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, calendarVideoChatStatus.mstart_time);
            }
            if (calendarVideoChatStatus.mmeeting_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, calendarVideoChatStatus.mmeeting_id);
            }
            if (calendarVideoChatStatus.mmeeting_duration != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, calendarVideoChatStatus.mmeeting_duration);
            }
            if (calendarVideoChatStatus.mrequest_begin_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, calendarVideoChatStatus.mrequest_begin_time);
            }
            if (calendarVideoChatStatus.mrequest_end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, calendarVideoChatStatus.mrequest_end_time);
            }
            if (calendarVideoChatStatus.mtenant_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, calendarVideoChatStatus.mtenant_id);
            }
            protoWriter.writeBytes(calendarVideoChatStatus.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.CalendarVideoChatStatus$a */
    public static final class C50276a extends Message.Builder<CalendarVideoChatStatus, C50276a> {

        /* renamed from: a */
        public Long f125635a;

        /* renamed from: b */
        public Status f125636b;

        /* renamed from: c */
        public Long f125637c;

        /* renamed from: d */
        public Long f125638d;

        /* renamed from: e */
        public Long f125639e;

        /* renamed from: f */
        public Long f125640f;

        /* renamed from: g */
        public Long f125641g;

        /* renamed from: h */
        public Long f125642h;

        /* renamed from: a */
        public CalendarVideoChatStatus build() {
            return new CalendarVideoChatStatus(this.f125635a, this.f125636b, this.f125637c, this.f125638d, this.f125639e, this.f125640f, this.f125641g, this.f125642h, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50276a newBuilder() {
        C50276a aVar = new C50276a();
        aVar.f125635a = this.munique_id;
        aVar.f125636b = this.mstatus;
        aVar.f125637c = this.mstart_time;
        aVar.f125638d = this.mmeeting_id;
        aVar.f125639e = this.mmeeting_duration;
        aVar.f125640f = this.mrequest_begin_time;
        aVar.f125641g = this.mrequest_end_time;
        aVar.f125642h = this.mtenant_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.munique_id != null) {
            sb.append(", unique_id=");
            sb.append(this.munique_id);
        }
        if (this.mstatus != null) {
            sb.append(", status=");
            sb.append(this.mstatus);
        }
        if (this.mstart_time != null) {
            sb.append(", start_time=");
            sb.append(this.mstart_time);
        }
        if (this.mmeeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.mmeeting_id);
        }
        if (this.mmeeting_duration != null) {
            sb.append(", meeting_duration=");
            sb.append(this.mmeeting_duration);
        }
        if (this.mrequest_begin_time != null) {
            sb.append(", request_begin_time=");
            sb.append(this.mrequest_begin_time);
        }
        if (this.mrequest_end_time != null) {
            sb.append(", request_end_time=");
            sb.append(this.mrequest_end_time);
        }
        if (this.mtenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.mtenant_id);
        }
        StringBuilder replace = sb.replace(0, 2, "CalendarVideoChatStatus{");
        replace.append('}');
        return replace.toString();
    }

    public CalendarVideoChatStatus(Long l, Status status, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7) {
        this(l, status, l2, l3, l4, l5, l6, l7, ByteString.EMPTY);
    }

    public CalendarVideoChatStatus(Long l, Status status, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, ByteString byteString) {
        super(ADAPTER, byteString);
        this.munique_id = l;
        this.mstatus = status;
        this.mstart_time = l2;
        this.mmeeting_id = l3;
        this.mmeeting_duration = l4;
        this.mrequest_begin_time = l5;
        this.mrequest_end_time = l6;
        this.mtenant_id = l7;
    }
}
