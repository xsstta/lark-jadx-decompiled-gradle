package com.bytedance.lark.pb.device.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.DeviceNotifySetting;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SetDeviceNotifySettingRequest extends Message<SetDeviceNotifySettingRequest, C16590a> {
    public static final ProtoAdapter<SetDeviceNotifySettingRequest> ADAPTER = new C16591b();
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.FORCE_SERVER;
    public static final Type DEFAULT_TYPE = Type.DISABLE_MOBILE_NOTIFY;
    private static final long serialVersionUID = 0;
    public final DeviceNotifySetting setting;
    public final SyncDataStrategy sync_data_strategy;
    public final Type type;

    public enum Type implements WireEnum {
        DISABLE_MOBILE_NOTIFY(1),
        STILL_NOTIFY_AT(2),
        ALL(3);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 1) {
                return DISABLE_MOBILE_NOTIFY;
            }
            if (i == 2) {
                return STILL_NOTIFY_AT;
            }
            if (i != 3) {
                return null;
            }
            return ALL;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.device.v1.SetDeviceNotifySettingRequest$b */
    private static final class C16591b extends ProtoAdapter<SetDeviceNotifySettingRequest> {
        C16591b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetDeviceNotifySettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetDeviceNotifySettingRequest setDeviceNotifySettingRequest) {
            int i;
            int encodedSizeWithTag = DeviceNotifySetting.ADAPTER.encodedSizeWithTag(1, setDeviceNotifySettingRequest.setting);
            int i2 = 0;
            if (setDeviceNotifySettingRequest.type != null) {
                i = Type.ADAPTER.encodedSizeWithTag(2, setDeviceNotifySettingRequest.type);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (setDeviceNotifySettingRequest.sync_data_strategy != null) {
                i2 = SyncDataStrategy.ADAPTER.encodedSizeWithTag(3, setDeviceNotifySettingRequest.sync_data_strategy);
            }
            return i3 + i2 + setDeviceNotifySettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetDeviceNotifySettingRequest decode(ProtoReader protoReader) throws IOException {
            C16590a aVar = new C16590a();
            aVar.f42951b = Type.DISABLE_MOBILE_NOTIFY;
            aVar.f42952c = SyncDataStrategy.FORCE_SERVER;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42950a = DeviceNotifySetting.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f42951b = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f42952c = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetDeviceNotifySettingRequest setDeviceNotifySettingRequest) throws IOException {
            DeviceNotifySetting.ADAPTER.encodeWithTag(protoWriter, 1, setDeviceNotifySettingRequest.setting);
            if (setDeviceNotifySettingRequest.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 2, setDeviceNotifySettingRequest.type);
            }
            if (setDeviceNotifySettingRequest.sync_data_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 3, setDeviceNotifySettingRequest.sync_data_strategy);
            }
            protoWriter.writeBytes(setDeviceNotifySettingRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16590a newBuilder() {
        C16590a aVar = new C16590a();
        aVar.f42950a = this.setting;
        aVar.f42951b = this.type;
        aVar.f42952c = this.sync_data_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.device.v1.SetDeviceNotifySettingRequest$a */
    public static final class C16590a extends Message.Builder<SetDeviceNotifySettingRequest, C16590a> {

        /* renamed from: a */
        public DeviceNotifySetting f42950a;

        /* renamed from: b */
        public Type f42951b;

        /* renamed from: c */
        public SyncDataStrategy f42952c;

        /* renamed from: a */
        public SetDeviceNotifySettingRequest build() {
            DeviceNotifySetting deviceNotifySetting = this.f42950a;
            if (deviceNotifySetting != null) {
                return new SetDeviceNotifySettingRequest(deviceNotifySetting, this.f42951b, this.f42952c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(deviceNotifySetting, "setting");
        }

        /* renamed from: a */
        public C16590a mo59016a(DeviceNotifySetting deviceNotifySetting) {
            this.f42950a = deviceNotifySetting;
            return this;
        }

        /* renamed from: a */
        public C16590a mo59017a(Type type) {
            this.f42951b = type;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("device", "SetDeviceNotifySettingRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", setting=");
        sb.append(this.setting);
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.sync_data_strategy != null) {
            sb.append(", sync_data_strategy=");
            sb.append(this.sync_data_strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "SetDeviceNotifySettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetDeviceNotifySettingRequest(DeviceNotifySetting deviceNotifySetting, Type type2, SyncDataStrategy syncDataStrategy) {
        this(deviceNotifySetting, type2, syncDataStrategy, ByteString.EMPTY);
    }

    public SetDeviceNotifySettingRequest(DeviceNotifySetting deviceNotifySetting, Type type2, SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.setting = deviceNotifySetting;
        this.type = type2;
        this.sync_data_strategy = syncDataStrategy;
    }
}
