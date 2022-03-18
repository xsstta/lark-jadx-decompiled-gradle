package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class BrowseFolderRequest extends Message<BrowseFolderRequest, C18190a> {
    public static final ProtoAdapter<BrowseFolderRequest> ADAPTER = new C18191b();
    public static final DownloadFileScene DEFAULT_SCENE = DownloadFileScene.CHAT;
    private static final long serialVersionUID = 0;
    public final DownloadFileScene scene;
    public final SerReq ser_req;

    public static final class SerReq extends Message<SerReq, C18188a> {
        public static final ProtoAdapter<SerReq> ADAPTER = new C18189b();
        public static final Direction DEFAULT_ORDER_DIRECTION = Direction.DESC;
        public static final IndexKey DEFAULT_ORDER_TYPE = IndexKey.CREATE_TIME;
        public static final Long DEFAULT_START = 0L;
        public static final Long DEFAULT_STEP = 0L;
        private static final long serialVersionUID = 0;
        public final String key;
        public final Direction order_direction;
        public final IndexKey order_type;
        public final Long start;
        public final Long step;

        public enum Direction implements WireEnum {
            DESC(1),
            ASC(2);
            
            public static final ProtoAdapter<Direction> ADAPTER = ProtoAdapter.newEnumAdapter(Direction.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Direction fromValue(int i) {
                if (i == 1) {
                    return DESC;
                }
                if (i != 2) {
                    return null;
                }
                return ASC;
            }

            private Direction(int i) {
                this.value = i;
            }
        }

        public enum IndexKey implements WireEnum {
            CREATE_TIME(1),
            SIZE(2),
            NAME(3);
            
            public static final ProtoAdapter<IndexKey> ADAPTER = ProtoAdapter.newEnumAdapter(IndexKey.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static IndexKey fromValue(int i) {
                if (i == 1) {
                    return CREATE_TIME;
                }
                if (i == 2) {
                    return SIZE;
                }
                if (i != 3) {
                    return null;
                }
                return NAME;
            }

            private IndexKey(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.media.v1.BrowseFolderRequest$SerReq$b */
        private static final class C18189b extends ProtoAdapter<SerReq> {
            C18189b() {
                super(FieldEncoding.LENGTH_DELIMITED, SerReq.class);
            }

            /* renamed from: a */
            public int encodedSize(SerReq serReq) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, serReq.key) + ProtoAdapter.INT64.encodedSizeWithTag(2, serReq.start) + ProtoAdapter.INT64.encodedSizeWithTag(3, serReq.step);
                int i2 = 0;
                if (serReq.order_type != null) {
                    i = IndexKey.ADAPTER.encodedSizeWithTag(4, serReq.order_type);
                } else {
                    i = 0;
                }
                int i3 = encodedSizeWithTag + i;
                if (serReq.order_direction != null) {
                    i2 = Direction.ADAPTER.encodedSizeWithTag(5, serReq.order_direction);
                }
                return i3 + i2 + serReq.unknownFields().size();
            }

            /* renamed from: a */
            public SerReq decode(ProtoReader protoReader) throws IOException {
                C18188a aVar = new C18188a();
                aVar.f45405a = "";
                aVar.f45406b = 0L;
                aVar.f45407c = 0L;
                aVar.f45408d = IndexKey.CREATE_TIME;
                aVar.f45409e = Direction.DESC;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f45405a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f45406b = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f45407c = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag == 4) {
                        try {
                            aVar.f45408d = IndexKey.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f45409e = Direction.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SerReq serReq) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, serReq.key);
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, serReq.start);
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, serReq.step);
                if (serReq.order_type != null) {
                    IndexKey.ADAPTER.encodeWithTag(protoWriter, 4, serReq.order_type);
                }
                if (serReq.order_direction != null) {
                    Direction.ADAPTER.encodeWithTag(protoWriter, 5, serReq.order_direction);
                }
                protoWriter.writeBytes(serReq.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.media.v1.BrowseFolderRequest$SerReq$a */
        public static final class C18188a extends Message.Builder<SerReq, C18188a> {

            /* renamed from: a */
            public String f45405a;

            /* renamed from: b */
            public Long f45406b;

            /* renamed from: c */
            public Long f45407c;

            /* renamed from: d */
            public IndexKey f45408d;

            /* renamed from: e */
            public Direction f45409e;

            /* renamed from: a */
            public SerReq build() {
                Long l;
                Long l2;
                String str = this.f45405a;
                if (str != null && (l = this.f45406b) != null && (l2 = this.f45407c) != null) {
                    return new SerReq(str, l, l2, this.f45408d, this.f45409e, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "key", this.f45406b, "start", this.f45407c, "step");
            }

            /* renamed from: a */
            public C18188a mo63068a(Direction direction) {
                this.f45409e = direction;
                return this;
            }

            /* renamed from: b */
            public C18188a mo63073b(Long l) {
                this.f45407c = l;
                return this;
            }

            /* renamed from: a */
            public C18188a mo63069a(IndexKey indexKey) {
                this.f45408d = indexKey;
                return this;
            }

            /* renamed from: a */
            public C18188a mo63070a(Long l) {
                this.f45406b = l;
                return this;
            }

            /* renamed from: a */
            public C18188a mo63071a(String str) {
                this.f45405a = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C18188a newBuilder() {
            C18188a aVar = new C18188a();
            aVar.f45405a = this.key;
            aVar.f45406b = this.start;
            aVar.f45407c = this.step;
            aVar.f45408d = this.order_type;
            aVar.f45409e = this.order_direction;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("media", "SerReq");
            StringBuilder sb = new StringBuilder();
            sb.append(", key=");
            sb.append(this.key);
            sb.append(", start=");
            sb.append(this.start);
            sb.append(", step=");
            sb.append(this.step);
            if (this.order_type != null) {
                sb.append(", order_type=");
                sb.append(this.order_type);
            }
            if (this.order_direction != null) {
                sb.append(", order_direction=");
                sb.append(this.order_direction);
            }
            StringBuilder replace = sb.replace(0, 2, "SerReq{");
            replace.append('}');
            return replace.toString();
        }

        public SerReq(String str, Long l, Long l2, IndexKey indexKey, Direction direction) {
            this(str, l, l2, indexKey, direction, ByteString.EMPTY);
        }

        public SerReq(String str, Long l, Long l2, IndexKey indexKey, Direction direction, ByteString byteString) {
            super(ADAPTER, byteString);
            this.key = str;
            this.start = l;
            this.step = l2;
            this.order_type = indexKey;
            this.order_direction = direction;
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.BrowseFolderRequest$b */
    private static final class C18191b extends ProtoAdapter<BrowseFolderRequest> {
        C18191b() {
            super(FieldEncoding.LENGTH_DELIMITED, BrowseFolderRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(BrowseFolderRequest browseFolderRequest) {
            int i;
            int encodedSizeWithTag = SerReq.ADAPTER.encodedSizeWithTag(1, browseFolderRequest.ser_req);
            if (browseFolderRequest.scene != null) {
                i = DownloadFileScene.ADAPTER.encodedSizeWithTag(2, browseFolderRequest.scene);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + browseFolderRequest.unknownFields().size();
        }

        /* renamed from: a */
        public BrowseFolderRequest decode(ProtoReader protoReader) throws IOException {
            C18190a aVar = new C18190a();
            aVar.f45411b = DownloadFileScene.CHAT;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45410a = SerReq.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f45411b = DownloadFileScene.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BrowseFolderRequest browseFolderRequest) throws IOException {
            SerReq.ADAPTER.encodeWithTag(protoWriter, 1, browseFolderRequest.ser_req);
            if (browseFolderRequest.scene != null) {
                DownloadFileScene.ADAPTER.encodeWithTag(protoWriter, 2, browseFolderRequest.scene);
            }
            protoWriter.writeBytes(browseFolderRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.BrowseFolderRequest$a */
    public static final class C18190a extends Message.Builder<BrowseFolderRequest, C18190a> {

        /* renamed from: a */
        public SerReq f45410a;

        /* renamed from: b */
        public DownloadFileScene f45411b;

        /* renamed from: a */
        public BrowseFolderRequest build() {
            SerReq serReq = this.f45410a;
            if (serReq != null) {
                return new BrowseFolderRequest(serReq, this.f45411b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(serReq, "ser_req");
        }

        /* renamed from: a */
        public C18190a mo63077a(SerReq serReq) {
            this.f45410a = serReq;
            return this;
        }

        /* renamed from: a */
        public C18190a mo63078a(DownloadFileScene downloadFileScene) {
            this.f45411b = downloadFileScene;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18190a newBuilder() {
        C18190a aVar = new C18190a();
        aVar.f45410a = this.ser_req;
        aVar.f45411b = this.scene;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "BrowseFolderRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", ser_req=");
        sb.append(this.ser_req);
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        StringBuilder replace = sb.replace(0, 2, "BrowseFolderRequest{");
        replace.append('}');
        return replace.toString();
    }

    public BrowseFolderRequest(SerReq serReq, DownloadFileScene downloadFileScene) {
        this(serReq, downloadFileScene, ByteString.EMPTY);
    }

    public BrowseFolderRequest(SerReq serReq, DownloadFileScene downloadFileScene, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ser_req = serReq;
        this.scene = downloadFileScene;
    }
}
