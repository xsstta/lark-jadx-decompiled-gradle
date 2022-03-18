package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.FeedCard;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class FeedEntityPreview extends Message<FeedEntityPreview, C17124a> {
    public static final ProtoAdapter<FeedEntityPreview> ADAPTER = new C17125b();
    public static final FeedCard.FeedType DEFAULT_FEED_TYPE = FeedCard.FeedType.UNKNOWN;
    public static final Boolean DEFAULT_IS_DELAYED = false;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final BoxData box_data;
    public final ChatData chat_data;
    public final DocData doc_data;
    public final String feed_id;
    public final FeedCard.FeedType feed_type;
    public final Boolean is_delayed;
    public final OpenAppData open_app_data;
    public final String parent_card_id;
    public final FeedRecommendation recommendation;
    public final SubscriptionsData subscriptions_data;
    public final ThreadData thread_data;
    public final Long update_time;

    /* renamed from: com.bytedance.lark.pb.feed.v1.FeedEntityPreview$b */
    private static final class C17125b extends ProtoAdapter<FeedEntityPreview> {
        C17125b() {
            super(FieldEncoding.LENGTH_DELIMITED, FeedEntityPreview.class);
        }

        /* renamed from: a */
        public int encodedSize(FeedEntityPreview feedEntityPreview) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, feedEntityPreview.feed_id);
            int i10 = 0;
            if (feedEntityPreview.feed_type != null) {
                i = FeedCard.FeedType.ADAPTER.encodedSizeWithTag(2, feedEntityPreview.feed_type);
            } else {
                i = 0;
            }
            int i11 = encodedSizeWithTag + i;
            if (feedEntityPreview.is_delayed != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, feedEntityPreview.is_delayed);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag2 = i11 + i2 + ProtoAdapter.INT64.encodedSizeWithTag(4, feedEntityPreview.update_time);
            if (feedEntityPreview.parent_card_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(5, feedEntityPreview.parent_card_id);
            } else {
                i3 = 0;
            }
            int i12 = encodedSizeWithTag2 + i3;
            if (feedEntityPreview.recommendation != null) {
                i4 = FeedRecommendation.ADAPTER.encodedSizeWithTag(6, feedEntityPreview.recommendation);
            } else {
                i4 = 0;
            }
            int i13 = i12 + i4;
            if (feedEntityPreview.chat_data != null) {
                i5 = ChatData.ADAPTER.encodedSizeWithTag(7, feedEntityPreview.chat_data);
            } else {
                i5 = 0;
            }
            int i14 = i13 + i5;
            if (feedEntityPreview.doc_data != null) {
                i6 = DocData.ADAPTER.encodedSizeWithTag(8, feedEntityPreview.doc_data);
            } else {
                i6 = 0;
            }
            int i15 = i14 + i6;
            if (feedEntityPreview.thread_data != null) {
                i7 = ThreadData.ADAPTER.encodedSizeWithTag(9, feedEntityPreview.thread_data);
            } else {
                i7 = 0;
            }
            int i16 = i15 + i7;
            if (feedEntityPreview.open_app_data != null) {
                i8 = OpenAppData.ADAPTER.encodedSizeWithTag(11, feedEntityPreview.open_app_data);
            } else {
                i8 = 0;
            }
            int i17 = i16 + i8;
            if (feedEntityPreview.box_data != null) {
                i9 = BoxData.ADAPTER.encodedSizeWithTag(12, feedEntityPreview.box_data);
            } else {
                i9 = 0;
            }
            int i18 = i17 + i9;
            if (feedEntityPreview.subscriptions_data != null) {
                i10 = SubscriptionsData.ADAPTER.encodedSizeWithTag(13, feedEntityPreview.subscriptions_data);
            }
            return i18 + i10 + feedEntityPreview.unknownFields().size();
        }

        /* renamed from: a */
        public FeedEntityPreview decode(ProtoReader protoReader) throws IOException {
            C17124a aVar = new C17124a();
            aVar.f43863a = "";
            aVar.f43864b = FeedCard.FeedType.UNKNOWN;
            aVar.f43865c = false;
            aVar.f43866d = 0L;
            aVar.f43867e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f43863a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f43864b = FeedCard.FeedType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f43865c = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            aVar.f43866d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            aVar.f43867e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f43868f = FeedRecommendation.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.mo60351a(ChatData.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            aVar.mo60352a(DocData.ADAPTER.decode(protoReader));
                            break;
                        case 9:
                            aVar.mo60355a(ThreadData.ADAPTER.decode(protoReader));
                            break;
                        case 10:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 11:
                            aVar.mo60353a(OpenAppData.ADAPTER.decode(protoReader));
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.mo60350a(BoxData.ADAPTER.decode(protoReader));
                            break;
                        case 13:
                            aVar.mo60354a(SubscriptionsData.ADAPTER.decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FeedEntityPreview feedEntityPreview) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, feedEntityPreview.feed_id);
            if (feedEntityPreview.feed_type != null) {
                FeedCard.FeedType.ADAPTER.encodeWithTag(protoWriter, 2, feedEntityPreview.feed_type);
            }
            if (feedEntityPreview.is_delayed != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, feedEntityPreview.is_delayed);
            }
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, feedEntityPreview.update_time);
            if (feedEntityPreview.parent_card_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, feedEntityPreview.parent_card_id);
            }
            if (feedEntityPreview.recommendation != null) {
                FeedRecommendation.ADAPTER.encodeWithTag(protoWriter, 6, feedEntityPreview.recommendation);
            }
            if (feedEntityPreview.chat_data != null) {
                ChatData.ADAPTER.encodeWithTag(protoWriter, 7, feedEntityPreview.chat_data);
            }
            if (feedEntityPreview.doc_data != null) {
                DocData.ADAPTER.encodeWithTag(protoWriter, 8, feedEntityPreview.doc_data);
            }
            if (feedEntityPreview.thread_data != null) {
                ThreadData.ADAPTER.encodeWithTag(protoWriter, 9, feedEntityPreview.thread_data);
            }
            if (feedEntityPreview.open_app_data != null) {
                OpenAppData.ADAPTER.encodeWithTag(protoWriter, 11, feedEntityPreview.open_app_data);
            }
            if (feedEntityPreview.box_data != null) {
                BoxData.ADAPTER.encodeWithTag(protoWriter, 12, feedEntityPreview.box_data);
            }
            if (feedEntityPreview.subscriptions_data != null) {
                SubscriptionsData.ADAPTER.encodeWithTag(protoWriter, 13, feedEntityPreview.subscriptions_data);
            }
            protoWriter.writeBytes(feedEntityPreview.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17124a newBuilder() {
        C17124a aVar = new C17124a();
        aVar.f43863a = this.feed_id;
        aVar.f43864b = this.feed_type;
        aVar.f43865c = this.is_delayed;
        aVar.f43866d = this.update_time;
        aVar.f43867e = this.parent_card_id;
        aVar.f43868f = this.recommendation;
        aVar.f43869g = this.chat_data;
        aVar.f43870h = this.doc_data;
        aVar.f43871i = this.thread_data;
        aVar.f43872j = this.open_app_data;
        aVar.f43873k = this.box_data;
        aVar.f43874l = this.subscriptions_data;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "FeedEntityPreview");
        StringBuilder sb = new StringBuilder();
        sb.append(", feed_id=");
        sb.append(this.feed_id);
        if (this.feed_type != null) {
            sb.append(", feed_type=");
            sb.append(this.feed_type);
        }
        if (this.is_delayed != null) {
            sb.append(", is_delayed=");
            sb.append(this.is_delayed);
        }
        sb.append(", update_time=");
        sb.append(this.update_time);
        if (this.parent_card_id != null) {
            sb.append(", parent_card_id=");
            sb.append(this.parent_card_id);
        }
        if (this.recommendation != null) {
            sb.append(", recommendation=");
            sb.append(this.recommendation);
        }
        if (this.chat_data != null) {
            sb.append(", chat_data=");
            sb.append(this.chat_data);
        }
        if (this.doc_data != null) {
            sb.append(", doc_data=");
            sb.append(this.doc_data);
        }
        if (this.thread_data != null) {
            sb.append(", thread_data=");
            sb.append(this.thread_data);
        }
        if (this.open_app_data != null) {
            sb.append(", open_app_data=");
            sb.append(this.open_app_data);
        }
        if (this.box_data != null) {
            sb.append(", box_data=");
            sb.append(this.box_data);
        }
        if (this.subscriptions_data != null) {
            sb.append(", subscriptions_data=");
            sb.append(this.subscriptions_data);
        }
        StringBuilder replace = sb.replace(0, 2, "FeedEntityPreview{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.FeedEntityPreview$a */
    public static final class C17124a extends Message.Builder<FeedEntityPreview, C17124a> {

        /* renamed from: a */
        public String f43863a;

        /* renamed from: b */
        public FeedCard.FeedType f43864b;

        /* renamed from: c */
        public Boolean f43865c;

        /* renamed from: d */
        public Long f43866d;

        /* renamed from: e */
        public String f43867e;

        /* renamed from: f */
        public FeedRecommendation f43868f;

        /* renamed from: g */
        public ChatData f43869g;

        /* renamed from: h */
        public DocData f43870h;

        /* renamed from: i */
        public ThreadData f43871i;

        /* renamed from: j */
        public OpenAppData f43872j;

        /* renamed from: k */
        public BoxData f43873k;

        /* renamed from: l */
        public SubscriptionsData f43874l;

        /* renamed from: a */
        public FeedEntityPreview build() {
            Long l;
            String str = this.f43863a;
            if (str != null && (l = this.f43866d) != null) {
                return new FeedEntityPreview(str, this.f43864b, this.f43865c, l, this.f43867e, this.f43868f, this.f43869g, this.f43870h, this.f43871i, this.f43872j, this.f43873k, this.f43874l, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "feed_id", this.f43866d, "update_time");
        }

        /* renamed from: a */
        public C17124a mo60350a(BoxData boxData) {
            this.f43873k = boxData;
            this.f43869g = null;
            this.f43870h = null;
            this.f43871i = null;
            this.f43872j = null;
            this.f43874l = null;
            return this;
        }

        /* renamed from: a */
        public C17124a mo60351a(ChatData chatData) {
            this.f43869g = chatData;
            this.f43870h = null;
            this.f43871i = null;
            this.f43872j = null;
            this.f43873k = null;
            this.f43874l = null;
            return this;
        }

        /* renamed from: a */
        public C17124a mo60352a(DocData docData) {
            this.f43870h = docData;
            this.f43869g = null;
            this.f43871i = null;
            this.f43872j = null;
            this.f43873k = null;
            this.f43874l = null;
            return this;
        }

        /* renamed from: a */
        public C17124a mo60353a(OpenAppData openAppData) {
            this.f43872j = openAppData;
            this.f43869g = null;
            this.f43870h = null;
            this.f43871i = null;
            this.f43873k = null;
            this.f43874l = null;
            return this;
        }

        /* renamed from: a */
        public C17124a mo60354a(SubscriptionsData subscriptionsData) {
            this.f43874l = subscriptionsData;
            this.f43869g = null;
            this.f43870h = null;
            this.f43871i = null;
            this.f43872j = null;
            this.f43873k = null;
            return this;
        }

        /* renamed from: a */
        public C17124a mo60355a(ThreadData threadData) {
            this.f43871i = threadData;
            this.f43869g = null;
            this.f43870h = null;
            this.f43872j = null;
            this.f43873k = null;
            this.f43874l = null;
            return this;
        }
    }

    public FeedEntityPreview(String str, FeedCard.FeedType feedType, Boolean bool, Long l, String str2, FeedRecommendation feedRecommendation, ChatData chatData, DocData docData, ThreadData threadData, OpenAppData openAppData, BoxData boxData, SubscriptionsData subscriptionsData) {
        this(str, feedType, bool, l, str2, feedRecommendation, chatData, docData, threadData, openAppData, boxData, subscriptionsData, ByteString.EMPTY);
    }

    public FeedEntityPreview(String str, FeedCard.FeedType feedType, Boolean bool, Long l, String str2, FeedRecommendation feedRecommendation, ChatData chatData, DocData docData, ThreadData threadData, OpenAppData openAppData, BoxData boxData, SubscriptionsData subscriptionsData, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(chatData, docData, threadData, openAppData, boxData, subscriptionsData) <= 1) {
            this.feed_id = str;
            this.feed_type = feedType;
            this.is_delayed = bool;
            this.update_time = l;
            this.parent_card_id = str2;
            this.recommendation = feedRecommendation;
            this.chat_data = chatData;
            this.doc_data = docData;
            this.thread_data = threadData;
            this.open_app_data = openAppData;
            this.box_data = boxData;
            this.subscriptions_data = subscriptionsData;
            return;
        }
        throw new IllegalArgumentException("at most one of chat_data, doc_data, thread_data, open_app_data, box_data, subscriptions_data may be non-null");
    }
}
