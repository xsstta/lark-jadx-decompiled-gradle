package ai.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetEnterpriseTopicResponse extends Message<GetEnterpriseTopicResponse, C0059a> {
    public static final ProtoAdapter<GetEnterpriseTopicResponse> ADAPTER = new C0060b();
    private static final long serialVersionUID = 0;
    public final EntityCard card;

    /* renamed from: ai.v1.GetEnterpriseTopicResponse$b */
    private static final class C0060b extends ProtoAdapter<GetEnterpriseTopicResponse> {
        C0060b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetEnterpriseTopicResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetEnterpriseTopicResponse getEnterpriseTopicResponse) {
            int i;
            if (getEnterpriseTopicResponse.card != null) {
                i = EntityCard.ADAPTER.encodedSizeWithTag(1, getEnterpriseTopicResponse.card);
            } else {
                i = 0;
            }
            return i + getEnterpriseTopicResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetEnterpriseTopicResponse decode(ProtoReader protoReader) throws IOException {
            C0059a aVar = new C0059a();
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
                    aVar.f101a = EntityCard.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetEnterpriseTopicResponse getEnterpriseTopicResponse) throws IOException {
            if (getEnterpriseTopicResponse.card != null) {
                EntityCard.ADAPTER.encodeWithTag(protoWriter, 1, getEnterpriseTopicResponse.card);
            }
            protoWriter.writeBytes(getEnterpriseTopicResponse.unknownFields());
        }
    }

    /* renamed from: ai.v1.GetEnterpriseTopicResponse$a */
    public static final class C0059a extends Message.Builder<GetEnterpriseTopicResponse, C0059a> {

        /* renamed from: a */
        public EntityCard f101a;

        /* renamed from: a */
        public GetEnterpriseTopicResponse build() {
            return new GetEnterpriseTopicResponse(this.f101a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C0059a newBuilder() {
        C0059a aVar = new C0059a();
        aVar.f101a = this.card;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ai", "GetEnterpriseTopicResponse");
        StringBuilder sb = new StringBuilder();
        if (this.card != null) {
            sb.append(", card=");
            sb.append(this.card);
        }
        StringBuilder replace = sb.replace(0, 2, "GetEnterpriseTopicResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetEnterpriseTopicResponse(EntityCard entityCard) {
        this(entityCard, ByteString.EMPTY);
    }

    public GetEnterpriseTopicResponse(EntityCard entityCard, ByteString byteString) {
        super(ADAPTER, byteString);
        this.card = entityCard;
    }
}
