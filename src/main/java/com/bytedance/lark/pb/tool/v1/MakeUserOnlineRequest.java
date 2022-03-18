package com.bytedance.lark.pb.tool.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class MakeUserOnlineRequest extends Message<MakeUserOnlineRequest, C19723a> {
    public static final ProtoAdapter<MakeUserOnlineRequest> ADAPTER = new C19724b();
    public static final Boolean DEFAULT_ENABLE_BACKGROUND_MODE = false;
    public static final Long DEFAULT_USER_ID = 0L;
    private static final long serialVersionUID = 0;
    public final String access_token;
    public final String client_avatar_path;
    public final Boolean enable_background_mode;
    public final GuestUserExtraInfo guest_user_extra_info;
    public final String locale_identifier;
    public final NamedUserExtraInfo named_user_extra_info;
    public final Long user_id;

    public static final class NamedUserExtraInfo extends Message<NamedUserExtraInfo, C19721a> {
        public static final ProtoAdapter<NamedUserExtraInfo> ADAPTER = new C19722b();
        public static final TenantTag DEFAULT_TENANT_TAG = TenantTag.UNDEFINED;
        private static final long serialVersionUID = 0;
        public final Map<String, String> client_fg_data;
        public final TenantTag tenant_tag;

        public enum TenantTag implements WireEnum {
            UNDEFINED(0),
            STANDARD(1),
            SIMPLE(2);
            
            public static final ProtoAdapter<TenantTag> ADAPTER = ProtoAdapter.newEnumAdapter(TenantTag.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static TenantTag fromValue(int i) {
                if (i == 0) {
                    return UNDEFINED;
                }
                if (i == 1) {
                    return STANDARD;
                }
                if (i != 2) {
                    return null;
                }
                return SIMPLE;
            }

            private TenantTag(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.tool.v1.MakeUserOnlineRequest$NamedUserExtraInfo$a */
        public static final class C19721a extends Message.Builder<NamedUserExtraInfo, C19721a> {

            /* renamed from: a */
            public TenantTag f48173a;

            /* renamed from: b */
            public Map<String, String> f48174b = Internal.newMutableMap();

            /* renamed from: a */
            public NamedUserExtraInfo build() {
                return new NamedUserExtraInfo(this.f48173a, this.f48174b, super.buildUnknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.tool.v1.MakeUserOnlineRequest$NamedUserExtraInfo$b */
        private static final class C19722b extends ProtoAdapter<NamedUserExtraInfo> {

            /* renamed from: a */
            private final ProtoAdapter<Map<String, String>> f48175a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

            C19722b() {
                super(FieldEncoding.LENGTH_DELIMITED, NamedUserExtraInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(NamedUserExtraInfo namedUserExtraInfo) {
                int i;
                if (namedUserExtraInfo.tenant_tag != null) {
                    i = TenantTag.ADAPTER.encodedSizeWithTag(1, namedUserExtraInfo.tenant_tag);
                } else {
                    i = 0;
                }
                return i + this.f48175a.encodedSizeWithTag(2, namedUserExtraInfo.client_fg_data) + namedUserExtraInfo.unknownFields().size();
            }

            /* renamed from: a */
            public NamedUserExtraInfo decode(ProtoReader protoReader) throws IOException {
                C19721a aVar = new C19721a();
                aVar.f48173a = TenantTag.UNDEFINED;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f48173a = TenantTag.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f48174b.putAll(this.f48175a.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, NamedUserExtraInfo namedUserExtraInfo) throws IOException {
                if (namedUserExtraInfo.tenant_tag != null) {
                    TenantTag.ADAPTER.encodeWithTag(protoWriter, 1, namedUserExtraInfo.tenant_tag);
                }
                this.f48175a.encodeWithTag(protoWriter, 2, namedUserExtraInfo.client_fg_data);
                protoWriter.writeBytes(namedUserExtraInfo.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19721a newBuilder() {
            C19721a aVar = new C19721a();
            aVar.f48173a = this.tenant_tag;
            aVar.f48174b = Internal.copyOf("client_fg_data", this.client_fg_data);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("tool", "NamedUserExtraInfo");
            StringBuilder sb = new StringBuilder();
            if (this.tenant_tag != null) {
                sb.append(", tenant_tag=");
                sb.append(this.tenant_tag);
            }
            if (!this.client_fg_data.isEmpty()) {
                sb.append(", client_fg_data=");
                sb.append(this.client_fg_data);
            }
            StringBuilder replace = sb.replace(0, 2, "NamedUserExtraInfo{");
            replace.append('}');
            return replace.toString();
        }

        public NamedUserExtraInfo(TenantTag tenantTag, Map<String, String> map) {
            this(tenantTag, map, ByteString.EMPTY);
        }

        public NamedUserExtraInfo(TenantTag tenantTag, Map<String, String> map, ByteString byteString) {
            super(ADAPTER, byteString);
            this.tenant_tag = tenantTag;
            this.client_fg_data = Internal.immutableCopyOf("client_fg_data", map);
        }
    }

    public static final class GuestUserExtraInfo extends Message<GuestUserExtraInfo, C19719a> {
        public static final ProtoAdapter<GuestUserExtraInfo> ADAPTER = new C19720b();
        private static final long serialVersionUID = 0;

        /* renamed from: com.bytedance.lark.pb.tool.v1.MakeUserOnlineRequest$GuestUserExtraInfo$b */
        private static final class C19720b extends ProtoAdapter<GuestUserExtraInfo> {
            C19720b() {
                super(FieldEncoding.LENGTH_DELIMITED, GuestUserExtraInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(GuestUserExtraInfo guestUserExtraInfo) {
                return guestUserExtraInfo.unknownFields().size();
            }

            /* renamed from: a */
            public GuestUserExtraInfo decode(ProtoReader protoReader) throws IOException {
                C19719a aVar = new C19719a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, GuestUserExtraInfo guestUserExtraInfo) throws IOException {
                protoWriter.writeBytes(guestUserExtraInfo.unknownFields());
            }
        }

        public GuestUserExtraInfo() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.tool.v1.MakeUserOnlineRequest$GuestUserExtraInfo$a */
        public static final class C19719a extends Message.Builder<GuestUserExtraInfo, C19719a> {
            /* renamed from: a */
            public GuestUserExtraInfo build() {
                return new GuestUserExtraInfo(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19719a newBuilder() {
            C19719a aVar = new C19719a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("tool", "GuestUserExtraInfo");
            StringBuilder replace = new StringBuilder().replace(0, 2, "GuestUserExtraInfo{");
            replace.append('}');
            return replace.toString();
        }

        public GuestUserExtraInfo(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.MakeUserOnlineRequest$b */
    private static final class C19724b extends ProtoAdapter<MakeUserOnlineRequest> {
        C19724b() {
            super(FieldEncoding.LENGTH_DELIMITED, MakeUserOnlineRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MakeUserOnlineRequest makeUserOnlineRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, makeUserOnlineRequest.access_token);
            int i6 = 0;
            if (makeUserOnlineRequest.user_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(2, makeUserOnlineRequest.user_id);
            } else {
                i = 0;
            }
            int i7 = encodedSizeWithTag + i;
            if (makeUserOnlineRequest.locale_identifier != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, makeUserOnlineRequest.locale_identifier);
            } else {
                i2 = 0;
            }
            int i8 = i7 + i2;
            if (makeUserOnlineRequest.enable_background_mode != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, makeUserOnlineRequest.enable_background_mode);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (makeUserOnlineRequest.client_avatar_path != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, makeUserOnlineRequest.client_avatar_path);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (makeUserOnlineRequest.named_user_extra_info != null) {
                i5 = NamedUserExtraInfo.ADAPTER.encodedSizeWithTag(17, makeUserOnlineRequest.named_user_extra_info);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (makeUserOnlineRequest.guest_user_extra_info != null) {
                i6 = GuestUserExtraInfo.ADAPTER.encodedSizeWithTag(18, makeUserOnlineRequest.guest_user_extra_info);
            }
            return i11 + i6 + makeUserOnlineRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MakeUserOnlineRequest decode(ProtoReader protoReader) throws IOException {
            C19723a aVar = new C19723a();
            aVar.f48176a = "";
            aVar.f48177b = 0L;
            aVar.f48178c = "";
            aVar.f48179d = false;
            aVar.f48180e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48176a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f48177b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f48178c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f48179d = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 5) {
                    aVar.f48180e = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 17) {
                    aVar.mo66838a(NamedUserExtraInfo.ADAPTER.decode(protoReader));
                } else if (nextTag != 18) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.mo66837a(GuestUserExtraInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MakeUserOnlineRequest makeUserOnlineRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, makeUserOnlineRequest.access_token);
            if (makeUserOnlineRequest.user_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, makeUserOnlineRequest.user_id);
            }
            if (makeUserOnlineRequest.locale_identifier != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, makeUserOnlineRequest.locale_identifier);
            }
            if (makeUserOnlineRequest.enable_background_mode != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, makeUserOnlineRequest.enable_background_mode);
            }
            if (makeUserOnlineRequest.client_avatar_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, makeUserOnlineRequest.client_avatar_path);
            }
            if (makeUserOnlineRequest.named_user_extra_info != null) {
                NamedUserExtraInfo.ADAPTER.encodeWithTag(protoWriter, 17, makeUserOnlineRequest.named_user_extra_info);
            }
            if (makeUserOnlineRequest.guest_user_extra_info != null) {
                GuestUserExtraInfo.ADAPTER.encodeWithTag(protoWriter, 18, makeUserOnlineRequest.guest_user_extra_info);
            }
            protoWriter.writeBytes(makeUserOnlineRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.MakeUserOnlineRequest$a */
    public static final class C19723a extends Message.Builder<MakeUserOnlineRequest, C19723a> {

        /* renamed from: a */
        public String f48176a;

        /* renamed from: b */
        public Long f48177b;

        /* renamed from: c */
        public String f48178c;

        /* renamed from: d */
        public Boolean f48179d;

        /* renamed from: e */
        public String f48180e;

        /* renamed from: f */
        public NamedUserExtraInfo f48181f;

        /* renamed from: g */
        public GuestUserExtraInfo f48182g;

        /* renamed from: a */
        public MakeUserOnlineRequest build() {
            String str = this.f48176a;
            if (str != null) {
                return new MakeUserOnlineRequest(str, this.f48177b, this.f48178c, this.f48179d, this.f48180e, this.f48181f, this.f48182g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "access_token");
        }

        /* renamed from: a */
        public C19723a mo66839a(Long l) {
            this.f48177b = l;
            return this;
        }

        /* renamed from: b */
        public C19723a mo66842b(String str) {
            this.f48178c = str;
            return this;
        }

        /* renamed from: c */
        public C19723a mo66843c(String str) {
            this.f48180e = str;
            return this;
        }

        /* renamed from: a */
        public C19723a mo66837a(GuestUserExtraInfo guestUserExtraInfo) {
            this.f48182g = guestUserExtraInfo;
            this.f48181f = null;
            return this;
        }

        /* renamed from: a */
        public C19723a mo66838a(NamedUserExtraInfo namedUserExtraInfo) {
            this.f48181f = namedUserExtraInfo;
            this.f48182g = null;
            return this;
        }

        /* renamed from: a */
        public C19723a mo66840a(String str) {
            this.f48176a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19723a newBuilder() {
        C19723a aVar = new C19723a();
        aVar.f48176a = this.access_token;
        aVar.f48177b = this.user_id;
        aVar.f48178c = this.locale_identifier;
        aVar.f48179d = this.enable_background_mode;
        aVar.f48180e = this.client_avatar_path;
        aVar.f48181f = this.named_user_extra_info;
        aVar.f48182g = this.guest_user_extra_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("tool", "MakeUserOnlineRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", access_token=");
        sb.append(this.access_token);
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.locale_identifier != null) {
            sb.append(", locale_identifier=");
            sb.append(this.locale_identifier);
        }
        if (this.enable_background_mode != null) {
            sb.append(", enable_background_mode=");
            sb.append(this.enable_background_mode);
        }
        if (this.client_avatar_path != null) {
            sb.append(", client_avatar_path=");
            sb.append(this.client_avatar_path);
        }
        if (this.named_user_extra_info != null) {
            sb.append(", named_user_extra_info=");
            sb.append(this.named_user_extra_info);
        }
        if (this.guest_user_extra_info != null) {
            sb.append(", guest_user_extra_info=");
            sb.append(this.guest_user_extra_info);
        }
        StringBuilder replace = sb.replace(0, 2, "MakeUserOnlineRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MakeUserOnlineRequest(String str, Long l, String str2, Boolean bool, String str3, NamedUserExtraInfo namedUserExtraInfo, GuestUserExtraInfo guestUserExtraInfo) {
        this(str, l, str2, bool, str3, namedUserExtraInfo, guestUserExtraInfo, ByteString.EMPTY);
    }

    public MakeUserOnlineRequest(String str, Long l, String str2, Boolean bool, String str3, NamedUserExtraInfo namedUserExtraInfo, GuestUserExtraInfo guestUserExtraInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(namedUserExtraInfo, guestUserExtraInfo) <= 1) {
            this.access_token = str;
            this.user_id = l;
            this.locale_identifier = str2;
            this.enable_background_mode = bool;
            this.client_avatar_path = str3;
            this.named_user_extra_info = namedUserExtraInfo;
            this.guest_user_extra_info = guestUserExtraInfo;
            return;
        }
        throw new IllegalArgumentException("at most one of named_user_extra_info, guest_user_extra_info may be non-null");
    }
}
