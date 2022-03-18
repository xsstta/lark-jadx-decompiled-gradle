package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class InterviewActionData extends Message<InterviewActionData, C50803a> {
    public static final ProtoAdapter<InterviewActionData> ADAPTER = new C50804b();
    public static final Action DEFAULT_ACTION = Action.UNKNOWN;
    public static final Long DEFAULT_ACTION_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Action action;
    public final Long action_time;
    public final String meeting_id;

    public enum Action implements WireEnum {
        UNKNOWN(0),
        LEAVE(1),
        RETURN(2);
        
        public static final ProtoAdapter<Action> ADAPTER = ProtoAdapter.newEnumAdapter(Action.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Action fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return LEAVE;
            }
            if (i != 2) {
                return null;
            }
            return RETURN;
        }

        private Action(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.InterviewActionData$b */
    private static final class C50804b extends ProtoAdapter<InterviewActionData> {
        C50804b() {
            super(FieldEncoding.LENGTH_DELIMITED, InterviewActionData.class);
        }

        /* renamed from: a */
        public int encodedSize(InterviewActionData interviewActionData) {
            int i;
            int i2;
            int i3 = 0;
            if (interviewActionData.meeting_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, interviewActionData.meeting_id);
            } else {
                i = 0;
            }
            if (interviewActionData.action != null) {
                i2 = Action.ADAPTER.encodedSizeWithTag(2, interviewActionData.action);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (interviewActionData.action_time != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, interviewActionData.action_time);
            }
            return i4 + i3 + interviewActionData.unknownFields().size();
        }

        /* renamed from: a */
        public InterviewActionData decode(ProtoReader protoReader) throws IOException {
            C50803a aVar = new C50803a();
            aVar.f126658a = "";
            aVar.f126659b = Action.UNKNOWN;
            aVar.f126660c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126658a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f126659b = Action.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126660c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, InterviewActionData interviewActionData) throws IOException {
            if (interviewActionData.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, interviewActionData.meeting_id);
            }
            if (interviewActionData.action != null) {
                Action.ADAPTER.encodeWithTag(protoWriter, 2, interviewActionData.action);
            }
            if (interviewActionData.action_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, interviewActionData.action_time);
            }
            protoWriter.writeBytes(interviewActionData.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.InterviewActionData$a */
    public static final class C50803a extends Message.Builder<InterviewActionData, C50803a> {

        /* renamed from: a */
        public String f126658a;

        /* renamed from: b */
        public Action f126659b;

        /* renamed from: c */
        public Long f126660c;

        /* renamed from: a */
        public InterviewActionData build() {
            return new InterviewActionData(this.f126658a, this.f126659b, this.f126660c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50803a newBuilder() {
        C50803a aVar = new C50803a();
        aVar.f126658a = this.meeting_id;
        aVar.f126659b = this.action;
        aVar.f126660c = this.action_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "InterviewActionData");
        StringBuilder sb = new StringBuilder();
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        if (this.action != null) {
            sb.append(", action=");
            sb.append(this.action);
        }
        if (this.action_time != null) {
            sb.append(", action_time=");
            sb.append(this.action_time);
        }
        StringBuilder replace = sb.replace(0, 2, "InterviewActionData{");
        replace.append('}');
        return replace.toString();
    }

    public InterviewActionData(String str, Action action2, Long l) {
        this(str, action2, l, ByteString.EMPTY);
    }

    public InterviewActionData(String str, Action action2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
        this.action = action2;
        this.action_time = l;
    }
}
