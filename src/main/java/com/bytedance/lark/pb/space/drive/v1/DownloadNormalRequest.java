package com.bytedance.lark.pb.space.drive.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class DownloadNormalRequest extends Message<DownloadNormalRequest, C19341a> {
    public static final ProtoAdapter<DownloadNormalRequest> ADAPTER = new C19342b();
    public static final Integer DEFAULT_PRIORITY = 0;
    public static final Boolean DEFAULT_RELATIVE_PATH = false;
    public static final Boolean DEFAULT_REVERSE_ORDER = true;
    public static final Boolean DEFAULT_WITH_SLICE = false;
    private static final long serialVersionUID = 0;
    public final String data_version;
    public final String extra;
    public final String file_size;
    public final String local_path;
    public final Integer priority;
    public final Boolean relative_path;
    public final String remote_url;
    public final Boolean reverse_order;
    public final Map<String, String> tea_params;
    public final Boolean with_slice;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.DownloadNormalRequest$b */
    private static final class C19342b extends ProtoAdapter<DownloadNormalRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f47545a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C19342b() {
            super(FieldEncoding.LENGTH_DELIMITED, DownloadNormalRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DownloadNormalRequest downloadNormalRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, downloadNormalRequest.local_path) + ProtoAdapter.STRING.encodedSizeWithTag(2, downloadNormalRequest.remote_url);
            int i7 = 0;
            if (downloadNormalRequest.priority != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(3, downloadNormalRequest.priority);
            } else {
                i = 0;
            }
            int i8 = encodedSizeWithTag + i;
            if (downloadNormalRequest.data_version != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, downloadNormalRequest.data_version);
            } else {
                i2 = 0;
            }
            int i9 = i8 + i2;
            if (downloadNormalRequest.relative_path != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(5, downloadNormalRequest.relative_path);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (downloadNormalRequest.with_slice != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(6, downloadNormalRequest.with_slice);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (downloadNormalRequest.file_size != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(7, downloadNormalRequest.file_size);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (downloadNormalRequest.reverse_order != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(8, downloadNormalRequest.reverse_order);
            } else {
                i6 = 0;
            }
            int encodedSizeWithTag2 = i12 + i6 + this.f47545a.encodedSizeWithTag(9, downloadNormalRequest.tea_params);
            if (downloadNormalRequest.extra != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(10, downloadNormalRequest.extra);
            }
            return encodedSizeWithTag2 + i7 + downloadNormalRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DownloadNormalRequest decode(ProtoReader protoReader) throws IOException {
            C19341a aVar = new C19341a();
            aVar.f47535a = "";
            aVar.f47536b = "";
            aVar.f47537c = 0;
            aVar.f47538d = "";
            aVar.f47539e = false;
            aVar.f47540f = false;
            aVar.f47541g = "";
            aVar.f47542h = true;
            aVar.f47544j = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f47535a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f47536b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f47537c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            aVar.f47538d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f47539e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f47540f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f47541g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f47542h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            aVar.f47543i.putAll(this.f47545a.decode(protoReader));
                            break;
                        case 10:
                            aVar.f47544j = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, DownloadNormalRequest downloadNormalRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, downloadNormalRequest.local_path);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, downloadNormalRequest.remote_url);
            if (downloadNormalRequest.priority != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, downloadNormalRequest.priority);
            }
            if (downloadNormalRequest.data_version != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, downloadNormalRequest.data_version);
            }
            if (downloadNormalRequest.relative_path != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, downloadNormalRequest.relative_path);
            }
            if (downloadNormalRequest.with_slice != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, downloadNormalRequest.with_slice);
            }
            if (downloadNormalRequest.file_size != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, downloadNormalRequest.file_size);
            }
            if (downloadNormalRequest.reverse_order != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, downloadNormalRequest.reverse_order);
            }
            this.f47545a.encodeWithTag(protoWriter, 9, downloadNormalRequest.tea_params);
            if (downloadNormalRequest.extra != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, downloadNormalRequest.extra);
            }
            protoWriter.writeBytes(downloadNormalRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.DownloadNormalRequest$a */
    public static final class C19341a extends Message.Builder<DownloadNormalRequest, C19341a> {

        /* renamed from: a */
        public String f47535a;

        /* renamed from: b */
        public String f47536b;

        /* renamed from: c */
        public Integer f47537c;

        /* renamed from: d */
        public String f47538d;

        /* renamed from: e */
        public Boolean f47539e;

        /* renamed from: f */
        public Boolean f47540f;

        /* renamed from: g */
        public String f47541g;

        /* renamed from: h */
        public Boolean f47542h;

        /* renamed from: i */
        public Map<String, String> f47543i = Internal.newMutableMap();

        /* renamed from: j */
        public String f47544j;

        /* renamed from: a */
        public DownloadNormalRequest build() {
            String str;
            String str2 = this.f47535a;
            if (str2 != null && (str = this.f47536b) != null) {
                return new DownloadNormalRequest(str2, str, this.f47537c, this.f47538d, this.f47539e, this.f47540f, this.f47541g, this.f47542h, this.f47543i, this.f47544j, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "local_path", this.f47536b, "remote_url");
        }

        /* renamed from: a */
        public C19341a mo65901a(Boolean bool) {
            this.f47540f = bool;
            return this;
        }

        /* renamed from: b */
        public C19341a mo65905b(String str) {
            this.f47536b = str;
            return this;
        }

        /* renamed from: c */
        public C19341a mo65906c(String str) {
            this.f47538d = str;
            return this;
        }

        /* renamed from: d */
        public C19341a mo65907d(String str) {
            this.f47541g = str;
            return this;
        }

        /* renamed from: e */
        public C19341a mo65908e(String str) {
            this.f47544j = str;
            return this;
        }

        /* renamed from: a */
        public C19341a mo65902a(Integer num) {
            this.f47537c = num;
            return this;
        }

        /* renamed from: a */
        public C19341a mo65903a(String str) {
            this.f47535a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19341a newBuilder() {
        C19341a aVar = new C19341a();
        aVar.f47535a = this.local_path;
        aVar.f47536b = this.remote_url;
        aVar.f47537c = this.priority;
        aVar.f47538d = this.data_version;
        aVar.f47539e = this.relative_path;
        aVar.f47540f = this.with_slice;
        aVar.f47541g = this.file_size;
        aVar.f47542h = this.reverse_order;
        aVar.f47543i = Internal.copyOf("tea_params", this.tea_params);
        aVar.f47544j = this.extra;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "DownloadNormalRequest");
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
        StringBuilder replace = sb.replace(0, 2, "DownloadNormalRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DownloadNormalRequest(String str, String str2, Integer num, String str3, Boolean bool, Boolean bool2, String str4, Boolean bool3, Map<String, String> map, String str5) {
        this(str, str2, num, str3, bool, bool2, str4, bool3, map, str5, ByteString.EMPTY);
    }

    public DownloadNormalRequest(String str, String str2, Integer num, String str3, Boolean bool, Boolean bool2, String str4, Boolean bool3, Map<String, String> map, String str5, ByteString byteString) {
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
    }
}
