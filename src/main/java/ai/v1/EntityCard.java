package ai.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class EntityCard extends Message<EntityCard, C0047a> {
    public static final ProtoAdapter<EntityCard> ADAPTER = new C0048b();
    private static final long serialVersionUID = 0;
    public final String id;
    public final List<EntityCardSection> sections;

    /* renamed from: ai.v1.EntityCard$b */
    private static final class C0048b extends ProtoAdapter<EntityCard> {
        C0048b() {
            super(FieldEncoding.LENGTH_DELIMITED, EntityCard.class);
        }

        /* renamed from: a */
        public int encodedSize(EntityCard entityCard) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, entityCard.id) + EntityCardSection.ADAPTER.asRepeated().encodedSizeWithTag(2, entityCard.sections) + entityCard.unknownFields().size();
        }

        /* renamed from: a */
        public EntityCard decode(ProtoReader protoReader) throws IOException {
            C0047a aVar = new C0047a();
            aVar.f82a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f82a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f83b.add(EntityCardSection.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, EntityCard entityCard) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, entityCard.id);
            EntityCardSection.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, entityCard.sections);
            protoWriter.writeBytes(entityCard.unknownFields());
        }
    }

    /* renamed from: ai.v1.EntityCard$a */
    public static final class C0047a extends Message.Builder<EntityCard, C0047a> {

        /* renamed from: a */
        public String f82a;

        /* renamed from: b */
        public List<EntityCardSection> f83b = Internal.newMutableList();

        /* renamed from: a */
        public EntityCard build() {
            String str = this.f82a;
            if (str != null) {
                return new EntityCard(str, this.f83b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C0047a newBuilder() {
        C0047a aVar = new C0047a();
        aVar.f82a = this.id;
        aVar.f83b = Internal.copyOf("sections", this.sections);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ai", "EntityCard");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (!this.sections.isEmpty()) {
            sb.append(", sections=");
            sb.append(this.sections);
        }
        StringBuilder replace = sb.replace(0, 2, "EntityCard{");
        replace.append('}');
        return replace.toString();
    }

    public EntityCard(String str, List<EntityCardSection> list) {
        this(str, list, ByteString.EMPTY);
    }

    public EntityCard(String str, List<EntityCardSection> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.sections = Internal.immutableCopyOf("sections", list);
    }
}
