package com.ss.android.lark.feed.app.conversationbox;

import android.text.TextUtils;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.model.common.UpdateRecord;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.ss.android.lark.feed.app.conversationbox.a */
public class C37429a {

    /* renamed from: a */
    private String f96026a;

    /* renamed from: b */
    private Map<String, UIFeedCard> f96027b = new HashMap();

    /* renamed from: c */
    private AbstractC37430a f96028c;

    /* renamed from: d */
    private ReadWriteLock f96029d = new ReentrantReadWriteLock();

    /* renamed from: com.ss.android.lark.feed.app.conversationbox.a$a */
    public interface AbstractC37430a {
        /* renamed from: a */
        void mo137347a(UpdateRecord updateRecord);
    }

    /* renamed from: a */
    public boolean mo137344a() {
        return this.f96027b.isEmpty();
    }

    /* renamed from: b */
    private void m147302b() {
        List<UIFeedCard> c = m147303c();
        UpdateRecord updateRecord = new UpdateRecord();
        updateRecord.mo138371a(c);
        AbstractC37430a aVar = this.f96028c;
        if (aVar != null) {
            aVar.mo137347a(updateRecord);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    private List<UIFeedCard> m147303c() {
        try {
            this.f96029d.readLock().lock();
            ArrayList arrayList = new ArrayList(this.f96027b.values());
            this.f96029d.readLock().unlock();
            Collections.sort(arrayList);
            return arrayList;
        } catch (Throwable th) {
            this.f96029d.readLock().unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public void mo137342a(AbstractC37430a aVar) {
        this.f96028c = aVar;
    }

    /* renamed from: b */
    public void mo137345b(AbstractC37430a aVar) {
        if (aVar == this.f96028c) {
            this.f96028c = null;
        }
    }

    public C37429a(String str) {
        this.f96026a = str;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo137343a(List<UIFeedCard> list) {
        if (list != null) {
            try {
                this.f96029d.writeLock().lock();
                for (UIFeedCard uIFeedCard : list) {
                    UIFeedCard uIFeedCard2 = this.f96027b.get(uIFeedCard.getId());
                    if (uIFeedCard2 == null || uIFeedCard.getUpdateTime() >= uIFeedCard2.getUpdateTime()) {
                        this.f96027b.put(uIFeedCard.getId(), uIFeedCard);
                    }
                }
                this.f96029d.writeLock().unlock();
                m147302b();
            } catch (Throwable th) {
                this.f96029d.writeLock().unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public void mo137346b(List<UIFeedCard> list) {
        if (list != null) {
            try {
                this.f96029d.writeLock().lock();
                for (UIFeedCard uIFeedCard : list) {
                    if (TextUtils.isEmpty(uIFeedCard.getParentCardId()) || uIFeedCard.getParentCardId().equals("0")) {
                        this.f96027b.remove(uIFeedCard.getId());
                    }
                }
                this.f96029d.writeLock().unlock();
                m147302b();
            } catch (Throwable th) {
                this.f96029d.writeLock().unlock();
                throw th;
            }
        }
    }
}
