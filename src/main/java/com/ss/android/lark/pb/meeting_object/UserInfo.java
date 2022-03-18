package com.ss.android.lark.pb.meeting_object;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class UserInfo extends Message<UserInfo, C49882a> {
    public static final ProtoAdapter<UserInfo> ADAPTER = new C49883b();
    private static final long serialVersionUID = 0;
    public final String mname;
    public final String muser_id;

    /* renamed from: com.ss.android.lark.pb.meeting_object.UserInfo$b */
    private static final class C49883b extends ProtoAdapter<UserInfo> {
        C49883b() {
            super(FieldEncoding.LENGTH_DELIMITED, UserInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(UserInfo userInfo) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, userInfo.muser_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, userInfo.mname) + userInfo.unknownFields().size();
        }

        /* renamed from: a */
        public UserInfo decode(ProtoReader protoReader) throws IOException {
            C49882a aVar = new C49882a();
            aVar.f124904a = "";
            aVar.f124905b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124904a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124905b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UserInfo userInfo) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, userInfo.muser_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, userInfo.mname);
            protoWriter.writeBytes(userInfo.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49882a newBuilder() {
        C49882a aVar = new C49882a();
        aVar.f124904a = this.muser_id;
        aVar.f124905b = this.mname;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.meeting_object.UserInfo$a */
    public static final class C49882a extends Message.Builder<UserInfo, C49882a> {

        /* renamed from: a */
        public String f124904a;

        /* renamed from: b */
        public String f124905b;

        /* renamed from: a */
        public UserInfo build() {
            String str;
            String str2 = this.f124904a;
            if (str2 != null && (str = this.f124905b) != null) {
                return new UserInfo(str2, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "muser_id", this.f124905b, "mname");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", user_id=");
        sb.append(this.muser_id);
        sb.append(", name=");
        sb.append(this.mname);
        StringBuilder replace = sb.replace(0, 2, "UserInfo{");
        replace.append('}');
        return replace.toString();
    }

    public UserInfo(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public UserInfo(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.muser_id = str;
        this.mname = str2;
    }
}
