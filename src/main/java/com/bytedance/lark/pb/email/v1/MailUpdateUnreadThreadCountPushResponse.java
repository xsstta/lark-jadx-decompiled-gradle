package com.bytedance.lark.pb.email.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.email.client.v1.UnreadCountColor;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class MailUpdateUnreadThreadCountPushResponse extends Message<MailUpdateUnreadThreadCountPushResponse, C17074a> {
    public static final ProtoAdapter<MailUpdateUnreadThreadCountPushResponse> ADAPTER = new C17075b();
    public static final Long DEFAULT_COUNT = 0L;
    public static final UnreadCountColor DEFAULT_TAB_UNREAD_COLOR = UnreadCountColor.GRAY;
    private static final long serialVersionUID = 0;
    public final Map<String, UnreadCountColor> color_map;
    public final Long count;
    public final Map<String, Long> count_map;
    public final UnreadCountColor tab_unread_color;

    /* renamed from: com.bytedance.lark.pb.email.v1.MailUpdateUnreadThreadCountPushResponse$a */
    public static final class C17074a extends Message.Builder<MailUpdateUnreadThreadCountPushResponse, C17074a> {

        /* renamed from: a */
        public Long f43737a;

        /* renamed from: b */
        public Map<String, Long> f43738b = Internal.newMutableMap();

        /* renamed from: c */
        public UnreadCountColor f43739c;

        /* renamed from: d */
        public Map<String, UnreadCountColor> f43740d = Internal.newMutableMap();

        /* renamed from: a */
        public MailUpdateUnreadThreadCountPushResponse build() {
            return new MailUpdateUnreadThreadCountPushResponse(this.f43737a, this.f43738b, this.f43739c, this.f43740d, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.v1.MailUpdateUnreadThreadCountPushResponse$b */
    private static final class C17075b extends ProtoAdapter<MailUpdateUnreadThreadCountPushResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Long>> f43741a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.INT64);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, UnreadCountColor>> f43742b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, UnreadCountColor.ADAPTER);

        C17075b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailUpdateUnreadThreadCountPushResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailUpdateUnreadThreadCountPushResponse mailUpdateUnreadThreadCountPushResponse) {
            int i;
            int i2 = 0;
            if (mailUpdateUnreadThreadCountPushResponse.count != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, mailUpdateUnreadThreadCountPushResponse.count);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + this.f43741a.encodedSizeWithTag(2, mailUpdateUnreadThreadCountPushResponse.count_map);
            if (mailUpdateUnreadThreadCountPushResponse.tab_unread_color != null) {
                i2 = UnreadCountColor.ADAPTER.encodedSizeWithTag(3, mailUpdateUnreadThreadCountPushResponse.tab_unread_color);
            }
            return encodedSizeWithTag + i2 + this.f43742b.encodedSizeWithTag(4, mailUpdateUnreadThreadCountPushResponse.color_map) + mailUpdateUnreadThreadCountPushResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailUpdateUnreadThreadCountPushResponse decode(ProtoReader protoReader) throws IOException {
            C17074a aVar = new C17074a();
            aVar.f43737a = 0L;
            aVar.f43739c = UnreadCountColor.GRAY;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43737a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43738b.putAll(this.f43741a.decode(protoReader));
                } else if (nextTag == 3) {
                    try {
                        aVar.f43739c = UnreadCountColor.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43740d.putAll(this.f43742b.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailUpdateUnreadThreadCountPushResponse mailUpdateUnreadThreadCountPushResponse) throws IOException {
            if (mailUpdateUnreadThreadCountPushResponse.count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, mailUpdateUnreadThreadCountPushResponse.count);
            }
            this.f43741a.encodeWithTag(protoWriter, 2, mailUpdateUnreadThreadCountPushResponse.count_map);
            if (mailUpdateUnreadThreadCountPushResponse.tab_unread_color != null) {
                UnreadCountColor.ADAPTER.encodeWithTag(protoWriter, 3, mailUpdateUnreadThreadCountPushResponse.tab_unread_color);
            }
            this.f43742b.encodeWithTag(protoWriter, 4, mailUpdateUnreadThreadCountPushResponse.color_map);
            protoWriter.writeBytes(mailUpdateUnreadThreadCountPushResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17074a newBuilder() {
        C17074a aVar = new C17074a();
        aVar.f43737a = this.count;
        aVar.f43738b = Internal.copyOf("count_map", this.count_map);
        aVar.f43739c = this.tab_unread_color;
        aVar.f43740d = Internal.copyOf("color_map", this.color_map);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailUpdateUnreadThreadCountPushResponse");
        StringBuilder sb = new StringBuilder();
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (!this.count_map.isEmpty()) {
            sb.append(", count_map=");
            sb.append(this.count_map);
        }
        if (this.tab_unread_color != null) {
            sb.append(", tab_unread_color=");
            sb.append(this.tab_unread_color);
        }
        if (!this.color_map.isEmpty()) {
            sb.append(", color_map=");
            sb.append(this.color_map);
        }
        StringBuilder replace = sb.replace(0, 2, "MailUpdateUnreadThreadCountPushResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailUpdateUnreadThreadCountPushResponse(Long l, Map<String, Long> map, UnreadCountColor unreadCountColor, Map<String, UnreadCountColor> map2) {
        this(l, map, unreadCountColor, map2, ByteString.EMPTY);
    }

    public MailUpdateUnreadThreadCountPushResponse(Long l, Map<String, Long> map, UnreadCountColor unreadCountColor, Map<String, UnreadCountColor> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.count = l;
        this.count_map = Internal.immutableCopyOf("count_map", map);
        this.tab_unread_color = unreadCountColor;
        this.color_map = Internal.immutableCopyOf("color_map", map2);
    }
}
