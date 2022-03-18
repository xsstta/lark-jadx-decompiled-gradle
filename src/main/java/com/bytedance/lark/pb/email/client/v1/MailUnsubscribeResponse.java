package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class MailUnsubscribeResponse extends Message<MailUnsubscribeResponse, C16928a> {
    public static final ProtoAdapter<MailUnsubscribeResponse> ADAPTER = new C16929b();
    public static final UnsubscribeResult DEFAULT_RESULT = UnsubscribeResult.SUCCEED;
    private static final long serialVersionUID = 0;
    public final UnsubscribeResult result;

    public enum UnsubscribeResult implements WireEnum {
        SUCCEED(0),
        NOT_SUPPORT(1);
        
        public static final ProtoAdapter<UnsubscribeResult> ADAPTER = ProtoAdapter.newEnumAdapter(UnsubscribeResult.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static UnsubscribeResult fromValue(int i) {
            if (i == 0) {
                return SUCCEED;
            }
            if (i != 1) {
                return null;
            }
            return NOT_SUPPORT;
        }

        private UnsubscribeResult(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUnsubscribeResponse$b */
    private static final class C16929b extends ProtoAdapter<MailUnsubscribeResponse> {
        C16929b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailUnsubscribeResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailUnsubscribeResponse mailUnsubscribeResponse) {
            int i;
            if (mailUnsubscribeResponse.result != null) {
                i = UnsubscribeResult.ADAPTER.encodedSizeWithTag(1, mailUnsubscribeResponse.result);
            } else {
                i = 0;
            }
            return i + mailUnsubscribeResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailUnsubscribeResponse decode(ProtoReader protoReader) throws IOException {
            C16928a aVar = new C16928a();
            aVar.f43423a = UnsubscribeResult.SUCCEED;
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
                    try {
                        aVar.f43423a = UnsubscribeResult.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailUnsubscribeResponse mailUnsubscribeResponse) throws IOException {
            if (mailUnsubscribeResponse.result != null) {
                UnsubscribeResult.ADAPTER.encodeWithTag(protoWriter, 1, mailUnsubscribeResponse.result);
            }
            protoWriter.writeBytes(mailUnsubscribeResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUnsubscribeResponse$a */
    public static final class C16928a extends Message.Builder<MailUnsubscribeResponse, C16928a> {

        /* renamed from: a */
        public UnsubscribeResult f43423a;

        /* renamed from: a */
        public MailUnsubscribeResponse build() {
            return new MailUnsubscribeResponse(this.f43423a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16928a newBuilder() {
        C16928a aVar = new C16928a();
        aVar.f43423a = this.result;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailUnsubscribeResponse");
        StringBuilder sb = new StringBuilder();
        if (this.result != null) {
            sb.append(", result=");
            sb.append(this.result);
        }
        StringBuilder replace = sb.replace(0, 2, "MailUnsubscribeResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailUnsubscribeResponse(UnsubscribeResult unsubscribeResult) {
        this(unsubscribeResult, ByteString.EMPTY);
    }

    public MailUnsubscribeResponse(UnsubscribeResult unsubscribeResult, ByteString byteString) {
        super(ADAPTER, byteString);
        this.result = unsubscribeResult;
    }
}
