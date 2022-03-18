package com.bytedance.lark.pb.ai.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CalendarActionParams extends Message<CalendarActionParams, C14623a> {
    public static final ProtoAdapter<CalendarActionParams> ADAPTER = new C14624b();
    public static final Integer DEFAULT_DURATION = 0;
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Integer duration;
    public final Long end_time;
    public final Long start_time;
    public final String time_grain;

    /* renamed from: com.bytedance.lark.pb.ai.v1.CalendarActionParams$b */
    private static final class C14624b extends ProtoAdapter<CalendarActionParams> {
        C14624b() {
            super(FieldEncoding.LENGTH_DELIMITED, CalendarActionParams.class);
        }

        /* renamed from: a */
        public int encodedSize(CalendarActionParams calendarActionParams) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (calendarActionParams.start_time != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, calendarActionParams.start_time);
            } else {
                i = 0;
            }
            if (calendarActionParams.end_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, calendarActionParams.end_time);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (calendarActionParams.duration != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, calendarActionParams.duration);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (calendarActionParams.time_grain != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, calendarActionParams.time_grain);
            }
            return i6 + i4 + calendarActionParams.unknownFields().size();
        }

        /* renamed from: a */
        public CalendarActionParams decode(ProtoReader protoReader) throws IOException {
            C14623a aVar = new C14623a();
            aVar.f38707a = 0L;
            aVar.f38708b = 0L;
            aVar.f38709c = 0;
            aVar.f38710d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f38707a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f38708b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f38709c = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f38710d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CalendarActionParams calendarActionParams) throws IOException {
            if (calendarActionParams.start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, calendarActionParams.start_time);
            }
            if (calendarActionParams.end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, calendarActionParams.end_time);
            }
            if (calendarActionParams.duration != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, calendarActionParams.duration);
            }
            if (calendarActionParams.time_grain != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, calendarActionParams.time_grain);
            }
            protoWriter.writeBytes(calendarActionParams.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.ai.v1.CalendarActionParams$a */
    public static final class C14623a extends Message.Builder<CalendarActionParams, C14623a> {

        /* renamed from: a */
        public Long f38707a;

        /* renamed from: b */
        public Long f38708b;

        /* renamed from: c */
        public Integer f38709c;

        /* renamed from: d */
        public String f38710d;

        /* renamed from: a */
        public CalendarActionParams build() {
            return new CalendarActionParams(this.f38707a, this.f38708b, this.f38709c, this.f38710d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14623a newBuilder() {
        C14623a aVar = new C14623a();
        aVar.f38707a = this.start_time;
        aVar.f38708b = this.end_time;
        aVar.f38709c = this.duration;
        aVar.f38710d = this.time_grain;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ai", "CalendarActionParams");
        StringBuilder sb = new StringBuilder();
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        if (this.end_time != null) {
            sb.append(", end_time=");
            sb.append(this.end_time);
        }
        if (this.duration != null) {
            sb.append(", duration=");
            sb.append(this.duration);
        }
        if (this.time_grain != null) {
            sb.append(", time_grain=");
            sb.append(this.time_grain);
        }
        StringBuilder replace = sb.replace(0, 2, "CalendarActionParams{");
        replace.append('}');
        return replace.toString();
    }

    public CalendarActionParams(Long l, Long l2, Integer num, String str) {
        this(l, l2, num, str, ByteString.EMPTY);
    }

    public CalendarActionParams(Long l, Long l2, Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.start_time = l;
        this.end_time = l2;
        this.duration = num;
        this.time_grain = str;
    }
}
