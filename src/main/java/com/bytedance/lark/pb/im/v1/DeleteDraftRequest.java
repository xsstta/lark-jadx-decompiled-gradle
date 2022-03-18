package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class DeleteDraftRequest extends Message<DeleteDraftRequest, C17408a> {
    public static final ProtoAdapter<DeleteDraftRequest> ADAPTER = new C17409b();
    private static final long serialVersionUID = 0;
    public final String draft_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteDraftRequest$b */
    private static final class C17409b extends ProtoAdapter<DeleteDraftRequest> {
        C17409b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteDraftRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteDraftRequest deleteDraftRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, deleteDraftRequest.draft_id) + deleteDraftRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteDraftRequest decode(ProtoReader protoReader) throws IOException {
            C17408a aVar = new C17408a();
            aVar.f44316a = "";
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
                    aVar.f44316a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteDraftRequest deleteDraftRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deleteDraftRequest.draft_id);
            protoWriter.writeBytes(deleteDraftRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteDraftRequest$a */
    public static final class C17408a extends Message.Builder<DeleteDraftRequest, C17408a> {

        /* renamed from: a */
        public String f44316a;

        /* renamed from: a */
        public DeleteDraftRequest build() {
            String str = this.f44316a;
            if (str != null) {
                return new DeleteDraftRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "draft_id");
        }

        /* renamed from: a */
        public C17408a mo61085a(String str) {
            this.f44316a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17408a newBuilder() {
        C17408a aVar = new C17408a();
        aVar.f44316a = this.draft_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "DeleteDraftRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", draft_id=");
        sb.append(this.draft_id);
        StringBuilder replace = sb.replace(0, 2, "DeleteDraftRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteDraftRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public DeleteDraftRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.draft_id = str;
    }
}
