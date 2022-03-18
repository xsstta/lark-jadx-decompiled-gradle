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

public final class PullAllFollowStatesResponse extends Message<PullAllFollowStatesResponse, C50918a> {
    public static final ProtoAdapter<PullAllFollowStatesResponse> ADAPTER = new C50919b();
    public static final Integer DEFAULT_DOWN_VERSION = 0;
    private static final long serialVersionUID = 0;
    public final Integer down_version;
    public final String next_key;
    public final List<FollowState> states;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PullAllFollowStatesResponse$b */
    private static final class C50919b extends ProtoAdapter<PullAllFollowStatesResponse> {
        C50919b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullAllFollowStatesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullAllFollowStatesResponse pullAllFollowStatesResponse) {
            int i;
            int encodedSizeWithTag = FollowState.ADAPTER.asRepeated().encodedSizeWithTag(1, pullAllFollowStatesResponse.states) + ProtoAdapter.INT32.encodedSizeWithTag(2, pullAllFollowStatesResponse.down_version);
            if (pullAllFollowStatesResponse.next_key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, pullAllFollowStatesResponse.next_key);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + pullAllFollowStatesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullAllFollowStatesResponse decode(ProtoReader protoReader) throws IOException {
            C50918a aVar = new C50918a();
            aVar.f126914b = 0;
            aVar.f126915c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126913a.add(FollowState.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f126914b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126915c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullAllFollowStatesResponse pullAllFollowStatesResponse) throws IOException {
            FollowState.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pullAllFollowStatesResponse.states);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, pullAllFollowStatesResponse.down_version);
            if (pullAllFollowStatesResponse.next_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, pullAllFollowStatesResponse.next_key);
            }
            protoWriter.writeBytes(pullAllFollowStatesResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50918a newBuilder() {
        C50918a aVar = new C50918a();
        aVar.f126913a = Internal.copyOf("states", this.states);
        aVar.f126914b = this.down_version;
        aVar.f126915c = this.next_key;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PullAllFollowStatesResponse$a */
    public static final class C50918a extends Message.Builder<PullAllFollowStatesResponse, C50918a> {

        /* renamed from: a */
        public List<FollowState> f126913a = Internal.newMutableList();

        /* renamed from: b */
        public Integer f126914b;

        /* renamed from: c */
        public String f126915c;

        /* renamed from: a */
        public PullAllFollowStatesResponse build() {
            Integer num = this.f126914b;
            if (num != null) {
                return new PullAllFollowStatesResponse(this.f126913a, num, this.f126915c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num, "down_version");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "PullAllFollowStatesResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.states.isEmpty()) {
            sb.append(", states=");
            sb.append(this.states);
        }
        sb.append(", down_version=");
        sb.append(this.down_version);
        if (this.next_key != null) {
            sb.append(", next_key=");
            sb.append(this.next_key);
        }
        StringBuilder replace = sb.replace(0, 2, "PullAllFollowStatesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullAllFollowStatesResponse(List<FollowState> list, Integer num, String str) {
        this(list, num, str, ByteString.EMPTY);
    }

    public PullAllFollowStatesResponse(List<FollowState> list, Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.states = Internal.immutableCopyOf("states", list);
        this.down_version = num;
        this.next_key = str;
    }
}
