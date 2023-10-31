package io.debezium.connector.oracle.logminer.processor.infinispan;

import java.time.Instant;

public class TransactionInfo {

    private String scn;
    private Instant ts;

    public TransactionInfo(String scn) {
        this(scn, Instant.now());
    }

    public TransactionInfo(String scn, Instant ts) {
        this.scn = scn;
        this.ts = ts;
    }

    public String getScn() {
        return scn;
    }

    public Instant getTs() {
        return ts;
    }
}
