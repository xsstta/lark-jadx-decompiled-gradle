package com.ss.android.lark.pb.videochat;

import com.google.protobuf.server.FieldOptions;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PullVCCardInfoRequest extends Message<PullVCCardInfoRequest, C50401a> {
    public static final ProtoAdapter<PullVCCardInfoRequest> ADAPTER = new C50402b();
    public static final FieldOptions FIELD_OPTIONS_MID = new FieldOptions.C23155a().mo80350a("split,type=meeting").build();
    private static final long serialVersionUID = 0;
    public final String mchat_id;
    public final String mid;
    public final String mnext_request_token;

    /* renamed from: com.ss.android.lark.pb.videochat.PullVCCardInfoRequest$b */
    private static final class C50402b extends ProtoAdapter<PullVCCardInfoRequest> {
        C50402b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullVCCardInfoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullVCCardInfoRequest pullVCCardInfoRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, pullVCCardInfoRequest.mid);
            int i2 = 0;
            if (pullVCCardInfoRequest.mnext_request_token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, pullVCCardInfoRequest.mnext_request_token);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (pullVCCardInfoRequest.mchat_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, pullVCCardInfoRequest.mchat_id);
            }
            return i3 + i2 + pullVCCardInfoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullVCCardInfoRequest decode(ProtoReader protoReader) throws IOException {
            C50401a aVar = new C50401a();
            aVar.f125872a = "";
            aVar.f125873b = "";
            aVar.f125874c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125872a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125873b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125874c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullVCCardInfoRequest pullVCCardInfoRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pullVCCardInfoRequest.mid);
            if (pullVCCardInfoRequest.mnext_request_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pullVCCardInfoRequest.mnext_request_token);
            }
            if (pullVCCardInfoRequest.mchat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, pullVCCardInfoRequest.mchat_id);
            }
            protoWriter.writeBytes(pullVCCardInfoRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50401a newBuilder() {
        C50401a aVar = new C50401a();
        aVar.f125872a = this.mid;
        aVar.f125873b = this.mnext_request_token;
        aVar.f125874c = this.mchat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videochat.PullVCCardInfoRequest$a */
    public static final class C50401a extends Message.Builder<PullVCCardInfoRequest, C50401a> {

        /* renamed from: a */
        public String f125872a;

        /* renamed from: b */
        public String f125873b;

        /* renamed from: c */
        public String f125874c;

        /* renamed from: a */
        public PullVCCardInfoRequest build() {
            String str = this.f125872a;
            if (str != null) {
                return new PullVCCardInfoRequest(str, this.f125873b, this.f125874c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mid");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.mid);
        if (this.mnext_request_token != null) {
            sb.append(", next_request_token=");
            sb.append(this.mnext_request_token);
        }
        if (this.mchat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.mchat_id);
        }
        StringBuilder replace = sb.replace(0, 2, "PullVCCardInfoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullVCCardInfoRequest(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public PullVCCardInfoRequest(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mid = str;
        this.mnext_request_token = str2;
        this.mchat_id = str3;
    }
}
