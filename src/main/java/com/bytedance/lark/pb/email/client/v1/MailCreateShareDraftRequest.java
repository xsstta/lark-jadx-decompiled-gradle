package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.email.client.v1.MailUpdateDraftRequest;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class MailCreateShareDraftRequest extends Message<MailCreateShareDraftRequest, C16672a> {
    public static final ProtoAdapter<MailCreateShareDraftRequest> ADAPTER = new C16673b();
    public static final Boolean DEFAULT_CREATE_GROUP = false;
    private static final long serialVersionUID = 0;
    public final Boolean create_group;
    public final String draft_id;
    public final String message_text;
    public final MailUpdateDraftRequest.Payload payload;
    public final List<UserPayload> users;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCreateShareDraftRequest$b */
    private static final class C16673b extends ProtoAdapter<MailCreateShareDraftRequest> {
        C16673b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailCreateShareDraftRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailCreateShareDraftRequest mailCreateShareDraftRequest) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (mailCreateShareDraftRequest.draft_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailCreateShareDraftRequest.draft_id);
            } else {
                i = 0;
            }
            if (mailCreateShareDraftRequest.payload != null) {
                i2 = MailUpdateDraftRequest.Payload.ADAPTER.encodedSizeWithTag(2, mailCreateShareDraftRequest.payload);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag = i + i2 + UserPayload.ADAPTER.asRepeated().encodedSizeWithTag(3, mailCreateShareDraftRequest.users);
            if (mailCreateShareDraftRequest.create_group != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, mailCreateShareDraftRequest.create_group);
            } else {
                i3 = 0;
            }
            int i5 = encodedSizeWithTag + i3;
            if (mailCreateShareDraftRequest.message_text != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, mailCreateShareDraftRequest.message_text);
            }
            return i5 + i4 + mailCreateShareDraftRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailCreateShareDraftRequest decode(ProtoReader protoReader) throws IOException {
            C16672a aVar = new C16672a();
            aVar.f43140a = "";
            aVar.f43143d = false;
            aVar.f43144e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43140a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43141b = MailUpdateDraftRequest.Payload.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f43142c.add(UserPayload.ADAPTER.decode(protoReader));
                } else if (nextTag == 4) {
                    aVar.f43143d = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43144e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailCreateShareDraftRequest mailCreateShareDraftRequest) throws IOException {
            if (mailCreateShareDraftRequest.draft_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailCreateShareDraftRequest.draft_id);
            }
            if (mailCreateShareDraftRequest.payload != null) {
                MailUpdateDraftRequest.Payload.ADAPTER.encodeWithTag(protoWriter, 2, mailCreateShareDraftRequest.payload);
            }
            UserPayload.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, mailCreateShareDraftRequest.users);
            if (mailCreateShareDraftRequest.create_group != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, mailCreateShareDraftRequest.create_group);
            }
            if (mailCreateShareDraftRequest.message_text != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, mailCreateShareDraftRequest.message_text);
            }
            protoWriter.writeBytes(mailCreateShareDraftRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCreateShareDraftRequest$a */
    public static final class C16672a extends Message.Builder<MailCreateShareDraftRequest, C16672a> {

        /* renamed from: a */
        public String f43140a;

        /* renamed from: b */
        public MailUpdateDraftRequest.Payload f43141b;

        /* renamed from: c */
        public List<UserPayload> f43142c = Internal.newMutableList();

        /* renamed from: d */
        public Boolean f43143d;

        /* renamed from: e */
        public String f43144e;

        /* renamed from: a */
        public MailCreateShareDraftRequest build() {
            return new MailCreateShareDraftRequest(this.f43140a, this.f43141b, this.f43142c, this.f43143d, this.f43144e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16672a newBuilder() {
        C16672a aVar = new C16672a();
        aVar.f43140a = this.draft_id;
        aVar.f43141b = this.payload;
        aVar.f43142c = Internal.copyOf("users", this.users);
        aVar.f43143d = this.create_group;
        aVar.f43144e = this.message_text;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailCreateShareDraftRequest");
        StringBuilder sb = new StringBuilder();
        if (this.draft_id != null) {
            sb.append(", draft_id=");
            sb.append(this.draft_id);
        }
        if (this.payload != null) {
            sb.append(", payload=");
            sb.append(this.payload);
        }
        if (!this.users.isEmpty()) {
            sb.append(", users=");
            sb.append(this.users);
        }
        if (this.create_group != null) {
            sb.append(", create_group=");
            sb.append(this.create_group);
        }
        if (this.message_text != null) {
            sb.append(", message_text=");
            sb.append(this.message_text);
        }
        StringBuilder replace = sb.replace(0, 2, "MailCreateShareDraftRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailCreateShareDraftRequest(String str, MailUpdateDraftRequest.Payload payload2, List<UserPayload> list, Boolean bool, String str2) {
        this(str, payload2, list, bool, str2, ByteString.EMPTY);
    }

    public MailCreateShareDraftRequest(String str, MailUpdateDraftRequest.Payload payload2, List<UserPayload> list, Boolean bool, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.draft_id = str;
        this.payload = payload2;
        this.users = Internal.immutableCopyOf("users", list);
        this.create_group = bool;
        this.message_text = str2;
    }
}
