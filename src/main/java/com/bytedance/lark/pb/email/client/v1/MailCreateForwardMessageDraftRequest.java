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

public final class MailCreateForwardMessageDraftRequest extends Message<MailCreateForwardMessageDraftRequest, C16668a> {
    public static final ProtoAdapter<MailCreateForwardMessageDraftRequest> ADAPTER = new C16669b();
    public static final MailCreateDraftRequest.CreateDraftAction DEFAULT_ACTION = MailCreateDraftRequest.CreateDraftAction.COMPOSE;
    public static final Boolean DEFAULT_NEED_SIGNATURE = false;
    private static final long serialVersionUID = 0;
    public final MailCreateDraftRequest.CreateDraftAction action;
    public final String card_id;
    public final String message_id;
    public final Boolean need_signature;
    public final String owner_user_id;
    public final String time_text;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCreateForwardMessageDraftRequest$b */
    private static final class C16669b extends ProtoAdapter<MailCreateForwardMessageDraftRequest> {
        C16669b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailCreateForwardMessageDraftRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailCreateForwardMessageDraftRequest mailCreateForwardMessageDraftRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (mailCreateForwardMessageDraftRequest.message_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailCreateForwardMessageDraftRequest.message_id);
            } else {
                i = 0;
            }
            if (mailCreateForwardMessageDraftRequest.owner_user_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mailCreateForwardMessageDraftRequest.owner_user_id);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (mailCreateForwardMessageDraftRequest.action != null) {
                i3 = MailCreateDraftRequest.CreateDraftAction.ADAPTER.encodedSizeWithTag(3, mailCreateForwardMessageDraftRequest.action);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (mailCreateForwardMessageDraftRequest.time_text != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, mailCreateForwardMessageDraftRequest.time_text);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (mailCreateForwardMessageDraftRequest.card_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, mailCreateForwardMessageDraftRequest.card_id);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (mailCreateForwardMessageDraftRequest.need_signature != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, mailCreateForwardMessageDraftRequest.need_signature);
            }
            return i10 + i6 + mailCreateForwardMessageDraftRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailCreateForwardMessageDraftRequest decode(ProtoReader protoReader) throws IOException {
            C16668a aVar = new C16668a();
            aVar.f43131a = "";
            aVar.f43132b = "";
            aVar.f43133c = MailCreateDraftRequest.CreateDraftAction.COMPOSE;
            aVar.f43134d = "";
            aVar.f43135e = "";
            aVar.f43136f = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f43131a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f43132b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f43133c = MailCreateDraftRequest.CreateDraftAction.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f43134d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f43135e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f43136f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailCreateForwardMessageDraftRequest mailCreateForwardMessageDraftRequest) throws IOException {
            if (mailCreateForwardMessageDraftRequest.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailCreateForwardMessageDraftRequest.message_id);
            }
            if (mailCreateForwardMessageDraftRequest.owner_user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailCreateForwardMessageDraftRequest.owner_user_id);
            }
            if (mailCreateForwardMessageDraftRequest.action != null) {
                MailCreateDraftRequest.CreateDraftAction.ADAPTER.encodeWithTag(protoWriter, 3, mailCreateForwardMessageDraftRequest.action);
            }
            if (mailCreateForwardMessageDraftRequest.time_text != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, mailCreateForwardMessageDraftRequest.time_text);
            }
            if (mailCreateForwardMessageDraftRequest.card_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, mailCreateForwardMessageDraftRequest.card_id);
            }
            if (mailCreateForwardMessageDraftRequest.need_signature != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, mailCreateForwardMessageDraftRequest.need_signature);
            }
            protoWriter.writeBytes(mailCreateForwardMessageDraftRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCreateForwardMessageDraftRequest$a */
    public static final class C16668a extends Message.Builder<MailCreateForwardMessageDraftRequest, C16668a> {

        /* renamed from: a */
        public String f43131a;

        /* renamed from: b */
        public String f43132b;

        /* renamed from: c */
        public MailCreateDraftRequest.CreateDraftAction f43133c;

        /* renamed from: d */
        public String f43134d;

        /* renamed from: e */
        public String f43135e;

        /* renamed from: f */
        public Boolean f43136f;

        /* renamed from: a */
        public MailCreateForwardMessageDraftRequest build() {
            return new MailCreateForwardMessageDraftRequest(this.f43131a, this.f43132b, this.f43133c, this.f43134d, this.f43135e, this.f43136f, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16668a mo59240a(MailCreateDraftRequest.CreateDraftAction createDraftAction) {
            this.f43133c = createDraftAction;
            return this;
        }

        /* renamed from: b */
        public C16668a mo59244b(String str) {
            this.f43132b = str;
            return this;
        }

        /* renamed from: c */
        public C16668a mo59245c(String str) {
            this.f43135e = str;
            return this;
        }

        /* renamed from: a */
        public C16668a mo59241a(Boolean bool) {
            this.f43136f = bool;
            return this;
        }

        /* renamed from: a */
        public C16668a mo59242a(String str) {
            this.f43131a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16668a newBuilder() {
        C16668a aVar = new C16668a();
        aVar.f43131a = this.message_id;
        aVar.f43132b = this.owner_user_id;
        aVar.f43133c = this.action;
        aVar.f43134d = this.time_text;
        aVar.f43135e = this.card_id;
        aVar.f43136f = this.need_signature;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailCreateForwardMessageDraftRequest");
        StringBuilder sb = new StringBuilder();
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.owner_user_id != null) {
            sb.append(", owner_user_id=");
            sb.append(this.owner_user_id);
        }
        if (this.action != null) {
            sb.append(", action=");
            sb.append(this.action);
        }
        if (this.time_text != null) {
            sb.append(", time_text=");
            sb.append(this.time_text);
        }
        if (this.card_id != null) {
            sb.append(", card_id=");
            sb.append(this.card_id);
        }
        if (this.need_signature != null) {
            sb.append(", need_signature=");
            sb.append(this.need_signature);
        }
        StringBuilder replace = sb.replace(0, 2, "MailCreateForwardMessageDraftRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailCreateForwardMessageDraftRequest(String str, String str2, MailCreateDraftRequest.CreateDraftAction createDraftAction, String str3, String str4, Boolean bool) {
        this(str, str2, createDraftAction, str3, str4, bool, ByteString.EMPTY);
    }

    public MailCreateForwardMessageDraftRequest(String str, String str2, MailCreateDraftRequest.CreateDraftAction createDraftAction, String str3, String str4, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
        this.owner_user_id = str2;
        this.action = createDraftAction;
        this.time_text = str3;
        this.card_id = str4;
        this.need_signature = bool;
    }
}
