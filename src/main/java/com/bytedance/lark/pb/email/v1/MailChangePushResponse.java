package com.bytedance.lark.pb.email.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class MailChangePushResponse extends Message<MailChangePushResponse, C17012a> {
    public static final ProtoAdapter<MailChangePushResponse> ADAPTER = new C17013b();
    private static final long serialVersionUID = 0;
    public final MailCacheInvalidChange cache_invalid_change;
    public final MailCollaboratorsChange collaborators_change;
    public final MailCreateShareChatGroupChange create_share_chat_group_change;
    public final MailLabelPropertyChange label_property_change;
    public final MailMigrationChange mail_migration_change;
    public final MailMultiThreadsChange multi_threads_change;
    public final NoOpChange no_change;
    public final MailRecallDoneChange recall_done_change;
    public final MailRecalledChange recalled_change;
    public final MailRefreshThreadChange refresh_thread_change;
    public final MailShareDraftChange share_draft_change;
    public final MailSharePermissionCodeChange share_permission_code_change;
    public final MailShareThreadChange share_thread_change;
    public final MailThreadChange thread_change;
    public final MailUnShareThreadChange unshare_thread_change;
    public final MailLabelChange update_labels_change;

    /* renamed from: com.bytedance.lark.pb.email.v1.MailChangePushResponse$a */
    public static final class C17012a extends Message.Builder<MailChangePushResponse, C17012a> {

        /* renamed from: a */
        public NoOpChange f43647a;

        /* renamed from: b */
        public MailLabelChange f43648b;

        /* renamed from: c */
        public MailCacheInvalidChange f43649c;

        /* renamed from: d */
        public MailRefreshThreadChange f43650d;

        /* renamed from: e */
        public MailThreadChange f43651e;

        /* renamed from: f */
        public MailCollaboratorsChange f43652f;

        /* renamed from: g */
        public MailShareThreadChange f43653g;

        /* renamed from: h */
        public MailUnShareThreadChange f43654h;

        /* renamed from: i */
        public MailLabelPropertyChange f43655i;

        /* renamed from: j */
        public MailShareDraftChange f43656j;

        /* renamed from: k */
        public MailMultiThreadsChange f43657k;

        /* renamed from: l */
        public MailMigrationChange f43658l;

        /* renamed from: m */
        public MailCreateShareChatGroupChange f43659m;

        /* renamed from: n */
        public MailSharePermissionCodeChange f43660n;

        /* renamed from: o */
        public MailRecallDoneChange f43661o;

        /* renamed from: p */
        public MailRecalledChange f43662p;

        /* renamed from: a */
        public C17012a mo60103a(NoOpChange noOpChange) {
            this.f43647a = noOpChange;
            this.f43648b = null;
            this.f43649c = null;
            this.f43650d = null;
            this.f43651e = null;
            this.f43652f = null;
            this.f43653g = null;
            this.f43654h = null;
            this.f43655i = null;
            this.f43656j = null;
            this.f43657k = null;
            this.f43658l = null;
            this.f43659m = null;
            this.f43660n = null;
            this.f43661o = null;
            this.f43662p = null;
            return this;
        }

        /* renamed from: a */
        public C17012a mo60097a(MailRefreshThreadChange mailRefreshThreadChange) {
            this.f43650d = mailRefreshThreadChange;
            this.f43647a = null;
            this.f43648b = null;
            this.f43649c = null;
            this.f43651e = null;
            this.f43652f = null;
            this.f43653g = null;
            this.f43654h = null;
            this.f43655i = null;
            this.f43656j = null;
            this.f43657k = null;
            this.f43658l = null;
            this.f43659m = null;
            this.f43660n = null;
            this.f43661o = null;
            this.f43662p = null;
            return this;
        }

        /* renamed from: a */
        public C17012a mo60101a(MailThreadChange mailThreadChange) {
            this.f43651e = mailThreadChange;
            this.f43647a = null;
            this.f43648b = null;
            this.f43649c = null;
            this.f43650d = null;
            this.f43652f = null;
            this.f43653g = null;
            this.f43654h = null;
            this.f43655i = null;
            this.f43656j = null;
            this.f43657k = null;
            this.f43658l = null;
            this.f43659m = null;
            this.f43660n = null;
            this.f43661o = null;
            this.f43662p = null;
            return this;
        }

        /* renamed from: a */
        public C17012a mo60100a(MailShareThreadChange mailShareThreadChange) {
            this.f43653g = mailShareThreadChange;
            this.f43647a = null;
            this.f43648b = null;
            this.f43649c = null;
            this.f43650d = null;
            this.f43651e = null;
            this.f43652f = null;
            this.f43654h = null;
            this.f43655i = null;
            this.f43656j = null;
            this.f43657k = null;
            this.f43658l = null;
            this.f43659m = null;
            this.f43660n = null;
            this.f43661o = null;
            this.f43662p = null;
            return this;
        }

        /* renamed from: a */
        public C17012a mo60102a(MailUnShareThreadChange mailUnShareThreadChange) {
            this.f43654h = mailUnShareThreadChange;
            this.f43647a = null;
            this.f43648b = null;
            this.f43649c = null;
            this.f43650d = null;
            this.f43651e = null;
            this.f43652f = null;
            this.f43653g = null;
            this.f43655i = null;
            this.f43656j = null;
            this.f43657k = null;
            this.f43658l = null;
            this.f43659m = null;
            this.f43660n = null;
            this.f43661o = null;
            this.f43662p = null;
            return this;
        }

        /* renamed from: a */
        public C17012a mo60098a(MailShareDraftChange mailShareDraftChange) {
            this.f43656j = mailShareDraftChange;
            this.f43647a = null;
            this.f43648b = null;
            this.f43649c = null;
            this.f43650d = null;
            this.f43651e = null;
            this.f43652f = null;
            this.f43653g = null;
            this.f43654h = null;
            this.f43655i = null;
            this.f43657k = null;
            this.f43658l = null;
            this.f43659m = null;
            this.f43660n = null;
            this.f43661o = null;
            this.f43662p = null;
            return this;
        }

        /* renamed from: a */
        public C17012a mo60099a(MailSharePermissionCodeChange mailSharePermissionCodeChange) {
            this.f43660n = mailSharePermissionCodeChange;
            this.f43647a = null;
            this.f43648b = null;
            this.f43649c = null;
            this.f43650d = null;
            this.f43651e = null;
            this.f43652f = null;
            this.f43653g = null;
            this.f43654h = null;
            this.f43655i = null;
            this.f43656j = null;
            this.f43657k = null;
            this.f43658l = null;
            this.f43659m = null;
            this.f43661o = null;
            this.f43662p = null;
            return this;
        }

        /* renamed from: a */
        public C17012a mo60095a(MailRecallDoneChange mailRecallDoneChange) {
            this.f43661o = mailRecallDoneChange;
            this.f43647a = null;
            this.f43648b = null;
            this.f43649c = null;
            this.f43650d = null;
            this.f43651e = null;
            this.f43652f = null;
            this.f43653g = null;
            this.f43654h = null;
            this.f43655i = null;
            this.f43656j = null;
            this.f43657k = null;
            this.f43658l = null;
            this.f43659m = null;
            this.f43660n = null;
            this.f43662p = null;
            return this;
        }

        /* renamed from: a */
        public C17012a mo60096a(MailRecalledChange mailRecalledChange) {
            this.f43662p = mailRecalledChange;
            this.f43647a = null;
            this.f43648b = null;
            this.f43649c = null;
            this.f43650d = null;
            this.f43651e = null;
            this.f43652f = null;
            this.f43653g = null;
            this.f43654h = null;
            this.f43655i = null;
            this.f43656j = null;
            this.f43657k = null;
            this.f43658l = null;
            this.f43659m = null;
            this.f43660n = null;
            this.f43661o = null;
            return this;
        }

        /* renamed from: a */
        public MailChangePushResponse build() {
            return new MailChangePushResponse(this.f43647a, this.f43648b, this.f43649c, this.f43650d, this.f43651e, this.f43652f, this.f43653g, this.f43654h, this.f43655i, this.f43656j, this.f43657k, this.f43658l, this.f43659m, this.f43660n, this.f43661o, this.f43662p, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17012a mo60088a(MailCacheInvalidChange mailCacheInvalidChange) {
            this.f43649c = mailCacheInvalidChange;
            this.f43647a = null;
            this.f43648b = null;
            this.f43650d = null;
            this.f43651e = null;
            this.f43652f = null;
            this.f43653g = null;
            this.f43654h = null;
            this.f43655i = null;
            this.f43656j = null;
            this.f43657k = null;
            this.f43658l = null;
            this.f43659m = null;
            this.f43660n = null;
            this.f43661o = null;
            this.f43662p = null;
            return this;
        }

        /* renamed from: a */
        public C17012a mo60089a(MailCollaboratorsChange mailCollaboratorsChange) {
            this.f43652f = mailCollaboratorsChange;
            this.f43647a = null;
            this.f43648b = null;
            this.f43649c = null;
            this.f43650d = null;
            this.f43651e = null;
            this.f43653g = null;
            this.f43654h = null;
            this.f43655i = null;
            this.f43656j = null;
            this.f43657k = null;
            this.f43658l = null;
            this.f43659m = null;
            this.f43660n = null;
            this.f43661o = null;
            this.f43662p = null;
            return this;
        }

        /* renamed from: a */
        public C17012a mo60090a(MailCreateShareChatGroupChange mailCreateShareChatGroupChange) {
            this.f43659m = mailCreateShareChatGroupChange;
            this.f43647a = null;
            this.f43648b = null;
            this.f43649c = null;
            this.f43650d = null;
            this.f43651e = null;
            this.f43652f = null;
            this.f43653g = null;
            this.f43654h = null;
            this.f43655i = null;
            this.f43656j = null;
            this.f43657k = null;
            this.f43658l = null;
            this.f43660n = null;
            this.f43661o = null;
            this.f43662p = null;
            return this;
        }

        /* renamed from: a */
        public C17012a mo60091a(MailLabelChange mailLabelChange) {
            this.f43648b = mailLabelChange;
            this.f43647a = null;
            this.f43649c = null;
            this.f43650d = null;
            this.f43651e = null;
            this.f43652f = null;
            this.f43653g = null;
            this.f43654h = null;
            this.f43655i = null;
            this.f43656j = null;
            this.f43657k = null;
            this.f43658l = null;
            this.f43659m = null;
            this.f43660n = null;
            this.f43661o = null;
            this.f43662p = null;
            return this;
        }

        /* renamed from: a */
        public C17012a mo60092a(MailLabelPropertyChange mailLabelPropertyChange) {
            this.f43655i = mailLabelPropertyChange;
            this.f43647a = null;
            this.f43648b = null;
            this.f43649c = null;
            this.f43650d = null;
            this.f43651e = null;
            this.f43652f = null;
            this.f43653g = null;
            this.f43654h = null;
            this.f43656j = null;
            this.f43657k = null;
            this.f43658l = null;
            this.f43659m = null;
            this.f43660n = null;
            this.f43661o = null;
            this.f43662p = null;
            return this;
        }

        /* renamed from: a */
        public C17012a mo60093a(MailMigrationChange mailMigrationChange) {
            this.f43658l = mailMigrationChange;
            this.f43647a = null;
            this.f43648b = null;
            this.f43649c = null;
            this.f43650d = null;
            this.f43651e = null;
            this.f43652f = null;
            this.f43653g = null;
            this.f43654h = null;
            this.f43655i = null;
            this.f43656j = null;
            this.f43657k = null;
            this.f43659m = null;
            this.f43660n = null;
            this.f43661o = null;
            this.f43662p = null;
            return this;
        }

        /* renamed from: a */
        public C17012a mo60094a(MailMultiThreadsChange mailMultiThreadsChange) {
            this.f43657k = mailMultiThreadsChange;
            this.f43647a = null;
            this.f43648b = null;
            this.f43649c = null;
            this.f43650d = null;
            this.f43651e = null;
            this.f43652f = null;
            this.f43653g = null;
            this.f43654h = null;
            this.f43655i = null;
            this.f43656j = null;
            this.f43658l = null;
            this.f43659m = null;
            this.f43660n = null;
            this.f43661o = null;
            this.f43662p = null;
            return this;
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.v1.MailChangePushResponse$b */
    private static final class C17013b extends ProtoAdapter<MailChangePushResponse> {
        C17013b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailChangePushResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailChangePushResponse mailChangePushResponse) {
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
            int i16 = 0;
            if (mailChangePushResponse.no_change != null) {
                i = NoOpChange.ADAPTER.encodedSizeWithTag(1, mailChangePushResponse.no_change);
            } else {
                i = 0;
            }
            if (mailChangePushResponse.update_labels_change != null) {
                i2 = MailLabelChange.ADAPTER.encodedSizeWithTag(5, mailChangePushResponse.update_labels_change);
            } else {
                i2 = 0;
            }
            int i17 = i + i2;
            if (mailChangePushResponse.cache_invalid_change != null) {
                i3 = MailCacheInvalidChange.ADAPTER.encodedSizeWithTag(6, mailChangePushResponse.cache_invalid_change);
            } else {
                i3 = 0;
            }
            int i18 = i17 + i3;
            if (mailChangePushResponse.refresh_thread_change != null) {
                i4 = MailRefreshThreadChange.ADAPTER.encodedSizeWithTag(7, mailChangePushResponse.refresh_thread_change);
            } else {
                i4 = 0;
            }
            int i19 = i18 + i4;
            if (mailChangePushResponse.thread_change != null) {
                i5 = MailThreadChange.ADAPTER.encodedSizeWithTag(8, mailChangePushResponse.thread_change);
            } else {
                i5 = 0;
            }
            int i20 = i19 + i5;
            if (mailChangePushResponse.collaborators_change != null) {
                i6 = MailCollaboratorsChange.ADAPTER.encodedSizeWithTag(9, mailChangePushResponse.collaborators_change);
            } else {
                i6 = 0;
            }
            int i21 = i20 + i6;
            if (mailChangePushResponse.share_thread_change != null) {
                i7 = MailShareThreadChange.ADAPTER.encodedSizeWithTag(10, mailChangePushResponse.share_thread_change);
            } else {
                i7 = 0;
            }
            int i22 = i21 + i7;
            if (mailChangePushResponse.unshare_thread_change != null) {
                i8 = MailUnShareThreadChange.ADAPTER.encodedSizeWithTag(11, mailChangePushResponse.unshare_thread_change);
            } else {
                i8 = 0;
            }
            int i23 = i22 + i8;
            if (mailChangePushResponse.label_property_change != null) {
                i9 = MailLabelPropertyChange.ADAPTER.encodedSizeWithTag(13, mailChangePushResponse.label_property_change);
            } else {
                i9 = 0;
            }
            int i24 = i23 + i9;
            if (mailChangePushResponse.share_draft_change != null) {
                i10 = MailShareDraftChange.ADAPTER.encodedSizeWithTag(14, mailChangePushResponse.share_draft_change);
            } else {
                i10 = 0;
            }
            int i25 = i24 + i10;
            if (mailChangePushResponse.multi_threads_change != null) {
                i11 = MailMultiThreadsChange.ADAPTER.encodedSizeWithTag(15, mailChangePushResponse.multi_threads_change);
            } else {
                i11 = 0;
            }
            int i26 = i25 + i11;
            if (mailChangePushResponse.mail_migration_change != null) {
                i12 = MailMigrationChange.ADAPTER.encodedSizeWithTag(16, mailChangePushResponse.mail_migration_change);
            } else {
                i12 = 0;
            }
            int i27 = i26 + i12;
            if (mailChangePushResponse.create_share_chat_group_change != null) {
                i13 = MailCreateShareChatGroupChange.ADAPTER.encodedSizeWithTag(17, mailChangePushResponse.create_share_chat_group_change);
            } else {
                i13 = 0;
            }
            int i28 = i27 + i13;
            if (mailChangePushResponse.share_permission_code_change != null) {
                i14 = MailSharePermissionCodeChange.ADAPTER.encodedSizeWithTag(18, mailChangePushResponse.share_permission_code_change);
            } else {
                i14 = 0;
            }
            int i29 = i28 + i14;
            if (mailChangePushResponse.recall_done_change != null) {
                i15 = MailRecallDoneChange.ADAPTER.encodedSizeWithTag(19, mailChangePushResponse.recall_done_change);
            } else {
                i15 = 0;
            }
            int i30 = i29 + i15;
            if (mailChangePushResponse.recalled_change != null) {
                i16 = MailRecalledChange.ADAPTER.encodedSizeWithTag(20, mailChangePushResponse.recalled_change);
            }
            return i30 + i16 + mailChangePushResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailChangePushResponse decode(ProtoReader protoReader) throws IOException {
            C17012a aVar = new C17012a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.mo60103a(NoOpChange.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 5:
                            aVar.mo60091a(MailLabelChange.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            aVar.mo60088a(MailCacheInvalidChange.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            aVar.mo60097a(MailRefreshThreadChange.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            aVar.mo60101a(MailThreadChange.ADAPTER.decode(protoReader));
                            break;
                        case 9:
                            aVar.mo60089a(MailCollaboratorsChange.ADAPTER.decode(protoReader));
                            break;
                        case 10:
                            aVar.mo60100a(MailShareThreadChange.ADAPTER.decode(protoReader));
                            break;
                        case 11:
                            aVar.mo60102a(MailUnShareThreadChange.ADAPTER.decode(protoReader));
                            break;
                        case 13:
                            aVar.mo60092a(MailLabelPropertyChange.ADAPTER.decode(protoReader));
                            break;
                        case 14:
                            aVar.mo60098a(MailShareDraftChange.ADAPTER.decode(protoReader));
                            break;
                        case 15:
                            aVar.mo60094a(MailMultiThreadsChange.ADAPTER.decode(protoReader));
                            break;
                        case 16:
                            aVar.mo60093a(MailMigrationChange.ADAPTER.decode(protoReader));
                            break;
                        case 17:
                            aVar.mo60090a(MailCreateShareChatGroupChange.ADAPTER.decode(protoReader));
                            break;
                        case 18:
                            aVar.mo60099a(MailSharePermissionCodeChange.ADAPTER.decode(protoReader));
                            break;
                        case 19:
                            aVar.mo60095a(MailRecallDoneChange.ADAPTER.decode(protoReader));
                            break;
                        case 20:
                            aVar.mo60096a(MailRecalledChange.ADAPTER.decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailChangePushResponse mailChangePushResponse) throws IOException {
            if (mailChangePushResponse.no_change != null) {
                NoOpChange.ADAPTER.encodeWithTag(protoWriter, 1, mailChangePushResponse.no_change);
            }
            if (mailChangePushResponse.update_labels_change != null) {
                MailLabelChange.ADAPTER.encodeWithTag(protoWriter, 5, mailChangePushResponse.update_labels_change);
            }
            if (mailChangePushResponse.cache_invalid_change != null) {
                MailCacheInvalidChange.ADAPTER.encodeWithTag(protoWriter, 6, mailChangePushResponse.cache_invalid_change);
            }
            if (mailChangePushResponse.refresh_thread_change != null) {
                MailRefreshThreadChange.ADAPTER.encodeWithTag(protoWriter, 7, mailChangePushResponse.refresh_thread_change);
            }
            if (mailChangePushResponse.thread_change != null) {
                MailThreadChange.ADAPTER.encodeWithTag(protoWriter, 8, mailChangePushResponse.thread_change);
            }
            if (mailChangePushResponse.collaborators_change != null) {
                MailCollaboratorsChange.ADAPTER.encodeWithTag(protoWriter, 9, mailChangePushResponse.collaborators_change);
            }
            if (mailChangePushResponse.share_thread_change != null) {
                MailShareThreadChange.ADAPTER.encodeWithTag(protoWriter, 10, mailChangePushResponse.share_thread_change);
            }
            if (mailChangePushResponse.unshare_thread_change != null) {
                MailUnShareThreadChange.ADAPTER.encodeWithTag(protoWriter, 11, mailChangePushResponse.unshare_thread_change);
            }
            if (mailChangePushResponse.label_property_change != null) {
                MailLabelPropertyChange.ADAPTER.encodeWithTag(protoWriter, 13, mailChangePushResponse.label_property_change);
            }
            if (mailChangePushResponse.share_draft_change != null) {
                MailShareDraftChange.ADAPTER.encodeWithTag(protoWriter, 14, mailChangePushResponse.share_draft_change);
            }
            if (mailChangePushResponse.multi_threads_change != null) {
                MailMultiThreadsChange.ADAPTER.encodeWithTag(protoWriter, 15, mailChangePushResponse.multi_threads_change);
            }
            if (mailChangePushResponse.mail_migration_change != null) {
                MailMigrationChange.ADAPTER.encodeWithTag(protoWriter, 16, mailChangePushResponse.mail_migration_change);
            }
            if (mailChangePushResponse.create_share_chat_group_change != null) {
                MailCreateShareChatGroupChange.ADAPTER.encodeWithTag(protoWriter, 17, mailChangePushResponse.create_share_chat_group_change);
            }
            if (mailChangePushResponse.share_permission_code_change != null) {
                MailSharePermissionCodeChange.ADAPTER.encodeWithTag(protoWriter, 18, mailChangePushResponse.share_permission_code_change);
            }
            if (mailChangePushResponse.recall_done_change != null) {
                MailRecallDoneChange.ADAPTER.encodeWithTag(protoWriter, 19, mailChangePushResponse.recall_done_change);
            }
            if (mailChangePushResponse.recalled_change != null) {
                MailRecalledChange.ADAPTER.encodeWithTag(protoWriter, 20, mailChangePushResponse.recalled_change);
            }
            protoWriter.writeBytes(mailChangePushResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17012a newBuilder() {
        C17012a aVar = new C17012a();
        aVar.f43647a = this.no_change;
        aVar.f43648b = this.update_labels_change;
        aVar.f43649c = this.cache_invalid_change;
        aVar.f43650d = this.refresh_thread_change;
        aVar.f43651e = this.thread_change;
        aVar.f43652f = this.collaborators_change;
        aVar.f43653g = this.share_thread_change;
        aVar.f43654h = this.unshare_thread_change;
        aVar.f43655i = this.label_property_change;
        aVar.f43656j = this.share_draft_change;
        aVar.f43657k = this.multi_threads_change;
        aVar.f43658l = this.mail_migration_change;
        aVar.f43659m = this.create_share_chat_group_change;
        aVar.f43660n = this.share_permission_code_change;
        aVar.f43661o = this.recall_done_change;
        aVar.f43662p = this.recalled_change;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailChangePushResponse");
        StringBuilder sb = new StringBuilder();
        if (this.no_change != null) {
            sb.append(", no_change=");
            sb.append(this.no_change);
        }
        if (this.update_labels_change != null) {
            sb.append(", update_labels_change=");
            sb.append(this.update_labels_change);
        }
        if (this.cache_invalid_change != null) {
            sb.append(", cache_invalid_change=");
            sb.append(this.cache_invalid_change);
        }
        if (this.refresh_thread_change != null) {
            sb.append(", refresh_thread_change=");
            sb.append(this.refresh_thread_change);
        }
        if (this.thread_change != null) {
            sb.append(", thread_change=");
            sb.append(this.thread_change);
        }
        if (this.collaborators_change != null) {
            sb.append(", collaborators_change=");
            sb.append(this.collaborators_change);
        }
        if (this.share_thread_change != null) {
            sb.append(", share_thread_change=");
            sb.append(this.share_thread_change);
        }
        if (this.unshare_thread_change != null) {
            sb.append(", unshare_thread_change=");
            sb.append(this.unshare_thread_change);
        }
        if (this.label_property_change != null) {
            sb.append(", label_property_change=");
            sb.append(this.label_property_change);
        }
        if (this.share_draft_change != null) {
            sb.append(", share_draft_change=");
            sb.append(this.share_draft_change);
        }
        if (this.multi_threads_change != null) {
            sb.append(", multi_threads_change=");
            sb.append(this.multi_threads_change);
        }
        if (this.mail_migration_change != null) {
            sb.append(", mail_migration_change=");
            sb.append(this.mail_migration_change);
        }
        if (this.create_share_chat_group_change != null) {
            sb.append(", create_share_chat_group_change=");
            sb.append(this.create_share_chat_group_change);
        }
        if (this.share_permission_code_change != null) {
            sb.append(", share_permission_code_change=");
            sb.append(this.share_permission_code_change);
        }
        if (this.recall_done_change != null) {
            sb.append(", recall_done_change=");
            sb.append(this.recall_done_change);
        }
        if (this.recalled_change != null) {
            sb.append(", recalled_change=");
            sb.append(this.recalled_change);
        }
        StringBuilder replace = sb.replace(0, 2, "MailChangePushResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailChangePushResponse(NoOpChange noOpChange, MailLabelChange mailLabelChange, MailCacheInvalidChange mailCacheInvalidChange, MailRefreshThreadChange mailRefreshThreadChange, MailThreadChange mailThreadChange, MailCollaboratorsChange mailCollaboratorsChange, MailShareThreadChange mailShareThreadChange, MailUnShareThreadChange mailUnShareThreadChange, MailLabelPropertyChange mailLabelPropertyChange, MailShareDraftChange mailShareDraftChange, MailMultiThreadsChange mailMultiThreadsChange, MailMigrationChange mailMigrationChange, MailCreateShareChatGroupChange mailCreateShareChatGroupChange, MailSharePermissionCodeChange mailSharePermissionCodeChange, MailRecallDoneChange mailRecallDoneChange, MailRecalledChange mailRecalledChange) {
        this(noOpChange, mailLabelChange, mailCacheInvalidChange, mailRefreshThreadChange, mailThreadChange, mailCollaboratorsChange, mailShareThreadChange, mailUnShareThreadChange, mailLabelPropertyChange, mailShareDraftChange, mailMultiThreadsChange, mailMigrationChange, mailCreateShareChatGroupChange, mailSharePermissionCodeChange, mailRecallDoneChange, mailRecalledChange, ByteString.EMPTY);
    }

    public MailChangePushResponse(NoOpChange noOpChange, MailLabelChange mailLabelChange, MailCacheInvalidChange mailCacheInvalidChange, MailRefreshThreadChange mailRefreshThreadChange, MailThreadChange mailThreadChange, MailCollaboratorsChange mailCollaboratorsChange, MailShareThreadChange mailShareThreadChange, MailUnShareThreadChange mailUnShareThreadChange, MailLabelPropertyChange mailLabelPropertyChange, MailShareDraftChange mailShareDraftChange, MailMultiThreadsChange mailMultiThreadsChange, MailMigrationChange mailMigrationChange, MailCreateShareChatGroupChange mailCreateShareChatGroupChange, MailSharePermissionCodeChange mailSharePermissionCodeChange, MailRecallDoneChange mailRecallDoneChange, MailRecalledChange mailRecalledChange, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(noOpChange, mailLabelChange, mailCacheInvalidChange, mailRefreshThreadChange, mailThreadChange, mailCollaboratorsChange, mailShareThreadChange, mailUnShareThreadChange, mailLabelPropertyChange, mailShareDraftChange, mailMultiThreadsChange, mailMigrationChange, mailCreateShareChatGroupChange, mailSharePermissionCodeChange, mailRecallDoneChange, mailRecalledChange) <= 1) {
            this.no_change = noOpChange;
            this.update_labels_change = mailLabelChange;
            this.cache_invalid_change = mailCacheInvalidChange;
            this.refresh_thread_change = mailRefreshThreadChange;
            this.thread_change = mailThreadChange;
            this.collaborators_change = mailCollaboratorsChange;
            this.share_thread_change = mailShareThreadChange;
            this.unshare_thread_change = mailUnShareThreadChange;
            this.label_property_change = mailLabelPropertyChange;
            this.share_draft_change = mailShareDraftChange;
            this.multi_threads_change = mailMultiThreadsChange;
            this.mail_migration_change = mailMigrationChange;
            this.create_share_chat_group_change = mailCreateShareChatGroupChange;
            this.share_permission_code_change = mailSharePermissionCodeChange;
            this.recall_done_change = mailRecallDoneChange;
            this.recalled_change = mailRecalledChange;
            return;
        }
        throw new IllegalArgumentException("at most one of no_change, update_labels_change, cache_invalid_change, refresh_thread_change, thread_change, collaborators_change, share_thread_change, unshare_thread_change, label_property_change, share_draft_change, multi_threads_change, mail_migration_change, create_share_chat_group_change, share_permission_code_change, recall_done_change, recalled_change may be non-null");
    }
}
