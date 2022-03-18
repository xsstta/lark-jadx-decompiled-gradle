package com.bytedance.lark.pb.space.drive.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class DriveRustConfig extends Message<DriveRustConfig, C19361a> {
    public static final ProtoAdapter<DriveRustConfig> ADAPTER = new C19362b();
    public static final Boolean DEFAULT_ENABLE_MULTI_TASK = false;
    public static final Integer DEFAULT_EXCEED_TIME = 1296000;
    public static final Integer DEFAULT_MAX_DOWNLOAD_PART_SIZE = 1048576;
    public static final Integer DEFAULT_MAX_THREAD_SIZE = 3;
    public static final Boolean DEFAULT_MERGE_UPLOAD = false;
    public static final Boolean DEFAULT_NEW_CDN_DOMAIN_SELECT = false;
    public static final Boolean DEFAULT_NOT_SET_FILE_SIZE = false;
    public static final Boolean DEFAULT_PAUSE_BACKGROUND = false;
    public static final Boolean DEFAULT_SMART_CLEAR_DB = false;
    public static final Boolean DEFAULT_USE_RANGE_IN_PART = false;
    public static final Boolean DEFAULT_WEAK_OPTIMIZE = false;
    private static final long serialVersionUID = 0;
    public final Boolean enable_multi_task;
    public final Integer exceed_time;
    public final Map<String, String> headers;
    public final Integer max_download_part_size;
    public final Integer max_thread_size;
    public final Boolean merge_upload;
    public final Boolean new_cdn_domain_select;
    public final Boolean not_set_file_size;
    public final Boolean pause_background;
    public final Boolean smart_clear_db;
    public final Boolean use_range_in_part;
    public final Boolean weak_optimize;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.DriveRustConfig$b */
    private static final class C19362b extends ProtoAdapter<DriveRustConfig> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f47614a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C19362b() {
            super(FieldEncoding.LENGTH_DELIMITED, DriveRustConfig.class);
        }

        /* renamed from: a */
        public int encodedSize(DriveRustConfig driveRustConfig) {
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
            int i11 = 0;
            if (driveRustConfig.enable_multi_task != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, driveRustConfig.enable_multi_task);
            } else {
                i = 0;
            }
            if (driveRustConfig.use_range_in_part != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, driveRustConfig.use_range_in_part);
            } else {
                i2 = 0;
            }
            int i12 = i + i2;
            if (driveRustConfig.weak_optimize != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, driveRustConfig.weak_optimize);
            } else {
                i3 = 0;
            }
            int i13 = i12 + i3;
            if (driveRustConfig.new_cdn_domain_select != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, driveRustConfig.new_cdn_domain_select);
            } else {
                i4 = 0;
            }
            int i14 = i13 + i4;
            if (driveRustConfig.smart_clear_db != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, driveRustConfig.smart_clear_db);
            } else {
                i5 = 0;
            }
            int i15 = i14 + i5;
            if (driveRustConfig.merge_upload != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, driveRustConfig.merge_upload);
            } else {
                i6 = 0;
            }
            int i16 = i15 + i6;
            if (driveRustConfig.max_thread_size != null) {
                i7 = ProtoAdapter.INT32.encodedSizeWithTag(7, driveRustConfig.max_thread_size);
            } else {
                i7 = 0;
            }
            int i17 = i16 + i7;
            if (driveRustConfig.max_download_part_size != null) {
                i8 = ProtoAdapter.INT32.encodedSizeWithTag(8, driveRustConfig.max_download_part_size);
            } else {
                i8 = 0;
            }
            int i18 = i17 + i8;
            if (driveRustConfig.pause_background != null) {
                i9 = ProtoAdapter.BOOL.encodedSizeWithTag(9, driveRustConfig.pause_background);
            } else {
                i9 = 0;
            }
            int encodedSizeWithTag = i18 + i9 + this.f47614a.encodedSizeWithTag(10, driveRustConfig.headers);
            if (driveRustConfig.not_set_file_size != null) {
                i10 = ProtoAdapter.BOOL.encodedSizeWithTag(11, driveRustConfig.not_set_file_size);
            } else {
                i10 = 0;
            }
            int i19 = encodedSizeWithTag + i10;
            if (driveRustConfig.exceed_time != null) {
                i11 = ProtoAdapter.INT32.encodedSizeWithTag(12, driveRustConfig.exceed_time);
            }
            return i19 + i11 + driveRustConfig.unknownFields().size();
        }

        /* renamed from: a */
        public DriveRustConfig decode(ProtoReader protoReader) throws IOException {
            C19361a aVar = new C19361a();
            aVar.f47602a = false;
            aVar.f47603b = false;
            aVar.f47604c = false;
            aVar.f47605d = false;
            aVar.f47606e = false;
            aVar.f47607f = false;
            aVar.f47608g = 3;
            aVar.f47609h = 1048576;
            aVar.f47610i = false;
            aVar.f47612k = false;
            aVar.f47613l = 1296000;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f47602a = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            aVar.f47603b = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            aVar.f47604c = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            aVar.f47605d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f47606e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f47607f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f47608g = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            aVar.f47609h = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 9:
                            aVar.f47610i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 10:
                            aVar.f47611j.putAll(this.f47614a.decode(protoReader));
                            break;
                        case 11:
                            aVar.f47612k = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f47613l = ProtoAdapter.INT32.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, DriveRustConfig driveRustConfig) throws IOException {
            if (driveRustConfig.enable_multi_task != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, driveRustConfig.enable_multi_task);
            }
            if (driveRustConfig.use_range_in_part != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, driveRustConfig.use_range_in_part);
            }
            if (driveRustConfig.weak_optimize != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, driveRustConfig.weak_optimize);
            }
            if (driveRustConfig.new_cdn_domain_select != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, driveRustConfig.new_cdn_domain_select);
            }
            if (driveRustConfig.smart_clear_db != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, driveRustConfig.smart_clear_db);
            }
            if (driveRustConfig.merge_upload != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, driveRustConfig.merge_upload);
            }
            if (driveRustConfig.max_thread_size != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, driveRustConfig.max_thread_size);
            }
            if (driveRustConfig.max_download_part_size != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, driveRustConfig.max_download_part_size);
            }
            if (driveRustConfig.pause_background != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, driveRustConfig.pause_background);
            }
            this.f47614a.encodeWithTag(protoWriter, 10, driveRustConfig.headers);
            if (driveRustConfig.not_set_file_size != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, driveRustConfig.not_set_file_size);
            }
            if (driveRustConfig.exceed_time != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 12, driveRustConfig.exceed_time);
            }
            protoWriter.writeBytes(driveRustConfig.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.DriveRustConfig$a */
    public static final class C19361a extends Message.Builder<DriveRustConfig, C19361a> {

        /* renamed from: a */
        public Boolean f47602a;

        /* renamed from: b */
        public Boolean f47603b;

        /* renamed from: c */
        public Boolean f47604c;

        /* renamed from: d */
        public Boolean f47605d;

        /* renamed from: e */
        public Boolean f47606e;

        /* renamed from: f */
        public Boolean f47607f;

        /* renamed from: g */
        public Integer f47608g;

        /* renamed from: h */
        public Integer f47609h;

        /* renamed from: i */
        public Boolean f47610i;

        /* renamed from: j */
        public Map<String, String> f47611j = Internal.newMutableMap();

        /* renamed from: k */
        public Boolean f47612k;

        /* renamed from: l */
        public Integer f47613l;

        /* renamed from: a */
        public DriveRustConfig build() {
            return new DriveRustConfig(this.f47602a, this.f47603b, this.f47604c, this.f47605d, this.f47606e, this.f47607f, this.f47608g, this.f47609h, this.f47610i, this.f47611j, this.f47612k, this.f47613l, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19361a mo65964a(Boolean bool) {
            this.f47610i = bool;
            return this;
        }

        /* renamed from: b */
        public C19361a mo65967b(Boolean bool) {
            this.f47612k = bool;
            return this;
        }

        /* renamed from: c */
        public C19361a mo65969c(Integer num) {
            this.f47613l = num;
            return this;
        }

        /* renamed from: a */
        public C19361a mo65965a(Integer num) {
            this.f47608g = num;
            return this;
        }

        /* renamed from: b */
        public C19361a mo65968b(Integer num) {
            this.f47609h = num;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19361a newBuilder() {
        C19361a aVar = new C19361a();
        aVar.f47602a = this.enable_multi_task;
        aVar.f47603b = this.use_range_in_part;
        aVar.f47604c = this.weak_optimize;
        aVar.f47605d = this.new_cdn_domain_select;
        aVar.f47606e = this.smart_clear_db;
        aVar.f47607f = this.merge_upload;
        aVar.f47608g = this.max_thread_size;
        aVar.f47609h = this.max_download_part_size;
        aVar.f47610i = this.pause_background;
        aVar.f47611j = Internal.copyOf("headers", this.headers);
        aVar.f47612k = this.not_set_file_size;
        aVar.f47613l = this.exceed_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "DriveRustConfig");
        StringBuilder sb = new StringBuilder();
        if (this.enable_multi_task != null) {
            sb.append(", enable_multi_task=");
            sb.append(this.enable_multi_task);
        }
        if (this.use_range_in_part != null) {
            sb.append(", use_range_in_part=");
            sb.append(this.use_range_in_part);
        }
        if (this.weak_optimize != null) {
            sb.append(", weak_optimize=");
            sb.append(this.weak_optimize);
        }
        if (this.new_cdn_domain_select != null) {
            sb.append(", new_cdn_domain_select=");
            sb.append(this.new_cdn_domain_select);
        }
        if (this.smart_clear_db != null) {
            sb.append(", smart_clear_db=");
            sb.append(this.smart_clear_db);
        }
        if (this.merge_upload != null) {
            sb.append(", merge_upload=");
            sb.append(this.merge_upload);
        }
        if (this.max_thread_size != null) {
            sb.append(", max_thread_size=");
            sb.append(this.max_thread_size);
        }
        if (this.max_download_part_size != null) {
            sb.append(", max_download_part_size=");
            sb.append(this.max_download_part_size);
        }
        if (this.pause_background != null) {
            sb.append(", pause_background=");
            sb.append(this.pause_background);
        }
        if (!this.headers.isEmpty()) {
            sb.append(", headers=");
            sb.append(this.headers);
        }
        if (this.not_set_file_size != null) {
            sb.append(", not_set_file_size=");
            sb.append(this.not_set_file_size);
        }
        if (this.exceed_time != null) {
            sb.append(", exceed_time=");
            sb.append(this.exceed_time);
        }
        StringBuilder replace = sb.replace(0, 2, "DriveRustConfig{");
        replace.append('}');
        return replace.toString();
    }

    public DriveRustConfig(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Integer num, Integer num2, Boolean bool7, Map<String, String> map, Boolean bool8, Integer num3) {
        this(bool, bool2, bool3, bool4, bool5, bool6, num, num2, bool7, map, bool8, num3, ByteString.EMPTY);
    }

    public DriveRustConfig(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Integer num, Integer num2, Boolean bool7, Map<String, String> map, Boolean bool8, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.enable_multi_task = bool;
        this.use_range_in_part = bool2;
        this.weak_optimize = bool3;
        this.new_cdn_domain_select = bool4;
        this.smart_clear_db = bool5;
        this.merge_upload = bool6;
        this.max_thread_size = num;
        this.max_download_part_size = num2;
        this.pause_background = bool7;
        this.headers = Internal.immutableCopyOf("headers", map);
        this.not_set_file_size = bool8;
        this.exceed_time = num3;
    }
}
