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

public final class SearchSubtitlesResponse extends Message<SearchSubtitlesResponse, C50994a> {
    public static final ProtoAdapter<SearchSubtitlesResponse> ADAPTER = new C50995b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    private static final long serialVersionUID = 0;
    public final Boolean has_more;
    public final List<Match> matches;
    public final String pattern;

    public static final class Match extends Message<Match, C50992a> {
        public static final ProtoAdapter<Match> ADAPTER = new C50993b();
        public static final Long DEFAULT_SEG_ID = 0L;
        private static final long serialVersionUID = 0;
        public final Long seg_id;
        public final String seg_id_str;
        public final List<Integer> start_pos;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.SearchSubtitlesResponse$Match$b */
        private static final class C50993b extends ProtoAdapter<Match> {
            C50993b() {
                super(FieldEncoding.LENGTH_DELIMITED, Match.class);
            }

            /* renamed from: a */
            public int encodedSize(Match match) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, match.seg_id) + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(2, match.start_pos);
                if (match.seg_id_str != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(3, match.seg_id_str);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + match.unknownFields().size();
            }

            /* renamed from: a */
            public Match decode(ProtoReader protoReader) throws IOException {
                C50992a aVar = new C50992a();
                aVar.f127037a = 0L;
                aVar.f127039c = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f127037a = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f127038b.add(ProtoAdapter.INT32.decode(protoReader));
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f127039c = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Match match) throws IOException {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, match.seg_id);
                ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 2, match.start_pos);
                if (match.seg_id_str != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, match.seg_id_str);
                }
                protoWriter.writeBytes(match.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50992a newBuilder() {
            C50992a aVar = new C50992a();
            aVar.f127037a = this.seg_id;
            aVar.f127038b = Internal.copyOf("start_pos", this.start_pos);
            aVar.f127039c = this.seg_id_str;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.SearchSubtitlesResponse$Match$a */
        public static final class C50992a extends Message.Builder<Match, C50992a> {

            /* renamed from: a */
            public Long f127037a;

            /* renamed from: b */
            public List<Integer> f127038b = Internal.newMutableList();

            /* renamed from: c */
            public String f127039c;

            /* renamed from: a */
            public Match build() {
                Long l = this.f127037a;
                if (l != null) {
                    return new Match(l, this.f127038b, this.f127039c, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(l, "seg_id");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "Match");
            StringBuilder sb = new StringBuilder();
            sb.append(", seg_id=");
            sb.append(this.seg_id);
            if (!this.start_pos.isEmpty()) {
                sb.append(", start_pos=");
                sb.append(this.start_pos);
            }
            if (this.seg_id_str != null) {
                sb.append(", seg_id_str=");
                sb.append(this.seg_id_str);
            }
            StringBuilder replace = sb.replace(0, 2, "Match{");
            replace.append('}');
            return replace.toString();
        }

        public Match(Long l, List<Integer> list, String str) {
            this(l, list, str, ByteString.EMPTY);
        }

        public Match(Long l, List<Integer> list, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.seg_id = l;
            this.start_pos = Internal.immutableCopyOf("start_pos", list);
            this.seg_id_str = str;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SearchSubtitlesResponse$b */
    private static final class C50995b extends ProtoAdapter<SearchSubtitlesResponse> {
        C50995b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchSubtitlesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchSubtitlesResponse searchSubtitlesResponse) {
            int i;
            int encodedSizeWithTag = Match.ADAPTER.asRepeated().encodedSizeWithTag(1, searchSubtitlesResponse.matches);
            if (searchSubtitlesResponse.pattern != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, searchSubtitlesResponse.pattern);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + ProtoAdapter.BOOL.encodedSizeWithTag(3, searchSubtitlesResponse.has_more) + searchSubtitlesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SearchSubtitlesResponse decode(ProtoReader protoReader) throws IOException {
            C50994a aVar = new C50994a();
            aVar.f127041b = "";
            aVar.f127042c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127040a.add(Match.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f127041b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127042c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SearchSubtitlesResponse searchSubtitlesResponse) throws IOException {
            Match.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, searchSubtitlesResponse.matches);
            if (searchSubtitlesResponse.pattern != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, searchSubtitlesResponse.pattern);
            }
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, searchSubtitlesResponse.has_more);
            protoWriter.writeBytes(searchSubtitlesResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50994a newBuilder() {
        C50994a aVar = new C50994a();
        aVar.f127040a = Internal.copyOf("matches", this.matches);
        aVar.f127041b = this.pattern;
        aVar.f127042c = this.has_more;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SearchSubtitlesResponse$a */
    public static final class C50994a extends Message.Builder<SearchSubtitlesResponse, C50994a> {

        /* renamed from: a */
        public List<Match> f127040a = Internal.newMutableList();

        /* renamed from: b */
        public String f127041b;

        /* renamed from: c */
        public Boolean f127042c;

        /* renamed from: a */
        public SearchSubtitlesResponse build() {
            Boolean bool = this.f127042c;
            if (bool != null) {
                return new SearchSubtitlesResponse(this.f127040a, this.f127041b, bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "has_more");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "SearchSubtitlesResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.matches.isEmpty()) {
            sb.append(", matches=");
            sb.append(this.matches);
        }
        if (this.pattern != null) {
            sb.append(", pattern=");
            sb.append(this.pattern);
        }
        sb.append(", has_more=");
        sb.append(this.has_more);
        StringBuilder replace = sb.replace(0, 2, "SearchSubtitlesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SearchSubtitlesResponse(List<Match> list, String str, Boolean bool) {
        this(list, str, bool, ByteString.EMPTY);
    }

    public SearchSubtitlesResponse(List<Match> list, String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.matches = Internal.immutableCopyOf("matches", list);
        this.pattern = str;
        this.has_more = bool;
    }
}
