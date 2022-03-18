package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UploadPinSettingRequest extends Message<UploadPinSettingRequest, C19227a> {
    public static final ProtoAdapter<UploadPinSettingRequest> ADAPTER = new C19228b();
    private static final long serialVersionUID = 0;
    public final PinSubscribeSetting pin_subscribe_setting;

    /* renamed from: com.bytedance.lark.pb.settings.v1.UploadPinSettingRequest$b */
    private static final class C19228b extends ProtoAdapter<UploadPinSettingRequest> {
        C19228b() {
            super(FieldEncoding.LENGTH_DELIMITED, UploadPinSettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UploadPinSettingRequest uploadPinSettingRequest) {
            int i;
            if (uploadPinSettingRequest.pin_subscribe_setting != null) {
                i = PinSubscribeSetting.ADAPTER.encodedSizeWithTag(1, uploadPinSettingRequest.pin_subscribe_setting);
            } else {
                i = 0;
            }
            return i + uploadPinSettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UploadPinSettingRequest decode(ProtoReader protoReader) throws IOException {
            C19227a aVar = new C19227a();
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
                    aVar.f47397a = PinSubscribeSetting.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UploadPinSettingRequest uploadPinSettingRequest) throws IOException {
            if (uploadPinSettingRequest.pin_subscribe_setting != null) {
                PinSubscribeSetting.ADAPTER.encodeWithTag(protoWriter, 1, uploadPinSettingRequest.pin_subscribe_setting);
            }
            protoWriter.writeBytes(uploadPinSettingRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.UploadPinSettingRequest$a */
    public static final class C19227a extends Message.Builder<UploadPinSettingRequest, C19227a> {

        /* renamed from: a */
        public PinSubscribeSetting f47397a;

        /* renamed from: a */
        public UploadPinSettingRequest build() {
            return new UploadPinSettingRequest(this.f47397a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19227a newBuilder() {
        C19227a aVar = new C19227a();
        aVar.f47397a = this.pin_subscribe_setting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "UploadPinSettingRequest");
        StringBuilder sb = new StringBuilder();
        if (this.pin_subscribe_setting != null) {
            sb.append(", pin_subscribe_setting=");
            sb.append(this.pin_subscribe_setting);
        }
        StringBuilder replace = sb.replace(0, 2, "UploadPinSettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UploadPinSettingRequest(PinSubscribeSetting pinSubscribeSetting) {
        this(pinSubscribeSetting, ByteString.EMPTY);
    }

    public UploadPinSettingRequest(PinSubscribeSetting pinSubscribeSetting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.pin_subscribe_setting = pinSubscribeSetting;
    }
}
