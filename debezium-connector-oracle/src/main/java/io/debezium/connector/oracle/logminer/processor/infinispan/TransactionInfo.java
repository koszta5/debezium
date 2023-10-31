package io.debezium.connector.oracle.logminer.processor.infinispan;

import java.time.LocalDateTime;

public class TransactionInfo {

    private String scn;
    private LocalDateTime ts;

    public TransactionInfo(String scn) {
        this(scn, LocalDateTime.now());
    }

    public TransactionInfo(String scn, LocalDateTime ts) {
        this.scn = scn;
        this.ts = ts;
    }

    public String getScn() {
        return scn;
    }

    public LocalDateTime getTs() {
        return ts;
    }
}
