package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Content;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class RecallMessageResponse extends Message<RecallMessageResponse, C17995a> {
    public static final ProtoAdapter<RecallMessageResponse> ADAPTER = new C17996b();
    private static final long serialVersionUID = 0;
    public final Content content;
    public final String message;

    /* renamed from: com.bytedance.lark.pb.im.v1.RecallMessageResponse$b */
    private static final class C17996b extends ProtoAdapter<RecallMessageResponse> {
        C17996b() {
            super(FieldEncoding.LENGTH_DELIMITED, RecallMessageResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(RecallMessageResponse recallMessageResponse) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, recallMessageResponse.message);
            if (recallMessageResponse.content != null) {
                i = Content.ADAPTER.encodedSizeWithTag(2, recallMessageResponse.content);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + recallMessageResponse.unknownFields().size();
        }

        /* renamed from: a */
        public RecallMessageResponse decode(ProtoReader protoReader) throws IOException {
            C17995a aVar = new C17995a();
            aVar.f45090a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45090a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45091b = Content.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, RecallMessageResponse recallMessageResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, recallMessageResponse.message);
            if (recallMessageResponse.content != null) {
                Content.ADAPTER.encodeWithTag(protoWriter, 2, recallMessageResponse.content);
            }
            protoWriter.writeBytes(recallMessageResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.RecallMessageResponse$a */
    public static final class C17995a extends Message.Builder<RecallMessageResponse, C17995a> {

        /* renamed from: a */
        public String f45090a;

        /* renamed from: b */
        public Content f45091b;

        /* renamed from: a */
        public RecallMessageResponse build() {
            String str = this.f45090a;
            if (str != null) {
                return new RecallMessageResponse(str, this.f45091b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "message");
        }
    }

    @Override // com.squareup.wire.Message
    public C17995a newBuilder() {
        C17995a aVar = new C17995a();
        aVar.f45090a = this.message;
        aVar.f45091b = this.content;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "RecallMessageResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", message=");
        sb.append(this.message);
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        StringBuilder replace = sb.replace(0, 2, "RecallMessageResponse{");
        replace.append('}');
        return replace.toString();
    }

    public RecallMessageResponse(String str, Content content2) {
        this(str, content2, ByteString.EMPTY);
    }

    public RecallMessageResponse(String str, Content content2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message = str;
        this.content = content2;
    }
}
