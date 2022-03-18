package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class Notification extends Message<Notification, C15099a> {
    public static final ProtoAdapter<Notification> ADAPTER = new C15100b();
    public static final Boolean DEFAULT_SHOULD_NOTIFY = false;
    public static final State DEFAULT_STATE = State.NEW;
    private static final long serialVersionUID = 0;
    public final AppFeedData app_feed_data;
    public final ChatApplyData chat_apply_data;
    public final String content;
    public final DocFeedData doc_feed_data;
    public final DocImageReplyData doc_image_reply_data;
    public final String id;
    public final MailData mail_data;
    public final MessageData message_data;
    public final Boolean should_notify;
    public final State state;
    public final String sub_title;
    public final String title;

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

    /* renamed from: com.bytedance.lark.pb.basic.v1.Notification$b */
    private static final class C15100b extends ProtoAdapter<Notification> {
        C15100b() {
            super(FieldEncoding.LENGTH_DELIMITED, Notification.class);
        }

        /* renamed from: a */
        public int encodedSize(Notification notification) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, notification.id) + State.ADAPTER.encodedSizeWithTag(2, notification.state) + ProtoAdapter.STRING.encodedSizeWithTag(3, notification.content) + ProtoAdapter.STRING.encodedSizeWithTag(4, notification.title);
            int i8 = 0;
            if (notification.should_notify != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(5, notification.should_notify);
            } else {
                i = 0;
            }
            int i9 = encodedSizeWithTag + i;
            if (notification.sub_title != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(11, notification.sub_title);
            } else {
                i2 = 0;
            }
            int i10 = i9 + i2;
            if (notification.doc_image_reply_data != null) {
                i3 = DocImageReplyData.ADAPTER.encodedSizeWithTag(6, notification.doc_image_reply_data);
            } else {
                i3 = 0;
            }
            int i11 = i10 + i3;
            if (notification.app_feed_data != null) {
                i4 = AppFeedData.ADAPTER.encodedSizeWithTag(7, notification.app_feed_data);
            } else {
                i4 = 0;
            }
            int i12 = i11 + i4;
            if (notification.message_data != null) {
                i5 = MessageData.ADAPTER.encodedSizeWithTag(8, notification.message_data);
            } else {
                i5 = 0;
            }
            int i13 = i12 + i5;
            if (notification.doc_feed_data != null) {
                i6 = DocFeedData.ADAPTER.encodedSizeWithTag(9, notification.doc_feed_data);
            } else {
                i6 = 0;
            }
            int i14 = i13 + i6;
            if (notification.mail_data != null) {
                i7 = MailData.ADAPTER.encodedSizeWithTag(10, notification.mail_data);
            } else {
                i7 = 0;
            }
            int i15 = i14 + i7;
            if (notification.chat_apply_data != null) {
                i8 = ChatApplyData.ADAPTER.encodedSizeWithTag(12, notification.chat_apply_data);
            }
            return i15 + i8 + notification.unknownFields().size();
        }

        /* renamed from: a */
        public Notification decode(ProtoReader protoReader) throws IOException {
            C15099a aVar = new C15099a();
            aVar.f40017a = "";
            aVar.f40018b = State.NEW;
            aVar.f40019c = "";
            aVar.f40020d = "";
            aVar.f40021e = false;
            aVar.f40022f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f40017a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f40018b = State.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f40019c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f40020d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f40021e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.mo55084a(DocImageReplyData.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            aVar.mo55081a(AppFeedData.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            aVar.mo55086a(MessageData.ADAPTER.decode(protoReader));
                            break;
                        case 9:
                            aVar.mo55083a(DocFeedData.ADAPTER.decode(protoReader));
                            break;
                        case 10:
                            aVar.mo55085a(MailData.ADAPTER.decode(protoReader));
                            break;
                        case 11:
                            aVar.f40022f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.mo55082a(ChatApplyData.ADAPTER.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, Notification notification) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, notification.id);
            State.ADAPTER.encodeWithTag(protoWriter, 2, notification.state);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, notification.content);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, notification.title);
            if (notification.should_notify != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, notification.should_notify);
            }
            if (notification.sub_title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, notification.sub_title);
            }
            if (notification.doc_image_reply_data != null) {
                DocImageReplyData.ADAPTER.encodeWithTag(protoWriter, 6, notification.doc_image_reply_data);
            }
            if (notification.app_feed_data != null) {
                AppFeedData.ADAPTER.encodeWithTag(protoWriter, 7, notification.app_feed_data);
            }
            if (notification.message_data != null) {
                MessageData.ADAPTER.encodeWithTag(protoWriter, 8, notification.message_data);
            }
            if (notification.doc_feed_data != null) {
                DocFeedData.ADAPTER.encodeWithTag(protoWriter, 9, notification.doc_feed_data);
            }
            if (notification.mail_data != null) {
                MailData.ADAPTER.encodeWithTag(protoWriter, 10, notification.mail_data);
            }
            if (notification.chat_apply_data != null) {
                ChatApplyData.ADAPTER.encodeWithTag(protoWriter, 12, notification.chat_apply_data);
            }
            protoWriter.writeBytes(notification.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15099a newBuilder() {
        C15099a aVar = new C15099a();
        aVar.f40017a = this.id;
        aVar.f40018b = this.state;
        aVar.f40019c = this.content;
        aVar.f40020d = this.title;
        aVar.f40021e = this.should_notify;
        aVar.f40022f = this.sub_title;
        aVar.f40023g = this.doc_image_reply_data;
        aVar.f40024h = this.app_feed_data;
        aVar.f40025i = this.message_data;
        aVar.f40026j = this.doc_feed_data;
        aVar.f40027k = this.mail_data;
        aVar.f40028l = this.chat_apply_data;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "Notification");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", state=");
        sb.append(this.state);
        sb.append(", content=");
        sb.append(this.content);
        sb.append(", title=");
        sb.append(this.title);
        if (this.should_notify != null) {
            sb.append(", should_notify=");
            sb.append(this.should_notify);
        }
        if (this.sub_title != null) {
            sb.append(", sub_title=");
            sb.append(this.sub_title);
        }
        if (this.doc_image_reply_data != null) {
            sb.append(", doc_image_reply_data=");
            sb.append(this.doc_image_reply_data);
        }
        if (this.app_feed_data != null) {
            sb.append(", app_feed_data=");
            sb.append(this.app_feed_data);
        }
        if (this.message_data != null) {
            sb.append(", message_data=");
            sb.append(this.message_data);
        }
        if (this.doc_feed_data != null) {
            sb.append(", doc_feed_data=");
            sb.append(this.doc_feed_data);
        }
        if (this.mail_data != null) {
            sb.append(", mail_data=");
            sb.append(this.mail_data);
        }
        if (this.chat_apply_data != null) {
            sb.append(", chat_apply_data=");
            sb.append(this.chat_apply_data);
        }
        StringBuilder replace = sb.replace(0, 2, "Notification{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Notification$a */
    public static final class C15099a extends Message.Builder<Notification, C15099a> {

        /* renamed from: a */
        public String f40017a;

        /* renamed from: b */
        public State f40018b;

        /* renamed from: c */
        public String f40019c;

        /* renamed from: d */
        public String f40020d;

        /* renamed from: e */
        public Boolean f40021e;

        /* renamed from: f */
        public String f40022f;

        /* renamed from: g */
        public DocImageReplyData f40023g;

        /* renamed from: h */
        public AppFeedData f40024h;

        /* renamed from: i */
        public MessageData f40025i;

        /* renamed from: j */
        public DocFeedData f40026j;

        /* renamed from: k */
        public MailData f40027k;

        /* renamed from: l */
        public ChatApplyData f40028l;

        /* renamed from: a */
        public Notification build() {
            State state;
            String str;
            String str2;
            String str3 = this.f40017a;
            if (str3 != null && (state = this.f40018b) != null && (str = this.f40019c) != null && (str2 = this.f40020d) != null) {
                return new Notification(str3, state, str, str2, this.f40021e, this.f40022f, this.f40023g, this.f40024h, this.f40025i, this.f40026j, this.f40027k, this.f40028l, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str3, "id", this.f40018b, "state", this.f40019c, "content", this.f40020d, "title");
        }

        /* renamed from: a */
        public C15099a mo55081a(AppFeedData appFeedData) {
            this.f40024h = appFeedData;
            this.f40023g = null;
            this.f40025i = null;
            this.f40026j = null;
            this.f40027k = null;
            this.f40028l = null;
            return this;
        }

        /* renamed from: a */
        public C15099a mo55082a(ChatApplyData chatApplyData) {
            this.f40028l = chatApplyData;
            this.f40023g = null;
            this.f40024h = null;
            this.f40025i = null;
            this.f40026j = null;
            this.f40027k = null;
            return this;
        }

        /* renamed from: a */
        public C15099a mo55083a(DocFeedData docFeedData) {
            this.f40026j = docFeedData;
            this.f40023g = null;
            this.f40024h = null;
            this.f40025i = null;
            this.f40027k = null;
            this.f40028l = null;
            return this;
        }

        /* renamed from: a */
        public C15099a mo55084a(DocImageReplyData docImageReplyData) {
            this.f40023g = docImageReplyData;
            this.f40024h = null;
            this.f40025i = null;
            this.f40026j = null;
            this.f40027k = null;
            this.f40028l = null;
            return this;
        }

        /* renamed from: a */
        public C15099a mo55085a(MailData mailData) {
            this.f40027k = mailData;
            this.f40023g = null;
            this.f40024h = null;
            this.f40025i = null;
            this.f40026j = null;
            this.f40028l = null;
            return this;
        }

        /* renamed from: a */
        public C15099a mo55086a(MessageData messageData) {
            this.f40025i = messageData;
            this.f40023g = null;
            this.f40024h = null;
            this.f40026j = null;
            this.f40027k = null;
            this.f40028l = null;
            return this;
        }
    }

    public Notification(String str, State state2, String str2, String str3, Boolean bool, String str4, DocImageReplyData docImageReplyData, AppFeedData appFeedData, MessageData messageData, DocFeedData docFeedData, MailData mailData, ChatApplyData chatApplyData) {
        this(str, state2, str2, str3, bool, str4, docImageReplyData, appFeedData, messageData, docFeedData, mailData, chatApplyData, ByteString.EMPTY);
    }

    public Notification(String str, State state2, String str2, String str3, Boolean bool, String str4, DocImageReplyData docImageReplyData, AppFeedData appFeedData, MessageData messageData, DocFeedData docFeedData, MailData mailData, ChatApplyData chatApplyData, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(docImageReplyData, appFeedData, messageData, docFeedData, mailData, chatApplyData) <= 1) {
            this.id = str;
            this.state = state2;
            this.content = str2;
            this.title = str3;
            this.should_notify = bool;
            this.sub_title = str4;
            this.doc_image_reply_data = docImageReplyData;
            this.app_feed_data = appFeedData;
            this.message_data = messageData;
            this.doc_feed_data = docFeedData;
            this.mail_data = mailData;
            this.chat_apply_data = chatApplyData;
            return;
        }
        throw new IllegalArgumentException("at most one of doc_image_reply_data, app_feed_data, message_data, doc_feed_data, mail_data, chat_apply_data may be non-null");
    }
}
