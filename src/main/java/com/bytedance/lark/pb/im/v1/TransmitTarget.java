package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class TransmitTarget extends Message<TransmitTarget, C18119a> {
    public static final ProtoAdapter<TransmitTarget> ADAPTER = new C18120b();
    private static final long serialVersionUID = 0;
    public final String chat_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.TransmitTarget$b */
    private static final class C18120b extends ProtoAdapter<TransmitTarget> {
        C18120b() {
            super(FieldEncoding.LENGTH_DELIMITED, TransmitTarget.class);
        }

        /* renamed from: a */
        public int encodedSize(TransmitTarget transmitTarget) {
            int i;
            if (transmitTarget.chat_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, transmitTarget.chat_id);
            } else {
                i = 0;
            }
            return i + transmitTarget.unknownFields().size();
        }

        /* renamed from: a */
        public TransmitTarget decode(ProtoReader protoReader) throws IOException {
            C18119a aVar = new C18119a();
            aVar.mo62848a("");
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.mo62848a(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TransmitTarget transmitTarget) throws IOException {
            if (transmitTarget.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, transmitTarget.chat_id);
            }
            protoWriter.writeBytes(transmitTarget.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.TransmitTarget$a */
    public static final class C18119a extends Message.Builder<TransmitTarget, C18119a> {

        /* renamed from: a */
        public String f45276a;

        /* renamed from: a */
        public TransmitTarget build() {
            return new TransmitTarget(this.f45276a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18119a mo62848a(String str) {
            this.f45276a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18119a newBuilder() {
        C18119a aVar = new C18119a();
        aVar.f45276a = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "TransmitTarget");
        StringBuilder sb = new StringBuilder();
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        StringBuilder replace = sb.replace(0, 2, "TransmitTarget{");
        replace.append('}');
        return replace.toString();
    }

    public TransmitTarget(String str) {
        this(str, ByteString.EMPTY);
    }

    public TransmitTarget(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
    }
}
