package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Item;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ReorderItemsResponse extends Message<ReorderItemsResponse, C18003a> {
    public static final ProtoAdapter<ReorderItemsResponse> ADAPTER = new C18004b();
    public static final Long DEFAULT_PARENT_ID = 0L;
    private static final long serialVersionUID = 0;
    public final List<Item> items;
    public final Long parent_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.ReorderItemsResponse$b */
    private static final class C18004b extends ProtoAdapter<ReorderItemsResponse> {
        C18004b() {
            super(FieldEncoding.LENGTH_DELIMITED, ReorderItemsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ReorderItemsResponse reorderItemsResponse) {
            int i;
            if (reorderItemsResponse.parent_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, reorderItemsResponse.parent_id);
            } else {
                i = 0;
            }
            return i + Item.ADAPTER.asRepeated().encodedSizeWithTag(2, reorderItemsResponse.items) + reorderItemsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ReorderItemsResponse decode(ProtoReader protoReader) throws IOException {
            C18003a aVar = new C18003a();
            aVar.f45103a = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45103a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45104b.add(Item.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ReorderItemsResponse reorderItemsResponse) throws IOException {
            if (reorderItemsResponse.parent_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, reorderItemsResponse.parent_id);
            }
            Item.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, reorderItemsResponse.items);
            protoWriter.writeBytes(reorderItemsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.ReorderItemsResponse$a */
    public static final class C18003a extends Message.Builder<ReorderItemsResponse, C18003a> {

        /* renamed from: a */
        public Long f45103a;

        /* renamed from: b */
        public List<Item> f45104b = Internal.newMutableList();

        /* renamed from: a */
        public ReorderItemsResponse build() {
            return new ReorderItemsResponse(this.f45103a, this.f45104b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18003a newBuilder() {
        C18003a aVar = new C18003a();
        aVar.f45103a = this.parent_id;
        aVar.f45104b = Internal.copyOf("items", this.items);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "ReorderItemsResponse");
        StringBuilder sb = new StringBuilder();
        if (this.parent_id != null) {
            sb.append(", parent_id=");
            sb.append(this.parent_id);
        }
        if (!this.items.isEmpty()) {
            sb.append(", items=");
            sb.append(this.items);
        }
        StringBuilder replace = sb.replace(0, 2, "ReorderItemsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ReorderItemsResponse(Long l, List<Item> list) {
        this(l, list, ByteString.EMPTY);
    }

    public ReorderItemsResponse(Long l, List<Item> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.parent_id = l;
        this.items = Internal.immutableCopyOf("items", list);
    }
}
