package ai.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ClientMessengerContext extends Message<ClientMessengerContext, C0039a> {
    public static final ProtoAdapter<ClientMessengerContext> ADAPTER = new C0040b();
    private static final long serialVersionUID = 0;
    public final String chat_id;

    /* renamed from: ai.v1.ClientMessengerContext$b */
    private static final class C0040b extends ProtoAdapter<ClientMessengerContext> {
        C0040b() {
            super(FieldEncoding.LENGTH_DELIMITED, ClientMessengerContext.class);
        }

        /* renamed from: a */
        public int encodedSize(ClientMessengerContext clientMessengerContext) {
            int i;
            if (clientMessengerContext.chat_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, clientMessengerContext.chat_id);
            } else {
                i = 0;
            }
            return i + clientMessengerContext.unknownFields().size();
        }

        /* renamed from: a */
        public ClientMessengerContext decode(ProtoReader protoReader) throws IOException {
            C0039a aVar = new C0039a();
            aVar.f66a = "";
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
                    aVar.f66a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ClientMessengerContext clientMessengerContext) throws IOException {
            if (clientMessengerContext.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, clientMessengerContext.chat_id);
            }
            protoWriter.writeBytes(clientMessengerContext.unknownFields());
        }
    }

    /* renamed from: ai.v1.ClientMessengerContext$a */
    public static final class C0039a extends Message.Builder<ClientMessengerContext, C0039a> {

        /* renamed from: a */
        public String f66a;

        /* renamed from: a */
        public ClientMessengerContext build() {
            return new ClientMessengerContext(this.f66a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C0039a newBuilder() {
        C0039a aVar = new C0039a();
        aVar.f66a = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ai", "ClientMessengerContext");
        StringBuilder sb = new StringBuilder();
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        StringBuilder replace = sb.replace(0, 2, "ClientMessengerContext{");
        replace.append('}');
        return replace.toString();
    }

    public ClientMessengerContext(String str) {
        this(str, ByteString.EMPTY);
    }

    public ClientMessengerContext(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
    }
}
