package com.bytedance.lark.pb.space.doc.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class UpdateDocFeedRequest extends Message<UpdateDocFeedRequest, C19277a> {
    public static final ProtoAdapter<UpdateDocFeedRequest> ADAPTER = new C19278b();
    public static final Boolean DEFAULT_IS_REMIND = false;
    private static final long serialVersionUID = 0;
    public final String doc_feed_id;
    public final Boolean is_remind;

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.UpdateDocFeedRequest$b */
    private static final class C19278b extends ProtoAdapter<UpdateDocFeedRequest> {
        C19278b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateDocFeedRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateDocFeedRequest updateDocFeedRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, updateDocFeedRequest.doc_feed_id);
            if (updateDocFeedRequest.is_remind != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, updateDocFeedRequest.is_remind);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + updateDocFeedRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateDocFeedRequest decode(ProtoReader protoReader) throws IOException {
            C19277a aVar = new C19277a();
            aVar.f47466a = "";
            aVar.f47467b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47466a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47467b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateDocFeedRequest updateDocFeedRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, updateDocFeedRequest.doc_feed_id);
            if (updateDocFeedRequest.is_remind != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, updateDocFeedRequest.is_remind);
            }
            protoWriter.writeBytes(updateDocFeedRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.UpdateDocFeedRequest$a */
    public static final class C19277a extends Message.Builder<UpdateDocFeedRequest, C19277a> {

        /* renamed from: a */
        public String f47466a;

        /* renamed from: b */
        public Boolean f47467b;

        /* renamed from: a */
        public UpdateDocFeedRequest build() {
            String str = this.f47466a;
            if (str != null) {
                return new UpdateDocFeedRequest(str, this.f47467b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "doc_feed_id");
        }

        /* renamed from: a */
        public C19277a mo65755a(Boolean bool) {
            this.f47467b = bool;
            return this;
        }

        /* renamed from: a */
        public C19277a mo65756a(String str) {
            this.f47466a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19277a newBuilder() {
        C19277a aVar = new C19277a();
        aVar.f47466a = this.doc_feed_id;
        aVar.f47467b = this.is_remind;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "UpdateDocFeedRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", doc_feed_id=");
        sb.append(this.doc_feed_id);
        if (this.is_remind != null) {
            sb.append(", is_remind=");
            sb.append(this.is_remind);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateDocFeedRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateDocFeedRequest(String str, Boolean bool) {
        this(str, bool, ByteString.EMPTY);
    }

    public UpdateDocFeedRequest(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.doc_feed_id = str;
        this.is_remind = bool;
    }
}
