package com.ss.android.lark.feed.app.delayed;

import android.text.TextUtils;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.ThreadFeedPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.model.common.UpdateRecord;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.ss.android.lark.feed.app.delayed.b */
public class C37491b {

    /* renamed from: a */
    private Map<String, UIFeedCard> f96157a = new HashMap();

    /* renamed from: b */
    private AbstractC37492a f96158b;

    /* renamed from: c */
    private ReadWriteLock f96159c = new ReentrantReadWriteLock();

    /* renamed from: com.ss.android.lark.feed.app.delayed.b$a */
    public interface AbstractC37492a {
        /* renamed from: a */
        void mo137479a(UpdateRecord updateRecord);
    }

    /* renamed from: a */
    private void m147492a() {
        List<UIFeedCard> b = m147493b();
        UpdateRecord updateRecord = new UpdateRecord();
        updateRecord.mo138371a(b);
        AbstractC37492a aVar = this.f96158b;
        if (aVar != null) {
            aVar.mo137479a(updateRecord);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    private List<UIFeedCard> m147493b() {
        try {
            this.f96159c.readLock().lock();
            ArrayList arrayList = new ArrayList(this.f96157a.values());
            this.f96159c.readLock().unlock();
            Collections.sort(arrayList);
            return arrayList;
        } catch (Throwable th) {
            this.f96159c.readLock().unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public void mo137475a(AbstractC37492a aVar) {
        this.f96158b = aVar;
    }

    /* renamed from: b */
    public void mo137478b(AbstractC37492a aVar) {
        if (aVar == this.f96158b) {
            this.f96158b = null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo137477a(List<UIFeedCard> list) {
        if (list != null) {
            try {
                this.f96159c.writeLock().lock();
                for (UIFeedCard uIFeedCard : list) {
                    if (uIFeedCard instanceof FeedPreview) {
                        if (uIFeedCard.getFeedType() != FeedCard.FeedType.INBOX) {
                            this.f96157a.remove(uIFeedCard.getId());
                        } else if (!((FeedPreview) uIFeedCard).isDelayed()) {
                            this.f96157a.remove(uIFeedCard.getId());
                        } else {
                            UIFeedCard uIFeedCard2 = this.f96157a.get(uIFeedCard.getId());
                            if (uIFeedCard2 == null || uIFeedCard.getUpdateTime() >= uIFeedCard2.getUpdateTime()) {
                                this.f96157a.put(uIFeedCard.getId(), uIFeedCard);
                            }
                        }
                    }
                }
                this.f96159c.writeLock().unlock();
                m147492a();
            } catch (Throwable th) {
                this.f96159c.writeLock().unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo137476a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                this.f96159c.writeLock().lock();
                for (UIFeedCard uIFeedCard : this.f96157a.values()) {
                    if (uIFeedCard instanceof ThreadFeedPreview) {
                        ThreadFeedPreview threadFeedPreview = (ThreadFeedPreview) uIFeedCard;
                        if (str2.equals(threadFeedPreview.getChatId())) {
                            ThreadFeedPreview threadFeedPreview2 = new ThreadFeedPreview(threadFeedPreview);
                            threadFeedPreview2.setAvatarKey(str);
                            this.f96157a.put(threadFeedPreview.getId(), threadFeedPreview2);
                        }
                    }
                }
                this.f96159c.writeLock().unlock();
                m147492a();
            } catch (Throwable th) {
                this.f96159c.writeLock().unlock();
                throw th;
            }
        }
    }
}
