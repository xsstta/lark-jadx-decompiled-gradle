package com.ss.android.lark.feed.service.impl;

import android.util.Pair;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.feed.v1.FilterPushInfo;
import com.bytedance.lark.pb.feed.v1.PushFeedCursor;
import com.bytedance.lark.pb.feed.v1.PushFeedEntityPreviews;
import com.bytedance.lark.pb.feed.v1.PushFeedFilterSettings;
import com.bytedance.lark.pb.feed.v1.PushInboxCardsResponse;
import com.bytedance.lark.pb.feed.v1.PushLoadFeedCardsStatus;
import com.bytedance.lark.pb.feed.v1.PushStatistcsEventResponse;
import com.bytedance.lark.pb.feed.v1.PushThreadFeedAvatarChanges;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.chat.api.AbstractC32808a;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.dto.C38081a;
import com.ss.android.lark.feed.dto.C38082b;
import com.ss.android.lark.feed.interfaces.AbstractC38105n;
import com.ss.android.lark.feed.interfaces.AbstractC38106o;
import com.ss.android.lark.feed.interfaces.AbstractC38107p;
import com.ss.android.lark.feed.interfaces.AbstractC38108r;
import com.ss.android.lark.feed.interfaces.AbstractC38110t;
import com.ss.android.lark.feed.interfaces.AbstractC38112v;
import com.ss.android.lark.feed.interfaces.IPushFeedEntityPreviewListener;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.feed.service.impl.e */
public class C38128e {

    /* renamed from: a */
    public List<AbstractC38106o> f97767a;

    /* renamed from: b */
    public List<AbstractC38107p> f97768b;

    /* renamed from: c */
    public List<IPushFeedEntityPreviewListener> f97769c;

    /* renamed from: d */
    public List<AbstractC38110t> f97770d;

    /* renamed from: e */
    public List<AbstractC38105n> f97771e;

    /* renamed from: f */
    public List<Object> f97772f;

    /* renamed from: g */
    public List<AbstractC38112v> f97773g;

    /* renamed from: h */
    public List<AbstractC38108r> f97774h;

    /* renamed from: i */
    private AbstractC32808a f97775i;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.feed.service.impl.e$a */
    public static class C38145a {

        /* renamed from: a */
        public static final C38128e f97812a = new C38128e();
    }

    /* renamed from: a */
    public static final C38128e m149952a() {
        return C38145a.f97812a;
    }

    /* renamed from: a */
    public void mo139481a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            PushInboxCardsResponse decode = PushInboxCardsResponse.ADAPTER.decode(bArr);
            final JSONObject jSONObject = new JSONObject();
            jSONObject.put("params_feed_preview_update_info", (Object) new C38166k(C38159h.m150025a(decode.update_entity_previews), C38127c.m149947b(decode.remove_previews)));
            jSONObject.put("key_param_feed_delayed_count", (Object) decode.delayed_channel_count);
            jSONObject.put("key_param_feed_badge_count", (Object) decode.unread_count);
            jSONObject.put("key_param_feed_filtered_badge_count", (Object) decode.filtered_unread_count);
            jSONObject.put("key_param_feed_mute_badge_count", (Object) decode.mute_unread_count);
            jSONObject.put("key_param_feed_mute_filtered_badge_count", (Object) decode.filtered_mute_unread_count);
            jSONObject.put("key_param_feed_badge_has_reddot", (Object) decode.has_unread_dot);
            jSONObject.put("key_param_feed_update_filter_list", (Object) C38159h.m150029c(decode.update_filter_list));
            List<C38081a> d = C38159h.m150030d(decode.update_filter_infos);
            jSONObject.put("key_param_feed_update_filter_infos", (Object) d);
            if (d != null) {
                for (C38081a aVar : d) {
                    if (aVar.mo139383a() == FeedFilter.INBOX) {
                        int b = aVar.mo139384b();
                        int c = aVar.mo139385c();
                        jSONObject.put("key_param_feed_filtered_badge_count", (Object) Integer.valueOf(b));
                        jSONObject.put("key_param_feed_badge_count", (Object) Integer.valueOf(b));
                        jSONObject.put("key_param_feed_mute_filtered_badge_count", (Object) Integer.valueOf(c));
                        jSONObject.put("key_param_feed_mute_badge_count", (Object) Integer.valueOf(c));
                        jSONObject.put("key_param_feed_badge_has_reddot", (Object) Boolean.valueOf(c > 0));
                    } else if (aVar.mo139383a() == FeedFilter.DELAYED) {
                        jSONObject.put("key_param_feed_delayed_count", (Object) Integer.valueOf(aVar.mo139384b()));
                    }
                }
            }
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                /* class com.ss.android.lark.feed.service.impl.C38128e.RunnableC381416 */

