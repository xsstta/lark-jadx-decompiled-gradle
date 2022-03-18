package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetDraftItemResponse extends Message<MailGetDraftItemResponse, C16714a> {
    public static final ProtoAdapter<MailGetDraftItemResponse> ADAPTER = new C16715b();
    public static final PermissionCode DEFAULT_PERMISSION_CODE = PermissionCode.NONE;
    private static final long serialVersionUID = 0;
    public final Draft draft;
    public final PermissionCode permission_code;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetDraftItemResponse$b */
    private static final class C16715b extends ProtoAdapter<MailGetDraftItemResponse> {
        C16715b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetDraftItemResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetDraftItemResponse mailGetDraftItemResponse) {
            int i;
            int i2 = 0;
            if (mailGetDraftItemResponse.draft != null) {
                i = Draft.ADAPTER.encodedSizeWithTag(1, mailGetDraftItemResponse.draft);
            } else {
                i = 0;
            }
            if (mailGetDraftItemResponse.permission_code != null) {
                i2 = PermissionCode.ADAPTER.encodedSizeWithTag(2, mailGetDraftItemResponse.permission_code);
            }
            return i + i2 + mailGetDraftItemResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetDraftItemResponse decode(ProtoReader protoReader) throws IOException {
            C16714a aVar = new C16714a();
            aVar.f43178b = PermissionCode.NONE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43177a = Draft.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f43178b = PermissionCode.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetDraftItemResponse mailGetDraftItemResponse) throws IOException {
            if (mailGetDraftItemResponse.draft != null) {
                Draft.ADAPTER.encodeWithTag(protoWriter, 1, mailGetDraftItemResponse.draft);
            }
            if (mailGetDraftItemResponse.permission_code != null) {
                PermissionCode.ADAPTER.encodeWithTag(protoWriter, 2, mailGetDraftItemResponse.permission_code);
            }
            protoWriter.writeBytes(mailGetDraftItemResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetDraftItemResponse$a */
    public static final class C16714a extends Message.Builder<MailGetDraftItemResponse, C16714a> {

        /* renamed from: a */
        public Draft f43177a;

        /* renamed from: b */
        public PermissionCode f43178b;

        /* renamed from: a */
        public MailGetDraftItemResponse build() {
            return new MailGetDraftItemResponse(this.f43177a, this.f43178b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16714a newBuilder() {
        C16714a aVar = new C16714a();
        aVar.f43177a = this.draft;
        aVar.f43178b = this.permission_code;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetDraftItemResponse");
        StringBuilder sb = new StringBuilder();
        if (this.draft != null) {
            sb.append(", draft=");
            sb.append(this.draft);
        }
        if (this.permission_code != null) {
            sb.append(", permission_code=");
            sb.append(this.permission_code);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetDraftItemResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetDraftItemResponse(Draft draft2, PermissionCode permissionCode) {
        this(draft2, permissionCode, ByteString.EMPTY);
    }

    public MailGetDraftItemResponse(Draft draft2, PermissionCode permissionCode, ByteString byteString) {
        super(ADAPTER, byteString);
        this.draft = draft2;
        this.permission_code = permissionCode;
    }
}
