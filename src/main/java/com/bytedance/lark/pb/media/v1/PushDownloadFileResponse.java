package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.File;
import com.bytedance.lark.pb.basic.v1.Message;
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

public final class PushDownloadFileResponse extends Message<PushDownloadFileResponse, C18276a> {
    public static final ProtoAdapter<PushDownloadFileResponse> ADAPTER = new C18277b();
    public static final Boolean DEFAULT_IS_CACHE = false;
    public static final Boolean DEFAULT_NO_NEED_TOAST = false;
    public static final Integer DEFAULT_PROGRESS = 0;
    public static final Long DEFAULT_RATE = 0L;
    public static final Message.SourceType DEFAULT_SOURCE_TYPE = Message.SourceType.TYPE_FROM_UNKONWN;
    public static final FileState DEFAULT_STATE = FileState.UPLOAD_WAIT;
    public static final File.EntityType DEFAULT_TYPE = File.EntityType.MESSAGE;
    private static final long serialVersionUID = 0;
    public final String channel_id;
    public final TransferFolderInfo folder_info;
    public final Boolean is_cache;
    public final String key;
    public final String message_id;
    public final String name;
    public final Boolean no_need_toast;
    public final String path;
    public final Integer progress;
    public final Long rate;
    public final String source_id;
    public final Message.SourceType source_type;
    public final FileState state;
    public final File.EntityType type;

