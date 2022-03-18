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

public final class MailAddCollaboratorsRequest extends Message<MailAddCollaboratorsRequest, C16624a> {
    public static final ProtoAdapter<MailAddCollaboratorsRequest> ADAPTER = new C16625b();
    public static final Boolean DEFAULT_CREATE_GROUP = false;
    private static final long serialVersionUID = 0;
    public final Boolean create_group;
    public final String message_text;
    public final String thread_id;
    public final List<UserPayload> users;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailAddCollaboratorsRequest$b */
    private static final class C16625b extends ProtoAdapter<MailAddCollaboratorsRequest> {
        C16625b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailAddCollaboratorsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailAddCollaboratorsRequest mailAddCollaboratorsRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (mailAddCollaboratorsRequest.thread_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailAddCollaboratorsRequest.thread_id);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + UserPayload.ADAPTER.asRepeated().encodedSizeWithTag(2, mailAddCollaboratorsRequest.users);
            if (mailAddCollaboratorsRequest.create_group != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, mailAddCollaboratorsRequest.create_group);
            } else {
                i2 = 0;
            }
            int i4 = encodedSizeWithTag + i2;
            if (mailAddCollaboratorsRequest.message_text != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, mailAddCollaboratorsRequest.message_text);
            }
            return i4 + i3 + mailAddCollaboratorsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailAddCollaboratorsRequest decode(ProtoReader protoReader) throws IOException {
            C16624a aVar = new C16624a();
            aVar.f43059a = "";
            aVar.f43061c = false;
            aVar.f43062d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43059a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43060b.add(UserPayload.ADAPTER.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f43061c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43062d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailAddCollaboratorsRequest mailAddCollaboratorsRequest) throws IOException {
            if (mailAddCollaboratorsRequest.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailAddCollaboratorsRequest.thread_id);
            }
            UserPayload.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, mailAddCollaboratorsRequest.users);
            if (mailAddCollaboratorsRequest.create_group != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, mailAddCollaboratorsRequest.create_group);
            }
            if (mailAddCollaboratorsRequest.message_text != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, mailAddCollaboratorsRequest.message_text);
            }
            protoWriter.writeBytes(mailAddCollaboratorsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailAddCollaboratorsRequest$a */
    public static final class C16624a extends Message.Builder<MailAddCollaboratorsRequest, C16624a> {

        /* renamed from: a */
        public String f43059a;

        /* renamed from: b */
        public List<UserPayload> f43060b = Internal.newMutableList();

        /* renamed from: c */
        public Boolean f43061c;

        /* renamed from: d */
        public String f43062d;

        /* renamed from: a */
        public MailAddCollaboratorsRequest build() {
            return new MailAddCollaboratorsRequest(this.f43059a, this.f43060b, this.f43061c, this.f43062d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16624a mo59130a(Boolean bool) {
            this.f43061c = bool;
            return this;
        }

        /* renamed from: b */
        public C16624a mo59134b(String str) {
            this.f43062d = str;
            return this;
        }

        /* renamed from: a */
        public C16624a mo59131a(String str) {
            this.f43059a = str;
            return this;
        }

        /* renamed from: a */
        public C16624a mo59132a(List<UserPayload> list) {
            Internal.checkElementsNotNull(list);
            this.f43060b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16624a newBuilder() {
        C16624a aVar = new C16624a();
        aVar.f43059a = this.thread_id;
        aVar.f43060b = Internal.copyOf("users", this.users);
        aVar.f43061c = this.create_group;
        aVar.f43062d = this.message_text;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailAddCollaboratorsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
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
        StringBuilder replace = sb.replace(0, 2, "MailAddCollaboratorsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailAddCollaboratorsRequest(String str, List<UserPayload> list, Boolean bool, String str2) {
        this(str, list, bool, str2, ByteString.EMPTY);
    }

    public MailAddCollaboratorsRequest(String str, List<UserPayload> list, Boolean bool, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.thread_id = str;
        this.users = Internal.immutableCopyOf("users", list);
        this.create_group = bool;
        this.message_text = str2;
    }
}
