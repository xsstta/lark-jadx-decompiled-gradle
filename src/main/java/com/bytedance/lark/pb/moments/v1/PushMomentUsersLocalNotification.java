package com.bytedance.lark.pb.moments.v1;

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

public final class PushMomentUsersLocalNotification extends Message<PushMomentUsersLocalNotification, C18506a> {
    public static final ProtoAdapter<PushMomentUsersLocalNotification> ADAPTER = new C18507b();
    private static final long serialVersionUID = 0;
    public final Map<String, MomentUser> moment_users;

    /* renamed from: com.bytedance.lark.pb.moments.v1.PushMomentUsersLocalNotification$a */
    public static final class C18506a extends Message.Builder<PushMomentUsersLocalNotification, C18506a> {

        /* renamed from: a */
        public Map<String, MomentUser> f45976a = Internal.newMutableMap();

        /* renamed from: a */
        public PushMomentUsersLocalNotification build() {
            return new PushMomentUsersLocalNotification(this.f45976a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.PushMomentUsersLocalNotification$b */
    private static final class C18507b extends ProtoAdapter<PushMomentUsersLocalNotification> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, MomentUser>> f45977a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, MomentUser.ADAPTER);

        C18507b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushMomentUsersLocalNotification.class);
        }

        /* renamed from: a */
        public int encodedSize(PushMomentUsersLocalNotification pushMomentUsersLocalNotification) {
            return this.f45977a.encodedSizeWithTag(1, pushMomentUsersLocalNotification.moment_users) + pushMomentUsersLocalNotification.unknownFields().size();
        }

        /* renamed from: a */
        public PushMomentUsersLocalNotification decode(ProtoReader protoReader) throws IOException {
            C18506a aVar = new C18506a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45976a.putAll(this.f45977a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushMomentUsersLocalNotification pushMomentUsersLocalNotification) throws IOException {
            this.f45977a.encodeWithTag(protoWriter, 1, pushMomentUsersLocalNotification.moment_users);
            protoWriter.writeBytes(pushMomentUsersLocalNotification.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18506a newBuilder() {
        C18506a aVar = new C18506a();
        aVar.f45976a = Internal.copyOf("moment_users", this.moment_users);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "PushMomentUsersLocalNotification");
        StringBuilder sb = new StringBuilder();
        if (!this.moment_users.isEmpty()) {
            sb.append(", moment_users=");
            sb.append(this.moment_users);
        }
        StringBuilder replace = sb.replace(0, 2, "PushMomentUsersLocalNotification{");
        replace.append('}');
        return replace.toString();
    }

    public PushMomentUsersLocalNotification(Map<String, MomentUser> map) {
        this(map, ByteString.EMPTY);
    }

    public PushMomentUsersLocalNotification(Map<String, MomentUser> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.moment_users = Internal.immutableCopyOf("moment_users", map);
    }
}