                public void run() {
                    for (AbstractC38106o oVar : C38128e.this.f97767a) {
                        oVar.mo137401a(jSONObject);
                    }
                }
            });
        } catch (Exception e) {
            Log.m165387e(e.getMessage(), (Throwable) e, true);
        }
    }

    private C38128e() {
        this.f97767a = new CopyOnWriteArrayList();
        this.f97768b = new CopyOnWriteArrayList();
        this.f97769c = new CopyOnWriteArrayList();
        this.f97770d = new CopyOnWriteArrayList();
        this.f97771e = new CopyOnWriteArrayList();
        this.f97772f = new CopyOnWriteArrayList();
        this.f97773g = new CopyOnWriteArrayList();
        this.f97774h = new CopyOnWriteArrayList();
        this.f97775i = C37268c.m146766b().mo139154A().mo139234a();
    }

    /* renamed from: a */
    public void mo139473a(AbstractC38105n nVar) {
        m149953a(this.f97771e, nVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.feed.service.impl.C38128e.AnonymousClass21 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181697a(Command.PUSH_LOAD_FEED_CARDS_STATUS, new C53248k.AbstractC53250a() {
                    /* class com.ss.android.lark.feed.service.impl.C38128e.AnonymousClass21.C381361 */

                    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                        C38128e.this.mo139492e(bArr, str, z, z2);
                    }
                });
            }
        });
    }

    /* renamed from: b */
    public void mo139482b(AbstractC38105n nVar) {
        m149954b(this.f97771e, nVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.feed.service.impl.C38128e.C381352 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181696a(Command.PUSH_LOAD_FEED_CARDS_STATUS);
            }
        });
    }

    /* renamed from: a */
    public void mo139474a(AbstractC38106o oVar) {
        m149953a(this.f97767a, oVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.feed.service.impl.C38128e.C381291 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181697a(Command.PUSH_INBOX_CARDS, new C53248k.AbstractC53250a() {
                    /* class com.ss.android.lark.feed.service.impl.C38128e.C381291.C381301 */

                    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                        C38128e.this.mo139481a(bArr, str, z, z2);
                    }
                });
            }
        });
    }

    /* renamed from: b */
    public void mo139483b(AbstractC38106o oVar) {
        m149954b(this.f97767a, oVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.feed.service.impl.C38128e.C381449 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181696a(Command.PUSH_INBOX_CARDS);
            }
        });
    }

    /* renamed from: a */
    public void mo139475a(AbstractC38107p pVar) {
        m149953a(this.f97768b, pVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.feed.service.impl.C38128e.AnonymousClass15 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181697a(Command.PUSH_FEED_CURSOR, new C53248k.AbstractC53250a() {
                    /* class com.ss.android.lark.feed.service.impl.C38128e.AnonymousClass15.C381321 */

                    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                        C38128e.this.mo139490c(bArr, str, z, z2);
                    }
                });
            }
        });
    }

    /* renamed from: b */
    public void mo139484b(AbstractC38107p pVar) {
        m149954b(this.f97768b, pVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.feed.service.impl.C38128e.AnonymousClass16 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181696a(Command.PUSH_FEED_CURSOR);
            }
        });
    }

    /* renamed from: a */
    public void mo139476a(IPushFeedEntityPreviewListener qVar) {
        m149953a(this.f97769c, qVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.feed.service.impl.C38128e.AnonymousClass17 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181697a(Command.PUSH_FEED_ENTITY_PREVIEWS, new C53248k.AbstractC53250a() {
                    /* class com.ss.android.lark.feed.service.impl.C38128e.AnonymousClass17.C381331 */

                    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                        C38128e.this.mo139491d(bArr, str, z, z2);
                    }
                });
            }
        });
    }

    /* renamed from: b */
    public void mo139485b(IPushFeedEntityPreviewListener qVar) {
        m149954b(this.f97769c, qVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.feed.service.impl.C38128e.AnonymousClass18 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181696a(Command.PUSH_FEED_ENTITY_PREVIEWS);
            }
        });
    }

    /* renamed from: a */
    public void mo139477a(AbstractC38108r rVar) {
        m149953a(this.f97774h, rVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.feed.service.impl.C38128e.C381373 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181697a(Command.PUSH_FEED_FILTER_SETTINGS, new C53248k.AbstractC53250a() {
                    /* class com.ss.android.lark.feed.service.impl.C38128e.C381373.C381381 */

                    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                        C38128e.this.mo139480a(bArr);
                    }
                });
            }
        });
    }

    /* renamed from: b */
    public void mo139486b(AbstractC38108r rVar) {
        m149954b(this.f97774h, rVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.feed.service.impl.C38128e.C381394 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181696a(Command.PUSH_FEED_FILTER_SETTINGS);
            }
        });
    }

    /* renamed from: a */
    public void mo139478a(AbstractC38110t tVar) {
        m149953a(this.f97770d, tVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.feed.service.impl.C38128e.AnonymousClass19 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181697a(Command.PUSH_STATISTICS_DATA, new C53248k.AbstractC53250a() {
                    /* class com.ss.android.lark.feed.service.impl.C38128e.AnonymousClass19.C381341 */

                    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                        C38128e.this.mo139489b(bArr, str, z, z2);
                    }
                });
            }
        });
    }

    /* renamed from: b */
    public void mo139487b(AbstractC38110t tVar) {
        m149954b(this.f97770d, tVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.feed.service.impl.C38128e.AnonymousClass20 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181696a(Command.PUSH_STATISTICS_DATA);
            }
        });
    }

    /* renamed from: a */
    public void mo139479a(AbstractC38112v vVar) {
        m149953a(this.f97773g, vVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.feed.service.impl.C38128e.AnonymousClass12 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181697a(Command.PUSH_THREAD_FEED_AVATAR_CHANGES, new C53248k.AbstractC53250a() {
                    /* class com.ss.android.lark.feed.service.impl.C38128e.AnonymousClass12.C381311 */

                    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                        C38128e.this.mo139493f(bArr, str, z, z2);
                    }
                });
            }
        });
    }

    /* renamed from: b */
    public void mo139488b(AbstractC38112v vVar) {
        m149954b(this.f97773g, vVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.feed.service.impl.C38128e.AnonymousClass13 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181696a(Command.PUSH_THREAD_FEED_AVATAR_CHANGES);
            }
        });
    }

    /* renamed from: a */
    public void mo139480a(byte[] bArr) {
        try {
            PushFeedFilterSettings decode = PushFeedFilterSettings.ADAPTER.decode(bArr);
            final C38082b bVar = new C38082b(decode.filter_enable.booleanValue(), decode.show_at_all_in_at_filter.booleanValue(), decode.version.longValue(), C38159h.m150030d(decode.used_filter_infos), decode.show_mute.booleanValue());
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                /* class com.ss.android.lark.feed.service.impl.C38128e.RunnableC381405 */

                public void run() {
                    for (AbstractC38108r rVar : C38128e.this.f97774h) {
                        rVar.mo138557a(bVar);
                    }
                }
            });
        } catch (Exception e) {
            Log.m165387e(e.getMessage(), (Throwable) e, true);
        }
    }

    /* renamed from: a */
    private static <T> void m149953a(List<T> list, T t, C53246j.AbstractC53247a aVar) {
        if (t != null) {
            C53246j.m205910a(list, t, aVar);
        }
    }

    /* renamed from: b */
    private static <T> void m149954b(List<T> list, T t, C53246j.AbstractC53247a aVar) {
        if (t != null) {
            C53246j.m205911b(list, t, aVar);
        }
    }

    /* renamed from: e */
    public void mo139492e(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            PushLoadFeedCardsStatus decode = PushLoadFeedCardsStatus.ADAPTER.decode(bArr);
            final FeedCard.FeedType valueOf = FeedCard.FeedType.valueOf(decode.feed_type.getValue());
            final Status valueOf2 = Status.valueOf(decode.status.getValue());
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                /* class com.ss.android.lark.feed.service.impl.C38128e.AnonymousClass11 */

                public void run() {
                    for (AbstractC38105n nVar : C38128e.this.f97771e) {
                        nVar.mo138556a(valueOf, valueOf2);
                    }
                }
            });
        } catch (Exception e) {
            Log.m165387e(e.getMessage(), (Throwable) e, true);
        }
    }

    /* renamed from: c */
    public void mo139490c(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            PushFeedCursor decode = PushFeedCursor.ADAPTER.decode(bArr);
            final JSONObject jSONObject = new JSONObject();
            if (decode.feed_card_id != null) {
                jSONObject.put("key_param_feed_cursor_load_box_id", (Object) decode.feed_card_id);
            }
            jSONObject.put("key_param_feed_cursor_load_cursor", (Object) new C38126b(decode.cursor.min_cursor.longValue(), decode.cursor.max_cursor.longValue()));
            jSONObject.put("key_param_feed_cursor_load_count", (Object) decode.count);
            jSONObject.put("params_feed_type", (Object) FeedCard.FeedType.valueOf(decode.feed_type.getValue()));
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                /* class com.ss.android.lark.feed.service.impl.C38128e.RunnableC381438 */

                public void run() {
                    for (AbstractC38107p pVar : C38128e.this.f97768b) {
                        pVar.mo137416a(jSONObject);
                    }
                }
            });
        } catch (Exception e) {
            Log.m165387e(e.getMessage(), (Throwable) e, true);
        }
    }

    /* renamed from: f */
    public void mo139493f(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            PushThreadFeedAvatarChanges decode = PushThreadFeedAvatarChanges.ADAPTER.decode(bArr);
            if (decode == null) {
                return;
            }
            if (!CollectionUtils.isEmpty(decode.avatars)) {
                for (Map.Entry<String, PushThreadFeedAvatarChanges.Avatar> entry : decode.avatars.entrySet()) {
                    if (entry != null) {
                        final JSONObject jSONObject = new JSONObject();
                        jSONObject.put("key_param_thread_feed_avatar_key", (Object) entry.getValue().avatar_key);
                        jSONObject.put("key_param_thread_feed_chat_id", (Object) entry.getKey());
                        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                            /* class com.ss.android.lark.feed.service.impl.C38128e.AnonymousClass14 */

                            public void run() {
                                for (AbstractC38112v vVar : C38128e.this.f97773g) {
                                    vVar.mo137525a(jSONObject);
                                }
                            }
                        });
                    }
                }
            }
        } catch (Exception e) {
            Log.m165387e(e.getMessage(), (Throwable) e, true);
        }
    }

    /* renamed from: d */
    public void mo139491d(byte[] bArr, String str, boolean z, boolean z2) {
        boolean z3;
        try {
            PushFeedEntityPreviews decode = PushFeedEntityPreviews.ADAPTER.decode(bArr);
            final JSONObject jSONObject = new JSONObject();
            Pair<List<FeedPreviewInfo>, Map<String, List<FeedFilter>>> b = C38159h.m150026b(decode.updated_feeds);
            C38166k kVar = new C38166k((List) b.first, decode.removed_feeds);
            Map<Integer, FilterPushInfo> map = decode.filters_info;
            jSONObject.put("params_feed_preview_update_info", (Object) kVar);
            jSONObject.put("key_param_feed_update_filter_list", (Object) ((Map) b.second));
            jSONObject.put("key_param_feed_update_filter_infos", (Object) map);
            if (map != null) {
                FilterPushInfo filterPushInfo = map.get(Integer.valueOf(FeedFilter.INBOX.getValue()));
                if (filterPushInfo != null) {
                    int intValue = filterPushInfo.unread.intValue();
                    int intValue2 = filterPushInfo.mute_unread.intValue();
                    jSONObject.put("key_param_feed_filtered_badge_count", (Object) Integer.valueOf(intValue));
                    jSONObject.put("key_param_feed_badge_count", (Object) Integer.valueOf(intValue));
                    jSONObject.put("key_param_feed_mute_filtered_badge_count", (Object) Integer.valueOf(intValue2));
                    jSONObject.put("key_param_feed_mute_badge_count", (Object) Integer.valueOf(intValue2));
                    if (intValue2 > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    jSONObject.put("key_param_feed_badge_has_reddot", (Object) Boolean.valueOf(z3));
                }
                FilterPushInfo filterPushInfo2 = map.get(Integer.valueOf(FeedFilter.DELAYED.getValue()));
                if (filterPushInfo2 != null) {
                    jSONObject.put("key_param_feed_delayed_count", (Object) filterPushInfo2.unread);
                }
            }
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                /* class com.ss.android.lark.feed.service.impl.C38128e.AnonymousClass10 */

                public void run() {
                    for (IPushFeedEntityPreviewListener qVar : C38128e.this.f97769c) {
                        qVar.mo137415a(jSONObject);
                    }
                }
            });
        } catch (Exception e) {
            Log.m165387e(e.getMessage(), (Throwable) e, true);
        }
    }

    /* renamed from: b */
    public void mo139489b(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            final PushStatisticsEvent a = C38127c.m149943a(PushStatistcsEventResponse.ADAPTER.decode(bArr));
            List<AbstractC38110t> list = this.f97770d;
            if (list == null) {
                if (!list.isEmpty()) {
                    Log.m165382e("sObserver is empty and onPushStatisticsEvent ");
                    return;
                }
            }
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                /* class com.ss.android.lark.feed.service.impl.C38128e.RunnableC381427 */

                public void run() {
                    for (AbstractC38110t tVar : C38128e.this.f97770d) {
                        tVar.mo138555a(a);
                    }
                }
            });
        } catch (Exception e) {
            Log.m165387e(e.getMessage(), (Throwable) e, true);
        }
    }
}
