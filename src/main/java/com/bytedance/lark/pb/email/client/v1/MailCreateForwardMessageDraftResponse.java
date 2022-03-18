package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailCreateForwardMessageDraftResponse extends Message<MailCreateForwardMessageDraftResponse, C16670a> {
    public static final ProtoAdapter<MailCreateForwardMessageDraftResponse> ADAPTER = new C16671b();
    public static final Boolean DEFAULT_CAN_REPLY = false;
    public static final PermissionCode DEFAULT_PERMISSION_CODE = PermissionCode.NONE;
    private static final long serialVersionUID = 0;
    public final Boolean can_reply;
    public final Draft draft;
    public final PermissionCode permission_code;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCreateForwardMessageDraftResponse$b */
    private static final class C16671b extends ProtoAdapter<MailCreateForwardMessageDraftResponse> {
        C16671b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailCreateForwardMessageDraftResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailCreateForwardMessageDraftResponse mailCreateForwardMessageDraftResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (mailCreateForwardMessageDraftResponse.can_reply != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, mailCreateForwardMessageDraftResponse.can_reply);
            } else {
                i = 0;
            }
            if (mailCreateForwardMessageDraftResponse.draft != null) {
                i2 = Draft.ADAPTER.encodedSizeWithTag(2, mailCreateForwardMessageDraftResponse.draft);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (mailCreateForwardMessageDraftResponse.permission_code != null) {
                i3 = PermissionCode.ADAPTER.encodedSizeWithTag(3, mailCreateForwardMessageDraftResponse.permission_code);
            }
            return i4 + i3 + mailCreateForwardMessageDraftResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailCreateForwardMessageDraftResponse decode(ProtoReader protoReader) throws IOException {
            C16670a aVar = new C16670a();
            aVar.f43137a = false;
            aVar.f43139c = PermissionCode.NONE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43137a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43138b = Draft.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f43139c = PermissionCode.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailCreateForwardMessageDraftResponse mailCreateForwardMessageDraftResponse) throws IOException {
            if (mailCreateForwardMessageDraftResponse.can_reply != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, mailCreateForwardMessageDraftResponse.can_reply);
            }
            if (mailCreateForwardMessageDraftResponse.draft != null) {
                Draft.ADAPTER.encodeWithTag(protoWriter, 2, mailCreateForwardMessageDraftResponse.draft);
            }
            if (mailCreateForwardMessageDraftResponse.permission_code != null) {
                PermissionCode.ADAPTER.encodeWithTag(protoWriter, 3, mailCreateForwardMessageDraftResponse.permission_code);
            }
            protoWriter.writeBytes(mailCreateForwardMessageDraftResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCreateForwardMessageDraftResponse$a */
    public static final class C16670a extends Message.Builder<MailCreateForwardMessageDraftResponse, C16670a> {

        /* renamed from: a */
        public Boolean f43137a;

        /* renamed from: b */
        public Draft f43138b;

        /* renamed from: c */
        public PermissionCode f43139c;

        /* renamed from: a */
        public MailCreateForwardMessageDraftResponse build() {
            return new MailCreateForwardMessageDraftResponse(this.f43137a, this.f43138b, this.f43139c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16670a newBuilder() {
        C16670a aVar = new C16670a();
        aVar.f43137a = this.can_reply;
        aVar.f43138b = this.draft;
        aVar.f43139c = this.permission_code;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailCreateForwardMessageDraftResponse");
        StringBuilder sb = new StringBuilder();
        if (this.can_reply != null) {
            sb.append(", can_reply=");
            sb.append(this.can_reply);
        }
        if (this.draft != null) {
            sb.append(", draft=");
            sb.append(this.draft);
        }
        if (this.permission_code != null) {
            sb.append(", permission_code=");
            sb.append(this.permission_code);
        }
        StringBuilder replace = sb.replace(0, 2, "MailCreateForwardMessageDraftResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailCreateForwardMessageDraftResponse(Boolean bool, Draft draft2, PermissionCode permissionCode) {
        this(bool, draft2, permissionCode, ByteString.EMPTY);
    }

    public MailCreateForwardMessageDraftResponse(Boolean bool, Draft draft2, PermissionCode permissionCode, ByteString byteString) {
        super(ADAPTER, byteString);
        this.can_reply = bool;
        this.draft = draft2;
        this.permission_code = permissionCode;
    }
}
