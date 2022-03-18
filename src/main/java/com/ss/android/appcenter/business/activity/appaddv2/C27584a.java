package com.ss.android.appcenter.business.activity.appaddv2;

import android.app.Application;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1150b;
import androidx.lifecycle.C1174u;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.ss.android.appcenter.business.activity.appaddv2.p1266a.C27595b;
import com.ss.android.appcenter.business.net.dto.C27737a;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.business.net.p1271b.C27720a;
import com.ss.android.appcenter.business.net.searchitem.C27741a;
import com.ss.android.appcenter.business.net.searchitem.C27743b;
import com.ss.android.appcenter.business.net.searchitem.SearchItemData;
import com.ss.android.appcenter.business.net.tagsandrecent.C27750a;
import com.ss.android.appcenter.business.net.tagsandrecent.Tag;
import com.ss.android.appcenter.business.net.tagsandrecent.TagsAndRecentData;
import com.ss.android.appcenter.business.net.useritems.C27767a;
import com.ss.android.appcenter.business.net.useritems.UserItemsData;
import com.ss.android.appcenter.common.util.C28182f;
import com.ss.android.appcenter.common.util.C28184h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.appcenter.business.activity.appaddv2.a */
public class C27584a extends C1150b {
    private C27750a mApiGetTagsAndRecent;
    private C27767a mApiGetUserItems;
    private C27741a mApiSearchItemByQuery;
    private Map<String, C27743b> mApiSearchItemByTagMap;
    private C1177w<Boolean> mShowSearchFragmentLiveData;
    private Map<String, C1177w<C27595b>> mTagDataLiveDataMap = new HashMap();
    public C1174u<List<Tag>> mTagListLiveData = new C1174u<>();
    public Set<String> mUserItemIdSet = new HashSet();
    public List<ItemInfo> mUserItemInfoList = new ArrayList();
    public C1174u<List<ItemInfo>> mUserItemListLiveData = new C1174u<>();
    public Object mUserItemListLock = new Object();

    /* renamed from: com.ss.android.appcenter.business.activity.appaddv2.a$a */
    public interface AbstractC27590a {
        /* renamed from: a */
        void mo98304a(boolean z);
    }

    public C1177w<Boolean> getShowSearchFragmentLiveData() {
        return this.mShowSearchFragmentLiveData;
    }

    public C1174u<List<Tag>> getTagListLiveData() {
        return this.mTagListLiveData;
    }

    public C1174u<List<ItemInfo>> getUserItemListLiveData() {
        return this.mUserItemListLiveData;
    }

    public LiveData<SearchItemData> getSearchLiveData() {
        return this.mApiSearchItemByQuery.mo99032d();
    }

    public void requestTagListFromLocal() {
        this.mApiGetTagsAndRecent.mo99055e();
    }

    public void requestTagListFromNet() {
        this.mApiGetTagsAndRecent.mo99056f();
    }

    public void requestUserItemListFromLocal() {
        this.mApiGetUserItems.mo99080e();
    }

    public void requestUserItemListFromNet() {
        this.mApiGetUserItems.mo99081f();
    }

    public void showAddFragment() {
        this.mShowSearchFragmentLiveData.mo5926a((Boolean) false);
    }

    public void showSearchFragment() {
        this.mShowSearchFragmentLiveData.mo5926a((Boolean) true);
    }

    public void unbindTagsAndRecentLiveData() {
        this.mTagListLiveData.mo6041a(this.mApiGetTagsAndRecent.mo99054d());
    }

    public void unbindUserItemListLiveData() {
        this.mUserItemListLiveData.mo6041a((LiveData<S>) this.mApiGetUserItems.mo99079d());
    }

