package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class FeedCursor extends Message<FeedCursor, C17122a> {
    public static final ProtoAdapter<FeedCursor> ADAPTER = new C17123b();
    public static final Long DEFAULT_ID = 0L;
    public static final Long DEFAULT_RANK_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Long id;
    public final Long rank_time;

    /* renamed from: com.bytedance.lark.pb.feed.v1.FeedCursor$b */
    private static final class C17123b extends ProtoAdapter<FeedCursor> {
        C17123b() {
            super(FieldEncoding.LENGTH_DELIMITED, FeedCursor.class);
        }

        /* renamed from: a */
        public int encodedSize(FeedCursor feedCursor) {
            int i;
            int i2 = 0;
            if (feedCursor.rank_time != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, feedCursor.rank_time);
            } else {
                i = 0;
            }
            if (feedCursor.id != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, feedCursor.id);
            }
            return i + i2 + feedCursor.unknownFields().size();
        }

        /* renamed from: a */
        public FeedCursor decode(ProtoReader protoReader) throws IOException {
            C17122a aVar = new C17122a();
            aVar.f43861a = 0L;
            aVar.f43862b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43861a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43862b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FeedCursor feedCursor) throws IOException {
            if (feedCursor.rank_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, feedCursor.rank_time);
            }
            if (feedCursor.id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, feedCursor.id);
            }
            protoWriter.writeBytes(feedCursor.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.FeedCursor$a */
    public static final class C17122a extends Message.Builder<FeedCursor, C17122a> {

        /* renamed from: a */
        public Long f43861a;

        /* renamed from: b */
        public Long f43862b;

        /* renamed from: a */
        public FeedCursor build() {
            return new FeedCursor(this.f43861a, this.f43862b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17122a newBuilder() {
        C17122a aVar = new C17122a();
        aVar.f43861a = this.rank_time;
        aVar.f43862b = this.id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "FeedCursor");
        StringBuilder sb = new StringBuilder();
        if (this.rank_time != null) {
            sb.append(", rank_time=");
            sb.append(this.rank_time);
        }
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        StringBuilder replace = sb.replace(0, 2, "FeedCursor{");
        replace.append('}');
        return replace.toString();
    }

    public FeedCursor(Long l, Long l2) {
        this(l, l2, ByteString.EMPTY);
    }

    public FeedCursor(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.rank_time = l;
        this.id = l2;
    }
}
