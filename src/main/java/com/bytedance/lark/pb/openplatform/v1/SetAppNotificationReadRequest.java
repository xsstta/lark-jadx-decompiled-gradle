package com.bytedance.lark.pb.openplatform.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SetAppNotificationReadRequest extends Message<SetAppNotificationReadRequest, C18711a> {
    public static final ProtoAdapter<SetAppNotificationReadRequest> ADAPTER = new C18712b();
    private static final long serialVersionUID = 0;
    public final String app_id;
    public final String seq_id;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.SetAppNotificationReadRequest$b */
    private static final class C18712b extends ProtoAdapter<SetAppNotificationReadRequest> {
        C18712b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetAppNotificationReadRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetAppNotificationReadRequest setAppNotificationReadRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, setAppNotificationReadRequest.app_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, setAppNotificationReadRequest.seq_id) + setAppNotificationReadRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetAppNotificationReadRequest decode(ProtoReader protoReader) throws IOException {
            C18711a aVar = new C18711a();
            aVar.f46258a = "";
            aVar.f46259b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46258a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46259b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetAppNotificationReadRequest setAppNotificationReadRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setAppNotificationReadRequest.app_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, setAppNotificationReadRequest.seq_id);
            protoWriter.writeBytes(setAppNotificationReadRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18711a newBuilder() {
        C18711a aVar = new C18711a();
        aVar.f46258a = this.app_id;
        aVar.f46259b = this.seq_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.SetAppNotificationReadRequest$a */
    public static final class C18711a extends Message.Builder<SetAppNotificationReadRequest, C18711a> {

        /* renamed from: a */
        public String f46258a;

        /* renamed from: b */
        public String f46259b;

        /* renamed from: a */
        public SetAppNotificationReadRequest build() {
            String str;
            String str2 = this.f46258a;
            if (str2 != null && (str = this.f46259b) != null) {
                return new SetAppNotificationReadRequest(str2, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "app_id", this.f46259b, "seq_id");
        }

        /* renamed from: a */
        public C18711a mo64363a(String str) {
            this.f46258a = str;
            return this;
        }

        /* renamed from: b */
        public C18711a mo64365b(String str) {
            this.f46259b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "SetAppNotificationReadRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", app_id=");
        sb.append(this.app_id);
        sb.append(", seq_id=");
        sb.append(this.seq_id);
        StringBuilder replace = sb.replace(0, 2, "SetAppNotificationReadRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetAppNotificationReadRequest(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public SetAppNotificationReadRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.app_id = str;
        this.seq_id = str2;
    }
}
