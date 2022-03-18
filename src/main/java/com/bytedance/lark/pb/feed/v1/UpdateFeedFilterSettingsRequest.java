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

public final class UpdateFeedFilterSettingsRequest extends Message<UpdateFeedFilterSettingsRequest, C17242a> {
    public static final ProtoAdapter<UpdateFeedFilterSettingsRequest> ADAPTER = new C17243b();
    public static final Boolean DEFAULT_FILTER_ENABLE = false;
    public static final Boolean DEFAULT_SHOW_AT_ALL_IN_AT_FILTER = false;
    public static final Boolean DEFAULT_SHOW_MUTE = false;
    private static final long serialVersionUID = 0;
    public final Boolean filter_enable;
    public final Boolean show_at_all_in_at_filter;
    public final Boolean show_mute;
    public final List<FeedFilter> used_filters;

    /* renamed from: com.bytedance.lark.pb.feed.v1.UpdateFeedFilterSettingsRequest$b */
    private static final class C17243b extends ProtoAdapter<UpdateFeedFilterSettingsRequest> {
        C17243b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateFeedFilterSettingsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateFeedFilterSettingsRequest updateFeedFilterSettingsRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (updateFeedFilterSettingsRequest.filter_enable != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, updateFeedFilterSettingsRequest.filter_enable);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + FeedFilter.ADAPTER.asRepeated().encodedSizeWithTag(2, updateFeedFilterSettingsRequest.used_filters);
            if (updateFeedFilterSettingsRequest.show_mute != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, updateFeedFilterSettingsRequest.show_mute);
            } else {
                i2 = 0;
            }
            int i4 = encodedSizeWithTag + i2;
            if (updateFeedFilterSettingsRequest.show_at_all_in_at_filter != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, updateFeedFilterSettingsRequest.show_at_all_in_at_filter);
            }
            return i4 + i3 + updateFeedFilterSettingsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateFeedFilterSettingsRequest decode(ProtoReader protoReader) throws IOException {
            C17242a aVar = new C17242a();
            aVar.f44067a = false;
            aVar.f44069c = false;
            aVar.f44070d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44067a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44068b.add(FeedFilter.ADAPTER.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f44069c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44070d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateFeedFilterSettingsRequest updateFeedFilterSettingsRequest) throws IOException {
            if (updateFeedFilterSettingsRequest.filter_enable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, updateFeedFilterSettingsRequest.filter_enable);
            }
            FeedFilter.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, updateFeedFilterSettingsRequest.used_filters);
            if (updateFeedFilterSettingsRequest.show_mute != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, updateFeedFilterSettingsRequest.show_mute);
            }
            if (updateFeedFilterSettingsRequest.show_at_all_in_at_filter != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, updateFeedFilterSettingsRequest.show_at_all_in_at_filter);
            }
            protoWriter.writeBytes(updateFeedFilterSettingsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.UpdateFeedFilterSettingsRequest$a */
    public static final class C17242a extends Message.Builder<UpdateFeedFilterSettingsRequest, C17242a> {

        /* renamed from: a */
        public Boolean f44067a;

        /* renamed from: b */
        public List<FeedFilter> f44068b = Internal.newMutableList();

        /* renamed from: c */
        public Boolean f44069c;

        /* renamed from: d */
        public Boolean f44070d;

        /* renamed from: a */
        public UpdateFeedFilterSettingsRequest build() {
            return new UpdateFeedFilterSettingsRequest(this.f44067a, this.f44068b, this.f44069c, this.f44070d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17242a mo60626a(Boolean bool) {
            this.f44067a = bool;
            return this;
        }

        /* renamed from: b */
        public C17242a mo60629b(Boolean bool) {
            this.f44069c = bool;
            return this;
        }

        /* renamed from: c */
        public C17242a mo60630c(Boolean bool) {
            this.f44070d = bool;
            return this;
        }

        /* renamed from: a */
        public C17242a mo60627a(List<FeedFilter> list) {
            Internal.checkElementsNotNull(list);
            this.f44068b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17242a newBuilder() {
        C17242a aVar = new C17242a();
        aVar.f44067a = this.filter_enable;
        aVar.f44068b = Internal.copyOf("used_filters", this.used_filters);
        aVar.f44069c = this.show_mute;
        aVar.f44070d = this.show_at_all_in_at_filter;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "UpdateFeedFilterSettingsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.filter_enable != null) {
            sb.append(", filter_enable=");
            sb.append(this.filter_enable);
        }
        if (!this.used_filters.isEmpty()) {
            sb.append(", used_filters=");
            sb.append(this.used_filters);
        }
        if (this.show_mute != null) {
            sb.append(", show_mute=");
            sb.append(this.show_mute);
        }
        if (this.show_at_all_in_at_filter != null) {
            sb.append(", show_at_all_in_at_filter=");
            sb.append(this.show_at_all_in_at_filter);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateFeedFilterSettingsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateFeedFilterSettingsRequest(Boolean bool, List<FeedFilter> list, Boolean bool2, Boolean bool3) {
        this(bool, list, bool2, bool3, ByteString.EMPTY);
    }

    public UpdateFeedFilterSettingsRequest(Boolean bool, List<FeedFilter> list, Boolean bool2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.filter_enable = bool;
        this.used_filters = Internal.immutableCopyOf("used_filters", list);
        this.show_mute = bool2;
        this.show_at_all_in_at_filter = bool3;
    }
}
