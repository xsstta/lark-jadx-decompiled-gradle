package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.p011a.p012a.p013a.C0179a;
import androidx.p011a.p012a.p014b.C0185a;
import androidx.p011a.p012a.p014b.C0186b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class LifecycleRegistry extends Lifecycle {
    private int mAddingObserverCounter;
    private final boolean mEnforceMainThread;
    private boolean mHandlingEvent;
    private final WeakReference<LifecycleOwner> mLifecycleOwner;
    private boolean mNewEventOccurred;
    private C0185a<LifecycleObserver, C1119a> mObserverMap;
    private ArrayList<Lifecycle.State> mParentStates;
    private Lifecycle.State mState;

    @Override // androidx.lifecycle.Lifecycle
    public Lifecycle.State getCurrentState() {
        return this.mState;
    }

    private void popParentState() {
        ArrayList<Lifecycle.State> arrayList = this.mParentStates;
        arrayList.remove(arrayList.size() - 1);
    }

    public int getObserverCount() {
        enforceMainThreadIfNeeded("getObserverCount");
        return this.mObserverMap.mo560a();
    }

    private boolean isSynced() {
        if (this.mObserverMap.mo560a() == 0) {
            return true;
        }
        Lifecycle.State state = this.mObserverMap.mo564d().getValue().f4185a;
        Lifecycle.State state2 = this.mObserverMap.mo565e().getValue().f4185a;
        if (state == state2 && this.mState == state2) {
            return true;
        }
        return false;
    }

    private void sync() {
        LifecycleOwner lifecycleOwner = this.mLifecycleOwner.get();
        if (lifecycleOwner != null) {
            while (!isSynced()) {
                this.mNewEventOccurred = false;
                if (this.mState.compareTo((Enum) this.mObserverMap.mo564d().getValue().f4185a) < 0) {
                    backwardPass(lifecycleOwner);
                }
                Map.Entry<LifecycleObserver, C1119a> e = this.mObserverMap.mo565e();
                if (!this.mNewEventOccurred && e != null && this.mState.compareTo((Enum) e.getValue().f4185a) > 0) {
                    forwardPass(lifecycleOwner);
                }
            }
            this.mNewEventOccurred = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    public LifecycleRegistry(LifecycleOwner lifecycleOwner) {
        this(lifecycleOwner, true);
    }

    public static LifecycleRegistry createUnsafe(LifecycleOwner lifecycleOwner) {
        return new LifecycleRegistry(lifecycleOwner, false);
    }

    private void pushParentState(Lifecycle.State state) {
        this.mParentStates.add(state);
    }

    public void handleLifecycleEvent(Lifecycle.Event event) {
        enforceMainThreadIfNeeded("handleLifecycleEvent");
        moveToState(event.getTargetState());
    }

    public void markState(Lifecycle.State state) {
        enforceMainThreadIfNeeded("markState");
        setCurrentState(state);
    }

    @Override // androidx.lifecycle.Lifecycle
    public void removeObserver(LifecycleObserver lifecycleObserver) {
        enforceMainThreadIfNeeded("removeObserver");
        this.mObserverMap.mo557b(lifecycleObserver);
    }

    public void setCurrentState(Lifecycle.State state) {
        enforceMainThreadIfNeeded("setCurrentState");
        moveToState(state);
    }

    private void moveToState(Lifecycle.State state) {
        if (this.mState != state) {
            this.mState = state;
            if (this.mHandlingEvent || this.mAddingObserverCounter != 0) {
                this.mNewEventOccurred = true;
                return;
            }
            this.mHandlingEvent = true;
            sync();
            this.mHandlingEvent = false;
        }
    }

    private Lifecycle.State calculateTargetState(LifecycleObserver lifecycleObserver) {
        Lifecycle.State state;
        Map.Entry<LifecycleObserver, C1119a> d = this.mObserverMap.mo559d(lifecycleObserver);
        Lifecycle.State state2 = null;
        if (d != null) {
            state = d.getValue().f4185a;
        } else {
            state = null;
        }
        if (!this.mParentStates.isEmpty()) {
            ArrayList<Lifecycle.State> arrayList = this.mParentStates;
            state2 = arrayList.get(arrayList.size() - 1);
        }
        return min(min(this.mState, state), state2);
    }

    private void enforceMainThreadIfNeeded(String str) {
        if (this.mEnforceMainThread && !C0179a.m584a().mo550c()) {
            throw new IllegalStateException("Method " + str + " must be called on the main thread");
        }
    }

    private void backwardPass(LifecycleOwner lifecycleOwner) {
        Iterator<Map.Entry<LifecycleObserver, C1119a>> b = this.mObserverMap.mo562b();
        while (b.hasNext() && !this.mNewEventOccurred) {
            Map.Entry<LifecycleObserver, C1119a> next = b.next();
            C1119a value = next.getValue();
            while (value.f4185a.compareTo((Enum) this.mState) > 0 && !this.mNewEventOccurred && this.mObserverMap.mo558c(next.getKey())) {
                Lifecycle.Event downFrom = Lifecycle.Event.downFrom(value.f4185a);
                if (downFrom != null) {
                    pushParentState(downFrom.getTargetState());
                    value.mo5914a(lifecycleOwner, downFrom);
                    popParentState();
                } else {
                    throw new IllegalStateException("no event down from " + value.f4185a);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: androidx.a.a.b.a<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$a> */
    /* JADX WARN: Multi-variable type inference failed */
    private void forwardPass(LifecycleOwner lifecycleOwner) {
        C0186b<K, V>.C0190d c = this.mObserverMap.mo563c();
        while (c.hasNext() && !this.mNewEventOccurred) {
            Map.Entry entry = (Map.Entry) c.next();
            C1119a aVar = (C1119a) entry.getValue();
            while (aVar.f4185a.compareTo((Enum) this.mState) < 0 && !this.mNewEventOccurred && this.mObserverMap.mo558c(entry.getKey())) {
                pushParentState(aVar.f4185a);
                Lifecycle.Event upFrom = Lifecycle.Event.upFrom(aVar.f4185a);
                if (upFrom != null) {
                    aVar.mo5914a(lifecycleOwner, upFrom);
                    popParentState();
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f4185a);
                }
            }
        }
    }

    @Override // androidx.lifecycle.Lifecycle
    public void addObserver(LifecycleObserver lifecycleObserver) {
        Lifecycle.State state;
        LifecycleOwner lifecycleOwner;
        boolean z;
        enforceMainThreadIfNeeded("addObserver");
        if (this.mState == Lifecycle.State.DESTROYED) {
            state = Lifecycle.State.DESTROYED;
        } else {
            state = Lifecycle.State.INITIALIZED;
        }
        C1119a aVar = new C1119a(lifecycleObserver, state);
        if (this.mObserverMap.mo556a(lifecycleObserver, aVar) == null && (lifecycleOwner = this.mLifecycleOwner.get()) != null) {
            if (this.mAddingObserverCounter != 0 || this.mHandlingEvent) {
                z = true;
            } else {
                z = false;
            }
            Lifecycle.State calculateTargetState = calculateTargetState(lifecycleObserver);
            this.mAddingObserverCounter++;
            while (aVar.f4185a.compareTo((Enum) calculateTargetState) < 0 && this.mObserverMap.mo558c(lifecycleObserver)) {
                pushParentState(aVar.f4185a);
                Lifecycle.Event upFrom = Lifecycle.Event.upFrom(aVar.f4185a);
                if (upFrom != null) {
                    aVar.mo5914a(lifecycleOwner, upFrom);
                    popParentState();
                    calculateTargetState = calculateTargetState(lifecycleObserver);
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f4185a);
                }
            }
            if (!z) {
                sync();
            }
            this.mAddingObserverCounter--;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.LifecycleRegistry$a */
    public static class C1119a {

        /* renamed from: a */
        Lifecycle.State f4185a;

        /* renamed from: b */
        AbstractC1168n f4186b;

        C1119a(LifecycleObserver lifecycleObserver, Lifecycle.State state) {
            this.f4186b = C1172r.m5402a(lifecycleObserver);
            this.f4185a = state;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5914a(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            Lifecycle.State targetState = event.getTargetState();
            this.f4185a = LifecycleRegistry.min(this.f4185a, targetState);
            this.f4186b.onStateChanged(lifecycleOwner, event);
            this.f4185a = targetState;
        }
    }

    static Lifecycle.State min(Lifecycle.State state, Lifecycle.State state2) {
        return (state2 == null || state2.compareTo(state) >= 0) ? state : state2;
    }

    private LifecycleRegistry(LifecycleOwner lifecycleOwner, boolean z) {
        this.mObserverMap = new C0185a<>();
        this.mAddingObserverCounter = 0;
        this.mHandlingEvent = false;
        this.mNewEventOccurred = false;
        this.mParentStates = new ArrayList<>();
        this.mLifecycleOwner = new WeakReference<>(lifecycleOwner);
        this.mState = Lifecycle.State.INITIALIZED;
        this.mEnforceMainThread = z;
    }
}
