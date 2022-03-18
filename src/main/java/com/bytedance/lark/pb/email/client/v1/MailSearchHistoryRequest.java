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

public final class MailSearchHistoryRequest extends Message<MailSearchHistoryRequest, C16866a> {
    public static final ProtoAdapter<MailSearchHistoryRequest> ADAPTER = new C16867b();
    public static final SerchHistoryAction DEFAULT_ACTION = SerchHistoryAction.INSERT;
    private static final long serialVersionUID = 0;
    public final SerchHistoryAction action;
    public final String keyword;

    public enum SerchHistoryAction implements WireEnum {
        INSERT(0),
        QUERY(1),
        DELETE_ALL(2);
        
        public static final ProtoAdapter<SerchHistoryAction> ADAPTER = ProtoAdapter.newEnumAdapter(SerchHistoryAction.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static SerchHistoryAction fromValue(int i) {
            if (i == 0) {
                return INSERT;
            }
            if (i == 1) {
                return QUERY;
            }
            if (i != 2) {
                return null;
            }
            return DELETE_ALL;
        }

        private SerchHistoryAction(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSearchHistoryRequest$b */
    private static final class C16867b extends ProtoAdapter<MailSearchHistoryRequest> {
        C16867b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailSearchHistoryRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailSearchHistoryRequest mailSearchHistoryRequest) {
            int i;
            int i2 = 0;
            if (mailSearchHistoryRequest.keyword != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailSearchHistoryRequest.keyword);
            } else {
                i = 0;
            }
            if (mailSearchHistoryRequest.action != null) {
                i2 = SerchHistoryAction.ADAPTER.encodedSizeWithTag(2, mailSearchHistoryRequest.action);
            }
            return i + i2 + mailSearchHistoryRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailSearchHistoryRequest decode(ProtoReader protoReader) throws IOException {
            C16866a aVar = new C16866a();
            aVar.f43330a = "";
            aVar.f43331b = SerchHistoryAction.INSERT;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43330a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f43331b = SerchHistoryAction.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailSearchHistoryRequest mailSearchHistoryRequest) throws IOException {
            if (mailSearchHistoryRequest.keyword != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailSearchHistoryRequest.keyword);
            }
            if (mailSearchHistoryRequest.action != null) {
                SerchHistoryAction.ADAPTER.encodeWithTag(protoWriter, 2, mailSearchHistoryRequest.action);
            }
            protoWriter.writeBytes(mailSearchHistoryRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSearchHistoryRequest$a */
    public static final class C16866a extends Message.Builder<MailSearchHistoryRequest, C16866a> {

        /* renamed from: a */
        public String f43330a;

        /* renamed from: b */
        public SerchHistoryAction f43331b;

        /* renamed from: a */
        public MailSearchHistoryRequest build() {
            return new MailSearchHistoryRequest(this.f43330a, this.f43331b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16866a newBuilder() {
        C16866a aVar = new C16866a();
        aVar.f43330a = this.keyword;
        aVar.f43331b = this.action;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailSearchHistoryRequest");
        StringBuilder sb = new StringBuilder();
        if (this.keyword != null) {
            sb.append(", keyword=");
            sb.append(this.keyword);
        }
        if (this.action != null) {
            sb.append(", action=");
            sb.append(this.action);
        }
        StringBuilder replace = sb.replace(0, 2, "MailSearchHistoryRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailSearchHistoryRequest(String str, SerchHistoryAction serchHistoryAction) {
        this(str, serchHistoryAction, ByteString.EMPTY);
    }

    public MailSearchHistoryRequest(String str, SerchHistoryAction serchHistoryAction, ByteString byteString) {
        super(ADAPTER, byteString);
        this.keyword = str;
        this.action = serchHistoryAction;
    }
}
