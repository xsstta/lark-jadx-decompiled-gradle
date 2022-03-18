package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class SetDataDisplayWeightRequest extends Message<SetDataDisplayWeightRequest, C19203a> {
    public static final ProtoAdapter<SetDataDisplayWeightRequest> ADAPTER = new C19204b();
    private static final long serialVersionUID = 0;
    public final Map<Integer, DisplayWeight> data_display_weights;

    public enum DataType implements WireEnum {
        CHAT_MESSAGE(1),
        CHAT_THREAD(2),
        THREAD_MESSAGE(3);
        
        public static final ProtoAdapter<DataType> ADAPTER = ProtoAdapter.newEnumAdapter(DataType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static DataType fromValue(int i) {
            if (i == 1) {
                return CHAT_MESSAGE;
            }
            if (i == 2) {
                return CHAT_THREAD;
            }
            if (i != 3) {
                return null;
            }
            return THREAD_MESSAGE;
        }

        private DataType(int i) {
            this.value = i;
        }
    }

    public static final class DisplayWeight extends Message<DisplayWeight, C19201a> {
        public static final ProtoAdapter<DisplayWeight> ADAPTER = new C19202b();
        public static final Double DEFAULT_MAX_WEIGHT = Double.valueOf(0.0d);
        private static final long serialVersionUID = 0;
        public final Double max_weight;
        public final Map<Integer, Double> type2max_weights;
        public final Map<Integer, Double> type2weights;

        /* renamed from: com.bytedance.lark.pb.settings.v1.SetDataDisplayWeightRequest$DisplayWeight$a */
        public static final class C19201a extends Message.Builder<DisplayWeight, C19201a> {

            /* renamed from: a */
            public Map<Integer, Double> f47365a = Internal.newMutableMap();

            /* renamed from: b */
            public Double f47366b;

            /* renamed from: c */
            public Map<Integer, Double> f47367c = Internal.newMutableMap();

            /* renamed from: a */
            public DisplayWeight build() {
                return new DisplayWeight(this.f47365a, this.f47366b, this.f47367c, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C19201a mo65566a(Map<Integer, Double> map) {
                Internal.checkElementsNotNull(map);
                this.f47365a = map;
                return this;
            }

            /* renamed from: b */
            public C19201a mo65568b(Map<Integer, Double> map) {
                Internal.checkElementsNotNull(map);
                this.f47367c = map;
                return this;
            }
        }

        /* renamed from: com.bytedance.lark.pb.settings.v1.SetDataDisplayWeightRequest$DisplayWeight$b */
        private static final class C19202b extends ProtoAdapter<DisplayWeight> {

            /* renamed from: a */
            private final ProtoAdapter<Map<Integer, Double>> f47368a = ProtoAdapter.newMapAdapter(ProtoAdapter.INT32, ProtoAdapter.DOUBLE);

            /* renamed from: b */
            private final ProtoAdapter<Map<Integer, Double>> f47369b = ProtoAdapter.newMapAdapter(ProtoAdapter.INT32, ProtoAdapter.DOUBLE);

            C19202b() {
                super(FieldEncoding.LENGTH_DELIMITED, DisplayWeight.class);
            }

            /* renamed from: a */
            public int encodedSize(DisplayWeight displayWeight) {
                int i;
                int encodedSizeWithTag = this.f47368a.encodedSizeWithTag(1, displayWeight.type2weights);
                if (displayWeight.max_weight != null) {
                    i = ProtoAdapter.DOUBLE.encodedSizeWithTag(2, displayWeight.max_weight);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + this.f47369b.encodedSizeWithTag(3, displayWeight.type2max_weights) + displayWeight.unknownFields().size();
            }

            /* renamed from: a */
            public DisplayWeight decode(ProtoReader protoReader) throws IOException {
                C19201a aVar = new C19201a();
                aVar.f47366b = Double.valueOf(0.0d);
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f47365a.putAll(this.f47368a.decode(protoReader));
                    } else if (nextTag == 2) {
                        aVar.f47366b = ProtoAdapter.DOUBLE.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f47367c.putAll(this.f47369b.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, DisplayWeight displayWeight) throws IOException {
                this.f47368a.encodeWithTag(protoWriter, 1, displayWeight.type2weights);
                if (displayWeight.max_weight != null) {
                    ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 2, displayWeight.max_weight);
                }
                this.f47369b.encodeWithTag(protoWriter, 3, displayWeight.type2max_weights);
                protoWriter.writeBytes(displayWeight.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19201a newBuilder() {
            C19201a aVar = new C19201a();
            aVar.f47365a = Internal.copyOf("type2weights", this.type2weights);
            aVar.f47366b = this.max_weight;
            aVar.f47367c = Internal.copyOf("type2max_weights", this.type2max_weights);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("settings", "DisplayWeight");
            StringBuilder sb = new StringBuilder();
            if (!this.type2weights.isEmpty()) {
                sb.append(", type2weights=");
                sb.append(this.type2weights);
            }
            if (this.max_weight != null) {
                sb.append(", max_weight=");
                sb.append(this.max_weight);
            }
            if (!this.type2max_weights.isEmpty()) {
                sb.append(", type2max_weights=");
                sb.append(this.type2max_weights);
            }
            StringBuilder replace = sb.replace(0, 2, "DisplayWeight{");
            replace.append('}');
            return replace.toString();
        }

        public DisplayWeight(Map<Integer, Double> map, Double d, Map<Integer, Double> map2) {
            this(map, d, map2, ByteString.EMPTY);
        }

        public DisplayWeight(Map<Integer, Double> map, Double d, Map<Integer, Double> map2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.type2weights = Internal.immutableCopyOf("type2weights", map);
            this.max_weight = d;
            this.type2max_weights = Internal.immutableCopyOf("type2max_weights", map2);
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.SetDataDisplayWeightRequest$a */
    public static final class C19203a extends Message.Builder<SetDataDisplayWeightRequest, C19203a> {

        /* renamed from: a */
        public Map<Integer, DisplayWeight> f47370a = Internal.newMutableMap();

        /* renamed from: a */
        public SetDataDisplayWeightRequest build() {
            return new SetDataDisplayWeightRequest(this.f47370a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19203a mo65572a(Map<Integer, DisplayWeight> map) {
            Internal.checkElementsNotNull(map);
            this.f47370a = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.SetDataDisplayWeightRequest$b */
    private static final class C19204b extends ProtoAdapter<SetDataDisplayWeightRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<Integer, DisplayWeight>> f47371a = ProtoAdapter.newMapAdapter(ProtoAdapter.INT32, DisplayWeight.ADAPTER);

        C19204b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetDataDisplayWeightRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetDataDisplayWeightRequest setDataDisplayWeightRequest) {
            return this.f47371a.encodedSizeWithTag(1, setDataDisplayWeightRequest.data_display_weights) + setDataDisplayWeightRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetDataDisplayWeightRequest decode(ProtoReader protoReader) throws IOException {
            C19203a aVar = new C19203a();
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
                    aVar.f47370a.putAll(this.f47371a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetDataDisplayWeightRequest setDataDisplayWeightRequest) throws IOException {
            this.f47371a.encodeWithTag(protoWriter, 1, setDataDisplayWeightRequest.data_display_weights);
            protoWriter.writeBytes(setDataDisplayWeightRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19203a newBuilder() {
        C19203a aVar = new C19203a();
        aVar.f47370a = Internal.copyOf("data_display_weights", this.data_display_weights);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "SetDataDisplayWeightRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.data_display_weights.isEmpty()) {
            sb.append(", data_display_weights=");
            sb.append(this.data_display_weights);
        }
        StringBuilder replace = sb.replace(0, 2, "SetDataDisplayWeightRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetDataDisplayWeightRequest(Map<Integer, DisplayWeight> map) {
        this(map, ByteString.EMPTY);
    }

    public SetDataDisplayWeightRequest(Map<Integer, DisplayWeight> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.data_display_weights = Internal.immutableCopyOf("data_display_weights", map);
    }
}
