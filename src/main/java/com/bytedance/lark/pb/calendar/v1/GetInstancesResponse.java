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

public final class GetInstancesResponse extends Message<GetInstancesResponse, C15722a> {
    public static final ProtoAdapter<GetInstancesResponse> ADAPTER = new C15723b();
    private static final long serialVersionUID = 0;
    public final List<CalendarEventInstance> instances;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetInstancesResponse$b */
    private static final class C15723b extends ProtoAdapter<GetInstancesResponse> {
        C15723b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetInstancesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetInstancesResponse getInstancesResponse) {
            return CalendarEventInstance.ADAPTER.asRepeated().encodedSizeWithTag(1, getInstancesResponse.instances) + getInstancesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetInstancesResponse decode(ProtoReader protoReader) throws IOException {
            C15722a aVar = new C15722a();
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
                    aVar.f41481a.add(CalendarEventInstance.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetInstancesResponse getInstancesResponse) throws IOException {
            CalendarEventInstance.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getInstancesResponse.instances);
            protoWriter.writeBytes(getInstancesResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetInstancesResponse$a */
    public static final class C15722a extends Message.Builder<GetInstancesResponse, C15722a> {

        /* renamed from: a */
        public List<CalendarEventInstance> f41481a = Internal.newMutableList();

        /* renamed from: a */
        public GetInstancesResponse build() {
            return new GetInstancesResponse(this.f41481a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15722a newBuilder() {
        C15722a aVar = new C15722a();
        aVar.f41481a = Internal.copyOf("instances", this.instances);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetInstancesResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.instances.isEmpty()) {
            sb.append(", instances=");
            sb.append(this.instances);
        }
        StringBuilder replace = sb.replace(0, 2, "GetInstancesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetInstancesResponse(List<CalendarEventInstance> list) {
        this(list, ByteString.EMPTY);
    }

    public GetInstancesResponse(List<CalendarEventInstance> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.instances = Internal.immutableCopyOf("instances", list);
    }
}
