package com.facebook.datasource;

import com.facebook.common.executors.CallerThreadExecutor;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import java.util.List;
import javax.annotation.Nullable;

public class FirstAvailableDataSourceSupplier<T> implements Supplier<DataSource<T>> {
    public final List<Supplier<DataSource<T>>> mDataSourceSuppliers;

    /* access modifiers changed from: private */
    /* renamed from: com.facebook.datasource.FirstAvailableDataSourceSupplier$a */
    public class C21041a extends AbstractDataSource<T> {

        /* renamed from: b */
        private int f51435b;

        /* renamed from: c */
        private DataSource<T> f51436c;

        /* renamed from: d */
        private DataSource<T> f51437d;

        @Nullable
        /* renamed from: c */
        private synchronized DataSource<T> m76660c() {
            return this.f51437d;
        }

        @Override // com.facebook.datasource.DataSource, com.facebook.datasource.AbstractDataSource
        public boolean close() {
            synchronized (this) {
                if (!super.close()) {
                    return false;
                }
                DataSource<T> dataSource = this.f51436c;
                this.f51436c = null;
                DataSource<T> dataSource2 = this.f51437d;
                this.f51437d = null;
                m76663e(dataSource2);
                m76663e(dataSource);
                return true;
            }
        }

        @Override // com.facebook.datasource.DataSource, com.facebook.datasource.AbstractDataSource
        @Nullable
        public synchronized T getResult() {
            T t;
            DataSource<T> c = m76660c();
            if (c != null) {
                t = c.getResult();
            } else {
                t = null;
            }
            return t;
        }

        @Override // com.facebook.datasource.DataSource, com.facebook.datasource.AbstractDataSource
        public synchronized boolean hasResult() {
            boolean z;
            DataSource<T> c = m76660c();
            if (c == null || !c.hasResult()) {
                z = false;
            } else {
                z = true;
            }
            return z;
        }

        /* renamed from: a */
        private boolean m76658a() {
            DataSource<T> dataSource;
            Supplier<DataSource<T>> b = m76659b();
            if (b != null) {
                dataSource = b.get();
            } else {
                dataSource = null;
            }
            if (!m76661c(dataSource) || dataSource == null) {
                m76663e(dataSource);
                return false;
            }
            dataSource.subscribe(new C21042a(), CallerThreadExecutor.getInstance());
            return true;
        }

        @Nullable
        /* renamed from: b */
        private synchronized Supplier<DataSource<T>> m76659b() {
            if (isClosed() || this.f51435b >= FirstAvailableDataSourceSupplier.this.mDataSourceSuppliers.size()) {
                return null;
            }
            List<Supplier<DataSource<T>>> list = FirstAvailableDataSourceSupplier.this.mDataSourceSuppliers;
            int i = this.f51435b;
            this.f51435b = i + 1;
            return list.get(i);
        }

        /* access modifiers changed from: private */
        /* renamed from: com.facebook.datasource.FirstAvailableDataSourceSupplier$a$a */
        public class C21042a implements DataSubscriber<T> {
            @Override // com.facebook.datasource.DataSubscriber
            public void onCancellation(DataSource<T> dataSource) {
            }

            private C21042a() {
            }

            @Override // com.facebook.datasource.DataSubscriber
            public void onFailure(DataSource<T> dataSource) {
                C21041a.this.mo71382a(dataSource);
            }

            @Override // com.facebook.datasource.DataSubscriber
            public void onNewResult(DataSource<T> dataSource) {
                if (dataSource.hasResult()) {
                    C21041a.this.mo71383b(dataSource);
                } else if (dataSource.isFinished()) {
                    C21041a.this.mo71382a(dataSource);
                }
            }

            @Override // com.facebook.datasource.DataSubscriber
            public void onProgressUpdate(DataSource<T> dataSource) {
                C21041a.this.setProgress(Math.max(C21041a.this.getProgress(), dataSource.getProgress()));
            }
        }

        /* renamed from: e */
        private void m76663e(DataSource<T> dataSource) {
            if (dataSource != null) {
                dataSource.close();
            }
        }

        public C21041a() {
            if (!m76658a()) {
                setFailure(new RuntimeException("No data source supplier or supplier returned null."));
            }
        }

        /* renamed from: c */
        private synchronized boolean m76661c(DataSource<T> dataSource) {
            if (isClosed()) {
                return false;
            }
            this.f51436c = dataSource;
            return true;
        }

        /* renamed from: d */
        private synchronized boolean m76662d(DataSource<T> dataSource) {
            if (!isClosed()) {
                if (dataSource == this.f51436c) {
                    this.f51436c = null;
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public void mo71383b(DataSource<T> dataSource) {
            m76657a(dataSource, dataSource.isFinished());
            if (dataSource == m76660c()) {
                setResult(null, dataSource.isFinished());
            }
        }

        /* renamed from: a */
        public void mo71382a(DataSource<T> dataSource) {
            if (m76662d(dataSource)) {
                if (dataSource != m76660c()) {
                    m76663e(dataSource);
                }
                if (!m76658a()) {
                    setFailure(dataSource.getFailureCause());
                }
            }
        }

        /* renamed from: a */
        private void m76657a(DataSource<T> dataSource, boolean z) {
            synchronized (this) {
                if (dataSource == this.f51436c) {
                    DataSource<T> dataSource2 = this.f51437d;
                    if (dataSource != dataSource2) {
                        if (dataSource2 != null) {
                            if (!z) {
                                dataSource2 = null;
                                m76663e(dataSource2);
                            }
                        }
                        this.f51437d = dataSource;
                        m76663e(dataSource2);
                    }
                }
            }
        }
    }

    @Override // com.facebook.common.internal.Supplier
    public DataSource<T> get() {
        return new C21041a();
    }

    public int hashCode() {
        return this.mDataSourceSuppliers.hashCode();
    }

    public String toString() {
        return Objects.toStringHelper(this).add("list", this.mDataSourceSuppliers).toString();
    }

    public static <T> FirstAvailableDataSourceSupplier<T> create(List<Supplier<DataSource<T>>> list) {
        return new FirstAvailableDataSourceSupplier<>(list);
    }

    private FirstAvailableDataSourceSupplier(List<Supplier<DataSource<T>>> list) {
        Preconditions.checkArgument(!list.isEmpty(), "List of suppliers is empty!");
        this.mDataSourceSuppliers = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirstAvailableDataSourceSupplier)) {
            return false;
        }
        return Objects.equal(this.mDataSourceSuppliers, ((FirstAvailableDataSourceSupplier) obj).mDataSourceSuppliers);
    }
}
