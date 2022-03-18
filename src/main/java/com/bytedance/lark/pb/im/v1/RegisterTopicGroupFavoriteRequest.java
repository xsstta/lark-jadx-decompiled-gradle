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

public final class RegisterTopicGroupFavoriteRequest extends Message<RegisterTopicGroupFavoriteRequest, C18001a> {
    public static final ProtoAdapter<RegisterTopicGroupFavoriteRequest> ADAPTER = new C18002b();
    private static final long serialVersionUID = 0;
    public final String topic_group_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.RegisterTopicGroupFavoriteRequest$b */
    private static final class C18002b extends ProtoAdapter<RegisterTopicGroupFavoriteRequest> {
        C18002b() {
            super(FieldEncoding.LENGTH_DELIMITED, RegisterTopicGroupFavoriteRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(RegisterTopicGroupFavoriteRequest registerTopicGroupFavoriteRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, registerTopicGroupFavoriteRequest.topic_group_id) + registerTopicGroupFavoriteRequest.unknownFields().size();
        }

        /* renamed from: a */
        public RegisterTopicGroupFavoriteRequest decode(ProtoReader protoReader) throws IOException {
            C18001a aVar = new C18001a();
            aVar.f45102a = "";
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
                    aVar.f45102a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, RegisterTopicGroupFavoriteRequest registerTopicGroupFavoriteRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, registerTopicGroupFavoriteRequest.topic_group_id);
            protoWriter.writeBytes(registerTopicGroupFavoriteRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.RegisterTopicGroupFavoriteRequest$a */
    public static final class C18001a extends Message.Builder<RegisterTopicGroupFavoriteRequest, C18001a> {

        /* renamed from: a */
        public String f45102a;

        /* renamed from: a */
        public RegisterTopicGroupFavoriteRequest build() {
            String str = this.f45102a;
            if (str != null) {
                return new RegisterTopicGroupFavoriteRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "topic_group_id");
        }

        /* renamed from: a */
        public C18001a mo62536a(String str) {
            this.f45102a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18001a newBuilder() {
        C18001a aVar = new C18001a();
        aVar.f45102a = this.topic_group_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "RegisterTopicGroupFavoriteRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", topic_group_id=");
        sb.append(this.topic_group_id);
        StringBuilder replace = sb.replace(0, 2, "RegisterTopicGroupFavoriteRequest{");
        replace.append('}');
        return replace.toString();
    }

    public RegisterTopicGroupFavoriteRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public RegisterTopicGroupFavoriteRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.topic_group_id = str;
    }
}
