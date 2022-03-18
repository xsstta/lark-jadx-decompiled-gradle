package com.ss.android.lark.pb.calendars;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class BindingExchangeAccountRequest extends Message<BindingExchangeAccountRequest, C49566a> {
    public static final ProtoAdapter<BindingExchangeAccountRequest> ADAPTER = new C49567b();
    private static final long serialVersionUID = 0;
    public final String mexchange_account;
    public final String mexchange_password;
    public final String mserver_url;

    /* renamed from: com.ss.android.lark.pb.calendars.BindingExchangeAccountRequest$b */
    private static final class C49567b extends ProtoAdapter<BindingExchangeAccountRequest> {
        C49567b() {
            super(FieldEncoding.LENGTH_DELIMITED, BindingExchangeAccountRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(BindingExchangeAccountRequest bindingExchangeAccountRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (bindingExchangeAccountRequest.mserver_url != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, bindingExchangeAccountRequest.mserver_url);
            } else {
                i = 0;
            }
            if (bindingExchangeAccountRequest.mexchange_account != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, bindingExchangeAccountRequest.mexchange_account);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (bindingExchangeAccountRequest.mexchange_password != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, bindingExchangeAccountRequest.mexchange_password);
            }
            return i4 + i3 + bindingExchangeAccountRequest.unknownFields().size();
        }

        /* renamed from: a */
        public BindingExchangeAccountRequest decode(ProtoReader protoReader) throws IOException {
            C49566a aVar = new C49566a();
            aVar.f124182a = "";
            aVar.f124183b = "";
            aVar.f124184c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124182a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124183b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124184c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BindingExchangeAccountRequest bindingExchangeAccountRequest) throws IOException {
            if (bindingExchangeAccountRequest.mserver_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, bindingExchangeAccountRequest.mserver_url);
            }
            if (bindingExchangeAccountRequest.mexchange_account != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, bindingExchangeAccountRequest.mexchange_account);
            }
            if (bindingExchangeAccountRequest.mexchange_password != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, bindingExchangeAccountRequest.mexchange_password);
            }
            protoWriter.writeBytes(bindingExchangeAccountRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.calendars.BindingExchangeAccountRequest$a */
    public static final class C49566a extends Message.Builder<BindingExchangeAccountRequest, C49566a> {

        /* renamed from: a */
        public String f124182a;

        /* renamed from: b */
        public String f124183b;

        /* renamed from: c */
        public String f124184c;

        /* renamed from: a */
        public BindingExchangeAccountRequest build() {
            return new BindingExchangeAccountRequest(this.f124182a, this.f124183b, this.f124184c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C49566a mo172843a(String str) {
            this.f124182a = str;
            return this;
        }

        /* renamed from: b */
        public C49566a mo172845b(String str) {
            this.f124183b = str;
            return this;
        }

        /* renamed from: c */
        public C49566a mo172846c(String str) {
            this.f124184c = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49566a newBuilder() {
        C49566a aVar = new C49566a();
        aVar.f124182a = this.mserver_url;
        aVar.f124183b = this.mexchange_account;
        aVar.f124184c = this.mexchange_password;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mserver_url != null) {
            sb.append(", server_url=");
            sb.append(this.mserver_url);
        }
        if (this.mexchange_account != null) {
            sb.append(", exchange_account=");
            sb.append(this.mexchange_account);
        }
        if (this.mexchange_password != null) {
            sb.append(", exchange_password=");
            sb.append(this.mexchange_password);
        }
        StringBuilder replace = sb.replace(0, 2, "BindingExchangeAccountRequest{");
        replace.append('}');
        return replace.toString();
    }

    public BindingExchangeAccountRequest(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public BindingExchangeAccountRequest(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mserver_url = str;
        this.mexchange_account = str2;
        this.mexchange_password = str3;
    }
}
