package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class BadgeCount extends Message<BadgeCount, C17092a> {
    public static final ProtoAdapter<BadgeCount> ADAPTER = new C17093b();
    public static final Long DEFAULT_MUTE_COUNT = 0L;
    public static final Long DEFAULT_REMIND_COUNT = 0L;
    private static final long serialVersionUID = 0;
    public final Long mute_count;
    public final Long remind_count;

    /* renamed from: com.bytedance.lark.pb.feed.v1.BadgeCount$b */
    private static final class C17093b extends ProtoAdapter<BadgeCount> {
        C17093b() {
            super(FieldEncoding.LENGTH_DELIMITED, BadgeCount.class);
        }

        /* renamed from: a */
        public int encodedSize(BadgeCount badgeCount) {
            int i;
            int i2 = 0;
            if (badgeCount.remind_count != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, badgeCount.remind_count);
            } else {
                i = 0;
            }
            if (badgeCount.mute_count != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, badgeCount.mute_count);
            }
            return i + i2 + badgeCount.unknownFields().size();
        }

        /* renamed from: a */
        public BadgeCount decode(ProtoReader protoReader) throws IOException {
            C17092a aVar = new C17092a();
            aVar.f43770a = 0L;
            aVar.f43771b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43770a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43771b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BadgeCount badgeCount) throws IOException {
            if (badgeCount.remind_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, badgeCount.remind_count);
            }
            if (badgeCount.mute_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, badgeCount.mute_count);
            }
            protoWriter.writeBytes(badgeCount.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.BadgeCount$a */
    public static final class C17092a extends Message.Builder<BadgeCount, C17092a> {

        /* renamed from: a */
        public Long f43770a;

        /* renamed from: b */
        public Long f43771b;

        /* renamed from: a */
        public BadgeCount build() {
            return new BadgeCount(this.f43770a, this.f43771b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17092a newBuilder() {
        C17092a aVar = new C17092a();
        aVar.f43770a = this.remind_count;
        aVar.f43771b = this.mute_count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "BadgeCount");
        StringBuilder sb = new StringBuilder();
        if (this.remind_count != null) {
            sb.append(", remind_count=");
            sb.append(this.remind_count);
        }
        if (this.mute_count != null) {
            sb.append(", mute_count=");
            sb.append(this.mute_count);
        }
        StringBuilder replace = sb.replace(0, 2, "BadgeCount{");
        replace.append('}');
        return replace.toString();
    }

    public BadgeCount(Long l, Long l2) {
        this(l, l2, ByteString.EMPTY);
    }

    public BadgeCount(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.remind_count = l;
        this.mute_count = l2;
    }
}
