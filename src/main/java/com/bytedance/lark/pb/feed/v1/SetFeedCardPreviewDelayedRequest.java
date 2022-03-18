package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SetFeedCardPreviewDelayedRequest extends Message<SetFeedCardPreviewDelayedRequest, C17222a> {
    public static final ProtoAdapter<SetFeedCardPreviewDelayedRequest> ADAPTER = new C17223b();
    public static final Boolean DEFAULT_IS_DELAYED = false;
    private static final long serialVersionUID = 0;
    public final String feed_card_id;
    public final Boolean is_delayed;

    /* renamed from: com.bytedance.lark.pb.feed.v1.SetFeedCardPreviewDelayedRequest$b */
    private static final class C17223b extends ProtoAdapter<SetFeedCardPreviewDelayedRequest> {
        C17223b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetFeedCardPreviewDelayedRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetFeedCardPreviewDelayedRequest setFeedCardPreviewDelayedRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, setFeedCardPreviewDelayedRequest.feed_card_id) + ProtoAdapter.BOOL.encodedSizeWithTag(2, setFeedCardPreviewDelayedRequest.is_delayed) + setFeedCardPreviewDelayedRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetFeedCardPreviewDelayedRequest decode(ProtoReader protoReader) throws IOException {
            C17222a aVar = new C17222a();
            aVar.f44029a = "";
            aVar.f44030b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44029a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44030b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetFeedCardPreviewDelayedRequest setFeedCardPreviewDelayedRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setFeedCardPreviewDelayedRequest.feed_card_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, setFeedCardPreviewDelayedRequest.is_delayed);
            protoWriter.writeBytes(setFeedCardPreviewDelayedRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17222a newBuilder() {
        C17222a aVar = new C17222a();
        aVar.f44029a = this.feed_card_id;
        aVar.f44030b = this.is_delayed;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.SetFeedCardPreviewDelayedRequest$a */
    public static final class C17222a extends Message.Builder<SetFeedCardPreviewDelayedRequest, C17222a> {

        /* renamed from: a */
        public String f44029a;

        /* renamed from: b */
        public Boolean f44030b;

        /* renamed from: a */
        public SetFeedCardPreviewDelayedRequest build() {
            Boolean bool;
            String str = this.f44029a;
            if (str != null && (bool = this.f44030b) != null) {
                return new SetFeedCardPreviewDelayedRequest(str, bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "feed_card_id", this.f44030b, "is_delayed");
        }

        /* renamed from: a */
        public C17222a mo60576a(Boolean bool) {
            this.f44030b = bool;
            return this;
        }

        /* renamed from: a */
        public C17222a mo60577a(String str) {
            this.f44029a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "SetFeedCardPreviewDelayedRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", feed_card_id=");
        sb.append(this.feed_card_id);
        sb.append(", is_delayed=");
        sb.append(this.is_delayed);
        StringBuilder replace = sb.replace(0, 2, "SetFeedCardPreviewDelayedRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetFeedCardPreviewDelayedRequest(String str, Boolean bool) {
        this(str, bool, ByteString.EMPTY);
    }

    public SetFeedCardPreviewDelayedRequest(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.feed_card_id = str;
        this.is_delayed = bool;
    }
}
