package com.google.protobuf.server;

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

public final class FileOptions extends Message<FileOptions, C23161a> {
    public static final ProtoAdapter<FileOptions> ADAPTER = new C23162b();
    public static final Boolean DEFAULT_CC_ENABLE_ARENAS = false;
    public static final Boolean DEFAULT_CC_GENERIC_SERVICES = false;
    public static final String DEFAULT_CSHARP_NAMESPACE = "";
    public static final Boolean DEFAULT_DEPRECATED = false;
    public static final String DEFAULT_GO_PACKAGE = "";
    public static final Boolean DEFAULT_JAVA_GENERATE_EQUALS_AND_HASH = false;
    public static final Boolean DEFAULT_JAVA_GENERIC_SERVICES = false;
    public static final Boolean DEFAULT_JAVA_MULTIPLE_FILES = false;
    public static final String DEFAULT_JAVA_OUTER_CLASSNAME = "";
    public static final String DEFAULT_JAVA_PACKAGE = "";
    public static final Boolean DEFAULT_JAVA_STRING_CHECK_UTF8 = false;
    public static final String DEFAULT_OBJC_CLASS_PREFIX = "";
    public static final String DEFAULT_PHP_CLASS_PREFIX = "";
    public static final Boolean DEFAULT_PHP_GENERIC_SERVICES = false;
    public static final String DEFAULT_PHP_NAMESPACE = "";
    public static final Boolean DEFAULT_PY_GENERIC_SERVICES = false;
    public static final String DEFAULT_SWIFT_PREFIX = "";
    private static final long serialVersionUID = 0;
    public final Boolean mcc_enable_arenas;
    public final Boolean mcc_generic_services;
    public final String mcsharp_namespace;
    public final Boolean mdeprecated;
    public final String mgo_package;
    public final Boolean mjava_generate_equals_and_hash;
    public final Boolean mjava_generic_services;
    public final Boolean mjava_multiple_files;
    public final String mjava_outer_classname;
    public final String mjava_package;
    public final Boolean mjava_string_check_utf8;
    public final String mobjc_class_prefix;
    public final OptimizeMode moptimize_for;
    public final String mphp_class_prefix;
    public final Boolean mphp_generic_services;
    public final String mphp_namespace;
    public final Boolean mpy_generic_services;
    public final String mswift_prefix;
    public final List<UninterpretedOption> muninterpreted_option;

    public enum OptimizeMode implements WireEnum {
        SPEED(1),
        CODE_SIZE(2),
        LITE_RUNTIME(3);
        
