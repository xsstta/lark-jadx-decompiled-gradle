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

public final class PushFeedFilterSettings extends Message<PushFeedFilterSettings, C17206a> {
    public static final ProtoAdapter<PushFeedFilterSettings> ADAPTER = new C17207b();
    public static final Boolean DEFAULT_FILTER_ENABLE = false;
    public static final Boolean DEFAULT_SHOW_AT_ALL_IN_AT_FILTER = false;
    public static final Boolean DEFAULT_SHOW_MUTE = false;
    public static final Long DEFAULT_VERSION = 0L;
    private static final long serialVersionUID = 0;
    public final Boolean filter_enable;
    public final Boolean show_at_all_in_at_filter;
    public final Boolean show_mute;
    public final List<FeedFilterInfo> used_filter_infos;
    public final Long version;

    /* renamed from: com.bytedance.lark.pb.feed.v1.PushFeedFilterSettings$b */
    private static final class C17207b extends ProtoAdapter<PushFeedFilterSettings> {
        C17207b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushFeedFilterSettings.class);
        }

        /* renamed from: a */
        public int encodedSize(PushFeedFilterSettings pushFeedFilterSettings) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (pushFeedFilterSettings.filter_enable != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, pushFeedFilterSettings.filter_enable);
            } else {
                i = 0;
            }
            if (pushFeedFilterSettings.version != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, pushFeedFilterSettings.version);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag = i + i2 + FeedFilterInfo.ADAPTER.asRepeated().encodedSizeWithTag(3, pushFeedFilterSettings.used_filter_infos);
            if (pushFeedFilterSettings.show_mute != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, pushFeedFilterSettings.show_mute);
            } else {
                i3 = 0;
            }
            int i5 = encodedSizeWithTag + i3;
            if (pushFeedFilterSettings.show_at_all_in_at_filter != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(5, pushFeedFilterSettings.show_at_all_in_at_filter);
            }
            return i5 + i4 + pushFeedFilterSettings.unknownFields().size();
        }

        /* renamed from: a */
        public PushFeedFilterSettings decode(ProtoReader protoReader) throws IOException {
            C17206a aVar = new C17206a();
            aVar.f43995a = false;
            aVar.f43996b = 0L;
            aVar.f43998d = false;
            aVar.f43999e = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43995a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43996b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f43997c.add(FeedFilterInfo.ADAPTER.decode(protoReader));
                } else if (nextTag == 4) {
                    aVar.f43998d = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43999e = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushFeedFilterSettings pushFeedFilterSettings) throws IOException {
            if (pushFeedFilterSettings.filter_enable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, pushFeedFilterSettings.filter_enable);
            }
            if (pushFeedFilterSettings.version != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, pushFeedFilterSettings.version);
            }
            FeedFilterInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, pushFeedFilterSettings.used_filter_infos);
            if (pushFeedFilterSettings.show_mute != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, pushFeedFilterSettings.show_mute);
            }
            if (pushFeedFilterSettings.show_at_all_in_at_filter != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, pushFeedFilterSettings.show_at_all_in_at_filter);
            }
            protoWriter.writeBytes(pushFeedFilterSettings.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.PushFeedFilterSettings$a */
    public static final class C17206a extends Message.Builder<PushFeedFilterSettings, C17206a> {

        /* renamed from: a */
        public Boolean f43995a;

        /* renamed from: b */
        public Long f43996b;

        /* renamed from: c */
        public List<FeedFilterInfo> f43997c = Internal.newMutableList();

        /* renamed from: d */
        public Boolean f43998d;

        /* renamed from: e */
        public Boolean f43999e;

        /* renamed from: a */
        public PushFeedFilterSettings build() {
            return new PushFeedFilterSettings(this.f43995a, this.f43996b, this.f43997c, this.f43998d, this.f43999e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17206a newBuilder() {
        C17206a aVar = new C17206a();
        aVar.f43995a = this.filter_enable;
        aVar.f43996b = this.version;
        aVar.f43997c = Internal.copyOf("used_filter_infos", this.used_filter_infos);
        aVar.f43998d = this.show_mute;
        aVar.f43999e = this.show_at_all_in_at_filter;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "PushFeedFilterSettings");
        StringBuilder sb = new StringBuilder();
        if (this.filter_enable != null) {
            sb.append(", filter_enable=");
            sb.append(this.filter_enable);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (!this.used_filter_infos.isEmpty()) {
            sb.append(", used_filter_infos=");
            sb.append(this.used_filter_infos);
        }
        if (this.show_mute != null) {
            sb.append(", show_mute=");
            sb.append(this.show_mute);
        }
        if (this.show_at_all_in_at_filter != null) {
            sb.append(", show_at_all_in_at_filter=");
            sb.append(this.show_at_all_in_at_filter);
        }
        StringBuilder replace = sb.replace(0, 2, "PushFeedFilterSettings{");
        replace.append('}');
        return replace.toString();
    }

    public PushFeedFilterSettings(Boolean bool, Long l, List<FeedFilterInfo> list, Boolean bool2, Boolean bool3) {
        this(bool, l, list, bool2, bool3, ByteString.EMPTY);
    }

    public PushFeedFilterSettings(Boolean bool, Long l, List<FeedFilterInfo> list, Boolean bool2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.filter_enable = bool;
        this.version = l;
        this.used_filter_infos = Internal.immutableCopyOf("used_filter_infos", list);
        this.show_mute = bool2;
        this.show_at_all_in_at_filter = bool3;
    }
}
