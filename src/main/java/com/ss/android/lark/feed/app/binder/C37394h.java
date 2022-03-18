package com.ss.android.lark.feed.app.binder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.p017a.p018a.C0215a;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.component.ui.avatar.AvatarModel;
import com.larksuite.component.ui.avatar.v2.LarkAvatarView;
import com.larksuite.component.ui.badge.miniicon.MiniIconModel;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.samskivert.mustache.C27035d;
import com.samskivert.mustache.C27059e;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.desktopmode.view.C36592a;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.app.AbstractC37628k;
import com.ss.android.lark.feed.app.C37537e;
import com.ss.android.lark.feed.app.binder.C37414l;
import com.ss.android.lark.feed.app.binder.p1857a.AbstractC37378c;
import com.ss.android.lark.feed.app.binder.p1857a.C37375b;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.IBadgeable;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.filter.C37548b;
import com.ss.android.lark.feed.app.hitpoint.FeedShortcutHitPoint;
import com.ss.android.lark.feed.app.model.p1863c.C37710a;
import com.ss.android.lark.feed.app.model.p1863c.C37712c;
import com.ss.android.lark.feed.app.p1849b.AbstractC37305b;
import com.ss.android.lark.feed.app.view.C37968c;
import com.ss.android.lark.feed.app.view.FeedListAdapter;
import com.ss.android.lark.feed.interfaces.AbstractC38087ab;
import com.ss.android.lark.feed.p1847a.C37264a;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.p2932c.AbstractC58347e;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.feed.app.binder.h */
public class C37394h<T extends FeedPreview> implements AbstractC37406i<T, C37968c, AbstractC37628k>, C37968c.AbstractC37969a {

    /* renamed from: b */
    public static boolean f95936b = f95937c.mo139299b();

    /* renamed from: c */
    static AbstractC38037a.AbstractC38062v f95937c = C37268c.m146766b().mo139203v();

    /* renamed from: j */
    private static C27059e f95938j = C27035d.m98270a().mo96184a(false).mo96186a(UIUtils.getString(LarkContext.getApplication(), R.string.Lark_Legacy_UnReadCount));

    /* renamed from: k */
    private static C27059e f95939k = C27035d.m98270a().mo96184a(false).mo96186a(UIUtils.getString(LarkContext.getApplication(), R.string.Lark_Legacy_UnReadCounts));

    /* renamed from: l */
    private static final boolean f95940l = C37262a.m146726a().mo139198q().mo139256a("lark.feed.load_avatar.async");

    /* renamed from: a */
    private C37968c f95941a;

    /* renamed from: d */
    Context f95942d = C37268c.m146766b().mo139170a();

    /* renamed from: e */
    public C37375b<T> f95943e;

    /* renamed from: f */
    public C36592a f95944f;

    /* renamed from: g */
    public Handler f95945g;

    /* renamed from: h */
    private T f95946h;

    /* renamed from: i */
    private AbstractC37628k f95947i;

    /* renamed from: m */
    private final boolean f95948m = C37262a.m146726a().mo139157D().mo139310a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public MiniIconModel mo137258b(FeedPreview feedPreview) {
        return null;
    }

    /* renamed from: b */
    public C37968c mo137224a(LayoutInflater layoutInflater, ViewGroup viewGroup, AbstractC37305b bVar) {
        return null;
    }

    @Override // com.ss.android.lark.feed.app.view.C37968c.AbstractC37969a
    /* renamed from: c */
    public void mo137279c() {
    }

