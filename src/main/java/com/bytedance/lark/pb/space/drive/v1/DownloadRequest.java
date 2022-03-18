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

public final class DownloadRequest extends Message<DownloadRequest, C19351a> {
    public static final ProtoAdapter<DownloadRequest> ADAPTER = new C19352b();
    public static final ApiType DEFAULT_API_TYPE = ApiType.DRIVE;
    public static final Boolean DEFAULT_AUTO_SUFFIX = false;
    public static final Boolean DEFAULT_DISABLE_CDN_DOWNLOAD = false;
    public static final Boolean DEFAULT_DISABLE_COVER_RETRY = false;
    public static final Integer DEFAULT_PRIORITY = 0;
    public static final Boolean DEFAULT_RELATIVE_PATH = false;
    public static final Boolean DEFAULT_REVERSE_ORDER = true;
    public static final DownloadScene DEFAULT_SCENE = DownloadScene.unknown;
    public static final Boolean DEFAULT_WITH_SLICE = true;
    private static final long serialVersionUID = 0;
    public final ApiType api_type;
    public final Boolean auto_suffix;
    public final CoverDownloadInfo cover_info;
    public final String data_version;
    public final Boolean disable_cdn_download;
    public final Boolean disable_cover_retry;
    public final DocInfo doc_info;
    public final String extra;
    public final String file_token;
    public final String local_path;
    public final String mount_node_point;
    public final String mount_point;
    public final Integer priority;
    public final Boolean relative_path;
    public final Boolean reverse_order;
    public final DownloadScene scene;
    public final Map<String, String> tea_params;
    public final String unique_key;
    public final Boolean with_slice;

    public enum ApiType implements WireEnum {
        DRIVE(0),
        COVER(1),
        PREVIEW(2),
        IMG(3),
        RANGE(4);
        
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
            if (i == 1) {
                return COVER;
            }
            if (i == 2) {
                return PREVIEW;
            }
            if (i == 3) {
                return IMG;
            }
            if (i != 4) {
                return null;
            }
            return RANGE;
        }

