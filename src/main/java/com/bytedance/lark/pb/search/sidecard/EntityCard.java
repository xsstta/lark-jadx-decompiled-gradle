package com.bytedance.lark.pb.search.sidecard;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class EntityCard extends Message<EntityCard, C18799a> {
    public static final ProtoAdapter<EntityCard> ADAPTER = new C18800b();
    private static final long serialVersionUID = 0;
    public final String id;

    /* renamed from: com.bytedance.lark.pb.search.sidecard.EntityCard$b */
    private static final class C18800b extends ProtoAdapter<EntityCard> {
        C18800b() {
            super(FieldEncoding.LENGTH_DELIMITED, EntityCard.class);
        }

        /* renamed from: a */
        public int encodedSize(EntityCard entityCard) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, entityCard.id) + entityCard.unknownFields().size();
        }

        /* renamed from: a */
        public EntityCard decode(ProtoReader protoReader) throws IOException {
            C18799a aVar = new C18799a();
            aVar.f46364a = "";
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
                    aVar.f46364a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, EntityCard entityCard) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, entityCard.id);
            protoWriter.writeBytes(entityCard.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.sidecard.EntityCard$a */
    public static final class C18799a extends Message.Builder<EntityCard, C18799a> {

        /* renamed from: a */
        public String f46364a;

        /* renamed from: a */
        public EntityCard build() {
            String str = this.f46364a;
            if (str != null) {
                return new EntityCard(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C18799a newBuilder() {
        C18799a aVar = new C18799a();
        aVar.f46364a = this.id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "EntityCard");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        StringBuilder replace = sb.replace(0, 2, "EntityCard{");
        replace.append('}');
        return replace.toString();
    }

    public EntityCard(String str) {
        this(str, ByteString.EMPTY);
    }

    public EntityCard(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
    }
}
