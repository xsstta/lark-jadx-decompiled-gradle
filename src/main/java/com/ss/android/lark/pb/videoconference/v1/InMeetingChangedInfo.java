package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class InMeetingChangedInfo extends Message<InMeetingChangedInfo, C50757a> {
    public static final ProtoAdapter<InMeetingChangedInfo> ADAPTER = new C50758b();
    private static final long serialVersionUID = 0;
    public final List<InMeetingData> changes;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingChangedInfo$b */
    private static final class C50758b extends ProtoAdapter<InMeetingChangedInfo> {
        C50758b() {
            super(FieldEncoding.LENGTH_DELIMITED, InMeetingChangedInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(InMeetingChangedInfo inMeetingChangedInfo) {
            return InMeetingData.ADAPTER.asRepeated().encodedSizeWithTag(1, inMeetingChangedInfo.changes) + inMeetingChangedInfo.unknownFields().size();
        }

        /* renamed from: a */
        public InMeetingChangedInfo decode(ProtoReader protoReader) throws IOException {
            C50757a aVar = new C50757a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126542a.add(InMeetingData.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, InMeetingChangedInfo inMeetingChangedInfo) throws IOException {
            InMeetingData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, inMeetingChangedInfo.changes);
            protoWriter.writeBytes(inMeetingChangedInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingChangedInfo$a */
    public static final class C50757a extends Message.Builder<InMeetingChangedInfo, C50757a> {

        /* renamed from: a */
        public List<InMeetingData> f126542a = Internal.newMutableList();

        /* renamed from: a */
        public InMeetingChangedInfo build() {
            return new InMeetingChangedInfo(this.f126542a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50757a newBuilder() {
        C50757a aVar = new C50757a();
        aVar.f126542a = Internal.copyOf("changes", this.changes);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "InMeetingChangedInfo");
        StringBuilder sb = new StringBuilder();
        if (!this.changes.isEmpty()) {
            sb.append(", changes=");
            sb.append(this.changes);
        }
        StringBuilder replace = sb.replace(0, 2, "InMeetingChangedInfo{");
        replace.append('}');
        return replace.toString();
    }

    public InMeetingChangedInfo(List<InMeetingData> list) {
        this(list, ByteString.EMPTY);
    }

    public InMeetingChangedInfo(List<InMeetingData> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.changes = Internal.immutableCopyOf("changes", list);
    }
}
