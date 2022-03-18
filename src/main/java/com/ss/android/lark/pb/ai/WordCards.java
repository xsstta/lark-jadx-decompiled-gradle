package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class WordCards extends Message<WordCards, C49537a> {
    public static final ProtoAdapter<WordCards> ADAPTER = new C49538b();
    private static final long serialVersionUID = 0;
    public final List<EntityCard> mcards;
    public final String mname;
    public final Span mspan;

    /* renamed from: com.ss.android.lark.pb.ai.WordCards$b */
    private static final class C49538b extends ProtoAdapter<WordCards> {
        C49538b() {
            super(FieldEncoding.LENGTH_DELIMITED, WordCards.class);
        }

        /* renamed from: a */
        public int encodedSize(WordCards wordCards) {
            int i;
            int encodedSizeWithTag = EntityCard.ADAPTER.asRepeated().encodedSizeWithTag(1, wordCards.mcards);
            int i2 = 0;
            if (wordCards.mspan != null) {
                i = Span.ADAPTER.encodedSizeWithTag(2, wordCards.mspan);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (wordCards.mname != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, wordCards.mname);
            }
            return i3 + i2 + wordCards.unknownFields().size();
        }

        /* renamed from: a */
        public WordCards decode(ProtoReader protoReader) throws IOException {
            C49537a aVar = new C49537a();
            aVar.f124135c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124133a.add(EntityCard.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f124134b = Span.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124135c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, WordCards wordCards) throws IOException {
            EntityCard.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, wordCards.mcards);
            if (wordCards.mspan != null) {
                Span.ADAPTER.encodeWithTag(protoWriter, 2, wordCards.mspan);
            }
            if (wordCards.mname != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, wordCards.mname);
            }
            protoWriter.writeBytes(wordCards.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.WordCards$a */
    public static final class C49537a extends Message.Builder<WordCards, C49537a> {

        /* renamed from: a */
        public List<EntityCard> f124133a = Internal.newMutableList();

        /* renamed from: b */
        public Span f124134b;

        /* renamed from: c */
        public String f124135c;

        /* renamed from: a */
        public WordCards build() {
            return new WordCards(this.f124133a, this.f124134b, this.f124135c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49537a newBuilder() {
        C49537a aVar = new C49537a();
        aVar.f124133a = Internal.copyOf("mcards", this.mcards);
        aVar.f124134b = this.mspan;
        aVar.f124135c = this.mname;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mcards.isEmpty()) {
            sb.append(", cards=");
            sb.append(this.mcards);
        }
        if (this.mspan != null) {
            sb.append(", span=");
            sb.append(this.mspan);
        }
        if (this.mname != null) {
            sb.append(", name=");
            sb.append(this.mname);
        }
        StringBuilder replace = sb.replace(0, 2, "WordCards{");
        replace.append('}');
        return replace.toString();
    }

    public WordCards(List<EntityCard> list, Span span, String str) {
        this(list, span, str, ByteString.EMPTY);
    }

    public WordCards(List<EntityCard> list, Span span, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mcards = Internal.immutableCopyOf("mcards", list);
        this.mspan = span;
        this.mname = str;
    }
}
