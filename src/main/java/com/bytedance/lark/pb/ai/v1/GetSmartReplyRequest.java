package com.bytedance.lark.pb.ai.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetSmartReplyRequest extends Message<GetSmartReplyRequest, C14625a> {
    public static final ProtoAdapter<GetSmartReplyRequest> ADAPTER = new C14626b();
    public static final Scene DEFAULT_SCENE = Scene.MESSENGER;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final String message_id;
    public final Scene scene;
    public final String user_id;

    public enum Scene implements WireEnum {
        MESSENGER(0),
        MESSENGER_REPLY(1),
        MESSENGER_THREAD(2);
        
        public static final ProtoAdapter<Scene> ADAPTER = ProtoAdapter.newEnumAdapter(Scene.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Scene fromValue(int i) {
            if (i == 0) {
                return MESSENGER;
            }
            if (i == 1) {
                return MESSENGER_REPLY;
            }
            if (i != 2) {
                return null;
            }
            return MESSENGER_THREAD;
        }

        private Scene(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.ai.v1.GetSmartReplyRequest$b */
    private static final class C14626b extends ProtoAdapter<GetSmartReplyRequest> {
        C14626b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetSmartReplyRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetSmartReplyRequest getSmartReplyRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getSmartReplyRequest.user_id);
            int i3 = 0;
            if (getSmartReplyRequest.chat_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, getSmartReplyRequest.chat_id);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (getSmartReplyRequest.message_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, getSmartReplyRequest.message_id);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (getSmartReplyRequest.scene != null) {
                i3 = Scene.ADAPTER.encodedSizeWithTag(4, getSmartReplyRequest.scene);
            }
            return i5 + i3 + getSmartReplyRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetSmartReplyRequest decode(ProtoReader protoReader) throws IOException {
            C14625a aVar = new C14625a();
            aVar.f38711a = "";
            aVar.f38712b = "";
            aVar.f38713c = "";
            aVar.f38714d = Scene.MESSENGER;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f38711a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f38712b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f38713c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f38714d = Scene.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetSmartReplyRequest getSmartReplyRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getSmartReplyRequest.user_id);
            if (getSmartReplyRequest.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getSmartReplyRequest.chat_id);
            }
            if (getSmartReplyRequest.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getSmartReplyRequest.message_id);
            }
            if (getSmartReplyRequest.scene != null) {
                Scene.ADAPTER.encodeWithTag(protoWriter, 4, getSmartReplyRequest.scene);
            }
            protoWriter.writeBytes(getSmartReplyRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14625a newBuilder() {
        C14625a aVar = new C14625a();
        aVar.f38711a = this.user_id;
        aVar.f38712b = this.chat_id;
        aVar.f38713c = this.message_id;
        aVar.f38714d = this.scene;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.ai.v1.GetSmartReplyRequest$a */
    public static final class C14625a extends Message.Builder<GetSmartReplyRequest, C14625a> {

        /* renamed from: a */
        public String f38711a;

        /* renamed from: b */
        public String f38712b;

        /* renamed from: c */
        public String f38713c;

        /* renamed from: d */
        public Scene f38714d;

        /* renamed from: a */
        public GetSmartReplyRequest build() {
            String str = this.f38711a;
            if (str != null) {
                return new GetSmartReplyRequest(str, this.f38712b, this.f38713c, this.f38714d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "user_id");
        }

        /* renamed from: a */
        public C14625a mo53957a(Scene scene) {
            this.f38714d = scene;
            return this;
        }

        /* renamed from: b */
        public C14625a mo53960b(String str) {
            this.f38712b = str;
            return this;
        }

        /* renamed from: c */
        public C14625a mo53961c(String str) {
            this.f38713c = str;
            return this;
        }

        /* renamed from: a */
        public C14625a mo53958a(String str) {
            this.f38711a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ai", "GetSmartReplyRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", user_id=");
        sb.append(this.user_id);
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        StringBuilder replace = sb.replace(0, 2, "GetSmartReplyRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetSmartReplyRequest(String str, String str2, String str3, Scene scene2) {
        this(str, str2, str3, scene2, ByteString.EMPTY);
    }

    public GetSmartReplyRequest(String str, String str2, String str3, Scene scene2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = str;
        this.chat_id = str2;
        this.message_id = str3;
        this.scene = scene2;
    }
}
