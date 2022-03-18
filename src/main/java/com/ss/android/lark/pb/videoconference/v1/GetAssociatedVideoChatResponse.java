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

public final class GetAssociatedVideoChatResponse extends Message<GetAssociatedVideoChatResponse, C50603a> {
    public static final ProtoAdapter<GetAssociatedVideoChatResponse> ADAPTER = new C50604b();
    private static final long serialVersionUID = 0;
    public final String interview_topic;
    public final String topic;
    public final String unique_id;
    public final List<VideoChatInfo> video_chat_info;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetAssociatedVideoChatResponse$b */
    private static final class C50604b extends ProtoAdapter<GetAssociatedVideoChatResponse> {
        C50604b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAssociatedVideoChatResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAssociatedVideoChatResponse getAssociatedVideoChatResponse) {
            int i;
            int i2;
            int encodedSizeWithTag = VideoChatInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, getAssociatedVideoChatResponse.video_chat_info);
            int i3 = 0;
            if (getAssociatedVideoChatResponse.unique_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, getAssociatedVideoChatResponse.unique_id);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (getAssociatedVideoChatResponse.interview_topic != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, getAssociatedVideoChatResponse.interview_topic);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (getAssociatedVideoChatResponse.topic != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, getAssociatedVideoChatResponse.topic);
            }
            return i5 + i3 + getAssociatedVideoChatResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetAssociatedVideoChatResponse decode(ProtoReader protoReader) throws IOException {
            C50603a aVar = new C50603a();
            aVar.f126329b = "";
            aVar.f126330c = "";
            aVar.f126331d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126328a.add(VideoChatInfo.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f126329b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f126330c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126331d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAssociatedVideoChatResponse getAssociatedVideoChatResponse) throws IOException {
            VideoChatInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getAssociatedVideoChatResponse.video_chat_info);
            if (getAssociatedVideoChatResponse.unique_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getAssociatedVideoChatResponse.unique_id);
            }
            if (getAssociatedVideoChatResponse.interview_topic != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getAssociatedVideoChatResponse.interview_topic);
            }
            if (getAssociatedVideoChatResponse.topic != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getAssociatedVideoChatResponse.topic);
            }
            protoWriter.writeBytes(getAssociatedVideoChatResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetAssociatedVideoChatResponse$a */
    public static final class C50603a extends Message.Builder<GetAssociatedVideoChatResponse, C50603a> {

        /* renamed from: a */
        public List<VideoChatInfo> f126328a = Internal.newMutableList();

        /* renamed from: b */
        public String f126329b;

        /* renamed from: c */
        public String f126330c;

        /* renamed from: d */
        public String f126331d;

        /* renamed from: a */
        public GetAssociatedVideoChatResponse build() {
            return new GetAssociatedVideoChatResponse(this.f126328a, this.f126329b, this.f126330c, this.f126331d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50603a newBuilder() {
        C50603a aVar = new C50603a();
        aVar.f126328a = Internal.copyOf("video_chat_info", this.video_chat_info);
        aVar.f126329b = this.unique_id;
        aVar.f126330c = this.interview_topic;
        aVar.f126331d = this.topic;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetAssociatedVideoChatResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.video_chat_info.isEmpty()) {
            sb.append(", video_chat_info=");
            sb.append(this.video_chat_info);
        }
        if (this.unique_id != null) {
            sb.append(", unique_id=");
            sb.append(this.unique_id);
        }
        if (this.interview_topic != null) {
            sb.append(", interview_topic=");
            sb.append(this.interview_topic);
        }
        if (this.topic != null) {
            sb.append(", topic=");
            sb.append(this.topic);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAssociatedVideoChatResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetAssociatedVideoChatResponse(List<VideoChatInfo> list, String str, String str2, String str3) {
        this(list, str, str2, str3, ByteString.EMPTY);
    }

    public GetAssociatedVideoChatResponse(List<VideoChatInfo> list, String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.video_chat_info = Internal.immutableCopyOf("video_chat_info", list);
        this.unique_id = str;
        this.interview_topic = str2;
        this.topic = str3;
    }
}
