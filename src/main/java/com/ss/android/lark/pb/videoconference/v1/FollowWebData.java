package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.google.firebase.messaging.Constants;
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

public final class FollowWebData extends Message<FollowWebData, C50585a> {
    public static final ProtoAdapter<FollowWebData> ADAPTER = new C50586b();
    public static final Long DEFAULT_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Long id;
    public final String payload;
    public final String strategy_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.FollowWebData$b */
    private static final class C50586b extends ProtoAdapter<FollowWebData> {
        C50586b() {
            super(FieldEncoding.LENGTH_DELIMITED, FollowWebData.class);
        }

        /* renamed from: a */
        public int encodedSize(FollowWebData followWebData) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, followWebData.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, followWebData.strategy_id);
            if (followWebData.payload != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, followWebData.payload);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + followWebData.unknownFields().size();
        }

        /* renamed from: a */
        public FollowWebData decode(ProtoReader protoReader) throws IOException {
            C50585a aVar = new C50585a();
            aVar.f126284a = 0L;
            aVar.f126285b = "";
            aVar.f126286c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126284a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f126285b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126286c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FollowWebData followWebData) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, followWebData.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, followWebData.strategy_id);
            if (followWebData.payload != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, followWebData.payload);
            }
            protoWriter.writeBytes(followWebData.unknownFields());
        }
    }

    public static final class DomPayload extends Message<DomPayload, C50583a> {
        public static final ProtoAdapter<DomPayload> ADAPTER = new C50584b();
        private static final long serialVersionUID = 0;
        public final Map<String, Dom> doms;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.FollowWebData$DomPayload$a */
        public static final class C50583a extends Message.Builder<DomPayload, C50583a> {

            /* renamed from: a */
            public Map<String, Dom> f126282a = Internal.newMutableMap();

            /* renamed from: a */
            public DomPayload build() {
                return new DomPayload(this.f126282a, super.buildUnknownFields());
            }
        }

        public static final class Dom extends Message<Dom, C50581a> {
            public static final ProtoAdapter<Dom> ADAPTER = new C50582b();
            private static final long serialVersionUID = 0;
            public final Map<String, String> attributes;
            public final List<String> children;
            public final Map<String, String> data;
            public final String id;

            /* renamed from: com.ss.android.lark.pb.videoconference.v1.FollowWebData$DomPayload$Dom$b */
            private static final class C50582b extends ProtoAdapter<Dom> {

                /* renamed from: a */
                private final ProtoAdapter<Map<String, String>> f126280a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

                /* renamed from: b */
                private final ProtoAdapter<Map<String, String>> f126281b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

                C50582b() {
                    super(FieldEncoding.LENGTH_DELIMITED, Dom.class);
                }

                /* renamed from: a */
                public int encodedSize(Dom dom) {
                    return ProtoAdapter.STRING.encodedSizeWithTag(1, dom.id) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, dom.children) + this.f126280a.encodedSizeWithTag(3, dom.attributes) + this.f126281b.encodedSizeWithTag(4, dom.data) + dom.unknownFields().size();
                }

                /* renamed from: a */
                public Dom decode(ProtoReader protoReader) throws IOException {
                    C50581a aVar = new C50581a();
                    aVar.f126276a = "";
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag == -1) {
                            protoReader.endMessage(beginMessage);
                            return aVar.build();
                        } else if (nextTag == 1) {
                            aVar.f126276a = ProtoAdapter.STRING.decode(protoReader);
                        } else if (nextTag == 2) {
                            aVar.f126277b.add(ProtoAdapter.STRING.decode(protoReader));
                        } else if (nextTag == 3) {
                            aVar.f126278c.putAll(this.f126280a.decode(protoReader));
                        } else if (nextTag != 4) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            aVar.f126279d.putAll(this.f126281b.decode(protoReader));
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, Dom dom) throws IOException {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, dom.id);
                    ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, dom.children);
                    this.f126280a.encodeWithTag(protoWriter, 3, dom.attributes);
                    this.f126281b.encodeWithTag(protoWriter, 4, dom.data);
                    protoWriter.writeBytes(dom.unknownFields());
                }
            }

            /* renamed from: com.ss.android.lark.pb.videoconference.v1.FollowWebData$DomPayload$Dom$a */
            public static final class C50581a extends Message.Builder<Dom, C50581a> {

                /* renamed from: a */
                public String f126276a;

                /* renamed from: b */
                public List<String> f126277b = Internal.newMutableList();

                /* renamed from: c */
                public Map<String, String> f126278c = Internal.newMutableMap();

                /* renamed from: d */
                public Map<String, String> f126279d = Internal.newMutableMap();

                /* renamed from: a */
                public Dom build() {
                    String str = this.f126276a;
                    if (str != null) {
                        return new Dom(str, this.f126277b, this.f126278c, this.f126279d, super.buildUnknownFields());
                    }
                    throw Internal.missingRequiredFields(str, "id");
                }
            }

            @Override // com.squareup.wire.Message
            public C50581a newBuilder() {
                C50581a aVar = new C50581a();
                aVar.f126276a = this.id;
                aVar.f126277b = Internal.copyOf("children", this.children);
                aVar.f126278c = Internal.copyOf("attributes", this.attributes);
                aVar.f126279d = Internal.copyOf(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, this.data);
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("videoconference", "Dom");
                StringBuilder sb = new StringBuilder();
                sb.append(", id=");
                sb.append(this.id);
                if (!this.children.isEmpty()) {
                    sb.append(", children=");
                    sb.append(this.children);
                }
                if (!this.attributes.isEmpty()) {
                    sb.append(", attributes=");
                    sb.append(this.attributes);
                }
                if (!this.data.isEmpty()) {
                    sb.append(", data=");
                    sb.append(this.data);
                }
                StringBuilder replace = sb.replace(0, 2, "Dom{");
                replace.append('}');
                return replace.toString();
            }

            public Dom(String str, List<String> list, Map<String, String> map, Map<String, String> map2) {
                this(str, list, map, map2, ByteString.EMPTY);
            }

            public Dom(String str, List<String> list, Map<String, String> map, Map<String, String> map2, ByteString byteString) {
                super(ADAPTER, byteString);
                this.id = str;
                this.children = Internal.immutableCopyOf("children", list);
                this.attributes = Internal.immutableCopyOf("attributes", map);
                this.data = Internal.immutableCopyOf(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, map2);
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.FollowWebData$DomPayload$b */
        private static final class C50584b extends ProtoAdapter<DomPayload> {

            /* renamed from: a */
            private final ProtoAdapter<Map<String, Dom>> f126283a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Dom.ADAPTER);

            C50584b() {
                super(FieldEncoding.LENGTH_DELIMITED, DomPayload.class);
            }

            /* renamed from: a */
            public int encodedSize(DomPayload domPayload) {
                return this.f126283a.encodedSizeWithTag(1, domPayload.doms) + domPayload.unknownFields().size();
            }

            /* renamed from: a */
            public DomPayload decode(ProtoReader protoReader) throws IOException {
                C50583a aVar = new C50583a();
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
                        aVar.f126282a.putAll(this.f126283a.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, DomPayload domPayload) throws IOException {
                this.f126283a.encodeWithTag(protoWriter, 1, domPayload.doms);
                protoWriter.writeBytes(domPayload.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50583a newBuilder() {
            C50583a aVar = new C50583a();
            aVar.f126282a = Internal.copyOf("doms", this.doms);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "DomPayload");
            StringBuilder sb = new StringBuilder();
            if (!this.doms.isEmpty()) {
                sb.append(", doms=");
                sb.append(this.doms);
            }
            StringBuilder replace = sb.replace(0, 2, "DomPayload{");
            replace.append('}');
            return replace.toString();
        }

        public DomPayload(Map<String, Dom> map) {
            this(map, ByteString.EMPTY);
        }

        public DomPayload(Map<String, Dom> map, ByteString byteString) {
            super(ADAPTER, byteString);
            this.doms = Internal.immutableCopyOf("doms", map);
        }
    }

    @Override // com.squareup.wire.Message
    public C50585a newBuilder() {
        C50585a aVar = new C50585a();
        aVar.f126284a = this.id;
        aVar.f126285b = this.strategy_id;
        aVar.f126286c = this.payload;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.FollowWebData$a */
    public static final class C50585a extends Message.Builder<FollowWebData, C50585a> {

        /* renamed from: a */
        public Long f126284a;

        /* renamed from: b */
        public String f126285b;

        /* renamed from: c */
        public String f126286c;

        /* renamed from: a */
        public FollowWebData build() {
            String str;
            Long l = this.f126284a;
            if (l != null && (str = this.f126285b) != null) {
                return new FollowWebData(l, str, this.f126286c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l, "id", this.f126285b, "strategy_id");
        }

        /* renamed from: a */
        public C50585a mo175131a(Long l) {
            this.f126284a = l;
            return this;
        }

        /* renamed from: b */
        public C50585a mo175134b(String str) {
            this.f126286c = str;
            return this;
        }

        /* renamed from: a */
        public C50585a mo175132a(String str) {
            this.f126285b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "FollowWebData");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", strategy_id=");
        sb.append(this.strategy_id);
        if (this.payload != null) {
            sb.append(", payload=");
            sb.append(this.payload);
        }
        StringBuilder replace = sb.replace(0, 2, "FollowWebData{");
        replace.append('}');
        return replace.toString();
    }

    public FollowWebData(Long l, String str, String str2) {
        this(l, str, str2, ByteString.EMPTY);
    }

    public FollowWebData(Long l, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = l;
        this.strategy_id = str;
        this.payload = str2;
    }
}
