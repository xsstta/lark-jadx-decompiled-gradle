package com.ss.android.lark.searchcommon;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.huawei.hms.actions.SearchIntents;
import com.larksuite.component.metriclogger.consts.domains.C24341b;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.lynx.tasm.C26596b;
import com.ss.android.lark.chat.api.AbstractC32808a;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.searchcommon.constant.SearchCommonConstants;
import com.ss.android.lark.searchcommon.env.AppEnvType;
import com.ss.android.lark.searchcommon.gecko.ASLynxGeckoManager;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jp.wasabeef.glide.transformations.AbstractC69021a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/searchcommon/SearchCommonModuleDependency;", "", "()V", "dependency", "Lcom/ss/android/lark/searchcommon/SearchCommonModuleDependency$ISearchCommonModuleDependency;", "getDependency", "preload", "", "setDependency", "ISearchCommonModuleDependency", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.a */
public final class SearchCommonModuleDependency {

    /* renamed from: a */
    public static final SearchCommonModuleDependency f133119a = new SearchCommonModuleDependency();

    /* renamed from: b */
    private static volatile ISearchCommonModuleDependency f133120b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0001wJ\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\b\u0010\u0010\u001a\u00020\rH&J\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bH&J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0017H&J$\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\u0010\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u00010\u001bH'J\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000bH'J6\u0010 \u001a\u00020\t2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\"2\u001e\u0010\u001a\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010$0#H&J\b\u0010%\u001a\u00020\u000bH&J\u0010\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u001eH&J\u0018\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u000bH'J\u0010\u0010+\u001a\u00020\r2\u0006\u0010)\u001a\u00020\rH'J\u0010\u0010,\u001a\u00020\r2\u0006\u0010)\u001a\u00020\rH'J\u0012\u0010-\u001a\u0004\u0018\u00010\u000b2\u0006\u0010.\u001a\u00020\u000bH&J\n\u0010/\u001a\u0004\u0018\u00010\u000bH&J\n\u00100\u001a\u0004\u0018\u00010\u000bH&J\u0018\u00101\u001a\u0004\u0018\u0001022\f\u00103\u001a\b\u0012\u0004\u0012\u0002020\"H&J\u0018\u00104\u001a\u00020\r2\u0006\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u000bH'J\b\u00105\u001a\u00020\tH&J\u0010\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u000208H&J\b\u00109\u001a\u00020\u0003H&JJ\u0010:\u001a\u00020\t2\b\u0010;\u001a\u0004\u0018\u00010<2\b\u0010=\u001a\u0004\u0018\u00010\u000b2\b\u0010>\u001a\u0004\u0018\u00010?2\b\u0010@\u001a\u0004\u0018\u00010A2\b\u0010B\u001a\u0004\u0018\u00010A2\u0006\u0010C\u001a\u00020\r2\u0006\u0010D\u001a\u00020\rH&JR\u0010E\u001a\u00020\t2\u0006\u0010;\u001a\u00020<2\u0006\u0010F\u001a\u00020\u000b2\b\u0010G\u001a\u0004\u0018\u00010\u000b2\b\u0010H\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010I\u001a\u00020\r2\b\b\u0002\u0010J\u001a\u00020\r2\b\u0010K\u001a\u0004\u0018\u00010L2\u0006\u0010>\u001a\u00020?H&J<\u0010M\u001a\u00020\t2\u0006\u0010N\u001a\u00020\u00032\u0006\u0010O\u001a\u0002082\b\u0010\u0013\u001a\u0004\u0018\u00010P2\u0018\u0010Q\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010$H&J\u001a\u0010R\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\u0006\u0010S\u001a\u00020\rH&J\"\u0010T\u001a\u00020\t2\u0006\u0010;\u001a\u00020<2\b\u0010U\u001a\u0004\u0018\u00010\u000b2\u0006\u0010V\u001a\u00020\u000bH&J \u0010W\u001a\u00020\t2\u0006\u0010;\u001a\u00020<2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020YH&J\u001a\u0010[\u001a\u00020\t2\u0006\u0010;\u001a\u00020<2\b\u0010\\\u001a\u0004\u0018\u00010\u000bH&J\u0010\u0010]\u001a\u00020\u00032\u0006\u0010;\u001a\u00020<H&J\u0018\u0010^\u001a\u00020\t2\u0006\u0010;\u001a\u00020<2\u0006\u0010_\u001a\u00020\u000bH&J\u001a\u0010`\u001a\u00020\t2\u0006\u0010;\u001a\u00020<2\b\u0010a\u001a\u0004\u0018\u00010\u000bH&J\u0018\u0010b\u001a\u00020\t2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020\u000bH&J\u001a\u0010f\u001a\u00020\t2\b\u0010g\u001a\u0004\u0018\u00010\u000b2\u0006\u0010h\u001a\u00020\rH&J\u0010\u0010i\u001a\u00020\u00032\u0006\u0010;\u001a\u00020<H&J\u001c\u0010j\u001a\u00020\t2\b\u0010k\u001a\u0004\u0018\u00010\u000b2\b\u0010l\u001a\u0004\u0018\u00010mH&J\u0010\u0010n\u001a\u00020\t2\u0006\u0010o\u001a\u00020pH&J \u0010q\u001a\u00020\t2\u0006\u0010;\u001a\u00020<2\u0006\u0010r\u001a\u00020\u000b2\u0006\u0010s\u001a\u00020\u000bH&J\u001c\u0010t\u001a\u00020\t2\b\u0010;\u001a\u0004\u0018\u00010<2\b\u0010u\u001a\u0004\u0018\u00010\u000bH&J\u001c\u0010v\u001a\u00020\t2\b\u0010;\u001a\u0004\u0018\u00010<2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000bH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005R\u0012\u0010\u0007\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006x"}, d2 = {"Lcom/ss/android/lark/searchcommon/SearchCommonModuleDependency$ISearchCommonModuleDependency;", "", "disableEraseInvisibleChar", "", "getDisableEraseInvisibleChar", "()Z", "isCustomer", "isSimpleTenant", "cardAction", "", "cardId", "", "action", "", "getAppEnv", "Lcom/ss/android/lark/searchcommon/env/AppEnvType;", "getAppId", "getAvatarUrl", "key", "id", "getCachedLanguageSetting", "Ljava/util/Locale;", "getChannelParser", "Lcom/ss/android/lark/chat/api/IChannelParser;", "getChatById", "chatId", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getChatterById", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", BottomDialog.f17198f, "getChattersByIds", "chatterIds", "", "Lcom/larksuite/framework/callback/UIGetDataCallback;", "", "getDeviceId", "getDisplayName", "chatter", "getDocIcon", "docType", "fileName", "getDocInlineBlueIcon", "getDocInlineGreyIcon", "getDynamicDomain", "alias", "getLoginUserId", "getLoginUserTenantId", "getOpenedUserStatus", "Lcom/bytedance/lark/pb/basic/v1/Chatter$ChatterCustomStatus;", "userStatusList", "getWikiIcon", "initCardEnv", "isInZenMode", "time", "", "isOpenUserCustomStatus", "loadImage", "context", "Landroid/content/Context;", "localPathOrUrl", "imageView", "Landroid/widget/ImageView;", "placeHolder", "Landroid/graphics/drawable/Drawable;", "errorHolder", "imageWidth", "imageHeight", "loadTargetShapeAvatarToImage", "avatarKey", "avatarId", "fsUnit", "width", "height", "transformation", "Ljp/wasabeef/glide/transformations/BitmapTransformation;", "metricLogger", "isTimeType", "timer", "Lcom/larksuite/component/metriclogger/consts/domains/MetricId;", "params", "openChat", "msgPosition", "openDial", "title", "phoneNum", "openLocation", "latitude", "", "longitude", "openMainSearch", SearchIntents.EXTRA_QUERY, "openPrivacyPolicy", "openProfile", "userId", "openSchema", "link", "openSearchTab", "activity", "Landroid/app/Activity;", "appId", "openThread", "threadId", "threadPosition", "openUserProtocol", "peakFeedCard", "feedId", "feedType", "Lcom/ss/android/lark/searchcommon/constant/SearchCommonConstants$FeedType;", "registerLanguageChangeListener", "listener", "Lcom/ss/android/lark/searchcommon/SearchCommonModuleDependency$ISearchCommonModuleDependency$IOnLanguageChangeListener;", "seeMoreDefinitions", "abbrName", "jsonArray", "startBotProfileActivityByBotId", "botId", "startContactsProfileActivityByChatterId", "IOnLanguageChangeListener", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.a$a */
    public interface ISearchCommonModuleDependency {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/searchcommon/SearchCommonModuleDependency$ISearchCommonModuleDependency$IOnLanguageChangeListener;", "", "onLanguageChange", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.searchcommon.a$a$a */
        public interface IOnLanguageChangeListener {
            /* renamed from: a */
            void mo183786a();
        }

        /* renamed from: a */
        int mo102882a();

        /* renamed from: a */
        int mo102883a(int i);

        /* renamed from: a */
        int mo102884a(int i, String str);

        /* renamed from: a */
        Chatter.ChatterCustomStatus mo102885a(List<Chatter.ChatterCustomStatus> list);

        /* renamed from: a */
        String mo102886a(com.ss.android.lark.chat.entity.chatter.Chatter chatter);

        /* renamed from: a */
        String mo102887a(String str);

        /* renamed from: a */
        String mo102888a(String str, String str2);

        /* renamed from: a */
        void mo102889a(Activity activity, String str);

        /* renamed from: a */
        void mo102890a(Context context, double d, double d2);

        /* renamed from: a */
        void mo102891a(Context context, String str);

        /* renamed from: a */
        void mo102892a(Context context, String str, ImageView imageView, Drawable drawable, Drawable drawable2, int i, int i2);

        /* renamed from: a */
        void mo102893a(Context context, String str, String str2);

        /* renamed from: a */
        void mo102894a(Context context, String str, String str2, String str3, int i, int i2, AbstractC69021a aVar, ImageView imageView);

        /* renamed from: a */
        void mo102895a(IOnLanguageChangeListener aVar);

        /* renamed from: a */
        void mo102896a(String str, int i);

        /* renamed from: a */
        void mo102897a(String str, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo102898a(String str, SearchCommonConstants.FeedType feedType);

        /* renamed from: a */
        void mo102899a(List<String> list, UIGetDataCallback<Map<String, com.ss.android.lark.chat.entity.chatter.Chatter>> uIGetDataCallback);

        /* renamed from: a */
        void mo102900a(boolean z, long j, C24341b bVar, Map<String, ? extends Object> map);

        /* renamed from: a */
        boolean mo102901a(long j);

        /* renamed from: a */
        boolean mo102902a(Context context);

        /* renamed from: b */
        int mo102903b(int i);

        /* renamed from: b */
        int mo102904b(int i, String str);

        /* renamed from: b */
        String mo102905b();

        /* renamed from: b */
        void mo102906b(Context context, String str);

        /* renamed from: b */
        void mo102907b(Context context, String str, String str2);

        /* renamed from: b */
        void mo102908b(String str, int i);

        /* renamed from: c */
        AppEnvType mo102909c();

        /* renamed from: c */
        void mo102910c(Context context, String str);

        /* renamed from: c */
        void mo102911c(String str, int i);

        /* renamed from: d */
        void mo102912d();

        /* renamed from: d */
        void mo102913d(Context context, String str);

        /* renamed from: e */
        Locale mo102914e();

        /* renamed from: e */
        void mo102915e(Context context, String str);

        /* renamed from: f */
        boolean mo102916f();

        /* renamed from: g */
        boolean mo102917g();

        /* renamed from: h */
        boolean mo102918h();

        /* renamed from: i */
        AbstractC32808a mo102919i();

        /* renamed from: j */
        String mo102920j();

        /* renamed from: k */
        String mo102921k();

        /* renamed from: l */
        boolean mo102922l();
    }

    private SearchCommonModuleDependency() {
    }

    @JvmStatic
    /* renamed from: b */
    public static final ISearchCommonModuleDependency m208732b() {
        ISearchCommonModuleDependency aVar = f133120b;
        if (aVar == null) {
            Intrinsics.throwNpe();
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo183785a() {
        C26596b.m96400a();
        C57865c.m224576a(RunnableC53877b.f133121a);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.a$b */
    static final class RunnableC53877b implements Runnable {

        /* renamed from: a */
        public static final RunnableC53877b f133121a = new RunnableC53877b();

        RunnableC53877b() {
        }

        public final void run() {
            SearchCommonModuleDependency aVar = SearchCommonModuleDependency.f133119a;
            ISearchCommonModuleDependency aVar2 = SearchCommonModuleDependency.f133120b;
            if (aVar2 != null) {
                aVar2.mo102912d();
            }
            ASLynxGeckoManager.f133123f.mo183794a().mo183789a();
            ASLynxGeckoManager.f133123f.mo183794a().mo183792b();
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m208731a(ISearchCommonModuleDependency aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        f133120b = aVar;
    }
}
