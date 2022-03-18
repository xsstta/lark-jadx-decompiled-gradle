package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class NavigationAppInfo extends Message<NavigationAppInfo, C15085a> {
    public static final ProtoAdapter<NavigationAppInfo> ADAPTER = new C15086b();
    public static final NavigationAppType DEFAULT_APPTYPE = NavigationAppType.APP_TYPE_NATIVE;
    public static final Long DEFAULT_ID = 0L;
    public static final Boolean DEFAULT_PRIMARY_ONLY = false;
    public static final Boolean DEFAULT_UNMOVABLE = false;
    private static final long serialVersionUID = 0;
    public final NavigationAppType appType;
    public final Map<String, String> extra;
    public final Long id;
    public final String key;
    public final Logo logo;
    public final Map<String, String> name;
    public final List<PlatformInfo> platforms;
    public final Boolean primary_only;
    public final Boolean unmovable;

    public enum Platform implements WireEnum {
        Unknown(0),
        Mac(1),
        Windows(2),
        Android(3),
        IPhone(4),
        IPad(5),
        Linux(6);
        
        public static final ProtoAdapter<Platform> ADAPTER = ProtoAdapter.newEnumAdapter(Platform.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Platform fromValue(int i) {
            switch (i) {
                case 0:
                    return Unknown;
                case 1:
                    return Mac;
                case 2:
                    return Windows;
                case 3:
                    return Android;
                case 4:
                    return IPhone;
                case 5:
                    return IPad;
                case 6:
                    return Linux;
                default:
                    return null;
            }
        }

        private Platform(int i) {
            this.value = i;
        }
    }

    public static final class Logo extends Message<Logo, C15079a> {
        public static final ProtoAdapter<Logo> ADAPTER = new C15080b();
        private static final long serialVersionUID = 0;
        public final String primary_color_png;
        public final String primary_default;
        public final String primary_default_svg;
        public final String primary_selected;
        public final String shortcut_default;

        /* renamed from: com.bytedance.lark.pb.basic.v1.NavigationAppInfo$Logo$b */
        private static final class C15080b extends ProtoAdapter<Logo> {
            C15080b() {
                super(FieldEncoding.LENGTH_DELIMITED, Logo.class);
            }

            /* renamed from: a */
            public int encodedSize(Logo logo) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 0;
                if (logo.primary_default != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, logo.primary_default);
                } else {
                    i = 0;
                }
                if (logo.primary_selected != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, logo.primary_selected);
                } else {
                    i2 = 0;
                }
                int i6 = i + i2;
                if (logo.shortcut_default != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, logo.shortcut_default);
                } else {
                    i3 = 0;
                }
                int i7 = i6 + i3;
                if (logo.primary_default_svg != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, logo.primary_default_svg);
                } else {
                    i4 = 0;
                }
                int i8 = i7 + i4;
                if (logo.primary_color_png != null) {
                    i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, logo.primary_color_png);
                }
                return i8 + i5 + logo.unknownFields().size();
            }

            /* renamed from: a */
            public Logo decode(ProtoReader protoReader) throws IOException {
                C15079a aVar = new C15079a();
                aVar.f39948a = "";
                aVar.f39949b = "";
                aVar.f39950c = "";
                aVar.f39951d = "";
                aVar.f39952e = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f39948a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f39949b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f39950c = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 4) {
                        aVar.f39951d = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f39952e = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Logo logo) throws IOException {
                if (logo.primary_default != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, logo.primary_default);
                }
                if (logo.primary_selected != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, logo.primary_selected);
                }
                if (logo.shortcut_default != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, logo.shortcut_default);
                }
                if (logo.primary_default_svg != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, logo.primary_default_svg);
                }
                if (logo.primary_color_png != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, logo.primary_color_png);
                }
                protoWriter.writeBytes(logo.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.NavigationAppInfo$Logo$a */
        public static final class C15079a extends Message.Builder<Logo, C15079a> {

            /* renamed from: a */
            public String f39948a;

            /* renamed from: b */
            public String f39949b;

            /* renamed from: c */
            public String f39950c;

            /* renamed from: d */
            public String f39951d;

            /* renamed from: e */
            public String f39952e;

            /* renamed from: a */
            public Logo build() {
                return new Logo(this.f39948a, this.f39949b, this.f39950c, this.f39951d, this.f39952e, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15079a newBuilder() {
            C15079a aVar = new C15079a();
            aVar.f39948a = this.primary_default;
            aVar.f39949b = this.primary_selected;
            aVar.f39950c = this.shortcut_default;
            aVar.f39951d = this.primary_default_svg;
            aVar.f39952e = this.primary_color_png;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "Logo");
            StringBuilder sb = new StringBuilder();
            if (this.primary_default != null) {
                sb.append(", primary_default=");
                sb.append(this.primary_default);
            }
            if (this.primary_selected != null) {
                sb.append(", primary_selected=");
                sb.append(this.primary_selected);
            }
            if (this.shortcut_default != null) {
                sb.append(", shortcut_default=");
                sb.append(this.shortcut_default);
            }
            if (this.primary_default_svg != null) {
                sb.append(", primary_default_svg=");
                sb.append(this.primary_default_svg);
            }
            if (this.primary_color_png != null) {
                sb.append(", primary_color_png=");
                sb.append(this.primary_color_png);
            }
            StringBuilder replace = sb.replace(0, 2, "Logo{");
            replace.append('}');
            return replace.toString();
        }

        public Logo(String str, String str2, String str3, String str4, String str5) {
            this(str, str2, str3, str4, str5, ByteString.EMPTY);
        }

        public Logo(String str, String str2, String str3, String str4, String str5, ByteString byteString) {
            super(ADAPTER, byteString);
            this.primary_default = str;
            this.primary_selected = str2;
            this.shortcut_default = str3;
            this.primary_default_svg = str4;
            this.primary_color_png = str5;
        }
    }

    public static final class PlatformInfo extends Message<PlatformInfo, C15081a> {
        public static final ProtoAdapter<PlatformInfo> ADAPTER = new C15082b();
        public static final Platform DEFAULT_PLATFORM = Platform.Unknown;
        private static final long serialVersionUID = 0;
        public final Version min_version;
        public final Platform platform;

        /* renamed from: com.bytedance.lark.pb.basic.v1.NavigationAppInfo$PlatformInfo$b */
        private static final class C15082b extends ProtoAdapter<PlatformInfo> {
            C15082b() {
                super(FieldEncoding.LENGTH_DELIMITED, PlatformInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(PlatformInfo platformInfo) {
                int i;
                int i2 = 0;
                if (platformInfo.platform != null) {
                    i = Platform.ADAPTER.encodedSizeWithTag(1, platformInfo.platform);
                } else {
                    i = 0;
                }
                if (platformInfo.min_version != null) {
                    i2 = Version.ADAPTER.encodedSizeWithTag(2, platformInfo.min_version);
                }
                return i + i2 + platformInfo.unknownFields().size();
            }

            /* renamed from: a */
            public PlatformInfo decode(ProtoReader protoReader) throws IOException {
                C15081a aVar = new C15081a();
                aVar.f39953a = Platform.Unknown;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f39953a = Platform.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f39954b = Version.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, PlatformInfo platformInfo) throws IOException {
                if (platformInfo.platform != null) {
                    Platform.ADAPTER.encodeWithTag(protoWriter, 1, platformInfo.platform);
                }
                if (platformInfo.min_version != null) {
                    Version.ADAPTER.encodeWithTag(protoWriter, 2, platformInfo.min_version);
                }
                protoWriter.writeBytes(platformInfo.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.NavigationAppInfo$PlatformInfo$a */
        public static final class C15081a extends Message.Builder<PlatformInfo, C15081a> {

            /* renamed from: a */
            public Platform f39953a;

            /* renamed from: b */
            public Version f39954b;

            /* renamed from: a */
            public PlatformInfo build() {
                return new PlatformInfo(this.f39953a, this.f39954b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15081a newBuilder() {
            C15081a aVar = new C15081a();
            aVar.f39953a = this.platform;
            aVar.f39954b = this.min_version;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "PlatformInfo");
            StringBuilder sb = new StringBuilder();
            if (this.platform != null) {
                sb.append(", platform=");
                sb.append(this.platform);
            }
            if (this.min_version != null) {
                sb.append(", min_version=");
                sb.append(this.min_version);
            }
            StringBuilder replace = sb.replace(0, 2, "PlatformInfo{");
            replace.append('}');
            return replace.toString();
        }

        public PlatformInfo(Platform platform2, Version version) {
            this(platform2, version, ByteString.EMPTY);
        }

        public PlatformInfo(Platform platform2, Version version, ByteString byteString) {
            super(ADAPTER, byteString);
            this.platform = platform2;
            this.min_version = version;
        }
    }

    public static final class Version extends Message<Version, C15083a> {
        public static final ProtoAdapter<Version> ADAPTER = new C15084b();
        public static final Integer DEFAULT_MAJOR = 0;
        public static final Integer DEFAULT_MINOR = 0;
        public static final Integer DEFAULT_PATCH = 0;
        private static final long serialVersionUID = 0;
        public final Integer major;
        public final Integer minor;
        public final Integer patch;

        /* renamed from: com.bytedance.lark.pb.basic.v1.NavigationAppInfo$Version$b */
        private static final class C15084b extends ProtoAdapter<Version> {
            C15084b() {
                super(FieldEncoding.LENGTH_DELIMITED, Version.class);
            }

            /* renamed from: a */
            public int encodedSize(Version version) {
                int i;
                int i2;
                int i3 = 0;
                if (version.major != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(1, version.major);
                } else {
                    i = 0;
                }
                if (version.minor != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, version.minor);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (version.patch != null) {
                    i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, version.patch);
                }
                return i4 + i3 + version.unknownFields().size();
            }

            /* renamed from: a */
            public Version decode(ProtoReader protoReader) throws IOException {
                C15083a aVar = new C15083a();
                aVar.f39955a = 0;
                aVar.f39956b = 0;
                aVar.f39957c = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f39955a = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f39956b = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f39957c = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Version version) throws IOException {
                if (version.major != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, version.major);
                }
                if (version.minor != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, version.minor);
                }
                if (version.patch != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, version.patch);
                }
                protoWriter.writeBytes(version.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.NavigationAppInfo$Version$a */
        public static final class C15083a extends Message.Builder<Version, C15083a> {

            /* renamed from: a */
            public Integer f39955a;

            /* renamed from: b */
            public Integer f39956b;

            /* renamed from: c */
            public Integer f39957c;

            /* renamed from: a */
            public Version build() {
                return new Version(this.f39955a, this.f39956b, this.f39957c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15083a newBuilder() {
            C15083a aVar = new C15083a();
            aVar.f39955a = this.major;
            aVar.f39956b = this.minor;
            aVar.f39957c = this.patch;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "Version");
            StringBuilder sb = new StringBuilder();
            if (this.major != null) {
                sb.append(", major=");
                sb.append(this.major);
            }
            if (this.minor != null) {
                sb.append(", minor=");
                sb.append(this.minor);
            }
            if (this.patch != null) {
                sb.append(", patch=");
                sb.append(this.patch);
            }
            StringBuilder replace = sb.replace(0, 2, "Version{");
            replace.append('}');
            return replace.toString();
        }

        public Version(Integer num, Integer num2, Integer num3) {
            this(num, num2, num3, ByteString.EMPTY);
        }

        public Version(Integer num, Integer num2, Integer num3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.major = num;
            this.minor = num2;
            this.patch = num3;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.NavigationAppInfo$b */
    private static final class C15086b extends ProtoAdapter<NavigationAppInfo> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f39967a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, String>> f39968b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C15086b() {
            super(FieldEncoding.LENGTH_DELIMITED, NavigationAppInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(NavigationAppInfo navigationAppInfo) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, navigationAppInfo.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, navigationAppInfo.key) + NavigationAppType.ADAPTER.encodedSizeWithTag(3, navigationAppInfo.appType) + this.f39967a.encodedSizeWithTag(4, navigationAppInfo.name);
            int i3 = 0;
            if (navigationAppInfo.logo != null) {
                i = Logo.ADAPTER.encodedSizeWithTag(5, navigationAppInfo.logo);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + PlatformInfo.ADAPTER.asRepeated().encodedSizeWithTag(6, navigationAppInfo.platforms) + this.f39968b.encodedSizeWithTag(7, navigationAppInfo.extra);
            if (navigationAppInfo.primary_only != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(30, navigationAppInfo.primary_only);
            } else {
                i2 = 0;
            }
            int i4 = encodedSizeWithTag2 + i2;
            if (navigationAppInfo.unmovable != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(31, navigationAppInfo.unmovable);
            }
            return i4 + i3 + navigationAppInfo.unknownFields().size();
        }

        /* renamed from: a */
        public NavigationAppInfo decode(ProtoReader protoReader) throws IOException {
            C15085a aVar = new C15085a();
            aVar.f39958a = 0L;
            aVar.f39959b = "";
            aVar.f39960c = NavigationAppType.APP_TYPE_NATIVE;
            aVar.f39965h = false;
            aVar.f39966i = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 30) {
                    aVar.f39965h = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 31) {
                    switch (nextTag) {
                        case 1:
                            aVar.f39958a = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case 2:
                            aVar.f39959b = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 3:
                            try {
                                aVar.f39960c = NavigationAppType.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f39961d.putAll(this.f39967a.decode(protoReader));
                            continue;
                        case 5:
                            aVar.f39962e = Logo.ADAPTER.decode(protoReader);
                            continue;
                        case 6:
                            aVar.f39963f.add(PlatformInfo.ADAPTER.decode(protoReader));
                            continue;
                        case 7:
                            aVar.f39964g.putAll(this.f39968b.decode(protoReader));
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    aVar.f39966i = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, NavigationAppInfo navigationAppInfo) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, navigationAppInfo.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, navigationAppInfo.key);
            NavigationAppType.ADAPTER.encodeWithTag(protoWriter, 3, navigationAppInfo.appType);
            this.f39967a.encodeWithTag(protoWriter, 4, navigationAppInfo.name);
            if (navigationAppInfo.logo != null) {
                Logo.ADAPTER.encodeWithTag(protoWriter, 5, navigationAppInfo.logo);
            }
            PlatformInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, navigationAppInfo.platforms);
            this.f39968b.encodeWithTag(protoWriter, 7, navigationAppInfo.extra);
            if (navigationAppInfo.primary_only != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 30, navigationAppInfo.primary_only);
            }
            if (navigationAppInfo.unmovable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 31, navigationAppInfo.unmovable);
            }
            protoWriter.writeBytes(navigationAppInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.NavigationAppInfo$a */
    public static final class C15085a extends Message.Builder<NavigationAppInfo, C15085a> {

        /* renamed from: a */
        public Long f39958a;

        /* renamed from: b */
        public String f39959b;

        /* renamed from: c */
        public NavigationAppType f39960c;

        /* renamed from: d */
        public Map<String, String> f39961d = Internal.newMutableMap();

        /* renamed from: e */
        public Logo f39962e;

        /* renamed from: f */
        public List<PlatformInfo> f39963f = Internal.newMutableList();

        /* renamed from: g */
        public Map<String, String> f39964g = Internal.newMutableMap();

        /* renamed from: h */
        public Boolean f39965h;

        /* renamed from: i */
        public Boolean f39966i;

        /* renamed from: a */
        public NavigationAppInfo build() {
            String str;
            NavigationAppType navigationAppType;
            Long l = this.f39958a;
            if (l != null && (str = this.f39959b) != null && (navigationAppType = this.f39960c) != null) {
                return new NavigationAppInfo(l, str, navigationAppType, this.f39961d, this.f39962e, this.f39963f, this.f39964g, this.f39965h, this.f39966i, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l, "id", this.f39959b, "key", this.f39960c, "appType");
        }
    }

    @Override // com.squareup.wire.Message
    public C15085a newBuilder() {
        C15085a aVar = new C15085a();
        aVar.f39958a = this.id;
        aVar.f39959b = this.key;
        aVar.f39960c = this.appType;
        aVar.f39961d = Internal.copyOf("name", this.name);
        aVar.f39962e = this.logo;
        aVar.f39963f = Internal.copyOf("platforms", this.platforms);
        aVar.f39964g = Internal.copyOf("extra", this.extra);
        aVar.f39965h = this.primary_only;
        aVar.f39966i = this.unmovable;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "NavigationAppInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", appType=");
        sb.append(this.appType);
        if (!this.name.isEmpty()) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.logo != null) {
            sb.append(", logo=");
            sb.append(this.logo);
        }
        if (!this.platforms.isEmpty()) {
            sb.append(", platforms=");
            sb.append(this.platforms);
        }
        if (!this.extra.isEmpty()) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        if (this.primary_only != null) {
            sb.append(", primary_only=");
            sb.append(this.primary_only);
        }
        if (this.unmovable != null) {
            sb.append(", unmovable=");
            sb.append(this.unmovable);
        }
        StringBuilder replace = sb.replace(0, 2, "NavigationAppInfo{");
        replace.append('}');
        return replace.toString();
    }

    public NavigationAppInfo(Long l, String str, NavigationAppType navigationAppType, Map<String, String> map, Logo logo2, List<PlatformInfo> list, Map<String, String> map2, Boolean bool, Boolean bool2) {
        this(l, str, navigationAppType, map, logo2, list, map2, bool, bool2, ByteString.EMPTY);
    }

    public NavigationAppInfo(Long l, String str, NavigationAppType navigationAppType, Map<String, String> map, Logo logo2, List<PlatformInfo> list, Map<String, String> map2, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = l;
        this.key = str;
        this.appType = navigationAppType;
        this.name = Internal.immutableCopyOf("name", map);
        this.logo = logo2;
        this.platforms = Internal.immutableCopyOf("platforms", list);
        this.extra = Internal.immutableCopyOf("extra", map2);
        this.primary_only = bool;
        this.unmovable = bool2;
    }
}
