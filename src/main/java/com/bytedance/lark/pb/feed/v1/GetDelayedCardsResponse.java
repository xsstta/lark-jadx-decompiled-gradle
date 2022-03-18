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

public final class GetDelayedCardsResponse extends Message<GetDelayedCardsResponse, C17150a> {
    public static final ProtoAdapter<GetDelayedCardsResponse> ADAPTER = new C17151b();
    private static final long serialVersionUID = 0;
    public final List<FeedEntityPreview> entity_previews;

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetDelayedCardsResponse$b */
    private static final class C17151b extends ProtoAdapter<GetDelayedCardsResponse> {
        C17151b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetDelayedCardsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetDelayedCardsResponse getDelayedCardsResponse) {
            return FeedEntityPreview.ADAPTER.asRepeated().encodedSizeWithTag(2, getDelayedCardsResponse.entity_previews) + getDelayedCardsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetDelayedCardsResponse decode(ProtoReader protoReader) throws IOException {
            C17150a aVar = new C17150a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43889a.add(FeedEntityPreview.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetDelayedCardsResponse getDelayedCardsResponse) throws IOException {
            FeedEntityPreview.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getDelayedCardsResponse.entity_previews);
            protoWriter.writeBytes(getDelayedCardsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetDelayedCardsResponse$a */
    public static final class C17150a extends Message.Builder<GetDelayedCardsResponse, C17150a> {

        /* renamed from: a */
        public List<FeedEntityPreview> f43889a = Internal.newMutableList();

        /* renamed from: a */
        public GetDelayedCardsResponse build() {
            return new GetDelayedCardsResponse(this.f43889a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17150a newBuilder() {
        C17150a aVar = new C17150a();
        aVar.f43889a = Internal.copyOf("entity_previews", this.entity_previews);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "GetDelayedCardsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.entity_previews.isEmpty()) {
            sb.append(", entity_previews=");
            sb.append(this.entity_previews);
        }
        StringBuilder replace = sb.replace(0, 2, "GetDelayedCardsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetDelayedCardsResponse(List<FeedEntityPreview> list) {
        this(list, ByteString.EMPTY);
    }

    public GetDelayedCardsResponse(List<FeedEntityPreview> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity_previews = Internal.immutableCopyOf("entity_previews", list);
    }
}
