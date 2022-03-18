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

public final class GetInstancesLayoutResponse extends Message<GetInstancesLayoutResponse, C15718a> {
    public static final ProtoAdapter<GetInstancesLayoutResponse> ADAPTER = new C15719b();
    private static final long serialVersionUID = 0;
    public final List<DayInstancesLayout> days_instance_layout;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetInstancesLayoutResponse$b */
    private static final class C15719b extends ProtoAdapter<GetInstancesLayoutResponse> {
        C15719b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetInstancesLayoutResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetInstancesLayoutResponse getInstancesLayoutResponse) {
            return DayInstancesLayout.ADAPTER.asRepeated().encodedSizeWithTag(1, getInstancesLayoutResponse.days_instance_layout) + getInstancesLayoutResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetInstancesLayoutResponse decode(ProtoReader protoReader) throws IOException {
            C15718a aVar = new C15718a();
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
                    aVar.f41476a.add(DayInstancesLayout.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetInstancesLayoutResponse getInstancesLayoutResponse) throws IOException {
            DayInstancesLayout.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getInstancesLayoutResponse.days_instance_layout);
            protoWriter.writeBytes(getInstancesLayoutResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetInstancesLayoutResponse$a */
    public static final class C15718a extends Message.Builder<GetInstancesLayoutResponse, C15718a> {

        /* renamed from: a */
        public List<DayInstancesLayout> f41476a = Internal.newMutableList();

        /* renamed from: a */
        public GetInstancesLayoutResponse build() {
            return new GetInstancesLayoutResponse(this.f41476a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15718a newBuilder() {
        C15718a aVar = new C15718a();
        aVar.f41476a = Internal.copyOf("days_instance_layout", this.days_instance_layout);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetInstancesLayoutResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.days_instance_layout.isEmpty()) {
            sb.append(", days_instance_layout=");
            sb.append(this.days_instance_layout);
        }
        StringBuilder replace = sb.replace(0, 2, "GetInstancesLayoutResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetInstancesLayoutResponse(List<DayInstancesLayout> list) {
        this(list, ByteString.EMPTY);
    }

    public GetInstancesLayoutResponse(List<DayInstancesLayout> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.days_instance_layout = Internal.immutableCopyOf("days_instance_layout", list);
    }
}
