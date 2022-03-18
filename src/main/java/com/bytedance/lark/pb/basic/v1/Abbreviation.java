package com.bytedance.lark.pb.basic.v1;

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
import java.util.Map;
import okio.ByteString;

public final class Abbreviation extends Message<Abbreviation, C14637a> {
    public static final ProtoAdapter<Abbreviation> ADAPTER = new C14638b();
    private static final long serialVersionUID = 0;
    public final Map<String, Abbrs> abbr_element_ref;

    /* renamed from: com.bytedance.lark.pb.basic.v1.Abbreviation$entity */
    public static final class C14639entity extends Message<C14639entity, C14642a> {
        public static final ProtoAdapter<C14639entity> ADAPTER = new C14643b();
        public static final Type DEFAULT_ABBR_TYPE = Type.UNKOWN;
        public static final Integer DEFAULT_ABBR_VERSION = 0;
        private static final long serialVersionUID = 0;
        public final String abbr_id;
        public final Type abbr_type;
        public final Integer abbr_version;
        public final DatetimeEntity datetime;

        /* renamed from: com.bytedance.lark.pb.basic.v1.Abbreviation$entity$Type */
        public enum Type implements WireEnum {
            UNKOWN(0),
            ACRONYM(1),
            WIKI(2),
            DATETIME(3);
            
            public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Type fromValue(int i) {
                if (i == 0) {
                    return UNKOWN;
                }
                if (i == 1) {
                    return ACRONYM;
                }
                if (i == 2) {
                    return WIKI;
                }
                if (i != 3) {
                    return null;
                }
                return DATETIME;
            }

            private Type(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Abbreviation$entity$DatetimeEntity */
        public static final class DatetimeEntity extends Message<DatetimeEntity, C14640a> {
            public static final ProtoAdapter<DatetimeEntity> ADAPTER = new C14641b();
            public static final Integer DEFAULT_DURATION = 0;
            public static final Long DEFAULT_END = 0L;
            public static final Long DEFAULT_START = 0L;
            private static final long serialVersionUID = 0;
            public final Integer duration;
            public final Long end;
            public final String grain;
            public final Long start;

            /* renamed from: com.bytedance.lark.pb.basic.v1.Abbreviation$entity$DatetimeEntity$b */
            private static final class C14641b extends ProtoAdapter<DatetimeEntity> {
                C14641b() {
                    super(FieldEncoding.LENGTH_DELIMITED, DatetimeEntity.class);
                }

                /* renamed from: a */
                public int encodedSize(DatetimeEntity datetimeEntity) {
                    int i;
                    int i2;
                    int i3;
                    int i4 = 0;
                    if (datetimeEntity.start != null) {
                        i = ProtoAdapter.INT64.encodedSizeWithTag(1, datetimeEntity.start);
                    } else {
                        i = 0;
                    }
                    if (datetimeEntity.end != null) {
                        i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, datetimeEntity.end);
                    } else {
                        i2 = 0;
                    }
                    int i5 = i + i2;
                    if (datetimeEntity.duration != null) {
                        i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, datetimeEntity.duration);
                    } else {
                        i3 = 0;
                    }
                    int i6 = i5 + i3;
                    if (datetimeEntity.grain != null) {
                        i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, datetimeEntity.grain);
                    }
                    return i6 + i4 + datetimeEntity.unknownFields().size();
                }

