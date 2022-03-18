package com.ss.android.lark.pb.chats;

import com.google.protobuf.server.FieldOptions;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PullChatShareTokenInfoRequest extends Message<PullChatShareTokenInfoRequest, C49600a> {
    public static final ProtoAdapter<PullChatShareTokenInfoRequest> ADAPTER = new C49601b();
    public static final FieldOptions FIELD_OPTIONS_MTOKEN = new FieldOptions.C23155a().mo80350a("split,type=chat_token").build();
    private static final long serialVersionUID = 0;
    public final String mtoken;

    /* renamed from: com.ss.android.lark.pb.chats.PullChatShareTokenInfoRequest$b */
    private static final class C49601b extends ProtoAdapter<PullChatShareTokenInfoRequest> {
        C49601b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullChatShareTokenInfoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullChatShareTokenInfoRequest pullChatShareTokenInfoRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, pullChatShareTokenInfoRequest.mtoken) + pullChatShareTokenInfoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullChatShareTokenInfoRequest decode(ProtoReader protoReader) throws IOException {
            C49600a aVar = new C49600a();
            aVar.f124227a = "";
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
                    aVar.f124227a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullChatShareTokenInfoRequest pullChatShareTokenInfoRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pullChatShareTokenInfoRequest.mtoken);
            protoWriter.writeBytes(pullChatShareTokenInfoRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.chats.PullChatShareTokenInfoRequest$a */
    public static final class C49600a extends Message.Builder<PullChatShareTokenInfoRequest, C49600a> {

        /* renamed from: a */
        public String f124227a;

        /* renamed from: a */
        public PullChatShareTokenInfoRequest build() {
            String str = this.f124227a;
            if (str != null) {
                return new PullChatShareTokenInfoRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mtoken");
        }

        /* renamed from: a */
        public C49600a mo172929a(String str) {
            this.f124227a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49600a newBuilder() {
        C49600a aVar = new C49600a();
        aVar.f124227a = this.mtoken;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", token=");
        sb.append(this.mtoken);
        StringBuilder replace = sb.replace(0, 2, "PullChatShareTokenInfoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullChatShareTokenInfoRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public PullChatShareTokenInfoRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtoken = str;
    }
}
