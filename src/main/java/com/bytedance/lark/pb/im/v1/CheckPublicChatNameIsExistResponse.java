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

public final class CheckPublicChatNameIsExistResponse extends Message<CheckPublicChatNameIsExistResponse, C17328a> {
    public static final ProtoAdapter<CheckPublicChatNameIsExistResponse> ADAPTER = new C17329b();
    public static final Boolean DEFAULT_IS_EXIST = false;
    private static final long serialVersionUID = 0;
    public final Boolean is_exist;

    /* renamed from: com.bytedance.lark.pb.im.v1.CheckPublicChatNameIsExistResponse$b */
    private static final class C17329b extends ProtoAdapter<CheckPublicChatNameIsExistResponse> {
        C17329b() {
            super(FieldEncoding.LENGTH_DELIMITED, CheckPublicChatNameIsExistResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CheckPublicChatNameIsExistResponse checkPublicChatNameIsExistResponse) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, checkPublicChatNameIsExistResponse.is_exist) + checkPublicChatNameIsExistResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CheckPublicChatNameIsExistResponse decode(ProtoReader protoReader) throws IOException {
            C17328a aVar = new C17328a();
            aVar.f44179a = false;
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
                    aVar.f44179a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CheckPublicChatNameIsExistResponse checkPublicChatNameIsExistResponse) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, checkPublicChatNameIsExistResponse.is_exist);
            protoWriter.writeBytes(checkPublicChatNameIsExistResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CheckPublicChatNameIsExistResponse$a */
    public static final class C17328a extends Message.Builder<CheckPublicChatNameIsExistResponse, C17328a> {

        /* renamed from: a */
        public Boolean f44179a;

        /* renamed from: a */
        public CheckPublicChatNameIsExistResponse build() {
            Boolean bool = this.f44179a;
            if (bool != null) {
                return new CheckPublicChatNameIsExistResponse(bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "is_exist");
        }
    }

    @Override // com.squareup.wire.Message
    public C17328a newBuilder() {
        C17328a aVar = new C17328a();
        aVar.f44179a = this.is_exist;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CheckPublicChatNameIsExistResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", is_exist=");
        sb.append(this.is_exist);
        StringBuilder replace = sb.replace(0, 2, "CheckPublicChatNameIsExistResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CheckPublicChatNameIsExistResponse(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public CheckPublicChatNameIsExistResponse(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_exist = bool;
    }
}
