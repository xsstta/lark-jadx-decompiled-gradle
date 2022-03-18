package com.ss.android.lark.mail.impl.service.p2215a;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.email.v1.MailCacheInvalidChange;
import com.bytedance.lark.pb.email.v1.MailChangePushResponse;
import com.bytedance.lark.pb.email.v1.MailLabelChange;
import com.bytedance.lark.pb.email.v1.MailMultiThreadsChange;
import com.bytedance.lark.pb.email.v1.MailRefreshThreadChange;
import com.bytedance.lark.pb.email.v1.MailThreadChange;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.entity.MigrationStage;
import com.ss.android.lark.mail.impl.p2168g.p2169a.C42130j;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43315b;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43316c;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43317d;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43321h;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43326m;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43327n;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43328o;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43335w;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43337y;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43338z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.compress.p3493a.C69755i;

/* renamed from: com.ss.android.lark.mail.impl.service.a.b */
public class C43293b extends AbstractC43286a {

    /* renamed from: a */
    private static boolean f110146a;

    @Override // com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a
    /* renamed from: c */
    public boolean mo154971c() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a
    /* renamed from: d */
    public boolean mo154972d() {
        return true;
    }

    /* renamed from: e */
    public static boolean m171995e() {
        return f110146a;
    }

    @Override // com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a
    /* renamed from: b */
    public Command mo154970b() {
        return Command.MAIL_CHANGE_PUSH;
    }

