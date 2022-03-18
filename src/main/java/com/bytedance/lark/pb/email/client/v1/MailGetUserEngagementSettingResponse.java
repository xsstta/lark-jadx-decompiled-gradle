package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetUserEngagementSettingResponse extends Message<MailGetUserEngagementSettingResponse, C16818a> {
    public static final ProtoAdapter<MailGetUserEngagementSettingResponse> ADAPTER = new C16819b();
    private static final long serialVersionUID = 0;
    public final UserEngagementSetting userEngagementSetting;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetUserEngagementSettingResponse$b */
    private static final class C16819b extends ProtoAdapter<MailGetUserEngagementSettingResponse> {
        C16819b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetUserEngagementSettingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetUserEngagementSettingResponse mailGetUserEngagementSettingResponse) {
            int i;
            if (mailGetUserEngagementSettingResponse.userEngagementSetting != null) {
                i = UserEngagementSetting.ADAPTER.encodedSizeWithTag(1, mailGetUserEngagementSettingResponse.userEngagementSetting);
            } else {
                i = 0;
            }
            return i + mailGetUserEngagementSettingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetUserEngagementSettingResponse decode(ProtoReader protoReader) throws IOException {
            C16818a aVar = new C16818a();
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
                    aVar.f43289a = UserEngagementSetting.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetUserEngagementSettingResponse mailGetUserEngagementSettingResponse) throws IOException {
            if (mailGetUserEngagementSettingResponse.userEngagementSetting != null) {
                UserEngagementSetting.ADAPTER.encodeWithTag(protoWriter, 1, mailGetUserEngagementSettingResponse.userEngagementSetting);
            }
            protoWriter.writeBytes(mailGetUserEngagementSettingResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetUserEngagementSettingResponse$a */
    public static final class C16818a extends Message.Builder<MailGetUserEngagementSettingResponse, C16818a> {

        /* renamed from: a */
        public UserEngagementSetting f43289a;

        /* renamed from: a */
        public MailGetUserEngagementSettingResponse build() {
            return new MailGetUserEngagementSettingResponse(this.f43289a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16818a newBuilder() {
        C16818a aVar = new C16818a();
        aVar.f43289a = this.userEngagementSetting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetUserEngagementSettingResponse");
        StringBuilder sb = new StringBuilder();
        if (this.userEngagementSetting != null) {
            sb.append(", userEngagementSetting=");
            sb.append(this.userEngagementSetting);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetUserEngagementSettingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetUserEngagementSettingResponse(UserEngagementSetting userEngagementSetting2) {
        this(userEngagementSetting2, ByteString.EMPTY);
    }

    public MailGetUserEngagementSettingResponse(UserEngagementSetting userEngagementSetting2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.userEngagementSetting = userEngagementSetting2;
    }
}
