package com.bytedance.lark.pb.contact.v1;

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

public final class SendInvitationToInactiveRequest extends Message<SendInvitationToInactiveRequest, C16368a> {
    public static final ProtoAdapter<SendInvitationToInactiveRequest> ADAPTER = new C16369b();
    public static final InviteMode DEFAULT_INVITE_MODE = InviteMode.SELECTED;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final String department_id;
    public final InviteMode invite_mode;
    public final List<String> parent_id;

    /* renamed from: com.bytedance.lark.pb.contact.v1.SendInvitationToInactiveRequest$b */
    private static final class C16369b extends ProtoAdapter<SendInvitationToInactiveRequest> {
        C16369b() {
            super(FieldEncoding.LENGTH_DELIMITED, SendInvitationToInactiveRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SendInvitationToInactiveRequest sendInvitationToInactiveRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, sendInvitationToInactiveRequest.parent_id);
            int i3 = 0;
            if (sendInvitationToInactiveRequest.department_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, sendInvitationToInactiveRequest.department_id);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (sendInvitationToInactiveRequest.chat_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, sendInvitationToInactiveRequest.chat_id);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (sendInvitationToInactiveRequest.invite_mode != null) {
                i3 = InviteMode.ADAPTER.encodedSizeWithTag(4, sendInvitationToInactiveRequest.invite_mode);
            }
            return i5 + i3 + sendInvitationToInactiveRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SendInvitationToInactiveRequest decode(ProtoReader protoReader) throws IOException {
            C16368a aVar = new C16368a();
            aVar.f42628b = "";
            aVar.f42629c = "";
            aVar.f42630d = InviteMode.SELECTED;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42627a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f42628b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f42629c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f42630d = InviteMode.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SendInvitationToInactiveRequest sendInvitationToInactiveRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, sendInvitationToInactiveRequest.parent_id);
            if (sendInvitationToInactiveRequest.department_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, sendInvitationToInactiveRequest.department_id);
            }
            if (sendInvitationToInactiveRequest.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, sendInvitationToInactiveRequest.chat_id);
            }
            if (sendInvitationToInactiveRequest.invite_mode != null) {
                InviteMode.ADAPTER.encodeWithTag(protoWriter, 4, sendInvitationToInactiveRequest.invite_mode);
            }
            protoWriter.writeBytes(sendInvitationToInactiveRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.SendInvitationToInactiveRequest$a */
    public static final class C16368a extends Message.Builder<SendInvitationToInactiveRequest, C16368a> {

        /* renamed from: a */
        public List<String> f42627a = Internal.newMutableList();

        /* renamed from: b */
        public String f42628b;

        /* renamed from: c */
        public String f42629c;

        /* renamed from: d */
        public InviteMode f42630d;

        /* renamed from: a */
        public SendInvitationToInactiveRequest build() {
            return new SendInvitationToInactiveRequest(this.f42627a, this.f42628b, this.f42629c, this.f42630d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16368a mo58470a(InviteMode inviteMode) {
            this.f42630d = inviteMode;
            return this;
        }

        /* renamed from: b */
        public C16368a mo58474b(String str) {
            this.f42629c = str;
            return this;
        }

        /* renamed from: a */
        public C16368a mo58471a(String str) {
            this.f42628b = str;
            return this;
        }

        /* renamed from: a */
        public C16368a mo58472a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f42627a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16368a newBuilder() {
        C16368a aVar = new C16368a();
        aVar.f42627a = Internal.copyOf("parent_id", this.parent_id);
        aVar.f42628b = this.department_id;
        aVar.f42629c = this.chat_id;
        aVar.f42630d = this.invite_mode;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "SendInvitationToInactiveRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.parent_id.isEmpty()) {
            sb.append(", parent_id=");
            sb.append(this.parent_id);
        }
        if (this.department_id != null) {
            sb.append(", department_id=");
            sb.append(this.department_id);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.invite_mode != null) {
            sb.append(", invite_mode=");
            sb.append(this.invite_mode);
        }
        StringBuilder replace = sb.replace(0, 2, "SendInvitationToInactiveRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SendInvitationToInactiveRequest(List<String> list, String str, String str2, InviteMode inviteMode) {
        this(list, str, str2, inviteMode, ByteString.EMPTY);
    }

    public SendInvitationToInactiveRequest(List<String> list, String str, String str2, InviteMode inviteMode, ByteString byteString) {
        super(ADAPTER, byteString);
        this.parent_id = Internal.immutableCopyOf("parent_id", list);
        this.department_id = str;
        this.chat_id = str2;
        this.invite_mode = inviteMode;
    }
}
