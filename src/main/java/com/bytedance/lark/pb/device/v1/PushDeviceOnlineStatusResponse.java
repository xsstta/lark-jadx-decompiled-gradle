package com.bytedance.lark.pb.device.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Device;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PushDeviceOnlineStatusResponse extends Message<PushDeviceOnlineStatusResponse, C16588a> {
    public static final ProtoAdapter<PushDeviceOnlineStatusResponse> ADAPTER = new C16589b();
    private static final long serialVersionUID = 0;
    public final Device device;

    /* renamed from: com.bytedance.lark.pb.device.v1.PushDeviceOnlineStatusResponse$b */
    private static final class C16589b extends ProtoAdapter<PushDeviceOnlineStatusResponse> {
        C16589b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushDeviceOnlineStatusResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PushDeviceOnlineStatusResponse pushDeviceOnlineStatusResponse) {
            int i;
            if (pushDeviceOnlineStatusResponse.device != null) {
                i = Device.ADAPTER.encodedSizeWithTag(1, pushDeviceOnlineStatusResponse.device);
            } else {
                i = 0;
            }
            return i + pushDeviceOnlineStatusResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PushDeviceOnlineStatusResponse decode(ProtoReader protoReader) throws IOException {
            C16588a aVar = new C16588a();
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
                    aVar.f42949a = Device.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushDeviceOnlineStatusResponse pushDeviceOnlineStatusResponse) throws IOException {
            if (pushDeviceOnlineStatusResponse.device != null) {
                Device.ADAPTER.encodeWithTag(protoWriter, 1, pushDeviceOnlineStatusResponse.device);
            }
            protoWriter.writeBytes(pushDeviceOnlineStatusResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.device.v1.PushDeviceOnlineStatusResponse$a */
    public static final class C16588a extends Message.Builder<PushDeviceOnlineStatusResponse, C16588a> {

        /* renamed from: a */
        public Device f42949a;

        /* renamed from: a */
        public PushDeviceOnlineStatusResponse build() {
            return new PushDeviceOnlineStatusResponse(this.f42949a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16588a newBuilder() {
        C16588a aVar = new C16588a();
        aVar.f42949a = this.device;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("device", "PushDeviceOnlineStatusResponse");
        StringBuilder sb = new StringBuilder();
        if (this.device != null) {
            sb.append(", device=");
            sb.append(this.device);
        }
        StringBuilder replace = sb.replace(0, 2, "PushDeviceOnlineStatusResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PushDeviceOnlineStatusResponse(Device device2) {
        this(device2, ByteString.EMPTY);
    }

    public PushDeviceOnlineStatusResponse(Device device2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.device = device2;
    }
}
