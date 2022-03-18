package com.ss.android.lark.search.impl.func.chatinside.view.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.constant.SearchConstants;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import com.ss.android.lark.search.impl.C53339b;
import com.ss.android.lark.search.impl.func.chatinside.view.dialog.C53532a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.view.dialog.b */
public class DialogC53534b extends Dialog {

    /* renamed from: a */
    private static SparseArray<String> f132248a;

    /* renamed from: b */
    private CommonTitleBar f132249b;

    /* renamed from: c */
    private RecyclerView f132250c;

    /* renamed from: d */
    private C53532a f132251d;

    /* renamed from: e */
    private Activity f132252e;

    /* renamed from: f */
    private AbstractC53535a f132253f;

    /* renamed from: g */
    private ISearchModuleDependency f132254g = C53258a.m205939a();

    /* renamed from: h */
    private ISearchModuleDependency.AbstractC53321h f132255h = C53258a.m205939a().mo181759h();

    /* renamed from: com.ss.android.lark.search.impl.func.chatinside.view.dialog.b$a */
    public interface AbstractC53535a {
        void onPick(SearchConstants.SpaceType spaceType);
    }

    /* renamed from: a */
    private void m207317a() {
        m207322c();
    }

    /* renamed from: c */
    private void m207322c() {
        m207323d();
        m207324e();
    }

    /* renamed from: b */
    private void m207321b() {
        Window window = getWindow();
        if (window == null) {
            Log.m165383e("LarkSearch.Search.SpacePickDialog", "window is null");
            return;
        }
        window.setGravity(80);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = DeviceUtils.getScreenWidth(getContext());
        attributes.height = -2;
        attributes.softInputMode = 16;
        window.setAttributes(attributes);
        window.setDimAmount(0.3f);
        window.setWindowAnimations(R.style.AnimBottomInBottomOut);
    }

    /* renamed from: d */
    private void m207323d() {
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(R.id.title_bar);
        this.f132249b = commonTitleBar;
        commonTitleBar.setTitle(UIUtils.getString(this.f132252e, R.string.Lark_Search_DocTypeFilter));
        this.f132249b.setLeftImageResource(CommonTitleBarConstants.ICON_CLOSE);
        this.f132249b.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.search.impl.func.chatinside.view.dialog.$$Lambda$b$BtPvcVBFHfqViVHPDFtGnI5vFDc */

            public final void onClick(View view) {
                DialogC53534b.this.m207318a((DialogC53534b) view);
            }
        });
    }

    /* renamed from: e */
    private void m207324e() {
        this.f132250c = (RecyclerView) findViewById(R.id.space_pick_rv);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f132252e, 3);
        gridLayoutManager.setOrientation(1);
        this.f132250c.setLayoutManager(gridLayoutManager);
        C53532a aVar = new C53532a();
        this.f132251d = aVar;
        aVar.mo182765a(new C53532a.AbstractC53533a() {
            /* class com.ss.android.lark.search.impl.func.chatinside.view.dialog.$$Lambda$b$58XzpjXCZwOCOaU4QYjChAh9MS8 */

            @Override // com.ss.android.lark.search.impl.func.chatinside.view.dialog.C53532a.AbstractC53533a
            public final void onItemClick(SearchConstants.SpaceType spaceType, int i) {
                DialogC53534b.this.m207320a(spaceType, i);
            }
        });
        this.f132250c.setAdapter(this.f132251d);
        this.f132251d.addAll(m207325f());
    }

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        f132248a = sparseArray;
        sparseArray.put(SearchConstants.SpaceType.ALL.getValue(), "all");
        f132248a.put(SearchConstants.SpaceType.DOC.getValue(), "doc");
        f132248a.put(SearchConstants.SpaceType.SHEET.getValue(), "sheet");
        f132248a.put(SearchConstants.SpaceType.MINDNOTE.getValue(), "mindnote");
        f132248a.put(SearchConstants.SpaceType.FILE.getValue(), "file");
        f132248a.put(SearchConstants.SpaceType.SLIDE.getValue(), "slide");
        f132248a.put(SearchConstants.SpaceType.BITABLE.getValue(), "bitable");
    }

    /* renamed from: f */
    private List<C53536c> m207325f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C53536c(SearchConstants.SpaceType.ALL, R.drawable.ic_svg_space_pick_all, UIUtils.getString(this.f132252e, R.string.Lark_Legacy_All)));
        arrayList.add(new C53536c(SearchConstants.SpaceType.DOC, this.f132255h.mo181809a(SearchConstants.SpaceType.DOC.getValue()), UIUtils.getString(this.f132252e, R.string.Lark_Search_DocSearchFilter)));
        arrayList.add(new C53536c(SearchConstants.SpaceType.SHEET, this.f132255h.mo181809a(SearchConstants.SpaceType.SHEET.getValue()), UIUtils.getString(this.f132252e, R.string.Lark_Search_SheetSearchFilter)));
        if (C53339b.m206450j()) {
            arrayList.add(new C53536c(SearchConstants.SpaceType.SLIDE, this.f132255h.mo181809a(SearchConstants.SpaceType.SLIDE.getValue()), UIUtils.getString(this.f132252e, R.string.Lark_Search_SlideSearchFilter)));
        }
        if (C53339b.m206451k()) {
            arrayList.add(new C53536c(SearchConstants.SpaceType.MINDNOTE, this.f132255h.mo181809a(SearchConstants.SpaceType.MINDNOTE.getValue()), UIUtils.getString(this.f132252e, R.string.Lark_Search_MindNoteSearchFilter)));
        }
        if (C53339b.m206452l()) {
            arrayList.add(new C53536c(SearchConstants.SpaceType.BITABLE, this.f132255h.mo181809a(SearchConstants.SpaceType.BITABLE.getValue()), UIUtils.getString(this.f132252e, R.string.Lark_Search_BitableSearchFilter)));
        }
        arrayList.add(new C53536c(SearchConstants.SpaceType.FILE, this.f132255h.mo181809a(SearchConstants.SpaceType.FILE.getValue()), UIUtils.getString(this.f132252e, R.string.Lark_Search_FileSearchFilter)));
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m207318a(View view) {
        dismiss();
    }

    /* renamed from: a */
    private void m207319a(SearchConstants.SpaceType spaceType) {
        dismiss();
        AbstractC53535a aVar = this.f132253f;
        if (aVar != null) {
            aVar.onPick(spaceType);
        }
    }

    public DialogC53534b(Activity activity) {
        super(activity, R.style.CommonDialog);
        this.f132252e = activity;
        setContentView(LayoutInflater.from(activity).inflate(R.layout.dialog_chat_inside_search_space_pick, (ViewGroup) null));
        m207321b();
        m207317a();
    }

    /* renamed from: a */
    public void mo182766a(AbstractC53535a aVar) {
        this.f132253f = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m207320a(SearchConstants.SpaceType spaceType, int i) {
        m207319a(spaceType);
    }
}
