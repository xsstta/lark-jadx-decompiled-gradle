package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class AnonymityLimitation extends Message<AnonymityLimitation, C18322a> {
    public static final ProtoAdapter<AnonymityLimitation> ADAPTER = new C18323b();
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final IntervalLimit interval_limit;
    public final ManuallyLimit manually_limit;
    public final NoLimitation no_limit;
    public final Type type;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        INTERVAL(1),
        MANUALLY(2),
        NO_LIMITATION(3);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return INTERVAL;
            }
            if (i == 2) {
                return MANUALLY;
            }
            if (i != 3) {
                return null;
            }
            return NO_LIMITATION;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public static final class IntervalLimit extends Message<IntervalLimit, C18316a> {
        public static final ProtoAdapter<IntervalLimit> ADAPTER = new C18317b();
        public static final Integer DEFAULT_DAYS = 0;
        public static final Integer DEFAULT_LIMIT = 0;
        private static final long serialVersionUID = 0;
        public final Integer days;
        public final Integer limit;

        /* renamed from: com.bytedance.lark.pb.moments.v1.AnonymityLimitation$IntervalLimit$b */
        private static final class C18317b extends ProtoAdapter<IntervalLimit> {
            C18317b() {
                super(FieldEncoding.LENGTH_DELIMITED, IntervalLimit.class);
            }

            /* renamed from: a */
            public int encodedSize(IntervalLimit intervalLimit) {
                int i;
                int i2 = 0;
                if (intervalLimit.days != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(1, intervalLimit.days);
                } else {
                    i = 0;
                }
                if (intervalLimit.limit != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, intervalLimit.limit);
                }
                return i + i2 + intervalLimit.unknownFields().size();
            }

            /* renamed from: a */
            public IntervalLimit decode(ProtoReader protoReader) throws IOException {
                C18316a aVar = new C18316a();
                aVar.f45624a = 0;
                aVar.f45625b = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f45624a = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f45625b = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, IntervalLimit intervalLimit) throws IOException {
                if (intervalLimit.days != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, intervalLimit.days);
                }
                if (intervalLimit.limit != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, intervalLimit.limit);
                }
                protoWriter.writeBytes(intervalLimit.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.moments.v1.AnonymityLimitation$IntervalLimit$a */
        public static final class C18316a extends Message.Builder<IntervalLimit, C18316a> {

            /* renamed from: a */
            public Integer f45624a;

            /* renamed from: b */
            public Integer f45625b;

            /* renamed from: a */
            public IntervalLimit build() {
                return new IntervalLimit(this.f45624a, this.f45625b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18316a newBuilder() {
            C18316a aVar = new C18316a();
            aVar.f45624a = this.days;
            aVar.f45625b = this.limit;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("moments", "IntervalLimit");
            StringBuilder sb = new StringBuilder();
            if (this.days != null) {
                sb.append(", days=");
                sb.append(this.days);
            }
            if (this.limit != null) {
                sb.append(", limit=");
                sb.append(this.limit);
            }
            StringBuilder replace = sb.replace(0, 2, "IntervalLimit{");
            replace.append('}');
            return replace.toString();
        }

        public IntervalLimit(Integer num, Integer num2) {
            this(num, num2, ByteString.EMPTY);
        }

        public IntervalLimit(Integer num, Integer num2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.days = num;
            this.limit = num2;
        }
    }

    public static final class ManuallyLimit extends Message<ManuallyLimit, C18318a> {
        public static final ProtoAdapter<ManuallyLimit> ADAPTER = new C18319b();
        public static final Long DEFAULT_BEGIN_SEC = 0L;
        public static final Long DEFAULT_END_SEC = 0L;
        public static final Integer DEFAULT_LIMIT = 0;
        private static final long serialVersionUID = 0;
        public final Long begin_sec;
        public final Long end_sec;
        public final Integer limit;

        /* renamed from: com.bytedance.lark.pb.moments.v1.AnonymityLimitation$ManuallyLimit$b */
        private static final class C18319b extends ProtoAdapter<ManuallyLimit> {
            C18319b() {
                super(FieldEncoding.LENGTH_DELIMITED, ManuallyLimit.class);
            }

            /* renamed from: a */
            public int encodedSize(ManuallyLimit manuallyLimit) {
                int i;
                int i2;
                int i3 = 0;
                if (manuallyLimit.begin_sec != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, manuallyLimit.begin_sec);
                } else {
                    i = 0;
                }
                if (manuallyLimit.end_sec != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, manuallyLimit.end_sec);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (manuallyLimit.limit != null) {
                    i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, manuallyLimit.limit);
                }
                return i4 + i3 + manuallyLimit.unknownFields().size();
            }

            /* renamed from: a */
            public ManuallyLimit decode(ProtoReader protoReader) throws IOException {
                C18318a aVar = new C18318a();
                aVar.f45626a = 0L;
                aVar.f45627b = 0L;
                aVar.f45628c = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f45626a = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f45627b = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f45628c = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ManuallyLimit manuallyLimit) throws IOException {
                if (manuallyLimit.begin_sec != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, manuallyLimit.begin_sec);
                }
                if (manuallyLimit.end_sec != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, manuallyLimit.end_sec);
                }
                if (manuallyLimit.limit != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, manuallyLimit.limit);
                }
                protoWriter.writeBytes(manuallyLimit.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.moments.v1.AnonymityLimitation$ManuallyLimit$a */
        public static final class C18318a extends Message.Builder<ManuallyLimit, C18318a> {

            /* renamed from: a */
            public Long f45626a;

            /* renamed from: b */
            public Long f45627b;

            /* renamed from: c */
            public Integer f45628c;

            /* renamed from: a */
            public ManuallyLimit build() {
                return new ManuallyLimit(this.f45626a, this.f45627b, this.f45628c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18318a newBuilder() {
            C18318a aVar = new C18318a();
            aVar.f45626a = this.begin_sec;
            aVar.f45627b = this.end_sec;
            aVar.f45628c = this.limit;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("moments", "ManuallyLimit");
            StringBuilder sb = new StringBuilder();
            if (this.begin_sec != null) {
                sb.append(", begin_sec=");
                sb.append(this.begin_sec);
            }
            if (this.end_sec != null) {
                sb.append(", end_sec=");
                sb.append(this.end_sec);
            }
            if (this.limit != null) {
                sb.append(", limit=");
                sb.append(this.limit);
            }
            StringBuilder replace = sb.replace(0, 2, "ManuallyLimit{");
            replace.append('}');
            return replace.toString();
        }

        public ManuallyLimit(Long l, Long l2, Integer num) {
            this(l, l2, num, ByteString.EMPTY);
        }

        public ManuallyLimit(Long l, Long l2, Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            this.begin_sec = l;
            this.end_sec = l2;
            this.limit = num;
        }
    }

    public static final class NoLimitation extends Message<NoLimitation, C18320a> {
        public static final ProtoAdapter<NoLimitation> ADAPTER = new C18321b();
        private static final long serialVersionUID = 0;

        /* renamed from: com.bytedance.lark.pb.moments.v1.AnonymityLimitation$NoLimitation$b */
        private static final class C18321b extends ProtoAdapter<NoLimitation> {
            C18321b() {
                super(FieldEncoding.LENGTH_DELIMITED, NoLimitation.class);
            }

            /* renamed from: a */
            public int encodedSize(NoLimitation noLimitation) {
                return noLimitation.unknownFields().size();
            }

            /* renamed from: a */
            public NoLimitation decode(ProtoReader protoReader) throws IOException {
                C18320a aVar = new C18320a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, NoLimitation noLimitation) throws IOException {
                protoWriter.writeBytes(noLimitation.unknownFields());
            }
        }

        public NoLimitation() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.moments.v1.AnonymityLimitation$NoLimitation$a */
        public static final class C18320a extends Message.Builder<NoLimitation, C18320a> {
            /* renamed from: a */
            public NoLimitation build() {
                return new NoLimitation(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18320a newBuilder() {
            C18320a aVar = new C18320a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("moments", "NoLimitation");
            StringBuilder replace = new StringBuilder().replace(0, 2, "NoLimitation{");
            replace.append('}');
            return replace.toString();
        }

        public NoLimitation(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.AnonymityLimitation$b */
    private static final class C18323b extends ProtoAdapter<AnonymityLimitation> {
        C18323b() {
            super(FieldEncoding.LENGTH_DELIMITED, AnonymityLimitation.class);
        }

        /* renamed from: a */
        public int encodedSize(AnonymityLimitation anonymityLimitation) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (anonymityLimitation.type != null) {
                i = Type.ADAPTER.encodedSizeWithTag(1, anonymityLimitation.type);
            } else {
                i = 0;
            }
            if (anonymityLimitation.interval_limit != null) {
                i2 = IntervalLimit.ADAPTER.encodedSizeWithTag(6, anonymityLimitation.interval_limit);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (anonymityLimitation.manually_limit != null) {
                i3 = ManuallyLimit.ADAPTER.encodedSizeWithTag(7, anonymityLimitation.manually_limit);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (anonymityLimitation.no_limit != null) {
                i4 = NoLimitation.ADAPTER.encodedSizeWithTag(8, anonymityLimitation.no_limit);
            }
            return i6 + i4 + anonymityLimitation.unknownFields().size();
        }

        /* renamed from: a */
        public AnonymityLimitation decode(ProtoReader protoReader) throws IOException {
            C18322a aVar = new C18322a();
            aVar.f45629a = Type.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f45629a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 6) {
                    aVar.f45630b = IntervalLimit.ADAPTER.decode(protoReader);
                } else if (nextTag == 7) {
                    aVar.f45631c = ManuallyLimit.ADAPTER.decode(protoReader);
                } else if (nextTag != 8) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45632d = NoLimitation.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AnonymityLimitation anonymityLimitation) throws IOException {
            if (anonymityLimitation.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 1, anonymityLimitation.type);
            }
            if (anonymityLimitation.interval_limit != null) {
                IntervalLimit.ADAPTER.encodeWithTag(protoWriter, 6, anonymityLimitation.interval_limit);
            }
            if (anonymityLimitation.manually_limit != null) {
                ManuallyLimit.ADAPTER.encodeWithTag(protoWriter, 7, anonymityLimitation.manually_limit);
            }
            if (anonymityLimitation.no_limit != null) {
                NoLimitation.ADAPTER.encodeWithTag(protoWriter, 8, anonymityLimitation.no_limit);
            }
            protoWriter.writeBytes(anonymityLimitation.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.AnonymityLimitation$a */
    public static final class C18322a extends Message.Builder<AnonymityLimitation, C18322a> {

        /* renamed from: a */
        public Type f45629a;

        /* renamed from: b */
        public IntervalLimit f45630b;

        /* renamed from: c */
        public ManuallyLimit f45631c;

        /* renamed from: d */
        public NoLimitation f45632d;

        /* renamed from: a */
        public AnonymityLimitation build() {
            return new AnonymityLimitation(this.f45629a, this.f45630b, this.f45631c, this.f45632d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18322a newBuilder() {
        C18322a aVar = new C18322a();
        aVar.f45629a = this.type;
        aVar.f45630b = this.interval_limit;
        aVar.f45631c = this.manually_limit;
        aVar.f45632d = this.no_limit;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "AnonymityLimitation");
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.interval_limit != null) {
            sb.append(", interval_limit=");
            sb.append(this.interval_limit);
        }
        if (this.manually_limit != null) {
            sb.append(", manually_limit=");
            sb.append(this.manually_limit);
        }
        if (this.no_limit != null) {
            sb.append(", no_limit=");
            sb.append(this.no_limit);
        }
        StringBuilder replace = sb.replace(0, 2, "AnonymityLimitation{");
        replace.append('}');
        return replace.toString();
    }

    public AnonymityLimitation(Type type2, IntervalLimit intervalLimit, ManuallyLimit manuallyLimit, NoLimitation noLimitation) {
        this(type2, intervalLimit, manuallyLimit, noLimitation, ByteString.EMPTY);
    }

    public AnonymityLimitation(Type type2, IntervalLimit intervalLimit, ManuallyLimit manuallyLimit, NoLimitation noLimitation, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.interval_limit = intervalLimit;
        this.manually_limit = manuallyLimit;
        this.no_limit = noLimitation;
    }
}
