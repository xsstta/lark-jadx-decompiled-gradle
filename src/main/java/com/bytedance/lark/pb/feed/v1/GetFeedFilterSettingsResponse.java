package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetFeedFilterSettingsResponse extends Message<GetFeedFilterSettingsResponse, C17166a> {
    public static final ProtoAdapter<GetFeedFilterSettingsResponse> ADAPTER = new C17167b();
    public static final Boolean DEFAULT_FILTER_ENABLE = false;
    public static final Boolean DEFAULT_SHOW_AT_ALL_IN_AT_FILTER = false;
    public static final Boolean DEFAULT_SHOW_MUTE = false;
    public static final Long DEFAULT_VERSION = 0L;
    private static final long serialVersionUID = 0;
    public final List<FeedFilter> all_filters;
    public final Boolean filter_enable;
    public final Boolean show_at_all_in_at_filter;
    public final Boolean show_mute;
    public final List<FeedFilter> used_filters;
    public final Long version;

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetFeedFilterSettingsResponse$b */
    private static final class C17167b extends ProtoAdapter<GetFeedFilterSettingsResponse> {
        C17167b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetFeedFilterSettingsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetFeedFilterSettingsResponse getFeedFilterSettingsResponse) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (getFeedFilterSettingsResponse.filter_enable != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, getFeedFilterSettingsResponse.filter_enable);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + FeedFilter.ADAPTER.asRepeated().encodedSizeWithTag(2, getFeedFilterSettingsResponse.used_filters) + FeedFilter.ADAPTER.asRepeated().encodedSizeWithTag(3, getFeedFilterSettingsResponse.all_filters);
            if (getFeedFilterSettingsResponse.version != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(4, getFeedFilterSettingsResponse.version);
            } else {
                i2 = 0;
            }
            int i5 = encodedSizeWithTag + i2;
            if (getFeedFilterSettingsResponse.show_mute != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(5, getFeedFilterSettingsResponse.show_mute);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (getFeedFilterSettingsResponse.show_at_all_in_at_filter != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(6, getFeedFilterSettingsResponse.show_at_all_in_at_filter);
            }
            return i6 + i4 + getFeedFilterSettingsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetFeedFilterSettingsResponse decode(ProtoReader protoReader) throws IOException {
            C17166a aVar = new C17166a();
            aVar.f43918a = false;
            aVar.f43921d = 0L;
            aVar.f43922e = false;
            aVar.f43923f = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f43918a = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            aVar.f43919b.add(FeedFilter.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            aVar.f43920c.add(FeedFilter.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            aVar.f43921d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            aVar.f43922e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f43923f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetFeedFilterSettingsResponse getFeedFilterSettingsResponse) throws IOException {
            if (getFeedFilterSettingsResponse.filter_enable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getFeedFilterSettingsResponse.filter_enable);
            }
            FeedFilter.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getFeedFilterSettingsResponse.used_filters);
            FeedFilter.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, getFeedFilterSettingsResponse.all_filters);
            if (getFeedFilterSettingsResponse.version != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, getFeedFilterSettingsResponse.version);
            }
            if (getFeedFilterSettingsResponse.show_mute != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, getFeedFilterSettingsResponse.show_mute);
            }
            if (getFeedFilterSettingsResponse.show_at_all_in_at_filter != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, getFeedFilterSettingsResponse.show_at_all_in_at_filter);
            }
            protoWriter.writeBytes(getFeedFilterSettingsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetFeedFilterSettingsResponse$a */
    public static final class C17166a extends Message.Builder<GetFeedFilterSettingsResponse, C17166a> {

        /* renamed from: a */
        public Boolean f43918a;

        /* renamed from: b */
        public List<FeedFilter> f43919b = Internal.newMutableList();

        /* renamed from: c */
        public List<FeedFilter> f43920c = Internal.newMutableList();

        /* renamed from: d */
        public Long f43921d;

        /* renamed from: e */
        public Boolean f43922e;

        /* renamed from: f */
        public Boolean f43923f;

        /* renamed from: a */
        public GetFeedFilterSettingsResponse build() {
            return new GetFeedFilterSettingsResponse(this.f43918a, this.f43919b, this.f43920c, this.f43921d, this.f43922e, this.f43923f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17166a newBuilder() {
        C17166a aVar = new C17166a();
        aVar.f43918a = this.filter_enable;
        aVar.f43919b = Internal.copyOf("used_filters", this.used_filters);
        aVar.f43920c = Internal.copyOf("all_filters", this.all_filters);
        aVar.f43921d = this.version;
        aVar.f43922e = this.show_mute;
        aVar.f43923f = this.show_at_all_in_at_filter;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "GetFeedFilterSettingsResponse");
        StringBuilder sb = new StringBuilder();
        if (this.filter_enable != null) {
            sb.append(", filter_enable=");
            sb.append(this.filter_enable);
        }
        if (!this.used_filters.isEmpty()) {
            sb.append(", used_filters=");
            sb.append(this.used_filters);
        }
        if (!this.all_filters.isEmpty()) {
            sb.append(", all_filters=");
            sb.append(this.all_filters);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (this.show_mute != null) {
            sb.append(", show_mute=");
            sb.append(this.show_mute);
        }
        if (this.show_at_all_in_at_filter != null) {
            sb.append(", show_at_all_in_at_filter=");
            sb.append(this.show_at_all_in_at_filter);
        }
        StringBuilder replace = sb.replace(0, 2, "GetFeedFilterSettingsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetFeedFilterSettingsResponse(Boolean bool, List<FeedFilter> list, List<FeedFilter> list2, Long l, Boolean bool2, Boolean bool3) {
        this(bool, list, list2, l, bool2, bool3, ByteString.EMPTY);
    }

    public GetFeedFilterSettingsResponse(Boolean bool, List<FeedFilter> list, List<FeedFilter> list2, Long l, Boolean bool2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.filter_enable = bool;
        this.used_filters = Internal.immutableCopyOf("used_filters", list);
        this.all_filters = Internal.immutableCopyOf("all_filters", list2);
        this.version = l;
        this.show_mute = bool2;
        this.show_at_all_in_at_filter = bool3;
    }
}
