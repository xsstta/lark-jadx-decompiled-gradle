package com.google.protobuf.server;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GeneratedCodeInfo extends Message<GeneratedCodeInfo, C23165a> {
    public static final ProtoAdapter<GeneratedCodeInfo> ADAPTER = new C23166b();
    private static final long serialVersionUID = 0;
    public final List<Annotation> mannotation;

    public static final class Annotation extends Message<Annotation, C23163a> {
        public static final ProtoAdapter<Annotation> ADAPTER = new C23164b();
        public static final Integer DEFAULT_BEGIN = 0;
        public static final Integer DEFAULT_END = 0;
        public static final String DEFAULT_SOURCE_FILE = "";
        private static final long serialVersionUID = 0;
        public final Integer mbegin;
        public final Integer mend;
        public final List<Integer> mpath;
        public final String msource_file;

        /* renamed from: com.google.protobuf.server.GeneratedCodeInfo$Annotation$b */
        private static final class C23164b extends ProtoAdapter<Annotation> {
            C23164b() {
                super(FieldEncoding.LENGTH_DELIMITED, Annotation.class);
            }

            /* renamed from: a */
            public int encodedSize(Annotation annotation) {
                int i;
                int i2;
                int encodedSizeWithTag = ProtoAdapter.INT32.asPacked().encodedSizeWithTag(1, annotation.mpath);
                int i3 = 0;
                if (annotation.msource_file != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(2, annotation.msource_file);
                } else {
                    i = 0;
                }
                int i4 = encodedSizeWithTag + i;
                if (annotation.mbegin != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, annotation.mbegin);
                } else {
                    i2 = 0;
                }
                int i5 = i4 + i2;
                if (annotation.mend != null) {
                    i3 = ProtoAdapter.INT32.encodedSizeWithTag(4, annotation.mend);
                }
                return i5 + i3 + annotation.unknownFields().size();
            }

            /* renamed from: a */
            public Annotation decode(ProtoReader protoReader) throws IOException {
                C23163a aVar = new C23163a();
                aVar.f57165b = "";
                aVar.f57166c = 0;
                aVar.f57167d = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f57164a.add(ProtoAdapter.INT32.decode(protoReader));
                    } else if (nextTag == 2) {
                        aVar.f57165b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f57166c = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f57167d = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Annotation annotation) throws IOException {
                ProtoAdapter.INT32.asPacked().encodeWithTag(protoWriter, 1, annotation.mpath);
                if (annotation.msource_file != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, annotation.msource_file);
                }
                if (annotation.mbegin != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, annotation.mbegin);
                }
                if (annotation.mend != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, annotation.mend);
                }
                protoWriter.writeBytes(annotation.unknownFields());
            }
        }

        /* renamed from: com.google.protobuf.server.GeneratedCodeInfo$Annotation$a */
        public static final class C23163a extends Message.Builder<Annotation, C23163a> {

            /* renamed from: a */
            public List<Integer> f57164a = Internal.newMutableList();

            /* renamed from: b */
            public String f57165b;

            /* renamed from: c */
            public Integer f57166c;

            /* renamed from: d */
            public Integer f57167d;

            /* renamed from: a */
            public Annotation build() {
                return new Annotation(this.f57164a, this.f57165b, this.f57166c, this.f57167d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C23163a newBuilder() {
            C23163a aVar = new C23163a();
            aVar.f57164a = Internal.copyOf("mpath", this.mpath);
            aVar.f57165b = this.msource_file;
            aVar.f57166c = this.mbegin;
            aVar.f57167d = this.mend;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (!this.mpath.isEmpty()) {
                sb.append(", path=");
                sb.append(this.mpath);
            }
            if (this.msource_file != null) {
                sb.append(", source_file=");
                sb.append(this.msource_file);
            }
            if (this.mbegin != null) {
                sb.append(", begin=");
                sb.append(this.mbegin);
            }
            if (this.mend != null) {
                sb.append(", end=");
                sb.append(this.mend);
            }
            StringBuilder replace = sb.replace(0, 2, "Annotation{");
            replace.append('}');
            return replace.toString();
        }

        public Annotation(List<Integer> list, String str, Integer num, Integer num2) {
            this(list, str, num, num2, ByteString.EMPTY);
        }

        public Annotation(List<Integer> list, String str, Integer num, Integer num2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mpath = Internal.immutableCopyOf("mpath", list);
            this.msource_file = str;
            this.mbegin = num;
            this.mend = num2;
        }
    }

    /* renamed from: com.google.protobuf.server.GeneratedCodeInfo$b */
    private static final class C23166b extends ProtoAdapter<GeneratedCodeInfo> {
        C23166b() {
            super(FieldEncoding.LENGTH_DELIMITED, GeneratedCodeInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(GeneratedCodeInfo generatedCodeInfo) {
            return Annotation.ADAPTER.asRepeated().encodedSizeWithTag(1, generatedCodeInfo.mannotation) + generatedCodeInfo.unknownFields().size();
        }

        /* renamed from: a */
        public GeneratedCodeInfo decode(ProtoReader protoReader) throws IOException {
            C23165a aVar = new C23165a();
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
                    aVar.f57168a.add(Annotation.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GeneratedCodeInfo generatedCodeInfo) throws IOException {
            Annotation.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, generatedCodeInfo.mannotation);
            protoWriter.writeBytes(generatedCodeInfo.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.server.GeneratedCodeInfo$a */
    public static final class C23165a extends Message.Builder<GeneratedCodeInfo, C23165a> {

        /* renamed from: a */
        public List<Annotation> f57168a = Internal.newMutableList();

        /* renamed from: a */
        public GeneratedCodeInfo build() {
            return new GeneratedCodeInfo(this.f57168a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23165a newBuilder() {
        C23165a aVar = new C23165a();
        aVar.f57168a = Internal.copyOf("mannotation", this.mannotation);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mannotation.isEmpty()) {
            sb.append(", annotation=");
            sb.append(this.mannotation);
        }
        StringBuilder replace = sb.replace(0, 2, "GeneratedCodeInfo{");
        replace.append('}');
        return replace.toString();
    }

    public GeneratedCodeInfo(List<Annotation> list) {
        this(list, ByteString.EMPTY);
    }

    public GeneratedCodeInfo(List<Annotation> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mannotation = Internal.immutableCopyOf("mannotation", list);
    }
}
