package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.videoconference.v1.VideoChatInteractionMessage;
import java.io.IOException;
import okio.ByteString;

public final class SendVideoChatInteractionMessageRequest extends Message<SendVideoChatInteractionMessageRequest, C51012a> {
    public static final ProtoAdapter<SendVideoChatInteractionMessageRequest> ADAPTER = new C51013b();
    public static final VideoChatInteractionMessage.Type DEFAULT_TYPE = VideoChatInteractionMessage.Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String cid;
    public final String meeting_id;
    public final ReactionMessageContent reaction_content;
    public final TextMessageContent text_content;
    public final VideoChatInteractionMessage.Type type;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SendVideoChatInteractionMessageRequest$b */
    private static final class C51013b extends ProtoAdapter<SendVideoChatInteractionMessageRequest> {
        C51013b() {
            super(FieldEncoding.LENGTH_DELIMITED, SendVideoChatInteractionMessageRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SendVideoChatInteractionMessageRequest sendVideoChatInteractionMessageRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (sendVideoChatInteractionMessageRequest.meeting_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, sendVideoChatInteractionMessageRequest.meeting_id);
            } else {
                i = 0;
            }
            if (sendVideoChatInteractionMessageRequest.cid != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, sendVideoChatInteractionMessageRequest.cid);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (sendVideoChatInteractionMessageRequest.type != null) {
                i3 = VideoChatInteractionMessage.Type.ADAPTER.encodedSizeWithTag(3, sendVideoChatInteractionMessageRequest.type);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (sendVideoChatInteractionMessageRequest.reaction_content != null) {
                i4 = ReactionMessageContent.ADAPTER.encodedSizeWithTag(101, sendVideoChatInteractionMessageRequest.reaction_content);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (sendVideoChatInteractionMessageRequest.text_content != null) {
                i5 = TextMessageContent.ADAPTER.encodedSizeWithTag(102, sendVideoChatInteractionMessageRequest.text_content);
            }
            return i8 + i5 + sendVideoChatInteractionMessageRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SendVideoChatInteractionMessageRequest decode(ProtoReader protoReader) throws IOException {
            C51012a aVar = new C51012a();
            aVar.f127072a = "";
            aVar.f127073b = "";
            aVar.f127074c = VideoChatInteractionMessage.Type.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127072a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f127073b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f127074c = VideoChatInteractionMessage.Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 101) {
                    aVar.mo176131a(ReactionMessageContent.ADAPTER.decode(protoReader));
                } else if (nextTag != 102) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.mo176132a(TextMessageContent.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SendVideoChatInteractionMessageRequest sendVideoChatInteractionMessageRequest) throws IOException {
            if (sendVideoChatInteractionMessageRequest.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sendVideoChatInteractionMessageRequest.meeting_id);
            }
            if (sendVideoChatInteractionMessageRequest.cid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, sendVideoChatInteractionMessageRequest.cid);
            }
            if (sendVideoChatInteractionMessageRequest.type != null) {
                VideoChatInteractionMessage.Type.ADAPTER.encodeWithTag(protoWriter, 3, sendVideoChatInteractionMessageRequest.type);
            }
            if (sendVideoChatInteractionMessageRequest.reaction_content != null) {
                ReactionMessageContent.ADAPTER.encodeWithTag(protoWriter, 101, sendVideoChatInteractionMessageRequest.reaction_content);
            }
            if (sendVideoChatInteractionMessageRequest.text_content != null) {
                TextMessageContent.ADAPTER.encodeWithTag(protoWriter, 102, sendVideoChatInteractionMessageRequest.text_content);
            }
            protoWriter.writeBytes(sendVideoChatInteractionMessageRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SendVideoChatInteractionMessageRequest$a */
    public static final class C51012a extends Message.Builder<SendVideoChatInteractionMessageRequest, C51012a> {

        /* renamed from: a */
        public String f127072a;

        /* renamed from: b */
        public String f127073b;

        /* renamed from: c */
        public VideoChatInteractionMessage.Type f127074c;

        /* renamed from: d */
        public ReactionMessageContent f127075d;

        /* renamed from: e */
        public TextMessageContent f127076e;

        /* renamed from: a */
        public SendVideoChatInteractionMessageRequest build() {
            return new SendVideoChatInteractionMessageRequest(this.f127072a, this.f127073b, this.f127074c, this.f127075d, this.f127076e, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C51012a mo176133a(VideoChatInteractionMessage.Type type) {
            this.f127074c = type;
            return this;
        }

        /* renamed from: b */
        public C51012a mo176136b(String str) {
            this.f127073b = str;
            return this;
        }

        /* renamed from: a */
        public C51012a mo176131a(ReactionMessageContent reactionMessageContent) {
            this.f127075d = reactionMessageContent;
            this.f127076e = null;
            return this;
        }

        /* renamed from: a */
        public C51012a mo176132a(TextMessageContent textMessageContent) {
            this.f127076e = textMessageContent;
            this.f127075d = null;
            return this;
        }

        /* renamed from: a */
        public C51012a mo176134a(String str) {
            this.f127072a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C51012a newBuilder() {
        C51012a aVar = new C51012a();
        aVar.f127072a = this.meeting_id;
        aVar.f127073b = this.cid;
        aVar.f127074c = this.type;
        aVar.f127075d = this.reaction_content;
        aVar.f127076e = this.text_content;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "SendVideoChatInteractionMessageRequest");
        StringBuilder sb = new StringBuilder();
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        if (this.cid != null) {
            sb.append(", cid=");
            sb.append(this.cid);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.reaction_content != null) {
            sb.append(", reaction_content=");
            sb.append(this.reaction_content);
        }
        if (this.text_content != null) {
            sb.append(", text_content=");
            sb.append(this.text_content);
        }
        StringBuilder replace = sb.replace(0, 2, "SendVideoChatInteractionMessageRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SendVideoChatInteractionMessageRequest(String str, String str2, VideoChatInteractionMessage.Type type2, ReactionMessageContent reactionMessageContent, TextMessageContent textMessageContent) {
        this(str, str2, type2, reactionMessageContent, textMessageContent, ByteString.EMPTY);
    }

    public SendVideoChatInteractionMessageRequest(String str, String str2, VideoChatInteractionMessage.Type type2, ReactionMessageContent reactionMessageContent, TextMessageContent textMessageContent, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(reactionMessageContent, textMessageContent) <= 1) {
            this.meeting_id = str;
            this.cid = str2;
            this.type = type2;
            this.reaction_content = reactionMessageContent;
            this.text_content = textMessageContent;
            return;
        }
        throw new IllegalArgumentException("at most one of reaction_content, text_content may be non-null");
    }
}
