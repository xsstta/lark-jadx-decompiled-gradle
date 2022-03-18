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
import java.util.Map;
import okio.ByteString;

public final class GetItemsByEntityIdsResponse extends Message<GetItemsByEntityIdsResponse, C17603a> {
    public static final ProtoAdapter<GetItemsByEntityIdsResponse> ADAPTER = new C17604b();
    private static final long serialVersionUID = 0;
    public final Map<Long, Item> items;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetItemsByEntityIdsResponse$a */
    public static final class C17603a extends Message.Builder<GetItemsByEntityIdsResponse, C17603a> {

        /* renamed from: a */
        public Map<Long, Item> f44590a = Internal.newMutableMap();

        /* renamed from: a */
        public GetItemsByEntityIdsResponse build() {
            return new GetItemsByEntityIdsResponse(this.f44590a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetItemsByEntityIdsResponse$b */
    private static final class C17604b extends ProtoAdapter<GetItemsByEntityIdsResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<Long, Item>> f44591a = ProtoAdapter.newMapAdapter(ProtoAdapter.INT64, Item.ADAPTER);

        C17604b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetItemsByEntityIdsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetItemsByEntityIdsResponse getItemsByEntityIdsResponse) {
            return this.f44591a.encodedSizeWithTag(1, getItemsByEntityIdsResponse.items) + getItemsByEntityIdsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetItemsByEntityIdsResponse decode(ProtoReader protoReader) throws IOException {
            C17603a aVar = new C17603a();
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
                    aVar.f44590a.putAll(this.f44591a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetItemsByEntityIdsResponse getItemsByEntityIdsResponse) throws IOException {
            this.f44591a.encodeWithTag(protoWriter, 1, getItemsByEntityIdsResponse.items);
            protoWriter.writeBytes(getItemsByEntityIdsResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17603a newBuilder() {
        C17603a aVar = new C17603a();
        aVar.f44590a = Internal.copyOf("items", this.items);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetItemsByEntityIdsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.items.isEmpty()) {
            sb.append(", items=");
            sb.append(this.items);
        }
        StringBuilder replace = sb.replace(0, 2, "GetItemsByEntityIdsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetItemsByEntityIdsResponse(Map<Long, Item> map) {
        this(map, ByteString.EMPTY);
    }

    public GetItemsByEntityIdsResponse(Map<Long, Item> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.items = Internal.immutableCopyOf("items", map);
    }
}
