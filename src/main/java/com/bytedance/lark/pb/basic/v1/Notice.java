package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.ttvideoengine.TTVideoEngine;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class Notice extends Message<Notice, C15095a> {
    public static final ProtoAdapter<Notice> ADAPTER = new C15096b();
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Integer DEFAULT_POSITION = 0;
    public static final Boolean DEFAULT_SHOULD_NOTIFY = false;
    public static final State DEFAULT_STATE = State.NEW;
    public static final Type DEFAULT_TYPE = Type.NORMAL;
    private static final long serialVersionUID = 0;
    public final String content;
    public final Long create_time;
    public final Extra extra;
    public final String key;
    public final String message_id;
    public final Integer position;
    public final Boolean should_notify;
    public final State state;
    public final String sub_title;
    public final String title;
    public final Type type;

    public enum State implements WireEnum {
        NEW(1),
        RECALL(2),
        DELETE(3),
        FAILED(4);
        
        public static final ProtoAdapter<State> ADAPTER = ProtoAdapter.newEnumAdapter(State.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static State fromValue(int i) {
            if (i == 1) {
                return NEW;
            }
            if (i == 2) {
                return RECALL;
            }
            if (i == 3) {
                return DELETE;
            }
            if (i != 4) {
                return null;
            }
            return FAILED;
        }

        private State(int i) {
            this.value = i;
        }
    }

    public enum Type implements WireEnum {
        NORMAL(1),
        AT(2),
        URGENT(3),
        REACTION(4),
        URGENT_ACK(5),
        CHAT_APPLICATION(6),
        MAIL(7),
        CHAT_APPLY(8),
        DOC_IMAGE_REPLY(9),
        OPEN_APP(10),
        OPEN_APP_CHAT(11);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            switch (i) {
                case 1:
                    return NORMAL;
                case 2:
                    return AT;
                case 3:
                    return URGENT;
                case 4:
                    return REACTION;
                case 5:
                    return URGENT_ACK;
                case 6:
                    return CHAT_APPLICATION;
                case 7:
                    return MAIL;
                case 8:
                    return CHAT_APPLY;
                case 9:
                    return DOC_IMAGE_REPLY;
                case 10:
                    return OPEN_APP;
                case 11:
                    return OPEN_APP_CHAT;
                default:
                    return null;
            }
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public static final class Extra extends Message<Extra, C15093a> {
        public static final ProtoAdapter<Extra> ADAPTER = new C15094b();
        public static final Integer DEFAULT_CHANNEL_THREAD_POSITION = 0;
        public static final Chat.ChatMode DEFAULT_CHAT_MODE = Chat.ChatMode.UNKNOWN;
        public static final Chat.Type DEFAULT_CHAT_TYPE = Chat.Type.P2P;
        public static final Boolean DEFAULT_IS_CRYPTO = false;
        public static final Boolean DEFAULT_IS_FOLLOWED = false;
        public static final Boolean DEFAULT_ME_READ = false;
        public static final Integer DEFAULT_NEW_MESSAGE_COUNT = 0;
        public static final Integer DEFAULT_THREAD_MESSAGE_POSITION = 0;
        private static final long serialVersionUID = 0;
        public final String android_schema;
        public final String app_id;
        public final String avatar_key;
        public final String avatar_path;
        public final Channel channel;
        public final Integer channel_thread_position;
        public final String chat_id;
        public final Chat.ChatMode chat_mode;
        public final Chat.Type chat_type;
        public final String doc_image_reply_body;
        public final String from_chatter_id;
        public final List<String> image_urls;
        public final String ios_schema;
        public final Boolean is_crypto;
        public final Boolean is_followed;
        public final String label_id;
        public final String last_notification_seq_id;
        public final Boolean me_read;
        public final Integer new_message_count;
        public final String open_app_chat_feed_id;
        public final String pc_schema;
        public final String recaller_id;
        public final String root_id;
        public final String thread_id;
        public final Integer thread_message_position;
        public final String urgent_id;

        /* renamed from: com.bytedance.lark.pb.basic.v1.Notice$Extra$b */
        private static final class C15094b extends ProtoAdapter<Extra> {
            C15094b() {
                super(FieldEncoding.LENGTH_DELIMITED, Extra.class);
            }

            /* renamed from: a */
            public int encodedSize(Extra extra) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                int i10;
                int i11;
                int i12;
                int i13;
                int i14;
                int i15;
                int i16;
                int i17;
                int i18;
                int i19;
                int i20;
                int i21;
                int i22;
                int i23;
                int i24;
                int i25 = 0;
                if (extra.root_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, extra.root_id);
                } else {
                    i = 0;
                }
                if (extra.urgent_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, extra.urgent_id);
                } else {
                    i2 = 0;
                }
                int i26 = i + i2;
                if (extra.chat_id != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, extra.chat_id);
                } else {
                    i3 = 0;
                }
                int i27 = i26 + i3;
                if (extra.chat_type != null) {
                    i4 = Chat.Type.ADAPTER.encodedSizeWithTag(4, extra.chat_type);
                } else {
                    i4 = 0;
                }
                int i28 = i27 + i4;
                if (extra.from_chatter_id != null) {
                    i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, extra.from_chatter_id);
                } else {
                    i5 = 0;
                }
                int encodedSizeWithTag = i28 + i5 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, extra.image_urls);
                if (extra.channel != null) {
                    i6 = Channel.ADAPTER.encodedSizeWithTag(7, extra.channel);
                } else {
                    i6 = 0;
                }
                int i29 = encodedSizeWithTag + i6;
                if (extra.chat_mode != null) {
                    i7 = Chat.ChatMode.ADAPTER.encodedSizeWithTag(8, extra.chat_mode);
                } else {
                    i7 = 0;
                }
                int i30 = i29 + i7;
                if (extra.thread_id != null) {
                    i8 = ProtoAdapter.STRING.encodedSizeWithTag(9, extra.thread_id);
                } else {
                    i8 = 0;
                }
                int i31 = i30 + i8;
                if (extra.is_crypto != null) {
                    i9 = ProtoAdapter.BOOL.encodedSizeWithTag(10, extra.is_crypto);
                } else {
                    i9 = 0;
                }
                int i32 = i31 + i9;
                if (extra.avatar_key != null) {
                    i10 = ProtoAdapter.STRING.encodedSizeWithTag(11, extra.avatar_key);
                } else {
                    i10 = 0;
                }
                int i33 = i32 + i10;
                if (extra.new_message_count != null) {
                    i11 = ProtoAdapter.INT32.encodedSizeWithTag(12, extra.new_message_count);
                } else {
                    i11 = 0;
                }
                int i34 = i33 + i11;
                if (extra.recaller_id != null) {
                    i12 = ProtoAdapter.STRING.encodedSizeWithTag(13, extra.recaller_id);
                } else {
                    i12 = 0;
                }
                int i35 = i34 + i12;
                if (extra.me_read != null) {
                    i13 = ProtoAdapter.BOOL.encodedSizeWithTag(14, extra.me_read);
                } else {
                    i13 = 0;
                }
                int i36 = i35 + i13;
                if (extra.thread_message_position != null) {
                    i14 = ProtoAdapter.INT32.encodedSizeWithTag(15, extra.thread_message_position);
                } else {
                    i14 = 0;
                }
                int i37 = i36 + i14;
                if (extra.channel_thread_position != null) {
                    i15 = ProtoAdapter.INT32.encodedSizeWithTag(16, extra.channel_thread_position);
                } else {
                    i15 = 0;
                }
                int i38 = i37 + i15;
                if (extra.is_followed != null) {
                    i16 = ProtoAdapter.BOOL.encodedSizeWithTag(17, extra.is_followed);
                } else {
                    i16 = 0;
                }
                int i39 = i38 + i16;
                if (extra.avatar_path != null) {
                    i17 = ProtoAdapter.STRING.encodedSizeWithTag(18, extra.avatar_path);
                } else {
                    i17 = 0;
                }
                int i40 = i39 + i17;
                if (extra.doc_image_reply_body != null) {
                    i18 = ProtoAdapter.STRING.encodedSizeWithTag(19, extra.doc_image_reply_body);
                } else {
                    i18 = 0;
                }
                int i41 = i40 + i18;
                if (extra.label_id != null) {
                    i19 = ProtoAdapter.STRING.encodedSizeWithTag(20, extra.label_id);
                } else {
                    i19 = 0;
                }
                int i42 = i41 + i19;
                if (extra.app_id != null) {
                    i20 = ProtoAdapter.STRING.encodedSizeWithTag(30, extra.app_id);
                } else {
                    i20 = 0;
                }
                int i43 = i42 + i20;
                if (extra.android_schema != null) {
                    i21 = ProtoAdapter.STRING.encodedSizeWithTag(31, extra.android_schema);
                } else {
                    i21 = 0;
                }
                int i44 = i43 + i21;
                if (extra.ios_schema != null) {
                    i22 = ProtoAdapter.STRING.encodedSizeWithTag(32, extra.ios_schema);
                } else {
                    i22 = 0;
                }
                int i45 = i44 + i22;
                if (extra.pc_schema != null) {
                    i23 = ProtoAdapter.STRING.encodedSizeWithTag(33, extra.pc_schema);
                } else {
                    i23 = 0;
                }
                int i46 = i45 + i23;
                if (extra.last_notification_seq_id != null) {
                    i24 = ProtoAdapter.STRING.encodedSizeWithTag(34, extra.last_notification_seq_id);
                } else {
                    i24 = 0;
                }
                int i47 = i46 + i24;
                if (extra.open_app_chat_feed_id != null) {
                    i25 = ProtoAdapter.STRING.encodedSizeWithTag(35, extra.open_app_chat_feed_id);
                }
                return i47 + i25 + extra.unknownFields().size();
            }

            /* renamed from: a */
            public Extra decode(ProtoReader protoReader) throws IOException {
                C15093a aVar = new C15093a();
                aVar.f39978a = "";
                aVar.f39979b = "";
                aVar.f39980c = "";
                aVar.f39981d = Chat.Type.P2P;
                aVar.f39982e = "";
                aVar.f39985h = Chat.ChatMode.UNKNOWN;
                aVar.f39986i = "";
                aVar.f39987j = false;
                aVar.f39988k = "";
                aVar.f39989l = 0;
                aVar.f39990m = "";
                aVar.f39991n = false;
                aVar.f39992o = 0;
                aVar.f39993p = 0;
                aVar.f39994q = false;
                aVar.f39995r = "";
                aVar.f39996s = "";
                aVar.f39997t = "";
                aVar.f39998u = "";
                aVar.f39999v = "";
                aVar.f40000w = "";
                aVar.f40001x = "";
                aVar.f40002y = "";
                aVar.f40003z = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f39978a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                aVar.f39979b = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                aVar.f39980c = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                try {
                                    aVar.f39981d = Chat.Type.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 5:
                                aVar.f39982e = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                aVar.f39983f.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 7:
                                aVar.f39984g = Channel.ADAPTER.decode(protoReader);
                                break;
                            case 8:
                                try {
                                    aVar.f39985h = Chat.ChatMode.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                    break;
                                }
                            case 9:
                                aVar.f39986i = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 10:
                                aVar.f39987j = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 11:
                                aVar.f39988k = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                                aVar.f39989l = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 13:
                                aVar.f39990m = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 14:
                                aVar.f39991n = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 15:
                                aVar.f39992o = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 16:
                                aVar.f39993p = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 17:
                                aVar.f39994q = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 18:
                                aVar.f39995r = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 19:
                                aVar.f39996s = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 20:
                                aVar.f39997t = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            default:
                                switch (nextTag) {
                                    case 30:
                                        aVar.f39998u = ProtoAdapter.STRING.decode(protoReader);
                                        continue;
                                    case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                                        aVar.f39999v = ProtoAdapter.STRING.decode(protoReader);
                                        continue;
                                    case 32:
                                        aVar.f40000w = ProtoAdapter.STRING.decode(protoReader);
                                        continue;
                                    case 33:
                                        aVar.f40001x = ProtoAdapter.STRING.decode(protoReader);
                                        continue;
                                    case 34:
                                        aVar.f40002y = ProtoAdapter.STRING.decode(protoReader);
                                        continue;
                                    case 35:
                                        aVar.f40003z = ProtoAdapter.STRING.decode(protoReader);
                                        continue;
                                    default:
                                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                        continue;
                                }
                        }
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Extra extra) throws IOException {
                if (extra.root_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, extra.root_id);
                }
                if (extra.urgent_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, extra.urgent_id);
                }
                if (extra.chat_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, extra.chat_id);
                }
                if (extra.chat_type != null) {
                    Chat.Type.ADAPTER.encodeWithTag(protoWriter, 4, extra.chat_type);
                }
                if (extra.from_chatter_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, extra.from_chatter_id);
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 6, extra.image_urls);
                if (extra.channel != null) {
                    Channel.ADAPTER.encodeWithTag(protoWriter, 7, extra.channel);
                }
                if (extra.chat_mode != null) {
                    Chat.ChatMode.ADAPTER.encodeWithTag(protoWriter, 8, extra.chat_mode);
                }
                if (extra.thread_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, extra.thread_id);
                }
                if (extra.is_crypto != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, extra.is_crypto);
                }
                if (extra.avatar_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, extra.avatar_key);
                }
                if (extra.new_message_count != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 12, extra.new_message_count);
                }
                if (extra.recaller_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, extra.recaller_id);
                }
                if (extra.me_read != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 14, extra.me_read);
                }
                if (extra.thread_message_position != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 15, extra.thread_message_position);
                }
                if (extra.channel_thread_position != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 16, extra.channel_thread_position);
                }
                if (extra.is_followed != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 17, extra.is_followed);
                }
                if (extra.avatar_path != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 18, extra.avatar_path);
                }
                if (extra.doc_image_reply_body != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 19, extra.doc_image_reply_body);
                }
                if (extra.label_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 20, extra.label_id);
                }
                if (extra.app_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 30, extra.app_id);
                }
                if (extra.android_schema != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 31, extra.android_schema);
                }
                if (extra.ios_schema != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 32, extra.ios_schema);
                }
                if (extra.pc_schema != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 33, extra.pc_schema);
                }
                if (extra.last_notification_seq_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 34, extra.last_notification_seq_id);
                }
                if (extra.open_app_chat_feed_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 35, extra.open_app_chat_feed_id);
                }
                protoWriter.writeBytes(extra.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Notice$Extra$a */
        public static final class C15093a extends Message.Builder<Extra, C15093a> {

            /* renamed from: a */
            public String f39978a;

            /* renamed from: b */
            public String f39979b;

            /* renamed from: c */
            public String f39980c;

            /* renamed from: d */
            public Chat.Type f39981d;

            /* renamed from: e */
            public String f39982e;

            /* renamed from: f */
            public List<String> f39983f = Internal.newMutableList();

            /* renamed from: g */
            public Channel f39984g;

            /* renamed from: h */
            public Chat.ChatMode f39985h;

            /* renamed from: i */
            public String f39986i;

            /* renamed from: j */
            public Boolean f39987j;

            /* renamed from: k */
            public String f39988k;

            /* renamed from: l */
            public Integer f39989l;

            /* renamed from: m */
            public String f39990m;

            /* renamed from: n */
            public Boolean f39991n;

            /* renamed from: o */
            public Integer f39992o;

            /* renamed from: p */
            public Integer f39993p;

            /* renamed from: q */
            public Boolean f39994q;

            /* renamed from: r */
            public String f39995r;

            /* renamed from: s */
            public String f39996s;

            /* renamed from: t */
            public String f39997t;

            /* renamed from: u */
            public String f39998u;

            /* renamed from: v */
            public String f39999v;

            /* renamed from: w */
            public String f40000w;

            /* renamed from: x */
            public String f40001x;

            /* renamed from: y */
            public String f40002y;

            /* renamed from: z */
            public String f40003z;

            /* renamed from: a */
            public Extra build() {
                return new Extra(this.f39978a, this.f39979b, this.f39980c, this.f39981d, this.f39982e, this.f39983f, this.f39984g, this.f39985h, this.f39986i, this.f39987j, this.f39988k, this.f39989l, this.f39990m, this.f39991n, this.f39992o, this.f39993p, this.f39994q, this.f39995r, this.f39996s, this.f39997t, this.f39998u, this.f39999v, this.f40000w, this.f40001x, this.f40002y, this.f40003z, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15093a newBuilder() {
            C15093a aVar = new C15093a();
            aVar.f39978a = this.root_id;
            aVar.f39979b = this.urgent_id;
            aVar.f39980c = this.chat_id;
            aVar.f39981d = this.chat_type;
            aVar.f39982e = this.from_chatter_id;
            aVar.f39983f = Internal.copyOf("image_urls", this.image_urls);
            aVar.f39984g = this.channel;
            aVar.f39985h = this.chat_mode;
            aVar.f39986i = this.thread_id;
            aVar.f39987j = this.is_crypto;
            aVar.f39988k = this.avatar_key;
            aVar.f39989l = this.new_message_count;
            aVar.f39990m = this.recaller_id;
            aVar.f39991n = this.me_read;
            aVar.f39992o = this.thread_message_position;
            aVar.f39993p = this.channel_thread_position;
            aVar.f39994q = this.is_followed;
            aVar.f39995r = this.avatar_path;
            aVar.f39996s = this.doc_image_reply_body;
            aVar.f39997t = this.label_id;
            aVar.f39998u = this.app_id;
            aVar.f39999v = this.android_schema;
            aVar.f40000w = this.ios_schema;
            aVar.f40001x = this.pc_schema;
            aVar.f40002y = this.last_notification_seq_id;
            aVar.f40003z = this.open_app_chat_feed_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "Extra");
            StringBuilder sb = new StringBuilder();
            if (this.root_id != null) {
                sb.append(", root_id=");
                sb.append(this.root_id);
            }
            if (this.urgent_id != null) {
                sb.append(", urgent_id=");
                sb.append(this.urgent_id);
            }
            if (this.chat_id != null) {
                sb.append(", chat_id=");
                sb.append(this.chat_id);
            }
            if (this.chat_type != null) {
                sb.append(", chat_type=");
                sb.append(this.chat_type);
            }
            if (this.from_chatter_id != null) {
                sb.append(", from_chatter_id=");
                sb.append(this.from_chatter_id);
            }
            if (!this.image_urls.isEmpty()) {
                sb.append(", image_urls=");
                sb.append(this.image_urls);
            }
            if (this.channel != null) {
                sb.append(", channel=");
                sb.append(this.channel);
            }
            if (this.chat_mode != null) {
                sb.append(", chat_mode=");
                sb.append(this.chat_mode);
            }
            if (this.thread_id != null) {
                sb.append(", thread_id=");
                sb.append(this.thread_id);
            }
            if (this.is_crypto != null) {
                sb.append(", is_crypto=");
                sb.append(this.is_crypto);
            }
            if (this.avatar_key != null) {
                sb.append(", avatar_key=");
                sb.append(this.avatar_key);
            }
            if (this.new_message_count != null) {
                sb.append(", new_message_count=");
                sb.append(this.new_message_count);
            }
            if (this.recaller_id != null) {
                sb.append(", recaller_id=");
                sb.append(this.recaller_id);
            }
            if (this.me_read != null) {
                sb.append(", me_read=");
                sb.append(this.me_read);
            }
            if (this.thread_message_position != null) {
                sb.append(", thread_message_position=");
                sb.append(this.thread_message_position);
            }
            if (this.channel_thread_position != null) {
                sb.append(", channel_thread_position=");
                sb.append(this.channel_thread_position);
            }
            if (this.is_followed != null) {
                sb.append(", is_followed=");
                sb.append(this.is_followed);
            }
            if (this.avatar_path != null) {
                sb.append(", avatar_path=");
                sb.append(this.avatar_path);
            }
            if (this.doc_image_reply_body != null) {
                sb.append(", doc_image_reply_body=");
                sb.append(this.doc_image_reply_body);
            }
            if (this.label_id != null) {
                sb.append(", label_id=");
                sb.append(this.label_id);
            }
            if (this.app_id != null) {
                sb.append(", app_id=");
                sb.append(this.app_id);
            }
            if (this.android_schema != null) {
                sb.append(", android_schema=");
                sb.append(this.android_schema);
            }
            if (this.ios_schema != null) {
                sb.append(", ios_schema=");
                sb.append(this.ios_schema);
            }
            if (this.pc_schema != null) {
                sb.append(", pc_schema=");
                sb.append(this.pc_schema);
            }
            if (this.last_notification_seq_id != null) {
                sb.append(", last_notification_seq_id=");
                sb.append(this.last_notification_seq_id);
            }
            if (this.open_app_chat_feed_id != null) {
                sb.append(", open_app_chat_feed_id=");
                sb.append(this.open_app_chat_feed_id);
            }
            StringBuilder replace = sb.replace(0, 2, "Extra{");
            replace.append('}');
            return replace.toString();
        }

        public Extra(String str, String str2, String str3, Chat.Type type, String str4, List<String> list, Channel channel2, Chat.ChatMode chatMode, String str5, Boolean bool, String str6, Integer num, String str7, Boolean bool2, Integer num2, Integer num3, Boolean bool3, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
            this(str, str2, str3, type, str4, list, channel2, chatMode, str5, bool, str6, num, str7, bool2, num2, num3, bool3, str8, str9, str10, str11, str12, str13, str14, str15, str16, ByteString.EMPTY);
        }

        public Extra(String str, String str2, String str3, Chat.Type type, String str4, List<String> list, Channel channel2, Chat.ChatMode chatMode, String str5, Boolean bool, String str6, Integer num, String str7, Boolean bool2, Integer num2, Integer num3, Boolean bool3, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, ByteString byteString) {
            super(ADAPTER, byteString);
            this.root_id = str;
            this.urgent_id = str2;
            this.chat_id = str3;
            this.chat_type = type;
            this.from_chatter_id = str4;
            this.image_urls = Internal.immutableCopyOf("image_urls", list);
            this.channel = channel2;
            this.chat_mode = chatMode;
            this.thread_id = str5;
            this.is_crypto = bool;
            this.avatar_key = str6;
            this.new_message_count = num;
            this.recaller_id = str7;
            this.me_read = bool2;
            this.thread_message_position = num2;
            this.channel_thread_position = num3;
            this.is_followed = bool3;
            this.avatar_path = str8;
            this.doc_image_reply_body = str9;
            this.label_id = str10;
            this.app_id = str11;
            this.android_schema = str12;
            this.ios_schema = str13;
            this.pc_schema = str14;
            this.last_notification_seq_id = str15;
            this.open_app_chat_feed_id = str16;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Notice$b */
    private static final class C15096b extends ProtoAdapter<Notice> {
        C15096b() {
            super(FieldEncoding.LENGTH_DELIMITED, Notice.class);
        }

        /* renamed from: a */
        public int encodedSize(Notice notice) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, notice.message_id) + State.ADAPTER.encodedSizeWithTag(2, notice.state) + ProtoAdapter.STRING.encodedSizeWithTag(3, notice.content) + ProtoAdapter.STRING.encodedSizeWithTag(4, notice.title) + Type.ADAPTER.encodedSizeWithTag(5, notice.type) + ProtoAdapter.STRING.encodedSizeWithTag(6, notice.key);
            int i5 = 0;
            if (notice.extra != null) {
                i = Extra.ADAPTER.encodedSizeWithTag(7, notice.extra);
            } else {
                i = 0;
            }
            int i6 = encodedSizeWithTag + i;
            if (notice.create_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(8, notice.create_time);
            } else {
                i2 = 0;
            }
            int i7 = i6 + i2;
            if (notice.position != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(9, notice.position);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (notice.should_notify != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(10, notice.should_notify);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (notice.sub_title != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(11, notice.sub_title);
            }
            return i9 + i5 + notice.unknownFields().size();
        }

        /* renamed from: a */
        public Notice decode(ProtoReader protoReader) throws IOException {
            C15095a aVar = new C15095a();
            aVar.f40004a = "";
            aVar.f40005b = State.NEW;
            aVar.f40006c = "";
            aVar.f40007d = "";
            aVar.f40008e = Type.NORMAL;
            aVar.f40009f = "";
            aVar.f40011h = 0L;
            aVar.f40012i = 0;
            aVar.f40013j = false;
            aVar.f40014k = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f40004a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f40005b = State.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f40006c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f40007d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f40008e = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 6:
                            aVar.f40009f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f40010g = Extra.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            aVar.f40011h = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 9:
                            aVar.f40012i = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 10:
                            aVar.f40013j = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 11:
                            aVar.f40014k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Notice notice) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, notice.message_id);
            State.ADAPTER.encodeWithTag(protoWriter, 2, notice.state);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, notice.content);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, notice.title);
            Type.ADAPTER.encodeWithTag(protoWriter, 5, notice.type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, notice.key);
            if (notice.extra != null) {
                Extra.ADAPTER.encodeWithTag(protoWriter, 7, notice.extra);
            }
            if (notice.create_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, notice.create_time);
            }
            if (notice.position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, notice.position);
            }
            if (notice.should_notify != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, notice.should_notify);
            }
            if (notice.sub_title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, notice.sub_title);
            }
            protoWriter.writeBytes(notice.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15095a newBuilder() {
        C15095a aVar = new C15095a();
        aVar.f40004a = this.message_id;
        aVar.f40005b = this.state;
        aVar.f40006c = this.content;
        aVar.f40007d = this.title;
        aVar.f40008e = this.type;
        aVar.f40009f = this.key;
        aVar.f40010g = this.extra;
        aVar.f40011h = this.create_time;
        aVar.f40012i = this.position;
        aVar.f40013j = this.should_notify;
        aVar.f40014k = this.sub_title;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Notice$a */
    public static final class C15095a extends Message.Builder<Notice, C15095a> {

        /* renamed from: a */
        public String f40004a;

        /* renamed from: b */
        public State f40005b;

        /* renamed from: c */
        public String f40006c;

        /* renamed from: d */
        public String f40007d;

        /* renamed from: e */
        public Type f40008e;

        /* renamed from: f */
        public String f40009f;

        /* renamed from: g */
        public Extra f40010g;

        /* renamed from: h */
        public Long f40011h;

        /* renamed from: i */
        public Integer f40012i;

        /* renamed from: j */
        public Boolean f40013j;

        /* renamed from: k */
        public String f40014k;

        /* renamed from: a */
        public Notice build() {
            State state;
            String str;
            String str2;
            Type type;
            String str3;
            String str4 = this.f40004a;
            if (str4 != null && (state = this.f40005b) != null && (str = this.f40006c) != null && (str2 = this.f40007d) != null && (type = this.f40008e) != null && (str3 = this.f40009f) != null) {
                return new Notice(str4, state, str, str2, type, str3, this.f40010g, this.f40011h, this.f40012i, this.f40013j, this.f40014k, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str4, "message_id", this.f40005b, "state", this.f40006c, "content", this.f40007d, "title", this.f40008e, ShareHitPoint.f121869d, this.f40009f, "key");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "Notice");
        StringBuilder sb = new StringBuilder();
        sb.append(", message_id=");
        sb.append(this.message_id);
        sb.append(", state=");
        sb.append(this.state);
        sb.append(", content=");
        sb.append(this.content);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", key=");
        sb.append(this.key);
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.position != null) {
            sb.append(", position=");
            sb.append(this.position);
        }
        if (this.should_notify != null) {
            sb.append(", should_notify=");
            sb.append(this.should_notify);
        }
        if (this.sub_title != null) {
            sb.append(", sub_title=");
            sb.append(this.sub_title);
        }
        StringBuilder replace = sb.replace(0, 2, "Notice{");
        replace.append('}');
        return replace.toString();
    }

    public Notice(String str, State state2, String str2, String str3, Type type2, String str4, Extra extra2, Long l, Integer num, Boolean bool, String str5) {
        this(str, state2, str2, str3, type2, str4, extra2, l, num, bool, str5, ByteString.EMPTY);
    }

    public Notice(String str, State state2, String str2, String str3, Type type2, String str4, Extra extra2, Long l, Integer num, Boolean bool, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
        this.state = state2;
        this.content = str2;
        this.title = str3;
        this.type = type2;
        this.key = str4;
        this.extra = extra2;
        this.create_time = l;
        this.position = num;
        this.should_notify = bool;
        this.sub_title = str5;
    }
}
