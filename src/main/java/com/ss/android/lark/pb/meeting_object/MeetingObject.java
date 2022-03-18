package com.ss.android.lark.pb.meeting_object;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class MeetingObject extends Message<MeetingObject, C49860a> {
    public static final ProtoAdapter<MeetingObject> ADAPTER = new C49861b();
    private static final long serialVersionUID = 0;
    public final BaseInfo mbase_info;
    public final C49851Entity mentities;
    public final Reaction mreaction;
    public final Summary msummary;

    /* renamed from: com.ss.android.lark.pb.meeting_object.MeetingObject$b */
    private static final class C49861b extends ProtoAdapter<MeetingObject> {
        C49861b() {
            super(FieldEncoding.LENGTH_DELIMITED, MeetingObject.class);
        }

        /* renamed from: a */
        public int encodedSize(MeetingObject meetingObject) {
            int i;
            int i2;
            int encodedSizeWithTag = BaseInfo.ADAPTER.encodedSizeWithTag(1, meetingObject.mbase_info);
            int i3 = 0;
            if (meetingObject.mreaction != null) {
                i = Reaction.ADAPTER.encodedSizeWithTag(2, meetingObject.mreaction);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (meetingObject.mentities != null) {
                i2 = C49851Entity.ADAPTER.encodedSizeWithTag(3, meetingObject.mentities);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (meetingObject.msummary != null) {
                i3 = Summary.ADAPTER.encodedSizeWithTag(4, meetingObject.msummary);
            }
            return i5 + i3 + meetingObject.unknownFields().size();
        }

        /* renamed from: a */
        public MeetingObject decode(ProtoReader protoReader) throws IOException {
            C49860a aVar = new C49860a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124831a = BaseInfo.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124832b = Reaction.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f124833c = C49851Entity.ADAPTER.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124834d = Summary.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MeetingObject meetingObject) throws IOException {
            BaseInfo.ADAPTER.encodeWithTag(protoWriter, 1, meetingObject.mbase_info);
            if (meetingObject.mreaction != null) {
                Reaction.ADAPTER.encodeWithTag(protoWriter, 2, meetingObject.mreaction);
            }
            if (meetingObject.mentities != null) {
                C49851Entity.ADAPTER.encodeWithTag(protoWriter, 3, meetingObject.mentities);
            }
            if (meetingObject.msummary != null) {
                Summary.ADAPTER.encodeWithTag(protoWriter, 4, meetingObject.msummary);
            }
            protoWriter.writeBytes(meetingObject.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49860a newBuilder() {
        C49860a aVar = new C49860a();
        aVar.f124831a = this.mbase_info;
        aVar.f124832b = this.mreaction;
        aVar.f124833c = this.mentities;
        aVar.f124834d = this.msummary;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.meeting_object.MeetingObject$a */
    public static final class C49860a extends Message.Builder<MeetingObject, C49860a> {

        /* renamed from: a */
        public BaseInfo f124831a;

        /* renamed from: b */
        public Reaction f124832b;

        /* renamed from: c */
        public C49851Entity f124833c;

        /* renamed from: d */
        public Summary f124834d;

        /* renamed from: a */
        public MeetingObject build() {
            BaseInfo baseInfo = this.f124831a;
            if (baseInfo != null) {
                return new MeetingObject(baseInfo, this.f124832b, this.f124833c, this.f124834d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(baseInfo, "mbase_info");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", base_info=");
        sb.append(this.mbase_info);
        if (this.mreaction != null) {
            sb.append(", reaction=");
            sb.append(this.mreaction);
        }
        if (this.mentities != null) {
            sb.append(", entities=");
            sb.append(this.mentities);
        }
        if (this.msummary != null) {
            sb.append(", summary=");
            sb.append(this.msummary);
        }
        StringBuilder replace = sb.replace(0, 2, "MeetingObject{");
        replace.append('}');
        return replace.toString();
    }

    public MeetingObject(BaseInfo baseInfo, Reaction reaction, C49851Entity entity, Summary summary) {
        this(baseInfo, reaction, entity, summary, ByteString.EMPTY);
    }

    public MeetingObject(BaseInfo baseInfo, Reaction reaction, C49851Entity entity, Summary summary, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mbase_info = baseInfo;
        this.mreaction = reaction;
        this.mentities = entity;
        this.msummary = summary;
    }
}
