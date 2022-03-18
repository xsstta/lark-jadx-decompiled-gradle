package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PatchUserSettingResponse extends Message<PatchUserSettingResponse, C18488a> {
    public static final ProtoAdapter<PatchUserSettingResponse> ADAPTER = new C18489b();
    private static final long serialVersionUID = 0;
    public final UserSetting patched_user_setting;

    /* renamed from: com.bytedance.lark.pb.moments.v1.PatchUserSettingResponse$b */
    private static final class C18489b extends ProtoAdapter<PatchUserSettingResponse> {
        C18489b() {
            super(FieldEncoding.LENGTH_DELIMITED, PatchUserSettingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PatchUserSettingResponse patchUserSettingResponse) {
            int i;
            if (patchUserSettingResponse.patched_user_setting != null) {
                i = UserSetting.ADAPTER.encodedSizeWithTag(1, patchUserSettingResponse.patched_user_setting);
            } else {
                i = 0;
            }
            return i + patchUserSettingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PatchUserSettingResponse decode(ProtoReader protoReader) throws IOException {
            C18488a aVar = new C18488a();
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
                    aVar.f45918a = UserSetting.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PatchUserSettingResponse patchUserSettingResponse) throws IOException {
            if (patchUserSettingResponse.patched_user_setting != null) {
                UserSetting.ADAPTER.encodeWithTag(protoWriter, 1, patchUserSettingResponse.patched_user_setting);
            }
            protoWriter.writeBytes(patchUserSettingResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.PatchUserSettingResponse$a */
    public static final class C18488a extends Message.Builder<PatchUserSettingResponse, C18488a> {

        /* renamed from: a */
        public UserSetting f45918a;

        /* renamed from: a */
        public PatchUserSettingResponse build() {
            return new PatchUserSettingResponse(this.f45918a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18488a newBuilder() {
        C18488a aVar = new C18488a();
        aVar.f45918a = this.patched_user_setting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "PatchUserSettingResponse");
        StringBuilder sb = new StringBuilder();
        if (this.patched_user_setting != null) {
            sb.append(", patched_user_setting=");
            sb.append(this.patched_user_setting);
        }
        StringBuilder replace = sb.replace(0, 2, "PatchUserSettingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PatchUserSettingResponse(UserSetting userSetting) {
        this(userSetting, ByteString.EMPTY);
    }

    public PatchUserSettingResponse(UserSetting userSetting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.patched_user_setting = userSetting;
    }
}
