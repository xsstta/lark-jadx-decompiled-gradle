package com.ss.android.lark.contact.feat.contact_recommend.mvp.list;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.avatar.AvatarModel;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.feat.common.ContactSimpleItemView;
import com.ss.android.lark.contact.feat.common.ItemCell;
import com.ss.android.lark.contact.feat.contact_recommend.entity.ContactRecData;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/list/ContactAddItemCell;", "Lcom/ss/android/lark/contact/feat/common/ItemCell;", "Lcom/ss/android/lark/contact/feat/contact_recommend/entity/ContactRecData;", "Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/list/ContactAddItemViewHolder;", "callback", "Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/list/ContactAddItemCallback;", "(Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/list/ContactAddItemCallback;)V", "onBindCellViewHolder", "", "holder", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "position", "", "onCreateCellViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "AvatarBuilder", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.feat.a.b.a.b */
public final class ContactAddItemCell extends ItemCell<ContactRecData, ContactAddItemViewHolder> {

    /* renamed from: a */
    public final ContactAddItemCallback f91529a;

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/list/ContactAddItemCell$AvatarBuilder;", "Lcom/larksuite/component/ui/avatar/AvatarModel$Builder;", "()V", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.feat.a.b.a.b$a */
    public static final class AvatarBuilder extends AvatarModel.Builder<AvatarBuilder> {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/contact/feat/contact_recommend/mvp/list/ContactAddItemCell$onBindCellViewHolder$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "view", "Landroid/view/View;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.feat.a.b.a.b$b */
    public static final class C35416b extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ ContactAddItemCell f91530a;

        /* renamed from: b */
        final /* synthetic */ ContactRecData f91531b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f91530a.f91529a.mo130667a(view, this.f91531b);
        }

        C35416b(ContactAddItemCell bVar, ContactRecData aVar) {
            this.f91530a = bVar;
            this.f91531b = aVar;
        }
    }

    public ContactAddItemCell(ContactAddItemCallback aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        this.f91529a = aVar;
    }

    /* renamed from: b */
    public ContactAddItemViewHolder mo130686a(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Context context = viewGroup.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "parent.context");
        ContactSimpleItemView contactSimpleItemView = new ContactSimpleItemView(context);
        contactSimpleItemView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return new ContactAddItemViewHolder(contactSimpleItemView);
    }

    /* renamed from: a */
    public void mo130688a(ContactAddItemViewHolder cVar, ContactRecData aVar, int i) {
        Intrinsics.checkParameterIsNotNull(cVar, "holder");
        if (aVar != null) {
            cVar.mo130690b().mo130732a(((AvatarBuilder) new AvatarBuilder().mo88962a(aVar.mo130672b())).mo88976k());
            ContactSimpleItemView b = cVar.mo130690b();
            String c = aVar.mo130674c();
            String str = "";
            if (c == null) {
                c = str;
            }
            b.setName(c);
            ContactSimpleItemView b2 = cVar.mo130690b();
            String d = aVar.mo130676d();
            if (d != null) {
                str = d;
            }
            b2.setDesc(str);
            if (aVar.mo130678e()) {
                cVar.mo130690b().mo130730a(R.string.Lark_Legacy_ProfileButtonApplied);
            } else {
                cVar.mo130690b().mo130731a(R.string.Lark_Legacy_Add, new C35416b(this, aVar));
            }
            cVar.mo130690b().setSplitLine(false);
            return;
        }
        Log.m165389i("ItemListViewHelper", "ContactAddData is null");
    }
}
