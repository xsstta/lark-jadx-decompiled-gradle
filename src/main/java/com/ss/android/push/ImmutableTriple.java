package com.ss.android.push;

public final class ImmutableTriple<L, M, R> extends Triple<L, M, R> {
    private static final long serialVersionUID = 1;
    public final L left;
    public final M middle;
    public final R right;

    @Override // com.ss.android.push.Triple
    public L getLeft() {
        return this.left;
    }

    @Override // com.ss.android.push.Triple
    public M getMiddle() {
        return this.middle;
    }

    @Override // com.ss.android.push.Triple
    public R getRight() {
        return this.right;
    }

    public static <L, M, R> ImmutableTriple<L, M, R> of(L l, M m, R r) {
        return new ImmutableTriple<>(l, m, r);
    }

    public ImmutableTriple(L l, M m, R r) {
        this.left = l;
        this.middle = m;
        this.right = r;
    }
}
