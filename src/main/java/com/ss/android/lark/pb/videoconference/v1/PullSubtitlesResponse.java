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

public final class PullSubtitlesResponse extends Message<PullSubtitlesResponse, C50930a> {
    public static final ProtoAdapter<PullSubtitlesResponse> ADAPTER = new C50931b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Long DEFAULT_NEXT_TARGET_SEG_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Boolean has_more;
    public final Long next_target_seg_id;
    public final List<MeetingSubtitleData> subtitles;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PullSubtitlesResponse$b */
    private static final class C50931b extends ProtoAdapter<PullSubtitlesResponse> {
        C50931b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullSubtitlesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullSubtitlesResponse pullSubtitlesResponse) {
            int i;
            int encodedSizeWithTag = MeetingSubtitleData.ADAPTER.asRepeated().encodedSizeWithTag(1, pullSubtitlesResponse.subtitles);
            int i2 = 0;
            if (pullSubtitlesResponse.next_target_seg_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(2, pullSubtitlesResponse.next_target_seg_id);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (pullSubtitlesResponse.has_more != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, pullSubtitlesResponse.has_more);
            }
            return i3 + i2 + pullSubtitlesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullSubtitlesResponse decode(ProtoReader protoReader) throws IOException {
            C50930a aVar = new C50930a();
            aVar.f126928b = 0L;
            aVar.f126929c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126927a.add(MeetingSubtitleData.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f126928b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126929c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullSubtitlesResponse pullSubtitlesResponse) throws IOException {
            MeetingSubtitleData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pullSubtitlesResponse.subtitles);
            if (pullSubtitlesResponse.next_target_seg_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, pullSubtitlesResponse.next_target_seg_id);
            }
            if (pullSubtitlesResponse.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, pullSubtitlesResponse.has_more);
            }
            protoWriter.writeBytes(pullSubtitlesResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PullSubtitlesResponse$a */
    public static final class C50930a extends Message.Builder<PullSubtitlesResponse, C50930a> {

        /* renamed from: a */
        public List<MeetingSubtitleData> f126927a = Internal.newMutableList();

        /* renamed from: b */
        public Long f126928b;

        /* renamed from: c */
        public Boolean f126929c;

        /* renamed from: a */
        public PullSubtitlesResponse build() {
            return new PullSubtitlesResponse(this.f126927a, this.f126928b, this.f126929c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50930a newBuilder() {
        C50930a aVar = new C50930a();
        aVar.f126927a = Internal.copyOf("subtitles", this.subtitles);
        aVar.f126928b = this.next_target_seg_id;
        aVar.f126929c = this.has_more;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "PullSubtitlesResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.subtitles.isEmpty()) {
            sb.append(", subtitles=");
            sb.append(this.subtitles);
        }
        if (this.next_target_seg_id != null) {
            sb.append(", next_target_seg_id=");
            sb.append(this.next_target_seg_id);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        StringBuilder replace = sb.replace(0, 2, "PullSubtitlesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullSubtitlesResponse(List<MeetingSubtitleData> list, Long l, Boolean bool) {
        this(list, l, bool, ByteString.EMPTY);
    }

    public PullSubtitlesResponse(List<MeetingSubtitleData> list, Long l, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.subtitles = Internal.immutableCopyOf("subtitles", list);
        this.next_target_seg_id = l;
        this.has_more = bool;
    }
}
