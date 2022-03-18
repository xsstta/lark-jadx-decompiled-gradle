package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SubscribeFeedPushSceneResponse extends Message<SubscribeFeedPushSceneResponse, C17232a> {
    public static final ProtoAdapter<SubscribeFeedPushSceneResponse> ADAPTER = new C17233b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.feed.v1.SubscribeFeedPushSceneResponse$b */
    private static final class C17233b extends ProtoAdapter<SubscribeFeedPushSceneResponse> {
        C17233b() {
            super(FieldEncoding.LENGTH_DELIMITED, SubscribeFeedPushSceneResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SubscribeFeedPushSceneResponse subscribeFeedPushSceneResponse) {
            return subscribeFeedPushSceneResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SubscribeFeedPushSceneResponse decode(ProtoReader protoReader) throws IOException {
            C17232a aVar = new C17232a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SubscribeFeedPushSceneResponse subscribeFeedPushSceneResponse) throws IOException {
            protoWriter.writeBytes(subscribeFeedPushSceneResponse.unknownFields());
        }
    }

    public SubscribeFeedPushSceneResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.SubscribeFeedPushSceneResponse$a */
    public static final class C17232a extends Message.Builder<SubscribeFeedPushSceneResponse, C17232a> {
        /* renamed from: a */
        public SubscribeFeedPushSceneResponse build() {
            return new SubscribeFeedPushSceneResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17232a newBuilder() {
        C17232a aVar = new C17232a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "SubscribeFeedPushSceneResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "SubscribeFeedPushSceneResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SubscribeFeedPushSceneResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
