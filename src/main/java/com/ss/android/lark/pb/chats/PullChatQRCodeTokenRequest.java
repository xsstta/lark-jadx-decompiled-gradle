package com.ss.android.lark.pb.chats;

import com.google.protobuf.server.FieldOptions;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PullChatQRCodeTokenRequest extends Message<PullChatQRCodeTokenRequest, C49596a> {
    public static final ProtoAdapter<PullChatQRCodeTokenRequest> ADAPTER = new C49597b();
    public static final Integer DEFAULT_EXPIRED_DAY = 7;
    public static final Boolean DEFAULT_IS_UNLIMITED = false;
    public static final FieldOptions FIELD_OPTIONS_MCHAT_ID = new FieldOptions.C23155a().mo80350a("split,type=channel").build();
    private static final long serialVersionUID = 0;
    public final String mchat_id;
    public final Integer mexpired_day;
    public final Boolean mis_unlimited;

    /* renamed from: com.ss.android.lark.pb.chats.PullChatQRCodeTokenRequest$b */
    private static final class C49597b extends ProtoAdapter<PullChatQRCodeTokenRequest> {
        C49597b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullChatQRCodeTokenRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullChatQRCodeTokenRequest pullChatQRCodeTokenRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, pullChatQRCodeTokenRequest.mchat_id);
            int i2 = 0;
            if (pullChatQRCodeTokenRequest.mexpired_day != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, pullChatQRCodeTokenRequest.mexpired_day);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (pullChatQRCodeTokenRequest.mis_unlimited != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, pullChatQRCodeTokenRequest.mis_unlimited);
            }
            return i3 + i2 + pullChatQRCodeTokenRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullChatQRCodeTokenRequest decode(ProtoReader protoReader) throws IOException {
            C49596a aVar = new C49596a();
            aVar.f124220a = "";
            aVar.f124221b = 7;
            aVar.f124222c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124220a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124221b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124222c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullChatQRCodeTokenRequest pullChatQRCodeTokenRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pullChatQRCodeTokenRequest.mchat_id);
            if (pullChatQRCodeTokenRequest.mexpired_day != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, pullChatQRCodeTokenRequest.mexpired_day);
            }
            if (pullChatQRCodeTokenRequest.mis_unlimited != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, pullChatQRCodeTokenRequest.mis_unlimited);
            }
            protoWriter.writeBytes(pullChatQRCodeTokenRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49596a newBuilder() {
        C49596a aVar = new C49596a();
        aVar.f124220a = this.mchat_id;
        aVar.f124221b = this.mexpired_day;
        aVar.f124222c = this.mis_unlimited;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.chats.PullChatQRCodeTokenRequest$a */
    public static final class C49596a extends Message.Builder<PullChatQRCodeTokenRequest, C49596a> {

        /* renamed from: a */
        public String f124220a;

        /* renamed from: b */
        public Integer f124221b;

        /* renamed from: c */
        public Boolean f124222c;

        /* renamed from: a */
        public PullChatQRCodeTokenRequest build() {
            String str = this.f124220a;
            if (str != null) {
                return new PullChatQRCodeTokenRequest(str, this.f124221b, this.f124222c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mchat_id");
        }

        /* renamed from: a */
        public C49596a mo172918a(Boolean bool) {
            this.f124222c = bool;
            return this;
        }

        /* renamed from: a */
        public C49596a mo172919a(Integer num) {
            this.f124221b = num;
            return this;
        }

        /* renamed from: a */
        public C49596a mo172920a(String str) {
            this.f124220a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.mchat_id);
        if (this.mexpired_day != null) {
            sb.append(", expired_day=");
            sb.append(this.mexpired_day);
        }
        if (this.mis_unlimited != null) {
            sb.append(", is_unlimited=");
            sb.append(this.mis_unlimited);
        }
        StringBuilder replace = sb.replace(0, 2, "PullChatQRCodeTokenRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullChatQRCodeTokenRequest(String str, Integer num, Boolean bool) {
        this(str, num, bool, ByteString.EMPTY);
    }

    public PullChatQRCodeTokenRequest(String str, Integer num, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mchat_id = str;
        this.mexpired_day = num;
        this.mis_unlimited = bool;
    }
}
