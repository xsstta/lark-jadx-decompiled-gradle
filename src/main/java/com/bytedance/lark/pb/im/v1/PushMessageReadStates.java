package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class PushMessageReadStates extends Message<PushMessageReadStates, C17923a> {
    public static final ProtoAdapter<PushMessageReadStates> ADAPTER = new C17924b();
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final Map<String, ReadStates> read_states;
    public final Map<String, ReadStatesExtra> read_states_extra;

    public static final class ReadStates extends Message<ReadStates, C17919a> {
        public static final ProtoAdapter<ReadStates> ADAPTER = new C17920b();
        public static final Integer DEFAULT_READ_COUNT = 0;
        public static final Integer DEFAULT_UNREAD_COUNT = 0;
        private static final long serialVersionUID = 0;
        public final List<String> read_at_chatter_ids;
        public final Integer read_count;
        public final Integer unread_count;

        /* renamed from: com.bytedance.lark.pb.im.v1.PushMessageReadStates$ReadStates$b */
        private static final class C17920b extends ProtoAdapter<ReadStates> {
            C17920b() {
                super(FieldEncoding.LENGTH_DELIMITED, ReadStates.class);
            }

            /* renamed from: a */
            public int encodedSize(ReadStates readStates) {
                return ProtoAdapter.INT32.encodedSizeWithTag(1, readStates.read_count) + ProtoAdapter.INT32.encodedSizeWithTag(2, readStates.unread_count) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, readStates.read_at_chatter_ids) + readStates.unknownFields().size();
            }

            /* renamed from: a */
            public ReadStates decode(ProtoReader protoReader) throws IOException {
                C17919a aVar = new C17919a();
                aVar.f45004a = 0;
                aVar.f45005b = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f45004a = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f45005b = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f45006c.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ReadStates readStates) throws IOException {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, readStates.read_count);
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, readStates.unread_count);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, readStates.read_at_chatter_ids);
                protoWriter.writeBytes(readStates.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C17919a newBuilder() {
            C17919a aVar = new C17919a();
            aVar.f45004a = this.read_count;
            aVar.f45005b = this.unread_count;
            aVar.f45006c = Internal.copyOf("read_at_chatter_ids", this.read_at_chatter_ids);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.PushMessageReadStates$ReadStates$a */
        public static final class C17919a extends Message.Builder<ReadStates, C17919a> {

            /* renamed from: a */
            public Integer f45004a;

            /* renamed from: b */
            public Integer f45005b;

            /* renamed from: c */
            public List<String> f45006c = Internal.newMutableList();

            /* renamed from: a */
            public ReadStates build() {
                Integer num;
                Integer num2 = this.f45004a;
                if (num2 != null && (num = this.f45005b) != null) {
                    return new ReadStates(num2, num, this.f45006c, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(num2, "read_count", this.f45005b, "unread_count");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("im", "ReadStates");
            StringBuilder sb = new StringBuilder();
            sb.append(", read_count=");
            sb.append(this.read_count);
            sb.append(", unread_count=");
            sb.append(this.unread_count);
            if (!this.read_at_chatter_ids.isEmpty()) {
                sb.append(", read_at_chatter_ids=");
                sb.append(this.read_at_chatter_ids);
            }
            StringBuilder replace = sb.replace(0, 2, "ReadStates{");
            replace.append('}');
            return replace.toString();
        }

        public ReadStates(Integer num, Integer num2, List<String> list) {
            this(num, num2, list, ByteString.EMPTY);
        }

        public ReadStates(Integer num, Integer num2, List<String> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.read_count = num;
            this.unread_count = num2;
            this.read_at_chatter_ids = Internal.immutableCopyOf("read_at_chatter_ids", list);
        }
    }

    public static final class ReadStatesExtra extends Message<ReadStatesExtra, C17921a> {
        public static final ProtoAdapter<ReadStatesExtra> ADAPTER = new C17922b();
        public static final Integer DEFAULT_BADGE_COUNT = 0;
        public static final Boolean DEFAULT_ME_READ = false;
        public static final Integer DEFAULT_POSITION = 0;
        private static final long serialVersionUID = 0;
        public final Integer badge_count;
        public final Boolean me_read;
        public final Integer position;

        /* renamed from: com.bytedance.lark.pb.im.v1.PushMessageReadStates$ReadStatesExtra$b */
        private static final class C17922b extends ProtoAdapter<ReadStatesExtra> {
            C17922b() {
                super(FieldEncoding.LENGTH_DELIMITED, ReadStatesExtra.class);
            }

            /* renamed from: a */
            public int encodedSize(ReadStatesExtra readStatesExtra) {
                int i;
                int i2;
                int i3 = 0;
                if (readStatesExtra.me_read != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, readStatesExtra.me_read);
                } else {
                    i = 0;
                }
                if (readStatesExtra.position != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, readStatesExtra.position);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (readStatesExtra.badge_count != null) {
                    i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, readStatesExtra.badge_count);
                }
                return i4 + i3 + readStatesExtra.unknownFields().size();
            }

            /* renamed from: a */
            public ReadStatesExtra decode(ProtoReader protoReader) throws IOException {
                C17921a aVar = new C17921a();
                aVar.f45007a = false;
                aVar.f45008b = 0;
                aVar.f45009c = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f45007a = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f45008b = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f45009c = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ReadStatesExtra readStatesExtra) throws IOException {
                if (readStatesExtra.me_read != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, readStatesExtra.me_read);
                }
                if (readStatesExtra.position != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, readStatesExtra.position);
                }
                if (readStatesExtra.badge_count != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, readStatesExtra.badge_count);
                }
                protoWriter.writeBytes(readStatesExtra.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.PushMessageReadStates$ReadStatesExtra$a */
        public static final class C17921a extends Message.Builder<ReadStatesExtra, C17921a> {

            /* renamed from: a */
            public Boolean f45007a;

            /* renamed from: b */
            public Integer f45008b;

            /* renamed from: c */
            public Integer f45009c;

            /* renamed from: a */
            public ReadStatesExtra build() {
                return new ReadStatesExtra(this.f45007a, this.f45008b, this.f45009c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C17921a newBuilder() {
            C17921a aVar = new C17921a();
            aVar.f45007a = this.me_read;
            aVar.f45008b = this.position;
            aVar.f45009c = this.badge_count;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("im", "ReadStatesExtra");
            StringBuilder sb = new StringBuilder();
            if (this.me_read != null) {
                sb.append(", me_read=");
                sb.append(this.me_read);
            }
            if (this.position != null) {
                sb.append(", position=");
                sb.append(this.position);
            }
            if (this.badge_count != null) {
                sb.append(", badge_count=");
                sb.append(this.badge_count);
            }
            StringBuilder replace = sb.replace(0, 2, "ReadStatesExtra{");
            replace.append('}');
            return replace.toString();
        }

        public ReadStatesExtra(Boolean bool, Integer num, Integer num2) {
            this(bool, num, num2, ByteString.EMPTY);
        }

        public ReadStatesExtra(Boolean bool, Integer num, Integer num2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.me_read = bool;
            this.position = num;
            this.badge_count = num2;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushMessageReadStates$b */
    private static final class C17924b extends ProtoAdapter<PushMessageReadStates> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, ReadStates>> f45013a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ReadStates.ADAPTER);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, ReadStatesExtra>> f45014b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ReadStatesExtra.ADAPTER);

        C17924b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushMessageReadStates.class);
        }

        /* renamed from: a */
        public int encodedSize(PushMessageReadStates pushMessageReadStates) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, pushMessageReadStates.chat_id) + this.f45013a.encodedSizeWithTag(2, pushMessageReadStates.read_states) + this.f45014b.encodedSizeWithTag(3, pushMessageReadStates.read_states_extra) + pushMessageReadStates.unknownFields().size();
        }

        /* renamed from: a */
        public PushMessageReadStates decode(ProtoReader protoReader) throws IOException {
            C17923a aVar = new C17923a();
            aVar.f45010a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45010a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45011b.putAll(this.f45013a.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45012c.putAll(this.f45014b.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushMessageReadStates pushMessageReadStates) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushMessageReadStates.chat_id);
            this.f45013a.encodeWithTag(protoWriter, 2, pushMessageReadStates.read_states);
            this.f45014b.encodeWithTag(protoWriter, 3, pushMessageReadStates.read_states_extra);
            protoWriter.writeBytes(pushMessageReadStates.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushMessageReadStates$a */
    public static final class C17923a extends Message.Builder<PushMessageReadStates, C17923a> {

        /* renamed from: a */
        public String f45010a;

        /* renamed from: b */
        public Map<String, ReadStates> f45011b = Internal.newMutableMap();

        /* renamed from: c */
        public Map<String, ReadStatesExtra> f45012c = Internal.newMutableMap();

        /* renamed from: a */
        public PushMessageReadStates build() {
            String str = this.f45010a;
            if (str != null) {
                return new PushMessageReadStates(str, this.f45011b, this.f45012c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C17923a newBuilder() {
        C17923a aVar = new C17923a();
        aVar.f45010a = this.chat_id;
        aVar.f45011b = Internal.copyOf("read_states", this.read_states);
        aVar.f45012c = Internal.copyOf("read_states_extra", this.read_states_extra);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushMessageReadStates");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        if (!this.read_states.isEmpty()) {
            sb.append(", read_states=");
            sb.append(this.read_states);
        }
        if (!this.read_states_extra.isEmpty()) {
            sb.append(", read_states_extra=");
            sb.append(this.read_states_extra);
        }
        StringBuilder replace = sb.replace(0, 2, "PushMessageReadStates{");
        replace.append('}');
        return replace.toString();
    }

    public PushMessageReadStates(String str, Map<String, ReadStates> map, Map<String, ReadStatesExtra> map2) {
        this(str, map, map2, ByteString.EMPTY);
    }

    public PushMessageReadStates(String str, Map<String, ReadStates> map, Map<String, ReadStatesExtra> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.read_states = Internal.immutableCopyOf("read_states", map);
        this.read_states_extra = Internal.immutableCopyOf("read_states_extra", map2);
    }
}
