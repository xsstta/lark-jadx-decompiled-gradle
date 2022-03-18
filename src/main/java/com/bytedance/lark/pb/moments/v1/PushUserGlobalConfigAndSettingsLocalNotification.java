package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PushUserGlobalConfigAndSettingsLocalNotification extends Message<PushUserGlobalConfigAndSettingsLocalNotification, C18524a> {
    public static final ProtoAdapter<PushUserGlobalConfigAndSettingsLocalNotification> ADAPTER = new C18525b();
    private static final long serialVersionUID = 0;
    public final UserGlobalConfig global_config;
    public final String moments_admin_url;
    public final UserCircleConfig user_circle_config;
    public final UserSetting user_setting;

    /* renamed from: com.bytedance.lark.pb.moments.v1.PushUserGlobalConfigAndSettingsLocalNotification$b */
    private static final class C18525b extends ProtoAdapter<PushUserGlobalConfigAndSettingsLocalNotification> {
        C18525b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushUserGlobalConfigAndSettingsLocalNotification.class);
        }

        /* renamed from: a */
        public int encodedSize(PushUserGlobalConfigAndSettingsLocalNotification pushUserGlobalConfigAndSettingsLocalNotification) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (pushUserGlobalConfigAndSettingsLocalNotification.global_config != null) {
                i = UserGlobalConfig.ADAPTER.encodedSizeWithTag(1, pushUserGlobalConfigAndSettingsLocalNotification.global_config);
            } else {
                i = 0;
            }
            if (pushUserGlobalConfigAndSettingsLocalNotification.moments_admin_url != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, pushUserGlobalConfigAndSettingsLocalNotification.moments_admin_url);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (pushUserGlobalConfigAndSettingsLocalNotification.user_circle_config != null) {
                i3 = UserCircleConfig.ADAPTER.encodedSizeWithTag(3, pushUserGlobalConfigAndSettingsLocalNotification.user_circle_config);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (pushUserGlobalConfigAndSettingsLocalNotification.user_setting != null) {
                i4 = UserSetting.ADAPTER.encodedSizeWithTag(4, pushUserGlobalConfigAndSettingsLocalNotification.user_setting);
            }
            return i6 + i4 + pushUserGlobalConfigAndSettingsLocalNotification.unknownFields().size();
        }

        /* renamed from: a */
        public PushUserGlobalConfigAndSettingsLocalNotification decode(ProtoReader protoReader) throws IOException {
            C18524a aVar = new C18524a();
            aVar.f46005b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46004a = UserGlobalConfig.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46005b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f46006c = UserCircleConfig.ADAPTER.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46007d = UserSetting.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushUserGlobalConfigAndSettingsLocalNotification pushUserGlobalConfigAndSettingsLocalNotification) throws IOException {
            if (pushUserGlobalConfigAndSettingsLocalNotification.global_config != null) {
                UserGlobalConfig.ADAPTER.encodeWithTag(protoWriter, 1, pushUserGlobalConfigAndSettingsLocalNotification.global_config);
            }
            if (pushUserGlobalConfigAndSettingsLocalNotification.moments_admin_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pushUserGlobalConfigAndSettingsLocalNotification.moments_admin_url);
            }
            if (pushUserGlobalConfigAndSettingsLocalNotification.user_circle_config != null) {
                UserCircleConfig.ADAPTER.encodeWithTag(protoWriter, 3, pushUserGlobalConfigAndSettingsLocalNotification.user_circle_config);
            }
            if (pushUserGlobalConfigAndSettingsLocalNotification.user_setting != null) {
                UserSetting.ADAPTER.encodeWithTag(protoWriter, 4, pushUserGlobalConfigAndSettingsLocalNotification.user_setting);
            }
            protoWriter.writeBytes(pushUserGlobalConfigAndSettingsLocalNotification.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.PushUserGlobalConfigAndSettingsLocalNotification$a */
    public static final class C18524a extends Message.Builder<PushUserGlobalConfigAndSettingsLocalNotification, C18524a> {

        /* renamed from: a */
        public UserGlobalConfig f46004a;

        /* renamed from: b */
        public String f46005b;

        /* renamed from: c */
        public UserCircleConfig f46006c;

        /* renamed from: d */
        public UserSetting f46007d;

        /* renamed from: a */
        public PushUserGlobalConfigAndSettingsLocalNotification build() {
            return new PushUserGlobalConfigAndSettingsLocalNotification(this.f46004a, this.f46005b, this.f46006c, this.f46007d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18524a newBuilder() {
        C18524a aVar = new C18524a();
        aVar.f46004a = this.global_config;
        aVar.f46005b = this.moments_admin_url;
        aVar.f46006c = this.user_circle_config;
        aVar.f46007d = this.user_setting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "PushUserGlobalConfigAndSettingsLocalNotification");
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
        StringBuilder replace = sb.replace(0, 2, "PushUserGlobalConfigAndSettingsLocalNotification{");
        replace.append('}');
        return replace.toString();
    }

    public PushUserGlobalConfigAndSettingsLocalNotification(UserGlobalConfig userGlobalConfig, String str, UserCircleConfig userCircleConfig, UserSetting userSetting) {
        this(userGlobalConfig, str, userCircleConfig, userSetting, ByteString.EMPTY);
    }

    public PushUserGlobalConfigAndSettingsLocalNotification(UserGlobalConfig userGlobalConfig, String str, UserCircleConfig userCircleConfig, UserSetting userSetting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.global_config = userGlobalConfig;
        this.moments_admin_url = str;
        this.user_circle_config = userCircleConfig;
        this.user_setting = userSetting;
    }
}
