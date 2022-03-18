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

public final class WorkHourSpan extends Message<WorkHourSpan, C16126a> {
    public static final ProtoAdapter<WorkHourSpan> ADAPTER = new C16127b();
    public static final Integer DEFAULT_END_MINUTE = 0;
    public static final Integer DEFAULT_START_MINUTE = 0;
    private static final long serialVersionUID = 0;
    public final Integer end_minute;
    public final Integer start_minute;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.WorkHourSpan$b */
    private static final class C16127b extends ProtoAdapter<WorkHourSpan> {
        C16127b() {
            super(FieldEncoding.LENGTH_DELIMITED, WorkHourSpan.class);
        }

        /* renamed from: a */
        public int encodedSize(WorkHourSpan workHourSpan) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, workHourSpan.start_minute) + ProtoAdapter.INT32.encodedSizeWithTag(2, workHourSpan.end_minute) + workHourSpan.unknownFields().size();
        }

        /* renamed from: a */
        public WorkHourSpan decode(ProtoReader protoReader) throws IOException {
            C16126a aVar = new C16126a();
            aVar.f42235a = 0;
            aVar.f42236b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42235a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42236b = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, WorkHourSpan workHourSpan) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, workHourSpan.start_minute);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, workHourSpan.end_minute);
            protoWriter.writeBytes(workHourSpan.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16126a newBuilder() {
        C16126a aVar = new C16126a();
        aVar.f42235a = this.start_minute;
        aVar.f42236b = this.end_minute;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.WorkHourSpan$a */
    public static final class C16126a extends Message.Builder<WorkHourSpan, C16126a> {

        /* renamed from: a */
        public Integer f42235a;

        /* renamed from: b */
        public Integer f42236b;

        /* renamed from: a */
        public WorkHourSpan build() {
            Integer num;
            Integer num2 = this.f42235a;
            if (num2 != null && (num = this.f42236b) != null) {
                return new WorkHourSpan(num2, num, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num2, "start_minute", this.f42236b, "end_minute");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "WorkHourSpan");
        StringBuilder sb = new StringBuilder();
        sb.append(", start_minute=");
        sb.append(this.start_minute);
        sb.append(", end_minute=");
        sb.append(this.end_minute);
        StringBuilder replace = sb.replace(0, 2, "WorkHourSpan{");
        replace.append('}');
        return replace.toString();
    }

    public WorkHourSpan(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }

    public WorkHourSpan(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.start_minute = num;
        this.end_minute = num2;
    }
}
