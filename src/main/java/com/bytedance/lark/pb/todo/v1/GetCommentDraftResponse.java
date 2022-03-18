package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetCommentDraftResponse extends Message<GetCommentDraftResponse, C19519a> {
    public static final ProtoAdapter<GetCommentDraftResponse> ADAPTER = new C19520b();
    public static final Boolean DEFAULT_FOUND = false;
    private static final long serialVersionUID = 0;
    public final Boolean found;
    public final CreateCommentInfo info;

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetCommentDraftResponse$b */
    private static final class C19520b extends ProtoAdapter<GetCommentDraftResponse> {
        C19520b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCommentDraftResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCommentDraftResponse getCommentDraftResponse) {
            int i;
            int i2 = 0;
            if (getCommentDraftResponse.info != null) {
                i = CreateCommentInfo.ADAPTER.encodedSizeWithTag(1, getCommentDraftResponse.info);
            } else {
                i = 0;
            }
            if (getCommentDraftResponse.found != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, getCommentDraftResponse.found);
            }
            return i + i2 + getCommentDraftResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetCommentDraftResponse decode(ProtoReader protoReader) throws IOException {
            C19519a aVar = new C19519a();
            aVar.f47871b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47870a = CreateCommentInfo.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47871b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCommentDraftResponse getCommentDraftResponse) throws IOException {
            if (getCommentDraftResponse.info != null) {
                CreateCommentInfo.ADAPTER.encodeWithTag(protoWriter, 1, getCommentDraftResponse.info);
            }
            if (getCommentDraftResponse.found != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getCommentDraftResponse.found);
            }
            protoWriter.writeBytes(getCommentDraftResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetCommentDraftResponse$a */
    public static final class C19519a extends Message.Builder<GetCommentDraftResponse, C19519a> {

        /* renamed from: a */
        public CreateCommentInfo f47870a;

        /* renamed from: b */
        public Boolean f47871b;

        /* renamed from: a */
        public GetCommentDraftResponse build() {
            return new GetCommentDraftResponse(this.f47870a, this.f47871b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19519a newBuilder() {
        C19519a aVar = new C19519a();
        aVar.f47870a = this.info;
        aVar.f47871b = this.found;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "GetCommentDraftResponse");
        StringBuilder sb = new StringBuilder();
        if (this.info != null) {
            sb.append(", info=");
            sb.append(this.info);
        }
        if (this.found != null) {
            sb.append(", found=");
            sb.append(this.found);
        }
        StringBuilder replace = sb.replace(0, 2, "GetCommentDraftResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetCommentDraftResponse(CreateCommentInfo createCommentInfo, Boolean bool) {
        this(createCommentInfo, bool, ByteString.EMPTY);
    }

    public GetCommentDraftResponse(CreateCommentInfo createCommentInfo, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.info = createCommentInfo;
        this.found = bool;
    }
}
