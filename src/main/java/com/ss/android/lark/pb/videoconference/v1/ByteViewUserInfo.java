package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ByteViewUserInfo extends Message<ByteViewUserInfo, C50487a> {
    public static final ProtoAdapter<ByteViewUserInfo> ADAPTER = new C50488b();
    private static final long serialVersionUID = 0;
    public final String avatar_key;
    public final String displayName;
    public final String fullName;
    public final ByteviewUser user;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ByteViewUserInfo$b */
    private static final class C50488b extends ProtoAdapter<ByteViewUserInfo> {
        C50488b() {
            super(FieldEncoding.LENGTH_DELIMITED, ByteViewUserInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(ByteViewUserInfo byteViewUserInfo) {
            int i;
            int encodedSizeWithTag = ByteviewUser.ADAPTER.encodedSizeWithTag(1, byteViewUserInfo.user) + ProtoAdapter.STRING.encodedSizeWithTag(2, byteViewUserInfo.fullName);
            int i2 = 0;
            if (byteViewUserInfo.displayName != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, byteViewUserInfo.displayName);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (byteViewUserInfo.avatar_key != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, byteViewUserInfo.avatar_key);
            }
            return i3 + i2 + byteViewUserInfo.unknownFields().size();
        }

        /* renamed from: a */
        public ByteViewUserInfo decode(ProtoReader protoReader) throws IOException {
            C50487a aVar = new C50487a();
            aVar.f126042b = "";
            aVar.f126043c = "";
            aVar.f126044d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126041a = ByteviewUser.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f126042b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f126043c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126044d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ByteViewUserInfo byteViewUserInfo) throws IOException {
            ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 1, byteViewUserInfo.user);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, byteViewUserInfo.fullName);
            if (byteViewUserInfo.displayName != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, byteViewUserInfo.displayName);
            }
            if (byteViewUserInfo.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, byteViewUserInfo.avatar_key);
            }
            protoWriter.writeBytes(byteViewUserInfo.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50487a newBuilder() {
        C50487a aVar = new C50487a();
        aVar.f126041a = this.user;
        aVar.f126042b = this.fullName;
        aVar.f126043c = this.displayName;
        aVar.f126044d = this.avatar_key;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ByteViewUserInfo$a */
    public static final class C50487a extends Message.Builder<ByteViewUserInfo, C50487a> {

        /* renamed from: a */
        public ByteviewUser f126041a;

        /* renamed from: b */
        public String f126042b;

        /* renamed from: c */
        public String f126043c;

        /* renamed from: d */
        public String f126044d;

        /* renamed from: a */
        public ByteViewUserInfo build() {
            String str;
            ByteviewUser byteviewUser = this.f126041a;
            if (byteviewUser != null && (str = this.f126042b) != null) {
                return new ByteViewUserInfo(byteviewUser, str, this.f126043c, this.f126044d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(byteviewUser, "user", this.f126042b, "fullName");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ByteViewUserInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(", user=");
        sb.append(this.user);
        sb.append(", fullName=");
        sb.append(this.fullName);
        if (this.displayName != null) {
            sb.append(", displayName=");
            sb.append(this.displayName);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        StringBuilder replace = sb.replace(0, 2, "ByteViewUserInfo{");
        replace.append('}');
        return replace.toString();
    }

    public ByteViewUserInfo(ByteviewUser byteviewUser, String str, String str2, String str3) {
        this(byteviewUser, str, str2, str3, ByteString.EMPTY);
    }

    public ByteViewUserInfo(ByteviewUser byteviewUser, String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user = byteviewUser;
        this.fullName = str;
        this.displayName = str2;
        this.avatar_key = str3;
    }
}
