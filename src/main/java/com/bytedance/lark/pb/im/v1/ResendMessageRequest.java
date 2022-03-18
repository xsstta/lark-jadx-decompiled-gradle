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

public final class ResendMessageRequest extends Message<ResendMessageRequest, C18005a> {
    public static final ProtoAdapter<ResendMessageRequest> ADAPTER = new C18006b();
    public static final Long DEFAULT_FILE_HANDLE = 0L;
    private static final long serialVersionUID = 0;
    public final String cid;
    public final Long file_handle;

    /* renamed from: com.bytedance.lark.pb.im.v1.ResendMessageRequest$b */
    private static final class C18006b extends ProtoAdapter<ResendMessageRequest> {
        C18006b() {
            super(FieldEncoding.LENGTH_DELIMITED, ResendMessageRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ResendMessageRequest resendMessageRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, resendMessageRequest.cid);
            if (resendMessageRequest.file_handle != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(2, resendMessageRequest.file_handle);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + resendMessageRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ResendMessageRequest decode(ProtoReader protoReader) throws IOException {
            C18005a aVar = new C18005a();
            aVar.f45105a = "";
            aVar.f45106b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45105a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45106b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ResendMessageRequest resendMessageRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, resendMessageRequest.cid);
            if (resendMessageRequest.file_handle != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, resendMessageRequest.file_handle);
            }
            protoWriter.writeBytes(resendMessageRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.ResendMessageRequest$a */
    public static final class C18005a extends Message.Builder<ResendMessageRequest, C18005a> {

        /* renamed from: a */
        public String f45105a;

        /* renamed from: b */
        public Long f45106b;

        /* renamed from: a */
        public ResendMessageRequest build() {
            String str = this.f45105a;
            if (str != null) {
                return new ResendMessageRequest(str, this.f45106b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "cid");
        }

        /* renamed from: a */
        public C18005a mo62545a(Long l) {
            this.f45106b = l;
            return this;
        }

        /* renamed from: a */
        public C18005a mo62546a(String str) {
            this.f45105a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18005a newBuilder() {
        C18005a aVar = new C18005a();
        aVar.f45105a = this.cid;
        aVar.f45106b = this.file_handle;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "ResendMessageRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", cid=");
        sb.append(this.cid);
        if (this.file_handle != null) {
            sb.append(", file_handle=");
            sb.append(this.file_handle);
        }
        StringBuilder replace = sb.replace(0, 2, "ResendMessageRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ResendMessageRequest(String str, Long l) {
        this(str, l, ByteString.EMPTY);
    }

    public ResendMessageRequest(String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cid = str;
        this.file_handle = l;
    }
}
