package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.QuasiContent;
import com.bytedance.lark.pb.basic.v1.QuasiMessage;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class UpdateQuasiMessageRequest extends Message<UpdateQuasiMessageRequest, C18158a> {
    public static final ProtoAdapter<UpdateQuasiMessageRequest> ADAPTER = new C18159b();
    public static final QuasiMessage.Status DEFAULT_STATUS = QuasiMessage.Status.PENDING;
    private static final long serialVersionUID = 0;
    public final String cid;
    public final QuasiContent content;
    public final QuasiMessage.Status status;

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateQuasiMessageRequest$b */
    private static final class C18159b extends ProtoAdapter<UpdateQuasiMessageRequest> {
        C18159b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateQuasiMessageRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateQuasiMessageRequest updateQuasiMessageRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, updateQuasiMessageRequest.cid) + QuasiMessage.Status.ADAPTER.encodedSizeWithTag(2, updateQuasiMessageRequest.status);
            if (updateQuasiMessageRequest.content != null) {
                i = QuasiContent.ADAPTER.encodedSizeWithTag(3, updateQuasiMessageRequest.content);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + updateQuasiMessageRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateQuasiMessageRequest decode(ProtoReader protoReader) throws IOException {
            C18158a aVar = new C18158a();
            aVar.f45357a = "";
            aVar.f45358b = QuasiMessage.Status.PENDING;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45357a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f45358b = QuasiMessage.Status.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45359c = QuasiContent.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateQuasiMessageRequest updateQuasiMessageRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, updateQuasiMessageRequest.cid);
            QuasiMessage.Status.ADAPTER.encodeWithTag(protoWriter, 2, updateQuasiMessageRequest.status);
            if (updateQuasiMessageRequest.content != null) {
                QuasiContent.ADAPTER.encodeWithTag(protoWriter, 3, updateQuasiMessageRequest.content);
            }
            protoWriter.writeBytes(updateQuasiMessageRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18158a newBuilder() {
        C18158a aVar = new C18158a();
        aVar.f45357a = this.cid;
        aVar.f45358b = this.status;
        aVar.f45359c = this.content;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateQuasiMessageRequest$a */
    public static final class C18158a extends Message.Builder<UpdateQuasiMessageRequest, C18158a> {

        /* renamed from: a */
        public String f45357a;

        /* renamed from: b */
        public QuasiMessage.Status f45358b;

        /* renamed from: c */
        public QuasiContent f45359c;

        /* renamed from: a */
        public UpdateQuasiMessageRequest build() {
            QuasiMessage.Status status;
            String str = this.f45357a;
            if (str != null && (status = this.f45358b) != null) {
                return new UpdateQuasiMessageRequest(str, status, this.f45359c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "cid", this.f45358b, UpdateKey.STATUS);
        }

        /* renamed from: a */
        public C18158a mo62986a(QuasiMessage.Status status) {
            this.f45358b = status;
            return this;
        }

        /* renamed from: a */
        public C18158a mo62987a(String str) {
            this.f45357a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "UpdateQuasiMessageRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", cid=");
        sb.append(this.cid);
        sb.append(", status=");
        sb.append(this.status);
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateQuasiMessageRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateQuasiMessageRequest(String str, QuasiMessage.Status status2, QuasiContent quasiContent) {
        this(str, status2, quasiContent, ByteString.EMPTY);
    }

    public UpdateQuasiMessageRequest(String str, QuasiMessage.Status status2, QuasiContent quasiContent, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cid = str;
        this.status = status2;
        this.content = quasiContent;
    }
}
