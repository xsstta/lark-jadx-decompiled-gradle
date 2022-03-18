package com.bytedance.lark.pb.space.drive.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class InitDriveRequest extends Message<InitDriveRequest, C19365a> {
    public static final ProtoAdapter<InitDriveRequest> ADAPTER = new C19366b();
    public static final Boolean DEFAULT_DISABLE_CDN_DOWNLOAD = false;
    public static final Boolean DEFAULT_DISABLE_SMART_UPLOAD = false;
    public static final EnvType DEFAULT_ENV = EnvType.ONLINE;
    public static final Boolean DEFAULT_FOR_APP = false;
    private static final long serialVersionUID = 0;
    public final String device_id;
    public final Boolean disable_cdn_download;
    public final Boolean disable_smart_upload;
    public final DriveRustConfig drive_rust_config;
    public final EnvType env;
    public final Boolean for_app;
    public final String root_path;
    public final String session;
    public final String storage_path;
    public final String tenant_id;
    public final String user_id;
    public final String version;

    public enum EnvType implements WireEnum {
        ONLINE(1),
        STAGING(2),
        PRE_RELEASE(3),
        OVERSEA(4);
        
        public static final ProtoAdapter<EnvType> ADAPTER = ProtoAdapter.newEnumAdapter(EnvType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static EnvType fromValue(int i) {
            if (i == 1) {
                return ONLINE;
            }
            if (i == 2) {
                return STAGING;
            }
            if (i == 3) {
                return PRE_RELEASE;
            }
            if (i != 4) {
                return null;
            }
            return OVERSEA;
        }

        private EnvType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.InitDriveRequest$b */
    private static final class C19366b extends ProtoAdapter<InitDriveRequest> {
        C19366b() {
            super(FieldEncoding.LENGTH_DELIMITED, InitDriveRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(InitDriveRequest initDriveRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, initDriveRequest.for_app) + ProtoAdapter.STRING.encodedSizeWithTag(2, initDriveRequest.storage_path) + ProtoAdapter.STRING.encodedSizeWithTag(3, initDriveRequest.user_id) + ProtoAdapter.STRING.encodedSizeWithTag(4, initDriveRequest.session);
            int i8 = 0;
            if (initDriveRequest.env != null) {
                i = EnvType.ADAPTER.encodedSizeWithTag(5, initDriveRequest.env);
            } else {
                i = 0;
            }
            int i9 = encodedSizeWithTag + i;
            if (initDriveRequest.device_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(6, initDriveRequest.device_id);
            } else {
                i2 = 0;
            }
            int i10 = i9 + i2;
            if (initDriveRequest.version != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(7, initDriveRequest.version);
            } else {
                i3 = 0;
            }
            int i11 = i10 + i3;
            if (initDriveRequest.root_path != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(8, initDriveRequest.root_path);
            } else {
                i4 = 0;
            }
            int i12 = i11 + i4;
            if (initDriveRequest.disable_smart_upload != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(9, initDriveRequest.disable_smart_upload);
            } else {
                i5 = 0;
            }
            int i13 = i12 + i5;
            if (initDriveRequest.disable_cdn_download != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(10, initDriveRequest.disable_cdn_download);
            } else {
                i6 = 0;
            }
            int i14 = i13 + i6;
            if (initDriveRequest.drive_rust_config != null) {
                i7 = DriveRustConfig.ADAPTER.encodedSizeWithTag(11, initDriveRequest.drive_rust_config);
            } else {
                i7 = 0;
            }
            int i15 = i14 + i7;
            if (initDriveRequest.tenant_id != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(12, initDriveRequest.tenant_id);
            }
            return i15 + i8 + initDriveRequest.unknownFields().size();
        }

        /* renamed from: a */
        public InitDriveRequest decode(ProtoReader protoReader) throws IOException {
            C19365a aVar = new C19365a();
            aVar.f47618a = false;
            aVar.f47619b = "";
            aVar.f47620c = "";
            aVar.f47621d = "";
            aVar.f47622e = EnvType.ONLINE;
            aVar.f47623f = "";
            aVar.f47624g = "";
            aVar.f47625h = "";
            aVar.f47626i = false;
            aVar.f47627j = false;
            aVar.f47629l = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f47618a = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            aVar.f47619b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f47620c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f47621d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f47622e = EnvType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 6:
                            aVar.f47623f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f47624g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f47625h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f47626i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 10:
                            aVar.f47627j = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 11:
                            aVar.f47628k = DriveRustConfig.ADAPTER.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f47629l = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, InitDriveRequest initDriveRequest) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, initDriveRequest.for_app);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, initDriveRequest.storage_path);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, initDriveRequest.user_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, initDriveRequest.session);
            if (initDriveRequest.env != null) {
                EnvType.ADAPTER.encodeWithTag(protoWriter, 5, initDriveRequest.env);
            }
            if (initDriveRequest.device_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, initDriveRequest.device_id);
            }
            if (initDriveRequest.version != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, initDriveRequest.version);
            }
            if (initDriveRequest.root_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, initDriveRequest.root_path);
            }
            if (initDriveRequest.disable_smart_upload != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, initDriveRequest.disable_smart_upload);
            }
            if (initDriveRequest.disable_cdn_download != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, initDriveRequest.disable_cdn_download);
            }
            if (initDriveRequest.drive_rust_config != null) {
                DriveRustConfig.ADAPTER.encodeWithTag(protoWriter, 11, initDriveRequest.drive_rust_config);
            }
            if (initDriveRequest.tenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, initDriveRequest.tenant_id);
            }
            protoWriter.writeBytes(initDriveRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19365a newBuilder() {
        C19365a aVar = new C19365a();
        aVar.f47618a = this.for_app;
        aVar.f47619b = this.storage_path;
        aVar.f47620c = this.user_id;
        aVar.f47621d = this.session;
        aVar.f47622e = this.env;
        aVar.f47623f = this.device_id;
        aVar.f47624g = this.version;
        aVar.f47625h = this.root_path;
        aVar.f47626i = this.disable_smart_upload;
        aVar.f47627j = this.disable_cdn_download;
        aVar.f47628k = this.drive_rust_config;
        aVar.f47629l = this.tenant_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.InitDriveRequest$a */
    public static final class C19365a extends Message.Builder<InitDriveRequest, C19365a> {

        /* renamed from: a */
        public Boolean f47618a;

        /* renamed from: b */
        public String f47619b;

        /* renamed from: c */
        public String f47620c;

        /* renamed from: d */
        public String f47621d;

        /* renamed from: e */
        public EnvType f47622e;

        /* renamed from: f */
        public String f47623f;

        /* renamed from: g */
        public String f47624g;

        /* renamed from: h */
        public String f47625h;

        /* renamed from: i */
        public Boolean f47626i;

        /* renamed from: j */
        public Boolean f47627j;

        /* renamed from: k */
        public DriveRustConfig f47628k;

        /* renamed from: l */
        public String f47629l;

        /* renamed from: a */
        public InitDriveRequest build() {
            String str;
            String str2;
            String str3;
            Boolean bool = this.f47618a;
            if (bool != null && (str = this.f47619b) != null && (str2 = this.f47620c) != null && (str3 = this.f47621d) != null) {
                return new InitDriveRequest(bool, str, str2, str3, this.f47622e, this.f47623f, this.f47624g, this.f47625h, this.f47626i, this.f47627j, this.f47628k, this.f47629l, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "for_app", this.f47619b, "storage_path", this.f47620c, "user_id", this.f47621d, "session");
        }

        /* renamed from: a */
        public C19365a mo65977a(DriveRustConfig driveRustConfig) {
            this.f47628k = driveRustConfig;
            return this;
        }

        /* renamed from: b */
        public C19365a mo65981b(Boolean bool) {
            this.f47627j = bool;
            return this;
        }

        /* renamed from: c */
        public C19365a mo65983c(String str) {
            this.f47621d = str;
            return this;
        }

        /* renamed from: d */
        public C19365a mo65984d(String str) {
            this.f47623f = str;
            return this;
        }

        /* renamed from: e */
        public C19365a mo65985e(String str) {
            this.f47629l = str;
            return this;
        }

        /* renamed from: a */
        public C19365a mo65978a(Boolean bool) {
            this.f47618a = bool;
            return this;
        }

        /* renamed from: b */
        public C19365a mo65982b(String str) {
            this.f47620c = str;
            return this;
        }

        /* renamed from: a */
        public C19365a mo65979a(String str) {
            this.f47619b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "InitDriveRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", for_app=");
        sb.append(this.for_app);
        sb.append(", storage_path=");
        sb.append(this.storage_path);
        sb.append(", user_id=");
        sb.append(this.user_id);
        sb.append(", session=");
        sb.append(this.session);
        if (this.env != null) {
            sb.append(", env=");
            sb.append(this.env);
        }
        if (this.device_id != null) {
            sb.append(", device_id=");
            sb.append(this.device_id);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (this.root_path != null) {
            sb.append(", root_path=");
            sb.append(this.root_path);
        }
        if (this.disable_smart_upload != null) {
            sb.append(", disable_smart_upload=");
            sb.append(this.disable_smart_upload);
        }
        if (this.disable_cdn_download != null) {
            sb.append(", disable_cdn_download=");
            sb.append(this.disable_cdn_download);
        }
        if (this.drive_rust_config != null) {
            sb.append(", drive_rust_config=");
            sb.append(this.drive_rust_config);
        }
        if (this.tenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.tenant_id);
        }
        StringBuilder replace = sb.replace(0, 2, "InitDriveRequest{");
        replace.append('}');
        return replace.toString();
    }

    public InitDriveRequest(Boolean bool, String str, String str2, String str3, EnvType envType, String str4, String str5, String str6, Boolean bool2, Boolean bool3, DriveRustConfig driveRustConfig, String str7) {
        this(bool, str, str2, str3, envType, str4, str5, str6, bool2, bool3, driveRustConfig, str7, ByteString.EMPTY);
    }

    public InitDriveRequest(Boolean bool, String str, String str2, String str3, EnvType envType, String str4, String str5, String str6, Boolean bool2, Boolean bool3, DriveRustConfig driveRustConfig, String str7, ByteString byteString) {
        super(ADAPTER, byteString);
        this.for_app = bool;
        this.storage_path = str;
        this.user_id = str2;
        this.session = str3;
        this.env = envType;
        this.device_id = str4;
        this.version = str5;
        this.root_path = str6;
        this.disable_smart_upload = bool2;
        this.disable_cdn_download = bool3;
        this.drive_rust_config = driveRustConfig;
        this.tenant_id = str7;
    }
}
