package com.bytedance.lark.pb.basic.v1;

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

public final class FeatureSwitches extends Message<FeatureSwitches, C14945a> {
    public static final ProtoAdapter<FeatureSwitches> ADAPTER = new C14946b();
    private static final long serialVersionUID = 0;
    public final Map<String, Pairs> namespace2pairs;

    public static final class Pairs extends Message<Pairs, C14943a> {
        public static final ProtoAdapter<Pairs> ADAPTER = new C14944b();
        private static final long serialVersionUID = 0;
        public final Map<String, String> paris;

        /* renamed from: com.bytedance.lark.pb.basic.v1.FeatureSwitches$Pairs$a */
        public static final class C14943a extends Message.Builder<Pairs, C14943a> {

            /* renamed from: a */
            public Map<String, String> f39588a = Internal.newMutableMap();

            /* renamed from: a */
            public Pairs build() {
                return new Pairs(this.f39588a, super.buildUnknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.FeatureSwitches$Pairs$b */
        private static final class C14944b extends ProtoAdapter<Pairs> {

            /* renamed from: a */
            private final ProtoAdapter<Map<String, String>> f39589a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

            C14944b() {
                super(FieldEncoding.LENGTH_DELIMITED, Pairs.class);
            }

            /* renamed from: a */
            public int encodedSize(Pairs pairs) {
                return this.f39589a.encodedSizeWithTag(1, pairs.paris) + pairs.unknownFields().size();
            }

            /* renamed from: a */
            public Pairs decode(ProtoReader protoReader) throws IOException {
                C14943a aVar = new C14943a();
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
                        aVar.f39588a.putAll(this.f39589a.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Pairs pairs) throws IOException {
                this.f39589a.encodeWithTag(protoWriter, 1, pairs.paris);
                protoWriter.writeBytes(pairs.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14943a newBuilder() {
            C14943a aVar = new C14943a();
            aVar.f39588a = Internal.copyOf("paris", this.paris);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "Pairs");
            StringBuilder sb = new StringBuilder();
            if (!this.paris.isEmpty()) {
                sb.append(", paris=");
                sb.append(this.paris);
            }
            StringBuilder replace = sb.replace(0, 2, "Pairs{");
            replace.append('}');
            return replace.toString();
        }

        public Pairs(Map<String, String> map) {
            this(map, ByteString.EMPTY);
        }

        public Pairs(Map<String, String> map, ByteString byteString) {
            super(ADAPTER, byteString);
            this.paris = Internal.immutableCopyOf("paris", map);
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.FeatureSwitches$a */
    public static final class C14945a extends Message.Builder<FeatureSwitches, C14945a> {

        /* renamed from: a */
        public Map<String, Pairs> f39590a = Internal.newMutableMap();

        /* renamed from: a */
        public FeatureSwitches build() {
            return new FeatureSwitches(this.f39590a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.FeatureSwitches$b */
    private static final class C14946b extends ProtoAdapter<FeatureSwitches> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Pairs>> f39591a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Pairs.ADAPTER);

        C14946b() {
            super(FieldEncoding.LENGTH_DELIMITED, FeatureSwitches.class);
        }

        /* renamed from: a */
        public int encodedSize(FeatureSwitches featureSwitches) {
            return this.f39591a.encodedSizeWithTag(1, featureSwitches.namespace2pairs) + featureSwitches.unknownFields().size();
        }

        /* renamed from: a */
        public FeatureSwitches decode(ProtoReader protoReader) throws IOException {
            C14945a aVar = new C14945a();
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
                    aVar.f39590a.putAll(this.f39591a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FeatureSwitches featureSwitches) throws IOException {
            this.f39591a.encodeWithTag(protoWriter, 1, featureSwitches.namespace2pairs);
            protoWriter.writeBytes(featureSwitches.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14945a newBuilder() {
        C14945a aVar = new C14945a();
        aVar.f39590a = Internal.copyOf("namespace2pairs", this.namespace2pairs);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "FeatureSwitches");
        StringBuilder sb = new StringBuilder();
        if (!this.namespace2pairs.isEmpty()) {
            sb.append(", namespace2pairs=");
            sb.append(this.namespace2pairs);
        }
        StringBuilder replace = sb.replace(0, 2, "FeatureSwitches{");
        replace.append('}');
        return replace.toString();
    }

    public FeatureSwitches(Map<String, Pairs> map) {
        this(map, ByteString.EMPTY);
    }

    public FeatureSwitches(Map<String, Pairs> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.namespace2pairs = Internal.immutableCopyOf("namespace2pairs", map);
    }
}
