package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class PushInboxCardsResponse extends Message<PushInboxCardsResponse, C17208a> {
    public static final ProtoAdapter<PushInboxCardsResponse> ADAPTER = new C17209b();
    public static final Integer DEFAULT_DELAYED_CHANNEL_COUNT = 0;
    public static final Integer DEFAULT_FILTERED_MUTE_UNREAD_COUNT = 0;
    public static final Integer DEFAULT_FILTERED_UNREAD_COUNT = 0;
    public static final Boolean DEFAULT_HAS_UNREAD_DOT = false;
    public static final Integer DEFAULT_MUTE_UNREAD_COUNT = 0;
    public static final Integer DEFAULT_NEW_BOX_COUNT = 0;
    public static final Integer DEFAULT_UNREAD_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final Integer delayed_channel_count;
    public final Integer filtered_mute_unread_count;
    public final Integer filtered_unread_count;
    public final Boolean has_unread_dot;
    public final Integer mute_unread_count;
    public final Integer new_box_count;
    public final List<CardPair> remove_previews;
    public final Integer unread_count;
    public final Map<String, FeedEntityPreview> update_entity_previews;
    public final List<FeedFilterInfo> update_filter_infos;
    public final Map<String, FeedFilterList> update_filter_list;

    /* renamed from: com.bytedance.lark.pb.feed.v1.PushInboxCardsResponse$b */
    private static final class C17209b extends ProtoAdapter<PushInboxCardsResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, FeedEntityPreview>> f44011a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, FeedEntityPreview.ADAPTER);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, FeedFilterList>> f44012b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, FeedFilterList.ADAPTER);

        C17209b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushInboxCardsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PushInboxCardsResponse pushInboxCardsResponse) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = 0;
            if (pushInboxCardsResponse.unread_count != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, pushInboxCardsResponse.unread_count);
            } else {
                i = 0;
            }
            if (pushInboxCardsResponse.has_unread_dot != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, pushInboxCardsResponse.has_unread_dot);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag = i + i2 + CardPair.ADAPTER.asRepeated().encodedSizeWithTag(7, pushInboxCardsResponse.remove_previews);
            if (pushInboxCardsResponse.filtered_unread_count != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(8, pushInboxCardsResponse.filtered_unread_count);
            } else {
                i3 = 0;
            }
            int i8 = encodedSizeWithTag + i3;
            if (pushInboxCardsResponse.delayed_channel_count != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(9, pushInboxCardsResponse.delayed_channel_count);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (pushInboxCardsResponse.mute_unread_count != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(10, pushInboxCardsResponse.mute_unread_count);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (pushInboxCardsResponse.filtered_mute_unread_count != null) {
                i6 = ProtoAdapter.INT32.encodedSizeWithTag(11, pushInboxCardsResponse.filtered_mute_unread_count);
            } else {
                i6 = 0;
            }
            int i11 = i10 + i6;
            if (pushInboxCardsResponse.new_box_count != null) {
                i7 = ProtoAdapter.INT32.encodedSizeWithTag(12, pushInboxCardsResponse.new_box_count);
            }
            return i11 + i7 + this.f44011a.encodedSizeWithTag(13, pushInboxCardsResponse.update_entity_previews) + this.f44012b.encodedSizeWithTag(14, pushInboxCardsResponse.update_filter_list) + FeedFilterInfo.ADAPTER.asRepeated().encodedSizeWithTag(15, pushInboxCardsResponse.update_filter_infos) + pushInboxCardsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PushInboxCardsResponse decode(ProtoReader protoReader) throws IOException {
            C17208a aVar = new C17208a();
            aVar.f44000a = 0;
            aVar.f44001b = false;
            aVar.f44003d = 0;
            aVar.f44004e = 0;
            aVar.f44005f = 0;
            aVar.f44006g = 0;
            aVar.f44007h = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 2) {
                    aVar.f44000a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    switch (nextTag) {
                        case 7:
                            aVar.f44002c.add(CardPair.ADAPTER.decode(protoReader));
                            continue;
                        case 8:
                            aVar.f44003d = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        case 9:
                            aVar.f44004e = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        case 10:
                            aVar.f44005f = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        case 11:
                            aVar.f44006g = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f44007h = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        case 13:
                            aVar.f44008i.putAll(this.f44011a.decode(protoReader));
                            continue;
                        case 14:
                            aVar.f44009j.putAll(this.f44012b.decode(protoReader));
                            continue;
                        case 15:
                            aVar.f44010k.add(FeedFilterInfo.ADAPTER.decode(protoReader));
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    aVar.f44001b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushInboxCardsResponse pushInboxCardsResponse) throws IOException {
            if (pushInboxCardsResponse.unread_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, pushInboxCardsResponse.unread_count);
            }
            if (pushInboxCardsResponse.has_unread_dot != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, pushInboxCardsResponse.has_unread_dot);
            }
            CardPair.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, pushInboxCardsResponse.remove_previews);
            if (pushInboxCardsResponse.filtered_unread_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, pushInboxCardsResponse.filtered_unread_count);
            }
            if (pushInboxCardsResponse.delayed_channel_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, pushInboxCardsResponse.delayed_channel_count);
            }
            if (pushInboxCardsResponse.mute_unread_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, pushInboxCardsResponse.mute_unread_count);
            }
            if (pushInboxCardsResponse.filtered_mute_unread_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, pushInboxCardsResponse.filtered_mute_unread_count);
            }
            if (pushInboxCardsResponse.new_box_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 12, pushInboxCardsResponse.new_box_count);
            }
            this.f44011a.encodeWithTag(protoWriter, 13, pushInboxCardsResponse.update_entity_previews);
            this.f44012b.encodeWithTag(protoWriter, 14, pushInboxCardsResponse.update_filter_list);
            FeedFilterInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 15, pushInboxCardsResponse.update_filter_infos);
            protoWriter.writeBytes(pushInboxCardsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.PushInboxCardsResponse$a */
    public static final class C17208a extends Message.Builder<PushInboxCardsResponse, C17208a> {

        /* renamed from: a */
        public Integer f44000a;

        /* renamed from: b */
        public Boolean f44001b;

        /* renamed from: c */
        public List<CardPair> f44002c = Internal.newMutableList();

        /* renamed from: d */
        public Integer f44003d;

        /* renamed from: e */
        public Integer f44004e;

        /* renamed from: f */
        public Integer f44005f;

        /* renamed from: g */
        public Integer f44006g;

        /* renamed from: h */
        public Integer f44007h;

        /* renamed from: i */
        public Map<String, FeedEntityPreview> f44008i = Internal.newMutableMap();

        /* renamed from: j */
        public Map<String, FeedFilterList> f44009j = Internal.newMutableMap();

        /* renamed from: k */
        public List<FeedFilterInfo> f44010k = Internal.newMutableList();

        /* renamed from: a */
        public PushInboxCardsResponse build() {
            return new PushInboxCardsResponse(this.f44000a, this.f44001b, this.f44002c, this.f44003d, this.f44004e, this.f44005f, this.f44006g, this.f44007h, this.f44008i, this.f44009j, this.f44010k, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17208a newBuilder() {
        C17208a aVar = new C17208a();
        aVar.f44000a = this.unread_count;
        aVar.f44001b = this.has_unread_dot;
        aVar.f44002c = Internal.copyOf("remove_previews", this.remove_previews);
        aVar.f44003d = this.filtered_unread_count;
        aVar.f44004e = this.delayed_channel_count;
        aVar.f44005f = this.mute_unread_count;
        aVar.f44006g = this.filtered_mute_unread_count;
        aVar.f44007h = this.new_box_count;
        aVar.f44008i = Internal.copyOf("update_entity_previews", this.update_entity_previews);
        aVar.f44009j = Internal.copyOf("update_filter_list", this.update_filter_list);
        aVar.f44010k = Internal.copyOf("update_filter_infos", this.update_filter_infos);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "PushInboxCardsResponse");
        StringBuilder sb = new StringBuilder();
        if (this.unread_count != null) {
            sb.append(", unread_count=");
            sb.append(this.unread_count);
        }
        if (this.has_unread_dot != null) {
            sb.append(", has_unread_dot=");
            sb.append(this.has_unread_dot);
        }
        if (!this.remove_previews.isEmpty()) {
            sb.append(", remove_previews=");
            sb.append(this.remove_previews);
        }
        if (this.filtered_unread_count != null) {
            sb.append(", filtered_unread_count=");
            sb.append(this.filtered_unread_count);
        }
        if (this.delayed_channel_count != null) {
            sb.append(", delayed_channel_count=");
            sb.append(this.delayed_channel_count);
        }
        if (this.mute_unread_count != null) {
            sb.append(", mute_unread_count=");
            sb.append(this.mute_unread_count);
        }
        if (this.filtered_mute_unread_count != null) {
            sb.append(", filtered_mute_unread_count=");
            sb.append(this.filtered_mute_unread_count);
        }
        if (this.new_box_count != null) {
            sb.append(", new_box_count=");
            sb.append(this.new_box_count);
        }
        if (!this.update_entity_previews.isEmpty()) {
            sb.append(", update_entity_previews=");
            sb.append(this.update_entity_previews);
        }
        if (!this.update_filter_list.isEmpty()) {
            sb.append(", update_filter_list=");
            sb.append(this.update_filter_list);
        }
        if (!this.update_filter_infos.isEmpty()) {
            sb.append(", update_filter_infos=");
            sb.append(this.update_filter_infos);
        }
        StringBuilder replace = sb.replace(0, 2, "PushInboxCardsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PushInboxCardsResponse(Integer num, Boolean bool, List<CardPair> list, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Map<String, FeedEntityPreview> map, Map<String, FeedFilterList> map2, List<FeedFilterInfo> list2) {
        this(num, bool, list, num2, num3, num4, num5, num6, map, map2, list2, ByteString.EMPTY);
    }

    public PushInboxCardsResponse(Integer num, Boolean bool, List<CardPair> list, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Map<String, FeedEntityPreview> map, Map<String, FeedFilterList> map2, List<FeedFilterInfo> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.unread_count = num;
        this.has_unread_dot = bool;
        this.remove_previews = Internal.immutableCopyOf("remove_previews", list);
        this.filtered_unread_count = num2;
        this.delayed_channel_count = num3;
        this.mute_unread_count = num4;
        this.filtered_mute_unread_count = num5;
        this.new_box_count = num6;
        this.update_entity_previews = Internal.immutableCopyOf("update_entity_previews", map);
        this.update_filter_list = Internal.immutableCopyOf("update_filter_list", map2);
        this.update_filter_infos = Internal.immutableCopyOf("update_filter_infos", list2);
    }
}
