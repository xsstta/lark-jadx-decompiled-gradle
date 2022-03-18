package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.FeedCard;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class UpdateFeedCardsRequest extends Message<UpdateFeedCardsRequest, C17240a> {
    public static final ProtoAdapter<UpdateFeedCardsRequest> ADAPTER = new C17241b();
    public static final FeedCard.FeedType DEFAULT_FEED_TYPE = FeedCard.FeedType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final FeedCard.FeedType feed_type;
    public final List<Pair> pairs;

    public static final class Pair extends Message<Pair, C17238a> {
        public static final ProtoAdapter<Pair> ADAPTER = new C17239b();
        public static final FeedCard.EntityType DEFAULT_ENTITY_TYPE = FeedCard.EntityType.UNKNOWN_ENTITY;
        private static final long serialVersionUID = 0;
        public final FeedCard.EntityType entity_type;
        public final String id;

        /* renamed from: com.bytedance.lark.pb.feed.v1.UpdateFeedCardsRequest$Pair$b */
        private static final class C17239b extends ProtoAdapter<Pair> {
            C17239b() {
                super(FieldEncoding.LENGTH_DELIMITED, Pair.class);
            }

            /* renamed from: a */
            public int encodedSize(Pair pair) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, pair.id) + FeedCard.EntityType.ADAPTER.encodedSizeWithTag(2, pair.entity_type) + pair.unknownFields().size();
            }

            /* renamed from: a */
            public Pair decode(ProtoReader protoReader) throws IOException {
                C17238a aVar = new C17238a();
                aVar.f44063a = "";
                aVar.f44064b = FeedCard.EntityType.UNKNOWN_ENTITY;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f44063a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f44064b = FeedCard.EntityType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Pair pair) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pair.id);
                FeedCard.EntityType.ADAPTER.encodeWithTag(protoWriter, 2, pair.entity_type);
                protoWriter.writeBytes(pair.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C17238a newBuilder() {
            C17238a aVar = new C17238a();
            aVar.f44063a = this.id;
            aVar.f44064b = this.entity_type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.feed.v1.UpdateFeedCardsRequest$Pair$a */
        public static final class C17238a extends Message.Builder<Pair, C17238a> {

            /* renamed from: a */
            public String f44063a;

            /* renamed from: b */
            public FeedCard.EntityType f44064b;

            /* renamed from: a */
            public Pair build() {
                FeedCard.EntityType entityType;
                String str = this.f44063a;
                if (str != null && (entityType = this.f44064b) != null) {
                    return new Pair(str, entityType, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "id", this.f44064b, "entity_type");
            }

            /* renamed from: a */
            public C17238a mo60614a(FeedCard.EntityType entityType) {
                this.f44064b = entityType;
                return this;
            }

            /* renamed from: a */
            public C17238a mo60615a(String str) {
                this.f44063a = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("feed", "Pair");
            StringBuilder sb = new StringBuilder();
            sb.append(", id=");
            sb.append(this.id);
            sb.append(", entity_type=");
            sb.append(this.entity_type);
            StringBuilder replace = sb.replace(0, 2, "Pair{");
            replace.append('}');
            return replace.toString();
        }

        public Pair(String str, FeedCard.EntityType entityType) {
            this(str, entityType, ByteString.EMPTY);
        }

        public Pair(String str, FeedCard.EntityType entityType, ByteString byteString) {
            super(ADAPTER, byteString);
            this.id = str;
            this.entity_type = entityType;
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.UpdateFeedCardsRequest$b */
    private static final class C17241b extends ProtoAdapter<UpdateFeedCardsRequest> {
        C17241b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateFeedCardsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateFeedCardsRequest updateFeedCardsRequest) {
            return FeedCard.FeedType.ADAPTER.encodedSizeWithTag(1, updateFeedCardsRequest.feed_type) + Pair.ADAPTER.asRepeated().encodedSizeWithTag(2, updateFeedCardsRequest.pairs) + updateFeedCardsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateFeedCardsRequest decode(ProtoReader protoReader) throws IOException {
            C17240a aVar = new C17240a();
            aVar.f44065a = FeedCard.FeedType.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f44065a = FeedCard.FeedType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44066b.add(Pair.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateFeedCardsRequest updateFeedCardsRequest) throws IOException {
            FeedCard.FeedType.ADAPTER.encodeWithTag(protoWriter, 1, updateFeedCardsRequest.feed_type);
            Pair.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, updateFeedCardsRequest.pairs);
            protoWriter.writeBytes(updateFeedCardsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.UpdateFeedCardsRequest$a */
    public static final class C17240a extends Message.Builder<UpdateFeedCardsRequest, C17240a> {

        /* renamed from: a */
        public FeedCard.FeedType f44065a;

        /* renamed from: b */
        public List<Pair> f44066b = Internal.newMutableList();

        /* renamed from: a */
        public UpdateFeedCardsRequest build() {
            FeedCard.FeedType feedType = this.f44065a;
            if (feedType != null) {
                return new UpdateFeedCardsRequest(feedType, this.f44066b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(feedType, "feed_type");
        }

        /* renamed from: a */
        public C17240a mo60620a(FeedCard.FeedType feedType) {
            this.f44065a = feedType;
            return this;
        }

        /* renamed from: a */
        public C17240a mo60621a(List<Pair> list) {
            Internal.checkElementsNotNull(list);
            this.f44066b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17240a newBuilder() {
        C17240a aVar = new C17240a();
        aVar.f44065a = this.feed_type;
        aVar.f44066b = Internal.copyOf("pairs", this.pairs);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "UpdateFeedCardsRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", feed_type=");
        sb.append(this.feed_type);
        if (!this.pairs.isEmpty()) {
            sb.append(", pairs=");
            sb.append(this.pairs);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateFeedCardsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateFeedCardsRequest(FeedCard.FeedType feedType, List<Pair> list) {
        this(feedType, list, ByteString.EMPTY);
    }

    public UpdateFeedCardsRequest(FeedCard.FeedType feedType, List<Pair> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.feed_type = feedType;
        this.pairs = Internal.immutableCopyOf("pairs", list);
    }
}
