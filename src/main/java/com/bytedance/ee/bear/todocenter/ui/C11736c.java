package com.bytedance.ee.bear.todocenter.ui;

import androidx.lifecycle.AbstractC1142af;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.todocenter.entity.AbstractC11690a;
import com.bytedance.ee.bear.todocenter.entity.Todo;
import com.bytedance.ee.bear.todocenter.entity.TodoList;
import com.bytedance.ee.bear.todocenter.model.C11693a;
import com.bytedance.ee.bear.todocenter.model.C11695c;
import com.bytedance.ee.bear.todocenter.model.C11696d;
import com.bytedance.ee.bear.todocenter.model.DefaultTodoCenterModel;
import com.bytedance.ee.bear.todocenter.p563a.C11685a;
import com.bytedance.ee.bear.todocenter.ui.entity.TodoUIEntity;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.todocenter.ui.c */
public class C11736c extends AbstractC1142af {
    private final AbstractC11690a todoCenterModel = new DefaultTodoCenterModel();
    private final C11696d todoListComposite = new C11696d();
    private C11738e todoUIData;

    static /* synthetic */ void lambda$loadCacheData$18(C11696d dVar) throws Exception {
    }

    public C11738e getTodoUIData() {
        return this.todoUIData;
    }

    public /* synthetic */ C11738e lambda$showDoneList$0$c() throws Exception {
        return C11738e.m48680a(2, this.todoUIData, this.todoListComposite);
    }

    public AbstractC68307f<C11738e> loadMore() {
        int loadMoreType = getLoadMoreType();
        if (loadMoreType != -1) {
            return loadMoreData(loadMoreType);
        }
        return AbstractC68307f.m265084a(new Throwable("nothing for load more"));
    }

    public boolean shouldEnableLoadMore() {
        C11738e eVar;
        if (getLoadMoreType() == -1 || (eVar = this.todoUIData) == null || !eVar.f31554c) {
            return false;
        }
        return true;
    }

