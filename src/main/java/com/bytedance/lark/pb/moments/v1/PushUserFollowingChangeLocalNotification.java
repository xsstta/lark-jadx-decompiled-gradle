package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PushUserFollowingChangeLocalNotification extends Message<PushUserFollowingChangeLocalNotification, C18522a> {
    public static final ProtoAdapter<PushUserFollowingChangeLocalNotification> ADAPTER = new C18523b();
    public static final Boolean DEFAULT_IS_CURRENT_USER_FOLLOWING = false;
    private static final long serialVersionUID = 0;
    public final Boolean is_current_user_following;
    public final String target_user_id;

    /* renamed from: com.bytedance.lark.pb.moments.v1.PushUserFollowingChangeLocalNotification$b */
    private static final class C18523b extends ProtoAdapter<PushUserFollowingChangeLocalNotification> {
        C18523b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushUserFollowingChangeLocalNotification.class);
        }

        /* renamed from: a */
        public int encodedSize(PushUserFollowingChangeLocalNotification pushUserFollowingChangeLocalNotification) {
            int i;
            int i2 = 0;
            if (pushUserFollowingChangeLocalNotification.target_user_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, pushUserFollowingChangeLocalNotification.target_user_id);
            } else {
                i = 0;
            }
            if (pushUserFollowingChangeLocalNotification.is_current_user_following != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, pushUserFollowingChangeLocalNotification.is_current_user_following);
            }
            return i + i2 + pushUserFollowingChangeLocalNotification.unknownFields().size();
        }

        /* renamed from: a */
        public PushUserFollowingChangeLocalNotification decode(ProtoReader protoReader) throws IOException {
            C18522a aVar = new C18522a();
            aVar.f46002a = "";
            aVar.f46003b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46002a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46003b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushUserFollowingChangeLocalNotification pushUserFollowingChangeLocalNotification) throws IOException {
            if (pushUserFollowingChangeLocalNotification.target_user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushUserFollowingChangeLocalNotification.target_user_id);
            }
            if (pushUserFollowingChangeLocalNotification.is_current_user_following != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, pushUserFollowingChangeLocalNotification.is_current_user_following);
            }
            protoWriter.writeBytes(pushUserFollowingChangeLocalNotification.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.PushUserFollowingChangeLocalNotification$a */
    public static final class C18522a extends Message.Builder<PushUserFollowingChangeLocalNotification, C18522a> {

        /* renamed from: a */
        public String f46002a;

        /* renamed from: b */
        public Boolean f46003b;

        /* renamed from: a */
        public PushUserFollowingChangeLocalNotification build() {
            return new PushUserFollowingChangeLocalNotification(this.f46002a, this.f46003b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18522a newBuilder() {
        C18522a aVar = new C18522a();
        aVar.f46002a = this.target_user_id;
        aVar.f46003b = this.is_current_user_following;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "PushUserFollowingChangeLocalNotification");
        StringBuilder sb = new StringBuilder();
        if (this.target_user_id != null) {
            sb.append(", target_user_id=");
            sb.append(this.target_user_id);
        }
        if (this.is_current_user_following != null) {
            sb.append(", is_current_user_following=");
            sb.append(this.is_current_user_following);
        }
        StringBuilder replace = sb.replace(0, 2, "PushUserFollowingChangeLocalNotification{");
        replace.append('}');
        return replace.toString();
    }

    public PushUserFollowingChangeLocalNotification(String str, Boolean bool) {
        this(str, bool, ByteString.EMPTY);
    }

    public PushUserFollowingChangeLocalNotification(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.target_user_id = str;
        this.is_current_user_following = bool;
    }
}
