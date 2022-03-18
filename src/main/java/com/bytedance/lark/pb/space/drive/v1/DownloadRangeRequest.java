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
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class DownloadRangeRequest extends Message<DownloadRangeRequest, C19347a> {
    public static final ProtoAdapter<DownloadRangeRequest> ADAPTER = new C19348b();
    public static final Integer DEFAULT_PRIORITY = 0;
    public static final Boolean DEFAULT_RELATIVE_PATH = false;
    public static final Boolean DEFAULT_REVERSE_ORDER = true;
    public static final Boolean DEFAULT_WITH_SLICE = true;
    private static final long serialVersionUID = 0;
    public final String data_version;
    public final List<DownloadRange> download_ranges;
    public final String extra;
    public final String file_size;
    public final String file_token;
    public final String local_path;
    public final Integer priority;
    public final Boolean relative_path;
    public final String remote_url;
    public final Boolean reverse_order;
    public final Map<String, String> tea_params;
    public final Boolean with_slice;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.DownloadRangeRequest$b */
    private static final class C19348b extends ProtoAdapter<DownloadRangeRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f47561a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C19348b() {
            super(FieldEncoding.LENGTH_DELIMITED, DownloadRangeRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DownloadRangeRequest downloadRangeRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, downloadRangeRequest.local_path) + ProtoAdapter.STRING.encodedSizeWithTag(2, downloadRangeRequest.remote_url);
            int i7 = 0;
            if (downloadRangeRequest.priority != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(3, downloadRangeRequest.priority);
            } else {
                i = 0;
            }
            int i8 = encodedSizeWithTag + i;
            if (downloadRangeRequest.data_version != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, downloadRangeRequest.data_version);
            } else {
                i2 = 0;
            }
            int i9 = i8 + i2;
            if (downloadRangeRequest.relative_path != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(5, downloadRangeRequest.relative_path);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (downloadRangeRequest.with_slice != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(6, downloadRangeRequest.with_slice);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (downloadRangeRequest.file_size != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(7, downloadRangeRequest.file_size);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (downloadRangeRequest.reverse_order != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(8, downloadRangeRequest.reverse_order);
            } else {
                i6 = 0;
            }
            int encodedSizeWithTag2 = i12 + i6 + this.f47561a.encodedSizeWithTag(9, downloadRangeRequest.tea_params);
            if (downloadRangeRequest.extra != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(10, downloadRangeRequest.extra);
            }
            return encodedSizeWithTag2 + i7 + DownloadRange.ADAPTER.asRepeated().encodedSizeWithTag(11, downloadRangeRequest.download_ranges) + ProtoAdapter.STRING.encodedSizeWithTag(12, downloadRangeRequest.file_token) + downloadRangeRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DownloadRangeRequest decode(ProtoReader protoReader) throws IOException {
            C19347a aVar = new C19347a();
            aVar.f47549a = "";
            aVar.f47550b = "";
            aVar.f47551c = 0;
            aVar.f47552d = "";
            aVar.f47553e = false;
            aVar.f47554f = true;
            aVar.f47555g = "";
            aVar.f47556h = true;
            aVar.f47558j = "";
            aVar.f47560l = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f47549a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f47550b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f47551c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            aVar.f47552d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f47553e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f47554f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f47555g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f47556h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            aVar.f47557i.putAll(this.f47561a.decode(protoReader));
                            break;
                        case 10:
                            aVar.f47558j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f47559k.add(DownloadRange.ADAPTER.decode(protoReader));
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f47560l = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, DownloadRangeRequest downloadRangeRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, downloadRangeRequest.local_path);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, downloadRangeRequest.remote_url);
            if (downloadRangeRequest.priority != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, downloadRangeRequest.priority);
            }
            if (downloadRangeRequest.data_version != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, downloadRangeRequest.data_version);
            }
            if (downloadRangeRequest.relative_path != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, downloadRangeRequest.relative_path);
            }
            if (downloadRangeRequest.with_slice != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, downloadRangeRequest.with_slice);
            }
            if (downloadRangeRequest.file_size != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, downloadRangeRequest.file_size);
            }
            if (downloadRangeRequest.reverse_order != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, downloadRangeRequest.reverse_order);
            }
            this.f47561a.encodeWithTag(protoWriter, 9, downloadRangeRequest.tea_params);
            if (downloadRangeRequest.extra != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, downloadRangeRequest.extra);
            }
            DownloadRange.ADAPTER.asRepeated().encodeWithTag(protoWriter, 11, downloadRangeRequest.download_ranges);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, downloadRangeRequest.file_token);
            protoWriter.writeBytes(downloadRangeRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.DownloadRangeRequest$a */
    public static final class C19347a extends Message.Builder<DownloadRangeRequest, C19347a> {

        /* renamed from: a */
        public String f47549a;

        /* renamed from: b */
        public String f47550b;

        /* renamed from: c */
        public Integer f47551c;

        /* renamed from: d */
        public String f47552d;

        /* renamed from: e */
        public Boolean f47553e;

        /* renamed from: f */
        public Boolean f47554f;

        /* renamed from: g */
        public String f47555g;

        /* renamed from: h */
        public Boolean f47556h;

        /* renamed from: i */
        public Map<String, String> f47557i = Internal.newMutableMap();

        /* renamed from: j */
        public String f47558j;

        /* renamed from: k */
        public List<DownloadRange> f47559k = Internal.newMutableList();

        /* renamed from: l */
        public String f47560l;

        /* renamed from: a */
        public DownloadRangeRequest build() {
            String str;
            String str2;
            String str3 = this.f47549a;
            if (str3 != null && (str = this.f47550b) != null && (str2 = this.f47560l) != null) {
                return new DownloadRangeRequest(str3, str, this.f47551c, this.f47552d, this.f47553e, this.f47554f, this.f47555g, this.f47556h, this.f47557i, this.f47558j, this.f47559k, str2, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str3, "local_path", this.f47550b, "remote_url", this.f47560l, "file_token");
        }
    }

    @Override // com.squareup.wire.Message
    public C19347a newBuilder() {
        C19347a aVar = new C19347a();
        aVar.f47549a = this.local_path;
        aVar.f47550b = this.remote_url;
        aVar.f47551c = this.priority;
        aVar.f47552d = this.data_version;
        aVar.f47553e = this.relative_path;
        aVar.f47554f = this.with_slice;
        aVar.f47555g = this.file_size;
        aVar.f47556h = this.reverse_order;
        aVar.f47557i = Internal.copyOf("tea_params", this.tea_params);
        aVar.f47558j = this.extra;
        aVar.f47559k = Internal.copyOf("download_ranges", this.download_ranges);
        aVar.f47560l = this.file_token;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "DownloadRangeRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", local_path=");
        sb.append(this.local_path);
        sb.append(", remote_url=");
        sb.append(this.remote_url);
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
        if (this.file_size != null) {
            sb.append(", file_size=");
            sb.append(this.file_size);
        }
        if (this.reverse_order != null) {
            sb.append(", reverse_order=");
            sb.append(this.reverse_order);
        }
        if (!this.tea_params.isEmpty()) {
            sb.append(", tea_params=");
            sb.append(this.tea_params);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        if (!this.download_ranges.isEmpty()) {
            sb.append(", download_ranges=");
            sb.append(this.download_ranges);
        }
        sb.append(", file_token=");
        sb.append(this.file_token);
        StringBuilder replace = sb.replace(0, 2, "DownloadRangeRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DownloadRangeRequest(String str, String str2, Integer num, String str3, Boolean bool, Boolean bool2, String str4, Boolean bool3, Map<String, String> map, String str5, List<DownloadRange> list, String str6) {
        this(str, str2, num, str3, bool, bool2, str4, bool3, map, str5, list, str6, ByteString.EMPTY);
    }

    public DownloadRangeRequest(String str, String str2, Integer num, String str3, Boolean bool, Boolean bool2, String str4, Boolean bool3, Map<String, String> map, String str5, List<DownloadRange> list, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.local_path = str;
        this.remote_url = str2;
        this.priority = num;
        this.data_version = str3;
        this.relative_path = bool;
        this.with_slice = bool2;
        this.file_size = str4;
        this.reverse_order = bool3;
        this.tea_params = Internal.immutableCopyOf("tea_params", map);
        this.extra = str5;
        this.download_ranges = Internal.immutableCopyOf("download_ranges", list);
        this.file_token = str6;
    }
}
