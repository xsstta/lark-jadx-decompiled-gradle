package com.bytedance.lark.pb.device.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Device;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetValidDevicesResponse extends Message<GetValidDevicesResponse, C16582a> {
    public static final ProtoAdapter<GetValidDevicesResponse> ADAPTER = new C16583b();
    private static final long serialVersionUID = 0;
    public final List<Device> devices;

    /* renamed from: com.bytedance.lark.pb.device.v1.GetValidDevicesResponse$b */
    private static final class C16583b extends ProtoAdapter<GetValidDevicesResponse> {
        C16583b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetValidDevicesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetValidDevicesResponse getValidDevicesResponse) {
            return Device.ADAPTER.asRepeated().encodedSizeWithTag(1, getValidDevicesResponse.devices) + getValidDevicesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetValidDevicesResponse decode(ProtoReader protoReader) throws IOException {
            C16582a aVar = new C16582a();
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
                    aVar.f42945a.add(Device.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetValidDevicesResponse getValidDevicesResponse) throws IOException {
            Device.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getValidDevicesResponse.devices);
            protoWriter.writeBytes(getValidDevicesResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.device.v1.GetValidDevicesResponse$a */
    public static final class C16582a extends Message.Builder<GetValidDevicesResponse, C16582a> {

        /* renamed from: a */
        public List<Device> f42945a = Internal.newMutableList();

        /* renamed from: a */
        public GetValidDevicesResponse build() {
            return new GetValidDevicesResponse(this.f42945a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16582a newBuilder() {
        C16582a aVar = new C16582a();
        aVar.f42945a = Internal.copyOf("devices", this.devices);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("device", "GetValidDevicesResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.devices.isEmpty()) {
            sb.append(", devices=");
            sb.append(this.devices);
        }
        StringBuilder replace = sb.replace(0, 2, "GetValidDevicesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetValidDevicesResponse(List<Device> list) {
        this(list, ByteString.EMPTY);
    }

    public GetValidDevicesResponse(List<Device> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.devices = Internal.immutableCopyOf("devices", list);
    }
}
