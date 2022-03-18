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

public final class WorkHourItem extends Message<WorkHourItem, C16122a> {
    public static final ProtoAdapter<WorkHourItem> ADAPTER = new C16123b();
    private static final long serialVersionUID = 0;
    public final List<WorkHourSpan> spans;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.WorkHourItem$b */
    private static final class C16123b extends ProtoAdapter<WorkHourItem> {
        C16123b() {
            super(FieldEncoding.LENGTH_DELIMITED, WorkHourItem.class);
        }

        /* renamed from: a */
        public int encodedSize(WorkHourItem workHourItem) {
            return WorkHourSpan.ADAPTER.asRepeated().encodedSizeWithTag(1, workHourItem.spans) + workHourItem.unknownFields().size();
        }

        /* renamed from: a */
        public WorkHourItem decode(ProtoReader protoReader) throws IOException {
            C16122a aVar = new C16122a();
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
                    aVar.f42230a.add(WorkHourSpan.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, WorkHourItem workHourItem) throws IOException {
            WorkHourSpan.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, workHourItem.spans);
            protoWriter.writeBytes(workHourItem.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.WorkHourItem$a */
    public static final class C16122a extends Message.Builder<WorkHourItem, C16122a> {

        /* renamed from: a */
        public List<WorkHourSpan> f42230a = Internal.newMutableList();

        /* renamed from: a */
        public WorkHourItem build() {
            return new WorkHourItem(this.f42230a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16122a newBuilder() {
        C16122a aVar = new C16122a();
        aVar.f42230a = Internal.copyOf("spans", this.spans);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "WorkHourItem");
        StringBuilder sb = new StringBuilder();
        if (!this.spans.isEmpty()) {
            sb.append(", spans=");
            sb.append(this.spans);
        }
        StringBuilder replace = sb.replace(0, 2, "WorkHourItem{");
        replace.append('}');
        return replace.toString();
    }

    public WorkHourItem(List<WorkHourSpan> list) {
        this(list, ByteString.EMPTY);
    }

    public WorkHourItem(List<WorkHourSpan> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.spans = Internal.immutableCopyOf("spans", list);
    }
}
