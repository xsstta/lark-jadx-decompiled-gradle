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

public final class FieldOptions extends Message<FieldOptions, C23059a> {
    public static final ProtoAdapter<FieldOptions> ADAPTER = new C23060b();
    public static final CType DEFAULT_CTYPE = CType.STRING;
    public static final Boolean DEFAULT_DEPRECATED = false;
    public static final JSType DEFAULT_JSTYPE = JSType.JS_NORMAL;
    public static final Boolean DEFAULT_LAZY = false;
    public static final Boolean DEFAULT_LOG = false;
    public static final Boolean DEFAULT_PACKED = false;
    public static final Boolean DEFAULT_WEAK = false;
    private static final long serialVersionUID = 0;
    public final CType ctype;
    public final Boolean deprecated;
    public final JSType jstype;
    public final Boolean lazy;
    public final Boolean log;
    public final Boolean packed;
    public final List<UninterpretedOption> uninterpreted_option;
    public final Boolean weak;

    public enum CType implements WireEnum {
        STRING(0),
        CORD(1),
        STRING_PIECE(2);
        
        public static final ProtoAdapter<CType> ADAPTER = ProtoAdapter.newEnumAdapter(CType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static CType fromValue(int i) {
            if (i == 0) {
                return STRING;
            }
            if (i == 1) {
                return CORD;
            }
            if (i != 2) {
                return null;
            }
            return STRING_PIECE;
        }

        private CType(int i) {
            this.value = i;
        }
    }

    public enum JSType implements WireEnum {
        JS_NORMAL(0),
        JS_STRING(1),
        JS_NUMBER(2);
        
