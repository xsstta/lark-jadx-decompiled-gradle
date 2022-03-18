package com.bytedance.lark.pb.basic.v1;

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

public final class MentionAction extends Message<MentionAction, C15051a> {
    public static final ProtoAdapter<MentionAction> ADAPTER = new C15052b();
    public static final ActionType DEFAULT_ACTION_TYPE = ActionType.none;
    private static final long serialVersionUID = 0;
    public final ActionType action_type;
    public final String redirect_url;

    public enum ActionType implements WireEnum {
        none(0),
        redirect(1);
        
        public static final ProtoAdapter<ActionType> ADAPTER = ProtoAdapter.newEnumAdapter(ActionType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ActionType fromValue(int i) {
            if (i == 0) {
                return none;
            }
            if (i != 1) {
                return null;
            }
            return redirect;
        }

        private ActionType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.MentionAction$b */
    private static final class C15052b extends ProtoAdapter<MentionAction> {
        C15052b() {
            super(FieldEncoding.LENGTH_DELIMITED, MentionAction.class);
        }

        /* renamed from: a */
        public int encodedSize(MentionAction mentionAction) {
            int i;
            int encodedSizeWithTag = ActionType.ADAPTER.encodedSizeWithTag(1, mentionAction.action_type);
            if (mentionAction.redirect_url != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, mentionAction.redirect_url);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + mentionAction.unknownFields().size();
        }

        /* renamed from: a */
        public MentionAction decode(ProtoReader protoReader) throws IOException {
            C15051a aVar = new C15051a();
            aVar.f39818a = ActionType.none;
            aVar.f39819b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f39818a = ActionType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f39819b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MentionAction mentionAction) throws IOException {
            ActionType.ADAPTER.encodeWithTag(protoWriter, 1, mentionAction.action_type);
            if (mentionAction.redirect_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mentionAction.redirect_url);
            }
            protoWriter.writeBytes(mentionAction.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.MentionAction$a */
    public static final class C15051a extends Message.Builder<MentionAction, C15051a> {

        /* renamed from: a */
        public ActionType f39818a;

        /* renamed from: b */
        public String f39819b;

        /* renamed from: a */
        public MentionAction build() {
            ActionType actionType = this.f39818a;
            if (actionType != null) {
                return new MentionAction(actionType, this.f39819b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(actionType, "action_type");
        }
    }

    @Override // com.squareup.wire.Message
    public C15051a newBuilder() {
        C15051a aVar = new C15051a();
        aVar.f39818a = this.action_type;
        aVar.f39819b = this.redirect_url;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "MentionAction");
        StringBuilder sb = new StringBuilder();
        sb.append(", action_type=");
        sb.append(this.action_type);
        if (this.redirect_url != null) {
            sb.append(", redirect_url=");
            sb.append(this.redirect_url);
        }
        StringBuilder replace = sb.replace(0, 2, "MentionAction{");
        replace.append('}');
        return replace.toString();
    }

    public MentionAction(ActionType actionType, String str) {
        this(actionType, str, ByteString.EMPTY);
    }

    public MentionAction(ActionType actionType, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.action_type = actionType;
        this.redirect_url = str;
    }
}
