package com.ss.android.lark.feed.app.model.p1864d;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.biz.im.api.Shortcut;
import com.ss.android.lark.feed.app.binder.SubscriptionsFeedPreview;
import com.ss.android.lark.feed.app.entity.BoxFeedPreview;
import com.ss.android.lark.feed.app.entity.ChatFeedPreview;
import com.ss.android.lark.feed.app.entity.DocFeedPreview;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.LittleAppFeedPreview;
import com.ss.android.lark.feed.app.entity.ThreadFeedPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.feed.app.model.d.f */
public class C37746f {

    /* renamed from: a */
    C37744d f96783a = new C37744d();

    /* renamed from: b */
    C37743c f96784b = new C37743c();

    /* renamed from: c */
    C37742b f96785c = new C37742b();

    /* renamed from: d */
    C37748h f96786d = new C37748h();

    /* renamed from: e */
    C37745e f96787e = new C37745e();

    /* renamed from: f */
    C37747g f96788f = new C37747g();

    /* renamed from: a */
    public List<UIFeedCard> mo138448a(List<Shortcut> list, List<FeedPreviewInfo> list2) {
        Log.m165389i("FeedModule_PackerFactory", "packShortcuts onDataLoaded shortcutSize=" + list.size() + "  previewSize=" + list2.size());
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list2.size());
        List<ChatFeedPreview> a = this.f96784b.mo138444a(list2);
        if (!CollectionUtils.isEmpty(a)) {
            arrayList2.addAll(a);
        }
        List<LittleAppFeedPreview> a2 = this.f96787e.mo138447a(list2, true);
        if (!CollectionUtils.isEmpty(a2)) {
            arrayList2.addAll(a2);
        }
        List<DocFeedPreview> a3 = this.f96783a.mo138446a(list2, true);
        if (!CollectionUtils.isEmpty(a3)) {
            arrayList2.addAll(a3);
        }
        List<SubscriptionsFeedPreview> a4 = this.f96788f.mo138450a(list2, true);
        if (!CollectionUtils.isEmpty(a4)) {
            arrayList2.addAll(a4);
        }
        for (Shortcut shortcut : list) {
            boolean z = false;
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                UIFeedCard uIFeedCard = (UIFeedCard) it.next();
                if (TextUtils.equals(shortcut.getChannel().getId(), uIFeedCard.getId())) {
                    ((FeedPreview) uIFeedCard).setShortcutPosition(shortcut.getPosition());
                    arrayList.add(uIFeedCard);
                    z = true;
                    break;
                }
            }
            if (!z) {
                Log.m165383e("FeedModule_PackerFactory", "packShortcuts can't find shortCut = " + shortcut.getChannel().getId());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<UIFeedCard> mo138449a(List<FeedPreviewInfo> list, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        List<ChatFeedPreview> a = this.f96784b.mo138445a(list, z);
        List<DocFeedPreview> a2 = this.f96783a.mo138446a(list, z);
        List<BoxFeedPreview> a3 = this.f96785c.mo138442a(list, z);
        List<ThreadFeedPreview> a4 = this.f96786d.mo138451a(list, z);
        List<LittleAppFeedPreview> a5 = this.f96787e.mo138447a(list, z);
        List<SubscriptionsFeedPreview> a6 = this.f96788f.mo138450a(list, z);
        if (a3 != null) {
            for (int i = 0; i < a3.size(); i++) {
                Log.m165389i("FeedModule_PackerFactory", "BoxFeedCard " + i + " :" + a3.get(i).getId());
            }
        }
        if (!CollectionUtils.isEmpty(a)) {
            arrayList.addAll(a);
        }
        if (!CollectionUtils.isEmpty(a2)) {
            arrayList.addAll(a2);
        }
        if (!CollectionUtils.isEmpty(a3)) {
            arrayList.addAll(a3);
        }
        if (!CollectionUtils.isEmpty(a4)) {
            arrayList.addAll(a4);
        }
        if (!CollectionUtils.isEmpty(a5)) {
            arrayList.addAll(a5);
        }
        if (!CollectionUtils.isEmpty(a6)) {
            arrayList.addAll(a6);
        }
        arrayList.removeAll(Collections.singleton(null));
        Collections.sort(arrayList);
        return arrayList;
    }
}
