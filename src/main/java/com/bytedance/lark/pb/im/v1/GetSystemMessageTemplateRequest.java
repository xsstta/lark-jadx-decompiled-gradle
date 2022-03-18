package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetSystemMessageTemplateRequest extends Message<GetSystemMessageTemplateRequest, C17693a> {
    public static final ProtoAdapter<GetSystemMessageTemplateRequest> ADAPTER = new C17694b();
    public static final Boolean DEFAULT_IS_PULL_ALL = false;
    private static final long serialVersionUID = 0;
    public final Boolean is_pull_all;
    public final String locale_identifier;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetSystemMessageTemplateRequest$b */
    private static final class C17694b extends ProtoAdapter<GetSystemMessageTemplateRequest> {
        C17694b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetSystemMessageTemplateRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetSystemMessageTemplateRequest getSystemMessageTemplateRequest) {
            int i;
            int i2 = 0;
            if (getSystemMessageTemplateRequest.locale_identifier != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getSystemMessageTemplateRequest.locale_identifier);
            } else {
                i = 0;
            }
            if (getSystemMessageTemplateRequest.is_pull_all != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, getSystemMessageTemplateRequest.is_pull_all);
            }
            return i + i2 + getSystemMessageTemplateRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetSystemMessageTemplateRequest decode(ProtoReader protoReader) throws IOException {
            C17693a aVar = new C17693a();
            aVar.f44712a = "zh_CN";
            aVar.f44713b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44712a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44713b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetSystemMessageTemplateRequest getSystemMessageTemplateRequest) throws IOException {
            if (getSystemMessageTemplateRequest.locale_identifier != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getSystemMessageTemplateRequest.locale_identifier);
            }
            if (getSystemMessageTemplateRequest.is_pull_all != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getSystemMessageTemplateRequest.is_pull_all);
            }
            protoWriter.writeBytes(getSystemMessageTemplateRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetSystemMessageTemplateRequest$a */
    public static final class C17693a extends Message.Builder<GetSystemMessageTemplateRequest, C17693a> {

        /* renamed from: a */
        public String f44712a;

        /* renamed from: b */
        public Boolean f44713b;

        /* renamed from: a */
        public GetSystemMessageTemplateRequest build() {
            return new GetSystemMessageTemplateRequest(this.f44712a, this.f44713b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17693a mo61802a(Boolean bool) {
            this.f44713b = bool;
            return this;
        }

        /* renamed from: a */
        public C17693a mo61803a(String str) {
            this.f44712a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17693a newBuilder() {
        C17693a aVar = new C17693a();
        aVar.f44712a = this.locale_identifier;
        aVar.f44713b = this.is_pull_all;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetSystemMessageTemplateRequest");
        StringBuilder sb = new StringBuilder();
        if (this.locale_identifier != null) {
            sb.append(", locale_identifier=");
            sb.append(this.locale_identifier);
        }
        if (this.is_pull_all != null) {
            sb.append(", is_pull_all=");
            sb.append(this.is_pull_all);
        }
        StringBuilder replace = sb.replace(0, 2, "GetSystemMessageTemplateRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetSystemMessageTemplateRequest(String str, Boolean bool) {
        this(str, bool, ByteString.EMPTY);
    }

    public GetSystemMessageTemplateRequest(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.locale_identifier = str;
        this.is_pull_all = bool;
    }
}
