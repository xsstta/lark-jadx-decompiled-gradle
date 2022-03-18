package com.bytedance.lark.pb.statistics.v1;

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

public final class Track extends Message<Track, C19427a> {
    public static final ProtoAdapter<Track> ADAPTER = new C19428b();
    public static final TrackType DEFAULT_TYPE = TrackType.TEA;
    private static final long serialVersionUID = 0;
    public final String key;
    public final SlardarParam slardar_param;
    public final TeaParam tea_param;
    public final TrackType type;

    public enum TrackType implements WireEnum {
        TEA(1),
        SLARDAR(2);
        
        public static final ProtoAdapter<TrackType> ADAPTER = ProtoAdapter.newEnumAdapter(TrackType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static TrackType fromValue(int i) {
            if (i == 1) {
                return TEA;
            }
            if (i != 2) {
                return null;
            }
            return SLARDAR;
        }

        private TrackType(int i) {
            this.value = i;
        }
    }

    public static final class SlardarParam extends Message<SlardarParam, C19421a> {
        public static final ProtoAdapter<SlardarParam> ADAPTER = new C19422b();
        public static final Integer DEFAULT_STATUS = 0;
        private static final long serialVersionUID = 0;
        public final TrackParams category;
        public final TrackParams metric;
        public final Integer status;

        /* renamed from: com.bytedance.lark.pb.statistics.v1.Track$SlardarParam$b */
        private static final class C19422b extends ProtoAdapter<SlardarParam> {
            C19422b() {
                super(FieldEncoding.LENGTH_DELIMITED, SlardarParam.class);
            }

