package com.bytedance.lark.pb.email.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class MailSlardar extends Message<MailSlardar, C17056a> {
    public static final ProtoAdapter<MailSlardar> ADAPTER = new C17057b();
    private static final long serialVersionUID = 0;
    public final Category category;
    public final Metric metric;

    public static final class Metric extends Message<Metric, C17054a> {
        public static final ProtoAdapter<Metric> ADAPTER = new C17055b();
        private static final long serialVersionUID = 0;
        public final Error error;
        public final String event;
        public final Latency latency;

        public static final class Error extends Message<Error, C17050a> {
            public static final ProtoAdapter<Error> ADAPTER = new C17051b();
            public static final Integer DEFAULT_ERROR_CODE = 0;
            public static final Integer DEFAULT_ERROR_TYPE = 0;
            public static final Integer DEFAULT_LEVEL = 0;
            private static final long serialVersionUID = 0;
            public final Integer error_code;
            public final Integer error_type;
            public final Integer level;

            /* renamed from: com.bytedance.lark.pb.email.v1.MailSlardar$Metric$Error$b */
            private static final class C17051b extends ProtoAdapter<Error> {
                C17051b() {
                    super(FieldEncoding.LENGTH_DELIMITED, Error.class);
                }

                /* renamed from: a */
                public int encodedSize(Error error) {
                    int i;
                    int i2;
                    int i3 = 0;
                    if (error.error_code != null) {
                        i = ProtoAdapter.INT32.encodedSizeWithTag(1, error.error_code);
                    } else {
                        i = 0;
                    }
                    if (error.error_type != null) {
                        i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, error.error_type);
                    } else {
                        i2 = 0;
                    }
                    int i4 = i + i2;
                    if (error.level != null) {
                        i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, error.level);
                    }
                    return i4 + i3 + error.unknownFields().size();
                }

                /* renamed from: a */
                public Error decode(ProtoReader protoReader) throws IOException {
                    C17050a aVar = new C17050a();
                    aVar.f43709a = 0;
                    aVar.f43710b = 0;
                    aVar.f43711c = 0;
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag == -1) {
                            protoReader.endMessage(beginMessage);
                            return aVar.build();
                        } else if (nextTag == 1) {
                            aVar.f43709a = ProtoAdapter.INT32.decode(protoReader);
                        } else if (nextTag == 2) {
                            aVar.f43710b = ProtoAdapter.INT32.decode(protoReader);
                        } else if (nextTag != 3) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            aVar.f43711c = ProtoAdapter.INT32.decode(protoReader);
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, Error error) throws IOException {
                    if (error.error_code != null) {
                        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, error.error_code);
                    }
                    if (error.error_type != null) {
                        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, error.error_type);
                    }
                    if (error.level != null) {
                        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, error.level);
                    }
                    protoWriter.writeBytes(error.unknownFields());
                }
            }

            /* renamed from: com.bytedance.lark.pb.email.v1.MailSlardar$Metric$Error$a */
            public static final class C17050a extends Message.Builder<Error, C17050a> {

                /* renamed from: a */
                public Integer f43709a;

                /* renamed from: b */
                public Integer f43710b;

                /* renamed from: c */
                public Integer f43711c;

                /* renamed from: a */
                public Error build() {
                    return new Error(this.f43709a, this.f43710b, this.f43711c, super.buildUnknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C17050a newBuilder() {
                C17050a aVar = new C17050a();
                aVar.f43709a = this.error_code;
                aVar.f43710b = this.error_type;
                aVar.f43711c = this.level;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("email", "Error");
                StringBuilder sb = new StringBuilder();
                if (this.error_code != null) {
                    sb.append(", error_code=");
                    sb.append(this.error_code);
                }
                if (this.error_type != null) {
                    sb.append(", error_type=");
                    sb.append(this.error_type);
                }
                if (this.level != null) {
                    sb.append(", level=");
                    sb.append(this.level);
                }
                StringBuilder replace = sb.replace(0, 2, "Error{");
                replace.append('}');
                return replace.toString();
            }

            public Error(Integer num, Integer num2, Integer num3) {
                this(num, num2, num3, ByteString.EMPTY);
            }

            public Error(Integer num, Integer num2, Integer num3, ByteString byteString) {
                super(ADAPTER, byteString);
                this.error_code = num;
                this.error_type = num2;
                this.level = num3;
            }
        }

        /* renamed from: com.bytedance.lark.pb.email.v1.MailSlardar$Metric$b */
        private static final class C17055b extends ProtoAdapter<Metric> {
            C17055b() {
                super(FieldEncoding.LENGTH_DELIMITED, Metric.class);
            }

            /* renamed from: a */
            public int encodedSize(Metric metric) {
                int i;
                int i2;
                int i3 = 0;
                if (metric.event != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, metric.event);
                } else {
                    i = 0;
                }
                if (metric.latency != null) {
                    i2 = Latency.ADAPTER.encodedSizeWithTag(2, metric.latency);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (metric.error != null) {
                    i3 = Error.ADAPTER.encodedSizeWithTag(3, metric.error);
                }
                return i4 + i3 + metric.unknownFields().size();
            }

            /* renamed from: a */
            public Metric decode(ProtoReader protoReader) throws IOException {
                C17054a aVar = new C17054a();
                aVar.f43715a = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f43715a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.mo60195a(Latency.ADAPTER.decode(protoReader));
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.mo60194a(Error.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Metric metric) throws IOException {
                if (metric.event != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, metric.event);
                }
                if (metric.latency != null) {
                    Latency.ADAPTER.encodeWithTag(protoWriter, 2, metric.latency);
                }
                if (metric.error != null) {
                    Error.ADAPTER.encodeWithTag(protoWriter, 3, metric.error);
                }
                protoWriter.writeBytes(metric.unknownFields());
            }
        }

        public static final class Latency extends Message<Latency, C17052a> {
            public static final ProtoAdapter<Latency> ADAPTER = new C17053b();
            public static final Long DEFAULT_TIME_COST = 0L;
            private static final long serialVersionUID = 0;
            public final Map<String, Long> detail;
            public final Long time_cost;

            /* renamed from: com.bytedance.lark.pb.email.v1.MailSlardar$Metric$Latency$a */
            public static final class C17052a extends Message.Builder<Latency, C17052a> {

                /* renamed from: a */
                public Long f43712a;

                /* renamed from: b */
                public Map<String, Long> f43713b = Internal.newMutableMap();

                /* renamed from: a */
                public Latency build() {
                    return new Latency(this.f43712a, this.f43713b, super.buildUnknownFields());
                }
            }

            /* renamed from: com.bytedance.lark.pb.email.v1.MailSlardar$Metric$Latency$b */
            private static final class C17053b extends ProtoAdapter<Latency> {

                /* renamed from: a */
                private final ProtoAdapter<Map<String, Long>> f43714a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.INT64);

                C17053b() {
                    super(FieldEncoding.LENGTH_DELIMITED, Latency.class);
                }

                /* renamed from: a */
                public int encodedSize(Latency latency) {
                    int i;
                    if (latency.time_cost != null) {
                        i = ProtoAdapter.INT64.encodedSizeWithTag(1, latency.time_cost);
                    } else {
                        i = 0;
                    }
                    return i + this.f43714a.encodedSizeWithTag(2, latency.detail) + latency.unknownFields().size();
                }

                /* renamed from: a */
                public Latency decode(ProtoReader protoReader) throws IOException {
                    C17052a aVar = new C17052a();
                    aVar.f43712a = 0L;
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag == -1) {
                            protoReader.endMessage(beginMessage);
                            return aVar.build();
                        } else if (nextTag == 1) {
                            aVar.f43712a = ProtoAdapter.INT64.decode(protoReader);
                        } else if (nextTag != 2) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            aVar.f43713b.putAll(this.f43714a.decode(protoReader));
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, Latency latency) throws IOException {
                    if (latency.time_cost != null) {
                        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, latency.time_cost);
                    }
                    this.f43714a.encodeWithTag(protoWriter, 2, latency.detail);
                    protoWriter.writeBytes(latency.unknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C17052a newBuilder() {
                C17052a aVar = new C17052a();
                aVar.f43712a = this.time_cost;
                aVar.f43713b = Internal.copyOf("detail", this.detail);
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("email", "Latency");
                StringBuilder sb = new StringBuilder();
                if (this.time_cost != null) {
                    sb.append(", time_cost=");
                    sb.append(this.time_cost);
                }
                if (!this.detail.isEmpty()) {
                    sb.append(", detail=");
                    sb.append(this.detail);
                }
                StringBuilder replace = sb.replace(0, 2, "Latency{");
                replace.append('}');
                return replace.toString();
            }

            public Latency(Long l, Map<String, Long> map) {
                this(l, map, ByteString.EMPTY);
            }

            public Latency(Long l, Map<String, Long> map, ByteString byteString) {
                super(ADAPTER, byteString);
                this.time_cost = l;
                this.detail = Internal.immutableCopyOf("detail", map);
            }
        }

        /* renamed from: com.bytedance.lark.pb.email.v1.MailSlardar$Metric$a */
        public static final class C17054a extends Message.Builder<Metric, C17054a> {

            /* renamed from: a */
            public String f43715a;

            /* renamed from: b */
            public Latency f43716b;

            /* renamed from: c */
            public Error f43717c;

            /* renamed from: a */
            public Metric build() {
                return new Metric(this.f43715a, this.f43716b, this.f43717c, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C17054a mo60194a(Error error) {
                this.f43717c = error;
                this.f43716b = null;
                return this;
            }

            /* renamed from: a */
            public C17054a mo60195a(Latency latency) {
                this.f43716b = latency;
                this.f43717c = null;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C17054a newBuilder() {
            C17054a aVar = new C17054a();
            aVar.f43715a = this.event;
            aVar.f43716b = this.latency;
            aVar.f43717c = this.error;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("email", "Metric");
            StringBuilder sb = new StringBuilder();
            if (this.event != null) {
                sb.append(", event=");
                sb.append(this.event);
            }
            if (this.latency != null) {
                sb.append(", latency=");
                sb.append(this.latency);
            }
            if (this.error != null) {
                sb.append(", error=");
                sb.append(this.error);
            }
            StringBuilder replace = sb.replace(0, 2, "Metric{");
            replace.append('}');
            return replace.toString();
        }

        public Metric(String str, Latency latency2, Error error2) {
            this(str, latency2, error2, ByteString.EMPTY);
        }

        public Metric(String str, Latency latency2, Error error2, ByteString byteString) {
            super(ADAPTER, byteString);
            if (Internal.countNonNull(latency2, error2) <= 1) {
                this.event = str;
                this.latency = latency2;
                this.error = error2;
                return;
            }
            throw new IllegalArgumentException("at most one of latency, error may be non-null");
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.v1.MailSlardar$b */
    private static final class C17057b extends ProtoAdapter<MailSlardar> {
        C17057b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailSlardar.class);
        }

        /* renamed from: a */
        public int encodedSize(MailSlardar mailSlardar) {
            int i;
            int i2 = 0;
            if (mailSlardar.metric != null) {
                i = Metric.ADAPTER.encodedSizeWithTag(1, mailSlardar.metric);
            } else {
                i = 0;
            }
            if (mailSlardar.category != null) {
                i2 = Category.ADAPTER.encodedSizeWithTag(2, mailSlardar.category);
            }
            return i + i2 + mailSlardar.unknownFields().size();
        }

        /* renamed from: a */
        public MailSlardar decode(ProtoReader protoReader) throws IOException {
            C17056a aVar = new C17056a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43718a = Metric.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43719b = Category.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailSlardar mailSlardar) throws IOException {
            if (mailSlardar.metric != null) {
                Metric.ADAPTER.encodeWithTag(protoWriter, 1, mailSlardar.metric);
            }
            if (mailSlardar.category != null) {
                Category.ADAPTER.encodeWithTag(protoWriter, 2, mailSlardar.category);
            }
            protoWriter.writeBytes(mailSlardar.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.v1.MailSlardar$a */
    public static final class C17056a extends Message.Builder<MailSlardar, C17056a> {

        /* renamed from: a */
        public Metric f43718a;

        /* renamed from: b */
        public Category f43719b;

        /* renamed from: a */
        public MailSlardar build() {
            return new MailSlardar(this.f43718a, this.f43719b, super.buildUnknownFields());
        }
    }

    public static final class Category extends Message<Category, C17048a> {
        public static final ProtoAdapter<Category> ADAPTER = new C17049b();
        public static final Integer DEFAULT_BIZ = 6;
        public static final Boolean DEFAULT_IS_NEED_NET = false;
        public static final Integer DEFAULT_SCENE = 0;
        private static final long serialVersionUID = 0;
        public final Integer biz;
        public final Map<String, Integer> int_extra;
        public final Boolean is_need_net;
        public final String page;
        public final Integer scene;
        public final Map<String, String> str_extra;

        /* renamed from: com.bytedance.lark.pb.email.v1.MailSlardar$Category$a */
        public static final class C17048a extends Message.Builder<Category, C17048a> {

            /* renamed from: a */
            public Integer f43701a;

            /* renamed from: b */
            public Integer f43702b;

            /* renamed from: c */
            public String f43703c;

            /* renamed from: d */
            public Boolean f43704d;

            /* renamed from: e */
            public Map<String, Integer> f43705e = Internal.newMutableMap();

            /* renamed from: f */
            public Map<String, String> f43706f = Internal.newMutableMap();

            /* renamed from: a */
            public Category build() {
                return new Category(this.f43701a, this.f43702b, this.f43703c, this.f43704d, this.f43705e, this.f43706f, super.buildUnknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.email.v1.MailSlardar$Category$b */
        private static final class C17049b extends ProtoAdapter<Category> {

            /* renamed from: a */
            private final ProtoAdapter<Map<String, Integer>> f43707a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.INT32);

            /* renamed from: b */
            private final ProtoAdapter<Map<String, String>> f43708b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

            C17049b() {
                super(FieldEncoding.LENGTH_DELIMITED, Category.class);
            }

            /* renamed from: a */
            public int encodedSize(Category category) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (category.biz != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(1, category.biz);
                } else {
                    i = 0;
                }
                if (category.scene != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, category.scene);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (category.page != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, category.page);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (category.is_need_net != null) {
                    i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, category.is_need_net);
                }
                return i6 + i4 + this.f43707a.encodedSizeWithTag(5, category.int_extra) + this.f43708b.encodedSizeWithTag(6, category.str_extra) + category.unknownFields().size();
            }

            /* renamed from: a */
            public Category decode(ProtoReader protoReader) throws IOException {
                C17048a aVar = new C17048a();
                aVar.f43701a = 6;
                aVar.f43702b = 0;
                aVar.f43703c = "";
                aVar.f43704d = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f43701a = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 2:
                                aVar.f43702b = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 3:
                                aVar.f43703c = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                aVar.f43704d = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 5:
                                aVar.f43705e.putAll(this.f43707a.decode(protoReader));
                                break;
                            case 6:
                                aVar.f43706f.putAll(this.f43708b.decode(protoReader));
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
            public void encode(ProtoWriter protoWriter, Category category) throws IOException {
                if (category.biz != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, category.biz);
                }
                if (category.scene != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, category.scene);
                }
                if (category.page != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, category.page);
                }
                if (category.is_need_net != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, category.is_need_net);
                }
                this.f43707a.encodeWithTag(protoWriter, 5, category.int_extra);
                this.f43708b.encodeWithTag(protoWriter, 6, category.str_extra);
                protoWriter.writeBytes(category.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C17048a newBuilder() {
            C17048a aVar = new C17048a();
            aVar.f43701a = this.biz;
            aVar.f43702b = this.scene;
            aVar.f43703c = this.page;
            aVar.f43704d = this.is_need_net;
            aVar.f43705e = Internal.copyOf("int_extra", this.int_extra);
            aVar.f43706f = Internal.copyOf("str_extra", this.str_extra);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("email", "Category");
            StringBuilder sb = new StringBuilder();
            if (this.biz != null) {
                sb.append(", biz=");
                sb.append(this.biz);
            }
            if (this.scene != null) {
                sb.append(", scene=");
                sb.append(this.scene);
            }
            if (this.page != null) {
                sb.append(", page=");
                sb.append(this.page);
            }
            if (this.is_need_net != null) {
                sb.append(", is_need_net=");
                sb.append(this.is_need_net);
            }
            if (!this.int_extra.isEmpty()) {
                sb.append(", int_extra=");
                sb.append(this.int_extra);
            }
            if (!this.str_extra.isEmpty()) {
                sb.append(", str_extra=");
                sb.append(this.str_extra);
            }
            StringBuilder replace = sb.replace(0, 2, "Category{");
            replace.append('}');
            return replace.toString();
        }

        public Category(Integer num, Integer num2, String str, Boolean bool, Map<String, Integer> map, Map<String, String> map2) {
            this(num, num2, str, bool, map, map2, ByteString.EMPTY);
        }

        public Category(Integer num, Integer num2, String str, Boolean bool, Map<String, Integer> map, Map<String, String> map2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.biz = num;
            this.scene = num2;
            this.page = str;
            this.is_need_net = bool;
            this.int_extra = Internal.immutableCopyOf("int_extra", map);
            this.str_extra = Internal.immutableCopyOf("str_extra", map2);
        }
    }

    @Override // com.squareup.wire.Message
    public C17056a newBuilder() {
        C17056a aVar = new C17056a();
        aVar.f43718a = this.metric;
        aVar.f43719b = this.category;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailSlardar");
        StringBuilder sb = new StringBuilder();
        if (this.metric != null) {
            sb.append(", metric=");
            sb.append(this.metric);
        }
        if (this.category != null) {
            sb.append(", category=");
            sb.append(this.category);
        }
        StringBuilder replace = sb.replace(0, 2, "MailSlardar{");
        replace.append('}');
        return replace.toString();
    }

    public MailSlardar(Metric metric2, Category category2) {
        this(metric2, category2, ByteString.EMPTY);
    }

    public MailSlardar(Metric metric2, Category category2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.metric = metric2;
        this.category = category2;
    }
}
