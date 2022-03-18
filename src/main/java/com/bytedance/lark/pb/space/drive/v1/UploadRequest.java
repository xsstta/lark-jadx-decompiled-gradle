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
import java.util.Map;
import okio.ByteString;

public final class UploadRequest extends Message<UploadRequest, C19405a> {
    public static final ProtoAdapter<UploadRequest> ADAPTER = new C19406b();
    public static final ApiType DEFAULT_API_TYPE = ApiType.DRIVE;
    public static final Integer DEFAULT_CHANGE_HISTORY = 1;
    public static final ByteString DEFAULT_FILE_BODY = ByteString.EMPTY;
    public static final Integer DEFAULT_OBJ_TYPE = 2;
    public static final Integer DEFAULT_PRIORITY = 0;
    public static final Boolean DEFAULT_RELATIVE_PATH = false;
    public static final UploadScene DEFAULT_SCENE = UploadScene.UNKNOWN;
    public static final Boolean DEFAULT_USE_PATH_NAME_FOR_HISTORY = false;
    public static final Boolean DEFAULT_WITH_SLICE = true;
    private static final long serialVersionUID = 0;
    public final ApiType api_type;
    public final String base_version;
    public final Integer change_history;
    public final String content_version;
    public final Map<String, String> ext_rust;
    public final Map<String, String> extra_headers;
    public final Map<String, String> extra_params;
    public final ByteString file_body;
    public final String file_name;
    public final String file_token;
    public final String local_path;
    public final String mount_node_point;
    public final String mount_point;
    public final Integer obj_type;
    public final Integer priority;
    public final Boolean relative_path;
    public final String request_id;
    public final UploadScene scene;
    public final String tree_id;
    public final String tree_version;
    public final String unique_key;
    public final String uri_str;
    public final Boolean use_path_name_for_history;
    public final Boolean with_slice;

    public enum ApiType implements WireEnum {
        DRIVE(0),
        IMG(1);
        
