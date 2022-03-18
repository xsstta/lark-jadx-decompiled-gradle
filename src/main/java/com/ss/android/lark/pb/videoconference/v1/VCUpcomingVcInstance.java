package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.calendar.v1.CalendarEventReminder;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class VCUpcomingVcInstance extends Message<VCUpcomingVcInstance, C51210a> {
    public static final ProtoAdapter<VCUpcomingVcInstance> ADAPTER = new C51211b();
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Boolean DEFAULT_IS_CROSS_TENANT = false;
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Long end_time;
    public final Boolean is_cross_tenant;
    public final String key;
    public final String meeting_number;
    public final String organizer_id;
    public final Long original_time;
    public final List<CalendarEventReminder> reminders;
    public final Long start_time;
    public final String summary;
    public final String unique_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCUpcomingVcInstance$b */
    private static final class C51211b extends ProtoAdapter<VCUpcomingVcInstance> {
        C51211b() {
            super(FieldEncoding.LENGTH_DELIMITED, VCUpcomingVcInstance.class);
        }

        /* renamed from: a */
        public int encodedSize(VCUpcomingVcInstance vCUpcomingVcInstance) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9 = 0;
            if (vCUpcomingVcInstance.summary != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, vCUpcomingVcInstance.summary);
            } else {
                i = 0;
            }
            if (vCUpcomingVcInstance.start_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, vCUpcomingVcInstance.start_time);
            } else {
                i2 = 0;
            }
            int i10 = i + i2;
            if (vCUpcomingVcInstance.end_time != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, vCUpcomingVcInstance.end_time);
            } else {
                i3 = 0;
            }
            int i11 = i10 + i3;
            if (vCUpcomingVcInstance.meeting_number != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, vCUpcomingVcInstance.meeting_number);
            } else {
                i4 = 0;
            }
            int i12 = i11 + i4;
            if (vCUpcomingVcInstance.is_cross_tenant != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, vCUpcomingVcInstance.is_cross_tenant);
            } else {
                i5 = 0;
            }
            int i13 = i12 + i5;
            if (vCUpcomingVcInstance.key != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, vCUpcomingVcInstance.key);
            } else {
                i6 = 0;
            }
            int i14 = i13 + i6;
            if (vCUpcomingVcInstance.original_time != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(7, vCUpcomingVcInstance.original_time);
            } else {
                i7 = 0;
            }
            int encodedSizeWithTag = i14 + i7 + CalendarEventReminder.ADAPTER.asRepeated().encodedSizeWithTag(8, vCUpcomingVcInstance.reminders);
            if (vCUpcomingVcInstance.unique_id != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(9, vCUpcomingVcInstance.unique_id);
            } else {
                i8 = 0;
            }
            int i15 = encodedSizeWithTag + i8;
            if (vCUpcomingVcInstance.organizer_id != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(10, vCUpcomingVcInstance.organizer_id);
            }
            return i15 + i9 + vCUpcomingVcInstance.unknownFields().size();
        }

        /* renamed from: a */
        public VCUpcomingVcInstance decode(ProtoReader protoReader) throws IOException {
            C51210a aVar = new C51210a();
            aVar.f127470a = "";
            aVar.f127471b = 0L;
            aVar.f127472c = 0L;
            aVar.f127473d = "";
            aVar.f127474e = false;
            aVar.f127475f = "";
            aVar.f127476g = 0L;
            aVar.f127478i = "";
            aVar.f127479j = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f127470a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f127471b = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            aVar.f127472c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f127473d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f127474e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f127475f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f127476g = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            aVar.f127477h.add(CalendarEventReminder.ADAPTER.decode(protoReader));
                            break;
                        case 9:
                            aVar.f127478i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f127479j = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, VCUpcomingVcInstance vCUpcomingVcInstance) throws IOException {
            if (vCUpcomingVcInstance.summary != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, vCUpcomingVcInstance.summary);
            }
            if (vCUpcomingVcInstance.start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, vCUpcomingVcInstance.start_time);
            }
            if (vCUpcomingVcInstance.end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, vCUpcomingVcInstance.end_time);
            }
            if (vCUpcomingVcInstance.meeting_number != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, vCUpcomingVcInstance.meeting_number);
            }
            if (vCUpcomingVcInstance.is_cross_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, vCUpcomingVcInstance.is_cross_tenant);
            }
            if (vCUpcomingVcInstance.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, vCUpcomingVcInstance.key);
            }
            if (vCUpcomingVcInstance.original_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, vCUpcomingVcInstance.original_time);
            }
            CalendarEventReminder.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, vCUpcomingVcInstance.reminders);
            if (vCUpcomingVcInstance.unique_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, vCUpcomingVcInstance.unique_id);
            }
            if (vCUpcomingVcInstance.organizer_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, vCUpcomingVcInstance.organizer_id);
            }
            protoWriter.writeBytes(vCUpcomingVcInstance.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCUpcomingVcInstance$a */
    public static final class C51210a extends Message.Builder<VCUpcomingVcInstance, C51210a> {

        /* renamed from: a */
        public String f127470a;

        /* renamed from: b */
        public Long f127471b;

        /* renamed from: c */
        public Long f127472c;

        /* renamed from: d */
        public String f127473d;

        /* renamed from: e */
        public Boolean f127474e;

        /* renamed from: f */
        public String f127475f;

        /* renamed from: g */
        public Long f127476g;

        /* renamed from: h */
        public List<CalendarEventReminder> f127477h = Internal.newMutableList();

        /* renamed from: i */
        public String f127478i;

        /* renamed from: j */
        public String f127479j;

        /* renamed from: a */
        public VCUpcomingVcInstance build() {
            return new VCUpcomingVcInstance(this.f127470a, this.f127471b, this.f127472c, this.f127473d, this.f127474e, this.f127475f, this.f127476g, this.f127477h, this.f127478i, this.f127479j, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51210a newBuilder() {
        C51210a aVar = new C51210a();
        aVar.f127470a = this.summary;
        aVar.f127471b = this.start_time;
        aVar.f127472c = this.end_time;
        aVar.f127473d = this.meeting_number;
        aVar.f127474e = this.is_cross_tenant;
        aVar.f127475f = this.key;
        aVar.f127476g = this.original_time;
        aVar.f127477h = Internal.copyOf("reminders", this.reminders);
        aVar.f127478i = this.unique_id;
        aVar.f127479j = this.organizer_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VCUpcomingVcInstance");
        StringBuilder sb = new StringBuilder();
        if (this.summary != null) {
            sb.append(", summary=");
            sb.append(this.summary);
        }
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        if (this.end_time != null) {
            sb.append(", end_time=");
            sb.append(this.end_time);
        }
        if (this.meeting_number != null) {
            sb.append(", meeting_number=");
            sb.append(this.meeting_number);
        }
        if (this.is_cross_tenant != null) {
            sb.append(", is_cross_tenant=");
            sb.append(this.is_cross_tenant);
        }
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.original_time != null) {
            sb.append(", original_time=");
            sb.append(this.original_time);
        }
        if (!this.reminders.isEmpty()) {
            sb.append(", reminders=");
            sb.append(this.reminders);
        }
        if (this.unique_id != null) {
            sb.append(", unique_id=");
            sb.append(this.unique_id);
        }
        if (this.organizer_id != null) {
            sb.append(", organizer_id=");
            sb.append(this.organizer_id);
        }
        StringBuilder replace = sb.replace(0, 2, "VCUpcomingVcInstance{");
        replace.append('}');
        return replace.toString();
    }

    public VCUpcomingVcInstance(String str, Long l, Long l2, String str2, Boolean bool, String str3, Long l3, List<CalendarEventReminder> list, String str4, String str5) {
        this(str, l, l2, str2, bool, str3, l3, list, str4, str5, ByteString.EMPTY);
    }

    public VCUpcomingVcInstance(String str, Long l, Long l2, String str2, Boolean bool, String str3, Long l3, List<CalendarEventReminder> list, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.summary = str;
        this.start_time = l;
        this.end_time = l2;
        this.meeting_number = str2;
        this.is_cross_tenant = bool;
        this.key = str3;
        this.original_time = l3;
        this.reminders = Internal.immutableCopyOf("reminders", list);
        this.unique_id = str4;
        this.organizer_id = str5;
    }
}