    public AbstractC68307f<C11738e> showDoneList() {
        return AbstractC68307f.m265099b((Callable) new Callable() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$c$GkGq39flNncHJ5ZaECTd8dD2Y4 */

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C11736c.this.lambda$showDoneList$0$c();
            }
        }).mo238005b((Consumer) new Consumer() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$c$geYKCqIQqAoCuAss35EFYCSOmw */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C11736c.this.setTodoUIData((C11738e) obj);
            }
        });
    }

    private AbstractC68307f<C11738e> afterUpdateTodoStatus() {
        return AbstractC68307f.m265083a((Object) true).mo238005b((Consumer) new Consumer() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$c$cnS5kBSPyhaNNi9IEp0d9Oe1eZc */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C11736c.this.lambda$afterUpdateTodoStatus$1$c((Boolean) obj);
            }
        }).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$c$_kSWiULRYfArsRsYDkC5Cf3YjU */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11736c.this.lambda$afterUpdateTodoStatus$3$c((Boolean) obj);
            }
        }).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$c$jX4_Sr9qaUTT3xGAnb3cHIaguY */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11736c.this.lambda$afterUpdateTodoStatus$4$c((Serializable) obj);
            }
        }).mo238005b((Consumer) new Consumer() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$c$geYKCqIQqAoCuAss35EFYCSOmw */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C11736c.this.setTodoUIData((C11738e) obj);
            }
        });
    }

    private void updateCache() {
        try {
            C11685a.m48489a().mo44784a(2, JSON.toJSONString(this.todoListComposite.f31481a));
            C11685a.m48489a().mo44784a(1, JSON.toJSONString(this.todoListComposite.f31482b));
        } catch (Exception e) {
            C13479a.m54759a("TodoCenterViewModel", "updateCache: ", e);
        }
    }

    public int getLoadMoreType() {
        boolean a = this.todoUIData.mo44936a();
        boolean b = this.todoUIData.mo44937b();
        boolean d = this.todoListComposite.mo44807d();
        boolean e = this.todoListComposite.mo44808e();
        if (d) {
            if (a) {
                C13479a.m54764b("TodoCenterViewModel", "shouldEnableLoadMore: todoHasMore isTodoExpand = true, get todo more");
                return 2;
            } else if (!b || !e) {
                C13479a.m54764b("TodoCenterViewModel", "shouldEnableLoadMore: todoHasMore isTodoExpand = false，isDoneExpand = false, do nothing");
                return -1;
            } else {
                C13479a.m54764b("TodoCenterViewModel", "shouldEnableLoadMore: todoHasMore isTodoExpand = false，isDoneExpand = true, get done more");
                return 1;
            }
        } else if (!b || !e) {
            C13479a.m54764b("TodoCenterViewModel", "shouldEnableLoadMore: doneHasMore " + this.todoListComposite.mo44808e() + " isDoneExpand = " + b);
            return -1;
        } else {
            C13479a.m54764b("TodoCenterViewModel", "shouldEnableLoadMore: doneHasMore isDoneExpand = true");
            return 1;
        }
    }

    public AbstractC68307f<C11738e> loadCacheData() {
        return AbstractC68307f.m265092a(C11685a.m48489a().mo44783a(2), C11685a.m48489a().mo44783a(1), new BiFunction() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$c$jq5JMSlJhMyFFT03H5D4MGPamRc */

            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return C11736c.this.lambda$loadCacheData$17$c((TodoList) obj, (TodoList) obj2);
            }
        }).mo238005b((Consumer) $$Lambda$c$rOinEMQ_zB5hZMXO_kCB5uMcgQ.INSTANCE).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$c$o8FrIfrQ0KNJTubHyxa3ZF0QWK0 */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11736c.this.lambda$loadCacheData$19$c((C11696d) obj);
            }
        }).mo238005b((Consumer) new Consumer() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$c$geYKCqIQqAoCuAss35EFYCSOmw */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C11736c.this.setTodoUIData((C11738e) obj);
            }
        }).mo238004b(C11678b.m48480d()).mo237985a(C11678b.m48481e());
    }

    public AbstractC68307f<C11738e> loadLatestData() {
        return AbstractC68307f.m265092a(this.todoCenterModel.mo44791a(2, ""), this.todoCenterModel.mo44791a(1, ""), new BiFunction() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$c$dEaaPzHya0rE2RdEhaXPGzDcRM */

            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return C11736c.this.lambda$loadLatestData$20$c((TodoList) obj, (TodoList) obj2);
            }
        }).mo238005b((Consumer) new Consumer() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$c$CAtLhDHIfubANfaZfiP7GJgAAM4 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C11736c.this.lambda$loadLatestData$21$c((C11696d) obj);
            }
        }).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$c$VQLQk7S54FPn2Yi1LDkTorwdtU */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11736c.this.lambda$loadLatestData$22$c((C11696d) obj);
            }
        }).mo238005b((Consumer) new Consumer() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$c$geYKCqIQqAoCuAss35EFYCSOmw */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C11736c.this.setTodoUIData((C11738e) obj);
            }
        }).mo238004b(C11678b.m48480d()).mo237985a(C11678b.m48481e());
    }

    /* access modifiers changed from: private */
    public void setTodoUIData(C11738e eVar) {
        this.todoUIData = eVar;
    }

    public /* synthetic */ void lambda$loadLatestData$21$c(C11696d dVar) throws Exception {
        updateCache();
    }

    public /* synthetic */ void lambda$loadMoreData$15$c(TodoList todoList) throws Exception {
        updateCache();
    }

    public /* synthetic */ AbstractC70020b lambda$removeTodoIfNeeded$6$c(Boolean bool) throws Exception {
        return afterUpdateTodoStatus();
    }

    public /* synthetic */ AbstractC70020b lambda$syncPushItemAdd$13$c(TodoList todoList) throws Exception {
        return afterUpdateTodoStatus();
    }

    public /* synthetic */ AbstractC70020b lambda$syncPushItemDelete$11$c(TodoList todoList) throws Exception {
        return afterUpdateTodoStatus();
    }

    public /* synthetic */ AbstractC70020b lambda$updateTodoStatus$9$c(Boolean bool) throws Exception {
        return afterUpdateTodoStatus();
    }

    public /* synthetic */ C11738e lambda$afterUpdateTodoStatus$4$c(Serializable serializable) throws Exception {
        return C11738e.m48680a(3, this.todoUIData, this.todoListComposite);
    }

    public /* synthetic */ C11738e lambda$loadCacheData$19$c(C11696d dVar) throws Exception {
        return C11738e.m48680a(-1, this.todoUIData, this.todoListComposite);
    }

    public /* synthetic */ C11738e lambda$loadLatestData$22$c(C11696d dVar) throws Exception {
        return C11738e.m48680a(1, this.todoUIData, this.todoListComposite);
    }

    public /* synthetic */ C11738e lambda$loadMoreData$16$c(TodoList todoList) throws Exception {
        return C11738e.m48680a(2, this.todoUIData, this.todoListComposite);
    }

    public AbstractC68307f<C11738e> removeTodoIfNeeded(TodoUIEntity todoUIEntity) {
        return AbstractC68307f.m265083a((Object) true).mo238014c(new Function(todoUIEntity) {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$c$0QiEPDt_Ip5SbndDFwpkicZA0I */
            public final /* synthetic */ TodoUIEntity f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11736c.this.lambda$removeTodoIfNeeded$5$c(this.f$1, (Boolean) obj);
            }
        }).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$c$5IEj_jeTzAbVrea84PNgIoUwtw8 */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11736c.this.lambda$removeTodoIfNeeded$6$c((Boolean) obj);
            }
        });
    }

    public AbstractC68307f<C11738e> syncPushItemAdd(TodoList todoList) {
        return AbstractC68307f.m265083a(todoList).mo238005b((Consumer) new Consumer(todoList) {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$c$nnSRtMHkQMMKbOZeMuVf5LZPig */
            public final /* synthetic */ TodoList f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C11736c.this.lambda$syncPushItemAdd$12$c(this.f$1, (TodoList) obj);
            }
        }).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$c$IxIsYz1_kjI15pT2IaDXgInibGc */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11736c.this.lambda$syncPushItemAdd$13$c((TodoList) obj);
            }
        });
    }

    public AbstractC68307f<C11738e> syncPushItemDelete(TodoList todoList) {
        return AbstractC68307f.m265083a(todoList).mo238005b((Consumer) new Consumer(todoList) {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$c$fmlXjtI79oCzUnYP8ORX4WNECpU */
            public final /* synthetic */ TodoList f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C11736c.this.lambda$syncPushItemDelete$10$c(this.f$1, (TodoList) obj);
            }
        }).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$c$nFHz3uEiDU0KprzBGj8SpbbRUI0 */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11736c.this.lambda$syncPushItemDelete$11$c((TodoList) obj);
            }
        });
    }

    public /* synthetic */ void lambda$afterUpdateTodoStatus$1$c(Boolean bool) throws Exception {
        C11685a.m48489a().mo44784a(2, JSON.toJSONString(this.todoListComposite.f31481a));
        C11685a.m48489a().mo44784a(1, JSON.toJSONString(this.todoListComposite.f31482b));
    }

    public /* synthetic */ AbstractC70020b lambda$afterUpdateTodoStatus$3$c(Boolean bool) throws Exception {
        if (!this.todoListComposite.mo44803a()) {
            return AbstractC68307f.m265083a(bool);
        }
        C13479a.m54764b("TodoCenterViewModel", "updateTodoStatus: load more todo list");
        AbstractC68307f<TodoList> a = this.todoCenterModel.mo44791a(2, this.todoListComposite.f31481a.next_page_token);
        C11696d dVar = this.todoListComposite;
        dVar.getClass();
        return a.mo238005b(new Consumer() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$jssJw3ATKF07wjOq4rONPDge3eo */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C11696d.this.mo44800a((TodoList) obj);
            }
        }).mo238026e($$Lambda$c$X9vrCZKAct99he0G7xd2VN4W02w.INSTANCE);
    }

    private AbstractC68307f<C11738e> loadMoreData(int i) {
        String str;
        C11696d dVar = this.todoListComposite;
        if (i == 2) {
            if (dVar.f31481a != null) {
                str = dVar.f31481a.next_page_token;
                C13479a.m54764b("TodoCenterViewModel", "load more todo type: " + AbstractC11690a.CC.m48503a(i) + " next pageToken: " + str);
                return this.todoCenterModel.mo44791a(i, str).mo238005b(new Consumer(i, dVar) {
                    /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$c$d1RxqGd6ir7OTrH4lnP8hdOOxy8 */
                    public final /* synthetic */ int f$0;
                    public final /* synthetic */ C11696d f$1;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C11736c.lambda$loadMoreData$14(this.f$0, this.f$1, (TodoList) obj);
                    }
                }).mo238005b(new Consumer() {
                    /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$c$rEQotN7oapKNO0DTTOguQtzsTmk */

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C11736c.this.lambda$loadMoreData$15$c((TodoList) obj);
                    }
                }).mo238020d(new Function() {
                    /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$c$ekC9yTNvkLt1jeE_SzQ26zpT6jU */

                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return C11736c.this.lambda$loadMoreData$16$c((TodoList) obj);
                    }
                }).mo238005b(new Consumer() {
                    /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$c$geYKCqIQqAoCuAss35EFYCSOmw */

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C11736c.this.setTodoUIData((C11738e) obj);
                    }
                }).mo238004b(C11678b.m48480d()).mo237985a(C11678b.m48481e());
            }
        } else if (i == 1 && dVar.f31482b != null) {
            str = dVar.f31482b.next_page_token;
            C13479a.m54764b("TodoCenterViewModel", "load more todo type: " + AbstractC11690a.CC.m48503a(i) + " next pageToken: " + str);
            return this.todoCenterModel.mo44791a(i, str).mo238005b(new Consumer(i, dVar) {
                /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$c$d1RxqGd6ir7OTrH4lnP8hdOOxy8 */
                public final /* synthetic */ int f$0;
                public final /* synthetic */ C11696d f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C11736c.lambda$loadMoreData$14(this.f$0, this.f$1, (TodoList) obj);
                }
            }).mo238005b(new Consumer() {
                /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$c$rEQotN7oapKNO0DTTOguQtzsTmk */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C11736c.this.lambda$loadMoreData$15$c((TodoList) obj);
                }
            }).mo238020d(new Function() {
                /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$c$ekC9yTNvkLt1jeE_SzQ26zpT6jU */

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C11736c.this.lambda$loadMoreData$16$c((TodoList) obj);
                }
            }).mo238005b(new Consumer() {
                /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$c$geYKCqIQqAoCuAss35EFYCSOmw */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C11736c.this.setTodoUIData((C11738e) obj);
                }
            }).mo238004b(C11678b.m48480d()).mo237985a(C11678b.m48481e());
        }
        str = null;
        C13479a.m54764b("TodoCenterViewModel", "load more todo type: " + AbstractC11690a.CC.m48503a(i) + " next pageToken: " + str);
        return this.todoCenterModel.mo44791a(i, str).mo238005b(new Consumer(i, dVar) {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$c$d1RxqGd6ir7OTrH4lnP8hdOOxy8 */
            public final /* synthetic */ int f$0;
            public final /* synthetic */ C11696d f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C11736c.lambda$loadMoreData$14(this.f$0, this.f$1, (TodoList) obj);
            }
        }).mo238005b(new Consumer() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$c$rEQotN7oapKNO0DTTOguQtzsTmk */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C11736c.this.lambda$loadMoreData$15$c((TodoList) obj);
            }
        }).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$c$ekC9yTNvkLt1jeE_SzQ26zpT6jU */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11736c.this.lambda$loadMoreData$16$c((TodoList) obj);
            }
        }).mo238005b(new Consumer() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$c$geYKCqIQqAoCuAss35EFYCSOmw */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C11736c.this.setTodoUIData((C11738e) obj);
            }
        }).mo238004b(C11678b.m48480d()).mo237985a(C11678b.m48481e());
    }

    public /* synthetic */ C11696d lambda$loadLatestData$20$c(TodoList todoList, TodoList todoList2) throws Exception {
        C11696d dVar = this.todoListComposite;
        dVar.f31481a = todoList;
        dVar.f31482b = todoList2;
        return dVar;
    }

    public /* synthetic */ void lambda$syncPushItemDelete$10$c(TodoList todoList, TodoList todoList2) throws Exception {
        C11696d dVar = this.todoListComposite;
        dVar.mo44801a(dVar.f31481a, todoList.todo_list);
        C11696d dVar2 = this.todoListComposite;
        dVar2.mo44801a(dVar2.f31482b, todoList.todo_list);
    }

    public /* synthetic */ C11696d lambda$loadCacheData$17$c(TodoList todoList, TodoList todoList2) throws Exception {
        C11696d dVar = this.todoListComposite;
        dVar.f31481a = todoList;
        dVar.f31482b = todoList2;
        if (!C5084ad.m20847d().mo20038b().mo20041b()) {
            C13479a.m54764b("TodoCenterViewModel", "loadCacheData: no network");
            dVar.f31481a.has_more = false;
            dVar.f31482b.has_more = false;
        }
        return dVar;
    }

    public AbstractC68307f<C11738e> updateTodoStatus(TodoUIEntity todoUIEntity, boolean z) {
        return this.todoCenterModel.mo44792a(todoUIEntity.todo_id, z).mo238005b(new Consumer(z, todoUIEntity) {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$c$wAV50qU1NhM5aKpWx5urrESWnFs */
            public final /* synthetic */ boolean f$0;
            public final /* synthetic */ TodoUIEntity f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                boolean z = this.f$0;
                TodoUIEntity todoUIEntity = this.f$1;
                Boolean bool = (Boolean) obj;
                C13479a.m54772d((boolean) "TodoCenterViewModel", (TodoUIEntity) ("updateTodo: isDone " + z + " todoEntity=" + todoUIEntity.toString()));
            }
        }).mo238005b(new Consumer(todoUIEntity) {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$c$rQF8t3ZWUahNV1ykNWO9p3JluXY */
            public final /* synthetic */ TodoUIEntity f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C11736c.this.lambda$updateTodoStatus$8$c(this.f$1, (Boolean) obj);
            }
        }).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.todocenter.ui.$$Lambda$c$3pXqdImMQdfTovDJghDa4RgelyY */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11736c.this.lambda$updateTodoStatus$9$c((Boolean) obj);
            }
        });
    }

    public /* synthetic */ AbstractC70020b lambda$removeTodoIfNeeded$5$c(TodoUIEntity todoUIEntity, Boolean bool) throws Exception {
        Todo a = C11696d.m48517a(this.todoListComposite.f31481a, todoUIEntity.todo_id);
        if (a != null) {
            C13479a.m54764b("TodoCenterViewModel", "updateTodo error : from todolist " + a);
        }
        Todo a2 = C11696d.m48517a(this.todoListComposite.f31482b, todoUIEntity.todo_id);
        if (a2 != null) {
            C13479a.m54764b("TodoCenterViewModel", "updateTodo error : from doneList " + a2);
        }
        return AbstractC68307f.m265083a((Object) true);
    }

    public /* synthetic */ void lambda$syncPushItemAdd$12$c(TodoList todoList, TodoList todoList2) throws Exception {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Todo todo : todoList.todo_list) {
            if (todo.is_done) {
                arrayList2.add(todo);
            } else {
                arrayList.add(todo);
            }
        }
        C11696d dVar = this.todoListComposite;
        dVar.mo44802a(dVar.f31481a, arrayList, todoList.entities, new C11695c());
        C11696d dVar2 = this.todoListComposite;
        dVar2.mo44802a(dVar2.f31482b, arrayList2, todoList.entities, new C11693a());
    }

    public /* synthetic */ void lambda$updateTodoStatus$8$c(TodoUIEntity todoUIEntity, Boolean bool) throws Exception {
        Todo a = C11696d.m48517a(this.todoListComposite.f31481a, todoUIEntity.todo_id);
        if (a != null) {
            C13479a.m54764b("TodoCenterViewModel", "updateTodo: from todolist " + a);
            a.done_time = System.currentTimeMillis() / 1000;
            a.is_done = true;
            if (!this.todoListComposite.mo44806c()) {
                C11696d.m48519a(this.todoListComposite.f31482b, 0, a);
                return;
            }
            this.todoListComposite.f31482b = new TodoList();
            this.todoListComposite.f31482b.todo_list = new ArrayList();
            C11696d.m48519a(this.todoListComposite.f31482b, 0, a);
            return;
        }
        Todo a2 = C11696d.m48517a(this.todoListComposite.f31482b, todoUIEntity.todo_id);
        if (a2 != null) {
            C13479a.m54764b("TodoCenterViewModel", "updateTodo: from donelist " + a2);
            a2.is_done = false;
            C11696d.m48519a(this.todoListComposite.f31481a, 0, a2);
            Collections.sort(this.todoListComposite.f31481a.todo_list, new C11695c());
        }
    }

    static /* synthetic */ void lambda$loadMoreData$14(int i, C11696d dVar, TodoList todoList) throws Exception {
        if (i == 2) {
            dVar.mo44800a(todoList);
        } else if (i == 1) {
            dVar.mo44804b(todoList);
        }
    }
}
