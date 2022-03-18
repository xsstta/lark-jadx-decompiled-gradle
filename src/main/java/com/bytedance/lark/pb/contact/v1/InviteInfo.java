package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class InviteInfo extends Message<InviteInfo, C16322a> {
    public static final ProtoAdapter<InviteInfo> ADAPTER = new C16323b();
    public static final Integer DEFAULT_STATUS_CODE = 0;
    private static final long serialVersionUID = 0;
    public final Integer status_code;
    public final String status_message;

    /* renamed from: com.bytedance.lark.pb.contact.v1.InviteInfo$b */
    private static final class C16323b extends ProtoAdapter<InviteInfo> {
        C16323b() {
            super(FieldEncoding.LENGTH_DELIMITED, InviteInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(InviteInfo inviteInfo) {
            int i;
            int i2 = 0;
            if (inviteInfo.status_message != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, inviteInfo.status_message);
            } else {
                i = 0;
            }
            if (inviteInfo.status_code != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, inviteInfo.status_code);
            }
            return i + i2 + inviteInfo.unknownFields().size();
        }

        /* renamed from: a */
        public InviteInfo decode(ProtoReader protoReader) throws IOException {
            C16322a aVar = new C16322a();
            aVar.f42568a = "";
            aVar.f42569b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42568a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42569b = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, InviteInfo inviteInfo) throws IOException {
            if (inviteInfo.status_message != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, inviteInfo.status_message);
            }
            if (inviteInfo.status_code != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, inviteInfo.status_code);
            }
            protoWriter.writeBytes(inviteInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.InviteInfo$a */
    public static final class C16322a extends Message.Builder<InviteInfo, C16322a> {

        /* renamed from: a */
        public String f42568a;

        /* renamed from: b */
        public Integer f42569b;

        /* renamed from: a */
        public InviteInfo build() {
            return new InviteInfo(this.f42568a, this.f42569b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16322a newBuilder() {
        C16322a aVar = new C16322a();
        aVar.f42568a = this.status_message;
        aVar.f42569b = this.status_code;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "InviteInfo");
        StringBuilder sb = new StringBuilder();
        if (this.status_message != null) {
            sb.append(", status_message=");
            sb.append(this.status_message);
        }
        if (this.status_code != null) {
            sb.append(", status_code=");
            sb.append(this.status_code);
        }
        StringBuilder replace = sb.replace(0, 2, "InviteInfo{");
        replace.append('}');
        return replace.toString();
    }

    public InviteInfo(String str, Integer num) {
        this(str, num, ByteString.EMPTY);
    }

    public InviteInfo(String str, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status_message = str;
        this.status_code = num;
    }
}
