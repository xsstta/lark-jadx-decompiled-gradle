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

public final class HideMessageUrlPreviewRequest extends Message<HideMessageUrlPreviewRequest, C17781a> {
    public static final ProtoAdapter<HideMessageUrlPreviewRequest> ADAPTER = new C17782b();
    private static final long serialVersionUID = 0;
    public final String message_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.HideMessageUrlPreviewRequest$b */
    private static final class C17782b extends ProtoAdapter<HideMessageUrlPreviewRequest> {
        C17782b() {
            super(FieldEncoding.LENGTH_DELIMITED, HideMessageUrlPreviewRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(HideMessageUrlPreviewRequest hideMessageUrlPreviewRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, hideMessageUrlPreviewRequest.message_id) + hideMessageUrlPreviewRequest.unknownFields().size();
        }

        /* renamed from: a */
        public HideMessageUrlPreviewRequest decode(ProtoReader protoReader) throws IOException {
            C17781a aVar = new C17781a();
            aVar.f44824a = "";
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
                    aVar.f44824a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, HideMessageUrlPreviewRequest hideMessageUrlPreviewRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, hideMessageUrlPreviewRequest.message_id);
            protoWriter.writeBytes(hideMessageUrlPreviewRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.HideMessageUrlPreviewRequest$a */
    public static final class C17781a extends Message.Builder<HideMessageUrlPreviewRequest, C17781a> {

        /* renamed from: a */
        public String f44824a;

        /* renamed from: a */
        public HideMessageUrlPreviewRequest build() {
            String str = this.f44824a;
            if (str != null) {
                return new HideMessageUrlPreviewRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "message_id");
        }

        /* renamed from: a */
        public C17781a mo62018a(String str) {
            this.f44824a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17781a newBuilder() {
        C17781a aVar = new C17781a();
        aVar.f44824a = this.message_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "HideMessageUrlPreviewRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", message_id=");
        sb.append(this.message_id);
        StringBuilder replace = sb.replace(0, 2, "HideMessageUrlPreviewRequest{");
        replace.append('}');
        return replace.toString();
    }

    public HideMessageUrlPreviewRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public HideMessageUrlPreviewRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
    }
}