    /* renamed from: com.bytedance.lark.pb.media.v1.PushDownloadFileResponse$b */
    private static final class C18277b extends ProtoAdapter<PushDownloadFileResponse> {
        C18277b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushDownloadFileResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PushDownloadFileResponse pushDownloadFileResponse) {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, pushDownloadFileResponse.message_id);
            int i11 = 0;
            if (pushDownloadFileResponse.progress != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, pushDownloadFileResponse.progress);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + FileState.ADAPTER.encodedSizeWithTag(3, pushDownloadFileResponse.state);
            if (pushDownloadFileResponse.key != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(5, pushDownloadFileResponse.key);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag3 = encodedSizeWithTag2 + i2 + File.EntityType.ADAPTER.encodedSizeWithTag(6, pushDownloadFileResponse.type);
            if (pushDownloadFileResponse.source_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(7, pushDownloadFileResponse.source_id);
            } else {
                i3 = 0;
            }
            int i12 = encodedSizeWithTag3 + i3;
            if (pushDownloadFileResponse.source_type != null) {
                i4 = Message.SourceType.ADAPTER.encodedSizeWithTag(8, pushDownloadFileResponse.source_type);
            } else {
                i4 = 0;
            }
            int i13 = i12 + i4;
            if (pushDownloadFileResponse.channel_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(9, pushDownloadFileResponse.channel_id);
            } else {
                i5 = 0;
            }
            int i14 = i13 + i5;
            if (pushDownloadFileResponse.is_cache != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(10, pushDownloadFileResponse.is_cache);
            } else {
                i6 = 0;
            }
            int i15 = i14 + i6;
            if (pushDownloadFileResponse.rate != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(11, pushDownloadFileResponse.rate);
            } else {
                i7 = 0;
            }
            int i16 = i15 + i7;
            if (pushDownloadFileResponse.folder_info != null) {
                i8 = TransferFolderInfo.ADAPTER.encodedSizeWithTag(12, pushDownloadFileResponse.folder_info);
            } else {
                i8 = 0;
            }
            int i17 = i16 + i8;
            if (pushDownloadFileResponse.name != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(13, pushDownloadFileResponse.name);
            } else {
                i9 = 0;
            }
            int i18 = i17 + i9;
            if (pushDownloadFileResponse.path != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(14, pushDownloadFileResponse.path);
            } else {
                i10 = 0;
            }
            int i19 = i18 + i10;
            if (pushDownloadFileResponse.no_need_toast != null) {
                i11 = ProtoAdapter.BOOL.encodedSizeWithTag(15, pushDownloadFileResponse.no_need_toast);
            }
            return i19 + i11 + pushDownloadFileResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PushDownloadFileResponse decode(ProtoReader protoReader) throws IOException {
            C18276a aVar = new C18276a();
            aVar.f45535a = "";
            aVar.f45536b = 0;
            aVar.f45537c = FileState.UPLOAD_WAIT;
            aVar.f45538d = "";
            aVar.f45539e = File.EntityType.MESSAGE;
            aVar.f45540f = "";
            aVar.f45541g = Message.SourceType.TYPE_FROM_UNKONWN;
            aVar.f45542h = "";
            aVar.f45543i = false;
            aVar.f45544j = 0L;
            aVar.f45546l = "";
            aVar.f45547m = "";
            aVar.f45548n = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f45535a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f45536b = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f45537c = FileState.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 5:
                            aVar.f45538d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            try {
                                aVar.f45539e = File.EntityType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 7:
                            aVar.f45540f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            try {
                                aVar.f45541g = Message.SourceType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 9:
                            aVar.f45542h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f45543i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 11:
                            aVar.f45544j = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f45545k = TransferFolderInfo.ADAPTER.decode(protoReader);
                            break;
                        case 13:
                            aVar.f45546l = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            aVar.f45547m = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            aVar.f45548n = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushDownloadFileResponse pushDownloadFileResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushDownloadFileResponse.message_id);
            if (pushDownloadFileResponse.progress != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, pushDownloadFileResponse.progress);
            }
            FileState.ADAPTER.encodeWithTag(protoWriter, 3, pushDownloadFileResponse.state);
            if (pushDownloadFileResponse.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, pushDownloadFileResponse.key);
            }
            File.EntityType.ADAPTER.encodeWithTag(protoWriter, 6, pushDownloadFileResponse.type);
            if (pushDownloadFileResponse.source_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, pushDownloadFileResponse.source_id);
            }
            if (pushDownloadFileResponse.source_type != null) {
                Message.SourceType.ADAPTER.encodeWithTag(protoWriter, 8, pushDownloadFileResponse.source_type);
            }
            if (pushDownloadFileResponse.channel_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, pushDownloadFileResponse.channel_id);
            }
            if (pushDownloadFileResponse.is_cache != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, pushDownloadFileResponse.is_cache);
            }
            if (pushDownloadFileResponse.rate != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 11, pushDownloadFileResponse.rate);
            }
            if (pushDownloadFileResponse.folder_info != null) {
                TransferFolderInfo.ADAPTER.encodeWithTag(protoWriter, 12, pushDownloadFileResponse.folder_info);
            }
            if (pushDownloadFileResponse.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, pushDownloadFileResponse.name);
            }
            if (pushDownloadFileResponse.path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, pushDownloadFileResponse.path);
            }
            if (pushDownloadFileResponse.no_need_toast != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 15, pushDownloadFileResponse.no_need_toast);
            }
            protoWriter.writeBytes(pushDownloadFileResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.PushDownloadFileResponse$a */
    public static final class C18276a extends Message.Builder<PushDownloadFileResponse, C18276a> {

        /* renamed from: a */
        public String f45535a;

        /* renamed from: b */
        public Integer f45536b;

        /* renamed from: c */
        public FileState f45537c;

        /* renamed from: d */
        public String f45538d;

        /* renamed from: e */
        public File.EntityType f45539e;

        /* renamed from: f */
        public String f45540f;

        /* renamed from: g */
        public Message.SourceType f45541g;

        /* renamed from: h */
        public String f45542h;

        /* renamed from: i */
        public Boolean f45543i;

        /* renamed from: j */
        public Long f45544j;

        /* renamed from: k */
        public TransferFolderInfo f45545k;

        /* renamed from: l */
        public String f45546l;

        /* renamed from: m */
        public String f45547m;

        /* renamed from: n */
        public Boolean f45548n;

        /* renamed from: a */
        public PushDownloadFileResponse build() {
            FileState fileState;
            File.EntityType entityType;
            String str = this.f45535a;
            if (str != null && (fileState = this.f45537c) != null && (entityType = this.f45539e) != null) {
                return new PushDownloadFileResponse(str, this.f45536b, fileState, this.f45538d, entityType, this.f45540f, this.f45541g, this.f45542h, this.f45543i, this.f45544j, this.f45545k, this.f45546l, this.f45547m, this.f45548n, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "message_id", this.f45537c, "state", this.f45539e, ShareHitPoint.f121869d);
        }
    }

    @Override // com.squareup.wire.Message
    public C18276a newBuilder() {
        C18276a aVar = new C18276a();
        aVar.f45535a = this.message_id;
        aVar.f45536b = this.progress;
        aVar.f45537c = this.state;
        aVar.f45538d = this.key;
        aVar.f45539e = this.type;
        aVar.f45540f = this.source_id;
        aVar.f45541g = this.source_type;
        aVar.f45542h = this.channel_id;
        aVar.f45543i = this.is_cache;
        aVar.f45544j = this.rate;
        aVar.f45545k = this.folder_info;
        aVar.f45546l = this.name;
        aVar.f45547m = this.path;
        aVar.f45548n = this.no_need_toast;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "PushDownloadFileResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", message_id=");
        sb.append(this.message_id);
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
        sb.append(", type=");
        sb.append(this.type);
        if (this.source_id != null) {
            sb.append(", source_id=");
            sb.append(this.source_id);
        }
        if (this.source_type != null) {
            sb.append(", source_type=");
            sb.append(this.source_type);
        }
        if (this.channel_id != null) {
            sb.append(", channel_id=");
            sb.append(this.channel_id);
        }
        if (this.is_cache != null) {
            sb.append(", is_cache=");
            sb.append(this.is_cache);
        }
        if (this.rate != null) {
            sb.append(", rate=");
            sb.append(this.rate);
        }
        if (this.folder_info != null) {
            sb.append(", folder_info=");
            sb.append(this.folder_info);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.path != null) {
            sb.append(", path=");
            sb.append(this.path);
        }
        if (this.no_need_toast != null) {
            sb.append(", no_need_toast=");
            sb.append(this.no_need_toast);
        }
        StringBuilder replace = sb.replace(0, 2, "PushDownloadFileResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PushDownloadFileResponse(String str, Integer num, FileState fileState, String str2, File.EntityType entityType, String str3, Message.SourceType sourceType, String str4, Boolean bool, Long l, TransferFolderInfo transferFolderInfo, String str5, String str6, Boolean bool2) {
        this(str, num, fileState, str2, entityType, str3, sourceType, str4, bool, l, transferFolderInfo, str5, str6, bool2, ByteString.EMPTY);
    }

    public PushDownloadFileResponse(String str, Integer num, FileState fileState, String str2, File.EntityType entityType, String str3, Message.SourceType sourceType, String str4, Boolean bool, Long l, TransferFolderInfo transferFolderInfo, String str5, String str6, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
        this.progress = num;
        this.state = fileState;
        this.key = str2;
        this.type = entityType;
        this.source_id = str3;
        this.source_type = sourceType;
        this.channel_id = str4;
        this.is_cache = bool;
        this.rate = l;
        this.folder_info = transferFolderInfo;
        this.name = str5;
        this.path = str6;
        this.no_need_toast = bool2;
    }
}
