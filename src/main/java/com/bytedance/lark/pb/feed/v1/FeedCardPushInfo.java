package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.feed.v1.FeedFilter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class FeedCardPushInfo extends Message<FeedCardPushInfo, C17120a> {
    public static final ProtoAdapter<FeedCardPushInfo> ADAPTER = new C17121b();
    private static final long serialVersionUID = 0;
    public final FeedFilter.List list;
    public final FeedEntityPreview preview;

    /* renamed from: com.bytedance.lark.pb.feed.v1.FeedCardPushInfo$b */
    private static final class C17121b extends ProtoAdapter<FeedCardPushInfo> {
        C17121b() {
            super(FieldEncoding.LENGTH_DELIMITED, FeedCardPushInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(FeedCardPushInfo feedCardPushInfo) {
            int i;
            int i2 = 0;
            if (feedCardPushInfo.preview != null) {
                i = FeedEntityPreview.ADAPTER.encodedSizeWithTag(1, feedCardPushInfo.preview);
            } else {
                i = 0;
            }
            if (feedCardPushInfo.list != null) {
                i2 = FeedFilter.List.ADAPTER.encodedSizeWithTag(2, feedCardPushInfo.list);
            }
            return i + i2 + feedCardPushInfo.unknownFields().size();
        }

        /* renamed from: a */
        public FeedCardPushInfo decode(ProtoReader protoReader) throws IOException {
            C17120a aVar = new C17120a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43859a = FeedEntityPreview.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43860b = FeedFilter.List.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FeedCardPushInfo feedCardPushInfo) throws IOException {
            if (feedCardPushInfo.preview != null) {
                FeedEntityPreview.ADAPTER.encodeWithTag(protoWriter, 1, feedCardPushInfo.preview);
            }
            if (feedCardPushInfo.list != null) {
                FeedFilter.List.ADAPTER.encodeWithTag(protoWriter, 2, feedCardPushInfo.list);
            }
            protoWriter.writeBytes(feedCardPushInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.FeedCardPushInfo$a */
    public static final class C17120a extends Message.Builder<FeedCardPushInfo, C17120a> {

        /* renamed from: a */
        public FeedEntityPreview f43859a;

        /* renamed from: b */
        public FeedFilter.List f43860b;

        /* renamed from: a */
        public FeedCardPushInfo build() {
            return new FeedCardPushInfo(this.f43859a, this.f43860b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17120a newBuilder() {
        C17120a aVar = new C17120a();
        aVar.f43859a = this.preview;
        aVar.f43860b = this.list;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "FeedCardPushInfo");
        StringBuilder sb = new StringBuilder();
        if (this.preview != null) {
            sb.append(", preview=");
            sb.append(this.preview);
        }
        if (this.list != null) {
            sb.append(", list=");
            sb.append(this.list);
        }
        StringBuilder replace = sb.replace(0, 2, "FeedCardPushInfo{");
        replace.append('}');
        return replace.toString();
    }

    public FeedCardPushInfo(FeedEntityPreview feedEntityPreview, FeedFilter.List list2) {
        this(feedEntityPreview, list2, ByteString.EMPTY);
    }

    public FeedCardPushInfo(FeedEntityPreview feedEntityPreview, FeedFilter.List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.preview = feedEntityPreview;
        this.list = list2;
    }
}
