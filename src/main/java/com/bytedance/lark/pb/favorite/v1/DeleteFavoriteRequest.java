package com.bytedance.lark.pb.favorite.v1;

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

public final class DeleteFavoriteRequest extends Message<DeleteFavoriteRequest, C17082a> {
    public static final ProtoAdapter<DeleteFavoriteRequest> ADAPTER = new C17083b();
    private static final long serialVersionUID = 0;
    public final List<String> ids;

    /* renamed from: com.bytedance.lark.pb.favorite.v1.DeleteFavoriteRequest$b */
    private static final class C17083b extends ProtoAdapter<DeleteFavoriteRequest> {
        C17083b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteFavoriteRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteFavoriteRequest deleteFavoriteRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, deleteFavoriteRequest.ids) + deleteFavoriteRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteFavoriteRequest decode(ProtoReader protoReader) throws IOException {
            C17082a aVar = new C17082a();
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
                    aVar.f43749a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteFavoriteRequest deleteFavoriteRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, deleteFavoriteRequest.ids);
            protoWriter.writeBytes(deleteFavoriteRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.favorite.v1.DeleteFavoriteRequest$a */
    public static final class C17082a extends Message.Builder<DeleteFavoriteRequest, C17082a> {

        /* renamed from: a */
        public List<String> f43749a = Internal.newMutableList();

        /* renamed from: a */
        public DeleteFavoriteRequest build() {
            return new DeleteFavoriteRequest(this.f43749a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17082a mo60256a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f43749a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17082a newBuilder() {
        C17082a aVar = new C17082a();
        aVar.f43749a = Internal.copyOf("ids", this.ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("favorite", "DeleteFavoriteRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.ids.isEmpty()) {
            sb.append(", ids=");
            sb.append(this.ids);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteFavoriteRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteFavoriteRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public DeleteFavoriteRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ids = Internal.immutableCopyOf("ids", list);
    }
}
