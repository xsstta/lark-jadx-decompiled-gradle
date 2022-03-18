package com.bytedance.lark.pb.email.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailCacheInvalidChange extends Message<MailCacheInvalidChange, C17010a> {
    public static final ProtoAdapter<MailCacheInvalidChange> ADAPTER = new C17011b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.email.v1.MailCacheInvalidChange$b */
    private static final class C17011b extends ProtoAdapter<MailCacheInvalidChange> {
        C17011b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailCacheInvalidChange.class);
        }

        /* renamed from: a */
        public int encodedSize(MailCacheInvalidChange mailCacheInvalidChange) {
            return mailCacheInvalidChange.unknownFields().size();
        }

        /* renamed from: a */
        public MailCacheInvalidChange decode(ProtoReader protoReader) throws IOException {
            C17010a aVar = new C17010a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailCacheInvalidChange mailCacheInvalidChange) throws IOException {
            protoWriter.writeBytes(mailCacheInvalidChange.unknownFields());
        }
    }

    public MailCacheInvalidChange() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.email.v1.MailCacheInvalidChange$a */
    public static final class C17010a extends Message.Builder<MailCacheInvalidChange, C17010a> {
        /* renamed from: a */
        public MailCacheInvalidChange build() {
            return new MailCacheInvalidChange(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17010a newBuilder() {
        C17010a aVar = new C17010a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailCacheInvalidChange");
        StringBuilder replace = new StringBuilder().replace(0, 2, "MailCacheInvalidChange{");
        replace.append('}');
        return replace.toString();
    }

    public MailCacheInvalidChange(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
