package com.ss.android.lark.app.task.initor;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.core.api.AbstractC29541ac;
import com.ss.android.lark.biz.core.api.AbstractC29563j;
import com.ss.android.lark.biz.core.api.AbstractC29565l;
import com.ss.android.lark.biz.core.api.AbstractC29570n;
import com.ss.android.lark.biz.core.api.AbstractC29583s;
import com.ss.android.lark.biz.core.api.IContactsGroupController;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.contact.entity.EmailContact;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.search.widget.business.ContactsSelectorBusiness;
import com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency;
import com.ss.android.lark.search.widget.params.PickType;
import com.ss.android.lark.searchcommon.service.compatible.ISearchLifecycleObserver;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;
import kotlin.jvm.functions.Function1;

public class SearchWidgetModuleDependencyInitor {
    /* renamed from: a */
    public static void m106567a(Context context) {
        SearchWidgetModuleDependency.m208512a(new SearchWidgetModuleDependency.ISearchWidgetModuleDependency() {
            /* class com.ss.android.lark.app.task.initor.SearchWidgetModuleDependencyInitor.C290101 */

            /* renamed from: a */
            IPassportApi f72697a = ((IPassportApi) ApiUtils.getApi(IPassportApi.class));

            @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency
            /* renamed from: b */
            public boolean mo102929b() {
                return this.f72697a.isCustomer();
            }

            @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency
            /* renamed from: c */
            public SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactHomeController mo102930c() {
                return new SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactHomeController() {
                    /* class com.ss.android.lark.app.task.initor.SearchWidgetModuleDependencyInitor.C290101.C290111 */

                    /* renamed from: a */
                    final AbstractC29563j f72698a = ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getContactHomeController();

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactHomeController
                    /* renamed from: a */
                    public BaseFragment mo102937a() {
                        return this.f72698a.mo105759a();
                    }

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactHomeController
                    /* renamed from: a */
                    public void mo102939a(List<String> list) {
                        this.f72698a.mo105761a(list);
                    }

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactHomeController
                    /* renamed from: a */
                    public void mo102940a(boolean z) {
                        this.f72698a.mo105762a(z);
                    }

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactHomeController
                    /* renamed from: a */
                    public SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactHomeController mo102938a(boolean z, boolean z2, boolean z3, SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactHomeController.IOnItemSelectedListener aVar) {
                        AbstractC29563j jVar = this.f72698a;
                        aVar.getClass();
                        jVar.mo105760a(z, z2, z3, new AbstractC29563j.AbstractC29564a() {
                            /* class com.ss.android.lark.app.task.initor.$$Lambda$UaOapJA6s0b0PUSwWAGkxo0eQlk */

                            @Override // com.ss.android.lark.biz.core.api.AbstractC29563j.AbstractC29564a
                            public final void onItemSelected(Chatter chatter, boolean z) {
                                SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactHomeController.IOnItemSelectedListener.this.mo183550a(chatter, z);
                            }
                        });
                        return this;
                    }
                };
            }

            @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency
            /* renamed from: d */
            public SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IEmailContactController mo102931d() {
                return new SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IEmailContactController() {
                    /* class com.ss.android.lark.app.task.initor.SearchWidgetModuleDependencyInitor.C290101.C290122 */

                    /* renamed from: a */
                    final AbstractC29583s f72700a = ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getEmailContactController();

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IEmailContactController
                    /* renamed from: a */
                    public BaseFragment mo102941a() {
                        return this.f72700a.mo105882a();
                    }

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IEmailContactController
                    /* renamed from: a */
                    public void mo102943a(List<String> list) {
                        this.f72700a.mo105884a(list);
                    }

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IEmailContactController
                    /* renamed from: a */
                    public SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IEmailContactController mo102942a(boolean z, boolean z2, boolean z3, final SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IEmailContactController.IOnItemSelectedListener aVar) {
                        this.f72700a.mo105883a(z, z2, z3, new AbstractC29583s.AbstractC29584a() {
                            /* class com.ss.android.lark.app.task.initor.SearchWidgetModuleDependencyInitor.C290101.C290122.C290131 */

                            @Override // com.ss.android.lark.biz.core.api.AbstractC29583s.AbstractC29584a
                            /* renamed from: a */
                            public void mo102944a() {
                                aVar.mo183551a();
                            }

                            @Override // com.ss.android.lark.biz.core.api.AbstractC29583s.AbstractC29584a
                            /* renamed from: a */
                            public boolean mo102945a(EmailContact emailContact, boolean z, int i) {
                                return aVar.mo183552a(emailContact, z, i);
                            }
                        });
                        return this;
                    }
                };
            }

            @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency
            /* renamed from: e */
            public SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsSelectorController mo102932e() {
                return new SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsSelectorController() {
                    /* class com.ss.android.lark.app.task.initor.SearchWidgetModuleDependencyInitor.C290101.C290143 */

                    /* renamed from: a */
                    final AbstractC29565l f72704a = ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getContactsSelectorController();

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsSelectorController
                    /* renamed from: a */
                    public BaseFragment mo102946a() {
                        return this.f72704a.mo105769a();
                    }

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsSelectorController
                    /* renamed from: b */
                    public void mo102950b(boolean z) {
                        this.f72704a.mo105776b(z);
                    }

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsSelectorController
                    /* renamed from: a */
                    public void mo102949a(boolean z) {
                        this.f72704a.mo105773a(z);
                    }

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsSelectorController
                    /* renamed from: a */
                    public void mo102948a(ContactsSelectorBusiness aVar) {
                        AbstractC29565l.AbstractC29568c b = this.f72704a.mo105774b();
                        b.getClass();
                        aVar.mo183645a(new Function1() {
                            /* class com.ss.android.lark.app.task.initor.$$Lambda$vvPsiNUxV8yVQnh6TQMEn1bwXRo */

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC29565l.AbstractC29568c.this.convert((View) obj);
                            }
                        });
                        this.f72704a.mo105772a(aVar.mo183646a());
                        this.f72704a.mo105775b(aVar.mo183649b());
                    }

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsSelectorController
                    /* renamed from: a */
                    public SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsSelectorController mo102947a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, String str, final SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsSelectorController.IOnClickListener aVar, SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsSelectorController.IOnViewDataListener bVar) {
                        AbstractC29565l lVar = this.f72704a;
                        C290151 r13 = new AbstractC29565l.AbstractC29566a() {
                            /* class com.ss.android.lark.app.task.initor.SearchWidgetModuleDependencyInitor.C290101.C290143.C290151 */

                            @Override // com.ss.android.lark.biz.core.api.AbstractC29565l.AbstractC29566a
                            /* renamed from: g */
                            public void mo102959g() {
                            }

                            @Override // com.ss.android.lark.biz.core.api.AbstractC29565l.AbstractC29566a
                            /* renamed from: a */
                            public void mo102951a() {
                                aVar.mo183530a();
                            }

                            @Override // com.ss.android.lark.biz.core.api.AbstractC29565l.AbstractC29566a
                            /* renamed from: b */
                            public void mo102954b() {
                                aVar.mo183533b();
                            }

                            @Override // com.ss.android.lark.biz.core.api.AbstractC29565l.AbstractC29566a
                            /* renamed from: c */
                            public void mo102955c() {
                                aVar.mo183534c();
                            }

                            @Override // com.ss.android.lark.biz.core.api.AbstractC29565l.AbstractC29566a
                            /* renamed from: d */
                            public void mo102956d() {
                                aVar.mo183535d();
                            }

                            @Override // com.ss.android.lark.biz.core.api.AbstractC29565l.AbstractC29566a
                            /* renamed from: e */
                            public void mo102957e() {
                                aVar.mo183536e();
                            }

                            @Override // com.ss.android.lark.biz.core.api.AbstractC29565l.AbstractC29566a
                            /* renamed from: f */
                            public void mo102958f() {
                                aVar.mo183537f();
                            }

                            @Override // com.ss.android.lark.biz.core.api.AbstractC29565l.AbstractC29566a
                            /* renamed from: h */
                            public void mo102960h() {
                                aVar.mo183538g();
                            }

                            @Override // com.ss.android.lark.biz.core.api.AbstractC29565l.AbstractC29566a
                            /* renamed from: i */
                            public void mo102961i() {
                                aVar.mo183539h();
                            }

                            @Override // com.ss.android.lark.biz.core.api.AbstractC29565l.AbstractC29566a
                            /* renamed from: a */
                            public void mo102952a(String str) {
                                aVar.mo183531a(str);
                            }

                            @Override // com.ss.android.lark.biz.core.api.AbstractC29565l.AbstractC29566a
                            /* renamed from: a */
                            public void mo102953a(String str, String str2) {
                                aVar.mo183532a(str, str2);
                            }
                        };
                        bVar.getClass();
                        lVar.mo105770a(z, z2, z3, z4, z5, z6, z7, z8, z9, z10, str, r13, new AbstractC29565l.AbstractC29567b() {
                            /* class com.ss.android.lark.app.task.initor.$$Lambda$oHoOcpwzsH8eOQR_ejbe2y4nf4 */

                            @Override // com.ss.android.lark.biz.core.api.AbstractC29565l.AbstractC29567b
                            public final void onReady() {
                                SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsSelectorController.IOnViewDataListener.this.mo183541a();
                            }
                        });
                        this.f72704a.mo105771a(65280);
                        return this;
                    }
                };
            }

            @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency
            /* renamed from: f */
            public SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController mo102933f() {
                return new SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController() {
                    /* class com.ss.android.lark.app.task.initor.SearchWidgetModuleDependencyInitor.C290101.C290164 */

                    /* renamed from: a */
                    final AbstractC29570n f72708a = ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getDepartmentDetailController();

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController
                    /* renamed from: a */
                    public BaseFragment mo102962a() {
                        return this.f72708a.mo105779a();
                    }

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController
                    /* renamed from: b */
                    public Department mo102970b() {
                        return this.f72708a.mo105791c();
                    }

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController
                    /* renamed from: c */
                    public void mo102973c() {
                        this.f72708a.mo105794d();
                    }

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController
                    /* renamed from: d */
                    public void mo102976d() {
                        this.f72708a.mo105796f();
                    }

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController
                    /* renamed from: a */
                    public void mo102964a(PickType eVar) {
                        this.f72708a.mo105781a(SearchWidgetModuleDependencyInitor.m106566a(eVar));
                    }

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController
                    /* renamed from: b */
                    public void mo102971b(List<String> list) {
                        this.f72708a.mo105792c(list);
                    }

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController
                    /* renamed from: c */
                    public void mo102974c(List<String> list) {
                        this.f72708a.mo105789b(list);
                    }

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController
                    /* renamed from: a */
                    public void mo102965a(String str) {
                        this.f72708a.mo105783a(str);
                    }

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController
                    /* renamed from: b */
                    public void mo102972b(boolean z) {
                        this.f72708a.mo105793c(z);
                    }

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController
                    /* renamed from: c */
                    public void mo102975c(boolean z) {
                        this.f72708a.mo105790b(z);
                    }

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController
                    /* renamed from: a */
                    public void mo102968a(List<String> list) {
                        this.f72708a.mo105786a(list);
                    }

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController
                    /* renamed from: a */
                    public void mo102969a(boolean z) {
                        this.f72708a.mo105787a(z);
                    }

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController
                    /* renamed from: a */
                    public void mo102966a(String str, String str2) {
                        this.f72708a.mo105784a(str, str2);
                    }

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController
                    /* renamed from: a */
                    public void mo102967a(String str, String str2, String str3) {
                        this.f72708a.mo105785a(str, str2, str3);
                    }

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController
                    /* renamed from: a */
                    public SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController mo102963a(boolean z, boolean z2, PickType eVar, final SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IDepartmentDetailController.IOnOperationListener aVar, boolean z3, boolean z4, boolean z5, Boolean bool, Boolean bool2) {
                        this.f72708a.mo105780a(((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getDepartmentDetailFragmentBuilder(z, z2, SearchWidgetModuleDependencyInitor.m106566a(eVar), new AbstractC29541ac() {
                            /* class com.ss.android.lark.app.task.initor.SearchWidgetModuleDependencyInitor.C290101.C290164.C290171 */

                            @Override // com.ss.android.lark.biz.core.api.AbstractC29541ac
                            /* renamed from: a */
                            public void mo102978a(Context context, String str, String str2, int i) {
                            }

                            @Override // com.ss.android.lark.biz.core.api.AbstractC29541ac
                            /* renamed from: a */
                            public void mo102979a(Chatter chatter) {
                            }

                            @Override // com.ss.android.lark.biz.core.api.AbstractC29541ac
                            /* renamed from: a */
                            public void mo102977a() {
                                aVar.mo183542a();
                            }

                            @Override // com.ss.android.lark.biz.core.api.AbstractC29541ac
                            /* renamed from: b */
                            public void mo102985b(boolean z) {
                                aVar.mo183548b(z);
                            }

                            @Override // com.ss.android.lark.biz.core.api.AbstractC29541ac
                            /* renamed from: c */
                            public void mo102986c(boolean z) {
                                aVar.mo183549c(z);
                            }

                            @Override // com.ss.android.lark.biz.core.api.AbstractC29541ac
                            /* renamed from: a */
                            public void mo102981a(String str) {
                                aVar.mo183544a(str);
                            }

                            @Override // com.ss.android.lark.biz.core.api.AbstractC29541ac
                            /* renamed from: a */
                            public void mo102982a(boolean z) {
                                aVar.mo183545a(z);
                            }

                            @Override // com.ss.android.lark.biz.core.api.AbstractC29541ac
                            /* renamed from: a */
                            public boolean mo102984a(Department department, boolean z) {
                                return aVar.mo183547a(department.getId(), department.getName(), z);
                            }

                            @Override // com.ss.android.lark.biz.core.api.AbstractC29541ac
                            /* renamed from: a */
                            public void mo102980a(Chatter chatter, int i, int i2) {
                                aVar.mo183543a(chatter, i, i2);
                            }

                            @Override // com.ss.android.lark.biz.core.api.AbstractC29541ac
                            /* renamed from: a */
                            public boolean mo102983a(Chatter chatter, boolean z, int i, String str, int i2) {
                                return aVar.mo183546a(chatter, z, i, str, i2);
                            }
                        }, z3, z4, z5, bool));
                        return this;
                    }
                };
            }

            @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency
            /* renamed from: i */
            public SearchWidgetModuleDependency.ISearchWidgetModuleDependency.ICalendarController mo102936i() {
                return new SearchWidgetModuleDependency.ISearchWidgetModuleDependency.ICalendarController() {
                    /* class com.ss.android.lark.app.task.initor.SearchWidgetModuleDependencyInitor.C290101.C290206 */

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.ICalendarController
                    /* renamed from: a */
                    public boolean mo102995a() {
                        return C36083a.m141486a().getCalendarDependency().mo132752d();
                    }

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.ICalendarController
                    /* renamed from: c */
                    public void mo102999c() {
                        C36083a.m141486a().getCalendarDependency().mo132754f();
                    }

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.ICalendarController
                    /* renamed from: b */
                    public void mo102998b() {
                        C36083a.m141486a().getCalendarDependency().mo132753e();
                    }

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.ICalendarController
                    /* renamed from: b */
                    public List<String> mo102997b(String str) {
                        return C36083a.m141486a().getCalendarDependency().mo132747b(str);
                    }

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.ICalendarController
                    /* renamed from: a */
                    public boolean mo102996a(String str) {
                        return C36083a.m141486a().getCalendarDependency().mo132745a(str);
                    }
                };
            }

            @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency
            /* renamed from: a */
            public ISearchLifecycleObserver mo102925a() {
                return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getSearchLifecycleObserver();
            }

            @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency
            /* renamed from: g */
            public String mo102934g() {
                return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getUserId();
            }

            @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency
            /* renamed from: h */
            public SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsOwnerGroupController mo102935h() {
                final IContactsGroupController contactGroupController = ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getContactGroupController();
                return new SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsOwnerGroupController() {
                    /* class com.ss.android.lark.app.task.initor.SearchWidgetModuleDependencyInitor.C290101.C290185 */

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsOwnerGroupController
                    /* renamed from: a */
                    public BaseFragment mo102987a() {
                        return contactGroupController.mo105763a();
                    }

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsOwnerGroupController
                    /* renamed from: b */
                    public void mo102992b(List<String> list) {
                        contactGroupController.mo105767a(list);
                    }

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsOwnerGroupController
                    /* renamed from: a */
                    public SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsOwnerGroupController mo102988a(final SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsOwnerGroupController.IOnOperationListener aVar) {
                        contactGroupController.mo105766a(new IContactsGroupController.IOnOperationListener() {
                            /* class com.ss.android.lark.app.task.initor.SearchWidgetModuleDependencyInitor.C290101.C290185.C290191 */

                            @Override // com.ss.android.lark.biz.core.api.IContactsGroupController.IOnOperationListener
                            /* renamed from: a */
                            public void mo102993a() {
                                aVar.mo183528a();
                            }

                            @Override // com.ss.android.lark.biz.core.api.IContactsGroupController.IOnOperationListener
                            /* renamed from: a */
                            public boolean mo102994a(Chat chat, boolean z, int i) {
                                return aVar.mo183529a(chat, z, i);
                            }
                        });
                        return this;
                    }

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsOwnerGroupController
                    /* renamed from: a */
                    public void mo102990a(PickType eVar) {
                        contactGroupController.mo105765a(SearchWidgetModuleDependencyInitor.m106566a(eVar));
                    }

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsOwnerGroupController
                    /* renamed from: a */
                    public void mo102991a(List<String> list) {
                        contactGroupController.mo105768b(list);
                    }

                    @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsOwnerGroupController
                    /* renamed from: a */
                    public SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsOwnerGroupController mo102989a(boolean z, PickType eVar) {
                        contactGroupController.mo105764a(z, SearchWidgetModuleDependencyInitor.m106566a(eVar));
                        return this;
                    }
                };
            }

            @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency
            /* renamed from: a */
            public void mo102926a(Activity activity) {
                ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).goContactsGroupActivity(activity, null);
            }

            @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency
            /* renamed from: a */
            public boolean mo102928a(long j) {
                return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isInZenMode(j);
            }

            @Override // com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency.ISearchWidgetModuleDependency
            /* renamed from: a */
            public void mo102927a(Context context, String str, String str2, ImageView imageView, int i, int i2) {
                ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).loadAvatarImage(context, imageView, str, str2, new LoadParams().mo105413a(UIHelper.dp2px((float) i)).mo105422b(UIHelper.dp2px((float) i2)));
            }
        });
    }

    /* renamed from: a */
    public static com.ss.android.lark.biz.core.api.PickType m106566a(PickType eVar) {
        com.ss.android.lark.biz.core.api.PickType pickType = new com.ss.android.lark.biz.core.api.PickType();
        pickType.setEnableExternalGroup(eVar.mo183747d());
        pickType.setEnableGroupChat(eVar.mo183745c());
        pickType.setEnableExternalChatter(eVar.mo183743b());
        pickType.setEnableChatter(eVar.mo183741a());
        pickType.setEnableDepartment(eVar.mo183749e());
        pickType.setEnablePublicGroup(eVar.mo183751f());
        pickType.setEnableSecretGroup(eVar.mo183753g());
        pickType.setEnableMeetingGroup(eVar.mo183755h());
        return pickType;
    }
}
