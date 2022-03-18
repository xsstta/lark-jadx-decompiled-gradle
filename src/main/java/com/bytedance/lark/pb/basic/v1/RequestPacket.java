package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.location.ActivityIdentificationData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class RequestPacket extends Message<RequestPacket, C15155a> {
    public static final ProtoAdapter<RequestPacket> ADAPTER = new C15156b();
    public static final Command DEFAULT_CMD = Command.UNKNOWN_COMMAND;
    public static final Boolean DEFAULT_COLLECT_TRACE = false;
    public static final Boolean DEFAULT_IS_CALLBACK_BY_STREAM = false;
    public static final Long DEFAULT_MAX_AGE = 0L;
    public static final ByteString DEFAULT_PAYLOAD = ByteString.EMPTY;
    public static final Long DEFAULT_SPAN_ID = 0L;
    public static final Long DEFAULT_TASK_ID = 0L;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Boolean DEFAULT_USE_CACHE_CONTROL = false;
    private static final long serialVersionUID = 0;
    public final BizConfig biz_config;
    public final Command cmd;
    public final Boolean collect_trace;
    public final String context_id;
    public final Boolean is_callback_by_stream;
    public final Long max_age;
    public final PassThrough pass_through;
    public final ByteString payload;
    public final Long span_id;
    public final Long task_id;
    public final Long thread_id;
    public final Boolean use_cache_control;
    public final String user_id;

    public static final class BizConfig extends Message<BizConfig, C15151a> {
        public static final ProtoAdapter<BizConfig> ADAPTER = new C15152b();
        public static final DataSource DEFAULT_DATA_SOURCE = DataSource.DEFAULT;
        private static final long serialVersionUID = 0;
        public final DataSource data_source;

        public enum DataSource implements WireEnum {
            DEFAULT(1),
            LOCAL(2),
            PREFERRED_ONLINE(3);
            
            public static final ProtoAdapter<DataSource> ADAPTER = ProtoAdapter.newEnumAdapter(DataSource.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static DataSource fromValue(int i) {
                if (i == 1) {
                    return DEFAULT;
                }
                if (i == 2) {
                    return LOCAL;
                }
                if (i != 3) {
                    return null;
                }
                return PREFERRED_ONLINE;
            }

            private DataSource(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RequestPacket$BizConfig$b */
        private static final class C15152b extends ProtoAdapter<BizConfig> {
            C15152b() {
                super(FieldEncoding.LENGTH_DELIMITED, BizConfig.class);
            }

            /* renamed from: a */
            public int encodedSize(BizConfig bizConfig) {
                int i;
                if (bizConfig.data_source != null) {
                    i = DataSource.ADAPTER.encodedSizeWithTag(1, bizConfig.data_source);
                } else {
                    i = 0;
                }
                return i + bizConfig.unknownFields().size();
            }

            /* renamed from: a */
            public BizConfig decode(ProtoReader protoReader) throws IOException {
                C15151a aVar = new C15151a();
                aVar.f40191a = DataSource.DEFAULT;
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
                        try {
                            aVar.f40191a = DataSource.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, BizConfig bizConfig) throws IOException {
                if (bizConfig.data_source != null) {
                    DataSource.ADAPTER.encodeWithTag(protoWriter, 1, bizConfig.data_source);
                }
                protoWriter.writeBytes(bizConfig.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RequestPacket$BizConfig$a */
        public static final class C15151a extends Message.Builder<BizConfig, C15151a> {

            /* renamed from: a */
            public DataSource f40191a;

            /* renamed from: a */
            public BizConfig build() {
                return new BizConfig(this.f40191a, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C15151a mo55226a(DataSource dataSource) {
                this.f40191a = dataSource;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C15151a newBuilder() {
            C15151a aVar = new C15151a();
            aVar.f40191a = this.data_source;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "BizConfig");
            StringBuilder sb = new StringBuilder();
            if (this.data_source != null) {
                sb.append(", data_source=");
                sb.append(this.data_source);
            }
            StringBuilder replace = sb.replace(0, 2, "BizConfig{");
            replace.append('}');
            return replace.toString();
        }

        public BizConfig(DataSource dataSource) {
            this(dataSource, ByteString.EMPTY);
        }

        public BizConfig(DataSource dataSource, ByteString byteString) {
            super(ADAPTER, byteString);
            this.data_source = dataSource;
        }
    }

    public static final class PassThrough extends Message<PassThrough, C15153a> {
        public static final ProtoAdapter<PassThrough> ADAPTER = new C15154b();
        private static final long serialVersionUID = 0;
        public final String ser_command;

        /* renamed from: com.bytedance.lark.pb.basic.v1.RequestPacket$PassThrough$b */
        private static final class C15154b extends ProtoAdapter<PassThrough> {
            C15154b() {
                super(FieldEncoding.LENGTH_DELIMITED, PassThrough.class);
            }

            /* renamed from: a */
            public int encodedSize(PassThrough passThrough) {
                int i;
                if (passThrough.ser_command != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, passThrough.ser_command);
                } else {
                    i = 0;
                }
                return i + passThrough.unknownFields().size();
            }

            /* renamed from: a */
            public PassThrough decode(ProtoReader protoReader) throws IOException {
                C15153a aVar = new C15153a();
                aVar.f40192a = "";
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
                        aVar.f40192a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, PassThrough passThrough) throws IOException {
                if (passThrough.ser_command != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, passThrough.ser_command);
                }
                protoWriter.writeBytes(passThrough.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.RequestPacket$PassThrough$a */
        public static final class C15153a extends Message.Builder<PassThrough, C15153a> {

            /* renamed from: a */
            public String f40192a;

            /* renamed from: a */
            public PassThrough build() {
                return new PassThrough(this.f40192a, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C15153a mo55231a(String str) {
                this.f40192a = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C15153a newBuilder() {
            C15153a aVar = new C15153a();
            aVar.f40192a = this.ser_command;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "PassThrough");
            StringBuilder sb = new StringBuilder();
            if (this.ser_command != null) {
                sb.append(", ser_command=");
                sb.append(this.ser_command);
            }
            StringBuilder replace = sb.replace(0, 2, "PassThrough{");
            replace.append('}');
            return replace.toString();
        }

        public PassThrough(String str) {
            this(str, ByteString.EMPTY);
        }

        public PassThrough(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.ser_command = str;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.RequestPacket$b */
    private static final class C15156b extends ProtoAdapter<RequestPacket> {
        C15156b() {
            super(FieldEncoding.LENGTH_DELIMITED, RequestPacket.class);
        }

        /* renamed from: a */
        public int encodedSize(RequestPacket requestPacket) {
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
            int i13 = 0;
            if (requestPacket.cmd != null) {
                i = Command.ADAPTER.encodedSizeWithTag(1, requestPacket.cmd);
            } else {
                i = 0;
            }
            if (requestPacket.context_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, requestPacket.context_id);
            } else {
                i2 = 0;
            }
            int i14 = i + i2;
            if (requestPacket.user_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(5, requestPacket.user_id);
            } else {
                i3 = 0;
            }
            int i15 = i14 + i3;
            if (requestPacket.is_callback_by_stream != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(7, requestPacket.is_callback_by_stream);
            } else {
                i4 = 0;
            }
            int i16 = i15 + i4;
            if (requestPacket.pass_through != null) {
                i5 = PassThrough.ADAPTER.encodedSizeWithTag(10, requestPacket.pass_through);
            } else {
                i5 = 0;
            }
            int i17 = i16 + i5;
            if (requestPacket.biz_config != null) {
                i6 = BizConfig.ADAPTER.encodedSizeWithTag(100, requestPacket.biz_config);
            } else {
                i6 = 0;
            }
            int i18 = i17 + i6;
            if (requestPacket.task_id != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(101, requestPacket.task_id);
            } else {
                i7 = 0;
            }
            int i19 = i18 + i7;
            if (requestPacket.max_age != null) {
                i8 = ProtoAdapter.INT64.encodedSizeWithTag(102, requestPacket.max_age);
            } else {
                i8 = 0;
            }
            int i20 = i19 + i8;
            if (requestPacket.use_cache_control != null) {
                i9 = ProtoAdapter.BOOL.encodedSizeWithTag(103, requestPacket.use_cache_control);
            } else {
                i9 = 0;
            }
            int i21 = i20 + i9;
            if (requestPacket.thread_id != null) {
                i10 = ProtoAdapter.INT64.encodedSizeWithTag(104, requestPacket.thread_id);
            } else {
                i10 = 0;
            }
            int i22 = i21 + i10;
            if (requestPacket.span_id != null) {
                i11 = ProtoAdapter.UINT64.encodedSizeWithTag(106, requestPacket.span_id);
            } else {
                i11 = 0;
            }
            int i23 = i22 + i11;
            if (requestPacket.collect_trace != null) {
                i12 = ProtoAdapter.BOOL.encodedSizeWithTag(ActivityIdentificationData.WALKING, requestPacket.collect_trace);
            } else {
                i12 = 0;
            }
            int i24 = i23 + i12;
            if (requestPacket.payload != null) {
                i13 = ProtoAdapter.BYTES.encodedSizeWithTag(9999, requestPacket.payload);
            }
            return i24 + i13 + requestPacket.unknownFields().size();
        }

        /* renamed from: a */
        public RequestPacket decode(ProtoReader protoReader) throws IOException {
            C15155a aVar = new C15155a();
            aVar.f40193a = Command.UNKNOWN_COMMAND;
            aVar.f40194b = "";
            aVar.f40195c = "";
            aVar.f40196d = false;
            aVar.f40199g = 0L;
            aVar.f40200h = 0L;
            aVar.f40201i = false;
            aVar.f40202j = 0L;
            aVar.f40203k = 0L;
            aVar.f40204l = false;
            aVar.f40205m = ByteString.EMPTY;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f40193a = Command.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 7) {
                    aVar.f40196d = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 10) {
                    aVar.f40197e = PassThrough.ADAPTER.decode(protoReader);
                } else if (nextTag == 9999) {
                    aVar.f40205m = ProtoAdapter.BYTES.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f40194b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 5) {
                    aVar.f40195c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 106) {
                    aVar.f40203k = ProtoAdapter.UINT64.decode(protoReader);
                } else if (nextTag != 107) {
                    switch (nextTag) {
                        case 100:
                            aVar.f40198f = BizConfig.ADAPTER.decode(protoReader);
                            continue;
                        case 101:
                            aVar.f40199g = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case 102:
                            aVar.f40200h = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case 103:
                            aVar.f40201i = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 104:
                            aVar.f40202j = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    aVar.f40204l = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, RequestPacket requestPacket) throws IOException {
            if (requestPacket.cmd != null) {
                Command.ADAPTER.encodeWithTag(protoWriter, 1, requestPacket.cmd);
            }
            if (requestPacket.context_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, requestPacket.context_id);
            }
            if (requestPacket.user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, requestPacket.user_id);
            }
            if (requestPacket.is_callback_by_stream != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, requestPacket.is_callback_by_stream);
            }
            if (requestPacket.pass_through != null) {
                PassThrough.ADAPTER.encodeWithTag(protoWriter, 10, requestPacket.pass_through);
            }
            if (requestPacket.biz_config != null) {
                BizConfig.ADAPTER.encodeWithTag(protoWriter, 100, requestPacket.biz_config);
            }
            if (requestPacket.task_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 101, requestPacket.task_id);
            }
            if (requestPacket.max_age != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 102, requestPacket.max_age);
            }
            if (requestPacket.use_cache_control != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 103, requestPacket.use_cache_control);
            }
            if (requestPacket.thread_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 104, requestPacket.thread_id);
            }
            if (requestPacket.span_id != null) {
                ProtoAdapter.UINT64.encodeWithTag(protoWriter, 106, requestPacket.span_id);
            }
            if (requestPacket.collect_trace != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, ActivityIdentificationData.WALKING, requestPacket.collect_trace);
            }
            if (requestPacket.payload != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 9999, requestPacket.payload);
            }
            protoWriter.writeBytes(requestPacket.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15155a newBuilder() {
        C15155a aVar = new C15155a();
        aVar.f40193a = this.cmd;
        aVar.f40194b = this.context_id;
        aVar.f40195c = this.user_id;
        aVar.f40196d = this.is_callback_by_stream;
        aVar.f40197e = this.pass_through;
        aVar.f40198f = this.biz_config;
        aVar.f40199g = this.task_id;
        aVar.f40200h = this.max_age;
        aVar.f40201i = this.use_cache_control;
        aVar.f40202j = this.thread_id;
        aVar.f40203k = this.span_id;
        aVar.f40204l = this.collect_trace;
        aVar.f40205m = this.payload;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "RequestPacket");
        StringBuilder sb = new StringBuilder();
        if (this.cmd != null) {
            sb.append(", cmd=");
            sb.append(this.cmd);
        }
        if (this.context_id != null) {
            sb.append(", context_id=");
            sb.append(this.context_id);
        }
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.is_callback_by_stream != null) {
            sb.append(", is_callback_by_stream=");
            sb.append(this.is_callback_by_stream);
        }
        if (this.pass_through != null) {
            sb.append(", pass_through=");
            sb.append(this.pass_through);
        }
        if (this.biz_config != null) {
            sb.append(", biz_config=");
            sb.append(this.biz_config);
        }
        if (this.task_id != null) {
            sb.append(", task_id=");
            sb.append(this.task_id);
        }
        if (this.max_age != null) {
            sb.append(", max_age=");
            sb.append(this.max_age);
        }
        if (this.use_cache_control != null) {
            sb.append(", use_cache_control=");
            sb.append(this.use_cache_control);
        }
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        if (this.span_id != null) {
            sb.append(", span_id=");
            sb.append(this.span_id);
        }
        if (this.collect_trace != null) {
            sb.append(", collect_trace=");
            sb.append(this.collect_trace);
        }
        if (this.payload != null) {
            sb.append(", payload=");
            sb.append(this.payload);
        }
        StringBuilder replace = sb.replace(0, 2, "RequestPacket{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.RequestPacket$a */
    public static final class C15155a extends Message.Builder<RequestPacket, C15155a> {

        /* renamed from: a */
        public Command f40193a;

        /* renamed from: b */
        public String f40194b;

        /* renamed from: c */
        public String f40195c;

        /* renamed from: d */
        public Boolean f40196d;

        /* renamed from: e */
        public PassThrough f40197e;

        /* renamed from: f */
        public BizConfig f40198f;

        /* renamed from: g */
        public Long f40199g;

        /* renamed from: h */
        public Long f40200h;

        /* renamed from: i */
        public Boolean f40201i;

        /* renamed from: j */
        public Long f40202j;

        /* renamed from: k */
        public Long f40203k;

        /* renamed from: l */
        public Boolean f40204l;

        /* renamed from: m */
        public ByteString f40205m;

        /* renamed from: a */
        public RequestPacket build() {
            return new RequestPacket(this.f40193a, this.f40194b, this.f40195c, this.f40196d, this.f40197e, this.f40198f, this.f40199g, this.f40200h, this.f40201i, this.f40202j, this.f40203k, this.f40204l, this.f40205m, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15155a mo55236a(Command command) {
            this.f40193a = command;
            return this;
        }

        /* renamed from: b */
        public C15155a mo55244b(Boolean bool) {
            this.f40204l = bool;
            return this;
        }

        /* renamed from: c */
        public C15155a mo55247c(Long l) {
            this.f40203k = l;
            return this;
        }

        /* renamed from: a */
        public C15155a mo55237a(BizConfig bizConfig) {
            this.f40198f = bizConfig;
            return this;
        }

        /* renamed from: b */
        public C15155a mo55245b(Long l) {
            this.f40202j = l;
            return this;
        }

        /* renamed from: a */
        public C15155a mo55238a(PassThrough passThrough) {
            this.f40197e = passThrough;
            return this;
        }

        /* renamed from: b */
        public C15155a mo55246b(String str) {
            this.f40195c = str;
            return this;
        }

        /* renamed from: a */
        public C15155a mo55239a(Boolean bool) {
            this.f40196d = bool;
            return this;
        }

        /* renamed from: a */
        public C15155a mo55240a(Long l) {
            this.f40199g = l;
            return this;
        }

        /* renamed from: a */
        public C15155a mo55241a(String str) {
            this.f40194b = str;
            return this;
        }

        /* renamed from: a */
        public C15155a mo55242a(ByteString byteString) {
            this.f40205m = byteString;
            return this;
        }
    }

    public RequestPacket(Command command, String str, String str2, Boolean bool, PassThrough passThrough, BizConfig bizConfig, Long l, Long l2, Boolean bool2, Long l3, Long l4, Boolean bool3, ByteString byteString) {
        this(command, str, str2, bool, passThrough, bizConfig, l, l2, bool2, l3, l4, bool3, byteString, ByteString.EMPTY);
    }

    public RequestPacket(Command command, String str, String str2, Boolean bool, PassThrough passThrough, BizConfig bizConfig, Long l, Long l2, Boolean bool2, Long l3, Long l4, Boolean bool3, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.cmd = command;
        this.context_id = str;
        this.user_id = str2;
        this.is_callback_by_stream = bool;
        this.pass_through = passThrough;
        this.biz_config = bizConfig;
        this.task_id = l;
        this.max_age = l2;
        this.use_cache_control = bool2;
        this.thread_id = l3;
        this.span_id = l4;
        this.collect_trace = bool3;
        this.payload = byteString;
    }
}
