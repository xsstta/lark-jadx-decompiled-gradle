package com.bytedance.lark.pb.feed.v1;

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

public final class PushStatistcsEventResponse extends Message<PushStatistcsEventResponse, C17216a> {
    public static final ProtoAdapter<PushStatistcsEventResponse> ADAPTER = new C17217b();
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Map<String, BoxData> box_datas;
    public final Type type;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        BOX(1);
        
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
            if (i != 1) {
                return null;
            }
            return BOX;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public static final class BoxData extends Message<BoxData, C17214a> {
        public static final ProtoAdapter<BoxData> ADAPTER = new C17215b();
        public static final Long DEFAULT_COUNT = 0L;
        private static final long serialVersionUID = 0;
        public final Long count;

        /* renamed from: com.bytedance.lark.pb.feed.v1.PushStatistcsEventResponse$BoxData$b */
        private static final class C17215b extends ProtoAdapter<BoxData> {
            C17215b() {
                super(FieldEncoding.LENGTH_DELIMITED, BoxData.class);
            }

            /* renamed from: a */
            public int encodedSize(BoxData boxData) {
                int i;
                if (boxData.count != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, boxData.count);
                } else {
                    i = 0;
                }
                return i + boxData.unknownFields().size();
            }

            /* renamed from: a */
            public BoxData decode(ProtoReader protoReader) throws IOException {
                C17214a aVar = new C17214a();
                aVar.f44019a = 0L;
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
                        aVar.f44019a = ProtoAdapter.INT64.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, BoxData boxData) throws IOException {
                if (boxData.count != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, boxData.count);
                }
                protoWriter.writeBytes(boxData.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.feed.v1.PushStatistcsEventResponse$BoxData$a */
        public static final class C17214a extends Message.Builder<BoxData, C17214a> {

            /* renamed from: a */
            public Long f44019a;

            /* renamed from: a */
            public BoxData build() {
                return new BoxData(this.f44019a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C17214a newBuilder() {
            C17214a aVar = new C17214a();
            aVar.f44019a = this.count;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("feed", "BoxData");
            StringBuilder sb = new StringBuilder();
            if (this.count != null) {
                sb.append(", count=");
                sb.append(this.count);
            }
            StringBuilder replace = sb.replace(0, 2, "BoxData{");
            replace.append('}');
            return replace.toString();
        }

        public BoxData(Long l) {
            this(l, ByteString.EMPTY);
        }

        public BoxData(Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            this.count = l;
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.PushStatistcsEventResponse$a */
    public static final class C17216a extends Message.Builder<PushStatistcsEventResponse, C17216a> {

        /* renamed from: a */
        public Type f44020a;

        /* renamed from: b */
        public Map<String, BoxData> f44021b = Internal.newMutableMap();

        /* renamed from: a */
        public PushStatistcsEventResponse build() {
            Type type = this.f44020a;
            if (type != null) {
                return new PushStatistcsEventResponse(type, this.f44021b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(type, ShareHitPoint.f121869d);
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.PushStatistcsEventResponse$b */
    private static final class C17217b extends ProtoAdapter<PushStatistcsEventResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, BoxData>> f44022a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, BoxData.ADAPTER);

        C17217b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushStatistcsEventResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PushStatistcsEventResponse pushStatistcsEventResponse) {
            return Type.ADAPTER.encodedSizeWithTag(1, pushStatistcsEventResponse.type) + this.f44022a.encodedSizeWithTag(2, pushStatistcsEventResponse.box_datas) + pushStatistcsEventResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PushStatistcsEventResponse decode(ProtoReader protoReader) throws IOException {
            C17216a aVar = new C17216a();
            aVar.f44020a = Type.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f44020a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44021b.putAll(this.f44022a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushStatistcsEventResponse pushStatistcsEventResponse) throws IOException {
            Type.ADAPTER.encodeWithTag(protoWriter, 1, pushStatistcsEventResponse.type);
            this.f44022a.encodeWithTag(protoWriter, 2, pushStatistcsEventResponse.box_datas);
            protoWriter.writeBytes(pushStatistcsEventResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17216a newBuilder() {
        C17216a aVar = new C17216a();
        aVar.f44020a = this.type;
        aVar.f44021b = Internal.copyOf("box_datas", this.box_datas);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "PushStatistcsEventResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.type);
        if (!this.box_datas.isEmpty()) {
            sb.append(", box_datas=");
            sb.append(this.box_datas);
        }
        StringBuilder replace = sb.replace(0, 2, "PushStatistcsEventResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PushStatistcsEventResponse(Type type2, Map<String, BoxData> map) {
        this(type2, map, ByteString.EMPTY);
    }

    public PushStatistcsEventResponse(Type type2, Map<String, BoxData> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.box_datas = Internal.immutableCopyOf("box_datas", map);
    }
}
