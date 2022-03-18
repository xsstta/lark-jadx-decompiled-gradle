package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class BrowseFolderResponse extends Message<BrowseFolderResponse, C18196a> {
    public static final ProtoAdapter<BrowseFolderResponse> ADAPTER = new C18197b();
    private static final long serialVersionUID = 0;
    public final Map<String, String> key2path;
    public final SerResp ser_resp;

    public static final class SerResp extends Message<SerResp, C18194a> {
        public static final ProtoAdapter<SerResp> ADAPTER = new C18195b();
        public static final Long DEFAULT_ALL_COUNT = 0L;
        public static final Boolean DEFAULT_HAS_MORE = false;
        private static final long serialVersionUID = 0;
        public final Long all_count;
        public final Boolean has_more;
        public final List<BrowseInfo> infos;

        public enum FileType implements WireEnum {
            UNKNOWN(0),
            FILE(1),
            IMAGE(2),
            STICKER(3),
            AUDIO(4),
            MEDIA(5),
            LARK_LOG(6),
            AVATAR(7),
            THIRD_PARTY(8),
            FOLDER(9);
            
            public static final ProtoAdapter<FileType> ADAPTER = ProtoAdapter.newEnumAdapter(FileType.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static FileType fromValue(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN;
                    case 1:
                        return FILE;
                    case 2:
                        return IMAGE;
                    case 3:
                        return STICKER;
                    case 4:
                        return AUDIO;
                    case 5:
                        return MEDIA;
                    case 6:
                        return LARK_LOG;
                    case 7:
                        return AVATAR;
                    case 8:
                        return THIRD_PARTY;
                    case 9:
                        return FOLDER;
                    default:
                        return null;
                }
            }

            private FileType(int i) {
                this.value = i;
            }
        }

        public static final class BrowseInfo extends Message<BrowseInfo, C18192a> {
            public static final ProtoAdapter<BrowseInfo> ADAPTER = new C18193b();
            public static final Long DEFAULT_CREATE_TIME = 0L;
            public static final Long DEFAULT_OWNER_ID = 0L;
            public static final Long DEFAULT_SIZE = 0L;
            public static final FileType DEFAULT_TYPE = FileType.UNKNOWN;
            private static final long serialVersionUID = 0;
            public final Long create_time;
            public final String key;
            public final String name;
            public final Long owner_id;
            public final String owner_name;
            public final String preview_image_key;
            public final Long size;
            public final FileType type;

            /* renamed from: com.bytedance.lark.pb.media.v1.BrowseFolderResponse$SerResp$BrowseInfo$b */
            private static final class C18193b extends ProtoAdapter<BrowseInfo> {
                C18193b() {
                    super(FieldEncoding.LENGTH_DELIMITED, BrowseInfo.class);
                }

                /* renamed from: a */
                public int encodedSize(BrowseInfo browseInfo) {
                    int i;
                    int i2;
                    int i3;
                    int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, browseInfo.key) + ProtoAdapter.INT64.encodedSizeWithTag(2, browseInfo.owner_id);
                    int i4 = 0;
                    if (browseInfo.owner_name != null) {
                        i = ProtoAdapter.STRING.encodedSizeWithTag(3, browseInfo.owner_name);
                    } else {
                        i = 0;
                    }
                    int encodedSizeWithTag2 = encodedSizeWithTag + i + FileType.ADAPTER.encodedSizeWithTag(4, browseInfo.type) + ProtoAdapter.STRING.encodedSizeWithTag(5, browseInfo.name);
                    if (browseInfo.size != null) {
                        i2 = ProtoAdapter.INT64.encodedSizeWithTag(6, browseInfo.size);
                    } else {
                        i2 = 0;
                    }
                    int i5 = encodedSizeWithTag2 + i2;
                    if (browseInfo.create_time != null) {
                        i3 = ProtoAdapter.INT64.encodedSizeWithTag(7, browseInfo.create_time);
                    } else {
                        i3 = 0;
                    }
                    int i6 = i5 + i3;
                    if (browseInfo.preview_image_key != null) {
                        i4 = ProtoAdapter.STRING.encodedSizeWithTag(8, browseInfo.preview_image_key);
                    }
                    return i6 + i4 + browseInfo.unknownFields().size();
                }

                /* renamed from: a */
                public BrowseInfo decode(ProtoReader protoReader) throws IOException {
                    C18192a aVar = new C18192a();
                    aVar.f45412a = "";
                    aVar.f45413b = 0L;
                    aVar.f45414c = "";
                    aVar.f45415d = FileType.UNKNOWN;
                    aVar.f45416e = "";
                    aVar.f45417f = 0L;
                    aVar.f45418g = 0L;
                    aVar.f45419h = "";
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag != -1) {
                            switch (nextTag) {
                                case 1:
                                    aVar.f45412a = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 2:
                                    aVar.f45413b = ProtoAdapter.INT64.decode(protoReader);
                                    break;
                                case 3:
                                    aVar.f45414c = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 4:
                                    try {
                                        aVar.f45415d = FileType.ADAPTER.decode(protoReader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                        break;
                                    }
                                case 5:
                                    aVar.f45416e = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 6:
                                    aVar.f45417f = ProtoAdapter.INT64.decode(protoReader);
                                    break;
                                case 7:
                                    aVar.f45418g = ProtoAdapter.INT64.decode(protoReader);
                                    break;
                                case 8:
                                    aVar.f45419h = ProtoAdapter.STRING.decode(protoReader);
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
                public void encode(ProtoWriter protoWriter, BrowseInfo browseInfo) throws IOException {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, browseInfo.key);
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, browseInfo.owner_id);
                    if (browseInfo.owner_name != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, browseInfo.owner_name);
                    }
                    FileType.ADAPTER.encodeWithTag(protoWriter, 4, browseInfo.type);
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, browseInfo.name);
                    if (browseInfo.size != null) {
                        ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, browseInfo.size);
                    }
                    if (browseInfo.create_time != null) {
                        ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, browseInfo.create_time);
                    }
                    if (browseInfo.preview_image_key != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, browseInfo.preview_image_key);
                    }
                    protoWriter.writeBytes(browseInfo.unknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C18192a newBuilder() {
                C18192a aVar = new C18192a();
                aVar.f45412a = this.key;
                aVar.f45413b = this.owner_id;
                aVar.f45414c = this.owner_name;
                aVar.f45415d = this.type;
                aVar.f45416e = this.name;
                aVar.f45417f = this.size;
                aVar.f45418g = this.create_time;
                aVar.f45419h = this.preview_image_key;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            /* renamed from: com.bytedance.lark.pb.media.v1.BrowseFolderResponse$SerResp$BrowseInfo$a */
            public static final class C18192a extends Message.Builder<BrowseInfo, C18192a> {

                /* renamed from: a */
                public String f45412a;

                /* renamed from: b */
                public Long f45413b;

                /* renamed from: c */
                public String f45414c;

                /* renamed from: d */
                public FileType f45415d;

                /* renamed from: e */
                public String f45416e;

                /* renamed from: f */
                public Long f45417f;

                /* renamed from: g */
                public Long f45418g;

                /* renamed from: h */
                public String f45419h;

                /* renamed from: a */
                public BrowseInfo build() {
                    Long l;
                    FileType fileType;
                    String str;
                    String str2 = this.f45412a;
                    if (str2 != null && (l = this.f45413b) != null && (fileType = this.f45415d) != null && (str = this.f45416e) != null) {
                        return new BrowseInfo(str2, l, this.f45414c, fileType, str, this.f45417f, this.f45418g, this.f45419h, super.buildUnknownFields());
                    }
                    throw Internal.missingRequiredFields(str2, "key", this.f45413b, "owner_id", this.f45415d, ShareHitPoint.f121869d, this.f45416e, "name");
                }
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("media", "BrowseInfo");
                StringBuilder sb = new StringBuilder();
                sb.append(", key=");
                sb.append(this.key);
                sb.append(", owner_id=");
                sb.append(this.owner_id);
                if (this.owner_name != null) {
                    sb.append(", owner_name=");
                    sb.append(this.owner_name);
                }
                sb.append(", type=");
                sb.append(this.type);
                sb.append(", name=");
                sb.append(this.name);
                if (this.size != null) {
                    sb.append(", size=");
                    sb.append(this.size);
                }
                if (this.create_time != null) {
                    sb.append(", create_time=");
                    sb.append(this.create_time);
                }
                if (this.preview_image_key != null) {
                    sb.append(", preview_image_key=");
                    sb.append(this.preview_image_key);
                }
                StringBuilder replace = sb.replace(0, 2, "BrowseInfo{");
                replace.append('}');
                return replace.toString();
            }

            public BrowseInfo(String str, Long l, String str2, FileType fileType, String str3, Long l2, Long l3, String str4) {
                this(str, l, str2, fileType, str3, l2, l3, str4, ByteString.EMPTY);
            }

            public BrowseInfo(String str, Long l, String str2, FileType fileType, String str3, Long l2, Long l3, String str4, ByteString byteString) {
                super(ADAPTER, byteString);
                this.key = str;
                this.owner_id = l;
                this.owner_name = str2;
                this.type = fileType;
                this.name = str3;
                this.size = l2;
                this.create_time = l3;
                this.preview_image_key = str4;
            }
        }

        /* renamed from: com.bytedance.lark.pb.media.v1.BrowseFolderResponse$SerResp$b */
        private static final class C18195b extends ProtoAdapter<SerResp> {
            C18195b() {
                super(FieldEncoding.LENGTH_DELIMITED, SerResp.class);
            }

            /* renamed from: a */
            public int encodedSize(SerResp serResp) {
                int i;
                int encodedSizeWithTag = BrowseInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, serResp.infos);
                int i2 = 0;
                if (serResp.all_count != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(2, serResp.all_count);
                } else {
                    i = 0;
                }
                int i3 = encodedSizeWithTag + i;
                if (serResp.has_more != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, serResp.has_more);
                }
                return i3 + i2 + serResp.unknownFields().size();
            }

            /* renamed from: a */
            public SerResp decode(ProtoReader protoReader) throws IOException {
                C18194a aVar = new C18194a();
                aVar.f45421b = 0L;
                aVar.f45422c = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f45420a.add(BrowseInfo.ADAPTER.decode(protoReader));
                    } else if (nextTag == 2) {
                        aVar.f45421b = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f45422c = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SerResp serResp) throws IOException {
                BrowseInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, serResp.infos);
                if (serResp.all_count != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, serResp.all_count);
                }
                if (serResp.has_more != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, serResp.has_more);
                }
                protoWriter.writeBytes(serResp.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.media.v1.BrowseFolderResponse$SerResp$a */
        public static final class C18194a extends Message.Builder<SerResp, C18194a> {

            /* renamed from: a */
            public List<BrowseInfo> f45420a = Internal.newMutableList();

            /* renamed from: b */
            public Long f45421b;

            /* renamed from: c */
            public Boolean f45422c;

            /* renamed from: a */
            public SerResp build() {
                return new SerResp(this.f45420a, this.f45421b, this.f45422c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18194a newBuilder() {
            C18194a aVar = new C18194a();
            aVar.f45420a = Internal.copyOf("infos", this.infos);
            aVar.f45421b = this.all_count;
            aVar.f45422c = this.has_more;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("media", "SerResp");
            StringBuilder sb = new StringBuilder();
            if (!this.infos.isEmpty()) {
                sb.append(", infos=");
                sb.append(this.infos);
            }
            if (this.all_count != null) {
                sb.append(", all_count=");
                sb.append(this.all_count);
            }
            if (this.has_more != null) {
                sb.append(", has_more=");
                sb.append(this.has_more);
            }
            StringBuilder replace = sb.replace(0, 2, "SerResp{");
            replace.append('}');
            return replace.toString();
        }

        public SerResp(List<BrowseInfo> list, Long l, Boolean bool) {
            this(list, l, bool, ByteString.EMPTY);
        }

        public SerResp(List<BrowseInfo> list, Long l, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.infos = Internal.immutableCopyOf("infos", list);
            this.all_count = l;
            this.has_more = bool;
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.BrowseFolderResponse$a */
    public static final class C18196a extends Message.Builder<BrowseFolderResponse, C18196a> {

        /* renamed from: a */
        public SerResp f45423a;

        /* renamed from: b */
        public Map<String, String> f45424b = Internal.newMutableMap();

        /* renamed from: a */
        public BrowseFolderResponse build() {
            SerResp serResp = this.f45423a;
            if (serResp != null) {
                return new BrowseFolderResponse(serResp, this.f45424b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(serResp, "ser_resp");
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.BrowseFolderResponse$b */
    private static final class C18197b extends ProtoAdapter<BrowseFolderResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f45425a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C18197b() {
            super(FieldEncoding.LENGTH_DELIMITED, BrowseFolderResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(BrowseFolderResponse browseFolderResponse) {
            return SerResp.ADAPTER.encodedSizeWithTag(1, browseFolderResponse.ser_resp) + this.f45425a.encodedSizeWithTag(2, browseFolderResponse.key2path) + browseFolderResponse.unknownFields().size();
        }

        /* renamed from: a */
        public BrowseFolderResponse decode(ProtoReader protoReader) throws IOException {
            C18196a aVar = new C18196a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45423a = SerResp.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45424b.putAll(this.f45425a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BrowseFolderResponse browseFolderResponse) throws IOException {
            SerResp.ADAPTER.encodeWithTag(protoWriter, 1, browseFolderResponse.ser_resp);
            this.f45425a.encodeWithTag(protoWriter, 2, browseFolderResponse.key2path);
            protoWriter.writeBytes(browseFolderResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18196a newBuilder() {
        C18196a aVar = new C18196a();
        aVar.f45423a = this.ser_resp;
        aVar.f45424b = Internal.copyOf("key2path", this.key2path);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "BrowseFolderResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", ser_resp=");
        sb.append(this.ser_resp);
        if (!this.key2path.isEmpty()) {
            sb.append(", key2path=");
            sb.append(this.key2path);
        }
        StringBuilder replace = sb.replace(0, 2, "BrowseFolderResponse{");
        replace.append('}');
        return replace.toString();
    }

    public BrowseFolderResponse(SerResp serResp, Map<String, String> map) {
        this(serResp, map, ByteString.EMPTY);
    }

    public BrowseFolderResponse(SerResp serResp, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ser_resp = serResp;
        this.key2path = Internal.immutableCopyOf("key2path", map);
    }
}
