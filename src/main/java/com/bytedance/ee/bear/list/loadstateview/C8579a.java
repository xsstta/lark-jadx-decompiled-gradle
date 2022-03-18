package com.bytedance.ee.bear.list.loadstateview;

import android.os.Looper;
import android.os.Message;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.bear.list.loadstateview.LoadStateView;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p698a.AbstractC13583a;
import com.bytedance.ee.util.p698a.C13584b;
import com.bytedance.ee.util.p698a.C13585c;
import com.bytedance.ee.util.p718t.C13748k;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/* renamed from: com.bytedance.ee.bear.list.loadstateview.a */
public class C8579a extends C13585c {

    /* renamed from: a */
    public final C8583c f23298a;

    /* renamed from: b */
    public final C8585e f23299b;

    /* renamed from: c */
    public final C8586f f23300c;

    /* renamed from: d */
    public final C8588h f23301d;

    /* renamed from: e */
    public final C8589i f23302e;

    /* renamed from: f */
    public C8595c f23303f;

    /* renamed from: g */
    public C1177w<LoadStateCategory> f23304g = new C1177w<>();

    /* renamed from: h */
    EmptyCategory f23305h;

    /* renamed from: i */
    public boolean f23306i = false;

    /* renamed from: k */
    private final C8582b f23307k;

    /* renamed from: l */
    private final C8590j f23308l;

    /* renamed from: m */
    private final C8587g f23309m;

    /* renamed from: n */
    private final C8584d f23310n;

    /* renamed from: a */
    public void mo33486a() {
        mo50495b(2, (Object) true);
    }

