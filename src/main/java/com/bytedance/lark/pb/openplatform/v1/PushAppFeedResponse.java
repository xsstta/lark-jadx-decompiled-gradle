package com.bytedance.lark.pb.openplatform.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.AppFeed;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class PushAppFeedResponse extends Message<PushAppFeedResponse, C18687a> {
    public static final ProtoAdapter<PushAppFeedResponse> ADAPTER = new C18688b();
    private static final long serialVersionUID = 0;
    public final Map<String, AppFeed> app_feeds;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.PushAppFeedResponse$a */
    public static final class C18687a extends Message.Builder<PushAppFeedResponse, C18687a> {

        /* renamed from: a */
        public Map<String, AppFeed> f46226a = Internal.newMutableMap();

        /* renamed from: a */
        public PushAppFeedResponse build() {
            return new PushAppFeedResponse(this.f46226a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.PushAppFeedResponse$b */
    private static final class C18688b extends ProtoAdapter<PushAppFeedResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, AppFeed>> f46227a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, AppFeed.ADAPTER);

        C18688b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushAppFeedResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PushAppFeedResponse pushAppFeedResponse) {
            return this.f46227a.encodedSizeWithTag(1, pushAppFeedResponse.app_feeds) + pushAppFeedResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PushAppFeedResponse decode(ProtoReader protoReader) throws IOException {
            C18687a aVar = new C18687a();
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
                    aVar.f46226a.putAll(this.f46227a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushAppFeedResponse pushAppFeedResponse) throws IOException {
            this.f46227a.encodeWithTag(protoWriter, 1, pushAppFeedResponse.app_feeds);
            protoWriter.writeBytes(pushAppFeedResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18687a newBuilder() {
        C18687a aVar = new C18687a();
        aVar.f46226a = Internal.copyOf("app_feeds", this.app_feeds);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "PushAppFeedResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.app_feeds.isEmpty()) {
            sb.append(", app_feeds=");
            sb.append(this.app_feeds);
        }
        StringBuilder replace = sb.replace(0, 2, "PushAppFeedResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PushAppFeedResponse(Map<String, AppFeed> map) {
        this(map, ByteString.EMPTY);
    }

    public PushAppFeedResponse(Map<String, AppFeed> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.app_feeds = Internal.immutableCopyOf("app_feeds", map);
    }
}
