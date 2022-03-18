package com.bytedance.lark.pb.email.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailSharePermissionCodeChange extends Message<MailSharePermissionCodeChange, C17044a> {
    public static final ProtoAdapter<MailSharePermissionCodeChange> ADAPTER = new C17045b();
    public static final PermissionCode DEFAULT_PERMISSION_CODE = PermissionCode.NONE;
    private static final long serialVersionUID = 0;
    public final PermissionCode permission_code;
    public final String thread_id;

    /* renamed from: com.bytedance.lark.pb.email.v1.MailSharePermissionCodeChange$b */
    private static final class C17045b extends ProtoAdapter<MailSharePermissionCodeChange> {
        C17045b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailSharePermissionCodeChange.class);
        }

        /* renamed from: a */
        public int encodedSize(MailSharePermissionCodeChange mailSharePermissionCodeChange) {
            int i;
            int i2 = 0;
            if (mailSharePermissionCodeChange.thread_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailSharePermissionCodeChange.thread_id);
            } else {
                i = 0;
            }
            if (mailSharePermissionCodeChange.permission_code != null) {
                i2 = PermissionCode.ADAPTER.encodedSizeWithTag(2, mailSharePermissionCodeChange.permission_code);
            }
            return i + i2 + mailSharePermissionCodeChange.unknownFields().size();
        }

        /* renamed from: a */
        public MailSharePermissionCodeChange decode(ProtoReader protoReader) throws IOException {
            C17044a aVar = new C17044a();
            aVar.f43698a = "";
            aVar.f43699b = PermissionCode.NONE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43698a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f43699b = PermissionCode.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailSharePermissionCodeChange mailSharePermissionCodeChange) throws IOException {
            if (mailSharePermissionCodeChange.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailSharePermissionCodeChange.thread_id);
            }
            if (mailSharePermissionCodeChange.permission_code != null) {
                PermissionCode.ADAPTER.encodeWithTag(protoWriter, 2, mailSharePermissionCodeChange.permission_code);
            }
            protoWriter.writeBytes(mailSharePermissionCodeChange.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.v1.MailSharePermissionCodeChange$a */
    public static final class C17044a extends Message.Builder<MailSharePermissionCodeChange, C17044a> {

        /* renamed from: a */
        public String f43698a;

        /* renamed from: b */
        public PermissionCode f43699b;

        /* renamed from: a */
        public MailSharePermissionCodeChange build() {
            return new MailSharePermissionCodeChange(this.f43698a, this.f43699b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17044a newBuilder() {
        C17044a aVar = new C17044a();
        aVar.f43698a = this.thread_id;
        aVar.f43699b = this.permission_code;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailSharePermissionCodeChange");
        StringBuilder sb = new StringBuilder();
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        if (this.permission_code != null) {
            sb.append(", permission_code=");
            sb.append(this.permission_code);
        }
        StringBuilder replace = sb.replace(0, 2, "MailSharePermissionCodeChange{");
        replace.append('}');
        return replace.toString();
    }

    public MailSharePermissionCodeChange(String str, PermissionCode permissionCode) {
        this(str, permissionCode, ByteString.EMPTY);
    }

    public MailSharePermissionCodeChange(String str, PermissionCode permissionCode, ByteString byteString) {
        super(ADAPTER, byteString);
        this.thread_id = str;
        this.permission_code = permissionCode;
    }
}
