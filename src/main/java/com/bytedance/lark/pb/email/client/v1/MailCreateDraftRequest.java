package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class MailCreateDraftRequest extends Message<MailCreateDraftRequest, C16664a> {
    public static final ProtoAdapter<MailCreateDraftRequest> ADAPTER = new C16665b();
    public static final CreateDraftAction DEFAULT_ACTION = CreateDraftAction.COMPOSE;
    public static final Boolean DEFAULT_NEED_SIGNATURE = false;
    private static final long serialVersionUID = 0;
    public final CreateDraftAction action;
    public final Boolean need_signature;
    public final String origin_message_id;
    public final String smart_reply_text;
    public final String thread_id;
    public final String time_text;

    public enum CreateDraftAction implements WireEnum {
        COMPOSE(0),
        REPLY(1),
        REPLY_ALL(2),
        FORWARD(3);
        
        public static final ProtoAdapter<CreateDraftAction> ADAPTER = ProtoAdapter.newEnumAdapter(CreateDraftAction.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static CreateDraftAction fromValue(int i) {
            if (i == 0) {
                return COMPOSE;
            }
            if (i == 1) {
                return REPLY;
            }
            if (i == 2) {
                return REPLY_ALL;
            }
            if (i != 3) {
                return null;
            }
            return FORWARD;
        }

        private CreateDraftAction(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCreateDraftRequest$b */
    private static final class C16665b extends ProtoAdapter<MailCreateDraftRequest> {
        C16665b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailCreateDraftRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailCreateDraftRequest mailCreateDraftRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (mailCreateDraftRequest.origin_message_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailCreateDraftRequest.origin_message_id);
            } else {
                i = 0;
            }
            if (mailCreateDraftRequest.action != null) {
                i2 = CreateDraftAction.ADAPTER.encodedSizeWithTag(2, mailCreateDraftRequest.action);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (mailCreateDraftRequest.thread_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, mailCreateDraftRequest.thread_id);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (mailCreateDraftRequest.smart_reply_text != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, mailCreateDraftRequest.smart_reply_text);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (mailCreateDraftRequest.time_text != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, mailCreateDraftRequest.time_text);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (mailCreateDraftRequest.need_signature != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, mailCreateDraftRequest.need_signature);
            }
            return i10 + i6 + mailCreateDraftRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailCreateDraftRequest decode(ProtoReader protoReader) throws IOException {
            C16664a aVar = new C16664a();
            aVar.f43124a = "";
            aVar.f43125b = CreateDraftAction.COMPOSE;
            aVar.f43126c = "";
            aVar.f43127d = "";
            aVar.f43128e = "";
            aVar.f43129f = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f43124a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f43125b = CreateDraftAction.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f43126c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f43127d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f43128e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f43129f = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, MailCreateDraftRequest mailCreateDraftRequest) throws IOException {
            if (mailCreateDraftRequest.origin_message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailCreateDraftRequest.origin_message_id);
            }
            if (mailCreateDraftRequest.action != null) {
                CreateDraftAction.ADAPTER.encodeWithTag(protoWriter, 2, mailCreateDraftRequest.action);
            }
            if (mailCreateDraftRequest.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, mailCreateDraftRequest.thread_id);
            }
            if (mailCreateDraftRequest.smart_reply_text != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, mailCreateDraftRequest.smart_reply_text);
            }
            if (mailCreateDraftRequest.time_text != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, mailCreateDraftRequest.time_text);
            }
            if (mailCreateDraftRequest.need_signature != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, mailCreateDraftRequest.need_signature);
            }
            protoWriter.writeBytes(mailCreateDraftRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCreateDraftRequest$a */
    public static final class C16664a extends Message.Builder<MailCreateDraftRequest, C16664a> {

        /* renamed from: a */
        public String f43124a;

        /* renamed from: b */
        public CreateDraftAction f43125b;

        /* renamed from: c */
        public String f43126c;

        /* renamed from: d */
        public String f43127d;

        /* renamed from: e */
        public String f43128e;

        /* renamed from: f */
        public Boolean f43129f;

        /* renamed from: a */
        public MailCreateDraftRequest build() {
            return new MailCreateDraftRequest(this.f43124a, this.f43125b, this.f43126c, this.f43127d, this.f43128e, this.f43129f, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16664a mo59228a(CreateDraftAction createDraftAction) {
            this.f43125b = createDraftAction;
            return this;
        }

        /* renamed from: b */
        public C16664a mo59232b(String str) {
            this.f43126c = str;
            return this;
        }

        /* renamed from: a */
        public C16664a mo59229a(Boolean bool) {
            this.f43129f = bool;
            return this;
        }

        /* renamed from: a */
        public C16664a mo59230a(String str) {
            this.f43124a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16664a newBuilder() {
        C16664a aVar = new C16664a();
        aVar.f43124a = this.origin_message_id;
        aVar.f43125b = this.action;
        aVar.f43126c = this.thread_id;
        aVar.f43127d = this.smart_reply_text;
        aVar.f43128e = this.time_text;
        aVar.f43129f = this.need_signature;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailCreateDraftRequest");
        StringBuilder sb = new StringBuilder();
        if (this.origin_message_id != null) {
            sb.append(", origin_message_id=");
            sb.append(this.origin_message_id);
        }
        if (this.action != null) {
            sb.append(", action=");
            sb.append(this.action);
        }
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        if (this.smart_reply_text != null) {
            sb.append(", smart_reply_text=");
            sb.append(this.smart_reply_text);
        }
        if (this.time_text != null) {
            sb.append(", time_text=");
            sb.append(this.time_text);
        }
        if (this.need_signature != null) {
            sb.append(", need_signature=");
            sb.append(this.need_signature);
        }
        StringBuilder replace = sb.replace(0, 2, "MailCreateDraftRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailCreateDraftRequest(String str, CreateDraftAction createDraftAction, String str2, String str3, String str4, Boolean bool) {
        this(str, createDraftAction, str2, str3, str4, bool, ByteString.EMPTY);
    }

    public MailCreateDraftRequest(String str, CreateDraftAction createDraftAction, String str2, String str3, String str4, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.origin_message_id = str;
        this.action = createDraftAction;
        this.thread_id = str2;
        this.smart_reply_text = str3;
        this.time_text = str4;
        this.need_signature = bool;
    }
}
