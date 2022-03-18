package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import okio.ByteString;

public final class ThemeColor extends Message<ThemeColor, C15324a> {
    public static final ProtoAdapter<ThemeColor> ADAPTER = new C15325b();
    public static final Integer DEFAULT_VALUE = 0;
    private static final long serialVersionUID = 0;
    public final Key key;
    public final String token;
    public final Integer value;

    public enum KeyType implements WireEnum {
        N(0),
        B(1),
        W(2),
        T(3),
        G(4),
        L(5),
        Y(6),
        S(7),
        O(8),
        R(9),
        C(10),
        V(11),
        P(12),
        I(13),
        STATIC_WHITE(14);
        
        public static final ProtoAdapter<KeyType> ADAPTER = ProtoAdapter.newEnumAdapter(KeyType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static KeyType fromValue(int i) {
            switch (i) {
                case 0:
                    return N;
                case 1:
                    return B;
                case 2:
                    return W;
                case 3:
                    return T;
                case 4:
                    return G;
                case 5:
                    return L;
                case 6:
                    return Y;
                case 7:
                    return S;
                case 8:
                    return O;
                case 9:
                    return R;
                case 10:
                    return C;
                case 11:
                    return V;
                case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                    return P;
                case 13:
                    return I;
                case 14:
                    return STATIC_WHITE;
                default:
                    return null;
            }
        }

        private KeyType(int i) {
            this.value = i;
        }
    }

    public static final class Key extends Message<Key, C15322a> {
        public static final ProtoAdapter<Key> ADAPTER = new C15323b();
        public static final Integer DEFAULT_ALPHA = 100;
        public static final KeyType DEFAULT_TYPE = KeyType.N;
        public static final Integer DEFAULT_VALUE = 0;
        private static final long serialVersionUID = 0;
        public final Integer alpha;
        public final KeyType type;
        public final Integer value;

        /* renamed from: com.bytedance.lark.pb.basic.v1.ThemeColor$Key$b */
        private static final class C15323b extends ProtoAdapter<Key> {
            C15323b() {
                super(FieldEncoding.LENGTH_DELIMITED, Key.class);
            }

            /* renamed from: a */
            public int encodedSize(Key key) {
                int i;
                int encodedSizeWithTag = KeyType.ADAPTER.encodedSizeWithTag(1, key.type) + ProtoAdapter.UINT32.encodedSizeWithTag(2, key.value);
                if (key.alpha != null) {
                    i = ProtoAdapter.UINT32.encodedSizeWithTag(3, key.alpha);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + key.unknownFields().size();
            }

            /* renamed from: a */
            public Key decode(ProtoReader protoReader) throws IOException {
                C15322a aVar = new C15322a();
                aVar.f40550a = KeyType.N;
                aVar.f40551b = 0;
                aVar.f40552c = 100;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f40550a = KeyType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 2) {
                        aVar.f40551b = ProtoAdapter.UINT32.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40552c = ProtoAdapter.UINT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Key key) throws IOException {
                KeyType.ADAPTER.encodeWithTag(protoWriter, 1, key.type);
                ProtoAdapter.UINT32.encodeWithTag(protoWriter, 2, key.value);
                if (key.alpha != null) {
                    ProtoAdapter.UINT32.encodeWithTag(protoWriter, 3, key.alpha);
                }
                protoWriter.writeBytes(key.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15322a newBuilder() {
            C15322a aVar = new C15322a();
            aVar.f40550a = this.type;
            aVar.f40551b = this.value;
            aVar.f40552c = this.alpha;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.ThemeColor$Key$a */
        public static final class C15322a extends Message.Builder<Key, C15322a> {

            /* renamed from: a */
            public KeyType f40550a;

            /* renamed from: b */
            public Integer f40551b;

            /* renamed from: c */
            public Integer f40552c;

            /* renamed from: a */
            public Key build() {
                Integer num;
                KeyType keyType = this.f40550a;
                if (keyType != null && (num = this.f40551b) != null) {
                    return new Key(keyType, num, this.f40552c, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(keyType, ShareHitPoint.f121869d, this.f40551b, "value");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "Key");
            StringBuilder sb = new StringBuilder();
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", value=");
            sb.append(this.value);
            if (this.alpha != null) {
                sb.append(", alpha=");
                sb.append(this.alpha);
            }
            StringBuilder replace = sb.replace(0, 2, "Key{");
            replace.append('}');
            return replace.toString();
        }

        public Key(KeyType keyType, Integer num, Integer num2) {
            this(keyType, num, num2, ByteString.EMPTY);
        }

        public Key(KeyType keyType, Integer num, Integer num2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.type = keyType;
            this.value = num;
            this.alpha = num2;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.ThemeColor$b */
    private static final class C15325b extends ProtoAdapter<ThemeColor> {
        C15325b() {
            super(FieldEncoding.LENGTH_DELIMITED, ThemeColor.class);
        }

        /* renamed from: a */
        public int encodedSize(ThemeColor themeColor) {
            int i;
            int i2;
            int i3 = 0;
            if (themeColor.token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, themeColor.token);
            } else {
                i = 0;
            }
            if (themeColor.key != null) {
                i2 = Key.ADAPTER.encodedSizeWithTag(2, themeColor.key);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (themeColor.value != null) {
                i3 = ProtoAdapter.UINT32.encodedSizeWithTag(3, themeColor.value);
            }
            return i4 + i3 + themeColor.unknownFields().size();
        }

        /* renamed from: a */
        public ThemeColor decode(ProtoReader protoReader) throws IOException {
            C15324a aVar = new C15324a();
            aVar.f40567a = "";
            aVar.f40569c = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40567a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f40568b = Key.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40569c = ProtoAdapter.UINT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ThemeColor themeColor) throws IOException {
            if (themeColor.token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, themeColor.token);
            }
            if (themeColor.key != null) {
                Key.ADAPTER.encodeWithTag(protoWriter, 2, themeColor.key);
            }
            if (themeColor.value != null) {
                ProtoAdapter.UINT32.encodeWithTag(protoWriter, 3, themeColor.value);
            }
            protoWriter.writeBytes(themeColor.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.ThemeColor$a */
    public static final class C15324a extends Message.Builder<ThemeColor, C15324a> {

        /* renamed from: a */
        public String f40567a;

        /* renamed from: b */
        public Key f40568b;

        /* renamed from: c */
        public Integer f40569c;

        /* renamed from: a */
        public ThemeColor build() {
            return new ThemeColor(this.f40567a, this.f40568b, this.f40569c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15324a newBuilder() {
        C15324a aVar = new C15324a();
        aVar.f40567a = this.token;
        aVar.f40568b = this.key;
        aVar.f40569c = this.value;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "ThemeColor");
        StringBuilder sb = new StringBuilder();
        if (this.token != null) {
            sb.append(", token=");
            sb.append(this.token);
        }
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.value != null) {
            sb.append(", value=");
            sb.append(this.value);
        }
        StringBuilder replace = sb.replace(0, 2, "ThemeColor{");
        replace.append('}');
        return replace.toString();
    }

    public ThemeColor(String str, Key key2, Integer num) {
        this(str, key2, num, ByteString.EMPTY);
    }

    public ThemeColor(String str, Key key2, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.token = str;
        this.key = key2;
        this.value = num;
    }
}
