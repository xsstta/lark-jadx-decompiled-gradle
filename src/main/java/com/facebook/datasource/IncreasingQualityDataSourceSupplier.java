package com.facebook.datasource;

import com.facebook.common.executors.CallerThreadExecutor;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;

public class IncreasingQualityDataSourceSupplier<T> implements Supplier<DataSource<T>> {
    public final boolean mDataSourceLazy;
    public final List<Supplier<DataSource<T>>> mDataSourceSuppliers;

    @Override // com.facebook.common.internal.Supplier
    public DataSource<T> get() {
        return new C21043a();
    }

    public int hashCode() {
        return this.mDataSourceSuppliers.hashCode();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.facebook.datasource.IncreasingQualityDataSourceSupplier$a */
    public class C21043a extends AbstractDataSource<T> {
        @Nullable

        /* renamed from: b */
        private ArrayList<DataSource<T>> f51440b;

        /* renamed from: c */
        private int f51441c;

        /* renamed from: d */
        private int f51442d;

        /* renamed from: e */
        private AtomicInteger f51443e;
        @Nullable

        /* renamed from: f */
        private Throwable f51444f;

        @Nullable
        /* renamed from: b */
        private synchronized DataSource<T> m76670b() {
            return m76666a(this.f51441c);
        }

        @Override // com.facebook.datasource.DataSource, com.facebook.datasource.AbstractDataSource
        @Nullable
        public synchronized T getResult() {
            T t;
            if (IncreasingQualityDataSourceSupplier.this.mDataSourceLazy) {
                m76667a();
            }
            DataSource<T> b = m76670b();
            if (b != null) {
                t = b.getResult();
            } else {
                t = null;
            }
            return t;
        }

        @Override // com.facebook.datasource.DataSource, com.facebook.datasource.AbstractDataSource
        public synchronized boolean hasResult() {
            boolean z;
            if (IncreasingQualityDataSourceSupplier.this.mDataSourceLazy) {
                m76667a();
            }
            DataSource<T> b = m76670b();
            if (b == null || !b.hasResult()) {
                z = false;
            } else {
                z = true;
            }
            return z;
        }

        /* renamed from: c */
        private void m76673c() {
            Throwable th;
            if (this.f51443e.incrementAndGet() == this.f51442d && (th = this.f51444f) != null) {
                setFailure(th);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
            if (r0 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
            if (r1 >= r0.size()) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
            m76669a(r0.get(r1));
            r1 = r1 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            return true;
         */
        @Override // com.facebook.datasource.DataSource, com.facebook.datasource.AbstractDataSource
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean close() {
            /*
                r3 = this;
                com.facebook.datasource.IncreasingQualityDataSourceSupplier r0 = com.facebook.datasource.IncreasingQualityDataSourceSupplier.this
                boolean r0 = r0.mDataSourceLazy
                if (r0 == 0) goto L_0x0009
                r3.m76667a()
            L_0x0009:
                monitor-enter(r3)
                boolean r0 = super.close()     // Catch:{ all -> 0x002f }
                r1 = 0
                if (r0 != 0) goto L_0x0013
                monitor-exit(r3)     // Catch:{ all -> 0x002f }
                return r1
            L_0x0013:
                java.util.ArrayList<com.facebook.datasource.DataSource<T>> r0 = r3.f51440b     // Catch:{ all -> 0x002f }
                r2 = 0
                r3.f51440b = r2     // Catch:{ all -> 0x002f }
                monitor-exit(r3)     // Catch:{ all -> 0x002f }
                if (r0 == 0) goto L_0x002d
            L_0x001b:
                int r2 = r0.size()
                if (r1 >= r2) goto L_0x002d
                java.lang.Object r2 = r0.get(r1)
                com.facebook.datasource.DataSource r2 = (com.facebook.datasource.DataSource) r2
                r3.m76669a(r2)
                int r1 = r1 + 1
                goto L_0x001b
            L_0x002d:
                r0 = 1
                return r0
            L_0x002f:
                r0 = move-exception
                monitor-exit(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.IncreasingQualityDataSourceSupplier.C21043a.close():boolean");
        }

        /* renamed from: a */
        private void m76667a() {
            if (this.f51443e == null) {
                synchronized (this) {
                    if (this.f51443e == null) {
                        int i = 0;
                        this.f51443e = new AtomicInteger(0);
                        int size = IncreasingQualityDataSourceSupplier.this.mDataSourceSuppliers.size();
                        this.f51442d = size;
                        this.f51441c = size;
                        this.f51440b = new ArrayList<>(size);
                        while (true) {
                            if (i >= size) {
                                break;
                            }
                            DataSource<T> dataSource = IncreasingQualityDataSourceSupplier.this.mDataSourceSuppliers.get(i).get();
                            this.f51440b.add(dataSource);
                            dataSource.subscribe(new C21044a(i), CallerThreadExecutor.getInstance());
                            if (dataSource.hasResult()) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: com.facebook.datasource.IncreasingQualityDataSourceSupplier$a$a */
        public class C21044a implements DataSubscriber<T> {

            /* renamed from: b */
            private int f51446b;

            @Override // com.facebook.datasource.DataSubscriber
            public void onCancellation(DataSource<T> dataSource) {
            }

            @Override // com.facebook.datasource.DataSubscriber
            public void onFailure(DataSource<T> dataSource) {
                C21043a.this.mo71388b(this.f51446b, dataSource);
            }

            @Override // com.facebook.datasource.DataSubscriber
            public void onProgressUpdate(DataSource<T> dataSource) {
                if (this.f51446b == 0) {
                    C21043a.this.setProgress(dataSource.getProgress());
                }
            }

            @Override // com.facebook.datasource.DataSubscriber
            public void onNewResult(DataSource<T> dataSource) {
                if (dataSource.hasResult()) {
                    C21043a.this.mo71387a(this.f51446b, dataSource);
                } else if (dataSource.isFinished()) {
                    C21043a.this.mo71388b(this.f51446b, dataSource);
                }
            }

            public C21044a(int i) {
                this.f51446b = i;
            }
        }

        /* renamed from: a */
        private void m76669a(DataSource<T> dataSource) {
            if (dataSource != null) {
                dataSource.close();
            }
        }

        public C21043a() {
            if (!IncreasingQualityDataSourceSupplier.this.mDataSourceLazy) {
                m76667a();
            }
        }

        @Nullable
        /* renamed from: a */
        private synchronized DataSource<T> m76666a(int i) {
            DataSource<T> dataSource;
            ArrayList<DataSource<T>> arrayList = this.f51440b;
            if (arrayList == null || i >= arrayList.size()) {
                dataSource = null;
            } else {
                dataSource = this.f51440b.get(i);
            }
            return dataSource;
        }

        @Nullable
        /* renamed from: b */
        private synchronized DataSource<T> m76671b(int i) {
            DataSource<T> dataSource;
            ArrayList<DataSource<T>> arrayList = this.f51440b;
            dataSource = null;
            if (arrayList != null && i < arrayList.size()) {
                dataSource = this.f51440b.set(i, null);
            }
            return dataSource;
        }

        @Nullable
        /* renamed from: c */
        private synchronized DataSource<T> m76672c(int i, DataSource<T> dataSource) {
            if (dataSource == m76670b()) {
                return null;
            }
            if (dataSource != m76666a(i)) {
                return dataSource;
            }
            return m76671b(i);
        }

        /* renamed from: b */
        public void mo71388b(int i, DataSource<T> dataSource) {
            m76669a(m76672c(i, dataSource));
            if (i == 0) {
                this.f51444f = dataSource.getFailureCause();
            }
            m76673c();
        }

        /* renamed from: a */
        public void mo71387a(int i, DataSource<T> dataSource) {
            boolean z;
            m76668a(i, dataSource, dataSource.isFinished());
            if (dataSource == m76670b()) {
                if (i != 0 || !dataSource.isFinished()) {
                    z = false;
                } else {
                    z = true;
                }
                setResult(null, z);
            }
            m76673c();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
            if (r0 <= r3) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
            m76669a(m76671b(r0));
            r0 = r0 - 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m76668a(int r3, com.facebook.datasource.DataSource<T> r4, boolean r5) {
            /*
                r2 = this;
                monitor-enter(r2)
                int r0 = r2.f51441c     // Catch:{ all -> 0x002f }
                com.facebook.datasource.DataSource r1 = r2.m76666a(r3)     // Catch:{ all -> 0x002f }
                if (r4 != r1) goto L_0x002d
                int r4 = r2.f51441c     // Catch:{ all -> 0x002f }
                if (r3 != r4) goto L_0x000e
                goto L_0x002d
            L_0x000e:
                com.facebook.datasource.DataSource r4 = r2.m76670b()     // Catch:{ all -> 0x002f }
                if (r4 == 0) goto L_0x001d
                if (r5 == 0) goto L_0x001b
                int r4 = r2.f51441c     // Catch:{ all -> 0x002f }
                if (r3 >= r4) goto L_0x001b
                goto L_0x001d
            L_0x001b:
                r3 = r0
                goto L_0x001f
            L_0x001d:
                r2.f51441c = r3     // Catch:{ all -> 0x002f }
            L_0x001f:
                monitor-exit(r2)     // Catch:{ all -> 0x002f }
            L_0x0020:
                if (r0 <= r3) goto L_0x002c
                com.facebook.datasource.DataSource r4 = r2.m76671b(r0)
                r2.m76669a(r4)
                int r0 = r0 + -1
                goto L_0x0020
            L_0x002c:
                return
            L_0x002d:
                monitor-exit(r2)
                return
            L_0x002f:
                r3 = move-exception
                monitor-exit(r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.IncreasingQualityDataSourceSupplier.C21043a.m76668a(int, com.facebook.datasource.DataSource, boolean):void");
        }
    }

    public String toString() {
        return Objects.toStringHelper(this).add("list", this.mDataSourceSuppliers).toString();
    }

    public static <T> IncreasingQualityDataSourceSupplier<T> create(List<Supplier<DataSource<T>>> list) {
        return create(list, false);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IncreasingQualityDataSourceSupplier)) {
            return false;
        }
        return Objects.equal(this.mDataSourceSuppliers, ((IncreasingQualityDataSourceSupplier) obj).mDataSourceSuppliers);
    }

    public static <T> IncreasingQualityDataSourceSupplier<T> create(List<Supplier<DataSource<T>>> list, boolean z) {
        return new IncreasingQualityDataSourceSupplier<>(list, z);
    }

    private IncreasingQualityDataSourceSupplier(List<Supplier<DataSource<T>>> list, boolean z) {
        Preconditions.checkArgument(!list.isEmpty(), "List of suppliers is empty!");
        this.mDataSourceSuppliers = list;
        this.mDataSourceLazy = z;
    }
}
