package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetUserGlobalConfigAndSettingsResponse extends Message<GetUserGlobalConfigAndSettingsResponse, C18398a> {
    public static final ProtoAdapter<GetUserGlobalConfigAndSettingsResponse> ADAPTER = new C18399b();
    private static final long serialVersionUID = 0;
    public final UserGlobalConfig global_config;
    public final String moments_admin_url;
    public final UserCircleConfig user_circle_config;
    public final UserSetting user_setting;

    /* renamed from: com.bytedance.lark.pb.moments.v1.GetUserGlobalConfigAndSettingsResponse$b */
    private static final class C18399b extends ProtoAdapter<GetUserGlobalConfigAndSettingsResponse> {
        C18399b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserGlobalConfigAndSettingsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserGlobalConfigAndSettingsResponse getUserGlobalConfigAndSettingsResponse) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (getUserGlobalConfigAndSettingsResponse.global_config != null) {
                i = UserGlobalConfig.ADAPTER.encodedSizeWithTag(1, getUserGlobalConfigAndSettingsResponse.global_config);
            } else {
                i = 0;
            }
            if (getUserGlobalConfigAndSettingsResponse.moments_admin_url != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getUserGlobalConfigAndSettingsResponse.moments_admin_url);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (getUserGlobalConfigAndSettingsResponse.user_circle_config != null) {
                i3 = UserCircleConfig.ADAPTER.encodedSizeWithTag(3, getUserGlobalConfigAndSettingsResponse.user_circle_config);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (getUserGlobalConfigAndSettingsResponse.user_setting != null) {
                i4 = UserSetting.ADAPTER.encodedSizeWithTag(4, getUserGlobalConfigAndSettingsResponse.user_setting);
            }
            return i6 + i4 + getUserGlobalConfigAndSettingsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserGlobalConfigAndSettingsResponse decode(ProtoReader protoReader) throws IOException {
            C18398a aVar = new C18398a();
            aVar.f45778b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45777a = UserGlobalConfig.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45778b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f45779c = UserCircleConfig.ADAPTER.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45780d = UserSetting.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUserGlobalConfigAndSettingsResponse getUserGlobalConfigAndSettingsResponse) throws IOException {
            if (getUserGlobalConfigAndSettingsResponse.global_config != null) {
                UserGlobalConfig.ADAPTER.encodeWithTag(protoWriter, 1, getUserGlobalConfigAndSettingsResponse.global_config);
            }
            if (getUserGlobalConfigAndSettingsResponse.moments_admin_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getUserGlobalConfigAndSettingsResponse.moments_admin_url);
            }
            if (getUserGlobalConfigAndSettingsResponse.user_circle_config != null) {
                UserCircleConfig.ADAPTER.encodeWithTag(protoWriter, 3, getUserGlobalConfigAndSettingsResponse.user_circle_config);
            }
            if (getUserGlobalConfigAndSettingsResponse.user_setting != null) {
                UserSetting.ADAPTER.encodeWithTag(protoWriter, 4, getUserGlobalConfigAndSettingsResponse.user_setting);
            }
            protoWriter.writeBytes(getUserGlobalConfigAndSettingsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.GetUserGlobalConfigAndSettingsResponse$a */
    public static final class C18398a extends Message.Builder<GetUserGlobalConfigAndSettingsResponse, C18398a> {

        /* renamed from: a */
        public UserGlobalConfig f45777a;

        /* renamed from: b */
        public String f45778b;

        /* renamed from: c */
        public UserCircleConfig f45779c;

        /* renamed from: d */
        public UserSetting f45780d;

        /* renamed from: a */
        public GetUserGlobalConfigAndSettingsResponse build() {
            return new GetUserGlobalConfigAndSettingsResponse(this.f45777a, this.f45778b, this.f45779c, this.f45780d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18398a newBuilder() {
        C18398a aVar = new C18398a();
        aVar.f45777a = this.global_config;
        aVar.f45778b = this.moments_admin_url;
        aVar.f45779c = this.user_circle_config;
        aVar.f45780d = this.user_setting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "GetUserGlobalConfigAndSettingsResponse");
        StringBuilder sb = new StringBuilder();
        if (this.global_config != null) {
            sb.append(", global_config=");
            sb.append(this.global_config);
        }
        if (this.moments_admin_url != null) {
            sb.append(", moments_admin_url=");
            sb.append(this.moments_admin_url);
        }
        if (this.user_circle_config != null) {
            sb.append(", user_circle_config=");
            sb.append(this.user_circle_config);
        }
        if (this.user_setting != null) {
            sb.append(", user_setting=");
            sb.append(this.user_setting);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUserGlobalConfigAndSettingsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserGlobalConfigAndSettingsResponse(UserGlobalConfig userGlobalConfig, String str, UserCircleConfig userCircleConfig, UserSetting userSetting) {
        this(userGlobalConfig, str, userCircleConfig, userSetting, ByteString.EMPTY);
    }

    public GetUserGlobalConfigAndSettingsResponse(UserGlobalConfig userGlobalConfig, String str, UserCircleConfig userCircleConfig, UserSetting userSetting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.global_config = userGlobalConfig;
        this.moments_admin_url = str;
        this.user_circle_config = userCircleConfig;
        this.user_setting = userSetting;
    }
}
