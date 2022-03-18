package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UserGlobalConfig extends Message<UserGlobalConfig, C18562a> {
    public static final ProtoAdapter<UserGlobalConfig> ADAPTER = new C18563b();
    public static final Boolean DEFAULT_IS_TENANT_ADMIN = false;
    public static final Long DEFAULT_UPDATE_TIME_MSEC = 0L;
    private static final long serialVersionUID = 0;
    public final String default_circle_id;
    public final Permission global_permission;
    public final Boolean is_tenant_admin;
    public final Long update_time_msec;

    /* renamed from: com.bytedance.lark.pb.moments.v1.UserGlobalConfig$b */
    private static final class C18563b extends ProtoAdapter<UserGlobalConfig> {
        C18563b() {
            super(FieldEncoding.LENGTH_DELIMITED, UserGlobalConfig.class);
        }

        /* renamed from: a */
        public int encodedSize(UserGlobalConfig userGlobalConfig) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (userGlobalConfig.update_time_msec != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, userGlobalConfig.update_time_msec);
            } else {
                i = 0;
            }
            if (userGlobalConfig.default_circle_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, userGlobalConfig.default_circle_id);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (userGlobalConfig.is_tenant_admin != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, userGlobalConfig.is_tenant_admin);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (userGlobalConfig.global_permission != null) {
                i4 = Permission.ADAPTER.encodedSizeWithTag(4, userGlobalConfig.global_permission);
            }
            return i6 + i4 + userGlobalConfig.unknownFields().size();
        }

        /* renamed from: a */
        public UserGlobalConfig decode(ProtoReader protoReader) throws IOException {
            C18562a aVar = new C18562a();
            aVar.f46055a = 0L;
            aVar.f46056b = "";
            aVar.f46057c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46055a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46056b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f46057c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46058d = Permission.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UserGlobalConfig userGlobalConfig) throws IOException {
            if (userGlobalConfig.update_time_msec != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, userGlobalConfig.update_time_msec);
            }
            if (userGlobalConfig.default_circle_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, userGlobalConfig.default_circle_id);
            }
            if (userGlobalConfig.is_tenant_admin != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, userGlobalConfig.is_tenant_admin);
            }
            if (userGlobalConfig.global_permission != null) {
                Permission.ADAPTER.encodeWithTag(protoWriter, 4, userGlobalConfig.global_permission);
            }
            protoWriter.writeBytes(userGlobalConfig.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.UserGlobalConfig$a */
    public static final class C18562a extends Message.Builder<UserGlobalConfig, C18562a> {

        /* renamed from: a */
        public Long f46055a;

        /* renamed from: b */
        public String f46056b;

        /* renamed from: c */
        public Boolean f46057c;

        /* renamed from: d */
        public Permission f46058d;

        /* renamed from: a */
        public UserGlobalConfig build() {
            return new UserGlobalConfig(this.f46055a, this.f46056b, this.f46057c, this.f46058d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18562a newBuilder() {
        C18562a aVar = new C18562a();
        aVar.f46055a = this.update_time_msec;
        aVar.f46056b = this.default_circle_id;
        aVar.f46057c = this.is_tenant_admin;
        aVar.f46058d = this.global_permission;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "UserGlobalConfig");
        StringBuilder sb = new StringBuilder();
        if (this.update_time_msec != null) {
            sb.append(", update_time_msec=");
            sb.append(this.update_time_msec);
        }
        if (this.default_circle_id != null) {
            sb.append(", default_circle_id=");
            sb.append(this.default_circle_id);
        }
        if (this.is_tenant_admin != null) {
            sb.append(", is_tenant_admin=");
            sb.append(this.is_tenant_admin);
        }
        if (this.global_permission != null) {
            sb.append(", global_permission=");
            sb.append(this.global_permission);
        }
        StringBuilder replace = sb.replace(0, 2, "UserGlobalConfig{");
        replace.append('}');
        return replace.toString();
    }

    public UserGlobalConfig(Long l, String str, Boolean bool, Permission permission) {
        this(l, str, bool, permission, ByteString.EMPTY);
    }

    public UserGlobalConfig(Long l, String str, Boolean bool, Permission permission, ByteString byteString) {
        super(ADAPTER, byteString);
        this.update_time_msec = l;
        this.default_circle_id = str;
        this.is_tenant_admin = bool;
        this.global_permission = permission;
    }
}
