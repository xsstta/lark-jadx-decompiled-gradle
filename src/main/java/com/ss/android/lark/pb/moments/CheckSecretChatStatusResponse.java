package com.ss.android.lark.pb.moments;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.lark.pb.moments_entities.SecretChatStatus;
import java.io.IOException;
import okio.ByteString;

public final class CheckSecretChatStatusResponse extends Message<CheckSecretChatStatusResponse, C49902a> {
    public static final ProtoAdapter<CheckSecretChatStatusResponse> ADAPTER = new C49903b();
    public static final Long DEFAULT_PREVIOUS_ASK_TIME_SEC = 0L;
    private static final long serialVersionUID = 0;
    public final String mchat_id;
    public final Long mprevious_ask_time_sec;
    public final SecretChatStatus mstatus;

    /* renamed from: com.ss.android.lark.pb.moments.CheckSecretChatStatusResponse$b */
    private static final class C49903b extends ProtoAdapter<CheckSecretChatStatusResponse> {
        C49903b() {
            super(FieldEncoding.LENGTH_DELIMITED, CheckSecretChatStatusResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CheckSecretChatStatusResponse checkSecretChatStatusResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (checkSecretChatStatusResponse.mstatus != null) {
                i = SecretChatStatus.ADAPTER.encodedSizeWithTag(1, checkSecretChatStatusResponse.mstatus);
            } else {
                i = 0;
            }
            if (checkSecretChatStatusResponse.mprevious_ask_time_sec != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, checkSecretChatStatusResponse.mprevious_ask_time_sec);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (checkSecretChatStatusResponse.mchat_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, checkSecretChatStatusResponse.mchat_id);
            }
            return i4 + i3 + checkSecretChatStatusResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CheckSecretChatStatusResponse decode(ProtoReader protoReader) throws IOException {
            C49902a aVar = new C49902a();
            aVar.f124922b = 0L;
            aVar.f124923c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f124921a = SecretChatStatus.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f124922b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124923c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CheckSecretChatStatusResponse checkSecretChatStatusResponse) throws IOException {
            if (checkSecretChatStatusResponse.mstatus != null) {
                SecretChatStatus.ADAPTER.encodeWithTag(protoWriter, 1, checkSecretChatStatusResponse.mstatus);
            }
            if (checkSecretChatStatusResponse.mprevious_ask_time_sec != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, checkSecretChatStatusResponse.mprevious_ask_time_sec);
            }
            if (checkSecretChatStatusResponse.mchat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, checkSecretChatStatusResponse.mchat_id);
            }
            protoWriter.writeBytes(checkSecretChatStatusResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.moments.CheckSecretChatStatusResponse$a */
    public static final class C49902a extends Message.Builder<CheckSecretChatStatusResponse, C49902a> {

        /* renamed from: a */
        public SecretChatStatus f124921a;

        /* renamed from: b */
        public Long f124922b;

        /* renamed from: c */
        public String f124923c;

        /* renamed from: a */
        public CheckSecretChatStatusResponse build() {
            return new CheckSecretChatStatusResponse(this.f124921a, this.f124922b, this.f124923c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49902a newBuilder() {
        C49902a aVar = new C49902a();
        aVar.f124921a = this.mstatus;
        aVar.f124922b = this.mprevious_ask_time_sec;
        aVar.f124923c = this.mchat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mstatus != null) {
            sb.append(", status=");
            sb.append(this.mstatus);
        }
        if (this.mprevious_ask_time_sec != null) {
            sb.append(", previous_ask_time_sec=");
            sb.append(this.mprevious_ask_time_sec);
        }
        if (this.mchat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.mchat_id);
        }
        StringBuilder replace = sb.replace(0, 2, "CheckSecretChatStatusResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CheckSecretChatStatusResponse(SecretChatStatus secretChatStatus, Long l, String str) {
        this(secretChatStatus, l, str, ByteString.EMPTY);
    }

    public CheckSecretChatStatusResponse(SecretChatStatus secretChatStatus, Long l, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mstatus = secretChatStatus;
        this.mprevious_ask_time_sec = l;
        this.mchat_id = str;
    }
}
