package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetNextUnreadFeedCardsRangeRequest extends Message<GetNextUnreadFeedCardsRangeRequest, C17176a> {
    public static final ProtoAdapter<GetNextUnreadFeedCardsRangeRequest> ADAPTER = new C17177b();
    public static final Integer DEFAULT_REDUNDANCY_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final String current_channel_id;
    public final FeedFilter feed_filter;
    public final Integer redundancy_count;

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetNextUnreadFeedCardsRangeRequest$b */
    private static final class C17177b extends ProtoAdapter<GetNextUnreadFeedCardsRangeRequest> {
        C17177b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetNextUnreadFeedCardsRangeRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetNextUnreadFeedCardsRangeRequest getNextUnreadFeedCardsRangeRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (getNextUnreadFeedCardsRangeRequest.current_channel_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getNextUnreadFeedCardsRangeRequest.current_channel_id);
            } else {
                i = 0;
            }
            if (getNextUnreadFeedCardsRangeRequest.feed_filter != null) {
                i2 = FeedFilter.ADAPTER.encodedSizeWithTag(2, getNextUnreadFeedCardsRangeRequest.feed_filter);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (getNextUnreadFeedCardsRangeRequest.redundancy_count != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, getNextUnreadFeedCardsRangeRequest.redundancy_count);
            }
            return i4 + i3 + getNextUnreadFeedCardsRangeRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetNextUnreadFeedCardsRangeRequest decode(ProtoReader protoReader) throws IOException {
            C17176a aVar = new C17176a();
            aVar.f43939a = "";
            aVar.f43941c = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43939a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43940b = FeedFilter.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43941c = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetNextUnreadFeedCardsRangeRequest getNextUnreadFeedCardsRangeRequest) throws IOException {
            if (getNextUnreadFeedCardsRangeRequest.current_channel_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getNextUnreadFeedCardsRangeRequest.current_channel_id);
            }
            if (getNextUnreadFeedCardsRangeRequest.feed_filter != null) {
                FeedFilter.ADAPTER.encodeWithTag(protoWriter, 2, getNextUnreadFeedCardsRangeRequest.feed_filter);
            }
            if (getNextUnreadFeedCardsRangeRequest.redundancy_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getNextUnreadFeedCardsRangeRequest.redundancy_count);
            }
            protoWriter.writeBytes(getNextUnreadFeedCardsRangeRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetNextUnreadFeedCardsRangeRequest$a */
    public static final class C17176a extends Message.Builder<GetNextUnreadFeedCardsRangeRequest, C17176a> {

        /* renamed from: a */
        public String f43939a;

        /* renamed from: b */
        public FeedFilter f43940b;

        /* renamed from: c */
        public Integer f43941c;

        /* renamed from: a */
        public GetNextUnreadFeedCardsRangeRequest build() {
            return new GetNextUnreadFeedCardsRangeRequest(this.f43939a, this.f43940b, this.f43941c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17176a mo60476a(FeedFilter feedFilter) {
            this.f43940b = feedFilter;
            return this;
        }

        /* renamed from: a */
        public C17176a mo60477a(Integer num) {
            this.f43941c = num;
            return this;
        }

        /* renamed from: a */
        public C17176a mo60478a(String str) {
            this.f43939a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17176a newBuilder() {
        C17176a aVar = new C17176a();
        aVar.f43939a = this.current_channel_id;
        aVar.f43940b = this.feed_filter;
        aVar.f43941c = this.redundancy_count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "GetNextUnreadFeedCardsRangeRequest");
        StringBuilder sb = new StringBuilder();
        if (this.current_channel_id != null) {
            sb.append(", current_channel_id=");
            sb.append(this.current_channel_id);
        }
        if (this.feed_filter != null) {
            sb.append(", feed_filter=");
            sb.append(this.feed_filter);
        }
        if (this.redundancy_count != null) {
            sb.append(", redundancy_count=");
            sb.append(this.redundancy_count);
        }
        StringBuilder replace = sb.replace(0, 2, "GetNextUnreadFeedCardsRangeRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetNextUnreadFeedCardsRangeRequest(String str, FeedFilter feedFilter, Integer num) {
        this(str, feedFilter, num, ByteString.EMPTY);
    }

    public GetNextUnreadFeedCardsRangeRequest(String str, FeedFilter feedFilter, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.current_channel_id = str;
        this.feed_filter = feedFilter;
        this.redundancy_count = num;
    }
}
