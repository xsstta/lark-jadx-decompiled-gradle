package com.ss.android.lark.search;

import android.app.Activity;
import android.content.Context;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import com.ss.android.lark.search.impl.C53329a;
import com.ss.android.lark.search.impl.entity.SearchDetailInitData;
import com.ss.android.lark.search.impl.func.chatinside.C53406a;
import com.ss.android.lark.search.impl.func.chatinside.common.C53412a;
import com.ss.android.lark.search.impl.func.global.SearchActivity;
import com.ss.android.lark.search.impl.func.pick.chatpick.PickChatLauncher;
import com.ss.android.lark.search.impl.func.pick.chatterpick.C53667b;
import com.ss.android.lark.search.impl.func.pick.p2623a.C53637e;
import com.ss.android.lark.search.impl.func.pick.viewdata.BasePickViewData;
import com.ss.android.lark.search.impl.hitpoint.SearchHitPoint;
import com.ss.android.lark.search.impl.p2604d.C53364a;
import com.ss.android.lark.search.p2584b.AbstractC53280a;
import com.ss.android.lark.search.p2584b.C53287b;
import com.ss.android.lark.search.service.compatible.SearchLifecycleObserver;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.dto.SearchDetailDto;
import com.ss.android.lark.searchcommon.service.compatible.ISearchLifecycleObserver;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.search.a */
public class C53258a {

    /* renamed from: a */
    private static volatile ISearchModuleDependency f131614a;

    /* renamed from: b */
    public int mo181711b() {
        return ParticipantRepo.f117150c;
    }

    /* renamed from: a */
    public static ISearchModuleDependency m205939a() {
        return f131614a;
    }

    /* renamed from: a */
    public void mo181706a(Context context, String str, String str2, int i) {
        m205942a(context, str, str2, i, true, false, 11);
    }

    /* renamed from: a */
    public void mo181708a(Context context, String str, boolean z, boolean z2) {
        mo181709a(context, str, z, z2, 0);
    }

    /* renamed from: a */
    public void mo181709a(Context context, String str, boolean z, boolean z2, int i) {
        C53406a.m206803a(context, str, z, z2, i);
    }

