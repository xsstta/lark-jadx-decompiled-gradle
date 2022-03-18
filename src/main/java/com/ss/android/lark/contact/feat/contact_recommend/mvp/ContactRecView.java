package com.ss.android.lark.contact.feat.contact_recommend.mvp;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.mvp.C26034b;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.feat.common.SingleItemData;
import com.ss.android.lark.contact.feat.contact_recommend.entity.ContactRecData;
import com.ss.android.lark.contact.feat.contact_recommend.entity.EmptyData;
import com.ss.android.lark.contact.feat.contact_recommend.entity.ErrorData;
import com.ss.android.lark.contact.feat.contact_recommend.mvp.IContactRecContact;
import com.ss.android.lark.contact.feat.contact_recommend.mvp.list.ContactAddItemCallback;
import com.ss.android.lark.contact.feat.contact_recommend.mvp.list.ContactAddItemCell;
import com.ss.android.lark.contact.feat.contact_recommend.mvp.list.EmptyItemCallback;
import com.ss.android.lark.contact.feat.contact_recommend.mvp.list.EmptyItemCell;
import com.ss.android.lark.contact.feat.contact_recommend.mvp.list.ErrorRetryItemCallback;
import com.ss.android.lark.contact.feat.contact_recommend.mvp.list.ErrorRetryItemCell;
import com.ss.android.lark.contact.feat.contact_recommend.mvp.list.ItemListViewHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u0001\u001aB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\u0018\u0010\u0016\u001a\u00020\u000f2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0016J\u0012\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/ContactRecView;", "Lcom/larksuite/framework/mvp/BaseView;", "Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/IContactRecContact$IView$IViewDelegate;", "Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/IContactRecContact$IView;", "rootView", "Landroid/view/View;", "callback", "Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/ContactRecView$ContactAddViewCallback;", "(Landroid/view/View;Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/ContactRecView$ContactAddViewCallback;)V", "dataList", "", "Lcom/ss/android/lark/contact/feat/contact_recommend/entity/ContactRecData;", "listViewHelper", "Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/list/ItemListViewHelper;", "bindRecyclerView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "create", "initView", "showEmpty", "showError", "showList", "showSkeleton", "updateItemData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "ContactAddViewCallback", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.feat.a.b.c */
public final class ContactRecView extends C26034b<IContactRecContact.IView.IViewDelegate> implements IContactRecContact.IView {

    /* renamed from: a */
    private ItemListViewHelper f91559a;

    /* renamed from: b */
    private List<ContactRecData> f91560b;

    /* renamed from: c */
    private final View f91561c;

    /* renamed from: d */
    private final ContactAddViewCallback f91562d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/ContactRecView$ContactAddViewCallback;", "Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/list/EmptyItemCallback;", "Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/list/ContactAddItemCallback;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.feat.a.b.c$a */
    public interface ContactAddViewCallback extends ContactAddItemCallback, EmptyItemCallback {
    }

    @Override // com.ss.android.lark.contact.feat.contact_recommend.mvp.IContactRecContact.IView
    /* renamed from: a */
    public void mo130717a() {
        ItemListViewHelper jVar = this.f91559a;
        if (jVar != null) {
            jVar.mo130699a();
        }
    }

    @Override // com.larksuite.framework.mvp.C26034b, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m138511a(this.f91561c);
    }

    /* renamed from: b */
    public void mo130720b() {
        ItemListViewHelper jVar = this.f91559a;
        if (jVar != null) {
            jVar.mo130703b();
            jVar.mo130701a((SingleItemData) new EmptyData());
        }
    }

    @Override // com.ss.android.lark.contact.feat.contact_recommend.mvp.IContactRecContact.IView
    /* renamed from: d */
    public void mo130721d() {
        ItemListViewHelper jVar = this.f91559a;
        if (jVar != null) {
            jVar.mo130703b();
            jVar.mo130701a((SingleItemData) new ErrorData());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/contact/feat/contact_recommend/mvp/ContactRecView$bindRecyclerView$1", "Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/list/ErrorRetryItemCallback;", "onRetryClick", "", "view", "Landroid/view/View;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.feat.a.b.c$b */
    public static final class C35423b implements ErrorRetryItemCallback {

        /* renamed from: a */
        final /* synthetic */ ContactRecView f91563a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35423b(ContactRecView cVar) {
            this.f91563a = cVar;
        }

        @Override // com.ss.android.lark.contact.feat.contact_recommend.mvp.list.ErrorRetryItemCallback
        /* renamed from: a */
        public void mo130694a(View view) {
            IContactRecContact.IView.IViewDelegate aVar = (IContactRecContact.IView.IViewDelegate) this.f91563a.mo92555c();
            if (aVar != null) {
                aVar.mo130713a();
            }
        }
    }

    /* renamed from: a */
    private final void m138511a(View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.contacts_list);
        if (recyclerView != null) {
            m138512a(recyclerView);
        }
    }

    @Override // com.ss.android.lark.contact.feat.contact_recommend.mvp.IContactRecContact.IView
    /* renamed from: a */
    public void mo130718a(ContactRecData aVar) {
        ItemListViewHelper jVar;
        if (aVar != null && (jVar = this.f91559a) != null) {
            jVar.mo130700a(aVar);
        }
    }

    @Override // com.ss.android.lark.contact.feat.contact_recommend.mvp.IContactRecContact.IView
    /* renamed from: a */
    public void mo130719a(List<ContactRecData> list) {
        this.f91560b = list;
        if (list == null || list.isEmpty()) {
            mo130720b();
            return;
        }
        ItemListViewHelper jVar = this.f91559a;
        if (jVar != null) {
            jVar.mo130703b();
            jVar.mo130702a(list);
        }
    }

    /* renamed from: a */
    private final void m138512a(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        ItemListViewHelper.Companion bVar = ItemListViewHelper.f91539g;
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        this.f91559a = bVar.mo130708a(context).mo130705a(8, context.getResources().getColor(R.color.bg_base)).mo130706a(EmptyData.class, new EmptyItemCell(this.f91562d)).mo130706a(ContactRecData.class, new ContactAddItemCell(this.f91562d)).mo130706a(ErrorData.class, new ErrorRetryItemCell(new C35423b(this))).mo130704a(R.layout.contact_item_simple_skeleton).mo130707a(recyclerView);
    }

    public ContactRecView(View view, ContactAddViewCallback aVar) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        this.f91561c = view;
        this.f91562d = aVar;
    }
}
