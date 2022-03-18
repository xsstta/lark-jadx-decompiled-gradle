package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.pb.videoconference.v1.VideoChatPrompt;
import java.io.IOException;
import okio.ByteString;

public final class ReplyVideoChatPromptRequest extends Message<ReplyVideoChatPromptRequest, C50978a> {
    public static final ProtoAdapter<ReplyVideoChatPromptRequest> ADAPTER = new C50979b();
    public static final Action DEFAULT_ACTION = Action.CANCEL;
    public static final VideoChatPrompt.Type DEFAULT_TYPE = VideoChatPrompt.Type.UNKNOWN_TYPE;
    private static final long serialVersionUID = 0;
    public final Action action;
    public final String prompt_id;
    public final VideoChatPrompt.Type type;

    public enum Action implements WireEnum {
        CANCEL(0),
        CONFIRM(1);
        
        public static final ProtoAdapter<Action> ADAPTER = ProtoAdapter.newEnumAdapter(Action.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Action fromValue(int i) {
            if (i == 0) {
                return CANCEL;
            }
            if (i != 1) {
                return null;
            }
            return CONFIRM;
        }

        private Action(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ReplyVideoChatPromptRequest$b */
    private static final class C50979b extends ProtoAdapter<ReplyVideoChatPromptRequest> {
        C50979b() {
            super(FieldEncoding.LENGTH_DELIMITED, ReplyVideoChatPromptRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ReplyVideoChatPromptRequest replyVideoChatPromptRequest) {
            return Action.ADAPTER.encodedSizeWithTag(1, replyVideoChatPromptRequest.action) + VideoChatPrompt.Type.ADAPTER.encodedSizeWithTag(2, replyVideoChatPromptRequest.type) + ProtoAdapter.STRING.encodedSizeWithTag(3, replyVideoChatPromptRequest.prompt_id) + replyVideoChatPromptRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ReplyVideoChatPromptRequest decode(ProtoReader protoReader) throws IOException {
            C50978a aVar = new C50978a();
            aVar.f127008a = Action.CANCEL;
            aVar.f127009b = VideoChatPrompt.Type.UNKNOWN_TYPE;
            aVar.f127010c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f127008a = Action.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    try {
                        aVar.f127009b = VideoChatPrompt.Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127010c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ReplyVideoChatPromptRequest replyVideoChatPromptRequest) throws IOException {
            Action.ADAPTER.encodeWithTag(protoWriter, 1, replyVideoChatPromptRequest.action);
            VideoChatPrompt.Type.ADAPTER.encodeWithTag(protoWriter, 2, replyVideoChatPromptRequest.type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, replyVideoChatPromptRequest.prompt_id);
            protoWriter.writeBytes(replyVideoChatPromptRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50978a newBuilder() {
        C50978a aVar = new C50978a();
        aVar.f127008a = this.action;
        aVar.f127009b = this.type;
        aVar.f127010c = this.prompt_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ReplyVideoChatPromptRequest$a */
    public static final class C50978a extends Message.Builder<ReplyVideoChatPromptRequest, C50978a> {

        /* renamed from: a */
        public Action f127008a;

        /* renamed from: b */
        public VideoChatPrompt.Type f127009b;

        /* renamed from: c */
        public String f127010c;

        /* renamed from: a */
        public ReplyVideoChatPromptRequest build() {
            VideoChatPrompt.Type type;
            String str;
            Action action = this.f127008a;
            if (action != null && (type = this.f127009b) != null && (str = this.f127010c) != null) {
                return new ReplyVideoChatPromptRequest(action, type, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(action, "action", this.f127009b, ShareHitPoint.f121869d, this.f127010c, "prompt_id");
        }

        /* renamed from: a */
        public C50978a mo176051a(Action action) {
            this.f127008a = action;
            return this;
        }

        /* renamed from: a */
        public C50978a mo176052a(VideoChatPrompt.Type type) {
            this.f127009b = type;
            return this;
        }

        /* renamed from: a */
        public C50978a mo176053a(String str) {
            this.f127010c = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ReplyVideoChatPromptRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", prompt_id=");
        sb.append(this.prompt_id);
        StringBuilder replace = sb.replace(0, 2, "ReplyVideoChatPromptRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ReplyVideoChatPromptRequest(Action action2, VideoChatPrompt.Type type2, String str) {
        this(action2, type2, str, ByteString.EMPTY);
    }

    public ReplyVideoChatPromptRequest(Action action2, VideoChatPrompt.Type type2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.action = action2;
        this.type = type2;
        this.prompt_id = str;
    }
}
