package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

/* renamed from: com.bytedance.lark.pb.basic.v1.Entity */
public final class C14928Entity extends Message<C14928Entity, C14933a> {
    public static final ProtoAdapter<C14928Entity> ADAPTER = new C14934b();
    private static final long serialVersionUID = 0;
    public final Map<String, AbbreviationEntity> abbrevs;
    public final Map<String, ChatChatter> chat_chatters;
    public final Map<String, Chat> chats;
    public final Map<String, Chatter> chatters;
    public final Map<String, Department> departments;
    public final Map<String, DocFeed> doc_feeds;
    public final Map<String, DocMessage> doc_messages;
    public final Map<String, DocPermission> doc_permissions;
    public final Map<String, Doc> docs;
    public final Map<String, Draft> drafts;
    public final Map<String, Email> emails;
    public final Map<String, Message> ephemeral_messages;
    public final Map<String, FavoritesObject> favorites;
    public final Map<String, FeedCard> feed_cards;
    public final Map<String, ChatMailSetting> mail_setting;
    public final Map<String, HashTagMentionEntity> mentions;
    public final Map<String, SubTranslateInfo> merge_forward_translate_messages;
    public final Map<String, DocPermissionInfo> message_id2doc_permission_infos;
    public final Map<String, Message> messages;
    public final Map<String, Oncall> oncalls;
    public final Map<String, OpenApp> open_apps;
    public final Map<String, PreviewEntityPair> preview_entities;
    public final Map<String, QuasiMessage> quasi_messages;
    public final Map<String, QuasiThread> quasi_threads;
    public final Map<String, Tenant> tenants;
    public final Map<String, Thread> threads;
    public final Map<String, TopicGroup> topic_groups;
    public final Map<String, TranslateInfo> translate_messages;
    public final Map<String, Urgent> urgents;

    /* renamed from: com.bytedance.lark.pb.basic.v1.Entity$ChatChatter */
    public static final class ChatChatter extends Message<ChatChatter, C14929a> {
        public static final ProtoAdapter<ChatChatter> ADAPTER = new C14930b();
        private static final long serialVersionUID = 0;
        public final Map<String, Chatter> chatters;

        /* renamed from: com.bytedance.lark.pb.basic.v1.Entity$ChatChatter$a */
        public static final class C14929a extends Message.Builder<ChatChatter, C14929a> {

            /* renamed from: a */
            public Map<String, Chatter> f39485a = Internal.newMutableMap();

