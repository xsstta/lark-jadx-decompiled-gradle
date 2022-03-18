package com.ss.android.lark.search.redesign.dto;

import androidx.fragment.app.Fragment;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.pb.searches.SearchTab;
import com.ss.android.lark.pb.searches.SearchTabName;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import com.ss.android.lark.search.redesign.AppFragment;
import com.ss.android.lark.search.redesign.BaseSearchTabFragment;
import com.ss.android.lark.search.redesign.ChatFragment;
import com.ss.android.lark.search.redesign.ChatterFragment;
import com.ss.android.lark.search.redesign.DocFragment;
import com.ss.android.lark.search.redesign.MessageFragment;
import com.ss.android.lark.search.redesign.OnCallFragment;
import com.ss.android.lark.search.redesign.OpenSearchFragment;
import com.ss.android.lark.search.redesign.TopResultFragment;
import com.ss.android.lark.searchcommon.constant.SearchCommonConstants;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.utils.ImprId;
import com.ss.android.lark.searchcommon.utils.SessionManager;
import java.io.Serializable;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0002J\u0006\u0010.\u001a\u00020/J\b\u00100\u001a\u00020\u0003H\u0016J\u0006\u00101\u001a\u00020\u0005J\u0006\u00102\u001a\u00020\u0005J\u0006\u00103\u001a\u00020\u0005J\u0006\u00104\u001a\u00020\u0005J\u0006\u00105\u001a\u000206J\u0006\u0010\u0004\u001a\u00020\u0005J\b\u00107\u001a\u0004\u0018\u000108J\b\u00109\u001a\u00020\u0005H\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u001a\u0010!\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010$R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0011R\u0011\u0010&\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006:"}, d2 = {"Lcom/ss/android/lark/search/redesign/dto/TabInfo;", "Ljava/io/Serializable;", "sceneType", "", "title", "", "mtype", "mapp_id", "micon_url", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "docForLark", "Lcom/ss/android/lark/search/dependency/ISearchModuleDependency$IDocDependency$IDocForLark;", "getDocForLark", "()Lcom/ss/android/lark/search/dependency/ISearchModuleDependency$IDocDependency$IDocForLark;", "setDocForLark", "(Lcom/ss/android/lark/search/dependency/ISearchModuleDependency$IDocDependency$IDocForLark;)V", "getMapp_id", "()Ljava/lang/String;", "getMicon_url", "getMtype", "()Ljava/lang/Integer;", "setMtype", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "page", "getPage", "()I", "setPage", "(I)V", "getSceneType", "seqIdSnapshot", "getSeqIdSnapshot", "setSeqIdSnapshot", "sessionSnapshot", "getSessionSnapshot", "setSessionSnapshot", "(Ljava/lang/String;)V", "getTitle", ShareHitPoint.f121869d, "Lcom/ss/android/lark/searchcommon/dto/Scene$Type;", "getType", "()Lcom/ss/android/lark/searchcommon/dto/Scene$Type;", "equals", "", "other", "", "fragment", "Landroidx/fragment/app/Fragment;", "hashCode", "imprId", "reporterLocation", "searchHitPointLocation", "searchPage", "tabHistorySource", "Lcom/ss/android/lark/searchcommon/constant/SearchCommonConstants$SearchHistorySource;", "toSearchTab", "Lcom/ss/android/lark/pb/searches/SearchTab;", "toString", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TabInfo implements Serializable {
    private transient ISearchModuleDependency.AbstractC53321h.AbstractC53322a docForLark;
    private final String mapp_id;
    private final String micon_url;
    private Integer mtype;
    private int page;
    private final int sceneType;
    private int seqIdSnapshot;
    private String sessionSnapshot;
    private final String title;
    private final Scene.Type type;

    public final ISearchModuleDependency.AbstractC53321h.AbstractC53322a getDocForLark() {
        return this.docForLark;
    }

    public final String getMapp_id() {
        return this.mapp_id;
    }

    public final String getMicon_url() {
        return this.micon_url;
    }

    public final Integer getMtype() {
        return this.mtype;
    }

    public final int getPage() {
        return this.page;
    }

    public final int getSceneType() {
        return this.sceneType;
    }

    public final int getSeqIdSnapshot() {
        return this.seqIdSnapshot;
    }

    public final String getSessionSnapshot() {
        return this.sessionSnapshot;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Scene.Type getType() {
        return this.type;
    }

    public final String title() {
        return this.title;
    }

    public final String imprId() {
        return new ImprId(this.sessionSnapshot, this.seqIdSnapshot).imprId();
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.sceneType), this.mapp_id);
    }

    public final String reporterLocation() {
        switch (C53741a.f132672f[this.type.ordinal()]) {
            case 1:
                return "quick_search";
            case 2:
                return "contacts";
            case 3:
                return "groups";
            case 4:
                return "messages";
            case 5:
                return "apps";
            case 6:
                return "helpdesk";
            case 7:
                return "slash";
            case 8:
                return "docs";
            default:
                return "";
        }
    }

    public final String searchHitPointLocation() {
        switch (C53741a.f132671e[this.type.ordinal()]) {
            case 1:
                return "all_results";
            case 2:
                return "contacts";
            case 3:
                return "groups";
            case 4:
                return "message";
            case 5:
                return "open_app";
            case 6:
                return "helpdesk";
            case 7:
                return "open_search";
            case 8:
                return "docs";
            default:
                return "";
        }
    }

    public final String searchPage() {
        switch (C53741a.f132670d[this.type.ordinal()]) {
            case 1:
                return "mobile_all";
            case 2:
                return "mobile_msg";
            case 3:
                return "mobile_group";
            case 4:
                return "mobile_helpdesk";
            case 5:
                return "mobile_apps";
            case 6:
                return "mobile_contact";
            default:
                return "";
        }
    }

    public final SearchCommonConstants.SearchHistorySource tabHistorySource() {
        switch (C53741a.f132669c[this.type.ordinal()]) {
            case 1:
                return SearchCommonConstants.SearchHistorySource.MAIN;
            case 2:
                return SearchCommonConstants.SearchHistorySource.MESSAGE;
            case 3:
                return SearchCommonConstants.SearchHistorySource.CHAT;
            case 4:
                return SearchCommonConstants.SearchHistorySource.SPACE;
            case 5:
                return SearchCommonConstants.SearchHistorySource.WIKI;
            case 6:
                return SearchCommonConstants.SearchHistorySource.USER;
            default:
                return SearchCommonConstants.SearchHistorySource.UNKNOWN;
        }
    }

    public String toString() {
        return "TabInfo(sceneType=" + this.sceneType + ", title='" + this.title + "', mtype=" + this.mtype + ", mapp_id=" + this.mapp_id + ", type=" + this.type + ')';
    }

    public final Fragment fragment() {
        Fragment a;
        switch (C53741a.f132667a[this.type.ordinal()]) {
            case 1:
                return new TopResultFragment();
            case 2:
                if (C53258a.m205939a().mo181745a("lark.search.doc.tab")) {
                    return new DocFragment();
                }
                ISearchModuleDependency a2 = C53258a.m205939a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "SearchModule.getDependency()");
                ISearchModuleDependency.AbstractC53321h.AbstractC53322a a3 = a2.mo181759h().mo181810a(true);
                this.docForLark = a3;
                if (a3 == null || (a = a3.mo143225a()) == null) {
                    return new BaseSearchTabFragment();
                }
                return a;
            case 3:
                return new MessageFragment();
            case 4:
                return new ChatFragment();
            case 5:
                return new ChatterFragment();
            case 6:
                return new OpenSearchFragment();
            case 7:
                return new AppFragment();
            case 8:
                return new OnCallFragment();
            default:
                return new BaseSearchTabFragment();
        }
    }

    public final SearchTab toSearchTab() {
        Integer num = this.mtype;
        if (num != null) {
            String str = this.title;
            if (num == null) {
                Intrinsics.throwNpe();
            }
            return new SearchTab(str, SearchTabName.fromValue(num.intValue()), this.mapp_id, this.micon_url);
        }
        switch (C53741a.f132668b[this.type.ordinal()]) {
            case 1:
                return new SearchTab(title(), SearchTabName.APP_TAB, "", "");
            case 2:
                return new SearchTab(title(), SearchTabName.MESSAGE_TAB, "", "");
            case 3:
                return new SearchTab(title(), SearchTabName.CHAT_TAB, "", "");
            case 4:
                return new SearchTab(title(), SearchTabName.CHATTER_TAB, "", "");
            case 5:
                return new SearchTab(title(), SearchTabName.DOCS_TAB, "", "");
            case 6:
                return new SearchTab(title(), SearchTabName.WIKI_TAB, "", "");
            case 7:
                return new SearchTab(title(), SearchTabName.HELPDESK_TAB, "", "");
            default:
                return null;
        }
    }

    public final void setDocForLark(ISearchModuleDependency.AbstractC53321h.AbstractC53322a aVar) {
        this.docForLark = aVar;
    }

    public final void setMtype(Integer num) {
        this.mtype = num;
    }

    public final void setPage(int i) {
        this.page = i;
    }

    public final void setSeqIdSnapshot(int i) {
        this.seqIdSnapshot = i;
    }

    public final void setSessionSnapshot(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.sessionSnapshot = str;
    }

    public boolean equals(Object obj) {
        String str;
        if (!(obj instanceof TabInfo)) {
            return false;
        }
        TabInfo tabInfo = (TabInfo) obj;
        if (tabInfo.sceneType != this.sceneType) {
            return false;
        }
        String str2 = tabInfo.mapp_id;
        if (str2 == null && this.mapp_id == null) {
            return true;
        }
        if (str2 == null || (str = this.mapp_id) == null || !Intrinsics.areEqual(str2, str) || !Intrinsics.areEqual(tabInfo.title, this.title)) {
            return false;
        }
        return true;
    }

    public TabInfo(int i, String str, Integer num, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        this.sceneType = i;
        this.title = str;
        this.mtype = num;
        this.mapp_id = str2;
        this.micon_url = str3;
        this.type = Scene.Type.Companion.mo183841a(i);
        this.sessionSnapshot = SessionManager.m209245a();
        this.seqIdSnapshot = SessionManager.m209246b();
        this.page = 1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TabInfo(int i, String str, Integer num, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3);
    }
}
