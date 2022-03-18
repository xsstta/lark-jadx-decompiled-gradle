package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class FollowingUser extends Message<FollowingUser, C18374a> {
    public static final ProtoAdapter<FollowingUser> ADAPTER = new C18375b();
    public static final Long DEFAULT_UPDATE_TIME_MSEC = 0L;
    private static final long serialVersionUID = 0;
    public final Long update_time_msec;
    public final String user_id;

    /* renamed from: com.bytedance.lark.pb.moments.v1.FollowingUser$b */
    private static final class C18375b extends ProtoAdapter<FollowingUser> {
        C18375b() {
            super(FieldEncoding.LENGTH_DELIMITED, FollowingUser.class);
        }

        /* renamed from: a */
        public int encodedSize(FollowingUser followingUser) {
            int i;
            int i2 = 0;
            if (followingUser.user_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, followingUser.user_id);
            } else {
                i = 0;
            }
            if (followingUser.update_time_msec != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, followingUser.update_time_msec);
            }
            return i + i2 + followingUser.unknownFields().size();
        }

        /* renamed from: a */
        public FollowingUser decode(ProtoReader protoReader) throws IOException {
            C18374a aVar = new C18374a();
            aVar.f45758a = "";
            aVar.f45759b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45758a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45759b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FollowingUser followingUser) throws IOException {
            if (followingUser.user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, followingUser.user_id);
            }
            if (followingUser.update_time_msec != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, followingUser.update_time_msec);
            }
            protoWriter.writeBytes(followingUser.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.FollowingUser$a */
    public static final class C18374a extends Message.Builder<FollowingUser, C18374a> {

        /* renamed from: a */
        public String f45758a;

        /* renamed from: b */
        public Long f45759b;

        /* renamed from: a */
        public FollowingUser build() {
            return new FollowingUser(this.f45758a, this.f45759b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18374a newBuilder() {
        C18374a aVar = new C18374a();
        aVar.f45758a = this.user_id;
        aVar.f45759b = this.update_time_msec;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "FollowingUser");
        StringBuilder sb = new StringBuilder();
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.update_time_msec != null) {
            sb.append(", update_time_msec=");
            sb.append(this.update_time_msec);
        }
        StringBuilder replace = sb.replace(0, 2, "FollowingUser{");
        replace.append('}');
        return replace.toString();
    }

    public FollowingUser(String str, Long l) {
        this(str, l, ByteString.EMPTY);
    }

    public FollowingUser(String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = str;
        this.update_time_msec = l;
    }
}
