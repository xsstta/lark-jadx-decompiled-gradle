package com.ss.android.lark.pb.url_preview;

import com.google.protobuf.server.FieldOptions;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PullUrlPreviewChattersListRequest extends Message<PullUrlPreviewChattersListRequest, C50176a> {
    public static final ProtoAdapter<PullUrlPreviewChattersListRequest> ADAPTER = new C50177b();
    public static final FieldOptions FIELD_OPTIONS_MPREVIEW_ID = new FieldOptions.C23155a().mo80350a("split,type=url_preview_token").build();
    private static final long serialVersionUID = 0;
    public final String mpreview_id;

    /* renamed from: com.ss.android.lark.pb.url_preview.PullUrlPreviewChattersListRequest$b */
    private static final class C50177b extends ProtoAdapter<PullUrlPreviewChattersListRequest> {
        C50177b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullUrlPreviewChattersListRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullUrlPreviewChattersListRequest pullUrlPreviewChattersListRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, pullUrlPreviewChattersListRequest.mpreview_id) + pullUrlPreviewChattersListRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullUrlPreviewChattersListRequest decode(ProtoReader protoReader) throws IOException {
            C50176a aVar = new C50176a();
            aVar.f125373a = "";
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
                    aVar.f125373a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullUrlPreviewChattersListRequest pullUrlPreviewChattersListRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pullUrlPreviewChattersListRequest.mpreview_id);
            protoWriter.writeBytes(pullUrlPreviewChattersListRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.url_preview.PullUrlPreviewChattersListRequest$a */
    public static final class C50176a extends Message.Builder<PullUrlPreviewChattersListRequest, C50176a> {

        /* renamed from: a */
        public String f125373a;

        /* renamed from: a */
        public PullUrlPreviewChattersListRequest build() {
            String str = this.f125373a;
            if (str != null) {
                return new PullUrlPreviewChattersListRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mpreview_id");
        }

        /* renamed from: a */
        public C50176a mo174194a(String str) {
            this.f125373a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50176a newBuilder() {
        C50176a aVar = new C50176a();
        aVar.f125373a = this.mpreview_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", preview_id=");
        sb.append(this.mpreview_id);
        StringBuilder replace = sb.replace(0, 2, "PullUrlPreviewChattersListRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullUrlPreviewChattersListRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public PullUrlPreviewChattersListRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mpreview_id = str;
    }
}
