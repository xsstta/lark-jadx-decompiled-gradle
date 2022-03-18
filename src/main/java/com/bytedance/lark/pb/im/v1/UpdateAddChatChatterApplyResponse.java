package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UpdateAddChatChatterApplyResponse extends Message<UpdateAddChatChatterApplyResponse, C18131a> {
    public static final ProtoAdapter<UpdateAddChatChatterApplyResponse> ADAPTER = new C18132b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateAddChatChatterApplyResponse$b */
    private static final class C18132b extends ProtoAdapter<UpdateAddChatChatterApplyResponse> {
        C18132b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateAddChatChatterApplyResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateAddChatChatterApplyResponse updateAddChatChatterApplyResponse) {
            return updateAddChatChatterApplyResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateAddChatChatterApplyResponse decode(ProtoReader protoReader) throws IOException {
            C18131a aVar = new C18131a();
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
        public void encode(ProtoWriter protoWriter, UpdateAddChatChatterApplyResponse updateAddChatChatterApplyResponse) throws IOException {
            protoWriter.writeBytes(updateAddChatChatterApplyResponse.unknownFields());
        }
    }

    public UpdateAddChatChatterApplyResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateAddChatChatterApplyResponse$a */
    public static final class C18131a extends Message.Builder<UpdateAddChatChatterApplyResponse, C18131a> {
        /* renamed from: a */
        public UpdateAddChatChatterApplyResponse build() {
            return new UpdateAddChatChatterApplyResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18131a newBuilder() {
        C18131a aVar = new C18131a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "UpdateAddChatChatterApplyResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "UpdateAddChatChatterApplyResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateAddChatChatterApplyResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
