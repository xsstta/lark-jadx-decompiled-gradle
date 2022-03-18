package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Draft;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class CreateDraftRequest extends Message<CreateDraftRequest, C17352a> {
    public static final ProtoAdapter<CreateDraftRequest> ADAPTER = new C17353b();
    private static final long serialVersionUID = 0;
    public final Draft draft;

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateDraftRequest$b */
    private static final class C17353b extends ProtoAdapter<CreateDraftRequest> {
        C17353b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateDraftRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateDraftRequest createDraftRequest) {
            return Draft.ADAPTER.encodedSizeWithTag(1, createDraftRequest.draft) + createDraftRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreateDraftRequest decode(ProtoReader protoReader) throws IOException {
            C17352a aVar = new C17352a();
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
                    aVar.f44232a = Draft.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateDraftRequest createDraftRequest) throws IOException {
            Draft.ADAPTER.encodeWithTag(protoWriter, 1, createDraftRequest.draft);
            protoWriter.writeBytes(createDraftRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateDraftRequest$a */
    public static final class C17352a extends Message.Builder<CreateDraftRequest, C17352a> {

        /* renamed from: a */
        public Draft f44232a;

        /* renamed from: a */
        public CreateDraftRequest build() {
            Draft draft = this.f44232a;
            if (draft != null) {
                return new CreateDraftRequest(draft, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(draft, "draft");
        }

        /* renamed from: a */
        public C17352a mo60922a(Draft draft) {
            this.f44232a = draft;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17352a newBuilder() {
        C17352a aVar = new C17352a();
        aVar.f44232a = this.draft;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CreateDraftRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", draft=");
        sb.append(this.draft);
        StringBuilder replace = sb.replace(0, 2, "CreateDraftRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreateDraftRequest(Draft draft2) {
        this(draft2, ByteString.EMPTY);
    }

    public CreateDraftRequest(Draft draft2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.draft = draft2;
    }
}
