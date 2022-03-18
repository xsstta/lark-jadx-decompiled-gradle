package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PushAccountUnregisterUserEvent extends Message<PushAccountUnregisterUserEvent, C16350a> {
    public static final ProtoAdapter<PushAccountUnregisterUserEvent> ADAPTER = new C16351b();
    private static final long serialVersionUID = 0;
    public final String user_id;

    /* renamed from: com.bytedance.lark.pb.contact.v1.PushAccountUnregisterUserEvent$b */
    private static final class C16351b extends ProtoAdapter<PushAccountUnregisterUserEvent> {
        C16351b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushAccountUnregisterUserEvent.class);
        }

        /* renamed from: a */
        public int encodedSize(PushAccountUnregisterUserEvent pushAccountUnregisterUserEvent) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, pushAccountUnregisterUserEvent.user_id) + pushAccountUnregisterUserEvent.unknownFields().size();
        }

        /* renamed from: a */
        public PushAccountUnregisterUserEvent decode(ProtoReader protoReader) throws IOException {
            C16350a aVar = new C16350a();
            aVar.f42595a = "";
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
                    aVar.f42595a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushAccountUnregisterUserEvent pushAccountUnregisterUserEvent) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushAccountUnregisterUserEvent.user_id);
            protoWriter.writeBytes(pushAccountUnregisterUserEvent.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.PushAccountUnregisterUserEvent$a */
    public static final class C16350a extends Message.Builder<PushAccountUnregisterUserEvent, C16350a> {

        /* renamed from: a */
        public String f42595a;

        /* renamed from: a */
        public PushAccountUnregisterUserEvent build() {
            String str = this.f42595a;
            if (str != null) {
                return new PushAccountUnregisterUserEvent(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "user_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C16350a newBuilder() {
        C16350a aVar = new C16350a();
        aVar.f42595a = this.user_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "PushAccountUnregisterUserEvent");
        StringBuilder sb = new StringBuilder();
        sb.append(", user_id=");
        sb.append(this.user_id);
        StringBuilder replace = sb.replace(0, 2, "PushAccountUnregisterUserEvent{");
        replace.append('}');
        return replace.toString();
    }

    public PushAccountUnregisterUserEvent(String str) {
        this(str, ByteString.EMPTY);
    }

    public PushAccountUnregisterUserEvent(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = str;
    }
}
