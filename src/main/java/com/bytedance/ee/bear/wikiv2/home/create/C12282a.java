package com.bytedance.ee.bear.wikiv2.home.create;

import com.bytedance.ee.bear.wikiv2.home.C12267b;
import com.bytedance.ee.bear.wikiv2.home.create.WikiCreateSelectView;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004\"\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\u000b"}, d2 = {"selectItemDocs", "", "Lcom/bytedance/ee/bear/wikiv2/home/create/WikiCreateSelectView$SelectItem;", "getSelectItemDocs", "()Ljava/util/List;", "selectItemDocxs", "getSelectItemDocxs", "selectItems", "getSelectItems", "uploadItems", "getUploadItems", "wiki-implv2_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.home.create.a */
public final class C12282a {
    /* renamed from: a */
    public static final List<WikiCreateSelectView.SelectItem> m51141a() {
        if (C12267b.m51046f()) {
            return m51143c();
        }
        return m51144d();
    }

    /* renamed from: b */
    public static final List<WikiCreateSelectView.SelectItem> m51142b() {
        ArrayList arrayList = new ArrayList();
        if (C12267b.m51044d()) {
            arrayList.add(new WikiCreateSelectView.SelectItem(SelectIndex.MEDIA, R.drawable.ud_icon_wiki_image_colorful, R.string.Doc_Facade_UploadMedia));
        }
        if (C12267b.m51044d()) {
            arrayList.add(new WikiCreateSelectView.SelectItem(SelectIndex.FILE, R.drawable.ud_icon_wiki_upload_colorful, R.string.Doc_Facade_UploadFile));
        }
        return arrayList;
    }

    /* renamed from: c */
    private static final List<WikiCreateSelectView.SelectItem> m51143c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new WikiCreateSelectView.SelectItem(SelectIndex.DOCX, R.drawable.ud_icon_wiki_docx_colorful, R.string.Doc_Facade_Document));
        arrayList.add(new WikiCreateSelectView.SelectItem(SelectIndex.SHEET, R.drawable.ud_icon_wiki_sheet_colorful, R.string.Doc_Facade_CreateSheet));
        if (C12267b.m51042b()) {
            arrayList.add(new WikiCreateSelectView.SelectItem(SelectIndex.MINDNOTE, R.drawable.ud_icon_wiki_mindnote_colorful, R.string.Doc_Facade_MindNote));
        }
        if (C12267b.m51043c()) {
            arrayList.add(new WikiCreateSelectView.SelectItem(SelectIndex.BITABLE, R.drawable.ud_icon_wiki_bitable_colorful, R.string.Doc_Facade_Bitable));
        }
        if (!C12267b.m51047g()) {
            arrayList.add(new WikiCreateSelectView.SelectItem(SelectIndex.DOC, R.drawable.ud_icon_wiki_doc_colorful, R.string.Doc_Facade_Document));
        }
        return arrayList;
    }

    /* renamed from: d */
    private static final List<WikiCreateSelectView.SelectItem> m51144d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new WikiCreateSelectView.SelectItem(SelectIndex.DOC, R.drawable.ud_icon_wiki_doc_colorful, R.string.Doc_Facade_Document));
        arrayList.add(new WikiCreateSelectView.SelectItem(SelectIndex.SHEET, R.drawable.ud_icon_wiki_sheet_colorful, R.string.Doc_Facade_CreateSheet));
        if (C12267b.m51042b()) {
            arrayList.add(new WikiCreateSelectView.SelectItem(SelectIndex.MINDNOTE, R.drawable.ud_icon_wiki_mindnote_colorful, R.string.Doc_Facade_MindNote));
        }
        if (C12267b.m51043c()) {
            arrayList.add(new WikiCreateSelectView.SelectItem(SelectIndex.BITABLE, R.drawable.ud_icon_wiki_bitable_colorful, R.string.Doc_Facade_Bitable));
        }
        return arrayList;
    }
}
