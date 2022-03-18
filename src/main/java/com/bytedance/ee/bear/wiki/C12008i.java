package com.bytedance.ee.bear.wiki;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.wiki.wikitree.bean.HomePage;
import com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12148g;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.wiki.i */
public class C12008i extends AbstractC1142af implements AbstractC12148g {
    private BearUrl mBearUrl;
    private HomePage mHomePage;
    private String mSpaceId = "";
    private final C1177w<Void> mWikiInfoLoadCompleted;

    public BearUrl getBearUrl() {
        return this.mBearUrl;
    }

    public HomePage getHomePage() {
        return this.mHomePage;
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12148g
    public String getSpaceId() {
        return this.mSpaceId;
    }

    public C1177w<Void> getWikiInfoLoadCompletedLiveData() {
        return this.mWikiInfoLoadCompleted;
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12148g
    public String getWikiToken() {
        return this.mBearUrl.f17447b;
    }

    public void setHomePage(HomePage homePage) {
        this.mHomePage = homePage;
    }

    public void setSpaceId(String str) {
        this.mSpaceId = str;
    }

    public static C1144ai.AbstractC1146b newFactory(final Bundle bundle) {
        return new C1144ai.AbstractC1146b() {
            /* class com.bytedance.ee.bear.wiki.C12008i.C120091 */

            @Override // androidx.lifecycle.C1144ai.AbstractC1146b
            public <T extends AbstractC1142af> T create(Class<T> cls) {
                return new C12008i(bundle);
            }
        };
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12148g
    public void setWikiToken(String str) {
        C13479a.m54775e("WikiViewModel", "Ignore setWikiToken ,cause WikiViewModel'lifecycle changed from activity to document .");
    }

    public C12008i(Bundle bundle) {
        C13479a.m54764b("WikiViewModel", "onCreate");
        this.mWikiInfoLoadCompleted = new C1177w<>();
        readArgs(bundle);
    }

    private void readArgs(Bundle bundle) {
        if (bundle != null) {
            this.mSpaceId = bundle.getString("space_id");
            this.mBearUrl = C6313i.m25327a().mo25399g(bundle.getString("url"));
            this.mHomePage = (HomePage) bundle.getParcelable("home_node");
        }
    }
}
