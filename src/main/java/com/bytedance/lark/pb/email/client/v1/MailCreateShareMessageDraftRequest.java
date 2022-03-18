package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.email.client.v1.MailCreateDraftRequest;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailCreateShareMessageDraftRequest extends Message<MailCreateShareMessageDraftRequest, C16676a> {
    public static final ProtoAdapter<MailCreateShareMessageDraftRequest> ADAPTER = new C16677b();
    public static final MailCreateDraftRequest.CreateDraftAction DEFAULT_ACTION = MailCreateDraftRequest.CreateDraftAction.COMPOSE;
    private static final long serialVersionUID = 0;
    public final MailCreateDraftRequest.CreateDraftAction action;
    public final String message_id;
    public final String thread_id;
    public final String time_text;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCreateShareMessageDraftRequest$b */
    private static final class C16677b extends ProtoAdapter<MailCreateShareMessageDraftRequest> {
        C16677b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailCreateShareMessageDraftRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailCreateShareMessageDraftRequest mailCreateShareMessageDraftRequest) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (mailCreateShareMessageDraftRequest.message_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailCreateShareMessageDraftRequest.message_id);
            } else {
                i = 0;
            }
            if (mailCreateShareMessageDraftRequest.thread_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mailCreateShareMessageDraftRequest.thread_id);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (mailCreateShareMessageDraftRequest.action != null) {
                i3 = MailCreateDraftRequest.CreateDraftAction.ADAPTER.encodedSizeWithTag(3, mailCreateShareMessageDraftRequest.action);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (mailCreateShareMessageDraftRequest.time_text != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, mailCreateShareMessageDraftRequest.time_text);
            }
            return i6 + i4 + mailCreateShareMessageDraftRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailCreateShareMessageDraftRequest decode(ProtoReader protoReader) throws IOException {
            C16676a aVar = new C16676a();
            aVar.f43146a = "";
            aVar.f43147b = "";
            aVar.f43148c = MailCreateDraftRequest.CreateDraftAction.COMPOSE;
            aVar.f43149d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43146a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43147b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f43148c = MailCreateDraftRequest.CreateDraftAction.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43149d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailCreateShareMessageDraftRequest mailCreateShareMessageDraftRequest) throws IOException {
            if (mailCreateShareMessageDraftRequest.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailCreateShareMessageDraftRequest.message_id);
            }
            if (mailCreateShareMessageDraftRequest.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailCreateShareMessageDraftRequest.thread_id);
            }
            if (mailCreateShareMessageDraftRequest.action != null) {
                MailCreateDraftRequest.CreateDraftAction.ADAPTER.encodeWithTag(protoWriter, 3, mailCreateShareMessageDraftRequest.action);
            }
            if (mailCreateShareMessageDraftRequest.time_text != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, mailCreateShareMessageDraftRequest.time_text);
            }
            protoWriter.writeBytes(mailCreateShareMessageDraftRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCreateShareMessageDraftRequest$a */
    public static final class C16676a extends Message.Builder<MailCreateShareMessageDraftRequest, C16676a> {

        /* renamed from: a */
        public String f43146a;

        /* renamed from: b */
        public String f43147b;

        /* renamed from: c */
        public MailCreateDraftRequest.CreateDraftAction f43148c;

        /* renamed from: d */
        public String f43149d;

        /* renamed from: a */
        public MailCreateShareMessageDraftRequest build() {
            return new MailCreateShareMessageDraftRequest(this.f43146a, this.f43147b, this.f43148c, this.f43149d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16676a mo59261a(MailCreateDraftRequest.CreateDraftAction createDraftAction) {
            this.f43148c = createDraftAction;
            return this;
        }

        /* renamed from: b */
        public C16676a mo59264b(String str) {
            this.f43147b = str;
            return this;
        }

        /* renamed from: c */
        public C16676a mo59265c(String str) {
            this.f43149d = str;
            return this;
        }

        /* renamed from: a */
        public C16676a mo59262a(String str) {
            this.f43146a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16676a newBuilder() {
        C16676a aVar = new C16676a();
        aVar.f43146a = this.message_id;
        aVar.f43147b = this.thread_id;
        aVar.f43148c = this.action;
        aVar.f43149d = this.time_text;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailCreateShareMessageDraftRequest");
        StringBuilder sb = new StringBuilder();
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        if (this.action != null) {
            sb.append(", action=");
            sb.append(this.action);
        }
        if (this.time_text != null) {
            sb.append(", time_text=");
            sb.append(this.time_text);
        }
        StringBuilder replace = sb.replace(0, 2, "MailCreateShareMessageDraftRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailCreateShareMessageDraftRequest(String str, String str2, MailCreateDraftRequest.CreateDraftAction createDraftAction, String str3) {
        this(str, str2, createDraftAction, str3, ByteString.EMPTY);
    }

    public MailCreateShareMessageDraftRequest(String str, String str2, MailCreateDraftRequest.CreateDraftAction createDraftAction, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
        this.thread_id = str2;
        this.action = createDraftAction;
        this.time_text = str3;
    }
}
