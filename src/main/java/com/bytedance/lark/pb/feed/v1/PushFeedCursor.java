package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.FeedCard;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PushFeedCursor extends Message<PushFeedCursor, C17202a> {
    public static final ProtoAdapter<PushFeedCursor> ADAPTER = new C17203b();
    public static final Integer DEFAULT_COUNT = 0;
    public static final FeedCard.FeedType DEFAULT_FEED_TYPE = FeedCard.FeedType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final Cursor cursor;
    public final String feed_card_id;
    public final FeedCard.FeedType feed_type;

    /* renamed from: com.bytedance.lark.pb.feed.v1.PushFeedCursor$b */
    private static final class C17203b extends ProtoAdapter<PushFeedCursor> {
        C17203b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushFeedCursor.class);
        }

        /* renamed from: a */
        public int encodedSize(PushFeedCursor pushFeedCursor) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (pushFeedCursor.cursor != null) {
                i = Cursor.ADAPTER.encodedSizeWithTag(1, pushFeedCursor.cursor);
            } else {
                i = 0;
            }
            if (pushFeedCursor.count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, pushFeedCursor.count);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (pushFeedCursor.feed_card_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, pushFeedCursor.feed_card_id);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (pushFeedCursor.feed_type != null) {
                i4 = FeedCard.FeedType.ADAPTER.encodedSizeWithTag(4, pushFeedCursor.feed_type);
            }
            return i6 + i4 + pushFeedCursor.unknownFields().size();
        }

        /* renamed from: a */
        public PushFeedCursor decode(ProtoReader protoReader) throws IOException {
            C17202a aVar = new C17202a();
            aVar.f43987b = 0;
            aVar.f43988c = "";
            aVar.f43989d = FeedCard.FeedType.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43986a = Cursor.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43987b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f43988c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f43989d = FeedCard.FeedType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushFeedCursor pushFeedCursor) throws IOException {
            if (pushFeedCursor.cursor != null) {
                Cursor.ADAPTER.encodeWithTag(protoWriter, 1, pushFeedCursor.cursor);
            }
            if (pushFeedCursor.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, pushFeedCursor.count);
            }
            if (pushFeedCursor.feed_card_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, pushFeedCursor.feed_card_id);
            }
            if (pushFeedCursor.feed_type != null) {
                FeedCard.FeedType.ADAPTER.encodeWithTag(protoWriter, 4, pushFeedCursor.feed_type);
            }
            protoWriter.writeBytes(pushFeedCursor.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.PushFeedCursor$a */
    public static final class C17202a extends Message.Builder<PushFeedCursor, C17202a> {

        /* renamed from: a */
        public Cursor f43986a;

        /* renamed from: b */
        public Integer f43987b;

        /* renamed from: c */
        public String f43988c;

        /* renamed from: d */
        public FeedCard.FeedType f43989d;

        /* renamed from: a */
        public PushFeedCursor build() {
            return new PushFeedCursor(this.f43986a, this.f43987b, this.f43988c, this.f43989d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17202a newBuilder() {
        C17202a aVar = new C17202a();
        aVar.f43986a = this.cursor;
        aVar.f43987b = this.count;
        aVar.f43988c = this.feed_card_id;
        aVar.f43989d = this.feed_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "PushFeedCursor");
        StringBuilder sb = new StringBuilder();
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.feed_card_id != null) {
            sb.append(", feed_card_id=");
            sb.append(this.feed_card_id);
        }
        if (this.feed_type != null) {
            sb.append(", feed_type=");
            sb.append(this.feed_type);
        }
        StringBuilder replace = sb.replace(0, 2, "PushFeedCursor{");
        replace.append('}');
        return replace.toString();
    }

    public PushFeedCursor(Cursor cursor2, Integer num, String str, FeedCard.FeedType feedType) {
        this(cursor2, num, str, feedType, ByteString.EMPTY);
    }

    public PushFeedCursor(Cursor cursor2, Integer num, String str, FeedCard.FeedType feedType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cursor = cursor2;
        this.count = num;
        this.feed_card_id = str;
        this.feed_type = feedType;
    }
}
