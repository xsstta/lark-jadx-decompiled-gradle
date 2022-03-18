package com.bytedance.lark.pb.device.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PushDeviceNotifySettingResponse extends Message<PushDeviceNotifySettingResponse, C16586a> {
    public static final ProtoAdapter<PushDeviceNotifySettingResponse> ADAPTER = new C16587b();
    public static final Boolean DEFAULT_IS_NOTIFY = false;
    private static final long serialVersionUID = 0;
    public final Boolean is_notify;

    /* renamed from: com.bytedance.lark.pb.device.v1.PushDeviceNotifySettingResponse$b */
    private static final class C16587b extends ProtoAdapter<PushDeviceNotifySettingResponse> {
        C16587b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushDeviceNotifySettingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PushDeviceNotifySettingResponse pushDeviceNotifySettingResponse) {
            int i;
            if (pushDeviceNotifySettingResponse.is_notify != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, pushDeviceNotifySettingResponse.is_notify);
            } else {
                i = 0;
            }
            return i + pushDeviceNotifySettingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PushDeviceNotifySettingResponse decode(ProtoReader protoReader) throws IOException {
            C16586a aVar = new C16586a();
            aVar.f42948a = false;
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
                    aVar.f42948a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushDeviceNotifySettingResponse pushDeviceNotifySettingResponse) throws IOException {
            if (pushDeviceNotifySettingResponse.is_notify != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, pushDeviceNotifySettingResponse.is_notify);
            }
            protoWriter.writeBytes(pushDeviceNotifySettingResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.device.v1.PushDeviceNotifySettingResponse$a */
    public static final class C16586a extends Message.Builder<PushDeviceNotifySettingResponse, C16586a> {

        /* renamed from: a */
        public Boolean f42948a;

        /* renamed from: a */
        public PushDeviceNotifySettingResponse build() {
            return new PushDeviceNotifySettingResponse(this.f42948a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16586a newBuilder() {
        C16586a aVar = new C16586a();
        aVar.f42948a = this.is_notify;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("device", "PushDeviceNotifySettingResponse");
        StringBuilder sb = new StringBuilder();
        if (this.is_notify != null) {
            sb.append(", is_notify=");
            sb.append(this.is_notify);
        }
        StringBuilder replace = sb.replace(0, 2, "PushDeviceNotifySettingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PushDeviceNotifySettingResponse(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public PushDeviceNotifySettingResponse(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_notify = bool;
    }
}
