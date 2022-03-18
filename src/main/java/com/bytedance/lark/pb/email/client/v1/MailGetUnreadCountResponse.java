package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class MailGetUnreadCountResponse extends Message<MailGetUnreadCountResponse, C16814a> {
    public static final ProtoAdapter<MailGetUnreadCountResponse> ADAPTER = new C16815b();
    public static final UnreadCountColor DEFAULT_TAB_UNREAD_COLOR = UnreadCountColor.GRAY;
    public static final Long DEFAULT_UNREAD_COUNT = 0L;
    private static final long serialVersionUID = 0;
    public final Map<String, UnreadCountColor> color_map;
    public final UnreadCountColor tab_unread_color;
    public final Long unread_count;
    public final Map<String, Long> unread_count_map;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetUnreadCountResponse$a */
    public static final class C16814a extends Message.Builder<MailGetUnreadCountResponse, C16814a> {

        /* renamed from: a */
        public Long f43282a;

        /* renamed from: b */
        public Map<String, Long> f43283b = Internal.newMutableMap();

        /* renamed from: c */
        public UnreadCountColor f43284c;

        /* renamed from: d */
        public Map<String, UnreadCountColor> f43285d = Internal.newMutableMap();

        /* renamed from: a */
        public MailGetUnreadCountResponse build() {
            return new MailGetUnreadCountResponse(this.f43282a, this.f43283b, this.f43284c, this.f43285d, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetUnreadCountResponse$b */
    private static final class C16815b extends ProtoAdapter<MailGetUnreadCountResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Long>> f43286a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.INT64);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, UnreadCountColor>> f43287b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, UnreadCountColor.ADAPTER);

        C16815b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetUnreadCountResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetUnreadCountResponse mailGetUnreadCountResponse) {
            int i;
            int i2 = 0;
            if (mailGetUnreadCountResponse.unread_count != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, mailGetUnreadCountResponse.unread_count);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + this.f43286a.encodedSizeWithTag(2, mailGetUnreadCountResponse.unread_count_map);
            if (mailGetUnreadCountResponse.tab_unread_color != null) {
                i2 = UnreadCountColor.ADAPTER.encodedSizeWithTag(3, mailGetUnreadCountResponse.tab_unread_color);
            }
            return encodedSizeWithTag + i2 + this.f43287b.encodedSizeWithTag(4, mailGetUnreadCountResponse.color_map) + mailGetUnreadCountResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetUnreadCountResponse decode(ProtoReader protoReader) throws IOException {
            C16814a aVar = new C16814a();
            aVar.f43282a = 0L;
            aVar.f43284c = UnreadCountColor.GRAY;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43282a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43283b.putAll(this.f43286a.decode(protoReader));
                } else if (nextTag == 3) {
                    try {
                        aVar.f43284c = UnreadCountColor.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43285d.putAll(this.f43287b.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetUnreadCountResponse mailGetUnreadCountResponse) throws IOException {
            if (mailGetUnreadCountResponse.unread_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, mailGetUnreadCountResponse.unread_count);
            }
            this.f43286a.encodeWithTag(protoWriter, 2, mailGetUnreadCountResponse.unread_count_map);
            if (mailGetUnreadCountResponse.tab_unread_color != null) {
                UnreadCountColor.ADAPTER.encodeWithTag(protoWriter, 3, mailGetUnreadCountResponse.tab_unread_color);
            }
            this.f43287b.encodeWithTag(protoWriter, 4, mailGetUnreadCountResponse.color_map);
            protoWriter.writeBytes(mailGetUnreadCountResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16814a newBuilder() {
        C16814a aVar = new C16814a();
        aVar.f43282a = this.unread_count;
        aVar.f43283b = Internal.copyOf("unread_count_map", this.unread_count_map);
        aVar.f43284c = this.tab_unread_color;
        aVar.f43285d = Internal.copyOf("color_map", this.color_map);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetUnreadCountResponse");
        StringBuilder sb = new StringBuilder();
        if (this.unread_count != null) {
            sb.append(", unread_count=");
            sb.append(this.unread_count);
        }
        if (!this.unread_count_map.isEmpty()) {
            sb.append(", unread_count_map=");
            sb.append(this.unread_count_map);
        }
        if (this.tab_unread_color != null) {
            sb.append(", tab_unread_color=");
            sb.append(this.tab_unread_color);
        }
        if (!this.color_map.isEmpty()) {
            sb.append(", color_map=");
            sb.append(this.color_map);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetUnreadCountResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetUnreadCountResponse(Long l, Map<String, Long> map, UnreadCountColor unreadCountColor, Map<String, UnreadCountColor> map2) {
        this(l, map, unreadCountColor, map2, ByteString.EMPTY);
    }

    public MailGetUnreadCountResponse(Long l, Map<String, Long> map, UnreadCountColor unreadCountColor, Map<String, UnreadCountColor> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.unread_count = l;
        this.unread_count_map = Internal.immutableCopyOf("unread_count_map", map);
        this.tab_unread_color = unreadCountColor;
        this.color_map = Internal.immutableCopyOf("color_map", map2);
    }
}
