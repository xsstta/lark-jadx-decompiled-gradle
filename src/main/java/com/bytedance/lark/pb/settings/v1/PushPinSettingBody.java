package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PushPinSettingBody extends Message<PushPinSettingBody, C19187a> {
    public static final ProtoAdapter<PushPinSettingBody> ADAPTER = new C19188b();
    private static final long serialVersionUID = 0;
    public final PinSubscribeSetting pin_subscribe_setting;

    /* renamed from: com.bytedance.lark.pb.settings.v1.PushPinSettingBody$b */
    private static final class C19188b extends ProtoAdapter<PushPinSettingBody> {
        C19188b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushPinSettingBody.class);
        }

        /* renamed from: a */
        public int encodedSize(PushPinSettingBody pushPinSettingBody) {
            int i;
            if (pushPinSettingBody.pin_subscribe_setting != null) {
                i = PinSubscribeSetting.ADAPTER.encodedSizeWithTag(1, pushPinSettingBody.pin_subscribe_setting);
            } else {
                i = 0;
            }
            return i + pushPinSettingBody.unknownFields().size();
        }

        /* renamed from: a */
        public PushPinSettingBody decode(ProtoReader protoReader) throws IOException {
            C19187a aVar = new C19187a();
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
                    aVar.f47345a = PinSubscribeSetting.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushPinSettingBody pushPinSettingBody) throws IOException {
            if (pushPinSettingBody.pin_subscribe_setting != null) {
                PinSubscribeSetting.ADAPTER.encodeWithTag(protoWriter, 1, pushPinSettingBody.pin_subscribe_setting);
            }
            protoWriter.writeBytes(pushPinSettingBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.PushPinSettingBody$a */
    public static final class C19187a extends Message.Builder<PushPinSettingBody, C19187a> {

        /* renamed from: a */
        public PinSubscribeSetting f47345a;

        /* renamed from: a */
        public PushPinSettingBody build() {
            return new PushPinSettingBody(this.f47345a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19187a newBuilder() {
        C19187a aVar = new C19187a();
        aVar.f47345a = this.pin_subscribe_setting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "PushPinSettingBody");
        StringBuilder sb = new StringBuilder();
        if (this.pin_subscribe_setting != null) {
            sb.append(", pin_subscribe_setting=");
            sb.append(this.pin_subscribe_setting);
        }
        StringBuilder replace = sb.replace(0, 2, "PushPinSettingBody{");
        replace.append('}');
        return replace.toString();
    }

    public PushPinSettingBody(PinSubscribeSetting pinSubscribeSetting) {
        this(pinSubscribeSetting, ByteString.EMPTY);
    }

    public PushPinSettingBody(PinSubscribeSetting pinSubscribeSetting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.pin_subscribe_setting = pinSubscribeSetting;
    }
}
