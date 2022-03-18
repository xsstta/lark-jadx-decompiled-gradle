package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SearchSubtitlesRequest extends Message<SearchSubtitlesRequest, C50990a> {
    public static final ProtoAdapter<SearchSubtitlesRequest> ADAPTER = new C50991b();
    public static final Integer DEFAULT_MAX_MATCH_COUNT = 1000;
    public static final Long DEFAULT_START_SEG_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Integer max_match_count;
    public final String pattern;
    public final Long start_seg_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SearchSubtitlesRequest$b */
    private static final class C50991b extends ProtoAdapter<SearchSubtitlesRequest> {
        C50991b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchSubtitlesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchSubtitlesRequest searchSubtitlesRequest) {
            int i;
            int i2 = 0;
            if (searchSubtitlesRequest.start_seg_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, searchSubtitlesRequest.start_seg_id);
            } else {
                i = 0;
            }
            if (searchSubtitlesRequest.max_match_count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, searchSubtitlesRequest.max_match_count);
            }
            return i + i2 + ProtoAdapter.STRING.encodedSizeWithTag(3, searchSubtitlesRequest.pattern) + searchSubtitlesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SearchSubtitlesRequest decode(ProtoReader protoReader) throws IOException {
            C50990a aVar = new C50990a();
            aVar.f127034a = 0L;
            aVar.f127035b = 1000;
            aVar.f127036c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127034a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f127035b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127036c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SearchSubtitlesRequest searchSubtitlesRequest) throws IOException {
            if (searchSubtitlesRequest.start_seg_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, searchSubtitlesRequest.start_seg_id);
            }
            if (searchSubtitlesRequest.max_match_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, searchSubtitlesRequest.max_match_count);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, searchSubtitlesRequest.pattern);
            protoWriter.writeBytes(searchSubtitlesRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50990a newBuilder() {
        C50990a aVar = new C50990a();
        aVar.f127034a = this.start_seg_id;
        aVar.f127035b = this.max_match_count;
        aVar.f127036c = this.pattern;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SearchSubtitlesRequest$a */
    public static final class C50990a extends Message.Builder<SearchSubtitlesRequest, C50990a> {

        /* renamed from: a */
        public Long f127034a;

        /* renamed from: b */
        public Integer f127035b;

        /* renamed from: c */
        public String f127036c;

        /* renamed from: a */
        public SearchSubtitlesRequest build() {
            String str = this.f127036c;
            if (str != null) {
                return new SearchSubtitlesRequest(this.f127034a, this.f127035b, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "pattern");
        }

        /* renamed from: a */
        public C50990a mo176078a(Long l) {
            this.f127034a = l;
            return this;
        }

        /* renamed from: a */
        public C50990a mo176079a(String str) {
            this.f127036c = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "SearchSubtitlesRequest");
        StringBuilder sb = new StringBuilder();
        if (this.start_seg_id != null) {
            sb.append(", start_seg_id=");
            sb.append(this.start_seg_id);
        }
        if (this.max_match_count != null) {
            sb.append(", max_match_count=");
            sb.append(this.max_match_count);
        }
        sb.append(", pattern=");
        sb.append(this.pattern);
        StringBuilder replace = sb.replace(0, 2, "SearchSubtitlesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SearchSubtitlesRequest(Long l, Integer num, String str) {
        this(l, num, str, ByteString.EMPTY);
    }

    public SearchSubtitlesRequest(Long l, Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.start_seg_id = l;
        this.max_match_count = num;
        this.pattern = str;
    }
}
