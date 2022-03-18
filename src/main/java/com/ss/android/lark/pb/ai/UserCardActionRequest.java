package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class UserCardActionRequest extends Message<UserCardActionRequest, C49533a> {
    public static final ProtoAdapter<UserCardActionRequest> ADAPTER = new C49534b();
    private static final long serialVersionUID = 0;
    public final String mcard_id;
    public final ActionType mtype;

    public enum ActionType implements WireEnum {
        LIKE(0),
        DISLIKE(1),
        UNDO_LIKE(2),
        UNDO_DISLIKE(3);
        
        public static final ProtoAdapter<ActionType> ADAPTER = ProtoAdapter.newEnumAdapter(ActionType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ActionType fromValue(int i) {
            if (i == 0) {
                return LIKE;
            }
            if (i == 1) {
                return DISLIKE;
            }
            if (i == 2) {
                return UNDO_LIKE;
            }
            if (i != 3) {
                return null;
            }
            return UNDO_DISLIKE;
        }

        private ActionType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.UserCardActionRequest$b */
    private static final class C49534b extends ProtoAdapter<UserCardActionRequest> {
        C49534b() {
            super(FieldEncoding.LENGTH_DELIMITED, UserCardActionRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UserCardActionRequest userCardActionRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, userCardActionRequest.mcard_id) + ActionType.ADAPTER.encodedSizeWithTag(2, userCardActionRequest.mtype) + userCardActionRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UserCardActionRequest decode(ProtoReader protoReader) throws IOException {
            C49533a aVar = new C49533a();
            aVar.f124129a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124129a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f124130b = ActionType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UserCardActionRequest userCardActionRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, userCardActionRequest.mcard_id);
            ActionType.ADAPTER.encodeWithTag(protoWriter, 2, userCardActionRequest.mtype);
            protoWriter.writeBytes(userCardActionRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49533a newBuilder() {
        C49533a aVar = new C49533a();
        aVar.f124129a = this.mcard_id;
        aVar.f124130b = this.mtype;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.ai.UserCardActionRequest$a */
    public static final class C49533a extends Message.Builder<UserCardActionRequest, C49533a> {

        /* renamed from: a */
        public String f124129a;

        /* renamed from: b */
        public ActionType f124130b;

        /* renamed from: a */
        public UserCardActionRequest build() {
            ActionType actionType;
            String str = this.f124129a;
            if (str != null && (actionType = this.f124130b) != null) {
                return new UserCardActionRequest(str, actionType, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mcard_id", this.f124130b, "mtype");
        }

        /* renamed from: a */
        public C49533a mo172749a(ActionType actionType) {
            this.f124130b = actionType;
            return this;
        }

        /* renamed from: a */
        public C49533a mo172750a(String str) {
            this.f124129a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", card_id=");
        sb.append(this.mcard_id);
        sb.append(", type=");
        sb.append(this.mtype);
        StringBuilder replace = sb.replace(0, 2, "UserCardActionRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UserCardActionRequest(String str, ActionType actionType) {
        this(str, actionType, ByteString.EMPTY);
    }

    public UserCardActionRequest(String str, ActionType actionType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mcard_id = str;
        this.mtype = actionType;
    }
}
