package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetVcVirtualBackgroundResponse extends Message<GetVcVirtualBackgroundResponse, C50715a> {
    public static final ProtoAdapter<GetVcVirtualBackgroundResponse> ADAPTER = new C50716b();
    public static final BackgroundType DEFAULT_TYPE = BackgroundType.All;
    private static final long serialVersionUID = 0;
    public final List<VirtualBackgroundInfo> infos;
    public final List<String> miss_urls;
    public final BackgroundType type;

    public static final class VirtualBackgroundInfo extends Message<VirtualBackgroundInfo, C50713a> {
        public static final ProtoAdapter<VirtualBackgroundInfo> ADAPTER = new C50714b();
        public static final FileStatus DEFAULT_FILE_STATUS = FileStatus.UnSyncServer;
        public static final Boolean DEFAULT_IS_CUSTOM = false;
        public static final Boolean DEFAULT_IS_MISS = false;
        public static final Boolean DEFAULT_IS_VIDEO = false;
        public static final MaterialSource DEFAULT_SOURCE = MaterialSource.UNKNOWN_SOURCE;
        private static final long serialVersionUID = 0;
        public final FileStatus file_status;
        public final Boolean is_custom;
        public final Boolean is_miss;
        public final Boolean is_video;
        public final String key;
        public final String name;
        public final String path;
        public final String portrait_path;
        public final MaterialSource source;
        public final String thumbnail;
        public final String url;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetVcVirtualBackgroundResponse$VirtualBackgroundInfo$b */
        private static final class C50714b extends ProtoAdapter<VirtualBackgroundInfo> {
            C50714b() {
                super(FieldEncoding.LENGTH_DELIMITED, VirtualBackgroundInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(VirtualBackgroundInfo virtualBackgroundInfo) {
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
                if (virtualBackgroundInfo.key != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, virtualBackgroundInfo.key);
                } else {
                    i = 0;
                }
                if (virtualBackgroundInfo.url != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, virtualBackgroundInfo.url);
                } else {
                    i2 = 0;
                }
                int i12 = i + i2;
                if (virtualBackgroundInfo.path != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, virtualBackgroundInfo.path);
                } else {
                    i3 = 0;
                }
                int i13 = i12 + i3;
                if (virtualBackgroundInfo.name != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, virtualBackgroundInfo.name);
                } else {
                    i4 = 0;
                }
                int i14 = i13 + i4;
                if (virtualBackgroundInfo.is_video != null) {
                    i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, virtualBackgroundInfo.is_video);
                } else {
                    i5 = 0;
                }
                int i15 = i14 + i5;
                if (virtualBackgroundInfo.thumbnail != null) {
                    i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, virtualBackgroundInfo.thumbnail);
                } else {
                    i6 = 0;
                }
                int i16 = i15 + i6;
                if (virtualBackgroundInfo.is_miss != null) {
                    i7 = ProtoAdapter.BOOL.encodedSizeWithTag(7, virtualBackgroundInfo.is_miss);
                } else {
                    i7 = 0;
                }
                int i17 = i16 + i7;
                if (virtualBackgroundInfo.portrait_path != null) {
                    i8 = ProtoAdapter.STRING.encodedSizeWithTag(8, virtualBackgroundInfo.portrait_path);
                } else {
                    i8 = 0;
                }
                int i18 = i17 + i8;
                if (virtualBackgroundInfo.file_status != null) {
                    i9 = FileStatus.ADAPTER.encodedSizeWithTag(9, virtualBackgroundInfo.file_status);
                } else {
                    i9 = 0;
                }
                int i19 = i18 + i9;
                if (virtualBackgroundInfo.source != null) {
                    i10 = MaterialSource.ADAPTER.encodedSizeWithTag(10, virtualBackgroundInfo.source);
                } else {
                    i10 = 0;
                }
                int i20 = i19 + i10;
                if (virtualBackgroundInfo.is_custom != null) {
                    i11 = ProtoAdapter.BOOL.encodedSizeWithTag(11, virtualBackgroundInfo.is_custom);
                }
                return i20 + i11 + virtualBackgroundInfo.unknownFields().size();
            }

            /* renamed from: a */
            public VirtualBackgroundInfo decode(ProtoReader protoReader) throws IOException {
                C50713a aVar = new C50713a();
                aVar.f126450a = "";
                aVar.f126451b = "";
                aVar.f126452c = "";
                aVar.f126453d = "";
                aVar.f126454e = false;
                aVar.f126455f = "";
                aVar.f126456g = false;
                aVar.f126457h = "";
                aVar.f126458i = FileStatus.UnSyncServer;
                aVar.f126459j = MaterialSource.UNKNOWN_SOURCE;
                aVar.f126460k = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f126450a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                aVar.f126451b = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                aVar.f126452c = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                aVar.f126453d = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                aVar.f126454e = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 6:
                                aVar.f126455f = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 7:
                                aVar.f126456g = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 8:
                                aVar.f126457h = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 9:
                                try {
                                    aVar.f126458i = FileStatus.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 10:
                                try {
                                    aVar.f126459j = MaterialSource.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                    break;
                                }
                            case 11:
                                aVar.f126460k = ProtoAdapter.BOOL.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, VirtualBackgroundInfo virtualBackgroundInfo) throws IOException {
                if (virtualBackgroundInfo.key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, virtualBackgroundInfo.key);
                }
                if (virtualBackgroundInfo.url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, virtualBackgroundInfo.url);
                }
                if (virtualBackgroundInfo.path != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, virtualBackgroundInfo.path);
                }
                if (virtualBackgroundInfo.name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, virtualBackgroundInfo.name);
                }
                if (virtualBackgroundInfo.is_video != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, virtualBackgroundInfo.is_video);
                }
                if (virtualBackgroundInfo.thumbnail != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, virtualBackgroundInfo.thumbnail);
                }
                if (virtualBackgroundInfo.is_miss != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, virtualBackgroundInfo.is_miss);
                }
                if (virtualBackgroundInfo.portrait_path != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, virtualBackgroundInfo.portrait_path);
                }
                if (virtualBackgroundInfo.file_status != null) {
                    FileStatus.ADAPTER.encodeWithTag(protoWriter, 9, virtualBackgroundInfo.file_status);
                }
                if (virtualBackgroundInfo.source != null) {
                    MaterialSource.ADAPTER.encodeWithTag(protoWriter, 10, virtualBackgroundInfo.source);
                }
                if (virtualBackgroundInfo.is_custom != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, virtualBackgroundInfo.is_custom);
                }
                protoWriter.writeBytes(virtualBackgroundInfo.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetVcVirtualBackgroundResponse$VirtualBackgroundInfo$a */
        public static final class C50713a extends Message.Builder<VirtualBackgroundInfo, C50713a> {

            /* renamed from: a */
            public String f126450a;

            /* renamed from: b */
            public String f126451b;

            /* renamed from: c */
            public String f126452c;

            /* renamed from: d */
            public String f126453d;

            /* renamed from: e */
            public Boolean f126454e;

            /* renamed from: f */
            public String f126455f;

            /* renamed from: g */
            public Boolean f126456g;

            /* renamed from: h */
            public String f126457h;

            /* renamed from: i */
            public FileStatus f126458i;

            /* renamed from: j */
            public MaterialSource f126459j;

            /* renamed from: k */
            public Boolean f126460k;

            /* renamed from: a */
            public VirtualBackgroundInfo build() {
                return new VirtualBackgroundInfo(this.f126450a, this.f126451b, this.f126452c, this.f126453d, this.f126454e, this.f126455f, this.f126456g, this.f126457h, this.f126458i, this.f126459j, this.f126460k, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50713a newBuilder() {
            C50713a aVar = new C50713a();
            aVar.f126450a = this.key;
            aVar.f126451b = this.url;
            aVar.f126452c = this.path;
            aVar.f126453d = this.name;
            aVar.f126454e = this.is_video;
            aVar.f126455f = this.thumbnail;
            aVar.f126456g = this.is_miss;
            aVar.f126457h = this.portrait_path;
            aVar.f126458i = this.file_status;
            aVar.f126459j = this.source;
            aVar.f126460k = this.is_custom;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "VirtualBackgroundInfo");
            StringBuilder sb = new StringBuilder();
            if (this.key != null) {
                sb.append(", key=");
                sb.append(this.key);
            }
            if (this.url != null) {
                sb.append(", url=");
                sb.append(this.url);
            }
            if (this.path != null) {
                sb.append(", path=");
                sb.append(this.path);
            }
            if (this.name != null) {
                sb.append(", name=");
                sb.append(this.name);
            }
            if (this.is_video != null) {
                sb.append(", is_video=");
                sb.append(this.is_video);
            }
            if (this.thumbnail != null) {
                sb.append(", thumbnail=");
                sb.append(this.thumbnail);
            }
            if (this.is_miss != null) {
                sb.append(", is_miss=");
                sb.append(this.is_miss);
            }
            if (this.portrait_path != null) {
                sb.append(", portrait_path=");
                sb.append(this.portrait_path);
            }
            if (this.file_status != null) {
                sb.append(", file_status=");
                sb.append(this.file_status);
            }
            if (this.source != null) {
                sb.append(", source=");
                sb.append(this.source);
            }
            if (this.is_custom != null) {
                sb.append(", is_custom=");
                sb.append(this.is_custom);
            }
            StringBuilder replace = sb.replace(0, 2, "VirtualBackgroundInfo{");
            replace.append('}');
            return replace.toString();
        }

        public VirtualBackgroundInfo(String str, String str2, String str3, String str4, Boolean bool, String str5, Boolean bool2, String str6, FileStatus fileStatus, MaterialSource materialSource, Boolean bool3) {
            this(str, str2, str3, str4, bool, str5, bool2, str6, fileStatus, materialSource, bool3, ByteString.EMPTY);
        }

        public VirtualBackgroundInfo(String str, String str2, String str3, String str4, Boolean bool, String str5, Boolean bool2, String str6, FileStatus fileStatus, MaterialSource materialSource, Boolean bool3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.key = str;
            this.url = str2;
            this.path = str3;
            this.name = str4;
            this.is_video = bool;
            this.thumbnail = str5;
            this.is_miss = bool2;
            this.portrait_path = str6;
            this.file_status = fileStatus;
            this.source = materialSource;
            this.is_custom = bool3;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetVcVirtualBackgroundResponse$b */
    private static final class C50716b extends ProtoAdapter<GetVcVirtualBackgroundResponse> {
        C50716b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetVcVirtualBackgroundResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetVcVirtualBackgroundResponse getVcVirtualBackgroundResponse) {
            int i;
            int encodedSizeWithTag = VirtualBackgroundInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, getVcVirtualBackgroundResponse.infos) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, getVcVirtualBackgroundResponse.miss_urls);
            if (getVcVirtualBackgroundResponse.type != null) {
                i = BackgroundType.ADAPTER.encodedSizeWithTag(3, getVcVirtualBackgroundResponse.type);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getVcVirtualBackgroundResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetVcVirtualBackgroundResponse decode(ProtoReader protoReader) throws IOException {
            C50715a aVar = new C50715a();
            aVar.f126463c = BackgroundType.All;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126461a.add(VirtualBackgroundInfo.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f126462b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f126463c = BackgroundType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetVcVirtualBackgroundResponse getVcVirtualBackgroundResponse) throws IOException {
            VirtualBackgroundInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getVcVirtualBackgroundResponse.infos);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, getVcVirtualBackgroundResponse.miss_urls);
            if (getVcVirtualBackgroundResponse.type != null) {
                BackgroundType.ADAPTER.encodeWithTag(protoWriter, 3, getVcVirtualBackgroundResponse.type);
            }
            protoWriter.writeBytes(getVcVirtualBackgroundResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetVcVirtualBackgroundResponse$a */
    public static final class C50715a extends Message.Builder<GetVcVirtualBackgroundResponse, C50715a> {

        /* renamed from: a */
        public List<VirtualBackgroundInfo> f126461a = Internal.newMutableList();

        /* renamed from: b */
        public List<String> f126462b = Internal.newMutableList();

        /* renamed from: c */
        public BackgroundType f126463c;

        /* renamed from: a */
        public GetVcVirtualBackgroundResponse build() {
            return new GetVcVirtualBackgroundResponse(this.f126461a, this.f126462b, this.f126463c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50715a newBuilder() {
        C50715a aVar = new C50715a();
        aVar.f126461a = Internal.copyOf("infos", this.infos);
        aVar.f126462b = Internal.copyOf("miss_urls", this.miss_urls);
        aVar.f126463c = this.type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetVcVirtualBackgroundResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.infos.isEmpty()) {
            sb.append(", infos=");
            sb.append(this.infos);
        }
        if (!this.miss_urls.isEmpty()) {
            sb.append(", miss_urls=");
            sb.append(this.miss_urls);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        StringBuilder replace = sb.replace(0, 2, "GetVcVirtualBackgroundResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetVcVirtualBackgroundResponse(List<VirtualBackgroundInfo> list, List<String> list2, BackgroundType backgroundType) {
        this(list, list2, backgroundType, ByteString.EMPTY);
    }

    public GetVcVirtualBackgroundResponse(List<VirtualBackgroundInfo> list, List<String> list2, BackgroundType backgroundType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.infos = Internal.immutableCopyOf("infos", list);
        this.miss_urls = Internal.immutableCopyOf("miss_urls", list2);
        this.type = backgroundType;
    }
}
