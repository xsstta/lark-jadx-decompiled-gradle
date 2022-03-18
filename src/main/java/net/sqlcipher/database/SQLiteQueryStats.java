package net.sqlcipher.database;

public class SQLiteQueryStats {
    long largestIndividualRowSize;
    long totalQueryResultSize;

    public long getLargestIndividualRowSize() {
        return this.largestIndividualRowSize;
    }

    public long getTotalQueryResultSize() {
        return this.totalQueryResultSize;
    }

    public SQLiteQueryStats(long j, long j2) {
        this.totalQueryResultSize = j;
        this.largestIndividualRowSize = j2;
    }
}