    /* renamed from: a */
    public void mo181710a(final String str) {
        C53412a.m206847b(str, new IGetDataCallback<C53412a.C53415a>() {
            /* class com.ss.android.lark.search.C53258a.C532635 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(C53412a.C53415a aVar) {
                SearchHitPoint.f131886a.mo182020a(aVar.mo182447a(), aVar.mo182448b(), str);
            }
        });
    }

    /* renamed from: a */
    public void mo181707a(Context context, String str, boolean z) {
        C53406a.m206802a(context, str, z);
    }

    /* renamed from: e */
    public static Map<String, Boolean> m205944e() {
        return C53329a.m206411a();
    }

    /* renamed from: c */
    public AbstractC53280a mo181714c() {
        return C53287b.m206193a();
    }

    /* renamed from: d */
    public ISearchLifecycleObserver mo181716d() {
        return new SearchLifecycleObserver(false);
    }

    public C53258a(ISearchModuleDependency iSearchModuleDependency) {
        m205943a(iSearchModuleDependency);
    }

    /* renamed from: a */
    private static void m205943a(ISearchModuleDependency iSearchModuleDependency) {
        f131614a = iSearchModuleDependency;
    }

    /* renamed from: a */
    private SearchDetailInitData m205940a(SearchDetailDto searchDetailDto) {
        return SearchDetailInitData.newBuilder().mo182082a(true).mo182085b(searchDetailDto.bitmapKey).mo182086c(searchDetailDto.translateY).mo182074a(searchDetailDto.fromType).mo182075a(searchDetailDto.sceneType).mo182084b(searchDetailDto.resultType).mo182083a();
    }

    /* renamed from: a */
    public void mo181703a(Context context) {
        m205942a(context, "", "", 0, false, false, 4);
    }

    /* renamed from: a */
    private void m205941a(Context context, SearchDetailDto searchDetailDto) {
        C53364a.m206586a(context, m205940a(searchDetailDto));
    }

    /* renamed from: a */
    public void mo181701a(Activity activity, String str) {
        if (activity instanceof SearchActivity) {
            ((SearchActivity) activity).mo182922a(str);
        }
    }

    /* renamed from: a */
    public void mo181704a(Context context, String str) {
        C53406a.m206801a(context, str);
    }

    /* renamed from: a */
    public void mo181705a(Context context, String str, int i) {
        m205941a(context, SearchDetailDto.newBuilder().mo183844a(str).mo183846b(1).mo183842a(i).mo183843a(Scene.Type.SEARCH_USERS).mo183847c(100000010).mo183845a());
    }

    /* renamed from: b */
    public void mo181712b(final Activity activity, final List<String> list, final String str, final int i) {
        C57865c.m224574a(new C57865c.AbstractC57873d<List<BasePickViewData>>() {
            /* class com.ss.android.lark.search.C53258a.C532613 */

            /* renamed from: a */
            public List<BasePickViewData> produce() {
                return C53637e.m207639b(list);
            }
        }, new C57865c.AbstractC57871b<List<BasePickViewData>>() {
            /* class com.ss.android.lark.search.C53258a.C532624 */

            /* renamed from: a */
            public void consume(List<BasePickViewData> list) {
                Activity activity = activity;
                activity.startActivityForResult(PickChatLauncher.m207657a(activity, list, str), i);
            }
        });
    }

    /* renamed from: c */
    public void mo181715c(Context context, String str, String str2, int i) {
        m205942a(context, str, str2, i, true, false, 3);
    }

    /* renamed from: d */
    public void mo181717d(Context context, String str, String str2, int i) {
        m205942a(context, str, str2, i, true, false, 1);
    }

    /* renamed from: e */
    public void mo181718e(Context context, String str, String str2, int i) {
        m205942a(context, str, str2, i, true, false, 5);
    }

    /* renamed from: f */
    public void mo181719f(Context context, String str, String str2, int i) {
        m205942a(context, str, str2, i, true, false, 6);
    }

    /* renamed from: g */
    public void mo181720g(Context context, String str, String str2, int i) {
        m205942a(context, str, str2, i, true, false, 7);
    }

    /* renamed from: h */
    public void mo181721h(Context context, String str, String str2, int i) {
        m205942a(context, str, str2, i, true, false, 8);
    }

    /* renamed from: b */
    public void mo181713b(Context context, String str, String str2, int i) {
        m205942a(context, str, str2, i, true, false, 2);
    }

    /* renamed from: i */
    public void mo181722i(Context context, String str, String str2, int i) {
        SearchHitPoint.f131886a.mo182013a("community");
        m205942a(context, str, str2, i, true, false, 9);
    }

    /* renamed from: j */
    public void mo181723j(Context context, String str, String str2, int i) {
        SearchHitPoint.f131886a.mo182013a("msg_menu");
        m205942a(context, str, str2, i, true, false, 10);
    }

    /* renamed from: k */
    public void mo181724k(Context context, String str, String str2, int i) {
        SearchHitPoint.f131886a.mo182013a("lynx_card");
        m205942a(context, str, str2, i, true, true, 12);
    }

    /* renamed from: a */
    public void mo181702a(final Activity activity, final List<String> list, final String str, final int i) {
        C57865c.m224574a(new C57865c.AbstractC57873d<List<BasePickViewData>>() {
            /* class com.ss.android.lark.search.C53258a.C532591 */

            /* renamed from: a */
            public List<BasePickViewData> produce() {
                return C53637e.m207637a(list);
            }
        }, new C57865c.AbstractC57871b<List<BasePickViewData>>() {
            /* class com.ss.android.lark.search.C53258a.C532602 */

            /* renamed from: a */
            public void consume(List<BasePickViewData> list) {
                Activity activity = activity;
                activity.startActivityForResult(C53667b.m207748a(activity, list, str), i);
            }
        });
    }

    /* renamed from: a */
    private void m205942a(Context context, String str, String str2, int i, boolean z, boolean z2, int i2) {
        SearchHitPoint.f131886a.mo182021b();
        C53364a.m206587a(context, str, str2, i, z, z2, i2);
    }
}
