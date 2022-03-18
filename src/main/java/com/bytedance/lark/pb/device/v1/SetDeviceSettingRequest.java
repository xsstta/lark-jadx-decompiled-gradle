package com.bytedance.lark.pb.device.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SetDeviceSettingRequest extends Message<SetDeviceSettingRequest, C16594a> {
    public static final ProtoAdapter<SetDeviceSettingRequest> ADAPTER = new C16595b();
    private static final long serialVersionUID = 0;
    public final String device_id;
    public final String locale_identifier;

    /* renamed from: com.bytedance.lark.pb.device.v1.SetDeviceSettingRequest$b */
    private static final class C16595b extends ProtoAdapter<SetDeviceSettingRequest> {
        C16595b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetDeviceSettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetDeviceSettingRequest setDeviceSettingRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, setDeviceSettingRequest.device_id);
            if (setDeviceSettingRequest.locale_identifier != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, setDeviceSettingRequest.locale_identifier);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + setDeviceSettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetDeviceSettingRequest decode(ProtoReader protoReader) throws IOException {
            C16594a aVar = new C16594a();
            aVar.f42961a = "";
            aVar.f42962b = "zh_CN";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42961a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42962b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetDeviceSettingRequest setDeviceSettingRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setDeviceSettingRequest.device_id);
            if (setDeviceSettingRequest.locale_identifier != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, setDeviceSettingRequest.locale_identifier);
            }
            protoWriter.writeBytes(setDeviceSettingRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.device.v1.SetDeviceSettingRequest$a */
    public static final class C16594a extends Message.Builder<SetDeviceSettingRequest, C16594a> {

        /* renamed from: a */
        public String f42961a;

        /* renamed from: b */
        public String f42962b;

        /* renamed from: a */
        public SetDeviceSettingRequest build() {
            String str = this.f42961a;
            if (str != null) {
                return new SetDeviceSettingRequest(str, this.f42962b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "device_id");
        }

        /* renamed from: a */
        public C16594a mo59032a(String str) {
            this.f42961a = str;
            return this;
        }

        /* renamed from: b */
        public C16594a mo59034b(String str) {
            this.f42962b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16594a newBuilder() {
        C16594a aVar = new C16594a();
        aVar.f42961a = this.device_id;
        aVar.f42962b = this.locale_identifier;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("device", "SetDeviceSettingRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", device_id=");
        sb.append(this.device_id);
        if (this.locale_identifier != null) {
            sb.append(", locale_identifier=");
            sb.append(this.locale_identifier);
        }
        StringBuilder replace = sb.replace(0, 2, "SetDeviceSettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetDeviceSettingRequest(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public SetDeviceSettingRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.device_id = str;
        this.locale_identifier = str2;
    }
}