    /* renamed from: a */
    public void mo137226a(final C37968c cVar, final T t, AbstractC37628k kVar, int i) {
        this.f95941a = cVar;
        this.f95946h = t;
        this.f95947i = kVar;
        mo137257a(cVar);
        mo137247b(cVar, t);
        mo137280f(cVar, t);
        mo137248c(cVar, t);
        mo137246a(cVar, t);
        mo137249d(cVar, t);
        mo137260e(cVar, t);
        m147192h(cVar, t);
        C37537e.m147608a(cVar.itemView, t, i);
        final FeedListAdapter.AbstractC37934i a = kVar.mo138034a();
        cVar.f97477b.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.feed.app.binder.C37394h.C373962 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                FeedPreview feedPreview;
                cVar.f97476a.setHovered(false);
                FeedListAdapter.AbstractC37934i iVar = a;
                if (iVar != null && (feedPreview = t) != null) {
                    iVar.mo138951b(cVar, feedPreview);
                }
            }
        });
        m147188a(cVar, t, kVar);
        cVar.f97477b.setBackgroundResource(R.drawable.feed_item_selector_bg);
        if (cVar.f97481f != null) {
            final FeedListAdapter.AbstractC37929d e = kVar.mo138038e();
            if (e == null) {
                cVar.f97481f.setEnabled(false);
            } else {
                cVar.f97481f.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.feed.app.binder.C37394h.View$OnClickListenerC373973 */

                    public void onClick(View view) {
                        e.mo137502a(cVar);
                    }
                });
                cVar.f97481f.setOnHoverListener(new View.OnHoverListener() {
                    /* class com.ss.android.lark.feed.app.binder.C37394h.View$OnHoverListenerC373984 */

                    public boolean onHover(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 9) {
                            cVar.f97477b.setBackgroundResource(R.drawable.bg_item_hovered);
                            if (C37394h.this.f95945g == null) {
                                C37394h.this.f95945g = new Handler(Looper.getMainLooper());
                            }
                            C37394h.this.f95945g.postDelayed(new Runnable() {
                                /* class com.ss.android.lark.feed.app.binder.C37394h.View$OnHoverListenerC373984.RunnableC373991 */

                                public void run() {
                                    if (cVar.f97481f.isHovered()) {
                                        if (C37394h.this.f95944f == null) {
                                            C37394h.this.f95944f = new C36592a.C36593a().mo135002a(C37394h.this.f95942d.getString(R.string.Lark_Legacy_Completed)).mo135003a(C37394h.this.f95942d);
                                        }
                                        C37394h.this.f95944f.mo134997a(cVar.f97481f, 0, 6);
                                    }
                                }
                            }, 200);
                            return false;
                        } else if (motionEvent.getAction() != 10) {
                            return false;
                        } else {
                            cVar.f97477b.setBackgroundResource(R.drawable.item_bg_selector_c11);
                            if (C37394h.this.f95945g != null) {
                                C37394h.this.f95945g.removeCallbacksAndMessages(null);
                            }
                            if (C37394h.this.f95944f == null) {
                                return false;
                            }
                            C37394h.this.f95944f.dismiss();
                            return false;
                        }
                    }
                });
            }
        }
        m147190b(cVar, t, kVar);
        cVar.mo139026a(this);
    }

    @Override // com.ss.android.lark.feed.app.view.C37968c.AbstractC37969a
    /* renamed from: b */
    public void mo137278b() {
        m147188a(this.f95941a, this.f95946h, this.f95947i);
    }

    /* renamed from: a */
    public static void m147187a() {
        f95938j = C27035d.m98270a().mo96184a(false).mo96186a(UIUtils.getString(LarkContext.getApplication(), R.string.Lark_Legacy_UnReadCount));
        f95939k = C27035d.m98270a().mo96184a(false).mo96186a(UIUtils.getString(LarkContext.getApplication(), R.string.Lark_Legacy_UnReadCounts));
    }

    static {
        C37268c.m146767c().mo139330a(new AbstractC38087ab() {
            /* class com.ss.android.lark.feed.app.binder.C37394h.C373951 */

            @Override // com.ss.android.lark.feed.interfaces.AbstractC38087ab
            /* renamed from: a */
            public void mo137283a(boolean z) {
            }

            @Override // com.ss.android.lark.feed.interfaces.AbstractC38087ab
            /* renamed from: a */
            public void mo137282a() {
                C37394h.f95936b = C37394h.f95937c.mo139299b();
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.feed.app.binder.h$9 */
    public static /* synthetic */ class C374059 {

        /* renamed from: a */
        static final /* synthetic */ int[] f95973a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 217
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.feed.app.binder.C37394h.C374059.<clinit>():void");
        }
    }

    /* renamed from: c */
    private boolean m147191c(FeedPreview feedPreview) {
        if (C37548b.m147657a().mo137792b() != FeedFilter.MESSAGE || feedPreview.isRemind()) {
            return false;
        }
        return true;
    }

    public C37394h(AbstractC37378c<T> cVar) {
        this.f95943e = new C37375b<>(this.f95942d, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo137259b(C37968c cVar) {
        cVar.f97476a.setFeedTagTV(8, -1, -1, -1);
        cVar.f97476a.setZenModeIV(8);
        cVar.f97476a.setSecretTagIV(8);
        cVar.f97476a.setBotTag(8);
        cVar.f97476a.setOnCallTagIV(8, false);
        cVar.f97476a.setThreadIconVisibility(8);
        cVar.f97476a.setCustomStatus(null);
    }

    /* renamed from: a */
    private boolean m147189a(UIFeedCard uIFeedCard) {
        if (!C37264a.m146753b()) {
            return false;
        }
        if (uIFeedCard.getType() == FeedCard.Type.CHAT || uIFeedCard.getType() == FeedCard.Type.APP || uIFeedCard.getType() == FeedCard.Type.OPEN_APP_CHAT || uIFeedCard.getType() == FeedCard.Type.DOC || uIFeedCard.getType() == FeedCard.Type.SUBSCRIPTION) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AvatarModel mo137256a(FeedPreview feedPreview) {
        Drawable b = C37710a.m148265b(feedPreview.getAvatarKey());
        if (b == null) {
            C37710a.m148263a(feedPreview.getAvatarKey());
        }
        return new AvatarModel.Builder().mo88962a(feedPreview.getAvatarKey()).mo88967b(feedPreview.getAvatarId()).mo88959a(AvatarModel.Size.MIDDLE).mo88958a(b).mo88963a(f95940l).mo88960a(Biz.Messenger).mo88961a(Scene.Feed).mo88976k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo137257a(C37968c cVar) {
        cVar.f97476a.setFeedTagTV(8, -1, -1, -1);
        cVar.f97476a.setBotTag(8);
        cVar.f97476a.setLastMessageMark(8, 0);
        cVar.f97476a.setMarkTv(8, 0, "");
        cVar.f97476a.getMarkTipIVContainer().setVisibility(8);
    }

    /* renamed from: h */
    private void m147192h(C37968c cVar, T t) {
        cVar.f97476a.setCustomStatus(t.getCustomStatusIconKey());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo137260e(C37968c cVar, FeedPreview feedPreview) {
        cVar.f97476a.setLastChatTime(0, C37712c.m148279b(feedPreview));
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo137281g(C37968c cVar, FeedPreview feedPreview) {
        if (!DesktopUtil.m144301a(this.f95942d) || feedPreview.getMutexMarkType() != FeedPreview.MutexMarkType.DRAFT || !cVar.itemView.isSelected()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo137249d(C37968c cVar, FeedPreview feedPreview) {
        boolean z;
        if (feedPreview.getFeedType() == FeedCard.FeedType.DONE) {
            z = true;
        } else {
            z = false;
        }
        C37414l.C37415a a = C37414l.m147241a((IBadgeable) feedPreview, z, false, false);
        cVar.f97476a.setBadge(a.mo137306d(), a.mo137304c(), a.mo137302b(), a.mo137298a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo137280f(C37968c cVar, FeedPreview feedPreview) {
        boolean g = mo137281g(cVar, feedPreview);
        cVar.f97476a.setReactions(feedPreview.getReactions(g), feedPreview.getReactionDisplayCount(g), feedPreview.getReactionCount(g), cVar.f97483h);
        if (!CollectionUtils.isEmpty(feedPreview.getReactions(g))) {
            cVar.f97476a.setLastMessageMark(8, 0);
        }
    }

    /* renamed from: i */
    private void m147193i(C37968c cVar, FeedPreview feedPreview) {
        Log.m165378d("set Delayed bindMark = " + feedPreview.isDelayed());
        if (feedPreview.isDelayed()) {
            cVar.mo139028b(this.f95942d.getString(R.string.Lark_Legacy_RemoveMark));
            cVar.mo139035f(R.drawable.ud_icon_resolve_outlined);
        } else {
            cVar.mo139028b(this.f95942d.getString(R.string.Lark_Legacy_MarkForLater));
            cVar.mo139035f(R.drawable.ud_icon_later_outlined);
        }
        if (feedPreview.isShortCut()) {
            cVar.mo139033e(R.drawable.ud_icon_set_top_cancel_outlined);
            cVar.mo139027a(UIHelper.getString(R.string.Lark_Chat_FeedClickTipsUnpin));
            return;
        }
        cVar.mo139033e(R.drawable.ud_icon_set_top_outlined);
        cVar.mo139027a(UIHelper.getString(R.string.Lark_Chat_FeedClickTipsPin));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo137248c(C37968c cVar, FeedPreview feedPreview) {
        String str;
        boolean z = true;
        if (feedPreview.getFeedType() == FeedCard.FeedType.INBOX && !feedPreview.isRemind() && f95936b) {
            if (feedPreview.getUnreadCount() == 1) {
                HashMap hashMap = new HashMap(1);
                hashMap.put("unread_count", Long.toString(feedPreview.getUnreadCount()));
                str = f95938j.mo96212a(hashMap) + " ";
            } else if (feedPreview.getUnreadCount() > 1) {
                HashMap hashMap2 = new HashMap(1);
                hashMap2.put("unread_count", Long.toString(feedPreview.getUnreadCount()));
                str = f95939k.mo96212a(hashMap2) + " ";
            }
            boolean g = mo137281g(cVar, feedPreview);
            if (!g || feedPreview.getDraftMessage() == null) {
                z = false;
            }
            cVar.f97476a.setLastMessageTv(0, str + feedPreview.getLocalizedDigestMessage(g), feedPreview.isTranslateEmojiCode(), z);
        }
        str = "";
        boolean g2 = mo137281g(cVar, feedPreview);
        z = false;
        cVar.f97476a.setLastMessageTv(0, str + feedPreview.getLocalizedDigestMessage(g2), feedPreview.isTranslateEmojiCode(), z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo137247b(C37968c cVar, FeedPreview feedPreview) {
        switch (C374059.f95973a[feedPreview.getMutexMarkType(mo137281g(cVar, feedPreview)).ordinal()]) {
            case 1:
                if (m147191c(feedPreview)) {
                    cVar.f97476a.setLastMessageMark(8, 0);
                    break;
                } else {
                    cVar.f97476a.setLastMessageMarkWithTint(0, R.drawable.ud_icon_edit_continue_outlined, R.color.ud_R500);
                    break;
                }
            case 2:
                cVar.f97476a.setLastMessageMark(0, R.drawable.feed_video_meeting_icon);
                break;
            case 3:
            case 4:
                cVar.f97476a.setLastMessageMark(0, R.drawable.feed_chat_room_icon);
                break;
            case 5:
                cVar.f97476a.setLastMessageMark(0, R.drawable.feed_video_meeting_start_icon);
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                cVar.f97476a.setLastMessageMark(0, R.drawable.feed_video_meeting_end_icon);
                break;
            case HwBuildEx.VersionCodes.EMUI_5_1:
                cVar.f97476a.setLastMessageMark(0, R.drawable.feed_voice_call_icon);
                break;
            case 13:
                cVar.f97476a.setLastMessageMark(0, R.drawable.send_status_sending, true);
                break;
            case 14:
                cVar.f97476a.setLastMessageMark(0, R.drawable.feed_message_send_failed_icon);
                break;
            case 15:
                cVar.f97476a.setLastMessageMark(0, R.drawable.feed_encrypted_call_icon);
                break;
            case 16:
                cVar.f97476a.setLastMessageMark(0, R.drawable.ic_svg_feed_read_state_all_unread);
                break;
            case 17:
                cVar.f97476a.setLastMessageMark(0, R.drawable.ic_svg_feed_read_state_all_read);
                break;
            default:
                cVar.f97476a.setLastMessageMark(8, 0);
                break;
        }
        FrameLayout markTipIVContainer = cVar.f97476a.getMarkTipIVContainer();
        LarkAvatarView markTipIv = cVar.f97476a.getMarkTipIv();
        if (feedPreview.isContainMarkType(FeedPreview.MarkType.AT_USER)) {
            markTipIVContainer.setBackgroundResource(R.drawable.bg_feed_at_user);
        } else if (feedPreview.isContainMarkType(FeedPreview.MarkType.AT_ALL)) {
            markTipIVContainer.setBackgroundResource(R.drawable.bg_feed_at_all);
        }
        if (feedPreview.getAtInfo() == null || TextUtils.isEmpty(feedPreview.getAtInfo().getAvatarKey())) {
            markTipIVContainer.setVisibility(4);
            return;
        }
        markTipIv.mo89076a(new AvatarModel.Builder().mo88962a(feedPreview.getAtInfo().getAvatarKey()).mo88967b(feedPreview.getAtInfo().getId()).mo88959a(AvatarModel.Size.MINI).mo88963a(f95940l).mo88960a(Biz.Messenger).mo88961a(Scene.Feed).mo88976k());
        markTipIVContainer.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo137246a(C37968c cVar, FeedPreview feedPreview) {
        if (!this.f95948m || TextUtils.isEmpty(feedPreview.getTeamName())) {
            cVar.f97476a.setTeamName(8, "");
        } else {
            cVar.f97476a.setTeamName(0, feedPreview.getTeamName());
        }
        cVar.f97476a.setChatName(0, feedPreview.getName());
        cVar.f97478c.mo89076a(mo137256a(feedPreview));
        cVar.f97478c.mo89074a(mo137258b(feedPreview));
        if (feedPreview.isContainMarkType(FeedPreview.MarkType.URGENT)) {
            cVar.f97478c.mo89073a(C0215a.m655b(this.f95942d, R.drawable.shortcut_bg_urgent));
            return;
        }
        cVar.f97478c.mo89073a((Drawable) null);
    }

    /* renamed from: b */
    private void m147190b(C37968c cVar, final FeedPreview feedPreview, final AbstractC37628k kVar) {
        if (kVar.mo138040g() != null && feedPreview.getType() != FeedCard.Type.BOX) {
            cVar.f97476a.setOnShowMenuListener(new AbstractC58347e() {
                /* class com.ss.android.lark.feed.app.binder.C37394h.C374038 */

                /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.ss.android.lark.feed.app.binder.a.b<T extends com.ss.android.lark.feed.app.entity.FeedPreview> */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.ss.android.lark.widget.p2932c.AbstractC58347e
                /* renamed from: a */
                public void mo137287a(View view, float f, float f2) {
                    C37394h.this.f95943e.mo137234a(C37394h.this.f95943e.mo137233a(feedPreview, new C37375b.AbstractC37377a<T>() {
                        /* class com.ss.android.lark.feed.app.binder.C37394h.C374038.C374041 */

                        @Override // com.ss.android.lark.feed.app.binder.p1857a.C37375b.AbstractC37377a
                        /* renamed from: a */
                        public void mo137235a(int i, T t) {
                            kVar.mo138040g().mo138948a(i, t);
                        }
                    }), view, f, f2);
                }
            });
        }
    }

    /* renamed from: a */
    private void m147188a(final C37968c cVar, final FeedPreview feedPreview, AbstractC37628k kVar) {
        boolean z;
        cVar.mo139036f(m147189a((UIFeedCard) feedPreview));
        if (feedPreview.getFeedType() == FeedCard.FeedType.DONE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            cVar.mo139034e(true);
        } else {
            cVar.mo139034e(false);
        }
        if (!feedPreview.isDelayed() || feedPreview.isDisplayedInDelayedFeed()) {
            cVar.mo139031d(8);
        } else {
            cVar.mo139031d(0);
        }
        cVar.mo139030c(feedPreview.isSwipedLeftPinned());
        cVar.mo139032d(feedPreview.isSwipeRightPinned());
        if (!(cVar.f97479d == null || cVar.f97480e == null)) {
            m147193i(cVar, feedPreview);
        }
        if (cVar.f97479d != null) {
            final FeedListAdapter.AbstractC37933h b = kVar.mo138035b();
            cVar.f97479d.setOnClickListener(new OnSingleClickListener(1000) {
                /* class com.ss.android.lark.feed.app.binder.C37394h.C374005 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    FeedPreview feedPreview;
                    FeedListAdapter.AbstractC37933h hVar = b;
                    if (hVar != null && (feedPreview = feedPreview) != null) {
                        hVar.mo137384a(feedPreview);
                    }
                }
            });
        }
        if (cVar.f97480e != null) {
            final FeedListAdapter.AbstractC37935j c = kVar.mo138036c();
            cVar.f97480e.setOnClickListener(new OnSingleClickListener(1000) {
                /* class com.ss.android.lark.feed.app.binder.C37394h.C374016 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    FeedPreview feedPreview;
                    FeedListAdapter.AbstractC37935j jVar = c;
                    if (jVar != null && (feedPreview = feedPreview) != null) {
                        jVar.mo137372a(feedPreview);
                        FeedShortcutHitPoint.f95785a.mo137125a(feedPreview.isShortCut());
                    }
                }
            });
        }
        if (cVar.f97482g != null) {
            final FeedListAdapter.AbstractC37932g h = kVar.mo138041h();
            cVar.f97482g.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.feed.app.binder.C37394h.C374027 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    FeedPreview feedPreview;
                    FeedListAdapter.AbstractC37932g gVar = h;
                    if (gVar != null && (feedPreview = feedPreview) != null) {
                        gVar.mo138950a(cVar, feedPreview, true);
                    }
                }
            });
        }
    }
}
