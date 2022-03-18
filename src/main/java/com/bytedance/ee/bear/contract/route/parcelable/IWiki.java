package com.bytedance.ee.bear.contract.route.parcelable;

import android.os.Bundle;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import io.reactivex.AbstractC68307f;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u0005H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\u0003H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0005H&J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H&¨\u0006\u001a"}, d2 = {"Lcom/bytedance/ee/bear/contract/route/parcelable/IWiki;", "", "canWikiV2ShowPermission", "", "getContainerId", "", "pluginHost", "Lcom/bytedance/ee/bear/browser/plugin/PluginHost;", "bundle", "Landroid/os/Bundle;", "getWikiType", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/contract/route/parcelable/WikiInfo;", "wikiToken", "isWikiV1Enable", "isWikiV2Enable", "isWikiV3Enable", "isWikiVersionV2", "ver", "provideWikiDeleteItem", "Lcom/bytedance/ee/bear/more/moreprotocol/BaseMoreItem;", "provideWikiMakeCopyItem", "documentName", "provideWikiStarItem", "pullWikiVersion", "spaceId", "wiki-api_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.contract.route.parcelable.a */
public interface IWiki {
    /* renamed from: a */
    BaseMoreItem mo21061a(C4943e eVar);

    /* renamed from: a */
    BaseMoreItem mo21062a(C4943e eVar, String str);

    /* renamed from: a */
    AbstractC68307f<WikiInfo> mo21063a(String str);

    /* renamed from: a */
    AbstractC68307f<String> mo21064a(String str, String str2);

    /* renamed from: a */
    String mo21065a(C4943e eVar, Bundle bundle);

    /* renamed from: a */
    boolean mo21066a();

    /* renamed from: b */
    BaseMoreItem mo21067b(C4943e eVar);

    /* renamed from: b */
    boolean mo21068b();

    /* renamed from: b */
    boolean mo21069b(String str);

    /* renamed from: c */
    boolean mo21070c();

    /* renamed from: c */
    boolean mo21071c(C4943e eVar);

    /* renamed from: d */
    boolean mo21072d();
}