    public void bindTagsAndRecentLiveData() {
        C1177w<TagsAndRecentData> d = this.mApiGetTagsAndRecent.mo99054d();
        this.mTagListLiveData.mo6041a(d);
        this.mTagListLiveData.mo6042a(d, new AbstractC1178x<TagsAndRecentData>() {
            /* class com.ss.android.appcenter.business.activity.appaddv2.C27584a.C275851 */

            /* renamed from: a */
            public void onChanged(TagsAndRecentData tagsAndRecentData) {
                if (tagsAndRecentData != null) {
                    if (!C28182f.m103238c(tagsAndRecentData.getTagList())) {
                        Tag tag = tagsAndRecentData.getTagList().get(0);
                        ArrayList arrayList = new ArrayList();
                        if (!C28182f.m103238c(tagsAndRecentData.getAvailableItems())) {
                            for (C27737a aVar : tagsAndRecentData.getAvailableItems()) {
                                aVar.mo98963a(true);
                            }
                            arrayList.addAll(tagsAndRecentData.getAvailableItems());
                        }
                        if (!C28182f.m103238c(tagsAndRecentData.getUnavailableItems())) {
                            for (C27737a aVar2 : tagsAndRecentData.getUnavailableItems()) {
                                aVar2.mo98963a(false);
                            }
                            arrayList.addAll(tagsAndRecentData.getUnavailableItems());
                        }
                        C28184h.m103250d("AddAppViewModel", "TagsAndRecentData onChanged. post tag:" + tag.getId());
                        C27584a.this.getTagDataLiveData(tag.getId()).mo5926a(new C27595b(arrayList, tagsAndRecentData.isHasMore()));
                    } else {
                        C28184h.m103250d("AddAppViewModel", "TagsAndRecentData onChanged. tagList is empty");
                    }
                    C27584a.this.mTagListLiveData.mo5926a(tagsAndRecentData.getTagList());
                    return;
                }
                C27584a.this.mTagListLiveData.mo5926a((List<Tag>) null);
            }
        });
    }

    public void bindUserItemListLiveData() {
        LiveData<UserItemsData> d = this.mApiGetUserItems.mo99079d();
        this.mUserItemListLiveData.mo6041a(d);
        this.mUserItemListLiveData.mo6042a(d, new AbstractC1178x<UserItemsData>() {
            /* class com.ss.android.appcenter.business.activity.appaddv2.C27584a.C275862 */

            /* renamed from: a */
            public void onChanged(UserItemsData userItemsData) {
                if (userItemsData == null) {
                    C27584a.this.mUserItemListLiveData.mo5926a((List<ItemInfo>) null);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(UserItemsData.convert(userItemsData.getCommonWidgetItemList(), userItemsData.getAllItemInfos()));
                arrayList.addAll(UserItemsData.convert(userItemsData.getCommonIconItemList(), userItemsData.getAllItemInfos()));
                C27584a.this.mUserItemIdSet = new HashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C27584a.this.mUserItemIdSet.add(((ItemInfo) it.next()).getItemId());
                }
                synchronized (C27584a.this.mUserItemListLock) {
                    C27584a.this.mUserItemInfoList = arrayList;
                }
                C27584a.this.mUserItemListLiveData.mo5926a(arrayList);
            }
        });
    }

    public boolean isItemAdded(String str) {
        return this.mUserItemIdSet.contains(str);
    }

    public void search(String str) {
        this.mApiSearchItemByQuery.mo99031a(str);
    }

    public void requestTagDataFromLocal(String str) {
        C27743b bVar = this.mApiSearchItemByTagMap.get(str);
        if (bVar == null) {
            bVar = new C27743b(getApplication().getApplicationContext(), str);
            this.mApiSearchItemByTagMap.put(str, bVar);
        }
        bVar.mo99035b();
    }

    public void requestTagDataFromNet(String str) {
        C27743b bVar = this.mApiSearchItemByTagMap.get(str);
        if (bVar == null) {
            bVar = new C27743b(getApplication().getApplicationContext(), str);
            this.mApiSearchItemByTagMap.put(str, bVar);
        }
        bVar.mo99034a(str);
    }

