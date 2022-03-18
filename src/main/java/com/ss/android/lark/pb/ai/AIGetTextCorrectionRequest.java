package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class AIGetTextCorrectionRequest extends Message<AIGetTextCorrectionRequest, C49415a> {
    public static final ProtoAdapter<AIGetTextCorrectionRequest> ADAPTER = new C49416b();
    public static final Boolean DEFAULT_IS_FINAL = false;
    public static final Boolean DEFAULT_IS_RECALL = false;
    private static final long serialVersionUID = 0;
    public final String mchat_id;
    public final Boolean mis_final;
    public final Boolean mis_recall;
    public final String mlast_message_position;
    public final String mplatform;
    public final String mscene;
    public final String msession_id;
    public final List<String> mtexts;
    public final String muser_language;

    /* renamed from: com.ss.android.lark.pb.ai.AIGetTextCorrectionRequest$b */
    private static final class C49416b extends ProtoAdapter<AIGetTextCorrectionRequest> {
        C49416b() {
            super(FieldEncoding.LENGTH_DELIMITED, AIGetTextCorrectionRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(AIGetTextCorrectionRequest aIGetTextCorrectionRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, aIGetTextCorrectionRequest.mtexts) + ProtoAdapter.STRING.encodedSizeWithTag(2, aIGetTextCorrectionRequest.msession_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, aIGetTextCorrectionRequest.mscene) + ProtoAdapter.STRING.encodedSizeWithTag(4, aIGetTextCorrectionRequest.mplatform);
            int i5 = 0;
            if (aIGetTextCorrectionRequest.mis_final != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(5, aIGetTextCorrectionRequest.mis_final);
            } else {
                i = 0;
            }
            int i6 = encodedSizeWithTag + i;
            if (aIGetTextCorrectionRequest.mis_recall != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(6, aIGetTextCorrectionRequest.mis_recall);
            } else {
                i2 = 0;
            }
            int i7 = i6 + i2;
            if (aIGetTextCorrectionRequest.muser_language != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(7, aIGetTextCorrectionRequest.muser_language);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (aIGetTextCorrectionRequest.mchat_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(8, aIGetTextCorrectionRequest.mchat_id);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (aIGetTextCorrectionRequest.mlast_message_position != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(9, aIGetTextCorrectionRequest.mlast_message_position);
            }
            return i9 + i5 + aIGetTextCorrectionRequest.unknownFields().size();
        }

        /* renamed from: a */
        public AIGetTextCorrectionRequest decode(ProtoReader protoReader) throws IOException {
            C49415a aVar = new C49415a();
            aVar.f123944b = "";
            aVar.f123945c = "";
            aVar.f123946d = "";
            aVar.f123947e = false;
            aVar.f123948f = false;
            aVar.f123949g = "";
            aVar.f123950h = "";
            aVar.f123951i = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f123943a.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            aVar.f123944b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f123945c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f123946d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f123947e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f123948f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f123949g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f123950h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f123951i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AIGetTextCorrectionRequest aIGetTextCorrectionRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, aIGetTextCorrectionRequest.mtexts);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, aIGetTextCorrectionRequest.msession_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, aIGetTextCorrectionRequest.mscene);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, aIGetTextCorrectionRequest.mplatform);
            if (aIGetTextCorrectionRequest.mis_final != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, aIGetTextCorrectionRequest.mis_final);
            }
            if (aIGetTextCorrectionRequest.mis_recall != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, aIGetTextCorrectionRequest.mis_recall);
            }
            if (aIGetTextCorrectionRequest.muser_language != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, aIGetTextCorrectionRequest.muser_language);
            }
            if (aIGetTextCorrectionRequest.mchat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, aIGetTextCorrectionRequest.mchat_id);
            }
            if (aIGetTextCorrectionRequest.mlast_message_position != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, aIGetTextCorrectionRequest.mlast_message_position);
            }
            protoWriter.writeBytes(aIGetTextCorrectionRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49415a newBuilder() {
        C49415a aVar = new C49415a();
        aVar.f123943a = Internal.copyOf("mtexts", this.mtexts);
        aVar.f123944b = this.msession_id;
        aVar.f123945c = this.mscene;
        aVar.f123946d = this.mplatform;
        aVar.f123947e = this.mis_final;
        aVar.f123948f = this.mis_recall;
        aVar.f123949g = this.muser_language;
        aVar.f123950h = this.mchat_id;
        aVar.f123951i = this.mlast_message_position;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.ai.AIGetTextCorrectionRequest$a */
    public static final class C49415a extends Message.Builder<AIGetTextCorrectionRequest, C49415a> {

        /* renamed from: a */
        public List<String> f123943a = Internal.newMutableList();

        /* renamed from: b */
        public String f123944b;

        /* renamed from: c */
        public String f123945c;

        /* renamed from: d */
        public String f123946d;

        /* renamed from: e */
        public Boolean f123947e;

        /* renamed from: f */
        public Boolean f123948f;

        /* renamed from: g */
        public String f123949g;

        /* renamed from: h */
        public String f123950h;

        /* renamed from: i */
        public String f123951i;

        /* renamed from: a */
        public AIGetTextCorrectionRequest build() {
            String str;
            String str2;
            String str3 = this.f123944b;
            if (str3 != null && (str = this.f123945c) != null && (str2 = this.f123946d) != null) {
                return new AIGetTextCorrectionRequest(this.f123943a, str3, str, str2, this.f123947e, this.f123948f, this.f123949g, this.f123950h, this.f123951i, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str3, "msession_id", this.f123945c, "mscene", this.f123946d, "mplatform");
        }

        /* renamed from: a */
        public C49415a mo172466a(String str) {
            this.f123944b = str;
            return this;
        }

        /* renamed from: b */
        public C49415a mo172469b(String str) {
            this.f123945c = str;
            return this;
        }

        /* renamed from: c */
        public C49415a mo172470c(String str) {
            this.f123946d = str;
            return this;
        }

        /* renamed from: a */
        public C49415a mo172467a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f123943a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mtexts.isEmpty()) {
            sb.append(", texts=");
            sb.append(this.mtexts);
        }
        sb.append(", session_id=");
        sb.append(this.msession_id);
        sb.append(", scene=");
        sb.append(this.mscene);
        sb.append(", platform=");
        sb.append(this.mplatform);
        if (this.mis_final != null) {
            sb.append(", is_final=");
            sb.append(this.mis_final);
        }
        if (this.mis_recall != null) {
            sb.append(", is_recall=");
            sb.append(this.mis_recall);
        }
        if (this.muser_language != null) {
            sb.append(", user_language=");
            sb.append(this.muser_language);
        }
        if (this.mchat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.mchat_id);
        }
        if (this.mlast_message_position != null) {
            sb.append(", last_message_position=");
            sb.append(this.mlast_message_position);
        }
        StringBuilder replace = sb.replace(0, 2, "AIGetTextCorrectionRequest{");
        replace.append('}');
        return replace.toString();
    }

    public AIGetTextCorrectionRequest(List<String> list, String str, String str2, String str3, Boolean bool, Boolean bool2, String str4, String str5, String str6) {
        this(list, str, str2, str3, bool, bool2, str4, str5, str6, ByteString.EMPTY);
    }

    public AIGetTextCorrectionRequest(List<String> list, String str, String str2, String str3, Boolean bool, Boolean bool2, String str4, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtexts = Internal.immutableCopyOf("mtexts", list);
        this.msession_id = str;
        this.mscene = str2;
        this.mplatform = str3;
        this.mis_final = bool;
        this.mis_recall = bool2;
        this.muser_language = str4;
        this.mchat_id = str5;
        this.mlast_message_position = str6;
    }
}
