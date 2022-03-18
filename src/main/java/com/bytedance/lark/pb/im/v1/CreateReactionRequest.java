package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import okio.ByteString;

public final class CreateReactionRequest extends Message<CreateReactionRequest, C17378a> {
    public static final ProtoAdapter<CreateReactionRequest> ADAPTER = new C17379b();
    private static final long serialVersionUID = 0;
    public final String message_id;
    public final String type;

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateReactionRequest$b */
    private static final class C17379b extends ProtoAdapter<CreateReactionRequest> {
        C17379b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateReactionRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateReactionRequest createReactionRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, createReactionRequest.message_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, createReactionRequest.type) + createReactionRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreateReactionRequest decode(ProtoReader protoReader) throws IOException {
            C17378a aVar = new C17378a();
            aVar.f44273a = "";
            aVar.f44274b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44273a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44274b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateReactionRequest createReactionRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, createReactionRequest.message_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, createReactionRequest.type);
            protoWriter.writeBytes(createReactionRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17378a newBuilder() {
        C17378a aVar = new C17378a();
        aVar.f44273a = this.message_id;
        aVar.f44274b = this.type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateReactionRequest$a */
    public static final class C17378a extends Message.Builder<CreateReactionRequest, C17378a> {

        /* renamed from: a */
        public String f44273a;

        /* renamed from: b */
        public String f44274b;

        /* renamed from: a */
        public CreateReactionRequest build() {
            String str;
            String str2 = this.f44273a;
            if (str2 != null && (str = this.f44274b) != null) {
                return new CreateReactionRequest(str2, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "message_id", this.f44274b, ShareHitPoint.f121869d);
        }

        /* renamed from: a */
        public C17378a mo60998a(String str) {
            this.f44273a = str;
            return this;
        }

        /* renamed from: b */
        public C17378a mo61000b(String str) {
            this.f44274b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CreateReactionRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", message_id=");
        sb.append(this.message_id);
        sb.append(", type=");
        sb.append(this.type);
        StringBuilder replace = sb.replace(0, 2, "CreateReactionRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreateReactionRequest(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public CreateReactionRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
        this.type = str2;
    }
}
