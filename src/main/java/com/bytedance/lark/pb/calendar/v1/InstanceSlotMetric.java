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

public final class InstanceSlotMetric extends Message<InstanceSlotMetric, C15816a> {
    public static final ProtoAdapter<InstanceSlotMetric> ADAPTER = new C15817b();
    public static final Integer DEFAULT_END_DAY = 0;
    public static final Integer DEFAULT_END_MINUTE = 0;
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Integer DEFAULT_START_DAY = 0;
    public static final Integer DEFAULT_START_MINUTE = 0;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Integer end_day;
    public final Integer end_minute;
    public final Long end_time;
    public final String id;
    public final Integer start_day;
    public final Integer start_minute;
    public final Long start_time;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.InstanceSlotMetric$b */
    private static final class C15817b extends ProtoAdapter<InstanceSlotMetric> {
        C15817b() {
            super(FieldEncoding.LENGTH_DELIMITED, InstanceSlotMetric.class);
        }

        /* renamed from: a */
        public int encodedSize(InstanceSlotMetric instanceSlotMetric) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, instanceSlotMetric.id) + ProtoAdapter.INT64.encodedSizeWithTag(2, instanceSlotMetric.start_time) + ProtoAdapter.INT64.encodedSizeWithTag(3, instanceSlotMetric.end_time) + ProtoAdapter.INT32.encodedSizeWithTag(4, instanceSlotMetric.start_minute) + ProtoAdapter.INT32.encodedSizeWithTag(5, instanceSlotMetric.end_minute) + ProtoAdapter.INT32.encodedSizeWithTag(6, instanceSlotMetric.start_day) + ProtoAdapter.INT32.encodedSizeWithTag(7, instanceSlotMetric.end_day) + instanceSlotMetric.unknownFields().size();
        }

        /* renamed from: a */
        public InstanceSlotMetric decode(ProtoReader protoReader) throws IOException {
            C15816a aVar = new C15816a();
            aVar.f41601a = "";
            aVar.f41602b = 0L;
            aVar.f41603c = 0L;
            aVar.f41604d = 0;
            aVar.f41605e = 0;
            aVar.f41606f = 0;
            aVar.f41607g = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41601a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f41602b = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            aVar.f41603c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f41604d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f41605e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f41606f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            aVar.f41607g = ProtoAdapter.INT32.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, InstanceSlotMetric instanceSlotMetric) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, instanceSlotMetric.id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, instanceSlotMetric.start_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, instanceSlotMetric.end_time);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, instanceSlotMetric.start_minute);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, instanceSlotMetric.end_minute);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, instanceSlotMetric.start_day);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, instanceSlotMetric.end_day);
            protoWriter.writeBytes(instanceSlotMetric.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15816a newBuilder() {
        C15816a aVar = new C15816a();
        aVar.f41601a = this.id;
        aVar.f41602b = this.start_time;
        aVar.f41603c = this.end_time;
        aVar.f41604d = this.start_minute;
        aVar.f41605e = this.end_minute;
        aVar.f41606f = this.start_day;
        aVar.f41607g = this.end_day;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.InstanceSlotMetric$a */
    public static final class C15816a extends Message.Builder<InstanceSlotMetric, C15816a> {

        /* renamed from: a */
        public String f41601a;

        /* renamed from: b */
        public Long f41602b;

        /* renamed from: c */
        public Long f41603c;

        /* renamed from: d */
        public Integer f41604d;

        /* renamed from: e */
        public Integer f41605e;

        /* renamed from: f */
        public Integer f41606f;

        /* renamed from: g */
        public Integer f41607g;

        /* renamed from: a */
        public InstanceSlotMetric build() {
            Long l;
            Long l2;
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            String str = this.f41601a;
            if (str != null && (l = this.f41602b) != null && (l2 = this.f41603c) != null && (num = this.f41604d) != null && (num2 = this.f41605e) != null && (num3 = this.f41606f) != null && (num4 = this.f41607g) != null) {
                return new InstanceSlotMetric(str, l, l2, num, num2, num3, num4, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id", this.f41602b, "start_time", this.f41603c, "end_time", this.f41604d, "start_minute", this.f41605e, "end_minute", this.f41606f, "start_day", this.f41607g, "end_day");
        }

        /* renamed from: a */
        public C15816a mo57103a(Integer num) {
            this.f41604d = num;
            return this;
        }

        /* renamed from: b */
        public C15816a mo57107b(Integer num) {
            this.f41605e = num;
            return this;
        }

        /* renamed from: c */
        public C15816a mo57109c(Integer num) {
            this.f41606f = num;
            return this;
        }

        /* renamed from: d */
        public C15816a mo57110d(Integer num) {
            this.f41607g = num;
            return this;
        }

        /* renamed from: a */
        public C15816a mo57104a(Long l) {
            this.f41602b = l;
            return this;
        }

        /* renamed from: b */
        public C15816a mo57108b(Long l) {
            this.f41603c = l;
            return this;
        }

        /* renamed from: a */
        public C15816a mo57105a(String str) {
            this.f41601a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "InstanceSlotMetric");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", start_time=");
        sb.append(this.start_time);
        sb.append(", end_time=");
        sb.append(this.end_time);
        sb.append(", start_minute=");
        sb.append(this.start_minute);
        sb.append(", end_minute=");
        sb.append(this.end_minute);
        sb.append(", start_day=");
        sb.append(this.start_day);
        sb.append(", end_day=");
        sb.append(this.end_day);
        StringBuilder replace = sb.replace(0, 2, "InstanceSlotMetric{");
        replace.append('}');
        return replace.toString();
    }

    public InstanceSlotMetric(String str, Long l, Long l2, Integer num, Integer num2, Integer num3, Integer num4) {
        this(str, l, l2, num, num2, num3, num4, ByteString.EMPTY);
    }

    public InstanceSlotMetric(String str, Long l, Long l2, Integer num, Integer num2, Integer num3, Integer num4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.start_time = l;
        this.end_time = l2;
        this.start_minute = num;
        this.end_minute = num2;
        this.start_day = num3;
        this.end_day = num4;
    }
}
