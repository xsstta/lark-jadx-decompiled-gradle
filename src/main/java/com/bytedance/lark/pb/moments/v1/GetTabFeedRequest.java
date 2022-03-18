package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetTabFeedRequest extends Message<GetTabFeedRequest, C18392a> {
    public static final ProtoAdapter<GetTabFeedRequest> ADAPTER = new C18393b();
    public static final Integer DEFAULT_COUNT = 0;
    public static final FeedOrder DEFAULT_FEED_ORDER = FeedOrder.UNSPECIFIED;
    public static final Boolean DEFAULT_USE_LOCAL = false;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final FeedOrder feed_order;
    public final String page_token;
    public final String tab_id;
    public final Boolean use_local;

    /* renamed from: com.bytedance.lark.pb.moments.v1.GetTabFeedRequest$b */
    private static final class C18393b extends ProtoAdapter<GetTabFeedRequest> {
        C18393b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTabFeedRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTabFeedRequest getTabFeedRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (getTabFeedRequest.page_token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getTabFeedRequest.page_token);
            } else {
                i = 0;
            }
            if (getTabFeedRequest.count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, getTabFeedRequest.count);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (getTabFeedRequest.use_local != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, getTabFeedRequest.use_local);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (getTabFeedRequest.tab_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, getTabFeedRequest.tab_id);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (getTabFeedRequest.feed_order != null) {
                i5 = FeedOrder.ADAPTER.encodedSizeWithTag(5, getTabFeedRequest.feed_order);
            }
            return i8 + i5 + getTabFeedRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetTabFeedRequest decode(ProtoReader protoReader) throws IOException {
            C18392a aVar = new C18392a();
            aVar.f45769a = "";
            aVar.f45770b = 0;
            aVar.f45771c = false;
            aVar.f45772d = "";
            aVar.f45773e = FeedOrder.UNSPECIFIED;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45769a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45770b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f45771c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f45772d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f45773e = FeedOrder.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetTabFeedRequest getTabFeedRequest) throws IOException {
            if (getTabFeedRequest.page_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getTabFeedRequest.page_token);
            }
            if (getTabFeedRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getTabFeedRequest.count);
            }
            if (getTabFeedRequest.use_local != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getTabFeedRequest.use_local);
            }
            if (getTabFeedRequest.tab_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getTabFeedRequest.tab_id);
            }
            if (getTabFeedRequest.feed_order != null) {
                FeedOrder.ADAPTER.encodeWithTag(protoWriter, 5, getTabFeedRequest.feed_order);
            }
            protoWriter.writeBytes(getTabFeedRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.GetTabFeedRequest$a */
    public static final class C18392a extends Message.Builder<GetTabFeedRequest, C18392a> {

        /* renamed from: a */
        public String f45769a;

        /* renamed from: b */
        public Integer f45770b;

        /* renamed from: c */
        public Boolean f45771c;

        /* renamed from: d */
        public String f45772d;

        /* renamed from: e */
        public FeedOrder f45773e;

        /* renamed from: a */
        public GetTabFeedRequest build() {
            return new GetTabFeedRequest(this.f45769a, this.f45770b, this.f45771c, this.f45772d, this.f45773e, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18392a mo63600a(FeedOrder feedOrder) {
            this.f45773e = feedOrder;
            return this;
        }

        /* renamed from: b */
        public C18392a mo63605b(String str) {
            this.f45772d = str;
            return this;
        }

        /* renamed from: a */
        public C18392a mo63601a(Boolean bool) {
            this.f45771c = bool;
            return this;
        }

        /* renamed from: a */
        public C18392a mo63602a(Integer num) {
            this.f45770b = num;
            return this;
        }

        /* renamed from: a */
        public C18392a mo63603a(String str) {
            this.f45769a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18392a newBuilder() {
        C18392a aVar = new C18392a();
        aVar.f45769a = this.page_token;
        aVar.f45770b = this.count;
        aVar.f45771c = this.use_local;
        aVar.f45772d = this.tab_id;
        aVar.f45773e = this.feed_order;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "GetTabFeedRequest");
        StringBuilder sb = new StringBuilder();
        if (this.page_token != null) {
            sb.append(", page_token=");
            sb.append(this.page_token);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.use_local != null) {
            sb.append(", use_local=");
            sb.append(this.use_local);
        }
        if (this.tab_id != null) {
            sb.append(", tab_id=");
            sb.append(this.tab_id);
        }
        if (this.feed_order != null) {
            sb.append(", feed_order=");
            sb.append(this.feed_order);
        }
        StringBuilder replace = sb.replace(0, 2, "GetTabFeedRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetTabFeedRequest(String str, Integer num, Boolean bool, String str2, FeedOrder feedOrder) {
        this(str, num, bool, str2, feedOrder, ByteString.EMPTY);
    }

    public GetTabFeedRequest(String str, Integer num, Boolean bool, String str2, FeedOrder feedOrder, ByteString byteString) {
        super(ADAPTER, byteString);
        this.page_token = str;
        this.count = num;
        this.use_local = bool;
        this.tab_id = str2;
        this.feed_order = feedOrder;
    }
}
