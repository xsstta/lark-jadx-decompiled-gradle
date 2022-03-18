package com.ss.android.lark.pb.videoconference.v1;

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

public final class ReplyVideoChatNoticeRequest extends Message<ReplyVideoChatNoticeRequest, C50974a> {
    public static final ProtoAdapter<ReplyVideoChatNoticeRequest> ADAPTER = new C50975b();
    public static final Action DEFAULT_ACTION = Action.CANCEL;
    private static final long serialVersionUID = 0;
    public final Action action;
    public final String notice_id;

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

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ReplyVideoChatNoticeRequest$b */
    private static final class C50975b extends ProtoAdapter<ReplyVideoChatNoticeRequest> {
        C50975b() {
            super(FieldEncoding.LENGTH_DELIMITED, ReplyVideoChatNoticeRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ReplyVideoChatNoticeRequest replyVideoChatNoticeRequest) {
            return Action.ADAPTER.encodedSizeWithTag(1, replyVideoChatNoticeRequest.action) + ProtoAdapter.STRING.encodedSizeWithTag(2, replyVideoChatNoticeRequest.notice_id) + replyVideoChatNoticeRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ReplyVideoChatNoticeRequest decode(ProtoReader protoReader) throws IOException {
            C50974a aVar = new C50974a();
            aVar.f127006a = Action.CANCEL;
            aVar.f127007b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f127006a = Action.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127007b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ReplyVideoChatNoticeRequest replyVideoChatNoticeRequest) throws IOException {
            Action.ADAPTER.encodeWithTag(protoWriter, 1, replyVideoChatNoticeRequest.action);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, replyVideoChatNoticeRequest.notice_id);
            protoWriter.writeBytes(replyVideoChatNoticeRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50974a newBuilder() {
        C50974a aVar = new C50974a();
        aVar.f127006a = this.action;
        aVar.f127007b = this.notice_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ReplyVideoChatNoticeRequest$a */
    public static final class C50974a extends Message.Builder<ReplyVideoChatNoticeRequest, C50974a> {

        /* renamed from: a */
        public Action f127006a;

        /* renamed from: b */
        public String f127007b;

        /* renamed from: a */
        public ReplyVideoChatNoticeRequest build() {
            String str;
            Action action = this.f127006a;
            if (action != null && (str = this.f127007b) != null) {
                return new ReplyVideoChatNoticeRequest(action, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(action, "action", this.f127007b, "notice_id");
        }

        /* renamed from: a */
        public C50974a mo176041a(Action action) {
            this.f127006a = action;
            return this;
        }

        /* renamed from: a */
        public C50974a mo176042a(String str) {
            this.f127007b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ReplyVideoChatNoticeRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", notice_id=");
        sb.append(this.notice_id);
        StringBuilder replace = sb.replace(0, 2, "ReplyVideoChatNoticeRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ReplyVideoChatNoticeRequest(Action action2, String str) {
        this(action2, str, ByteString.EMPTY);
    }

    public ReplyVideoChatNoticeRequest(Action action2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.action = action2;
        this.notice_id = str;
    }
}
