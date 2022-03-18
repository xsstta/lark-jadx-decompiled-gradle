package com.bytedance.lark.pb.moments.v1;

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

public final class ListReactionsResponse extends Message<ListReactionsResponse, C18436a> {
    public static final ProtoAdapter<ListReactionsResponse> ADAPTER = new C18437b();
    private static final long serialVersionUID = 0;
    public final Entities entities;
    public final String next_page_token;
    public final List<Reaction> reactions;

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListReactionsResponse$b */
    private static final class C18437b extends ProtoAdapter<ListReactionsResponse> {
        C18437b() {
            super(FieldEncoding.LENGTH_DELIMITED, ListReactionsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ListReactionsResponse listReactionsResponse) {
            int i;
            int encodedSizeWithTag = Reaction.ADAPTER.asRepeated().encodedSizeWithTag(1, listReactionsResponse.reactions);
            int i2 = 0;
            if (listReactionsResponse.entities != null) {
                i = Entities.ADAPTER.encodedSizeWithTag(2, listReactionsResponse.entities);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (listReactionsResponse.next_page_token != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(11, listReactionsResponse.next_page_token);
            }
            return i3 + i2 + listReactionsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ListReactionsResponse decode(ProtoReader protoReader) throws IOException {
            C18436a aVar = new C18436a();
            aVar.f45830c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45828a.add(Reaction.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f45829b = Entities.ADAPTER.decode(protoReader);
                } else if (nextTag != 11) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45830c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ListReactionsResponse listReactionsResponse) throws IOException {
            Reaction.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, listReactionsResponse.reactions);
            if (listReactionsResponse.entities != null) {
                Entities.ADAPTER.encodeWithTag(protoWriter, 2, listReactionsResponse.entities);
            }
            if (listReactionsResponse.next_page_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, listReactionsResponse.next_page_token);
            }
            protoWriter.writeBytes(listReactionsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListReactionsResponse$a */
    public static final class C18436a extends Message.Builder<ListReactionsResponse, C18436a> {

        /* renamed from: a */
        public List<Reaction> f45828a = Internal.newMutableList();

        /* renamed from: b */
        public Entities f45829b;

        /* renamed from: c */
        public String f45830c;

        /* renamed from: a */
        public ListReactionsResponse build() {
            return new ListReactionsResponse(this.f45828a, this.f45829b, this.f45830c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18436a newBuilder() {
        C18436a aVar = new C18436a();
        aVar.f45828a = Internal.copyOf("reactions", this.reactions);
        aVar.f45829b = this.entities;
        aVar.f45830c = this.next_page_token;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "ListReactionsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.reactions.isEmpty()) {
            sb.append(", reactions=");
            sb.append(this.reactions);
        }
        if (this.entities != null) {
            sb.append(", entities=");
            sb.append(this.entities);
        }
        if (this.next_page_token != null) {
            sb.append(", next_page_token=");
            sb.append(this.next_page_token);
        }
        StringBuilder replace = sb.replace(0, 2, "ListReactionsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ListReactionsResponse(List<Reaction> list, Entities entities2, String str) {
        this(list, entities2, str, ByteString.EMPTY);
    }

    public ListReactionsResponse(List<Reaction> list, Entities entities2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.reactions = Internal.immutableCopyOf("reactions", list);
        this.entities = entities2;
        this.next_page_token = str;
    }
}
