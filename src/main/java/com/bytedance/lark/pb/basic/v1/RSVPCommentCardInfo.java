package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class RSVPCommentCardInfo extends Message<RSVPCommentCardInfo, C15143a> {
    public static final ProtoAdapter<RSVPCommentCardInfo> ADAPTER = new C15144b();
    private static final long serialVersionUID = 0;
    public final String responder_user_id;

    /* renamed from: com.bytedance.lark.pb.basic.v1.RSVPCommentCardInfo$b */
    private static final class C15144b extends ProtoAdapter<RSVPCommentCardInfo> {
        C15144b() {
            super(FieldEncoding.LENGTH_DELIMITED, RSVPCommentCardInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(RSVPCommentCardInfo rSVPCommentCardInfo) {
            int i;
            if (rSVPCommentCardInfo.responder_user_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, rSVPCommentCardInfo.responder_user_id);
            } else {
                i = 0;
            }
            return i + rSVPCommentCardInfo.unknownFields().size();
        }

        /* renamed from: a */
        public RSVPCommentCardInfo decode(ProtoReader protoReader) throws IOException {
            C15143a aVar = new C15143a();
            aVar.f40182a = "";
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
                    aVar.f40182a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, RSVPCommentCardInfo rSVPCommentCardInfo) throws IOException {
            if (rSVPCommentCardInfo.responder_user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, rSVPCommentCardInfo.responder_user_id);
            }
            protoWriter.writeBytes(rSVPCommentCardInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.RSVPCommentCardInfo$a */
    public static final class C15143a extends Message.Builder<RSVPCommentCardInfo, C15143a> {

        /* renamed from: a */
        public String f40182a;

        /* renamed from: a */
        public RSVPCommentCardInfo build() {
            return new RSVPCommentCardInfo(this.f40182a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15143a newBuilder() {
        C15143a aVar = new C15143a();
        aVar.f40182a = this.responder_user_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "RSVPCommentCardInfo");
        StringBuilder sb = new StringBuilder();
        if (this.responder_user_id != null) {
            sb.append(", responder_user_id=");
            sb.append(this.responder_user_id);
        }
        StringBuilder replace = sb.replace(0, 2, "RSVPCommentCardInfo{");
        replace.append('}');
        return replace.toString();
    }

    public RSVPCommentCardInfo(String str) {
        this(str, ByteString.EMPTY);
    }

    public RSVPCommentCardInfo(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.responder_user_id = str;
    }
}
