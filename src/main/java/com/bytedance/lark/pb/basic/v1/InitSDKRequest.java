package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import java.io.IOException;
import okio.ByteString;

public final class InitSDKRequest extends Message<InitSDKRequest, C15029a> {
    public static final ProtoAdapter<InitSDKRequest> ADAPTER = new C15030b();
    public static final Boolean DEFAULT_BASIC_MODE = false;
    public static final DataSynchronismStrategy DEFAULT_DATA_SYNCHRONISM_STRATEGY = DataSynchronismStrategy.BROADCAST;
    public static final Boolean DEFAULT_ENABLE_THREAD = false;
    public static final Boolean DEFAULT_ENABLE_THREAD_SUBSCRIPTION = false;
    public static final EnvType DEFAULT_ENV = EnvType.ONLINE;
    public static final Boolean DEFAULT_IS_WRAP_ASYNC_CALLBACK_DATA_WITH_PACKET = false;
    public static final Long DEFAULT_MAIN_THREAD_ID = 0L;
    public static final Boolean DEFAULT_NEED_CALL_ASYNC = false;
    public static final Boolean DEFAULT_NEED_SETTINGS = false;
    public static final PackageId DEFAULT_PACKAGE_ID = PackageId.LARK;
    public static final PowerLevel DEFAULT_POWER_LEVEL_UNDER_BACKGROUND = PowerLevel.Low;
    public static final ProcessType DEFAULT_PROCESS_TYPE = ProcessType.MAIN;
    public static final Boolean DEFAULT_USE_DEPRECATED_PUSH_MSG = true;
    private static final long serialVersionUID = 0;
    public final String app_id;
    public final Boolean basic_mode;
    public final BoeRpcPersistDyecpFd boe_rpc_persist_dyecp_fd;
    public final String boe_tt_feature_env;
    public final NetworkClientCertificate client_cert;
    public final String client_log_storage_path;
    public final String custom_log_path;
    public final DataSynchronismStrategy data_synchronism_strategy;
    public final DeprecatedConfig deprecated_config;
    public final Boolean enable_thread;
    public final Boolean enable_thread_subscription;
    public final EnvType env;
    public final EnvV2 env_v2;
    public final FrontierConfig frontier_config;
    public final String init_config_path;
    public final InitLogUpload init_log_upload;
    public final Boolean is_wrap_async_callback_data_with_packet;
    public final KaInitConfig ka_init_config;
    public final String local_timezone;
    public final String locale_identifier;
    public final Long main_thread_id;
    public final Boolean need_call_async;
    public final Boolean need_settings;
    public final String old_storage_path;
    public final PackageId package_id;
    public final String path_prefix;
    public final PowerLevel power_level_under_background;
    public final PreloadConfig preload_config;
    public final ProcessType process_type;
    public final String storage_path;
    public final String stress_test_tag;
    public final String sub_account_path;
    public final String sub_user_path;
    public final Boolean use_deprecated_push_msg;
    public final String user_agent;
    public final String user_id;
    public final String version;
    public final String wasm_init_config;

    public static final class EnvV2 extends Message<EnvV2, C15023a> {
        public static final ProtoAdapter<EnvV2> ADAPTER = new C15024b();
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