            /* renamed from: a */
            public int encodedSize(SlardarParam slardarParam) {
                int i;
                int i2;
                int i3 = 0;
                if (slardarParam.status != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(1, slardarParam.status);
                } else {
                    i = 0;
                }
                if (slardarParam.category != null) {
                    i2 = TrackParams.ADAPTER.encodedSizeWithTag(2, slardarParam.category);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (slardarParam.metric != null) {
                    i3 = TrackParams.ADAPTER.encodedSizeWithTag(3, slardarParam.metric);
                }
                return i4 + i3 + slardarParam.unknownFields().size();
            }

            /* renamed from: a */
            public SlardarParam decode(ProtoReader protoReader) throws IOException {
                C19421a aVar = new C19421a();
                aVar.f47745a = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f47745a = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f47746b = TrackParams.ADAPTER.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f47747c = TrackParams.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SlardarParam slardarParam) throws IOException {
                if (slardarParam.status != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, slardarParam.status);
                }
                if (slardarParam.category != null) {
                    TrackParams.ADAPTER.encodeWithTag(protoWriter, 2, slardarParam.category);
                }
                if (slardarParam.metric != null) {
                    TrackParams.ADAPTER.encodeWithTag(protoWriter, 3, slardarParam.metric);
                }
                protoWriter.writeBytes(slardarParam.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.statistics.v1.Track$SlardarParam$a */
        public static final class C19421a extends Message.Builder<SlardarParam, C19421a> {

            /* renamed from: a */
            public Integer f47745a;

            /* renamed from: b */
            public TrackParams f47746b;

            /* renamed from: c */
            public TrackParams f47747c;

            /* renamed from: a */
            public SlardarParam build() {
                return new SlardarParam(this.f47745a, this.f47746b, this.f47747c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19421a newBuilder() {
            C19421a aVar = new C19421a();
            aVar.f47745a = this.status;
            aVar.f47746b = this.category;
            aVar.f47747c = this.metric;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("statistics", "SlardarParam");
            StringBuilder sb = new StringBuilder();
            if (this.status != null) {
                sb.append(", status=");
                sb.append(this.status);
            }
            if (this.category != null) {
                sb.append(", category=");
                sb.append(this.category);
            }
            if (this.metric != null) {
                sb.append(", metric=");
                sb.append(this.metric);
            }
            StringBuilder replace = sb.replace(0, 2, "SlardarParam{");
            replace.append('}');
            return replace.toString();
        }

        public SlardarParam(Integer num, TrackParams trackParams, TrackParams trackParams2) {
            this(num, trackParams, trackParams2, ByteString.EMPTY);
        }

        public SlardarParam(Integer num, TrackParams trackParams, TrackParams trackParams2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.status = num;
            this.category = trackParams;
            this.metric = trackParams2;
        }
    }

    public static final class TeaParam extends Message<TeaParam, C19423a> {
        public static final ProtoAdapter<TeaParam> ADAPTER = new C19424b();
        private static final long serialVersionUID = 0;
        public final TrackParams params;

        /* renamed from: com.bytedance.lark.pb.statistics.v1.Track$TeaParam$b */
        private static final class C19424b extends ProtoAdapter<TeaParam> {
            C19424b() {
                super(FieldEncoding.LENGTH_DELIMITED, TeaParam.class);
            }

            /* renamed from: a */
            public int encodedSize(TeaParam teaParam) {
                int i;
                if (teaParam.params != null) {
                    i = TrackParams.ADAPTER.encodedSizeWithTag(1, teaParam.params);
                } else {
                    i = 0;
                }
                return i + teaParam.unknownFields().size();
            }

            /* renamed from: a */
            public TeaParam decode(ProtoReader protoReader) throws IOException {
                C19423a aVar = new C19423a();
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
                        aVar.f47748a = TrackParams.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, TeaParam teaParam) throws IOException {
                if (teaParam.params != null) {
                    TrackParams.ADAPTER.encodeWithTag(protoWriter, 1, teaParam.params);
                }
                protoWriter.writeBytes(teaParam.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.statistics.v1.Track$TeaParam$a */
        public static final class C19423a extends Message.Builder<TeaParam, C19423a> {

            /* renamed from: a */
            public TrackParams f47748a;

            /* renamed from: a */
            public TeaParam build() {
                return new TeaParam(this.f47748a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19423a newBuilder() {
            C19423a aVar = new C19423a();
            aVar.f47748a = this.params;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("statistics", "TeaParam");
            StringBuilder sb = new StringBuilder();
            if (this.params != null) {
                sb.append(", params=");
                sb.append(this.params);
            }
            StringBuilder replace = sb.replace(0, 2, "TeaParam{");
            replace.append('}');
            return replace.toString();
        }

        public TeaParam(TrackParams trackParams) {
            this(trackParams, ByteString.EMPTY);
        }

        public TeaParam(TrackParams trackParams, ByteString byteString) {
            super(ADAPTER, byteString);
            this.params = trackParams;
        }
    }

    /* renamed from: com.bytedance.lark.pb.statistics.v1.Track$b */
    private static final class C19428b extends ProtoAdapter<Track> {
        C19428b() {
            super(FieldEncoding.LENGTH_DELIMITED, Track.class);
        }

        /* renamed from: a */
        public int encodedSize(Track track) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, track.key) + TrackType.ADAPTER.encodedSizeWithTag(2, track.type);
            int i2 = 0;
            if (track.tea_param != null) {
                i = TeaParam.ADAPTER.encodedSizeWithTag(3, track.tea_param);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (track.slardar_param != null) {
                i2 = SlardarParam.ADAPTER.encodedSizeWithTag(4, track.slardar_param);
            }
            return i3 + i2 + track.unknownFields().size();
        }

        /* renamed from: a */
        public Track decode(ProtoReader protoReader) throws IOException {
            C19427a aVar = new C19427a();
            aVar.f47753a = "";
            aVar.f47754b = TrackType.TEA;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47753a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f47754b = TrackType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.mo66132a(TeaParam.ADAPTER.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.mo66131a(SlardarParam.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Track track) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, track.key);
            TrackType.ADAPTER.encodeWithTag(protoWriter, 2, track.type);
            if (track.tea_param != null) {
                TeaParam.ADAPTER.encodeWithTag(protoWriter, 3, track.tea_param);
            }
            if (track.slardar_param != null) {
                SlardarParam.ADAPTER.encodeWithTag(protoWriter, 4, track.slardar_param);
            }
            protoWriter.writeBytes(track.unknownFields());
        }
    }

    public static final class TrackParams extends Message<TrackParams, C19425a> {
        public static final ProtoAdapter<TrackParams> ADAPTER = new C19426b();
        private static final long serialVersionUID = 0;
        public final Map<String, Integer> int_param;
        public final Map<String, String> string_param;

        /* renamed from: com.bytedance.lark.pb.statistics.v1.Track$TrackParams$a */
        public static final class C19425a extends Message.Builder<TrackParams, C19425a> {

            /* renamed from: a */
            public Map<String, Integer> f47749a = Internal.newMutableMap();

            /* renamed from: b */
            public Map<String, String> f47750b = Internal.newMutableMap();

            /* renamed from: a */
            public TrackParams build() {
                return new TrackParams(this.f47749a, this.f47750b, super.buildUnknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.statistics.v1.Track$TrackParams$b */
        private static final class C19426b extends ProtoAdapter<TrackParams> {

            /* renamed from: a */
            private final ProtoAdapter<Map<String, Integer>> f47751a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.INT32);

            /* renamed from: b */
            private final ProtoAdapter<Map<String, String>> f47752b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

            C19426b() {
                super(FieldEncoding.LENGTH_DELIMITED, TrackParams.class);
            }

            /* renamed from: a */
            public int encodedSize(TrackParams trackParams) {
                return this.f47751a.encodedSizeWithTag(1, trackParams.int_param) + this.f47752b.encodedSizeWithTag(2, trackParams.string_param) + trackParams.unknownFields().size();
            }

            /* renamed from: a */
            public TrackParams decode(ProtoReader protoReader) throws IOException {
                C19425a aVar = new C19425a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f47749a.putAll(this.f47751a.decode(protoReader));
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f47750b.putAll(this.f47752b.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, TrackParams trackParams) throws IOException {
                this.f47751a.encodeWithTag(protoWriter, 1, trackParams.int_param);
                this.f47752b.encodeWithTag(protoWriter, 2, trackParams.string_param);
                protoWriter.writeBytes(trackParams.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19425a newBuilder() {
            C19425a aVar = new C19425a();
            aVar.f47749a = Internal.copyOf("int_param", this.int_param);
            aVar.f47750b = Internal.copyOf("string_param", this.string_param);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("statistics", "TrackParams");
            StringBuilder sb = new StringBuilder();
            if (!this.int_param.isEmpty()) {
                sb.append(", int_param=");
                sb.append(this.int_param);
            }
            if (!this.string_param.isEmpty()) {
                sb.append(", string_param=");
                sb.append(this.string_param);
            }
            StringBuilder replace = sb.replace(0, 2, "TrackParams{");
            replace.append('}');
            return replace.toString();
        }

        public TrackParams(Map<String, Integer> map, Map<String, String> map2) {
            this(map, map2, ByteString.EMPTY);
        }

        public TrackParams(Map<String, Integer> map, Map<String, String> map2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.int_param = Internal.immutableCopyOf("int_param", map);
            this.string_param = Internal.immutableCopyOf("string_param", map2);
        }
    }

    @Override // com.squareup.wire.Message
    public C19427a newBuilder() {
        C19427a aVar = new C19427a();
        aVar.f47753a = this.key;
        aVar.f47754b = this.type;
        aVar.f47755c = this.tea_param;
        aVar.f47756d = this.slardar_param;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.statistics.v1.Track$a */
    public static final class C19427a extends Message.Builder<Track, C19427a> {

        /* renamed from: a */
        public String f47753a;

        /* renamed from: b */
        public TrackType f47754b;

        /* renamed from: c */
        public TeaParam f47755c;

        /* renamed from: d */
        public SlardarParam f47756d;

        /* renamed from: a */
        public Track build() {
            TrackType trackType;
            String str = this.f47753a;
            if (str != null && (trackType = this.f47754b) != null) {
                return new Track(str, trackType, this.f47755c, this.f47756d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "key", this.f47754b, ShareHitPoint.f121869d);
        }

        /* renamed from: a */
        public C19427a mo66131a(SlardarParam slardarParam) {
            this.f47756d = slardarParam;
            this.f47755c = null;
            return this;
        }

        /* renamed from: a */
        public C19427a mo66132a(TeaParam teaParam) {
            this.f47755c = teaParam;
            this.f47756d = null;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("statistics", "Track");
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
        StringBuilder replace = sb.replace(0, 2, "Track{");
        replace.append('}');
        return replace.toString();
    }

    public Track(String str, TrackType trackType, TeaParam teaParam, SlardarParam slardarParam) {
        this(str, trackType, teaParam, slardarParam, ByteString.EMPTY);
    }

    public Track(String str, TrackType trackType, TeaParam teaParam, SlardarParam slardarParam, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(teaParam, slardarParam) <= 1) {
            this.key = str;
            this.type = trackType;
            this.tea_param = teaParam;
            this.slardar_param = slardarParam;
            return;
        }
        throw new IllegalArgumentException("at most one of tea_param, slardar_param may be non-null");
    }
}
