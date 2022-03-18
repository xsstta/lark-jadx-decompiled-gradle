package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetMailsAllReadRequest extends Message<SetMailsAllReadRequest, C16978a> {
    public static final ProtoAdapter<SetMailsAllReadRequest> ADAPTER = new C16979b();
    public static final Boolean DEFAULT_APPLY_TO_ALL_DESCENDANTS = false;
    private static final long serialVersionUID = 0;
    public final Boolean apply_to_all_descendants;
    public final String label_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.SetMailsAllReadRequest$b */
    private static final class C16979b extends ProtoAdapter<SetMailsAllReadRequest> {
        C16979b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetMailsAllReadRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetMailsAllReadRequest setMailsAllReadRequest) {
            int i;
            int i2 = 0;
            if (setMailsAllReadRequest.label_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, setMailsAllReadRequest.label_id);
            } else {
                i = 0;
            }
            if (setMailsAllReadRequest.apply_to_all_descendants != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, setMailsAllReadRequest.apply_to_all_descendants);
            }
            return i + i2 + setMailsAllReadRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetMailsAllReadRequest decode(ProtoReader protoReader) throws IOException {
            C16978a aVar = new C16978a();
            aVar.f43548a = "";
            aVar.f43549b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43548a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43549b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetMailsAllReadRequest setMailsAllReadRequest) throws IOException {
            if (setMailsAllReadRequest.label_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setMailsAllReadRequest.label_id);
            }
            if (setMailsAllReadRequest.apply_to_all_descendants != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, setMailsAllReadRequest.apply_to_all_descendants);
            }
            protoWriter.writeBytes(setMailsAllReadRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.SetMailsAllReadRequest$a */
    public static final class C16978a extends Message.Builder<SetMailsAllReadRequest, C16978a> {

        /* renamed from: a */
        public String f43548a;

        /* renamed from: b */
        public Boolean f43549b;

        /* renamed from: a */
        public SetMailsAllReadRequest build() {
            return new SetMailsAllReadRequest(this.f43548a, this.f43549b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16978a newBuilder() {
        C16978a aVar = new C16978a();
        aVar.f43548a = this.label_id;
        aVar.f43549b = this.apply_to_all_descendants;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "SetMailsAllReadRequest");
        StringBuilder sb = new StringBuilder();
        if (this.label_id != null) {
            sb.append(", label_id=");
            sb.append(this.label_id);
        }
        if (this.apply_to_all_descendants != null) {
            sb.append(", apply_to_all_descendants=");
            sb.append(this.apply_to_all_descendants);
        }
        StringBuilder replace = sb.replace(0, 2, "SetMailsAllReadRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetMailsAllReadRequest(String str, Boolean bool) {
        this(str, bool, ByteString.EMPTY);
    }

    public SetMailsAllReadRequest(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.label_id = str;
        this.apply_to_all_descendants = bool;
    }
}
