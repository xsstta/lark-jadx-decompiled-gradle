package com.bytedance.lark.pb.space.drive.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class DriveFile extends Message<DriveFile, C19359a> {
    public static final ProtoAdapter<DriveFile> ADAPTER = new C19360b();
    public static final Integer DEFAULT_ID = 0;
    public static final Integer DEFAULT_STATUS = 0;
    private static final long serialVersionUID = 0;
    public final String bytes_total;
    public final String bytes_transferred;
    public final String data_version;
    public final String error_code;
    public final String file_name;
    public final String file_type;
    public final Integer id;
    public final String key;
    public final String mount_node_point;
    public final String path;
    public final Integer status;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.DriveFile$b */
    private static final class C19360b extends ProtoAdapter<DriveFile> {
        C19360b() {
            super(FieldEncoding.LENGTH_DELIMITED, DriveFile.class);
        }

        /* renamed from: a */
        public int encodedSize(DriveFile driveFile) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, driveFile.key) + ProtoAdapter.STRING.encodedSizeWithTag(2, driveFile.file_name) + ProtoAdapter.STRING.encodedSizeWithTag(3, driveFile.path);
            int i8 = 0;
            if (driveFile.status != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(4, driveFile.status);
            } else {
                i = 0;
            }
            int i9 = encodedSizeWithTag + i;
            if (driveFile.bytes_transferred != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(5, driveFile.bytes_transferred);
            } else {
                i2 = 0;
            }
            int i10 = i9 + i2;
            if (driveFile.bytes_total != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(6, driveFile.bytes_total);
            } else {
                i3 = 0;
            }
            int i11 = i10 + i3;
            if (driveFile.mount_node_point != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(7, driveFile.mount_node_point);
            } else {
                i4 = 0;
            }
            int i12 = i11 + i4;
            if (driveFile.data_version != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(8, driveFile.data_version);
            } else {
                i5 = 0;
            }
            int i13 = i12 + i5;
            if (driveFile.file_type != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(9, driveFile.file_type);
            } else {
                i6 = 0;
            }
            int i14 = i13 + i6;
            if (driveFile.error_code != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(10, driveFile.error_code);
            } else {
                i7 = 0;
            }
            int i15 = i14 + i7;
            if (driveFile.id != null) {
                i8 = ProtoAdapter.INT32.encodedSizeWithTag(11, driveFile.id);
            }
            return i15 + i8 + driveFile.unknownFields().size();
        }

        /* renamed from: a */
        public DriveFile decode(ProtoReader protoReader) throws IOException {
            C19359a aVar = new C19359a();
            aVar.f47591a = "";
            aVar.f47592b = "";
            aVar.f47593c = "";
            aVar.f47594d = 0;
            aVar.f47595e = "";
            aVar.f47596f = "";
            aVar.f47597g = "";
            aVar.f47598h = "";
            aVar.f47599i = "";
            aVar.f47600j = "";
            aVar.f47601k = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f47591a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f47592b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f47593c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f47594d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f47595e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f47596f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f47597g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f47598h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f47599i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f47600j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f47601k = ProtoAdapter.INT32.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, DriveFile driveFile) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, driveFile.key);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, driveFile.file_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, driveFile.path);
            if (driveFile.status != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, driveFile.status);
            }
            if (driveFile.bytes_transferred != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, driveFile.bytes_transferred);
            }
            if (driveFile.bytes_total != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, driveFile.bytes_total);
            }
            if (driveFile.mount_node_point != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, driveFile.mount_node_point);
            }
            if (driveFile.data_version != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, driveFile.data_version);
            }
            if (driveFile.file_type != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, driveFile.file_type);
            }
            if (driveFile.error_code != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, driveFile.error_code);
            }
            if (driveFile.id != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, driveFile.id);
            }
            protoWriter.writeBytes(driveFile.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19359a newBuilder() {
        C19359a aVar = new C19359a();
        aVar.f47591a = this.key;
        aVar.f47592b = this.file_name;
        aVar.f47593c = this.path;
        aVar.f47594d = this.status;
        aVar.f47595e = this.bytes_transferred;
        aVar.f47596f = this.bytes_total;
        aVar.f47597g = this.mount_node_point;
        aVar.f47598h = this.data_version;
        aVar.f47599i = this.file_type;
        aVar.f47600j = this.error_code;
        aVar.f47601k = this.id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.DriveFile$a */
    public static final class C19359a extends Message.Builder<DriveFile, C19359a> {

        /* renamed from: a */
        public String f47591a;

        /* renamed from: b */
        public String f47592b;

        /* renamed from: c */
        public String f47593c;

        /* renamed from: d */
        public Integer f47594d;

        /* renamed from: e */
        public String f47595e;

        /* renamed from: f */
        public String f47596f;

        /* renamed from: g */
        public String f47597g;

        /* renamed from: h */
        public String f47598h;

        /* renamed from: i */
        public String f47599i;

        /* renamed from: j */
        public String f47600j;

        /* renamed from: k */
        public Integer f47601k;

        /* renamed from: a */
        public DriveFile build() {
            String str;
            String str2;
            String str3 = this.f47591a;
            if (str3 != null && (str = this.f47592b) != null && (str2 = this.f47593c) != null) {
                return new DriveFile(str3, str, str2, this.f47594d, this.f47595e, this.f47596f, this.f47597g, this.f47598h, this.f47599i, this.f47600j, this.f47601k, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str3, "key", this.f47592b, "file_name", this.f47593c, "path");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "DriveFile");
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", file_name=");
        sb.append(this.file_name);
        sb.append(", path=");
        sb.append(this.path);
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
        if (this.mount_node_point != null) {
            sb.append(", mount_node_point=");
            sb.append(this.mount_node_point);
        }
        if (this.data_version != null) {
            sb.append(", data_version=");
            sb.append(this.data_version);
        }
        if (this.file_type != null) {
            sb.append(", file_type=");
            sb.append(this.file_type);
        }
        if (this.error_code != null) {
            sb.append(", error_code=");
            sb.append(this.error_code);
        }
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        StringBuilder replace = sb.replace(0, 2, "DriveFile{");
        replace.append('}');
        return replace.toString();
    }

    public DriveFile(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, Integer num2) {
        this(str, str2, str3, num, str4, str5, str6, str7, str8, str9, num2, ByteString.EMPTY);
    }

    public DriveFile(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.file_name = str2;
        this.path = str3;
        this.status = num;
        this.bytes_transferred = str4;
        this.bytes_total = str5;
        this.mount_node_point = str6;
        this.data_version = str7;
        this.file_type = str8;
        this.error_code = str9;
        this.id = num2;
    }
}
