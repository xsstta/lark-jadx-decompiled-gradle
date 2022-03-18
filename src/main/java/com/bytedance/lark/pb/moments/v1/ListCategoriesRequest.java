package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ListCategoriesRequest extends Message<ListCategoriesRequest, C18418a> {
    public static final ProtoAdapter<ListCategoriesRequest> ADAPTER = new C18419b();
    public static final Boolean DEFAULT_FORCE_REMOTE = false;
    private static final long serialVersionUID = 0;
    public final Boolean force_remote;

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListCategoriesRequest$b */
    private static final class C18419b extends ProtoAdapter<ListCategoriesRequest> {
        C18419b() {
            super(FieldEncoding.LENGTH_DELIMITED, ListCategoriesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ListCategoriesRequest listCategoriesRequest) {
            int i;
            if (listCategoriesRequest.force_remote != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, listCategoriesRequest.force_remote);
            } else {
                i = 0;
            }
            return i + listCategoriesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ListCategoriesRequest decode(ProtoReader protoReader) throws IOException {
            C18418a aVar = new C18418a();
            aVar.f45802a = false;
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
                    aVar.f45802a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ListCategoriesRequest listCategoriesRequest) throws IOException {
            if (listCategoriesRequest.force_remote != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, listCategoriesRequest.force_remote);
            }
            protoWriter.writeBytes(listCategoriesRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListCategoriesRequest$a */
    public static final class C18418a extends Message.Builder<ListCategoriesRequest, C18418a> {

        /* renamed from: a */
        public Boolean f45802a;

        /* renamed from: a */
        public ListCategoriesRequest build() {
            return new ListCategoriesRequest(this.f45802a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18418a mo63663a(Boolean bool) {
            this.f45802a = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18418a newBuilder() {
        C18418a aVar = new C18418a();
        aVar.f45802a = this.force_remote;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "ListCategoriesRequest");
        StringBuilder sb = new StringBuilder();
        if (this.force_remote != null) {
            sb.append(", force_remote=");
            sb.append(this.force_remote);
        }
        StringBuilder replace = sb.replace(0, 2, "ListCategoriesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ListCategoriesRequest(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public ListCategoriesRequest(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.force_remote = bool;
    }
}
