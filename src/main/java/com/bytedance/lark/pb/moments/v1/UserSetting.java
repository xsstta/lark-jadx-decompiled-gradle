package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UserSetting extends Message<UserSetting, C18566a> {
    public static final ProtoAdapter<UserSetting> ADAPTER = new C18567b();
    public static final Boolean DEFAULT_MUTE_RED_DOT_NOTIFY = false;
    private static final long serialVersionUID = 0;
    public final Boolean mute_red_dot_notify;

    /* renamed from: com.bytedance.lark.pb.moments.v1.UserSetting$b */
    private static final class C18567b extends ProtoAdapter<UserSetting> {
        C18567b() {
            super(FieldEncoding.LENGTH_DELIMITED, UserSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(UserSetting userSetting) {
            int i;
            if (userSetting.mute_red_dot_notify != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, userSetting.mute_red_dot_notify);
            } else {
                i = 0;
            }
            return i + userSetting.unknownFields().size();
        }

        /* renamed from: a */
        public UserSetting decode(ProtoReader protoReader) throws IOException {
            C18566a aVar = new C18566a();
            aVar.f46064a = false;
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
                    aVar.f46064a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UserSetting userSetting) throws IOException {
            if (userSetting.mute_red_dot_notify != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, userSetting.mute_red_dot_notify);
            }
            protoWriter.writeBytes(userSetting.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.UserSetting$a */
    public static final class C18566a extends Message.Builder<UserSetting, C18566a> {

        /* renamed from: a */
        public Boolean f46064a;

        /* renamed from: a */
        public UserSetting build() {
            return new UserSetting(this.f46064a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18566a mo64022a(Boolean bool) {
            this.f46064a = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18566a newBuilder() {
        C18566a aVar = new C18566a();
        aVar.f46064a = this.mute_red_dot_notify;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "UserSetting");
        StringBuilder sb = new StringBuilder();
        if (this.mute_red_dot_notify != null) {
            sb.append(", mute_red_dot_notify=");
            sb.append(this.mute_red_dot_notify);
        }
        StringBuilder replace = sb.replace(0, 2, "UserSetting{");
        replace.append('}');
        return replace.toString();
    }

    public UserSetting(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public UserSetting(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mute_red_dot_notify = bool;
    }
}
