package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.FeedCard;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import okio.ByteString;

public final class CardPair extends Message<CardPair, C17096a> {
    public static final ProtoAdapter<CardPair> ADAPTER = new C17097b();
    public static final FeedCard.EntityType DEFAULT_TYPE = FeedCard.EntityType.UNKNOWN_ENTITY;
    private static final long serialVersionUID = 0;
    public final String id;
    public final FeedCard.EntityType type;

    /* renamed from: com.bytedance.lark.pb.feed.v1.CardPair$b */
    private static final class C17097b extends ProtoAdapter<CardPair> {
        C17097b() {
            super(FieldEncoding.LENGTH_DELIMITED, CardPair.class);
        }

        /* renamed from: a */
        public int encodedSize(CardPair cardPair) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, cardPair.id) + FeedCard.EntityType.ADAPTER.encodedSizeWithTag(2, cardPair.type) + cardPair.unknownFields().size();
        }

        /* renamed from: a */
        public CardPair decode(ProtoReader protoReader) throws IOException {
            C17096a aVar = new C17096a();
            aVar.f43781a = "";
            aVar.f43782b = FeedCard.EntityType.UNKNOWN_ENTITY;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43781a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f43782b = FeedCard.EntityType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CardPair cardPair) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, cardPair.id);
            FeedCard.EntityType.ADAPTER.encodeWithTag(protoWriter, 2, cardPair.type);
            protoWriter.writeBytes(cardPair.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17096a newBuilder() {
        C17096a aVar = new C17096a();
        aVar.f43781a = this.id;
        aVar.f43782b = this.type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.CardPair$a */
    public static final class C17096a extends Message.Builder<CardPair, C17096a> {

        /* renamed from: a */
        public String f43781a;

        /* renamed from: b */
        public FeedCard.EntityType f43782b;

        /* renamed from: a */
        public CardPair build() {
            FeedCard.EntityType entityType;
            String str = this.f43781a;
            if (str != null && (entityType = this.f43782b) != null) {
                return new CardPair(str, entityType, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id", this.f43782b, ShareHitPoint.f121869d);
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "CardPair");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", type=");
        sb.append(this.type);
        StringBuilder replace = sb.replace(0, 2, "CardPair{");
        replace.append('}');
        return replace.toString();
    }

    public CardPair(String str, FeedCard.EntityType entityType) {
        this(str, entityType, ByteString.EMPTY);
    }

    public CardPair(String str, FeedCard.EntityType entityType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.type = entityType;
    }
}
