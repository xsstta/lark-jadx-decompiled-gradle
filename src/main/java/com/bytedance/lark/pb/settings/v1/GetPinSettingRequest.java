package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetPinSettingRequest extends Message<GetPinSettingRequest, C19151a> {
    public static final ProtoAdapter<GetPinSettingRequest> ADAPTER = new C19152b();
    public static final Boolean DEFAULT_IS_FROM_SVR = false;
    private static final long serialVersionUID = 0;
    public final Boolean is_from_svr;

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetPinSettingRequest$b */
    private static final class C19152b extends ProtoAdapter<GetPinSettingRequest> {
        C19152b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetPinSettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetPinSettingRequest getPinSettingRequest) {
            int i;
            if (getPinSettingRequest.is_from_svr != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, getPinSettingRequest.is_from_svr);
            } else {
                i = 0;
            }
            return i + getPinSettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetPinSettingRequest decode(ProtoReader protoReader) throws IOException {
            C19151a aVar = new C19151a();
            aVar.f47292a = false;
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
                    aVar.f47292a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetPinSettingRequest getPinSettingRequest) throws IOException {
            if (getPinSettingRequest.is_from_svr != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getPinSettingRequest.is_from_svr);
            }
            protoWriter.writeBytes(getPinSettingRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetPinSettingRequest$a */
    public static final class C19151a extends Message.Builder<GetPinSettingRequest, C19151a> {

        /* renamed from: a */
        public Boolean f47292a;

        /* renamed from: a */
        public GetPinSettingRequest build() {
            return new GetPinSettingRequest(this.f47292a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19151a newBuilder() {
        C19151a aVar = new C19151a();
        aVar.f47292a = this.is_from_svr;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "GetPinSettingRequest");
        StringBuilder sb = new StringBuilder();
        if (this.is_from_svr != null) {
            sb.append(", is_from_svr=");
            sb.append(this.is_from_svr);
        }
        StringBuilder replace = sb.replace(0, 2, "GetPinSettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetPinSettingRequest(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public GetPinSettingRequest(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_from_svr = bool;
    }
}