                /* renamed from: a */
                public DatetimeEntity decode(ProtoReader protoReader) throws IOException {
                    C14640a aVar = new C14640a();
                    aVar.f38738a = 0L;
                    aVar.f38739b = 0L;
                    aVar.f38740c = 0;
                    aVar.f38741d = "";
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag == -1) {
                            protoReader.endMessage(beginMessage);
                            return aVar.build();
                        } else if (nextTag == 1) {
                            aVar.f38738a = ProtoAdapter.INT64.decode(protoReader);
                        } else if (nextTag == 2) {
                            aVar.f38739b = ProtoAdapter.INT64.decode(protoReader);
                        } else if (nextTag == 3) {
                            aVar.f38740c = ProtoAdapter.INT32.decode(protoReader);
                        } else if (nextTag != 4) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            aVar.f38741d = ProtoAdapter.STRING.decode(protoReader);
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, DatetimeEntity datetimeEntity) throws IOException {
                    if (datetimeEntity.start != null) {
                        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, datetimeEntity.start);
                    }
                    if (datetimeEntity.end != null) {
                        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, datetimeEntity.end);
                    }
                    if (datetimeEntity.duration != null) {
                        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, datetimeEntity.duration);
                    }
                    if (datetimeEntity.grain != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, datetimeEntity.grain);
                    }
                    protoWriter.writeBytes(datetimeEntity.unknownFields());
                }
            }

            /* renamed from: com.bytedance.lark.pb.basic.v1.Abbreviation$entity$DatetimeEntity$a */
            public static final class C14640a extends Message.Builder<DatetimeEntity, C14640a> {

                /* renamed from: a */
                public Long f38738a;

                /* renamed from: b */
                public Long f38739b;

                /* renamed from: c */
                public Integer f38740c;

                /* renamed from: d */
                public String f38741d;

                /* renamed from: a */
                public DatetimeEntity build() {
                    return new DatetimeEntity(this.f38738a, this.f38739b, this.f38740c, this.f38741d, super.buildUnknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C14640a newBuilder() {
                C14640a aVar = new C14640a();
                aVar.f38738a = this.start;
                aVar.f38739b = this.end;
                aVar.f38740c = this.duration;
                aVar.f38741d = this.grain;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("basic", "DatetimeEntity");
                StringBuilder sb = new StringBuilder();
                if (this.start != null) {
                    sb.append(", start=");
                    sb.append(this.start);
                }
                if (this.end != null) {
                    sb.append(", end=");
                    sb.append(this.end);
                }
                if (this.duration != null) {
                    sb.append(", duration=");
                    sb.append(this.duration);
                }
                if (this.grain != null) {
                    sb.append(", grain=");
                    sb.append(this.grain);
                }
                StringBuilder replace = sb.replace(0, 2, "DatetimeEntity{");
                replace.append('}');
                return replace.toString();
            }

            public DatetimeEntity(Long l, Long l2, Integer num, String str) {
                this(l, l2, num, str, ByteString.EMPTY);
            }

            public DatetimeEntity(Long l, Long l2, Integer num, String str, ByteString byteString) {
                super(ADAPTER, byteString);
                this.start = l;
                this.end = l2;
                this.duration = num;
                this.grain = str;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Abbreviation$entity$b */
        private static final class C14643b extends ProtoAdapter<C14639entity> {
            C14643b() {
                super(FieldEncoding.LENGTH_DELIMITED, C14639entity.class);
            }

            /* renamed from: a */
            public int encodedSize(C14639entity entity) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (entity.abbr_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, entity.abbr_id);
                } else {
                    i = 0;
                }
                if (entity.abbr_version != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, entity.abbr_version);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (entity.abbr_type != null) {
                    i3 = Type.ADAPTER.encodedSizeWithTag(3, entity.abbr_type);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (entity.datetime != null) {
                    i4 = DatetimeEntity.ADAPTER.encodedSizeWithTag(4, entity.datetime);
                }
                return i6 + i4 + entity.unknownFields().size();
            }

            /* renamed from: a */
            public C14639entity decode(ProtoReader protoReader) throws IOException {
                C14642a aVar = new C14642a();
                aVar.f38742a = "";
                aVar.f38743b = 0;
                aVar.f38744c = Type.UNKOWN;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f38742a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f38743b = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag == 3) {
                        try {
                            aVar.f38744c = Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f38745d = DatetimeEntity.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, C14639entity entity) throws IOException {
                if (entity.abbr_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, entity.abbr_id);
                }
                if (entity.abbr_version != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, entity.abbr_version);
                }
                if (entity.abbr_type != null) {
                    Type.ADAPTER.encodeWithTag(protoWriter, 3, entity.abbr_type);
                }
                if (entity.datetime != null) {
                    DatetimeEntity.ADAPTER.encodeWithTag(protoWriter, 4, entity.datetime);
                }
                protoWriter.writeBytes(entity.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Abbreviation$entity$a */
        public static final class C14642a extends Message.Builder<C14639entity, C14642a> {

            /* renamed from: a */
            public String f38742a;

            /* renamed from: b */
            public Integer f38743b;

            /* renamed from: c */
            public Type f38744c;

            /* renamed from: d */
            public DatetimeEntity f38745d;

            /* renamed from: a */
            public C14639entity build() {
                return new C14639entity(this.f38742a, this.f38743b, this.f38744c, this.f38745d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14642a newBuilder() {
            C14642a aVar = new C14642a();
            aVar.f38742a = this.abbr_id;
            aVar.f38743b = this.abbr_version;
            aVar.f38744c = this.abbr_type;
            aVar.f38745d = this.datetime;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "entity");
            StringBuilder sb = new StringBuilder();
            if (this.abbr_id != null) {
                sb.append(", abbr_id=");
                sb.append(this.abbr_id);
            }
            if (this.abbr_version != null) {
                sb.append(", abbr_version=");
                sb.append(this.abbr_version);
            }
            if (this.abbr_type != null) {
                sb.append(", abbr_type=");
                sb.append(this.abbr_type);
            }
            if (this.datetime != null) {
                sb.append(", datetime=");
                sb.append(this.datetime);
            }
            StringBuilder replace = sb.replace(0, 2, "entity{");
            replace.append('}');
            return replace.toString();
        }

        public C14639entity(String str, Integer num, Type type, DatetimeEntity datetimeEntity) {
            this(str, num, type, datetimeEntity, ByteString.EMPTY);
        }

        public C14639entity(String str, Integer num, Type type, DatetimeEntity datetimeEntity, ByteString byteString) {
            super(ADAPTER, byteString);
            this.abbr_id = str;
            this.abbr_version = num;
            this.abbr_type = type;
            this.datetime = datetimeEntity;
        }
    }

    public static final class Abbrs extends Message<Abbrs, C14635a> {
        public static final ProtoAdapter<Abbrs> ADAPTER = new C14636b();
        private static final long serialVersionUID = 0;
        public final List<C14639entity> abbrs;

        /* renamed from: com.bytedance.lark.pb.basic.v1.Abbreviation$Abbrs$b */
        private static final class C14636b extends ProtoAdapter<Abbrs> {
            C14636b() {
                super(FieldEncoding.LENGTH_DELIMITED, Abbrs.class);
            }

            /* renamed from: a */
            public int encodedSize(Abbrs abbrs) {
                return C14639entity.ADAPTER.asRepeated().encodedSizeWithTag(1, abbrs.abbrs) + abbrs.unknownFields().size();
            }

            /* renamed from: a */
            public Abbrs decode(ProtoReader protoReader) throws IOException {
                C14635a aVar = new C14635a();
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
                        aVar.f38735a.add(C14639entity.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Abbrs abbrs) throws IOException {
                C14639entity.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, abbrs.abbrs);
                protoWriter.writeBytes(abbrs.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Abbreviation$Abbrs$a */
        public static final class C14635a extends Message.Builder<Abbrs, C14635a> {

            /* renamed from: a */
            public List<C14639entity> f38735a = Internal.newMutableList();

            /* renamed from: a */
            public Abbrs build() {
                return new Abbrs(this.f38735a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14635a newBuilder() {
            C14635a aVar = new C14635a();
            aVar.f38735a = Internal.copyOf("abbrs", this.abbrs);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "Abbrs");
            StringBuilder sb = new StringBuilder();
            if (!this.abbrs.isEmpty()) {
                sb.append(", abbrs=");
                sb.append(this.abbrs);
            }
            StringBuilder replace = sb.replace(0, 2, "Abbrs{");
            replace.append('}');
            return replace.toString();
        }

        public Abbrs(List<C14639entity> list) {
            this(list, ByteString.EMPTY);
        }

        public Abbrs(List<C14639entity> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.abbrs = Internal.immutableCopyOf("abbrs", list);
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Abbreviation$a */
    public static final class C14637a extends Message.Builder<Abbreviation, C14637a> {

        /* renamed from: a */
        public Map<String, Abbrs> f38736a = Internal.newMutableMap();

        /* renamed from: a */
        public Abbreviation build() {
            return new Abbreviation(this.f38736a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Abbreviation$b */
    private static final class C14638b extends ProtoAdapter<Abbreviation> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Abbrs>> f38737a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Abbrs.ADAPTER);

        C14638b() {
            super(FieldEncoding.LENGTH_DELIMITED, Abbreviation.class);
        }

        /* renamed from: a */
        public int encodedSize(Abbreviation abbreviation) {
            return this.f38737a.encodedSizeWithTag(1, abbreviation.abbr_element_ref) + abbreviation.unknownFields().size();
        }

        /* renamed from: a */
        public Abbreviation decode(ProtoReader protoReader) throws IOException {
            C14637a aVar = new C14637a();
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
                    aVar.f38736a.putAll(this.f38737a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Abbreviation abbreviation) throws IOException {
            this.f38737a.encodeWithTag(protoWriter, 1, abbreviation.abbr_element_ref);
            protoWriter.writeBytes(abbreviation.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14637a newBuilder() {
        C14637a aVar = new C14637a();
        aVar.f38736a = Internal.copyOf("abbr_element_ref", this.abbr_element_ref);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "Abbreviation");
        StringBuilder sb = new StringBuilder();
        if (!this.abbr_element_ref.isEmpty()) {
            sb.append(", abbr_element_ref=");
            sb.append(this.abbr_element_ref);
        }
        StringBuilder replace = sb.replace(0, 2, "Abbreviation{");
        replace.append('}');
        return replace.toString();
    }

    public Abbreviation(Map<String, Abbrs> map) {
        this(map, ByteString.EMPTY);
    }

    public Abbreviation(Map<String, Abbrs> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.abbr_element_ref = Internal.immutableCopyOf("abbr_element_ref", map);
    }
}
