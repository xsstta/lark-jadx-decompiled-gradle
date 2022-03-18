package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class GetNewVersionRequest extends Message<GetNewVersionRequest, C14977a> {
    public static final ProtoAdapter<GetNewVersionRequest> ADAPTER = new C14978b();
    public static final Boolean DEFAULT_APP64 = false;
    public static final AppType DEFAULT_APP_TYPE = AppType.LARK;
    public static final Boolean DEFAULT_DEVICE64 = false;
    public static final Boolean DEFAULT_IS_FORCE = false;
    private static final long serialVersionUID = 0;
    public final Boolean app64;
    public final AppType app_type;
    public final String brand;
    public final Boolean device64;
    public final String device_id;
    public final Boolean is_force;
    public final String ka;
    public final String mode_name;
    public final String os;
    public final String os_version;
    public final String rom_version;
    public final String source;
    public final String tenant_id;
    public final String user_id;
    public final String version;

    public enum AppType implements WireEnum {
        UNKOWN(0),
        LARK(1),
        DOCS(2),
        EMAIL(3),
        MEETING(4),
        CALENDER(5),
        VC(6),
        FEISHULITE(7);
        
        public static final ProtoAdapter<AppType> ADAPTER = ProtoAdapter.newEnumAdapter(AppType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static AppType fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKOWN;
                case 1:
                    return LARK;
                case 2:
                    return DOCS;
                case 3:
                    return EMAIL;
                case 4:
                    return MEETING;
                case 5:
                    return CALENDER;
                case 6:
                    return VC;
                case 7:
                    return FEISHULITE;
                default:
                    return null;
            }
        }

        private AppType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetNewVersionRequest$b */
    private static final class C14978b extends ProtoAdapter<GetNewVersionRequest> {
        C14978b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetNewVersionRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetNewVersionRequest getNewVersionRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15 = 0;
            if (getNewVersionRequest.version != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getNewVersionRequest.version);
            } else {
                i = 0;
            }
            if (getNewVersionRequest.os != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getNewVersionRequest.os);
            } else {
                i2 = 0;
            }
            int i16 = i + i2;
            if (getNewVersionRequest.user_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, getNewVersionRequest.user_id);
            } else {
                i3 = 0;
            }
            int i17 = i16 + i3;
            if (getNewVersionRequest.tenant_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, getNewVersionRequest.tenant_id);
            } else {
                i4 = 0;
            }
            int i18 = i17 + i4;
            if (getNewVersionRequest.device_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, getNewVersionRequest.device_id);
            } else {
                i5 = 0;
            }
            int i19 = i18 + i5;
            if (getNewVersionRequest.source != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, getNewVersionRequest.source);
            } else {
                i6 = 0;
            }
            int i20 = i19 + i6;
            if (getNewVersionRequest.os_version != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, getNewVersionRequest.os_version);
            } else {
                i7 = 0;
            }
            int i21 = i20 + i7;
            if (getNewVersionRequest.brand != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(8, getNewVersionRequest.brand);
            } else {
                i8 = 0;
            }
            int i22 = i21 + i8;
            if (getNewVersionRequest.mode_name != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(9, getNewVersionRequest.mode_name);
            } else {
                i9 = 0;
            }
            int i23 = i22 + i9;
            if (getNewVersionRequest.rom_version != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(10, getNewVersionRequest.rom_version);
            } else {
                i10 = 0;
            }
            int i24 = i23 + i10;
            if (getNewVersionRequest.app_type != null) {
                i11 = AppType.ADAPTER.encodedSizeWithTag(11, getNewVersionRequest.app_type);
            } else {
                i11 = 0;
            }
            int i25 = i24 + i11;
            if (getNewVersionRequest.ka != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(12, getNewVersionRequest.ka);
            } else {
                i12 = 0;
            }
            int i26 = i25 + i12;
            if (getNewVersionRequest.is_force != null) {
                i13 = ProtoAdapter.BOOL.encodedSizeWithTag(13, getNewVersionRequest.is_force);
            } else {
                i13 = 0;
            }
            int i27 = i26 + i13;
            if (getNewVersionRequest.device64 != null) {
                i14 = ProtoAdapter.BOOL.encodedSizeWithTag(14, getNewVersionRequest.device64);
            } else {
                i14 = 0;
            }
            int i28 = i27 + i14;
            if (getNewVersionRequest.app64 != null) {
                i15 = ProtoAdapter.BOOL.encodedSizeWithTag(15, getNewVersionRequest.app64);
            }
            return i28 + i15 + getNewVersionRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetNewVersionRequest decode(ProtoReader protoReader) throws IOException {
            C14977a aVar = new C14977a();
            aVar.f39627a = "";
            aVar.f39628b = "";
            aVar.f39629c = "";
            aVar.f39630d = "";
            aVar.f39631e = "";
            aVar.f39632f = "";
            aVar.f39633g = "";
            aVar.f39634h = "";
            aVar.f39635i = "";
            aVar.f39636j = "";
            aVar.f39637k = AppType.LARK;
            aVar.f39638l = "";
            aVar.f39639m = false;
            aVar.f39640n = false;
            aVar.f39641o = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f39627a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f39628b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f39629c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f39630d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f39631e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f39632f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f39633g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f39634h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f39635i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f39636j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            try {
                                aVar.f39637k = AppType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f39638l = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 13:
                            aVar.f39639m = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 14:
                            aVar.f39640n = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 15:
                            aVar.f39641o = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, GetNewVersionRequest getNewVersionRequest) throws IOException {
            if (getNewVersionRequest.version != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getNewVersionRequest.version);
            }
            if (getNewVersionRequest.os != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getNewVersionRequest.os);
            }
            if (getNewVersionRequest.user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getNewVersionRequest.user_id);
            }
            if (getNewVersionRequest.tenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getNewVersionRequest.tenant_id);
            }
            if (getNewVersionRequest.device_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, getNewVersionRequest.device_id);
            }
            if (getNewVersionRequest.source != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, getNewVersionRequest.source);
            }
            if (getNewVersionRequest.os_version != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, getNewVersionRequest.os_version);
            }
            if (getNewVersionRequest.brand != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, getNewVersionRequest.brand);
            }
            if (getNewVersionRequest.mode_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, getNewVersionRequest.mode_name);
            }
            if (getNewVersionRequest.rom_version != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, getNewVersionRequest.rom_version);
            }
            if (getNewVersionRequest.app_type != null) {
                AppType.ADAPTER.encodeWithTag(protoWriter, 11, getNewVersionRequest.app_type);
            }
            if (getNewVersionRequest.ka != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, getNewVersionRequest.ka);
            }
            if (getNewVersionRequest.is_force != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 13, getNewVersionRequest.is_force);
            }
            if (getNewVersionRequest.device64 != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 14, getNewVersionRequest.device64);
            }
            if (getNewVersionRequest.app64 != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 15, getNewVersionRequest.app64);
            }
            protoWriter.writeBytes(getNewVersionRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetNewVersionRequest$a */
    public static final class C14977a extends Message.Builder<GetNewVersionRequest, C14977a> {

        /* renamed from: a */
        public String f39627a;

        /* renamed from: b */
        public String f39628b;

        /* renamed from: c */
        public String f39629c;

        /* renamed from: d */
        public String f39630d;

        /* renamed from: e */
        public String f39631e;

        /* renamed from: f */
        public String f39632f;

        /* renamed from: g */
        public String f39633g;

        /* renamed from: h */
        public String f39634h;

        /* renamed from: i */
        public String f39635i;

        /* renamed from: j */
        public String f39636j;

        /* renamed from: k */
        public AppType f39637k;

        /* renamed from: l */
        public String f39638l;

        /* renamed from: m */
        public Boolean f39639m;

        /* renamed from: n */
        public Boolean f39640n;

        /* renamed from: o */
        public Boolean f39641o;

        /* renamed from: a */
        public GetNewVersionRequest build() {
            return new GetNewVersionRequest(this.f39627a, this.f39628b, this.f39629c, this.f39630d, this.f39631e, this.f39632f, this.f39633g, this.f39634h, this.f39635i, this.f39636j, this.f39637k, this.f39638l, this.f39639m, this.f39640n, this.f39641o, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C14977a mo54765a(AppType appType) {
            this.f39637k = appType;
            return this;
        }

        /* renamed from: b */
        public C14977a mo54769b(Boolean bool) {
            this.f39640n = bool;
            return this;
        }

        /* renamed from: c */
        public C14977a mo54771c(Boolean bool) {
            this.f39641o = bool;
            return this;
        }

        /* renamed from: d */
        public C14977a mo54773d(String str) {
            this.f39630d = str;
            return this;
        }

        /* renamed from: e */
        public C14977a mo54774e(String str) {
            this.f39631e = str;
            return this;
        }

        /* renamed from: f */
        public C14977a mo54775f(String str) {
            this.f39632f = str;
            return this;
        }

        /* renamed from: g */
        public C14977a mo54776g(String str) {
            this.f39633g = str;
            return this;
        }

        /* renamed from: h */
        public C14977a mo54777h(String str) {
            this.f39634h = str;
            return this;
        }

        /* renamed from: i */
        public C14977a mo54778i(String str) {
            this.f39635i = str;
            return this;
        }

        /* renamed from: j */
        public C14977a mo54779j(String str) {
            this.f39636j = str;
            return this;
        }

        /* renamed from: k */
        public C14977a mo54780k(String str) {
            this.f39638l = str;
            return this;
        }

        /* renamed from: a */
        public C14977a mo54766a(Boolean bool) {
            this.f39639m = bool;
            return this;
        }

        /* renamed from: b */
        public C14977a mo54770b(String str) {
            this.f39628b = str;
            return this;
        }

        /* renamed from: c */
        public C14977a mo54772c(String str) {
            this.f39629c = str;
            return this;
        }

        /* renamed from: a */
        public C14977a mo54767a(String str) {
            this.f39627a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C14977a newBuilder() {
        C14977a aVar = new C14977a();
        aVar.f39627a = this.version;
        aVar.f39628b = this.os;
        aVar.f39629c = this.user_id;
        aVar.f39630d = this.tenant_id;
        aVar.f39631e = this.device_id;
        aVar.f39632f = this.source;
        aVar.f39633g = this.os_version;
        aVar.f39634h = this.brand;
        aVar.f39635i = this.mode_name;
        aVar.f39636j = this.rom_version;
        aVar.f39637k = this.app_type;
        aVar.f39638l = this.ka;
        aVar.f39639m = this.is_force;
        aVar.f39640n = this.device64;
        aVar.f39641o = this.app64;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "GetNewVersionRequest");
        StringBuilder sb = new StringBuilder();
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (this.os != null) {
            sb.append(", os=");
            sb.append(this.os);
        }
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.tenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.tenant_id);
        }
        if (this.device_id != null) {
            sb.append(", device_id=");
            sb.append(this.device_id);
        }
        if (this.source != null) {
            sb.append(", source=");
            sb.append(this.source);
        }
        if (this.os_version != null) {
            sb.append(", os_version=");
            sb.append(this.os_version);
        }
        if (this.brand != null) {
            sb.append(", brand=");
            sb.append(this.brand);
        }
        if (this.mode_name != null) {
            sb.append(", mode_name=");
            sb.append(this.mode_name);
        }
        if (this.rom_version != null) {
            sb.append(", rom_version=");
            sb.append(this.rom_version);
        }
        if (this.app_type != null) {
            sb.append(", app_type=");
            sb.append(this.app_type);
        }
        if (this.ka != null) {
            sb.append(", ka=");
            sb.append(this.ka);
        }
        if (this.is_force != null) {
            sb.append(", is_force=");
            sb.append(this.is_force);
        }
        if (this.device64 != null) {
            sb.append(", device64=");
            sb.append(this.device64);
        }
        if (this.app64 != null) {
            sb.append(", app64=");
            sb.append(this.app64);
        }
        StringBuilder replace = sb.replace(0, 2, "GetNewVersionRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetNewVersionRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, AppType appType, String str11, Boolean bool, Boolean bool2, Boolean bool3) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, appType, str11, bool, bool2, bool3, ByteString.EMPTY);
    }

    public GetNewVersionRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, AppType appType, String str11, Boolean bool, Boolean bool2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.version = str;
        this.os = str2;
        this.user_id = str3;
        this.tenant_id = str4;
        this.device_id = str5;
        this.source = str6;
        this.os_version = str7;
        this.brand = str8;
        this.mode_name = str9;
        this.rom_version = str10;
        this.app_type = appType;
        this.ka = str11;
        this.is_force = bool;
        this.device64 = bool2;
        this.app64 = bool3;
    }
}