        /* renamed from: com.bytedance.lark.pb.basic.v1.InitSDKRequest$EnvV2$b */
        private static final class C15024b extends ProtoAdapter<EnvV2> {
            C15024b() {
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
                C15023a aVar = new C15023a();
                aVar.f39718a = Type.RELEASE;
                aVar.f39719b = "";
                aVar.f39720c = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f39718a = Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 2) {
                        aVar.f39719b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f39720c = ProtoAdapter.STRING.decode(protoReader);
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

        /* renamed from: com.bytedance.lark.pb.basic.v1.InitSDKRequest$EnvV2$a */
        public static final class C15023a extends Message.Builder<EnvV2, C15023a> {

            /* renamed from: a */
            public Type f39718a;

            /* renamed from: b */
            public String f39719b;

            /* renamed from: c */
            public String f39720c;

            /* renamed from: a */
            public EnvV2 build() {
                return new EnvV2(this.f39718a, this.f39719b, this.f39720c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15023a newBuilder() {
            C15023a aVar = new C15023a();
            aVar.f39718a = this.type;
            aVar.f39719b = this.unit;
            aVar.f39720c = this.brand;
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

    public enum DataSynchronismStrategy implements WireEnum {
        BROADCAST(1),
        SUBSCRIBE(2);
        
        public static final ProtoAdapter<DataSynchronismStrategy> ADAPTER = ProtoAdapter.newEnumAdapter(DataSynchronismStrategy.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static DataSynchronismStrategy fromValue(int i) {
            if (i == 1) {
                return BROADCAST;
            }
            if (i != 2) {
                return null;
            }
            return SUBSCRIBE;
        }

        private DataSynchronismStrategy(int i) {
            this.value = i;
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

    public enum PackageId implements WireEnum {
        LARK(1),
        FEISHU(2);
        
        public static final ProtoAdapter<PackageId> ADAPTER = ProtoAdapter.newEnumAdapter(PackageId.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static PackageId fromValue(int i) {
            if (i == 1) {
                return LARK;
            }
            if (i != 2) {
                return null;
            }
            return FEISHU;
        }

        private PackageId(int i) {
            this.value = i;
        }
    }

    public enum PowerLevel implements WireEnum {
        Stop(1),
        Low(2),
        Medium(3),
        High(4);
        
        public static final ProtoAdapter<PowerLevel> ADAPTER = ProtoAdapter.newEnumAdapter(PowerLevel.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static PowerLevel fromValue(int i) {
            if (i == 1) {
                return Stop;
            }
            if (i == 2) {
                return Low;
            }
            if (i == 3) {
                return Medium;
            }
            if (i != 4) {
                return null;
            }
            return High;
        }

        private PowerLevel(int i) {
            this.value = i;
        }
    }

    public enum ProcessType implements WireEnum {
        MAIN(1),
        CHILD(2),
        NETWORK(3),
        FRONTIER(4);
        
        public static final ProtoAdapter<ProcessType> ADAPTER = ProtoAdapter.newEnumAdapter(ProcessType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ProcessType fromValue(int i) {
            if (i == 1) {
                return MAIN;
            }
            if (i == 2) {
                return CHILD;
            }
            if (i == 3) {
                return NETWORK;
            }
            if (i != 4) {
                return null;
            }
            return FRONTIER;
        }

        private ProcessType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.InitSDKRequest$a */
    public static final class C15029a extends Message.Builder<InitSDKRequest, C15029a> {

        /* renamed from: A */
        public FrontierConfig f39726A;

        /* renamed from: B */
        public EnvV2 f39727B;

        /* renamed from: C */
        public Long f39728C;

        /* renamed from: D */
        public Boolean f39729D;

        /* renamed from: E */
        public NetworkClientCertificate f39730E;

        /* renamed from: F */
        public String f39731F;

        /* renamed from: G */
        public BoeRpcPersistDyecpFd f39732G;

        /* renamed from: H */
        public String f39733H;

        /* renamed from: I */
        public String f39734I;

        /* renamed from: J */
        public Boolean f39735J;

        /* renamed from: K */
        public String f39736K;

        /* renamed from: L */
        public String f39737L;

        /* renamed from: a */
        public String f39738a;

        /* renamed from: b */
        public EnvType f39739b;

        /* renamed from: c */
        public String f39740c;

        /* renamed from: d */
        public String f39741d;

        /* renamed from: e */
        public ProcessType f39742e;

        /* renamed from: f */
        public String f39743f;

        /* renamed from: g */
        public Boolean f39744g;

        /* renamed from: h */
        public String f39745h;

        /* renamed from: i */
        public String f39746i;

        /* renamed from: j */
        public String f39747j;

        /* renamed from: k */
        public String f39748k;

        /* renamed from: l */
        public String f39749l;

        /* renamed from: m */
        public String f39750m;

        /* renamed from: n */
        public String f39751n;

        /* renamed from: o */
        public String f39752o;

        /* renamed from: p */
        public InitLogUpload f39753p;

        /* renamed from: q */
        public DataSynchronismStrategy f39754q;

        /* renamed from: r */
        public Boolean f39755r;

        /* renamed from: s */
        public Boolean f39756s;

        /* renamed from: t */
        public Boolean f39757t;

        /* renamed from: u */
        public Boolean f39758u;

        /* renamed from: v */
        public PreloadConfig f39759v;

        /* renamed from: w */
        public PowerLevel f39760w;

        /* renamed from: x */
        public PackageId f39761x;

        /* renamed from: y */
        public DeprecatedConfig f39762y;

        /* renamed from: z */
        public KaInitConfig f39763z;

        /* renamed from: a */
        public C15029a mo54914a(String str) {
            this.f39738a = str;
            return this;
        }

        /* renamed from: a */
        public C15029a mo54912a(Boolean bool) {
            this.f39755r = bool;
            return this;
        }

        /* renamed from: a */
        public C15029a mo54913a(Long l) {
            this.f39728C = l;
            return this;
        }

        /* renamed from: a */
        public InitSDKRequest build() {
            String str;
            String str2;
            String str3;
            String str4 = this.f39738a;
            if (str4 != null && (str = this.f39740c) != null && (str2 = this.f39741d) != null && (str3 = this.f39734I) != null) {
                return new InitSDKRequest(str4, this.f39739b, str, str2, this.f39742e, this.f39743f, this.f39744g, this.f39745h, this.f39746i, this.f39747j, this.f39748k, this.f39749l, this.f39750m, this.f39751n, this.f39752o, this.f39753p, this.f39754q, this.f39755r, this.f39756s, this.f39757t, this.f39758u, this.f39759v, this.f39760w, this.f39761x, this.f39762y, this.f39763z, this.f39726A, this.f39727B, this.f39728C, this.f39729D, this.f39730E, this.f39731F, this.f39732G, this.f39733H, str3, this.f39735J, this.f39736K, this.f39737L, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str4, "storage_path", this.f39740c, HiAnalyticsConstant.HaKey.BI_KEY_VERSION, this.f39741d, "user_agent", this.f39734I, "init_config_path");
        }

        /* renamed from: a */
        public C15029a mo54902a(DeprecatedConfig deprecatedConfig) {
            this.f39762y = deprecatedConfig;
            return this;
        }

        /* renamed from: b */
        public C15029a mo54916b(Boolean bool) {
            this.f39758u = bool;
            return this;
        }

        /* renamed from: c */
        public C15029a mo54918c(Boolean bool) {
            this.f39735J = bool;
            return this;
        }

        /* renamed from: d */
        public C15029a mo54920d(String str) {
            this.f39745h = str;
            return this;
        }

        /* renamed from: e */
        public C15029a mo54921e(String str) {
            this.f39746i = str;
            return this;
        }

        /* renamed from: f */
        public C15029a mo54922f(String str) {
            this.f39747j = str;
            return this;
        }

        /* renamed from: g */
        public C15029a mo54923g(String str) {
            this.f39752o = str;
            return this;
        }

        /* renamed from: h */
        public C15029a mo54924h(String str) {
            this.f39733H = str;
            return this;
        }

        /* renamed from: i */
        public C15029a mo54925i(String str) {
            this.f39734I = str;
            return this;
        }

        /* renamed from: a */
        public C15029a mo54903a(InitLogUpload initLogUpload) {
            this.f39753p = initLogUpload;
            return this;
        }

        /* renamed from: b */
        public C15029a mo54917b(String str) {
            this.f39740c = str;
            return this;
        }

        /* renamed from: c */
        public C15029a mo54919c(String str) {
            this.f39741d = str;
            return this;
        }

        /* renamed from: a */
        public C15029a mo54904a(DataSynchronismStrategy dataSynchronismStrategy) {
            this.f39754q = dataSynchronismStrategy;
            return this;
        }

        /* renamed from: a */
        public C15029a mo54905a(EnvType envType) {
            this.f39739b = envType;
            return this;
        }

        /* renamed from: a */
        public C15029a mo54906a(EnvV2 envV2) {
            this.f39727B = envV2;
            return this;
        }

        /* renamed from: a */
        public C15029a mo54907a(PackageId packageId) {
            this.f39761x = packageId;
            return this;
        }

        /* renamed from: a */
        public C15029a mo54908a(PreloadConfig preloadConfig) {
            this.f39759v = preloadConfig;
            return this;
        }

        /* renamed from: a */
        public C15029a mo54909a(ProcessType processType) {
            this.f39742e = processType;
            return this;
        }

        /* renamed from: a */
        public C15029a mo54910a(KaInitConfig kaInitConfig) {
            this.f39763z = kaInitConfig;
            return this;
        }

        /* renamed from: a */
        public C15029a mo54911a(NetworkClientCertificate networkClientCertificate) {
            this.f39730E = networkClientCertificate;
            return this;
        }
    }

    public static final class BoeRpcPersistDyecpFd extends Message<BoeRpcPersistDyecpFd, C15021a> {
        public static final ProtoAdapter<BoeRpcPersistDyecpFd> ADAPTER = new C15022b();
        private static final long serialVersionUID = 0;
        public final String key;
        public final String value;

        /* renamed from: com.bytedance.lark.pb.basic.v1.InitSDKRequest$BoeRpcPersistDyecpFd$b */
        private static final class C15022b extends ProtoAdapter<BoeRpcPersistDyecpFd> {
            C15022b() {
                super(FieldEncoding.LENGTH_DELIMITED, BoeRpcPersistDyecpFd.class);
            }

            /* renamed from: a */
            public int encodedSize(BoeRpcPersistDyecpFd boeRpcPersistDyecpFd) {
                int i;
                int i2 = 0;
                if (boeRpcPersistDyecpFd.key != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, boeRpcPersistDyecpFd.key);
                } else {
                    i = 0;
                }
                if (boeRpcPersistDyecpFd.value != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, boeRpcPersistDyecpFd.value);
                }
                return i + i2 + boeRpcPersistDyecpFd.unknownFields().size();
            }

            /* renamed from: a */
            public BoeRpcPersistDyecpFd decode(ProtoReader protoReader) throws IOException {
                C15021a aVar = new C15021a();
                aVar.f39716a = "";
                aVar.f39717b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f39716a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f39717b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, BoeRpcPersistDyecpFd boeRpcPersistDyecpFd) throws IOException {
                if (boeRpcPersistDyecpFd.key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, boeRpcPersistDyecpFd.key);
                }
                if (boeRpcPersistDyecpFd.value != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, boeRpcPersistDyecpFd.value);
                }
                protoWriter.writeBytes(boeRpcPersistDyecpFd.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.InitSDKRequest$BoeRpcPersistDyecpFd$a */
        public static final class C15021a extends Message.Builder<BoeRpcPersistDyecpFd, C15021a> {

            /* renamed from: a */
            public String f39716a;

            /* renamed from: b */
            public String f39717b;

            /* renamed from: a */
            public BoeRpcPersistDyecpFd build() {
                return new BoeRpcPersistDyecpFd(this.f39716a, this.f39717b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15021a newBuilder() {
            C15021a aVar = new C15021a();
            aVar.f39716a = this.key;
            aVar.f39717b = this.value;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "BoeRpcPersistDyecpFd");
            StringBuilder sb = new StringBuilder();
            if (this.key != null) {
                sb.append(", key=");
                sb.append(this.key);
            }
            if (this.value != null) {
                sb.append(", value=");
                sb.append(this.value);
            }
            StringBuilder replace = sb.replace(0, 2, "BoeRpcPersistDyecpFd{");
            replace.append('}');
            return replace.toString();
        }

        public BoeRpcPersistDyecpFd(String str, String str2) {
            this(str, str2, ByteString.EMPTY);
        }

        public BoeRpcPersistDyecpFd(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.key = str;
            this.value = str2;
        }
    }

    public static final class FrontierConfig extends Message<FrontierConfig, C15025a> {
        public static final ProtoAdapter<FrontierConfig> ADAPTER = new C15026b();
        private static final long serialVersionUID = 0;
        public final String aid;
        public final String app_key;
        public final String fpid;
        public final String service_id;

        /* renamed from: com.bytedance.lark.pb.basic.v1.InitSDKRequest$FrontierConfig$b */
        private static final class C15026b extends ProtoAdapter<FrontierConfig> {
            C15026b() {
                super(FieldEncoding.LENGTH_DELIMITED, FrontierConfig.class);
            }

            /* renamed from: a */
            public int encodedSize(FrontierConfig frontierConfig) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (frontierConfig.fpid != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, frontierConfig.fpid);
                } else {
                    i = 0;
                }
                if (frontierConfig.service_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, frontierConfig.service_id);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (frontierConfig.aid != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, frontierConfig.aid);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (frontierConfig.app_key != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, frontierConfig.app_key);
                }
                return i6 + i4 + frontierConfig.unknownFields().size();
            }

            /* renamed from: a */
            public FrontierConfig decode(ProtoReader protoReader) throws IOException {
                C15025a aVar = new C15025a();
                aVar.f39721a = "";
                aVar.f39722b = "";
                aVar.f39723c = "";
                aVar.f39724d = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f39721a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f39722b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f39723c = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f39724d = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, FrontierConfig frontierConfig) throws IOException {
                if (frontierConfig.fpid != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, frontierConfig.fpid);
                }
                if (frontierConfig.service_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, frontierConfig.service_id);
                }
                if (frontierConfig.aid != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, frontierConfig.aid);
                }
                if (frontierConfig.app_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, frontierConfig.app_key);
                }
                protoWriter.writeBytes(frontierConfig.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.InitSDKRequest$FrontierConfig$a */
        public static final class C15025a extends Message.Builder<FrontierConfig, C15025a> {

            /* renamed from: a */
            public String f39721a;

            /* renamed from: b */
            public String f39722b;

            /* renamed from: c */
            public String f39723c;

            /* renamed from: d */
            public String f39724d;

            /* renamed from: a */
            public FrontierConfig build() {
                return new FrontierConfig(this.f39721a, this.f39722b, this.f39723c, this.f39724d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15025a newBuilder() {
            C15025a aVar = new C15025a();
            aVar.f39721a = this.fpid;
            aVar.f39722b = this.service_id;
            aVar.f39723c = this.aid;
            aVar.f39724d = this.app_key;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "FrontierConfig");
            StringBuilder sb = new StringBuilder();
            if (this.fpid != null) {
                sb.append(", fpid=");
                sb.append(this.fpid);
            }
            if (this.service_id != null) {
                sb.append(", service_id=");
                sb.append(this.service_id);
            }
            if (this.aid != null) {
                sb.append(", aid=");
                sb.append(this.aid);
            }
            if (this.app_key != null) {
                sb.append(", app_key=");
                sb.append(this.app_key);
            }
            StringBuilder replace = sb.replace(0, 2, "FrontierConfig{");
            replace.append('}');
            return replace.toString();
        }

        public FrontierConfig(String str, String str2, String str3, String str4) {
            this(str, str2, str3, str4, ByteString.EMPTY);
        }

        public FrontierConfig(String str, String str2, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            this.fpid = str;
            this.service_id = str2;
            this.aid = str3;
            this.app_key = str4;
        }
    }

    public static final class PreloadConfig extends Message<PreloadConfig, C15027a> {
        public static final ProtoAdapter<PreloadConfig> ADAPTER = new C15028b();
        public static final Integer DEFAULT_PRELOAD_CHAT_CHATTER_COUNT = 0;
        private static final long serialVersionUID = 0;
        public final Integer preload_chat_chatter_count;

        /* renamed from: com.bytedance.lark.pb.basic.v1.InitSDKRequest$PreloadConfig$b */
        private static final class C15028b extends ProtoAdapter<PreloadConfig> {
            C15028b() {
                super(FieldEncoding.LENGTH_DELIMITED, PreloadConfig.class);
            }

            /* renamed from: a */
            public int encodedSize(PreloadConfig preloadConfig) {
                int i;
                if (preloadConfig.preload_chat_chatter_count != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(1, preloadConfig.preload_chat_chatter_count);
                } else {
                    i = 0;
                }
                return i + preloadConfig.unknownFields().size();
            }

            /* renamed from: a */
            public PreloadConfig decode(ProtoReader protoReader) throws IOException {
                C15027a aVar = new C15027a();
                aVar.f39725a = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag != 1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f39725a = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, PreloadConfig preloadConfig) throws IOException {
                if (preloadConfig.preload_chat_chatter_count != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, preloadConfig.preload_chat_chatter_count);
                }
                protoWriter.writeBytes(preloadConfig.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.InitSDKRequest$PreloadConfig$a */
        public static final class C15027a extends Message.Builder<PreloadConfig, C15027a> {

            /* renamed from: a */
            public Integer f39725a;

            /* renamed from: a */
            public PreloadConfig build() {
                return new PreloadConfig(this.f39725a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15027a newBuilder() {
            C15027a aVar = new C15027a();
            aVar.f39725a = this.preload_chat_chatter_count;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "PreloadConfig");
            StringBuilder sb = new StringBuilder();
            if (this.preload_chat_chatter_count != null) {
                sb.append(", preload_chat_chatter_count=");
                sb.append(this.preload_chat_chatter_count);
            }
            StringBuilder replace = sb.replace(0, 2, "PreloadConfig{");
            replace.append('}');
            return replace.toString();
        }

        public PreloadConfig(Integer num) {
            this(num, ByteString.EMPTY);
        }

        public PreloadConfig(Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            this.preload_chat_chatter_count = num;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.InitSDKRequest$b */
    private static final class C15030b extends ProtoAdapter<InitSDKRequest> {
        C15030b() {
            super(FieldEncoding.LENGTH_DELIMITED, InitSDKRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(InitSDKRequest initSDKRequest) {
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
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27;
            int i28;
            int i29;
            int i30;
            int i31;
            int i32;
            int i33;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, initSDKRequest.storage_path);
            int i34 = 0;
            if (initSDKRequest.env != null) {
                i = EnvType.ADAPTER.encodedSizeWithTag(2, initSDKRequest.env);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + ProtoAdapter.STRING.encodedSizeWithTag(3, initSDKRequest.version) + ProtoAdapter.STRING.encodedSizeWithTag(4, initSDKRequest.user_agent);
            if (initSDKRequest.process_type != null) {
                i2 = ProcessType.ADAPTER.encodedSizeWithTag(5, initSDKRequest.process_type);
            } else {
                i2 = 0;
            }
            int i35 = encodedSizeWithTag2 + i2;
            if (initSDKRequest.user_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(6, initSDKRequest.user_id);
            } else {
                i3 = 0;
            }
            int i36 = i35 + i3;
            if (initSDKRequest.need_call_async != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(7, initSDKRequest.need_call_async);
            } else {
                i4 = 0;
            }
            int i37 = i36 + i4;
            if (initSDKRequest.app_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(8, initSDKRequest.app_id);
            } else {
                i5 = 0;
            }
            int i38 = i37 + i5;
            if (initSDKRequest.locale_identifier != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(9, initSDKRequest.locale_identifier);
            } else {
                i6 = 0;
            }
            int i39 = i38 + i6;
            if (initSDKRequest.client_log_storage_path != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(10, initSDKRequest.client_log_storage_path);
            } else {
                i7 = 0;
            }
            int i40 = i39 + i7;
            if (initSDKRequest.path_prefix != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(11, initSDKRequest.path_prefix);
            } else {
                i8 = 0;
            }
            int i41 = i40 + i8;
            if (initSDKRequest.sub_account_path != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(12, initSDKRequest.sub_account_path);
            } else {
                i9 = 0;
            }
            int i42 = i41 + i9;
            if (initSDKRequest.sub_user_path != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(13, initSDKRequest.sub_user_path);
            } else {
                i10 = 0;
            }
            int i43 = i42 + i10;
            if (initSDKRequest.old_storage_path != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(14, initSDKRequest.old_storage_path);
            } else {
                i11 = 0;
            }
            int i44 = i43 + i11;
            if (initSDKRequest.custom_log_path != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(15, initSDKRequest.custom_log_path);
            } else {
                i12 = 0;
            }
            int i45 = i44 + i12;
            if (initSDKRequest.init_log_upload != null) {
                i13 = InitLogUpload.ADAPTER.encodedSizeWithTag(16, initSDKRequest.init_log_upload);
            } else {
                i13 = 0;
            }
            int i46 = i45 + i13;
            if (initSDKRequest.data_synchronism_strategy != null) {
                i14 = DataSynchronismStrategy.ADAPTER.encodedSizeWithTag(20, initSDKRequest.data_synchronism_strategy);
            } else {
                i14 = 0;
            }
            int i47 = i46 + i14;
            if (initSDKRequest.enable_thread != null) {
                i15 = ProtoAdapter.BOOL.encodedSizeWithTag(40, initSDKRequest.enable_thread);
            } else {
                i15 = 0;
            }
            int i48 = i47 + i15;
            if (initSDKRequest.is_wrap_async_callback_data_with_packet != null) {
                i16 = ProtoAdapter.BOOL.encodedSizeWithTag(41, initSDKRequest.is_wrap_async_callback_data_with_packet);
            } else {
                i16 = 0;
            }
            int i49 = i48 + i16;
            if (initSDKRequest.enable_thread_subscription != null) {
                i17 = ProtoAdapter.BOOL.encodedSizeWithTag(42, initSDKRequest.enable_thread_subscription);
            } else {
                i17 = 0;
            }
            int i50 = i49 + i17;
            if (initSDKRequest.use_deprecated_push_msg != null) {
                i18 = ProtoAdapter.BOOL.encodedSizeWithTag(43, initSDKRequest.use_deprecated_push_msg);
            } else {
                i18 = 0;
            }
            int i51 = i50 + i18;
            if (initSDKRequest.preload_config != null) {
                i19 = PreloadConfig.ADAPTER.encodedSizeWithTag(44, initSDKRequest.preload_config);
            } else {
                i19 = 0;
            }
            int i52 = i51 + i19;
            if (initSDKRequest.power_level_under_background != null) {
                i20 = PowerLevel.ADAPTER.encodedSizeWithTag(45, initSDKRequest.power_level_under_background);
            } else {
                i20 = 0;
            }
            int i53 = i52 + i20;
            if (initSDKRequest.package_id != null) {
                i21 = PackageId.ADAPTER.encodedSizeWithTag(46, initSDKRequest.package_id);
            } else {
                i21 = 0;
            }
            int i54 = i53 + i21;
            if (initSDKRequest.deprecated_config != null) {
                i22 = DeprecatedConfig.ADAPTER.encodedSizeWithTag(47, initSDKRequest.deprecated_config);
            } else {
                i22 = 0;
            }
            int i55 = i54 + i22;
            if (initSDKRequest.ka_init_config != null) {
                i23 = KaInitConfig.ADAPTER.encodedSizeWithTag(48, initSDKRequest.ka_init_config);
            } else {
                i23 = 0;
            }
            int i56 = i55 + i23;
            if (initSDKRequest.frontier_config != null) {
                i24 = FrontierConfig.ADAPTER.encodedSizeWithTag(49, initSDKRequest.frontier_config);
            } else {
                i24 = 0;
            }
            int i57 = i56 + i24;
            if (initSDKRequest.env_v2 != null) {
                i25 = EnvV2.ADAPTER.encodedSizeWithTag(50, initSDKRequest.env_v2);
            } else {
                i25 = 0;
            }
            int i58 = i57 + i25;
            if (initSDKRequest.main_thread_id != null) {
                i26 = ProtoAdapter.INT64.encodedSizeWithTag(51, initSDKRequest.main_thread_id);
            } else {
                i26 = 0;
            }
            int i59 = i58 + i26;
            if (initSDKRequest.need_settings != null) {
                i27 = ProtoAdapter.BOOL.encodedSizeWithTag(52, initSDKRequest.need_settings);
            } else {
                i27 = 0;
            }
            int i60 = i59 + i27;
            if (initSDKRequest.client_cert != null) {
                i28 = NetworkClientCertificate.ADAPTER.encodedSizeWithTag(53, initSDKRequest.client_cert);
            } else {
                i28 = 0;
            }
            int i61 = i60 + i28;
            if (initSDKRequest.boe_tt_feature_env != null) {
                i29 = ProtoAdapter.STRING.encodedSizeWithTag(54, initSDKRequest.boe_tt_feature_env);
            } else {
                i29 = 0;
            }
            int i62 = i61 + i29;
            if (initSDKRequest.boe_rpc_persist_dyecp_fd != null) {
                i30 = BoeRpcPersistDyecpFd.ADAPTER.encodedSizeWithTag(55, initSDKRequest.boe_rpc_persist_dyecp_fd);
            } else {
                i30 = 0;
            }
            int i63 = i62 + i30;
            if (initSDKRequest.local_timezone != null) {
                i31 = ProtoAdapter.STRING.encodedSizeWithTag(56, initSDKRequest.local_timezone);
            } else {
                i31 = 0;
            }
            int encodedSizeWithTag3 = i63 + i31 + ProtoAdapter.STRING.encodedSizeWithTag(57, initSDKRequest.init_config_path);
            if (initSDKRequest.basic_mode != null) {
                i32 = ProtoAdapter.BOOL.encodedSizeWithTag(58, initSDKRequest.basic_mode);
            } else {
                i32 = 0;
            }
            int i64 = encodedSizeWithTag3 + i32;
            if (initSDKRequest.stress_test_tag != null) {
                i33 = ProtoAdapter.STRING.encodedSizeWithTag(59, initSDKRequest.stress_test_tag);
            } else {
                i33 = 0;
            }
            int i65 = i64 + i33;
            if (initSDKRequest.wasm_init_config != null) {
                i34 = ProtoAdapter.STRING.encodedSizeWithTag(60, initSDKRequest.wasm_init_config);
            }
            return i65 + i34 + initSDKRequest.unknownFields().size();
        }

        /* renamed from: a */
        public InitSDKRequest decode(ProtoReader protoReader) throws IOException {
            C15029a aVar = new C15029a();
            aVar.f39738a = "";
            aVar.f39739b = EnvType.ONLINE;
            aVar.f39740c = "";
            aVar.f39741d = "";
            aVar.f39742e = ProcessType.MAIN;
            aVar.f39743f = "";
            aVar.f39744g = false;
            aVar.f39745h = "1161";
            aVar.f39746i = "zh_CN";
            aVar.f39747j = "";
            aVar.f39748k = "";
            aVar.f39749l = "";
            aVar.f39750m = "";
            aVar.f39751n = "";
            aVar.f39752o = "";
            aVar.f39754q = DataSynchronismStrategy.BROADCAST;
            aVar.f39755r = false;
            aVar.f39756s = false;
            aVar.f39757t = false;
            aVar.f39758u = true;
            aVar.f39760w = PowerLevel.Low;
            aVar.f39761x = PackageId.LARK;
            aVar.f39728C = 0L;
            aVar.f39729D = false;
            aVar.f39731F = "";
            aVar.f39733H = "";
            aVar.f39734I = "";
            aVar.f39735J = false;
            aVar.f39736K = "";
            aVar.f39737L = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 20) {
                    switch (nextTag) {
                        case 1:
                            aVar.f39738a = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 2:
                            try {
                                aVar.f39739b = EnvType.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f39740c = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 4:
                            aVar.f39741d = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 5:
                            try {
                                aVar.f39742e = ProcessType.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 6:
                            aVar.f39743f = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 7:
                            aVar.f39744g = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 8:
                            aVar.f39745h = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 9:
                            aVar.f39746i = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 10:
                            aVar.f39747j = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 11:
                            aVar.f39748k = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f39749l = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 13:
                            aVar.f39750m = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 14:
                            aVar.f39751n = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 15:
                            aVar.f39752o = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 16:
                            aVar.f39753p = InitLogUpload.ADAPTER.decode(protoReader);
                            continue;
                        default:
                            switch (nextTag) {
                                case 40:
                                    aVar.f39755r = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 41:
                                    aVar.f39756s = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 42:
                                    aVar.f39757t = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 43:
                                    aVar.f39758u = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 44:
                                    aVar.f39759v = PreloadConfig.ADAPTER.decode(protoReader);
                                    continue;
                                case 45:
                                    try {
                                        aVar.f39760w = PowerLevel.ADAPTER.decode(protoReader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                        break;
                                    }
                                case 46:
                                    try {
                                        aVar.f39761x = PackageId.ADAPTER.decode(protoReader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                        break;
                                    }
                                case 47:
                                    aVar.f39762y = DeprecatedConfig.ADAPTER.decode(protoReader);
                                    continue;
                                case 48:
                                    aVar.f39763z = KaInitConfig.ADAPTER.decode(protoReader);
                                    continue;
                                case 49:
                                    aVar.f39726A = FrontierConfig.ADAPTER.decode(protoReader);
                                    continue;
                                case MmListControl.f116813f /*{ENCODED_INT: 50}*/:
                                    aVar.f39727B = EnvV2.ADAPTER.decode(protoReader);
                                    continue;
                                case 51:
                                    aVar.f39728C = ProtoAdapter.INT64.decode(protoReader);
                                    continue;
                                case 52:
                                    aVar.f39729D = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 53:
                                    aVar.f39730E = NetworkClientCertificate.ADAPTER.decode(protoReader);
                                    continue;
                                case 54:
                                    aVar.f39731F = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case 55:
                                    aVar.f39732G = BoeRpcPersistDyecpFd.ADAPTER.decode(protoReader);
                                    continue;
                                case 56:
                                    aVar.f39733H = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case 57:
                                    aVar.f39734I = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case 58:
                                    aVar.f39735J = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 59:
                                    aVar.f39736K = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case 60:
                                    aVar.f39737L = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                default:
                                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    continue;
                                    continue;
                            }
                    }
                } else {
                    try {
                        aVar.f39754q = DataSynchronismStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e5.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, InitSDKRequest initSDKRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, initSDKRequest.storage_path);
            if (initSDKRequest.env != null) {
                EnvType.ADAPTER.encodeWithTag(protoWriter, 2, initSDKRequest.env);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, initSDKRequest.version);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, initSDKRequest.user_agent);
            if (initSDKRequest.process_type != null) {
                ProcessType.ADAPTER.encodeWithTag(protoWriter, 5, initSDKRequest.process_type);
            }
            if (initSDKRequest.user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, initSDKRequest.user_id);
            }
            if (initSDKRequest.need_call_async != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, initSDKRequest.need_call_async);
            }
            if (initSDKRequest.app_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, initSDKRequest.app_id);
            }
            if (initSDKRequest.locale_identifier != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, initSDKRequest.locale_identifier);
            }
            if (initSDKRequest.client_log_storage_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, initSDKRequest.client_log_storage_path);
            }
            if (initSDKRequest.path_prefix != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, initSDKRequest.path_prefix);
            }
            if (initSDKRequest.sub_account_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, initSDKRequest.sub_account_path);
            }
            if (initSDKRequest.sub_user_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, initSDKRequest.sub_user_path);
            }
            if (initSDKRequest.old_storage_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, initSDKRequest.old_storage_path);
            }
            if (initSDKRequest.custom_log_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, initSDKRequest.custom_log_path);
            }
            if (initSDKRequest.init_log_upload != null) {
                InitLogUpload.ADAPTER.encodeWithTag(protoWriter, 16, initSDKRequest.init_log_upload);
            }
            if (initSDKRequest.data_synchronism_strategy != null) {
                DataSynchronismStrategy.ADAPTER.encodeWithTag(protoWriter, 20, initSDKRequest.data_synchronism_strategy);
            }
            if (initSDKRequest.enable_thread != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 40, initSDKRequest.enable_thread);
            }
            if (initSDKRequest.is_wrap_async_callback_data_with_packet != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 41, initSDKRequest.is_wrap_async_callback_data_with_packet);
            }
            if (initSDKRequest.enable_thread_subscription != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 42, initSDKRequest.enable_thread_subscription);
            }
            if (initSDKRequest.use_deprecated_push_msg != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 43, initSDKRequest.use_deprecated_push_msg);
            }
            if (initSDKRequest.preload_config != null) {
                PreloadConfig.ADAPTER.encodeWithTag(protoWriter, 44, initSDKRequest.preload_config);
            }
            if (initSDKRequest.power_level_under_background != null) {
                PowerLevel.ADAPTER.encodeWithTag(protoWriter, 45, initSDKRequest.power_level_under_background);
            }
            if (initSDKRequest.package_id != null) {
                PackageId.ADAPTER.encodeWithTag(protoWriter, 46, initSDKRequest.package_id);
            }
            if (initSDKRequest.deprecated_config != null) {
                DeprecatedConfig.ADAPTER.encodeWithTag(protoWriter, 47, initSDKRequest.deprecated_config);
            }
            if (initSDKRequest.ka_init_config != null) {
                KaInitConfig.ADAPTER.encodeWithTag(protoWriter, 48, initSDKRequest.ka_init_config);
            }
            if (initSDKRequest.frontier_config != null) {
                FrontierConfig.ADAPTER.encodeWithTag(protoWriter, 49, initSDKRequest.frontier_config);
            }
            if (initSDKRequest.env_v2 != null) {
                EnvV2.ADAPTER.encodeWithTag(protoWriter, 50, initSDKRequest.env_v2);
            }
            if (initSDKRequest.main_thread_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 51, initSDKRequest.main_thread_id);
            }
            if (initSDKRequest.need_settings != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 52, initSDKRequest.need_settings);
            }
            if (initSDKRequest.client_cert != null) {
                NetworkClientCertificate.ADAPTER.encodeWithTag(protoWriter, 53, initSDKRequest.client_cert);
            }
            if (initSDKRequest.boe_tt_feature_env != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 54, initSDKRequest.boe_tt_feature_env);
            }
            if (initSDKRequest.boe_rpc_persist_dyecp_fd != null) {
                BoeRpcPersistDyecpFd.ADAPTER.encodeWithTag(protoWriter, 55, initSDKRequest.boe_rpc_persist_dyecp_fd);
            }
            if (initSDKRequest.local_timezone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 56, initSDKRequest.local_timezone);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 57, initSDKRequest.init_config_path);
            if (initSDKRequest.basic_mode != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 58, initSDKRequest.basic_mode);
            }
            if (initSDKRequest.stress_test_tag != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 59, initSDKRequest.stress_test_tag);
            }
            if (initSDKRequest.wasm_init_config != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 60, initSDKRequest.wasm_init_config);
            }
            protoWriter.writeBytes(initSDKRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15029a newBuilder() {
        C15029a aVar = new C15029a();
        aVar.f39738a = this.storage_path;
        aVar.f39739b = this.env;
        aVar.f39740c = this.version;
        aVar.f39741d = this.user_agent;
        aVar.f39742e = this.process_type;
        aVar.f39743f = this.user_id;
        aVar.f39744g = this.need_call_async;
        aVar.f39745h = this.app_id;
        aVar.f39746i = this.locale_identifier;
        aVar.f39747j = this.client_log_storage_path;
        aVar.f39748k = this.path_prefix;
        aVar.f39749l = this.sub_account_path;
        aVar.f39750m = this.sub_user_path;
        aVar.f39751n = this.old_storage_path;
        aVar.f39752o = this.custom_log_path;
        aVar.f39753p = this.init_log_upload;
        aVar.f39754q = this.data_synchronism_strategy;
        aVar.f39755r = this.enable_thread;
        aVar.f39756s = this.is_wrap_async_callback_data_with_packet;
        aVar.f39757t = this.enable_thread_subscription;
        aVar.f39758u = this.use_deprecated_push_msg;
        aVar.f39759v = this.preload_config;
        aVar.f39760w = this.power_level_under_background;
        aVar.f39761x = this.package_id;
        aVar.f39762y = this.deprecated_config;
        aVar.f39763z = this.ka_init_config;
        aVar.f39726A = this.frontier_config;
        aVar.f39727B = this.env_v2;
        aVar.f39728C = this.main_thread_id;
        aVar.f39729D = this.need_settings;
        aVar.f39730E = this.client_cert;
        aVar.f39731F = this.boe_tt_feature_env;
        aVar.f39732G = this.boe_rpc_persist_dyecp_fd;
        aVar.f39733H = this.local_timezone;
        aVar.f39734I = this.init_config_path;
        aVar.f39735J = this.basic_mode;
        aVar.f39736K = this.stress_test_tag;
        aVar.f39737L = this.wasm_init_config;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "InitSDKRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", storage_path=");
        sb.append(this.storage_path);
        if (this.env != null) {
            sb.append(", env=");
            sb.append(this.env);
        }
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", user_agent=");
        sb.append(this.user_agent);
        if (this.process_type != null) {
            sb.append(", process_type=");
            sb.append(this.process_type);
        }
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.need_call_async != null) {
            sb.append(", need_call_async=");
            sb.append(this.need_call_async);
        }
        if (this.app_id != null) {
            sb.append(", app_id=");
            sb.append(this.app_id);
        }
        if (this.locale_identifier != null) {
            sb.append(", locale_identifier=");
            sb.append(this.locale_identifier);
        }
        if (this.client_log_storage_path != null) {
            sb.append(", client_log_storage_path=");
            sb.append(this.client_log_storage_path);
        }
        if (this.path_prefix != null) {
            sb.append(", path_prefix=");
            sb.append(this.path_prefix);
        }
        if (this.sub_account_path != null) {
            sb.append(", sub_account_path=");
            sb.append(this.sub_account_path);
        }
        if (this.sub_user_path != null) {
            sb.append(", sub_user_path=");
            sb.append(this.sub_user_path);
        }
        if (this.old_storage_path != null) {
            sb.append(", old_storage_path=");
            sb.append(this.old_storage_path);
        }
        if (this.custom_log_path != null) {
            sb.append(", custom_log_path=");
            sb.append(this.custom_log_path);
        }
        if (this.init_log_upload != null) {
            sb.append(", init_log_upload=");
            sb.append(this.init_log_upload);
        }
        if (this.data_synchronism_strategy != null) {
            sb.append(", data_synchronism_strategy=");
            sb.append(this.data_synchronism_strategy);
        }
        if (this.enable_thread != null) {
            sb.append(", enable_thread=");
            sb.append(this.enable_thread);
        }
        if (this.is_wrap_async_callback_data_with_packet != null) {
            sb.append(", is_wrap_async_callback_data_with_packet=");
            sb.append(this.is_wrap_async_callback_data_with_packet);
        }
        if (this.enable_thread_subscription != null) {
            sb.append(", enable_thread_subscription=");
            sb.append(this.enable_thread_subscription);
        }
        if (this.use_deprecated_push_msg != null) {
            sb.append(", use_deprecated_push_msg=");
            sb.append(this.use_deprecated_push_msg);
        }
        if (this.preload_config != null) {
            sb.append(", preload_config=");
            sb.append(this.preload_config);
        }
        if (this.power_level_under_background != null) {
            sb.append(", power_level_under_background=");
            sb.append(this.power_level_under_background);
        }
        if (this.package_id != null) {
            sb.append(", package_id=");
            sb.append(this.package_id);
        }
        if (this.deprecated_config != null) {
            sb.append(", deprecated_config=");
            sb.append(this.deprecated_config);
        }
        if (this.ka_init_config != null) {
            sb.append(", ka_init_config=");
            sb.append(this.ka_init_config);
        }
        if (this.frontier_config != null) {
            sb.append(", frontier_config=");
            sb.append(this.frontier_config);
        }
        if (this.env_v2 != null) {
            sb.append(", env_v2=");
            sb.append(this.env_v2);
        }
        if (this.main_thread_id != null) {
            sb.append(", main_thread_id=");
            sb.append(this.main_thread_id);
        }
        if (this.need_settings != null) {
            sb.append(", need_settings=");
            sb.append(this.need_settings);
        }
        if (this.client_cert != null) {
            sb.append(", client_cert=");
            sb.append(this.client_cert);
        }
        if (this.boe_tt_feature_env != null) {
            sb.append(", boe_tt_feature_env=");
            sb.append(this.boe_tt_feature_env);
        }
        if (this.boe_rpc_persist_dyecp_fd != null) {
            sb.append(", boe_rpc_persist_dyecp_fd=");
            sb.append(this.boe_rpc_persist_dyecp_fd);
        }
        if (this.local_timezone != null) {
            sb.append(", local_timezone=");
            sb.append(this.local_timezone);
        }
        sb.append(", init_config_path=");
        sb.append(this.init_config_path);
        if (this.basic_mode != null) {
            sb.append(", basic_mode=");
            sb.append(this.basic_mode);
        }
        if (this.stress_test_tag != null) {
            sb.append(", stress_test_tag=");
            sb.append(this.stress_test_tag);
        }
        if (this.wasm_init_config != null) {
            sb.append(", wasm_init_config=");
            sb.append(this.wasm_init_config);
        }
        StringBuilder replace = sb.replace(0, 2, "InitSDKRequest{");
        replace.append('}');
        return replace.toString();
    }

    public InitSDKRequest(String str, EnvType envType, String str2, String str3, ProcessType processType, String str4, Boolean bool, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, InitLogUpload initLogUpload, DataSynchronismStrategy dataSynchronismStrategy, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, PreloadConfig preloadConfig, PowerLevel powerLevel, PackageId packageId, DeprecatedConfig deprecatedConfig, KaInitConfig kaInitConfig, FrontierConfig frontierConfig, EnvV2 envV2, Long l, Boolean bool6, NetworkClientCertificate networkClientCertificate, String str13, BoeRpcPersistDyecpFd boeRpcPersistDyecpFd, String str14, String str15, Boolean bool7, String str16, String str17) {
        this(str, envType, str2, str3, processType, str4, bool, str5, str6, str7, str8, str9, str10, str11, str12, initLogUpload, dataSynchronismStrategy, bool2, bool3, bool4, bool5, preloadConfig, powerLevel, packageId, deprecatedConfig, kaInitConfig, frontierConfig, envV2, l, bool6, networkClientCertificate, str13, boeRpcPersistDyecpFd, str14, str15, bool7, str16, str17, ByteString.EMPTY);
    }

    public InitSDKRequest(String str, EnvType envType, String str2, String str3, ProcessType processType, String str4, Boolean bool, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, InitLogUpload initLogUpload, DataSynchronismStrategy dataSynchronismStrategy, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, PreloadConfig preloadConfig, PowerLevel powerLevel, PackageId packageId, DeprecatedConfig deprecatedConfig, KaInitConfig kaInitConfig, FrontierConfig frontierConfig, EnvV2 envV2, Long l, Boolean bool6, NetworkClientCertificate networkClientCertificate, String str13, BoeRpcPersistDyecpFd boeRpcPersistDyecpFd, String str14, String str15, Boolean bool7, String str16, String str17, ByteString byteString) {
        super(ADAPTER, byteString);
        this.storage_path = str;
        this.env = envType;
        this.version = str2;
        this.user_agent = str3;
        this.process_type = processType;
        this.user_id = str4;
        this.need_call_async = bool;
        this.app_id = str5;
        this.locale_identifier = str6;
        this.client_log_storage_path = str7;
        this.path_prefix = str8;
        this.sub_account_path = str9;
        this.sub_user_path = str10;
        this.old_storage_path = str11;
        this.custom_log_path = str12;
        this.init_log_upload = initLogUpload;
        this.data_synchronism_strategy = dataSynchronismStrategy;
        this.enable_thread = bool2;
        this.is_wrap_async_callback_data_with_packet = bool3;
        this.enable_thread_subscription = bool4;
        this.use_deprecated_push_msg = bool5;
        this.preload_config = preloadConfig;
        this.power_level_under_background = powerLevel;
        this.package_id = packageId;
        this.deprecated_config = deprecatedConfig;
        this.ka_init_config = kaInitConfig;
        this.frontier_config = frontierConfig;
        this.env_v2 = envV2;
        this.main_thread_id = l;
        this.need_settings = bool6;
        this.client_cert = networkClientCertificate;
        this.boe_tt_feature_env = str13;
        this.boe_rpc_persist_dyecp_fd = boeRpcPersistDyecpFd;
        this.local_timezone = str14;
        this.init_config_path = str15;
        this.basic_mode = bool7;
        this.stress_test_tag = str16;
        this.wasm_init_config = str17;
    }
}
