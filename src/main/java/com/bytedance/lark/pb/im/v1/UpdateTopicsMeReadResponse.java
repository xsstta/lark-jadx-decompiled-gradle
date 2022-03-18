package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UpdateTopicsMeReadResponse extends Message<UpdateTopicsMeReadResponse, C18168a> {
    public static final ProtoAdapter<UpdateTopicsMeReadResponse> ADAPTER = new C18169b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateTopicsMeReadResponse$b */
    private static final class C18169b extends ProtoAdapter<UpdateTopicsMeReadResponse> {
        C18169b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateTopicsMeReadResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateTopicsMeReadResponse updateTopicsMeReadResponse) {
            return updateTopicsMeReadResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateTopicsMeReadResponse decode(ProtoReader protoReader) throws IOException {
            C18168a aVar = new C18168a();
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
        public void encode(ProtoWriter protoWriter, UpdateTopicsMeReadResponse updateTopicsMeReadResponse) throws IOException {
            protoWriter.writeBytes(updateTopicsMeReadResponse.unknownFields());
        }
    }

    public UpdateTopicsMeReadResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateTopicsMeReadResponse$a */
    public static final class C18168a extends Message.Builder<UpdateTopicsMeReadResponse, C18168a> {
        /* renamed from: a */
        public UpdateTopicsMeReadResponse build() {
            return new UpdateTopicsMeReadResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18168a newBuilder() {
        C18168a aVar = new C18168a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "UpdateTopicsMeReadResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "UpdateTopicsMeReadResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateTopicsMeReadResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
