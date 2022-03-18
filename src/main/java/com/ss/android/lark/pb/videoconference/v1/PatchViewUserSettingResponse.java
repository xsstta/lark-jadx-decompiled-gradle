package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PatchViewUserSettingResponse extends Message<PatchViewUserSettingResponse, C50914a> {
    public static final ProtoAdapter<PatchViewUserSettingResponse> ADAPTER = new C50915b();
    private static final long serialVersionUID = 0;
    public final ViewDeviceSetting device_setting;
    public final ViewUserSetting user_setting;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PatchViewUserSettingResponse$b */
    private static final class C50915b extends ProtoAdapter<PatchViewUserSettingResponse> {
        C50915b() {
            super(FieldEncoding.LENGTH_DELIMITED, PatchViewUserSettingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PatchViewUserSettingResponse patchViewUserSettingResponse) {
            int i;
            int i2 = 0;
            if (patchViewUserSettingResponse.user_setting != null) {
                i = ViewUserSetting.ADAPTER.encodedSizeWithTag(1, patchViewUserSettingResponse.user_setting);
            } else {
                i = 0;
            }
            if (patchViewUserSettingResponse.device_setting != null) {
                i2 = ViewDeviceSetting.ADAPTER.encodedSizeWithTag(2, patchViewUserSettingResponse.device_setting);
            }
            return i + i2 + patchViewUserSettingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PatchViewUserSettingResponse decode(ProtoReader protoReader) throws IOException {
            C50914a aVar = new C50914a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126906a = ViewUserSetting.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126907b = ViewDeviceSetting.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PatchViewUserSettingResponse patchViewUserSettingResponse) throws IOException {
            if (patchViewUserSettingResponse.user_setting != null) {
                ViewUserSetting.ADAPTER.encodeWithTag(protoWriter, 1, patchViewUserSettingResponse.user_setting);
            }
            if (patchViewUserSettingResponse.device_setting != null) {
                ViewDeviceSetting.ADAPTER.encodeWithTag(protoWriter, 2, patchViewUserSettingResponse.device_setting);
            }
            protoWriter.writeBytes(patchViewUserSettingResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PatchViewUserSettingResponse$a */
    public static final class C50914a extends Message.Builder<PatchViewUserSettingResponse, C50914a> {

        /* renamed from: a */
        public ViewUserSetting f126906a;

        /* renamed from: b */
        public ViewDeviceSetting f126907b;

        /* renamed from: a */
        public PatchViewUserSettingResponse build() {
            return new PatchViewUserSettingResponse(this.f126906a, this.f126907b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50914a newBuilder() {
        C50914a aVar = new C50914a();
        aVar.f126906a = this.user_setting;
        aVar.f126907b = this.device_setting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "PatchViewUserSettingResponse");
        StringBuilder sb = new StringBuilder();
        if (this.user_setting != null) {
            sb.append(", user_setting=");
            sb.append(this.user_setting);
        }
        if (this.device_setting != null) {
            sb.append(", device_setting=");
            sb.append(this.device_setting);
        }
        StringBuilder replace = sb.replace(0, 2, "PatchViewUserSettingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PatchViewUserSettingResponse(ViewUserSetting viewUserSetting, ViewDeviceSetting viewDeviceSetting) {
        this(viewUserSetting, viewDeviceSetting, ByteString.EMPTY);
    }

    public PatchViewUserSettingResponse(ViewUserSetting viewUserSetting, ViewDeviceSetting viewDeviceSetting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_setting = viewUserSetting;
        this.device_setting = viewDeviceSetting;
    }
}
