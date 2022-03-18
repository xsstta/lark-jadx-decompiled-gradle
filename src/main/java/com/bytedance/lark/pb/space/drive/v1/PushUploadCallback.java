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

public final class PushUploadCallback extends Message<PushUploadCallback, C19379a> {
    public static final ProtoAdapter<PushUploadCallback> ADAPTER = new C19380b();
    public static final UploadScene DEFAULT_SCENE = UploadScene.UNKNOWN;
    public static final Status DEFAULT_STATUS = Status.PENDING;
    private static final long serialVersionUID = 0;
    public final String bytes_total;
    public final String bytes_transferred;
    public final String data_version;
    public final UploadExtraInfo extra_info;
    public final UploadFailedInfo failed_info;
    public final String file_path;
    public final String file_token;
    public final String key;
    public final String mount_node_point;
    public final String mount_point;
    public final UploadScene scene;
    public final Status status;
    public final String uri_str;

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

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.PushUploadCallback$b */
    private static final class C19380b extends ProtoAdapter<PushUploadCallback> {
        C19380b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushUploadCallback.class);
        }

        /* renamed from: a */
        public int encodedSize(PushUploadCallback pushUploadCallback) {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, pushUploadCallback.key);
            int i12 = 0;
            if (pushUploadCallback.status != null) {
                i = Status.ADAPTER.encodedSizeWithTag(2, pushUploadCallback.status);
            } else {
                i = 0;
            }
            int i13 = encodedSizeWithTag + i;
            if (pushUploadCallback.bytes_transferred != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, pushUploadCallback.bytes_transferred);
            } else {
                i2 = 0;
            }
            int i14 = i13 + i2;
            if (pushUploadCallback.bytes_total != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, pushUploadCallback.bytes_total);
            } else {
                i3 = 0;
            }
            int i15 = i14 + i3;
            if (pushUploadCallback.file_token != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, pushUploadCallback.file_token);
            } else {
                i4 = 0;
            }
            int i16 = i15 + i4;
            if (pushUploadCallback.file_path != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, pushUploadCallback.file_path);
            } else {
                i5 = 0;
            }
            int i17 = i16 + i5;
            if (pushUploadCallback.mount_node_point != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, pushUploadCallback.mount_node_point);
            } else {
                i6 = 0;
            }
            int i18 = i17 + i6;
            if (pushUploadCallback.failed_info != null) {
                i7 = UploadFailedInfo.ADAPTER.encodedSizeWithTag(8, pushUploadCallback.failed_info);
            } else {
                i7 = 0;
            }
            int i19 = i18 + i7;
            if (pushUploadCallback.data_version != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(9, pushUploadCallback.data_version);
            } else {
                i8 = 0;
            }
            int i20 = i19 + i8;
            if (pushUploadCallback.mount_point != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(10, pushUploadCallback.mount_point);
            } else {
                i9 = 0;
            }
            int i21 = i20 + i9;
            if (pushUploadCallback.extra_info != null) {
                i10 = UploadExtraInfo.ADAPTER.encodedSizeWithTag(11, pushUploadCallback.extra_info);
            } else {
                i10 = 0;
            }
            int i22 = i21 + i10;
            if (pushUploadCallback.scene != null) {
                i11 = UploadScene.ADAPTER.encodedSizeWithTag(12, pushUploadCallback.scene);
            } else {
                i11 = 0;
            }
            int i23 = i22 + i11;
            if (pushUploadCallback.uri_str != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(13, pushUploadCallback.uri_str);
            }
            return i23 + i12 + pushUploadCallback.unknownFields().size();
        }

        /* renamed from: a */
        public PushUploadCallback decode(ProtoReader protoReader) throws IOException {
            C19379a aVar = new C19379a();
            aVar.f47665a = "";
            aVar.f47666b = Status.PENDING;
            aVar.f47667c = "";
            aVar.f47668d = "";
            aVar.f47669e = "";
            aVar.f47670f = "";
            aVar.f47671g = "";
            aVar.f47673i = "";
            aVar.f47674j = "";
            aVar.f47676l = UploadScene.UNKNOWN;
            aVar.f47677m = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f47665a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f47666b = Status.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f47667c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f47668d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f47669e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f47670f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f47671g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f47672h = UploadFailedInfo.ADAPTER.decode(protoReader);
                            break;
                        case 9:
                            aVar.f47673i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f47674j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f47675k = UploadExtraInfo.ADAPTER.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            try {
                                aVar.f47676l = UploadScene.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 13:
                            aVar.f47677m = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, PushUploadCallback pushUploadCallback) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushUploadCallback.key);
            if (pushUploadCallback.status != null) {
                Status.ADAPTER.encodeWithTag(protoWriter, 2, pushUploadCallback.status);
            }
            if (pushUploadCallback.bytes_transferred != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, pushUploadCallback.bytes_transferred);
            }
            if (pushUploadCallback.bytes_total != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, pushUploadCallback.bytes_total);
            }
            if (pushUploadCallback.file_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, pushUploadCallback.file_token);
            }
            if (pushUploadCallback.file_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, pushUploadCallback.file_path);
            }
            if (pushUploadCallback.mount_node_point != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, pushUploadCallback.mount_node_point);
            }
            if (pushUploadCallback.failed_info != null) {
                UploadFailedInfo.ADAPTER.encodeWithTag(protoWriter, 8, pushUploadCallback.failed_info);
            }
            if (pushUploadCallback.data_version != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, pushUploadCallback.data_version);
            }
            if (pushUploadCallback.mount_point != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, pushUploadCallback.mount_point);
            }
            if (pushUploadCallback.extra_info != null) {
                UploadExtraInfo.ADAPTER.encodeWithTag(protoWriter, 11, pushUploadCallback.extra_info);
            }
            if (pushUploadCallback.scene != null) {
                UploadScene.ADAPTER.encodeWithTag(protoWriter, 12, pushUploadCallback.scene);
            }
            if (pushUploadCallback.uri_str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, pushUploadCallback.uri_str);
            }
            protoWriter.writeBytes(pushUploadCallback.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.PushUploadCallback$a */
    public static final class C19379a extends Message.Builder<PushUploadCallback, C19379a> {

        /* renamed from: a */
        public String f47665a;

        /* renamed from: b */
        public Status f47666b;

        /* renamed from: c */
        public String f47667c;

        /* renamed from: d */
        public String f47668d;

        /* renamed from: e */
        public String f47669e;

        /* renamed from: f */
        public String f47670f;

        /* renamed from: g */
        public String f47671g;

        /* renamed from: h */
        public UploadFailedInfo f47672h;

        /* renamed from: i */
        public String f47673i;

        /* renamed from: j */
        public String f47674j;

        /* renamed from: k */
        public UploadExtraInfo f47675k;

        /* renamed from: l */
        public UploadScene f47676l;

        /* renamed from: m */
        public String f47677m;

        /* renamed from: a */
        public PushUploadCallback build() {
            String str = this.f47665a;
            if (str != null) {
                return new PushUploadCallback(str, this.f47666b, this.f47667c, this.f47668d, this.f47669e, this.f47670f, this.f47671g, this.f47672h, this.f47673i, this.f47674j, this.f47675k, this.f47676l, this.f47677m, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "key");
        }
    }

    @Override // com.squareup.wire.Message
    public C19379a newBuilder() {
        C19379a aVar = new C19379a();
        aVar.f47665a = this.key;
        aVar.f47666b = this.status;
        aVar.f47667c = this.bytes_transferred;
        aVar.f47668d = this.bytes_total;
        aVar.f47669e = this.file_token;
        aVar.f47670f = this.file_path;
        aVar.f47671g = this.mount_node_point;
        aVar.f47672h = this.failed_info;
        aVar.f47673i = this.data_version;
        aVar.f47674j = this.mount_point;
        aVar.f47675k = this.extra_info;
        aVar.f47676l = this.scene;
        aVar.f47677m = this.uri_str;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "PushUploadCallback");
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
        if (this.file_token != null) {
            sb.append(", file_token=");
            sb.append(this.file_token);
        }
        if (this.file_path != null) {
            sb.append(", file_path=");
            sb.append(this.file_path);
        }
        if (this.mount_node_point != null) {
            sb.append(", mount_node_point=");
            sb.append(this.mount_node_point);
        }
        if (this.failed_info != null) {
            sb.append(", failed_info=");
            sb.append(this.failed_info);
        }
        if (this.data_version != null) {
            sb.append(", data_version=");
            sb.append(this.data_version);
        }
        if (this.mount_point != null) {
            sb.append(", mount_point=");
            sb.append(this.mount_point);
        }
        if (this.extra_info != null) {
            sb.append(", extra_info=");
            sb.append(this.extra_info);
        }
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        if (this.uri_str != null) {
            sb.append(", uri_str=");
            sb.append(this.uri_str);
        }
        StringBuilder replace = sb.replace(0, 2, "PushUploadCallback{");
        replace.append('}');
        return replace.toString();
    }

    public PushUploadCallback(String str, Status status2, String str2, String str3, String str4, String str5, String str6, UploadFailedInfo uploadFailedInfo, String str7, String str8, UploadExtraInfo uploadExtraInfo, UploadScene uploadScene, String str9) {
        this(str, status2, str2, str3, str4, str5, str6, uploadFailedInfo, str7, str8, uploadExtraInfo, uploadScene, str9, ByteString.EMPTY);
    }

    public PushUploadCallback(String str, Status status2, String str2, String str3, String str4, String str5, String str6, UploadFailedInfo uploadFailedInfo, String str7, String str8, UploadExtraInfo uploadExtraInfo, UploadScene uploadScene, String str9, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.status = status2;
        this.bytes_transferred = str2;
        this.bytes_total = str3;
        this.file_token = str4;
        this.file_path = str5;
        this.mount_node_point = str6;
        this.failed_info = uploadFailedInfo;
        this.data_version = str7;
        this.mount_point = str8;
        this.extra_info = uploadExtraInfo;
        this.scene = uploadScene;
        this.uri_str = str9;
    }
}
