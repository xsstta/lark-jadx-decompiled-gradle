package com.google.protobuf;

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
import okio.ByteString;

public final class FileOptions extends Message<FileOptions, C23065a> {
    public static final ProtoAdapter<FileOptions> ADAPTER = new C23066b();
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
    public static final OptimizeMode DEFAULT_OPTIMIZE_FOR = OptimizeMode.SPEED;
    public static final Boolean DEFAULT_PY_GENERIC_SERVICES = false;
    private static final long serialVersionUID = 0;
    public final Boolean cc_enable_arenas;
    public final Boolean cc_generic_services;
    public final String csharp_namespace;
    public final Boolean deprecated;
    public final String go_package;
    public final Boolean java_generate_equals_and_hash;
    public final Boolean java_generic_services;
    public final Boolean java_multiple_files;
    public final String java_outer_classname;
    public final String java_package;
    public final Boolean java_string_check_utf8;
    public final String objc_class_prefix;
    public final OptimizeMode optimize_for;
    public final Boolean py_generic_services;
    public final List<UninterpretedOption> uninterpreted_option;

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

    /* renamed from: com.google.protobuf.FileOptions$b */
    private static final class C23066b extends ProtoAdapter<FileOptions> {
        C23066b() {
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
            int i14 = 0;
            if (fileOptions.java_package != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, fileOptions.java_package);
            } else {
                i = 0;
            }
            if (fileOptions.java_outer_classname != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(8, fileOptions.java_outer_classname);
            } else {
                i2 = 0;
            }
            int i15 = i + i2;
            if (fileOptions.java_multiple_files != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(10, fileOptions.java_multiple_files);
            } else {
                i3 = 0;
            }
            int i16 = i15 + i3;
            if (fileOptions.java_generate_equals_and_hash != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(20, fileOptions.java_generate_equals_and_hash);
            } else {
                i4 = 0;
            }
            int i17 = i16 + i4;
            if (fileOptions.java_string_check_utf8 != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(27, fileOptions.java_string_check_utf8);
            } else {
                i5 = 0;
            }
            int i18 = i17 + i5;
            if (fileOptions.optimize_for != null) {
                i6 = OptimizeMode.ADAPTER.encodedSizeWithTag(9, fileOptions.optimize_for);
            } else {
                i6 = 0;
            }
            int i19 = i18 + i6;
            if (fileOptions.go_package != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(11, fileOptions.go_package);
            } else {
                i7 = 0;
            }
            int i20 = i19 + i7;
            if (fileOptions.cc_generic_services != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(16, fileOptions.cc_generic_services);
            } else {
                i8 = 0;
            }
            int i21 = i20 + i8;
            if (fileOptions.java_generic_services != null) {
                i9 = ProtoAdapter.BOOL.encodedSizeWithTag(17, fileOptions.java_generic_services);
            } else {
                i9 = 0;
            }
            int i22 = i21 + i9;
            if (fileOptions.py_generic_services != null) {
                i10 = ProtoAdapter.BOOL.encodedSizeWithTag(18, fileOptions.py_generic_services);
            } else {
                i10 = 0;
            }
            int i23 = i22 + i10;
            if (fileOptions.deprecated != null) {
                i11 = ProtoAdapter.BOOL.encodedSizeWithTag(23, fileOptions.deprecated);
            } else {
                i11 = 0;
            }
            int i24 = i23 + i11;
            if (fileOptions.cc_enable_arenas != null) {
                i12 = ProtoAdapter.BOOL.encodedSizeWithTag(31, fileOptions.cc_enable_arenas);
            } else {
                i12 = 0;
            }
            int i25 = i24 + i12;
            if (fileOptions.objc_class_prefix != null) {
                i13 = ProtoAdapter.STRING.encodedSizeWithTag(36, fileOptions.objc_class_prefix);
            } else {
                i13 = 0;
            }
            int i26 = i25 + i13;
            if (fileOptions.csharp_namespace != null) {
                i14 = ProtoAdapter.STRING.encodedSizeWithTag(37, fileOptions.csharp_namespace);
            }
            return i26 + i14 + UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999, fileOptions.uninterpreted_option) + fileOptions.unknownFields().size();
        }

        /* renamed from: a */
        public FileOptions decode(ProtoReader protoReader) throws IOException {
            C23065a aVar = new C23065a();
            aVar.f56965a = "";
            aVar.f56966b = "";
            aVar.f56967c = false;
            aVar.f56968d = false;
            aVar.f56969e = false;
            aVar.f56970f = OptimizeMode.SPEED;
            aVar.f56971g = "";
            aVar.f56972h = false;
            aVar.f56973i = false;
            aVar.f56974j = false;
            aVar.f56975k = false;
            aVar.f56976l = false;
            aVar.f56977m = "";
            aVar.f56978n = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f56965a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 20) {
                    aVar.f56968d = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 23) {
                    aVar.f56975k = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 27) {
                    aVar.f56969e = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 31) {
                    aVar.f56976l = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 999) {
                    aVar.f56979o.add(UninterpretedOption.ADAPTER.decode(protoReader));
                } else if (nextTag == 36) {
                    aVar.f56977m = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 37) {
                    switch (nextTag) {
                        case 8:
                            aVar.f56966b = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 9:
                            try {
                                aVar.f56970f = OptimizeMode.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 10:
                            aVar.f56967c = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 11:
                            aVar.f56971g = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        default:
                            switch (nextTag) {
                                case 16:
                                    aVar.f56972h = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 17:
                                    aVar.f56973i = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 18:
                                    aVar.f56974j = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                default:
                                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    continue;
                                    continue;
                            }
                    }
                } else {
                    aVar.f56978n = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FileOptions fileOptions) throws IOException {
            if (fileOptions.java_package != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, fileOptions.java_package);
            }
            if (fileOptions.java_outer_classname != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, fileOptions.java_outer_classname);
            }
            if (fileOptions.java_multiple_files != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, fileOptions.java_multiple_files);
            }
            if (fileOptions.java_generate_equals_and_hash != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 20, fileOptions.java_generate_equals_and_hash);
            }
            if (fileOptions.java_string_check_utf8 != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 27, fileOptions.java_string_check_utf8);
            }
            if (fileOptions.optimize_for != null) {
                OptimizeMode.ADAPTER.encodeWithTag(protoWriter, 9, fileOptions.optimize_for);
            }
            if (fileOptions.go_package != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, fileOptions.go_package);
            }
            if (fileOptions.cc_generic_services != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 16, fileOptions.cc_generic_services);
            }
            if (fileOptions.java_generic_services != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 17, fileOptions.java_generic_services);
            }
            if (fileOptions.py_generic_services != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 18, fileOptions.py_generic_services);
            }
            if (fileOptions.deprecated != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 23, fileOptions.deprecated);
            }
            if (fileOptions.cc_enable_arenas != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 31, fileOptions.cc_enable_arenas);
            }
            if (fileOptions.objc_class_prefix != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 36, fileOptions.objc_class_prefix);
            }
            if (fileOptions.csharp_namespace != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 37, fileOptions.csharp_namespace);
            }
            UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(protoWriter, 999, fileOptions.uninterpreted_option);
            protoWriter.writeBytes(fileOptions.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.FileOptions$a */
    public static final class C23065a extends Message.Builder<FileOptions, C23065a> {

        /* renamed from: a */
        public String f56965a;

        /* renamed from: b */
        public String f56966b;

        /* renamed from: c */
        public Boolean f56967c;

        /* renamed from: d */
        public Boolean f56968d;

        /* renamed from: e */
        public Boolean f56969e;

        /* renamed from: f */
        public OptimizeMode f56970f;

        /* renamed from: g */
        public String f56971g;

        /* renamed from: h */
        public Boolean f56972h;

        /* renamed from: i */
        public Boolean f56973i;

        /* renamed from: j */
        public Boolean f56974j;

        /* renamed from: k */
        public Boolean f56975k;

        /* renamed from: l */
        public Boolean f56976l;

        /* renamed from: m */
        public String f56977m;

        /* renamed from: n */
        public String f56978n;

        /* renamed from: o */
        public List<UninterpretedOption> f56979o = Internal.newMutableList();

        /* renamed from: a */
        public FileOptions build() {
            return new FileOptions(this.f56965a, this.f56966b, this.f56967c, this.f56968d, this.f56969e, this.f56970f, this.f56971g, this.f56972h, this.f56973i, this.f56974j, this.f56975k, this.f56976l, this.f56977m, this.f56978n, this.f56979o, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23065a newBuilder() {
        C23065a aVar = new C23065a();
        aVar.f56965a = this.java_package;
        aVar.f56966b = this.java_outer_classname;
        aVar.f56967c = this.java_multiple_files;
        aVar.f56968d = this.java_generate_equals_and_hash;
        aVar.f56969e = this.java_string_check_utf8;
        aVar.f56970f = this.optimize_for;
        aVar.f56971g = this.go_package;
        aVar.f56972h = this.cc_generic_services;
        aVar.f56973i = this.java_generic_services;
        aVar.f56974j = this.py_generic_services;
        aVar.f56975k = this.deprecated;
        aVar.f56976l = this.cc_enable_arenas;
        aVar.f56977m = this.objc_class_prefix;
        aVar.f56978n = this.csharp_namespace;
        aVar.f56979o = Internal.copyOf("uninterpreted_option", this.uninterpreted_option);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("google", "FileOptions");
        StringBuilder sb = new StringBuilder();
        if (this.java_package != null) {
            sb.append(", java_package=");
            sb.append(this.java_package);
        }
        if (this.java_outer_classname != null) {
            sb.append(", java_outer_classname=");
            sb.append(this.java_outer_classname);
        }
        if (this.java_multiple_files != null) {
            sb.append(", java_multiple_files=");
            sb.append(this.java_multiple_files);
        }
        if (this.java_generate_equals_and_hash != null) {
            sb.append(", java_generate_equals_and_hash=");
            sb.append(this.java_generate_equals_and_hash);
        }
        if (this.java_string_check_utf8 != null) {
            sb.append(", java_string_check_utf8=");
            sb.append(this.java_string_check_utf8);
        }
        if (this.optimize_for != null) {
            sb.append(", optimize_for=");
            sb.append(this.optimize_for);
        }
        if (this.go_package != null) {
            sb.append(", go_package=");
            sb.append(this.go_package);
        }
        if (this.cc_generic_services != null) {
            sb.append(", cc_generic_services=");
            sb.append(this.cc_generic_services);
        }
        if (this.java_generic_services != null) {
            sb.append(", java_generic_services=");
            sb.append(this.java_generic_services);
        }
        if (this.py_generic_services != null) {
            sb.append(", py_generic_services=");
            sb.append(this.py_generic_services);
        }
        if (this.deprecated != null) {
            sb.append(", deprecated=");
            sb.append(this.deprecated);
        }
        if (this.cc_enable_arenas != null) {
            sb.append(", cc_enable_arenas=");
            sb.append(this.cc_enable_arenas);
        }
        if (this.objc_class_prefix != null) {
            sb.append(", objc_class_prefix=");
            sb.append(this.objc_class_prefix);
        }
        if (this.csharp_namespace != null) {
            sb.append(", csharp_namespace=");
            sb.append(this.csharp_namespace);
        }
        if (!this.uninterpreted_option.isEmpty()) {
            sb.append(", uninterpreted_option=");
            sb.append(this.uninterpreted_option);
        }
        StringBuilder replace = sb.replace(0, 2, "FileOptions{");
        replace.append('}');
        return replace.toString();
    }

    public FileOptions(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, OptimizeMode optimizeMode, String str3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, String str4, String str5, List<UninterpretedOption> list) {
        this(str, str2, bool, bool2, bool3, optimizeMode, str3, bool4, bool5, bool6, bool7, bool8, str4, str5, list, ByteString.EMPTY);
    }

    public FileOptions(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, OptimizeMode optimizeMode, String str3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, String str4, String str5, List<UninterpretedOption> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.java_package = str;
        this.java_outer_classname = str2;
        this.java_multiple_files = bool;
        this.java_generate_equals_and_hash = bool2;
        this.java_string_check_utf8 = bool3;
        this.optimize_for = optimizeMode;
        this.go_package = str3;
        this.cc_generic_services = bool4;
        this.java_generic_services = bool5;
        this.py_generic_services = bool6;
        this.deprecated = bool7;
        this.cc_enable_arenas = bool8;
        this.objc_class_prefix = str4;
        this.csharp_namespace = str5;
        this.uninterpreted_option = Internal.immutableCopyOf("uninterpreted_option", list);
    }
}
