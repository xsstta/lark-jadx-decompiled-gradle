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

public final class PreloadFeedCardsDataRequest extends Message<PreloadFeedCardsDataRequest, C17200a> {
    public static final ProtoAdapter<PreloadFeedCardsDataRequest> ADAPTER = new C17201b();
    private static final long serialVersionUID = 0;
    public final List<String> feed_card_ids;

    /* renamed from: com.bytedance.lark.pb.feed.v1.PreloadFeedCardsDataRequest$b */
    private static final class C17201b extends ProtoAdapter<PreloadFeedCardsDataRequest> {
        C17201b() {
            super(FieldEncoding.LENGTH_DELIMITED, PreloadFeedCardsDataRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PreloadFeedCardsDataRequest preloadFeedCardsDataRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, preloadFeedCardsDataRequest.feed_card_ids) + preloadFeedCardsDataRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PreloadFeedCardsDataRequest decode(ProtoReader protoReader) throws IOException {
            C17200a aVar = new C17200a();
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
                    aVar.f43985a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PreloadFeedCardsDataRequest preloadFeedCardsDataRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, preloadFeedCardsDataRequest.feed_card_ids);
            protoWriter.writeBytes(preloadFeedCardsDataRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.PreloadFeedCardsDataRequest$a */
    public static final class C17200a extends Message.Builder<PreloadFeedCardsDataRequest, C17200a> {

        /* renamed from: a */
        public List<String> f43985a = Internal.newMutableList();

        /* renamed from: a */
        public PreloadFeedCardsDataRequest build() {
            return new PreloadFeedCardsDataRequest(this.f43985a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17200a mo60531a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f43985a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17200a newBuilder() {
        C17200a aVar = new C17200a();
        aVar.f43985a = Internal.copyOf("feed_card_ids", this.feed_card_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "PreloadFeedCardsDataRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.feed_card_ids.isEmpty()) {
            sb.append(", feed_card_ids=");
            sb.append(this.feed_card_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "PreloadFeedCardsDataRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PreloadFeedCardsDataRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public PreloadFeedCardsDataRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.feed_card_ids = Internal.immutableCopyOf("feed_card_ids", list);
    }
}
