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

public final class DayInstancesLayout extends Message<DayInstancesLayout, C15588a> {
    public static final ProtoAdapter<DayInstancesLayout> ADAPTER = new C15589b();
    public static final Integer DEFAULT_LAYOUT_DAY = 0;
    private static final long serialVersionUID = 0;
    public final List<InstanceLayout> instances_layout;
    public final Integer layout_day;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.DayInstancesLayout$b */
    private static final class C15589b extends ProtoAdapter<DayInstancesLayout> {
        C15589b() {
            super(FieldEncoding.LENGTH_DELIMITED, DayInstancesLayout.class);
        }

        /* renamed from: a */
        public int encodedSize(DayInstancesLayout dayInstancesLayout) {
            return InstanceLayout.ADAPTER.asRepeated().encodedSizeWithTag(1, dayInstancesLayout.instances_layout) + ProtoAdapter.INT32.encodedSizeWithTag(2, dayInstancesLayout.layout_day) + dayInstancesLayout.unknownFields().size();
        }

        /* renamed from: a */
        public DayInstancesLayout decode(ProtoReader protoReader) throws IOException {
            C15588a aVar = new C15588a();
            aVar.f41321b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41320a.add(InstanceLayout.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41321b = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DayInstancesLayout dayInstancesLayout) throws IOException {
            InstanceLayout.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, dayInstancesLayout.instances_layout);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, dayInstancesLayout.layout_day);
            protoWriter.writeBytes(dayInstancesLayout.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.DayInstancesLayout$a */
    public static final class C15588a extends Message.Builder<DayInstancesLayout, C15588a> {

        /* renamed from: a */
        public List<InstanceLayout> f41320a = Internal.newMutableList();

        /* renamed from: b */
        public Integer f41321b;

        /* renamed from: a */
        public DayInstancesLayout build() {
            Integer num = this.f41321b;
            if (num != null) {
                return new DayInstancesLayout(this.f41320a, num, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num, "layout_day");
        }
    }

    @Override // com.squareup.wire.Message
    public C15588a newBuilder() {
        C15588a aVar = new C15588a();
        aVar.f41320a = Internal.copyOf("instances_layout", this.instances_layout);
        aVar.f41321b = this.layout_day;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "DayInstancesLayout");
        StringBuilder sb = new StringBuilder();
        if (!this.instances_layout.isEmpty()) {
            sb.append(", instances_layout=");
            sb.append(this.instances_layout);
        }
        sb.append(", layout_day=");
        sb.append(this.layout_day);
        StringBuilder replace = sb.replace(0, 2, "DayInstancesLayout{");
        replace.append('}');
        return replace.toString();
    }

    public DayInstancesLayout(List<InstanceLayout> list, Integer num) {
        this(list, num, ByteString.EMPTY);
    }

    public DayInstancesLayout(List<InstanceLayout> list, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.instances_layout = Internal.immutableCopyOf("instances_layout", list);
        this.layout_day = num;
    }
}