        public static final ProtoAdapter<ApiType> ADAPTER = ProtoAdapter.newEnumAdapter(ApiType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ApiType fromValue(int i) {
            if (i == 0) {
                return DRIVE;
            }
            if (i != 1) {
                return null;
            }
            return IMG;
        }

        private ApiType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.UploadRequest$b */
    private static final class C19406b extends ProtoAdapter<UploadRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f47729a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, String>> f47730b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        /* renamed from: c */
        private final ProtoAdapter<Map<String, String>> f47731c = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C19406b() {
            super(FieldEncoding.LENGTH_DELIMITED, UploadRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UploadRequest uploadRequest) {
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
            int i15;
            int i16;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, uploadRequest.local_path) + ProtoAdapter.STRING.encodedSizeWithTag(2, uploadRequest.file_name) + ProtoAdapter.STRING.encodedSizeWithTag(3, uploadRequest.mount_node_point) + ProtoAdapter.STRING.encodedSizeWithTag(4, uploadRequest.mount_point);
            int i17 = 0;
            if (uploadRequest.file_token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(5, uploadRequest.file_token);
            } else {
                i = 0;
            }
            int i18 = encodedSizeWithTag + i;
            if (uploadRequest.relative_path != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(6, uploadRequest.relative_path);
            } else {
                i2 = 0;
            }
            int i19 = i18 + i2;
            if (uploadRequest.base_version != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(7, uploadRequest.base_version);
            } else {
                i3 = 0;
            }
            int i20 = i19 + i3;
            if (uploadRequest.obj_type != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(8, uploadRequest.obj_type);
            } else {
                i4 = 0;
            }
            int i21 = i20 + i4;
            if (uploadRequest.api_type != null) {
                i5 = ApiType.ADAPTER.encodedSizeWithTag(9, uploadRequest.api_type);
            } else {
                i5 = 0;
            }
            int i22 = i21 + i5;
            if (uploadRequest.priority != null) {
                i6 = ProtoAdapter.INT32.encodedSizeWithTag(10, uploadRequest.priority);
            } else {
                i6 = 0;
            }
            int i23 = i22 + i6;
            if (uploadRequest.tree_version != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(11, uploadRequest.tree_version);
            } else {
                i7 = 0;
            }
            int i24 = i23 + i7;
            if (uploadRequest.content_version != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(12, uploadRequest.content_version);
            } else {
                i8 = 0;
            }
            int i25 = i24 + i8;
            if (uploadRequest.with_slice != null) {
                i9 = ProtoAdapter.BOOL.encodedSizeWithTag(13, uploadRequest.with_slice);
            } else {
                i9 = 0;
            }
            int i26 = i25 + i9;
            if (uploadRequest.change_history != null) {
                i10 = ProtoAdapter.INT32.encodedSizeWithTag(14, uploadRequest.change_history);
            } else {
                i10 = 0;
            }
            int i27 = i26 + i10;
            if (uploadRequest.tree_id != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(15, uploadRequest.tree_id);
            } else {
                i11 = 0;
            }
            int i28 = i27 + i11;
            if (uploadRequest.request_id != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(16, uploadRequest.request_id);
            } else {
                i12 = 0;
            }
            int i29 = i28 + i12;
            if (uploadRequest.scene != null) {
                i13 = UploadScene.ADAPTER.encodedSizeWithTag(17, uploadRequest.scene);
            } else {
                i13 = 0;
            }
            int i30 = i29 + i13;
            if (uploadRequest.unique_key != null) {
                i14 = ProtoAdapter.STRING.encodedSizeWithTag(18, uploadRequest.unique_key);
            } else {
                i14 = 0;
            }
            int i31 = i30 + i14;
            if (uploadRequest.use_path_name_for_history != null) {
                i15 = ProtoAdapter.BOOL.encodedSizeWithTag(19, uploadRequest.use_path_name_for_history);
            } else {
                i15 = 0;
            }
            int i32 = i31 + i15;
            if (uploadRequest.file_body != null) {
                i16 = ProtoAdapter.BYTES.encodedSizeWithTag(20, uploadRequest.file_body);
            } else {
                i16 = 0;
            }
            int encodedSizeWithTag2 = i32 + i16 + this.f47729a.encodedSizeWithTag(21, uploadRequest.extra_params) + this.f47730b.encodedSizeWithTag(22, uploadRequest.extra_headers) + this.f47731c.encodedSizeWithTag(23, uploadRequest.ext_rust);
            if (uploadRequest.uri_str != null) {
                i17 = ProtoAdapter.STRING.encodedSizeWithTag(24, uploadRequest.uri_str);
            }
            return encodedSizeWithTag2 + i17 + uploadRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UploadRequest decode(ProtoReader protoReader) throws IOException {
            C19405a aVar = new C19405a();
            aVar.f47705a = "";
            aVar.f47706b = "";
            aVar.f47707c = "";
            aVar.f47708d = "";
            aVar.f47709e = "";
            aVar.f47710f = false;
            aVar.f47711g = "";
            aVar.f47712h = 2;
            aVar.f47713i = ApiType.DRIVE;
            aVar.f47714j = 0;
            aVar.f47715k = "";
            aVar.f47716l = "";
            aVar.f47717m = true;
            aVar.f47718n = 1;
            aVar.f47719o = "";
            aVar.f47720p = "";
            aVar.f47721q = UploadScene.UNKNOWN;
            aVar.f47722r = "";
            aVar.f47723s = false;
            aVar.f47724t = ByteString.EMPTY;
            aVar.f47728x = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f47705a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f47706b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f47707c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f47708d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f47709e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f47710f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f47711g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f47712h = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 9:
                            try {
                                aVar.f47713i = ApiType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 10:
                            aVar.f47714j = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 11:
                            aVar.f47715k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f47716l = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 13:
                            aVar.f47717m = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 14:
                            aVar.f47718n = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 15:
                            aVar.f47719o = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            aVar.f47720p = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 17:
                            try {
                                aVar.f47721q = UploadScene.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 18:
                            aVar.f47722r = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 19:
                            aVar.f47723s = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 20:
                            aVar.f47724t = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        case 21:
                            aVar.f47725u.putAll(this.f47729a.decode(protoReader));
                            break;
                        case 22:
                            aVar.f47726v.putAll(this.f47730b.decode(protoReader));
                            break;
                        case 23:
                            aVar.f47727w.putAll(this.f47731c.decode(protoReader));
                            break;
                        case 24:
                            aVar.f47728x = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, UploadRequest uploadRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, uploadRequest.local_path);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, uploadRequest.file_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, uploadRequest.mount_node_point);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, uploadRequest.mount_point);
            if (uploadRequest.file_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, uploadRequest.file_token);
            }
            if (uploadRequest.relative_path != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, uploadRequest.relative_path);
            }
            if (uploadRequest.base_version != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, uploadRequest.base_version);
            }
            if (uploadRequest.obj_type != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, uploadRequest.obj_type);
            }
            if (uploadRequest.api_type != null) {
                ApiType.ADAPTER.encodeWithTag(protoWriter, 9, uploadRequest.api_type);
            }
            if (uploadRequest.priority != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, uploadRequest.priority);
            }
            if (uploadRequest.tree_version != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, uploadRequest.tree_version);
            }
            if (uploadRequest.content_version != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, uploadRequest.content_version);
            }
            if (uploadRequest.with_slice != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 13, uploadRequest.with_slice);
            }
            if (uploadRequest.change_history != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 14, uploadRequest.change_history);
            }
            if (uploadRequest.tree_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, uploadRequest.tree_id);
            }
            if (uploadRequest.request_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 16, uploadRequest.request_id);
            }
            if (uploadRequest.scene != null) {
                UploadScene.ADAPTER.encodeWithTag(protoWriter, 17, uploadRequest.scene);
            }
            if (uploadRequest.unique_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 18, uploadRequest.unique_key);
            }
            if (uploadRequest.use_path_name_for_history != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 19, uploadRequest.use_path_name_for_history);
            }
            if (uploadRequest.file_body != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 20, uploadRequest.file_body);
            }
            this.f47729a.encodeWithTag(protoWriter, 21, uploadRequest.extra_params);
            this.f47730b.encodeWithTag(protoWriter, 22, uploadRequest.extra_headers);
            this.f47731c.encodeWithTag(protoWriter, 23, uploadRequest.ext_rust);
            if (uploadRequest.uri_str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 24, uploadRequest.uri_str);
            }
            protoWriter.writeBytes(uploadRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19405a newBuilder() {
        C19405a aVar = new C19405a();
        aVar.f47705a = this.local_path;
        aVar.f47706b = this.file_name;
        aVar.f47707c = this.mount_node_point;
        aVar.f47708d = this.mount_point;
        aVar.f47709e = this.file_token;
        aVar.f47710f = this.relative_path;
        aVar.f47711g = this.base_version;
        aVar.f47712h = this.obj_type;
        aVar.f47713i = this.api_type;
        aVar.f47714j = this.priority;
        aVar.f47715k = this.tree_version;
        aVar.f47716l = this.content_version;
        aVar.f47717m = this.with_slice;
        aVar.f47718n = this.change_history;
        aVar.f47719o = this.tree_id;
        aVar.f47720p = this.request_id;
        aVar.f47721q = this.scene;
        aVar.f47722r = this.unique_key;
        aVar.f47723s = this.use_path_name_for_history;
        aVar.f47724t = this.file_body;
        aVar.f47725u = Internal.copyOf("extra_params", this.extra_params);
        aVar.f47726v = Internal.copyOf("extra_headers", this.extra_headers);
        aVar.f47727w = Internal.copyOf("ext_rust", this.ext_rust);
        aVar.f47728x = this.uri_str;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.UploadRequest$a */
    public static final class C19405a extends Message.Builder<UploadRequest, C19405a> {

        /* renamed from: a */
        public String f47705a;

        /* renamed from: b */
        public String f47706b;

        /* renamed from: c */
        public String f47707c;

        /* renamed from: d */
        public String f47708d;

        /* renamed from: e */
        public String f47709e;

        /* renamed from: f */
        public Boolean f47710f;

        /* renamed from: g */
        public String f47711g;

        /* renamed from: h */
        public Integer f47712h;

        /* renamed from: i */
        public ApiType f47713i;

        /* renamed from: j */
        public Integer f47714j;

        /* renamed from: k */
        public String f47715k;

        /* renamed from: l */
        public String f47716l;

        /* renamed from: m */
        public Boolean f47717m;

        /* renamed from: n */
        public Integer f47718n;

        /* renamed from: o */
        public String f47719o;

        /* renamed from: p */
        public String f47720p;

        /* renamed from: q */
        public UploadScene f47721q;

        /* renamed from: r */
        public String f47722r;

        /* renamed from: s */
        public Boolean f47723s;

        /* renamed from: t */
        public ByteString f47724t;

        /* renamed from: u */
        public Map<String, String> f47725u = Internal.newMutableMap();

        /* renamed from: v */
        public Map<String, String> f47726v = Internal.newMutableMap();

        /* renamed from: w */
        public Map<String, String> f47727w = Internal.newMutableMap();

        /* renamed from: x */
        public String f47728x;

        /* renamed from: a */
        public UploadRequest build() {
            String str;
            String str2;
            String str3;
            String str4 = this.f47705a;
            if (str4 != null && (str = this.f47706b) != null && (str2 = this.f47707c) != null && (str3 = this.f47708d) != null) {
                return new UploadRequest(str4, str, str2, str3, this.f47709e, this.f47710f, this.f47711g, this.f47712h, this.f47713i, this.f47714j, this.f47715k, this.f47716l, this.f47717m, this.f47718n, this.f47719o, this.f47720p, this.f47721q, this.f47722r, this.f47723s, this.f47724t, this.f47725u, this.f47726v, this.f47727w, this.f47728x, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str4, "local_path", this.f47706b, "file_name", this.f47707c, "mount_node_point", this.f47708d, "mount_point");
        }

        /* renamed from: a */
        public C19405a mo66074a(ApiType apiType) {
            this.f47713i = apiType;
            return this;
        }

        /* renamed from: b */
        public C19405a mo66080b(String str) {
            this.f47706b = str;
            return this;
        }

        /* renamed from: c */
        public C19405a mo66082c(String str) {
            this.f47707c = str;
            return this;
        }

        /* renamed from: d */
        public C19405a mo66083d(String str) {
            this.f47708d = str;
            return this;
        }

        /* renamed from: e */
        public C19405a mo66084e(String str) {
            this.f47728x = str;
            return this;
        }

        /* renamed from: a */
        public C19405a mo66075a(UploadScene uploadScene) {
            this.f47721q = uploadScene;
            return this;
        }

        /* renamed from: b */
        public C19405a mo66081b(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.f47727w = map;
            return this;
        }

        /* renamed from: a */
        public C19405a mo66076a(Integer num) {
            this.f47714j = num;
            return this;
        }

        /* renamed from: a */
        public C19405a mo66077a(String str) {
            this.f47705a = str;
            return this;
        }

        /* renamed from: a */
        public C19405a mo66078a(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.f47725u = map;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "UploadRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", local_path=");
        sb.append(this.local_path);
        sb.append(", file_name=");
        sb.append(this.file_name);
        sb.append(", mount_node_point=");
        sb.append(this.mount_node_point);
        sb.append(", mount_point=");
        sb.append(this.mount_point);
        if (this.file_token != null) {
            sb.append(", file_token=");
            sb.append(this.file_token);
        }
        if (this.relative_path != null) {
            sb.append(", relative_path=");
            sb.append(this.relative_path);
        }
        if (this.base_version != null) {
            sb.append(", base_version=");
            sb.append(this.base_version);
        }
        if (this.obj_type != null) {
            sb.append(", obj_type=");
            sb.append(this.obj_type);
        }
        if (this.api_type != null) {
            sb.append(", api_type=");
            sb.append(this.api_type);
        }
        if (this.priority != null) {
            sb.append(", priority=");
            sb.append(this.priority);
        }
        if (this.tree_version != null) {
            sb.append(", tree_version=");
            sb.append(this.tree_version);
        }
        if (this.content_version != null) {
            sb.append(", content_version=");
            sb.append(this.content_version);
        }
        if (this.with_slice != null) {
            sb.append(", with_slice=");
            sb.append(this.with_slice);
        }
        if (this.change_history != null) {
            sb.append(", change_history=");
            sb.append(this.change_history);
        }
        if (this.tree_id != null) {
            sb.append(", tree_id=");
            sb.append(this.tree_id);
        }
        if (this.request_id != null) {
            sb.append(", request_id=");
            sb.append(this.request_id);
        }
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        if (this.unique_key != null) {
            sb.append(", unique_key=");
            sb.append(this.unique_key);
        }
        if (this.use_path_name_for_history != null) {
            sb.append(", use_path_name_for_history=");
            sb.append(this.use_path_name_for_history);
        }
        if (this.file_body != null) {
            sb.append(", file_body=");
            sb.append(this.file_body);
        }
        if (!this.extra_params.isEmpty()) {
            sb.append(", extra_params=");
            sb.append(this.extra_params);
        }
        if (!this.extra_headers.isEmpty()) {
            sb.append(", extra_headers=");
            sb.append(this.extra_headers);
        }
        if (!this.ext_rust.isEmpty()) {
            sb.append(", ext_rust=");
            sb.append(this.ext_rust);
        }
        if (this.uri_str != null) {
            sb.append(", uri_str=");
            sb.append(this.uri_str);
        }
        StringBuilder replace = sb.replace(0, 2, "UploadRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UploadRequest(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, Integer num, ApiType apiType, Integer num2, String str7, String str8, Boolean bool2, Integer num3, String str9, String str10, UploadScene uploadScene, String str11, Boolean bool3, ByteString byteString, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, String str12) {
        this(str, str2, str3, str4, str5, bool, str6, num, apiType, num2, str7, str8, bool2, num3, str9, str10, uploadScene, str11, bool3, byteString, map, map2, map3, str12, ByteString.EMPTY);
    }

    public UploadRequest(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, Integer num, ApiType apiType, Integer num2, String str7, String str8, Boolean bool2, Integer num3, String str9, String str10, UploadScene uploadScene, String str11, Boolean bool3, ByteString byteString, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, String str12, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.local_path = str;
        this.file_name = str2;
        this.mount_node_point = str3;
        this.mount_point = str4;
        this.file_token = str5;
        this.relative_path = bool;
        this.base_version = str6;
        this.obj_type = num;
        this.api_type = apiType;
        this.priority = num2;
        this.tree_version = str7;
        this.content_version = str8;
        this.with_slice = bool2;
        this.change_history = num3;
        this.tree_id = str9;
        this.request_id = str10;
        this.scene = uploadScene;
        this.unique_key = str11;
        this.use_path_name_for_history = bool3;
        this.file_body = byteString;
        this.extra_params = Internal.immutableCopyOf("extra_params", map);
        this.extra_headers = Internal.immutableCopyOf("extra_headers", map2);
        this.ext_rust = Internal.immutableCopyOf("ext_rust", map3);
        this.uri_str = str12;
    }
}
