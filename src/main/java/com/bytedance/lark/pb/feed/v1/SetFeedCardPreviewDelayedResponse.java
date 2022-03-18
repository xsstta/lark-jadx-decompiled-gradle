package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetFeedCardPreviewDelayedResponse extends Message<SetFeedCardPreviewDelayedResponse, C17224a> {
    public static final ProtoAdapter<SetFeedCardPreviewDelayedResponse> ADAPTER = new C17225b();
    private static final long serialVersionUID = 0;
    public final FeedEntityPreview feed_entity_preview;

    /* renamed from: com.bytedance.lark.pb.feed.v1.SetFeedCardPreviewDelayedResponse$b */
    private static final class C17225b extends ProtoAdapter<SetFeedCardPreviewDelayedResponse> {
        C17225b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetFeedCardPreviewDelayedResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SetFeedCardPreviewDelayedResponse setFeedCardPreviewDelayedResponse) {
            int i;
            if (setFeedCardPreviewDelayedResponse.feed_entity_preview != null) {
                i = FeedEntityPreview.ADAPTER.encodedSizeWithTag(2, setFeedCardPreviewDelayedResponse.feed_entity_preview);
            } else {
                i = 0;
            }
            return i + setFeedCardPreviewDelayedResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SetFeedCardPreviewDelayedResponse decode(ProtoReader protoReader) throws IOException {
            C17224a aVar = new C17224a();
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
                    aVar.f44031a = FeedEntityPreview.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetFeedCardPreviewDelayedResponse setFeedCardPreviewDelayedResponse) throws IOException {
            if (setFeedCardPreviewDelayedResponse.feed_entity_preview != null) {
                FeedEntityPreview.ADAPTER.encodeWithTag(protoWriter, 2, setFeedCardPreviewDelayedResponse.feed_entity_preview);
            }
            protoWriter.writeBytes(setFeedCardPreviewDelayedResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.SetFeedCardPreviewDelayedResponse$a */
    public static final class C17224a extends Message.Builder<SetFeedCardPreviewDelayedResponse, C17224a> {

        /* renamed from: a */
        public FeedEntityPreview f44031a;

        /* renamed from: a */
        public SetFeedCardPreviewDelayedResponse build() {
            return new SetFeedCardPreviewDelayedResponse(this.f44031a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17224a newBuilder() {
        C17224a aVar = new C17224a();
        aVar.f44031a = this.feed_entity_preview;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "SetFeedCardPreviewDelayedResponse");
        StringBuilder sb = new StringBuilder();
        if (this.feed_entity_preview != null) {
            sb.append(", feed_entity_preview=");
            sb.append(this.feed_entity_preview);
        }
        StringBuilder replace = sb.replace(0, 2, "SetFeedCardPreviewDelayedResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SetFeedCardPreviewDelayedResponse(FeedEntityPreview feedEntityPreview) {
        this(feedEntityPreview, ByteString.EMPTY);
    }

    public SetFeedCardPreviewDelayedResponse(FeedEntityPreview feedEntityPreview, ByteString byteString) {
        super(ADAPTER, byteString);
        this.feed_entity_preview = feedEntityPreview;
    }
}
