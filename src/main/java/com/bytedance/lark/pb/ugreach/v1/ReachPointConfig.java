package com.bytedance.lark.pb.ugreach.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class ReachPointConfig extends Message<ReachPointConfig, C19793a> {
    public static final ProtoAdapter<ReachPointConfig> ADAPTER = new C19794b();
    public static final Long DEFAULT_CACHE_PERIOD = 0L;
    public static final DataStrategy DEFAULT_DATA_STRATEGY = DataStrategy.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Long cache_period;
    public final DataStrategy data_strategy;
    public final ReachPointRelation relation;

    public enum DataStrategy implements WireEnum {
        UNKNOWN(0),
        SUPPORT_CACHE(1),
        REALTIME(2);
        
        public static final ProtoAdapter<DataStrategy> ADAPTER = ProtoAdapter.newEnumAdapter(DataStrategy.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static DataStrategy fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return SUPPORT_CACHE;
            }
            if (i != 2) {
                return null;
            }
            return REALTIME;
        }

        private DataStrategy(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.ReachPointConfig$b */
    private static final class C19794b extends ProtoAdapter<ReachPointConfig> {
        C19794b() {
            super(FieldEncoding.LENGTH_DELIMITED, ReachPointConfig.class);
        }

        /* renamed from: a */
        public int encodedSize(ReachPointConfig reachPointConfig) {
            int i;
            int i2;
            int i3 = 0;
            if (reachPointConfig.relation != null) {
                i = ReachPointRelation.ADAPTER.encodedSizeWithTag(1, reachPointConfig.relation);
            } else {
                i = 0;
            }
            if (reachPointConfig.data_strategy != null) {
                i2 = DataStrategy.ADAPTER.encodedSizeWithTag(2, reachPointConfig.data_strategy);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (reachPointConfig.cache_period != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, reachPointConfig.cache_period);
            }
            return i4 + i3 + reachPointConfig.unknownFields().size();
        }

        /* renamed from: a */
        public ReachPointConfig decode(ProtoReader protoReader) throws IOException {
            C19793a aVar = new C19793a();
            aVar.f48256b = DataStrategy.UNKNOWN;
            aVar.f48257c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48255a = ReachPointRelation.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f48256b = DataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48257c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ReachPointConfig reachPointConfig) throws IOException {
            if (reachPointConfig.relation != null) {
                ReachPointRelation.ADAPTER.encodeWithTag(protoWriter, 1, reachPointConfig.relation);
            }
            if (reachPointConfig.data_strategy != null) {
                DataStrategy.ADAPTER.encodeWithTag(protoWriter, 2, reachPointConfig.data_strategy);
            }
            if (reachPointConfig.cache_period != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, reachPointConfig.cache_period);
            }
            protoWriter.writeBytes(reachPointConfig.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.ReachPointConfig$a */
    public static final class C19793a extends Message.Builder<ReachPointConfig, C19793a> {

        /* renamed from: a */
        public ReachPointRelation f48255a;

        /* renamed from: b */
        public DataStrategy f48256b;

        /* renamed from: c */
        public Long f48257c;

        /* renamed from: a */
        public ReachPointConfig build() {
            return new ReachPointConfig(this.f48255a, this.f48256b, this.f48257c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19793a newBuilder() {
        C19793a aVar = new C19793a();
        aVar.f48255a = this.relation;
        aVar.f48256b = this.data_strategy;
        aVar.f48257c = this.cache_period;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ugreach", "ReachPointConfig");
        StringBuilder sb = new StringBuilder();
        if (this.relation != null) {
            sb.append(", relation=");
            sb.append(this.relation);
        }
        if (this.data_strategy != null) {
            sb.append(", data_strategy=");
            sb.append(this.data_strategy);
        }
        if (this.cache_period != null) {
            sb.append(", cache_period=");
            sb.append(this.cache_period);
        }
        StringBuilder replace = sb.replace(0, 2, "ReachPointConfig{");
        replace.append('}');
        return replace.toString();
    }

    public ReachPointConfig(ReachPointRelation reachPointRelation, DataStrategy dataStrategy, Long l) {
        this(reachPointRelation, dataStrategy, l, ByteString.EMPTY);
    }

    public ReachPointConfig(ReachPointRelation reachPointRelation, DataStrategy dataStrategy, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.relation = reachPointRelation;
        this.data_strategy = dataStrategy;
        this.cache_period = l;
    }
}
