package com.bytedance.lark.pb.device.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetDeviceNotifySettingRequest extends Message<GetDeviceNotifySettingRequest, C16570a> {
    public static final ProtoAdapter<GetDeviceNotifySettingRequest> ADAPTER = new C16571b();
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.FORCE_SERVER;
    private static final long serialVersionUID = 0;
    public final SyncDataStrategy sync_data_strategy;

    /* renamed from: com.bytedance.lark.pb.device.v1.GetDeviceNotifySettingRequest$b */
    private static final class C16571b extends ProtoAdapter<GetDeviceNotifySettingRequest> {
        C16571b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetDeviceNotifySettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetDeviceNotifySettingRequest getDeviceNotifySettingRequest) {
            int i;
            if (getDeviceNotifySettingRequest.sync_data_strategy != null) {
                i = SyncDataStrategy.ADAPTER.encodedSizeWithTag(1, getDeviceNotifySettingRequest.sync_data_strategy);
            } else {
                i = 0;
            }
            return i + getDeviceNotifySettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetDeviceNotifySettingRequest decode(ProtoReader protoReader) throws IOException {
            C16570a aVar = new C16570a();
            aVar.f42939a = SyncDataStrategy.FORCE_SERVER;
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
                    try {
                        aVar.f42939a = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetDeviceNotifySettingRequest getDeviceNotifySettingRequest) throws IOException {
            if (getDeviceNotifySettingRequest.sync_data_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 1, getDeviceNotifySettingRequest.sync_data_strategy);
            }
            protoWriter.writeBytes(getDeviceNotifySettingRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.device.v1.GetDeviceNotifySettingRequest$a */
    public static final class C16570a extends Message.Builder<GetDeviceNotifySettingRequest, C16570a> {

        /* renamed from: a */
        public SyncDataStrategy f42939a;

        /* renamed from: a */
        public GetDeviceNotifySettingRequest build() {
            return new GetDeviceNotifySettingRequest(this.f42939a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16570a newBuilder() {
        C16570a aVar = new C16570a();
        aVar.f42939a = this.sync_data_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("device", "GetDeviceNotifySettingRequest");
        StringBuilder sb = new StringBuilder();
        if (this.sync_data_strategy != null) {
            sb.append(", sync_data_strategy=");
            sb.append(this.sync_data_strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetDeviceNotifySettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetDeviceNotifySettingRequest(SyncDataStrategy syncDataStrategy) {
        this(syncDataStrategy, ByteString.EMPTY);
    }

    public GetDeviceNotifySettingRequest(SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sync_data_strategy = syncDataStrategy;
    }
}
