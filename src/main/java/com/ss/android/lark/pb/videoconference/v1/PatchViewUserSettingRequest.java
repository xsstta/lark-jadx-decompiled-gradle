package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PatchViewUserSettingRequest extends Message<PatchViewUserSettingRequest, C50912a> {
    public static final ProtoAdapter<PatchViewUserSettingRequest> ADAPTER = new C50913b();
    private static final long serialVersionUID = 0;
    public final ViewDeviceSetting device_setting;
    public final ViewUserSetting user_setting;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PatchViewUserSettingRequest$b */
    private static final class C50913b extends ProtoAdapter<PatchViewUserSettingRequest> {
        C50913b() {
            super(FieldEncoding.LENGTH_DELIMITED, PatchViewUserSettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PatchViewUserSettingRequest patchViewUserSettingRequest) {
            int i;
            int i2 = 0;
            if (patchViewUserSettingRequest.user_setting != null) {
                i = ViewUserSetting.ADAPTER.encodedSizeWithTag(1, patchViewUserSettingRequest.user_setting);
            } else {
                i = 0;
            }
            if (patchViewUserSettingRequest.device_setting != null) {
                i2 = ViewDeviceSetting.ADAPTER.encodedSizeWithTag(2, patchViewUserSettingRequest.device_setting);
            }
            return i + i2 + patchViewUserSettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PatchViewUserSettingRequest decode(ProtoReader protoReader) throws IOException {
            C50912a aVar = new C50912a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126904a = ViewUserSetting.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126905b = ViewDeviceSetting.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PatchViewUserSettingRequest patchViewUserSettingRequest) throws IOException {
            if (patchViewUserSettingRequest.user_setting != null) {
                ViewUserSetting.ADAPTER.encodeWithTag(protoWriter, 1, patchViewUserSettingRequest.user_setting);
            }
            if (patchViewUserSettingRequest.device_setting != null) {
                ViewDeviceSetting.ADAPTER.encodeWithTag(protoWriter, 2, patchViewUserSettingRequest.device_setting);
            }
            protoWriter.writeBytes(patchViewUserSettingRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PatchViewUserSettingRequest$a */
    public static final class C50912a extends Message.Builder<PatchViewUserSettingRequest, C50912a> {

        /* renamed from: a */
        public ViewUserSetting f126904a;

        /* renamed from: b */
        public ViewDeviceSetting f126905b;

        /* renamed from: a */
        public PatchViewUserSettingRequest build() {
            return new PatchViewUserSettingRequest(this.f126904a, this.f126905b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50912a mo175887a(ViewDeviceSetting viewDeviceSetting) {
            this.f126905b = viewDeviceSetting;
            return this;
        }

        /* renamed from: a */
        public C50912a mo175888a(ViewUserSetting viewUserSetting) {
            this.f126904a = viewUserSetting;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50912a newBuilder() {
        C50912a aVar = new C50912a();
        aVar.f126904a = this.user_setting;
        aVar.f126905b = this.device_setting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "PatchViewUserSettingRequest");
        StringBuilder sb = new StringBuilder();
        if (this.user_setting != null) {
            sb.append(", user_setting=");
            sb.append(this.user_setting);
        }
        if (this.device_setting != null) {
            sb.append(", device_setting=");
            sb.append(this.device_setting);
        }
        StringBuilder replace = sb.replace(0, 2, "PatchViewUserSettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PatchViewUserSettingRequest(ViewUserSetting viewUserSetting, ViewDeviceSetting viewDeviceSetting) {
        this(viewUserSetting, viewDeviceSetting, ByteString.EMPTY);
    }

    public PatchViewUserSettingRequest(ViewUserSetting viewUserSetting, ViewDeviceSetting viewDeviceSetting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_setting = viewUserSetting;
        this.device_setting = viewDeviceSetting;
    }
}
