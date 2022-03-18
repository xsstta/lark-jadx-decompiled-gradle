package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Draft;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CreateDraftResponse extends Message<CreateDraftResponse, C17354a> {
    public static final ProtoAdapter<CreateDraftResponse> ADAPTER = new C17355b();
    private static final long serialVersionUID = 0;
    public final Draft draft;
    public final String draft_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateDraftResponse$b */
    private static final class C17355b extends ProtoAdapter<CreateDraftResponse> {
        C17355b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateDraftResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateDraftResponse createDraftResponse) {
            int i;
            int i2 = 0;
            if (createDraftResponse.draft_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, createDraftResponse.draft_id);
            } else {
                i = 0;
            }
            if (createDraftResponse.draft != null) {
                i2 = Draft.ADAPTER.encodedSizeWithTag(2, createDraftResponse.draft);
            }
            return i + i2 + createDraftResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CreateDraftResponse decode(ProtoReader protoReader) throws IOException {
            C17354a aVar = new C17354a();
            aVar.f44233a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44233a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44234b = Draft.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateDraftResponse createDraftResponse) throws IOException {
            if (createDraftResponse.draft_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, createDraftResponse.draft_id);
            }
            if (createDraftResponse.draft != null) {
                Draft.ADAPTER.encodeWithTag(protoWriter, 2, createDraftResponse.draft);
            }
            protoWriter.writeBytes(createDraftResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateDraftResponse$a */
    public static final class C17354a extends Message.Builder<CreateDraftResponse, C17354a> {

        /* renamed from: a */
        public String f44233a;

        /* renamed from: b */
        public Draft f44234b;

        /* renamed from: a */
        public CreateDraftResponse build() {
            return new CreateDraftResponse(this.f44233a, this.f44234b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17354a newBuilder() {
        C17354a aVar = new C17354a();
        aVar.f44233a = this.draft_id;
        aVar.f44234b = this.draft;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CreateDraftResponse");
        StringBuilder sb = new StringBuilder();
        if (this.draft_id != null) {
            sb.append(", draft_id=");
            sb.append(this.draft_id);
        }
        if (this.draft != null) {
            sb.append(", draft=");
            sb.append(this.draft);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateDraftResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CreateDraftResponse(String str, Draft draft2) {
        this(str, draft2, ByteString.EMPTY);
    }

    public CreateDraftResponse(String str, Draft draft2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.draft_id = str;
        this.draft = draft2;
    }
}
