package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class JudgeSecureLinkRequest extends Message<JudgeSecureLinkRequest, C17793a> {
    public static final ProtoAdapter<JudgeSecureLinkRequest> ADAPTER = new C17794b();
    private static final long serialVersionUID = 0;
    public final String scene;
    public final String target;

    /* renamed from: com.bytedance.lark.pb.im.v1.JudgeSecureLinkRequest$b */
    private static final class C17794b extends ProtoAdapter<JudgeSecureLinkRequest> {
        C17794b() {
            super(FieldEncoding.LENGTH_DELIMITED, JudgeSecureLinkRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(JudgeSecureLinkRequest judgeSecureLinkRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, judgeSecureLinkRequest.target) + ProtoAdapter.STRING.encodedSizeWithTag(2, judgeSecureLinkRequest.scene) + judgeSecureLinkRequest.unknownFields().size();
        }

        /* renamed from: a */
        public JudgeSecureLinkRequest decode(ProtoReader protoReader) throws IOException {
            C17793a aVar = new C17793a();
            aVar.f44836a = "";
            aVar.f44837b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44836a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44837b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, JudgeSecureLinkRequest judgeSecureLinkRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, judgeSecureLinkRequest.target);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, judgeSecureLinkRequest.scene);
            protoWriter.writeBytes(judgeSecureLinkRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17793a newBuilder() {
        C17793a aVar = new C17793a();
        aVar.f44836a = this.target;
        aVar.f44837b = this.scene;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.JudgeSecureLinkRequest$a */
    public static final class C17793a extends Message.Builder<JudgeSecureLinkRequest, C17793a> {

        /* renamed from: a */
        public String f44836a;

        /* renamed from: b */
        public String f44837b;

        /* renamed from: a */
        public JudgeSecureLinkRequest build() {
            String str;
            String str2 = this.f44836a;
            if (str2 != null && (str = this.f44837b) != null) {
                return new JudgeSecureLinkRequest(str2, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "target", this.f44837b, "scene");
        }

        /* renamed from: a */
        public C17793a mo62044a(String str) {
            this.f44836a = str;
            return this;
        }

        /* renamed from: b */
        public C17793a mo62046b(String str) {
            this.f44837b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "JudgeSecureLinkRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", target=");
        sb.append(this.target);
        sb.append(", scene=");
        sb.append(this.scene);
        StringBuilder replace = sb.replace(0, 2, "JudgeSecureLinkRequest{");
        replace.append('}');
        return replace.toString();
    }

    public JudgeSecureLinkRequest(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public JudgeSecureLinkRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.target = str;
        this.scene = str2;
    }
}
