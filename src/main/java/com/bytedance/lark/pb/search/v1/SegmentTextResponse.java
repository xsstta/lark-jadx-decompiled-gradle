package com.bytedance.lark.pb.search.v1;

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

public final class SegmentTextResponse extends Message<SegmentTextResponse, C18927a> {
    public static final ProtoAdapter<SegmentTextResponse> ADAPTER = new C18928b();
    private static final long serialVersionUID = 0;
    public final List<Sentence> sentences;

    public static final class Sentence extends Message<Sentence, C18923a> {
        public static final ProtoAdapter<Sentence> ADAPTER = new C18924b();
        private static final long serialVersionUID = 0;
        public final String text;
        public final List<Word> words;

        /* renamed from: com.bytedance.lark.pb.search.v1.SegmentTextResponse$Sentence$b */
        private static final class C18924b extends ProtoAdapter<Sentence> {
            C18924b() {
                super(FieldEncoding.LENGTH_DELIMITED, Sentence.class);
            }

            /* renamed from: a */
            public int encodedSize(Sentence sentence) {
                int i;
                if (sentence.text != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, sentence.text);
                } else {
                    i = 0;
                }
                return i + Word.ADAPTER.asRepeated().encodedSizeWithTag(2, sentence.words) + sentence.unknownFields().size();
            }

            /* renamed from: a */
            public Sentence decode(ProtoReader protoReader) throws IOException {
                C18923a aVar = new C18923a();
                aVar.f46808a = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f46808a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f46809b.add(Word.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Sentence sentence) throws IOException {
                if (sentence.text != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sentence.text);
                }
                Word.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, sentence.words);
                protoWriter.writeBytes(sentence.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v1.SegmentTextResponse$Sentence$a */
        public static final class C18923a extends Message.Builder<Sentence, C18923a> {

            /* renamed from: a */
            public String f46808a;

            /* renamed from: b */
            public List<Word> f46809b = Internal.newMutableList();

            /* renamed from: a */
            public Sentence build() {
                return new Sentence(this.f46808a, this.f46809b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18923a newBuilder() {
            C18923a aVar = new C18923a();
            aVar.f46808a = this.text;
            aVar.f46809b = Internal.copyOf("words", this.words);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "Sentence");
            StringBuilder sb = new StringBuilder();
            if (this.text != null) {
                sb.append(", text=");
                sb.append(this.text);
            }
            if (!this.words.isEmpty()) {
                sb.append(", words=");
                sb.append(this.words);
            }
            StringBuilder replace = sb.replace(0, 2, "Sentence{");
            replace.append('}');
            return replace.toString();
        }

        public Sentence(String str, List<Word> list) {
            this(str, list, ByteString.EMPTY);
        }

        public Sentence(String str, List<Word> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.text = str;
            this.words = Internal.immutableCopyOf("words", list);
        }
    }

    public static final class Word extends Message<Word, C18925a> {
        public static final ProtoAdapter<Word> ADAPTER = new C18926b();
        private static final long serialVersionUID = 0;
        public final String cont;
        public final String pos;

        /* renamed from: com.bytedance.lark.pb.search.v1.SegmentTextResponse$Word$b */
        private static final class C18926b extends ProtoAdapter<Word> {
            C18926b() {
                super(FieldEncoding.LENGTH_DELIMITED, Word.class);
            }

            /* renamed from: a */
            public int encodedSize(Word word) {
                int i;
                int i2 = 0;
                if (word.cont != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, word.cont);
                } else {
                    i = 0;
                }
                if (word.pos != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, word.pos);
                }
                return i + i2 + word.unknownFields().size();
            }

            /* renamed from: a */
            public Word decode(ProtoReader protoReader) throws IOException {
                C18925a aVar = new C18925a();
                aVar.f46810a = "";
                aVar.f46811b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f46810a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f46811b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Word word) throws IOException {
                if (word.cont != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, word.cont);
                }
                if (word.pos != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, word.pos);
                }
                protoWriter.writeBytes(word.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v1.SegmentTextResponse$Word$a */
        public static final class C18925a extends Message.Builder<Word, C18925a> {

            /* renamed from: a */
            public String f46810a;

            /* renamed from: b */
            public String f46811b;

            /* renamed from: a */
            public Word build() {
                return new Word(this.f46810a, this.f46811b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18925a newBuilder() {
            C18925a aVar = new C18925a();
            aVar.f46810a = this.cont;
            aVar.f46811b = this.pos;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "Word");
            StringBuilder sb = new StringBuilder();
            if (this.cont != null) {
                sb.append(", cont=");
                sb.append(this.cont);
            }
            if (this.pos != null) {
                sb.append(", pos=");
                sb.append(this.pos);
            }
            StringBuilder replace = sb.replace(0, 2, "Word{");
            replace.append('}');
            return replace.toString();
        }

        public Word(String str, String str2) {
            this(str, str2, ByteString.EMPTY);
        }

        public Word(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.cont = str;
            this.pos = str2;
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.SegmentTextResponse$b */
    private static final class C18928b extends ProtoAdapter<SegmentTextResponse> {
        C18928b() {
            super(FieldEncoding.LENGTH_DELIMITED, SegmentTextResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SegmentTextResponse segmentTextResponse) {
            return Sentence.ADAPTER.asRepeated().encodedSizeWithTag(1, segmentTextResponse.sentences) + segmentTextResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SegmentTextResponse decode(ProtoReader protoReader) throws IOException {
            C18927a aVar = new C18927a();
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
                    aVar.f46812a.add(Sentence.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SegmentTextResponse segmentTextResponse) throws IOException {
            Sentence.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, segmentTextResponse.sentences);
            protoWriter.writeBytes(segmentTextResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.SegmentTextResponse$a */
    public static final class C18927a extends Message.Builder<SegmentTextResponse, C18927a> {

        /* renamed from: a */
        public List<Sentence> f46812a = Internal.newMutableList();

        /* renamed from: a */
        public SegmentTextResponse build() {
            return new SegmentTextResponse(this.f46812a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18927a newBuilder() {
        C18927a aVar = new C18927a();
        aVar.f46812a = Internal.copyOf("sentences", this.sentences);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SegmentTextResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.sentences.isEmpty()) {
            sb.append(", sentences=");
            sb.append(this.sentences);
        }
        StringBuilder replace = sb.replace(0, 2, "SegmentTextResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SegmentTextResponse(List<Sentence> list) {
        this(list, ByteString.EMPTY);
    }

    public SegmentTextResponse(List<Sentence> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sentences = Internal.immutableCopyOf("sentences", list);
    }
}