    /* renamed from: b */
    public void mo33495b() {
        mo50494b(3, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.loadstateview.a$b */
    public class C8582b extends C8581a {
        @Override // com.bytedance.ee.bear.list.loadstateview.C8579a.C8581a, com.bytedance.ee.util.p698a.C13584b
        /* renamed from: a */
        public void mo33497a() {
            C13479a.m54772d("load_state_view_module", C8579a.this.f23305h + " DefaultState enter: ");
            super.mo33497a();
        }

        @Override // com.bytedance.ee.bear.list.loadstateview.C8579a.C8581a, com.bytedance.ee.util.p698a.C13584b
        /* renamed from: b */
        public void mo33499b() {
            C13479a.m54772d("load_state_view_module", C8579a.this.f23305h + " DefaultState exit: ");
            super.mo33499b();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private C8582b() {
            super();
            C8579a.this = r2;
        }

        @Override // com.bytedance.ee.bear.list.loadstateview.C8579a.C8581a, com.bytedance.ee.util.p698a.C13584b
        /* renamed from: a */
        public boolean mo33498a(Message message) {
            C13479a.m54772d("load_state_view_module", C8579a.this.f23305h + " DefaultState processMessage: unhandle msg=" + C8579a.this.mo33485a(message));
            return false;
        }
    }

    /* renamed from: com.bytedance.ee.bear.list.loadstateview.a$c */
    public class C8583c extends C8581a {
        @Override // com.bytedance.ee.bear.list.loadstateview.C8579a.C8581a, com.bytedance.ee.util.p698a.C13584b
        /* renamed from: b */
        public void mo33499b() {
            C13479a.m54772d("load_state_view_module", C8579a.this.f23305h + " IdleState exit: ");
            super.mo33499b();
        }

        @Override // com.bytedance.ee.bear.list.loadstateview.C8579a.C8581a, com.bytedance.ee.util.p698a.C13584b
        /* renamed from: a */
        public void mo33497a() {
            C13479a.m54772d("load_state_view_module", C8579a.this.f23305h + " IdleState enter: ");
            super.mo33497a();
            C8579a.this.f23303f.mo33523c();
            C8579a.this.f23304g.mo5926a(LoadStateCategory.IDLE);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private C8583c() {
            super();
            C8579a.this = r2;
        }

        @Override // com.bytedance.ee.bear.list.loadstateview.C8579a.C8581a, com.bytedance.ee.util.p698a.C13584b
        /* renamed from: a */
        public boolean mo33498a(Message message) {
            C13479a.m54772d("load_state_view_module", C8579a.this.f23305h + " IdleState processMessage: msg=" + C8579a.this.mo33485a(message));
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    C8579a aVar = C8579a.this;
                    aVar.mo50489a((AbstractC13583a) aVar.f23302e);
                    C8579a.this.mo50496b(message);
                } else if (!C8579a.this.f23306i) {
                    return super.mo33498a(message);
                } else {
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.loadstateview.a$d */
    public class C8584d extends C8581a {
        @Override // com.bytedance.ee.bear.list.loadstateview.C8579a.C8581a, com.bytedance.ee.util.p698a.C13584b
        /* renamed from: a */
        public void mo33497a() {
            C13479a.m54772d("load_state_view_module", C8579a.this.f23305h + " LoadState enter: ");
            super.mo33497a();
        }

        @Override // com.bytedance.ee.bear.list.loadstateview.C8579a.C8581a, com.bytedance.ee.util.p698a.C13584b
        /* renamed from: b */
        public void mo33499b() {
            C13479a.m54772d("load_state_view_module", C8579a.this.f23305h + " LoadState exit: ");
            super.mo33499b();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private C8584d() {
            super();
            C8579a.this = r2;
        }

        @Override // com.bytedance.ee.bear.list.loadstateview.C8579a.C8581a, com.bytedance.ee.util.p698a.C13584b
        /* renamed from: a */
        public boolean mo33498a(Message message) {
            C13479a.m54772d("load_state_view_module", C8579a.this.f23305h + " LoadState processMessage: msg=" + C8579a.this.mo33485a(message));
            return false;
        }
    }

    /* renamed from: com.bytedance.ee.bear.list.loadstateview.a$f */
    public class C8586f extends C8581a {
        @Override // com.bytedance.ee.bear.list.loadstateview.C8579a.C8581a, com.bytedance.ee.util.p698a.C13584b
        /* renamed from: b */
        public void mo33499b() {
            C13479a.m54772d("load_state_view_module", C8579a.this.f23305h + " LoadedFailState exit: ");
            super.mo33499b();
        }

        @Override // com.bytedance.ee.bear.list.loadstateview.C8579a.C8581a, com.bytedance.ee.util.p698a.C13584b
        /* renamed from: a */
        public void mo33497a() {
            C13479a.m54772d("load_state_view_module", C8579a.this.f23305h + " LoadedFailState enter: ");
            super.mo33497a();
            C8579a.this.f23304g.mo5926a(LoadStateCategory.LOADED_FAIL);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private C8586f() {
            super();
            C8579a.this = r2;
        }

        @Override // com.bytedance.ee.bear.list.loadstateview.C8579a.C8581a, com.bytedance.ee.util.p698a.C13584b
        /* renamed from: a */
        public boolean mo33498a(Message message) {
            C13479a.m54772d("load_state_view_module", C8579a.this.f23305h + " LoadedFailState processMessage: msg=" + C8579a.this.mo33485a(message));
            int i = message.what;
            if (i == 1) {
                C8579a aVar = C8579a.this;
                aVar.mo50489a((AbstractC13583a) aVar.f23298a);
                return true;
            } else if (i == 6) {
                C8579a.this.f23303f.mo33518a((LoadFailCategory) message.obj);
                return true;
            } else if (!C8579a.this.f23306i) {
                return super.mo33498a(message);
            } else {
                return false;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.loadstateview.a$g */
    public class C8587g extends C8581a {
        @Override // com.bytedance.ee.bear.list.loadstateview.C8579a.C8581a, com.bytedance.ee.util.p698a.C13584b
        /* renamed from: a */
        public void mo33497a() {
            C13479a.m54772d("load_state_view_module", C8579a.this.f23305h + " LoadedState enter: ");
            super.mo33497a();
        }

        @Override // com.bytedance.ee.bear.list.loadstateview.C8579a.C8581a, com.bytedance.ee.util.p698a.C13584b
        /* renamed from: b */
        public void mo33499b() {
            C13479a.m54772d("load_state_view_module", C8579a.this.f23305h + " LoadedState exit: ");
            super.mo33499b();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private C8587g() {
            super();
            C8579a.this = r2;
        }

        @Override // com.bytedance.ee.bear.list.loadstateview.C8579a.C8581a, com.bytedance.ee.util.p698a.C13584b
        /* renamed from: a */
        public boolean mo33498a(Message message) {
            C13479a.m54772d("load_state_view_module", C8579a.this.f23305h + " LoadedState processMessage: msg=" + C8579a.this.mo33485a(message));
            if (message.what == 2) {
                C8579a aVar = C8579a.this;
                aVar.mo50489a((AbstractC13583a) aVar.f23302e);
                C8579a.this.mo50496b(message);
                return true;
            } else if (C8579a.this.f23306i) {
                return super.mo33498a(message);
            } else {
                return false;
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.list.loadstateview.a$h */
    public class C8588h extends C8581a {
        @Override // com.bytedance.ee.bear.list.loadstateview.C8579a.C8581a, com.bytedance.ee.util.p698a.C13584b
        /* renamed from: b */
        public void mo33499b() {
            C13479a.m54772d("load_state_view_module", C8579a.this.f23305h + " LoadedSuccessState exit: ");
            super.mo33499b();
        }

        @Override // com.bytedance.ee.bear.list.loadstateview.C8579a.C8581a, com.bytedance.ee.util.p698a.C13584b
        /* renamed from: a */
        public void mo33497a() {
            C13479a.m54772d("load_state_view_module", C8579a.this.f23305h + " LoadedSuccessState enter: ");
            super.mo33497a();
            C8579a.this.f23303f.mo33523c();
            C8579a.this.f23304g.mo5926a(LoadStateCategory.LOADED_SUCCESS);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private C8588h() {
            super();
            C8579a.this = r2;
        }

        @Override // com.bytedance.ee.bear.list.loadstateview.C8579a.C8581a, com.bytedance.ee.util.p698a.C13584b
        /* renamed from: a */
        public boolean mo33498a(Message message) {
            C13479a.m54772d("load_state_view_module", C8579a.this.f23305h + " LoadedSuccessState processMessage: msg=" + C8579a.this.mo33485a(message));
            int i = message.what;
            if (i == 4) {
                C8579a aVar = C8579a.this;
                aVar.mo50489a((AbstractC13583a) aVar.f23299b);
                return true;
            } else if (i == 30) {
                if (message.arg1 > 0) {
                    C8579a aVar2 = C8579a.this;
                    aVar2.mo50489a((AbstractC13583a) aVar2.f23301d);
                } else {
                    C8579a aVar3 = C8579a.this;
                    aVar3.mo50489a((AbstractC13583a) aVar3.f23299b);
                }
                return true;
            } else if (!C8579a.this.f23306i) {
                return super.mo33498a(message);
            } else {
                return false;
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.list.loadstateview.a$j */
    public class C8590j extends C8581a {

        /* renamed from: b */
        boolean f23320b;

        @Override // com.bytedance.ee.bear.list.loadstateview.C8579a.C8581a, com.bytedance.ee.util.p698a.C13584b
        /* renamed from: b */
        public void mo33499b() {
            C13479a.m54772d("load_state_view_module", C8579a.this.f23305h + " StartupState exit: ");
            super.mo33499b();
        }

        @Override // com.bytedance.ee.bear.list.loadstateview.C8579a.C8581a, com.bytedance.ee.util.p698a.C13584b
        /* renamed from: a */
        public void mo33497a() {
            C13479a.m54772d("load_state_view_module", C8579a.this.f23305h + " StartupState enter: ");
            super.mo33497a();
            C8579a.this.f23304g.mo5926a(LoadStateCategory.STARTUP);
            AbstractC68307f.m265083a("").mo237985a(C11678b.m48477a()).mo238020d(new Function<String, Boolean>() {
                /* class com.bytedance.ee.bear.list.loadstateview.C8579a.C8590j.C85933 */

                /* renamed from: a */
                public Boolean apply(String str) {
                    return Boolean.valueOf(C8579a.this.f23303f.mo33524d());
                }
            }).mo237985a(C11678b.m48481e()).mo238001b(new Consumer<Boolean>() {
                /* class com.bytedance.ee.bear.list.loadstateview.C8579a.C8590j.C85911 */

                /* renamed from: a */
                public void accept(Boolean bool) {
                    C8590j.this.f23320b = bool.booleanValue();
                    if (bool.booleanValue()) {
                        C8579a.this.mo50510f(1);
                    }
                }
            }, new Consumer<Throwable>() {
                /* class com.bytedance.ee.bear.list.loadstateview.C8579a.C8590j.C85922 */

                /* renamed from: a */
                public void accept(Throwable th) {
                    C13479a.m54759a("load_state_view_module", C8579a.this.f23305h + " StartupState accept: ", th);
                }
            });
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private C8590j() {
            super();
            C8579a.this = r2;
        }

        @Override // com.bytedance.ee.bear.list.loadstateview.C8579a.C8581a, com.bytedance.ee.util.p698a.C13584b
        /* renamed from: a */
        public boolean mo33498a(Message message) {
            C13479a.m54772d("load_state_view_module", C8579a.this.f23305h + " StartupState processMessage: msg=" + C8579a.this.mo33485a(message));
            int i = message.what;
            if (i != 30) {
                switch (i) {
                    case 1:
                        if (this.f23320b) {
                            C8579a aVar = C8579a.this;
                            aVar.mo50489a((AbstractC13583a) aVar.f23298a);
                        } else {
                            C8579a.this.mo50496b(message);
                        }
                        return true;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        break;
                    default:
                        return false;
                }
            }
            C8579a.this.mo50496b(message);
            return true;
        }
    }

    /* renamed from: com.bytedance.ee.bear.list.loadstateview.a$e */
    public class C8585e extends C8581a {
        @Override // com.bytedance.ee.bear.list.loadstateview.C8579a.C8581a, com.bytedance.ee.util.p698a.C13584b
        /* renamed from: a */
        public void mo33497a() {
            C13479a.m54772d("load_state_view_module", C8579a.this.f23305h + " LoadedEmptyState enter: ");
            super.mo33497a();
            C8579a.this.f23303f.mo33522b();
            C8579a.this.f23304g.mo5926a(LoadStateCategory.LOADED_SUCCESS_EMPTY);
        }

        @Override // com.bytedance.ee.bear.list.loadstateview.C8579a.C8581a, com.bytedance.ee.util.p698a.C13584b
        /* renamed from: b */
        public void mo33499b() {
            C13479a.m54772d("load_state_view_module", C8579a.this.f23305h + " LoadedEmptyState exit: ");
            super.mo33499b();
            C8579a.this.f23303f.mo33523c();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private C8585e() {
            super();
            C8579a.this = r2;
        }

        @Override // com.bytedance.ee.bear.list.loadstateview.C8579a.C8581a, com.bytedance.ee.util.p698a.C13584b
        /* renamed from: a */
        public boolean mo33498a(Message message) {
            C13479a.m54772d("load_state_view_module", C8579a.this.f23305h + " LoadedEmptyState processMessage: msg=" + C8579a.this.mo33485a(message));
            if (message.what == 4) {
                C13479a.m54772d("load_state_view_module", C8579a.this.f23305h + " LoadStateMachine.java.processMessage: LoadedEmptyState  already empty state ");
                return true;
            } else if (!C8579a.this.f23306i) {
                return super.mo33498a(message);
            } else {
                return false;
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.list.loadstateview.a$i */
    public class C8589i extends C8581a {
        @Override // com.bytedance.ee.bear.list.loadstateview.C8579a.C8581a, com.bytedance.ee.util.p698a.C13584b
        /* renamed from: a */
        public void mo33497a() {
            C13479a.m54772d("load_state_view_module", C8579a.this.f23305h + " LoadingState enter: ");
            super.mo33497a();
            C8579a.this.f23304g.mo5926a(LoadStateCategory.LOADING);
        }

        @Override // com.bytedance.ee.bear.list.loadstateview.C8579a.C8581a, com.bytedance.ee.util.p698a.C13584b
        /* renamed from: b */
        public void mo33499b() {
            C13479a.m54772d("load_state_view_module", C8579a.this.f23305h + " LoadingState exit: ");
            super.mo33499b();
            C8579a.this.f23303f.mo33523c();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private C8589i() {
            super();
            C8579a.this = r2;
        }

        @Override // com.bytedance.ee.bear.list.loadstateview.C8579a.C8581a, com.bytedance.ee.util.p698a.C13584b
        /* renamed from: a */
        public boolean mo33498a(Message message) {
            C13479a.m54772d("load_state_view_module", C8579a.this.f23305h + " LoadingState .processMessage:  msg= " + C8579a.this.mo33485a(message));
            int i = message.what;
            if (i == 2) {
                try {
                    if (((Boolean) message.obj).booleanValue()) {
                        C8579a.this.f23303f.mo33516a();
                    }
                } catch (Exception e) {
                    C13479a.m54759a("load_state_view_module", C8579a.this.f23305h + " LoadingState processMessage: ", e);
                }
                return true;
            } else if (i == 3) {
                if (message.arg1 > 0) {
                    C8579a aVar = C8579a.this;
                    aVar.mo50489a((AbstractC13583a) aVar.f23301d);
                } else {
                    C8579a aVar2 = C8579a.this;
                    aVar2.mo50489a((AbstractC13583a) aVar2.f23299b);
                }
                return true;
            } else if (i == 5) {
                C8579a aVar3 = C8579a.this;
                aVar3.mo50489a((AbstractC13583a) aVar3.f23300c);
                Message obtain = Message.obtain(message);
                obtain.what = 6;
                C8579a.this.mo50496b(obtain);
                return true;
            } else if (!C8579a.this.f23306i) {
                return super.mo33498a(message);
            } else {
                return false;
            }
        }
    }

    /* renamed from: a */
    public void mo33494a(boolean z) {
        this.f23306i = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.loadstateview.a$a */
    public class C8581a extends C13584b {
        @Override // com.bytedance.ee.util.p698a.C13584b
        /* renamed from: a */
        public void mo33497a() {
        }

        @Override // com.bytedance.ee.util.p698a.C13584b
        /* renamed from: b */
        public void mo33499b() {
        }

        private C8581a() {
            C8579a.this = r1;
        }

        @Override // com.bytedance.ee.util.p698a.C13584b
        /* renamed from: a */
        public boolean mo33498a(Message message) {
            if (C8579a.this.f23306i) {
                return false;
            }
            int i = message.what;
            if (i != 30) {
                switch (i) {
                    case 1:
                        C8579a aVar = C8579a.this;
                        aVar.mo50489a((AbstractC13583a) aVar.f23298a);
                        return true;
                    case 2:
                        C8579a aVar2 = C8579a.this;
                        aVar2.mo50489a((AbstractC13583a) aVar2.f23302e);
                        C8579a.this.mo50496b(message);
                        return true;
                    case 3:
                        break;
                    case 4:
                        C8579a aVar3 = C8579a.this;
                        aVar3.mo50489a((AbstractC13583a) aVar3.f23299b);
                        return true;
                    case 5:
                    case 6:
                        C8579a aVar4 = C8579a.this;
                        aVar4.mo50489a((AbstractC13583a) aVar4.f23300c);
                        Message obtain = Message.obtain(message);
                        obtain.what = 6;
                        C8579a.this.mo50512g(obtain);
                        return true;
                    default:
                        return false;
                }
            }
            if (message.arg1 > 0) {
                C8579a aVar5 = C8579a.this;
                aVar5.mo50489a((AbstractC13583a) aVar5.f23301d);
            } else {
                C8579a aVar6 = C8579a.this;
                aVar6.mo50489a((AbstractC13583a) aVar6.f23299b);
            }
            return true;
        }
    }

    /* renamed from: a */
    public void mo33487a(int i) {
        mo50494b(30, i);
    }

    /* renamed from: b */
    public void mo33496b(int i) {
        mo50494b(3, i);
    }

    /* renamed from: a */
    public void mo33489a(EmptyCategory emptyCategory) {
        this.f23305h = emptyCategory;
        this.f23303f.mo33517a(emptyCategory);
    }

    /* renamed from: a */
    public void mo33490a(LoadFailCategory loadFailCategory) {
        mo50495b(5, loadFailCategory);
    }

    /* renamed from: a */
    public String mo33485a(Message message) {
        StringBuilder sb = new StringBuilder();
        sb.append("msg={");
        int i = message.what;
        if (i != 30) {
            switch (i) {
                case 1:
                    sb.append("what= EVENT_STATE_IDLE");
                    break;
                case 2:
                    sb.append("what= EVENT_STATE_LOADING");
                    break;
                case 3:
                    sb.append("what= EVENT_STATE_LOADED_SUCCESS");
                    break;
                case 4:
                    sb.append("what= EVENT_STATE_LOADED_EMPTY");
                    break;
                case 5:
                    sb.append("what= EVENT_STATE_LOADED_FAIL");
                    break;
                case 6:
                    sb.append("what= EVENT_SHOW_LOADED_FAIL");
                    break;
                default:
                    sb.append(message.what);
                    break;
            }
        } else {
            sb.append("what= EVENT_STATE_UPDATE_EMPTY");
        }
        sb.append("; arg1=" + message.arg1);
        sb.append("; arg2=" + message.arg2);
        if (message.obj != null) {
            sb.append("; obj=" + message.obj.toString() + "}");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo33491a(LoadStateView.AbstractC8570b bVar) {
        this.f23303f.mo33519a(bVar);
    }

    /* renamed from: a */
    public void mo33492a(LoadStateView.AbstractC8574f fVar) {
        this.f23303f.mo33520a(fVar);
    }

    /* renamed from: a */
    public void mo33493a(LoadingCategory loadingCategory) {
        this.f23303f.mo33521a(loadingCategory);
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m35800b(LifecycleOwner lifecycleOwner, AbstractC1178x xVar) {
        this.f23304g.mo5923a(lifecycleOwner, xVar);
    }

    /* renamed from: a */
    public void mo33488a(LifecycleOwner lifecycleOwner, AbstractC1178x<LoadStateCategory> xVar) {
        C13748k.m55732a(new Runnable(lifecycleOwner, xVar) {
            /* class com.bytedance.ee.bear.list.loadstateview.$$Lambda$a$BbOkl9aykEf4ASoKeIW0JLWQzz0 */
            public final /* synthetic */ LifecycleOwner f$1;
            public final /* synthetic */ AbstractC1178x f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C8579a.lambda$BbOkl9aykEf4ASoKeIW0JLWQzz0(C8579a.this, this.f$1, this.f$2);
            }
        });
    }

    C8579a(String str, Looper looper, LoadStateView loadStateView) {
        super(str, looper);
        C8582b bVar = new C8582b();
        this.f23307k = bVar;
        C8590j jVar = new C8590j();
        this.f23308l = jVar;
        C8583c cVar = new C8583c();
        this.f23298a = cVar;
        C8585e eVar = new C8585e();
        this.f23299b = eVar;
        C8586f fVar = new C8586f();
        this.f23300c = fVar;
        C8588h hVar = new C8588h();
        this.f23301d = hVar;
        C8587g gVar = new C8587g();
        this.f23309m = gVar;
        C8589i iVar = new C8589i();
        this.f23302e = iVar;
        C8584d dVar = new C8584d();
        this.f23310n = dVar;
        this.f23303f = new C8595c(loadStateView);
        mo50490a((C13584b) bVar);
        mo50491a(jVar, bVar);
        mo50491a(cVar, bVar);
        mo50491a(dVar, bVar);
        mo50491a(iVar, dVar);
        mo50491a(gVar, dVar);
        mo50491a(hVar, gVar);
        mo50491a(fVar, gVar);
        mo50491a(eVar, hVar);
        mo50497b(jVar);
    }
}
