package com.bytedance.lark.pb.search.sidecard;

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

public final class SideCard extends Message<SideCard, C18803a> {
    public static final ProtoAdapter<SideCard> ADAPTER = new C18804b();
    private static final long serialVersionUID = 0;
    public final List<EntityCard> entity_cards;

    /* renamed from: com.bytedance.lark.pb.search.sidecard.SideCard$b */
    private static final class C18804b extends ProtoAdapter<SideCard> {
        C18804b() {
            super(FieldEncoding.LENGTH_DELIMITED, SideCard.class);
        }

        /* renamed from: a */
        public int encodedSize(SideCard sideCard) {
            return EntityCard.ADAPTER.asRepeated().encodedSizeWithTag(1, sideCard.entity_cards) + sideCard.unknownFields().size();
        }

        /* renamed from: a */
        public SideCard decode(ProtoReader protoReader) throws IOException {
            C18803a aVar = new C18803a();
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
                    aVar.f46367a.add(EntityCard.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SideCard sideCard) throws IOException {
            EntityCard.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, sideCard.entity_cards);
            protoWriter.writeBytes(sideCard.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.sidecard.SideCard$a */
    public static final class C18803a extends Message.Builder<SideCard, C18803a> {

        /* renamed from: a */
        public List<EntityCard> f46367a = Internal.newMutableList();

        /* renamed from: a */
        public SideCard build() {
            return new SideCard(this.f46367a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18803a newBuilder() {
        C18803a aVar = new C18803a();
        aVar.f46367a = Internal.copyOf("entity_cards", this.entity_cards);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SideCard");
        StringBuilder sb = new StringBuilder();
        if (!this.entity_cards.isEmpty()) {
            sb.append(", entity_cards=");
            sb.append(this.entity_cards);
        }
        StringBuilder replace = sb.replace(0, 2, "SideCard{");
        replace.append('}');
        return replace.toString();
    }

    public SideCard(List<EntityCard> list) {
        this(list, ByteString.EMPTY);
    }

    public SideCard(List<EntityCard> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity_cards = Internal.immutableCopyOf("entity_cards", list);
    }
}
