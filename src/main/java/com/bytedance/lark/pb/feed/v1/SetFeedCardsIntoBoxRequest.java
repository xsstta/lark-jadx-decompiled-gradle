package com.bytedance.lark.pb.feed.v1;

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

public final class SetFeedCardsIntoBoxRequest extends Message<SetFeedCardsIntoBoxRequest, C17226a> {
    public static final ProtoAdapter<SetFeedCardsIntoBoxRequest> ADAPTER = new C17227b();
    private static final long serialVersionUID = 0;
    public final List<String> feed_cards_ids;

    /* renamed from: com.bytedance.lark.pb.feed.v1.SetFeedCardsIntoBoxRequest$b */
    private static final class C17227b extends ProtoAdapter<SetFeedCardsIntoBoxRequest> {
        C17227b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetFeedCardsIntoBoxRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetFeedCardsIntoBoxRequest setFeedCardsIntoBoxRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, setFeedCardsIntoBoxRequest.feed_cards_ids) + setFeedCardsIntoBoxRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetFeedCardsIntoBoxRequest decode(ProtoReader protoReader) throws IOException {
            C17226a aVar = new C17226a();
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
                    aVar.f44032a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetFeedCardsIntoBoxRequest setFeedCardsIntoBoxRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, setFeedCardsIntoBoxRequest.feed_cards_ids);
            protoWriter.writeBytes(setFeedCardsIntoBoxRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.SetFeedCardsIntoBoxRequest$a */
    public static final class C17226a extends Message.Builder<SetFeedCardsIntoBoxRequest, C17226a> {

        /* renamed from: a */
        public List<String> f44032a = Internal.newMutableList();

        /* renamed from: a */
        public SetFeedCardsIntoBoxRequest build() {
            return new SetFeedCardsIntoBoxRequest(this.f44032a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17226a mo60586a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f44032a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17226a newBuilder() {
        C17226a aVar = new C17226a();
        aVar.f44032a = Internal.copyOf("feed_cards_ids", this.feed_cards_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "SetFeedCardsIntoBoxRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.feed_cards_ids.isEmpty()) {
            sb.append(", feed_cards_ids=");
            sb.append(this.feed_cards_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "SetFeedCardsIntoBoxRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetFeedCardsIntoBoxRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public SetFeedCardsIntoBoxRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.feed_cards_ids = Internal.immutableCopyOf("feed_cards_ids", list);
    }
}