    @Override // com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a
    /* renamed from: a */
    public void mo154969a(byte[] bArr, String str, boolean z, boolean z2) {
        List<String> list;
        try {
            MailChangePushResponse decode = MailChangePushResponse.ADAPTER.decode(bArr);
            if (decode != null) {
                f110146a = true;
                if (decode.multi_threads_change instanceof MailMultiThreadsChange) {
                    Log.m165389i("DetailChangeHandler", "loadData onPush MailMultiThreadsChange");
                    MailMultiThreadsChange mailMultiThreadsChange = decode.multi_threads_change;
                    if (!(mailMultiThreadsChange == null || mailMultiThreadsChange.label_2_threads == null)) {
                        String q = C43374f.m172264f().mo155129q();
                        MailMultiThreadsChange.AffectedThreads affectedThreads = mailMultiThreadsChange.label_2_threads.get(q);
                        if (affectedThreads == null || !affectedThreads.need_reload.booleanValue()) {
                            Log.m165389i("DetailChangeHandler", "loadData onPush MailMultiThreadsChange : change, has filter change = " + mailMultiThreadsChange.has_filter_threads);
                            AbstractC43338z zVar = (AbstractC43338z) Watchers.m167205a(AbstractC43338z.class);
                            if (affectedThreads != null) {
                                list = affectedThreads.thread_ids;
                            } else {
                                list = null;
                            }
                            zVar.mo152867a(q, list, mailMultiThreadsChange.has_filter_threads.booleanValue());
                        } else {
                            Log.m165389i("DetailChangeHandler", "loadData onPush MailMultiThreadsChange : reload");
                            ((AbstractC43338z) Watchers.m167205a(AbstractC43338z.class)).mo152901y();
                        }
                        MailMultiThreadsChange.AffectedThreads affectedThreads2 = mailMultiThreadsChange.label_2_threads.get("IMPORTANT");
                        if (!(affectedThreads2 == null || affectedThreads2.thread_ids == null || affectedThreads2.thread_ids.size() <= 0)) {
                            ((AbstractC43335w) Watchers.m167205a(AbstractC43335w.class)).mo153324a("IMPORTANT");
                        }
                        MailMultiThreadsChange.AffectedThreads affectedThreads3 = mailMultiThreadsChange.label_2_threads.get("OTHER");
                        if (!(affectedThreads3 == null || affectedThreads3.thread_ids == null || affectedThreads3.thread_ids.size() <= 0)) {
                            ((AbstractC43335w) Watchers.m167205a(AbstractC43335w.class)).mo153324a("OTHER");
                        }
                        MailMultiThreadsChange.AffectedThreads affectedThreads4 = mailMultiThreadsChange.label_2_threads.get("DRAFT");
                        if (affectedThreads4 != null) {
                            if (affectedThreads4.need_reload.booleanValue()) {
                                ((AbstractC43315b) Watchers.m167205a(AbstractC43315b.class)).mo150869l();
                            } else {
                                ((AbstractC43315b) Watchers.m167205a(AbstractC43315b.class)).mo150851a(affectedThreads4.thread_ids);
                            }
                        }
                        ArrayList a = C69755i.m267727a();
                        Iterator<String> it = mailMultiThreadsChange.label_2_threads.keySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            MailMultiThreadsChange.AffectedThreads affectedThreads5 = mailMultiThreadsChange.label_2_threads.get(it.next());
                            if (affectedThreads5.need_reload.booleanValue()) {
                                a = C69755i.m267727a();
                                ((AbstractC43328o) Watchers.m167205a(AbstractC43328o.class)).ah();
                                break;
                            }
                            a.addAll(affectedThreads5.thread_ids);
                        }
                        if (a.size() > 0) {
                            ((AbstractC43328o) Watchers.m167205a(AbstractC43328o.class)).mo154549c(a);
                        }
                    }
                } else if (decode.cache_invalid_change instanceof MailCacheInvalidChange) {
                    Log.m165389i("DetailChangeHandler", "loadData onPush MailCacheInvalidChange");
                    if (decode.cache_invalid_change != null) {
                        ((AbstractC43337y) Watchers.m167205a(AbstractC43337y.class)).mo152896t();
                    }
                } else if (decode.update_labels_change instanceof MailLabelChange) {
                    Log.m165389i("DetailChangeHandler", "loadData onPush MailLabelChange");
                    MailLabelChange mailLabelChange = decode.update_labels_change;
                    if (mailLabelChange.labels != null) {
                        ((AbstractC43316c) Watchers.m167205a(AbstractC43316c.class)).mo154985a(C42130j.m168150a().mo152088d(mailLabelChange.labels));
                    }
                } else if (decode.refresh_thread_change instanceof MailRefreshThreadChange) {
                    Log.m165389i("DetailChangeHandler", "loadData onPush MailRefreshThreadChange");
                    MailRefreshThreadChange mailRefreshThreadChange = decode.refresh_thread_change;
                    if (mailRefreshThreadChange != null) {
                        ((AbstractC43338z) Watchers.m167205a(AbstractC43338z.class)).mo152901y();
                        ((AbstractC43328o) Watchers.m167205a(AbstractC43328o.class)).ah();
                        if ("DRAFT".equals(mailRefreshThreadChange.label_id)) {
                            ((AbstractC43315b) Watchers.m167205a(AbstractC43315b.class)).mo150869l();
                        }
                    }
                } else if (decode.thread_change instanceof MailThreadChange) {
                    MailThreadChange mailThreadChange = decode.thread_change;
                    if (mailThreadChange != null) {
                        ((AbstractC43337y) Watchers.m167205a(AbstractC43337y.class)).mo152868a(mailThreadChange.label_ids, mailThreadChange.thread_id);
                        ArrayList a2 = C69755i.m267727a();
                        a2.add(mailThreadChange.thread_id);
                        ((AbstractC43328o) Watchers.m167205a(AbstractC43328o.class)).mo154549c(a2);
                        if (mailThreadChange.label_ids != null && mailThreadChange.label_ids.size() > 0) {
                            for (int i = 0; i < mailThreadChange.label_ids.size(); i++) {
                                String str2 = mailThreadChange.label_ids.get(i);
                                if ("IMPORTANT".equals(str2)) {
                                    ((AbstractC43335w) Watchers.m167205a(AbstractC43335w.class)).mo153324a("IMPORTANT");
                                }
                                if ("OTHER".equals(str2)) {
                                    ((AbstractC43335w) Watchers.m167205a(AbstractC43335w.class)).mo153324a("OTHER");
                                }
                                if ("DRAFT".equals(str2)) {
                                    ((AbstractC43315b) Watchers.m167205a(AbstractC43315b.class)).mo150851a(Collections.singletonList(mailThreadChange.thread_id));
                                }
                            }
                        }
                    }
                } else if (decode.share_thread_change != null) {
                    C43303h.m172021a(decode.share_thread_change);
                } else if (decode.unshare_thread_change != null) {
                    C43303h.m172022a(decode.unshare_thread_change);
                } else if (decode.share_draft_change != null) {
                    C43303h.m172019a(decode.share_draft_change);
                } else if (decode.collaborators_change != null) {
                    C43303h.m172018a(decode.collaborators_change);
                } else if (decode.share_permission_code_change != null) {
                    C43303h.m172020a(decode.share_permission_code_change);
                } else if (decode.label_property_change != null) {
                    MailLabelEntity a3 = C42130j.m168150a().mo152079a(decode.label_property_change.label);
                    if (a3 != null) {
                        if (decode.label_property_change.is_delete.booleanValue()) {
                            ((AbstractC43338z) Watchers.m167205a(AbstractC43338z.class)).mo152901y();
                            ((AbstractC43328o) Watchers.m167205a(AbstractC43328o.class)).ah();
                        }
                        ((AbstractC43317d) Watchers.m167205a(AbstractC43317d.class)).mo152676a(a3, decode.label_property_change.is_delete.booleanValue());
                    }
                } else if (decode.mail_migration_change != null) {
                    ((AbstractC43321h) Watchers.m167205a(AbstractC43321h.class)).onMigrationChange(MigrationStage.convertToStage(decode.mail_migration_change.stage.intValue()), decode.mail_migration_change.progress_pct.intValue());
                } else if (decode.recall_done_change != null) {
                    ((AbstractC43326m) Watchers.m167205a(AbstractC43326m.class)).mo154444a(decode.recall_done_change);
                } else if (decode.recalled_change != null) {
                    ((AbstractC43327n) Watchers.m167205a(AbstractC43327n.class)).mo154470j(decode.recalled_change.message_id);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
