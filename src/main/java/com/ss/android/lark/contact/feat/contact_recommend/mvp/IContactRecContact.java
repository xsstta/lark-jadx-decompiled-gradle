package com.ss.android.lark.contact.feat.contact_recommend.mvp;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.contact.feat.contact_recommend.entity.ContactRecData;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/IContactRecContact;", "", "IModel", "IView", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.feat.a.b.d */
public interface IContactRecContact {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0005H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/IContactRecContact$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "loadData", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/contact/feat/contact_recommend/entity/ContactRecData;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.feat.a.b.d$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        void mo130682a(IGetDataCallback<List<ContactRecData>> iGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\rJ\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\u0006\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH&J\b\u0010\n\u001a\u00020\u0004H&J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\tH&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/IContactRecContact$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/IContactRecContact$IView$IViewDelegate;", "showEmpty", "", "showError", "showList", "dataList", "", "Lcom/ss/android/lark/contact/feat/contact_recommend/entity/ContactRecData;", "showSkeleton", "updateItemData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "IViewDelegate", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.feat.a.b.d$b */
    public interface IView extends com.larksuite.framework.mvp.IView<IViewDelegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/IContactRecContact$IView$IViewDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "reloadData", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.feat.a.b.d$b$a */
        public interface IViewDelegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo130713a();
        }

        /* renamed from: a */
        void mo130717a();

        /* renamed from: a */
        void mo130718a(ContactRecData aVar);

        /* renamed from: a */
        void mo130719a(List<ContactRecData> list);

        /* renamed from: d */
        void mo130721d();
    }
}
