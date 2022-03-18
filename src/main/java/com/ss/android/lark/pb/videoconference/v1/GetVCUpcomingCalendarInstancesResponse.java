package com.ss.android.lark.pb.videoconference.v1;

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

public final class GetVCUpcomingCalendarInstancesResponse extends Message<GetVCUpcomingCalendarInstancesResponse, C50703a> {
    public static final ProtoAdapter<GetVCUpcomingCalendarInstancesResponse> ADAPTER = new C50704b();
    private static final long serialVersionUID = 0;
    public final List<VCUpcomingVcInstance> instances;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetVCUpcomingCalendarInstancesResponse$b */
    private static final class C50704b extends ProtoAdapter<GetVCUpcomingCalendarInstancesResponse> {
        C50704b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetVCUpcomingCalendarInstancesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetVCUpcomingCalendarInstancesResponse getVCUpcomingCalendarInstancesResponse) {
            return VCUpcomingVcInstance.ADAPTER.asRepeated().encodedSizeWithTag(1, getVCUpcomingCalendarInstancesResponse.instances) + getVCUpcomingCalendarInstancesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetVCUpcomingCalendarInstancesResponse decode(ProtoReader protoReader) throws IOException {
            C50703a aVar = new C50703a();
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
                    aVar.f126441a.add(VCUpcomingVcInstance.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetVCUpcomingCalendarInstancesResponse getVCUpcomingCalendarInstancesResponse) throws IOException {
            VCUpcomingVcInstance.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getVCUpcomingCalendarInstancesResponse.instances);
            protoWriter.writeBytes(getVCUpcomingCalendarInstancesResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetVCUpcomingCalendarInstancesResponse$a */
    public static final class C50703a extends Message.Builder<GetVCUpcomingCalendarInstancesResponse, C50703a> {

        /* renamed from: a */
        public List<VCUpcomingVcInstance> f126441a = Internal.newMutableList();

        /* renamed from: a */
        public GetVCUpcomingCalendarInstancesResponse build() {
            return new GetVCUpcomingCalendarInstancesResponse(this.f126441a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50703a newBuilder() {
        C50703a aVar = new C50703a();
        aVar.f126441a = Internal.copyOf("instances", this.instances);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetVCUpcomingCalendarInstancesResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.instances.isEmpty()) {
            sb.append(", instances=");
            sb.append(this.instances);
        }
        StringBuilder replace = sb.replace(0, 2, "GetVCUpcomingCalendarInstancesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetVCUpcomingCalendarInstancesResponse(List<VCUpcomingVcInstance> list) {
        this(list, ByteString.EMPTY);
    }

    public GetVCUpcomingCalendarInstancesResponse(List<VCUpcomingVcInstance> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.instances = Internal.immutableCopyOf("instances", list);
    }
}