        private ApiType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.DownloadRequest$b */
    private static final class C19352b extends ProtoAdapter<DownloadRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f47582a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C19352b() {
            super(FieldEncoding.LENGTH_DELIMITED, DownloadRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DownloadRequest downloadRequest) {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, downloadRequest.local_path) + ProtoAdapter.STRING.encodedSizeWithTag(2, downloadRequest.file_token) + ProtoAdapter.STRING.encodedSizeWithTag(3, downloadRequest.mount_node_point) + ProtoAdapter.STRING.encodedSizeWithTag(4, downloadRequest.mount_point);
            int i14 = 0;
            if (downloadRequest.auto_suffix != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(5, downloadRequest.auto_suffix);
            } else {
                i = 0;
            }
            int i15 = encodedSizeWithTag + i;
            if (downloadRequest.priority != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(6, downloadRequest.priority);
            } else {
                i2 = 0;
            }
            int i16 = i15 + i2;
            if (downloadRequest.data_version != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(7, downloadRequest.data_version);
            } else {
                i3 = 0;
            }
            int i17 = i16 + i3;
            if (downloadRequest.relative_path != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(8, downloadRequest.relative_path);
            } else {
                i4 = 0;
            }
            int i18 = i17 + i4;
            if (downloadRequest.with_slice != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(9, downloadRequest.with_slice);
            } else {
                i5 = 0;
            }
            int i19 = i18 + i5;
            if (downloadRequest.api_type != null) {
                i6 = ApiType.ADAPTER.encodedSizeWithTag(10, downloadRequest.api_type);
            } else {
                i6 = 0;
            }
            int i20 = i19 + i6;
            if (downloadRequest.cover_info != null) {
                i7 = CoverDownloadInfo.ADAPTER.encodedSizeWithTag(11, downloadRequest.cover_info);
            } else {
                i7 = 0;
            }
            int i21 = i20 + i7;
            if (downloadRequest.unique_key != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(12, downloadRequest.unique_key);
            } else {
                i8 = 0;
            }
            int i22 = i21 + i8;
            if (downloadRequest.scene != null) {
                i9 = DownloadScene.ADAPTER.encodedSizeWithTag(13, downloadRequest.scene);
            } else {
                i9 = 0;
            }
            int i23 = i22 + i9;
            if (downloadRequest.doc_info != null) {
                i10 = DocInfo.ADAPTER.encodedSizeWithTag(14, downloadRequest.doc_info);
            } else {
                i10 = 0;
            }
            int i24 = i23 + i10;
            if (downloadRequest.disable_cdn_download != null) {
                i11 = ProtoAdapter.BOOL.encodedSizeWithTag(15, downloadRequest.disable_cdn_download);
            } else {
                i11 = 0;
            }
            int i25 = i24 + i11;
            if (downloadRequest.reverse_order != null) {
                i12 = ProtoAdapter.BOOL.encodedSizeWithTag(16, downloadRequest.reverse_order);
            } else {
                i12 = 0;
            }
            int encodedSizeWithTag2 = i25 + i12 + this.f47582a.encodedSizeWithTag(17, downloadRequest.tea_params);
            if (downloadRequest.disable_cover_retry != null) {
                i13 = ProtoAdapter.BOOL.encodedSizeWithTag(18, downloadRequest.disable_cover_retry);
            } else {
                i13 = 0;
            }
            int i26 = encodedSizeWithTag2 + i13;
            if (downloadRequest.extra != null) {
                i14 = ProtoAdapter.STRING.encodedSizeWithTag(19, downloadRequest.extra);
            }
            return i26 + i14 + downloadRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DownloadRequest decode(ProtoReader protoReader) throws IOException {
            C19351a aVar = new C19351a();
            aVar.f47563a = "";
            aVar.f47564b = "";
            aVar.f47565c = "";
            aVar.f47566d = "";
            aVar.f47567e = false;
            aVar.f47568f = 0;
            aVar.f47569g = "";
            aVar.f47570h = false;
            aVar.f47571i = true;
            aVar.f47572j = ApiType.DRIVE;
            aVar.f47574l = "";
            aVar.f47575m = DownloadScene.unknown;
            aVar.f47577o = false;
            aVar.f47578p = true;
            aVar.f47580r = false;
            aVar.f47581s = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f47563a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f47564b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f47565c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f47566d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f47567e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f47568f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            aVar.f47569g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f47570h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            aVar.f47571i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 10:
                            try {
                                aVar.f47572j = ApiType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 11:
                            aVar.f47573k = CoverDownloadInfo.ADAPTER.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f47574l = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 13:
                            try {
                                aVar.f47575m = DownloadScene.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 14:
                            aVar.f47576n = DocInfo.ADAPTER.decode(protoReader);
                            break;
                        case 15:
                            aVar.f47577o = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 16:
                            aVar.f47578p = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 17:
                            aVar.f47579q.putAll(this.f47582a.decode(protoReader));
                            break;
                        case 18:
                            aVar.f47580r = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 19:
                            aVar.f47581s = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, DownloadRequest downloadRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, downloadRequest.local_path);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, downloadRequest.file_token);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, downloadRequest.mount_node_point);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, downloadRequest.mount_point);
            if (downloadRequest.auto_suffix != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, downloadRequest.auto_suffix);
            }
            if (downloadRequest.priority != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, downloadRequest.priority);
            }
            if (downloadRequest.data_version != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, downloadRequest.data_version);
            }
            if (downloadRequest.relative_path != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, downloadRequest.relative_path);
            }
            if (downloadRequest.with_slice != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, downloadRequest.with_slice);
            }
            if (downloadRequest.api_type != null) {
                ApiType.ADAPTER.encodeWithTag(protoWriter, 10, downloadRequest.api_type);
            }
            if (downloadRequest.cover_info != null) {
                CoverDownloadInfo.ADAPTER.encodeWithTag(protoWriter, 11, downloadRequest.cover_info);
            }
            if (downloadRequest.unique_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, downloadRequest.unique_key);
            }
            if (downloadRequest.scene != null) {
                DownloadScene.ADAPTER.encodeWithTag(protoWriter, 13, downloadRequest.scene);
            }
            if (downloadRequest.doc_info != null) {
                DocInfo.ADAPTER.encodeWithTag(protoWriter, 14, downloadRequest.doc_info);
            }
            if (downloadRequest.disable_cdn_download != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 15, downloadRequest.disable_cdn_download);
            }
            if (downloadRequest.reverse_order != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 16, downloadRequest.reverse_order);
            }
            this.f47582a.encodeWithTag(protoWriter, 17, downloadRequest.tea_params);
            if (downloadRequest.disable_cover_retry != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 18, downloadRequest.disable_cover_retry);
            }
            if (downloadRequest.extra != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 19, downloadRequest.extra);
            }
            protoWriter.writeBytes(downloadRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19351a newBuilder() {
        C19351a aVar = new C19351a();
        aVar.f47563a = this.local_path;
        aVar.f47564b = this.file_token;
        aVar.f47565c = this.mount_node_point;
        aVar.f47566d = this.mount_point;
        aVar.f47567e = this.auto_suffix;
        aVar.f47568f = this.priority;
        aVar.f47569g = this.data_version;
        aVar.f47570h = this.relative_path;
        aVar.f47571i = this.with_slice;
        aVar.f47572j = this.api_type;
        aVar.f47573k = this.cover_info;
        aVar.f47574l = this.unique_key;
        aVar.f47575m = this.scene;
        aVar.f47576n = this.doc_info;
        aVar.f47577o = this.disable_cdn_download;
        aVar.f47578p = this.reverse_order;
        aVar.f47579q = Internal.copyOf("tea_params", this.tea_params);
        aVar.f47580r = this.disable_cover_retry;
        aVar.f47581s = this.extra;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.DownloadRequest$a */
    public static final class C19351a extends Message.Builder<DownloadRequest, C19351a> {

        /* renamed from: a */
        public String f47563a;

        /* renamed from: b */
        public String f47564b;

        /* renamed from: c */
        public String f47565c;

        /* renamed from: d */
        public String f47566d;

        /* renamed from: e */
        public Boolean f47567e;

        /* renamed from: f */
        public Integer f47568f;

        /* renamed from: g */
        public String f47569g;

        /* renamed from: h */
        public Boolean f47570h;

        /* renamed from: i */
        public Boolean f47571i;

        /* renamed from: j */
        public ApiType f47572j;

        /* renamed from: k */
        public CoverDownloadInfo f47573k;

        /* renamed from: l */
        public String f47574l;

        /* renamed from: m */
        public DownloadScene f47575m;

        /* renamed from: n */
        public DocInfo f47576n;

        /* renamed from: o */
        public Boolean f47577o;

        /* renamed from: p */
        public Boolean f47578p;

        /* renamed from: q */
        public Map<String, String> f47579q = Internal.newMutableMap();

        /* renamed from: r */
        public Boolean f47580r;

        /* renamed from: s */
        public String f47581s;

        /* renamed from: a */
        public DownloadRequest build() {
            String str;
            String str2;
            String str3;
            String str4 = this.f47563a;
            if (str4 != null && (str = this.f47564b) != null && (str2 = this.f47565c) != null && (str3 = this.f47566d) != null) {
                return new DownloadRequest(str4, str, str2, str3, this.f47567e, this.f47568f, this.f47569g, this.f47570h, this.f47571i, this.f47572j, this.f47573k, this.f47574l, this.f47575m, this.f47576n, this.f47577o, this.f47578p, this.f47579q, this.f47580r, this.f47581s, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str4, "local_path", this.f47564b, "file_token", this.f47565c, "mount_node_point", this.f47566d, "mount_point");
        }

        /* renamed from: a */
        public C19351a mo65928a(CoverDownloadInfo coverDownloadInfo) {
            this.f47573k = coverDownloadInfo;
            return this;
        }

        /* renamed from: b */
        public C19351a mo65935b(Boolean bool) {
            this.f47580r = bool;
            return this;
        }

        /* renamed from: c */
        public C19351a mo65937c(String str) {
            this.f47565c = str;
            return this;
        }

        /* renamed from: d */
        public C19351a mo65938d(String str) {
            this.f47566d = str;
            return this;
        }

        /* renamed from: e */
        public C19351a mo65939e(String str) {
            this.f47569g = str;
            return this;
        }

        /* renamed from: f */
        public C19351a mo65940f(String str) {
            this.f47581s = str;
            return this;
        }

        /* renamed from: a */
        public C19351a mo65929a(DocInfo docInfo) {
            this.f47576n = docInfo;
            return this;
        }

        /* renamed from: b */
        public C19351a mo65936b(String str) {
            this.f47564b = str;
            return this;
        }

        /* renamed from: a */
        public C19351a mo65930a(ApiType apiType) {
            this.f47572j = apiType;
            return this;
        }

        /* renamed from: a */
        public C19351a mo65931a(Boolean bool) {
            this.f47577o = bool;
            return this;
        }

        /* renamed from: a */
        public C19351a mo65932a(Integer num) {
            this.f47568f = num;
            return this;
        }

        /* renamed from: a */
        public C19351a mo65933a(String str) {
            this.f47563a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "DownloadRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", local_path=");
        sb.append(this.local_path);
        sb.append(", file_token=");
        sb.append(this.file_token);
        sb.append(", mount_node_point=");
        sb.append(this.mount_node_point);
        sb.append(", mount_point=");
        sb.append(this.mount_point);
        if (this.auto_suffix != null) {
            sb.append(", auto_suffix=");
            sb.append(this.auto_suffix);
        }
        if (this.priority != null) {
            sb.append(", priority=");
            sb.append(this.priority);
        }
        if (this.data_version != null) {
            sb.append(", data_version=");
            sb.append(this.data_version);
        }
        if (this.relative_path != null) {
            sb.append(", relative_path=");
            sb.append(this.relative_path);
        }
        if (this.with_slice != null) {
            sb.append(", with_slice=");
            sb.append(this.with_slice);
        }
        if (this.api_type != null) {
            sb.append(", api_type=");
            sb.append(this.api_type);
        }
        if (this.cover_info != null) {
            sb.append(", cover_info=");
            sb.append(this.cover_info);
        }
        if (this.unique_key != null) {
            sb.append(", unique_key=");
            sb.append(this.unique_key);
        }
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        if (this.doc_info != null) {
            sb.append(", doc_info=");
            sb.append(this.doc_info);
        }
        if (this.disable_cdn_download != null) {
            sb.append(", disable_cdn_download=");
            sb.append(this.disable_cdn_download);
        }
        if (this.reverse_order != null) {
            sb.append(", reverse_order=");
            sb.append(this.reverse_order);
        }
        if (!this.tea_params.isEmpty()) {
            sb.append(", tea_params=");
            sb.append(this.tea_params);
        }
        if (this.disable_cover_retry != null) {
            sb.append(", disable_cover_retry=");
            sb.append(this.disable_cover_retry);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        StringBuilder replace = sb.replace(0, 2, "DownloadRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DownloadRequest(String str, String str2, String str3, String str4, Boolean bool, Integer num, String str5, Boolean bool2, Boolean bool3, ApiType apiType, CoverDownloadInfo coverDownloadInfo, String str6, DownloadScene downloadScene, DocInfo docInfo, Boolean bool4, Boolean bool5, Map<String, String> map, Boolean bool6, String str7) {
        this(str, str2, str3, str4, bool, num, str5, bool2, bool3, apiType, coverDownloadInfo, str6, downloadScene, docInfo, bool4, bool5, map, bool6, str7, ByteString.EMPTY);
    }

    public DownloadRequest(String str, String str2, String str3, String str4, Boolean bool, Integer num, String str5, Boolean bool2, Boolean bool3, ApiType apiType, CoverDownloadInfo coverDownloadInfo, String str6, DownloadScene downloadScene, DocInfo docInfo, Boolean bool4, Boolean bool5, Map<String, String> map, Boolean bool6, String str7, ByteString byteString) {
        super(ADAPTER, byteString);
        this.local_path = str;
        this.file_token = str2;
        this.mount_node_point = str3;
        this.mount_point = str4;
        this.auto_suffix = bool;
        this.priority = num;
        this.data_version = str5;
        this.relative_path = bool2;
        this.with_slice = bool3;
        this.api_type = apiType;
        this.cover_info = coverDownloadInfo;
        this.unique_key = str6;
        this.scene = downloadScene;
        this.doc_info = docInfo;
        this.disable_cdn_download = bool4;
        this.reverse_order = bool5;
        this.tea_params = Internal.immutableCopyOf("tea_params", map);
        this.disable_cover_retry = bool6;
        this.extra = str7;
    }
}
