package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class DayInstancesSlotMetric extends Message<DayInstancesSlotMetric, C15590a> {
    public static final ProtoAdapter<DayInstancesSlotMetric> ADAPTER = new C15591b();
    public static final Integer DEFAULT_LAYOUT_DAY = 0;
    private static final long serialVersionUID = 0;
    public final Integer layout_day;
    public final List<InstanceSlotMetric> slot_metrics;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.DayInstancesSlotMetric$b */
    private static final class C15591b extends ProtoAdapter<DayInstancesSlotMetric> {
        C15591b() {
            super(FieldEncoding.LENGTH_DELIMITED, DayInstancesSlotMetric.class);
        }

        /* renamed from: a */
        public int encodedSize(DayInstancesSlotMetric dayInstancesSlotMetric) {
            return InstanceSlotMetric.ADAPTER.asRepeated().encodedSizeWithTag(1, dayInstancesSlotMetric.slot_metrics) + ProtoAdapter.INT32.encodedSizeWithTag(2, dayInstancesSlotMetric.layout_day) + dayInstancesSlotMetric.unknownFields().size();
        }

        /* renamed from: a */
        public DayInstancesSlotMetric decode(ProtoReader protoReader) throws IOException {
            C15590a aVar = new C15590a();
            aVar.f41323b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41322a.add(InstanceSlotMetric.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41323b = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DayInstancesSlotMetric dayInstancesSlotMetric) throws IOException {
            InstanceSlotMetric.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, dayInstancesSlotMetric.slot_metrics);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, dayInstancesSlotMetric.layout_day);
            protoWriter.writeBytes(dayInstancesSlotMetric.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.DayInstancesSlotMetric$a */
    public static final class C15590a extends Message.Builder<DayInstancesSlotMetric, C15590a> {

        /* renamed from: a */
        public List<InstanceSlotMetric> f41322a = Internal.newMutableList();

        /* renamed from: b */
        public Integer f41323b;

        /* renamed from: a */
        public DayInstancesSlotMetric build() {
            Integer num = this.f41323b;
            if (num != null) {
                return new DayInstancesSlotMetric(this.f41322a, num, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num, "layout_day");
        }

        /* renamed from: a */
        public C15590a mo56543a(Integer num) {
            this.f41323b = num;
            return this;
        }

        /* renamed from: a */
        public C15590a mo56544a(List<InstanceSlotMetric> list) {
            Internal.checkElementsNotNull(list);
            this.f41322a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15590a newBuilder() {
        C15590a aVar = new C15590a();
        aVar.f41322a = Internal.copyOf("slot_metrics", this.slot_metrics);
        aVar.f41323b = this.layout_day;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "DayInstancesSlotMetric");
        StringBuilder sb = new StringBuilder();
        if (!this.slot_metrics.isEmpty()) {
            sb.append(", slot_metrics=");
            sb.append(this.slot_metrics);
        }
        sb.append(", layout_day=");
        sb.append(this.layout_day);
        StringBuilder replace = sb.replace(0, 2, "DayInstancesSlotMetric{");
        replace.append('}');
        return replace.toString();
    }

    public DayInstancesSlotMetric(List<InstanceSlotMetric> list, Integer num) {
        this(list, num, ByteString.EMPTY);
    }

    public DayInstancesSlotMetric(List<InstanceSlotMetric> list, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.slot_metrics = Internal.immutableCopyOf("slot_metrics", list);
        this.layout_day = num;
    }
}
