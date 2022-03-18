package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetPinSettingResponse extends Message<GetPinSettingResponse, C19153a> {
    public static final ProtoAdapter<GetPinSettingResponse> ADAPTER = new C19154b();
    private static final long serialVersionUID = 0;
    public final PinSubscribeSetting pin_subscribe_setting;

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetPinSettingResponse$b */
    private static final class C19154b extends ProtoAdapter<GetPinSettingResponse> {
        C19154b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetPinSettingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetPinSettingResponse getPinSettingResponse) {
            int i;
            if (getPinSettingResponse.pin_subscribe_setting != null) {
                i = PinSubscribeSetting.ADAPTER.encodedSizeWithTag(1, getPinSettingResponse.pin_subscribe_setting);
            } else {
                i = 0;
            }
            return i + getPinSettingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetPinSettingResponse decode(ProtoReader protoReader) throws IOException {
            C19153a aVar = new C19153a();
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
                    aVar.f47293a = PinSubscribeSetting.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetPinSettingResponse getPinSettingResponse) throws IOException {
            if (getPinSettingResponse.pin_subscribe_setting != null) {
                PinSubscribeSetting.ADAPTER.encodeWithTag(protoWriter, 1, getPinSettingResponse.pin_subscribe_setting);
            }
            protoWriter.writeBytes(getPinSettingResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetPinSettingResponse$a */
    public static final class C19153a extends Message.Builder<GetPinSettingResponse, C19153a> {

        /* renamed from: a */
        public PinSubscribeSetting f47293a;

        /* renamed from: a */
        public GetPinSettingResponse build() {
            return new GetPinSettingResponse(this.f47293a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19153a newBuilder() {
        C19153a aVar = new C19153a();
        aVar.f47293a = this.pin_subscribe_setting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "GetPinSettingResponse");
        StringBuilder sb = new StringBuilder();
        if (this.pin_subscribe_setting != null) {
            sb.append(", pin_subscribe_setting=");
            sb.append(this.pin_subscribe_setting);
        }
        StringBuilder replace = sb.replace(0, 2, "GetPinSettingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetPinSettingResponse(PinSubscribeSetting pinSubscribeSetting) {
        this(pinSubscribeSetting, ByteString.EMPTY);
    }

    public GetPinSettingResponse(PinSubscribeSetting pinSubscribeSetting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.pin_subscribe_setting = pinSubscribeSetting;
    }
}
