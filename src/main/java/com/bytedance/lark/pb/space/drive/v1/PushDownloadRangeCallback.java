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
import java.util.List;
import okio.ByteString;

public final class PushDownloadRangeCallback extends Message<PushDownloadRangeCallback, C19377a> {
    public static final ProtoAdapter<PushDownloadRangeCallback> ADAPTER = new C19378b();
    public static final DownloadScene DEFAULT_SCENE = DownloadScene.unknown;
    public static final Status DEFAULT_STATUS = Status.PENDING;
    private static final long serialVersionUID = 0;
    public final String bytes_total;
    public final String bytes_transferred;
    public final String data_version;
    public final List<DownloadRange> downloaded_ranges;
    public final DownloadFailedInfo failed_info;
    public final String file_name;
    public final String file_path;
    public final String file_type;
    public final String key;
    public final String mime_type;
    public final String mount_node_point;
    public final String mount_point;
    public final DownloadScene scene;
    public final Status status;

    public enum Status implements WireEnum {
        PENDING(0),
        INFLIGHT(1),
        FAILED(2),
        SUCCESS(3),
        QUEUE(4),
        READY(5),
        CANCEL(6),
        RANGE_FINISH(7);
        
        public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Status fromValue(int i) {
            switch (i) {
                case 0:
                    return PENDING;
                case 1:
                    return INFLIGHT;
                case 2:
                    return FAILED;
                case 3:
                    return SUCCESS;
                case 4:
                    return QUEUE;
                case 5:
                    return READY;
                case 6:
                    return CANCEL;
                case 7:
                    return RANGE_FINISH;
                default:
                    return null;
            }
        }

        private Status(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.PushDownloadRangeCallback$b */
    private static final class C19378b extends ProtoAdapter<PushDownloadRangeCallback> {
        C19378b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushDownloadRangeCallback.class);
        }

