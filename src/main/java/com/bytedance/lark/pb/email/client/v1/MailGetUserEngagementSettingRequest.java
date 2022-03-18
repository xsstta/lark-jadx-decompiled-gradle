package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetUserEngagementSettingRequest extends Message<MailGetUserEngagementSettingRequest, C16816a> {
    public static final ProtoAdapter<MailGetUserEngagementSettingRequest> ADAPTER = new C16817b();
    public static final Boolean DEFAULT_FETCH_DB = true;
    private static final long serialVersionUID = 0;
    public final Boolean fetch_db;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetUserEngagementSettingRequest$b */
    private static final class C16817b extends ProtoAdapter<MailGetUserEngagementSettingRequest> {
        C16817b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetUserEngagementSettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetUserEngagementSettingRequest mailGetUserEngagementSettingRequest) {
            int i;
            if (mailGetUserEngagementSettingRequest.fetch_db != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, mailGetUserEngagementSettingRequest.fetch_db);
            } else {
                i = 0;
            }
            return i + mailGetUserEngagementSettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetUserEngagementSettingRequest decode(ProtoReader protoReader) throws IOException {
            C16816a aVar = new C16816a();
            aVar.f43288a = true;
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
                    aVar.f43288a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetUserEngagementSettingRequest mailGetUserEngagementSettingRequest) throws IOException {
            if (mailGetUserEngagementSettingRequest.fetch_db != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, mailGetUserEngagementSettingRequest.fetch_db);
            }
            protoWriter.writeBytes(mailGetUserEngagementSettingRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetUserEngagementSettingRequest$a */
    public static final class C16816a extends Message.Builder<MailGetUserEngagementSettingRequest, C16816a> {

        /* renamed from: a */
        public Boolean f43288a;

        /* renamed from: a */
        public MailGetUserEngagementSettingRequest build() {
            return new MailGetUserEngagementSettingRequest(this.f43288a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16816a newBuilder() {
        C16816a aVar = new C16816a();
        aVar.f43288a = this.fetch_db;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetUserEngagementSettingRequest");
        StringBuilder sb = new StringBuilder();
        if (this.fetch_db != null) {
            sb.append(", fetch_db=");
            sb.append(this.fetch_db);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetUserEngagementSettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetUserEngagementSettingRequest(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public MailGetUserEngagementSettingRequest(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.fetch_db = bool;
    }
}
