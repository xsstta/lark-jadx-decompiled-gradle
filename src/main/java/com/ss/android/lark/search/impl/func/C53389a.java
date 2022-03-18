package com.ss.android.lark.search.impl.func;

import android.util.SparseArray;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.searchcommon.constant.C53887a;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.search.impl.func.a */
public class C53389a {

    /* renamed from: a */
    private SparseArray<C53887a> f131948a = new SparseArray<>();

    public C53389a() {
        m206698a();
    }

    /* renamed from: a */
    private void m206698a() {
        this.f131948a.put(1, new C53887a(UIHelper.getString(R.string.Lark_Legacy_Contact), R.drawable.ic_svg_search_person));
        this.f131948a.put(2, new C53887a(UIHelper.getString(R.string.Lark_Legacy_Group), R.drawable.ic_svg_search_group));
        this.f131948a.put(10, new C53887a(UIHelper.getString(R.string.Lark_HelpDesk_HelpDesk), R.drawable.ic_svg_search_helpdesk));
        this.f131948a.put(3, new C53887a(UIHelper.getString(R.string.Lark_Legacy_TitleChatRecord), R.drawable.ic_svg_search_message));
        this.f131948a.put(8, new C53887a(UIHelper.getString(R.string.Lark_Search_Posts), R.drawable.ic_svg_search_thread));
        this.f131948a.put(6, new C53887a(UIHelper.getString(R.string.Lark_Search_DocsFile), R.drawable.ic_svg_search_spaces));
        this.f131948a.put(12, new C53887a(UIHelper.getString(R.string.Lark_Search_Apps), R.drawable.ic_svg_search_app_label));
        this.f131948a.put(15, new C53887a(UIHelper.getString(R.string.Lark_Search_Wiki), R.drawable.ic_svg_search_wiki));
        this.f131948a.put(10000004, new C53887a(UIHelper.getString(R.string.Lark_Legacy_SideEvent), R.drawable.ic_svg_search_calendar));
        this.f131948a.put(100000010, new C53887a(UIHelper.getString(R.string.Lark_Legacy_Contact), R.drawable.ic_svg_search_person));
        this.f131948a.put(100000011, new C53887a(UIHelper.getString(R.string.Lark_Search_Posts), R.drawable.ic_svg_search_thread));
        this.f131948a.put(100000012, new C53887a(UIHelper.getString(R.string.Lark_Search_SuggestedListTitle), R.drawable.search_icon));
    }

    /* renamed from: a */
    public C53887a mo182358a(int i) {
        C53887a aVar = this.f131948a.get(i);
        if (aVar != null) {
            return aVar;
        }
        Log.m165383e("LarkSearch.Search.SearchGroupDataManager", "result type is unknown, " + i);
        return new C53887a("", R.drawable.search_icon);
    }
}
