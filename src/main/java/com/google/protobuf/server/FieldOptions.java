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

public final class FieldOptions extends Message<FieldOptions, C23155a> {
    public static final ProtoAdapter<FieldOptions> ADAPTER = new C23156b();
    public static final Boolean DEFAULT_DEPRECATED = false;
    public static final String DEFAULT_FIELDINFO = "";
    public static final Boolean DEFAULT_LAZY = false;
    public static final Boolean DEFAULT_PACKED = false;
    public static final Boolean DEFAULT_SAVEFORDEVICE = false;
    public static final Boolean DEFAULT_WEAK = false;
    private static final long serialVersionUID = 0;
    public final String mFieldInfo;
    public final Boolean mSaveForDevice;
    public final CType mctype;
    public final Boolean mdeprecated;
    public final JSType mjstype;
    public final Boolean mlazy;
    public final Boolean mpacked;
    public final List<UninterpretedOption> muninterpreted_option;
    public final Boolean mweak;

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

    /* renamed from: com.google.protobuf.server.FieldOptions$b */
    private static final class C23156b extends ProtoAdapter<FieldOptions> {
        C23156b() {
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
            int i7;
            int i8 = 0;
            if (fieldOptions.mctype != null) {
                i = CType.ADAPTER.encodedSizeWithTag(1, fieldOptions.mctype);
            } else {
                i = 0;
            }
            if (fieldOptions.mpacked != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, fieldOptions.mpacked);
            } else {
                i2 = 0;
            }
            int i9 = i + i2;
            if (fieldOptions.mjstype != null) {
                i3 = JSType.ADAPTER.encodedSizeWithTag(6, fieldOptions.mjstype);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (fieldOptions.mlazy != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(5, fieldOptions.mlazy);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (fieldOptions.mdeprecated != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(3, fieldOptions.mdeprecated);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (fieldOptions.mweak != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(10, fieldOptions.mweak);
            } else {
                i6 = 0;
            }
            int encodedSizeWithTag = i12 + i6 + UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999, fieldOptions.muninterpreted_option);
            if (fieldOptions.mFieldInfo != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(54321, fieldOptions.mFieldInfo);
            } else {
                i7 = 0;
            }
            int i13 = encodedSizeWithTag + i7;
            if (fieldOptions.mSaveForDevice != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(32100, fieldOptions.mSaveForDevice);
            }
            return i13 + i8 + fieldOptions.unknownFields().size();
        }

        /* renamed from: a */
        public FieldOptions decode(ProtoReader protoReader) throws IOException {
            C23155a aVar = new C23155a();
            aVar.f57124b = false;
            aVar.f57126d = false;
            aVar.f57127e = false;
            aVar.f57128f = false;
            aVar.f57130h = "";
            aVar.f57131i = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f57123a = CType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f57124b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f57127e = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 5) {
                    aVar.f57126d = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 6) {
                    try {
                        aVar.f57125c = JSType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag == 10) {
                    aVar.f57128f = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 999) {
                    aVar.f57129g.add(UninterpretedOption.ADAPTER.decode(protoReader));
                } else if (nextTag == 32100) {
                    aVar.f57131i = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 54321) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f57130h = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FieldOptions fieldOptions) throws IOException {
            if (fieldOptions.mctype != null) {
                CType.ADAPTER.encodeWithTag(protoWriter, 1, fieldOptions.mctype);
            }
            if (fieldOptions.mpacked != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, fieldOptions.mpacked);
            }
            if (fieldOptions.mjstype != null) {
                JSType.ADAPTER.encodeWithTag(protoWriter, 6, fieldOptions.mjstype);
            }
            if (fieldOptions.mlazy != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, fieldOptions.mlazy);
            }
            if (fieldOptions.mdeprecated != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, fieldOptions.mdeprecated);
            }
            if (fieldOptions.mweak != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, fieldOptions.mweak);
            }
            UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(protoWriter, 999, fieldOptions.muninterpreted_option);
            if (fieldOptions.mFieldInfo != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 54321, fieldOptions.mFieldInfo);
            }
            if (fieldOptions.mSaveForDevice != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 32100, fieldOptions.mSaveForDevice);
            }
            protoWriter.writeBytes(fieldOptions.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.server.FieldOptions$a */
    public static final class C23155a extends Message.Builder<FieldOptions, C23155a> {

        /* renamed from: a */
        public CType f57123a;

        /* renamed from: b */
        public Boolean f57124b;

        /* renamed from: c */
        public JSType f57125c;

        /* renamed from: d */
        public Boolean f57126d;

        /* renamed from: e */
        public Boolean f57127e;

        /* renamed from: f */
        public Boolean f57128f;

        /* renamed from: g */
        public List<UninterpretedOption> f57129g = Internal.newMutableList();

        /* renamed from: h */
        public String f57130h;

        /* renamed from: i */
        public Boolean f57131i;

        /* renamed from: a */
        public FieldOptions build() {
            return new FieldOptions(this.f57123a, this.f57124b, this.f57125c, this.f57126d, this.f57127e, this.f57128f, this.f57129g, this.f57130h, this.f57131i, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C23155a mo80350a(String str) {
            this.f57130h = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C23155a newBuilder() {
        C23155a aVar = new C23155a();
        aVar.f57123a = this.mctype;
        aVar.f57124b = this.mpacked;
        aVar.f57125c = this.mjstype;
        aVar.f57126d = this.mlazy;
        aVar.f57127e = this.mdeprecated;
        aVar.f57128f = this.mweak;
        aVar.f57129g = Internal.copyOf("muninterpreted_option", this.muninterpreted_option);
        aVar.f57130h = this.mFieldInfo;
        aVar.f57131i = this.mSaveForDevice;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mctype != null) {
            sb.append(", ctype=");
            sb.append(this.mctype);
        }
        if (this.mpacked != null) {
            sb.append(", packed=");
            sb.append(this.mpacked);
        }
        if (this.mjstype != null) {
            sb.append(", jstype=");
            sb.append(this.mjstype);
        }
        if (this.mlazy != null) {
            sb.append(", lazy=");
            sb.append(this.mlazy);
        }
        if (this.mdeprecated != null) {
            sb.append(", deprecated=");
            sb.append(this.mdeprecated);
        }
        if (this.mweak != null) {
            sb.append(", weak=");
            sb.append(this.mweak);
        }
        if (!this.muninterpreted_option.isEmpty()) {
            sb.append(", uninterpreted_option=");
            sb.append(this.muninterpreted_option);
        }
        if (this.mFieldInfo != null) {
            sb.append(", FieldInfo=");
            sb.append(this.mFieldInfo);
        }
        if (this.mSaveForDevice != null) {
            sb.append(", SaveForDevice=");
            sb.append(this.mSaveForDevice);
        }
        StringBuilder replace = sb.replace(0, 2, "FieldOptions{");
        replace.append('}');
        return replace.toString();
    }

    public FieldOptions(CType cType, Boolean bool, JSType jSType, Boolean bool2, Boolean bool3, Boolean bool4, List<UninterpretedOption> list, String str, Boolean bool5) {
        this(cType, bool, jSType, bool2, bool3, bool4, list, str, bool5, ByteString.EMPTY);
    }

    public FieldOptions(CType cType, Boolean bool, JSType jSType, Boolean bool2, Boolean bool3, Boolean bool4, List<UninterpretedOption> list, String str, Boolean bool5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mctype = cType;
        this.mpacked = bool;
        this.mjstype = jSType;
        this.mlazy = bool2;
        this.mdeprecated = bool3;
        this.mweak = bool4;
        this.muninterpreted_option = Internal.immutableCopyOf("muninterpreted_option", list);
        this.mFieldInfo = str;
        this.mSaveForDevice = bool5;
    }
}
