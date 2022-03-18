package com.ss.android.lark.search.widget.dependency;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.contact.entity.EmailContact;
import com.ss.android.lark.search.widget.business.ContactsSelectorBusiness;
import com.ss.android.lark.search.widget.params.PickType;
import com.ss.android.lark.searchcommon.p2634b.C53886b;
import com.ss.android.lark.searchcommon.service.compatible.ISearchLifecycleObserver;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007R$\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency;", "", "()V", "dependency", "Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency;", "dependency$annotations", "getDependency", "()Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency;", "setDependency", "(Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency;)V", "onLocalBackupErr", "", "searchKey", "", "onServerErr", "onServerResultEmpty", "ISearchWidgetModuleDependency", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.widget.b.a */
public final class SearchWidgetModuleDependency {

    /* renamed from: a */
    public static volatile ISearchWidgetModuleDependency f133026a;

    /* renamed from: b */
    public static final SearchWidgetModuleDependency f133027b = new SearchWidgetModuleDependency();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0006)*+,-.J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0016H&J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0006H&J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001eH&J:\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\u00062\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006/"}, d2 = {"Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency;", "", "isCustomer", "", "()Z", "tenantID", "", "getTenantID", "()Ljava/lang/String;", "getCalendarController", "Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$ICalendarController;", "getContactHomeController", "Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IContactHomeController;", "getContactsOwnerGroupController", "Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IContactsOwnerGroupController;", "getContactsSelectorController", "Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IContactsSelectorController;", "getDepartmentDetailController", "Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IDepartmentDetailController;", "getEmailContactController", "Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IEmailContactController;", "getSearchLifecycleObserver", "Lcom/ss/android/lark/searchcommon/service/compatible/ISearchLifecycleObserver;", "getSelfId", "goContactsGroupActivity", "", "activity", "Landroid/app/Activity;", "isInZenMode", "time", "", "loadImage", "context", "Landroid/content/Context;", "avatarKey", "id", "imageView", "Landroid/widget/ImageView;", "imageWidth", "", "imageHeight", "ICalendarController", "IContactHomeController", "IContactsOwnerGroupController", "IContactsSelectorController", "IDepartmentDetailController", "IEmailContactController", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.widget.b.a$a */
    public interface ISearchWidgetModuleDependency {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u001a\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$ICalendarController;", "", "isSupportInviteEmail", "", "()Z", "isSupportMultiTimeZone", "hitPointEmailAttendeeEnter", "", "hitPointEmailAttendeeInvite", "isValidEmail", "emailStr", "", "splitEmail", "", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.widget.b.a$a$a */
        public interface ICalendarController {
            /* renamed from: a */
            boolean mo102995a();

            /* renamed from: a */
            boolean mo102996a(String str);

            /* renamed from: b */
            List<String> mo102997b(String str);

            /* renamed from: b */
            void mo102998b();

            /* renamed from: c */
            void mo102999c();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0017J\b\u0010\u0002\u001a\u00020\u0003H&J(\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH&J(\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nH&J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0006H&J\u0016\u0010\u0011\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H&J\u0016\u0010\u0015\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016H&¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IContactHomeController;", "", "asFragment", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "init", "hideAllHeader", "", "showSelect", "hideContacts", "selectedListener", "Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IContactHomeController$IOnItemSelectedListener;", "isMultiSelect", "setOnItemSelectedListener", "", "onItemSelectedListener", "switchMultiple", "isMultiple", "updateContainsView", "values", "", "", "updateSelectedView", "", "IOnItemSelectedListener", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.widget.b.a$a$b */
        public interface IContactHomeController {

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IContactHomeController$IOnItemSelectedListener;", "", "onItemSelected", "", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "isSelected", "", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.search.widget.b.a$a$b$a */
            public interface IOnItemSelectedListener {
                /* renamed from: a */
                void mo183550a(Chatter chatter, boolean z);
            }

            /* renamed from: a */
            BaseFragment mo102937a();

            /* renamed from: a */
            IContactHomeController mo102938a(boolean z, boolean z2, boolean z3, IOnItemSelectedListener aVar);

            /* renamed from: a */
            void mo102939a(List<String> list);

            /* renamed from: a */
            void mo102940a(boolean z);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0013J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\u0012\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH&¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IContactsOwnerGroupController;", "", "asFragment", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "init", "multiSelectMode", "", "pickType", "Lcom/ss/android/lark/search/widget/params/PickType;", "setContainedChatId", "", "chaIds", "", "", "setGroupOperationListener", "listener", "Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IContactsOwnerGroupController$IOnOperationListener;", "setPickType", "setSelectChatIds", "IOnOperationListener", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.widget.b.a$a$c */
        public interface IContactsOwnerGroupController {

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IContactsOwnerGroupController$IOnOperationListener;", "", "onContactsGroupSelect", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "isSelected", "position", "", "onFinish", "", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.search.widget.b.a$a$c$a */
            public interface IOnOperationListener {
                /* renamed from: a */
                void mo183528a();

                /* renamed from: a */
                boolean mo183529a(Chat chat, boolean z, int i);
            }

            /* renamed from: a */
            BaseFragment mo102987a();

            /* renamed from: a */
            IContactsOwnerGroupController mo102988a(IOnOperationListener aVar);

            /* renamed from: a */
            IContactsOwnerGroupController mo102989a(boolean z, PickType eVar);

            /* renamed from: a */
            void mo102990a(PickType eVar);

            /* renamed from: a */
            void mo102991a(List<String> list);

            /* renamed from: b */
            void mo102992b(List<String> list);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0002 !J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&Jp\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H&JP\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001cH&J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0017H&J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0019H&¨\u0006\""}, d2 = {"Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IContactsSelectorController;", "", "asFragment", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "changeEmailContactVisibility", "", "isVisible", "", "changeExternalContactVisibility", "init", "newContactsVisible", "mineGroupVisible", "ownerGroupVisible", "botVisible", "onCallVisible", "externalContactsVisible", "depVisible", "showSchoolContact", "trustPartyVisible", "emailContactVisible", "mineGroupLabel", "", "onClickListener", "Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IContactsSelectorController$IOnClickListener;", "onViewDataListener", "Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IContactsSelectorController$IOnViewDataListener;", "setContactsSelectorBusiness", "contactsSelectorBusiness", "Lcom/ss/android/lark/search/widget/business/ContactsSelectorBusiness;", "setOnEntranceClickListener", "listener", "setOnViewDataReadyListener", "IOnClickListener", "IOnViewDataListener", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.widget.b.a$a$d */
        public interface IContactsSelectorController {

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\u000f\u001a\u00020\u0003H&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IContactsSelectorController$IOnClickListener;", "", "onEmailContactClick", "", "onExternalContactClick", "onMineGroupClick", "onNewContactClick", "onOnCallClick", "onOwnerGroupClick", "onRobotClick", "onSchoolParentItemClick", "id", "", "schoolNodePreName", "onSubordinateItemClick", "onTrustPartyItemClick", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.search.widget.b.a$a$d$a */
            public interface IOnClickListener {
                /* renamed from: a */
                void mo183530a();

                /* renamed from: a */
                void mo183531a(String str);

                /* renamed from: a */
                void mo183532a(String str, String str2);

                /* renamed from: b */
                void mo183533b();

                /* renamed from: c */
                void mo183534c();

                /* renamed from: d */
                void mo183535d();

                /* renamed from: e */
                void mo183536e();

                /* renamed from: f */
                void mo183537f();

                /* renamed from: g */
                void mo183538g();

                /* renamed from: h */
                void mo183539h();
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IContactsSelectorController$IOnViewDataListener;", "", "onReady", "", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.search.widget.b.a$a$d$b */
            public interface IOnViewDataListener {
                /* renamed from: a */
                void mo183541a();
            }

            /* renamed from: a */
            BaseFragment mo102946a();

            /* renamed from: a */
            IContactsSelectorController mo102947a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, String str, IOnClickListener aVar, IOnViewDataListener bVar);

            /* renamed from: a */
            void mo102948a(ContactsSelectorBusiness aVar);

            /* renamed from: a */
            void mo102949a(boolean z);

            /* renamed from: b */
            void mo102950b(boolean z);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0013\bf\u0018\u00002\u00020\u0001:\u0001-J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&JY\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\nH&¢\u0006\u0002\u0010\u0015J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\nH&J\b\u0010\u0017\u001a\u00020\u0005H&J\u0016\u0010\u0018\u001a\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH&J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\nH&J\u0012\u0010\u001e\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u001bH&J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\nH&J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH&J\u0016\u0010$\u001a\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH&J\u0016\u0010%\u001a\u00020\u00052\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH&J\u0010\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u001bH&J\u001c\u0010'\u001a\u00020\u00052\b\b\u0001\u0010(\u001a\u00020\u001b2\b\b\u0001\u0010)\u001a\u00020\u001bH&J*\u0010*\u001a\u00020\u00052\b\b\u0001\u0010(\u001a\u00020\u001b2\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\u001b2\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u001bH&J\u0010\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\nH&¨\u0006."}, d2 = {"Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IDepartmentDetailController;", "", "asFragment", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "backToPreviousDepartment", "", "getCurDepartment", "Lcom/ss/android/lark/contact/entity/Department;", "init", "isSelectMode", "", "isShowUserStatus", "pickType", "Lcom/ss/android/lark/search/widget/params/PickType;", "listener", "Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IDepartmentDetailController$IOnOperationListener;", "isCheckPermission", "isShowContact", "isIgnoreLoginUser", "isEduMode", "needEnterpriseEmail", "(ZZLcom/ss/android/lark/search/widget/params/PickType;Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IDepartmentDetailController$IOnOperationListener;ZZZLjava/lang/Boolean;Ljava/lang/Boolean;)Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IDepartmentDetailController;", "hasEnterpriseEmail", "refreshCurrentDepartment", "setContainedChatters", "chatterIds", "", "", "setDisableOutChatter", "disabled", "setEduExtra", "prefixName", "setEduMode", "isEdu", "setOrganizationListener", "setPickType", "setSelectedChatters", "setSelectedDepartment", "departmentIds", "setTargetDepartmentId", "id", "chatId", "setTargetSchoolNodeId", "switchMultiple", "isMultiple", "IOnOperationListener", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.widget.b.a$a$e */
        public interface IDepartmentDetailController {

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&J2\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u000bH&J$\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000e\u001a\u00020\u0005H&J\b\u0010\u0014\u001a\u00020\u0003H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0010H&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0005H&¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IDepartmentDetailController$IOnOperationListener;", "", "onBreadcrumbsItemClick", "", "isCollaboration", "", "onClickNextDepartmentLevel", "onContactsChatterClick", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "deniedReason", "", "position", "onContactsChatterSelect", "isSelected", "enterpriseEmail", "", "onContactsDepartmentSelect", "departmentId", "departmentName", "onFinish", "onTitleChange", "newTitle", "onTitleSecLeftVisibleChange", "visible", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.search.widget.b.a$a$e$a */
            public interface IOnOperationListener {
                /* renamed from: a */
                void mo183542a();

                /* renamed from: a */
                void mo183543a(Chatter chatter, int i, int i2);

                /* renamed from: a */
                void mo183544a(String str);

                /* renamed from: a */
                void mo183545a(boolean z);

                /* renamed from: a */
                boolean mo183546a(Chatter chatter, boolean z, int i, String str, int i2);

                /* renamed from: a */
                boolean mo183547a(String str, String str2, boolean z);

                /* renamed from: b */
                void mo183548b(boolean z);

                /* renamed from: c */
                void mo183549c(boolean z);
            }

            /* renamed from: a */
            BaseFragment mo102962a();

            /* renamed from: a */
            IDepartmentDetailController mo102963a(boolean z, boolean z2, PickType eVar, IOnOperationListener aVar, boolean z3, boolean z4, boolean z5, Boolean bool, Boolean bool2);

            /* renamed from: a */
            void mo102964a(PickType eVar);

            /* renamed from: a */
            void mo102965a(String str);

            /* renamed from: a */
            void mo102966a(String str, String str2);

            /* renamed from: a */
            void mo102967a(String str, String str2, String str3);

            /* renamed from: a */
            void mo102968a(List<String> list);

            /* renamed from: a */
            void mo102969a(boolean z);

            /* renamed from: b */
            Department mo102970b();

            /* renamed from: b */
            void mo102971b(List<String> list);

            /* renamed from: b */
            void mo102972b(boolean z);

            /* renamed from: c */
            void mo102973c();

            /* renamed from: c */
            void mo102974c(List<String> list);

            /* renamed from: c */
            void mo102975c(boolean z);

            /* renamed from: d */
            void mo102976d();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0018J\b\u0010\u0002\u001a\u00020\u0003H&J(\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH&J(\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H&J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH&J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0006H&J\u0016\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H&J\u0016\u0010\u0016\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017H&¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IEmailContactController;", "", "asFragment", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "init", "hideAllHeader", "", "showSelect", "mIsMultiSelect", "selectedListener", "Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IEmailContactController$IOnItemSelectedListener;", "isMultiSelect", "hideContacts", "setOnItemSelectedListener", "", "onItemSelectedListener", "switchMultiple", "isMultiple", "updateContainsView", "values", "", "", "updateSelectedView", "", "IOnItemSelectedListener", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.widget.b.a$a$f */
        public interface IEmailContactController {

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IEmailContactController$IOnItemSelectedListener;", "", "onFinish", "", "onItemSelected", "", "contact", "Lcom/ss/android/lark/contact/entity/EmailContact;", "isSelected", "position", "", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.search.widget.b.a$a$f$a */
            public interface IOnItemSelectedListener {
                /* renamed from: a */
                void mo183551a();

                /* renamed from: a */
                boolean mo183552a(EmailContact emailContact, boolean z, int i);
            }

            /* renamed from: a */
            BaseFragment mo102941a();

            /* renamed from: a */
            IEmailContactController mo102942a(boolean z, boolean z2, boolean z3, IOnItemSelectedListener aVar);

            /* renamed from: a */
            void mo102943a(List<String> list);
        }

        /* renamed from: a */
        ISearchLifecycleObserver mo102925a();

        /* renamed from: a */
        void mo102926a(Activity activity);

        /* renamed from: a */
        void mo102927a(Context context, String str, String str2, ImageView imageView, int i, int i2);

        /* renamed from: a */
        boolean mo102928a(long j);

        /* renamed from: b */
        boolean mo102929b();

        /* renamed from: c */
        IContactHomeController mo102930c();

        /* renamed from: d */
        IEmailContactController mo102931d();

        /* renamed from: e */
        IContactsSelectorController mo102932e();

        /* renamed from: f */
        IDepartmentDetailController mo102933f();

        /* renamed from: g */
        String mo102934g();

        /* renamed from: h */
        IContactsOwnerGroupController mo102935h();

        /* renamed from: i */
        ICalendarController mo102936i();
    }

    private SearchWidgetModuleDependency() {
    }

    /* renamed from: a */
    public static final ISearchWidgetModuleDependency m208511a() {
        ISearchWidgetModuleDependency aVar = f133026a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dependency");
        }
        return aVar;
    }

    /* renamed from: a */
    public static final void m208512a(ISearchWidgetModuleDependency aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "<set-?>");
        f133026a = aVar;
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m208514b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "searchKey");
        C53886b.m208807e(str);
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m208515c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "searchKey");
        C53886b.m208808f(str);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m208513a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "searchKey");
        C53886b.m208806d(str);
    }
}
