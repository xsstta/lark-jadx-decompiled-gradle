package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class SpinUpFrontierRequest extends Message<SpinUpFrontierRequest, C15290a> {
    public static final ProtoAdapter<SpinUpFrontierRequest> ADAPTER = new C15291b();
    public static final EnvType DEFAULT_ENV = EnvType.ONLINE;
    private static final long serialVersionUID = 0;
    public final String access_token;
    public final String device_id;
    public final EnvType env;
    public final EnvV2 env_v2;
    public final String frontier_host;

    public static final class EnvV2 extends Message<EnvV2, C15288a> {
        public static final ProtoAdapter<EnvV2> ADAPTER = new C15289b();
        public static final Type DEFAULT_TYPE = Type.RELEASE;
        private static final long serialVersionUID = 0;
        public final String brand;
        public final Type type;
        public final String unit;

        public enum Type implements WireEnum {
            RELEASE(1),
            STAGING(2),
            PRE_RELEASE(3);
            
            public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Type fromValue(int i) {
                if (i == 1) {
                    return RELEASE;
                }
                if (i == 2) {
                    return STAGING;
                }
                if (i != 3) {
                    return null;
                }
                return PRE_RELEASE;
            }

            private Type(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.SpinUpFrontierRequest$EnvV2$b */
        private static final class C15289b extends ProtoAdapter<EnvV2> {
            C15289b() {
                super(FieldEncoding.LENGTH_DELIMITED, EnvV2.class);
            }

            /* renamed from: a */
            public int encodedSize(EnvV2 envV2) {
                int i;
                int i2;
                int i3 = 0;
                if (envV2.type != null) {
                    i = Type.ADAPTER.encodedSizeWithTag(1, envV2.type);
                } else {
                    i = 0;
                }
                if (envV2.unit != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, envV2.unit);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (envV2.brand != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, envV2.brand);
                }
                return i4 + i3 + envV2.unknownFields().size();
            }

            /* renamed from: a */
            public EnvV2 decode(ProtoReader protoReader) throws IOException {
                C15288a aVar = new C15288a();
                aVar.f40490a = Type.RELEASE;
                aVar.f40491b = "";
                aVar.f40492c = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f40490a = Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 2) {
                        aVar.f40491b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40492c = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, EnvV2 envV2) throws IOException {
                if (envV2.type != null) {
                    Type.ADAPTER.encodeWithTag(protoWriter, 1, envV2.type);
                }
                if (envV2.unit != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, envV2.unit);
                }
                if (envV2.brand != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, envV2.brand);
                }
                protoWriter.writeBytes(envV2.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.SpinUpFrontierRequest$EnvV2$a */
        public static final class C15288a extends Message.Builder<EnvV2, C15288a> {

            /* renamed from: a */
            public Type f40490a;

            /* renamed from: b */
            public String f40491b;

            /* renamed from: c */
            public String f40492c;

            /* renamed from: a */
            public EnvV2 build() {
                return new EnvV2(this.f40490a, this.f40491b, this.f40492c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15288a newBuilder() {
            C15288a aVar = new C15288a();
            aVar.f40490a = this.type;
            aVar.f40491b = this.unit;
            aVar.f40492c = this.brand;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "EnvV2");
            StringBuilder sb = new StringBuilder();
            if (this.type != null) {
                sb.append(", type=");
                sb.append(this.type);
            }
            if (this.unit != null) {
                sb.append(", unit=");
                sb.append(this.unit);
            }
            if (this.brand != null) {
                sb.append(", brand=");
                sb.append(this.brand);
            }
            StringBuilder replace = sb.replace(0, 2, "EnvV2{");
            replace.append('}');
            return replace.toString();
        }

        public EnvV2(Type type2, String str, String str2) {
            this(type2, str, str2, ByteString.EMPTY);
        }

        public EnvV2(Type type2, String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.type = type2;
            this.unit = str;
            this.brand = str2;
        }
    }

    public enum EnvType implements WireEnum {
        ONLINE(1),
        STAGING(2),
        PRE_RELEASE(3),
        OVERSEA(4),
        OVERSEA_STAGING(5);
        
        public static final ProtoAdapter<EnvType> ADAPTER = ProtoAdapter.newEnumAdapter(EnvType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static EnvType fromValue(int i) {
            if (i == 1) {
                return ONLINE;
            }
            if (i == 2) {
                return STAGING;
            }
            if (i == 3) {
                return PRE_RELEASE;
            }
            if (i == 4) {
                return OVERSEA;
            }
            if (i != 5) {
                return null;
            }
            return OVERSEA_STAGING;
        }

        private EnvType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.SpinUpFrontierRequest$b */
    private static final class C15291b extends ProtoAdapter<SpinUpFrontierRequest> {
        C15291b() {
            super(FieldEncoding.LENGTH_DELIMITED, SpinUpFrontierRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SpinUpFrontierRequest spinUpFrontierRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (spinUpFrontierRequest.device_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, spinUpFrontierRequest.device_id);
            } else {
                i = 0;
            }
            if (spinUpFrontierRequest.access_token != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, spinUpFrontierRequest.access_token);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (spinUpFrontierRequest.env != null) {
                i3 = EnvType.ADAPTER.encodedSizeWithTag(3, spinUpFrontierRequest.env);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (spinUpFrontierRequest.frontier_host != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, spinUpFrontierRequest.frontier_host);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (spinUpFrontierRequest.env_v2 != null) {
                i5 = EnvV2.ADAPTER.encodedSizeWithTag(5, spinUpFrontierRequest.env_v2);
            }
            return i8 + i5 + spinUpFrontierRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SpinUpFrontierRequest decode(ProtoReader protoReader) throws IOException {
            C15290a aVar = new C15290a();
            aVar.f40493a = "";
            aVar.f40494b = "";
            aVar.f40495c = EnvType.ONLINE;
            aVar.f40496d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40493a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f40494b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f40495c = EnvType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 4) {
                    aVar.f40496d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40497e = EnvV2.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SpinUpFrontierRequest spinUpFrontierRequest) throws IOException {
            if (spinUpFrontierRequest.device_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, spinUpFrontierRequest.device_id);
            }
            if (spinUpFrontierRequest.access_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, spinUpFrontierRequest.access_token);
            }
            if (spinUpFrontierRequest.env != null) {
                EnvType.ADAPTER.encodeWithTag(protoWriter, 3, spinUpFrontierRequest.env);
            }
            if (spinUpFrontierRequest.frontier_host != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, spinUpFrontierRequest.frontier_host);
            }
            if (spinUpFrontierRequest.env_v2 != null) {
                EnvV2.ADAPTER.encodeWithTag(protoWriter, 5, spinUpFrontierRequest.env_v2);
            }
            protoWriter.writeBytes(spinUpFrontierRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.SpinUpFrontierRequest$a */
    public static final class C15290a extends Message.Builder<SpinUpFrontierRequest, C15290a> {

        /* renamed from: a */
        public String f40493a;

        /* renamed from: b */
        public String f40494b;

        /* renamed from: c */
        public EnvType f40495c;

        /* renamed from: d */
        public String f40496d;

        /* renamed from: e */
        public EnvV2 f40497e;

        /* renamed from: a */
        public SpinUpFrontierRequest build() {
            return new SpinUpFrontierRequest(this.f40493a, this.f40494b, this.f40495c, this.f40496d, this.f40497e, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15290a mo55625a(EnvType envType) {
            this.f40495c = envType;
            return this;
        }

        /* renamed from: b */
        public C15290a mo55628b(String str) {
            this.f40494b = str;
            return this;
        }

        /* renamed from: c */
        public C15290a mo55629c(String str) {
            this.f40496d = str;
            return this;
        }

        /* renamed from: a */
        public C15290a mo55626a(String str) {
            this.f40493a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15290a newBuilder() {
        C15290a aVar = new C15290a();
        aVar.f40493a = this.device_id;
        aVar.f40494b = this.access_token;
        aVar.f40495c = this.env;
        aVar.f40496d = this.frontier_host;
        aVar.f40497e = this.env_v2;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "SpinUpFrontierRequest");
        StringBuilder sb = new StringBuilder();
        if (this.device_id != null) {
            sb.append(", device_id=");
            sb.append(this.device_id);
        }
        if (this.access_token != null) {
            sb.append(", access_token=");
            sb.append(this.access_token);
        }
        if (this.env != null) {
            sb.append(", env=");
            sb.append(this.env);
        }
        if (this.frontier_host != null) {
            sb.append(", frontier_host=");
            sb.append(this.frontier_host);
        }
        if (this.env_v2 != null) {
            sb.append(", env_v2=");
            sb.append(this.env_v2);
        }
        StringBuilder replace = sb.replace(0, 2, "SpinUpFrontierRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SpinUpFrontierRequest(String str, String str2, EnvType envType, String str3, EnvV2 envV2) {
        this(str, str2, envType, str3, envV2, ByteString.EMPTY);
    }

    public SpinUpFrontierRequest(String str, String str2, EnvType envType, String str3, EnvV2 envV2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.device_id = str;
        this.access_token = str2;
        this.env = envType;
        this.frontier_host = str3;
        this.env_v2 = envV2;
    }
}
