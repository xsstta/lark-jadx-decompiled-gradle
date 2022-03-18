package com.ss.android.lark.pb.moments;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ListHashtagsByUserInputResponse extends Message<ListHashtagsByUserInputResponse, C49924a> {
    public static final ProtoAdapter<ListHashtagsByUserInputResponse> ADAPTER = new C49925b();
    public static final Boolean DEFAULT_IS_NEW_HASHTAG = false;
    private static final long serialVersionUID = 0;
    public final List<HashtagInfo> mhashtag_infos;
    public final Boolean mis_new_hashtag;

    public static final class HashtagInfo extends Message<HashtagInfo, C49922a> {
        public static final ProtoAdapter<HashtagInfo> ADAPTER = new C49923b();
        public static final Integer DEFAULT_PARTICIPATE_COUNT = 0;
        private static final long serialVersionUID = 0;
        public final String mcontent;
        public final String mid;
        public final Integer mparticipate_count;

        /* renamed from: com.ss.android.lark.pb.moments.ListHashtagsByUserInputResponse$HashtagInfo$b */
        private static final class C49923b extends ProtoAdapter<HashtagInfo> {
            C49923b() {
                super(FieldEncoding.LENGTH_DELIMITED, HashtagInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(HashtagInfo hashtagInfo) {
                int i;
                int i2;
                int i3 = 0;
                if (hashtagInfo.mid != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, hashtagInfo.mid);
                } else {
                    i = 0;
                }
                if (hashtagInfo.mcontent != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, hashtagInfo.mcontent);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (hashtagInfo.mparticipate_count != null) {
                    i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, hashtagInfo.mparticipate_count);
                }
                return i4 + i3 + hashtagInfo.unknownFields().size();
            }

            /* renamed from: a */
            public HashtagInfo decode(ProtoReader protoReader) throws IOException {
                C49922a aVar = new C49922a();
                aVar.f124935a = "";
                aVar.f124936b = "";
                aVar.f124937c = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f124935a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f124936b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f124937c = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, HashtagInfo hashtagInfo) throws IOException {
                if (hashtagInfo.mid != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, hashtagInfo.mid);
                }
                if (hashtagInfo.mcontent != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, hashtagInfo.mcontent);
                }
                if (hashtagInfo.mparticipate_count != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, hashtagInfo.mparticipate_count);
                }
                protoWriter.writeBytes(hashtagInfo.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.moments.ListHashtagsByUserInputResponse$HashtagInfo$a */
        public static final class C49922a extends Message.Builder<HashtagInfo, C49922a> {

            /* renamed from: a */
            public String f124935a;

            /* renamed from: b */
            public String f124936b;

            /* renamed from: c */
            public Integer f124937c;

            /* renamed from: a */
            public HashtagInfo build() {
                return new HashtagInfo(this.f124935a, this.f124936b, this.f124937c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49922a newBuilder() {
            C49922a aVar = new C49922a();
            aVar.f124935a = this.mid;
            aVar.f124936b = this.mcontent;
            aVar.f124937c = this.mparticipate_count;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mid != null) {
                sb.append(", id=");
                sb.append(this.mid);
            }
            if (this.mcontent != null) {
                sb.append(", content=");
                sb.append(this.mcontent);
            }
            if (this.mparticipate_count != null) {
                sb.append(", participate_count=");
                sb.append(this.mparticipate_count);
            }
            StringBuilder replace = sb.replace(0, 2, "HashtagInfo{");
            replace.append('}');
            return replace.toString();
        }

        public HashtagInfo(String str, String str2, Integer num) {
            this(str, str2, num, ByteString.EMPTY);
        }

        public HashtagInfo(String str, String str2, Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mid = str;
            this.mcontent = str2;
            this.mparticipate_count = num;
        }
    }

    /* renamed from: com.ss.android.lark.pb.moments.ListHashtagsByUserInputResponse$b */
    private static final class C49925b extends ProtoAdapter<ListHashtagsByUserInputResponse> {
        C49925b() {
            super(FieldEncoding.LENGTH_DELIMITED, ListHashtagsByUserInputResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ListHashtagsByUserInputResponse listHashtagsByUserInputResponse) {
            int i;
            int encodedSizeWithTag = HashtagInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, listHashtagsByUserInputResponse.mhashtag_infos);
            if (listHashtagsByUserInputResponse.mis_new_hashtag != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, listHashtagsByUserInputResponse.mis_new_hashtag);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + listHashtagsByUserInputResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ListHashtagsByUserInputResponse decode(ProtoReader protoReader) throws IOException {
            C49924a aVar = new C49924a();
            aVar.f124939b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124938a.add(HashtagInfo.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124939b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ListHashtagsByUserInputResponse listHashtagsByUserInputResponse) throws IOException {
            HashtagInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, listHashtagsByUserInputResponse.mhashtag_infos);
            if (listHashtagsByUserInputResponse.mis_new_hashtag != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, listHashtagsByUserInputResponse.mis_new_hashtag);
            }
            protoWriter.writeBytes(listHashtagsByUserInputResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.moments.ListHashtagsByUserInputResponse$a */
    public static final class C49924a extends Message.Builder<ListHashtagsByUserInputResponse, C49924a> {

        /* renamed from: a */
        public List<HashtagInfo> f124938a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f124939b;

        /* renamed from: a */
        public ListHashtagsByUserInputResponse build() {
            return new ListHashtagsByUserInputResponse(this.f124938a, this.f124939b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49924a newBuilder() {
        C49924a aVar = new C49924a();
        aVar.f124938a = Internal.copyOf("mhashtag_infos", this.mhashtag_infos);
        aVar.f124939b = this.mis_new_hashtag;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mhashtag_infos.isEmpty()) {
            sb.append(", hashtag_infos=");
            sb.append(this.mhashtag_infos);
        }
        if (this.mis_new_hashtag != null) {
            sb.append(", is_new_hashtag=");
            sb.append(this.mis_new_hashtag);
        }
        StringBuilder replace = sb.replace(0, 2, "ListHashtagsByUserInputResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ListHashtagsByUserInputResponse(List<HashtagInfo> list, Boolean bool) {
        this(list, bool, ByteString.EMPTY);
    }

    public ListHashtagsByUserInputResponse(List<HashtagInfo> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mhashtag_infos = Internal.immutableCopyOf("mhashtag_infos", list);
        this.mis_new_hashtag = bool;
    }
}
