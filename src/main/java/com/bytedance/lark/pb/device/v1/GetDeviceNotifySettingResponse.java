package com.bytedance.lark.pb.device.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.DeviceNotifySetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetDeviceNotifySettingResponse extends Message<GetDeviceNotifySettingResponse, C16572a> {
    public static final ProtoAdapter<GetDeviceNotifySettingResponse> ADAPTER = new C16573b();
    private static final long serialVersionUID = 0;
    public final DeviceNotifySetting setting;

    /* renamed from: com.bytedance.lark.pb.device.v1.GetDeviceNotifySettingResponse$b */
    private static final class C16573b extends ProtoAdapter<GetDeviceNotifySettingResponse> {
        C16573b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetDeviceNotifySettingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetDeviceNotifySettingResponse getDeviceNotifySettingResponse) {
            return DeviceNotifySetting.ADAPTER.encodedSizeWithTag(1, getDeviceNotifySettingResponse.setting) + getDeviceNotifySettingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetDeviceNotifySettingResponse decode(ProtoReader protoReader) throws IOException {
            C16572a aVar = new C16572a();
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
                    aVar.f42940a = DeviceNotifySetting.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetDeviceNotifySettingResponse getDeviceNotifySettingResponse) throws IOException {
            DeviceNotifySetting.ADAPTER.encodeWithTag(protoWriter, 1, getDeviceNotifySettingResponse.setting);
            protoWriter.writeBytes(getDeviceNotifySettingResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.device.v1.GetDeviceNotifySettingResponse$a */
    public static final class C16572a extends Message.Builder<GetDeviceNotifySettingResponse, C16572a> {

        /* renamed from: a */
        public DeviceNotifySetting f42940a;

        /* renamed from: a */
        public GetDeviceNotifySettingResponse build() {
            DeviceNotifySetting deviceNotifySetting = this.f42940a;
            if (deviceNotifySetting != null) {
                return new GetDeviceNotifySettingResponse(deviceNotifySetting, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(deviceNotifySetting, "setting");
        }
    }

    @Override // com.squareup.wire.Message
    public C16572a newBuilder() {
        C16572a aVar = new C16572a();
        aVar.f42940a = this.setting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("device", "GetDeviceNotifySettingResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", setting=");
        sb.append(this.setting);
        StringBuilder replace = sb.replace(0, 2, "GetDeviceNotifySettingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetDeviceNotifySettingResponse(DeviceNotifySetting deviceNotifySetting) {
        this(deviceNotifySetting, ByteString.EMPTY);
    }

    public GetDeviceNotifySettingResponse(DeviceNotifySetting deviceNotifySetting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.setting = deviceNotifySetting;
    }
}
