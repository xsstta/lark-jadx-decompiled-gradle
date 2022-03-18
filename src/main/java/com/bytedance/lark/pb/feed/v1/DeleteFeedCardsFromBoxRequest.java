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

public final class DeleteFeedCardsFromBoxRequest extends Message<DeleteFeedCardsFromBoxRequest, C17110a> {
    public static final ProtoAdapter<DeleteFeedCardsFromBoxRequest> ADAPTER = new C17111b();
    public static final Boolean DEFAULT_IS_REMIND = false;
    private static final long serialVersionUID = 0;
    public final List<String> feed_cards_ids;
    public final Boolean is_remind;

    /* renamed from: com.bytedance.lark.pb.feed.v1.DeleteFeedCardsFromBoxRequest$b */
    private static final class C17111b extends ProtoAdapter<DeleteFeedCardsFromBoxRequest> {
        C17111b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteFeedCardsFromBoxRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteFeedCardsFromBoxRequest deleteFeedCardsFromBoxRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, deleteFeedCardsFromBoxRequest.feed_cards_ids) + ProtoAdapter.BOOL.encodedSizeWithTag(2, deleteFeedCardsFromBoxRequest.is_remind) + deleteFeedCardsFromBoxRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteFeedCardsFromBoxRequest decode(ProtoReader protoReader) throws IOException {
            C17110a aVar = new C17110a();
            aVar.f43841b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43840a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43841b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteFeedCardsFromBoxRequest deleteFeedCardsFromBoxRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, deleteFeedCardsFromBoxRequest.feed_cards_ids);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, deleteFeedCardsFromBoxRequest.is_remind);
            protoWriter.writeBytes(deleteFeedCardsFromBoxRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.DeleteFeedCardsFromBoxRequest$a */
    public static final class C17110a extends Message.Builder<DeleteFeedCardsFromBoxRequest, C17110a> {

        /* renamed from: a */
        public List<String> f43840a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f43841b;

        /* renamed from: a */
        public DeleteFeedCardsFromBoxRequest build() {
            Boolean bool = this.f43841b;
            if (bool != null) {
                return new DeleteFeedCardsFromBoxRequest(this.f43840a, bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "is_remind");
        }

        /* renamed from: a */
        public C17110a mo60319a(Boolean bool) {
            this.f43841b = bool;
            return this;
        }

        /* renamed from: a */
        public C17110a mo60320a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f43840a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17110a newBuilder() {
        C17110a aVar = new C17110a();
        aVar.f43840a = Internal.copyOf("feed_cards_ids", this.feed_cards_ids);
        aVar.f43841b = this.is_remind;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "DeleteFeedCardsFromBoxRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.feed_cards_ids.isEmpty()) {
            sb.append(", feed_cards_ids=");
            sb.append(this.feed_cards_ids);
        }
        sb.append(", is_remind=");
        sb.append(this.is_remind);
        StringBuilder replace = sb.replace(0, 2, "DeleteFeedCardsFromBoxRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteFeedCardsFromBoxRequest(List<String> list, Boolean bool) {
        this(list, bool, ByteString.EMPTY);
    }

    public DeleteFeedCardsFromBoxRequest(List<String> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.feed_cards_ids = Internal.immutableCopyOf("feed_cards_ids", list);
        this.is_remind = bool;
    }
}
