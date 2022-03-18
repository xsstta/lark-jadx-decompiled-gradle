package com.bytedance.lark.pb.moments.v1;

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

public final class HashtagStats extends Message<HashtagStats, C18406a> {
    public static final ProtoAdapter<HashtagStats> ADAPTER = new C18407b();
    public static final Integer DEFAULT_PARTICIPATE_COUNT = 0;
    public static final Integer DEFAULT_POST_COUNT = 0;
    public static final Integer DEFAULT_VIEW_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final Integer participate_count;
    public final Integer post_count;
    public final Integer view_count;
    public final List<MomentUser> visible_users;

    /* renamed from: com.bytedance.lark.pb.moments.v1.HashtagStats$b */
    private static final class C18407b extends ProtoAdapter<HashtagStats> {
        C18407b() {
            super(FieldEncoding.LENGTH_DELIMITED, HashtagStats.class);
        }

        /* renamed from: a */
        public int encodedSize(HashtagStats hashtagStats) {
            int i;
            int i2;
            int i3 = 0;
            if (hashtagStats.post_count != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, hashtagStats.post_count);
            } else {
                i = 0;
            }
            if (hashtagStats.participate_count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, hashtagStats.participate_count);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (hashtagStats.view_count != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, hashtagStats.view_count);
            }
            return i4 + i3 + MomentUser.ADAPTER.asRepeated().encodedSizeWithTag(4, hashtagStats.visible_users) + hashtagStats.unknownFields().size();
        }

        /* renamed from: a */
        public HashtagStats decode(ProtoReader protoReader) throws IOException {
            C18406a aVar = new C18406a();
            aVar.f45788a = 0;
            aVar.f45789b = 0;
            aVar.f45790c = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45788a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45789b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f45790c = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45791d.add(MomentUser.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, HashtagStats hashtagStats) throws IOException {
            if (hashtagStats.post_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, hashtagStats.post_count);
            }
            if (hashtagStats.participate_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, hashtagStats.participate_count);
            }
            if (hashtagStats.view_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, hashtagStats.view_count);
            }
            MomentUser.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, hashtagStats.visible_users);
            protoWriter.writeBytes(hashtagStats.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.HashtagStats$a */
    public static final class C18406a extends Message.Builder<HashtagStats, C18406a> {

        /* renamed from: a */
        public Integer f45788a;

        /* renamed from: b */
        public Integer f45789b;

        /* renamed from: c */
        public Integer f45790c;

        /* renamed from: d */
        public List<MomentUser> f45791d = Internal.newMutableList();

        /* renamed from: a */
        public HashtagStats build() {
            return new HashtagStats(this.f45788a, this.f45789b, this.f45790c, this.f45791d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18406a newBuilder() {
        C18406a aVar = new C18406a();
        aVar.f45788a = this.post_count;
        aVar.f45789b = this.participate_count;
        aVar.f45790c = this.view_count;
        aVar.f45791d = Internal.copyOf("visible_users", this.visible_users);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "HashtagStats");
        StringBuilder sb = new StringBuilder();
        if (this.post_count != null) {
            sb.append(", post_count=");
            sb.append(this.post_count);
        }
        if (this.participate_count != null) {
            sb.append(", participate_count=");
            sb.append(this.participate_count);
        }
        if (this.view_count != null) {
            sb.append(", view_count=");
            sb.append(this.view_count);
        }
        if (!this.visible_users.isEmpty()) {
            sb.append(", visible_users=");
            sb.append(this.visible_users);
        }
        StringBuilder replace = sb.replace(0, 2, "HashtagStats{");
        replace.append('}');
        return replace.toString();
    }

    public HashtagStats(Integer num, Integer num2, Integer num3, List<MomentUser> list) {
        this(num, num2, num3, list, ByteString.EMPTY);
    }

    public HashtagStats(Integer num, Integer num2, Integer num3, List<MomentUser> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.post_count = num;
        this.participate_count = num2;
        this.view_count = num3;
        this.visible_users = Internal.immutableCopyOf("visible_users", list);
    }
}