        public static final ProtoAdapter<JSType> ADAPTER = ProtoAdapter.newEnumAdapter(JSType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static JSType fromValue(int i) {
            if (i == 0) {
                return JS_NORMAL;
            }
            if (i == 1) {
                return JS_STRING;
            }
            if (i != 2) {
                return null;
            }
            return JS_NUMBER;
        }

        private JSType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.google.protobuf.FieldOptions$b */
    private static final class C23060b extends ProtoAdapter<FieldOptions> {
        C23060b() {
            super(FieldEncoding.LENGTH_DELIMITED, FieldOptions.class);
        }

        /* renamed from: a */
        public int encodedSize(FieldOptions fieldOptions) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = 0;
            if (fieldOptions.ctype != null) {
                i = CType.ADAPTER.encodedSizeWithTag(1, fieldOptions.ctype);
            } else {
                i = 0;
            }
            if (fieldOptions.packed != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, fieldOptions.packed);
            } else {
                i2 = 0;
            }
            int i8 = i + i2;
            if (fieldOptions.jstype != null) {
                i3 = JSType.ADAPTER.encodedSizeWithTag(6, fieldOptions.jstype);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (fieldOptions.lazy != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(5, fieldOptions.lazy);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (fieldOptions.deprecated != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(3, fieldOptions.deprecated);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (fieldOptions.weak != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(10, fieldOptions.weak);
            } else {
                i6 = 0;
            }
            int encodedSizeWithTag = i11 + i6 + UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999, fieldOptions.uninterpreted_option);
            if (fieldOptions.log != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(50001, fieldOptions.log);
            }
            return encodedSizeWithTag + i7 + fieldOptions.unknownFields().size();
        }

        /* renamed from: a */
        public FieldOptions decode(ProtoReader protoReader) throws IOException {
            C23059a aVar = new C23059a();
            aVar.f56944a = CType.STRING;
            aVar.f56945b = false;
            aVar.f56946c = JSType.JS_NORMAL;
            aVar.f56947d = false;
            aVar.f56948e = false;
            aVar.f56949f = false;
            aVar.f56951h = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f56944a = CType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f56945b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f56948e = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 5) {
                    aVar.f56947d = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 6) {
                    try {
                        aVar.f56946c = JSType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag == 10) {
                    aVar.f56949f = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 999) {
                    aVar.f56950g.add(UninterpretedOption.ADAPTER.decode(protoReader));
                } else if (nextTag != 50001) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f56951h = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FieldOptions fieldOptions) throws IOException {
            if (fieldOptions.ctype != null) {
                CType.ADAPTER.encodeWithTag(protoWriter, 1, fieldOptions.ctype);
            }
            if (fieldOptions.packed != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, fieldOptions.packed);
            }
            if (fieldOptions.jstype != null) {
                JSType.ADAPTER.encodeWithTag(protoWriter, 6, fieldOptions.jstype);
            }
            if (fieldOptions.lazy != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, fieldOptions.lazy);
            }
            if (fieldOptions.deprecated != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, fieldOptions.deprecated);
            }
            if (fieldOptions.weak != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, fieldOptions.weak);
            }
            UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(protoWriter, 999, fieldOptions.uninterpreted_option);
            if (fieldOptions.log != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 50001, fieldOptions.log);
            }
            protoWriter.writeBytes(fieldOptions.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.FieldOptions$a */
    public static final class C23059a extends Message.Builder<FieldOptions, C23059a> {

        /* renamed from: a */
        public CType f56944a;

        /* renamed from: b */
        public Boolean f56945b;

        /* renamed from: c */
        public JSType f56946c;

        /* renamed from: d */
        public Boolean f56947d;

        /* renamed from: e */
        public Boolean f56948e;

        /* renamed from: f */
        public Boolean f56949f;

        /* renamed from: g */
        public List<UninterpretedOption> f56950g = Internal.newMutableList();

        /* renamed from: h */
        public Boolean f56951h;

        /* renamed from: a */
        public FieldOptions build() {
            return new FieldOptions(this.f56944a, this.f56945b, this.f56946c, this.f56947d, this.f56948e, this.f56949f, this.f56950g, this.f56951h, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23059a newBuilder() {
        C23059a aVar = new C23059a();
        aVar.f56944a = this.ctype;
        aVar.f56945b = this.packed;
        aVar.f56946c = this.jstype;
        aVar.f56947d = this.lazy;
        aVar.f56948e = this.deprecated;
        aVar.f56949f = this.weak;
        aVar.f56950g = Internal.copyOf("uninterpreted_option", this.uninterpreted_option);
        aVar.f56951h = this.log;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("google", "FieldOptions");
        StringBuilder sb = new StringBuilder();
        if (this.ctype != null) {
            sb.append(", ctype=");
            sb.append(this.ctype);
        }
        if (this.packed != null) {
            sb.append(", packed=");
            sb.append(this.packed);
        }
        if (this.jstype != null) {
            sb.append(", jstype=");
            sb.append(this.jstype);
        }
        if (this.lazy != null) {
            sb.append(", lazy=");
            sb.append(this.lazy);
        }
        if (this.deprecated != null) {
            sb.append(", deprecated=");
            sb.append(this.deprecated);
        }
        if (this.weak != null) {
            sb.append(", weak=");
            sb.append(this.weak);
        }
        if (!this.uninterpreted_option.isEmpty()) {
            sb.append(", uninterpreted_option=");
            sb.append(this.uninterpreted_option);
        }
        if (this.log != null) {
            sb.append(", log=");
            sb.append(this.log);
        }
        StringBuilder replace = sb.replace(0, 2, "FieldOptions{");
        replace.append('}');
        return replace.toString();
    }

    public FieldOptions(CType cType, Boolean bool, JSType jSType, Boolean bool2, Boolean bool3, Boolean bool4, List<UninterpretedOption> list, Boolean bool5) {
        this(cType, bool, jSType, bool2, bool3, bool4, list, bool5, ByteString.EMPTY);
    }

    public FieldOptions(CType cType, Boolean bool, JSType jSType, Boolean bool2, Boolean bool3, Boolean bool4, List<UninterpretedOption> list, Boolean bool5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ctype = cType;
        this.packed = bool;
        this.jstype = jSType;
        this.lazy = bool2;
        this.deprecated = bool3;
        this.weak = bool4;
        this.uninterpreted_option = Internal.immutableCopyOf("uninterpreted_option", list);
        this.log = bool5;
    }
}
