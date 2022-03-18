package com.bytedance.lark.pb.email.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailUnShareThreadChange extends Message<MailUnShareThreadChange, C17072a> {
    public static final ProtoAdapter<MailUnShareThreadChange> ADAPTER = new C17073b();
    private static final long serialVersionUID = 0;
    public final String operator_user_id;
    public final String thread_id;

    /* renamed from: com.bytedance.lark.pb.email.v1.MailUnShareThreadChange$b */
    private static final class C17073b extends ProtoAdapter<MailUnShareThreadChange> {
        C17073b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailUnShareThreadChange.class);
        }

        /* renamed from: a */
        public int encodedSize(MailUnShareThreadChange mailUnShareThreadChange) {
            int i;
            int i2 = 0;
            if (mailUnShareThreadChange.thread_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailUnShareThreadChange.thread_id);
            } else {
                i = 0;
            }
            if (mailUnShareThreadChange.operator_user_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mailUnShareThreadChange.operator_user_id);
            }
            return i + i2 + mailUnShareThreadChange.unknownFields().size();
        }

        /* renamed from: a */
        public MailUnShareThreadChange decode(ProtoReader protoReader) throws IOException {
            C17072a aVar = new C17072a();
            aVar.f43735a = "";
            aVar.f43736b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43735a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43736b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailUnShareThreadChange mailUnShareThreadChange) throws IOException {
            if (mailUnShareThreadChange.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailUnShareThreadChange.thread_id);
            }
            if (mailUnShareThreadChange.operator_user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailUnShareThreadChange.operator_user_id);
            }
            protoWriter.writeBytes(mailUnShareThreadChange.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.v1.MailUnShareThreadChange$a */
    public static final class C17072a extends Message.Builder<MailUnShareThreadChange, C17072a> {

        /* renamed from: a */
        public String f43735a;

        /* renamed from: b */
        public String f43736b;

        /* renamed from: a */
        public MailUnShareThreadChange build() {
            return new MailUnShareThreadChange(this.f43735a, this.f43736b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17072a newBuilder() {
        C17072a aVar = new C17072a();
        aVar.f43735a = this.thread_id;
        aVar.f43736b = this.operator_user_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailUnShareThreadChange");
        StringBuilder sb = new StringBuilder();
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        if (this.operator_user_id != null) {
            sb.append(", operator_user_id=");
            sb.append(this.operator_user_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MailUnShareThreadChange{");
        replace.append('}');
        return replace.toString();
    }

    public MailUnShareThreadChange(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public MailUnShareThreadChange(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.thread_id = str;
        this.operator_user_id = str2;
    }
}
