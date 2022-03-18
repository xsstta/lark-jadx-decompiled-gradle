package com.google.protobuf;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class SourceCodeInfo extends Message<SourceCodeInfo, C23092a> {
    public static final ProtoAdapter<SourceCodeInfo> ADAPTER = new C23093b();
    private static final long serialVersionUID = 0;
    public final List<Location> location;

    public static final class Location extends Message<Location, C23090a> {
        public static final ProtoAdapter<Location> ADAPTER = new C23091b();
        public static final String DEFAULT_LEADING_COMMENTS = "";
        public static final String DEFAULT_TRAILING_COMMENTS = "";
        private static final long serialVersionUID = 0;
        public final String leading_comments;
        public final List<String> leading_detached_comments;
        public final List<Integer> path;
        public final List<Integer> span;
        public final String trailing_comments;

        /* renamed from: com.google.protobuf.SourceCodeInfo$Location$b */
        private static final class C23091b extends ProtoAdapter<Location> {
            C23091b() {
                super(FieldEncoding.LENGTH_DELIMITED, Location.class);
            }

            /* renamed from: a */
            public int encodedSize(Location location) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.INT32.asPacked().encodedSizeWithTag(1, location.path) + ProtoAdapter.INT32.asPacked().encodedSizeWithTag(2, location.span);
                int i2 = 0;
                if (location.leading_comments != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(3, location.leading_comments);
                } else {
                    i = 0;
                }
                int i3 = encodedSizeWithTag + i;
                if (location.trailing_comments != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, location.trailing_comments);
                }
                return i3 + i2 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, location.leading_detached_comments) + location.unknownFields().size();
            }

            /* renamed from: a */
            public Location decode(ProtoReader protoReader) throws IOException {
                C23090a aVar = new C23090a();
                aVar.f57016c = "";
                aVar.f57017d = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f57014a.add(ProtoAdapter.INT32.decode(protoReader));
                    } else if (nextTag == 2) {
                        aVar.f57015b.add(ProtoAdapter.INT32.decode(protoReader));
                    } else if (nextTag == 3) {
                        aVar.f57016c = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 4) {
                        aVar.f57017d = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 6) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f57018e.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Location location) throws IOException {
                ProtoAdapter.INT32.asPacked().encodeWithTag(protoWriter, 1, location.path);
                ProtoAdapter.INT32.asPacked().encodeWithTag(protoWriter, 2, location.span);
                if (location.leading_comments != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, location.leading_comments);
                }
                if (location.trailing_comments != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, location.trailing_comments);
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 6, location.leading_detached_comments);
                protoWriter.writeBytes(location.unknownFields());
            }
        }

        /* renamed from: com.google.protobuf.SourceCodeInfo$Location$a */
        public static final class C23090a extends Message.Builder<Location, C23090a> {

            /* renamed from: a */
            public List<Integer> f57014a = Internal.newMutableList();

            /* renamed from: b */
            public List<Integer> f57015b = Internal.newMutableList();

            /* renamed from: c */
            public String f57016c;

            /* renamed from: d */
            public String f57017d;

            /* renamed from: e */
            public List<String> f57018e = Internal.newMutableList();

            /* renamed from: a */
            public Location build() {
                return new Location(this.f57014a, this.f57015b, this.f57016c, this.f57017d, this.f57018e, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C23090a newBuilder() {
            C23090a aVar = new C23090a();
            aVar.f57014a = Internal.copyOf("path", this.path);
            aVar.f57015b = Internal.copyOf("span", this.span);
            aVar.f57016c = this.leading_comments;
            aVar.f57017d = this.trailing_comments;
            aVar.f57018e = Internal.copyOf("leading_detached_comments", this.leading_detached_comments);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("google", "Location");
            StringBuilder sb = new StringBuilder();
            if (!this.path.isEmpty()) {
                sb.append(", path=");
                sb.append(this.path);
            }
            if (!this.span.isEmpty()) {
                sb.append(", span=");
                sb.append(this.span);
            }
            if (this.leading_comments != null) {
                sb.append(", leading_comments=");
                sb.append(this.leading_comments);
            }
            if (this.trailing_comments != null) {
                sb.append(", trailing_comments=");
                sb.append(this.trailing_comments);
            }
            if (!this.leading_detached_comments.isEmpty()) {
                sb.append(", leading_detached_comments=");
                sb.append(this.leading_detached_comments);
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
            this.path = Internal.immutableCopyOf("path", list);
            this.span = Internal.immutableCopyOf("span", list2);
            this.leading_comments = str;
            this.trailing_comments = str2;
            this.leading_detached_comments = Internal.immutableCopyOf("leading_detached_comments", list3);
        }
    }

    /* renamed from: com.google.protobuf.SourceCodeInfo$b */
    private static final class C23093b extends ProtoAdapter<SourceCodeInfo> {
        C23093b() {
            super(FieldEncoding.LENGTH_DELIMITED, SourceCodeInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(SourceCodeInfo sourceCodeInfo) {
            return Location.ADAPTER.asRepeated().encodedSizeWithTag(1, sourceCodeInfo.location) + sourceCodeInfo.unknownFields().size();
        }

        /* renamed from: a */
        public SourceCodeInfo decode(ProtoReader protoReader) throws IOException {
            C23092a aVar = new C23092a();
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
                    aVar.f57019a.add(Location.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SourceCodeInfo sourceCodeInfo) throws IOException {
            Location.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, sourceCodeInfo.location);
            protoWriter.writeBytes(sourceCodeInfo.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.SourceCodeInfo$a */
    public static final class C23092a extends Message.Builder<SourceCodeInfo, C23092a> {

        /* renamed from: a */
        public List<Location> f57019a = Internal.newMutableList();

        /* renamed from: a */
        public SourceCodeInfo build() {
            return new SourceCodeInfo(this.f57019a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23092a newBuilder() {
        C23092a aVar = new C23092a();
        aVar.f57019a = Internal.copyOf("location", this.location);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("google", "SourceCodeInfo");
        StringBuilder sb = new StringBuilder();
        if (!this.location.isEmpty()) {
            sb.append(", location=");
            sb.append(this.location);
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
        this.location = Internal.immutableCopyOf("location", list);
    }
}
