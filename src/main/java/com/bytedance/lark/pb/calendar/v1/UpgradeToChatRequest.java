package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class UpgradeToChatRequest extends Message<UpgradeToChatRequest, C16102a> {
    public static final ProtoAdapter<UpgradeToChatRequest> ADAPTER = new C16103b();
    private static final long serialVersionUID = 0;
    public final String chat_id;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.UpgradeToChatRequest$b */
    private static final class C16103b extends ProtoAdapter<UpgradeToChatRequest> {
        C16103b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpgradeToChatRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpgradeToChatRequest upgradeToChatRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, upgradeToChatRequest.chat_id) + upgradeToChatRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpgradeToChatRequest decode(ProtoReader protoReader) throws IOException {
            C16102a aVar = new C16102a();
            aVar.f42188a = "";
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
                    aVar.f42188a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpgradeToChatRequest upgradeToChatRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, upgradeToChatRequest.chat_id);
            protoWriter.writeBytes(upgradeToChatRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.UpgradeToChatRequest$a */
    public static final class C16102a extends Message.Builder<UpgradeToChatRequest, C16102a> {

        /* renamed from: a */
        public String f42188a;

        /* renamed from: a */
        public UpgradeToChatRequest build() {
            String str = this.f42188a;
            if (str != null) {
                return new UpgradeToChatRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }

        /* renamed from: a */
        public C16102a mo57849a(String str) {
            this.f42188a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16102a newBuilder() {
        C16102a aVar = new C16102a();
        aVar.f42188a = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "UpgradeToChatRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        StringBuilder replace = sb.replace(0, 2, "UpgradeToChatRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpgradeToChatRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public UpgradeToChatRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
    }
}
