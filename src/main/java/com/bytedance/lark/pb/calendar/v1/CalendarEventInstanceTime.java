package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class CalendarEventInstanceTime extends Message<CalendarEventInstanceTime, C15536a> {
    public static final ProtoAdapter<CalendarEventInstanceTime> ADAPTER = new C15537b();
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Long end_time;
    public final Long start_time;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarEventInstanceTime$b */
    private static final class C15537b extends ProtoAdapter<CalendarEventInstanceTime> {
        C15537b() {
            super(FieldEncoding.LENGTH_DELIMITED, CalendarEventInstanceTime.class);
        }

        /* renamed from: a */
        public int encodedSize(CalendarEventInstanceTime calendarEventInstanceTime) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, calendarEventInstanceTime.start_time) + ProtoAdapter.INT64.encodedSizeWithTag(3, calendarEventInstanceTime.end_time) + calendarEventInstanceTime.unknownFields().size();
        }

        /* renamed from: a */
        public CalendarEventInstanceTime decode(ProtoReader protoReader) throws IOException {
            C15536a aVar = new C15536a();
            aVar.f41195a = 0L;
            aVar.f41196b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41195a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41196b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CalendarEventInstanceTime calendarEventInstanceTime) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, calendarEventInstanceTime.start_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, calendarEventInstanceTime.end_time);
            protoWriter.writeBytes(calendarEventInstanceTime.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15536a newBuilder() {
        C15536a aVar = new C15536a();
        aVar.f41195a = this.start_time;
        aVar.f41196b = this.end_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarEventInstanceTime$a */
    public static final class C15536a extends Message.Builder<CalendarEventInstanceTime, C15536a> {

        /* renamed from: a */
        public Long f41195a;

        /* renamed from: b */
        public Long f41196b;

        /* renamed from: a */
        public CalendarEventInstanceTime build() {
            Long l;
            Long l2 = this.f41195a;
            if (l2 != null && (l = this.f41196b) != null) {
                return new CalendarEventInstanceTime(l2, l, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l2, "start_time", this.f41196b, "end_time");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "CalendarEventInstanceTime");
        StringBuilder sb = new StringBuilder();
        sb.append(", start_time=");
        sb.append(this.start_time);
        sb.append(", end_time=");
        sb.append(this.end_time);
        StringBuilder replace = sb.replace(0, 2, "CalendarEventInstanceTime{");
        replace.append('}');
        return replace.toString();
    }

    public CalendarEventInstanceTime(Long l, Long l2) {
        this(l, l2, ByteString.EMPTY);
    }

    public CalendarEventInstanceTime(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.start_time = l;
        this.end_time = l2;
    }
}
