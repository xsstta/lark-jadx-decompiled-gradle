package com.bytedance.ee.bear.wikiv2.searchv2;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ee.bear.wikiv2.home.api.SpaceCover;
import com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchPuller;
import com.bytedance.ee.util.p701d.C13615c;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a(\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\n\u001a\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002\u001a\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002\u001a\u0018\u0010\r\u001a\u00020\u00012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004H\u0002\u001a\u0012\u0010\u000f\u001a\u00020\u00012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XD¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"FILE_SEPARATOR", "", "TAG", "convertSearchResult", "", "Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchPuller$Data;", "queryKey", "spaceSearch", "", "convertSpaceSearchResult", "convertWikiSearchResult", "getParentPath", "parentPath", "getPathName", "pathName", "wiki-implv2_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.a */
public final class C12359a {

    /* renamed from: a */
    private static final String f33155a = "SearchResultConverter";

    /* renamed from: a */
    private static final String m51444a(String str) {
        if (TextUtils.isEmpty(str)) {
            return ".../" + C13615c.f35773a.getString(R.string.Doc_Wiki_UntitledPage);
        }
        return ".../" + str;
    }

    /* renamed from: a */
    private static final String m51445a(List<String> list) {
        if (list == null || CollectionUtils.isEmpty(list)) {
            String string = C13615c.f35773a.getString(R.string.Doc_Wiki_SearchResult_ParentInfo);
            Intrinsics.checkExpressionValueIsNotNull(string, "ContextUtils.baseApplica…_SearchResult_ParentInfo)");
            return string;
        } else if (list.size() == 1) {
            return m51444a(list.get(0));
        } else {
            if (list.size() == 2) {
                return m51444a(list.get(1));
            }
            return m51444a("");
        }
    }

    /* renamed from: b */
    private static final List<C12360b> m51448b(WikiSearchPuller.Data data, String str) {
        List<WikiSearchPuller.Data.SpacesInfo> list;
        ArrayList arrayList = new ArrayList();
        if (data != null) {
            list = data.spaces;
        } else {
            list = null;
        }
        if (list != null) {
            for (WikiSearchPuller.Data.SpacesInfo spacesInfo : data.spaces) {
                String str2 = spacesInfo.space_id;
                Intrinsics.checkExpressionValueIsNotNull(str2, "spaceInfo.space_id");
                String str3 = spacesInfo.space_name;
                Intrinsics.checkExpressionValueIsNotNull(str3, "spaceInfo.space_name");
                String str4 = spacesInfo.space_icon;
                Intrinsics.checkExpressionValueIsNotNull(str4, "spaceInfo.space_icon");
                String str5 = spacesInfo.description;
                Intrinsics.checkExpressionValueIsNotNull(str5, "spaceInfo.description");
                int i = spacesInfo.attr;
                boolean z = spacesInfo.is_star;
                SpaceCover spaceCover = spacesInfo.spaceCover;
                Intrinsics.checkExpressionValueIsNotNull(spaceCover, "spaceInfo.spaceCover");
                arrayList.add(new C12360b(str, str3, str2, "", str5, z, data.has_more, i, str4, spaceCover, spacesInfo.wiki_scope));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static final List<C12360b> m51446a(WikiSearchPuller.Data data, String str) {
        List<WikiSearchPuller.Data.C12344Entity.ObjsBean.WikiInfo> list;
        Map<String, WikiSearchPuller.Data.C12344Entity.ObjsBean> map;
        ArrayList arrayList = new ArrayList();
        if ((data != null ? data.tokens : null) != null) {
            for (String str2 : data.tokens) {
                WikiSearchPuller.Data.C12344Entity entity = data.entities;
                WikiSearchPuller.Data.C12344Entity.ObjsBean objsBean = (entity == null || (map = entity.objs) == null) ? null : map.get(str2);
                WikiSearchPuller.Data.C12344Entity.ObjsBean.WikiInfo wikiInfo = (objsBean == null || (list = objsBean.wiki_infos) == null) ? null : list.get(0);
                if (!(objsBean == null || wikiInfo == null)) {
                    arrayList.add(new C12360b(str, objsBean.title, wikiInfo.wiki_token, objsBean.token, objsBean.type, wikiInfo.space_id, wikiInfo.space_name, m51445a(wikiInfo.main_path), data.has_more));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final List<C12360b> m51447a(WikiSearchPuller.Data data, String str, boolean z) {
        if (z) {
            return m51448b(data, str);
        }
        return m51446a(data, str);
    }
}
