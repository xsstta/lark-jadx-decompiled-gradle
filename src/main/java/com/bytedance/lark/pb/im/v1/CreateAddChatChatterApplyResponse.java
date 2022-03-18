package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CreateAddChatChatterApplyResponse extends Message<CreateAddChatChatterApplyResponse, C17334a> {
    public static final ProtoAdapter<CreateAddChatChatterApplyResponse> ADAPTER = new C17335b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateAddChatChatterApplyResponse$b */
    private static final class C17335b extends ProtoAdapter<CreateAddChatChatterApplyResponse> {
        C17335b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateAddChatChatterApplyResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateAddChatChatterApplyResponse createAddChatChatterApplyResponse) {
            return createAddChatChatterApplyResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CreateAddChatChatterApplyResponse decode(ProtoReader protoReader) throws IOException {
            C17334a aVar = new C17334a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateAddChatChatterApplyResponse createAddChatChatterApplyResponse) throws IOException {
            protoWriter.writeBytes(createAddChatChatterApplyResponse.unknownFields());
        }
    }

    public CreateAddChatChatterApplyResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateAddChatChatterApplyResponse$a */
    public static final class C17334a extends Message.Builder<CreateAddChatChatterApplyResponse, C17334a> {
        /* renamed from: a */
        public CreateAddChatChatterApplyResponse build() {
            return new CreateAddChatChatterApplyResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17334a newBuilder() {
        C17334a aVar = new C17334a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CreateAddChatChatterApplyResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "CreateAddChatChatterApplyResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CreateAddChatChatterApplyResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
