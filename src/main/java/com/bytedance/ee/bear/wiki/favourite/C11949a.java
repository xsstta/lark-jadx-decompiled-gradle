package com.bytedance.ee.bear.wiki.favourite;

import android.content.Context;
import android.widget.ImageView;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.am;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.wiki.favourite.WikiSpaceFavouritePuller;
import com.bytedance.ee.bear.wiki.favourite.p581a.C11952a;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import io.reactivex.functions.Function;

/* renamed from: com.bytedance.ee.bear.wiki.favourite.a */
public class C11949a {

    /* renamed from: a */
    public boolean f32299a;

    /* renamed from: b */
    public Context f32300b;

    /* renamed from: c */
    public ImageView f32301c;

    /* renamed from: d */
    private WikiSpaceFavouritePuller f32302d;

    /* renamed from: b */
    private WikiSpaceFavouritePuller.AbstractC11946a m49510b(final String str, final C11952a aVar) {
        return new WikiSpaceFavouritePuller.AbstractC11946a() {
            /* class com.bytedance.ee.bear.wiki.favourite.C11949a.C119501 */

            @Override // com.bytedance.ee.bear.wiki.favourite.WikiSpaceFavouritePuller.AbstractC11946a
            /* renamed from: a */
            public void mo45884a() {
                C13479a.m54764b("WikiStar", "star space success");
                C11949a aVar = C11949a.this;
                aVar.f32299a = !aVar.f32299a;
                Toast.showSuccessText(C11949a.this.f32300b, (int) R.string.Doc_Wiki_StarSuccess);
                C11949a.this.mo45887a(str, true);
            }

            @Override // com.bytedance.ee.bear.wiki.favourite.WikiSpaceFavouritePuller.AbstractC11946a
            /* renamed from: a */
            public void mo45885a(int i, Throwable th) {
                C13479a.m54758a("WikiStar", "star failed code = " + i + " ==> " + th);
                aVar.mo45890b();
                aVar.mo45891c();
                C11949a.this.f32301c.setImageResource(R.drawable.icon_tool_uncollected_nor);
                Toast.showFailureText(C11949a.this.f32300b, (int) R.string.Doc_Wiki_StarFail);
            }
        };
    }

    /* renamed from: c */
    private WikiSpaceFavouritePuller.AbstractC11946a m49511c(final String str, final C11952a aVar) {
        return new WikiSpaceFavouritePuller.AbstractC11946a() {
            /* class com.bytedance.ee.bear.wiki.favourite.C11949a.C119512 */

            @Override // com.bytedance.ee.bear.wiki.favourite.WikiSpaceFavouritePuller.AbstractC11946a
            /* renamed from: a */
            public void mo45884a() {
                C13479a.m54764b("WikiStar", "unStar space success");
                C11949a aVar = C11949a.this;
                aVar.f32299a = !aVar.f32299a;
                Toast.showSuccessText(C11949a.this.f32300b, (int) R.string.Doc_Wiki_UnstarSuccess);
                C11949a.this.mo45887a(str, false);
            }

            @Override // com.bytedance.ee.bear.wiki.favourite.WikiSpaceFavouritePuller.AbstractC11946a
            /* renamed from: a */
            public void mo45885a(int i, Throwable th) {
                C13479a.m54758a("WikiStar", "unStar failed code = " + i + " ===> " + th);
                aVar.mo45890b();
                aVar.mo45891c();
                C11949a.this.f32301c.setImageResource(R.drawable.icon_tool_collect_nor);
                Toast.showFailureText(C11949a.this.f32300b, (int) R.string.Doc_Wiki_UnstarFail);
            }
        };
    }

    /* renamed from: a */
    public void mo45887a(String str, boolean z) {
        ar.f14811a.mo41508c(am.class).mo238020d(new Function(str, z) {
            /* class com.bytedance.ee.bear.wiki.favourite.$$Lambda$a$W5OlpWgQynixRaS46Ia504znA */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ boolean f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11949a.m49507a(this.f$0, this.f$1, (am) obj);
            }
        }).mo238001b($$Lambda$a$9wOT25pMeLaTcNjMqOSseqMvXk.INSTANCE, $$Lambda$a$DtwE3Jw3F1HcnRkYSjfpB8N6EO8.INSTANCE);
    }

    /* renamed from: a */
    public void mo45886a(String str, C11952a aVar) {
        WikiSpaceFavouritePuller.WikiFavouriteParams wikiFavouriteParams = new WikiSpaceFavouritePuller.WikiFavouriteParams();
        wikiFavouriteParams.space_id = str;
        wikiFavouriteParams.wiki_token = "";
        wikiFavouriteParams.star_type = 0;
        if (this.f32299a) {
            C13479a.m54764b("WikiStar", "unStar space");
            this.f32301c.setImageResource(R.drawable.icon_tool_uncollected_nor);
            this.f32302d.mo45882a(wikiFavouriteParams, !this.f32299a, m49511c(str, aVar));
            return;
        }
        C13479a.m54764b("WikiStar", "star space");
        this.f32301c.setImageResource(R.drawable.icon_tool_collect_nor);
        this.f32302d.mo45882a(wikiFavouriteParams, !this.f32299a, m49510b(str, aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m49507a(String str, boolean z, am amVar) throws Exception {
        amVar.starSpace(str, z);
        return true;
    }

    public C11949a(NetService netService, Context context, ImageView imageView, boolean z) {
        this.f32302d = new WikiSpaceFavouritePuller(netService);
        this.f32300b = context;
        this.f32301c = imageView;
        this.f32299a = z;
    }
}
