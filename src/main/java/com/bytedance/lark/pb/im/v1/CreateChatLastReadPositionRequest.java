package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class CreateChatLastReadPositionRequest extends Message<CreateChatLastReadPositionRequest, C17336a> {
    public static final ProtoAdapter<CreateChatLastReadPositionRequest> ADAPTER = new C17337b();
    public static final Float DEFAULT_OFFSET = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
    public static final Integer DEFAULT_POSITION = 0;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final Float offset;
    public final Integer position;

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateChatLastReadPositionRequest$b */
    private static final class C17337b extends ProtoAdapter<CreateChatLastReadPositionRequest> {
        C17337b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateChatLastReadPositionRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateChatLastReadPositionRequest createChatLastReadPositionRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, createChatLastReadPositionRequest.chat_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, createChatLastReadPositionRequest.position);
            if (createChatLastReadPositionRequest.offset != null) {
                i = ProtoAdapter.FLOAT.encodedSizeWithTag(3, createChatLastReadPositionRequest.offset);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + createChatLastReadPositionRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreateChatLastReadPositionRequest decode(ProtoReader protoReader) throws IOException {
            C17336a aVar = new C17336a();
            aVar.f44190a = "";
            aVar.f44191b = 0;
            aVar.f44192c = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44190a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44191b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44192c = ProtoAdapter.FLOAT.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateChatLastReadPositionRequest createChatLastReadPositionRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, createChatLastReadPositionRequest.chat_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, createChatLastReadPositionRequest.position);
            if (createChatLastReadPositionRequest.offset != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 3, createChatLastReadPositionRequest.offset);
            }
            protoWriter.writeBytes(createChatLastReadPositionRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17336a newBuilder() {
        C17336a aVar = new C17336a();
        aVar.f44190a = this.chat_id;
        aVar.f44191b = this.position;
        aVar.f44192c = this.offset;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateChatLastReadPositionRequest$a */
    public static final class C17336a extends Message.Builder<CreateChatLastReadPositionRequest, C17336a> {

        /* renamed from: a */
        public String f44190a;

        /* renamed from: b */
        public Integer f44191b;

        /* renamed from: c */
        public Float f44192c;

        /* renamed from: a */
        public CreateChatLastReadPositionRequest build() {
            Integer num;
            String str = this.f44190a;
            if (str != null && (num = this.f44191b) != null) {
                return new CreateChatLastReadPositionRequest(str, num, this.f44192c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id", this.f44191b, "position");
        }

        /* renamed from: a */
        public C17336a mo60865a(Float f) {
            this.f44192c = f;
            return this;
        }

        /* renamed from: a */
        public C17336a mo60866a(Integer num) {
            this.f44191b = num;
            return this;
        }

        /* renamed from: a */
        public C17336a mo60867a(String str) {
            this.f44190a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CreateChatLastReadPositionRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        sb.append(", position=");
        sb.append(this.position);
        if (this.offset != null) {
            sb.append(", offset=");
            sb.append(this.offset);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateChatLastReadPositionRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreateChatLastReadPositionRequest(String str, Integer num, Float f) {
        this(str, num, f, ByteString.EMPTY);
    }

    public CreateChatLastReadPositionRequest(String str, Integer num, Float f, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.position = num;
        this.offset = f;
    }
}
