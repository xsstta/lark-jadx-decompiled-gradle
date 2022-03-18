package com.bytedance.lark.pb.im.v1;

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

public final class UserReactions extends Message<UserReactions, C18174a> {
    public static final ProtoAdapter<UserReactions> ADAPTER = new C18175b();
    public static final Integer DEFAULT_VERSION = 0;
    private static final long serialVersionUID = 0;
    public final List<String> extra_keys;
    public final List<String> keys;
    public final Integer version;

    /* renamed from: com.bytedance.lark.pb.im.v1.UserReactions$b */
    private static final class C18175b extends ProtoAdapter<UserReactions> {
        C18175b() {
            super(FieldEncoding.LENGTH_DELIMITED, UserReactions.class);
        }

        /* renamed from: a */
        public int encodedSize(UserReactions userReactions) {
            int i;
            if (userReactions.version != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, userReactions.version);
            } else {
                i = 0;
            }
            return i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, userReactions.keys) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, userReactions.extra_keys) + userReactions.unknownFields().size();
        }

        /* renamed from: a */
        public UserReactions decode(ProtoReader protoReader) throws IOException {
            C18174a aVar = new C18174a();
            aVar.f45383a = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45383a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45384b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45385c.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UserReactions userReactions) throws IOException {
            if (userReactions.version != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, userReactions.version);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, userReactions.keys);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, userReactions.extra_keys);
            protoWriter.writeBytes(userReactions.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.UserReactions$a */
    public static final class C18174a extends Message.Builder<UserReactions, C18174a> {

        /* renamed from: a */
        public Integer f45383a;

        /* renamed from: b */
        public List<String> f45384b = Internal.newMutableList();

        /* renamed from: c */
        public List<String> f45385c = Internal.newMutableList();

        /* renamed from: a */
        public UserReactions build() {
            return new UserReactions(this.f45383a, this.f45384b, this.f45385c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18174a newBuilder() {
        C18174a aVar = new C18174a();
        aVar.f45383a = this.version;
        aVar.f45384b = Internal.copyOf("keys", this.keys);
        aVar.f45385c = Internal.copyOf("extra_keys", this.extra_keys);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "UserReactions");
        StringBuilder sb = new StringBuilder();
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (!this.keys.isEmpty()) {
            sb.append(", keys=");
            sb.append(this.keys);
        }
        if (!this.extra_keys.isEmpty()) {
            sb.append(", extra_keys=");
            sb.append(this.extra_keys);
        }
        StringBuilder replace = sb.replace(0, 2, "UserReactions{");
        replace.append('}');
        return replace.toString();
    }

    public UserReactions(Integer num, List<String> list, List<String> list2) {
        this(num, list, list2, ByteString.EMPTY);
    }

    public UserReactions(Integer num, List<String> list, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.version = num;
        this.keys = Internal.immutableCopyOf("keys", list);
        this.extra_keys = Internal.immutableCopyOf("extra_keys", list2);
    }
}
