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

public final class ListBroadcastsResponse extends Message<ListBroadcastsResponse, C18416a> {
    public static final ProtoAdapter<ListBroadcastsResponse> ADAPTER = new C18417b();
    private static final long serialVersionUID = 0;
    public final List<Broadcast> broadcasts;
    public final Entities entities;

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListBroadcastsResponse$b */
    private static final class C18417b extends ProtoAdapter<ListBroadcastsResponse> {
        C18417b() {
            super(FieldEncoding.LENGTH_DELIMITED, ListBroadcastsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ListBroadcastsResponse listBroadcastsResponse) {
            int i;
            int encodedSizeWithTag = Broadcast.ADAPTER.asRepeated().encodedSizeWithTag(1, listBroadcastsResponse.broadcasts);
            if (listBroadcastsResponse.entities != null) {
                i = Entities.ADAPTER.encodedSizeWithTag(2, listBroadcastsResponse.entities);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + listBroadcastsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ListBroadcastsResponse decode(ProtoReader protoReader) throws IOException {
            C18416a aVar = new C18416a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45800a.add(Broadcast.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45801b = Entities.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ListBroadcastsResponse listBroadcastsResponse) throws IOException {
            Broadcast.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, listBroadcastsResponse.broadcasts);
            if (listBroadcastsResponse.entities != null) {
                Entities.ADAPTER.encodeWithTag(protoWriter, 2, listBroadcastsResponse.entities);
            }
            protoWriter.writeBytes(listBroadcastsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListBroadcastsResponse$a */
    public static final class C18416a extends Message.Builder<ListBroadcastsResponse, C18416a> {

        /* renamed from: a */
        public List<Broadcast> f45800a = Internal.newMutableList();

        /* renamed from: b */
        public Entities f45801b;

        /* renamed from: a */
        public ListBroadcastsResponse build() {
            return new ListBroadcastsResponse(this.f45800a, this.f45801b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18416a newBuilder() {
        C18416a aVar = new C18416a();
        aVar.f45800a = Internal.copyOf("broadcasts", this.broadcasts);
        aVar.f45801b = this.entities;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "ListBroadcastsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.broadcasts.isEmpty()) {
            sb.append(", broadcasts=");
            sb.append(this.broadcasts);
        }
        if (this.entities != null) {
            sb.append(", entities=");
            sb.append(this.entities);
        }
        StringBuilder replace = sb.replace(0, 2, "ListBroadcastsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ListBroadcastsResponse(List<Broadcast> list, Entities entities2) {
        this(list, entities2, ByteString.EMPTY);
    }

    public ListBroadcastsResponse(List<Broadcast> list, Entities entities2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.broadcasts = Internal.immutableCopyOf("broadcasts", list);
        this.entities = entities2;
    }
}
