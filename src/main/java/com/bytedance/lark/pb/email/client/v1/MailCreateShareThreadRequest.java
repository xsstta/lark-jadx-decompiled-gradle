package com.bytedance.lark.pb.email.client.v1;

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

public final class MailCreateShareThreadRequest extends Message<MailCreateShareThreadRequest, C16680a> {
    public static final ProtoAdapter<MailCreateShareThreadRequest> ADAPTER = new C16681b();
    public static final Boolean DEFAULT_CREATE_GROUP = false;
    private static final long serialVersionUID = 0;
    public final Boolean create_group;
    public final String message_text;
    public final String threadId;
    public final List<UserPayload> users;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCreateShareThreadRequest$b */
    private static final class C16681b extends ProtoAdapter<MailCreateShareThreadRequest> {
        C16681b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailCreateShareThreadRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailCreateShareThreadRequest mailCreateShareThreadRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (mailCreateShareThreadRequest.threadId != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailCreateShareThreadRequest.threadId);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + UserPayload.ADAPTER.asRepeated().encodedSizeWithTag(2, mailCreateShareThreadRequest.users);
            if (mailCreateShareThreadRequest.create_group != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, mailCreateShareThreadRequest.create_group);
            } else {
                i2 = 0;
            }
            int i4 = encodedSizeWithTag + i2;
            if (mailCreateShareThreadRequest.message_text != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, mailCreateShareThreadRequest.message_text);
            }
            return i4 + i3 + mailCreateShareThreadRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailCreateShareThreadRequest decode(ProtoReader protoReader) throws IOException {
            C16680a aVar = new C16680a();
            aVar.f43152a = "";
            aVar.f43154c = false;
            aVar.f43155d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43152a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43153b.add(UserPayload.ADAPTER.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f43154c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43155d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailCreateShareThreadRequest mailCreateShareThreadRequest) throws IOException {
            if (mailCreateShareThreadRequest.threadId != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailCreateShareThreadRequest.threadId);
            }
            UserPayload.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, mailCreateShareThreadRequest.users);
            if (mailCreateShareThreadRequest.create_group != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, mailCreateShareThreadRequest.create_group);
            }
            if (mailCreateShareThreadRequest.message_text != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, mailCreateShareThreadRequest.message_text);
            }
            protoWriter.writeBytes(mailCreateShareThreadRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCreateShareThreadRequest$a */
    public static final class C16680a extends Message.Builder<MailCreateShareThreadRequest, C16680a> {

        /* renamed from: a */
        public String f43152a;

        /* renamed from: b */
        public List<UserPayload> f43153b = Internal.newMutableList();

        /* renamed from: c */
        public Boolean f43154c;

        /* renamed from: d */
        public String f43155d;

        /* renamed from: a */
        public MailCreateShareThreadRequest build() {
            return new MailCreateShareThreadRequest(this.f43152a, this.f43153b, this.f43154c, this.f43155d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16680a mo59273a(Boolean bool) {
            this.f43154c = bool;
            return this;
        }

        /* renamed from: b */
        public C16680a mo59277b(String str) {
            this.f43155d = str;
            return this;
        }

        /* renamed from: a */
        public C16680a mo59274a(String str) {
            this.f43152a = str;
            return this;
        }

        /* renamed from: a */
        public C16680a mo59275a(List<UserPayload> list) {
            Internal.checkElementsNotNull(list);
            this.f43153b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16680a newBuilder() {
        C16680a aVar = new C16680a();
        aVar.f43152a = this.threadId;
        aVar.f43153b = Internal.copyOf("users", this.users);
        aVar.f43154c = this.create_group;
        aVar.f43155d = this.message_text;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailCreateShareThreadRequest");
        StringBuilder sb = new StringBuilder();
        if (this.threadId != null) {
            sb.append(", threadId=");
            sb.append(this.threadId);
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
        StringBuilder replace = sb.replace(0, 2, "MailCreateShareThreadRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailCreateShareThreadRequest(String str, List<UserPayload> list, Boolean bool, String str2) {
        this(str, list, bool, str2, ByteString.EMPTY);
    }

    public MailCreateShareThreadRequest(String str, List<UserPayload> list, Boolean bool, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.threadId = str;
        this.users = Internal.immutableCopyOf("users", list);
        this.create_group = bool;
        this.message_text = str2;
    }
}
