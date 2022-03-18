package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PullViewUserSettingResponse extends Message<PullViewUserSettingResponse, C50944a> {
    public static final ProtoAdapter<PullViewUserSettingResponse> ADAPTER = new C50945b();
    private static final long serialVersionUID = 0;
    public final ViewDeviceSetting device_setting;
    public final ViewUserSetting user_setting;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PullViewUserSettingResponse$b */
    private static final class C50945b extends ProtoAdapter<PullViewUserSettingResponse> {
        C50945b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullViewUserSettingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullViewUserSettingResponse pullViewUserSettingResponse) {
            int i;
            int i2 = 0;
            if (pullViewUserSettingResponse.user_setting != null) {
                i = ViewUserSetting.ADAPTER.encodedSizeWithTag(1, pullViewUserSettingResponse.user_setting);
            } else {
                i = 0;
            }
            if (pullViewUserSettingResponse.device_setting != null) {
                i2 = ViewDeviceSetting.ADAPTER.encodedSizeWithTag(2, pullViewUserSettingResponse.device_setting);
            }
            return i + i2 + pullViewUserSettingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullViewUserSettingResponse decode(ProtoReader protoReader) throws IOException {
            C50944a aVar = new C50944a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126965a = ViewUserSetting.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126966b = ViewDeviceSetting.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullViewUserSettingResponse pullViewUserSettingResponse) throws IOException {
            if (pullViewUserSettingResponse.user_setting != null) {
                ViewUserSetting.ADAPTER.encodeWithTag(protoWriter, 1, pullViewUserSettingResponse.user_setting);
            }
            if (pullViewUserSettingResponse.device_setting != null) {
                ViewDeviceSetting.ADAPTER.encodeWithTag(protoWriter, 2, pullViewUserSettingResponse.device_setting);
            }
            protoWriter.writeBytes(pullViewUserSettingResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PullViewUserSettingResponse$a */
    public static final class C50944a extends Message.Builder<PullViewUserSettingResponse, C50944a> {

        /* renamed from: a */
        public ViewUserSetting f126965a;

        /* renamed from: b */
        public ViewDeviceSetting f126966b;

        /* renamed from: a */
        public PullViewUserSettingResponse build() {
            return new PullViewUserSettingResponse(this.f126965a, this.f126966b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50944a newBuilder() {
        C50944a aVar = new C50944a();
        aVar.f126965a = this.user_setting;
        aVar.f126966b = this.device_setting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "PullViewUserSettingResponse");
        StringBuilder sb = new StringBuilder();
        if (this.user_setting != null) {
            sb.append(", user_setting=");
            sb.append(this.user_setting);
        }
        if (this.device_setting != null) {
            sb.append(", device_setting=");
            sb.append(this.device_setting);
        }
        StringBuilder replace = sb.replace(0, 2, "PullViewUserSettingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullViewUserSettingResponse(ViewUserSetting viewUserSetting, ViewDeviceSetting viewDeviceSetting) {
        this(viewUserSetting, viewDeviceSetting, ByteString.EMPTY);
    }

    public PullViewUserSettingResponse(ViewUserSetting viewUserSetting, ViewDeviceSetting viewDeviceSetting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_setting = viewUserSetting;
        this.device_setting = viewDeviceSetting;
    }
}
