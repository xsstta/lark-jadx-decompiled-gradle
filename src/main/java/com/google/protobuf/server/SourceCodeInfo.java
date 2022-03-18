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

public final class SourceCodeInfo extends Message<SourceCodeInfo, C23183a> {
    public static final ProtoAdapter<SourceCodeInfo> ADAPTER = new C23184b();
    private static final long serialVersionUID = 0;
    public final List<Location> mlocation;

    public static final class Location extends Message<Location, C23181a> {
        public static final ProtoAdapter<Location> ADAPTER = new C23182b();
        public static final String DEFAULT_LEADING_COMMENTS = "";
        public static final String DEFAULT_TRAILING_COMMENTS = "";
        private static final long serialVersionUID = 0;
        public final String mleading_comments;
        public final List<String> mleading_detached_comments;
        public final List<Integer> mpath;
        public final List<Integer> mspan;
        public final String mtrailing_comments;

        /* renamed from: com.google.protobuf.server.SourceCodeInfo$Location$b */
        private static final class C23182b extends ProtoAdapter<Location> {
            C23182b() {
                super(FieldEncoding.LENGTH_DELIMITED, Location.class);
            }

            /* renamed from: a */
            public int encodedSize(Location location) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.INT32.asPacked().encodedSizeWithTag(1, location.mpath) + ProtoAdapter.INT32.asPacked().encodedSizeWithTag(2, location.mspan);
                int i2 = 0;
                if (location.mleading_comments != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(3, location.mleading_comments);
                } else {
                    i = 0;
                }
                int i3 = encodedSizeWithTag + i;
                if (location.mtrailing_comments != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, location.mtrailing_comments);
                }
                return i3 + i2 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, location.mleading_detached_comments) + location.unknownFields().size();
            }

            /* renamed from: a */
            public Location decode(ProtoReader protoReader) throws IOException {
                C23181a aVar = new C23181a();
                aVar.f57193c = "";
                aVar.f57194d = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f57191a.add(ProtoAdapter.INT32.decode(protoReader));
                    } else if (nextTag == 2) {
                        aVar.f57192b.add(ProtoAdapter.INT32.decode(protoReader));
                    } else if (nextTag == 3) {
                        aVar.f57193c = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 4) {
                        aVar.f57194d = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 6) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f57195e.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Location location) throws IOException {
                ProtoAdapter.INT32.asPacked().encodeWithTag(protoWriter, 1, location.mpath);
                ProtoAdapter.INT32.asPacked().encodeWithTag(protoWriter, 2, location.mspan);
                if (location.mleading_comments != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, location.mleading_comments);
                }
                if (location.mtrailing_comments != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, location.mtrailing_comments);
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 6, location.mleading_detached_comments);
                protoWriter.writeBytes(location.unknownFields());
            }
        }

        /* renamed from: com.google.protobuf.server.SourceCodeInfo$Location$a */
        public static final class C23181a extends Message.Builder<Location, C23181a> {

            /* renamed from: a */
            public List<Integer> f57191a = Internal.newMutableList();

            /* renamed from: b */
            public List<Integer> f57192b = Internal.newMutableList();

            /* renamed from: c */
            public String f57193c;

            /* renamed from: d */
            public String f57194d;

            /* renamed from: e */
            public List<String> f57195e = Internal.newMutableList();

            /* renamed from: a */
            public Location build() {
                return new Location(this.f57191a, this.f57192b, this.f57193c, this.f57194d, this.f57195e, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C23181a newBuilder() {
            C23181a aVar = new C23181a();
            aVar.f57191a = Internal.copyOf("mpath", this.mpath);
            aVar.f57192b = Internal.copyOf("mspan", this.mspan);
            aVar.f57193c = this.mleading_comments;
            aVar.f57194d = this.mtrailing_comments;
            aVar.f57195e = Internal.copyOf("mleading_detached_comments", this.mleading_detached_comments);
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
            if (!this.mspan.isEmpty()) {
                sb.append(", span=");
                sb.append(this.mspan);
            }
            if (this.mleading_comments != null) {
                sb.append(", leading_comments=");
                sb.append(this.mleading_comments);
            }
            if (this.mtrailing_comments != null) {
                sb.append(", trailing_comments=");
                sb.append(this.mtrailing_comments);
            }
            if (!this.mleading_detached_comments.isEmpty()) {
                sb.append(", leading_detached_comments=");
                sb.append(this.mleading_detached_comments);
            }
            StringBuilder replace = sb.replace(0, 2, "Location{");
            replace.append('}');
            return replace.toString();
        }

        public Location(List<Integer> list, List<Integer> list2, String str, String str2, List<String> list3) {
            this(list, list2, str, str2, list3, ByteString.EMPTY);
        }

        public Location(List<Integer> list, List<Integer> list2, String str, String str2, List<String> list3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mpath = Internal.immutableCopyOf("mpath", list);
            this.mspan = Internal.immutableCopyOf("mspan", list2);
            this.mleading_comments = str;
            this.mtrailing_comments = str2;
            this.mleading_detached_comments = Internal.immutableCopyOf("mleading_detached_comments", list3);
        }
    }

    /* renamed from: com.google.protobuf.server.SourceCodeInfo$b */
    private static final class C23184b extends ProtoAdapter<SourceCodeInfo> {
        C23184b() {
            super(FieldEncoding.LENGTH_DELIMITED, SourceCodeInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(SourceCodeInfo sourceCodeInfo) {
            return Location.ADAPTER.asRepeated().encodedSizeWithTag(1, sourceCodeInfo.mlocation) + sourceCodeInfo.unknownFields().size();
        }

        /* renamed from: a */
        public SourceCodeInfo decode(ProtoReader protoReader) throws IOException {
            C23183a aVar = new C23183a();
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
                    aVar.f57196a.add(Location.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SourceCodeInfo sourceCodeInfo) throws IOException {
            Location.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, sourceCodeInfo.mlocation);
            protoWriter.writeBytes(sourceCodeInfo.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.server.SourceCodeInfo$a */
    public static final class C23183a extends Message.Builder<SourceCodeInfo, C23183a> {

        /* renamed from: a */
        public List<Location> f57196a = Internal.newMutableList();

        /* renamed from: a */
        public SourceCodeInfo build() {
            return new SourceCodeInfo(this.f57196a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23183a newBuilder() {
        C23183a aVar = new C23183a();
        aVar.f57196a = Internal.copyOf("mlocation", this.mlocation);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mlocation.isEmpty()) {
            sb.append(", location=");
            sb.append(this.mlocation);
        }
        StringBuilder replace = sb.replace(0, 2, "SourceCodeInfo{");
        replace.append('}');
        return replace.toString();
    }

    public SourceCodeInfo(List<Location> list) {
        this(list, ByteString.EMPTY);
    }

    public SourceCodeInfo(List<Location> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mlocation = Internal.immutableCopyOf("mlocation", list);
    }
}
