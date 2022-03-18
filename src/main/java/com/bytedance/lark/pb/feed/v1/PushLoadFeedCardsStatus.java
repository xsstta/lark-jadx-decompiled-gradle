package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.FeedCard;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class PushLoadFeedCardsStatus extends Message<PushLoadFeedCardsStatus, C17210a> {
    public static final ProtoAdapter<PushLoadFeedCardsStatus> ADAPTER = new C17211b();
    public static final FeedCard.FeedType DEFAULT_FEED_TYPE = FeedCard.FeedType.UNKNOWN;
    public static final Status DEFAULT_STATUS = Status.START;
    private static final long serialVersionUID = 0;
    public final FeedCard.FeedType feed_type;
    public final Status status;

    public enum Status implements WireEnum {
        START(0),
        FINISHED(1);
        
        public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Status fromValue(int i) {
            if (i == 0) {
                return START;
            }
            if (i != 1) {
                return null;
            }
            return FINISHED;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.PushLoadFeedCardsStatus$b */
    private static final class C17211b extends ProtoAdapter<PushLoadFeedCardsStatus> {
        C17211b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushLoadFeedCardsStatus.class);
        }

        /* renamed from: a */
        public int encodedSize(PushLoadFeedCardsStatus pushLoadFeedCardsStatus) {
            int i;
            int i2 = 0;
            if (pushLoadFeedCardsStatus.status != null) {
                i = Status.ADAPTER.encodedSizeWithTag(1, pushLoadFeedCardsStatus.status);
            } else {
                i = 0;
            }
            if (pushLoadFeedCardsStatus.feed_type != null) {
                i2 = FeedCard.FeedType.ADAPTER.encodedSizeWithTag(2, pushLoadFeedCardsStatus.feed_type);
            }
            return i + i2 + pushLoadFeedCardsStatus.unknownFields().size();
        }

        /* renamed from: a */
        public PushLoadFeedCardsStatus decode(ProtoReader protoReader) throws IOException {
            C17210a aVar = new C17210a();
            aVar.f44013a = Status.START;
            aVar.f44014b = FeedCard.FeedType.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f44013a = Status.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f44014b = FeedCard.FeedType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushLoadFeedCardsStatus pushLoadFeedCardsStatus) throws IOException {
            if (pushLoadFeedCardsStatus.status != null) {
                Status.ADAPTER.encodeWithTag(protoWriter, 1, pushLoadFeedCardsStatus.status);
            }
            if (pushLoadFeedCardsStatus.feed_type != null) {
                FeedCard.FeedType.ADAPTER.encodeWithTag(protoWriter, 2, pushLoadFeedCardsStatus.feed_type);
            }
            protoWriter.writeBytes(pushLoadFeedCardsStatus.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.PushLoadFeedCardsStatus$a */
    public static final class C17210a extends Message.Builder<PushLoadFeedCardsStatus, C17210a> {

        /* renamed from: a */
        public Status f44013a;

        /* renamed from: b */
        public FeedCard.FeedType f44014b;

        /* renamed from: a */
        public PushLoadFeedCardsStatus build() {
            return new PushLoadFeedCardsStatus(this.f44013a, this.f44014b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17210a newBuilder() {
        C17210a aVar = new C17210a();
        aVar.f44013a = this.status;
        aVar.f44014b = this.feed_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "PushLoadFeedCardsStatus");
        StringBuilder sb = new StringBuilder();
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.feed_type != null) {
            sb.append(", feed_type=");
            sb.append(this.feed_type);
        }
        StringBuilder replace = sb.replace(0, 2, "PushLoadFeedCardsStatus{");
        replace.append('}');
        return replace.toString();
    }

    public PushLoadFeedCardsStatus(Status status2, FeedCard.FeedType feedType) {
        this(status2, feedType, ByteString.EMPTY);
    }

    public PushLoadFeedCardsStatus(Status status2, FeedCard.FeedType feedType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status = status2;
        this.feed_type = feedType;
    }
}
