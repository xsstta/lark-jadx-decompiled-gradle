package com.ss.android.lark.feed.app.model.common;

import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.model.cache.ICache;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public class UpdateRecord {

    /* renamed from: a */
    private long f96745a;

    /* renamed from: b */
    private FeedCard.FeedType f96746b;

    /* renamed from: c */
    private List<UIFeedCard> f96747c;

    /* renamed from: d */
    private boolean f96748d;

    /* renamed from: e */
    private boolean f96749e;

    /* renamed from: f */
    private String f96750f;

    /* renamed from: g */
    private int f96751g;

    /* renamed from: h */
    private List<ICache.Operation> f96752h;

    /* renamed from: i */
    private FeedFilter f96753i;

    /* renamed from: j */
    private FeedFilter f96754j;

    @Retention(RetentionPolicy.SOURCE)
    public @interface FeedPacketType {
    }

    /* renamed from: a */
    public long mo138365a() {
        return this.f96745a;
    }

    /* renamed from: b */
    public FeedCard.FeedType mo138373b() {
        return this.f96746b;
    }

    /* renamed from: c */
    public List<UIFeedCard> mo138376c() {
        return this.f96747c;
    }

    /* renamed from: d */
    public List<ICache.Operation> mo138377d() {
        return this.f96752h;
    }

    /* renamed from: e */
    public boolean mo138378e() {
        return this.f96748d;
    }

    /* renamed from: f */
    public boolean mo138379f() {
        return this.f96749e;
    }

    /* renamed from: g */
    public String mo138380g() {
        return this.f96750f;
    }

    /* renamed from: h */
    public int mo138381h() {
        return this.f96751g;
    }

    /* renamed from: i */
    public FeedFilter mo138382i() {
        return this.f96753i;
    }

    /* renamed from: j */
    public FeedFilter mo138383j() {
        return this.f96754j;
    }

    /* renamed from: a */
    public void mo138366a(int i) {
        this.f96751g = i;
    }

    /* renamed from: b */
    public void mo138374b(FeedFilter feedFilter) {
        this.f96754j = feedFilter;
    }

    /* renamed from: a */
    public void mo138367a(long j) {
        this.f96745a = j;
    }

    /* renamed from: b */
    public void mo138375b(boolean z) {
        this.f96749e = z;
    }

    /* renamed from: a */
    public void mo138368a(FeedCard.FeedType feedType) {
        this.f96746b = feedType;
    }

    /* renamed from: a */
    public void mo138369a(FeedFilter feedFilter) {
        this.f96753i = feedFilter;
    }

    /* renamed from: a */
    public void mo138370a(String str) {
        this.f96750f = str;
    }

    /* renamed from: a */
    public void mo138371a(List<UIFeedCard> list) {
        this.f96747c = list;
    }

    /* renamed from: a */
    public void mo138372a(boolean z) {
        this.f96748d = z;
    }
}
