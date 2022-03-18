package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class Trace extends Message<Trace, C15348a> {
    public static final ProtoAdapter<Trace> ADAPTER = new C15349b();
    private static final long serialVersionUID = 0;
    public final List<Span> spans;

    /* renamed from: com.bytedance.lark.pb.basic.v1.Trace$b */
    private static final class C15349b extends ProtoAdapter<Trace> {
        C15349b() {
            super(FieldEncoding.LENGTH_DELIMITED, Trace.class);
        }

        /* renamed from: a */
        public int encodedSize(Trace trace) {
            return Span.ADAPTER.asRepeated().encodedSizeWithTag(1, trace.spans) + trace.unknownFields().size();
        }

        /* renamed from: a */
        public Trace decode(ProtoReader protoReader) throws IOException {
            C15348a aVar = new C15348a();
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
                    aVar.f40656a.add(Span.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Trace trace) throws IOException {
            Span.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, trace.spans);
            protoWriter.writeBytes(trace.unknownFields());
        }
    }

    public static final class Span extends Message<Span, C15346a> {
        public static final ProtoAdapter<Span> ADAPTER = new C15347b();
        public static final Long DEFAULT_DURATION_MILLIS = 0L;
        private static final long serialVersionUID = 0;
        public final Map<String, String> attributes;
        public final Long duration_millis;
        public final String name;

        /* renamed from: com.bytedance.lark.pb.basic.v1.Trace$Span$a */
        public static final class C15346a extends Message.Builder<Span, C15346a> {

            /* renamed from: a */
            public String f40652a;

            /* renamed from: b */
            public Long f40653b;

            /* renamed from: c */
            public Map<String, String> f40654c = Internal.newMutableMap();

            /* renamed from: a */
            public Span build() {
                return new Span(this.f40652a, this.f40653b, this.f40654c, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C15346a mo55748a(Long l) {
                this.f40653b = l;
                return this;
            }

            /* renamed from: a */
            public C15346a mo55749a(String str) {
                this.f40652a = str;
                return this;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Trace$Span$b */
        private static final class C15347b extends ProtoAdapter<Span> {

            /* renamed from: a */
            private final ProtoAdapter<Map<String, String>> f40655a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

            C15347b() {
                super(FieldEncoding.LENGTH_DELIMITED, Span.class);
            }

            /* renamed from: a */
            public int encodedSize(Span span) {
                int i;
                int i2 = 0;
                if (span.name != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, span.name);
                } else {
                    i = 0;
                }
                if (span.duration_millis != null) {
                    i2 = ProtoAdapter.UINT64.encodedSizeWithTag(2, span.duration_millis);
                }
                return i + i2 + this.f40655a.encodedSizeWithTag(3, span.attributes) + span.unknownFields().size();
            }

            /* renamed from: a */
            public Span decode(ProtoReader protoReader) throws IOException {
                C15346a aVar = new C15346a();
                aVar.f40652a = "";
                aVar.f40653b = 0L;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f40652a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f40653b = ProtoAdapter.UINT64.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40654c.putAll(this.f40655a.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Span span) throws IOException {
                if (span.name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, span.name);
                }
                if (span.duration_millis != null) {
                    ProtoAdapter.UINT64.encodeWithTag(protoWriter, 2, span.duration_millis);
                }
                this.f40655a.encodeWithTag(protoWriter, 3, span.attributes);
                protoWriter.writeBytes(span.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15346a newBuilder() {
            C15346a aVar = new C15346a();
            aVar.f40652a = this.name;
            aVar.f40653b = this.duration_millis;
            aVar.f40654c = Internal.copyOf("attributes", this.attributes);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "Span");
            StringBuilder sb = new StringBuilder();
            if (this.name != null) {
                sb.append(", name=");
                sb.append(this.name);
            }
            if (this.duration_millis != null) {
                sb.append(", duration_millis=");
                sb.append(this.duration_millis);
            }
            if (!this.attributes.isEmpty()) {
                sb.append(", attributes=");
                sb.append(this.attributes);
            }
            StringBuilder replace = sb.replace(0, 2, "Span{");
            replace.append('}');
            return replace.toString();
        }

        public Span(String str, Long l, Map<String, String> map) {
            this(str, l, map, ByteString.EMPTY);
        }

        public Span(String str, Long l, Map<String, String> map, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
            this.duration_millis = l;
            this.attributes = Internal.immutableCopyOf("attributes", map);
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Trace$a */
    public static final class C15348a extends Message.Builder<Trace, C15348a> {

        /* renamed from: a */
        public List<Span> f40656a = Internal.newMutableList();

        /* renamed from: a */
        public Trace build() {
            return new Trace(this.f40656a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15348a mo55754a(List<Span> list) {
            Internal.checkElementsNotNull(list);
            this.f40656a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15348a newBuilder() {
        C15348a aVar = new C15348a();
        aVar.f40656a = Internal.copyOf("spans", this.spans);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "Trace");
        StringBuilder sb = new StringBuilder();
        if (!this.spans.isEmpty()) {
            sb.append(", spans=");
            sb.append(this.spans);
        }
        StringBuilder replace = sb.replace(0, 2, "Trace{");
        replace.append('}');
        return replace.toString();
    }

    public Trace(List<Span> list) {
        this(list, ByteString.EMPTY);
    }

    public Trace(List<Span> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.spans = Internal.immutableCopyOf("spans", list);
    }
}
