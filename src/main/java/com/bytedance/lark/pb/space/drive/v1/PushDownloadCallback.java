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

public final class PushDownloadCallback extends Message<PushDownloadCallback, C19375a> {
    public static final ProtoAdapter<PushDownloadCallback> ADAPTER = new C19376b();
    public static final DownloadScene DEFAULT_SCENE = DownloadScene.unknown;
    public static final Status DEFAULT_STATUS = Status.PENDING;
    private static final long serialVersionUID = 0;
    public final String bytes_total;
    public final String bytes_transferred;
    public final String data_version;
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
        CANCEL(6);
        
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
                default:
                    return null;
            }
        }

        private Status(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.PushDownloadCallback$b */
    private static final class C19376b extends ProtoAdapter<PushDownloadCallback> {
        C19376b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushDownloadCallback.class);
        }

        /* renamed from: a */
        public int encodedSize(PushDownloadCallback pushDownloadCallback) {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, pushDownloadCallback.key);
            int i12 = 0;
            if (pushDownloadCallback.status != null) {
                i = Status.ADAPTER.encodedSizeWithTag(2, pushDownloadCallback.status);
            } else {
                i = 0;
            }
            int i13 = encodedSizeWithTag + i;
            if (pushDownloadCallback.bytes_transferred != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, pushDownloadCallback.bytes_transferred);
            } else {
                i2 = 0;
            }
            int i14 = i13 + i2;
            if (pushDownloadCallback.bytes_total != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, pushDownloadCallback.bytes_total);
            } else {
                i3 = 0;
            }
            int i15 = i14 + i3;
            if (pushDownloadCallback.failed_info != null) {
                i4 = DownloadFailedInfo.ADAPTER.encodedSizeWithTag(5, pushDownloadCallback.failed_info);
            } else {
                i4 = 0;
            }
            int i16 = i15 + i4;
            if (pushDownloadCallback.file_name != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, pushDownloadCallback.file_name);
            } else {
                i5 = 0;
            }
            int i17 = i16 + i5;
            if (pushDownloadCallback.file_type != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, pushDownloadCallback.file_type);
            } else {
                i6 = 0;
            }
            int i18 = i17 + i6;
            if (pushDownloadCallback.file_path != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(8, pushDownloadCallback.file_path);
            } else {
                i7 = 0;
            }
            int i19 = i18 + i7;
            if (pushDownloadCallback.data_version != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(9, pushDownloadCallback.data_version);
            } else {
                i8 = 0;
            }
            int i20 = i19 + i8;
            if (pushDownloadCallback.mount_node_point != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(10, pushDownloadCallback.mount_node_point);
            } else {
                i9 = 0;
            }
            int i21 = i20 + i9;
            if (pushDownloadCallback.mount_point != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(11, pushDownloadCallback.mount_point);
            } else {
                i10 = 0;
            }
            int i22 = i21 + i10;
            if (pushDownloadCallback.mime_type != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(12, pushDownloadCallback.mime_type);
            } else {
                i11 = 0;
            }
            int i23 = i22 + i11;
            if (pushDownloadCallback.scene != null) {
                i12 = DownloadScene.ADAPTER.encodedSizeWithTag(13, pushDownloadCallback.scene);
            }
            return i23 + i12 + pushDownloadCallback.unknownFields().size();
        }

        /* renamed from: a */
        public PushDownloadCallback decode(ProtoReader protoReader) throws IOException {
            C19375a aVar = new C19375a();
            aVar.f47638a = "";
            aVar.f47639b = Status.PENDING;
            aVar.f47640c = "";
            aVar.f47641d = "";
            aVar.f47643f = "";
            aVar.f47644g = "";
            aVar.f47645h = "";
            aVar.f47646i = "";
            aVar.f47647j = "";
            aVar.f47648k = "";
            aVar.f47649l = "";
            aVar.f47650m = DownloadScene.unknown;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f47638a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f47639b = Status.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f47640c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f47641d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f47642e = DownloadFailedInfo.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f47643f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f47644g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f47645h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f47646i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f47647j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f47648k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f47649l = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 13:
                            try {
                                aVar.f47650m = DownloadScene.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
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
        public void encode(ProtoWriter protoWriter, PushDownloadCallback pushDownloadCallback) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushDownloadCallback.key);
            if (pushDownloadCallback.status != null) {
                Status.ADAPTER.encodeWithTag(protoWriter, 2, pushDownloadCallback.status);
            }
            if (pushDownloadCallback.bytes_transferred != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, pushDownloadCallback.bytes_transferred);
            }
            if (pushDownloadCallback.bytes_total != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, pushDownloadCallback.bytes_total);
            }
            if (pushDownloadCallback.failed_info != null) {
                DownloadFailedInfo.ADAPTER.encodeWithTag(protoWriter, 5, pushDownloadCallback.failed_info);
            }
            if (pushDownloadCallback.file_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, pushDownloadCallback.file_name);
            }
            if (pushDownloadCallback.file_type != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, pushDownloadCallback.file_type);
            }
            if (pushDownloadCallback.file_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, pushDownloadCallback.file_path);
            }
            if (pushDownloadCallback.data_version != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, pushDownloadCallback.data_version);
            }
            if (pushDownloadCallback.mount_node_point != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, pushDownloadCallback.mount_node_point);
            }
            if (pushDownloadCallback.mount_point != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, pushDownloadCallback.mount_point);
            }
            if (pushDownloadCallback.mime_type != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, pushDownloadCallback.mime_type);
            }
            if (pushDownloadCallback.scene != null) {
                DownloadScene.ADAPTER.encodeWithTag(protoWriter, 13, pushDownloadCallback.scene);
            }
            protoWriter.writeBytes(pushDownloadCallback.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.PushDownloadCallback$a */
    public static final class C19375a extends Message.Builder<PushDownloadCallback, C19375a> {

        /* renamed from: a */
        public String f47638a;

        /* renamed from: b */
        public Status f47639b;

        /* renamed from: c */
        public String f47640c;

        /* renamed from: d */
        public String f47641d;

        /* renamed from: e */
        public DownloadFailedInfo f47642e;

        /* renamed from: f */
        public String f47643f;

        /* renamed from: g */
        public String f47644g;

        /* renamed from: h */
        public String f47645h;

        /* renamed from: i */
        public String f47646i;

        /* renamed from: j */
        public String f47647j;

        /* renamed from: k */
        public String f47648k;

        /* renamed from: l */
        public String f47649l;

        /* renamed from: m */
        public DownloadScene f47650m;

        /* renamed from: a */
        public PushDownloadCallback build() {
            String str = this.f47638a;
            if (str != null) {
                return new PushDownloadCallback(str, this.f47639b, this.f47640c, this.f47641d, this.f47642e, this.f47643f, this.f47644g, this.f47645h, this.f47646i, this.f47647j, this.f47648k, this.f47649l, this.f47650m, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "key");
        }
    }

    @Override // com.squareup.wire.Message
    public C19375a newBuilder() {
        C19375a aVar = new C19375a();
        aVar.f47638a = this.key;
        aVar.f47639b = this.status;
        aVar.f47640c = this.bytes_transferred;
        aVar.f47641d = this.bytes_total;
        aVar.f47642e = this.failed_info;
        aVar.f47643f = this.file_name;
        aVar.f47644g = this.file_type;
        aVar.f47645h = this.file_path;
        aVar.f47646i = this.data_version;
        aVar.f47647j = this.mount_node_point;
        aVar.f47648k = this.mount_point;
        aVar.f47649l = this.mime_type;
        aVar.f47650m = this.scene;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "PushDownloadCallback");
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
        StringBuilder replace = sb.replace(0, 2, "PushDownloadCallback{");
        replace.append('}');
        return replace.toString();
    }

    public PushDownloadCallback(String str, Status status2, String str2, String str3, DownloadFailedInfo downloadFailedInfo, String str4, String str5, String str6, String str7, String str8, String str9, String str10, DownloadScene downloadScene) {
        this(str, status2, str2, str3, downloadFailedInfo, str4, str5, str6, str7, str8, str9, str10, downloadScene, ByteString.EMPTY);
    }

    public PushDownloadCallback(String str, Status status2, String str2, String str3, DownloadFailedInfo downloadFailedInfo, String str4, String str5, String str6, String str7, String str8, String str9, String str10, DownloadScene downloadScene, ByteString byteString) {
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
    }
}
