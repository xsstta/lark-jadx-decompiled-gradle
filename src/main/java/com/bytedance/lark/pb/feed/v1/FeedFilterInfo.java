package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class FeedFilterInfo extends Message<FeedFilterInfo, C17130a> {
    public static final ProtoAdapter<FeedFilterInfo> ADAPTER = new C17131b();
    public static final Integer DEFAULT_MUTE_UNREAD_COUNT = 0;
    public static final Integer DEFAULT_UNREAD_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final Integer mute_unread_count;
    public final FeedFilter type;
    public final Integer unread_count;

    /* renamed from: com.bytedance.lark.pb.feed.v1.FeedFilterInfo$b */
    private static final class C17131b extends ProtoAdapter<FeedFilterInfo> {
        C17131b() {
            super(FieldEncoding.LENGTH_DELIMITED, FeedFilterInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(FeedFilterInfo feedFilterInfo) {
            int i;
            int i2;
            int i3 = 0;
            if (feedFilterInfo.type != null) {
                i = FeedFilter.ADAPTER.encodedSizeWithTag(1, feedFilterInfo.type);
            } else {
                i = 0;
            }
            if (feedFilterInfo.unread_count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, feedFilterInfo.unread_count);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (feedFilterInfo.mute_unread_count != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, feedFilterInfo.mute_unread_count);
            }
            return i4 + i3 + feedFilterInfo.unknownFields().size();
        }

        /* renamed from: a */
        public FeedFilterInfo decode(ProtoReader protoReader) throws IOException {
            C17130a aVar = new C17130a();
            aVar.f43878b = 0;
            aVar.f43879c = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43877a = FeedFilter.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43878b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43879c = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FeedFilterInfo feedFilterInfo) throws IOException {
            if (feedFilterInfo.type != null) {
                FeedFilter.ADAPTER.encodeWithTag(protoWriter, 1, feedFilterInfo.type);
            }
            if (feedFilterInfo.unread_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, feedFilterInfo.unread_count);
            }
            if (feedFilterInfo.mute_unread_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, feedFilterInfo.mute_unread_count);
            }
            protoWriter.writeBytes(feedFilterInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.FeedFilterInfo$a */
    public static final class C17130a extends Message.Builder<FeedFilterInfo, C17130a> {

        /* renamed from: a */
        public FeedFilter f43877a;

        /* renamed from: b */
        public Integer f43878b;

        /* renamed from: c */
        public Integer f43879c;

        /* renamed from: a */
        public FeedFilterInfo build() {
            return new FeedFilterInfo(this.f43877a, this.f43878b, this.f43879c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17130a newBuilder() {
        C17130a aVar = new C17130a();
        aVar.f43877a = this.type;
        aVar.f43878b = this.unread_count;
        aVar.f43879c = this.mute_unread_count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "FeedFilterInfo");
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.unread_count != null) {
            sb.append(", unread_count=");
            sb.append(this.unread_count);
        }
        if (this.mute_unread_count != null) {
            sb.append(", mute_unread_count=");
            sb.append(this.mute_unread_count);
        }
        StringBuilder replace = sb.replace(0, 2, "FeedFilterInfo{");
        replace.append('}');
        return replace.toString();
    }

    public FeedFilterInfo(FeedFilter feedFilter, Integer num, Integer num2) {
        this(feedFilter, num, num2, ByteString.EMPTY);
    }

    public FeedFilterInfo(FeedFilter feedFilter, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = feedFilter;
        this.unread_count = num;
        this.mute_unread_count = num2;
    }
}