        public static final ProtoAdapter<OptimizeMode> ADAPTER = ProtoAdapter.newEnumAdapter(OptimizeMode.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static OptimizeMode fromValue(int i) {
            if (i == 1) {
                return SPEED;
            }
            if (i == 2) {
                return CODE_SIZE;
            }
            if (i != 3) {
                return null;
            }
            return LITE_RUNTIME;
        }

        private OptimizeMode(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.google.protobuf.server.FileOptions$b */
    private static final class C23162b extends ProtoAdapter<FileOptions> {
        C23162b() {
            super(FieldEncoding.LENGTH_DELIMITED, FileOptions.class);
        }

        /* renamed from: a */
        public int encodedSize(FileOptions fileOptions) {
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
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18 = 0;
            if (fileOptions.mjava_package != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, fileOptions.mjava_package);
            } else {
                i = 0;
            }
            if (fileOptions.mjava_outer_classname != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(8, fileOptions.mjava_outer_classname);
            } else {
                i2 = 0;
            }
            int i19 = i + i2;
            if (fileOptions.mjava_multiple_files != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(10, fileOptions.mjava_multiple_files);
            } else {
                i3 = 0;
            }
            int i20 = i19 + i3;
            if (fileOptions.mjava_generate_equals_and_hash != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(20, fileOptions.mjava_generate_equals_and_hash);
            } else {
                i4 = 0;
            }
            int i21 = i20 + i4;
            if (fileOptions.mjava_string_check_utf8 != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(27, fileOptions.mjava_string_check_utf8);
            } else {
                i5 = 0;
            }
            int i22 = i21 + i5;
            if (fileOptions.moptimize_for != null) {
                i6 = OptimizeMode.ADAPTER.encodedSizeWithTag(9, fileOptions.moptimize_for);
            } else {
                i6 = 0;
            }
            int i23 = i22 + i6;
            if (fileOptions.mgo_package != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(11, fileOptions.mgo_package);
            } else {
                i7 = 0;
            }
            int i24 = i23 + i7;
            if (fileOptions.mcc_generic_services != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(16, fileOptions.mcc_generic_services);
            } else {
                i8 = 0;
            }
            int i25 = i24 + i8;
            if (fileOptions.mjava_generic_services != null) {
                i9 = ProtoAdapter.BOOL.encodedSizeWithTag(17, fileOptions.mjava_generic_services);
            } else {
                i9 = 0;
            }
            int i26 = i25 + i9;
            if (fileOptions.mpy_generic_services != null) {
                i10 = ProtoAdapter.BOOL.encodedSizeWithTag(18, fileOptions.mpy_generic_services);
            } else {
                i10 = 0;
            }
            int i27 = i26 + i10;
            if (fileOptions.mphp_generic_services != null) {
                i11 = ProtoAdapter.BOOL.encodedSizeWithTag(19, fileOptions.mphp_generic_services);
            } else {
                i11 = 0;
            }
            int i28 = i27 + i11;
            if (fileOptions.mdeprecated != null) {
                i12 = ProtoAdapter.BOOL.encodedSizeWithTag(23, fileOptions.mdeprecated);
            } else {
                i12 = 0;
            }
            int i29 = i28 + i12;
            if (fileOptions.mcc_enable_arenas != null) {
                i13 = ProtoAdapter.BOOL.encodedSizeWithTag(31, fileOptions.mcc_enable_arenas);
            } else {
                i13 = 0;
            }
            int i30 = i29 + i13;
            if (fileOptions.mobjc_class_prefix != null) {
                i14 = ProtoAdapter.STRING.encodedSizeWithTag(36, fileOptions.mobjc_class_prefix);
            } else {
                i14 = 0;
            }
            int i31 = i30 + i14;
            if (fileOptions.mcsharp_namespace != null) {
                i15 = ProtoAdapter.STRING.encodedSizeWithTag(37, fileOptions.mcsharp_namespace);
            } else {
                i15 = 0;
            }
            int i32 = i31 + i15;
            if (fileOptions.mswift_prefix != null) {
                i16 = ProtoAdapter.STRING.encodedSizeWithTag(39, fileOptions.mswift_prefix);
            } else {
                i16 = 0;
            }
            int i33 = i32 + i16;
            if (fileOptions.mphp_class_prefix != null) {
                i17 = ProtoAdapter.STRING.encodedSizeWithTag(40, fileOptions.mphp_class_prefix);
            } else {
                i17 = 0;
            }
            int i34 = i33 + i17;
            if (fileOptions.mphp_namespace != null) {
                i18 = ProtoAdapter.STRING.encodedSizeWithTag(41, fileOptions.mphp_namespace);
            }
            return i34 + i18 + UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999, fileOptions.muninterpreted_option) + fileOptions.unknownFields().size();
        }

        /* renamed from: a */
        public FileOptions decode(ProtoReader protoReader) throws IOException {
            C23161a aVar = new C23161a();
            aVar.f57145a = "";
            aVar.f57146b = "";
            aVar.f57147c = false;
            aVar.f57148d = false;
            aVar.f57149e = false;
            aVar.f57151g = "";
            aVar.f57152h = false;
            aVar.f57153i = false;
            aVar.f57154j = false;
            aVar.f57155k = false;
            aVar.f57156l = false;
            aVar.f57157m = false;
            aVar.f57158n = "";
            aVar.f57159o = "";
            aVar.f57160p = "";
            aVar.f57161q = "";
            aVar.f57162r = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f57145a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 23) {
                    aVar.f57156l = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 27) {
                    aVar.f57149e = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 31) {
                    aVar.f57157m = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 999) {
                    aVar.f57163s.add(UninterpretedOption.ADAPTER.decode(protoReader));
                } else if (nextTag == 36) {
                    aVar.f57158n = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 37) {
                    switch (nextTag) {
                        case 8:
                            aVar.f57146b = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 9:
                            try {
                                aVar.f57150f = OptimizeMode.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 10:
                            aVar.f57147c = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 11:
                            aVar.f57151g = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        default:
                            switch (nextTag) {
                                case 16:
                                    aVar.f57152h = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 17:
                                    aVar.f57153i = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 18:
                                    aVar.f57154j = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 19:
                                    aVar.f57155k = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 20:
                                    aVar.f57148d = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                default:
                                    switch (nextTag) {
                                        case 39:
                                            aVar.f57160p = ProtoAdapter.STRING.decode(protoReader);
                                            continue;
                                        case 40:
                                            aVar.f57161q = ProtoAdapter.STRING.decode(protoReader);
                                            continue;
                                        case 41:
                                            aVar.f57162r = ProtoAdapter.STRING.decode(protoReader);
                                            continue;
                                        default:
                                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                            continue;
                                            continue;
                                            continue;
                                    }
                            }
                    }
                } else {
                    aVar.f57159o = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FileOptions fileOptions) throws IOException {
            if (fileOptions.mjava_package != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, fileOptions.mjava_package);
            }
            if (fileOptions.mjava_outer_classname != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, fileOptions.mjava_outer_classname);
            }
            if (fileOptions.mjava_multiple_files != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, fileOptions.mjava_multiple_files);
            }
            if (fileOptions.mjava_generate_equals_and_hash != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 20, fileOptions.mjava_generate_equals_and_hash);
            }
            if (fileOptions.mjava_string_check_utf8 != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 27, fileOptions.mjava_string_check_utf8);
            }
            if (fileOptions.moptimize_for != null) {
                OptimizeMode.ADAPTER.encodeWithTag(protoWriter, 9, fileOptions.moptimize_for);
            }
            if (fileOptions.mgo_package != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, fileOptions.mgo_package);
            }
            if (fileOptions.mcc_generic_services != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 16, fileOptions.mcc_generic_services);
            }
            if (fileOptions.mjava_generic_services != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 17, fileOptions.mjava_generic_services);
            }
            if (fileOptions.mpy_generic_services != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 18, fileOptions.mpy_generic_services);
            }
            if (fileOptions.mphp_generic_services != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 19, fileOptions.mphp_generic_services);
            }
            if (fileOptions.mdeprecated != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 23, fileOptions.mdeprecated);
            }
            if (fileOptions.mcc_enable_arenas != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 31, fileOptions.mcc_enable_arenas);
            }
            if (fileOptions.mobjc_class_prefix != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 36, fileOptions.mobjc_class_prefix);
            }
            if (fileOptions.mcsharp_namespace != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 37, fileOptions.mcsharp_namespace);
            }
            if (fileOptions.mswift_prefix != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 39, fileOptions.mswift_prefix);
            }
            if (fileOptions.mphp_class_prefix != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 40, fileOptions.mphp_class_prefix);
            }
            if (fileOptions.mphp_namespace != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 41, fileOptions.mphp_namespace);
            }
            UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(protoWriter, 999, fileOptions.muninterpreted_option);
            protoWriter.writeBytes(fileOptions.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.server.FileOptions$a */
    public static final class C23161a extends Message.Builder<FileOptions, C23161a> {

        /* renamed from: a */
        public String f57145a;

        /* renamed from: b */
        public String f57146b;

        /* renamed from: c */
        public Boolean f57147c;

        /* renamed from: d */
        public Boolean f57148d;

        /* renamed from: e */
        public Boolean f57149e;

        /* renamed from: f */
        public OptimizeMode f57150f;

        /* renamed from: g */
        public String f57151g;

        /* renamed from: h */
        public Boolean f57152h;

        /* renamed from: i */
        public Boolean f57153i;

        /* renamed from: j */
        public Boolean f57154j;

        /* renamed from: k */
        public Boolean f57155k;

        /* renamed from: l */
        public Boolean f57156l;

        /* renamed from: m */
        public Boolean f57157m;

        /* renamed from: n */
        public String f57158n;

        /* renamed from: o */
        public String f57159o;

        /* renamed from: p */
        public String f57160p;

        /* renamed from: q */
        public String f57161q;

        /* renamed from: r */
        public String f57162r;

        /* renamed from: s */
        public List<UninterpretedOption> f57163s = Internal.newMutableList();

        /* renamed from: a */
        public FileOptions build() {
            return new FileOptions(this.f57145a, this.f57146b, this.f57147c, this.f57148d, this.f57149e, this.f57150f, this.f57151g, this.f57152h, this.f57153i, this.f57154j, this.f57155k, this.f57156l, this.f57157m, this.f57158n, this.f57159o, this.f57160p, this.f57161q, this.f57162r, this.f57163s, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23161a newBuilder() {
        C23161a aVar = new C23161a();
        aVar.f57145a = this.mjava_package;
        aVar.f57146b = this.mjava_outer_classname;
        aVar.f57147c = this.mjava_multiple_files;
        aVar.f57148d = this.mjava_generate_equals_and_hash;
        aVar.f57149e = this.mjava_string_check_utf8;
        aVar.f57150f = this.moptimize_for;
        aVar.f57151g = this.mgo_package;
        aVar.f57152h = this.mcc_generic_services;
        aVar.f57153i = this.mjava_generic_services;
        aVar.f57154j = this.mpy_generic_services;
        aVar.f57155k = this.mphp_generic_services;
        aVar.f57156l = this.mdeprecated;
        aVar.f57157m = this.mcc_enable_arenas;
        aVar.f57158n = this.mobjc_class_prefix;
        aVar.f57159o = this.mcsharp_namespace;
        aVar.f57160p = this.mswift_prefix;
        aVar.f57161q = this.mphp_class_prefix;
        aVar.f57162r = this.mphp_namespace;
        aVar.f57163s = Internal.copyOf("muninterpreted_option", this.muninterpreted_option);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mjava_package != null) {
            sb.append(", java_package=");
            sb.append(this.mjava_package);
        }
        if (this.mjava_outer_classname != null) {
            sb.append(", java_outer_classname=");
            sb.append(this.mjava_outer_classname);
        }
        if (this.mjava_multiple_files != null) {
            sb.append(", java_multiple_files=");
            sb.append(this.mjava_multiple_files);
        }
        if (this.mjava_generate_equals_and_hash != null) {
            sb.append(", java_generate_equals_and_hash=");
            sb.append(this.mjava_generate_equals_and_hash);
        }
        if (this.mjava_string_check_utf8 != null) {
            sb.append(", java_string_check_utf8=");
            sb.append(this.mjava_string_check_utf8);
        }
        if (this.moptimize_for != null) {
            sb.append(", optimize_for=");
            sb.append(this.moptimize_for);
        }
        if (this.mgo_package != null) {
            sb.append(", go_package=");
            sb.append(this.mgo_package);
        }
        if (this.mcc_generic_services != null) {
            sb.append(", cc_generic_services=");
            sb.append(this.mcc_generic_services);
        }
        if (this.mjava_generic_services != null) {
            sb.append(", java_generic_services=");
            sb.append(this.mjava_generic_services);
        }
        if (this.mpy_generic_services != null) {
            sb.append(", py_generic_services=");
            sb.append(this.mpy_generic_services);
        }
        if (this.mphp_generic_services != null) {
            sb.append(", php_generic_services=");
            sb.append(this.mphp_generic_services);
        }
        if (this.mdeprecated != null) {
            sb.append(", deprecated=");
            sb.append(this.mdeprecated);
        }
        if (this.mcc_enable_arenas != null) {
            sb.append(", cc_enable_arenas=");
            sb.append(this.mcc_enable_arenas);
        }
        if (this.mobjc_class_prefix != null) {
            sb.append(", objc_class_prefix=");
            sb.append(this.mobjc_class_prefix);
        }
        if (this.mcsharp_namespace != null) {
            sb.append(", csharp_namespace=");
            sb.append(this.mcsharp_namespace);
        }
        if (this.mswift_prefix != null) {
            sb.append(", swift_prefix=");
            sb.append(this.mswift_prefix);
        }
        if (this.mphp_class_prefix != null) {
            sb.append(", php_class_prefix=");
            sb.append(this.mphp_class_prefix);
        }
        if (this.mphp_namespace != null) {
            sb.append(", php_namespace=");
            sb.append(this.mphp_namespace);
        }
        if (!this.muninterpreted_option.isEmpty()) {
            sb.append(", uninterpreted_option=");
            sb.append(this.muninterpreted_option);
        }
        StringBuilder replace = sb.replace(0, 2, "FileOptions{");
        replace.append('}');
        return replace.toString();
    }

    public FileOptions(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, OptimizeMode optimizeMode, String str3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, String str4, String str5, String str6, String str7, String str8, List<UninterpretedOption> list) {
        this(str, str2, bool, bool2, bool3, optimizeMode, str3, bool4, bool5, bool6, bool7, bool8, bool9, str4, str5, str6, str7, str8, list, ByteString.EMPTY);
    }

    public FileOptions(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, OptimizeMode optimizeMode, String str3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, String str4, String str5, String str6, String str7, String str8, List<UninterpretedOption> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mjava_package = str;
        this.mjava_outer_classname = str2;
        this.mjava_multiple_files = bool;
        this.mjava_generate_equals_and_hash = bool2;
        this.mjava_string_check_utf8 = bool3;
        this.moptimize_for = optimizeMode;
        this.mgo_package = str3;
        this.mcc_generic_services = bool4;
        this.mjava_generic_services = bool5;
        this.mpy_generic_services = bool6;
        this.mphp_generic_services = bool7;
        this.mdeprecated = bool8;
        this.mcc_enable_arenas = bool9;
        this.mobjc_class_prefix = str4;
        this.mcsharp_namespace = str5;
        this.mswift_prefix = str6;
        this.mphp_class_prefix = str7;
        this.mphp_namespace = str8;
        this.muninterpreted_option = Internal.immutableCopyOf("muninterpreted_option", list);
    }
}