            /* renamed from: a */
            public ChatChatter build() {
                return new ChatChatter(this.f39485a, super.buildUnknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Entity$ChatChatter$b */
        private static final class C14930b extends ProtoAdapter<ChatChatter> {

            /* renamed from: a */
            private final ProtoAdapter<Map<String, Chatter>> f39486a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Chatter.ADAPTER);

            C14930b() {
                super(FieldEncoding.LENGTH_DELIMITED, ChatChatter.class);
            }

            /* renamed from: a */
            public int encodedSize(ChatChatter chatChatter) {
                return this.f39486a.encodedSizeWithTag(1, chatChatter.chatters) + chatChatter.unknownFields().size();
            }

            /* renamed from: a */
            public ChatChatter decode(ProtoReader protoReader) throws IOException {
                C14929a aVar = new C14929a();
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
                        aVar.f39485a.putAll(this.f39486a.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ChatChatter chatChatter) throws IOException {
                this.f39486a.encodeWithTag(protoWriter, 1, chatChatter.chatters);
                protoWriter.writeBytes(chatChatter.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14929a newBuilder() {
            C14929a aVar = new C14929a();
            aVar.f39485a = Internal.copyOf("chatters", this.chatters);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "ChatChatter");
            StringBuilder sb = new StringBuilder();
            if (!this.chatters.isEmpty()) {
                sb.append(", chatters=");
                sb.append(this.chatters);
            }
            StringBuilder replace = sb.replace(0, 2, "ChatChatter{");
            replace.append('}');
            return replace.toString();
        }

        public ChatChatter(Map<String, Chatter> map) {
            this(map, ByteString.EMPTY);
        }

        public ChatChatter(Map<String, Chatter> map, ByteString byteString) {
            super(ADAPTER, byteString);
            this.chatters = Internal.immutableCopyOf("chatters", map);
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Entity$DocPermissionInfo */
    public static final class DocPermissionInfo extends Message<DocPermissionInfo, C14931a> {
        public static final ProtoAdapter<DocPermissionInfo> ADAPTER = new C14932b();
        private static final long serialVersionUID = 0;
        public final Map<String, DocPermission> token2doc_permissions;
        public final Map<String, DocPermission> url2doc_permissions;

        /* renamed from: com.bytedance.lark.pb.basic.v1.Entity$DocPermissionInfo$a */
        public static final class C14931a extends Message.Builder<DocPermissionInfo, C14931a> {

            /* renamed from: a */
            public Map<String, DocPermission> f39487a = Internal.newMutableMap();

            /* renamed from: b */
            public Map<String, DocPermission> f39488b = Internal.newMutableMap();

            /* renamed from: a */
            public DocPermissionInfo build() {
                return new DocPermissionInfo(this.f39487a, this.f39488b, super.buildUnknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Entity$DocPermissionInfo$b */
        private static final class C14932b extends ProtoAdapter<DocPermissionInfo> {

            /* renamed from: a */
            private final ProtoAdapter<Map<String, DocPermission>> f39489a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, DocPermission.ADAPTER);

            /* renamed from: b */
            private final ProtoAdapter<Map<String, DocPermission>> f39490b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, DocPermission.ADAPTER);

            C14932b() {
                super(FieldEncoding.LENGTH_DELIMITED, DocPermissionInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(DocPermissionInfo docPermissionInfo) {
                return this.f39489a.encodedSizeWithTag(1, docPermissionInfo.token2doc_permissions) + this.f39490b.encodedSizeWithTag(2, docPermissionInfo.url2doc_permissions) + docPermissionInfo.unknownFields().size();
            }

            /* renamed from: a */
            public DocPermissionInfo decode(ProtoReader protoReader) throws IOException {
                C14931a aVar = new C14931a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f39487a.putAll(this.f39489a.decode(protoReader));
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f39488b.putAll(this.f39490b.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, DocPermissionInfo docPermissionInfo) throws IOException {
                this.f39489a.encodeWithTag(protoWriter, 1, docPermissionInfo.token2doc_permissions);
                this.f39490b.encodeWithTag(protoWriter, 2, docPermissionInfo.url2doc_permissions);
                protoWriter.writeBytes(docPermissionInfo.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14931a newBuilder() {
            C14931a aVar = new C14931a();
            aVar.f39487a = Internal.copyOf("token2doc_permissions", this.token2doc_permissions);
            aVar.f39488b = Internal.copyOf("url2doc_permissions", this.url2doc_permissions);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "DocPermissionInfo");
            StringBuilder sb = new StringBuilder();
            if (!this.token2doc_permissions.isEmpty()) {
                sb.append(", token2doc_permissions=");
                sb.append(this.token2doc_permissions);
            }
            if (!this.url2doc_permissions.isEmpty()) {
                sb.append(", url2doc_permissions=");
                sb.append(this.url2doc_permissions);
            }
            StringBuilder replace = sb.replace(0, 2, "DocPermissionInfo{");
            replace.append('}');
            return replace.toString();
        }

        public DocPermissionInfo(Map<String, DocPermission> map, Map<String, DocPermission> map2) {
            this(map, map2, ByteString.EMPTY);
        }

        public DocPermissionInfo(Map<String, DocPermission> map, Map<String, DocPermission> map2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.token2doc_permissions = Internal.immutableCopyOf("token2doc_permissions", map);
            this.url2doc_permissions = Internal.immutableCopyOf("url2doc_permissions", map2);
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Entity$a */
    public static final class C14933a extends Message.Builder<C14928Entity, C14933a> {

        /* renamed from: A */
        public Map<String, ChatMailSetting> f39491A = Internal.newMutableMap();

        /* renamed from: B */
        public Map<String, HashTagMentionEntity> f39492B = Internal.newMutableMap();

        /* renamed from: C */
        public Map<String, PreviewEntityPair> f39493C = Internal.newMutableMap();

        /* renamed from: a */
        public Map<String, Message> f39494a = Internal.newMutableMap();

        /* renamed from: b */
        public Map<String, Chat> f39495b = Internal.newMutableMap();

        /* renamed from: c */
        public Map<String, Chatter> f39496c = Internal.newMutableMap();

        /* renamed from: d */
        public Map<String, QuasiMessage> f39497d = Internal.newMutableMap();

        /* renamed from: e */
        public Map<String, Department> f39498e = Internal.newMutableMap();

        /* renamed from: f */
        public Map<String, Urgent> f39499f = Internal.newMutableMap();

        /* renamed from: g */
        public Map<String, Draft> f39500g = Internal.newMutableMap();

        /* renamed from: h */
        public Map<String, FeedCard> f39501h = Internal.newMutableMap();

        /* renamed from: i */
        public Map<String, Email> f39502i = Internal.newMutableMap();

        /* renamed from: j */
        public Map<String, Doc> f39503j = Internal.newMutableMap();

        /* renamed from: k */
        public Map<String, DocPermission> f39504k = Internal.newMutableMap();

        /* renamed from: l */
        public Map<String, DocFeed> f39505l = Internal.newMutableMap();

        /* renamed from: m */
        public Map<String, DocMessage> f39506m = Internal.newMutableMap();

        /* renamed from: n */
        public Map<String, Thread> f39507n = Internal.newMutableMap();

        /* renamed from: o */
        public Map<String, QuasiThread> f39508o = Internal.newMutableMap();

        /* renamed from: p */
        public Map<String, FavoritesObject> f39509p = Internal.newMutableMap();

        /* renamed from: q */
        public Map<String, TranslateInfo> f39510q = Internal.newMutableMap();

        /* renamed from: r */
        public Map<String, Tenant> f39511r = Internal.newMutableMap();

        /* renamed from: s */
        public Map<String, ChatChatter> f39512s = Internal.newMutableMap();

        /* renamed from: t */
        public Map<String, DocPermissionInfo> f39513t = Internal.newMutableMap();

        /* renamed from: u */
        public Map<String, OpenApp> f39514u = Internal.newMutableMap();

        /* renamed from: v */
        public Map<String, Oncall> f39515v = Internal.newMutableMap();

        /* renamed from: w */
        public Map<String, TopicGroup> f39516w = Internal.newMutableMap();

        /* renamed from: x */
        public Map<String, AbbreviationEntity> f39517x = Internal.newMutableMap();

        /* renamed from: y */
        public Map<String, Message> f39518y = Internal.newMutableMap();

        /* renamed from: z */
        public Map<String, SubTranslateInfo> f39519z = Internal.newMutableMap();

        /* renamed from: a */
        public C14928Entity build() {
            return new C14928Entity(this.f39494a, this.f39495b, this.f39496c, this.f39497d, this.f39498e, this.f39499f, this.f39500g, this.f39501h, this.f39502i, this.f39503j, this.f39504k, this.f39505l, this.f39506m, this.f39507n, this.f39508o, this.f39509p, this.f39510q, this.f39511r, this.f39512s, this.f39513t, this.f39514u, this.f39515v, this.f39516w, this.f39517x, this.f39518y, this.f39519z, this.f39491A, this.f39492B, this.f39493C, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Entity$b */
    private static final class C14934b extends ProtoAdapter<C14928Entity> {

        /* renamed from: A */
        private final ProtoAdapter<Map<String, ChatMailSetting>> f39520A = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ChatMailSetting.ADAPTER);

        /* renamed from: B */
        private final ProtoAdapter<Map<String, HashTagMentionEntity>> f39521B = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, HashTagMentionEntity.ADAPTER);

        /* renamed from: C */
        private final ProtoAdapter<Map<String, PreviewEntityPair>> f39522C = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, PreviewEntityPair.ADAPTER);

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Message>> f39523a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Message.ADAPTER);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, Chat>> f39524b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Chat.ADAPTER);

        /* renamed from: c */
        private final ProtoAdapter<Map<String, Chatter>> f39525c = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Chatter.ADAPTER);

        /* renamed from: d */
        private final ProtoAdapter<Map<String, QuasiMessage>> f39526d = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, QuasiMessage.ADAPTER);

        /* renamed from: e */
        private final ProtoAdapter<Map<String, Department>> f39527e = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Department.ADAPTER);

        /* renamed from: f */
        private final ProtoAdapter<Map<String, Urgent>> f39528f = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Urgent.ADAPTER);

        /* renamed from: g */
        private final ProtoAdapter<Map<String, Draft>> f39529g = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Draft.ADAPTER);

        /* renamed from: h */
        private final ProtoAdapter<Map<String, FeedCard>> f39530h = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, FeedCard.ADAPTER);

        /* renamed from: i */
        private final ProtoAdapter<Map<String, Email>> f39531i = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Email.ADAPTER);

        /* renamed from: j */
        private final ProtoAdapter<Map<String, Doc>> f39532j = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Doc.ADAPTER);

        /* renamed from: k */
        private final ProtoAdapter<Map<String, DocPermission>> f39533k = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, DocPermission.ADAPTER);

        /* renamed from: l */
        private final ProtoAdapter<Map<String, DocFeed>> f39534l = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, DocFeed.ADAPTER);

        /* renamed from: m */
        private final ProtoAdapter<Map<String, DocMessage>> f39535m = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, DocMessage.ADAPTER);

        /* renamed from: n */
        private final ProtoAdapter<Map<String, Thread>> f39536n = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Thread.ADAPTER);

