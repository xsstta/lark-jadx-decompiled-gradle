package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.File;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import okio.ByteString;

public final class PushUploadFileResponse extends Message<PushUploadFileResponse, C18284a> {
    public static final ProtoAdapter<PushUploadFileResponse> ADAPTER = new C18285b();
    public static final Integer DEFAULT_COMPRESS_COST = 0;
    public static final Integer DEFAULT_PROGRESS = 0;
    public static final Long DEFAULT_RATE = 0L;
    public static final Long DEFAULT_SIZE = 0L;
    public static final FileState DEFAULT_STATE = FileState.UPLOAD_WAIT;
    public static final File.EntityType DEFAULT_TYPE = File.EntityType.MESSAGE;
    private static final long serialVersionUID = 0;
    public final String channel_id;
    public final Integer compress_cost;
    public final TransferFolderInfo folder_info;
    public final String key;
    public final String local_key;
    public final String media_compress_type;
    public final String mime;
    public final String name;
    public final String path;
    public final Integer progress;
    public final Long rate;
    public final Long size;
    public final FileState state;
    public final File.EntityType type;

    /* renamed from: com.bytedance.lark.pb.media.v1.PushUploadFileResponse$b */
    private static final class C18285b extends ProtoAdapter<PushUploadFileResponse> {
        C18285b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushUploadFileResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PushUploadFileResponse pushUploadFileResponse) {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, pushUploadFileResponse.local_key);
            int i11 = 0;
            if (pushUploadFileResponse.progress != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, pushUploadFileResponse.progress);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + FileState.ADAPTER.encodedSizeWithTag(3, pushUploadFileResponse.state);
            if (pushUploadFileResponse.key != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, pushUploadFileResponse.key);
            } else {
                i2 = 0;
            }
            int i12 = encodedSizeWithTag2 + i2;
            if (pushUploadFileResponse.name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(5, pushUploadFileResponse.name);
            } else {
                i3 = 0;
            }
            int i13 = i12 + i3;
            if (pushUploadFileResponse.size != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(6, pushUploadFileResponse.size);
            } else {
                i4 = 0;
            }
            int i14 = i13 + i4;
            if (pushUploadFileResponse.mime != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(7, pushUploadFileResponse.mime);
            } else {
                i5 = 0;
            }
            int encodedSizeWithTag3 = i14 + i5 + File.EntityType.ADAPTER.encodedSizeWithTag(8, pushUploadFileResponse.type);
            if (pushUploadFileResponse.channel_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(9, pushUploadFileResponse.channel_id);
            } else {
                i6 = 0;
            }
            int i15 = encodedSizeWithTag3 + i6;
            if (pushUploadFileResponse.compress_cost != null) {
                i7 = ProtoAdapter.INT32.encodedSizeWithTag(10, pushUploadFileResponse.compress_cost);
            } else {
                i7 = 0;
            }
            int i16 = i15 + i7;
            if (pushUploadFileResponse.rate != null) {
                i8 = ProtoAdapter.INT64.encodedSizeWithTag(11, pushUploadFileResponse.rate);
            } else {
                i8 = 0;
            }
            int i17 = i16 + i8;
            if (pushUploadFileResponse.folder_info != null) {
                i9 = TransferFolderInfo.ADAPTER.encodedSizeWithTag(12, pushUploadFileResponse.folder_info);
            } else {
                i9 = 0;
            }
            int i18 = i17 + i9;
            if (pushUploadFileResponse.path != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(13, pushUploadFileResponse.path);
            } else {
                i10 = 0;
            }
            int i19 = i18 + i10;
            if (pushUploadFileResponse.media_compress_type != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(14, pushUploadFileResponse.media_compress_type);
            }
            return i19 + i11 + pushUploadFileResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PushUploadFileResponse decode(ProtoReader protoReader) throws IOException {
            C18284a aVar = new C18284a();
            aVar.f45563a = "";
            aVar.f45564b = 0;
            aVar.f45565c = FileState.UPLOAD_WAIT;
            aVar.f45566d = "";
            aVar.f45567e = "";
            aVar.f45568f = 0L;
            aVar.f45569g = "";
            aVar.f45570h = File.EntityType.MESSAGE;
            aVar.f45571i = "";
            aVar.f45572j = 0;
            aVar.f45573k = 0L;
            aVar.f45575m = "";
            aVar.f45576n = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f45563a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f45564b = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f45565c = FileState.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f45566d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f45567e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f45568f = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            aVar.f45569g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            try {
                                aVar.f45570h = File.EntityType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 9:
                            aVar.f45571i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f45572j = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 11:
                            aVar.f45573k = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f45574l = TransferFolderInfo.ADAPTER.decode(protoReader);
                            break;
                        case 13:
                            aVar.f45575m = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            aVar.f45576n = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, PushUploadFileResponse pushUploadFileResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushUploadFileResponse.local_key);
            if (pushUploadFileResponse.progress != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, pushUploadFileResponse.progress);
            }
            FileState.ADAPTER.encodeWithTag(protoWriter, 3, pushUploadFileResponse.state);
            if (pushUploadFileResponse.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, pushUploadFileResponse.key);
            }
            if (pushUploadFileResponse.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, pushUploadFileResponse.name);
            }
            if (pushUploadFileResponse.size != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, pushUploadFileResponse.size);
            }
            if (pushUploadFileResponse.mime != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, pushUploadFileResponse.mime);
            }
            File.EntityType.ADAPTER.encodeWithTag(protoWriter, 8, pushUploadFileResponse.type);
            if (pushUploadFileResponse.channel_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, pushUploadFileResponse.channel_id);
            }
            if (pushUploadFileResponse.compress_cost != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, pushUploadFileResponse.compress_cost);
            }
            if (pushUploadFileResponse.rate != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 11, pushUploadFileResponse.rate);
            }
            if (pushUploadFileResponse.folder_info != null) {
                TransferFolderInfo.ADAPTER.encodeWithTag(protoWriter, 12, pushUploadFileResponse.folder_info);
            }
            if (pushUploadFileResponse.path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, pushUploadFileResponse.path);
            }
            if (pushUploadFileResponse.media_compress_type != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, pushUploadFileResponse.media_compress_type);
            }
            protoWriter.writeBytes(pushUploadFileResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.PushUploadFileResponse$a */
    public static final class C18284a extends Message.Builder<PushUploadFileResponse, C18284a> {

        /* renamed from: a */
        public String f45563a;

        /* renamed from: b */
        public Integer f45564b;

        /* renamed from: c */
        public FileState f45565c;

        /* renamed from: d */
        public String f45566d;

        /* renamed from: e */
        public String f45567e;

        /* renamed from: f */
        public Long f45568f;

        /* renamed from: g */
        public String f45569g;

        /* renamed from: h */
        public File.EntityType f45570h;

        /* renamed from: i */
        public String f45571i;

        /* renamed from: j */
        public Integer f45572j;

        /* renamed from: k */
        public Long f45573k;

        /* renamed from: l */
        public TransferFolderInfo f45574l;

        /* renamed from: m */
        public String f45575m;

        /* renamed from: n */
        public String f45576n;

        /* renamed from: a */
        public PushUploadFileResponse build() {
            FileState fileState;
            File.EntityType entityType;
            String str = this.f45563a;
            if (str != null && (fileState = this.f45565c) != null && (entityType = this.f45570h) != null) {
                return new PushUploadFileResponse(str, this.f45564b, fileState, this.f45566d, this.f45567e, this.f45568f, this.f45569g, entityType, this.f45571i, this.f45572j, this.f45573k, this.f45574l, this.f45575m, this.f45576n, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "local_key", this.f45565c, "state", this.f45570h, ShareHitPoint.f121869d);
        }
    }

    @Override // com.squareup.wire.Message
    public C18284a newBuilder() {
        C18284a aVar = new C18284a();
        aVar.f45563a = this.local_key;
        aVar.f45564b = this.progress;
        aVar.f45565c = this.state;
        aVar.f45566d = this.key;
        aVar.f45567e = this.name;
        aVar.f45568f = this.size;
        aVar.f45569g = this.mime;
        aVar.f45570h = this.type;
        aVar.f45571i = this.channel_id;
        aVar.f45572j = this.compress_cost;
        aVar.f45573k = this.rate;
        aVar.f45574l = this.folder_info;
        aVar.f45575m = this.path;
        aVar.f45576n = this.media_compress_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "PushUploadFileResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", local_key=");
        sb.append(this.local_key);
        if (this.progress != null) {
            sb.append(", progress=");
            sb.append(this.progress);
        }
        sb.append(", state=");
        sb.append(this.state);
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.size != null) {
            sb.append(", size=");
            sb.append(this.size);
        }
        if (this.mime != null) {
            sb.append(", mime=");
            sb.append(this.mime);
        }
        sb.append(", type=");
        sb.append(this.type);
        if (this.channel_id != null) {
            sb.append(", channel_id=");
            sb.append(this.channel_id);
        }
        if (this.compress_cost != null) {
            sb.append(", compress_cost=");
            sb.append(this.compress_cost);
        }
        if (this.rate != null) {
            sb.append(", rate=");
            sb.append(this.rate);
        }
        if (this.folder_info != null) {
            sb.append(", folder_info=");
            sb.append(this.folder_info);
        }
        if (this.path != null) {
            sb.append(", path=");
            sb.append(this.path);
        }
        if (this.media_compress_type != null) {
            sb.append(", media_compress_type=");
            sb.append(this.media_compress_type);
        }
        StringBuilder replace = sb.replace(0, 2, "PushUploadFileResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PushUploadFileResponse(String str, Integer num, FileState fileState, String str2, String str3, Long l, String str4, File.EntityType entityType, String str5, Integer num2, Long l2, TransferFolderInfo transferFolderInfo, String str6, String str7) {
        this(str, num, fileState, str2, str3, l, str4, entityType, str5, num2, l2, transferFolderInfo, str6, str7, ByteString.EMPTY);
    }

    public PushUploadFileResponse(String str, Integer num, FileState fileState, String str2, String str3, Long l, String str4, File.EntityType entityType, String str5, Integer num2, Long l2, TransferFolderInfo transferFolderInfo, String str6, String str7, ByteString byteString) {
        super(ADAPTER, byteString);
        this.local_key = str;
        this.progress = num;
        this.state = fileState;
        this.key = str2;
        this.name = str3;
        this.size = l;
        this.mime = str4;
        this.type = entityType;
        this.channel_id = str5;
        this.compress_cost = num2;
        this.rate = l2;
        this.folder_info = transferFolderInfo;
        this.path = str6;
        this.media_compress_type = str7;
    }
}
