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

public final class PushPinReadStatusResponse extends Message<PushPinReadStatusResponse, C17939a> {
    public static final ProtoAdapter<PushPinReadStatusResponse> ADAPTER = new C17940b();
    public static final Boolean DEFAULT_IS_READ = false;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final Boolean is_read;

    /* renamed from: com.bytedance.lark.pb.im.v1.PushPinReadStatusResponse$b */
    private static final class C17940b extends ProtoAdapter<PushPinReadStatusResponse> {
        C17940b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushPinReadStatusResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PushPinReadStatusResponse pushPinReadStatusResponse) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, pushPinReadStatusResponse.chat_id) + ProtoAdapter.BOOL.encodedSizeWithTag(2, pushPinReadStatusResponse.is_read) + pushPinReadStatusResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PushPinReadStatusResponse decode(ProtoReader protoReader) throws IOException {
            C17939a aVar = new C17939a();
            aVar.f45031a = "";
            aVar.f45032b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45031a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45032b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushPinReadStatusResponse pushPinReadStatusResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushPinReadStatusResponse.chat_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, pushPinReadStatusResponse.is_read);
            protoWriter.writeBytes(pushPinReadStatusResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17939a newBuilder() {
        C17939a aVar = new C17939a();
        aVar.f45031a = this.chat_id;
        aVar.f45032b = this.is_read;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushPinReadStatusResponse$a */
    public static final class C17939a extends Message.Builder<PushPinReadStatusResponse, C17939a> {

        /* renamed from: a */
        public String f45031a;

        /* renamed from: b */
        public Boolean f45032b;

        /* renamed from: a */
        public PushPinReadStatusResponse build() {
            Boolean bool;
            String str = this.f45031a;
            if (str != null && (bool = this.f45032b) != null) {
                return new PushPinReadStatusResponse(str, bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id", this.f45032b, "is_read");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushPinReadStatusResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        sb.append(", is_read=");
        sb.append(this.is_read);
        StringBuilder replace = sb.replace(0, 2, "PushPinReadStatusResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PushPinReadStatusResponse(String str, Boolean bool) {
        this(str, bool, ByteString.EMPTY);
    }

    public PushPinReadStatusResponse(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.is_read = bool;
    }
}
