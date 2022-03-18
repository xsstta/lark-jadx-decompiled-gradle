package com.bytedance.lark.pb.basic.v1;

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

public final class FeedCard extends Message<FeedCard, C14947a> {
    public static final ProtoAdapter<FeedCard> ADAPTER = new C14948b();
    public static final EntityType DEFAULT_ENTITY_TYPE = EntityType.UNKNOWN_ENTITY;
    public static final FeedType DEFAULT_FEED_TYPE = FeedType.UNKNOWN;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final EntityType entity_type;
    public final FeedType feed_type;
    public final String id;
    public final String parent_card_id;
    public final Long update_time;

    public enum EntityType implements WireEnum {
        UNKNOWN_ENTITY(0),
        CHAT(1),
        EMAIL(2),
        DOC_FEED(3),
        THREAD(4),
        BOX(5),
        OPENAPP(6),
        TOPIC(7),
        SUBSCRIPTION(10),
        EMAIL_ROOT_DRAFT(100);
        
        public static final ProtoAdapter<EntityType> ADAPTER = ProtoAdapter.newEnumAdapter(EntityType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static EntityType fromValue(int i) {
            if (i == 10) {
                return SUBSCRIPTION;
            }
            if (i == 100) {
                return EMAIL_ROOT_DRAFT;
            }
            switch (i) {
                case 0:
                    return UNKNOWN_ENTITY;
                case 1:
                    return CHAT;
                case 2:
                    return EMAIL;
                case 3:
                    return DOC_FEED;
                case 4:
                    return THREAD;
                case 5:
                    return BOX;
                case 6:
                    return OPENAPP;
                case 7:
                    return TOPIC;
                default:
                    return null;
            }
        }

        private EntityType(int i) {
            this.value = i;
        }
    }

    public enum FeedType implements WireEnum {
        UNKNOWN(0),
        INBOX(1),
        DONE(2);
        
        public static final ProtoAdapter<FeedType> ADAPTER = ProtoAdapter.newEnumAdapter(FeedType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static FeedType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return INBOX;
            }
            if (i != 2) {
                return null;
            }
            return DONE;
        }

        private FeedType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.FeedCard$b */
    private static final class C14948b extends ProtoAdapter<FeedCard> {
        C14948b() {
            super(FieldEncoding.LENGTH_DELIMITED, FeedCard.class);
        }

        /* renamed from: a */
        public int encodedSize(FeedCard feedCard) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, feedCard.id) + EntityType.ADAPTER.encodedSizeWithTag(2, feedCard.entity_type);
            int i3 = 0;
            if (feedCard.feed_type != null) {
                i = FeedType.ADAPTER.encodedSizeWithTag(3, feedCard.feed_type);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (feedCard.update_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(4, feedCard.update_time);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (feedCard.parent_card_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(5, feedCard.parent_card_id);
            }
            return i5 + i3 + feedCard.unknownFields().size();
        }

        /* renamed from: a */
        public FeedCard decode(ProtoReader protoReader) throws IOException {
            C14947a aVar = new C14947a();
            aVar.f39592a = "";
            aVar.f39593b = EntityType.UNKNOWN_ENTITY;
            aVar.f39594c = FeedType.UNKNOWN;
            aVar.f39595d = 0L;
            aVar.f39596e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39592a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f39593b = EntityType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    try {
                        aVar.f39594c = FeedType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag == 4) {
                    aVar.f39595d = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f39596e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FeedCard feedCard) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, feedCard.id);
            EntityType.ADAPTER.encodeWithTag(protoWriter, 2, feedCard.entity_type);
            if (feedCard.feed_type != null) {
                FeedType.ADAPTER.encodeWithTag(protoWriter, 3, feedCard.feed_type);
            }
            if (feedCard.update_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, feedCard.update_time);
            }
            if (feedCard.parent_card_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, feedCard.parent_card_id);
            }
            protoWriter.writeBytes(feedCard.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.FeedCard$a */
    public static final class C14947a extends Message.Builder<FeedCard, C14947a> {

        /* renamed from: a */
        public String f39592a;

        /* renamed from: b */
        public EntityType f39593b;

        /* renamed from: c */
        public FeedType f39594c;

        /* renamed from: d */
        public Long f39595d;

        /* renamed from: e */
        public String f39596e;

        /* renamed from: a */
        public FeedCard build() {
            EntityType entityType;
            String str = this.f39592a;
            if (str != null && (entityType = this.f39593b) != null) {
                return new FeedCard(str, entityType, this.f39594c, this.f39595d, this.f39596e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id", this.f39593b, "entity_type");
        }
    }

    @Override // com.squareup.wire.Message
    public C14947a newBuilder() {
        C14947a aVar = new C14947a();
        aVar.f39592a = this.id;
        aVar.f39593b = this.entity_type;
        aVar.f39594c = this.feed_type;
        aVar.f39595d = this.update_time;
        aVar.f39596e = this.parent_card_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "FeedCard");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", entity_type=");
        sb.append(this.entity_type);
        if (this.feed_type != null) {
            sb.append(", feed_type=");
            sb.append(this.feed_type);
        }
        if (this.update_time != null) {
            sb.append(", update_time=");
            sb.append(this.update_time);
        }
        if (this.parent_card_id != null) {
            sb.append(", parent_card_id=");
            sb.append(this.parent_card_id);
        }
        StringBuilder replace = sb.replace(0, 2, "FeedCard{");
        replace.append('}');
        return replace.toString();
    }

    public FeedCard(String str, EntityType entityType, FeedType feedType, Long l, String str2) {
        this(str, entityType, feedType, l, str2, ByteString.EMPTY);
    }

    public FeedCard(String str, EntityType entityType, FeedType feedType, Long l, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.entity_type = entityType;
        this.feed_type = feedType;
        this.update_time = l;
        this.parent_card_id = str2;
    }
}
