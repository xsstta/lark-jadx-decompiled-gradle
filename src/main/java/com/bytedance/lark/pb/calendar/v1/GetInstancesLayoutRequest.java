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

public final class GetInstancesLayoutRequest extends Message<GetInstancesLayoutRequest, C15716a> {
    public static final ProtoAdapter<GetInstancesLayoutRequest> ADAPTER = new C15717b();
    public static final Boolean DEFAULT_IS_SINGLE_DAY = false;
    private static final long serialVersionUID = 0;
    public final List<DayInstancesSlotMetric> days_instance_slot_metrics;
    public final Boolean is_single_day;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetInstancesLayoutRequest$b */
    private static final class C15717b extends ProtoAdapter<GetInstancesLayoutRequest> {
        C15717b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetInstancesLayoutRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetInstancesLayoutRequest getInstancesLayoutRequest) {
            int i;
            if (getInstancesLayoutRequest.is_single_day != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, getInstancesLayoutRequest.is_single_day);
            } else {
                i = 0;
            }
            return i + DayInstancesSlotMetric.ADAPTER.asRepeated().encodedSizeWithTag(2, getInstancesLayoutRequest.days_instance_slot_metrics) + getInstancesLayoutRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetInstancesLayoutRequest decode(ProtoReader protoReader) throws IOException {
            C15716a aVar = new C15716a();
            aVar.f41474a = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41474a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41475b.add(DayInstancesSlotMetric.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetInstancesLayoutRequest getInstancesLayoutRequest) throws IOException {
            if (getInstancesLayoutRequest.is_single_day != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getInstancesLayoutRequest.is_single_day);
            }
            DayInstancesSlotMetric.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getInstancesLayoutRequest.days_instance_slot_metrics);
            protoWriter.writeBytes(getInstancesLayoutRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetInstancesLayoutRequest$a */
    public static final class C15716a extends Message.Builder<GetInstancesLayoutRequest, C15716a> {

        /* renamed from: a */
        public Boolean f41474a;

        /* renamed from: b */
        public List<DayInstancesSlotMetric> f41475b = Internal.newMutableList();

        /* renamed from: a */
        public GetInstancesLayoutRequest build() {
            return new GetInstancesLayoutRequest(this.f41474a, this.f41475b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15716a mo56854a(List<DayInstancesSlotMetric> list) {
            Internal.checkElementsNotNull(list);
            this.f41475b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15716a newBuilder() {
        C15716a aVar = new C15716a();
        aVar.f41474a = this.is_single_day;
        aVar.f41475b = Internal.copyOf("days_instance_slot_metrics", this.days_instance_slot_metrics);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetInstancesLayoutRequest");
        StringBuilder sb = new StringBuilder();
        if (this.is_single_day != null) {
            sb.append(", is_single_day=");
            sb.append(this.is_single_day);
        }
        if (!this.days_instance_slot_metrics.isEmpty()) {
            sb.append(", days_instance_slot_metrics=");
            sb.append(this.days_instance_slot_metrics);
        }
        StringBuilder replace = sb.replace(0, 2, "GetInstancesLayoutRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetInstancesLayoutRequest(Boolean bool, List<DayInstancesSlotMetric> list) {
        this(bool, list, ByteString.EMPTY);
    }

    public GetInstancesLayoutRequest(Boolean bool, List<DayInstancesSlotMetric> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_single_day = bool;
        this.days_instance_slot_metrics = Internal.immutableCopyOf("days_instance_slot_metrics", list);
    }
}
