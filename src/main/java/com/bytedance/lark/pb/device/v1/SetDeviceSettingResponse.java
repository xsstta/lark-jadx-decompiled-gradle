package com.bytedance.lark.pb.device.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetDeviceSettingResponse extends Message<SetDeviceSettingResponse, C16596a> {
    public static final ProtoAdapter<SetDeviceSettingResponse> ADAPTER = new C16597b();
    private static final long serialVersionUID = 0;
    public final String locale_identifier;

    /* renamed from: com.bytedance.lark.pb.device.v1.SetDeviceSettingResponse$b */
    private static final class C16597b extends ProtoAdapter<SetDeviceSettingResponse> {
        C16597b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetDeviceSettingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SetDeviceSettingResponse setDeviceSettingResponse) {
            int i;
            if (setDeviceSettingResponse.locale_identifier != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, setDeviceSettingResponse.locale_identifier);
            } else {
                i = 0;
            }
            return i + setDeviceSettingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SetDeviceSettingResponse decode(ProtoReader protoReader) throws IOException {
            C16596a aVar = new C16596a();
            aVar.f42963a = "";
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
                    aVar.f42963a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetDeviceSettingResponse setDeviceSettingResponse) throws IOException {
            if (setDeviceSettingResponse.locale_identifier != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setDeviceSettingResponse.locale_identifier);
            }
            protoWriter.writeBytes(setDeviceSettingResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.device.v1.SetDeviceSettingResponse$a */
    public static final class C16596a extends Message.Builder<SetDeviceSettingResponse, C16596a> {

        /* renamed from: a */
        public String f42963a;

        /* renamed from: a */
        public SetDeviceSettingResponse build() {
            return new SetDeviceSettingResponse(this.f42963a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16596a newBuilder() {
        C16596a aVar = new C16596a();
        aVar.f42963a = this.locale_identifier;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("device", "SetDeviceSettingResponse");
        StringBuilder sb = new StringBuilder();
        if (this.locale_identifier != null) {
            sb.append(", locale_identifier=");
            sb.append(this.locale_identifier);
        }
        StringBuilder replace = sb.replace(0, 2, "SetDeviceSettingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SetDeviceSettingResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public SetDeviceSettingResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.locale_identifier = str;
    }
}
