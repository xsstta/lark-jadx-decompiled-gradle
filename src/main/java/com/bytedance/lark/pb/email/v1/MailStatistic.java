package com.bytedance.lark.pb.email.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class MailStatistic extends Message<MailStatistic, C17064a> {
    public static final ProtoAdapter<MailStatistic> ADAPTER = new C17065b();
    public static final MailStatisticType DEFAULT_TYPE = MailStatisticType.TEA;
    private static final long serialVersionUID = 0;
    public final String key;
    public final MailSlardarParam slardar_param;
    public final MailTeaParam tea_param;
    public final MailStatisticType type;

    public enum MailStatisticType implements WireEnum {
        TEA(1),
        SLARDAR(2),
        BOTH(3);
        
        public static final ProtoAdapter<MailStatisticType> ADAPTER = ProtoAdapter.newEnumAdapter(MailStatisticType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static MailStatisticType fromValue(int i) {
            if (i == 1) {
                return TEA;
            }
            if (i == 2) {
                return SLARDAR;
            }
            if (i != 3) {
                return null;
            }
            return BOTH;
        }

        private MailStatisticType(int i) {
            this.value = i;
        }
    }

    public static final class MailSlardarParam extends Message<MailSlardarParam, C17058a> {
        public static final ProtoAdapter<MailSlardarParam> ADAPTER = new C17059b();
        private static final long serialVersionUID = 0;
        public final MailStatisticParams params;

        /* renamed from: com.bytedance.lark.pb.email.v1.MailStatistic$MailSlardarParam$b */
        private static final class C17059b extends ProtoAdapter<MailSlardarParam> {
            C17059b() {
                super(FieldEncoding.LENGTH_DELIMITED, MailSlardarParam.class);
            }

            /* renamed from: a */
            public int encodedSize(MailSlardarParam mailSlardarParam) {
                int i;
                if (mailSlardarParam.params != null) {
                    i = MailStatisticParams.ADAPTER.encodedSizeWithTag(1, mailSlardarParam.params);
                } else {
                    i = 0;
                }
                return i + mailSlardarParam.unknownFields().size();
            }

            /* renamed from: a */
            public MailSlardarParam decode(ProtoReader protoReader) throws IOException {
                C17058a aVar = new C17058a();
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
                        aVar.f43720a = MailStatisticParams.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MailSlardarParam mailSlardarParam) throws IOException {
                if (mailSlardarParam.params != null) {
                    MailStatisticParams.ADAPTER.encodeWithTag(protoWriter, 1, mailSlardarParam.params);
                }
                protoWriter.writeBytes(mailSlardarParam.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.email.v1.MailStatistic$MailSlardarParam$a */
        public static final class C17058a extends Message.Builder<MailSlardarParam, C17058a> {

            /* renamed from: a */
            public MailStatisticParams f43720a;

            /* renamed from: a */
            public MailSlardarParam build() {
                return new MailSlardarParam(this.f43720a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C17058a newBuilder() {
            C17058a aVar = new C17058a();
            aVar.f43720a = this.params;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("email", "MailSlardarParam");
            StringBuilder sb = new StringBuilder();
            if (this.params != null) {
                sb.append(", params=");
                sb.append(this.params);
            }
            StringBuilder replace = sb.replace(0, 2, "MailSlardarParam{");
            replace.append('}');
            return replace.toString();
        }

        public MailSlardarParam(MailStatisticParams mailStatisticParams) {
            this(mailStatisticParams, ByteString.EMPTY);
        }

        public MailSlardarParam(MailStatisticParams mailStatisticParams, ByteString byteString) {
            super(ADAPTER, byteString);
            this.params = mailStatisticParams;
        }
    }

    public static final class MailTeaParam extends Message<MailTeaParam, C17062a> {
        public static final ProtoAdapter<MailTeaParam> ADAPTER = new C17063b();
        private static final long serialVersionUID = 0;
        public final MailStatisticParams params;

        /* renamed from: com.bytedance.lark.pb.email.v1.MailStatistic$MailTeaParam$b */
        private static final class C17063b extends ProtoAdapter<MailTeaParam> {
            C17063b() {
                super(FieldEncoding.LENGTH_DELIMITED, MailTeaParam.class);
            }

            /* renamed from: a */
            public int encodedSize(MailTeaParam mailTeaParam) {
                int i;
                if (mailTeaParam.params != null) {
                    i = MailStatisticParams.ADAPTER.encodedSizeWithTag(1, mailTeaParam.params);
                } else {
                    i = 0;
                }
                return i + mailTeaParam.unknownFields().size();
            }

            /* renamed from: a */
            public MailTeaParam decode(ProtoReader protoReader) throws IOException {
                C17062a aVar = new C17062a();
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
                        aVar.f43725a = MailStatisticParams.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MailTeaParam mailTeaParam) throws IOException {
                if (mailTeaParam.params != null) {
                    MailStatisticParams.ADAPTER.encodeWithTag(protoWriter, 1, mailTeaParam.params);
                }
                protoWriter.writeBytes(mailTeaParam.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.email.v1.MailStatistic$MailTeaParam$a */
        public static final class C17062a extends Message.Builder<MailTeaParam, C17062a> {

            /* renamed from: a */
            public MailStatisticParams f43725a;

            /* renamed from: a */
            public MailTeaParam build() {
                return new MailTeaParam(this.f43725a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C17062a newBuilder() {
            C17062a aVar = new C17062a();
            aVar.f43725a = this.params;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("email", "MailTeaParam");
            StringBuilder sb = new StringBuilder();
            if (this.params != null) {
                sb.append(", params=");
                sb.append(this.params);
            }
            StringBuilder replace = sb.replace(0, 2, "MailTeaParam{");
            replace.append('}');
            return replace.toString();
        }

        public MailTeaParam(MailStatisticParams mailStatisticParams) {
            this(mailStatisticParams, ByteString.EMPTY);
        }

        public MailTeaParam(MailStatisticParams mailStatisticParams, ByteString byteString) {
            super(ADAPTER, byteString);
            this.params = mailStatisticParams;
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.v1.MailStatistic$b */
    private static final class C17065b extends ProtoAdapter<MailStatistic> {
        C17065b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailStatistic.class);
        }

        /* renamed from: a */
        public int encodedSize(MailStatistic mailStatistic) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, mailStatistic.key) + MailStatisticType.ADAPTER.encodedSizeWithTag(2, mailStatistic.type);
            int i2 = 0;
            if (mailStatistic.tea_param != null) {
                i = MailTeaParam.ADAPTER.encodedSizeWithTag(3, mailStatistic.tea_param);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (mailStatistic.slardar_param != null) {
                i2 = MailSlardarParam.ADAPTER.encodedSizeWithTag(4, mailStatistic.slardar_param);
            }
            return i3 + i2 + mailStatistic.unknownFields().size();
        }

        /* renamed from: a */
        public MailStatistic decode(ProtoReader protoReader) throws IOException {
            C17064a aVar = new C17064a();
            aVar.f43726a = "";
            aVar.f43727b = MailStatisticType.TEA;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43726a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f43727b = MailStatisticType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f43728c = MailTeaParam.ADAPTER.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43729d = MailSlardarParam.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailStatistic mailStatistic) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailStatistic.key);
            MailStatisticType.ADAPTER.encodeWithTag(protoWriter, 2, mailStatistic.type);
            if (mailStatistic.tea_param != null) {
                MailTeaParam.ADAPTER.encodeWithTag(protoWriter, 3, mailStatistic.tea_param);
            }
            if (mailStatistic.slardar_param != null) {
                MailSlardarParam.ADAPTER.encodeWithTag(protoWriter, 4, mailStatistic.slardar_param);
            }
            protoWriter.writeBytes(mailStatistic.unknownFields());
        }
    }

    public static final class MailStatisticParams extends Message<MailStatisticParams, C17060a> {
        public static final ProtoAdapter<MailStatisticParams> ADAPTER = new C17061b();
        private static final long serialVersionUID = 0;
        public final Map<String, Integer> int_param;
        public final Map<String, String> string_param;

        /* renamed from: com.bytedance.lark.pb.email.v1.MailStatistic$MailStatisticParams$a */
        public static final class C17060a extends Message.Builder<MailStatisticParams, C17060a> {

            /* renamed from: a */
            public Map<String, Integer> f43721a = Internal.newMutableMap();

            /* renamed from: b */
            public Map<String, String> f43722b = Internal.newMutableMap();

            /* renamed from: a */
            public MailStatisticParams build() {
                return new MailStatisticParams(this.f43721a, this.f43722b, super.buildUnknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.email.v1.MailStatistic$MailStatisticParams$b */
        private static final class C17061b extends ProtoAdapter<MailStatisticParams> {

            /* renamed from: a */
            private final ProtoAdapter<Map<String, Integer>> f43723a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.INT32);

            /* renamed from: b */
            private final ProtoAdapter<Map<String, String>> f43724b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

            C17061b() {
                super(FieldEncoding.LENGTH_DELIMITED, MailStatisticParams.class);
            }

            /* renamed from: a */
            public int encodedSize(MailStatisticParams mailStatisticParams) {
                return this.f43723a.encodedSizeWithTag(1, mailStatisticParams.int_param) + this.f43724b.encodedSizeWithTag(2, mailStatisticParams.string_param) + mailStatisticParams.unknownFields().size();
            }

            /* renamed from: a */
            public MailStatisticParams decode(ProtoReader protoReader) throws IOException {
                C17060a aVar = new C17060a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f43721a.putAll(this.f43723a.decode(protoReader));
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f43722b.putAll(this.f43724b.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MailStatisticParams mailStatisticParams) throws IOException {
                this.f43723a.encodeWithTag(protoWriter, 1, mailStatisticParams.int_param);
                this.f43724b.encodeWithTag(protoWriter, 2, mailStatisticParams.string_param);
                protoWriter.writeBytes(mailStatisticParams.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C17060a newBuilder() {
            C17060a aVar = new C17060a();
            aVar.f43721a = Internal.copyOf("int_param", this.int_param);
            aVar.f43722b = Internal.copyOf("string_param", this.string_param);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("email", "MailStatisticParams");
            StringBuilder sb = new StringBuilder();
            if (!this.int_param.isEmpty()) {
                sb.append(", int_param=");
                sb.append(this.int_param);
            }
            if (!this.string_param.isEmpty()) {
                sb.append(", string_param=");
                sb.append(this.string_param);
            }
            StringBuilder replace = sb.replace(0, 2, "MailStatisticParams{");
            replace.append('}');
            return replace.toString();
        }

        public MailStatisticParams(Map<String, Integer> map, Map<String, String> map2) {
            this(map, map2, ByteString.EMPTY);
        }

        public MailStatisticParams(Map<String, Integer> map, Map<String, String> map2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.int_param = Internal.immutableCopyOf("int_param", map);
            this.string_param = Internal.immutableCopyOf("string_param", map2);
        }
    }

    @Override // com.squareup.wire.Message
    public C17064a newBuilder() {
        C17064a aVar = new C17064a();
        aVar.f43726a = this.key;
        aVar.f43727b = this.type;
        aVar.f43728c = this.tea_param;
        aVar.f43729d = this.slardar_param;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.email.v1.MailStatistic$a */
    public static final class C17064a extends Message.Builder<MailStatistic, C17064a> {

        /* renamed from: a */
        public String f43726a;

        /* renamed from: b */
        public MailStatisticType f43727b;

        /* renamed from: c */
        public MailTeaParam f43728c;

        /* renamed from: d */
        public MailSlardarParam f43729d;

        /* renamed from: a */
        public MailStatistic build() {
            MailStatisticType mailStatisticType;
            String str = this.f43726a;
            if (str != null && (mailStatisticType = this.f43727b) != null) {
                return new MailStatistic(str, mailStatisticType, this.f43728c, this.f43729d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "key", this.f43727b, ShareHitPoint.f121869d);
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailStatistic");
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", type=");
        sb.append(this.type);
        if (this.tea_param != null) {
            sb.append(", tea_param=");
            sb.append(this.tea_param);
        }
        if (this.slardar_param != null) {
            sb.append(", slardar_param=");
            sb.append(this.slardar_param);
        }
        StringBuilder replace = sb.replace(0, 2, "MailStatistic{");
        replace.append('}');
        return replace.toString();
    }

    public MailStatistic(String str, MailStatisticType mailStatisticType, MailTeaParam mailTeaParam, MailSlardarParam mailSlardarParam) {
        this(str, mailStatisticType, mailTeaParam, mailSlardarParam, ByteString.EMPTY);
    }

    public MailStatistic(String str, MailStatisticType mailStatisticType, MailTeaParam mailTeaParam, MailSlardarParam mailSlardarParam, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.type = mailStatisticType;
        this.tea_param = mailTeaParam;
        this.slardar_param = mailSlardarParam;
    }
}
