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

public final class GetAddChatChatterApplyRequest extends Message<GetAddChatChatterApplyRequest, C17462a> {
    public static final ProtoAdapter<GetAddChatChatterApplyRequest> ADAPTER = new C17463b();
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final String cursor;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetAddChatChatterApplyRequest$b */
    private static final class C17463b extends ProtoAdapter<GetAddChatChatterApplyRequest> {
        C17463b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAddChatChatterApplyRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAddChatChatterApplyRequest getAddChatChatterApplyRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getAddChatChatterApplyRequest.chat_id);
            if (getAddChatChatterApplyRequest.cursor != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, getAddChatChatterApplyRequest.cursor);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getAddChatChatterApplyRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetAddChatChatterApplyRequest decode(ProtoReader protoReader) throws IOException {
            C17462a aVar = new C17462a();
            aVar.f44353a = "";
            aVar.f44354b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44353a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44354b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAddChatChatterApplyRequest getAddChatChatterApplyRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getAddChatChatterApplyRequest.chat_id);
            if (getAddChatChatterApplyRequest.cursor != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getAddChatChatterApplyRequest.cursor);
            }
            protoWriter.writeBytes(getAddChatChatterApplyRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetAddChatChatterApplyRequest$a */
    public static final class C17462a extends Message.Builder<GetAddChatChatterApplyRequest, C17462a> {

        /* renamed from: a */
        public String f44353a;

        /* renamed from: b */
        public String f44354b;

        /* renamed from: a */
        public GetAddChatChatterApplyRequest build() {
            String str = this.f44353a;
            if (str != null) {
                return new GetAddChatChatterApplyRequest(str, this.f44354b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }

        /* renamed from: a */
        public C17462a mo61211a(String str) {
            this.f44353a = str;
            return this;
        }

        /* renamed from: b */
        public C17462a mo61213b(String str) {
            this.f44354b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17462a newBuilder() {
        C17462a aVar = new C17462a();
        aVar.f44353a = this.chat_id;
        aVar.f44354b = this.cursor;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetAddChatChatterApplyRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAddChatChatterApplyRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetAddChatChatterApplyRequest(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public GetAddChatChatterApplyRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.cursor = str2;
    }
}