        /* renamed from: o */
        private final ProtoAdapter<Map<String, QuasiThread>> f39537o = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, QuasiThread.ADAPTER);

        /* renamed from: p */
        private final ProtoAdapter<Map<String, FavoritesObject>> f39538p = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, FavoritesObject.ADAPTER);

        /* renamed from: q */
        private final ProtoAdapter<Map<String, TranslateInfo>> f39539q = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, TranslateInfo.ADAPTER);

        /* renamed from: r */
        private final ProtoAdapter<Map<String, Tenant>> f39540r = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Tenant.ADAPTER);

        /* renamed from: s */
        private final ProtoAdapter<Map<String, ChatChatter>> f39541s = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ChatChatter.ADAPTER);

        /* renamed from: t */
        private final ProtoAdapter<Map<String, DocPermissionInfo>> f39542t = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, DocPermissionInfo.ADAPTER);

        /* renamed from: u */
        private final ProtoAdapter<Map<String, OpenApp>> f39543u = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, OpenApp.ADAPTER);

        /* renamed from: v */
        private final ProtoAdapter<Map<String, Oncall>> f39544v = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Oncall.ADAPTER);

        /* renamed from: w */
        private final ProtoAdapter<Map<String, TopicGroup>> f39545w = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, TopicGroup.ADAPTER);

        /* renamed from: x */
        private final ProtoAdapter<Map<String, AbbreviationEntity>> f39546x = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, AbbreviationEntity.ADAPTER);

        /* renamed from: y */
        private final ProtoAdapter<Map<String, Message>> f39547y = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Message.ADAPTER);

        /* renamed from: z */
        private final ProtoAdapter<Map<String, SubTranslateInfo>> f39548z = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SubTranslateInfo.ADAPTER);

        C14934b() {
            super(FieldEncoding.LENGTH_DELIMITED, C14928Entity.class);
        }

        /* renamed from: a */
        public int encodedSize(C14928Entity entity) {
            return this.f39523a.encodedSizeWithTag(1, entity.messages) + this.f39524b.encodedSizeWithTag(2, entity.chats) + this.f39525c.encodedSizeWithTag(3, entity.chatters) + this.f39526d.encodedSizeWithTag(4, entity.quasi_messages) + this.f39527e.encodedSizeWithTag(5, entity.departments) + this.f39528f.encodedSizeWithTag(6, entity.urgents) + this.f39529g.encodedSizeWithTag(7, entity.drafts) + this.f39530h.encodedSizeWithTag(8, entity.feed_cards) + this.f39531i.encodedSizeWithTag(9, entity.emails) + this.f39532j.encodedSizeWithTag(10, entity.docs) + this.f39533k.encodedSizeWithTag(11, entity.doc_permissions) + this.f39534l.encodedSizeWithTag(12, entity.doc_feeds) + this.f39535m.encodedSizeWithTag(13, entity.doc_messages) + this.f39536n.encodedSizeWithTag(14, entity.threads) + this.f39537o.encodedSizeWithTag(15, entity.quasi_threads) + this.f39538p.encodedSizeWithTag(16, entity.favorites) + this.f39539q.encodedSizeWithTag(17, entity.translate_messages) + this.f39540r.encodedSizeWithTag(18, entity.tenants) + this.f39541s.encodedSizeWithTag(19, entity.chat_chatters) + this.f39542t.encodedSizeWithTag(20, entity.message_id2doc_permission_infos) + this.f39543u.encodedSizeWithTag(21, entity.open_apps) + this.f39544v.encodedSizeWithTag(22, entity.oncalls) + this.f39545w.encodedSizeWithTag(23, entity.topic_groups) + this.f39546x.encodedSizeWithTag(24, entity.abbrevs) + this.f39547y.encodedSizeWithTag(25, entity.ephemeral_messages) + this.f39548z.encodedSizeWithTag(26, entity.merge_forward_translate_messages) + this.f39520A.encodedSizeWithTag(27, entity.mail_setting) + this.f39521B.encodedSizeWithTag(28, entity.mentions) + this.f39522C.encodedSizeWithTag(29, entity.preview_entities) + entity.unknownFields().size();
        }

        /* renamed from: a */
        public C14928Entity decode(ProtoReader protoReader) throws IOException {
            C14933a aVar = new C14933a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f39494a.putAll(this.f39523a.decode(protoReader));
                            break;
                        case 2:
                            aVar.f39495b.putAll(this.f39524b.decode(protoReader));
                            break;
                        case 3:
                            aVar.f39496c.putAll(this.f39525c.decode(protoReader));
                            break;
                        case 4:
                            aVar.f39497d.putAll(this.f39526d.decode(protoReader));
                            break;
                        case 5:
                            aVar.f39498e.putAll(this.f39527e.decode(protoReader));
                            break;
                        case 6:
                            aVar.f39499f.putAll(this.f39528f.decode(protoReader));
                            break;
                        case 7:
                            aVar.f39500g.putAll(this.f39529g.decode(protoReader));
                            break;
                        case 8:
                            aVar.f39501h.putAll(this.f39530h.decode(protoReader));
                            break;
                        case 9:
                            aVar.f39502i.putAll(this.f39531i.decode(protoReader));
                            break;
                        case 10:
                            aVar.f39503j.putAll(this.f39532j.decode(protoReader));
                            break;
                        case 11:
                            aVar.f39504k.putAll(this.f39533k.decode(protoReader));
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f39505l.putAll(this.f39534l.decode(protoReader));
                            break;
                        case 13:
                            aVar.f39506m.putAll(this.f39535m.decode(protoReader));
                            break;
                        case 14:
                            aVar.f39507n.putAll(this.f39536n.decode(protoReader));
                            break;
                        case 15:
                            aVar.f39508o.putAll(this.f39537o.decode(protoReader));
                            break;
                        case 16:
                            aVar.f39509p.putAll(this.f39538p.decode(protoReader));
                            break;
                        case 17:
                            aVar.f39510q.putAll(this.f39539q.decode(protoReader));
                            break;
                        case 18:
                            aVar.f39511r.putAll(this.f39540r.decode(protoReader));
                            break;
                        case 19:
                            aVar.f39512s.putAll(this.f39541s.decode(protoReader));
                            break;
                        case 20:
                            aVar.f39513t.putAll(this.f39542t.decode(protoReader));
                            break;
                        case 21:
                            aVar.f39514u.putAll(this.f39543u.decode(protoReader));
                            break;
                        case 22:
                            aVar.f39515v.putAll(this.f39544v.decode(protoReader));
                            break;
                        case 23:
                            aVar.f39516w.putAll(this.f39545w.decode(protoReader));
                            break;
                        case 24:
                            aVar.f39517x.putAll(this.f39546x.decode(protoReader));
                            break;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                            aVar.f39518y.putAll(this.f39547y.decode(protoReader));
                            break;
                        case 26:
                            aVar.f39519z.putAll(this.f39548z.decode(protoReader));
                            break;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                            aVar.f39491A.putAll(this.f39520A.decode(protoReader));
                            break;
                        case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                            aVar.f39492B.putAll(this.f39521B.decode(protoReader));
                            break;
                        case 29:
                            aVar.f39493C.putAll(this.f39522C.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, C14928Entity entity) throws IOException {
            this.f39523a.encodeWithTag(protoWriter, 1, entity.messages);
            this.f39524b.encodeWithTag(protoWriter, 2, entity.chats);
            this.f39525c.encodeWithTag(protoWriter, 3, entity.chatters);
            this.f39526d.encodeWithTag(protoWriter, 4, entity.quasi_messages);
            this.f39527e.encodeWithTag(protoWriter, 5, entity.departments);
            this.f39528f.encodeWithTag(protoWriter, 6, entity.urgents);
            this.f39529g.encodeWithTag(protoWriter, 7, entity.drafts);
            this.f39530h.encodeWithTag(protoWriter, 8, entity.feed_cards);
            this.f39531i.encodeWithTag(protoWriter, 9, entity.emails);
            this.f39532j.encodeWithTag(protoWriter, 10, entity.docs);
            this.f39533k.encodeWithTag(protoWriter, 11, entity.doc_permissions);
            this.f39534l.encodeWithTag(protoWriter, 12, entity.doc_feeds);
            this.f39535m.encodeWithTag(protoWriter, 13, entity.doc_messages);
            this.f39536n.encodeWithTag(protoWriter, 14, entity.threads);
            this.f39537o.encodeWithTag(protoWriter, 15, entity.quasi_threads);
            this.f39538p.encodeWithTag(protoWriter, 16, entity.favorites);
            this.f39539q.encodeWithTag(protoWriter, 17, entity.translate_messages);
            this.f39540r.encodeWithTag(protoWriter, 18, entity.tenants);
            this.f39541s.encodeWithTag(protoWriter, 19, entity.chat_chatters);
            this.f39542t.encodeWithTag(protoWriter, 20, entity.message_id2doc_permission_infos);
            this.f39543u.encodeWithTag(protoWriter, 21, entity.open_apps);
            this.f39544v.encodeWithTag(protoWriter, 22, entity.oncalls);
            this.f39545w.encodeWithTag(protoWriter, 23, entity.topic_groups);
            this.f39546x.encodeWithTag(protoWriter, 24, entity.abbrevs);
            this.f39547y.encodeWithTag(protoWriter, 25, entity.ephemeral_messages);
            this.f39548z.encodeWithTag(protoWriter, 26, entity.merge_forward_translate_messages);
            this.f39520A.encodeWithTag(protoWriter, 27, entity.mail_setting);
            this.f39521B.encodeWithTag(protoWriter, 28, entity.mentions);
            this.f39522C.encodeWithTag(protoWriter, 29, entity.preview_entities);
            protoWriter.writeBytes(entity.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14933a newBuilder() {
        C14933a aVar = new C14933a();
        aVar.f39494a = Internal.copyOf("messages", this.messages);
        aVar.f39495b = Internal.copyOf("chats", this.chats);
        aVar.f39496c = Internal.copyOf("chatters", this.chatters);
        aVar.f39497d = Internal.copyOf("quasi_messages", this.quasi_messages);
        aVar.f39498e = Internal.copyOf("departments", this.departments);
        aVar.f39499f = Internal.copyOf("urgents", this.urgents);
        aVar.f39500g = Internal.copyOf("drafts", this.drafts);
        aVar.f39501h = Internal.copyOf("feed_cards", this.feed_cards);
        aVar.f39502i = Internal.copyOf("emails", this.emails);
        aVar.f39503j = Internal.copyOf("docs", this.docs);
        aVar.f39504k = Internal.copyOf("doc_permissions", this.doc_permissions);
        aVar.f39505l = Internal.copyOf("doc_feeds", this.doc_feeds);
        aVar.f39506m = Internal.copyOf("doc_messages", this.doc_messages);
        aVar.f39507n = Internal.copyOf("threads", this.threads);
        aVar.f39508o = Internal.copyOf("quasi_threads", this.quasi_threads);
        aVar.f39509p = Internal.copyOf("favorites", this.favorites);
        aVar.f39510q = Internal.copyOf("translate_messages", this.translate_messages);
        aVar.f39511r = Internal.copyOf("tenants", this.tenants);
        aVar.f39512s = Internal.copyOf("chat_chatters", this.chat_chatters);
        aVar.f39513t = Internal.copyOf("message_id2doc_permission_infos", this.message_id2doc_permission_infos);
        aVar.f39514u = Internal.copyOf("open_apps", this.open_apps);
        aVar.f39515v = Internal.copyOf("oncalls", this.oncalls);
        aVar.f39516w = Internal.copyOf("topic_groups", this.topic_groups);
        aVar.f39517x = Internal.copyOf("abbrevs", this.abbrevs);
        aVar.f39518y = Internal.copyOf("ephemeral_messages", this.ephemeral_messages);
        aVar.f39519z = Internal.copyOf("merge_forward_translate_messages", this.merge_forward_translate_messages);
        aVar.f39491A = Internal.copyOf("mail_setting", this.mail_setting);
        aVar.f39492B = Internal.copyOf("mentions", this.mentions);
        aVar.f39493C = Internal.copyOf("preview_entities", this.preview_entities);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "Entity");
        StringBuilder sb = new StringBuilder();
        if (!this.messages.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        if (!this.chats.isEmpty()) {
            sb.append(", chats=");
            sb.append(this.chats);
        }
        if (!this.chatters.isEmpty()) {
            sb.append(", chatters=");
            sb.append(this.chatters);
        }
        if (!this.quasi_messages.isEmpty()) {
            sb.append(", quasi_messages=");
            sb.append(this.quasi_messages);
        }
        if (!this.departments.isEmpty()) {
            sb.append(", departments=");
            sb.append(this.departments);
        }
        if (!this.urgents.isEmpty()) {
            sb.append(", urgents=");
            sb.append(this.urgents);
        }
        if (!this.drafts.isEmpty()) {
            sb.append(", drafts=");
            sb.append(this.drafts);
        }
        if (!this.feed_cards.isEmpty()) {
            sb.append(", feed_cards=");
            sb.append(this.feed_cards);
        }
        if (!this.emails.isEmpty()) {
            sb.append(", emails=");
            sb.append(this.emails);
        }
        if (!this.docs.isEmpty()) {
            sb.append(", docs=");
            sb.append(this.docs);
        }
        if (!this.doc_permissions.isEmpty()) {
            sb.append(", doc_permissions=");
            sb.append(this.doc_permissions);
        }
        if (!this.doc_feeds.isEmpty()) {
            sb.append(", doc_feeds=");
            sb.append(this.doc_feeds);
        }
        if (!this.doc_messages.isEmpty()) {
            sb.append(", doc_messages=");
            sb.append(this.doc_messages);
        }
        if (!this.threads.isEmpty()) {
            sb.append(", threads=");
            sb.append(this.threads);
        }
        if (!this.quasi_threads.isEmpty()) {
            sb.append(", quasi_threads=");
            sb.append(this.quasi_threads);
        }
        if (!this.favorites.isEmpty()) {
            sb.append(", favorites=");
            sb.append(this.favorites);
        }
        if (!this.translate_messages.isEmpty()) {
            sb.append(", translate_messages=");
            sb.append(this.translate_messages);
        }
        if (!this.tenants.isEmpty()) {
            sb.append(", tenants=");
            sb.append(this.tenants);
        }
        if (!this.chat_chatters.isEmpty()) {
            sb.append(", chat_chatters=");
            sb.append(this.chat_chatters);
        }
        if (!this.message_id2doc_permission_infos.isEmpty()) {
            sb.append(", message_id2doc_permission_infos=");
            sb.append(this.message_id2doc_permission_infos);
        }
        if (!this.open_apps.isEmpty()) {
            sb.append(", open_apps=");
            sb.append(this.open_apps);
        }
        if (!this.oncalls.isEmpty()) {
            sb.append(", oncalls=");
            sb.append(this.oncalls);
        }
        if (!this.topic_groups.isEmpty()) {
            sb.append(", topic_groups=");
            sb.append(this.topic_groups);
        }
        if (!this.abbrevs.isEmpty()) {
            sb.append(", abbrevs=");
            sb.append(this.abbrevs);
        }
        if (!this.ephemeral_messages.isEmpty()) {
            sb.append(", ephemeral_messages=");
            sb.append(this.ephemeral_messages);
        }
        if (!this.merge_forward_translate_messages.isEmpty()) {
            sb.append(", merge_forward_translate_messages=");
            sb.append(this.merge_forward_translate_messages);
        }
        if (!this.mail_setting.isEmpty()) {
            sb.append(", mail_setting=");
            sb.append(this.mail_setting);
        }
        if (!this.mentions.isEmpty()) {
            sb.append(", mentions=");
            sb.append(this.mentions);
        }
        if (!this.preview_entities.isEmpty()) {
            sb.append(", preview_entities=");
            sb.append(this.preview_entities);
        }
        StringBuilder replace = sb.replace(0, 2, "Entity{");
        replace.append('}');
        return replace.toString();
    }

    public C14928Entity(Map<String, Message> map, Map<String, Chat> map2, Map<String, Chatter> map3, Map<String, QuasiMessage> map4, Map<String, Department> map5, Map<String, Urgent> map6, Map<String, Draft> map7, Map<String, FeedCard> map8, Map<String, Email> map9, Map<String, Doc> map10, Map<String, DocPermission> map11, Map<String, DocFeed> map12, Map<String, DocMessage> map13, Map<String, Thread> map14, Map<String, QuasiThread> map15, Map<String, FavoritesObject> map16, Map<String, TranslateInfo> map17, Map<String, Tenant> map18, Map<String, ChatChatter> map19, Map<String, DocPermissionInfo> map20, Map<String, OpenApp> map21, Map<String, Oncall> map22, Map<String, TopicGroup> map23, Map<String, AbbreviationEntity> map24, Map<String, Message> map25, Map<String, SubTranslateInfo> map26, Map<String, ChatMailSetting> map27, Map<String, HashTagMentionEntity> map28, Map<String, PreviewEntityPair> map29) {
        this(map, map2, map3, map4, map5, map6, map7, map8, map9, map10, map11, map12, map13, map14, map15, map16, map17, map18, map19, map20, map21, map22, map23, map24, map25, map26, map27, map28, map29, ByteString.EMPTY);
    }

    public C14928Entity(Map<String, Message> map, Map<String, Chat> map2, Map<String, Chatter> map3, Map<String, QuasiMessage> map4, Map<String, Department> map5, Map<String, Urgent> map6, Map<String, Draft> map7, Map<String, FeedCard> map8, Map<String, Email> map9, Map<String, Doc> map10, Map<String, DocPermission> map11, Map<String, DocFeed> map12, Map<String, DocMessage> map13, Map<String, Thread> map14, Map<String, QuasiThread> map15, Map<String, FavoritesObject> map16, Map<String, TranslateInfo> map17, Map<String, Tenant> map18, Map<String, ChatChatter> map19, Map<String, DocPermissionInfo> map20, Map<String, OpenApp> map21, Map<String, Oncall> map22, Map<String, TopicGroup> map23, Map<String, AbbreviationEntity> map24, Map<String, Message> map25, Map<String, SubTranslateInfo> map26, Map<String, ChatMailSetting> map27, Map<String, HashTagMentionEntity> map28, Map<String, PreviewEntityPair> map29, ByteString byteString) {
        super(ADAPTER, byteString);
        this.messages = Internal.immutableCopyOf("messages", map);
        this.chats = Internal.immutableCopyOf("chats", map2);
        this.chatters = Internal.immutableCopyOf("chatters", map3);
        this.quasi_messages = Internal.immutableCopyOf("quasi_messages", map4);
        this.departments = Internal.immutableCopyOf("departments", map5);
        this.urgents = Internal.immutableCopyOf("urgents", map6);
        this.drafts = Internal.immutableCopyOf("drafts", map7);
        this.feed_cards = Internal.immutableCopyOf("feed_cards", map8);
        this.emails = Internal.immutableCopyOf("emails", map9);
        this.docs = Internal.immutableCopyOf("docs", map10);
        this.doc_permissions = Internal.immutableCopyOf("doc_permissions", map11);
        this.doc_feeds = Internal.immutableCopyOf("doc_feeds", map12);
        this.doc_messages = Internal.immutableCopyOf("doc_messages", map13);
        this.threads = Internal.immutableCopyOf("threads", map14);
        this.quasi_threads = Internal.immutableCopyOf("quasi_threads", map15);
        this.favorites = Internal.immutableCopyOf("favorites", map16);
        this.translate_messages = Internal.immutableCopyOf("translate_messages", map17);
        this.tenants = Internal.immutableCopyOf("tenants", map18);
        this.chat_chatters = Internal.immutableCopyOf("chat_chatters", map19);
        this.message_id2doc_permission_infos = Internal.immutableCopyOf("message_id2doc_permission_infos", map20);
        this.open_apps = Internal.immutableCopyOf("open_apps", map21);
        this.oncalls = Internal.immutableCopyOf("oncalls", map22);
        this.topic_groups = Internal.immutableCopyOf("topic_groups", map23);
        this.abbrevs = Internal.immutableCopyOf("abbrevs", map24);
        this.ephemeral_messages = Internal.immutableCopyOf("ephemeral_messages", map25);
        this.merge_forward_translate_messages = Internal.immutableCopyOf("merge_forward_translate_messages", map26);
        this.mail_setting = Internal.immutableCopyOf("mail_setting", map27);
        this.mentions = Internal.immutableCopyOf("mentions", map28);
        this.preview_entities = Internal.immutableCopyOf("preview_entities", map29);
    }
}