        /* renamed from: a */
        public int encodedSize(PushDownloadRangeCallback pushDownloadRangeCallback) {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, pushDownloadRangeCallback.key);
            int i12 = 0;
            if (pushDownloadRangeCallback.status != null) {
                i = Status.ADAPTER.encodedSizeWithTag(2, pushDownloadRangeCallback.status);
            } else {
                i = 0;
            }
            int i13 = encodedSizeWithTag + i;
            if (pushDownloadRangeCallback.bytes_transferred != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, pushDownloadRangeCallback.bytes_transferred);
            } else {
                i2 = 0;
            }
            int i14 = i13 + i2;
            if (pushDownloadRangeCallback.bytes_total != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, pushDownloadRangeCallback.bytes_total);
            } else {
                i3 = 0;
            }
            int i15 = i14 + i3;
            if (pushDownloadRangeCallback.failed_info != null) {
                i4 = DownloadFailedInfo.ADAPTER.encodedSizeWithTag(5, pushDownloadRangeCallback.failed_info);
            } else {
                i4 = 0;
            }
            int i16 = i15 + i4;
            if (pushDownloadRangeCallback.file_name != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, pushDownloadRangeCallback.file_name);
            } else {
                i5 = 0;
            }
            int i17 = i16 + i5;
            if (pushDownloadRangeCallback.file_type != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, pushDownloadRangeCallback.file_type);
            } else {
                i6 = 0;
            }
            int i18 = i17 + i6;
            if (pushDownloadRangeCallback.file_path != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(8, pushDownloadRangeCallback.file_path);
            } else {
                i7 = 0;
            }
            int i19 = i18 + i7;
            if (pushDownloadRangeCallback.data_version != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(9, pushDownloadRangeCallback.data_version);
            } else {
                i8 = 0;
            }
            int i20 = i19 + i8;
            if (pushDownloadRangeCallback.mount_node_point != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(10, pushDownloadRangeCallback.mount_node_point);
            } else {
                i9 = 0;
            }
            int i21 = i20 + i9;
            if (pushDownloadRangeCallback.mount_point != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(11, pushDownloadRangeCallback.mount_point);
            } else {
                i10 = 0;
            }
            int i22 = i21 + i10;
            if (pushDownloadRangeCallback.mime_type != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(12, pushDownloadRangeCallback.mime_type);
            } else {
                i11 = 0;
            }
            int i23 = i22 + i11;
            if (pushDownloadRangeCallback.scene != null) {
                i12 = DownloadScene.ADAPTER.encodedSizeWithTag(13, pushDownloadRangeCallback.scene);
            }
            return i23 + i12 + DownloadRange.ADAPTER.asRepeated().encodedSizeWithTag(14, pushDownloadRangeCallback.downloaded_ranges) + pushDownloadRangeCallback.unknownFields().size();
        }

        /* renamed from: a */
        public PushDownloadRangeCallback decode(ProtoReader protoReader) throws IOException {
            C19377a aVar = new C19377a();
            aVar.f47651a = "";
            aVar.f47652b = Status.PENDING;
            aVar.f47653c = "";
            aVar.f47654d = "";
            aVar.f47656f = "";
            aVar.f47657g = "";
            aVar.f47658h = "";
            aVar.f47659i = "";
            aVar.f47660j = "";
            aVar.f47661k = "";
            aVar.f47662l = "";
            aVar.f47663m = DownloadScene.unknown;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f47651a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f47652b = Status.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f47653c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f47654d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f47655e = DownloadFailedInfo.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f47656f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f47657g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f47658h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f47659i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f47660j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f47661k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f47662l = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 13:
                            try {
                                aVar.f47663m = DownloadScene.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 14:
                            aVar.f47664n.add(DownloadRange.ADAPTER.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, PushDownloadRangeCallback pushDownloadRangeCallback) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushDownloadRangeCallback.key);
            if (pushDownloadRangeCallback.status != null) {
                Status.ADAPTER.encodeWithTag(protoWriter, 2, pushDownloadRangeCallback.status);
            }
            if (pushDownloadRangeCallback.bytes_transferred != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, pushDownloadRangeCallback.bytes_transferred);
            }
            if (pushDownloadRangeCallback.bytes_total != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, pushDownloadRangeCallback.bytes_total);
            }
            if (pushDownloadRangeCallback.failed_info != null) {
                DownloadFailedInfo.ADAPTER.encodeWithTag(protoWriter, 5, pushDownloadRangeCallback.failed_info);
            }
            if (pushDownloadRangeCallback.file_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, pushDownloadRangeCallback.file_name);
            }
            if (pushDownloadRangeCallback.file_type != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, pushDownloadRangeCallback.file_type);
            }
            if (pushDownloadRangeCallback.file_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, pushDownloadRangeCallback.file_path);
            }
            if (pushDownloadRangeCallback.data_version != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, pushDownloadRangeCallback.data_version);
            }
            if (pushDownloadRangeCallback.mount_node_point != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, pushDownloadRangeCallback.mount_node_point);
            }
            if (pushDownloadRangeCallback.mount_point != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, pushDownloadRangeCallback.mount_point);
            }
            if (pushDownloadRangeCallback.mime_type != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, pushDownloadRangeCallback.mime_type);
            }
            if (pushDownloadRangeCallback.scene != null) {
                DownloadScene.ADAPTER.encodeWithTag(protoWriter, 13, pushDownloadRangeCallback.scene);
            }
            DownloadRange.ADAPTER.asRepeated().encodeWithTag(protoWriter, 14, pushDownloadRangeCallback.downloaded_ranges);
            protoWriter.writeBytes(pushDownloadRangeCallback.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.PushDownloadRangeCallback$a */
    public static final class C19377a extends Message.Builder<PushDownloadRangeCallback, C19377a> {

        /* renamed from: a */
        public String f47651a;

        /* renamed from: b */
        public Status f47652b;

        /* renamed from: c */
        public String f47653c;

        /* renamed from: d */
        public String f47654d;

        /* renamed from: e */
        public DownloadFailedInfo f47655e;

        /* renamed from: f */
        public String f47656f;

        /* renamed from: g */
        public String f47657g;

        /* renamed from: h */
        public String f47658h;

        /* renamed from: i */
        public String f47659i;

        /* renamed from: j */
        public String f47660j;

        /* renamed from: k */
        public String f47661k;

        /* renamed from: l */
        public String f47662l;

        /* renamed from: m */
        public DownloadScene f47663m;

        /* renamed from: n */
        public List<DownloadRange> f47664n = Internal.newMutableList();

        /* renamed from: a */
        public PushDownloadRangeCallback build() {
            String str = this.f47651a;
            if (str != null) {
                return new PushDownloadRangeCallback(str, this.f47652b, this.f47653c, this.f47654d, this.f47655e, this.f47656f, this.f47657g, this.f47658h, this.f47659i, this.f47660j, this.f47661k, this.f47662l, this.f47663m, this.f47664n, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "key");
        }
    }

    @Override // com.squareup.wire.Message
    public C19377a newBuilder() {
        C19377a aVar = new C19377a();
        aVar.f47651a = this.key;
        aVar.f47652b = this.status;
        aVar.f47653c = this.bytes_transferred;
        aVar.f47654d = this.bytes_total;
        aVar.f47655e = this.failed_info;
        aVar.f47656f = this.file_name;
        aVar.f47657g = this.file_type;
        aVar.f47658h = this.file_path;
        aVar.f47659i = this.data_version;
        aVar.f47660j = this.mount_node_point;
        aVar.f47661k = this.mount_point;
        aVar.f47662l = this.mime_type;
        aVar.f47663m = this.scene;
        aVar.f47664n = Internal.copyOf("downloaded_ranges", this.downloaded_ranges);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "PushDownloadRangeCallback");
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.bytes_transferred != null) {
            sb.append(", bytes_transferred=");
            sb.append(this.bytes_transferred);
        }
        if (this.bytes_total != null) {
            sb.append(", bytes_total=");
            sb.append(this.bytes_total);
        }
        if (this.failed_info != null) {
            sb.append(", failed_info=");
            sb.append(this.failed_info);
        }
        if (this.file_name != null) {
            sb.append(", file_name=");
            sb.append(this.file_name);
        }
        if (this.file_type != null) {
            sb.append(", file_type=");
            sb.append(this.file_type);
        }
        if (this.file_path != null) {
            sb.append(", file_path=");
            sb.append(this.file_path);
        }
        if (this.data_version != null) {
            sb.append(", data_version=");
            sb.append(this.data_version);
        }
        if (this.mount_node_point != null) {
            sb.append(", mount_node_point=");
            sb.append(this.mount_node_point);
        }
        if (this.mount_point != null) {
            sb.append(", mount_point=");
            sb.append(this.mount_point);
        }
        if (this.mime_type != null) {
            sb.append(", mime_type=");
            sb.append(this.mime_type);
        }
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        if (!this.downloaded_ranges.isEmpty()) {
            sb.append(", downloaded_ranges=");
            sb.append(this.downloaded_ranges);
        }
        StringBuilder replace = sb.replace(0, 2, "PushDownloadRangeCallback{");
        replace.append('}');
        return replace.toString();
    }

    public PushDownloadRangeCallback(String str, Status status2, String str2, String str3, DownloadFailedInfo downloadFailedInfo, String str4, String str5, String str6, String str7, String str8, String str9, String str10, DownloadScene downloadScene, List<DownloadRange> list) {
        this(str, status2, str2, str3, downloadFailedInfo, str4, str5, str6, str7, str8, str9, str10, downloadScene, list, ByteString.EMPTY);
    }

    public PushDownloadRangeCallback(String str, Status status2, String str2, String str3, DownloadFailedInfo downloadFailedInfo, String str4, String str5, String str6, String str7, String str8, String str9, String str10, DownloadScene downloadScene, List<DownloadRange> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.status = status2;
        this.bytes_transferred = str2;
        this.bytes_total = str3;
        this.failed_info = downloadFailedInfo;
        this.file_name = str4;
        this.file_type = str5;
        this.file_path = str6;
        this.data_version = str7;
        this.mount_node_point = str8;
        this.mount_point = str9;
        this.mime_type = str10;
        this.scene = downloadScene;
        this.downloaded_ranges = Internal.immutableCopyOf("downloaded_ranges", list);
    }
}