    private C1177w<SearchItemData> getSearchTagLiveData(String str) {
        C27743b bVar = this.mApiSearchItemByTagMap.get(str);
        if (bVar != null) {
            return bVar.mo99033a();
        }
        C27743b bVar2 = new C27743b(getApplication().getApplicationContext(), str);
        this.mApiSearchItemByTagMap.put(str, bVar2);
        return bVar2.mo99033a();
    }

    public synchronized void deleteItemSuccess(String str) {
        synchronized (this.mUserItemListLock) {
            this.mUserItemIdSet.remove(str);
            int size = this.mUserItemInfoList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (TextUtils.equals(this.mUserItemInfoList.get(i).getItemId(), str)) {
                    this.mUserItemInfoList.remove(i);
                    break;
                } else {
                    i++;
                }
            }
            this.mUserItemListLiveData.mo5926a(this.mUserItemInfoList);
        }
    }

    public C1177w<C27595b> getTagDataLiveData(String str) {
        C1177w<C27595b> wVar = this.mTagDataLiveDataMap.get(str);
        if (wVar != null) {
            return wVar;
        }
        final C1174u uVar = new C1174u();
        this.mTagDataLiveDataMap.put(str, uVar);
        getSearchTagLiveData(str).mo5925a(new AbstractC1178x<SearchItemData>() {
            /* class com.ss.android.appcenter.business.activity.appaddv2.C27584a.C275895 */

            /* renamed from: a */
            public void onChanged(SearchItemData searchItemData) {
                if (searchItemData == null) {
                    uVar.mo5926a((Object) null);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (C27737a aVar : searchItemData.getAvailableItems()) {
                    aVar.mo98963a(true);
                }
                arrayList.addAll(searchItemData.getAvailableItems());
                for (C27737a aVar2 : searchItemData.getUnavailableItems()) {
                    aVar2.mo98963a(false);
                }
                arrayList.addAll(searchItemData.getUnavailableItems());
                uVar.mo5926a(new C27595b(arrayList, searchItemData.isHasMore()));
            }
        });
        return uVar;
    }

    public C27584a(Application application) {
        super(application);
        C28184h.m103250d("App_Add_Page", "init AddAppViewModel");
        this.mApiGetTagsAndRecent = new C27750a(application.getApplicationContext());
        this.mApiSearchItemByQuery = new C27741a();
        this.mApiGetUserItems = new C27767a(application.getApplicationContext());
        this.mApiSearchItemByTagMap = new HashMap();
        this.mShowSearchFragmentLiveData = new C1177w<>();
    }

    public void deleteAppItem(final String str, final AbstractC27590a aVar) {
        C27720a.m101370b(str, new C27720a.AbstractC27723a() {
            /* class com.ss.android.appcenter.business.activity.appaddv2.C27584a.C275884 */

            @Override // com.ss.android.appcenter.business.net.p1271b.C27720a.AbstractC27723a
            /* renamed from: a */
            public void mo98302a(boolean z) {
                if (z) {
                    C27584a.this.deleteItemSuccess(str);
                }
                aVar.mo98304a(z);
            }
        });
    }

    public void addItemSuccess(String str, String str2) {
        synchronized (this.mUserItemListLock) {
            this.mUserItemIdSet.add(str);
            this.mUserItemInfoList.add(new ItemInfo(str, str2));
            this.mUserItemListLiveData.mo5926a(this.mUserItemInfoList);
        }
    }

    public void addAppItem(final String str, final String str2, final AbstractC27590a aVar) {
        C27720a.m101369a(str, new C27720a.AbstractC27723a() {
            /* class com.ss.android.appcenter.business.activity.appaddv2.C27584a.C275873 */

            @Override // com.ss.android.appcenter.business.net.p1271b.C27720a.AbstractC27723a
            /* renamed from: a */
            public void mo98302a(boolean z) {
                if (z) {
                    C27584a.this.addItemSuccess(str, str2);
                }
                aVar.mo98304a(z);
            }
        });
    }
}
